package com.google.firebase.iid;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.TimeUnit;

final class zzag implements Runnable {
    private final zzad zzcg;

    zzag(zzad arg1) {
        super();
        this.zzcg = arg1;
    }

    public final void run() {
        Object v1_1;
        int v2;
        zzad v0 = this.zzcg;
        while(true) {
            __monitor_enter(v0);
            try {
                v2 = 2;
                if(v0.state != v2) {
                    __monitor_exit(v0);
                    return;
                }

                if(v0.zzcd.isEmpty()) {
                    v0.zzz();
                    __monitor_exit(v0);
                    return;
                }

                v1_1 = v0.zzcd.poll();
                v0.zzce.put(((zzak)v1_1).zzcj, v1_1);
                zzab.zzb(v0.zzcf).schedule(new zzah(v0, ((zzak)v1_1)), 30, TimeUnit.SECONDS);
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                break;
            }

            if(Log.isLoggable("MessengerIpcClient", 3)) {
                String v4 = String.valueOf(v1_1);
                StringBuilder v6 = new StringBuilder(String.valueOf(v4).length() + 8);
                v6.append("Sending ");
                v6.append(v4);
                Log.d("MessengerIpcClient", v6.toString());
            }

            Context v3 = zzab.zza(v0.zzcf);
            Messenger v4_1 = v0.zzcb;
            Message v5 = Message.obtain();
            v5.what = ((zzak)v1_1).what;
            v5.arg1 = ((zzak)v1_1).zzcj;
            v5.replyTo = v4_1;
            Bundle v4_2 = new Bundle();
            v4_2.putBoolean("oneWay", ((zzak)v1_1).zzab());
            v4_2.putString("pkg", v3.getPackageName());
            v4_2.putBundle("data", ((zzak)v1_1).zzcl);
            v5.setData(v4_2);
            try {
                v0.zzcc.send(v5);
            }
            catch(RemoteException v1_2) {
                v0.zza(v2, v1_2.getMessage());
            }
        }

        try {
        label_71:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_71;
        }

        throw v1;
    }
}

