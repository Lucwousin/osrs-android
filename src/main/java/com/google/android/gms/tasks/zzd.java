package com.google.android.gms.tasks;

final class zzd implements Runnable {
    zzd(zzc arg1, Task arg2) {
        this.zzh = arg1;
        this.zzg = arg2;
        super();
    }

    public final void run() {
        Object v0_2;
        if(this.zzg.isCanceled()) {
            zzc.zza(this.zzh).zza();
            return;
        }

        try {
            v0_2 = zzc.zzb(this.zzh).then(this.zzg);
        }
        catch(Exception v0) {
            zzc.zza(this.zzh).setException(v0);
            return;
        }
        catch(RuntimeExecutionException v0_1) {
            if((v0_1.getCause() instanceof Exception)) {
                zzc.zza(this.zzh).setException(v0_1.getCause());
                return;
            }

            zzc.zza(this.zzh).setException(((Exception)v0_1));
            return;
        }

        zzc.zza(this.zzh).setResult(v0_2);
    }
}

