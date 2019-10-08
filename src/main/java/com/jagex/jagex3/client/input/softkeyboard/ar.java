package com.jagex.jagex3.client.input.softkeyboard;

import fk;
import java.util.ArrayList;
import java.util.List;
import ls;
import lx;

public class ar {
    final List ad;
    public static final int ae = 1;
    final ls aj;
    public static final int al = 0;
    public static final int an = 3;
    public final ax ap;
    int aq;
    public static final int ar = 2;

    public ar(ls arg3) {
        try {
            super();
            this.ap = new ax();
            this.ad = new ArrayList();
            this.aj = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/jagex3/client/input/softkeyboard/ar.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void aa() {
        this.aj.bn(new aq(this), 71);
    }

    public void ab() {
    }

    void ac(int arg2, int arg3, byte arg4) {
        try {
            this.aj.bn(new aj(this, arg2, arg3), 106);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/jagex3/client/input/softkeyboard/ar.ac(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ad() {
    }

    public void ae(int arg1) {
    }

    public void af() {
    }

    public void ag(al arg3, int arg4) {
        List v4;
        try {
            v4 = this.ad;
            __monitor_enter(v4);
        }
        catch(RuntimeException v3) {
            goto label_15;
        }

        try {
            arg3.bu(this.ad.size(), 0xAE33DE3E);
            this.ad.add(arg3);
            __monitor_exit(v4);
            return;
        label_11:
            __monitor_exit(v4);
        }
        catch(Throwable v3_1) {
            goto label_11;
        }

        try {
            throw v3_1;
        }
        catch(RuntimeException v3) {
        label_15:
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("com/jagex/jagex3/client/input/softkeyboard/ar.ag(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public void ah(fk arg2, int arg3) {
        try {
            this.ap.ax(arg2, -1);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/jagex3/client/input/softkeyboard/ar.ah(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ai() {
    }

    public void aj() {
    }

    public void ak(int arg2, int arg3) {
        byte v0 = -72;
        try {
            this.ac(arg2, 0, v0);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/jagex3/client/input/softkeyboard/ar.ak(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void al(int arg1) {
    }

    public void am(int arg2, int arg3) {
        arg3 = 0x1F252F1 * arg2;
        try {
            this.aq = arg3;
            this.aj.bn(new ap(this, arg2), 110);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/jagex3/client/input/softkeyboard/ar.am(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void an(int arg3) {
        try {
            this.aj.bn(new aq(this), 19);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/jagex3/client/input/softkeyboard/ar.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ao(String arg2, int arg3) {
        int v0 = 0xBCC75A33;
        try {
            this.as(arg2, 0, v0);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/jagex3/client/input/softkeyboard/ar.ao(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ap() {
    }

    public void aq() {
    }

    public void ar(int arg1) {
    }

    public void as(String arg2, int arg3, int arg4) {
        try {
            this.aj.bn(new an(this, arg2, arg3), 105);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/jagex3/client/input/softkeyboard/ar.as(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void at(int arg3) {
        int v0 = -15054452;
        try {
            this.ay(0, v0);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/jagex3/client/input/softkeyboard/ar.at(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public void au() {
        this.aj.bn(new aq(this), 53);
    }

    public void av() {
    }

    public int aw(int arg4) {
        int v0;
        List v4_1;
        try {
            v4_1 = this.ad;
            __monitor_enter(v4_1);
            v0 = 0;
        }
        catch(RuntimeException v4) {
            goto label_23;
        }

        try {
            while(v0 < this.ad.size()) {
                if(this.ad.get(v0).ap(0xDD2D9D16)) {
                    __monitor_exit(v4_1);
                    return v0;
                }

                ++v0;
            }

            __monitor_exit(v4_1);
            return -1;
        label_19:
            __monitor_exit(v4_1);
        }
        catch(Throwable v0_1) {
            goto label_19;
        }

        try {
            throw v0_1;
        }
        catch(RuntimeException v4) {
        label_23:
            StringBuilder v0_2 = new StringBuilder();
            v0_2.append("com/jagex/jagex3/client/input/softkeyboard/ar.aw(");
            v0_2.append(')');
            throw lx.al(((Throwable)v4), v0_2.toString());
        }
    }

    public void ax(byte arg1) {
    }

    public void ay(int arg2, int arg3) {
        try {
            this.aj.bn(new ae(this, arg2), 49);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/jagex3/client/input/softkeyboard/ar.ay(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int az(int arg3) {
        try {
            return this.aq * 0xC3B45E11;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/jagex3/client/input/softkeyboard/ar.az(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ba(int arg3) {
        this.aq = 0x1F252F1 * arg3;
        this.aj.bn(new ap(this, arg3), 55);
    }

    public int bb() {
        List v0 = this.ad;
        __monitor_enter(v0);
        int v1 = 0;
        try {
            while(v1 < this.ad.size()) {
                if(this.ad.get(v1).ap(0x606407C2)) {
                    __monitor_exit(v0);
                    return v1;
                }

                ++v1;
            }

            __monitor_exit(v0);
            int v0_1 = -1;
            return v0_1;
        label_19:
            __monitor_exit(((List)v0_1));
        }
        catch(Throwable v1_1) {
            goto label_19;
        }

        throw v1_1;
    }

    public int bc() {
        List v0 = this.ad;
        __monitor_enter(v0);
        int v1 = 0;
        try {
            while(v1 < this.ad.size()) {
                if(this.ad.get(v1).ap(116220338)) {
                    __monitor_exit(v0);
                    return v1;
                }

                ++v1;
            }

            __monitor_exit(v0);
            int v0_1 = -1;
            return v0_1;
        label_19:
            __monitor_exit(((List)v0_1));
        }
        catch(Throwable v1_1) {
            goto label_19;
        }

        throw v1_1;
    }

    public void bd(int arg3) {
        try {
            this.aj.bn(new ad(this), 0x6F);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/jagex3/client/input/softkeyboard/ar.bd(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void be(String arg3, int arg4) {
        this.aj.bn(new an(this, arg3, arg4), 77);
    }

    public int bf() {
        return this.aq * 0xC3B45E11;
    }

    public void bg() {
        this.ay(0, 1050823928);
    }

    public int bh() {
        List v0 = this.ad;
        __monitor_enter(v0);
        int v1 = 0;
        try {
            while(v1 < this.ad.size()) {
                if(this.ad.get(v1).ap(0x27009AE8)) {
                    __monitor_exit(v0);
                    return v1;
                }

                ++v1;
            }

            __monitor_exit(v0);
            int v0_1 = -1;
            return v0_1;
        label_19:
            __monitor_exit(((List)v0_1));
        }
        catch(Throwable v1_1) {
            goto label_19;
        }

        throw v1_1;
    }

    public void bi(int arg3) {
        this.ac(arg3, 0, -66);
    }

    public void bj(String arg3) {
        this.as(arg3, 0, 0xAD483A21);
    }

    public int bk() {
        List v0 = this.ad;
        __monitor_enter(v0);
        int v1 = 0;
        try {
            while(v1 < this.ad.size()) {
                if(this.ad.get(v1).ap(0x42C0C5C1)) {
                    __monitor_exit(v0);
                    return v1;
                }

                ++v1;
            }

            __monitor_exit(v0);
            int v0_1 = -1;
            return v0_1;
        label_19:
            __monitor_exit(v0);
        }
        catch(Throwable v1_1) {
            goto label_19;
        }

        throw v1_1;
    }

    public void bl(String arg3, int arg4) {
        this.aj.bn(new an(this, arg3, arg4), 86);
    }

    public void bm(String arg3) {
        this.as(arg3, 0, 0xA57CBB9D);
    }

    public int bn() {
        return this.aq * 0xC3B45E11;
    }

    public void bo(al arg4) {
        List v0 = this.ad;
        __monitor_enter(v0);
        try {
            arg4.bu(this.ad.size(), 0xA6F17FA2);
            this.ad.add(arg4);
            __monitor_exit(v0);
            return;
        label_11:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_11;
        }

        throw v4;
    }

    public int bp() {
        return this.aq * 0xC3B45E11;
    }

    public void bq(fk arg3) {
        this.ap.ax(arg3, -47);
    }

    public void br(int arg3) {
        this.ac(arg3, 0, -72);
    }

    public void bs(String arg3, int arg4) {
        this.aj.bn(new an(this, arg3, arg4), 40);
    }

    public void bt(fk arg3) {
        this.ap.ax(arg3, -3);
    }

    public void bu(String arg3) {
        this.as(arg3, 0, 0x8BFBB38D);
    }

    public void bv(fk arg3) {
        this.ap.ax(arg3, 16);
    }

    public int bw() {
        return this.aq * 0xC3B45E11;
    }

    public void bx() {
        this.ay(0, 0xFB624A20);
    }

    public void by(al arg4) {
        List v0 = this.ad;
        __monitor_enter(v0);
        try {
            arg4.bu(this.ad.size(), 0x209AC344);
            this.ad.add(arg4);
            __monitor_exit(v0);
            return;
        label_11:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_11;
        }

        throw v4;
    }

    public void bz() {
        this.ay(0, 0xD2746BBE);
    }

    public void ca(int arg3) {
        this.ac(arg3, 0, -42);
    }

    void cd(int arg3, int arg4) {
        this.aj.bn(new aj(this, arg3, arg4), 0x79);
    }

    public void cf() {
        this.aj.bn(new ad(this), 93);
    }

    void cj(int arg3, int arg4) {
        this.aj.bn(new aj(this, arg3, arg4), 56);
    }
}

