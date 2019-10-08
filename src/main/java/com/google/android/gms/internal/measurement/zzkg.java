package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkg extends zzacd {
    private static volatile zzkg[] zzatd;
    public Integer zzate;
    public zzkk[] zzatf;
    public zzkh[] zzatg;
    public Boolean zzath;
    public Boolean zzati;

    public zzkg() {
        super();
        this.zzate = null;
        this.zzatf = zzkk.zzlt();
        this.zzatg = zzkh.zzlr();
        this.zzath = null;
        this.zzati = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkg)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkg)) {
            return 0;
        }

        if(this.zzate == null) {
            if(((zzkg)arg5).zzate != null) {
                return 0;
            }
        }
        else if(!this.zzate.equals(((zzkg)arg5).zzate)) {
            return 0;
        }

        if(!zzach.equals(this.zzatf, ((zzkg)arg5).zzatf)) {
            return 0;
        }

        if(!zzach.equals(this.zzatg, ((zzkg)arg5).zzatg)) {
            return 0;
        }

        if(this.zzath == null) {
            if(((zzkg)arg5).zzath != null) {
                return 0;
            }
        }
        else if(!this.zzath.equals(((zzkg)arg5).zzath)) {
            return 0;
        }

        if(this.zzati == null) {
            if(((zzkg)arg5).zzati != null) {
                return 0;
            }
        }
        else if(!this.zzati.equals(((zzkg)arg5).zzati)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkg)arg5).zzbzd);
            }
        }

        if(((zzkg)arg5).zzbzd != null) {
            if(((zzkg)arg5).zzbzd.isEmpty()) {
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
        int v1 = this.zzate == null ? 0 : this.zzate.hashCode();
        v0 = (((v0 + v1) * 0x1F + zzach.hashCode(this.zzatf)) * 0x1F + zzach.hashCode(this.zzatg)) * 0x1F;
        v1 = this.zzath == null ? 0 : this.zzath.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzati == null ? 0 : this.zzati.hashCode();
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
        if(this.zzate != null) {
            v0 += zzacb.zzf(1, this.zzate.intValue());
        }

        int v3 = 0;
        if(this.zzatf != null && this.zzatf.length > 0) {
            int v1 = v0;
            for(v0 = 0; v0 < this.zzatf.length; ++v0) {
                zzkk v4 = this.zzatf[v0];
                if(v4 != null) {
                    v1 += zzacb.zzb(2, ((zzacj)v4));
                }
            }

            v0 = v1;
        }

        if(this.zzatg != null && this.zzatg.length > 0) {
            while(v3 < this.zzatg.length) {
                zzkh v1_1 = this.zzatg[v3];
                if(v1_1 != null) {
                    v0 += zzacb.zzb(3, ((zzacj)v1_1));
                }

                ++v3;
            }
        }

        if(this.zzath != null) {
            this.zzath.booleanValue();
            v0 += zzacb.zzaq(4) + 1;
        }

        if(this.zzati != null) {
            this.zzati.booleanValue();
            v0 += zzacb.zzaq(5) + 1;
        }

        return v0;
    }

    public final void zza(zzacb arg5) throws IOException {
        if(this.zzate != null) {
            arg5.zze(1, this.zzate.intValue());
        }

        int v1 = 0;
        if(this.zzatf != null && this.zzatf.length > 0) {
            int v0;
            for(v0 = 0; v0 < this.zzatf.length; ++v0) {
                zzkk v2 = this.zzatf[v0];
                if(v2 != null) {
                    arg5.zza(2, ((zzacj)v2));
                }
            }
        }

        if(this.zzatg != null && this.zzatg.length > 0) {
            while(v1 < this.zzatg.length) {
                zzkh v0_1 = this.zzatg[v1];
                if(v0_1 != null) {
                    arg5.zza(3, ((zzacj)v0_1));
                }

                ++v1;
            }
        }

        if(this.zzath != null) {
            arg5.zza(4, this.zzath.booleanValue());
        }

        if(this.zzati != null) {
            arg5.zza(5, this.zzati.booleanValue());
        }

        super.zza(arg5);
    }

    public final zzacj zzb(zzaca arg5) throws IOException {
        zzkk[] v0_2;
        zzkh[] v0_1;
        int v1;
        while(true) {
        label_0:
            int v0 = arg5.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 == 8) {
                goto label_84;
            }

            v1 = 18;
            if(v0 == v1) {
                goto label_54;
            }

            v1 = 26;
            if(v0 != v1) {
                if(v0 != 0x20) {
                    if(v0 != 40) {
                        if(super.zza(arg5, v0)) {
                            continue;
                        }

                        return this;
                    }

                    this.zzati = Boolean.valueOf(arg5.zzvm());
                    continue;
                }

                this.zzath = Boolean.valueOf(arg5.zzvm());
                continue;
            }

            v0 = zzacm.zzb(arg5, v1);
            v1 = this.zzatg == null ? 0 : this.zzatg.length;
            v0_1 = new zzkh[v0 + v1];
            if(v1 != 0) {
                System.arraycopy(this.zzatg, 0, v0_1, 0, v1);
                goto label_36;
            label_54:
                v0 = zzacm.zzb(arg5, v1);
                v1 = this.zzatf == null ? 0 : this.zzatf.length;
                v0_2 = new zzkk[v0 + v1];
                if(v1 != 0) {
                    System.arraycopy(this.zzatf, 0, v0_2, 0, v1);
                    goto label_66;
                label_84:
                    this.zzate = Integer.valueOf(arg5.zzvn());
                    continue;
                }

                goto label_66;
            }

            goto label_36;
        }

        return this;
    label_66:
        while(v1 < v0_2.length - 1) {
            v0_2[v1] = new zzkk();
            arg5.zza(v0_2[v1]);
            arg5.zzvl();
            ++v1;
        }

        v0_2[v1] = new zzkk();
        arg5.zza(v0_2[v1]);
        this.zzatf = v0_2;
        goto label_0;
    label_36:
        while(v1 < v0_1.length - 1) {
            v0_1[v1] = new zzkh();
            arg5.zza(v0_1[v1]);
            arg5.zzvl();
            ++v1;
        }

        v0_1[v1] = new zzkh();
        arg5.zza(v0_1[v1]);
        this.zzatg = v0_1;
        goto label_0;
    }

    public static zzkg[] zzlq() {
        if(zzkg.zzatd == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzkg.zzatd == null) {
                    zzkg.zzatd = new zzkg[0];
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
        return zzkg.zzatd;
    }
}

