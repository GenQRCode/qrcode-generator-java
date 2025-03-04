package com.genqrcode.api;

import com.genqrcode.data.PhoneQRCodeData;

/**
 * The {@code PhoneQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building phone based QR codes.
 */
public class PhoneQRCodeBuilder extends QRCodeImpl<PhoneQRCodeBuilder, PhoneQRCodeData> {

    /**
     * Constructs a {@code PhoneQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    PhoneQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
