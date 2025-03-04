package com.genqrcode.api;

import com.genqrcode.data.WhatsappQRCodeData;

/**
 * The {@code WhatsappQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building whatsapp based QR codes.
 */
public class WhatsappQRCodeBuilder extends QRCodeImpl<WhatsappQRCodeBuilder, WhatsappQRCodeData> {

    /**
     * Constructs a {@code WhatsappQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    WhatsappQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
