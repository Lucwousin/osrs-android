package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class zzk implements zzq {
    private final Object mLock;
    private final Executor zzd;
    @GuardedBy(value="mLock") private OnFailureListener zzn;

    public zzk(@NonNull Executor arg2, @NonNull OnFailureListener arg3) {
        super();
        this.mLock = new Object();
        this.zzd = arg2;
        this.zzn = arg3;
    }

    public final void cancel() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        OnFailureListener v1 = null;
        try {
            this.zzn = v1;
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
        if(!arg3.isSuccessful() && !arg3.isCanceled()) {
            Object v0 = this.mLock;
            __monitor_enter(v0);
            try {
                if(this.zzn == null) {
                    __monitor_exit(v0);
                    return;
                }
                else {
                    __monitor_exit(v0);
                    goto label_11;
                }

                return;
            }
            catch(Throwable v3) {
                try {
                label_17:
                    __monitor_exit(v0);
                }
                catch(Throwable v3) {
                    goto label_17;
                }

                throw v3;
            }

        label_11:
            this.zzd.execute(new zzl(this, arg3));
        }
    }

    static Object zza(zzk arg0) {
        return arg0.mLock;
    }

    static OnFailureListener zzb(zzk arg0) {
        return arg0.zzn;
    }
}

