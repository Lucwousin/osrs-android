package com.google.android.gms.dynamic;

final class zaf implements zaa {
    zaf(DeferredLifecycleHelper arg1) {
        this.zari = arg1;
        super();
    }

    public final int getState() {
        return 4;
    }

    public final void zaa(LifecycleDelegate arg1) {
        DeferredLifecycleHelper.zab(this.zari).onStart();
    }
}

