public class fv implements fk {
    static final int bb = 15;
    public static final int by = 40;
    static int lu;

    fv() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fv.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public boolean aa(int arg1, long arg2) {
        return 1;
    }

    public boolean ab(int arg1, int arg2, int arg3, int arg4, long arg5) {
        return 1;
    }

    public boolean ad(char arg1, long arg2) {
        return 1;
    }

    static final void af(int arg38, int arg39, int arg40, int arg41, int arg42, int arg43, bg arg44, gy arg45, int arg46) {
        hj v10_4;
        bm v7_1;
        hj v7_2;
        int v26;
        int v3;
        do v14_1;
        do v12_2;
        bm v8_1;
        hj v8_2;
        gy v12_1;
        int v11;
        do v15_1;
        bm v6;
        hj v6_1;
        int v8;
        int v1;
        int v2;
        int v0 = arg38;
        int v13 = arg39;
        int v14 = arg40;
        int v15 = arg42;
        int v12 = arg43;
        try {
            int v9 = 16;
            int v7 = 2;
            if((client.ab) && (id.al[0][v13][v14] & v7) == 0 && (id.al[v0][v13][v14] & v9) != 0) {
                return;
            }

            if(v0 < id.ae * 0x61C2FDFD) {
                id.ae = 834324309 * v0;
            }

            do v5 = ok.al(arg41, 2119784010);
            int v4 = 3;
            if(1 == v15 || v4 == v15) {
                v4 = v5.ag * 0x4B9D7897;
                v2 = v5.az * 0xB46CA623;
            }
            else {
                v4 = v5.az * 0xB46CA623;
                v2 = v5.ag * 0x4B9D7897;
            }

            if(v4 + v13 <= 104) {
                v1 = (v4 >> 1) + v13;
                v8 = (v4 + 1 >> 1) + v13;
            }
            else {
                v8 = v13 + 1;
                v1 = v13;
            }

            if(v14 + v2 <= 104) {
                v7 = (v2 >> 1) + v14;
                v9 = (v2 + 1 >> 1) + v14;
            }
            else {
                v9 = v14 + 1;
                v7 = v14;
            }

            int[][] v28 = id.ax[v0];
            int v27 = v28[v8][v9] + (v28[v1][v7] + v28[v8][v7] + v28[v1][v9]) >> 2;
            v8 = (v4 << 6) + (v13 << 7);
            v9 = (v14 << 7) + (v2 << 6);
            int v16 = 2;
            boolean v17 = v5.ay * 0xE5018CDF == 0 ? true : false;
            int v29 = v2;
            int v30 = v4;
            do v10 = v5;
            long v32 = gs.aa(arg39, arg40, v16, v17, arg41, 1);
            v1 = (v15 << 6) + v12;
            if(1 == v10.bb * 0x3376F5D7) {
                v1 += 0x100;
            }

            int v24 = v1;
            if(v10.am(0x94D81067)) {
                iu.ar(arg38, arg39, arg40, v10, arg42, 0x1088C59E);
            }

            int v34 = 0xE748B627;
            v2 = -1;
            v16 = 0x804BDF6B;
            if(22 == v12) {
                if(!client.ab || v10.ay * 0xE5018CDF != 0) {
                }
                else if(v10.ah * v34 != 1 && !v10.bz) {
                    return;
                }

                if(v2 != v10.ak * v16 || v10.bc != null) {
                    v15_1 = v10;
                    v11 = 1;
                    v12_1 = arg45;
                    v6_1 = new hj(arg41, 22, arg42, arg38, arg39, arg40, v10.ak * v16, true, null);
                }
                else {
                    v6 = v10.ad(22, arg42, v28, v8, v27, v9, -700180005);
                    v15_1 = v10;
                    v11 = 1;
                    v12_1 = arg45;
                }

                arg44.aj(arg38, arg39, arg40, v27, v6, v32, v24);
                if(v11 == v15_1.ah * v34 && v12_1 != null) {
                    v12_1.an(v13, v14, 0);
                }

                return;
            }

            gy v25 = arg45;
            int v37 = v15;
            v15_1 = v10;
            int v10_1 = v37;
            int v6_2 = 4;
            if(10 != v12) {
                if(11 == v12) {
                }
                else if(v12 >= 12) {
                    if(v15_1.ak * v16 != v2 || v15_1.bc != null) {
                        v8_2 = new hj(arg41, arg43, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                    }
                    else {
                        v8_1 = v15_1.ad(arg43, arg42, v28, v8, v27, v9, -700180005);
                    }

                    do v35 = v15_1;
                    v15 = v12;
                    arg44.af(arg38, arg39, arg40, v27, 1, 1, v8_1, 0, v32, v24);
                    if(v15 >= 12 && v15 <= 17 && 13 != v15 && v0 > 0) {
                        id.au[v0][v13][v14] |= 2340;
                    }

                    v12_2 = v35;
                    if(v12_2.ah * v34 != 0 && v25 != null) {
                        arg45.ae(arg39, arg40, v30, v29, v12_2.at, 0xE4902177);
                    }

                    return;
                }
                else {
                    do v37_1 = v15_1;
                    v15 = v12;
                    v12_2 = v37_1;
                    int v31 = 0x1CEE4599;
                    byte v17_1 = 50;
                    if(v15 == 0) {
                        if(v12_2.ak * v16 != v2 || v12_2.bc != null) {
                            v15 = v10_1;
                            v6_1 = new hj(arg41, 0, arg42, arg38, arg39, arg40, v12_2.ak * v16, true, null);
                        }
                        else {
                            v6 = v12_2.ad(0, arg42, v28, v8, v27, v9, -700180005);
                            v15 = v10_1;
                        }

                        v14_1 = v12_2;
                        arg44.aq(arg38, arg39, arg40, v27, v6, null, id.ah[v15], 0, v32, v24);
                        if(v15 == 0) {
                            if(v14_1.bo) {
                                v12_2 = v14_1;
                                v14 = arg40;
                                nt.ad[v0][v13][v14] = v17_1;
                                nt.ad[v0][v13][v14 + 1] = v17_1;
                            }
                            else {
                                v12_2 = v14_1;
                                v14 = arg40;
                            }

                            if(!v12_2.as) {
                                goto label_459;
                            }

                            id.au[v0][v13][v14] |= 585;
                        }
                        else {
                            v12_2 = v14_1;
                            v14 = arg40;
                            if(1 == v15) {
                                if(v12_2.bo) {
                                    v2 = v14 + 1;
                                    nt.ad[v0][v13][v2] = v17_1;
                                    nt.ad[v0][v13 + 1][v2] = v17_1;
                                }

                                if(!v12_2.as) {
                                    goto label_459;
                                }

                                v2 = v14 + 1;
                                id.au[v0][v13][v2] |= 1170;
                                goto label_459;
                            }

                            if(2 == v15) {
                                if(v12_2.bo) {
                                    v2 = v13 + 1;
                                    nt.ad[v0][v2][v14] = v17_1;
                                    nt.ad[v0][v2][v14 + 1] = v17_1;
                                }

                                if(!v12_2.as) {
                                    goto label_459;
                                }

                                id.au[v0][v13 + 1][v14] |= 585;
                                goto label_459;
                            }

                            if(3 != v15) {
                                goto label_459;
                            }

                            if(v12_2.bo) {
                                nt.ad[v0][v13][v14] = v17_1;
                                nt.ad[v0][v13 + 1][v14] = v17_1;
                            }

                            if(!v12_2.as) {
                                goto label_459;
                            }

                            id.au[v0][v13][v14] |= 1170;
                        }

                    label_459:
                        if(v12_2.ah * v34 != 0 && v25 != null) {
                            arg45.al(arg39, arg40, arg43, arg42, v12_2.at, -55);
                        }

                        if(16 != v12_2.ac * v31) {
                            arg44.az(v0, v13, v14, v12_2.ac * v31);
                        }

                        return;
                    }

                    v4 = v10_1;
                    v3 = v15;
                    if(v3 == 1) {
                        if(v12_2.ak * v16 != v2 || v12_2.bc != null) {
                            v6_1 = new hj(arg41, 1, arg42, arg38, arg39, arg40, v12_2.ak * v16, true, null);
                        }
                        else {
                            v6 = v12_2.ad(1, arg42, v28, v8, v27, v9, -700180005);
                        }

                        v15 = arg42;
                        v14_1 = v12_2;
                        arg44.aq(arg38, arg39, arg40, v27, v6, null, id.at[arg42], 0, v32, v24);
                        if(!v14_1.bo) {
                            v12_2 = v14_1;
                        }
                        else if(v15 == 0) {
                            v12_2 = v14_1;
                            nt.ad[v0][v13][arg40 + 1] = v17_1;
                        }
                        else {
                            v12_2 = v14_1;
                            v14 = arg40;
                            if(v15 == 1) {
                                nt.ad[v0][v13 + 1][v14 + 1] = v17_1;
                            }
                            else if(2 == v15) {
                                nt.ad[v0][v13 + 1][v14] = v17_1;
                            }
                            else if(v15 == 3) {
                                nt.ad[v0][v13][v14] = v17_1;
                            }
                        }

                        if(v12_2.ah * v34 != 0 && v25 != null) {
                            arg45.al(arg39, arg40, arg43, arg42, v12_2.at, -80);
                        }

                        return;
                    }

                    v7 = v3;
                    v15 = v4;
                    if(v7 == 2) {
                        v26 = v15 + 1 & 3;
                        if(v2 != v12_2.ak * v16 || v12_2.bc != null) {
                            v6_1 = new hj(arg41, 2, v15 + 4, arg38, arg39, arg40, v12_2.ak * v16, true, null);
                            v7_2 = new hj(arg41, 2, v26, arg38, arg39, arg40, v12_2.ak * v16, true, null);
                        }
                        else {
                            v6 = v12_2.ad(2, v15 + 4, v28, v8, v27, v9, -700180005);
                            v7_1 = v12_2.ad(2, v26, v28, v8, v27, v9, -700180005);
                        }

                        v14_1 = v12_2;
                        arg44.aq(arg38, arg39, arg40, v27, v6, ((bm)v7_2), id.ah[v15], id.ah[v26], v32, v24);
                        if(!v14_1.as) {
                            v12_2 = v14_1;
                            v14 = arg40;
                        }
                        else if(v15 == 0) {
                            v12_2 = v14_1;
                            v14 = arg40;
                            id.au[v0][v13][((int)v14_1)] |= 585;
                            v2 = v14 + 1;
                            id.au[v0][v13][v2] |= 1170;
                        }
                        else {
                            v12_2 = v14_1;
                            v14 = arg40;
                            if(v15 == 1) {
                                v2 = v14 + 1;
                                id.au[v0][v13][v2] |= 1170;
                                id.au[v0][v13 + 1][v14] |= 585;
                            }
                            else if(2 == v15) {
                                id.au[v0][v13 + 1][v14] |= 585;
                                id.au[v0][v13][v14] |= 1170;
                            }
                            else if(v15 == 3) {
                                id.au[v0][v13][v14] |= 1170;
                                id.au[v0][v13][v14] |= 585;
                            }
                        }

                        if(v12_2.ah * v34 != 0 && v25 != null) {
                            arg45.al(arg39, arg40, arg43, arg42, v12_2.at, -88);
                        }

                        if(v12_2.ac * v31 != 16) {
                            arg44.az(v0, v13, v14, v12_2.ac * v31);
                        }

                        return;
                    }

                    v3 = v7;
                    bg v4_1 = arg44;
                    if(3 == v3) {
                        if(v12_2.ak * v16 != v2 || v12_2.bc != null) {
                            v6_1 = new hj(arg41, 3, arg42, arg38, arg39, arg40, v12_2.ak * v16, true, null);
                        }
                        else {
                            v6 = v12_2.ad(3, arg42, v28, v8, v27, v9, -700180005);
                        }

                        v14_1 = v12_2;
                        arg44.aq(arg38, arg39, arg40, v27, v6, null, id.at[v15], 0, v32, v24);
                        if(!v14_1.bo) {
                            v12_2 = v14_1;
                        }
                        else if(v15 == 0) {
                            v12_2 = v14_1;
                            nt.ad[v0][v13][arg40 + 1] = v17_1;
                        }
                        else {
                            v12_2 = v14_1;
                            v14 = arg40;
                            if(v15 == 1) {
                                nt.ad[v0][v13 + 1][v14 + 1] = v17_1;
                            }
                            else if(v15 == 2) {
                                nt.ad[v0][v13 + 1][v14] = v17_1;
                            }
                            else if(3 == v15) {
                                nt.ad[v0][v13][v14] = v17_1;
                            }
                        }

                        if(v12_2.ah * v34 != 0 && v25 != null) {
                            arg45.al(arg39, arg40, arg43, arg42, v12_2.at, 0);
                        }

                        return;
                    }

                    v1 = 2;
                    v11 = arg43;
                    if(v11 == 9) {
                        if(v2 != v12_2.ak * v16 || v12_2.bc != null) {
                            v8_2 = new hj(arg41, arg43, arg42, arg38, arg39, arg40, v12_2.ak * v16, true, null);
                        }
                        else {
                            v8_1 = v12_2.ad(arg43, arg42, v28, v8, v27, v9, -700180005);
                        }

                        v15_1 = v12_2;
                        arg44.af(arg38, arg39, arg40, v27, 1, 1, v8_1, 0, v32, v24);
                        if(v15_1.ah * v34 != 0 && v25 != null) {
                            arg45.ae(arg39, arg40, v30, v29, v15_1.at, 0xCC0FEB0);
                        }

                        if(v15_1.ac * v31 != 16) {
                            arg44.az(v0, v13, v14, v15_1.ac * v31);
                        }

                        return;
                    }

                    v26 = v15;
                    v15_1 = v12_2;
                    bg v12_3 = arg44;
                    if(v11 == v6_2) {
                        if(v2 != v15_1.ak * v16 || v15_1.bc != null) {
                            v6_1 = new hj(arg41, 4, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                        }
                        else {
                            v6 = v15_1.ad(4, arg42, v28, v8, v27, v9, -700180005);
                        }

                        arg44.ab(arg38, arg39, arg40, v27, v6, null, id.ah[v26], 0, 0, 0, v32, v24);
                        return;
                    }

                    if(v11 == 5) {
                        long v5_1 = v12_3.bd(v0, v13, v14);
                        v11 = 0 != v5_1 ? ok.al(be.av(v5_1), -1484689065).ac * v31 : 16;
                        if(v15_1.ak * v16 != v2 || v15_1.bc != null) {
                            v6_1 = new hj(arg41, 4, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                        }
                        else {
                            v6 = v15_1.ad(4, arg42, v28, v8, v27, v9, -700180005);
                        }

                        arg44.ab(arg38, arg39, arg40, v27, v6, null, id.ah[v26], 0, v11 * id.ay[v26], v11 * id.aw[v26], v32, v24);
                        return;
                    }

                    if(v11 == 6) {
                        long v4_2 = v12_3.bd(v0, v13, v14);
                        v11 = 0 != v4_2 ? ok.al(be.av(v4_2), 0x721D32AE).ac * v31 / v1 : 8;
                        if(v15_1.ak * v16 != v2 || v15_1.bc != null) {
                            v6_1 = new hj(arg41, 4, v26 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                        }
                        else {
                            v6 = v15_1.ad(4, v26 + 4, v28, v8, v27, v9, -700180005);
                        }

                        arg44.ab(arg38, arg39, arg40, v27, v6, null, 0x100, arg42, v11 * id.ao[v26], v11 * id.as[v26], v32, v24);
                        return;
                    }

                    if(7 == v11) {
                        v11 = v26 + 2 & 3;
                        if(v15_1.ak * v16 != v2 || v15_1.bc != null) {
                            v6_1 = new hj(arg41, 4, v11 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                        }
                        else {
                            v6 = v15_1.ad(4, v11 + 4, v28, v8, v27, v9, -700180005);
                        }

                        arg44.ab(arg38, arg39, arg40, v27, v6, null, 0x100, v11, 0, 0, v32, v24);
                        return;
                    }

                    if(v11 == 8) {
                        long v10_2 = v12_3.bd(v0, v13, v14);
                        v11 = 0 != v10_2 ? ok.al(be.av(v10_2), 0xB4A218A3).ac * v31 / v1 : 8;
                        int v25_1 = v26 + 2 & 3;
                        if(v15_1.ak * v16 != v2 || v15_1.bc != null) {
                            v6_1 = new hj(arg41, 4, v26 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                            v7_2 = new hj(arg41, 4, v25_1 + 4, arg38, arg39, arg40, v15_1.ak * v16, true, null);
                        }
                        else {
                            v6 = v15_1.ad(4, v26 + 4, v28, v8, v27, v9, -700180005);
                            v7_1 = v15_1.ad(4, v25_1 + 4, v28, v8, v27, v9, -700180005);
                        }

                        arg44.ab(arg38, arg39, arg40, v27, v6, ((bm)v7_2), 0x100, arg42, v11 * id.ao[v26], v11 * id.as[v26], v32, v24);
                        return;
                    }

                    return;
                }
            }

            v11 = v12;
            if(v2 != v15_1.ak * v16 || v15_1.bc != null) {
                v10_4 = new hj(arg41, 10, arg42, arg38, arg39, arg40, v15_1.ak * v16, true, null);
            }
            else {
                bm v10_3 = v15_1.ad(10, arg42, v28, v8, v27, v9, -700180005);
            }

            if((((bm)v10_4)) != null) {
                v9 = 11 == v11 ? 0x100 : 0;
                bm v14_2 = ((bm)v10_4);
                if(!arg44.af(arg38, arg39, arg40, v27, v30, v29, ((bm)v10_4), v9, v32, v24) || !v15_1.bo) {
                    v4 = v29;
                    v3 = v30;
                }
                else {
                    v1 = 15;
                    if((v14_2 instanceof ca)) {
                        v1 = v14_2.ad() / 4;
                        if(v1 > 30) {
                            v1 = 30;
                        }
                    }

                    v3 = v30;
                    v2 = 0;
                    while(v2 <= v3) {
                        v4 = v29;
                        int v5_2;
                        for(v5_2 = 0; v5_2 <= v4; ++v5_2) {
                            v7 = v13 + v2;
                            v9 = v5_2 + arg40;
                            if(v1 > nt.ad[v0][v7][v9]) {
                                nt.ad[v0][v7][v9] = ((byte)v1);
                            }
                        }

                        ++v2;
                        v29 = v4;
                    }

                    v4 = v29;
                }
            }
            else {
                v4 = v29;
                v3 = v30;
            }

            if(v15_1.ah * v34 != 0 && v25 != null) {
                arg45.ae(arg39, arg40, v3, v4, v15_1.at, 0x7ED9AADC);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("fv.af(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }

    public boolean af(int arg1, int arg2, int arg3, long arg4) {
        return 1;
    }

    public boolean ai(int arg1, int arg2, long arg3) {
        return 1;
    }

    public boolean aj(int arg1, long arg2) {
        return 1;
    }

    public boolean ap(int arg1, long arg2) {
        return 1;
    }

    public boolean aq(int arg1, int arg2, int arg3, int arg4, long arg5) {
        return 1;
    }

    public boolean av(int arg1, long arg2) {
        return 1;
    }

    public boolean ba(int arg1, long arg2) {
        return 1;
    }

    public boolean bb(int arg1, long arg2) {
        return 1;
    }

    public boolean bc(int arg1, long arg2) {
        return 1;
    }

    public boolean bd(int arg1, long arg2) {
        return 1;
    }

    public boolean bf(int arg1, long arg2) {
        return 1;
    }

    public boolean bg(int arg1, int arg2, long arg3) {
        return 1;
    }

    public boolean bh(int arg1, long arg2) {
        return 1;
    }

    public boolean bn(char arg1, long arg2) {
        return 1;
    }

    public boolean bo(int arg1, int arg2, int arg3, int arg4, long arg5) {
        return 1;
    }

    public boolean bp(int arg1, int arg2, int arg3, int arg4, long arg5) {
        return 1;
    }

    public boolean bq(int arg1, int arg2, int arg3, long arg4) {
        return 1;
    }

    public boolean bt(int arg1, int arg2, int arg3, int arg4, long arg5) {
        return 1;
    }

    public boolean bv(int arg1, int arg2, int arg3, long arg4) {
        return 1;
    }

    public boolean bw(int arg1, int arg2, int arg3, int arg4, long arg5) {
        return 1;
    }

    public boolean bx(int arg1, int arg2, long arg3) {
        return 1;
    }

    public boolean by(int arg1, int arg2, int arg3, int arg4, long arg5) {
        return 1;
    }

    public boolean bz(int arg1, long arg2) {
        return 1;
    }
}

