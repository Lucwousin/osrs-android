public class fr implements lh {
    static final fr ae = null;
    public static final int ag = 19;
    static final fr al = null;
    final int an;
    public static final fr ar = null;
    public static final fr ax = null;
    static int dg = 0;
    static ki dp = null;
    static final int el = 0x8000;
    static od fy;
    static int mu;

    static {
        fr.ax = new fr(0);
        fr.al = new fr(1);
        fr.ae = new fr(2);
        fr.ar = new fr(3);
    }

    fr(int arg3) {
        try {
            super();
            this.an = arg3 * -2024717717;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fr.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static fr[] ae() {
        return new fr[]{fr.ar, fr.ae, fr.ax, fr.al};
    }

    static final boolean al(int arg25, int arg26, gx arg27, gy arg28, int arg29) {
        int v23;
        int v19;
        int v4;
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
                if(v12 == v0_1) {
                    break;
                }

                int v15 = gb.ad[v0_1];
                int v16 = gb.aq[v0_1];
                int v17 = v15 - v6.by * 0xD3E61C35;
                int v18 = v16 - v6.bt * 0x2144FD29;
                int v9 = v16 - v8;
                int v20 = v15 - v7;
                int v21 = v0_1 + 1 & 0xFFF;
                if(arg27.ax(1, v15, v16, arg28, -81)) {
                    gb.an = v15 * v14;
                    gb.ap = v16 * v13;
                    return 1;
                }

                v1 = v20;
                v0_1 = gb.ar[v1][v9] + 1;
                v2 = 0x1240108;
                if(v1 > 0) {
                    v4 = v1 - 1;
                    if(gb.ae[v4][v9] == 0 && (v10[v17 - 1][v18] & v2) == 0) {
                        gb.ad[v12] = v15 - 1;
                        gb.aq[v12] = v16;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v4][v9] = 2;
                        gb.ar[v4][v9] = v0_1;
                    }
                }

                int v3 = 0x1240180;
                v4 = 0x7F;
                if(v1 < v4) {
                    v13 = v1 + 1;
                    if(gb.ae[v13][v9] == 0 && (v10[v17 + 1][v18] & v3) == 0) {
                        gb.ad[v12] = v15 + 1;
                        gb.aq[v12] = v16;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v13][v9] = 8;
                        gb.ar[v13][v9] = v0_1;
                    }
                }

                int v5 = 0x1240102;
                if(v9 > 0) {
                    v14 = v9 - 1;
                    if(gb.ae[v1][v14] == 0 && (v10[v17][v18 - 1] & v5) == 0) {
                        gb.ad[v12] = v15;
                        gb.aq[v12] = v16 - 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v1][v14] = 1;
                        gb.ar[v1][v14] = v0_1;
                    }
                }

                v13 = 0x1240120;
                if(v9 < v4) {
                    v19 = v9 + 1;
                    if(gb.ae[v1][v19] == 0 && (v10[v17][v18 + 1] & v13) == 0) {
                        gb.ad[v12] = v15;
                        gb.aq[v12] = v16 + 1;
                        v12 = v12 + 1 & 0xFFF;
                        gb.ae[v1][v19] = 4;
                        gb.ar[v1][v19] = v0_1;
                    }
                }

                if(v1 > 0 && v9 > 0) {
                    v19 = v1 - 1;
                    v20 = v9 - 1;
                    if(gb.ae[v19][v20] == 0) {
                        v14 = v17 - 1;
                        v23 = v18 - 1;
                        if((v10[v14][v23] & 0x124010E) == 0 && (v10[v14][v18] & v2) == 0 && (v10[v17][v23] & v5) == 0) {
                            gb.ad[v12] = v15 - 1;
                            gb.aq[v12] = v16 - 1;
                            v12 = v12 + 1 & 0xFFF;
                            gb.ae[v19][v20] = 3;
                            gb.ar[v19][v20] = v0_1;
                        }
                    }
                }

                if(v1 < v4 && v9 > 0) {
                    v19 = v1 + 1;
                    v20 = v9 - 1;
                    if(gb.ae[v19][v20] == 0) {
                        v14 = v17 + 1;
                        v23 = v18 - 1;
                        if((v10[v14][v23] & 0x1240183) == 0 && (v10[v14][v18] & v3) == 0 && (v5 & v10[v17][v23]) == 0) {
                            gb.ad[v12] = v15 + 1;
                            gb.aq[v12] = v16 - 1;
                            v12 = v12 + 1 & 0xFFF;
                            gb.ae[v19][v20] = 9;
                            gb.ar[v19][v20] = v0_1;
                        }
                    }
                }

                if(v1 > 0 && v9 < v4) {
                    v14 = v1 - 1;
                    v19 = v9 + 1;
                    if(gb.ae[v14][v19] == 0) {
                        v5 = v17 - 1;
                        int v22 = v18 + 1;
                        if((v10[v5][v22] & 0x1240138) == 0 && (v2 & v10[v5][v18]) == 0 && (v10[v17][v22] & v13) == 0) {
                            gb.ad[v12] = v15 - 1;
                            gb.aq[v12] = v16 + 1;
                            v12 = v12 + 1 & 0xFFF;
                            gb.ae[v14][v19] = 6;
                            gb.ar[v14][v19] = v0_1;
                        }
                    }
                }

                if(v1 < v4 && v9 < v4) {
                    v4 = v1 + 1;
                    v2 = v9 + 1;
                    if(gb.ae[v4][v2] == 0) {
                        v1 = v17 + 1;
                        v9 = v18 + 1;
                        if((v10[v1][v9] & 0x12401E0) == 0 && (v10[v1][v18] & v3) == 0 && (v10[v17][v9] & v13) == 0) {
                            gb.ad[v12] = v15 + 1;
                            gb.aq[v12] = v16 + 1;
                            gb.ae[v4][v2] = 12;
                            gb.ar[v4][v2] = v0_1;
                            v12 = v12 + 1 & 0xFFF;
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
            v1_1.append("fr.al(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    static void an(int arg5) {
        og v1;
        og v5 = null;
        try {
            v1 = kr.al("", client.aj.aj, true, 4);
        }
        catch(Exception ) {
            v1 = v5;
            goto label_21;
        }

        try {
            lq v5_1 = li.rg.ae(-1250067204);
            v1.al(v5_1.ae, 0, v5_1.ar * 0xF24F550B, -1192580481);
            goto label_21;
        }
        catch(Exception ) {
        label_21:
            if(v1 != null) {
                arg5 = 1112880453;
                try {
                    v1.ar(true, arg5);
                    return;
                }
                catch(Exception ) {
                    return;
                }
                catch(RuntimeException v5_2) {
                    StringBuilder v0 = new StringBuilder();
                    v0.append("fr.an(");
                    v0.append(')');
                    throw lx.al(((Throwable)v5_2), v0.toString());
                }
            }

            return;
        }
    }

    public static fr[] an() {
        return new fr[]{fr.ar, fr.ae, fr.ax, fr.al};
    }

    public int ar() {
        return this.an * 0x348EB2FC;
    }

    public int ax(int arg3) {
        try {
            return this.an * 0x99A65A43;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fr.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static int bn(int arg0, int arg1) {
        return arg0 * 3 + 600;
    }

    static final void bz(int arg1, int arg2) {
        short v2 = -20716;
        try {
            ea.bg(v2);
            switch(arg1) {
                case 1: {
                    dv.bs(0x4D5FB26F);
                    return;
                    StringBuilder v2_1 = new StringBuilder();
                    v2_1.append("fr.bz(");
                    v2_1.append(')');
                    throw lx.al(((Throwable)v1), v2_1.toString());
                }
                case 2: {
                    ak.bu(1084845501);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch(RuntimeException v1) {
        }
    }

    static void ig(String arg4, int arg5) {
        try {
            client.av = arg4;
            try {
                String v5 = client.al.acq(Integer.toString(18), 0xDFE2EE60);
                String v0 = client.al.acq(Integer.toString(13), -1658169308);
                v5 = v5 + "settings=" + arg4 + "; version=1; path=/; domain=" + v0;
                if(arg4.length() == 0) {
                    arg4 = v5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                }
                else {
                    goto label_30;
                }

            label_46:
                client v5_1 = client.al;
                jf.ax(v5_1, "document.cookie=\"" + arg4 + "\"", 2002958732);
                return;
            label_30:
                arg4 = v5 + "; Expires=" + ei.ax(ji.ax(0x2076E2C1) + 94608000000L) + "; Max-Age=" + 94608000;
                goto label_46;
            }
            catch(Throwable ) {
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("fr.ig(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }
}

