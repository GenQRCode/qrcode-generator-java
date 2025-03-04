package com.genqrcode.api;

import com.genqrcode.data.WhatsappQRCodeData;

/**
 * The {@code FastWhatsappQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building whatsapp based QR codes.
 */
public class FastWhatsappQRCodeBuilder extends FastQRCodeImpl<FastWhatsappQRCodeBuilder, WhatsappQRCodeData> {

    /**
     * Constructs a {@code FastWhatsappQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastWhatsappQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
