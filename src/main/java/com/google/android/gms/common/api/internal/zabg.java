package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zal;

final class zabg extends zal {
    zabg(zabe arg1, Looper arg2) {
        this.zahu = arg1;
        super(arg2);
    }

    public final void handleMessage(Message arg4) {
        switch(arg4.what) {
            case 1: {
                goto label_15;
            }
            case 2: {
                goto label_13;
            }
        }

        int v4 = arg4.what;
        StringBuilder v2 = new StringBuilder(0x1F);
        v2.append("Unknown message id: ");
        v2.append(v4);
        Log.w("GACStateManager", v2.toString());
        return;
    label_13:
        throw arg4.obj;
    label_15:
        arg4.obj.zac(this.zahu);
    }
}

