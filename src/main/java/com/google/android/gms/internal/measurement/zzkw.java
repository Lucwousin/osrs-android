package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkw extends zzacd {
    private Integer zzaux;
    private static volatile zzkw[] zzawp;
    private long[] zzawq;

    public zzkw() {
        super();
        this.zzaux = null;
        this.zzawq = zzacm.zzbzt;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkw)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkw)) {
            return 0;
        }

        if(this.zzaux == null) {
            if(((zzkw)arg5).zzaux != null) {
                return 0;
            }
        }
        else if(!this.zzaux.equals(((zzkw)arg5).zzaux)) {
            return 0;
        }

        if(!zzach.equals(this.zzawq, ((zzkw)arg5).zzawq)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkw)arg5).zzbzd);
            }
        }

        if(((zzkw)arg5).zzbzd != null) {
            if(((zzkw)arg5).zzbzd.isEmpty()) {
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
        v0 = ((v0 + v1) * 0x1F + zzach.hashCode(this.zzawq)) * 0x1F;
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

        if(this.zzawq != null && this.zzawq.length > 0) {
            int v1 = 0;
            int v3 = 0;
            while(v1 < this.zzawq.length) {
                v3 += zzacb.zzat(this.zzawq[v1]);
                ++v1;
            }

            v0 = v0 + v3 + this.zzawq.length;
        }

        return v0;
    }

    public final void zza(zzacb arg6) throws IOException {
        if(this.zzaux != null) {
            arg6.zze(1, this.zzaux.intValue());
        }

        if(this.zzawq != null && this.zzawq.length > 0) {
            int v0;
            for(v0 = 0; v0 < this.zzawq.length; ++v0) {
                arg6.zzb(2, this.zzawq[v0]);
            }
        }

        super.zza(arg6);
    }

    public final zzacj zzb(zzaca arg7) throws IOException {
        long[] v0_1;
        int v3;
        int v1;
        int v0;
        while(true) {
        label_0:
            v0 = arg7.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 == 8) {
                goto label_66;
            }

            v1 = 16;
            if(v0 != v1) {
                if(v0 != 18) {
                    if(super.zza(arg7, v0)) {
                        continue;
                    }

                    return this;
                }

                v0 = arg7.zzaf(arg7.zzvn());
                v1 = arg7.getPosition();
                v3 = 0;
                goto label_16;
            }

            v0 = zzacm.zzb(arg7, v1);
            v1 = this.zzawq == null ? 0 : this.zzawq.length;
            v0_1 = new long[v0 + v1];
            if(v1 != 0) {
                System.arraycopy(this.zzawq, 0, v0_1, 0, v1);
                goto label_54;
            label_66:
                this.zzaux = Integer.valueOf(arg7.zzvn());
                continue;
            }

            goto label_54;
        }

        return this;
    label_54:
        while(v1 < v0_1.length - 1) {
            v0_1[v1] = arg7.zzvo();
            arg7.zzvl();
            ++v1;
        }

        v0_1[v1] = arg7.zzvo();
        this.zzawq = v0_1;
        goto label_0;
    label_16:
        while(arg7.zzvr() > 0) {
            arg7.zzvo();
            ++v3;
        }

        arg7.zzam(v1);
        v1 = this.zzawq == null ? 0 : this.zzawq.length;
        long[] v3_1 = new long[v3 + v1];
        if(v1 != 0) {
            System.arraycopy(this.zzawq, 0, v3_1, 0, v1);
        }

        while(v1 < v3_1.length) {
            v3_1[v1] = arg7.zzvo();
            ++v1;
        }

        this.zzawq = v3_1;
        arg7.zzal(v0);
        goto label_0;
    }

    public static zzkw[] zzmb() {
        if(zzkw.zzawp == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzkw.zzawp == null) {
                    zzkw.zzawp = new zzkw[0];
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
        return zzkw.zzawp;
    }
}

