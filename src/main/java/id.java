public final class id {
    static int[] ab = null;
    static int ac = 0;
    static int ae = 0;
    static final int[] ah = null;
    static byte[][][] aj = null;
    static int ak = 0;
    static byte[][][] al = null;
    static String am = null;
    static byte[][][] an = null;
    static final int[] ao = null;
    static byte[][][] ap = null;
    static int[][] aq = null;
    static byte[][][] ar = null;
    static final int[] as = null;
    static final int[] at = null;
    static int[][][] au = null;
    static final int[] aw = null;
    static int[][][] ax = null;
    static final int[] ay = null;
    static final int az = 1170;

    static {
        id.ax = new int[4][105][105];
        id.al = new byte[4][104][104];
        id.ae = 0x3B3B15DF;
        id.ah = new int[]{1, 2, 4, 8};
        id.at = new int[]{16, 0x20, 0x40, 0x80};
        id.ay = new int[]{1, 0, -1, 0};
        id.aw = new int[]{0, -1, 0, 1};
        id.ao = new int[]{1, -1, -1, 1};
        id.as = new int[]{-1, -1, 1, 1};
        id.ak = ((((int)(Math.random() * 17))) - 8) * 0xA64930B;
        id.ac = ((((int)(Math.random() * 33))) - 16) * 18974807;
    }

    id() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("id.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void ac() {
        id.ar = null;
        id.an = null;
        id.ap = null;
        id.aj = null;
        id.au = null;
        nt.ad = null;
        id.aq = null;
        id.ab = null;
        ab.af = null;
        ct.ai = null;
        lb.av = null;
        am.aa = null;
    }

    static void ak() {
        id.ae = 0x3B3B15DF;
        id.ar = new byte[4][104][104];
        id.an = new byte[4][104][104];
        id.ap = new byte[4][104][104];
        id.aj = new byte[4][104][104];
        id.au = new int[4][105][105];
        nt.ad = new byte[4][105][105];
        id.aq = new int[105][105];
        id.ab = new int[104];
        ab.af = new int[104];
        ct.ai = new int[104];
        lb.av = new int[104];
        am.aa = new int[104];
    }

    public static dq al(int arg4, short arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dq.ae.ax(v0);
            if(v5 != null) {
                return ((dq)v5);
            }

            byte[] v4_1 = dq.ax.ae(16, arg4, 0x78DC0DC9);
            dq v5_1 = new dq();
            if(v4_1 != null) {
                v5_1.ae(new lq(v4_1), 37);
            }

            dq.ae.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("id.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    static int al(int arg1, int arg2, int arg3) {
        if(-2 == arg1) {
            return 0xBC614E;
        }

        if(arg1 == -1) {
            arg1 = 0x7F;
            if(arg2 < 0) {
                arg2 = 0;
            }
            else if(arg2 > arg1) {
                arg2 = 0x7F;
            }

            return arg1 - arg2;
        }

        arg2 *= arg1 & 0x7F;
        try {
            arg2 /= 0x80;
            arg3 = 0x7E;
            if(arg2 >= 2) {
                goto label_22;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("id.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        arg2 = 2;
        goto label_24;
    label_22:
        if(arg2 > arg3) {
            arg2 = 0x7E;
        }

    label_24:
        return (arg1 & 0xFF80) + arg2;
    }

    public static es[] an(ko arg0, int arg1, int arg2, int arg3) {
        arg3 = 0xD76D8BFE;
        try {
            if(!au.at(arg0, arg1, arg2, arg3)) {
                return null;
            }

            return dq.az(0xF1D9F2A1);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("id.an(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void ap(int arg2, mr arg3, ki arg4, int arg5) {
        try {
            kj v5 = new kj();
            v5.ax = 0x6FBC25C9;
            v5.gx = ((long)arg2);
            v5.ae = arg3;
            v5.ar = arg4;
            kf.ax.am(v5, 0x80B90344);
            kf.ax.aj(0xA3B915A9);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("id.ap(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static int as(int arg4, hl arg5, boolean arg6, int arg7) {
        int v3;
        int[] v5_1;
        int v2;
        int[] v1_1;
        int v1;
        int v6 = 0x4A90AB9;
        arg7 = 1304812425;
        if(3300 != arg4) {
            goto label_18;
        }

        try {
            int[] v4_1 = il.aj;
            int v5 = il.ad + v6;
            il.ad = v5;
            v4_1[v5 * arg7 - 1] = client.bj * -2077001153;
            return 1;
        label_18:
            v1 = 0x9521572;
            if(arg4 == 3301) {
                il.ad -= v1;
                arg4 = il.aj[il.ad * arg7];
                v5 = il.aj[il.ad * arg7 + 1];
                v1_1 = il.aj;
                v2 = il.ad + v6;
                il.ad = v2;
                v1_1[v2 * arg7 - 1] = bj.ax(arg4, v5, -85);
                return 1;
            }

            if(arg4 == 3302) {
                il.ad -= v1;
                arg4 = il.aj[il.ad * arg7];
                v5 = il.aj[il.ad * arg7 + 1];
                v1_1 = il.aj;
                v2 = il.ad + v6;
                il.ad = v2;
                v1_1[v2 * arg7 - 1] = jm.al(arg4, v5, 0x1F);
                return 1;
            }

            if(3303 == arg4) {
                il.ad -= v1;
                arg4 = il.aj[il.ad * arg7];
                v5 = il.aj[il.ad * arg7 + 1];
                v1_1 = il.aj;
                v2 = il.ad + v6;
                il.ad = v2;
                v1_1[v2 * arg7 - 1] = hp.ae(arg4, v5, 0xFE969AB1);
                return 1;
            }

            if(arg4 == 3304) {
                v4_1 = il.aj;
                v5 = il.ad - v6;
                il.ad = v5;
                arg4 = v4_1[v5 * arg7];
                v5_1 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5_1[v1 * arg7 - 1] = cu.al(arg4, -1801567833).ae * 1032100177;
                return 1;
            }

            if(arg4 == 3305) {
                v4_1 = il.aj;
                v5 = il.ad - v6;
                il.ad = v5;
                arg4 = v4_1[v5 * arg7];
                v5_1 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5_1[v1 * arg7 - 1] = client.km[arg4];
                return 1;
            }

            if(3306 == arg4) {
                v4_1 = il.aj;
                v5 = il.ad - v6;
                il.ad = v5;
                arg4 = v4_1[v5 * arg7];
                v5_1 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5_1[v1 * arg7 - 1] = client.ko[arg4];
                return 1;
            }

            if(3307 == arg4) {
                v4_1 = il.aj;
                v5 = il.ad - v6;
                il.ad = v5;
                arg4 = v4_1[v5 * arg7];
                v5_1 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5_1[v1 * arg7 - 1] = client.ki[arg4];
                return 1;
            }

            if(arg4 == 3308) {
                arg4 = kt.jz * 1101813865;
                v1 = ad.fi * 474770003 + (gu.jg.bp * 0x914F0683 >> 7);
                v5 = nr.fo * 0x519F9BE7 + (gu.jg.bw * 0xD19D0C3D >> 7);
                int[] v2_1 = il.aj;
                v3 = il.ad + v6;
                il.ad = v3;
                v2_1[v3 * arg7 - 1] = (v1 << 14) + (arg4 << 28) + v5;
                return 1;
            }

            if(3309 == arg4) {
                v4_1 = il.aj;
                v5 = il.ad - v6;
                il.ad = v5;
                arg4 = v4_1[v5 * arg7];
                v5_1 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5_1[v1 * arg7 - 1] = arg4 >> 14 & 0x3FFF;
                return 1;
            }

            if(3310 == arg4) {
                v4_1 = il.aj;
                v5 = il.ad - v6;
                il.ad = v5;
                arg4 = v4_1[v5 * arg7];
                v5_1 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5_1[v1 * arg7 - 1] = arg4 >> 28;
                return 1;
            }

            if(arg4 == 0xCEF) {
                v4_1 = il.aj;
                v5 = il.ad - v6;
                il.ad = v5;
                arg4 = v4_1[v5 * arg7];
                v5_1 = il.aj;
                v1 = il.ad + v6;
                il.ad = v1;
                v5_1[v1 * arg7 - 1] = arg4 & 0x3FFF;
                return 1;
            }

            v2 = 0;
            if(arg4 == 0xCF0) {
                v4_1 = il.aj;
                v5 = il.ad + v6;
                il.ad = v5;
                v5 = v5 * arg7 - 1;
                if(client.aq) {
                    v2 = 1;
                }

                v4_1[v5] = v2;
                return 1;
            }

            v3 = 0x8000;
            if(0xCF1 == arg4) {
                il.ad -= v1;
                arg4 = il.aj[il.ad * arg7] + v3;
                v5 = il.aj[il.ad * arg7 + 1];
                v1_1 = il.aj;
                v2 = il.ad + v6;
                il.ad = v2;
                v1_1[v2 * arg7 - 1] = bj.ax(arg4, v5, -26);
                return 1;
            }

            if(arg4 == 0xCF2) {
                il.ad -= v1;
                arg4 = il.aj[il.ad * arg7] + v3;
                v5 = il.aj[il.ad * arg7 + 1];
                v1_1 = il.aj;
                v2 = il.ad + v6;
                il.ad = v2;
                v1_1[v2 * arg7 - 1] = jm.al(arg4, v5, -64);
                return 1;
            }

            if(0xCF3 == arg4) {
                il.ad -= v1;
                arg4 = il.aj[il.ad * arg7] + v3;
                v5 = il.aj[il.ad * arg7 + 1];
                v1_1 = il.aj;
                v2 = il.ad + v6;
                il.ad = v2;
                v1_1[v2 * arg7 - 1] = hp.ae(arg4, v5, 0x6834283C);
                return 1;
            }

            v1 = 2;
            if(arg4 == 0xCF4) {
                v5 = 0x12DC6E19;
                if(client.lf * v5 >= v1) {
                    v4_1 = il.aj;
                    v1 = il.ad + v6;
                    il.ad = v1;
                    v4_1[v1 * arg7 - 1] = client.lf * v5;
                }
                else {
                    v4_1 = il.aj;
                    v5 = il.ad + v6;
                    il.ad = v5;
                    v4_1[v5 * arg7 - 1] = 0;
                }

                return 1;
            }

            if(0xCF5 == arg4) {
                v4_1 = il.aj;
                v5 = il.ad + v6;
                il.ad = v5;
                v4_1[v5 * arg7 - 1] = client.cd * 0xD205F9E9;
                return 1;
            }

            if(0xCF6 == arg4) {
                v4_1 = il.aj;
                v5 = il.ad + v6;
                il.ad = v5;
                v4_1[v5 * arg7 - 1] = client.ae * 0x8076F529;
                return 1;
            }

            if(arg4 == 0xCF9) {
                v4_1 = il.aj;
                v5 = il.ad + v6;
                il.ad = v5;
                v4_1[v5 * arg7 - 1] = client.lh * 0x6FFC6629;
                return 1;
            }

            if(0xCFA == arg4) {
                v4_1 = il.aj;
                v5 = il.ad + v6;
                il.ad = v5;
                v4_1[v5 * arg7 - 1] = client.ly * 0xB3C744AB;
                return 1;
            }

            if(0xCFB == arg4) {
                if(client.lk) {
                    v4_1 = il.aj;
                    v5 = il.ad + v6;
                    il.ad = v5;
                    v4_1[v5 * arg7 - 1] = 1;
                }
                else {
                    v4_1 = il.aj;
                    v5 = il.ad + v6;
                    il.ad = v5;
                    v4_1[v5 * arg7 - 1] = 0;
                }

                return 1;
            }

            if(arg4 == 0xCFC) {
                v4_1 = il.aj;
                v5 = il.ad + v6;
                il.ad = v5;
                v4_1[v5 * arg7 - 1] = client.ar * 0x407F0DE1;
                return 1;
            }

            if(0xCFD != arg4) {
                return v1;
            }

            il.ad -= 0x12A42AE4;
            arg4 = il.aj[il.ad * arg7] + (il.aj[il.ad * arg7 + 1] << 14) + (il.aj[il.ad * arg7 + v1] << 28) + il.aj[il.ad * arg7 + 3];
            v5_1 = il.aj;
            v1 = il.ad + v6;
            il.ad = v1;
            v5_1[v1 * arg7 - 1] = arg4;
            return 1;
        label_17:
        }
        catch(RuntimeException v4) {
            goto label_17;
        }

        StringBuilder v5_2 = new StringBuilder();
        v5_2.append("id.as(");
        v5_2.append(')');
        throw lx.al(((Throwable)v4), v5_2.toString());
        return v1;
    }

    static void as() {
        id.ae = 0x3B3B15DF;
        id.ar = new byte[4][0x7A6CE9F1][0xFEF8FBC6];
        id.an = new byte[4][104][104];
        id.ap = new byte[4][104][104];
        id.aj = new byte[4][1714081218][0xC91C30];
        id.au = new int[4][0xA78E4798][105];
        nt.ad = new byte[4][0x7DBFDA0][105];
        id.aq = new int[105][0x33013D03];
        id.ab = new int[104];
        ab.af = new int[104];
        ct.ai = new int[0x136872FB];
        lb.av = new int[0x9404322];
        am.aa = new int[104];
    }

    public static void ax(ko arg0, ko arg1, int arg2) {
        try {
            dd.ax = arg0;
            dd.al = arg1;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("id.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final void ba(int arg8, int arg9, int arg10, int arg11) {
        int v0;
        for(v0 = arg9; true; ++v0) {
            int v1 = arg11 + arg9;
            if(v0 > v1) {
                return;
            }

            int v2;
            for(v2 = arg8; true; ++v2) {
                int v3 = arg10 + arg8;
                if(v2 > v3) {
                    break;
                }

                if(v2 >= 0) {
                    int v4 = 104;
                    if(v2 < v4 && v0 >= 0 && v0 < v4) {
                        nt.ad[0][v2][v0] = 0x7F;
                        if(arg8 == v2 && v2 > 0) {
                            id.ax[0][v2][v0] = id.ax[0][v2 - 1][v0];
                        }

                        v4 = 103;
                        if(v2 == v3 && v2 < v4) {
                            id.ax[0][v2][v0] = id.ax[0][v2 + 1][v0];
                        }

                        if(v0 == arg9 && v0 > 0) {
                            id.ax[0][v2][v0] = id.ax[0][v2][v0 - 1];
                        }

                        if(v1 != v0) {
                            goto label_62;
                        }

                        if(v0 >= v4) {
                            goto label_62;
                        }

                        id.ax[0][v2][v0] = id.ax[0][v2][v0 + 1];
                    }
                }

            label_62:
            }
        }
    }

    static void ba(int[] arg14, int[] arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25) {
        int v0 = arg23;
        int v2 = 0x100 - v0;
        int v3 = 0xFF00FF;
        int v5 = 0xFF00FF00;
        int v4 = (arg24 & v3) * v2 & v5;
        int v6 = 0xFF00;
        int v1 = (arg24 & v6) * v2;
        v2 = 0xFF0000;
        v1 = (v1 & v2 | v4) >>> 8;
        v4 = -arg20;
        int v7 = arg17;
        int v8 = arg18;
        while(v4 < 0) {
            int v10 = -arg19;
            while(v10 < 0) {
                int v11 = v7 + 1;
                try {
                    v7 = arg15[v7];
                    if(v7 != 0) {
                        arg14[v8] = (((v7 & v6) * v0 & v2 | (v7 & v3) * v0 & v5) >>> 8) + v1;
                        ++v8;
                    }
                    else {
                        goto label_38;
                    }

                    goto label_39;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append("id.ba(");
                    v1_1.append(')');
                    throw lx.al(((Throwable)v0_1), v1_1.toString());
                }

            label_38:
                ++v8;
            label_39:
                ++v10;
                v7 = v11;
            }

            v8 += arg21;
            v7 += arg22;
            ++v4;
        }
    }

    static final void bb(byte[] arg11, int arg12, int arg13, bg arg14, gy[] arg15) {
        lq v0 = new lq(arg11);
        int v11 = -1;
        while(true) {
            int v1 = v0.bt(0x7F030049);
            if(v1 == 0) {
                return;
            }

            v11 += v1;
            v1 = 0;
            while(true) {
                int v2 = v0.by(21640);
                if(v2 == 0) {
                    break;
                }

                v1 += v2 - 1;
                int v4 = v1 >> 12;
                int v5 = v0.ay(-17);
                int v7 = v5 >> 2;
                int v6 = v5 & 3;
                int v3 = (v1 >> 6 & 0x6B602B92) + arg12;
                v5 = (v1 & 0x3F) + arg13;
                if(v3 <= 0) {
                    continue;
                }

                if(v5 <= 0) {
                    continue;
                }

                if(v3 >= 0x7EB73D01) {
                    continue;
                }

                if(v5 >= 0xFCC5B3B1) {
                    continue;
                }

                v2 = 2 == (id.al[1][v3][v5] & 2) ? v4 - 1 : v4;
                gy v8 = null;
                gy v9 = v2 >= 0 ? arg15[v2] : v8;
                fv.af(v4, v3, v5, v11, v6, v7, arg14, v9, 0xB1F452F5);
            }
        }
    }

    static final void bc(byte[] arg11, int arg12, int arg13, bg arg14, gy[] arg15) {
        lq v0 = new lq(arg11);
        int v11 = -1;
        while(true) {
            int v1 = v0.bt(0x7F030049);
            if(v1 == 0) {
                return;
            }

            v11 += v1;
            v1 = 0;
            while(true) {
                int v2 = v0.by(0x40C1);
                if(v2 == 0) {
                    break;
                }

                v1 += v2 - 1;
                int v4 = v1 >> 12;
                int v5 = v0.ay(-125);
                int v7 = v5 >> 2;
                int v6 = v5 & 3;
                int v3 = (v1 >> 6 & 0x3F) + arg12;
                v5 = (v1 & 0x3F) + arg13;
                if(v3 <= 0) {
                    continue;
                }

                if(v5 <= 0) {
                    continue;
                }

                if(v3 >= 1655005382) {
                    continue;
                }

                if(v5 >= 0x747110D2) {
                    continue;
                }

                v2 = 2 == (id.al[1][v3][v5] & 2) ? v4 - 1 : v4;
                gy v8 = null;
                gy v9 = v2 >= 0 ? arg15[v2] : v8;
                fv.af(v4, v3, v5, v11, v6, v7, arg14, v9, 0x12C2D25B);
            }
        }
    }

    static final void bd(int arg8, int arg9, int arg10, int arg11) {
        int v0;
        for(v0 = arg9; true; ++v0) {
            int v1 = arg11 + arg9;
            if(v0 > v1) {
                return;
            }

            int v2;
            for(v2 = arg8; true; ++v2) {
                int v3 = arg10 + arg8;
                if(v2 > v3) {
                    break;
                }

                if(v2 >= 0) {
                    int v4 = 104;
                    if(v2 < v4 && v0 >= 0 && v0 < v4) {
                        nt.ad[0][v2][v0] = 0x7F;
                        if(arg8 == v2 && v2 > 0) {
                            id.ax[0][v2][v0] = id.ax[0][v2 - 1][v0];
                        }

                        v4 = 103;
                        if(v2 == v3 && v2 < v4) {
                            id.ax[0][v2][v0] = id.ax[0][v2 + 1][v0];
                        }

                        if(v0 == arg9 && v0 > 0) {
                            id.ax[0][v2][v0] = id.ax[0][v2][v0 - 1];
                        }

                        if(v1 != v0) {
                            goto label_62;
                        }

                        if(v0 >= v4) {
                            goto label_62;
                        }

                        id.ax[0][v2][v0] = id.ax[0][v2][v0 + 1];
                    }
                }

            label_62:
            }
        }
    }

    static final void be(int arg38, int arg39, int arg40, int arg41, int arg42, int arg43, bg arg44, gy arg45) {
        int v4_2;
        bm v9_3;
        long v4_1;
        bm v6_1;
        hj v6_2;
        int v26;
        int v2;
        do v14_1;
        do v11_2;
        bm v7_1;
        hj v7_2;
        gy v11_1;
        int v10;
        do v15_1;
        bm v5;
        hj v5_1;
        int v7;
        int v0;
        int v1;
        int v12 = arg38;
        int v13 = arg39;
        int v14 = arg40;
        int v15 = arg42;
        int v11 = arg43;
        int v8 = 16;
        int v6 = 2;
        if((client.ab) && (id.al[0][v13][v14] & v6) == 0 && (id.al[v12][v13][v14] & v8) != 0) {
            return;
        }

        if(v12 < id.ae * -1008084771) {
            id.ae = 0xE678FB30 * v12;
        }

        do v4 = ok.al(arg41, 0xF5E365C9);
        int v3 = 3;
        if(1 == v15 || v3 == v15) {
            v3 = v4.ag * 0x4B9D7897;
            v1 = v4.az * 0xB46CA623;
        }
        else {
            v3 = v4.az * 0xAD770371;
            v1 = v4.ag * 0x5C3F2E84;
        }

        if(v3 + v13 <= 104) {
            v0 = (v3 >> 1) + v13;
            v7 = (v3 + 1 >> 1) + v13;
        }
        else {
            v7 = v13 + 1;
            v0 = v13;
        }

        if(v14 + v1 <= 0xDA8A9375) {
            v6 = (v1 >> 1) + v14;
            v8 = (v1 + 1 >> 1) + v14;
        }
        else {
            v8 = v14 + 1;
            v6 = v14;
        }

        int[][] v28 = id.ax[v12];
        int v27 = v28[v7][v8] + (v28[v0][v6] + v28[v7][v6] + v28[v0][v8]) >> 2;
        v7 = (v3 << 6) + (v13 << 7);
        v8 = (v14 << 7) + (v1 << 6);
        int v16 = 2;
        boolean v17 = v4.ay * -1273703861 == 0 ? true : false;
        int v29 = v1;
        int v30 = v3;
        do v9 = v4;
        long v32 = gs.aa(arg39, arg40, v16, v17, arg41, 1);
        v0 = (v15 << 6) + v11;
        if(1 == v9.bb * 0x3376F5D7) {
            v0 += 0x100;
        }

        int v24 = v0;
        if(v9.am(0xA457DC97)) {
            iu.ar(arg38, arg39, arg40, v9, arg42, -885407149);
        }

        int v34 = 0xE748B627;
        v1 = -1;
        v16 = 0x804BDF6B;
        if(22 == v11) {
            if((client.ab) && v9.ay * 0xE5018CDF == 0 && v9.ah * -70772141 != 1 && !v9.bz) {
                return;
            }

            if(v1 != v9.ak * v16 || v9.bc != null) {
                v15_1 = v9;
                v10 = 1;
                v11_1 = arg45;
                v5_1 = new hj(arg41, 22, arg42, arg38, arg39, arg40, v9.ak * v16, true, null);
            }
            else {
                v5 = v9.ad(22, arg42, v28, v7, v27, v8, -700180005);
                v15_1 = v9;
                v10 = 1;
                v11_1 = arg45;
            }

            arg44.aj(arg38, arg39, arg40, v27, ((bm)v5_1), v32, v24);
            if(v10 == v15_1.ah * v34 && v11_1 != null) {
                v11_1.an(v13, v14, 0);
            }

            return;
        }

        gy v25 = arg45;
        int v37 = v15;
        v15_1 = v9;
        int v9_1 = v37;
        int v5_2 = 4;
        if(10 != v11) {
            if(11 == v11) {
            }
            else if(v11 >= 12) {
                if(v15_1.ak * 0xE80F9A50 != v1 || v15_1.bc != null) {
                    v7_2 = new hj(arg41, arg43, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                }
                else {
                    v7_1 = v15_1.ad(arg43, arg42, v28, v7, v27, v8, -700180005);
                }

                do v35 = v15_1;
                v15 = v11;
                arg44.af(arg38, arg39, arg40, v27, 1, 1, ((bm)v7_2), 0, v32, v24);
                if(v15 >= 12 && v15 <= 17 && 13 != v15 && v12 > 0) {
                    id.au[v12][v13][v14] |= -450285780;
                }

                v11_2 = v35;
                if(v11_2.ah * 0xB7C3985F != 0 && v25 != null) {
                    arg45.ae(arg39, arg40, v30, v29, v11_2.at, 0xDA2710F2);
                }

                return;
            }
            else {
                do v37_1 = v15_1;
                v15 = v11;
                v11_2 = v37_1;
                int v31 = 0x1CEE4599;
                byte v17_1 = 50;
                if(v15 == 0) {
                    if(v11_2.ak * v16 != v1 || v11_2.bc != null) {
                        v15 = v9_1;
                        v5_1 = new hj(arg41, 0, arg42, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(0, arg42, v28, v7, v27, v8, -700180005);
                        v15 = v9_1;
                    }

                    v14_1 = v11_2;
                    arg44.aq(arg38, arg39, arg40, v27, ((bm)v5_1), null, id.ah[v15], 0, v32, v24);
                    if(v15 == 0) {
                        if(v14_1.bo) {
                            v11_2 = v14_1;
                            v14 = arg40;
                            nt.ad[v12][v13][v14] = v17_1;
                            nt.ad[v12][v13][v14 + 1] = -38;
                        }
                        else {
                            v11_2 = v14_1;
                            v14 = arg40;
                        }

                        if(!v11_2.as) {
                            goto label_468;
                        }

                        id.au[v12][v13][v14] |= 585;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg40;
                        if(1 == v15) {
                            if(v11_2.bo) {
                                v1 = v14 + 1;
                                nt.ad[v12][v13][v1] = v17_1;
                                nt.ad[v12][v13 + 1][v1] = 88;
                            }

                            if(!v11_2.as) {
                                goto label_468;
                            }

                            v1 = v14 + 1;
                            id.au[v12][v13][v1] |= 1170;
                            goto label_468;
                        }

                        if(2 == v15) {
                            if(v11_2.bo) {
                                v1 = v13 + 1;
                                nt.ad[v12][v1][v14] = 14;
                                nt.ad[v12][v1][v14 + 1] = v17_1;
                            }

                            if(!v11_2.as) {
                                goto label_468;
                            }

                            id.au[v12][v13 + 1][v14] |= -603808286;
                            goto label_468;
                        }

                        if(3 != v15) {
                            goto label_468;
                        }

                        if(v11_2.bo) {
                            nt.ad[v12][v13][v14] = v17_1;
                            nt.ad[v12][v13 + 1][v14] = 2;
                        }

                        if(!v11_2.as) {
                            goto label_468;
                        }

                        id.au[v12][v13][v14] |= 1170;
                    }

                label_468:
                    if(v11_2.ah * 0x8B4ECF50 != 0 && v25 != null) {
                        arg45.al(arg39, arg40, arg43, arg42, v11_2.at, -49);
                    }

                    if(16 != v11_2.ac * v31) {
                        arg44.az(v12, v13, v14, v11_2.ac * v31);
                    }

                    return;
                }

                v3 = v9_1;
                v2 = v15;
                if(v2 == 1) {
                    if(v11_2.ak * v16 != v1 || v11_2.bc != null) {
                        v5_1 = new hj(arg41, 1, arg42, arg38, arg39, arg40, v11_2.ak * 438806758, true, null);
                    }
                    else {
                        v5 = v11_2.ad(1, arg42, v28, v7, v27, v8, -700180005);
                    }

                    v15 = arg42;
                    v14_1 = v11_2;
                    arg44.aq(arg38, arg39, arg40, v27, ((bm)v5_1), null, id.at[arg42], 0, v32, v24);
                    if(!v14_1.bo) {
                        v11_2 = v14_1;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        nt.ad[v12][v13][arg40 + 1] = v17_1;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg40;
                        if(v15 == 1) {
                            nt.ad[v12][v13 + 1][v14 + 1] = v17_1;
                        }
                        else if(2 == v15) {
                            nt.ad[v12][v13 + 1][v14] = v17_1;
                        }
                        else if(v15 == 3) {
                            nt.ad[v12][v13][v14] = -90;
                        }
                    }

                    if(v11_2.ah * v34 != 0 && v25 != null) {
                        arg45.al(arg39, arg40, arg43, arg42, v11_2.at, 4);
                    }

                    return;
                }

                v6 = v2;
                v15 = v3;
                if(v6 == 2) {
                    v26 = v15 + 1 & 3;
                    if(v1 != v11_2.ak * -924940409 || v11_2.bc != null) {
                        v5_1 = new hj(arg41, 2, v15 + 4, arg38, arg39, arg40, v11_2.ak * 0x79D87F6B, true, null);
                        v6_2 = new hj(arg41, 2, v26, arg38, arg39, arg40, v11_2.ak * 0xE1B2790, true, null);
                    }
                    else {
                        v5 = v11_2.ad(2, v15 + 4, v28, v7, v27, v8, -700180005);
                        v6_1 = v11_2.ad(2, v26, v28, v7, v27, v8, -700180005);
                    }

                    v14_1 = v11_2;
                    arg44.aq(arg38, arg39, arg40, v27, ((bm)v5_1), ((bm)v6_2), id.ah[v15], id.ah[v26], v32, v24);
                    if(!v14_1.as) {
                        v11_2 = v14_1;
                        v14 = arg40;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        v14 = arg40;
                        id.au[v12][v13][((int)v14_1)] |= 585;
                        v1 = v14 + 1;
                        id.au[v12][v13][v1] |= 0x70EA1F01;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg40;
                        if(v15 == 1) {
                            v1 = v14 + 1;
                            id.au[v12][v13][v1] |= 0x34DFFE5D;
                            id.au[v12][v13 + 1][v14] |= 0x5CCF0DB4;
                        }
                        else if(2 == v15) {
                            id.au[v12][v13 + 1][v14] |= 375001356;
                            id.au[v12][v13][v14] |= 0x94E05B22;
                        }
                        else if(v15 == 3) {
                            id.au[v12][v13][v14] |= -493505969;
                            id.au[v12][v13][v14] |= 0x27AAAD84;
                        }
                    }

                    if(v11_2.ah * v34 != 0 && v25 != null) {
                        arg45.al(arg39, arg40, arg43, arg42, v11_2.at, 19);
                    }

                    if(v11_2.ac * v31 != 16) {
                        arg44.az(v12, v13, v14, v11_2.ac * v31);
                    }

                    return;
                }

                if(3 == v6) {
                    if(v11_2.ak * 0x89C6BC55 != v1 || v11_2.bc != null) {
                        v5_1 = new hj(arg41, 3, arg42, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(3, arg42, v28, v7, v27, v8, -700180005);
                    }

                    v14_1 = v11_2;
                    arg44.aq(arg38, arg39, arg40, v27, ((bm)v5_1), null, id.at[v15], 0, v32, v24);
                    if(!v14_1.bo) {
                        v11_2 = v14_1;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        nt.ad[v12][v13][arg40 + 1] = 3;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg40;
                        if(v15 == 1) {
                            nt.ad[v12][v13 + 1][v14 + 1] = v17_1;
                        }
                        else if(v15 == 2) {
                            nt.ad[v12][v13 + 1][v14] = v17_1;
                        }
                        else if(3 == v15) {
                            nt.ad[v12][v13][v14] = 0x72;
                        }
                    }

                    if(v11_2.ah * v34 != 0 && v25 != null) {
                        arg45.al(arg39, arg40, arg43, arg42, v11_2.at, 80);
                    }

                    return;
                }

                v0 = 2;
                v10 = arg43;
                if(v10 == 9) {
                    if(v1 != v11_2.ak * v16 || v11_2.bc != null) {
                        v7_2 = new hj(arg41, arg43, arg42, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                    }
                    else {
                        v7_1 = v11_2.ad(arg43, arg42, v28, v7, v27, v8, -700180005);
                    }

                    v15_1 = v11_2;
                    arg44.af(arg38, arg39, arg40, v27, 1, 1, ((bm)v7_2), 0, v32, v24);
                    if(v15_1.ah * v34 != 0 && v25 != null) {
                        arg45.ae(arg39, arg40, v30, v29, v15_1.at, -1304713169);
                    }

                    if(v15_1.ac * v31 != 16) {
                        arg44.az(v12, v13, v14, v15_1.ac * -391290296);
                    }

                    return;
                }

                v26 = v15;
                v15_1 = v11_2;
                bg v11_3 = arg44;
                if(v10 == v5_2) {
                    if(v1 != v15_1.ak * v16 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, arg42, arg38, arg39, arg40, v15_1.ak * 0xFD805A62, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, arg42, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, ((bm)v5_1), null, id.ah[v26], 0, 0, 0, v32, v24);
                    return;
                }

                long v17_2 = 0;
                if(v10 == 5) {
                    v4_1 = v11_3.bd(v12, v13, v14);
                    v10 = v17_2 != v4_1 ? ok.al(be.av(v4_1), 0x1F242704).ac * v31 : 16;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, arg42, arg38, arg39, arg40, v15_1.ak * 0xB1088131, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, arg42, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, ((bm)v5_1), null, id.ah[v26], 0, v10 * id.ay[v26], v10 * id.aw[v26], v32, v24);
                    return;
                }

                v3 = 8;
                if(v10 == 6) {
                    v4_1 = v11_3.bd(v12, v13, v14);
                    v10 = v17_2 != v4_1 ? ok.al(be.av(v4_1), 0xA8BB6401).ac * v31 / 2 : 8;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, v26 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v26 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, ((bm)v5_1), null, 0x100, arg42, v10 * id.ao[v26], v10 * id.as[v26], v32, v24);
                    return;
                }

                if(7 == v10) {
                    v10 = v26 + 2 & 3;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, v10 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v10 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, ((bm)v5_1), null, 0xD3FB57F6, v10, 0, 0, v32, v24);
                    return;
                }

                if(v10 == v3) {
                    long v9_2 = v11_3.bd(v12, v13, v14);
                    v10 = v17_2 != v9_2 ? ok.al(be.av(v9_2), 0x521E7910).ac * v31 / v0 : 8;
                    int v25_1 = v26 + 2 & 3;
                    if(v15_1.ak * 1507763578 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, v26 + 4, arg38, arg39, arg40, v15_1.ak * 0xA037F65F, true, null);
                        v6_2 = new hj(arg41, 4, v25_1 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v26 + 4, v28, v7, v27, v8, -700180005);
                        v6_1 = v15_1.ad(4, v25_1 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, ((bm)v5_1), ((bm)v6_2), 0x100, arg42, v10 * id.ao[v26], v10 * id.as[v26], v32, v24);
                    return;
                }

                return;
            }
        }

        v10 = v11;
        if(v1 != v15_1.ak * 0xA975F3C4 || v15_1.bc != null) {
            hj v9_4 = new hj(arg41, 10, arg42, arg38, arg39, arg40, v15_1.ak * -172828901, true, null);
        }
        else {
            v9_3 = v15_1.ad(10, arg42, v28, v7, v27, v8, -700180005);
        }

        if(v9_3 != null) {
            v8 = 11 == v10 ? 0x100 : 0;
            bm v14_2 = v9_3;
            if((arg44.af(arg38, arg39, arg40, v27, v30, v29, v9_3, v8, v32, v24)) && (v15_1.bo)) {
                v0 = 15;
                if((v14_2 instanceof ca)) {
                    v0 = v14_2.ad() / 4;
                    if(v0 > 30) {
                        v0 = 30;
                    }
                }

                v3 = v30;
                v1 = 0;
                while(v1 <= v3) {
                    v4_2 = v29;
                    for(v2 = 0; v2 <= v4_2; ++v2) {
                        v6 = v13 + v1;
                        v8 = v2 + arg40;
                        if(v0 > nt.ad[v12][v6][v8]) {
                            nt.ad[v12][v6][v8] = ((byte)v0);
                        }
                    }

                    ++v1;
                    v29 = v4_2;
                }

                v4_2 = v29;
                goto label_1398;
            }

            v4_2 = v29;
            v3 = v30;
        }
        else {
            v4_2 = v29;
            v3 = v30;
        }

    label_1398:
        if(v15_1.ah * 0xC4C7E88B != 0 && v25 != null) {
            arg45.ae(arg39, arg40, v3, v4_2, v15_1.at, 0xC607AF6E);
        }
    }

    static final void bf(byte[] arg16, int arg17, int arg18, int arg19, int arg20, gy[] arg21) {
        int v1;
        for(v1 = 0; true; ++v1) {
            int v2 = 4;
            int v3 = 0x40;
            if(v1 >= v2) {
                break;
            }

            for(v2 = 0; v2 < v3; ++v2) {
                int v4;
                for(v4 = 0; v4 < v3; ++v4) {
                    int v5 = v2 + arg17;
                    if(v5 > 0) {
                        int v6 = 103;
                        if(v5 < v6) {
                            int v7 = arg18 + v4;
                            if(v7 > 0 && v7 < v6) {
                                arg21[v1].bx[v5][v7] &= 0xFEFFFFFF;
                            }
                        }
                    }
                }
            }
        }

        lq v1_1 = new lq(arg16);
        int v12;
        for(v12 = 0; v12 < v2; ++v12) {
            int v13;
            for(v13 = 0; v13 < v3; ++v13) {
                int v11;
                for(v11 = 0; v11 < v3; ++v11) {
                    hj.aj(v1_1, v12, arg17 + v13, v11 + arg18, arg19, arg20, 0, 322063829);
                }
            }
        }
    }

    static final void bg(lq arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int v0 = 49;
        if(arg8 >= 0) {
            int v2 = 104;
            if(arg8 >= v2) {
                goto label_105;
            }
            else if(arg9 < 0) {
                goto label_105;
            }
            else if(arg9 < v2) {
                id.al[arg7][arg8][arg9] = 0;
                while(true) {
                    v2 = arg6.ay(-49);
                    if(v2 == 0) {
                        break;
                    }
                    else if(v2 == 1) {
                        int v6 = arg6.ay(-73);
                        if(1 == v6) {
                            v6 = 0;
                        }

                        if(arg7 == 0) {
                            id.ax[0][arg8][arg9] = -v6 * 8;
                            return;
                        }

                        id.ax[arg7][arg8][arg9] = id.ax[arg7 - 1][arg8][arg9] - v6 * 8;
                    }
                    else {
                        if(v2 <= v0) {
                            id.an[arg7][arg8][arg9] = arg6.aw(-1215098345);
                            v2 += -2;
                            id.ap[arg7][arg8][arg9] = ((byte)(v2 / 4));
                            id.aj[arg7][arg8][arg9] = ((byte)(v2 + arg12 & 3));
                            continue;
                        }

                        if(v2 <= 81) {
                            id.al[arg7][arg8][arg9] = ((byte)(v2 - 49));
                            continue;
                        }

                        id.ar[arg7][arg8][arg9] = ((byte)(v2 - 81));
                        continue;
                    }

                    return;
                }

                if(arg7 == 0) {
                    id.ax[0][arg8][arg9] = -di.aa(arg10 + (arg8 + 0xE3B7B), 0x87CCE + arg9 + arg11, 0xE9FE8A82) * 8;
                    return;
                }

                id.ax[arg7][arg8][arg9] = id.ax[arg7 - 1][arg8][arg9] - 0xF0;
            }
            else {
                goto label_105;
            }
        }
        else {
            while(true) {
            label_105:
                arg7 = arg6.ay(-30);
                if(arg7 == 0) {
                    break;
                }

                if(1 == arg7) {
                    arg6.ay(-40);
                    return;
                }

                if(arg7 > v0) {
                    continue;
                }

                arg6.ay(-114);
            }
        }
    }

    static final boolean bh(byte[] arg10, int arg11, int arg12) {
        lq v0 = new lq(arg10);
        int v10 = -1;
        boolean v2 = true;
        while(true) {
        label_5:
            int v3 = v0.bt(0x7F030049);
            if(v3 == 0) {
                return v2;
            }

            v10 += v3;
            boolean v5 = v2;
            int v2_1 = 0;
            int v4 = 0;
            while(true) {
            label_14:
                if(v2_1 == 0) {
                    int v6 = v0.by(21500);
                    if(v6 != 0) {
                        v4 += v6 - 1;
                        int v8 = v0.ay(-41) >> 2;
                        int v7 = (v4 >> 6 & 0x3F) + arg11;
                        v6 = (-875700760 & v4) + arg12;
                        if(v7 <= 0) {
                            continue;
                        }

                        if(v6 <= 0) {
                            continue;
                        }

                        int v9 = 103;
                        if(v7 >= v9) {
                            continue;
                        }

                        if(v6 >= v9) {
                            continue;
                        }

                        do v6_1 = ok.al(v10, 0x1CE738DA);
                        if(v8 == 22 && (client.ab) && v6_1.ay * 126107313 == 0 && 1 != v6_1.ah * 0xE748B627 && !v6_1.bz) {
                            continue;
                        }

                        if(!v6_1.aj(0x15F4502A)) {
                            client.fm += -1102395821;
                            v5 = false;
                        }

                        v2_1 = 1;
                        continue;
                    }
                }
                else if(v0.by(0x60CC) != 0) {
                    break;
                }

                v2 = v5;
                goto label_5;
            }
        }

        v0.ay(-114);
        goto label_14;
        return v2;
    }

    static final void bi(bg arg24, gy[] arg25) {
        int v20;
        int v21;
        int v1;
        ds v11_1;
        int v11;
        int v9;
        int v7;
        int v3;
        bg v0 = arg24;
        int v2;
        for(v2 = 0; true; ++v2) {
            v3 = 4;
            if(v2 >= v3) {
                break;
            }
        }

        double v6 = 5;
        int v5 = 2;
        id.ak += ((((int)(Math.random() * v6))) - v5) * 2034549972;
        int v4 = 0xCBDF20A3;
        if(id.ak * v4 < 1905004200) {
            id.ak = -1394907224;
        }

        v2 = id.ak * v4;
        v4 = 8;
        if(v2 > v4) {
            id.ak = 417061765;
        }

        id.ac += ((((int)(Math.random() * v6))) - v5) * 18974807;
        if(id.ac * 0x64B41483 < -16) {
            id.ac = 2073514350;
        }

        if(id.ac * 0xBF2BE367 > 16) {
            id.ac = 0xF3FFDAE5;
        }

        for(v2 = 0; true; ++v2) {
            int v6_1 = 104;
            v7 = 1;
            if(v2 >= v3) {
                break;
            }

            Math.sqrt(5100);
            int v8;
            for(v8 = 1; true; ++v8) {
                v9 = 103;
                if(v8 >= v9) {
                    break;
                }
            }

            for(v8 = 0; v8 < v6_1; ++v8) {
                id.ab[v8] = 0;
                ab.af[v8] = 0;
                ct.ai[v8] = 0;
                lb.av[v8] = 0;
                am.aa[v8] = 0;
            }

            for(v8 = -5; v8 < 109; ++v8) {
                int v10;
                for(v10 = 0; v10 < 2060368644; ++v10) {
                    v11 = v8 + 5;
                    if(v11 >= 0 && v11 < v6_1) {
                        v11 = id.ar[v2][v11][v10] & 0x1ECEC663;
                        if(v11 > 0) {
                            v11_1 = gy.al(v11 - 1, 0x311AEE0B);
                            id.ab[v10] += v11_1.an * -1218947095;
                            ab.af[v10] += v11_1.ap * 0x51701A96;
                            ct.ai[v10] += v11_1.aj * 0x702FB042;
                            lb.av[v10] += v11_1.ad * 0xEAF0D03A;
                            ++am.aa[v10];
                        }
                    }

                    v11 = v8 - 5;
                    if(v11 >= 0 && v11 < v6_1) {
                        v11 = id.ar[v2][v11][v10] & 0xE6FFADCA;
                        if(v11 > 0) {
                            v11_1 = gy.al(v11 - 1, 0x57F93161);
                            id.ab[v10] -= v11_1.an * 934650852;
                            ab.af[v10] -= v11_1.ap * 248334905;
                            ct.ai[v10] -= v11_1.aj * 0x1336628A;
                            lb.av[v10] -= v11_1.ad * 0xD10D8C21;
                            --am.aa[v10];
                        }
                    }
                }
            }

            for(v6_1 = 1; v6_1 < v9; ++v6_1) {
                for(v8 = 1; v8 < 0x694071F2; ++v8) {
                    v0.an(v2, v8, v6_1, gy.av(v2, v8, v6_1, 0x44FD32D0));
                }
            }

            id.ar[v2] = null;
            id.an[v2] = null;
            id.ap[v2] = null;
            id.aj[v2] = null;
            nt.ad[v2] = null;
        }

        v0.bw(0x10ED20B0, 0xE37F1591, 1580700293);
        int v0_1 = 0;
        v2 = 1;
        v8 = 4;
        while(v0_1 < v3) {
            if(v0_1 > 0) {
                v2 <<= 3;
                v5 <<= 3;
                v8 <<= 3;
            }

            v9 = 0;
            while(v9 <= v0_1) {
                int v15 = 0;
                while(v15 <= v6_1) {
                    int v14 = 0;
                    while(v14 <= v6_1) {
                        if((id.au[v9][v14][v15] & v2) != 0) {
                            int v18;
                            for(v18 = v15; v18 > 0; --v18) {
                                if((id.au[v9][v14][v18 - 1] & v2) == 0) {
                                    break;
                                }
                            }

                            int v13;
                            for(v13 = v15; v13 < v6_1; v13 = v11) {
                                v11 = v13 + 1;
                                if((id.au[v9][v14][v11] & v2) == 0) {
                                    break;
                                }
                            }

                            int v19;
                            for(v19 = v9; v19 > 0; --v19) {
                                v10 = v18;
                                while(true) {
                                    if(v10 > v13) {
                                        break;
                                    }
                                    else if((id.au[v19 - 1][v14][v10] & v2) == 0) {
                                    }
                                    else {
                                        ++v10;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            int v12;
                            for(v12 = v9; v12 < v0_1; ++v12) {
                                v10 = v18;
                                while(true) {
                                    if(v10 > v13) {
                                        break;
                                    }
                                    else if((id.au[v12 + 1][v14][v10] & v2) == 0) {
                                    }
                                    else {
                                        ++v10;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            if((v12 + 1 - v19) * (v13 - v18 + v7) < v4) {
                                goto label_333;
                            }

                            int v16 = id.ax[v12][v14][v18] + 1096607093;
                            v1 = v13 * 0x60CB28BB + 0x80;
                            v21 = v14 * 0x80;
                            v3 = v12;
                            v12 = v21;
                            v4 = v13;
                            v13 = v21;
                            v21 = v14;
                            v20 = v15;
                            bg.ar(v0_1, 1, v12, v13, 0x20BD0028 * v18, v1, v16, id.ax[v19][v14][v18]);
                            for(v1 = v19; v1 <= v3; ++v1) {
                                for(v10 = v18; v10 <= v4; ++v10) {
                                    id.au[v1][v21][v10] &= ~v2;
                                }
                            }
                        }
                        else {
                        label_333:
                            v21 = v14;
                            v20 = v15;
                        }

                        if((id.au[v9][v21][v20] & v5) != 0) {
                            for(v1 = v21; v1 > 0; --v1) {
                                if((id.au[v9][v1 - 1][v20] & v5) == 0) {
                                    break;
                                }
                            }

                            for(v3 = v21; v3 < v6_1; v3 = v10) {
                                v10 = v3 + 1;
                                if((id.au[v9][v10][v20] & v5) == 0) {
                                    break;
                                }
                            }

                            for(v4 = v9; v4 > 0; --v4) {
                                v10 = v1;
                                while(true) {
                                    if(v10 > v3) {
                                        break;
                                    }
                                    else if((id.au[v4 - 1][v10][v20] & v5) == 0) {
                                    }
                                    else {
                                        ++v10;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            for(v15 = v9; v15 < v0_1; ++v15) {
                                v10 = v1;
                                while(true) {
                                    if(v10 > v3) {
                                        break;
                                    }
                                    else if((id.au[v15 + 1][v10][v20] & v5) == 0) {
                                    }
                                    else {
                                        ++v10;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            if((v15 + 1 - v4) * (v3 - v1 + v7) < 8) {
                                goto label_444;
                            }

                            v7 = v15;
                            bg.ar(v0_1, 2, v1 * 0x80, v3 * 0x80 + 0x80, 0x6531F8D2 * v20, 0xA0B77B1B * v20, id.ax[v15][v1][v20] - 0xF0, id.ax[v4][v1][v20]);
                            while(v4 <= v7) {
                                for(v10 = v1; v10 <= v3; ++v10) {
                                    id.au[v4][v10][v20] &= ~v5;
                                }

                                ++v4;
                            }
                        }

                    label_444:
                        if((id.au[v9][v21][v20] & v8) != 0) {
                            for(v1 = v20; v1 > 0; --v1) {
                                if((id.au[v9][v21][v1 - 1] & v8) == 0) {
                                    break;
                                }
                            }

                            for(v3 = v20; v3 < v6_1; v3 = v7) {
                                v7 = v3 + 1;
                                if((id.au[v9][v21][v7] & v8) == 0) {
                                    break;
                                }
                            }

                            for(v4 = v21; v4 > 0; --v4) {
                                v7 = v1;
                                while(true) {
                                    if(v7 > v3) {
                                        break;
                                    }
                                    else if((id.au[v9][v4 - 1][v7] & v8) == 0) {
                                    }
                                    else {
                                        ++v7;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            for(v7 = v21; v7 < 1463030419; ++v7) {
                                v10 = v1;
                                while(true) {
                                    if(v10 > v3) {
                                        break;
                                    }
                                    else if((id.au[v9][v7 + 1][v10] & v8) == 0) {
                                    }
                                    else {
                                        ++v10;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            if((v3 - v1 + 1) * (v7 - v4 + 1) < 4) {
                                goto label_549;
                            }

                            bg.ar(v0_1, 4, v4 * 0x80, 64402574 * v7 - 1855510454, v1 * 201140715, v3 * 0x80 - 0x69D0712C, id.ax[v9][v4][v1], id.ax[v9][v4][v1]);
                            while(v4 <= v7) {
                                for(v10 = v1; v10 <= v3; ++v10) {
                                    id.au[v9][v4][v10] &= ~v8;
                                }

                                ++v4;
                            }
                        }

                    label_549:
                        v14 = v21 + 1;
                        v15 = v20;
                        v4 = 8;
                        v7 = 1;
                    }

                    ++v15;
                    v4 = 8;
                    v7 = 1;
                }

                ++v9;
                v4 = 8;
                v7 = 1;
            }

            ++v0_1;
            v3 = 4;
            v4 = 8;
            v7 = 1;
        }
    }

    static final void bj(byte[] arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, bg arg27, gy[] arg28) {
        int v0 = arg24;
        int v1 = arg25;
        lq v2 = new lq(arg19);
        int v3 = -1;
        while(true) {
            int v4 = v2.bt(0x7F030049);
            if(v4 == 0) {
                return;
            }

            v3 += v4;
            v4 = 0;
            while(true) {
                int v5 = v2.by(0x625B);
                if(v5 == 0) {
                    break;
                }

                v4 += v5 - 1;
                v5 = -1126843560 & v4;
                int v6 = v4 >> 6 & 0x3F;
                int v8 = v2.ay(-80);
                int v10 = v8 >> 2;
                v8 &= 3;
                if(arg23 != v4 >> 12) {
                    continue;
                }

                if(v6 < v0) {
                    continue;
                }

                if(v6 >= v0 + 8) {
                    continue;
                }

                if(v5 < v1) {
                    continue;
                }

                if(v5 >= v1 + 8) {
                    continue;
                }

                do v7 = ok.al(v3, 0x13CDCE25);
                v6 &= 7;
                v5 &= 7;
                int v11 = v6;
                v6 = arg21 + fl.ae(v6, v5, arg26, v7.az * 0xB46CA623, v7.ag * 0xBD073E75, v8, 0x4A0F3119);
                int v7_1 = arg22 + cg.ar(v11, v5, arg26, v7.az * 0xB46CA623, v7.ag * 0x4B9D7897, v8, 0x92E4DAF6);
                if(v6 <= 0) {
                    continue;
                }

                if(v7_1 <= 0) {
                    continue;
                }

                if(v6 >= 0x292FFC85) {
                    continue;
                }

                if(v7_1 >= 103) {
                    continue;
                }

                v5 = 2 == (id.al[1][v6][v7_1] & 2) ? arg20 - 1 : arg20;
                gy v11_1 = null;
                gy v12 = v5 >= 0 ? arg28[v5] : v11_1;
                fv.af(arg20, v6, v7_1, v3, v8 + arg26 & 3, v10, arg27, v12, 0xD3D1701A);
            }
        }
    }

    static final void bk(byte[] arg11, int arg12, int arg13, bg arg14, gy[] arg15) {
        lq v0 = new lq(arg11);
        int v11 = -1;
        while(true) {
            int v1 = v0.bt(0x7F030049);
            if(v1 == 0) {
                return;
            }

            v11 += v1;
            v1 = 0;
            while(true) {
                int v2 = v0.by(30487);
                if(v2 == 0) {
                    break;
                }

                v1 += v2 - 1;
                int v4 = v1 >> 12;
                int v5 = v0.ay(-7);
                int v7 = v5 >> 2;
                int v6 = v5 & 3;
                int v3 = (v1 >> 6 & 0x3F) + arg12;
                v5 = (0xA730D859 & v1) + arg13;
                if(v3 <= 0) {
                    continue;
                }

                if(v5 <= 0) {
                    continue;
                }

                v2 = 103;
                if(v3 >= v2) {
                    continue;
                }

                if(v5 >= v2) {
                    continue;
                }

                v2 = 2 == (id.al[1][v3][v5] & 2) ? v4 - 1 : v4;
                gy v8 = null;
                gy v9 = v2 >= 0 ? arg15[v2] : v8;
                fv.af(v4, v3, v5, v11, v6, v7, arg14, v9, -1270533713);
            }
        }
    }

    static final void bl(int arg37, int arg38, int arg39, int arg40, int arg41, int arg42, bg arg43, gy arg44) {
        bm v9_3;
        int v4_1;
        long v5_3;
        bm v6_1;
        hj v6_2;
        int v26;
        do v14_1;
        do v11_2;
        bm v7_1;
        hj v7_2;
        gy v11_1;
        int v10;
        do v15_1;
        bm v5;
        hj v5_1;
        int v7;
        int v0;
        int v1;
        int v12 = arg37;
        int v13 = arg38;
        int v14 = arg39;
        int v15 = arg41;
        int v11 = arg42;
        int v8 = 16;
        int v6 = 2;
        if((client.ab) && (id.al[0][v13][v14] & v6) == 0 && (id.al[v12][v13][v14] & v8) != 0) {
            return;
        }

        if(v12 < id.ae * 0x61C2FDFD) {
            id.ae = 595036713 * v12;
        }

        do v4 = ok.al(arg40, 1408033552);
        int v3 = 3;
        if(1 == v15 || v3 == v15) {
            v3 = v4.ag * 0x4B9D7897;
            v1 = v4.az * 501189308;
        }
        else {
            v3 = v4.az * 0xB46CA623;
            v1 = v4.ag * 0x4B9D7897;
        }

        if(v3 + v13 <= 0xADAD403D) {
            v0 = (v3 >> 1) + v13;
            v7 = (v3 + 1 >> 1) + v13;
        }
        else {
            v7 = v13 + 1;
            v0 = v13;
        }

        if(v14 + v1 <= 104) {
            v6 = (v1 >> 1) + v14;
            v8 = (v1 + 1 >> 1) + v14;
        }
        else {
            v8 = v14 + 1;
            v6 = v14;
        }

        int[][] v28 = id.ax[v12];
        int v27 = v28[v7][v8] + (v28[v0][v6] + v28[v7][v6] + v28[v0][v8]) >> 2;
        v7 = (v3 << 6) + (v13 << 7);
        v8 = (v14 << 7) + (v1 << 6);
        int v16 = 2;
        boolean v17 = v4.ay * 0x9BA5A770 == 0 ? true : false;
        int v29 = v1;
        int v30 = v3;
        do v9 = v4;
        long v32 = gs.aa(arg38, arg39, v16, v17, arg40, 1);
        v0 = (v15 << 6) + v11;
        if(1 == v9.bb * 0x3376F5D7) {
            v0 += 0x100;
        }

        int v24 = v0;
        if(v9.am(0x935EA335)) {
            iu.ar(arg37, arg38, arg39, v9, arg41, -76095806);
        }

        v1 = -1;
        int v2 = 0x804BDF6B;
        if(22 == v11) {
            if((client.ab) && v9.ay * 0xE5018CDF == 0 && v9.ah * 25067197 != 1 && !v9.bz) {
                return;
            }

            if(v1 != v9.ak * v2 || v9.bc != null) {
                v15_1 = v9;
                v10 = 1;
                v11_1 = arg44;
                v5_1 = new hj(arg40, 22, arg41, arg37, arg38, arg39, v9.ak * v2, true, null);
            }
            else {
                v5 = v9.ad(22, arg41, v28, v7, v27, v8, -700180005);
                v15_1 = v9;
                v10 = 1;
                v11_1 = arg44;
            }

            arg43.aj(arg37, arg38, arg39, v27, ((bm)v5_1), v32, v24);
            if(v10 == v15_1.ah * 0x1580E90C && v11_1 != null) {
                v11_1.an(v13, v14, 0);
            }

            return;
        }

        gy v25 = arg44;
        int v36 = v15;
        v15_1 = v9;
        int v9_1 = v36;
        int v17_1 = 0xE748B627;
        int v5_2 = 4;
        if(10 != v11) {
            if(11 == v11) {
            }
            else if(v11 >= 12) {
                if(v15_1.ak * 0xDFF0D177 != v1 || v15_1.bc != null) {
                    v7_2 = new hj(arg40, arg42, arg41, arg37, arg38, arg39, v15_1.ak * v2, true, null);
                }
                else {
                    v7_1 = v15_1.ad(arg42, arg41, v28, v7, v27, v8, -700180005);
                }

                do v34 = v15_1;
                v15 = v11;
                arg43.af(arg37, arg38, arg39, v27, 1, 1, ((bm)v7_2), 0, v32, v24);
                if(v15 >= 12 && v15 <= 17 && 13 != v15 && v12 > 0) {
                    id.au[v12][v13][v14] |= 2340;
                }

                v11_2 = v34;
                if(v11_2.ah * 0xDE8448DF != 0 && v25 != null) {
                    arg44.ae(arg38, arg39, v30, v29, v11_2.at, 0xA77DFBE2);
                }

                return;
            }
            else {
                do v36_1 = v15_1;
                v15 = v11;
                v11_2 = v36_1;
                int v31 = 0x1CEE4599;
                byte v16_1 = 50;
                if(v15 == 0) {
                    if(v11_2.ak * v2 != v1 || v11_2.bc != null) {
                        v15 = v9_1;
                        v5_1 = new hj(arg40, 0, arg41, arg37, arg38, arg39, v11_2.ak * 0x1FB9502B, true, null);
                    }
                    else {
                        v5 = v11_2.ad(0, arg41, v28, v7, v27, v8, -700180005);
                        v15 = v9_1;
                    }

                    v14_1 = v11_2;
                    arg43.aq(arg37, arg38, arg39, v27, v5, null, id.ah[v15], 0, v32, v24);
                    if(v15 == 0) {
                        if(v14_1.bo) {
                            v11_2 = v14_1;
                            v14 = arg39;
                            nt.ad[v12][v13][v14] = v16_1;
                            nt.ad[v12][v13][v14 + 1] = v16_1;
                        }
                        else {
                            v11_2 = v14_1;
                            v14 = arg39;
                        }

                        if(!v11_2.as) {
                            goto label_468;
                        }

                        id.au[v12][v13][v14] |= 585;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg39;
                        if(1 == v15) {
                            if(v11_2.bo) {
                                v1 = v14 + 1;
                                nt.ad[v12][v13][v1] = 16;
                                nt.ad[v12][v13 + 1][v1] = v16_1;
                            }

                            if(!v11_2.as) {
                                goto label_468;
                            }

                            v1 = v14 + 1;
                            id.au[v12][v13][v1] |= 1170;
                            goto label_468;
                        }

                        if(2 == v15) {
                            if(v11_2.bo) {
                                v1 = v13 + 1;
                                nt.ad[v12][v1][v14] = 56;
                                nt.ad[v12][v1][v14 + 1] = v16_1;
                            }

                            if(!v11_2.as) {
                                goto label_468;
                            }

                            id.au[v12][v13 + 1][v14] |= 585;
                            goto label_468;
                        }

                        if(3 != v15) {
                            goto label_468;
                        }

                        if(v11_2.bo) {
                            nt.ad[v12][v13][v14] = v16_1;
                            nt.ad[v12][v13 + 1][v14] = -53;
                        }

                        if(!v11_2.as) {
                            goto label_468;
                        }

                        id.au[v12][v13][v14] |= 1170;
                    }

                label_468:
                    if(v11_2.ah * v17_1 != 0 && v25 != null) {
                        arg44.al(arg38, arg39, arg42, arg41, v11_2.at, 18);
                    }

                    if(16 != v11_2.ac * 1186680535) {
                        arg43.az(v12, v13, v14, v11_2.ac * v31);
                    }

                    return;
                }

                v3 = v9_1;
                v0 = v15;
                if(v0 == 1) {
                    if(v11_2.ak * v2 != v1 || v11_2.bc != null) {
                        v5_1 = new hj(arg40, 1, arg41, arg37, arg38, arg39, v11_2.ak * 0xFD5E488A, true, null);
                    }
                    else {
                        v5 = v11_2.ad(1, arg41, v28, v7, v27, v8, -700180005);
                    }

                    v15 = arg41;
                    v14_1 = v11_2;
                    arg43.aq(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.at[arg41], 0, v32, v24);
                    if(!v14_1.bo) {
                        v11_2 = v14_1;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        nt.ad[v12][v13][arg39 + 1] = 78;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg39;
                        if(v15 == 1) {
                            nt.ad[v12][v13 + 1][v14 + 1] = v16_1;
                        }
                        else if(2 == v15) {
                            nt.ad[v12][v13 + 1][v14] = v16_1;
                        }
                        else if(v15 == 3) {
                            nt.ad[v12][v13][v14] = v16_1;
                        }
                    }

                    if(v11_2.ah * 681850508 != 0 && v25 != null) {
                        arg44.al(arg38, arg39, arg42, arg41, v11_2.at, -37);
                    }

                    return;
                }

                v6 = v0;
                v15 = v3;
                if(v6 == 2) {
                    v26 = v15 + 1 & 3;
                    if(v1 != v11_2.ak * v2 || v11_2.bc != null) {
                        v5_1 = new hj(arg40, 2, v15 + 4, arg37, arg38, arg39, v11_2.ak * v2, true, null);
                        v6_2 = new hj(arg40, 2, v26, arg37, arg38, arg39, v11_2.ak * 0xE6C3FC93, true, null);
                    }
                    else {
                        v5 = v11_2.ad(2, v15 + 4, v28, v7, v27, v8, -700180005);
                        v6_1 = v11_2.ad(2, v26, v28, v7, v27, v8, -700180005);
                    }

                    v14_1 = v11_2;
                    arg43.aq(arg37, arg38, arg39, v27, v5, v6_1, id.ah[v15], id.ah[v26], v32, v24);
                    if(!v14_1.as) {
                        v11_2 = v14_1;
                        v14 = arg39;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        v14 = arg39;
                        id.au[v12][v13][((int)v14_1)] |= 0x503F48D3;
                        v1 = v14 + 1;
                        id.au[v12][v13][v1] |= 1170;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg39;
                        if(v15 == 1) {
                            v1 = v14 + 1;
                            id.au[v12][v13][v1] |= 1170;
                            id.au[v12][v13 + 1][v14] |= 0x8F100835;
                        }
                        else if(2 == v15) {
                            id.au[v12][v13 + 1][v14] |= 0xF05CAE9F;
                            id.au[v12][v13][v14] |= 1170;
                        }
                        else if(v15 == 3) {
                            id.au[v12][v13][v14] |= 0x957207D;
                            id.au[v12][v13][v14] |= 585;
                        }
                    }

                    if(v11_2.ah * 706992026 != 0 && v25 != null) {
                        arg44.al(arg38, arg39, arg42, arg41, v11_2.at, -95);
                    }

                    if(v11_2.ac * v31 != 16) {
                        arg43.az(v12, v13, v14, v11_2.ac * 518490720);
                    }

                    return;
                }

                if(3 == v6) {
                    if(v11_2.ak * v2 != v1 || v11_2.bc != null) {
                        v5_1 = new hj(arg40, 3, arg41, arg37, arg38, arg39, v11_2.ak * 0x763611E, true, null);
                    }
                    else {
                        v5 = v11_2.ad(3, arg41, v28, v7, v27, v8, -700180005);
                    }

                    v14_1 = v11_2;
                    arg43.aq(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.at[v15], 0, v32, v24);
                    if(!v14_1.bo) {
                        v11_2 = v14_1;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        nt.ad[v12][v13][arg39 + 1] = v16_1;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg39;
                        if(v15 == 1) {
                            nt.ad[v12][v13 + 1][v14 + 1] = 15;
                        }
                        else if(v15 == 2) {
                            nt.ad[v12][v13 + 1][v14] = -81;
                        }
                        else if(3 == v15) {
                            nt.ad[v12][v13][v14] = v16_1;
                        }
                    }

                    if(v11_2.ah * v17_1 != 0 && v25 != null) {
                        arg44.al(arg38, arg39, arg42, arg41, v11_2.at, 19);
                    }

                    return;
                }

                v10 = arg42;
                if(v10 == 9) {
                    if(v1 != v11_2.ak * 432069906 || v11_2.bc != null) {
                        v7_2 = new hj(arg40, arg42, arg41, arg37, arg38, arg39, v11_2.ak * v2, true, null);
                    }
                    else {
                        v7_1 = v11_2.ad(arg42, arg41, v28, v7, v27, v8, -700180005);
                    }

                    v15_1 = v11_2;
                    arg43.af(arg37, arg38, arg39, v27, 1, 1, ((bm)v7_2), 0, v32, v24);
                    if(v15_1.ah * v17_1 != 0 && v25 != null) {
                        arg44.ae(arg38, arg39, v30, v29, v15_1.at, 0xD3A0D53A);
                    }

                    if(v15_1.ac * v31 != 16) {
                        arg43.az(v12, v13, v14, v15_1.ac * v31);
                    }

                    return;
                }

                v26 = v15;
                v15_1 = v11_2;
                bg v11_3 = arg43;
                if(v10 == v5_2) {
                    if(v1 != v15_1.ak * v2 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, arg41, arg37, arg38, arg39, v15_1.ak * v2, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, arg41, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.ah[v26], 0, 0, 0, v32, v24);
                    return;
                }

                if(v10 == 5) {
                    v5_3 = v11_3.bd(v12, v13, v14);
                    v10 = 0 != v5_3 ? ok.al(be.av(v5_3), 0x6A8B1181).ac * -1535384909 : 16;
                    if(v15_1.ak * v2 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, arg41, arg37, arg38, arg39, v15_1.ak * 195109925, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, arg41, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.ah[v26], 0, v10 * id.ay[v26], v10 * id.aw[v26], v32, v24);
                    return;
                }

                v4_1 = 8;
                if(v10 == 6) {
                    v5_3 = v11_3.bd(v12, v13, v14);
                    v10 = 0 != v5_3 ? ok.al(be.av(v5_3), 0xBDB13BB8).ac * -210140702 / 2 : 8;
                    if(v15_1.ak * v2 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, v26 + 4, arg37, arg38, arg39, v15_1.ak * v2, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v26 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), null, 0x100, arg41, v10 * id.ao[v26], v10 * id.as[v26], v32, v24);
                    return;
                }

                if(7 == v10) {
                    v10 = v26 + 2 & 3;
                    if(v15_1.ak * 0xA0E208C8 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, v10 + 4, arg37, arg38, arg39, v15_1.ak * 0x98902B73, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v10 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), null, 0x100, v10, 0, 0, v32, v24);
                    return;
                }

                if(v10 == v4_1) {
                    long v9_2 = v11_3.bd(v12, v13, v14);
                    v10 = 0 != v9_2 ? ok.al(be.av(v9_2), 0xCD6D4961).ac * 1689099292 / 2 : 8;
                    int v25_1 = v26 + 2 & 3;
                    if(v15_1.ak * 0x1A204D30 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, v26 + 4, arg37, arg38, arg39, v15_1.ak * 307606903, true, null);
                        v6_2 = new hj(arg40, 4, v25_1 + 4, arg37, arg38, arg39, v15_1.ak * 0xD5F2B0, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v26 + 4, v28, v7, v27, v8, -700180005);
                        v6_1 = v15_1.ad(4, v25_1 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, v5, v6_1, 0x100, arg41, v10 * id.ao[v26], v10 * id.as[v26], v32, v24);
                    return;
                }

                return;
            }
        }

        v10 = v11;
        if(v1 != v15_1.ak * 1021461875 || v15_1.bc != null) {
            hj v9_4 = new hj(arg40, 10, arg41, arg37, arg38, arg39, v15_1.ak * 0xFF2CEA51, true, null);
        }
        else {
            v9_3 = v15_1.ad(10, arg41, v28, v7, v27, v8, -700180005);
        }

        if(v9_3 != null) {
            v8 = 11 == v10 ? 0x100 : 0;
            bm v14_2 = v9_3;
            if((arg43.af(arg37, arg38, arg39, v27, v30, v29, v9_3, v8, v32, v24)) && (v15_1.bo)) {
                v0 = 15;
                if((v14_2 instanceof ca)) {
                    v0 = v14_2.ad() / 4;
                    if(v0 > 30) {
                        v0 = 30;
                    }
                }

                v3 = v30;
                v1 = 0;
                while(v1 <= v3) {
                    v4_1 = v29;
                    for(v2 = 0; v2 <= v4_1; ++v2) {
                        v6 = v13 + v1;
                        v8 = v2 + arg39;
                        if(v0 > nt.ad[v12][v6][v8]) {
                            nt.ad[v12][v6][v8] = ((byte)v0);
                        }
                    }

                    ++v1;
                    v29 = v4_1;
                }

                v4_1 = v29;
                goto label_1410;
            }

            v4_1 = v29;
            v3 = v30;
        }
        else {
            v4_1 = v29;
            v3 = v30;
        }

    label_1410:
        if(v15_1.ah * v17_1 != 0 && v25 != null) {
            arg44.ae(arg38, arg39, v3, v4_1, v15_1.at, 0x8F72A6EA);
        }
    }

    static final void bm(byte[] arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, bg arg26, gy[] arg27) {
        int v0 = arg23;
        int v1 = arg24;
        lq v2 = new lq(arg18);
        int v3 = -1;
        while(true) {
            int v4 = v2.bt(0x7F030049);
            if(v4 == 0) {
                return;
            }

            v3 += v4;
            v4 = 0;
            while(true) {
                int v5 = v2.by(0x2E4F);
                if(v5 == 0) {
                    break;
                }

                v4 += v5 - 1;
                v5 = 0xF1E270AA & v4;
                int v6 = v4 >> 6 & 0x326B6E09;
                int v8 = v2.ay(-59);
                int v10 = v8 >> 2;
                v8 &= 3;
                if(arg22 != v4 >> 12) {
                    continue;
                }

                if(v6 < v0) {
                    continue;
                }

                if(v6 >= v0 + 8) {
                    continue;
                }

                if(v5 < v1) {
                    continue;
                }

                if(v5 >= v1 + 8) {
                    continue;
                }

                do v7 = ok.al(v3, -1369221081);
                v6 &= 7;
                v5 &= 7;
                int v11 = v6;
                v6 = arg20 + fl.ae(v6, v5, arg25, v7.az * 0xC8ED574F, v7.ag * 0x4B9D7897, v8, 0x6EE59AF3);
                int v7_1 = arg21 + cg.ar(v11, v5, arg25, v7.az * 0xB46CA623, v7.ag * 0x3AAB96A1, v8, -1823180850);
                if(v6 <= 0) {
                    continue;
                }

                if(v7_1 <= 0) {
                    continue;
                }

                v5 = 103;
                if(v6 >= v5) {
                    continue;
                }

                if(v7_1 >= v5) {
                    continue;
                }

                v5 = 2 == (id.al[1][v6][v7_1] & 2) ? arg19 - 1 : arg19;
                gy v11_1 = null;
                gy v12 = v5 >= 0 ? arg27[v5] : v11_1;
                fv.af(arg19, v6, v7_1, v3, v8 + arg25 & 3, v10, arg26, v12, 0xB2FD3623);
            }
        }
    }

    static final void bn(byte[] arg16, int arg17, int arg18, int arg19, int arg20, gy[] arg21) {
        int v1;
        for(v1 = 0; true; ++v1) {
            int v2 = 4;
            int v3 = 0x40;
            if(v1 >= v2) {
                break;
            }

            for(v2 = 0; v2 < v3; ++v2) {
                int v4;
                for(v4 = 0; v4 < v3; ++v4) {
                    int v5 = v2 + arg17;
                    if(v5 > 0) {
                        int v6 = 103;
                        if(v5 < v6) {
                            int v7 = arg18 + v4;
                            if(v7 > 0 && v7 < v6) {
                                arg21[v1].bx[v5][v7] &= 0xFEFFFFFF;
                            }
                        }
                    }
                }
            }
        }

        lq v1_1 = new lq(arg16);
        int v12;
        for(v12 = 0; v12 < v2; ++v12) {
            int v13;
            for(v13 = 0; v13 < v3; ++v13) {
                int v11;
                for(v11 = 0; v11 < v3; ++v11) {
                    hj.aj(v1_1, v12, arg17 + v13, v11 + arg18, arg19, arg20, 0, 322063829);
                }
            }
        }
    }

    static final void bo(int arg7, int arg8, int arg9) {
        int v2;
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = 8;
            if(v1 >= v2) {
                break;
            }

            int v3;
            for(v3 = 0; v3 < v2; ++v3) {
                id.ax[arg7][v1 + arg8][arg9 + v3] = 0;
            }
        }

        int v0 = 1;
        if(arg8 > 0) {
            for(v1 = 1; v1 < v2; ++v1) {
                int v4 = v1 + arg9;
                id.ax[arg7][arg8][v4] = id.ax[arg7][arg8 - 1][v4];
            }
        }

        if(arg9 > 0) {
            while(v0 < v2) {
                v3 = v0 + arg8;
                id.ax[arg7][v3][arg9] = id.ax[arg7][v3][arg9 - 1];
                ++v0;
            }
        }

        if(arg8 > 0) {
            v1 = arg8 - 1;
            if(id.ax[arg7][v1][arg9] != 0) {
                id.ax[arg7][arg8][arg9] = id.ax[arg7][v1][arg9];
            }
            else {
                goto label_62;
            }
        }
        else {
        label_62:
            if(arg9 > 0) {
                v1 = arg9 - 1;
                if(id.ax[arg7][arg8][v1] != 0) {
                    id.ax[arg7][arg8][arg9] = id.ax[arg7][arg8][v1];
                    return;
                }
            }

            if(arg8 <= 0) {
                return;
            }

            if(arg9 <= 0) {
                return;
            }

            v1 = arg8 - 1;
            v2 = arg9 - 1;
            if(id.ax[arg7][v1][v2] == 0) {
                return;
            }

            id.ax[arg7][arg8][arg9] = id.ax[arg7][v1][v2];
        }
    }

    static final void bp(byte[] arg16, int arg17, int arg18, int arg19, int arg20, gy[] arg21) {
        int v1;
        for(v1 = 0; true; ++v1) {
            int v2 = 4;
            int v3 = 0x40;
            if(v1 >= v2) {
                break;
            }

            for(v2 = 0; v2 < v3; ++v2) {
                int v4;
                for(v4 = 0; v4 < v3; ++v4) {
                    int v5 = v2 + arg17;
                    if(v5 > 0) {
                        int v6 = 103;
                        if(v5 < v6) {
                            int v7 = arg18 + v4;
                            if(v7 > 0 && v7 < v6) {
                                arg21[v1].bx[v5][v7] &= 0xFEFFFFFF;
                            }
                        }
                    }
                }
            }
        }

        lq v1_1 = new lq(arg16);
        int v12;
        for(v12 = 0; v12 < v2; ++v12) {
            int v13;
            for(v13 = 0; v13 < v3; ++v13) {
                int v11;
                for(v11 = 0; v11 < v3; ++v11) {
                    hj.aj(v1_1, v12, arg17 + v13, v11 + arg18, arg19, arg20, 0, 322063829);
                }
            }
        }
    }

    static final void bq(lq arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int v0 = 49;
        if(arg8 >= 0) {
            int v2 = 104;
            if(arg8 >= v2) {
                goto label_105;
            }
            else if(arg9 < 0) {
                goto label_105;
            }
            else if(arg9 < v2) {
                id.al[arg7][arg8][arg9] = 0;
                while(true) {
                    v2 = arg6.ay(-30);
                    if(v2 == 0) {
                        break;
                    }
                    else if(v2 == 1) {
                        int v6 = arg6.ay(-71);
                        if(1 == v6) {
                            v6 = 0;
                        }

                        if(arg7 == 0) {
                            id.ax[0][arg8][arg9] = -v6 * 8;
                            return;
                        }

                        id.ax[arg7][arg8][arg9] = id.ax[arg7 - 1][arg8][arg9] - v6 * 8;
                    }
                    else {
                        if(v2 <= v0) {
                            id.an[arg7][arg8][arg9] = arg6.aw(-1215098345);
                            v2 += -2;
                            id.ap[arg7][arg8][arg9] = ((byte)(v2 / 4));
                            id.aj[arg7][arg8][arg9] = ((byte)(v2 + arg12 & 3));
                            continue;
                        }

                        if(v2 <= 81) {
                            id.al[arg7][arg8][arg9] = ((byte)(v2 - 49));
                            continue;
                        }

                        id.ar[arg7][arg8][arg9] = ((byte)(v2 - 81));
                        continue;
                    }

                    return;
                }

                if(arg7 == 0) {
                    id.ax[0][arg8][arg9] = -di.aa(arg10 + (arg8 + 0xE3B7B), 0x87CCE + arg9 + arg11, 0xEFE853BA) * 8;
                    return;
                }

                id.ax[arg7][arg8][arg9] = id.ax[arg7 - 1][arg8][arg9] - 0xF0;
            }
            else {
                goto label_105;
            }
        }
        else {
            while(true) {
            label_105:
                arg7 = arg6.ay(-49);
                if(arg7 == 0) {
                    break;
                }

                if(1 == arg7) {
                    arg6.ay(-95);
                    return;
                }

                if(arg7 > v0) {
                    continue;
                }

                arg6.ay(-80);
            }
        }
    }

    static final void br(int arg37, int arg38, int arg39, int arg40, int arg41, int arg42, bg arg43, gy arg44) {
        int v4_2;
        bm v9_3;
        long v4_1;
        bm v6_1;
        hj v6_2;
        int v26;
        int v2;
        do v14_1;
        do v11_2;
        bm v7_1;
        hj v7_2;
        gy v11_1;
        int v10;
        do v15_1;
        bm v5;
        hj v5_1;
        int v7;
        int v0;
        int v1;
        int v12 = arg37;
        int v13 = arg38;
        int v14 = arg39;
        int v15 = arg41;
        int v11 = arg42;
        int v8 = 16;
        int v6 = 2;
        if((client.ab) && (id.al[0][v13][v14] & v6) == 0 && (id.al[v12][v13][v14] & v8) != 0) {
            return;
        }

        if(v12 < id.ae * -1370227074) {
            id.ae = 0x621EECA0 * v12;
        }

        do v4 = ok.al(arg40, 0xD1AD12BE);
        int v3 = 3;
        if(1 == v15 || v3 == v15) {
            v3 = v4.ag * 0x4B9D7897;
            v1 = v4.az * 0x2F28E0C2;
        }
        else {
            v3 = v4.az * 0x12FCC35C;
            v1 = v4.ag * 0x4B9D7897;
        }

        if(v3 + v13 <= 104) {
            v0 = (v3 >> 1) + v13;
            v7 = (v3 + 1 >> 1) + v13;
        }
        else {
            v7 = v13 + 1;
            v0 = v13;
        }

        if(v14 + v1 <= 104) {
            v6 = (v1 >> 1) + v14;
            v8 = (v1 + 1 >> 1) + v14;
        }
        else {
            v8 = v14 + 1;
            v6 = v14;
        }

        int[][] v28 = id.ax[v12];
        int v27 = v28[v7][v8] + (v28[v0][v6] + v28[v7][v6] + v28[v0][v8]) >> 2;
        v7 = (v3 << 6) + (v13 << 7);
        v8 = (v14 << 7) + (v1 << 6);
        int v16 = 2;
        boolean v17 = v4.ay * 0xE5018CDF == 0 ? true : false;
        int v29 = v1;
        int v30 = v3;
        do v9 = v4;
        long v32 = gs.aa(arg38, arg39, v16, v17, arg40, 1);
        v0 = (v15 << 6) + v11;
        if(1 == v9.bb * 0x3D028E61) {
            v0 += 0x100;
        }

        int v24 = v0;
        if(v9.am(0x8F1922F3)) {
            iu.ar(arg37, arg38, arg39, v9, arg41, 0xABD073D6);
        }

        v1 = -1;
        v16 = 0x804BDF6B;
        if(22 == v11) {
            if((client.ab) && v9.ay * 449600726 == 0 && v9.ah * 0xE748B627 != 1 && !v9.bz) {
                return;
            }

            if(v1 != v9.ak * v16 || v9.bc != null) {
                v15_1 = v9;
                v10 = 1;
                v11_1 = arg44;
                v5_1 = new hj(arg40, 22, arg41, arg37, arg38, arg39, v9.ak * 0x4C05CFAD, true, null);
            }
            else {
                v5 = v9.ad(22, arg41, v28, v7, v27, v8, -700180005);
                v15_1 = v9;
                v10 = 1;
                v11_1 = arg44;
            }

            arg43.aj(arg37, arg38, arg39, v27, ((bm)v5_1), v32, v24);
            if(v10 == v15_1.ah * 0x6550803B && v11_1 != null) {
                v11_1.an(v13, v14, 0);
            }

            return;
        }

        gy v25 = arg44;
        int v36 = v15;
        v15_1 = v9;
        int v9_1 = v36;
        int v5_2 = 4;
        if(10 != v11) {
            if(11 == v11) {
            }
            else if(v11 >= 12) {
                if(v15_1.ak * -978458940 != v1 || v15_1.bc != null) {
                    v7_2 = new hj(arg40, arg42, arg41, arg37, arg38, arg39, v15_1.ak * 0x907D0D6C, true, null);
                }
                else {
                    v7_1 = v15_1.ad(arg42, arg41, v28, v7, v27, v8, -700180005);
                }

                do v34 = v15_1;
                v15 = v11;
                arg43.af(arg37, arg38, arg39, v27, 1, 1, v7_1, 0, v32, v24);
                if(v15 >= 12 && v15 <= 17 && 13 != v15 && v12 > 0) {
                    id.au[v12][v13][v14] |= 2340;
                }

                v11_2 = v34;
                if(v11_2.ah * 0x86D01643 != 0 && v25 != null) {
                    arg44.ae(arg38, arg39, v30, v29, v11_2.at, 0x14CF543B);
                }

                return;
            }
            else {
                do v36_1 = v15_1;
                v15 = v11;
                v11_2 = v36_1;
                int v31 = 0x1CEE4599;
                byte v17_1 = 50;
                if(v15 == 0) {
                    if(v11_2.ak * v16 != v1 || v11_2.bc != null) {
                        v15 = v9_1;
                        v5_1 = new hj(arg40, 0, arg41, arg37, arg38, arg39, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(0, arg41, v28, v7, v27, v8, -700180005);
                        v15 = v9_1;
                    }

                    v14_1 = v11_2;
                    arg43.aq(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.ah[v15], 0, v32, v24);
                    if(v15 == 0) {
                        if(v14_1.bo) {
                            v11_2 = v14_1;
                            v14 = arg39;
                            nt.ad[v12][v13][v14] = 36;
                            nt.ad[v12][v13][v14 + 1] = v17_1;
                        }
                        else {
                            v11_2 = v14_1;
                            v14 = arg39;
                        }

                        if(!v11_2.as) {
                            goto label_469;
                        }

                        id.au[v12][v13][v14] |= 0x186D4F55;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg39;
                        if(1 == v15) {
                            if(v11_2.bo) {
                                v1 = v14 + 1;
                                nt.ad[v12][v13][v1] = 105;
                                nt.ad[v12][v13 + 1][v1] = v17_1;
                            }

                            if(!v11_2.as) {
                                goto label_469;
                            }

                            v1 = v14 + 1;
                            id.au[v12][v13][v1] |= 1170;
                            goto label_469;
                        }

                        if(2 == v15) {
                            if(v11_2.bo) {
                                v1 = v13 + 1;
                                nt.ad[v12][v1][v14] = v17_1;
                                nt.ad[v12][v1][v14 + 1] = v17_1;
                            }

                            if(!v11_2.as) {
                                goto label_469;
                            }

                            id.au[v12][v13 + 1][v14] |= 0x593A05A7;
                            goto label_469;
                        }

                        if(3 != v15) {
                            goto label_469;
                        }

                        if(v11_2.bo) {
                            nt.ad[v12][v13][v14] = -105;
                            nt.ad[v12][v13 + 1][v14] = v17_1;
                        }

                        if(!v11_2.as) {
                            goto label_469;
                        }

                        id.au[v12][v13][v14] |= 1170;
                    }

                label_469:
                    if(v11_2.ah * 0xAAEC01C0 != 0 && v25 != null) {
                        arg44.al(arg38, arg39, arg42, arg41, v11_2.at, 29);
                    }

                    if(16 != v11_2.ac * 0x295F7602) {
                        arg43.az(v12, v13, v14, v11_2.ac * v31);
                    }

                    return;
                }

                v3 = v9_1;
                v2 = v15;
                if(v2 == 1) {
                    if(v11_2.ak * 1010051067 != v1 || v11_2.bc != null) {
                        v5_1 = new hj(arg40, 1, arg41, arg37, arg38, arg39, v11_2.ak * 0xE7C38F5D, true, null);
                    }
                    else {
                        v5 = v11_2.ad(1, arg41, v28, v7, v27, v8, -700180005);
                    }

                    v15 = arg41;
                    v14_1 = v11_2;
                    arg43.aq(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.at[arg41], 0, v32, v24);
                    if(!v14_1.bo) {
                        v11_2 = v14_1;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        nt.ad[v12][v13][arg39 + 1] = -20;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg39;
                        if(v15 == 1) {
                            nt.ad[v12][v13 + 1][v14 + 1] = v17_1;
                        }
                        else if(2 == v15) {
                            nt.ad[v12][v13 + 1][v14] = v17_1;
                        }
                        else if(v15 == 3) {
                            nt.ad[v12][v13][v14] = v17_1;
                        }
                    }

                    if(v11_2.ah * 0xF8EA5F24 != 0 && v25 != null) {
                        arg44.al(arg38, arg39, arg42, arg41, v11_2.at, -102);
                    }

                    return;
                }

                v6 = v2;
                v15 = v3;
                if(v6 == 2) {
                    v26 = v15 + 1 & 3;
                    if(v1 != v11_2.ak * v16 || v11_2.bc != null) {
                        v5_1 = new hj(arg40, 2, v15 + 4, arg37, arg38, arg39, v11_2.ak * v16, true, null);
                        v6_2 = new hj(arg40, 2, v26, arg37, arg38, arg39, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(2, v15 + 4, v28, v7, v27, v8, -700180005);
                        v6_1 = v11_2.ad(2, v26, v28, v7, v27, v8, -700180005);
                    }

                    v14_1 = v11_2;
                    arg43.aq(arg37, arg38, arg39, v27, ((bm)v5_1), v6_1, id.ah[v15], id.ah[v26], v32, v24);
                    if(!v14_1.as) {
                        v11_2 = v14_1;
                        v14 = arg39;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        v14 = arg39;
                        id.au[v12][v13][v14] |= 585;
                        v1 = v14 + 1;
                        id.au[v12][v13][v1] |= -716530503;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg39;
                        if(v15 == 1) {
                            v1 = v14 + 1;
                            id.au[v12][v13][v1] |= 1170;
                            id.au[v12][v13 + 1][v14] |= 0x2EFA254F;
                        }
                        else if(2 == v15) {
                            id.au[v12][v13 + 1][v14] |= 0xB5941761;
                            id.au[v12][v13][v14] |= 1170;
                        }
                        else if(v15 == 3) {
                            id.au[v12][v13][v14] |= 1170;
                            id.au[v12][v13][v14] |= 0x424BF5A1;
                        }
                    }

                    if(v11_2.ah * 0x80E88085 != 0 && v25 != null) {
                        arg44.al(arg38, arg39, arg42, arg41, v11_2.at, 7);
                    }

                    if(v11_2.ac * -1460261830 != 16) {
                        arg43.az(v12, v13, v14, v11_2.ac * v31);
                    }

                    return;
                }

                if(3 == v6) {
                    if(v11_2.ak * v16 != v1 || v11_2.bc != null) {
                        v5_1 = new hj(arg40, 3, arg41, arg37, arg38, arg39, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(3, arg41, v28, v7, v27, v8, -700180005);
                    }

                    v14_1 = v11_2;
                    arg43.aq(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.at[v15], 0, v32, v24);
                    if(!v14_1.bo) {
                        v11_2 = v14_1;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        nt.ad[v12][v13][arg39 + 1] = v17_1;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg39;
                        if(v15 == 1) {
                            nt.ad[v12][v13 + 1][v14 + 1] = -55;
                        }
                        else if(v15 == 2) {
                            nt.ad[v12][v13 + 1][v14] = v17_1;
                        }
                        else if(3 == v15) {
                            nt.ad[v12][v13][v14] = -28;
                        }
                    }

                    if(v11_2.ah * 0x90A8DF5B != 0 && v25 != null) {
                        arg44.al(arg38, arg39, arg42, arg41, v11_2.at, 8);
                    }

                    return;
                }

                v0 = 2;
                v10 = arg42;
                if(v10 == 9) {
                    if(v1 != v11_2.ak * -2125197014 || v11_2.bc != null) {
                        v7_2 = new hj(arg40, arg42, arg41, arg37, arg38, arg39, v11_2.ak * v16, true, null);
                    }
                    else {
                        v7_1 = v11_2.ad(arg42, arg41, v28, v7, v27, v8, -700180005);
                    }

                    v15_1 = v11_2;
                    arg43.af(arg37, arg38, arg39, v27, 1, 1, v7_1, 0, v32, v24);
                    if(v15_1.ah * 0x70710FB7 != 0 && v25 != null) {
                        arg44.ae(arg38, arg39, v30, v29, v15_1.at, 920600789);
                    }

                    if(v15_1.ac * 1027261138 != 16) {
                        arg43.az(v12, v13, v14, v15_1.ac * v31);
                    }

                    return;
                }

                v26 = v15;
                v15_1 = v11_2;
                bg v11_3 = arg43;
                if(v10 == v5_2) {
                    if(v1 != v15_1.ak * v16 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, arg41, arg37, arg38, arg39, v15_1.ak * -125904162, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, arg41, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.ah[v26], 0, 0, 0, v32, v24);
                    return;
                }

                long v17_2 = 0;
                if(v10 == 5) {
                    v4_1 = v11_3.bd(v12, v13, v14);
                    v10 = v17_2 != v4_1 ? ok.al(be.av(v4_1), 1254774806).ac * 0x2F5E9C6F : 16;
                    if(v15_1.ak * 0x536C9BA0 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, arg41, arg37, arg38, arg39, v15_1.ak * 0x6C004A43, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, arg41, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), null, id.ah[v26], 0, v10 * id.ay[v26], v10 * id.aw[v26], v32, v24);
                    return;
                }

                v3 = 8;
                if(v10 == 6) {
                    v4_1 = v11_3.bd(v12, v13, v14);
                    v10 = v17_2 != v4_1 ? ok.al(be.av(v4_1), 0x219B167E).ac * v31 / 2 : 8;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, v26 + 4, arg37, arg38, arg39, v15_1.ak * 0x36342C4F, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v26 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), null, 0x100, arg41, v10 * id.ao[v26], v10 * id.as[v26], v32, v24);
                    return;
                }

                if(7 == v10) {
                    v10 = v26 + 2 & 3;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, v10 + 4, arg37, arg38, arg39, v15_1.ak * 0xA272C4E8, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v10 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), null, 1043489606, v10, 0, 0, v32, v24);
                    return;
                }

                if(v10 == v3) {
                    long v9_2 = v11_3.bd(v12, v13, v14);
                    v10 = v17_2 != v9_2 ? ok.al(be.av(v9_2), 0x69700598).ac * 0xD51930C6 / v0 : 8;
                    int v25_1 = v26 + 2 & 3;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg40, 4, v26 + 4, arg37, arg38, arg39, v15_1.ak * 0x86A811, true, null);
                        v6_2 = new hj(arg40, 4, v25_1 + 4, arg37, arg38, arg39, v15_1.ak * 0x6122B890, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v26 + 4, v28, v7, v27, v8, -700180005);
                        v6_1 = v15_1.ad(4, v25_1 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg43.ab(arg37, arg38, arg39, v27, ((bm)v5_1), v6_1, 1144273306, arg41, v10 * id.ao[v26], v10 * id.as[v26], v32, v24);
                    return;
                }

                return;
            }
        }

        v10 = v11;
        if(v1 != v15_1.ak * 0x9E25B78D || v15_1.bc != null) {
            hj v9_4 = new hj(arg40, 10, arg41, arg37, arg38, arg39, v15_1.ak * v16, true, null);
        }
        else {
            v9_3 = v15_1.ad(10, arg41, v28, v7, v27, v8, -700180005);
        }

        if(v9_3 != null) {
            v8 = 11 == v10 ? 0xCEE696AF : 0;
            bm v14_2 = v9_3;
            if((arg43.af(arg37, arg38, arg39, v27, v30, v29, v9_3, v8, v32, v24)) && (v15_1.bo)) {
                v0 = 15;
                if((v14_2 instanceof ca)) {
                    v0 = v14_2.ad() / 4;
                    if(v0 > 30) {
                        v0 = 30;
                    }
                }

                v3 = v30;
                v1 = 0;
                while(v1 <= v3) {
                    v4_2 = v29;
                    for(v2 = 0; v2 <= v4_2; ++v2) {
                        v6 = v13 + v1;
                        v8 = v2 + arg39;
                        if(v0 > nt.ad[v12][v6][v8]) {
                            nt.ad[v12][v6][v8] = ((byte)v0);
                        }
                    }

                    ++v1;
                    v29 = v4_2;
                }

                v4_2 = v29;
                goto label_1411;
            }

            v4_2 = v29;
            v3 = v30;
        }
        else {
            v4_2 = v29;
            v3 = v30;
        }

    label_1411:
        if(v15_1.ah * 0x77F4CC9A != 0 && v25 != null) {
            arg44.ae(arg38, arg39, v3, v4_2, v15_1.at, 991507027);
        }
    }

    static final void bs(int arg38, int arg39, int arg40, int arg41, int arg42, int arg43, bg arg44, gy arg45) {
        int v4_2;
        bm v9_3;
        bm v6_1;
        hj v6_2;
        int v26;
        int v2;
        do v14_1;
        do v11_2;
        bm v7_1;
        hj v7_2;
        gy v11_1;
        int v10;
        do v15_1;
        bm v5;
        hj v5_1;
        int v7;
        int v0;
        int v1;
        int v12 = arg38;
        int v13 = arg39;
        int v14 = arg40;
        int v15 = arg42;
        int v11 = arg43;
        int v8 = 16;
        int v6 = 2;
        if((client.ab) && (id.al[0][v13][v14] & v6) == 0 && (id.al[v12][v13][v14] & v8) != 0) {
            return;
        }

        if(v12 < id.ae * 0x61C2FDFD) {
            id.ae = 834324309 * v12;
        }

        do v4 = ok.al(arg41, -1384069305);
        int v3 = 3;
        if(1 == v15 || v3 == v15) {
            v3 = v4.ag * 0x4B9D7897;
            v1 = v4.az * 0xB46CA623;
        }
        else {
            v3 = v4.az * 0xB46CA623;
            v1 = v4.ag * 0x4B9D7897;
        }

        if(v3 + v13 <= 104) {
            v0 = (v3 >> 1) + v13;
            v7 = (v3 + 1 >> 1) + v13;
        }
        else {
            v7 = v13 + 1;
            v0 = v13;
        }

        if(v14 + v1 <= 104) {
            v6 = (v1 >> 1) + v14;
            v8 = (v1 + 1 >> 1) + v14;
        }
        else {
            v8 = v14 + 1;
            v6 = v14;
        }

        int[][] v28 = id.ax[v12];
        int v27 = v28[v7][v8] + (v28[v0][v6] + v28[v7][v6] + v28[v0][v8]) >> 2;
        v7 = (v3 << 6) + (v13 << 7);
        v8 = (v14 << 7) + (v1 << 6);
        int v16 = 2;
        boolean v17 = v4.ay * 0xE5018CDF == 0 ? true : false;
        int v29 = v1;
        int v30 = v3;
        do v9 = v4;
        long v32 = gs.aa(arg39, arg40, v16, v17, arg41, 1);
        v0 = (v15 << 6) + v11;
        if(1 == v9.bb * 0x3376F5D7) {
            v0 += 0x100;
        }

        int v24 = v0;
        if(v9.am(-1899219020)) {
            iu.ar(arg38, arg39, arg40, v9, arg42, 0xF57E5D78);
        }

        int v34 = 0xE748B627;
        v1 = -1;
        v16 = 0x804BDF6B;
        if(22 == v11) {
            if((client.ab) && v9.ay * 0xE5018CDF == 0 && v9.ah * v34 != 1 && !v9.bz) {
                return;
            }

            if(v1 != v9.ak * v16 || v9.bc != null) {
                v15_1 = v9;
                v10 = 1;
                v11_1 = arg45;
                v5_1 = new hj(arg41, 22, arg42, arg38, arg39, arg40, v9.ak * v16, true, null);
            }
            else {
                v5 = v9.ad(22, arg42, v28, v7, v27, v8, -700180005);
                v15_1 = v9;
                v10 = 1;
                v11_1 = arg45;
            }

            arg44.aj(arg38, arg39, arg40, v27, v5, v32, v24);
            if(v10 == v15_1.ah * v34 && v11_1 != null) {
                v11_1.an(v13, v14, 0);
            }

            return;
        }

        gy v25 = arg45;
        int v37 = v15;
        v15_1 = v9;
        int v9_1 = v37;
        int v5_2 = 4;
        if(10 != v11) {
            if(11 == v11) {
            }
            else if(v11 >= 12) {
                if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                    v7_2 = new hj(arg41, arg43, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                }
                else {
                    v7_1 = v15_1.ad(arg43, arg42, v28, v7, v27, v8, -700180005);
                }

                do v35 = v15_1;
                v15 = v11;
                arg44.af(arg38, arg39, arg40, v27, 1, 1, v7_1, 0, v32, v24);
                if(v15 >= 12 && v15 <= 17 && 13 != v15 && v12 > 0) {
                    id.au[v12][v13][v14] |= 2340;
                }

                v11_2 = v35;
                if(v11_2.ah * v34 != 0 && v25 != null) {
                    arg45.ae(arg39, arg40, v30, v29, v11_2.at, 0x5F815904);
                }

                return;
            }
            else {
                do v37_1 = v15_1;
                v15 = v11;
                v11_2 = v37_1;
                int v31 = 0x1CEE4599;
                byte v17_1 = 50;
                if(v15 == 0) {
                    if(v11_2.ak * v16 != v1 || v11_2.bc != null) {
                        v15 = v9_1;
                        v5_1 = new hj(arg41, 0, arg42, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(0, arg42, v28, v7, v27, v8, -700180005);
                        v15 = v9_1;
                    }

                    v14_1 = v11_2;
                    arg44.aq(arg38, arg39, arg40, v27, v5, null, id.ah[v15], 0, v32, v24);
                    if(v15 == 0) {
                        if(v14_1.bo) {
                            v11_2 = v14_1;
                            v14 = arg40;
                            nt.ad[v12][v13][v14] = v17_1;
                            nt.ad[v12][v13][v14 + 1] = v17_1;
                        }
                        else {
                            v11_2 = v14_1;
                            v14 = arg40;
                        }

                        if(!v11_2.as) {
                            goto label_459;
                        }

                        id.au[v12][v13][v14] |= 585;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg40;
                        if(1 == v15) {
                            if(v11_2.bo) {
                                v1 = v14 + 1;
                                nt.ad[v12][v13][v1] = v17_1;
                                nt.ad[v12][v13 + 1][v1] = v17_1;
                            }

                            if(!v11_2.as) {
                                goto label_459;
                            }

                            v1 = v14 + 1;
                            id.au[v12][v13][v1] |= 1170;
                            goto label_459;
                        }

                        if(2 == v15) {
                            if(v11_2.bo) {
                                v1 = v13 + 1;
                                nt.ad[v12][v1][v14] = v17_1;
                                nt.ad[v12][v1][v14 + 1] = v17_1;
                            }

                            if(!v11_2.as) {
                                goto label_459;
                            }

                            id.au[v12][v13 + 1][v14] |= 585;
                            goto label_459;
                        }

                        if(3 != v15) {
                            goto label_459;
                        }

                        if(v11_2.bo) {
                            nt.ad[v12][v13][v14] = v17_1;
                            nt.ad[v12][v13 + 1][v14] = v17_1;
                        }

                        if(!v11_2.as) {
                            goto label_459;
                        }

                        id.au[v12][v13][v14] |= 1170;
                    }

                label_459:
                    if(v11_2.ah * v34 != 0 && v25 != null) {
                        arg45.al(arg39, arg40, arg43, arg42, v11_2.at, -124);
                    }

                    if(16 != v11_2.ac * v31) {
                        arg44.az(v12, v13, v14, v11_2.ac * v31);
                    }

                    return;
                }

                v3 = v9_1;
                v2 = v15;
                if(v2 == 1) {
                    if(v11_2.ak * v16 != v1 || v11_2.bc != null) {
                        v5_1 = new hj(arg41, 1, arg42, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(1, arg42, v28, v7, v27, v8, -700180005);
                    }

                    v15 = arg42;
                    v14_1 = v11_2;
                    arg44.aq(arg38, arg39, arg40, v27, v5, null, id.at[arg42], 0, v32, v24);
                    if(!v14_1.bo) {
                        v11_2 = v14_1;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        nt.ad[v12][v13][arg40 + 1] = v17_1;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg40;
                        if(v15 == 1) {
                            nt.ad[v12][v13 + 1][v14 + 1] = v17_1;
                        }
                        else if(2 == v15) {
                            nt.ad[v12][v13 + 1][v14] = v17_1;
                        }
                        else if(v15 == 3) {
                            nt.ad[v12][v13][v14] = v17_1;
                        }
                    }

                    if(v11_2.ah * v34 != 0 && v25 != null) {
                        arg45.al(arg39, arg40, arg43, arg42, v11_2.at, 86);
                    }

                    return;
                }

                v6 = v2;
                v15 = v3;
                if(v6 == 2) {
                    v26 = v15 + 1 & 3;
                    if(v1 != v11_2.ak * v16 || v11_2.bc != null) {
                        v5_1 = new hj(arg41, 2, v15 + 4, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                        v6_2 = new hj(arg41, 2, v26, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(2, v15 + 4, v28, v7, v27, v8, -700180005);
                        v6_1 = v11_2.ad(2, v26, v28, v7, v27, v8, -700180005);
                    }

                    v14_1 = v11_2;
                    arg44.aq(arg38, arg39, arg40, v27, v5, v6_1, id.ah[v15], id.ah[v26], v32, v24);
                    if(!v14_1.as) {
                        v11_2 = v14_1;
                        v14 = arg40;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        v14 = arg40;
                        id.au[v12][v13][v14] |= 585;
                        v1 = v14 + 1;
                        id.au[v12][v13][v1] |= 1170;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg40;
                        if(v15 == 1) {
                            v1 = v14 + 1;
                            id.au[v12][v13][v1] |= 1170;
                            id.au[v12][v13 + 1][v14] |= 585;
                        }
                        else if(2 == v15) {
                            id.au[v12][v13 + 1][v14] |= 585;
                            id.au[v12][v13][v14] |= 1170;
                        }
                        else if(v15 == 3) {
                            id.au[v12][v13][v14] |= 1170;
                            id.au[v12][v13][v14] |= 585;
                        }
                    }

                    if(v11_2.ah * v34 != 0 && v25 != null) {
                        arg45.al(arg39, arg40, arg43, arg42, v11_2.at, 0x60);
                    }

                    if(v11_2.ac * v31 != 16) {
                        arg44.az(v12, v13, v14, v11_2.ac * v31);
                    }

                    return;
                }

                if(3 == v6) {
                    if(v11_2.ak * v16 != v1 || v11_2.bc != null) {
                        v5_1 = new hj(arg41, 3, arg42, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                    }
                    else {
                        v5 = v11_2.ad(3, arg42, v28, v7, v27, v8, -700180005);
                    }

                    v14_1 = v11_2;
                    arg44.aq(arg38, arg39, arg40, v27, v5, null, id.at[v15], 0, v32, v24);
                    if(!v14_1.bo) {
                        v11_2 = v14_1;
                    }
                    else if(v15 == 0) {
                        v11_2 = v14_1;
                        nt.ad[v12][v13][arg40 + 1] = v17_1;
                    }
                    else {
                        v11_2 = v14_1;
                        v14 = arg40;
                        if(v15 == 1) {
                            nt.ad[v12][v13 + 1][v14 + 1] = v17_1;
                        }
                        else if(v15 == 2) {
                            nt.ad[v12][v13 + 1][v14] = v17_1;
                        }
                        else if(3 == v15) {
                            nt.ad[v12][v13][v14] = v17_1;
                        }
                    }

                    if(v11_2.ah * v34 != 0 && v25 != null) {
                        arg45.al(arg39, arg40, arg43, arg42, v11_2.at, 1);
                    }

                    return;
                }

                v0 = 2;
                v10 = arg43;
                if(v10 == 9) {
                    if(v1 != v11_2.ak * v16 || v11_2.bc != null) {
                        v7_2 = new hj(arg41, arg43, arg42, arg38, arg39, arg40, v11_2.ak * v16, true, null);
                    }
                    else {
                        v7_1 = v11_2.ad(arg43, arg42, v28, v7, v27, v8, -700180005);
                    }

                    v15_1 = v11_2;
                    arg44.af(arg38, arg39, arg40, v27, 1, 1, v7_1, 0, v32, v24);
                    if(v15_1.ah * v34 != 0 && v25 != null) {
                        arg45.ae(arg39, arg40, v30, v29, v15_1.at, 0xB87E69BD);
                    }

                    if(v15_1.ac * v31 != 16) {
                        arg44.az(v12, v13, v14, v15_1.ac * v31);
                    }

                    return;
                }

                v26 = v15;
                v15_1 = v11_2;
                bg v11_3 = arg44;
                if(v10 == v5_2) {
                    if(v1 != v15_1.ak * v16 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, arg42, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, v5, null, id.ah[v26], 0, 0, 0, v32, v24);
                    return;
                }

                if(v10 == 5) {
                    long v4_1 = v11_3.bd(v12, v13, v14);
                    v10 = 0 != v4_1 ? ok.al(be.av(v4_1), 0xDB860455).ac * v31 : 16;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, arg42, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, v5, null, id.ah[v26], 0, v10 * id.ay[v26], v10 * id.aw[v26], v32, v24);
                    return;
                }

                if(v10 == 6) {
                    long v3_1 = v11_3.bd(v12, v13, v14);
                    v10 = 0 != v3_1 ? ok.al(be.av(v3_1), -1396034217).ac * v31 / v0 : 8;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, v26 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v26 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, v5, null, 0x100, arg42, v10 * id.ao[v26], v10 * id.as[v26], v32, v24);
                    return;
                }

                if(7 == v10) {
                    v10 = v26 + 2 & 3;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, v10 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v10 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, v5, null, 0x100, v10, 0, 0, v32, v24);
                    return;
                }

                if(v10 == 8) {
                    long v9_2 = v11_3.bd(v12, v13, v14);
                    v10 = 0 != v9_2 ? ok.al(be.av(v9_2), 0xB952D2E1).ac * v31 / v0 : 8;
                    int v25_1 = v26 + 2 & 3;
                    if(v15_1.ak * v16 != v1 || v15_1.bc != null) {
                        v5_1 = new hj(arg41, 4, v26 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                        v6_2 = new hj(arg41, 4, v25_1 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v5 = v15_1.ad(4, v26 + 4, v28, v7, v27, v8, -700180005);
                        v6_1 = v15_1.ad(4, v25_1 + 4, v28, v7, v27, v8, -700180005);
                    }

                    arg44.ab(arg38, arg39, arg40, v27, v5, v6_1, 0x100, arg42, v10 * id.ao[v26], v10 * id.as[v26], v32, v24);
                    return;
                }

                return;
            }
        }

        v10 = v11;
        if(v1 != v15_1.ak * v16 || v15_1.bc != null) {
            hj v9_4 = new hj(arg41, 10, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
        }
        else {
            v9_3 = v15_1.ad(10, arg42, v28, v7, v27, v8, -700180005);
        }

        if(v9_3 != null) {
            v8 = 11 == v10 ? 0x100 : 0;
            bm v14_2 = v9_3;
            if((arg44.af(arg38, arg39, arg40, v27, v30, v29, v9_3, v8, v32, v24)) && (v15_1.bo)) {
                v0 = 15;
                if((v14_2 instanceof ca)) {
                    v0 = v14_2.ad() / 4;
                    if(v0 > 30) {
                        v0 = 30;
                    }
                }

                v3 = v30;
                v1 = 0;
                while(v1 <= v3) {
                    v4_2 = v29;
                    for(v2 = 0; v2 <= v4_2; ++v2) {
                        v6 = v13 + v1;
                        v8 = v2 + arg40;
                        if(v0 > nt.ad[v12][v6][v8]) {
                            nt.ad[v12][v6][v8] = ((byte)v0);
                        }
                    }

                    ++v1;
                    v29 = v4_2;
                }

                v4_2 = v29;
                goto label_1356;
            }

            v4_2 = v29;
            v3 = v30;
        }
        else {
            v4_2 = v29;
            v3 = v30;
        }

    label_1356:
        if(v15_1.ah * v34 != 0 && v25 != null) {
            arg45.ae(arg39, arg40, v3, v4_2, v15_1.at, -1967500131);
        }
    }

    static final void bt(int arg7, int arg8, int arg9) {
        int v2;
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = 8;
            if(v1 >= v2) {
                break;
            }

            int v3;
            for(v3 = 0; v3 < v2; ++v3) {
                id.ax[arg7][v1 + arg8][arg9 + v3] = 0;
            }
        }

        int v0 = 1;
        if(arg8 > 0) {
            for(v1 = 1; v1 < v2; ++v1) {
                int v4 = v1 + arg9;
                id.ax[arg7][arg8][v4] = id.ax[arg7][arg8 - 1][v4];
            }
        }

        if(arg9 > 0) {
            while(v0 < v2) {
                v3 = v0 + arg8;
                id.ax[arg7][v3][arg9] = id.ax[arg7][v3][arg9 - 1];
                ++v0;
            }
        }

        if(arg8 > 0) {
            v1 = arg8 - 1;
            if(id.ax[arg7][v1][arg9] != 0) {
                id.ax[arg7][arg8][arg9] = id.ax[arg7][v1][arg9];
            }
            else {
                goto label_62;
            }
        }
        else {
        label_62:
            if(arg9 > 0) {
                v1 = arg9 - 1;
                if(id.ax[arg7][arg8][v1] != 0) {
                    id.ax[arg7][arg8][arg9] = id.ax[arg7][arg8][v1];
                    return;
                }
            }

            if(arg8 <= 0) {
                return;
            }

            if(arg9 <= 0) {
                return;
            }

            v1 = arg8 - 1;
            v2 = arg9 - 1;
            if(id.ax[arg7][v1][v2] == 0) {
                return;
            }

            id.ax[arg7][arg8][arg9] = id.ax[arg7][v1][v2];
        }
    }

    static final void bu(byte[] arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, bg arg26, gy[] arg27) {
        int v0 = arg23;
        int v1 = arg24;
        lq v2 = new lq(arg18);
        int v3 = -1;
        while(true) {
            int v4 = v2.bt(0x7F030049);
            if(v4 == 0) {
                return;
            }

            v3 += v4;
            v4 = 0;
            while(true) {
                int v5 = v2.by(0x7076);
                if(v5 == 0) {
                    break;
                }

                v4 += v5 - 1;
                v5 = 0xE483F6D0 & v4;
                int v6 = v4 >> 6 & 0x3F;
                int v8 = v2.ay(-44);
                int v10 = v8 >> 2;
                v8 &= 3;
                if(arg22 != v4 >> 12) {
                    continue;
                }

                if(v6 < v0) {
                    continue;
                }

                if(v6 >= v0 + 8) {
                    continue;
                }

                if(v5 < v1) {
                    continue;
                }

                if(v5 >= v1 + 8) {
                    continue;
                }

                do v7 = ok.al(v3, 0x256CF9F9);
                v6 &= 7;
                v5 &= 7;
                int v11 = v6;
                v6 = arg20 + fl.ae(v6, v5, arg25, v7.az * 490119903, v7.ag * 1780114132, v8, 0x6234EAF3);
                int v7_1 = arg21 + cg.ar(v11, v5, arg25, v7.az * 408426258, v7.ag * 0x4B9D7897, v8, 0x97423CD3);
                if(v6 <= 0) {
                    continue;
                }

                if(v7_1 <= 0) {
                    continue;
                }

                v5 = 103;
                if(v6 >= v5) {
                    continue;
                }

                if(v7_1 >= v5) {
                    continue;
                }

                v5 = 2 == (id.al[1][v6][v7_1] & 2) ? arg19 - 1 : arg19;
                gy v11_1 = null;
                gy v12 = v5 >= 0 ? arg27[v5] : v11_1;
                fv.af(arg19, v6, v7_1, v3, v8 + arg25 & 3, v10, arg26, v12, 0x617DAF1B);
            }
        }
    }

    static final void bv(lq arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int v0 = 49;
        if(arg8 >= 0) {
            int v2 = 104;
            if(arg8 >= v2) {
                goto label_105;
            }
            else if(arg9 < 0) {
                goto label_105;
            }
            else if(arg9 < v2) {
                id.al[arg7][arg8][arg9] = 0;
                while(true) {
                    v2 = arg6.ay(-123);
                    if(v2 == 0) {
                        break;
                    }
                    else if(v2 == 1) {
                        int v6 = arg6.ay(-64);
                        if(1 == v6) {
                            v6 = 0;
                        }

                        if(arg7 == 0) {
                            id.ax[0][arg8][arg9] = -v6 * 8;
                            return;
                        }

                        id.ax[arg7][arg8][arg9] = id.ax[arg7 - 1][arg8][arg9] - v6 * 8;
                    }
                    else {
                        if(v2 <= v0) {
                            id.an[arg7][arg8][arg9] = arg6.aw(-1215098345);
                            v2 += -2;
                            id.ap[arg7][arg8][arg9] = ((byte)(v2 / 4));
                            id.aj[arg7][arg8][arg9] = ((byte)(v2 + arg12 & 3));
                            continue;
                        }

                        if(v2 <= 81) {
                            id.al[arg7][arg8][arg9] = ((byte)(v2 - 49));
                            continue;
                        }

                        id.ar[arg7][arg8][arg9] = ((byte)(v2 - 81));
                        continue;
                    }

                    return;
                }

                if(arg7 == 0) {
                    id.ax[0][arg8][arg9] = -di.aa(arg10 + (arg8 + 0xE3B7B), 0x87CCE + arg9 + arg11, 0xD0C65CDB) * 8;
                    return;
                }

                id.ax[arg7][arg8][arg9] = id.ax[arg7 - 1][arg8][arg9] - 0xF0;
            }
            else {
                goto label_105;
            }
        }
        else {
            while(true) {
            label_105:
                arg7 = arg6.ay(-78);
                if(arg7 == 0) {
                    break;
                }

                if(1 == arg7) {
                    arg6.ay(-91);
                    return;
                }

                if(arg7 > v0) {
                    continue;
                }

                arg6.ay(-105);
            }
        }
    }

    static final void bw(byte[] arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, gy[] arg32) {
        int v23;
        int v22;
        int v21;
        lq v2_1;
        int v7;
        int v6;
        int v3;
        int v0 = arg29;
        int v1 = arg30;
        int v10 = arg31;
        int v2;
        for(v2 = 0; true; ++v2) {
            v3 = 8;
            if(v2 >= v3) {
                break;
            }

            int v4;
            for(v4 = 0; v4 < v3; ++v4) {
                int v5 = arg26 + v2;
                if(v5 > 0) {
                    v6 = 103;
                    if(v5 < v6) {
                        v7 = arg27 + v4;
                        if(v7 > 0 && v7 < v6) {
                            arg32[arg25].bx[v5][v7] &= 0xFEFFFFFF;
                        }
                    }
                }
            }
        }

        lq v12 = new lq(arg24);
        int v9;
        for(v9 = 0; v9 < 4; ++v9) {
            int v8;
            for(v8 = 0; true; ++v8) {
                v7 = 0x40;
                if(v8 >= v7) {
                    break;
                }

                v6 = 0;
                while(v6 < v7) {
                    if(v9 != arg28 || v8 < v0 || v8 >= v0 + 8 || v6 < v1 || v6 >= v1 + 8) {
                        v21 = v6;
                        v22 = v8;
                        v23 = v9;
                        v2_1 = v12;
                        hj.aj(v12, 0, -1, -1, 0, 0, 0, 322063829);
                    }
                    else {
                        v2 = v8 & 7;
                        v3 = v6 & 7;
                        v4 = arg26 + bs.ax(v2, v3, v10, 89);
                        v7 = arg27 + ao.al(v2, v3, v10, -96);
                        v2_1 = v12;
                        v21 = v6;
                        v22 = v8;
                        v23 = v9;
                        hj.aj(v2_1, arg25, v4, v7, 0, 0, arg31, 322063829);
                    }

                    v6 = v21 + 1;
                    v12 = v2_1;
                    v8 = v22;
                    v9 = v23;
                    v7 = 0x40;
                }
            }
        }
    }

    static final void bx(lq arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if(arg7 < 0) {
            while(true) {
            label_108:
                arg6 = arg5.ay(-66);
                if(arg6 == 0) {
                    break;
                }

                if(1 == arg6) {
                    arg5.ay(-48);
                    return;
                }

                if(arg6 > -1785085750) {
                    continue;
                }

                arg5.ay(-24);
            }
        }
        else if(arg7 >= 0xE078BF41) {
            goto label_108;
        }
        else if(arg8 < 0) {
            goto label_108;
        }
        else if(arg8 < 0x4382E362) {
            id.al[arg6][arg7][arg8] = 0;
            while(true) {
                int v1 = arg5.ay(-111);
                if(v1 == 0) {
                    break;
                }
                else if(v1 == 1) {
                    int v5 = arg5.ay(-63);
                    if(1 == v5) {
                        v5 = 0;
                    }

                    if(arg6 == 0) {
                        id.ax[0][arg7][arg8] = -v5 * 8;
                        return;
                    }

                    id.ax[arg6][arg7][arg8] = id.ax[arg6 - 1][arg7][arg8] - v5 * 8;
                }
                else {
                    if(v1 <= 49) {
                        id.an[arg6][arg7][arg8] = arg5.aw(-1215098345);
                        v1 += -2;
                        id.ap[arg6][arg7][arg8] = ((byte)(v1 / 4));
                        id.aj[arg6][arg7][arg8] = ((byte)(v1 + arg11 & 3));
                        continue;
                    }

                    if(v1 <= 81) {
                        id.al[arg6][arg7][arg8] = ((byte)(v1 - 1180524837));
                        continue;
                    }

                    id.ar[arg6][arg7][arg8] = ((byte)(v1 - 81));
                    continue;
                }

                return;
            }

            if(arg6 == 0) {
                id.ax[0][arg7][arg8] = -di.aa(arg9 + (arg7 + 0xE3B7B), 0x87CCE + arg8 + arg10, -45771020) * 8;
                return;
            }

            id.ax[arg6][arg7][arg8] = id.ax[arg6 - 1][arg7][arg8] + 709003399;
        }
        else {
            goto label_108;
        }
    }

    static final void by(int arg7, int arg8, int arg9) {
        int v2;
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = 8;
            if(v1 >= v2) {
                break;
            }

            int v3;
            for(v3 = 0; v3 < v2; ++v3) {
                id.ax[arg7][v1 + arg8][arg9 + v3] = 0;
            }
        }

        int v0 = 1;
        if(arg8 > 0) {
            for(v1 = 1; v1 < v2; ++v1) {
                int v4 = v1 + arg9;
                id.ax[arg7][arg8][v4] = id.ax[arg7][arg8 - 1][v4];
            }
        }

        if(arg9 > 0) {
            while(v0 < v2) {
                v3 = v0 + arg8;
                id.ax[arg7][v3][arg9] = id.ax[arg7][v3][arg9 - 1];
                ++v0;
            }
        }

        if(arg8 > 0) {
            v1 = arg8 - 1;
            if(id.ax[arg7][v1][arg9] != 0) {
                id.ax[arg7][arg8][arg9] = id.ax[arg7][v1][arg9];
            }
            else {
                goto label_62;
            }
        }
        else {
        label_62:
            if(arg9 > 0) {
                v1 = arg9 - 1;
                if(id.ax[arg7][arg8][v1] != 0) {
                    id.ax[arg7][arg8][arg9] = id.ax[arg7][arg8][v1];
                    return;
                }
            }

            if(arg8 <= 0) {
                return;
            }

            if(arg9 <= 0) {
                return;
            }

            v1 = arg8 - 1;
            v2 = arg9 - 1;
            if(id.ax[arg7][v1][v2] == 0) {
                return;
            }

            id.ax[arg7][arg8][arg9] = id.ax[arg7][v1][v2];
        }
    }

    static final boolean bz(byte[] arg10, int arg11, int arg12) {
        lq v0 = new lq(arg10);
        int v10 = -1;
        boolean v2 = true;
        while(true) {
        label_5:
            int v3 = v0.bt(0x7F030049);
            if(v3 == 0) {
                return v2;
            }

            v10 += v3;
            boolean v5 = v2;
            int v2_1 = 0;
            int v4 = 0;
            while(true) {
            label_14:
                if(v2_1 == 0) {
                    int v6 = v0.by(0x3B04);
                    if(v6 != 0) {
                        v4 += v6 - 1;
                        int v8 = v0.ay(-99) >> 2;
                        int v7 = (v4 >> 6 & 0x3F) + arg11;
                        v6 = (v4 & 0x3F) + arg12;
                        if(v7 <= 0) {
                            continue;
                        }

                        if(v6 <= 0) {
                            continue;
                        }

                        int v9 = 103;
                        if(v7 >= v9) {
                            continue;
                        }

                        if(v6 >= v9) {
                            continue;
                        }

                        do v6_1 = ok.al(v10, 0xFB81291);
                        if(v8 == 22 && (client.ab) && v6_1.ay * 0xE5018CDF == 0 && 1 != v6_1.ah * 0xE748B627 && !v6_1.bz) {
                            continue;
                        }

                        if(!v6_1.aj(0xC74A562C)) {
                            client.fm += -1102395821;
                            v5 = false;
                        }

                        v2_1 = 1;
                        continue;
                    }
                }
                else if(v0.by(0x3F2D) != 0) {
                    break;
                }

                v2 = v5;
                goto label_5;
            }
        }

        v0.ay(-101);
        goto label_14;
        return v2;
    }

    static final void ca(bg arg41, gy[] arg42) {
        int v32;
        int v24;
        int v38;
        int v35;
        int v34;
        int v19;
        int v33;
        int v10_1;
        int v16;
        int v13;
        int v12;
        int v11;
        int v6;
        int v5;
        int v14;
        int v15;
        int v4;
        int v3;
        int v7;
        int v8;
        int v9;
        bg v10 = arg41;
        int v0;
        for(v0 = 0; true; ++v0) {
            v9 = 4;
            v8 = 2;
            v7 = 104;
            v3 = 1;
            if(v0 >= v9) {
                break;
            }

            int v1;
            for(v1 = 0; v1 < v7; ++v1) {
                int v2;
                for(v2 = 0; v2 < 515990596; ++v2) {
                    if((id.al[v0][v1][v2] & 1) == 1) {
                        v4 = v8 == (id.al[1][v1][v2] & v8) ? v0 - 1 : v0;
                        if(v4 < 0) {
                            goto label_32;
                        }

                        arg42[v4].ar(v1, v2, 0xBB304FFB);
                    }

                label_32:
                }
            }
        }

        double v4_1 = 5;
        id.ak += ((((int)(Math.random() * v4_1))) - v8) * 0x8CE2CDB6;
        if(id.ak * 0x60B80DBD < 0x8A715ADD) {
            id.ak = -1210145072;
        }

        if(id.ak * 0xB3E5175 > 8) {
            id.ak = 1394907224;
        }

        id.ac += ((((int)(Math.random() * v4_1))) - v8) * 18974807;
        int v22 = 0xBF2BE367;
        if(id.ac * v22 < 0x4F832885) {
            id.ac = 0xEDE77A90;
        }

        v1 = 16;
        if(id.ac * v22 > v1) {
            id.ac = 0x12188570;
        }

        v0 = 0;
        while(v0 < v9) {
            Math.sqrt(5100);
            for(v4 = 1; true; ++v4) {
                v15 = 103;
                if(v4 >= v15) {
                    break;
                }
            }

            for(v4 = 0; v4 < v7; ++v4) {
                id.ab[v4] = 0;
                ab.af[v4] = 0;
                ct.ai[v4] = 0;
                lb.av[v4] = 0;
                am.aa[v4] = 0;
            }

            v14 = -5;
            while(v14 < 2090100368) {
                if(v14 >= v3 && v14 < v15) {
                    v4 = 0;
                    v5 = 0;
                    v6 = 0;
                    v11 = 0;
                    v12 = 0;
                    v13 = -5;
                    while(v13 < 109) {
                        v2 = v13 + 5;
                        if(v2 >= 0 && v2 < 107029494) {
                            v4 += id.ab[v2];
                            v5 += ab.af[v2];
                            v6 += ct.ai[v2];
                            v11 += lb.av[v2];
                            v12 += am.aa[v2];
                        }

                        v2 = v13 - 5;
                        if(v2 >= 0 && v2 < v7) {
                            v4 -= id.ab[v2];
                            v5 -= ab.af[v2];
                            v6 -= ct.ai[v2];
                            v11 -= lb.av[v2];
                            v12 -= am.aa[v2];
                        }

                        int v25 = v4;
                        int v27 = v5;
                        int v29 = v6;
                        int v26 = v11;
                        int v28 = v12;
                        if(v13 < v3 || v13 >= 837366090) {
                        label_516:
                            v38 = v0;
                            v34 = v13;
                            v35 = v14;
                        }
                        else {
                            if((client.ab) && (id.al[0][v14][v13] & v8) == 0 && (id.al[v0][v14][v13] & v1) != 0) {
                                goto label_516;
                            }

                            if(v0 < id.ae * 0xFFFBFC08) {
                                id.ae = 0x350BAE35 * v0;
                            }

                            v2 = id.ar[v0][v14][v13] & 0xFF;
                            v5 = id.an[v0][v14][v13] & 0xFF;
                            if(v2 <= 0 && v5 <= 0) {
                                goto label_516;
                            }

                            v9 = id.ax[v0][v14][v13];
                            v11 = v14 + 1;
                            v12 = id.ax[v0][v11][v13];
                            v16 = v13 + 1;
                            v6 = id.ax[v0][v11][v16];
                            v15 = id.ax[v0][v14][v16];
                            v1 = id.aq[v14][v13];
                            v3 = id.aq[v11][v13];
                            v11 = id.aq[v11][v16];
                            v7 = id.aq[v14][v16];
                            if(v2 > 0) {
                                v4 = 0x1B00695C * v25 / v26;
                                v8 = v27 / v28;
                                v10_1 = v29 / v28;
                                v33 = v11;
                                v16 = fg.ay(v4, v8, v10_1, 0x7D193CD);
                                v11 = id.ak * 0xC5E65CB8 + v4;
                                v4 = 0xFF;
                                v11 &= v4;
                                v10_1 += id.ac * v22;
                                if(v10_1 < 0) {
                                    v4 = 0x7D193CD;
                                    v10_1 = 0;
                                }
                                else if(v10_1 > v4) {
                                    v4 = 0x7D193CD;
                                    v10_1 = 0xFF;
                                }
                                else {
                                    v4 = 0x7D193CD;
                                }

                                v4 = fg.ay(v11, v8, v10_1, v4);
                                v8 = v16;
                            }
                            else {
                                v33 = v11;
                                v4 = -1;
                                v8 = -1;
                            }

                            if(v0 > 0) {
                                v2 = v2 != 0 || id.ap[v0][v14][v13] == 0 ? 1 : 0;
                                if(v5 > 0 && !dz.al(v5 - 1, 0x29933539).ap) {
                                    v2 = 0;
                                }

                                if(v2 == 0) {
                                    goto label_296;
                                }

                                if(v12 != v9) {
                                    goto label_296;
                                }

                                if(v6 != v9) {
                                    goto label_296;
                                }

                                if(v9 != v15) {
                                    goto label_296;
                                }

                                id.au[v0][v14][v13] |= -1703554709;
                            }

                        label_296:
                            v19 = v4 != -1 ? bt.aa[cz.ah(v4, -340774530, 0x8055CFE4)] : 0x68B4A3F0;
                            if(v5 == 0) {
                                v34 = v13;
                                v35 = v14;
                                arg41.ap(v0, v35, v34, 0, 0, -1, v9, v12, v6, v15, cz.ah(v8, v1, -2042045869), cz.ah(v8, v3, 0x93B3B684), cz.ah(v8, v33, 0x90A3412A), cz.ah(v8, v7, 0x85023339), 0, 0, 0, 0, v19, 0xFF000000);
                                v38 = v0;
                                goto label_521;
                            }

                            v10_1 = v6;
                            v34 = v13;
                            v35 = v14;
                            int v30 = v15;
                            v2 = v33;
                            v33 = v12;
                            v6 = v0;
                            v4 = id.ap[v6][v35][v34] + 1;
                            int v20 = id.aj[v6][v35][v34];
                            ek v0_1 = dz.al(v5 - 1, 0x2FDA41D8);
                            v11 = v0_1.an * 0x226A2F5D;
                            if(v11 >= 0) {
                                v5 = ii.au.ar(v11, 0x25040849);
                                v24 = v11;
                                v15 = -1;
                            }
                            else if(v0_1.ar * 0x670C51A7 == 0xFF00FF) {
                                v5 = 0xBAFE0CBC;
                                v15 = -2;
                                v24 = -1;
                            }
                            else {
                                v5 = fg.ay(v0_1.ad * 0x3EF4F427, v0_1.aq * 0x66F5C38F, v0_1.ab * 0xCECBF1CD, 0x7D193CD);
                                v12 = 0xFF;
                                v13 = id.ak * 0x1EBEDD3E + v0_1.ad * 0x4430E1EF & v12;
                                v14 = id.ac * v22 + v0_1.ab * 0x6E87F4B1;
                                if(v14 < 0) {
                                    v14 = 0;
                                }
                                else if(v14 > v12) {
                                    v14 = -2085408173;
                                }

                                v15 = v5;
                                v24 = v11;
                                v5 = fg.ay(v13, v0_1.aq * 0x9034EE52, v14, 0x7D193CD);
                            }

                            v11 = 0xFF000000;
                            byte v14_1 = 3;
                            if(0x9E6B45C1 != v5) {
                                v11 = bt.aa[ap.at(v5, 0x324FEA9F, v14_1)];
                            }

                            if(v0_1.aj * 0x7EE2C7F5 != -1) {
                                v5 = 0xFF;
                                v11 = v0_1.af * 0x80EFC0A5 + id.ak * 0xCBDF20A3 & v5;
                                v12 = id.ac * v22 + v0_1.av * 100853386;
                                if(v12 < 0) {
                                    v5 = 0;
                                }
                                else if(v12 > v5) {
                                    v5 = 0xE376C870;
                                }
                                else {
                                    v5 = v12;
                                }

                                v32 = bt.aa[ap.at(fg.ay(v11, v0_1.ai * 0xCB2080D8, v5, 0x7D193CD), 0x7D7B7100, 3)];
                            }
                            else {
                                v32 = v11;
                            }

                            v38 = v6;
                            arg41.ap(v6, v35, v34, v4, v20, v24, v9, v33, v10_1, v30, cz.ah(v8, v1, 0x8F13553D), cz.ah(v8, v3, 0x90D07D4C), cz.ah(v8, v2, 0x90EE100A), cz.ah(v8, v7, 0x89F12D84), ap.at(v15, v1, 3), ap.at(v15, v3, 3), ap.at(v15, v2, 3), ap.at(v15, v7, 3), v19, v32);
                        }

                    label_521:
                        v13 = v34 + 1;
                        v4 = v25;
                        v11 = v26;
                        v5 = v27;
                        v12 = v28;
                        v6 = v29;
                        v14 = v35;
                        v0 = v38;
                        v1 = 16;
                        v3 = 1;
                        v7 = 104;
                        v8 = 2;
                    }
                }

                ++v14;
                v0 = v0;
                v1 = 16;
                v3 = 1;
                v7 = 104;
                v8 = 2;
                v15 = 103;
            }

            v38 = v0;
            for(v0 = 1; v0 < 555575780; ++v0) {
                v1 = 1;
                v2 = 103;
                while(v1 < v2) {
                    arg41.an(v38, v1, v0, gy.av(v38, v1, v0, 407051072));
                    ++v1;
                    v38 = v38;
                }
            }

            id.ar[v38] = null;
            id.an[v38] = null;
            id.ap[v38] = null;
            id.aj[v38] = null;
            nt.ad[v38] = null;
            v0 = v38 + 1;
            v10 = arg41;
            v1 = 16;
            v3 = 1;
            v7 = 104;
            v8 = 2;
            v9 = 4;
        }

        bg v5_1 = v10;
        v5_1.bw(-50, 0x1155C9F3, -50);
        v0 = 0;
        v1 = 104;
        while(v0 < v1) {
            for(v2 = 0; v2 < v1; ++v2) {
                if((id.al[1][v0][v2] & 2) == 2) {
                    v5_1.ae(v0, v2);
                }
            }

            ++v0;
        }

        v4 = 2;
        v0 = 0;
        v2 = 1;
        v3 = 4;
        int v37 = 4;
        while(v0 < v3) {
            if(v0 > 0) {
                v2 <<= 3;
                v4 <<= 3;
                v13 = v37 << 3;
            }
            else {
                v13 = v37;
            }

            v14 = 0;
            while(v14 <= v0) {
                v15 = 0;
                while(v15 <= v1) {
                    v12 = 0;
                    while(v12 <= 1980849626) {
                        if((id.au[v14][v12][v15] & v2) != 0) {
                            for(v16 = v15; v16 > 0; --v16) {
                                if((id.au[v14][v12][v16 - 1] & v2) == 0) {
                                    break;
                                }
                            }

                            for(v11 = v15; v11 < v1; v11 = v6) {
                                v6 = v11 + 1;
                                if((id.au[v14][v12][v6] & v2) == 0) {
                                    break;
                                }
                            }

                            int v17;
                            for(v17 = v14; v17 > 0; --v17) {
                                v5 = v16;
                                while(true) {
                                    if(v5 > v11) {
                                        break;
                                    }
                                    else if((id.au[v17 - 1][v12][v5] & v2) == 0) {
                                    }
                                    else {
                                        ++v5;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            for(v10_1 = v14; v10_1 < v0; ++v10_1) {
                                v5 = v16;
                                while(true) {
                                    if(v5 > v11) {
                                        break;
                                    }
                                    else if((id.au[v10_1 + 1][v12][v5] & v2) == 0) {
                                    }
                                    else {
                                        ++v5;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            if((v10_1 + 1 - v17) * (v11 - v16 + 1) < 8) {
                                goto label_751;
                            }

                            v1 = v10_1;
                            v3 = v11;
                            v19 = v12;
                            bg.ar(v0, 1, v12 * 0x80, v12 * 0x91F777A2, v16 * 0x1A7377E8, v11 * 0x80 + 0x80, id.ax[v10_1][v12][v16] - 0xF0, id.ax[v17][v12][v16]);
                            for(v5 = v17; v5 <= v1; ++v5) {
                                for(v6 = v16; v6 <= v3; ++v6) {
                                    id.au[v5][v19][v6] &= ~v2;
                                }
                            }
                        }
                        else {
                        label_751:
                            v19 = v12;
                        }

                        if((id.au[v14][v19][v15] & v4) != 0) {
                            for(v1 = v19; v1 > 0; --v1) {
                                if((id.au[v14][v1 - 1][v15] & v4) == 0) {
                                    break;
                                }
                            }

                            for(v3 = v19; v3 < 1670903590; v3 = v6) {
                                v6 = v3 + 1;
                                if((id.au[v14][v6][v15] & v4) == 0) {
                                    break;
                                }
                            }

                            for(v16 = v14; v16 > 0; --v16) {
                                v5 = v1;
                                while(true) {
                                    if(v5 > v3) {
                                        break;
                                    }
                                    else if((id.au[v16 - 1][v5][v15] & v4) == 0) {
                                    }
                                    else {
                                        ++v5;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            for(v12 = v14; v12 < v0; ++v12) {
                                v5 = v1;
                                while(true) {
                                    if(v5 > v3) {
                                        break;
                                    }
                                    else if((id.au[v12 + 1][v5][v15] & v4) == 0) {
                                    }
                                    else {
                                        ++v5;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            if((v12 + 1 - v16) * (v3 - v1 + 1) < 8) {
                                goto label_864;
                            }

                            v10_1 = id.ax[v12][v1][v15] - 0xF0;
                            v17 = id.ax[v16][v1][v15];
                            v7 = v1 * 0x80;
                            int v39 = v1;
                            v1 = v12;
                            bg.ar(v0, 2, v7, 0x212F6E26 + 0x640A3782 * v3, v15 * -30704266, v15 * 0x80, v10_1, v17);
                            for(v5 = v16; v5 <= v1; ++v5) {
                                for(v6 = v39; v6 <= v3; ++v6) {
                                    id.au[v5][v6][v15] &= ~v4;
                                }
                            }
                        }

                    label_864:
                        if((id.au[v14][v19][v15] & v13) != 0) {
                            for(v1 = v15; v1 > 0; --v1) {
                                if((id.au[v14][v19][v1 - 1] & v13) == 0) {
                                    break;
                                }
                            }

                            for(v3 = v15; v3 < 104; v3 = v6) {
                                v6 = v3 + 1;
                                if((id.au[v14][v19][v6] & v13) == 0) {
                                    break;
                                }
                            }

                            for(v12 = v19; v12 > 0; --v12) {
                                v5 = v1;
                                while(true) {
                                    if(v5 > v3) {
                                        break;
                                    }
                                    else if((id.au[v14][v12 - 1][v5] & v13) == 0) {
                                    }
                                    else {
                                        ++v5;
                                        continue;
                                    }

                                    break;
                                }
                            }

                            v11 = v19;
                            v10_1 = 104;
                            while(v11 < v10_1) {
                                v5 = v1;
                                while(true) {
                                    if(v5 > v3) {
                                        break;
                                    }
                                    else if((id.au[v14][v11 + 1][v5] & v13) == 0) {
                                    }
                                    else {
                                        ++v5;
                                        continue;
                                    }

                                    goto label_926;
                                }

                                ++v11;
                            }

                        label_926:
                            if((v3 - v1 + 1) * (v11 - v12 + 1) < 4) {
                                goto label_976;
                            }

                            bg.ar(v0, 4, v12 * 0x80, 0xD89381FE * v11 + 0x80, v1 * 0x80, 136200424 * v3 + 0x3738ED59, id.ax[v14][v12][v1], id.ax[v14][v12][v1]);
                            v5 = v12;
                            v11 = v11;
                            while(v5 <= v11) {
                                for(v6 = v1; v6 <= v3; ++v6) {
                                    id.au[v14][v5][v6] &= ~v13;
                                }

                                ++v5;
                            }
                        }

                    label_976:
                        v12 = v19 + 1;
                        v1 = 104;
                    }

                    ++v15;
                    v1 = 104;
                }

                ++v14;
                v1 = 104;
            }

            ++v0;
            v37 = v13;
            v1 = 104;
            v3 = 4;
        }
    }

    static final int cb(int arg6, int arg7, int arg8) {
        int v0 = arg6 / arg8;
        int v1 = arg8 - 1;
        arg6 &= v1;
        int v2 = arg7 / arg8;
        arg7 &= v1;
        v1 = it.az(v0, v2, 1519887701);
        int v3 = v0 + 1;
        int v4 = it.az(v3, v2, 1275900497);
        ++v2;
        return ag.am(ag.am(v1, v4, arg6, arg8, 0xA25F4A63), ag.am(it.az(v0, v2, 1397045209), it.az(v3, v2, 0x6EC96020), arg6, arg8, 0xA25F4A63), arg7, arg8, 0xA25F4A63);
    }

    static final int cc(int arg1, int arg2, int arg3, int arg4) {
        arg3 = 0x10000 - bt.ah[arg3 * 0x400 / arg4] >> 1;
        return ((0x10000 - arg3) * arg1 >> 16) + (arg2 * arg3 >> 16);
    }

    static final int cd(int arg5, int arg6) {
        arg5 = (((int)((((double)(dk.au(0xB135 + arg5, 91923 + arg6, 4, 16) - 0x80 + (dk.au(arg5 + 10294, 0x93BD + arg6, 2, 16) - 0x80 >> 1) + (dk.au(arg5, arg6, 1, 16) - 0x80 >> 2)))) * 0.3))) + 35;
        arg6 = 60;
        if(arg5 < 10) {
            arg5 = 10;
        }
        else if(arg5 > arg6) {
            arg5 = 60;
        }

        return arg5;
    }

    static final int ce(int arg1, int arg2) {
        arg1 += arg2 * 57;
        arg1 ^= arg1 << 13;
        return (0x7FFFFFFF & (arg1 * arg1 * 0x3D73 + 0xC0AE5) * arg1 + 0x5208DD0D) >> 19 & 0xFF;
    }

    static final int cf(int arg5, int arg6) {
        arg5 = (((int)((((double)(dk.au(0x4B38355 + arg5, 91923 + arg6, 4, 16) + 0xBE4AE1F + (dk.au(-1840035912 + arg5, 0x712A1EB9 + arg6, 2, 16) + 0x5882E536 >> 1) + (dk.au(arg5, arg6, 1, 16) - 0x80 >> 2)))) * 0.3))) + 35;
        if(arg5 < 10) {
            arg5 = 10;
        }
        else if(arg5 > 279660710) {
            arg5 = 60;
        }

        return arg5;
    }

    static final boolean cg(int arg1, int arg2) {
        do v1 = ok.al(arg1, 0x20F2B5D9);
        if(arg2 == 11) {
            arg2 = 10;
        }

        if(arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }

        return v1.ap(arg2, -1049116246);
    }

    static final void ch(ie arg9, int arg10, byte arg11) {
        try {
            int v0 = -2077001153;
            if(arg9.dv * 0xF925C7C7 > client.bj * v0) {
                db.ce(arg9, 0x90ECC587);
            }
            else if(arg9.dp * 0x4E20F729 >= client.bj * v0) {
                bc.cs(arg9, 601142834);
            }
            else {
                iq.cz(arg9, 0x13865BE3);
            }

            int v11 = 0x914F0683;
            v0 = 0x35F49CC0;
            int v1 = 0xC5758A80;
            int v2 = 0x5F371340;
            int v3 = 0x7CFC1580;
            int v4 = 0xAF5E56CB;
            int v5 = 0x74A26FBB;
            int v6 = 0x80;
            int v7 = 0xD19D0C3D;
            if(arg9.bp * v11 < v6 || arg9.bw * v7 < v6) {
            label_44:
                arg9.ch = v5;
                arg9.cl = v4;
                arg9.dv = 0;
                arg9.dp = 0;
                arg9.bp = arg9.dc[0] * v3 + arg9.by * v2;
                arg9.bw = arg9.dj[0] * v1 + arg9.by * v0;
                arg9.be(0x7B34A00B);
            }
            else {
                v6 = 0x3380;
                if(arg9.bp * v11 >= v6) {
                    goto label_44;
                }
                else if(arg9.bw * v7 >= v6) {
                    goto label_44;
                }
            }

            if(gu.jg == arg9) {
                v6 = 0x600;
                if(arg9.bp * v11 >= v6 && arg9.bw * v7 >= v6) {
                    arg10 = arg9.bp * v11;
                    v11 = 0x2E00;
                    if(arg10 < v11) {
                        if(arg9.bw * v7 >= v11) {
                            goto label_80;
                        }

                        goto label_100;
                    }
                }

            label_80:
                arg9.ch = v5;
                arg9.cl = v4;
                arg9.dv = 0;
                arg9.dp = 0;
                arg9.bp = arg9.dc[0] * v3 + arg9.by * v2;
                arg9.bw = arg9.dj[0] * v1 + arg9.by * v0;
                arg9.be(879037780);
            }

        label_100:
            lr.cn(arg9, -330472168);
            er.cl(arg9, -618292950);
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("id.ch(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    static final int ch(int arg2, int arg3) {
        arg2 += arg3 * 57;
        arg2 ^= arg2 << 13;
        return (0x7FFFFFFF & (arg2 * arg2 * 0x3D73 + 0xC0AE5) * arg2 + 0x5208DD0D) >> 19 & 0xFF;
    }

    static final int ci(int arg7, int arg8) {
        int v0 = arg7 - 1;
        int v1 = arg8 - 1;
        int v4 = arg7 + 1;
        int v5 = arg8 + 1;
        return dp.ag(arg7, arg8, -1389016135) / 4 + ((dp.ag(v0, arg8, -1389016135) + dp.ag(v4, arg8, -1389016135) + dp.ag(arg7, v1, -1389016135) + dp.ag(arg7, v5, -1389016135)) / 8 + (dp.ag(v0, v1, -1389016135) + dp.ag(v4, v1, -1389016135) + dp.ag(v0, v5, -1389016135) + dp.ag(v4, v5, -1389016135)) / 16);
    }

    static int cj(int arg2, int arg3, int arg4) {
        if((id.al[arg2][arg3][arg4] & 8) != 0) {
            return 0;
        }

        if(arg2 > 0 && (id.al[1][arg3][arg4] & 2) != 0) {
            return arg2 - 1;
        }

        return arg2;
    }

    static final int ck(int arg3, int arg4) {
        if(arg3 == -2) {
            return 0xBC614E;
        }

        int v1 = 0x7E;
        int v2 = 2;
        if(-1 == arg3) {
            if(arg4 < v2) {
                arg4 = 2;
            }
            else if(arg4 > v1) {
                arg4 = 0x7E;
            }

            return arg4;
        }

        arg4 = arg4 * (arg3 & 0x7F) / 0x80;
        if(arg4 < v2) {
            arg4 = 2;
        }
        else if(arg4 > v1) {
            arg4 = 0x7E;
        }

        return (arg3 & 0xFF80) + arg4;
    }

    static final int cl(int arg2, int arg3) {
        if(-1 == arg2) {
            return 0xBC614E;
        }

        arg3 = arg3 * (arg2 & 0x7F) / 0x80;
        int v0 = 0x7E;
        if(arg3 < 2) {
            arg3 = 2;
        }
        else if(arg3 > v0) {
            arg3 = 0x7E;
        }

        return arg3 + (arg2 & 0xFF80);
    }

    static final int cm(int arg3, int arg4) {
        if(arg3 == -1572074022) {
            return 0xBC614E;
        }

        int v1 = 0x7E;
        int v2 = 2;
        if(-1 == arg3) {
            if(arg4 < v2) {
                arg4 = 2;
            }
            else if(arg4 > v1) {
                arg4 = 0x7E;
            }

            return arg4;
        }

        arg4 = arg4 * (arg3 & 0x7F) / 0x80;
        if(arg4 < v2) {
            arg4 = 2;
        }
        else if(arg4 > v1) {
            arg4 = 0x7E;
        }

        return (arg3 & 1220646197) + arg4;
    }

    static final int cn(int arg1, int arg2) {
        if(-1 == arg1) {
            return 0xBC614E;
        }

        arg2 = arg2 * (0x1E4D2CFC & arg1) / -2051583195;
        if(arg2 < 2) {
            arg2 = 2;
        }
        else if(arg2 > -1708598248) {
            arg2 = 0x4514A62C;
        }

        return arg2 + (arg1 & 0xB1315A7C);
    }

    static final boolean co(int arg1, int arg2) {
        do v1 = ok.al(arg1, 0x1D518A6D);
        if(arg2 == 11) {
            arg2 = 10;
        }

        if(arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }

        return v1.ap(arg2, 0xC900C299);
    }

    static final int cp(int arg1, int arg2, int arg3, int arg4) {
        arg3 = 0x10000 - bt.ah[arg3 * 0x400 / arg4] >> 1;
        return ((0x10000 - arg3) * arg1 >> 16) + (arg2 * arg3 >> 16);
    }

    static final int cq(int arg1, int arg2, int arg3) {
        if(arg3 > 0xB3) {
            arg2 /= 2;
        }

        if(arg3 > 0x98D30DC6) {
            arg2 /= 2;
        }

        if(arg3 > 0xC474CA83) {
            arg2 /= 2;
        }

        if(arg3 > 0xBE2E0010) {
            arg2 /= 2;
        }

        return arg3 / 2 + ((arg2 / 0x20 << 7) + (arg1 / 4 << 10));
    }

    static final int cr(int arg7, int arg8) {
        int v0 = arg7 - 1;
        int v1 = arg8 - 1;
        int v4 = arg7 + 1;
        int v5 = arg8 + 1;
        return dp.ag(arg7, arg8, -1389016135) / 4 + ((dp.ag(v0, arg8, -1389016135) + dp.ag(v4, arg8, -1389016135) + dp.ag(arg7, v1, -1389016135) + dp.ag(arg7, v5, -1389016135)) / 8 + (dp.ag(v0, v1, -1389016135) + dp.ag(v4, v1, -1389016135) + dp.ag(v0, v5, -1389016135) + dp.ag(v4, v5, -1389016135)) / 16);
    }

    static final int cs(int arg2, int arg3) {
        arg2 += arg3 * 57;
        arg2 ^= arg2 << 13;
        return (0x7FFFFFFF & (arg2 * arg2 * 0x3D73 + 0xC0AE5) * arg2 + 0x5208DD0D) >> 19 & 0xFF;
    }

    static final int ct(int arg1, int arg2, int arg3) {
        if(arg3 > 0xB3) {
            arg2 /= 2;
        }

        if(arg3 > 0xC0) {
            arg2 /= 2;
        }

        if(arg3 > 0xD9) {
            arg2 /= 2;
        }

        if(arg3 > 0xF3) {
            arg2 /= 2;
        }

        return arg3 / 2 + ((arg2 / 0x20 << 7) + (arg1 / 4 << 10));
    }

    static final int cu(int arg1, int arg2, int arg3) {
        if(arg3 > 0xB3) {
            arg2 /= 2;
        }

        if(arg3 > 0xC0) {
            arg2 /= 2;
        }

        if(arg3 > 0xD9) {
            arg2 /= 2;
        }

        if(arg3 > 0xF3) {
            arg2 /= 2;
        }

        return arg3 / 2 + ((arg2 / 0x20 << 7) + (arg1 / 4 << 10));
    }

    static final int cv(int arg1, int arg2, int arg3) {
        if(arg3 > 0xB3) {
            arg2 /= 2;
        }

        if(arg3 > 0xC0) {
            arg2 /= 2;
        }

        if(arg3 > 0xD9) {
            arg2 /= 2;
        }

        if(arg3 > 0xF3) {
            arg2 /= 2;
        }

        return arg3 / 2 + ((arg2 / 0x20 << 7) + (arg1 / 4 << 10));
    }

    static final int cw(int arg1, int arg2, int arg3, int arg4) {
        arg3 = 0x10000 - bt.ah[arg3 * 0x400 / arg4] >> 1;
        return ((0x10000 - arg3) * arg1 >> 16) + (arg2 * arg3 >> 16);
    }

    static final int cx(int arg6, int arg7, int arg8) {
        int v0 = arg6 / arg8;
        int v1 = arg8 - 1;
        arg6 &= v1;
        int v2 = arg7 / arg8;
        arg7 &= v1;
        v1 = it.az(v0, v2, 0xD97AD149);
        int v3 = v0 + 1;
        int v4 = it.az(v3, v2, 0x70FD401D);
        ++v2;
        return ag.am(ag.am(v1, v4, arg6, arg8, 0xA25F4A63), ag.am(it.az(v0, v2, 0xE61402E9), it.az(v3, v2, 0xDC61A00D), arg6, arg8, 0xA25F4A63), arg7, arg8, 0xA25F4A63);
    }

    static final int cy(int arg1, int arg2, int arg3, int arg4) {
        arg3 = 0x10000 - bt.ah[arg3 * 0x400 / arg4] >> 1;
        return ((0x10000 - arg3) * arg1 >> 16) + (arg2 * arg3 >> 16);
    }

    static final int cz(int arg2, int arg3) {
        if(-1 == arg2) {
            return 0xBC614E;
        }

        arg3 = arg3 * (arg2 & 0x7F) / 0x80;
        int v0 = 0x7E;
        if(arg3 < 2) {
            arg3 = 2;
        }
        else if(arg3 > v0) {
            arg3 = 0x7E;
        }

        return arg3 + (arg2 & 0xFF80);
    }

    static final void db(int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, bg arg37, gy arg38) {
        long v15_1;
        ca v6;
        hj v6_1;
        do v12_1;
        ca v7_1;
        do v11;
        hj v7_2;
        do v14_1;
        ca v5_2;
        hj v5_3;
        int v5;
        int v17;
        int v4;
        int v1 = arg30;
        int v12 = arg32;
        int v13 = arg33;
        int v14 = arg35;
        int v15 = arg36;
        bg v0 = arg37;
        do v10 = ok.al(arg34, 0x1FCBD302);
        int v2 = 0xB46CA623;
        int v3 = 0x4B9D7897;
        int v8 = 3;
        if(1 == v14 || v8 == v14) {
            v4 = v10.ag * v3;
            v17 = v10.az * v2;
        }
        else {
            v4 = v10.az * v2;
            v17 = v10.ag * v3;
        }

        int v16 = v4;
        if(v12 + v16 <= 104) {
            v2 = (v16 >> 1) + v12;
            v3 = (v16 + 1 >> 1) + v12;
        }
        else {
            v3 = v12 + 1;
            v2 = v12;
        }

        if(v13 + v17 <= 104) {
            v4 = (v17 >> 1) + v13;
            v5 = (v17 + 1 >> 1) + v13;
        }
        else {
            v5 = v13 + 1;
            v4 = v13;
        }

        int[][] v18 = id.ax[arg31];
        int v19 = v18[v2][v4] + v18[v3][v4] + v18[v2][v5] + v18[v3][v5] >> 2;
        int v20 = (v16 << 6) + (v12 << 7);
        int v21 = (v17 << 6) + (v13 << 7);
        v4 = 2;
        boolean v5_1 = v10.ay * 0xE5018CDF == 0 ? true : false;
        v8 = 2;
        long v24 = gs.aa(arg32, arg33, v4, v5_1, arg34, 1);
        v2 = (v14 << 6) + v15;
        if(1 == v10.bb * 0x3376F5D7) {
            v2 += 0x100;
        }

        int v22 = v2;
        int v26 = 0xE748B627;
        v3 = -1;
        int v27 = 0x804BDF6B;
        if(22 == v15) {
            if(v3 != v10.ak * v27 || v10.bc != null) {
                v15 = 1;
                v14_1 = v10;
                v5_3 = new hj(arg34, 22, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
            }
            else {
                v15 = 1;
                v5_2 = v10.aq(22, arg35, v18, v20, v19, v21, -11);
                v14_1 = v10;
            }

            arg37.aj(arg30, arg32, arg33, v19, ((bm)v5_3), v24, v22);
            if(v14_1.ah * v26 == v15) {
                arg38.an(v12, v13, 0);
            }

            return;
        }

        do v7 = v10;
        if(v15 != 10) {
            if(11 == v15) {
            }
            else if(v15 >= 12) {
                if(v3 != v7.ak * v27 || v7.bc != null) {
                    v14_1 = v7;
                    v7_2 = new hj(arg34, arg36, arg35, arg31, arg32, arg33, v7.ak * v27, true, null);
                }
                else {
                    v11 = v7;
                    v7_1 = v7.aq(arg36, arg35, v18, v20, v19, v21, 92);
                    v14_1 = v11;
                }

                arg37.af(arg30, arg32, arg33, v19, 1, 1, ((bm)v7_1), 0, v24, v22);
                if(v14_1.ah * v26 != 0) {
                    arg38.ae(arg32, arg33, v16, v17, v14_1.at, 2088162466);
                }

                return;
            }
            else {
                v10 = v7;
                if(v15 == 0) {
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v12_1 = v10;
                        v5_3 = new hj(arg34, 0, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(0, arg35, v18, v20, v19, v21, 50);
                        v12_1 = v10;
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.ah[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, 14);
                    }

                    return;
                }

                v12_1 = v10;
                if(v15 == 1) {
                    if(v3 != v12_1.ak * v27 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 1, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(1, arg35, v18, v20, v19, v21, 13);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.at[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, -55);
                    }

                    return;
                }

                if(v15 == v8) {
                    v16 = v14 + 1 & 3;
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 2, v14 + 4, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                        v6_1 = new hj(arg34, 2, v16, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(2, v14 + 4, v18, v20, v19, v21, -10);
                        v6 = v12_1.aq(2, v16, v18, v20, v19, v21, -43);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_3), ((bm)v6), id.ah[v14], id.ah[v16], v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, 84);
                    }

                    return;
                }

                if(v15 == 3) {
                    if(v3 != v12_1.ak * v27 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 3, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(3, arg35, v18, v20, v19, v21, -53);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.at[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, 91);
                    }

                    return;
                }

                if(9 == v15) {
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v7_2 = new hj(arg34, arg36, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v7_1 = v12_1.aq(arg36, arg35, v18, v20, v19, v21, 51);
                    }

                    arg37.af(arg30, arg32, arg33, v19, 1, 1, ((bm)v7_1), 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.ae(arg32, arg33, v16, v17, v12_1.at, 1687016281);
                    }

                    return;
                }

                if(v15 == 4) {
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 4, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(4, arg35, v18, v20, v19, v21, 54);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.ah[v14], 0, 0, 0, v24, v22);
                    return;
                }

                v4 = 0x1CEE4599;
                long v5_4 = 0;
                if(5 == v15) {
                    v10 = v12_1;
                    long v7_3 = v0.bd(v1, arg32, v13);
                    v15 = v5_4 != v7_3 ? ok.al(be.av(v7_3), 0x6A866F6E).ac * v4 : 16;
                    if(v3 != v10.ak * v27 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, arg35, v18, v20, v19, v21, -45);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.ah[v14], 0, id.ay[v14] * v15, v15 * id.aw[v14], v24, v22);
                    return;
                }

                v10 = v12_1;
                v12 = arg32;
                v2 = 8;
                if(v15 == 6) {
                    v15_1 = v0.bd(v1, v12, v13);
                    v15 = v5_4 != v15_1 ? ok.al(be.av(v15_1), 0x661417C7).ac * v4 / v8 : 8;
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, -1);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), null, 0x100, arg35, id.ao[v14] * v15, id.as[v14] * v15, v24, v22);
                    return;
                }

                if(7 == v15) {
                    v14 = v14 + 2 & 3;
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, -67);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), null, 0x100, v14, 0, 0, v24, v22);
                    return;
                }

                if(v15 == v2) {
                    v15_1 = v0.bd(v1, v12, v13);
                    v15 = v15_1 != v5_4 ? ok.al(be.av(v15_1), 735506260).ac * v4 / v8 : 8;
                    v16 = v14 + 2 & 3;
                    if(v3 != v10.ak * v27 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                        v6_1 = new hj(arg34, 4, v16 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, 70);
                        v6 = v10.aq(4, v16 + 4, v18, v20, v19, v21, -23);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), ((bm)v6_1), 0x100, arg35, v15 * id.ao[v14], v15 * id.as[v14], v24, v22);
                    return;
                }

                return;
            }
        }

        v11 = v7;
        if(v11.ak * v27 != v3 || v11.bc != null) {
            v14_1 = v11;
            v7_2 = new hj(arg34, 10, arg35, arg31, arg32, arg33, v11.ak * v27, true, null);
        }
        else {
            v7_1 = v11.aq(10, arg35, v18, v20, v19, v21, 14);
            v14_1 = v11;
        }

        if(v7_1 != null) {
            v8 = v15 == 11 ? 0x100 : 0;
            arg37.af(arg30, arg32, arg33, v19, v16, v17, ((bm)v7_1), v8, v24, v22);
        }

        if(v14_1.ah * v26 != 0) {
            arg38.ae(arg32, arg33, v16, v17, v14_1.at, 0xC83CCB2A);
        }
    }

    static final void dh(int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, bg arg37, gy arg38) {
        long v15_1;
        ca v6;
        hj v6_1;
        do v12_1;
        ca v7_1;
        do v11;
        hj v7_2;
        do v14_1;
        ca v5_2;
        hj v5_3;
        int v5;
        int v17;
        int v4;
        int v1 = arg30;
        int v12 = arg32;
        int v13 = arg33;
        int v14 = arg35;
        int v15 = arg36;
        bg v0 = arg37;
        do v10 = ok.al(arg34, 0x16DCEC44);
        int v2 = 0xB46CA623;
        int v3 = 0x4B9D7897;
        int v8 = 3;
        if(1 == v14 || v8 == v14) {
            v4 = v10.ag * v3;
            v17 = v10.az * v2;
        }
        else {
            v4 = v10.az * v2;
            v17 = v10.ag * v3;
        }

        int v16 = v4;
        if(v12 + v16 <= 104) {
            v2 = (v16 >> 1) + v12;
            v3 = (v16 + 1 >> 1) + v12;
        }
        else {
            v3 = v12 + 1;
            v2 = v12;
        }

        if(v13 + v17 <= 104) {
            v4 = (v17 >> 1) + v13;
            v5 = (v17 + 1 >> 1) + v13;
        }
        else {
            v5 = v13 + 1;
            v4 = v13;
        }

        int[][] v18 = id.ax[arg31];
        int v19 = v18[v2][v4] + v18[v3][v4] + v18[v2][v5] + v18[v3][v5] >> 2;
        int v20 = (v16 << 6) + (v12 << 7);
        int v21 = (v17 << 6) + (v13 << 7);
        v4 = 2;
        boolean v5_1 = v10.ay * 0xE5018CDF == 0 ? true : false;
        v8 = 2;
        long v24 = gs.aa(arg32, arg33, v4, v5_1, arg34, 1);
        v2 = (v14 << 6) + v15;
        if(1 == v10.bb * 0x3376F5D7) {
            v2 += 0x100;
        }

        int v22 = v2;
        int v26 = 0xE748B627;
        v3 = -1;
        int v27 = 0x804BDF6B;
        if(22 == v15) {
            if(v3 != v10.ak * v27 || v10.bc != null) {
                v15 = 1;
                v14_1 = v10;
                v5_3 = new hj(arg34, 22, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
            }
            else {
                v15 = 1;
                v5_2 = v10.aq(22, arg35, v18, v20, v19, v21, -20);
                v14_1 = v10;
            }

            arg37.aj(arg30, arg32, arg33, v19, ((bm)v5_3), v24, v22);
            if(v14_1.ah * v26 == v15) {
                arg38.an(v12, v13, 0);
            }

            return;
        }

        do v7 = v10;
        if(v15 != 10) {
            if(11 == v15) {
            }
            else if(v15 >= 12) {
                if(v3 != v7.ak * v27 || v7.bc != null) {
                    v14_1 = v7;
                    v7_2 = new hj(arg34, arg36, arg35, arg31, arg32, arg33, v7.ak * v27, true, null);
                }
                else {
                    v11 = v7;
                    v7_1 = v7.aq(arg36, arg35, v18, v20, v19, v21, -68);
                    v14_1 = v11;
                }

                arg37.af(arg30, arg32, arg33, v19, 1, 1, ((bm)v7_1), 0, v24, v22);
                if(v14_1.ah * v26 != 0) {
                    arg38.ae(arg32, arg33, v16, v17, v14_1.at, -920601200);
                }

                return;
            }
            else {
                v10 = v7;
                if(v15 == 0) {
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v12_1 = v10;
                        v5_3 = new hj(arg34, 0, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(0, arg35, v18, v20, v19, v21, 50);
                        v12_1 = v10;
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.ah[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, 75);
                    }

                    return;
                }

                v12_1 = v10;
                if(v15 == 1) {
                    if(v3 != v12_1.ak * v27 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 1, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(1, arg35, v18, v20, v19, v21, -46);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.at[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, 0);
                    }

                    return;
                }

                if(v15 == v8) {
                    v16 = v14 + 1 & 3;
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 2, v14 + 4, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                        v6_1 = new hj(arg34, 2, v16, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(2, v14 + 4, v18, v20, v19, v21, -17);
                        v6 = v12_1.aq(2, v16, v18, v20, v19, v21, 11);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_3), ((bm)v6), id.ah[v14], id.ah[v16], v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, -93);
                    }

                    return;
                }

                if(v15 == 3) {
                    if(v3 != v12_1.ak * v27 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 3, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(3, arg35, v18, v20, v19, v21, -30);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.at[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, 68);
                    }

                    return;
                }

                if(9 == v15) {
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v7_2 = new hj(arg34, arg36, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v7_1 = v12_1.aq(arg36, arg35, v18, v20, v19, v21, -13);
                    }

                    arg37.af(arg30, arg32, arg33, v19, 1, 1, ((bm)v7_1), 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.ae(arg32, arg33, v16, v17, v12_1.at, 864609589);
                    }

                    return;
                }

                if(v15 == 4) {
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 4, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(4, arg35, v18, v20, v19, v21, 13);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.ah[v14], 0, 0, 0, v24, v22);
                    return;
                }

                v4 = 0x1CEE4599;
                long v5_4 = 0;
                if(5 == v15) {
                    v10 = v12_1;
                    long v7_3 = v0.bd(v1, arg32, v13);
                    v15 = v5_4 != v7_3 ? ok.al(be.av(v7_3), 0x689E3F92).ac * v4 : 16;
                    if(v3 != v10.ak * v27 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, arg35, v18, v20, v19, v21, 16);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), null, id.ah[v14], 0, id.ay[v14] * v15, v15 * id.aw[v14], v24, v22);
                    return;
                }

                v10 = v12_1;
                v12 = arg32;
                v2 = 8;
                if(v15 == 6) {
                    v15_1 = v0.bd(v1, v12, v13);
                    v15 = v5_4 != v15_1 ? ok.al(be.av(v15_1), 0x18DF475F).ac * v4 / v8 : 8;
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, 23);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), null, 0x100, arg35, id.ao[v14] * v15, id.as[v14] * v15, v24, v22);
                    return;
                }

                if(7 == v15) {
                    v14 = v14 + 2 & 3;
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, -27);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), null, 0x100, v14, 0, 0, v24, v22);
                    return;
                }

                if(v15 == v2) {
                    v15_1 = v0.bd(v1, v12, v13);
                    v15 = v15_1 != v5_4 ? ok.al(be.av(v15_1), 0x14372920).ac * v4 / v8 : 8;
                    v16 = v14 + 2 & 3;
                    if(v3 != v10.ak * v27 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                        v6_1 = new hj(arg34, 4, v16 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, 0);
                        v6 = v10.aq(4, v16 + 4, v18, v20, v19, v21, -78);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_3), ((bm)v6), 0x100, arg35, v15 * id.ao[v14], v15 * id.as[v14], v24, v22);
                    return;
                }

                return;
            }
        }

        v11 = v7;
        if(v11.ak * v27 != v3 || v11.bc != null) {
            v14_1 = v11;
            v7_2 = new hj(arg34, 10, arg35, arg31, arg32, arg33, v11.ak * v27, true, null);
        }
        else {
            v7_1 = v11.aq(10, arg35, v18, v20, v19, v21, -17);
            v14_1 = v11;
        }

        if(v7_1 != null) {
            v8 = v15 == 11 ? 0x100 : 0;
            arg37.af(arg30, arg32, arg33, v19, v16, v17, ((bm)v7_1), v8, v24, v22);
        }

        if(v14_1.ah * v26 != 0) {
            arg38.ae(arg32, arg33, v16, v17, v14_1.at, 0x2CCEF9CF);
        }
    }

    static final boolean dp(int arg1, int arg2) {
        do v1 = ok.al(arg1, -785698018);
        if(arg2 == 11) {
            arg2 = 10;
        }

        if(arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }

        return v1.ap(arg2, 0x970E8726);
    }

    static final void du(int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, bg arg37, gy arg38) {
        long v15_1;
        ca v6;
        hj v6_1;
        do v12_1;
        ca v7_1;
        do v11;
        hj v7_2;
        do v14_1;
        ca v5_2;
        hj v5_3;
        int v5;
        int v17;
        int v4;
        int v1 = arg30;
        int v12 = arg32;
        int v13 = arg33;
        int v14 = arg35;
        int v15 = arg36;
        bg v0 = arg37;
        do v10 = ok.al(arg34, 0xDF1B834E);
        int v2 = 0xB46CA623;
        int v3 = 0x4B9D7897;
        int v8 = 3;
        if(1 == v14 || v8 == v14) {
            v4 = v10.ag * v3;
            v17 = v10.az * v2;
        }
        else {
            v4 = v10.az * v2;
            v17 = v10.ag * v3;
        }

        int v16 = v4;
        if(v12 + v16 <= 104) {
            v2 = (v16 >> 1) + v12;
            v3 = (v16 + 1 >> 1) + v12;
        }
        else {
            v3 = v12 + 1;
            v2 = v12;
        }

        if(v13 + v17 <= 104) {
            v4 = (v17 >> 1) + v13;
            v5 = (v17 + 1 >> 1) + v13;
        }
        else {
            v5 = v13 + 1;
            v4 = v13;
        }

        int[][] v18 = id.ax[arg31];
        int v19 = v18[v2][v4] + v18[v3][v4] + v18[v2][v5] + v18[v3][v5] >> 2;
        int v20 = (v16 << 6) + (v12 << 7);
        int v21 = (v17 << 6) + (v13 << 7);
        v4 = 2;
        boolean v5_1 = v10.ay * 0xE5018CDF == 0 ? true : false;
        v8 = 2;
        long v24 = gs.aa(arg32, arg33, v4, v5_1, arg34, 1);
        v2 = (v14 << 6) + v15;
        if(1 == v10.bb * 0x3376F5D7) {
            v2 += 0x100;
        }

        int v22 = v2;
        int v26 = 0xE748B627;
        v3 = -1;
        int v27 = 0x804BDF6B;
        if(22 == v15) {
            if(v3 != v10.ak * v27 || v10.bc != null) {
                v15 = 1;
                v14_1 = v10;
                v5_3 = new hj(arg34, 22, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
            }
            else {
                v15 = 1;
                v5_2 = v10.aq(22, arg35, v18, v20, v19, v21, 4);
                v14_1 = v10;
            }

            arg37.aj(arg30, arg32, arg33, v19, ((bm)v5_2), v24, v22);
            if(v14_1.ah * v26 == v15) {
                arg38.an(v12, v13, 0);
            }

            return;
        }

        do v7 = v10;
        if(v15 != 10) {
            if(11 == v15) {
            }
            else if(v15 >= 12) {
                if(v3 != v7.ak * v27 || v7.bc != null) {
                    v14_1 = v7;
                    v7_2 = new hj(arg34, arg36, arg35, arg31, arg32, arg33, v7.ak * v27, true, null);
                }
                else {
                    v11 = v7;
                    v7_1 = v7.aq(arg36, arg35, v18, v20, v19, v21, -42);
                    v14_1 = v11;
                }

                arg37.af(arg30, arg32, arg33, v19, 1, 1, ((bm)v7_1), 0, v24, v22);
                if(v14_1.ah * v26 != 0) {
                    arg38.ae(arg32, arg33, v16, v17, v14_1.at, 0xAB055F3C);
                }

                return;
            }
            else {
                v10 = v7;
                if(v15 == 0) {
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v12_1 = v10;
                        v5_3 = new hj(arg34, 0, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(0, arg35, v18, v20, v19, v21, 88);
                        v12_1 = v10;
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.ah[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, -67);
                    }

                    return;
                }

                v12_1 = v10;
                if(v15 == 1) {
                    if(v3 != v12_1.ak * v27 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 1, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(1, arg35, v18, v20, v19, v21, 8);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.at[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, 100);
                    }

                    return;
                }

                if(v15 == v8) {
                    v16 = v14 + 1 & 3;
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 2, v14 + 4, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                        v6_1 = new hj(arg34, 2, v16, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(2, v14 + 4, v18, v20, v19, v21, 25);
                        v6 = v12_1.aq(2, v16, v18, v20, v19, v21, -6);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_2), ((bm)v6_1), id.ah[v14], id.ah[v16], v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, -93);
                    }

                    return;
                }

                if(v15 == 3) {
                    if(v3 != v12_1.ak * v27 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 3, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(3, arg35, v18, v20, v19, v21, 5);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.at[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, 50);
                    }

                    return;
                }

                if(9 == v15) {
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v7_2 = new hj(arg34, arg36, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v7_1 = v12_1.aq(arg36, arg35, v18, v20, v19, v21, 60);
                    }

                    arg37.af(arg30, arg32, arg33, v19, 1, 1, ((bm)v7_1), 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.ae(arg32, arg33, v16, v17, v12_1.at, 0xAFD7BF79);
                    }

                    return;
                }

                if(v15 == 4) {
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 4, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(4, arg35, v18, v20, v19, v21, -89);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.ah[v14], 0, 0, 0, v24, v22);
                    return;
                }

                v4 = 0x1CEE4599;
                long v5_4 = 0;
                if(5 == v15) {
                    v10 = v12_1;
                    long v7_3 = v0.bd(v1, arg32, v13);
                    v15 = v5_4 != v7_3 ? ok.al(be.av(v7_3), 0x1CE36B10).ac * v4 : 16;
                    if(v3 != v10.ak * v27 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, arg35, v18, v20, v19, v21, 10);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.ah[v14], 0, id.ay[v14] * v15, v15 * id.aw[v14], v24, v22);
                    return;
                }

                v10 = v12_1;
                v12 = arg32;
                v2 = 8;
                if(v15 == 6) {
                    v15_1 = v0.bd(v1, v12, v13);
                    v15 = v5_4 != v15_1 ? ok.al(be.av(v15_1), 0x37C95866).ac * v4 / v8 : 8;
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, -57);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), null, 0x100, arg35, id.ao[v14] * v15, id.as[v14] * v15, v24, v22);
                    return;
                }

                if(7 == v15) {
                    v14 = v14 + 2 & 3;
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, 73);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), null, 0x100, v14, 0, 0, v24, v22);
                    return;
                }

                if(v15 == v2) {
                    v15_1 = v0.bd(v1, v12, v13);
                    v15 = v15_1 != v5_4 ? ok.al(be.av(v15_1), 0xEF171A26).ac * v4 / v8 : 8;
                    v16 = v14 + 2 & 3;
                    if(v3 != v10.ak * v27 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                        v6_1 = new hj(arg34, 4, v16 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, 50);
                        v6 = v10.aq(4, v16 + 4, v18, v20, v19, v21, 16);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), ((bm)v6_1), 0x100, arg35, v15 * id.ao[v14], v15 * id.as[v14], v24, v22);
                    return;
                }

                return;
            }
        }

        v11 = v7;
        if(v11.ak * v27 != v3 || v11.bc != null) {
            v14_1 = v11;
            v7_2 = new hj(arg34, 10, arg35, arg31, arg32, arg33, v11.ak * v27, true, null);
        }
        else {
            v7_1 = v11.aq(10, arg35, v18, v20, v19, v21, -84);
            v14_1 = v11;
        }

        if(v7_1 != null) {
            v8 = v15 == 11 ? 0x100 : 0;
            arg37.af(arg30, arg32, arg33, v19, v16, v17, ((bm)v7_1), v8, v24, v22);
        }

        if(v14_1.ah * v26 != 0) {
            arg38.ae(arg32, arg33, v16, v17, v14_1.at, 860050522);
        }
    }

    static final boolean dv(int arg1, int arg2) {
        do v1 = ok.al(arg1, -1039066661);
        if(arg2 == 11) {
            arg2 = 10;
        }

        if(arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }

        return v1.ap(arg2, 0xBCE96F16);
    }

    static final void dw(int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, bg arg37, gy arg38) {
        long v15_1;
        ca v6;
        hj v6_1;
        do v12_1;
        ca v7_1;
        do v11;
        hj v7_2;
        do v14_1;
        ca v5_2;
        hj v5_3;
        int v5;
        int v17;
        int v4;
        int v1 = arg30;
        int v12 = arg32;
        int v13 = arg33;
        int v14 = arg35;
        int v15 = arg36;
        bg v0 = arg37;
        do v10 = ok.al(arg34, 10781131);
        int v2 = 0xB46CA623;
        int v3 = 0x4B9D7897;
        int v8 = 3;
        if(1 == v14 || v8 == v14) {
            v4 = v10.ag * v3;
            v17 = v10.az * v2;
        }
        else {
            v4 = v10.az * v2;
            v17 = v10.ag * v3;
        }

        int v16 = v4;
        if(v12 + v16 <= 104) {
            v2 = (v16 >> 1) + v12;
            v3 = (v16 + 1 >> 1) + v12;
        }
        else {
            v3 = v12 + 1;
            v2 = v12;
        }

        if(v13 + v17 <= 104) {
            v4 = (v17 >> 1) + v13;
            v5 = (v17 + 1 >> 1) + v13;
        }
        else {
            v5 = v13 + 1;
            v4 = v13;
        }

        int[][] v18 = id.ax[arg31];
        int v19 = v18[v2][v4] + v18[v3][v4] + v18[v2][v5] + v18[v3][v5] >> 2;
        int v20 = (v16 << 6) + (v12 << 7);
        int v21 = (v17 << 6) + (v13 << 7);
        v4 = 2;
        boolean v5_1 = v10.ay * 0xE5018CDF == 0 ? true : false;
        v8 = 2;
        long v24 = gs.aa(arg32, arg33, v4, v5_1, arg34, 1);
        v2 = (v14 << 6) + v15;
        if(1 == v10.bb * 0x3376F5D7) {
            v2 += 0x100;
        }

        int v22 = v2;
        int v26 = 0xE748B627;
        v3 = -1;
        int v27 = 0x804BDF6B;
        if(22 == v15) {
            if(v3 != v10.ak * v27 || v10.bc != null) {
                v15 = 1;
                v14_1 = v10;
                v5_3 = new hj(arg34, 22, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
            }
            else {
                v15 = 1;
                v5_2 = v10.aq(22, arg35, v18, v20, v19, v21, 17);
                v14_1 = v10;
            }

            arg37.aj(arg30, arg32, arg33, v19, ((bm)v5_2), v24, v22);
            if(v14_1.ah * v26 == v15) {
                arg38.an(v12, v13, 0);
            }

            return;
        }

        do v7 = v10;
        if(v15 != 10) {
            if(11 == v15) {
            }
            else if(v15 >= 12) {
                if(v3 != v7.ak * v27 || v7.bc != null) {
                    v14_1 = v7;
                    v7_2 = new hj(arg34, arg36, arg35, arg31, arg32, arg33, v7.ak * v27, true, null);
                }
                else {
                    v11 = v7;
                    v7_1 = v7.aq(arg36, arg35, v18, v20, v19, v21, 5);
                    v14_1 = v11;
                }

                arg37.af(arg30, arg32, arg33, v19, 1, 1, ((bm)v7_2), 0, v24, v22);
                if(v14_1.ah * v26 != 0) {
                    arg38.ae(arg32, arg33, v16, v17, v14_1.at, 985176027);
                }

                return;
            }
            else {
                v10 = v7;
                if(v15 == 0) {
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v12_1 = v10;
                        v5_3 = new hj(arg34, 0, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(0, arg35, v18, v20, v19, v21, 12);
                        v12_1 = v10;
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.ah[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, -50);
                    }

                    return;
                }

                v12_1 = v10;
                if(v15 == 1) {
                    if(v3 != v12_1.ak * v27 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 1, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(1, arg35, v18, v20, v19, v21, -63);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.at[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, -95);
                    }

                    return;
                }

                if(v15 == v8) {
                    v16 = v14 + 1 & 3;
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 2, v14 + 4, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                        v6_1 = new hj(arg34, 2, v16, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(2, v14 + 4, v18, v20, v19, v21, 15);
                        v6 = v12_1.aq(2, v16, v18, v20, v19, v21, -25);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_2), ((bm)v6_1), id.ah[v14], id.ah[v16], v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, -114);
                    }

                    return;
                }

                if(v15 == 3) {
                    if(v3 != v12_1.ak * v27 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 3, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(3, arg35, v18, v20, v19, v21, -85);
                    }

                    arg37.aq(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.at[v14], 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.al(arg32, arg33, arg36, arg35, v12_1.at, -72);
                    }

                    return;
                }

                if(9 == v15) {
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v7_2 = new hj(arg34, arg36, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v7_1 = v12_1.aq(arg36, arg35, v18, v20, v19, v21, 55);
                    }

                    arg37.af(arg30, arg32, arg33, v19, 1, 1, ((bm)v7_1), 0, v24, v22);
                    if(v12_1.ah * v26 != 0) {
                        arg38.ae(arg32, arg33, v16, v17, v12_1.at, 0xD5274551);
                    }

                    return;
                }

                if(v15 == 4) {
                    if(v12_1.ak * v27 != v3 || v12_1.bc != null) {
                        v5_3 = new hj(arg34, 4, arg35, arg31, arg32, arg33, v12_1.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v12_1.aq(4, arg35, v18, v20, v19, v21, -3);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.ah[v14], 0, 0, 0, v24, v22);
                    return;
                }

                v4 = 0x1CEE4599;
                long v5_4 = 0;
                if(5 == v15) {
                    v10 = v12_1;
                    long v7_3 = v0.bd(v1, arg32, v13);
                    v15 = v5_4 != v7_3 ? ok.al(be.av(v7_3), 1018266578).ac * v4 : 16;
                    if(v3 != v10.ak * v27 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, arg35, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, arg35, v18, v20, v19, v21, 2);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), null, id.ah[v14], 0, id.ay[v14] * v15, v15 * id.aw[v14], v24, v22);
                    return;
                }

                v10 = v12_1;
                v12 = arg32;
                v2 = 8;
                if(v15 == 6) {
                    v15_1 = v0.bd(v1, v12, v13);
                    v15 = v5_4 != v15_1 ? ok.al(be.av(v15_1), 1209218839).ac * v4 / v8 : 8;
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, -28);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), null, 0x100, arg35, id.ao[v14] * v15, id.as[v14] * v15, v24, v22);
                    return;
                }

                if(7 == v15) {
                    v14 = v14 + 2 & 3;
                    if(v10.ak * v27 != v3 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, 45);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), null, 0x100, v14, 0, 0, v24, v22);
                    return;
                }

                if(v15 == v2) {
                    v15_1 = v0.bd(v1, v12, v13);
                    v15 = v15_1 != v5_4 ? ok.al(be.av(v15_1), 1306093680).ac * v4 / v8 : 8;
                    v16 = v14 + 2 & 3;
                    if(v3 != v10.ak * v27 || v10.bc != null) {
                        v5_3 = new hj(arg34, 4, v14 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                        v6_1 = new hj(arg34, 4, v16 + 4, arg31, arg32, arg33, v10.ak * v27, true, null);
                    }
                    else {
                        v5_2 = v10.aq(4, v14 + 4, v18, v20, v19, v21, 35);
                        v6 = v10.aq(4, v16 + 4, v18, v20, v19, v21, -27);
                    }

                    arg37.ab(arg30, arg32, arg33, v19, ((bm)v5_2), ((bm)v6_1), 0x100, arg35, v15 * id.ao[v14], v15 * id.as[v14], v24, v22);
                    return;
                }

                return;
            }
        }

        v11 = v7;
        if(v11.ak * v27 != v3 || v11.bc != null) {
            v14_1 = v11;
            v7_2 = new hj(arg34, 10, arg35, arg31, arg32, arg33, v11.ak * v27, true, null);
        }
        else {
            v7_1 = v11.aq(10, arg35, v18, v20, v19, v21, -80);
            v14_1 = v11;
        }

        if((((ca)v7_2)) != null) {
            v8 = v15 == 11 ? 0x100 : 0;
            arg37.af(arg30, arg32, arg33, v19, v16, v17, ((bm)v7_2), v8, v24, v22);
        }

        if(v14_1.ah * v26 != 0) {
            arg38.ae(arg32, arg33, v16, v17, v14_1.at, 0x71E1F7CD);
        }
    }
}

