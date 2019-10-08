package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.api.proxy.ProxyApi$ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

final class zzaw implements ProxyResult {
    private Status mStatus;
    private ProxyResponse zzch;

    public zzaw(ProxyResponse arg1) {
        super();
        this.zzch = arg1;
        this.mStatus = Status.RESULT_SUCCESS;
    }

    public zzaw(Status arg1) {
        super();
        this.mStatus = arg1;
    }

    public final ProxyResponse getResponse() {
        return this.zzch;
    }

    public final Status getStatus() {
        return this.mStatus;
    }
}

