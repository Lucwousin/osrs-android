import java.security.SecureRandom;

public final class iq extends mx {
    hx aa;
    int ab;
    int ad;
    int ae;
    int af;
    int[] ai;
    int aj;
    int al;
    int an;
    int ap;
    hx aq;
    int ar;
    do au;
    int av;
    static fi ax;
    static SecureRandom ej;

    static {
        iq.ax = new fi();
    }

    iq() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("iq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void aa(int arg5, int arg6, int arg7, do arg8, int arg9) {
        iq v0 = new iq();
        v0.al = arg5 * 0x378CE0B1;
        v0.ae = 0x71DAB880 * arg6;
        v0.ar = 0xCF17E580 * arg7;
        int v1 = 0xB46CA623;
        arg5 = arg8.az * v1;
        int v3 = 0x4B9D7897;
        int v2 = arg8.ag * v3;
        if(arg9 == 1 || 3 == arg9) {
            arg5 = arg8.ag * v3;
            v2 = arg8.az * v1;
        }

        v0.an = (arg5 + arg6) * 0x64903B80;
        v0.ap = (v2 + arg7) * 0xDA792E80;
        v0.ad = arg8.bj * -1017298225;
        v0.aj = arg8.bu * 0x8B5F5380;
        v0.ab = arg8.bs * 0xE1202473;
        v0.af = arg8.be * 0x3DDCE3FF;
        v0.ai = arg8.bl;
        if(arg8.bc != null) {
            v0.au = arg8;
            v0.ae(0x9C77EB09);
        }

        iq.ax.al(((mx)v0));
        if(v0.ai != null) {
            v0.av = (v0.ab * 0xD2ABCE41 + (((int)(Math.random() * (((double)(v0.af * 1919520231 - v0.ab * 0xD2ABCE41))))))) * 0xC9790F0D;
        }
    }

