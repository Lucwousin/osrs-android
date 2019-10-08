package com.google.android.gms.internal.measurement;

import java.util.Map$Entry;

final class zzaab implements Map$Entry {
    private Map$Entry zzbvb;

    private zzaab(Map$Entry arg1) {
        super();
        this.zzbvb = arg1;
    }

    zzaab(Map$Entry arg1, zzaaa arg2) {
        this(arg1);
    }

    public final Object getKey() {
        return this.zzbvb.getKey();
    }

    public final Object getValue() {
        if(this.zzbvb.getValue() == null) {
            return null;
        }

        return zzzz.zzud();
    }

    public final Object setValue(Object arg2) {
        if((arg2 instanceof zzaaq)) {
            return this.zzbvb.getValue().zzc(((zzaaq)arg2));
        }

        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}

