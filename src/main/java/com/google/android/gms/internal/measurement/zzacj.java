package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class zzacj {
    protected volatile int zzbzo;

    public zzacj() {
        super();
        this.zzbzo = -1;
    }

    public Object clone() throws CloneNotSupportedException {
        return this.zzvu();
    }

    public String toString() {
        return zzack.zzc(this);
    }

    public void zza(zzacb arg1) throws IOException {
    }

    public static final zzacj zza(zzacj arg2, byte[] arg3) throws zzaci {
        return zzacj.zzb(arg2, arg3, 0, arg3.length);
    }

    public static final void zza(zzacj arg0, byte[] arg1, int arg2, int arg3) {
        try {
            zzacb v1 = zzacb.zzb(arg1, 0, arg3);
            arg0.zza(v1);
            v1.zzvt();
            return;
        }
        catch(IOException v0) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", ((Throwable)v0));
        }
    }

    protected int zza() {
        return 0;
    }

    public abstract zzacj zzb(zzaca arg1) throws IOException;

    private static final zzacj zzb(zzacj arg0, byte[] arg1, int arg2, int arg3) throws zzaci {
        try {
            zzaca v1 = zzaca.zza(arg1, 0, arg3);
            arg0.zzb(v1);
            v1.zzaj(0);
            return arg0;
        }
        catch(IOException v0) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).", ((Throwable)v0));
        }
        catch(zzaci v0_1) {
            throw v0_1;
        }
    }

    public zzacj zzvu() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int zzwa() {
        if(this.zzbzo < 0) {
            this.zzwb();
        }

        return this.zzbzo;
    }

    public final int zzwb() {
        int v0 = this.zza();
        this.zzbzo = v0;
        return v0;
    }
}

