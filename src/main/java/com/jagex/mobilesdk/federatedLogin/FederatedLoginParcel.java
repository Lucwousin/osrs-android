package com.jagex.mobilesdk.federatedLogin;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class FederatedLoginParcel implements Parcelable {
    final class com.jagex.mobilesdk.federatedLogin.FederatedLoginParcel$1 implements Parcelable$Creator {
        com.jagex.mobilesdk.federatedLogin.FederatedLoginParcel$1() {
            super();
        }

        public FederatedLoginParcel createFromParcel(Parcel arg2) {
            return new FederatedLoginParcel(arg2);
        }

        public Object createFromParcel(Parcel arg1) {
            return this.createFromParcel(arg1);
        }

        public FederatedLoginParcel[] newArray(int arg1) {
            return new FederatedLoginParcel[arg1];
        }

        public Object[] newArray(int arg1) {
            return this.newArray(arg1);
        }
    }

    public static final Parcelable$Creator CREATOR = null;
    private static final String GOOGLE_CLIENT_ID_KEY = "googleClientId";
    private static final String ISSUER_URL_KEY = "issuerURL";
    private static final String PACKAGE_ID_KEY = "packageId";
    private final String googleClientId;
    private final String issuerURL;
    private final String packageId;

    static {
        FederatedLoginParcel.CREATOR = new com.jagex.mobilesdk.federatedLogin.FederatedLoginParcel$1();
    }

    protected FederatedLoginParcel(Parcel arg2) {
        super();
        Bundle v2 = arg2.readBundle(this.getClass().getClassLoader());
        this.packageId = v2.getString("packageId");
        this.googleClientId = v2.getString("googleClientId");
        this.issuerURL = v2.getString("issuerURL");
    }

    public FederatedLoginParcel(@NonNull String arg1, @NonNull String arg2, @NonNull Uri arg3) {
        super();
        this.packageId = arg1;
        this.googleClientId = arg2;
        this.issuerURL = arg3.toString();
    }

    public int describeContents() {
        return 0;
    }

    public String getGoogleClientId() {
        return this.googleClientId;
    }

    public String getIssuerURL() {
        return this.issuerURL;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public void writeToParcel(Parcel arg3, int arg4) {
        Bundle v4 = new Bundle();
        v4.putString("packageId", this.packageId);
        v4.putString("googleClientId", this.googleClientId);
        v4.putString("issuerURL", this.issuerURL);
        arg3.writeBundle(v4);
    }
}

