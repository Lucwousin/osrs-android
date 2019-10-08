package com.google.firebase.iid;

import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

final class zzq implements EventHandler {
    private final zza zzbi;

    zzq(zza arg1) {
        super();
        this.zzbi = arg1;
    }

    public final void handle(Event arg2) {
        zza v2 = this.zzbi;
        __monitor_enter(v2);
        try {
            if(v2.isEnabled()) {
                FirebaseInstanceId.zzb(v2.zzbh);
            }

            __monitor_exit(v2);
            return;
        label_9:
            __monitor_exit(v2);
        }
        catch(Throwable v0) {
            goto label_9;
        }

        throw v0;
    }
}

