package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zabe implements zabs, zar {
    private final Context mContext;
    private final AbstractClientBuilder zacd;
    final zaaw zaed;
    private final Lock zaen;
    private final ClientSettings zaes;
    private final Map zaev;
    private final GoogleApiAvailabilityLight zaex;
    final Map zagy;
    private final Condition zahm;
    private final zabg zahn;
    final Map zaho;
    private volatile zabd zahp;
    private ConnectionResult zahq;
    int zahr;
    final zabt zahs;

    public zabe(Context arg2, zaaw arg3, Lock arg4, Looper arg5, GoogleApiAvailabilityLight arg6, Map arg7, ClientSettings arg8, Map arg9, AbstractClientBuilder arg10, ArrayList arg11, zabt arg12) {
        super();
        this.zaho = new HashMap();
        this.zahq = null;
        this.mContext = arg2;
        this.zaen = arg4;
        this.zaex = arg6;
        this.zagy = arg7;
        this.zaes = arg8;
        this.zaev = arg9;
        this.zacd = arg10;
        this.zaed = arg3;
        this.zahs = arg12;
        int v2 = arg11.size();
        int v3 = 0;
        while(v3 < v2) {
            Object v6 = arg11.get(v3);
            ++v3;
            ((zaq)v6).zaa(((zar)this));
        }

        this.zahn = new zabg(this, arg5);
        this.zahm = arg4.newCondition();
        this.zahp = new zaav(this);
    }

    @GuardedBy(value="mLock") public final ConnectionResult blockingConnect() {
        PendingIntent v1;
        this.connect();
        while(true) {
            v1 = null;
            if(!this.isConnecting()) {
                break;
            }

            try {
                this.zahm.await();
                continue;
            }
            catch(InterruptedException ) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, v1);
            }
        }

        if(this.isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }

        if(this.zahq != null) {
            return this.zahq;
        }

        return new ConnectionResult(13, v1);
    }

    @GuardedBy(value="mLock") public final ConnectionResult blockingConnect(long arg4, TimeUnit arg6) {
        PendingIntent v0;
        this.connect();
        arg4 = arg6.toNanos(arg4);
        while(true) {
            v0 = null;
            if(!this.isConnecting()) {
                break;
            }

            if(arg4 > 0) {
                goto label_12;
            }

            try {
                this.disconnect();
                return new ConnectionResult(14, v0);
            label_12:
                arg4 = this.zahm.awaitNanos(arg4);
                continue;
            }
            catch(InterruptedException ) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, v0);
            }
        }

        if(this.isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }

        if(this.zahq != null) {
            return this.zahq;
        }

        return new ConnectionResult(13, v0);
    }

    @GuardedBy(value="mLock") public final void connect() {
        this.zahp.connect();
    }

    @GuardedBy(value="mLock") public final void disconnect() {
        if(this.zahp.disconnect()) {
            this.zaho.clear();
        }
    }

    public final void dump(String arg6, FileDescriptor arg7, PrintWriter arg8, String[] arg9) {
        String v0 = String.valueOf(arg6).concat("  ");
        arg8.append(((CharSequence)arg6)).append("mState=").println(this.zahp);
        Iterator v1 = this.zaev.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            arg8.append(((CharSequence)arg6)).append(((Api)v2).getName()).println(":");
            this.zagy.get(((Api)v2).getClientKey()).dump(v0, arg7, arg8, arg9);
        }
    }

    @GuardedBy(value="mLock") public final ApiMethodImpl enqueue(@NonNull ApiMethodImpl arg2) {
        ((BasePendingResult)arg2).zau();
        return this.zahp.enqueue(arg2);
    }

    @GuardedBy(value="mLock") public final ApiMethodImpl execute(@NonNull ApiMethodImpl arg2) {
        ((BasePendingResult)arg2).zau();
        return this.zahp.execute(arg2);
    }

    @Nullable @GuardedBy(value="mLock") public final ConnectionResult getConnectionResult(@NonNull Api arg2) {
        AnyClientKey v2 = arg2.getClientKey();
        if(this.zagy.containsKey(v2)) {
            if(this.zagy.get(v2).isConnected()) {
                return ConnectionResult.RESULT_SUCCESS;
            }
            else if(this.zaho.containsKey(v2)) {
                return this.zaho.get(v2);
            }
        }

        return null;
    }

    public final boolean isConnected() {
        return this.zahp instanceof zaah;
    }

    public final boolean isConnecting() {
        return this.zahp instanceof zaak;
    }

    public final boolean maybeSignIn(SignInConnectionListener arg1) {
        return 0;
    }

    public final void maybeSignOut() {
    }

    public final void onConnected(@Nullable Bundle arg2) {
        this.zaen.lock();
        try {
            this.zahp.onConnected(arg2);
        }
        catch(Throwable v2) {
            this.zaen.unlock();
            throw v2;
        }

        this.zaen.unlock();
    }

    public final void onConnectionSuspended(int arg2) {
        this.zaen.lock();
        try {
            this.zahp.onConnectionSuspended(arg2);
        }
        catch(Throwable v2) {
            this.zaen.unlock();
            throw v2;
        }

        this.zaen.unlock();
    }

    static Lock zaa(zabe arg0) {
        return arg0.zaen;
    }

    final void zaa(zabf arg3) {
        this.zahn.sendMessage(this.zahn.obtainMessage(1, arg3));
    }

    public final void zaa(@NonNull ConnectionResult arg2, @NonNull Api arg3, boolean arg4) {
        this.zaen.lock();
        try {
            this.zahp.zaa(arg2, arg3, arg4);
        }
        catch(Throwable v2) {
            this.zaen.unlock();
            throw v2;
        }

        this.zaen.unlock();
    }

    final void zaaz() {
        this.zaen.lock();
        try {
            this.zahp = new zaak(this, this.zaes, this.zaev, this.zaex, this.zacd, this.zaen, this.mContext);
            this.zahp.begin();
            this.zahm.signalAll();
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

        this.zaen.unlock();
    }

    final void zab(RuntimeException arg3) {
        this.zahn.sendMessage(this.zahn.obtainMessage(2, arg3));
    }

    static zabd zab(zabe arg0) {
        return arg0.zahp;
    }

    final void zaba() {
        this.zaen.lock();
        try {
            this.zaed.zaaw();
            this.zahp = new zaah(this);
            this.zahp.begin();
            this.zahm.signalAll();
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

        this.zaen.unlock();
    }

    final void zaf(ConnectionResult arg2) {
        this.zaen.lock();
        try {
            this.zahq = arg2;
            this.zahp = new zaav(this);
            this.zahp.begin();
            this.zahm.signalAll();
        }
        catch(Throwable v2) {
            this.zaen.unlock();
            throw v2;
        }

        this.zaen.unlock();
    }

    @GuardedBy(value="mLock") public final void zaw() {
        if(this.isConnected()) {
            this.zahp.zaam();
        }
    }
}

