package com.genqrcode.customization;

/**
 * The {@code Color} record represents an RGB color with red, green, and blue components.
 * Each component should be in the range from 0 to 255.
 */
public class Color {

    private final int r;
    private final int g;
    private final int b;
    private final int a;

    /**
     * Constructs a {@code Color} instance with the specified red, green, and blue values.
     *
     * @param r the red component, should be between 0 and 255
     * @param g the green component, should be between 0 and 255
     * @param b the blue component, should be between 0 and 255
     * @param a the alpha component, should be between 0 and 255
     * @throws IllegalArgumentException if any of the RGBA values are outside the range 0 to 255
     */
    public Color(int r, int g, int b, int a) {
        if (r < 0 || r > 255 || g < 0 || g > 255 || b < 0 || b > 255 || a < 0 || a > 255) {
            throw new IllegalArgumentException("RGBA values should be between 0 and 255");
        }
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    /**
     * Constructs a {@code Color} instance with the specified red, green, and blue values.
     *
     * @param r the red component, should be between 0 and 255
     * @param g the green component, should be between 0 and 255
     * @param b the blue component, should be between 0 and 255
     * @throws IllegalArgumentException if any of the RGB values are outside the range 0 to 255
     */
    public Color(int r, int g, int b) {
        this(r, g, b, 255);
    }

    /**
     * Creates a new {@code Color} instance from the specified RGB values.
     *
     * @param r the red component, should be between 0 and 255
     * @param g the green component, should be between 0 and 255
     * @param b the blue component, should be between 0 and 255
     * @return a new {@code Color} instance
     * @throws IllegalArgumentException if any of the RGB values are outside the range 0 to 255
     */
    public static Color fromRGB(int r, int g, int b) {
        return new Color(r, g, b);
    }

    /**
     * Creates a new {@code Color} instance from the specified RGB values.
     *
     * @param r the red component, should be between 0 and 255
     * @param g the green component, should be between 0 and 255
     * @param b the blue component, should be between 0 and 255
     * @param a the alpha component, should be between 0 and 255
     * @return a new {@code Color} instance
     *
     * @throws IllegalArgumentException if any of the RGBA values are outside the range 0 to 255
     */
    public static Color fromRGBA(int r, int g, int b, int a) {
        return new Color(r, g, b, a);
    }

    /**
     * Returns a string representation of the color in the format #RRGGBBAA.
     *
     * @return a string representation of the color.
     */
    @Override
    public String toString() {
        return String.format("#%02X%02X%02X%02X", r, g, b, a);
    }
}
