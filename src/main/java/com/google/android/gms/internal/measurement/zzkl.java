package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkl extends zzacd {
    public Integer zzaue;
    public String zzauf;
    public Boolean zzaug;
    public String[] zzauh;

    public zzkl() {
        super();
        this.zzaue = null;
        this.zzauf = null;
        this.zzaug = null;
        this.zzauh = zzacm.zzbzx;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkl)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkl)) {
            return 0;
        }

        if(this.zzaue == null) {
            if(((zzkl)arg5).zzaue != null) {
                return 0;
            }
        }
        else if(!this.zzaue.equals(((zzkl)arg5).zzaue)) {
            return 0;
        }

        if(this.zzauf == null) {
            if(((zzkl)arg5).zzauf != null) {
                return 0;
            }
        }
        else if(!this.zzauf.equals(((zzkl)arg5).zzauf)) {
            return 0;
        }

        if(this.zzaug == null) {
            if(((zzkl)arg5).zzaug != null) {
                return 0;
            }
        }
        else if(!this.zzaug.equals(((zzkl)arg5).zzaug)) {
            return 0;
        }

        if(!zzach.equals(this.zzauh, ((zzkl)arg5).zzauh)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkl)arg5).zzbzd);
            }
        }

        if(((zzkl)arg5).zzbzd != null) {
            if(((zzkl)arg5).zzbzd.isEmpty()) {
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
        int v1 = this.zzaue == null ? 0 : this.zzaue.intValue();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzauf == null ? 0 : this.zzauf.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.zzaug == null ? 0 : this.zzaug.hashCode();
        v0 = ((v0 + v1) * 0x1F + zzach.hashCode(this.zzauh)) * 0x1F;
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
        if(this.zzaue != null) {
            v0 += zzacb.zzf(1, this.zzaue.intValue());
        }

        if(this.zzauf != null) {
            v0 += zzacb.zzc(2, this.zzauf);
        }

        if(this.zzaug != null) {
            this.zzaug.booleanValue();
            v0 += zzacb.zzaq(3) + 1;
        }

        if(this.zzauh != null && this.zzauh.length > 0) {
            int v1 = 0;
            int v3 = 0;
            int v4 = 0;
            while(v1 < this.zzauh.length) {
                String v5 = this.zzauh[v1];
                if(v5 != null) {
                    ++v4;
                    v3 += zzacb.zzfr(v5);
                }

                ++v1;
            }

            v0 = v0 + v3 + v4;
        }

        return v0;
    }

    public final void zza(zzacb arg4) throws IOException {
        if(this.zzaue != null) {
            arg4.zze(1, this.zzaue.intValue());
        }

        if(this.zzauf != null) {
            arg4.zzb(2, this.zzauf);
        }

        if(this.zzaug != null) {
            arg4.zza(3, this.zzaug.booleanValue());
        }

        if(this.zzauh != null && this.zzauh.length > 0) {
            int v0;
            for(v0 = 0; v0 < this.zzauh.length; ++v0) {
                String v1 = this.zzauh[v0];
                if(v1 != null) {
                    arg4.zzb(4, v1);
                }
            }
        }

        super.zza(arg4);
    }

    public final zzacj zzb(zzaca arg1) throws IOException {
        return this.zze(arg1);
    }

    private final zzkl zze(zzaca arg7) throws IOException {
        String[] v0_1;
        int v1;
        while(true) {
        label_0:
            int v0 = arg7.zzvl();
            if(v0 == 0) {
                return this;
            }

            if(v0 == 8) {
                goto label_45;
            }

            if(v0 == 18) {
                goto label_42;
            }

            if(v0 == 24) {
                goto label_38;
            }

            v1 = 34;
            if(v0 != v1) {
                if(super.zza(arg7, v0)) {
                    continue;
                }

                return this;
            }

            v0 = zzacm.zzb(arg7, v1);
            v1 = this.zzauh == null ? 0 : this.zzauh.length;
            v0_1 = new String[v0 + v1];
            if(v1 != 0) {
                System.arraycopy(this.zzauh, 0, v0_1, 0, v1);
                goto label_26;
            label_38:
                this.zzaug = Boolean.valueOf(arg7.zzvm());
                continue;
            label_42:
                this.zzauf = arg7.readString();
                continue;
            label_45:
                v1 = arg7.getPosition();
                try {
                    int v2 = arg7.zzvn();
                    if(v2 >= 0 && v2 <= 6) {
                        this.zzaue = Integer.valueOf(v2);
                        continue;
                    }

                    StringBuilder v5 = new StringBuilder(41);
                    v5.append(v2);
                    v5.append(" is not a valid enum MatchType");
                    throw new IllegalArgumentException(v5.toString());
                }
                catch(IllegalArgumentException ) {
                    arg7.zzam(v1);
                    ((zzacd)this).zza(arg7, v0);
                    continue;
                }
            }

            goto label_26;
        }

        return this;
    label_26:
        while(v1 < v0_1.length - 1) {
            v0_1[v1] = arg7.readString();
            arg7.zzvl();
            ++v1;
        }

        v0_1[v1] = arg7.readString();
        this.zzauh = v0_1;
        goto label_0;
    }
}

