package com.google.firebase.events;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;

@KeepForSdk public interface Subscriber {
    @KeepForSdk void subscribe(Class arg1, EventHandler arg2);

    @KeepForSdk void subscribe(Class arg1, Executor arg2, EventHandler arg3);

    @KeepForSdk void unsubscribe(Class arg1, EventHandler arg2);
}

