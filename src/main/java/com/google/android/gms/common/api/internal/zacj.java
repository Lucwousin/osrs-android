package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.BiConsumer;

final class zacj implements RemoteCall {
    private final BiConsumer zake;

    zacj(BiConsumer arg1) {
        super();
        this.zake = arg1;
    }

    public final void accept(Object arg2, Object arg3) {
        this.zake.accept(arg2, arg3);
    }
}

