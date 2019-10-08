package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;

@KeepForSdk public class ConnectionTracker {
    private static final Object zzdp;
    private static volatile ConnectionTracker zzfa;
    @VisibleForTesting private static boolean zzfb;
    private final List zzfc;
    private final List zzfd;
    private final List zzfe;
    private final List zzff;

    static {
        ConnectionTracker.zzdp = new Object();
        ConnectionTracker.zzfb = false;
    }

    private ConnectionTracker() {
        super();
        this.zzfc = Collections.EMPTY_LIST;
        this.zzfd = Collections.EMPTY_LIST;
        this.zzfe = Collections.EMPTY_LIST;
        this.zzff = Collections.EMPTY_LIST;
    }

    @KeepForSdk public boolean bindService(Context arg8, Intent arg9, ServiceConnection arg10, int arg11) {
        return this.zza(arg8, arg8.getClass().getName(), arg9, arg10, arg11);
    }

    @KeepForSdk public static ConnectionTracker getInstance() {
        if(ConnectionTracker.zzfa == null) {
            Object v0 = ConnectionTracker.zzdp;
            __monitor_enter(v0);
            try {
                if(ConnectionTracker.zzfa == null) {
                    ConnectionTracker.zzfa = new ConnectionTracker();
                }

                __monitor_exit(v0);
                goto label_14;
            label_12:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_12;
            }

            throw v1;
        }

    label_14:
        return ConnectionTracker.zzfa;
    }

    @SuppressLint(value={"UntrackedBindService"}) @KeepForSdk public void unbindService(Context arg1, ServiceConnection arg2) {
        arg1.unbindService(arg2);
    }

    public final boolean zza(Context arg2, String arg3, Intent arg4, ServiceConnection arg5, int arg6) {
        ComponentName v3 = arg4.getComponent();
        boolean v3_1 = v3 == null ? false : ClientLibraryUtils.zzc(arg2, v3.getPackageName());
        if(v3_1) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return 0;
        }

        return arg2.bindService(arg4, arg5, arg6);
    }
}

