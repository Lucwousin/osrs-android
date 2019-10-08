package com.google.firebase.iid;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final class zzap implements ComponentFactory {
    static final ComponentFactory zzcq;

    static {
        zzap.zzcq = new zzap();
    }

    private zzap() {
        super();
    }

    public final Object create(ComponentContainer arg3) {
        return new zza(arg3.get(FirebaseInstanceId.class));
    }
}

