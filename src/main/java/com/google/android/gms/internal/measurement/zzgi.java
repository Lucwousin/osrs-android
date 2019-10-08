package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class zzgi extends zzhj {
    private ExecutorService executor;
    private zzgm zzanm;
    private zzgm zzann;
    private final PriorityBlockingQueue zzano;
    private final BlockingQueue zzanp;
    private final Thread$UncaughtExceptionHandler zzanq;
    private final Thread$UncaughtExceptionHandler zzanr;
    private final Object zzans;
    private final Semaphore zzant;
    private volatile boolean zzanu;
    private static final AtomicLong zzanv;

    static {
        zzgi.zzanv = new AtomicLong(-9223372036854775808L);
    }

    zzgi(zzgn arg2) {
        super(arg2);
        this.zzans = new Object();
        this.zzant = new Semaphore(2);
        this.zzano = new PriorityBlockingQueue();
        this.zzanp = new LinkedBlockingQueue();
        this.zzanq = new zzgk(this, "Thread death: Uncaught exception on worker thread");
        this.zzanr = new zzgk(this, "Thread death: Uncaught exception on network thread");
    }

    public final Context getContext() {
        return super.getContext();
    }

    static Semaphore zza(zzgi arg0) {
        return arg0.zzant;
    }

    static zzgm zza(zzgi arg0, zzgm arg1) {
        arg0.zzanm = null;
        return null;
    }

    private final void zza(zzgl arg4) {
        Object v0 = this.zzans;
        __monitor_enter(v0);
        try {
            this.zzano.add(arg4);
            if(this.zzanm == null) {
                this.zzanm = new zzgm(this, "Measurement Worker", this.zzano);
                this.zzanm.setUncaughtExceptionHandler(this.zzanq);
                this.zzanm.start();
            }
            else {
                this.zzanm.zzjx();
            }

            __monitor_exit(v0);
            return;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_22;
        }

        throw v4;
    }

    final Object zza(AtomicReference arg1, long arg2, String arg4, Runnable arg5) {
        String v3;
        zzfk v2_1;
        __monitor_enter(arg1);
        try {
            ((zzhi)this).zzgh().zzc(arg5);
            arg2 = 15000;
            try {
                arg1.wait(arg2);
                goto label_5;
            }
            catch(InterruptedException ) {
                try {
                    v2_1 = ((zzhi)this).zzgi().zziy();
                    v3 = "Interrupted waiting for ";
                    arg4 = String.valueOf(arg4);
                    v3 = arg4.length() != 0 ? v3.concat(arg4) : new String(v3);
                    v2_1.log(v3);
                    __monitor_exit(arg1);
                    return null;
                label_5:
                    __monitor_exit(arg1);
                    goto label_6;
                label_37:
                    __monitor_exit(arg1);
                }
                catch(Throwable v2) {
                    goto label_37;
                }
            }
        }
        catch(Throwable v2) {
            goto label_37;
        }

        throw v2;
    label_6:
        Object v1 = arg1.get();
        if(v1 == null) {
            v2_1 = ((zzhi)this).zzgi().zziy();
            v3 = "Timed out waiting for ";
            arg4 = String.valueOf(arg4);
            v3 = arg4.length() != 0 ? v3.concat(arg4) : new String(v3);
            v2_1.log(v3);
        }

        return v1;
    }

    public final void zzab() {
        if(Thread.currentThread() == this.zzanm) {
            return;
        }

        throw new IllegalStateException("Call expected from worker thread");
    }

    static boolean zzb(zzgi arg0) {
        return arg0.zzanu;
    }

    static zzgm zzb(zzgi arg0, zzgm arg1) {
        arg0.zzann = null;
        return null;
    }

    public final Future zzb(Callable arg4) throws IllegalStateException {
        ((zzhj)this).zzch();
        Preconditions.checkNotNull(arg4);
        zzgl v0 = new zzgl(this, arg4, false, "Task exception on worker thread");
        if(Thread.currentThread() == this.zzanm) {
            if(!this.zzano.isEmpty()) {
                ((zzhi)this).zzgi().zziy().log("Callable skipped the worker queue.");
            }

            v0.run();
        }
        else {
            this.zza(v0);
        }

        return ((Future)v0);
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    public final void zzc(Runnable arg4) throws IllegalStateException {
        ((zzhj)this).zzch();
        Preconditions.checkNotNull(arg4);
        this.zza(new zzgl(this, arg4, false, "Task exception on worker thread"));
    }

    static Object zzc(zzgi arg0) {
        return arg0.zzans;
    }

    public final Future zzc(Callable arg4) throws IllegalStateException {
        ((zzhj)this).zzch();
        Preconditions.checkNotNull(arg4);
        zzgl v0 = new zzgl(this, arg4, true, "Task exception on worker thread");
        if(Thread.currentThread() == this.zzanm) {
            v0.run();
        }
        else {
            this.zza(v0);
        }

        return ((Future)v0);
    }

    static zzgm zzd(zzgi arg0) {
        return arg0.zzanm;
    }

    public final void zzd(Runnable arg4) throws IllegalStateException {
        ((zzhj)this).zzch();
        Preconditions.checkNotNull(arg4);
        zzgl v0 = new zzgl(this, arg4, false, "Task exception on network thread");
        Object v4 = this.zzans;
        __monitor_enter(v4);
        try {
            this.zzanp.add(v0);
            if(this.zzann == null) {
                this.zzann = new zzgm(this, "Measurement Network", this.zzanp);
                this.zzann.setUncaughtExceptionHandler(this.zzanr);
                this.zzann.start();
            }
            else {
                this.zzann.zzjx();
            }

            __monitor_exit(v4);
            return;
        label_28:
            __monitor_exit(v4);
        }
        catch(Throwable v0_1) {
            goto label_28;
        }

        throw v0_1;
    }

    static zzgm zze(zzgi arg0) {
        return arg0.zzann;
    }

    public final void zzfu() {
        super.zzfu();
    }

    public final void zzfv() {
        super.zzfv();
    }

    public final void zzfw() {
        if(Thread.currentThread() == this.zzann) {
            return;
        }

        throw new IllegalStateException("Call expected from network thread");
    }

    public final zzer zzge() {
        return super.zzge();
    }

    public final zzfg zzgf() {
        return super.zzgf();
    }

    public final zzkd zzgg() {
        return super.zzgg();
    }

    public final zzgi zzgh() {
        return super.zzgh();
    }

    public final zzfi zzgi() {
        return super.zzgi();
    }

    public final zzft zzgj() {
        return super.zzgj();
    }

    public final zzeh zzgk() {
        return super.zzgk();
    }

    public final zzee zzgl() {
        return super.zzgl();
    }

    protected final boolean zzgn() {
        return 0;
    }

    public final boolean zzju() {
        if(Thread.currentThread() == this.zzanm) {
            return 1;
        }

        return 0;
    }

    final ExecutorService zzjv() {
        Object v0 = this.zzans;
        __monitor_enter(v0);
        try {
            if(this.executor == null) {
                this.executor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
            }

            __monitor_exit(v0);
            return this.executor;
        label_20:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_20;
        }

        throw v1;
    }

    static AtomicLong zzjw() {
        return zzgi.zzanv;
    }
}

