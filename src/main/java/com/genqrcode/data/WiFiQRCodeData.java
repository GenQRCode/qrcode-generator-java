package com.genqrcode.data;

import com.genqrcode.customization.NetworkType;

/**
 * The {@code WiFiQRCodeData} class represents the data model for a QR code that encodes WiFi data.
 */
public class WiFiQRCodeData extends QRCodeData {

    private String network;
    private String password;
    private int encryption;
    private boolean hidden;

    /**
     * Constructs a {@code WiFiQRCodeData} instance.
     */
    public WiFiQRCodeData() {
        super(1);
    }

    /**
     * Sets the SSID content for the QR code.
     *
     * @param ssid the Wi-Fi SSID to be encoded in the QR code.
     * @return the current {@code WiFiQRCodeBuilder} instance.
     */
    public WiFiQRCodeData ssid(final String ssid) {
        this.network = ssid;
        return this;
    }

    /**
     * Sets the Wi-Fi password content for the QR code.
     *
     * @param password the Wi-Fi password to be encoded in the QR code.
     * @return the current {@code WiFiQRCodeBuilder} instance.
     */
    public WiFiQRCodeData password(final String password) {
        this.password = password;
        return this;
    }

    /**
     * Sets the network type content for the QR code.
     *
     * @param networkType the Wi-Fi network type to be encoded in the QR code.
     * @return the current {@code WiFiQRCodeBuilder} instance.
     */
    public WiFiQRCodeData networkType(final NetworkType networkType) {
        this.encryption = networkType.getNetworkTypeId();
        return this;
    }

    /**
     * Sets the hidden flag for the QR code.
     *
     * @param hidden the Wi-Fi hidden flag to be encoded in the QR code.
     * @return the current {@code WiFiQRCodeBuilder} instance.
     */
    public WiFiQRCodeData isHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }
}
