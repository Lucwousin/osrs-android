public class ff implements fm {
    static final int aw = 30;

    public ff() {
        super();
    }

    public float ae(float arg5) {
        return (((float)(Math.cos((((double)(arg5 + 1f))) * 3.141593) / 2))) + 0.5f;
    }

    public float al(float arg5) {
        return (((float)(Math.cos((((double)(arg5 + 1f))) * 3.141593) / 2))) + 0.5f;
    }

    public static final void ar(int arg0, boolean arg1, int arg2, int arg3) {
        if(arg0 >= 8000 && arg0 <= 48000) {
            arg0 *= -932603195;
            try {
                ht.ax = arg0;
                ht.al = arg1;
                ht.an = arg2 * 0xC3746FD5;
                return;
            label_12:
                throw new IllegalArgumentException();
            }
            catch(RuntimeException v0) {
                StringBuilder v1 = new StringBuilder();
                v1.append("ff.ar(");
                v1.append(')');
                throw lx.al(((Throwable)v0), v1.toString());
            }
        }

        goto label_12;
    }

    public float ar(float arg5) {
        return (((float)(Math.cos((((double)(arg5 + 1f))) * 3.141593) / 2))) + 0.5f;
    }

    static void au(int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg7 = -arg7; true; ++arg7) {
            if(arg7 >= 0) {
                return;
            }

            arg10 = arg6 + arg5 - 3;
            while(true) {
                if(arg5 >= arg10) {
                    goto label_24;
                }

                int v0 = arg5 + 1;
                int v1 = arg4 + 1;
                try {
                    arg2[arg5] = arg3[arg4];
                    arg4 = v0 + 1;
                    arg5 = v1 + 1;
                    arg2[v0] = arg3[v1];
                    v0 = arg4 + 1;
                    v1 = arg5 + 1;
                    arg2[arg4] = arg3[arg5];
                    arg5 = v0 + 1;
                    arg4 = v1 + 1;
                    arg2[v0] = arg3[v1];
                    continue;
                label_24:
                    arg10 += 3;
                    while(arg5 < arg10) {
                        arg2[arg5] = arg3[arg4];
                        ++arg5;
                        ++arg4;
                    }
                }
                catch(RuntimeException v2) {
                    goto label_33;
                }
            }

            arg5 += arg8;
            arg4 += arg9;
        }

    label_33:
        StringBuilder v3 = new StringBuilder();
        v3.append("ff.au(");
        v3.append(')');
        throw lx.al(((Throwable)v2), v3.toString());
    }

    public float ax(float arg3, byte arg4) {
        double v3 = (((double)(arg3 + 1f))) * 3.141593;
        try {
            return (((float)(Math.cos(v3) / 2))) + 0.5f;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ff.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3_1), v4.toString());
        }
    }

    public static String az(CharSequence arg1, int arg2) {
        char v2 = '*';
        try {
            return iv.am(v2, arg1.length(), 1);
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ff.az(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }

    static int bp(int arg9, hl arg10, boolean arg11, int arg12) {
        String v2_1;
        String[] v10_2;
        int[] v10_1;
        ij v9_5;
        na v12;
        String v9_4;
        String[] v9_3;
        int v3;
        int v11 = 0x68730425;
        arg12 = 0x4A90AB9;
        int v0 = 1304812425;
        if(arg9 != 5000) {
            goto label_18;
        }

        try {
            int[] v9_1 = il.aj;
            int v10 = il.ad + arg12;
            il.ad = v10;
            v9_1[v10 * v0 - 1] = client.of * v11;
            return 1;
        label_18:
            byte v2 = 8;
            v3 = 2;
            if(5001 == arg9) {
                il.ad -= 0xDFB202B;
                client.of = il.aj[il.ad * v0] * 0xD22577AD;
                ed.ob = di.al(il.aj[il.ad * v0 + 1], 0x6C0EAF07);
                if(ed.ob == null) {
                    ed.ob = pf.al;
                }

                client.op = il.aj[il.ad * v0 + v3] * 0xC4C0E3AB;
                na v9_2 = cd.al(nf.bc, client.eh.an, 0x867304BF);
                v9_2.ae.ar(client.of * v11, 22);
                v9_2.ae.ar(ed.ob.ar * 0x9176C95F, v2);
                v9_2.ae.ar(client.op * 0xB6E2FF03, 0x72);
                client.eh.ae(v9_2, 0x50666040);
                return 1;
            }

            v11 = 0x9521572;
            int v4 = 0x8FA23525;
            int v5 = 0xBC5CDEAD;
            if(5002 == arg9) {
                v9_3 = il.aq;
                v10 = ft.ab - v4;
                ft.ab = v10;
                v9_4 = v9_3[v10 * v5];
                il.ad -= v11;
                v10 = il.aj[il.ad * v0];
                v11 = il.aj[il.ad * v0 + 1];
                v12 = cd.al(nf.cr, client.eh.an, -2082689725);
                v12.ae.ar(ki.af(v9_4, 89) + v3, 0x70);
                v12.ae.ai(v9_4, -29);
                v12.ae.ar(v10 - 1, 92);
                v12.ae.ar(v11, 0x7A);
                client.eh.ae(v12, 0xFA3B58C5);
                return 1;
            }

            int v6 = -1;
            if(5003 == arg9) {
                il.ad -= v11;
                v9_5 = bf.ar(il.aj[il.ad * v0], il.aj[il.ad * v0 + 1], 0x442E);
                if(v9_5 != null) {
                    v10_1 = il.aj;
                    v11 = il.ad + arg12;
                    il.ad = v11;
                    v10_1[v11 * v0 - 1] = v9_5.ax * 0x7D5124F1;
                    v10_1 = il.aj;
                    v11 = il.ad + arg12;
                    il.ad = v11;
                    v10_1[v11 * v0 - 1] = v9_5.al * 0xFF7E947;
                    v10_2 = il.aq;
                    v11 = ft.ab + v4;
                    ft.ab = v11;
                    v11 = v11 * v5 - 1;
                    v2_1 = v9_5.ar != null ? v9_5.ar : "";
                    v10_2[v11] = v2_1;
                    v10_2 = il.aq;
                    v11 = ft.ab + v4;
                    ft.ab = v11;
                    v11 = v11 * v5 - 1;
                    v2_1 = v9_5.ad != null ? v9_5.ad : "";
                    v10_2[v11] = v2_1;
                    v10_2 = il.aq;
                    v11 = ft.ab + v4;
                    ft.ab = v11;
                    v11 = v11 * v5 - 1;
                    v2_1 = v9_5.aq != null ? v9_5.aq : "";
                    v10_2[v11] = v2_1;
                    v10_1 = il.aj;
                    v11 = il.ad + arg12;
                    il.ad = v11;
                    v11 = v11 * v0 - 1;
                    if(v9_5.ae(0x2CF6DEE0)) {
                        v3 = 1;
                    }
                    else if(v9_5.ap(0x9F499943)) {
                    }
                    else {
                        v3 = 0;
                    }

                    v10_1[v11] = v3;
                }
                else {
                    v9_1 = il.aj;
                    v10 = il.ad + arg12;
                    il.ad = v10;
                    v9_1[v10 * v0 - 1] = v6;
                    v9_1 = il.aj;
                    v10 = il.ad + arg12;
                    il.ad = v10;
                    v9_1[v10 * v0 - 1] = 0;
                    v9_3 = il.aq;
                    v10 = ft.ab + v4;
                    ft.ab = v10;
                    v9_3[v10 * v5 - 1] = "";
                    v9_3 = il.aq;
                    v10 = ft.ab + v4;
                    ft.ab = v10;
                    v9_3[v10 * v5 - 1] = "";
                    v9_3 = il.aq;
                    v10 = ft.ab + v4;
                    ft.ab = v10;
                    v9_3[v10 * v5 - 1] = "";
                    v9_1 = il.aj;
                    v10 = il.ad + arg12;
                    il.ad = v10;
                    v9_1[v10 * v0 - 1] = 0;
                }

                return 1;
            }

            if(arg9 == 5004) {
                v9_1 = il.aj;
                v10 = il.ad - arg12;
                il.ad = v10;
                v9_5 = az.an(v9_1[v10 * v0], 800);
                if(v9_5 != null) {
                    v10_1 = il.aj;
                    v11 = il.ad + arg12;
                    il.ad = v11;
                    v10_1[v11 * v0 - 1] = v9_5.ae * 0x72CB148B;
                    v10_1 = il.aj;
                    v11 = il.ad + arg12;
                    il.ad = v11;
                    v10_1[v11 * v0 - 1] = v9_5.al * 0xFF7E947;
                    v10_2 = il.aq;
                    v11 = ft.ab + v4;
                    ft.ab = v11;
                    v11 = v11 * v5 - 1;
                    v2_1 = v9_5.ar != null ? v9_5.ar : "";
                    v10_2[v11] = v2_1;
                    v10_2 = il.aq;
                    v11 = ft.ab + v4;
                    ft.ab = v11;
                    v11 = v11 * v5 - 1;
                    v2_1 = v9_5.ad != null ? v9_5.ad : "";
                    v10_2[v11] = v2_1;
                    v10_2 = il.aq;
                    v11 = ft.ab + v4;
                    ft.ab = v11;
                    v11 = v11 * v5 - 1;
                    v2_1 = v9_5.aq != null ? v9_5.aq : "";
                    v10_2[v11] = v2_1;
                    v10_1 = il.aj;
                    v11 = il.ad + arg12;
                    il.ad = v11;
                    v11 = v11 * v0 - 1;
                    if(v9_5.ae(0x2CF6DEE0)) {
                        v3 = 1;
                    }
                    else if(v9_5.ap(0x4C0D7918)) {
                    }
                    else {
                        v3 = 0;
                    }

                    v10_1[v11] = v3;
                }
                else {
                    v9_1 = il.aj;
                    v10 = il.ad + arg12;
                    il.ad = v10;
                    v9_1[v10 * v0 - 1] = v6;
                    v9_1 = il.aj;
                    v10 = il.ad + arg12;
                    il.ad = v10;
                    v9_1[v10 * v0 - 1] = 0;
                    v9_3 = il.aq;
                    v10 = ft.ab + v4;
                    ft.ab = v10;
                    v9_3[v10 * v5 - 1] = "";
                    v9_3 = il.aq;
                    v10 = ft.ab + v4;
                    ft.ab = v10;
                    v9_3[v10 * v5 - 1] = "";
                    v9_3 = il.aq;
                    v10 = ft.ab + v4;
                    ft.ab = v10;
                    v9_3[v10 * v5 - 1] = "";
                    v9_1 = il.aj;
                    v10 = il.ad + arg12;
                    il.ad = v10;
                    v9_1[v10 * v0 - 1] = 0;
                }

                return 1;
            }

            if(arg9 == 5005) {
                if(ed.ob == null) {
                    v9_1 = il.aj;
                    v10 = il.ad + arg12;
                    il.ad = v10;
                    v9_1[v10 * v0 - 1] = v6;
                }
                else {
                    v9_1 = il.aj;
                    v10 = il.ad + arg12;
                    il.ad = v10;
                    v9_1[v10 * v0 - 1] = ed.ob.ar * 0x9176C95F;
                }

                return 1;
            }

            v11 = 0xF24F550B;
            if(5008 == arg9) {
                v9_3 = il.aq;
                v10 = ft.ab - v4;
                ft.ab = v10;
                v9_4 = v9_3[v10 * v5];
                v10_1 = il.aj;
                v4 = il.ad - arg12;
                il.ad = v4;
                v10 = v10_1[v4 * v0];
                String v12_1 = v9_4.toLowerCase();
                if(v12_1.startsWith(gs.hs)) {
                    v9_4 = v9_4.substring(gs.hs.length());
                    goto label_446;
                }
                else {
                    if(v12_1.startsWith(gs.hr)) {
                        v9_4 = v9_4.substring(gs.hr.length());
                    }
                    else {
                        if(v12_1.startsWith(gs.hk)) {
                            v9_4 = v9_4.substring(gs.hk.length());
                        }
                        else {
                            if(v12_1.startsWith(gs.hw)) {
                                v9_4 = v9_4.substring(gs.hw.length());
                            }
                            else {
                                if(v12_1.startsWith(gs.he)) {
                                    v9_4 = v9_4.substring(gs.he.length());
                                }
                                else {
                                    if(v12_1.startsWith(gs.hq)) {
                                        v9_4 = v9_4.substring(gs.hq.length());
                                    }
                                    else if(v12_1.startsWith(gs.ha)) {
                                        arg12 = 6;
                                        v9_4 = v9_4.substring(gs.ha.length());
                                        goto label_627;
                                    }
                                    else if(v12_1.startsWith(gs.hj)) {
                                        arg12 = 7;
                                        v9_4 = v9_4.substring(gs.hj.length());
                                        goto label_627;
                                    }
                                    else {
                                        if(v12_1.startsWith(gs.ib)) {
                                            v9_4 = v9_4.substring(gs.ib.length());
                                        }
                                        else if(v12_1.startsWith(gs.ip)) {
                                            arg12 = 9;
                                            v9_4 = v9_4.substring(gs.ip.length());
                                            goto label_627;
                                        }
                                        else if(v12_1.startsWith(gs.ig)) {
                                            arg12 = 10;
                                            v9_4 = v9_4.substring(gs.ig.length());
                                            goto label_627;
                                        }
                                        else if(v12_1.startsWith(gs.ik)) {
                                            arg12 = 11;
                                            v9_4 = v9_4.substring(gs.ik.length());
                                            goto label_627;
                                        }
                                        else if(en.af == ly.ax) {
                                            goto label_446;
                                        }
                                        else if(v12_1.startsWith(gs.hg)) {
                                            v9_4 = v9_4.substring(gs.hg.length());
                                            goto label_446;
                                        }
                                        else if(v12_1.startsWith(gs.hn)) {
                                            v9_4 = v9_4.substring(gs.hn.length());
                                            goto label_454;
                                        }
                                        else {
                                            goto label_553;
                                        }

                                        goto label_510;
                                    }

                                    goto label_486;
                                }

                                goto label_478;
                            }

                            goto label_470;
                        }

                        goto label_462;
                    }

                label_454:
                    arg12 = 1;
                    goto label_627;
                label_553:
                    if(v12_1.startsWith(gs.hu)) {
                        v9_4 = v9_4.substring(gs.hu.length());
                    label_462:
                        arg12 = 2;
                        goto label_627;
                    }
                    else if(v12_1.startsWith(gs.ho)) {
                        v9_4 = v9_4.substring(gs.ho.length());
                    label_470:
                        arg12 = 3;
                        goto label_627;
                    }
                    else if(v12_1.startsWith(gs.hl)) {
                        v9_4 = v9_4.substring(gs.hl.length());
                    label_478:
                        arg12 = 4;
                        goto label_627;
                    }
                    else if(v12_1.startsWith(gs.hp)) {
                        v9_4 = v9_4.substring(gs.hp.length());
                    label_486:
                        arg12 = 5;
                        goto label_627;
                    }
                    else if(v12_1.startsWith(gs.hv)) {
                        arg12 = 6;
                        v9_4 = v9_4.substring(gs.hv.length());
                        goto label_627;
                    }
                    else if(v12_1.startsWith(gs.il)) {
                        arg12 = 7;
                        v9_4 = v9_4.substring(gs.il.length());
                        goto label_627;
                    }
                    else if(v12_1.startsWith(gs.ia)) {
                        v9_4 = v9_4.substring(gs.ia.length());
                    }
                    else {
                        goto label_604;
                    }

                label_510:
                    arg12 = 8;
                    goto label_627;
                label_604:
                    if(v12_1.startsWith(gs.is)) {
                        arg12 = 9;
                        v9_4 = v9_4.substring(gs.is.length());
                        goto label_627;
                    }

                    if(v12_1.startsWith(gs.ix)) {
                        arg12 = 10;
                        v9_4 = v9_4.substring(gs.ix.length());
                        goto label_627;
                    }

                    if(v12_1.startsWith(gs.io)) {
                        arg12 = 11;
                        v9_4 = v9_4.substring(gs.io.length());
                        goto label_627;
                    }

                label_446:
                    arg12 = 0;
                }

            label_627:
                String v0_1 = v9_4.toLowerCase();
                if(v0_1.startsWith(gs.ii)) {
                    v9_4 = v9_4.substring(gs.ii.length());
                    goto label_634;
                }
                else if(v0_1.startsWith(gs.in)) {
                    v9_4 = v9_4.substring(gs.in.length());
                }
                else {
                    if(v0_1.startsWith(gs.ie)) {
                        v9_4 = v9_4.substring(gs.ie.length());
                    }
                    else {
                        if(v0_1.startsWith(gs.it)) {
                            v9_4 = v9_4.substring(gs.it.length());
                        }
                        else {
                            if(v0_1.startsWith(gs.ih)) {
                                v9_4 = v9_4.substring(gs.ih.length());
                            }
                            else {
                                if(ly.ax != en.af) {
                                    if(v0_1.startsWith(gs.iy)) {
                                        v9_4 = v9_4.substring(gs.iy.length());
                                    label_634:
                                        v3 = 1;
                                        goto label_706;
                                    }
                                    else if(v0_1.startsWith(gs.id)) {
                                        v9_4 = v9_4.substring(gs.id.length());
                                        goto label_706;
                                    }
                                    else if(v0_1.startsWith(gs.iq)) {
                                        v9_4 = v9_4.substring(gs.iq.length());
                                        goto label_649;
                                    }
                                    else {
                                        goto label_691;
                                    }
                                }

                                goto label_705;
                            }

                            goto label_665;
                        }

                        goto label_657;
                    }

                label_649:
                    v3 = 3;
                    goto label_706;
                label_691:
                    if(v0_1.startsWith(gs.if)) {
                        v9_4 = v9_4.substring(gs.if.length());
                    label_657:
                        v3 = 4;
                        goto label_706;
                    }
                    else if(v0_1.startsWith(gs.ir)) {
                        v9_4 = v9_4.substring(gs.ir.length());
                    label_665:
                        v3 = 5;
                        goto label_706;
                    }

                label_705:
                    v3 = 0;
                }

            label_706:
                na v0_2 = cd.al(nf.dx, client.eh.an, -1730386636);
                v0_2.ae.ar(0, 94);
                int v2_2 = v0_2.ae.ar * v11;
                v0_2.ae.ar(v10, 0x6F);
                v0_2.ae.ar(arg12, 13);
                v0_2.ae.ar(v3, 83);
                et.al(v0_2.ae, v9_4, 0xFB236221);
                v0_2.ae.ag(v0_2.ae.ar * v11 - v2_2, 0x7F3DD35C);
                client.eh.ae(v0_2, 0x8BA0E71F);
                return 1;
            }

            if(arg9 == 5009) {
                ft.ab -= 0x1F446A4A;
                v9_4 = il.aq[ft.ab * v5];
                String v10_3 = il.aq[ft.ab * v5 + 1];
                v12 = cd.al(nf.dr, client.eh.an, 0x80304CAE);
                v12.ae.an(0, 0xCD596B88);
                v0 = v12.ae.ar * v11;
                v12.ae.ai(v9_4, -128);
                et.al(v12.ae, v10_3, -765320233);
                v12.ae.az(v12.ae.ar * v11 - v0, 102592849);
                client.eh.ae(v12, -1200118050);
                return 1;
            }

            if(arg9 == 5015) {
                v9_4 = gu.jg == null || gu.jg.ax == null ? "" : gu.jg.ax.ax(1012245029);
                v10_2 = il.aq;
                v11 = ft.ab + v4;
                ft.ab = v11;
                v10_2[v11 * v5 - 1] = v9_4;
                return 1;
            }

            if(5016 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + arg12;
                il.ad = v10;
                v9_1[v10 * v0 - 1] = client.op * 0xB6E2FF03;
                return 1;
            }

            if(arg9 == 5017) {
                v9_1 = il.aj;
                v10 = il.ad - arg12;
                il.ad = v10;
                arg9 = v9_1[v10 * v0];
                v10_1 = il.aj;
                v11 = il.ad + arg12;
                il.ad = v11;
                v10_1[v11 * v0 - 1] = ev.ap(arg9, 0x8C9A70D1);
                return 1;
            }

            if(arg9 == 5018) {
                v9_1 = il.aj;
                v10 = il.ad - arg12;
                il.ad = v10;
                arg9 = v9_1[v10 * v0];
                v10_1 = il.aj;
                v11 = il.ad + arg12;
                il.ad = v11;
                v10_1[v11 * v0 - 1] = gl.af(arg9, -59);
                return 1;
            }

            if(5019 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - arg12;
                il.ad = v10;
                arg9 = v9_1[v10 * v0];
                v10_1 = il.aj;
                v11 = il.ad + arg12;
                il.ad = v11;
                v10_1[v11 * v0 - 1] = ae.ab(arg9, 16);
                return 1;
            }

            if(arg9 == 5020) {
                v9_3 = il.aq;
                v10 = ft.ab - v4;
                ft.ab = v10;
                ff.cx(v9_3[v10 * v5], 2110536397);
                return 1;
            }

            if(5021 == arg9) {
                v9_3 = il.aq;
                v10 = ft.ab - v4;
                ft.ab = v10;
                client.og = v9_3[v10 * v5].toLowerCase().trim();
                return 1;
            }

            if(arg9 == 5022) {
                v9_3 = il.aq;
                v10 = ft.ab + v4;
                ft.ab = v10;
                v9_3[v10 * v5 - 1] = client.og;
                return 1;
            }

            if(5023 != arg9) {
                return v3;
            }

            v9_3 = il.aq;
            v10 = ft.ab - v4;
            ft.ab = v10;
            System.out.println(v9_3[v10 * v5]);
            return 1;
        label_17:
        }
        catch(RuntimeException v9) {
            goto label_17;
        }

        StringBuilder v10_4 = new StringBuilder();
        v10_4.append("ff.bp(");
        v10_4.append(')');
        throw lx.al(((Throwable)v9), v10_4.toString());
        return v3;
    }

    static final void cx(String arg5, int arg6) {
        boolean v6_1;
        boolean v2;
        try {
            if(arg5.equalsIgnoreCase("toggleroof")) {
                hu v6 = li.rg;
                v2 = !li.rg.ae ? true : false;
                v6.ae = v2;
                fr.an(-501443101);
                int v2_1 = 99;
                if(li.rg.ae) {
                    ib.al(v2_1, "", "Roofs are now all hidden", 0x3CBEC0B5);
                    goto label_28;
                }

                ib.al(v2_1, "", "Roofs will only be removed selectively", 298510860);
            }

        label_28:
            if(arg5.equalsIgnoreCase("displayfps")) {
                v6_1 = !client.cj ? true : false;
                client.cj = v6_1;
            }

            if(arg5.equalsIgnoreCase("renderself")) {
                v6_1 = !client.jo ? true : false;
                client.jo = v6_1;
            }

            if(arg5.equalsIgnoreCase("mouseovertext")) {
                fw v6_2 = fh.kf;
                v2 = !fh.kf.cf ? true : false;
                v6_2.cf = v2;
            }

            if(client.lf * 0x12DC6E19 >= 2) {
                if(!arg5.equalsIgnoreCase("errortest")) {
                    if(arg5.equalsIgnoreCase("harderror")) {
                        client.cf = true;
                    }

                    if(arg5.equalsIgnoreCase("showcoord")) {
                        pb v6_3 = bu.rt;
                        v2 = !bu.rt.cb ? true : false;
                        v6_3.cb = v2;
                    }

                    if(arg5.equalsIgnoreCase("fpson")) {
                        client.cj = true;
                    }

                    if(arg5.equalsIgnoreCase("fpsoff")) {
                        client.cj = false;
                    }

                    if(arg5.equalsIgnoreCase("gc")) {
                        System.gc();
                    }

                    if(arg5.equalsIgnoreCase("clientdrop")) {
                        iw.bb(0x6DA97BA2);
                    }

                    if(arg5.startsWith("fpslimit ")) {
                        client.al.uu.aq(bw.ar(arg5.substring(9), 0xEC6D74C), 0xF49A640F);
                    }

                    if(!arg5.equalsIgnoreCase("copydevicetoken")) {
                        goto label_121;
                    }

                    ah v6_4 = ey.up.bh(0x593FEBE3);
                    if(v6_4 == null) {
                        goto label_121;
                    }

                    v6_4.au(0xCA8D4094);
                }
                else {
                    throw new RuntimeException();
                }
            }

        label_121:
            na v6_5 = cd.al(nf.du, client.eh.an, 0x8ED8D825);
            v6_5.ae.ar(arg5.length() + 1, 15);
            v6_5.ae.ai(arg5, -27);
            client.eh.ae(v6_5, 0x897F6D5D);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_6 = new StringBuilder();
            v6_6.append("ff.cx(");
            v6_6.append(')');
            throw lx.al(((Throwable)v5), v6_6.toString());
        }
    }

    public static final void fh(int arg2, int arg3, int arg4, int arg5, int arg6) {
        arg6 = 0;
        try {
            while(true) {
            label_1:
                if(arg6 >= client.nh * 0x65E6DD07) {
                    return;
                }

                if(client.nk[arg6] + client.nn[arg6] > arg2 && client.nk[arg6] < arg2 + arg4 && client.nf[arg6] + client.nv[arg6] > arg3 && client.nv[arg6] < arg5 + arg3) {
                    client.np[arg6] = true;
                }

                break;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ff.fh(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        ++arg6;
        goto label_1;
    }
}

