package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class zziu implements Runnable {
    zziu(zzik arg1, AtomicReference arg2, String arg3, String arg4, String arg5, zzeb arg6) {
        this.zzaqv = arg1;
        this.zzaqw = arg2;
        this.zzapg = arg3;
        this.zzadn = arg4;
        this.zzadu = arg5;
        this.zzapd = arg6;
        super();
    }

    public final void run() {
        AtomicReference v1_4;
        List v1_3;
        AtomicReference v2;
        zzfa v1_2;
        AtomicReference v0 = this.zzaqw;
        __monitor_enter(v0);
        try {
            v1_2 = zzik.zzd(this.zzaqv);
            if(v1_2 != null) {
                goto label_21;
            }

            this.zzaqv.zzgi().zziv().zzd("Failed to get conditional properties", zzfi.zzbp(this.zzapg), this.zzadn, this.zzadu);
            this.zzaqw.set(Collections.emptyList());
        }
        catch(Throwable v1) {
            goto label_43;
        }
        catch(RemoteException v1_1) {
            goto label_45;
        }

        try {
            this.zzaqw.notify();
            __monitor_exit(v0);
            return;
        }
        catch(Throwable v1) {
            goto label_64;
        }

        try {
        label_21:
            if(TextUtils.isEmpty(this.zzapg)) {
                v2 = this.zzaqw;
                v1_3 = v1_2.zza(this.zzadn, this.zzadu, this.zzapd);
            }
            else {
                v2 = this.zzaqw;
                v1_3 = v1_2.zze(this.zzapg, this.zzadn, this.zzadu);
            }

            v2.set(v1_3);
            zzik.zze(this.zzaqv);
            goto label_39;
        }
        catch(Throwable v1) {
        label_43:
            try {
                this.zzaqw.notify();
                throw v1;
            label_39:
                v1_4 = this.zzaqw;
            label_40:
                v1_4.notify();
                __monitor_exit(v0);
                return;
            label_64:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_64;
            }
        }
        catch(RemoteException v1_1) {
            try {
            label_45:
                this.zzaqv.zzgi().zziv().zzd("Failed to get conditional properties", zzfi.zzbp(this.zzapg), this.zzadn, v1_1);
                this.zzaqw.set(Collections.emptyList());
            }
            catch(Throwable v1) {
                goto label_43;
            }

            try {
                v1_4 = this.zzaqw;
                goto label_40;
            }
            catch(Throwable v1) {
                goto label_64;
            }
        }

        throw v1;
    }
}

