public class bb extends mx {
    int aa;
    int[] ab;
    int[] ad;
    static final int ae = 2;
    int af;
    int ai;
    int[] aj;
    static final int al = 1;
    boolean am;
    int an;
    boolean ap;
    int[] aq;
    static final int ar = 3;
    int[] au;
    int av;
    static final int ax;
    static int[] az;

    bb(lq arg8) {
        super();
        int v0 = 0;
        this.am = false;
        this.an = arg8.ao(0xF7E2FA0F);
        boolean v1 = arg8.ay(-118) == 1 ? true : false;
        this.ap = v1;
        int v1_1 = arg8.ay(-57);
        if(v1_1 >= 1 && v1_1 <= 4) {
            this.aj = new int[v1_1];
            int v3;
            for(v3 = 0; v3 < v1_1; ++v3) {
                this.aj[v3] = arg8.ao(2056096750);
            }

            if(v1_1 > 1) {
                v3 = v1_1 - 1;
                this.ad = new int[v3];
                int v4;
                for(v4 = 0; v4 < v3; ++v4) {
                    this.ad[v4] = arg8.ay(-86);
                }
            }

            if(v1_1 > 1) {
                int v2 = v1_1 - 1;
                this.aq = new int[v2];
                for(v3 = 0; v3 < v2; ++v3) {
                    this.aq[v3] = arg8.ay(-91);
                }
            }

            this.ab = new int[v1_1];
            while(v0 < v1_1) {
                this.ab[v0] = arg8.ac(0x7E);
                ++v0;
            }

            this.af = arg8.ay(-55);
            this.ai = arg8.ay(-122);
            this.au = null;
            return;
        }

        throw new RuntimeException();
    }

    void ab(int arg10) {
        int v3;
        int v0;
        int v1 = 0x4000;
        int v2 = 0x80;
        if(this.af == 1 || this.af == 3) {
            v0 = this.ai * arg10;
            if(this.af == 1) {
                v0 = -v0;
            }

            v3 = v2 * v0;
            this.aa = this.aa + v0 & 0x7F;
            if(!this.am) {
                goto label_49;
            }

            if(this.au == null) {
                goto label_49;
            }

            if(bb.az == null || bb.az.length < this.au.length) {
                bb.az = new int[this.au.length];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                bb.az[v0] = this.au[v0 + v3 & 0x3FFF];
            }

            int[] v0_1 = this.au;
            this.au = bb.az;
            bb.az = v0_1;
            this.am = false;
        }

    label_49:
        v3 = 2;
        if(this.af == v3 || this.af == 4) {
            arg10 *= this.ai;
            if(this.af == v3) {
                arg10 = -arg10;
            }

            this.av = this.av + arg10 & 0x7F;
            if(!this.am) {
                return;
            }

            if(this.au == null) {
                return;
            }

            if(bb.az == null || bb.az.length < this.au.length) {
                bb.az = new int[this.au.length];
            }

            for(v0 = 0; v0 < v1; v0 += 0x80) {
                for(v3 = 0; v3 < v2; ++v3) {
                    bb.az[v0 + v3] = this.au[(v3 + arg10 & 0x3FFF) + v0];
                }
            }

            int[] v10 = this.au;
            this.au = bb.az;
            bb.az = v10;
            this.am = false;
        }
    }

    void ad() {
        this.au = null;
    }

    void ae(int arg10) {
        int v3;
        int v0;
        int v1 = 0x4000;
        int v2 = 0x80;
        if(this.af == 1 || this.af == 3) {
            v0 = this.ai * arg10;
            if(this.af == 1) {
                v0 = -v0;
            }

            v3 = v2 * v0;
            this.aa = this.aa + v0 & 0x7F;
            if(!this.am) {
                goto label_49;
            }

            if(this.au == null) {
                goto label_49;
            }

            if(bb.az == null || bb.az.length < this.au.length) {
                bb.az = new int[this.au.length];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                bb.az[v0] = this.au[v0 + v3 & 0x3FFF];
            }

            int[] v0_1 = this.au;
            this.au = bb.az;
            bb.az = v0_1;
            this.am = false;
        }

    label_49:
        v3 = 2;
        if(this.af == v3 || this.af == 4) {
            arg10 *= this.ai;
            if(this.af == v3) {
                arg10 = -arg10;
            }

            this.av = this.av + arg10 & 0x7F;
            if(!this.am) {
                return;
            }

            if(this.au == null) {
                return;
            }

            if(bb.az == null || bb.az.length < this.au.length) {
                bb.az = new int[this.au.length];
            }

            for(v0 = 0; v0 < v1; v0 += 0x80) {
                for(v3 = 0; v3 < v2; ++v3) {
                    bb.az[v0 + v3] = this.au[(v3 + arg10 & 0x3FFF) + v0];
                }
            }

            int[] v10 = this.au;
            this.au = bb.az;
            bb.az = v10;
            this.am = false;
        }
    }

