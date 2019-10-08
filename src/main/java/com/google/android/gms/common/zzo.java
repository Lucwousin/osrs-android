package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class zzo extends zzm {
    private final Callable zzae;

    zzo(Callable arg1, zzn arg2) {
        this(arg1);
    }

    private zzo(Callable arg3) {
        super(false, null, null);
        this.zzae = arg3;
    }

    final String getErrorMessage() {
        try {
            return this.zzae.call();
        }
        catch(Exception v0) {
            throw new RuntimeException(((Throwable)v0));
        }
    }
}

