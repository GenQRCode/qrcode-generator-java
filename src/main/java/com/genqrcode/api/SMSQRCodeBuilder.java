package com.genqrcode.api;

import com.genqrcode.data.SMSQRCodeData;

/**
 * The {@code SMSQRCodeBuilder} class extends {@link QRCodeImpl} and provides methods specific to building sms based QR codes.
 */
public class SMSQRCodeBuilder extends QRCodeImpl<SMSQRCodeBuilder, SMSQRCodeData> {

    /**
     * Constructs a {@code SMSQRCodeBuilder} instance with the given adapter.
     *
     * @param adapter the adapter to use for generating the QR code.
     */
    SMSQRCodeBuilder(final GenQRCodeAdapter adapter) {
        super(adapter);
    }
}
