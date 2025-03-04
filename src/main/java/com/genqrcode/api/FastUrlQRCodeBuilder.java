package com.genqrcode.api;

import com.genqrcode.data.UrlQRCodeData;

/**
 * The {@code FastUrlQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building URL-based QR codes.
 */
public class FastUrlQRCodeBuilder extends FastQRCodeImpl<FastUrlQRCodeBuilder, UrlQRCodeData> {

    /**
     * Constructs a {@code FastUrlQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastUrlQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
