package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkr extends zzacd {
    public Integer count;
    public String name;
    private static volatile zzkr[] zzauz;
    public zzks[] zzava;
    public Long zzavb;
    public Long zzavc;

    public zzkr() {
        super();
        this.zzava = zzks.zzlz();
        this.name = null;
        this.zzavb = null;
        this.zzavc = null;
        this.count = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkr)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkr)) {
            return 0;
        }

        if(!zzach.equals(this.zzava, ((zzkr)arg5).zzava)) {
            return 0;
        }

        if(this.name == null) {
            if(((zzkr)arg5).name != null) {
                return 0;
            }
        }
        else if(!this.name.equals(((zzkr)arg5).name)) {
            return 0;
        }

        if(this.zzavb == null) {
            if(((zzkr)arg5).zzavb != null) {
                return 0;
            }
        }
        else if(!this.zzavb.equals(((zzkr)arg5).zzavb)) {
            return 0;
        }

        if(this.zzavc == null) {
            if(((zzkr)arg5).zzavc != null) {
                return 0;
            }
        }
        else if(!this.zzavc.equals(((zzkr)arg5).zzavc)) {
            return 0;
        }

        if(this.count == null) {
            if(((zzkr)arg5).count != null) {
                return 0;
            }
        }
        else if(!this.count.equals(((zzkr)arg5).count)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkr)arg5).zzbzd);
            }
        }

        if(((zzkr)arg5).zzbzd != null) {
            if(((zzkr)arg5).zzbzd.isEmpty()) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public final int hashCode() {
        int v0 = ((this.getClass().getName().hashCode() + 0x20F) * 0x1F + zzach.hashCode(this.zzava)) * 0x1F;
        int v2 = 0;
        int v1 = this.name == null ? 0 : this.name.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzavb == null ? 0 : this.zzavb.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzavc == null ? 0 : this.zzavc.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.count == null ? 0 : this.count.hashCode();
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
        if(this.zzava != null && this.zzava.length > 0) {
            int v1;
            for(v1 = 0; v1 < this.zzava.length; ++v1) {
                zzks v2 = this.zzava[v1];
                if(v2 != null) {
                    v0 += zzacb.zzb(1, ((zzacj)v2));
                }
            }
        }

        if(this.name != null) {
            v0 += zzacb.zzc(2, this.name);
        }

        if(this.zzavb != null) {
            v0 += zzacb.zzc(3, this.zzavb.longValue());
        }

        if(this.zzavc != null) {
            v0 += zzacb.zzc(4, this.zzavc.longValue());
        }

        if(this.count != null) {
            v0 += zzacb.zzf(5, this.count.intValue());
        }

        return v0;
    }

    public final void zza(zzacb arg4) throws IOException {
        if(this.zzava != null && this.zzava.length > 0) {
            int v0;
            for(v0 = 0; v0 < this.zzava.length; ++v0) {
                zzks v1 = this.zzava[v0];
                if(v1 != null) {
                    arg4.zza(1, ((zzacj)v1));
                }
            }
        }

        if(this.name != null) {
            arg4.zzb(2, this.name);
        }

        if(this.zzavb != null) {
            arg4.zzb(3, this.zzavb.longValue());
        }

        if(this.zzavc != null) {
            arg4.zzb(4, this.zzavc.longValue());
        }

        if(this.count != null) {
            arg4.zze(5, this.count.intValue());
        }

        super.zza(arg4);
    }

    public final zzacj zzb(zzaca arg5) throws IOException {
        int v1;
        int v0;
        while(true) {
        label_0:
            v0 = arg5.zzvl();
            if(v0 == 0) {
                return this;
            }

            v1 = 10;
            if(v0 == v1) {
                break;
            }

            if(v0 != 18) {
                if(v0 != 24) {
                    if(v0 != 0x20) {
                        if(v0 != 40) {
                            if(super.zza(arg5, v0)) {
                                continue;
                            }

                            return this;
                        }

                        this.count = Integer.valueOf(arg5.zzvn());
                        continue;
                    }

                    this.zzavc = Long.valueOf(arg5.zzvo());
                    continue;
                }

                this.zzavb = Long.valueOf(arg5.zzvo());
                continue;
            }

            this.name = arg5.readString();
        }

        v0 = zzacm.zzb(arg5, v1);
        v1 = this.zzava == null ? 0 : this.zzava.length;
        zzks[] v0_1 = new zzks[v0 + v1];
        if(v1 != 0) {
            System.arraycopy(this.zzava, 0, v0_1, 0, v1);
            goto label_43;
            return this;
        }

    label_43:
        while(v1 < v0_1.length - 1) {
            v0_1[v1] = new zzks();
            arg5.zza(v0_1[v1]);
            arg5.zzvl();
            ++v1;
        }

        v0_1[v1] = new zzks();
        arg5.zza(v0_1[v1]);
        this.zzava = v0_1;
        goto label_0;
    }

    public static zzkr[] zzly() {
        if(zzkr.zzauz == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzkr.zzauz == null) {
                    zzkr.zzauz = new zzkr[0];
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
        return zzkr.zzauz;
    }
}

