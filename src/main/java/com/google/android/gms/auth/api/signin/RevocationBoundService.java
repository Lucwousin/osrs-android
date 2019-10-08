package com.google.android.gms.auth.api.signin;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.zzw;

public final class RevocationBoundService extends Service {
    public RevocationBoundService() {
        super();
    }

    public final IBinder onBind(Intent arg4) {
        String v4;
        String v1;
        String v0;
        if(!"com.google.android.gms.auth.api.signin.RevocationBoundService.disconnect".equals(arg4.getAction())) {
            if("com.google.android.gms.auth.api.signin.RevocationBoundService.clearClientState".equals(arg4.getAction())) {
            }
            else {
                v0 = "RevocationService";
                v1 = "Unknown action sent to RevocationBoundService: ";
                v4 = String.valueOf(arg4.getAction());
                v4 = v4.length() != 0 ? v1.concat(v4) : new String(v1);
                Log.w(v0, v4);
                return null;
            }
        }

        if(Log.isLoggable("RevocationService", 2)) {
            v0 = "RevocationService";
            v1 = "RevocationBoundService handling ";
            v4 = String.valueOf(arg4.getAction());
            v4 = v4.length() != 0 ? v1.concat(v4) : new String(v1);
            Log.v(v0, v4);
        }

        return new zzw(((Context)this));
    }
}

