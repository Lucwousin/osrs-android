public class ca extends bm {
    int[] aa;
    int[] ab;
    int[][] ac;
    int[] ad;
    static ca ae;
    int[] af;
    byte[] ag;
    short[] ah;
    int[] ai;
    int[] aj;
    int[][] ak;
    static byte[] al;
    byte[] am;
    int an;
    int[] ao;
    int[] ap;
    int aq;
    static byte[] ar;
    int[] as;
    byte at;
    int[] au;
    int[] av;
    int[] aw;
    static ca ax;
    int ay;
    byte[] az;
    int[] ba;
    int bb;
    int bc;
    int[] bd;
    static int be;
    public boolean bf;
    int bg;
    int bj;
    int bk;
    static int bl;
    int bm;
    static int bn;
    int bo;
    int bp;
    int bq;
    static int br;
    static final int[] bs;
    int bt;
    static final int[] bu;
    int bv;
    boolean bw;
    int bx;
    boolean by;
    int bz;

    static {
        ca.ax = new ca();
        ca.al = new byte[1];
        ca.ae = new ca();
        ca.ar = new byte[1];
        ca.bn = 0;
        ca.bu = bt.ag;
        ca.bs = bt.ah;
    }

    ca() {
        super();
        this.an = 0;
        this.aq = 0;
        this.at = 0;
        this.ay = 0;
        this.bf = false;
        int v1 = ca.bn;
        ca.bn = v1 + 1;
        this.bp = v1;
        this.bw = true;
        this.bo = -1;
        this.by = false;
        this.bk = -1;
        this.bm = -1;
        this.bj = -1;
    }

    public ca(ca[] arg16, int arg17) {
        int v11;
        ca v10;
        ca v0 = this;
        int v1 = arg17;
        super();
        v0.an = 0;
        v0.aq = 0;
        v0.at = 0;
        v0.ay = 0;
        v0.bf = false;
        int v3 = ca.bn;
        ca.bn = v3 + 1;
        v0.bp = v3;
        v0.bw = true;
        byte v4 = -1;
        v0.bo = v4;
        v0.by = false;
        v0.bk = v4;
        v0.bm = v4;
        v0.bj = v4;
        v0.an = 0;
        v0.aq = 0;
        v0.ay = 0;
        v0.at = v4;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        while(v5 < v1) {
            v10 = arg16[v5];
            if(v10 != null) {
                v0.an += v10.an;
                v0.aq += v10.aq;
                v0.ay += v10.ay;
                if(v10.am == null) {
                    if(v0.at == v4) {
                        v0.at = v10.at;
                    }

                    if(v0.at == v10.at) {
                        goto label_57;
                    }

                    goto label_47;
                }
                else {
                label_47:
                    v6 = 1;
                }

            label_57:
                v11 = v10.az != null ? 1 : 0;
                v7 |= v11;
                v11 = v10.ah != null ? 1 : 0;
                v8 |= v11;
                int v10_1 = v10.ag != null ? 1 : 0;
                v9 |= v10_1;
            }

            ++v5;
        }

        v0.ap = new int[v0.an];
        v0.aj = new int[v0.an];
        v0.ad = new int[v0.an];
        v0.ab = new int[v0.aq];
        v0.af = new int[v0.aq];
        v0.ai = new int[v0.aq];
        v0.av = new int[v0.aq];
        v0.aa = new int[v0.aq];
        v0.au = new int[v0.aq];
        if(v6 != 0) {
            v0.am = new byte[v0.aq];
        }

        if(v7 != 0) {
            v0.az = new byte[v0.aq];
        }

        if(v8 != 0) {
            v0.ah = new short[v0.aq];
        }

        if(v9 != 0) {
            v0.ag = new byte[v0.aq];
        }

        if(v0.ay > 0) {
            v0.aw = new int[v0.ay];
            v0.ao = new int[v0.ay];
            v0.as = new int[v0.ay];
        }

        v0.an = 0;
        v0.aq = 0;
        v0.ay = 0;
        for(v5 = 0; v5 < v1; ++v5) {
            v10 = arg16[v5];
            if(v10 != null) {
                for(v11 = 0; v11 < v10.aq; ++v11) {
                    v0.ab[v0.aq] = v10.ab[v11] + v0.an;
                    v0.af[v0.aq] = v10.af[v11] + v0.an;
                    v0.ai[v0.aq] = v10.ai[v11] + v0.an;
                    v0.av[v0.aq] = v10.av[v11];
                    v0.aa[v0.aq] = v10.aa[v11];
                    v0.au[v0.aq] = v10.au[v11];
                    if(v6 != 0) {
                        v0.am[v0.aq] = v10.am != null ? v10.am[v11] : v10.at;
                    }

                    if(v7 != 0 && v10.az != null) {
                        v0.az[v0.aq] = v10.az[v11];
                    }

                    if(v8 != 0) {
                        v0.ah[v0.aq] = v10.ah != null ? v10.ah[v11] : ((short)v4);
                    }

                    if(v9 != 0) {
                        if(v10.ag != null && v10.ag[v11] != v4) {
                            v0.ag[v0.aq] = ((byte)(v10.ag[v11] + v0.ay));
                            goto label_228;
                        }

                        v0.ag[v0.aq] = v4;
                    }

                label_228:
                    ++v0.aq;
                }

                int v2;
                for(v2 = 0; v2 < v10.ay; ++v2) {
                    v0.aw[v0.ay] = v10.aw[v2] + v0.an;
                    v0.ao[v0.ay] = v10.ao[v2] + v0.an;
                    v0.as[v0.ay] = v10.as[v2] + v0.an;
                    ++v0.ay;
                }

                for(v2 = 0; v2 < v10.an; ++v2) {
                    v0.ap[v0.an] = v10.ap[v2];
                    v0.aj[v0.an] = v10.aj[v2];
                    v0.ad[v0.an] = v10.ad[v2];
                    ++v0.an;
                }
            }
        }
    }

    public void aa() {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] = -this.ap[v0];
            this.ad[v0] = -this.ad[v0];
        }

        this.aq();
    }

    public void ab(bf arg10, int arg11) {
        if(this.ak == null) {
            return;
        }

        if(arg11 == -1) {
            return;
        }

        ba v10 = arg10.ax[arg11];
        bu v11 = v10.an;
        int v0 = 0;
        ca.be = 0;
        ca.bl = 0;
        ca.br = 0;
        int v1 = 0;
        while(v1 < v10.ap) {
            if(v11.ae[v10.aj[v1]] == 5) {
            }
            else {
                ++v1;
                continue;
            }

            break;
        }

        while(v0 < v10.ap) {
            this.ai(v11.ae[v10.aj[v0]], v11.ar[v10.aj[v0]], v10.ad[v0], v10.aq[v0], v10.ab[v0]);
            ++v0;
        }

        this.aq();
    }

    public ca ac(boolean arg3) {
        if(!arg3 && ca.ar.length < this.aq) {
            ca.ar = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ae, ca.ar);
    }

    public int ad() {
        this.ap();
        return this.bq;
    }

    public ca ae(boolean arg3) {
        if(!arg3 && ca.ar.length < this.aq) {
            ca.ar = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ae, ca.ar);
    }

    public void af(bf arg18, int arg19, bf arg20, int arg21, int[] arg22) {
        int v0 = arg19;
        int v1 = arg21;
        int v2 = -1;
        if(v0 == v2) {
            return;
        }

        if(arg22 != null) {
            if(v1 == v2) {
            }
            else {
                ba v0_1 = arg18.ax[v0];
                ba v1_1 = arg20.ax[v1];
                bu v2_1 = v0_1.an;
                int v3 = 0;
                ca.be = 0;
                ca.bl = 0;
                ca.br = 0;
                int v5 = 1;
                int v7 = arg22[0];
                int v4 = 0;
                int v6 = 1;
                while(v4 < v0_1.ap) {
                    int v8 = v0_1.aj[v4];
                    while(v8 > v7) {
                        v7 = arg22[v6];
                        ++v6;
                    }

                    if(v8 != v7 || v2_1.ae[v8] == 0) {
                        this.ai(v2_1.ae[v8], v2_1.ar[v8], v0_1.ad[v4], v0_1.aq[v4], v0_1.ab[v4]);
                    }

                    ++v4;
                }

                ca.be = 0;
                ca.bl = 0;
                ca.br = 0;
                v0 = arg22[0];
                while(v3 < v1_1.ap) {
                    v4 = v1_1.aj[v3];
                    while(v4 > v0) {
                        int v16 = arg22[v5];
                        ++v5;
                        v0 = v16;
                    }

                    if(v4 == v0 || v2_1.ae[v4] == 0) {
                        this.ai(v2_1.ae[v4], v2_1.ar[v4], v1_1.ad[v3], v1_1.aq[v3], v1_1.ab[v3]);
                    }

                    ++v3;
                }

                this.aq();
                return;
            }
        }

        this.ab(arg18, arg19);
    }

    public void ag(int arg4, int arg5, int arg6) {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] = this.ap[v0] * arg4 / 0x80;
            this.aj[v0] = this.aj[v0] * arg5 / 0x80;
            this.ad[v0] = this.ad[v0] * arg6 / 0x80;
        }

        this.aq();
    }

    public ca ah(int[][] arg16, int arg17, int arg18, int arg19, boolean arg20, int arg21) {
        int v8;
        int v11;
        int v10;
        ca v4_1;
        ca v0 = this;
        int[][] v1 = arg16;
        int v2 = arg18;
        int v3 = arg21;
        this.ap();
        int v4 = arg17 - v0.bq;
        int v5 = arg17 + v0.bq;
        int v6 = arg19 - v0.bq;
        int v7 = arg19 + v0.bq;
        if(v4 >= 0 && v5 + 0x80 >> 7 < v1.length && v6 >= 0) {
            int v9 = 0;
            if(0x80A12B89 + v7 >> 7 >= v1[0].length) {
            }
            else {
                v4 >>= 7;
                v5 = v5 + 2090815893 >> 7;
                v6 >>= 7;
                v7 = v7 + 0x33670381 >> 7;
                if(v1[v4][v6] == v2 && v1[v5][v6] == v2 && v1[v4][v7] == v2 && v1[v5][v7] == v2) {
                    return v0;
                }

                if(arg20) {
                    v4_1 = new ca();
                    v4_1.an = v0.an;
                    v4_1.aq = v0.aq;
                    v4_1.ay = v0.ay;
                    v4_1.ap = v0.ap;
                    v4_1.ad = v0.ad;
                    v4_1.ab = v0.ab;
                    v4_1.af = v0.af;
                    v4_1.ai = v0.ai;
                    v4_1.av = v0.av;
                    v4_1.aa = v0.aa;
                    v4_1.au = v0.au;
                    v4_1.am = v0.am;
                    v4_1.az = v0.az;
                    v4_1.ag = v0.ag;
                    v4_1.ah = v0.ah;
                    v4_1.at = v0.at;
                    v4_1.aw = v0.aw;
                    v4_1.ao = v0.ao;
                    v4_1.as = v0.as;
                    v4_1.ak = v0.ak;
                    v4_1.ac = v0.ac;
                    v4_1.bd = v0.bd;
                    v4_1.ba = v0.ba;
                    v4_1.bf = v0.bf;
                    v4_1.aj = new int[v4_1.an];
                }
                else {
                    v4_1 = v0;
                }

                if(v3 == 0) {
                    while(v9 < v4_1.an) {
                        v3 = v0.ap[v9] + arg17;
                        v5 = v0.ad[v9] + arg19;
                        v6 = -359041530 & v3;
                        v7 = 0x20A93157 & v5;
                        v3 >>= 7;
                        v5 >>= 7;
                        v10 = 0x80 - v6;
                        v11 = v3 + 1;
                        v8 = v1[v3][v5] * v10 + v1[v11][v5] * v6 >> 7;
                        ++v5;
                        v4_1.aj[v9] = v0.aj[v9] + (v8 * (-656049870 - v7) + (v1[v3][v5] * v10 + v1[v11][v5] * v6 >> 7) * v7 >> 7) - v2;
                        ++v9;
                    }
                }
                else {
                    while(v9 < v4_1.an) {
                        v5 = (-v0.aj[v9] << 16) / (v0.bh * 0xCD6CEDE3);
                        if(v5 < v3) {
                            v6 = v0.ap[v9] + arg17;
                            v7 = v0.ad[v9] + arg19;
                            v8 = -2070456646 & v6;
                            v10 = 174900058 & v7;
                            v6 >>= 7;
                            v7 >>= 7;
                            int v12 = 0x80 - v8;
                            int v13 = v6 + 1;
                            v11 = v1[v6][v7] * v12 + v1[v13][v7] * v8 >> 7;
                            ++v7;
                            v4_1.aj[v9] = v0.aj[v9] + ((v11 * (0x919EA754 - v10) + (v1[v6][v7] * v12 + v1[v13][v7] * v8 >> 7) * v10 >> 7) - v2) * (v3 - v5) / v3;
                        }

                        ++v9;
                    }
                }

                v4_1.aq();
                return v4_1;
            }
        }

        return v0;
    }

    void ai(int arg19, int[] arg20, int arg21, int arg22, int arg23) {
        int[] v17;
        int v7;
        int[] v8_1;
        int v11;
        int v10;
        int v9;
        int v8;
        ca v0 = this;
        int v1 = arg19;
        int[] v2 = arg20;
        int v3 = arg21;
        int v4 = arg22;
        int v5 = arg23;
        int v6 = v2.length;
        if(v1 == 0) {
            ca.be = 0;
            ca.bl = 0;
            ca.br = 0;
            v1 = 0;
            v8 = 0;
            while(v1 < v6) {
                v9 = v2[v1];
                if(v9 < v0.ak.length) {
                    int[] v9_1 = v0.ak[v9];
                    v10 = v8;
                    for(v8 = 0; v8 < v9_1.length; ++v8) {
                        v11 = v9_1[v8];
                        ca.be += v0.ap[v11];
                        ca.bl += v0.aj[v11];
                        ca.br += v0.ad[v11];
                        ++v10;
                    }

                    v8 = v10;
                }

                ++v1;
            }

            if(v8 > 0) {
                ca.be = ca.be / v8 + v3;
                ca.bl = ca.bl / v8 + v4;
                ca.br = ca.br / v8 + v5;
            }
            else {
                ca.be = v3;
                ca.bl = v4;
                ca.br = v5;
            }

            return;
        }

        if(v1 == 1) {
            for(v1 = 0; v1 < v6; ++v1) {
                v8 = v2[v1];
                if(v8 < v0.ak.length) {
                    v8_1 = v0.ak[v8];
                    for(v9 = 0; v9 < v8_1.length; ++v9) {
                        v10 = v8_1[v9];
                        v0.ap[v10] += v3;
                        v0.aj[v10] += v4;
                        v0.ad[v10] += v5;
                    }
                }
            }

            return;
        }

        if(v1 == 2) {
            for(v1 = 0; v1 < v6; ++v1) {
                v8 = v2[v1];
                if(v8 < v0.ak.length) {
                    v8_1 = v0.ak[v8];
                    v10 = 0;
                    while(v10 < v8_1.length) {
                        v11 = v8_1[v10];
                        v0.ap[v11] -= ca.be;
                        v0.aj[v11] -= ca.bl;
                        v0.ad[v11] -= ca.br;
                        int v12 = (v3 & 0xFF) * 8;
                        int v13 = (v4 & 0xFF) * 8;
                        int v14 = (v5 & 0xFF) * 8;
                        if(v14 != 0) {
                            int v15 = ca.bu[v14];
                            v14 = ca.bs[v14];
                            v7 = v0.aj[v11] * v15 + v0.ap[v11] * v14 >> 16;
                            v17 = v8_1;
                            v0.aj[v11] = v0.aj[v11] * v14 - v0.ap[v11] * v15 >> 16;
                            v0.ap[v11] = v7;
                        }
                        else {
                            v17 = v8_1;
                        }

                        if(v12 != 0) {
                            v7 = ca.bu[v12];
                            v8 = ca.bs[v12];
                            v9 = v0.aj[v11] * v8 - v0.ad[v11] * v7 >> 16;
                            v0.ad[v11] = v0.aj[v11] * v7 + v0.ad[v11] * v8 >> 16;
                            v0.aj[v11] = v9;
                        }

                        if(v13 != 0) {
                            v7 = ca.bu[v13];
                            v8 = ca.bs[v13];
                            v9 = v0.ad[v11] * v7 + v0.ap[v11] * v8 >> 16;
                            v0.ad[v11] = v0.ad[v11] * v8 - v0.ap[v11] * v7 >> 16;
                            v0.ap[v11] = v9;
                        }

                        v0.ap[v11] += ca.be;
                        v0.aj[v11] += ca.bl;
                        v0.ad[v11] += ca.br;
                        ++v10;
                        v8_1 = v17;
                    }
                }
            }

            return;
        }

        if(v1 == 3) {
            for(v1 = 0; v1 < v6; ++v1) {
                v7 = v2[v1];
                if(v7 < v0.ak.length) {
                    int[] v7_1 = v0.ak[v7];
                    for(v8 = 0; v8 < v7_1.length; ++v8) {
                        v9 = v7_1[v8];
                        v0.ap[v9] -= ca.be;
                        v0.aj[v9] -= ca.bl;
                        v0.ad[v9] -= ca.br;
                        v0.ap[v9] = v0.ap[v9] * v3 / 0x80;
                        v0.aj[v9] = v0.aj[v9] * v4 / 0x80;
                        v0.ad[v9] = v0.ad[v9] * v5 / 0x80;
                        v0.ap[v9] += ca.be;
                        v0.aj[v9] += ca.bl;
                        v0.ad[v9] += ca.br;
                    }
                }
            }

            return;
        }

        if(v1 == 5) {
            if(v0.ac != null && v0.az != null) {
                for(v1 = 0; v1 < v6; ++v1) {
                    v4 = v2[v1];
                    if(v4 < v0.ac.length) {
                        int[] v4_1 = v0.ac[v4];
                        for(v5 = 0; v5 < v4_1.length; ++v5) {
                            v7 = v4_1[v5];
                            v9 = 0xFF;
                            v8 = (v0.az[v7] & v9) + v3 * 8;
                            if(v8 < 0) {
                                v8 = 0;
                            }
                            else if(v8 > v9) {
                                v8 = 0xFF;
                            }

                            v0.az[v7] = ((byte)v8);
                        }
                    }
                }
            }

            return;
        }
    }

    void aj() {
        int v1 = 2;
        if(this.bt == v1) {
            return;
        }

        this.bt = v1;
        int v0 = 0;
        this.bq = 0;
        while(v0 < this.an) {
            v1 = this.ap[v0] * this.ap[v0] + this.ad[v0] * this.ad[v0] + this.aj[v0] * this.aj[v0];
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = this.bq;
        this.bx = this.bq + this.bq;
    }

    public ca ak(boolean arg3) {
        if(!arg3 && ca.al.length < this.aq) {
            ca.al = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ax, ca.al);
    }

    public ca al(boolean arg3) {
        if(!arg3 && ca.al.length < this.aq) {
            ca.al = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ax, ca.al);
    }

    public void am(int arg7) {
        int v0 = ca.bu[arg7];
        arg7 = ca.bs[arg7];
        int v1;
        for(v1 = 0; v1 < this.an; ++v1) {
            int v2 = this.aj[v1] * arg7 - this.ad[v1] * v0 >> 16;
            this.ad[v1] = this.aj[v1] * v0 + this.ad[v1] * arg7 >> 16;
            this.aj[v1] = v2;
        }

        this.aq();
    }

    void an(int arg14) {
        if(this.bk != -1) {
            return;
        }

        int v0 = ca.bs[arg14];
        arg14 = ca.bu[arg14];
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0;
        while(v2 < this.an) {
            int v9 = ah.bb(this.ap[v2], this.ad[v2], v0, arg14, 0x1A805FE3);
            int v10 = this.aj[v2];
            int v11 = cy.bc(this.ap[v2], this.ad[v2], v0, arg14, 0);
            if(v9 < v4) {
                v4 = v9;
            }

            if(v9 > v3) {
                v3 = v9;
            }

            if(v10 < v6) {
                v6 = v10;
            }

            if(v10 > v5) {
                v5 = v10;
            }

            if(v11 < v8) {
                v8 = v11;
            }

            if(v11 > v7) {
                v7 = v11;
            }

            ++v2;
        }

        this.bz = (v3 + v4) / 2;
        this.bb = (v5 + v6) / 2;
        this.bc = (v7 + v8) / 2;
        this.bk = (v3 - v4 + 1) / 2;
        this.bm = (v5 - v6 + 1) / 2;
        this.bj = (v7 - v8 + 1) / 2;
        v0 = 0x20;
        if(this.bk < v0) {
            this.bk = v0;
        }

        if(this.bj < v0) {
            this.bj = v0;
        }

        if(this.bf) {
            this.bk += 8;
            this.bj += 8;
        }
    }

    public ca ao(boolean arg3) {
        if(!arg3 && ca.al.length < this.aq) {
            ca.al = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ax, ca.al);
    }

    public void ap() {
        int v2;
        if(this.bt == 1) {
            return;
        }

        this.bt = 1;
        int v0 = 0;
        this.bh = 0;
        this.bv = 0;
        this.bq = 0;
        while(true) {
            v2 = 0xCD6CEDE3;
            if(v0 >= this.an) {
                break;
            }

            int v1 = this.ap[v0];
            int v3 = this.aj[v0];
            int v4 = this.ad[v0];
            int v5 = -v3;
            if(v5 > this.bh * v2) {
                this.bh = v5 * 0x1FC1BFCB;
            }

            if(v3 > this.bv) {
                this.bv = v3;
            }

            v1 = v1 * v1 + v4 * v4;
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = ((int)(Math.sqrt(((double)(this.bq * this.bq + this.bh * v2 * (this.bh * v2)))) + 0.99));
        this.bx = this.bg + (((int)(Math.sqrt(((double)(this.bq * this.bq + this.bv * this.bv))) + 0.99)));
    }

    void aq() {
        this.bt = 0;
        this.bk = -1;
        this.bw = true;
    }

    ca ar(boolean arg5, ca arg6, byte[] arg7) {
        int v5;
        arg6.an = this.an;
        arg6.aq = this.aq;
        arg6.ay = this.ay;
        if(arg6.ap == null || arg6.ap.length < this.an) {
            arg6.ap = new int[this.an + 100];
            arg6.aj = new int[this.an + 100];
            arg6.ad = new int[this.an + 100];
        }

        int v0 = 0;
        int v1;
        for(v1 = 0; v1 < this.an; ++v1) {
            arg6.ap[v1] = this.ap[v1];
            arg6.aj[v1] = this.aj[v1];
            arg6.ad[v1] = this.ad[v1];
        }

        if(arg5) {
            arg6.az = this.az;
        }
        else {
            arg6.az = arg7;
            if(this.az == null) {
                v5 = 0;
                while(true) {
                    if(v5 < this.aq) {
                        arg6.az[v5] = 0;
                        ++v5;
                        continue;
                    }
                    else {
                        goto label_64;
                    }
                }
            }

            while(v0 < this.aq) {
                arg6.az[v0] = this.az[v0];
                ++v0;
            }
        }

    label_64:
        arg6.ab = this.ab;
        arg6.af = this.af;
        arg6.ai = this.ai;
        arg6.av = this.av;
        arg6.aa = this.aa;
        arg6.au = this.au;
        arg6.am = this.am;
        arg6.ag = this.ag;
        arg6.ah = this.ah;
        arg6.at = this.at;
        arg6.aw = this.aw;
        arg6.ao = this.ao;
        arg6.as = this.as;
        arg6.ak = this.ak;
        arg6.ac = this.ac;
        arg6.bd = this.bd;
        arg6.ba = this.ba;
        arg6.bf = this.bf;
        v5 = ca.bn;
        ca.bn = v5 + 1;
        arg6.bp = v5;
        arg6.by = true;
        arg6.aq();
        return arg6;
    }

    protected final ca as() {
        return this;
    }

    public ca at(int[][] arg16, int arg17, int arg18, int arg19, boolean arg20, int arg21) {
        int v8;
        int v11;
        int v10;
        ca v4_1;
        ca v0 = this;
        int[][] v1 = arg16;
        int v2 = arg18;
        int v3 = arg21;
        this.ap();
        int v4 = arg17 - v0.bq;
        int v5 = arg17 + v0.bq;
        int v6 = arg19 - v0.bq;
        int v7 = arg19 + v0.bq;
        if(v4 >= 0 && v5 + 0x80 >> 7 < v1.length && v6 >= 0) {
            int v9 = 0;
            if(v7 + 0x80 >> 7 >= v1[0].length) {
            }
            else {
                v4 >>= 7;
                v5 = v5 + 0x7F >> 7;
                v6 >>= 7;
                v7 = v7 + 0x7F >> 7;
                if(v1[v4][v6] == v2 && v1[v5][v6] == v2 && v1[v4][v7] == v2 && v1[v5][v7] == v2) {
                    return v0;
                }

                if(arg20) {
                    v4_1 = new ca();
                    v4_1.an = v0.an;
                    v4_1.aq = v0.aq;
                    v4_1.ay = v0.ay;
                    v4_1.ap = v0.ap;
                    v4_1.ad = v0.ad;
                    v4_1.ab = v0.ab;
                    v4_1.af = v0.af;
                    v4_1.ai = v0.ai;
                    v4_1.av = v0.av;
                    v4_1.aa = v0.aa;
                    v4_1.au = v0.au;
                    v4_1.am = v0.am;
                    v4_1.az = v0.az;
                    v4_1.ag = v0.ag;
                    v4_1.ah = v0.ah;
                    v4_1.at = v0.at;
                    v4_1.aw = v0.aw;
                    v4_1.ao = v0.ao;
                    v4_1.as = v0.as;
                    v4_1.ak = v0.ak;
                    v4_1.ac = v0.ac;
                    v4_1.bd = v0.bd;
                    v4_1.ba = v0.ba;
                    v4_1.bf = v0.bf;
                    ((ca)v4).aj = new int[((ca)v4).an];
                }
                else {
                    v4_1 = v0;
                }

                if(v3 == 0) {
                    while(v9 < v4_1.an) {
                        v3 = v0.ap[v9] + arg17;
                        v5 = v0.ad[v9] + arg19;
                        v6 = v3 & 0x7F;
                        v7 = v5 & 0x7F;
                        v3 >>= 7;
                        v5 >>= 7;
                        v10 = 0x80 - v6;
                        v11 = v3 + 1;
                        v8 = v1[v3][v5] * v10 + v1[v11][v5] * v6 >> 7;
                        ++v5;
                        v4_1.aj[v9] = v0.aj[v9] + (v8 * (0x80 - v7) + (v1[v3][v5] * v10 + v1[v11][v5] * v6 >> 7) * v7 >> 7) - v2;
                        ++v9;
                    }
                }
                else {
                    while(v9 < v4_1.an) {
                        v5 = (-v0.aj[v9] << 16) / (v0.bh * 0xCD6CEDE3);
                        if(v5 < v3) {
                            v6 = v0.ap[v9] + arg17;
                            v7 = v0.ad[v9] + arg19;
                            v8 = v6 & 0x7F;
                            v10 = v7 & 0x7F;
                            v6 >>= 7;
                            v7 >>= 7;
                            int v12 = 0x80 - v8;
                            int v13 = v6 + 1;
                            v11 = v1[v6][v7] * v12 + v1[v13][v7] * v8 >> 7;
                            ++v7;
                            v4_1.aj[v9] = v0.aj[v9] + ((v11 * (0x80 - v10) + (v1[v6][v7] * v12 + v1[v13][v7] * v8 >> 7) * v10 >> 7) - v2) * (v3 - v5) / v3;
                        }

                        ++v9;
                    }
                }

                v4_1.aq();
                return v4_1;
            }
        }

        return v0;
    }

    public void au() {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            int v1 = this.ad[v0];
            this.ad[v0] = this.ap[v0];
            this.ap[v0] = -v1;
        }

        this.aq();
    }

    public void av() {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            int v1 = this.ap[v0];
            this.ap[v0] = this.ad[v0];
            this.ad[v0] = -v1;
        }

        this.aq();
    }

    public ca aw(boolean arg3) {
        if(!arg3 && ca.al.length < this.aq) {
            ca.al = new byte[this.aq + 0x189A0E5B];
        }

        return this.ar(arg3, ca.ax, ca.al);
    }

    public ca ax(int[][] arg16, int arg17, int arg18, int arg19, boolean arg20, int arg21) {
        int v8;
        int v11;
        int v10;
        ca v4_1;
        ca v0 = this;
        int[][] v1 = arg16;
        int v2 = arg18;
        int v3 = arg21;
        this.ap();
        int v4 = arg17 - v0.bq;
        int v5 = arg17 + v0.bq;
        int v6 = arg19 - v0.bq;
        int v7 = arg19 + v0.bq;
        if(v4 >= 0 && v5 + 0x80 >> 7 < v1.length && v6 >= 0) {
            int v9 = 0;
            if(v7 + 0x80 >> 7 >= v1[0].length) {
            }
            else {
                v4 >>= 7;
                v5 = v5 + 0x7F >> 7;
                v6 >>= 7;
                v7 = v7 + 0x7F >> 7;
                if(v1[v4][v6] == v2 && v1[v5][v6] == v2 && v1[v4][v7] == v2 && v1[v5][v7] == v2) {
                    return v0;
                }

                if(arg20) {
                    v4_1 = new ca();
                    v4_1.an = v0.an;
                    v4_1.aq = v0.aq;
                    v4_1.ay = v0.ay;
                    v4_1.ap = v0.ap;
                    v4_1.ad = v0.ad;
                    v4_1.ab = v0.ab;
                    v4_1.af = v0.af;
                    v4_1.ai = v0.ai;
                    v4_1.av = v0.av;
                    v4_1.aa = v0.aa;
                    v4_1.au = v0.au;
                    v4_1.am = v0.am;
                    v4_1.az = v0.az;
                    v4_1.ag = v0.ag;
                    v4_1.ah = v0.ah;
                    v4_1.at = v0.at;
                    v4_1.aw = v0.aw;
                    v4_1.ao = v0.ao;
                    v4_1.as = v0.as;
                    v4_1.ak = v0.ak;
                    v4_1.ac = v0.ac;
                    v4_1.bd = v0.bd;
                    v4_1.ba = v0.ba;
                    v4_1.bf = v0.bf;
                    v4_1.aj = new int[v4_1.an];
                }
                else {
                    v4_1 = v0;
                }

                if(v3 == 0) {
                    while(v9 < v4_1.an) {
                        v3 = v0.ap[v9] + arg17;
                        v5 = v0.ad[v9] + arg19;
                        v6 = v3 & 0x7F;
                        v7 = v5 & 0x7F;
                        v3 >>= 7;
                        v5 >>= 7;
                        v10 = 0x80 - v6;
                        v11 = v3 + 1;
                        v8 = v1[v3][v5] * v10 + v1[v11][v5] * v6 >> 7;
                        ++v5;
                        v4_1.aj[v9] = v0.aj[v9] + (v8 * (0x80 - v7) + (v1[v3][v5] * v10 + v1[v11][v5] * v6 >> 7) * v7 >> 7) - v2;
                        ++v9;
                    }
                }
                else {
                    while(v9 < v4_1.an) {
                        v5 = (-v0.aj[v9] << 16) / (v0.bh * 0xCD6CEDE3);
                        if(v5 < v3) {
                            v6 = v0.ap[v9] + arg17;
                            v7 = v0.ad[v9] + arg19;
                            v8 = v6 & 0x7F;
                            v10 = v7 & 0x7F;
                            v6 >>= 7;
                            v7 >>= 7;
                            int v12 = 0x80 - v8;
                            int v13 = v6 + 1;
                            v11 = v1[v6][v7] * v12 + v1[v13][v7] * v8 >> 7;
                            ++v7;
                            v4_1.aj[v9] = v0.aj[v9] + ((v11 * (0x80 - v10) + (v1[v6][v7] * v12 + v1[v13][v7] * v8 >> 7) * v10 >> 7) - v2) * (v3 - v5) / v3;
                        }

                        ++v9;
                    }
                }

                v4_1.aq();
                return v4_1;
            }
        }

        return v0;
    }

    public ca ay(int[][] arg16, int arg17, int arg18, int arg19, boolean arg20, int arg21) {
        int v8;
        int v11;
        int v10;
        ca v4_1;
        ca v0 = this;
        int[][] v1 = arg16;
        int v2 = arg18;
        int v3 = arg21;
        this.ap();
        int v4 = arg17 - v0.bq;
        int v5 = arg17 + v0.bq;
        int v6 = arg19 - v0.bq;
        int v7 = arg19 + v0.bq;
        if(v4 >= 0 && v5 + 0x80 >> 7 < v1.length && v6 >= 0) {
            int v9 = 0;
            if(v7 + 0x80 >> 7 >= v1[0].length) {
            }
            else {
                v4 >>= 7;
                v5 = v5 + 0x7F >> 7;
                v6 >>= 7;
                v7 = v7 + 0x7F >> 7;
                if(v1[v4][v6] == v2 && v1[v5][v6] == v2 && v1[v4][v7] == v2 && v1[v5][v7] == v2) {
                    return v0;
                }

                if(arg20) {
                    v4_1 = new ca();
                    v4_1.an = v0.an;
                    v4_1.aq = v0.aq;
                    v4_1.ay = v0.ay;
                    v4_1.ap = v0.ap;
                    v4_1.ad = v0.ad;
                    v4_1.ab = v0.ab;
                    v4_1.af = v0.af;
                    v4_1.ai = v0.ai;
                    v4_1.av = v0.av;
                    v4_1.aa = v0.aa;
                    v4_1.au = v0.au;
                    v4_1.am = v0.am;
                    v4_1.az = v0.az;
                    v4_1.ag = v0.ag;
                    v4_1.ah = v0.ah;
                    v4_1.at = v0.at;
                    v4_1.aw = v0.aw;
                    v4_1.ao = v0.ao;
                    v4_1.as = v0.as;
                    v4_1.ak = v0.ak;
                    v4_1.ac = v0.ac;
                    v4_1.bd = v0.bd;
                    v4_1.ba = v0.ba;
                    v4_1.bf = v0.bf;
                    v4_1.aj = new int[v4_1.an];
                }
                else {
                    v4_1 = v0;
                }

                if(v3 == 0) {
                    while(v9 < v4_1.an) {
                        v3 = v0.ap[v9] + arg17;
                        v5 = v0.ad[v9] + arg19;
                        v6 = v3 & 0x7F;
                        v7 = v5 & 0x7F;
                        v3 >>= 7;
                        v5 >>= 7;
                        v10 = 0x80 - v6;
                        v11 = v3 + 1;
                        v8 = v1[v3][v5] * v10 + v1[v11][v5] * v6 >> 7;
                        ++v5;
                        v4_1.aj[v9] = v0.aj[v9] + (v8 * (0x80 - v7) + (v1[v3][v5] * v10 + v1[v11][v5] * v6 >> 7) * v7 >> 7) - v2;
                        ++v9;
                    }
                }
                else {
                    while(v9 < v4_1.an) {
                        v5 = (-v0.aj[v9] << 16) / (v0.bh * 0xCD6CEDE3);
                        if(v5 < v3) {
                            v6 = v0.ap[v9] + arg17;
                            v7 = v0.ad[v9] + arg19;
                            v8 = v6 & 0x7F;
                            v10 = v7 & 0x7F;
                            v6 >>= 7;
                            v7 >>= 7;
                            int v12 = 0x80 - v8;
                            int v13 = v6 + 1;
                            v11 = v1[v6][v7] * v12 + v1[v13][v7] * v8 >> 7;
                            ++v7;
                            v4_1.aj[v9] = v0.aj[v9] + ((v11 * (0x80 - v10) + (v1[v6][v7] * v12 + v1[v13][v7] * v8 >> 7) * v10 >> 7) - v2) * (v3 - v5) / v3;
                        }

                        ++v9;
                    }
                }

                v4_1.aq();
                return v4_1;
            }
        }

        return v0;
    }

    public void az(int arg4, int arg5, int arg6) {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] += arg4;
            this.aj[v0] += arg5;
            this.ad[v0] += arg6;
        }

        this.aq();
    }

    public ca ba(boolean arg3) {
        if(!arg3 && ca.ar.length < this.aq) {
            ca.ar = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ae, ca.ar);
    }

    public void bb(bf arg10, int arg11) {
        if(this.ak == null) {
            return;
        }

        if(arg11 == -1) {
            return;
        }

        ba v10 = arg10.ax[arg11];
        bu v11 = v10.an;
        int v0 = 0;
        ca.be = 0;
        ca.bl = 0;
        ca.br = 0;
        int v1 = 0;
        while(v1 < v10.ap) {
            if(v11.ae[v10.aj[v1]] == 5) {
            }
            else {
                ++v1;
                continue;
            }

            break;
        }

        while(v0 < v10.ap) {
            this.ai(v11.ae[v10.aj[v0]], v11.ar[v10.aj[v0]], v10.ad[v0], v10.aq[v0], v10.ab[v0]);
            ++v0;
        }

        this.aq();
    }

    public void bc(bf arg18, int arg19, bf arg20, int arg21, int[] arg22) {
        int v0 = arg19;
        int v1 = arg21;
        int v2 = -1;
        if(v0 == v2) {
            return;
        }

        if(arg22 != null) {
            if(v1 == v2) {
            }
            else {
                ba v0_1 = arg18.ax[v0];
                ba v1_1 = arg20.ax[v1];
                bu v2_1 = v0_1.an;
                int v3 = 0;
                ca.be = 0;
                ca.bl = 0;
                ca.br = 0;
                int v5 = 1;
                int v7 = arg22[0];
                int v4 = 0;
                int v6 = 1;
                while(v4 < v0_1.ap) {
                    int v8 = v0_1.aj[v4];
                    while(v8 > v7) {
                        v7 = arg22[v6];
                        ++v6;
                    }

                    if(v8 != v7 || v2_1.ae[v8] == 0) {
                        this.ai(v2_1.ae[v8], v2_1.ar[v8], v0_1.ad[v4], v0_1.aq[v4], v0_1.ab[v4]);
                    }

                    ++v4;
                }

                ca.be = 0;
                ca.bl = 0;
                ca.br = 0;
                v0 = arg22[0];
                while(v3 < v1_1.ap) {
                    v4 = v1_1.aj[v3];
                    while(v4 > v0) {
                        int v16 = arg22[v5];
                        ++v5;
                        v0 = v16;
                    }

                    if(v4 == v0 || v2_1.ae[v4] == 0) {
                        this.ai(v2_1.ae[v4], v2_1.ar[v4], v1_1.ad[v3], v1_1.aq[v3], v1_1.ab[v3]);
                    }

                    ++v3;
                }

                this.aq();
                return;
            }
        }

        this.ab(arg18, arg19);
    }

    public ca bd(boolean arg3) {
        if(!arg3 && ca.ar.length < this.aq) {
            ca.ar = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ae, ca.ar);
    }

    public void be() {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            int v1 = this.ap[v0];
            this.ap[v0] = this.ad[v0];
            this.ad[v0] = -v1;
        }

        this.aq();
    }

    public ca bf(boolean arg3) {
        if(!arg3 && ca.ar.length < this.aq) {
            ca.ar = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ae, ca.ar);
    }

    public int bg() {
        this.ap();
        return this.bq;
    }

    void bh() {
        this.bt = 0;
        this.bk = -1;
        this.bw = true;
    }

    public void bi() {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] = -this.ap[v0];
            this.ad[v0] = -this.ad[v0];
        }

        this.aq();
    }

    void bj(int arg19, int[] arg20, int arg21, int arg22, int arg23) {
        int[] v17;
        int v7;
        int[] v8_1;
        int v11;
        int v10;
        int v9;
        int v8;
        ca v0 = this;
        int v1 = arg19;
        int[] v2 = arg20;
        int v3 = arg21;
        int v4 = arg22;
        int v5 = arg23;
        int v6 = v2.length;
        if(v1 == 0) {
            ca.be = 0;
            ca.bl = 0;
            ca.br = 0;
            v1 = 0;
            v8 = 0;
            while(v1 < v6) {
                v9 = v2[v1];
                if(v9 < v0.ak.length) {
                    int[] v9_1 = v0.ak[v9];
                    v10 = v8;
                    for(v8 = 0; v8 < v9_1.length; ++v8) {
                        v11 = v9_1[v8];
                        ca.be += v0.ap[v11];
                        ca.bl += v0.aj[v11];
                        ca.br += v0.ad[v11];
                        ++v10;
                    }

                    v8 = v10;
                }

                ++v1;
            }

            if(v8 > 0) {
                ca.be = ca.be / v8 + v3;
                ca.bl = ca.bl / v8 + v4;
                ca.br = ca.br / v8 + v5;
            }
            else {
                ca.be = v3;
                ca.bl = v4;
                ca.br = v5;
            }

            return;
        }

        if(v1 == 1) {
            for(v1 = 0; v1 < v6; ++v1) {
                v8 = v2[v1];
                if(v8 < v0.ak.length) {
                    v8_1 = v0.ak[v8];
                    for(v9 = 0; v9 < v8_1.length; ++v9) {
                        v10 = v8_1[v9];
                        v0.ap[v10] += v3;
                        v0.aj[v10] += v4;
                        v0.ad[v10] += v5;
                    }
                }
            }

            return;
        }

        if(v1 == 2) {
            for(v1 = 0; v1 < v6; ++v1) {
                v8 = v2[v1];
                if(v8 < v0.ak.length) {
                    v8_1 = v0.ak[v8];
                    v10 = 0;
                    while(v10 < v8_1.length) {
                        v11 = v8_1[v10];
                        v0.ap[v11] -= ca.be;
                        v0.aj[v11] -= ca.bl;
                        v0.ad[v11] -= ca.br;
                        int v12 = (v3 & 0xFF) * 8;
                        int v13 = (v4 & 0xFF) * 8;
                        int v14 = (v5 & 0xFF) * 8;
                        if(v14 != 0) {
                            int v15 = ca.bu[v14];
                            v14 = ca.bs[v14];
                            v7 = v0.aj[v11] * v15 + v0.ap[v11] * v14 >> 16;
                            v17 = v8_1;
                            v0.aj[v11] = v0.aj[v11] * v14 - v0.ap[v11] * v15 >> 16;
                            v0.ap[v11] = v7;
                        }
                        else {
                            v17 = v8_1;
                        }

                        if(v12 != 0) {
                            v7 = ca.bu[v12];
                            v8 = ca.bs[v12];
                            v9 = v0.aj[v11] * v8 - v0.ad[v11] * v7 >> 16;
                            v0.ad[v11] = v0.aj[v11] * v7 + v0.ad[v11] * v8 >> 16;
                            v0.aj[v11] = v9;
                        }

                        if(v13 != 0) {
                            v7 = ca.bu[v13];
                            v8 = ca.bs[v13];
                            v9 = v0.ad[v11] * v7 + v0.ap[v11] * v8 >> 16;
                            v0.ad[v11] = v0.ad[v11] * v8 - v0.ap[v11] * v7 >> 16;
                            v0.ap[v11] = v9;
                        }

                        v0.ap[v11] += ca.be;
                        v0.aj[v11] += ca.bl;
                        v0.ad[v11] += ca.br;
                        ++v10;
                        v8_1 = v17;
                    }
                }
            }

            return;
        }

        if(v1 == 3) {
            for(v1 = 0; v1 < v6; ++v1) {
                v7 = v2[v1];
                if(v7 < v0.ak.length) {
                    int[] v7_1 = v0.ak[v7];
                    for(v8 = 0; v8 < v7_1.length; ++v8) {
                        v9 = v7_1[v8];
                        v0.ap[v9] -= ca.be;
                        v0.aj[v9] -= ca.bl;
                        v0.ad[v9] -= ca.br;
                        v0.ap[v9] = v0.ap[v9] * v3 / 423034301;
                        v0.aj[v9] = v0.aj[v9] * v4 / 0xFAB863B7;
                        v0.ad[v9] = v0.ad[v9] * v5 / 0x80;
                        v0.ap[v9] += ca.be;
                        v0.aj[v9] += ca.bl;
                        v0.ad[v9] += ca.br;
                    }
                }
            }

            return;
        }

        if(v1 == 5) {
            if(v0.ac != null && v0.az != null) {
                for(v1 = 0; v1 < v6; ++v1) {
                    v4 = v2[v1];
                    if(v4 < v0.ac.length) {
                        int[] v4_1 = v0.ac[v4];
                        for(v5 = 0; v5 < v4_1.length; ++v5) {
                            v7 = v4_1[v5];
                            v9 = 0xFF;
                            v8 = (v0.az[v7] & v9) + v3 * 8;
                            if(v8 < 0) {
                                v8 = 0;
                            }
                            else if(v8 > v9) {
                                v8 = 0x407A8E0A;
                            }

                            v0.az[v7] = ((byte)v8);
                        }
                    }
                }
            }

            return;
        }
    }

    public void bk(bf arg18, int arg19, bf arg20, int arg21, int[] arg22) {
        int v0 = arg19;
        int v1 = arg21;
        int v2 = -1;
        if(v0 == v2) {
            return;
        }

        if(arg22 != null) {
            if(v1 == v2) {
            }
            else {
                ba v0_1 = arg18.ax[v0];
                ba v1_1 = arg20.ax[v1];
                bu v2_1 = v0_1.an;
                int v3 = 0;
                ca.be = 0;
                ca.bl = 0;
                ca.br = 0;
                int v5 = 1;
                int v7 = arg22[0];
                int v4 = 0;
                int v6 = 1;
                while(v4 < v0_1.ap) {
                    int v8 = v0_1.aj[v4];
                    while(v8 > v7) {
                        v7 = arg22[v6];
                        ++v6;
                    }

                    if(v8 != v7 || v2_1.ae[v8] == 0) {
                        this.ai(v2_1.ae[v8], v2_1.ar[v8], v0_1.ad[v4], v0_1.aq[v4], v0_1.ab[v4]);
                    }

                    ++v4;
                }

                ca.be = 0;
                ca.bl = 0;
                ca.br = 0;
                v0 = arg22[0];
                while(v3 < v1_1.ap) {
                    v4 = v1_1.aj[v3];
                    while(v4 > v0) {
                        int v16 = arg22[v5];
                        ++v5;
                        v0 = v16;
                    }

                    if(v4 == v0 || v2_1.ae[v4] == 0) {
                        this.ai(v2_1.ae[v4], v2_1.ar[v4], v1_1.ad[v3], v1_1.aq[v3], v1_1.ab[v3]);
                    }

                    ++v3;
                }

                this.aq();
                return;
            }
        }

        this.ab(arg18, arg19);
    }

    public void bl() {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] = -this.ap[v0];
            this.ad[v0] = -this.ad[v0];
        }

        this.aq();
    }

    public void bm(bf arg18, int arg19, bf arg20, int arg21, int[] arg22) {
        int v0 = arg19;
        int v1 = arg21;
        int v2 = -1;
        if(v0 == v2) {
            return;
        }

        if(arg22 != null) {
            if(v1 == v2) {
            }
            else {
                ba v0_1 = arg18.ax[v0];
                ba v1_1 = arg20.ax[v1];
                bu v2_1 = v0_1.an;
                int v3 = 0;
                ca.be = 0;
                ca.bl = 0;
                ca.br = 0;
                int v5 = 1;
                int v7 = arg22[0];
                int v4 = 0;
                int v6 = 1;
                while(v4 < v0_1.ap) {
                    int v8 = v0_1.aj[v4];
                    while(v8 > v7) {
                        v7 = arg22[v6];
                        ++v6;
                    }

                    if(v8 != v7 || v2_1.ae[v8] == 0) {
                        this.ai(v2_1.ae[v8], v2_1.ar[v8], v0_1.ad[v4], v0_1.aq[v4], v0_1.ab[v4]);
                    }

                    ++v4;
                }

                ca.be = 0;
                ca.bl = 0;
                ca.br = 0;
                v0 = arg22[0];
                while(v3 < v1_1.ap) {
                    v4 = v1_1.aj[v3];
                    while(v4 > v0) {
                        int v16 = arg22[v5];
                        ++v5;
                        v0 = v16;
                    }

                    if(v4 == v0 || v2_1.ae[v4] == 0) {
                        this.ai(v2_1.ae[v4], v2_1.ar[v4], v1_1.ad[v3], v1_1.aq[v3], v1_1.ab[v3]);
                    }

                    ++v3;
                }

                this.aq();
                return;
            }
        }

        this.ab(arg18, arg19);
    }

    public ca bn(boolean arg3) {
        if(!arg3 && ca.ar.length < this.aq) {
            ca.ar = new byte[this.aq + 100];
        }

        return this.ar(arg3, ca.ae, ca.ar);
    }

    public void bo() {
        int v2;
        if(this.bt == 1) {
            return;
        }

        this.bt = 1;
        int v0 = 0;
        this.bh = 0;
        this.bv = 0;
        this.bq = 0;
        while(true) {
            v2 = 0xCD6CEDE3;
            if(v0 >= this.an) {
                break;
            }

            int v1 = this.ap[v0];
            int v3 = this.aj[v0];
            int v4 = this.ad[v0];
            int v5 = -v3;
            if(v5 > this.bh * v2) {
                this.bh = v5 * 0x1FC1BFCB;
            }

            if(v3 > this.bv) {
                this.bv = v3;
            }

            v1 = v1 * v1 + v4 * v4;
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = ((int)(Math.sqrt(((double)(this.bq * this.bq + this.bh * 0xA3FE82B9 * (this.bh * v2)))) + 0.99));
        this.bx = this.bg + (((int)(Math.sqrt(((double)(this.bq * this.bq + this.bv * this.bv))) + 0.99)));
    }

    ca bp(boolean arg5, ca arg6, byte[] arg7) {
        int v5;
        arg6.an = this.an;
        arg6.aq = this.aq;
        arg6.ay = this.ay;
        if(arg6.ap == null || arg6.ap.length < this.an) {
            arg6.ap = new int[this.an + 100];
            arg6.aj = new int[this.an + 100];
            arg6.ad = new int[this.an + 100];
        }

        int v0 = 0;
        int v1;
        for(v1 = 0; v1 < this.an; ++v1) {
            arg6.ap[v1] = this.ap[v1];
            arg6.aj[v1] = this.aj[v1];
            arg6.ad[v1] = this.ad[v1];
        }

        if(arg5) {
            arg6.az = this.az;
        }
        else {
            arg6.az = arg7;
            if(this.az == null) {
                v5 = 0;
                while(true) {
                    if(v5 < this.aq) {
                        arg6.az[v5] = 0;
                        ++v5;
                        continue;
                    }
                    else {
                        goto label_64;
                    }
                }
            }

            while(v0 < this.aq) {
                arg6.az[v0] = this.az[v0];
                ++v0;
            }
        }

    label_64:
        arg6.ab = this.ab;
        arg6.af = this.af;
        arg6.ai = this.ai;
        arg6.av = this.av;
        arg6.aa = this.aa;
        arg6.au = this.au;
        arg6.am = this.am;
        arg6.ag = this.ag;
        arg6.ah = this.ah;
        arg6.at = this.at;
        arg6.aw = this.aw;
        arg6.ao = this.ao;
        arg6.as = this.as;
        arg6.ak = this.ak;
        arg6.ac = this.ac;
        arg6.bd = this.bd;
        arg6.ba = this.ba;
        arg6.bf = this.bf;
        v5 = ca.bn;
        ca.bn = v5 + 1;
        arg6.bp = v5;
        arg6.by = true;
        arg6.aq();
        return arg6;
    }

    void bq() {
        int v1 = 2;
        if(this.bt == v1) {
            return;
        }

        this.bt = v1;
        int v0 = 0;
        this.bq = 0;
        while(v0 < this.an) {
            v1 = this.ap[v0] * this.ap[v0] + this.ad[v0] * this.ad[v0] + this.aj[v0] * this.aj[v0];
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = this.bq;
        this.bx = this.bq + this.bq;
    }

    public void br() {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] = -this.ap[v0];
            this.ad[v0] = -this.ad[v0];
        }

        this.aq();
    }

    void bs(int arg19, int[] arg20, int arg21, int arg22, int arg23) {
        int[] v17;
        int v7;
        int[] v8_1;
        int v11;
        int v10;
        int v9;
        int v8;
        ca v0 = this;
        int v1 = arg19;
        int[] v2 = arg20;
        int v3 = arg21;
        int v4 = arg22;
        int v6 = v2.length;
        if(v1 == 0) {
            ca.be = 0;
            ca.bl = 0;
            ca.br = 0;
            v1 = 0;
            v8 = 0;
            while(v1 < v6) {
                v9 = v2[v1];
                if(v9 < v0.ak.length) {
                    int[] v9_1 = v0.ak[v9];
                    v10 = v8;
                    for(v8 = 0; v8 < v9_1.length; ++v8) {
                        v11 = v9_1[v8];
                        ca.be += v0.ap[v11];
                        ca.bl += v0.aj[v11];
                        ca.br += v0.ad[v11];
                        ++v10;
                    }

                    v8 = v10;
                }

                ++v1;
            }

            if(v8 > 0) {
                ca.be = ca.be / v8 + v3;
                ca.bl = ca.bl / v8 + v4;
                ca.br = ca.br / v8 + arg23;
            }
            else {
                ca.be = v3;
                ca.bl = v4;
                ca.br = arg23;
            }

            return;
        }

        if(v1 == 1) {
            for(v1 = 0; v1 < v6; ++v1) {
                v8 = v2[v1];
                if(v8 < v0.ak.length) {
                    v8_1 = v0.ak[v8];
                    for(v9 = 0; v9 < v8_1.length; ++v9) {
                        v10 = v8_1[v9];
                        v0.ap[v10] += v3;
                        v0.aj[v10] += v4;
                        v0.ad[v10] += arg23;
                    }
                }
            }

            return;
        }

        if(v1 == 2) {
            for(v1 = 0; v1 < v6; ++v1) {
                v8 = v2[v1];
                if(v8 < v0.ak.length) {
                    v8_1 = v0.ak[v8];
                    v10 = 0;
                    while(v10 < v8_1.length) {
                        v11 = v8_1[v10];
                        v0.ap[v11] -= ca.be;
                        v0.aj[v11] -= ca.bl;
                        v0.ad[v11] -= ca.br;
                        int v12 = (v3 & 0xFF) * 8;
                        int v13 = (v4 & 0xFF) * 8;
                        int v14 = (arg23 & 0x2808B201) * 8;
                        if(v14 != 0) {
                            int v15 = ca.bu[v14];
                            v14 = ca.bs[v14];
                            v7 = v0.aj[v11] * v15 + v0.ap[v11] * v14 >> 16;
                            v17 = v8_1;
                            v0.aj[v11] = v0.aj[v11] * v14 - v0.ap[v11] * v15 >> 16;
                            v0.ap[v11] = v7;
                        }
                        else {
                            v17 = v8_1;
                        }

                        if(v12 != 0) {
                            v7 = ca.bu[v12];
                            v8 = ca.bs[v12];
                            v9 = v0.aj[v11] * v8 - v0.ad[v11] * v7 >> 16;
                            v0.ad[v11] = v0.aj[v11] * v7 + v0.ad[v11] * v8 >> 16;
                            v0.aj[v11] = v9;
                        }

                        if(v13 != 0) {
                            v7 = ca.bu[v13];
                            v8 = ca.bs[v13];
                            v9 = v0.ad[v11] * v7 + v0.ap[v11] * v8 >> 16;
                            v0.ad[v11] = v0.ad[v11] * v8 - v0.ap[v11] * v7 >> 16;
                            v0.ap[v11] = v9;
                        }

                        v0.ap[v11] += ca.be;
                        v0.aj[v11] += ca.bl;
                        v0.ad[v11] += ca.br;
                        ++v10;
                        v8_1 = v17;
                    }
                }
            }

            return;
        }

        if(v1 == 3) {
            for(v1 = 0; v1 < v6; ++v1) {
                v7 = v2[v1];
                if(v7 < v0.ak.length) {
                    int[] v7_1 = v0.ak[v7];
                    for(v8 = 0; v8 < v7_1.length; ++v8) {
                        v9 = v7_1[v8];
                        v0.ap[v9] -= ca.be;
                        v0.aj[v9] -= ca.bl;
                        v0.ad[v9] -= ca.br;
                        v0.ap[v9] = v0.ap[v9] * v3 / 0x544EA20A;
                        v0.aj[v9] = v0.aj[v9] * v4 / 0x80;
                        v0.ad[v9] = v0.ad[v9] * arg23 / 0x80;
                        v0.ap[v9] += ca.be;
                        v0.aj[v9] += ca.bl;
                        v0.ad[v9] += ca.br;
                    }
                }
            }

            return;
        }

        if(v1 == 5) {
            if(v0.ac != null && v0.az != null) {
                for(v1 = 0; v1 < v6; ++v1) {
                    v4 = v2[v1];
                    if(v4 < v0.ac.length) {
                        int[] v4_1 = v0.ac[v4];
                        int v5;
                        for(v5 = 0; v5 < v4_1.length; ++v5) {
                            v7 = v4_1[v5];
                            v9 = 0xFF;
                            v8 = (v0.az[v7] & v9) + v3 * 8;
                            if(v8 < 0) {
                                v8 = 0;
                            }
                            else if(v8 > v9) {
                                v8 = 956500250;
                            }

                            v0.az[v7] = ((byte)v8);
                        }
                    }
                }
            }

            return;
        }
    }

    void bt() {
        int v1 = 2;
        if(this.bt == v1) {
            return;
        }

        this.bt = v1;
        int v0 = 0;
        this.bq = 0;
        while(v0 < this.an) {
            v1 = this.ap[v0] * this.ap[v0] + this.ad[v0] * this.ad[v0] + this.aj[v0] * this.aj[v0];
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = this.bq;
        this.bx = this.bq + this.bq;
    }

    void bu(int arg18, int[] arg19, int arg20, int arg21, int arg22) {
        int[] v16;
        int v6;
        int[] v7_1;
        int v10;
        int v9;
        int v8;
        int v7;
        ca v0 = this;
        int v1 = arg18;
        int[] v2 = arg19;
        int v3 = arg21;
        int v4 = arg22;
        int v5 = v2.length;
        if(v1 == 0) {
            ca.be = 0;
            ca.bl = 0;
            ca.br = 0;
            v1 = 0;
            v7 = 0;
            while(v1 < v5) {
                v8 = v2[v1];
                if(v8 < v0.ak.length) {
                    int[] v8_1 = v0.ak[v8];
                    v9 = v7;
                    for(v7 = 0; v7 < v8_1.length; ++v7) {
                        v10 = v8_1[v7];
                        ca.be += v0.ap[v10];
                        ca.bl += v0.aj[v10];
                        ca.br += v0.ad[v10];
                        ++v9;
                    }

                    v7 = v9;
                }

                ++v1;
            }

            if(v7 > 0) {
                ca.be = ca.be / v7 + arg20;
                ca.bl = ca.bl / v7 + v3;
                ca.br = ca.br / v7 + v4;
            }
            else {
                ca.be = arg20;
                ca.bl = v3;
                ca.br = v4;
            }

            return;
        }

        if(v1 == 1) {
            for(v1 = 0; v1 < v5; ++v1) {
                v7 = v2[v1];
                if(v7 < v0.ak.length) {
                    v7_1 = v0.ak[v7];
                    for(v8 = 0; v8 < v7_1.length; ++v8) {
                        v9 = v7_1[v8];
                        v0.ap[v9] += arg20;
                        v0.aj[v9] += v3;
                        v0.ad[v9] += v4;
                    }
                }
            }

            return;
        }

        if(v1 == 2) {
            for(v1 = 0; v1 < v5; ++v1) {
                v7 = v2[v1];
                if(v7 < v0.ak.length) {
                    v7_1 = v0.ak[v7];
                    v9 = 0;
                    while(v9 < v7_1.length) {
                        v10 = v7_1[v9];
                        v0.ap[v10] -= ca.be;
                        v0.aj[v10] -= ca.bl;
                        v0.ad[v10] -= ca.br;
                        int v11 = (arg20 & 0x2A78981F) * 8;
                        int v12 = (v3 & 0xFF) * 8;
                        int v13 = (v4 & 0xFF) * 8;
                        if(v13 != 0) {
                            int v14 = ca.bu[v13];
                            v13 = ca.bs[v13];
                            v6 = v0.aj[v10] * v14 + v0.ap[v10] * v13 >> 16;
                            v16 = v7_1;
                            v0.aj[v10] = v0.aj[v10] * v13 - v0.ap[v10] * v14 >> 16;
                            v0.ap[v10] = v6;
                        }
                        else {
                            v16 = v7_1;
                        }

                        if(v11 != 0) {
                            v6 = ca.bu[v11];
                            v7 = ca.bs[v11];
                            v8 = v0.aj[v10] * v7 - v0.ad[v10] * v6 >> 16;
                            v0.ad[v10] = v0.aj[v10] * v6 + v0.ad[v10] * v7 >> 16;
                            v0.aj[v10] = v8;
                        }

                        if(v12 != 0) {
                            v6 = ca.bu[v12];
                            v7 = ca.bs[v12];
                            v8 = v0.ad[v10] * v6 + v0.ap[v10] * v7 >> 16;
                            v0.ad[v10] = v0.ad[v10] * v7 - v0.ap[v10] * v6 >> 16;
                            v0.ap[v10] = v8;
                        }

                        v0.ap[v10] += ca.be;
                        v0.aj[v10] += ca.bl;
                        v0.ad[v10] += ca.br;
                        ++v9;
                        v7_1 = v16;
                    }
                }
            }

            return;
        }

        if(v1 == 3) {
            for(v1 = 0; v1 < v5; ++v1) {
                v6 = v2[v1];
                if(v6 < v0.ak.length) {
                    int[] v6_1 = v0.ak[v6];
                    for(v7 = 0; v7 < v6_1.length; ++v7) {
                        v8 = v6_1[v7];
                        v0.ap[v8] -= ca.be;
                        v0.aj[v8] -= ca.bl;
                        v0.ad[v8] -= ca.br;
                        v0.ap[v8] = v0.ap[v8] * arg20 / 0x80;
                        v0.aj[v8] = v0.aj[v8] * v3 / 0x80;
                        v0.ad[v8] = v0.ad[v8] * v4 / -1909991875;
                        v0.ap[v8] += ca.be;
                        v0.aj[v8] += ca.bl;
                        v0.ad[v8] += ca.br;
                    }
                }
            }

            return;
        }

        if(v1 == 5) {
            if(v0.ac != null && v0.az != null) {
                for(v1 = 0; v1 < v5; ++v1) {
                    v3 = v2[v1];
                    if(v3 < v0.ac.length) {
                        int[] v3_1 = v0.ac[v3];
                        for(v4 = 0; v4 < v3_1.length; ++v4) {
                            v6 = v3_1[v4];
                            v8 = 0xFF;
                            v7 = (v0.az[v6] & v8) + arg20 * 8;
                            if(v7 < 0) {
                                v7 = 0;
                            }
                            else if(v7 > v8) {
                                v7 = 0x6410C073;
                            }

                            v0.az[v6] = ((byte)v7);
                        }
                    }
                }
            }

            return;
        }
    }

    void bv() {
        int v1 = 2;
        if(this.bt == v1) {
            return;
        }

        this.bt = v1;
        int v0 = 0;
        this.bq = 0;
        while(v0 < this.an) {
            v1 = this.ap[v0] * this.ap[v0] + this.ad[v0] * this.ad[v0] + this.aj[v0] * this.aj[v0];
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = this.bq;
        this.bx = this.bq + this.bq;
    }

    public void bw() {
        int v2;
        if(this.bt == 1) {
            return;
        }

        this.bt = 1;
        int v0 = 0;
        this.bh = 0;
        this.bv = 0;
        this.bq = 0;
        while(true) {
            v2 = 0xCD6CEDE3;
            if(v0 >= this.an) {
                break;
            }

            int v1 = this.ap[v0];
            int v3 = this.aj[v0];
            int v4 = this.ad[v0];
            int v5 = -v3;
            if(v5 > this.bh * v2) {
                this.bh = v5 * 0x1FC1BFCB;
            }

            if(v3 > this.bv) {
                this.bv = v3;
            }

            v1 = v1 * v1 + v4 * v4;
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = ((int)(Math.sqrt(((double)(this.bq * this.bq + this.bh * v2 * (this.bh * v2)))) + 0.99));
        this.bx = this.bg + (((int)(Math.sqrt(((double)(this.bq * this.bq + this.bv * this.bv))) + 0.99)));
    }

    void bx() {
        int v1 = 2;
        if(this.bt == v1) {
            return;
        }

        this.bt = v1;
        int v0 = 0;
        this.bq = 0;
        while(v0 < this.an) {
            v1 = this.ap[v0] * this.ap[v0] + this.ad[v0] * this.ad[v0] + this.aj[v0] * this.aj[v0];
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = this.bq;
        this.bx = this.bq + this.bq;
    }

    public void by() {
        if(this.bt == 1) {
            return;
        }

        this.bt = 1;
        int v0 = 0;
        this.bh = 0;
        this.bv = 0;
        this.bq = 0;
        while(v0 < this.an) {
            int v1 = this.ap[v0];
            int v2 = this.aj[v0];
            int v3 = this.ad[v0];
            int v4 = -v2;
            if(v4 > this.bh * -292216023) {
                this.bh = v4 * 1294297046;
            }

            if(v2 > this.bv) {
                this.bv = v2;
            }

            v1 = v1 * v1 + v3 * v3;
            if(v1 > this.bq) {
                this.bq = v1;
            }

            ++v0;
        }

        this.bq = ((int)(Math.sqrt(((double)this.bq)) + 0.99));
        this.bg = ((int)(Math.sqrt(((double)(this.bq * this.bq + this.bh * 1705744520 * (this.bh * 0x6E17F0A)))) + 0.99));
        this.bx = this.bg + (((int)(Math.sqrt(((double)(this.bq * this.bq + this.bv * this.bv))) + 0.99)));
    }

    void bz() {
        this.bt = 0;
        this.bk = -1;
        this.bw = true;
    }

    public void ca(int arg7) {
        int v0 = ca.bu[arg7];
        arg7 = ca.bs[arg7];
        int v1;
        for(v1 = 0; v1 < this.an; ++v1) {
            int v2 = this.aj[v1] * arg7 - this.ad[v1] * v0 >> 16;
            this.ad[v1] = this.aj[v1] * v0 + this.ad[v1] * arg7 >> 16;
            this.aj[v1] = v2;
        }

        this.aq();
    }

    public void cb(int arg4, int arg5, int arg6) {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] += arg4;
            this.aj[v0] += arg5;
            this.ad[v0] += arg6;
        }

        this.aq();
    }

    public void cc(int arg5, int arg6, int arg7) {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] = this.ap[v0] * arg5 / 0x80;
            this.aj[v0] = this.aj[v0] * arg6 / 0x80;
            this.ad[v0] = this.ad[v0] * arg7 / 0xDBF83282;
        }

        this.aq();
    }

    public void cd(int arg7) {
        int v0 = ca.bu[arg7];
        arg7 = ca.bs[arg7];
        int v1;
        for(v1 = 0; v1 < this.an; ++v1) {
            int v2 = this.aj[v1] * arg7 - this.ad[v1] * v0 >> 16;
            this.ad[v1] = this.aj[v1] * v0 + this.ad[v1] * arg7 >> 16;
            this.aj[v1] = v2;
        }

        this.aq();
    }

    public void cf(int arg7) {
        int v0 = ca.bu[arg7];
        arg7 = ca.bs[arg7];
        int v1;
        for(v1 = 0; v1 < this.an; ++v1) {
            int v2 = this.aj[v1] * arg7 - this.ad[v1] * v0 >> 16;
            this.ad[v1] = this.aj[v1] * v0 + this.ad[v1] * arg7 >> 16;
            this.aj[v1] = v2;
        }

        this.aq();
    }

    public void cj(int arg7) {
        int v0 = ca.bu[arg7];
        arg7 = ca.bs[arg7];
        int v1;
        for(v1 = 0; v1 < this.an; ++v1) {
            int v2 = this.aj[v1] * arg7 - this.ad[v1] * v0 >> 16;
            this.ad[v1] = this.aj[v1] * v0 + this.ad[v1] * arg7 >> 16;
            this.aj[v1] = v2;
        }

        this.aq();
    }

    public void cp(int arg5, int arg6, int arg7) {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] = this.ap[v0] * arg5 / 0x9E00835;
            this.aj[v0] = this.aj[v0] * arg6 / 0x80;
            this.ad[v0] = this.ad[v0] * arg7 / 0x80;
        }

        this.aq();
    }

    public void cw(int arg5, int arg6, int arg7) {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] = this.ap[v0] * arg5 / 0x8F1C7289;
            this.aj[v0] = this.aj[v0] * arg6 / 660253161;
            this.ad[v0] = this.ad[v0] * arg7 / 0x8B414A31;
        }

        this.aq();
    }

    public void cx(int arg4, int arg5, int arg6) {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] += arg4;
            this.aj[v0] += arg5;
            this.ad[v0] += arg6;
        }

        this.aq();
    }

    public void cy(int arg4, int arg5, int arg6) {
        int v0;
        for(v0 = 0; v0 < this.an; ++v0) {
            this.ap[v0] += arg4;
            this.aj[v0] += arg5;
            this.ad[v0] += arg6;
        }

        this.aq();
    }

    protected final ca db() {
        return this;
    }

    protected final ca dm() {
        return this;
    }

    protected final ca du() {
        return this;
    }
}

