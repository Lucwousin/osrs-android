package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkk extends zzacd {
    public Integer zzatk;
    private static volatile zzkk[] zzaub;
    public String zzauc;
    public zzki zzaud;

    public zzkk() {
        super();
        this.zzatk = null;
        this.zzauc = null;
        this.zzaud = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkk)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkk)) {
            return 0;
        }

        if(this.zzatk == null) {
            if(((zzkk)arg5).zzatk != null) {
                return 0;
            }
        }
        else if(!this.zzatk.equals(((zzkk)arg5).zzatk)) {
            return 0;
        }

        if(this.zzauc == null) {
            if(((zzkk)arg5).zzauc != null) {
                return 0;
            }
        }
        else if(!this.zzauc.equals(((zzkk)arg5).zzauc)) {
            return 0;
        }

        if(this.zzaud == null) {
            if(((zzkk)arg5).zzaud != null) {
                return 0;
            }
        }
        else if(!this.zzaud.equals(((zzkk)arg5).zzaud)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkk)arg5).zzbzd);
            }
        }

        if(((zzkk)arg5).zzbzd != null) {
            if(((zzkk)arg5).zzbzd.isEmpty()) {
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
        v1 = this.zzauc == null ? 0 : this.zzauc.hashCode();
        v0 += v1;
        zzki v1_1 = this.zzaud;
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

        if(this.zzauc != null) {
            v0 += zzacb.zzc(2, this.zzauc);
        }

        if(this.zzaud != null) {
            v0 += zzacb.zzb(3, this.zzaud);
        }

        return v0;
    }

    public final void zza(zzacb arg3) throws IOException {
        if(this.zzatk != null) {
            arg3.zze(1, this.zzatk.intValue());
        }

        if(this.zzauc != null) {
            arg3.zzb(2, this.zzauc);
        }

        if(this.zzaud != null) {
            arg3.zza(3, this.zzaud);
        }

        super.zza(arg3);
    }

    public final zzacj zzb(zzaca arg3) throws IOException {
        while(true) {
            int v0 = arg3.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 != 8) {
                if(v0 != 18) {
                    if(v0 != 26) {
                        if(super.zza(arg3, v0)) {
                            continue;
                        }

                        return this;
                    }

                    if(this.zzaud == null) {
                        this.zzaud = new zzki();
                    }

                    arg3.zza(this.zzaud);
                    continue;
                }

                this.zzauc = arg3.readString();
                continue;
            }

            this.zzatk = Integer.valueOf(arg3.zzvn());
        }

        return this;
    }

    public static zzkk[] zzlt() {
        if(zzkk.zzaub == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzkk.zzaub == null) {
                    zzkk.zzaub = new zzkk[0];
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
        return zzkk.zzaub;
    }
}

