public final class bn {
    int aa;
    int[] ab;
    int[] ad;
    int[] ae;
    boolean af;
    static int[] ag;
    static int[] ah;
    int ai;
    int[] aj;
    int[] al;
    static int[] am;
    int[] an;
    int[] ap;
    int[] aq;
    int[] ar;
    static int[] at;
    int au;
    int av;
    static final int[][] aw;
    int[] ax;
    static final int[][] ay;
    static int[] az;

    static {
        bn.am = new int[6];
        bn.az = new int[6];
        bn.ag = new int[6];
        bn.ah = new int[6];
        bn.at = new int[6];
        bn.ay = new int[][]{new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 6}, new int[]{1, 3, 5, 7, 2, 6}, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 2, 8}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 11, 12}, new int[]{1, 3, 5, 7, 13, 14}};
        bn.aw = new int[][]{new int[]{0, 1, 2, 3, 0, 0, 1, 3}, new int[]{1, 1, 2, 3, 1, 0, 1, 3}, new int[]{0, 1, 2, 3, 1, 0, 1, 3}, new int[]{0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, new int[]{0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, new int[]{0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, new int[]{0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, new int[]{0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, new int[]{0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, new int[]{0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, new int[]{1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, new int[]{1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
    }

    bn(int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int arg42, int arg43, int arg44, int arg45, int arg46, int arg47, int arg48, int arg49) {
        bn v3_2;
        int v21;
        int v20;
        int v28;
        int v22;
        int v27;
        int v25;
        bn v0 = this;
        int v1 = arg31;
        int v2 = arg32;
        int v4 = arg36;
        int v5 = arg37;
        int v6 = arg38;
        int v7 = arg39;
        super();
        v0.af = true;
        if(v4 != v5 || v4 != v6 || v4 != v7) {
            v0.af = false;
        }

        v0.ai = v1;
        v0.av = v2;
        v0.aa = arg48;
        v0.au = arg49;
        int[] v3 = bn.ay[v1];
        v1 = v3.length;
        v0.ax = new int[v1];
        v0.al = new int[v1];
        v0.ae = new int[v1];
        int[] v18 = new int[v1];
        int[] v19 = new int[v1];
        int v15 = arg34 * 0x80;
        int v0_1 = arg35 * 0x80;
        int v11 = 0;
        while(v11 < v1) {
            v7 = v3[v11];
            int v24 = v1;
            v1 = 8;
            if((v7 & 1) == 0 && v7 <= v1) {
                v7 = (v7 - v2 - v2 - 1 & 7) + 1;
            }

            int[] v26 = v3;
            int v3_1 = 12;
            if(v7 > v1 && v7 <= v3_1) {
                v7 = (v7 - 9 - v2 & 3) + 9;
            }

            v1 = 13;
            if(v7 > v3_1 && v7 <= 16) {
                v7 = (v7 - 13 - v2 & 3) + v1;
            }

            if(v7 == 1) {
                v25 = arg40;
                v27 = arg44;
                v22 = v0_1;
                v28 = v22;
                v20 = v4;
                v21 = v11;
                v7 = v15;
                goto label_83;
            }
            else {
                if(v7 == 2) {
                    v1 = v15 + 0x40;
                    v7 = v4 + v5 >> 1;
                    v20 = arg40 + arg41 >> 1;
                    v21 = arg44 + arg45 >> 1;
                    v22 = v0_1;
                    v28 = v22;
                }
                else {
                    if(v7 == 3) {
                        v25 = arg41;
                        v27 = arg45;
                        v22 = v0_1;
                        v28 = v22;
                        v7 = v15 + 0x80;
                        v20 = v5;
                    }
                    else if(v7 == 4) {
                        v1 = v15 + 0x80;
                        v7 = v5 + v6 >> 1;
                        v20 = arg41 + arg42 >> 1;
                        v21 = arg45 + arg46 >> 1;
                        v28 = v0_1;
                        v22 = v0_1 + 0x40;
                        goto label_97;
                    }
                    else {
                        goto label_130;
                    }

                    goto label_140;
                }

            label_97:
                v25 = v20;
                v27 = v21;
                v3_2 = this;
                v20 = v7;
                v21 = v11;
                v7 = v1;
                goto label_281;
            label_130:
                if(v7 == 5) {
                    v25 = arg42;
                    v27 = arg46;
                    v28 = v0_1;
                    v7 = v15 + 0x80;
                    v22 = v0_1 + 0x80;
                    v20 = v6;
                }
                else {
                    goto label_142;
                }

            label_140:
                v21 = v11;
                goto label_83;
            label_142:
                if(v7 == 6) {
                    v20 = v6 + arg39 >> 1;
                    v21 = v11;
                    v28 = v0_1;
                    v27 = arg46 + arg47 >> 1;
                    v25 = arg42 + arg43 >> 1;
                    v22 = v0_1 + 0x80;
                    v3_2 = this;
                    v7 = v15 + 0x40;
                    goto label_281;
                }

                v21 = v11;
                v1 = arg39;
                if(v7 == 7) {
                    v25 = arg43;
                    v27 = arg47;
                    v28 = v0_1;
                    v20 = v1;
                    v22 = v0_1 + 0x80;
                    v7 = v15;
                label_83:
                    v3_2 = this;
                    goto label_281;
                }

                if(v7 == 8) {
                    v28 = v0_1;
                    v25 = arg43 + arg40 >> 1;
                    v27 = arg47 + arg44 >> 1;
                    v22 = v0_1 + 0x40;
                    v20 = v1 + v4 >> 1;
                    v7 = v15;
                }
                else {
                    if(v7 == 9) {
                        v3_1 = v15 + 0x40;
                        v7 = v0_1 + 0x20;
                        v20 = v4 + v5 >> 1;
                        v22 = arg40 + arg41 >> 1;
                        v25 = arg44 + arg45 >> 1;
                        goto label_219;
                    }
                    else if(v7 == 10) {
                        v3_1 = v15 + 0x60;
                        v7 = v0_1 + 0x40;
                        v20 = v5 + v6 >> 1;
                        v22 = arg41 + arg42 >> 1;
                        v25 = arg45 + arg46 >> 1;
                        goto label_219;
                    }
                    else if(v7 == 11) {
                        v3_1 = v15 + 0x40;
                        v7 = v0_1 + 0x60;
                        v20 = v6 + v1 >> 1;
                        v22 = arg42 + arg43 >> 1;
                        v25 = arg46 + arg47 >> 1;
                        goto label_219;
                    }
                    else if(v7 == 12) {
                        v3_1 = v15 + 0x20;
                        v7 = v0_1 + 0x40;
                        v20 = v1 + v4 >> 1;
                        v22 = arg43 + arg40 >> 1;
                        v25 = arg47 + arg44 >> 1;
                    label_219:
                        v28 = v0_1;
                        v27 = v25;
                        v25 = v22;
                    }
                    else if(v7 == 13) {
                        v3_1 = v15 + 0x20;
                        v7 = v0_1 + 0x20;
                        v25 = arg40;
                        v27 = arg44;
                        v28 = v0_1;
                        v20 = v4;
                    }
                    else if(v7 == 14) {
                        v3_1 = v15 + 0x60;
                        v7 = v0_1 + 0x20;
                        v25 = arg41;
                        v27 = arg45;
                        v28 = v0_1;
                        v20 = v5;
                    }
                    else if(v7 == 15) {
                        v3_1 = v15 + 0x60;
                        v7 = v0_1 + 0x60;
                        v25 = arg42;
                        v27 = arg46;
                        v28 = v0_1;
                        v20 = v6;
                    }
                    else {
                        v3_1 = v15 + 0x20;
                        v7 = v0_1 + 0x60;
                        v25 = arg43;
                        v27 = arg47;
                        v28 = v0_1;
                        v20 = v1;
                    }

                    v22 = v7;
                    v7 = v3_1;
                }

                v3_2 = this;
            }

        label_281:
            v3_2.ax[v21] = v7;
            v3_2.al[v21] = v20;
            v3_2.ae[v21] = v22;
            v18[v21] = v25;
            v19[v21] = v27;
            v11 = v21 + 1;
            v1 = v24;
            v3 = v26;
            v0_1 = v28;
        }

        v3_2 = this;
        int[] v0_2 = bn.aw[arg31];
        v7 = v0_2.length / 4;
        v3_2.aj = new int[v7];
        v3_2.ad = new int[v7];
        v3_2.aq = new int[v7];
        v3_2.ar = new int[v7];
        v3_2.an = new int[v7];
        v3_2.ap = new int[v7];
        int v8 = -1;
        int v9 = arg33;
        if(v9 != v8) {
            v3_2.ab = new int[v7];
        }

        int v10 = 0;
        int v17 = 0;
        while(v10 < v7) {
            v11 = v0_2[v17];
            int v12 = v0_2[v17 + 1];
            int v13 = v0_2[v17 + 2];
            int v14 = v0_2[v17 + 3];
            v17 += 4;
            v15 = 4;
            if(v12 < v15) {
                v12 = v12 - v2 & 3;
            }

            if(v13 < v15) {
                v13 = v13 - v2 & 3;
            }

            if(v14 < v15) {
                v14 = v14 - v2 & 3;
            }

            v3_2.aj[v10] = v12;
            v3_2.ad[v10] = v13;
            v3_2.aq[v10] = v14;
            if(v11 == 0) {
                v3_2.ar[v10] = v18[v12];
                v3_2.an[v10] = v18[v13];
                v3_2.ap[v10] = v18[v14];
                if(v3_2.ab != null) {
                    v3_2.ab[v10] = v8;
                }
            }
            else {
                v3_2.ar[v10] = v19[v12];
                v3_2.an[v10] = v19[v13];
                v3_2.ap[v10] = v19[v14];
                if(v3_2.ab != null) {
                    v3_2.ab[v10] = v9;
                }
            }

            ++v10;
        }
    }
}

