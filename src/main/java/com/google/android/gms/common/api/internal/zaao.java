package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import javax.annotation.concurrent.GuardedBy;

final class zaao extends zabf {
    zaao(zaan arg1, zabd arg2, ConnectionResult arg3) {
        this.zagm = arg1;
        this.zagl = arg3;
        super(arg2);
    }

    @GuardedBy(value="mLock") public final void zaan() {
        zaak.zaa(this.zagm.zagi, this.zagl);
    }
}

