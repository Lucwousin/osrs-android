public class ex implements lh {
    static final ex ae = null;
    static final int aj = 0x20;
    static final ex al = null;
    static final int am = 0x8000;
    final int an;
    public final int ar;
    public static final ex ax = null;
    static long bi = 0;
    static final int ca = 15;
    static final int cy = 21;
    static final int et = 5000;

    static {
        ex.ax = new ex(0, 0);
        ex.al = new ex(1, 1);
        ex.ae = new ex(2, 2);
    }

    ex(int arg2, int arg3) {
        try {
            super();
            this.ar = arg2 * -1177151701;
            this.an = arg3 * -1729513075;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ex.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static String ad(int arg2, int arg3, boolean arg4, byte arg5) {
        int v5 = 2;
        if(arg3 >= v5 && arg3 <= 36) {
            if(arg4) {
                if(arg2 < 0) {
                }
                else {
                    try {
                        int v4 = arg2 / arg3;
                        while(v4 != 0) {
                            v4 /= arg3;
                            ++v5;
                        }

                        char[] v4_1 = new char[v5];
                        v4_1[0] = '+';
                        --v5;
                        while(v5 > 0) {
                            int v0 = arg2 / arg3;
                            arg2 -= v0 * arg3;
                            v4_1[v5] = arg2 >= 10 ? ((char)(arg2 + 87)) : ((char)(arg2 + 0x30));
                            --v5;
                            arg2 = v0;
                        }

                        return new String(v4_1);
                    label_36:
                        return Integer.toString(arg2, arg3);
                    label_38:
                        StringBuilder v4_2 = new StringBuilder();
                        v4_2.append("");
                        v4_2.append(arg3);
                        throw new IllegalArgumentException(v4_2.toString());
                    }
                    catch(RuntimeException v2) {
                        StringBuilder v3 = new StringBuilder();
                        v3.append("ex.ad(");
                        v3.append(')');
                        throw lx.al(((Throwable)v2), v3.toString());
                    }
                }
            }

            goto label_36;
        }

        goto label_38;
    }

    public static ex[] ae() {
        return new ex[]{ex.ax, ex.al, ex.ae};
    }

    public static boolean af(byte arg9) {
        int v9 = 2;
        int v0 = 0xDDB5E297;
        kp v2 = null;
        try {
            if(v9 != kv.an * v0) {
                return 0;
            }

            if(dz.ai == null) {
                dz.ai = kp.ax(kv.ap, kv.aj * 0x8C7DA5F9, kv.ad * 0xFA4F1B45);
                if(dz.ai == null) {
                    return 0;
                }
            }

            if(eo.av == null) {
                eo.av = new gq(kv.ae, kv.al);
            }

            if(!kv.ar.ae(dz.ai, kv.ax, eo.av, 22050, 0x7610BD60)) {
                return 0;
            }

            kv.ar.ar(-1414175074);
            kv.ar.ax(li.aq * 0x1D910743, 747202860);
            kv.ar.ab(dz.ai, kv.af, -25053);
            kv.an = 0;
            dz.ai = v2;
            eo.av = ((gq)v2);
            kv.ap = ((ko)v2);
            return 1;
        }
        catch(RuntimeException v9_1) {
        }
        catch(Exception v9_2) {
            try {
                v9_2.printStackTrace();
                kv.ar.ai(0xE08E62DE);
                kv.an = 0;
                dz.ai = v2;
                eo.av = ((gq)v2);
                kv.ap = ((ko)v2);
            }
            catch(RuntimeException v9_1) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("ex.af(");
                v0_1.append(')');
                throw lx.al(((Throwable)v9_1), v0_1.toString());
            }
        }

        return 0;
    }

    static final void ai(bg arg47, gy[] arg48, byte arg49) {
        int v42;
        int v21;
        int v43;
        int v40;
        int v0_2;
        int v18;
        int v25;
        int v34;
        int v39;
        int v44;
        ds v2_1;
        int v7;
        int v19;
        int v17;
        int v5;
        int v16;
        int v6;
        int v8;
        int v9;
        int v4;
        int v3;
        int v2;
        int v12;
        int v13;
        int v14;
        int v15;
        bg v0 = arg47;
        int v1 = 0;
        while(true) {
        label_3:
            v15 = 4;
            v14 = 2;
            v13 = 104;
            v12 = 1;
            if(v1 >= v15) {
                goto label_37;
            }

            v2 = 0;
            while(true) {
            label_9:
                if(v2 >= v13) {
                    goto label_35;
                }

                v3 = 0;
                while(true) {
                    if(v3 >= v13) {
                        goto label_33;
                    }

                    try {
                        if((id.al[v1][v2][v3] & 1) == 1) {
                            v4 = v14 == (id.al[1][v2][v3] & v14) ? v1 - 1 : v1;
                            if(v4 < 0) {
                                goto label_31;
                            }

                            arg48[v4].ar(v2, v3, 0xBB304FFB);
                        }

                    label_31:
                        ++v3;
                        continue;
                    label_33:
                        ++v2;
                        goto label_9;
                    label_35:
                        ++v1;
                        goto label_3;
                    label_37:
                        id.ak += ((((int)(Math.random() * 5))) - v14) * 0xA64930B;
                        int v23 = 0xCBDF20A3;
                        if(id.ak * v23 < -8) {
                            id.ak = -1394907224;
                        }

                        int v11 = 8;
                        if(id.ak * v23 > v11) {
                            id.ak = 1394907224;
                        }

                        id.ac += ((((int)(Math.random() * 5))) - v14) * 18974807;
                        int v24 = 0xBF2BE367;
                        if(id.ac * v24 < -16) {
                            id.ac = 0xEDE77A90;
                        }

                        if(id.ac * v24 > 16) {
                            id.ac = 0x12188570;
                        }

                        int v10 = 0;
                        while(v10 < v15) {
                            byte[][] v1_1 = nt.ad[v10];
                            v2 = (((int)Math.sqrt(5100))) * 0x300 >> v11;
                            for(v3 = 1; true; ++v3) {
                                v9 = 103;
                                v8 = 3;
                                if(v3 >= v9) {
                                    break;
                                }

                                v4 = 1;
                                while(v4 < v9) {
                                    v6 = v4 + 1;
                                    v16 = v4 - 1;
                                    v5 = id.ax[v10][v6][v3] - id.ax[v10][v16][v3];
                                    v17 = v3 + 1;
                                    v19 = v3 - 1;
                                    v7 = id.ax[v10][v4][v17] - id.ax[v10][v4][v19];
                                    v9 = ((int)Math.sqrt(((double)(v5 * v5 + 0x10000 + v7 * v7))));
                                    id.aq[v4][v3] = ((v7 << 8) / v9 * -50 + ((v5 << 8) / v9 * -50 + 0x10000 / v9 * -10)) / v2 + 0x60 - ((v1_1[v4][v19] >> v14) + ((v1_1[v6][v3] >> v8) + (v1_1[v16][v3] >> v14)) + (v1_1[v4][v17] >> v8) + (v1_1[v4][v3] >> v12));
                                    v4 = v6;
                                    v10 = v10;
                                    v9 = 103;
                                }
                            }

                            int v26 = v10;
                            for(v1 = 0; v1 < v13; ++v1) {
                                id.ab[v1] = 0;
                                ab.af[v1] = 0;
                                ct.ai[v1] = 0;
                                lb.av[v1] = 0;
                                am.aa[v1] = 0;
                            }

                            v11 = -5;
                            while(v11 < 109) {
                                for(v1 = 0; true; ++v1) {
                                    v10 = 0xFF;
                                    if(v1 >= v13) {
                                        break;
                                    }

                                    v2 = v11 + 5;
                                    if(v2 >= 0 && v2 < v13) {
                                        v2 = id.ar[v26][v2][v1] & v10;
                                        if(v2 > 0) {
                                            v2_1 = gy.al(v2 - 1, -488520067);
                                            id.ab[v1] += v2_1.an * 0xC1E1DFCD;
                                            ab.af[v1] += v2_1.ap * 0x2AD638E5;
                                            ct.ai[v1] += v2_1.aj * 0x4F5173CB;
                                            lb.av[v1] += v2_1.ad * 0xD10D8C21;
                                            am.aa[v1] += v12;
                                        }
                                    }

                                    v2 = v11 - 5;
                                    if(v2 >= 0 && v2 < v13) {
                                        v2 = id.ar[v26][v2][v1] & v10;
                                        if(v2 > 0) {
                                            v2_1 = gy.al(v2 - 1, 0xB93A009C);
                                            id.ab[v1] -= v2_1.an * 0xC1E1DFCD;
                                            ab.af[v1] -= v2_1.ap * 0x2AD638E5;
                                            ct.ai[v1] -= v2_1.aj * 0x4F5173CB;
                                            lb.av[v1] -= v2_1.ad * 0xD10D8C21;
                                            am.aa[v1] -= v12;
                                        }
                                    }
                                }

                                if(v11 >= v12 && v11 < 103) {
                                    v1 = 0;
                                    v2 = 0;
                                    v3 = 0;
                                    v4 = 0;
                                    v5 = 0;
                                    v9 = -5;
                                    while(v9 < 109) {
                                        v6 = v9 + 5;
                                        if(v6 >= 0 && v6 < v13) {
                                            v1 += id.ab[v6];
                                            v2 += ab.af[v6];
                                            v3 += ct.ai[v6];
                                            v4 += lb.av[v6];
                                            v5 += am.aa[v6];
                                        }

                                        v6 = v9 - 5;
                                        if(v6 >= 0 && v6 < v13) {
                                            v1 -= id.ab[v6];
                                            v2 -= ab.af[v6];
                                            v3 -= ct.ai[v6];
                                            v4 -= lb.av[v6];
                                            v5 -= am.aa[v6];
                                        }

                                        v7 = v1;
                                        int v29 = v2;
                                        int v31 = v3;
                                        int v28 = v4;
                                        int v30 = v5;
                                        if(v9 < v12 || v9 >= 103) {
                                        label_692:
                                            v39 = v7;
                                            v34 = v9;
                                            v25 = v11;
                                            v44 = v26;
                                        label_697:
                                        }
                                        else {
                                            if((client.ab) && (id.al[0][v11][v9] & v14) == 0 && (id.al[v26][v11][v9] & 16) != 0) {
                                                goto label_692;
                                            }

                                            v5 = v26;
                                            if(v5 < id.ae * 0x61C2FDFD) {
                                                id.ae = 834324309 * v5;
                                            }

                                            v1 = id.ar[v5][v11][v9] & v10;
                                            v2 = id.an[v5][v11][v9] & v10;
                                            if(v1 <= 0) {
                                                if(v2 > 0) {
                                                }
                                                else {
                                                    v44 = v5;
                                                    v39 = v7;
                                                    v34 = v9;
                                                    v25 = v11;
                                                    goto label_697;
                                                }
                                            }

                                            v4 = id.ax[v5][v11][v9];
                                            v16 = v11 + 1;
                                            v3 = id.ax[v5][v16][v9];
                                            v18 = v9 + 1;
                                            v12 = id.ax[v5][v16][v18];
                                            v13 = id.ax[v5][v11][v18];
                                            v6 = id.aq[v11][v9];
                                            v8 = id.aq[v16][v9];
                                            v14 = id.aq[v16][v18];
                                            v15 = id.aq[v11][v18];
                                            if(v1 > 0) {
                                                v10 = v7 * 0x100 / v28;
                                                v39 = v7;
                                                v7 = v29 / v30;
                                                v0_2 = v31 / v30;
                                                v40 = v15;
                                                v16 = fg.ay(v10, v7, v0_2, 0x7D193CD);
                                                v15 = id.ak * v23 + v10;
                                                v10 = 0xFF;
                                                v15 &= v10;
                                                v0_2 += id.ac * v24;
                                                if(v0_2 < 0) {
                                                    v0_2 = 0;
                                                }
                                                else if(v0_2 > v10) {
                                                    v0_2 = 0xFF;
                                                }

                                                v7 = fg.ay(v15, v7, v0_2, 0x7D193CD);
                                                v0_2 = v16;
                                            }
                                            else {
                                                v39 = v7;
                                                v40 = v15;
                                                v0_2 = -1;
                                                v7 = -1;
                                            }

                                            if(v5 > 0) {
                                                v1 = v1 != 0 || id.ap[v5][v11][v9] == 0 ? 1 : 0;
                                                if(v2 > 0 && !dz.al(v2 - 1, 0x237C24C5).ap) {
                                                    v1 = 0;
                                                }

                                                if(v1 == 0) {
                                                    goto label_471;
                                                }

                                                if(v3 != v4) {
                                                    goto label_471;
                                                }

                                                if(v12 != v4) {
                                                    goto label_471;
                                                }

                                                if(v4 != v13) {
                                                    goto label_471;
                                                }

                                                id.au[v5][v11][v9] |= 2340;
                                            }

                                        label_471:
                                            int v20 = v7 != -1 ? bt.aa[cz.ah(v7, 0x60, 0x8BB08E7B)] : 0xFF000000;
                                            if(v2 == 0) {
                                                v34 = v9;
                                                v25 = v11;
                                                arg47.ap(v5, v11, v9, 0, 0, -1, v4, v3, v12, v13, cz.ah(v0_2, v6, 0x8ADB774F), cz.ah(v0_2, v8, 0x81D243FA), cz.ah(v0_2, v14, -1890002140), cz.ah(v0_2, v40, 0x80E34F70), 0, 0, 0, 0, v20, 0xFF000000);
                                                v44 = v5;
                                                goto label_697;
                                            }

                                            int v37 = v3;
                                            v34 = v9;
                                            v25 = v11;
                                            v1 = v40;
                                            v40 = v4;
                                            v15 = v5;
                                            v5 = id.ap[v15][v25][v34] + 1;
                                            v7 = id.aj[v15][v25][v34];
                                            ek v2_2 = dz.al(v2 - 1, 0x3605AB41);
                                            v4 = v2_2.an * 0x226A2F5D;
                                            if(v4 >= 0) {
                                                v3 = ii.au.ar(v4, 0xC7A10943);
                                                v43 = v4;
                                                v10 = -1;
                                            }
                                            else if(v2_2.ar * 0x670C51A7 == 0xFF00FF) {
                                                v10 = -2;
                                                v3 = -2;
                                                v43 = -1;
                                            }
                                            else {
                                                v10 = fg.ay(v2_2.ad * 0x4430E1EF, v2_2.aq * -2044927721, v2_2.ab * 0x703C4331, 0x7D193CD);
                                                v3 = id.ak * v23 + v2_2.ad * 0x4430E1EF & 0xFF;
                                                v9 = id.ac * v24 + v2_2.ab * 0x703C4331;
                                                if(v9 < 0) {
                                                    v9 = 0;
                                                }
                                                else if(v9 > 0xFF) {
                                                    v9 = 0xFF;
                                                }

                                                v43 = v4;
                                                v3 = fg.ay(v3, v2_2.aq * -2044927721, v9, 0x7D193CD);
                                            }

                                            v4 = 0xFF000000;
                                            if(-2 != v3) {
                                                v4 = bt.aa[ap.at(v3, 0x60, 3)];
                                            }
                                            else {
                                            }

                                            if(v2_2.aj * 0x7EE2C7F5 != -1) {
                                                v4 = v2_2.af * 0x5F881F7 + id.ak * v23 & 0xFF;
                                                v3 = id.ac * v24 + v2_2.av * 0x6FD1F55B;
                                                if(v3 < 0) {
                                                    v3 = 0;
                                                }
                                                else if(v3 > 0xFF) {
                                                    v3 = 0xFF;
                                                }

                                                v21 = bt.aa[ap.at(fg.ay(v4, v2_2.ai * 0x71D04F8F, v3, 0x7D193CD), 0x60, 3)];
                                            }
                                            else {
                                                v21 = v4;
                                            }

                                            v44 = v15;
                                            arg47.ap(v15, v25, v34, v5, v7, v43, v40, v37, v12, v13, cz.ah(v0_2, v6, 0x89F75D94), cz.ah(v0_2, v8, -2014965409), cz.ah(v0_2, v14, 0x8CB0AB16), cz.ah(v0_2, v1, -2071460897), ap.at(v10, v6, 3), ap.at(v10, v8, 3), ap.at(v10, v14, 3), ap.at(v10, v1, 3), v20, v21);
                                        }

                                        v9 = v34 + 1;
                                        v11 = v25;
                                        v4 = v28;
                                        v2 = v29;
                                        v5 = v30;
                                        v3 = v31;
                                        v1 = v39;
                                        v26 = v44;
                                        v10 = 0xFF;
                                        v12 = 1;
                                        v13 = 104;
                                        v14 = 2;
                                    }
                                }

                                ++v11;
                                v26 = v26;
                                v12 = 1;
                                v13 = 104;
                                v14 = 2;
                            }

                            v44 = v26;
                            v0_2 = 1;
                            v1 = 103;
                            while(v0_2 < v1) {
                                v2 = 1;
                                while(v2 < v1) {
                                    arg47.an(v44, v2, v0_2, gy.av(v44, v2, v0_2, 0x267AEF89));
                                    ++v2;
                                    v44 = v44;
                                }

                                ++v0_2;
                            }

                            id.ar[v44] = null;
                            id.an[v44] = null;
                            id.ap[v44] = null;
                            id.aj[v44] = null;
                            nt.ad[v44] = null;
                            v10 = v44 + 1;
                            v0 = arg47;
                            v11 = 8;
                            v12 = 1;
                            v13 = 104;
                            v14 = 2;
                            v15 = 4;
                        }

                        bg v5_1 = v0;
                        v5_1.bw(-50, -10, -50);
                        v0_2 = 0;
                        v1 = 104;
                        while(v0_2 < v1) {
                            for(v2 = 0; v2 < v1; ++v2) {
                                if((id.al[1][v0_2][v2] & 2) == 2) {
                                    v5_1.ae(v0_2, v2);
                                }
                            }

                            ++v0_2;
                        }

                        v4 = 2;
                        v0_2 = 0;
                        v2 = 1;
                        v3 = 4;
                        v42 = 4;
                        while(true) {
                        label_801:
                            if(v0_2 >= v3) {
                                return;
                            }

                            if(v0_2 > 0) {
                                v13 = v4 << 3;
                                v4 = v2 << 3;
                                v2 = v42 << 3;
                            }
                            else {
                                v13 = v4;
                                v4 = v2;
                                v2 = v42;
                            }

                            v14 = 0;
                            while(true) {
                            label_814:
                                if(v14 > v0_2) {
                                    goto label_1167;
                                }

                                v15 = 0;
                                while(true) {
                                label_816:
                                    if(v15 > v1) {
                                        goto label_1160;
                                    }

                                    v12 = 0;
                                    while(true) {
                                    label_818:
                                        if(v12 > v1) {
                                            goto label_1153;
                                        }

                                        if((id.au[v14][v12][v15] & v4) != 0) {
                                            for(v11 = v15; v11 > 0; --v11) {
                                                if((id.au[v14][v12][v11 - 1] & v4) == 0) {
                                                    break;
                                                }
                                            }

                                            for(v10 = v15; v10 < v1; v10 = v6) {
                                                v6 = v10 + 1;
                                                if((id.au[v14][v12][v6] & v4) == 0) {
                                                    break;
                                                }
                                            }

                                            for(v16 = v14; v16 > 0; --v16) {
                                                v5 = v11;
                                                while(true) {
                                                    if(v5 > v10) {
                                                        break;
                                                    }
                                                    else if((id.au[v16 - 1][v12][v5] & v4) == 0) {
                                                    }
                                                    else {
                                                        ++v5;
                                                        continue;
                                                    }

                                                    break;
                                                }
                                            }

                                            for(v9 = v14; v9 < v0_2; ++v9) {
                                                v5 = v11;
                                                while(true) {
                                                    if(v5 > v10) {
                                                        break;
                                                    }
                                                    else if((id.au[v9 + 1][v12][v5] & v4) == 0) {
                                                    }
                                                    else {
                                                        ++v5;
                                                        continue;
                                                    }

                                                    break;
                                                }
                                            }

                                            if((v9 + 1 - v16) * (v10 - v11 + 1) < 8) {
                                                goto label_930;
                                            }

                                            v7 = id.ax[v9][v12][v11] - 0xF0;
                                            v17 = id.ax[v16][v12][v11];
                                            v18 = v12 * 0x80;
                                            v19 = v7;
                                            v7 = v18;
                                            v8 = v18;
                                            v1 = v9;
                                            v9 = v11 * 0x80;
                                            v3 = v10;
                                            v18 = v11;
                                            v11 = v19;
                                            v19 = v12;
                                            bg.ar(v0_2, 1, v7, v8, v9, v10 * 0x80 + 0x80, v11, v17);
                                            for(v5 = v16; v5 <= v1; ++v5) {
                                                for(v6 = v18; v6 <= v3; ++v6) {
                                                    id.au[v5][v19][v6] &= ~v4;
                                                }
                                            }
                                        }
                                        else {
                                        label_930:
                                            v19 = v12;
                                        }

                                        if((id.au[v14][v19][v15] & v13) != 0) {
                                            for(v1 = v19; v1 > 0; --v1) {
                                                if((id.au[v14][v1 - 1][v15] & v13) == 0) {
                                                    break;
                                                }
                                            }

                                            for(v3 = v19; v3 < 104; v3 = v6) {
                                                v6 = v3 + 1;
                                                if((id.au[v14][v6][v15] & v13) == 0) {
                                                    break;
                                                }
                                            }

                                            for(v16 = v14; v16 > 0; --v16) {
                                                v5 = v1;
                                                while(true) {
                                                    if(v5 > v3) {
                                                        break;
                                                    }
                                                    else if((id.au[v16 - 1][v5][v15] & v13) == 0) {
                                                    }
                                                    else {
                                                        ++v5;
                                                        continue;
                                                    }

                                                    break;
                                                }
                                            }

                                            for(v12 = v14; v12 < v0_2; ++v12) {
                                                v5 = v1;
                                                while(true) {
                                                    if(v5 > v3) {
                                                        break;
                                                    }
                                                    else if((id.au[v12 + 1][v5][v15] & v13) == 0) {
                                                    }
                                                    else {
                                                        ++v5;
                                                        continue;
                                                    }

                                                    break;
                                                }
                                            }

                                            if((v12 + 1 - v16) * (v3 - v1 + 1) < 8) {
                                                goto label_1038;
                                            }

                                            v10 = id.ax[v12][v1][v15] - 0xF0;
                                            v17 = id.ax[v16][v1][v15];
                                            v7 = v1 * 0x80;
                                            v9 = v15 * 0x80;
                                            int v45 = v1;
                                            v1 = v12;
                                            bg.ar(v0_2, 2, v7, v3 * 0x80 + 0x80, v9, v9, v10, v17);
                                            for(v5 = v16; v5 <= v1; ++v5) {
                                                for(v6 = v45; v6 <= v3; ++v6) {
                                                    id.au[v5][v6][v15] &= ~v13;
                                                }
                                            }
                                        }
                                        else {
                                        label_1038:
                                        }

                                        if((id.au[v14][v19][v15] & v2) != 0) {
                                            for(v1 = v15; v1 > 0; --v1) {
                                                if((id.au[v14][v19][v1 - 1] & v2) == 0) {
                                                    break;
                                                }
                                            }

                                            for(v3 = v15; v3 < 104; v3 = v6) {
                                                v6 = v3 + 1;
                                                if((id.au[v14][v19][v6] & v2) == 0) {
                                                    break;
                                                }
                                            }

                                            for(v12 = v19; v12 > 0; --v12) {
                                                v5 = v1;
                                                while(true) {
                                                    if(v5 > v3) {
                                                        break;
                                                    }
                                                    else if((id.au[v14][v12 - 1][v5] & v2) == 0) {
                                                    }
                                                    else {
                                                        ++v5;
                                                        continue;
                                                    }

                                                    break;
                                                }
                                            }

                                            v11 = v19;
                                            v10 = 104;
                                            while(v11 < v10) {
                                                v5 = v1;
                                                while(true) {
                                                    if(v5 > v3) {
                                                        break;
                                                    }
                                                    else if((id.au[v14][v11 + 1][v5] & v2) == 0) {
                                                    }
                                                    else {
                                                        ++v5;
                                                        continue;
                                                    }

                                                    goto label_1101;
                                                }

                                                ++v11;
                                            }

                                        label_1101:
                                            if((v3 - v1 + 1) * (v11 - v12 + 1) < 4) {
                                                goto label_1149;
                                            }

                                            bg.ar(v0_2, 4, v12 * 0x80, v11 * 0x80 + 0x80, v1 * 0x80, v3 * 0x80 + 0x80, id.ax[v14][v12][v1], id.ax[v14][v12][v1]);
                                            v5 = v12;
                                            v11 = v11;
                                            while(true) {
                                            label_1133:
                                                if(v5 > v11) {
                                                    goto label_1149;
                                                }

                                                for(v6 = v1; true; ++v6) {
                                                    if(v6 > v3) {
                                                        goto label_1145;
                                                    }

                                                    id.au[v14][v5][v6] &= ~v2;
                                                }
                                            }
                                        }

                                        goto label_1149;
                                    }
                                }
                            }
                        }
                    }
                    catch(RuntimeException v0_1) {
                        goto label_1180;
                    }
                }
            }
        }

    label_1145:
        ++v5;
        goto label_1133;
    label_1149:
        v12 = v19 + 1;
        v1 = 104;
        goto label_818;
    label_1153:
        ++v15;
        v1 = 104;
        goto label_816;
    label_1160:
        ++v14;
        v1 = 104;
        goto label_814;
    label_1167:
        ++v0_2;
        v42 = v2;
        v2 = v4;
        v4 = v13;
        v1 = 104;
        v3 = 4;
        goto label_801;
        return;
    label_1180:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ex.ai(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0_1), v1_2.toString());
    }

    public static ex[] an() {
        return new ex[]{ex.ax, ex.al, ex.ae};
    }

    public static ex[] ap() {
        return new ex[]{ex.ax, ex.al, ex.ae};
    }

    static int ar(lo arg2, int arg3) {
        int v2_1;
        arg3 = 0xAC1026F2;
        int v0 = 2;
        try {
            arg3 = arg2.jo(v0, arg3);
            if(arg3 == 0) {
                v2_1 = 0;
            }
            else if(arg3 == 1) {
                v2_1 = arg2.jo(5, -1300624945);
            }
            else if(arg3 == v0) {
                v2_1 = arg2.jo(8, -2103368533);
            }
            else {
                v2_1 = arg2.jo(11, 0x8C7DCF9A);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ex.ar(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return v2_1;
    }

    public int ar() {
        return this.an * 0x4AB13145;
    }

    public int ax(int arg3) {
        try {
            return this.an * 0x4AB13145;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ex.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static final String ff(int arg3, int arg4) {
        try {
            String v3_1 = Integer.toString(arg3);
            for(arg4 = v3_1.length() - 3; arg4 > 0; arg4 += -3) {
                v3_1 = v3_1.substring(0, arg4) + jc.al + v3_1.substring(arg4);
            }

            if(v3_1.length() > 9) {
                return " " + im.al(0xFF80, 1404750632) + v3_1.substring(0, v3_1.length() - 8) + gs.gp + " " + jc.ar + v3_1 + jc.an + jc.ad;
            }

            if(v3_1.length() > 6) {
                return " " + im.al(0xFFFFFF, 0x5CF7C6E6) + v3_1.substring(0, v3_1.length() - 4) + gs.gv + " " + jc.ar + v3_1 + jc.an + jc.ad;
            }

            return " " + im.al(0xFFFF00, 0xE037ABF) + v3_1 + jc.ad;
        }
        catch(RuntimeException v3) {
            v4 = new StringBuilder();
            v4.append("ex.ff(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

