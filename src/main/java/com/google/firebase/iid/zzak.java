package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzak {
    final int what;
    final int zzcj;
    final TaskCompletionSource zzck;
    final Bundle zzcl;

    zzak(int arg2, int arg3, Bundle arg4) {
        super();
        this.zzck = new TaskCompletionSource();
        this.zzcj = arg2;
        this.what = arg3;
        this.zzcl = arg4;
    }

    final void finish(Object arg6) {
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            String v1 = String.valueOf(this);
            String v2 = String.valueOf(arg6);
            StringBuilder v4 = new StringBuilder(String.valueOf(v1).length() + 16 + String.valueOf(v2).length());
            v4.append("Finishing ");
            v4.append(v1);
            v4.append(" with ");
            v4.append(v2);
            Log.d("MessengerIpcClient", v4.toString());
        }

        this.zzck.setResult(arg6);
    }

    public String toString() {
        int v0 = this.what;
        int v1 = this.zzcj;
        boolean v2 = this.zzab();
        StringBuilder v3 = new StringBuilder(55);
        v3.append("Request { what=");
        v3.append(v0);
        v3.append(" id=");
        v3.append(v1);
        v3.append(" oneWay=");
        v3.append(v2);
        v3.append("}");
        return v3.toString();
    }

    final void zza(zzal arg6) {
        if(Log.isLoggable("MessengerIpcClient", 3)) {
            String v1 = String.valueOf(this);
            String v2 = String.valueOf(arg6);
            StringBuilder v4 = new StringBuilder(String.valueOf(v1).length() + 14 + String.valueOf(v2).length());
            v4.append("Failing ");
            v4.append(v1);
            v4.append(" with ");
            v4.append(v2);
            Log.d("MessengerIpcClient", v4.toString());
        }

        this.zzck.setException(((Exception)arg6));
    }

    abstract boolean zzab();

    abstract void zzb(Bundle arg1);
}

