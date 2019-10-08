package com.google.android.gms.auth.api.signin;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

public class GoogleSignInResult implements Result {
    private Status mStatus;
    private GoogleSignInAccount zzaz;

    public GoogleSignInResult(@Nullable GoogleSignInAccount arg1, @NonNull Status arg2) {
        super();
        this.zzaz = arg1;
        this.mStatus = arg2;
    }

    @Nullable public GoogleSignInAccount getSignInAccount() {
        return this.zzaz;
    }

    @NonNull public Status getStatus() {
        return this.mStatus;
    }

    public boolean isSuccess() {
        return this.mStatus.isSuccess();
    }
}

