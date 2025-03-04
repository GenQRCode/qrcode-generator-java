package com.genqrcode.api;

import com.genqrcode.data.VEventQRCodeData;

/**
 * The {@code FastVEventQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building VEvent based QR codes.
 */
public class FastVEventQRCodeBuilder extends FastQRCodeImpl<FastVEventQRCodeBuilder, VEventQRCodeData> {

    /**
     * Constructs a {@code FastVEventQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastVEventQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
