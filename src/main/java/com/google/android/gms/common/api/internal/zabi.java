package com.google.android.gms.common.api.internal;

final class zabi implements BackgroundStateChangeListener {
    zabi(GoogleApiManager arg1) {
        this.zail = arg1;
        super();
    }

    public final void onBackgroundStateChanged(boolean arg4) {
        GoogleApiManager.zaa(this.zail).sendMessage(GoogleApiManager.zaa(this.zail).obtainMessage(1, Boolean.valueOf(arg4)));
    }
}

