package com.google.android.gms.internal.measurement;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

final class zzgm extends Thread {
    private final Object zzaoa;
    private final BlockingQueue zzaob;

    public zzgm(zzgi arg1, String arg2, BlockingQueue arg3) {
        this.zzanx = arg1;
        super();
        Preconditions.checkNotNull(arg2);
        Preconditions.checkNotNull(arg3);
        this.zzaoa = new Object();
        this.zzaob = arg3;
        this.setName(arg2);
    }

    public final void run() {
        Object v2;
        int v0 = 0;
        while(v0 == 0) {
            try {
                zzgi.zza(this.zzanx).acquire();
                v0 = 1;
            }
            catch(InterruptedException v1) {
                this.zza(v1);
            }
        }

        zzgm v0_1 = null;
        try {
            int v1_2 = Process.getThreadPriority(Process.myTid());
            while(true) {
            label_13:
                v2 = this.zzaob.poll();
                if(v2 != null) {
                    int v3 = ((zzgl)v2).zzanz ? v1_2 : 10;
                    Process.setThreadPriority(v3);
                    ((zzgl)v2).run();
                    continue;
                }

                v2 = this.zzaoa;
                __monitor_enter(v2);
                break;
            }
        }
        catch(Throwable v1_1) {
            goto label_87;
        }

        try {
            if(this.zzaob.peek() != null) {
                goto label_38;
            }

            if(zzgi.zzb(this.zzanx)) {
                goto label_38;
            }

            try {
                this.zzaoa.wait(30000);
                goto label_38;
            }
            catch(InterruptedException v3_1) {
                try {
                    this.zza(v3_1);
                label_38:
                    __monitor_exit(v2);
                }
                catch(Throwable v1_1) {
                    goto label_83;
                }
            }
        }
        catch(Throwable v1_1) {
            goto label_83;
        }

        try {
            v2 = zzgi.zzc(this.zzanx);
            __monitor_enter(v2);
        }
        catch(Throwable v1_1) {
            goto label_87;
        }

        try {
            if(this.zzaob.peek() != null) {
                goto label_77;
            }

            __monitor_exit(v2);
        }
        catch(Throwable v1_1) {
            goto label_80;
        }

        Object v1_3 = zzgi.zzc(this.zzanx);
        __monitor_enter(v1_3);
        try {
            zzgi.zza(this.zzanx).release();
            zzgi.zzc(this.zzanx).notifyAll();
            if(this == zzgi.zzd(this.zzanx)) {
                zzgi.zza(this.zzanx, v0_1);
            }
            else if(this == zzgi.zze(this.zzanx)) {
                zzgi.zzb(this.zzanx, v0_1);
            }
            else {
                this.zzanx.zzgi().zziv().log("Current scheduler thread is neither worker nor network");
            }

            __monitor_exit(v1_3);
            return;
        }
        catch(Throwable v0_2) {
            goto label_75;
        }

        try {
        label_77:
            __monitor_exit(v2);
            goto label_13;
        }
        catch(Throwable v1_1) {
            goto label_80;
        }

        try {
        label_75:
            __monitor_exit(v1_3);
        }
        catch(Throwable v0_2) {
            goto label_75;
        }

        throw v0_2;
        try {
        label_80:
            __monitor_exit(v2);
        }
        catch(Throwable v1_1) {
            goto label_80;
        }

        try {
            throw v1_1;
        }
        catch(Throwable v1_1) {
            goto label_87;
        }

        try {
        label_83:
            __monitor_exit(v2);
        }
        catch(Throwable v1_1) {
            goto label_83;
        }

        try {
            throw v1_1;
        }
        catch(Throwable v1_1) {
        label_87:
            v2 = zzgi.zzc(this.zzanx);
            __monitor_enter(v2);
            try {
                zzgi.zza(this.zzanx).release();
                zzgi.zzc(this.zzanx).notifyAll();
                if(this == zzgi.zzd(this.zzanx)) {
                    zzgi.zza(this.zzanx, v0_1);
                }
                else if(this == zzgi.zze(this.zzanx)) {
                    zzgi.zzb(this.zzanx, v0_1);
                }
                else {
                    this.zzanx.zzgi().zziv().log("Current scheduler thread is neither worker nor network");
                }

                __monitor_exit(v2);
            }
            catch(Throwable v0_2) {
                try {
                label_115:
                    __monitor_exit(v2);
                }
                catch(Throwable v0_2) {
                    goto label_115;
                }

                throw v0_2;
            }

            throw v1_1;
        }
    }

    private final void zza(InterruptedException arg4) {
        this.zzanx.zzgi().zziy().zzg(String.valueOf(this.getName()).concat(" was interrupted"), arg4);
    }

    public final void zzjx() {
        Object v0 = this.zzaoa;
        __monitor_enter(v0);
        try {
            this.zzaoa.notifyAll();
            __monitor_exit(v0);
            return;
        label_7:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_7;
        }

        throw v1;
    }
}

