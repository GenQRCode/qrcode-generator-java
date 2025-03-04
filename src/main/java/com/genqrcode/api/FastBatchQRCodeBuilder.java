package com.genqrcode.api;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Future;

/**
 * The {@code FastBatchQRCodeBuilder} class provides methods specific to building very fast QR Codes.
 * The QR Codes are optimised for speed and size.
 * This class does not support customization other than width, height and border size.
 */
public class FastBatchQRCodeBuilder {

    private final GenQRCodeAdapter adapter;

    private final Map<String, FastQRParameters> batchRequest = new HashMap<>();

    /**
     * Constructs a {@code FastBatchQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastBatchQRCodeBuilder(final GenQRCodeAdapter adapter) {
        this.adapter = adapter;
    }

    /**
     * Adds the {@code FastQRParameters} to the batch request.
     * @param name The QR Code name
     * @param data The QR Code data to add.
     * @return the current builder instance.
     */
    public FastBatchQRCodeBuilder addQRCode(String name, FastQRParameters data) {
        batchRequest.put(name, data);
        return this;
    }

    /**
     * Gets the QR Codes as a key value map.
     *
     * @return a Map containing all the QR Codes mapped by their name
     */
    public Future<Map<String, byte[]>> build() {
        return adapter.exchange(batchRequest);
    }

    /**
     * Gets the QR Codes as a .zip file.
     *
     * @return Zip file containing all the QR Codes mapped by their name
     */
    public Future<byte[]> buildAsZip() {
        return adapter.exchangeToZip(batchRequest);
    }
}
