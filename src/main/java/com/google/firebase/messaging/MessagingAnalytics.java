package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;

@KeepForSdk public class MessagingAnalytics {
    public MessagingAnalytics() {
        super();
    }

    @KeepForSdk public static void logNotificationDismiss(Intent arg1) {
        MessagingAnalytics.zza("_nd", arg1);
    }

    @KeepForSdk public static void logNotificationForeground(Intent arg1) {
        MessagingAnalytics.zza("_nf", arg1);
    }

    @KeepForSdk public static void logNotificationOpen(Intent arg5) {
        if(arg5 != null) {
            int v1 = 3;
            if("1".equals(arg5.getStringExtra("google.c.a.tc"))) {
                Object v0 = FirebaseApp.getInstance().get(AnalyticsConnector.class);
                if(Log.isLoggable("FirebaseMessaging", v1)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                }

                if(v0 != null) {
                    String v1_1 = arg5.getStringExtra("google.c.a.c_id");
                    ((AnalyticsConnector)v0).setUserProperty("fcm", "_ln", v1_1);
                    Bundle v2 = new Bundle();
                    v2.putString("source", "Firebase");
                    v2.putString("medium", "notification");
                    v2.putString("campaign", v1_1);
                    ((AnalyticsConnector)v0).logEvent("fcm", "_cmp", v2);
                    goto label_46;
                }

                Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            }
            else {
                if(!Log.isLoggable("FirebaseMessaging", v1)) {
                    goto label_46;
                }

                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
            }
        }

    label_46:
        MessagingAnalytics.zza("_no", arg5);
    }

    @KeepForSdk public static void logNotificationReceived(Intent arg1) {
        MessagingAnalytics.zza("_nr", arg1);
    }

    @KeepForSdk public static boolean shouldUploadMetrics(Intent arg3) {
        if(arg3 == null) {
            return 0;
        }

        if("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(arg3.getAction())) {
            return 0;
        }

        return "1".equals(arg3.getStringExtra("google.c.a.e"));
    }

    private static void zza(String arg4, Intent arg5) {
        Bundle v0 = new Bundle();
        String v1 = arg5.getStringExtra("google.c.a.c_id");
        if(v1 != null) {
            v0.putString("_nmid", v1);
        }

        v1 = arg5.getStringExtra("google.c.a.c_l");
        if(v1 != null) {
            v0.putString("_nmn", v1);
        }

        v1 = arg5.getStringExtra("google.c.a.m_l");
        if(!TextUtils.isEmpty(((CharSequence)v1))) {
            v0.putString("label", v1);
        }

        v1 = arg5.getStringExtra("google.c.a.m_c");
        if(!TextUtils.isEmpty(((CharSequence)v1))) {
            v0.putString("message_channel", v1);
        }

        v1 = arg5.getStringExtra("from");
        if(v1 == null || !v1.startsWith("/topics/")) {
            v1 = null;
        }
        else {
        }

        if(v1 != null) {
            v0.putString("_nt", v1);
        }

        if(arg5.hasExtra("google.c.a.ts")) {
            try {
                v0.putInt("_nmt", Integer.parseInt(arg5.getStringExtra("google.c.a.ts")));
            }
            catch(NumberFormatException v1_1) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", ((Throwable)v1_1));
            }
        }

        if(arg5.hasExtra("google.c.a.udt")) {
            try {
                v0.putInt("_ndt", Integer.parseInt(arg5.getStringExtra("google.c.a.udt")));
            }
            catch(NumberFormatException v5) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", ((Throwable)v5));
            }
        }

        if(Log.isLoggable("FirebaseMessaging", 3)) {
            v1 = String.valueOf(v0);
            StringBuilder v3 = new StringBuilder(String.valueOf(arg4).length() + 22 + String.valueOf(v1).length());
            v3.append("Sending event=");
            v3.append(arg4);
            v3.append(" params=");
            v3.append(v1);
            Log.d("FirebaseMessaging", v3.toString());
        }

        Object v5_1 = FirebaseApp.getInstance().get(AnalyticsConnector.class);
        if(v5_1 != null) {
            ((AnalyticsConnector)v5_1).logEvent("fcm", arg4, v0);
            return;
        }

        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }
}

