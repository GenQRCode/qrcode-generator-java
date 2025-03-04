package com.genqrcode.api;

import com.genqrcode.customization.Logo;
import com.genqrcode.exceptions.RateLimitedException;
import com.genqrcode.exceptions.UnexpectedException;
import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

class GenQRCodeAdapter {
    private static final String API_KEY_HEADER = "GenQRCode-apikey";
    private static final String GENERATE_ENDPOINT = "http://localhost:8888/api/public/generate";
    private static final String FAST_ENDPOINT = "http://localhost:8888/api/public/fastgenerate";
    private static final String FAST_BATCH_ENDPOINT = "http://localhost:8888/api/public/fastbatch";
    private static final String LOGO_UPLOAD_ENDPOINT = "http://localhost:8888/api/public/upload/logo";

    private static final String LINE_FEED = "\r\n";

    private final String apiKey;
    private final ExecutorService executor;

    private final ConcurrentHashMap<String, String> logoMap = new ConcurrentHashMap<>();

    GenQRCodeAdapter(final String apiKey) {
        this(apiKey, 2);
    }

    GenQRCodeAdapter(final String apiKey, int threadPoolSize) {
        this.apiKey = apiKey;
        this.executor = Executors.newFixedThreadPool(threadPoolSize);
    }

    void shutdown() {
        executor.shutdown();
    }

    Future<byte[]> exchangeToZip(final Map<String, FastQRParameters> parameters) {
        CompletableFuture<byte[]> result = new CompletableFuture<>();
        executor.submit(() -> {
            String jsonBody = new Gson().toJson(parameters);
            try {
                HttpURLConnection connection = getPostHttpURLConnection(FAST_BATCH_ENDPOINT, "application/zip");
                try (OutputStream os = connection.getOutputStream();
                     OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
                    osw.write(jsonBody);
                    osw.flush();
                }
                if (connection.getResponseCode() >= 200 && connection.getResponseCode() <= 299) {
                    result.complete(Utils.readAllBytes(connection.getInputStream()));
                } else if (connection.getResponseCode() == 419) {
                    result.completeExceptionally(new RateLimitedException());
                } else {
                    result.completeExceptionally(new UnexpectedException("Failed to upload logo"));
                }
            } catch (IOException e) {
                result.completeExceptionally(e);
            }
        });
        return result;
    }

    Future<Map<String, byte[]>> exchange(final Map<String, FastQRParameters> parameters) {
        CompletableFuture<Map<String, byte[]>> result = new CompletableFuture<>();
        executor.submit(() -> {
            try {
                byte[] zip = exchangeToZip(parameters).get();
                result.complete(batchFromZip(zip));
            } catch (Exception e) {
                result.completeExceptionally(e);
            }
        });
        return result;
    }

    Future<byte[]> exchange(final QRParameters parameters, Logo logo) {
        CompletableFuture<byte[]> result = new CompletableFuture<>();
        executor.submit(() -> {
            try {
                parameters.setLogo(logo, getLogoKey(logo));
                String jsonBody = new Gson().toJson(parameters);
                HttpURLConnection connection = getPostHttpURLConnection(GENERATE_ENDPOINT, "*/*");

                try (OutputStream os = connection.getOutputStream();
                     OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
                    osw.write(jsonBody);
                    osw.flush();
                }

                if (connection.getResponseCode() >= 200 && connection.getResponseCode() <= 299) {
                    result.complete(Utils.readAllBytes(connection.getInputStream()));
                } else if (connection.getResponseCode() == 419) {
                    result.completeExceptionally(new RateLimitedException());
                } else {
                    result.completeExceptionally(new UnexpectedException("Failed to upload logo"));
                }
            } catch (IOException e) {
                result.completeExceptionally(e);
            }
        });
        return result;
    }

    Future<byte[]> exchange(final FastQRParameters parameters) {
        CompletableFuture<byte[]> result = new CompletableFuture<>();
        executor.submit(() -> {
            String jsonBody = new Gson().toJson(parameters);
            try {
                HttpURLConnection connection = getPostHttpURLConnection(FAST_ENDPOINT, "*/*");

                try (OutputStream os = connection.getOutputStream();
                     OutputStreamWriter osw = new OutputStreamWriter(os, StandardCharsets.UTF_8)) {
                    osw.write(jsonBody);
                    osw.flush();
                }
                if (connection.getResponseCode() >= 200 && connection.getResponseCode() <= 299) {
                    result.complete(Utils.readAllBytes(connection.getInputStream()));
                } else if (connection.getResponseCode() == 419) {
                    result.completeExceptionally(new RateLimitedException());
                } else {
                    result.completeExceptionally(new UnexpectedException("Failed to upload logo"));
                }
            } catch (IOException e) {
                result.completeExceptionally(e);
            }
        });
        return result;
    }

    private String getLogoKey(final Logo logo) throws IOException, RateLimitedException {
        if (null == logo) {
            return null;
        }
        String cachedLogo = logoMap.getOrDefault(logo.getHash(), null);
        if (cachedLogo != null) {
            return cachedLogo;
        }

        String boundary = "----Boundary" + UUID.randomUUID();

        HttpURLConnection connection = (HttpURLConnection) new URL(LOGO_UPLOAD_ENDPOINT).openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);
        connection.setRequestProperty("Accepts", "text/plain");
        connection.setRequestProperty(API_KEY_HEADER, apiKey);
        connection.setDoOutput(true);

        try (OutputStream outputStream = connection.getOutputStream();
             PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8), true)) {

            // Add the file part
            writer.append("--").append(boundary).append(LINE_FEED);
            writer.append("Content-Disposition: form-data; name=\"file\"; filename=\"" + logo.getFileName() + "\"").append(LINE_FEED);
            writer.append("Content-Type: " + logo.getContentType()).append(LINE_FEED); // Specify content type
            writer.append(LINE_FEED);
            writer.flush();

            outputStream.write(logo.getLogoBytes());
            outputStream.flush();

            writer.append(LINE_FEED);
            writer.flush();

            // End the multipart request
            writer.append("--").append(boundary).append("--").append(LINE_FEED);
            writer.flush();
        }

        int responseCode = connection.getResponseCode();
        if (connection.getResponseCode() >= 200 && connection.getResponseCode() <= 299) {
            String logoKey = new String(Utils.readAllBytes(connection.getInputStream()));
            logoMap.put(logo.getHash(), logoKey);
            return logoKey;
        } else if (responseCode == 419) {
            throw new RateLimitedException();
        } else {
            throw new UnexpectedException("Failed to upload logo");
        }
    }

    private HttpURLConnection getPostHttpURLConnection(final String endpoint, final String acceptsHeader) throws IOException {
        URL url = new URL(endpoint);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty(API_KEY_HEADER, apiKey);
        connection.setRequestProperty("User-Agent", "Java-GenQRCode-Client");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Accepts", acceptsHeader);
        connection.setDoOutput(true);
        return connection;
    }

    private static Map<String, byte[]> batchFromZip(byte[] data) throws IOException {
        Map<String, byte[]> resultMap = new HashMap<>();
        try (ZipInputStream zis = new ZipInputStream(new ByteArrayInputStream(data))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                int endIndex = entry.getName().lastIndexOf('.');
                if (endIndex == -1) {
                    endIndex = entry.getName().length() - 1;
                }
                resultMap.put(entry.getName().substring(0, endIndex), Utils.readAllBytes(zis));
                zis.closeEntry();
            }
        }
        return resultMap;
    }
}
