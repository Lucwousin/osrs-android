package com.jagex.jagex3.client.input.softkeyboard;

import java.util.List;
import lx;

class aj implements Runnable {
    aj(ar arg1, int arg2, int arg3) {
        ar.this = arg1;
        this.val$limit = arg2;
        this.val$formFieldIndex = arg3;
        super();
    }

    public void ae() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).ab(this.val$limit, 0x234550AD);
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
            if(this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).ab(this.val$limit, 0x234550AD);
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
            if(this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).ab(this.val$limit, 0x234550AD);
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
            if(this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).ab(this.val$limit, 0x234550AD);
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
            if(this.val$limit >= 0 && this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).ab(this.val$limit, 0x234550AD);
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
            v1_1.append("com/jagex/jagex3/client/input/softkeyboard/aj.run(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }
}

