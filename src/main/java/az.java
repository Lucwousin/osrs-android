public final class az {
    public static final int ae = 4;
    public static final String aj = "cgs2K0";
    public static final String al = "fpVPSZ";
    public static final String ar = "ariMOV";
    public static final String ax = "lfPMvO";
    static final int az = 2;
    public static final int cw = 83;

    az() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("az.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static String ae(oc arg2, int arg3, String arg4, int arg5) {
        if(arg2 == null) {
            return arg4;
        }

        long v0 = ((long)arg3);
        try {
            mx v2_1 = arg2.ax(v0);
            if(v2_1 == null) {
                return arg4;
            }

            return ((mi)v2_1).ax;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("az.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static final void ah(String arg1, byte arg2) {
        try {
            dz.aq(gs.hm + arg1 + gs.hf, 0x7F05002F);
            return;
        }
        catch(RuntimeException v1) {
            v2 = new StringBuilder();
            v2.append("az.ah(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static void ah(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, short arg12) {
        int v1;
        int v0;
        arg5 = -(arg8 >> 2);
        arg8 = -(arg8 & 3);
        arg9 = -arg9;
        while(true) {
            if(arg9 >= 0) {
                return;
            }

            int v12 = arg7;
            arg7 = arg6;
            arg6 = arg5;
            while(true) {
                if(arg6 >= 0) {
                    goto label_44;
                }

                v0 = arg7 + 1;
                try {
                    arg7 = arg4[arg7];
                    if(arg7 != 0) {
                        v1 = v12 + 1;
                        arg3[v12] = arg7;
                    }
                    else {
                        v1 = v12 + 1;
                    }

                    arg7 = v0 + 1;
                    v12 = arg4[v0];
                    if(v12 != 0) {
                        v0 = v1 + 1;
                        arg3[v1] = v12;
                    }
                    else {
                        v0 = v1 + 1;
                    }

                    v12 = arg7 + 1;
                    arg7 = arg4[arg7];
                    if(arg7 != 0) {
                        v1 = v0 + 1;
                        arg3[v0] = arg7;
                    }
                    else {
                        v1 = v0 + 1;
                    }

                    arg7 = v12 + 1;
                    v12 = arg4[v12];
                    if(v12 != 0) {
                        arg3[v1] = v12;
                        v12 = v1 + 1;
                    }
                    else {
                        v12 = v1 + 1;
                    }

                    ++arg6;
                    continue;
                label_44:
                    arg6 = arg8;
                    while(true) {
                    label_45:
                        if(arg6 >= 0) {
                            goto label_66;
                        }

                        v0 = arg7 + 1;
                        arg7 = arg4[arg7];
                        if(arg7 != 0) {
                            arg3[v12] = arg7;
                            ++v12;
                        }
                        else {
                            break;
                        }

                        goto label_54;
                    }
                }
                catch(RuntimeException v3) {
                    goto label_57;
                }
            }

            ++v12;
        label_54:
            ++arg6;
            arg7 = v0;
            goto label_45;
        label_66:
            ++arg9;
            int v2 = arg7 + arg11;
            arg7 = v12 + arg10;
            arg6 = v2;
        }

    label_57:
        StringBuilder v4 = new StringBuilder();
        v4.append("az.ah(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    static int an(int arg8, hl arg9, boolean arg10, int arg11) {
        int[] v8_1;
        int v5;
        arg11 = -1;
        int v0 = 0x4A90AB9;
        int v1 = 1304812425;
        if(arg8 >= 2000) {
            arg8 += -1000;
            try {
                int[] v9 = il.aj;
                int v10 = il.ad - v0;
                il.ad = v10;
                int v9_1 = v9[v10 * v1];
                ar v10_1 = bl.al(v9_1, 0x64D7CF4D);
                goto label_21;
            label_15:
                ar v9_2 = arg10 ? il.aa : dw.av;
                v10_1 = v9_2;
                v9_1 = -1;
            label_21:
                int v3 = 0x4A7987DB;
                int v4 = 0x12A42AE4;
                v5 = 2;
                boolean v6 = false;
                if(1000 == arg8) {
                    il.ad -= v4;
                    v10_1.ba = il.aj[il.ad * v1] * 0x1DF76BD7;
                    v10_1.bf = il.aj[il.ad * v1 + 1] * 0x4C710A11;
                    v10_1.as = il.aj[il.ad * v1 + v5] * -1859830651;
                    v10_1.ak = il.aj[il.ad * v1 + 3] * 0xB55C4B8D;
                    kx.gw(v10_1, 0x7FAA04A3);
                    client.al.fp(v10_1, 364731190);
                    if(arg11 != v9_1 && v10_1.ay * v3 == 0) {
                        ad.fw(ar.aj[v9_1 >> 16], v10_1, false, 0x8C2CE97D);
                    }

                    return 1;
                }

                if(1001 == arg8) {
                    il.ad -= v4;
                    v10_1.bn = il.aj[il.ad * v1] * 0xA8AD630F;
                    v10_1.bp = il.aj[il.ad * v1 + 1] * 0x38D01227;
                    v10_1.ac = il.aj[il.ad * v1 + v5] * 1261109601;
                    v10_1.bd = il.aj[il.ad * v1 + 3] * 0x4F1860C9;
                    kx.gw(v10_1, 0x7F6F9F64);
                    client.al.fp(v10_1, 0xA1C48D71);
                    if(arg11 != v9_1 && v10_1.ay * v3 == 0) {
                        ad.fw(ar.aj[v9_1 >> 16], v10_1, false, 0xB2E64279);
                    }

                    return 1;
                }

                if(1003 == arg8) {
                    v8_1 = il.aj;
                    v9_1 = il.ad - v0;
                    il.ad = v9_1;
                    if(v8_1[v9_1 * v1] == 1) {
                        v6 = true;
                    }

                    if(v10_1.bg != v6) {
                        v10_1.bg = v6;
                        kx.gw(v10_1, 0x7F26AEDD);
                    }

                    return 1;
                }

                if(1005 == arg8) {
                    v8_1 = il.aj;
                    v9_1 = il.ad - v0;
                    il.ad = v9_1;
                    if(v8_1[v9_1 * v1] == 1) {
                        v6 = true;
                    }

                    v10_1.gs = v6;
                    return 1;
                }

                if(arg8 != 1006) {
                    return v5;
                }

                v8_1 = il.aj;
                v9_1 = il.ad - v0;
                il.ad = v9_1;
                if(v8_1[v9_1 * v1] == 1) {
                    v6 = true;
                }

                v10_1.ga = v6;
                return 1;
            }
            catch(RuntimeException v8) {
                StringBuilder v9_3 = new StringBuilder();
                v9_3.append("az.an(");
                v9_3.append(')');
                throw lx.al(((Throwable)v8), v9_3.toString());
            }
        }
        else {
            goto label_15;
        }

        goto label_21;
        return v5;
    }

    static ij an(int arg2, short arg3) {
        try {
            return ic.al.ax(((long)arg2));
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("az.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static int ax(byte arg2) {
        int v2 = 0xB140C423;
        try {
            return bc.am * v2;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("az.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    static void bp(int arg4, int arg5, byte arg6) {
        int v6 = 9;
        try {
            int[] v6_1 = new int[v6];
            int v0;
            for(v0 = 0; v0 < v6_1.length; ++v0) {
                int v1 = v0 * 0x20 + 0x8F;
                v6_1[v0] = bt.ag[v1] * bz.ea(fr.bn(v1, 0xC84D4710), arg5, 0xD781824C) >> 16;
            }

            bg.bv(v6_1, 500, 800, arg4 * 334 / arg5, 334);
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("az.bp(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    static ar ib(ar arg3, int arg4) {
        int v1;
        ar v0;
        arg4 = -1495840171;
        try {
            arg4 = ht.ar(ib.il(arg3, arg4), 0x75);
            v0 = null;
            if(arg4 == 0) {
                return v0;
            }

            v1 = 0;
            while(true) {
            label_8:
                if(v1 >= arg4) {
                    return arg3;
                }

                arg3 = bl.al(arg3.bx * 0xBA6F66AD, 0x64D7CF4D);
                if(arg3 != null) {
                    goto label_16;
                }

                return v0;
            }
        }
        catch(RuntimeException v3) {
            goto label_21;
        }

        return v0;
    label_16:
        ++v1;
        goto label_8;
        return arg3;
    label_21:
        StringBuilder v4 = new StringBuilder();
        v4.append("az.ib(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }
}

