package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;

final class zza extends AsyncTask {
    zza(Context arg1, ProviderInstallListener arg2) {
        this.val$context = arg1;
        this.zziw = arg2;
        super();
    }

    protected final Object doInBackground(Object[] arg1) {
        return this.zza(((Void[])arg1));
    }

    protected final void onPostExecute(Object arg5) {
        if(((Integer)arg5).intValue() == 0) {
            this.zziw.onProviderInstalled();
            return;
        }

        this.zziw.onProviderInstallFailed(((Integer)arg5).intValue(), ProviderInstaller.zzak().getErrorResolutionIntent(this.val$context, ((Integer)arg5).intValue(), "pi"));
    }

    private final Integer zza(Void[] arg1) {
        try {
            ProviderInstaller.installIfNeeded(this.val$context);
        }
        catch(GooglePlayServicesNotAvailableException v1) {
            return Integer.valueOf(v1.errorCode);
        }
        catch(GooglePlayServicesRepairableException v1_1) {
            return Integer.valueOf(v1_1.getConnectionStatusCode());
        }

        return Integer.valueOf(0);
    }
}

