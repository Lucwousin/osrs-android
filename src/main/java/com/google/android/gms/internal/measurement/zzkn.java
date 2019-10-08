package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkn extends zzacd {
    public String zzafa;
    public Long zzaum;
    private Integer zzaun;
    public zzko[] zzauo;
    public zzkm[] zzaup;
    public zzkg[] zzauq;

    public zzkn() {
        super();
        this.zzaum = null;
        this.zzafa = null;
        this.zzaun = null;
        this.zzauo = zzko.zzlv();
        this.zzaup = zzkm.zzlu();
        this.zzauq = zzkg.zzlq();
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkn)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkn)) {
            return 0;
        }

        if(this.zzaum == null) {
            if(((zzkn)arg5).zzaum != null) {
                return 0;
            }
        }
        else if(!this.zzaum.equals(((zzkn)arg5).zzaum)) {
            return 0;
        }

        if(this.zzafa == null) {
            if(((zzkn)arg5).zzafa != null) {
                return 0;
            }
        }
        else if(!this.zzafa.equals(((zzkn)arg5).zzafa)) {
            return 0;
        }

        if(this.zzaun == null) {
            if(((zzkn)arg5).zzaun != null) {
                return 0;
            }
        }
        else if(!this.zzaun.equals(((zzkn)arg5).zzaun)) {
            return 0;
        }

        if(!zzach.equals(this.zzauo, ((zzkn)arg5).zzauo)) {
            return 0;
        }

        if(!zzach.equals(this.zzaup, ((zzkn)arg5).zzaup)) {
            return 0;
        }

        if(!zzach.equals(this.zzauq, ((zzkn)arg5).zzauq)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkn)arg5).zzbzd);
            }
        }

        if(((zzkn)arg5).zzbzd != null) {
            if(((zzkn)arg5).zzbzd.isEmpty()) {
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
        int v1 = this.zzaum == null ? 0 : this.zzaum.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzafa == null ? 0 : this.zzafa.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzaun == null ? 0 : this.zzaun.hashCode();
        v0 = ((((v0 + v1) * 0x1F + zzach.hashCode(this.zzauo)) * 0x1F + zzach.hashCode(this.zzaup)) * 0x1F + zzach.hashCode(this.zzauq)) * 0x1F;
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
        int v1;
        int v0 = super.zza();
        if(this.zzaum != null) {
            v0 += zzacb.zzc(1, this.zzaum.longValue());
        }

        if(this.zzafa != null) {
            v0 += zzacb.zzc(2, this.zzafa);
        }

        if(this.zzaun != null) {
            v0 += zzacb.zzf(3, this.zzaun.intValue());
        }

        int v2 = 0;
        if(this.zzauo != null && this.zzauo.length > 0) {
            v1 = v0;
            for(v0 = 0; v0 < this.zzauo.length; ++v0) {
                zzko v3 = this.zzauo[v0];
                if(v3 != null) {
                    v1 += zzacb.zzb(4, ((zzacj)v3));
                }
            }

            v0 = v1;
        }

        if(this.zzaup != null && this.zzaup.length > 0) {
            v1 = v0;
            for(v0 = 0; v0 < this.zzaup.length; ++v0) {
                zzkm v3_1 = this.zzaup[v0];
                if(v3_1 != null) {
                    v1 += zzacb.zzb(5, ((zzacj)v3_1));
                }
            }

            v0 = v1;
        }

        if(this.zzauq != null && this.zzauq.length > 0) {
            while(v2 < this.zzauq.length) {
                zzkg v1_1 = this.zzauq[v2];
                if(v1_1 != null) {
                    v0 += zzacb.zzb(6, ((zzacj)v1_1));
                }

                ++v2;
            }
        }

        return v0;
    }

    public final void zza(zzacb arg5) throws IOException {
        if(this.zzaum != null) {
            arg5.zzb(1, this.zzaum.longValue());
        }

        if(this.zzafa != null) {
            arg5.zzb(2, this.zzafa);
        }

        if(this.zzaun != null) {
            arg5.zze(3, this.zzaun.intValue());
        }

        int v1 = 0;
        if(this.zzauo != null && this.zzauo.length > 0) {
            int v0;
            for(v0 = 0; v0 < this.zzauo.length; ++v0) {
                zzko v2 = this.zzauo[v0];
                if(v2 != null) {
                    arg5.zza(4, ((zzacj)v2));
                }
            }
        }

        if(this.zzaup != null && this.zzaup.length > 0) {
            for(v0 = 0; v0 < this.zzaup.length; ++v0) {
                zzkm v2_1 = this.zzaup[v0];
                if(v2_1 != null) {
                    arg5.zza(5, ((zzacj)v2_1));
                }
            }
        }

        if(this.zzauq != null && this.zzauq.length > 0) {
            while(v1 < this.zzauq.length) {
                zzkg v0_1 = this.zzauq[v1];
                if(v0_1 != null) {
                    arg5.zza(6, ((zzacj)v0_1));
                }

                ++v1;
            }
        }

        super.zza(arg5);
    }

    public final zzacj zzb(zzaca arg5) throws IOException {
        zzko[] v0_3;
        zzkm[] v0_2;
        zzkg[] v0_1;
        int v1;
        while(true) {
        label_0:
            int v0 = arg5.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 == 8) {
                goto label_115;
            }

            if(v0 == 18) {
                goto label_112;
            }

            if(v0 == 24) {
                goto label_108;
            }

            v1 = 34;
            if(v0 == v1) {
                goto label_78;
            }

            v1 = 42;
            if(v0 == v1) {
                goto label_48;
            }

            v1 = 50;
            if(v0 != v1) {
                if(super.zza(arg5, v0)) {
                    continue;
                }

                return this;
            }

            v0 = zzacm.zzb(arg5, v1);
            v1 = this.zzauq == null ? 0 : this.zzauq.length;
            v0_1 = new zzkg[v0 + v1];
            if(v1 != 0) {
                System.arraycopy(this.zzauq, 0, v0_1, 0, v1);
                goto label_30;
            label_48:
                v0 = zzacm.zzb(arg5, v1);
                v1 = this.zzaup == null ? 0 : this.zzaup.length;
                v0_2 = new zzkm[v0 + v1];
                if(v1 != 0) {
                    System.arraycopy(this.zzaup, 0, v0_2, 0, v1);
                    goto label_60;
                label_78:
                    v0 = zzacm.zzb(arg5, v1);
                    v1 = this.zzauo == null ? 0 : this.zzauo.length;
                    v0_3 = new zzko[v0 + v1];
                    if(v1 != 0) {
                        System.arraycopy(this.zzauo, 0, v0_3, 0, v1);
                        goto label_90;
                    label_108:
                        this.zzaun = Integer.valueOf(arg5.zzvn());
                        continue;
                    label_112:
                        this.zzafa = arg5.readString();
                        continue;
                    label_115:
                        this.zzaum = Long.valueOf(arg5.zzvo());
                        continue;
                    }

                    goto label_90;
                }

                goto label_60;
            }

            goto label_30;
        }

        return this;
    label_90:
        while(v1 < v0_3.length - 1) {
            v0_3[v1] = new zzko();
            arg5.zza(v0_3[v1]);
            arg5.zzvl();
            ++v1;
        }

        v0_3[v1] = new zzko();
        arg5.zza(v0_3[v1]);
        this.zzauo = v0_3;
        goto label_0;
    label_60:
        while(v1 < v0_2.length - 1) {
            v0_2[v1] = new zzkm();
            arg5.zza(v0_2[v1]);
            arg5.zzvl();
            ++v1;
        }

        v0_2[v1] = new zzkm();
        arg5.zza(v0_2[v1]);
        this.zzaup = v0_2;
        goto label_0;
    label_30:
        while(v1 < v0_1.length - 1) {
            v0_1[v1] = new zzkg();
            arg5.zza(v0_1[v1]);
            arg5.zzvl();
            ++v1;
        }

        v0_1[v1] = new zzkg();
        arg5.zza(v0_1[v1]);
        this.zzauq = v0_1;
        goto label_0;
    }
}

