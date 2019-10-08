package com.google.android.gms.common.api.internal;

import androidx.annotation.BinderThread;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import java.lang.ref.WeakReference;

final class zaar extends zac {
    private final WeakReference zagj;

    zaar(zaak arg2) {
        super();
        this.zagj = new WeakReference(arg2);
    }

    @BinderThread public final void zab(zaj arg4) {
        Object v0 = this.zagj.get();
        if(v0 == null) {
            return;
        }

        zaak.zad(((zaak)v0)).zaa(new zaas(this, ((zabd)v0), ((zaak)v0), arg4));
    }
}

