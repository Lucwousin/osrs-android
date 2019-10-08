public class ct implements lh {
    static final ct ae = null;
    static int[] ai = null;
    static final ct al = null;
    final int an;
    final byte ap;
    static final ct ar = null;
    static final ct ax = null;
    static int du = 0;
    public static final int dz = 2;

    static {
        ct.ax = new ct(3, 0);
        ct.al = new ct(2, 1);
        ct.ae = new ct(1, 2);
        ct.ar = new ct(0, 3);
    }

    ct(int arg2, byte arg3) {
        try {
            super();
            this.an = arg2 * 0x522C24F7;
            this.ap = arg3;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ct.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static int ae(int arg0, int arg1) {
        return arg0 >> 11 & 0x3F;
    }

    static ct[] ae() {
        return new ct[]{ct.al, ct.ax, ct.ae, ct.ar};
    }

    static ct[] al(int arg2) {
        arg2 = 4;
        try {
            ct[] v2_1 = new ct[arg2];
            v2_1[0] = ct.al;
            v2_1[1] = ct.ax;
            v2_1[2] = ct.ae;
            v2_1[3] = ct.ar;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ct.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static int ao(int arg3, hl arg4, boolean arg5, int arg6) {
        int v5 = 2;
        int v0 = 1304812425;
        if(arg3 != 3200) {
            goto label_28;
        }

        try {
            il.ad -= 0xDFB202B;
            fe.bl(il.aj[il.ad * v0], il.aj[il.ad * v0 + 1], il.aj[il.ad * v0 + v5], 0x58EF2957);
            return 1;
        label_28:
            if(arg3 == 3201) {
                int[] v3_1 = il.aj;
                int v4 = il.ad - 0x4A90AB9;
                il.ad = v4;
                ck.br(v3_1[v4 * v0], -96);
                return 1;
            }

            if(3202 != arg3) {
                return v5;
            }

            il.ad -= 0x9521572;
            dm.bi(il.aj[il.ad * v0], il.aj[il.ad * v0 + 1], 0x897DE6D3);
            return 1;
        label_27:
        }
        catch(RuntimeException v3) {
            goto label_27;
        }

        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("ct.ao(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
        return v5;
    }

    public int ar() {
        return this.ap;
    }

    public int ax(int arg3) {
        try {
            return this.ap;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ct.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static int ba(int arg7, hl arg8, boolean arg9, int arg10) {
        int v3;
        int[] v8_1;
        int[] v7_1;
        int v2;
        int v9 = 0x9521572;
        arg10 = 0x4A90AB9;
        int v0 = 1304812425;
        if(arg7 != 4000) {
            goto label_29;
        }

        try {
            il.ad -= v9;
            arg7 = il.aj[il.ad * v0];
            int v8 = il.aj[il.ad * v0 + 1];
            int[] v9_1 = il.aj;
            v2 = il.ad + arg10;
            il.ad = v2;
            v9_1[v2 * v0 - 1] = arg7 + v8;
            return 1;
        label_29:
            if(4001 == arg7) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = arg7 - v8;
                return 1;
            }

            if(4002 == arg7) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = v8 * arg7;
                return 1;
            }

            if(4003 == arg7) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = arg7 / v8;
                return 1;
            }

            if(4004 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - arg10;
                il.ad = v8;
                arg7 = v7_1[v8 * v0];
                v8_1 = il.aj;
                v9 = il.ad + arg10;
                il.ad = v9;
                v8_1[v9 * v0 - 1] = ((int)(Math.random() * (((double)arg7))));
                return 1;
            }

            if(arg7 == 4005) {
                v7_1 = il.aj;
                v8 = il.ad - arg10;
                il.ad = v8;
                arg7 = v7_1[v8 * v0];
                v8_1 = il.aj;
                v9 = il.ad + arg10;
                il.ad = v9;
                v8_1[v9 * v0 - 1] = ((int)(Math.random() * (((double)(arg7 + 1)))));
                return 1;
            }

            v2 = 2;
            if(4006 == arg7) {
                il.ad -= 390935965;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9 = il.aj[il.ad * v0 + v2];
                v2 = il.aj[il.ad * v0 + 3];
                v3 = il.aj[il.ad * v0 + 4];
                int[] v4 = il.aj;
                int v5 = il.ad + arg10;
                il.ad = v5;
                v4[v5 * v0 - 1] = arg7 + (v3 - v9) * (v8 - arg7) / (v2 - v9);
                return 1;
            }

            if(arg7 == 4007) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = v8 * arg7 / 100 + arg7;
                return 1;
            }

            if(arg7 == 4008) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = arg7 | 1 << v8;
                return 1;
            }

            if(arg7 == 4009) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = arg7 & -1 - (1 << v8);
                return 1;
            }

            v3 = 0;
            if(4010 == arg7) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v2 = v2 * v0 - 1;
                if((arg7 & 1 << v8) != 0) {
                    v3 = 1;
                }

                v9_1[v2] = v3;
                return 1;
            }

            if(0xFAB == arg7) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = arg7 % v8;
                return 1;
            }

            if(0xFAC == arg7) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                if(arg7 == 0) {
                    v7_1 = il.aj;
                    v8 = il.ad + arg10;
                    il.ad = v8;
                    v7_1[v8 * v0 - 1] = 0;
                }
                else {
                    v9_1 = il.aj;
                    v2 = il.ad + arg10;
                    il.ad = v2;
                    v9_1[v2 * v0 - 1] = ((int)Math.pow(((double)arg7), ((double)v8)));
                }

                return 1;
            }

            if(0xFAD == arg7) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                if(arg7 == 0) {
                    v7_1 = il.aj;
                    v8 = il.ad + arg10;
                    il.ad = v8;
                    v7_1[v8 * v0 - 1] = 0;
                    return 1;
                }

                switch(v8) {
                    case 0: {
                        v7_1 = il.aj;
                        v8 = il.ad + arg10;
                        il.ad = v8;
                        v7_1[v8 * v0 - 1] = 0x7FFFFFFF;
                        break;
                    }
                    case 1: {
                        v8_1 = il.aj;
                        v9 = il.ad + arg10;
                        il.ad = v9;
                        v8_1[v9 * v0 - 1] = arg7;
                        break;
                    }
                    case 2: {
                        v8_1 = il.aj;
                        v9 = il.ad + arg10;
                        il.ad = v9;
                        v8_1[v9 * v0 - 1] = ((int)Math.sqrt(((double)arg7)));
                        break;
                    }
                    case 3: {
                        v8_1 = il.aj;
                        v9 = il.ad + arg10;
                        il.ad = v9;
                        v8_1[v9 * v0 - 1] = ((int)Math.cbrt(((double)arg7)));
                        break;
                    }
                    case 4: {
                        v8_1 = il.aj;
                        v9 = il.ad + arg10;
                        il.ad = v9;
                        v8_1[v9 * v0 - 1] = ((int)Math.sqrt(Math.sqrt(((double)arg7))));
                        break;
                    }
                    default: {
                        v9_1 = il.aj;
                        v2 = il.ad + arg10;
                        il.ad = v2;
                        v9_1[v2 * v0 - 1] = ((int)Math.pow(((double)arg7), 1 / (((double)v8))));
                        break;
                    }
                }

                return 1;
            }

            if(arg7 == 0xFAE) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = arg7 & v8;
                return 1;
            }

            if(0xFAF == arg7) {
                il.ad -= v9;
                arg7 = il.aj[il.ad * v0];
                v8 = il.aj[il.ad * v0 + 1];
                v9_1 = il.aj;
                v2 = il.ad + arg10;
                il.ad = v2;
                v9_1[v2 * v0 - 1] = arg7 | v8;
                return 1;
            }

            if(0xFB2 != arg7) {
                return v2;
            }

            il.ad -= 0xDFB202B;
            long v7_2 = ((long)il.aj[il.ad * v0]);
            long v3_1 = ((long)il.aj[il.ad * v0 + 1]);
            long v5_1 = ((long)il.aj[il.ad * v0 + v2]);
            v9_1 = il.aj;
            v2 = il.ad + arg10;
            il.ad = v2;
            v9_1[v2 * v0 - 1] = ((int)(v7_2 * v5_1 / v3_1));
            return 1;
        label_28:
        }
        catch(RuntimeException v7) {
            goto label_28;
        }

        StringBuilder v8_2 = new StringBuilder();
        v8_2.append("ct.ba(");
        v8_2.append(')');
        throw lx.al(((Throwable)v7), v8_2.toString());
        return v2;
    }
}

