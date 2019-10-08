package com.google.firebase.auth;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;
import com.google.firebase.annotations.PublicApi;

@PublicApi public class FirebaseAuthException extends FirebaseException {
    private final String errorCode;

    @PublicApi public FirebaseAuthException(@NonNull String arg1, @NonNull String arg2) {
        super(arg2);
        this.errorCode = Preconditions.checkNotEmpty(arg1);
    }

    @NonNull @PublicApi public String getErrorCode() {
        return this.errorCode;
    }
}

