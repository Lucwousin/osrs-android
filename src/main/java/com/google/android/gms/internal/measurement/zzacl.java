package com.google.android.gms.internal.measurement;

import java.util.Arrays;

final class zzacl {
    final int tag;
    final byte[] zzbtj;

    zzacl(int arg1, byte[] arg2) {
        super();
        this.tag = arg1;
        this.zzbtj = arg2;
    }

    public final boolean equals(Object arg5) {
        if((((zzacl)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof zzacl)) {
            return 0;
        }

        if(this.tag == ((zzacl)arg5).tag && (Arrays.equals(this.zzbtj, ((zzacl)arg5).zzbtj))) {
            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        return (this.tag + 0x20F) * 0x1F + Arrays.hashCode(this.zzbtj);
    }
}

