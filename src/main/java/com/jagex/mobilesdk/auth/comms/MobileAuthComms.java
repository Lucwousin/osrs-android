package com.jagex.mobilesdk.auth.comms;

import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsUtils;
import java.util.HashMap;
import java.util.Map;

public class MobileAuthComms {
    public MobileAuthComms() {
        super();
    }

    public static void gameTokenComms(String arg3, MobileAuthState arg4, FetchGameTokenCallback arg5, boolean arg6) {
        HashMap v0 = new HashMap();
        ((Map)v0).put("Authorization", "Bearer " + arg4.getAccessToken());
        ((Map)v0).put("Content-Type", "application/x-www-form-urlencoded");
        ((Map)v0).put("Accept", "application/json");
        GameTokenComms v4 = new GameTokenComms(arg3, ((Map)v0), arg5);
        if(arg6) {
            v4.execute(new Void[0]);
        }
        else {
            v4.fetchGameTokenPostAction(v4.fetchGameTokenAction(arg3, ((Map)v0)), arg5);
        }
    }

    public static void logoutComms(String arg3, MobileAuthState arg4, JagexConfig arg5, PerformLogoutCallback arg6, boolean arg7) {
        HashMap v0 = new HashMap();
        HashMap v1 = new HashMap();
        ((Map)v0).put("Authorization", CommsUtils.basicAuthParam(arg5));
        ((Map)v0).put("Content-Type", "application/x-www-form-urlencoded");
        ((Map)v0).put("Accept", "application/json");
        ((Map)v1).put("token", arg4.getRefreshToken());
        ((Map)v1).put("token_type_hint", "refresh_token");
        LogoutComms v4 = new LogoutComms(arg3, ((Map)v0), ((Map)v1), arg6);
        if(arg7) {
            v4.execute(new Void[0]);
        }
        else {
            v4.logoutPostAction(v4.logoutAction(arg3, ((Map)v0), ((Map)v1)), arg6);
        }
    }

    public static void refreshTokenComms(String arg3, MobileAuthState arg4, JagexConfig arg5, RefreshTokenCallback arg6, boolean arg7) {
        HashMap v0 = new HashMap();
        ((Map)v0).put("Content-Type", "application/x-www-form-urlencoded");
        ((Map)v0).put("Accept", "application/json");
        ((Map)v0).put("Authorization", CommsUtils.basicAuthParam(arg5));
        HashMap v1 = new HashMap();
        ((Map)v1).put("refresh_token", arg4.getRefreshToken());
        ((Map)v1).put("scope", arg5.getScope());
        ((Map)v1).put("redirect_uri", arg5.getRedirectUri().toString());
        ((Map)v1).put("grant_type", "refresh_token");
        RefreshComms v4 = new RefreshComms(arg3, ((Map)v0), ((Map)v1), arg6);
        if(arg7) {
            v4.execute(new Void[0]);
        }
        else {
            v4.refreshTokenPostAction(v4.refreshTokenAction(arg3, ((Map)v0), ((Map)v1)), arg6);
        }
    }

    public static void shieldOAuth2Comms(String arg3, String arg4, String arg5, String arg6, String arg7, JagexConfig arg8, ShieldOAuth2Callback arg9, boolean arg10) {
        HashMap v0 = new HashMap();
        HashMap v1 = new HashMap();
        ((Map)v0).put("Authorization", CommsUtils.basicAuthParam(arg8));
        ((Map)v0).put("Content-Type", "application/x-www-form-urlencoded");
        ((Map)v0).put("Accept", "application/json");
        ((Map)v1).put("grant_type", arg4);
        ((Map)v1).put("token", arg5);
        ((Map)v1).put("redirTo", arg6);
        ((Map)v1).put("sig", arg7);
        ShieldOAuth2Comms v4 = new ShieldOAuth2Comms(arg3, ((Map)v0), ((Map)v1), arg9);
        if(arg10) {
            v4.execute(new Void[0]);
        }
        else {
            v4.shieldOAuth2PostAction(v4.shieldOAuth2Action(arg3, ((Map)v0), ((Map)v1)), arg9);
        }
    }
}

