public class kp extends mx {
    byte[] al;
    oh ax;

    kp(lq arg57) {
        int v55;
        int v54;
        int v52;
        int v53;
        int v0_1;
        int v37;
        int v4;
        int v21;
        int v7;
        kp v0 = this;
        lq v1 = arg57;
        super();
        v1.ar = (v1.ae.length - 3) * -1880437085;
        int v2 = v1.ay(-58);
        int v5 = v1.ao(0x1C96057B);
        v1.ar = 0;
        int v8 = v2 * 10 + 14;
        int v6 = 0;
        int v9 = 0;
        int v10 = 0;
        int v11 = 0;
        int v12 = 0;
        int v13 = 0;
        int v14 = 0;
        int v15 = 0;
        int v16 = 0;
        while(true) {
        label_28:
            v7 = 7;
            if(v6 >= v2) {
                goto label_91;
            }

            v21 = v16;
            v16 = v14;
            v14 = v13;
            v13 = v11;
            v11 = v10;
            v10 = v9;
            v9 = v8;
            v8 = -1;
            while(true) {
            label_40:
                v4 = v1.ay(-37);
                if(v4 != v8) {
                    ++v9;
                }

                v8 = v4 & 15;
                if(v4 != v7) {
                    break;
                }

                ++v6;
                v8 = v9;
                v9 = v10;
                v10 = v11;
                v11 = v13;
                v13 = v14;
                v14 = v16;
                v16 = v21;
                goto label_28;
            }
        }

        if(v4 == 23) {
            ++v10;
        }
        else if(v8 == 0) {
            ++v11;
        }
        else if(v8 == 1) {
            ++v13;
        }
        else if(v8 == 2) {
            ++v12;
        }
        else if(v8 == 3) {
            ++v14;
        }
        else if(v8 == 4) {
            ++v15;
        }
        else if(v8 == 5) {
            ++v16;
        }
        else if(v8 == 6) {
            ++v21;
        }
        else {
            goto label_88;
        }

        v7 = 7;
        goto label_40;
    label_88:
        throw new RuntimeException();
    label_91:
        v4 = v10 + v11;
        v8 = v8 + v9 * 5 + (v4 + v12 + v13 + v14) * 2 + (v15 + v16);
        v6 = v1.ar * 0xF24F550B;
        int v3 = v2 + v9 + v12 + v10 + v11 + v13 + v15 + v14 + v16;
        v7 = 0;
        while(v7 < v3) {
            v1.bx(0);
            ++v7;
            v3 = v3;
        }

        v8 += v1.ar * 0xF24F550B - v6;
        int v36 = v1.ar * 0xF24F550B;
        v21 = v16;
        v7 = 0;
        v16 = 0;
        int v24 = 0;
        int v25 = 0;
        int v26 = 0;
        int v27 = 0;
        int v28 = 0;
        int v29 = 0;
        int v30 = 0;
        int v31 = 0;
        int v32 = 0;
        int v33 = 0;
        int v34 = 0;
        int v35 = 0;
        while(v7 < v12) {
            v3 = v16 + v1.ay(-128) & 0x7F;
            if(v3 != 0) {
                v37 = v12;
                if(v3 == 0x20) {
                    goto label_211;
                }
                else if(v3 == 1) {
                    ++v25;
                }
                else if(v3 == 33) {
                    ++v26;
                }
                else if(v3 == 7) {
                    ++v27;
                }
                else if(v3 == 39) {
                    ++v28;
                }
                else if(v3 == 10) {
                    ++v29;
                }
                else if(v3 == 42) {
                    ++v30;
                }
                else if(v3 == 99) {
                    ++v31;
                }
                else if(v3 == 98) {
                    ++v32;
                }
                else if(v3 == 101) {
                    ++v33;
                }
                else if(v3 == 100) {
                    ++v35;
                }
                else {
                    if(v3 != 0x40 && v3 != 65 && v3 != 120 && v3 != 0x79) {
                        if(v3 == 0x7B) {
                        }
                        else {
                            ++v34;
                            goto label_212;
                        }
                    }

                    ++v24;
                }
            }
            else {
                v37 = v12;
            label_211:
                ++v21;
            }

        label_212:
            ++v7;
            v16 = v3;
            v12 = v37;
        }

        v3 = v1.ar * 0xF24F550B;
        v1.ar += v24 * -1880437085;
        v12 = v1.ar * 0xF24F550B;
        v1.ar += v14 * -1880437085;
        v7 = v1.ar * 0xF24F550B;
        int v38 = v3;
        v1.ar += v15 * -1880437085;
        v3 = v1.ar * 0xF24F550B;
        v13 *= -1880437085;
        v1.ar += v13;
        v15 = v1.ar * 0xF24F550B;
        int v39 = v3;
        v1.ar += v25 * -1880437085;
        int v40 = v1.ar * 0xF24F550B;
        v1.ar += v27 * -1880437085;
        int v41 = v1.ar * 0xF24F550B;
        v1.ar += v29 * -1880437085;
        int v42 = v1.ar * 0xF24F550B;
        v1.ar += (v4 + v14) * -1880437085;
        v3 = v1.ar * 0xF24F550B;
        v1.ar += v10 * -1880437085;
        v4 = v1.ar * 0xF24F550B;
        v1.ar += v34 * -1880437085;
        v10 = v1.ar * 0xF24F550B;
        v1.ar += v11 * -1880437085;
        v11 = v1.ar * 0xF24F550B;
        v1.ar += v26 * -1880437085;
        v14 = v1.ar * 0xF24F550B;
        int v43 = v3;
        v1.ar += v28 * -1880437085;
        int v44 = v1.ar * 0xF24F550B;
        v1.ar += v30 * -1880437085;
        int v45 = v1.ar * 0xF24F550B;
        v1.ar += v21 * -1880437085;
        int v46 = v1.ar * 0xF24F550B;
        v1.ar += v13;
        v3 = v1.ar * 0xF24F550B;
        v1.ar += v31 * -1880437085;
        v13 = v1.ar * 0xF24F550B;
        int v47 = v3;
        v1.ar += v32 * -1880437085;
        int v48 = v1.ar * 0xF24F550B;
        v1.ar += v33 * -1880437085;
        int v49 = v1.ar * 0xF24F550B;
        v1.ar += v35 * -1880437085;
        int v50 = v1.ar * 0xF24F550B;
        v1.ar += v9 * 0xAFC06BE9;
        v0.al = new byte[v8];
        lq v3_1 = new lq(v0.al);
        v3_1.aj(1297377380, 0x79EF67B1);
        v3_1.aj(6, 0x79EF67B1);
        v8 = v2 > 1 ? 1 : 0;
        v3_1.an(v8, 0x7520B89D);
        v3_1.an(v2, 0x6958388C);
        v3_1.an(v5, 0x43027F1);
        v1.ar = v6 * -1880437085;
        int[] v5_1 = new int[0x80];
        v27 = v4;
        v8 = v7;
        v26 = v13;
        v25 = v14;
        v4 = 0;
        v6 = 0;
        v7 = 0;
        v9 = 0;
        v13 = 0;
        v14 = 0;
        v16 = 0;
        int v17 = 0;
        v21 = 0;
        v24 = 0;
        while(true) {
        label_401:
            if(v4 >= v2) {
                return;
            }

            int v51 = v2;
            v3_1.aj(0x4D54726B, 0x79EF67B1);
            v3_1.ar += 0x3FAB3A8C;
            v0_1 = v3_1.ar * 0xF24F550B;
            v2 = -1;
            v53 = v8;
            v52 = v12;
            while(true) {
            label_416:
                v3_1.at(v1.bx(0), 39);
                v12 = v7 + 1;
                v7 = v1.ae[v7] & 0xFF;
                v2 = v7 != v2 ? 1 : 0;
                v8 = v7 & 15;
                v54 = v12;
                if(v7 != 7) {
                    break;
                }

                if(v2 != 0) {
                    v3_1.ar(0xFF, 120);
                }

                v3_1.ar(0x2F, 67);
                v3_1.ar(0, 26);
                v3_1.am(v3_1.ar * 0xF24F550B - v0_1, 0xB2C650A4);
                ++v4;
                v2 = v51;
                v12 = v52;
                v8 = v53;
                v7 = v54;
                goto label_401;
            }
        }

        if(v7 == 23) {
            if(v2 != 0) {
                v3_1.ar(0xFF, 28);
            }

            v3_1.ar(81, 104);
            v3_1.ar(3, 78);
            v7 = v50 + 1;
            v3_1.ar(v1.ae[v50], 36);
            v12 = v7 + 1;
            v3_1.ar(v1.ae[v7], 0x75);
            v50 = v12 + 1;
            v3_1.ar(v1.ae[v12], 56);
            v2 = v8;
            v7 = v54;
            goto label_416;
        }

        v9 ^= v7 >> 4;
        if(v8 == 0) {
            if(v2 != 0) {
                v3_1.ar(v9 + 0x90, 74);
            }

            v13 += v1.ae[v42];
            v14 += v1.ae[v43];
            v55 = v0_1;
            v3_1.ar(v13 & 0x7F, 58);
            v3_1.ar(v14 & 0x7F, 100);
            ++v42;
            v2 = v8;
            ++v43;
        }
        else {
            v55 = v0_1;
            if(v8 == 1) {
                if(v2 != 0) {
                    v3_1.ar(v9 + 0x80, 120);
                }

                v13 += v1.ae[v42];
                v16 += v1.ae[v10];
                v3_1.ar(v13 & 0x7F, 49);
                v3_1.ar(v16 & 0x7F, 57);
                ++v42;
                ++v10;
            }
            else {
                if(v8 == 2) {
                    if(v2 != 0) {
                        v3_1.ar(v9 + 0xB0, 85);
                    }

                    v7 = v36 + 1;
                    v6 = v6 + v1.ae[v36] & 0x7F;
                    v3_1.ar(v6, 58);
                    if(v6 == 0 || v6 == 0x20) {
                        v0_1 = v1.ae[v45];
                        ++v45;
                    }
                    else if(v6 == 1) {
                        v0_1 = v1.ae[v15];
                        ++v15;
                    }
                    else if(v6 == 33) {
                        v0_1 = v1.ae[v11];
                        ++v11;
                    }
                    else if(v6 == 7) {
                        v0_1 = v1.ae[v40];
                        ++v40;
                    }
                    else if(v6 == 39) {
                        v0_1 = v1.ae[v25];
                        ++v25;
                    }
                    else if(v6 == 10) {
                        v0_1 = v1.ae[v41];
                        ++v41;
                    }
                    else if(v6 == 42) {
                        v0_1 = v1.ae[v44];
                        ++v44;
                    }
                    else if(v6 == 99) {
                        v0_1 = v1.ae[v47];
                        ++v47;
                    }
                    else if(v6 == 98) {
                        v0_1 = v1.ae[v26];
                        ++v26;
                    }
                    else if(v6 == 101) {
                        v0_1 = v1.ae[v48];
                        ++v48;
                    }
                    else if(v6 == 100) {
                        v0_1 = v1.ae[v49];
                        ++v49;
                    }
                    else {
                        if(v6 != 0x40 && v6 != 65 && v6 != 120 && v6 != 0x79) {
                            if(v6 == 0x7B) {
                            }
                            else {
                                v0_1 = v1.ae[v27];
                                ++v27;
                                goto label_658;
                            }
                        }

                        v0_1 = v1.ae[v38];
                        ++v38;
                    }

                label_658:
                    v0_1 += v5_1[v6];
                    v5_1[v6] = v0_1;
                    v3_1.ar(v0_1 & 0x7F, 98);
                    v36 = v7;
                    goto label_537;
                }

                if(v8 == 3) {
                    if(v2 != 0) {
                        v3_1.ar(v9 + 0xE0, 50);
                    }

                    v17 = v17 + v1.ae[v46] + (v1.ae[v39] << 7);
                    v3_1.ar(v17 & 0x7F, 46);
                    v3_1.ar(v17 >> 7 & 0x7F, 0x7E);
                    ++v46;
                    v2 = v8;
                    ++v39;
                    goto label_511;
                }

                byte v7_1 = 0x7F;
                if(v8 == 4) {
                    if(v2 != 0) {
                        v3_1.ar(v9 + 0xD0, v7_1);
                    }

                    v21 += v1.ae[v53];
                    v3_1.ar(v21 & 0x7F, 103);
                    v2 = v8;
                    ++v53;
                    goto label_511;
                }

                if(v8 == 5) {
                    if(v2 != 0) {
                        v3_1.ar(v9 + 0xA0, 16);
                    }

                    v13 += v1.ae[v42];
                    v24 += v1.ae[v52];
                    v3_1.ar(v13 & 0x7F, 0x72);
                    v3_1.ar(v24 & 0x7F, 10);
                    v2 = v8;
                    ++v42;
                    ++v52;
                    goto label_511;
                }

                if(v8 != 6) {
                    goto label_751;
                }

                if(v2 != 0) {
                    v3_1.ar(v9 + 0xC0, 21);
                }

                v3_1.ar(v1.ae[v45], 89);
                ++v45;
            }

        label_537:
            v2 = v8;
        }

    label_511:
        v7 = v54;
        v0_1 = v55;
        goto label_416;
    label_751:
        throw new RuntimeException();
    }

