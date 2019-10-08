package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class zabq extends BroadcastReceiver {
    private Context mContext;
    private final zabr zajh;

    public zabq(zabr arg1) {
        super();
        this.zajh = arg1;
    }

    public final void onReceive(Context arg1, Intent arg2) {
        Uri v1 = arg2.getData();
        if(v1 != null) {
            String v1_1 = v1.getSchemeSpecificPart();
        }
        else {
            Object v1_2 = null;
        }

        if("com.google.android.gms".equals(v1_1)) {
            this.zajh.zas();
            this.unregister();
        }
    }

    public final void unregister() {
        __monitor_enter(this);
        try {
            if(this.mContext != null) {
                this.mContext.unregisterReceiver(((BroadcastReceiver)this));
            }

            this.mContext = null;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    public final void zac(Context arg1) {
        this.mContext = arg1;
    }
}

