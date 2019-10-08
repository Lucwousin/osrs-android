package com.google.android.gms.dynamic;

import android.os.Bundle;

final class zac implements zaa {
    zac(DeferredLifecycleHelper arg1, Bundle arg2) {
        this.zari = arg1;
        this.zark = arg2;
        super();
    }

    public final int getState() {
        return 1;
    }

    public final void zaa(LifecycleDelegate arg2) {
        DeferredLifecycleHelper.zab(this.zari).onCreate(this.zark);
    }
}

