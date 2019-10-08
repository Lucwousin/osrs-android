public class gh {
    int[] ae;
    int al;
    float[][] an;
    int[] ap;
    int[] ar;
    int ax;

    gh() {
        int v4;
        super();
        gf.ar(24);
        this.ax = gf.ar(16);
        this.al = gf.ar(24);
        this.ae = new int[this.al];
        int v0 = gf.ae() != 0 ? 1 : 0;
        int v3 = 5;
        if(v0 != 0) {
            v3 = gf.ar(v3) + 1;
            for(v0 = 0; v0 < this.al; v0 = v5) {
                v4 = gf.ar(hj.ar(this.al - v0, 0x4D66D80F));
                int v5 = v0;
                v0 = 0;
                while(v0 < v4) {
                    this.ae[v5] = v3;
                    ++v0;
                    ++v5;
                }

                ++v3;
            }
        }
        else {
            v0 = gf.ae() != 0 ? 1 : 0;
            for(v4 = 0; v4 < this.al; ++v4) {
                this.ae[v4] = v0 == 0 || gf.ae() != 0 ? gf.ar(v3) + 1 : 0;
            }
        }

        this.al();
        v0 = 4;
        v3 = gf.ar(v0);
        if(v3 > 0) {
            float v5_1 = gf.ax(gf.ar(0x20));
            float v4_1 = gf.ax(gf.ar(0x20));
            v0 = gf.ar(v0) + 1;
            int v6 = gf.ae() != 0 ? 1 : 0;
            int v7 = v3 == 1 ? gh.ax(this.al, this.ax) : this.al * this.ax;
            this.ar = new int[v7];
            int v8;
            for(v8 = 0; v8 < v7; ++v8) {
                this.ar[v8] = gf.ar(v0);
            }

            this.an = new float[this.al][this.ax];
            if(v3 == 1) {
                v3 = 0;
                goto label_105;
            }

            int v2;
            for(v2 = 0; true; ++v2) {
                if(v2 >= this.al) {
                    return;
                }

                v7 = this.ax * v2;
                v3 = 0;
                float v8_1 = 0f;
                while(v3 < this.ax) {
                    float v9 = (((float)this.ar[v7])) * v4_1 + v5_1 + v8_1;
                    this.an[v2][v3] = v9;
                    if(v6 != 0) {
                        v8_1 = v9;
                    }

                    ++v7;
                    ++v3;
                }
            }

        label_105:
            while(v3 < this.al) {
                v8 = 0;
                int v9_1 = 1;
                float v10 = 0f;
                while(v8 < this.ax) {
                    float v11 = (((float)this.ar[v3 / v9_1 % v7])) * v4_1 + v5_1 + v10;
                    this.an[v3][v8] = v11;
                    if(v6 != 0) {
                        v10 = v11;
                    }

                    v9_1 *= v7;
                    ++v8;
                }

                ++v3;
            }
        }
    }

    float[] aa() {
        return this.an[this.ae()];
    }

    int ab() {
        int v0;
        for(v0 = 0; this.ap[v0] >= 0; ++v0) {
            if(gf.ae() != 0) {
                v0 = this.ap[v0];
                continue;
            }
        }

        return ~this.ap[v0];
    }

    void ad() {
        int v9;
        int v6;
        int v5;
        int v4;
        int[] v0 = new int[this.al];
        int[] v1 = new int[33];
        int v3;
        for(v3 = 0; v3 < this.al; ++v3) {
            v4 = this.ae[v3];
            if(v4 == 0) {
            }
            else {
                v5 = 0x20;
                v6 = 1 << 0x20 - v4;
                int v8 = v1[v4];
                v0[v3] = v8;
                if((v8 & v6) != 0) {
                    v6 = v1[v4 - 1];
                }
                else {
                    v6 |= v8;
                    v9 = v4 - 1;
                    while(v9 >= 1) {
                        int v10 = v1[v9];
                        if(v10 != v8) {
                            break;
                        }

                        int v11 = 1 << 0x20 - v9;
                        if((v10 & v11) != 0) {
                            v1[v9] = v1[v9 - 1];
                        }
                        else {
                            v1[v9] = v10 | v11;
                            --v9;
                            continue;
                        }

                        break;
                    }
                }

                v1[v4] = v6;
                while(true) {
                    ++v4;
                    if(v4 > v5) {
                        break;
                    }

                    if(v1[v4] != v8) {
                        continue;
                    }

                    v1[v4] = v6;
                }
            }
        }

        this.ap = new int[8];
        int v1_1 = 0;
        v3 = 0;
        while(v1_1 < this.al) {
            v4 = this.ae[v1_1];
            if(v4 == 0) {
            }
            else {
                v5 = v0[v1_1];
                v6 = 0;
                int v7 = 0;
                while(v6 < v4) {
                    if((0x80000000 >>> v6 & v5) != 0) {
                        if(this.ap[v7] == 0) {
                            this.ap[v7] = v3;
                        }

                        v7 = this.ap[v7];
                    }
                    else {
                        ++v7;
                    }

                    if(v7 >= this.ap.length) {
                        int[] v8_1 = new int[this.ap.length * 2];
                        for(v9 = 0; v9 < this.ap.length; ++v9) {
                            v8_1[v9] = this.ap[v9];
                        }

                        this.ap = v8_1;
                    }

                    ++v6;
                }

                this.ap[v7] = ~v1_1;
                if(v7 < v3) {
                    goto label_102;
                }

                v3 = v7 + 1;
            }

        label_102:
            ++v1_1;
        }
    }

    int ae() {
        int v0;
        for(v0 = 0; this.ap[v0] >= 0; ++v0) {
            if(gf.ae() != 0) {
                v0 = this.ap[v0];
                continue;
            }
        }

        return ~this.ap[v0];
    }

    int af() {
        int v0;
        for(v0 = 0; this.ap[v0] >= 0; ++v0) {
            if(gf.ae() != 0) {
                v0 = this.ap[v0];
                continue;
            }
        }

        return ~this.ap[v0];
    }

    int ai() {
        int v0;
        for(v0 = 0; this.ap[v0] >= 0; ++v0) {
            if(gf.ae() != 0) {
                v0 = this.ap[v0];
                continue;
            }
        }

        return ~this.ap[v0];
    }

    static int aj(int arg6, int arg7) {
        int v0;
        for(v0 = (((int)Math.pow(((double)arg6), 1 / (((double)arg7))))) + 1; kz.ax(v0, arg7, 73) > arg6; --v0) {
        }

        return v0;
    }

    void al() {
        int v9;
        int v6;
        int v5;
        int v4;
        int[] v0 = new int[this.al];
        int[] v1 = new int[33];
        int v3;
        for(v3 = 0; v3 < this.al; ++v3) {
            v4 = this.ae[v3];
            if(v4 == 0) {
            }
            else {
                v5 = 0x20;
                v6 = 1 << 0x20 - v4;
                int v8 = v1[v4];
                v0[v3] = v8;
                if((v8 & v6) != 0) {
                    v6 = v1[v4 - 1];
                }
                else {
                    v6 |= v8;
                    v9 = v4 - 1;
                    while(v9 >= 1) {
                        int v10 = v1[v9];
                        if(v10 != v8) {
                            break;
                        }

                        int v11 = 1 << 0x20 - v9;
                        if((v10 & v11) != 0) {
                            v1[v9] = v1[v9 - 1];
                        }
                        else {
                            v1[v9] = v10 | v11;
                            --v9;
                            continue;
                        }

                        break;
                    }
                }

                v1[v4] = v6;
                while(true) {
                    ++v4;
                    if(v4 > v5) {
                        break;
                    }

                    if(v1[v4] != v8) {
                        continue;
                    }

                    v1[v4] = v6;
                }
            }
        }

        this.ap = new int[8];
        int v1_1 = 0;
        v3 = 0;
        while(v1_1 < this.al) {
            v4 = this.ae[v1_1];
            if(v4 == 0) {
            }
            else {
                v5 = v0[v1_1];
                v6 = 0;
                int v7 = 0;
                while(v6 < v4) {
                    if((0x80000000 >>> v6 & v5) != 0) {
                        if(this.ap[v7] == 0) {
                            this.ap[v7] = v3;
                        }

                        v7 = this.ap[v7];
                    }
                    else {
                        ++v7;
                    }

                    if(v7 >= this.ap.length) {
                        int[] v8_1 = new int[this.ap.length * 2];
                        for(v9 = 0; v9 < this.ap.length; ++v9) {
                            v8_1[v9] = this.ap[v9];
                        }

                        this.ap = v8_1;
                    }

                    ++v6;
                }

                this.ap[v7] = ~v1_1;
                if(v7 < v3) {
                    goto label_102;
                }

                v3 = v7 + 1;
            }

        label_102:
            ++v1_1;
        }
    }

    static int an(int arg6, int arg7) {
        int v0;
        for(v0 = (((int)Math.pow(((double)arg6), 1 / (((double)arg7))))) + 1; kz.ax(v0, arg7, 39) > arg6; --v0) {
        }

        return v0;
    }

    static int ap(int arg6, int arg7) {
        int v0;
        for(v0 = (((int)Math.pow(((double)arg6), 1 / (((double)arg7))))) + 1; kz.ax(v0, arg7, 85) > arg6; --v0) {
        }

        return v0;
    }

    void aq() {
        int v9;
        int v6;
        int v5;
        int v4;
        int[] v0 = new int[this.al];
        int[] v1 = new int[166078289];
        int v3;
        for(v3 = 0; v3 < this.al; ++v3) {
            v4 = this.ae[v3];
            if(v4 == 0) {
            }
            else {
                v5 = 0x20;
                v6 = 1 << 0x20 - v4;
                int v8 = v1[v4];
                v0[v3] = v8;
                if((v8 & v6) != 0) {
                    v6 = v1[v4 - 1];
                }
                else {
                    v6 |= v8;
                    v9 = v4 - 1;
                    while(v9 >= 1) {
                        int v10 = v1[v9];
                        if(v10 != v8) {
                            break;
                        }

                        int v11 = 1 << 0x20 - v9;
                        if((v10 & v11) != 0) {
                            v1[v9] = v1[v9 - 1];
                        }
                        else {
                            v1[v9] = v10 | v11;
                            --v9;
                            continue;
                        }

                        break;
                    }
                }

                v1[v4] = v6;
                while(true) {
                    ++v4;
                    if(v4 > v5) {
                        break;
                    }

                    if(v1[v4] != v8) {
                        continue;
                    }

                    v1[v4] = v6;
                }
            }
        }

        this.ap = new int[8];
        int v1_1 = 0;
        v3 = 0;
        while(v1_1 < this.al) {
            v4 = this.ae[v1_1];
            if(v4 == 0) {
            }
            else {
                v5 = v0[v1_1];
                v6 = 0;
                int v7 = 0;
                while(v6 < v4) {
                    if((0x80000000 >>> v6 & v5) != 0) {
                        if(this.ap[v7] == 0) {
                            this.ap[v7] = v3;
                        }

                        v7 = this.ap[v7];
                    }
                    else {
                        ++v7;
                    }

                    if(v7 >= this.ap.length) {
                        int[] v8_1 = new int[this.ap.length * 2];
                        for(v9 = 0; v9 < this.ap.length; ++v9) {
                            v8_1[v9] = this.ap[v9];
                        }

                        this.ap = v8_1;
                    }

                    ++v6;
                }

                this.ap[v7] = ~v1_1;
                if(v7 < v3) {
                    goto label_102;
                }

                v3 = v7 + 1;
            }

        label_102:
            ++v1_1;
        }
    }

    float[] ar() {
        return this.an[this.ae()];
    }

    int av() {
        int v0;
        for(v0 = 0; this.ap[v0] >= 0; ++v0) {
            if(gf.ae() != 0) {
                v0 = this.ap[v0];
                continue;
            }
        }

        return ~this.ap[v0];
    }

    static int ax(int arg6, int arg7) {
        int v0;
        for(v0 = (((int)Math.pow(((double)arg6), 1 / (((double)arg7))))) + 1; kz.ax(v0, arg7, 0x77) > arg6; --v0) {
        }

        return v0;
    }
}

