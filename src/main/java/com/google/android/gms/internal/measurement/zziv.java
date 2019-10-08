package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

final class zziv implements Runnable {
    zziv(zzik arg1, AtomicReference arg2, String arg3, String arg4, String arg5, boolean arg6, zzeb arg7) {
        this.zzaqv = arg1;
        this.zzaqw = arg2;
        this.zzapg = arg3;
        this.zzadn = arg4;
        this.zzadu = arg5;
        this.zzadv = arg6;
        this.zzapd = arg7;
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

            this.zzaqv.zzgi().zziv().zzd("Failed to get user properties", zzfi.zzbp(this.zzapg), this.zzadn, this.zzadu);
            this.zzaqw.set(Collections.emptyList());
        }
        catch(Throwable v1) {
            goto label_45;
        }
        catch(RemoteException v1_1) {
            goto label_47;
        }

        try {
            this.zzaqw.notify();
            __monitor_exit(v0);
            return;
        }
        catch(Throwable v1) {
            goto label_66;
        }

        try {
        label_21:
            if(TextUtils.isEmpty(this.zzapg)) {
                v2 = this.zzaqw;
                v1_3 = v1_2.zza(this.zzadn, this.zzadu, this.zzadv, this.zzapd);
            }
            else {
                v2 = this.zzaqw;
                v1_3 = v1_2.zza(this.zzapg, this.zzadn, this.zzadu, this.zzadv);
            }

            v2.set(v1_3);
            zzik.zze(this.zzaqv);
            goto label_41;
        }
        catch(Throwable v1) {
        label_45:
            try {
                this.zzaqw.notify();
                throw v1;
            label_41:
                v1_4 = this.zzaqw;
            label_42:
                v1_4.notify();
                __monitor_exit(v0);
                return;
            label_66:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_66;
            }
        }
        catch(RemoteException v1_1) {
            try {
            label_47:
                this.zzaqv.zzgi().zziv().zzd("Failed to get user properties", zzfi.zzbp(this.zzapg), this.zzadn, v1_1);
                this.zzaqw.set(Collections.emptyList());
            }
            catch(Throwable v1) {
                goto label_45;
            }

            try {
                v1_4 = this.zzaqw;
                goto label_42;
            }
            catch(Throwable v1) {
                goto label_66;
            }
        }

        throw v1;
    }
}

