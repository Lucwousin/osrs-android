package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.firebase_messaging.zzx;

final class zzb implements zzx {
    zzb(zza arg1, NotificationManager arg2) {
        this.zzds = arg2;
        super();
    }

    @TargetApi(value=26) public final boolean zzl(String arg3) {
        if(!PlatformVersion.isAtLeastO()) {
            return 1;
        }

        if(this.zzds.getNotificationChannel(arg3) != null) {
            return 1;
        }

        return 0;
    }
}

