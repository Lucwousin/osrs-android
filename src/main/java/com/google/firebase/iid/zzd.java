package com.google.firebase.iid;

import android.content.BroadcastReceiver$PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzd {
    final Intent intent;
    private final BroadcastReceiver$PendingResult zzu;
    private boolean zzv;
    private final ScheduledFuture zzw;

    zzd(Intent arg3, BroadcastReceiver$PendingResult arg4, ScheduledExecutorService arg5) {
        super();
        this.zzv = false;
        this.intent = arg3;
        this.zzu = arg4;
        this.zzw = arg5.schedule(new zze(this, arg3), 9000, TimeUnit.MILLISECONDS);
    }

    final void finish() {
        __monitor_enter(this);
        try {
            if(!this.zzv) {
                this.zzu.finish();
                this.zzw.cancel(false);
                this.zzv = true;
            }
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }
}

