package com.genqrcode.customization;

/**
 * The {@code Format3D} enum represents various 3D model formats that can be used.
 * Each format has an associated name, size, height, and optional base.
 */
public enum Format3D {
    STL("stl"),
    MF3("3mf"),
    OBJ("obj");

    private final String name;
    private float size = 100f;
    private float height = 1.5f;
    private Format3DBase base;

    /**
     * Constructs a {@code Format3D} with the specified name.
     *
     * @param name the name of the 3D model format.
     */
    Format3D(final String name) {
        this.name = name;
    }

    /**
     * Sets the size of the 3D model and returns the modified format.
     *
     * @param size the size of the 3D model.
     * @return the current {@code Format3D} instance with the specified size.
     */
    public Format3D size(float size) {
        this.size = size;
        return this;
    }

    /**
     * Sets the height of the 3D model and returns the modified format.
     *
     * @param height the height of the 3D model.
     * @return the current {@code Format3D} instance with the specified height.
     */
    public Format3D height(float height) {
        this.height = height;
        return this;
    }

    /**
     * Sets the base of the 3D model and returns the modified format.
     *
     * @param base the base of the 3D model.
     * @return the current {@code Format3D} instance with the specified base.
     */
    public Format3D withBase(final Format3DBase base) {
        this.base = base;
        return this;
    }

    /**
     * Returns the name of the 3D model format.
     *
     * @return the format name.
     */
    public String getFormatName() {
        return name;
    }

    /**
     * Returns the size of the 3D model.
     *
     * @return the size.
     */
    public float getSize() {
        return size;
    }

    /**
     * Returns the height of the 3D model.
     *
     * @return the height.
     */
    public float getHeight() {
        return height;
    }

    /**
     * Returns the base of the 3D model.
     *
     * @return the base, or {@code null} if no base has been set.
     */
    public Format3DBase getBase() {
        return base;
    }
}
