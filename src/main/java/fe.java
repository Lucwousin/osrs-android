public class fe {
    static int ae = 0;
    public static final int ah = 1;
    static String ai = null;
    static int al = 0;
    static int[] ap = null;
    public static final int aq = 24;
    static int[] ar = null;
    public static final int at = 20;

    fe() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fe.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static int aa(int arg2, hl arg3, boolean arg4, byte arg5) {
        int v4;
        int[] v2_1;
        if(arg4) {
            try {
                ar v3 = il.aa;
                goto label_4;
            label_3:
                v3 = dw.av;
            label_4:
                int v5 = 1304812425;
                int v0 = 0x4A90AB9;
                if(1600 == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.bz * 0x55D2B057;
                    return 1;
                }

                if(1601 == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.bh * 0x4407680D;
                    return 1;
                }

                if(1602 == arg2) {
                    String[] v2_2 = il.aq;
                    v4 = ft.ab - 0x705DCADB;
                    ft.ab = v4;
                    v2_2[v4 * 0xBC5CDEAD - 1] = v3.dp;
                    return 1;
                }

                if(1603 == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.bb * 0x83EA0C19;
                    return 1;
                }

                if(arg2 == 1604) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.bc * 1153505113;
                    return 1;
                }

                if(arg2 == 1605) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.ct * 0x80577949;
                    return 1;
                }

                if(1606 == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.cl * 8000905;
                    return 1;
                }

                if(arg2 == 1607) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.cm * 0xC9EFBC3;
                    return 1;
                }

                if(arg2 == 1608) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.ck * 0x21D4CFF7;
                    return 1;
                }

                if(arg2 == 1609) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.bl * 0xBB0925D;
                    return 1;
                }

                if(1610 == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.br * 0x379F3195;
                    return 1;
                }

                if(arg2 == 0x64B) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.bk * 0xC0871BB;
                    return 1;
                }

                if(0x64C == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.bm * 0x5A489AAF;
                    return 1;
                }

                if(0x64D == arg2) {
                    v2_1 = il.aj;
                    v4 = il.ad + v0;
                    il.ad = v4;
                    v2_1[v4 * v5 - 1] = v3.be.ax(0xAEC38BFB);
                    return 1;
                }

                if(0x64E != arg2) {
                    return 2;
                }

                v2_1 = il.aj;
                v4 = il.ad + v0;
                il.ad = v4;
                v4 = v4 * v5 - 1;
                int v3_1 = v3.cg ? 1 : 0;
                v2_1[v4] = v3_1;
                return 1;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_2 = new StringBuilder();
                v3_2.append("fe.aa(");
                v3_2.append(')');
                throw lx.al(((Throwable)v2), v3_2.toString());
            }
        }
        else {
            goto label_3;
        }

        goto label_4;
        return 2;
    }

    public static ef[] ac(byte[] arg1) {
        dy.aw(arg1, -1051220373);
        return ac.au(0x3D92);
    }

    public static double[] ae(double arg8, double arg10, int arg12, int arg13) {
        double[] v13;
        arg13 = arg12 * 2 + 1;
        try {
            v13 = new double[arg13];
            int v0 = -arg12;
            int v1;
            for(v1 = 0; v0 <= arg12; ++v1) {
                v13[v1] = mz.al(((double)v0), arg8, arg10);
                ++v0;
            }
        }
        catch(RuntimeException v8) {
            goto label_17;
        }

        return v13;
    label_17:
        StringBuilder v9 = new StringBuilder();
        v9.append("fe.ae(");
        v9.append(')');
        throw lx.al(((Throwable)v8), v9.toString());
    }

    public static ef[] ak(byte[] arg1) {
        dy.aw(arg1, 0x9310833C);
        return ac.au(0x6111);
    }

    public static String ar(CharSequence arg1, int arg2) {
        String v1_1;
        arg2 = 0x88FD2DA2;
        try {
            v1_1 = as.al(cb.ax(arg1, arg2));
            if(v1_1 == null) {
                v1_1 = "";
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("fe.ar(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return v1_1;
    }

    public static ef[] ba(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, -1150735517)) {
            return null;
        }

        return ac.au(0x780E);
    }

    public static ef[] bb(ko arg1, String arg2, String arg3) {
        int v2 = arg1.ay(arg2, 0xD4A3E869);
        return hl.al(arg1, v2, arg1.aw(v2, arg3, 0x96D3E608), 0x60F77828);
    }

    public static ef bc(ko arg1, String arg2, String arg3) {
        int v2 = arg1.ay(arg2, 0xD4A3E869);
        return dk.ar(arg1, v2, arg1.aw(v2, arg3, -2022102812), 105);
    }

    public static ef[] bd(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, 0x2F3B3B08)) {
            return null;
        }

        return ac.au(0x4A00);
    }

    public static od be(ko arg1, ko arg2, String arg3, String arg4) {
        int v3 = arg1.ay(arg3, 0xD4A3E869);
        return ir.aj(arg1, arg2, v3, arg1.aw(v3, arg4, 0x16686A5), 0x33554953);
    }

    public static ef[] bf(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, 0xB20D317B)) {
            return null;
        }

        return ac.au(0x66F7);
    }

    public static es bg(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, 0x8FE5A4C2)) {
            return null;
        }

        return cw.ag(0xB788BC1);
    }

    public static ef[] bh(ko arg1, String arg2, String arg3) {
        int v2 = arg1.ay(arg2, 0xD4A3E869);
        return hl.al(arg1, v2, arg1.aw(v2, arg3, 0x380F453B), 1850304505);
    }

    public static ef bi(ko arg1, int arg2) {
        byte v0 = -1;
        if(!jp.ay(arg1, arg2, v0)) {
            return null;
        }

        return bp.am(v0);
    }

    public static es[] bj(ko arg1, String arg2, String arg3) {
        int v2 = arg1.ay(arg2, 0xD4A3E869);
        return id.an(arg1, v2, arg1.aw(v2, arg3, -1313154408), 0xF7A99494);
    }

    public static ef bk(ko arg1, String arg2, String arg3) {
        int v2 = arg1.ay(arg2, 0xD4A3E869);
        return dk.ar(arg1, v2, arg1.aw(v2, arg3, 0xB2D56420), 19);
    }

    static void bl(int arg2, int arg3, int arg4, int arg5) {
        try {
            if(client.pb * 0xE0F0EA6D != 0 && arg3 != 0) {
                int v0 = 0xFE380E33;
                if(client.pd * v0 < 50) {
                    client.px[client.pd * v0] = arg2;
                    client.pq[client.pd * v0] = arg3;
                    client.pa[client.pd * v0] = arg4;
                    client.ps[client.pd * v0] = null;
                    client.pz[client.pd * v0] = 0;
                    client.pd += 0xC7119CFB;
                }
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fe.bl(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static od bl(ko arg1, ko arg2, String arg3, String arg4) {
        int v3 = arg1.ay(arg3, 0xD4A3E869);
        return ir.aj(arg1, arg2, v3, arg1.aw(v3, arg4, 0x9FD59F3E), 0x6700A5AC);
    }

    public static ef bm(ko arg1, String arg2, String arg3) {
        int v2 = arg1.ay(arg2, 0xD4A3E869);
        return dk.ar(arg1, v2, arg1.aw(v2, arg3, 0xD07F7F91), 120);
    }

    public static ef bn(byte[] arg1) {
        dy.aw(arg1, 0xD45E4CF3);
        return bp.am(-1);
    }

    static ef bo(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, -1286990898)) {
            return null;
        }

        return bp.am(-1);
    }

    public static ef bp(byte[] arg1) {
        dy.aw(arg1, 1147877031);
        return bp.am(-1);
    }

    public static es[] bq(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, -1001183305)) {
            return null;
        }

        return dq.az(0xF467F297);
    }

    public static od br(ko arg1, ko arg2, String arg3, String arg4) {
        int v3 = arg1.ay(arg3, 0xD4A3E869);
        return ir.aj(arg1, arg2, v3, arg1.aw(v3, arg4, 0x8FDF3435), 0xA1068C25);
    }

    public static es[] bs(ko arg1, String arg2, String arg3) {
        int v2 = arg1.ay(arg2, 0xD4A3E869);
        return id.an(arg1, v2, arg1.aw(v2, arg3, 917115220), 0x309B4D72);
    }

    public static es[] bt(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, 0x350770A1)) {
            return null;
        }

        return dq.az(1972140082);
    }

    public static es[] bu(ko arg1, String arg2, String arg3) {
        int v2 = arg1.ay(arg2, 0xD4A3E869);
        return id.an(arg1, v2, arg1.aw(v2, arg3, 0xE9F4CED6), 0x6A9B15CD);
    }

    public static es[] bv(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, 0x2D9CE633)) {
            return null;
        }

        return dq.az(-1283740054);
    }

    public static ef bw(byte[] arg1) {
        dy.aw(arg1, 0xD420E485);
        return bp.am(-1);
    }

    public static es[] bx(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, 0xB0E5EAB7)) {
            return null;
        }

        return dq.az(0xA64CA00);
    }

    static ef by(ko arg1, int arg2, int arg3) {
        if(!au.at(arg1, arg2, arg3, 0x47D1FA05)) {
            return null;
        }

        return bp.am(-1);
    }

    public static od bz(ko arg1, ko arg2, int arg3, int arg4) {
        if(!au.at(arg1, arg3, arg4, 0xA86C0900)) {
            return null;
        }

        return jt.ah(arg2.ae(arg3, arg4, 0x78DC0DC9), 69);
    }

    public static ef ca(ko arg1, int arg2) {
        byte v0 = -1;
        if(!jp.ay(arg1, arg2, v0)) {
            return null;
        }

        return bp.am(v0);
    }

    static ef cb() {
        ef v0 = new ef();
        dt.as(2012712083);
        v0.aj = fe.al * 0xD46B8F55;
        v0.ad = fe.ae * 131110502;
        v0.an = fe.ar[0];
        v0.ap = lk.an[0];
        v0.ae = fe.ap[0];
        v0.ar = gu.aj[0];
        v0.al = jw.ad;
        v0.ax = nq.aq[0];
        ey.ao(0x988A2D4D);
        return v0;
    }

    static es[] cc() {
        es[] v0 = new es[oi.ax * 43536109];
        dt.as(0xD8C8A8DD);
        int v2;
        for(v2 = 0; v2 < oi.ax * 0xE1118F64; ++v2) {
            es v3 = new es();
            v0[v2] = v3;
            v3.ap = fe.al * 0x8268F30D;
            v3.aj = fe.ae * 0x5EBF2449;
            v3.ar = fe.ar[v2];
            v3.an = lk.an[v2];
            v3.al = fe.ap[v2];
            v3.ae = gu.aj[v2];
            int v4 = v3.ae * v3.al;
            byte[] v5 = nq.aq[v2];
            v3.ax = new int[v4];
            int v6;
            for(v6 = 0; v6 < v4; ++v6) {
                v3.ax[v6] = jw.ad[v5[v6] & 0xFF];
            }
        }

        ey.ao(0x94EA1EF0);
        return v0;
    }

    public static od cd(byte[] arg1, byte[] arg2) {
        dy.aw(arg1, 0xB5B61423);
        return jt.ah(arg2, 88);
    }

    static od ce(byte[] arg9) {
        if(arg9 == null) {
            return null;
        }

        od v8 = new od(arg9, fe.ar, lk.an, fe.ap, gu.aj, jw.ad, nq.aq);
        ey.ao(0x91A1DEB7);
        return v8;
    }

    public static od cf(byte[] arg1, byte[] arg2) {
        dy.aw(arg1, 0xB9620A67);
        return jt.ah(arg2, 0x76);
    }

    static void cg(byte[] arg12) {
        lq v0 = new lq(arg12);
        int v2 = -1880437085;
        v0.ar = (arg12.length - 2) * v2;
        oi.ax = v0.ao(0xEF1FA136) * 0xFCB43EE5;
        fe.ar = new int[oi.ax * 0xFAE838B3];
        int v3 = 43536109;
        lk.an = new int[oi.ax * v3];
        fe.ap = new int[oi.ax * 1306396058];
        gu.aj = new int[oi.ax * v3];
        nq.aq = new byte[oi.ax * v3][];
        v0.ar = (arg12.length - 7 - oi.ax * -635742307) * 0x573E205B;
        fe.al = v0.ao(0x897A8F78) * 0x958F125F;
        fe.ae = v0.ao(1133760670) * 0x6D4E0DF9;
        int v1 = (v0.ay(-73) & 0xFF) + 1;
        int v6;
        for(v6 = 0; v6 < oi.ax * 0xFDD313C2; ++v6) {
            fe.ar[v6] = v0.ao(0x4AF9DD23);
        }

        for(v6 = 0; v6 < oi.ax * 0x7694F2D8; ++v6) {
            lk.an[v6] = v0.ao(0xA2F729F);
        }

        for(v6 = 0; v6 < oi.ax * v3; ++v6) {
            fe.ap[v6] = v0.ao(0x4FC19E6F);
        }

        for(v6 = 0; v6 < oi.ax * 0xEFA47A9F; ++v6) {
            gu.aj[v6] = v0.ao(0xEB1FAEF6);
        }

        v0.ar = (arg12.length - 7 - oi.ax * 0x14C27768 - (v1 - 1) * 3) * v2;
        jw.ad = new int[v1];
        int v12;
        for(v12 = 1; v12 < v1; ++v12) {
            jw.ad[v12] = v0.ak(-1766606914);
            if(jw.ad[v12] == 0) {
                jw.ad[v12] = 1;
            }
        }

        v0.ar = 0;
        for(v12 = 0; v12 < oi.ax * v3; ++v12) {
            v1 = fe.ap[v12];
            v2 = gu.aj[v12];
            v6 = v1 * v2;
            byte[] v7 = new byte[v6];
            nq.aq[v12] = v7;
            int v8 = v0.ay(-5);
            int v9 = -1215098345;
            if(v8 == 0) {
                for(v1 = 0; v1 < v6; ++v1) {
                    v7[v1] = v0.aw(v9);
                }
            }
            else if(1 == v8) {
                for(v6 = 0; v6 < v1; ++v6) {
                    for(v8 = 0; v8 < v2; ++v8) {
                        v7[v8 * v1 + v6] = v0.aw(v9);
                    }
                }
            }
        }
    }

    static es ch() {
        es v0 = new es();
        v0.ap = fe.al * 0x5421DCAF;
        v0.aj = fe.ae * 0x5EBF2449;
        int v2 = 0;
        v0.ar = fe.ar[0];
        v0.an = lk.an[0];
        v0.al = fe.ap[0];
        v0.ae = gu.aj[0];
        int v1 = v0.ae * v0.al;
        byte[] v3 = nq.aq[0];
        dt.as(0xBD3EEA7);
        v0.ax = new int[v1];
        while(v2 < v1) {
            v0.ax[v2] = jw.ad[v3[v2] & 0xFF];
            ++v2;
        }

        ey.ao(0xB04CFC75);
        return v0;
    }

    static es[] ci() {
        int v1 = 43536109;
        es[] v0 = new es[oi.ax * v1];
        dt.as(0x7F4331A);
        int v3;
        for(v3 = 0; v3 < oi.ax * v1; ++v3) {
            es v4 = new es();
            v0[v3] = v4;
            v4.ap = fe.al * 0x1AA9C99F;
            v4.aj = fe.ae * 0x5EBF2449;
            v4.ar = fe.ar[v3];
            v4.an = lk.an[v3];
            v4.al = fe.ap[v3];
            v4.ae = gu.aj[v3];
            int v5 = v4.ae * v4.al;
            byte[] v6 = nq.aq[v3];
            v4.ax = new int[v5];
            int v7;
            for(v7 = 0; v7 < v5; ++v7) {
                v4.ax[v7] = jw.ad[v6[v7] & 0xDB4C9645];
            }
        }

        ey.ao(-1805486269);
        return v0;
    }

    public static ef cj(ko arg1, int arg2) {
        byte v0 = -1;
        if(!jp.ay(arg1, arg2, v0)) {
            return null;
        }

        return bp.am(v0);
    }

    static boolean ck(ko arg1, int arg2) {
        byte[] v1 = arg1.ab(arg2, 0x490DF241);
        if(v1 == null) {
            return 0;
        }

        dy.aw(v1, -2009384978);
        return 1;
    }

    static boolean cl(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return 0;
        }

        dy.aw(v1, 2006903929);
        return 1;
    }

    static boolean cm(ko arg1, int arg2) {
        byte[] v1 = arg1.ab(arg2, 0x178EC386);
        if(v1 == null) {
            return 0;
        }

        dy.aw(v1, -169365205);
        return 1;
    }

    static boolean cn(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return 0;
        }

        dy.aw(v1, 0xD71A7571);
        return 1;
    }

    static void co() {
        int v0;
        for(v0 = 0; v0 < jw.ad.length; ++v0) {
            if(jw.ad[v0] != 0) {
                jw.ad[v0] |= 0xFF000000;
            }
        }
    }

    static es[] cp() {
        es[] v0 = new es[oi.ax * 43536109];
        dt.as(0xA4D9C204);
        int v2;
        for(v2 = 0; v2 < oi.ax * 0xD2021B7E; ++v2) {
            es v3 = new es();
            v0[v2] = v3;
            v3.ap = fe.al * -1764646078;
            v3.aj = fe.ae * 581201057;
            v3.ar = fe.ar[v2];
            v3.an = lk.an[v2];
            v3.al = fe.ap[v2];
            v3.ae = gu.aj[v2];
            int v4 = v3.ae * v3.al;
            byte[] v5 = nq.aq[v2];
            v3.ax = new int[v4];
            int v6;
            for(v6 = 0; v6 < v4; ++v6) {
                v3.ax[v6] = jw.ad[v5[v6] & 0x9B42F40B];
            }
        }

        ey.ao(-391609182);
        return v0;
    }

    static void cq(byte[] arg12) {
        lq v0 = new lq(arg12);
        v0.ar = (arg12.length - 2) * -1880437085;
        oi.ax = v0.ao(0x1389D101) * 0x75FE1C5D;
        int v2 = 43536109;
        fe.ar = new int[oi.ax * v2];
        lk.an = new int[oi.ax * 1438554006];
        fe.ap = new int[oi.ax * -1196725093];
        gu.aj = new int[oi.ax * 0x7F0EA06E];
        nq.aq = new byte[oi.ax * -1848872307][];
        int v4 = 0x14C27768;
        v0.ar = (arg12.length - 7 - oi.ax * v4) * 0x5C88E681;
        fe.al = v0.ao(0x24230638) * 0x958F125F;
        fe.ae = v0.ao(-1360031021) * 0x6D4E0DF9;
        int v1 = (v0.ay(-16) & 930131047) + 1;
        int v6;
        for(v6 = 0; v6 < oi.ax * 0xC580CF2F; ++v6) {
            fe.ar[v6] = v0.ao(724667001);
        }

        for(v6 = 0; v6 < oi.ax * 0x8CC22C82; ++v6) {
            lk.an[v6] = v0.ao(0xF6285206);
        }

        for(v6 = 0; v6 < oi.ax * v2; ++v6) {
            fe.ap[v6] = v0.ao(1430879606);
        }

        for(v6 = 0; v6 < oi.ax * 0xAB7B0E55; ++v6) {
            gu.aj[v6] = v0.ao(1055001140);
        }

        v0.ar = (arg12.length - 7 - oi.ax * v4 - (v1 - 1) * 3) * 0xE8D60F2C;
        jw.ad = new int[v1];
        int v12;
        for(v12 = 1; v12 < v1; ++v12) {
            jw.ad[v12] = v0.ak(0xEEFE9831);
            if(jw.ad[v12] == 0) {
                jw.ad[v12] = 1;
            }
        }

        v0.ar = 0;
        for(v12 = 0; v12 < oi.ax * v2; ++v12) {
            v1 = fe.ap[v12];
            v4 = gu.aj[v12];
            v6 = v1 * v4;
            byte[] v7 = new byte[v6];
            nq.aq[v12] = v7;
            int v8 = v0.ay(-96);
            int v9 = -1215098345;
            if(v8 == 0) {
                for(v1 = 0; v1 < v6; ++v1) {
                    v7[v1] = v0.aw(v9);
                }
            }
            else if(1 == v8) {
                for(v6 = 0; v6 < v1; ++v6) {
                    for(v8 = 0; v8 < v4; ++v8) {
                        v7[v8 * v1 + v6] = v0.aw(v9);
                    }
                }
            }
        }
    }

    static es cr() {
        es v0 = new es();
        v0.ap = fe.al * -948029893;
        v0.aj = fe.ae * -102059767;
        int v2 = 0;
        v0.ar = fe.ar[0];
        v0.an = lk.an[0];
        v0.al = fe.ap[0];
        v0.ae = gu.aj[0];
        int v1 = v0.ae * v0.al;
        byte[] v3 = nq.aq[0];
        dt.as(-2106697790);
        v0.ax = new int[v1];
        while(v2 < v1) {
            v0.ax[v2] = jw.ad[v3[v2] & 0xFF];
            ++v2;
        }

        ey.ao(-582852990);
        return v0;
    }

    static od cs(byte[] arg9) {
        if(arg9 == null) {
            return null;
        }

        od v8 = new od(arg9, fe.ar, lk.an, fe.ap, gu.aj, jw.ad, nq.aq);
        ey.ao(-760486452);
        return v8;
    }

    static boolean ct(ko arg1, int arg2) {
        byte[] v1 = arg1.ab(arg2, 0x75D03517);
        if(v1 == null) {
            return 0;
        }

        dy.aw(v1, 395208101);
        return 1;
    }

    static boolean cu(ko arg1, int arg2) {
        byte[] v1 = arg1.ab(arg2, 0x5A13588D);
        if(v1 == null) {
            return 0;
        }

        dy.aw(v1, -383047960);
        return 1;
    }

    static void cv(byte[] arg12) {
        lq v0 = new lq(arg12);
        int v2 = -1880437085;
        v0.ar = (arg12.length - 2) * v2;
        oi.ax = v0.ao(-375620247) * 0xFCB43EE5;
        int v3 = 43536109;
        fe.ar = new int[oi.ax * v3];
        lk.an = new int[oi.ax * v3];
        fe.ap = new int[oi.ax * v3];
        gu.aj = new int[oi.ax * v3];
        nq.aq = new byte[oi.ax * v3][];
        int v5 = 0x14C27768;
        v0.ar = (arg12.length - 7 - oi.ax * v5) * v2;
        fe.al = v0.ao(0x2496CC51) * 0x958F125F;
        fe.ae = v0.ao(0x5870283F) * 0x6D4E0DF9;
        int v1 = (v0.ay(-75) & 0xFF) + 1;
        int v7;
        for(v7 = 0; v7 < oi.ax * v3; ++v7) {
            fe.ar[v7] = v0.ao(-610134570);
        }

        for(v7 = 0; v7 < oi.ax * v3; ++v7) {
            lk.an[v7] = v0.ao(1230084983);
        }

        for(v7 = 0; v7 < oi.ax * v3; ++v7) {
            fe.ap[v7] = v0.ao(0x12B1A4D9);
        }

        for(v7 = 0; v7 < oi.ax * v3; ++v7) {
            gu.aj[v7] = v0.ao(-1097186994);
        }

        v0.ar = (arg12.length - 7 - oi.ax * v5 - (v1 - 1) * 3) * v2;
        jw.ad = new int[v1];
        int v12;
        for(v12 = 1; v12 < v1; ++v12) {
            jw.ad[v12] = v0.ak(-1356110410);
            if(jw.ad[v12] == 0) {
                jw.ad[v12] = 1;
            }
        }

        v0.ar = 0;
        for(v12 = 0; v12 < oi.ax * v3; ++v12) {
            v1 = fe.ap[v12];
            v2 = gu.aj[v12];
            v5 = v1 * v2;
            byte[] v7_1 = new byte[v5];
            nq.aq[v12] = v7_1;
            int v8 = v0.ay(-66);
            int v9 = -1215098345;
            if(v8 == 0) {
                for(v1 = 0; v1 < v5; ++v1) {
                    v7_1[v1] = v0.aw(v9);
                }
            }
            else if(1 == v8) {
                for(v5 = 0; v5 < v1; ++v5) {
                    for(v8 = 0; v8 < v2; ++v8) {
                        v7_1[v8 * v1 + v5] = v0.aw(v9);
                    }
                }
            }
        }
    }

    static ef cw() {
        ef v0 = new ef();
        dt.as(0xBF460825);
        v0.aj = fe.al * 0x1AA9C99F;
        v0.ad = fe.ae * 0x5EBF2449;
        v0.an = fe.ar[0];
        v0.ap = lk.an[0];
        v0.ae = fe.ap[0];
        v0.ar = gu.aj[0];
        v0.al = jw.ad;
        v0.ax = nq.aq[0];
        ey.ao(-1259701734);
        return v0;
    }

    static ef[] cx() {
        ef[] v0 = new ef[oi.ax * 43536109];
        dt.as(0x94BE8238);
        int v1;
        for(v1 = 0; v1 < oi.ax * -708516984; ++v1) {
            ef v2 = new ef();
            v0[v1] = v2;
            v2.aj = fe.al * 0x1AA9C99F;
            v2.ad = fe.ae * 0x5EBF2449;
            v2.an = fe.ar[v1];
            v2.ap = lk.an[v1];
            v2.ae = fe.ap[v1];
            v2.ar = gu.aj[v1];
            v2.al = jw.ad;
            v2.ax = nq.aq[v1];
        }

        ey.ao(0xDD99DE63);
        return v0;
    }

    static ef cy() {
        ef v0 = new ef();
        dt.as(0xA0C00A06);
        v0.aj = fe.al * 0xA8BCF1E3;
        v0.ad = fe.ae * -367609412;
        v0.an = fe.ar[0];
        v0.ap = lk.an[0];
        v0.ae = fe.ap[0];
        v0.ar = gu.aj[0];
        v0.al = jw.ad;
        v0.ax = nq.aq[0];
        ey.ao(-700171003);
        return v0;
    }

    static boolean cz(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return 0;
        }

        dy.aw(v1, 1570952788);
        return 1;
    }

    static void dm(int arg2) {
        try {
            if(client.jo) {
                cn.dc(gu.jg, false, 0xD2A43F59);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fe.dm(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static final void dt(int arg4) {
        try {
            client.jn = 0;
            int v0 = (gu.jg.bp * 0x914F0683 >> 7) + ad.fi * 474770003;
            int v1 = (gu.jg.bw * 0xD19D0C3D >> 7) + nr.fo * 0x519F9BE7;
            int v3 = 306537959;
            if(v0 >= 3053 && v0 <= 0xC54 && v1 >= 0xBF0 && v1 <= 0xC40) {
                client.jn = v3;
            }

            if(v0 >= 0xC00 && v0 <= 0xC2E && v1 >= 9492 && v1 <= 0x253F) {
                client.jn = v3;
            }

            if(client.jn * 359259607 == 1 && v0 >= 0xC43 && v0 <= 0xC7F && v1 >= 3008 && v1 <= 0xBF6) {
                client.jn = 0;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("fe.dt(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }
    }

    static void dv() {
        int v0;
        for(v0 = 0; v0 < jw.ad.length; ++v0) {
            if(jw.ad[v0] != 0) {
                jw.ad[v0] |= 0xAF6209D6;
            }
        }
    }

    static void fj(ar arg10, int arg11, int arg12, boolean arg13, boolean arg14, int arg15) {
        int v8;
        try {
            int v0 = 0x1804E4A5;
            arg15 = arg10.by * v0;
            int v2 = 0x6F0D2CD;
            int v1 = arg10.bt * v2;
            int v4 = 0x218D62A1;
            int v5 = 2;
            int v7 = 0x258632D;
            if(arg10.ac * v4 == 0) {
                arg10.by = arg10.bn * 0xCAA42603;
            }
            else {
                v8 = -1380766737;
                if(1 == arg10.ac * v4) {
                    arg10.by = (arg11 - arg10.bn * v8) * v7;
                }
                else if(v5 == arg10.ac * v4) {
                    arg10.by = (arg10.bn * v8 * arg11 >> 14) * v7;
                }
            }

            int v3 = 0xC8C1B979;
            v8 = 0xFC0F6A05;
            if(arg10.bd * v3 == 0) {
                arg10.bt = arg10.bp * 0x5910B9F3;
            }
            else {
                int v9 = 280903063;
                if(1 == arg10.bd * v3) {
                    arg10.bt = (arg12 - arg10.bp * v9) * v8;
                }
                else if(arg10.bd * v3 == v5) {
                    arg10.bt = (arg10.bp * v9 * arg12 >> 14) * v8;
                }
            }

            arg11 = arg10.ac * v4;
            arg12 = -414993019;
            v4 = 0x2F603933;
            v5 = 4;
            if(v5 == arg11) {
                arg10.by = arg10.bv * v4 * (arg10.bt * v2) / (arg10.bq * arg12) * v7;
            }

            if(v5 == arg10.bd * v3) {
                arg10.bt = arg10.bq * arg12 * (arg10.by * v0) / (arg10.bv * v4) * v8;
            }

            if(arg10.ao * 0xD2D07C71 == 0x539) {
                client.lt = arg10;
            }

            if((arg13) && arg10.fk != null) {
                if(arg10.by * v0 == arg15 && arg10.bt * v2 == v1 && !arg14) {
                    return;
                }

                iw v11 = new iw();
                v11.ae = arg10;
                v11.ax = arg10.fk;
                client.nc.al(((mx)v11));
            }
        }
        catch(RuntimeException v10) {
            StringBuilder v11_1 = new StringBuilder();
            v11_1.append("fe.fj(");
            v11_1.append(')');
            throw lx.al(((Throwable)v10), v11_1.toString());
        }
    }
}

