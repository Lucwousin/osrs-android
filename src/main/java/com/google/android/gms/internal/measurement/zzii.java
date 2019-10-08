package com.google.android.gms.internal.measurement;

import android.os.Bundle;

final class zzii implements Runnable {
    zzii(zzih arg1, boolean arg2, zzig arg3, zzig arg4) {
        this.zzaqm = arg1;
        this.zzaqj = arg2;
        this.zzaqk = arg3;
        this.zzaql = arg4;
        super();
    }

    public final void run() {
        if((this.zzaqj) && this.zzaqm.zzaqd != null) {
            zzih.zza(this.zzaqm, this.zzaqm.zzaqd);
        }

        int v0 = this.zzaqk == null || this.zzaqk.zzaqb != this.zzaql.zzaqb || !zzkd.zzs(this.zzaqk.zzaqa, this.zzaql.zzaqa) || !zzkd.zzs(this.zzaqk.zzuk, this.zzaql.zzuk) ? 1 : 0;
        if(v0 != 0) {
            Bundle v0_1 = new Bundle();
            zzih.zza(this.zzaql, v0_1, true);
            if(this.zzaqk != null) {
                if(this.zzaqk.zzuk != null) {
                    v0_1.putString("_pn", this.zzaqk.zzuk);
                }

                v0_1.putString("_pc", this.zzaqk.zzaqa);
                v0_1.putLong("_pi", this.zzaqk.zzaqb);
            }

            this.zzaqm.zzfy().zza("auto", "_vs", v0_1);
        }

        this.zzaqm.zzaqd = this.zzaql;
        this.zzaqm.zzga().zzb(this.zzaql);
    }
}

