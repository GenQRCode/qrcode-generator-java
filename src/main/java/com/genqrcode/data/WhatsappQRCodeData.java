package com.genqrcode.data;

/**
 * The {@code WhatsappQRCodeData} class represents the data model for a QR code that encodes whatsapp data.
 */
public class WhatsappQRCodeData extends QRCodeData {

    private String number;
    private String message;

    /**
     * Constructs a {@code WhatsappQRCodeData} instance.
     */
    public WhatsappQRCodeData() {
        super(7);
    }

    /**
     * Sets the number content for the QR code.
     *
     * @param number the number to be encoded in the QR code.
     * @return the current {@code WhatsappQRCodeData} instance.
     */
    public WhatsappQRCodeData number(final String number) {
        this.number = number;
        return this;
    }

    /**
     * Sets the message content for the QR code.
     *
     * @param message the message to be encoded in the QR code.
     * @return the current {@code WhatsappQRCodeData} instance.
     */
    public WhatsappQRCodeData message(final String message) {
        this.message = message;
        return this;
    }
}
