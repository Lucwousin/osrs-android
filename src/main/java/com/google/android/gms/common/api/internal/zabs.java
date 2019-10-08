package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public interface zabs {
    ConnectionResult blockingConnect();

    ConnectionResult blockingConnect(long arg1, TimeUnit arg2);

    void connect();

    void disconnect();

    void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    ApiMethodImpl enqueue(@NonNull ApiMethodImpl arg1);

    ApiMethodImpl execute(@NonNull ApiMethodImpl arg1);

    @Nullable ConnectionResult getConnectionResult(@NonNull Api arg1);

    boolean isConnected();

    boolean isConnecting();

    boolean maybeSignIn(SignInConnectionListener arg1);

    void maybeSignOut();

    void zaw();
}

