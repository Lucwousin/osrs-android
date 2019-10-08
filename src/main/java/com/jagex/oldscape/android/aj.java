package com.jagex.oldscape.android;

import android.content.Intent;
import lc;
import le;
import lv;
import lx;

public class aj {
    String[] ae;
    String al;
    String ax;

    aj() {
        try {
            super();
            this.ax = "";
            this.al = "";
            this.ae = new String[0];
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/aj.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    lv ae(Intent arg2) {
        if(arg2.hasExtra("click_action")) {
            this.ax = arg2.getStringExtra("click_action");
        }

        if(arg2.hasExtra("click_action_params")) {
            this.al = arg2.getStringExtra("click_action_params");
            this.ae = this.al.split(" ");
        }

        if(this.ax.equalsIgnoreCase("newsAction")) {
            return new lc(this.ae);
        }

        return new le();
    }

    lv al(Intent arg2) {
        if(arg2.hasExtra("click_action")) {
            this.ax = arg2.getStringExtra("click_action");
        }

        if(arg2.hasExtra("click_action_params")) {
            this.al = arg2.getStringExtra("click_action_params");
            this.ae = this.al.split(" ");
        }

        if(this.ax.equalsIgnoreCase("newsAction")) {
            return new lc(this.ae);
        }

        return new le();
    }

    lv ar(Intent arg2) {
        if(arg2.hasExtra("click_action")) {
            this.ax = arg2.getStringExtra("click_action");
        }

        if(arg2.hasExtra("click_action_params")) {
            this.al = arg2.getStringExtra("click_action_params");
            this.ae = this.al.split(" ");
        }

        if(this.ax.equalsIgnoreCase("newsAction")) {
            return new lc(this.ae);
        }

        return new le();
    }

    lv ax(Intent arg2, int arg3) {
        try {
            if(arg2.hasExtra("click_action")) {
                this.ax = arg2.getStringExtra("click_action");
            }

            if(arg2.hasExtra("click_action_params")) {
                this.al = arg2.getStringExtra("click_action_params");
                this.ae = this.al.split(" ");
            }

            if(this.ax.equalsIgnoreCase("newsAction")) {
                return new lc(this.ae);
            }

            return new le();
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/aj.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

