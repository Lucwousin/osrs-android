package com.jagex.mobilesdk.federatedLogin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.jagex.mobilesdk.auth.config.JagexConfig;

public class FederatedLoginService {
    public static final String EXTRA_FEDERATED_LOGIN_CONFIG;
    public static final String EXTRA_ONE_TIME_LOGIN_TOKEN;
    private static final String PACKAGE_NAME;
    private final JagexConfig config;
    private final String googleClientID;
    private final String packageId;

    static {
        FederatedLoginService.PACKAGE_NAME = FederatedLoginService.class.getPackage().getName();
        FederatedLoginService.EXTRA_ONE_TIME_LOGIN_TOKEN = FederatedLoginService.PACKAGE_NAME + ".ONE_TIME_LOGIN_TOKEN";
        FederatedLoginService.EXTRA_FEDERATED_LOGIN_CONFIG = FederatedLoginService.PACKAGE_NAME + ".CONFIG";
    }

    public FederatedLoginService(@NonNull JagexConfig arg1, String arg2, String arg3) {
        super();
        this.config = arg1;
        this.googleClientID = arg2;
        this.packageId = arg3;
    }

    public void authenticateWithGooglePlay(@NonNull Activity arg7) {
        arg7.startActivityForResult(new Intent(((Context)arg7), FederatedLoginActivity.class).putExtra(FederatedLoginService.EXTRA_FEDERATED_LOGIN_CONFIG, new FederatedLoginParcel(this.packageId, this.googleClientID, this.config.getIssuerUri())).addFlags(0x10000), 2205);
    }
}

