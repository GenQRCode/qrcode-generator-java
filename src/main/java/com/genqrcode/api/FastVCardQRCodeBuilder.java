package com.genqrcode.api;

import com.genqrcode.data.VCardQRCodeData;

/**
 * The {@code FastVCardQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building VCard based QR codes.
 */
public class FastVCardQRCodeBuilder extends FastQRCodeImpl<FastVCardQRCodeBuilder, VCardQRCodeData> {

    /**
     * Constructs a {@code FastVCardQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastVCardQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
