package com.google.android.gms.internal.measurement;

class zzzh extends zzzg {
    protected final byte[] zzbtj;

    zzzh(byte[] arg1) {
        super();
        this.zzbtj = arg1;
    }

    public final boolean equals(Object arg5) {
        if((((zzzh)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzzb)) {
            return 0;
        }

        if(((zzzb)this).size() != arg5.size()) {
            return 0;
        }

        if(((zzzb)this).size() == 0) {
            return 1;
        }

        if((arg5 instanceof zzzh)) {
            int v0 = ((zzzb)this).zztm();
            int v1 = ((zzzb)arg5).zztm();
            if(v0 != 0 && v1 != 0 && v0 != v1) {
                return 0;
            }

            return ((zzzg)this).zza(((zzzb)arg5), 0, ((zzzb)this).size());
        }

        return arg5.equals(this);
    }

    public int size() {
        return this.zzbtj.length;
    }

    protected final int zza(int arg2, int arg3, int arg4) {
        return zzzw.zza(arg2, this.zzbtj, this.zztn(), arg4);
    }

    final boolean zza(zzzb arg6, int arg7, int arg8) {
        StringBuilder v1_1;
        if(arg8 <= arg6.size()) {
            if(arg8 <= arg6.size()) {
                if((arg6 instanceof zzzh)) {
                    byte[] v7 = this.zzbtj;
                    byte[] v1 = ((zzzh)arg6).zzbtj;
                    int v2 = this.zztn() + arg8;
                    arg8 = this.zztn();
                    int v6;
                    for(v6 = ((zzzh)arg6).zztn(); arg8 < v2; ++v6) {
                        if(v7[arg8] != v1[v6]) {
                            return 0;
                        }

                        ++arg8;
                    }

                    return 1;
                }

                return arg6.zzb(0, arg8).equals(((zzzb)this).zzb(0, arg8));
            }

            v6 = arg6.size();
            v1_1 = new StringBuilder(59);
            v1_1.append("Ran off end of other: 0, ");
            v1_1.append(arg8);
            v1_1.append(", ");
            v1_1.append(v6);
            throw new IllegalArgumentException(v1_1.toString());
        }

        arg7 = ((zzzb)this).size();
        v1_1 = new StringBuilder(40);
        v1_1.append("Length too large: ");
        v1_1.append(arg8);
        v1_1.append(arg7);
        throw new IllegalArgumentException(v1_1.toString());
    }

    public byte zzae(int arg2) {
        return this.zzbtj[arg2];
    }

    public final zzzb zzb(int arg3, int arg4) {
        arg3 = zzzh.zzb(0, arg4, ((zzzb)this).size());
        if(arg3 == 0) {
            return zzzb.zzbte;
        }

        return new zzze(this.zzbtj, this.zztn(), arg3);
    }

    protected int zztn() {
        return 0;
    }
}

