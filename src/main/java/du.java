public class du {
    public static final int aa = 99;
    public static final String ad = "crsG39";
    final int ae;
    public static final int ak = 25;
    final int al;
    public static final int av = 12;
    public static final int aw = 22;
    final int ax;
    static final int bl = 12;
    static final int fc = 104;
    static int[][] fr;

    du(int arg2, int arg3, int arg4) {
        try {
            super();
            this.ax = arg2 * 0x8204551;
            this.al = arg3 * 0x656DD109;
            this.ae = arg4 * 0xBAB9C5FD;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("du.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static int am(int arg4, hl arg5, boolean arg6, int arg7) {
        int v5_1;
        String[] v4_2;
        int v6;
        int[] v4_1;
        if(arg6) {
            try {
                ar v5 = il.aa;
                goto label_4;
            label_3:
                v5 = dw.av;
            label_4:
                arg7 = 1304812425;
                int v0 = 0x4A90AB9;
                if(arg4 == 1800) {
                    v4_1 = il.aj;
                    v6 = il.ad + v0;
                    il.ad = v6;
                    v4_1[v6 * arg7 - 1] = ct.ae(ib.il(v5, -1511889101), 0x7F0F00B5);
                    return 1;
                }

                int v2 = 0xBC5CDEAD;
                int v3 = 0x8FA23525;
                if(0x709 == arg4) {
                    v4_1 = il.aj;
                    v6 = il.ad - v0;
                    il.ad = v6;
                    arg4 = v4_1[v6 * arg7] - 1;
                    if(v5.dd == null || arg4 >= v5.dd.length || v5.dd[arg4] == null) {
                        v4_2 = il.aq;
                        v5_1 = ft.ab + v3;
                        ft.ab = v5_1;
                        v4_2[v5_1 * v2 - 1] = "";
                    }
                    else {
                        String[] v6_1 = il.aq;
                        arg7 = ft.ab + v3;
                        ft.ab = arg7;
                        v6_1[arg7 * v2 - 1] = v5.dd[arg4];
                    }

                    return 1;
                }

                if(0x70A != arg4) {
                    return 2;
                }

                if(v5.dt == null) {
                    v4_2 = il.aq;
                    v5_1 = ft.ab + v3;
                    ft.ab = v5_1;
                    v4_2[v5_1 * v2 - 1] = "";
                }
                else {
                    v4_2 = il.aq;
                    v6 = ft.ab + v3;
                    ft.ab = v6;
                    v4_2[v6 * v2 - 1] = v5.dt;
                }

                return 1;
            }
            catch(RuntimeException v4) {
                StringBuilder v5_2 = new StringBuilder();
                v5_2.append("du.am(");
                v5_2.append(')');
                throw lx.al(((Throwable)v4), v5_2.toString());
            }
        }
        else {
            goto label_3;
        }

        goto label_4;
        return 1;
    }

    public static void ao(int arg2) {
        try {
            dr.aa.ar();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("du.ao(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static void cy(int arg0, int arg1, int arg2) {
        arg0 *= 0xEB67437;
        try {
            client.hy = arg0;
            client.ht = arg1 * -1915011015;
            client.hz = 0;
            client.hx = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("du.cy(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final void gp(int arg2, int arg3) {
        int v0;
        arg3 = 557568308;
        try {
            if(!mr.ar(arg2, arg3)) {
                return;
            }

            ar[] v2_1 = ar.aj[arg2];
            v0 = 0;
            while(true) {
            label_8:
                if(v0 >= v2_1.length) {
                    return;
                }

                ar v1 = v2_1[v0];
                if(v1 == null) {
                }
                else {
                    v1.fw = 0;
                    v1.ft = 0;
                }

                break;
            }
        }
        catch(RuntimeException v2) {
            goto label_20;
        }

        ++v0;
        goto label_8;
        return;
    label_20:
        StringBuilder v3 = new StringBuilder();
        v3.append("du.gp(");
        v3.append(')');
        throw lx.al(((Throwable)v2), v3.toString());
    }
}

