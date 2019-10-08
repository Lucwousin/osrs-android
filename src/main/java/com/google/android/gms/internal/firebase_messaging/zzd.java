package com.google.android.gms.internal.firebase_messaging;

import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class zzd implements zza {
    zzd(zzc arg1) {
        this();
    }

    private zzd() {
        super();
    }

    @NonNull public final ExecutorService zza(ThreadFactory arg9, int arg10) {
        ThreadPoolExecutor v10 = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), arg9);
        v10.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(((ExecutorService)v10));
    }

    @NonNull public final ScheduledExecutorService zza(int arg1, ThreadFactory arg2, int arg3) {
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, arg2));
    }
}

