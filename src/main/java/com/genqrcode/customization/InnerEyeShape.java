package com.genqrcode.customization;

/**
 * The {@code InnerEyeShape} enum represents different shapes that can be used for the inner eye of a QR code.
 * Each shape has an associated id.
 */
public enum InnerEyeShape {
    SQUARE(0),
    ROUNDED_SQUARE(1),
    CIRCLE(2),
    OCTAGON(3),
    PLUS(4),
    CIRCLES(5),
    HORIZONTAL_LINES(6),
    VERTICAL_LINES(7);

    private final int id;

    /**
     * Constructs an {@code InnerEyeShape} with the specified id.
     *
     * @param id the unique identifier for the inner eye shape.
     */
    InnerEyeShape(final int id) {
        this.id = id;
    }

    /**
     * Returns the unique identifier for the inner eye shape.
     *
     * @return the shape id.
     */
    public int getId() {
        return id;
    }
}