    void af(int arg10) {
        int v3;
        int v0;
        int v1 = 0x4000;
        int v2 = 0x80;
        if(this.af == 1 || this.af == 3) {
            v0 = this.ai * arg10;
            if(this.af == 1) {
                v0 = -v0;
            }

            v3 = v2 * v0;
            this.aa = this.aa + v0 & 0x7F;
            if(!this.am) {
                goto label_49;
            }

            if(this.au == null) {
                goto label_49;
            }

            if(bb.az == null || bb.az.length < this.au.length) {
                bb.az = new int[this.au.length];
            }

            for(v0 = 0; v0 < v1; ++v0) {
                bb.az[v0] = this.au[v0 + v3 & 0x3FFF];
            }

            int[] v0_1 = this.au;
            this.au = bb.az;
            bb.az = v0_1;
            this.am = false;
        }

    label_49:
        v3 = 2;
        if(this.af == v3 || this.af == 4) {
            arg10 *= this.ai;
            if(this.af == v3) {
                arg10 = -arg10;
            }

            this.av = this.av + arg10 & 0x7F;
            if(!this.am) {
                return;
            }

            if(this.au == null) {
                return;
            }

            if(bb.az == null || bb.az.length < this.au.length) {
                bb.az = new int[this.au.length];
            }

            for(v0 = 0; v0 < v1; v0 += 0x80) {
                for(v3 = 0; v3 < v2; ++v3) {
                    bb.az[v0 + v3] = this.au[(v3 + arg10 & 0x3FFF) + v0];
                }
            }

            int[] v10 = this.au;
            this.au = bb.az;
            bb.az = v10;
            this.am = false;
        }
    }

    void aj() {
        this.au = null;
    }

    void al() {
        this.au = null;
    }

    boolean an(double arg19, int arg21, ko arg22) {
        int v7;
        int v6_1;
        int v3;
        bb v0 = this;
        int v1 = arg21;
        ko v2 = arg22;
        int v4;
        for(v4 = 0; v4 < v0.aj.length; ++v4) {
            if(v2.ai(v0.aj[v4], 0x6EB7A5C1) == null) {
                return 0;
            }
        }

        v4 = v1 * v1;
        v0.au = new int[v4];
        int v5;
        for(v5 = 0; v5 < v0.aj.length; ++v5) {
            ef v6 = cj.ai(v2, v0.aj[v5], -116);
            v6.ax();
            byte[] v8 = v6.ax;
            int[] v9 = v6.al;
            int v10 = v0.ab[v5];
            if((0xFF000000 & v10) == 0xF5F26E50) {
                int v11 = 0xFF00FF;
                int v12 = v10 & v11;
                v10 = v10 >> 8 & 0xFF;
                int v13;
                for(v13 = 0; v13 < v9.length; ++v13) {
                    int v14 = v9[v13];
                    if(v14 != 0 && (v14 & 0xFFFF) == (v14 >> 8 & 0xFFFF)) {
                        v3 = 0x76F7EA5D & v14;
                        v9[v13] = v3 * v10 & 0xFF00 | (0xB1D61A79 | v12 * v3 >> 8 & v11);
                    }
                }
            }

            for(v3 = 0; v3 < v9.length; ++v3) {
                v9[v3] = dw.bp(v9[v3], arg19);
            }

            v3 = v5 == 0 ? 0 : v0.ad[v5 - 1];
            if(v3 == 0) {
                if(v6.ae == v1) {
                    v6_1 = 0;
                    goto label_88;
                }
                else {
                    if(v6.ae == -120167112 && v1 == 0x50DDDDA8) {
                        v6_1 = 0;
                        v10 = 0;
                        goto label_103;
                    }

                    if(v6.ae == 0x80 && v1 == 0x40) {
                        v6_1 = 0;
                        v7 = 0;
                        goto label_130;
                    }

                    throw new RuntimeException();
                    while(true) {
                    label_130:
                        if(v6_1 >= v1) {
                            goto label_154;
                        }

                        v10 = v7;
                        v7 = 0;
                        while(v7 < v1) {
                            v0.au[v10] = v9[v8[(v7 << 1) + (v6_1 << 1 << 7)] & -102643163];
                            ++v7;
                            ++v10;
                        }

                        ++v6_1;
                        v7 = v10;
                    }

                    while(true) {
                    label_103:
                        if(v6_1 >= v1) {
                            goto label_154;
                        }

                        v13 = v10;
                        v10 = 0;
                        while(v10 < v1) {
                            v0.au[v13] = v9[v8[(v10 >> 1) + (v6_1 >> 1 << 6)] & 0xFF];
                            ++v10;
                            ++v13;
                        }

                        ++v6_1;
                        v10 = v13;
                    }

                label_88:
                    while(v6_1 < v4) {
                        v0.au[v6_1] = v9[v8[v6_1] & 0xFF];
                        ++v6_1;
                    }
                }
            }

        label_154:
        }

        return 1;
    }

