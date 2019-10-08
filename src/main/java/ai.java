import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

public class ai {
    final String ad;
    public static final int ae = 2;
    static int af = 0;
    public static final int aj = 6;
    public static final int al = 1;
    public static final int an = 4;
    final int aq;
    public static final int ax = 0;
    public static final int bc = 44;
    public static final int cj = 71;
    static em oq;

    public ai(String arg2, int arg3) {
        try {
            super();
            this.ad = arg2;
            this.aq = arg3 * 0x983FBFB1;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ai.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static void ad(int arg2) {
        try {
            Iterator v2_1 = ic.al.iterator();
            while(v2_1.hasNext()) {
                v2_1.next().al(109);
            }
        }
        catch(RuntimeException v2) {
            goto label_11;
        }

        return;
    label_11:
        StringBuilder v0 = new StringBuilder();
        v0.append("ai.ad(");
        v0.append(')');
        throw lx.al(((Throwable)v2), v0.toString());
    }

    public int ae() {
        return this.aq * 0xCDD3533A;
    }

    public static void ai(Collection arg1, int arg2) {
        try {
            arg1.add(ez.ae);
            arg1.add(ez.ar);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ai.ai(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public String aj() {
        return this.ad;
    }

    public String al(byte arg3) {
        try {
            return this.ad;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ai.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int an() {
        return this.aq * 1366370641;
    }

    public String ap() {
        return this.ad;
    }

    public int ar() {
        return this.aq * 1366370641;
    }

    public static void ax(ln arg5, String arg6, String arg7, int arg8, int arg9, int arg10) throws IOException {
        arg9 *= 0x75989855;
        try {
            et.an = arg9;
            mm.aa = 0x6C0F163B * arg8;
            mm.az = arg5.fi(0xF89CBEC4);
            lu.ar = arg5.fc(arg6, arg7, arg8, -2004467504);
            try {
                id.am = System.getProperty("os.name");
            }
            catch(Exception ) {
                id.am = "Unknown";
            }

            dp.au = id.am.toLowerCase();
            fg.ax(lu.ar, 1);
            md.ae(arg5.fo(arg8, -1100082908), 0xAD076923);
            mm.af = new op(new og(in.al("main_file_cache.dat2", 0x2FFACDF7), "rw", 0x3E800000), 5200, 0);
            long v0 = 0x100000;
            int v7 = 6000;
            mm.ai = new op(new og(in.al("main_file_cache.idx255", 0x1D7B11F0), "rw", v0), v7, 0);
            int v6 = 0xD32FA4FD;
            mm.av = new op[et.an * v6];
            int v5_1;
            for(v5_1 = 0; v5_1 < et.an * v6; ++v5_1) {
                op[] v9 = mm.av;
                StringBuilder v3 = new StringBuilder();
                v3.append("main_file_cache.idx");
                v3.append(v5_1);
                v9[v5_1] = new op(new og(in.al(v3.toString(), 0x9C5B0A1), "rw", v0), v7, 0);
            }
        }
        catch(RuntimeException v5) {
            goto label_80;
        }

        return;
    label_80:
        StringBuilder v6_1 = new StringBuilder();
        v6_1.append("ai.ax(");
        v6_1.append(')');
        throw lx.al(((Throwable)v5), v6_1.toString());
    }

    public int ax(int arg3) {
        arg3 = 1366370641;
        try {
            return this.aq * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ai.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static final void ft(int arg7, int arg8, int arg9, boolean arg10, boolean arg11, int arg12) {
        arg12 = 0xBECF81A3;
        try {
            if(!mr.ar(arg7, arg12)) {
                return;
            }

            gc.fr(ar.aj[arg7], -1, arg8, arg9, arg10, arg11, 0x556F7590);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("ai.ft(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    static final void gv(ar[] arg8, int arg9, int arg10) {
        int v2_1;
        int v5;
        int v4;
        int v0 = 0;
        try {
            while(true) {
            label_2:
                if(v0 >= arg8.length) {
                    return;
                }

                ar v1 = arg8[v0];
                if(v1 == null) {
                }
                else if(v1.bx * 0xBA6F66AD != arg9) {
                }
                else {
                    if((v1.ag) && (ap.ia(v1, 0xDA9EDBD6))) {
                        break;
                    }

                    int v3 = 0x4A7987DB;
                    if(v1.ay * v3 == 0) {
                        if(!v1.ag && (ap.ia(v1, -1432508491)) && et.kb != v1) {
                            break;
                        }

                        v4 = 971580097;
                        v5 = -1394170549;
                        ai.gv(arg8, v1.ah * v4, v5);
                        if(v1.fr != null) {
                            ai.gv(v1.fr, v1.ah * v4, v5);
                        }

                        mx v2 = client.ky.ax(((long)(v1.ah * v4)));
                        if(v2 == null) {
                            goto label_52;
                        }

                        gx.gq(((if)v2).ax * 0x199DF2C5, -84);
                    }

                label_52:
                    if(6 != v1.ay * v3) {
                        break;
                    }

                    v3 = 0xC2A43CD1;
                    v4 = 0x5E00CE43;
                    v5 = -1;
                    if(v5 != v1.ce * v3 || v1.cs * v4 != v5) {
                        v2_1 = hc.gc(v1, 1) ? v1.cs * v4 : v1.ce * v3;
                        if(v2_1 == v5) {
                            continue label_127;
                        }

                        df v2_2 = fs.al(v2_1, 1304812425);
                        v1.ft += client.gs * 0x89EC0F99;
                        while(true) {
                            int v6 = 0x60239AFD;
                            if(v1.ft * 0x4FF26A05 <= v2_2.ad[v1.fw * v6]) {
                                break;
                            }

                            v1.ft -= v2_2.ad[v1.fw * v6] * 0xAF95D2CD;
                            v1.fw += 1112724053;
                            if(v1.fw * v6 >= v2_2.ap.length) {
                                v1.fw -= v2_2.ab * 0xB8575FA5;
                                if(v1.fw * v6 >= 0 && v1.fw * v6 < v2_2.ap.length) {
                                    goto label_124;
                                }

                                v1.fw = 0;
                            }

                        label_124:
                            kx.gw(v1, 0x7F644705);
                        }
                    }

                label_127:
                    v3 = 0xDF496C77;
                    if(v1.cq * v3 == 0) {
                        break;
                    }

                    if(v1.ag) {
                        break;
                    }

                    v2_1 = v1.cq * v3 >> 16;
                    v3 = v1.cq * v3 << 16 >> 16;
                    v2_1 *= client.gs * 0x65B3A7FD;
                    v3 *= client.gs * 0x65B3A7FD;
                    v1.cl = (v2_1 + v1.cl * 8000905 & 0x7FF) * 0xE766F0B9;
                    v1.ck = (v1.ck * 0x21D4CFF7 + v3 & 0x7FF) * 0x6778A1C7;
                    kx.gw(v1, 0x7FD70FCC);
                }

                break;
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("ai.gv(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }

        ++v0;
        goto label_2;
    }
}

