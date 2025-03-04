package com.genqrcode.api;

import com.genqrcode.customization.FastQRFormat;
import com.genqrcode.data.QRCodeData;

import java.util.concurrent.Future;

abstract class FastQRCodeImpl<T extends FastQRCodeImpl<T, E>, E extends QRCodeData> implements FastQRCodeBuilder<T, E> {

    private final GenQRCodeAdapter adapter;
    private final FastQRParameters parameters;

    FastQRCodeImpl(final GenQRCodeAdapter adapter) {
        this.adapter = adapter;
        this.parameters = new FastQRParameters();
    }

    @Override
    public T data(final E data) {
        this.parameters.setData(data);
        return self();
    }

    @Override
    public T format(final FastQRFormat format) {
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

    public FastQRParameters getParameters() {
        return parameters;
    }

    @SuppressWarnings("unchecked")
    private T self() {
        return (T) this;
    }

    @Override
    public Future<byte[]> build() {
        return adapter.exchange(parameters);
    }
}
