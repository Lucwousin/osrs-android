package com.jagex.oldscape.android;

import java.io.OutputStream;
import java.io.PrintStream;
import lx;

class af extends PrintStream {
    af(AndroidLauncher arg1, OutputStream arg2) {
        AndroidLauncher.this = arg1;
        super(arg2);
    }

    public void ax(String arg3) {
        super.println("com.jagex.oldscape: " + arg3);
    }

    public void println(String arg3) {
        try {
            super.println("com.jagex.oldscape: " + arg3);
            return;
        }
        catch(RuntimeException v3) {
            v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/af.println(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

