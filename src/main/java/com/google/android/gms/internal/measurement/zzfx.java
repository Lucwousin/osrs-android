package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences$Editor;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class zzfx {
    private final long zzabi;
    @VisibleForTesting private final String zzamr;
    private final String zzams;
    private final String zzamt;

    private zzfx(zzft arg3, String arg4, long arg5) {
        this.zzamp = arg3;
        super();
        Preconditions.checkNotEmpty(arg4);
        boolean v3 = arg5 > 0 ? true : false;
        Preconditions.checkArgument(v3);
        this.zzamr = String.valueOf(arg4).concat(":start");
        this.zzams = String.valueOf(arg4).concat(":count");
        this.zzamt = String.valueOf(arg4).concat(":value");
        this.zzabi = arg5;
    }

    zzfx(zzft arg1, String arg2, long arg3, zzfu arg5) {
        this(arg1, arg2, arg3);
    }

    @WorkerThread public final void zzc(String arg7, long arg8) {
        this.zzamp.zzab();
        long v0 = 0;
        if(this.zzfj() == v0) {
            this.zzfh();
        }

        if(arg7 == null) {
            arg7 = "";
        }

        arg8 = zzft.zza(this.zzamp).getLong(this.zzams, v0);
        long v2 = 1;
        if(arg8 <= v0) {
            SharedPreferences$Editor v8 = zzft.zza(this.zzamp).edit();
            v8.putString(this.zzamt, arg7);
            v8.putLong(this.zzams, v2);
            v8.apply();
            return;
        }

        arg8 += v2;
        int v0_1 = (this.zzamp.zzgg().zzlo().nextLong() & 0x7FFFFFFFFFFFFFFFL) < 0x7FFFFFFFFFFFFFFFL / arg8 ? 1 : 0;
        SharedPreferences$Editor v1 = zzft.zza(this.zzamp).edit();
        if(v0_1 != 0) {
            v1.putString(this.zzamt, arg7);
        }

        v1.putLong(this.zzams, arg8);
        v1.apply();
    }

    @WorkerThread private final void zzfh() {
        this.zzamp.zzab();
        long v0 = this.zzamp.zzbt().currentTimeMillis();
        SharedPreferences$Editor v2 = zzft.zza(this.zzamp).edit();
        v2.remove(this.zzams);
        v2.remove(this.zzamt);
        v2.putLong(this.zzamr, v0);
        v2.apply();
    }

    @WorkerThread public final Pair zzfi() {
        this.zzamp.zzab();
        this.zzamp.zzab();
        long v0 = this.zzfj();
        long v2 = 0;
        if(v0 == v2) {
            this.zzfh();
            v0 = v2;
        }
        else {
            v0 = Math.abs(v0 - this.zzamp.zzbt().currentTimeMillis());
        }

        Pair v6 = null;
        if(v0 < this.zzabi) {
            return v6;
        }

        if(v0 > this.zzabi << 1) {
            this.zzfh();
            return v6;
        }

        String v0_1 = zzft.zza(this.zzamp).getString(this.zzamt, ((String)v6));
        long v4 = zzft.zza(this.zzamp).getLong(this.zzams, v2);
        this.zzfh();
        if(v0_1 != null) {
            if(v4 <= v2) {
            }
            else {
                return new Pair(v0_1, Long.valueOf(v4));
            }
        }

        return zzft.zzalr;
    }

    @WorkerThread private final long zzfj() {
        return zzft.zza(this.zzamp).getLong(this.zzamr, 0);
    }
}

