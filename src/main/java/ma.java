public final class ma {
    static final String ab = "Error loading application";
    int ad;
    static final int af = 3;
    int aj;
    static final int al = 0x100;
    int[] an;
    int[] ap;
    int aq;
    int ar;
    static final int ax = 8;
    static int hw;

    public ma(int[] arg4) {
        try {
            super();
            this.ap = new int[0x100];
            this.an = new int[0x100];
            int v0;
            for(v0 = 0; v0 < arg4.length; ++v0) {
                this.an[v0] = arg4[v0];
            }

            this.ar(1722308894);
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ma.<init>(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }
    }

    final void ab() {
        int v0 = this.ad;
        int v1 = this.aq + 1981107655;
        this.aq = v1;
        this.ad = v0 + v1 * 0x6C3A061D;
        for(v0 = 0; v0 < 0x100; ++v0) {
            v1 = this.ap[v0];
            int v3 = 0x7D79F3A9;
            int v4 = -2020712295;
            if((v0 & 2) == 0) {
                this.aj = (v0 & 1) == 0 ? (this.aj * v4 ^ this.aj * v4 << 13) * v3 : (this.aj * v4 ^ this.aj * v4 >>> 6) * v3;
            }
            else if((v0 & 1) == 0) {
                this.aj = (this.aj * v4 ^ this.aj * v4 << 2) * v3;
            }
            else {
                this.aj = (this.aj * v4 ^ this.aj * v4 >>> 16) * v3;
            }

            this.aj += this.ap[v0 + 0x80 & 0xFF] * v3;
            int[] v2 = this.ap;
            v3 = this.ap[(v1 & 1020) >> 2] + this.aj * v4 + this.ad * 0x4F646623;
            v2[v0] = v3;
            v2 = this.an;
            v3 = (this.ap[(v3 >> 8 & 1020) >> 2] + v1) * 1934784907;
            this.ad = v3;
            v2[v0] = v3 * 0x4F646623;
        }
    }

    public final int ad() {
        if(this.ar * 1312939305 == 0) {
            this.ae(1212762054);
            this.ar = 0x3C0F1900;
        }

        return this.an[this.ar * -542525003 - 1];
    }

    final void ae(int arg7) {
        try {
            arg7 = this.ad;
            int v0 = this.aq + 1981107655;
            this.aq = v0;
            this.ad = arg7 + v0 * 0x6C3A061D;
            for(arg7 = 0; arg7 < 0x100; ++arg7) {
                v0 = this.ap[arg7];
                int v2 = 0x7D79F3A9;
                int v3 = -2020712295;
                if((arg7 & 2) == 0) {
                    this.aj = (arg7 & 1) == 0 ? (this.aj * v3 ^ this.aj * v3 << 13) * v2 : (this.aj * v3 ^ this.aj * v3 >>> 6) * v2;
                }
                else if((arg7 & 1) == 0) {
                    this.aj = (this.aj * v3 ^ this.aj * v3 << 2) * v2;
                }
                else {
                    this.aj = (this.aj * v3 ^ this.aj * v3 >>> 16) * v2;
                }

                this.aj += this.ap[arg7 + 0x80 & 0xFF] * v2;
                int[] v1 = this.ap;
                v2 = this.ap[(v0 & 1020) >> 2] + this.aj * v3 + this.ad * 0x4F646623;
                v1[arg7] = v2;
                v1 = this.an;
                v2 = (this.ap[(v2 >> 8 & 1020) >> 2] + v0) * 1934784907;
                this.ad = v2;
                v1[arg7] = v2 * 0x4F646623;
            }
        }
        catch(RuntimeException v7) {
            goto label_95;
        }

        return;
    label_95:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("ma.ae(");
        v0_1.append(')');
        throw lx.al(((Throwable)v7), v0_1.toString());
    }

    final void af() {
        ma v0 = this;
        int v2 = 0;
        int v3 = -1640531527;
        int v1 = 0;
        int v4 = -1640531527;
        int v5 = -1640531527;
        int v6 = -1640531527;
        int v7 = -1640531527;
        int v8 = 0x8DD2A0B3;
        int v9 = -1640531527;
        int v10 = 0x4CFA2112;
        while(v1 < 4) {
            v3 ^= v4 << 11;
            v5 += v3;
            v4 = v4 + v6 ^ v6 >>> 2;
            v7 += v4;
            v6 = v6 + v5 ^ v5 << 8;
            v8 += v6;
            v5 = v5 + v7 ^ v7 >>> 16;
            v9 += v5;
            v7 = v7 + v8 ^ v8 << 10;
            v10 += v7;
            v8 = v8 + v9 ^ v9 >>> 4;
            v3 += v8;
            v9 = v9 + v10 ^ v10 << 8;
            v4 += v9;
            v10 = v10 + v3 ^ v3 >>> 9;
            v6 += v10;
            v3 += v4;
            ++v1;
        }

        while(v2 < 1773917570) {
            v3 += v0.an[v2];
            int v11 = v2 + 1;
            v4 += v0.an[v11];
            int v12 = v2 + 2;
            v6 += v0.an[v12];
            int v13 = v2 + 3;
            int v14 = v2 + 4;
            int v15 = v2 + 5;
            int v16 = v2 + 6;
            int v17 = v2 + 7;
            v1 = v4 << 11 ^ v3;
            v5 = v5 + v0.an[v13] + v1;
            v3 = v6 >>> 2 ^ v4 + v6;
            v7 = v7 + v0.an[v14] + v3;
            v4 = v5 << 8 ^ v6 + v5;
            v8 = v8 + v0.an[v15] + v4;
            v5 = v5 + v7 ^ v7 >>> 16;
            v9 = v9 + v0.an[v16] + v5;
            v7 = v7 + v8 ^ v8 << 10;
            v10 = v10 + v0.an[v17] + v7;
            v8 = v8 + v9 ^ v9 >>> 4;
            v1 += v8;
            v9 = v9 + v10 ^ v10 << 8;
            v3 += v9;
            v10 = v10 + v1 ^ v1 >>> 9;
            v6 = v4 + v10;
            v1 += v3;
            v0.ap[v2] = v1;
            v0.ap[v11] = v3;
            v0.ap[v12] = v6;
            v0.ap[v13] = v5;
            v0.ap[v14] = v7;
            v0.ap[v15] = v8;
            v0.ap[v16] = v9;
            v0.ap[v17] = v10;
            v2 += 8;
            v4 = v3;
            v3 = v1;
        }

        v0.ae(-286865029);
        v0.ar = 1271756701;
    }

    final void ai() {
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v12;
        ma v0 = this;
        int v3 = 0;
        int v4 = -1640531527;
        int v1 = 0;
        int v2 = -1640531527;
        int v5 = 0xEA0ED17;
        int v6 = -1607933370;
        int v7 = -1640531527;
        int v8 = -1640531527;
        int v9 = -1640531527;
        int v10 = -1640531527;
        while(v1 < 4) {
            v4 ^= v2 << 11;
            v5 += v4;
            v2 = v2 + v6 ^ v6 >>> 2;
            v7 += v2;
            v6 = v6 + v5 ^ v5 << 8;
            v8 += v6;
            v5 = v5 + v7 ^ v7 >>> 16;
            v9 += v5;
            v7 = v7 + v8 ^ v8 << 10;
            v10 += v7;
            v8 = v8 + v9 ^ v9 >>> 4;
            v4 += v8;
            v9 = v9 + v10 ^ v10 << 8;
            v2 += v9;
            v10 = v10 + v4 ^ v4 >>> 9;
            v6 += v10;
            v4 += v2;
            ++v1;
        }

        v1 = 0;
        while(true) {
            int v11 = 0x100;
            if(v1 < v11) {
                v4 += v0.an[v1];
                v12 = v1 + 1;
                v2 += v0.an[v12];
                v13 = v1 + 2;
                v6 += v0.an[v13];
                v14 = v1 + 3;
                v15 = v1 + 4;
                v16 = v1 + 5;
                v17 = v1 + 6;
                v18 = v1 + 7;
                v4 ^= v2 << 11;
                v5 = v5 + v0.an[v14] + v4;
                v2 = v2 + v6 ^ v6 >>> 2;
                v7 = v7 + v0.an[v15] + v2;
                v6 = v6 + v5 ^ v5 << 8;
                v8 = v8 + v0.an[v16] + v6;
                v5 = v5 + v7 ^ v7 >>> 16;
                v9 = v9 + v0.an[v17] + v5;
                v7 = v7 + v8 ^ v8 << 10;
                v10 = v10 + v0.an[v18] + v7;
                v8 = v8 + v9 ^ v9 >>> 4;
                v4 += v8;
                v9 = v9 + v10 ^ v10 << 8;
                v2 += v9;
                v10 = v10 + v4 ^ v4 >>> 9;
                v6 += v10;
                v4 += v2;
                v0.ap[v1] = v4;
                v0.ap[v12] = v2;
                v0.ap[v13] = v6;
                v0.ap[v14] = v5;
                v0.ap[v15] = v7;
                v0.ap[v16] = v8;
                v0.ap[v17] = v9;
                v0.ap[v18] = v10;
                v1 += 8;
                continue;
            }

            break;
        }

        while(v3 < v11) {
            v4 += v0.ap[v3];
            v12 = v3 + 1;
            v2 += v0.ap[v12];
            v13 = v3 + 2;
            v6 += v0.ap[v13];
            v14 = v3 + 3;
            v15 = v3 + 4;
            v16 = v3 + 5;
            v17 = v3 + 6;
            v18 = v3 + 7;
            v1 = v2 << 11 ^ v4;
            v5 = v5 + v0.ap[v14] + v1;
            v2 = v2 + v6 ^ v6 >>> 2;
            v7 = v7 + v0.ap[v15] + v2;
            v4 = v5 << 8 ^ v6 + v5;
            v8 = v8 + v0.ap[v16] + v4;
            v5 = v5 + v7 ^ v7 >>> 16;
            v9 = v9 + v0.ap[v17] + v5;
            v7 = v7 + v8 ^ v8 << 10;
            v10 = v10 + v0.ap[v18] + v7;
            v8 = v8 + v9 ^ v9 >>> 4;
            v1 += v8;
            v9 = v9 + v10 ^ v10 << 8;
            v2 += v9;
            v10 = v10 + v1 ^ v1 >>> 9;
            v6 = v4 + v10;
            v4 = v1 + v2;
            v0.ap[v3] = v4;
            v0.ap[v12] = v2;
            v0.ap[v13] = v6;
            v0.ap[v14] = v5;
            v0.ap[v15] = v7;
            v0.ap[v16] = v8;
            v0.ap[v17] = v9;
            v0.ap[v18] = v10;
            v3 += 8;
        }

        v0.ae(0xE0FF4704);
        v0.ar = 0x3C0F1900;
    }

    public final int aj() {
        if(this.ar * 0x311D1449 == 0) {
            this.ae(0xB07121B0);
            this.ar = 0x3C0F1900;
        }

        return this.an[this.ar * -1004832720 - 1];
    }

    public final int al(byte arg3) {
        try {
            int v0 = 1312939305;
            if(this.ar * v0 == 0) {
                this.ae(0xAC8E2DAE);
                this.ar = 0x3C0F1900;
            }

            return this.an[this.ar * v0 - 1];
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ma.al(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public final int an() {
        int v1 = 1312939305;
        if(this.ar * v1 == 0) {
            this.ae(0x22A0FDF3);
            this.ar = 0x3C0F1900;
        }

        int[] v0 = this.an;
        int v2 = this.ar + 1707340007;
        this.ar = v2;
        return v0[v2 * v1];
    }

    public final int ap() {
        int v1 = 1312939305;
        if(this.ar * v1 == 0) {
            this.ae(380274294);
            this.ar = 0x3C0F1900;
        }

        return this.an[this.ar * v1 - 1];
    }

    public final int aq() {
        int v1 = 1312939305;
        if(this.ar * v1 == 0) {
            this.ae(0xB33498AC);
            this.ar = 0x3C0F1900;
        }

        return this.an[this.ar * v1 - 1];
    }

    final void ar(int arg20) {
        ma v1 = this;
        int v0 = 0;
        int v2 = 0;
        int v3 = -1640531527;
        int v4 = -1640531527;
        int v5 = -1640531527;
        int v6 = -1640531527;
        int v7 = -1640531527;
        int v8 = -1640531527;
        int v9 = -1640531527;
        int v10 = -1640531527;
        while(v2 < 4) {
            v3 ^= v4 << 11;
            v5 += v3;
            v4 = v4 + v6 ^ v6 >>> 2;
            v7 += v4;
            v6 = v6 + v5 ^ v5 << 8;
            v8 += v6;
            v5 = v5 + v7 ^ v7 >>> 16;
            v9 += v5;
            v7 = v7 + v8 ^ v8 << 10;
            v10 += v7;
            v8 = v8 + v9 ^ v9 >>> 4;
            v3 += v8;
            v9 = v9 + v10 ^ v10 << 8;
            v4 += v9;
            v10 = v10 + v3 ^ v3 >>> 9;
            v6 += v10;
            v3 += v4;
            ++v2;
        }

        v2 = 0;
        while(true) {
            int v11 = 0x100;
            if(v2 < v11) {
                try {
                    v3 += v1.an[v2];
                    int v12 = v2 + 1;
                    v4 += v1.an[v12];
                    int v13 = v2 + 2;
                    v6 += v1.an[v13];
                    int v14 = v2 + 3;
                    int v15 = v2 + 4;
                    int v16 = v2 + 5;
                    int v17 = v2 + 6;
                    int v18 = v2 + 7;
                    v3 ^= v4 << 11;
                    v5 = v5 + v1.an[v14] + v3;
                    v4 = v4 + v6 ^ v6 >>> 2;
                    v7 = v7 + v1.an[v15] + v4;
                    v6 = v6 + v5 ^ v5 << 8;
                    v8 = v8 + v1.an[v16] + v6;
                    v5 = v5 + v7 ^ v7 >>> 16;
                    v9 = v9 + v1.an[v17] + v5;
                    v7 = v7 + v8 ^ v8 << 10;
                    v10 = v10 + v1.an[v18] + v7;
                    v8 = v8 + v9 ^ v9 >>> 4;
                    v3 += v8;
                    v9 = v9 + v10 ^ v10 << 8;
                    v4 += v9;
                    v10 = v10 + v3 ^ v3 >>> 9;
                    v6 += v10;
                    v3 += v4;
                    v1.ap[v2] = v3;
                    v1.ap[v12] = v4;
                    v1.ap[v13] = v6;
                    v1.ap[v14] = v5;
                    v1.ap[v15] = v7;
                    v1.ap[v16] = v8;
                    v1.ap[v17] = v9;
                    v1.ap[v18] = v10;
                    v2 += 8;
                    continue;
                label_134:
                    while(v0 < v11) {
                        v3 += v1.ap[v0];
                        v12 = v0 + 1;
                        v4 += v1.ap[v12];
                        v13 = v0 + 2;
                        v6 += v1.ap[v13];
                        v14 = v0 + 3;
                        v15 = v0 + 4;
                        v16 = v0 + 5;
                        v17 = v0 + 6;
                        v18 = v0 + 7;
                        v2 = v4 << 11 ^ v3;
                        v5 = v5 + v1.ap[v14] + v2;
                        v3 = v6 >>> 2 ^ v4 + v6;
                        v7 = v7 + v1.ap[v15] + v3;
                        v4 = v5 << 8 ^ v6 + v5;
                        v8 = v8 + v1.ap[v16] + v4;
                        v5 = v5 + v7 ^ v7 >>> 16;
                        v9 = v9 + v1.ap[v17] + v5;
                        v7 = v7 + v8 ^ v8 << 10;
                        v10 = v10 + v1.ap[v18] + v7;
                        v8 = v8 + v9 ^ v9 >>> 4;
                        v2 += v8;
                        v9 = v9 + v10 ^ v10 << 8;
                        v3 += v9;
                        v10 = v10 + v2 ^ v2 >>> 9;
                        v6 = v4 + v10;
                        v2 += v3;
                        v1.ap[v0] = v2;
                        v1.ap[v12] = v3;
                        v1.ap[v13] = v6;
                        v1.ap[v14] = v5;
                        v1.ap[v15] = v7;
                        v1.ap[v16] = v8;
                        v1.ap[v17] = v9;
                        v1.ap[v18] = v10;
                        v0 += 8;
                        v4 = v3;
                        v3 = v2;
                    }

                    v1.ae(0x46B26E9F);
                    v1.ar = 0x3C0F1900;
                    return;
                label_133:
                    break;
                }
                catch(RuntimeException v0_1) {
                    goto label_133;
                }
            }

            goto label_134;
        }

        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("ma.ar(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public static final int ax(double arg22, double arg24, double arg26) {
        double v0;
        double v16;
        double v2;
        double v6 = 0;
        if(v6 != arg24) {
            double v10 = 1;
            v2 = arg26 < 0.5 ? (arg24 + v10) * arg26 : arg26 + arg24 - arg24 * arg26;
            double v8 = 2;
            double v4 = arg26 * v8 - v2;
            double v12 = 0.333333;
            double v14 = arg22 + v12;
            if(v14 > v10) {
                v14 -= v10;
            }

            v12 = arg22 - v12;
            if(v12 < v6) {
                v12 += v10;
            }

            v6 = 6;
            double v18 = 0.666667;
            double v20 = 3;
            if(v14 * v6 < v10) {
                v16 = v4 + (v2 - v4) * v6 * v14;
            }
            else if(v14 * v8 < v10) {
                v16 = v2;
            }
            else if(v14 * v20 < v8) {
                v16 = v4 + (v2 - v4) * (v18 - v14) * v6;
            }
            else {
                v16 = v4;
            }

            if(arg22 * v6 < v10) {
                v0 = arg22 * ((v2 - v4) * v6) + v4;
            }
            else if(arg22 * v8 < v10) {
                v0 = v2;
            }
            else if(arg22 * v20 < v8) {
                v0 = (v18 - arg22) * (v2 - v4) * v6 + v4;
            }
            else {
                v0 = v4;
            }

            if(v12 * v6 < v10) {
                v2 = v12 * ((v2 - v4) * v6) + v4;
                goto label_95;
            }

            if(v12 * v8 < v10) {
                goto label_95;
            }

            if(v20 * v12 < v8) {
                v2 = v4 + (v18 - v12) * (v2 - v4) * v6;
                goto label_95;
            }

            v2 = v4;
        }
        else {
            v0 = arg26;
            v2 = v0;
            v16 = v2;
        }

    label_95:
        return (((int)(v2 * 256))) + (((((int)(v0 * 256))) << 8) + ((((int)(v16 * 256))) << 16));
    }

    public final int ax(byte arg4) {
        try {
            int v0 = 1312939305;
            if(this.ar * v0 == 0) {
                this.ae(-261256007);
                this.ar = 0x3C0F1900;
            }

            int[] v4_1 = this.an;
            int v1 = this.ar + 1707340007;
            this.ar = v1;
            return v4_1[v1 * v0];
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ma.ax(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }
    }
}

