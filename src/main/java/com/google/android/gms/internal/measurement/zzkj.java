package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkj extends zzacd {
    public Integer zzatw;
    public Boolean zzatx;
    public String zzaty;
    public String zzatz;
    public String zzaua;

    public zzkj() {
        super();
        this.zzatw = null;
        this.zzatx = null;
        this.zzaty = null;
        this.zzatz = null;
        this.zzaua = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkj)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkj)) {
            return 0;
        }

        if(this.zzatw == null) {
            if(((zzkj)arg5).zzatw != null) {
                return 0;
            }
        }
        else if(!this.zzatw.equals(((zzkj)arg5).zzatw)) {
            return 0;
        }

        if(this.zzatx == null) {
            if(((zzkj)arg5).zzatx != null) {
                return 0;
            }
        }
        else if(!this.zzatx.equals(((zzkj)arg5).zzatx)) {
            return 0;
        }

        if(this.zzaty == null) {
            if(((zzkj)arg5).zzaty != null) {
                return 0;
            }
        }
        else if(!this.zzaty.equals(((zzkj)arg5).zzaty)) {
            return 0;
        }

        if(this.zzatz == null) {
            if(((zzkj)arg5).zzatz != null) {
                return 0;
            }
        }
        else if(!this.zzatz.equals(((zzkj)arg5).zzatz)) {
            return 0;
        }

        if(this.zzaua == null) {
            if(((zzkj)arg5).zzaua != null) {
                return 0;
            }
        }
        else if(!this.zzaua.equals(((zzkj)arg5).zzaua)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkj)arg5).zzbzd);
            }
        }

        if(((zzkj)arg5).zzbzd != null) {
            if(((zzkj)arg5).zzbzd.isEmpty()) {
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
        int v1 = this.zzatw == null ? 0 : this.zzatw.intValue();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzatx == null ? 0 : this.zzatx.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzaty == null ? 0 : this.zzaty.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzatz == null ? 0 : this.zzatz.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzaua == null ? 0 : this.zzaua.hashCode();
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
        if(this.zzatw != null) {
            v0 += zzacb.zzf(1, this.zzatw.intValue());
        }

        if(this.zzatx != null) {
            this.zzatx.booleanValue();
            v0 += zzacb.zzaq(2) + 1;
        }

        if(this.zzaty != null) {
            v0 += zzacb.zzc(3, this.zzaty);
        }

        if(this.zzatz != null) {
            v0 += zzacb.zzc(4, this.zzatz);
        }

        if(this.zzaua != null) {
            v0 += zzacb.zzc(5, this.zzaua);
        }

        return v0;
    }

    public final void zza(zzacb arg3) throws IOException {
        if(this.zzatw != null) {
            arg3.zze(1, this.zzatw.intValue());
        }

        if(this.zzatx != null) {
            arg3.zza(2, this.zzatx.booleanValue());
        }

        if(this.zzaty != null) {
            arg3.zzb(3, this.zzaty);
        }

        if(this.zzatz != null) {
            arg3.zzb(4, this.zzatz);
        }

        if(this.zzaua != null) {
            arg3.zzb(5, this.zzaua);
        }

        super.zza(arg3);
    }

    public final zzacj zzb(zzaca arg1) throws IOException {
        return this.zzd(arg1);
    }

    private final zzkj zzd(zzaca arg7) throws IOException {
        while(true) {
            int v0 = arg7.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 != 8) {
                if(v0 != 16) {
                    if(v0 != 26) {
                        if(v0 != 34) {
                            if(v0 != 42) {
                                if(super.zza(arg7, v0)) {
                                    continue;
                                }

                                return this;
                            }

                            this.zzaua = arg7.readString();
                            continue;
                        }

                        this.zzatz = arg7.readString();
                        continue;
                    }

                    this.zzaty = arg7.readString();
                    continue;
                }

                this.zzatx = Boolean.valueOf(arg7.zzvm());
                continue;
            }

            int v1 = arg7.getPosition();
            try {
                int v2 = arg7.zzvn();
                if(v2 >= 0 && v2 <= 4) {
                    this.zzatw = Integer.valueOf(v2);
                    continue;
                }

                StringBuilder v5 = new StringBuilder(46);
                v5.append(v2);
                v5.append(" is not a valid enum ComparisonType");
                throw new IllegalArgumentException(v5.toString());
            }
            catch(IllegalArgumentException ) {
                arg7.zzam(v1);
                ((zzacd)this).zza(arg7, v0);
                continue;
            }
        }

        return this;
    }
}

