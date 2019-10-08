package com.jagex.mobilesdk.federatedLogin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions$Builder;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.AuthMessage;
import com.jagex.mobilesdk.auth.JagexCompatActivity;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.federatedLogin.comms.FederatedComms$PerformFederatedCallback;
import com.jagex.mobilesdk.federatedLogin.comms.FederatedComms;
import com.jagex.mobilesdk.federatedLogin.model.FederatedLoginRequest;
import com.jagex.mobilesdk.federatedLogin.model.FederatedLoginResponse;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;
import java.util.HashMap;
import java.util.Map;

public class FederatedLoginActivity extends JagexCompatActivity {
    public static final String DOB_SCOPE = "https://www.googleapis.com/auth/user.birthday.read";
    private String googleClientID;
    public static final String googleEndpoint = "/google/v1/login/silent";
    private GoogleSignInClient googleSignInClient;
    private String issuerURL;
    private String packageId;

    public FederatedLoginActivity() {
        super();
    }

    static void access$000(FederatedLoginActivity arg0, int arg1, Intent arg2) {
        arg0.finish(arg1, arg2);
    }

    static void access$100(FederatedLoginActivity arg0, int arg1, String arg2, Exception arg3) {
        arg0.finishWithError(arg1, arg2, arg3);
    }

    static void access$200(FederatedLoginActivity arg0, int arg1, String arg2, Exception arg3) {
        arg0.finishWithError(arg1, arg2, arg3);
    }

    private void handleGoogleLoginResult(String arg5, String arg6) {
        StringBuilder v0 = new StringBuilder(this.issuerURL);
        v0.append("/google/v1/login/silent");
        String v0_1 = v0.toString();
        HashMap v1 = new HashMap();
        ((Map)v1).put("Content-Type", "application/hal+json");
        ((Map)v1).put("Accept", "application/json");
        new FederatedComms(v0_1, ((Map)v1), new FederatedLoginRequest(arg5, arg6, this.packageId), new PerformFederatedCallback() {
            public void onFederatedLoginResult(CommsResult arg3, Exception arg4) {
                if(arg3 != null && arg3.responseCode == 200) {
                    try {
                        Object v3_1 = arg3.getResultValue();
                        MobileAttributionService.setUserID(((FederatedLoginResponse)v3_1).getRunescapeAccountId());
                        Intent v4 = new Intent();
                        v4.putExtra(FederatedLoginService.EXTRA_ONE_TIME_LOGIN_TOKEN, ((FederatedLoginResponse)v3_1).getOneTimeLoginToken());
                        FederatedLoginActivity.this.finish(0, v4);
                        return;
                    }
                    catch(Exception v3) {
                        FederatedLoginActivity.this.finishWithError(1401, AuthMessage.ACTION_AUTH_ERROR.getMessage(), v3);
                        return;
                    }
                }

                FederatedLoginActivity.this.finishWithError(1403, AuthMessage.JAGEX_ACCESS_ERROR.getMessage(), arg4);
            }
        }).execute(new Void[0]);
    }

    protected void onActivityResult(int arg1, int arg2, Intent arg3) {
        super.onActivityResult(arg1, arg2, arg3);
        Task v1 = GoogleSignIn.getSignedInAccountFromIntent(arg3);
        try {
            Object v1_2 = v1.getResult(ApiException.class);
            String v2 = ((GoogleSignInAccount)v1_2).getServerAuthCode();
            String v1_3 = ((GoogleSignInAccount)v1_2).getId();
            this.googleSignInClient.signOut();
            this.handleGoogleLoginResult(v2, v1_3);
        }
        catch(ApiException v1_1) {
            int v3 = 1401;
            switch(v1_1.getStatusCode()) {
                case 12500: {
                    goto label_23;
                }
                case 12501: {
                    goto label_18;
                }
            }

            this.finishWithError(v3, AuthMessage.FEDERATED_LOGIN_ACTIVITY_ERROR.getMessage(), ((Exception)v1_1));
            return;
        label_18:
            this.finishWithError(1402, AuthMessage.GENERIC_AUTH_ERROR.getMessage(), ((Exception)v1_1));
            return;
        label_23:
            this.finishWithError(v3, AuthMessage.FEDERATED_LOGIN_AUTH_ERROR.getMessage(), ((Exception)v1_1));
        }
    }

    protected void onCreate(Bundle arg2) {
        super.onCreate(arg2);
        Parcelable v2 = this.getIntent().getParcelableExtra(FederatedLoginService.EXTRA_FEDERATED_LOGIN_CONFIG);
        this.googleClientID = ((FederatedLoginParcel)v2).getGoogleClientId();
        this.packageId = ((FederatedLoginParcel)v2).getPackageId();
        this.issuerURL = ((FederatedLoginParcel)v2).getIssuerURL();
        SecurityProviderUpdate.ProviderUpdate(((Activity)this));
        this.performGoogleLogin();
    }

    private void performGoogleLogin() {
        this.googleSignInClient = GoogleSignIn.getClient(((Activity)this), new Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestScopes(new Scope("https://www.googleapis.com/auth/user.birthday.read"), new Scope[0]).requestServerAuthCode(this.googleClientID).build());
        this.startActivityForResult(this.googleSignInClient.getSignInIntent(), 2205);
    }
}

