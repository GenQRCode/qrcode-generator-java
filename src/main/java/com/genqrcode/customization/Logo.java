package com.genqrcode.customization;

import com.genqrcode.api.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Class containing a logo argument for a QR Code.
 */
public class Logo {

    private final byte[] logoBytes;
    private final String contentType;
    private final String fileName;
    private final String hash;
    private boolean removeBackground;


    /**
     * Creates a new logo with the given path.
     *
     * @param path the path of the logo
     * @throws IOException If the file is invalid
     */
    public static Logo from(File path) throws IOException {
        return new Logo(path);
    }

    /**
     * Creates a new logo with the given path.
     *
     * @param path the path of the logo
     * @throws IOException If the file is invalid
     */
    public Logo(File path) throws IOException {
        if (!path.isFile() || !path.canRead()) {
            throw new IllegalArgumentException("Invalid file");
        }
        try (FileInputStream fis = new FileInputStream(path)) {
            this.logoBytes = Utils.readAllBytes(fis);
        }
        this.contentType = Files.probeContentType(path.toPath());
        this.fileName = path.getName();
        this.hash = getHash(logoBytes);
    }

    /**
     * If the background behind the logo should be removed.
     *
     * @return the current {@code Logo} instance.
     */
    public Logo removeBackground() {
        this.removeBackground = true;
        return this;
    }

    /**
     * Gets the raw bytes of the logo.
     *
     * @return the logo bytes
     */
    public byte[] getLogoBytes() {
        return logoBytes;
    }

    /**
     * Gets the content type of the logo.
     *
     * @return the content type
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Gets the file name of the logo.
     *
     * @return the logo's file name
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Gets the SHA-256 hex encoded checksum of the logo.
     *
     * @return the SHA-256 hex encoded checksum
     */
    public String getHash() {
        return hash;
    }

    /**
     * Whether the background behind the logo should be removed.
     *
     * @return true if the background behind the logo should be removed
     */
    public boolean isBackgroundRemoved() {
       return removeBackground;
    }

    private String getHash(byte[] bytes) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(bytes);

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            // This exception should never occur for SHA-256
            throw new RuntimeException("SHA-256 algorithm not available", e);
        }
    }
}
