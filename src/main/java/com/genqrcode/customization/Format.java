package com.genqrcode.customization;

/**
 * The {@code Format} enum represents various image formats that can be used for QR codes.
 * Each format has an associated name.
 */
public enum Format {
    PNG("png"),
    JPEG("jpeg"),
    WEBP("webp"),
    SVG("svg"),
    EPS("eps"),
    GIF("gif"),
    TIFF("tiff");

    private final String name;

    /**
     * Constructs a {@code Format} with the specified name.
     *
     * @param name the name of the image format.
     */
    Format(final String name) {
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
