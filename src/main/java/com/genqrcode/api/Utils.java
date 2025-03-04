package com.genqrcode.api;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Utils {

    private Utils() {}

    public static byte[] readAllBytes(final InputStream inputStream) throws IOException {
        final int bufferSize = 2048;
        byte[] buf = new byte[bufferSize];
        int bytesRead;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        while ((bytesRead = inputStream.read(buf, 0, bufferSize)) != -1) {
            outputStream.write(buf, 0, bytesRead);
        }
        return outputStream.toByteArray();
    }
}
