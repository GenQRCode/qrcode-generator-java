package com.genqrcode.api;

import com.genqrcode.data.EmailQRCodeData;

/**
 * The {@code FastEmailQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building email based QR codes.
 */
public class FastEmailQRCodeBuilder extends FastQRCodeImpl<FastEmailQRCodeBuilder, EmailQRCodeData> {

    /**
     * Constructs a {@code FastEmailQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastEmailQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
