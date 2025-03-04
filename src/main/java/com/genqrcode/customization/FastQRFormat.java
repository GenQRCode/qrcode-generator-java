package com.genqrcode.customization;

/**
 * The {@code FastQRFormat} enum represents various image formats that can be used for Fast QR codes.
 * Each format has an associated name.
 */
public enum FastQRFormat {
    PNG("png"),
    SVG("svg");

    private final String name;

    /**
     * Constructs a {@code Format} with the specified name.
     *
     * @param name the name of the image format.
     */
    FastQRFormat(final String name) {
        this.name = name;
    }

    /**
     * Returns the name of the image format.
     *
     * @return the format name.
     */
    public String getFormatName() {
        return name;
    }
}
