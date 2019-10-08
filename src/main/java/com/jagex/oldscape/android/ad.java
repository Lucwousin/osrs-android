package com.jagex.oldscape.android;

import android.view.View$OnSystemUiVisibilityChangeListener;
import lx;

class ad implements View$OnSystemUiVisibilityChangeListener {
    ad(AndroidLauncher arg1) {
        AndroidLauncher.this = arg1;
        super();
    }

    public void ae(int arg2) {
        AndroidLauncher.this.ae(0x9C8237D8);
    }

    public void al(int arg2) {
        AndroidLauncher.this.ae(0x9C8237D8);
    }

    public void ax(int arg2) {
        AndroidLauncher.this.ae(0x9C8237D8);
    }

    public void onSystemUiVisibilityChange(int arg3) {
        try {
            AndroidLauncher.this.ae(0x9C8237D8);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ad.onSystemUiVisibilityChange(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

