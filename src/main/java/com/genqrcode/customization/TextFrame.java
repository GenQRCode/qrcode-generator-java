package com.genqrcode.customization;

/**
 * The {@code TextFrame} enum represents different types of frames that can contain text that can be applied to a QR code.
 * Each frame type has an associated id and can optionally have text and a color.
 */
public enum TextFrame {
    SIMPLE_FRAME(1),
    RIBBON_BELOW(2),
    SIMPLE_FRAME_TEXT_ABOVE(3),
    OUTLINES_TEXT_INSIDE(4),
    TEXT_ABOVE_ROUNDED_SQUARE(5),
    TEXT_ABOVE_SQUARE(6),
    SIMPLE_FRAME_WITH_ARROW(10),
    TEXT_ABOVE_ROUNDED_SQUARE_WITH_ARROW(11),
    TEXT_ABOVE(12),
    TEXT_BELOW(13);

    private final int id;
    private String text;
    private Color color;

    /**
     * Constructs a {@code TextFrame} with the specified id.
     *
     * @param id the unique identifier for the text frame type.
     */
    TextFrame(final int id) {
        this.id = id;
    }

    /**
     * Sets the text for the frame and returns the modified frame.
     *
     * @param text the text to be applied to the frame.
     * @return the current {@code TextFrame} instance with the specified text.
     */
    public TextFrame withText(final String text) {
        this.text = text;
        return this;
    }

    /**
     * Sets the color for the frame and returns the modified frame.
     *
     * @param color the color to be applied to the frame.
     * @return the current {@code TextFrame} instance with the specified color.
     */
    public TextFrame withColor(final Color color) {
        this.color = color;
        return this;
    }

    /**
     * Returns the unique identifier for the text frame type.
     *
     * @return the frame id.
     */
    public int getFrameId() {
        return id;
    }

    /**
     * Returns the text of the frame.
     *
     * @return the frame text, or {@code null} if no text has been set.
     */
    public String getFrameText() {
        return text;
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
