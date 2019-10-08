public class ce {
    static final int ae = 2;
    static final int aj = 24;
    static final int al = 1;
    static final int ar = 4;
    public static final int at = 67;
    static final int ax = 0;
    public static final int ay = 21;
    public static final int bt = 4;
    static ib eu;
    static byte[][] fj;

    ce() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ce.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final void ae(lo arg9, byte arg10) {
        int[] v10_1;
        int v9_1;
        int v6;
        int v2;
        int v4;
        int v3;
        int v10 = 0x7FD61DCE;
        try {
            arg9.jg(v10);
            int v0 = 0;
            int v1 = 0;
            while(true) {
                v3 = 0x474DFE7D;
                v4 = 0xEE9DF063;
                if(v0 >= ho.ap * v3) {
                    break;
                }

                v2 = ho.aj[v0];
                if((ho.ae[v2] & 1) == 0) {
                    if(v1 > 0) {
                        --v1;
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                    else if(arg9.jo(1, 0xCD9CB603) == 0) {
                        v1 = ex.ar(arg9, v4);
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                    else {
                        gp.an(arg9, v2, -23);
                    }
                }

                ++v0;
            }

            arg9.ju(0x6FD34691);
            if(v1 == 0) {
                arg9.jg(0x7F3DFF8A);
                v0 = 0;
            }
            else {
                throw new RuntimeException();
            }

            while(v0 < ho.ap * v3) {
                v2 = ho.aj[v0];
                if((ho.ae[v2] & 1) != 0) {
                    if(v1 > 0) {
                        --v1;
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                    else if(arg9.jo(1, 0x90A24BB2) == 0) {
                        v1 = ex.ar(arg9, v4);
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                    else {
                        gp.an(arg9, v2, 14);
                    }
                }

                ++v0;
            }

            arg9.ju(0x110E9819);
            if(v1 == 0) {
                arg9.jg(0x7F407A54);
                v0 = 0;
                goto label_82;
            }

            throw new RuntimeException();
            while(true) {
            label_82:
                v6 = 0x24902B03;
                if(v0 >= ho.ad * v6) {
                    break;
                }

                v2 = ho.aq[v0];
                if((ho.ae[v2] & 1) != 0) {
                    if(v1 > 0) {
                        --v1;
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                    else if(arg9.jo(1, -1101214484) == 0) {
                        v1 = ex.ar(arg9, v4);
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                    else if(mm.ap(arg9, v2, -499669067)) {
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                }

                ++v0;
            }

            arg9.ju(0x2F4C6657);
            if(v1 == 0) {
                arg9.jg(0x7F1A282B);
                v0 = 0;
            }
            else {
                throw new RuntimeException();
            }

            while(v0 < ho.ad * v6) {
                v2 = ho.aq[v0];
                if((ho.ae[v2] & 1) == 0) {
                    if(v1 > 0) {
                        --v1;
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                    else if(arg9.jo(1, 0xA70D4631) == 0) {
                        v1 = ex.ar(arg9, v4);
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                    else if(mm.ap(arg9, v2, 0xDFCD6851)) {
                        ho.ae[v2] = ((byte)(ho.ae[v2] | 2));
                    }
                }

                ++v0;
            }

            arg9.ju(1480002523);
            if(v1 == 0) {
                ho.ap = 0;
                ho.ad = 0;
                v9_1 = 1;
            }
            else {
                throw new RuntimeException();
            }

            while(v9_1 < 0x800) {
                ho.ae[v9_1] = ((byte)(ho.ae[v9_1] >> 1));
                if(client.jf[v9_1] != null) {
                    v10_1 = ho.aj;
                    v0 = ho.ap + 0x5F01EAD5;
                    ho.ap = v0;
                    v10_1[v0 * v3 - 1] = v9_1;
                }
                else {
                    v10_1 = ho.aq;
                    v0 = ho.ad - 0x20DE855;
                    ho.ad = v0;
                    v10_1[v0 * v6 - 1] = v9_1;
                }

                ++v9_1;
            }

            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10_2 = new StringBuilder();
            v10_2.append("ce.ae(");
            v10_2.append(')');
            throw lx.al(((Throwable)v9), v10_2.toString());
        }
    }

    static void bj(int arg3) {
        arg3 = 10;
        byte v0 = -21;
        try {
            dc.ay(arg3, v0);
            hq.cm = 0x53F385D0;
            String v3_1 = hq.dv == null || (hq.dv.isEmpty()) ? gs.ju : String.format(gs.jo, hq.dv);
            ax.bf(gs.jq, gs.jg, v3_1, 0x63D3C206);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ce.bj(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }
}

