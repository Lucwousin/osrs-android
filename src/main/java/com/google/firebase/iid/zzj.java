package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

final class zzj implements ThreadFactory {
    static final ThreadFactory zzaj;

    static {
        zzj.zzaj = new zzj();
    }

    private zzj() {
        super();
    }

    public final Thread newThread(Runnable arg1) {
        return zzi.zza(arg1);
    }
}

