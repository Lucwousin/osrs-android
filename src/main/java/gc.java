import java.util.Collection;
import java.util.Date;

public class gc implements lh {
    public final boolean ab;
    public final int ad;
    static final gc ae = null;
    public static final int ah = 11;
    final int aj;
    static final gc al;
    static final gc an;
    static final gc ap;
    public final boolean aq;
    static final gc ar;
    static final gc ax;
    static int[] em;
    static Collection ra;

    static {
        gc.ax = new gc(0, -1, true, false, true);
        gc.al = new gc(1, 0, true, true, true);
        gc.ae = new gc(2, 1, true, true, false);
        gc.ar = new gc(3, 2, false, false, true);
        gc.an = new gc(4, 3, false, false, true);
        gc.ap = new gc(5, 10, false, false, true);
    }

    gc(int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        try {
            super();
            this.aj = arg1 * 0xB5190D9;
            this.ad = arg2 * 0x50879ABB;
            this.aq = arg4;
            this.ab = arg5;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("gc.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static gc[] ae() {
        return new gc[]{gc.ap, gc.ar, gc.ax, gc.ae, gc.al, gc.an};
    }

    public static gc[] aj() {
        return new gc[]{gc.ap, gc.ar, gc.ax, gc.ae, gc.al, gc.an};
    }

    public static gc[] an() {
        return new gc[]{gc.ap, gc.ar, gc.ax, gc.ae, gc.al, gc.an};
    }

    public static gc[] ap() {
        return new gc[]{gc.ap, gc.ar, gc.ax, gc.ae, gc.al, gc.an};
    }

    public int ar() {
        return this.aj * 2100948841;
    }

    public int ax(int arg3) {
        arg3 = 2100948841;
        try {
            return this.aj * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("gc.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static int bf(int arg8, hl arg9, boolean arg10, byte arg11) {
        StringBuilder v9_4;
        int[] v11_2;
        od v1_1;
        String[] v0_1;
        int[] v8_3;
        int v4;
        String[] v9_3;
        String v9_2;
        int v10 = 0x4A90AB9;
        int v11 = 0x8FA23525;
        int v0 = 1304812425;
        int v1 = 0xBC5CDEAD;
        if(arg8 != 4100) {
            goto label_34;
        }

        try {
            String[] v8_1 = il.aq;
            int v9 = ft.ab - v11;
            ft.ab = v9;
            String v8_2 = v8_1[v9 * v1];
            int[] v9_1 = il.aj;
            int v3 = il.ad - v10;
            il.ad = v3;
            v9 = v9_1[v3 * v0];
            String[] v10_1 = il.aq;
            v0 = ft.ab + v11;
            ft.ab = v0;
            v10_1[v0 * v1 - 1] = v8_2 + v9;
            return 1;
        label_34:
            v3 = 0x1F446A4A;
            if(arg8 == 0x1005) {
                ft.ab -= v3;
                v8_2 = il.aq[ft.ab * v1];
                v9_2 = il.aq[ft.ab * v1 + 1];
                v10_1 = il.aq;
                v0 = ft.ab + v11;
                ft.ab = v0;
                v10_1[v0 * v1 - 1] = v8_2 + v9_2;
                return 1;
            }

            if(0x1006 == arg8) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                v9_1 = il.aj;
                v3 = il.ad - v10;
                il.ad = v3;
                v9 = v9_1[v3 * v0];
                v10_1 = il.aq;
                v0 = ft.ab + v11;
                ft.ab = v0;
                v10_1[v0 * v1 - 1] = v8_2 + js.aj(v9, true, 0x753D4A8F);
                return 1;
            }

            if(0x1007 == arg8) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                v9_3 = il.aq;
                v10 = ft.ab + v11;
                ft.ab = v10;
                v9_3[v10 * v1 - 1] = v8_2.toLowerCase();
                return 1;
            }

            v4 = 2;
            if(arg8 == 0x1008) {
                v8_3 = il.aj;
                v9 = il.ad - v10;
                il.ad = v9;
                il.au.setTime(new Date(((((long)v8_3[v9 * v0])) + 0x2DE1) * 86400000));
                arg8 = il.au.get(5);
                v9 = il.au.get(v4);
                v10 = il.au.get(1);
                v0_1 = il.aq;
                v3 = ft.ab + v11;
                ft.ab = v3;
                v0_1[v3 * v1 - 1] = arg8 + "-" + il.am[v9] + "-" + v10;
                return 1;
            }

            if(arg8 == 0x1009) {
                ft.ab -= v3;
                v8_2 = il.aq[ft.ab * v1];
                v9_2 = il.aq[ft.ab * v1 + 1];
                if(gu.jg.al == null || !gu.jg.al.ae) {
                    v9_3 = il.aq;
                    v10 = ft.ab + v11;
                    ft.ab = v10;
                    v9_3[v10 * v1 - 1] = v8_2;
                }
                else {
                    v8_1 = il.aq;
                    v10 = ft.ab + v11;
                    ft.ab = v10;
                    v8_1[v10 * v1 - 1] = v9_2;
                }

                return 1;
            }

            if(arg8 == 0x100A) {
                v8_3 = il.aj;
                v9 = il.ad - v10;
                il.ad = v9;
                arg8 = v8_3[v9 * v0];
                v9_3 = il.aq;
                v10 = ft.ab + v11;
                ft.ab = v10;
                v9_3[v10 * v1 - 1] = Integer.toString(arg8);
                return 1;
            }

            if(arg8 == 0x100B) {
                ft.ab -= v3;
                v8_3 = il.aj;
                v9 = il.ad + v10;
                il.ad = v9;
                v8_3[v9 * v0 - 1] = cb.ah(dm.ax(il.aq[ft.ab * v1], il.aq[ft.ab * v1 + 1], en.af, 0x48F82BA0), 16);
                return 1;
            }

            int v5 = 0x78DC0DC9;
            int v6 = 0x9521572;
            int v7 = 0;
            if(0x100C == arg8) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                il.ad -= v6;
                v9 = il.aj[il.ad * v0];
                v1_1 = new od(cj.de.ae(il.aj[il.ad * v0 + 1], 0, v5));
                v11_2 = il.aj;
                v3 = il.ad + v10;
                il.ad = v3;
                v11_2[v3 * v0 - 1] = v1_1.aj(v8_2, v9);
                return 1;
            }

            if(0x100D == arg8) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                il.ad -= v6;
                v9 = il.aj[il.ad * v0];
                v1_1 = new od(cj.de.ae(il.aj[il.ad * v0 + 1], 0, v5));
                v11_2 = il.aj;
                v3 = il.ad + v10;
                il.ad = v3;
                v11_2[v3 * v0 - 1] = v1_1.ap(v8_2, v9);
                return 1;
            }

            if(0x100E == arg8) {
                ft.ab -= v3;
                v8_2 = il.aq[ft.ab * v1];
                v9_2 = il.aq[ft.ab * v1 + 1];
                int[] v3_1 = il.aj;
                v4 = il.ad - v10;
                il.ad = v4;
                if(v3_1[v4 * v0] == 1) {
                    v9_3 = il.aq;
                    v10 = ft.ab + v11;
                    ft.ab = v10;
                    v9_3[v10 * v1 - 1] = v8_2;
                }
                else {
                    v8_1 = il.aq;
                    v10 = ft.ab + v11;
                    ft.ab = v10;
                    v8_1[v10 * v1 - 1] = v9_2;
                }

                return 1;
            }

            if(0x100F == arg8) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                v9_3 = il.aq;
                v10 = ft.ab + v11;
                ft.ab = v10;
                v9_3[v10 * v1 - 1] = od.ad(v8_2);
                return 1;
            }

            if(0x1010 == arg8) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                v9_1 = il.aj;
                v3 = il.ad - v10;
                il.ad = v3;
                v9 = v9_1[v3 * v0];
                v10_1 = il.aq;
                v0 = ft.ab + v11;
                ft.ab = v0;
                v10_1[v0 * v1 - 1] = v8_2 + (((char)v9));
                return 1;
            }

