package com.google.android.gms.tasks;

final class zzf implements Runnable {
    zzf(zze arg1, Task arg2) {
        this.zzi = arg1;
        this.zzg = arg2;
        super();
    }

    public final void run() {
        Object v0_2;
        try {
            v0_2 = zze.zza(this.zzi).then(this.zzg);
            if(v0_2 != null) {
                goto label_11;
            }
        }
        catch(Exception v0) {
            zze.zzb(this.zzi).setException(v0);
            return;
        }
        catch(RuntimeExecutionException v0_1) {
            if((v0_1.getCause() instanceof Exception)) {
                zze.zzb(this.zzi).setException(v0_1.getCause());
                return;
            }

            zze.zzb(this.zzi).setException(((Exception)v0_1));
            return;
        }

        this.zzi.onFailure(new NullPointerException("Continuation returned null"));
        return;
    label_11:
        ((Task)v0_2).addOnSuccessListener(TaskExecutors.zzw, this.zzi);
        ((Task)v0_2).addOnFailureListener(TaskExecutors.zzw, this.zzi);
        ((Task)v0_2).addOnCanceledListener(TaskExecutors.zzw, this.zzi);
    }
}

