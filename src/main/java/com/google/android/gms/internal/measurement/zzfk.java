package com.google.android.gms.internal.measurement;

public final class zzfk {
    private final int priority;
    private final boolean zzalc;
    private final boolean zzald;

    zzfk(zzfi arg1, int arg2, boolean arg3, boolean arg4) {
        this.zzalb = arg1;
        super();
        this.priority = arg2;
        this.zzalc = arg3;
        this.zzald = arg4;
    }

    public final void log(String arg9) {
        this.zzalb.zza(this.priority, this.zzalc, this.zzald, arg9, null, null, null);
    }

    public final void zzd(String arg9, Object arg10, Object arg11, Object arg12) {
        this.zzalb.zza(this.priority, this.zzalc, this.zzald, arg9, arg10, arg11, arg12);
    }

    public final void zze(String arg9, Object arg10, Object arg11) {
        this.zzalb.zza(this.priority, this.zzalc, this.zzald, arg9, arg10, arg11, null);
    }

    public final void zzg(String arg9, Object arg10) {
        this.zzalb.zza(this.priority, this.zzalc, this.zzald, arg9, arg10, null, null);
    }
}

