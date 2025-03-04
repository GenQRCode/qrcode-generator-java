package com.genqrcode.api;

import com.genqrcode.data.SMSQRCodeData;

/**
 * The {@code FastSMSQRCodeBuilder} class extends {@link FastQRCodeImpl} and provides methods specific to building sms based QR codes.
 */
public class FastSMSQRCodeBuilder extends FastQRCodeImpl<FastSMSQRCodeBuilder, SMSQRCodeData> {

    /**
     * Constructs a {@code FastSMSQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    FastSMSQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
