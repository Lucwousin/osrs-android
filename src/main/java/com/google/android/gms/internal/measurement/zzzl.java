package com.google.android.gms.internal.measurement;

final class zzzl extends zzzj {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzbto;
    private int zzbtp;
    private int zzbtq;
    private int zzbtr;

    zzzl(byte[] arg1, int arg2, int arg3, boolean arg4, zzzk arg5) {
        this(arg1, arg2, arg3, false);
    }

    private zzzl(byte[] arg2, int arg3, int arg4, boolean arg5) {
        super(null);
        this.zzbtr = 0x7FFFFFFF;
        this.buffer = arg2;
        this.limit = arg4 + arg3;
        this.pos = arg3;
        this.zzbtq = this.pos;
        this.zzbto = arg5;
    }

    public final int zzaf(int arg2) throws zzzy {
        if(arg2 >= 0) {
            arg2 += ((zzzj)this).zzto();
            int v0 = this.zzbtr;
            if(arg2 <= v0) {
                this.zzbtr = arg2;
                this.zztp();
                return v0;
            }

            throw zzzy.zzub();
        }

        throw zzzy.zzuc();
    }

    public final int zzto() {
        return this.pos - this.zzbtq;
    }

    private final void zztp() {
        this.limit += this.zzbtp;
        int v0 = this.limit - this.zzbtq;
        if(v0 > this.zzbtr) {
            this.zzbtp = v0 - this.zzbtr;
            this.limit -= this.zzbtp;
            return;
        }

        this.zzbtp = 0;
    }
}

