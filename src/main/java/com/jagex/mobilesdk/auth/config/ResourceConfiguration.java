package com.jagex.mobilesdk.auth.config;

import android.content.Context;
import android.content.res.Resources;
import com.jagex.mobilesdk.R$string;

public final class ResourceConfiguration {
    private ResourceConfiguration() {
        super();
        throw new UnsupportedOperationException();
    }

    public static JagexConfig createInstance(Context arg2) {
        Resources v0 = arg2.getResources();
        return new JagexConfigBuilder(arg2).setClientId(v0.getString(R$string.com_jagex_mobilesdk_clientId)).setClientSecret(v0.getString(R$string.com_jagex_mobilesdk_clientSecret)).setScope(v0.getString(R$string.com_jagex_mobilesdk_scope)).setIssuerUri(v0.getString(R$string.com_jagex_mobilesdk_issuerUri)).setRedirectUri(v0.getString(R$string.com_jagex_mobilesdk_redirectUri)).setShopName(v0.getString(R$string.com_jagex_mobilesdk_shopname)).setPaymentUri(v0.getString(R$string.com_jagex_mobilesdk_paymentUri)).build();
    }
}

