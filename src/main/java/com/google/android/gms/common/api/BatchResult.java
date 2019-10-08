package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

public final class BatchResult implements Result {
    private final Status mStatus;
    private final PendingResult[] zabc;

    BatchResult(Status arg1, PendingResult[] arg2) {
        super();
        this.mStatus = arg1;
        this.zabc = arg2;
    }

    public final Status getStatus() {
        return this.mStatus;
    }

    public final Result take(BatchResultToken arg4) {
        boolean v0 = arg4.mId < this.zabc.length ? true : false;
        Preconditions.checkArgument(v0, "The result token does not belong to this batch");
        return this.zabc[arg4.mId].await(0, TimeUnit.MILLISECONDS);
    }
}

