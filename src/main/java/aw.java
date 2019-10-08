public class aw extends bi {
    public static final int ar = 1400;
    public static final int bm = 46;
    static es[] er = null;
    static final int ol = 0x6030;

    aw(bj arg3) {
        try {
            super(((bt)arg3));
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("aw.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void aa(ca arg32, int arg33) {
        int v9;
        int v8;
        int v6;
        aw v0 = this;
        ca v1 = arg32;
        int v2 = arg33;
        if(v0.au[v2]) {
            v0.ap(v1, v2, -680708906);
            return;
        }

        int v3 = v1.ab[v2];
        int v4 = v1.af[v2];
        int v5 = v1.ai[v2];
        v0.bo.ac = v0.aa[v2];
        v0.bo.bn = v1.az == null ? 0 : (v1.az[v2] & 0xFCCFE83D) * 561689970;
        int v7 = -1;
        if(v1.ah == null || v1.ah[v2] == v7) {
            if(v1.au[v2] == v7) {
                v0.bo.aj(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], aw.aq[v1.av[v2]], 0xE5866DCE);
                return;
            }

            v0.bo.an(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], v1.av[v2], v1.aa[v2], v1.au[v2], 86805035);
        }
        else {
            if(v1.ag == null || v1.ag[v2] == v7) {
                v8 = v3;
                v9 = v4;
                v6 = v5;
            }
            else {
                v6 = v1.ag[v2] & 0xDD37F7ED;
                v8 = v1.aw[v6];
                v9 = v1.ao[v6];
                v6 = v1.as[v6];
            }

            if(v7 == v1.au[v2]) {
                v0.bo.aq(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], v1.av[v2], v1.av[v2], v1.av[v2], v0.ah[v8], v0.ah[v9], v0.ah[v6], v0.at[v8], v0.at[v9], v0.at[v6], v0.ay[v8], v0.ay[v9], v0.ay[v6], v1.ah[v2], 0);
                return;
            }

            v0.bo.aq(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], v1.av[v2], v1.aa[v2], v1.au[v2], v0.ah[v8], v0.ah[v9], v0.ah[v6], v0.at[v8], v0.at[v9], v0.at[v6], v0.ay[v8], v0.ay[v9], v0.ay[v6], v1.ah[v2], 0);
        }
    }

    public final void ab(ca arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v18;
        aw v0 = this;
        ca v1 = arg24;
        int v8 = 0;
        v0.ao[0] = -1;
        if(2 != v1.bt && v1.bt != 1) {
            arg24.aj();
        }

        int v7 = v0.bo.bw * 1126407459;
        int v9 = v0.bo.bo * 0x4706E558;
        int v10 = aw.aj[arg25];
        int v11 = aw.ad[arg25];
        int v12 = aw.aj[arg26];
        int v13 = aw.ad[arg26];
        int v14 = aw.aj[arg27];
        int v15 = aw.ad[arg27];
        int v16 = aw.aj[arg28];
        int v5 = aw.ad[arg28];
        int v17 = v16 * arg30 + arg31 * v5 >> 16;
        int v19 = v9;
        while(v8 < v1.an) {
            v9 = v1.ap[v8];
            int v20 = v7;
            v7 = v1.aj[v8];
            int v6 = v1.ad[v8];
            if(arg27 != 0) {
                v18 = v9 * v15 + v7 * v14 >> 16;
                v7 = v7 * v15 - v9 * v14 >> 16;
                v9 = v18;
            }

            if(arg25 != 0) {
                v18 = v7 * v11 - v10 * v6 >> 16;
                v6 = v7 * v10 + v6 * v11 >> 16;
                v7 = v18;
            }

            if(arg26 != 0) {
                v18 = v12 * v6 + v13 * v9 >> 16;
                v6 = v6 * v13 - v9 * v12 >> 16;
                v9 = v18;
            }

            v9 += arg29;
            v7 += arg30;
            v18 = v6 + arg31;
            int v21 = v5 * v7 - v16 * v18 >> 16;
            v7 = v18 * v5 + v7 * v16 >> 16;
            v0.ag[v8] = v7 - v17;
            v0.am[v8] = v0.bo.bp * 574766503 * v9 / arg32 + v20;
            v0.az[v8] = v19 + v0.bo.bp * -400339637 * v21 / arg32;
            if(v1.ay > 0) {
                v0.ah[v8] = v9;
                v0.at[v8] = v21;
                v0.ay[v8] = v7;
            }

            ++v8;
            v7 = v20;
        }

        aw v25 = this;
        ca v26 = arg24;
        long v29 = 0;
        try {
            v25.ar(v26, false, false, v29);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public final void ad(ca arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30) {
        int v17;
        aw v0 = this;
        ca v1 = arg23;
        int v7 = 0;
        v0.ao[0] = -1;
        if(v1.bt != 2 && 1 != v1.bt) {
            arg23.aj();
        }

        int v6 = v0.bo.bw * 1126407459;
        int v9 = v0.bo.bo * 0xF7F729AF;
        int v8 = aw.aj[arg24];
        int v10 = aw.ad[arg24];
        int v11 = aw.aj[arg25];
        int v12 = aw.ad[arg25];
        int v13 = aw.aj[arg26];
        int v14 = aw.ad[arg26];
        int v15 = aw.aj[arg27];
        int v5 = aw.ad[arg27];
        int v16 = arg30 * v5 + v15 * arg29 >> 16;
        int v18 = v9;
        while(v7 < v1.an) {
            v9 = v1.ap[v7];
            int v19 = v6;
            v6 = v1.aj[v7];
            int v0_1 = v1.ad[v7];
            if(arg26 != 0) {
                v17 = v9 * v14 + v6 * v13 >> 16;
                v6 = v6 * v14 - v9 * v13 >> 16;
                v9 = v17;
            }

            if(arg24 != 0) {
                v17 = v10 * v6 - v0_1 * v8 >> 16;
                v0_1 = v0_1 * v10 + v6 * v8 >> 16;
                v6 = v17;
            }

            if(arg25 != 0) {
                v17 = v0_1 * v11 + v12 * v9 >> 16;
                v0_1 = v0_1 * v12 - v9 * v11 >> 16;
                v9 = v17;
            }

            v9 += arg28;
            v6 += arg29;
            v17 = v0_1 + arg30;
            int v20 = v5 * v6 - v17 * v15 >> 16;
            v6 = v17 * v5 + v6 * v15 >> 16;
            v0 = this;
            v0.ag[v7] = v6 - v16;
            ((aw)v0_1).am[v7] = v19 + ((aw)v0_1).bo.bp * 574766503 * v9 / v6;
            ((aw)v0_1).az[v7] = ((aw)v0_1).bo.bp * 574766503 * v20 / v6 + v18;
            if(v1.ay > 0) {
                v0.ah[v7] = v9;
                v0.at[v7] = v20;
                v0.ay[v7] = v6;
            }

            ++v7;
            v6 = v19;
        }

        aw v24 = this;
        ca v25 = arg23;
        long v28 = 0;
        try {
            v24.ar(v25, false, false, v28);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public void ae(bm arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, long arg34) {
        boolean v1_1;
        int v19_1;
        int v11;
        int v6;
        boolean v14;
        ca v13;
        aw v7 = this;
        int v0 = arg26;
        try {
            v13 = arg25.as();
            if(v13 == null) {
                return;
            }

            v14 = false;
            v7.ao[0] = -1;
            if(v13.bt != 1) {
                v13.ap();
            }

            v13.an(v0);
            int v1 = arg30 * arg33 - arg29 * arg31 >> 16;
            int v5 = arg27 * arg32 + v1 * arg28 >> 16;
            int v2 = v13.bq * arg28 >> 16;
            int v3 = v2 + v5;
            if(v3 > 50) {
                if(v5 >= 3500) {
                }
                else {
                    v6 = arg29 * arg33 + arg30 * arg31 >> 16;
                    int v16 = 574766503;
                    int v4 = (v6 - v13.bq) * (v7.bo.bp * v16);
                    if(v4 / v3 >= v7.bo.bq * 0x36E3B7F) {
                        return;
                    }
                    else {
                        int v8 = (v13.bq + v6) * (v7.bo.bp * v16);
                        if(v8 / v3 <= v7.bo.bv * 0x4B37418D) {
                            return;
                        }
                        else {
                            v1 = arg28 * arg32 - v1 * arg27 >> 16;
                            int v9 = v13.bq * arg27 >> 16;
                            int v12 = v7.bo.bp * v16 * (v9 + v1);
                            if(v12 / v3 <= v7.bo.bx * 0xB31C2AE1) {
                                return;
                            }
                            else {
                                v9 = v7.bo.bp * v16 * (v1 - ((v13.bh * 0xCD6CEDE3 * arg28 >> 16) + v9));
                                if(v9 / v3 >= v7.bo.bg * 0x560C1795) {
                                    return;
                                }
                                else {
                                    v11 = 50;
                                    int v10 = v5 - ((v13.bh * 0xCD6CEDE3 * arg27 >> 16) + v2) <= v11 ? 1 : 0;
                                    v10 = v10 != 0 || v13.ay > 0 ? 1 : 0;
                                    int v17 = jb.ah(94);
                                    int v18 = eu.at(60);
                                    boolean v19 = bf.az(58);
                                    int v21 = 0xF7F729AF;
                                    int v22 = 1126407459;
                                    if(!aq.ae(arg34) || !v19) {
                                        v19_1 = v5;
                                    label_182:
                                        v1_1 = false;
                                    }
                                    else {
                                        if(bc.ax) {
                                            v19_1 = v5;
                                            v1_1 = ew.aw(v13, arg31, arg32, arg33, this, -27);
                                        }
                                        else {
                                            v19_1 = v5;
                                            v2 = v19_1 - v2;
                                            if(v2 <= v11) {
                                                v2 = 50;
                                            }

                                            if(v6 > 0) {
                                                v4 /= v3;
                                                v8 /= v2;
                                            }
                                            else {
                                                v8 /= v3;
                                                v4 /= v2;
                                            }

                                            if(v1 > 0) {
                                                v9 /= v3;
                                                v12 /= v2;
                                            }
                                            else {
                                                v12 /= v3;
                                                v9 /= v2;
                                            }

                                            v1 = v17 - v7.bo.bw * v22;
                                            v2 = v18 - v7.bo.bo * v21;
                                            if(v1 > v4 && v1 < v8 && v2 > v9 && v2 < v12) {
                                                v1_1 = true;
                                                goto label_173;
                                            }

                                            v1_1 = false;
                                        }

                                    label_173:
                                        if(!v1_1) {
                                            goto label_182;
                                        }

                                        if(v13.bf) {
                                            lt.am(arg34);
                                            goto label_182;
                                        }

                                        v1_1 = true;
                                    }

                                    v2 = v7.bo.bw * v22;
                                    v3 = v7.bo.bo * v21;
                                    if(v0 != 0) {
                                        v4 = aw.aj[v0];
                                        v5 = aw.ad[v0];
                                    }
                                    else {
                                        v4 = 0;
                                        v5 = 0;
                                    }

                                    v6 = 0;
                                    while(true) {
                                    label_198:
                                        if(v6 >= v13.an) {
                                            goto label_271;
                                        }

                                        v8 = v13.ap[v6];
                                        v9 = v13.aj[v6];
                                        v12 = v13.ad[v6];
                                        if(v0 != 0) {
                                            v17 = v12 * v4 + v5 * v8 >> 16;
                                            v12 = v12 * v5 - v8 * v4 >> 16;
                                        }
                                        else {
                                            v17 = v8;
                                        }

                                        v17 += arg31;
                                        v9 += arg32;
                                        v12 += arg33;
                                        v22 = v17 * arg30 + arg29 * v12 >> 16;
                                        v12 = v12 * arg30 - v17 * arg29 >> 16;
                                        v17 = v9 * arg28 - v12 * arg27 >> 16;
                                        v9 = v9 * arg27 + v12 * arg28 >> 16;
                                        v7.ag[v6] = v9 - v19_1;
                                        if(v9 >= v11) {
                                            v7.am[v6] = v7.bo.bp * v16 * v22 / v9 + v2;
                                            v7.az[v6] = v7.bo.bp * v16 * v17 / v9 + v3;
                                        }
                                        else {
                                            v7.am[v6] = -5000;
                                            v14 = true;
                                        }

                                        if(v10 != 0) {
                                            v7.ah[v6] = v22;
                                            v7.at[v6] = v17;
                                            v7.ay[v6] = v9;
                                        }

                                        goto label_268;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            return;
        }
        catch(RuntimeException v0_1) {
            goto label_281;
        }

    label_268:
        ++v6;
        v11 = 50;
        goto label_198;
    label_271:
        aw v25 = this;
        ca v26 = v13;
        boolean v27 = v14;
        boolean v28 = v1_1;
        long v29 = arg34;
        try {
            v25.ar(v26, v27, v28, v29);
            return;
        }
        catch(RuntimeException v0_1) {
        label_281:
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append("aw.ae(");
            v1_2.append(')');
            throw lx.al(((Throwable)v0_1), v1_2.toString());
        }
        catch(Exception ) {
            return;
        }
    }

    public final void af(ca arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v18;
        aw v0 = this;
        ca v1 = arg24;
        int v8 = 0;
        v0.ao[0] = -1;
        if(2 != v1.bt && v1.bt != 1) {
            arg24.aj();
        }

        int v7 = v0.bo.bw * 1126407459;
        int v9 = v0.bo.bo * 0xC1B0EB90;
        int v10 = aw.aj[arg25];
        int v11 = aw.ad[arg25];
        int v12 = aw.aj[arg26];
        int v13 = aw.ad[arg26];
        int v14 = aw.aj[arg27];
        int v15 = aw.ad[arg27];
        int v16 = aw.aj[arg28];
        int v5 = aw.ad[arg28];
        int v17 = v16 * arg30 + arg31 * v5 >> 16;
        int v19 = v9;
        while(v8 < v1.an) {
            v9 = v1.ap[v8];
            int v20 = v7;
            v7 = v1.aj[v8];
            int v6 = v1.ad[v8];
            if(arg27 != 0) {
                v18 = v9 * v15 + v7 * v14 >> 16;
                v7 = v7 * v15 - v9 * v14 >> 16;
                v9 = v18;
            }

            if(arg25 != 0) {
                v18 = v7 * v11 - v10 * v6 >> 16;
                v6 = v7 * v10 + v6 * v11 >> 16;
                v7 = v18;
            }

            if(arg26 != 0) {
                v18 = v12 * v6 + v13 * v9 >> 16;
                v6 = v6 * v13 - v9 * v12 >> 16;
                v9 = v18;
            }

            v9 += arg29;
            v7 += arg30;
            v18 = v6 + arg31;
            int v21 = v5 * v7 - v16 * v18 >> 16;
            v7 = v18 * v5 + v7 * v16 >> 16;
            v0.ag[v8] = v7 - v17;
            v0.am[v8] = v0.bo.bp * 0x47E7A5A0 * v9 / arg32 + v20;
            v0.az[v8] = v19 + v0.bo.bp * 574766503 * v21 / arg32;
            if(v1.ay > 0) {
                v0.ah[v8] = v9;
                v0.at[v8] = v21;
                v0.ay[v8] = v7;
            }

            ++v8;
            v7 = v20;
        }

        aw v25 = this;
        ca v26 = arg24;
        long v29 = 0;
        try {
            v25.ar(v26, false, false, v29);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    final void ag(ca arg47, int arg48) {
        int v45;
        int v44;
        int v43;
        int v13;
        int v11;
        int v12;
        int v15;
        int v14;
        int v19;
        int v21;
        int v20;
        aw v0 = this;
        ca v1 = arg47;
        int v3 = v0.bo.bw * 1126407459;
        int v4 = v0.bo.bo * 0xF7F729AF;
        int v5 = v1.ab[arg48];
        int v6 = v1.af[arg48];
        int v7 = v1.ai[arg48];
        int v8 = v0.ay[v5];
        int v9 = v0.ay[v6];
        int v10 = v0.ay[v7];
        v0.bo.bn = v1.az == null ? 0 : (v1.az[arg48] & 0xFF) * 0x308B19C3;
        if(v8 >= 50) {
            v0.bn[0] = v0.am[v5];
            v0.bp[0] = v0.az[v5];
            v0.bw[0] = v1.av[arg48];
            v20 = v5;
            v21 = v7;
            v19 = v10;
            v5 = 50;
            v14 = 1;
        }
        else {
            v14 = v0.ah[v5];
            v15 = v0.at[v5];
            v12 = v1.av[arg48];
            if(v10 >= 1940668105) {
                v11 = aw.ab[v10 - v8] * (50 - v8);
                v19 = v10;
                v20 = v5;
                v0.bn[0] = (((v0.ah[v7] - v14) * v11 >> 16) + v14) * (v0.bo.bp * 574766503) / 0xBCC07E4D + v3;
                v21 = v7;
                v0.bp[0] = (((v0.at[v7] - v15) * v11 >> 16) + v15) * (v0.bo.bp * 0x7F4670BA) / 50 + v4;
                v0.bw[0] = (v11 * (v1.au[arg48] - v12) >> 16) + v12;
                v5 = 1;
            }
            else {
                v20 = v5;
                v21 = v7;
                v19 = v10;
                v5 = 0;
            }

            if(v9 >= 50) {
                v7 = (0xFA221F20 - v8) * aw.ab[v9 - v8];
                v0.bn[v5] = v0.bo.bp * 574766503 * (((v0.ah[v6] - v14) * v7 >> 16) + v14) / 50 + v3;
                v0.bp[v5] = v0.bo.bp * -1564110115 * (((v0.at[v6] - v15) * v7 >> 16) + v15) / 0x2CFC48FC + v4;
                v14 = v5 + 1;
                v0.bw[v5] = (v7 * (v1.aa[arg48] - v12) >> 16) + v12;
            }
            else {
                v14 = v5;
            }

            v5 = 50;
        }

        if(v9 >= v5) {
            v0.bn[v14] = v0.am[v6];
            v0.bp[v14] = v0.az[v6];
            v7 = v14 + 1;
            v0.bw[v14] = v1.aa[arg48];
            v11 = v19;
        }
        else {
            v5 = v0.ah[v6];
            v7 = v0.at[v6];
            v10 = v1.aa[arg48];
            if(v8 >= 50) {
                v12 = aw.ab[v8 - v9] * (50 - v9);
                v0.bn[v14] = (((v0.ah[v20] - v5) * v12 >> 16) + v5) * (v0.bo.bp * 0xA3D506BA) / 0x2E0F15A9 + v3;
                v0.bp[v14] = v0.bo.bp * -180140029 * (((v0.at[v20] - v7) * v12 >> 16) + v7) / 50 + v4;
                v13 = v14 + 1;
                v0.bw[v14] = ((v1.av[arg48] - v10) * v12 >> 16) + v10;
            }
            else {
                v13 = v14;
            }

            v11 = v19;
            if(v11 >= 50) {
                v12 = (0xE9BA45D6 - v9) * aw.ab[v11 - v9];
                v0.bn[v13] = (((v0.ah[v21] - v5) * v12 >> 16) + v5) * (v0.bo.bp * 574766503) / -1130001962 + v3;
                v0.bp[v13] = (v7 + ((v0.at[v21] - v7) * v12 >> 16)) * (v0.bo.bp * 2059253602) / 0xCA91BBE9 + v4;
                v7 = v13 + 1;
                v0.bw[v13] = v10 + (v12 * (v1.au[arg48] - v10) >> 16);
                goto label_186;
            }

            v7 = v13;
        }

    label_186:
        v5 = 50;
        if(v11 >= v5) {
            v0.bn[v7] = v0.am[v21];
            v0.bp[v7] = v0.az[v21];
            v4 = v7 + 1;
            v0.bw[v7] = v1.au[arg48];
        }
        else {
            v5 = v0.ah[v21];
            v10 = v0.at[v21];
            v12 = v1.au[arg48];
            if(v9 >= -1550153533) {
                v9 = aw.ab[v9 - v11] * (50 - v11);
                v0.bn[v7] = v0.bo.bp * 574766503 * (((v0.ah[v6] - v5) * v9 >> 16) + v5) / 50 + v3;
                v0.bp[v7] = (((v0.at[v6] - v10) * v9 >> 16) + v10) * (v0.bo.bp * 0xE349E800) / 50 + v4;
                v14 = v7 + 1;
                v0.bw[v7] = (v9 * (v1.aa[arg48] - v12) >> 16) + v12;
            }
            else {
                v14 = v7;
            }

            if(v8 >= 50) {
                v7 = (-1112031582 - v11) * aw.ab[v8 - v11];
                v0.bn[v14] = (((v0.ah[v20] - v5) * v7 >> 16) + v5) * (v0.bo.bp * 0x9FFDB5AD) / 0x9BC2499E + v3;
                v0.bp[v14] = v4 + v0.bo.bp * 1144601026 * (v10 + ((v0.at[v20] - v10) * v7 >> 16)) / 50;
                v4 = v14 + 1;
                v0.bw[v14] = ((v1.av[arg48] - v12) * v7 >> 16) + v12;
                goto label_420;
            }

            v4 = v14;
        }

    label_420:
        v3 = v0.bn[0];
        v15 = v0.bn[1];
        int v16 = 2;
        v14 = v0.bn[v16];
        int v17 = v0.bp[0];
        int v18 = v0.bp[1];
        v19 = v0.bp[v16];
        v0.bo.ac = false;
        v5 = -1;
        if(v4 == 3) {
            if(v3 < 0 || v15 < 0 || v14 < 0 || v3 > v0.bo.by * 0xE411F71B || v15 > v0.bo.by * 0x47282524 || v14 > v0.bo.by * 2038025161) {
                v0.bo.ac = true;
            }

            if(v1.ah != null) {
                if(v5 == v1.ah[arg48]) {
                }
                else {
                    if(v1.ag == null || v5 == v1.ag[arg48]) {
                        v9 = v6;
                        v8 = v20;
                        v7 = v21;
                    }
                    else {
                        v7 = v1.ag[arg48] & -1094894073;
                        v8 = v1.aw[v7];
                        v9 = v1.ao[v7];
                        v7 = v1.as[v7];
                    }

                    if(v1.au[arg48] == v5) {
                        v0.bo.aq(v17, v18, v19, v3, v15, v14, v1.av[arg48], v1.av[arg48], v1.av[arg48], v0.ah[v8], v0.ah[v9], v0.ah[v7], v0.at[v8], v0.at[v9], v0.at[v7], v0.ay[v8], v0.ay[v9], v0.ay[v7], v1.ah[arg48], 0);
                        goto label_609;
                    }

                    v0.bo.aq(v17, v18, v19, v3, v15, v14, v0.bw[0], v0.bw[1], v0.bw[v16], v0.ah[v8], v0.ah[v9], v0.ah[v7], v0.at[v8], v0.at[v9], v0.at[v7], v0.ay[v8], v0.ay[v9], v0.ay[v7], v1.ah[arg48], 0);
                    goto label_609;
                }
            }

            if(v5 == v1.au[arg48]) {
                v43 = 3;
                v44 = v14;
                v45 = v15;
                v0.bo.aj(v17, v18, v19, v3, v15, v14, aw.aq[v1.av[arg48]], 0x9E418F17);
                goto label_612;
            }

            v44 = v14;
            v45 = v15;
            v43 = 3;
            v0.bo.an(v17, v18, v19, v3, v45, v44, v0.bw[0], v0.bw[1], v0.bw[v16], 86805035);
        }
        else {
        label_609:
            v44 = v14;
            v45 = v15;
            v43 = 3;
        }

    label_612:
        if(v4 == 4) {
            if(v3 >= 0) {
                v4 = v45;
                if(v4 >= 0) {
                    v15 = v44;
                    if(v15 < 0) {
                        goto label_649;
                    }
                    else if(v3 > v0.bo.by * 0x4FD33C0D) {
                        goto label_649;
                    }
                    else if(v4 > v0.bo.by * -54770133) {
                        goto label_649;
                    }
                    else if(v15 > v0.bo.by * 0x9934E37A) {
                        goto label_649;
                    }
                    else if(v0.bn[v43] < 0) {
                        goto label_649;
                    }
                    else if(v0.bn[v43] > v0.bo.by * 0x8D1C27C7) {
                        goto label_649;
                    }
                }
                else {
                    v15 = v44;
                    goto label_649;
                }
            }
            else {
                v15 = v44;
                v4 = v45;
            label_649:
                v0.bo.ac = true;
            }

            if(v1.ah != null) {
                if(v5 == v1.ah[arg48]) {
                }
                else {
                    if(v1.ag != null && v1.ag[arg48] != v5) {
                        v6 = v1.ag[arg48] & 0xFF;
                        v7 = v1.aw[v6];
                        v8 = v1.ao[v6];
                        v21 = v1.as[v6];
                        v20 = v7;
                        v6 = v8;
                    }

                    v7 = v1.ah[arg48];
                    if(v1.au[arg48] == v5) {
                        v0.bo.aq(v17, v18, v19, v3, v4, v15, v1.av[arg48], v1.av[arg48], v1.av[arg48], v0.ah[v20], v0.ah[v6], v0.ah[v21], v0.at[v20], v0.at[v6], v0.at[v21], v0.ay[v20], v0.ay[v6], v0.ay[v21], v7, 0);
                        v0.bo.aq(v17, v19, v0.bp[v43], v3, v15, v0.bn[v43], v1.av[arg48], v1.av[arg48], v1.av[arg48], v0.ah[v20], v0.ah[v6], v0.ah[v21], v0.at[v20], v0.at[v6], v0.at[v21], v0.ay[v20], v0.ay[v6], v0.ay[v21], v7, 0);
                        return;
                    }

                    v0.bo.aq(v17, v18, v19, v3, v4, v15, v0.bw[0], v0.bw[1], v0.bw[v16], v0.ah[v20], v0.ah[v6], v0.ah[v21], v0.at[v20], v0.at[v6], v0.at[v21], v0.ay[v20], v0.ay[v6], v0.ay[v21], v7, 0);
                    v0.bo.aq(v17, v19, v0.bp[v43], v3, v15, v0.bn[v43], v0.bw[0], v0.bw[v16], v0.bw[v43], v0.ah[v20], v0.ah[v6], v0.ah[v21], v0.at[v20], v0.at[v6], v0.at[v21], v0.ay[v20], v0.ay[v6], v0.ay[v21], v7, 0);
                    return;
                }
            }

            if(v5 == v1.au[arg48]) {
                int v1_1 = aw.aq[v1.av[arg48]];
                v0.bo.aj(v17, v18, v19, v3, v4, v15, v1_1, -2140350675);
                v0.bo.aj(v17, v19, v0.bp[v43], v3, v15, v0.bn[v43], v1_1, 46022264);
                return;
            }

            v0.bo.an(v17, v18, v19, v3, v4, v15, v0.bw[0], v0.bw[1], v0.bw[v16], 86805035);
            v0.bo.an(v17, v19, v0.bp[v43], v3, v15, v0.bn[v43], v0.bw[0], v0.bw[v16], v0.bw[v43], 86805035);
        }
    }

    public void ah(bm arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, long arg36) {
        boolean v0_1;
        int v22_1;
        aw v6 = this;
        int v7 = arg28;
        ca v13 = arg27.as();
        if(v13 == null) {
            return;
        }

        boolean v14 = false;
        v6.ao[0] = -1;
        if(v13.bt != 1) {
            v13.ap();
        }

        v13.an(v7);
        int v0 = arg32 * arg35 - arg31 * arg33 >> 16;
        int v4 = arg29 * arg34 + v0 * arg30 >> 16;
        int v1 = v13.bq * arg30 >> 16;
        int v2 = v1 + v4;
        if(v2 > 50) {
            if(v4 >= 3500) {
            }
            else {
                int v5 = arg31 * arg35 + arg32 * arg33 >> 16;
                int v16 = 574766503;
                int v3 = (v5 - v13.bq) * (v6.bo.bp * v16);
                int v8 = v3 / v2;
                if(v8 >= v6.bo.bq * 0x36E3B7F) {
                    return;
                }
                else {
                    int v19 = v8;
                    int v9 = (v13.bq + v5) * (v6.bo.bp * v16);
                    v8 = v9 / v2;
                    if(v8 <= v6.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        v0 = arg30 * arg34 - v0 * arg29 >> 16;
                        int v12 = v13.bq * arg29 >> 16;
                        int v20 = v8;
                        v8 = v6.bo.bp * v16 * (v12 + v0);
                        int v11 = v8 / v2;
                        if(v11 <= v6.bo.bx * 0xB31C2AE1) {
                            return;
                        }
                        else {
                            int v18 = 0xCD6CEDE3;
                            v12 = v6.bo.bp * v16 * (v0 - ((v13.bh * v18 * arg30 >> 16) + v12));
                            v2 = v12 / v2;
                            int v21 = v11;
                            if(v2 >= v6.bo.bg * 0x560C1795) {
                                return;
                            }
                            else {
                                v11 = 50;
                                int v10 = v4 - ((v13.bh * v18 * arg29 >> 16) + v1) <= v11 ? 1 : 0;
                                v10 = v10 != 0 || v13.ay > 0 ? 1 : 0;
                                int v17 = jb.ah(44);
                                v18 = eu.at(104);
                                boolean v22 = bf.az(91);
                                int v24 = 0xF7F729AF;
                                int v25 = 1126407459;
                                if(!aq.ae(arg36) || !v22) {
                                    v22_1 = v4;
                                label_184:
                                    v0_1 = false;
                                }
                                else {
                                    if(bc.ax) {
                                        v22_1 = v4;
                                        v0_1 = ew.aw(v13, arg33, arg34, arg35, this, -1);
                                    }
                                    else {
                                        v22_1 = v4;
                                        v1 = v22_1 - v1;
                                        if(v1 <= v11) {
                                            v1 = 50;
                                        }

                                        if(v5 > 0) {
                                            v4 = v9 / v1;
                                            v3 = v19;
                                        }
                                        else {
                                            v3 /= v1;
                                            v4 = v20;
                                        }

                                        if(v0 > 0) {
                                            v0 = v8 / v1;
                                        }
                                        else {
                                            v2 = v12 / v1;
                                            v0 = v21;
                                        }

                                        v1 = v17 - v6.bo.bw * v25;
                                        v5 = v18 - v6.bo.bo * v24;
                                        if(v1 > v3 && v1 < v4 && v5 > v2 && v5 < v0) {
                                            v0_1 = true;
                                            goto label_175;
                                        }

                                        v0_1 = false;
                                    }

                                label_175:
                                    if(!v0_1) {
                                        goto label_184;
                                    }

                                    if(v13.bf) {
                                        lt.am(arg36);
                                        goto label_184;
                                    }

                                    v0_1 = true;
                                }

                                v1 = v6.bo.bw * v25;
                                v2 = v6.bo.bo * v24;
                                if(v7 != 0) {
                                    v3 = aw.aj[v7];
                                    v4 = aw.ad[v7];
                                }
                                else {
                                    v3 = 0;
                                    v4 = 0;
                                }

                                v5 = 0;
                                while(v5 < v13.an) {
                                    v8 = v13.ap[v5];
                                    v9 = v13.aj[v5];
                                    v12 = v13.ad[v5];
                                    if(v7 != 0) {
                                        v17 = v12 * v3 + v4 * v8 >> 16;
                                        v12 = v12 * v4 - v8 * v3 >> 16;
                                    }
                                    else {
                                        v17 = v8;
                                    }

                                    v17 += arg33;
                                    v9 += arg34;
                                    v12 += arg35;
                                    v21 = v17 * arg32 + arg31 * v12 >> 16;
                                    v12 = v12 * arg32 - v17 * arg31 >> 16;
                                    v17 = v9 * arg30 - v12 * arg29 >> 16;
                                    v9 = v9 * arg29 + v12 * arg30 >> 16;
                                    v6.ag[v5] = v9 - v22_1;
                                    if(v9 >= v11) {
                                        v6.am[v5] = v6.bo.bp * v16 * v21 / v9 + v1;
                                        v6.az[v5] = v6.bo.bp * v16 * v17 / v9 + v2;
                                    }
                                    else {
                                        v6.am[v5] = -5000;
                                        v14 = true;
                                    }

                                    if(v10 != 0) {
                                        v6.ah[v5] = v21;
                                        v6.at[v5] = v17;
                                        v6.ay[v5] = v9;
                                    }

                                    ++v5;
                                    v11 = 50;
                                }

                                aw v27 = this;
                                ca v28 = v13;
                                boolean v29 = v14;
                                boolean v30 = v0_1;
                                long v31 = arg36;
                                try {
                                    v27.ar(v28, v29, v30, v31);
                                    return;
                                }
                                catch(Exception ) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void ai(ca arg20, boolean arg21, boolean arg22, long arg23) {
        int v4_1;
        int[] v6_1;
        int[] v5_1;
        int v7;
        int v6;
        int v2;
        int v12;
        int v11;
        int v15;
        int v10;
        int v9;
        int v8;
        int v5;
        aw v0 = this;
        ca v1 = arg20;
        if(v1.bx >= 398550700) {
            return;
        }

        int v3;
        for(v3 = 0; v3 < v1.bx; ++v3) {
            v0.ao[v3] = 0;
        }

        boolean v4 = arg22;
        for(v3 = 0; v3 < v1.aq; ++v3) {
            if(v1.au[v3] == -2) {
            }
            else {
                v5 = v1.ab[v3];
                v8 = v1.af[v3];
                v9 = v1.ai[v3];
                v10 = v0.am[v5];
                v15 = v0.am[v8];
                int v14 = v0.am[v9];
                if((arg21) && (v10 == 1777780806 || -5000 == v15 || v14 == 0x9C770D12)) {
                    v10 = v0.ah[v5];
                    v11 = v0.ah[v8];
                    v12 = v0.ah[v9];
                    int v13 = v0.at[v5];
                    v14 = v0.at[v8];
                    v15 = v0.at[v9];
                    v2 = v0.ay[v5];
                    v6 = v0.ay[v8];
                    v10 -= v11;
                    v12 -= v11;
                    v13 -= v14;
                    v15 -= v14;
                    v2 -= v6;
                    v7 = v0.ay[v9] - v6;
                    if((v10 * v15 - v13 * v12) * v6 + ((v2 * v12 - v7 * v10) * v14 + v11 * (v13 * v7 - v15 * v2)) <= 0) {
                        goto label_186;
                    }

                    v0.au[v3] = true;
                    v2 = (v0.ag[v5] + v0.ag[v8] + v0.ag[v9]) / 3 + v1.bg;
                    v5_1 = v0.as[v2];
                    v6_1 = v0.ao;
                    v7 = v6_1[v2];
                    v6_1[v2] = v7 + 1;
                    v5_1[v7] = v3;
                    goto label_186;
                }

                if(v4) {
                    v2 = v14;
                    v6 = v15;
                    if(ah.ao(v0.az[v5], v0.az[v8], v0.az[v9], v10, v15, v2, 5, 0x6FD5490)) {
                        lt.am(arg23);
                        v4 = false;
                    }
                }
                else {
                    v2 = v14;
                    v6 = v15;
                }

                if((v10 - v6) * (v0.az[v9] - v0.az[v8]) - (v2 - v6) * (v0.az[v5] - v0.az[v8]) <= 0) {
                    goto label_186;
                }

                v0.au[v3] = false;
                if(v10 < 0 || v6 < 0 || v2 < 0) {
                label_164:
                    v0.aa[v3] = true;
                }
                else {
                    v11 = 1109746211;
                    if(v10 > v0.bo.by * v11) {
                        goto label_164;
                    }
                    else if(v6 > v0.bo.by * v11) {
                        goto label_164;
                    }
                    else if(v2 > v0.bo.by * v11) {
                        goto label_164;
                    }
                    else {
                        v0.aa[v3] = false;
                    }
                }

                v2 = v1.bg + (v0.ag[v9] + (v0.ag[v8] + v0.ag[v5])) / 3;
                v5_1 = v0.as[v2];
                v6_1 = v0.ao;
                v7 = v6_1[v2];
                v6_1[v2] = v7 + 1;
                v5_1[v7] = v3;
            }

        label_186:
        }

        if(v1.am == null) {
            v2 = v1.bx - 1;
            goto label_194;
        }

        for(v2 = 0; v2 < 12; ++v2) {
            v0.ak[v2] = 0;
            v0.bf[v2] = 0;
        }

        for(v2 = v1.bx - 1; true; --v2) {
            v3 = 10;
            if(v2 < 0) {
                break;
            }

            v4_1 = v0.ao[v2];
            if(v4_1 > 0) {
                v5_1 = v0.as[v2];
                for(v6 = 0; v6 < v4_1; ++v6) {
                    v7 = v5_1[v6];
                    v8 = v1.am[v7];
                    int[] v9_1 = v0.ak;
                    v10 = v9_1[v8];
                    v9_1[v8] = v10 + 1;
                    v0.ac[v8][v10] = v7;
                    if(v8 < v3) {
                        v0.bf[v8] += v2;
                    }
                    else if(v8 == v3) {
                        v0.bd[v10] = v2;
                    }
                    else {
                        v0.ba[v10] = v2;
                    }
                }
            }
        }

        v5 = 2;
        v2 = v0.ak[1] > 0 || v0.ak[v5] > 0 ? (v0.bf[1] + v0.bf[v5]) / (v0.ak[1] + v0.ak[v5]) : 0;
        v5 = 3;
        v6 = 4;
        v4_1 = v0.ak[v5] > 0 || v0.ak[v6] > 0 ? (v0.bf[v5] + v0.bf[v6]) / (v0.ak[v5] + v0.ak[v6]) : 0;
        v6 = 6;
        v7 = 8;
        v5 = v0.ak[v6] > 0 || v0.ak[v7] > 0 ? (v0.bf[v7] + v0.bf[v6]) / (v0.ak[v7] + v0.ak[v6]) : 0;
        v6 = v0.ak[v3];
        int[] v7_1 = v0.ac[v3];
        int[] v8_1 = v0.bd;
        v9 = 11;
        if(v6 == 0) {
            v6 = v0.ak[v9];
            v7_1 = v0.ac[v9];
            v8_1 = v0.ba;
        }

        v12 = v6 > 0 ? v8_1[0] : -1000;
        int[] v13_1 = v7_1;
        int[] v14_1 = v8_1;
        v7 = 0;
        v8 = v6;
        v6 = 0;
        while(v6 < v3) {
            while(v6 == 0) {
                if(v12 <= v2) {
                    break;
                }

                v12 = v7 + 1;
                v0.an(v1, v13_1[v7], 1830265047);
                if(v12 != v8 || v0.ac[v9] == v13_1) {
                    v7 = v12;
                }
                else {
                    v7 = v0.ak[v9];
                    v13_1 = v0.ac[v9];
                    v14_1 = v0.ba;
                    v8 = v7;
                    v7 = 0;
                }

                if(v7 < v8) {
                    v12 = v14_1[v7];
                    continue;
                }

                v12 = 0xE6BC6E21;
            }

            v15 = 3;
            while(v6 == v15) {
                if(v12 <= v4_1) {
                    break;
                }

                v12 = v7 + 1;
                v0.an(v1, v13_1[v7], 1983049025);
                if(v8 != v12 || v0.ac[v9] == v13_1) {
                    v7 = v12;
                }
                else {
                    v3 = v0.ak[v9];
                    v13_1 = v0.ac[v9];
                    v14_1 = v0.ba;
                    v7 = 0;
                    v8 = v3;
                }

                if(v7 < v8) {
                    v12 = v14_1[v7];
                    continue;
                }

                v12 = -1000;
            }

            while(5 == v6) {
                if(v12 <= v5) {
                    break;
                }

                v3 = v7 + 1;
                v0.an(v1, v13_1[v7], 1463048474);
                if(v3 != v8 || v13_1 == v0.ac[v9]) {
                    v7 = v3;
                }
                else {
                    v8 = v0.ak[v9];
                    v13_1 = v0.ac[v9];
                    v14_1 = v0.ba;
                    v7 = 0;
                }

                if(v7 < v8) {
                    v12 = v14_1[v7];
                    continue;
                }

                v12 = 0xAC97BBA4;
            }

            v3 = v0.ak[v6];
            int[] v11_1 = v0.ac[v6];
            for(v15 = 0; v15 < v3; ++v15) {
                v0.an(v1, v11_1[v15], 0x66B18EC8);
            }

            ++v6;
            v3 = 10;
            v9 = 11;
        }

        v2 = -1000;
        while(v2 != v12) {
            v3 = v7 + 1;
            v0.an(v1, v13_1[v7], 0x7458C589);
            if(v3 == v8) {
                v5 = 11;
                if(v0.ac[v5] != v13_1) {
                    v13_1 = v0.ac[v5];
                    v8 = v0.ak[v5];
                    v14_1 = v0.ba;
                    v7 = 0;
                }
                else {
                    goto label_466;
                }
            }
            else {
            label_466:
                v7 = v3;
            }

            if(v7 < v8) {
                v12 = v14_1[v7];
                continue;
            }

            v12 = 1300933172;
        }

        return;
    label_194:
        while(v2 >= 0) {
            v3 = v0.ao[v2];
            if(v3 > 0) {
                int[] v4_2 = v0.as[v2];
                for(v5 = 0; v5 < v3; ++v5) {
                    v0.an(v1, v4_2[v5], 0x5A2015CD);
                }
            }

            --v2;
        }
    }

    public final void aj(ca arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30) {
        int v17;
        aw v0 = this;
        ca v1 = arg23;
        int v7 = 0;
        v0.ao[0] = -1;
        if(v1.bt != 2 && 1 != v1.bt) {
            arg23.aj();
        }

        int v6 = v0.bo.bw * 1126407459;
        int v9 = v0.bo.bo * 0xF7F729AF;
        int v8 = aw.aj[arg24];
        int v10 = aw.ad[arg24];
        int v11 = aw.aj[arg25];
        int v12 = aw.ad[arg25];
        int v13 = aw.aj[arg26];
        int v14 = aw.ad[arg26];
        int v15 = aw.aj[arg27];
        int v5 = aw.ad[arg27];
        int v16 = arg30 * v5 + v15 * arg29 >> 16;
        int v18 = v9;
        while(v7 < v1.an) {
            v9 = v1.ap[v7];
            int v19 = v6;
            v6 = v1.aj[v7];
            int v0_1 = v1.ad[v7];
            if(arg26 != 0) {
                v17 = v9 * v14 + v6 * v13 >> 16;
                v6 = v6 * v14 - v9 * v13 >> 16;
                v9 = v17;
            }

            if(arg24 != 0) {
                v17 = v10 * v6 - v0_1 * v8 >> 16;
                v0_1 = v0_1 * v10 + v6 * v8 >> 16;
                v6 = v17;
            }

            if(arg25 != 0) {
                v17 = v0_1 * v11 + v12 * v9 >> 16;
                v0_1 = v0_1 * v12 - v9 * v11 >> 16;
                v9 = v17;
            }

            v9 += arg28;
            v6 += arg29;
            v17 = v0_1 + arg30;
            int v20 = v5 * v6 - v17 * v15 >> 16;
            v6 = v17 * v5 + v6 * v15 >> 16;
            v0 = this;
            v0.ag[v7] = v6 - v16;
            v0.am[v7] = v19 + v0.bo.bp * 574766503 * v9 / v6;
            v0.az[v7] = v0.bo.bp * 574766503 * v20 / v6 + v18;
            if(v1.ay > 0) {
                v0.ah[v7] = v9;
                v0.at[v7] = v20;
                v0.ay[v7] = v6;
            }

            ++v7;
            v6 = v19;
        }

        aw v24 = this;
        ca v25 = arg23;
        long v28 = 0;
        try {
            v24.ar(v25, false, false, v28);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public final void al(ca arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, byte arg33) {
        int v18;
        int v20;
        int v7;
        int v9;
        aw v1 = this;
        ca v0 = arg24;
        try {
            v9 = 0;
            v1.ao[0] = -1;
            if(2 != v0.bt && v0.bt != 1) {
                arg24.aj();
            }

            v7 = v1.bo.bw * 1126407459;
            int v8 = v1.bo.bo * 0xF7F729AF;
            int v10 = aw.aj[arg25];
            int v11 = aw.ad[arg25];
            int v12 = aw.aj[arg26];
            int v13 = aw.ad[arg26];
            int v14 = aw.aj[arg27];
            int v15 = aw.ad[arg27];
            int v16 = aw.aj[arg28];
            int v5 = aw.ad[arg28];
            int v17 = v16 * arg30 + arg31 * v5 >> 16;
            int v19 = v8;
            while(true) {
            label_42:
                if(v9 >= v0.an) {
                    goto label_124;
                }

                v8 = v0.ap[v9];
                v20 = v7;
                v7 = v0.aj[v9];
                int v6 = v0.ad[v9];
                if(arg27 != 0) {
                    v18 = v8 * v15 + v7 * v14 >> 16;
                    v7 = v7 * v15 - v8 * v14 >> 16;
                    v8 = v18;
                }

                if(arg25 != 0) {
                    v18 = v7 * v11 - v10 * v6 >> 16;
                    v6 = v7 * v10 + v6 * v11 >> 16;
                    v7 = v18;
                }

                if(arg26 != 0) {
                    v18 = v12 * v6 + v13 * v8 >> 16;
                    v6 = v6 * v13 - v8 * v12 >> 16;
                    v8 = v18;
                }

                v8 += arg29;
                v7 += arg30;
                v18 = v6 + arg31;
                int v21 = v5 * v7 - v16 * v18 >> 16;
                v7 = v18 * v5 + v7 * v16 >> 16;
                v1.ag[v9] = v7 - v17;
                v1.am[v9] = v1.bo.bp * 574766503 * v8 / arg32 + v20;
                v1.az[v9] = v19 + v1.bo.bp * 574766503 * v21 / arg32;
                if(v0.ay > 0) {
                    v1.ah[v9] = v8;
                    v1.at[v9] = v21;
                    v1.ay[v9] = v7;
                }

                break;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_136;
        }

        ++v9;
        v7 = v20;
        goto label_42;
    label_124:
        aw v25 = this;
        ca v26 = arg24;
        long v29 = 0;
        try {
            v25.ar(v26, false, false, v29);
            return;
        }
        catch(RuntimeException v0_1) {
        label_136:
            StringBuilder v2 = new StringBuilder();
            v2.append("aw.al(");
            v2.append(')');
            throw lx.al(((Throwable)v0_1), v2.toString());
        }
        catch(Exception ) {
            return;
        }
    }

    final void am(ca arg48, int arg49) {
        int v46;
        int v45;
        int v44;
        int v11;
        int v16;
        int v12;
        int v15;
        int v13;
        int v20;
        int v21;
        int v22;
        aw v0 = this;
        ca v1 = arg48;
        int v3 = v0.bo.bw * 1126407459;
        int v4 = v0.bo.bo * 0xF7F729AF;
        int v5 = v1.ab[arg49];
        int v6 = v1.af[arg49];
        int v7 = v1.ai[arg49];
        int v8 = v0.ay[v5];
        int v9 = v0.ay[v6];
        int v10 = v0.ay[v7];
        v0.bo.bn = v1.az == null ? 0 : (v1.az[arg49] & 0xFF) * 0x308B19C3;
        int v14 = 50;
        if(v8 >= v14) {
            v0.bn[0] = v0.am[v5];
            v0.bp[0] = v0.az[v5];
            v0.bw[0] = v1.av[arg49];
            v22 = v5;
            v21 = v7;
            v20 = v10;
            v5 = 50;
            v13 = 1;
        }
        else {
            v13 = v0.ah[v5];
            v15 = v0.at[v5];
            v12 = v1.av[arg49];
            if(v10 >= v14) {
                v16 = aw.ab[v10 - v8] * (50 - v8);
                v20 = v10;
                v0.bn[0] = (((v0.ah[v7] - v13) * v16 >> 16) + v13) * (v0.bo.bp * 574766503) / 50 + v3;
                v0.bp[0] = (((v0.at[v7] - v15) * v16 >> 16) + v15) * (v0.bo.bp * 574766503) / 50 + v4;
                v0.bw[0] = (v16 * (v1.au[arg49] - v12) >> 16) + v12;
                v10 = 1;
            }
            else {
                v20 = v10;
                v10 = 0;
            }

            if(v9 >= 50) {
                v14 = (50 - v8) * aw.ab[v9 - v8];
                v21 = v7;
                v22 = v5;
                v0.bn[v10] = v0.bo.bp * 574766503 * (((v0.ah[v6] - v13) * v14 >> 16) + v13) / 50 + v3;
                v0.bp[v10] = v0.bo.bp * 574766503 * (((v0.at[v6] - v15) * v14 >> 16) + v15) / 50 + v4;
                v13 = v10 + 1;
                v0.bw[v10] = (v14 * (v1.aa[arg49] - v12) >> 16) + v12;
            }
            else {
                v22 = v5;
                v21 = v7;
                v13 = v10;
            }

            v5 = 50;
        }

        if(v9 >= v5) {
            v0.bn[v13] = v0.am[v6];
            v0.bp[v13] = v0.az[v6];
            v7 = v13 + 1;
            v0.bw[v13] = v1.aa[arg49];
            v11 = v20;
        }
        else {
            v5 = v0.ah[v6];
            v7 = v0.at[v6];
            v10 = v1.aa[arg49];
            if(v8 >= 50) {
                v12 = aw.ab[v8 - v9] * (50 - v9);
                v0.bn[v13] = (((v0.ah[v22] - v5) * v12 >> 16) + v5) * (v0.bo.bp * 574766503) / 50 + v3;
                v0.bp[v13] = v0.bo.bp * 574766503 * (((v0.at[v22] - v7) * v12 >> 16) + v7) / 50 + v4;
                v0.bw[v13] = ((v1.av[arg49] - v10) * v12 >> 16) + v10;
                ++v13;
            }

            v11 = v20;
            if(v11 >= 50) {
                v14 = (50 - v9) * aw.ab[v11 - v9];
                v0.bn[v13] = (((v0.ah[v21] - v5) * v14 >> 16) + v5) * (v0.bo.bp * 574766503) / 50 + v3;
                v0.bp[v13] = (v7 + ((v0.at[v21] - v7) * v14 >> 16)) * (v0.bo.bp * 574766503) / 50 + v4;
                v7 = v13 + 1;
                v0.bw[v13] = v10 + (v14 * (v1.au[arg49] - v10) >> 16);
                goto label_184;
            }

            v7 = v13;
        }

    label_184:
        v5 = 50;
        if(v11 >= v5) {
            v0.bn[v7] = v0.am[v21];
            v0.bp[v7] = v0.az[v21];
            v4 = v7 + 1;
            v0.bw[v7] = v1.au[arg49];
        }
        else {
            v5 = v0.ah[v21];
            v10 = v0.at[v21];
            v12 = v1.au[arg49];
            if(v9 >= 50) {
                v9 = aw.ab[v9 - v11] * (50 - v11);
                v0.bn[v7] = v0.bo.bp * 574766503 * (((v0.ah[v6] - v5) * v9 >> 16) + v5) / 50 + v3;
                v0.bp[v7] = (((v0.at[v6] - v10) * v9 >> 16) + v10) * (v0.bo.bp * 574766503) / 50 + v4;
                v14 = v7 + 1;
                v0.bw[v7] = (v9 * (v1.aa[arg49] - v12) >> 16) + v12;
            }
            else {
                v14 = v7;
            }

            if(v8 >= 50) {
                v9 = (50 - v11) * aw.ab[v8 - v11];
                v0.bn[v14] = (((v0.ah[v22] - v5) * v9 >> 16) + v5) * (v0.bo.bp * 574766503) / 50 + v3;
                v0.bp[v14] = v4 + v0.bo.bp * 574766503 * (v10 + ((v0.at[v22] - v10) * v9 >> 16)) / 50;
                v4 = v14 + 1;
                v0.bw[v14] = ((v1.av[arg49] - v12) * v9 >> 16) + v12;
                goto label_412;
            }

            v4 = v14;
        }

    label_412:
        v3 = v0.bn[0];
        v15 = v0.bn[1];
        v16 = 2;
        v14 = v0.bn[v16];
        int v17 = v0.bp[0];
        int v18 = v0.bp[1];
        int v19 = v0.bp[v16];
        v0.bo.ac = false;
        v5 = 1109746211;
        v13 = -1;
        if(v4 == 3) {
            if(v3 < 0 || v15 < 0 || v14 < 0 || v3 > v0.bo.by * v5 || v15 > v0.bo.by * v5 || v14 > v0.bo.by * v5) {
                v0.bo.ac = true;
            }

            if(v1.ah != null) {
                if(v13 == v1.ah[arg49]) {
                }
                else {
                    if(v1.ag == null || v13 == v1.ag[arg49]) {
                        v9 = v6;
                        v7 = v21;
                        v8 = v22;
                    }
                    else {
                        v7 = v1.ag[arg49] & 0xFF;
                        v8 = v1.aw[v7];
                        v9 = v1.ao[v7];
                        v7 = v1.as[v7];
                    }

                    if(v1.au[arg49] == v13) {
                        v0.bo.aq(v17, v18, v19, v3, v15, v14, v1.av[arg49], v1.av[arg49], v1.av[arg49], v0.ah[v8], v0.ah[v9], v0.ah[v7], v0.at[v8], v0.at[v9], v0.at[v7], v0.ay[v8], v0.ay[v9], v0.ay[v7], v1.ah[arg49], 0);
                        goto label_598;
                    }

                    v0.bo.aq(v17, v18, v19, v3, v15, v14, v0.bw[0], v0.bw[1], v0.bw[v16], v0.ah[v8], v0.ah[v9], v0.ah[v7], v0.at[v8], v0.at[v9], v0.at[v7], v0.ay[v8], v0.ay[v9], v0.ay[v7], v1.ah[arg49], 0);
                    goto label_598;
                }
            }

            if(v13 == v1.au[arg49]) {
                v44 = 3;
                v45 = v14;
                v46 = v15;
                v0.bo.aj(v17, v18, v19, v3, v15, v14, aw.aq[v1.av[arg49]], 0x2589FFA5);
                goto label_601;
            }

            v45 = v14;
            v46 = v15;
            v44 = 3;
            v0.bo.an(v17, v18, v19, v3, v46, v45, v0.bw[0], v0.bw[1], v0.bw[v16], 86805035);
        }
        else {
        label_598:
            v45 = v14;
            v46 = v15;
            v44 = 3;
        }

    label_601:
        if(v4 == 4) {
            if(v3 >= 0) {
                v4 = v46;
                if(v4 >= 0) {
                    v15 = v45;
                    if(v15 < 0) {
                        goto label_634;
                    }
                    else if(v3 > v0.bo.by * v5) {
                        goto label_634;
                    }
                    else if(v4 > v0.bo.by * v5) {
                        goto label_634;
                    }
                    else if(v15 > v0.bo.by * v5) {
                        goto label_634;
                    }
                    else if(v0.bn[v44] < 0) {
                        goto label_634;
                    }
                    else if(v0.bn[v44] > v0.bo.by * v5) {
                        goto label_634;
                    }
                }
                else {
                    v15 = v45;
                    goto label_634;
                }
            }
            else {
                v15 = v45;
                v4 = v46;
            label_634:
                v0.bo.ac = true;
            }

            if(v1.ah != null) {
                v7 = -1;
                if(v7 == v1.ah[arg49]) {
                }
                else {
                    if(v1.ag == null || v1.ag[arg49] == v7) {
                        v8 = v6;
                        v5 = v21;
                        v6 = v22;
                    }
                    else {
                        v5 = v1.ag[arg49] & 0xFF;
                        v6 = v1.aw[v5];
                        v8 = v1.ao[v5];
                        v5 = v1.as[v5];
                    }

                    v9 = v1.ah[arg49];
                    if(v1.au[arg49] == v7) {
                        v0.bo.aq(v17, v18, v19, v3, v4, v15, v1.av[arg49], v1.av[arg49], v1.av[arg49], v0.ah[v6], v0.ah[v8], v0.ah[v5], v0.at[v6], v0.at[v8], v0.at[v5], v0.ay[v6], v0.ay[v8], v0.ay[v5], v9, 0);
                        v0.bo.aq(v17, v19, v0.bp[v44], v3, v15, v0.bn[v44], v1.av[arg49], v1.av[arg49], v1.av[arg49], v0.ah[v6], v0.ah[v8], v0.ah[v5], v0.at[v6], v0.at[v8], v0.at[v5], v0.ay[v6], v0.ay[v8], v0.ay[v5], v9, 0);
                        return;
                    }

                    v0.bo.aq(v17, v18, v19, v3, v4, v15, v0.bw[0], v0.bw[1], v0.bw[v16], v0.ah[v6], v0.ah[v8], v0.ah[v5], v0.at[v6], v0.at[v8], v0.at[v5], v0.ay[v6], v0.ay[v8], v0.ay[v5], v9, 0);
                    v0.bo.aq(v17, v19, v0.bp[v44], v3, v15, v0.bn[v44], v0.bw[0], v0.bw[v16], v0.bw[v44], v0.ah[v6], v0.ah[v8], v0.ah[v5], v0.at[v6], v0.at[v8], v0.at[v5], v0.ay[v6], v0.ay[v8], v0.ay[v5], v9, 0);
                    return;
                }
            }
            else {
                v7 = -1;
            }

            if(v7 == v1.au[arg49]) {
                int v1_1 = aw.aq[v1.av[arg49]];
                v0.bo.aj(v17, v18, v19, v3, v4, v15, v1_1, 0xDEFD2877);
                v0.bo.aj(v17, v19, v0.bp[v44], v3, v15, v0.bn[v44], v1_1, 0x661B0BCA);
                return;
            }

            v0.bo.an(v17, v18, v19, v3, v4, v15, v0.bw[0], v0.bw[1], v0.bw[v16], 86805035);
            v0.bo.an(v17, v19, v0.bp[v44], v3, v15, v0.bn[v44], v0.bw[0], v0.bw[v16], v0.bw[v44], 86805035);
        }
    }

    final void an(ca arg32, int arg33, int arg34) {
        int v9;
        int v8;
        int v6;
        aw v1 = this;
        ca v0 = arg32;
        int v2 = arg33;
        try {
            if(v1.au[v2]) {
                v1.ap(v0, v2, 0x5406CA7F);
                return;
            }

            int v3 = v0.ab[v2];
            int v4 = v0.af[v2];
            int v5 = v0.ai[v2];
            v1.bo.ac = v1.aa[v2];
            v1.bo.bn = v0.az == null ? 0 : (v0.az[v2] & 0xFF) * 0x308B19C3;
            int v7 = -1;
            if(v0.ah == null || v0.ah[v2] == v7) {
                if(v0.au[v2] == v7) {
                    v1.bo.aj(v1.az[v3], v1.az[v4], v1.az[v5], v1.am[v3], v1.am[v4], v1.am[v5], aw.aq[v0.av[v2]], 0x9BA2BA82);
                    return;
                }

                v1.bo.an(v1.az[v3], v1.az[v4], v1.az[v5], v1.am[v3], v1.am[v4], v1.am[v5], v0.av[v2], v0.aa[v2], v0.au[v2], 86805035);
            }
            else {
                if(v0.ag == null || v0.ag[v2] == v7) {
                    v8 = v3;
                    v9 = v4;
                    v6 = v5;
                }
                else {
                    v6 = v0.ag[v2] & 0xFF;
                    v8 = v0.aw[v6];
                    v9 = v0.ao[v6];
                    v6 = v0.as[v6];
                }

                if(v7 == v0.au[v2]) {
                    v1.bo.aq(v1.az[v3], v1.az[v4], v1.az[v5], v1.am[v3], v1.am[v4], v1.am[v5], v0.av[v2], v0.av[v2], v0.av[v2], v1.ah[v8], v1.ah[v9], v1.ah[v6], v1.at[v8], v1.at[v9], v1.at[v6], v1.ay[v8], v1.ay[v9], v1.ay[v6], v0.ah[v2], 0);
                    return;
                }

                v1.bo.aq(v1.az[v3], v1.az[v4], v1.az[v5], v1.am[v3], v1.am[v4], v1.am[v5], v0.av[v2], v0.aa[v2], v0.au[v2], v1.ah[v8], v1.ah[v9], v1.ah[v6], v1.at[v8], v1.at[v9], v1.at[v6], v1.ay[v8], v1.ay[v9], v1.ay[v6], v0.ah[v2], 0);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("aw.an(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public void ao(bm arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, long arg35) {
        int v24;
        boolean v0_1;
        int v22_1;
        aw v6 = this;
        int v7 = arg27;
        ca v13 = arg26.as();
        if(v13 == null) {
            return;
        }

        boolean v14 = false;
        v6.ao[0] = -1;
        if(v13.bt != 1) {
            v13.ap();
        }

        v13.an(v7);
        int v0 = arg31 * arg34 - arg30 * arg32 >> 16;
        int v4 = arg28 * arg33 + v0 * arg29 >> 16;
        int v1 = v13.bq * arg29 >> 16;
        int v2 = v1 + v4;
        if(v2 > 0x8415DF16) {
            if(v4 >= 3500) {
            }
            else {
                int v3 = arg30 * arg34 + arg31 * arg32 >> 16;
                int v5 = (v3 - v13.bq) * (v6.bo.bp * 0x557BD7BE);
                int v8 = v5 / v2;
                if(v8 >= v6.bo.bq * 0x36E3B7F) {
                    return;
                }
                else {
                    int v17 = v8;
                    int v15 = 574766503;
                    int v9 = (v13.bq + v3) * (v6.bo.bp * v15);
                    v8 = v9 / v2;
                    if(v8 <= v6.bo.bv * 0xC5D02EF2) {
                        return;
                    }
                    else {
                        v0 = arg29 * arg33 - v0 * arg28 >> 16;
                        int v12 = v13.bq * arg28 >> 16;
                        int v19 = v8;
                        v8 = v6.bo.bp * -1816560462 * (v12 + v0);
                        int v11 = v8 / v2;
                        if(v11 <= v6.bo.bx * 0xB00093CD) {
                            return;
                        }
                        else {
                            int v20 = v11;
                            v11 = v6.bo.bp * v15 * (v0 - ((v13.bh * 0x536E6BEC * arg29 >> 16) + v12));
                            v2 = v11 / v2;
                            if(v2 >= v6.bo.bg * 1731107262) {
                                return;
                            }
                            else {
                                v12 = 50;
                                int v10 = v4 - ((arg28 * (v13.bh * 0x7A8C1063) >> 16) + v1) <= v12 ? 1 : 0;
                                v10 = v10 != 0 || v13.ay > 0 ? 1 : 0;
                                int v18 = jb.ah(101);
                                int v21 = eu.at(85);
                                boolean v22 = bf.az(-78);
                                if(!aq.ae(arg35) || !v22) {
                                    v22_1 = v4;
                                label_189:
                                    v0_1 = false;
                                }
                                else {
                                    if(bc.ax) {
                                        v22_1 = v4;
                                        v0_1 = ew.aw(v13, arg32, arg33, arg34, this, -8);
                                    }
                                    else {
                                        v22_1 = v4;
                                        v1 = v22_1 - v1;
                                        if(v1 <= 0x5B9B2EF7) {
                                        }
                                        else {
                                            v12 = v1;
                                        }

                                        if(v3 > 0) {
                                            v3 = v9 / v12;
                                            v1 = v17;
                                        }
                                        else {
                                            v1 = v5 / v12;
                                            v3 = v19;
                                        }

                                        if(v0 > 0) {
                                            v11 = v8 / v12;
                                        }
                                        else {
                                            v2 = v11 / v12;
                                            v11 = v20;
                                        }

                                        v0 = v18 - v6.bo.bw * 0x81C0280C;
                                        v4 = v21 - v6.bo.bo * 0xF7F729AF;
                                        if(v0 > v1 && v0 < v3 && v4 > v2 && v4 < v11) {
                                            v0_1 = true;
                                            goto label_180;
                                        }

                                        v0_1 = false;
                                    }

                                label_180:
                                    if(!v0_1) {
                                        goto label_189;
                                    }

                                    if(v13.bf) {
                                        lt.am(arg35);
                                        goto label_189;
                                    }

                                    v0_1 = true;
                                }

                                v1 = v6.bo.bw * 1126407459;
                                v3 = v6.bo.bo * 0x5AE85806;
                                if(v7 != 0) {
                                    v2 = aw.aj[v7];
                                    v4 = aw.ad[v7];
                                }
                                else {
                                    v2 = 0;
                                    v4 = 0;
                                }

                                v5 = 0;
                                while(v5 < v13.an) {
                                    v8 = v13.ap[v5];
                                    v9 = v13.aj[v5];
                                    v11 = v13.ad[v5];
                                    if(v7 != 0) {
                                        v12 = v11 * v2 + v4 * v8 >> 16;
                                        v11 = v11 * v4 - v8 * v2 >> 16;
                                    }
                                    else {
                                        v12 = v8;
                                    }

                                    v12 += arg32;
                                    v9 += arg33;
                                    v11 += arg34;
                                    v20 = v12 * arg31 + arg30 * v11 >> 16;
                                    v11 = v11 * arg31 - v12 * arg30 >> 16;
                                    v12 = v9 * arg29 - v11 * arg28 >> 16;
                                    v9 = v9 * arg28 + v11 * arg29 >> 16;
                                    v6.ag[v5] = v9 - v22_1;
                                    if(v9 >= 0x19ED4FFA) {
                                        v24 = v2;
                                        v6.am[v5] = v6.bo.bp * -1067298201 * v20 / v9 + v1;
                                        v6.az[v5] = v6.bo.bp * v15 * v12 / v9 + v3;
                                    }
                                    else {
                                        v24 = v2;
                                        v6.am[v5] = 0xBBE437F2;
                                        v14 = true;
                                    }

                                    if(v10 != 0) {
                                        v6.ah[v5] = v20;
                                        v6.at[v5] = v12;
                                        v6.ay[v5] = v9;
                                    }

                                    ++v5;
                                    v2 = v24;
                                }

                                aw v26 = this;
                                ca v27 = v13;
                                boolean v28 = v14;
                                boolean v29 = v0_1;
                                long v30 = arg35;
                                try {
                                    v26.ar(v27, v28, v29, v30);
                                    return;
                                }
                                catch(Exception ) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void ap(ca arg48, int arg49, int arg50) {
        int v46;
        int v45;
        int v44;
        int v11;
        int v16;
        int v12;
        int v15;
        int v13;
        int v20;
        int v21;
        int v22;
        aw v1 = this;
        ca v0 = arg48;
        try {
            int v3 = v1.bo.bw * 1126407459;
            int v4 = v1.bo.bo * 0xF7F729AF;
            int v5 = v0.ab[arg49];
            int v6 = v0.af[arg49];
            int v7 = v0.ai[arg49];
            int v8 = v1.ay[v5];
            int v9 = v1.ay[v6];
            int v10 = v1.ay[v7];
            v1.bo.bn = v0.az == null ? 0 : (v0.az[arg49] & 0xFF) * 0x308B19C3;
            int v14 = 50;
            if(v8 >= v14) {
                v1.bn[0] = v1.am[v5];
                v1.bp[0] = v1.az[v5];
                v1.bw[0] = v0.av[arg49];
                v22 = v5;
                v21 = v7;
                v20 = v10;
                v5 = 50;
                v13 = 1;
            }
            else {
                v13 = v1.ah[v5];
                v15 = v1.at[v5];
                v12 = v0.av[arg49];
                if(v10 >= v14) {
                    v16 = aw.ab[v10 - v8] * (50 - v8);
                    v20 = v10;
                    v1.bn[0] = (((v1.ah[v7] - v13) * v16 >> 16) + v13) * (v1.bo.bp * 574766503) / 50 + v3;
                    v1.bp[0] = (((v1.at[v7] - v15) * v16 >> 16) + v15) * (v1.bo.bp * 574766503) / 50 + v4;
                    v1.bw[0] = (v16 * (v0.au[arg49] - v12) >> 16) + v12;
                    v10 = 1;
                }
                else {
                    v20 = v10;
                    v10 = 0;
                }

                if(v9 >= 50) {
                    v14 = (50 - v8) * aw.ab[v9 - v8];
                    v21 = v7;
                    v22 = v5;
                    v1.bn[v10] = v1.bo.bp * 574766503 * (((v1.ah[v6] - v13) * v14 >> 16) + v13) / 50 + v3;
                    v1.bp[v10] = v1.bo.bp * 574766503 * (((v1.at[v6] - v15) * v14 >> 16) + v15) / 50 + v4;
                    v13 = v10 + 1;
                    v1.bw[v10] = (v14 * (v0.aa[arg49] - v12) >> 16) + v12;
                }
                else {
                    v22 = v5;
                    v21 = v7;
                    v13 = v10;
                }

                v5 = 50;
            }

            if(v9 >= v5) {
                v1.bn[v13] = v1.am[v6];
                v1.bp[v13] = v1.az[v6];
                v7 = v13 + 1;
                v1.bw[v13] = v0.aa[arg49];
                v11 = v20;
            }
            else {
                v5 = v1.ah[v6];
                v7 = v1.at[v6];
                v10 = v0.aa[arg49];
                if(v8 >= 50) {
                    v12 = aw.ab[v8 - v9] * (50 - v9);
                    v1.bn[v13] = (((v1.ah[v22] - v5) * v12 >> 16) + v5) * (v1.bo.bp * 574766503) / 50 + v3;
                    v1.bp[v13] = v1.bo.bp * 574766503 * (((v1.at[v22] - v7) * v12 >> 16) + v7) / 50 + v4;
                    v1.bw[v13] = ((v0.av[arg49] - v10) * v12 >> 16) + v10;
                    ++v13;
                }

                v11 = v20;
                if(v11 >= 50) {
                    v14 = (50 - v9) * aw.ab[v11 - v9];
                    v1.bn[v13] = (((v1.ah[v21] - v5) * v14 >> 16) + v5) * (v1.bo.bp * 574766503) / 50 + v3;
                    v1.bp[v13] = (v7 + ((v1.at[v21] - v7) * v14 >> 16)) * (v1.bo.bp * 574766503) / 50 + v4;
                    v7 = v13 + 1;
                    v1.bw[v13] = v10 + (v14 * (v0.au[arg49] - v10) >> 16);
                    goto label_292;
                }

                v7 = v13;
            }

        label_292:
            if(v11 >= 50) {
                v1.bn[v7] = v1.am[v21];
                v1.bp[v7] = v1.az[v21];
                v4 = v7 + 1;
                v1.bw[v7] = v0.au[arg49];
            }
            else {
                v5 = v1.ah[v21];
                v10 = v1.at[v21];
                v12 = v0.au[arg49];
                if(v9 >= 50) {
                    v9 = aw.ab[v9 - v11] * (50 - v11);
                    v1.bn[v7] = v1.bo.bp * 574766503 * (((v1.ah[v6] - v5) * v9 >> 16) + v5) / 50 + v3;
                    v1.bp[v7] = (((v1.at[v6] - v10) * v9 >> 16) + v10) * (v1.bo.bp * 574766503) / 50 + v4;
                    v14 = v7 + 1;
                    v1.bw[v7] = (v9 * (v0.aa[arg49] - v12) >> 16) + v12;
                }
                else {
                    v14 = v7;
                }

                if(v8 >= 50) {
                    v9 = (50 - v11) * aw.ab[v8 - v11];
                    v1.bn[v14] = (((v1.ah[v22] - v5) * v9 >> 16) + v5) * (v1.bo.bp * 574766503) / 50 + v3;
                    v1.bp[v14] = v4 + v1.bo.bp * 574766503 * (v10 + ((v1.at[v22] - v10) * v9 >> 16)) / 50;
                    v4 = v14 + 1;
                    v1.bw[v14] = ((v0.av[arg49] - v12) * v9 >> 16) + v12;
                    goto label_414;
                }

                v4 = v14;
            }

        label_414:
            v3 = v1.bn[0];
            v5 = v1.bn[1];
            v16 = 2;
            v15 = v1.bn[v16];
            int v17 = v1.bp[0];
            int v18 = v1.bp[1];
            int v19 = v1.bp[v16];
            v1.bo.ac = false;
            v20 = 1109746211;
            v14 = -1;
            if(v4 == 3) {
                if(v3 < 0 || v5 < 0 || v15 < 0 || v3 > v1.bo.by * v20 || v5 > v1.bo.by * v20 || v15 > v1.bo.by * v20) {
                    v1.bo.ac = true;
                }

                if(v0.ah != null) {
                    if(v14 == v0.ah[arg49]) {
                    }
                    else {
                        if(v0.ag == null || v14 == v0.ag[arg49]) {
                            v9 = v6;
                            v7 = v21;
                            v8 = v22;
                        }
                        else {
                            v7 = v0.ag[arg49] & 0xFF;
                            v8 = v0.aw[v7];
                            v9 = v0.ao[v7];
                            v7 = v0.as[v7];
                        }

                        if(v0.au[arg49] == v14) {
                            v1.bo.aq(v17, v18, v19, v3, v5, v15, v0.av[arg49], v0.av[arg49], v0.av[arg49], v1.ah[v8], v1.ah[v9], v1.ah[v7], v1.at[v8], v1.at[v9], v1.at[v7], v1.ay[v8], v1.ay[v9], v1.ay[v7], v0.ah[arg49], 0);
                            goto label_605;
                        }

                        v1.bo.aq(v17, v18, v19, v3, v5, v15, v1.bw[0], v1.bw[1], v1.bw[v16], v1.ah[v8], v1.ah[v9], v1.ah[v7], v1.at[v8], v1.at[v9], v1.at[v7], v1.ay[v8], v1.ay[v9], v1.ay[v7], v0.ah[arg49], 0);
                        goto label_605;
                    }
                }

                if(v14 == v0.au[arg49]) {
                    v44 = 3;
                    v45 = v6;
                    v6 = -1;
                    v46 = v15;
                    v1.bo.aj(v17, v18, v19, v3, v5, v15, aw.aq[v0.av[arg49]], 0x1F058C3C);
                    goto label_609;
                }

                v45 = v6;
                v46 = v15;
                v6 = -1;
                v44 = 3;
                v1.bo.an(v17, v18, v19, v3, v5, v46, v1.bw[0], v1.bw[1], v1.bw[v16], 86805035);
            }
            else {
            label_605:
                v45 = v6;
                v46 = v15;
                v6 = -1;
                v44 = 3;
            }

        label_609:
            if(v4 == 4) {
                if(v3 < 0 || v5 < 0) {
                    v4 = v46;
                label_638:
                    v1.bo.ac = true;
                }
                else {
                    v4 = v46;
                    if(v4 < 0) {
                        goto label_638;
                    }
                    else if(v3 > v1.bo.by * v20) {
                        goto label_638;
                    }
                    else if(v5 > v1.bo.by * v20) {
                        goto label_638;
                    }
                    else if(v4 > v1.bo.by * v20) {
                        goto label_638;
                    }
                    else if(v1.bn[v44] < 0) {
                        goto label_638;
                    }
                    else if(v1.bn[v44] > v1.bo.by * v20) {
                        goto label_638;
                    }
                }

                if(v0.ah != null) {
                    if(v6 == v0.ah[arg49]) {
                    }
                    else {
                        if(v0.ag != null && v0.ag[arg49] != v6) {
                            v7 = v0.ag[arg49] & 0xFF;
                            v8 = v0.aw[v7];
                            v9 = v0.ao[v7];
                            v21 = v0.as[v7];
                            v22 = v8;
                            v45 = v9;
                        }

                        v7 = v0.ah[arg49];
                        if(v0.au[arg49] == v6) {
                            v1.bo.aq(v17, v18, v19, v3, v5, v4, v0.av[arg49], v0.av[arg49], v0.av[arg49], v1.ah[v22], v1.ah[v45], v1.ah[v21], v1.at[v22], v1.at[v45], v1.at[v21], v1.ay[v22], v1.ay[v45], v1.ay[v21], v7, 0);
                            v1.bo.aq(v17, v19, v1.bp[v44], v3, v4, v1.bn[v44], v0.av[arg49], v0.av[arg49], v0.av[arg49], v1.ah[v22], v1.ah[v45], v1.ah[v21], v1.at[v22], v1.at[v45], v1.at[v21], v1.ay[v22], v1.ay[v45], v1.ay[v21], v7, 0);
                            return;
                        }

                        v1.bo.aq(v17, v18, v19, v3, v5, v4, v1.bw[0], v1.bw[1], v1.bw[v16], v1.ah[v22], v1.ah[v45], v1.ah[v21], v1.at[v22], v1.at[v45], v1.at[v21], v1.ay[v22], v1.ay[v45], v1.ay[v21], v7, 0);
                        v1.bo.aq(v17, v19, v1.bp[v44], v3, v4, v1.bn[v44], v1.bw[0], v1.bw[v16], v1.bw[v44], v1.ah[v22], v1.ah[v45], v1.ah[v21], v1.at[v22], v1.at[v45], v1.at[v21], v1.ay[v22], v1.ay[v45], v1.ay[v21], v7, 0);
                        return;
                    }
                }

                if(v6 == v0.au[arg49]) {
                    int v0_2 = aw.aq[v0.av[arg49]];
                    v1.bo.aj(v17, v18, v19, v3, v5, v4, v0_2, 150786770);
                    v1.bo.aj(v17, v19, v1.bp[v44], v3, v4, v1.bn[v44], v0_2, 0x46BFE190);
                    return;
                }

                v1.bo.an(v17, v18, v19, v3, v5, v4, v1.bw[0], v1.bw[1], v1.bw[v16], 86805035);
                v1.bo.an(v17, v19, v1.bp[v44], v3, v4, v1.bn[v44], v1.bw[0], v1.bw[v16], v1.bw[v44], 86805035);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("aw.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v0_1), v2.toString());
        }
    }

    public final void aq(ca arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v18;
        aw v0 = this;
        ca v1 = arg24;
        int v8 = 0;
        v0.ao[0] = -1;
        if(2 != v1.bt && v1.bt != 1) {
            arg24.aj();
        }

        int v7 = v0.bo.bw * 1010138086;
        int v9 = v0.bo.bo * -2051819045;
        int v10 = aw.aj[arg25];
        int v11 = aw.ad[arg25];
        int v12 = aw.aj[arg26];
        int v13 = aw.ad[arg26];
        int v14 = aw.aj[arg27];
        int v15 = aw.ad[arg27];
        int v16 = aw.aj[arg28];
        int v5 = aw.ad[arg28];
        int v17 = v16 * arg30 + arg31 * v5 >> 16;
        int v19 = v9;
        while(v8 < v1.an) {
            v9 = v1.ap[v8];
            int v20 = v7;
            v7 = v1.aj[v8];
            int v6 = v1.ad[v8];
            if(arg27 != 0) {
                v18 = v9 * v15 + v7 * v14 >> 16;
                v7 = v7 * v15 - v9 * v14 >> 16;
                v9 = v18;
            }

            if(arg25 != 0) {
                v18 = v7 * v11 - v10 * v6 >> 16;
                v6 = v7 * v10 + v6 * v11 >> 16;
                v7 = v18;
            }

            if(arg26 != 0) {
                v18 = v12 * v6 + v13 * v9 >> 16;
                v6 = v6 * v13 - v9 * v12 >> 16;
                v9 = v18;
            }

            v9 += arg29;
            v7 += arg30;
            v18 = v6 + arg31;
            int v21 = v5 * v7 - v16 * v18 >> 16;
            v7 = v18 * v5 + v7 * v16 >> 16;
            v0.ag[v8] = v7 - v17;
            v0.am[v8] = v0.bo.bp * 0xEFC907A3 * v9 / arg32 + v20;
            v0.az[v8] = v19 + v0.bo.bp * 0x9F04AC9F * v21 / arg32;
            if(v1.ay > 0) {
                v0.ah[v8] = v9;
                v0.at[v8] = v21;
                v0.ay[v8] = v7;
            }

            ++v8;
            v7 = v20;
        }

        aw v25 = this;
        ca v26 = arg24;
        long v29 = 0;
        try {
            v25.ar(v26, false, false, v29);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    final void ar(ca arg20, boolean arg21, boolean arg22, long arg23) {
        int v4_1;
        int[] v6_1;
        int[] v5_1;
        int v7;
        int v6;
        int v2;
        int v12;
        int v11;
        int v15;
        int v10;
        int v9;
        int v8;
        int v5;
        aw v1 = this;
        ca v0 = arg20;
        try {
            if(v0.bx >= 1600) {
                return;
            }

            int v3;
            for(v3 = 0; v3 < v0.bx; ++v3) {
                v1.ao[v3] = 0;
            }

            boolean v4 = arg22;
            for(v3 = 0; v3 < v0.aq; ++v3) {
                if(v0.au[v3] == -2) {
                }
                else {
                    v5 = v0.ab[v3];
                    v8 = v0.af[v3];
                    v9 = v0.ai[v3];
                    v10 = v1.am[v5];
                    v15 = v1.am[v8];
                    int v14 = v1.am[v9];
                    if(arg21) {
                        v11 = -5000;
                        if(v10 != v11 && v11 != v15 && v14 != v11) {
                            goto label_102;
                        }

                        v10 = v1.ah[v5];
                        v11 = v1.ah[v8];
                        v12 = v1.ah[v9];
                        int v13 = v1.at[v5];
                        v14 = v1.at[v8];
                        v15 = v1.at[v9];
                        v2 = v1.ay[v5];
                        v6 = v1.ay[v8];
                        v10 -= v11;
                        v12 -= v11;
                        v13 -= v14;
                        v15 -= v14;
                        v2 -= v6;
                        v7 = v1.ay[v9] - v6;
                        if((v10 * v15 - v13 * v12) * v6 + ((v2 * v12 - v7 * v10) * v14 + v11 * (v13 * v7 - v15 * v2)) <= 0) {
                            goto label_184;
                        }

                        v1.au[v3] = true;
                        v2 = (v1.ag[v5] + v1.ag[v8] + v1.ag[v9]) / 3 + v0.bg;
                        v5_1 = v1.as[v2];
                        v6_1 = v1.ao;
                        v7 = v6_1[v2];
                        v6_1[v2] = v7 + 1;
                        v5_1[v7] = v3;
                        goto label_184;
                    }

                label_102:
                    if(v4) {
                        v2 = v14;
                        v6 = v15;
                        if(ah.ao(v1.az[v5], v1.az[v8], v1.az[v9], v10, v15, v2, 5, 0x6FD5490)) {
                            lt.am(arg23);
                            v4 = false;
                        }
                    }
                    else {
                        v2 = v14;
                        v6 = v15;
                    }

                    if((v10 - v6) * (v1.az[v9] - v1.az[v8]) - (v2 - v6) * (v1.az[v5] - v1.az[v8]) <= 0) {
                        goto label_184;
                    }

                    v1.au[v3] = false;
                    if(v10 < 0 || v6 < 0 || v2 < 0) {
                    label_162:
                        v1.aa[v3] = true;
                    }
                    else {
                        v11 = 1109746211;
                        if(v10 > v1.bo.by * v11) {
                            goto label_162;
                        }
                        else if(v6 > v1.bo.by * v11) {
                            goto label_162;
                        }
                        else if(v2 > v1.bo.by * v11) {
                            goto label_162;
                        }
                        else {
                            v1.aa[v3] = false;
                        }
                    }

                    v2 = v0.bg + (v1.ag[v9] + (v1.ag[v8] + v1.ag[v5])) / 3;
                    v5_1 = v1.as[v2];
                    v6_1 = v1.ao;
                    v7 = v6_1[v2];
                    v6_1[v2] = v7 + 1;
                    v5_1[v7] = v3;
                }

            label_184:
            }

            if(v0.am == null) {
                v2 = v0.bx - 1;
                goto label_192;
            }

            for(v2 = 0; v2 < 12; ++v2) {
                v1.ak[v2] = 0;
                v1.bf[v2] = 0;
            }

            for(v2 = v0.bx - 1; true; --v2) {
                v3 = 10;
                if(v2 < 0) {
                    break;
                }

                v4_1 = v1.ao[v2];
                if(v4_1 > 0) {
                    v5_1 = v1.as[v2];
                    for(v6 = 0; v6 < v4_1; ++v6) {
                        v7 = v5_1[v6];
                        v8 = v0.am[v7];
                        int[] v9_1 = v1.ak;
                        v10 = v9_1[v8];
                        v9_1[v8] = v10 + 1;
                        v1.ac[v8][v10] = v7;
                        if(v8 < v3) {
                            v1.bf[v8] += v2;
                        }
                        else if(v8 == v3) {
                            v1.bd[v10] = v2;
                        }
                        else {
                            v1.ba[v10] = v2;
                        }
                    }
                }
            }

            v4_1 = 2;
            v2 = v1.ak[1] > 0 || v1.ak[v4_1] > 0 ? (v1.bf[1] + v1.bf[v4_1]) / (v1.ak[1] + v1.ak[v4_1]) : 0;
            v5 = 4;
            v4_1 = v1.ak[3] > 0 || v1.ak[v5] > 0 ? (v1.bf[3] + v1.bf[v5]) / (v1.ak[3] + v1.ak[v5]) : 0;
            v6 = 6;
            v7 = 8;
            v5 = v1.ak[v6] > 0 || v1.ak[v7] > 0 ? (v1.bf[v7] + v1.bf[v6]) / (v1.ak[v7] + v1.ak[v6]) : 0;
            v6 = v1.ak[v3];
            int[] v7_1 = v1.ac[v3];
            int[] v8_1 = v1.bd;
            v9 = 11;
            if(v6 == 0) {
                v6 = v1.ak[v9];
                v7_1 = v1.ac[v9];
                v8_1 = v1.ba;
            }

            v12 = v6 > 0 ? v8_1[0] : -1000;
            int[] v13_1 = v7_1;
            int[] v14_1 = v8_1;
            v7 = 0;
            v8 = v6;
            v6 = 0;
            while(v6 < v3) {
                while(v6 == 0) {
                    if(v12 <= v2) {
                        break;
                    }

                    v12 = v7 + 1;
                    v1.an(v0, v13_1[v7], 0x68DF610B);
                    if(v12 != v8 || v1.ac[v9] == v13_1) {
                        v7 = v12;
                    }
                    else {
                        v7 = v1.ak[v9];
                        v13_1 = v1.ac[v9];
                        v14_1 = v1.ba;
                        v8 = v7;
                        v7 = 0;
                    }

                    if(v7 < v8) {
                        v12 = v14_1[v7];
                        continue;
                    }

                    v12 = -1000;
                }

                v15 = 3;
                while(v6 == v15) {
                    if(v12 <= v4_1) {
                        break;
                    }

                    v12 = v7 + 1;
                    v1.an(v0, v13_1[v7], 0x6054FD1D);
                    if(v8 != v12 || v1.ac[v9] == v13_1) {
                        v7 = v12;
                    }
                    else {
                        v3 = v1.ak[v9];
                        v13_1 = v1.ac[v9];
                        v14_1 = v1.ba;
                        v7 = 0;
                        v8 = v3;
                    }

                    if(v7 < v8) {
                        v12 = v14_1[v7];
                        continue;
                    }

                    v12 = -1000;
                }

                while(5 == v6) {
                    if(v12 <= v5) {
                        break;
                    }

                    v3 = v7 + 1;
                    v1.an(v0, v13_1[v7], 0x5BFBECDD);
                    if(v3 != v8 || v13_1 == v1.ac[v9]) {
                        v7 = v3;
                    }
                    else {
                        v8 = v1.ak[v9];
                        v13_1 = v1.ac[v9];
                        v14_1 = v1.ba;
                        v7 = 0;
                    }

                    if(v7 < v8) {
                        v12 = v14_1[v7];
                        continue;
                    }

                    v12 = -1000;
                }

                v3 = v1.ak[v6];
                int[] v11_1 = v1.ac[v6];
                for(v15 = 0; v15 < v3; ++v15) {
                    v1.an(v0, v11_1[v15], 0x7FB96998);
                }

                ++v6;
                v3 = 10;
                v9 = 11;
            }

            v2 = -1000;
            while(true) {
            label_445:
                if(v2 == v12) {
                    return;
                }

                v3 = v7 + 1;
                v1.an(v0, v13_1[v7], 1937010536);
                if(v3 == v8) {
                    v5 = 11;
                    if(v1.ac[v5] != v13_1) {
                        v13_1 = v1.ac[v5];
                        v8 = v1.ak[v5];
                        v14_1 = v1.ba;
                        v7 = 0;
                    }
                    else {
                        goto label_466;
                    }
                }
                else {
                label_466:
                    v7 = v3;
                }

                if(v7 >= v8) {
                    break;
                }

                v12 = v14_1[v7];
            }
        }
        catch(RuntimeException v0_1) {
            goto label_475;
        }

        v12 = -1000;
        goto label_445;
        return;
        try {
        label_192:
            while(v2 >= 0) {
                v3 = v1.ao[v2];
                if(v3 > 0) {
                    int[] v4_2 = v1.as[v2];
                    for(v5 = 0; v5 < v3; ++v5) {
                        v1.an(v0, v4_2[v5], 0x6904CCFC);
                    }
                }

                --v2;
            }

            return;
        }
        catch(RuntimeException v0_1) {
        label_475:
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("aw.ar(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public void at(bm arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, long arg36) {
        int v25;
        int v24;
        boolean v0_1;
        int v17_1;
        aw v6 = this;
        int v7 = arg28;
        ca v13 = arg27.as();
        if(v13 == null) {
            return;
        }

        boolean v14 = false;
        v6.ao[0] = -1;
        if(v13.bt != 1) {
            v13.ap();
        }

        v13.an(v7);
        int v0 = arg32 * arg35 - arg31 * arg33 >> 16;
        int v4 = arg29 * arg34 + v0 * arg30 >> 16;
        int v1 = v13.bq * arg30 >> 16;
        int v2 = v1 + v4;
        if(v2 > 50) {
            if(v4 >= 0xD66D532F) {
            }
            else {
                int v5 = arg31 * arg35 + arg32 * arg33 >> 16;
                int v16 = 574766503;
                int v3 = (v5 - v13.bq) * (v6.bo.bp * v16);
                int v8 = v3 / v2;
                if(v8 >= v6.bo.bq * 0x199CB385) {
                    return;
                }
                else {
                    int v18 = v8;
                    int v9 = (v13.bq + v5) * (v6.bo.bp * -1853070946);
                    v8 = v9 / v2;
                    if(v8 <= v6.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        v0 = arg30 * arg34 - v0 * arg29 >> 16;
                        int v12 = v13.bq * arg29 >> 16;
                        int v19 = v8;
                        v8 = v6.bo.bp * v16 * (v12 + v0);
                        int v11 = v8 / v2;
                        if(v11 <= v6.bo.bx * 0x9F147F0E) {
                            return;
                        }
                        else {
                            int v20 = v11;
                            v11 = v6.bo.bp * v16 * (v0 - ((v13.bh * 0xCD6CEDE3 * arg30 >> 16) + v12));
                            v2 = v11 / v2;
                            if(v2 >= v6.bo.bg * 0x560C1795) {
                                return;
                            }
                            else {
                                int v10 = v4 - ((arg29 * (v13.bh * 0x23AF4473) >> 16) + v1) <= 50 ? 1 : 0;
                                v10 = v10 != 0 || v13.ay > 0 ? 1 : 0;
                                v12 = jb.ah(0x74);
                                v16 = eu.at(80);
                                boolean v17 = bf.az(-15);
                                int v22 = 0xF7F729AF;
                                int v23 = 1126407459;
                                if(!aq.ae(arg36) || !v17) {
                                    v17_1 = v4;
                                label_188:
                                    v0_1 = false;
                                }
                                else {
                                    if(bc.ax) {
                                        v17_1 = v4;
                                        v0_1 = ew.aw(v13, arg33, arg34, arg35, this, -52);
                                    }
                                    else {
                                        v17_1 = v4;
                                        v1 = v17_1 - v1;
                                        v4 = 50;
                                        if(v1 <= v4) {
                                        }
                                        else {
                                            v4 = v1;
                                        }

                                        if(v5 > 0) {
                                            v3 = v9 / v4;
                                            v1 = v18;
                                        }
                                        else {
                                            v1 = v3 / v4;
                                            v3 = v19;
                                        }

                                        if(v0 > 0) {
                                            v11 = v8 / v4;
                                        }
                                        else {
                                            v2 = v11 / v4;
                                            v11 = v20;
                                        }

                                        v12 -= v6.bo.bw * v23;
                                        v0 = v16 - v6.bo.bo * v22;
                                        if(v12 > v1 && v12 < v3 && v0 > v2 && v0 < v11) {
                                            v0_1 = true;
                                            goto label_179;
                                        }

                                        v0_1 = false;
                                    }

                                label_179:
                                    if(!v0_1) {
                                        goto label_188;
                                    }

                                    if(v13.bf) {
                                        lt.am(arg36);
                                        goto label_188;
                                    }

                                    v0_1 = true;
                                }

                                v1 = v6.bo.bw * v23;
                                v2 = v6.bo.bo * v22;
                                if(v7 != 0) {
                                    v3 = aw.aj[v7];
                                    v4 = aw.ad[v7];
                                }
                                else {
                                    v3 = 0;
                                    v4 = 0;
                                }

                                v5 = 0;
                                while(v5 < v13.an) {
                                    v8 = v13.ap[v5];
                                    v9 = v13.aj[v5];
                                    v11 = v13.ad[v5];
                                    if(v7 != 0) {
                                        v12 = v11 * v3 + v4 * v8 >> 16;
                                        v11 = v11 * v4 - v8 * v3 >> 16;
                                    }
                                    else {
                                        v12 = v8;
                                    }

                                    v12 += arg33;
                                    v9 += arg34;
                                    v11 += arg35;
                                    v19 = v12 * arg32 + arg31 * v11 >> 16;
                                    v11 = v11 * arg32 - v12 * arg31 >> 16;
                                    v12 = v9 * arg30 - v11 * arg29 >> 16;
                                    v9 = v9 * arg29 + v11 * arg30 >> 16;
                                    v6.ag[v5] = v9 - v17_1;
                                    if(v9 >= 0x743C762) {
                                        v24 = v3;
                                        v6.am[v5] = v6.bo.bp * 0xBFB364F4 * v19 / v9 + v1;
                                        v25 = v1;
                                        v6.az[v5] = v6.bo.bp * 2043779880 * v12 / v9 + v2;
                                    }
                                    else {
                                        v25 = v1;
                                        v24 = v3;
                                        v6.am[v5] = 0xECA3D331;
                                        v14 = true;
                                    }

                                    if(v10 != 0) {
                                        v6.ah[v5] = v19;
                                        v6.at[v5] = v12;
                                        v6.ay[v5] = v9;
                                    }

                                    ++v5;
                                    v3 = v24;
                                    v1 = v25;
                                }

                                aw v27 = this;
                                ca v28 = v13;
                                boolean v29 = v14;
                                boolean v30 = v0_1;
                                long v31 = arg36;
                                try {
                                    v27.ar(v28, v29, v30, v31);
                                    return;
                                }
                                catch(Exception ) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void au(ca arg32, int arg33) {
        int v9;
        int v8;
        int v6;
        aw v0 = this;
        ca v1 = arg32;
        int v2 = arg33;
        if(v0.au[v2]) {
            v0.ap(v1, v2, 0x1C403617);
            return;
        }

        int v3 = v1.ab[v2];
        int v4 = v1.af[v2];
        int v5 = v1.ai[v2];
        v0.bo.ac = v0.aa[v2];
        v0.bo.bn = v1.az == null ? 0 : (v1.az[v2] & 0xFF) * 0x308B19C3;
        int v7 = -1;
        if(v1.ah == null || v1.ah[v2] == v7) {
            if(v1.au[v2] == v7) {
                v0.bo.aj(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], aw.aq[v1.av[v2]], -580105415);
                return;
            }

            v0.bo.an(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], v1.av[v2], v1.aa[v2], v1.au[v2], 86805035);
        }
        else {
            if(v1.ag == null || v1.ag[v2] == v7) {
                v8 = v3;
                v9 = v4;
                v6 = v5;
            }
            else {
                v6 = v1.ag[v2] & 0x8EFA1375;
                v8 = v1.aw[v6];
                v9 = v1.ao[v6];
                v6 = v1.as[v6];
            }

            if(v7 == v1.au[v2]) {
                v0.bo.aq(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], v1.av[v2], v1.av[v2], v1.av[v2], v0.ah[v8], v0.ah[v9], v0.ah[v6], v0.at[v8], v0.at[v9], v0.at[v6], v0.ay[v8], v0.ay[v9], v0.ay[v6], v1.ah[v2], 0);
                return;
            }

            v0.bo.aq(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], v1.av[v2], v1.aa[v2], v1.au[v2], v0.ah[v8], v0.ah[v9], v0.ah[v6], v0.at[v8], v0.at[v9], v0.at[v6], v0.ay[v8], v0.ay[v9], v0.ay[v6], v1.ah[v2], 0);
        }
    }

    final void av(ca arg32, int arg33) {
        int v29;
        int v28;
        int v27;
        int v26;
        int v25;
        int v24;
        int v23;
        int v22;
        int v21;
        int v20;
        int v19;
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        int v11;
        bt v10;
        int v9;
        int v8;
        int v6;
        aw v0 = this;
        ca v1 = arg32;
        int v2 = arg33;
        if(v0.au[v2]) {
            v0.ap(v1, v2, 0xE393C95B);
            return;
        }

        int v3 = v1.ab[v2];
        int v4 = v1.af[v2];
        int v5 = v1.ai[v2];
        v0.bo.ac = v0.aa[v2];
        v0.bo.bn = v1.az == null ? 0 : (v1.az[v2] & 0xFF) * 0x308B19C3;
        int v7 = -1;
        if(v1.ah == null || v1.ah[v2] == v7) {
            if(v1.au[v2] == v7) {
                v0.bo.aj(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], aw.aq[v1.av[v2]], 0xA45586F3);
                return;
            }

            v0.bo.an(v0.az[v3], v0.az[v4], v0.az[v5], v0.am[v3], v0.am[v4], v0.am[v5], v1.av[v2], v1.aa[v2], v1.au[v2], 86805035);
        }
        else {
            if(v1.ag == null || v1.ag[v2] == v7) {
                v8 = v3;
                v9 = v4;
                v6 = v5;
            }
            else {
                v6 = v1.ag[v2] & 0xFF;
                v8 = v1.aw[v6];
                v9 = v1.ao[v6];
                v6 = v1.as[v6];
            }

            if(v7 == v1.au[v2]) {
                v10 = v0.bo;
                v11 = v0.az[v3];
                v12 = v0.az[v4];
                v13 = v0.az[v5];
                v14 = v0.am[v3];
                v15 = v0.am[v4];
                v16 = v0.am[v5];
                v17 = v1.av[v2];
                v18 = v1.av[v2];
                v19 = v1.av[v2];
                v20 = v0.ah[v8];
                v21 = v0.ah[v9];
                v22 = v0.ah[v6];
                v23 = v0.at[v8];
                v24 = v0.at[v9];
                v25 = v0.at[v6];
                v26 = v0.ay[v8];
                v27 = v0.ay[v9];
                v28 = v0.ay[v6];
                v29 = v1.ah[v2];
            }
            else {
                v10 = v0.bo;
                v11 = v0.az[v3];
                v12 = v0.az[v4];
                v13 = v0.az[v5];
                v14 = v0.am[v3];
                v15 = v0.am[v4];
                v16 = v0.am[v5];
                v17 = v1.av[v2];
                v18 = v1.aa[v2];
                v19 = v1.au[v2];
                v20 = v0.ah[v8];
                v21 = v0.ah[v9];
                v22 = v0.ah[v6];
                v23 = v0.at[v8];
                v24 = v0.at[v9];
                v25 = v0.at[v6];
                v26 = v0.ay[v8];
                v27 = v0.ay[v9];
                v28 = v0.ay[v6];
                v29 = v1.ah[v2];
            }

            ((bj)v10).aq(v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21, v22, v23, v24, v25, v26, v27, v28, v29, 0);
        }
    }

    public void aw(bm arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, long arg34) {
        boolean v0_1;
        int v21_1;
        aw v6 = this;
        int v7 = arg26;
        ca v13 = arg25.as();
        if(v13 == null) {
            return;
        }

        boolean v14 = false;
        v6.ao[0] = -1;
        if(v13.bt != 1) {
            v13.ap();
        }

        v13.an(v7);
        int v0 = arg30 * arg33 - arg29 * arg31 >> 16;
        int v4 = arg27 * arg32 + v0 * arg28 >> 16;
        int v1 = v13.bq * arg28 >> 16;
        int v2 = v1 + v4;
        if(v2 > 50) {
            if(v4 >= 2100257730) {
            }
            else {
                int v5 = arg29 * arg33 + arg30 * arg31 >> 16;
                int v3 = (v5 - v13.bq) * (v6.bo.bp * 0xA31CD6F7);
                int v8 = v3 / v2;
                if(v8 >= v6.bo.bq * 0x36E3B7F) {
                    return;
                }
                else {
                    int v18 = v8;
                    int v9 = (v13.bq + v5) * (v6.bo.bp * -1512616404);
                    v8 = v9 / v2;
                    if(v8 <= v6.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        v0 = arg28 * arg32 - v0 * arg27 >> 16;
                        int v12 = v13.bq * arg27 >> 16;
                        int v19 = v8;
                        v8 = v6.bo.bp * -903990662 * (v12 + v0);
                        int v11 = v8 / v2;
                        if(v11 <= v6.bo.bx * 0xB31C2AE1) {
                            return;
                        }
                        else {
                            int v20 = v11;
                            v11 = v6.bo.bp * 0x220CAA88 * (v0 - ((v13.bh * 0x6E0B5CD1 * arg28 >> 16) + v12));
                            v2 = v11 / v2;
                            if(v2 >= v6.bo.bg * 0x560C1795) {
                                return;
                            }
                            else {
                                v12 = 50;
                                int v10 = v4 - ((arg27 * (v13.bh * 0xD0736F83) >> 16) + v1) <= v12 ? 1 : 0;
                                v10 = v10 != 0 || v13.ay > 0 ? 1 : 0;
                                int v16 = jb.ah(90);
                                int v17 = eu.at(0x72);
                                boolean v21 = bf.az(3);
                                if(!aq.ae(arg34) || !v21) {
                                    v21_1 = v4;
                                label_189:
                                    v0_1 = false;
                                }
                                else {
                                    if(bc.ax) {
                                        v21_1 = v4;
                                        v0_1 = ew.aw(v13, arg31, arg32, arg33, this, -51);
                                    }
                                    else {
                                        v21_1 = v4;
                                        v4 = v21_1 - v1;
                                        if(v4 <= 0x905776A7) {
                                            v4 = -2044798939;
                                        }

                                        if(v5 > 0) {
                                            v3 = v9 / v4;
                                            v1 = v18;
                                        }
                                        else {
                                            v1 = v3 / v4;
                                            v3 = v19;
                                        }

                                        if(v0 > 0) {
                                            v11 = v8 / v4;
                                        }
                                        else {
                                            v2 = v11 / v4;
                                            v11 = v20;
                                        }

                                        v0 = v16 - v6.bo.bw * 0x21A66DBF;
                                        v4 = v17 - v6.bo.bo * 0xF7F729AF;
                                        if(v0 > v1 && v0 < v3 && v4 > v2 && v4 < v11) {
                                            v0_1 = true;
                                            goto label_180;
                                        }

                                        v0_1 = false;
                                    }

                                label_180:
                                    if(!v0_1) {
                                        goto label_189;
                                    }

                                    if(v13.bf) {
                                        lt.am(arg34);
                                        goto label_189;
                                    }

                                    v0_1 = true;
                                }

                                v1 = v6.bo.bw * 1126407459;
                                v3 = v6.bo.bo * 0x3971520B;
                                if(v7 != 0) {
                                    v2 = aw.aj[v7];
                                    v4 = aw.ad[v7];
                                }
                                else {
                                    v2 = 0;
                                    v4 = 0;
                                }

                                v5 = 0;
                                while(v5 < v13.an) {
                                    v8 = v13.ap[v5];
                                    v9 = v13.aj[v5];
                                    v11 = v13.ad[v5];
                                    if(v7 != 0) {
                                        v16 = v11 * v2 + v4 * v8 >> 16;
                                        v11 = v11 * v4 - v8 * v2 >> 16;
                                    }
                                    else {
                                        v16 = v8;
                                    }

                                    v16 += arg31;
                                    v9 += arg32;
                                    v11 += arg33;
                                    v20 = v16 * arg30 + arg29 * v11 >> 16;
                                    v11 = v11 * arg30 - v16 * arg29 >> 16;
                                    v16 = v9 * arg28 - v11 * arg27 >> 16;
                                    v9 = v9 * arg27 + v11 * arg28 >> 16;
                                    v6.ag[v5] = v9 - v21_1;
                                    if(v9 >= v12) {
                                        v6.am[v5] = v6.bo.bp * 574766503 * v20 / v9 + v1;
                                        v6.az[v5] = v6.bo.bp * 574766503 * v16 / v9 + v3;
                                    }
                                    else {
                                        v6.am[v5] = -74022568;
                                        v14 = true;
                                    }

                                    if(v10 != 0) {
                                        v6.ah[v5] = v20;
                                        v6.at[v5] = v16;
                                        v6.ay[v5] = v9;
                                    }

                                    ++v5;
                                    v12 = 50;
                                }

                                aw v25 = this;
                                ca v26 = v13;
                                boolean v27 = v14;
                                boolean v28 = v0_1;
                                long v29 = arg34;
                                try {
                                    v25.ar(v26, v27, v28, v29);
                                    return;
                                }
                                catch(Exception ) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    static long ax(int arg0, int arg1, int arg2, byte arg3) {
        return ((long)(arg0 << 8 | arg2 << 16 | arg1));
    }

    public final void ax(ca arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31) {
        int v1_1;
        int v19;
        int v18;
        int v16;
        int v5;
        int v15;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v7;
        int v9;
        int v6;
        int v8;
        aw v1 = this;
        ca v0 = arg23;
        try {
            v8 = 0;
            v1.ao[0] = -1;
            if(v0.bt != 2 && 1 != v0.bt) {
                arg23.aj();
            }

            v6 = v1.bo.bw * 1126407459;
            v9 = v1.bo.bo * 0xF7F729AF;
            v7 = aw.aj[arg24];
            v10 = aw.ad[arg24];
            v11 = aw.aj[arg25];
            v12 = aw.ad[arg25];
            v13 = aw.aj[arg26];
            v14 = aw.ad[arg26];
            v15 = aw.aj[arg27];
            v5 = aw.ad[arg27];
            v16 = arg30 * v5 + v15 * arg29 >> 16;
            v18 = v9;
            while(true) {
            label_42:
                if(v8 >= v0.an) {
                    goto label_128;
                }

                v9 = v0.ap[v8];
                v19 = v6;
                v6 = v0.aj[v8];
                break;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_139;
        }

        try {
            v1_1 = v0.ad[v8];
            if(arg26 == 0) {
                goto label_61;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_139;
        }

        int v17 = v9 * v14 + v6 * v13 >> 16;
        v6 = v6 * v14 - v9 * v13 >> 16;
        v9 = v17;
    label_61:
        if(arg24 != 0) {
            v17 = v10 * v6 - v1_1 * v7 >> 16;
            v1_1 = v1_1 * v10 + v6 * v7 >> 16;
            v6 = v17;
        }

        if(arg25 != 0) {
            v17 = v1_1 * v11 + v12 * v9 >> 16;
            v1_1 = v1_1 * v12 - v9 * v11 >> 16;
            v9 = v17;
        }

        v9 += arg28;
        v6 += arg29;
        v17 = v1_1 + arg30;
        int v20 = v5 * v6 - v17 * v15 >> 16;
        v6 = v17 * v5 + v6 * v15 >> 16;
        v1 = this;
        try {
            v1.ag[v8] = v6 - v16;
            v1.am[v8] = v19 + v1.bo.bp * 574766503 * v9 / v6;
            v1.az[v8] = v1.bo.bp * 574766503 * v20 / v6 + v18;
            if(v0.ay > 0) {
                v1.ah[v8] = v9;
                v1.at[v8] = v20;
                v1.ay[v8] = v6;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_139;
        }

        ++v8;
        v6 = v19;
        goto label_42;
    label_128:
        aw v24 = this;
        ca v25 = arg23;
        long v28 = 0;
        try {
            v24.ar(v25, false, false, v28);
            return;
        }
        catch(RuntimeException v0_1) {
        }
        catch(Exception ) {
            return;
        }

    label_139:
        StringBuilder v2 = new StringBuilder();
        v2.append("aw.ax(");
        v2.append(')');
        throw lx.al(((Throwable)v0_1), v2.toString());
    }

    public void ay(bm arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, long arg35) {
        boolean v0_1;
        int v15;
        aw v6 = this;
        int v7 = arg27;
        ca v13 = arg26.as();
        if(v13 == null) {
            return;
        }

        boolean v14 = false;
        v6.ao[0] = -1;
        if(v13.bt != 1) {
            v13.ap();
        }

        v13.an(v7);
        int v0 = arg31 * arg34 - arg30 * arg32 >> 16;
        int v4 = arg28 * arg33 + v0 * arg29 >> 16;
        int v1 = v13.bq * arg29 >> 16;
        int v2 = v1 + v4;
        if(v2 > 50) {
            if(v4 >= 0x6CF17317) {
            }
            else {
                int v3 = arg30 * arg34 + arg31 * arg32 >> 16;
                int v16 = 574766503;
                int v5 = (v3 - v13.bq) * (v6.bo.bp * v16);
                int v8 = v5 / v2;
                if(v8 >= v6.bo.bq * 0x701A1FBE) {
                    return;
                }
                else {
                    int v19 = v8;
                    int v9 = (v13.bq + v3) * (v6.bo.bp * v16);
                    v8 = v9 / v2;
                    if(v8 <= v6.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        v0 = arg29 * arg33 - v0 * arg28 >> 16;
                        int v12 = v13.bq * arg28 >> 16;
                        int v20 = v8;
                        v8 = v6.bo.bp * v16 * (v12 + v0);
                        int v11 = v8 / v2;
                        if(v11 <= v6.bo.bx * 0xAEA77BD7) {
                            return;
                        }
                        else {
                            int v18 = 0xCD6CEDE3;
                            v12 = v6.bo.bp * v16 * (v0 - ((v13.bh * v18 * arg29 >> 16) + v12));
                            v2 = v12 / v2;
                            int v21 = v11;
                            if(v2 >= v6.bo.bg * 0x1F7F47AE) {
                                return;
                            }
                            else {
                                int v10 = v4 - ((v13.bh * v18 * arg28 >> 16) + v1) <= 460579659 ? 1 : 0;
                                v10 = v10 != 0 || v13.ay > 0 ? 1 : 0;
                                v11 = jb.ah(56);
                                v18 = eu.at(61);
                                boolean v22 = bf.az(-31);
                                if(!aq.ae(arg35) || !v22) {
                                    v15 = v4;
                                    v4 = 50;
                                label_188:
                                    v0_1 = false;
                                }
                                else {
                                    if(bc.ax) {
                                        v15 = v4;
                                        v0_1 = ew.aw(v13, arg32, arg33, arg34, this, -65);
                                        v4 = 50;
                                    }
                                    else {
                                        v15 = v4;
                                        v4 = 50;
                                        v1 = v15 - v1;
                                        if(v1 <= v4) {
                                            v1 = 50;
                                        }

                                        if(v3 > 0) {
                                            v5 = v9 / v1;
                                            v3 = v19;
                                        }
                                        else {
                                            v3 = v5 / v1;
                                            v5 = v20;
                                        }

                                        if(v0 > 0) {
                                            v0 = v8 / v1;
                                        }
                                        else {
                                            v2 = v12 / v1;
                                            v0 = v21;
                                        }

                                        v11 -= v6.bo.bw * 1126407459;
                                        v1 = v18 - v6.bo.bo * 0xF7F729AF;
                                        if(v11 > v3 && v11 < v5 && v1 > v2 && v1 < v0) {
                                            v0_1 = true;
                                            goto label_178;
                                        }

                                        v0_1 = false;
                                    }

                                label_178:
                                    if(!v0_1) {
                                        goto label_188;
                                    }

                                    if(v13.bf) {
                                        lt.am(arg35);
                                        goto label_188;
                                    }

                                    v0_1 = true;
                                }

                                v1 = v6.bo.bw * 0xE82C28BD;
                                v3 = v6.bo.bo * 0xED6C05D9;
                                if(v7 != 0) {
                                    v2 = aw.aj[v7];
                                    v5 = aw.ad[v7];
                                }
                                else {
                                    v2 = 0;
                                    v5 = 0;
                                }

                                v8 = 0;
                                while(v8 < v13.an) {
                                    v9 = v13.ap[v8];
                                    v11 = v13.aj[v8];
                                    v12 = v13.ad[v8];
                                    if(v7 != 0) {
                                        v18 = v12 * v2 + v5 * v9 >> 16;
                                        v12 = v12 * v5 - v9 * v2 >> 16;
                                    }
                                    else {
                                        v18 = v9;
                                    }

                                    v18 += arg32;
                                    v11 += arg33;
                                    v12 += arg34;
                                    int v22_1 = v18 * arg31 + arg30 * v12 >> 16;
                                    v12 = v12 * arg31 - v18 * arg30 >> 16;
                                    v18 = v11 * arg29 - v12 * arg28 >> 16;
                                    v11 = v11 * arg28 + v12 * arg29 >> 16;
                                    v6.ag[v8] = v11 - v15;
                                    if(v11 >= v4) {
                                        v6.am[v8] = v6.bo.bp * v16 * v22_1 / v11 + v1;
                                        v6.az[v8] = v6.bo.bp * v16 * v18 / v11 + v3;
                                    }
                                    else {
                                        v6.am[v8] = 0xB38A0C35;
                                        v14 = true;
                                    }

                                    if(v10 != 0) {
                                        v6.ah[v8] = v22_1;
                                        v6.at[v8] = v18;
                                        v6.ay[v8] = v11;
                                    }

                                    ++v8;
                                    v4 = 50;
                                }

                                aw v26 = this;
                                ca v27 = v13;
                                boolean v28 = v14;
                                boolean v29 = v0_1;
                                long v30 = arg35;
                                try {
                                    v26.ar(v27, v28, v29, v30);
                                    return;
                                }
                                catch(Exception ) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final void az(ca arg48, int arg49) {
        int v46;
        int v45;
        int v44;
        int v11;
        int v16;
        int v12;
        int v15;
        int v13;
        int v20;
        int v21;
        int v22;
        aw v0 = this;
        ca v1 = arg48;
        int v3 = v0.bo.bw * 1126407459;
        int v4 = v0.bo.bo * 0xF7F729AF;
        int v5 = v1.ab[arg49];
        int v6 = v1.af[arg49];
        int v7 = v1.ai[arg49];
        int v8 = v0.ay[v5];
        int v9 = v0.ay[v6];
        int v10 = v0.ay[v7];
        v0.bo.bn = v1.az == null ? 0 : (v1.az[arg49] & 0xFF) * 0x308B19C3;
        int v14 = 50;
        if(v8 >= v14) {
            v0.bn[0] = v0.am[v5];
            v0.bp[0] = v0.az[v5];
            v0.bw[0] = v1.av[arg49];
            v22 = v5;
            v21 = v7;
            v20 = v10;
            v5 = 50;
            v13 = 1;
        }
        else {
            v13 = v0.ah[v5];
            v15 = v0.at[v5];
            v12 = v1.av[arg49];
            if(v10 >= v14) {
                v16 = aw.ab[v10 - v8] * (50 - v8);
                v20 = v10;
                v0.bn[0] = (((v0.ah[v7] - v13) * v16 >> 16) + v13) * (v0.bo.bp * 574766503) / 50 + v3;
                v0.bp[0] = (((v0.at[v7] - v15) * v16 >> 16) + v15) * (v0.bo.bp * 574766503) / 50 + v4;
                v0.bw[0] = (v16 * (v1.au[arg49] - v12) >> 16) + v12;
                v10 = 1;
            }
            else {
                v20 = v10;
                v10 = 0;
            }

            if(v9 >= 50) {
                v14 = (50 - v8) * aw.ab[v9 - v8];
                v21 = v7;
                v22 = v5;
                v0.bn[v10] = v0.bo.bp * 574766503 * (((v0.ah[v6] - v13) * v14 >> 16) + v13) / 50 + v3;
                v0.bp[v10] = v0.bo.bp * 574766503 * (((v0.at[v6] - v15) * v14 >> 16) + v15) / 50 + v4;
                v13 = v10 + 1;
                v0.bw[v10] = (v14 * (v1.aa[arg49] - v12) >> 16) + v12;
            }
            else {
                v22 = v5;
                v21 = v7;
                v13 = v10;
            }

            v5 = 50;
        }

        if(v9 >= v5) {
            v0.bn[v13] = v0.am[v6];
            v0.bp[v13] = v0.az[v6];
            v7 = v13 + 1;
            v0.bw[v13] = v1.aa[arg49];
            v11 = v20;
        }
        else {
            v5 = v0.ah[v6];
            v7 = v0.at[v6];
            v10 = v1.aa[arg49];
            if(v8 >= 50) {
                v12 = aw.ab[v8 - v9] * (50 - v9);
                v0.bn[v13] = (((v0.ah[v22] - v5) * v12 >> 16) + v5) * (v0.bo.bp * 574766503) / 50 + v3;
                v0.bp[v13] = v0.bo.bp * 574766503 * (((v0.at[v22] - v7) * v12 >> 16) + v7) / 50 + v4;
                v0.bw[v13] = ((v1.av[arg49] - v10) * v12 >> 16) + v10;
                ++v13;
            }

            v11 = v20;
            if(v11 >= 50) {
                v14 = (50 - v9) * aw.ab[v11 - v9];
                v0.bn[v13] = (((v0.ah[v21] - v5) * v14 >> 16) + v5) * (v0.bo.bp * 574766503) / 50 + v3;
                v0.bp[v13] = (v7 + ((v0.at[v21] - v7) * v14 >> 16)) * (v0.bo.bp * 574766503) / 50 + v4;
                v7 = v13 + 1;
                v0.bw[v13] = v10 + (v14 * (v1.au[arg49] - v10) >> 16);
                goto label_184;
            }

            v7 = v13;
        }

    label_184:
        v5 = 50;
        if(v11 >= v5) {
            v0.bn[v7] = v0.am[v21];
            v0.bp[v7] = v0.az[v21];
            v4 = v7 + 1;
            v0.bw[v7] = v1.au[arg49];
        }
        else {
            v5 = v0.ah[v21];
            v10 = v0.at[v21];
            v12 = v1.au[arg49];
            if(v9 >= 50) {
                v9 = aw.ab[v9 - v11] * (50 - v11);
                v0.bn[v7] = v0.bo.bp * 574766503 * (((v0.ah[v6] - v5) * v9 >> 16) + v5) / 50 + v3;
                v0.bp[v7] = (((v0.at[v6] - v10) * v9 >> 16) + v10) * (v0.bo.bp * 574766503) / 50 + v4;
                v14 = v7 + 1;
                v0.bw[v7] = (v9 * (v1.aa[arg49] - v12) >> 16) + v12;
            }
            else {
                v14 = v7;
            }

            if(v8 >= 50) {
                v9 = (50 - v11) * aw.ab[v8 - v11];
                v0.bn[v14] = (((v0.ah[v22] - v5) * v9 >> 16) + v5) * (v0.bo.bp * 574766503) / 50 + v3;
                v0.bp[v14] = v4 + v0.bo.bp * 574766503 * (v10 + ((v0.at[v22] - v10) * v9 >> 16)) / 50;
                v4 = v14 + 1;
                v0.bw[v14] = ((v1.av[arg49] - v12) * v9 >> 16) + v12;
                goto label_412;
            }

            v4 = v14;
        }

    label_412:
        v3 = v0.bn[0];
        v15 = v0.bn[1];
        v16 = 2;
        v14 = v0.bn[v16];
        int v17 = v0.bp[0];
        int v18 = v0.bp[1];
        int v19 = v0.bp[v16];
        v0.bo.ac = false;
        v5 = 1109746211;
        v13 = -1;
        if(v4 == 3) {
            if(v3 < 0 || v15 < 0 || v14 < 0 || v3 > v0.bo.by * v5 || v15 > v0.bo.by * v5 || v14 > v0.bo.by * v5) {
                v0.bo.ac = true;
            }

            if(v1.ah != null) {
                if(v13 == v1.ah[arg49]) {
                }
                else {
                    if(v1.ag == null || v13 == v1.ag[arg49]) {
                        v9 = v6;
                        v7 = v21;
                        v8 = v22;
                    }
                    else {
                        v7 = v1.ag[arg49] & 0xFF;
                        v8 = v1.aw[v7];
                        v9 = v1.ao[v7];
                        v7 = v1.as[v7];
                    }

                    if(v1.au[arg49] == v13) {
                        v0.bo.aq(v17, v18, v19, v3, v15, v14, v1.av[arg49], v1.av[arg49], v1.av[arg49], v0.ah[v8], v0.ah[v9], v0.ah[v7], v0.at[v8], v0.at[v9], v0.at[v7], v0.ay[v8], v0.ay[v9], v0.ay[v7], v1.ah[arg49], 0);
                        goto label_598;
                    }

                    v0.bo.aq(v17, v18, v19, v3, v15, v14, v0.bw[0], v0.bw[1], v0.bw[v16], v0.ah[v8], v0.ah[v9], v0.ah[v7], v0.at[v8], v0.at[v9], v0.at[v7], v0.ay[v8], v0.ay[v9], v0.ay[v7], v1.ah[arg49], 0);
                    goto label_598;
                }
            }

            if(v13 == v1.au[arg49]) {
                v44 = 3;
                v45 = v14;
                v46 = v15;
                v0.bo.aj(v17, v18, v19, v3, v15, v14, aw.aq[v1.av[arg49]], 1701333506);
                goto label_601;
            }

            v45 = v14;
            v46 = v15;
            v44 = 3;
            v0.bo.an(v17, v18, v19, v3, v46, v45, v0.bw[0], v0.bw[1], v0.bw[v16], 86805035);
        }
        else {
        label_598:
            v45 = v14;
            v46 = v15;
            v44 = 3;
        }

    label_601:
        if(v4 == 4) {
            if(v3 >= 0) {
                v4 = v46;
                if(v4 >= 0) {
                    v15 = v45;
                    if(v15 < 0) {
                        goto label_634;
                    }
                    else if(v3 > v0.bo.by * v5) {
                        goto label_634;
                    }
                    else if(v4 > v0.bo.by * v5) {
                        goto label_634;
                    }
                    else if(v15 > v0.bo.by * v5) {
                        goto label_634;
                    }
                    else if(v0.bn[v44] < 0) {
                        goto label_634;
                    }
                    else if(v0.bn[v44] > v0.bo.by * v5) {
                        goto label_634;
                    }
                }
                else {
                    v15 = v45;
                    goto label_634;
                }
            }
            else {
                v15 = v45;
                v4 = v46;
            label_634:
                v0.bo.ac = true;
            }

            if(v1.ah != null) {
                v7 = -1;
                if(v7 == v1.ah[arg49]) {
                }
                else {
                    if(v1.ag == null || v1.ag[arg49] == v7) {
                        v8 = v6;
                        v5 = v21;
                        v6 = v22;
                    }
                    else {
                        v5 = v1.ag[arg49] & 0xFF;
                        v6 = v1.aw[v5];
                        v8 = v1.ao[v5];
                        v5 = v1.as[v5];
                    }

                    v9 = v1.ah[arg49];
                    if(v1.au[arg49] == v7) {
                        v0.bo.aq(v17, v18, v19, v3, v4, v15, v1.av[arg49], v1.av[arg49], v1.av[arg49], v0.ah[v6], v0.ah[v8], v0.ah[v5], v0.at[v6], v0.at[v8], v0.at[v5], v0.ay[v6], v0.ay[v8], v0.ay[v5], v9, 0);
                        v0.bo.aq(v17, v19, v0.bp[v44], v3, v15, v0.bn[v44], v1.av[arg49], v1.av[arg49], v1.av[arg49], v0.ah[v6], v0.ah[v8], v0.ah[v5], v0.at[v6], v0.at[v8], v0.at[v5], v0.ay[v6], v0.ay[v8], v0.ay[v5], v9, 0);
                        return;
                    }

                    v0.bo.aq(v17, v18, v19, v3, v4, v15, v0.bw[0], v0.bw[1], v0.bw[v16], v0.ah[v6], v0.ah[v8], v0.ah[v5], v0.at[v6], v0.at[v8], v0.at[v5], v0.ay[v6], v0.ay[v8], v0.ay[v5], v9, 0);
                    v0.bo.aq(v17, v19, v0.bp[v44], v3, v15, v0.bn[v44], v0.bw[0], v0.bw[v16], v0.bw[v44], v0.ah[v6], v0.ah[v8], v0.ah[v5], v0.at[v6], v0.at[v8], v0.at[v5], v0.ay[v6], v0.ay[v8], v0.ay[v5], v9, 0);
                    return;
                }
            }
            else {
                v7 = -1;
            }

            if(v7 == v1.au[arg49]) {
                int v1_1 = aw.aq[v1.av[arg49]];
                v0.bo.aj(v17, v18, v19, v3, v4, v15, v1_1, 0xA8C2C042);
                v0.bo.aj(v17, v19, v0.bp[v44], v3, v15, v0.bn[v44], v1_1, 0x51CAA2B6);
                return;
            }

            v0.bo.an(v17, v18, v19, v3, v4, v15, v0.bw[0], v0.bw[1], v0.bw[v16], 86805035);
            v0.bo.an(v17, v19, v0.bp[v44], v3, v15, v0.bn[v44], v0.bw[0], v0.bw[v16], v0.bw[v44], 86805035);
        }
    }

    static void be(df arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            int v0 = 0xFE380E33;
            if(client.pd * v0 < 50) {
                if(client.py * 0x6EC3BC9B == 0) {
                }
                else if(arg3.aq != null) {
                    if(arg4 >= arg3.aq.length) {
                    }
                    else {
                        int v3_1 = arg3.aq[arg4];
                        if(v3_1 == 0) {
                            return;
                        }
                        else {
                            client.px[client.pd * v0] = v3_1 >> 8;
                            client.pq[client.pd * v0] = v3_1 >> 4 & 7;
                            client.pa[client.pd * v0] = 0;
                            client.ps[client.pd * v0] = null;
                            client.pz[client.pd * v0] = ((arg5 - 0x40) / 0x80 << 16) + ((arg6 - 0x40) / 0x80 << 8) + (v3_1 & 15);
                            client.pd += 0xC7119CFB;
                            return;
                        }
                    }
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("aw.be(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    static void hj(int arg4, int arg5) {
        try {
            mx v5;
            for(v5 = client.nu.ae(); v5 != null; v5 = client.nu.ar()) {
                if((((mo)v5).gx >> 0x30 & 0xFFFF) == (((long)arg4))) {
                    ((mo)v5).lp();
                }
            }
        }
        catch(RuntimeException v4) {
            goto label_17;
        }

        return;
    label_17:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("aw.hj(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }
}

