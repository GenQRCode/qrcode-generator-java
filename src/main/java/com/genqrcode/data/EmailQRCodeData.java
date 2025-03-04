package com.genqrcode.data;

/**
 * The {@code EmailQRCodeData} class represents the data model for a QR code that encodes Email data.
 */
public class EmailQRCodeData extends QRCodeData {

    private String emailAddress;
    private String subject;
    private String message;

    /**
     * Constructs a {@code EmailQRCodeData} instance.
     */
    public EmailQRCodeData() {
        super(3);
    }

    /**
     * Sets the email address content for the QR code.
     *
     * @param emailAddress the email address to be encoded in the QR code.
     * @return the current {@code EmailQRCodeData} instance.
     */
    public EmailQRCodeData emailAddress(final String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * Sets the subject content for the QR code.
     *
     * @param subject the subject to be encoded in the QR code.
     * @return the current {@code EmailQRCodeData} instance.
     */
    public EmailQRCodeData subject(final String subject) {
        this.subject = subject;
        return this;
    }

    /**
     * Sets the message content for the QR code.
     *
     * @param message the message to be encoded in the QR code.
     * @return the current {@code EmailQRCodeData} instance.
     */
    public EmailQRCodeData message(final String message) {
        this.message = message;
        return this;
    }
}
