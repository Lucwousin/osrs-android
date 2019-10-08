package com.jagex.oldscape.android;

import android.view.View$OnFocusChangeListener;
import android.view.View;
import lx;

class aq implements View$OnFocusChangeListener {
    aq(AndroidLauncher arg1) {
        AndroidLauncher.this = arg1;
        super();
    }

    public void al(View arg1, boolean arg2) {
        if(arg2) {
            AndroidLauncher.this.ae(0x9C8237D8);
        }
    }

    public void ax(View arg1, boolean arg2) {
        if(arg2) {
            AndroidLauncher.this.ae(0x9C8237D8);
        }
    }

    public void onFocusChange(View arg2, boolean arg3) {
        if(arg3) {
            try {
                AndroidLauncher.this.ae(0x9C8237D8);
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("com/jagex/oldscape/android/aq.onFocusChange(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }
}

