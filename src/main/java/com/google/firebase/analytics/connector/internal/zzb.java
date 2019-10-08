package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final class zzb implements ComponentFactory {
    static final ComponentFactory zzbql;

    static {
        zzb.zzbql = new zzb();
    }

    private zzb() {
        super();
    }

    public final Object create(ComponentContainer arg2) {
        return AnalyticsConnectorImpl.getInstance(arg2.get(Context.class));
    }
}

