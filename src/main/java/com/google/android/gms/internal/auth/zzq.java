package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzq implements Result {
    private final Status mStatus;

    public zzq(Status arg1) {
        super();
        this.mStatus = arg1;
    }

    public final Status getStatus() {
        return this.mStatus;
    }
}

