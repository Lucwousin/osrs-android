package com.google.firebase.iid;

import android.util.Log;

final class zzg implements Runnable {
    zzg(zzf arg1, zzd arg2) {
        this.zzab = arg1;
        this.zzaa = arg2;
        super();
    }

    public final void run() {
        if(Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }

        zzf.zza(this.zzab).zzd(this.zzaa.intent);
        this.zzaa.finish();
    }
}

