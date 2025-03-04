package com.genqrcode.api;

import com.genqrcode.customization.FastQRFormat;
import com.genqrcode.data.QRCodeData;

import java.util.concurrent.Future;

/**
 * The {@code QRCodeBuilder} interface defines methods to configure and build a QR code.
 *
 * @param <T> the type of the implementing builder, used for method chaining.
 */
interface FastQRCodeBuilder<T extends FastQRCodeImpl<T, E>, E extends QRCodeData> {

    /**
     * Sets the data of the QR code.
     *
     * @param data the data of the QR code.
     * @return the current builder instance.
     */
    T data(final E data);

    /**
     * Sets the image format of the QR code.
     *
     * @param format the image format of the QR code.
     * @return the current builder instance.
     */
    T format(final FastQRFormat format);

    /**
     * Sets the size of the QR code.
     *
     * @param width  the width of the QR code.
     * @return the current builder instance.
     */
    T width(int width);

    /**
     * Sets the size of the QR code.
     *
     * @param height the height of the QR code.
     * @return the current builder instance.
     */
    T height(int height);

    /**
     * Sets the border size of the QR code. The border size specifies the number of squares added around the QR code.
     *
     * @param borderSize the border size of the QR code, indicating the amount of squares added around the QR code.
     * @return the current builder instance.
     */
    T borderSize(int borderSize);

    /**
     * Builds the QR code asynchronously by making a remote server call.
     *
     * @return a {@code Future} containing the QR code byte array.
     */
    Future<byte[]> build();
}
