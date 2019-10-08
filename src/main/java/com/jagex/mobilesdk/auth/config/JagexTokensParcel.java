package com.jagex.mobilesdk.auth.config;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class JagexTokensParcel implements Parcelable {
    final class com.jagex.mobilesdk.auth.config.JagexTokensParcel$1 implements Parcelable$Creator {
        com.jagex.mobilesdk.auth.config.JagexTokensParcel$1() {
            super();
        }

        public JagexTokensParcel createFromParcel(Parcel arg2) {
            return new JagexTokensParcel(arg2);
        }

        public Object createFromParcel(Parcel arg1) {
            return this.createFromParcel(arg1);
        }

        public JagexTokensParcel[] newArray(int arg1) {
            return new JagexTokensParcel[arg1];
        }

        public Object[] newArray(int arg1) {
            return this.newArray(arg1);
        }
    }

    private static final String ACCESS_TOKEN = "accessToken";
    public static final Parcelable$Creator CREATOR = null;
    private static final String EXPIRES_IN = "expiresIn";
    private static final String REFRESH_TOKEN = "refreshToken";
    private final String accessToken;
    private final long expiresIn;
    private final String refreshToken;

    static {
        JagexTokensParcel.CREATOR = new com.jagex.mobilesdk.auth.config.JagexTokensParcel$1();
    }

    protected JagexTokensParcel(Parcel arg3) {
        super();
        Bundle v3 = arg3.readBundle(this.getClass().getClassLoader());
        this.accessToken = v3.getString("accessToken");
        this.refreshToken = v3.getString("refreshToken");
        this.expiresIn = v3.getLong("expiresIn");
    }

    public JagexTokensParcel(@NonNull String arg1, @NonNull String arg2, @NonNull long arg3) {
        super();
        this.accessToken = arg1;
        this.refreshToken = arg2;
        this.expiresIn = arg3;
    }

    public int describeContents() {
        return 0;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getExpiresIn() {
        return this.expiresIn;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public void writeToParcel(Parcel arg4, int arg5) {
        Bundle v5 = new Bundle();
        v5.putString("accessToken", this.accessToken);
        v5.putString("refreshToken", this.refreshToken);
        v5.putLong("expiresIn", this.expiresIn);
        arg4.writeBundle(v5);
    }
}

