package com.genqrcode.customization;

/**
 * The {@code OuterEyeShape} enum represents different shapes that can be used for the outer eye of a QR code.
 * Each shape has an associated id.
 */
public enum OuterEyeShape {
    SQUARE(0),
    ROUNDED_SQUARE(1),
    CIRCLE(2),
    INSIDE_ROUNDED(3),
    POINTING_INSIDE(4),
    POINTING_INSIDE_AND_OUTSIDE(5),
    SMALL_CIRCLES(6);

    private final int id;

    /**
     * Constructs an {@code OuterEyeShape} with the specified id.
     *
     * @param id the unique identifier for the outer eye shape.
     */
    OuterEyeShape(final int id) {
        this.id = id;
    }

    /**
     * Returns the unique identifier for the outer eye shape.
     *
     * @return the shape id.
     */
    public int getId() {
        return id;
    }
}
