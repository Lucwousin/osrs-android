package com.jagex.oldscape.android;

import com.jagex.jagex3.client.input.softkeyboard.al;
import com.jagex.jagex3.client.input.softkeyboard.ar;
import ls;
import lx;

public class ae extends ar {
    final AndroidLauncher ax;

    ae(AndroidLauncher arg1, int arg2, ls arg3) {
        try {
            super(arg3);
            this.ax = arg1;
            this.am(arg2, 0x96E434EE);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/ae.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void aa() {
        super.an(0xD21DC9D7);
        this.ax.getSystemService("input_method").hideSoftInputFromWindow(this.ax.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void ab() {
        this.ag(new ba(this.ax, this.ap, -859420725, 6), 0x4A421C60);
    }

    public void ad() {
        this.ag(new ba(this.ax, this.ap, 2, 6), 0x7E9BD865);
    }

    public void ae(int arg5) {
        try {
            this.ag(new ba(this.ax, this.ap, 1, 6), 0x3A9C99A2);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ae.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }
    }

    public void af() {
        this.ag(new ba(this.ax, this.ap, 0x16CA01B3, 6), 0x30267924);
    }

    public void ai() {
        this.ag(new ba(this.ax, this.ap, 33, 6), 0x1D504E96);
    }

    public void aj() {
        this.ag(new ba(this.ax, this.ap, 2, 6), 1655942800);
    }

    public void al(int arg5) {
        try {
            this.ag(new ba(this.ax, this.ap, 2, 6), 0x382FCC15);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ae.al(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }
    }

    public void an(int arg3) {
        arg3 = 0xD21DC9D7;
        try {
            super.an(arg3);
            this.ax.getSystemService("input_method").hideSoftInputFromWindow(this.ax.getWindow().getDecorView().getWindowToken(), 0);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ae.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ap() {
        ba v1 = new ba(this.ax, this.ap, 33, 5);
        ba v2 = new ba(this.ax, this.ap, 0x81, 6);
        v1.ae(0xF7F729AF);
        v2.ar(0x380498CA);
        this.ag(((al)v1), 1438399170);
        this.ag(((al)v2), 0x6EC94FCC);
    }

    public void aq() {
        this.ag(new ba(this.ax, this.ap, 1, 6), 1313704106);
    }

    public void ar(int arg5) {
        arg5 = 33;
        try {
            this.ag(new ba(this.ax, this.ap, arg5, 6), 1419009828);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ae.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }
    }

    public void au() {
        super.an(0xD21DC9D7);
        this.ax.getSystemService("input_method").hideSoftInputFromWindow(this.ax.getWindow().getDecorView().getWindowToken(), 0);
    }

    public void av() {
        this.ag(new ba(this.ax, this.ap, 33, 6), 0x220B061E);
    }

    public void ax(byte arg6) {
        int v6 = 33;
        int v0 = 0x81;
        try {
            ba v1 = new ba(this.ax, this.ap, v6, 5);
            ba v6_2 = new ba(this.ax, this.ap, v0, 6);
            v1.ae(0xF7F729AF);
            v6_2.ar(-41365810);
            this.ag(((al)v1), 0x684959D0);
            this.ag(((al)v6_2), 0x6A5FB491);
            return;
        }
        catch(RuntimeException v6_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/oldscape/android/ae.ax(");
            v0_1.append(')');
            throw lx.al(((Throwable)v6_1), v0_1.toString());
        }
    }
}

