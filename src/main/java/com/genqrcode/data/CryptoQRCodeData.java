package com.genqrcode.data;

/**
 * The {@code CryptoQRCodeData} class represents the data model for a QR code that encodes crypto data.
 */
public class CryptoQRCodeData extends QRCodeData {
    private String cryptoType;
    private String address;
    private String amount;

    /**
     * Constructs a {@code CryptoQRCodeData} instance.
     */
    public CryptoQRCodeData() {
        super(5);
    }

    /**
     * Sets the crypto type content for the QR code.
     *
     * @param cryptoType the {@code CryptoType} to be encoded in the QR code.
     * @return the current {@code CryptoQRCodeData} instance.
     */
    public CryptoQRCodeData cryptoType(final CryptoType cryptoType) {
        this.cryptoType = cryptoType.getCryptoName();
        return this;
    }

    /**
     * Sets the crypto type content for the QR code.
     *
     * @param cryptoType the crypto type to be encoded in the QR code.
     * @return the current {@code CryptoQRCodeData} instance.
     */
    public CryptoQRCodeData cryptoType(final String cryptoType) {
        this.cryptoType = cryptoType;
        return this;
    }

    /**
     * Sets the address content for the QR code.
     *
     * @param address the address to be encoded in the QR code.
     * @return the current {@code CryptoQRCodeData} instance.
     */
    public CryptoQRCodeData address(final String address) {
        this.address = address;
        return this;
    }

    /**
     * Sets the amount content for the QR code.
     *
     * @param amount the amount to be encoded in the QR code.
     * @return the current {@code CryptoQRCodeData} instance.
     */
    public CryptoQRCodeData amount(final String amount) {
        this.amount = amount;
        return this;
    }
}
