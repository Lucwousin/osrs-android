package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences$Editor;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;

public final class zzfw {
    private long value;
    private boolean zzamo;
    private final long zzamq;
    private final String zzny;

    public zzfw(zzft arg1, String arg2, long arg3) {
        this.zzamp = arg1;
        super();
        Preconditions.checkNotEmpty(arg2);
        this.zzny = arg2;
        this.zzamq = arg3;
    }

    @WorkerThread public final long get() {
        if(!this.zzamo) {
            this.zzamo = true;
            this.value = zzft.zza(this.zzamp).getLong(this.zzny, this.zzamq);
        }

        return this.value;
    }

    @WorkerThread public final void set(long arg3) {
        SharedPreferences$Editor v0 = zzft.zza(this.zzamp).edit();
        v0.putLong(this.zzny, arg3);
        v0.apply();
        this.value = arg3;
    }
}

