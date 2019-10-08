package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;
import com.google.android.gms.common.api.internal.LifecycleActivity;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zacm;
import com.google.android.gms.common.api.internal.zaj;
import com.google.android.gms.common.api.internal.zaq;
import com.google.android.gms.common.internal.ClientSettings$OptionalApiSettings;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zaa;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk public abstract class GoogleApiClient {
    @KeepForSdk public final class Builder {
        private final Context mContext;
        private Looper zabj;
        private final Set zabr;
        private final Set zabs;
        private int zabt;
        private View zabu;
        private String zabv;
        private String zabw;
        private final Map zabx;
        private final Map zaby;
        private LifecycleActivity zabz;
        private int zaca;
        private OnConnectionFailedListener zacb;
        private GoogleApiAvailability zacc;
        private AbstractClientBuilder zacd;
        private final ArrayList zace;
        private final ArrayList zacf;
        private boolean zacg;
        private Account zax;

        @KeepForSdk public Builder(@NonNull Context arg2) {
            super();
            this.zabr = new HashSet();
            this.zabs = new HashSet();
            this.zabx = new ArrayMap();
            this.zaby = new ArrayMap();
            this.zaca = -1;
            this.zacc = GoogleApiAvailability.getInstance();
            this.zacd = zaa.zapg;
            this.zace = new ArrayList();
            this.zacf = new ArrayList();
            this.zacg = false;
            this.mContext = arg2;
            this.zabj = arg2.getMainLooper();
            this.zabv = arg2.getPackageName();
            this.zabw = arg2.getClass().getName();
        }

        @KeepForSdk public Builder(@NonNull Context arg1, @NonNull ConnectionCallbacks arg2, @NonNull OnConnectionFailedListener arg3) {
            this(arg1);
            Preconditions.checkNotNull(arg2, "Must provide a connected listener");
            this.zace.add(arg2);
            Preconditions.checkNotNull(arg3, "Must provide a connection failed listener");
            this.zacf.add(arg3);
        }

        public final Builder addApi(@NonNull Api arg3) {
            Preconditions.checkNotNull(arg3, "Api must not be null");
            this.zaby.put(arg3, null);
            List v3 = arg3.zah().getImpliedScopes(null);
            this.zabs.addAll(((Collection)v3));
            this.zabr.addAll(((Collection)v3));
            return this;
        }

        public final Builder addApi(@NonNull Api arg2, @NonNull HasOptions arg3) {
            Preconditions.checkNotNull(arg2, "Api must not be null");
            Preconditions.checkNotNull(arg3, "Null options are not permitted for this Api");
            this.zaby.put(arg2, arg3);
            List v2 = arg2.zah().getImpliedScopes(arg3);
            this.zabs.addAll(((Collection)v2));
            this.zabr.addAll(((Collection)v2));
            return this;
        }

        public final Builder addApiIfAvailable(@NonNull Api arg2, @NonNull HasOptions arg3, Scope[] arg4) {
            Preconditions.checkNotNull(arg2, "Api must not be null");
            Preconditions.checkNotNull(arg3, "Null options are not permitted for this Api");
            this.zaby.put(arg2, arg3);
            this.zaa(arg2, ((ApiOptions)arg3), arg4);
            return this;
        }

        public final Builder addApiIfAvailable(@NonNull Api arg3, Scope[] arg4) {
            Preconditions.checkNotNull(arg3, "Api must not be null");
            this.zaby.put(arg3, null);
            this.zaa(arg3, null, arg4);
            return this;
        }

        public final Builder addConnectionCallbacks(@NonNull ConnectionCallbacks arg2) {
            Preconditions.checkNotNull(arg2, "Listener must not be null");
            this.zace.add(arg2);
            return this;
        }

        public final Builder addOnConnectionFailedListener(@NonNull OnConnectionFailedListener arg2) {
            Preconditions.checkNotNull(arg2, "Listener must not be null");
            this.zacf.add(arg2);
            return this;
        }

        public final Builder addScope(@NonNull Scope arg2) {
            Preconditions.checkNotNull(arg2, "Scope must not be null");
            this.zabr.add(arg2);
            return this;
        }

        @KeepForSdk public final Builder addScopeNames(String[] arg5) {
            int v0;
            for(v0 = 0; v0 < arg5.length; ++v0) {
                this.zabr.add(new Scope(arg5[v0]));
            }

            return this;
        }

        public final GoogleApiClient build() {
            Object v21;
            boolean v4;
            Builder v1 = this;
            Preconditions.checkArgument(v1.zaby.isEmpty() ^ 1, "must call addApi() to add at least one API");
            ClientSettings v0 = this.buildClientSettings();
            Object v3 = null;
            Map v11 = v0.getOptionalApiSettings();
            ArrayMap v12 = new ArrayMap();
            ArrayMap v14 = new ArrayMap();
            ArrayList v15 = new ArrayList();
            Iterator v13 = v1.zaby.keySet().iterator();
            int v17 = 0;
            while(true) {
                if(!v13.hasNext()) {
                    goto label_79;
                }

                Object v10 = v13.next();
                Object v18 = v1.zaby.get(v10);
                v4 = v11.get(v10) != null ? true : false;
                ((Map)v12).put(v10, Boolean.valueOf(v4));
                zaq v9 = new zaq(((Api)v10), v4);
                v15.add(v9);
                AbstractClientBuilder v19 = ((Api)v10).zai();
                v21 = v10;
                Client v4_1 = v19.buildClient(v1.mContext, v1.zabj, v0, v18, ((ConnectionCallbacks)v9), v9);
                ((Map)v14).put(((Api)v21).getClientKey(), v4_1);
                if(((BaseClientBuilder)v19).getPriority() == 1) {
                    int v5 = v18 != null ? 1 : 0;
                    v17 = v5;
                }

                if(!v4_1.providesSignIn()) {
                    continue;
                }

                if(v3 != null) {
                    break;
                }

                v3 = v21;
            }

            String v2 = ((Api)v21).getName();
            String v3_1 = ((Api)v3).getName();
            StringBuilder v5_1 = new StringBuilder(String.valueOf(v2).length() + 21 + String.valueOf(v3_1).length());
            v5_1.append(v2);
            v5_1.append(" cannot be used with ");
            v5_1.append(v3_1);
            throw new IllegalStateException(v5_1.toString());
        label_79:
            if(v3 != null) {
                if(v17 == 0) {
                    v4 = v1.zax == null ? true : false;
                    Preconditions.checkState(v4, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", new Object[]{((Api)v3).getName()});
                    Preconditions.checkState(v1.zabr.equals(v1.zabs), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", new Object[]{((Api)v3).getName()});
                }
                else {
                    v2 = ((Api)v3).getName();
                    StringBuilder v4_2 = new StringBuilder(String.valueOf(v2).length() + 82);
                    v4_2.append("With using ");
                    v4_2.append(v2);
                    v4_2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                    throw new IllegalStateException(v4_2.toString());
                }
            }

            zaaw v2_1 = new zaaw(v1.mContext, new ReentrantLock(), v1.zabj, v0, v1.zacc, v1.zacd, v12, v1.zace, v1.zacf, ((Map)v14), v1.zaca, zaaw.zaa(((Map)v14).values(), true), v15, false);
            Set v3_2 = GoogleApiClient.zal();
            __monitor_enter(v3_2);
            try {
                GoogleApiClient.zal().add(v2_1);
                __monitor_exit(v3_2);
            }
            catch(Throwable v0_1) {
                goto label_152;
            }

            if(v1.zaca >= 0) {
                zaj.zaa(v1.zabz).zaa(v1.zaca, ((GoogleApiClient)v2_1), v1.zacb);
            }

            return ((GoogleApiClient)v2_1);
            try {
            label_152:
                __monitor_exit(v3_2);
            }
            catch(Throwable v0_1) {
                goto label_152;
            }

            throw v0_1;
        }

        @KeepForSdk @VisibleForTesting public final ClientSettings buildClientSettings() {
            Object v0_1;
            SignInOptions v0 = SignInOptions.DEFAULT;
            if(this.zaby.containsKey(zaa.API)) {
                v0_1 = this.zaby.get(zaa.API);
            }

            return new ClientSettings(this.zax, this.zabr, this.zabx, this.zabt, this.zabu, this.zabv, this.zabw, ((SignInOptions)v0_1));
        }

        public final Builder enableAutoManage(@NonNull FragmentActivity arg3, int arg4, @Nullable OnConnectionFailedListener arg5) {
            LifecycleActivity v0 = new LifecycleActivity(((Activity)arg3));
            boolean v3 = arg4 >= 0 ? true : false;
            Preconditions.checkArgument(v3, "clientId must be non-negative");
            this.zaca = arg4;
            this.zacb = arg5;
            this.zabz = v0;
            return this;
        }

        public final Builder enableAutoManage(@NonNull FragmentActivity arg2, @Nullable OnConnectionFailedListener arg3) {
            return this.enableAutoManage(arg2, 0, arg3);
        }

        public final Builder setAccountName(String arg3) {
            Account v3 = arg3 == null ? null : new Account(arg3, "com.google");
            this.zax = v3;
            return this;
        }

        public final Builder setGravityForPopups(int arg1) {
            this.zabt = arg1;
            return this;
        }

        public final Builder setHandler(@NonNull Handler arg2) {
            Preconditions.checkNotNull(arg2, "Handler must not be null");
            this.zabj = arg2.getLooper();
            return this;
        }

        public final Builder setViewForPopups(@NonNull View arg2) {
            Preconditions.checkNotNull(arg2, "View must not be null");
            this.zabu = arg2;
            return this;
        }

        public final Builder useDefaultAccount() {
            return this.setAccountName("<<default account>>");
        }

        private final void zaa(Api arg4, ApiOptions arg5, Scope[] arg6) {
            HashSet v0 = new HashSet(arg4.zah().getImpliedScopes(arg5));
            int v5 = arg6.length;
            int v1;
            for(v1 = 0; v1 < v5; ++v1) {
                ((Set)v0).add(arg6[v1]);
            }

            this.zabx.put(arg4, new OptionalApiSettings(((Set)v0)));
        }
    }

    public interface ConnectionCallbacks {
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected(@Nullable Bundle arg1);

        void onConnectionSuspended(int arg1);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(@NonNull ConnectionResult arg1);
    }

    @KeepForSdk public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final int SIGN_IN_MODE_OPTIONAL = 2;
    public static final int SIGN_IN_MODE_REQUIRED = 1;
    @GuardedBy(value="sAllClients") private static final Set zabq;

    static {
        GoogleApiClient.zabq = Collections.newSetFromMap(new WeakHashMap());
    }

    public GoogleApiClient() {
        super();
    }

    public abstract ConnectionResult blockingConnect();

    public abstract ConnectionResult blockingConnect(long arg1, @NonNull TimeUnit arg2);

    public abstract PendingResult clearDefaultAccountAndReconnect();

    public abstract void connect();

    public void connect(int arg1) {
        throw new UnsupportedOperationException();
    }

    public abstract void disconnect();

    public abstract void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    public static void dumpAll(String arg7, FileDescriptor arg8, PrintWriter arg9, String[] arg10) {
        Set v0 = GoogleApiClient.zabq;
        __monitor_enter(v0);
        int v1 = 0;
        try {
            String v2 = String.valueOf(arg7).concat("  ");
            Iterator v3 = GoogleApiClient.zabq.iterator();
            while(v3.hasNext()) {
                Object v4 = v3.next();
                arg9.append(((CharSequence)arg7)).append("GoogleApiClient#").println(v1);
                ((GoogleApiClient)v4).dump(v2, arg8, arg9, arg10);
                ++v1;
            }

            __monitor_exit(v0);
            return;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v7) {
            goto label_22;
        }

        throw v7;
    }

    @KeepForSdk public ApiMethodImpl enqueue(@NonNull ApiMethodImpl arg1) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk public ApiMethodImpl execute(@NonNull ApiMethodImpl arg1) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk public static Set getAllClients() {
        Set v0 = GoogleApiClient.zabq;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return GoogleApiClient.zabq;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_6;
        }

        throw v1;
    }

    @NonNull @KeepForSdk public Client getClient(@NonNull AnyClientKey arg1) {
        throw new UnsupportedOperationException();
    }

    @NonNull public abstract ConnectionResult getConnectionResult(@NonNull Api arg1);

    @KeepForSdk public Context getContext() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk public Looper getLooper() {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk public boolean hasApi(@NonNull Api arg1) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean hasConnectedApi(@NonNull Api arg1);

    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract boolean isConnectionCallbacksRegistered(@NonNull ConnectionCallbacks arg1);

    public abstract boolean isConnectionFailedListenerRegistered(@NonNull OnConnectionFailedListener arg1);

    @KeepForSdk public boolean maybeSignIn(SignInConnectionListener arg1) {
        throw new UnsupportedOperationException();
    }

    @KeepForSdk public void maybeSignOut() {
        throw new UnsupportedOperationException();
    }

    public abstract void reconnect();

    public abstract void registerConnectionCallbacks(@NonNull ConnectionCallbacks arg1);

    public abstract void registerConnectionFailedListener(@NonNull OnConnectionFailedListener arg1);

    @KeepForSdk public ListenerHolder registerListener(@NonNull Object arg1) {
        throw new UnsupportedOperationException();
    }

    public abstract void stopAutoManage(@NonNull FragmentActivity arg1);

    public abstract void unregisterConnectionCallbacks(@NonNull ConnectionCallbacks arg1);

    public abstract void unregisterConnectionFailedListener(@NonNull OnConnectionFailedListener arg1);

    public void zaa(zacm arg1) {
        throw new UnsupportedOperationException();
    }

    public void zab(zacm arg1) {
        throw new UnsupportedOperationException();
    }

    static Set zal() {
        return GoogleApiClient.zabq;
    }
}

