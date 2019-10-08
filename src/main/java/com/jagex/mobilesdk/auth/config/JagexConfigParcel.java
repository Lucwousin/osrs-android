package com.jagex.mobilesdk.auth.config;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.util.Objects;

public class JagexConfigParcel implements Parcelable {
    final class com.jagex.mobilesdk.auth.config.JagexConfigParcel$1 implements Parcelable$Creator {
        com.jagex.mobilesdk.auth.config.JagexConfigParcel$1() {
            super();
        }

        public JagexConfigParcel createFromParcel(Parcel arg2) {
            return new JagexConfigParcel(arg2);
        }

        public Object createFromParcel(Parcel arg1) {
            return this.createFromParcel(arg1);
        }

        public JagexConfigParcel[] newArray(int arg1) {
            return new JagexConfigParcel[arg1];
        }

        public Object[] newArray(int arg1) {
            return this.newArray(arg1);
        }
    }

    private static final String CLIENT_ID = "clientId";
    private static final String CLIENT_SECRET = "clientSecret";
    public static final Parcelable$Creator CREATOR = null;
    private static final String ISSUER_URI = "issuerUri";
    private static final String PAYMENT_URI = "paymentUri";
    private static final String REDIRECT_URI = "redirectUri";
    private static final String SCOPE = "scope";
    private static final String SHOP_NAME = "shopName";
    private final JagexConfig config;

    static {
        JagexConfigParcel.CREATOR = new com.jagex.mobilesdk.auth.config.JagexConfigParcel$1();
    }

    protected JagexConfigParcel(Parcel arg10) {
        super();
        Bundle v10 = arg10.readBundle(this.getClass().getClassLoader());
        this.config = new BasicJagexConfig(v10.getString("clientId"), v10.getString("clientSecret"), v10.getString("scope"), Uri.parse(v10.getString("redirectUri")), Uri.parse(v10.getString("issuerUri")), v10.getString("shopName"), v10.getString("paymentUri"));
    }

    public JagexConfigParcel(@NonNull JagexConfig arg1) {
        super();
        this.config = Objects.requireNonNull(arg1);
    }

    public int describeContents() {
        return 0;
    }

    public JagexConfig getConfig() {
        return this.config;
    }

    public void writeToParcel(Parcel arg3, int arg4) {
        Bundle v4 = new Bundle();
        v4.putString("clientId", this.config.getClientId());
        v4.putString("clientSecret", this.config.getClientSecret());
        v4.putString("scope", this.config.getScope());
        v4.putString("issuerUri", this.config.getIssuerUri().toString());
        v4.putString("redirectUri", this.config.getRedirectUri().toString());
        v4.putString("shopName", this.config.getShopName());
        v4.putString("paymentUri", this.config.getPaymentUri());
        arg3.writeBundle(v4);
    }
}

