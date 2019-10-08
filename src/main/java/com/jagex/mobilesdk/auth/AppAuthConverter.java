package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.auth.model.MobileAuthState;
import org.json.JSONException;
import org.json.JSONObject;

public class AppAuthConverter {
    public static final String APPAUTH_ACCESS_TOKEN_KEY = "access_token";
    public static final String APPAUTH_EXPIRES_AT = "expires_at";
    public static final String APPAUTH_REFRESH_TOKEN_KEY = "refresh_token";
    public static final String LASTAUTHORIZATIONRESPONSE_KEY = "lastAuthorizationResponse";
    public static final String LASTTOKENRESPONSE_KEY = "mLastTokenResponse";

    public AppAuthConverter() {
        super();
    }

    public static MobileAuthState convertAuthState(JSONObject arg3) {
        MobileAuthState v0 = new MobileAuthState();
        try {
            arg3 = arg3.getJSONObject("mLastTokenResponse");
            v0.setAccessToken(arg3.getString("access_token"));
            v0.setAccessTokenExpiration(arg3.getLong("expires_at"));
            v0.setRefreshToken(arg3.getString("refresh_token"));
            return v0;
        }
        catch(JSONException ) {
            return new MobileAuthState();
        }
    }

    public static Boolean isAppAuthAuthState(JSONObject arg1) {
        boolean v1 = !arg1.has("lastAuthorizationResponse") || !arg1.has("mLastTokenResponse") ? false : true;
        return Boolean.valueOf(v1);
    }
}

