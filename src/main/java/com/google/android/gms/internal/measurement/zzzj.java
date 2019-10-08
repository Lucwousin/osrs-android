package com.google.android.gms.internal.measurement;

public abstract class zzzj {
    int zzbtk;
    private int zzbtl;
    private boolean zzbtm;
    private static volatile boolean zzbtn = false;

    static {
    }

    private zzzj() {
        super();
        this.zzbtk = 100;
        this.zzbtl = 0x7FFFFFFF;
        this.zzbtm = false;
    }

    zzzj(zzzk arg1) {
        this();
    }

    static zzzj zza(byte[] arg6, int arg7, int arg8, boolean arg9) {
        zzzl v9 = new zzzl(arg6, arg7, arg8, false, null);
        try {
            v9.zzaf(arg8);
            return ((zzzj)v9);
        }
        catch(zzzy v6) {
            throw new IllegalArgumentException(((Throwable)v6));
        }
    }

    public abstract int zzto();
}

