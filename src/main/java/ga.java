import com.jagex.jagex3.client.input.softkeyboard.ar;

public class ga implements lh {
    static final ga aa = null;
    static final ga ab = null;
    static final ga ad = null;
    public static final ga ae = null;
    static final ga af = null;
    static final ga ag = null;
    static final ga ah = null;
    static final ga ai = null;
    static final ga aj = null;
    static final ga al = null;
    static final ga am = null;
    public static final ga an = null;
    static final ga ao = null;
    static final ga ap = null;
    static final ga aq = null;
    public static final ga ar = null;
    public final int as;
    static final ga at = null;
    static final ga au = null;
    static final ga av = null;
    static final ga aw = null;
    public static final ga ax = null;
    static final ga ay = null;
    static final ga az = null;
    public static final int cc = 84;
    public static final int da = 1;
    static final int dx = 3;
    static final int ep = 300;

    static {
        ga.ax = new ga(0, 0);
        ga.al = new ga(1, 0);
        ga.ae = new ga(2, 0);
        ga.ar = new ga(3, 0);
        ga.an = new ga(9, 2);
        ga.ap = new ga(4, 1);
        ga.aj = new ga(5, 1);
        ga.ad = new ga(6, 1);
        ga.aq = new ga(7, 1);
        ga.ab = new ga(8, 1);
        ga.af = new ga(12, 2);
        ga.ai = new ga(13, 2);
        ga.av = new ga(14, 2);
        ga.aa = new ga(15, 2);
        ga.au = new ga(16, 2);
        ga.am = new ga(17, 2);
        ga.az = new ga(18, 2);
        ga.ag = new ga(19, 2);
        ga.ah = new ga(20, 2);
        ga.at = new ga(21, 2);
        ga.ay = new ga(10, 2);
        ga.aw = new ga(11, 2);
        ga.ao = new ga(22, 3);
    }

    ga(int arg2, int arg3) {
        try {
            super();
            this.as = arg2 * 1770826725;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ga.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static boolean ab(int arg2) {
        boolean v2 = arg2 == ga.ao.as * 0x675599ED ? true : false;
        return v2;
    }

    public static boolean ad(int arg2) {
        boolean v2 = arg2 < ga.ay.as * 0x675599ED || arg2 > ga.aw.as * 0x60E5775F ? false : true;
        return v2;
    }

    public static boolean af(int arg2) {
        boolean v2 = arg2 == ga.ao.as * 0x675599ED ? true : false;
        return v2;
    }

    public static boolean ai(int arg2) {
        boolean v2 = arg2 == ga.ao.as * 0x675599ED ? true : false;
        return v2;
    }

    public static boolean aj(int arg2) {
        int v1 = 0x675599ED;
        boolean v2 = arg2 >= ga.ax.as * v1 && arg2 <= ga.ar.as * v1 || ga.an.as * v1 == arg2 ? true : false;
        return v2;
    }

    public static boolean ap(int arg2) {
        int v1 = 0x675599ED;
        boolean v2 = arg2 >= ga.ax.as * v1 && arg2 <= ga.ar.as * v1 || ga.an.as * v1 == arg2 ? true : false;
        return v2;
    }

    public static boolean aq(int arg2) {
        int v1 = 0x675599ED;
        boolean v2 = arg2 < ga.ay.as * v1 || arg2 > ga.aw.as * v1 ? false : true;
        return v2;
    }

    public int ar() {
        return this.as * 0x28EC82AC;
    }

    static ar as(int arg2) {
        try {
            ar v2_1 = client.al.aba(0x467F5205).az(3, 0x3310F9D5);
            v2_1.ao(hq.cg, 0x839D6080);
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ga.as(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public int ax(int arg3) {
        try {
            return this.as * 0x675599ED;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ga.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static int bn(int arg7, hl arg8, boolean arg9, int arg10) {
        boolean v3_1;
        dr v8_3;
        int[] v8_2;
        String[] v0_1;
        String[] v7_3;
        dr v7_2;
        int v9 = 0xBC5CDEAD;
        arg10 = 0x8FA23525;
        int v0 = 0x4A90AB9;
        int v1 = 1304812425;
        if(4200 != arg7) {
            goto label_26;
        }

        try {
            int[] v7_1 = il.aj;
            int v8 = il.ad - v0;
            il.ad = v8;
            arg7 = v7_1[v8 * v1];
            String[] v8_1 = il.aq;
            v0 = ft.ab + arg10;
            ft.ab = v0;
            v8_1[v0 * v9 - 1] = client.al(arg7, 48311702).ah;
            return 1;
        label_26:
            int v3 = 5;
            int v4 = 0x9521572;
            if(arg7 == 4201) {
                il.ad -= v4;
                arg7 = il.aj[il.ad * v1];
                v8 = il.aj[il.ad * v1 + 1];
                v7_2 = client.al(arg7, 0x194F8480);
                if(v8 < 1 || v8 > v3) {
                label_60:
                    v7_3 = il.aq;
                    v8 = ft.ab + arg10;
                    ft.ab = v8;
                    v7_3[v8 * v9 - 1] = "";
                }
                else {
                    --v8;
                    if(v7_2.bo[v8] != null) {
                        v0_1 = il.aq;
                        v1 = ft.ab + arg10;
                        ft.ab = v1;
                        v0_1[v1 * v9 - 1] = v7_2.bo[v8];
                    }
                    else {
                        goto label_60;
                    }
                }

                return 1;
            }

            if(arg7 == 4202) {
                il.ad -= v4;
                arg7 = il.aj[il.ad * v1];
                v8 = il.aj[il.ad * v1 + 1];
                v7_2 = client.al(arg7, 1007510265);
                if(v8 < 1 || v8 > v3) {
                label_101:
                    v7_3 = il.aq;
                    v8 = ft.ab + arg10;
                    ft.ab = v8;
                    v7_3[v8 * v9 - 1] = "";
                }
                else {
                    --v8;
                    if(v7_2.by[v8] != null) {
                        v0_1 = il.aq;
                        v1 = ft.ab + arg10;
                        ft.ab = v1;
                        v0_1[v1 * v9 - 1] = v7_2.by[v8];
                    }
                    else {
                        goto label_101;
                    }
                }

                return 1;
            }

            if(4203 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v1];
                v8_2 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v8_2[v9 * v1 - 1] = client.al(arg7, 2070121138).bp * 0x5941C08B;
                return 1;
            }

            v3 = 0;
            if(4204 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v1];
                v8_2 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v9 = v9 * v1 - 1;
                if(client.al(arg7, 0x3F907DC9).bn * 401368599 == 1) {
                    v3 = 1;
                }

                v8_2[v9] = v3;
                return 1;
            }

            v4 = 0x286CC599;
            int v5 = -1;
            int v6 = -2039930253;
            if(4205 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v1];
                v8_3 = client.al(arg7, 0x306C6350);
                if(v8_3.bi * v4 != v5 || v8_3.br * v6 < 0) {
                    v8_2 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v8_2[v9 * v1 - 1] = arg7;
                }
                else {
                    v7_1 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v7_1[v9 * v1 - 1] = v8_3.br * v6;
                }

                return 1;
            }

            if(arg7 == 4206) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v1];
                v8_3 = client.al(arg7, 0x391F4DBB);
                if(v8_3.bi * v4 < 0 || v8_3.br * v6 < 0) {
                    v8_2 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v8_2[v9 * v1 - 1] = arg7;
                }
                else {
                    v7_1 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v7_1[v9 * v1 - 1] = v8_3.br * v6;
                }

                return 1;
            }

            if(arg7 == 0x106F) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v1];
                v8_2 = il.aj;
                v9 = il.ad + v0;
                il.ad = v9;
                v9 = v9 * v1 - 1;
                if(client.al(arg7, 0x6DF41F1D).bw) {
                    v3 = 1;
                }

                v8_2[v9] = v3;
                return 1;
            }

            v4 = 0xBC6389C3;
            v6 = 0xF27B7AF9;
            if(0x1070 == arg7) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v1];
                v8_3 = client.al(arg7, 0x49D5B004);
                if(v8_3.cr * v4 != v5 || v8_3.ci * v6 < 0) {
                    v8_2 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v8_2[v9 * v1 - 1] = arg7;
                }
                else {
                    v7_1 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v7_1[v9 * v1 - 1] = v8_3.ci * v6;
                }

                return 1;
            }

