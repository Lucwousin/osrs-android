package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk public class BlockingServiceConnection implements ServiceConnection {
    private boolean zze;
    private final BlockingQueue zzf;

    public BlockingServiceConnection() {
        super();
        this.zze = false;
        this.zzf = new LinkedBlockingQueue();
    }

    @KeepForSdk public IBinder getService() throws InterruptedException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
        if(!this.zze) {
            this.zze = true;
            return this.zzf.take();
        }

        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    @KeepForSdk public IBinder getServiceWithTimeout(long arg2, TimeUnit arg4) throws InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if(!this.zze) {
            this.zze = true;
            Object v2 = this.zzf.poll(arg2, arg4);
            if(v2 != null) {
                return ((IBinder)v2);
            }

            throw new TimeoutException("Timed out waiting for the service connection");
        }

        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName arg1, IBinder arg2) {
        this.zzf.add(arg2);
    }

    public void onServiceDisconnected(ComponentName arg1) {
    }
}

