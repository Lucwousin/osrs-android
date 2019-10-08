package com.google.android.gms.dynamic;

import java.util.Iterator;

final class zaa implements OnDelegateCreatedListener {
    zaa(DeferredLifecycleHelper arg1) {
        this.zari = arg1;
        super();
    }

    public final void onDelegateCreated(LifecycleDelegate arg3) {
        DeferredLifecycleHelper.zaa(this.zari, arg3);
        Iterator v3 = DeferredLifecycleHelper.zaa(this.zari).iterator();
        while(v3.hasNext()) {
            v3.next().zaa(DeferredLifecycleHelper.zab(this.zari));
        }

        DeferredLifecycleHelper.zaa(this.zari).clear();
        DeferredLifecycleHelper.zaa(this.zari, null);
    }
}

