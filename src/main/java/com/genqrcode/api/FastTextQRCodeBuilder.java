package com.genqrcode.api;

import com.genqrcode.data.TextQRCodeData;

/**
 * The {@code FastTextQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building text-based QR codes.
 */
public class FastTextQRCodeBuilder extends FastQRCodeImpl<FastTextQRCodeBuilder, TextQRCodeData> {

    /**
     * Constructs a {@code FastTextQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastTextQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
