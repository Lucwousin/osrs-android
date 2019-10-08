package com.google.firebase.iid;

import android.content.BroadcastReceiver$PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class zzh implements ServiceConnection {
    private final Context zzac;
    private final Intent zzad;
    private final ScheduledExecutorService zzae;
    private final Queue zzaf;
    private zzf zzag;
    @GuardedBy(value="this") private boolean zzah;

    public zzh(Context arg4, String arg5) {
        this(arg4, arg5, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    @VisibleForTesting private zzh(Context arg2, String arg3, ScheduledExecutorService arg4) {
        super();
        this.zzaf = new ArrayDeque();
        this.zzah = false;
        this.zzac = arg2.getApplicationContext();
        this.zzad = new Intent(arg3).setPackage(this.zzac.getPackageName());
        this.zzae = arg4;
    }

    public final void onServiceConnected(ComponentName arg4, IBinder arg5) {
        __monitor_enter(this);
        try {
            if(Log.isLoggable("EnhancedIntentService", 3)) {
                String v4_1 = String.valueOf(arg4);
                StringBuilder v2 = new StringBuilder(String.valueOf(v4_1).length() + 20);
                v2.append("onServiceConnected: ");
                v2.append(v4_1);
                Log.d("EnhancedIntentService", v2.toString());
            }

            this.zzah = false;
            if((arg5 instanceof zzf)) {
                goto label_36;
            }

            String v5 = String.valueOf(arg5);
            StringBuilder v1 = new StringBuilder(String.valueOf(v5).length() + 28);
            v1.append("Invalid service connection: ");
            v1.append(v5);
            Log.e("EnhancedIntentService", v1.toString());
            this.zze();
        }
        catch(Throwable v4) {
            goto label_41;
        }

        __monitor_exit(this);
        return;
        try {
        label_36:
            this.zzag = ((zzf)arg5);
            this.zzd();
        }
        catch(Throwable v4) {
        label_41:
            __monitor_exit(this);
            throw v4;
        }

        __monitor_exit(this);
    }

    public final void onServiceDisconnected(ComponentName arg4) {
        if(Log.isLoggable("EnhancedIntentService", 3)) {
            String v4 = String.valueOf(arg4);
            StringBuilder v2 = new StringBuilder(String.valueOf(v4).length() + 23);
            v2.append("onServiceDisconnected: ");
            v2.append(v4);
            Log.d("EnhancedIntentService", v2.toString());
        }

        this.zzd();
    }

    public final void zza(Intent arg4, BroadcastReceiver$PendingResult arg5) {
        __monitor_enter(this);
        try {
            if(Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "new intent queued in the bind-strategy delivery");
            }

            this.zzaf.add(new zzd(arg4, arg5, this.zzae));
            this.zzd();
        }
        catch(Throwable v4) {
            __monitor_exit(this);
            throw v4;
        }

        __monitor_exit(this);
    }

    private final void zzd() {
        __monitor_enter(this);
        try {
            int v1 = 3;
            if(Log.isLoggable("EnhancedIntentService", v1)) {
                Log.d("EnhancedIntentService", "flush queue called");
            }

            while(true) {
                if(this.zzaf.isEmpty()) {
                    goto label_72;
                }

                if(Log.isLoggable("EnhancedIntentService", v1)) {
                    Log.d("EnhancedIntentService", "found intent to be delivered");
                }

                if(this.zzag != null && (this.zzag.isBinderAlive())) {
                    if(Log.isLoggable("EnhancedIntentService", v1)) {
                        Log.d("EnhancedIntentService", "binder is alive, sending the intent.");
                    }

                    this.zzag.zza(this.zzaf.poll());
                    continue;
                }

                break;
            }

            if(Log.isLoggable("EnhancedIntentService", v1)) {
                int v2 = this.zzah ^ 1;
                StringBuilder v4 = new StringBuilder(39);
                v4.append("binder is dead. start connection? ");
                v4.append(((boolean)v2));
                Log.d("EnhancedIntentService", v4.toString());
            }

            if(this.zzah) {
                goto label_70;
            }

            this.zzah = true;
            try {
                if(!ConnectionTracker.getInstance().bindService(this.zzac, this.zzad, ((ServiceConnection)this), 65)) {
                    goto label_59;
                }
            }
            catch(SecurityException v0_1) {
                goto label_64;
            }
        }
        catch(Throwable v0) {
            goto label_75;
        }

        __monitor_exit(this);
        return;
        try {
        label_59:
            Log.e("EnhancedIntentService", "binding to the service failed");
            goto label_67;
        }
        catch(Throwable v0) {
        label_75:
            __monitor_exit(this);
            throw v0;
        }
        catch(SecurityException v0_1) {
            try {
            label_64:
                Log.e("EnhancedIntentService", "Exception while binding the service", ((Throwable)v0_1));
            label_67:
                this.zzah = false;
                this.zze();
            }
            catch(Throwable v0) {
                goto label_75;
            }

        label_70:
            __monitor_exit(this);
            return;
        label_72:
            __monitor_exit(this);
            return;
        }
    }

    @GuardedBy(value="this") private final void zze() {
        while(!this.zzaf.isEmpty()) {
            this.zzaf.poll().finish();
        }
    }
}

