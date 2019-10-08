package com.google.firebase.iid;

import android.content.Intent;

final class zzc implements Runnable {
    zzc(zzb arg1, Intent arg2, Intent arg3) {
        this.zzt = arg1;
        this.zzr = arg2;
        this.zzs = arg3;
        super();
    }

    public final void run() {
        this.zzt.zzd(this.zzr);
        zzb.zza(this.zzt, this.zzs);
    }
}

