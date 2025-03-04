package com.genqrcode.api;

import com.genqrcode.data.VCardQRCodeData;

/**
 * The {@code VCardQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building VCard based QR codes.
 */
public class VCardQRCodeBuilder extends QRCodeImpl<VCardQRCodeBuilder, VCardQRCodeData> {

    /**
     * Constructs a {@code VCardQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    VCardQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
