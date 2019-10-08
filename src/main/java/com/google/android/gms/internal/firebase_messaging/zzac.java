package com.google.android.gms.internal.firebase_messaging;

import android.os.Bundle;

public final class zzac {
    static String zza(Bundle arg2, String arg3) {
        String v0 = arg2.getString(arg3);
        if(v0 == null) {
            v0 = arg2.getString(arg3.replace("gcm.n.", "gcm.notification."));
        }

        return v0;
    }

    public static boolean zzj(Bundle arg2) {
        if(!"1".equals(zzac.zza(arg2, "gcm.n.e"))) {
            if(zzac.zza(arg2, "gcm.n.icon") != null) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }
}

