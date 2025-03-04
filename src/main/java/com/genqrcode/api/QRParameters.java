package com.genqrcode.api;

import com.genqrcode.customization.*;
import com.genqrcode.data.QRCodeData;

class QRParameters {
    private String imageformat = Format.PNG.getFormatName();
    private QRCodeData data;
    private int width = 500;
    private int height = 500;
    private int bordersize = 4;
    private String background_color;
    private String color;
    private int frame_style;
    private String frame_color;
    private String frame_text;
    private int inner_eye_style;
    private String inner_eye_color;
    private int outer_eye_style;
    private String outer_eye_color;
    private int style;
    private String logo;
    private boolean logo_remove_background;
    private float size3d = 0f;
    private float height3d = 0f;
    private Format3DBase base;

    void setFormat(final Format format) {
        this.imageformat = format.getFormatName();
    }

    void setFormat(final Format3D format) {
        this.imageformat = format.getFormatName();
        this.size3d = format.getSize();
        this.height3d = format.getHeight();
        this.base = format.getBase();
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

    void setBackgroundColor(final Color color) {
        this.background_color = color.toString();
    }

    void setForegroundColor(final Color color) {
        this.color = color.toString();
    }

    void setInnerEyeColor(final Color color) {
        this.inner_eye_color = color.toString();
    }

    void setOuterEyeColor(final Color color) {
        this.outer_eye_color = color.toString();
    }

    void setFrame(final Frame frame) {
        this.frame_style = frame.getFrameId();
        this.frame_text = null;
        this.frame_color = null != frame.getFrameColor() ? frame.getFrameColor().toString() : null;
    }

    void setFrame(final TextFrame frame) {
        this.frame_style = frame.getFrameId();
        this.frame_text = frame.getFrameText();
        this.frame_color = null != frame.getFrameColor() ? frame.getFrameColor().toString() : null;
    }

    void setInnerEyeShape(final InnerEyeShape shape) {
        this.inner_eye_style = shape.getId();
    }

    void setOuterEyeShape(final OuterEyeShape shape) {
        this.outer_eye_style = shape.getId();
    }

    void setSquaresShape(final SquaresShape shape) {
        this.style = shape.getId();
    }

    void setLogo(Logo logo, String logoKey) {
        this.logo = logoKey;
        if (null != logo) {
            this.logo_remove_background = logo.isBackgroundRemoved();
        }
    }
}
