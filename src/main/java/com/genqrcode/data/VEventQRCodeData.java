package com.genqrcode.data;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;

/**
 * The {@code VEventQRCodeData} class represents the data model for a QR code that encodes VEvent data.
 */
public class VEventQRCodeData extends QRCodeData {
    private String ve_summary;
    private String ve_description;
    private String ve_location;
    private String ve_timezone;
    private String ve_url;
    private String ve_start;
    private String ve_end;
    /**
     * Constructs a {@code VEventQRCodeData} instance.
     */
    public VEventQRCodeData() {
        super(8);
    }

    /**
     * Sets the summary content for the QR code.
     *
     * @param summary the summary to be encoded in the QR code.
     * @return the current {@code VEventQRCodeData} instance.
     */
    public VEventQRCodeData summary(final String summary) {
        this.ve_summary = summary;
        return this;
    }

    /**
     * Sets the description content for the QR code.
     *
     * @param description the description to be encoded in the QR code.
     * @return the current {@code VEventQRCodeData} instance.
     */
    public VEventQRCodeData description(final String description) {
        this.ve_description = description;
        return this;
    }

    /**
     * Sets the location content for the QR code.
     *
     * @param location the location to be encoded in the QR code.
     * @return the current {@code VEventQRCodeData} instance.
     */
    public VEventQRCodeData location(final String location) {
        this.ve_location = location;
        return this;
    }

    /**
     * Sets the timezone content for the QR code.
     *
     * @param timezone the timezone to be encoded in the QR code.
     * @return the current {@code VEventQRCodeData} instance.
     */
    public VEventQRCodeData timezone(final TimeZone timezone) {
        if (null != timezone) {
            this.ve_timezone = timezone.getID();
        }
        return this;
    }

    /**
     * Sets the url content for the QR code.
     *
     * @param url the url to be encoded in the QR code.
     * @return the current {@code VEventQRCodeData} instance.
     */
    public VEventQRCodeData url(final String url) {
        this.ve_url = url;
        return this;
    }

    /**
     * Sets the start date content for the QR code.
     *
     * @param startDate the start date to be encoded in the QR code.
     * @return the current {@code VEventQRCodeData} instance.
     */
    public VEventQRCodeData startDate(final Date startDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.ve_start = sdf.format(startDate);
        return this;
    }

    /**
     * Sets the end date content for the QR code.
     *
     * @param endDate the end date to be encoded in the QR code.
     * @return the current {@code VEventQRCodeData} instance.
     */
    public VEventQRCodeData endDate(final Date endDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd'T'HHmmss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.ve_end = sdf.format(endDate);
        return this;
    }
}
