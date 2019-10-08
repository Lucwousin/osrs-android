package com.google.android.gms.internal.firebase_messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;

public final class zzo implements zzw {
    private final Context zzac;

    public zzo(Context arg1) {
        super();
        this.zzac = arg1;
    }

    @TargetApi(value=26) @Nullable public final String zzat() {
        if(!PlatformVersion.isAtLeastO()) {
            return null;
        }

        Object v0 = this.zzac.getSystemService(NotificationManager.class);
        String v1 = "fcm_fallback_notification_channel";
        int v3 = 1;
        if(!PlatformVersion.isAtLeastO()) {
        }
        else {
            if(!TextUtils.isEmpty(((CharSequence)v1)) && ((NotificationManager)v0).getNotificationChannel(v1) != null) {
                goto label_18;
            }

            v3 = 0;
        }

    label_18:
        if(v3 == 0) {
            this.zzac.getSystemService(NotificationManager.class).createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", this.zzac.getString(this.zzac.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", this.zzac.getPackageName())), 3));
        }

        return "fcm_fallback_notification_channel";
    }
}

