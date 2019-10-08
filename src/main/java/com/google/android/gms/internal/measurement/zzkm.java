package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkm extends zzacd {
    public String name;
    private static volatile zzkm[] zzaui;
    public Boolean zzauj;
    public Boolean zzauk;
    public Integer zzaul;

    public zzkm() {
        super();
        this.name = null;
        this.zzauj = null;
        this.zzauk = null;
        this.zzaul = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkm)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkm)) {
            return 0;
        }

        if(this.name == null) {
            if(((zzkm)arg5).name != null) {
                return 0;
            }
        }
        else if(!this.name.equals(((zzkm)arg5).name)) {
            return 0;
        }

        if(this.zzauj == null) {
            if(((zzkm)arg5).zzauj != null) {
                return 0;
            }
        }
        else if(!this.zzauj.equals(((zzkm)arg5).zzauj)) {
            return 0;
        }

        if(this.zzauk == null) {
            if(((zzkm)arg5).zzauk != null) {
                return 0;
            }
        }
        else if(!this.zzauk.equals(((zzkm)arg5).zzauk)) {
            return 0;
        }

        if(this.zzaul == null) {
            if(((zzkm)arg5).zzaul != null) {
                return 0;
            }
        }
        else if(!this.zzaul.equals(((zzkm)arg5).zzaul)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkm)arg5).zzbzd);
            }
        }

        if(((zzkm)arg5).zzbzd != null) {
            if(((zzkm)arg5).zzbzd.isEmpty()) {
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
        int v1 = this.name == null ? 0 : this.name.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzauj == null ? 0 : this.zzauj.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzauk == null ? 0 : this.zzauk.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzaul == null ? 0 : this.zzaul.hashCode();
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
        if(this.name != null) {
            v0 += zzacb.zzc(1, this.name);
        }

        if(this.zzauj != null) {
            this.zzauj.booleanValue();
            v0 += zzacb.zzaq(2) + 1;
        }

        if(this.zzauk != null) {
            this.zzauk.booleanValue();
            v0 += zzacb.zzaq(3) + 1;
        }

        if(this.zzaul != null) {
            v0 += zzacb.zzf(4, this.zzaul.intValue());
        }

        return v0;
    }

    public final void zza(zzacb arg3) throws IOException {
        if(this.name != null) {
            arg3.zzb(1, this.name);
        }

        if(this.zzauj != null) {
            arg3.zza(2, this.zzauj.booleanValue());
        }

        if(this.zzauk != null) {
            arg3.zza(3, this.zzauk.booleanValue());
        }

        if(this.zzaul != null) {
            arg3.zze(4, this.zzaul.intValue());
        }

        super.zza(arg3);
    }

    public final zzacj zzb(zzaca arg3) throws IOException {
        while(true) {
            int v0 = arg3.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 != 10) {
                if(v0 != 16) {
                    if(v0 != 24) {
                        if(v0 != 0x20) {
                            if(super.zza(arg3, v0)) {
                                continue;
                            }

                            return this;
                        }

                        this.zzaul = Integer.valueOf(arg3.zzvn());
                        continue;
                    }

                    this.zzauk = Boolean.valueOf(arg3.zzvm());
                    continue;
                }

                this.zzauj = Boolean.valueOf(arg3.zzvm());
                continue;
            }

            this.name = arg3.readString();
        }

        return this;
    }

    public static zzkm[] zzlu() {
        if(zzkm.zzaui == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzkm.zzaui == null) {
                    zzkm.zzaui = new zzkm[0];
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
        return zzkm.zzaui;
    }
}

