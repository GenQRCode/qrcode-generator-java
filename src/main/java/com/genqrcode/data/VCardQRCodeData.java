package com.genqrcode.data;

/**
 * The {@code VCardQRCodeData} class represents the data model for a QR code that encodes VCard data.
 */
public class VCardQRCodeData extends QRCodeData {
    private String vc_first_name;
    private String vc_last_name;
    private String vc_company;
    private String vc_job;
    private String vc_street;
    private String vc_city;
    private String vc_state;
    private String vc_zip;
    private String vc_country;
    private String vc_phone;
    private String vc_mobile;
    private String vc_fax;
    private String vc_website;
    private String vc_email;

    /**
     * Constructs a {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData() {
        super(6);
    }

    /**
     * Sets the first name for the VCard.
     *
     * @param firstName the first name to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData firstName(final String firstName) {
        this.vc_first_name = firstName;
        return this;
    }

    /**
     * Sets the last name for the VCard.
     *
     * @param lastName the last name to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData lastName(final String lastName) {
        this.vc_last_name = lastName;
        return this;
    }

    /**
     * Sets the company name for the VCard.
     *
     * @param company the company name to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData company(final String company) {
        this.vc_company = company;
        return this;
    }

    /**
     * Sets the job title for the VCard.
     *
     * @param job the job title to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData job(final String job) {
        this.vc_job = job;
        return this;
    }

    /**
     * Sets the street address for the VCard.
     *
     * @param street the street address to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData street(final String street) {
        this.vc_street = street;
        return this;
    }

    /**
     * Sets the city for the VCard.
     *
     * @param city the city to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData city(final String city) {
        this.vc_city = city;
        return this;
    }

    /**
     * Sets the state for the VCard.
     *
     * @param state the state to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData state(final String state) {
        this.vc_state = state;
        return this;
    }

    /**
     * Sets the zip code for the VCard.
     *
     * @param zip the zip code to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData zip(final String zip) {
        this.vc_zip = zip;
        return this;
    }

    /**
     * Sets the country for the VCard.
     *
     * @param country the country to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData country(final String country) {
        this.vc_country = country;
        return this;
    }

    /**
     * Sets the phone number for the VCard.
     *
     * @param phone the phone number to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData phone(final String phone) {
        this.vc_phone = phone;
        return this;
    }

    /**
     * Sets the mobile number for the VCard.
     *
     * @param mobile the mobile number to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData mobile(final String mobile) {
        this.vc_mobile = mobile;
        return this;
    }

    /**
     * Sets the fax number for the VCard.
     *
     * @param fax the fax number to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData fax(final String fax) {
        this.vc_fax = fax;
        return this;
    }

    /**
     * Sets the website URL for the VCard.
     *
     * @param website the website URL to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData website(final String website) {
        this.vc_website = website;
        return this;
    }

    /**
     * Sets the email address for the VCard.
     *
     * @param email the email address to be encoded in the QR code.
     * @return the current {@code VCardQRCodeData} instance.
     */
    public VCardQRCodeData email(final String email) {
        this.vc_email = email;
        return this;
    }
}
