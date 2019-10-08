package com.google.android.gms.internal.measurement;

final class zzaau implements zzaba {
    private final zzaaq zzbvr;
    private final zzabo zzbvs;
    private final boolean zzbvt;
    private final zzzo zzbvu;

    private zzaau(zzabo arg1, zzzo arg2, zzaaq arg3) {
        super();
        this.zzbvs = arg1;
        this.zzbvt = arg2.zza(arg3);
        this.zzbvu = arg2;
        this.zzbvr = arg3;
    }

    public final boolean equals(Object arg3, Object arg4) {
        if(!this.zzbvs.zzu(arg3).equals(this.zzbvs.zzu(arg4))) {
            return 0;
        }

        if(this.zzbvt) {
            return this.zzbvu.zzs(arg3).equals(this.zzbvu.zzs(arg4));
        }

        return 1;
    }

    public final int hashCode(Object arg3) {
        int v0 = this.zzbvs.zzu(arg3).hashCode();
        if(this.zzbvt) {
            v0 = v0 * 53 + this.zzbvu.zzs(arg3).hashCode();
        }

        return v0;
    }

    static zzaau zza(zzabo arg1, zzzo arg2, zzaaq arg3) {
        return new zzaau(arg1, arg2, arg3);
    }
}

