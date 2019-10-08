package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zzb implements Runnable {
    zzb(zza arg1, LifecycleCallback arg2, String arg3) {
        this.zzbj = arg1;
        this.zzbh = arg2;
        this.zzbi = arg3;
        super();
    }

    public final void run() {
        if(zza.zza(this.zzbj) > 0) {
            LifecycleCallback v0 = this.zzbh;
            Bundle v1 = zza.zzb(this.zzbj) != null ? zza.zzb(this.zzbj).getBundle(this.zzbi) : null;
            v0.onCreate(v1);
        }

        if(zza.zza(this.zzbj) >= 2) {
            this.zzbh.onStart();
        }

        if(zza.zza(this.zzbj) >= 3) {
            this.zzbh.onResume();
        }

        if(zza.zza(this.zzbj) >= 4) {
            this.zzbh.onStop();
        }

        if(zza.zza(this.zzbj) >= 5) {
            this.zzbh.onDestroy();
        }
    }
}

