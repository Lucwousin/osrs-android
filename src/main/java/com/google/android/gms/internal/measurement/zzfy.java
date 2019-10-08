package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences$Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzfy {
    private String value;
    private boolean zzamo;
    private final String zzamu;
    private final String zzny;

    public zzfy(zzft arg1, String arg2, String arg3) {
        this.zzamp = arg1;
        super();
        Preconditions.checkNotEmpty(arg2);
        this.zzny = arg2;
        this.zzamu = null;
    }

    @WorkerThread public final void zzbv(String arg3) {
        if(zzkd.zzs(arg3, this.value)) {
            return;
        }

        SharedPreferences$Editor v0 = zzft.zza(this.zzamp).edit();
        v0.putString(this.zzny, arg3);
        v0.apply();
        this.value = arg3;
    }

    @WorkerThread public final String zzjq() {
        if(!this.zzamo) {
            this.zzamo = true;
            this.value = zzft.zza(this.zzamp).getString(this.zzny, null);
        }

        return this.value;
    }
}

