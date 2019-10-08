package com.jagex.mobilesdk.auth.config;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class JagexConfigBuilder {
    private String clientId;
    private String clientSecret;
    private final Context context;
    private String issuerUri;
    private String paymentUri;
    private String redirectUri;
    private String scope;
    private String shopName;

    public JagexConfigBuilder(Context arg1) {
        super();
        this.context = arg1;
    }

    public JagexConfig build() throws InvalidConfigurationException {
        StringBuilder v0 = new StringBuilder();
        this.validateConfigField(v0, "clientId", this.clientId);
        this.validateConfigField(v0, "clientSecret", this.clientSecret);
        this.validateConfigField(v0, "scope", this.scope);
        this.validateConfigField(v0, "redirectUri", this.redirectUri);
        this.validateConfigField(v0, "issuerUri", this.issuerUri);
        this.validateConfigField(v0, "shopName", this.shopName);
        this.validateConfigField(v0, "paymentUri", this.paymentUri);
        if(v0.length() <= 0) {
            BasicJagexConfig v0_1 = new BasicJagexConfig(this.clientId, this.clientSecret, this.scope, Uri.parse(this.redirectUri), Uri.parse(this.issuerUri), this.shopName, this.paymentUri);
            if(this.isRedirectUriRegistered(this.context, ((JagexConfig)v0_1).getRedirectUri())) {
                return ((JagexConfig)v0_1);
            }

            throw new InvalidConfigurationException("com_jagex_mobilesdk_redirectUri is not handled by any activity in this app.\nEnsure that the android:scheme in your AndroidManifest.xml intent-filter is set correctly");
        }

        v0.insert(0, "The following config fields were empty:");
        throw new InvalidConfigurationException(v0.toString());
    }

    private boolean isEmptyString(String arg1) {
        boolean v1 = arg1 == null || (arg1.trim().isEmpty()) ? true : false;
        return v1;
    }

    private boolean isRedirectUriRegistered(Context arg4, Uri arg5) {
        Intent v0 = new Intent();
        v0.setPackage(arg4.getPackageName()).setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(arg5);
        return arg4.getPackageManager().queryIntentActivities(v0, 0).isEmpty() ^ 1;
    }

    public JagexConfigBuilder setClientId(String arg1) {
        this.clientId = arg1;
        return this;
    }

    public JagexConfigBuilder setClientSecret(String arg1) {
        this.clientSecret = arg1;
        return this;
    }

    public JagexConfigBuilder setIssuerUri(String arg1) {
        this.issuerUri = arg1;
        return this;
    }

    public JagexConfigBuilder setPaymentUri(String arg1) {
        this.paymentUri = arg1;
        return this;
    }

    public JagexConfigBuilder setRedirectUri(String arg1) {
        this.redirectUri = arg1;
        return this;
    }

    public JagexConfigBuilder setScope(String arg1) {
        this.scope = arg1;
        return this;
    }

    public JagexConfigBuilder setShopName(String arg1) {
        this.shopName = arg1;
        return this;
    }

    private void validateConfigField(StringBuilder arg1, String arg2, String arg3) {
        if(this.isEmptyString(arg3)) {
            arg1.append(System.lineSeparator());
            arg1.append(arg2);
        }
    }
}

