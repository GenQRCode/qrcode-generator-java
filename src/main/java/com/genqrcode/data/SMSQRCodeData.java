package com.genqrcode.data;

/**
 * The {@code SMSQRCodeData} class represents the data model for a QR code that encodes SMS data.
 */
public class SMSQRCodeData extends QRCodeData {
    private String number;
    private String text;

    /**
     * Constructs a {@code SMSQRCodeData} instance.
     */
    public SMSQRCodeData() {
        super(2);
    }

    /**
     * Sets the phone number content for the QR code.
     *
     * @param number the phone number to be encoded in the QR code.
     * @return the current {@code SMSQRCodeData} instance.
     */
    public SMSQRCodeData number(final String number) {
        this.number = number;
        return this;
    }

    /**
     * Sets the text message content for the QR code.
     *
     * @param text the text message to be encoded in the QR code.
     * @return the current {@code SMSQRCodeData} instance.
     */
    public SMSQRCodeData text(final String text) {
        this.text = text;
        return this;
    }
}
