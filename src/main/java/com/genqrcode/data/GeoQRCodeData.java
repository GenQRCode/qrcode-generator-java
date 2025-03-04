package com.genqrcode.data;

/**
 * The {@code GeoQRCodeData} class represents the data model for a QR code that encodes GEO data.
 */
public class GeoQRCodeData extends QRCodeData {
    private String ge_latitude;
    private String ge_longitude;

    /**
     * Constructs a {@code GeoQRCodeData} instance.
     */
    public GeoQRCodeData() {
        super(9);
    }

    /**
     * Sets the latitude content for the QR code.
     *
     * @param latitude the latitude to be encoded in the QR code.
     * @return the current {@code GeoQRCodeData} instance.
     */
    public GeoQRCodeData latitude(final String latitude) {
        this.ge_latitude = latitude;
        return this;
    }

    /**
     * Sets the longitude content for the QR code.
     *
     * @param longitude the latitude to be encoded in the QR code.
     * @return the current {@code GeoQRCodeData} instance.
     */
    public GeoQRCodeData longitude(final String longitude) {
        this.ge_longitude = longitude;
        return this;
    }
}