    public static int ab(CharSequence arg3, byte arg4) {
        int v1;
        try {
            int v4 = arg3.length();
            int v0 = 0;
            v1 = 0;
            while(v0 < v4) {
                v1 = arg3.charAt(v0) + ((v1 << 5) - v1);
                ++v0;
            }
        }
        catch(RuntimeException v3) {
            goto label_13;
        }

        return v1;
    label_13:
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("iq.ab(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
    }

    static void ab() {
        mx v0;
        for(v0 = iq.ax.aj(); v0 != null; v0 = iq.ax.aq()) {
            if(((iq)v0).au != null) {
                ((iq)v0).ae(0x9C77EB09);
            }
        }
    }

    static void ad() {
        mx v0;
        for(v0 = iq.ax.aj(); v0 != null; v0 = iq.ax.aq()) {
            if(((iq)v0).au != null) {
                ((iq)v0).ae(0x9C77EB09);
            }
        }
    }

    void ae(int arg6) {
        try {
            int v0 = 2046701285;
            arg6 = this.ad * v0;
            do v1 = this.au.ai(0xC8E8DA08);
            int[] v2 = null;
            if(v1 != null) {
                this.ad = v1.bj * -1017298225;
                this.aj = v1.bu * 0x8B5F5380;
                this.ab = v1.bs * 0xE1202473;
                this.af = v1.be * 0x3DDCE3FF;
                this.ai = v1.bl;
            }
            else {
                this.ad = -1656020717;
                this.aj = 0;
                this.ab = 0;
                this.af = 0;
                this.ai = v2;
            }

            if(arg6 != this.ad * v0 && this.aq != null) {
                lo.pr.al(this.aq);
                this.aq = ((hx)v2);
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("iq.ae(");
            v0_1.append(')');
            throw lx.al(((Throwable)v6), v0_1.toString());
        }
    }

    static void af() {
        mx v0;
        for(v0 = iq.ax.aj(); v0 != null; v0 = iq.ax.aq()) {
            if(((iq)v0).au != null) {
                ((iq)v0).ae(0x9C77EB09);
            }
        }
    }

    void ai() {
        int v0 = this.ad * 2046701285;
        do v1 = this.au.ai(1031653282);
        int[] v2 = null;
        if(v1 != null) {
            this.ad = v1.bj * 103935830;
            this.aj = v1.bu * 0x693EF086;
            this.ab = v1.bs * 0x9207CC77;
            this.af = v1.be * 0x3DDCE3FF;
            this.ai = v1.bl;
        }
        else {
            this.ad = -1656020717;
            this.aj = 0;
            this.ab = 0;
            this.af = 0;
            this.ai = v2;
        }

        if(v0 != this.ad * 195194060 && this.aq != null) {
            lo.pr.al(this.aq);
            this.aq = ((hx)v2);
        }
    }

    static void aj() {
        mx v0;
        for(v0 = iq.ax.aj(); v0 != null; v0 = iq.ax.aq()) {
            hx v2 = null;
            if(((iq)v0).aq != null) {
                lo.pr.al(((iq)v0).aq);
                ((iq)v0).aq = v2;
            }

            if(((iq)v0).aa != null) {
                lo.pr.al(((iq)v0).aa);
                ((iq)v0).aa = v2;
            }
        }

        iq.ax.ax();
    }

    static void ap() {
        mx v0;
        for(v0 = iq.ax.aj(); v0 != null; v0 = iq.ax.aq()) {
            hx v2 = null;
            if(((iq)v0).aq != null) {
                lo.pr.al(((iq)v0).aq);
                ((iq)v0).aq = v2;
            }

            if(((iq)v0).aa != null) {
                lo.pr.al(((iq)v0).aa);
                ((iq)v0).aa = v2;
            }
        }

        iq.ax.ax();
    }

    static void aq() {
        mx v0;
        for(v0 = iq.ax.aj(); v0 != null; v0 = iq.ax.aq()) {
            if(((iq)v0).au != null) {
                ((iq)v0).ae(0x9C77EB09);
            }
        }
    }

    static void au(int arg11, int arg12, int arg13, int arg14) {
        hx v1_2;
        hb v1_1;
        int v1;
        mx v0;
        for(v0 = iq.ax.aj(); v0 != null; v0 = iq.ax.aq()) {
            int v2 = 2046701285;
            int v3 = -1;
            if(v3 != ((iq)v0).ad * v2 || ((iq)v0).ai != null) {
                int v4 = 1657715015;
                if(arg12 > ((iq)v0).an * v4) {
                    v1 = arg12 - ((iq)v0).an * v4;
                }
                else {
                    v4 = 0x27306B91;
                    v1 = arg12 < ((iq)v0).ae * v4 ? ((iq)v0).ae * v4 - arg12 : 0;
                }

                int v6 = 0x2EAD71F5;
                if(arg13 > ((iq)v0).ap * v6) {
                    v1 += arg13 - ((iq)v0).ap * v6;
                }
                else {
                    v6 = 0x2080FDE3;
                    if(arg13 < ((iq)v0).ar * v6) {
                        v1 += ((iq)v0).ar * v6 - arg13;
                    }
                }

                int v7 = 277054701;
                hx v8 = null;
                if(v1 - 0x40 <= ((iq)v0).aj * v7) {
                    v6 = 0x6EC3BC9B;
                    if(client.py * v6 != 0) {
                        if(((iq)v0).al * -1800050607 != arg11) {
                        }
                        else {
                            v1 += 0xFFFFFFC0;
                            if(v1 < 0) {
                                v1 = 0;
                            }

                            v4 = (((iq)v0).aj * v7 - v1) * (client.py * v6) / (((iq)v0).aj * v7);
                            v6 = 100;
                            if(((iq)v0).aq != null) {
                                ((iq)v0).aq.ai(v4);
                            }
                            else if(((iq)v0).ad * v2 >= 0) {
                                v1_1 = hb.ax(fq.cg, ((iq)v0).ad * v2, 0);
                                if(v1_1 != null) {
                                    v1_2 = hx.ae(v1_1.al().ax(oz.pp), v6, v4);
                                    v1_2.ab(v3);
                                    lo.pr.ax(((hz)v1_2));
                                    ((iq)v0).aq = v1_2;
                                }
                            }

                            if(((iq)v0).aa == null) {
                                if(((iq)v0).ai == null) {
                                    goto label_164;
                                }

                                v2 = 0xC9790F0D;
                                v1 = ((iq)v0).av - arg14 * v2;
                                ((iq)v0).av = v1;
                                if(v1 * -1709025339 > 0) {
                                    goto label_164;
                                }

                                v1_1 = hb.ax(fq.cg, ((iq)v0).ai[((int)(Math.random() * (((double)((iq)v0).ai.length))))], 0);
                                if(v1_1 == null) {
                                    goto label_164;
                                }

                                v1_2 = hx.ae(v1_1.al().ax(oz.pp), v6, v4);
                                v1_2.ab(0);
                                lo.pr.ax(((hz)v1_2));
                                ((iq)v0).aa = v1_2;
                                ((iq)v0).av = (((iq)v0).ab * 0xD2ABCE41 + (((int)(Math.random() * (((double)(((iq)v0).af * 1919520231 - ((iq)v0).ab * 0xD2ABCE41))))))) * v2;
                                goto label_164;
                            }

                            ((iq)v0).aa.ai(v4);
                            if(((iq)v0).aa.lh()) {
                                goto label_164;
                            }

                            ((iq)v0).aa = v8;
                            goto label_164;
                        }
                    }
                }

                if(((iq)v0).aq != null) {
                    lo.pr.al(((iq)v0).aq);
                    ((iq)v0).aq = v8;
                }

                if(((iq)v0).aa == null) {
                    goto label_164;
                }

                lo.pr.al(((iq)v0).aa);
                ((iq)v0).aa = v8;
            }
            else {
            }

        label_164:
        }
    }

    void av() {
        int v1 = 2046701285;
        int v0 = this.ad * v1;
        do v2 = this.au.ai(0xD0C3D332);
        int[] v3 = null;
        if(v2 != null) {
            this.ad = v2.bj * -1017298225;
            this.aj = v2.bu * 0x8B5F5380;
            this.ab = v2.bs * 0xE1202473;
            this.af = v2.be * 0x3DDCE3FF;
            this.ai = v2.bl;
        }
        else {
            this.ad = -1656020717;
            this.aj = 0;
            this.ab = 0;
            this.af = 0;
            this.ai = v3;
        }

        if(v0 != this.ad * v1 && this.aq != null) {
            lo.pr.al(this.aq);
            this.aq = ((hx)v3);
        }
    }

    public static String ax(CharSequence arg5, byte arg6) {
        try {
            int v6 = arg5.length();
            StringBuilder v0 = new StringBuilder(v6);
            int v1;
            for(v1 = 0; v1 < v6; ++v1) {
                char v2 = arg5.charAt(v1);
                if(v2 < 97 || v2 > 0x7A) {
                    if((v2 < 65 || v2 > 90) && (v2 < 0x30 || v2 > 57) && v2 != 46 && 45 != v2 && v2 != 42 && 0x5F != v2) {
                        if(0x20 == v2) {
                            v0.append('+');
                            goto label_58;
                        }

                        int v2_1 = je.ax(v2, 0x6F424B12);
                        v0.append('%');
                        int v3 = v2_1 >> 4 & 15;
                        int v4 = 10;
                        if(v3 >= v4) {
                            v0.append(((char)(v3 + 55)));
                        }
                        else {
                            v0.append(((char)(v3 + 0x30)));
                        }

                        v2_1 &= 15;
                        if(v2_1 >= v4) {
                            v0.append(((char)(v2_1 + 55)));
                            goto label_58;
                        }

                        v0.append(((char)(v2_1 + 0x30)));
                        goto label_58;
                    }

                label_57:
                    v0.append(v2);
                }
                else {
                    goto label_57;
                }

            label_58:
            }

            return v0.toString();
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("iq.ax(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    static final void cz(ie arg19, int arg20) {
        int v18;
        ie v0 = arg19;
        int v1 = 1506269059;
        try {
            v0.cp = v0.bv * v1;
            int v2 = -1091885127;
            if(v0.dk * v2 == 0) {
                v0.dy = 0;
                return;
            }

            int v4 = 0xB812F715;
            int v5 = 0x64526F3D;
            int v6 = -1;
            if(v0.ch * 2011890317 != v6 && v0.cz * 0x3C37F003 == 0) {
                df v1_1 = fs.al(v0.ch * 2011890317, 1304812425);
                if(v0.df * v5 > 0 && v1_1.az * 0x8C0143D9 == 0) {
                    v0.dy += v4;
                    return;
                }

                if(v0.df * v5 > 0) {
                    goto label_50;
                }

                if(v1_1.ag * -635149083 != 0) {
                    goto label_50;
                }

                v0.dy += v4;
                return;
            }

        label_50:
            int v7 = 0x914F0683;
            v1 = v0.bp * v7;
            int v8 = v0.bw * 0xD19D0C3D;
            int v10 = v0.dc[v0.dk * v2 - 1] * 0x80 + v0.by * 0x346259C0;
            int v11 = v0.dj[v0.dk * v2 - 1] * 0x80 + v0.by * 0x346259C0;
            if(v1 < v10) {
                if(v8 < v11) {
                    v0.du = 0xF782EF00;
                }
                else if(v8 > v11) {
                    v0.du = 0xF41DB500;
                }
                else {
                    v0.du = 0xF5D05200;
                }
            }
            else if(v1 > v10) {
                if(v8 < v11) {
                    v0.du = 0xFAE82900;
                }
                else if(v8 > v11) {
                    v0.du = 0xFE4D6300;
                }
                else {
                    v0.du = 0xFC9AC600;
                }
            }
            else if(v8 < v11) {
                v0.du = 0xF9358C00;
            }
            else if(v8 > v11) {
                v0.du = 0;
            }

            int v3 = v0.ds[v0.dk * v2 - 1];
            int v13 = v10 - v1;
            int v14 = 0x100;
            int v16 = 0x3CF9F82B;
            if(v13 <= v14) {
                v5 = 0xFFFFFF00;
                if(v13 >= v5) {
                    v13 = v11 - v8;
                    if(v13 <= v14) {
                        if(v13 < v5) {
                        }
                        else {
                            int v9 = v0.du * 0xE97D9C4B - v0.bo * 0x3A7ED159 & 0x7FF;
                            if(v9 > 0x400) {
                                v9 += 0xFFFFF800;
                            }

                            v13 = v0.bz * 0x6CF7308B;
                            int v17 = -1033624731;
                            if(v9 < v5 || v9 > v14) {
                                if(v9 >= v14 && v9 < 0x300) {
                                    v13 = v0.bc * 0xA392FBBB;
                                    goto label_155;
                                }

                                if(v9 < 0xFFFFFD00) {
                                    goto label_155;
                                }

                                if(v9 > v5) {
                                    goto label_155;
                                }

                                v13 = v0.bb * 0x76D7CC01;
                            }
                            else {
                                v13 = v0.bg * v17;
                            }

                        label_155:
                            if(v13 == v6) {
                                v13 = v0.bg * v17;
                            }

                            v0.cp = v13 * 0x306BEA93;
                            boolean v9_1 = (v0 instanceof ii) ? v0.ax.bt : true;
                            v13 = 2;
                            v14 = 8;
                            if(v9_1) {
                                v18 = v0.bo * 0x3A7ED159 == v0.du * 0xE97D9C4B || v0.cy * 0x5A6E7359 != v6 || v0.de * 580719067 == 0 ? 4 : 2;
                                if(v0.dk * v2 > v13) {
                                    v18 = 6;
                                }

                                if(v0.dk * v2 > 3) {
                                    v18 = 8;
                                }

                                if(v0.dy * 0x2856A03D <= 0) {
                                    goto label_232;
                                }

                                if(v0.dk * v2 <= 1) {
                                    goto label_232;
                                }

                                v0.dy -= v4;
                                goto label_231;
                            }
                            else {
                                v18 = v0.dk * v2 > 1 ? 6 : 4;
                                if(v0.dk * v2 > v13) {
                                    v18 = 8;
                                }

                                if(v0.dy * 0x2856A03D <= 0) {
                                    goto label_232;
                                }

                                if(v0.dk * v2 <= 1) {
                                    goto label_232;
                                }

                                v0.dy -= v4;
                            label_231:
                                v18 = 8;
                            }

                        label_232:
                            if(v13 == v3) {
                                v18 <<= 1;
                            }

                            v2 = v18;
                            if(v2 >= v14 && v0.cp * -1493580901 == v0.bg * v17 && v6 != v0.bk * 1303697877) {
                                v0.cp = v0.bk * 0xE9FCC74F;
                            }

                            if(v10 != v1 || v8 != v11) {
                                if(v1 < v10) {
                                    v0.bp += v2 * v16;
                                    if(v0.bp * v7 > v10) {
                                        v0.bp = v10 * v16;
                                    }
                                }
                                else if(v1 > v10) {
                                    v0.bp -= v2 * v16;
                                    if(v0.bp * v7 < v10) {
                                        v0.bp = v10 * v16;
                                    }
                                }

                                if(v8 < v11) {
                                    v3 = -410326251;
                                    v0.bw += v2 * v3;
                                    if(v0.bw * 0xD19D0C3D <= v11) {
                                        goto label_298;
                                    }

                                    v0.bw = v11 * v3;
                                    goto label_298;
                                }

                                if(v8 <= v11) {
                                    goto label_298;
                                }

                                v3 = -410326251;
                                v0.bw -= v2 * v3;
                                if(v0.bw * 0xD19D0C3D >= v11) {
                                    goto label_298;
                                }

                                v0.bw = v11 * v3;
                            }

                        label_298:
                            if(v0.bp * v7 == v10 && v0.bw * 0xD19D0C3D == v11) {
                                v0.dk -= -1133990263;
                                if(v0.df * 0x64526F3D > 0) {
                                    v0.df -= 0x41FE6015;
                                }
                            }

                            return;
                        }
                    }
                }
            }

            v0.bp = v10 * v16;
            v0.bw = v11 * -410326251;
            v0.dk -= -1133990263;
            if(v0.df * 0x64526F3D > 0) {
                v0.df -= 0x41FE6015;
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append("iq.cz(");
            v1_2.append(')');
            throw lx.al(((Throwable)v0_1), v1_2.toString());
        }
    }

    static final void dw(int arg32, int arg33, int arg34, int arg35, int arg36) {
        int v0_2;
        long v30;
        int v27;
        int v11_1;
        int v10_1;
        int v6;
        try {
            long v0_1 = System.nanoTime();
            client.if += 0xA4FAD31B;
            ek.du(11670);
            fe.dm(0x7CE19F9B);
            dt.de(59);
            int v3 = 1;
            cd.dj(true, 0x91721BDF);
            ap.dk(1);
            cd.dj(false, -1099156636);
            io.ds(163891803);
            mf.dy(1);
            ao.db(arg32, arg33, arg34, arg35, true, 0x7CF4);
            int v2 = 0xAA3DE4C9 * client.qd;
            int v5 = client.qb * -449081621;
            int v12 = client.ql * 0xDCCE0B33;
            int v15 = client.qj * 927018595;
            int v14 = v2 + v12;
            int v13 = v15 + v5;
            client.al.uu.ax(0x8227BFC8).ef(v2, v5, v14, v13, 0x5C1D4DB7);
            bk v11 = client.al.abx(0xB840F3F1);
            bt v10 = v11.ax(0xAA835254);
            v10.ax(-57);
            bt v4 = v10;
            bk v24 = v11;
            v10.bv(v2, v5, v14, v13, 0xEAAC2B9F);
            v4.bq(0x3BF5F56D);
            int v7 = 0x80;
            int v8 = 4;
            if(!client.pi) {
                v6 = cs.cw(hv.ri, 2049448812);
                v10_1 = 0x2C7110CF;
                if(client.ia * v10_1 / 0x100 > v6) {
                    v6 = client.ia * v10_1 / 0x100;
                }

                if((client.qc[v8]) && client.qk[v8] + v7 > v6) {
                    v6 = client.qk[v8] + v7;
                }

                v7 = v13;
                v10_1 = v14;
                v11_1 = v15;
                gq.er(aq.hk * 0xBD6EF571, 0x72F9E57B * co.hu, 0x438776D9 * ma.hw, v6, ad.cc(hv.ri, 0x2C2F2917) & 0x7FF, fr.bn(v6, 0xC50135CF), v11_1, 0xF069A14E);
            }
            else {
                v7 = v13;
                v10_1 = v14;
                v11_1 = v15;
            }

            v6 = !client.pi ? fj.df(0x60CBE63B) : dv.dl(0xCF4FB3FD);
            int v23 = v6;
            v6 = ag.hc * 0x594485D5;
            v13 = bu.hi * 0x92B48CBF;
            int v16 = -1102211305;
            v15 = fg.hb * v16;
            int v18 = 0xAD05ECC3;
            int v25 = fy.hd * v18;
            int v19 = 2069602569;
            int v26 = it.hh * v19;
            v14 = 0;
            while(true) {
                v27 = 0x71608B7D;
                if(v14 >= 5) {
                    break;
                }

                if(client.qc[v14]) {
                    v30 = v0_1;
                    v0_2 = ((int)(Math.random() * (((double)(client.qv[v14] * 2 + v3))) - (((double)client.qv[v14])) + Math.sin((((double)client.qt[v14])) / 100 * (((double)client.qs[v14]))) * (((double)client.qk[v14]))));
                    if(v14 == 0) {
                        ag.hc += v27 * v0_2;
                    }

                    if(v14 == 1) {
                        bu.hi += 0x303CE33F * v0_2;
                    }

                    if(2 == v14) {
                        fg.hb += 0x543710A7 * v0_2;
                    }

                    if(3 == v14) {
                        it.hh = (it.hh * v19 + v0_2 & 0x7FF) * 0xB9EA3D39;
                    }

                    if(v14 != 4) {
                        goto label_236;
                    }

                    fy.hd += v0_2 * 0x53FB23EB;
                    if(fy.hd * v18 < 0x80) {
                        fy.hd = -40766080;
                    }

                    if(fy.hd * v18 <= 0x17F) {
                        goto label_237;
                    }

                    fy.hd = 0xA4BABC95;
                }
                else {
                    v30 = v0_1;
                label_236:
                }

            label_237:
                ++v14;
                v0_1 = v30;
                v3 = 1;
            }

            v30 = v0_1;
            int v1 = -1;
            if(gu.bk(-2071183666)) {
                v1 = -969859905 * dt.bu.ab;
                v0_2 = dt.bu.af * 0xAC955593;
            }
            else {
                v0_2 = -1;
            }

            boolean v3_1 = v1 < v2 || v1 >= v10_1 || v0_2 < v5 || v0_2 >= v7 ? false : true;
            gx.au(v1 - v2, v0_2 - v5, v3_1, 1);
            bk v3_2 = v24;
            v3_2.af(client.bj * -2077001153, 0xD03FA5A4);
            cw.bu(0x777973FF);
            cw.bu(-1435879802);
            v0_2 = v4.by(2108411565);
            v4.ae(client.qy * 0x5F4F90D3, 0xC6F51766);
            if(client.st) {
                ee.fs.bb(v3_2, ag.hc * 0x594485D5, bu.hi * 0x92B48CBF, fg.hb * v16, fy.hd * v18, it.hh * v19, v23);
            }

            v4.bo(v0_2, 0x30885906);
            cw.bu(0x4A59C846);
            ee.fs.au();
            ei.dq(v2, v5, v12, v11_1, -2108026303);
            je.dr(v2, v5, 472006546);
            ii.au.bn(client.gs * 0x65B3A7FD, -19);
            ft.dd(-1784195190);
            ag.hc = v6 * v27;
            bu.hi = v13 * 0x303CE33F;
            fg.hb = v15 * 0x543710A7;
            fy.hd = v25 * 0x53FB23EB;
            it.hh = v26 * 0xB9EA3D39;
            if((client.bm) && ew.ad(true, false, 0x2AF027E3) == 0) {
                client.bm = false;
            }

            if(client.bm) {
                client.al.uu.ax(0xFF48FC86).ar(v2, v5, v12, v11_1, 0, 2);
                eq.dh(gs.ai, false, 0xB7B9BB0C);
            }

            client.sp.ax(System.nanoTime() - v30);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("iq.dw(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    static void fg(ar arg8, int arg9, int arg10, int arg11) {
        int v6;
        int v5;
        try {
            int v0 = 0xADE95C4D;
            int v1 = 4;
            int v2 = 3;
            int v4 = 2;
            if(arg8.as * v0 == 0) {
                arg8.bw = arg8.ba * 0xAE87BAED;
            }
            else {
                v5 = 0x1804E4A5;
                v6 = -1196312601;
                int v7 = 0x82CA0C0B;
                if(arg8.as * v0 == 1) {
                    arg8.bw = ((arg9 - arg8.by * v5) / v4 + arg8.ba * v6) * v7;
                }
                else if(arg8.as * v0 == v4) {
                    arg8.bw = (arg9 - arg8.by * v5 - arg8.ba * v6) * v7;
                }
                else if(v2 == arg8.as * v0) {
                    arg8.bw = (arg9 * (arg8.ba * v6) >> 14) * v7;
                }
                else if(v1 == arg8.as * v0) {
                    arg8.bw = ((arg9 - arg8.by * v5) / v4 + (arg9 * (arg8.ba * v6) >> 14)) * v7;
                }
                else {
                    arg8.bw = (arg9 - arg8.by * v5 - (arg8.ba * v6 * arg9 >> 14)) * v7;
                }
            }

            arg11 = 0xA0B3EF45;
            if(arg8.ak * arg11 == 0) {
                arg8.bo = arg8.bf * 0x31F4ECD;
            }
            else {
                v0 = 0x6F0D2CD;
                v5 = 312819101;
                v6 = 0xA1A726F1;
                if(1 == arg8.ak * arg11) {
                    arg8.bo = (arg8.bf * v6 + (arg10 - arg8.bt * v0) / v4) * v5;
                }
                else if(v4 == arg8.ak * arg11) {
                    arg8.bo = (arg10 - arg8.bt * v0 - arg8.bf * v6) * v5;
                }
                else if(v2 == arg8.ak * arg11) {
                    arg8.bo = (arg10 * (arg8.bf * v6) >> 14) * v5;
                }
                else if(v1 == arg8.ak * arg11) {
                    arg8.bo = ((arg10 - arg8.bt * v0) / v4 + (arg8.bf * v6 * arg10 >> 14)) * v5;
                }
                else {
                    arg8.bo = (arg10 - arg8.bt * v0 - (arg8.bf * v6 * arg10 >> 14)) * v5;
                }
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("iq.fg(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }
}

