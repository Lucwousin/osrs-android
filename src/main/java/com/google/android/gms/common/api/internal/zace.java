package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zaa;
import com.google.android.gms.signin.zad;
import java.util.Set;

public final class zace extends zac implements ConnectionCallbacks, OnConnectionFailedListener {
    private final Context mContext;
    private final Handler mHandler;
    private Set mScopes;
    private final AbstractClientBuilder zaau;
    private ClientSettings zaes;
    private zad zaga;
    private static AbstractClientBuilder zakh;
    private zach zaki;

    static {
        zace.zakh = zaa.zapg;
    }

    @WorkerThread public zace(Context arg2, Handler arg3, @NonNull ClientSettings arg4) {
        this(arg2, arg3, arg4, zace.zakh);
    }

    @WorkerThread public zace(Context arg1, Handler arg2, @NonNull ClientSettings arg3, AbstractClientBuilder arg4) {
        super();
        this.mContext = arg1;
        this.mHandler = arg2;
        this.zaes = Preconditions.checkNotNull(arg3, "ClientSettings must not be null");
        this.mScopes = arg3.getRequiredScopes();
        this.zaau = arg4;
    }

    @WorkerThread public final void onConnected(@Nullable Bundle arg1) {
        this.zaga.zaa(((com.google.android.gms.signin.internal.zad)this));
    }

    @WorkerThread public final void onConnectionFailed(@NonNull ConnectionResult arg2) {
        this.zaki.zag(arg2);
    }

    @WorkerThread public final void onConnectionSuspended(int arg1) {
        this.zaga.disconnect();
    }

    @WorkerThread public final void zaa(zach arg10) {
        if(this.zaga != null) {
            this.zaga.disconnect();
        }

        this.zaes.setClientSessionId(Integer.valueOf(System.identityHashCode(this)));
        this.zaga = this.zaau.buildClient(this.mContext, this.mHandler.getLooper(), this.zaes, this.zaes.getSignInOptions(), this, this);
        this.zaki = arg10;
        if(this.mScopes != null) {
            if(this.mScopes.isEmpty()) {
            }
            else {
                this.zaga.connect();
                return;
            }
        }

        this.mHandler.post(new zacf(this));
    }

    static zach zaa(zace arg0) {
        return arg0.zaki;
    }

    static void zaa(zace arg0, zaj arg1) {
        arg0.zac(arg1);
    }

    @BinderThread public final void zab(zaj arg3) {
        this.mHandler.post(new zacg(this, arg3));
    }

    public final zad zabq() {
        return this.zaga;
    }

    public final void zabs() {
        if(this.zaga != null) {
            this.zaga.disconnect();
        }
    }

    @WorkerThread private final void zac(zaj arg5) {
        ConnectionResult v0 = arg5.getConnectionResult();
        if(v0.isSuccess()) {
            ResolveAccountResponse v5 = arg5.zacw();
            v0 = v5.getConnectionResult();
            if(!v0.isSuccess()) {
                String v1 = String.valueOf(v0);
                StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 0x30);
                v3.append("Sign-in succeeded with resolve account failure: ");
                v3.append(v1);
                Log.wtf("SignInCoordinator", v3.toString(), new Exception());
                this.zaki.zag(v0);
                this.zaga.disconnect();
                return;
            }
            else {
                this.zaki.zaa(v5.getAccountAccessor(), this.mScopes);
            }
        }
        else {
            this.zaki.zag(v0);
        }

        this.zaga.disconnect();
    }
}

