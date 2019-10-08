package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi$SpatulaHeaderResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public final class zzax implements SpatulaHeaderResult {
    private Status mStatus;
    private String zzci;

    public zzax(@Nonnull Status arg1) {
        super();
        this.mStatus = Preconditions.checkNotNull(arg1);
    }

    public zzax(@Nonnull String arg1) {
        super();
        this.zzci = Preconditions.checkNotNull(arg1);
        this.mStatus = Status.RESULT_SUCCESS;
    }

    @Nullable public final String getSpatulaHeader() {
        return this.zzci;
    }

    @Nullable public final Status getStatus() {
        return this.mStatus;
    }
}

