package com.appsflyer;

import android.content.Context;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FirebaseInstanceIdListener extends FirebaseInstanceIdService {
    public FirebaseInstanceIdListener() {
        super();
    }

    public void onTokenRefresh() {
        String v2_1;
        super.onTokenRefresh();
        long v0 = System.currentTimeMillis();
        try {
            v2_1 = FirebaseInstanceId.getInstance().getToken();
        }
        catch(Throwable v2) {
            AFLogger.afErrorLog("Error registering for uninstall tracking", v2);
            v2_1 = null;
        }

        if(v2_1 != null) {
            AFLogger.afInfoLog("Firebase Refreshed Token = ".concat(String.valueOf(v2_1)));
            b v3 = b.ˏ(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            b v4 = new b(v0, v2_1);
            if(v3.ॱ(v4)) {
                y.ॱ(((Context)this).getApplicationContext(), v4);
            }
        }
    }
}

