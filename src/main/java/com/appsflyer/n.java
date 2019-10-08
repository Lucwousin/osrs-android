package com.appsflyer;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings$Secure;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.Map;

final class n {
    final class e extends IllegalStateException {
        e(String arg1) {
            super(arg1);
        }
    }

    n() {
        super();
    }

    static void ˎ(Context arg9, Map arg10) {
        String v5_2;
        String v6;
        Info v5_1;
        int v1_1;
        AFLogger.afInfoLog("Trying to fetch GAID..");
        StringBuilder v0 = new StringBuilder();
        try {
            v1_1 = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(arg9);
        }
        catch(Throwable v1) {
            AFLogger.afErrorLog(v1.getMessage(), v1);
            v1_1 = -1;
        }

        String v2 = null;
        boolean v4 = false;
        try {
            Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient");
            v5_1 = AdvertisingIdClient.getAdvertisingIdInfo(arg9);
            if(v5_1 == null) {
                goto label_38;
            }

            v6 = v5_1.getId();
        }
        catch(Throwable v5) {
            goto label_45;
        }

        try {
            v5_2 = Boolean.toString(v5_1.isLimitAdTrackingEnabled() ^ 1);
            if(v6 == null) {
                goto label_32;
            }
        }
        catch(Throwable v5) {
            goto label_46;
        }

        try {
            if(v6.length() == 0) {
            label_32:
                v0.append("emptyOrNull |");
                goto label_34;
            label_27:
                v4 = true;
                String v8 = v5_2;
                v5 = v2_1;
                v2 = v8;
                goto label_46;
            }
        }
        catch(Throwable v2_1) {
            goto label_27;
        }

    label_34:
        v4 = true;
        goto label_93;
        try {
        label_38:
            v0.append("gpsAdInfo-null |");
            throw new e("GpsAdIndo is null");
        }
        catch(Throwable v5) {
        label_45:
            v6 = v2;
        }

    label_46:
        AFLogger.afErrorLog(v5.getMessage(), v5);
        v0.append(v5.getClass().getSimpleName());
        v0.append(" |");
        AFLogger.afInfoLog("WARNING: Google Play Services is missing.");
        if(AppsFlyerProperties.getInstance().getBoolean("enableGpsFallback", true)) {
            try {
                b v2_2 = f.ॱ(arg9);
                v6 = v2_2.ˊ();
                v5_2 = Boolean.toString(v2_2.ˏ() ^ 1);
                if(v6 != null && v6.length() != 0) {
                    goto label_93;
                }

                v0.append("emptyOrNull (bypass) |");
            }
            catch(Throwable v2_1) {
                AFLogger.afErrorLog(v2_1.getMessage(), v2_1);
                v0.append(v2_1.getClass().getSimpleName());
                v0.append(" |");
                v6 = AppsFlyerProperties.getInstance().getString("advertiserId");
                v5_2 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
                if(v2_1.getLocalizedMessage() != null) {
                    AFLogger.afInfoLog(v2_1.getLocalizedMessage());
                    goto label_93;
                }

                AFLogger.afInfoLog(v2_1.toString());
            }
        }
        else {
            v5_2 = v2;
        }

    label_93:
        if(arg9.getClass().getName().equals("android.app.ReceiverRestrictedContext")) {
            v6 = AppsFlyerProperties.getInstance().getString("advertiserId");
            v5_2 = AppsFlyerProperties.getInstance().getString("advertiserIdEnabled");
            v0.append("context = android.app.ReceiverRestrictedContext |");
        }

        if(v0.length() > 0) {
            arg10.put("gaidError", v1_1 + ": " + v0);
        }

        if(v6 != null && v5_2 != null) {
            arg10.put("advertiserId", v6);
            arg10.put("advertiserIdEnabled", v5_2);
            AppsFlyerProperties.getInstance().set("advertiserId", v6);
            AppsFlyerProperties.getInstance().set("advertiserIdEnabled", v5_2);
            arg10.put("isGaidWithGps", String.valueOf(v4));
        }
    }

    static l ॱ(ContentResolver arg3) {
        String v3_1;
        l v0 = null;
        if(arg3 == null) {
            return v0;
        }

        if(AppsFlyerProperties.getInstance().getString("amazon_aid") == null && ("Amazon".equals(Build.MANUFACTURER))) {
            int v2 = 2;
            int v1 = Settings$Secure.getInt(arg3, "limit_ad_tracking", v2);
            if(v1 == 0) {
                return new l(com.appsflyer.l$e.ˏ, Settings$Secure.getString(arg3, "advertising_id"), false);
            }

            if(v1 == v2) {
                return v0;
            }

            String v0_1 = "";
            try {
                v3_1 = Settings$Secure.getString(arg3, "advertising_id");
            }
            catch(Throwable v3) {
                AFLogger.afErrorLog("Couldn\'t fetch Amazon Advertising ID (Ad-Tracking is limited!)", v3);
                v3_1 = v0_1;
            }

            v0 = new l(com.appsflyer.l$e.ˏ, v3_1, true);
        }

        return v0;
    }
}

