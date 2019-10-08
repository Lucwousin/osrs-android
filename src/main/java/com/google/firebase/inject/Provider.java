package com.google.firebase.inject;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public interface Provider {
    @KeepForSdk Object get();
}

