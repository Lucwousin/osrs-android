package com.jagex.oldscape.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import lx;

class az extends BroadcastReceiver {
    az(ab arg1) {
        ab.this = arg1;
        super();
    }

    public void ax(Context arg2, Intent arg3) {
        ab.this.al(arg2, 0x95B4A17F);
    }

    public void onReceive(Context arg2, Intent arg3) {
        try {
            ab.this.al(arg2, 0x910A6C55);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/az.onReceive(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