            if(arg8 == 0x1011) {
                v8_3 = il.aj;
                v9 = il.ad - v10;
                il.ad = v9;
                arg8 = v8_3[v9 * v0];
                v9_1 = il.aj;
                v11 = il.ad + v10;
                il.ad = v11;
                v11 = v11 * v0 - 1;
                if(lm.ag(((char)arg8), 0x90B242AE)) {
                    v7 = 1;
                }

                v9_1[v11] = v7;
                return 1;
            }

            if(0x1012 == arg8) {
                v8_3 = il.aj;
                v9 = il.ad - v10;
                il.ad = v9;
                arg8 = v8_3[v9 * v0];
                v9_1 = il.aj;
                v11 = il.ad + v10;
                il.ad = v11;
                v11 = v11 * v0 - 1;
                if(ev.aa(((char)arg8), 0xB9B7658B)) {
                    v7 = 1;
                }

                v9_1[v11] = v7;
                return 1;
            }

            if(arg8 == 0x1013) {
                v8_3 = il.aj;
                v9 = il.ad - v10;
                il.ad = v9;
                arg8 = v8_3[v9 * v0];
                v9_1 = il.aj;
                v11 = il.ad + v10;
                il.ad = v11;
                v9_1[v11 * v0 - 1] = de.af(((char)arg8), 0x87AB0835);
                return 1;
            }

