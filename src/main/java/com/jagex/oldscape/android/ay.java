package com.jagex.oldscape.android;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.jagex.oldscape.osrenderer.ax;
import lx;

class ay extends OrientationEventListener {
    WindowManager al;
    int ax;

    ay(ab arg1, Context arg2, int arg3) {
        ab.this = arg1;
        super(arg2, arg3);
    }

    public void al(int arg3) {
        if(ab.this.ar == null) {
            return;
        }

        if(this.al == null) {
            this.al = ab.this.ar.getWindowManager();
        }

        arg3 = this.al.getDefaultDisplay().getRotation();
        if(this.ax * 0x31F6A304 != arg3) {
            this.ax = arg3 * 0x207F1043;
            if((ax.ax(0x3AB4A095)) && (ax.ac(0xA7E92F56))) {
                ax.af(-2095834106);
            }
        }
    }

    public void ax(int arg3) {
        if(ab.this.ar == null) {
            return;
        }

        if(this.al == null) {
            this.al = ab.this.ar.getWindowManager();
        }

        arg3 = this.al.getDefaultDisplay().getRotation();
        if(this.ax * 0xB791BC6B != arg3) {
            this.ax = arg3 * 0x207F1043;
            if((ax.ax(0xCAFF431)) && (ax.ac(0xAA3EFC7E))) {
                ax.af(0x82AAF153);
            }
        }
    }

    public void onOrientationChanged(int arg3) {
        try {
            if(ab.this.ar == null) {
                return;
            }

            if(this.al == null) {
                this.al = ab.this.ar.getWindowManager();
            }

            arg3 = this.al.getDefaultDisplay().getRotation();
            if(this.ax * 0xB791BC6B != arg3) {
                this.ax = arg3 * 0x207F1043;
                if((ax.ax(-1907191465)) && (ax.ac(0xC8D258FC))) {
                    ax.af(0x8D8A013D);
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ay.onOrientationChanged(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

