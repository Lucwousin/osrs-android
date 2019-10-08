package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement$OnEventListener;

final class zze implements OnEventListener {
    public zze(zzd arg1) {
        this.zzbqu = arg1;
        super();
    }

    public final void onEvent(String arg1, String arg2, Bundle arg3, long arg4) {
        if(!this.zzbqu.zzbqr.contains(arg2)) {
            return;
        }

        Bundle v1 = new Bundle();
        v1.putString("events", zzc.zzfi(arg2));
        zzd.zza(this.zzbqu).onMessageTriggered(2, v1);
    }
}

