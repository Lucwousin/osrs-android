public class ad {
    static ko ae = null;
    public static final int ax = 1;
    static int fi;

    ad() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ad.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static boolean aa(int arg1, int arg2) {
        boolean v0 = true;
        if((arg1 >> arg2 + 1 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean ab(int arg0, int arg1) {
        boolean v1 = true;
        if((arg0 >> 0x1F & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public static boolean ac(int arg1) {
        boolean v0 = true;
        if((arg1 >> 28 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean af(int arg1) {
        boolean v0 = true;
        if((arg1 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static int ag(int arg0) {
        return arg0 >> 17 & 7;
    }

    public static int ah(int arg0) {
        return arg0 >> 17 & 7;
    }

    public static boolean ai(int arg1) {
        boolean v0 = true;
        if((arg1 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean ak(int arg1) {
        boolean v0 = true;
        if((arg1 >> 28 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean am(int arg1, int arg2) {
        boolean v0 = true;
        if((arg1 >> arg2 + 1 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static void an(byte arg2) {
        try {
            cc.aj.an(5);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ad.an(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static boolean ao(int arg1) {
        boolean v0 = true;
        if((arg1 >> 21 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean as(int arg1) {
        boolean v0 = true;
        if((arg1 >> 21 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static int at(int arg0) {
        return arg0 >> 17 & 7;
    }

    public static boolean au(int arg1, int arg2) {
        boolean v0 = true;
        if((arg1 >> arg2 + 1 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean av(int arg1) {
        boolean v0 = true;
        if((arg1 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean aw(int arg1) {
        boolean v0 = true;
        if((arg1 >> 20 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean ay(int arg1) {
        boolean v0 = true;
        if((arg1 >> 20 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static int az(int arg0) {
        return arg0 >> 11 & 0x3F;
    }

    public static boolean ba(int arg1) {
        boolean v0 = true;
        if((arg1 >> 29 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean bd(int arg1) {
        boolean v0 = true;
        if((arg1 >> 29 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean bf(int arg1) {
        boolean v0 = true;
        if((arg1 >> 30 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean bn(int arg1) {
        boolean v0 = true;
        if((arg1 >> 30 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean bo(int arg1) {
        boolean v0 = true;
        if((arg1 >> 0xE098BD6B & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean bp(int arg1) {
        boolean v0 = true;
        if((arg1 >> 0xF2E53813 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    public static boolean bw(int arg1) {
        boolean v0 = true;
        if((arg1 >> 0xF52B9971 & 1) != 0) {
        }
        else {
            v0 = false;
        }

        return v0;
    }

    static int cc(float arg1, int arg2) {
        arg2 = 0x3A8945D;
        try {
            return (((int)(arg1 * (((float)(client.hz * arg2))) + (((float)(client.ht * 0x62C4AE09)))))) & 0x7FF;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ad.cc(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static final void cd(ar arg11, int arg12, int arg13, int arg14) {
        try {
            int v0 = 0xD3A2ACB9;
            if(client.pw * v0 != 0 && client.pw * v0 != 3) {
                return;
            }

            if(dt.bu.ax == ik.ae && !fh.kf.ca(1638723250)) {
                arg14 = 1;
                ab v11_1 = arg11.au(true, 0);
                if(v11_1 == null) {
                    return;
                }
                else {
                    int v1 = dt.bu.ad[0] - arg12;
                    arg12 = dt.bu.aq[0] - arg13;
                    if(v11_1.ax(v1, arg12, 0xFDF8EDE8)) {
                        v1 -= v11_1.ax * 0xE12BFEFF / 2;
                        arg12 -= v11_1.al * -1901996617 / 2;
                        arg13 = 0x62C4AE09;
                        int v11_2 = client.ht * arg13 & 0x7FF;
                        int v3 = bt.ag[v11_2];
                        int v4 = v1 * bt.ah[v11_2] + v3 * arg12 >> 11;
                        v11_2 = bt.ah[v11_2] * arg12 - v3 * v1 >> 11;
                        int v5 = 0x914F0683;
                        v3 = v4 + gu.jg.bp * v5 >> 7;
                        int v6 = 0xD19D0C3D;
                        v11_2 = gu.jg.bw * v6 - v11_2 >> 7;
                        na v4_1 = cd.al(nf.cu, client.eh.an, -2052885209);
                        v4_1.ae.ar(18, 75);
                        v4_1.ae.an(nr.fo * 0x519F9BE7 + v11_2, 1571548102);
                        v4_1.ae.cf(ad.fi * 474770003 + v3, 1315207853);
                        lo v7 = v4_1.ae;
                        if(!dt.bu.bm(82, 0x955070C1)) {
                            arg14 = 0;
                        }
                        else if(dt.bu.bm(81, 0xA136C055)) {
                            arg14 = 2;
                        }

                        v7.ar(arg14, 20);
                        v4_1.ae.ar(v1, 67);
                        v4_1.ae.ar(arg12, 87);
                        v4_1.ae.an(client.ht * arg13, 0x1F6588EA);
                        v4_1.ae.ar(57, 94);
                        v4_1.ae.ar(0, 8);
                        v4_1.ae.ar(0, 97);
                        v4_1.ae.ar(89, 0x71);
                        v4_1.ae.an(gu.jg.bp * v5, 0xB7158AE6);
                        v4_1.ae.an(gu.jg.bw * v6, 2082899203);
                        v4_1.ae.ar(0x3F, 57);
                        client.eh.ae(v4_1, 0x8949D62F);
                        client.oc = v3 * 0xDC6E8273;
                        client.oj = v11_2 * 0xEF40F9B7;
                        dt.bu.ao(ik.au, 97);
                    }
                }
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("ad.cd(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    static void fw(ar[] arg9, ar arg10, boolean arg11, int arg12) {
        try {
            int v0 = 0x83EA0C19;
            arg12 = arg10.bb * v0 != 0 ? arg10.bb * v0 : 0x1804E4A5 * arg10.by;
            int v1 = 1153505113;
            int v7 = arg10.bc * v1 != 0 ? arg10.bc * v1 : arg10.bt * 0x6F0D2CD;
            int v8 = 971580097;
            gc.fr(arg9, arg10.ah * v8, arg12, v7, arg11, false, 0x56D563D3);
            if(arg10.fr != null) {
                gc.fr(arg10.fr, arg10.ah * v8, arg12, v7, arg11, false, 0xBB9118E2);
            }

            mx v9_1 = client.ky.ax(((long)(arg10.ah * v8)));
            if(v9_1 != null) {
                ai.ft(0x199DF2C5 * ((if)v9_1).ax, arg12, v7, arg11, false, 0x9D256AAD);
            }

            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("ad.fw(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }
}

