package com.google.android.gms.common;

import java.lang.ref.WeakReference;

abstract class zzg extends zze {
    private WeakReference zzv;
    private static final WeakReference zzw;

    static {
        zzg.zzw = new WeakReference(null);
    }

    zzg(byte[] arg1) {
        super(arg1);
        this.zzv = zzg.zzw;
    }

    final byte[] getBytes() {
        __monitor_enter(this);
        try {
            Object v0_1 = this.zzv.get();
            if(v0_1 == null) {
                byte[] v0_2 = this.zzd();
                this.zzv = new WeakReference(v0_2);
            }

            __monitor_exit(this);
            return ((byte[])v0_1);
        label_11:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_11;
        }

        throw v0;
    }

    protected abstract byte[] zzd();
}

