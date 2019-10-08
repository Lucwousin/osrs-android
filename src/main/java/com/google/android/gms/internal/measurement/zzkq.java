package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkq extends zzacd {
    private static volatile zzkq[] zzauw;
    public Integer zzaux;
    public Long zzauy;

    public zzkq() {
        super();
        this.zzaux = null;
        this.zzauy = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkq)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkq)) {
            return 0;
        }

        if(this.zzaux == null) {
            if(((zzkq)arg5).zzaux != null) {
                return 0;
            }
        }
        else if(!this.zzaux.equals(((zzkq)arg5).zzaux)) {
            return 0;
        }

        if(this.zzauy == null) {
            if(((zzkq)arg5).zzauy != null) {
                return 0;
            }
        }
        else if(!this.zzauy.equals(((zzkq)arg5).zzauy)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkq)arg5).zzbzd);
            }
        }

        if(((zzkq)arg5).zzbzd != null) {
            if(((zzkq)arg5).zzbzd.isEmpty()) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public final int hashCode() {
        int v0 = (this.getClass().getName().hashCode() + 0x20F) * 0x1F;
        int v2 = 0;
        int v1 = this.zzaux == null ? 0 : this.zzaux.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzauy == null ? 0 : this.zzauy.hashCode();
        v0 = (v0 + v1) * 0x1F;
        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                v2 = this.zzbzd.hashCode();
            }
        }

        return v0 + v2;
    }

    protected final int zza() {
        int v0 = super.zza();
        if(this.zzaux != null) {
            v0 += zzacb.zzf(1, this.zzaux.intValue());
        }

        if(this.zzauy != null) {
            v0 += zzacb.zzc(2, this.zzauy.longValue());
        }

        return v0;
    }

    public final void zza(zzacb arg4) throws IOException {
        if(this.zzaux != null) {
            arg4.zze(1, this.zzaux.intValue());
        }

        if(this.zzauy != null) {
            arg4.zzb(2, this.zzauy.longValue());
        }

        super.zza(arg4);
    }

    public final zzacj zzb(zzaca arg3) throws IOException {
        while(true) {
            int v0 = arg3.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 != 8) {
                if(v0 != 16) {
                    if(super.zza(arg3, v0)) {
                        continue;
                    }

                    return this;
                }

                this.zzauy = Long.valueOf(arg3.zzvo());
                continue;
            }

            this.zzaux = Integer.valueOf(arg3.zzvn());
        }

        return this;
    }

    public static zzkq[] zzlx() {
        if(zzkq.zzauw == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzkq.zzauw == null) {
                    zzkq.zzauw = new zzkq[0];
                }

                __monitor_exit(v0);
                goto label_14;
            label_12:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_12;
            }

            throw v1;
        }

    label_14:
        return zzkq.zzauw;
    }
}

