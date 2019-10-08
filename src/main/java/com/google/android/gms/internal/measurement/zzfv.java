package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences$Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzfv {
    private boolean value;
    private final boolean zzamn;
    private boolean zzamo;
    private final String zzny;

    public zzfv(zzft arg1, String arg2, boolean arg3) {
        this.zzamp = arg1;
        super();
        Preconditions.checkNotEmpty(arg2);
        this.zzny = arg2;
        this.zzamn = true;
    }

    @WorkerThread public final boolean get() {
        if(!this.zzamo) {
            this.zzamo = true;
            this.value = zzft.zza(this.zzamp).getBoolean(this.zzny, this.zzamn);
        }

        return this.value;
    }

    @WorkerThread public final void set(boolean arg3) {
        SharedPreferences$Editor v0 = zzft.zza(this.zzamp).edit();
        v0.putBoolean(this.zzny, arg3);
        v0.apply();
        this.value = arg3;
    }
}

