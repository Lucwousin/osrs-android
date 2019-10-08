public class hi {
    static final float ab = 100f;
    static float ad = 0f;
    int[][][] ae;
    static final float af = 8f;
    static final float ai = 32.703197f;
    static int[][] aj = null;
    static final int al = 4;
    int[] an;
    static float[][] ap;
    static int aq;
    int[][][] ar;
    int[] ax;

    static {
        hi.ap = new float[2][8];
        hi.aj = new int[2][8];
    }

    hi() {
        super();
        this.ax = new int[2];
        this.ae = new int[2][2][4];
        this.ar = new int[2][2][4];
        this.an = new int[2];
    }

    final void aa(lq arg9, hm arg10) {
        int v0 = arg9.ay(-5);
        this.ax[0] = v0 >> 4;
        this.ax[1] = v0 & 15;
        if(v0 != 0) {
            this.an[0] = arg9.ao(0xA2B881CF);
            this.an[1] = arg9.ao(0x45089A85);
            v0 = arg9.ay(-123);
            int v1;
            for(v1 = 0; true; ++v1) {
                int v2 = 2;
                if(v1 >= v2) {
                    break;
                }

                for(v2 = 0; v2 < this.ax[v1]; ++v2) {
                    this.ae[v1][0][v2] = arg9.ao(1380082073);
                    this.ar[v1][0][v2] = arg9.ao(1983532702);
                }
            }

            for(v1 = 0; v1 < v2; ++v1) {
                int v5;
                for(v5 = 0; v5 < this.ax[v1]; ++v5) {
                    if((1 << v1 * 4 << v5 & v0) != 0) {
                        this.ae[v1][1][v5] = arg9.ao(608199140);
                        this.ar[v1][1][v5] = arg9.ao(0x6A9DBAEB);
                    }
                    else {
                        this.ae[v1][1][v5] = this.ae[v1][0][v5];
                        this.ar[v1][1][v5] = this.ar[v1][0][v5];
                    }
                }
            }

            if(v0 == 0 && this.an[1] == this.an[0]) {
                return;
            }

            arg10.al(arg9);
        }
        else {
            int[] v9 = this.an;
            this.an[1] = 0;
            v9[0] = 0;
        }
    }

    static float ab(float arg4) {
        return (((float)Math.pow(2, ((double)arg4)))) * 32.703197f * 3.141593f / 11025f;
    }

    static float ad(float arg4) {
        return (((float)Math.pow(2, ((double)arg4)))) * 32.703197f * 3.141593f / 11025f;
    }

    float ae(int arg5, int arg6, float arg7) {
        return hi.al(((((float)this.ae[arg5][0][arg6])) + arg7 * (((float)(this.ae[arg5][1][arg6] - this.ae[arg5][0][arg6])))) * 0.000122f);
    }

    float af(int arg5, int arg6, float arg7) {
        return hi.al(((((float)this.ae[arg5][0][arg6])) + arg7 * (((float)(this.ae[arg5][1][arg6] - this.ae[arg5][0][arg6])))) * 0.000122f);
    }

    float ai(int arg5, int arg6, float arg7) {
        return hi.al(((((float)this.ae[arg5][0][arg6])) + arg7 * (((float)(this.ae[arg5][1][arg6] - this.ae[arg5][0][arg6])))) * 0.000122f);
    }

    static float aj(float arg4) {
        return (((float)Math.pow(2, ((double)arg4)))) * 32.703197f * 3.141593f / 11025f;
    }

    static float al(float arg4) {
        return (((float)Math.pow(2, ((double)arg4)))) * 32.703197f * 3.141593f / 11025f;
    }

    final void am(lq arg9, hm arg10) {
        int v0 = arg9.ay(-95);
        this.ax[0] = v0 >> 4;
        this.ax[1] = v0 & 15;
        if(v0 != 0) {
            this.an[0] = arg9.ao(0xD122B805);
            this.an[1] = arg9.ao(-1718111026);
            v0 = arg9.ay(-37);
            int v1;
            for(v1 = 0; true; ++v1) {
                int v2 = 2;
                if(v1 >= v2) {
                    break;
                }

                for(v2 = 0; v2 < this.ax[v1]; ++v2) {
                    this.ae[v1][0][v2] = arg9.ao(-2030673380);
                    this.ar[v1][0][v2] = arg9.ao(410189106);
                }
            }

            for(v1 = 0; v1 < v2; ++v1) {
                int v5;
                for(v5 = 0; v5 < this.ax[v1]; ++v5) {
                    if((1 << v1 * 4 << v5 & v0) != 0) {
                        this.ae[v1][1][v5] = arg9.ao(100356516);
                        this.ar[v1][1][v5] = arg9.ao(-1724040096);
                    }
                    else {
                        this.ae[v1][1][v5] = this.ae[v1][0][v5];
                        this.ar[v1][1][v5] = this.ar[v1][0][v5];
                    }
                }
            }

            if(v0 == 0 && this.an[1] == this.an[0]) {
                return;
            }

            arg10.al(arg9);
        }
        else {
            int[] v9 = this.an;
            this.an[1] = 0;
            v9[0] = 0;
        }
    }

    final void an(lq arg9, hm arg10) {
        int v0 = arg9.ay(-112);
        this.ax[0] = v0 >> 4;
        this.ax[1] = v0 & 15;
        if(v0 != 0) {
            this.an[0] = arg9.ao(0x91EBB5B1);
            this.an[1] = arg9.ao(0x53073D63);
            v0 = arg9.ay(-22);
            int v1;
            for(v1 = 0; true; ++v1) {
                int v2 = 2;
                if(v1 >= v2) {
                    break;
                }

                for(v2 = 0; v2 < this.ax[v1]; ++v2) {
                    this.ae[v1][0][v2] = arg9.ao(0xDC5EF768);
                    this.ar[v1][0][v2] = arg9.ao(0x1A0BFEE);
                }
            }

            for(v1 = 0; v1 < v2; ++v1) {
                int v5;
                for(v5 = 0; v5 < this.ax[v1]; ++v5) {
                    if((1 << v1 * 4 << v5 & v0) != 0) {
                        this.ae[v1][1][v5] = arg9.ao(0xC37AF06F);
                        this.ar[v1][1][v5] = arg9.ao(-701312684);
                    }
                    else {
                        this.ae[v1][1][v5] = this.ae[v1][0][v5];
                        this.ar[v1][1][v5] = this.ar[v1][0][v5];
                    }
                }
            }

            if(v0 == 0 && this.an[1] == this.an[0]) {
                return;
            }

            arg10.al(arg9);
        }
        else {
            int[] v9 = this.an;
            this.an[1] = 0;
            v9[0] = 0;
        }
    }

    float ap(int arg5, int arg6, float arg7) {
        return 1f - (((float)Math.pow(10, ((double)(-(((((float)this.ar[arg5][0][arg6])) + arg7 * (((float)(this.ar[arg5][1][arg6] - this.ar[arg5][0][arg6])))) * 0.001526f) / 20f)))));
    }

    static float aq(float arg4) {
        return (((float)Math.pow(2, ((double)arg4)))) * 32.703197f * 3.141593f / 11025f;
    }

    int ar(int arg18, float arg19) {
        hi v0 = this;
        int v1 = arg18;
        float v2 = arg19;
        float v3 = 65536f;
        int v5 = 0;
        if(v1 == 0) {
            hi.ad = ((float)Math.pow(0.1, ((double)(((((float)v0.an[0])) + (((float)(v0.an[1] - v0.an[0]))) * v2) * 0.003052f / 20f))));
            hi.aq = ((int)(hi.ad * v3));
        }

        if(v0.ax[v1] == 0) {
            return 0;
        }

        float v6 = v0.ax(v1, 0, v2);
        float v8 = -2f;
        hi.ap[v1][0] = v6 * v8 * (((float)Math.cos(((double)v0.ae(v1, 0, v2)))));
        hi.ap[v1][1] = v6 * v6;
        int v6_1;
        for(v6_1 = 1; true; ++v6_1) {
            int v9 = 2;
            if(v6_1 >= v0.ax[v1]) {
                break;
            }

            float v7 = v0.ax(v1, v6_1, v2);
            float v10 = v7 * v8 * (((float)Math.cos(((double)v0.ae(v1, v6_1, v2)))));
            v7 *= v7;
            int v12 = v6_1 * 2;
            int v15 = v12 - 1;
            hi.ap[v1][v12 + 1] = hi.ap[v1][v15] * v7;
            hi.ap[v1][v12] = hi.ap[v1][v15] * v10 + hi.ap[v1][v12 - 2] * v7;
            while(v15 >= v9) {
                hi.ap[v1][v15] += hi.ap[v1][v15 - 1] * v10 + hi.ap[v1][v15 - 2] * v7;
                --v15;
            }

            hi.ap[v1][1] += hi.ap[v1][0] * v10 + v7;
            hi.ap[v1][0] += v10;
        }

        if(v1 == 0) {
            int v2_1;
            for(v2_1 = 0; v2_1 < v0.ax[0] * 2; ++v2_1) {
                hi.ap[0][v2_1] *= hi.ad;
            }
        }

        while(v5 < v0.ax[v1] * 2) {
            hi.aj[v1][v5] = ((int)(hi.ap[v1][v5] * v3));
            ++v5;
        }

        return v0.ax[v1] * 2;
    }

    final void au(lq arg9, hm arg10) {
        int v0 = arg9.ay(-76);
        this.ax[0] = v0 >> 4;
        this.ax[1] = v0 & 15;
        if(v0 != 0) {
            this.an[0] = arg9.ao(0xC75BD131);
            this.an[1] = arg9.ao(0xAFEC2D6E);
            v0 = arg9.ay(-79);
            int v1;
            for(v1 = 0; true; ++v1) {
                int v2 = 2;
                if(v1 >= v2) {
                    break;
                }

                for(v2 = 0; v2 < this.ax[v1]; ++v2) {
                    this.ae[v1][0][v2] = arg9.ao(0xB2CAEF02);
                    this.ar[v1][0][v2] = arg9.ao(-144698060);
                }
            }

            for(v1 = 0; v1 < v2; ++v1) {
                int v5;
                for(v5 = 0; v5 < this.ax[v1]; ++v5) {
                    if((1 << v1 * 4 << v5 & v0) != 0) {
                        this.ae[v1][1][v5] = arg9.ao(0x9188940B);
                        this.ar[v1][1][v5] = arg9.ao(0x664662C6);
                    }
                    else {
                        this.ae[v1][1][v5] = this.ae[v1][0][v5];
                        this.ar[v1][1][v5] = this.ar[v1][0][v5];
                    }
                }
            }

            if(v0 == 0 && this.an[1] == this.an[0]) {
                return;
            }

            arg10.al(arg9);
        }
        else {
            int[] v9 = this.an;
            this.an[1] = 0;
            v9[0] = 0;
        }
    }

    int av(int arg18, float arg19) {
        hi v0 = this;
        int v1 = arg18;
        float v2 = arg19;
        float v3 = 65536f;
        int v5 = 0;
        if(v1 == 0) {
            hi.ad = ((float)Math.pow(0.1, ((double)(((((float)v0.an[0])) + (((float)(v0.an[1] - v0.an[0]))) * v2) * 0.003052f / 20f))));
            hi.aq = ((int)(hi.ad * v3));
        }

        if(v0.ax[v1] == 0) {
            return 0;
        }

        float v6 = v0.ax(v1, 0, v2);
        float v8 = -2f;
        hi.ap[v1][0] = v6 * v8 * (((float)Math.cos(((double)v0.ae(v1, 0, v2)))));
        hi.ap[v1][1] = v6 * v6;
        int v6_1;
        for(v6_1 = 1; true; ++v6_1) {
            int v9 = 2;
            if(v6_1 >= v0.ax[v1]) {
                break;
            }

            float v7 = v0.ax(v1, v6_1, v2);
            float v10 = v7 * v8 * (((float)Math.cos(((double)v0.ae(v1, v6_1, v2)))));
            v7 *= v7;
            int v12 = v6_1 * 2;
            int v15 = v12 - 1;
            hi.ap[v1][v12 + 1] = hi.ap[v1][v15] * v7;
            hi.ap[v1][v12] = hi.ap[v1][v15] * v10 + hi.ap[v1][v12 - 2] * v7;
            while(v15 >= v9) {
                hi.ap[v1][v15] += hi.ap[v1][v15 - 1] * v10 + hi.ap[v1][v15 - 2] * v7;
                --v15;
            }

            hi.ap[v1][1] += hi.ap[v1][0] * v10 + v7;
            hi.ap[v1][0] += v10;
        }

        if(v1 == 0) {
            int v2_1;
            for(v2_1 = 0; v2_1 < v0.ax[0] * 2; ++v2_1) {
                hi.ap[0][v2_1] *= hi.ad;
            }
        }

        while(v5 < v0.ax[v1] * 2) {
            hi.aj[v1][v5] = ((int)(hi.ap[v1][v5] * v3));
            ++v5;
        }

        return v0.ax[v1] * 2;
    }

    float ax(int arg5, int arg6, float arg7) {
        return 1f - (((float)Math.pow(10, ((double)(-(((((float)this.ar[arg5][0][arg6])) + arg7 * (((float)(this.ar[arg5][1][arg6] - this.ar[arg5][0][arg6])))) * 0.001526f) / 20f)))));
    }

    final void az(lq arg9, hm arg10) {
        int v0 = arg9.ay(-118);
        this.ax[0] = v0 >> 4;
        this.ax[1] = v0 & 15;
        if(v0 != 0) {
            this.an[0] = arg9.ao(653058379);
            this.an[1] = arg9.ao(1362510057);
            v0 = arg9.ay(-17);
            int v1;
            for(v1 = 0; true; ++v1) {
                int v2 = 2;
                if(v1 >= v2) {
                    break;
                }

                for(v2 = 0; v2 < this.ax[v1]; ++v2) {
                    this.ae[v1][0][v2] = arg9.ao(0xE6134430);
                    this.ar[v1][0][v2] = arg9.ao(-393041316);
                }
            }

            for(v1 = 0; v1 < v2; ++v1) {
                int v5;
                for(v5 = 0; v5 < this.ax[v1]; ++v5) {
                    if((1 << v1 * 4 << v5 & v0) != 0) {
                        this.ae[v1][1][v5] = arg9.ao(0xB8D0A5F2);
                        this.ar[v1][1][v5] = arg9.ao(0xE9978A7D);
                    }
                    else {
                        this.ae[v1][1][v5] = this.ae[v1][0][v5];
                        this.ar[v1][1][v5] = this.ar[v1][0][v5];
                    }
                }
            }

            if(v0 == 0 && this.an[1] == this.an[0]) {
                return;
            }

            arg10.al(arg9);
        }
        else {
            int[] v9 = this.an;
            this.an[1] = 0;
            v9[0] = 0;
        }
    }
}

