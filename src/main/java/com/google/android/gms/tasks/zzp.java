package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

final class zzp implements Runnable {
    zzp(zzo arg1, Task arg2) {
        this.zzs = arg1;
        this.zzg = arg2;
        super();
    }

    public final void run() {
        Task v0_2;
        try {
            v0_2 = zzo.zza(this.zzs).then(this.zzg.getResult());
            if(v0_2 != null) {
                goto label_12;
            }
        }
        catch(Exception v0) {
            this.zzs.onFailure(v0);
            return;
        }
        catch(CancellationException ) {
            this.zzs.onCanceled();
            return;
        }
        catch(RuntimeExecutionException v0_1) {
            if((v0_1.getCause() instanceof Exception)) {
                this.zzs.onFailure(v0_1.getCause());
                return;
            }

            this.zzs.onFailure(((Exception)v0_1));
            return;
        }

        this.zzs.onFailure(new NullPointerException("Continuation returned null"));
        return;
    label_12:
        v0_2.addOnSuccessListener(TaskExecutors.zzw, this.zzs);
        v0_2.addOnFailureListener(TaskExecutors.zzw, this.zzs);
        v0_2.addOnCanceledListener(TaskExecutors.zzw, this.zzs);
    }
}

