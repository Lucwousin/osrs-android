package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;

final class zad implements zaa {
    zad(DeferredLifecycleHelper arg1, FrameLayout arg2, LayoutInflater arg3, ViewGroup arg4, Bundle arg5) {
        this.zari = arg1;
        this.zarl = arg2;
        this.zarm = arg3;
        this.val$container = arg4;
        this.zark = arg5;
        super();
    }

    public final int getState() {
        return 2;
    }

    public final void zaa(LifecycleDelegate arg5) {
        this.zarl.removeAllViews();
        this.zarl.addView(DeferredLifecycleHelper.zab(this.zari).onCreateView(this.zarm, this.val$container, this.zark));
    }
}

