package com.google.firebase.iid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zza;
import com.google.android.gms.internal.firebase_messaging.zze;
import java.util.concurrent.ExecutorService;

public abstract class zzb extends Service {
    private final Object lock;
    @VisibleForTesting final ExecutorService zzn;
    private Binder zzo;
    private int zzp;
    private int zzq;

    public zzb() {
        super();
        zza v0 = com.google.android.gms.internal.firebase_messaging.zzb.zza();
        String v2 = "Firebase-";
        String v3 = String.valueOf(this.getClass().getSimpleName());
        v2 = v3.length() != 0 ? v2.concat(v3) : new String(v2);
        this.zzn = v0.zza(new NamedThreadFactory(v2), zze.zzd);
        this.lock = new Object();
        this.zzq = 0;
    }

    public final IBinder onBind(Intent arg2) {
        Binder v2_1;
        __monitor_enter(this);
        try {
            if(Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }

            if(this.zzo == null) {
                this.zzo = new zzf(this);
            }

            v2_1 = this.zzo;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return ((IBinder)v2_1);
    }

    public final int onStartCommand(Intent arg2, int arg3, int arg4) {
        Object v3 = this.lock;
        __monitor_enter(v3);
        try {
            this.zzp = arg4;
            ++this.zzq;
            __monitor_exit(v3);
        }
        catch(Throwable v2) {
            try {
            label_23:
                __monitor_exit(v3);
            }
            catch(Throwable v2) {
                goto label_23;
            }

            throw v2;
        }

        Intent v3_1 = this.zzb(arg2);
        arg4 = 2;
        if(v3_1 == null) {
            this.zza(arg2);
            return arg4;
        }

        if(this.zzc(v3_1)) {
            this.zza(arg2);
            return arg4;
        }

        this.zzn.execute(new zzc(this, v3_1, arg2));
        return 3;
    }

    private final void zza(Intent arg2) {
        if(arg2 != null) {
            WakefulBroadcastReceiver.completeWakefulIntent(arg2);
        }

        Object v2 = this.lock;
        __monitor_enter(v2);
        try {
            --this.zzq;
            if(this.zzq == 0) {
                this.stopSelfResult(this.zzp);
            }

            __monitor_exit(v2);
            return;
        label_14:
            __monitor_exit(v2);
        }
        catch(Throwable v0) {
            goto label_14;
        }

        throw v0;
    }

    static void zza(zzb arg0, Intent arg1) {
        arg0.zza(arg1);
    }

    protected Intent zzb(Intent arg1) {
        return arg1;
    }

    public boolean zzc(Intent arg1) {
        return 0;
    }

    public abstract void zzd(Intent arg1);
}

