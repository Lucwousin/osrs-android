package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

final class zzr {
    private final Object mLock;
    @GuardedBy(value="mLock") private Queue zzt;
    @GuardedBy(value="mLock") private boolean zzu;

    zzr() {
        super();
        this.mLock = new Object();
    }

    public final void zza(@NonNull Task arg3) {
        Object v1;
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zzt != null) {
                if(this.zzu) {
                }
                else {
                    this.zzu = true;
                    __monitor_exit(v0);
                    goto label_10;
                }
            }

            goto label_25;
        }
        catch(Throwable v3) {
            goto label_28;
        }

        while(true) {
        label_10:
            v1 = this.mLock;
            __monitor_enter(v1);
            try {
                v0 = this.zzt.poll();
                if(v0 == null) {
                    this.zzu = false;
                    __monitor_exit(v1);
                    return;
                }
                else {
                    __monitor_exit(v1);
                    goto label_20;
                }

                goto label_25;
            }
            catch(Throwable v3) {
                break;
            }

        label_20:
            ((zzq)v0).onComplete(arg3);
        }

        try {
        label_23:
            __monitor_exit(v1);
        }
        catch(Throwable v3) {
            goto label_23;
        }

        throw v3;
        try {
        label_25:
            __monitor_exit(v0);
            return;
        label_28:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_28;
        }

        throw v3;
    }

    public final void zza(@NonNull zzq arg3) {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zzt == null) {
                this.zzt = new ArrayDeque();
            }

            this.zzt.add(arg3);
            __monitor_exit(v0);
            return;
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_12;
        }

        throw v3;
    }
}

