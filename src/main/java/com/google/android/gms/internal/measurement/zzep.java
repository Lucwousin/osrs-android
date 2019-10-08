package com.google.android.gms.internal.measurement;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;

abstract class zzep {
    private static volatile Handler handler;
    private final zzhk zzagz;
    private final Runnable zzyc;
    private volatile long zzyd;

    zzep(zzhk arg2) {
        super();
        Preconditions.checkNotNull(arg2);
        this.zzagz = arg2;
        this.zzyc = new zzeq(this, arg2);
    }

    final void cancel() {
        this.zzyd = 0;
        this.getHandler().removeCallbacks(this.zzyc);
    }

    private final Handler getHandler() {
        if(zzep.handler != null) {
            return zzep.handler;
        }

        Class v0 = zzep.class;
        __monitor_enter(v0);
        try {
            if(zzep.handler == null) {
                zzep.handler = new Handler(this.zzagz.getContext().getMainLooper());
            }

            __monitor_exit(v0);
            return zzep.handler;
        label_18:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_18;
        }

        throw v1;
    }

    public abstract void run();

    static long zza(zzep arg0, long arg1) {
        arg0.zzyd = 0;
        return 0;
    }

    public final boolean zzef() {
        if(this.zzyd != 0) {
            return 1;
        }

        return 0;
    }

    public final void zzh(long arg3) {
        this.cancel();
        if(arg3 >= 0) {
            this.zzyd = this.zzagz.zzbt().currentTimeMillis();
            if(!this.getHandler().postDelayed(this.zzyc, arg3)) {
                this.zzagz.zzgi().zziv().zzg("Failed to schedule delayed post. time", Long.valueOf(arg3));
            }
        }
    }
}

