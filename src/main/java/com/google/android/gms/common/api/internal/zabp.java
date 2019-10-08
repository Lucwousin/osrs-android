package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi;

public final class zabp extends zaag {
    private final GoogleApi zajg;

    public zabp(GoogleApi arg2) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.zajg = arg2;
    }

    public final ApiMethodImpl enqueue(@NonNull ApiMethodImpl arg2) {
        return this.zajg.doRead(arg2);
    }

    public final ApiMethodImpl execute(@NonNull ApiMethodImpl arg2) {
        return this.zajg.doWrite(arg2);
    }

    public final Context getContext() {
        return this.zajg.getApplicationContext();
    }

    public final Looper getLooper() {
        return this.zajg.getLooper();
    }

    public final void zaa(zacm arg1) {
    }

    public final void zab(zacm arg1) {
    }
}

