package com.genqrcode.customization;

/**
 * The {@code Frame} enum represents different types of frames that can be applied to a QR code.
 * Each frame type has an associated id and can optionally have a color.
 */
public enum Frame {
    NO_FRAME(0),
    SOLID_FRAME(7),
    FOUR_CORNERS(8),
    FOUR_CORNERS_ROUNDED(9);

    private final int id;
    private Color color;

    /**
     * Constructs a {@code Frame} with the specified id.
     *
     * @param id the unique identifier for the frame type.
     */
    Frame(final int id) {
        this.id = id;
    }

    /**
     * Sets the color for the frame and returns the modified frame.
     *
     * @param color the color to be applied to the frame.
     * @return the current {@code Frame} instance with the specified color.
     */
    public Frame withColor(final Color color) {
        this.color = color;
        return this;
    }

    /**
     * Returns the unique identifier for the frame.
     *
     * @return the frame id.
     */
    public int getFrameId() {
        return id;
    }

    /**
     * Returns the color of the frame.
     *
     * @return the frame color, or {@code null} if no color has been set.
     */
    public Color getFrameColor() {
        return color;
    }
}