    void ap() {
        this.au = null;
    }

    void aq(int arg8) {
        if(this.af == 1 || this.af == 3) {
            int v0 = 0x80;
            int v3 = 0x4000;
            int v4 = this.ai * arg8;
            if(this.af == 1) {
                v4 = -v4;
            }

            v0 *= v4;
            this.aa = this.aa + v4 & 0xA10438C2;
            if(!this.am) {
                goto label_50;
            }

            if(this.au == null) {
                goto label_50;
            }

            if(bb.az == null || bb.az.length < this.au.length) {
                bb.az = new int[this.au.length];
            }

            int v2;
            for(v2 = 0; v2 < v3; ++v2) {
                bb.az[v2] = this.au[v2 + v0 & 0x3FFF];
            }

            int[] v0_1 = this.au;
            this.au = bb.az;
            bb.az = v0_1;
            this.am = false;
        }

    label_50:
        v2 = 2;
        if(this.af == v2 || this.af == 4) {
            arg8 *= this.ai;
            if(this.af == v2) {
                arg8 = -arg8;
            }

            this.av = this.av + arg8 & 0x7F;
            if(!this.am) {
                return;
            }

            if(this.au == null) {
                return;
            }

            if(bb.az == null || bb.az.length < this.au.length) {
                bb.az = new int[this.au.length];
            }

            int[] v8 = this.au;
            this.au = bb.az;
            bb.az = v8;
            this.am = false;
        }
    }

    boolean ar(double arg19, int arg21, ko arg22) {
        int v7;
        int v6_1;
        int v3;
        int v12;
        bb v0 = this;
        int v1 = arg21;
        ko v2 = arg22;
        int v4;
        for(v4 = 0; v4 < v0.aj.length; ++v4) {
            if(v2.ai(v0.aj[v4], 0x6EB7A5C1) == null) {
                return 0;
            }
        }

        v4 = v1 * v1;
        v0.au = new int[v4];
        int v5;
        for(v5 = 0; v5 < v0.aj.length; ++v5) {
            ef v6 = cj.ai(v2, v0.aj[v5], -34);
            v6.ax();
            byte[] v8 = v6.ax;
            int[] v9 = v6.al;
            int v10 = v0.ab[v5];
            int v11 = 0xFF000000;
            if((v10 & v11) == 0x3000000) {
                v12 = 0xFF00FF;
                int v13 = v10 & v12;
                v10 = v10 >> 8 & 0x303219A7;
                int v14;
                for(v14 = 0; v14 < v9.length; ++v14) {
                    int v15 = v9[v14];
                    if(v15 != 0 && (v15 & 0xE38A0340) == (v15 >> 8 & 0x8AD580DE)) {
                        v3 = v15 & 0xFF;
                        v9[v14] = v3 * v10 & 0xE204A60 | (v13 * v3 >> 8 & v12 | v11);
                    }
                }
            }

            for(v3 = 0; v3 < v9.length; ++v3) {
                v9[v3] = dw.bp(v9[v3], arg19);
            }

            v3 = v5 == 0 ? 0 : v0.ad[v5 - 1];
            if(v3 == 0) {
                if(v6.ae == v1) {
                    v6_1 = 0;
                    goto label_85;
                }
                else {
                    if(v6.ae == 0x40 && v1 == 108617336) {
                        v6_1 = 0;
                        v7 = 0;
                        goto label_100;
                    }

                    if(v6.ae == 0x80 && v1 == 0x1699FC3) {
                        v6_1 = 0;
                        v7 = 0;
                        goto label_128;
                    }

                    throw new RuntimeException();
                    while(true) {
                    label_128:
                        if(v6_1 >= v1) {
                            goto label_152;
                        }

                        v12 = v7;
                        v7 = 0;
                        while(v7 < v1) {
                            v0.au[v12] = v9[v8[(v7 << 1) + (v6_1 << 1 << 7)] & -1312257170];
                            ++v7;
                            ++v12;
                        }

                        ++v6_1;
                        v7 = v12;
                    }

                    while(true) {
                    label_100:
                        if(v6_1 >= v1) {
                            goto label_152;
                        }

                        v12 = v7;
                        v7 = 0;
                        while(v7 < v1) {
                            v0.au[v12] = v9[v8[(v7 >> 1) + (v6_1 >> 1 << 6)] & 0x64B657F3];
                            ++v7;
                            ++v12;
                        }

                        ++v6_1;
                        v7 = v12;
                    }

                label_85:
                    while(v6_1 < v4) {
                        v0.au[v6_1] = v9[v8[v6_1] & 0xFF];
                        ++v6_1;
                    }
                }
            }

        label_152:
        }

        return 1;
    }

