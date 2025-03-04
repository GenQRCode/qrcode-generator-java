package com.genqrcode.customization;

/**
 * The {@code MagnetType} enum represents different types of magnets that can be used in a 3D model.
 * Each magnet type has an associated id.
 */
public enum MagnetType {
    NONE(0),
    ROUND(1),
    SQUARE(2);

    private final int id;

    /**
     * Constructs a {@code MagnetType} with the specified id.
     *
     * @param id the unique identifier for the magnet type.
     */
    MagnetType(final int id) {
        this.id = id;
    }

    /**
     * Returns the unique identifier for the magnet type.
     *
     * @return the magnet id.
     */
    public int getMagnetId() {
        return id;
    }
}
