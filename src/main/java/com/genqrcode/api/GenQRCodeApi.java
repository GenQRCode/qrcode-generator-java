package com.genqrcode.api;

/**
 * The {@code GenQRCode} class provides methods to generate QR codes.
 */
public class GenQRCodeApi {
    private final GenQRCodeAdapter adapter;

    /**
     * Constructs a {@code GenQRCode} instance with the specified API key.
     *
     * @param apiKey the API key for the QR code generation service.
     */
    public GenQRCodeApi(final String apiKey) {
        this.adapter = new GenQRCodeAdapter(apiKey);
    }

    /**
     * Shuts down the QR code generation service, releasing any resources that it may be holding.
     */
    public void shutdown() {
        adapter.shutdown();
    }

    /**
     * Creates a new {@code FastBatchQRCodeBuilder} for generating fast batches of QR Codes.
     * Fast batch is limited to only PNG, and can't contain any customisation.
     * Fast batch is able to generate over 10.000 QR Codes within seconds.
     *
     * @return a {@code FastBatchQRCodeBuilder} instance.
     */
    public FastBatchQRCodeBuilder fastBatchQRCodes() {
        return new FastBatchQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code TextQRCodeBuilder} for generating QR codes containing text.
     *
     * @return a {@code TextQRCodeBuilder} instance.
     */
    public TextQRCodeBuilder textQRCode() {
        return new TextQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastTextQRCodeBuilder} for generating QR codes containing text.
     *
     * @return a {@code FastTextQRCodeBuilder} instance.
     */
    public FastTextQRCodeBuilder fastTextQRCode() {
        return new FastTextQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code UrlQRCodeBuilder} for generating QR codes containing URLs.
     *
     * @return a {@code UrlQRCodeBuilder} instance.
     */
    public UrlQRCodeBuilder urlQRCode() {
        return new UrlQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastUrlQRCodeBuilder} for generating QR codes containing URLs.
     *
     * @return a {@code FastUrlQRCodeBuilder} instance.
     */
    public FastUrlQRCodeBuilder fastUrlQRCode() {
        return new FastUrlQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code WiFiQRCodeBuilder} for generating QR codes containing WiFi credentials.
     *
     * @return a {@code WiFiQRCodeBuilder} instance.
     */
    public WiFiQRCodeBuilder wiFiQRCode() {
        return new WiFiQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastWiFiQRCodeBuilder} for generating QR codes containing WiFi credentials.
     *
     * @return a {@code FastWiFiQRCodeBuilder} instance.
     */
    public FastWiFiQRCodeBuilder fastWiFiQRCode() {
        return new FastWiFiQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code SMSQRCodeBuilder} for generating QR codes containing SMS data.
     *
     * @return a {@code SMSQRCodeBuilder} instance.
     */
    public SMSQRCodeBuilder smsQRCode() {
        return new SMSQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastSMSQRCodeBuilder} for generating QR codes containing SMS data.
     *
     * @return a {@code FastSMSQRCodeBuilder} instance.
     */
    public FastSMSQRCodeBuilder fastSMSQRCode() {
        return new FastSMSQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code EmailQRCodeBuilder} for generating QR codes containing Email data.
     *
     * @return a {@code EmailQRCodeBuilder} instance.
     */
    public EmailQRCodeBuilder emailQRCode() {
        return new EmailQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastEmailQRCodeBuilder} for generating QR codes containing Email data.
     *
     * @return a {@code FastEmailQRCodeBuilder} instance.
     */
    public FastEmailQRCodeBuilder fastEmailQRCode() {
        return new FastEmailQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code PhoneQRCodeBuilder} for generating QR codes containing phone data.
     *
     * @return a {@code PhoneQRCodeBuilder} instance.
     */
    public PhoneQRCodeBuilder phoneQRCode() {
        return new PhoneQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastPhoneQRCodeBuilder} for generating QR codes containing phone data.
     *
     * @return a {@code FastPhoneQRCodeBuilder} instance.
     */
    public FastPhoneQRCodeBuilder fastPhoneQRCode() {
        return new FastPhoneQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code CryptoQRCodeBuilder} for generating QR codes containing crypto data.
     *
     * @return a {@code CryptoQRCodeBuilder} instance.
     */
    public CryptoQRCodeBuilder cryptoQRCode() {
        return new CryptoQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastCryptoQRCodeBuilder} for generating QR codes containing crypto data.
     *
     * @return a {@code FastCryptoQRCodeBuilder} instance.
     */
    public FastCryptoQRCodeBuilder fastCryptoQRCode() {
        return new FastCryptoQRCodeBuilder(adapter);
    }


    /**
     * Creates a new {@code WhatsappQRCodeBuilder} for generating QR codes containing whatsapp data.
     *
     * @return a {@code WhatsappQRCodeBuilder} instance.
     */
    public WhatsappQRCodeBuilder whatsappQRCode() {
        return new WhatsappQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastWhatsappQRCodeBuilder} for generating QR codes containing whatsapp data.
     *
     * @return a {@code FastWhatsappQRCodeBuilder} instance.
     */
    public FastWhatsappQRCodeBuilder fastWhatsappQRCode() {
        return new FastWhatsappQRCodeBuilder(adapter);
    }


    /**
     * Creates a new {@code GeoQRCodeBuilder} for generating QR codes containing GEO data.
     *
     * @return a {@code GeoQRCodeBuilder} instance.
     */
    public GeoQRCodeBuilder geoQRCode() {
        return new GeoQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastGeoQRCodeBuilder} for generating QR codes containing GEO data.
     *
     * @return a {@code FastGeoQRCodeBuilder} instance.
     */
    public FastGeoQRCodeBuilder fastGeoQRCode() {
        return new FastGeoQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code VEventQRCodeBuilder} for generating QR codes containing VEvent data.
     *
     * @return a {@code VEventQRCodeBuilder} instance.
     */
    public VEventQRCodeBuilder vEventQRCode() {
        return new VEventQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastVEventQRCodeBuilder} for generating QR codes containing VEvent data.
     *
     * @return a {@code FastVEventQRCodeBuilder} instance.
     */
    public FastVEventQRCodeBuilder fastVEventQRCode() {
        return new FastVEventQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code VCardQRCodeBuilder} for generating QR codes containing VCard data.
     *
     * @return a {@code VCardQRCodeBuilder} instance.
     */
    public VCardQRCodeBuilder vCardQRCode() {
        return new VCardQRCodeBuilder(adapter);
    }

    /**
     * Creates a new {@code FastVCardQRCodeBuilder} for generating QR codes containing VCard data.
     *
     * @return a {@code FastVCardQRCodeBuilder} instance.
     */
    public FastVCardQRCodeBuilder fastVCardQRCode() {
        return new FastVCardQRCodeBuilder(adapter);
    }
}
