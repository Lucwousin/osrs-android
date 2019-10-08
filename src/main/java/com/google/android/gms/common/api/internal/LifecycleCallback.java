package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@KeepForSdk public class LifecycleCallback {
    @KeepForSdk protected final LifecycleFragment mLifecycleFragment;

    @KeepForSdk protected LifecycleCallback(LifecycleFragment arg1) {
        super();
        this.mLifecycleFragment = arg1;
    }

    @MainThread @KeepForSdk public void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4) {
    }

    @KeepForSdk public Activity getActivity() {
        return this.mLifecycleFragment.getLifecycleActivity();
    }

    @Keep private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity arg1) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    @KeepForSdk public static LifecycleFragment getFragment(Activity arg1) {
        return LifecycleCallback.getFragment(new LifecycleActivity(arg1));
    }

    @KeepForSdk protected static LifecycleFragment getFragment(LifecycleActivity arg1) {
        if(arg1.isSupport()) {
            return zzc.zza(arg1.asFragmentActivity());
        }

        if(arg1.zzh()) {
            return zza.zza(arg1.asActivity());
        }

        throw new IllegalArgumentException("Can\'t get fragment for unexpected activity.");
    }

    @KeepForSdk public static LifecycleFragment getFragment(ContextWrapper arg0) {
        throw new UnsupportedOperationException();
    }

    @MainThread @KeepForSdk public void onActivityResult(int arg1, int arg2, Intent arg3) {
    }

    @MainThread @KeepForSdk public void onCreate(Bundle arg1) {
    }

    @MainThread @KeepForSdk public void onDestroy() {
    }

    @MainThread @KeepForSdk public void onResume() {
    }

    @MainThread @KeepForSdk public void onSaveInstanceState(Bundle arg1) {
    }

    @MainThread @KeepForSdk public void onStart() {
    }

    @MainThread @KeepForSdk public void onStop() {
    }
}

