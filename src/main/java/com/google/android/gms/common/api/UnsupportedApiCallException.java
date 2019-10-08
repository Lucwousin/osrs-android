package com.google.android.gms.common.api;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;

public final class UnsupportedApiCallException extends UnsupportedOperationException {
    private final Feature zzar;

    @KeepForSdk public UnsupportedApiCallException(Feature arg1) {
        super();
        this.zzar = arg1;
    }

    public final String getMessage() {
        String v0 = String.valueOf(this.zzar);
        StringBuilder v2 = new StringBuilder(String.valueOf(v0).length() + 8);
        v2.append("Missing ");
        v2.append(v0);
        return v2.toString();
    }
}

