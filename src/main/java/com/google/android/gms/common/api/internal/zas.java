package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zal;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

final class zas implements zabs {
    private final Context mContext;
    private final Looper zabj;
    private final zaaw zaed;
    private final zabe zaee;
    private final zabe zaef;
    private final Map zaeg;
    private final Set zaeh;
    private final Client zaei;
    private Bundle zaej;
    private ConnectionResult zaek;
    private ConnectionResult zael;
    private boolean zaem;
    private final Lock zaen;
    @GuardedBy(value="mLock") private int zaeo;

    private zas(Context arg19, zaaw arg20, Lock arg21, Looper arg22, GoogleApiAvailabilityLight arg23, Map arg24, Map arg25, ClientSettings arg26, AbstractClientBuilder arg27, Client arg28, ArrayList arg29, ArrayList arg30, Map arg31, Map arg32) {
        zas v0 = this;
        super();
        v0.zaeh = Collections.newSetFromMap(new WeakHashMap());
        v0.zaek = null;
        v0.zael = null;
        v0.zaem = false;
        v0.zaeo = 0;
        v0.mContext = arg19;
        v0.zaed = arg20;
        v0.zaen = arg21;
        v0.zabj = arg22;
        v0.zaei = arg28;
        v0.zaee = new zabe(arg19, v0.zaed, arg21, arg22, arg23, arg25, null, arg32, null, arg30, new zau(v0, null));
        v0.zaef = new zabe(arg19, v0.zaed, arg21, arg22, arg23, arg24, arg26, arg31, arg27, arg29, new zav(v0, null));
        ArrayMap v1 = new ArrayMap();
        Iterator v2 = arg25.keySet().iterator();
        while(v2.hasNext()) {
            v1.put(v2.next(), v0.zaee);
        }

        v2 = arg24.keySet().iterator();
        while(v2.hasNext()) {
            v1.put(v2.next(), v0.zaef);
        }

        v0.zaeg = Collections.unmodifiableMap(((Map)v1));
    }

    @GuardedBy(value="mLock") public final ConnectionResult blockingConnect() {
        throw new UnsupportedOperationException();
    }

    @GuardedBy(value="mLock") public final ConnectionResult blockingConnect(long arg1, @NonNull TimeUnit arg3) {
        throw new UnsupportedOperationException();
    }

    @GuardedBy(value="mLock") public final void connect() {
        this.zaeo = 2;
        this.zaem = false;
        this.zael = null;
        this.zaek = null;
        this.zaee.connect();
        this.zaef.connect();
    }

    @GuardedBy(value="mLock") public final void disconnect() {
        this.zael = null;
        this.zaek = null;
        this.zaeo = 0;
        this.zaee.disconnect();
        this.zaef.disconnect();
        this.zay();
    }

    public final void dump(String arg4, FileDescriptor arg5, PrintWriter arg6, String[] arg7) {
        arg6.append(((CharSequence)arg4)).append("authClient").println(":");
        this.zaef.dump(String.valueOf(arg4).concat("  "), arg5, arg6, arg7);
        arg6.append(((CharSequence)arg4)).append("anonClient").println(":");
        this.zaee.dump(String.valueOf(arg4).concat("  "), arg5, arg6, arg7);
    }

    @GuardedBy(value="mLock") public final ApiMethodImpl enqueue(@NonNull ApiMethodImpl arg5) {
        if(this.zaa(arg5)) {
            if(this.zaz()) {
                arg5.setFailedResult(new Status(4, null, this.zaaa()));
                return arg5;
            }

            return this.zaef.enqueue(arg5);
        }

        return this.zaee.enqueue(arg5);
    }

    @GuardedBy(value="mLock") public final ApiMethodImpl execute(@NonNull ApiMethodImpl arg5) {
        if(this.zaa(arg5)) {
            if(this.zaz()) {
                arg5.setFailedResult(new Status(4, null, this.zaaa()));
                return arg5;
            }

            return this.zaef.execute(arg5);
        }

        return this.zaee.execute(arg5);
    }

    @Nullable @GuardedBy(value="mLock") public final ConnectionResult getConnectionResult(@NonNull Api arg3) {
        if(this.zaeg.get(arg3.getClientKey()).equals(this.zaef)) {
            if(this.zaz()) {
                return new ConnectionResult(4, this.zaaa());
            }

            return this.zaef.getConnectionResult(arg3);
        }

        return this.zaee.getConnectionResult(arg3);
    }

