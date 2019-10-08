package com.google.android.gms.common.api.internal;

final class zap extends ThreadLocal {
    zap() {
        super();
    }

    protected final Object initialValue() {
        return Boolean.valueOf(false);
    }
}

