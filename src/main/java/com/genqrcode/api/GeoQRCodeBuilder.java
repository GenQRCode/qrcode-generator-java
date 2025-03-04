package com.genqrcode.api;

import com.genqrcode.data.GeoQRCodeData;

/**
 * The {@code GeoQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building geo based QR codes.
 */
public class GeoQRCodeBuilder extends QRCodeImpl<GeoQRCodeBuilder, GeoQRCodeData> {

    /**
     * Constructs a {@code GeoQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    GeoQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
