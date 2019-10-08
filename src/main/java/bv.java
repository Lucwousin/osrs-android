import com.jagex.oldscape.osrenderer.ax;

public class bv extends bk {
    final be al;
    final bd ax;
    public static final int be = 50;
    static long es;
    public static int tt;

    public bv(bd arg3) {
        try {
            super();
            this.ax = arg3;
            this.al = new be(this.ax);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bv.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ab(bg arg40, bn arg41, int arg42, int arg43, int arg44, int arg45, int arg46, int arg47) {
        int v15;
        int v14;
        int v13;
        int v12;
        bv v0 = this;
        bn v1 = arg41;
        int v6 = arg46;
        int v7 = arg47;
        if(!bv.ae) {
            return;
        }

        int v8 = v1.ax.length;
        int v10;
        for(v10 = 0; true; ++v10) {
            int v11 = 574766503;
            if(v10 >= v8) {
                break;
            }

            v12 = v1.ax[v10] - bg.as;
            v13 = v1.al[v10] - bg.ak;
            v14 = v1.ae[v10] - bg.ac;
            v15 = v12 * arg45 + arg44 * v14 >> 16;
            v12 = v14 * arg45 - v12 * arg44 >> 16;
            v14 = v13 * arg43 - v12 * arg42 >> 16;
            v12 = v13 * arg42 + v12 * arg43 >> 16;
            if(v12 < 50) {
                return;
            }

            bn.ag[v10] = v15;
            bn.ah[v10] = v14;
            bn.at[v10] = v12;
            bn.am[v10] = v0.ax.bp * v11 * v15 / v12 + v0.ax.bw * 1126407459;
            bn.az[v10] = v0.ax.bo * 0xF7F729AF + v14 * (v0.ax.bp * 574766503) / v12;
        }

        int v3 = 0;
        v0.ax.bn = 0;
        int v2 = v1.aj.length;
        while(v3 < v2) {
            int v4 = v1.aj[v3];
            int v5 = v1.ad[v3];
            v8 = v1.aq[v3];
            v15 = bn.am[v4];
            int v16 = bn.am[v5];
            int v17 = bn.am[v8];
            v12 = bn.az[v4];
            v13 = bn.az[v5];
            v14 = bn.az[v8];
            if((bg.bw) && (bg.bk(bg.by, bg.bt, v12, v13, v14, v15, v16, v17))) {
                bg.bv = v6;
                bg.bq = v7;
            }

            int v22 = bn.ag[v4];
            int v23 = bn.ag[v5];
            int v24 = bn.ag[v8];
            int v19 = bn.ah[v4];
            int v20 = bn.ah[v5];
            int v21 = bn.ah[v8];
            int v25 = bn.at[v4];
            int v26 = bn.at[v5];
            int v27 = bn.at[v8];
            if(v1.ab != null && v1.ab[v3] != -1) {
                v10 = v6 * 0x80;
                int v9 = v7 * 0x80;
                v0.ax.aq(v19, v20, v21, v22, v23, v24, v25, v26, v27, v1.ar[v3], v1.an[v3], v1.ap[v3], (((float)(v1.ax[v4] - v10))) / 128f, (((float)(v1.ax[v5] - v10))) / 128f, (((float)(v1.ax[v8] - v10))) / 128f, (((float)(v1.ae[v4] - v9))) / 128f, (((float)(v1.ae[v5] - v9))) / 128f, (((float)(v1.ae[v8] - v9))) / 128f, v1.ab[v3], -1419590225);
            }
            else if(v1.ar[v3] != 0xBC614E) {
                v0.ax.ar(v19, v20, v21, v22, v23, v24, v25, v26, v27, v1.ar[v3], v1.an[v3], v1.ap[v3], v0.ax.bp * 574766503, -11899);
            }

            ++v3;
        }
    }

    void ad(bg arg32, bn arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39) {
        int v14;
        int v13;
        int v12;
        int v11;
        bv v0 = this;
        bn v1 = arg33;
        int v6 = arg38;
        int v7 = arg39;
        if(!bv.ae) {
            return;
        }

        int v8 = v1.ax.length;
        int v10;
        for(v10 = 0; v10 < v8; ++v10) {
            v11 = v1.ax[v10] - bg.as;
            v12 = v1.al[v10] - bg.ak;
            v13 = v1.ae[v10] - bg.ac;
            v14 = v11 * arg37 + arg36 * v13 >> 16;
            v11 = v13 * arg37 - v11 * arg36 >> 16;
            v13 = v12 * arg35 - v11 * arg34 >> 16;
            v11 = v12 * arg34 + v11 * arg35 >> 16;
            if(v11 < 50) {
                return;
            }

            bn.ag[v10] = v14;
            bn.ah[v10] = v13;
            bn.at[v10] = v11;
            bn.am[v10] = v0.ax.bp * -1055703461 * v14 / v11 + v0.ax.bw * 1126407459;
            bn.az[v10] = v0.ax.bo * 0xF7F729AF + v13 * (v0.ax.bp * 574766503) / v11;
        }

        int v3 = 0;
        v0.ax.bn = 0;
        int v2 = v1.aj.length;
        while(v3 < v2) {
            int v4 = v1.aj[v3];
            int v5 = v1.ad[v3];
            v8 = v1.aq[v3];
            int v15 = bn.am[v4];
            int v16 = bn.am[v5];
            int v17 = bn.am[v8];
            v12 = bn.az[v4];
            v13 = bn.az[v5];
            v14 = bn.az[v8];
            if((bg.bw) && (bg.bk(bg.by, bg.bt, v12, v13, v14, v15, v16, v17))) {
                bg.bv = v6;
                bg.bq = v7;
            }

            v14 = bn.ag[v4];
            v15 = bn.ag[v5];
            v16 = bn.ag[v8];
            v11 = bn.ah[v4];
            v12 = bn.ah[v5];
            v13 = bn.ah[v8];
            v17 = bn.at[v4];
            int v18 = bn.at[v5];
            int v19 = bn.at[v8];
            if(v1.ab != null && v1.ab[v3] != -1) {
                int v9 = v7 * 0x80;
                v0.ax.aq(v11, v12, v13, v14, v15, v16, v17, v18, v19, v1.ar[v3], v1.an[v3], v1.ap[v3], (((float)(v1.ax[v4] - 0x1F736D55 * v6))) / 128f, (((float)(v1.ax[v5] - 2009092559 * v6))) / 128f, (((float)(v1.ax[v8] - v6 * 0x80))) / 128f, (((float)(v1.ae[v4] - v9))) / 128f, (((float)(v1.ae[v5] - 0xE2DF1160 * v7))) / 128f, (((float)(v1.ae[v8] - v9))) / 128f, v1.ab[v3], 0x8042EBC2);
            }
            else if(v1.ar[v3] != 0xBC614E) {
                v0.ax.ar(v11, v12, v13, v14, v15, v16, v17, v18, v19, v1.ar[v3], v1.an[v3], v1.ap[v3], v0.ax.bp * 0xEA2A0B0B, -487);
            }

            ++v3;
        }
    }

    static int ae(int arg2) {
        try {
            if(hq.cg.isEmpty()) {
                return 0;
            }

            return iq.ab(fe.ar(hq.cg, 0x45A09D21), 92);
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bv.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    void ae(bg arg49, ac arg50, int arg51, int arg52, int arg53, int arg54, int arg55, int arg56, int arg57, int arg58) {
        int v47;
        ac v15_1;
        bv v1 = this;
        bg v0 = arg49;
        try {
            if(!bv.ae) {
                return;
            }

            int v10 = (arg56 << 7) - bg.as;
            int v11 = (arg57 << 7) - bg.ac;
            int v12 = v10 + 0x80;
            int v13 = v11 + 0x80;
            int v14 = v0.an[arg51][arg56][arg57] - bg.ak;
            int v16 = arg56 + 1;
            int v15 = v0.an[arg51][v16][arg57] - bg.ak;
            int[] v2 = v0.an[arg51][v16];
            v16 = arg57 + 1;
            int v2_1 = v2[v16] - bg.ak;
            int v0_2 = v0.an[arg51][arg56][v16] - bg.ak;
            int v3 = arg55 * v10;
            v16 = v11 * arg54;
            int v22 = v3 + v16 >> 16;
            v11 *= arg55;
            v10 *= arg54;
            int v17 = v11 - v10 >> 16;
            int v19 = arg53 * v14 - arg52 * v17 >> 16;
            v14 = v14 * arg52 + v17 * arg53 >> 16;
            int v9 = 50;
            if(v14 < v9) {
                return;
            }

            v17 = v12 * arg55;
            v16 = v17 + v16 >> 16;
            v12 *= arg54;
            v11 = v11 - v12 >> 16;
            int v20 = v15 * arg53 - v11 * arg52 >> 16;
            v11 = v11 * arg53 + v15 * arg52 >> 16;
            if(v11 < v9) {
                return;
            }

            int v6 = arg54 * v13;
            int v27 = v6 + v17 >> 16;
            int v7 = arg55 * v13;
            v12 = v7 - v12 >> 16;
            int v24 = v2_1 * arg53 - arg52 * v12 >> 16;
            v2_1 = v12 * arg53 + v2_1 * arg52 >> 16;
            if(v2_1 < v9) {
                return;
            }

            v3 = v3 + v6 >> 16;
            v6 = v7 - v10 >> 16;
            v7 = v0_2 * arg53 - arg52 * v6 >> 16;
            v0_2 = v0_2 * arg52 + v6 * arg53 >> 16;
            if(v0_2 < v9) {
                return;
            }

            int v4 = v1.ax.bw * 1126407459 + v1.ax.bp * 574766503 * v22 / v14;
            v6 = v1.ax.bp * 574766503 * v19 / v14 + v1.ax.bo * 0xF7F729AF;
            v10 = v1.ax.bp * 574766503 * v16 / v11 + v1.ax.bw * 1126407459;
            v13 = v1.ax.bp * 574766503 * v20 / v11 + v1.ax.bo * 0xF7F729AF;
            v9 = v1.ax.bw * 1126407459 + v1.ax.bp * 574766503 * v27 / v2_1;
            v12 = v1.ax.bp * 574766503 * v24 / v2_1 + v1.ax.bo * 0xF7F729AF;
            int v5 = v1.ax.bp * 574766503 * v3 / v0_2 + v1.ax.bw * 1126407459;
            int v45 = v14;
            v14 = v1.ax.bp * 574766503 * v7 / v0_2 + v1.ax.bo * 0xF7F729AF;
            int v46 = v6;
            v1.ax.bn = 0;
            v17 = 0x8CB26E63;
            int v18 = 1230366805;
            int v21 = -1433150297;
            int v44 = 1109746211;
            if((v13 - v14) * (v9 - v5) - (v12 - v14) * (v10 - v5) > 0) {
                v1.ax.ac = false;
                if(v9 < 0 || v5 < 0 || v10 < 0 || v9 > v1.ax.by * v44 || v5 > v1.ax.by * v44 || v10 > v1.ax.by * v44) {
                    v1.ax.ac = true;
                }

                if((bg.bw) && (bg.bk(bg.by, bg.bt, v12, v14, v13, v9, v5, v10))) {
                    bg.bv = arg56;
                    bg.bq = arg57;
                }

                v15_1 = arg50;
                int v23 = 0x65660F3;
                if(-1 == v15_1.an * v21) {
                    if(0xBC614E != v15_1.ae * v23) {
                        v1.ax.ar(v24, v7, v20, v27, v3, v16, v2_1, v0_2, v11, v15_1.ae * v23, v15_1.ar * v18, v15_1.al * v17, v1.ax.bp * 574766503, -9599);
                    }
                }
                else if(!bg.ax) {
                    v1.ax.aq(v24, v7, v20, v27, v3, v16, v2_1, v0_2, v11, v15_1.ae * v23, v15_1.ar * v18, v15_1.al * v17, 1f, 0f, 1f, 1f, 1f, 0f, v15_1.an * v21, 0xB0E3FBBE);
                }
                else {
                    goto label_297;
                }

                v47 = v0_2;
                goto label_327;
            label_297:
                v2_1 = ii.au.ar(v15_1.an * v21, 0xF5626FFA);
                v47 = v0_2;
                v1.ax.an(v12, v14, v13, v9, v5, v10, io.bh(v2_1, v15_1.ae * v23, 0), io.bh(v2_1, v15_1.ar * v18, 0), io.bh(v2_1, v15_1.al * v17, 0), 9);
            }
            else {
                v47 = v0_2;
                v15_1 = arg50;
            }

        label_327:
            if((v14 - v13) * (v4 - v10) - (v5 - v10) * (v46 - v13) > 0) {
                v1.ax.ac = false;
                if(v4 < 0 || v10 < 0 || v5 < 0 || v4 > v1.ax.by * v44 || v10 > v1.ax.by * v44 || v5 > v1.ax.by * v44) {
                    v1.ax.ac = true;
                }

                if((bg.bw) && (bg.bk(bg.by, bg.bt, v46, v13, v14, v4, v10, v5))) {
                    bg.bv = arg56;
                    bg.bq = arg57;
                }

                v6 = 1207005007;
                if(-1 == v15_1.an * v21) {
                    if(v15_1.ax * v6 == 0xBC614E) {
                        return;
                    }

                    v1.ax.ar(v19, v20, v7, v22, v16, v3, v45, v11, v47, v15_1.ax * v6, v15_1.al * v17, v15_1.ar * v18, v1.ax.bp * 574766503, -699);
                    return;
                }

                if(!bg.ax) {
                    v1.ax.aq(v19, v20, v7, v22, v16, v3, v45, v11, v47, v15_1.ax * v6, v15_1.al * v17, v15_1.ar * v18, 0f, 1f, 0f, 0f, 0f, 1f, v15_1.an * v21, 0xAA002855);
                    return;
                }

                v0_2 = ii.au.ar(v15_1.an * v21, 0x7B4FCF2);
                v1.ax.an(v46, v13, v14, v4, v10, v5, io.bh(v0_2, v15_1.ax * v6, 0), io.bh(v0_2, v15_1.al * v17, 0), io.bh(v0_2, v15_1.ar * v18, 0), 9);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_2 = new StringBuilder();
            v2_2.append("bv.ae(");
            v2_2.append(')');
            throw lx.al(((Throwable)v0_1), v2_2.toString());
        }
    }

    static bf af(int arg5, int arg6) {
        bf v5_1;
        try {
            long v0 = ((long)arg5);
            mv v6 = df.an.ax(v0);
            if(v6 != null) {
                return ((bf)v6);
            }

            v5_1 = af.ax(df.al, df.ae, arg5, false, -628810826);
            if(v5_1 != null) {
                df.an.ae(((mv)v5_1), v0);
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("bv.af(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }

        return v5_1;
    }

    public void af(int arg4, int arg5) {
        byte v5 = 0x7F;
        try {
            if(bf.az(v5)) {
                ax.bp(jb.ah(102) - this.ax.bw * 1126407459, eu.at(0x7E) - this.ax.bo * 0xF7F729AF, 0x726C7D41);
            }

            this.al.ar(arg4, 403470514);
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("bv.af(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }

    public void ai(int arg5) {
        if(bf.az(75)) {
            ax.bp(jb.ah(53) - this.ax.bw * 1126407459, eu.at(85) - this.ax.bo * 0xF7F729AF, 0x69272061);
        }

        this.al.ar(arg5, 429284025);
    }

    void aj(bg arg48, ac arg49, int arg50, int arg51, int arg52, int arg53, int arg54, int arg55, int arg56) {
        int v46;
        ac v15_1;
        bv v0 = this;
        bg v1 = arg48;
        if(!bv.ae) {
            return;
        }

        int v10 = (arg55 << 7) - bg.as;
        int v11 = (arg56 << 7) - bg.ac;
        int v12 = v10 + 0x80;
        int v13 = v11 + 0x80;
        int v14 = v1.an[arg50][arg55][arg56] - bg.ak;
        int v16 = arg55 + 1;
        int v15 = v1.an[arg50][v16][arg56] - bg.ak;
        int[] v2 = v1.an[arg50][v16];
        v16 = arg56 + 1;
        int v2_1 = v2[v16] - bg.ak;
        int v1_1 = v1.an[arg50][arg55][v16] - bg.ak;
        int v3 = arg54 * v10;
        v16 = v11 * arg53;
        int v22 = v3 + v16 >> 16;
        v11 *= arg54;
        v10 *= arg53;
        int v17 = v11 - v10 >> 16;
        int v19 = arg52 * v14 - arg51 * v17 >> 16;
        v14 = v14 * arg51 + v17 * arg52 >> 16;
        if(v14 < 0x9945E8C4) {
            return;
        }

        int v9 = v12 * arg54;
        v16 = v9 + v16 >> 16;
        v12 *= arg53;
        v11 = v11 - v12 >> 16;
        v17 = v15 * arg52 - v11 * arg51 >> 16;
        v11 = v11 * arg52 + v15 * arg51 >> 16;
        if(v11 < 1518488201) {
            return;
        }

        int v6 = arg53 * v13;
        int v27 = v9 + v6 >> 16;
        int v7 = arg54 * v13;
        v9 = v7 - v12 >> 16;
        int v24 = v2_1 * arg52 - arg51 * v9 >> 16;
        v2_1 = v9 * arg52 + v2_1 * arg51 >> 16;
        if(v2_1 < -1250311188) {
            return;
        }

        v3 = v3 + v6 >> 16;
        v6 = v7 - v10 >> 16;
        v7 = v1_1 * arg52 - arg51 * v6 >> 16;
        v1_1 = v1_1 * arg51 + v6 * arg52 >> 16;
        if(v1_1 < 50) {
            return;
        }

        int v4 = v0.ax.bw * 1126407459 + v0.ax.bp * 574766503 * v22 / v14;
        v6 = v0.ax.bp * 574766503 * v19 / v14 + v0.ax.bo * 0xF7F729AF;
        v10 = v0.ax.bp * 574766503 * v16 / v11 + v0.ax.bw * 1485402649;
        v13 = v0.ax.bp * -1770336697 * v17 / v11 + v0.ax.bo * 0xF7F729AF;
        v9 = v0.ax.bw * 1126407459 + v0.ax.bp * 0xB0139A8B * v27 / v2_1;
        v12 = v0.ax.bp * -7443079 * v24 / v2_1 + v0.ax.bo * 0xF7F729AF;
        int v5 = v0.ax.bp * 574766503 * v3 / v1_1 + v0.ax.bw * 1126407459;
        int v44 = v14;
        v14 = v0.ax.bp * 574766503 * v7 / v1_1 + v0.ax.bo * 0xF7F729AF;
        int v45 = v6;
        v0.ax.bn = 0;
        int v20 = -1433150297;
        int v21 = 0x8CB26E63;
        int v18 = 1109746211;
        if((v13 - v14) * (v9 - v5) - (v12 - v14) * (v10 - v5) > 0) {
            v0.ax.ac = false;
            if(v9 < 0 || v5 < 0 || v10 < 0 || v9 > v0.ax.by * v18 || v5 > v0.ax.by * v18 || v10 > v0.ax.by * v18) {
                v0.ax.ac = true;
            }

            if((bg.bw) && (bg.bk(bg.by, bg.bt, v12, v14, v13, v9, v5, v10))) {
                bg.bv = arg55;
                bg.bq = arg56;
            }

            v15_1 = arg49;
            int v25 = 1230366805;
            if(-1 == v15_1.an * v20) {
                if(0x38D9730E != v15_1.ae * 0xBCF39E2F) {
                    v0.ax.ar(v24, v7, v17, v27, v3, v16, v2_1, v1_1, v11, v15_1.ae * 0xFC09ACAE, v15_1.ar * v25, v15_1.al * v21, v0.ax.bp * 574766503, -3113);
                }
            }
            else if(!bg.ax) {
                v0.ax.aq(v24, v7, v17, v27, v3, v16, v2_1, v1_1, v11, v15_1.ae * 924024121, v15_1.ar * v25, v15_1.al * v21, 1f, 0f, 1f, 1f, 1f, 0f, v15_1.an * v20, 0xB1ABE931);
            }
            else {
                goto label_304;
            }

            v46 = v1_1;
            goto label_337;
        label_304:
            v2_1 = ii.au.ar(v15_1.an * 0x911CF075, 0x595CD808);
            v46 = v1_1;
            v0.ax.an(v12, v14, v13, v9, v5, v10, io.bh(v2_1, v15_1.ae * 0x65660F3, 0), io.bh(v2_1, v15_1.ar * v25, 0), io.bh(v2_1, v15_1.al * 0x5486AF33, 0), 9);
        }
        else {
            v46 = v1_1;
            v15_1 = arg49;
        }

    label_337:
        if((v14 - v13) * (v4 - v10) - (v5 - v10) * (v45 - v13) > 0) {
            v0.ax.ac = false;
            if(v4 < 0 || v10 < 0 || v5 < 0 || v4 > v0.ax.by * -1723218406 || v10 > v0.ax.by * 0x2D84AB78 || v5 > v0.ax.by * v18) {
                v0.ax.ac = true;
            }

            if((bg.bw) && (bg.bk(bg.by, bg.bt, v45, v13, v14, v4, v10, v5))) {
                bg.bv = arg55;
                bg.bq = arg56;
            }

            v2_1 = 1207005007;
            if(-1 == v15_1.an * 0x6EA20678) {
                if(v15_1.ax * v2_1 == -705739304) {
                    return;
                }

                v0.ax.ar(v19, v17, v7, v22, v16, v3, v44, v11, v46, v15_1.ax * 0x454AE9E5, v15_1.al * v21, v15_1.ar * 0x28F37D3C, v0.ax.bp * 0xAEF5B9B3, -18907);
                return;
            }

            if(!bg.ax) {
                v0.ax.aq(v19, v17, v7, v22, v16, v3, v44, v11, v46, v15_1.ax * v2_1, v15_1.al * v21, v15_1.ar * 0xDF342081, 0f, 1f, 0f, 0f, 0f, 1f, v15_1.an * v20, -2017078226);
                return;
            }

            v1_1 = ii.au.ar(v15_1.an * 0xCDB50CF5, 0x3F7E9601);
            v0.ax.an(v45, v13, v14, v4, v10, v5, io.bh(v1_1, v15_1.ax * v2_1, 0), io.bh(v1_1, v15_1.al * -125605528, 0), io.bh(v1_1, v15_1.ar * 0x64B82F9E, 0), 9);
        }
    }

    public bi al(int arg3) {
        try {
            return this.al;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bv.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public bt an() {
        return this.ax;
    }

    public bi ap() {
        return this.al;
    }

    void aq(bg arg32, bn arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39) {
        int v14;
        int v13;
        int v12;
        int v11;
        bv v0 = this;
        bn v1 = arg33;
        int v6 = arg38;
        int v7 = arg39;
        if(!bv.ae) {
            return;
        }

        int v8 = v1.ax.length;
        int v10;
        for(v10 = 0; v10 < v8; ++v10) {
            v11 = v1.ax[v10] - bg.as;
            v12 = v1.al[v10] - bg.ak;
            v13 = v1.ae[v10] - bg.ac;
            v14 = v11 * arg37 + arg36 * v13 >> 16;
            v11 = v13 * arg37 - v11 * arg36 >> 16;
            v13 = v12 * arg35 - v11 * arg34 >> 16;
            v11 = v12 * arg34 + v11 * arg35 >> 16;
            if(v11 < 507931790) {
                return;
            }

            bn.ag[v10] = v14;
            bn.ah[v10] = v13;
            bn.at[v10] = v11;
            bn.am[v10] = v0.ax.bp * 2037312142 * v14 / v11 + v0.ax.bw * 1126407459;
            bn.az[v10] = v0.ax.bo * 0x33A30E7B + v13 * (v0.ax.bp * 0x1D66E875) / v11;
        }

        int v3 = 0;
        v0.ax.bn = 0;
        int v2 = v1.aj.length;
        while(v3 < v2) {
            int v4 = v1.aj[v3];
            int v5 = v1.ad[v3];
            v8 = v1.aq[v3];
            int v15 = bn.am[v4];
            int v16 = bn.am[v5];
            int v17 = bn.am[v8];
            v12 = bn.az[v4];
            v13 = bn.az[v5];
            v14 = bn.az[v8];
            if((bg.bw) && (bg.bk(bg.by, bg.bt, v12, v13, v14, v15, v16, v17))) {
                bg.bv = v6;
                bg.bq = v7;
            }

            v14 = bn.ag[v4];
            v15 = bn.ag[v5];
            v16 = bn.ag[v8];
            v11 = bn.ah[v4];
            v12 = bn.ah[v5];
            v13 = bn.ah[v8];
            v17 = bn.at[v4];
            int v18 = bn.at[v5];
            int v19 = bn.at[v8];
            if(v1.ab != null && v1.ab[v3] != -1) {
                v10 = v6 * 0x80;
                int v9 = v7 * 0x80;
                v0.ax.aq(v11, v12, v13, v14, v15, v16, v17, v18, v19, v1.ar[v3], v1.an[v3], v1.ap[v3], (((float)(v1.ax[v4] - 0x4573F5B2 * v6))) / 128f, (((float)(v1.ax[v5] - v10))) / 128f, (((float)(v1.ax[v8] - v10))) / 128f, (((float)(v1.ae[v4] - v9))) / 128f, (((float)(v1.ae[v5] - v9))) / 128f, (((float)(v1.ae[v8] - 0xACF28CB2 * v7))) / 128f, v1.ab[v3], -2068129138);
            }
            else if(v1.ar[v3] != 0xBC614E) {
                v0.ax.ar(v11, v12, v13, v14, v15, v16, v17, v18, v19, v1.ar[v3], v1.an[v3], v1.ap[v3], v0.ax.bp * 0x67D0BA87, -2701);
            }

            ++v3;
        }
    }

    void ar(bg arg40, bn arg41, int arg42, int arg43, int arg44, int arg45, int arg46, int arg47, byte arg48) {
        int v3;
        int v15;
        int v14;
        int v13;
        int v12;
        bv v1 = this;
        bn v0 = arg41;
        int v6 = arg46;
        int v7 = arg47;
        try {
            if(!bv.ae) {
                return;
            }

            int v8 = v0.ax.length;
            int v10;
            for(v10 = 0; true; ++v10) {
                int v11 = 574766503;
                if(v10 >= v8) {
                    break;
                }

                v12 = v0.ax[v10] - bg.as;
                v13 = v0.al[v10] - bg.ak;
                v14 = v0.ae[v10] - bg.ac;
                v15 = v12 * arg45 + arg44 * v14 >> 16;
                v12 = v14 * arg45 - v12 * arg44 >> 16;
                v14 = v13 * arg43 - v12 * arg42 >> 16;
                v12 = v13 * arg42 + v12 * arg43 >> 16;
                if(v12 < 50) {
                    return;
                }

                bn.ag[v10] = v15;
                bn.ah[v10] = v14;
                bn.at[v10] = v12;
                bn.am[v10] = v1.ax.bp * v11 * v15 / v12 + v1.ax.bw * 1126407459;
                bn.az[v10] = v1.ax.bo * 0xF7F729AF + v14 * (v1.ax.bp * 574766503) / v12;
            }

            v3 = 0;
            v1.ax.bn = 0;
            int v2 = v0.aj.length;
            while(true) {
            label_81:
                if(v3 >= v2) {
                    return;
                }

                int v4 = v0.aj[v3];
                int v5 = v0.ad[v3];
                v8 = v0.aq[v3];
                v15 = bn.am[v4];
                int v16 = bn.am[v5];
                int v17 = bn.am[v8];
                v12 = bn.az[v4];
                v13 = bn.az[v5];
                v14 = bn.az[v8];
                if((bg.bw) && (bg.bk(bg.by, bg.bt, v12, v13, v14, v15, v16, v17))) {
                    bg.bv = v6;
                    bg.bq = v7;
                }

                int v22 = bn.ag[v4];
                int v23 = bn.ag[v5];
                int v24 = bn.ag[v8];
                int v19 = bn.ah[v4];
                int v20 = bn.ah[v5];
                int v21 = bn.ah[v8];
                int v25 = bn.at[v4];
                int v26 = bn.at[v5];
                int v27 = bn.at[v8];
                if(v0.ab != null && v0.ab[v3] != -1) {
                    v10 = v6 * 0x80;
                    int v9 = v7 * 0x80;
                    v1.ax.aq(v19, v20, v21, v22, v23, v24, v25, v26, v27, v0.ar[v3], v0.an[v3], v0.ap[v3], (((float)(v0.ax[v4] - v10))) / 128f, (((float)(v0.ax[v5] - v10))) / 128f, (((float)(v0.ax[v8] - v10))) / 128f, (((float)(v0.ae[v4] - v9))) / 128f, (((float)(v0.ae[v5] - v9))) / 128f, (((float)(v0.ae[v8] - v9))) / 128f, v0.ab[v3], 0x9CE5DB51);
                }
                else if(v0.ar[v3] != 0xBC614E) {
                    v1.ax.ar(v19, v20, v21, v22, v23, v24, v25, v26, v27, v0.ar[v3], v0.an[v3], v0.ap[v3], v1.ax.bp * 574766503, -11629);
                }

                break;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_204;
        }

        ++v3;
        goto label_81;
        return;
    label_204:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("bv.ar(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public void av(int arg5) {
        byte v0 = 77;
        if(bf.az(v0)) {
            ax.bp(jb.ah(98) - this.ax.bw * 1126407459, eu.at(v0) - this.ax.bo * 0xF7F729AF, 0xA0F9D2FF);
        }

        this.al.ar(arg5, -1152017585);
    }

    public static void ax(iw arg1, int arg2) {
        arg2 = 500000;
        int v0 = 0x6FBCFCE7;
        try {
            ec.al(arg1, arg2, v0);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("bv.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public bt ax(int arg3) {
        try {
            return this.ax;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bv.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static void bh(int arg7, af arg8, boolean arg9, int arg10) {
        arg10 = 0x26BBBCFA;
        try {
            dl.ab(0x8F038A68).ag(dl.ab(arg10).bn(arg7, 0x9ABF4F7D), new af(gu.jg.as * 0xD54EB40F, (gu.jg.bp * 0x914F0683 >> 7) + ad.fi * 474770003, nr.fo * 0x519F9BE7 + (gu.jg.bw * 0xD19D0C3D >> 7)), arg8, arg9, -247765060);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("bv.bh(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }
}

