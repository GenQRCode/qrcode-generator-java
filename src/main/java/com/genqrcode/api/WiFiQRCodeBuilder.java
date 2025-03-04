package com.genqrcode.api;

import com.genqrcode.data.WiFiQRCodeData;

/**
 * The {@code WiFiQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building WiFi-based QR codes.
 */
public class WiFiQRCodeBuilder extends QRCodeImpl<WiFiQRCodeBuilder, WiFiQRCodeData> {

    /**
     * Constructs a {@code WiFiQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    WiFiQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
