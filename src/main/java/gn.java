public class gn {
    public static final int ab = 38;
    public static final int ad = 0x20;
    public static final int ae = 15;
    static final byte aj = 1;
    public static final int al = 6;
    public static final int ar = 21;
    static ef at = null;
    public static final int ax = 2;
    public static final int ay = 68;
    static final int ba = 0x12401E0;
    static ki dv;

    gn() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gn.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static boolean ad(int arg0, int arg1) {
        boolean v1 = true;
        if((arg0 >> 29 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    static void al(String[] arg5, short[] arg6, int arg7, int arg8, int arg9) {
        if(arg7 < arg8) {
            arg9 = arg7 + arg8;
            try {
                arg9 /= 2;
                String v0 = arg5[arg9];
                arg5[arg9] = arg5[arg8];
                arg5[arg8] = v0;
                short v1 = arg6[arg9];
                arg6[arg9] = arg6[arg8];
                arg6[arg8] = v1;
                arg9 = arg7;
                int v2 = arg9;
                while(arg9 < arg8) {
                    if(v0 == null || arg5[arg9] != null && arg5[arg9].compareTo(v0) < (arg9 & 1)) {
                        String v3 = arg5[arg9];
                        arg5[arg9] = arg5[v2];
                        arg5[v2] = v3;
                        short v3_1 = arg6[arg9];
                        arg6[arg9] = arg6[v2];
                        arg6[v2] = v3_1;
                        ++v2;
                    }

                    ++arg9;
                }

                arg5[arg8] = arg5[v2];
                arg5[v2] = v0;
                arg6[arg8] = arg6[v2];
                arg6[v2] = v1;
                gn.al(arg5, arg6, arg7, v2 - 1, 0xED0ACE34);
                gn.al(arg5, arg6, v2 + 1, arg8, 0xED0ACE34);
            }
            catch(RuntimeException v5) {
                StringBuilder v6 = new StringBuilder();
                v6.append("gn.al(");
                v6.append(')');
                throw lx.al(((Throwable)v5), v6.toString());
            }
        }
    }

    static Integer ax(lq arg3, byte arg4) {
        int v4 = 0;
        int v0 = 0;
        while(true) {
            byte v1 = -110;
            try {
                int v1_1 = arg3.ay(v1);
                int v2 = 0xFF;
                if(v2 == v1_1) {
                    Integer v3_1 = v4 != 0 ? Integer.valueOf(v0) : null;
                    return v3_1;
                }

                if(v1_1 != 0) {
                    goto label_36;
                }

                while(true) {
                    if(v2 == arg3.ay(-99)) {
                        goto label_15;
                    }

                    arg3.ar -= -1880437085;
                    if(arg3.ao(193909799) != 0) {
                        goto label_32;
                    }

                    if(v4 != 0) {
                        break;
                    }

                    v0 = arg3.ac(56);
                    v4 = 1;
                }

                throw new IllegalStateException("");
            label_32:
                throw new IllegalStateException("");
            label_15:
                continue;
            label_36:
                throw new IllegalStateException("");
            }
            catch(RuntimeException v3) {
                StringBuilder v4_1 = new StringBuilder();
                v4_1.append("gn.ax(");
                v4_1.append(')');
                throw lx.al(((Throwable)v3), v4_1.toString());
            }
        }
    }

    static void bn(od arg24, od arg25, fa arg26, int arg27) {
        int v22;
        int v8;
        ih v13;
        int v20;
        String v14_1;
        int v1_1;
        od v0 = arg25;
        fa v9 = arg26;
        try {
            int v10 = hq.fz.ae * 0x249E9B9;
            int v11 = hq.fz.ar * 0xEE0C033F;
            if(aw.er == null) {
                aw.er = ht.ab(eo.dh, "sl_back", "", 5000);
            }

            int v2 = 0x6E0C0A57;
            if(nc.eq == null) {
                nc.eq = dl.ad(eo.dh, "sl_flags", "", v2);
            }

            if(fy.ej == null) {
                fy.ej = dl.ad(eo.dh, "sl_arrows", "", v2);
            }

            if(gy.em == null) {
                gy.em = dl.ad(eo.dh, "sl_stars", "", v2);
            }

            if(bl.en == null) {
                bl.en = aa.aq(eo.dh, "leftarrow", "", -104);
            }

            if(ci.el == null) {
                ci.el = aa.aq(eo.dh, "rightarrow", "", -82);
            }

            int v12 = 0x4D586FC3;
            arg26.ar(hq.ab * v12, 23, 0x2FD, 480, 0, 2);
            arg26.fd(hq.ab * v12, 0, 0x7D, 23, 0xBD9839, 0x8B6608, 0x25D3FF6A);
            arg26.fd(hq.ab * v12 + 0x7D, 0, 640, 23, 0x4F4F4F, 0x292929, 0xF58E503B);
            arg24.ai(gs.nz, hq.ab * v12 + 62, 15, 0, -1, arg26);
            if(gy.em != null) {
                v9.ag(gy.em[1], hq.ab * v12 + 140, 1, 1);
                arg25.aq(gs.np, hq.ab * v12 + 0x98, 10, 0xFFFFFF, -1, arg26);
                v9.ag(gy.em[0], hq.ab * v12 + 140, 12, 1);
                arg25.aq(gs.nt, hq.ab * v12 + 0x98, 21, 0xFFFFFF, -1, arg26);
            }

            int v14 = 4;
            int v15 = 2;
            if(fy.ej != null) {
                ef v1 = ih.aq[0] != 0 || ih.ad[0] != 1 ? fy.ej[0] : fy.ej[v15];
                ef v7 = v1;
                v1 = ih.aq[0] != 0 || 1 != ih.ad[0] ? fy.ej[1] : fy.ej[3];
                ef v6 = v1;
                v1_1 = hq.ab * v12 + 280;
                v9.ag(v7, v1_1, v14, 1);
                v9.ag(v6, v1_1 + 15, v14, 1);
                arg24.aq(gs.nx, v1_1 + 0x20, 17, 0xFFFFFF, -1, arg26);
                v1_1 = hq.ab * v12 + 390;
                v9.ag(v7, v1_1, v14, 1);
                v9.ag(v6, v1_1 + 15, v14, 1);
                arg24.aq(gs.nk, v1_1 + 0x20, 17, 0xFFFFFF, -1, arg26);
                v1_1 = hq.ab * v12 + 500;
                v9.ag(v7, v1_1, v14, 1);
                v9.ag(v6, v1_1 + 15, v14, 1);
                arg24.aq(gs.nv, v1_1 + 0x20, 17, 0xFFFFFF, -1, arg26);
                v1_1 = hq.ab * v12 + 610;
                v9.ag(v7, v1_1, v14, 1);
                v9.ag(v6, v1_1 + 15, v14, 1);
                arg24.aq(gs.nn, v1_1 + 0x20, 17, 0xFFFFFF, -1, arg26);
            }

            arg26.ar(hq.ab * v12 + 708, 4, 50, 16, 0, 2);
            arg25.ai(gs.lb, hq.ab * v12 + 733, 16, 0xFFFFFF, -1, arg26);
            hq.ew = 0x80697E01;
            if(aw.er != null) {
                ce.eu = ds.bp(1227792800);
                v15 = 0x9BA2F453;
                hq.eg = ((ce.eu.ar * v15 + ih.ap * 0x6DE6A9AD - 1) / (ce.eu.ar * v15) - ce.eu.ae * 0xDFEB996D) * 0xDA5FB577;
                int v16 = 0xE513D117;
                if(bl.en != null && hq.ev * v16 > 0) {
                    v9.ag(bl.en, hq.ab * v12 + ce.eu.aj * 0xE1ECC05D - bl.en.ae - ce.eu.an * 0xEB8ABBEE, bv.tt * 742742805 / 2 - bl.en.ar / 2, 1);
                }

                if(ci.el != null && hq.ev * v16 < hq.eg * 1447801927) {
                    v9.ag(ci.el, hq.ab * v12 + ce.eu.ad * -1103381197 + ce.eu.an * 0xEB8ABBEE, bv.tt * 742742805 / 2 - ci.el.ar / 2, 1);
                }

                v2 = ce.eu.aq * 0x399617D7 + 23;
                v1_1 = hq.ab * v12 + ce.eu.aj * 0xE1ECC05D;
                int v3 = hq.ev * v16;
                int v6_1 = v1_1;
                int v7_1 = v2;
                int v17 = v3;
                v12 = ce.eu.ar * v15 * v3;
                v1_1 = 0;
                int v18 = 0;
                while(v12 < ih.ap * 0x6DE6A9AD) {
                    if(v17 - hq.ev * v16 >= ce.eu.ae * 0xDFEB996D) {
                    }
                    else {
                        ih v5 = ew.an[v12];
                        v3 = 0x98D051C9;
                        String v2_1 = Integer.toString(v5.av * v3);
                        if(v5.av * v3 == -1) {
                            v2_1 = gs.nf;
                            goto label_383;
                        }
                        else if(v5.av * v3 > 1980) {
                            v2_1 = gs.na;
                        label_383:
                            v14_1 = v2_1;
                            v2 = 0;
                        }
                        else {
                            v14_1 = v2_1;
                            v2 = 1;
                        }

                        if(v5.au(82)) {
                            v3 = v5.ab(0x63D1BCF9) ? 7 : 6;
                            goto label_404;
                        }
                        else if(v5.aa(2)) {
                            v3 = v5.ab(0x51C544AF) ? 5 : 4;
                            v20 = 0xFF0000;
                        }
                        else {
                            if(v5.ai(91)) {
                                if(v5.ab(0x6F28EE40)) {
                                    v3 = 3;
                                    goto label_404;
                                }

                                v3 = 2;
                            }
                            else {
                                v3 = v5.ab(0x1D665F3F) ? 1 : 0;
                            }

                        label_404:
                            v20 = 0;
                        }

                        int v21 = -250202335;
                        if(v10 < v6_1 || v11 < v7_1 || v10 >= ce.eu.ax * -204538603 + v6_1 || v11 >= ce.eu.al * v21 + v7_1 || v2 == 0) {
                            v13 = v5;
                            v15 = v6_1;
                            v8 = v7_1;
                            v9.aa(aw.er[v3], v15, v8, 25);
                            v22 = v1_1;
                        }
                        else {
                            hq.ew = 0x7F9681FF * v12;
                            v13 = v5;
                            v15 = v6_1;
                            v8 = v7_1;
                            arg26.bd(aw.er[v3], v6_1, v7_1, 0x80, 0xFFFFFF, 0x368904BA);
                            v22 = 1;
                        }

                        if(nc.eq != null) {
                            ef[] v1_2 = nc.eq;
                            v2 = v13.ab(1556937400) ? 8 : 0;
                            v9.ag(v1_2[v2 + v13.am * -479634605], v15 + 29, v8, 1);
                        }

                        arg24.ai(Integer.toString(v13.af * 0xBBB22DD), v15 + 15, ce.eu.al * v21 / 2 + v8 + 5, v20, -1, arg26);
                        arg25.ai(v14_1, v15 + 60, v8 + ce.eu.al * v21 / 2 + 5, 0xFFFFFFF, -1, arg26);
                        v7_1 = v8 + (ce.eu.al * v21 + ce.eu.ap * 0xDF01D95D);
                        v2 = v18 + 1;
                        if(v2 >= ce.eu.ar * 0x9BA2F453) {
                            v2 = ce.eu.aq * 0x399617D7 + 23;
                            v6_1 = v15 + (ce.eu.ax * -204538603 + ce.eu.an * 0x75C55DF7);
                            ++v17;
                            v7_1 = v2;
                            v18 = 0;
                        }
                        else {
                            v18 = v2;
                            v6_1 = v15;
                        }

                        ++v12;
                        v1_1 = v22;
                        continue;
                    }

                    break;
                }

                if(v1_1 == 0) {
                    return;
                }

                v8 = v0.ar(ew.an[hq.ew * 0xDE657DFF].au) + 6;
                v12 = v0.aj + 8;
                v1_1 = v11 + 25;
                v11 = v1_1 + v12 > 480 ? v11 - 25 - v12 : v1_1;
                arg26.ar(v10 - v8 / 2, v11, v8, v12, 0xFFFFA0, 2);
                arg26.fz(v10 - v8 / 2, v11, v8, v12, 0, -213664904);
                arg25.ai(ew.an[hq.ew * 0xDE657DFF].au, v10, v0.aj + v11 + 4, 0, -1, arg26);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_3 = new StringBuilder();
            v1_3.append("gn.bn(");
            v1_3.append(')');
            throw lx.al(((Throwable)v0_1), v1_3.toString());
        }
    }
}

