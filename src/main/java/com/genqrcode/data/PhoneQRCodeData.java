package com.genqrcode.data;

/**
 * The {@code PhoneQRCodeData} class represents the data model for a QR code that encodes phone number data.
 */
public class PhoneQRCodeData extends QRCodeData {

    private String phoneNumber;

    /**
     * Constructs a {@code PhoneQRCodeData} instance.
     */
    public PhoneQRCodeData() {
        super(4);
    }

    /**
     * Creates a new {@code PhoneQRCodeData} instance with the specified phone number.
     *
     * @param phoneNumber the phone number to be encoded in the QR code.
     * @return a new {@code PhoneQRCodeData} instance with the specified phone number.
     */
    public static PhoneQRCodeData withPhoneNumber(final String phoneNumber) {
        return new PhoneQRCodeData().phoneNumber(phoneNumber);
    }

    /**
     * Sets the phone number content for the QR code.
     *
     * @param phoneNumber the phone number to be encoded in the QR code.
     * @return the current {@code PhoneQRCodeData} instance.
     */
    public PhoneQRCodeData phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
