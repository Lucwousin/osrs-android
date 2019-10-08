import java.util.Collection;

public class dd extends mv {
    int aa;
    public int ab;
    public int ad;
    static gk ae = null;
    public int af;
    public int ai;
    static ko al = null;
    public int am;
    public int an;
    static final int ap = 70;
    public int aq;
    static gk ar = null;
    public int au;
    int av;
    static ko ax = null;
    static String do = null;
    static ki ds = null;
    static final int es = 8;

    static {
        dd.ae = new gk(0x40, null);
        dd.ar = new gk(0x40, null);
    }

    dd() {
        try {
            super();
            this.ad = 0xF1701761;
            this.aq = 0xCB171D41;
            this.ab = 143092641;
            this.af = 0x2A0EA801;
            this.ai = -2009483050;
            this.av = 1035659401;
            this.aa = 0xAA10CEB3;
            this.au = 0x37FB8F2E;
            this.am = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dd.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg2, int arg3) {
        if(arg3 == 1) {
            arg2.ao(0x841B63B);
        }
        else if(arg3 == 2) {
            this.ad = arg2.ay(-110) * 0x2617879F;
        }
        else if(arg3 == 3) {
            this.aq = arg2.ay(-123) * 0x12059DBC;
        }
        else if(4 == arg3) {
            this.ab = 0;
        }
        else if(5 == arg3) {
            this.ai = arg2.ao(0xE4C9B2FB) * 0xEC00D319;
        }
        else if(6 == arg3) {
            arg2.ay(-119);
        }
        else if(7 == arg3) {
            this.av = arg2.bq(-485057405) * 0xDB92104E;
        }
        else if(arg3 == 8) {
            this.aa = arg2.bq(0xBFBA0739) * 0x55EF314D;
        }
        else if(11 == arg3) {
            this.ab = arg2.ao(0xA71AA4A0) * 0xC72EDDA1;
        }
        else if(14 == arg3) {
            this.au = arg2.ay(-19) * 0x20DD6E85;
        }
        else if(15 == arg3) {
            this.am = arg2.ay(-39) * 0xE247273D;
        }
    }

    public static dd ab(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dd.ae.ax(v1);
        if(v0 != null) {
            return ((dd)v0);
        }

        byte[] v5 = dd.ax.ae(33, arg5, 0x78DC0DC9);
        dd v0_1 = new dd();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0xF816BF90);
        }

