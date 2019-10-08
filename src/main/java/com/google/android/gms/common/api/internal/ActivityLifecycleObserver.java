package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public abstract class ActivityLifecycleObserver {
    public ActivityLifecycleObserver() {
        super();
    }

    @KeepForSdk public static final ActivityLifecycleObserver of(Activity arg1) {
        return new zaa(arg1);
    }

    @KeepForSdk public abstract ActivityLifecycleObserver onStopCallOnce(Runnable arg1);
}

