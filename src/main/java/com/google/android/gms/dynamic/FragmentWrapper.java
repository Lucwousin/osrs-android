package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepForSdk;

@SuppressLint(value={"NewApi"}) @KeepForSdk public final class FragmentWrapper extends Stub {
    private Fragment zzhy;

    private FragmentWrapper(Fragment arg1) {
        super();
        this.zzhy = arg1;
    }

    public final Bundle getArguments() {
        return this.zzhy.getArguments();
    }

    public final int getId() {
        return this.zzhy.getId();
    }

    public final boolean getRetainInstance() {
        return this.zzhy.getRetainInstance();
    }

    public final String getTag() {
        return this.zzhy.getTag();
    }

    public final int getTargetRequestCode() {
        return this.zzhy.getTargetRequestCode();
    }

    public final boolean getUserVisibleHint() {
        return this.zzhy.getUserVisibleHint();
    }

    public final boolean isAdded() {
        return this.zzhy.isAdded();
    }

    public final boolean isDetached() {
        return this.zzhy.isDetached();
    }

    public final boolean isHidden() {
        return this.zzhy.isHidden();
    }

    public final boolean isInLayout() {
        return this.zzhy.isInLayout();
    }

    public final boolean isRemoving() {
        return this.zzhy.isRemoving();
    }

    public final boolean isResumed() {
        return this.zzhy.isResumed();
    }

    public final boolean isVisible() {
        return this.zzhy.isVisible();
    }

    public final void setHasOptionsMenu(boolean arg2) {
        this.zzhy.setHasOptionsMenu(arg2);
    }

    public final void setMenuVisibility(boolean arg2) {
        this.zzhy.setMenuVisibility(arg2);
    }

    public final void setRetainInstance(boolean arg2) {
        this.zzhy.setRetainInstance(arg2);
    }

    public final void setUserVisibleHint(boolean arg2) {
        this.zzhy.setUserVisibleHint(arg2);
    }

    public final void startActivity(Intent arg2) {
        this.zzhy.startActivity(arg2);
    }

    public final void startActivityForResult(Intent arg2, int arg3) {
        this.zzhy.startActivityForResult(arg2, arg3);
    }

    @KeepForSdk public static FragmentWrapper wrap(Fragment arg1) {
        if(arg1 != null) {
            return new FragmentWrapper(arg1);
        }

        return null;
    }

    public final void zza(IObjectWrapper arg2) {
        this.zzhy.registerForContextMenu(ObjectWrapper.unwrap(arg2));
    }

    public final IObjectWrapper zzad() {
        return ObjectWrapper.wrap(this.zzhy.getActivity());
    }

    public final IFragmentWrapper zzae() {
        return FragmentWrapper.wrap(this.zzhy.getParentFragment());
    }

    public final IObjectWrapper zzaf() {
        return ObjectWrapper.wrap(this.zzhy.getResources());
    }

    public final IFragmentWrapper zzag() {
        return FragmentWrapper.wrap(this.zzhy.getTargetFragment());
    }

    public final IObjectWrapper zzah() {
        return ObjectWrapper.wrap(this.zzhy.getView());
    }

    public final void zzb(IObjectWrapper arg2) {
        this.zzhy.unregisterForContextMenu(ObjectWrapper.unwrap(arg2));
    }
}

