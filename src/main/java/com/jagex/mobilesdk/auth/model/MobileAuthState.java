package com.jagex.mobilesdk.auth.model;

public class MobileAuthState {
    private String accessToken;
    private long accessTokenExpiration;
    private String refreshToken;
    private final String version;

    public MobileAuthState() {
        super();
        this.version = "1.0";
    }

    public MobileAuthState(String arg2, String arg3, long arg4) {
        super();
        this.version = "1.0";
        this.accessToken = arg2;
        this.refreshToken = arg3;
        this.accessTokenExpiration = arg4;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public long getAccessTokenExpiration() {
        return this.accessTokenExpiration;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getVersion() {
        return "1.0";
    }

    public void setAccessToken(String arg1) {
        this.accessToken = arg1;
    }

    public void setAccessTokenExpiration(long arg1) {
        this.accessTokenExpiration = arg1;
    }

    public void setRefreshToken(String arg1) {
        this.refreshToken = arg1;
    }
}

