package com.jagex.oldscape.android;

import android.app.AlertDialog$Builder;
import gs;
import lx;

class aw implements Runnable {
    aw(ab arg1, String arg2, String arg3) {
        ab.this = arg1;
        this.val$title = arg2;
        this.val$message = arg3;
        super();
    }

    public void ae() {
        new AlertDialog$Builder(ab.this.ar).setTitle(this.val$title).setMessage(this.val$message).setPositiveButton(gs.an, null).create().show();
    }

    public void al() {
        new AlertDialog$Builder(ab.this.ar).setTitle(this.val$title).setMessage(this.val$message).setPositiveButton(gs.an, null).create().show();
    }

    public void ar() {
        new AlertDialog$Builder(ab.this.ar).setTitle(this.val$title).setMessage(this.val$message).setPositiveButton(gs.an, null).create().show();
    }

    public void ax() {
        new AlertDialog$Builder(ab.this.ar).setTitle(this.val$title).setMessage(this.val$message).setPositiveButton(gs.an, null).create().show();
    }

    public void run() {
        try {
            new AlertDialog$Builder(ab.this.ar).setTitle(this.val$title).setMessage(this.val$message).setPositiveButton(gs.an, null).create().show();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/aw.run(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

