package com.jagex.oldscape.android;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import la;
import lx;

public class ax implements la {
    final Activity ax;

    ax(Activity arg3) {
        try {
            super();
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ax.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ae(String arg3, boolean arg4) {
        try {
            this.ax.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(arg3)));
            return;
        }
        catch(ActivityNotFoundException ) {
            return;
        }
    }

    public void al(String arg3, boolean arg4) {
        try {
            this.ax.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(arg3)));
            return;
        }
        catch(ActivityNotFoundException ) {
            return;
        }
    }

    public void ar(String arg3, boolean arg4) {
        try {
            this.ax.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(arg3)));
            return;
        }
        catch(ActivityNotFoundException ) {
            return;
        }
    }

    public void ax(String arg2, boolean arg3, int arg4) {
        try {
            this.ax.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(arg2)));
            return;
        }
        catch(ActivityNotFoundException ) {
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ax.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

