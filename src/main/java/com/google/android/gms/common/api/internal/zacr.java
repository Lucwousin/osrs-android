package com.google.android.gms.common.api.internal;

import android.os.IBinder$DeathRecipient;
import android.os.IBinder;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.zac;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

final class zacr implements IBinder$DeathRecipient, zacs {
    private final WeakReference zalb;
    private final WeakReference zalc;
    private final WeakReference zald;

    zacr(BasePendingResult arg1, zac arg2, IBinder arg3, zacq arg4) {
        this(arg1, null, arg3);
    }

    private zacr(BasePendingResult arg2, zac arg3, IBinder arg4) {
        super();
        this.zalc = new WeakReference(arg3);
        this.zalb = new WeakReference(arg2);
        this.zald = new WeakReference(arg4);
    }

    public final void binderDied() {
        this.zaby();
    }

    private final void zaby() {
        Object v0 = this.zalb.get();
        Object v1 = this.zalc.get();
        if(v1 != null && v0 != null) {
            ((zac)v1).remove(((PendingResult)v0).zam().intValue());
        }

        v0 = this.zald.get();
        if(v0 == null) {
            return;
        }

        try {
            ((IBinder)v0).unlinkToDeath(((IBinder$DeathRecipient)this), 0);
            return;
        }
        catch(NoSuchElementException ) {
            return;
        }
    }

    public final void zac(BasePendingResult arg1) {
        this.zaby();
    }
}

