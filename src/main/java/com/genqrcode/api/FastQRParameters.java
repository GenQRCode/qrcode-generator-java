package com.genqrcode.api;

import com.genqrcode.customization.FastQRFormat;
import com.genqrcode.data.QRCodeData;

public class FastQRParameters {
    private String imageformat = FastQRFormat.PNG.getFormatName();
    private QRCodeData data;
    private int width = 500;
    private int height = 500;
    private int bordersize = 4;

    void setFormat(final FastQRFormat format) {
        this.imageformat = format.getFormatName();
    }

    void setData(final QRCodeData data) {
        this.data = data;
    }

    void setWidth(int width) {
        this.width = width;
    }

    void setHeight(int height) {
        this.height = height;
    }

    void setBorderSize(int borderSize) {
        this.bordersize = borderSize;
    }
}
