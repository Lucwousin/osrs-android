import java.io.File;

public class fg {
    static final fg ae = null;
    public static final int aj = -1;
    static final fg al = null;
    public final String an;
    final int ap;
    static final fg ar = null;
    static final int av = 4700;
    static final fg ax = null;
    public static final int cz = 89;
    static int hb;

    static {
        fg.ax = new fg("LIVE", 0);
        fg.al = new fg("BUILDLIVE", 3);
        fg.ae = new fg("RC", 1);
        fg.ar = new fg("WIP", 2);
    }

    fg(String arg2, int arg3) {
        try {
            super();
            this.an = arg2;
            this.ap = arg3 * 0xF2F9259D;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fg.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static final boolean ae(int arg25, int arg26, gx arg27, gy arg28, int arg29) {
        int v23;
        int v22;
        int v19;
        int v4;
        int v5;
        int v14;
        int v13;
        gy v6 = arg28;
        int v7 = arg25 - 0x40;
        int v8 = arg26 - 0x40;
        try {
            gb.ae[0x40][0x40] = 99;
            gb.ar[0x40][0x40] = 0;
            gb.ad[0] = arg25;
            gb.aq[0] = arg26;
            int[][] v10 = v6.bx;
            int v1 = arg25;
            int v2 = arg26;
            int v0_1 = 0;
            int v12 = 1;
            while(true) {
                v13 = -2009184621;
                v14 = 0xE6F2E44B;
                if(v0_1 == v12) {
                    break;
                }

                int v15 = gb.ad[v0_1];
                int v16 = gb.aq[v0_1];
                int v17 = v15 - v6.by * 0xD3E61C35;
                int v18 = v16 - v6.bt * 0x2144FD29;
                int v9 = v16 - v8;
                int v20 = v15 - v7;
                int v21 = v0_1 + 1 & 0xFFF;
                if(arg27.ax(2, v15, v16, arg28, -94)) {
                    gb.an = v15 * v14;
                    gb.ap = v16 * v13;
                    return 1;
                }

                v1 = v20;
                v0_1 = gb.ar[v1][v9] + 1;
                v2 = 0x1240138;
                int v3 = 0x124010E;
                if(v1 > 0) {
                    v5 = v1 - 1;
                    if(gb.ae[v5][v9] != 0) {
                    }
                    else {
                        v4 = v17 - 1;
                        if((v10[v4][v18] & v3) != 0) {
                        }
                        else if((v10[v4][v18 + 1] & v2) != 0) {
                        }
                        else {
                            gb.ad[v12] = v15 - 1;
                            gb.aq[v12] = v16;
                            v12 = v12 + 1 & 0xFFF;
                            gb.ae[v5][v9] = 2;
                            gb.ar[v5][v9] = v0_1;
                        }
                    }
                }

                v4 = 0x12401E0;
                v5 = 0x1240183;
                v13 = 0x7E;
                if(v1 < v13) {
                    v19 = v1 + 1;
                    if(gb.ae[v19][v9] != 0) {
                    }
                    else {
                        v14 = v17 + 2;
                        if((v10[v14][v18] & v5) != 0) {
                        }
                        else if((v10[v14][v18 + 1] & v4) != 0) {
                        }
                        else {
                            gb.ad[v12] = v15 + 1;
                            gb.aq[v12] = v16;
                            v12 = v12 + 1 & 0xFFF;
                            gb.ae[v19][v9] = 8;
                            gb.ar[v19][v9] = v0_1;
                        }
                    }
                }

                if(v9 > 0) {
                    v19 = v9 - 1;
                    if(gb.ae[v1][v19] != 0) {
                    }
                    else {
                        v20 = v18 - 1;
                        if((v10[v17][v20] & v3) != 0) {
                        }
                        else if((v10[v17 + 1][v20] & v5) != 0) {
                        }
                        else {
                            gb.ad[v12] = v15;
                            gb.aq[v12] = v16 - 1;
                            v12 = v12 + 1 & 0xFFF;
                            gb.ae[v1][v19] = 1;
                            gb.ar[v1][v19] = v0_1;
                        }
                    }
                }

                if(v9 < v13) {
                    v19 = v9 + 1;
                    if(gb.ae[v1][v19] != 0) {
                    }
                    else {
                        v20 = v18 + 2;
                        if((v10[v17][v20] & v2) != 0) {
                        }
                        else if((v10[v17 + 1][v20] & v4) != 0) {
                        }
                        else {
                            gb.ad[v12] = v15;
                            gb.aq[v12] = v16 + 1;
                            v12 = v12 + 1 & 0xFFF;
                            gb.ae[v1][v19] = 4;
                            gb.ar[v1][v19] = v0_1;
                        }
                    }
                }

                v14 = 0x124018F;
                v19 = 0x124013E;
                if(v1 > 0 && v9 > 0) {
                    v22 = v1 - 1;
                    v23 = v9 - 1;
                    if(gb.ae[v22][v23] != 0) {
                    }
                    else {
                        v20 = v17 - 1;
                        if((v10[v20][v18] & v19) != 0) {
                        }
                        else {
                            int v24 = v18 - 1;
                            if((v10[v20][v24] & v3) != 0) {
                            }
                            else if((v10[v17][v24] & v14) != 0) {
                            }
                            else {
                                gb.ad[v12] = v15 - 1;
                                gb.aq[v12] = v16 - 1;
                                v12 = v12 + 1 & 0xFFF;
                                gb.ae[v22][v23] = 3;
                                gb.ar[v22][v23] = v0_1;
                            }
                        }
                    }
                }

                if(v1 < v13 && v9 > 0) {
                    v20 = v1 + 1;
                    v22 = v9 - 1;
                    if(gb.ae[v20][v22] != 0) {
                    }
                    else {
                        v23 = v18 - 1;
                        if((v10[v17 + 1][v23] & v14) != 0) {
                        }
                        else {
                            v3 = v17 + 2;
                            if((v5 & v10[v3][v23]) != 0) {
                            }
                            else if((v10[v3][v18] & 0x12401E3) != 0) {
                            }
                            else {
                                gb.ad[v12] = v15 + 1;
                                gb.aq[v12] = v16 - 1;
                                v12 = v12 + 1 & 0xFFF;
                                gb.ae[v20][v22] = 9;
                                gb.ar[v20][v22] = v0_1;
                            }
                        }
                    }
                }

                v3 = 0x12401F8;
                if(v1 > 0 && v9 < v13) {
                    v14 = v1 - 1;
                    v20 = v9 + 1;
                    if(gb.ae[v14][v20] != 0) {
                    }
                    else {
                        v5 = v17 - 1;
                        if((v10[v5][v18 + 1] & v19) != 0) {
                        }
                        else {
                            v19 = v18 + 2;
                            if((v2 & v10[v5][v19]) != 0) {
                            }
                            else if((v10[v17][v19] & v3) != 0) {
                            }
                            else {
                                gb.ad[v12] = v15 - 1;
                                gb.aq[v12] = v16 + 1;
                                v12 = v12 + 1 & 0xFFF;
                                gb.ae[v14][v20] = 6;
                                gb.ar[v14][v20] = v0_1;
                            }
                        }
                    }
                }

                if(v1 < v13 && v9 < v13) {
                    ++v1;
                    v5 = v9 + 1;
                    if(gb.ae[v1][v5] != 0) {
                    }
                    else {
                        v9 = v18 + 2;
                        if((v10[v17 + 1][v9] & v3) != 0) {
                        }
                        else {
                            v17 += 2;
                            if((v10[v17][v9] & v4) != 0) {
                            }
                            else if((v10[v17][v18 + 1] & 0x12401E3) != 0) {
                            }
                            else {
                                gb.ad[v12] = v15 + 1;
                                gb.aq[v12] = v16 + 1;
                                gb.ae[v1][v5] = 12;
                                gb.ar[v1][v5] = v0_1;
                                v12 = v12 + 1 & 0xFFF;
                            }
                        }
                    }
                }

                v1 = v15;
                v2 = v16;
                v0_1 = v21;
            }

            gb.an = v1 * v14;
            gb.ap = v2 * v13;
            return 0;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("fg.ae(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    static fg[] ae() {
        return new fg[]{fg.ax, fg.ar, fg.ae, fg.al};
    }

    public static fs[] al(int arg2) {
        arg2 = 6;
        try {
            fs[] v2_1 = new fs[arg2];
            v2_1[0] = fs.ae;
            v2_1[1] = fs.al;
            v2_1[2] = fs.ap;
            v2_1[3] = fs.an;
            v2_1[4] = fs.ar;
            v2_1[5] = fs.ax;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fg.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static final void al(lo arg3, int arg4, int arg5) {
        try {
            int v0 = 0xF24F550B;
            arg5 = arg3.ar * v0;
            ho.av = 0;
            ce.ae(arg3, 67);
            fd.aj(arg3, -47);
            if(arg3.ar * v0 - arg5 == arg4) {
                return;
            }

            StringBuilder v2 = new StringBuilder();
            v2.append(arg3.ar * v0 - arg5);
            v2.append(" ");
            v2.append(arg4);
            throw new RuntimeException(v2.toString());
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("fg.al(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public static boolean an(int arg1, int arg2) {
        try {
            if(arg1 != ga.ao.as * 0x675599ED) {
                return false;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("fg.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        boolean v1_1 = true;
        return v1_1;
    }

    static int ap(int arg7, hl arg8, boolean arg9, int arg10) {
        int v6;
        int[] v7_1;
        arg10 = -1;
        int v0 = 0x4A90AB9;
        int v1 = 1304812425;
        if(arg7 >= 2000) {
            arg7 += -1000;
            try {
                int[] v8 = il.aj;
                int v9 = il.ad - v0;
                il.ad = v9;
                int v8_1 = v8[v9 * v1];
                ar v9_1 = bl.al(v8_1, 0x64D7CF4D);
                goto label_23;
            label_17:
                ar v8_2 = arg9 ? il.aa : dw.av;
                v9_1 = v8_2;
                v8_1 = -1;
            label_23:
                int v3 = 0x9521572;
                if(1100 == arg7) {
                    il.ad -= v3;
                    dp.gy(v9_1, il.aj[il.ad * v1], il.aj[il.ad * v1 + 1], 0x7EBB231E);
                    return 1;
                }

                if(1101 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.bk = v7_1[v8_1 * v1] * 1986505587;
                    kx.gw(v9_1, 0x7F139CD6);
                    return 1;
                }

                boolean v5 = false;
                if(arg7 == 1102) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    if(v7_1[v8_1 * v1] == 1) {
                        v5 = true;
                    }

                    v9_1.bs = v5;
                    kx.gw(v9_1, 0x7FB04CD3);
                    return 1;
                }

                if(arg7 == 0x44F) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.bl = v7_1[v8_1 * v1] * 0xAE3ED1F5;
                    kx.gw(v9_1, 0x7F0640EA);
                    return 1;
                }

                if(arg7 == 0x450) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.bi = v7_1[v8_1 * v1] * -1171804701;
                    kx.gw(v9_1, 0x7F640051);
                    return 1;
                }

                if(1105 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.cj = v7_1[v8_1 * v1] * -1904294097;
                    kx.gw(v9_1, 0x7FCE2E7D);
                    return 1;
                }

                if(1106 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.cf = v7_1[v8_1 * v1] * 0x31345FFB;
                    kx.gw(v9_1, 0x7F95E408);
                    return 1;
                }

                if(1107 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    if(v7_1[v8_1 * v1] == 1) {
                        v5 = true;
                    }

                    v9_1.cx = v5;
                    kx.gw(v9_1, 0x7FE31DB9);
                    return 1;
                }

                if(arg7 == 1108) {
                    v9_1.cp = 1499206063;
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.ci = v7_1[v8_1 * v1] * 0x6015A63B;
                    kx.gw(v9_1, 0x7FA405B4);
                    return 1;
                }

                v6 = 2;
                if(arg7 == 1109) {
                    il.ad -= 0x1BF64056;
                    v9_1.cz = il.aj[il.ad * v1] * 0x330632D9;
                    v9_1.cn = il.aj[il.ad * v1 + 1] * 0xDB84F7C3;
                    v9_1.cl = il.aj[il.ad * v1 + v6] * 0xE766F0B9;
                    v9_1.ck = il.aj[il.ad * v1 + 3] * 0x6778A1C7;
                    v9_1.cm = il.aj[il.ad * v1 + 4] * 0xD35B4CEB;
                    v9_1.ct = il.aj[il.ad * v1 + 5] * 0x2CDAC8F9;
                    kx.gw(v9_1, 0x7F912F21);
                    return 1;
                }

                if(1110 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    arg7 = v7_1[v8_1 * v1];
                    if(v9_1.ce * 0xC2A43CD1 != arg7) {
                        v9_1.ce = arg7 * 0xDB19C31;
                        v9_1.fw = 0;
                        v9_1.ft = 0;
                        kx.gw(v9_1, 0x7FEB38C1);
                    }

                    return 1;
                }

                if(arg7 == 0x457) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    if(v7_1[v8_1 * v1] == 1) {
                        v5 = true;
                    }

                    v9_1.cv = v5;
                    kx.gw(v9_1, 0x7FABBD85);
                    return 1;
                }

                if(0x458 == arg7) {
                    String[] v7_2 = il.aq;
                    v8_1 = ft.ab + 0x705DCADB;
                    ft.ab = v8_1;
                    String v7_3 = v7_2[v8_1 * 0xBC5CDEAD];
                    if(!v7_3.equals(v9_1.dp)) {
                        v9_1.dp = v7_3;
                        kx.gw(v9_1, 0x7F5DBE0C);
                    }

                    return 1;
                }

                if(0x459 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.dv = v7_1[v8_1 * v1] * 0xA30F5C01;
                    kx.gw(v9_1, 0x7FBD24F2);
                    return 1;
                }

                if(0x45A == arg7) {
                    il.ad -= 0xDFB202B;
                    v9_1.db = il.aj[il.ad * v1] * 630601259;
                    v9_1.du = il.aj[il.ad * v1 + 1] * 1060448983;
                    v9_1.dw = il.aj[il.ad * v1 + v6] * 0x4C0B2F71;
                    kx.gw(v9_1, 0x7F1C2489);
                    return 1;
                }

                if(arg7 == 0x45B) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    if(v7_1[v8_1 * v1] == 1) {
                        v5 = true;
                    }

                    v9_1.dm = v5;
                    kx.gw(v9_1, 0x7FB1AEB1);
                    return 1;
                }

                if(arg7 == 0x45C) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.cb = v7_1[v8_1 * v1] * 1901270207;
                    kx.gw(v9_1, 0x7F905251);
                    return 1;
                }

                if(0x45D == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.cy = v7_1[v8_1 * v1] * 0x6E2FE0A5;
                    kx.gw(v9_1, 0x7F5F71C1);
                    return 1;
                }

                if(arg7 == 0x45E) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    if(v7_1[v8_1 * v1] == 1) {
                        v5 = true;
                    }

                    v9_1.cw = v5;
                    kx.gw(v9_1, 0x7FF94232);
                    return 1;
                }

                if(arg7 == 0x45F) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    if(v7_1[v8_1 * v1] == 1) {
                        v5 = true;
                    }

                    v9_1.cc = v5;
                    kx.gw(v9_1, 0x7F5634FC);
                    return 1;
                }

                if(0x460 == arg7) {
                    il.ad -= v3;
                    v9_1.bb = il.aj[il.ad * v1] * 0x75269029;
                    v9_1.bc = il.aj[il.ad * v1 + 1] * 400015593;
                    kx.gw(v9_1, 0x7F22FDAC);
                    if(arg10 != v8_1 && v9_1.ay * 0x4A7987DB == 0) {
                        ad.fw(ar.aj[v8_1 >> 16], v9_1, false, 0xA23661E5);
                    }

                    return 1;
                }

                if(arg7 == 0x461) {
                    ck.fc(v9_1.ah * 971580097, v9_1.at * 990760021, -35);
                    client.lp = v9_1;
                    kx.gw(v9_1, 0x7FA51FC3);
                    return 1;
                }

                if(0x462 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.cd = v7_1[v8_1 * v1] * -1914508841;
                    kx.gw(v9_1, 0x7F75A725);
                    return 1;
                }

                if(arg7 == 0x463) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.bm = v7_1[v8_1 * v1] * 0x8EECFC4F;
                    kx.gw(v9_1, 0x7F934EE2);
                    return 1;
                }

                if(0x464 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    v9_1.br = v7_1[v8_1 * v1] * 269980093;
                    kx.gw(v9_1, 0x7F29F488);
                    return 1;
                }

                if(0x465 == arg7) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    lh v7_4 = eh.ax(iu.al(160257857), v7_1[v8_1 * v1], 962550550);
                    if(v7_4 != null) {
                        v9_1.be = ((ex)v7_4);
                        kx.gw(v9_1, 0x7FAD5AEF);
                    }

                    return 1;
                }

                if(arg7 == 0x466) {
                    v7_1 = il.aj;
                    v8_1 = il.ad - v0;
                    il.ad = v8_1;
                    if(v7_1[v8_1 * v1] == 1) {
                        v5 = true;
                    }

                    v9_1.ca = v5;
                    return 1;
                }

                if(0x467 != arg7) {
                    return v6;
                }

                v7_1 = il.aj;
                v8_1 = il.ad - v0;
                il.ad = v8_1;
                if(v7_1[v8_1 * v1] == 1) {
                    v5 = true;
                }

                v9_1.cg = v5;
                return 1;
            label_16:
                goto label_512;
            }
            catch(RuntimeException v7) {
                goto label_16;
            }
        }
        else {
            goto label_17;
        }

        goto label_23;
    label_512:
        StringBuilder v8_3 = new StringBuilder();
        v8_3.append("fg.ap(");
        v8_3.append(')');
        throw lx.al(((Throwable)v7), v8_3.toString());
        return v6;
    }

    static fg[] ar() {
        return new fg[]{fg.ax, fg.ar, fg.ae, fg.al};
    }

    static void ax(File arg1, byte arg2) {
        try {
            my.al = arg1;
            if(my.al.exists()) {
                my.ax = true;
                return;
            }

            throw new RuntimeException("");
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("fg.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static final int ay(int arg0, int arg1, int arg2, int arg3) {
        if(arg2 > 0xB3) {
            try {
                arg1 /= 2;
            label_6:
                if(arg2 > 0xC0) {
                    arg1 /= 2;
                }

                if(arg2 > 0xD9) {
                    arg1 /= 2;
                }

                if(arg2 > 0xF3) {
                    arg1 /= 2;
                }

                return arg2 / 2 + ((arg1 / 0x20 << 7) + (arg0 / 4 << 10));
            label_5:
                goto label_23;
            }
            catch(RuntimeException v0) {
                goto label_5;
            }
        }

        goto label_6;
    label_23:
        StringBuilder v1 = new StringBuilder();
        v1.append("fg.ay(");
        v1.append(')');
        throw lx.al(((Throwable)v0), v1.toString());
    }

    static void bz(int arg4) {
        try {
            ls v4_1 = client.al.aba(0x550C2AFC);
            ah v0 = v4_1.bh(1736276508);
            if(v0 != null) {
                v0.ah("acipK9", 0x7F0C9364);
                v0.aq(0x8A4F3398);
            }
            else {
                la v4_2 = v4_1.ga(-82);
                v4_2.ax(il.is("secure", true, 0xE82A5DE3) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, 1553435820);
            }
        }
        catch(RuntimeException v4) {
            v0_1 = new StringBuilder();
            v0_1.append("fg.bz(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }
    }
}

