package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkv extends zzacd {
    public long[] zzawl;
    public long[] zzawm;
    public zzkq[] zzawn;
    private zzkw[] zzawo;

    public zzkv() {
        super();
        this.zzawl = zzacm.zzbzt;
        this.zzawm = zzacm.zzbzt;
        this.zzawn = zzkq.zzlx();
        this.zzawo = zzkw.zzmb();
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkv)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkv)) {
            return 0;
        }

        if(!zzach.equals(this.zzawl, ((zzkv)arg5).zzawl)) {
            return 0;
        }

        if(!zzach.equals(this.zzawm, ((zzkv)arg5).zzawm)) {
            return 0;
        }

        if(!zzach.equals(this.zzawn, ((zzkv)arg5).zzawn)) {
            return 0;
        }

        if(!zzach.equals(this.zzawo, ((zzkv)arg5).zzawo)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkv)arg5).zzbzd);
            }
        }

        if(((zzkv)arg5).zzbzd != null) {
            if(((zzkv)arg5).zzbzd.isEmpty()) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public final int hashCode() {
        int v0 = (((((this.getClass().getName().hashCode() + 0x20F) * 0x1F + zzach.hashCode(this.zzawl)) * 0x1F + zzach.hashCode(this.zzawm)) * 0x1F + zzach.hashCode(this.zzawn)) * 0x1F + zzach.hashCode(this.zzawo)) * 0x1F;
        int v1 = this.zzbzd == null || (this.zzbzd.isEmpty()) ? 0 : this.zzbzd.hashCode();
        return v0 + v1;
    }

    protected final int zza() {
        int v3;
        int v1;
        int v0 = super.zza();
        int v2 = 0;
        if(this.zzawl != null && this.zzawl.length > 0) {
            v1 = 0;
            v3 = 0;
            while(v1 < this.zzawl.length) {
                v3 += zzacb.zzat(this.zzawl[v1]);
                ++v1;
            }

            v0 = v0 + v3 + this.zzawl.length;
        }

        if(this.zzawm != null && this.zzawm.length > 0) {
            v1 = 0;
            v3 = 0;
            while(v1 < this.zzawm.length) {
                v3 += zzacb.zzat(this.zzawm[v1]);
                ++v1;
            }

            v0 = v0 + v3 + this.zzawm.length;
        }

        if(this.zzawn != null && this.zzawn.length > 0) {
            v1 = v0;
            for(v0 = 0; v0 < this.zzawn.length; ++v0) {
                zzkq v3_1 = this.zzawn[v0];
                if(v3_1 != null) {
                    v1 += zzacb.zzb(3, ((zzacj)v3_1));
                }
            }

            v0 = v1;
        }

        if(this.zzawo != null && this.zzawo.length > 0) {
            while(v2 < this.zzawo.length) {
                zzkw v1_1 = this.zzawo[v2];
                if(v1_1 != null) {
                    v0 += zzacb.zzb(4, ((zzacj)v1_1));
                }

                ++v2;
            }
        }

        return v0;
    }

    public final void zza(zzacb arg7) throws IOException {
        int v1 = 0;
        if(this.zzawl != null && this.zzawl.length > 0) {
            int v0;
            for(v0 = 0; v0 < this.zzawl.length; ++v0) {
                arg7.zza(1, this.zzawl[v0]);
            }
        }

        if(this.zzawm != null && this.zzawm.length > 0) {
            for(v0 = 0; v0 < this.zzawm.length; ++v0) {
                arg7.zza(2, this.zzawm[v0]);
            }
        }

        if(this.zzawn != null && this.zzawn.length > 0) {
            for(v0 = 0; v0 < this.zzawn.length; ++v0) {
                zzkq v2 = this.zzawn[v0];
                if(v2 != null) {
                    arg7.zza(3, ((zzacj)v2));
                }
            }
        }

        if(this.zzawo != null && this.zzawo.length > 0) {
            while(v1 < this.zzawo.length) {
                zzkw v0_1 = this.zzawo[v1];
                if(v0_1 != null) {
                    arg7.zza(4, ((zzacj)v0_1));
                }

                ++v1;
            }
        }

        super.zza(arg7);
    }

    public final zzacj zzb(zzaca arg7) throws IOException {
        long[] v3_1;
        int v1;
        int v0;
        do {
        label_0:
            v0 = arg7.zzvl();
            if(v0 == 0) {
                return this;
            }

            v1 = 8;
            if(v0 == v1) {
                goto label_161;
            }

            if(v0 != 10) {
                v1 = 16;
                if(v0 == v1) {
                    goto label_107;
                }
                else if(v0 != 18) {
                    v1 = 26;
                    if(v0 != v1) {
                        v1 = 34;
                        if(v0 != v1) {
                            if(super.zza(arg7, v0)) {
                                continue;
                            }

                            return this;
                        }
                        else {
                            goto label_18;
                        }
                    }
                    else {
                        goto label_48;
                    }
                }
                else {
                    goto label_78;
                }
            }
            else {
                goto label_131;
            }

            goto label_159;
        }
        while(true);

        return this;
    label_18:
        v0 = zzacm.zzb(arg7, v1);
        v1 = this.zzawo == null ? 0 : this.zzawo.length;
        zzkw[] v0_1 = new zzkw[v0 + v1];
        if(v1 != 0) {
            System.arraycopy(this.zzawo, 0, v0_1, 0, v1);
            goto label_30;
        label_48:
            v0 = zzacm.zzb(arg7, v1);
            v1 = this.zzawn == null ? 0 : this.zzawn.length;
            zzkq[] v0_2 = new zzkq[v0 + v1];
            if(v1 != 0) {
                System.arraycopy(this.zzawn, 0, v0_2, 0, v1);
                goto label_60;
            label_78:
                v0 = arg7.zzaf(arg7.zzvn());
                v1 = arg7.getPosition();
                int v3 = 0;
                goto label_82;
            label_107:
                v0 = zzacm.zzb(arg7, v1);
                v1 = this.zzawm == null ? 0 : this.zzawm.length;
                long[] v0_3 = new long[v0 + v1];
                if(v1 != 0) {
                    System.arraycopy(this.zzawm, 0, v0_3, 0, v1);
                    goto label_119;
                label_131:
                    v0 = arg7.zzaf(arg7.zzvn());
                    v1 = arg7.getPosition();
                    v3 = 0;
                    goto label_135;
                label_161:
                    v0 = zzacm.zzb(arg7, v1);
                    v1 = this.zzawl == null ? 0 : this.zzawl.length;
                    v0_3 = new long[v0 + v1];
                    if(v1 != 0) {
                        System.arraycopy(this.zzawl, 0, v0_3, 0, v1);
                        goto label_173;
                        return this;
                    }

                label_173:
                    while(v1 < v0_3.length - 1) {
                        v0_3[v1] = arg7.zzvo();
                        arg7.zzvl();
                        ++v1;
                    }

                    v0_3[v1] = arg7.zzvo();
                    this.zzawl = v0_3;
                    goto label_0;
                label_135:
                    while(arg7.zzvr() > 0) {
                        arg7.zzvo();
                        ++v3;
                    }

                    arg7.zzam(v1);
                    v1 = this.zzawl == null ? 0 : this.zzawl.length;
                    v3_1 = new long[v3 + v1];
                    if(v1 != 0) {
                        System.arraycopy(this.zzawl, 0, v3_1, 0, v1);
                    }

                    while(v1 < v3_1.length) {
                        v3_1[v1] = arg7.zzvo();
                        ++v1;
                    }

                    this.zzawl = v3_1;
                    goto label_159;
                }

            label_119:
                while(v1 < v0_3.length - 1) {
                    v0_3[v1] = arg7.zzvo();
                    arg7.zzvl();
                    ++v1;
                }

                v0_3[v1] = arg7.zzvo();
                this.zzawm = v0_3;
                goto label_0;
            label_82:
                while(arg7.zzvr() > 0) {
                    arg7.zzvo();
                    ++v3;
                }

                arg7.zzam(v1);
                v1 = this.zzawm == null ? 0 : this.zzawm.length;
                v3_1 = new long[v3 + v1];
                if(v1 != 0) {
                    System.arraycopy(this.zzawm, 0, v3_1, 0, v1);
                }

                while(v1 < v3_1.length) {
                    v3_1[v1] = arg7.zzvo();
                    ++v1;
                }

                this.zzawm = v3_1;
            label_159:
                arg7.zzal(v0);
                goto label_0;
            }

        label_60:
            while(v1 < v0_2.length - 1) {
                v0_2[v1] = new zzkq();
                arg7.zza(v0_2[v1]);
                arg7.zzvl();
                ++v1;
            }

            v0_2[v1] = new zzkq();
            arg7.zza(v0_2[v1]);
            this.zzawn = v0_2;
            goto label_0;
        }

    label_30:
        while(v1 < v0_1.length - 1) {
            v0_1[v1] = new zzkw();
            arg7.zza(v0_1[v1]);
            arg7.zzvl();
            ++v1;
        }

        v0_1[v1] = new zzkw();
        arg7.zza(v0_1[v1]);
        this.zzawo = v0_1;
        goto label_0;
    }
}

