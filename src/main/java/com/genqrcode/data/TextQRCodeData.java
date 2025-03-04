package com.genqrcode.data;

/**
 * The {@code TextQRCodeData} class represents the data model for a QR code that encodes text.
 */
public class TextQRCodeData extends QRCodeData {

    private String text;

    /**
     * Constructs a {@code TextQRCodeData} instance.
     */
    public TextQRCodeData() {
        super(0);
    }

    /**
     * Creates a new {@code TextQRCodeData} instance with the specified text content.
     *
     * @param text the text to be encoded in the QR code.
     * @return a new {@code TextQRCodeData} instance with the specified text.
     */
    public static TextQRCodeData withText(final String text) {
        return new TextQRCodeData().text(text);
    }

    /**
     * Sets the text content for the QR code.
     *
     * @param text the text to be encoded in the QR code.
     * @return the current {@code TextQRCodeData} instance.
     */
    public TextQRCodeData text(final String text) {
        this.text = text;
        return this;
    }
}
