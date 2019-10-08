package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zal;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk public class GoogleApiManager implements Handler$Callback {
    public final class zaa implements ConnectionCallbacks, OnConnectionFailedListener, zar {
        private final zai zafp;
        private final Queue zaim;
        private final Client zain;
        private final AnyClient zaio;
        private final zaab zaip;
        private final Set zaiq;
        private final Map zair;
        private final int zais;
        private final zace zait;
        private boolean zaiu;
        private final List zaiv;
        private ConnectionResult zaiw;

        @WorkerThread public zaa(GoogleApiManager arg3, GoogleApi arg4) {
            this.zail = arg3;
            super();
            this.zaim = new LinkedList();
            this.zaiq = new HashSet();
            this.zair = new HashMap();
            this.zaiv = new ArrayList();
            ConnectionResult v0 = null;
            this.zaiw = v0;
            this.zain = arg4.zaa(GoogleApiManager.zaa(arg3).getLooper(), this);
            this.zaio = (this.zain instanceof SimpleClientAdapter) ? this.zain.getClient() : this.zain;
            this.zafp = arg4.zak();
            this.zaip = new zaab();
            this.zais = arg4.getInstanceId();
            if(this.zain.requiresSignIn()) {
                this.zait = arg4.zaa(GoogleApiManager.zab(arg3), GoogleApiManager.zaa(arg3));
                return;
            }

            this.zait = ((zace)v0);
        }

        @WorkerThread public final void connect() {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            if(!this.zain.isConnected()) {
                if(this.zain.isConnecting()) {
                }
                else {
                    int v0 = GoogleApiManager.zae(this.zail).getClientAvailability(GoogleApiManager.zab(this.zail), this.zain);
                    if(v0 != 0) {
                        this.onConnectionFailed(new ConnectionResult(v0, null));
                        return;
                    }
                    else {
                        zac v0_1 = new zac(this.zail, this.zain, this.zafp);
                        if(this.zain.requiresSignIn()) {
                            this.zait.zaa(((zach)v0_1));
                        }

                        this.zain.connect(((ConnectionProgressReportCallbacks)v0_1));
                        return;
                    }
                }
            }
        }

        public final int getInstanceId() {
            return this.zais;
        }

        final boolean isConnected() {
            return this.zain.isConnected();
        }

        public final void onConnected(@Nullable Bundle arg2) {
            if(Looper.myLooper() == GoogleApiManager.zaa(this.zail).getLooper()) {
                this.zabg();
                return;
            }

            GoogleApiManager.zaa(this.zail).post(new zabj(this));
        }

        @WorkerThread public final void onConnectionFailed(@NonNull ConnectionResult arg5) {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            if(this.zait != null) {
                this.zait.zabs();
            }

            this.zabl();
            GoogleApiManager.zae(this.zail).flush();
            this.zai(arg5);
            if(arg5.getErrorCode() == 4) {
                this.zac(GoogleApiManager.zabf());
                return;
            }

            if(this.zaim.isEmpty()) {
                this.zaiw = arg5;
                return;
            }

            if(this.zah(arg5)) {
                return;
            }

            if(!this.zail.zac(arg5, this.zais)) {
                if(arg5.getErrorCode() == 18) {
                    this.zaiu = true;
                }

                if(this.zaiu) {
                    GoogleApiManager.zaa(this.zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(this.zail), 9, this.zafp), GoogleApiManager.zac(this.zail));
                    return;
                }

                String v1 = this.zafp.zan();
                StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 38);
                v3.append("API: ");
                v3.append(v1);
                v3.append(" is not available on this device.");
                this.zac(new Status(17, v3.toString()));
            }
        }

        public final void onConnectionSuspended(int arg2) {
            if(Looper.myLooper() == GoogleApiManager.zaa(this.zail).getLooper()) {
                this.zabh();
                return;
            }

            GoogleApiManager.zaa(this.zail).post(new zabk(this));
        }

        public final boolean requiresSignIn() {
            return this.zain.requiresSignIn();
        }

        @WorkerThread public final void resume() {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            if(this.zaiu) {
                this.connect();
            }
        }

        @WorkerThread public final void zaa(zab arg2) {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            if(this.zain.isConnected()) {
                if(this.zab(arg2)) {
                    this.zabo();
                    return;
                }

                this.zaim.add(arg2);
                return;
            }

            this.zaim.add(arg2);
            if(this.zaiw != null && (this.zaiw.hasResolution())) {
                this.onConnectionFailed(this.zaiw);
                return;
            }

            this.connect();
        }

        static boolean zaa(zaa arg0, boolean arg1) {
            return arg0.zac(false);
        }

        @WorkerThread public final void zaa(zak arg2) {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            this.zaiq.add(arg2);
        }

        static void zaa(zaa arg0, com.google.android.gms.common.api.internal.GoogleApiManager$zab arg1) {
            arg0.zaa(arg1);
        }

        @Nullable @WorkerThread private final Feature zaa(@Nullable Feature[] arg11) {
            Feature v4_1;
            Feature v0 = null;
            if(arg11 != null) {
                if(arg11.length == 0) {
                }
                else {
                    Feature[] v1 = this.zain.getAvailableFeatures();
                    int v2 = 0;
                    if(v1 == null) {
                        v1 = new Feature[0];
                    }

                    ArrayMap v3 = new ArrayMap(v1.length);
                    int v4 = v1.length;
                    int v5;
                    for(v5 = 0; v5 < v4; ++v5) {
                        ((Map)v3).put(v1[v5].getName(), Long.valueOf(v1[v5].getVersion()));
                    }

                    int v1_1 = arg11.length;
                    while(true) {
                        if(v2 >= v1_1) {
                            return v0;
                        }

                        v4_1 = arg11[v2];
                        if(((Map)v3).containsKey(v4_1.getName())) {
                            if(((Map)v3).get(v4_1.getName()).longValue() < v4_1.getVersion()) {
                            }
                            else {
                                ++v2;
                                continue;
                            }
                        }

                        return v4_1;
                    }

                    return v4_1;
                }
            }

            return v0;
        }

        @WorkerThread private final void zaa(com.google.android.gms.common.api.internal.GoogleApiManager$zab arg2) {
            if(!this.zaiv.contains(arg2)) {
                return;
            }

            if(!this.zaiu) {
                if(!this.zain.isConnected()) {
                    this.connect();
                    return;
                }
                else {
                    this.zabi();
                }
            }
        }

        public final void zaa(ConnectionResult arg1, Api arg2, boolean arg3) {
            if(Looper.myLooper() == GoogleApiManager.zaa(this.zail).getLooper()) {
                this.onConnectionFailed(arg1);
                return;
            }

            GoogleApiManager.zaa(this.zail).post(new zabl(this, arg1));
        }

        public final Client zaab() {
            return this.zain;
        }

        @WorkerThread public final void zaav() {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            if(this.zaiu) {
                this.zabn();
                int v2 = 8;
                Status v0 = GoogleApiManager.zah(this.zail).isGooglePlayServicesAvailable(GoogleApiManager.zab(this.zail)) == 18 ? new Status(v2, "Connection timed out while waiting for Google Play services update to complete.") : new Status(v2, "API failed to connect while resuming due to an unknown error.");
                this.zac(v0);
                this.zain.disconnect();
            }
        }

        static void zab(zaa arg0, com.google.android.gms.common.api.internal.GoogleApiManager$zab arg1) {
            arg0.zab(arg1);
        }

        @WorkerThread private final void zab(com.google.android.gms.common.api.internal.GoogleApiManager$zab arg6) {
            if(this.zaiv.remove(arg6)) {
                GoogleApiManager.zaa(this.zail).removeMessages(15, arg6);
                GoogleApiManager.zaa(this.zail).removeMessages(16, arg6);
                Feature v6 = com.google.android.gms.common.api.internal.GoogleApiManager$zab.zad(arg6);
                ArrayList v0 = new ArrayList(this.zaim.size());
                Iterator v1 = this.zaim.iterator();
                while(v1.hasNext()) {
                    Object v2 = v1.next();
                    if(!(v2 instanceof com.google.android.gms.common.api.internal.zac)) {
                        continue;
                    }

                    Feature[] v3 = v2.zab(this);
                    if(v3 == null) {
                        continue;
                    }

                    if(!ArrayUtils.contains(((Object[])v3), v6)) {
                        continue;
                    }

                    v0.add(v2);
                }

                int v1_1 = v0.size();
                int v2_1 = 0;
                while(v2_1 < v1_1) {
                    Object v3_1 = v0.get(v2_1);
                    ++v2_1;
                    this.zaim.remove(v3_1);
                    ((zab)v3_1).zaa(new UnsupportedApiCallException(v6));
                }
            }
        }

        @WorkerThread private final boolean zab(zab arg6) {
            if(!(arg6 instanceof com.google.android.gms.common.api.internal.zac)) {
                this.zac(arg6);
                return 1;
            }

            zab v0 = arg6;
            Feature v2 = this.zaa(((com.google.android.gms.common.api.internal.zac)v0).zab(this));
            if(v2 == null) {
                this.zac(arg6);
                return 1;
            }

            if(((com.google.android.gms.common.api.internal.zac)v0).zac(this)) {
                zabi v1 = null;
                com.google.android.gms.common.api.internal.GoogleApiManager$zab v6 = new com.google.android.gms.common.api.internal.GoogleApiManager$zab(this.zafp, v2, v1);
                int v0_1 = this.zaiv.indexOf(v6);
                int v2_1 = 15;
                if(v0_1 >= 0) {
                    Object v6_1 = this.zaiv.get(v0_1);
                    GoogleApiManager.zaa(this.zail).removeMessages(v2_1, v6_1);
                    GoogleApiManager.zaa(this.zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(this.zail), v2_1, v6_1), GoogleApiManager.zac(this.zail));
                }
                else {
                    this.zaiv.add(v6);
                    GoogleApiManager.zaa(this.zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(this.zail), v2_1, v6), GoogleApiManager.zac(this.zail));
                    GoogleApiManager.zaa(this.zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(this.zail), 16, v6), GoogleApiManager.zad(this.zail));
                    ConnectionResult v6_2 = new ConnectionResult(2, ((PendingIntent)v1));
                    if(!this.zah(v6_2)) {
                        this.zail.zac(v6_2, this.zais);
                    }
                }
            }
            else {
                v0.zaa(new UnsupportedApiCallException(v2));
            }

            return 0;
        }

        @WorkerThread private final void zabg() {
            this.zabl();
            this.zai(ConnectionResult.RESULT_SUCCESS);
            this.zabn();
            Iterator v0 = this.zair.values().iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                if(this.zaa(((zabw)v1).zajw.getRequiredFeatures()) != null) {
                    v0.remove();
                    continue;
                }

                try {
                    ((zabw)v1).zajw.registerListener(this.zaio, new TaskCompletionSource());
                    continue;
                }
                catch(RemoteException ) {
                    v0.remove();
                    continue;
                }
                catch(DeadObjectException ) {
                    this.onConnectionSuspended(1);
                    this.zain.disconnect();
                    break;
                }
            }

            this.zabi();
            this.zabo();
        }

        @WorkerThread private final void zabh() {
            this.zabl();
            this.zaiu = true;
            this.zaip.zaai();
            GoogleApiManager.zaa(this.zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(this.zail), 9, this.zafp), GoogleApiManager.zac(this.zail));
            GoogleApiManager.zaa(this.zail).sendMessageDelayed(Message.obtain(GoogleApiManager.zaa(this.zail), 11, this.zafp), GoogleApiManager.zad(this.zail));
            GoogleApiManager.zae(this.zail).flush();
        }

        @WorkerThread private final void zabi() {
            ArrayList v0 = new ArrayList(this.zaim);
            int v1 = v0.size();
            int v2 = 0;
            while(v2 < v1) {
                Object v3 = v0.get(v2);
                ++v2;
                if(!this.zain.isConnected()) {
                    return;
                }

                if(!this.zab(((zab)v3))) {
                    continue;
                }

                this.zaim.remove(v3);
            }
        }

        @WorkerThread public final void zabj() {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            this.zac(GoogleApiManager.zahw);
            this.zaip.zaah();
            Object[] v0 = this.zair.keySet().toArray(new ListenerKey[this.zair.size()]);
            int v1 = v0.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                this.zaa(new zah(v0[v2], new TaskCompletionSource()));
            }

            this.zai(new ConnectionResult(4));
            if(this.zain.isConnected()) {
                this.zain.onUserSignOut(new zabm(this));
            }
        }

        public final Map zabk() {
            return this.zair;
        }

        @WorkerThread public final void zabl() {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            this.zaiw = null;
        }

        @WorkerThread public final ConnectionResult zabm() {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            return this.zaiw;
        }

        @WorkerThread private final void zabn() {
            if(this.zaiu) {
                GoogleApiManager.zaa(this.zail).removeMessages(11, this.zafp);
                GoogleApiManager.zaa(this.zail).removeMessages(9, this.zafp);
                this.zaiu = false;
            }
        }

        private final void zabo() {
            GoogleApiManager.zaa(this.zail).removeMessages(12, this.zafp);
            GoogleApiManager.zaa(this.zail).sendMessageDelayed(GoogleApiManager.zaa(this.zail).obtainMessage(12, this.zafp), GoogleApiManager.zai(this.zail));
        }

        @WorkerThread public final boolean zabp() {
            return this.zac(true);
        }

        final zad zabq() {
            if(this.zait == null) {
                return null;
            }

            return this.zait.zabq();
        }

        @WorkerThread public final void zac(Status arg3) {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            Iterator v0 = this.zaim.iterator();
            while(v0.hasNext()) {
                v0.next().zaa(arg3);
            }

            this.zaim.clear();
        }

        @WorkerThread private final boolean zac(boolean arg3) {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            if((this.zain.isConnected()) && this.zair.size() == 0) {
                if(this.zaip.zaag()) {
                    if(arg3) {
                        this.zabo();
                    }

                    return 0;
                }
                else {
                    this.zain.disconnect();
                    return 1;
                }
            }

            return 0;
        }

        @WorkerThread private final void zac(zab arg3) {
            arg3.zaa(this.zaip, this.requiresSignIn());
            try {
                arg3.zaa(this);
                return;
            }
            catch(DeadObjectException ) {
                this.onConnectionSuspended(1);
                this.zain.disconnect();
                return;
            }
        }

        static void zae(zaa arg0) {
            arg0.zabg();
        }

        static void zaf(zaa arg0) {
            arg0.zabh();
        }

        @WorkerThread public final void zag(@NonNull ConnectionResult arg2) {
            Preconditions.checkHandlerThread(GoogleApiManager.zaa(this.zail));
            this.zain.disconnect();
            this.onConnectionFailed(arg2);
        }

        static Client zag(zaa arg0) {
            return arg0.zain;
        }

        @WorkerThread private final boolean zah(@NonNull ConnectionResult arg4) {
            Object v0 = GoogleApiManager.zabe();
            __monitor_enter(v0);
            try {
                if(GoogleApiManager.zaf(this.zail) != null && (GoogleApiManager.zag(this.zail).contains(this.zafp))) {
                    GoogleApiManager.zaf(this.zail).zab(arg4, this.zais);
                    __monitor_exit(v0);
                    return 1;
                }

                __monitor_exit(v0);
                return 0;
            label_21:
                __monitor_exit(v0);
            }
            catch(Throwable v4) {
                goto label_21;
            }

            throw v4;
        }

        @WorkerThread private final void zai(ConnectionResult arg5) {
            Iterator v0 = this.zaiq.iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                String v2 = null;
                if(Objects.equal(arg5, ConnectionResult.RESULT_SUCCESS)) {
                    v2 = this.zain.getEndpointPackageName();
                }

                ((zak)v1).zaa(this.zafp, arg5, v2);
            }

            this.zaiq.clear();
        }
    }

    final class com.google.android.gms.common.api.internal.GoogleApiManager$zab {
        private final zai zaja;
        private final Feature zajb;

        private com.google.android.gms.common.api.internal.GoogleApiManager$zab(zai arg1, Feature arg2) {
            super();
            this.zaja = arg1;
            this.zajb = arg2;
        }

        com.google.android.gms.common.api.internal.GoogleApiManager$zab(zai arg1, Feature arg2, zabi arg3) {
            this(arg1, arg2);
        }

        public final boolean equals(Object arg4) {
            if(arg4 != null && ((arg4 instanceof com.google.android.gms.common.api.internal.GoogleApiManager$zab))) {
                if((Objects.equal(this.zaja, ((com.google.android.gms.common.api.internal.GoogleApiManager$zab)arg4).zaja)) && (Objects.equal(this.zajb, ((com.google.android.gms.common.api.internal.GoogleApiManager$zab)arg4).zajb))) {
                    return 1;
                }

                return 0;
            }

            return 0;
        }

        public final int hashCode() {
            return Objects.hashCode(new Object[]{this.zaja, this.zajb});
        }

        public final String toString() {
            return Objects.toStringHelper(this).add("key", this.zaja).add("feature", this.zajb).toString();
        }

        static zai zac(com.google.android.gms.common.api.internal.GoogleApiManager$zab arg0) {
            return arg0.zaja;
        }

        static Feature zad(com.google.android.gms.common.api.internal.GoogleApiManager$zab arg0) {
            return arg0.zajb;
        }
    }

    final class zac implements zach, ConnectionProgressReportCallbacks {
        private final zai zafp;
        private final Client zain;
        private IAccountAccessor zajc;
        private Set zajd;
        private boolean zaje;

        public zac(GoogleApiManager arg1, Client arg2, zai arg3) {
            this.zail = arg1;
            super();
            this.zajc = null;
            this.zajd = null;
            this.zaje = false;
            this.zain = arg2;
            this.zafp = arg3;
        }

        public final void onReportServiceBinding(@NonNull ConnectionResult arg3) {
            GoogleApiManager.zaa(this.zail).post(new zabo(this, arg3));
        }

        static Client zaa(zac arg0) {
            return arg0.zain;
        }

        static boolean zaa(zac arg0, boolean arg1) {
            arg0.zaje = true;
            return 1;
        }

        @WorkerThread public final void zaa(IAccountAccessor arg2, Set arg3) {
            if(arg2 != null) {
                if(arg3 == null) {
                }
                else {
                    this.zajc = arg2;
                    this.zajd = arg3;
                    this.zabr();
                    return;
                }
            }

            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            this.zag(new ConnectionResult(4));
        }

        static void zab(zac arg0) {
            arg0.zabr();
        }

        @WorkerThread private final void zabr() {
            if((this.zaje) && this.zajc != null) {
                this.zain.getRemoteService(this.zajc, this.zajd);
            }
        }

        static zai zac(zac arg0) {
            return arg0.zafp;
        }

        @WorkerThread public final void zag(ConnectionResult arg3) {
            GoogleApiManager.zaj(this.zail).get(this.zafp).zag(arg3);
        }
    }

    private final Handler handler;
    private static final Object lock;
    public static final Status zahw;
    private static final Status zahx;
    private long zahy;
    private long zahz;
    private long zaia;
    @GuardedBy(value="lock") private static GoogleApiManager zaib;
    private final Context zaic;
    private final GoogleApiAvailability zaid;
    private final GoogleApiAvailabilityCache zaie;
    private final AtomicInteger zaif;
    private final AtomicInteger zaig;
    private final Map zaih;
    @GuardedBy(value="lock") private zaae zaii;
    @GuardedBy(value="lock") private final Set zaij;
    private final Set zaik;

    static {
        GoogleApiManager.zahw = new Status(4, "Sign-out occurred while this API call was in progress.");
        GoogleApiManager.zahx = new Status(4, "The user must be signed in to make this API call.");
        GoogleApiManager.lock = new Object();
    }

    @KeepForSdk private GoogleApiManager(Context arg5, Looper arg6, GoogleApiAvailability arg7) {
        super();
        this.zahy = 5000;
        this.zahz = 120000;
        this.zaia = 10000;
        this.zaif = new AtomicInteger(1);
        this.zaig = new AtomicInteger(0);
        this.zaih = new ConcurrentHashMap(5, 0.75f, 1);
        this.zaii = null;
        this.zaij = new ArraySet();
        this.zaik = new ArraySet();
        this.zaic = arg5;
        this.handler = new zal(arg6, ((Handler$Callback)this));
        this.zaid = arg7;
        this.zaie = new GoogleApiAvailabilityCache(((GoogleApiAvailabilityLight)arg7));
        this.handler.sendMessage(this.handler.obtainMessage(6));
    }

    @WorkerThread public boolean handleMessage(Message arg8) {
        Object v3;
        Object v0_1;
        Object v8_2;
        Iterator v8_1;
        int v0;
        long v2 = 300000;
        String v4 = null;
        switch(arg8.what) {
            case 1: {
                if(arg8.obj.booleanValue()) {
                    v2 = 10000;
                }

                this.zaia = v2;
                v0 = 12;
                this.handler.removeMessages(v0);
                v8_1 = this.zaih.keySet().iterator();
                while(v8_1.hasNext()) {
                    this.handler.sendMessageDelayed(this.handler.obtainMessage(v0, v8_1.next()), this.zaia);
                }
            }
            case 2: {
                v8_2 = arg8.obj;
                Iterator v0_3 = ((zak)v8_2).zap().iterator();
                while(v0_3.hasNext()) {
                    Object v2_2 = v0_3.next();
                    v3 = this.zaih.get(v2_2);
                    if(v3 == null) {
                        ((zak)v8_2).zaa(((zai)v2_2), new ConnectionResult(13), v4);
                        return 1;
                    }

                    if(((zaa)v3).isConnected()) {
                        ((zak)v8_2).zaa(((zai)v2_2), ConnectionResult.RESULT_SUCCESS, ((zaa)v3).zaab().getEndpointPackageName());
                        continue;
                    }

                    if(((zaa)v3).zabm() != null) {
                        ((zak)v8_2).zaa(((zai)v2_2), ((zaa)v3).zabm(), v4);
                        continue;
                    }

                    ((zaa)v3).zaa(((zak)v8_2));
                    ((zaa)v3).connect();
                }
            }
            case 3: {
                v8_1 = this.zaih.values().iterator();
                while(v8_1.hasNext()) {
                    v0_1 = v8_1.next();
                    ((zaa)v0_1).zabl();
                    ((zaa)v0_1).connect();
                }
            }
            case 5: {
                v0 = arg8.arg1;
                v8_2 = arg8.obj;
                Iterator v2_3 = this.zaih.values().iterator();
                do {
                    if(v2_3.hasNext()) {
                        v3 = v2_3.next();
                        if(((zaa)v3).getInstanceId() != v0) {
                            continue;
                        }

                        break;
                    }
                    else {
                        goto label_124;
                    }
                }
                while(true);

                goto label_125;
            label_124:
                v3 = v4;
            label_125:
                if(v3 != null) {
                    v4 = this.zaid.getErrorString(((ConnectionResult)v8_2).getErrorCode());
                    String v8_3 = ((ConnectionResult)v8_2).getErrorMessage();
                    StringBuilder v6 = new StringBuilder(String.valueOf(v4).length() + 69 + String.valueOf(v8_3).length());
                    v6.append("Error resolution was canceled by the user, original error message: ");
                    v6.append(v4);
                    v6.append(": ");
                    v6.append(v8_3);
                    ((zaa)v3).zac(new Status(17, v6.toString()));
                    return 1;
                }

                StringBuilder v3_1 = new StringBuilder(76);
                v3_1.append("Could not find API instance ");
                v3_1.append(v0);
                v3_1.append(" while trying to fail enqueued calls.");
                Log.wtf("GoogleApiManager", v3_1.toString(), new Exception());
                break;
            }
            case 6: {
                if(!PlatformVersion.isAtLeastIceCreamSandwich()) {
                    return 1;
                }

                if(!(this.zaic.getApplicationContext() instanceof Application)) {
                    return 1;
                }

                BackgroundDetector.initialize(this.zaic.getApplicationContext());
                BackgroundDetector.getInstance().addListener(new zabi(this));
                if(BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                    return 1;
                }

                this.zaia = v2;
                break;
            }
            case 7: {
                this.zab(arg8.obj);
                break;
            }
            case 9: {
                if(!this.zaih.containsKey(arg8.obj)) {
                    return 1;
                }

                this.zaih.get(arg8.obj).resume();
                break;
            }
            case 10: {
                v8_1 = this.zaik.iterator();
                while(v8_1.hasNext()) {
                    this.zaih.remove(v8_1.next()).zabj();
                }

                this.zaik.clear();
                break;
            }
            case 11: {
                if(!this.zaih.containsKey(arg8.obj)) {
                    return 1;
                }

                this.zaih.get(arg8.obj).zaav();
                break;
            }
            case 12: {
                if(!this.zaih.containsKey(arg8.obj)) {
                    return 1;
                }

                this.zaih.get(arg8.obj).zabp();
                break;
            }
            case 4: 
            case 8: 
            case 13: {
                v8_2 = arg8.obj;
                v0_1 = this.zaih.get(((zabv)v8_2).zajs.zak());
                if(v0_1 == null) {
                    this.zab(((zabv)v8_2).zajs);
                    v0_1 = this.zaih.get(((zabv)v8_2).zajs.zak());
                }

                if((((zaa)v0_1).requiresSignIn()) && this.zaig.get() != ((zabv)v8_2).zajr) {
                    ((zabv)v8_2).zajq.zaa(GoogleApiManager.zahw);
                    ((zaa)v0_1).zabj();
                    return 1;
                }

                ((zaa)v0_1).zaa(((zabv)v8_2).zajq);
                break;
            }
            case 14: {
                v8_2 = arg8.obj;
                zai v0_2 = ((zaaf)v8_2).zak();
                if(!this.zaih.containsKey(v0_2)) {
                    ((zaaf)v8_2).zaal().setResult(Boolean.valueOf(false));
                    return 1;
                }

                ((zaaf)v8_2).zaal().setResult(Boolean.valueOf(zaa.zaa(this.zaih.get(v0_2), false)));
                break;
            }
            case 15: {
                v8_2 = arg8.obj;
                if(!this.zaih.containsKey(com.google.android.gms.common.api.internal.GoogleApiManager$zab.zac(((com.google.android.gms.common.api.internal.GoogleApiManager$zab)v8_2)))) {
                    return 1;
                }

                zaa.zaa(this.zaih.get(com.google.android.gms.common.api.internal.GoogleApiManager$zab.zac(((com.google.android.gms.common.api.internal.GoogleApiManager$zab)v8_2))), ((com.google.android.gms.common.api.internal.GoogleApiManager$zab)v8_2));
                break;
            }
            case 16: {
                v8_2 = arg8.obj;
                if(!this.zaih.containsKey(com.google.android.gms.common.api.internal.GoogleApiManager$zab.zac(((com.google.android.gms.common.api.internal.GoogleApiManager$zab)v8_2)))) {
                    return 1;
                }

                zaa.zab(this.zaih.get(com.google.android.gms.common.api.internal.GoogleApiManager$zab.zac(((com.google.android.gms.common.api.internal.GoogleApiManager$zab)v8_2))), ((com.google.android.gms.common.api.internal.GoogleApiManager$zab)v8_2));
                break;
            }
            default: {
                int v8 = arg8.what;
                StringBuilder v2_1 = new StringBuilder(0x1F);
                v2_1.append("Unknown message id: ");
                v2_1.append(v8);
                Log.w("GoogleApiManager", v2_1.toString());
                return 0;
            }
        }

        return 1;
    }

    final void maybeSignOut() {
        this.zaig.incrementAndGet();
        this.handler.sendMessage(this.handler.obtainMessage(10));
    }

    @KeepForSdk public static void reportSignOut() {
        Object v0 = GoogleApiManager.lock;
        __monitor_enter(v0);
        try {
            if(GoogleApiManager.zaib != null) {
                GoogleApiManager v1_1 = GoogleApiManager.zaib;
                v1_1.zaig.incrementAndGet();
                v1_1.handler.sendMessageAtFrontOfQueue(v1_1.handler.obtainMessage(10));
            }

            __monitor_exit(v0);
            return;
        label_15:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_15;
        }

        throw v1;
    }

    public final void zaa(GoogleApi arg4) {
        this.handler.sendMessage(this.handler.obtainMessage(7, arg4));
    }

    public final void zaa(GoogleApi arg4, int arg5, ApiMethodImpl arg6) {
        this.handler.sendMessage(this.handler.obtainMessage(4, new zabv(new zae(arg5, arg6), this.zaig.get(), arg4)));
    }

    public final void zaa(GoogleApi arg2, int arg3, TaskApiCall arg4, TaskCompletionSource arg5, StatusExceptionMapper arg6) {
        this.handler.sendMessage(this.handler.obtainMessage(4, new zabv(new zag(arg3, arg4, arg5, arg6), this.zaig.get(), arg2)));
    }

    public final Task zaa(@NonNull GoogleApi arg5, @NonNull RegisterListenerMethod arg6, @NonNull UnregisterListenerMethod arg7) {
        TaskCompletionSource v0 = new TaskCompletionSource();
        this.handler.sendMessage(this.handler.obtainMessage(8, new zabv(new zaf(new zabw(arg6, arg7), v0), this.zaig.get(), arg5)));
        return v0.getTask();
    }

    public final Task zaa(@NonNull GoogleApi arg6, @NonNull ListenerKey arg7) {
        TaskCompletionSource v0 = new TaskCompletionSource();
        this.handler.sendMessage(this.handler.obtainMessage(13, new zabv(new zah(arg7, v0), this.zaig.get(), arg6)));
        return v0.getTask();
    }

    public final void zaa(ConnectionResult arg5, int arg6) {
        if(!this.zac(arg5, arg6)) {
            this.handler.sendMessage(this.handler.obtainMessage(5, arg6, 0, arg5));
        }
    }

    static Handler zaa(GoogleApiManager arg0) {
        return arg0.handler;
    }

    final PendingIntent zaa(zai arg3, int arg4) {
        Object v3 = this.zaih.get(arg3);
        PendingIntent v0 = null;
        if(v3 == null) {
            return v0;
        }

        zad v3_1 = ((zaa)v3).zabq();
        if(v3_1 == null) {
            return v0;
        }

        return PendingIntent.getActivity(this.zaic, arg4, v3_1.getSignInIntent(), 0x8000000);
    }

    public final Task zaa(Iterable arg4) {
        zak v0 = new zak(arg4);
        this.handler.sendMessage(this.handler.obtainMessage(2, v0));
        return v0.getTask();
    }

    public final void zaa(@NonNull zaae arg3) {
        Object v0 = GoogleApiManager.lock;
        __monitor_enter(v0);
        try {
            if(this.zaii != arg3) {
                this.zaii = arg3;
                this.zaij.clear();
            }

            this.zaij.addAll(arg3.zaaj());
            __monitor_exit(v0);
            return;
        label_13:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_13;
        }

        throw v3;
    }

    public static GoogleApiManager zab(Context arg4) {
        Object v0 = GoogleApiManager.lock;
        __monitor_enter(v0);
        try {
            if(GoogleApiManager.zaib == null) {
                HandlerThread v1 = new HandlerThread("GoogleApiHandler", 9);
                v1.start();
                GoogleApiManager.zaib = new GoogleApiManager(arg4.getApplicationContext(), v1.getLooper(), GoogleApiAvailability.getInstance());
            }

            __monitor_exit(v0);
            return GoogleApiManager.zaib;
        label_19:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_19;
        }

        throw v4;
    }

    static Context zab(GoogleApiManager arg0) {
        return arg0.zaic;
    }

    @WorkerThread private final void zab(GoogleApi arg3) {
        zai v0 = arg3.zak();
        Object v1 = this.zaih.get(v0);
        if(v1 == null) {
            zaa v1_1 = new zaa(this, arg3);
            this.zaih.put(v0, v1_1);
        }

        if(((zaa)v1).requiresSignIn()) {
            this.zaik.add(v0);
        }

        ((zaa)v1).connect();
    }

    final void zab(@NonNull zaae arg3) {
        Object v0 = GoogleApiManager.lock;
        __monitor_enter(v0);
        try {
            if(this.zaii == arg3) {
                this.zaii = null;
                this.zaij.clear();
            }

            __monitor_exit(v0);
            return;
        label_11:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_11;
        }

        throw v3;
    }

    public static GoogleApiManager zabc() {
        Object v0 = GoogleApiManager.lock;
        __monitor_enter(v0);
        try {
            Preconditions.checkNotNull(GoogleApiManager.zaib, "Must guarantee manager is non-null before using getInstance");
            __monitor_exit(v0);
            return GoogleApiManager.zaib;
        label_9:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_9;
        }

        throw v1;
    }

    public final int zabd() {
        return this.zaif.getAndIncrement();
    }

    static Object zabe() {
        return GoogleApiManager.lock;
    }

    static Status zabf() {
        return GoogleApiManager.zahx;
    }

    public final Task zac(GoogleApi arg4) {
        zaaf v0 = new zaaf(arg4.zak());
        this.handler.sendMessage(this.handler.obtainMessage(14, v0));
        return v0.zaal().getTask();
    }

    static long zac(GoogleApiManager arg2) {
        return arg2.zahy;
    }

    final boolean zac(ConnectionResult arg3, int arg4) {
        return this.zaid.zaa(this.zaic, arg3, arg4);
    }

    static long zad(GoogleApiManager arg2) {
        return arg2.zahz;
    }

    static GoogleApiAvailabilityCache zae(GoogleApiManager arg0) {
        return arg0.zaie;
    }

    static zaae zaf(GoogleApiManager arg0) {
        return arg0.zaii;
    }

    static Set zag(GoogleApiManager arg0) {
        return arg0.zaij;
    }

    static GoogleApiAvailability zah(GoogleApiManager arg0) {
        return arg0.zaid;
    }

    static long zai(GoogleApiManager arg2) {
        return arg2.zaia;
    }

    static Map zaj(GoogleApiManager arg0) {
        return arg0.zaih;
    }

    public final void zao() {
        this.handler.sendMessage(this.handler.obtainMessage(3));
    }
}

