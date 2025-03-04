package com.genqrcode.api;

import com.genqrcode.data.CryptoQRCodeData;

/**
 * The {@code CryptoQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building crypto based QR codes.
 */
public class CryptoQRCodeBuilder extends QRCodeImpl<CryptoQRCodeBuilder, CryptoQRCodeData> {

    /**
     * Constructs a {@code CryptoQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    CryptoQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