    public final boolean isConnected() {
        boolean v1;
        this.zaen.lock();
        try {
            v1 = true;
            if(!this.zaee.isConnected()) {
                goto label_14;
            }
            else if(!this.zaef.isConnected() && !this.zaz()) {
                if(this.zaeo != 1) {
                    goto label_14;
                }

                goto label_13;
            }

            goto label_15;
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

    label_13:
        goto label_15;
    label_14:
        v1 = false;
    label_15:
        this.zaen.unlock();
        return v1;
    }

    public final boolean isConnecting() {
        this.zaen.lock();
        try {
            if(this.zaeo != 2) {
                goto label_7;
            }
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

        boolean v0_1 = true;
        goto label_8;
    label_7:
        v0_1 = false;
    label_8:
        this.zaen.unlock();
        return v0_1;
    }

    public final boolean maybeSignIn(SignInConnectionListener arg2) {
        this.zaen.lock();
        try {
            if(((this.isConnecting()) || (this.isConnected())) && !this.zaef.isConnected()) {
                this.zaeh.add(arg2);
                if(this.zaeo == 0) {
                    this.zaeo = 1;
                }

                this.zael = null;
                this.zaef.connect();
                goto label_19;
            }

            goto label_22;
        }
        catch(Throwable v2) {
            this.zaen.unlock();
            throw v2;
        }

    label_19:
        this.zaen.unlock();
        return 1;
    label_22:
        this.zaen.unlock();
        return 0;
    }

    public final void maybeSignOut() {
        this.zaen.lock();
        try {
            boolean v0_1 = this.isConnecting();
            this.zaef.disconnect();
            this.zael = new ConnectionResult(4);
            if(v0_1) {
                new zal(this.zabj).post(new zat(this));
            }
            else {
                this.zay();
            }
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

        this.zaen.unlock();
    }

    static Lock zaa(zas arg0) {
        return arg0.zaen;
    }

    public static zas zaa(Context arg16, zaaw arg17, Lock arg18, Looper arg19, GoogleApiAvailabilityLight arg20, Map arg21, ClientSettings arg22, Map arg23, AbstractClientBuilder arg24, ArrayList arg25) {
        Object v3;
        Object v2;
        Map v0 = arg23;
        ArrayMap v6 = new ArrayMap();
        ArrayMap v7 = new ArrayMap();
        Iterator v1 = arg21.entrySet().iterator();
        Client v10 = null;
        while(v1.hasNext()) {
            v2 = v1.next();
            v3 = ((Map$Entry)v2).getValue();
            if(((Client)v3).providesSignIn()) {
                Object v10_1 = v3;
            }

            if(((Client)v3).requiresSignIn()) {
                ((Map)v6).put(((Map$Entry)v2).getKey(), v3);
                continue;
            }

            ((Map)v7).put(((Map$Entry)v2).getKey(), v3);
        }

        Preconditions.checkState(((Map)v6).isEmpty() ^ 1, "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        ArrayMap v13 = new ArrayMap();
        ArrayMap v14 = new ArrayMap();
        v1 = arg23.keySet().iterator();
        while(true) {
            if(!v1.hasNext()) {
                goto label_52;
            }

            v2 = v1.next();
            AnyClientKey v3_1 = ((Api)v2).getClientKey();
            if(((Map)v6).containsKey(v3_1)) {
                ((Map)v13).put(v2, v0.get(v2));
                continue;
            }

            if(!((Map)v7).containsKey(v3_1)) {
                break;
            }

            ((Map)v14).put(v2, v0.get(v2));
        }

        throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
    label_52:
        ArrayList v11 = new ArrayList();
        ArrayList v12 = new ArrayList();
        ArrayList v0_1 = arg25;
        int v1_1 = v0_1.size();
        int v2_1 = 0;
        while(true) {
            if(v2_1 >= v1_1) {
                goto label_76;
            }

            v3 = v0_1.get(v2_1);
            ++v2_1;
            if(((Map)v13).containsKey(((zaq)v3).mApi)) {
                v11.add(v3);
                continue;
            }

            if(!((Map)v14).containsKey(((zaq)v3).mApi)) {
                break;
            }

            v12.add(v3);
        }

        throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
    label_76:
        return new zas(arg16, arg17, arg18, arg19, arg20, ((Map)v6), ((Map)v7), arg22, arg24, v10, v11, v12, ((Map)v13), ((Map)v14));
    }

    static ConnectionResult zaa(zas arg0, ConnectionResult arg1) {
        arg0.zaek = arg1;
        return arg1;
    }

    @GuardedBy(value="mLock") private final void zaa(int arg2, boolean arg3) {
        this.zaed.zab(arg2, arg3);
        this.zael = null;
        this.zaek = null;
    }

    private final void zaa(Bundle arg2) {
        if(this.zaej == null) {
            this.zaej = arg2;
            return;
        }

        if(arg2 != null) {
            this.zaej.putAll(arg2);
        }
    }

    @GuardedBy(value="mLock") private final void zaa(ConnectionResult arg3) {
        switch(this.zaeo) {
            case 1: {
                goto label_10;
            }
            case 2: {
                goto label_8;
            }
        }

        Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        goto label_11;
    label_8:
        this.zaed.zac(arg3);
    label_10:
        this.zay();
    label_11:
        this.zaeo = 0;
    }

    static void zaa(zas arg0, int arg1, boolean arg2) {
        arg0.zaa(arg1, arg2);
    }

    static void zaa(zas arg0, Bundle arg1) {
        arg0.zaa(arg1);
    }

    private final boolean zaa(ApiMethodImpl arg3) {
        AnyClientKey v3 = arg3.getClientKey();
        Preconditions.checkArgument(this.zaeg.containsKey(v3), "GoogleApiClient is not configured to use the API required for this call.");
        return this.zaeg.get(v3).equals(this.zaef);
    }

    static boolean zaa(zas arg0, boolean arg1) {
        arg0.zaem = arg1;
        return arg1;
    }

    @Nullable private final PendingIntent zaaa() {
        if(this.zaei == null) {
            return null;
        }

        return PendingIntent.getActivity(this.mContext, System.identityHashCode(this.zaed), this.zaei.getSignInIntent(), 0x8000000);
    }

    static void zab(zas arg0) {
        arg0.zax();
    }

    static ConnectionResult zab(zas arg0, ConnectionResult arg1) {
        arg0.zael = arg1;
        return arg1;
    }

    private static boolean zab(ConnectionResult arg0) {
        if(arg0 != null && (arg0.isSuccess())) {
            return 1;
        }

        return 0;
    }

    static boolean zac(zas arg0) {
        return arg0.zaem;
    }

    static ConnectionResult zad(zas arg0) {
        return arg0.zael;
    }

    static zabe zae(zas arg0) {
        return arg0.zaef;
    }

    static zabe zaf(zas arg0) {
        return arg0.zaee;
    }

    @GuardedBy(value="mLock") public final void zaw() {
        this.zaee.zaw();
        this.zaef.zaw();
    }

    @GuardedBy(value="mLock") private final void zax() {
        if(zas.zab(this.zaek)) {
            if(!zas.zab(this.zael)) {
                if(this.zaz()) {
                }
                else if(this.zael == null) {
                    return;
                }
                else if(this.zaeo == 1) {
                    this.zay();
                    return;
                }
                else {
                    this.zaa(this.zael);
                    this.zaee.disconnect();
                    return;
                }
            }

            switch(this.zaeo) {
                case 1: {
                    goto label_32;
                }
                case 2: {
                    goto label_29;
                }
            }

            Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            goto label_33;
        label_29:
            this.zaed.zab(this.zaej);
        label_32:
            this.zay();
        label_33:
            this.zaeo = 0;
            return;
        }
        else {
            if(this.zaek != null && (zas.zab(this.zael))) {
                this.zaef.disconnect();
                this.zaa(this.zaek);
                return;
            }

            if(this.zaek == null) {
                return;
            }

            if(this.zael == null) {
                return;
            }

            ConnectionResult v0 = this.zaek;
            if(this.zaef.zahr < this.zaee.zahr) {
                v0 = this.zael;
            }

            this.zaa(v0);
        }
    }

    @GuardedBy(value="mLock") private final void zay() {
        Iterator v0 = this.zaeh.iterator();
        while(v0.hasNext()) {
            v0.next().onComplete();
        }

        this.zaeh.clear();
    }

    @GuardedBy(value="mLock") private final boolean zaz() {
        if(this.zael != null && this.zael.getErrorCode() == 4) {
            return 1;
        }

        return 0;
    }
}

