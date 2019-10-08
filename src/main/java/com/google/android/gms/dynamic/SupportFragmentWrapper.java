package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public final class SupportFragmentWrapper extends Stub {
    private Fragment zzic;

    private SupportFragmentWrapper(Fragment arg1) {
        super();
        this.zzic = arg1;
    }

    public final Bundle getArguments() {
        return this.zzic.getArguments();
    }

    public final int getId() {
        return this.zzic.getId();
    }

    public final boolean getRetainInstance() {
        return this.zzic.getRetainInstance();
    }

    public final String getTag() {
        return this.zzic.getTag();
    }

    public final int getTargetRequestCode() {
        return this.zzic.getTargetRequestCode();
    }

    public final boolean getUserVisibleHint() {
        return this.zzic.getUserVisibleHint();
    }

    public final boolean isAdded() {
        return this.zzic.isAdded();
    }

    public final boolean isDetached() {
        return this.zzic.isDetached();
    }

    public final boolean isHidden() {
        return this.zzic.isHidden();
    }

    public final boolean isInLayout() {
        return this.zzic.isInLayout();
    }

    public final boolean isRemoving() {
        return this.zzic.isRemoving();
    }

    public final boolean isResumed() {
        return this.zzic.isResumed();
    }

    public final boolean isVisible() {
        return this.zzic.isVisible();
    }

    public final void setHasOptionsMenu(boolean arg2) {
        this.zzic.setHasOptionsMenu(arg2);
    }

    public final void setMenuVisibility(boolean arg2) {
        this.zzic.setMenuVisibility(arg2);
    }

    public final void setRetainInstance(boolean arg2) {
        this.zzic.setRetainInstance(arg2);
    }

    public final void setUserVisibleHint(boolean arg2) {
        this.zzic.setUserVisibleHint(arg2);
    }

    public final void startActivity(Intent arg2) {
        this.zzic.startActivity(arg2);
    }

    public final void startActivityForResult(Intent arg2, int arg3) {
        this.zzic.startActivityForResult(arg2, arg3);
    }

    @KeepForSdk public static SupportFragmentWrapper wrap(Fragment arg1) {
        if(arg1 != null) {
            return new SupportFragmentWrapper(arg1);
        }

        return null;
    }

    public final void zza(IObjectWrapper arg2) {
        this.zzic.registerForContextMenu(ObjectWrapper.unwrap(arg2));
    }

    public final IObjectWrapper zzad() {
        return ObjectWrapper.wrap(this.zzic.getActivity());
    }

    public final IFragmentWrapper zzae() {
        return SupportFragmentWrapper.wrap(this.zzic.getParentFragment());
    }

    public final IObjectWrapper zzaf() {
        return ObjectWrapper.wrap(this.zzic.getResources());
    }

    public final IFragmentWrapper zzag() {
        return SupportFragmentWrapper.wrap(this.zzic.getTargetFragment());
    }

    public final IObjectWrapper zzah() {
        return ObjectWrapper.wrap(this.zzic.getView());
    }

    public final void zzb(IObjectWrapper arg2) {
        this.zzic.unregisterForContextMenu(ObjectWrapper.unwrap(arg2));
    }
}

