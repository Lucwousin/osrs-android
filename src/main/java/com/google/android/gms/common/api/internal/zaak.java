package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.zaj;
import com.google.android.gms.signin.zad;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;

public final class zaak implements zabd {
    private final Context mContext;
    private final AbstractClientBuilder zacd;
    private final Lock zaen;
    private final ClientSettings zaes;
    private final Map zaev;
    private final GoogleApiAvailabilityLight zaex;
    private ConnectionResult zafg;
    private final zabe zafs;
    private int zafv;
    private int zafw;
    private int zafx;
    private final Bundle zafy;
    private final Set zafz;
    private zad zaga;
    private boolean zagb;
    private boolean zagc;
    private boolean zagd;
    private IAccountAccessor zage;
    private boolean zagf;
    private boolean zagg;
    private ArrayList zagh;

    public zaak(zabe arg2, ClientSettings arg3, Map arg4, GoogleApiAvailabilityLight arg5, AbstractClientBuilder arg6, Lock arg7, Context arg8) {
        super();
        this.zafw = 0;
        this.zafy = new Bundle();
        this.zafz = new HashSet();
        this.zagh = new ArrayList();
        this.zafs = arg2;
        this.zaes = arg3;
        this.zaev = arg4;
        this.zaex = arg5;
        this.zacd = arg6;
        this.zaen = arg7;
        this.mContext = arg8;
    }

    public final void begin() {
        this.zafs.zaho.clear();
        this.zagc = false;
        ConnectionResult v1 = null;
        this.zafg = v1;
        this.zafw = 0;
        this.zagb = true;
        this.zagd = false;
        this.zagf = false;
        HashMap v3 = new HashMap();
        Iterator v4 = this.zaev.keySet().iterator();
        int v5 = 0;
        while(v4.hasNext()) {
            Object v6 = v4.next();
            Object v7 = this.zafs.zagy.get(((Api)v6).getClientKey());
            int v8 = ((Api)v6).zah().getPriority() == 1 ? 1 : 0;
            v5 |= v8;
            boolean v8_1 = this.zaev.get(v6).booleanValue();
            if(((Client)v7).requiresSignIn()) {
                this.zagc = true;
                if(v8_1) {
                    this.zafz.add(((Api)v6).getClientKey());
                }
                else {
                    this.zagb = false;
                }
            }

            ((Map)v3).put(v7, new zaam(this, ((Api)v6), v8_1));
        }

        if(v5 != 0) {
            this.zagc = false;
        }

        if(this.zagc) {
            this.zaes.setClientSessionId(Integer.valueOf(System.identityHashCode(this.zafs.zaed)));
            zaat v10 = new zaat(this, ((zaal)v1));
            this.zaga = this.zacd.buildClient(this.mContext, this.zafs.zaed.getLooper(), this.zaes, this.zaes.getSignInOptions(), v10, ((OnConnectionFailedListener)v10));
        }

        this.zafx = this.zafs.zagy.size();
        this.zagh.add(zabh.zabb().submit(new zaan(this, ((Map)v3))));
    }

    public final void connect() {
    }

    public final boolean disconnect() {
        this.zaas();
        this.zab(true);
        this.zafs.zaf(null);
        return 1;
    }

    public final ApiMethodImpl enqueue(ApiMethodImpl arg2) {
        this.zafs.zaed.zafb.add(arg2);
        return arg2;
    }

    public final ApiMethodImpl execute(ApiMethodImpl arg2) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @GuardedBy(value="mLock") public final void onConnected(Bundle arg2) {
        if(!this.zac(1)) {
            return;
        }

        if(arg2 != null) {
            this.zafy.putAll(arg2);
        }

        if(this.zaao()) {
            this.zaaq();
        }
    }

    @GuardedBy(value="mLock") public final void onConnectionSuspended(int arg3) {
        this.zae(new ConnectionResult(8, null));
    }

    static Context zaa(zaak arg0) {
        return arg0.mContext;
    }

    static void zaa(zaak arg0, ConnectionResult arg1) {
        arg0.zae(arg1);
    }

    static void zaa(zaak arg0, ConnectionResult arg1, Api arg2, boolean arg3) {
        arg0.zab(arg1, arg2, arg3);
    }

