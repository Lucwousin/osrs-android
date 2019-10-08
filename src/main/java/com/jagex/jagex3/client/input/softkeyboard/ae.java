package com.jagex.jagex3.client.input.softkeyboard;

import java.util.List;
import lx;

class ae implements Runnable {
    ae(ar arg1, int arg2) {
        ar.this = arg1;
        this.val$formFieldIndex = arg2;
        super();
    }

    public void ae() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).aj(1703316203);
            }

            __monitor_exit(v0);
            return;
        label_19:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_19;
        }

        throw v1;
    }

    public void al() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).aj(0x70BFB282);
            }

            __monitor_exit(v0);
            return;
        label_19:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_19;
        }

        throw v1;
    }

    public void ar() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).aj(1408920462);
            }

            __monitor_exit(v0);
            return;
        label_19:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_19;
        }

        throw v1;
    }

    public void ax() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            if(this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).aj(0x60541E7A);
            }

            __monitor_exit(v0);
            return;
        label_19:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_19;
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
            goto label_23;
        }

        try {
            if(this.val$formFieldIndex >= 0 && this.val$formFieldIndex < ar.this.ad.size()) {
                ar.this.ad.get(this.val$formFieldIndex).aj(0x6EB19EFC);
            }

            __monitor_exit(v0_1);
            return;
        label_19:
            __monitor_exit(v0_1);
        }
        catch(Throwable v1) {
            goto label_19;
        }

        try {
            throw v1;
        }
        catch(RuntimeException v0) {
        label_23:
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("com/jagex/jagex3/client/input/softkeyboard/ae.run(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }
}

