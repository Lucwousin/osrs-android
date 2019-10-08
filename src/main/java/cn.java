public class cn {
    public static final int ad = 8;
    int ae;
    public static final int ah = 21;
    int al;
    public static final int ap = 5;
    static final int aq = 4;
    cz ar;
    String ax;
    static final int bb = 4;
    static final int cx = 19;
    static od fh;
    static ef[] gw;

    cn(String arg1, int arg2, int arg3, cz arg4) {
        try {
            super();
            this.ax = arg1;
            this.al = arg2 * -1481037621;
            this.ae = arg3 * 0x9D4BD12F;
            this.ar = arg4;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cn.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static final void ai(String arg1, byte arg2) {
        try {
            dz.aq(gs.hx + arg1 + gs.hz, 0x7F05002F);
            return;
        }
        catch(RuntimeException v1) {
            v2 = new StringBuilder();
            v2.append("cn.ai(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static final oc ax(lq arg6, oc arg7, int arg8) {
        mi v3_1;
        byte v8 = -48;
        try {
            arg8 = arg6.ay(v8);
            if(arg7 == null) {
                arg7 = new oc(fa.ae(arg8, 0xA91DA6F0));
            }

            int v1;
            for(v1 = 0; v1 < arg8; ++v1) {
                int v3 = 1;
                if(arg6.ay(-92) == 1) {
                }
                else {
                    v3 = 0;
                }

                int v2 = arg6.ak(0xE3528CBE);
                if(v3 != 0) {
                    v3_1 = new mi(arg6.bn(-2));
                }
                else {
                    mo v3_2 = new mo(arg6.ac(14));
                }

                arg7.al(((mx)v3_1), ((long)v2));
            }
        }
        catch(RuntimeException v6) {
            goto label_36;
        }

        return arg7;
    label_36:
        StringBuilder v7 = new StringBuilder();
        v7.append("cn.ax(");
        v7.append(')');
        throw lx.al(((Throwable)v6), v7.toString());
    }

    static final byte[] bf(byte[] arg5, byte arg6) {
        try {
            lq v6 = new lq(arg5);
            int v0 = v6.ay(-28);
            int v1 = v6.ac(76);
            if(v1 >= 0) {
                int v3 = 0x57DB1683;
                if(ko.ag * v3 != 0 && v1 > ko.ag * v3) {
                    goto label_42;
                }

                if(v0 == 0) {
                    arg5 = new byte[v1];
                    v6.bw(arg5, 0, v1, 0x9071F4AE);
                    return arg5;
                }

                int v2 = v6.ac(11);
                if(v2 >= 0 && (ko.ag * v3 == 0 || v2 <= ko.ag * v3)) {
                    byte[] v3_1 = new byte[v2];
                    if(1 == v0) {
                        kb.ax(v3_1, v2, arg5, v1, 9);
                    }
                    else {
                        ko.aa.ax(v6, v3_1, 0x9F1776C3);
                    }

                    return v3_1;
                }

                throw new RuntimeException();
            }

        label_42:
            throw new RuntimeException();
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("cn.bf(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    static void bn(int[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int v1;
        arg7 = 0x100 - arg14;
        for(arg11 = -arg11; arg11 < 0; ++arg11) {
            arg15 = -arg10;
            while(arg15 < 0) {
                int v0 = arg8 + 1;
                try {
                    arg8 = arg6[arg8];
                    if(arg8 != 0) {
                        v1 = arg5[arg9];
                        if(v1 == 0) {
                            v1 = arg9 + 1;
                            arg5[arg9] = arg8 | arg7 - 0x30 << 24;
                        }
                        else {
                            arg5[arg9] = (0xFF00FF00 & (arg8 & 0xFF00FF) * arg14 + (0xFF00FF & v1) * arg7) + ((arg8 & 0xFF00) * arg14 + (v1 & 0xFF00) * arg7 & 0xFF0000) >> 8;
                            v1 = arg9 + 1;
                        }
                    }
                    else {
                        goto label_39;
                    }
                }
                catch(RuntimeException v5) {
                    StringBuilder v6 = new StringBuilder();
                    v6.append("cn.bn(");
                    v6.append(')');
                    throw lx.al(((Throwable)v5), v6.toString());
                }

                arg9 = v1;
                goto label_40;
            label_39:
                ++arg9;
            label_40:
                ++arg15;
                arg8 = v0;
            }

            arg9 += arg12;
            arg8 += arg13;
        }
    }

    static void dc(hw arg17, boolean arg18, int arg19) {
        int v14;
        hw v0 = arg17;
        if(v0 != null) {
            int v1 = 1525106413;
            try {
                if((v0.ai(v1)) && !v0.ao) {
                    v0.ay = false;
                    int v3 = 0x474DFE7D;
                    if(((client.ab) && ho.ap * v3 > 50 || ho.ap * v3 > 200) && ((arg18) && v0.cp * -1493580901 == v0.bv * 630408529)) {
                        v0.ay = true;
                    }

                    v3 = 0x914F0683;
                    int v2 = v0.bp * v3 >> 7;
                    int v5 = 0xD19D0C3D;
                    int v4 = v0.bw * v5 >> 7;
                    if(v2 < 0) {
                        return;
                    }

                    int v6 = 104;
                    if(v2 >= v6) {
                        return;
                    }

                    if(v4 < 0) {
                        return;
                    }

                    if(v4 >= v6) {
                        return;
                    }

                    long v9 = gs.aa(0, 0, 0, false, v0.ak * -2091507053, 1);
                    int v7 = 0xDCF21275;
                    int v8 = 2109643365;
                    int v11 = 1052356061;
                    int v12 = 0x7640D11A;
                    int v13 = 1101813865;
                    if(v0.am != null) {
                        v14 = -2077001153;
                        if(client.bj * v14 >= v0.af * 0xE1339B55 && client.bj * v14 < v0.ai * 0x103B21F) {
                            v0.ay = false;
                            v0.ab = fj.ez(v0.bp * v3, v0.bw * v5, kt.jz * v13, v12) * v11;
                            v0.bt = client.bj * v8;
                            ee.fs.av(kt.jz * v13, v3 * v0.bp, v0.bw * v5, v0.ab * v7, 60, arg17, 0x3A7ED159 * v0.bo, v9, v0.az * -1284064327, 0x5EB37EEF * v0.ag, v0.ah * 0xF43B907F, v0.at * 0xB10FE183);
                            return;
                        }
                    }

                    v6 = 0x40;
                    if(v6 == (v0.bp * v3 & 0x7F) && (v0.bw * v5 & 0x7F) == v6) {
                        v14 = 0x85874F13;
                        if(client.iq[v2][v4] == client.if * v14) {
                            return;
                        }
                        else {
                            client.iq[v2][v4] = client.if * v14;
                        }
                    }

                    v0.ab = fj.ez(v0.bp * v3, v0.bw * v5, kt.jz * v13, v12) * v11;
                    v0.bt = client.bj * v8;
                    ee.fs.ai(kt.jz * v13, v3 * v0.bp, v0.bw * v5, v0.ab * v7, 60, arg17, v0.bo * 0x3A7ED159, v9, v0.an);
                }
            }
            catch(RuntimeException v0_1) {
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append("cn.dc(");
                v1_1.append(')');
                throw lx.al(((Throwable)v0_1), v1_1.toString());
            }
        }
    }
}

