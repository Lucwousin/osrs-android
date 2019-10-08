package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient$SignOutCallbacks;

final class zabm implements SignOutCallbacks {
    zabm(zaa arg1) {
        this.zaix = arg1;
        super();
    }

    public final void onSignOutComplete() {
        GoogleApiManager.zaa(this.zaix.zail).post(new zabn(this));
    }
}

