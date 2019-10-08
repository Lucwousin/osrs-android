package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzks extends zzacd {
    public String name;
    public String zzale;
    private Float zzasv;
    public Double zzasw;
    private static volatile zzks[] zzavd;
    public Long zzave;

    public zzks() {
        super();
        this.name = null;
        this.zzale = null;
        this.zzave = null;
        this.zzasv = null;
        this.zzasw = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzks)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzks)) {
            return 0;
        }

        if(this.name == null) {
            if(((zzks)arg5).name != null) {
                return 0;
            }
        }
        else if(!this.name.equals(((zzks)arg5).name)) {
            return 0;
        }

        if(this.zzale == null) {
            if(((zzks)arg5).zzale != null) {
                return 0;
            }
        }
        else if(!this.zzale.equals(((zzks)arg5).zzale)) {
            return 0;
        }

        if(this.zzave == null) {
            if(((zzks)arg5).zzave != null) {
                return 0;
            }
        }
        else if(!this.zzave.equals(((zzks)arg5).zzave)) {
            return 0;
        }

        if(this.zzasv == null) {
            if(((zzks)arg5).zzasv != null) {
                return 0;
            }
        }
        else if(!this.zzasv.equals(((zzks)arg5).zzasv)) {
            return 0;
        }

        if(this.zzasw == null) {
            if(((zzks)arg5).zzasw != null) {
                return 0;
            }
        }
        else if(!this.zzasw.equals(((zzks)arg5).zzasw)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzks)arg5).zzbzd);
            }
        }

        if(((zzks)arg5).zzbzd != null) {
            if(((zzks)arg5).zzbzd.isEmpty()) {
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
        v1 = this.zzale == null ? 0 : this.zzale.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzave == null ? 0 : this.zzave.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzasv == null ? 0 : this.zzasv.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzasw == null ? 0 : this.zzasw.hashCode();
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

        if(this.zzale != null) {
            v0 += zzacb.zzc(2, this.zzale);
        }

        if(this.zzave != null) {
            v0 += zzacb.zzc(3, this.zzave.longValue());
        }

        if(this.zzasv != null) {
            this.zzasv.floatValue();
            v0 += zzacb.zzaq(4) + 4;
        }

        if(this.zzasw != null) {
            this.zzasw.doubleValue();
            v0 += zzacb.zzaq(5) + 8;
        }

        return v0;
    }

    public final void zza(zzacb arg4) throws IOException {
        if(this.name != null) {
            arg4.zzb(1, this.name);
        }

        if(this.zzale != null) {
            arg4.zzb(2, this.zzale);
        }

        if(this.zzave != null) {
            arg4.zzb(3, this.zzave.longValue());
        }

        if(this.zzasv != null) {
            arg4.zza(4, this.zzasv.floatValue());
        }

        if(this.zzasw != null) {
            arg4.zza(5, this.zzasw.doubleValue());
        }

        super.zza(arg4);
    }

    public final zzacj zzb(zzaca arg3) throws IOException {
        while(true) {
            int v0 = arg3.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 != 10) {
                if(v0 != 18) {
                    if(v0 != 24) {
                        if(v0 != 37) {
                            if(v0 != 41) {
                                if(super.zza(arg3, v0)) {
                                    continue;
                                }

                                return this;
                            }

                            this.zzasw = Double.valueOf(Double.longBitsToDouble(arg3.zzvq()));
                            continue;
                        }

                        this.zzasv = Float.valueOf(Float.intBitsToFloat(arg3.zzvp()));
                        continue;
                    }

                    this.zzave = Long.valueOf(arg3.zzvo());
                    continue;
                }

                this.zzale = arg3.readString();
                continue;
            }

            this.name = arg3.readString();
        }

        return this;
    }

    public static zzks[] zzlz() {
        if(zzks.zzavd == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzks.zzavd == null) {
                    zzks.zzavd = new zzks[0];
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
        return zzks.zzavd;
    }
}

