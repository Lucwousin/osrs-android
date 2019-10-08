public class gf extends mx {
    static hd[] aa = null;
    static int ab = 0;
    static float[] ac = null;
    static int ad = 0;
    int ae;
    static int af = 0;
    static boolean ag = false;
    float[] ah;
    static gh[] ai;
    static byte[] aj;
    static float[] ak;
    int al;
    static boolean[] am;
    int an;
    static float[] ao;
    boolean ap;
    static int aq;
    int ar;
    static float[] as;
    int at;
    static go[] au;
    static ge[] av;
    boolean aw;
    byte[][] ax;
    int ay;
    static int[] az;
    static float[] ba;
    static float[] bd;
    static float[] bf;
    static int[] bn;
    int bo;
    static int[] bp;
    byte[] bw;
    int by;

    static {
    }

    gf(byte[] arg1) {
        super();
        this.an(arg1);
    }

    static float aa(int arg6) {
        int v0 = 0x1FFFFF & arg6;
        int v1 = 0x80000000 & arg6;
        arg6 = (arg6 & 0x7FE00000) >> 21;
        if(v1 != 0) {
            v0 = -v0;
        }

        return ((float)((((double)v0)) * Math.pow(2, ((double)(arg6 - 788)))));
    }

    hs ab(int[] arg10) {
        hs v0 = null;
        if(arg10 != null && arg10[0] <= 0) {
            return v0;
        }

        if(this.bw == null) {
            this.at = 0;
            this.ah = new float[gf.af];
            this.bw = new byte[this.ae];
            this.bo = 0;
            this.by = 0;
        }

        while(this.by < this.ax.length) {
            if(arg10 != null && arg10[0] <= 0) {
                return v0;
            }

            float[] v2 = this.aj(this.by);
            if(v2 != null) {
                int v3 = this.bo;
                int v4 = v2.length;
                if(v4 > this.ae - v3) {
                    v4 = this.ae - v3;
                }

                int v5 = v3;
                v3 = 0;
                while(v3 < v4) {
                    int v6 = ((int)(v2[v3] * 128f + 128f));
                    if((v6 & 0xFFFFFF00) != 0) {
                        v6 = ~v6 >> 0x1F;
                    }

                    this.bw[v5] = ((byte)(v6 - 0x80));
                    ++v3;
                    ++v5;
                }

                if(arg10 != null) {
                    arg10[0] -= v5 - this.bo;
                }

                this.bo = v5;
            }

            ++this.by;
        }

        this.ah = ((float[])v0);
        byte[] v5_1 = this.bw;
        this.bw = ((byte[])v0);
        return new hs(this.al, v5_1, this.ar, this.an, this.ap);
    }

    float[] ac(int arg39) {
        double v11_2;
        double v1_2;
        float v12_1;
        int v3_1;
        float v11_1;
        float v24_1;
        int v36;
        int v34;
        float v23_1;
        int v22_1;
        float v25_1;
        float v26;
        int v25;
        float v21_1;
        float v22;
        int v24;
        int v23;
        int v21;
        int v20;
        float v17;
        int v2;
        int v13;
        int v12;
        int v11;
        int v10;
        int v7;
        int v6;
        gf.al(this.ax[arg39], 0);
        gf.ae();
        int v1 = gf.ar(hj.ar(gf.az.length - 1, 1840898093));
        boolean v4 = gf.am[v1];
        int v5 = v4 ? gf.af : gf.ab;
        if(v4) {
            v6 = gf.ae() != 0 ? 1 : 0;
            if(gf.ae() == 0) {
                goto label_30;
            }

            v7 = 1;
        }
        else {
            v6 = 0;
        label_30:
            v7 = 0;
        }

        int v8 = v5 >> 1;
        int v9 = 2;
        if(!v4 || v6 != 0) {
            v6 = v8;
            v11 = v6;
            v10 = 0;
        }
        else {
            v6 = v5 >> 2;
            v10 = v6 - (gf.ab >> v9);
            v6 += gf.ab >> v9;
            v11 = gf.ab >> 1;
        }

        if(!v4 || v7 != 0) {
            v7 = v5;
            v12 = v8;
            v13 = v12;
        }
        else {
            v7 = v5 - (v5 >> 2);
            v12 = v7 - (gf.ab >> v9);
            v7 += gf.ab >> v9;
            v13 = gf.ab >> 1;
        }

        go v1_1 = gf.au[gf.az[v1]];
        int v14 = gf.av[v1_1.ae[v1_1.al]].ap() ^ 1;
        int v15;
        for(v15 = 0; v15 < v1_1.ax; ++v15) {
            gf.aa[v1_1.ar[v15]].ax(gf.ao, v8, ((boolean)v14));
        }

        if(v14 == 0) {
            gf.av[v1_1.ae[v1_1.al]].aj(gf.ao, v8);
        }

        if(v14 != 0) {
            v1 = v8;
            goto label_97;
        }
        else {
            v1 = v5 >> 2;
            v2 = v5 >> 3;
            float[] v9_1 = gf.ao;
            for(v15 = 0; true; ++v15) {
                v17 = 0.5f;
                if(v15 >= v8) {
                    break;
                }

                v9_1[v15] *= v17;
            }

            for(v15 = v8; v15 < v5; ++v15) {
                v9_1[v15] = -v9_1[v5 - v15 - 1];
            }

            float[] v3 = v4 ? gf.bd : gf.as;
            float[] v15_1 = v4 ? gf.ba : gf.ak;
            float[] v18 = v4 ? gf.bf : gf.ac;
            int[] v4_1 = v4 ? gf.bp : gf.bn;
            v20 = v14;
            for(v14 = 0; v14 < v1; ++v14) {
                v21 = v14 * 4;
                v23 = v5 - v21;
                v24 = v23 - 1;
                v22 = v9_1[v21] - v9_1[v24];
                v23 += -3;
                v21_1 = v9_1[v21 + 2] - v9_1[v23];
                v25 = v14 * 2;
                v26 = v3[v25];
                v25_1 = v3[v25 + 1];
                v9_1[v24] = v22 * v26 - v21_1 * v25_1;
                v9_1[v23] = v22 * v25_1 + v21_1 * v26;
            }

            for(v14 = 0; v14 < v2; ++v14) {
                v22_1 = v14 * 4;
                v21 = v8 + 3 + v22_1;
                v23_1 = v9_1[v21];
                v24 = v8 + 1 + v22_1;
                v25_1 = v9_1[v24];
                int v26_1 = v22_1 + 3;
                float v27 = v9_1[v26_1];
                int v28 = v22_1 + 1;
                float v29 = v9_1[v28];
                v9_1[v21] = v23_1 + v27;
                v9_1[v24] = v25_1 + v29;
                v21_1 = v3[v8 - 4 - v22_1];
                v22 = v3[v8 - 3 - v22_1];
                v23_1 -= v27;
                v25_1 -= v29;
                v9_1[v26_1] = v23_1 * v21_1 - v25_1 * v22;
                v9_1[v28] = v25_1 * v21_1 + v23_1 * v22;
            }

            v14 = v5 - 1;
            int v0 = hj.ar(v14, 0xFC8B8F0E);
            int v32 = v12;
            int v31 = v13;
            v13 = 0;
            while(v13 < v0 - 3) {
                v12 = v5 >> v13 + 2;
                v21 = 8 << v13;
                int v33 = v0;
                v34 = v7;
                v0 = 0;
                while(v0 < 2 << v13) {
                    v7 = v5 - v12 * 2 * v0;
                    v22_1 = v5 - (v0 * 2 + 1) * v12;
                    int v35 = v12;
                    v12 = 0;
                    while(true) {
                        v36 = v11;
                        if(v12 >= v5 >> v13 + 4) {
                            break;
                        }

                        v11 = v12 * 4;
                        v23 = v7 - 1 - v11;
                        v24_1 = v9_1[v23];
                        v25 = v7 - 3 - v11;
                        v26 = v9_1[v25];
                        int v27_1 = v22_1 - 1 - v11;
                        float v28_1 = v9_1[v27_1];
                        int v29_1 = v22_1 - 3 - v11;
                        v11_1 = v9_1[v29_1];
                        v9_1[v23] = v24_1 + v28_1;
                        v9_1[v25] = v26 + v11_1;
                        v23 = v12 * v21;
                        v25_1 = v3[v23];
                        v23_1 = v3[v23 + 1];
                        v24_1 -= v28_1;
                        v26 -= v11_1;
                        v9_1[v27_1] = v24_1 * v25_1 - v26 * v23_1;
                        v9_1[v29_1] = v26 * v25_1 + v24_1 * v23_1;
                        ++v12;
                        v11 = v36;
                    }

                    ++v0;
                    v12 = v35;
                    v11 = v36;
                }

                ++v13;
                v0 = v33;
                v7 = v34;
            }

            v34 = v7;
            v36 = v11;
            for(v0 = 1; v0 < v2 - 1; ++v0) {
                v3_1 = v4_1[v0];
                if(v0 < v3_1) {
                    v7 = v0 * 8;
                    v3_1 *= 8;
                    v11 = v7 + 1;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 1;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v11 = v7 + 3;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 3;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v11 = v7 + 5;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 5;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v7 += 7;
                    v11_1 = v9_1[v7];
                    v3_1 += 7;
                    v9_1[v7] = v9_1[v3_1];
                    v9_1[v3_1] = v11_1;
                }
            }

            for(v0 = 0; v0 < v8; ++v0) {
                v9_1[v0] = v9_1[v0 * 2 + 1];
            }

            for(v0 = 0; v0 < v2; ++v0) {
                v3_1 = v0 * 2;
                v7 = v0 * 4;
                v9_1[v14 - v3_1] = v9_1[v7];
                v9_1[v5 - 2 - v3_1] = v9_1[v7 + 1];
                int v4_2 = v5 - v1;
                v9_1[v4_2 - 1 - v3_1] = v9_1[v7 + 2];
                v9_1[v4_2 - 2 - v3_1] = v9_1[v7 + 3];
            }

            v0 = 0;
            while(v0 < v2) {
                v3_1 = v0 * 2;
                float v4_3 = v18[v3_1];
                float v7_1 = v18[v3_1 + 1];
                v11 = v8 + v3_1;
                v12_1 = v9_1[v11];
                v13 = v11 + 1;
                int v37 = v2;
                float v2_1 = v9_1[v13];
                v21 = v5 - 2 - v3_1;
                v22 = v9_1[v21];
                v3_1 = v14 - v3_1;
                v23_1 = v9_1[v3_1];
                v24_1 = v12_1 - v22;
                v26 = v2_1 + v23_1;
                v25_1 = v7_1 * v24_1 + v4_3 * v26;
                v12_1 += v22;
                v9_1[v11] = (v12_1 + v25_1) * v17;
                v9_1[v21] = (v12_1 - v25_1) * v17;
                v7_1 = v7_1 * v26 - v4_3 * v24_1;
                v9_1[v13] = (v2_1 - v23_1 + v7_1) * v17;
                v9_1[v3_1] = (-v2_1 + v23_1 + v7_1) * v17;
                ++v0;
                v2 = v37;
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v2 = v0 * 2;
                v3_1 = v2 + v8;
                v7 = v2 + 1;
                v11 = v7 + v8;
                v9_1[v0] = v9_1[v3_1] * v15_1[v2] + v9_1[v11] * v15_1[v7];
                v9_1[v8 - 1 - v0] = v9_1[v3_1] * v15_1[v7] - v9_1[v11] * v15_1[v2];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v5 - v1 + v0] = -v9_1[v0];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v0] = v9_1[v1 + v0];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v1 + v0] = -v9_1[v1 - v0 - 1];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v8 + v0] = v9_1[v5 - v0 - 1];
            }

            v0 = v10;
            while(true) {
                v1_2 = 3.141593;
                v11_2 = 0.5;
                if(v0 >= v6) {
                    break;
                }

                v11_2 = ((double)(((float)Math.sin(((((double)(v0 - v10))) + v11_2) / (((double)v36)) * v11_2 * v1_2))));
                gf.ao[v0] *= ((float)Math.sin(1.570796 * v11_2 * v11_2));
                ++v0;
                v36 = v36;
            }

            v0 = v32;
            v7 = v34;
            while(true) {
                if(v0 >= v7) {
                    goto label_512;
                }

                v1_2 = ((double)(((float)Math.sin(((((double)(v0 - v32))) + v11_2) / (((double)v31)) * v11_2 * v1_2 + 1.570796))));
                gf.ao[v0] *= ((float)Math.sin(v1_2 * 1.570796 * v1_2));
                ++v0;
                v31 = v31;
                v1_2 = 3.141593;
            }

        label_97:
            while(v1 < v5) {
                gf.ao[v1] = 0f;
                ++v1;
            }

            v20 = v14;
        }

    label_512:
        float[] v0_1 = null;
        gf v1_3 = this;
        if(v1_3.at > 0) {
            v0_1 = new float[v1_3.at + v5 >> 2];
            if(!v1_3.aw) {
                for(v2 = 0; v2 < v1_3.ay; ++v2) {
                    v0_1[v2] += v1_3.ah[(v1_3.at >> 1) + v2];
                }
            }

            if(v20 != 0) {
                goto label_549;
            }

            while(v10 < v8) {
                v2 = v0_1.length - v8 + v10;
                v0_1[v2] += gf.ao[v10];
                ++v10;
            }
        }

    label_549:
        float[] v2_2 = v1_3.ah;
        v1_3.ah = gf.ao;
        gf.ao = v2_2;
        v1_3.at = v5;
        v1_3.ay = v7 - v8;
        v1_3.aw = v20;
        return v0_1;
    }

    static boolean ad(ko arg3) {
        if(!gf.ag) {
            byte[] v3 = arg3.ae(0, 0, 0x78DC0DC9);
            if(v3 == null) {
                return 0;
            }
            else {
                gf.ap(v3);
                gf.ag = true;
            }
        }

        return 1;
    }

    static int ae() {
        int v0 = gf.aj[gf.ad] >> gf.aq & 1;
        ++gf.aq;
        gf.ad += gf.aq >> 3;
        gf.aq &= 7;
        return v0;
    }

    static float af(int arg6) {
        int v0 = 0x1FFFFF & arg6;
        int v1 = 0x80000000 & arg6;
        arg6 = (arg6 & -2078808246) >> 21;
        if(v1 != 0) {
            v0 = -v0;
        }

        return ((float)((((double)v0)) * Math.pow(2, ((double)(arg6 - 788)))));
    }

    static int ag() {
        int v0 = gf.aj[gf.ad] >> gf.aq & 1;
        ++gf.aq;
        gf.ad += gf.aq >> 3;
        gf.aq &= 7;
        return v0;
    }

    static int ah(int arg8) {
        int v1 = 0;
        int v2 = 0;
        while(arg8 >= 8 - gf.aq) {
            int v3 = 8 - gf.aq;
            v1 += ((1 << v3) - 1 & gf.aj[gf.ad] >> gf.aq) << v2;
            gf.aq = 0;
            ++gf.ad;
            v2 += v3;
            arg8 -= v3;
        }

        if(arg8 > 0) {
            v1 += ((1 << arg8) - 1 & gf.aj[gf.ad] >> gf.aq) << v2;
            gf.aq += arg8;
        }

        return v1;
    }

    static float ai(int arg6) {
        int v0 = 0x1FFFFF & arg6;
        int v1 = 0x80000000 & arg6;
        arg6 = (arg6 & 0x7FE00000) >> 21;
        if(v1 != 0) {
            v0 = -v0;
        }

        return ((float)((((double)v0)) * Math.pow(2, ((double)(arg6 - 788)))));
    }

    float[] aj(int arg39) {
        double v11_2;
        double v1_2;
        float v12_1;
        int v3_1;
        float v11_1;
        float v24_1;
        int v36;
        int v34;
        int v32;
        float v23_1;
        int v22_1;
        float v25_1;
        float v26;
        int v25;
        float v21_1;
        float v22;
        int v24;
        int v23;
        int v21;
        boolean v20;
        float v17;
        int v2;
        int v13;
        int v12;
        int v11;
        int v10;
        int v7;
        int v6;
        gf.al(this.ax[arg39], 0);
        gf.ae();
        int v1 = gf.ar(hj.ar(gf.az.length - 1, 2013409619));
        boolean v4 = gf.am[v1];
        int v5 = v4 ? gf.af : gf.ab;
        if(v4) {
            v6 = gf.ae() != 0 ? 1 : 0;
            if(gf.ae() == 0) {
                goto label_30;
            }

            v7 = 1;
        }
        else {
            v6 = 0;
        label_30:
            v7 = 0;
        }

        int v8 = v5 >> 1;
        int v9 = 2;
        if(!v4 || v6 != 0) {
            v6 = v8;
            v11 = v6;
            v10 = 0;
        }
        else {
            v6 = v5 >> 2;
            v10 = v6 - (gf.ab >> v9);
            v6 += gf.ab >> v9;
            v11 = gf.ab >> 1;
        }

        if(!v4 || v7 != 0) {
            v7 = v5;
            v12 = v8;
            v13 = v12;
        }
        else {
            v7 = v5 - (v5 >> 2);
            v12 = v7 - (gf.ab >> v9);
            v7 += gf.ab >> v9;
            v13 = gf.ab >> 1;
        }

        go v1_1 = gf.au[gf.az[v1]];
        boolean v14 = !gf.av[v1_1.ae[v1_1.al]].ap() ? true : false;
        int v15;
        for(v15 = 0; v15 < v1_1.ax; ++v15) {
            gf.aa[v1_1.ar[v15]].ax(gf.ao, v8, v14);
        }

        if(!v14) {
            gf.av[v1_1.ae[v1_1.al]].aj(gf.ao, v8);
        }

        if(v14) {
            v1 = v8;
            goto label_100;
        }
        else {
            v1 = v5 >> 2;
            v2 = v5 >> 3;
            float[] v9_1 = gf.ao;
            for(v15 = 0; true; ++v15) {
                v17 = 0.5f;
                if(v15 >= v8) {
                    break;
                }

                v9_1[v15] *= v17;
            }

            for(v15 = v8; v15 < v5; ++v15) {
                v9_1[v15] = -v9_1[v5 - v15 - 1];
            }

            float[] v3 = v4 ? gf.bd : gf.as;
            float[] v15_1 = v4 ? gf.ba : gf.ak;
            float[] v18 = v4 ? gf.bf : gf.ac;
            int[] v4_1 = v4 ? gf.bp : gf.bn;
            v20 = v14;
            int v14_1;
            for(v14_1 = 0; v14_1 < v1; ++v14_1) {
                v21 = v14_1 * 4;
                v23 = v5 - v21;
                v24 = v23 - 1;
                v22 = v9_1[v21] - v9_1[v24];
                v23 += -3;
                v21_1 = v9_1[v21 + 2] - v9_1[v23];
                v25 = v14_1 * 2;
                v26 = v3[v25];
                v25_1 = v3[v25 + 1];
                v9_1[v24] = v22 * v26 - v21_1 * v25_1;
                v9_1[v23] = v22 * v25_1 + v21_1 * v26;
            }

            for(v14_1 = 0; v14_1 < v2; ++v14_1) {
                v22_1 = v14_1 * 4;
                v21 = v8 + 3 + v22_1;
                v23_1 = v9_1[v21];
                v24 = v8 + 1 + v22_1;
                v25_1 = v9_1[v24];
                int v26_1 = v22_1 + 3;
                float v27 = v9_1[v26_1];
                int v28 = v22_1 + 1;
                float v29 = v9_1[v28];
                v9_1[v21] = v23_1 + v27;
                v9_1[v24] = v25_1 + v29;
                v21_1 = v3[v8 - 4 - v22_1];
                v22 = v3[v8 - 3 - v22_1];
                v23_1 -= v27;
                v25_1 -= v29;
                v9_1[v26_1] = v23_1 * v21_1 - v25_1 * v22;
                v9_1[v28] = v25_1 * v21_1 + v23_1 * v22;
            }

            v14_1 = v5 - 1;
            int v0 = hj.ar(v14_1, 1487828065);
            int v31 = v13;
            v13 = 0;
            while(true) {
                v32 = v12;
                if(v13 >= v0 - 3) {
                    break;
                }

                v12 = v5 >> v13 + 2;
                v21 = 8 << v13;
                int v33 = v0;
                v34 = v7;
                v0 = 0;
                while(v0 < 2 << v13) {
                    v7 = v5 - v12 * 2 * v0;
                    v22_1 = v5 - (v0 * 2 + 1) * v12;
                    int v35 = v12;
                    v12 = 0;
                    while(true) {
                        v36 = v11;
                        if(v12 >= v5 >> v13 + 4) {
                            break;
                        }

                        v11 = v12 * 4;
                        v23 = v7 - 1 - v11;
                        v24_1 = v9_1[v23];
                        v25 = v7 - 3 - v11;
                        v26 = v9_1[v25];
                        int v27_1 = v22_1 - 1 - v11;
                        float v28_1 = v9_1[v27_1];
                        int v29_1 = v22_1 - 3 - v11;
                        v11_1 = v9_1[v29_1];
                        v9_1[v23] = v24_1 + v28_1;
                        v9_1[v25] = v26 + v11_1;
                        v23 = v12 * v21;
                        v25_1 = v3[v23];
                        v23_1 = v3[v23 + 1];
                        v24_1 -= v28_1;
                        v26 -= v11_1;
                        v9_1[v27_1] = v24_1 * v25_1 - v26 * v23_1;
                        v9_1[v29_1] = v26 * v25_1 + v24_1 * v23_1;
                        ++v12;
                        v11 = v36;
                    }

                    ++v0;
                    v12 = v35;
                    v11 = v36;
                }

                ++v13;
                v12 = v32;
                v0 = v33;
                v7 = v34;
            }

            v34 = v7;
            v36 = v11;
            for(v0 = 1; v0 < v2 - 1; ++v0) {
                v3_1 = v4_1[v0];
                if(v0 < v3_1) {
                    v7 = v0 * 8;
                    v3_1 *= 8;
                    v11 = v7 + 1;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 1;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v11 = v7 + 3;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 3;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v11 = v7 + 5;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 5;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v7 += 7;
                    v11_1 = v9_1[v7];
                    v3_1 += 7;
                    v9_1[v7] = v9_1[v3_1];
                    v9_1[v3_1] = v11_1;
                }
            }

            for(v0 = 0; v0 < v8; ++v0) {
                v9_1[v0] = v9_1[v0 * 2 + 1];
            }

            for(v0 = 0; v0 < v2; ++v0) {
                v3_1 = v0 * 2;
                v7 = v0 * 4;
                v9_1[v14_1 - v3_1] = v9_1[v7];
                v9_1[v5 - 2 - v3_1] = v9_1[v7 + 1];
                int v4_2 = v5 - v1;
                v9_1[v4_2 - 1 - v3_1] = v9_1[v7 + 2];
                v9_1[v4_2 - 2 - v3_1] = v9_1[v7 + 3];
            }

            v0 = 0;
            while(v0 < v2) {
                v3_1 = v0 * 2;
                float v4_3 = v18[v3_1];
                float v7_1 = v18[v3_1 + 1];
                v11 = v8 + v3_1;
                v12_1 = v9_1[v11];
                v13 = v11 + 1;
                int v37 = v2;
                float v2_1 = v9_1[v13];
                v21 = v5 - 2 - v3_1;
                v22 = v9_1[v21];
                v3_1 = v14_1 - v3_1;
                v23_1 = v9_1[v3_1];
                v24_1 = v12_1 - v22;
                v26 = v2_1 + v23_1;
                v25_1 = v7_1 * v24_1 + v4_3 * v26;
                v12_1 += v22;
                v9_1[v11] = (v12_1 + v25_1) * v17;
                v9_1[v21] = (v12_1 - v25_1) * v17;
                v7_1 = v7_1 * v26 - v4_3 * v24_1;
                v9_1[v13] = (v2_1 - v23_1 + v7_1) * v17;
                v9_1[v3_1] = (-v2_1 + v23_1 + v7_1) * v17;
                ++v0;
                v2 = v37;
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v2 = v0 * 2;
                v3_1 = v2 + v8;
                v7 = v2 + 1;
                v11 = v7 + v8;
                v9_1[v0] = v9_1[v3_1] * v15_1[v2] + v9_1[v11] * v15_1[v7];
                v9_1[v8 - 1 - v0] = v9_1[v3_1] * v15_1[v7] - v9_1[v11] * v15_1[v2];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v5 - v1 + v0] = -v9_1[v0];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v0] = v9_1[v1 + v0];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v1 + v0] = -v9_1[v1 - v0 - 1];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v8 + v0] = v9_1[v5 - v0 - 1];
            }

            v0 = v10;
            while(true) {
                v1_2 = 3.141593;
                v11_2 = 0.5;
                if(v0 >= v6) {
                    break;
                }

                v11_2 = ((double)(((float)Math.sin(((((double)(v0 - v10))) + v11_2) / (((double)v36)) * v11_2 * v1_2))));
                gf.ao[v0] *= ((float)Math.sin(1.570796 * v11_2 * v11_2));
                ++v0;
                v36 = v36;
            }

            v0 = v32;
            v7 = v34;
            while(true) {
                if(v0 >= v7) {
                    goto label_513;
                }

                v1_2 = ((double)(((float)Math.sin(((((double)(v0 - v32))) + v11_2) / (((double)v31)) * v11_2 * v1_2 + 1.570796))));
                gf.ao[v0] *= ((float)Math.sin(v1_2 * 1.570796 * v1_2));
                ++v0;
                v1_2 = 3.141593;
            }

        label_100:
            while(v1 < v5) {
                gf.ao[v1] = 0f;
                ++v1;
            }

            v20 = v14;
        }

    label_513:
        float[] v0_1 = null;
        gf v1_3 = this;
        if(v1_3.at > 0) {
            v0_1 = new float[v1_3.at + v5 >> 2];
            if(!v1_3.aw) {
                for(v2 = 0; v2 < v1_3.ay; ++v2) {
                    v0_1[v2] += v1_3.ah[(v1_3.at >> 1) + v2];
                }
            }

            if(v20) {
                goto label_550;
            }

            while(v10 < v8) {
                v2 = v0_1.length - v8 + v10;
                v0_1[v2] += gf.ao[v10];
                ++v10;
            }
        }

    label_550:
        float[] v2_2 = v1_3.ah;
        v1_3.ah = gf.ao;
        gf.ao = v2_2;
        v1_3.at = v5;
        v1_3.ay = v7 - v8;
        v1_3.aw = v20;
        return v0_1;
    }

    float[] ak(int arg39) {
        double v11_2;
        double v1_2;
        float v12_1;
        int v3_1;
        float v11_1;
        float v24_1;
        int v36;
        int v34;
        int v32;
        float v23_1;
        int v22_1;
        float v25_1;
        float v26;
        int v25;
        float v21_1;
        float v22;
        int v24;
        int v23;
        int v21;
        boolean v20;
        float v17;
        int v2;
        int v13;
        int v12;
        int v11;
        int v10;
        int v7;
        int v6;
        gf.al(this.ax[arg39], 0);
        gf.ae();
        int v1 = gf.ar(hj.ar(gf.az.length - 1, -1199937620));
        boolean v4 = gf.am[v1];
        int v5 = v4 ? gf.af : gf.ab;
        if(v4) {
            v6 = gf.ae() != 0 ? 1 : 0;
            if(gf.ae() == 0) {
                goto label_30;
            }

            v7 = 1;
        }
        else {
            v6 = 0;
        label_30:
            v7 = 0;
        }

        int v8 = v5 >> 1;
        int v9 = 2;
        if(!v4 || v6 != 0) {
            v6 = v8;
            v11 = v6;
            v10 = 0;
        }
        else {
            v6 = v5 >> 2;
            v10 = v6 - (gf.ab >> v9);
            v6 += gf.ab >> v9;
            v11 = gf.ab >> 1;
        }

        if(!v4 || v7 != 0) {
            v7 = v5;
            v12 = v8;
            v13 = v12;
        }
        else {
            v7 = v5 - (v5 >> 2);
            v12 = v7 - (gf.ab >> v9);
            v7 += gf.ab >> v9;
            v13 = gf.ab >> 1;
        }

        go v1_1 = gf.au[gf.az[v1]];
        boolean v14 = !gf.av[v1_1.ae[v1_1.al]].ap() ? true : false;
        int v15;
        for(v15 = 0; v15 < v1_1.ax; ++v15) {
            gf.aa[v1_1.ar[v15]].ax(gf.ao, v8, v14);
        }

        if(!v14) {
            gf.av[v1_1.ae[v1_1.al]].aj(gf.ao, v8);
        }

        if(v14) {
            v1 = v8;
            goto label_100;
        }
        else {
            v1 = v5 >> 2;
            v2 = v5 >> 3;
            float[] v9_1 = gf.ao;
            for(v15 = 0; true; ++v15) {
                v17 = 0.5f;
                if(v15 >= v8) {
                    break;
                }

                v9_1[v15] *= v17;
            }

            for(v15 = v8; v15 < v5; ++v15) {
                v9_1[v15] = -v9_1[v5 - v15 - 1];
            }

            float[] v3 = v4 ? gf.bd : gf.as;
            float[] v15_1 = v4 ? gf.ba : gf.ak;
            float[] v18 = v4 ? gf.bf : gf.ac;
            int[] v4_1 = v4 ? gf.bp : gf.bn;
            v20 = v14;
            int v14_1;
            for(v14_1 = 0; v14_1 < v1; ++v14_1) {
                v21 = v14_1 * 4;
                v23 = v5 - v21;
                v24 = v23 - 1;
                v22 = v9_1[v21] - v9_1[v24];
                v23 += -3;
                v21_1 = v9_1[v21 + 2] - v9_1[v23];
                v25 = v14_1 * 2;
                v26 = v3[v25];
                v25_1 = v3[v25 + 1];
                v9_1[v24] = v22 * v26 - v21_1 * v25_1;
                v9_1[v23] = v22 * v25_1 + v21_1 * v26;
            }

            for(v14_1 = 0; v14_1 < v2; ++v14_1) {
                v22_1 = v14_1 * 4;
                v21 = v8 + 3 + v22_1;
                v23_1 = v9_1[v21];
                v24 = v8 + 1 + v22_1;
                v25_1 = v9_1[v24];
                int v26_1 = v22_1 + 3;
                float v27 = v9_1[v26_1];
                int v28 = v22_1 + 1;
                float v29 = v9_1[v28];
                v9_1[v21] = v23_1 + v27;
                v9_1[v24] = v25_1 + v29;
                v21_1 = v3[v8 - 4 - v22_1];
                v22 = v3[v8 - 3 - v22_1];
                v23_1 -= v27;
                v25_1 -= v29;
                v9_1[v26_1] = v23_1 * v21_1 - v25_1 * v22;
                v9_1[v28] = v25_1 * v21_1 + v23_1 * v22;
            }

            v14_1 = v5 - 1;
            int v0 = hj.ar(v14_1, 0x812FB693);
            int v31 = v13;
            v13 = 0;
            while(true) {
                v32 = v12;
                if(v13 >= v0 - 3) {
                    break;
                }

                v12 = v5 >> v13 + 2;
                v21 = 8 << v13;
                int v33 = v0;
                v34 = v7;
                v0 = 0;
                while(v0 < 2 << v13) {
                    v7 = v5 - v12 * 2 * v0;
                    v22_1 = v5 - (v0 * 2 + 1) * v12;
                    int v35 = v12;
                    v12 = 0;
                    while(true) {
                        v36 = v11;
                        if(v12 >= v5 >> v13 + 4) {
                            break;
                        }

                        v11 = v12 * 4;
                        v23 = v7 - 1 - v11;
                        v24_1 = v9_1[v23];
                        v25 = v7 - 3 - v11;
                        v26 = v9_1[v25];
                        int v27_1 = v22_1 - 1 - v11;
                        float v28_1 = v9_1[v27_1];
                        int v29_1 = v22_1 - 3 - v11;
                        v11_1 = v9_1[v29_1];
                        v9_1[v23] = v24_1 + v28_1;
                        v9_1[v25] = v26 + v11_1;
                        v23 = v12 * v21;
                        v25_1 = v3[v23];
                        v23_1 = v3[v23 + 1];
                        v24_1 -= v28_1;
                        v26 -= v11_1;
                        v9_1[v27_1] = v24_1 * v25_1 - v26 * v23_1;
                        v9_1[v29_1] = v26 * v25_1 + v24_1 * v23_1;
                        ++v12;
                        v11 = v36;
                    }

                    ++v0;
                    v12 = v35;
                    v11 = v36;
                }

                ++v13;
                v12 = v32;
                v0 = v33;
                v7 = v34;
            }

            v34 = v7;
            v36 = v11;
            for(v0 = 1; v0 < v2 - 1; ++v0) {
                v3_1 = v4_1[v0];
                if(v0 < v3_1) {
                    v7 = v0 * 8;
                    v3_1 *= 8;
                    v11 = v7 + 1;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 1;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v11 = v7 + 3;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 3;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v11 = v7 + 5;
                    v12_1 = v9_1[v11];
                    v13 = v3_1 + 5;
                    v9_1[v11] = v9_1[v13];
                    v9_1[v13] = v12_1;
                    v7 += 7;
                    v11_1 = v9_1[v7];
                    v3_1 += 7;
                    v9_1[v7] = v9_1[v3_1];
                    v9_1[v3_1] = v11_1;
                }
            }

            for(v0 = 0; v0 < v8; ++v0) {
                v9_1[v0] = v9_1[v0 * 2 + 1];
            }

            for(v0 = 0; v0 < v2; ++v0) {
                v3_1 = v0 * 2;
                v7 = v0 * 4;
                v9_1[v14_1 - v3_1] = v9_1[v7];
                v9_1[v5 - 2 - v3_1] = v9_1[v7 + 1];
                int v4_2 = v5 - v1;
                v9_1[v4_2 - 1 - v3_1] = v9_1[v7 + 2];
                v9_1[v4_2 - 2 - v3_1] = v9_1[v7 + 3];
            }

            v0 = 0;
            while(v0 < v2) {
                v3_1 = v0 * 2;
                float v4_3 = v18[v3_1];
                float v7_1 = v18[v3_1 + 1];
                v11 = v8 + v3_1;
                v12_1 = v9_1[v11];
                v13 = v11 + 1;
                int v37 = v2;
                float v2_1 = v9_1[v13];
                v21 = v5 - 2 - v3_1;
                v22 = v9_1[v21];
                v3_1 = v14_1 - v3_1;
                v23_1 = v9_1[v3_1];
                v24_1 = v12_1 - v22;
                v26 = v2_1 + v23_1;
                v25_1 = v7_1 * v24_1 + v4_3 * v26;
                v12_1 += v22;
                v9_1[v11] = (v12_1 + v25_1) * v17;
                v9_1[v21] = (v12_1 - v25_1) * v17;
                v7_1 = v7_1 * v26 - v4_3 * v24_1;
                v9_1[v13] = (v2_1 - v23_1 + v7_1) * v17;
                v9_1[v3_1] = (-v2_1 + v23_1 + v7_1) * v17;
                ++v0;
                v2 = v37;
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v2 = v0 * 2;
                v3_1 = v2 + v8;
                v7 = v2 + 1;
                v11 = v7 + v8;
                v9_1[v0] = v9_1[v3_1] * v15_1[v2] + v9_1[v11] * v15_1[v7];
                v9_1[v8 - 1 - v0] = v9_1[v3_1] * v15_1[v7] - v9_1[v11] * v15_1[v2];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v5 - v1 + v0] = -v9_1[v0];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v0] = v9_1[v1 + v0];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v1 + v0] = -v9_1[v1 - v0 - 1];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                v9_1[v8 + v0] = v9_1[v5 - v0 - 1];
            }

            v0 = v10;
            while(true) {
                v1_2 = 3.141593;
                v11_2 = 0.5;
                if(v0 >= v6) {
                    break;
                }

                v11_2 = ((double)(((float)Math.sin(((((double)(v0 - v10))) + v11_2) / (((double)v36)) * v11_2 * v1_2))));
                gf.ao[v0] *= ((float)Math.sin(1.570796 * v11_2 * v11_2));
                ++v0;
                v36 = v36;
            }

            v0 = v32;
            v7 = v34;
            while(true) {
                if(v0 >= v7) {
                    goto label_513;
                }

                v1_2 = ((double)(((float)Math.sin(((((double)(v0 - v32))) + v11_2) / (((double)v31)) * v11_2 * v1_2 + 1.570796))));
                gf.ao[v0] *= ((float)Math.sin(v1_2 * 1.570796 * v1_2));
                ++v0;
                v1_2 = 3.141593;
            }

        label_100:
            while(v1 < v5) {
                gf.ao[v1] = 0f;
                ++v1;
            }

            v20 = v14;
        }

    label_513:
        float[] v0_1 = null;
        gf v1_3 = this;
        if(v1_3.at > 0) {
            v0_1 = new float[v1_3.at + v5 >> 2];
            if(!v1_3.aw) {
                for(v2 = 0; v2 < v1_3.ay; ++v2) {
                    v0_1[v2] += v1_3.ah[(v1_3.at >> 1) + v2];
                }
            }

            if(v20) {
                goto label_550;
            }

            while(v10 < v8) {
                v2 = v0_1.length - v8 + v10;
                v0_1[v2] += gf.ao[v10];
                ++v10;
            }
        }

    label_550:
        float[] v2_2 = v1_3.ah;
        v1_3.ah = gf.ao;
        gf.ao = v2_2;
        v1_3.at = v5;
        v1_3.ay = v7 - v8;
        v1_3.aw = v20;
        return v0_1;
    }

    static void al(byte[] arg0, int arg1) {
        gf.aj = arg0;
        gf.ad = arg1;
        gf.aq = 0;
    }

    static void am(byte[] arg0, int arg1) {
        gf.aj = arg0;
        gf.ad = arg1;
        gf.aq = 0;
    }

    void an(byte[] arg7) {
        lq v0 = new lq(arg7);
        this.al = v0.ac(14);
        this.ae = v0.ac(87);
        this.ar = v0.ac(72);
        this.an = v0.ac(37);
        if(this.an < 0) {
            this.an = ~this.an;
            this.ap = true;
        }

        int v7 = v0.ac(25);
        this.ax = new byte[v7][];
        int v2;
        for(v2 = 0; v2 < v7; ++v2) {
            int v3 = 0;
            do {
                int v4 = v0.ay(-51);
                v3 += v4;
            }
            while(v4 >= 0xFF);

            byte[] v4_1 = new byte[v3];
            v0.bw(v4_1, 0, v3, 0xE4FA6DA1);
            this.ax[v2] = v4_1;
        }
    }

    static void ao(byte[] arg17) {
        int v3;
        int v12;
        double v10;
        int v5;
        int v2;
        gf.al(arg17, 0);
        gf.ab = 1 << gf.ar(4);
        gf.af = 1 << gf.ar(4);
        gf.ao = new float[gf.af];
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = 2;
            if(v1 >= v2) {
                break;
            }

            int v4 = v1 != 0 ? gf.af : gf.ab;
            v5 = v4 >> 1;
            int v6 = v4 >> 2;
            int v7 = v4 >> 3;
            float[] v8 = new float[v5];
            int v9;
            for(v9 = 0; true; ++v9) {
                v10 = 3.141593;
                if(v9 >= v6) {
                    break;
                }

                v12 = v9 * 2;
                double v13 = (((double)(v9 * 4))) * v10 / (((double)v4));
                v8[v12] = ((float)Math.cos(v13));
                v8[v12 + 1] = -(((float)Math.sin(v13)));
            }

            float[] v5_1 = new float[v5];
            v9 = 0;
            while(v9 < v6) {
                v12 = v9 * 2;
                int v13_1 = v12 + 1;
                double v14 = (((double)v13_1)) * v10 / (((double)(v4 * 2)));
                v5_1[v12] = ((float)Math.cos(v14));
                v5_1[v13_1] = ((float)Math.sin(v14));
                ++v9;
                v4 = v4;
            }

            int v16 = v4;
            float[] v0 = new float[v6];
            v3 = 0;
            while(v3 < v7) {
                v4 = v3 * 2;
                double v12_1 = (((double)(v3 * 4 + v2))) * v10 / (((double)v16));
                v0[v4] = ((float)Math.cos(v12_1));
                v0[v4 + 1] = -(((float)Math.sin(v12_1)));
                ++v3;
                v16 = v16;
            }

            int[] v2_1 = new int[v7];
            v3 = hj.ar(v7 - 1, 0x1D011978);
            for(v4 = 0; v4 < v7; ++v4) {
                v2_1[v4] = cc.an(v4, v3, 0x842EBE02);
            }

            if(v1 != 0) {
                gf.bd = v8;
                gf.ba = v5_1;
                gf.bf = v0;
                gf.bp = v2_1;
            }
            else {
                gf.as = v8;
                gf.ak = v5_1;
                gf.ac = v0;
                gf.bn = v2_1;
            }
        }

        int v0_1 = 8;
        v1 = gf.ar(v0_1) + 1;
        gf.ai = new gh[v1];
        for(v2 = 0; v2 < v1; ++v2) {
            gf.ai[v2] = new gh();
        }

        v1 = 6;
        v2 = gf.ar(v1) + 1;
        for(v4 = 0; true; ++v4) {
            v5 = 16;
            if(v4 >= v2) {
                break;
            }

            gf.ar(v5);
        }

        v2 = gf.ar(v1) + 1;
        gf.av = new ge[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.av[v3] = new ge();
        }

        v2 = gf.ar(v1) + 1;
        gf.aa = new hd[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.aa[v3] = new hd();
        }

        v2 = gf.ar(v1) + 1;
        gf.au = new go[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.au[v3] = new go();
        }

        v1 = gf.ar(v1) + 1;
        gf.am = new boolean[v1];
        gf.az = new int[v1];
        for(v3 = 0; v3 < v1; ++v3) {
            boolean[] v4_1 = gf.am;
            boolean v6_1 = gf.ae() != 0 ? true : false;
            v4_1[v3] = v6_1;
            gf.ar(v5);
            gf.ar(v5);
            gf.az[v3] = gf.ar(v0_1);
        }
    }

    static void ap(byte[] arg17) {
        int v3;
        int v12;
        double v10;
        int v5;
        int v2;
        gf.al(arg17, 0);
        gf.ab = 1 << gf.ar(4);
        gf.af = 1 << gf.ar(4);
        gf.ao = new float[gf.af];
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = 2;
            if(v1 >= v2) {
                break;
            }

            int v4 = v1 != 0 ? gf.af : gf.ab;
            v5 = v4 >> 1;
            int v6 = v4 >> 2;
            int v7 = v4 >> 3;
            float[] v8 = new float[v5];
            int v9;
            for(v9 = 0; true; ++v9) {
                v10 = 3.141593;
                if(v9 >= v6) {
                    break;
                }

                v12 = v9 * 2;
                double v13 = (((double)(v9 * 4))) * v10 / (((double)v4));
                v8[v12] = ((float)Math.cos(v13));
                v8[v12 + 1] = -(((float)Math.sin(v13)));
            }

            float[] v5_1 = new float[v5];
            v9 = 0;
            while(v9 < v6) {
                v12 = v9 * 2;
                int v13_1 = v12 + 1;
                double v14 = (((double)v13_1)) * v10 / (((double)(v4 * 2)));
                v5_1[v12] = ((float)Math.cos(v14));
                v5_1[v13_1] = ((float)Math.sin(v14));
                ++v9;
                v4 = v4;
            }

            int v16 = v4;
            float[] v0 = new float[v6];
            v3 = 0;
            while(v3 < v7) {
                v4 = v3 * 2;
                double v12_1 = (((double)(v3 * 4 + v2))) * v10 / (((double)v16));
                v0[v4] = ((float)Math.cos(v12_1));
                v0[v4 + 1] = -(((float)Math.sin(v12_1)));
                ++v3;
                v16 = v16;
            }

            int[] v2_1 = new int[v7];
            v3 = hj.ar(v7 - 1, 0x54C7D507);
            for(v4 = 0; v4 < v7; ++v4) {
                v2_1[v4] = cc.an(v4, v3, 0x9AD32D0C);
            }

            if(v1 != 0) {
                gf.bd = v8;
                gf.ba = v5_1;
                gf.bf = v0;
                gf.bp = v2_1;
            }
            else {
                gf.as = v8;
                gf.ak = v5_1;
                gf.ac = v0;
                gf.bn = v2_1;
            }
        }

        int v0_1 = 8;
        v1 = gf.ar(v0_1) + 1;
        gf.ai = new gh[v1];
        for(v2 = 0; v2 < v1; ++v2) {
            gf.ai[v2] = new gh();
        }

        v1 = 6;
        v2 = gf.ar(v1) + 1;
        for(v4 = 0; true; ++v4) {
            v5 = 16;
            if(v4 >= v2) {
                break;
            }

            gf.ar(v5);
        }

        v2 = gf.ar(v1) + 1;
        gf.av = new ge[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.av[v3] = new ge();
        }

        v2 = gf.ar(v1) + 1;
        gf.aa = new hd[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.aa[v3] = new hd();
        }

        v2 = gf.ar(v1) + 1;
        gf.au = new go[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.au[v3] = new go();
        }

        v1 = gf.ar(v1) + 1;
        gf.am = new boolean[v1];
        gf.az = new int[v1];
        for(v2 = 0; v2 < v1; ++v2) {
            boolean[] v3_1 = gf.am;
            boolean v4_1 = gf.ae() != 0 ? true : false;
            v3_1[v2] = v4_1;
            gf.ar(v5);
            gf.ar(v5);
            gf.az[v2] = gf.ar(v0_1);
        }
    }

    static gf aq(ko arg2, int arg3, int arg4) {
        gf v1 = null;
        if(!gf.ad(arg2)) {
            arg2.an(arg3, arg4, 0x3B054F60);
            return v1;
        }

        byte[] v2 = arg2.ae(arg3, arg4, 0x78DC0DC9);
        if(v2 == null) {
            return v1;
        }

        return new gf(v2);
    }

    static int ar(int arg8) {
        int v1 = 0;
        int v2 = 0;
        while(arg8 >= 8 - gf.aq) {
            int v3 = 8 - gf.aq;
            v1 += ((1 << v3) - 1 & gf.aj[gf.ad] >> gf.aq) << v2;
            gf.aq = 0;
            ++gf.ad;
            v2 += v3;
            arg8 -= v3;
        }

        if(arg8 > 0) {
            v1 += ((1 << arg8) - 1 & gf.aj[gf.ad] >> gf.aq) << v2;
            gf.aq += arg8;
        }

        return v1;
    }

    static void as(byte[] arg17) {
        int v3;
        int v12;
        double v10;
        int v5;
        int v2;
        gf.al(arg17, 0);
        gf.ab = 1 << gf.ar(4);
        gf.af = 1 << gf.ar(4);
        gf.ao = new float[gf.af];
        int v1;
        for(v1 = 0; true; ++v1) {
            v2 = 2;
            if(v1 >= v2) {
                break;
            }

            int v4 = v1 != 0 ? gf.af : gf.ab;
            v5 = v4 >> 1;
            int v6 = v4 >> 2;
            int v7 = v4 >> 3;
            float[] v8 = new float[v5];
            int v9;
            for(v9 = 0; true; ++v9) {
                v10 = 3.141593;
                if(v9 >= v6) {
                    break;
                }

                v12 = v9 * 2;
                double v13 = (((double)(v9 * 4))) * v10 / (((double)v4));
                v8[v12] = ((float)Math.cos(v13));
                v8[v12 + 1] = -(((float)Math.sin(v13)));
            }

            float[] v5_1 = new float[v5];
            v9 = 0;
            while(v9 < v6) {
                v12 = v9 * 2;
                int v13_1 = v12 + 1;
                double v14 = (((double)v13_1)) * v10 / (((double)(v4 * 2)));
                v5_1[v12] = ((float)Math.cos(v14));
                v5_1[v13_1] = ((float)Math.sin(v14));
                ++v9;
                v4 = v4;
            }

            int v16 = v4;
            float[] v0 = new float[v6];
            v3 = 0;
            while(v3 < v7) {
                v4 = v3 * 2;
                double v12_1 = (((double)(v3 * 4 + v2))) * v10 / (((double)v16));
                v0[v4] = ((float)Math.cos(v12_1));
                v0[v4 + 1] = -(((float)Math.sin(v12_1)));
                ++v3;
                v16 = v16;
            }

            int[] v2_1 = new int[v7];
            v3 = hj.ar(v7 - 1, 0xCE3C8FF5);
            for(v4 = 0; v4 < v7; ++v4) {
                v2_1[v4] = cc.an(v4, v3, -556449403);
            }

            if(v1 != 0) {
                gf.bd = v8;
                gf.ba = v5_1;
                gf.bf = v0;
                gf.bp = v2_1;
            }
            else {
                gf.as = v8;
                gf.ak = v5_1;
                gf.ac = v0;
                gf.bn = v2_1;
            }
        }

        int v0_1 = 8;
        v1 = gf.ar(v0_1) + 1;
        gf.ai = new gh[v1];
        for(v2 = 0; v2 < v1; ++v2) {
            gf.ai[v2] = new gh();
        }

        v1 = 6;
        v2 = gf.ar(v1) + 1;
        for(v4 = 0; true; ++v4) {
            v5 = 16;
            if(v4 >= v2) {
                break;
            }

            gf.ar(v5);
        }

        v2 = gf.ar(v1) + 1;
        gf.av = new ge[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.av[v3] = new ge();
        }

        v2 = gf.ar(v1) + 1;
        gf.aa = new hd[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.aa[v3] = new hd();
        }

        v2 = gf.ar(v1) + 1;
        gf.au = new go[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.au[v3] = new go();
        }

        v1 = gf.ar(v1) + 1;
        gf.am = new boolean[v1];
        gf.az = new int[v1];
        for(v3 = 0; v3 < v1; ++v3) {
            boolean[] v4_1 = gf.am;
            boolean v6_1 = gf.ae() != 0 ? true : false;
            v4_1[v3] = v6_1;
            gf.ar(v5);
            gf.ar(v5);
            gf.az[v3] = gf.ar(v0_1);
        }
    }

    static int at(int arg8) {
        int v1 = 0;
        int v2 = 0;
        while(arg8 >= 8 - gf.aq) {
            int v3 = 8 - gf.aq;
            v1 += ((1 << v3) - 1 & gf.aj[gf.ad] >> gf.aq) << v2;
            gf.aq = 0;
            ++gf.ad;
            v2 += v3;
            arg8 -= v3;
        }

        if(arg8 > 0) {
            v1 += ((1 << arg8) - 1 & gf.aj[gf.ad] >> gf.aq) << v2;
            gf.aq += arg8;
        }

        return v1;
    }

    static void au(byte[] arg0, int arg1) {
        gf.aj = arg0;
        gf.ad = arg1;
        gf.aq = 0;
    }

    static float av(int arg6) {
        int v0 = 0x1FFFFF & arg6;
        int v1 = 0x80000000 & arg6;
        arg6 = (arg6 & 0x53A22DF4) >> 21;
        if(v1 != 0) {
            v0 = -v0;
        }

        return ((float)((((double)v0)) * Math.pow(2, ((double)(arg6 + 1220251244)))));
    }

    static void aw(byte[] arg17) {
        int v12;
        double v10;
        int v5;
        int v2;
        gf.al(arg17, 0);
        int v3 = 1;
        gf.ab = 1 << gf.ar(4);
        gf.af = 1 << gf.ar(4);
        gf.ao = new float[gf.af];
        int v1 = 0;
        while(true) {
            v2 = 2;
            if(v1 >= v2) {
                break;
            }

            int v4 = v1 != 0 ? gf.af : gf.ab;
            v5 = v4 >> 1;
            int v6 = v4 >> 2;
            int v7 = v4 >> 3;
            float[] v8 = new float[v5];
            int v9;
            for(v9 = 0; true; ++v9) {
                v10 = 3.141593;
                if(v9 >= v6) {
                    break;
                }

                v12 = v9 * 2;
                double v13 = (((double)(v9 * 4))) * v10 / (((double)v4));
                v8[v12] = ((float)Math.cos(v13));
                v8[v12 + v3] = -(((float)Math.sin(v13)));
            }

            float[] v5_1 = new float[v5];
            v9 = 0;
            while(v9 < v6) {
                v12 = v9 * 2;
                int v13_1 = v12 + 1;
                double v14 = (((double)v13_1)) * v10 / (((double)(v4 * 2)));
                v5_1[v12] = ((float)Math.cos(v14));
                v5_1[v13_1] = ((float)Math.sin(v14));
                ++v9;
                v4 = v4;
            }

            int v16 = v4;
            float[] v0 = new float[v6];
            v3 = 0;
            while(v3 < v7) {
                v4 = v3 * 2;
                double v12_1 = (((double)(v3 * 4 + v2))) * v10 / (((double)v16));
                v0[v4] = ((float)Math.cos(v12_1));
                v0[v4 + 1] = -(((float)Math.sin(v12_1)));
                ++v3;
                v16 = v16;
            }

            int[] v2_1 = new int[v7];
            v3 = hj.ar(v7 - 1, -866891705);
            for(v4 = 0; v4 < v7; ++v4) {
                v2_1[v4] = cc.an(v4, v3, -1301807719);
            }

            if(v1 != 0) {
                gf.bd = v8;
                gf.ba = v5_1;
                gf.bf = v0;
                gf.bp = v2_1;
            }
            else {
                gf.as = v8;
                gf.ak = v5_1;
                gf.ac = v0;
                gf.bn = v2_1;
            }

            ++v1;
            v3 = 1;
        }

        int v0_1 = 8;
        v1 = gf.ar(v0_1) + 1;
        gf.ai = new gh[v1];
        for(v2 = 0; v2 < v1; ++v2) {
            gf.ai[v2] = new gh();
        }

        v1 = 6;
        v2 = gf.ar(v1) + 1;
        for(v4 = 0; true; ++v4) {
            v5 = 16;
            if(v4 >= v2) {
                break;
            }

            gf.ar(v5);
        }

        v2 = gf.ar(v1) + 1;
        gf.av = new ge[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.av[v3] = new ge();
        }

        v2 = gf.ar(v1) + 1;
        gf.aa = new hd[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.aa[v3] = new hd();
        }

        v2 = gf.ar(v1) + 1;
        gf.au = new go[v2];
        for(v3 = 0; v3 < v2; ++v3) {
            gf.au[v3] = new go();
        }

        v1 = gf.ar(v1) + 1;
        gf.am = new boolean[v1];
        gf.az = new int[v1];
        for(v3 = 0; v3 < v1; ++v3) {
            boolean[] v4_1 = gf.am;
            boolean v6_1 = gf.ae() != 0 ? true : false;
            v4_1[v3] = v6_1;
            gf.ar(v5);
            gf.ar(v5);
            gf.az[v3] = gf.ar(v0_1);
        }
    }

    static float ax(int arg6) {
        int v0 = 0x1FFFFF & arg6;
        int v1 = 0x80000000 & arg6;
        arg6 = (arg6 & 0x7FE00000) >> 21;
        if(v1 != 0) {
            v0 = -v0;
        }

        return ((float)((((double)v0)) * Math.pow(2, ((double)(arg6 - 788)))));
    }

    void ay(byte[] arg7) {
        lq v0 = new lq(arg7);
        this.al = v0.ac(80);
        this.ae = v0.ac(25);
        this.ar = v0.ac(85);
        this.an = v0.ac(74);
        if(this.an < 0) {
            this.an = ~this.an;
            this.ap = true;
        }

        int v7 = v0.ac(8);
        this.ax = new byte[v7][];
        int v2;
        for(v2 = 0; v2 < v7; ++v2) {
            int v3 = 0;
            do {
                int v4 = v0.ay(-82);
                v3 += v4;
            }
            while(v4 >= 0xFF);

            byte[] v4_1 = new byte[v3];
            v0.bw(v4_1, 0, v3, -328034537);
            this.ax[v2] = v4_1;
        }
    }

    static void az(byte[] arg0, int arg1) {
        gf.aj = arg0;
        gf.ad = arg1;
        gf.aq = 0;
    }

    static gf ba(ko arg2, int arg3, int arg4) {
        gf v1 = null;
        if(!gf.ad(arg2)) {
            arg2.an(arg3, arg4, -580473450);
            return v1;
        }

        byte[] v2 = arg2.ae(arg3, arg4, 0x78DC0DC9);
        if(v2 == null) {
            return v1;
        }

        return new gf(v2);
    }

    static boolean bd(ko arg3) {
        if(!gf.ag) {
            byte[] v3 = arg3.ae(0, 0, 0x78DC0DC9);
            if(v3 == null) {
                return 0;
            }
            else {
                gf.ap(v3);
                gf.ag = true;
            }
        }

        return 1;
    }

    static gf bf(ko arg2, int arg3, int arg4) {
        gf v1 = null;
        if(!gf.ad(arg2)) {
            arg2.an(arg3, arg4, 0xA0BA9D17);
            return v1;
        }

        byte[] v2 = arg2.ae(arg3, arg4, 0x78DC0DC9);
        if(v2 == null) {
            return v1;
        }

        return new gf(v2);
    }
}