        dd.ae.ae(((mv)v0_1), v1);
        return v0_1;
    }

    static final void ad(lo arg20, int arg21, hw arg22, int arg23, int arg24) {
        int v18;
        int v16;
        int v5;
        int v6;
        int v4;
        int v3;
        int v2_1;
        int v7;
        lo v0 = arg20;
        hw v10 = arg22;
        int v11 = arg23;
        int v12 = -2077001153;
        byte v13 = 2;
        if((v11 & 8) != 0) {
            byte v2 = -5;
            try {
                int v9 = v0.ay(v2);
                int v8 = 0x7FFF;
                if(v9 > 0) {
                    v7 = 0;
                    while(v7 < v9) {
                        v2_1 = v0.by(12700);
                        if(v8 == v2_1) {
                            v2_1 = v0.by(0x43ED);
                            v3 = v0.by(10854);
                            v4 = v0.by(20898);
                            v6 = v0.by(23201);
                            v5 = v4;
                            v4 = v3;
                            goto label_36;
                        }
                        else if(0x7FFE != v2_1) {
                            v4 = v0.by(0x28B0);
                            v5 = -1;
                            v6 = -1;
                        label_36:
                            v3 = v2_1;
                        }
                        else {
                            v3 = -1;
                            v4 = -1;
                            v5 = -1;
                            v6 = -1;
                        }

                        arg22.bl(v3, v4, v5, v6, client.bj * v12, v0.by(0x4349), 7);
                        ++v7;
                        v9 = v9;
                        v8 = 0x7FFF;
                    }
                }

                int v14 = 0x7FFF;
                v9 = v0.bl(v13);
                if(v9 > 0) {
                    v8 = 0;
                    while(v8 < v9) {
                        v3 = v0.by(0x592F);
                        v5 = v0.by(22055);
                        if(v14 != v5) {
                            v6 = v0.by(27009);
                            v7 = v0.be(0);
                            v16 = v5 > 0 ? v0.be(0) : v7;
                            v18 = v8;
                            v8 = v16;
                            v16 = v9;
                            arg22.br(v3, client.bj * v12, v5, v6, v7, v8, -769304979);
                        }
                        else {
                            v18 = v8;
                            v16 = v9;
                            v10.bi(v3, 964107592);
                        }

                        v8 = v18 + 1;
                        v9 = v16;
                    }
                }

            label_96:
                byte v14_1 = (v11 & 0x400) != 0 ? v0.bi(645446250) : -1;
                v3 = 0xFFFF;
                if((v11 & 4) != 0) {
                    v2_1 = v0.ao(1796873806);
                    if(v2_1 == v3) {
                        v2_1 = -1;
                    }

                    jb.cm(v10, v2_1, v0.be(0), 810630885);
                }

                if((v11 & 0x40) != 0) {
                    v2_1 = v0.cb(-71);
                    lh v5_1 = eh.ax(dj.al(0xA0BC49BC), v0.bl(v13), 0x67378DFA);
                    boolean v6_1 = v0.br(0x68D05C15) == 1 ? true : false;
                    v7 = v0.ay(-106);
                    v8 = v0.ar * 0xF24F550B;
                    if(v10.ax != null && v10.al != null) {
                        v9 = !((gc)v5_1).ab || !ds.rq.aj(v10.ax, -18572) ? 0 : 1;
                        if(v9 != 0) {
                            goto label_234;
                        }

                        if(client.jn * 359259607 != 0) {
                            goto label_234;
                        }

                        if(v10.ao) {
                            goto label_234;
                        }

                        ho.au.ar = 0;
                        v0.cl(ho.au.ae, 0, v7, 1);
                        ho.au.ar = 0;
                        String v9_1 = od.ad(ap.au(cd.ae(ho.au, -1859265051), 2012108861));
                        v10.bm = v9_1.trim();
                        v10.be = (v2_1 >> 8) * 0x4E88A893;
                        v10.bl = (v2_1 & 0xFF) * 0xBC059B71;
                        v10.bs = -1639783094;
                        v10.bj = v6_1;
                        boolean v2_2 = v10 == gu.jg || !((gc)v5_1).ab || client.og == "" || v9_1.toLowerCase().indexOf(client.og) != -1 ? false : true;
                        v10.bu = v2_2;
                        if(((gc)v5_1).aq) {
                            v2_1 = v6_1 ? 91 : 1;
                        }
                        else if(v6_1) {
                            v2_1 = 90;
                        }
                        else {
                            v2_1 = 2;
                        }

                        if(-1 != ((gc)v5_1).ad * 0x5A739A73) {
                            ib.al(v2_1, lk.ax(((gc)v5_1).ad * 0x5A739A73, 40) + v10.ax.ax(0x7FF3F269), v9_1, -1906570634);
                            goto label_234;
                        }

                        ib.al(v2_1, v10.ax.ax(0x5A70640D), v9_1, -816670405);
                    }

                label_234:
                    v0.ar = (v7 + v8) * -1880437085;
                }

                if((v11 & 2) != 0) {
                    v10.cy = v0.cb(-34) * 0xDDB4A4E9;
                    if(v10.cy * 0x5A6E7359 == v3) {
                        v10.cy = 0x224B5B17;
                    }
                }

                if((v11 & 0x800) != 0) {
                    for(v2_1 = 0; v2_1 < 3; ++v2_1) {
                        v10.aj[v2_1] = v0.bn(-11);
                    }
                }

                if((v11 & 0x100) != 0) {
                    ho.ar[arg21] = v0.bi(0x8F4644E5);
                }

                if((v11 & 0x80) != 0) {
                    v10.cc = v0.cb(-77) * -1163009031;
                    if(v10.dk * -1091885127 == 0) {
                        v10.du = v10.cc * 0x81BB9B3B;
                        v10.cc = 1163009031;
                    }
                }

                if((v11 & 0x200) != 0) {
                    v5 = 0x6449C51F;
                    v10.cq = v0.bi(0xC7A0BE55) * v5;
                    v6 = 0xB48720F7;
                    v10.cg = v0.aw(-1215098345) * v6;
                    v7 = 0x6B9042FD;
                    v10.cv = v0.ca(0xFBD665E8) * v7;
                    v8 = 0x23E66C3;
                    v10.co = v0.bi(-1803680502) * v8;
                    v10.dv = (v0.ao(1503376078) + client.bj * -2077001153) * 0x21C7C9F7;
                    v10.dp = (v0.ao(-2083056062) + client.bj * -2077001153) * -2044357351;
                    v10.dh = v0.cb(-49) * 0xE90A13B7;
                    if(v10.ba) {
                        v10.cq += v10.bf * -908304491;
                        v10.cg += v10.bn * 910046141;
                        v10.cv += v10.bf * 0x4FE24E9F;
                        v10.co += v10.bn * 0x7C9F9A01;
                        v10.dk = 0;
                    }
                    else {
                        v10.cq += v10.dc[0] * v5;
                        v10.cg += v10.dj[0] * v6;
                        v10.cv += v10.dc[0] * v7;
                        v10.co += v10.dj[0] * v8;
                        v10.dk = -1133990263;
                    }

                    v10.df = 0;
                }

                if((v11 & 0x20) != 0) {
                    v10.bm = v0.bn(-10);
                    if(v10.bm.charAt(0) == 0x7E) {
                        v10.bm = v10.bm.substring(1);
                        ib.al(2, v10.ax.ax(0x287A55CF), v10.bm, 0xB396A209);
                    }
                    else if(v10 == gu.jg) {
                        ib.al(2, v10.ax.ax(0x2FF56711), v10.bm, 1500201775);
                    }

                    v10.bj = false;
                    v10.be = 0;
                    v10.bl = 0;
                    v10.bs = -1639783094;
                }

                if((v11 & 0x1000) != 0) {
                    v10.cl = v0.cw(-672590826) * 0x50A1A935;
                    v2_1 = v0.ac(13);
                    v10.cu = (v2_1 >> 16) * 0x5156494F;
                    v10.ct = ((v2_1 & v3) + client.bj * -2077001153) * 1522712035;
                    v10.ck = 0;
                    v10.cm = 0;
                    if(v10.ct * 0xD02A6FCB > client.bj * -2077001153) {
                        v10.ck = 0x2AB9EA9D;
                    }

                    if(v10.cl * 0xA760211D != v3) {
                        goto label_457;
                    }

                    v10.cl = 0xAF5E56CB;
                }

            label_457:
                if((v11 & 16) != 0) {
                    v2_1 = v0.ay(-116);
                    byte[] v3_1 = new byte[v2_1];
                    lq v5_2 = new lq(v3_1);
                    v0.cl(v3_1, 0, v2_1, 1);
                    ho.an[arg21] = v5_2;
                    v10.ax(v5_2, 1847808349);
                }

                if(v10.ba) {
                    v2_1 = -583444501;
                    v3 = 0x8370F0CB;
                    if(v14_1 == 0x7F) {
                        v10.ab(v10.bf * v3, v10.bn * v2_1, -83);
                    }
                    else {
                        if(v14_1 != -1) {
                        }
                        else {
                            v14_1 = ho.ar[arg21];
                        }

                        v10.aq(v10.bf * v3, v10.bn * v2_1, v14_1, -16);
                        return;
                    label_95:
                        goto label_494;
                    }
                }

                return;
            }
            catch(RuntimeException v0_1) {
                goto label_95;
            }
        }

        goto label_96;
    label_494:
        StringBuilder v1 = new StringBuilder();
        v1.append("dd.ad(");
        v1.append(')');
        throw lx.al(((Throwable)v0_1), v1.toString());
    }

    public static void ad(ko arg0, ko arg1) {
        dd.ax = arg0;
        dd.al = arg1;
    }

    void ae(lq arg2, int arg3) {
        while(true) {
            byte v3 = -7;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.ar(arg2, arg3, 0x2807FD5E);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dd.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public static dd af(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dd.ae.ax(v1);
        if(v0 != null) {
            return ((dd)v0);
        }

        byte[] v5 = dd.ax.ae(33, arg5, 0x78DC0DC9);
        dd v0_1 = new dd();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0xF1202E38);
        }

        dd.ae.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public es ag() {
        int v1 = -666407035;
        if(this.aa * v1 < 0) {
            return null;
        }

        mv v0 = dd.ar.ax(((long)(this.aa * v1)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(dd.al, this.aa * v1, 0, -1565303959);
        if(v0_1 != null) {
            dd.ar.ae(((mv)v0_1), ((long)(this.aa * 0x50E0733B)));
        }

        return v0_1;
    }

    public static void ah(Collection arg1) {
        arg1.add(dd.ae);
        arg1.add(dd.ar);
    }

    void ai(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-27);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0xF02C6F4A);
        }
    }

    void am(lq arg2, int arg3) {
        int v2;
        if(arg3 == 1) {
            arg2.ao(2077783461);
        }
        else if(arg3 == 2) {
            this.ad = arg2.ay(-106) * 0x2617879F;
        }
        else if(arg3 == 3) {
            this.aq = arg2.ay(-1) * 0xBF8AA1BF;
        }
        else {
            if(4 == arg3) {
                v2 = 0;
            }
            else if(5 == arg3) {
                this.ai = arg2.ao(604500647) * 0xEC00D319;
                return;
            }
            else if(6 == arg3) {
                arg2.ay(-34);
                return;
            }
            else if(7 == arg3) {
                this.av = arg2.bq(0xEF703D35) * -1035659401;
                return;
            }
            else if(arg3 == 8) {
                this.aa = arg2.bq(0x90DDBBB4) * 0x55EF314D;
                return;
            }
            else if(11 == arg3) {
                v2 = arg2.ao(0xE7FB4A40) * -143092641;
            }
            else {
                goto label_62;
            }

            this.ab = v2;
            return;
        label_62:
            if(14 == arg3) {
                this.au = arg2.ay(-4) * 0x1DDB7F9;
                return;
            }

            if(15 != arg3) {
                return;
            }

            this.am = arg2.ay(-31) * 0xC22070FD;
        }
    }

    public es an(byte arg5) {
        es v5_2;
        try {
            int v0 = 0x2098F247;
            if(this.av * v0 < 0) {
                return null;
            }

            mv v5_1 = dd.ar.ax(((long)(this.av * v0)));
            if(v5_1 != null) {
                return ((es)v5_1);
            }

            v5_2 = ah.ap(dd.al, this.av * v0, 0, -1565303959);
            if(v5_2 != null) {
                dd.ar.ae(((mv)v5_2), ((long)(this.av * v0)));
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dd.an(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return v5_2;
    }

    public es ap(int arg5) {
        es v5_2;
        try {
            int v0 = -666407035;
            if(this.aa * v0 < 0) {
                return null;
            }

            mv v5_1 = dd.ar.ax(((long)(this.aa * v0)));
            if(v5_1 != null) {
                return ((es)v5_1);
            }

            v5_2 = ah.ap(dd.al, this.aa * v0, 0, -1565303959);
            if(v5_2 != null) {
                dd.ar.ae(((mv)v5_2), ((long)(this.aa * v0)));
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dd.ap(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return v5_2;
    }

    public static dd aq(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dd.ae.ax(v1);
        if(v0 != null) {
            return ((dd)v0);
        }

        byte[] v5 = dd.ax.ae(0x10CD6B5C, arg5, 0x78DC0DC9);
        dd v0_1 = new dd();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0xE56ED506);
        }

        dd.ae.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ar(lq arg1, int arg2, int arg3) {
        if(arg2 == 1) {
            arg2 = 0xD1053F5D;
            try {
                arg1.ao(arg2);
                return;
            label_7:
                if(arg2 == 2) {
                    this.ad = arg1.ay(-27) * 0x2617879F;
                }
                else if(arg2 == 3) {
                    this.aq = arg1.ay(-13) * 0xBF8AA1BF;
                }
                else if(4 == arg2) {
                    this.ab = 0;
                }
                else if(5 == arg2) {
                    this.ai = arg1.ao(-500857650) * 0xEC00D319;
                }
                else if(6 == arg2) {
                    arg1.ay(-38);
                }
                else if(7 == arg2) {
                    this.av = arg1.bq(-2012788107) * -1035659401;
                }
                else if(arg2 == 8) {
                    this.aa = arg1.bq(0xD5931E54) * 0x55EF314D;
                }
                else if(11 == arg2) {
                    this.ab = arg1.ao(0xACDCC293) * -143092641;
                }
                else if(14 == arg2) {
                    this.au = arg1.ay(-91) * 0x1DDB7F9;
                }
                else if(15 == arg2) {
                    this.am = arg1.ay(-60) * 0xC22070FD;
                    return;
                label_6:
                    goto label_81;
                }
            }
            catch(RuntimeException v1) {
                goto label_6;
            }
        }
        else {
            goto label_7;
        label_81:
            StringBuilder v2 = new StringBuilder();
            v2.append("dd.ar(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void at(Collection arg1) {
        arg1.add(dd.ae);
        arg1.add(dd.ar);
    }

    void au(lq arg2, int arg3) {
        if(arg3 == 1) {
            arg2.ao(0x32F1AAE);
        }
        else if(arg3 == 2) {
            this.ad = arg2.ay(-99) * 0x2617879F;
        }
        else if(arg3 == 3) {
            this.aq = arg2.ay(-117) * 0xBF8AA1BF;
        }
        else if(4 == arg3) {
            this.ab = 0;
        }
        else if(5 == arg3) {
            this.ai = arg2.ao(0x30C92BB5) * 0xEC00D319;
        }
        else if(6 == arg3) {
            arg2.ay(-63);
        }
        else if(7 == arg3) {
            this.av = arg2.bq(0xE2EDFCA0) * -1035659401;
        }
        else if(arg3 == 8) {
            this.aa = arg2.bq(0xDE7AF677) * 0x55EF314D;
        }
        else if(11 == arg3) {
            this.ab = arg2.ao(1289203550) * -143092641;
        }
        else if(14 == arg3) {
            this.au = arg2.ay(-46) * 0x1DDB7F9;
        }
        else if(15 == arg3) {
            this.am = arg2.ay(-104) * 0xC22070FD;
        }
    }

    void av(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-97);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x21CB2BE8);
        }
    }

    public static void ax(ko arg0, ko arg1, int arg2) {
        try {
            ez.ax = arg0;
            ez.al = arg1;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dd.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ay(Collection arg1) {
        arg1.add(dd.ae);
        arg1.add(dd.ar);
    }

    public es az() {
        int v1 = 0x2098F247;
        if(this.av * v1 < 0) {
            return null;
        }

        mv v0 = dd.ar.ax(((long)(this.av * v1)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(dd.al, this.av * v1, 0, -1565303959);
        if(v0_1 != null) {
            dd.ar.ae(((mv)v0_1), ((long)(this.av * v1)));
        }

        return v0_1;
    }

    public static final ii ep(int arg1, byte arg2) {
        if(arg1 >= 0) {
            try {
                if(arg1 >= client.ev.length) {
                }
                else {
                    return client.ev[arg1];
                }
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("dd.ep(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }

        return null;
    }
}

