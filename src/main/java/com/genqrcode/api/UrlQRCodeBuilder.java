package com.genqrcode.api;

import com.genqrcode.data.UrlQRCodeData;

/**
 * The {@code UrlQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building URL-based QR codes.
 */
public class UrlQRCodeBuilder extends QRCodeImpl<UrlQRCodeBuilder, UrlQRCodeData> {

    /**
     * Constructs a {@code UrlQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    UrlQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
