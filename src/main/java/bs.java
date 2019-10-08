import com.jagex.jagex3.client.input.softkeyboard.ar;

public final class bs {
    static int ab = 0;
    int ae;
    static final int ah = 0x40000;
    int al;
    public long an;
    int ap;
    public bm ar;
    int ax;
    static final int ex = 9226041;

    bs() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bs.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void aq(int arg1, int arg2) {
        try {
            ar v2 = client.al.aba(-1652404718).gl(0x5BE76902);
            if(v2 == null) {
                v2 = ey.aw(1036395545);
            }

            if(v2 != null) {
                v2.ay(arg1, 0x749E65FE);
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("bs.aq(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }

    public static void ax(ko arg1, int arg2) {
        try {
            dn.ax = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("bs.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static int ax(int arg0, int arg1, int arg2, byte arg3) {
        arg2 &= 3;
        if(arg2 == 0) {
            return arg0;
        }

        if(1 == arg2) {
            return arg1;
        }

        if(2 == arg2) {
            return 7 - arg0;
        }

        return 7 - arg1;
    }

    static void bt(int arg2) {
        arg2 = 129708000;
        try {
            if(fl.ax(arg2)) {
                hq.ea = true;
                hq.ev = 0;
                hq.eg = 0;
                ce.eu = null;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bs.bt(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static void bx(int arg6, byte arg7) {
        int v0 = 0xF38FB45;
        int v2 = 10;
        int v3 = 0x63D3C206;
        if(-3 == arg6) {
            try {
                String v6_1 = gs.bm;
                String v7 = gs.bj;
                String v4 = gs.bu;
                goto label_9;
            label_13:
                if(arg6 == -2) {
                    v6_1 = gs.bs;
                    v7 = gs.be;
                    v4 = gs.bl;
                    goto label_9;
                }
                else if(arg6 == -1) {
                    v6_1 = gs.br;
                    v7 = gs.bi;
                    v4 = gs.ca;
                    goto label_9;
                }
                else if(3 == arg6) {
                    ey.up.gj("lfPMvO", 998730800);
                    hq.cm = 0xAFBDA917;
                    hq.cz = 99320303;
                    dc.ay(v2, -7);
                    return;
                }
                else if(4 == arg6) {
                    cc.bk(0, -26);
                    dc.ay(v2, -69);
                    return;
                }
                else if(arg6 == 5) {
                    hq.cz = 198640606;
                    ax.bf(gs.cx, gs.cb, gs.cy, v3);
                }
                else {
                    if(arg6 != 68) {
                        int v4_1 = 6;
                        if(!client.al.au && arg6 == v4_1) {
                            goto label_327;
                        }

                        if(7 == arg6) {
                            ax.bf(gs.ci, gs.cr, gs.ch, v3);
                            goto label_331;
                        }

                        if(8 == arg6) {
                            ax.bf(gs.ce, gs.cs, gs.cz, v3);
                            goto label_331;
                        }

                        if(arg6 == 9) {
                            ax.bf(gs.cn, gs.cl, gs.ck, v3);
                            goto label_331;
                        }

                        if(v2 == arg6) {
                            ax.bf(gs.cm, gs.ct, gs.cu, v3);
                            goto label_331;
                        }

                        int v7_1 = 11;
                        if(v7_1 == arg6) {
                            v6_1 = gs.cq;
                            v7 = gs.cv;
                            v4 = gs.cg;
                            goto label_95;
                        }

                        if(arg6 == 12) {
                            ax.bf(gs.co, gs.dv, gs.dp, v3);
                            goto label_331;
                        }

                        if(13 == arg6) {
                            ax.bf(gs.dh, gs.dw, gs.db, v3);
                            goto label_331;
                        }

                        if(14 == arg6) {
                            ax.bf(gs.du, gs.dm, gs.de, v3);
                            goto label_331;
                        }

                        if(16 == arg6) {
                            v6_1 = gs.dk;
                            v7 = gs.dc;
                            v4 = gs.dj;
                        }
                        else if(17 == arg6) {
                            v6_1 = gs.ds;
                            v7 = gs.dy;
                            v4 = gs.df;
                        }
                        else if(arg6 == 18) {
                            cc.bk(1, -51);
                            dc.ay(v2, -71);
                            return;
                        }
                        else if(19 == arg6) {
                            ax.bf(gs.dx, gs.di, gs.da, v3);
                            goto label_331;
                        }
                        else if(20 == arg6) {
                            ax.bf(gs.dz, gs.do, gs.dq, v3);
                            goto label_331;
                        }
                        else if(22 == arg6) {
                            if(client.ac * 0x498EF1C3 == 40) {
                                ax.bf(gs.dd, gs.dg, gs.ek, v3);
                            }
                            else {
                                ax.bf(gs.dt, gs.dg, gs.ek, v3);
                            }

                            goto label_331;
                        }
                        else if(23 == arg6) {
                            ax.bf(gs.ez, gs.ea, gs.er, v3);
                            goto label_331;
                        }
                        else if(24 == arg6) {
                            ax.bf(gs.eq, gs.ej, gs.em, v3);
                            goto label_331;
                        }
                        else if(arg6 == 25) {
                            ax.bf(gs.ey, gs.en, gs.el, v3);
                            goto label_331;
                        }
                        else if(26 == arg6) {
                            ax.bf(gs.ew, gs.ev, gs.eg, v3);
                            goto label_331;
                        }
                        else if(arg6 == 27) {
                            v6_1 = gs.eu;
                            v7 = gs.ee;
                            v4 = gs.ed;
                        }
                        else {
                            goto label_203;
                        }

                        ax.bf(v6_1, v7, v4, v3);
                        goto label_331;
                    label_203:
                        if(0x1F == arg6) {
                            ax.bf(gs.ep, gs.ef, gs.eo, v3);
                            goto label_331;
                        }

                        if(0x20 == arg6) {
                            ax.bf(gs.et, gs.fa, gs.fe, v3);
                            goto label_331;
                        }

                        if(37 == arg6) {
                            ax.bf(gs.fd, gs.fz, gs.fy, v3);
                            goto label_331;
                        }

                        if(arg6 == 38) {
                            v6_1 = gs.fh;
                            v7 = gs.fl;
                            v4 = gs.fk;
                        label_9:
                            ax.bf(v6_1, v7, v4, v3);
                            goto label_331;
                        }

                        if(arg6 == 55) {
                            ax.bf(gs.fv, gs.fc, gs.fi, v3);
                            hq.cm = 0x29F9C2E8;
                            dc.ay(v2, -46);
                            return;
                        }

                        if(arg6 == 56) {
                            ax.bf(gs.fu, gs.fb, gs.fx, v3);
                            ew.bc(true, 1095756602);
                            dc.ay(v7_1, -35);
                            return;
                        }

                        if(57 == arg6) {
                            ax.bf(gs.fn, gs.fm, gs.ff, v3);
                            ew.bc(true, 2106680334);
                            dc.ay(v7_1, -53);
                            return;
                        }

                        if(arg6 == 61) {
                            hq.cm = 1153075851;
                            dc.ay(v2, -30);
                            return;
                        }

                        if(arg6 == 62) {
                            dc.ay(v2, -38);
                            hq.cm = v0;
                            ax.bf(gs.fq, gs.fp, gs.fw, v3);
                            return;
                        }

                        if(0x3F == arg6) {
                            dc.ay(v2, -122);
                            hq.cm = v0;
                            ax.bf(gs.ft, gs.fr, gs.fj, v3);
                            hp.ea.af(86);
                            ey.up.bq(new String[]{"wgahnagl", "name"}, 35);
                            return;
                        }

                        if(65 != arg6) {
                            if(67 == arg6) {
                            }
                            else if(arg6 == v4_1) {
                                dc.ay(v2, -110);
                                hq.cm = 0xB36ED7FE;
                                ax.bf(gs.gm, gs.gc, gs.gl, v3);
                                return;
                            }
                            else {
                                ax.bf(gs.gn, gs.gs, gs.ga, v3);
                                goto label_331;
                            }
                        }

                        dc.ay(v2, -127);
                        hq.cm = v0;
                        ax.bf(gs.fg, gs.fs, gs.gg, v3);
                        return;
                    }
                    else {
                    label_327:
                        v6_1 = gs.cw;
                        v7 = gs.cc;
                        v4 = gs.cp;
                    }

                label_95:
                    ax.bf(v6_1, v7, v4, v3);
                }

            label_331:
                dc.ay(v2, -80);
                if(hp.ea.ai(1)) {
                    hq.cm = v0;
                    return;
                label_12:
                    goto label_338;
                }

                return;
            }
            catch(RuntimeException v6) {
                goto label_12;
            }
        }
        else {
            goto label_13;
        }

        goto label_331;
    label_338:
        StringBuilder v7_2 = new StringBuilder();
        v7_2.append("bs.bx(");
        v7_2.append(')');
        throw lx.al(((Throwable)v6), v7_2.toString());
    }
}

