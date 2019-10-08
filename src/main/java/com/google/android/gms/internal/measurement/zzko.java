package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzko extends zzacd {
    public String value;
    private static volatile zzko[] zzaur;
    public String zzny;

    public zzko() {
        super();
        this.zzny = null;
        this.value = null;
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzko)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzko)) {
            return 0;
        }

        if(this.zzny == null) {
            if(((zzko)arg5).zzny != null) {
                return 0;
            }
        }
        else if(!this.zzny.equals(((zzko)arg5).zzny)) {
            return 0;
        }

        if(this.value == null) {
            if(((zzko)arg5).value != null) {
                return 0;
            }
        }
        else if(!this.value.equals(((zzko)arg5).value)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzko)arg5).zzbzd);
            }
        }

        if(((zzko)arg5).zzbzd != null) {
            if(((zzko)arg5).zzbzd.isEmpty()) {
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
        int v1 = this.zzny == null ? 0 : this.zzny.hashCode();
        v0 = (v0 + v1) * 0x1F;
        v1 = this.value == null ? 0 : this.value.hashCode();
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
        if(this.zzny != null) {
            v0 += zzacb.zzc(1, this.zzny);
        }

        if(this.value != null) {
            v0 += zzacb.zzc(2, this.value);
        }

        return v0;
    }

    public final void zza(zzacb arg3) throws IOException {
        if(this.zzny != null) {
            arg3.zzb(1, this.zzny);
        }

        if(this.value != null) {
            arg3.zzb(2, this.value);
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
                if(v0 != 18) {
                    if(super.zza(arg3, v0)) {
                        continue;
                    }

                    return this;
                }

                this.value = arg3.readString();
                continue;
            }

            this.zzny = arg3.readString();
        }

        return this;
    }

    public static zzko[] zzlv() {
        if(zzko.zzaur == null) {
            Object v0 = zzach.zzbzn;
            __monitor_enter(v0);
            try {
                if(zzko.zzaur == null) {
                    zzko.zzaur = new zzko[0];
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
        return zzko.zzaur;
    }
}

