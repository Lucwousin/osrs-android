package com.jagex.mobilesdk.auth;

import android.content.Context;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;

public class MobileAuthStateWriter {
    private static final String AUTHSTATE_ACCESS_TOKEN = "access_Token";
    private static final String AUTHSTATE_EXPIRYTIME = "token_expires";
    private static final String AUTHSTATE_REFRESH_TOKEN = "refresh_Token";
    private static final String AUTHSTATE_VERSION = "version";
    private static final String KEY_STATE = "state";
    private static final String STORE_NAME = "AuthState";
    private final SharedPreferences sharedPreferences;
    private final ReentrantLock sharedPreferencesLock;

    public MobileAuthStateWriter(@NonNull Context arg3) {
        super();
        this.sharedPreferences = arg3.getSharedPreferences("AuthState", 0);
        this.sharedPreferencesLock = new ReentrantLock();
    }

    private void clearAuthState(MobileAuthState arg3) {
        arg3.setAccessToken("");
        arg3.setAccessTokenExpiration(0);
        arg3.setRefreshToken("");
    }

    private MobileAuthState jsonDeserialize(String arg5) {
        MobileAuthState v0 = new MobileAuthState();
        try {
            JSONObject v1 = new JSONObject(arg5);
            if(AppAuthConverter.isAppAuthAuthState(v1).booleanValue()) {
                return AppAuthConverter.convertAuthState(v1);
            }

            v0.setAccessToken(v1.getString("access_Token"));
            v0.setAccessTokenExpiration(v1.getLong("token_expires"));
            v0.setRefreshToken(v1.getString("refresh_Token"));
        }
        catch(JSONException ) {
            this.clearAuthState(v0);
        }

        return v0;
    }

    private String jsonSerialize(MobileAuthState arg5) {
        JSONObject v0 = new JSONObject();
        try {
            v0.put("version", arg5.getVersion());
            v0.put("access_Token", arg5.getAccessToken());
            v0.put("token_expires", arg5.getAccessTokenExpiration());
            v0.put("refresh_Token", arg5.getRefreshToken());
        }
        catch(JSONException ) {
            this.clearAuthState(arg5);
        }

        return v0.toString();
    }

    public MobileAuthState loadAuthState() {
        MobileAuthState v0_1;
        this.sharedPreferencesLock.lock();
        try {
            v0_1 = this.jsonDeserialize(this.sharedPreferences.getString("state", null));
        }
        catch(Throwable v0) {
        }
        catch(Exception ) {
            try {
                v0_1 = new MobileAuthState();
            }
            catch(Throwable v0) {
                this.sharedPreferencesLock.unlock();
                throw v0;
            }
        }

        this.sharedPreferencesLock.unlock();
        return v0_1;
    }

    public void saveAuthState(MobileAuthState arg3) {
        this.sharedPreferencesLock.lock();
        try {
            SharedPreferences$Editor v0 = this.sharedPreferences.edit();
            if(arg3 == null) {
                v0.remove("state");
            }
            else {
                v0.putString("state", this.jsonSerialize(arg3));
            }

            if(!v0.commit()) {
                goto label_16;
            }
        }
        catch(Throwable v3) {
            goto label_22;
        }

        this.sharedPreferencesLock.unlock();
        return;
        try {
        label_16:
            throw new IllegalStateException("Failed to write state to shared prefs");
        }
        catch(Throwable v3) {
        label_22:
            this.sharedPreferencesLock.unlock();
            throw v3;
        }
    }
}

