package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.google.android.gms.iid.InstanceIDListenerService;
import com.google.firebase.iid.FirebaseInstanceIdService;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class y {
    final class a extends AsyncTask {
        private String ˊ;
        private final WeakReference ˏ;

        a(WeakReference arg1) {
            super();
            this.ˏ = arg1;
        }

        protected final Object doInBackground(Object[] arg1) {
            return this.ˋ();
        }

        protected final void onPostExecute(Object arg3) {
            if(!TextUtils.isEmpty(((CharSequence)arg3))) {
                String v0 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
                b v1 = new b(((String)arg3));
                if(v0 == null) {
                    y.ॱ(this.ˏ.get(), v1);
                    return;
                }
                else {
                    b v3 = b.ˏ(v0);
                    if(v3.ॱ(v1)) {
                        y.ॱ(this.ˏ.get(), v3);
                    }
                }
            }
        }

        protected final void onPreExecute() {
            super.onPreExecute();
            this.ˊ = AppsFlyerProperties.getInstance().getString("gcmProjectNumber");
        }

        private String ˋ() {
            String v0 = null;
            try {
                if(this.ˊ != null) {
                    v0 = y.ˋ(this.ˏ, this.ˊ);
                }
            }
            catch(Throwable v1) {
                AFLogger.afErrorLog("Error registering for uninstall feature", v1);
                return v0;
            }

            return v0;
        }
    }

    y() {
        super();
    }

    private static String ˊ(WeakReference arg8, String arg9) {
        Object v8_1;
        String v0 = null;
        try {
            Class v1 = Class.forName("com.google.android.gms.iid.InstanceID");
            Class.forName("com.google.android.gms.gcm.GcmReceiver");
            v8_1 = v1.getDeclaredMethod("getToken", String.class, String.class).invoke(v1.getDeclaredMethod("getInstance", Context.class).invoke(v1, ((Reference)arg8).get()), arg9, "GCM");
            if(v8_1 != null) {
                goto label_33;
            }

            AFLogger.afWarnLog("Couldn\'t get token using reflection.");
            return v0;
        }
        catch(ClassNotFoundException ) {
            return v0;
        }
        catch(Throwable v8) {
            AFLogger.afErrorLog("Couldn\'t get token using GoogleCloudMessaging. ", v8);
            return v0;
        }

    label_33:
        return ((String)v8_1);
    }

    static String ˋ(WeakReference arg0, String arg1) {
        return y.ˊ(arg0, arg1);
    }

    static boolean ˋ(Context arg1) {
        return y.ॱ(arg1) | y.ˎ(arg1);
    }

    private static boolean ˎ(Context arg6) {
        if(AppsFlyerLib.getInstance().isTrackingStopped()) {
            return 0;
        }

        try {
            Class.forName("com.google.android.gms.iid.InstanceIDListenerService");
            Uri v4 = null;
            Intent v0 = new Intent("com.google.android.gms.iid.InstanceID", v4, arg6, GcmInstanceIdListener.class);
            Intent v2 = new Intent("com.google.android.gms.iid.InstanceID", v4, arg6, InstanceIDListenerService.class);
            int v0_1 = arg6.getPackageManager().queryIntentServices(v0, 0).size() > 0 ? 1 : 0;
            if(v0_1 == 0) {
                v0_1 = arg6.getPackageManager().queryIntentServices(v2, 0).size() > 0 ? 1 : 0;
                if(v0_1 == 0) {
                    return 0;
                }
            }

            v0_1 = arg6.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.c2dm.intent.RECEIVE", v4, arg6, Class.forName("com.google.android.gms.gcm.GcmReceiver")), 0).size() > 0 ? 1 : 0;
            if(v0_1 != 0) {
                String v0_2 = arg6.getPackageName();
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append(v0_2);
                v2_1.append(".permission.C2D_MESSAGE");
                if(com.appsflyer.AFExecutor$3$5.ˋ(arg6, v2_1.toString())) {
                    return 1;
                }

                AFLogger.afWarnLog("Cannot verify existence of the app\'s \"permission.C2D_MESSAGE\" permission in the manifest. Please refer to documentation.");
                return 0;
            }

            AFLogger.afWarnLog("Cannot verify existence of GcmReceiver receiver in the manifest. Please refer to documentation.");
        }
        catch(Throwable v6) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", v6);
        }
        catch(ClassNotFoundException v6_1) {
            AFLogger.afRDLog(((Throwable)v6_1).getMessage());
        }

        return 0;
    }

    static void ॱ(Context arg4, b arg5) {
        StringBuilder v0 = new StringBuilder("updateServerUninstallToken called with: ");
        v0.append(arg5.toString());
        AFLogger.afInfoLog(v0.toString());
        b v0_1 = b.ˏ(AppsFlyerProperties.getInstance().getString("afUninstallToken"));
        if((AppsFlyerLib.ˎ(arg4).getBoolean("sentRegisterRequestToAF", false)) && v0_1.ˋ() != null && (v0_1.ˋ().equals(arg5.ˋ()))) {
            return;
        }

        AppsFlyerProperties.getInstance().set("afUninstallToken", arg5.toString());
        AppsFlyerLib.getInstance().ˎ(arg4, arg5.ˋ());
    }

    private static boolean ॱ(Context arg6) {
        if(AppsFlyerLib.getInstance().isTrackingStopped()) {
            return 0;
        }

        try {
            Class.forName("com.google.firebase.iid.FirebaseInstanceIdService");
            Intent v0 = new Intent("com.google.firebase.INSTANCE_ID_EVENT", null, arg6, FirebaseInstanceIdListener.class);
            Intent v2 = new Intent("com.google.firebase.INSTANCE_ID_EVENT", null, arg6, FirebaseInstanceIdService.class);
            int v0_1 = arg6.getPackageManager().queryIntentServices(v0, 0).size() > 0 ? 1 : 0;
            if(v0_1 == 0) {
                int v6_1 = arg6.getPackageManager().queryIntentServices(v2, 0).size() > 0 ? 1 : 0;
                if(v6_1 != 0) {
                    return 1;
                }

                AFLogger.afWarnLog("Cannot verify existence of our InstanceID Listener Service in the manifest. Please refer to documentation.");
                return 0;
            }
        }
        catch(ClassNotFoundException ) {
            return 0;
        }
        catch(Throwable v6) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest declarations: ", v6);
            return 0;
        }

        return 1;
    }
}

