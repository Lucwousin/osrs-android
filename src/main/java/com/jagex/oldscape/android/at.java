package com.jagex.oldscape.android;

import lx;

class at implements Runnable {
    at(ab arg1, boolean arg2) {
        ab.this = arg1;
        this.val$keepScreenOn = arg2;
        super();
    }

    public void ae() {
        int v1 = 0x80;
        if(this.val$keepScreenOn) {
            ab.this.ar.getWindow().addFlags(v1);
        }
        else {
            ab.this.ar.getWindow().clearFlags(v1);
        }
    }

    public void al() {
        int v1 = 0x80;
        if(this.val$keepScreenOn) {
            ab.this.ar.getWindow().addFlags(v1);
        }
        else {
            ab.this.ar.getWindow().clearFlags(v1);
        }
    }

    public void ar() {
        if(this.val$keepScreenOn) {
            ab.this.ar.getWindow().addFlags(0x80);
        }
        else {
            ab.this.ar.getWindow().clearFlags(0x560CD116);
        }
    }

    public void ax() {
        int v1 = 0x80;
        if(this.val$keepScreenOn) {
            ab.this.ar.getWindow().addFlags(v1);
        }
        else {
            ab.this.ar.getWindow().clearFlags(v1);
        }
    }

    public void run() {
        try {
            int v1 = 0x80;
            if(this.val$keepScreenOn) {
                ab.this.ar.getWindow().addFlags(v1);
            }
            else {
                ab.this.ar.getWindow().clearFlags(v1);
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("com/jagex/oldscape/android/at.run(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }
}

