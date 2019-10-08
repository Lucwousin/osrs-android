package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zal;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class GmsClientEventManager implements Handler$Callback {
    @VisibleForTesting public interface GmsClientEventState {
        Bundle getConnectionHint();

        boolean isConnected();
    }

    private final Handler mHandler;
    private final Object mLock;
    private final GmsClientEventState zaok;
    private final ArrayList zaol;
    @VisibleForTesting private final ArrayList zaom;
    private final ArrayList zaon;
    private volatile boolean zaoo;
    private final AtomicInteger zaop;
    private boolean zaoq;

    public GmsClientEventManager(Looper arg3, GmsClientEventState arg4) {
        super();
        this.zaol = new ArrayList();
        this.zaom = new ArrayList();
        this.zaon = new ArrayList();
        this.zaoo = false;
        this.zaop = new AtomicInteger(0);
        this.zaoq = false;
        this.mLock = new Object();
        this.zaok = arg4;
        this.mHandler = new zal(arg3, ((Handler$Callback)this));
    }

    public final boolean areCallbacksEnabled() {
        return this.zaoo;
    }

    public final void disableCallbacks() {
        this.zaoo = false;
        this.zaop.incrementAndGet();
    }

    public final void enableCallbacks() {
        this.zaoo = true;
    }

    public final boolean handleMessage(Message arg4) {
        if(arg4.what == 1) {
            Object v4 = arg4.obj;
            Object v0 = this.mLock;
            __monitor_enter(v0);
            try {
                if((this.zaoo) && (this.zaok.isConnected()) && (this.zaol.contains(v4))) {
                    ((ConnectionCallbacks)v4).onConnected(this.zaok.getConnectionHint());
                }

                __monitor_exit(v0);
                return 1;
            label_20:
                __monitor_exit(v0);
            }
            catch(Throwable v4_1) {
                goto label_20;
            }

            throw v4_1;
        }

        int v4_2 = arg4.what;
        StringBuilder v2 = new StringBuilder(45);
        v2.append("Don\'t know how to handle message: ");
        v2.append(v4_2);
        Log.wtf("GmsClientEvents", v2.toString(), new Exception());
        return 0;
    }

    public final boolean isConnectionCallbacksRegistered(ConnectionCallbacks arg3) {
        Preconditions.checkNotNull(arg3);
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.zaol.contains(arg3);
        label_8:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_8;
        }

        throw v3;
    }

    public final boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener arg3) {
        Preconditions.checkNotNull(arg3);
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.zaon.contains(arg3);
        label_8:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_8;
        }

        throw v3;
    }

    @VisibleForTesting public final void onConnectionFailure(ConnectionResult arg8) {
        int v2 = 0;
        boolean v0 = Looper.myLooper() == this.mHandler.getLooper() ? true : false;
        Preconditions.checkState(v0, "onConnectionFailure must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        Object v0_1 = this.mLock;
        __monitor_enter(v0_1);
        try {
            ArrayList v1 = new ArrayList(this.zaon);
            int v3 = this.zaop.get();
            int v4 = v1.size();
            while(true) {
                if(v2 >= v4) {
                    goto label_37;
                }

                Object v5 = v1.get(v2);
                ++v2;
                if(this.zaoo) {
                    if(this.zaop.get() != v3) {
                    }
                    else {
                        if(!this.zaon.contains(v5)) {
                            continue;
                        }

                        ((OnConnectionFailedListener)v5).onConnectionFailed(arg8);
                        continue;
                    }
                }

                break;
            }

            __monitor_exit(v0_1);
            return;
        label_37:
            __monitor_exit(v0_1);
            return;
        label_40:
            __monitor_exit(v0_1);
        }
        catch(Throwable v8) {
            goto label_40;
        }

        throw v8;
    }

    @VisibleForTesting protected final void onConnectionSuccess() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            this.onConnectionSuccess(this.zaok.getConnectionHint());
            __monitor_exit(v0);
            return;
        label_8:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_8;
        }

        throw v1;
    }

    @VisibleForTesting public final void onConnectionSuccess(Bundle arg9) {
        boolean v3 = true;
        boolean v0 = Looper.myLooper() == this.mHandler.getLooper() ? true : false;
        Preconditions.checkState(v0, "onConnectionSuccess must only be called on the Handler thread");
        Object v0_1 = this.mLock;
        __monitor_enter(v0_1);
        try {
            Preconditions.checkState(this.zaoq ^ 1);
            this.mHandler.removeMessages(1);
            this.zaoq = true;
            if(this.zaom.size() == 0) {
            }
            else {
                v3 = false;
            }

            Preconditions.checkState(v3);
            ArrayList v1 = new ArrayList(this.zaol);
            int v3_1 = this.zaop.get();
            int v4 = v1.size();
            int v5 = 0;
            while(v5 < v4) {
                Object v6 = v1.get(v5);
                ++v5;
                if(!this.zaoo) {
                    break;
                }

                if(!this.zaok.isConnected()) {
                    break;
                }

                if(this.zaop.get() != v3_1) {
                    break;
                }

                if(this.zaom.contains(v6)) {
                    continue;
                }

                ((ConnectionCallbacks)v6).onConnected(arg9);
            }

            this.zaom.clear();
            this.zaoq = false;
            __monitor_exit(v0_1);
            return;
        label_54:
            __monitor_exit(v0_1);
        }
        catch(Throwable v9) {
            goto label_54;
        }

        throw v9;
    }

    @VisibleForTesting public final void onUnintentionalDisconnection(int arg9) {
        boolean v0 = Looper.myLooper() == this.mHandler.getLooper() ? true : false;
        Preconditions.checkState(v0, "onUnintentionalDisconnection must only be called on the Handler thread");
        this.mHandler.removeMessages(1);
        Object v0_1 = this.mLock;
        __monitor_enter(v0_1);
        try {
            this.zaoq = true;
            ArrayList v1 = new ArrayList(this.zaol);
            int v3 = this.zaop.get();
            int v4 = v1.size();
            int v5 = 0;
            while(v5 < v4) {
                Object v6 = v1.get(v5);
                ++v5;
                if(!this.zaoo) {
                    break;
                }

                if(this.zaop.get() != v3) {
                    break;
                }

                if(!this.zaol.contains(v6)) {
                    continue;
                }

                ((ConnectionCallbacks)v6).onConnectionSuspended(arg9);
            }

            this.zaom.clear();
            this.zaoq = false;
            __monitor_exit(v0_1);
            return;
        label_42:
            __monitor_exit(v0_1);
        }
        catch(Throwable v9) {
            goto label_42;
        }

        throw v9;
    }

    public final void registerConnectionCallbacks(ConnectionCallbacks arg6) {
        Preconditions.checkNotNull(arg6);
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zaol.contains(arg6)) {
                String v2 = String.valueOf(arg6);
                StringBuilder v4 = new StringBuilder(String.valueOf(v2).length() + 62);
                v4.append("registerConnectionCallbacks(): listener ");
                v4.append(v2);
                v4.append(" is already registered");
                Log.w("GmsClientEvents", v4.toString());
            }
            else {
                this.zaol.add(arg6);
            }

            __monitor_exit(v0);
        }
        catch(Throwable v6) {
            try {
            label_34:
                __monitor_exit(v0);
            }
            catch(Throwable v6) {
                goto label_34;
            }

            throw v6;
        }

        if(this.zaok.isConnected()) {
            this.mHandler.sendMessage(this.mHandler.obtainMessage(1, arg6));
        }
    }

    public final void registerConnectionFailedListener(OnConnectionFailedListener arg5) {
        Preconditions.checkNotNull(arg5);
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zaon.contains(arg5)) {
                String v5_1 = String.valueOf(arg5);
                StringBuilder v3 = new StringBuilder(String.valueOf(v5_1).length() + 67);
                v3.append("registerConnectionFailedListener(): listener ");
                v3.append(v5_1);
                v3.append(" is already registered");
                Log.w("GmsClientEvents", v3.toString());
            }
            else {
                this.zaon.add(arg5);
            }

            __monitor_exit(v0);
            return;
        label_26:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_26;
        }

        throw v5;
    }

    public final void unregisterConnectionCallbacks(ConnectionCallbacks arg5) {
        Preconditions.checkNotNull(arg5);
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(!this.zaol.remove(arg5)) {
                String v5_1 = String.valueOf(arg5);
                StringBuilder v3 = new StringBuilder(String.valueOf(v5_1).length() + 52);
                v3.append("unregisterConnectionCallbacks(): listener ");
                v3.append(v5_1);
                v3.append(" not found");
                Log.w("GmsClientEvents", v3.toString());
            }
            else if(this.zaoq) {
                this.zaom.add(arg5);
            }

            __monitor_exit(v0);
            return;
        label_28:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_28;
        }

        throw v5;
    }

    public final void unregisterConnectionFailedListener(OnConnectionFailedListener arg5) {
        Preconditions.checkNotNull(arg5);
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(!this.zaon.remove(arg5)) {
                String v5_1 = String.valueOf(arg5);
                StringBuilder v3 = new StringBuilder(String.valueOf(v5_1).length() + 57);
                v3.append("unregisterConnectionFailedListener(): listener ");
                v3.append(v5_1);
                v3.append(" not found");
                Log.w("GmsClientEvents", v3.toString());
            }

            __monitor_exit(v0);
            return;
        label_23:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_23;
        }

        throw v5;
    }
}

