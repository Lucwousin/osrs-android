package com.jagex.jagex3.client.input.softkeyboard;

import java.util.List;
import lx;

class an implements Runnable {
    an(ar arg1, String arg2, int arg3) {
        ar.this = arg1;
        this.val$text = arg2;
        this.val$formFieldIndex = arg3;
        super();
    }

    public void ae() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).an(this.val$text, -1254440162);
            }

            __monitor_exit(v0);
            return;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_22;
        }

        throw v1;
    }

    public void al() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).an(this.val$text, 0x5E1BE478);
            }

            __monitor_exit(v0);
            return;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_22;
        }

        throw v1;
    }

    public void ar() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).an(this.val$text, 0x88989030);
            }

            __monitor_exit(v0);
            return;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_22;
        }

        throw v1;
    }

    public void ax() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).an(this.val$text, 1219050719);
            }

            __monitor_exit(v0);
            return;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_22;
        }

        throw v1;
    }

    public void run() {
        List v0_1;
        try {
            v0_1 = ar.this.ad;
            __monitor_enter(v0_1);
        }
        catch(RuntimeException v0) {
            goto label_26;
        }

        try {
            if(this.val$text != null && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).an(this.val$text, -48507360);
            }

            __monitor_exit(v0_1);
            return;
        label_22:
            __monitor_exit(v0_1);
        }
        catch(Throwable v1) {
            goto label_22;
        }

        try {
            throw v1;
        }
        catch(RuntimeException v0) {
        label_26:
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("com/jagex/jagex3/client/input/softkeyboard/an.run(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }
}

