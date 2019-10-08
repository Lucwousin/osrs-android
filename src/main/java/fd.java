import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public class fd {
    final int ae;
    final int al;
    public static final int an = 4;
    final int ar;
    public static final int aw = 22;
    final int ax;
    public static final int bf = 30;
    static final int bn = 0x12401E3;
    public static final int cl = 91;
    static final int fa = 4700;

    public fd() {
        try {
            this(0, 0, 0, 0);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fd.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public fd(int arg2, int arg3, int arg4, int arg5) {
        try {
            super();
            this.ax = arg2 * -2034829405;
            this.al = arg3 * 0xEF03FBA1;
            this.ae = arg4 * 0x84BF9C6B;
            this.ar = arg5 * 0x383BBF7F;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fd.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int ab() {
        return this.ae * 0x3F123043;
    }

    static int ad(int arg8, hl arg9, boolean arg10, int arg11) {
        int[] v10_2;
        byte[] v8_3;
        byte[] v4_2;
        String[] v8_2;
        int[] v8_1;
        boolean v11 = false;
        int v0 = 0x4A90AB9;
        int v1 = 1304812425;
        if(arg8 >= 2000) {
            arg8 += -1000;
            try {
                int[] v9 = il.aj;
                int v10 = il.ad - v0;
                il.ad = v10;
                ar v9_1 = bl.al(v9[v10 * v1], 0x64D7CF4D);
                v10 = 0;
                goto label_24;
            label_17:
                v9_1 = arg10 ? il.aa : dw.av;
                v10 = 1;
            label_24:
                int v4 = 0xBC5CDEAD;
                int v5 = 9;
                int v6 = 0x8FA23525;
                if(arg8 == 1300) {
                    v8_1 = il.aj;
                    v10 = il.ad - v0;
                    il.ad = v10;
                    arg8 = v8_1[v10 * v1] - 1;
                    if(arg8 >= 0) {
                        if(arg8 > v5) {
                        }
                        else {
                            String[] v10_1 = il.aq;
                            arg11 = ft.ab - v6;
                            ft.ab = arg11;
                            v9_1.az(arg8, v10_1[arg11 * v4], -2040973119);
                            return 1;
                        }
                    }

                    ft.ab -= v6;
                    return 1;
                }

                int v7 = 0x9521572;
                if(1301 == arg8) {
                    il.ad -= v7;
                    v9_1.dg = eh.ae(il.aj[il.ad * v1], il.aj[il.ad * v1 + 1], 0xD40A3573);
                    return 1;
                }

                if(arg8 == 1302) {
                    v8_1 = il.aj;
                    v10 = il.ad - v0;
                    il.ad = v10;
                    if(v8_1[v10 * v1] == 1) {
                        v11 = true;
                    }

                    v9_1.ea = v11;
                    return 1;
                }

                if(1303 == arg8) {
                    v8_1 = il.aj;
                    v10 = il.ad - v0;
                    il.ad = v10;
                    v9_1.ek = v8_1[v10 * v1] * -2086256801;
                    return 1;
                }

                if(1304 == arg8) {
                    v8_1 = il.aj;
                    v10 = il.ad - v0;
                    il.ad = v10;
                    v9_1.ez = v8_1[v10 * v1] * 0x20A164D9;
                    return 1;
                }

                if(1305 == arg8) {
                    v8_2 = il.aq;
                    v10 = ft.ab - v6;
                    ft.ab = v10;
                    v9_1.dt = v8_2[v10 * v4];
                    return 1;
                }

                if(arg8 == 1306) {
                    v8_2 = il.aq;
                    v10 = ft.ab - v6;
                    ft.ab = v10;
                    v9_1.er = v8_2[v10 * v4];
                    return 1;
                }

                String[] v4_1 = null;
                if(1307 == arg8) {
                    v9_1.dd = v4_1;
                    return 1;
                }

                if(1308 == arg8) {
                    v8_1 = il.aj;
                    v10 = il.ad - v0;
                    il.ad = v10;
                    if(v8_1[v10 * v1] == 1) {
                        v11 = true;
                    }

                    v9_1.gj = v11;
                    return 1;
                }

                v6 = 10;
                if(1350 == arg8) {
                    if(v10 != 0) {
                        il.ad -= 781871930;
                        while((((int)v11)) < v6) {
                            if(il.aj[il.ad * v1 + (((int)v11))] < 0) {
                            }
                            else {
                                arg11 = (((int)v11)) + 2;
                                continue;
                            }

                            break;
                        }

                        if((((int)v11)) > 0) {
                            v4_2 = new byte[(((int)v11)) / 2];
                            v8_3 = new byte[(((int)v11)) / 2];
                            goto label_167;
                        }

                        v8_3 = ((byte[])v4_1);
                        goto label_207;
                        while(true) {
                        label_167:
                            arg11 = (((int)v11)) - 2;
                            if(arg11 < 0) {
                                break;
                            }

                            v4_2[arg11 / 2] = ((byte)il.aj[il.ad * v1 + arg11]);
                            v8_3[arg11 / 2] = ((byte)il.aj[il.ad * v1 + arg11 + 1]);
                        }
                    }
                    else {
                        il.ad -= v7;
                        v4_2 = new byte[]{((byte)il.aj[il.ad * v1])};
                        v8_3 = new byte[]{((byte)il.aj[il.ad * v1 + 1])};
                    }

                label_207:
                    v10_2 = il.aj;
                    arg11 = il.ad - v0;
                    il.ad = arg11;
                    v10 = v10_2[arg11 * v1] - 1;
                    if(v10 >= 0 && v10 <= v5) {
                        fa.aq(v9_1, v10, v4_2, v8_3, 0x46DBD7E6);
                        return 1;
                    }

                    throw new RuntimeException();
                }

                if(arg8 == 0x547) {
                    il.ad -= v7;
                    fa.aq(v9_1, v6, new byte[]{((byte)il.aj[il.ad * v1])}, new byte[]{((byte)il.aj[il.ad * v1 + 1])}, 0xF2099F7D);
                    return 1;
                }

                arg11 = 2;
                if(arg8 == 0x548) {
                    il.ad -= 0xDFB202B;
                    arg8 = il.aj[il.ad * v1] - 1;
                    v10 = il.aj[il.ad * v1 + 1];
                    arg11 = il.aj[il.ad * v1 + arg11];
                    if(arg8 >= 0 && arg8 <= v5) {
                        jh.ab(v9_1, arg8, v10, arg11, 1);
                        return 1;
                    }

                    throw new RuntimeException();
                }

                if(0x549 == arg8) {
                    v8_1 = il.aj;
                    v10 = il.ad - v0;
                    il.ad = v10;
                    arg8 = v8_1[v10 * v1];
                    v10_2 = il.aj;
                    arg11 = il.ad - v0;
                    il.ad = arg11;
                    jh.ab(v9_1, v6, arg8, v10_2[arg11 * v1], 1);
                    return 1;
                }

                if(arg8 == 0x54A) {
                    il.ad -= v0;
                    arg8 = il.aj[il.ad * v1] - 1;
                    if(arg8 >= 0 && arg8 <= v5) {
                        ir.af(v9_1, arg8, 0x491D0E7E);
                        return 1;
                    }

                    throw new RuntimeException();
                }

                if(0x54B != arg8) {
                    return arg11;
                }

                ir.af(v9_1, v6, 1940820341);
                return 1;
            label_21:
                goto label_314;
            }
            catch(RuntimeException v8) {
                goto label_21;
            }
        }
        else {
            goto label_17;
        }

        goto label_24;
    label_314:
        StringBuilder v9_2 = new StringBuilder();
        v9_2.append("fd.ad(");
        v9_2.append(')');
        throw lx.al(((Throwable)v8), v9_2.toString());
        return arg11;
    }

    public int ad() {
        return this.ax * 1290620161;
    }

    static String ae(Throwable arg8, int arg9) throws IOException {
        String v0_1;
        char v9 = ')';
        try {
            if((arg8 instanceof py)) {
                v0_1 = ((py)arg8).ap + " | ";
                arg8 = ((py)arg8).aj;
            }
            else {
                v0_1 = "";
            }

            StringWriter v1 = new StringWriter();
            PrintWriter v2 = new PrintWriter(((Writer)v1));
            arg8.printStackTrace(v2);
            v2.close();
            BufferedReader v1_1 = new BufferedReader(new StringReader(v1.toString()));
            String v8_1 = v1_1.readLine();
            while(true) {
                String v2_1 = v1_1.readLine();
                if(v2_1 == null) {
                    break;
                }

                int v3 = v2_1.indexOf(40);
                int v4 = v3 + 1;
                int v5 = v2_1.indexOf(v9, v4);
                char v6 = ' ';
                if(v3 >= 0 && v5 >= 0) {
                    String v4_1 = v2_1.substring(v4, v5);
                    v5 = v4_1.indexOf(".java:");
                    if(v5 >= 0) {
                        v2_1 = v4_1.substring(0, v5) + v4_1.substring(v5 + 5);
                        v0_1 = v0_1 + v2_1 + v6;
                        continue;
                    }
                    else {
                        v2_1 = v2_1.substring(0, v3);
                    }
                }

                v2_1 = v2_1.trim();
                v2_1 = v2_1.substring(v2_1.lastIndexOf(v6) + 1);
                v2_1 = v2_1.substring(v2_1.lastIndexOf(9) + 1);
                v0_1 = v0_1 + v2_1 + v6;
            }

            return v0_1 + "| " + v8_1;
        }
        catch(RuntimeException v8) {
            v0 = new StringBuilder();
            v0.append("fd.ae(");
            v0.append(v9);
            throw lx.al(((Throwable)v8), v0.toString());
        }
    }

    public int ae(int arg3) {
        arg3 = 0x3F123043;
        try {
            return this.ae * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fd.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int af() {
        return this.ar * -1152878300;
    }

    public int ai() {
        return this.ar * 0x13A4007F;
    }

    static final void aj(lo arg4, byte arg5) {
        int v5 = 0;
        try {
            while(v5 < ho.av * 0xC3B65FA7) {
                int v0 = ho.aa[v5];
                hw v1 = client.jf[v0];
                int v2 = arg4.ay(-25);
                if((v2 & 1) != 0) {
                    v2 += arg4.ay(-77) << 8;
                }

                dd.ad(arg4, v0, v1, v2, 0x7DD8DA46);
                ++v5;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("fd.aj(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }

    public int aj() {
        return this.ax * 0xB734F40B;
    }

    public int al(int arg3) {
        arg3 = 350005345;
        try {
            return this.al * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fd.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int an() {
        return this.ax * -159500442;
    }

    public int ap() {
        return this.ax * 0xB734F40B;
    }

    public int aq() {
        return this.ae * 0x3F123043;
    }

    public int ar(short arg3) {
        try {
            return this.ar * 0x13A4007F;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fd.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static void au(byte arg4) {
        int v4 = 2;
        try {
            int v1 = 0xF7EE5BF5;
            if(v4 == hq.cm * v1) {
                int v0 = 0xF4A0196B;
                if(hq.dq * v0 == 0) {
                    if(hq.cg.length() > 0) {
                        hq.cg = hq.cg.substring(0, hq.cg.length() - 1);
                    }
                }
                else if(hq.dq * v0 == 1 && hq.co.length() > 0) {
                    hq.co = hq.co.substring(0, hq.co.length() - 1);
                }
            }
            else if(hq.cm * v1 == 4) {
                if(da.ds.length() > 0) {
                    da.ds = da.ds.substring(0, da.ds.length() - 1);
                }
            }
            else if(hq.cm * v1 == 5 && hq.cg.length() > 0) {
                hq.cg = hq.cg.substring(0, hq.cg.length() - 1);
            }
        }
        catch(RuntimeException v4_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("fd.au(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4_1), v0_1.toString());
        }
    }

    public int ax(int arg3) {
        try {
            return this.ax * 0xB734F40B;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fd.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static int bw(int arg3, hl arg4, boolean arg5, int arg6) {
        int v2;
        int v5 = 0xE2F5F8C2;
        arg6 = 1304812425;
        int v0 = 0x4A90AB9;
        if(5306 != arg3) {
            goto label_17;
        }

        try {
            int[] v3_1 = il.aj;
            int v4 = il.ad + v0;
            il.ad = v4;
            v3_1[v4 * arg6 - 1] = fh.ct(v5);
            return 1;
        label_17:
            v2 = 2;
            if(5307 == arg3) {
                v3_1 = il.aj;
                v4 = il.ad - v0;
                il.ad = v4;
                arg3 = v3_1[v4 * arg6];
                if(1 == arg3 || v2 == arg3) {
                    bk.cq(arg3, 2015744328);
                }

                return 1;
            }

            if(arg3 == 5308) {
                v3_1 = il.aj;
                v4 = il.ad + v0;
                il.ad = v4;
                v3_1[v4 * arg6 - 1] = li.rg.an * 0x3CA82057;
                return 1;
            }

            if(arg3 == 5309) {
                v3_1 = il.aj;
                v4 = il.ad - v0;
                il.ad = v4;
                arg3 = v3_1[v4 * arg6];
                if(arg3 == 1 || arg3 == v2) {
                    li.rg.an = arg3 * -986002585;
                    fr.an(-963076307);
                }

                return 1;
            }

            if(5310 != arg3) {
                return v2;
            }

            v3_1 = il.aj;
            v4 = il.ad - v0;
            il.ad = v4;
            client.os = Math.max((((float)v3_1[v4 * arg6])) / 1000f, 1.77778f);
            client.al.cu(fh.ct(v5), -38326601);
            return 1;
        label_16:
        }
        catch(RuntimeException v3) {
            goto label_16;
        }

        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("fd.bw(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
        return v2;
    }
}

