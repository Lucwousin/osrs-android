package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$AnyClientKey;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient$Builder;
import com.google.android.gms.common.api.GoogleApiClient$ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClientEventManager$GmsClientEventState;
import com.google.android.gms.common.internal.GmsClientEventManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaaw extends GoogleApiClient implements zabt {
    private final Context mContext;
    private final Looper zabj;
    private final int zaca;
    private final GoogleApiAvailability zacc;
    private final AbstractClientBuilder zacd;
    private boolean zacg;
    private final Lock zaen;
    private final ClientSettings zaes;
    private final Map zaev;
    @VisibleForTesting final Queue zafb;
    private final GmsClientEventManager zagr;
    private zabs zags;
    private volatile boolean zagt;
    private long zagu;
    private long zagv;
    private final zabb zagw;
    @VisibleForTesting private zabq zagx;
    final Map zagy;
    Set zagz;
    private final ListenerHolders zaha;
    private final ArrayList zahb;
    private Integer zahc;
    Set zahd;
    final zacp zahe;
    private final GmsClientEventState zahf;

    public zaaw(Context arg6, Lock arg7, Looper arg8, ClientSettings arg9, GoogleApiAvailability arg10, AbstractClientBuilder arg11, Map arg12, List arg13, List arg14, Map arg15, int arg16, int arg17, ArrayList arg18, boolean arg19) {
        zaaw v0 = this;
        Looper v1 = arg8;
        super();
        zabs v2 = null;
        v0.zags = v2;
        v0.zafb = new LinkedList();
        long v3 = ClientLibraryUtils.isPackageSide() ? 10000 : 120000;
        v0.zagu = v3;
        v0.zagv = 5000;
        v0.zagz = new HashSet();
        v0.zaha = new ListenerHolders();
        v0.zahc = ((Integer)v2);
        v0.zahd = ((Set)v2);
        v0.zahf = new zaax(this);
        v0.mContext = arg6;
        v0.zaen = arg7;
        v0.zacg = false;
        v0.zagr = new GmsClientEventManager(arg8, v0.zahf);
        v0.zabj = v1;
        v0.zagw = new zabb(this, arg8);
        v0.zacc = arg10;
        v0.zaca = arg16;
        if(v0.zaca >= 0) {
            v0.zahc = Integer.valueOf(arg17);
        }

        v0.zaev = arg12;
        v0.zagy = arg15;
        v0.zahb = arg18;
        v0.zahe = new zacp(v0.zagy);
        Iterator v1_1 = arg13.iterator();
        while(v1_1.hasNext()) {
            v0.zagr.registerConnectionCallbacks(v1_1.next());
        }

        v1_1 = arg14.iterator();
        while(v1_1.hasNext()) {
            v0.zagr.registerConnectionFailedListener(v1_1.next());
        }

        v0.zaes = arg9;
        v0.zacd = arg11;
    }

    public final ConnectionResult blockingConnect() {
        ConnectionResult v0_2;
        boolean v2 = true;
        boolean v0 = Looper.myLooper() != Looper.getMainLooper() ? true : false;
        Preconditions.checkState(v0, "blockingConnect must not be called on the UI thread");
        this.zaen.lock();
        try {
            if(this.zaca >= 0) {
                if(this.zahc != null) {
                }
                else {
                    v2 = false;
                }

                Preconditions.checkState(v2, "Sign-in mode should have been set explicitly by auto-manage.");
            }
            else {
                if(this.zahc == null) {
                    this.zahc = Integer.valueOf(zaaw.zaa(this.zagy.values(), false));
                    goto label_33;
                }

                if(this.zahc.intValue() == 2) {
                    goto label_43;
                }
            }

        label_33:
            this.zae(this.zahc.intValue());
            this.zagr.enableCallbacks();
            v0_2 = this.zags.blockingConnect();
        }
        catch(Throwable v0_1) {
            goto label_49;
        }

        this.zaen.unlock();
        return v0_2;
        try {
        label_43:
            throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        catch(Throwable v0_1) {
        label_49:
            this.zaen.unlock();
            throw v0_1;
        }
    }

    public final ConnectionResult blockingConnect(long arg4, @NonNull TimeUnit arg6) {
        ConnectionResult v4_1;
        boolean v0 = Looper.myLooper() != Looper.getMainLooper() ? true : false;
        Preconditions.checkState(v0, "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(arg6, "TimeUnit must not be null");
        this.zaen.lock();
        try {
            if(this.zahc == null) {
                this.zahc = Integer.valueOf(zaaw.zaa(this.zagy.values(), false));
            }
            else {
                if(this.zahc.intValue() != 2) {
                    goto label_25;
                }

                goto label_35;
            }

        label_25:
            this.zae(this.zahc.intValue());
            this.zagr.enableCallbacks();
            v4_1 = this.zags.blockingConnect(arg4, arg6);
        }
        catch(Throwable v4) {
            goto label_41;
        }

        this.zaen.unlock();
        return v4_1;
        try {
        label_35:
            throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        catch(Throwable v4) {
        label_41:
            this.zaen.unlock();
            throw v4;
        }
    }

    public final PendingResult clearDefaultAccountAndReconnect() {
        Preconditions.checkState(((GoogleApiClient)this).isConnected(), "GoogleApiClient is not connected yet.");
        boolean v0 = this.zahc.intValue() != 2 ? true : false;
        Preconditions.checkState(v0, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult v0_1 = new StatusPendingResult(((GoogleApiClient)this));
        if(this.zagy.containsKey(Common.CLIENT_KEY)) {
            this.zaa(((GoogleApiClient)this), v0_1, false);
        }
        else {
            AtomicReference v1 = new AtomicReference();
            GoogleApiClient v2 = new Builder(this.mContext).addApi(Common.API).addConnectionCallbacks(new zaay(this, v1, v0_1)).addOnConnectionFailedListener(new zaaz(this, v0_1)).setHandler(this.zagw).build();
            v1.set(v2);
            v2.connect();
        }

        return ((PendingResult)v0_1);
    }

    public final void connect() {
        this.zaen.lock();
        try {
            boolean v1 = false;
            if(this.zaca >= 0) {
                if(this.zahc != null) {
                    v1 = true;
                }

                Preconditions.checkState(v1, "Sign-in mode should have been set explicitly by auto-manage.");
            }
            else {
                if(this.zahc == null) {
                    this.zahc = Integer.valueOf(zaaw.zaa(this.zagy.values(), false));
                    goto label_23;
                }

                if(this.zahc.intValue() == 2) {
                    goto label_29;
                }
            }

        label_23:
            ((GoogleApiClient)this).connect(this.zahc.intValue());
        }
        catch(Throwable v0) {
            goto label_35;
        }

        this.zaen.unlock();
        return;
        try {
        label_29:
            throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
        }
        catch(Throwable v0) {
        label_35:
            this.zaen.unlock();
            throw v0;
        }
    }

    public final void connect(int arg4) {
        this.zaen.lock();
        boolean v1 = true;
        if(arg4 != 3 && arg4 != 1) {
            if(arg4 == 2) {
            }
            else {
                v1 = false;
            }
        }

        int v0 = 33;
        try {
            StringBuilder v2 = new StringBuilder(v0);
            v2.append("Illegal sign-in mode: ");
            v2.append(arg4);
            Preconditions.checkArgument(v1, v2.toString());
            this.zae(arg4);
            this.zaau();
        }
        catch(Throwable v4) {
            this.zaen.unlock();
            throw v4;
        }

        this.zaen.unlock();
    }

    public final void disconnect() {
        this.zaen.lock();
        try {
            this.zahe.release();
            if(this.zags != null) {
                this.zags.disconnect();
            }

            this.zaha.release();
            Iterator v0_1 = this.zafb.iterator();
            while(v0_1.hasNext()) {
                Object v1 = v0_1.next();
                ((BasePendingResult)v1).zaa(null);
                ((PendingResult)v1).cancel();
            }

            this.zafb.clear();
            if(this.zags != null) {
                goto label_26;
            }
        }
        catch(Throwable v0) {
            goto label_34;
        }

        this.zaen.unlock();
        return;
        try {
        label_26:
            this.zaaw();
            this.zagr.disableCallbacks();
        }
        catch(Throwable v0) {
            goto label_34;
        }

        this.zaen.unlock();
        return;
    label_34:
        this.zaen.unlock();
        throw v0;
    }

    public final void dump(String arg3, FileDescriptor arg4, PrintWriter arg5, String[] arg6) {
        arg5.append(((CharSequence)arg3)).append("mContext=").println(this.mContext);
        arg5.append(((CharSequence)arg3)).append("mResuming=").print(this.zagt);
        arg5.append(" mWorkQueue.size()=").print(this.zafb.size());
        arg5.append(" mUnconsumedApiCalls.size()=").println(this.zahe.zaky.size());
        if(this.zags != null) {
            this.zags.dump(arg3, arg4, arg5, arg6);
        }
    }

    public final ApiMethodImpl enqueue(@NonNull ApiMethodImpl arg5) {
        boolean v0 = arg5.getClientKey() != null ? true : false;
        Preconditions.checkArgument(v0, "This task can not be enqueued (it\'s probably a Batch or malformed)");
        v0 = this.zagy.containsKey(arg5.getClientKey());
        String v1 = arg5.getApi() != null ? arg5.getApi().getName() : "the API";
        StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 65);
        v3.append("GoogleApiClient is not configured to use ");
        v3.append(v1);
        v3.append(" required for this call.");
        Preconditions.checkArgument(v0, v3.toString());
        this.zaen.lock();
        try {
            if(this.zags != null) {
                goto label_37;
            }

            this.zafb.add(arg5);
        }
        catch(Throwable v5) {
            goto label_44;
        }

        this.zaen.unlock();
        return arg5;
        try {
        label_37:
            arg5 = this.zags.enqueue(arg5);
        }
        catch(Throwable v5) {
        label_44:
            this.zaen.unlock();
            throw v5;
        }

        this.zaen.unlock();
        return arg5;
    }

    public final ApiMethodImpl execute(@NonNull ApiMethodImpl arg5) {
        boolean v0 = arg5.getClientKey() != null ? true : false;
        Preconditions.checkArgument(v0, "This task can not be executed (it\'s probably a Batch or malformed)");
        v0 = this.zagy.containsKey(arg5.getClientKey());
        String v1 = arg5.getApi() != null ? arg5.getApi().getName() : "the API";
        StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 65);
        v3.append("GoogleApiClient is not configured to use ");
        v3.append(v1);
        v3.append(" required for this call.");
        Preconditions.checkArgument(v0, v3.toString());
        this.zaen.lock();
        try {
            if(this.zags == null) {
                goto label_54;
            }

            if(!this.zagt) {
                goto label_49;
            }

            this.zafb.add(arg5);
            while(!this.zafb.isEmpty()) {
                Object v0_1 = this.zafb.remove();
                this.zahe.zab(((BasePendingResult)v0_1));
                ((ApiMethodImpl)v0_1).setFailedResult(Status.RESULT_INTERNAL_ERROR);
            }
        }
        catch(Throwable v5) {
            goto label_60;
        }

        this.zaen.unlock();
        return arg5;
        try {
        label_49:
            arg5 = this.zags.execute(arg5);
        }
        catch(Throwable v5) {
            goto label_60;
        }

        this.zaen.unlock();
        return arg5;
        try {
        label_54:
            throw new IllegalStateException("GoogleApiClient is not connected yet.");
        }
        catch(Throwable v5) {
        label_60:
            this.zaen.unlock();
            throw v5;
        }
    }

    @NonNull public final Client getClient(@NonNull AnyClientKey arg2) {
        Object v2 = this.zagy.get(arg2);
        Preconditions.checkNotNull(v2, "Appropriate Api was not requested.");
        return ((Client)v2);
    }

    @NonNull public final ConnectionResult getConnectionResult(@NonNull Api arg3) {
        ConnectionResult v3_1;
        ConnectionResult v0;
        this.zaen.lock();
        try {
            if(!((GoogleApiClient)this).isConnected()) {
                if(this.zagt) {
                }
                else {
                    throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
                }
            }

            if(!this.zagy.containsKey(arg3.getClientKey())) {
                goto label_45;
            }

            v0 = this.zags.getConnectionResult(arg3);
            if(v0 != null) {
                goto label_42;
            }

            if(!this.zagt) {
                goto label_24;
            }

            v3_1 = ConnectionResult.RESULT_SUCCESS;
        }
        catch(Throwable v3) {
            goto label_54;
        }

        this.zaen.unlock();
        return v3_1;
        try {
        label_24:
            Log.w("GoogleApiClientImpl", this.zaay());
            Log.wtf("GoogleApiClientImpl", String.valueOf(arg3.getName()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
            v3_1 = new ConnectionResult(8, null);
        }
        catch(Throwable v3) {
            goto label_54;
        }

        this.zaen.unlock();
        return v3_1;
    label_42:
        this.zaen.unlock();
        return v0;
        try {
        label_45:
            throw new IllegalArgumentException(String.valueOf(arg3.getName()).concat(" was never registered with GoogleApiClient"));
        }
        catch(Throwable v3) {
        label_54:
            this.zaen.unlock();
            throw v3;
        }
    }

    public final Context getContext() {
        return this.mContext;
    }

    public final Looper getLooper() {
        return this.zabj;
    }

    public final boolean hasApi(@NonNull Api arg2) {
        return this.zagy.containsKey(arg2.getClientKey());
    }

    public final boolean hasConnectedApi(@NonNull Api arg3) {
        if(!((GoogleApiClient)this).isConnected()) {
            return 0;
        }

        Object v3 = this.zagy.get(arg3.getClientKey());
        if(v3 != null && (((Client)v3).isConnected())) {
            return 1;
        }

        return 0;
    }

    public final boolean isConnected() {
        if(this.zags != null && (this.zags.isConnected())) {
            return 1;
        }

        return 0;
    }

    public final boolean isConnecting() {
        if(this.zags != null && (this.zags.isConnecting())) {
            return 1;
        }

        return 0;
    }

    public final boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks arg2) {
        return this.zagr.isConnectionCallbacksRegistered(arg2);
    }

    public final boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener arg2) {
        return this.zagr.isConnectionFailedListenerRegistered(arg2);
    }

    public final boolean maybeSignIn(SignInConnectionListener arg2) {
        if(this.zags != null && (this.zags.maybeSignIn(arg2))) {
            return 1;
        }

        return 0;
    }

    public final void maybeSignOut() {
        if(this.zags != null) {
            this.zags.maybeSignOut();
        }
    }

    public final void reconnect() {
        ((GoogleApiClient)this).disconnect();
        ((GoogleApiClient)this).connect();
    }

    public final void registerConnectionCallbacks(@NonNull ConnectionCallbacks arg2) {
        this.zagr.registerConnectionCallbacks(arg2);
    }

    public final void registerConnectionFailedListener(@NonNull OnConnectionFailedListener arg2) {
        this.zagr.registerConnectionFailedListener(arg2);
    }

    public final ListenerHolder registerListener(@NonNull Object arg4) {
        ListenerHolder v4_1;
        this.zaen.lock();
        try {
            v4_1 = this.zaha.zaa(arg4, this.zabj, "NO_TYPE");
        }
        catch(Throwable v4) {
            this.zaen.unlock();
            throw v4;
        }

        this.zaen.unlock();
        return v4_1;
    }

    private final void resume() {
        this.zaen.lock();
        try {
            if(this.zagt) {
                this.zaau();
            }
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

        this.zaen.unlock();
    }

    public final void stopAutoManage(@NonNull FragmentActivity arg2) {
        LifecycleActivity v0 = new LifecycleActivity(((Activity)arg2));
        if(this.zaca >= 0) {
            zaj.zaa(v0).zaa(this.zaca);
            return;
        }

        throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
    }

    public final void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks arg2) {
        this.zagr.unregisterConnectionCallbacks(arg2);
    }

    public final void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener arg2) {
        this.zagr.unregisterConnectionFailedListener(arg2);
    }

    public static int zaa(Iterable arg5, boolean arg6) {
        Iterator v5 = arg5.iterator();
        int v0 = 0;
        int v1;
        for(v1 = 0; v5.hasNext(); v1 = 1) {
            Object v2 = v5.next();
            if(((Client)v2).requiresSignIn()) {
                v0 = 1;
            }

            if(!((Client)v2).providesSignIn()) {
                continue;
            }
        }

        if(v0 != 0) {
            if(v1 != 0 && (arg6)) {
                return 2;
            }

            return 1;
        }

        return 3;
    }

    private final void zaa(GoogleApiClient arg3, StatusPendingResult arg4, boolean arg5) {
        Common.zaph.zaa(arg3).setResultCallback(new zaba(this, arg4, arg5, arg3));
    }

    static void zaa(zaaw arg0) {
        arg0.resume();
    }

    static void zaa(zaaw arg0, GoogleApiClient arg1, StatusPendingResult arg2, boolean arg3) {
        arg0.zaa(arg1, arg2, true);
    }

    public final void zaa(zacm arg2) {
        this.zaen.lock();
        try {
            if(this.zahd == null) {
                this.zahd = new HashSet();
            }

            this.zahd.add(arg2);
        }
        catch(Throwable v2) {
            this.zaen.unlock();
            throw v2;
        }

        this.zaen.unlock();
    }

    @GuardedBy(value="mLock") private final void zaau() {
        this.zagr.enableCallbacks();
        this.zags.connect();
    }

    private final void zaav() {
        this.zaen.lock();
        try {
            if(this.zaaw()) {
                this.zaau();
            }
        }
        catch(Throwable v0) {
            this.zaen.unlock();
            throw v0;
        }

        this.zaen.unlock();
    }

    @GuardedBy(value="mLock") final boolean zaaw() {
        if(!this.zagt) {
            return 0;
        }

        this.zagt = false;
        this.zagw.removeMessages(2);
        this.zagw.removeMessages(1);
        if(this.zagx != null) {
            this.zagx.unregister();
            this.zagx = null;
        }

        return 1;
    }

    final boolean zaax() {
        boolean v0_1;
        this.zaen.lock();
        try {
            if(this.zahd != null) {
                goto label_8;
            }
        }
        catch(Throwable v0) {
            goto label_16;
        }

        this.zaen.unlock();
        return 0;
        try {
        label_8:
            v0_1 = this.zahd.isEmpty();
        }
        catch(Throwable v0) {
        label_16:
            this.zaen.unlock();
            throw v0;
        }

        this.zaen.unlock();
        return (((int)v0_1)) ^ 1;
    }

    final String zaay() {
        StringWriter v0 = new StringWriter();
        ((GoogleApiClient)this).dump("", null, new PrintWriter(((Writer)v0)), null);
        return v0.toString();
    }

    static void zab(zaaw arg0) {
        arg0.zaav();
    }

    @GuardedBy(value="mLock") public final void zab(int arg5, boolean arg6) {
        int v0 = 2;
        if(arg5 == 1 && !arg6 && !this.zagt) {
            this.zagt = true;
            if(this.zagx == null && !ClientLibraryUtils.isPackageSide()) {
                this.zagx = this.zacc.zaa(this.mContext.getApplicationContext(), new zabc(this));
            }

            this.zagw.sendMessageDelayed(this.zagw.obtainMessage(1), this.zagu);
            this.zagw.sendMessageDelayed(this.zagw.obtainMessage(v0), this.zagv);
        }

        this.zahe.zabx();
        this.zagr.onUnintentionalDisconnection(arg5);
        this.zagr.disableCallbacks();
        if(arg5 == v0) {
            this.zaau();
        }
    }

    @GuardedBy(value="mLock") public final void zab(Bundle arg2) {
        while(!this.zafb.isEmpty()) {
            ((GoogleApiClient)this).execute(this.zafb.remove());
        }

        this.zagr.onConnectionSuccess(arg2);
    }

    public final void zab(zacm arg3) {
        this.zaen.lock();
        try {
            if(this.zahd == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            }
            else if(!this.zahd.remove(arg3)) {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
            else if(!this.zaax()) {
                this.zags.zaw();
            }
        }
        catch(Throwable v3) {
            this.zaen.unlock();
            throw v3;
        }

        this.zaen.unlock();
    }

    static Context zac(zaaw arg0) {
        return arg0.mContext;
    }

    @GuardedBy(value="mLock") public final void zac(ConnectionResult arg4) {
        if(!this.zacc.isPlayServicesPossiblyUpdating(this.mContext, arg4.getErrorCode())) {
            this.zaaw();
        }

        if(!this.zagt) {
            this.zagr.onConnectionFailure(arg4);
            this.zagr.disableCallbacks();
        }
    }

    private final void zae(int arg14) {
        if(this.zahc == null) {
            this.zahc = Integer.valueOf(arg14);
        }
        else {
            if(this.zahc.intValue() == arg14) {
                goto label_8;
            }

            goto label_112;
        }

    label_8:
        if(this.zags != null) {
            return;
        }

        Iterator v0 = this.zagy.values().iterator();
        int v1 = 0;
        int v2;
        for(v2 = 0; v0.hasNext(); v2 = 1) {
            Object v3 = v0.next();
            if(((Client)v3).requiresSignIn()) {
                v1 = 1;
            }

            if(!((Client)v3).providesSignIn()) {
                continue;
            }
        }

        switch(this.zahc.intValue()) {
            case 1: {
                if(v1 == 0) {
                    goto label_71;
                }

                if(v2 != 0) {
                    goto label_67;
                }

                break;
            }
            case 2: {
                if(v1 == 0) {
                    goto label_75;
                }

                if(this.zacg) {
                    this.zags = new zax(this.mContext, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this, true);
                    return;
                }

                this.zags = zas.zaa(this.mContext, this, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb);
                return;
            }
            default: {
                break;
            }
        }

    label_75:
        if((this.zacg) && v2 == 0) {
            this.zags = new zax(this.mContext, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this, false);
            return;
        }

        this.zags = new zabe(this.mContext, this, this.zaen, this.zabj, this.zacc, this.zagy, this.zaes, this.zaev, this.zacd, this.zahb, this);
        return;
    label_67:
        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
    label_71:
        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
    label_112:
        String v1_1 = zaaw.zaf(arg14);
        String v2_1 = zaaw.zaf(this.zahc.intValue());
        StringBuilder v4 = new StringBuilder(String.valueOf(v1_1).length() + 51 + String.valueOf(v2_1).length());
        v4.append("Cannot use sign-in mode: ");
        v4.append(v1_1);
        v4.append(". Mode was already set to ");
        v4.append(v2_1);
        throw new IllegalStateException(v4.toString());
    }

    private static String zaf(int arg0) {
        switch(arg0) {
            case 1: {
                return "SIGN_IN_MODE_REQUIRED";
            }
            case 2: {
                return "SIGN_IN_MODE_OPTIONAL";
            }
            case 3: {
                return "SIGN_IN_MODE_NONE";
            }
        }

        return "UNKNOWN";
    }
}

