package com.genqrcode.customization;

/**
 * The {@code SquaresShape} enum represents different shapes that can be used for squares in a QR code.
 * Each shape has an associated id.
 */
public enum SquaresShape {
    SQUARES(0),
    SMALL_SQUARES(1),
    ROUNDED_SQUARES(2),
    SMALL_ROUNDED_SQUARES(3),
    CIRCLES(4),
    SMALL_CIRCLES(5),
    STARS(6),
    OCTAGONS(7),
    PLUSSES(8),
    PLUSSES_JOINED(9),
    PLUSSES_JOINED_AND_FILLED(10),
    X(11),
    X_JOINED(12),
    SMALL_CIRCLES_JOINED_HORIZONTAL(13),
    SMALL_CIRCLES_JOINED_VERTICAL(14),
    SMALL_CIRCLES_JOINED(15),
    SQUARES_SLIGHTLY_DIAGONAL(16),
    SMALL_CIRCLES_CONNECTED_HORIZONTAL(17),
    SMALL_CIRCLES_CONNECTED_VERTICAL(18),
    SMALL_CIRCLES_CONNECTED(19),
    SMALL_CIRCLES_ON_THE_ENDS(20),
    HEARTHS(21),
    DIAMOND(22),
    SQUARES_CURVED_INWARDS(23),
    WEB(24);

    private final int id;

    /**
     * Constructs a {@code SquaresShape} with the specified id.
     *
     * @param id the unique identifier for the squares shape.
     */
    SquaresShape(final int id) {
        this.id = id;
    }

    /**
     * Returns the unique identifier for the squares shape.
     *
     * @return the shape id.
     */
    public int getId() {
        return id;
    }
}
