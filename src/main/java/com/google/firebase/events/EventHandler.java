package com.google.firebase.events;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public interface EventHandler {
    @KeepForSdk void handle(Event arg1);
}

