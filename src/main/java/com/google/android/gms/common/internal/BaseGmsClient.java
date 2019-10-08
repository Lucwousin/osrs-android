package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk public abstract class BaseGmsClient {
    @KeepForSdk public interface BaseConnectionCallbacks {
        @KeepForSdk void onConnected(@Nullable Bundle arg1);

        @KeepForSdk void onConnectionSuspended(int arg1);
    }

    @KeepForSdk public interface BaseOnConnectionFailedListener {
        void onConnectionFailed(@NonNull ConnectionResult arg1);
    }

    @KeepForSdk public interface ConnectionProgressReportCallbacks {
        @KeepForSdk void onReportServiceBinding(@NonNull ConnectionResult arg1);
    }

    public class LegacyClientCallbackAdapter implements ConnectionProgressReportCallbacks {
        @KeepForSdk public LegacyClientCallbackAdapter(BaseGmsClient arg1) {
            this.zzcs = arg1;
            super();
        }

        public void onReportServiceBinding(@NonNull ConnectionResult arg3) {
            if(arg3.isSuccess()) {
                this.zzcs.getRemoteService(null, this.zzcs.getScopes());
                return;
            }

            if(BaseGmsClient.zzg(this.zzcs) != null) {
                BaseGmsClient.zzg(this.zzcs).onConnectionFailed(arg3);
            }
        }
    }

    @KeepForSdk public interface SignOutCallbacks {
        @KeepForSdk void onSignOutComplete();
    }

    abstract class zza extends zzc {
        private final int statusCode;
        private final Bundle zzcr;

        @BinderThread protected zza(BaseGmsClient arg2, int arg3, Bundle arg4) {
            this.zzcs = arg2;
            super(arg2, Boolean.valueOf(true));
            this.statusCode = arg3;
            this.zzcr = arg4;
        }

        protected abstract void zza(ConnectionResult arg1);

        protected final void zza(Object arg5) {
            Parcelable v1_1;
            IInterface v1 = null;
            if(arg5 == null) {
                BaseGmsClient.zza(this.zzcs, 1, v1);
                return;
            }

            int v5 = this.statusCode;
            if(v5 == 0) {
                if(this.zzm()) {
                    return;
                }

                BaseGmsClient.zza(this.zzcs, 1, v1);
                this.zza(new ConnectionResult(8, ((PendingIntent)v1)));
                return;
            }
            else if(v5 != 10) {
                BaseGmsClient.zza(this.zzcs, 1, v1);
                if(this.zzcr != null) {
                    v1_1 = this.zzcr.getParcelable("pendingIntent");
                }

                this.zza(new ConnectionResult(this.statusCode, ((PendingIntent)v1_1)));
            }
            else {
                BaseGmsClient.zza(this.zzcs, 1, v1);
                throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", this.getClass().getSimpleName(), this.zzcs.getStartServiceAction(), this.zzcs.getServiceDescriptor()));
            }
        }

        protected abstract boolean zzm();

        protected final void zzn() {
        }
    }

    final class zzb extends zze {
        public zzb(BaseGmsClient arg1, Looper arg2) {
            this.zzcs = arg1;
            super(arg2);
        }

        public final void handleMessage(Message arg8) {
            ConnectionResult v8;
            if(this.zzcs.zzcq.get() != arg8.arg1) {
                if(zzb.zzb(arg8)) {
                    zzb.zza(arg8);
                }

                return;
            }

            int v1 = 4;
            int v3 = 5;
            if((arg8.what == 1 || arg8.what == 7 || arg8.what == v1 || arg8.what == v3) && !this.zzcs.isConnecting()) {
                zzb.zza(arg8);
                return;
            }

            int v4 = 8;
            int v5 = 3;
            IInterface v6 = null;
            if(arg8.what == v1) {
                BaseGmsClient.zza(this.zzcs, new ConnectionResult(arg8.arg2));
                if((BaseGmsClient.zzb(this.zzcs)) && !BaseGmsClient.zzc(this.zzcs)) {
                    BaseGmsClient.zza(this.zzcs, v5, v6);
                    return;
                }

                v8 = BaseGmsClient.zzd(this.zzcs) != null ? BaseGmsClient.zzd(this.zzcs) : new ConnectionResult(v4);
                this.zzcs.zzce.onReportServiceBinding(v8);
                this.zzcs.onConnectionFailed(v8);
                return;
            }

            if(arg8.what == v3) {
                v8 = BaseGmsClient.zzd(this.zzcs) != null ? BaseGmsClient.zzd(this.zzcs) : new ConnectionResult(v4);
                this.zzcs.zzce.onReportServiceBinding(v8);
                this.zzcs.onConnectionFailed(v8);
                return;
            }

            if(arg8.what == v5) {
                if((arg8.obj instanceof PendingIntent)) {
                    Object v6_1 = arg8.obj;
                }

                ConnectionResult v0 = new ConnectionResult(arg8.arg2, ((PendingIntent)v6));
                this.zzcs.zzce.onReportServiceBinding(v0);
                this.zzcs.onConnectionFailed(v0);
                return;
            }

            if(arg8.what == 6) {
                BaseGmsClient.zza(this.zzcs, v3, v6);
                if(BaseGmsClient.zze(this.zzcs) != null) {
                    BaseGmsClient.zze(this.zzcs).onConnectionSuspended(arg8.arg2);
                }

                this.zzcs.onConnectionSuspended(arg8.arg2);
                BaseGmsClient.zza(this.zzcs, v3, 1, v6);
                return;
            }

            if(arg8.what == 2 && !this.zzcs.isConnected()) {
                zzb.zza(arg8);
                return;
            }

            if(zzb.zzb(arg8)) {
                arg8.obj.zzo();
                return;
            }

            int v8_1 = arg8.what;
            StringBuilder v2 = new StringBuilder(45);
            v2.append("Don\'t know how to handle message: ");
            v2.append(v8_1);
            Log.wtf("GmsClient", v2.toString(), new Exception());
        }

        private static void zza(Message arg0) {
            Object v0 = arg0.obj;
            ((zzc)v0).zzn();
            ((zzc)v0).unregister();
        }

        private static boolean zzb(Message arg3) {
            if(arg3.what != 2 && arg3.what != 1) {
                if(arg3.what == 7) {
                }
                else {
                    return 0;
                }
            }

            return 1;
        }
    }

    public abstract class zzc {
        private Object zzct;
        private boolean zzcu;

        public zzc(BaseGmsClient arg1, Object arg2) {
            this.zzcs = arg1;
            super();
            this.zzct = arg2;
            this.zzcu = false;
        }

        public final void removeListener() {
            __monitor_enter(this);
            Object v0 = null;
            try {
                this.zzct = v0;
                __monitor_exit(this);
                return;
            label_6:
                __monitor_exit(this);
            }
            catch(Throwable v0_1) {
                goto label_6;
            }

            throw v0_1;
        }

        public final void unregister() {
            this.removeListener();
            ArrayList v0 = BaseGmsClient.zzf(this.zzcs);
            __monitor_enter(v0);
            try {
                BaseGmsClient.zzf(this.zzcs).remove(this);
                __monitor_exit(v0);
                return;
            label_10:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_10;
            }

            throw v1;
        }

        protected abstract void zza(Object arg1);

        protected abstract void zzn();

        public final void zzo() {
            Object v0_1;
            __monitor_enter(this);
            try {
                v0_1 = this.zzct;
                if(this.zzcu) {
                    String v2 = String.valueOf(this);
                    StringBuilder v4 = new StringBuilder(String.valueOf(v2).length() + 0x2F);
                    v4.append("Callback proxy ");
                    v4.append(v2);
                    v4.append(" being reused. This is not safe.");
                    Log.w("GmsClient", v4.toString());
                }

                __monitor_exit(this);
                if(v0_1 == null) {
                    goto label_25;
                }
            }
            catch(Throwable v0) {
                try {
                label_36:
                    __monitor_exit(this);
                }
                catch(Throwable v0) {
                    goto label_36;
                }

                throw v0;
            }

            try {
                this.zza(v0_1);
                goto label_26;
            }
            catch(RuntimeException v0_2) {
                this.zzn();
                throw v0_2;
            }

        label_25:
            this.zzn();
        label_26:
            __monitor_enter(this);
            try {
                this.zzcu = true;
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                try {
                label_33:
                    __monitor_exit(this);
                }
                catch(Throwable v0) {
                    goto label_33;
                }

                throw v0;
            }

            this.unregister();
        }
    }

    @VisibleForTesting public final class zzd extends com.google.android.gms.common.internal.IGmsCallbacks$zza {
        private BaseGmsClient zzcv;
        private final int zzcw;

        public zzd(@NonNull BaseGmsClient arg1, int arg2) {
            super();
            this.zzcv = arg1;
            this.zzcw = arg2;
        }

        @BinderThread public final void onPostInitComplete(int arg3, @NonNull IBinder arg4, @Nullable Bundle arg5) {
            Preconditions.checkNotNull(this.zzcv, "onPostInitComplete can be called only once per call to getRemoteService");
            this.zzcv.onPostInitHandler(arg3, arg4, arg5, this.zzcw);
            this.zzcv = null;
        }

        @BinderThread public final void zza(int arg2, @Nullable Bundle arg3) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @BinderThread public final void zza(int arg3, @NonNull IBinder arg4, @NonNull com.google.android.gms.common.internal.zzb arg5) {
            Preconditions.checkNotNull(this.zzcv, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            Preconditions.checkNotNull(arg5);
            BaseGmsClient.zza(this.zzcv, arg5);
            this.onPostInitComplete(arg3, arg4, arg5.zzcz);
        }
    }

    @VisibleForTesting public final class com.google.android.gms.common.internal.BaseGmsClient$zze implements ServiceConnection {
        private final int zzcw;

        public com.google.android.gms.common.internal.BaseGmsClient$zze(BaseGmsClient arg1, int arg2) {
            this.zzcs = arg1;
            super();
            this.zzcw = arg2;
        }

        public final void onServiceConnected(ComponentName arg5, IBinder arg6) {
            IInterface v6_2;
            Bundle v1;
            if(arg6 == null) {
                BaseGmsClient.zza(this.zzcs, 16);
                return;
            }

            Object v5 = BaseGmsClient.zza(this.zzcs);
            __monitor_enter(v5);
            try {
                BaseGmsClient v0 = this.zzcs;
                v1 = null;
                if(arg6 == null) {
                    IGmsServiceBroker v6_1 = ((IGmsServiceBroker)v1);
                }
                else {
                    IInterface v2 = arg6.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    if(v2 != null && ((v2 instanceof IGmsServiceBroker))) {
                        v6_2 = v2;
                        goto label_23;
                    }

                    com.google.android.gms.common.internal.IGmsServiceBroker$Stub$zza v6_3 = new com.google.android.gms.common.internal.IGmsServiceBroker$Stub$zza(arg6);
                }

            label_23:
                BaseGmsClient.zza(v0, ((IGmsServiceBroker)v6_2));
                __monitor_exit(v5);
            }
            catch(Throwable v6) {
                try {
                label_31:
                    __monitor_exit(v5);
                }
                catch(Throwable v6) {
                    goto label_31;
                }

                throw v6;
            }

            this.zzcs.zza(0, v1, this.zzcw);
        }

        public final void onServiceDisconnected(ComponentName arg5) {
            Object v5 = BaseGmsClient.zza(this.zzcs);
            __monitor_enter(v5);
            try {
                BaseGmsClient.zza(this.zzcs, null);
                __monitor_exit(v5);
            }
            catch(Throwable v0) {
                try {
                label_18:
                    __monitor_exit(v5);
                }
                catch(Throwable v0) {
                    goto label_18;
                }

                throw v0;
            }

            this.zzcs.mHandler.sendMessage(this.zzcs.mHandler.obtainMessage(6, this.zzcw, 1));
        }
    }

    public final class zzf extends zza {
        private final IBinder zzcx;

        @BinderThread public zzf(BaseGmsClient arg1, int arg2, IBinder arg3, Bundle arg4) {
            this.zzcs = arg1;
            super(arg1, arg2, arg4);
            this.zzcx = arg3;
        }

        protected final void zza(ConnectionResult arg2) {
            if(BaseGmsClient.zzg(this.zzcs) != null) {
                BaseGmsClient.zzg(this.zzcs).onConnectionFailed(arg2);
            }

            this.zzcs.onConnectionFailed(arg2);
        }

        protected final boolean zzm() {
            String v1;
            try {
                v1 = this.zzcx.getInterfaceDescriptor();
            }
            catch(RemoteException ) {
                Log.w("GmsClient", "service probably died");
                return 0;
            }

            if(!this.zzcs.getServiceDescriptor().equals(v1)) {
                String v3 = this.zzcs.getServiceDescriptor();
                StringBuilder v5 = new StringBuilder(String.valueOf(v3).length() + 34 + String.valueOf(v1).length());
                v5.append("service descriptor mismatch: ");
                v5.append(v3);
                v5.append(" vs. ");
                v5.append(v1);
                Log.e("GmsClient", v5.toString());
                return 0;
            }

            IInterface v1_1 = this.zzcs.createServiceInterface(this.zzcx);
            if(v1_1 != null) {
                int v4 = 4;
                if(!BaseGmsClient.zza(this.zzcs, 2, v4, v1_1) && !BaseGmsClient.zza(this.zzcs, 3, v4, v1_1)) {
                    return 0;
                }

                BaseGmsClient.zza(this.zzcs, null);
                Bundle v0 = this.zzcs.getConnectionHint();
                if(BaseGmsClient.zze(this.zzcs) != null) {
                    BaseGmsClient.zze(this.zzcs).onConnected(v0);
                }

                return 1;
            }

            return 0;
        }
    }

    public final class zzg extends zza {
        @BinderThread public zzg(BaseGmsClient arg1, @Nullable int arg2, Bundle arg3) {
            this.zzcs = arg1;
            super(arg1, arg2, null);
        }

        protected final void zza(ConnectionResult arg2) {
            this.zzcs.zzce.onReportServiceBinding(arg2);
            this.zzcs.onConnectionFailed(arg2);
        }

        protected final boolean zzm() {
            this.zzcs.zzce.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
            return 1;
        }
    }

    @KeepForSdk public static final int CONNECT_STATE_CONNECTED = 4;
    @KeepForSdk public static final int CONNECT_STATE_DISCONNECTED = 1;
    @KeepForSdk public static final int CONNECT_STATE_DISCONNECTING = 5;
    @KeepForSdk public static final String DEFAULT_ACCOUNT = "<<default account>>";
    @KeepForSdk public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = null;
    @KeepForSdk public static final String KEY_PENDING_INTENT = "pendingIntent";
    private final Context mContext;
    final Handler mHandler;
    private final Object mLock;
    private static final Feature[] zzbs;
    private int zzbt;
    private long zzbu;
    private long zzbv;
    private int zzbw;
    private long zzbx;
    @VisibleForTesting private zzh zzby;
    private final Looper zzbz;
    private final GmsClientSupervisor zzca;
    private final GoogleApiAvailabilityLight zzcb;
    private final Object zzcc;
    @GuardedBy(value="mServiceBrokerLock") private IGmsServiceBroker zzcd;
    @VisibleForTesting protected ConnectionProgressReportCallbacks zzce;
    @GuardedBy(value="mLock") private IInterface zzcf;
    private final ArrayList zzcg;
    @GuardedBy(value="mLock") private com.google.android.gms.common.internal.BaseGmsClient$zze zzch;
    @GuardedBy(value="mLock") private int zzci;
    private final BaseConnectionCallbacks zzcj;
    private final BaseOnConnectionFailedListener zzck;
    private final int zzcl;
    private final String zzcm;
    private ConnectionResult zzcn;
    private boolean zzco;
    private volatile com.google.android.gms.common.internal.zzb zzcp;
    @VisibleForTesting protected AtomicInteger zzcq;

    static {
        BaseGmsClient.zzbs = new Feature[0];
        BaseGmsClient.GOOGLE_PLUS_REQUIRED_FEATURES = new String[]{"service_esmobile", "service_googleme"};
    }

    @KeepForSdk @VisibleForTesting protected BaseGmsClient(Context arg4, Handler arg5, GmsClientSupervisor arg6, GoogleApiAvailabilityLight arg7, int arg8, BaseConnectionCallbacks arg9, BaseOnConnectionFailedListener arg10) {
        super();
        this.mLock = new Object();
        this.zzcc = new Object();
        this.zzcg = new ArrayList();
        this.zzci = 1;
        this.zzcn = null;
        this.zzco = false;
        this.zzcp = null;
        this.zzcq = new AtomicInteger(0);
        this.mContext = Preconditions.checkNotNull(arg4, "Context must not be null");
        this.mHandler = Preconditions.checkNotNull(arg5, "Handler must not be null");
        this.zzbz = arg5.getLooper();
        this.zzca = Preconditions.checkNotNull(arg6, "Supervisor must not be null");
        this.zzcb = Preconditions.checkNotNull(arg7, "API availability must not be null");
        this.zzcl = arg8;
        this.zzcj = arg9;
        this.zzck = arg10;
        this.zzcm = null;
    }

    @KeepForSdk protected BaseGmsClient(Context arg10, Looper arg11, int arg12, BaseConnectionCallbacks arg13, BaseOnConnectionFailedListener arg14, String arg15) {
        this(arg10, arg11, GmsClientSupervisor.getInstance(arg10), GoogleApiAvailabilityLight.getInstance(), arg12, Preconditions.checkNotNull(arg13), Preconditions.checkNotNull(arg14), arg15);
    }

    @KeepForSdk @VisibleForTesting protected BaseGmsClient(Context arg3, Looper arg4, GmsClientSupervisor arg5, GoogleApiAvailabilityLight arg6, int arg7, BaseConnectionCallbacks arg8, BaseOnConnectionFailedListener arg9, String arg10) {
        super();
        this.mLock = new Object();
        this.zzcc = new Object();
        this.zzcg = new ArrayList();
        this.zzci = 1;
        this.zzcn = null;
        this.zzco = false;
        this.zzcp = null;
        this.zzcq = new AtomicInteger(0);
        this.mContext = Preconditions.checkNotNull(arg3, "Context must not be null");
        this.zzbz = Preconditions.checkNotNull(arg4, "Looper must not be null");
        this.zzca = Preconditions.checkNotNull(arg5, "Supervisor must not be null");
        this.zzcb = Preconditions.checkNotNull(arg6, "API availability must not be null");
        this.mHandler = new zzb(this, arg4);
        this.zzcl = arg7;
        this.zzcj = arg8;
        this.zzck = arg9;
        this.zzcm = arg10;
    }

    @KeepForSdk public void checkAvailabilityAndConnect() {
        int v0 = this.zzcb.isGooglePlayServicesAvailable(this.mContext, this.getMinApkVersion());
        if(v0 != 0) {
            this.zza(1, null);
            this.triggerNotAvailable(new LegacyClientCallbackAdapter(this), v0, null);
            return;
        }

        this.connect(new LegacyClientCallbackAdapter(this));
    }

    @KeepForSdk protected final void checkConnected() {
        if(this.isConnected()) {
            return;
        }

        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }

    @KeepForSdk public void connect(@NonNull ConnectionProgressReportCallbacks arg2) {
        this.zzce = Preconditions.checkNotNull(arg2, "Connection progress callbacks cannot be null.");
        this.zza(2, null);
    }

    @Nullable @KeepForSdk protected abstract IInterface createServiceInterface(IBinder arg1);

    @KeepForSdk public void disconnect() {
        this.zzcq.incrementAndGet();
        ArrayList v0 = this.zzcg;
        __monitor_enter(v0);
        try {
            int v1_1 = this.zzcg.size();
            int v2;
            for(v2 = 0; v2 < v1_1; ++v2) {
                this.zzcg.get(v2).removeListener();
            }

            this.zzcg.clear();
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_28;
        }

        Object v1_2 = this.zzcc;
        __monitor_enter(v1_2);
        IGmsServiceBroker v0_1 = null;
        try {
            this.zzcd = v0_1;
            __monitor_exit(v1_2);
        }
        catch(Throwable v0_2) {
            goto label_25;
        }

        this.zza(1, ((IInterface)v0_1));
        return;
        try {
        label_25:
            __monitor_exit(v1_2);
        }
        catch(Throwable v0_2) {
            goto label_25;
        }

        throw v0_2;
        try {
        label_28:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_28;
        }

        throw v1;
    }

    @KeepForSdk public void dump(String arg8, FileDescriptor arg9, PrintWriter arg10, String[] arg11) {
        StringBuilder v6;
        String v4;
        long v0_1;
        PrintWriter v11_1;
        IGmsServiceBroker v9_1;
        IInterface v0;
        Object v9 = this.mLock;
        __monitor_enter(v9);
        try {
            int v11 = this.zzci;
            v0 = this.zzcf;
            __monitor_exit(v9);
        }
        catch(Throwable v8) {
            try {
            label_147:
                __monitor_exit(v9);
            }
            catch(Throwable v8) {
                goto label_147;
            }

            throw v8;
        }

        Object v1 = this.zzcc;
        __monitor_enter(v1);
        try {
            v9_1 = this.zzcd;
            __monitor_exit(v1);
        }
        catch(Throwable v8) {
            try {
            label_144:
                __monitor_exit(v1);
            }
            catch(Throwable v8) {
                goto label_144;
            }

            throw v8;
        }

        arg10.append(((CharSequence)arg8)).append("mConnectState=");
        switch(v11) {
            case 1: {
                arg10.print("DISCONNECTED");
                break;
            }
            case 2: {
                arg10.print("REMOTE_CONNECTING");
                break;
            }
            case 3: {
                arg10.print("LOCAL_CONNECTING");
                break;
            }
            case 4: {
                arg10.print("CONNECTED");
                break;
            }
            case 5: {
                arg10.print("DISCONNECTING");
                break;
            }
            default: {
                arg10.print("UNKNOWN");
                break;
            }
        }

        arg10.append(" mService=");
        if(v0 == null) {
            arg10.append("null");
        }
        else {
            arg10.append(this.getServiceDescriptor()).append("@").append(Integer.toHexString(System.identityHashCode(v0.asBinder())));
        }

        arg10.append(" mServiceBroker=");
        if(v9_1 == null) {
            arg10.println("null");
        }
        else {
            arg10.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(v9_1.asBinder())));
        }

        SimpleDateFormat v9_2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        long v2 = 0;
        if(this.zzbv > v2) {
            v11_1 = arg10.append(((CharSequence)arg8)).append("lastConnectedTime=");
            v0_1 = this.zzbv;
            v4 = v9_2.format(new Date(this.zzbv));
            v6 = new StringBuilder(String.valueOf(v4).length() + 21);
            v6.append(v0_1);
            v6.append(" ");
            v6.append(v4);
            v11_1.println(v6.toString());
        }

        if(this.zzbu > v2) {
            arg10.append(((CharSequence)arg8)).append("lastSuspendedCause=");
            switch(this.zzbt) {
                case 1: {
                    arg10.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                }
                case 2: {
                    arg10.append("CAUSE_NETWORK_LOST");
                    break;
                }
                default: {
                    arg10.append(String.valueOf(this.zzbt));
                    break;
                }
            }

            v11_1 = arg10.append(" lastSuspendedTime=");
            v0_1 = this.zzbu;
            v4 = v9_2.format(new Date(this.zzbu));
            v6 = new StringBuilder(String.valueOf(v4).length() + 21);
            v6.append(v0_1);
            v6.append(" ");
            v6.append(v4);
            v11_1.println(v6.toString());
        }

        if(this.zzbx > v2) {
            arg10.append(((CharSequence)arg8)).append("lastFailedStatus=").append(CommonStatusCodes.getStatusCodeString(this.zzbw));
            PrintWriter v8_1 = arg10.append(" lastFailedTime=");
            long v10 = this.zzbx;
            String v9_3 = v9_2.format(new Date(this.zzbx));
            StringBuilder v1_1 = new StringBuilder(String.valueOf(v9_3).length() + 21);
            v1_1.append(v10);
            v1_1.append(" ");
            v1_1.append(v9_3);
            v8_1.println(v1_1.toString());
        }
    }

    @KeepForSdk public Account getAccount() {
        return null;
    }

    @KeepForSdk public Feature[] getApiFeatures() {
        return BaseGmsClient.zzbs;
    }

    @Nullable @KeepForSdk public final Feature[] getAvailableFeatures() {
        com.google.android.gms.common.internal.zzb v0 = this.zzcp;
        if(v0 == null) {
            return null;
        }

        return v0.zzda;
    }

    @KeepForSdk public Bundle getConnectionHint() {
        return null;
    }

    @KeepForSdk public final Context getContext() {
        return this.mContext;
    }

    @KeepForSdk public String getEndpointPackageName() {
        if((this.isConnected()) && this.zzby != null) {
            return this.zzby.getPackageName();
        }

        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @Nullable @KeepForSdk protected String getLocalStartServiceAction() {
        return null;
    }

    @KeepForSdk public final Looper getLooper() {
        return this.zzbz;
    }

    @KeepForSdk public int getMinApkVersion() {
        return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @WorkerThread @KeepForSdk public void getRemoteService(IAccountAccessor arg4, Set arg5) {
        Object v4_3;
        Bundle v0 = this.getGetServiceRequestExtraArgs();
        GetServiceRequest v1 = new GetServiceRequest(this.zzcl);
        v1.zzdh = this.mContext.getPackageName();
        v1.zzdk = v0;
        if(arg5 != null) {
            v1.zzdj = ((Collection)arg5).toArray(new Scope[((Collection)arg5).size()]);
        }

        if(this.requiresSignIn()) {
            Account v5 = this.getAccount() != null ? this.getAccount() : new Account("<<default account>>", "com.google");
            v1.zzdl = v5;
            if(arg4 == null) {
                goto label_32;
            }

            v1.zzdi = arg4.asBinder();
        }
        else {
            if(!this.requiresAccount()) {
                goto label_32;
            }

            v1.zzdl = this.getAccount();
        }

    label_32:
        v1.zzdm = BaseGmsClient.zzbs;
        v1.zzdn = this.getApiFeatures();
        try {
            v4_3 = this.zzcc;
            __monitor_enter(v4_3);
        }
        catch(SecurityException v4) {
            goto label_66;
        }
        catch(DeadObjectException v4_1) {
            goto label_70;
        }
        catch(RuntimeException v4_2) {
            goto label_58;
        }

        try {
            if(this.zzcd != null) {
                this.zzcd.getService(new zzd(this, this.zzcq.get()), v1);
            }
            else {
                Log.w("GmsClient", "mServiceBroker is null, client disconnected");
            }

            __monitor_exit(v4_3);
            return;
        label_53:
            __monitor_exit(v4_3);
        }
        catch(Throwable v5_1) {
            goto label_53;
        }

        try {
            throw v5_1;
        }
        catch(RuntimeException v4_2) {
        label_58:
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", ((Throwable)v4_2));
            this.onPostInitHandler(8, null, null, this.zzcq.get());
            return;
        }
        catch(SecurityException v4) {
        label_66:
            throw v4;
        }
        catch(DeadObjectException v4_1) {
        label_70:
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", ((Throwable)v4_1));
            this.triggerConnectionSuspended(1);
            return;
        }
    }

    @KeepForSdk protected Set getScopes() {
        return Collections.EMPTY_SET;
    }

    @KeepForSdk public final IInterface getService() throws DeadObjectException {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zzci != 5) {
                this.checkConnected();
                boolean v1_1 = this.zzcf != null ? true : false;
                Preconditions.checkState(v1_1, "Client is connected but service is null");
                __monitor_exit(v0);
                return this.zzcf;
            }

            throw new DeadObjectException();
        label_20:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_20;
        }

        throw v1;
    }

    @Nullable @KeepForSdk public IBinder getServiceBrokerBinder() {
        Object v0 = this.zzcc;
        __monitor_enter(v0);
        try {
            if(this.zzcd == null) {
                __monitor_exit(v0);
                return null;
            }

            __monitor_exit(v0);
            return this.zzcd.asBinder();
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_12;
        }

        throw v1;
    }

    @NonNull @KeepForSdk protected abstract String getServiceDescriptor();

    @KeepForSdk public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @NonNull @KeepForSdk protected abstract String getStartServiceAction();

    @KeepForSdk protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    @KeepForSdk public boolean isConnected() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            boolean v1_1 = this.zzci == 4 ? true : false;
            __monitor_exit(v0);
            return v1_1;
        label_11:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_11;
        }

        throw v1;
    }

    @KeepForSdk public boolean isConnecting() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            boolean v1_1 = this.zzci == 2 || this.zzci == 3 ? true : false;
            __monitor_exit(v0);
            return v1_1;
        label_15:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_15;
        }

        throw v1;
    }

    @CallSuper @KeepForSdk protected void onConnectedLocked(@NonNull IInterface arg3) {
        this.zzbv = System.currentTimeMillis();
    }

    @CallSuper @KeepForSdk protected void onConnectionFailed(ConnectionResult arg3) {
        this.zzbw = arg3.getErrorCode();
        this.zzbx = System.currentTimeMillis();
    }

    @CallSuper @KeepForSdk protected void onConnectionSuspended(int arg3) {
        this.zzbt = arg3;
        this.zzbu = System.currentTimeMillis();
    }

    @KeepForSdk protected void onPostInitHandler(int arg4, IBinder arg5, Bundle arg6, int arg7) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, arg7, -1, new zzf(this, arg4, arg5, arg6)));
    }

    @KeepForSdk void onSetConnectState(int arg1, IInterface arg2) {
    }

    @KeepForSdk public void onUserSignOut(@NonNull SignOutCallbacks arg1) {
        arg1.onSignOutComplete();
    }

    @KeepForSdk public boolean providesSignIn() {
        return 0;
    }

    @KeepForSdk public boolean requiresAccount() {
        return 0;
    }

    @KeepForSdk public boolean requiresGooglePlayServices() {
        return 1;
    }

    @KeepForSdk public boolean requiresSignIn() {
        return 0;
    }

    @KeepForSdk public void triggerConnectionSuspended(int arg5) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(6, this.zzcq.get(), arg5));
    }

    @KeepForSdk @VisibleForTesting protected void triggerNotAvailable(@NonNull ConnectionProgressReportCallbacks arg4, int arg5, @Nullable PendingIntent arg6) {
        this.zzce = Preconditions.checkNotNull(arg4, "Connection progress callbacks cannot be null.");
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, this.zzcq.get(), arg5, arg6));
    }

    static ConnectionResult zza(BaseGmsClient arg0, ConnectionResult arg1) {
        arg0.zzcn = arg1;
        return arg1;
    }

    static IGmsServiceBroker zza(BaseGmsClient arg0, IGmsServiceBroker arg1) {
        arg0.zzcd = arg1;
        return arg1;
    }

    static Object zza(BaseGmsClient arg0) {
        return arg0.zzcc;
    }

    private final void zza(int arg11, IInterface arg12) {
        String v12;
        int v2 = arg11 == 4 ? 1 : 0;
        int v3 = arg12 != null ? 1 : 0;
        boolean v2_1 = v2 == v3 ? true : false;
        Preconditions.checkArgument(v2_1);
        Object v2_2 = this.mLock;
        __monitor_enter(v2_2);
        try {
            this.zzci = arg11;
            this.zzcf = arg12;
            this.onSetConnectState(arg11, arg12);
            Bundle v3_1 = null;
            switch(arg11) {
                case 1: {
                    if(this.zzch == null) {
                        goto label_134;
                    }

                    this.zzca.zza(this.getStartServiceAction(), this.getStartServicePackage(), 0x81, this.zzch, this.zzj());
                    this.zzch = ((com.google.android.gms.common.internal.BaseGmsClient$zze)v3_1);
                    break;
                }
                case 2: 
                case 3: {
                    if(this.zzch != null && this.zzby != null) {
                        v12 = this.zzby.zzt();
                        String v4 = this.zzby.getPackageName();
                        StringBuilder v6 = new StringBuilder(String.valueOf(v12).length() + 70 + String.valueOf(v4).length());
                        v6.append("Calling connect() while still connected, missing disconnect() for ");
                        v6.append(v12);
                        v6.append(" on ");
                        v6.append(v4);
                        Log.e("GmsClient", v6.toString());
                        this.zzca.zza(this.zzby.zzt(), this.zzby.getPackageName(), this.zzby.zzq(), this.zzch, this.zzj());
                        this.zzcq.incrementAndGet();
                    }

                    this.zzch = new com.google.android.gms.common.internal.BaseGmsClient$zze(this, this.zzcq.get());
                    int v4_1 = 0x81;
                    zzh v11_1 = this.zzci != 3 || this.getLocalStartServiceAction() == null ? new zzh(this.getStartServicePackage(), this.getStartServiceAction(), false, v4_1) : new zzh(this.getContext().getPackageName(), this.getLocalStartServiceAction(), true, v4_1);
                    this.zzby = v11_1;
                    if(this.zzca.zza(new com.google.android.gms.common.internal.GmsClientSupervisor$zza(this.zzby.zzt(), this.zzby.getPackageName(), this.zzby.zzq()), this.zzch, this.zzj())) {
                        goto label_134;
                    }

                    v12 = this.zzby.zzt();
                    String v0 = this.zzby.getPackageName();
                    StringBuilder v4_2 = new StringBuilder(String.valueOf(v12).length() + 34 + String.valueOf(v0).length());
                    v4_2.append("unable to connect to service: ");
                    v4_2.append(v12);
                    v4_2.append(" on ");
                    v4_2.append(v0);
                    Log.e("GmsClient", v4_2.toString());
                    this.zza(16, v3_1, this.zzcq.get());
                    break;
                }
                case 4: {
                    this.onConnectedLocked(arg12);
                    break;
                }
                default: {
                    break;
                }
            }

        label_134:
            __monitor_exit(v2_2);
            return;
        label_137:
            __monitor_exit(v2_2);
        }
        catch(Throwable v11) {
            goto label_137;
        }

        throw v11;
    }

    protected final void zza(int arg4, @Nullable Bundle arg5, int arg6) {
        this.mHandler.sendMessage(this.mHandler.obtainMessage(7, arg6, -1, new zzg(this, arg4, null)));
    }

    static void zza(BaseGmsClient arg0, int arg1) {
        arg0.zzb(16);
    }

    static void zza(BaseGmsClient arg0, int arg1, IInterface arg2) {
        arg0.zza(arg1, null);
    }

    static void zza(BaseGmsClient arg0, com.google.android.gms.common.internal.zzb arg1) {
        arg0.zza(arg1);
    }

    private final void zza(com.google.android.gms.common.internal.zzb arg1) {
        this.zzcp = arg1;
    }

    private final boolean zza(int arg3, int arg4, IInterface arg5) {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            if(this.zzci != arg3) {
                __monitor_exit(v0);
                return 0;
            }

            this.zza(arg4, arg5);
            __monitor_exit(v0);
            return 1;
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_12;
        }

        throw v3;
    }

    static boolean zza(BaseGmsClient arg0, int arg1, int arg2, IInterface arg3) {
        return arg0.zza(arg1, arg2, arg3);
    }

    private final void zzb(int arg5) {
        if(this.zzk()) {
            arg5 = 5;
            this.zzco = true;
        }
        else {
            arg5 = 4;
        }

        this.mHandler.sendMessage(this.mHandler.obtainMessage(arg5, this.zzcq.get(), 16));
    }

    static boolean zzb(BaseGmsClient arg0) {
        return arg0.zzl();
    }

    static boolean zzc(BaseGmsClient arg0) {
        return arg0.zzco;
    }

    static ConnectionResult zzd(BaseGmsClient arg0) {
        return arg0.zzcn;
    }

    static BaseConnectionCallbacks zze(BaseGmsClient arg0) {
        return arg0.zzcj;
    }

    static ArrayList zzf(BaseGmsClient arg0) {
        return arg0.zzcg;
    }

    static BaseOnConnectionFailedListener zzg(BaseGmsClient arg0) {
        return arg0.zzck;
    }

    @Nullable private final String zzj() {
        if(this.zzcm == null) {
            return this.mContext.getClass().getName();
        }

        return this.zzcm;
    }

    private final boolean zzk() {
        Object v0 = this.mLock;
        __monitor_enter(v0);
        try {
            boolean v1_1 = this.zzci == 3 ? true : false;
            __monitor_exit(v0);
            return v1_1;
        label_11:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_11;
        }

        throw v1;
    }

    private final boolean zzl() {
        if(this.zzco) {
            return 0;
        }

        if(TextUtils.isEmpty(this.getServiceDescriptor())) {
            return 0;
        }

        if(TextUtils.isEmpty(this.getLocalStartServiceAction())) {
            return 0;
        }

        try {
            Class.forName(this.getServiceDescriptor());
            return 1;
        }
        catch(ClassNotFoundException ) {
            return 0;
        }
    }
}

