package com.google.firebase;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;

@KeepForSdk public class FirebaseExceptionMapper implements StatusExceptionMapper {
    public FirebaseExceptionMapper() {
        super();
    }

    public Exception getException(Status arg3) {
        if(arg3.getStatusCode() == 8) {
            return new FirebaseException(arg3.zzg());
        }

        return new FirebaseApiNotAvailableException(arg3.zzg());
    }
}

