package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

public class HashAccumulator {
    @VisibleForTesting private static int zaah = 0x1F;
    private int zaai;

    static {
    }

    public HashAccumulator() {
        super();
        this.zaai = 1;
    }

    @KeepForSdk public HashAccumulator addObject(Object arg3) {
        int v0 = HashAccumulator.zaah * this.zaai;
        int v3 = arg3 == null ? 0 : arg3.hashCode();
        this.zaai = v0 + v3;
        return this;
    }

    @KeepForSdk public int hash() {
        return this.zaai;
    }

    public final HashAccumulator zaa(boolean arg3) {
        this.zaai = HashAccumulator.zaah * this.zaai + (((int)arg3));
        return this;
    }
}

