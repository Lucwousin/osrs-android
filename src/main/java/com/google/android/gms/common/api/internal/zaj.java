package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient$OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class zaj extends zal {
    final class zaa implements OnConnectionFailedListener {
        public final int zacw;
        public final GoogleApiClient zacx;
        public final OnConnectionFailedListener zacy;

        public zaa(zaj arg1, int arg2, GoogleApiClient arg3, OnConnectionFailedListener arg4) {
            this.zacz = arg1;
            super();
            this.zacw = arg2;
            this.zacx = arg3;
            this.zacy = arg4;
            arg3.registerConnectionFailedListener(((OnConnectionFailedListener)this));
        }

        public final void onConnectionFailed(@NonNull ConnectionResult arg5) {
            String v1 = String.valueOf(arg5);
            StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 27);
            v3.append("beginFailureResolution for ");
            v3.append(v1);
            Log.d("AutoManageHelper", v3.toString());
            this.zacz.zab(arg5, this.zacw);
        }
    }

    private final SparseArray zacv;

    private zaj(LifecycleFragment arg2) {
        super(arg2);
        this.zacv = new SparseArray();
        this.mLifecycleFragment.addCallback("AutoManageHelper", ((LifecycleCallback)this));
    }

    public void dump(String arg5, FileDescriptor arg6, PrintWriter arg7, String[] arg8) {
        int v0;
        for(v0 = 0; v0 < this.zacv.size(); ++v0) {
            zaa v1 = this.zab(v0);
            if(v1 != null) {
                arg7.append(((CharSequence)arg5)).append("GoogleApiClient #").print(v1.zacw);
                arg7.println(":");
                v1.zacx.dump(String.valueOf(arg5).concat("  "), arg6, arg7, arg8);
            }
        }
    }

    public void onStart() {
        super.onStart();
        boolean v1 = this.mStarted;
        String v2 = String.valueOf(this.zacv);
        StringBuilder v4 = new StringBuilder(String.valueOf(v2).length() + 14);
        v4.append("onStart ");
        v4.append(v1);
        v4.append(" ");
        v4.append(v2);
        Log.d("AutoManageHelper", v4.toString());
        if(this.zade.get() == null) {
            int v0;
            for(v0 = 0; v0 < this.zacv.size(); ++v0) {
                zaa v1_1 = this.zab(v0);
                if(v1_1 != null) {
                    v1_1.zacx.connect();
                }
            }
        }
    }

    public void onStop() {
        super.onStop();
        int v0;
        for(v0 = 0; v0 < this.zacv.size(); ++v0) {
            zaa v1 = this.zab(v0);
            if(v1 != null) {
                v1.zacx.disconnect();
            }
        }
    }

    public final void zaa(int arg7, GoogleApiClient arg8, OnConnectionFailedListener arg9) {
        Preconditions.checkNotNull(arg8, "GoogleApiClient instance cannot be null");
        boolean v0 = this.zacv.indexOfKey(arg7) < 0 ? true : false;
        StringBuilder v2 = new StringBuilder(54);
        v2.append("Already managing a GoogleApiClient with id ");
        v2.append(arg7);
        Preconditions.checkState(v0, v2.toString());
        Object v0_1 = this.zade.get();
        boolean v2_1 = this.mStarted;
        String v3 = String.valueOf(v0_1);
        StringBuilder v5 = new StringBuilder(String.valueOf(v3).length() + 49);
        v5.append("starting AutoManage for client ");
        v5.append(arg7);
        v5.append(" ");
        v5.append(v2_1);
        v5.append(" ");
        v5.append(v3);
        Log.d("AutoManageHelper", v5.toString());
        this.zacv.put(arg7, new zaa(this, arg7, arg8, arg9));
        if((this.mStarted) && v0_1 == null) {
            String v9 = String.valueOf(arg8);
            StringBuilder v1 = new StringBuilder(String.valueOf(v9).length() + 11);
            v1.append("connecting ");
            v1.append(v9);
            Log.d("AutoManageHelper", v1.toString());
            arg8.connect();
        }
    }

    public static zaj zaa(LifecycleActivity arg2) {
        LifecycleFragment v2 = zaj.getFragment(arg2);
        LifecycleCallback v0 = v2.getCallbackOrNull("AutoManageHelper", zaj.class);
        if(v0 != null) {
            return ((zaj)v0);
        }

        return new zaj(v2);
    }

    public final void zaa(int arg3) {
        Object v0 = this.zacv.get(arg3);
        this.zacv.remove(arg3);
        if(v0 != null) {
            ((zaa)v0).zacx.unregisterConnectionFailedListener(((OnConnectionFailedListener)v0));
            ((zaa)v0).zacx.disconnect();
        }
    }

    protected final void zaa(ConnectionResult arg3, int arg4) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if(arg4 < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }

        Object v0 = this.zacv.get(arg4);
        if(v0 != null) {
            this.zaa(arg4);
            OnConnectionFailedListener v4 = ((zaa)v0).zacy;
            if(v4 != null) {
                v4.onConnectionFailed(arg3);
            }
        }
    }

    @Nullable private final zaa zab(int arg3) {
        if(this.zacv.size() <= arg3) {
            return null;
        }

        return this.zacv.get(this.zacv.keyAt(arg3));
    }

    protected final void zao() {
        int v0;
        for(v0 = 0; v0 < this.zacv.size(); ++v0) {
            zaa v1 = this.zab(v0);
            if(v1 != null) {
                v1.zacx.connect();
            }
        }
    }
}

