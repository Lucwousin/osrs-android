package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.concurrent.GuardedBy;

@ShowFirstParty public abstract class zac {
    private static final Object sLock;
    @GuardedBy(value="sLock") private static final Map zacj;

    static {
        zac.zacj = new WeakHashMap();
        zac.sLock = new Object();
    }

    public zac() {
        super();
    }

    public abstract void remove(int arg1);
}

