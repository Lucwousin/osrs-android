package com.google.android.gms.internal.firebase_messaging;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzp implements zzy {
    private final Context zzac;
    private static final AtomicInteger zzel;
    private final Bundle zzem;
    private final boolean zzen;

    static {
        zzp.zzel = new AtomicInteger(((int)SystemClock.elapsedRealtime()));
    }

    public zzp(Context arg2, Bundle arg3) {
        super();
        this.zzac = arg2;
        this.zzem = arg3;
        boolean v2 = arg3 == null || !"1".equals(arg3.getString("google.c.a.e")) ? false : true;
        this.zzen = v2;
    }

    private static PendingIntent zza(Context arg3, int arg4, Intent arg5) {
        return PendingIntent.getBroadcast(arg3, arg4, new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(arg3, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", ((Parcelable)arg5)), 0x40000000);
    }

    @Nullable public final PendingIntent zzau() {
        if(!this.zzen) {
            return null;
        }

        return zzp.zza(this.zzac, zzp.zzel.incrementAndGet(), new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(zzp.zzh(this.zzem)));
    }

    public final PendingIntent zze(Intent arg4) {
        PendingIntent v4 = PendingIntent.getActivity(this.zzac, zzp.zzel.incrementAndGet(), arg4, 0x40000000);
        if(!this.zzen) {
            return v4;
        }

        return zzp.zza(this.zzac, zzp.zzel.incrementAndGet(), new Intent("com.google.firebase.messaging.NOTIFICATION_OPEN").putExtras(zzp.zzh(this.zzem)).putExtra("pending_intent", ((Parcelable)v4)));
    }

    private static Bundle zzh(Bundle arg4) {
        Bundle v0 = new Bundle();
        Iterator v1 = arg4.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            if(!((String)v2).startsWith("google.c.a.") && !((String)v2).equals("from")) {
                continue;
            }

            v0.putString(((String)v2), arg4.getString(((String)v2)));
        }

        return v0;
    }
}

