package com.jagex.mobilesdk.auth;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.comms.GameTokenComms$FetchGameTokenCallback;
import com.jagex.mobilesdk.auth.comms.LogoutComms$PerformLogoutCallback;
import com.jagex.mobilesdk.auth.comms.MobileAuthComms;
import com.jagex.mobilesdk.auth.comms.RefreshComms$RefreshTokenCallback;
import com.jagex.mobilesdk.auth.comms.ShieldOAuth2Comms$ShieldOAuth2Callback;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.model.MobileAuthState;
import com.jagex.mobilesdk.common.comms.CommsResult;

public class MobileAuthStateManager {
    public interface AuthManagerAction {
        void execute(@Nullable String arg1, @Nullable Exception arg2);
    }

    private static final String ENDPOINT_GAME_TOKEN = "/public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play";
    private static final String ENDPOINT_REVOKE = "/shield/oauth/revoke";
    private static final String ENDPOINT_TOKEN = "/shield/oauth/token";
    private static final int EXPIRY_TIME_TOLERANCE_MS = 60000;
    private final JagexConfig jagexConfig;
    private MobileAuthState mobileAuthState;
    private final MobileAuthStateWriter mobileAuthStateWriter;
    private static volatile MobileAuthStateManager singleInstance;

    private MobileAuthStateManager(MobileAuthStateWriter arg1, JagexConfig arg2) {
        super();
        this.mobileAuthStateWriter = arg1;
        this.jagexConfig = arg2;
        this.mobileAuthState = this.mobileAuthStateWriter.loadAuthState();
    }

    static MobileAuthState access$000(MobileAuthStateManager arg0) {
        return arg0.mobileAuthState;
    }

    static MobileAuthStateWriter access$100(MobileAuthStateManager arg0) {
        return arg0.mobileAuthStateWriter;
    }

    public void clearAuthState() {
        this.mobileAuthState = new MobileAuthState();
        this.mobileAuthStateWriter.saveAuthState(this.mobileAuthState);
    }

    public MobileAuthState getAuthState() {
        return this.mobileAuthState;
    }

    public static MobileAuthStateManager getInstance(@NonNull MobileAuthStateWriter arg2, @NonNull JagexConfig arg3) {
        if(MobileAuthStateManager.singleInstance == null) {
            Class v0 = MobileAuthStateManager.class;
            __monitor_enter(v0);
            try {
                if(MobileAuthStateManager.singleInstance == null) {
                    MobileAuthStateManager.singleInstance = new MobileAuthStateManager(arg2, arg3);
                }

                __monitor_exit(v0);
                goto label_14;
            label_12:
                __monitor_exit(v0);
            }
            catch(Throwable v2) {
                goto label_12;
            }

            throw v2;
        }

    label_14:
        return MobileAuthStateManager.singleInstance;
    }

    private boolean isAuthStateFresh() {
        boolean v1 = false;
        if(!this.isUserAuthenticated()) {
            return 0;
        }

        if(this.mobileAuthState.getAccessTokenExpiration() == 0) {
            return 0;
        }

        if(this.mobileAuthState.getAccessTokenExpiration() > System.currentTimeMillis() + 60000) {
            v1 = true;
        }

        return v1;
    }

    public boolean isUserAuthenticated() {
        boolean v0 = this.mobileAuthState.getAccessToken() == null || (this.mobileAuthState.getAccessToken().equals("")) ? false : true;
        return v0;
    }

    public void logout(@NonNull MobileAuthServiceListener arg5) {
        MobileAuthComms.logoutComms(this.jagexConfig.getIssuerUri() + "/shield/oauth/revoke", this.mobileAuthState, this.jagexConfig, new PerformLogoutCallback(arg5) {
            public void onLogoutResult(CommsResult arg1, Exception arg2) {
                MobileAuthStateManager.this.clearAuthState();
                this.val$listener.onResult(arg1);
            }
        }, true);
    }

    public void performActionWithFreshTokens(Activity arg4, AuthManagerAction arg5) {
        if(this.isAuthStateFresh()) {
            arg4.runOnUiThread(new Runnable(arg5) {
                public void run() {
                    this.val$action.execute(MobileAuthStateManager.this.mobileAuthState.getAccessToken(), null);
                }
            });
        }
        else {
            MobileAuthComms.refreshTokenComms(this.jagexConfig.getIssuerUri() + "/shield/oauth/token", this.mobileAuthState, this.jagexConfig, new RefreshTokenCallback(arg5) {
                public void onTokenResult(String arg3, Long arg4, String arg5, Exception arg6) {
                    if(arg6 == null) {
                        MobileAuthStateManager.this.mobileAuthState.setAccessToken(arg3);
                        MobileAuthStateManager.this.mobileAuthState.setAccessTokenExpiration(arg4.longValue());
                        MobileAuthStateManager.this.mobileAuthState.setRefreshToken(arg5);
                        MobileAuthStateManager.this.mobileAuthStateWriter.saveAuthState(MobileAuthStateManager.this.mobileAuthState);
                        this.val$action.execute(arg3, null);
                    }
                    else {
                        MobileAuthStateManager.this.clearAuthState();
                        this.val$action.execute("", arg6);
                    }
                }
            }, true);
        }
    }

    public void requestGameToken(@NonNull MobileAuthServiceListener arg4) {
        MobileAuthComms.gameTokenComms(this.jagexConfig.getIssuerUri() + "/public/v1/games/YCfdbvr2pM1zUYMxJRexZY/play", this.mobileAuthState, new FetchGameTokenCallback(arg4) {
            public void onGameTokenResult(CommsResult arg1, Exception arg2) {
                this.val$listener.onResult(arg1);
            }
        }, true);
    }

    public void requestOAuth2Tokens(Activity arg12, String arg13, String arg14, String arg15, String arg16, @NonNull MobileAuthServiceListener arg17) {
        MobileAuthComms.shieldOAuth2Comms(this.jagexConfig.getIssuerUri() + "/shield/oauth/token", arg13, arg14, arg15, arg16, this.jagexConfig, new ShieldOAuth2Callback(arg12, arg17) {
            public void onShieldOAuth2Result(CommsResult arg3, Exception arg4) {
                if(arg3.responseCode == 0) {
                    MobileAuthStateManager.this.storeTokens(arg3.getResultValue());
                    MobileAttributionService.sendEvent(this.val$activity, "af_login", null);
                }

                this.val$listener.onResult(arg3);
            }
        }, true);
    }

    public void storeTokens(MobileAuthState arg2) {
        this.mobileAuthState = arg2;
        this.mobileAuthStateWriter.saveAuthState(this.mobileAuthState);
    }
}

