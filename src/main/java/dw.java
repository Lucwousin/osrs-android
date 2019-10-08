import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

public class dw {
    public af ae;
    public af al;
    public static final int ap = 29;
    static ar av = null;
    public int ax;
    public static final int cr = 0x3F4;

    public dw(int arg2, af arg3, af arg4) {
        try {
            super();
            this.ax = arg2 * 0x3470596B;
            this.al = arg3;
            this.ae = arg4;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("dw.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static void aj(Collection arg1, int arg2) {
        try {
            arg1.add(dd.ae);
            arg1.add(dd.ar);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dw.aj(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static dd al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dd.ae.ax(v0);
            if(v5 != null) {
                return ((dd)v5);
            }

            byte[] v4_1 = dd.ax.ae(33, arg4, 0x78DC0DC9);
            dd v5_1 = new dd();
            if(v4_1 != null) {
                v5_1.ae(new lq(v4_1), 0xDF11DBC7);
            }

            dd.ae.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("dw.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    static final void ao(int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, bg arg36, gy arg37, byte arg38) {
        long v8_2;
        int v9_1;
        do v10_1;
        ca v7_1;
        hj v7_2;
        do v0_1;
        ca v8;
        hj v8_1;
        do v15_1;
        ca v6;
        hj v6_1;
        int v4;
        int v17;
        int v3;
        int v13 = arg31;
        int v14 = arg32;
        int v15 = arg34;
        int v12 = arg35;
        bg v11 = arg36;
        int v1 = 0x5EFC1272;
        int v10 = arg33;
        try {
            do v9 = ok.al(v10, v1);
            v1 = 0xB46CA623;
            int v2 = 0x4B9D7897;
            int v7 = 3;
            if(1 == v15 || v7 == v15) {
                v3 = v9.ag * v2;
                v17 = v9.az * v1;
            }
            else {
                v3 = v9.az * v1;
                v17 = v9.ag * v2;
            }

            int v16 = v3;
            if(v13 + v16 <= 104) {
                v1 = (v16 >> 1) + v13;
                v2 = (v16 + 1 >> 1) + v13;
            }
            else {
                v2 = v13 + 1;
                v1 = v13;
            }

            if(v14 + v17 <= 104) {
                v3 = (v17 >> 1) + v14;
                v4 = (v17 + 1 >> 1) + v14;
            }
            else {
                v4 = v14 + 1;
                v3 = v14;
            }

            int[][] v18 = id.ax[arg30];
            int v19 = v18[v1][v3] + v18[v2][v3] + v18[v1][v4] + v18[v2][v4] >> 2;
            int v20 = (v16 << 6) + (v13 << 7);
            int v21 = (v17 << 6) + (v14 << 7);
            v3 = 2;
            boolean v4_1 = v9.ay * 0xE5018CDF == 0 ? true : false;
            v7 = 2;
            long v24 = gs.aa(arg31, arg32, v3, v4_1, arg33, 1);
            v1 = (v15 << 6) + v12;
            if(1 == v9.bb * 0x3376F5D7) {
                v1 += 0x100;
            }

            int v22 = v1;
            int v26 = 0xE748B627;
            v2 = -1;
            int v27 = 0x804BDF6B;
            if(22 == v12) {
                if(v2 != v9.ak * v27 || v9.bc != null) {
                    v12 = 1;
                    v15_1 = v9;
                    v6_1 = new hj(arg33, 22, arg34, arg30, arg31, arg32, v9.ak * v27, true, null);
                }
                else {
                    v12 = 1;
                    v6 = v9.aq(22, arg34, v18, v20, v19, v21, 49);
                    v15_1 = v9;
                }

                arg36.aj(arg29, arg31, arg32, v19, ((bm)v6), v24, v22);
                if(v15_1.ah * v26 == v12) {
                    arg37.an(v13, v14, 0);
                }

                return;
            }

            do v6_2 = v9;
            if(v12 != 10) {
                if(11 == v12) {
                }
                else if(v12 >= 12) {
                    if(v2 != v6_2.ak * v27 || v6_2.bc != null) {
                        v15_1 = v6_2;
                        v8_1 = new hj(arg33, arg35, arg34, arg30, arg31, arg32, v6_2.ak * v27, true, null);
                    }
                    else {
                        v8 = v6_2.aq(arg35, arg34, v18, v20, v19, v21, -20);
                        v15_1 = v6_2;
                    }

                    arg36.af(arg29, arg31, arg32, v19, 1, 1, ((bm)v8_1), 0, v24, v22);
                    if(v15_1.ah * v26 != 0) {
                        arg37.ae(arg31, arg32, v16, v17, v15_1.at, -2055308028);
                    }

                    return;
                }
                else {
                    v9 = v6_2;
                    if(v12 == 0) {
                        if(v9.ak * v27 != v2 || v9.bc != null) {
                            v0_1 = v9;
                            v6_1 = new hj(arg33, 0, arg34, arg30, arg31, arg32, v9.ak * v27, true, null);
                        }
                        else {
                            v6 = v9.aq(0, arg34, v18, v20, v19, v21, 89);
                            v0_1 = v9;
                        }

                        arg36.aq(arg29, arg31, arg32, v19, ((bm)v6), null, id.ah[v15], 0, v24, v22);
                        if(v0_1.ah * v26 != 0) {
                            arg37.al(arg31, arg32, arg35, arg34, v0_1.at, -1);
                        }

                        return;
                    }

                    v0_1 = v9;
                    v13 = v12;
                    if(v13 == 1) {
                        if(v2 != v0_1.ak * v27 || v0_1.bc != null) {
                            v6_1 = new hj(arg33, 1, arg34, arg30, arg31, arg32, v0_1.ak * v27, true, null);
                        }
                        else {
                            v6 = v0_1.aq(1, arg34, v18, v20, v19, v21, 1);
                        }

                        arg36.aq(arg29, arg31, arg32, v19, ((bm)v6), null, id.at[v15], 0, v24, v22);
                        if(v0_1.ah * v26 != 0) {
                            arg37.al(arg31, arg32, arg35, arg34, v0_1.at, -73);
                        }

                        return;
                    }

                    if(v13 == v7) {
                        v12 = v15 + 1 & 3;
                        if(v0_1.ak * v27 != v2 || v0_1.bc != null) {
                            v6_1 = new hj(arg33, 2, v15 + 4, arg30, arg31, arg32, v0_1.ak * v27, true, null);
                            v7_2 = new hj(arg33, 2, v12, arg30, arg31, arg32, v0_1.ak * v27, true, null);
                        }
                        else {
                            v6 = v0_1.aq(2, v15 + 4, v18, v20, v19, v21, -58);
                            v7_1 = v0_1.aq(2, v12, v18, v20, v19, v21, 91);
                        }

                        arg36.aq(arg29, arg31, arg32, v19, ((bm)v6), ((bm)v7_2), id.ah[v15], id.ah[v12], v24, v22);
                        if(v0_1.ah * v26 != 0) {
                            arg37.al(arg31, arg32, arg35, arg34, v0_1.at, 59);
                        }

                        return;
                    }

                    if(v13 == 3) {
                        if(v2 != v0_1.ak * v27 || v0_1.bc != null) {
                            v6_1 = new hj(arg33, 3, arg34, arg30, arg31, arg32, v0_1.ak * v27, true, null);
                        }
                        else {
                            v6 = v0_1.aq(3, arg34, v18, v20, v19, v21, 21);
                        }

                        arg36.aq(arg29, arg31, arg32, v19, ((bm)v6), null, id.at[v15], 0, v24, v22);
                        if(v0_1.ah * v26 != 0) {
                            arg37.al(arg31, arg32, arg35, arg34, v0_1.at, -123);
                        }

                        return;
                    }

                    if(9 == v13) {
                        if(v0_1.ak * v27 != v2 || v0_1.bc != null) {
                            v8_1 = new hj(arg33, arg35, arg34, arg30, arg31, arg32, v0_1.ak * v27, true, null);
                        }
                        else {
                            v8 = v0_1.aq(arg35, arg34, v18, v20, v19, v21, 0x7D);
                        }

                        arg36.af(arg29, arg31, arg32, v19, 1, 1, ((bm)v8_1), 0, v24, v22);
                        if(v0_1.ah * v26 != 0) {
                            arg37.ae(arg31, arg32, v16, v17, v0_1.at, 0x5AAE6241);
                        }

                        return;
                    }

                    if(v13 == 4) {
                        if(v0_1.ak * v27 != v2 || v0_1.bc != null) {
                            v6_1 = new hj(arg33, 4, arg34, arg30, arg31, arg32, v0_1.ak * v27, true, null);
                        }
                        else {
                            v6 = v0_1.aq(4, arg34, v18, v20, v19, v21, 0x5F);
                        }

                        arg36.ab(arg29, arg31, arg32, v19, ((bm)v6), null, id.ah[v15], 0, 0, 0, v24, v22);
                        return;
                    }

                    v3 = 0x1CEE4599;
                    long v4_2 = 0;
                    if(5 == v13) {
                        v10_1 = v0_1;
                        long v6_3 = v11.bd(arg29, arg31, v14);
                        v12 = v4_2 != v6_3 ? ok.al(be.av(v6_3), 0xDFEF805F).ac * v3 : 16;
                        if(v2 != v10_1.ak * v27 || v10_1.bc != null) {
                            v6_1 = new hj(arg33, 4, arg34, arg30, arg31, arg32, v10_1.ak * v27, true, null);
                        }
                        else {
                            v6 = v10_1.aq(4, arg34, v18, v20, v19, v21, -73);
                        }

                        arg36.ab(arg29, arg31, arg32, v19, ((bm)v6), null, id.ah[v15], 0, id.ay[v15] * v12, v12 * id.aw[v15], v24, v22);
                        return;
                    }

                    v10_1 = v0_1;
                    v9_1 = v13;
                    int v0_2 = arg29;
                    v13 = arg31;
                    v1 = 8;
                    if(v9_1 == 6) {
                        v8_2 = v11.bd(v0_2, v13, v14);
                        v12 = v4_2 != v8_2 ? ok.al(be.av(v8_2), 0x68D3F717).ac * v3 / v7 : 8;
                        if(v10_1.ak * v27 != v2 || v10_1.bc != null) {
                            v6_1 = new hj(arg33, 4, v15 + 4, arg30, arg31, arg32, v10_1.ak * v27, true, null);
                        }
                        else {
                            v6 = v10_1.aq(4, v15 + 4, v18, v20, v19, v21, 82);
                        }

                        arg36.ab(arg29, arg31, arg32, v19, ((bm)v6), null, 0x100, arg34, id.ao[v15] * v12, v12 * id.as[v15], v24, v22);
                        return;
                    }

                    if(7 == v9_1) {
                        v12 = v15 + 2 & 3;
                        if(v10_1.ak * v27 != v2 || v10_1.bc != null) {
                            v6_1 = new hj(arg33, 4, v12 + 4, arg30, arg31, arg32, v10_1.ak * v27, true, null);
                        }
                        else {
                            v6 = v10_1.aq(4, v12 + 4, v18, v20, v19, v21, -44);
                        }

                        arg36.ab(arg29, arg31, arg32, v19, ((bm)v6), null, 0x100, v12, 0, 0, v24, v22);
                        return;
                    }

                    if(v9_1 == v1) {
                        v8_2 = v11.bd(v0_2, v13, v14);
                        v16 = v8_2 != v4_2 ? ok.al(be.av(v8_2), 0x6EFA21A0).ac * v3 / v7 : 8;
                        v17 = v15 + 2 & 3;
                        if(v2 != v10_1.ak * v27 || v10_1.bc != null) {
                            v6_1 = new hj(arg33, 4, v15 + 4, arg30, arg31, arg32, v10_1.ak * v27, true, null);
                            v7_2 = new hj(arg33, 4, v17 + 4, arg30, arg31, arg32, v10_1.ak * v27, true, null);
                        }
                        else {
                            v6 = v10_1.aq(4, v15 + 4, v18, v20, v19, v21, 91);
                            v7_1 = v10_1.aq(4, v17 + 4, v18, v20, v19, v21, 53);
                        }

                        arg36.ab(arg29, arg31, arg32, v19, ((bm)v6), ((bm)v7_2), 0x100, arg34, v16 * id.ao[v15], v16 * id.as[v15], v24, v22);
                        return;
                    }

                    return;
                }
            }

            v9_1 = v12;
            do v12_1 = v6_2;
            if(v12_1.ak * v27 != v2 || v12_1.bc != null) {
                v15 = v9_1;
                v8_1 = new hj(arg33, 10, arg34, arg30, arg31, arg32, v12_1.ak * v27, true, null);
            }
            else {
                v8 = v12_1.aq(10, arg34, v18, v20, v19, v21, -63);
                v15 = v9_1;
            }

            if((((ca)v8_1)) != null) {
                v9_1 = v15 == 11 ? 0x100 : 0;
                v0_1 = v12_1;
                arg36.af(arg29, arg31, arg32, v19, v16, v17, ((bm)v8_1), v9_1, v24, v22);
            }
            else {
                v0_1 = v12_1;
            }

            if(v0_1.ah * v26 != 0) {
                arg37.ae(arg31, arg32, v16, v17, v0_1.at, 0x75A79A05);
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("dw.ao(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    static void ba(od arg29, od arg30, od arg31, boolean arg32, fa arg33, short arg34) {
        String v1_5;
        byte v13_2;
        int v2_1;
        float v8_1;
        float v6_1;
        int v11;
        String v19_1;
        int v5_1;
        int v3;
        int v7;
        String v24;
        int v4;
        byte v10_1;
        int v22;
        int v8;
        int v1_1;
        od v13 = arg29;
        od v14 = arg30;
        fa v15 = arg33;
        byte v1 = -19;
        try {
            v15.al(v1);
            int v12 = 2;
            hq.ab = (dq.tv * 0xD9CC4AFD - 0x2FD) / v12 * 0x8DFA78EB;
            hq.by = hq.ab * 0x116943F5 - 0x5FE64FBA;
            bi.bt = hq.by * 0x7AFF374B + 0x3AA5A4;
            if(hq.ea) {
                gn.bn(v13, v14, v15, 0x4E3E170F);
                return;
            }

            long v16 = ji.ax(0x2076E2C1);
            if(-1 == hq.fl * -611935993406195833L) {
                hq.fh = (v16 + 300) * 0x7F9153A5B5120AE9L;
                hq.fl = hq.fh * 0x3E24E342FD076C1FL - 0xD397F4858CD2F18L;
            }

            if(v16 < hq.fh * -4462661976294855335L) {
                return;
            }

            int v18 = 0xD700E425;
            if(v16 < hq.fl * -611935993406195833L) {
                v1_1 = ((int)((((float)(v15.al * -107049639 / v12))) * hq.fy.ax(1f - (((float)(hq.fl * -611935993406195833L - v16))) / 600f, 0)));
                arg33.ef(bi.bt * v18 - v1_1, 0, bi.bt * v18 + v1_1, 503, 0xB06665C4);
            }

            gx.bq(v15, -695640667);
            int v10 = 5;
            int v9 = 20;
            int v19 = 0x1A8B6787;
            int v20 = 287427031;
            if(client.ac * 0x498EF1C3 == 0 || client.ac * 0x498EF1C3 == v10) {
                arg29.ai(gs.iv, hq.by * v20 + 180, hq.bp * v19 + 54, 0xFFFFFF, -1, arg33);
                v8 = hq.bp * v19 + 62;
                arg33.fz(hq.by * v20 + 28, v8, 304, 34, 9179409, 0xB34305A5);
                arg33.fz(hq.by * v20 + 29, v8 + 1, 302, 0x20, 0, -926005952);
                v8 += v12;
                arg33.ar(hq.by * v20 + 30, v8, hq.bv * 0xE7509707, 30, 9179409, 2);
                arg33.ar(hq.by * v20 + 30 + hq.bv * 0xE7509707, v8, 300 - hq.bv * 0xE7509707, 30, 0, 2);
                if(client.al.abd(0x7ECD45C2) == 3) {
                    hq.bq = "Initialising game";
                }

                arg29.ai(hq.bq, hq.by * v20 + 180, hq.bp * v19 + 100 + v10 - 20, 0xFFFFFF, -1, arg33);
            }

            v8 = 15;
            int v21 = 0xF7EE5BF5;
            if(v9 == client.ac * 0x498EF1C3 || hq.cm * v21 == v9) {
                v15.ag(hq.af, hq.by * v20 + 180 - hq.af.ae / v12, hq.bp * v19 + 100 - hq.af.ar / v12, 1);
                v22 = hq.bp * v19 + 30;
                v10_1 = 1;
                arg29.ai(hq.cu, hq.by * v20 + 180, v22, 0xFFFF00, 0, arg33);
                v22 += 15;
                arg29.ai(hq.cq, hq.by * v20 + 180, v22, 0xFFFF00, 0, arg33);
                v22 += 15;
                arg29.ai(hq.cv, hq.by * v20 + 180, v22, 0xFFFF00, 0, arg33);
                v22 += 22;
                if(hq.cm * v21 != 4 && hq.cm * v21 != 0 && hq.cm * v21 != 10 && hq.cm * v21 != v9 && 18 != hq.cm * v21 && 16 != hq.cm * v21 && hq.cm * v21 != 1) {
                    arg29.aq(gs.lf, hq.by * v20 + 70, v22, 0xFFFFFF, 0, arg33);
                    v1_1 = 200;
                    String v2;
                    for(v2 = en.an(0xAAD12A7); v13.ar(v2) > v1_1; v2 = v2.substring(0, v2.length() - 1)) {
                    }

                    arg29.aq(od.ad(v2), hq.by * v20 + 110, v22, 0xFFFFFF, 0, arg33);
                    arg29.aq(gs.lg + ff.az(hq.co, 0xC52642B0), hq.by * v20 + 72, v22 + 15, 0xFFFFFF, 0, arg33);
                }

                if(v9 != hq.cm * v21) {
                    goto label_349;
                }

                he.bm(hq.co, client.al.au, -84);
            }
            else {
                v10_1 = 1;
            }

        label_349:
            v22 = 50;
            if(10 == client.ac * 0x498EF1C3 || 11 == client.ac * 0x498EF1C3) {
                v15.ag(hq.af, hq.by * v20, hq.bp * v19, v10_1);
                if(hq.cm * v21 == 0) {
                    v4 = hq.bp * v19 + 80;
                    v8 = hq.by * v20 + 180;
                    ah v1_3 = client.al.aba(0xB8059BB1).bh(0x5DEEABBB);
                    if(v1_3 != null) {
                        if(!v1_3.hf(-38) && !v1_3.ad(0x6733C8B8)) {
                            goto label_482;
                        }

                        v2 = "";
                        if(v1_3.hf(v10_1)) {
                            v24 = gs.lj;
                            v21 = 1;
                        }
                        else if(v1_3.ad(0xE1073AFA)) {
                            v24 = gs.ln;
                            v21 = 2;
                        }
                        else {
                            v24 = v2;
                            v21 = 0;
                        }

                        arg29.ai(gs.lt, hq.by * v20 + 180, hq.bp * v19 + 44, 0xFFFF00, 0, arg33);
                        v7 = hq.bp * v19 + 58;
                        int v6 = v8 - hq.au.ae / v12;
                        v15.ag(hq.au, v6, v7, v10_1);
                        v15.ag(eh.am[v21], v6 + 4, v7 + 4, v10_1);
                        v21 = eh.am[v21].ae / v12 + bi.bt * v18 + 3;
                        arg29.ai(v24, v21, v7 + 26, 0xFFFFFF, 0, arg33);
                        v7 += hq.au.ar + 6;
                        v15.ag(hq.au, v8 - hq.au.ae / v12, v7, v10_1);
                        v15.ag(eh.am[0], v6 + 5, v7 + 4, v10_1);
                        arg29.ai(gs.lv, v21, v7 + 26, 0xFFFFFF, 0, arg33);
                    }
                    else {
                    label_482:
                        arg29.ai(gs.lt, hq.by * v20 + 180, v4, 0xFFFF00, 0, arg33);
                        v3 = v8 - 0x99;
                        v8 = hq.bp * v19 + 100 + v9 - 20;
                        v15.ag(in.ai, v3, v8, v10_1);
                        arg29.av(gs.li, v3, v8, 0x90, 40, 0xFFFFFF, 0, 1, 1, 0, arg33);
                        v3 = hq.by * v20 + 0xBB;
                        v15.ag(in.ai, v3, v8, 1);
                        arg29.av(gs.lx, v3, v8, 0x90, 40, 0xFFFFFF, 0, 1, 1, 0, arg33);
                    }

                    if(client.al.abd(0x6F1EB116) == 3) {
                        goto label_361;
                    }

                    v9 = hq.bp * v19 + 0xAE;
                    if(hq.fe * 0x61810D62574D4ADL == -1) {
                        goto label_361;
                    }

                    if(v16 < hq.fe * 0x61810D62574D4ADL) {
                        goto label_361;
                    }

                    if(hq.fd * -8957420507059323547L != -1 && v16 >= hq.fd * -8957420507059323547L + 5000) {
                        goto label_361;
                    }

                    iz v1_4 = dc.bf(0xAA78F1F1);
                    v2 = "All game data synchronised";
                    v3 = v14.ar(v2);
                    v10 = hq.by * v20 + 30;
                    if(v1_4 != null) {
                        v1_1 = cx.ba(14);
                        StringBuilder v5 = new StringBuilder();
                        v5.append("Synchronising game data - ");
                        v5.append("99.11%");
                        v5_1 = v14.ar(v5.toString());
                        v19_1 = "Synchronising game data - " + hq.eb.format(((double)((((float)v1_1)) / 100f))) + "%";
                        v11 = v1_1 * 300 / 10000;
                        v21 = v5_1;
                        v12 = 0x31C3E7;
                    }
                    else {
                        v19_1 = v2;
                        v21 = v3;
                        v11 = 300;
                        v12 = 9226041;
                    }

                    v7 = 304;
                    if(-1 != hq.fd * -8957420507059323547L && v16 > hq.fd * -8957420507059323547L + 4700) {
                        v6_1 = 1f - (((float)(v16 - hq.fd * -8957420507059323547L - 4700))) / 300f;
                        goto label_640;
                    }
                    else if(v16 < hq.fe * 0x61810D62574D4ADL + 300) {
                        v6_1 = (((float)(v16 - hq.fe * 0x61810D62574D4ADL))) / 300f;
                    label_640:
                        v8_1 = v6_1;
                    }
                    else {
                        v8_1 = 1f;
                    }

                    v15.et(hq.fi, 196222104);
                    if(v8_1 != 1f) {
                        v1_1 = ((int)(hq.eh.ax(v8_1, 0) * 304f));
                        v2_1 = hq.by * v20 + 180 - v1_1 / 2;
                        v3 = v9 - 14;
                        arg33.ef(v2_1, v3, v1_1 + v2_1, v3 + 20, 0x6806365D);
                    }

                    int v24_1 = ((int)(128f * v8_1));
                    arg33.fy(v10 - 2, v9 - 14, v7, 20, v12, v24_1, 0x89F16204);
                    arg33.ae(v10, v9 - 12, v11, 16, v12, v24_1, 1102997132);
                    arg30.ab(v19_1, hq.by * v20 + 180 - v21 / 2, v9, 0xFFFFFF, 0, ((int)(v8_1 * 255f)), arg33);
                    v15.fa(hq.fi, -989494300);
                    goto label_361;
                }
                else {
                    int v13_1 = 2;
                    if(1 == hq.cm * v21) {
                        arg29.ai(hq.ct, hq.by * v20 + 180, hq.bp * v19 + 30, 0xFFFF00, 0, arg33);
                        v9 = hq.bp * v19 + 65;
                        arg29.ai(hq.cu, hq.by * v20 + 180, v9, 0xFFFFFF, 0, arg33);
                        v9 += v8;
                        arg29.ai(hq.cq, hq.by * v20 + 180, v9, 0xFFFFFF, 0, arg33);
                        arg29.ai(hq.cv, hq.by * v20 + 180, v9 + 15, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 100;
                        v1_1 = hq.bp * v19 + 150;
                        v8 = v1_1 - 20;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        v9 = v1_1 + 5;
                        arg29.ai(gs.aj, v3, v9, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 260;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        arg29.ai(gs.lb, v3, v9, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    v11 = 5;
                    if(v13_1 == hq.cm * v21) {
                        v9 = hq.bp * v19 + 30;
                        arg29.ai(hq.cu, bi.bt * v18, v9, 0xFFFF00, 0, arg33);
                        v9 += v8;
                        arg29.ai(hq.cq, bi.bt * v18, v9, 0xFFFF00, 0, arg33);
                        v9 += v8;
                        arg29.ai(hq.cv, bi.bt * v18, v9, 0xFFFF00, 0, arg33);
                        v9 = v9 + v8 + 7;
                        arg29.aq(gs.lf, bi.bt * v18 - 110, v9, 0xFFFFFF, 0, arg33);
                        v1_1 = 200;
                        v2 = en.an(964043593);
                        v13 = arg29;
                        while(v13.ar(v2) > v1_1) {
                            v2 = v2.substring(1);
                        }

                        v1_2 = new StringBuilder();
                        v1_2.append(od.ad(v2));
                        v2_1 = hq.dq * 0xF4A0196B == 0 ? 1 : 0;
                        v3 = client.bj * -2077001153 % 40 < 20 ? 1 : 0;
                        v2 = (v2_1 & v3) != 0 ? im.al(0xFFFF00, 0x226FF436) + jc.ae : "";
                        v1_2.append(v2);
                        v10 = 20;
                        arg29.aq(v1_2.toString(), bi.bt * v18 - 70, v9, 0xFFFFFF, 0, arg33);
                        v4 = v9 + 15;
                        v1_2 = new StringBuilder();
                        v1_2.append(gs.lg);
                        v1_2.append(ff.az(hq.co, 0xC52642B0));
                        v2_1 = 1 == hq.dq * 0xF4A0196B ? 1 : 0;
                        v3 = client.bj * -2077001153 % 40 < v10 ? 1 : 0;
                        v2 = (v2_1 & v3) != 0 ? im.al(0xFFFF00, 0xEFC5D3FF) + jc.ae : "";
                        v1_2.append(v2);
                        arg29.aq(v1_2.toString(), bi.bt * v18 - 108, v4, 0xFFFFFF, 0, arg33);
                        v8 = hq.bp * v19 + 106;
                        v1_1 = bi.bt * v18 - 0x75;
                        ef v2_3 = fl.ar(client.er, hq.de, -171803239);
                        v15.ag(v2_3, v1_1, v8, 1);
                        v9 = v8 + 13;
                        arg30.aq(gs.lq, v1_1 + (v2_3.ae + v11), v9, 0xFFFF00, 0, arg33);
                        v1_1 = bi.bt * v18 + 24;
                        v2_3 = fl.ar(li.rg.aj, hq.dk, -382872300);
                        v15.ag(v2_3, v1_1, v8, 1);
                        arg30.aq(gs.lo, v1_1 + (v2_3.ae + v11), v9, 0xFFFF00, 0, arg33);
                        v3 = bi.bt * v18 - 80;
                        v1_1 = hq.bp * v19 + 150;
                        v8 = v1_1 - 20;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        v9 = v1_1 + 5;
                        arg29.ai(gs.lc, v3, v9, 0xFFFFFF, 0, arg33);
                        v3 = bi.bt * v18 + 80;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        arg29.ai(gs.lb, v3, v9, 0xFFFFFF, 0, arg33);
                        v4 = hq.bp * v19 + 0xBA;
                        dl.cn = hq.cz * 0x2D49CD0F != 2 ? gs.mu : gs.mm;
                        em.cl = new or(bi.bt * v18, v4, v14.ar(dl.cn), 11);
                        dq.ck = new or(bi.bt * v18, v4, v14.ar(gs.mk), 11);
                        arg30.ai(dl.cn, bi.bt * v18, v4, 0xFFFFFF, 0, arg33);
                        if(client.al.abd(0x74FE4DFF) != 3) {
                            if(client.al.abd(1841205991) == 2) {
                            }
                            else {
                                goto label_361;
                            }
                        }

                        v1_1 = hq.bp * v19 + 210;
                        v2_1 = bi.bt * v18 - hq.au.ae / 2;
                        v15.ag(hq.au, v2_1, v1_1, 1);
                        v15.ag(eh.am[0], v2_1 + v11, v1_1 + 4, 1);
                        arg29.ai(gs.le, bi.bt * v18 + eh.am[1].ae / 2 + 3, v1_1 + 26, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    v10 = 20;
                    v13 = arg29;
                    if(3 == hq.cm * v21) {
                        v21 = hq.bp * v19 + 30;
                        arg29.ai(gs.ll, hq.by * v20 + 180, v21, 0xFFFF00, 0, arg33);
                        v21 += 20;
                        arg30.ai(gs.la, hq.by * v20 + 180, v21, 0xFFFF00, 0, arg33);
                        arg30.ai(gs.lu, hq.by * v20 + 180, v21 + 15, 0xFFFF00, 0, arg33);
                        v3 = hq.by * v20 + 180;
                        v1_1 = hq.bp * v19 + 100 + v11;
                        v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                        arg31.ai(gs.lw, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 180;
                        v1_1 = hq.bp * v19 + 0x9B;
                        v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                        arg31.ai(gs.ls, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(4 == hq.cm * v21) {
                        arg29.ai(gs.jj, hq.by * v20 + 180, hq.bp * v19 + 30, 0xFFFF00, 0, arg33);
                        v21 = hq.bp * v19 + 65;
                        arg29.ai(hq.cu, hq.by * v20 + 180, v21, 0xFFFFFF, 0, arg33);
                        v21 += 15;
                        arg29.ai(hq.cq, hq.by * v20 + 180, v21, 0xFFFFFF, 0, arg33);
                        v21 += 15;
                        arg29.ai(hq.cv, hq.by * v20 + 180, v21, 0xFFFFFF, 0, arg33);
                        v21 += 15;
                        v1_2 = new StringBuilder();
                        v1_2.append(gs.lk);
                        v1_2.append(ff.az(da.ds, 0xC52642B0));
                        v2 = client.bj * -2077001153 % 40 < v10 ? im.al(0xFFFF00, 0xA7F1BB0E) + jc.ae : "";
                        v1_2.append(v2);
                        arg29.aq(v1_2.toString(), hq.by * v20 + 72, v21, 0xFFFFFF, 0, arg33);
                        v21 += -8;
                        arg29.aq(gs.ab, hq.by * v20 + 0xAB, v21, 0xFFFF00, 0, arg33);
                        v21 += 15;
                        arg29.aq(gs.af, hq.by * v20 + 0xAB, v21, 0xFFFF00, 0, arg33);
                        v1_1 = hq.by * v20 + 0xAB + v13.ar(gs.af) + v8;
                        v2_1 = v21 - v13.aj;
                        ef v3_1 = hq.dy ? oa.as : bz.aw;
                        v15.ag(v3_1, v1_1, v2_1, 1);
                        v3 = hq.by * v20 + 100;
                        v8 = hq.bp * v19 + 150;
                        v7 = v8 - 20;
                        v15.ag(in.ai, v3 - 73, v7, 1);
                        v19 = v8 + 5;
                        arg29.ai(gs.aj, v3, v19, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 260;
                        v15.ag(in.ai, v3 - 73, v7, 1);
                        arg29.ai(gs.lb, v3, v19, 0xFFFFFF, 0, arg33);
                        arg30.ai(gs.jw, hq.by * v20 + 180, v8 + 36, 0xFF, 0, arg33);
                        goto label_361;
                    }

                    if(hq.cm * v21 == v11) {
                        arg29.ai(gs.ld, hq.by * v20 + 180, hq.bp * v19 + 30, 0xFFFF00, 0, arg33);
                        v9 = hq.bp * v19 + 50;
                        arg31.ai(hq.cu, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        v9 += v8;
                        arg31.ai(hq.cq, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        v9 += v8;
                        arg31.ai(hq.cv, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        v8 = v9 + v8 + 14;
                        arg29.aq(gs.my, hq.by * v20 + 35, v8, 0xFFFFFF, 0, arg33);
                        v1_1 = 0xAE;
                        for(v2 = en.an(0xE3120278); v13.ar(v2) > v1_1; v2 = v2.substring(1)) {
                        }

                        v1_2 = new StringBuilder();
                        v1_2.append(od.ad(v2));
                        v2 = client.bj * -2077001153 % 40 < v10 ? im.al(0xFFFF00, 911369140) + jc.ae : "";
                        v1_2.append(v2);
                        arg29.aq(v1_2.toString(), hq.by * v20 + 0x92, v8, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 100;
                        v1_1 = hq.bp * v19 + 150;
                        v8 = v1_1 - 20;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        v9 = v1_1 + 5;
                        arg29.ai(gs.me, v3, v9, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 260;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        arg29.ai(gs.mh, v3, v9, 0xFFFFFF, 0, arg33);
                        arg30.ai(gs.mk, bi.bt * v18, hq.bp * v19 + 0xB9, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(hq.cm * v21 == 6) {
                        v9 = hq.bp * v19 + 30;
                        arg29.ai(hq.cu, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        v9 += v8;
                        arg29.ai(hq.cq, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        arg29.ai(hq.cv, hq.by * v20 + 180, v9 + 15, 0xFFFF00, 0, arg33);
                        v3 = hq.by * v20 + 180;
                        v1_1 = hq.bp * v19 + 150;
                        v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                        arg29.ai(gs.mh, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(hq.cm * v21 == 7) {
                        v9 = hq.bp * v19 + 45;
                        arg29.ai(gs.nj, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        v9 += v8;
                        arg31.ai(gs.nu, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        arg31.ai(gs.nm, hq.by * v20 + 180, v9 + 15, 0xFFFF00, 0, arg33);
                        v3 = hq.by * v20 + 100;
                        v1_1 = hq.bp * v19 + 150;
                        v8 = v1_1 - 20;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        v9 = v1_1 + 5;
                        arg29.ai(gs.nh, v3, v9, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 260;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        arg29.ai(gs.mh, v3, v9, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(hq.cm * v21 == 8) {
                        v9 = hq.bp * v19 + 45;
                        arg29.ai(hq.cu, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        v9 += v8;
                        arg31.ai(hq.cq, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                        arg31.ai(hq.cv, hq.by * v20 + 180, v9 + 15, 0xFFFF00, 0, arg33);
                        v3 = hq.by * v20 + 100;
                        v1_1 = hq.bp * v19 + 150;
                        v8 = v1_1 - 20;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        v9 = v1_1 + 5;
                        arg29.ai(gs.fo, v3, v9, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 260;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        arg29.ai(gs.mh, v3, v9, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(9 == hq.cm * v21) {
                        v8 = hq.bp * v19 + 50;
                        arg29.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg33);
                        v8 += 25;
                        arg29.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg33);
                        arg29.ai(hq.cv, hq.by * v20 + 180, v8 + 25, 0xFFFF00, 0, arg33);
                        v3 = hq.by * v20 + 180;
                        v1_1 = hq.bp * v19 + 140;
                        v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                        arg29.ai(gs.lw, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(10 == hq.cm * v21) {
                        v9 = hq.by * v20 + 180;
                        v21 = hq.bp * v19 + 38;
                        arg29.ai(gs.lt, hq.by * v20 + 180, v21, 0xFFFF00, 0, arg33);
                        v1_1 = v21 + 20;
                        v15.ag(hq.av, v9 - 109, v1_1, 1);
                        if(je.ap(hq.dv, 0x2E33B013).isEmpty()) {
                            v15.ag(li.aa, v9 - 0x30, v1_1 + 18, 1);
                        }
                        else {
                            v15.ag(li.aa, v9 - 0x30, v1_1 + 5, 1);
                            arg29.ai(hq.dv, v9, v1_1 + 53, 0xFFFF00, 0, arg33);
                        }

                        v1_1 = hq.bp * v19 + 140;
                        v15.ag(in.ai, v9 - 73, v1_1, 1);
                        arg29.ai("Sign out", v9, v1_1 + 25, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(11 == hq.cm * v21) {
                        arg29.ai("Are you sure you want to sign out?", hq.by * v20 + 180, hq.bp * v19 + 80, 0xFFFF00, 0, arg33);
                        v3 = hq.by * v20 + 100;
                        v1_1 = hq.bp * v19 + 100 + v10;
                        v8 = v1_1 - 20;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        v9 = v1_1 + 5;
                        arg29.ai("Yes", v3, v9, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 260;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        arg29.ai("No", v3, v9, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(hq.cm * v21 == 12) {
                        v8 = bi.bt * v18;
                        v9 = hq.bp * v19 + 45;
                        arg31.ai(gs.ny, v8, v9, 0xFFFFFF, 0, arg33);
                        v9 += 17;
                        arg31.ai(gs.os, v8, v9, 0xFFFFFF, 0, arg33);
                        v9 += 17;
                        arg31.ai(gs.oa, v8, v9, 0xFFFFFF, 0, arg33);
                        arg31.ai(gs.of, v8, v9 + 17, 0xFFFFFF, 0, arg33);
                        v3 = bi.bt * v18 - 80;
                        v1_1 = hq.bp * v19 + 140;
                        v8 = v1_1 - 20;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        v9 = v1_1 + 5;
                        arg29.ai(gs.oy, v3, v9, 0xFFFFFF, 0, arg33);
                        v3 = bi.bt * v18 + 80;
                        v15.ag(in.ai, v3 - 73, v8, 1);
                        arg29.ai(gs.om, v3, v9, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(hq.cm * v21 == 13) {
                        v8 = hq.bp * v19 + 60;
                        arg31.ai(gs.ob, hq.by * v20 + 180, v8, 0xFFFFFF, 0, arg33);
                        arg31.ai(gs.op, hq.by * v20 + 180, v8 + 20, 0xFFFFFF, 0, arg33);
                        v3 = hq.by * v20 + 180;
                        v1_1 = hq.bp * v19 + 140;
                        v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                        arg29.ai(gs.mh, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                        goto label_361;
                    }

                    if(hq.cm * v21 != 14) {
                        goto label_2130;
                    }

                    v9 = hq.bp * v19 + 30;
                    switch(hq.ch * 0x803A91D9) {
                        case 0: {
                            goto label_2055;
                        }
                        case 1: {
                            goto label_2049;
                        }
                    }

                    ht.ah(false, 0x78F2258D);
                    goto label_2061;
                label_2049:
                    ax.bf(gs.dl, gs.dr, gs.dn, 0x63D3C206);
                    goto label_2061;
                label_2055:
                    ax.bf(gs.cj, gs.cd, gs.cf, 0x63D3C206);
                label_2061:
                    arg29.ai(hq.cu, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                    v9 += v8;
                    arg31.ai(hq.cq, hq.by * v20 + 180, v9, 0xFFFF00, 0, arg33);
                    arg31.ai(hq.cv, hq.by * v20 + 180, v9 + 15, 0xFFFF00, 0, arg33);
                    v3 = hq.by * v20 + 180;
                    v1_1 = hq.bp * v19 + 100 + v11;
                    v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                    arg29.ai(gs.bx, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                    v3 = hq.by * v20 + 180;
                    v1_1 = hq.bp * v19 + 0x9B;
                    v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                    arg29.ai(gs.mh, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                    goto label_361;
                label_2130:
                    if(16 != hq.cm * v21) {
                        if(hq.cm * v21 == 19) {
                        }
                        else {
                            if(hq.cm * v21 != 17) {
                                if(hq.cm * v21 == 18) {
                                }
                                else {
                                    if(hq.cm * v21 != v8) {
                                        if(23 == hq.cm * v21) {
                                        }
                                        else if(21 == hq.cm * v21) {
                                            v8 = bi.bt * v18;
                                            v9 = hq.bp * v19 + 45;
                                            arg31.ai(gs.oe, v8, v9, 0xFFFFFF, 0, arg33);
                                            v9 += 17;
                                            arg31.ai(gs.od, v8, v9, 0xFFFFFF, 0, arg33);
                                            v9 += 17;
                                            arg31.ai(gs.ox, v8, v9, 0xFFFFFF, 0, arg33);
                                            arg31.ai(gs.oq, v8, v9 + 17, 0xFFFFFF, 0, arg33);
                                            v3 = bi.bt * v18 - 80;
                                            v1_1 = hq.bp * v19 + 140;
                                            v8 = v1_1 - 20;
                                            v15.ag(in.ai, v3 - 73, v8, 1);
                                            v9 = v1_1 + 5;
                                            arg29.ai(gs.oy, v3, v9, 0xFFFFFF, 0, arg33);
                                            v3 = bi.bt * v18 + 80;
                                            v15.ag(in.ai, v3 - 73, v8, 1);
                                            arg29.ai(gs.lb, v3, v9, 0xFFFFFF, 0, arg33);
                                            goto label_361;
                                        }
                                        else {
                                            if(22 == hq.cm * v21) {
                                                v8 = hq.bp * v19 + 50;
                                                arg29.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg33);
                                                v8 += 25;
                                                arg31.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg33);
                                                arg31.ai(hq.cv, hq.by * v20 + 180, v8 + 25, 0xFFFF00, 0, arg33);
                                                v3 = hq.by * v20 + 180;
                                                v1_1 = hq.bp * v19 + 130;
                                                v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                                                arg29.ai(gs.gu, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                                            }
                                            else if(24 == hq.cm * v21) {
                                                v8 = hq.bp * v19 + 50;
                                                arg29.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg33);
                                                v8 += 25;
                                                arg31.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg33);
                                                arg31.ai(hq.cv, hq.by * v20 + 180, v8 + 25, 0xFFFF00, 0, arg33);
                                                v3 = hq.by * v20 + 180;
                                                v1_1 = hq.bp * v19 + 140;
                                                v15.ag(in.ai, v3 - 73, v1_1 - 20, 1);
                                                arg29.ai(gs.an, v3, v1_1 + 5, 0xFFFFFF, 0, arg33);
                                            }
                                            else {
                                            }

                                            goto label_361;
                                        }
                                    }

                                    v8 = hq.bp * v19 + 50;
                                    arg29.ai(hq.cu, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg33);
                                    v8 += 25;
                                    arg29.ai(hq.cq, hq.by * v20 + 180, v8, 0xFFFF00, 0, arg33);
                                    arg29.ai(hq.cv, hq.by * v20 + 180, v8 + 25, 0xFFFF00, 0, arg33);
                                    goto label_361;
                                }
                            }

                            v9 = hq.bp * v19 + 30;
                            arg29.ai(hq.cu, bi.bt * v18, v9, 0xFFFF00, 0, arg33);
                            v9 += v8;
                            arg29.ai(hq.cq, bi.bt * v18, v9, 0xFFFF00, 0, arg33);
                            arg29.ai(hq.cv, bi.bt * v18, v9 + 15, 0xFFFF00, 0, arg33);
                        label_361:
                            v13_2 = 1;
                            goto label_2514;
                        }
                    }

                    v9 = hq.bp * v19 + 30;
                    arg29.ai(hq.cu, bi.bt * v18, v9, 0xFFFF00, 0, arg33);
                    v9 += v8;
                    arg29.ai(hq.cq, bi.bt * v18, v9, 0xFFFF00, 0, arg33);
                    arg29.ai(hq.cv, bi.bt * v18, v9 + 15, 0xFFFF00, 0, arg33);
                    v1_5 = hq.cm * v21 == 16 ? gs.kw : gs.kg;
                    v2 = v1_5;
                    v5_1 = hq.by * v20 + 27;
                    v9 = hq.bp * v19 + 100 + v10 - 20;
                    v15.ag(in.ai, v5_1, v9, 1);
                    v13_2 = 1;
                    arg29.av(v2, v5_1, v9, 0x90, 40, 0xFFFFFF, 0, 1, 1, 0, arg33);
                    v3 = hq.by * v20 + 0xBB;
                    v15.ag(in.ai, v3, v9, 1);
                    arg29.av(gs.kq, v3, v9, 0x90, 40, 0xFFFFFF, 0, 1, 1, 0, arg33);
                }
            }
            else {
                goto label_361;
            }

        label_2514:
            if(v16 >= hq.fl * -611935993406195833L) {
                cl.ac.ae(hq.ab * 0x4D586FC3 - 22, client.bj * -2077001153, v15, -78);
                cl.ac.ae(hq.ab * 0x4D586FC3 + 659, client.bj * -2077001153, v15, -17);
            }

            ef[] v1_6 = ax.ay;
            v2_1 = li.rg.ar ? 1 : 0;
            v15.ag(v1_6[v2_1], hq.ab * 0x4D586FC3 + 710, 0x1C0, v13_2);
            if(client.ac * 0x498EF1C3 > 5 && ly.ax == en.af) {
                if(dy.ey != null) {
                    v8 = hq.ab * 0x4D586FC3 + 20;
                    v15.ag(dy.ey, v8, 0x1C0, v13_2);
                    arg29.ai(gs.hc + " " + client.ae * 0x8076F529, v8 + 50, 0x1CF, 0xFFFFFF, 0, arg33);
                    if(li.ab != null) {
                        arg30.ai(gs.ne, v8 + 50, 477, 0xFFFFFF, 0, arg33);
                    }
                    else {
                        v1_5 = client.al.au ? gs.ni : gs.ns;
                        arg30.ai(v1_5, v22 + v8, 477, 0xFFFFFF, 0, arg33);
                    }
                }
                else {
                    dy.ey = aa.aq(eo.dh, "sl_button", "", -33);
                }

                v8 = 11;
                v9 = bi.bt * v18;
                v1_1 = Calendar.getInstance().get(v13_2);
                v2 = gs.nl;
                arg30.ai(String.format(v2, Integer.valueOf(v1_1)), v9, 465, 0xFFFFFF, 0, arg33);
                v11 = 477;
                arg30.ai(gs.nw, v9, v11, 0xFFFFFF, 0, arg33);
                if(jl.fk != null && bl.fv != null && eh.fc != null) {
                    return;
                }

                v9 -= v14.ar(gs.nw) / 2;
                v1_1 = v14.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nr))) + v9;
                v2_1 = v14.ar(gs.nw.substring(0, gs.nw.indexOf(gs.nb))) + v9;
                v9 += v14.ar(gs.nw.substring(0, gs.nw.indexOf(gs.ng)));
                jl.fk = new or(v1_1, v11, v14.ar(gs.nr), v8);
                bl.fv = new or(v2_1, v11, v14.ar(gs.nb), v8);
                eh.fc = new or(v9, v11, v14.ar(gs.ng), v8);
            }
        }
        catch(RuntimeException v0) {
            v2_2 = new StringBuilder();
            v2_2.append("dw.ba(");
            v2_2.append(')');
            throw lx.al(v0, v2_2.toString());
        }
    }

    static final void bh(int arg2) {
        try {
            Iterator v2_1 = gc.ra.iterator();
            while(v2_1.hasNext()) {
                v2_1.next().ar();
            }

            ii.au.bf(0xC5FEF650);
            client.ct.ah(0xC7C4FB67);
            bi.cu.ah(0x2DA0AB45);
            bt.cv.ah(-560571323);
            fq.cg.ah(0x9AC8D185);
            ks.co.ah(0x89DBDE31);
            gn.dv.ah(0x32AF1A00);
            fr.dp.ah(0xDAAA217F);
            eo.dh.ah(-1480858487);
            lm.dw.ah(0xAD678D2);
            ey.db.ah(0xB9AB8506);
            fz.du.ah(0xEEE27A36);
            ih.dm.ah(-1717901348);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dw.bh(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static final int bp(int arg8, double arg9) {
        double v2 = 256;
        double v0 = (((double)(arg8 >> 16 & 0xFF))) / v2;
        double v4 = (((double)(arg8 >> 8 & 0xFF))) / v2;
        double v6 = (((double)(arg8 & 0xFF))) / v2;
        try {
            return arg8 & 0xFF000000 | (((int)(Math.pow(v6, arg9) * v2))) + (((((int)(Math.pow(v0, arg9) * v2))) << 16) + ((((int)(Math.pow(v4, arg9) * v2))) << 8));
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("dw.bp(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    static boolean bx(int arg1, int arg2) {
        try {
            if(client.al.aba(0x1DB56721).fg(-3558)) {
                return 0;
            }

            hq.cm = 0xBEF6A45C;
            hq.da = arg1 * -633703253;
            return 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dw.bx(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return 0;
    }
}

