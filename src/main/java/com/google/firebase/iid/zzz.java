package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.VisibleForTesting;
import java.security.KeyPair;

final class zzz {
    private final KeyPair zzbv;
    private final long zzbw;

    @VisibleForTesting zzz(KeyPair arg1, long arg2) {
        super();
        this.zzbv = arg1;
        this.zzbw = arg2;
    }

    public final boolean equals(Object arg7) {
        if(!(arg7 instanceof zzz)) {
            return 0;
        }

        if(this.zzbw == ((zzz)arg7).zzbw && (this.zzbv.getPublic().equals(((zzz)arg7).zzbv.getPublic())) && (this.zzbv.getPrivate().equals(((zzz)arg7).zzbv.getPrivate()))) {
            return 1;
        }

        return 0;
    }

    final long getCreationTime() {
        return this.zzbw;
    }

    final KeyPair getKeyPair() {
        return this.zzbv;
    }

    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzbv.getPublic(), this.zzbv.getPrivate(), Long.valueOf(this.zzbw)});
    }

    static String zza(zzz arg0) {
        return arg0.zzv();
    }

    static String zzb(zzz arg0) {
        return arg0.zzw();
    }

    static long zzc(zzz arg2) {
        return arg2.zzbw;
    }

    private final String zzv() {
        return Base64.encodeToString(this.zzbv.getPublic().getEncoded(), 11);
    }

    private final String zzw() {
        return Base64.encodeToString(this.zzbv.getPrivate().getEncoded(), 11);
    }
}

