package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;

final class zak implements ResultConverter {
    zak(Response arg1) {
        this.zaoy = arg1;
        super();
    }

    public final Object convert(Result arg2) {
        this.zaoy.setResult(arg2);
        return this.zaoy;
    }
}

