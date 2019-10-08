import java.util.Collection;

public class dc extends mv {
    static final int ac = 5;
    char ae;
    static final int ag = 0x20000;
    static gk al = null;
    public String an;
    boolean ap;
    public int ar;
    static ko ax = null;
    static final int sk = 4;

    static {
        dc.al = new gk(0x40, null);
    }

    dc() {
        try {
            super();
            this.ap = true;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dc.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-97);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, 0x2F7AEE8A);
        }
    }

    public static dc ab(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dc.al.ax(v1);
        if(v0 != null) {
            return ((dc)v0);
        }

        byte[] v5 = dc.ax.ae(11, arg5, 0x78DC0DC9);
        dc v0_1 = new dc();
        if(v5 != null) {
            v0_1.ar(new lq(v5), 353704099);
        }

        v0_1.ae(14);
        dc.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public static void ad(ko arg0) {
        dc.ax = arg0;
    }

    void ae(byte arg1) {
    }

    public static dc af(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dc.al.ax(v1);
        if(v0 != null) {
            return ((dc)v0);
        }

        byte[] v5 = dc.ax.ae(11, arg5, 0x78DC0DC9);
        dc v0_1 = new dc();
        if(v5 != null) {
            v0_1.ar(new lq(v5), 0x81ADF778);
        }

        v0_1.ae(14);
        dc.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    static int ag(int arg2, hl arg3, boolean arg4, byte arg5) {
        int[] v2_1;
        try {
            int[] v3 = il.aj;
            int v5 = 0x4A90AB9;
            int v4 = il.ad - v5;
            il.ad = v4;
            int v0 = 1304812425;
            ar v3_1 = bl.al(v3[v4 * v0], 0x64D7CF4D);
            if(2500 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + v5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bw * 0xAFCF1FA3;
                return 1;
            }

            if(2501 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + v5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bo * 0xA8B630B5;
                return 1;
            }

            if(2502 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + v5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.by * 0x1804E4A5;
                return 1;
            }

            if(2503 == arg2) {
                v2_1 = il.aj;
                v4 = il.ad + v5;
                il.ad = v4;
                v2_1[v4 * v0 - 1] = v3_1.bt * 0x6F0D2CD;
                return 1;
            }

            if(arg2 == 2504) {
                v2_1 = il.aj;
                v4 = il.ad + v5;
                il.ad = v4;
                v4 = v4 * v0 - 1;
                int v3_2 = v3_1.bg ? 1 : 0;
                v2_1[v4] = v3_2;
                return 1;
            }

            if(arg2 != 2505) {
                return 2;
            }

            v2_1 = il.aj;
            v4 = il.ad + v5;
            il.ad = v4;
            v2_1[v4 * v0 - 1] = v3_1.bx * 0xBA6F66AD;
            return 1;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_3 = new StringBuilder();
            v3_3.append("dc.ag(");
            v3_3.append(')');
            throw lx.al(((Throwable)v2), v3_3.toString());
        }

        return 2;
    }

    public static void ag(Collection arg1) {
        arg1.add(dc.al);
    }

    public static void ah(Collection arg1) {
        arg1.add(dc.al);
    }

    void ai() {
    }

    public boolean am() {
        boolean v0 = this.ae == 0x73 ? true : false;
        return v0;
    }

    void an(lq arg1, int arg2, int arg3) {
        if(1 == arg2) {
            arg2 = -1215098345;
            try {
                this.ae = eo.ae(arg1.aw(arg2), 1210725156);
                return;
            label_10:
                if(2 == arg2) {
                    this.ar = arg1.ac(38) * -2102232745;
                }
                else if(arg2 == 4) {
                    this.ap = false;
                }
                else if(arg2 == 5) {
                    this.an = arg1.bn(59);
                    return;
                label_9:
                    goto label_29;
                }
            }
            catch(RuntimeException v1) {
                goto label_9;
            }
        }
        else {
            goto label_10;
        label_29:
            StringBuilder v2 = new StringBuilder();
            v2.append("dc.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean ap(int arg3) {
        try {
            if(this.ae != 0x73) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dc.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    public static void aq(ko arg0) {
        dc.ax = arg0;
    }

    void ar(lq arg2, int arg3) {
        while(true) {
            byte v3 = -13;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.an(arg2, arg3, 56500885);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dc.ar(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    void au(lq arg2, int arg3) {
        if(1 == arg3) {
            this.ae = eo.ae(arg2.aw(-1215098345), 1111017540);
        }
        else if(2 == arg3) {
            this.ar = arg2.ac(0x7D) * -2102232745;
        }
        else if(arg3 == 4) {
            this.ap = false;
        }
        else if(arg3 == 5) {
            this.an = arg2.bn(0x3F);
        }
    }

    void av() {
    }

    public static void ax(ko arg0, ko arg1, byte arg2) {
        try {
            dt.ax = arg0;
            hy.al = arg1;
            dt.ae = dt.ax.au(3, 0xF5FE7E84) * 600511677;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dc.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static kt ax(ko arg0, int arg1, int arg2) {
        arg2 = 0x28A42A6F;
        try {
            byte[] v0_1 = arg0.ab(arg1, arg2);
            if(v0_1 == null) {
                return null;
            }

            return new kt(v0_1);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dc.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void ay(int arg10, byte arg11) {
        try {
            int v0 = 0x498EF1C3;
            if(client.ac * v0 == arg10) {
                return;
            }

            if(client.ac * v0 == 0) {
                client.al.adb(0x293E43C9);
            }

            int v11 = 45;
            int v1 = 40;
            int v2 = 20;
            if(arg10 == v2 || arg10 == v1 || v11 == arg10) {
                client.dn = 0;
                client.dx = 0;
                client.di = 0;
                client.fa.ae(arg10, 0x2E3859CF);
                if(arg10 == v11) {
                    if(hp.ea.ai(1)) {
                        hp.ea.ar(true, 0xAE3DFBF8);
                    }
                    else {
                        hp.ea.al(hq.co, true, 2004307659);
                    }

                    ew.bc(false, 0x6E8A2677);
                }
            }

            if(v2 != arg10 && arg10 != v1 && client.ec != null) {
                client.ec.an();
                client.ec = null;
            }

            if(client.ac * v0 == 25) {
                client.fq = 0;
                client.fx = 0;
                client.fn = 0x7B50FF35;
                client.fm = 0;
                client.ff = -600042795;
            }

            if(5 == arg10 || 10 == arg10) {
                if.ae(ey.db, eo.dh, true, 0, client.al.uu.ax(0xFB16F65B), 0x4BC83839);
            }
            else {
                v11 = 11;
                if(v2 == arg10) {
                    int v7 = v11 == client.ac * v0 ? 4 : 0;
                    if.ae(ey.db, eo.dh, true, v7, client.al.uu.ax(635950016), 2056733395);
                }
                else {
                    if(v11 == arg10) {
                        if.ae(ey.db, eo.dh, false, 4, client.al.uu.ax(0x982C0D84), 1739223900);
                        goto label_111;
                    }

                    kw.aj(-29);
                    client.al.acx(dt.bu, 0xDFFF65CF);
                }
            }

        label_111:
            client.ac = arg10 * -334199061;
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11_1 = new StringBuilder();
            v11_1.append("dc.ay(");
            v11_1.append(')');
            throw lx.al(((Throwable)v10), v11_1.toString());
        }
    }

    public boolean az() {
        boolean v0 = this.ae == 0x73 ? true : false;
        return v0;
    }

    static iz bf(int arg2) {
        try {
            if(client.rv != null) {
                int v0 = 0x4CFB637B;
                if(client.rx * v0 >= client.rv.size()) {
                }
                else {
                    return client.rv.get(client.rx * v0);
                }
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dc.bf(");
            v0_1.append(')');
            throw lx.al(((Throwable)v2), v0_1.toString());
        }

        return null;
    }

    static int bx(int arg12, hl arg13, boolean arg14, int arg15) {
        com.jagex.jagex3.client.input.softkeyboard.ar v12_5;
        int[] v3_1;
        String[] v15;
        dc v14_1;
        int v10;
        String[] v12_3;
        String[] v13_2;
        int[] v13_1;
        ih v12_2;
        int v14 = 0;
        arg15 = 0x4A90AB9;
        int v0 = 1304812425;
        if(6500 != arg12) {
            goto label_20;
        }

        try {
            int[] v12_1 = il.aj;
            int v13 = il.ad + arg15;
            il.ad = v13;
            v13 = v13 * v0 - 1;
            if(fl.ax(129708000)) {
                v14 = 1;
            }

            v12_1[v13] = v14;
            return 1;
        label_20:
            int v2 = 0x98D051C9;
            int v3 = -479634605;
            int v4 = 0xA45F5417;
            int v5 = -1;
            int v6 = 0xBBB22DD;
            int v7 = 0xBC5CDEAD;
            int v8 = 0x8FA23525;
            if(arg12 == 6501) {
                v12_2 = ox.ad(330748328);
                if(v12_2 != null) {
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.af * v6;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.ai * v4;
                    v13_2 = il.aq;
                    v14 = ft.ab + v8;
                    ft.ab = v14;
                    v13_2[v14 * v7 - 1] = v12_2.au;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.am * v3;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.av * v2;
                    v13_2 = il.aq;
                    v14 = ft.ab + v8;
                    ft.ab = v14;
                    v13_2[v14 * v7 - 1] = v12_2.aa;
                }
                else {
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = v5;
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_3 = il.aq;
                    v13 = ft.ab + v8;
                    ft.ab = v13;
                    v12_3[v13 * v7 - 1] = "";
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_3 = il.aq;
                    v13 = ft.ab + v8;
                    ft.ab = v13;
                    v12_3[v13 * v7 - 1] = "";
                }

                return 1;
            }

            if(6502 == arg12) {
                v12_2 = ev.aq(-7);
                if(v12_2 != null) {
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.af * v6;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.ai * v4;
                    v13_2 = il.aq;
                    v14 = ft.ab + v8;
                    ft.ab = v14;
                    v13_2[v14 * v7 - 1] = v12_2.au;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.am * v3;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.av * v2;
                    v13_2 = il.aq;
                    v14 = ft.ab + v8;
                    ft.ab = v14;
                    v13_2[v14 * v7 - 1] = v12_2.aa;
                }
                else {
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = v5;
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_3 = il.aq;
                    v13 = ft.ab + v8;
                    ft.ab = v13;
                    v12_3[v13 * v7 - 1] = "";
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_3 = il.aq;
                    v13 = ft.ab + v8;
                    ft.ab = v13;
                    v12_3[v13 * v7 - 1] = "";
                }

                return 1;
            }

            int v9 = 0x6DE6A9AD;
            if(arg12 == 6506) {
                v12_1 = il.aj;
                v13 = il.ad - arg15;
                il.ad = v13;
                arg12 = v12_1[v13 * v0];
                ih v13_3 = null;
                v10 = 0;
                while(v10 < ih.ap * v9) {
                    if(ew.an[v10].af * v6 == arg12) {
                        v13_3 = ew.an[v10];
                    }
                    else {
                        ++v10;
                        continue;
                    }

                    break;
                }

                if(v13_3 != null) {
                    v12_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v12_1[v14 * v0 - 1] = v13_3.af * v6;
                    v12_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v12_1[v14 * v0 - 1] = v13_3.ai * v4;
                    v12_3 = il.aq;
                    v14 = ft.ab + v8;
                    ft.ab = v14;
                    v12_3[v14 * v7 - 1] = v13_3.au;
                    v12_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v12_1[v14 * v0 - 1] = v13_3.am * v3;
                    v12_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v12_1[v14 * v0 - 1] = v13_3.av * v2;
                    v12_3 = il.aq;
                    v14 = ft.ab + v8;
                    ft.ab = v14;
                    v12_3[v14 * v7 - 1] = v13_3.aa;
                }
                else {
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = v5;
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_3 = il.aq;
                    v13 = ft.ab + v8;
                    ft.ab = v13;
                    v12_3[v13 * v7 - 1] = "";
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_3 = il.aq;
                    v13 = ft.ab + v8;
                    ft.ab = v13;
                    v12_3[v13 * v7 - 1] = "";
                }

                return 1;
            }

            v10 = 2;
            if(arg12 == 6507) {
                il.ad -= 0x12A42AE4;
                arg12 = il.aj[il.ad * v0];
                boolean v13_4 = 1 == il.aj[il.ad * v0 + 1] ? true : false;
                arg15 = il.aj[il.ad * v0 + v10];
                if(il.aj[il.ad * v0 + 3] == 1) {
                    arg14 = true;
                }

                gs.ar(arg12, v13_4, arg15, arg14, -618024210);
                return 1;
            }

            if(arg12 == 0x196F) {
                v12_1 = il.aj;
                v13 = il.ad - arg15;
                il.ad = v13;
                arg12 = v12_1[v13 * v0];
                if(arg12 < 0 || arg12 >= ih.ap * v9) {
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = v5;
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_3 = il.aq;
                    v13 = ft.ab + v8;
                    ft.ab = v13;
                    v12_3[v13 * v7 - 1] = "";
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = 0;
                    v12_3 = il.aq;
                    v13 = ft.ab + v8;
                    ft.ab = v13;
                    v12_3[v13 * v7 - 1] = "";
                }
                else {
                    v12_2 = ew.an[arg12];
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.af * v6;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.ai * v4;
                    v13_2 = il.aq;
                    v14 = ft.ab + v8;
                    ft.ab = v14;
                    v13_2[v14 * v7 - 1] = v12_2.au;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.am * v3;
                    v13_1 = il.aj;
                    v14 = il.ad + arg15;
                    il.ad = v14;
                    v13_1[v14 * v0 - 1] = v12_2.av * v2;
                    v13_2 = il.aq;
                    v14 = ft.ab + v8;
                    ft.ab = v14;
                    v13_2[v14 * v7 - 1] = v12_2.aa;
                }

                return 1;
            }

            if(0x1970 == arg12) {
                fw v12_4 = fh.kf;
                v13_1 = il.aj;
                v2 = il.ad - arg15;
                il.ad = v2;
                if(v13_1[v2 * v0] == 1) {
                    arg14 = true;
                }

                v12_4.cb(arg14, 756045400);
                return 1;
            }

            v2 = 1495630439;
            v3 = 0x9521572;
            if(arg12 == 6513) {
                il.ad -= v3;
                arg12 = il.aj[il.ad * v0];
                v13 = il.aj[il.ad * v0 + 1];
                v14_1 = dm.al(v13, 0x56F4C6BE);
                if(v14_1.ap(0x94FACE27)) {
                    v15 = il.aq;
                    v0 = ft.ab + v8;
                    ft.ab = v0;
                    v15[v0 * v7 - 1] = au.al(arg12, 1).af(v13, v14_1.an, 0x2F7A1C38);
                }
                else {
                    v3_1 = il.aj;
                    v4 = il.ad + arg15;
                    il.ad = v4;
                    v3_1[v4 * v0 - 1] = au.al(arg12, 1).ab(v13, v14_1.ar * v2, 0x8DDF7D83);
                }

                return 1;
            }

            if(arg12 == 6514) {
                il.ad -= v3;
                arg12 = il.aj[il.ad * v0];
                v13 = il.aj[il.ad * v0 + 1];
                v14_1 = dm.al(v13, 0x6FB1234B);
                if(v14_1.ap(0xE5D1260D)) {
                    v15 = il.aq;
                    v0 = ft.ab + v8;
                    ft.ab = v0;
                    v15[v0 * v7 - 1] = ok.al(arg12, 0xE175DCDB).aa(v13, v14_1.an, -122);
                }
                else {
                    v3_1 = il.aj;
                    v4 = il.ad + arg15;
                    il.ad = v4;
                    v3_1[v4 * v0 - 1] = ok.al(arg12, 0x11ADAEBF).av(v13, v14_1.ar * v2, 0x7F0600DA);
                }

                return 1;
            }

            if(6515 == arg12) {
                il.ad -= v3;
                arg12 = il.aj[il.ad * v0];
                v13 = il.aj[il.ad * v0 + 1];
                v14_1 = dm.al(v13, 1182036808);
                if(v14_1.ap(0xDB17CD1C)) {
                    v15 = il.aq;
                    v0 = ft.ab + v8;
                    ft.ab = v0;
                    v15[v0 * v7 - 1] = client.al(arg12, 505844174).ah(v13, v14_1.an, 0x305AAA6F);
                }
                else {
                    v3_1 = il.aj;
                    v4 = il.ad + arg15;
                    il.ad = v4;
                    v3_1[v4 * v0 - 1] = client.al(arg12, 0x744F68E5).ag(v13, v14_1.ar * v2, 0x3B569E8B);
                }

                return 1;
            }

            if(6516 == arg12) {
                il.ad -= v3;
                arg12 = il.aj[il.ad * v0];
                v13 = il.aj[il.ad * v0 + 1];
                v14_1 = dm.al(v13, 0xE9C706AE);
                if(v14_1.ap(-1563827050)) {
                    v15 = il.aq;
                    v0 = ft.ab + v8;
                    ft.ab = v0;
                    v15[v0 * v7 - 1] = hu.al(arg12, 0xA037B810).aj(v13, v14_1.an, 1998302057);
                }
                else {
                    v3_1 = il.aj;
                    v4 = il.ad + arg15;
                    il.ad = v4;
                    v3_1[v4 * v0 - 1] = hu.al(arg12, -2014408929).ap(v13, v14_1.ar * v2, -24548);
                }

                return 1;
            }

            if(6518 == arg12) {
                v12_1 = il.aj;
                v13 = il.ad + arg15;
                il.ad = v13;
                v13 = v13 * v0 - 1;
                if(client.al.au) {
                    v14 = 1;
                }

                v12_1[v13] = v14;
                return 1;
            }

            if(6519 == arg12) {
                v12_1 = il.aj;
                v13 = il.ad + arg15;
                il.ad = v13;
                v12_1[v13 * v0 - 1] = client.al.abd(0x63629FF7) & 3;
                return 1;
            }

            if(arg12 != 6520) {
                if(6522 == arg12) {
                }
                else if(arg12 == 6521) {
                    client.al.aba(0x6E200041).gc(0x378B3F14);
                    return 1;
                }
                else if(arg12 == 6523) {
                    v12_5 = client.al.aba(0x5397E80A).az(1, 0x3310F9D5);
                    v13_2 = il.aq;
                    v14 = ft.ab - v8;
                    ft.ab = v14;
                    String v13_5 = v13_2[v14 * v7];
                    if(ie.av(((CharSequence)v13_5), -78)) {
                        v12_5.ao(v13_5, 0x8AC3215C);
                        v13_1 = il.aj;
                        v14 = il.ad - arg15;
                        il.ad = v14;
                        v12_5.ak(v13_1[v14 * v0], 0xDDEFCC11);
                        v12_5.at(-1337608024);
                        return 1;
                    }
                    else {
                        throw new IllegalArgumentException();
                    }
                }
                else if(arg12 == 6524) {
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = client.al.aba(387669067).aq(0x600A7D39);
                    return 1;
                }
                else if(6525 == arg12) {
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v12_1[v13 * v0 - 1] = client.al.aba(0x3B2DF773).ab(0x5B3EA2AF);
                    return 1;
                }
                else if(6526 == arg12) {
                    v12_1 = il.aj;
                    v13 = il.ad + arg15;
                    il.ad = v13;
                    v13 = v13 * v0 - 1;
                    if(client.al.aba(0x1D03EFD1).af(0x513287F6)) {
                        v14 = 1;
                    }

                    v12_1[v13] = v14;
                    return 1;
                }
                else {
                    return v10;
                }
            }

            v12_5 = client.al.aba(0xD0E017C5).az(v10, 0x3310F9D5);
            v13_2 = il.aq;
            v14 = ft.ab - v8;
            ft.ab = v14;
            v12_5.ao(v13_2[v14 * v7], -2059158570);
            v13_1 = il.aj;
            v14 = il.ad - arg15;
            il.ad = v14;
            v12_5.ak(v13_1[v14 * v0], 0xDDEFCC11);
            v12_5.at(-2039703181);
            return 1;
        label_19:
        }
        catch(RuntimeException v12) {
            goto label_19;
        }

        StringBuilder v13_6 = new StringBuilder();
        v13_6.append("dc.bx(");
        v13_6.append(')');
        throw lx.al(((Throwable)v12), v13_6.toString());
    }
}

