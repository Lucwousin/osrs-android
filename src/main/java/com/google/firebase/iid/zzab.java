package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase_messaging.zzb;
import com.google.android.gms.internal.firebase_messaging.zze;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

public final class zzab {
    private final Context zzac;
    @GuardedBy(value="MessengerIpcClient.class") private static zzab zzbx;
    private final ScheduledExecutorService zzby;
    @GuardedBy(value="this") private zzad zzbz;
    @GuardedBy(value="this") private int zzca;

    @VisibleForTesting private zzab(Context arg3, ScheduledExecutorService arg4) {
        super();
        this.zzbz = new zzad(this, null);
        this.zzca = 1;
        this.zzby = arg4;
        this.zzac = arg3.getApplicationContext();
    }

    static Context zza(zzab arg0) {
        return arg0.zzac;
    }

    private final Task zza(zzak arg5) {
        Task v5_1;
        __monitor_enter(this);
        try {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                String v1 = String.valueOf(arg5);
                StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 9);
                v3.append("Queueing ");
                v3.append(v1);
                Log.d("MessengerIpcClient", v3.toString());
            }

            if(!this.zzbz.zzb(arg5)) {
                this.zzbz = new zzad(this, null);
                this.zzbz.zzb(arg5);
            }

            v5_1 = arg5.zzck.getTask();
        }
        catch(Throwable v5) {
            __monitor_exit(this);
            throw v5;
        }

        __monitor_exit(this);
        return v5_1;
    }

    public final Task zza(int arg3, Bundle arg4) {
        return this.zza(new zzaj(this.zzx(), 2, arg4));
    }

    static ScheduledExecutorService zzb(zzab arg0) {
        return arg0.zzby;
    }

    public final Task zzb(int arg3, Bundle arg4) {
        return this.zza(new zzam(this.zzx(), 1, arg4));
    }

    public static zzab zzc(Context arg6) {
        zzab v6_1;
        Class v0 = zzab.class;
        __monitor_enter(v0);
        try {
            if(zzab.zzbx == null) {
                zzab.zzbx = new zzab(arg6, zzb.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), zze.zzd));
            }

            v6_1 = zzab.zzbx;
        }
        catch(Throwable v6) {
            __monitor_exit(v0);
            throw v6;
        }

        __monitor_exit(v0);
        return v6_1;
    }

    private final int zzx() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.zzca;
            this.zzca = v0_1 + 1;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }
}