    static void zaa(zaak arg0, zaj arg1) {
        arg0.zaa(arg1);
    }

    @GuardedBy(value="mLock") private final void zaa(zaj arg5) {
        if(!this.zac(0)) {
            return;
        }

        ConnectionResult v0 = arg5.getConnectionResult();
        if(v0.isSuccess()) {
            ResolveAccountResponse v5 = arg5.zacw();
            v0 = v5.getConnectionResult();
            if(!v0.isSuccess()) {
                String v1 = String.valueOf(v0);
                StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 0x30);
                v3.append("Sign-in succeeded with resolve account failure: ");
                v3.append(v1);
                Log.wtf("GoogleApiClientConnecting", v3.toString(), new Exception());
                this.zae(v0);
                return;
            }

            this.zagd = true;
            this.zage = v5.getAccountAccessor();
            this.zagf = v5.getSaveDefaultAccount();
            this.zagg = v5.isFromCrossClientAuth();
            this.zaap();
            return;
        }

        if(this.zad(v0)) {
            this.zaar();
            this.zaap();
            return;
        }

        this.zae(v0);
    }

    static boolean zaa(zaak arg0, int arg1) {
        return arg0.zac(0);
    }

    @GuardedBy(value="mLock") public final void zaa(ConnectionResult arg2, Api arg3, boolean arg4) {
        if(!this.zac(1)) {
            return;
        }

        this.zab(arg2, arg3, arg4);
        if(this.zaao()) {
            this.zaaq();
        }
    }

    @GuardedBy(value="mLock") private final boolean zaao() {
        --this.zafx;
        if(this.zafx > 0) {
            return 0;
        }

        if(this.zafx < 0) {
            Log.w("GoogleApiClientConnecting", this.zafs.zaed.zaay());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            this.zae(new ConnectionResult(8, null));
            return 0;
        }

        if(this.zafg != null) {
            this.zafs.zahr = this.zafv;
            this.zae(this.zafg);
            return 0;
        }

        return 1;
    }

    @GuardedBy(value="mLock") private final void zaap() {
        if(this.zafx != 0) {
            return;
        }

        if(!this.zagc || (this.zagd)) {
            ArrayList v0 = new ArrayList();
            this.zafw = 1;
            this.zafx = this.zafs.zagy.size();
            Iterator v1 = this.zafs.zagy.keySet().iterator();
            while(v1.hasNext()) {
                Object v2 = v1.next();
                if(this.zafs.zaho.containsKey(v2)) {
                    if(!this.zaao()) {
                        continue;
                    }

                    this.zaaq();
                }
                else {
                    v0.add(this.zafs.zagy.get(v2));
                }
            }

            if(!v0.isEmpty()) {
                this.zagh.add(zabh.zabb().submit(new zaaq(this, v0)));
            }
        }
    }

    @GuardedBy(value="mLock") private final void zaaq() {
        this.zafs.zaba();
        zabh.zabb().execute(new zaal(this));
        if(this.zaga != null) {
            if(this.zagf) {
                this.zaga.zaa(this.zage, this.zagg);
            }

            this.zab(false);
        }

        Iterator v0 = this.zafs.zaho.keySet().iterator();
        while(v0.hasNext()) {
            this.zafs.zagy.get(v0.next()).disconnect();
        }

        Bundle v0_1 = this.zafy.isEmpty() ? null : this.zafy;
        this.zafs.zahs.zab(v0_1);
    }

    @GuardedBy(value="mLock") private final void zaar() {
        this.zagc = false;
        this.zafs.zaed.zagz = Collections.emptySet();
        Iterator v0 = this.zafz.iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            if(this.zafs.zaho.containsKey(v1)) {
                continue;
            }

            this.zafs.zaho.put(v1, new ConnectionResult(17, null));
        }
    }

    private final void zaas() {
        ArrayList v0 = this.zagh;
        int v1 = v0.size();
        int v2 = 0;
        while(v2 < v1) {
            Object v3 = v0.get(v2);
            ++v2;
            ((Future)v3).cancel(true);
        }

        this.zagh.clear();
    }

    private final Set zaat() {
        if(this.zaes == null) {
            return Collections.emptySet();
        }

        HashSet v0 = new HashSet(this.zaes.getRequiredScopes());
        Map v1 = this.zaes.getOptionalApiSettings();
        Iterator v2 = v1.keySet().iterator();
        while(v2.hasNext()) {
            Object v3 = v2.next();
            if(this.zafs.zaho.containsKey(((Api)v3).getClientKey())) {
                continue;
            }

            ((Set)v0).addAll(v1.get(v3).mScopes);
        }

        return ((Set)v0);
    }

    static GoogleApiAvailabilityLight zab(zaak arg0) {
        return arg0.zaex;
    }

    @GuardedBy(value="mLock") private final void zab(ConnectionResult arg5, Api arg6, boolean arg7) {
        int v0 = arg6.zah().getPriority();
        int v1 = 0;
        if(arg7) {
            if((arg5.hasResolution()) || this.zaex.getErrorResolutionIntent(arg5.getErrorCode()) != null) {
                int v7 = 1;
                goto label_15;
            label_14:
                v7 = 0;
            }
            else {
                goto label_14;
            }

        label_15:
            if(v7 == 0) {
                goto label_21;
            }

            goto label_16;
        }
        else {
        label_16:
            if(this.zafg != null && v0 >= this.zafv) {
                goto label_21;
            }

            v1 = 1;
        }

    label_21:
        if(v1 != 0) {
            this.zafg = arg5;
            this.zafv = v0;
        }

        this.zafs.zaho.put(arg6.getClientKey(), arg5);
    }

    private final void zab(boolean arg2) {
        if(this.zaga != null) {
            if((this.zaga.isConnected()) && (arg2)) {
                this.zaga.zacv();
            }

            this.zaga.disconnect();
            this.zage = null;
        }
    }

    static boolean zab(zaak arg0, ConnectionResult arg1) {
        return arg0.zad(arg1);
    }

    static Lock zac(zaak arg0) {
        return arg0.zaen;
    }

    @GuardedBy(value="mLock") private final boolean zac(int arg5) {
        if(this.zafw != arg5) {
            Log.w("GoogleApiClientConnecting", this.zafs.zaed.zaay());
            String v1 = String.valueOf(this);
            StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 23);
            v3.append("Unexpected callback in ");
            v3.append(v1);
            Log.w("GoogleApiClientConnecting", v3.toString());
            int v1_1 = this.zafx;
            v3 = new StringBuilder(33);
            v3.append("mRemainingConnections=");
            v3.append(v1_1);
            Log.w("GoogleApiClientConnecting", v3.toString());
            v1 = zaak.zad(this.zafw);
            String v5 = zaak.zad(arg5);
            v3 = new StringBuilder(String.valueOf(v1).length() + 70 + String.valueOf(v5).length());
            v3.append("GoogleApiClient connecting is in step ");
            v3.append(v1);
            v3.append(" but received callback for step ");
            v3.append(v5);
            Log.wtf("GoogleApiClientConnecting", v3.toString(), new Exception());
            this.zae(new ConnectionResult(8, null));
            return 0;
        }

        return 1;
    }

    static zabe zad(zaak arg0) {
        return arg0.zafs;
    }

    @GuardedBy(value="mLock") private final boolean zad(ConnectionResult arg2) {
        if((this.zagb) && !arg2.hasResolution()) {
            return 1;
        }

        return 0;
    }

    private static String zad(int arg0) {
        switch(arg0) {
            case 0: {
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            case 1: {
                return "STEP_GETTING_REMOTE_SERVICE";
            }
        }

        return "UNKNOWN";
    }

    @GuardedBy(value="mLock") private final void zae(ConnectionResult arg2) {
        this.zaas();
        this.zab(arg2.hasResolution() ^ 1);
        this.zafs.zaf(arg2);
        this.zafs.zahs.zac(arg2);
    }

    static boolean zae(zaak arg0) {
        return arg0.zagc;
    }

    static zad zaf(zaak arg0) {
        return arg0.zaga;
    }

    static Set zag(zaak arg0) {
        return arg0.zaat();
    }

    static IAccountAccessor zah(zaak arg0) {
        return arg0.zage;
    }

    static void zai(zaak arg0) {
        arg0.zaar();
    }

    static void zaj(zaak arg0) {
        arg0.zaap();
    }

    static boolean zak(zaak arg0) {
        return arg0.zaao();
    }
}

