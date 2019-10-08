package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.ClientSettings;

public final class zaw extends GoogleApi {
    private final AbstractClientBuilder zacd;
    private final Client zaeq;
    private final zaq zaer;
    private final ClientSettings zaes;

    public zaw(@NonNull Context arg1, Api arg2, Looper arg3, @NonNull Client arg4, @NonNull zaq arg5, ClientSettings arg6, AbstractClientBuilder arg7) {
        super(arg1, arg2, arg3);
        this.zaeq = arg4;
        this.zaer = arg5;
        this.zaes = arg6;
        this.zacd = arg7;
        this.zabm.zaa(((GoogleApi)this));
    }

    public final Client zaa(Looper arg1, zaa arg2) {
        this.zaer.zaa(((zar)arg2));
        return this.zaeq;
    }

    public final zace zaa(Context arg4, Handler arg5) {
        return new zace(arg4, arg5, this.zaes, this.zacd);
    }

    public final Client zaab() {
        return this.zaeq;
    }
}

