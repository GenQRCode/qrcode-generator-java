package com.genqrcode.data;

/**
 * The {@code CryptoType} enum represents different types of crypto that can be used in {@code CryptoQRCodeData}.
 */
public enum CryptoType {
    BITCOIN("bitcoin"),
    BITCOIN_CASH("bitcoincash"),
    ETHEREUM("ethereum"),
    LITECOIN("litecoin");

    private final String name;

    /**
     * Constructs a {@code CryptoType} with the specified name.
     *
     * @param name the unique identifier for the crypto.
     */
    CryptoType(final String name) {
        this.name = name;
    }

    /**
     * Returns the unique identifier for the crypto.
     *
     * @return the crypto name.
     */
    public String getCryptoName() {
        return name;
    }
}
