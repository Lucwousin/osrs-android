package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Iterator;

public class MultipleInstallBroadcastReceiver extends BroadcastReceiver {
    public MultipleInstallBroadcastReceiver() {
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
            if(("AppsFlyer_Test".equals(v1_1)) && arg7.getStringExtra("TestIntegrationMode") != null) {
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
        AFLogger.afInfoLog("MultipleInstallBroadcastReceiver called");
        AppsFlyerLib.getInstance().ॱ(arg6, arg7);
        Iterator v0_1 = arg6.getPackageManager().queryBroadcastReceivers(new Intent("com.android.vending.INSTALL_REFERRER"), 0).iterator();
        while(v0_1.hasNext()) {
            Object v1_2 = v0_1.next();
            String v2 = arg7.getAction();
            if(!((ResolveInfo)v1_2).activityInfo.packageName.equals(arg6.getPackageName())) {
                continue;
            }

            if(!"com.android.vending.INSTALL_REFERRER".equals(v2)) {
                continue;
            }

            if(this.getClass().getName().equals(((ResolveInfo)v1_2).activityInfo.name)) {
                continue;
            }

            StringBuilder v2_1 = new StringBuilder("trigger onReceive: class: ");
            v2_1.append(((ResolveInfo)v1_2).activityInfo.name);
            AFLogger.afInfoLog(v2_1.toString());
            try {
                Class.forName(((ResolveInfo)v1_2).activityInfo.name).newInstance().onReceive(arg6, arg7);
            }
            catch(Throwable v2_2) {
                StringBuilder v3 = new StringBuilder("error in BroadcastReceiver ");
                v3.append(((ResolveInfo)v1_2).activityInfo.name);
                AFLogger.afErrorLog(v3.toString(), v2_2);
            }
        }
    }
}

