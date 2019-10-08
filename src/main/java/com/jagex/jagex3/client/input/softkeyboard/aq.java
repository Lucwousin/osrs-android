package com.jagex.jagex3.client.input.softkeyboard;

import java.util.Iterator;
import java.util.List;
import lx;

class aq implements Runnable {
    aq(ar arg1) {
        ar.this = arg1;
        super();
    }

    public void ae() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().aq(-25480);
            }

            ar.this.ad.clear();
            __monitor_exit(v0);
            return;
        label_18:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_18;
        }

        throw v1;
    }

    public void al() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().aq(-32108);
            }

            ar.this.ad.clear();
            __monitor_exit(v0);
            return;
        label_18:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_18;
        }

        throw v1;
    }

    public void ar() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().aq(-2294);
            }

            ar.this.ad.clear();
            __monitor_exit(v0);
            return;
        label_18:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_18;
        }

        throw v1;
    }

    public void ax() {
        List v0 = ar.this.ad;
        __monitor_enter(v0);
        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().aq(-1329);
            }

            ar.this.ad.clear();
            __monitor_exit(v0);
            return;
        label_18:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_18;
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
            goto label_22;
        }

        try {
            Iterator v1_1 = ar.this.ad.iterator();
            while(v1_1.hasNext()) {
                v1_1.next().aq(-25532);
            }

            ar.this.ad.clear();
            __monitor_exit(v0_1);
            return;
        label_18:
            __monitor_exit(v0_1);
        }
        catch(Throwable v1) {
            goto label_18;
        }

        try {
            throw v1;
        }
        catch(RuntimeException v0) {
        label_22:
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append("com/jagex/jagex3/client/input/softkeyboard/aq.run(");
            v1_2.append(')');
            throw lx.al(((Throwable)v0), v1_2.toString());
        }
    }
}

