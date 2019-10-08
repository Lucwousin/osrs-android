package com.google.android.gms.internal.firebase_messaging;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.core.app.NotificationCompat$Builder;

public final class zzr {
    @NonNull private final Context zzac;
    @NonNull private final zzz zzep;

    public zzr(@NonNull Context arg1, @NonNull zzz arg2) {
        super();
        this.zzac = arg1;
        this.zzep = arg2;
    }

    public final zzab zzax() {
        Builder v0 = new Builder(this.zzac, this.zzep.getChannelId());
        v0.setAutoCancel(true);
        v0.setContentTitle(this.zzep.getTitle());
        v0.setContentIntent(this.zzep.zzbh());
        v0.setSmallIcon(this.zzep.zzbj().intValue());
        PendingIntent v1 = this.zzep.zzbi();
        if(v1 != null) {
            v0.setDeleteIntent(v1);
        }

        Uri v1_1 = this.zzep.getSound();
        if(v1_1 != null) {
            v0.setSound(v1_1);
        }

        CharSequence v1_2 = this.zzep.zzbf();
        if(!TextUtils.isEmpty(v1_2)) {
            v0.setContentText(v1_2);
            v0.setStyle(new BigTextStyle().bigText(v1_2));
        }

        Integer v1_3 = this.zzep.zzbg();
        if(v1_3 != null) {
            v0.setColor(v1_3.intValue());
        }

        return new zzab(v0, this.zzep.getTag(), 0);
    }
}

