package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

final class zzu extends Task {
    class zza extends LifecycleCallback {
        private final List zzac;

        private zza(LifecycleFragment arg2) {
            super(arg2);
            this.zzac = new ArrayList();
            this.mLifecycleFragment.addCallback("TaskOnStopCallback", ((LifecycleCallback)this));
        }

        @MainThread public void onStop() {
            List v0 = this.zzac;
            __monitor_enter(v0);
            try {
                Iterator v1_1 = this.zzac.iterator();
                while(v1_1.hasNext()) {
                    Object v2 = v1_1.next().get();
                    if(v2 == null) {
                        continue;
                    }

                    ((zzq)v2).cancel();
                }

                this.zzac.clear();
                __monitor_exit(v0);
                return;
            label_16:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_16;
            }

            throw v1;
        }

        public static zza zza(Activity arg2) {
            zza v0_1;
            LifecycleFragment v2 = zza.getFragment(arg2);
            LifecycleCallback v0 = v2.getCallbackOrNull("TaskOnStopCallback", zza.class);
            if(v0 == null) {
                v0_1 = new zza(v2);
            }

            return v0_1;
        }

        public final void zzb(zzq arg4) {
            List v0 = this.zzac;
            __monitor_enter(v0);
            try {
                this.zzac.add(new WeakReference(arg4));
                __monitor_exit(v0);
                return;
            label_9:
                __monitor_exit(v0);
            }
            catch(Throwable v4) {
                goto label_9;
            }

            throw v4;
        }
    }

    private final Object mLock;
    @GuardedBy(value="mLock") private Object zzaa;
    @GuardedBy(value="mLock") private Exception zzab;
    private final zzr zzx;
    @GuardedBy(value="mLock") private boolean zzy;
    private volatile boolean zzz;

    zzu() {
        super();
        this.mLock = new Object();
        this.zzx = new zzr();
    }

    @NonNull public final Task addOnCanceledListener(@NonNull Activity arg3, @NonNull OnCanceledListener arg4) {
        zzg v0 = new zzg(TaskExecutors.MAIN_THREAD, arg4);
        this.zzx.zza(((zzq)v0));
        zza.zza(arg3).zzb(((zzq)v0));
        this.zze();
        return this;
    }

    @NonNull public final Task addOnCanceledListener(@NonNull OnCanceledListener arg2) {
        return ((Task)this).addOnCanceledListener(TaskExecutors.MAIN_THREAD, arg2);
    }

    @NonNull public final Task addOnCanceledListener(@NonNull Executor arg3, @NonNull OnCanceledListener arg4) {
        this.zzx.zza(new zzg(arg3, arg4));
        this.zze();
        return this;
    }

    @NonNull public final Task addOnCompleteListener(@NonNull Activity arg3, @NonNull OnCompleteListener arg4) {
        zzi v0 = new zzi(TaskExecutors.MAIN_THREAD, arg4);
        this.zzx.zza(((zzq)v0));
        zza.zza(arg3).zzb(((zzq)v0));
        this.zze();
        return this;
    }

    @NonNull public final Task addOnCompleteListener(@NonNull OnCompleteListener arg2) {
        return ((Task)this).addOnCompleteListener(TaskExecutors.MAIN_THREAD, arg2);
    }

    @NonNull public final Task addOnCompleteListener(@NonNull Executor arg3, @NonNull OnCompleteListener arg4) {
        this.zzx.zza(new zzi(arg3, arg4));
        this.zze();
        return this;
    }

    @NonNull public final Task addOnFailureListener(@NonNull Activity arg3, @NonNull OnFailureListener arg4) {
        zzk v0 = new zzk(TaskExecutors.MAIN_THREAD, arg4);
        this.zzx.zza(((zzq)v0));
        zza.zza(arg3).zzb(((zzq)v0));
        this.zze();
        return this;
    }

    @NonNull public final Task addOnFailureListener(@NonNull OnFailureListener arg2) {
        return ((Task)this).addOnFailureListener(TaskExecutors.MAIN_THREAD, arg2);
    }

    @NonNull public final Task addOnFailureListener(@NonNull Executor arg3, @NonNull OnFailureListener arg4) {
        this.zzx.zza(new zzk(arg3, arg4));
        this.zze();
        return this;
    }

    @NonNull public final Task addOnSuccessListener(@NonNull Activity arg3, @NonNull OnSuccessListener arg4) {
        zzm v0 = new zzm(TaskExecutors.MAIN_THREAD, arg4);
        this.zzx.zza(((zzq)v0));
        zza.zza(arg3).zzb(((zzq)v0));
        this.zze();
        return this;
    }

    @NonNull public final Task addOnSuccessListener(@NonNull OnSuccessListener arg2) {
        return ((Task)this).addOnSuccessListener(TaskExecutors.MAIN_THREAD, arg2);
    }

