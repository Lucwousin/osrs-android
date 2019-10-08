public class ap {
    public static final int ai = 12;
    static final int bh = 3;
    public static final int cp = 1010;
    static es[] gy;
    static ar[] lw;

    ap() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ap.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int ab(int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if((arg7 & 1) == 1) {
        }
        else {
            int v1 = arg6;
            arg6 = arg5;
            arg5 = v1;
        }

        arg4 &= 3;
        if(arg4 == 0) {
            return arg2;
        }

        if(arg4 == 1) {
            return arg3;
        }

        if(arg4 == 2) {
            return 7 - arg2 - (arg6 - 1);
        }

        return 7 - arg3 - (arg5 - 1);
    }

    public static int ad(int arg1, int arg2, int arg3) {
        arg3 &= 3;
        if(arg3 == 0) {
            return arg2;
        }

        if(1 == arg3) {
            return 7 - arg1;
        }

        if(2 == arg3) {
            return 7 - arg2;
        }

        return arg1;
    }

    public static int af(int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if((arg7 & 1) == 1) {
            int v1 = arg6;
            arg6 = arg5;
            arg5 = v1;
        }

        arg4 &= 3;
        if(arg4 == 0) {
            return arg3;
        }

        if(1 == arg4) {
            return 7 - arg2 - (arg5 - 1);
        }

        if(arg4 == 2) {
            return 7 - arg3 - (arg6 - 1);
        }

        return arg2;
    }

    public static int ai(int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if((arg7 & 1) == 1) {
            int v1 = arg6;
            arg6 = arg5;
            arg5 = v1;
        }

        arg4 &= 3;
        if(arg4 == 0) {
            return arg3;
        }

        if(1 == arg4) {
            return 7 - arg2 - (arg5 - 1);
        }

        if(arg4 == 2) {
            return 7 - arg3 - (arg6 - 1);
        }

        return arg2;
    }

    public static int aj(int arg1, int arg2, int arg3) {
        arg3 &= 3;
        if(arg3 == 0) {
            return arg1;
        }

        if(1 == arg3) {
            return arg2;
        }

        if(2 == arg3) {
            return 7 - arg1;
        }

        return 7 - arg2;
    }

    public static int an(int arg1, int arg2, int arg3) {
        arg3 &= 3;
        if(arg3 == 0) {
            return arg1;
        }

        if(1 == arg3) {
            return arg2;
        }

        if(2 == arg3) {
            return 7 - arg1;
        }

        return 7 - arg2;
    }

    public static int ap(int arg1, int arg2, int arg3) {
        arg3 &= 3;
        if(arg3 == 0) {
            return arg1;
        }

        if(1 == arg3) {
            return arg2;
        }

        if(2 == arg3) {
            return 7 - arg1;
        }

        return 7 - arg2;
    }

    public static int aq(int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if((arg7 & 1) == 1) {
            int v1 = arg6;
            arg6 = arg5;
            arg5 = v1;
        }

        arg4 &= 3;
        if(arg4 == 0) {
            return arg2;
        }

        if(arg4 == 1) {
            return arg3;
        }

        if(arg4 == 2) {
            return 7 - arg2 - (arg5 - 1);
        }

        return 7 - arg3 - (arg6 - 1);
    }

    static hl ar(byte[] arg12, byte arg13) {
        hl v13;
        try {
            v13 = new hl();
            lq v0 = new lq(arg12);
            v0.ar = (v0.ae.length - 2) * -1880437085;
            int v2 = v0.ae.length - 2 - v0.ao(0x5E086DE9) - 12;
            v0.ar = -1880437085 * v2;
            int v12_1 = v0.ac(29);
            v13.an = v0.ao(0xCFC82A05) * 0xD6B2F2C7;
            v13.ap = v0.ao(0x23183245) * 781987405;
            v13.aj = v0.ao(0xF63A8206) * 0x2E1E3D1B;
            v13.ad = v0.ao(0xA492B053) * -666086369;
            int v1 = v0.ay(-123);
            int v3 = 0;
            if(v1 > 0) {
                v13.aq = v13.an(v1, 1118054010);
                int v4;
                for(v4 = 0; v4 < v1; ++v4) {
                    int v5 = v0.ao(0xDD5BD63A);
                    int v7 = v5 > 0 ? fa.ae(v5, 0x36EC76BF) : 1;
                    oc v6 = new oc(v7);
                    v13.aq[v4] = v6;
                    while(true) {
                        v7 = v5 - 1;
                        if(v5 <= 0) {
                            break;
                        }

                        v6.al(new mo(v0.ac(51)), ((long)v0.ac(0x30)));
                        v5 = v7;
                    }
                }
            }

            v0.ar = 0;
            v0.bf(-626755053);
            v13.al = new int[v12_1];
            v13.ae = new int[v12_1];
            v13.ar = new String[v12_1];
            while(v0.ar * 0xF24F550B < v2) {
                v12_1 = v0.ao(0x100FFB73);
                if(3 == v12_1) {
                    v13.ar[v3] = v0.bn(-29);
                }
                else {
                    if(v12_1 < 100 && 21 != v12_1 && v12_1 != 38 && 39 != v12_1) {
                        v13.ae[v3] = v0.ac(24);
                        goto label_114;
                    }

                    v13.ae[v3] = v0.ay(-42);
                }

            label_114:
                v13.al[v3] = v12_1;
                ++v3;
            }
        }
        catch(RuntimeException v12) {
            goto label_122;
        }

        return v13;
    label_122:
        StringBuilder v13_1 = new StringBuilder();
        v13_1.append("ap.ar(");
        v13_1.append(')');
        throw lx.al(((Throwable)v12), v13_1.toString());
    }

    static final int at(int arg2, int arg3, byte arg4) {
        if(arg2 == -2) {
            return 0xBC614E;
        }

        int v0 = 0x7E;
        int v1 = 2;
        if(-1 == arg2) {
            if(arg3 < v1) {
                arg3 = 2;
            }
            else if(arg3 > v0) {
                arg3 = 0x7E;
            }

            return arg3;
        }

        arg3 *= arg2 & 0x7F;
        try {
            arg3 /= 0x80;
            if(arg3 >= v1) {
                goto label_20;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ap.at(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        arg3 = 2;
        goto label_22;
    label_20:
        if(arg3 > v0) {
            arg3 = 0x7E;
        }

    label_22:
        return (arg2 & 0xFF80) + arg3;
    }

    public static String au(String arg8, int arg9) {
        try {
            arg9 = arg8.length();
            char[] v0 = new char[arg9];
            int v2 = 2;
            int v3 = 0;
            int v4 = 2;
            while(v3 < arg9) {
                char v5 = arg8.charAt(v3);
                if(v4 == 0) {
                    v5 = Character.toLowerCase(v5);
                }
                else {
                    if(v2 != v4 && !Character.isUpperCase(v5)) {
                        goto label_16;
                    }

                    v5 = aq.al(v5, 0x40);
                }

            label_16:
                if(Character.isLetter(v5)) {
                    v4 = 0;
                }
                else {
                    if(46 != v5 && v5 != 0x3F) {
                        if(33 == v5) {
                        }
                        else {
                            if((Character.isSpaceChar(v5)) && v2 == v4) {
                                goto label_34;
                            }

                            v4 = 1;
                            goto label_34;
                        }
                    }

                    v4 = 2;
                }

            label_34:
                v0[v3] = v5;
                ++v3;
            }

            return new String(v0);
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("ap.au(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    static int az(int arg0, hl arg1, boolean arg2, int arg3) {
        if(arg0 >= 2000) {
            arg0 += -1000;
            try {
                int[] v1 = il.aj;
                int v2 = il.ad - 0x4A90AB9;
                il.ad = v2;
                ar v1_1 = bl.al(v1[v2 * 1304812425], 0x64D7CF4D);
                goto label_18;
            label_14:
                v1_1 = arg2 ? il.aa : dw.av;
            label_18:
                if(arg0 != 0x787) {
                    return 2;
                }

                if(il.at * 0x103467B < 10) {
                    if(v1_1.fk == null) {
                        return 0;
                    }

                    iw v0_1 = new iw();
                    v0_1.ae = v1_1;
                    v0_1.ax = v1_1.fk;
                    v0_1.af = il.at * 0x55AFF75F + 0x5314F6D;
                    client.nc.al(((mx)v0_1));
                    return 1;
                }

                throw new RuntimeException();
            }
            catch(RuntimeException v0) {
                StringBuilder v1_2 = new StringBuilder();
                v1_2.append("ap.az(");
                v1_2.append(')');
                throw lx.al(((Throwable)v0), v1_2.toString());
            }
        }
        else {
            goto label_14;
        }

        goto label_18;
        return 2;
    }

    static void bw(int arg12) {
        try {
            int v0 = 0x23C2BEFB;
            int v1 = 4;
            int v2 = 2;
            int v3 = 0;
            boolean v4 = true;
            if(client.cs * v0 == 0) {
                client v12_1 = client.al;
                if(v2 == client.ap * -190026425) {
                }
                else {
                    v4 = false;
                }

                v12_1.adi(v4, 0xE513D117);
                v2 = 104;
                ee.fs = new bg(v1, v2, v2, id.ax);
                while(v3 < v1) {
                    client.gg[v3] = new gy(v2, v2);
                    ++v3;
                }

                mu.ow = new es(0x200, 0x200);
                ea.or = new ec(mu.ow.ax, 0x200, 0x200);
                hq.bq = gs.au;
                hq.bv = 0x95F344B9;
                client.cs = 0xCC033FC;
                return;
            }

            int v5 = 20;
            if(client.cs * v0 == v5) {
                hq.bq = gs.am;
                hq.bv = 0x2BE68972;
                client.cs = 0x13204DFA;
                return;
            }

            int v7 = 6;
            int v8 = 5;
            byte v9 = 9;
            int v10 = 10;
            if(client.cs * v0 == 30) {
                boolean v12_2 = ey.up.gg(0x70);
                client.ct = gg.bo(0, false, true, v12_2, 0xF95722DD);
                bi.cu = gg.bo(1, false, true, v12_2, 0xF95722DD);
                client.cq = gg.bo(v2, true, false, v12_2, 0xF95722DD);
                bt.cv = gg.bo(3, false, true, v12_2, 0xF95722DD);
                fq.cg = gg.bo(v1, false, true, v12_2, 0xF95722DD);
                ks.co = gg.bo(v8, true, true, v12_2, 0xF95722DD);
                gn.dv = gg.bo(v7, true, true, v12_2, 0xF95722DD);
                fr.dp = gg.bo(7, false, true, v12_2, 0xF95722DD);
                eo.dh = gg.bo(8, false, true, v12_2, 0xF95722DD);
                lm.dw = gg.bo(v9, false, true, v12_2, 0xF95722DD);
                ey.db = gg.bo(v10, false, true, v12_2, 0xF95722DD);
                fz.du = gg.bo(11, false, true, v12_2, 0xF95722DD);
                ih.dm = gg.bo(12, false, true, v12_2, 0xF95722DD);
                cj.de = gg.bo(13, true, false, v12_2, 0xF95722DD);
                dy.dk = gg.bo(14, false, true, v12_2, 0xF95722DD);
                mf.dc = gg.bo(15, false, true, v12_2, 0xF95722DD);
                da.df = gg.bo(17, true, true, v12_2, 0xF95722DD);
                dd.ds = gg.bo(18, false, true, v12_2, 0xF95722DD);
                bt.dj = gg.bo(19, false, true, v12_2, 0xF95722DD);
                ck.dy = gg.bo(v5, false, true, v12_2, 0xF95722DD);
                hq.bq = gs.az;
                hq.bv = 1473057508;
                client.cs = 0x198067F8;
                return;
            }

            int v11 = 100;
            if(client.cs * v0 == 40) {
                arg12 = client.ct.di(0x5CFA87F0) * 4 / v11 + bi.cu.di(0x7724B4AF) * 4 / v11 + client.cq.di(0x2F6412F2) * 2 / v11 + bt.cv.di(581064105) * 2 / v11 + fq.cg.di(617091985) * 6 / v11 + ks.co.di(-1820508746) * 4 / v11 + gn.dv.di(1735059661) * 2 / v11 + fr.dp.di(-1790683268) * 56 / v11 + eo.dh.di(0xDB9330C1) * 2 / v11 + lm.dw.di(0x63C99281) * 2 / v11 + ey.db.di(0xE9157D76) * 2 / v11 + fz.du.di(0xD87F2C85) * 2 / v11 + ih.dm.di(2037679795) * 2 / v11 + cj.de.di(0xD59E3FC8) * 2 / v11 + dy.dk.di(172009673) * 2 / v11 + mf.dc.di(1480975970) * 2 / v11 + bt.dj.di(0xD13E8068) / v11 + dd.ds.di(2087142032) / v11 + ck.dy.di(-292981905) / v11;
                if((da.df.dx(-1)) && (da.df.ad(-69))) {
                    v3 = 1;
                }

                arg12 += v3;
                if(v11 != arg12) {
                    if(arg12 != 0) {
                        hq.bq = gs.ag + arg12 + "%";
                    }

                    hq.bv = -2085381034;
                    return;
                }

                hc.ac(client.ct, "Animations", -3);
                hc.ac(bi.cu, "Skeletons", -24);
                hc.ac(fq.cg, "Sound FX", -14);
                hc.ac(ks.co, "Maps", -51);
                hc.ac(gn.dv, "Music Tracks", v9);
                hc.ac(fr.dp, "Models", -67);
                hc.ac(eo.dh, "Sprites", 73);
                hc.ac(fz.du, "Music Jingles", -33);
                hc.ac(dy.dk, "Music Samples", -90);
                hc.ac(mf.dc, "Music Patches", -13);
                hc.ac(bt.dj, "World Map", -14);
                hc.ac(dd.ds, "World Map Geography", 38);
                hc.ac(ck.dy, "World Map Ground", -18);
                ee.dr = new ot();
                ee.dr.ax(da.df, -34);
                hq.bq = gs.ah;
                hq.bv = -2085381034;
                client.cs = 0x9CB074F7;
                return;
            }

            if(45 == client.cs * v0) {
                ff.ar(22050, client.ab ^ 1, v2, 0xCED8AA5D);
                bw.pg = new ks();
                bw.pg.aa(v9, 0x80, -962090068);
                ek.ax(mf.dc, dy.dk, fq.cg, bw.pg, 0xA1BCC28);
                fs.pt = dn.an(ho.sh, 0, 0x800, 1938000178);
                lo.pr = new gv();
                gv v12_3 = new gv();
                v12_3.ax(bw.pg);
                v12_3.ax(lo.pr);
                fs.pt.ap(((hz)v12_3), 2100154826);
                oz.pp = new hg(22050, ht.ax * 0x2C18D40D);
                hq.bq = gs.at;
                hq.bv = 0x19A6E10F;
                client.cs = 0x1FE081F6;
                fh.fz = new lx(eo.dh, cj.de);
                return;
            }

            if(client.cs * v0 == 50) {
                arg12 = li.ax(89).length;
                client.fk = fh.fz.ax(li.ax(101), -1134090466);
                if(client.fk.size() < arg12) {
                    hq.bq = gs.ay + client.fk.size() * 100 / arg12 + "%";
                    hq.bv = 0xAF9A25C8;
                    return;
                }

                fr.fy = client.fk.get(li.ax);
                cn.fh = client.fk.get(li.al);
                dq.fl = client.fk.get(li.ae);
                client.rz = new pw(client.al);
                he.ro = client.rz.ax(0x250EC730);
                hq.bq = gs.aw;
                hq.bv = 0xAF9A25C8;
                client.cs = 0x26409BF4;
                return;
            }

            if(client.cs * v0 == 60) {
                arg12 = er.ax(ey.db, eo.dh, 18);
                v0 = ho.al(0x45E00A8);
                if(arg12 < v0) {
                    hq.bq = gs.ao + arg12 * 100 / v0 + "%";
                    hq.bv = 0xDB80AF3A;
                    return;
                }

                hq.bq = gs.as;
                hq.bv = 0xDB80AF3A;
                if(db.adh(0x68CDF925)) {
                    dc.ay(v8, -95);
                    client.cs = 0x2CA0B5F2;
                    av.ada(0x388F2DAF);
                }

                return;
            }

            if(client.cs * v0 == 70) {
                if(!client.cq.ad(-125)) {
                    hq.bq = gs.ak + client.cq.dg(-1551119077) + "%";
                    hq.bv = 124205228;
                    return;
                }

                cf.ax(client.cq, 98);
                ew.ax(client.cq, -20);
                dc.ax(client.cq, fr.dp, 13);
                ei.ax(client.cq, fr.dp, client.ab, -67);
                dd.ax(client.cq, fr.dp, 0x72D2DAAE);
                bs.ax(client.cq, 2044146243);
                gl.ax(client.cq, fr.dp, client.aq, fr.fy, 0x8C07C141);
                client.ax(client.cq, client.ct, bi.cu, 16);
                jk.ax(client.cq, fr.dp, -2094360549);
                co.ax(client.cq, -101);
                hl.ax(client.cq, 0x8AC9443A);
                bl.ax(bt.cv, fr.dp, eo.dh, cj.de, 0xBAB26152);
                jy.ax(client.cq, 28);
                bt.ax(client.cq, 0x459E0307);
                ig.ax(client.cq, -516069604);
                dh.ax(client.cq, 0x1EA04C1C);
                gg.ml = new jh();
                jy.ax(client.cq, eo.dh, cj.de, 74);
                id.ax(client.cq, eo.dh, 0xE62AF345);
                dg.ax(client.cq, eo.dh, 0xDE60D469);
                hq.bq = gs.ac;
                hq.bv = 124205228;
                client.cs = 0x3300CFF0;
                return;
            }

            if(80 == client.cs * v0) {
                if(hj.ga == null) {
                    hj.ga = ah.ap(eo.dh, ee.dr.ax * 270180001, 0, -1565303959);
                    arg12 = 0;
                }
                else {
                    arg12 = 1;
                }

                if(cs.gj == null) {
                    cs.gj = ah.ap(eo.dh, ee.dr.al * 310601165, 0, -1565303959);
                }
                else {
                    ++arg12;
                }

                if(jv.gx == null) {
                    jv.gx = hl.al(eo.dh, ee.dr.ae * 0xFC543615, 0, 1037028490);
                }
                else {
                    ++arg12;
                }

                if(client.gb == null) {
                    client.gb = id.an(eo.dh, ee.dr.ar * 0x5791A959, 0, 1517050911);
                }
                else {
                    ++arg12;
                }

                if(ap.gy == null) {
                    ap.gy = id.an(eo.dh, ee.dr.an * 0xFD67CCEF, 0, 0x4626B5F9);
                }
                else {
                    ++arg12;
                }

                if(gg.gr == null) {
                    gg.gr = id.an(eo.dh, ee.dr.ap * 0x499A7357, 0, 0x58AA7E46);
                }
                else {
                    ++arg12;
                }

                if(cs.gt == null) {
                    cs.gt = id.an(eo.dh, ee.dr.aj * 0x7DDD67A5, 0, 303604099);
                }
                else {
                    ++arg12;
                }

                if(ao.gk == null) {
                    ao.gk = id.an(eo.dh, ee.dr.ad * 0xB3F42363, 0, 0x7FA4EF20);
                }
                else {
                    ++arg12;
                }

                if(iy.gi == null) {
                    iy.gi = id.an(eo.dh, ee.dr.aq * 0xE7040C67, 0, 0x272027B);
                }
                else {
                    ++arg12;
                }

                if(cn.gw == null) {
                    cn.gw = hl.al(eo.dh, ee.dr.ab * 0xD9897A11, 0, 0x698F46A9);
                }
                else {
                    ++arg12;
                }

                if(bu.gz == null) {
                    bu.gz = hl.al(eo.dh, ee.dr.af * 0x9D79A0B9, 0, 0x4DFC71A3);
                }
                else {
                    ++arg12;
                }

                if(arg12 < 11) {
                    hq.bq = gs.bd + arg12 * 100 / 12 + "%";
                    hq.bv = 860733982;
                    return;
                }

                od.af = bu.gz;
                cs.gj.ae();
                arg12 = (((int)(Math.random() * 21))) - v10;
                v0 = (((int)(Math.random() * 21))) - v10;
                v1 = (((int)(Math.random() * 21))) - v10;
                v2 = (((int)(Math.random() * 41))) - v5;
                jv.gx[0].al(arg12 + v2, v0 + v2, v2 + v1);
                fh.kf = new fw(dq.fl, ao.gk, true, eo.dh);
                hq.bq = gs.ba;
                hq.bv = 860733982;
                client.cs = 0x3960E9EE;
                return;
            }

            int v4_1 = 0x8B1AD502;
            if(client.cs * v0 == 90) {
                if(!lm.dw.ad(-104)) {
                    hq.bq = gs.bf + "0%";
                    hq.bv = v4_1;
                    return;
                }

                cj v12_5 = null;
                ki v1_2 = lm.dw;
                ki v2_1 = eo.dh;
                v3 = 20;
                double v4_2 = 0.8;
                int v6 = client.ab ? 0x40 : 0x80;
                super(((ko)v1_2), ((ko)v2_1), v3, v4_2, v6);
                ox.jm = v12_5;
                fa.bw(ox.jm, 0x680C616B);
                cc.bf(0.8);
                client.cs = 1069614060;
                return;
            }

            if(v11 == client.cs * v0) {
                arg12 = ox.jm.bd(0xEE589C69);
                if(arg12 < v11) {
                    hq.bq = gs.bf + arg12 + "%";
                    hq.bv = v4_1;
                    return;
                }

                hq.bq = gs.bn;
                hq.bv = v4_1;
                client.cs = 0x4C8137E8;
                return;
            }

            if(120 == client.cs * v0) {
                if(!ey.db.ak("huffman", "", 0xAAC049F7)) {
                    hq.bq = gs.bp + 0 + "%";
                    hq.bv = 0x310A596;
                    return;
                }

                jk.ax(new kx(ey.db.as("huffman", "", 0x699B6445)), 0x820C23BB);
                hq.bq = gs.bw;
                hq.bv = 0x310A596;
                client.cs = 1390498278;
                return;
            }

            if(client.cs * v0 == 130) {
                if(!bt.cv.ad(-28)) {
                    hq.bq = gs.bo + bt.cv.dg(-1532728084) * 4 / v8 + "%";
                    hq.bv = 0x3F0B8DE0;
                    return;
                }

                if(!ih.dm.ad(-74)) {
                    hq.bq = gs.bo + (ih.dm.dg(0x9CDA96A5) / v7 + 80) + "%";
                    hq.bv = 0x3F0B8DE0;
                    return;
                }

                if(!cj.de.ad(-61)) {
                    hq.bq = gs.bo + (cj.de.dg(0xA8B33A3E) / 50 + 0x60) + "%";
                    hq.bv = 0x3F0B8DE0;
                    return;
                }

                hq.bq = gs.by;
                hq.bv = 2064021034;
                client.cs = 0x59416BE4;
                return;
            }

            if(client.cs * v0 == 140) {
                hq.bv = 0xB7015E74;
                if(!bt.dj.ac(dv.ax.ap, 1786060600)) {
                    hq.bq = gs.bt + bt.dj.ba(dv.ax.ap, 1608246650) / v10 + "%";
                    return;
                }

                if(bu.rt == null) {
                    bu.rt = new pb();
                    bu.rt.ax(bt.dj, dd.ds, ck.dy, dq.fl, client.fk, jv.gx, -58);
                }

                hq.bq = gs.bv;
                client.cs = 1604421090;
                return;
            }

            if(client.cs * v0 != 150) {
                return;
            }

            bk.bq(0x4E909FDF);
            dc.ay(v10, -94);
            if(fy.rk != null) {
                fy.rk.ax(0xA8F4C85A);
                fy.rk = null;
            }
        }
        catch(RuntimeException v12) {
            v0_1 = new StringBuilder();
            v0_1.append("ap.bw(");
            v0_1.append(')');
            throw lx.al(((Throwable)v12), v0_1.toString());
        }
    }

    static void dk(byte arg5) {
        int v1;
        try {
            int v5_1 = ho.ap * 0x474DFE7D;
            int[] v0 = ho.aj;
            v1 = 0;
            while(true) {
            label_5:
                if(v1 >= v5_1) {
                    return;
                }

                if(v0[v1] != client.ke * 0xE8408B37) {
                    if(client.ja * -900939569 == v0[v1]) {
                    }
                    else {
                        cn.dc(client.jf[v0[v1]], true, 0xCBC679A2);
                    }
                }

                break;
            }
        }
        catch(RuntimeException v5) {
            goto label_28;
        }

        ++v1;
        goto label_5;
        return;
    label_28:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("ap.dk(");
        v0_1.append(')');
        throw lx.al(((Throwable)v5), v0_1.toString());
    }

    static boolean ia(ar arg1, int arg2) {
        try {
            return arg1.bg;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ap.ia(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static void io(lq arg1, int arg2, int arg3) {
        try {
            cs.ik(arg1.ae, arg2, 0x7AB8F6C);
            gy.an(arg1, arg2, 0x6E3A75B2);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ap.io(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }
}

