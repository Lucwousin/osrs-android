package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

public final class Tasks {
    final class zza implements zzb {
        private final CountDownLatch zzaf;

        zza(zzv arg1) {
            this();
        }

        private zza() {
            super();
            this.zzaf = new CountDownLatch(1);
        }

        public final void await() throws InterruptedException {
            this.zzaf.await();
        }

        public final boolean await(long arg2, TimeUnit arg4) throws InterruptedException {
            return this.zzaf.await(arg2, arg4);
        }

        public final void onCanceled() {
            this.zzaf.countDown();
        }

        public final void onFailure(@NonNull Exception arg1) {
            this.zzaf.countDown();
        }

        public final void onSuccess(Object arg1) {
            this.zzaf.countDown();
        }
    }

    interface zzb extends OnCanceledListener, OnFailureListener, OnSuccessListener {
    }

    final class zzc implements zzb {
        private final Object mLock;
        private final zzu zza;
        @GuardedBy(value="mLock") private Exception zzab;
        private final int zzag;
        @GuardedBy(value="mLock") private int zzah;
        @GuardedBy(value="mLock") private int zzai;
        @GuardedBy(value="mLock") private int zzaj;
        @GuardedBy(value="mLock") private boolean zzak;

        public zzc(int arg2, zzu arg3) {
            super();
            this.mLock = new Object();
            this.zzag = arg2;
            this.zza = arg3;
        }

        public final void onCanceled() {
            Object v0 = this.mLock;
            __monitor_enter(v0);
            try {
                ++this.zzaj;
                this.zzak = true;
                this.zzf();
                __monitor_exit(v0);
                return;
            label_11:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_11;
            }

            throw v1;
        }

        public final void onFailure(@NonNull Exception arg3) {
            Object v0 = this.mLock;
            __monitor_enter(v0);
            try {
                ++this.zzai;
                this.zzab = arg3;
                this.zzf();
                __monitor_exit(v0);
                return;
            label_10:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_10;
            }

            throw v3;
        }

        public final void onSuccess(Object arg2) {
            arg2 = this.mLock;
            __monitor_enter(arg2);
            try {
                ++this.zzah;
                this.zzf();
                __monitor_exit(arg2);
                return;
            label_9:
                __monitor_exit(arg2);
            }
            catch(Throwable v0) {
                goto label_9;
            }

            throw v0;
        }

        @GuardedBy(value="mLock") private final void zzf() {
            if(this.zzah + this.zzai + this.zzaj == this.zzag) {
                if(this.zzab != null) {
                    zzu v0 = this.zza;
                    int v2 = this.zzai;
                    int v3 = this.zzag;
                    StringBuilder v5 = new StringBuilder(54);
                    v5.append(v2);
                    v5.append(" out of ");
                    v5.append(v3);
                    v5.append(" underlying tasks failed");
                    v0.setException(new ExecutionException(v5.toString(), this.zzab));
                    return;
                }
                else if(this.zzak) {
                    this.zza.zza();
                    return;
                }
                else {
                    this.zza.setResult(null);
                }
            }
        }
    }

    private Tasks() {
        super();
    }

    public static Object await(@NonNull Task arg2) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(arg2, "Task must not be null");
        if(arg2.isComplete()) {
            return Tasks.zzb(arg2);
        }

        zza v0 = new zza(null);
        Tasks.zza(arg2, ((zzb)v0));
        v0.await();
        return Tasks.zzb(arg2);
    }

    public static Object await(@NonNull Task arg2, long arg3, @NonNull TimeUnit arg5) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(arg2, "Task must not be null");
        Preconditions.checkNotNull(arg5, "TimeUnit must not be null");
        if(arg2.isComplete()) {
            return Tasks.zzb(arg2);
        }

        zza v0 = new zza(null);
        Tasks.zza(arg2, ((zzb)v0));
        if(v0.await(arg3, arg5)) {
            return Tasks.zzb(arg2);
        }

        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task call(@NonNull Callable arg1) {
        return Tasks.call(TaskExecutors.MAIN_THREAD, arg1);
    }

    public static Task call(@NonNull Executor arg2, @NonNull Callable arg3) {
        Preconditions.checkNotNull(arg2, "Executor must not be null");
        Preconditions.checkNotNull(arg3, "Callback must not be null");
        zzu v0 = new zzu();
        arg2.execute(new zzv(v0, arg3));
        return ((Task)v0);
    }

    public static Task forCanceled() {
        zzu v0 = new zzu();
        v0.zza();
        return ((Task)v0);
    }

    public static Task forException(@NonNull Exception arg1) {
        zzu v0 = new zzu();
        v0.setException(arg1);
        return ((Task)v0);
    }

    public static Task forResult(Object arg1) {
        zzu v0 = new zzu();
        v0.setResult(arg1);
        return ((Task)v0);
    }

    public static Task whenAll(Collection arg3) {
        if(arg3.isEmpty()) {
            return Tasks.forResult(null);
        }

        Iterator v0 = arg3.iterator();
        while(true) {
            if(!v0.hasNext()) {
                goto label_15;
            }

            if(v0.next() == null) {
                break;
            }
        }

        throw new NullPointerException("null tasks are not accepted");
    label_15:
        zzu v0_1 = new zzu();
        zzc v1 = new zzc(arg3.size(), v0_1);
        Iterator v3 = arg3.iterator();
        while(v3.hasNext()) {
            Tasks.zza(v3.next(), ((zzb)v1));
        }

        return ((Task)v0_1);
    }

    public static Task whenAll(Task[] arg1) {
        if(arg1.length == 0) {
            return Tasks.forResult(null);
        }

        return Tasks.whenAll(Arrays.asList(((Object[])arg1)));
    }

    public static Task whenAllComplete(Collection arg2) {
        return Tasks.whenAll(arg2).continueWithTask(new zzx(arg2));
    }

    public static Task whenAllComplete(Task[] arg0) {
        return Tasks.whenAllComplete(Arrays.asList(((Object[])arg0)));
    }

    public static Task whenAllSuccess(Collection arg2) {
        return Tasks.whenAll(arg2).continueWith(new zzw(arg2));
    }

    public static Task whenAllSuccess(Task[] arg0) {
        return Tasks.whenAllSuccess(Arrays.asList(((Object[])arg0)));
    }

    private static void zza(Task arg1, zzb arg2) {
        arg1.addOnSuccessListener(TaskExecutors.zzw, ((OnSuccessListener)arg2));
        arg1.addOnFailureListener(TaskExecutors.zzw, ((OnFailureListener)arg2));
        arg1.addOnCanceledListener(TaskExecutors.zzw, ((OnCanceledListener)arg2));
    }

    private static Object zzb(Task arg1) throws ExecutionException {
        if(arg1.isSuccessful()) {
            return arg1.getResult();
        }

        if(arg1.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }

        throw new ExecutionException(arg1.getException());
    }
}

