package com.genqrcode.api;

import com.genqrcode.customization.*;
import com.genqrcode.data.QRCodeData;

import java.util.concurrent.Future;

abstract class QRCodeImpl<T extends QRCodeImpl<T, E>, E extends QRCodeData> implements QRCodeBuilder<T, E> {

    private final GenQRCodeAdapter adapter;
    private final QRParameters parameters;
    private Logo logo;

    QRCodeImpl(final GenQRCodeAdapter adapter) {
        this.adapter = adapter;
        this.parameters = new QRParameters();
    }

    @Override
    public T data(final E data) {
        this.parameters.setData(data);
        return self();
    }

    public T logo(final Logo logo) {
        this.logo = logo;
        return self();
    }

    @Override
    public T format(final Format format) {
        parameters.setFormat(format);
        return self();
    }

    @Override
    public T format(final Format3D format) {
        parameters.setFormat(format);
        return self();
    }

    @Override
    public T width(int width) {
        parameters.setWidth(width);
        return self();
    }

    @Override
    public T height(int height) {
        parameters.setHeight(height);
        return self();
    }

    @Override
    public T borderSize(int borderSize) {
        parameters.setBorderSize(borderSize);
        return self();
    }

    @Override
    public T backgroundColor(final Color color) {
        parameters.setBackgroundColor(color);
        return self();
    }

    @Override
    public T squareColor(final Color color) {
        parameters.setForegroundColor(color);
        return self();
    }

    @Override
    public T frame(final Frame frame) {
        parameters.setFrame(frame);
        return self();
    }

    @Override
    public T frame(final TextFrame frame) {
        parameters.setFrame(frame);
        return self();
    }

    @Override
    public T innerEyeShape(final InnerEyeShape shape) {
        parameters.setInnerEyeShape(shape);
        return self();
    }

    @Override
    public T innerEyeColor(final Color color) {
        parameters.setInnerEyeColor(color);
        return self();
    }

    @Override
    public T outerEyeShape(final OuterEyeShape shape) {
        parameters.setOuterEyeShape(shape);
        return self();
    }

    @Override
    public T outerEyeColor(final Color color) {
        parameters.setOuterEyeColor(color);
        return self();
    }

    @Override
    public T squaresShape(final SquaresShape shape) {
        parameters.setSquaresShape(shape);
        return self();
    }

    @SuppressWarnings("unchecked")
    private T self() {
        return (T) this;
    }

    @Override
    public Future<byte[]> build() {
        return adapter.exchange(parameters, logo);
    }
}
