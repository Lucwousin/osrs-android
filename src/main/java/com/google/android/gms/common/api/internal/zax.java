package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zax implements zabs {
    private final Looper zabj;
    private final GoogleApiManager zabm;
    private final Lock zaen;
    private final ClientSettings zaes;
    private final Map zaet;
    private final Map zaeu;
    private final Map zaev;
    private final zaaw zaew;
    private final GoogleApiAvailabilityLight zaex;
    private final Condition zaey;
    private final boolean zaez;
    private final boolean zafa;
    private final Queue zafb;
    @GuardedBy(value="mLock") private boolean zafc;
    @GuardedBy(value="mLock") private Map zafd;
    @GuardedBy(value="mLock") private Map zafe;
    @GuardedBy(value="mLock") private zaaa zaff;
    @GuardedBy(value="mLock") private ConnectionResult zafg;

    public zax(Context arg22, Lock arg23, Looper arg24, GoogleApiAvailabilityLight arg25, Map arg26, ClientSettings arg27, Map arg28, AbstractClientBuilder arg29, ArrayList arg30, zaaw arg31, boolean arg32) {
        int v20;
        int v18;
        int v19;
        Object v4;
        zax v0 = this;
        super();
        v0.zaet = new HashMap();
        v0.zaeu = new HashMap();
        v0.zafb = new LinkedList();
        v0.zaen = arg23;
        v0.zabj = arg24;
        v0.zaey = arg23.newCondition();
        v0.zaex = arg25;
        v0.zaew = arg31;
        v0.zaev = arg28;
        v0.zaes = arg27;
        v0.zaez = arg32;
        HashMap v11 = new HashMap();
        Iterator v1 = arg28.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            ((Map)v11).put(((Api)v2).getClientKey(), v2);
        }

        HashMap v12 = new HashMap();
        ArrayList v1_1 = arg30;
        int v2_1 = v1_1.size();
        int v3 = 0;
        while(v3 < v2_1) {
            v4 = v1_1.get(v3);
            ++v3;
            ((Map)v12).put(((zaq)v4).mApi, v4);
        }

        Iterator v14 = arg26.entrySet().iterator();
        boolean v15 = true;
        int v1_2 = 0;
        v2_1 = 1;
        v3 = 0;
        while(v14.hasNext()) {
            Object v16 = v14.next();
            v4 = ((Map)v11).get(((Map$Entry)v16).getKey());
            Object v17 = ((Map$Entry)v16).getValue();
            if(((Client)v17).requiresGooglePlayServices()) {
                if(!v0.zaev.get(v4).booleanValue()) {
                    v19 = v2_1;
                    v18 = 1;
                }
                else {
                    v19 = v2_1;
                    v18 = v3;
                }

                v20 = 1;
            }
            else {
                v20 = v1_2;
                v18 = v3;
                v19 = 0;
            }

            zaw v13 = new zaw(arg22, v4, arg24, v17, ((Map)v12).get(v4), arg27, arg29);
            v0.zaet.put(((Map$Entry)v16).getKey(), v13);
            if(((Client)v17).requiresSignIn()) {
                v0.zaeu.put(((Map$Entry)v16).getKey(), v13);
            }

            v3 = v18;
            v2_1 = v19;
            v1_2 = v20;
        }

        if(v1_2 == 0 || v2_1 != 0 || v3 != 0) {
            v15 = false;
        }
        else {
        }

        v0.zafa = v15;
        v0.zabm = GoogleApiManager.zabc();
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
                this.zaey.await();
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

        if(this.zafg != null) {
            return this.zafg;
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
                arg4 = this.zaey.awaitNanos(arg4);
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

        if(this.zafg != null) {
            return this.zafg;
        }

        return new ConnectionResult(13, v0);
    }

    public final void connect() {
        this.zaen.lock();
        try {
            if(!this.zafc) {
                goto label_8;
            }
        }
        catch(Throwable v0) {
            goto label_31;
        }

        this.zaen.unlock();
        return;
        try {
        label_8:
            this.zafc = true;
            this.zafd = null;
            this.zafe = null;
            this.zaff = null;
            this.zafg = null;
            this.zabm.zao();
            this.zabm.zaa(this.zaet.values()).addOnCompleteListener(new HandlerExecutor(this.zabj), new zaz(this, null));
        }
        catch(Throwable v0) {
        label_31:
            this.zaen.unlock();
            throw v0;
        }

        this.zaen.unlock();
    }

    public final void disconnect() {
        this.zaen.lock();
        try {
            this.zafc = false;
            Map v0_1 = null;
            this.zafd = v0_1;
            this.zafe = v0_1;
            if(this.zaff != null) {
                this.zaff.cancel();
                this.zaff = ((zaaa)v0_1);
            }

            this.zafg = ((ConnectionResult)v0_1);
            while(!this.zafb.isEmpty()) {
                Object v1 = this.zafb.remove();
                ((BasePendingResult)v1).zaa(((zacs)v0_1));
                ((PendingResult)v1).cancel();
            }

            this.zaey.signalAll();
        }
        catch(Throwable v0) {
            goto label_28;
        }

        this.zaen.unlock();
        return;
    label_28:
        this.zaen.unlock();
        throw v0;
    }

    public final void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4) {
    }

    public final ApiMethodImpl enqueue(@NonNull ApiMethodImpl arg3) {
        if((this.zaez) && (this.zab(arg3))) {
            return arg3;
        }

        if(!this.isConnected()) {
            this.zafb.add(arg3);
            return arg3;
        }

        this.zaew.zahe.zab(((BasePendingResult)arg3));
        return this.zaet.get(arg3.getClientKey()).doRead(arg3);
    }

    public final ApiMethodImpl execute(@NonNull ApiMethodImpl arg3) {
        AnyClientKey v0 = arg3.getClientKey();
        if((this.zaez) && (this.zab(arg3))) {
            return arg3;
        }

        this.zaew.zahe.zab(((BasePendingResult)arg3));
        return this.zaet.get(v0).doWrite(arg3);
    }

    @Nullable public final ConnectionResult getConnectionResult(@NonNull Api arg1) {
        return this.zaa(arg1.getClientKey());
    }

    public final boolean isConnected() {
        this.zaen.lock();
        try {
            if(this.zafd == null) {
                goto label_8;
            }
            else if(this.zafg != null) {
                goto label_8;
            }
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

        boolean v0_1 = true;
        goto label_9;
    label_8:
        v0_1 = false;
    label_9:
        this.zaen.unlock();
        return v0_1;
    }

    public final boolean isConnecting() {
        this.zaen.lock();
        try {
            if(this.zafd != null) {
                goto label_8;
            }
            else if(!this.zafc) {
                goto label_8;
            }
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

        boolean v0_1 = true;
        goto label_9;
    label_8:
        v0_1 = false;
    label_9:
        this.zaen.unlock();
        return v0_1;
    }

    public final boolean maybeSignIn(SignInConnectionListener arg3) {
        this.zaen.lock();
        try {
            if((this.zafc) && !this.zaac()) {
                this.zabm.zao();
                this.zaff = new zaaa(this, arg3);
                this.zabm.zaa(this.zaeu.values()).addOnCompleteListener(new HandlerExecutor(this.zabj), this.zaff);
                goto label_20;
            }

            goto label_24;
        }
        catch(Throwable v3) {
            this.zaen.unlock();
            throw v3;
        }

    label_20:
        this.zaen.unlock();
        return 1;
    label_24:
        this.zaen.unlock();
        return 0;
    }

    public final void maybeSignOut() {
        this.zaen.lock();
        try {
            this.zabm.maybeSignOut();
            if(this.zaff != null) {
                this.zaff.cancel();
                this.zaff = null;
            }

            if(this.zafe == null) {
                this.zafe = new ArrayMap(this.zaeu.size());
            }

            ConnectionResult v0_1 = new ConnectionResult(4);
            Iterator v1 = this.zaeu.values().iterator();
            while(v1.hasNext()) {
                this.zafe.put(v1.next().zak(), v0_1);
            }

            if(this.zafd != null) {
                this.zafd.putAll(this.zafe);
            }
        }
        catch(Throwable v0) {
            goto label_40;
        }

        this.zaen.unlock();
        return;
    label_40:
        this.zaen.unlock();
        throw v0;
    }

    static Lock zaa(zax arg0) {
        return arg0.zaen;
    }

    static boolean zaa(zax arg0, zaw arg1, ConnectionResult arg2) {
        return arg0.zaa(arg1, arg2);
    }

    @Nullable private final ConnectionResult zaa(@NonNull AnyClientKey arg2) {
        Lock v0;
        Object v2_1;
        this.zaen.lock();
        try {
            v2_1 = this.zaet.get(arg2);
            if(this.zafd != null && v2_1 != null) {
                v2_1 = this.zafd.get(((GoogleApi)v2_1).zak());
                v0 = this.zaen;
                goto label_11;
            }

            goto label_13;
        }
        catch(Throwable v2) {
            this.zaen.unlock();
            throw v2;
        }

    label_11:
        v0.unlock();
        return ((ConnectionResult)v2_1);
    label_13:
        this.zaen.unlock();
        return null;
    }

    static ConnectionResult zaa(zax arg0, ConnectionResult arg1) {
        arg0.zafg = arg1;
        return arg1;
    }

    static Map zaa(zax arg0, Map arg1) {
        arg0.zafd = arg1;
        return arg1;
    }

    private final boolean zaa(zaw arg3, ConnectionResult arg4) {
        if(!arg4.isSuccess() && !arg4.hasResolution() && (this.zaev.get(((GoogleApi)arg3).getApi()).booleanValue()) && (arg3.zaab().requiresGooglePlayServices()) && (this.zaex.isUserResolvableError(arg4.getErrorCode()))) {
            return 1;
        }

        return 0;
    }

    static boolean zaa(zax arg0, boolean arg1) {
        arg0.zafc = false;
        return 0;
    }

    private final boolean zaac() {
        this.zaen.lock();
        try {
            if(this.zafc) {
                if(!this.zaez) {
                }
                else {
                    Iterator v0_1 = this.zaeu.keySet().iterator();
                    do {
                        if(v0_1.hasNext()) {
                            ConnectionResult v2 = this.zaa(v0_1.next());
                            if(v2 != null && (v2.isSuccess())) {
                                continue;
                            }

                            goto label_18;
                        }
                        else {
                            goto label_21;
                        }
                    }
                    while(true);
                }
            }

            goto label_25;
        }
        catch(Throwable v0) {
            goto label_30;
        }

    label_18:
        this.zaen.unlock();
        return 0;
    label_21:
        this.zaen.unlock();
        return 1;
    label_30:
        this.zaen.unlock();
        throw v0;
    label_25:
        this.zaen.unlock();
        return 0;
    }

    @GuardedBy(value="mLock") private final void zaad() {
        if(this.zaes == null) {
            this.zaew.zagz = Collections.emptySet();
            return;
        }

        HashSet v0 = new HashSet(this.zaes.getRequiredScopes());
        Map v1 = this.zaes.getOptionalApiSettings();
        Iterator v2 = v1.keySet().iterator();
        while(v2.hasNext()) {
            Object v3 = v2.next();
            ConnectionResult v4 = this.getConnectionResult(((Api)v3));
            if(v4 == null) {
                continue;
            }

            if(!v4.isSuccess()) {
                continue;
            }

            ((Set)v0).addAll(v1.get(v3).mScopes);
        }

        this.zaew.zagz = ((Set)v0);
    }

    @GuardedBy(value="mLock") private final void zaae() {
        while(!this.zafb.isEmpty()) {
            this.execute(this.zafb.remove());
        }

        this.zaew.zab(null);
    }

    @Nullable @GuardedBy(value="mLock") private final ConnectionResult zaaf() {
        int v6_1;
        Iterator v0 = this.zaet.values().iterator();
        Object v2 = null;
        Object v1 = v2;
        int v3 = 0;
        int v4 = 0;
        while(v0.hasNext()) {
            Object v5 = v0.next();
            Api v6 = ((GoogleApi)v5).getApi();
            v5 = this.zafd.get(((GoogleApi)v5).zak());
            if(((ConnectionResult)v5).isSuccess()) {
                continue;
            }

            if((this.zaev.get(v6).booleanValue()) && !((ConnectionResult)v5).hasResolution() && !this.zaex.isUserResolvableError(((ConnectionResult)v5).getErrorCode())) {
                continue;
            }

            if(((ConnectionResult)v5).getErrorCode() == 4 && (this.zaez)) {
                v6_1 = v6.zah().getPriority();
                if(v1 != null && v4 <= v6_1) {
                    continue;
                }

                v1 = v5;
                v4 = v6_1;
                continue;
            }

            v6_1 = v6.zah().getPriority();
            if(v2 != null && v3 <= v6_1) {
                continue;
            }

            v2 = v5;
            v3 = v6_1;
        }

        if(v2 != null && v1 != null && v3 > v4) {
            return ((ConnectionResult)v1);
        }

        return ((ConnectionResult)v2);
    }

    static boolean zab(zax arg0) {
        return arg0.zafc;
    }

    static Map zab(zax arg0, Map arg1) {
        arg0.zafe = arg1;
        return arg1;
    }

    private final boolean zab(@NonNull ApiMethodImpl arg7) {
        AnyClientKey v0 = arg7.getClientKey();
        ConnectionResult v1 = this.zaa(v0);
        if(v1 != null) {
            int v2 = 4;
            if(v1.getErrorCode() == v2) {
                arg7.setFailedResult(new Status(v2, null, this.zabm.zaa(this.zaet.get(v0).zak(), System.identityHashCode(this.zaew))));
                return 1;
            }
        }

        return 0;
    }

    static Map zac(zax arg0) {
        return arg0.zaet;
    }

    static Map zad(zax arg0) {
        return arg0.zafd;
    }

    static boolean zae(zax arg0) {
        return arg0.zafa;
    }

    static ConnectionResult zaf(zax arg0) {
        return arg0.zaaf();
    }

    static Map zag(zax arg0) {
        return arg0.zafe;
    }

    static ConnectionResult zah(zax arg0) {
        return arg0.zafg;
    }

    static void zai(zax arg0) {
        arg0.zaad();
    }

    static void zaj(zax arg0) {
        arg0.zaae();
    }

    static zaaw zak(zax arg0) {
        return arg0.zaew;
    }

    static Condition zal(zax arg0) {
        return arg0.zaey;
    }

    static Map zam(zax arg0) {
        return arg0.zaeu;
    }

    public final void zaw() {
    }
}