    void ab() {
        this.ax = null;
    }

    void ad() {
        mb v5_2;
        int v8;
        int v5;
        if(this.ax != null) {
            return;
        }

        this.ax = new oh(16);
        int[] v0 = new int[16];
        int[] v1 = new int[16];
        v1[9] = 0x80;
        v0[9] = 0x80;
        kh v2 = new kh(this.al);
        int v3 = v2.ar();
        int v4;
        for(v4 = 0; v4 < v3; ++v4) {
            v2.an(v4);
            v2.ad(v4);
            v2.ap(v4);
        }

        while(true) {
        label_24:
            v3 = v2.av();
            v4 = v2.an[v3];
            while(true) {
            label_27:
                if(v2.an[v3] != v4) {
                    goto label_24;
                }

                v2.an(v3);
                v5 = v2.aq(v3);
                if(v5 != 1) {
                    goto label_40;
                }

                v2.aj();
                v2.ap(v3);
                if(v2.aa()) {
                    return;
                }

                goto label_24;
            }
        }

        return;
    label_40:
        int v7 = v5 & 0xF0;
        if(v7 == 0xB0) {
            v8 = v5 & 15;
            int v9 = v5 >> 8 & -299904102;
            int v10 = v5 >> 16 & 0x7F;
            if(v9 == 0) {
                v0[v8] = (v0[v8] & -898230050) + (v10 << 14);
            }

            if(v9 != 0x20) {
                goto label_64;
            }

            v0[v8] = (v0[v8] & 0x8A1224D1) + (v10 << 7);
        }

    label_64:
        if(v7 == 0x3FA38B6A) {
            v8 = v5 & 15;
            v1[v8] = v0[v8] + (v5 >> 8 & 0x7F);
        }

        if(v7 == 0x90) {
            v7 = v5 & 15;
            v8 = v5 >> 8 & 0x7F;
            if((v5 >> 16 & 1797396501) > 0) {
                long v9_1 = ((long)v1[v7]);
                mx v5_1 = this.ax.ax(v9_1);
                if(v5_1 == null) {
                    v5_2 = new mb(new byte[0xDD08D6FA]);
                    this.ax.al(((mx)v5_2), v9_1);
                }

                v5_2.ax[v8] = 1;
            }
        }

        v2.ad(v3);
        v2.ap(v3);
        goto label_27;
    }

