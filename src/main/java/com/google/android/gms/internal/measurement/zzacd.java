package com.google.android.gms.internal.measurement;

import java.io.IOException;

public abstract class zzacd extends zzacj {
    protected zzacf zzbzd;

    public zzacd() {
        super();
    }

    public Object clone() throws CloneNotSupportedException {
        zzacj v0 = super.zzvu();
        zzach.zza(this, ((zzacd)v0));
        return v0;
    }

    protected int zza() {
        int v0;
        int v1 = 0;
        if(this.zzbzd != null) {
            v0 = 0;
            while(v1 < this.zzbzd.size()) {
                v0 += this.zzbzd.zzau(v1).zza();
                ++v1;
            }
        }
        else {
            v0 = 0;
        }

        return v0;
    }

    public final Object zza(zzace arg4) {
        Object v1 = null;
        if(this.zzbzd == null) {
            return v1;
        }

        zzacg v0 = this.zzbzd.zzat(arg4.tag >>> 3);
        if(v0 == null) {
            return v1;
        }

        return v0.zzb(arg4);
    }

    public void zza(zzacb arg3) throws IOException {
        if(this.zzbzd == null) {
            return;
        }

        int v0;
        for(v0 = 0; v0 < this.zzbzd.size(); ++v0) {
            this.zzbzd.zzau(v0).zza(arg3);
        }
    }

    protected final boolean zza(zzaca arg4, int arg5) throws IOException {
        int v0 = arg4.getPosition();
        if(!arg4.zzak(arg5)) {
            return 0;
        }

        int v1 = arg5 >>> 3;
        zzacl v0_1 = new zzacl(arg5, arg4.zzc(v0, arg4.getPosition() - v0));
        zzacg v4 = null;
        if(this.zzbzd == null) {
            this.zzbzd = new zzacf();
        }
        else {
            v4 = this.zzbzd.zzat(v1);
        }

        if(v4 == null) {
            v4 = new zzacg();
            this.zzbzd.zza(v1, v4);
        }

        v4.zza(v0_1);
        return 1;
    }

    public final zzacj zzvu() throws CloneNotSupportedException {
        return ((zzacj)this).clone();
    }
}

