package com.google.android.gms.common.util.concurrent;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@KeepForSdk public class NamedThreadFactory implements ThreadFactory {
    private final String name;
    private final int priority;
    private final ThreadFactory zzhp;

    @KeepForSdk public NamedThreadFactory(String arg2) {
        this(arg2, 0);
    }

    private NamedThreadFactory(String arg1, int arg2) {
        super();
        this.zzhp = Executors.defaultThreadFactory();
        this.name = Preconditions.checkNotNull(arg1, "Name must not be null");
        this.priority = 0;
    }

    public Thread newThread(Runnable arg4) {
        Thread v4 = this.zzhp.newThread(new zza(arg4, 0));
        v4.setName(this.name);
        return v4;
    }
}

