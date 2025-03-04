package com.genqrcode.data;

import java.net.URL;

/**
 * The {@code UrlQRCodeData} class represents the data model for a QR code that encodes a URL.
 */
public class UrlQRCodeData extends QRCodeData {

    private String url;

    /**
     * Constructs a {@code UrlQRCodeData} instance.
     */
    public UrlQRCodeData() {
        super(0);
    }

    /**
     * Creates a new {@code UrlQRCodeData} instance with the specified url content.
     *
     * @param url the url to be encoded in the QR code.
     * @return a new {@code UrlQRCodeData} instance with the specified url.
     */
    public static UrlQRCodeData withUrl(final URL url) {
        return new UrlQRCodeData().url(url);
    }

    /**
     * Sets the URL content for the QR code.
     *
     * @param url the URL to be encoded in the QR code.
     * @return the current {@code UrlQRCodeData} instance.
     */
    public UrlQRCodeData url(final URL url) {
        if (null != url) {
            this.url = url.toString();
        }
        return this;
    }
}
