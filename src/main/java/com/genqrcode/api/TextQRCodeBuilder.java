package com.genqrcode.api;

import com.genqrcode.data.TextQRCodeData;

/**
 * The {@code TextQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building text-based QR codes.
 */
public class TextQRCodeBuilder extends QRCodeImpl<TextQRCodeBuilder, TextQRCodeData> {

    /**
     * Constructs a {@code TextQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    TextQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
