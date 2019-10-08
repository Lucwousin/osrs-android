package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.MainThread;

final class zzgb implements ServiceConnection {
    zzgb(zzfz arg1, zzga arg2) {
        this(arg1);
    }

    private zzgb(zzfz arg1) {
        this.zzamx = arg1;
        super();
    }

    @MainThread public final void onServiceConnected(ComponentName arg2, IBinder arg3) {
        if(arg3 == null) {
            zzfz.zza(this.zzamx).zzgi().zziy().log("Install Referrer connection returned with null binder");
            return;
        }

        try {
            this.zzamx.zzamv = zzs.zza(arg3);
            if(this.zzamx.zzamv == null) {
                zzfz.zza(this.zzamx).zzgi().zziy().log("Install Referrer Service implementation was not found");
                return;
            }

            zzfz.zza(this.zzamx).zzgi().zzja().log("Install Referrer Service connected");
            zzfz.zza(this.zzamx).zzgh().zzc(new zzgc(this));
            return;
        }
        catch(Exception v2) {
            zzfz.zza(this.zzamx).zzgi().zziy().zzg("Exception occurred while calling Install Referrer API", v2);
            return;
        }
    }

    @MainThread public final void onServiceDisconnected(ComponentName arg2) {
        this.zzamx.zzamv = null;
        zzfz.zza(this.zzamx).zzgi().zzja().log("Install Referrer Service disconnected");
    }
}

