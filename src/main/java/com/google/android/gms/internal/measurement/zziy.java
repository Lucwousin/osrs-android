package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks;
import com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting public final class zziy implements ServiceConnection, BaseConnectionCallbacks, BaseOnConnectionFailedListener {
    private volatile boolean zzarb;
    private volatile zzfh zzarc;

    protected zziy(zzik arg1) {
        this.zzaqv = arg1;
        super();
    }

    @MainThread public final void onConnected(@Nullable Bundle arg4) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnected");
        __monitor_enter(this);
        zzfh v4 = null;
        try {
            IInterface v0 = this.zzarc.getService();
            this.zzarc = v4;
            this.zzaqv.zzgh().zzc(new zzjb(this, ((zzfa)v0)));
            goto label_18;
        }
        catch(Throwable v4_1) {
        }
        catch(IllegalStateException ) {
            try {
                this.zzarc = v4;
                this.zzarb = false;
            label_18:
                __monitor_exit(this);
                return;
            }
            catch(Throwable v4_1) {
            label_14:
                try {
                    __monitor_exit(this);
                }
                catch(Throwable v4_1) {
                    goto label_14;
                }

                throw v4_1;
            }
        }
    }

    @MainThread public final void onConnectionFailed(@NonNull ConnectionResult arg3) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionFailed");
        zzfi v0 = this.zzaqv.zzacv.zzjy();
        if(v0 != null) {
            v0.zziy().zzg("Service connection failed", arg3);
        }

        __monitor_enter(this);
        try {
            this.zzarb = false;
            this.zzarc = null;
            __monitor_exit(this);
        }
        catch(Throwable v3) {
            try {
            label_22:
                __monitor_exit(this);
            }
            catch(Throwable v3) {
                goto label_22;
            }

            throw v3;
        }

        this.zzaqv.zzgh().zzc(new zzjd(this));
    }

    @MainThread public final void onConnectionSuspended(int arg2) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onConnectionSuspended");
        this.zzaqv.zzgi().zzjb().log("Service connection suspended");
        this.zzaqv.zzgh().zzc(new zzjc(this));
    }

    @MainThread public final void onServiceConnected(ComponentName arg4, IBinder arg5) {
        zzfc v1_2;
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceConnected");
        __monitor_enter(this);
        if(arg5 == null) {
            try {
                this.zzarb = false;
                this.zzaqv.zzgi().zziv().log("Service connected with null binder");
                __monitor_exit(this);
                return;
            }
            catch(Throwable v4) {
                goto label_14;
            }
        }

        IInterface v0 = null;
        try {
            String v1 = arg5.getInterfaceDescriptor();
            if("com.google.android.gms.measurement.internal.IMeasurementService".equals(v1)) {
                if(arg5 == null) {
                }
                else {
                    IInterface v1_1 = arg5.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if(!(v1_1 instanceof zzfa)) {
                        v1_2 = new zzfc(arg5);
                    }

                    v0 = ((IInterface)v1_2);
                }

                this.zzaqv.zzgi().zzjc().log("Bound to IMeasurementService interface");
                goto label_48;
            }

            this.zzaqv.zzgi().zziv().zzg("Got binder with a wrong descriptor", v1);
            goto label_48;
        }
        catch(Throwable v4) {
        }
        catch(RemoteException ) {
            try {
                this.zzaqv.zzgi().zziv().log("Service connect failed to get IMeasurementService");
            label_48:
                if(v0 == null) {
                    this.zzarb = false;
                }
                else {
                    goto label_57;
                }
            }
            catch(Throwable v4) {
                goto label_14;
            }

            try {
                ConnectionTracker.getInstance().unbindService(this.zzaqv.getContext(), zzik.zza(this.zzaqv));
                goto label_62;
            }
            catch(IllegalArgumentException ) {
                goto label_62;
            }
            catch(Throwable v4) {
                goto label_14;
            }

            try {
            label_57:
                this.zzaqv.zzgh().zzc(new zziz(this, ((zzfa)v0)));
            label_62:
                __monitor_exit(this);
                return;
            }
            catch(Throwable v4) {
            label_14:
                try {
                    __monitor_exit(this);
                }
                catch(Throwable v4) {
                    goto label_14;
                }

                throw v4;
            }
        }
    }

    @MainThread public final void onServiceDisconnected(ComponentName arg3) {
        Preconditions.checkMainThread("MeasurementServiceConnection.onServiceDisconnected");
        this.zzaqv.zzgi().zzjb().log("Service disconnected");
        this.zzaqv.zzgh().zzc(new zzja(this, arg3));
    }

    static boolean zza(zziy arg0, boolean arg1) {
        arg0.zzarb = false;
        return 0;
    }

    @WorkerThread public final void zzc(Intent arg5) {
        this.zzaqv.zzab();
        Context v0 = this.zzaqv.getContext();
        ConnectionTracker v1 = ConnectionTracker.getInstance();
        __monitor_enter(this);
        try {
            if(this.zzarb) {
                this.zzaqv.zzgi().zzjc().log("Connection attempt already in progress");
                __monitor_exit(this);
                return;
            }

            this.zzaqv.zzgi().zzjc().log("Using local app measurement service");
            this.zzarb = true;
            v1.bindService(v0, arg5, zzik.zza(this.zzaqv), 0x81);
            __monitor_exit(this);
            return;
        label_29:
            __monitor_exit(this);
        }
        catch(Throwable v5) {
            goto label_29;
        }

        throw v5;
    }

    @WorkerThread public final void zzkt() {
        this.zzaqv.zzab();
        Context v0 = this.zzaqv.getContext();
        __monitor_enter(this);
        try {
            if(this.zzarb) {
                this.zzaqv.zzgi().zzjc().log("Connection attempt already in progress");
                __monitor_exit(this);
                return;
            }

            if(this.zzarc != null) {
                this.zzaqv.zzgi().zzjc().log("Already awaiting connection attempt");
                __monitor_exit(this);
                return;
            }

            this.zzarc = new zzfh(v0, Looper.getMainLooper(), ((BaseConnectionCallbacks)this), ((BaseOnConnectionFailedListener)this));
            this.zzaqv.zzgi().zzjc().log("Connecting to remote service");
            this.zzarb = true;
            this.zzarc.checkAvailabilityAndConnect();
            __monitor_exit(this);
            return;
        label_39:
            __monitor_exit(this);
        }
        catch(Throwable v0_1) {
            goto label_39;
        }

        throw v0_1;
    }
}

