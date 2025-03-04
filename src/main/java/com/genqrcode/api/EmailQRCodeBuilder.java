package com.genqrcode.api;

import com.genqrcode.data.EmailQRCodeData;

/**
 * The {@code EmailQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building email based QR codes.
 */
public class EmailQRCodeBuilder extends QRCodeImpl<EmailQRCodeBuilder, EmailQRCodeData> {

    /**
     * Constructs a {@code EmailQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    EmailQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