    @NonNull public final Task addOnSuccessListener(@NonNull Executor arg3, @NonNull OnSuccessListener arg4) {
        this.zzx.zza(new zzm(arg3, arg4));
        this.zze();
        return this;
    }

    @NonNull public final Task continueWith(@NonNull Continuation arg2) {
        return ((Task)this).continueWith(TaskExecutors.MAIN_THREAD, arg2);
    }

    @NonNull public final Task continueWith(@NonNull Executor arg4, @NonNull Continuation arg5) {
        zzu v0 = new zzu();
        this.zzx.zza(new zzc(arg4, arg5, v0));
        this.zze();
        return ((Task)v0);
    }

    @NonNull public final Task continueWithTask(@NonNull Continuation arg2) {
        return ((Task)this).continueWithTask(TaskExecutors.MAIN_THREAD, arg2);
    }

    @NonNull public final Task continueWithTask(@NonNull Executor arg4, @NonNull Continuation arg5) {
        zzu v0 = new zzu();
        this.zzx.zza(new zze(arg4, arg5, v0));
        this.zze();
        return ((Task)v0);
    }

    @Nullable public final Exception getException() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.zzab;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_6;
        }

        throw v1;
    }

    public final Object getResult() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            this.zzb();
            this.zzd();
            if(this.zzab == null) {
                __monitor_exit(v0);
                return this.zzaa;
            }

            throw new RuntimeExecutionException(this.zzab);
        label_14:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_14;
        }

        throw v1;
    }

    public final Object getResult(@NonNull Class arg3) throws Throwable {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            this.zzb();
            this.zzd();
            if(!arg3.isInstance(this.zzab)) {
                if(this.zzab == null) {
                    __monitor_exit(v0);
                    return this.zzaa;
                }

                throw new RuntimeExecutionException(this.zzab);
            }

            throw arg3.cast(this.zzab);
        label_20:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_20;
        }

        throw v3;
    }

    public final boolean isCanceled() {
        return this.zzz;
    }

    public final boolean isComplete() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.zzy;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_6;
        }

        throw v1;
    }

    public final boolean isSuccessful() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            boolean v1_1 = !this.zzy || (this.zzz) || this.zzab != null ? false : true;
            __monitor_exit(v0);
            return v1_1;
        label_14:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_14;
        }

        throw v1;
    }

    @NonNull public final Task onSuccessTask(@NonNull SuccessContinuation arg2) {
        return ((Task)this).onSuccessTask(TaskExecutors.MAIN_THREAD, arg2);
    }

    @NonNull public final Task onSuccessTask(Executor arg4, SuccessContinuation arg5) {
        zzu v0 = new zzu();
        this.zzx.zza(new zzo(arg4, arg5, v0));
        this.zze();
        return ((Task)v0);
    }

    public final void setException(@NonNull Exception arg3) {
        Preconditions.checkNotNull(arg3, "Exception must not be null");
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            this.zzc();
            this.zzy = true;
            this.zzab = arg3;
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            try {
            label_13:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_13;
            }

            throw v3;
        }

        this.zzx.zza(((Task)this));
    }

    public final void setResult(Object arg3) {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            this.zzc();
            this.zzy = true;
            this.zzaa = arg3;
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            try {
            label_11:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_11;
            }

            throw v3;
        }

        this.zzx.zza(((Task)this));
    }

    public final boolean trySetException(@NonNull Exception arg3) {
        Preconditions.checkNotNull(arg3, "Exception must not be null");
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zzy) {
                __monitor_exit(v0);
                return 0;
            }

            this.zzy = true;
            this.zzab = arg3;
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            try {
            label_17:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_17;
            }

            throw v3;
        }

        this.zzx.zza(((Task)this));
        return 1;
    }

    public final boolean trySetResult(Object arg3) {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zzy) {
                __monitor_exit(v0);
                return 0;
            }

            this.zzy = true;
            this.zzaa = arg3;
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            try {
            label_15:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_15;
            }

            throw v3;
        }

        this.zzx.zza(((Task)this));
        return 1;
    }

    public final boolean zza() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zzy) {
                __monitor_exit(v0);
                return 0;
            }

            this.zzy = true;
            this.zzz = true;
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            try {
            label_15:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_15;
            }

            throw v1;
        }

        this.zzx.zza(((Task)this));
        return 1;
    }

    @GuardedBy(value="mLock") private final void zzb() {
        Preconditions.checkState(this.zzy, "Task is not yet complete");
    }

    @GuardedBy(value="mLock") private final void zzc() {
        Preconditions.checkState(this.zzy ^ 1, "Task is already complete");
    }

    @GuardedBy(value="mLock") private final void zzd() {
        if(!this.zzz) {
            return;
        }

        throw new CancellationException("Task is already canceled.");
    }

    private final void zze() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(!this.zzy) {
                __monitor_exit(v0);
                return;
            }

            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            try {
            label_11:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_11;
            }

            throw v1;
        }

        this.zzx.zza(((Task)this));
    }
}

