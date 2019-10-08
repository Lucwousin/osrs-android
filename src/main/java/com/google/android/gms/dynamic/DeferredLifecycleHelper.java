package com.google.android.gms.dynamic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import java.util.LinkedList;

@KeepForSdk public abstract class DeferredLifecycleHelper {
    interface zaa {
        int getState();

        void zaa(LifecycleDelegate arg1);
    }

    private LifecycleDelegate zare;
    private Bundle zarf;
    private LinkedList zarg;
    private final OnDelegateCreatedListener zarh;

    @KeepForSdk public DeferredLifecycleHelper() {
        super();
        this.zarh = new com.google.android.gms.dynamic.zaa(this);
    }

    @KeepForSdk protected abstract void createDelegate(OnDelegateCreatedListener arg1);

    @KeepForSdk public LifecycleDelegate getDelegate() {
        return this.zare;
    }

    @KeepForSdk protected void handleGooglePlayUnavailable(FrameLayout arg1) {
        DeferredLifecycleHelper.showGooglePlayUnavailableMessage(arg1);
    }

    @KeepForSdk public void onCreate(Bundle arg2) {
        this.zaa(arg2, new zac(this, arg2));
    }

    @KeepForSdk public View onCreateView(LayoutInflater arg9, ViewGroup arg10, Bundle arg11) {
        FrameLayout v6 = new FrameLayout(arg9.getContext());
        this.zaa(arg11, new zad(this, v6, arg9, arg10, arg11));
        if(this.zare == null) {
            this.handleGooglePlayUnavailable(v6);
        }

        return ((View)v6);
    }

    @KeepForSdk public void onDestroy() {
        if(this.zare != null) {
            this.zare.onDestroy();
            return;
        }

        this.zal(1);
    }

    @KeepForSdk public void onDestroyView() {
        if(this.zare != null) {
            this.zare.onDestroyView();
            return;
        }

        this.zal(2);
    }

    @KeepForSdk public void onInflate(Activity arg2, Bundle arg3, Bundle arg4) {
        this.zaa(arg4, new zab(this, arg2, arg3, arg4));
    }

    @KeepForSdk public void onLowMemory() {
        if(this.zare != null) {
            this.zare.onLowMemory();
        }
    }

    @KeepForSdk public void onPause() {
        if(this.zare != null) {
            this.zare.onPause();
            return;
        }

        this.zal(5);
    }

    @KeepForSdk public void onResume() {
        this.zaa(null, new zag(this));
    }

    @KeepForSdk public void onSaveInstanceState(Bundle arg2) {
        if(this.zare != null) {
            this.zare.onSaveInstanceState(arg2);
            return;
        }

        if(this.zarf != null) {
            arg2.putAll(this.zarf);
        }
    }

    @KeepForSdk public void onStart() {
        this.zaa(null, new zaf(this));
    }

    @KeepForSdk public void onStop() {
        if(this.zare != null) {
            this.zare.onStop();
            return;
        }

        this.zal(4);
    }

    @KeepForSdk public static void showGooglePlayUnavailableMessage(FrameLayout arg8) {
        GoogleApiAvailability v0 = GoogleApiAvailability.getInstance();
        Context v1 = arg8.getContext();
        int v2 = v0.isGooglePlayServicesAvailable(v1);
        String v3 = ConnectionErrorMessages.getErrorMessage(v1, v2);
        String v4 = ConnectionErrorMessages.getErrorDialogButtonMessage(v1, v2);
        LinearLayout v5 = new LinearLayout(arg8.getContext());
        v5.setOrientation(1);
        int v7 = -2;
        v5.setLayoutParams(new FrameLayout$LayoutParams(v7, v7));
        arg8.addView(((View)v5));
        TextView v6 = new TextView(arg8.getContext());
        v6.setLayoutParams(new FrameLayout$LayoutParams(v7, v7));
        v6.setText(((CharSequence)v3));
        v5.addView(((View)v6));
        Intent v8 = v0.getErrorResolutionIntent(v1, v2, null);
        if(v8 != null) {
            Button v0_1 = new Button(v1);
            v0_1.setId(0x1020019);
            v0_1.setLayoutParams(new FrameLayout$LayoutParams(v7, v7));
            v0_1.setText(((CharSequence)v4));
            v5.addView(((View)v0_1));
            v0_1.setOnClickListener(new zae(v1, v8));
        }
    }

    static Bundle zaa(DeferredLifecycleHelper arg0, Bundle arg1) {
        arg0.zarf = null;
        return null;
    }

    static LifecycleDelegate zaa(DeferredLifecycleHelper arg0, LifecycleDelegate arg1) {
        arg0.zare = arg1;
        return arg1;
    }

    static LinkedList zaa(DeferredLifecycleHelper arg0) {
        return arg0.zarg;
    }

    private final void zaa(Bundle arg2, zaa arg3) {
        if(this.zare != null) {
            arg3.zaa(this.zare);
            return;
        }

        if(this.zarg == null) {
            this.zarg = new LinkedList();
        }

        this.zarg.add(arg3);
        if(arg2 != null) {
            if(this.zarf == null) {
                this.zarf = arg2.clone();
            }
            else {
                this.zarf.putAll(arg2);
            }
        }

        this.createDelegate(this.zarh);
    }

    static LifecycleDelegate zab(DeferredLifecycleHelper arg0) {
        return arg0.zare;
    }

    private final void zal(int arg2) {
        while(!this.zarg.isEmpty()) {
            if(this.zarg.getLast().getState() < arg2) {
                return;
            }

            this.zarg.removeLast();
        }
    }
}

