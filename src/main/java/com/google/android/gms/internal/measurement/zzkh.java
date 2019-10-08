package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkh extends zzacd {
    private static volatile zzkh[] zzatj;
    public Integer zzatk;
    public String zzatl;
    public zzki[] zzatm;
    private Boolean zzatn;
    public zzkj zzato;

    public zzkh() {
        super();
        this.zzatk = null;
        this.zzatl = null;
        this.zzatm = zzki.zzls();
        this.zzatn = null;
        this.zzato = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkh)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkh)) {
            return 0;
        }

        if(this.zzatk == null) {
            if(((zzkh)arg5).zzatk != null) {
                return 0;
            }
        }
        else if(!this.zzatk.equals(((zzkh)arg5).zzatk)) {
            return 0;
        }

        if(this.zzatl == null) {
            if(((zzkh)arg5).zzatl != null) {
                return 0;
            }
        }
        else if(!this.zzatl.equals(((zzkh)arg5).zzatl)) {
            return 0;
        }

        if(!zzach.equals(this.zzatm, ((zzkh)arg5).zzatm)) {
            return 0;
        }

        if(this.zzatn == null) {
            if(((zzkh)arg5).zzatn != null) {
                return 0;
            }
        }
        else if(!this.zzatn.equals(((zzkh)arg5).zzatn)) {
            return 0;
        }

        if(this.zzato == null) {
            if(((zzkh)arg5).zzato != null) {
                return 0;
            }
        }
        else if(!this.zzato.equals(((zzkh)arg5).zzato)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkh)arg5).zzbzd);
            }
        }

        if(((zzkh)arg5).zzbzd != null) {
            if(((zzkh)arg5).zzbzd.isEmpty()) {
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
        int v1 = this.zzatk == null ? 0 : this.zzatk.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzatl == null ? 0 : this.zzatl.hashCode();
        v0 = ((v0 + v1) * 0x1F + zzach.hashCode(this.zzatm)) * 0x1F;
        v1 = this.zzatn == null ? 0 : this.zzatn.hashCode();
        v0 += v1;
        zzkj v1_1 = this.zzato;
        v0 *= 0x1F;
        v1 = v1_1 == null ? 0 : v1_1.hashCode();
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
        if(this.zzatk != null) {
            v0 += zzacb.zzf(1, this.zzatk.intValue());
        }

        if(this.zzatl != null) {
            v0 += zzacb.zzc(2, this.zzatl);
        }

        if(this.zzatm != null && this.zzatm.length > 0) {
            int v1;
            for(v1 = 0; v1 < this.zzatm.length; ++v1) {
                zzki v3 = this.zzatm[v1];
                if(v3 != null) {
                    v0 += zzacb.zzb(3, ((zzacj)v3));
                }
            }
        }

        if(this.zzatn != null) {
            this.zzatn.booleanValue();
            v0 += zzacb.zzaq(4) + 1;
        }

        if(this.zzato != null) {
            v0 += zzacb.zzb(5, this.zzato);
        }

        return v0;
    }

    public final void zza(zzacb arg4) throws IOException {
        if(this.zzatk != null) {
            arg4.zze(1, this.zzatk.intValue());
        }

        if(this.zzatl != null) {
            arg4.zzb(2, this.zzatl);
        }

        if(this.zzatm != null && this.zzatm.length > 0) {
            int v0;
            for(v0 = 0; v0 < this.zzatm.length; ++v0) {
                zzki v1 = this.zzatm[v0];
                if(v1 != null) {
                    arg4.zza(3, ((zzacj)v1));
                }
            }
        }

        if(this.zzatn != null) {
            arg4.zza(4, this.zzatn.booleanValue());
        }

        if(this.zzato != null) {
            arg4.zza(5, this.zzato);
        }

        super.zza(arg4);
    }

    public final zzacj zzb(zzaca arg5) throws IOException {
        zzki[] v0_1;
        int v1;
        while(true) {
        label_0:
            int v0 = arg5.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 == 8) {
                goto label_61;
            }

            if(v0 == 18) {
                goto label_58;
            }

            v1 = 26;
            if(v0 != v1) {
                if(v0 != 0x20) {
                    if(v0 != 42) {
                        if(super.zza(arg5, v0)) {
                            continue;
                        }

                        return this;
                    }

                    if(this.zzato == null) {
                        this.zzato = new zzkj();
                    }

                    arg5.zza(this.zzato);
                    continue;
                }

                this.zzatn = Boolean.valueOf(arg5.zzvm());
                continue;
            }

            v0 = zzacm.zzb(arg5, v1);
            v1 = this.zzatm == null ? 0 : this.zzatm.length;
            v0_1 = new zzki[v0 + v1];
            if(v1 != 0) {
                System.arraycopy(this.zzatm, 0, v0_1, 0, v1);
                goto label_40;
            label_58:
                this.zzatl = arg5.readString();
                continue;
            label_61:
                this.zzatk = Integer.valueOf(arg5.zzvn());
                continue;
            }

            goto label_40;
        }

        return this;
    label_40:
        while(v1 < v0_1.length - 1) {
            v0_1[v1] = new zzki();
            arg5.zza(v0_1[v1]);
            arg5.zzvl();
            ++v1;
        }

        v0_1[v1] = new zzki();
        arg5.zza(v0_1[v1]);
        this.zzatm = v0_1;
        goto label_0;
    }

    public static zzkh[] zzlr() {
        if(zzkh.zzatj == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzkh.zzatj == null) {
                    zzkh.zzatj = new zzkh[0];
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
        return zzkh.zzatj;
    }
}

