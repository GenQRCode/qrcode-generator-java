package com.genqrcode.api;

import com.genqrcode.data.WiFiQRCodeData;

/**
 * The {@code FastWiFiQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building WiFi-based QR codes.
 */
public class FastWiFiQRCodeBuilder extends FastQRCodeImpl<FastWiFiQRCodeBuilder, WiFiQRCodeData> {

    /**
     * Constructs a {@code FastWiFiQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastWiFiQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