    void ae() {
        this.ax = null;
    }

    void af() {
        this.ax = null;
    }

    void ai() {
        this.ax = null;
    }

    static kp aj(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new kp(new lq(v1));
    }

    void al() {
        mb v6_2;
        int v9;
        int v6;
        if(this.ax != null) {
            return;
        }

        this.ax = new oh(16);
        int[] v0 = new int[16];
        int[] v1 = new int[16];
        int v3 = 0x80;
        v1[9] = v3;
        v0[9] = v3;
        kh v2 = new kh(this.al);
        int v4 = v2.ar();
        int v5;
        for(v5 = 0; v5 < v4; ++v5) {
            v2.an(v5);
            v2.ad(v5);
            v2.ap(v5);
        }

        while(true) {
        label_24:
            v4 = v2.av();
            v5 = v2.an[v4];
            while(true) {
            label_27:
                if(v2.an[v4] != v5) {
                    goto label_24;
                }

                v2.an(v4);
                v6 = v2.aq(v4);
                if(v6 != 1) {
                    goto label_40;
                }

                v2.aj();
                v2.ap(v4);
                if(v2.aa()) {
                    return;
                }

                goto label_24;
            }
        }

        return;
    label_40:
        int v8 = v6 & 0xF0;
        if(v8 == 0xB0) {
            v9 = v6 & 15;
            int v10 = v6 >> 8 & 0x7F;
            int v11 = v6 >> 16 & 0x7F;
            if(v10 == 0) {
                v0[v9] = (v0[v9] & 0xFFE03FFF) + (v11 << 14);
            }

            if(v10 != 0x20) {
                goto label_62;
            }

            v0[v9] = (v0[v9] & 0xFFFFC07F) + (v11 << 7);
        }

    label_62:
        if(v8 == 0xC0) {
            v9 = v6 & 15;
            v1[v9] = v0[v9] + (v6 >> 8 & 0x7F);
        }

        if(v8 == 0x90) {
            v8 = v6 & 15;
            v9 = v6 >> 8 & 0x7F;
            if((v6 >> 16 & 0x7F) > 0) {
                long v10_1 = ((long)v1[v8]);
                mx v6_1 = this.ax.ax(v10_1);
                if(v6_1 == null) {
                    v6_2 = new mb(new byte[v3]);
                    this.ax.al(((mx)v6_2), v10_1);
                }

                v6_2.ax[v9] = 1;
            }
        }

        v2.ad(v4);
        v2.ap(v4);
        goto label_27;
    }

