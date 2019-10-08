package com.google.android.gms.internal.measurement;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

@WorkerThread final class zzfp implements Runnable {
    private final String packageName;
    private final int status;
    private final zzfo zzalg;
    private final Throwable zzalh;
    private final byte[] zzali;
    private final Map zzalj;

    private zzfp(String arg1, zzfo arg2, int arg3, Throwable arg4, byte[] arg5, Map arg6) {
        super();
        Preconditions.checkNotNull(arg2);
        this.zzalg = arg2;
        this.status = arg3;
        this.zzalh = arg4;
        this.zzali = arg5;
        this.packageName = arg1;
        this.zzalj = arg6;
    }

    zzfp(String arg1, zzfo arg2, int arg3, Throwable arg4, byte[] arg5, Map arg6, zzfn arg7) {
        this(arg1, arg2, arg3, arg4, arg5, arg6);
    }

    public final void run() {
        this.zzalg.zza(this.packageName, this.status, this.zzalh, this.zzali, this.zzalj);
    }
}

