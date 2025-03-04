package com.genqrcode.api;

import com.genqrcode.customization.*;
import com.genqrcode.data.QRCodeData;

import java.util.concurrent.Future;

/**
 * The {@code QRCodeBuilder} interface defines methods to configure and build a QR code.
 *
 * @param <T> the type of the implementing builder, used for method chaining.
 */
interface QRCodeBuilder<T extends QRCodeImpl<T, E>, E extends QRCodeData> {

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
    T format(final Format format);

    /**
     * Sets the image format of the QR code (3D).
     *
     * @param format the 3D image format of the QR code.
     * @return the current builder instance.
     */
    T format(final Format3D format);

    /**
     * Sets the width of the QR code.
     *
     * @param width  the width of the QR code.
     * @return the current builder instance.
     */
    T width(int width);

    /**
     * Sets the height of the QR code.
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
     * Sets the background color of the QR code.
     *
     * @param color the background color of the QR code.
     * @return the current builder instance.
     */
    T backgroundColor(final Color color);

    /**
     * Sets the square color of the QR code.
     *
     * @param color the square color of the QR code.
     * @return the current builder instance.
     */
    T squareColor(final Color color);

    /**
     * Sets the frame around the QR code.
     *
     * @param frame the frame of the QR code.
     * @return the current builder instance.
     */
    T frame(final Frame frame);

    /**
     * Sets the frame with text around the QR code.
     *
     * @param frame the text frame of the QR code.
     * @return the current builder instance.
     */
    T frame(final TextFrame frame);

    /**
     * Sets the inner eye shape of the QR code.
     *
     * @param shape the inner eye shape of the QR code.
     * @return the current builder instance.
     */
    T innerEyeShape(final InnerEyeShape shape);

    /**
     * Sets the inner eye color of the QR code.
     *
     * @param color the inner eye color of the QR code.
     * @return the current builder instance.
     */
    T innerEyeColor(final Color color);

    /**
     * Sets the outer eye shape of the QR code.
     *
     * @param shape the outer eye shape of the QR code.
     * @return the current builder instance.
     */
    T outerEyeShape(final OuterEyeShape shape);

    /**
     * Sets the outer eye color of the QR code.
     *
     * @param color the outer eye color of the QR code.
     * @return the current builder instance.
     */
    T outerEyeColor(final Color color);

    /**
     * Sets the squares shape of the QR code.
     *
     * @param shape the squares shape of the QR code.
     * @return the current builder instance.
     */
    T squaresShape(final SquaresShape shape);

    /**
     * Builds the QR code asynchronously by making a remote server call.
     *
     * @return a {@code Future} containing the QR code byte array.
     */
    Future<byte[]> build();
}