            if(arg7 == 4209) {
                v7_1 = il.aj;
                v8 = il.ad - v0;
                il.ad = v8;
                arg7 = v7_1[v8 * v1];
                v8_3 = client.al(arg7, 0xFD81BA25);
                if(v8_3.cr * v4 < 0 || v8_3.ci * v6 < 0) {
                    v8_2 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v8_2[v9 * v1 - 1] = arg7;
                }
                else {
                    v7_1 = il.aj;
                    v9 = il.ad + v0;
                    il.ad = v9;
                    v7_1[v9 * v1 - 1] = v8_3.ci * v6;
                }

                return 1;
            }

            v4 = 0xE50ED6D3;
            if(4210 == arg7) {
                v7_3 = il.aq;
                v8 = ft.ab - arg10;
                ft.ab = v8;
                String v7_4 = v7_3[v8 * v9];
                v8_2 = il.aj;
                v9 = il.ad - v0;
                il.ad = v9;
                if(1 == v8_2[v9 * v1]) {
                    v3_1 = true;
                }

                ew.ix(v7_4, v3_1, 0x6E883D4F);
                v7_1 = il.aj;
                v8 = il.ad + v0;
                il.ad = v8;
                v7_1[v8 * v1 - 1] = ew.rd * v4;
                return 1;
            }

            if(0x1073 == arg7) {
                if(lg.rp != null) {
                    v8 = 0x504A94F5;
                    if(fa.rm * v8 >= ew.rd * v4) {
                        goto label_375;
                    }
                    else {
                        v7_1 = il.aj;
                        v9 = il.ad + v0;
                        il.ad = v9;
                        short[] v10 = lg.rp;
                        v0 = fa.rm + 0x28C2775D;
                        fa.rm = v0;
                        v7_1[v9 * v1 - 1] = v10[v0 * v8 - 1] & 0xFFFF;
                    }
                }
                else {
                label_375:
                    v7_1 = il.aj;
                    v8 = il.ad + v0;
                    il.ad = v8;
                    v7_1[v8 * v1 - 1] = v5;
                }

                return 1;
            }

            if(arg7 != 0x1074) {
                return 2;
            }

            fa.rm = 0;
            return 1;
        label_25:
        }
        catch(RuntimeException v7) {
            goto label_25;
        }

        StringBuilder v8_4 = new StringBuilder();
        v8_4.append("ga.bn(");
        v8_4.append(')');
        throw lx.al(((Throwable)v7), v8_4.toString());
        return 2;
    }
}

