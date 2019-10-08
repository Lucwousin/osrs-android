public final class jk extends bm {
    int al;
    public int ax;

    jk() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jk.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static od af(ko arg0, ko arg1, String arg2, String arg3, int arg4) {
        arg4 = 0xD4A3E869;
        try {
            int v2 = arg0.ay(arg2, arg4);
            return ir.aj(arg0, arg1, v2, arg0.aw(v2, arg3, 0xFF916707), 0xDDB56DAE);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jk.af(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    protected final ca as() {
        try {
            return client.al(this.ax * 0xC8B95FFD, 517049503).ab(this.al * 0xEC9560D3, 80);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jk.as(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ax(ko arg0, ko arg1, int arg2) {
        try {
            dg.ax = arg0;
            dg.al = arg1;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jk.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ax(kx arg1, int arg2) {
        try {
            kz.ax = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("jk.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static void bo(jz arg11, fa arg12, int arg13) {
        try {
            int v11_1 = hq.fz.ae * 0x249E9B9;
            arg13 = hq.fz.ar * 0xEE0C033F;
            boolean v0 = hq.fz.an;
            boolean v1 = hq.fz.aj;
            boolean v2 = hq.fz.aq;
            boolean v3 = hq.fz.ab;
            hq.fz.ae(0x3684);
            int v4 = 0xDA4D3441;
            if(v1) {
                dr.bv(arg12, v4);
                return;
            }

            int v1_1 = -1692502361;
            int v5 = 0xE513D117;
            if((v2) && hq.ev * v5 > 0 && bl.en != null) {
                hq.ev -= v1_1;
            }

            if((v3) && hq.ev * v5 < hq.eg * 1447801927 && ci.el != null) {
                hq.ev += v1_1;
            }

            if(v0) {
                int v2_1 = 0x4D586FC3;
                int v0_1 = hq.ab * v2_1 + 280;
                int v6 = 18;
                int v7 = 4;
                if(v11_1 >= v0_1 && v11_1 <= v0_1 + 14 && arg13 >= v7 && arg13 <= v6) {
                    dk.al(0, 0, 0x26F45D17);
                    return;
                }

                if(v11_1 >= v0_1 + 15 && v11_1 <= v0_1 + 80 && arg13 >= v7 && arg13 <= v6) {
                    dk.al(0, 1, -1007274974);
                    return;
                }

                v0_1 = hq.ab * v2_1 + 390;
                if(v11_1 >= v0_1 && v11_1 <= v0_1 + 14 && arg13 >= v7 && arg13 <= v6) {
                    dk.al(1, 0, -715631074);
                    return;
                }

                if(v11_1 >= v0_1 + 15 && v11_1 <= v0_1 + 80 && arg13 >= v7 && arg13 <= v6) {
                    dk.al(1, 1, -1920145098);
                    return;
                }

                v0_1 = hq.ab * v2_1 + 500;
                int v8 = 2;
                if(v11_1 >= v0_1 && v11_1 <= v0_1 + 14 && arg13 >= v7 && arg13 <= v6) {
                    dk.al(v8, 0, 2078743267);
                    return;
                }

                if(v11_1 >= v0_1 + 15 && v11_1 <= v0_1 + 80 && arg13 >= v7 && arg13 <= v6) {
                    dk.al(v8, 1, 0xE154FA9C);
                    return;
                }

                v0_1 = hq.ab * v2_1 + 610;
                if(v11_1 >= v0_1 && v11_1 <= v0_1 + 14 && arg13 >= v7 && arg13 <= v6) {
                    dk.al(3, 0, 160780213);
                    return;
                }

                if(v11_1 >= v0_1 + 15 && v11_1 <= v0_1 + 80 && arg13 >= v7 && arg13 <= v6) {
                    dk.al(3, 1, 0xD096D8F9);
                    return;
                }

                if(v11_1 >= hq.ab * v2_1 + 708 && arg13 >= v7 && v11_1 <= hq.ab * v2_1 + 0x2F6 && arg13 <= 20) {
                    dr.bv(arg12, v4);
                    return;
                }

                int v3_1 = 0xDE657DFF;
                if(hq.ew * v3_1 != -1 && hq.ew * v3_1 == gy.bw(0x516823AE)) {
                    dm.by(ew.an[hq.ew * v3_1], -8502738);
                    dr.bv(arg12, v4);
                    return;
                }

                if(ce.eu == null) {
                    return;
                }

                v0_1 = 742742805;
                if(hq.ev * v5 > 0 && bl.en != null && v11_1 >= 0 && v11_1 <= hq.ab * v2_1 + ce.eu.aj * 0xE1ECC05D - ce.eu.an * 0xEB8ABBEE && arg13 >= bv.tt * v0_1 / v8 - 100 && arg13 <= bv.tt * v0_1 / v8 + 100) {
                    hq.ev -= v1_1;
                }

                if(hq.ev * v5 >= hq.eg * 1447801927) {
                    return;
                }

                if(ci.el == null) {
                    return;
                }

                if(v11_1 < ce.eu.an * 0xEB8ABBEE + (dq.tv * 0xD9CC4AFD - hq.ab * v2_1 - ce.eu.aj * 0xE1ECC05D)) {
                    return;
                }

                if(v11_1 > dq.tv * 0xD9CC4AFD) {
                    return;
                }

                if(arg13 < bv.tt * v0_1 / v8 - 100) {
                    return;
                }

                if(arg13 > bv.tt * v0_1 / v8 + 100) {
                    return;
                }

                hq.ev += v1_1;
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("jk.bo(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    static final void ci(int arg5) {
        int v1;
        try {
            arg5 = ho.ap * 0x474DFE7D;
            int[] v0 = ho.aj;
            v1 = 0;
            while(true) {
            label_5:
                if(v1 >= arg5) {
                    return;
                }

                hw v2 = client.jf[v0[v1]];
                if(v2 != null) {
                    id.ch(((ie)v2), 1, 20);
                }

                break;
            }
        }
        catch(RuntimeException v5) {
            goto label_18;
        }

        ++v1;
        goto label_5;
        return;
    label_18:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("jk.ci(");
        v0_1.append(')');
        throw lx.al(((Throwable)v5), v0_1.toString());
    }

    protected final ca db() {
        return client.al(this.ax * 0xC8B95FFD, 0x25EF210B).ab(this.al * 0xEC9560D3, 89);
    }

    protected final ca dm() {
        return client.al(this.ax * 0xC8B95FFD, 0x3FD04FA).ab(this.al * 0xEC9560D3, 2);
    }

    protected final ca du() {
        return client.al(this.ax * 0xC8B95FFD, 0x58CC8F98).ab(this.al * 0xEC9560D3, 104);
    }
}

