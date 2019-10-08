package com.jagex.jagex3.client.input.softkeyboard;

import java.util.Iterator;
import java.util.List;
import lx;

class ad implements Runnable {
    ad(ar arg1) {
        ar.this = arg1;
        super();
    }

    public void ae() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().ad(7);
            }

            __monitor_exit(v0);
            return;
        label_15:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_15;
        }

        throw v1;
    }

    public void al() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().ad(-68);
            }

            __monitor_exit(v0);
            return;
        label_15:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_15;
        }

        throw v1;
    }

    public void ar() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().ad(0x1F);
            }

            __monitor_exit(v0);
            return;
        label_15:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_15;
        }

        throw v1;
    }

    public void ax() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().ad(18);
            }

            __monitor_exit(v0);
            return;
        label_15:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_15;
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
            goto label_19;
        }

        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().ad(-116);
            }

            __monitor_exit(v0_1);
            return;
        label_15:
            __monitor_exit(v0_1);
        }
        catch(Throwable v1) {
            goto label_15;
        }

        try {
            throw v1;
        }
        catch(RuntimeException v0) {
        label_19:
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append("com/jagex/jagex3/client/input/softkeyboard/ad.run(");
            v1_2.append(')');
            throw lx.al(((Throwable)v0), v1_2.toString());
        }
    }
}

