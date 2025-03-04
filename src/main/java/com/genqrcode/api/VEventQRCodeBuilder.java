package com.genqrcode.api;

import com.genqrcode.data.VEventQRCodeData;

/**
 * The {@code VEventQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building VEvent based QR codes.
 */
public class VEventQRCodeBuilder extends QRCodeImpl<VEventQRCodeBuilder, VEventQRCodeData> {

    /**
     * Constructs a {@code VEventQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    VEventQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
