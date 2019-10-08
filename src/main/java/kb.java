public final class kb {
    static ku ad = null;
    static final int ae = 23;
    static final int aj = 50;
    static final int al = 16;
    static final int an = 1;
    static final int ap = 6;
    static final int ar = 0;
    static final int ax = 0x1000;

    static {
        kb.ad = new ku();
    }

    kb() throws Throwable {
        super();
        throw new Error();
    }

    static void aa(ku arg23) {
        int[] v14_1;
        int[] v2_2;
        int[] v5_1;
        int v18;
        byte v15_1;
        int v20;
        int[] v15_2;
        int[] v4_1;
        int v11_1;
        int v12;
        int v10;
        int v5;
        int v4;
        ku v0 = arg23;
        v0.ag = 0xB02C1CD1;
        if(jh.ak == null) {
            jh.ak = new int[v0.ag * 0x29CCFA8];
        }

        int v1 = 1;
        while(true) {
            int v2 = 1;
            do {
            label_12:
                if(v2 == 0) {
                    return;
                }

                if(kb.ar(arg23) == 23) {
                    return;
                }

                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.an(arg23);
                byte v2_1 = 0;
                v0.ah = 0;
                v0.ah = (kb.ar(arg23) & 0x341DE146 | v0.ah * -1958463005 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg23) & 0xABD90C29 | v0.ah * -1958463005 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg23) & 0xFF | v0.ah * -1958463005 << 8) * 0x37963916;
                int v3;
                for(v3 = 0; true; ++v3) {
                    v4 = 16;
                    if(v3 >= v4) {
                        break;
                    }

                    v0.ba[v3] = kb.an(arg23) == v1 ? ((boolean)v1) : false;
                }

                for(v3 = 0; true; ++v3) {
                    v5 = 0x100;
                    if(v3 >= v5) {
                        break;
                    }

                    v0.bd[v3] = false;
                }

                for(v3 = 0; v3 < v4; ++v3) {
                    if(v0.ba[v3]) {
                        int v6;
                        for(v6 = 0; v6 < v4; ++v6) {
                            if(kb.an(arg23) == v1) {
                                v0.bd[v3 * 16 + v6] = ((boolean)v1);
                            }
                        }
                    }
                }

                kb.aj(arg23);
                v6 = -2050313919;
                v3 = v0.ac * v6 + 2;
                int v14 = 3;
                int v15 = kb.ap(v14, v0);
                int v7 = kb.ap(15, v0);
                int v8;
                for(v8 = 0; v8 < v7; ++v8) {
                    int v9;
                    for(v9 = 0; kb.an(arg23) != 0; ++v9) {
                    }

                    v0.bo[v8] = ((byte)v9);
                }

                byte[] v8_1 = new byte[6];
                byte v9_1;
                for(v9_1 = 0; v9_1 < v15; v9_1 = ((byte)(v9_1 + 1))) {
                    v8_1[v9_1] = v9_1;
                }

                for(v9 = 0; v9 < v7; ++v9) {
                    v10 = v0.bo[v9];
                    byte v11 = v8_1[v10];
                    while(v10 > 0) {
                        v12 = v10 - 1;
                        v8_1[v10] = v8_1[v12];
                        byte v10_1 = ((byte)v12);
                    }

                    v8_1[0] = v11;
                    v0.bw[v9] = v11;
                }

                for(v7 = 0; v7 < v15; ++v7) {
                    v9 = kb.ap(5, v0);
                    for(v8 = 0; v8 < v3; ++v8) {
                        while(kb.an(arg23) != 0) {
                            if(kb.an(arg23) == 0) {
                                ++v9;
                                continue;
                            }

                            --v9;
                        }

                        v0.by[v7][v8] = ((byte)v9);
                    }
                }

                for(v12 = 0; v12 < v15; ++v12) {
                    v7 = 0;
                    v10 = 0;
                    v11_1 = 0x20;
                    while(v7 < v3) {
                        if(v0.by[v12][v7] > v10) {
                            v10 = v0.by[v12][v7];
                        }

                        if(v0.by[v12][v7] < v11_1) {
                            v11_1 = v0.by[v12][v7];
                        }

                        ++v7;
                    }

                    kb.ad(v0.bt[v12], v0.bv[v12], v0.bq[v12], v0.by[v12], v11_1, v10, v3);
                    v0.bx[v12] = v11_1;
                }

                v3 = v0.ac * v6 + v1;
                for(v6 = 0; v6 <= 0x60544C1B; ++v6) {
                    v0.aw[v6] = 0;
                }

                v6 = 15;
                for(v7 = 0xA5C0F0A4; v6 >= 0; v7 = v8) {
                    v8 = v7;
                    for(v7 = 15; v7 >= 0; --v7) {
                        v0.bn[v8] = ((byte)(v6 * 16 + v7));
                        --v8;
                    }

                    v0.bp[v6] = v8 + 1;
                    --v6;
                }

                v6 = v0.bw[0];
                v7 = v0.bx[v6];
                int[] v8_2 = v0.bt[v6];
                int[] v9_2 = v0.bq[v6];
                int[] v6_1 = v0.bv[v6];
                v11_1 = kb.ap(v7, v0);
                v12 = v7;
                while(v11_1 > v8_2[v12]) {
                    ++v12;
                    v11_1 = v11_1 << 1 | kb.an(arg23);
                    v1 = 1;
                    v2_1 = 0;
                    v4 = 16;
                    v5 = 0x100;
                    v14 = 3;
                }

                v11_1 = v9_2[v11_1 - v6_1[v12]];
                v10 = 0;
                v12 = 0xB0FFA0D;
                int v13 = 0;
                while(v11_1 != v3) {
                    if(v11_1 == 0 || v11_1 == v1) {
                        v1 = -1;
                        v2 = 1;
                        while(true) {
                            if(v11_1 == 0) {
                                v1 += v2;
                            }
                            else if(v11_1 == 1) {
                                v1 += v2 * 2;
                            }

                            v2 *= 2;
                            if(v12 == 0) {
                                ++v10;
                                v12 = 1100552470;
                                v4 = v0.bw[v10];
                                v5 = v0.bx[v4];
                                v6_1 = v0.bt[v4];
                                int[] v7_1 = v0.bq[v4];
                                v14_1 = v0.bv[v4];
                                v4_1 = v6_1;
                                v15_2 = v7_1;
                            }
                            else {
                                v14_1 = v6_1;
                                v5 = v7;
                                v4_1 = v8_2;
                                v15_2 = v9_2;
                            }

                            v18 = v10;
                            v20 = v12 - 1;
                            v6 = kb.ap(v5, v0);
                            v7 = v5;
                            while(v6 > v4_1[v7]) {
                                ++v7;
                                v6 = v6 << 1 | kb.an(arg23);
                            }

                            v11_1 = v15_2[v6 - v14_1[v7]];
                            if(v11_1 != 0 && v11_1 != 1) {
                                ++v1;
                                v2 = v0.bf[v0.bn[v0.bp[0]] & 0xFF];
                                v7 = v2 & 0xFF;
                                v0.aw[v7] += v1;
                                break;
                            }

                            v8_2 = v4_1;
                            v7 = v5;
                            v6_1 = v14_1;
                            v9_2 = v15_2;
                            v10 = v18;
                            v12 = v20;
                        }

                        while(v1 > 0) {
                            jh.ak[v13] = 0x42F8C65F & v2;
                            ++v13;
                            --v1;
                        }

                        v8_2 = v4_1;
                        v7 = v5;
                        v6_1 = v14_1;
                        v9_2 = v15_2;
                        v10 = v18;
                        v12 = v20;
                    }
                    else {
                        --v11_1;
                        if(v11_1 < v4) {
                            v5 = v0.bp[v2_1];
                            v15_1 = v0.bn[v5 + v11_1];
                            while(v11_1 > v14) {
                                int v17 = v5 + v11_1;
                                v18 = v17 - 1;
                                v0.bn[v17] = v0.bn[v18];
                                int v19 = v17 - 2;
                                v0.bn[v18] = v0.bn[v19];
                                v18 = v17 - 3;
                                v0.bn[v19] = v0.bn[v18];
                                v0.bn[v18] = v0.bn[v17 - 4];
                                v11_1 += -4;
                                v14 = 3;
                            }

                            while(v11_1 > 0) {
                                v14 = v5 + v11_1;
                                v0.bn[v14] = v0.bn[v14 - 1];
                                --v11_1;
                            }

                            v0.bn[v5] = v15_1;
                        }
                        else {
                            v2 = v11_1 / 16;
                            v4 = v0.bp[v2] + v11_1 % 16;
                            v15_1 = v0.bn[v4];
                            while(v4 > v0.bp[v2]) {
                                v0.bn[v4] = v0.bn[v4 - 1];
                                --v4;
                            }

                            v0.bp[v2] += v1;
                            while(v2 > 0) {
                                v0.bp[v2] -= v1;
                                v0.bn[v0.bp[v2]] = v0.bn[v0.bp[v2 - 1] + 16 - v1];
                                --v2;
                            }

                            v0.bp[0] -= v1;
                            v0.bn[v0.bp[0]] = v15_1;
                            if(v0.bp[0] != 0) {
                                goto label_480;
                            }

                            v2 = 15;
                            for(v4 = 0xFFF; v2 >= 0; v4 = v5) {
                                v5 = v4;
                                for(v4 = 15; v4 >= 0; --v4) {
                                    v0.bn[v5] = v0.bn[v0.bp[v2] + v4];
                                    --v5;
                                }

                                v0.bp[v2] = v5 + 1;
                                --v2;
                            }
                        }

                    label_480:
                        int[] v1_1 = v0.aw;
                        v2 = v0.bf[v15_1 & 0xFF] & 0xFF;
                        ++v1_1[v2_1];
                        jh.ak[v13] = v0.bf[0xAAA310E3 & v15_1] & -262972007;
                        v1 = v13 + 1;
                        if(v12 == 0) {
                            ++v10;
                            v12 = 50;
                            v2 = v0.bw[v10];
                            v4 = v0.bx[v2];
                            v5_1 = v0.bt[v2];
                            v6_1 = v0.bq[v2];
                            v2_2 = v0.bv[v2];
                            v14_1 = v6_1;
                        }
                        else {
                            v2_2 = v6_1;
                            v4 = v7;
                            v5_1 = v8_2;
                            v14_1 = v9_2;
                        }

                        v15 = v10;
                        v18 = v12 - 1;
                        v6 = kb.ap(v4, v0);
                        v7 = v4;
                        while(v6 > v5_1[v7]) {
                            ++v7;
                            v6 = v6 << 1 | kb.an(arg23);
                        }

                        v11_1 = v14_1[v6 - v2_2[v7]];
                        v13 = v1;
                        v6_1 = v2_2;
                        v7 = v4;
                        v8_2 = v5_1;
                        v9_2 = v14_1;
                        v10 = v15;
                        v12 = v18;
                    }

                    v1 = 1;
                    v2_1 = 0;
                    v4 = 16;
                    v5 = 0x100;
                    v14 = 3;
                }

                v0.au = v2_1;
                v0.aa = v2_1;
                v0.as[v2_1] = v2_1;
                for(v3 = 1; v3 <= v5; ++v3) {
                    v0.as[v3] += v0.as[v3 - 1];
                }

                for(v3 = 0; v3 < v13; ++v3) {
                    byte v4_2 = ((byte)(jh.ak[v3] & 0xF1700A52));
                    jh.ak[v0.as[-1286492709 & v4_2]] |= v3 << 8;
                    v4 = v4_2 & 0xFF;
                    v0.as[v4_2] += v1;
                }

                v0.at = (jh.ak[v0.ah * 963093691] >> 8) * 0x9428F9DF;
                v0.ao = v2_1;
                v0.at = jh.ak[v0.at * 0x9A2053D1] * 0x3394DB38;
                v0.ay = (((byte)(v0.at * 0x8DDCA251 & 0xFF))) * 0xDFA3BEA4;
                v0.at = (v0.at * 0x9A2053D1 >> 8) * 0xEAF6E531;
                v0.ao += -1722466707;
                v0.bg = v13 * 0x9A648031;
                kb.al(arg23);
                if(v0.ao * 0x1AFDA9BE != v0.bg * 0x43F2C3F3 + v1) {
                    goto label_12;
                }
            }
            while(v0.au * -1518705224 != 0);
        }
    }

    public static int ab(byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        ku v4 = kb.ad;
        __monitor_enter(v4);
        try {
            kb.ad.aj = arg3;
            kb.ad.ad = arg5 * -1828396005;
            kb.ad.ab = arg1;
            kb.ad.af = 0;
            kb.ad.ai = 0x1FECF679 * arg2;
            kb.ad.az = 0;
            kb.ad.am = 0;
            kb.ad.aq = 0;
            kb.ad.av = 0;
            kb.ae(kb.ad);
            arg2 -= kb.ad.ai * 1003545608;
            kb.ad.aj = null;
            kb.ad.ab = null;
            __monitor_exit(v4);
            return arg2;
        label_40:
            __monitor_exit(v4);
        }
        catch(Throwable v1) {
            goto label_40;
        }

        throw v1;
    }

    static void ac(ku arg4) {
        int v0 = 0;
        arg4.ac = 0;
        while(v0 < 0x100) {
            if(arg4.bd[v0]) {
                arg4.bf[arg4.ac * -2050313919] = ((byte)v0);
                arg4.ac += -2080710975;
            }

            ++v0;
        }
    }

    static void ad(int[] arg5, int[] arg6, int[] arg7, byte[] arg8, int arg9, int arg10, int arg11) {
        int v3;
        int v0 = 0;
        int v1 = arg9;
        int v2;
        for(v2 = 0; v1 <= arg10; v2 = v3) {
            v3 = v2;
            for(v2 = 0; v2 < arg11; ++v2) {
                if(arg8[v2] == v1) {
                    arg7[v3] = v2;
                    ++v3;
                }
            }

            ++v1;
        }

        int v7;
        for(v7 = 0; true; ++v7) {
            v1 = 23;
            if(v7 >= v1) {
                break;
            }

            arg6[v7] = 0;
        }

        for(v7 = 0; v7 < arg11; ++v7) {
            v3 = arg8[v7] + 1;
            ++arg6[v3];
        }

        for(v7 = 1; v7 < v1; ++v7) {
            arg6[v7] += arg6[v7 - 1];
        }

        for(v7 = 0; v7 < v1; ++v7) {
            arg5[v7] = 0;
        }

        for(v7 = arg9; v7 <= arg10; v7 = v8) {
            int v8 = v7 + 1;
            v0 += arg6[v8] - arg6[v7];
            arg5[v7] = v0 - 1;
            v0 <<= 1;
        }

        ++arg9;
        while(arg9 <= arg10) {
            arg6[arg9] = (arg5[arg9 - 1] + 1 << 1) - arg6[arg9];
            ++arg9;
        }
    }

    static void ae(ku arg24) {
        int[] v7_2;
        int[] v6_1;
        int[] v5_1;
        int v15;
        int v18;
        byte v7_1;
        int v20;
        int[] v15_1;
        int v13;
        int v12;
        int v7;
        int v4;
        ku v0 = arg24;
        v0.ag = 0xB02C1CD1;
        if(jh.ak == null) {
            jh.ak = new int[v0.ag * 0x724844A0];
        }

        int v1 = 1;
        while(true) {
            int v2 = 1;
            do {
            label_12:
                if(v2 == 0) {
                    return;
                }

                if(kb.ar(arg24) == 23) {
                    return;
                }

                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.an(arg24);
                byte v2_1 = 0;
                v0.ah = 0;
                int v5 = -1958463005;
                int v6 = 0xFF;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                int v3;
                for(v3 = 0; true; ++v3) {
                    v4 = 16;
                    if(v3 >= v4) {
                        break;
                    }

                    v0.ba[v3] = kb.an(arg24) == v1 ? ((boolean)v1) : false;
                }

                for(v3 = 0; true; ++v3) {
                    v7 = 0x100;
                    if(v3 >= v7) {
                        break;
                    }

                    v0.bd[v3] = false;
                }

                for(v3 = 0; v3 < v4; ++v3) {
                    if(v0.ba[v3]) {
                        int v8;
                        for(v8 = 0; v8 < v4; ++v8) {
                            if(kb.an(arg24) == v1) {
                                v0.bd[v3 * 16 + v8] = ((boolean)v1);
                            }
                        }
                    }
                }

                kb.aj(arg24);
                v8 = -2050313919;
                v3 = v0.ac * v8 + 2;
                int v14 = kb.ap(3, v0);
                int v9 = kb.ap(15, v0);
                int v10;
                for(v10 = 0; v10 < v9; ++v10) {
                    int v11;
                    for(v11 = 0; kb.an(arg24) != 0; ++v11) {
                    }

                    v0.bo[v10] = ((byte)v11);
                }

                byte[] v10_1 = new byte[6];
                byte v11_1;
                for(v11_1 = 0; v11_1 < v14; v11_1 = ((byte)(v11_1 + 1))) {
                    v10_1[v11_1] = v11_1;
                }

                for(v11 = 0; v11 < v9; ++v11) {
                    v12 = v0.bo[v11];
                    byte v16 = v10_1[v12];
                    while(v12 > 0) {
                        v13 = v12 - 1;
                        v10_1[v12] = v10_1[v13];
                        byte v12_1 = ((byte)v13);
                    }

                    v10_1[0] = v16;
                    v0.bw[v11] = v16;
                }

                for(v9 = 0; v9 < v14; ++v9) {
                    v11 = kb.ap(5, v0);
                    for(v10 = 0; v10 < v3; ++v10) {
                        while(kb.an(arg24) != 0) {
                            if(kb.an(arg24) == 0) {
                                ++v11;
                                continue;
                            }

                            --v11;
                        }

                        v0.by[v9][v10] = ((byte)v11);
                    }
                }

                v13 = 0;
                while(v13 < v14) {
                    v9 = 0;
                    v11 = 0;
                    v12 = 0x20;
                    while(v9 < v3) {
                        if(v0.by[v13][v9] > v11) {
                            v11 = v0.by[v13][v9];
                        }

                        if(v0.by[v13][v9] < v12) {
                            v12 = v0.by[v13][v9];
                        }

                        ++v9;
                    }

                    kb.ad(v0.bt[v13], v0.bv[v13], v0.bq[v13], v0.by[v13], v12, v11, v3);
                    v0.bx[v13] = v12;
                    ++v13;
                    v14 = v14;
                }

                v3 = v0.ac * v8 + v1;
                for(v4 = 0; v4 <= v6; ++v4) {
                    v0.aw[v4] = 0;
                }

                v4 = 15;
                for(v8 = 0xFFF; v4 >= 0; v8 = v9) {
                    v9 = v8;
                    for(v8 = 15; v8 >= 0; --v8) {
                        v0.bn[v9] = ((byte)(v4 * 16 + v8));
                        --v9;
                    }

                    v0.bp[v4] = v9 + 1;
                    --v4;
                }

                v4 = v0.bw[0];
                v8 = v0.bx[v4];
                int[] v9_1 = v0.bt[v4];
                int[] v10_2 = v0.bq[v4];
                int[] v4_1 = v0.bv[v4];
                v12 = kb.ap(v8, v0);
                v13 = v8;
                while(v12 > v9_1[v13]) {
                    ++v13;
                    v12 = v12 << 1 | kb.an(arg24);
                    v1 = 1;
                    v2_1 = 0;
                    v5 = -1958463005;
                    v6 = 0xFF;
                    v7 = 0x100;
                }

                v12 = v10_2[v12 - v4_1[v13]];
                v11 = 0;
                v13 = 49;
                v14 = 0;
                while(v12 != v3) {
                    if(v12 == 0 || v12 == v1) {
                        v1 = -1;
                        v2 = 1;
                        while(true) {
                            if(v12 == 0) {
                                v1 += v2;
                            }
                            else if(v12 == 1) {
                                v1 += v2 * 2;
                            }

                            v2 *= 2;
                            if(v13 == 0) {
                                ++v11;
                                v13 = 50;
                                v4 = v0.bw[v11];
                                v5 = v0.bx[v4];
                                v6_1 = v0.bt[v4];
                                v15_1 = v0.bq[v4];
                                v18 = v11;
                                v7_2 = v0.bv[v4];
                            }
                            else {
                                v7_2 = v4_1;
                                v5 = v8;
                                v6_1 = v9_1;
                                v15_1 = v10_2;
                                v18 = v11;
                            }

                            v20 = v13 - 1;
                            v4 = kb.ap(v5, v0);
                            v8 = v5;
                            while(v4 > v6_1[v8]) {
                                ++v8;
                                v4 = v4 << 1 | kb.an(arg24);
                            }

                            v12 = v15_1[v4 - v7_2[v8]];
                            if(v12 != 0 && v12 != 1) {
                                ++v1;
                                v2 = v0.bf[v0.bn[v0.bp[0]] & 0xFF] & 0xFF;
                                v0.aw[v2] += v1;
                                break;
                            }

                            v8 = v5;
                            v9_1 = v6_1;
                            v4_1 = v7_2;
                            v10_2 = v15_1;
                            v11 = v18;
                            v13 = v20;
                        }

                        while(v1 > 0) {
                            jh.ak[v14] = v2;
                            ++v14;
                            --v1;
                        }

                        v8 = v5;
                        v9_1 = v6_1;
                        v4_1 = v7_2;
                        v10_2 = v15_1;
                        v11 = v18;
                        v13 = v20;
                    }
                    else {
                        --v12;
                        if(v12 < 16) {
                            v5 = v0.bp[v2_1];
                            v7_1 = v0.bn[v5 + v12];
                            while(v12 > 3) {
                                int v16_1 = v5 + v12;
                                v18 = v16_1 - 1;
                                v0.bn[v16_1] = v0.bn[v18];
                                int v19 = v16_1 - 2;
                                v0.bn[v18] = v0.bn[v19];
                                v18 = v16_1 - 3;
                                v0.bn[v19] = v0.bn[v18];
                                v0.bn[v18] = v0.bn[v16_1 - 4];
                                v12 += -4;
                            }

                            while(v12 > 0) {
                                v15 = v5 + v12;
                                v0.bn[v15] = v0.bn[v15 - 1];
                                --v12;
                            }

                            v0.bn[v5] = v7_1;
                        }
                        else {
                            v2 = v12 / 16;
                            v5 = v0.bp[v2] + v12 % 16;
                            v7_1 = v0.bn[v5];
                            while(v5 > v0.bp[v2]) {
                                v0.bn[v5] = v0.bn[v5 - 1];
                                --v5;
                            }

                            v0.bp[v2] += v1;
                            while(v2 > 0) {
                                v0.bp[v2] -= v1;
                                v0.bn[v0.bp[v2]] = v0.bn[v0.bp[v2 - 1] + 16 - v1];
                                --v2;
                            }

                            v0.bp[0] -= v1;
                            v0.bn[v0.bp[0]] = v7_1;
                            if(v0.bp[0] != 0) {
                                goto label_487;
                            }

                            v2 = 15;
                            for(v5 = 0xFFF; v2 >= 0; v5 = v6) {
                                v6 = v5;
                                for(v5 = 15; v5 >= 0; --v5) {
                                    v0.bn[v6] = v0.bn[v0.bp[v2] + v5];
                                    --v6;
                                }

                                v0.bp[v2] = v6 + 1;
                                --v2;
                            }
                        }

                    label_487:
                        int[] v1_1 = v0.aw;
                        v6 = v7_1 & 0xFF;
                        v2 = v0.bf[v6] & 0xFF;
                        ++v1_1[v2];
                        jh.ak[v14] = v0.bf[v6] & 0xFF;
                        v1 = v14 + 1;
                        if(v13 == 0) {
                            ++v11;
                            v13 = 50;
                            v2 = v0.bw[v11];
                            v4 = v0.bx[v2];
                            v5_1 = v0.bt[v2];
                            v6_1 = v0.bq[v2];
                            v7_2 = v0.bv[v2];
                            v2 = v4;
                        }
                        else {
                            v7_2 = v4_1;
                            v2 = v8;
                            v5_1 = v9_1;
                            v6_1 = v10_2;
                        }

                        v15 = v11;
                        v18 = v13 - 1;
                        v4 = kb.ap(v2, v0);
                        v8 = v2;
                        while(v4 > v5_1[v8]) {
                            ++v8;
                            v4 = v4 << 1 | kb.an(arg24);
                        }

                        v12 = v6_1[v4 - v7_2[v8]];
                        v14 = v1;
                        v8 = v2;
                        v9_1 = v5_1;
                        v10_2 = v6_1;
                        v4_1 = v7_2;
                        v11 = v15;
                        v13 = v18;
                    }

                    v1 = 1;
                    v2_1 = 0;
                    v5 = -1958463005;
                    v6 = 0xFF;
                    v7 = 0x100;
                }

                v0.au = v2_1;
                v0.aa = v2_1;
                v0.as[v2_1] = v2_1;
                for(v3 = 1; v3 <= v7; ++v3) {
                    v0.as[v3] = v0.aw[v3 - 1];
                }

                for(v3 = 1; v3 <= v7; ++v3) {
                    v0.as[v3] += v0.as[v3 - 1];
                }

                for(v3 = 0; v3 < v14; ++v3) {
                    v4 = (((byte)(jh.ak[v3] & v6))) & v6;
                    jh.ak[v0.as[((int)v4_1)]] |= v3 << 8;
                    v0.as[((int)v4_1)] += v1;
                }

                v0.at = (jh.ak[v0.ah * v5] >> 8) * 0xEAF6E531;
                v0.ao = v2_1;
                v0.at = jh.ak[v0.at * 0x9A2053D1] * 0xEAF6E531;
                v0.ay = (((byte)(v0.at * 0x9A2053D1 & v6))) * 651870737;
                v0.at = (v0.at * 0x9A2053D1 >> 8) * 0xEAF6E531;
                v0.ao += -1722466707;
                v0.bg = v14 * 0xD2D59D8F;
                kb.al(arg24);
                if(v0.ao * 0x81E07B65 != v0.bg * 0xE4BAE16F + v1) {
                    goto label_12;
                }
            }
            while(v0.au * 2038359687 != 0);
        }
    }

    static void af(ku arg14) {
        byte v0 = arg14.aa;
        int v1 = arg14.au * 2038359687;
        int v2 = arg14.ao * 0x81E07B65;
        int v3 = arg14.ay * 0x35EC6EF1;
        int[] v4 = jh.ak;
        int v5 = arg14.at * 0x9A2053D1;
        byte[] v6 = arg14.ab;
        int v7 = arg14.af * 1286825061;
        int v8 = arg14.ai * 0x7D70CB9B;
        int v10 = 1;
        int v9 = arg14.bg * 428800275 + 1;
        int v11 = v5;
        v5 = v3;
        v3 = v2;
        v2 = v8;
        while(true) {
            if(v1 > 0) {
                while(true) {
                    if(v2 == 0) {
                        break;
                    }
                    else if(v1 != 1) {
                        v6[v7] = v0;
                        --v1;
                        ++v7;
                        --v2;
                        continue;
                    }
                    else if(v2 == 0) {
                    }
                    else {
                        v6[v7] = v0;
                        ++v7;
                        --v2;
                        goto label_46;
                    }

                    goto label_68;
                }

                v10 = v1;
            }
            else {
                while(true) {
                label_46:
                    if(v3 != v9) {
                        v0 = ((byte)v5);
                        v1 = v4[v11];
                        byte v11_1 = ((byte)v1);
                        v1 >>= 8;
                        ++v3;
                        if(v11_1 != v5) {
                            if(v2 == 0) {
                                v5 = v11_1;
                                goto label_57;
                            }
                            else {
                                v6[v7] = v0;
                                ++v7;
                                --v2;
                                v5 = v11_1;
                            }
                        }
                        else if(v3 != v9) {
                            break;
                        }
                        else if(v2 == 0) {
                        label_57:
                            v11 = v1;
                            goto label_68;
                        }
                        else {
                            v6[v7] = v0;
                            ++v7;
                            --v2;
                        }

                        v11 = v1;
                        continue;
                    }
                    else {
                        goto label_47;
                    }
                }

                byte v12 = ((byte)v4[v1]);
                v1 = v4[v1] >> 8;
                ++v3;
                if(v3 == v9) {
                    v11 = v1;
                }
                else if(v12 != v5) {
                    v11 = v1;
                    v5 = v12;
                }
                else {
                    goto label_115;
                }

                v1 = 2;
                continue;
            label_115:
                v12 = ((byte)v4[v1]);
                v1 = v4[v1] >> 8;
                ++v3;
                if(v3 == v9) {
                    v11 = v1;
                }
                else if(v12 != v5) {
                    v11 = v1;
                    v5 = v12;
                }
                else {
                    goto label_128;
                }

                v1 = 3;
                continue;
            label_128:
                byte v5_1 = ((byte)v4[v1]);
                v3 += 2;
                int v13 = ((byte)v4[v4[v1] >> 8]);
                v11 = v4[v4[v1] >> 8] >> 8;
                v1 = (v5_1 & 0xF2F03454) + 4;
                v5 = v13;
                continue;
            }

            goto label_68;
        }

    label_47:
        v10 = 0;
    label_68:
        arg14.av += (v8 - v2) * 0x4696EE83;
        arg14.aa = v0;
        arg14.au = v10 * 0xFC04FF37;
        arg14.ao = v3 * -1722466707;
        arg14.ay = v5 * 651870737;
        jh.ak = v4;
        arg14.at = v11 * 0xEAF6E531;
        arg14.ab = v6;
        arg14.af = v7 * 240037229;
        arg14.ai = v2 * 0x93D9A293;
    }

    static byte ag(ku arg1) {
        return ((byte)kb.ap(8, arg1));
    }

    static byte ah(ku arg1) {
        return ((byte)kb.ap(8, arg1));
    }

    static void ai(ku arg15) {
        byte v0 = arg15.aa;
        int v1 = arg15.au * 2038359687;
        int v2 = arg15.ao * 0x81E07B65;
        int v3 = arg15.ay * 0x35EC6EF1;
        int[] v4 = jh.ak;
        int v5 = arg15.at * 0x9A2053D1;
        byte[] v6 = arg15.ab;
        int v7 = arg15.af * 1286825061;
        int v8 = arg15.ai * 0x7D70CB9B;
        int v10 = 1;
        int v9 = arg15.bg * 0xE4BAE16F + 1;
        int v11 = v5;
        v5 = v3;
        v3 = v2;
        v2 = v8;
        while(true) {
            if(v1 > 0) {
                while(true) {
                    if(v2 == 0) {
                        break;
                    }
                    else if(v1 != 1) {
                        v6[v7] = v0;
                        --v1;
                        ++v7;
                        --v2;
                        continue;
                    }
                    else if(v2 == 0) {
                    }
                    else {
                        v6[v7] = v0;
                        ++v7;
                        --v2;
                        goto label_46;
                    }

                    goto label_67;
                }

                v10 = v1;
            }
            else {
                while(true) {
                label_46:
                    if(v3 != v9) {
                        v0 = ((byte)v5);
                        v1 = v4[v11];
                        byte v11_1 = ((byte)v1);
                        v1 >>= 8;
                        ++v3;
                        if(v11_1 != v5) {
                            if(v2 == 0) {
                                v5 = v11_1;
                                goto label_66;
                            }
                            else {
                                v6[v7] = v0;
                                ++v7;
                                --v2;
                                v5 = v11_1;
                            }
                        }
                        else if(v3 != v9) {
                            break;
                        }
                        else if(v2 == 0) {
                        label_66:
                            v11 = v1;
                            goto label_67;
                        }
                        else {
                            v6[v7] = v0;
                            ++v7;
                            --v2;
                        }

                        v11 = v1;
                        continue;
                    }
                    else {
                        goto label_47;
                    }
                }

                byte v12 = ((byte)v4[v1]);
                v1 = v4[v1] >> 8;
                ++v3;
                if(v3 == v9) {
                    v11 = v1;
                }
                else if(v12 != v5) {
                    v11 = v1;
                    v5 = v12;
                }
                else {
                    goto label_117;
                }

                v1 = 2;
                continue;
            label_117:
                v12 = ((byte)v4[v1]);
                v1 = v4[v1] >> 8;
                ++v3;
                if(v3 == v9) {
                    v11 = v1;
                }
                else if(v12 != v5) {
                    v11 = v1;
                    v5 = v12;
                }
                else {
                    goto label_130;
                }

                v1 = 3;
                continue;
            label_130:
                byte v5_1 = ((byte)v4[v1]);
                v3 += 2;
                int v14 = ((byte)v4[v4[v1] >> 8]);
                v11 = v4[v4[v1] >> 8] >> 8;
                v1 = (v5_1 & 0xFF) + 4;
                v5 = v14;
                continue;
            }

            goto label_67;
        }

    label_47:
        v10 = 0;
    label_67:
        arg15.av += (v8 - v2) * 0x4696EE83;
        arg15.aa = v0;
        arg15.au = v10 * 0xFC04FF37;
        arg15.ao = v3 * -1722466707;
        arg15.ay = v5 * 651870737;
        jh.ak = v4;
        arg15.at = v11 * 0xEAF6E531;
        arg15.ab = v6;
        arg15.af = v7 * 240037229;
        arg15.ai = v2 * 0x93D9A293;
    }

    static void aj(ku arg4) {
        int v0 = 0;
        arg4.ac = 0;
        while(v0 < 0x100) {
            if(arg4.bd[v0]) {
                arg4.bf[arg4.ac * -2050313919] = ((byte)v0);
                arg4.ac += -2080710975;
            }

            ++v0;
        }
    }

    static void ak(ku arg4) {
        int v0 = 0;
        arg4.ac = 0;
        while(v0 < 0x100) {
            if(arg4.bd[v0]) {
                arg4.bf[arg4.ac * -2050313919] = ((byte)v0);
                arg4.ac += -2080710975;
            }

            ++v0;
        }
    }

    static void al(ku arg15) {
        byte v0 = arg15.aa;
        int v1 = arg15.au * 2038359687;
        int v2 = arg15.ao * 0x81E07B65;
        int v3 = arg15.ay * 0x35EC6EF1;
        int[] v4 = jh.ak;
        int v5 = arg15.at * 0x9A2053D1;
        byte[] v6 = arg15.ab;
        int v7 = arg15.af * 1286825061;
        int v8 = arg15.ai * 0x7D70CB9B;
        int v10 = 1;
        int v9 = arg15.bg * 0xE4BAE16F + 1;
        int v11 = v5;
        v5 = v3;
        v3 = v2;
        v2 = v8;
        while(true) {
            if(v1 > 0) {
                while(true) {
                    if(v2 == 0) {
                        break;
                    }
                    else if(v1 != 1) {
                        v6[v7] = v0;
                        --v1;
                        ++v7;
                        --v2;
                        continue;
                    }
                    else if(v2 == 0) {
                    }
                    else {
                        v6[v7] = v0;
                        ++v7;
                        --v2;
                        goto label_46;
                    }

                    goto label_67;
                }

                v10 = v1;
            }
            else {
                while(true) {
                label_46:
                    if(v3 != v9) {
                        v0 = ((byte)v5);
                        v1 = v4[v11];
                        byte v11_1 = ((byte)v1);
                        v1 >>= 8;
                        ++v3;
                        if(v11_1 != v5) {
                            if(v2 == 0) {
                                v5 = v11_1;
                                goto label_57;
                            }
                            else {
                                v6[v7] = v0;
                                ++v7;
                                --v2;
                                v5 = v11_1;
                            }
                        }
                        else if(v3 != v9) {
                            break;
                        }
                        else if(v2 == 0) {
                        label_57:
                            v11 = v1;
                            goto label_67;
                        }
                        else {
                            v6[v7] = v0;
                            ++v7;
                            --v2;
                        }

                        v11 = v1;
                        continue;
                    }
                    else {
                        goto label_47;
                    }
                }

                byte v12 = ((byte)v4[v1]);
                v1 = v4[v1] >> 8;
                ++v3;
                if(v3 == v9) {
                    v11 = v1;
                }
                else if(v12 != v5) {
                    v11 = v1;
                    v5 = v12;
                }
                else {
                    goto label_118;
                }

                v1 = 2;
                continue;
            label_118:
                v12 = ((byte)v4[v1]);
                v1 = v4[v1] >> 8;
                ++v3;
                if(v3 == v9) {
                    v11 = v1;
                }
                else if(v12 != v5) {
                    v11 = v1;
                    v5 = v12;
                }
                else {
                    goto label_131;
                }

                v1 = 3;
                continue;
            label_131:
                byte v5_1 = ((byte)v4[v1]);
                v3 += 2;
                int v14 = ((byte)v4[v4[v1] >> 8]);
                v11 = v4[v4[v1] >> 8] >> 8;
                v1 = (v5_1 & 0xFF) + 4;
                v5 = v14;
                continue;
            }

            goto label_67;
        }

    label_47:
        v10 = 0;
    label_67:
        arg15.av += (v8 - v2) * 0x4696EE83;
        arg15.aa = v0;
        arg15.au = v10 * 0xFC04FF37;
        arg15.ao = v3 * -1722466707;
        arg15.ay = v5 * 651870737;
        jh.ak = v4;
        arg15.at = v11 * 0xEAF6E531;
        arg15.ab = v6;
        arg15.af = v7 * 240037229;
        arg15.ai = v2 * 0x93D9A293;
    }

    static void am(ku arg23) {
        int[] v14_1;
        int[] v2_2;
        int[] v5_1;
        int v21;
        int v18;
        byte v15_1;
        int[] v4_1;
        int[] v15_2;
        int v11_1;
        int v12;
        int v10;
        int v5;
        int v4;
        ku v0 = arg23;
        v0.ag = 0x414EB302;
        if(jh.ak == null) {
            jh.ak = new int[v0.ag * 0x724844A0];
        }

        int v1 = 1;
        while(true) {
            int v2 = 1;
            do {
            label_12:
                if(v2 == 0) {
                    return;
                }

                if(kb.ar(arg23) == 23) {
                    return;
                }

                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.ar(arg23);
                kb.an(arg23);
                byte v2_1 = 0;
                v0.ah = 0;
                v0.ah = (kb.ar(arg23) & 0xFF | v0.ah * -1958463005 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg23) & 0xFF | v0.ah * 0x2F18C691 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg23) & 0x493B3C5 | v0.ah * -1958463005 << 8) * 0x1D10D3CB;
                int v3;
                for(v3 = 0; true; ++v3) {
                    v4 = 16;
                    if(v3 >= v4) {
                        break;
                    }

                    v0.ba[v3] = kb.an(arg23) == v1 ? ((boolean)v1) : false;
                }

                for(v3 = 0; true; ++v3) {
                    v5 = 0x100;
                    if(v3 >= v5) {
                        break;
                    }

                    v0.bd[v3] = false;
                }

                for(v3 = 0; v3 < v4; ++v3) {
                    if(v0.ba[v3]) {
                        int v6;
                        for(v6 = 0; v6 < v4; ++v6) {
                            if(kb.an(arg23) == v1) {
                                v0.bd[v3 * 16 + v6] = ((boolean)v1);
                            }
                        }
                    }
                }

                kb.aj(arg23);
                v6 = -2050313919;
                v3 = v0.ac * v6 + 2;
                int v14 = 3;
                int v15 = kb.ap(v14, v0);
                int v7 = kb.ap(15, v0);
                int v8;
                for(v8 = 0; v8 < v7; ++v8) {
                    int v9;
                    for(v9 = 0; kb.an(arg23) != 0; ++v9) {
                    }

                    v0.bo[v8] = ((byte)v9);
                }

                byte[] v8_1 = new byte[6];
                byte v9_1;
                for(v9_1 = 0; v9_1 < v15; v9_1 = ((byte)(v9_1 + 1))) {
                    v8_1[v9_1] = v9_1;
                }

                for(v9 = 0; v9 < v7; ++v9) {
                    v10 = v0.bo[v9];
                    byte v11 = v8_1[v10];
                    while(v10 > 0) {
                        v12 = v10 - 1;
                        v8_1[v10] = v8_1[v12];
                        byte v10_1 = ((byte)v12);
                    }

                    v8_1[0] = v11;
                    v0.bw[v9] = v11;
                }

                for(v7 = 0; v7 < v15; ++v7) {
                    v9 = kb.ap(5, v0);
                    for(v8 = 0; v8 < v3; ++v8) {
                        while(kb.an(arg23) != 0) {
                            if(kb.an(arg23) == 0) {
                                ++v9;
                                continue;
                            }

                            --v9;
                        }

                        v0.by[v7][v8] = ((byte)v9);
                    }
                }

                for(v12 = 0; v12 < v15; ++v12) {
                    v7 = 0;
                    v10 = 0x2535F241;
                    v11_1 = 0;
                    while(v7 < v3) {
                        if(v0.by[v12][v7] > v11_1) {
                            v11_1 = v0.by[v12][v7];
                        }

                        if(v0.by[v12][v7] < v10) {
                            v10 = v0.by[v12][v7];
                        }

                        ++v7;
                    }

                    kb.ad(v0.bt[v12], v0.bv[v12], v0.bq[v12], v0.by[v12], v10, v11_1, v3);
                    v0.bx[v12] = v10;
                }

                v3 = v0.ac * v6 + v1;
                for(v6 = 0; v6 <= 1030275482; ++v6) {
                    v0.aw[v6] = 0;
                }

                v6 = 15;
                for(v7 = 0xFFF; v6 >= 0; v7 = v8) {
                    v8 = v7;
                    for(v7 = 15; v7 >= 0; --v7) {
                        v0.bn[v8] = ((byte)(v6 * 16 + v7));
                        --v8;
                    }

                    v0.bp[v6] = v8 + 1;
                    --v6;
                }

                v6 = v0.bw[0];
                v7 = v0.bx[v6];
                int[] v8_2 = v0.bt[v6];
                int[] v9_2 = v0.bq[v6];
                int[] v6_1 = v0.bv[v6];
                v11_1 = kb.ap(v7, v0);
                v12 = v7;
                while(v11_1 > v8_2[v12]) {
                    ++v12;
                    v11_1 = v11_1 << 1 | kb.an(arg23);
                    v1 = 1;
                    v2_1 = 0;
                    v4 = 16;
                    v5 = 0x100;
                    v14 = 3;
                }

                v11_1 = v9_2[v11_1 - v6_1[v12]];
                v10 = 0;
                v12 = 0x4249117F;
                int v13 = 0;
                while(v11_1 != v3) {
                    if(v11_1 == 0 || v11_1 == v1) {
                        v1 = -1;
                        v2 = 1;
                        while(true) {
                            if(v11_1 == 0) {
                                v1 += v2;
                            }
                            else if(v11_1 == 1) {
                                v1 += v2 * 2;
                            }

                            v2 *= 2;
                            if(v12 == 0) {
                                ++v10;
                                v12 = 0x2343A92B;
                                v4 = v0.bw[v10];
                                v5 = v0.bx[v4];
                                v6_1 = v0.bt[v4];
                                int[] v7_1 = v0.bq[v4];
                                v15_2 = v0.bv[v4];
                                v4_1 = v6_1;
                                v14_1 = v7_1;
                            }
                            else {
                                v15_2 = v6_1;
                                v5 = v7;
                                v4_1 = v8_2;
                                v14_1 = v9_2;
                            }

                            v18 = v10;
                            v21 = v12 - 1;
                            v6 = kb.ap(v5, v0);
                            v7 = v5;
                            while(v6 > v4_1[v7]) {
                                ++v7;
                                v6 = v6 << 1 | kb.an(arg23);
                            }

                            v11_1 = v14_1[v6 - v15_2[v7]];
                            if(v11_1 != 0 && v11_1 != 1) {
                                ++v1;
                                v2 = v0.bf[v0.bn[v0.bp[0]] & 0x7D07C43];
                                v7 = 948203035 & v2;
                                v0.aw[v7] += v1;
                                break;
                            }

                            v8_2 = v4_1;
                            v7 = v5;
                            v9_2 = v14_1;
                            v6_1 = v15_2;
                            v10 = v18;
                            v12 = v21;
                        }

                        while(v1 > 0) {
                            jh.ak[v13] = 0x36846066 & v2;
                            ++v13;
                            --v1;
                        }

                        v8_2 = v4_1;
                        v7 = v5;
                        v9_2 = v14_1;
                        v6_1 = v15_2;
                        v10 = v18;
                        v12 = v21;
                    }
                    else {
                        --v11_1;
                        if(v11_1 < v4) {
                            v5 = v0.bp[v2_1];
                            v15_1 = v0.bn[v5 + v11_1];
                            while(v11_1 > v14) {
                                int v16 = v5 + v11_1;
                                v18 = v16 - 1;
                                v0.bn[v16] = v0.bn[v18];
                                v21 = v16 - 2;
                                v0.bn[v18] = v0.bn[v21];
                                v18 = v16 - 3;
                                v0.bn[v21] = v0.bn[v18];
                                v0.bn[v18] = v0.bn[v16 - 4];
                                v11_1 += -4;
                                v14 = 3;
                            }

                            while(v11_1 > 0) {
                                v14 = v5 + v11_1;
                                v0.bn[v14] = v0.bn[v14 - 1];
                                --v11_1;
                            }

                            v0.bn[v5] = v15_1;
                        }
                        else {
                            v2 = v11_1 / 16;
                            v4 = v0.bp[v2] + v11_1 % 16;
                            v15_1 = v0.bn[v4];
                            while(v4 > v0.bp[v2]) {
                                v0.bn[v4] = v0.bn[v4 - 1];
                                --v4;
                            }

                            v0.bp[v2] += v1;
                            while(v2 > 0) {
                                v0.bp[v2] -= v1;
                                v0.bn[v0.bp[v2]] = v0.bn[v0.bp[v2 - 1] + 16 - v1];
                                --v2;
                            }

                            v0.bp[0] -= v1;
                            v0.bn[v0.bp[0]] = v15_1;
                            if(v0.bp[0] != 0) {
                                goto label_488;
                            }

                            v2 = 15;
                            for(v4 = 0x1A7C7F4D; v2 >= 0; v4 = v5) {
                                v5 = v4;
                                for(v4 = 15; v4 >= 0; --v4) {
                                    v0.bn[v5] = v0.bn[v0.bp[v2] + v4];
                                    --v5;
                                }

                                v0.bp[v2] = v5 + 1;
                                --v2;
                            }
                        }

                    label_488:
                        int[] v1_1 = v0.aw;
                        v2 = v0.bf[v15_1 & 0xFF] & 0xFF;
                        ++v1_1[v2_1];
                        jh.ak[v13] = v0.bf[0x31C07F7 & v15_1] & 0xCE3047A0;
                        v1 = v13 + 1;
                        if(v12 == 0) {
                            ++v10;
                            v12 = -1184780560;
                            v2 = v0.bw[v10];
                            v4 = v0.bx[v2];
                            v5_1 = v0.bt[v2];
                            v6_1 = v0.bq[v2];
                            v2_2 = v0.bv[v2];
                            v14_1 = v6_1;
                        }
                        else {
                            v2_2 = v6_1;
                            v4 = v7;
                            v5_1 = v8_2;
                            v14_1 = v9_2;
                        }

                        v15 = v10;
                        v18 = v12 - 1;
                        v6 = kb.ap(v4, v0);
                        v7 = v4;
                        while(v6 > v5_1[v7]) {
                            ++v7;
                            v6 = v6 << 1 | kb.an(arg23);
                        }

                        v11_1 = v14_1[v6 - v2_2[v7]];
                        v13 = v1;
                        v6_1 = v2_2;
                        v7 = v4;
                        v8_2 = v5_1;
                        v9_2 = v14_1;
                        v10 = v15;
                        v12 = v18;
                    }

                    v1 = 1;
                    v2_1 = 0;
                    v4 = 16;
                    v5 = 0x100;
                    v14 = 3;
                }

                v0.au = v2_1;
                v0.aa = v2_1;
                v0.as[v2_1] = v2_1;
                for(v3 = 1; v3 <= v5; ++v3) {
                    v0.as[v3] = v0.aw[v3 - 1];
                }

                for(v3 = 1; v3 <= v5; ++v3) {
                    v0.as[v3] += v0.as[v3 - 1];
                }

                for(v3 = 0; v3 < v13; ++v3) {
                    byte v4_2 = ((byte)(jh.ak[v3] & 0x9B2705A4));
                    jh.ak[v0.as[v4 & 0xFF]] |= v3 << 8;
                    v4 = v4_2 & 0x1B218D17;
                    v0.as[v4] += v1;
                }

                v0.at = (jh.ak[v0.ah * 0xBF1CE3AF] >> 8) * 0xEAF6E531;
                v0.ao = v2_1;
                v0.at = jh.ak[v0.at * 0x9A2053D1] * 410845660;
                v0.ay = (((byte)(v0.at * 0x9A2053D1 & 0xFF))) * 0x791F1F3F;
                v0.at = (v0.at * 0xDAAD359E >> 8) * 0xEAF6E531;
                v0.ao += -1722466707;
                v0.bg = v13 * 0xD2D59D8F;
                kb.al(arg23);
                if(v0.ao * 0x81E07B65 != v0.bg * 0x9A0AF935 + v1) {
                    goto label_12;
                }
            }
            while(v0.au * 0x24809BCA != 0);
        }
    }

    static byte an(ku arg1) {
        return ((byte)kb.ap(1, arg1));
    }

    static byte ao(ku arg1) {
        return ((byte)kb.ap(1, arg1));
    }

    static int ap(int arg4, ku arg5) {
        int v2;
        int v1;
        while(true) {
            v1 = -563843809;
            v2 = 0xAD30518F;
            if(arg5.az * v1 >= arg4) {
                break;
            }

            arg5.am = (arg5.am * v2 << 8 | arg5.aj[arg5.ad * 0x22265613] & 0xFF) * 0xAAA1AD6F;
            arg5.az += 0xE45676F8;
            arg5.ad += -1828396005;
            arg5.aq += 0x1A6C33A7;
        }

        int v0 = arg5.am * v2 >> arg5.az * v1 - arg4 & (1 << arg4) - 1;
        arg5.az -= arg4 * 0xDC8ACEDF;
        return v0;
    }

    public static int aq(byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        ku v4 = kb.ad;
        __monitor_enter(v4);
        try {
            kb.ad.aj = arg3;
            kb.ad.ad = arg5 * -1828396005;
            kb.ad.ab = arg1;
            kb.ad.af = 0;
            kb.ad.ai = 0x93D9A293 * arg2;
            kb.ad.az = 0;
            kb.ad.am = 0;
            kb.ad.aq = 0;
            kb.ad.av = 0;
            kb.ae(kb.ad);
            arg2 -= kb.ad.ai * 0x7D70CB9B;
            kb.ad.aj = null;
            kb.ad.ab = null;
            __monitor_exit(v4);
            return arg2;
        label_40:
            __monitor_exit(v4);
        }
        catch(Throwable v1) {
            goto label_40;
        }

        throw v1;
    }

    static byte ar(ku arg1) {
        return ((byte)kb.ap(8, arg1));
    }

    static int as(int arg4, ku arg5) {
        int v2;
        int v1;
        while(true) {
            v1 = -563843809;
            v2 = 0xAD30518F;
            if(arg5.az * v1 >= arg4) {
                break;
            }

            arg5.am = (arg5.am * v2 << 8 | arg5.aj[arg5.ad * 0x22265613] & 0xFF) * 0xAAA1AD6F;
            arg5.az += 0xE45676F8;
            arg5.ad += -1828396005;
            arg5.aq += 0x1A6C33A7;
        }

        int v0 = arg5.am * v2 >> arg5.az * v1 - arg4 & (1 << arg4) - 1;
        arg5.az -= arg4 * 0xDC8ACEDF;
        return v0;
    }

    static byte at(ku arg1) {
        return ((byte)kb.ap(1, arg1));
    }

    static void au(ku arg24) {
        int[] v6_1;
        int[] v7_2;
        int[] v5_1;
        int v15;
        int v18;
        byte v7_1;
        int v20;
        int[] v15_1;
        int v13;
        int v12;
        int v7;
        int v4;
        ku v0 = arg24;
        v0.ag = 0xB02C1CD1;
        if(jh.ak == null) {
            jh.ak = new int[v0.ag * 0x724844A0];
        }

        int v1 = 1;
        while(true) {
            int v2 = 1;
            do {
            label_12:
                if(v2 == 0) {
                    return;
                }

                if(kb.ar(arg24) == 23) {
                    return;
                }

                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.an(arg24);
                byte v2_1 = 0;
                v0.ah = 0;
                int v5 = -1958463005;
                int v6 = 0xFF;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                int v3;
                for(v3 = 0; true; ++v3) {
                    v4 = 16;
                    if(v3 >= v4) {
                        break;
                    }

                    v0.ba[v3] = kb.an(arg24) == v1 ? ((boolean)v1) : false;
                }

                for(v3 = 0; true; ++v3) {
                    v7 = 0x100;
                    if(v3 >= v7) {
                        break;
                    }

                    v0.bd[v3] = false;
                }

                for(v3 = 0; v3 < v4; ++v3) {
                    if(v0.ba[v3]) {
                        int v8;
                        for(v8 = 0; v8 < v4; ++v8) {
                            if(kb.an(arg24) == v1) {
                                v0.bd[v3 * 16 + v8] = ((boolean)v1);
                            }
                        }
                    }
                }

                kb.aj(arg24);
                v8 = -2050313919;
                v3 = v0.ac * v8 + 2;
                int v14 = kb.ap(3, v0);
                int v9 = kb.ap(15, v0);
                int v10;
                for(v10 = 0; v10 < v9; ++v10) {
                    int v11;
                    for(v11 = 0; kb.an(arg24) != 0; ++v11) {
                    }

                    v0.bo[v10] = ((byte)v11);
                }

                byte[] v10_1 = new byte[6];
                byte v11_1;
                for(v11_1 = 0; v11_1 < v14; v11_1 = ((byte)(v11_1 + 1))) {
                    v10_1[v11_1] = v11_1;
                }

                for(v11 = 0; v11 < v9; ++v11) {
                    v12 = v0.bo[v11];
                    byte v16 = v10_1[v12];
                    while(v12 > 0) {
                        v13 = v12 - 1;
                        v10_1[v12] = v10_1[v13];
                        byte v12_1 = ((byte)v13);
                    }

                    v10_1[0] = v16;
                    v0.bw[v11] = v16;
                }

                for(v9 = 0; v9 < v14; ++v9) {
                    v11 = kb.ap(5, v0);
                    for(v10 = 0; v10 < v3; ++v10) {
                        while(kb.an(arg24) != 0) {
                            if(kb.an(arg24) == 0) {
                                ++v11;
                                continue;
                            }

                            --v11;
                        }

                        v0.by[v9][v10] = ((byte)v11);
                    }
                }

                v13 = 0;
                while(v13 < v14) {
                    v9 = 0;
                    v11 = 0;
                    v12 = 0x20;
                    while(v9 < v3) {
                        if(v0.by[v13][v9] > v11) {
                            v11 = v0.by[v13][v9];
                        }

                        if(v0.by[v13][v9] < v12) {
                            v12 = v0.by[v13][v9];
                        }

                        ++v9;
                    }

                    kb.ad(v0.bt[v13], v0.bv[v13], v0.bq[v13], v0.by[v13], v12, v11, v3);
                    v0.bx[v13] = v12;
                    ++v13;
                    v14 = v14;
                }

                v3 = v0.ac * v8 + v1;
                for(v4 = 0; v4 <= v6; ++v4) {
                    v0.aw[v4] = 0;
                }

                v4 = 15;
                for(v8 = 0xFFF; v4 >= 0; v8 = v9) {
                    v9 = v8;
                    for(v8 = 15; v8 >= 0; --v8) {
                        v0.bn[v9] = ((byte)(v4 * 16 + v8));
                        --v9;
                    }

                    v0.bp[v4] = v9 + 1;
                    --v4;
                }

                v4 = v0.bw[0];
                v8 = v0.bx[v4];
                int[] v9_1 = v0.bt[v4];
                int[] v10_2 = v0.bq[v4];
                int[] v4_1 = v0.bv[v4];
                v12 = kb.ap(v8, v0);
                v13 = v8;
                while(v12 > v9_1[v13]) {
                    ++v13;
                    v12 = v12 << 1 | kb.an(arg24);
                    v1 = 1;
                    v2_1 = 0;
                    v5 = -1958463005;
                    v6 = 0xFF;
                    v7 = 0x100;
                }

                v12 = v10_2[v12 - v4_1[v13]];
                v11 = 0;
                v13 = 49;
                v14 = 0;
                while(v12 != v3) {
                    if(v12 == 0 || v12 == v1) {
                        v1 = -1;
                        v2 = 1;
                        while(true) {
                            if(v12 == 0) {
                                v1 += v2;
                            }
                            else if(v12 == 1) {
                                v1 += v2 * 2;
                            }

                            v2 *= 2;
                            if(v13 == 0) {
                                ++v11;
                                v13 = 50;
                                v4 = v0.bw[v11];
                                v5 = v0.bx[v4];
                                v6_1 = v0.bt[v4];
                                v15_1 = v0.bq[v4];
                                v18 = v11;
                                v7_2 = v0.bv[v4];
                            }
                            else {
                                v7_2 = v4_1;
                                v5 = v8;
                                v6_1 = v9_1;
                                v15_1 = v10_2;
                                v18 = v11;
                            }

                            v20 = v13 - 1;
                            v4 = kb.ap(v5, v0);
                            v8 = v5;
                            while(v4 > v6_1[v8]) {
                                ++v8;
                                v4 = v4 << 1 | kb.an(arg24);
                            }

                            v12 = v15_1[v4 - v7_2[v8]];
                            if(v12 != 0 && v12 != 1) {
                                ++v1;
                                v2 = v0.bf[v0.bn[v0.bp[0]] & 0xFF] & 0xFF;
                                v0.aw[v2] += v1;
                                break;
                            }

                            v8 = v5;
                            v9_1 = v6_1;
                            v4_1 = v7_2;
                            v10_2 = v15_1;
                            v11 = v18;
                            v13 = v20;
                        }

                        while(v1 > 0) {
                            jh.ak[v14] = v2;
                            ++v14;
                            --v1;
                        }

                        v8 = v5;
                        v9_1 = v6_1;
                        v4_1 = v7_2;
                        v10_2 = v15_1;
                        v11 = v18;
                        v13 = v20;
                    }
                    else {
                        --v12;
                        if(v12 < 16) {
                            v5 = v0.bp[v2_1];
                            v7_1 = v0.bn[v5 + v12];
                            while(v12 > 3) {
                                int v16_1 = v5 + v12;
                                v18 = v16_1 - 1;
                                v0.bn[v16_1] = v0.bn[v18];
                                int v19 = v16_1 - 2;
                                v0.bn[v18] = v0.bn[v19];
                                v18 = v16_1 - 3;
                                v0.bn[v19] = v0.bn[v18];
                                v0.bn[v18] = v0.bn[v16_1 - 4];
                                v12 += -4;
                            }

                            while(v12 > 0) {
                                v15 = v5 + v12;
                                v0.bn[v15] = v0.bn[v15 - 1];
                                --v12;
                            }

                            v0.bn[v5] = v7_1;
                        }
                        else {
                            v2 = v12 / 16;
                            v5 = v0.bp[v2] + v12 % 16;
                            v7_1 = v0.bn[v5];
                            while(v5 > v0.bp[v2]) {
                                v0.bn[v5] = v0.bn[v5 - 1];
                                --v5;
                            }

                            v0.bp[v2] += v1;
                            while(v2 > 0) {
                                v0.bp[v2] -= v1;
                                v0.bn[v0.bp[v2]] = v0.bn[v0.bp[v2 - 1] + 16 - v1];
                                --v2;
                            }

                            v0.bp[0] -= v1;
                            v0.bn[v0.bp[0]] = v7_1;
                            if(v0.bp[0] != 0) {
                                goto label_487;
                            }

                            v2 = 15;
                            for(v5 = 0xFFF; v2 >= 0; v5 = v6) {
                                v6 = v5;
                                for(v5 = 15; v5 >= 0; --v5) {
                                    v0.bn[v6] = v0.bn[v0.bp[v2] + v5];
                                    --v6;
                                }

                                v0.bp[v2] = v6 + 1;
                                --v2;
                            }
                        }

                    label_487:
                        int[] v1_1 = v0.aw;
                        v6 = v7_1 & 0xFF;
                        v2 = v0.bf[v6] & 0xFF;
                        ++v1_1[v2_1];
                        jh.ak[v14] = v0.bf[v6] & 0xFF;
                        v1 = v14 + 1;
                        if(v13 == 0) {
                            ++v11;
                            v13 = 50;
                            v2 = v0.bw[v11];
                            v4 = v0.bx[v2];
                            v5_1 = v0.bt[v2];
                            v7_2 = v0.bq[v2];
                            v15 = v11;
                            v6_1 = v0.bv[v2];
                            v2 = v4;
                        }
                        else {
                            v6_1 = v4_1;
                            v2 = v8;
                            v5_1 = v9_1;
                            v7_2 = v10_2;
                            v15 = v11;
                        }

                        v18 = v13 - 1;
                        v4 = kb.ap(v2, v0);
                        v8 = v2;
                        while(v4 > v5_1[v8]) {
                            ++v8;
                            v4 = v4 << 1 | kb.an(arg24);
                        }

                        v12 = v7_2[v4 - v6_1[v8]];
                        v14 = v1;
                        v8 = v2;
                        v9_1 = v5_1;
                        v4_1 = v6_1;
                        v10_2 = v7_2;
                        v11 = v15;
                        v13 = v18;
                    }

                    v1 = 1;
                    v2_1 = 0;
                    v5 = -1958463005;
                    v6 = 0xFF;
                    v7 = 0x100;
                }

                v0.au = v2_1;
                v0.aa = v2_1;
                v0.as[v2_1] = v2_1;
                for(v3 = 1; v3 <= v7; ++v3) {
                    v0.as[v3] = v0.aw[v3 - 1];
                }

                for(v3 = 1; v3 <= v7; ++v3) {
                    v0.as[v3] += v0.as[v3 - 1];
                }

                for(v3 = 0; v3 < v14; ++v3) {
                    v4 = (((byte)(jh.ak[v3] & v6))) & v6;
                    jh.ak[v0.as[v4]] |= v3 << 8;
                    v0.as[v4] += v1;
                }

                v0.at = (jh.ak[v0.ah * v5] >> 8) * 0xEAF6E531;
                v0.ao = v2_1;
                v0.at = jh.ak[v0.at * 0x9A2053D1] * 0xEAF6E531;
                v0.ay = (((byte)(v0.at * 0x9A2053D1 & v6))) * 651870737;
                v0.at = (v0.at * 0x9A2053D1 >> 8) * 0xEAF6E531;
                v0.ao += -1722466707;
                v0.bg = v14 * 0xD2D59D8F;
                kb.al(arg24);
                if(v0.ao * 0x81E07B65 != v0.bg * 0xE4BAE16F + v1) {
                    goto label_12;
                }
            }
            while(v0.au * 2038359687 != 0);
        }
    }

    static void av(ku arg24) {
        int[] v6_1;
        int[] v7_2;
        int[] v5_1;
        int v15;
        int v18;
        byte v7_1;
        int v20;
        int[] v15_1;
        int v13;
        int v12;
        int v7;
        int v4;
        ku v0 = arg24;
        v0.ag = 0xB02C1CD1;
        if(jh.ak == null) {
            jh.ak = new int[v0.ag * 0x724844A0];
        }

        int v1 = 1;
        while(true) {
            int v2 = 1;
            do {
            label_12:
                if(v2 == 0) {
                    return;
                }

                if(kb.ar(arg24) == 23) {
                    return;
                }

                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.an(arg24);
                byte v2_1 = 0;
                v0.ah = 0;
                int v5 = -1958463005;
                int v6 = 0xFF;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                int v3;
                for(v3 = 0; true; ++v3) {
                    v4 = 16;
                    if(v3 >= v4) {
                        break;
                    }

                    v0.ba[v3] = kb.an(arg24) == v1 ? ((boolean)v1) : false;
                }

                for(v3 = 0; true; ++v3) {
                    v7 = 0x100;
                    if(v3 >= v7) {
                        break;
                    }

                    v0.bd[v3] = false;
                }

                for(v3 = 0; v3 < v4; ++v3) {
                    if(v0.ba[v3]) {
                        int v8;
                        for(v8 = 0; v8 < v4; ++v8) {
                            if(kb.an(arg24) == v1) {
                                v0.bd[v3 * 16 + v8] = ((boolean)v1);
                            }
                        }
                    }
                }

                kb.aj(arg24);
                v8 = -2050313919;
                v3 = v0.ac * v8 + 2;
                int v14 = kb.ap(3, v0);
                int v9 = kb.ap(15, v0);
                int v10;
                for(v10 = 0; v10 < v9; ++v10) {
                    int v11;
                    for(v11 = 0; kb.an(arg24) != 0; ++v11) {
                    }

                    v0.bo[v10] = ((byte)v11);
                }

                byte[] v10_1 = new byte[6];
                byte v11_1;
                for(v11_1 = 0; v11_1 < v14; v11_1 = ((byte)(v11_1 + 1))) {
                    v10_1[v11_1] = v11_1;
                }

                for(v11 = 0; v11 < v9; ++v11) {
                    v12 = v0.bo[v11];
                    byte v16 = v10_1[v12];
                    while(v12 > 0) {
                        v13 = v12 - 1;
                        v10_1[v12] = v10_1[v13];
                        byte v12_1 = ((byte)v13);
                    }

                    v10_1[0] = v16;
                    v0.bw[v11] = v16;
                }

                for(v9 = 0; v9 < v14; ++v9) {
                    v11 = kb.ap(5, v0);
                    for(v10 = 0; v10 < v3; ++v10) {
                        while(kb.an(arg24) != 0) {
                            if(kb.an(arg24) == 0) {
                                ++v11;
                                continue;
                            }

                            --v11;
                        }

                        v0.by[v9][v10] = ((byte)v11);
                    }
                }

                v13 = 0;
                while(v13 < v14) {
                    v9 = 0;
                    v11 = 0;
                    v12 = 0x20;
                    while(v9 < v3) {
                        if(v0.by[v13][v9] > v11) {
                            v11 = v0.by[v13][v9];
                        }

                        if(v0.by[v13][v9] < v12) {
                            v12 = v0.by[v13][v9];
                        }

                        ++v9;
                    }

                    kb.ad(v0.bt[v13], v0.bv[v13], v0.bq[v13], v0.by[v13], v12, v11, v3);
                    v0.bx[v13] = v12;
                    ++v13;
                    v14 = v14;
                }

                v3 = v0.ac * v8 + v1;
                for(v4 = 0; v4 <= v6; ++v4) {
                    v0.aw[v4] = 0;
                }

                v4 = 15;
                for(v8 = 0xFFF; v4 >= 0; v8 = v9) {
                    v9 = v8;
                    for(v8 = 15; v8 >= 0; --v8) {
                        v0.bn[v9] = ((byte)(v4 * 16 + v8));
                        --v9;
                    }

                    v0.bp[v4] = v9 + 1;
                    --v4;
                }

                v4 = v0.bw[0];
                v8 = v0.bx[v4];
                int[] v9_1 = v0.bt[v4];
                int[] v10_2 = v0.bq[v4];
                int[] v4_1 = v0.bv[v4];
                v12 = kb.ap(v8, v0);
                v13 = v8;
                while(v12 > v9_1[v13]) {
                    ++v13;
                    v12 = v12 << 1 | kb.an(arg24);
                    v1 = 1;
                    v2_1 = 0;
                    v5 = -1958463005;
                    v6 = 0xFF;
                    v7 = 0x100;
                }

                v12 = v10_2[v12 - v4_1[v13]];
                v11 = 0;
                v13 = 49;
                v14 = 0;
                while(v12 != v3) {
                    if(v12 == 0 || v12 == v1) {
                        v1 = -1;
                        v2 = 1;
                        while(true) {
                            if(v12 == 0) {
                                v1 += v2;
                            }
                            else if(v12 == 1) {
                                v1 += v2 * 2;
                            }

                            v2 *= 2;
                            if(v13 == 0) {
                                ++v11;
                                v13 = 50;
                                v4 = v0.bw[v11];
                                v5 = v0.bx[v4];
                                v6_1 = v0.bt[v4];
                                v15_1 = v0.bq[v4];
                                v18 = v11;
                                v7_2 = v0.bv[v4];
                            }
                            else {
                                v7_2 = v4_1;
                                v5 = v8;
                                v6_1 = v9_1;
                                v15_1 = v10_2;
                                v18 = v11;
                            }

                            v20 = v13 - 1;
                            v4 = kb.ap(v5, v0);
                            v8 = v5;
                            while(v4 > v6_1[v8]) {
                                ++v8;
                                v4 = v4 << 1 | kb.an(arg24);
                            }

                            v12 = v15_1[v4 - v7_2[v8]];
                            if(v12 != 0 && v12 != 1) {
                                ++v1;
                                v2 = v0.bf[v0.bn[v0.bp[0]] & 0xFF] & 0xFF;
                                v0.aw[v2] += v1;
                                break;
                            }

                            v8 = v5;
                            v9_1 = v6_1;
                            v4_1 = v7_2;
                            v10_2 = v15_1;
                            v11 = v18;
                            v13 = v20;
                        }

                        while(v1 > 0) {
                            jh.ak[v14] = v2;
                            ++v14;
                            --v1;
                        }

                        v8 = v5;
                        v9_1 = v6_1;
                        v4_1 = v7_2;
                        v10_2 = v15_1;
                        v11 = v18;
                        v13 = v20;
                    }
                    else {
                        --v12;
                        if(v12 < 16) {
                            v5 = v0.bp[v2_1];
                            v7_1 = v0.bn[v5 + v12];
                            while(v12 > 3) {
                                int v16_1 = v5 + v12;
                                v18 = v16_1 - 1;
                                v0.bn[v16_1] = v0.bn[v18];
                                int v19 = v16_1 - 2;
                                v0.bn[v18] = v0.bn[v19];
                                v18 = v16_1 - 3;
                                v0.bn[v19] = v0.bn[v18];
                                v0.bn[v18] = v0.bn[v16_1 - 4];
                                v12 += -4;
                            }

                            while(v12 > 0) {
                                v15 = v5 + v12;
                                v0.bn[v15] = v0.bn[v15 - 1];
                                --v12;
                            }

                            v0.bn[v5] = v7_1;
                        }
                        else {
                            v2 = v12 / 16;
                            v5 = v0.bp[v2] + v12 % 16;
                            v7_1 = v0.bn[v5];
                            while(v5 > v0.bp[v2]) {
                                v0.bn[v5] = v0.bn[v5 - 1];
                                --v5;
                            }

                            v0.bp[v2] += v1;
                            while(v2 > 0) {
                                v0.bp[v2] -= v1;
                                v0.bn[v0.bp[v2]] = v0.bn[v0.bp[v2 - 1] + 16 - v1];
                                --v2;
                            }

                            v0.bp[0] -= v1;
                            v0.bn[v0.bp[0]] = v7_1;
                            if(v0.bp[0] != 0) {
                                goto label_487;
                            }

                            v2 = 15;
                            for(v5 = 0xFFF; v2 >= 0; v5 = v6) {
                                v6 = v5;
                                for(v5 = 15; v5 >= 0; --v5) {
                                    v0.bn[v6] = v0.bn[v0.bp[v2] + v5];
                                    --v6;
                                }

                                v0.bp[v2] = v6 + 1;
                                --v2;
                            }
                        }

                    label_487:
                        int[] v1_1 = v0.aw;
                        v6 = v7_1 & 0xFF;
                        v2 = v0.bf[v6] & 0xFF;
                        ++((int[])v1)[v2_1];
                        jh.ak[v14] = v0.bf[v6] & 0xFF;
                        v1 = v14 + 1;
                        if(v13 == 0) {
                            ++v11;
                            v13 = 50;
                            v2 = v0.bw[v11];
                            v4 = v0.bx[v2];
                            v5_1 = v0.bt[v2];
                            v7_2 = v0.bq[v2];
                            v15 = v11;
                            v6_1 = v0.bv[v2];
                            v2 = v4;
                        }
                        else {
                            v6_1 = v4_1;
                            v2 = v8;
                            v5_1 = v9_1;
                            v7_2 = v10_2;
                            v15 = v11;
                        }

                        v18 = v13 - 1;
                        v4 = kb.ap(v2, v0);
                        v8 = v2;
                        while(v4 > v5_1[v8]) {
                            ++v8;
                            v4 = v4 << 1 | kb.an(arg24);
                        }

                        v12 = v7_2[v4 - v6_1[v8]];
                        v14 = v1;
                        v8 = v2;
                        v9_1 = v5_1;
                        v4_1 = v6_1;
                        v10_2 = v7_2;
                        v11 = v15;
                        v13 = v18;
                    }

                    v1 = 1;
                    v2_1 = 0;
                    v5 = -1958463005;
                    v6 = 0xFF;
                    v7 = 0x100;
                }

                v0.au = v2_1;
                v0.aa = v2_1;
                v0.as[v2_1] = v2_1;
                for(v3 = 1; v3 <= v7; ++v3) {
                    v0.as[v3] = v0.aw[v3 - 1];
                }

                for(v3 = 1; v3 <= v7; ++v3) {
                    v0.as[v3] += v0.as[v3 - 1];
                }

                for(v3 = 0; v3 < v14; ++v3) {
                    v4 = (((byte)(jh.ak[v3] & v6))) & v6;
                    jh.ak[v0.as[v4]] |= v3 << 8;
                    v0.as[v4] += v1;
                }

                v0.at = (jh.ak[v0.ah * v5] >> 8) * 0xEAF6E531;
                v0.ao = v2_1;
                v0.at = jh.ak[v0.at * 0x9A2053D1] * 0xEAF6E531;
                v0.ay = (((byte)(v0.at * 0x9A2053D1 & v6))) * 651870737;
                v0.at = (v0.at * 0x9A2053D1 >> 8) * 0xEAF6E531;
                v0.ao += -1722466707;
                v0.bg = v14 * 0xD2D59D8F;
                kb.al(arg24);
                if(v0.ao * 0x81E07B65 != v0.bg * 0xE4BAE16F + v1) {
                    goto label_12;
                }
            }
            while(v0.au * 2038359687 != 0);
        }
    }

    static byte aw(ku arg1) {
        return ((byte)kb.ap(1, arg1));
    }

    public static int ax(byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        ku v4 = kb.ad;
        __monitor_enter(v4);
        try {
            kb.ad.aj = arg3;
            kb.ad.ad = arg5 * -1828396005;
            kb.ad.ab = arg1;
            kb.ad.af = 0;
            kb.ad.ai = 0x93D9A293 * arg2;
            kb.ad.az = 0;
            kb.ad.am = 0;
            kb.ad.aq = 0;
            kb.ad.av = 0;
            kb.ae(kb.ad);
            arg2 -= kb.ad.ai * 0x7D70CB9B;
            kb.ad.aj = null;
            kb.ad.ab = null;
            __monitor_exit(v4);
            return arg2;
        label_40:
            __monitor_exit(v4);
        }
        catch(Throwable v1) {
            goto label_40;
        }

        throw v1;
    }

    static byte ay(ku arg1) {
        return ((byte)kb.ap(1, arg1));
    }

    static void az(ku arg24) {
        int[] v2_2;
        int[] v7_2;
        int[] v6_1;
        int v15;
        int v18;
        byte v7_1;
        int v20;
        int[] v15_1;
        int[] v5_1;
        int v13;
        int v12;
        int v7;
        int v4;
        ku v0 = arg24;
        v0.ag = 0xB02C1CD1;
        if(jh.ak == null) {
            jh.ak = new int[v0.ag * 0x724844A0];
        }

        int v1 = 1;
        while(true) {
            int v2 = 1;
            do {
            label_12:
                if(v2 == 0) {
                    return;
                }

                if(kb.ar(arg24) == 23) {
                    return;
                }

                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.ar(arg24);
                kb.an(arg24);
                byte v2_1 = 0;
                v0.ah = 0;
                int v5 = -1958463005;
                int v6 = 0xFF;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                v0.ah = (kb.ar(arg24) & v6 | v0.ah * v5 << 8) * 0x1D10D3CB;
                int v3;
                for(v3 = 0; true; ++v3) {
                    v4 = 16;
                    if(v3 >= v4) {
                        break;
                    }

                    v0.ba[v3] = kb.an(arg24) == v1 ? ((boolean)v1) : false;
                }

                for(v3 = 0; true; ++v3) {
                    v7 = 0x100;
                    if(v3 >= v7) {
                        break;
                    }

                    v0.bd[v3] = false;
                }

                for(v3 = 0; v3 < v4; ++v3) {
                    if(v0.ba[v3]) {
                        int v8;
                        for(v8 = 0; v8 < v4; ++v8) {
                            if(kb.an(arg24) == v1) {
                                v0.bd[v3 * 16 + v8] = ((boolean)v1);
                            }
                        }
                    }
                }

                kb.aj(arg24);
                v8 = -2050313919;
                v3 = v0.ac * v8 + 2;
                int v14 = kb.ap(3, v0);
                int v9 = kb.ap(15, v0);
                int v10;
                for(v10 = 0; v10 < v9; ++v10) {
                    int v11;
                    for(v11 = 0; kb.an(arg24) != 0; ++v11) {
                    }

                    v0.bo[v10] = ((byte)v11);
                }

                byte[] v10_1 = new byte[6];
                byte v11_1;
                for(v11_1 = 0; v11_1 < v14; v11_1 = ((byte)(v11_1 + 1))) {
                    v10_1[v11_1] = v11_1;
                }

                for(v11 = 0; v11 < v9; ++v11) {
                    v12 = v0.bo[v11];
                    byte v16 = v10_1[v12];
                    while(v12 > 0) {
                        v13 = v12 - 1;
                        v10_1[v12] = v10_1[v13];
                        byte v12_1 = ((byte)v13);
                    }

                    v10_1[0] = v16;
                    v0.bw[v11] = v16;
                }

                for(v9 = 0; v9 < v14; ++v9) {
                    v11 = kb.ap(5, v0);
                    for(v10 = 0; v10 < v3; ++v10) {
                        while(kb.an(arg24) != 0) {
                            if(kb.an(arg24) == 0) {
                                ++v11;
                                continue;
                            }

                            --v11;
                        }

                        v0.by[v9][v10] = ((byte)v11);
                    }
                }

                v13 = 0;
                while(v13 < v14) {
                    v9 = 0;
                    v11 = 0x20;
                    v12 = 0;
                    while(v9 < v3) {
                        if(v0.by[v13][v9] > v12) {
                            v12 = v0.by[v13][v9];
                        }

                        if(v0.by[v13][v9] < v11) {
                            v11 = v0.by[v13][v9];
                        }

                        ++v9;
                    }

                    kb.ad(v0.bt[v13], v0.bv[v13], v0.bq[v13], v0.by[v13], v11, v12, v3);
                    v0.bx[v13] = v11;
                    ++v13;
                    v14 = v14;
                }

                v3 = v0.ac * v8 + v1;
                for(v4 = 0; v4 <= v6; ++v4) {
                    v0.aw[v4] = 0;
                }

                v4 = 15;
                for(v8 = 0xFFF; v4 >= 0; v8 = v9) {
                    v9 = v8;
                    for(v8 = 15; v8 >= 0; --v8) {
                        v0.bn[v9] = ((byte)(v4 * 16 + v8));
                        --v9;
                    }

                    v0.bp[v4] = v9 + 1;
                    --v4;
                }

                v4 = v0.bw[0];
                v8 = v0.bx[v4];
                int[] v9_1 = v0.bt[v4];
                int[] v10_2 = v0.bq[v4];
                int[] v4_1 = v0.bv[v4];
                v11 = 49;
                v12 = kb.ap(v8, v0);
                v13 = v8;
                while(v12 > v9_1[v13]) {
                    ++v13;
                    v12 = v12 << 1 | kb.an(arg24);
                    v1 = 1;
                    v2_1 = 0;
                    v5 = -1958463005;
                    v6 = 0xFF;
                    v7 = 0x100;
                }

                v12 = v10_2[v12 - v4_1[v13]];
                int[] v13_1 = v10_2;
                v14 = 0;
                v10 = v8;
                int[] v8_1 = v4_1;
                v4 = 0;
                while(v12 != v3) {
                    if(v12 == 0 || v12 == v1) {
                        v1 = -1;
                        v2 = 1;
                        while(true) {
                            if(v12 == 0) {
                                v1 += v2;
                            }
                            else if(v12 == 1) {
                                v1 += v2 * 2;
                            }

                            v2 *= 2;
                            if(v11 == 0) {
                                ++v4;
                                v11 = 50;
                                v5 = v0.bw[v4];
                                v6 = v0.bx[v5];
                                v7_2 = v0.bt[v5];
                                v8_1 = v0.bq[v5];
                                v5_1 = v0.bv[v5];
                                v18 = v4;
                                v15_1 = v8_1;
                            }
                            else {
                                v18 = v4;
                                v5_1 = v8_1;
                                v7_2 = v9_1;
                                v6 = v10;
                                v15_1 = v13_1;
                            }

                            v20 = v11 - 1;
                            v4 = kb.ap(v6, v0);
                            v8 = v6;
                            while(v4 > v7_2[v8]) {
                                ++v8;
                                v4 = v4 << 1 | kb.an(arg24);
                            }

                            v12 = v15_1[v4 - v5_1[v8]];
                            if(v12 != 0 && v12 != 1) {
                                ++v1;
                                v2 = v0.bf[v0.bn[v0.bp[0]] & 0xFF] & 0xFF;
                                v0.aw[v2] += v1;
                                break;
                            }

                            v8_1 = v5_1;
                            v10 = v6;
                            v9_1 = v7_2;
                            v13_1 = v15_1;
                            v4 = v18;
                            v11 = v20;
                        }

                        while(v1 > 0) {
                            jh.ak[v14] = v2;
                            ++v14;
                            --v1;
                        }

                        v8_1 = v5_1;
                        v10 = v6;
                        v9_1 = v7_2;
                        v13_1 = v15_1;
                        v4 = v18;
                        v11 = v20;
                    }
                    else {
                        --v12;
                        if(v12 < 16) {
                            v5 = v0.bp[v2_1];
                            v7_1 = v0.bn[v5 + v12];
                            while(v12 > 3) {
                                int v16_1 = v5 + v12;
                                v18 = v16_1 - 1;
                                v0.bn[v16_1] = v0.bn[v18];
                                int v19 = v16_1 - 2;
                                v0.bn[v18] = v0.bn[v19];
                                v18 = v16_1 - 3;
                                v0.bn[v19] = v0.bn[v18];
                                v0.bn[v18] = v0.bn[v16_1 - 4];
                                v12 += -4;
                            }

                            while(v12 > 0) {
                                v15 = v5 + v12;
                                v0.bn[v15] = v0.bn[v15 - 1];
                                --v12;
                            }

                            v0.bn[v5] = v7_1;
                        }
                        else {
                            v2 = v12 / 16;
                            v5 = v0.bp[v2] + v12 % 16;
                            v7_1 = v0.bn[v5];
                            while(v5 > v0.bp[v2]) {
                                v0.bn[v5] = v0.bn[v5 - 1];
                                --v5;
                            }

                            v0.bp[v2] += v1;
                            while(v2 > 0) {
                                v0.bp[v2] -= v1;
                                v0.bn[v0.bp[v2]] = v0.bn[v0.bp[v2 - 1] + 16 - v1];
                                --v2;
                            }

                            v0.bp[0] -= v1;
                            v0.bn[v0.bp[0]] = v7_1;
                            if(v0.bp[0] != 0) {
                                goto label_489;
                            }

                            v2 = 15;
                            for(v5 = 0xFFF; v2 >= 0; v5 = v6) {
                                v6 = v5;
                                for(v5 = 15; v5 >= 0; --v5) {
                                    v0.bn[v6] = v0.bn[v0.bp[v2] + v5];
                                    --v6;
                                }

                                v0.bp[v2] = v6 + 1;
                                --v2;
                            }
                        }

                    label_489:
                        int[] v1_1 = v0.aw;
                        v6 = v7_1 & 0xFF;
                        v2 = v0.bf[v6] & 0xFF;
                        ++v1_1[v2];
                        jh.ak[v14] = v0.bf[v6] & 0xFF;
                        v1 = v14 + 1;
                        if(v11 == 0) {
                            ++v4;
                            v11 = 50;
                            v2 = v0.bw[v4];
                            v5 = v0.bx[v2];
                            v6_1 = v0.bt[v2];
                            v7_2 = v0.bq[v2];
                            v2_2 = v0.bv[v2];
                            v15 = v4;
                        }
                        else {
                            v15 = v4;
                            v2_2 = v8_1;
                            v6_1 = v9_1;
                            v5 = v10;
                            v7_2 = v13_1;
                        }

                        v18 = v11 - 1;
                        v4 = kb.ap(v5, v0);
                        v8 = v5;
                        while(v4 > v6_1[v8]) {
                            ++v8;
                            v4 = v4 << 1 | kb.an(arg24);
                        }

                        v12 = v7_2[v4 - v2_2[v8]];
                        v14 = v1;
                        v8_1 = v2_2;
                        v10 = v5;
                        v9_1 = v6_1;
                        v13_1 = v7_2;
                        v4 = v15;
                        v11 = v18;
                    }

                    v1 = 1;
                    v2_1 = 0;
                    v5 = -1958463005;
                    v6 = 0xFF;
                    v7 = 0x100;
                }

                v0.au = v2_1;
                v0.aa = v2_1;
                v0.as[v2_1] = v2_1;
                for(v3 = 1; v3 <= v7; ++v3) {
                    v0.as[v3] = v0.aw[v3 - 1];
                }

                for(v3 = 1; v3 <= v7; ++v3) {
                    v0.as[v3] += v0.as[v3 - 1];
                }

                for(v3 = 0; v3 < v14; ++v3) {
                    v4 = (((byte)(jh.ak[v3] & v6))) & v6;
                    jh.ak[v0.as[v4]] |= v3 << 8;
                    v0.as[v4] += v1;
                }

                v0.at = (jh.ak[v0.ah * v5] >> 8) * 0xEAF6E531;
                v0.ao = v2_1;
                v0.at = jh.ak[v0.at * 0x9A2053D1] * 0xEAF6E531;
                v0.ay = (((byte)(v0.at * 0x9A2053D1 & v6))) * 651870737;
                v0.at = (v0.at * 0x9A2053D1 >> 8) * 0xEAF6E531;
                v0.ao += -1722466707;
                v0.bg = v14 * 0xD2D59D8F;
                kb.al(arg24);
                if(v0.ao * 0x81E07B65 != v0.bg * 0xE4BAE16F + v1) {
                    goto label_12;
                }
            }
            while(v0.au * 2038359687 != 0);
        }
    }

    static void ba(ku arg4) {
        int v0 = 0;
        arg4.ac = 0;
        while(v0 < 0x100) {
            if(arg4.bd[v0]) {
                arg4.bf[arg4.ac * -2050313919] = ((byte)v0);
                arg4.ac += -2080710975;
            }

            ++v0;
        }
    }

    static void bd(ku arg4) {
        int v0 = 0;
        arg4.ac = 0;
        while(v0 < 0x59F6059A) {
            if(arg4.bd[v0]) {
                arg4.bf[arg4.ac * -2050313919] = ((byte)v0);
                arg4.ac += 0x1D141856;
            }

            ++v0;
        }
    }

    static void bf(int[] arg5, int[] arg6, int[] arg7, byte[] arg8, int arg9, int arg10, int arg11) {
        int v3;
        int v0 = 0;
        int v1 = arg9;
        int v2;
        for(v2 = 0; v1 <= arg10; v2 = v3) {
            v3 = v2;
            for(v2 = 0; v2 < arg11; ++v2) {
                if(arg8[v2] == v1) {
                    arg7[v3] = v2;
                    ++v3;
                }
            }

            ++v1;
        }

        int v7;
        for(v7 = 0; true; ++v7) {
            v1 = 23;
            if(v7 >= v1) {
                break;
            }

            arg6[v7] = 0;
        }

        for(v7 = 0; v7 < arg11; ++v7) {
            v3 = arg8[v7] + 1;
            ++arg6[v3];
        }

        for(v7 = 1; v7 < v1; ++v7) {
            arg6[v7] += arg6[v7 - 1];
        }

        for(v7 = 0; v7 < v1; ++v7) {
            arg5[v7] = 0;
        }

        for(v7 = arg9; v7 <= arg10; v7 = v8) {
            int v8 = v7 + 1;
            v0 += arg6[v8] - arg6[v7];
            arg5[v7] = v0 - 1;
            v0 <<= 1;
        }

        ++arg9;
        while(arg9 <= arg10) {
            arg6[arg9] = (arg5[arg9 - 1] + 1 << 1) - arg6[arg9];
            ++arg9;
        }
    }

    static void bn(int[] arg5, int[] arg6, int[] arg7, byte[] arg8, int arg9, int arg10, int arg11) {
        int v3;
        int v0 = 0;
        int v1 = arg9;
        int v2;
        for(v2 = 0; v1 <= arg10; v2 = v3) {
            v3 = v2;
            for(v2 = 0; v2 < arg11; ++v2) {
                if(arg8[v2] == v1) {
                    arg7[v3] = v2;
                    ++v3;
                }
            }

            ++v1;
        }

        int v7;
        for(v7 = 0; true; ++v7) {
            v1 = 23;
            if(v7 >= v1) {
                break;
            }

            arg6[v7] = 0;
        }

        for(v7 = 0; v7 < arg11; ++v7) {
            v3 = arg8[v7] + 1;
            ++arg6[v3];
        }

        for(v7 = 1; v7 < v1; ++v7) {
            arg6[v7] += arg6[v7 - 1];
        }

        for(v7 = 0; v7 < v1; ++v7) {
            arg5[v7] = 0;
        }

        for(v7 = arg9; v7 <= arg10; v7 = v8) {
            int v8 = v7 + 1;
            v0 += arg6[v8] - arg6[v7];
            arg5[v7] = v0 - 1;
            v0 <<= 1;
        }

        ++arg9;
        while(arg9 <= arg10) {
            arg6[arg9] = (arg5[arg9 - 1] + 1 << 1) - arg6[arg9];
            ++arg9;
        }
    }

    static void bp(int[] arg5, int[] arg6, int[] arg7, byte[] arg8, int arg9, int arg10, int arg11) {
        int v3;
        int v0 = 0;
        int v1 = arg9;
        int v2;
        for(v2 = 0; v1 <= arg10; v2 = v3) {
            v3 = v2;
            for(v2 = 0; v2 < arg11; ++v2) {
                if(arg8[v2] == v1) {
                    arg7[v3] = v2;
                    ++v3;
                }
            }

            ++v1;
        }

        int v7;
        for(v7 = 0; true; ++v7) {
            v1 = 23;
            if(v7 >= v1) {
                break;
            }

            arg6[v7] = 0;
        }

        for(v7 = 0; v7 < arg11; ++v7) {
            v3 = arg8[v7] + 1;
            ++arg6[v3];
        }

        for(v7 = 1; v7 < v1; ++v7) {
            arg6[v7] += arg6[v7 - 1];
        }

        for(v7 = 0; v7 < v1; ++v7) {
            arg5[v7] = 0;
        }

        for(v7 = arg9; v7 <= arg10; v7 = v8) {
            int v8 = v7 + 1;
            v0 += arg6[v8] - arg6[v7];
            arg5[v7] = v0 - 1;
            v0 <<= 1;
        }

        ++arg9;
        while(arg9 <= arg10) {
            arg6[arg9] = (arg5[arg9 - 1] + 1 << 1) - arg6[arg9];
            ++arg9;
        }
    }
}

