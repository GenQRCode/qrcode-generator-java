package com.genqrcode.api;

import com.genqrcode.data.PhoneQRCodeData;

/**
 * The {@code FastPhoneQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building phone based QR codes.
 */
public class FastPhoneQRCodeBuilder extends FastQRCodeImpl<FastPhoneQRCodeBuilder, PhoneQRCodeData> {

    /**
     * Constructs a {@code FastPhoneQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastPhoneQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
