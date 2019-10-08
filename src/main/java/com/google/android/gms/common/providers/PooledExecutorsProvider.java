package com.google.android.gms.common.providers;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.ScheduledExecutorService;

@KeepForSdk public class PooledExecutorsProvider {
    public interface PooledExecutorFactory {
        @KeepForSdk ScheduledExecutorService newSingleThreadScheduledExecutor();
    }

    private static PooledExecutorFactory zzey;

    private PooledExecutorsProvider() {
        super();
    }

    @KeepForSdk public static PooledExecutorFactory getInstance() {
        PooledExecutorFactory v1_1;
        Class v0 = PooledExecutorsProvider.class;
        __monitor_enter(v0);
        try {
            if(PooledExecutorsProvider.zzey == null) {
                PooledExecutorsProvider.zzey = new zza();
            }

            v1_1 = PooledExecutorsProvider.zzey;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v1_1;
    }
}

