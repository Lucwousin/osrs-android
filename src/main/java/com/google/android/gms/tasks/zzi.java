package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class zzi implements zzq {
    private final Object mLock;
    private final Executor zzd;
    @GuardedBy(value="mLock") private OnCompleteListener zzl;

    public zzi(@NonNull Executor arg2, @NonNull OnCompleteListener arg3) {
        super();
        this.mLock = new Object();
        this.zzd = arg2;
        this.zzl = arg3;
    }

    public final void cancel() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        OnCompleteListener v1 = null;
        try {
            this.zzl = v1;
            __monitor_exit(v0);
            return;
        label_7:
            __monitor_exit(v0);
        }
        catch(Throwable v1_1) {
            goto label_7;
        }

        throw v1_1;
    }

    public final void onComplete(@NonNull Task arg3) {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zzl == null) {
                __monitor_exit(v0);
                return;
            }

            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            try {
            label_13:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_13;
            }

            throw v3;
        }

        this.zzd.execute(new zzj(this, arg3));
    }

    static Object zza(zzi arg0) {
        return arg0.mLock;
    }

    static OnCompleteListener zzb(zzi arg0) {
        return arg0.zzl;
    }
}

