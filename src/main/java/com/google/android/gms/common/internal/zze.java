package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;

final class zze extends GmsClientSupervisor implements Handler$Callback {
    private final Handler mHandler;
    @GuardedBy(value="mConnectionStatus") private final HashMap zzdu;
    private final Context zzdv;
    private final ConnectionTracker zzdw;
    private final long zzdx;
    private final long zzdy;

    zze(Context arg3) {
        super();
        this.zzdu = new HashMap();
        this.zzdv = arg3.getApplicationContext();
        this.mHandler = new com.google.android.gms.internal.common.zze(arg3.getMainLooper(), ((Handler$Callback)this));
        this.zzdw = ConnectionTracker.getInstance();
        this.zzdx = 5000;
        this.zzdy = 300000;
    }

    public final boolean handleMessage(Message arg8) {
        Object v2;
        Object v8_1;
        switch(arg8.what) {
            case 0: {
                goto label_42;
            }
            case 1: {
                goto label_5;
            }
        }

        return 0;
    label_5:
        HashMap v0 = this.zzdu;
        __monitor_enter(v0);
        try {
            v8_1 = arg8.obj;
            v2 = this.zzdu.get(v8_1);
            if(v2 != null && ((zzf)v2).getState() == 3) {
                String v4 = String.valueOf(v8_1);
                StringBuilder v6 = new StringBuilder(String.valueOf(v4).length() + 0x2F);
                v6.append("Timeout waiting for ServiceConnection callback ");
                v6.append(v4);
                Log.wtf("GmsClientSupervisor", v6.toString(), new Exception());
                ComponentName v3 = ((zzf)v2).getComponentName();
                if(v3 == null) {
                    v3 = ((zza)v8_1).getComponentName();
                }

                if(v3 == null) {
                    v3 = new ComponentName(((zza)v8_1).getPackage(), "unknown");
                }

                ((zzf)v2).onServiceDisconnected(v3);
            }

            __monitor_exit(v0);
            return 1;
        label_40:
            __monitor_exit(v0);
        }
        catch(Throwable v8) {
            goto label_40;
        }

        throw v8;
    label_42:
        v0 = this.zzdu;
        __monitor_enter(v0);
        try {
            v8_1 = arg8.obj;
            v2 = this.zzdu.get(v8_1);
            if(v2 != null && (((zzf)v2).zzr())) {
                if(((zzf)v2).isBound()) {
                    ((zzf)v2).zzf("GmsClientSupervisor");
                }

                this.zzdu.remove(v8_1);
            }

            __monitor_exit(v0);
            return 1;
        label_59:
            __monitor_exit(v0);
        }
        catch(Throwable v8) {
            goto label_59;
        }

        throw v8;
    }

    static HashMap zza(zze arg0) {
        return arg0.zzdu;
    }

    protected final boolean zza(zza arg5, ServiceConnection arg6, String arg7) {
        Preconditions.checkNotNull(arg6, "ServiceConnection must not be null");
        HashMap v0 = this.zzdu;
        __monitor_enter(v0);
        try {
            Object v1 = this.zzdu.get(arg5);
            if(v1 == null) {
                zzf v1_1 = new zzf(this, arg5);
                v1_1.zza(arg6, arg7);
                v1_1.zze(arg7);
                this.zzdu.put(arg5, v1_1);
            }
            else {
                this.mHandler.removeMessages(0, arg5);
                if(!((zzf)v1).zza(arg6)) {
                    ((zzf)v1).zza(arg6, arg7);
                    switch(((zzf)v1).getState()) {
                        case 1: {
                            goto label_25;
                        }
                        case 2: {
                            goto label_23;
                        }
                    }

                    goto label_28;
                label_23:
                    ((zzf)v1).zze(arg7);
                    goto label_28;
                label_25:
                    arg6.onServiceConnected(((zzf)v1).getComponentName(), ((zzf)v1).getBinder());
                }
                else {
                    goto label_31;
                }
            }

        label_28:
            __monitor_exit(v0);
            return ((zzf)v1).isBound();
        label_31:
            String v5_1 = String.valueOf(arg5);
            StringBuilder v1_2 = new StringBuilder(String.valueOf(v5_1).length() + 81);
            v1_2.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
            v1_2.append(v5_1);
            throw new IllegalStateException(v1_2.toString());
        label_45:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_45;
        }

        throw v5;
    }

    static Handler zzb(zze arg0) {
        return arg0.mHandler;
    }

    protected final void zzb(zza arg4, ServiceConnection arg5, String arg6) {
        StringBuilder v1_1;
        String v4_1;
        Preconditions.checkNotNull(arg5, "ServiceConnection must not be null");
        HashMap v0 = this.zzdu;
        __monitor_enter(v0);
        try {
            Object v1 = this.zzdu.get(arg4);
            if(v1 != null) {
                if(((zzf)v1).zza(arg5)) {
                    ((zzf)v1).zzb(arg5, arg6);
                    if(((zzf)v1).zzr()) {
                        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(0, arg4), this.zzdx);
                    }

                    __monitor_exit(v0);
                    return;
                }

                v4_1 = String.valueOf(arg4);
                v1_1 = new StringBuilder(String.valueOf(v4_1).length() + 76);
                v1_1.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                v1_1.append(v4_1);
                throw new IllegalStateException(v1_1.toString());
            }

            v4_1 = String.valueOf(arg4);
            v1_1 = new StringBuilder(String.valueOf(v4_1).length() + 50);
            v1_1.append("Nonexistent connection status for service config: ");
            v1_1.append(v4_1);
            throw new IllegalStateException(v1_1.toString());
        label_47:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_47;
        }

        throw v4;
    }

    static Context zzc(zze arg0) {
        return arg0.zzdv;
    }

    static ConnectionTracker zzd(zze arg0) {
        return arg0.zzdw;
    }

    static long zze(zze arg2) {
        return arg2.zzdy;
    }
}

