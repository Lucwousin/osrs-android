package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

@KeepForSdk public class ApiExceptionUtil {
    public ApiExceptionUtil() {
        super();
    }

    @NonNull @KeepForSdk public static ApiException fromStatus(@NonNull Status arg1) {
        if(arg1.hasResolution()) {
            return new ResolvableApiException(arg1);
        }

        return new ApiException(arg1);
    }
}

