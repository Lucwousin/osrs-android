package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@KeepForSdk public class NumberedThreadFactory implements ThreadFactory {
    private final int priority;
    private final ThreadFactory zzhp;
    private final String zzhq;
    private final AtomicInteger zzhr;

    @KeepForSdk public NumberedThreadFactory(String arg2) {
        this(arg2, 0);
    }

    private NumberedThreadFactory(String arg1, int arg2) {
        super();
        this.zzhr = new AtomicInteger();
        this.zzhp = Executors.defaultThreadFactory();
        this.zzhq = Preconditions.checkNotNull(arg1, "Name must not be null");
        this.priority = 0;
    }

    public Thread newThread(Runnable arg5) {
        Thread v5 = this.zzhp.newThread(new zza(arg5, 0));
        String v0 = this.zzhq;
        int v1 = this.zzhr.getAndIncrement();
        StringBuilder v3 = new StringBuilder(String.valueOf(v0).length() + 13);
        v3.append(v0);
        v3.append("[");
        v3.append(v1);
        v3.append("]");
        v5.setName(v3.toString());
        return v5;
    }
}

