package com.jagex.mobilesdk.auth.config;

import android.net.Uri;

public class BasicJagexConfig implements JagexConfig {
    private final String clientId;
    private final String clientSecret;
    private final Uri issuerUri;
    private final String paymentUri;
    private final Uri redirectUri;
    private final String scope;
    private final String shopName;

    BasicJagexConfig(String arg1, String arg2, String arg3, Uri arg4, Uri arg5, String arg6, String arg7) {
        super();
        this.clientId = arg1;
        this.clientSecret = arg2;
        this.scope = arg3;
        this.redirectUri = arg4;
        this.issuerUri = arg5;
        this.shopName = arg6;
        this.paymentUri = arg7;
    }

    public String getClientId() {
        return this.clientId;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public Uri getIssuerUri() {
        return this.issuerUri;
    }

    public String getPaymentUri() {
        return this.paymentUri;
    }

    public Uri getRedirectUri() {
        return this.redirectUri;
    }

    public String getScope() {
        return this.scope;
    }

    public String getShopName() {
        return this.shopName;
    }
}

