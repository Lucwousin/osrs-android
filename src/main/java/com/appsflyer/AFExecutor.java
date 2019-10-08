package com.appsflyer;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class AFExecutor {
    final class com.appsflyer.AFExecutor$3 implements ThreadFactory {
        com.appsflyer.AFExecutor$3() {
            super();
        }

        public final Thread newThread(@NonNull Runnable arg3) {
            return new Thread(new Runnable(arg3) {
                public final void run() {
                    if(Build$VERSION.SDK_INT >= 14) {
                        TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    }

                    this.ˏ.run();
                }

                static boolean ˋ(Context arg2, String arg3) {
                    int v2 = ContextCompat.checkSelfPermission(arg2, arg3);
                    StringBuilder v0 = new StringBuilder("is Permission Available: ");
                    v0.append(arg3);
                    v0.append("; res: ");
                    v0.append(v2);
                    AFLogger.afRDLog(v0.toString());
                    if(v2 == 0) {
                        return 1;
                    }

                    return 0;
                }
            });
        }
    }

    private ScheduledExecutorService ˊ;
    private ScheduledExecutorService ˋ;
    private static AFExecutor ˎ;
    private static final ThreadFactory ˏ;
    private Executor ॱ;

    static {
        AFExecutor.ˏ = new com.appsflyer.AFExecutor$3();
    }

    private AFExecutor() {
        super();
    }

    public static AFExecutor getInstance() {
        if(AFExecutor.ˎ == null) {
            AFExecutor.ˎ = new AFExecutor();
        }

        return AFExecutor.ˎ;
    }

    public ScheduledExecutorService getSerialExecutor() {
        if(this.ˊ == null) {
            this.ˊ = Executors.newSingleThreadScheduledExecutor();
        }

        return this.ˊ;
    }

    public Executor getThreadPoolExecutor() {
        int v0;
        if(this.ॱ != null) {
            if((this.ॱ instanceof ThreadPoolExecutor)) {
                if(this.ॱ.isShutdown()) {
                    goto label_17;
                }
                else if(this.ॱ.isTerminated()) {
                    goto label_17;
                }
                else if(this.ॱ.isTerminating()) {
                    goto label_17;
                }
            }

            v0 = 0;
        }
        else {
        label_17:
            v0 = 1;
        }

        if(v0 != 0) {
            if(Build$VERSION.SDK_INT >= 11) {
                this.ॱ = Executors.newFixedThreadPool(2, AFExecutor.ˏ);
            }
            else {
                return Executors.newSingleThreadExecutor();
            }
        }

        return this.ॱ;
    }

    private static void ˊ(ExecutorService arg3) {
        try {
            AFLogger.afRDLog("shut downing executor ...");
            arg3.shutdown();
            arg3.awaitTermination(10, TimeUnit.SECONDS);
        }
        catch(Throwable v0) {
        label_22:
            if(!arg3.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }

            arg3.shutdownNow();
            throw v0;
        }
        catch(InterruptedException ) {
            try {
                AFLogger.afRDLog("InterruptedException!!!");
            }
            catch(Throwable v0) {
                goto label_22;
            }

            if(!arg3.isTerminated()) {
                AFLogger.afRDLog("killing non-finished tasks");
            }

            arg3.shutdownNow();
            return;
        }

        if(!arg3.isTerminated()) {
            AFLogger.afRDLog("killing non-finished tasks");
        }

        arg3.shutdownNow();
    }

    final void ˋ() {
        try {
            AFExecutor.ˊ(this.ˋ);
            if((this.ॱ instanceof ThreadPoolExecutor)) {
                AFExecutor.ˊ(this.ॱ);
            }
        }
        catch(Throwable v0) {
            AFLogger.afErrorLog("failed to stop Executors", v0);
            return;
        }
    }

    final ScheduledThreadPoolExecutor ˏ() {
        int v0 = this.ˋ == null || (this.ˋ.isShutdown()) || (this.ˋ.isTerminated()) ? 1 : 0;
        if(v0 != 0) {
            this.ˋ = Executors.newScheduledThreadPool(2, AFExecutor.ˏ);
        }

        return this.ˋ;
    }
}

