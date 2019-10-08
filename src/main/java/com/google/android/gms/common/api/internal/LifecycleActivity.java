package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk public class LifecycleActivity {
    private final Object zzbc;

    public LifecycleActivity(Activity arg2) {
        super();
        Preconditions.checkNotNull(arg2, "Activity must not be null");
        this.zzbc = arg2;
    }

    @KeepForSdk public LifecycleActivity(ContextWrapper arg1) {
        super();
        throw new UnsupportedOperationException();
    }

    @KeepForSdk public Activity asActivity() {
        return this.zzbc;
    }

    @KeepForSdk public FragmentActivity asFragmentActivity() {
        return this.zzbc;
    }

    @KeepForSdk public Object asObject() {
        return this.zzbc;
    }

    @KeepForSdk public boolean isChimera() {
        return 0;
    }

    @KeepForSdk public boolean isSupport() {
        return this.zzbc instanceof FragmentActivity;
    }

    public final boolean zzh() {
        return this.zzbc instanceof Activity;
    }
}