    static kp an(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new kp(new lq(v1));
    }

    static kp ap(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new kp(new lq(v1));
    }

    void aq() {
        int v9;
        int v6;
        if(this.ax != null) {
            return;
        }

        this.ax = new oh(16);
        int[] v0 = new int[16];
        int[] v1 = new int[16];
        int v3 = 0x80;
        v1[9] = v3;
        v0[9] = v3;
        kh v2 = new kh(this.al);
        int v4 = v2.ar();
        int v5;
        for(v5 = 0; v5 < v4; ++v5) {
            v2.an(v5);
            v2.ad(v5);
            v2.ap(v5);
        }

        while(true) {
        label_24:
            v4 = v2.av();
            v5 = v2.an[v4];
            while(true) {
            label_27:
                if(v2.an[v4] != v5) {
                    goto label_24;
                }

                v2.an(v4);
                v6 = v2.aq(v4);
                if(v6 != 1) {
                    goto label_40;
                }

                v2.aj();
                v2.ap(v4);
                if(v2.aa()) {
                    return;
                }

                goto label_24;
            }
        }

        return;
    label_40:
        int v8 = v6 & 0xF0;
        if(v8 == 0xB0) {
            v9 = v6 & 15;
            int v10 = v6 >> 8 & 0x7F;
            int v11 = v6 >> 16 & 0x7F;
            if(v10 == 0) {
                v0[v9] = (v0[v9] & 0xFFE03FFF) + (v11 << 14);
            }

            if(v10 != 0x20) {
                goto label_62;
            }

            v0[v9] = (v0[v9] & 0xFFFFC07F) + (v11 << 7);
        }

    label_62:
        if(v8 == 0xC0) {
            v9 = v6 & 15;
            v1[v9] = v0[v9] + (v6 >> 8 & 0x7F);
        }

        if(v8 == 0x90) {
            v8 = v6 & 15;
            v9 = v6 >> 8 & 0x7F;
            if((v6 >> 16 & 0x7F) > 0) {
                long v10_1 = ((long)v1[v8]);
                mx v6_1 = this.ax.ax(v10_1);
                if(v6_1 == null) {
                    mb v6_2 = new mb(new byte[v3]);
                    this.ax.al(((mx)v6_2), v10_1);
                }

                ((mb)v6_1).ax[v9] = 1;
            }
        }

        v2.ad(v4);
        v2.ap(v4);
        goto label_27;
    }

    static kp ar(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new kp(new lq(v1));
    }

    static kp ax(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new kp(new lq(v1));
    }
}

