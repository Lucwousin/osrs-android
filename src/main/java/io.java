public final class io extends mx {
    int ab;
    int ad;
    int ae;
    int af;
    int ai;
    int aj;
    int al;
    int an;
    int ap;
    int aq;
    int ar;
    static int av;
    int ax;

    io() {
        try {
            super();
            this.af = 0;
            this.ai = -617031249;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("io.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final int bh(int arg1, int arg2, byte arg3) {
        arg2 = arg2 * (arg1 & 0x7F) >> 7;
        int v3 = 0x7E;
        if(arg2 < 2) {
            arg2 = 2;
        }
        else if(arg2 > v3) {
            arg2 = 0x7E;
        }

        return arg2 + (arg1 & 0xFF80);
    }

    static final void ds(int arg17) {
        try {
            mx v7;
            for(v7 = client.kg.aj(); v7 != null; v7 = client.kg.aq()) {
                int v8 = 1101813865;
                int v9 = 0xF7C0B1DF;
                if(kt.jz * v8 == ((it)v7).al * v9) {
                    int v10 = -2077001153;
                    if(client.bj * v10 > ((it)v7).ad * 0x8FF9A95) {
                        goto label_140;
                    }
                    else if(client.bj * v10 >= ((it)v7).aj * 0x8F5052B) {
                        int v11 = 0xEB5F9B;
                        int v12 = 0xDA3037C1;
                        int v13 = 0x7640D11A;
                        int v14 = 0x3400;
                        int v15 = 0xD19D0C3D;
                        int v16 = 0x914F0683;
                        if(((it)v7).af * v11 > 0) {
                            ii v0_1 = client.ev[((it)v7).af * v11 - 1];
                            if(v0_1 != null && v0_1.bp * v16 >= 0 && v0_1.bp * v16 < v14 && v0_1.bw * v15 >= 0 && v0_1.bw * v15 < v14) {
                                v7.ax(v0_1.bp * v16, v0_1.bw * v15, fj.ez(v0_1.bp * v16, v0_1.bw * v15, ((it)v7).al * v9, v13) - ((it)v7).ap * v12, client.bj * v10, -1689704136);
                            }
                        }

                        if(((it)v7).af * v11 < 0) {
                            int v0_2 = -(((it)v7).af * v11) - 1;
                            hw v0_3 = v0_2 == client.ja * -900939569 ? gu.jg : client.jf[v0_2];
                            if(v0_3 == null) {
                                goto label_118;
                            }

                            if(v0_3.bp * v16 < 0) {
                                goto label_118;
                            }

                            if(v0_3.bp * v16 >= v14) {
                                goto label_118;
                            }

                            if(v0_3.bw * v15 < 0) {
                                goto label_118;
                            }

                            if(v0_3.bw * v15 >= v14) {
                                goto label_118;
                            }

                            v7.ax(v0_3.bp * v16, v0_3.bw * v15, fj.ez(v0_3.bp * v16, v0_3.bw * v15, ((it)v7).al * v9, v13) - ((it)v7).ap * v12, client.bj * v10, 0x7DD89ABF);
                        }

                    label_118:
                        ((it)v7).al(client.gs * 0x65B3A7FD, 0x62C20C97);
                        ee.fs.ai(kt.jz * v8, ((int)((it)v7).av), ((int)((it)v7).aa), ((int)((it)v7).au), 60, ((bm)v7), ((it)v7).ay * 0x96CDC445, -1, false);
                    }
                }
                else {
                label_140:
                    ((it)v7).lp();
                }
            }
        }
        catch(RuntimeException v0) {
            goto label_148;
        }

        return;
    label_148:
        StringBuilder v1 = new StringBuilder();
        v1.append("io.ds(");
        v1.append(')');
        throw lx.al(((Throwable)v0), v1.toString());
    }
}

