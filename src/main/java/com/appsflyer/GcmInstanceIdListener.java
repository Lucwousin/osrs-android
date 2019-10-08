package com.appsflyer;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.iid.InstanceID;
import com.google.android.gms.iid.InstanceIDListenerService;

public class GcmInstanceIdListener extends InstanceIDListenerService {
    public GcmInstanceIdListener() {
        super();
    }

    public void onTokenRefresh() {
        super.onTokenRefresh();
        String v0 = AppsFlyerProperties.getInstance().getString("gcmProjectNumber");
        long v1 = System.currentTimeMillis();
        Bundle v3 = null;
        try {
            v0 = InstanceID.getInstance(((Context)this).getApplicationContext()).getToken(v0, "GCM", v3);
        }
        catch(Throwable v0_1) {
            AFLogger.afErrorLog("Error registering for uninstall tracking", v0_1);
            v0 = ((String)v3);
        }

        if(v0 != null) {
            AFLogger.afInfoLog("GCM Refreshed Token = ".concat(String.valueOf(v0)));
            b v3_1 = b.ˏ(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
            b v4 = new b(v1, v0);
            if(v3_1.ॱ(v4)) {
                y.ॱ(((Context)this).getApplicationContext(), v4);
            }
        }
    }
}

