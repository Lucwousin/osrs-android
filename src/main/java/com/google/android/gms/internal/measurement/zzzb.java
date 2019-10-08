package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;

public abstract class zzzb implements Serializable, Iterable {
    private int zzbqf;
    public static final zzzb zzbte;
    private static final zzzf zzbtf;

    static {
        zzzd v0_1;
        zzzb.zzbte = new zzzh(zzzw.zzbux);
        zzzc v1 = null;
        if(zzza.zztk()) {
            zzzi v0 = new zzzi(v1);
        }
        else {
            v0_1 = new zzzd(v1);
        }

        zzzb.zzbtf = ((zzzf)v0_1);
    }

    zzzb() {
        super();
        this.zzbqf = 0;
    }

    public abstract boolean equals(Object arg1);

    public final int hashCode() {
        int v0 = this.zzbqf;
        if(v0 == 0) {
            v0 = this.size();
            v0 = this.zza(v0, 0, v0);
            if(v0 == 0) {
                v0 = 1;
            }

            this.zzbqf = v0;
        }

        return v0;
    }

    public Iterator iterator() {
        return new zzzc(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(this.size()));
    }

    protected abstract int zza(int arg1, int arg2, int arg3);

    public abstract byte zzae(int arg1);

    static int zzb(int arg3, int arg4, int arg5) {
        StringBuilder v1;
        int v0 = arg4 - arg3;
        if((arg3 | arg4 | v0 | arg5 - arg4) < 0) {
            if(arg3 >= 0) {
                if(arg4 < arg3) {
                    v1 = new StringBuilder(66);
                    v1.append("Beginning index larger than ending index: ");
                    v1.append(arg3);
                    v1.append(", ");
                    v1.append(arg4);
                    throw new IndexOutOfBoundsException(v1.toString());
                }

                v1 = new StringBuilder(37);
                v1.append("End index: ");
                v1.append(arg4);
                v1.append(" >= ");
                v1.append(arg5);
                throw new IndexOutOfBoundsException(v1.toString());
            }

            StringBuilder v0_1 = new StringBuilder(0x20);
            v0_1.append("Beginning index: ");
            v0_1.append(arg3);
            v0_1.append(" < 0");
            throw new IndexOutOfBoundsException(v0_1.toString());
        }

        return v0;
    }

    public abstract zzzb zzb(int arg1, int arg2);

    public static zzzb zzfn(String arg2) {
        return new zzzh(arg2.getBytes(zzzw.UTF_8));
    }

    protected final int zztm() {
        return this.zzbqf;
    }
}

