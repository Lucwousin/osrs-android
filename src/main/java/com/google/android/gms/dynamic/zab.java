package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

final class zab implements zaa {
    zab(DeferredLifecycleHelper arg1, Activity arg2, Bundle arg3, Bundle arg4) {
        this.zari = arg1;
        this.val$activity = arg2;
        this.zarj = arg3;
        this.zark = arg4;
        super();
    }

    public final int getState() {
        return 0;
    }

    public final void zaa(LifecycleDelegate arg4) {
        DeferredLifecycleHelper.zab(this.zari).onInflate(this.val$activity, this.zarj, this.zark);
    }
}

