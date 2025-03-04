package com.genqrcode.customization;

/**
 * The {@code Format3DBase} class represents the base of a 3D model, including optional magnet holes.
 * The base can have either square or round magnet holes, specified by the magnet type.
 */
public class Format3DBase {

    private float stl_base_height = 0f;
    private int stl_qr_magnet_count = 0;
    private float stl_qr_magnet_width = 0f;
    private float stl_qr_magnet_height = 0f;
    private float stl_qr_magnet_diameter = 0f;
    private float stl_qr_magnet_depth = 0f;
    private int stl_qr_magnet_type = MagnetType.NONE.getMagnetId();

    /**
     * Constructs a {@code Format3DBase} with the specified base height.
     *
     * @param height the height of the base.
     */
    public Format3DBase(float height) {
        this.stl_base_height = height;
    }

    /**
     * Configures the base with square magnet holes.
     *
     * @param count  the number of magnet holes. Must be between 0 and 4.
     * @param width  the width of each magnet hole in mm.
     * @param height the height of each magnet hole in mm.
     * @param depth  the depth of each magnet hole in mm.
     * @return the current {@code Format3DBase} instance with square magnet holes configured.
     */
    public Format3DBase withSquareMagnetHoles(int count, float width, float height, float depth) {
        if (count < 0 || count > 4) {
            throw new IllegalArgumentException("Magnet hole count should be between 0 and 4");
        }
        this.stl_qr_magnet_type = MagnetType.SQUARE.getMagnetId();
        this.stl_qr_magnet_count = count;
        this.stl_qr_magnet_width = width;
        this.stl_qr_magnet_height = height;
        this.stl_qr_magnet_depth = depth;
        return this;
    }

    /**
     * Configures the base with round magnet holes.
     *
     * @param count    the number of magnet holes. Must be between 0 and 4.
     * @param diameter the diameter of each magnet hole in mm.
     * @param depth    the depth of each magnet hole  in mm.
     * @return the current {@code Format3DBase} instance with round magnet holes configured.
     */
    public Format3DBase withRoundMagnetHoles(int count, float diameter, float depth) {
        if (count < 0 || count > 4) {
            throw new IllegalArgumentException("Magnet hole count should be between 0 and 4");
        }
        this.stl_qr_magnet_type = MagnetType.ROUND.getMagnetId();
        this.stl_qr_magnet_count = count;
        this.stl_qr_magnet_diameter = diameter;
        this.stl_qr_magnet_depth = depth;
        return this;
    }
}
