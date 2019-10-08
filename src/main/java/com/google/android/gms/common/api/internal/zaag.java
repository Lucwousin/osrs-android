package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public class zaag extends GoogleApiClient {
    private final String zafr;

    public zaag(String arg1) {
        super();
        this.zafr = arg1;
    }

    public ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException(this.zafr);
    }

    public ConnectionResult blockingConnect(long arg1, @NonNull TimeUnit arg3) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public PendingResult clearDefaultAccountAndReconnect() {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void connect() {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void disconnect() {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4) {
        throw new UnsupportedOperationException(this.zafr);
    }

    @NonNull public ConnectionResult getConnectionResult(@NonNull Api arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public boolean hasConnectedApi(@NonNull Api arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public boolean isConnected() {
        throw new UnsupportedOperationException(this.zafr);
    }

    public boolean isConnecting() {
        throw new UnsupportedOperationException(this.zafr);
    }

    public boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void reconnect() {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void registerConnectionCallbacks(@NonNull ConnectionCallbacks arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void registerConnectionFailedListener(@NonNull OnConnectionFailedListener arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void stopAutoManage(@NonNull FragmentActivity arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }

    public void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener arg2) {
        throw new UnsupportedOperationException(this.zafr);
    }
}

