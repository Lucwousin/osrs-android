package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzzn {
    private static volatile boolean zzbtt = false;
    private static final Class zzbtu;
    static final zzzn zzbtv;
    private final Map zzbtw;

    static {
        zzzn.zzbtu = zzzn.zzts();
        zzzn.zzbtv = new zzzn(true);
    }

    private zzzn(boolean arg1) {
        super();
        this.zzbtw = Collections.emptyMap();
    }

    zzzn() {
        super();
        this.zzbtw = new HashMap();
    }

    private static Class zzts() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        }
        catch(ClassNotFoundException ) {
            return null;
        }
    }

    public static zzzn zztt() {
        return zzzm.zztr();
    }
}

