package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzi {
    private static final Executor zzai;

    static {
        zzi.zzai = zzk.zzak;
    }

    static final Thread zza(Runnable arg2) {
        return new Thread(arg2, "firebase-iid-executor");
    }

    static final void zzb(Runnable arg0) {
        arg0.run();
    }

    static Executor zzf() {
        return zzi.zzai;
    }

    static Executor zzg() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzj.zzaj);
    }
}

