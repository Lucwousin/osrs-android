package com.jagex.oldscape.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import lx;

class al extends BroadcastReceiver {
    al(ab arg1) {
        ab.this = arg1;
        super();
    }

    public void ax(Context arg4, Intent arg5) {
        ab.this.ap = arg5.getIntExtra("level", -1) * 0x62450019;
        int v4 = arg5.getIntExtra("status", -1);
        ab v5 = ab.this;
        boolean v4_1 = 2 == v4 || 5 == v4 ? true : false;
        v5.aj = v4_1;
    }

    public void onReceive(Context arg4, Intent arg5) {
        try {
            ab.this.ap = arg5.getIntExtra("level", -1) * 0x62450019;
            int v4_1 = arg5.getIntExtra("status", -1);
            ab v5 = ab.this;
            boolean v4_2 = 2 == v4_1 || 5 == v4_1 ? true : false;
            v5.aj = v4_2;
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("com/jagex/oldscape/android/al.onReceive(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }
}

