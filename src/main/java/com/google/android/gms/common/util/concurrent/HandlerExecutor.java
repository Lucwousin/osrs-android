package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zze;
import java.util.concurrent.Executor;

@KeepForSdk public class HandlerExecutor implements Executor {
    private final Handler handler;

    @KeepForSdk public HandlerExecutor(Looper arg2) {
        super();
        this.handler = new zze(arg2);
    }

    public void execute(@NonNull Runnable arg2) {
        this.handler.post(arg2);
    }
}

