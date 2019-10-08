package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    public SingleInstallBroadcastReceiver() {
        super();
    }

    public void onReceive(Context arg6, Intent arg7) {
        String v1_1;
        if(arg7 == null) {
            return;
        }

        String v0 = null;
        try {
            v1_1 = arg7.getStringExtra("referrer");
        }
        catch(Throwable v1) {
            AFLogger.afErrorLog("error in BroadcastReceiver ", v1);
            v1_1 = v0;
        }

        if(v1_1 != null) {
            if((v1_1.contains("AppsFlyer_Test")) && arg7.getStringExtra("TestIntegrationMode") != null) {
                AppsFlyerLib.getInstance().ॱ(arg6, arg7);
                return;
            }

            if(AppsFlyerLib.ˎ(arg6).getString("referrer", v0) == null) {
                goto label_27;
            }

            AppsFlyerLib.getInstance();
            AppsFlyerLib.ॱ(arg6, v1_1);
            return;
        }

    label_27:
        v0 = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
        long v1_2 = System.currentTimeMillis();
        if(v0 != null && v1_2 - Long.valueOf(v0).longValue() < 2000) {
            return;
        }

        AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
        AppsFlyerLib.getInstance().ॱ(arg6, arg7);
        AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
    }
}

