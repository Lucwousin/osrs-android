package com.google.android.gms.stats;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.stats.WakeLockTracker;

@KeepForSdk @ShowFirstParty public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    private static String TAG = "GCoreWakefulBroadcastReceiver";

    static {
    }

    public GCoreWakefulBroadcastReceiver() {
        super();
    }

    @SuppressLint(value={"UnwrappedWakefulBroadcastReceiver"}) @KeepForSdk public static boolean completeWakefulIntent(Context arg3, Intent arg4) {
        if(arg4 == null) {
            return 0;
        }

        if(arg3 != null) {
            WakeLockTracker.getInstance().registerReleaseEvent(arg3, arg4);
        }
        else {
            String v3 = GCoreWakefulBroadcastReceiver.TAG;
            String v1 = "context shouldn\'t be null. intent: ";
            String v0 = String.valueOf(arg4.toUri(0));
            v0 = v0.length() != 0 ? v1.concat(v0) : new String(v1);
            Log.w(v3, v0);
        }

        return WakefulBroadcastReceiver.completeWakefulIntent(arg4);
    }
}

