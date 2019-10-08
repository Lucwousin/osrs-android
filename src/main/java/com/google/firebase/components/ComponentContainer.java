package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.inject.Provider;
import java.util.Set;

@KeepForSdk public interface ComponentContainer {
    @KeepForSdk Object get(Class arg1);

    @KeepForSdk Provider getProvider(Class arg1);

    @KeepForSdk Set setOf(Class arg1);

    @KeepForSdk Provider setOfProvider(Class arg1);
}

