public abstract class bm extends mv {
    public int bh;

    protected bm() {
        try {
            super();
            this.bh = 0xCD530F8;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bm.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static int ar(int arg6, hl arg7, boolean arg8, byte arg9) {
        int[] v7_3;
        int[] v6_2;
        StringBuilder v7_1;
        ar v6_1;
        int v9 = 2;
        int v0 = 0;
        int v1 = 0x64D7CF4D;
        int v2 = 1304812425;
        if(100 != arg6) {
            goto label_90;
        }

        try {
            il.ad -= 0xDFB202B;
            arg6 = il.aj[il.ad * v2];
            int v7 = il.aj[il.ad * v2 + 1];
            v9 = il.aj[il.ad * v2 + v9];
            if(v7 != 0) {
                v6_1 = bl.al(arg6, v1);
                if(v6_1.fr == null) {
                    v6_1.fr = new ar[v9 + 1];
                }

                if(v6_1.fr.length <= v9) {
                    ar[] v1_1 = new ar[v9 + 1];
                    while(v0 < v6_1.fr.length) {
                        v1_1[v0] = v6_1.fr[v0];
                        ++v0;
                    }

                    v6_1.fr = v1_1;
                }

                if(v9 > 0) {
                    v1 = v9 - 1;
                    if(v6_1.fr[v1] != null) {
                    }
                    else {
                        v7_1 = new StringBuilder();
                        v7_1.append("");
                        v7_1.append(v1);
                        throw new RuntimeException(v7_1.toString());
                    }
                }

                ar v0_1 = new ar();
                v0_1.ay = v7 * 1179065427;
                v7 = v6_1.ah;
                v0_1.ah = v7;
                v0_1.bx = v7 * 0x5C16B2E5;
                v0_1.at = 0x8FF8D0FD * v9;
                v0_1.ag = true;
                v6_1.fr[v9] = v0_1;
                if(arg8) {
                    il.aa = v0_1;
                }
                else {
                    dw.av = v0_1;
                }

                kx.gw(v6_1, 0x7FC199DE);
                return 1;
            }

            throw new RuntimeException();
        label_90:
            ar v4 = null;
            if(arg6 == 101) {
                v6_1 = arg8 ? il.aa : dw.av;
                ar v7_2 = bl.al(v6_1.ah * 971580097, v1);
                v7_2.fr[v6_1.at * 990760021] = v4;
                kx.gw(v7_2, 0x7F08E8F1);
                return 1;
            }

            int v5 = 0x4A90AB9;
            if(102 == arg6) {
                v6_2 = il.aj;
                v7 = il.ad - v5;
                il.ad = v7;
                v6_1 = bl.al(v6_2[v7 * v2], v1);
                v6_1.fr = ((ar[])v4);
                kx.gw(v6_1, 0x7FC9AB16);
                return 1;
            }

            if(200 == arg6) {
                il.ad -= 0x9521572;
                arg6 = il.aj[il.ad * v2];
                v7 = il.aj[il.ad * v2 + 1];
                v6_1 = eh.ae(arg6, v7, 0xCB4AD56D);
                if(v6_1 == null || v7 == -1) {
                    v6_2 = il.aj;
                    v7 = il.ad + v5;
                    il.ad = v7;
                    v6_2[v7 * v2 - 1] = 0;
                }
                else {
                    v7_3 = il.aj;
                    v9 = il.ad + v5;
                    il.ad = v9;
                    v7_3[v9 * v2 - 1] = 1;
                    if(arg8) {
                        il.aa = v6_1;
                    }
                    else {
                        dw.av = v6_1;
                    }
                }

                return 1;
            }

            if(201 != arg6) {
                return v9;
            }

            v6_2 = il.aj;
            v7 = il.ad - v5;
            il.ad = v7;
            v6_1 = bl.al(v6_2[v7 * v2], v1);
            if(v6_1 != null) {
                v7_3 = il.aj;
                v9 = il.ad + v5;
                il.ad = v9;
                v7_3[v9 * v2 - 1] = 1;
                if(arg8) {
                    il.aa = v6_1;
                }
                else {
                    dw.av = v6_1;
                }
            }
            else {
                v6_2 = il.aj;
                v7 = il.ad + v5;
                il.ad = v7;
                v6_2[v7 * v2 - 1] = 0;
                return 1;
            label_89:
                goto label_193;
            }

            return 1;
        }
        catch(RuntimeException v6) {
            goto label_89;
        }

    label_193:
        v7_1 = new StringBuilder();
        v7_1.append("bm.ar(");
        v7_1.append(')');
        throw lx.al(((Throwable)v6), v7_1.toString());
        return 1;
    }

    protected abstract ca as();

    protected abstract ca db();

    protected abstract ca dm();

    protected abstract ca du();

    static final void ei(boolean arg8, lo arg9, int arg10) {
        int v1;
        int v0;
        while(true) {
            arg10 = 0x6E311C05;
            try {
                if(arg9.jr(client.eh.ad * arg10, 0xD572D932) < 27) {
                }
                else {
                    v0 = 15;
                    arg10 = arg9.jo(v0, 0xA160E74C);
                    if(0x7FFF == arg10) {
                        goto label_14;
                    }

                    goto label_17;
                }

            label_14:
                arg9.ju(0x75A57D56);
                return;
            label_17:
                boolean v2 = false;
                if(client.ev[arg10] == null) {
                    client.ev[arg10] = new ii();
                    v1 = 1;
                }
                else {
                    v1 = 0;
                }

                ii v4 = client.ev[arg10];
                int[] v5 = client.eu;
                int v6 = client.eg - 0x5B7582D9;
                client.eg = v6;
                v5[v6 * 359080599 - 1] = arg10;
                v4.dw = client.bj * 0x680C616B;
                if(arg9.jo(1, 0xADD5F7C6) == 1) {
                    v5 = client.ed;
                    v6 = client.ee - 0x4C1055A3;
                    client.ee = v6;
                    v5[v6 * -1429440011 - 1] = arg10;
                }

                arg10 = client.jv[arg9.jo(3, 0xB0745EE2)];
                if(v1 != 0) {
                    arg10 *= 0x953A66E9;
                    v4.bo = arg10;
                    v4.du = arg10 * 0x9850BA6B;
                }

                arg10 = 0x7F;
                v1 = 5;
                int v5_1 = 8;
                if(arg8) {
                    v6 = arg9.jo(v5_1, -1311950214);
                    if(v6 > arg10) {
                        v6 += 0xFFFFFF00;
                    }
                }
                else {
                    v6 = arg9.jo(v1, 0xAF81B373);
                    if(v6 > v0) {
                        v6 += 0xFFFFFFE0;
                    }
                }

                int v7 = arg9.jo(1, 0xCA2F9F77);
                if(arg8) {
                    v0 = arg9.jo(v5_1, 0xB750D937);
                    if(v0 > arg10) {
                        v0 += 0xFFFFFF00;
                    }
                }
                else {
                    arg10 = arg9.jo(v1, 0xC5242281);
                    v0 = arg10 > v0 ? arg10 - 0x20 : arg10;
                }

                v4.ax = au.al(arg9.jo(14, -1271023634), 1);
                v4.by = v4.ax.aj * 0x5B9583C7;
                v4.de = v4.ax.bn * 0xA3F3810F;
                if(v4.de * 580719067 == 0) {
                    v4.bo = 0;
                }

                v4.bg = v4.ax.av * 0xE37E9855;
                v4.bz = v4.ax.aa * 0xEF71CCF7;
                v4.bb = v4.ax.au * 0xE030253D;
                v4.bc = v4.ax.am * 0xC14F3967;
                v4.bv = v4.ax.ab * -1960689985;
                v4.bq = v4.ax.af * 0x81BE8E5B;
                v4.bx = v4.ax.ai * 0x6460DFFB;
                arg10 = gu.jg.dc[0] + v6;
                v1 = gu.jg.dj[0] + v0;
                if(1 == v7) {
                    v2 = true;
                }

                v4.al(arg10, v1, v2, 46);
                continue;
            }
            catch(RuntimeException v8) {
                StringBuilder v9 = new StringBuilder();
                v9.append("bm.ei(");
                v9.append(')');
                throw lx.al(((Throwable)v8), v9.toString());
            }
        }
    }
}

