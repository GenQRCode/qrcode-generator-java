package com.genqrcode.api;

import com.genqrcode.data.GeoQRCodeData;

/**
 * The {@code FastGeoQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building geo based QR codes.
 */
public class FastGeoQRCodeBuilder extends FastQRCodeImpl<FastGeoQRCodeBuilder, GeoQRCodeData> {

    /**
     * Constructs a {@code FastGeoQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastGeoQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
