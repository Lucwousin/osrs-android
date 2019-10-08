public class ay extends bk {
    final aw al;
    final bj ax;
    static final int bd = 202;
    static final int cb = 1006;

    public ay(bj arg3) {
        try {
            super();
            this.ax = arg3;
            this.al = new aw(this.ax);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ay.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ab(bg arg36, bn arg37, int arg38, int arg39, int arg40, int arg41, int arg42, int arg43) {
        int v34;
        int v33;
        int v26;
        int v10;
        ay v0 = this;
        bn v1 = arg37;
        int v6 = v1.ax.length;
        int v8;
        for(v8 = 0; v8 < v6; ++v8) {
            int v9 = v1.ax[v8] - bg.as;
            v10 = v1.al[v8] - bg.ak;
            int v11 = v1.ae[v8] - bg.ac;
            int v12 = v11 * arg40 + v9 * arg41 >> 16;
            v9 = v11 * arg41 - v9 * arg40 >> 16;
            v11 = v10 * arg39 - v9 * arg38 >> 16;
            v9 = v10 * arg38 + v9 * arg39 >> 16;
            if(v9 < 50) {
                return;
            }

            if(v1.ab != null) {
                bn.ag[v8] = v12;
                bn.ah[v8] = v11;
                bn.at[v8] = v9;
            }

            bn.am[v8] = v0.ax.bp * 574766503 * v12 / v9 + v0.ax.bw * 1126407459;
            bn.az[v8] = v0.ax.bo * 0xF7F729AF + v11 * (v0.ax.bp * 574766503) / v9;
        }

        v0.ax.bn = 0;
        int v2 = v1.aj.length;
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            int v4 = v1.aj[v3];
            int v5 = v1.ad[v3];
            v6 = v1.aq[v3];
            v8 = bn.am[v4];
            int v15 = bn.am[v5];
            int v14 = bn.am[v6];
            int v30 = bn.az[v4];
            int v31 = bn.az[v5];
            int v32 = bn.az[v6];
            if((v8 - v15) * (v32 - v31) - (v30 - v31) * (v14 - v15) > 0) {
                v0.ax.ac = false;
                if(v8 < 0 || v15 < 0 || v14 < 0) {
                label_124:
                    v0.ax.ac = true;
                }
                else {
                    v10 = 1109746211;
                    if(v8 > v0.ax.by * v10) {
                        goto label_124;
                    }
                    else if(v15 > v0.ax.by * v10) {
                        goto label_124;
                    }
                    else if(v14 > v0.ax.by * v10) {
                        goto label_124;
                    }
                }

                if(bg.bw) {
                    v26 = 1;
                    v33 = v14;
                    v34 = v15;
                    if(bg.bk(bg.by, bg.bt, v30, v31, v32, v8, v15, v33)) {
                        bg.bv = arg42;
                        bg.bq = arg43;
                    }
                }
                else {
                    v33 = v14;
                    v34 = v15;
                    v26 = 1;
                }

                if(v1.ab != null) {
                    if(-1 == v1.ab[v3]) {
                    }
                    else {
                        if(bg.ax) {
                            v4 = ii.au.ar(v1.ab[v3], 463633006);
                            v0.ax.an(v30, v31, v32, v8, v34, v33, io.bh(v4, v1.ar[v3], 0), io.bh(v4, v1.an[v3], 0), io.bh(v4, v1.ap[v3], 0), 86805035);
                        }
                        else if(v1.af) {
                            v0.ax.at(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], bn.ag[0], bn.ag[v26], bn.ag[3], bn.ah[0], bn.ah[v26], bn.ah[3], bn.at[0], bn.at[v26], bn.at[3], v1.ab[v3], 10);
                        }
                        else {
                            v0.ax.at(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], bn.ag[v4], bn.ag[v5], bn.ag[v6], bn.ah[v4], bn.ah[v5], bn.ah[v6], bn.at[v4], bn.at[v5], bn.at[v6], v1.ab[v3], 60);
                        }

                        goto label_274;
                    }
                }

                if(v1.ar[v3] == 0xBC614E) {
                    goto label_274;
                }

                v0.ax.an(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], 86805035);
            }

        label_274:
        }
    }

    void ad(bg arg36, bn arg37, int arg38, int arg39, int arg40, int arg41, int arg42, int arg43) {
        int v34;
        int v33;
        int v26;
        int v10;
        ay v0 = this;
        bn v1 = arg37;
        int v6 = v1.ax.length;
        int v8;
        for(v8 = 0; v8 < v6; ++v8) {
            int v9 = v1.ax[v8] - bg.as;
            v10 = v1.al[v8] - bg.ak;
            int v11 = v1.ae[v8] - bg.ac;
            int v12 = v11 * arg40 + v9 * arg41 >> 16;
            v9 = v11 * arg41 - v9 * arg40 >> 16;
            v11 = v10 * arg39 - v9 * arg38 >> 16;
            v9 = v10 * arg38 + v9 * arg39 >> 16;
            if(v9 < 0xFB2FEEE1) {
                return;
            }

            if(v1.ab != null) {
                bn.ag[v8] = v12;
                bn.ah[v8] = v11;
                bn.at[v8] = v9;
            }

            bn.am[v8] = v0.ax.bp * 0xE523B9B1 * v12 / v9 + v0.ax.bw * 1149700378;
            bn.az[v8] = v0.ax.bo * 0xF7F729AF + v11 * (v0.ax.bp * 574766503) / v9;
        }

        v0.ax.bn = 0;
        int v2 = v1.aj.length;
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            int v4 = v1.aj[v3];
            int v5 = v1.ad[v3];
            v6 = v1.aq[v3];
            v8 = bn.am[v4];
            int v15 = bn.am[v5];
            int v14 = bn.am[v6];
            int v30 = bn.az[v4];
            int v31 = bn.az[v5];
            int v32 = bn.az[v6];
            if((v8 - v15) * (v32 - v31) - (v30 - v31) * (v14 - v15) > 0) {
                v0.ax.ac = false;
                if(v8 < 0 || v15 < 0 || v14 < 0) {
                label_125:
                    v0.ax.ac = true;
                }
                else {
                    v10 = 1109746211;
                    if(v8 > v0.ax.by * v10) {
                        goto label_125;
                    }
                    else if(v15 > v0.ax.by * v10) {
                        goto label_125;
                    }
                    else if(v14 > v0.ax.by * v10) {
                        goto label_125;
                    }
                }

                if(bg.bw) {
                    v26 = 1;
                    v33 = v14;
                    v34 = v15;
                    if(bg.bk(bg.by, bg.bt, v30, v31, v32, v8, v15, v33)) {
                        bg.bv = arg42;
                        bg.bq = arg43;
                    }
                }
                else {
                    v33 = v14;
                    v34 = v15;
                    v26 = 1;
                }

                if(v1.ab != null) {
                    if(-1 == v1.ab[v3]) {
                    }
                    else {
                        if(bg.ax) {
                            v4 = ii.au.ar(v1.ab[v3], -1980920731);
                            v0.ax.an(v30, v31, v32, v8, v34, v33, io.bh(v4, v1.ar[v3], 0), io.bh(v4, v1.an[v3], 0), io.bh(v4, v1.ap[v3], 0), 86805035);
                        }
                        else if(v1.af) {
                            v0.ax.at(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], bn.ag[0], bn.ag[v26], bn.ag[3], bn.ah[0], bn.ah[v26], bn.ah[3], bn.at[0], bn.at[v26], bn.at[3], v1.ab[v3], -79);
                        }
                        else {
                            v0.ax.at(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], bn.ag[v4], bn.ag[v5], bn.ag[v6], bn.ah[v4], bn.ah[v5], bn.ah[v6], bn.at[v4], bn.at[v5], bn.at[v6], v1.ab[v3], 52);
                        }

                        goto label_275;
                    }
                }

                if(v1.ar[v3] == 0xBC614E) {
                    goto label_275;
                }

                v0.ax.an(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], 86805035);
            }

        label_275:
        }
    }

    void ae(bg arg70, ac arg71, int arg72, int arg73, int arg74, int arg75, int arg76, int arg77, int arg78, int arg79) {
        int v68;
        ac v15_1;
        ay v1 = this;
        bg v0 = arg70;
        int v10 = arg77 << 7;
        try {
            v10 -= bg.as;
            int v11 = (arg78 << 7) - bg.ac;
            int v12 = v10 + 0x80;
            int v13 = v11 + 0x80;
            int v14 = v0.an[arg72][arg77][arg78] - bg.ak;
            int v16 = arg77 + 1;
            int v15 = v0.an[arg72][v16][arg78] - bg.ak;
            int[] v2 = v0.an[arg72][v16];
            v16 = arg78 + 1;
            int v2_1 = v2[v16] - bg.ak;
            int v0_2 = v0.an[arg72][arg77][v16] - bg.ak;
            int v3 = arg76 * v10;
            v16 = v11 * arg75;
            int v17 = v3 + v16 >> 16;
            v11 *= arg76;
            v10 *= arg75;
            int v18 = v11 - v10 >> 16;
            int v39 = v14 * arg74 - v18 * arg73 >> 16;
            v14 = v18 * arg74 + v14 * arg73 >> 16;
            int v9 = 50;
            if(v14 < v9) {
                return;
            }

            v18 = v12 * arg76;
            v16 = v16 + v18 >> 16;
            v12 *= arg75;
            v11 = v11 - v12 >> 16;
            int v61 = arg74 * v15 - arg73 * v11 >> 16;
            v11 = v15 * arg73 + v11 * arg74 >> 16;
            if(v11 < v9) {
                return;
            }

            int v6 = v13 * arg75;
            int v50 = v18 + v6 >> 16;
            int v7 = arg76 * v13;
            v12 = v7 - v12 >> 16;
            int v53 = v2_1 * arg74 - v12 * arg73 >> 16;
            v2_1 = v12 * arg74 + v2_1 * arg73 >> 16;
            if(v2_1 < v9) {
                return;
            }

            v3 = v3 + v6 >> 16;
            v6 = v7 - v10 >> 16;
            v7 = arg74 * v0_2 - arg73 * v6 >> 16;
            v0_2 = v0_2 * arg73 + v6 * arg74 >> 16;
            if(v0_2 < v9) {
                return;
            }

            int v4 = v1.ax.bw * 1126407459 + v1.ax.bp * 574766503 * v17 / v14;
            v6 = v1.ax.bp * 574766503 * v39 / v14 + v1.ax.bo * 0xF7F729AF;
            v10 = v1.ax.bp * 574766503 * v16 / v11 + v1.ax.bw * 1126407459;
            v13 = v1.ax.bo * 0xF7F729AF + v1.ax.bp * 574766503 * v61 / v11;
            v9 = v1.ax.bw * 1126407459 + v1.ax.bp * 574766503 * v50 / v2_1;
            v12 = v1.ax.bp * 574766503 * v53 / v2_1 + v1.ax.bo * 0xF7F729AF;
            int v5 = v1.ax.bw * 1126407459 + v1.ax.bp * 574766503 * v3 / v0_2;
            int v65 = v6;
            v6 = v1.ax.bo * 0xF7F729AF + v1.ax.bp * 574766503 * v7 / v0_2;
            int v66 = v4;
            v1.ax.bn = 0;
            int v62 = 1109746211;
            int v63 = 0x8CB26E63;
            int v64 = 1230366805;
            int v67 = -1433150297;
            if((v9 - v5) * (v13 - v6) - (v10 - v5) * (v12 - v6) > 0) {
                v1.ax.ac = false;
                if(v9 < 0 || v5 < 0 || v10 < 0 || v9 > v1.ax.by * v62 || v5 > v1.ax.by * v62 || v10 > v1.ax.by * v62) {
                    v1.ax.ac = true;
                }

                if((bg.bw) && (bg.bk(bg.by, bg.bt, v12, v6, v13, v9, v5, v10))) {
                    bg.bv = arg77;
                    bg.bq = arg78;
                }

                v15_1 = arg71;
                v18 = 0x65660F3;
                if(-1 == v15_1.an * v67) {
                    if(0xBC614E != v15_1.ae * v18) {
                        v1.ax.an(v12, v6, v13, v9, v5, v10, v15_1.ae * v18, v15_1.ar * v64, v15_1.al * v63, 86805035);
                    }
                }
                else if(bg.ax) {
                    goto label_319;
                }
                else if(v15_1.ap) {
                    v1.ax.at(v12, v6, v13, v9, v5, v10, v15_1.ae * v18, v15_1.ar * v64, v15_1.al * v63, v17, v16, v3, v39, v61, v7, v14, v11, v0_2, v15_1.an * v67, -1);
                }
                else {
                    v1.ax.at(v12, v6, v13, v9, v5, v10, v15_1.ae * v18, v15_1.ar * v64, v15_1.al * v63, v50, v3, v16, v53, v7, v61, v2_1, v0_2, v11, v15_1.an * v67, -99);
                }

                v68 = v0_2;
                goto label_349;
            label_319:
                v2_1 = ii.au.ar(v15_1.an * v67, 0xF075A65F);
                v68 = v0_2;
                v1.ax.an(v12, v6, v13, v9, v5, v10, io.bh(v2_1, v15_1.ae * v18, 0), io.bh(v2_1, v15_1.ar * v64, 0), io.bh(v2_1, v15_1.al * v63, 0), 86805035);
            }
            else {
                v68 = v0_2;
                v15_1 = arg71;
            }

        label_349:
            if((v66 - v10) * (v6 - v13) - (v5 - v10) * (v65 - v13) > 0) {
                v1.ax.ac = false;
                if(v66 < 0 || v10 < 0 || v5 < 0) {
                    v4 = v66;
                label_378:
                    v1.ax.ac = true;
                }
                else {
                    v4 = v66;
                    if(v4 > v1.ax.by * v62) {
                        goto label_378;
                    }
                    else if(v10 > v1.ax.by * v62) {
                        goto label_378;
                    }
                    else if(v5 > v1.ax.by * v62) {
                        goto label_378;
                    }
                }

                if((bg.bw) && (bg.bk(bg.by, bg.bt, v65, v13, v6, v4, v10, v5))) {
                    bg.bv = arg77;
                    bg.bq = arg78;
                }

                int v8 = 1207005007;
                if(-1 == v15_1.an * v67) {
                    if(0xBC614E == v15_1.ax * v8) {
                        return;
                    }

                    v1.ax.an(v65, v13, v6, v4, v10, v5, v15_1.ax * v8, v15_1.al * v63, v15_1.ar * v64, 86805035);
                    return;
                }

                if(!bg.ax) {
                    v1.ax.at(v65, v13, v6, v4, v10, v5, v15_1.ax * v8, v15_1.al * v63, v15_1.ar * v64, v17, v16, v3, v39, v61, v7, v14, v11, v68, v15_1.an * v67, -72);
                    return;
                }

                v0_2 = ii.au.ar(v15_1.an * v67, -1115977304);
                v1.ax.an(v65, v13, v6, v4, v10, v5, io.bh(v0_2, v15_1.ax * v8, 0), io.bh(v0_2, v15_1.al * v63, 0), io.bh(v0_2, v15_1.ar * v64, 0), 86805035);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_2 = new StringBuilder();
            v2_2.append("ay.ae(");
            v2_2.append(')');
            throw lx.al(((Throwable)v0_1), v2_2.toString());
        }
    }

    void aj(bg arg70, ac arg71, int arg72, int arg73, int arg74, int arg75, int arg76, int arg77, int arg78) {
        int v68;
        ac v15_1;
        ay v0 = this;
        int v10 = (arg77 << 7) - bg.as;
        int v11 = (arg78 << 7) - bg.ac;
        int v12 = v10 + 0x80;
        int v13 = v11 + 0x80;
        int v14 = arg70.an[arg72][arg77][arg78] - bg.ak;
        int v16 = arg77 + 1;
        int v15 = arg70.an[arg72][v16][arg78] - bg.ak;
        int[] v2 = arg70.an[arg72][v16];
        v16 = arg78 + 1;
        int v2_1 = v2[v16] - bg.ak;
        int v1 = arg70.an[arg72][arg77][v16] - bg.ak;
        int v3 = arg76 * v10;
        v16 = v11 * arg75;
        int v17 = v3 + v16 >> 16;
        v11 *= arg76;
        v10 *= arg75;
        int v18 = v11 - v10 >> 16;
        int v39 = v14 * arg74 - v18 * arg73 >> 16;
        v14 = v18 * arg74 + v14 * arg73 >> 16;
        int v9 = 50;
        if(v14 < v9) {
            return;
        }

        v18 = v12 * arg76;
        v16 = v16 + v18 >> 16;
        v12 *= arg75;
        v11 = v11 - v12 >> 16;
        int v61 = arg74 * v15 - arg73 * v11 >> 16;
        v11 = v15 * arg73 + v11 * arg74 >> 16;
        if(v11 < v9) {
            return;
        }

        int v6 = v13 * arg75;
        int v50 = v18 + v6 >> 16;
        int v7 = arg76 * v13;
        v12 = v7 - v12 >> 16;
        int v53 = v2_1 * arg74 - v12 * arg73 >> 16;
        v2_1 = v12 * arg74 + v2_1 * arg73 >> 16;
        if(v2_1 < v9) {
            return;
        }

        v3 = v3 + v6 >> 16;
        v6 = v7 - v10 >> 16;
        v7 = arg74 * v1 - arg73 * v6 >> 16;
        v1 = v1 * arg73 + v6 * arg74 >> 16;
        if(v1 < v9) {
            return;
        }

        int v4 = v0.ax.bw * 1126407459 + v0.ax.bp * 574766503 * v17 / v14;
        v6 = v0.ax.bp * 574766503 * v39 / v14 + v0.ax.bo * 0xF7F729AF;
        v10 = v0.ax.bp * 574766503 * v16 / v11 + v0.ax.bw * 1126407459;
        v13 = v0.ax.bo * 0xF7F729AF + v0.ax.bp * 574766503 * v61 / v11;
        v9 = v0.ax.bw * 1126407459 + v0.ax.bp * 574766503 * v50 / v2_1;
        v12 = v0.ax.bp * 574766503 * v53 / v2_1 + v0.ax.bo * 0xF7F729AF;
        int v64 = v6;
        int v5 = v0.ax.bp * 574766503 * v3 / v1 + v0.ax.bw * 1126407459;
        v6 = v0.ax.bp * 574766503 * v7 / v1 + v0.ax.bo * 0xF7F729AF;
        int v65 = v4;
        v0.ax.bn = 0;
        int v62 = 1109746211;
        int v63 = 0x8CB26E63;
        int v66 = 1230366805;
        int v67 = -1433150297;
        if((v9 - v5) * (v13 - v6) - (v10 - v5) * (v12 - v6) > 0) {
            v0.ax.ac = false;
            if(v9 < 0 || v5 < 0 || v10 < 0 || v9 > v0.ax.by * v62 || v5 > v0.ax.by * v62 || v10 > v0.ax.by * v62) {
                v0.ax.ac = true;
            }

            if((bg.bw) && (bg.bk(bg.by, bg.bt, v12, v6, v13, v9, v5, v10))) {
                bg.bv = arg77;
                bg.bq = arg78;
            }

            v15_1 = arg71;
            int v19 = 0x65660F3;
            if(-1 == v15_1.an * v67) {
                if(0xBC614E != v15_1.ae * v19) {
                    v0.ax.an(v12, v6, v13, v9, v5, v10, v15_1.ae * v19, v15_1.ar * v66, v15_1.al * v63, 86805035);
                }
            }
            else if(bg.ax) {
                goto label_317;
            }
            else if(v15_1.ap) {
                v0.ax.at(v12, v6, v13, v9, v5, v10, v15_1.ae * v19, v15_1.ar * v66, v15_1.al * v63, v17, v16, v3, v39, v61, v7, v14, v11, v1, v15_1.an * v67, -71);
            }
            else {
                v0.ax.at(v12, v6, v13, v9, v5, v10, v15_1.ae * v19, v15_1.ar * v66, v15_1.al * v63, v50, v3, v16, v53, v7, v61, v2_1, v1, v11, v15_1.an * v67, -62);
            }

            v68 = v1;
            goto label_347;
        label_317:
            v2_1 = ii.au.ar(v15_1.an * v67, -702030598);
            v68 = v1;
            v0.ax.an(v12, v6, v13, v9, v5, v10, io.bh(v2_1, v15_1.ae * v19, 0), io.bh(v2_1, v15_1.ar * v66, 0), io.bh(v2_1, v15_1.al * v63, 0), 86805035);
        }
        else {
            v68 = v1;
            v15_1 = arg71;
        }

    label_347:
        if((v65 - v10) * (v6 - v13) - (v5 - v10) * (v64 - v13) > 0) {
            v0.ax.ac = false;
            if(v65 < 0 || v10 < 0 || v5 < 0) {
                v4 = v65;
            label_376:
                v0.ax.ac = true;
            }
            else {
                v4 = v65;
                if(v4 > v0.ax.by * v62) {
                    goto label_376;
                }
                else if(v10 > v0.ax.by * v62) {
                    goto label_376;
                }
                else if(v5 > v0.ax.by * v62) {
                    goto label_376;
                }
            }

            if((bg.bw) && (bg.bk(bg.by, bg.bt, v64, v13, v6, v4, v10, v5))) {
                bg.bv = arg77;
                bg.bq = arg78;
            }

            int v8 = 1207005007;
            if(-1 == v15_1.an * v67) {
                if(0xBC614E == v15_1.ax * v8) {
                    return;
                }

                v0.ax.an(v64, v13, v6, v4, v10, v5, v15_1.ax * v8, v15_1.al * v63, v15_1.ar * v66, 86805035);
                return;
            }

            if(!bg.ax) {
                v0.ax.at(v64, v13, v6, v4, v10, v5, v15_1.ax * v8, v15_1.al * v63, v15_1.ar * v66, v17, v16, v3, v39, v61, v7, v14, v11, v68, v15_1.an * v67, -36);
                return;
            }

            v1 = ii.au.ar(v15_1.an * v67, 848074924);
            v0.ax.an(v64, v13, v6, v4, v10, v5, io.bh(v1, v15_1.ax * v8, 0), io.bh(v1, v15_1.al * v63, 0), io.bh(v1, v15_1.ar * v66, 0), 86805035);
        }
    }

    public bi al(int arg3) {
        try {
            return this.al;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ay.al(");
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

    void aq(bg arg36, bn arg37, int arg38, int arg39, int arg40, int arg41, int arg42, int arg43) {
        int v34;
        int v33;
        int v26;
        int v10;
        ay v0 = this;
        bn v1 = arg37;
        int v6 = v1.ax.length;
        int v8;
        for(v8 = 0; v8 < v6; ++v8) {
            int v9 = v1.ax[v8] - bg.as;
            v10 = v1.al[v8] - bg.ak;
            int v11 = v1.ae[v8] - bg.ac;
            int v12 = v11 * arg40 + v9 * arg41 >> 16;
            v9 = v11 * arg41 - v9 * arg40 >> 16;
            v11 = v10 * arg39 - v9 * arg38 >> 16;
            v9 = v10 * arg38 + v9 * arg39 >> 16;
            if(v9 < 50) {
                return;
            }

            if(v1.ab != null) {
                bn.ag[v8] = v12;
                bn.ah[v8] = v11;
                bn.at[v8] = v9;
            }

            bn.am[v8] = v0.ax.bp * 574766503 * v12 / v9 + v0.ax.bw * 1126407459;
            bn.az[v8] = v0.ax.bo * 0xF7F729AF + v11 * (v0.ax.bp * 574766503) / v9;
        }

        v0.ax.bn = 0;
        int v2 = v1.aj.length;
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            int v4 = v1.aj[v3];
            int v5 = v1.ad[v3];
            v6 = v1.aq[v3];
            v8 = bn.am[v4];
            int v15 = bn.am[v5];
            int v14 = bn.am[v6];
            int v30 = bn.az[v4];
            int v31 = bn.az[v5];
            int v32 = bn.az[v6];
            if((v8 - v15) * (v32 - v31) - (v30 - v31) * (v14 - v15) > 0) {
                v0.ax.ac = false;
                if(v8 < 0 || v15 < 0 || v14 < 0) {
                label_124:
                    v0.ax.ac = true;
                }
                else {
                    v10 = 1109746211;
                    if(v8 > v0.ax.by * v10) {
                        goto label_124;
                    }
                    else if(v15 > v0.ax.by * v10) {
                        goto label_124;
                    }
                    else if(v14 > v0.ax.by * v10) {
                        goto label_124;
                    }
                }

                if(bg.bw) {
                    v26 = 1;
                    v33 = v14;
                    v34 = v15;
                    if(bg.bk(bg.by, bg.bt, v30, v31, v32, v8, v15, v33)) {
                        bg.bv = arg42;
                        bg.bq = arg43;
                    }
                }
                else {
                    v33 = v14;
                    v34 = v15;
                    v26 = 1;
                }

                if(v1.ab != null) {
                    if(-1 == v1.ab[v3]) {
                    }
                    else {
                        if(bg.ax) {
                            v4 = ii.au.ar(v1.ab[v3], 917876010);
                            v0.ax.an(v30, v31, v32, v8, v34, v33, io.bh(v4, v1.ar[v3], 0), io.bh(v4, v1.an[v3], 0), io.bh(v4, v1.ap[v3], 0), 86805035);
                        }
                        else if(v1.af) {
                            v0.ax.at(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], bn.ag[0], bn.ag[v26], bn.ag[3], bn.ah[0], bn.ah[v26], bn.ah[3], bn.at[0], bn.at[v26], bn.at[3], v1.ab[v3], 19);
                        }
                        else {
                            v0.ax.at(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], bn.ag[v4], bn.ag[v5], bn.ag[v6], bn.ah[v4], bn.ah[v5], bn.ah[v6], bn.at[v4], bn.at[v5], bn.at[v6], v1.ab[v3], -26);
                        }

                        goto label_274;
                    }
                }

                if(v1.ar[v3] == 0xBC614E) {
                    goto label_274;
                }

                v0.ax.an(v30, v31, v32, v8, v34, v33, v1.ar[v3], v1.an[v3], v1.ap[v3], 86805035);
            }

        label_274:
        }
    }

    void ar(bg arg34, bn arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, byte arg42) {
        int v22;
        int v21;
        int v20;
        int v3;
        int v10;
        ay v1 = this;
        bn v0 = arg35;
        try {
            int v6 = v0.ax.length;
            int v8;
            for(v8 = 0; v8 < v6; ++v8) {
                int v9 = v0.ax[v8] - bg.as;
                v10 = v0.al[v8] - bg.ak;
                int v11 = v0.ae[v8] - bg.ac;
                int v12 = v11 * arg38 + v9 * arg39 >> 16;
                v9 = v11 * arg39 - v9 * arg38 >> 16;
                v11 = v10 * arg37 - v9 * arg36 >> 16;
                v9 = v10 * arg36 + v9 * arg37 >> 16;
                if(v9 < 50) {
                    return;
                }

                if(v0.ab != null) {
                    bn.ag[v8] = v12;
                    bn.ah[v8] = v11;
                    bn.at[v8] = v9;
                }

                bn.am[v8] = v1.ax.bp * 574766503 * v12 / v9 + v1.ax.bw * 1126407459;
                bn.az[v8] = v1.ax.bo * 0xF7F729AF + v11 * (v1.ax.bp * 574766503) / v9;
            }

            v1.ax.bn = 0;
            int v2 = v0.aj.length;
            v3 = 0;
            while(true) {
            label_78:
                if(v3 >= v2) {
                    return;
                }

                int v4 = v0.aj[v3];
                int v5 = v0.ad[v3];
                v6 = v0.aq[v3];
                v8 = bn.am[v4];
                int v15 = bn.am[v5];
                int v14 = bn.am[v6];
                int v17 = bn.az[v4];
                int v18 = bn.az[v5];
                int v19 = bn.az[v6];
                if((v8 - v15) * (v19 - v18) - (v17 - v18) * (v14 - v15) > 0) {
                    v1.ax.ac = false;
                    if(v8 < 0 || v15 < 0 || v14 < 0) {
                    label_124:
                        v1.ax.ac = true;
                    }
                    else {
                        v10 = 1109746211;
                        if(v8 > v1.ax.by * v10) {
                            goto label_124;
                        }
                        else if(v15 > v1.ax.by * v10) {
                            goto label_124;
                        }
                        else if(v14 > v1.ax.by * v10) {
                            goto label_124;
                        }
                    }

                    if(bg.bw) {
                        v20 = 1;
                        v21 = v14;
                        v22 = v15;
                        if(bg.bk(bg.by, bg.bt, v17, v18, v19, v8, v15, v21)) {
                            bg.bv = arg40;
                            bg.bq = arg41;
                        }
                    }
                    else {
                        v21 = v14;
                        v22 = v15;
                        v20 = 1;
                    }

                    if(v0.ab != null) {
                        if(-1 == v0.ab[v3]) {
                        }
                        else {
                            if(bg.ax) {
                                v4 = ii.au.ar(v0.ab[v3], 956706490);
                                v1.ax.an(v17, v18, v19, v8, v22, v21, io.bh(v4, v0.ar[v3], 0), io.bh(v4, v0.an[v3], 0), io.bh(v4, v0.ap[v3], 0), 86805035);
                            }
                            else if(v0.af) {
                                v1.ax.at(v17, v18, v19, v8, v22, v21, v0.ar[v3], v0.an[v3], v0.ap[v3], bn.ag[0], bn.ag[v20], bn.ag[3], bn.ah[0], bn.ah[v20], bn.ah[3], bn.at[0], bn.at[v20], bn.at[3], v0.ab[v3], -65);
                            }
                            else {
                                v1.ax.at(v17, v18, v19, v8, v22, v21, v0.ar[v3], v0.an[v3], v0.ap[v3], bn.ag[v4], bn.ag[v5], bn.ag[v6], bn.ah[v4], bn.ah[v5], bn.ah[v6], bn.at[v4], bn.at[v5], bn.at[v6], v0.ab[v3], 76);
                            }

                            break;
                        }
                    }

                    if(v0.ar[v3] == 0xBC614E) {
                        break;
                    }

                    v1.ax.an(v17, v18, v19, v8, v22, v21, v0.ar[v3], v0.an[v3], v0.ap[v3], 86805035);
                }

                break;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_309;
        }

        ++v3;
        goto label_78;
        return;
    label_309:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("ay.ar(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public bt ax(int arg3) {
        try {
            return this.ax;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ay.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

