package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzki extends zzacd {
    private static volatile zzki[] zzatp;
    public zzkl zzatq;
    public zzkj zzatr;
    public Boolean zzats;
    public String zzatt;
    public Boolean zzatu;
    public Boolean zzatv;

    public zzki() {
        super();
        this.zzatq = null;
        this.zzatr = null;
        this.zzats = null;
        this.zzatt = null;
        this.zzatu = null;
        this.zzatv = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzki)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzki)) {
            return 0;
        }

        if(this.zzatq == null) {
            if(((zzki)arg5).zzatq != null) {
                return 0;
            }
        }
        else if(!this.zzatq.equals(((zzki)arg5).zzatq)) {
            return 0;
        }

        if(this.zzatr == null) {
            if(((zzki)arg5).zzatr != null) {
                return 0;
            }
        }
        else if(!this.zzatr.equals(((zzki)arg5).zzatr)) {
            return 0;
        }

        if(this.zzats == null) {
            if(((zzki)arg5).zzats != null) {
                return 0;
            }
        }
        else if(!this.zzats.equals(((zzki)arg5).zzats)) {
            return 0;
        }

        if(this.zzatt == null) {
            if(((zzki)arg5).zzatt != null) {
                return 0;
            }
        }
        else if(!this.zzatt.equals(((zzki)arg5).zzatt)) {
            return 0;
        }

        if(this.zzatu == null) {
            if(((zzki)arg5).zzatu != null) {
                return 0;
            }
        }
        else if(!this.zzatu.equals(((zzki)arg5).zzatu)) {
            return 0;
        }

        if(this.zzatv == null) {
            if(((zzki)arg5).zzatv != null) {
                return 0;
            }
        }
        else if(!this.zzatv.equals(((zzki)arg5).zzatv)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzki)arg5).zzbzd);
            }
        }

        if(((zzki)arg5).zzbzd != null) {
            if(((zzki)arg5).zzbzd.isEmpty()) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public final int hashCode() {
        int v0 = this.getClass().getName().hashCode() + 0x20F;
        zzkl v1 = this.zzatq;
        v0 *= 0x1F;
        int v2 = 0;
        int v1_1 = v1 == null ? 0 : v1.hashCode();
        v0 += v1_1;
        zzkj v1_2 = this.zzatr;
        v0 *= 0x1F;
        v1_1 = v1_2 == null ? 0 : v1_2.hashCode();
        v0 = (v0 + v1_1) * 0x1F;
        v1_1 = this.zzats == null ? 0 : this.zzats.hashCode();
        v0 = (v0 + v1_1) * 0x1F;
        v1_1 = this.zzatt == null ? 0 : this.zzatt.hashCode();
        v0 = (v0 + v1_1) * 0x1F;
        v1_1 = this.zzatu == null ? 0 : this.zzatu.hashCode();
        v0 = (v0 + v1_1) * 0x1F;
        v1_1 = this.zzatv == null ? 0 : this.zzatv.hashCode();
        v0 = (v0 + v1_1) * 0x1F;
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
        if(this.zzatq != null) {
            v0 += zzacb.zzb(1, this.zzatq);
        }

        if(this.zzatr != null) {
            v0 += zzacb.zzb(2, this.zzatr);
        }

        if(this.zzats != null) {
            this.zzats.booleanValue();
            v0 += zzacb.zzaq(3) + 1;
        }

        if(this.zzatt != null) {
            v0 += zzacb.zzc(4, this.zzatt);
        }

        if(this.zzatu != null) {
            this.zzatu.booleanValue();
            v0 += zzacb.zzaq(5) + 1;
        }

        if(this.zzatv != null) {
            this.zzatv.booleanValue();
            v0 += zzacb.zzaq(6) + 1;
        }

        return v0;
    }

    public final void zza(zzacb arg3) throws IOException {
        if(this.zzatq != null) {
            arg3.zza(1, this.zzatq);
        }

        if(this.zzatr != null) {
            arg3.zza(2, this.zzatr);
        }

        if(this.zzats != null) {
            arg3.zza(3, this.zzats.booleanValue());
        }

        if(this.zzatt != null) {
            arg3.zzb(4, this.zzatt);
        }

        if(this.zzatu != null) {
            arg3.zza(5, this.zzatu.booleanValue());
        }

        if(this.zzatv != null) {
            arg3.zza(6, this.zzatv.booleanValue());
        }

        super.zza(arg3);
    }

    public final zzacj zzb(zzaca arg3) throws IOException {
        zzkj v0_1;
        while(true) {
            int v0 = arg3.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 == 10) {
                if(this.zzatq == null) {
                    this.zzatq = new zzkl();
                }

                zzkl v0_2 = this.zzatq;
            }
            else if(v0 == 18) {
                if(this.zzatr == null) {
                    this.zzatr = new zzkj();
                }

                v0_1 = this.zzatr;
            }
            else if(v0 == 24) {
                this.zzats = Boolean.valueOf(arg3.zzvm());
                continue;
            }
            else if(v0 == 34) {
                this.zzatt = arg3.readString();
                continue;
            }
            else if(v0 == 40) {
                this.zzatu = Boolean.valueOf(arg3.zzvm());
                continue;
            }
            else if(v0 != 0x30) {
                if(super.zza(arg3, v0)) {
                    continue;
                }

                return this;
            }
            else {
                this.zzatv = Boolean.valueOf(arg3.zzvm());
                continue;
            }

            arg3.zza(((zzacj)v0_1));
        }

        return this;
    }

    public static zzki[] zzls() {
        if(zzki.zzatp == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzki.zzatp == null) {
                    zzki.zzatp = new zzki[0];
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
        return zzki.zzatp;
    }
}

