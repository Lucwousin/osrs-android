package com.google.firebase.iid;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

public final class zzf extends Binder {
    private final zzb zzz;

    zzf(zzb arg1) {
        super();
        this.zzz = arg1;
    }

    static zzb zza(zzf arg0) {
        return arg0.zzz;
    }

    public final void zza(zzd arg4) {
        if(Binder.getCallingUid() == Process.myUid()) {
            int v1 = 3;
            if(Log.isLoggable("EnhancedIntentService", v1)) {
                Log.d("EnhancedIntentService", "service received new intent via bind strategy");
            }

            if(this.zzz.zzc(arg4.intent)) {
                arg4.finish();
                return;
            }

            if(Log.isLoggable("EnhancedIntentService", v1)) {
                Log.d("EnhancedIntentService", "intent being queued for bg execution");
            }

            this.zzz.zzn.execute(new zzg(this, arg4));
            return;
        }

        throw new SecurityException("Binding only allowed within app");
    }
}

