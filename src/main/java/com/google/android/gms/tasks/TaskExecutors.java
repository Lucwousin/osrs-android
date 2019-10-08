package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

public final class TaskExecutors {
    final class zza implements Executor {
        private final Handler mHandler;

        public zza() {
            super();
            this.mHandler = new Handler(Looper.getMainLooper());
        }

        public final void execute(@NonNull Runnable arg2) {
            this.mHandler.post(arg2);
        }
    }

    public static final Executor MAIN_THREAD;
    static final Executor zzw;

    static {
        TaskExecutors.MAIN_THREAD = new zza();
        TaskExecutors.zzw = new zzt();
    }

    private TaskExecutors() {
        super();
    }
}

