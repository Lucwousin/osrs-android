package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequestResult;
import com.google.android.gms.common.api.Status;

public final class zzh implements CredentialRequestResult {
    private final Status mStatus;
    private final Credential zzal;

    public zzh(Status arg1, Credential arg2) {
        super();
        this.mStatus = arg1;
        this.zzal = arg2;
    }

    public final Credential getCredential() {
        return this.zzal;
    }

    public final Status getStatus() {
        return this.mStatus;
    }

    public static zzh zzd(Status arg2) {
        return new zzh(arg2, null);
    }
}

