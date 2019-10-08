package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class zzd implements Runnable {
    zzd(zzc arg1, LifecycleCallback arg2, String arg3) {
        this.zzbk = arg1;
        this.zzbh = arg2;
        this.zzbi = arg3;
        super();
    }

    public final void run() {
        if(zzc.zza(this.zzbk) > 0) {
            LifecycleCallback v0 = this.zzbh;
            Bundle v1 = zzc.zzb(this.zzbk) != null ? zzc.zzb(this.zzbk).getBundle(this.zzbi) : null;
            v0.onCreate(v1);
        }

        if(zzc.zza(this.zzbk) >= 2) {
            this.zzbh.onStart();
        }

        if(zzc.zza(this.zzbk) >= 3) {
            this.zzbh.onResume();
        }

        if(zzc.zza(this.zzbk) >= 4) {
            this.zzbh.onStop();
        }

        if(zzc.zza(this.zzbk) >= 5) {
            this.zzbh.onDestroy();
        }
    }
}

