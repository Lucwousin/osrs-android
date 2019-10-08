package com.google.android.gms.internal.measurement;

final class zzze extends zzzh {
    private final int zzbth;
    private final int zzbti;

    zzze(byte[] arg2, int arg3, int arg4) {
        super(arg2);
        zzze.zzb(arg3, arg3 + arg4, arg2.length);
        this.zzbth = arg3;
        this.zzbti = arg4;
    }

    public final int size() {
        return this.zzbti;
    }

    public final byte zzae(int arg5) {
        int v0 = ((zzzb)this).size();
        if((v0 - (arg5 + 1) | arg5) < 0) {
            if(arg5 < 0) {
                StringBuilder v2 = new StringBuilder(22);
                v2.append("Index < 0: ");
                v2.append(arg5);
                throw new ArrayIndexOutOfBoundsException(v2.toString());
            }

            StringBuilder v3 = new StringBuilder(40);
            v3.append("Index > length: ");
            v3.append(arg5);
            v3.append(", ");
            v3.append(v0);
            throw new ArrayIndexOutOfBoundsException(v3.toString());
        }

        return this.zzbtj[this.zzbth + arg5];
    }

    protected final int zztn() {
        return this.zzbth;
    }
}

