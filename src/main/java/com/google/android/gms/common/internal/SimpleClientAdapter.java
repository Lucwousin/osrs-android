package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Api$SimpleClient;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;

public class SimpleClientAdapter extends GmsClient {
    private final SimpleClient zapf;

    public SimpleClientAdapter(Context arg8, Looper arg9, int arg10, ConnectionCallbacks arg11, OnConnectionFailedListener arg12, ClientSettings arg13, SimpleClient arg14) {
        super(arg8, arg9, arg10, arg13, arg11, arg12);
        this.zapf = arg14;
    }

    protected IInterface createServiceInterface(IBinder arg2) {
        return this.zapf.createServiceInterface(arg2);
    }

    public SimpleClient getClient() {
        return this.zapf;
    }

    public int getMinApkVersion() {
        return super.getMinApkVersion();
    }

    protected String getServiceDescriptor() {
        return this.zapf.getServiceDescriptor();
    }

    protected String getStartServiceAction() {
        return this.zapf.getStartServiceAction();
    }

    protected void onSetConnectState(int arg2, IInterface arg3) {
        this.zapf.setState(arg2, arg3);
    }
}

