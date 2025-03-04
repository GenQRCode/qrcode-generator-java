package com.genqrcode.customization;

/**
 * The {@code NetworkType} enum represents various network types that can be used for Wi-Fi QR codes.
 * Each NetworkType has an associated id.
 */
public enum NetworkType {
    WPA_WPA2(0),
    WEP(1),
    NO_ENCRYPTION(2);

    private final int id;

    /**
     * Constructs a {@code NetworkType} with the specified id.
     *
     * @param id the unique identifier for the network type.
     */
    NetworkType(final int id) {
        this.id = id;
    }

    /**
     * Returns the unique identifier for the network type.
     *
     * @return the network type id.
     */
    public int getNetworkTypeId() {
        return id;
    }
}