            if(arg8 == 0x1014) {
                v8_3 = il.aj;
                v9 = il.ad - v10;
                il.ad = v9;
                arg8 = v8_3[v9 * v0];
                v9_1 = il.aj;
                v11 = il.ad + v10;
                il.ad = v11;
                v11 = v11 * v0 - 1;
                if(at.ai(((char)arg8), 1995040858)) {
                    v7 = 1;
                }

                v9_1[v11] = v7;
                return 1;
            }

            if(arg8 == 0x1015) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                if(v8_2 != null) {
                    v9_1 = il.aj;
                    v11 = il.ad + v10;
                    il.ad = v11;
                    v9_1[v11 * v0 - 1] = v8_2.length();
                }
                else {
                    v8_3 = il.aj;
                    v9 = il.ad + v10;
                    il.ad = v9;
                    v8_3[v9 * v0 - 1] = 0;
                }

                return 1;
            }

            if(arg8 == 0x1016) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                il.ad -= v6;
                v9 = il.aj[il.ad * v0];
                v10 = il.aj[il.ad * v0 + 1];
                v0_1 = il.aq;
                v3 = ft.ab + v11;
                ft.ab = v3;
                v0_1[v3 * v1 - 1] = v8_2.substring(v9, v10);
                return 1;
            }

            if(arg8 == 0x1017) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                v9_4 = new StringBuilder(v8_2.length());
                v10 = 0;
                v0 = 0;
                while(v10 < v8_2.length()) {
                    char v3_2 = v8_2.charAt(v10);
                    if(v3_2 == 60) {
                        v0 = 1;
                    }
                    else if(62 == v3_2) {
                        v0 = 0;
                    }
                    else if(v0 == 0) {
                        v9_4.append(v3_2);
                    }

                    ++v10;
                }

                v8_1 = il.aq;
                v10 = ft.ab + v11;
                ft.ab = v10;
                v8_1[v10 * v1 - 1] = v9_4.toString();
                return 1;
            }

            if(arg8 == 4120) {
                v8_1 = il.aq;
                v9 = ft.ab - v11;
                ft.ab = v9;
                v8_2 = v8_1[v9 * v1];
                v9_1 = il.aj;
                v11 = il.ad - v10;
                il.ad = v11;
                v9 = v9_1[v11 * v0];
                v11_2 = il.aj;
                v1 = il.ad + v10;
                il.ad = v1;
                v11_2[v1 * v0 - 1] = v8_2.indexOf(v9);
                return 1;
            }

            if(arg8 == 0x1019) {
                ft.ab -= v3;
                v8_2 = il.aq[ft.ab * v1];
                v9_2 = il.aq[ft.ab * v1 + 1];
                v11_2 = il.aj;
                v1 = il.ad - v10;
                il.ad = v1;
                v11 = v11_2[v1 * v0];
                int[] v1_2 = il.aj;
                v3 = il.ad + v10;
                il.ad = v3;
                v1_2[v3 * v0 - 1] = v8_2.indexOf(v9_2, v11);
                return 1;
            }

            if(0x101A != arg8) {
                return v4;
            }

            v8_1 = il.aq;
            v9 = ft.ab - v11;
            ft.ab = v9;
            v8_2 = v8_1[v9 * v1];
            v9_3 = il.aq;
            v10 = ft.ab + v11;
            ft.ab = v10;
            v9_3[v10 * v1 - 1] = v8_2.toUpperCase();
            return 1;
        label_33:
        }
        catch(RuntimeException v8) {
            goto label_33;
        }

        v9_4 = new StringBuilder();
        v9_4.append("gc.bf(");
        v9_4.append(')');
        throw lx.al(((Throwable)v8), v9_4.toString());
        return v4;
    }

    static void fr(ar[] arg8, int arg9, int arg10, int arg11, boolean arg12, boolean arg13, int arg14) {
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
                else if(arg9 != v1.bx * 0xBA6F66AD) {
                }
                else {
                    fe.fj(v1, arg10, arg11, arg12, arg13, 1181050286);
                    iq.fg(v1, arg10, arg11, -1122116206);
                    int v3 = 0x55D2B057;
                    if(v1.bz * v3 > v1.bb * 0x83EA0C19 - v1.by * 0x1804E4A5) {
                        v1.bz = v1.bb * 0xAACDA10F - v1.by * 0x130F0563;
                    }

                    if(v1.bz * v3 < 0) {
                        v1.bz = 0;
                    }

                    v3 = 0x4407680D;
                    if(v1.bh * v3 > v1.bc * 1153505113 - v1.bt * 0x6F0D2CD) {
                        v1.bh = v1.bc * 0xD7FD2D7D - v1.bt * 0x6EB7A5C1;
                    }

                    if(v1.bh * v3 < 0) {
                        v1.bh = 0;
                    }

                    if(v1.ay * 0x4A7987DB != 0) {
                        break;
                    }

                    ad.fw(arg8, v1, arg12, 0x96A98C6B);
                }

                break;
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("gc.fr(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }

        ++v0;
        goto label_2;
    }
}

