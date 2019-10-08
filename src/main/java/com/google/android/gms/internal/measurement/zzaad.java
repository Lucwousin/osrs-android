package com.google.android.gms.internal.measurement;

public class zzaad {
    private static final zzzn zzbvd;
    private zzzb zzbve;
    private volatile zzaaq zzbvf;
    private volatile zzzb zzbvg;

    static {
        zzaad.zzbvd = zzzn.zztt();
    }

    public zzaad() {
        super();
    }

    public boolean equals(Object arg3) {
        if(this == (((zzaad)arg3))) {
            return 1;
        }

        if(!(arg3 instanceof zzaad)) {
            return 0;
        }

        zzaaq v0 = this.zzbvf;
        zzaaq v1 = ((zzaad)arg3).zzbvf;
        if(v0 == null && v1 == null) {
            return this.zzue().equals(((zzaad)arg3).zzue());
        }

        if(v0 != null && v1 != null) {
            return v0.equals(v1);
        }

        if(v0 != null) {
            return v0.equals(((zzaad)arg3).zzb(v0.zzuo()));
        }

        return this.zzb(v1.zzuo()).equals(v1);
    }

    public int hashCode() {
        return 1;
    }

    private final zzaaq zzb(zzaaq arg2) {
        if(this.zzbvf == null) {
            __monitor_enter(this);
            try {
                if(this.zzbvf == null) {
                    try {
                        this.zzbvf = arg2;
                        this.zzbvg = zzzb.zzbte;
                    }
                    catch(zzzy ) {
                        this.zzbvf = arg2;
                        this.zzbvg = zzzb.zzbte;
                    }
                }

                __monitor_exit(this);
                goto label_18;
            label_16:
                __monitor_exit(this);
            }
            catch(Throwable v2) {
                goto label_16;
            }

            throw v2;
        }

    label_18:
        return this.zzbvf;
    }

    public final zzaaq zzc(zzaaq arg3) {
        zzaaq v0 = this.zzbvf;
        this.zzbve = null;
        this.zzbvg = null;
        this.zzbvf = arg3;
        return v0;
    }

    private final zzzb zzue() {
        if(this.zzbvg != null) {
            return this.zzbvg;
        }

        __monitor_enter(this);
        try {
            if(this.zzbvg != null) {
                __monitor_exit(this);
                return this.zzbvg;
            }

            zzzb v0_1 = this.zzbvf == null ? zzzb.zzbte : this.zzbvf.zzue();
            this.zzbvg = v0_1;
            __monitor_exit(this);
            return this.zzbvg;
        label_22:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_22;
        }

        throw v0;
    }
}

