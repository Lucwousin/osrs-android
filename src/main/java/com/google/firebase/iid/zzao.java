package com.google.firebase.iid;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.UserAgentPublisher;

final class zzao implements ComponentFactory {
    static final ComponentFactory zzcq;

    static {
        zzao.zzcq = new zzao();
    }

    private zzao() {
        super();
    }

    public final Object create(ComponentContainer arg5) {
        return new FirebaseInstanceId(arg5.get(FirebaseApp.class), arg5.get(Subscriber.class), arg5.get(UserAgentPublisher.class));
    }
}

