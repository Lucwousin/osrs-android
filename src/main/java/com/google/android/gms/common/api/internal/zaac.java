package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.Status;

final class zaac implements StatusListener {
    zaac(zaab arg1, BasePendingResult arg2) {
        this.zafm = arg1;
        this.zafl = arg2;
        super();
    }

    public final void onComplete(Status arg2) {
        zaab.zaa(this.zafm).remove(this.zafl);
    }
}

