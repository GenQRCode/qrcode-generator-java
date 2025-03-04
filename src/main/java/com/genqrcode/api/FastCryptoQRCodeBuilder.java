package com.genqrcode.api;

import com.genqrcode.data.CryptoQRCodeData;

/**
 * The {@code FastCryptoQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building crypto based QR codes.
 */
public class FastCryptoQRCodeBuilder extends FastQRCodeImpl<FastCryptoQRCodeBuilder, CryptoQRCodeData> {

    /**
     * Constructs a {@code FastCryptoQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastCryptoQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