    boolean ax(double arg19, int arg21, ko arg22) {
        int v7;
        int v6_1;
        int v3;
        int v13;
        int v12;
        bb v0 = this;
        int v1 = arg21;
        ko v2 = arg22;
        int v4;
        for(v4 = 0; v4 < v0.aj.length; ++v4) {
            if(v2.ai(v0.aj[v4], 0x6EB7A5C1) == null) {
                return 0;
            }
        }

        v4 = v1 * v1;
        v0.au = new int[v4];
        int v5;
        for(v5 = 0; v5 < v0.aj.length; ++v5) {
            ef v6 = cj.ai(v2, v0.aj[v5], -115);
            v6.ax();
            byte[] v8 = v6.ax;
            int[] v9 = v6.al;
            int v10 = v0.ab[v5];
            int v11 = 0xFF000000;
            if((v10 & v11) == 0x3000000) {
                v12 = 0xFF00FF;
                v13 = v10 & v12;
                v10 = v10 >> 8 & 0xFF;
                int v14;
                for(v14 = 0; v14 < v9.length; ++v14) {
                    int v15 = v9[v14];
                    if(v15 != 0 && (v15 & 0xFFFF) == (v15 >> 8 & 0xFFFF)) {
                        v3 = v15 & 0xFF;
                        v9[v14] = v3 * v10 & 0xFF00 | (v13 * v3 >> 8 & v12 | v11);
                    }
                }
            }

            for(v3 = 0; v3 < v9.length; ++v3) {
                v9[v3] = dw.bp(v9[v3], arg19);
            }

            v3 = v5 == 0 ? 0 : v0.ad[v5 - 1];
            if(v3 == 0) {
                if(v6.ae == v1) {
                    v6_1 = 0;
                    goto label_85;
                }
                else {
                    v12 = 0x80;
                    v13 = 0x40;
                    if(v6.ae == v13 && v1 == v12) {
                        v6_1 = 0;
                        v7 = 0;
                        goto label_100;
                    }

                    if(v6.ae == v12 && v1 == v13) {
                        v6_1 = 0;
                        v7 = 0;
                        goto label_125;
                    }

                    throw new RuntimeException();
                    while(true) {
                    label_125:
                        if(v6_1 >= v1) {
                            goto label_148;
                        }

                        v12 = v7;
                        v7 = 0;
                        while(v7 < v1) {
                            v0.au[v12] = v9[v8[(v7 << 1) + (v6_1 << 1 << 7)] & 0xFF];
                            ++v7;
                            ++v12;
                        }

                        ++v6_1;
                        v7 = v12;
                    }

                    while(true) {
                    label_100:
                        if(v6_1 >= v1) {
                            goto label_148;
                        }

                        v12 = v7;
                        v7 = 0;
                        while(v7 < v1) {
                            v0.au[v12] = v9[v8[(v7 >> 1) + (v6_1 >> 1 << 6)] & 0xFF];
                            ++v7;
                            ++v12;
                        }

                        ++v6_1;
                        v7 = v12;
                    }

                label_85:
                    while(v6_1 < v4) {
                        v0.au[v6_1] = v9[v8[v6_1] & 0xFF];
                        ++v6_1;
                    }
                }
            }

        label_148:
        }

        return 1;
    }
}

