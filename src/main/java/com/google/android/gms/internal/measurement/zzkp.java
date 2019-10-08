package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkp extends zzacd {
    public Integer zzate;
    private static volatile zzkp[] zzaus;
    public zzkv zzaut;
    public zzkv zzauu;
    public Boolean zzauv;

    public zzkp() {
        super();
        this.zzate = null;
        this.zzaut = null;
        this.zzauu = null;
        this.zzauv = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkp)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkp)) {
            return 0;
        }

        if(this.zzate == null) {
            if(((zzkp)arg5).zzate != null) {
                return 0;
            }
        }
        else if(!this.zzate.equals(((zzkp)arg5).zzate)) {
            return 0;
        }

        if(this.zzaut == null) {
            if(((zzkp)arg5).zzaut != null) {
                return 0;
            }
        }
        else if(!this.zzaut.equals(((zzkp)arg5).zzaut)) {
            return 0;
        }

        if(this.zzauu == null) {
            if(((zzkp)arg5).zzauu != null) {
                return 0;
            }
        }
        else if(!this.zzauu.equals(((zzkp)arg5).zzauu)) {
            return 0;
        }

        if(this.zzauv == null) {
            if(((zzkp)arg5).zzauv != null) {
                return 0;
            }
        }
        else if(!this.zzauv.equals(((zzkp)arg5).zzauv)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkp)arg5).zzbzd);
            }
        }

        if(((zzkp)arg5).zzbzd != null) {
            if(((zzkp)arg5).zzbzd.isEmpty()) {
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
        v0 += v1;
        zzkv v1_1 = this.zzaut;
        v0 *= 0x1F;
        v1 = v1_1 == null ? 0 : v1_1.hashCode();
        v0 += v1;
        v1_1 = this.zzauu;
        v0 *= 0x1F;
        v1 = v1_1 == null ? 0 : v1_1.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzauv == null ? 0 : this.zzauv.hashCode();
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

        if(this.zzaut != null) {
            v0 += zzacb.zzb(2, this.zzaut);
        }

        if(this.zzauu != null) {
            v0 += zzacb.zzb(3, this.zzauu);
        }

        if(this.zzauv != null) {
            this.zzauv.booleanValue();
            v0 += zzacb.zzaq(4) + 1;
        }

        return v0;
    }

    public final void zza(zzacb arg3) throws IOException {
        if(this.zzate != null) {
            arg3.zze(1, this.zzate.intValue());
        }

        if(this.zzaut != null) {
            arg3.zza(2, this.zzaut);
        }

        if(this.zzauu != null) {
            arg3.zza(3, this.zzauu);
        }

        if(this.zzauv != null) {
            arg3.zza(4, this.zzauv.booleanValue());
        }

        super.zza(arg3);
    }

    public final zzacj zzb(zzaca arg3) throws IOException {
        zzkv v0_1;
        while(true) {
            int v0 = arg3.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 != 8) {
                if(v0 == 18) {
                    if(this.zzaut == null) {
                        this.zzaut = new zzkv();
                    }

                    v0_1 = this.zzaut;
                }
                else if(v0 == 26) {
                    if(this.zzauu == null) {
                        this.zzauu = new zzkv();
                    }

                    v0_1 = this.zzauu;
                }
                else if(v0 != 0x20) {
                    if(super.zza(arg3, v0)) {
                        continue;
                    }

                    return this;
                }
                else {
                    this.zzauv = Boolean.valueOf(arg3.zzvm());
                    continue;
                }

                arg3.zza(((zzacj)v0_1));
                continue;
            }

            this.zzate = Integer.valueOf(arg3.zzvn());
        }

        return this;
    }

    public static zzkp[] zzlw() {
        if(zzkp.zzaus == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzkp.zzaus == null) {
                    zzkp.zzaus = new zzkp[0];
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
        return zzkp.zzaus;
    }
}

