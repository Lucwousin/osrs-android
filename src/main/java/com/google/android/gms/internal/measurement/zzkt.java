package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzkt extends zzacd {
    public zzku[] zzavf;

    public zzkt() {
        super();
        this.zzavf = zzku.zzma();
        this.zzbzd = null;
        this.zzbzo = -1;
    }

    public final boolean equals(Object arg5) {
        if((((zzkt)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzkt)) {
            return 0;
        }

        if(!zzach.equals(this.zzavf, ((zzkt)arg5).zzavf)) {
            return 0;
        }

        if(this.zzbzd != null) {
            if(this.zzbzd.isEmpty()) {
            }
            else {
                return this.zzbzd.equals(((zzkt)arg5).zzbzd);
            }
        }

        if(((zzkt)arg5).zzbzd != null) {
            if(((zzkt)arg5).zzbzd.isEmpty()) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public final int hashCode() {
        int v0 = ((this.getClass().getName().hashCode() + 0x20F) * 0x1F + zzach.hashCode(this.zzavf)) * 0x1F;
        int v1 = this.zzbzd == null || (this.zzbzd.isEmpty()) ? 0 : this.zzbzd.hashCode();
        return v0 + v1;
    }

    protected final int zza() {
        int v0 = super.zza();
        if(this.zzavf != null && this.zzavf.length > 0) {
            int v1;
            for(v1 = 0; v1 < this.zzavf.length; ++v1) {
                zzku v2 = this.zzavf[v1];
                if(v2 != null) {
                    v0 += zzacb.zzb(1, ((zzacj)v2));
                }
            }
        }

        return v0;
    }

    public final void zza(zzacb arg4) throws IOException {
        if(this.zzavf != null && this.zzavf.length > 0) {
            int v0;
            for(v0 = 0; v0 < this.zzavf.length; ++v0) {
                zzku v1 = this.zzavf[v0];
                if(v1 != null) {
                    arg4.zza(1, ((zzacj)v1));
                }
            }
        }

        super.zza(arg4);
    }

    public final zzacj zzb(zzaca arg5) throws IOException {
        int v1;
        int v0;
        do {
        label_0:
            v0 = arg5.zzvl();
            if(v0 == 0) {
                return this;
            }

            v1 = 10;
            if(v0 == v1) {
                goto label_7;
            }
        }
        while(super.zza(arg5, v0));

        return this;
    label_7:
        v0 = zzacm.zzb(arg5, v1);
        v1 = this.zzavf == null ? 0 : this.zzavf.length;
        zzku[] v0_1 = new zzku[v0 + v1];
        if(v1 != 0) {
            System.arraycopy(this.zzavf, 0, v0_1, 0, v1);
            goto label_20;
            return this;
        }

    label_20:
        while(v1 < v0_1.length - 1) {
            v0_1[v1] = new zzku();
            arg5.zza(v0_1[v1]);
            arg5.zzvl();
            ++v1;
        }

        v0_1[v1] = new zzku();
        arg5.zza(v0_1[v1]);
        this.zzavf = v0_1;
        goto label_0;
    }
}

