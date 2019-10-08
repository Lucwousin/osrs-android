import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class pb {
    HashMap aa;
    static final li ab = null;
    float ac;
    ko ad;
    static final int ae = 8;
    static final li af = null;
    dh ag;
    dh ah;
    static final li ai = null;
    ko aj;
    int ak;
    static final int al = -1;
    HashMap am;
    int ao;
    static final int ap = 50;
    ko aq;
    static final float ar = 30f;
    int as;
    cy at;
    ef[] au;
    od av;
    int aw;
    static final int ax = 0xFFFF0000;
    pg ay;
    dh az;
    int ba;
    int bb;
    boolean bc;
    float bd;
    HashSet be;
    int bf;
    int bg;
    int bh;
    HashSet bj;
    boolean bl;
    int bn;
    int bo;
    int bp;
    int bq;
    int br;
    HashSet bs;
    HashSet bt;
    HashSet bu;
    int bv;
    int bw;
    int bx;
    boolean by;
    long bz;
    final int[] ca;
    public boolean cb;
    int cc;
    Iterator cd;
    HashSet cf;
    int ci;
    List cj;
    int cp;
    int cw;
    af cx;
    es cy;

    static {
        pb.ab = li.ar;
        pb.af = li.an;
        pb.ai = li.ap;
    }

    public pb() {
        super();
        this.as = 0x5EE227F7;
        this.ak = 0x61D822EB;
        this.ba = 1400175687;
        this.bf = 0xC5D33BF7;
        this.bn = 411808595;
        this.bp = 0xC5C87DFD;
        this.bw = 1019971779;
        this.bo = 1704250474;
        this.by = false;
        this.bt = null;
        this.bv = 0x6E93DED7;
        this.bq = 0x2EE7BB5F;
        this.bx = 1568404305;
        this.bg = 0x91BE53CF;
        this.bc = true;
        this.bj = new HashSet();
        this.bu = new HashSet();
        this.bs = new HashSet();
        this.be = new HashSet();
        this.bl = false;
        this.br = 0;
        this.ca = new int[]{0x3F0, 1009, 1010, 0x3F3, 0x3F4};
        this.cf = new HashSet();
        this.cx = null;
        this.cb = false;
        this.cc = 0x6A2E507D;
        this.cp = 0x8ED9A19B;
        this.ci = 0x189194BF;
    }

    public int aa(byte arg3) {
        try {
            if(this.ag == null) {
                return -1;
            }

            return this.ag.av(-1880437085);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.aa(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    boolean ab(int arg3) {
        arg3 = -960416199;
        try {
            int v0 = this.as * arg3;
            arg3 = -1;
            if(arg3 == v0) {
                return false;
            }
            else if(arg3 == this.ak * 415730237) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("pb.ab(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    float ac(int arg1, int arg2) {
        if(25 == arg1) {
            return 1f;
        }

        if(arg1 == 37) {
            return 1.5f;
        }

        if(arg1 == 50) {
            return 2f;
        }

        if(arg1 == 75) {
            return 3f;
        }

        if(100 == arg1) {
            return 4f;
        }

        return 8f;
    }

    final void ad(int arg1, int arg2, boolean arg3, int arg4) {
        arg1 *= 0x1CE7F09B;
        try {
            this.aw = arg1;
            this.ao = arg2 * 0xEE9012BD;
            ji.ax(0x2076E2C1);
            if(arg3) {
                this.aq(0x5DC1C9C7);
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("pb.ad(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void ae(int arg17, int arg18, boolean arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        dw v8;
        iw v7;
        Object v4;
        int v6;
        int v5;
        pb v1 = this;
        try {
            if(!v1.ay.ae(1670204609)) {
                return;
            }

            v1.ap(-81);
            v1.aj(0);
            if(!arg19) {
                return;
            }

            int v2 = ((int)Math.ceil(((double)((((float)arg22)) / v1.ac))));
            int v3 = ((int)Math.ceil(((double)((((float)arg23)) / v1.ac))));
            int v15 = 2;
            List v2_1 = v1.at.ap(v1.aw * 506361235 - v2 / 2 - 1, v1.ao * 0x32D6F895 - v3 / 2 - 1, v2 / v15 + v1.aw * 506361235 + 1, v1.ao * 0x32D6F895 + v3 / v15 + 1, arg20, arg21, arg22, arg23, arg17, arg18, -121);
            HashSet v3_1 = new HashSet();
            Iterator v2_2 = v2_1.iterator();
            while(true) {
                v5 = 3;
                v6 = 0x913C576D;
                if(!v2_2.hasNext()) {
                    break;
                }

                v4 = v2_2.next();
                v3_1.add(v4);
                v7 = new iw();
                v8 = new dw(((cg)v4).al(0x3F), ((cg)v4).al, ((cg)v4).ax);
                Object[] v5_1 = new Object[v5];
                v5_1[0] = v8;
                v5_1[1] = Integer.valueOf(arg17);
                v5_1[v15] = Integer.valueOf(arg18);
                v7.ax(v5_1, 1907888484);
                if(v1.cf.contains(v4)) {
                    v7.al(17, v6);
                }
                else {
                    v7.al(15, v6);
                }

                bv.ax(v7, 0xF37F5ED7);
            }

            v2_2 = v1.cf.iterator();
            while(v2_2.hasNext()) {
                v4 = v2_2.next();
                if(v3_1.contains(v4)) {
                    continue;
                }

                v7 = new iw();
                v8 = new dw(((cg)v4).al(27), ((cg)v4).al, ((cg)v4).ax);
                Object[] v4_1 = new Object[v5];
                v4_1[0] = v8;
                v4_1[1] = Integer.valueOf(arg17);
                v4_1[v15] = Integer.valueOf(arg18);
                v7.ax(v4_1, 0xCA0F54E4);
                v7.al(16, v6);
                bv.ax(v7, 0x4AC85C1F);
            }

            v1.cf = v3_1;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v2_3 = new StringBuilder();
            v2_3.append("pb.ae(");
            v2_3.append(')');
            throw lx.al(((Throwable)v0), v2_3.toString());
        }
    }

    public dh af(int arg3, int arg4, int arg5, byte arg6) {
        Object v0;
        try {
            Iterator v6 = this.am.values().iterator();
            do {
                if(!v6.hasNext()) {
                    return null;
                }

                v0 = v6.next();
                if(!((dh)v0).ad(arg3, arg4, arg5, -2)) {
                    continue;
                }

                break;
            }
            while(true);
        }
        catch(RuntimeException v3) {
            goto label_14;
        }

        return ((dh)v0);
    label_14:
        StringBuilder v4 = new StringBuilder();
        v4.append("pb.af(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public void ag(dh arg7, af arg8, af arg9, boolean arg10, int arg11) {
        if(arg7 == null) {
            return;
        }

        try {
            if(this.ag == null || this.ag != arg7) {
                this.az(arg7, -1017850125);
            }

            arg11 = 0xB230B0A5;
            int v0 = 0xAEACF223;
            int v1 = 400591065;
            if((arg10) || !this.ag.ad(arg8.ax * v1, arg8.al * v0, arg8.ae * arg11, -23)) {
                this.ah(arg9.ax * v1, arg9.al * v0, arg9.ae * arg11, 0);
            }
            else {
                this.ah(arg8.ax * v1, arg8.al * v0, arg8.ae * arg11, 0);
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("pb.ag(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    void ah(int arg2, int arg3, int arg4, byte arg5) {
        try {
            if(this.ag == null) {
                return;
            }

            int[] v2_1 = this.ag.ab(arg2, arg3, arg4, 0x6E917F1F);
            if(v2_1 == null) {
                v2_1 = this.ag.ab(this.ag.as(0x7F0F0121), this.ag.ao(0x6383AA92), this.ag.ak(74), 0xD3F80B2C);
            }

            this.ad(v2_1[0] - this.ag.ah(0x999D058) * 0x40, v2_1[1] - this.ag.ay(0x80B406BA) * 0x40, true, 2041134219);
            this.as = 0x5EE227F7;
            this.ak = 0x61D822EB;
            this.ac = this.ac(this.ag.ag(0xD54EB40F), -1004241403);
            this.bd = this.ac;
            this.cj = null;
            this.cd = null;
            this.at.al(0x8FF9F72A);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.ah(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ai(int arg3, int arg4, int arg5, boolean arg6, short arg7) {
        int v7_2;
        byte v7 = 26;
        try {
            dh v7_1 = this.af(arg3, arg4, arg5, v7);
            if(v7_1 == null) {
                if(arg6) {
                    v7_1 = this.az;
                }
                else {
                    return;
                }
            }

            if(this.ah != v7_1 || (arg6)) {
                this.ah = v7_1;
                this.am(v7_1, 10086);
                v7_2 = 1;
            }
            else {
                v7_2 = 0;
            }

            if(v7_2 != 0 || (arg6)) {
                this.ah(arg3, arg4, arg5, 0);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("pb.ai(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void aj(byte arg8) {
        int v8 = -687121005;
        try {
            if(!this.ab(v8)) {
                return;
            }

            int v0 = -960416199;
            int v2 = 506361235;
            v8 = this.as * v0 - this.aw * v2;
            int v3 = 415730237;
            int v5 = 0x32D6F895;
            int v1 = this.ak * v3 - this.ao * v5;
            int v4 = 8;
            if(v8 != 0) {
                v8 /= Math.min(v4, Math.abs(v8));
            }

            if(v1 != 0) {
                v1 /= Math.min(v4, Math.abs(v1));
            }

            this.ad(this.aw * v2 + v8, v1 + this.ao * v5, true, 0x4BA4FCF7);
            if(this.as * v0 == this.aw * v2 && this.ao * v5 == this.ak * v3) {
                this.as = 0x5EE227F7;
                this.ak = 0x61D822EB;
            }
        }
        catch(RuntimeException v8_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("pb.aj(");
            v0_1.append(')');
            throw lx.al(((Throwable)v8_1), v0_1.toString());
        }
    }

    void ak(int arg18, int arg19, int arg20, int arg21, int arg22, fa arg23, int arg24) {
        pb v1;
        int v16;
        int v8;
        try {
            v8 = arg20 / 2 + arg18;
            v16 = arg19 + arg21 / 2 - 38;
            arg23.ar(arg18, arg19, arg20, arg21, 0, 2);
            arg23.fz(v8 - 0x98, v16, 304, 34, 0xFFFF0000, 0x8A1DB9E8);
            arg23.ar(v8 - 150, v16 + 2, arg22 * 3, 30, 0xFFFF0000, 2);
            v1 = this;
        }
        catch(RuntimeException v0) {
            goto label_44;
        }

        try {
            v1.av.ai(gs.ne, v8, v16 + 20, -1, -1, arg23);
            return;
        }
        catch(RuntimeException v0) {
        }

    label_44:
        StringBuilder v2 = new StringBuilder();
        v2.append("pb.ak(");
        v2.append(')');
        throw lx.al(((Throwable)v0), v2.toString());
    }

    public void al(byte arg3) {
        arg3 = -77;
        try {
            ad.an(arg3);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void am(dh arg2, short arg3) {
        try {
            if(this.ag != null && this.ag == arg2) {
                return;
            }

            this.az(arg2, -1017850125);
            this.ah(-1, -1, -1, 0);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.am(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void an(int arg7, int arg8, boolean arg9, long arg10) {
        try {
            if(this.ag != null) {
                this.cx = this.ag.af((((int)((((float)(this.aw * 506361235))) + ((((float)(arg7 - this.bn * 0x8FCEF725))) - (((float)this.bx(0x6871B25E))) * this.ac / 2f) / this.ac))) + this.ag.ah(0x999D058) * 0x40, (((int)((((float)(this.ao * 0x32D6F895))) - ((((float)(arg8 - this.bp * -1098991445))) - (((float)this.bg(1502832194))) * this.ac / 2f) / this.ac))) + this.ag.ay(-2100011413) * 0x40, 0x4537CE65);
                if(this.cx != null && (arg9)) {
                    if((jv.in(0x6910CCCA)) && (dt.bu.bm(82, -1006599005)) && (dt.bu.bm(81, 1300357697))) {
                        br.iy(this.cx.al * 0xAEACF223, this.cx.ae * 0xB230B0A5, this.cx.ax * 400591065, false, 2100601254);
                        return;
                    }

                    int v9 = 1;
                    if(this.bc) {
                        arg7 -= this.bh * 0x9CE74799;
                        arg8 -= this.bb * 0x8106F5F3;
                        if(arg10 - this.bz * 0x130EB2CB19D8028DL <= 500) {
                            int v10 = -25;
                            if(arg7 >= v10) {
                                int v11 = 25;
                                if(arg7 <= v11 && arg8 >= v10) {
                                    if(arg8 > v11) {
                                        goto label_112;
                                    }

                                    goto label_113;
                                }
                            }
                        }

                    label_112:
                        v9 = 0;
                    }

                label_113:
                    if(v9 == 0) {
                        return;
                    }

                    na v7_1 = cd.al(nf.dw, client.eh.an, -1917053483);
                    v7_1.ae.aj(this.cx.ax(760125081), 0x79EF67B1);
                    client.eh.ae(v7_1, 1390160215);
                    this.bz = 0;
                }
            }
            else {
                this.cx = null;
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("pb.an(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public void ao(int arg13, int arg14, int arg15, int arg16, fa arg17, byte arg18) {
        pb v1 = this;
        try {
            if(!v1.ay.ae(538400156)) {
                return;
            }

            if(!v1.at.ad(0x8A87FEC1)) {
                v1.at.ax(v1.aj, v1.ag.au(0x92370A67), client.aq, 1655620248);
                if(!v1.at.ad(-2102580263)) {
                    return;
                }
            }

            v1.at.an(arg13, arg14, arg15, arg16, v1.bt, v1.bq * 0x766E9F61, v1.bo * 0x57FBDED5, arg17, -126);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v2 = new StringBuilder();
            v2.append("pb.ao(");
            v2.append(')');
            throw lx.al(((Throwable)v0), v2.toString());
        }
    }

    void ap(byte arg4) {
        try {
            if(dx.rj != null) {
                this.ac = this.bd;
                return;
            }

            float v1 = 30f;
            if(this.ac < this.bd) {
                this.ac = Math.min(this.bd, this.ac + this.ac / v1);
            }

            if(this.ac > this.bd) {
                this.ac = Math.max(this.bd, this.ac - this.ac / v1);
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    final void aq(int arg3) {
        arg3 = 0x91BE53CF;
        try {
            this.bg = arg3;
            this.bx = 1568404305;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ar(int arg9, int arg10, boolean arg11, boolean arg12, int arg13) {
        int v11 = 0x2076E2C1;
        try {
            long v6 = ji.ax(v11);
            this.an(arg9, arg10, arg12, v6);
            if((this.ab(0x8C792DD4)) || dt.bu.ax != ik.aj) {
                this.aq(0x31B99209);
            }
            else {
                arg9 = dt.bu.ad[0];
                v11 = dt.bu.aq[0];
                int v0 = -2010985905;
                int v1 = -1;
                if(v1 == this.bx * v0) {
                    this.bx = this.aw * 1964065661;
                    this.bg = this.ao * 0x4DFEB085;
                }

                if(this.bx * v0 != v1) {
                    this.ad(this.bx * v0 - (((int)((((float)(dt.bu.ad[0] - dt.bu.ap[0]))) / this.bd))), (((int)((((float)(dt.bu.aq[0] - dt.bu.aj[0]))) / this.bd))) + this.bg * 0xAEEA2CD1, false, 0x5F0EAA2B);
                }

                arg10 = v11;
            }

            if(arg12) {
                this.bz = v6 * -6960589072759222203L;
                this.bh = arg9 * 0x75851CA9;
                this.bb = arg10 * 0xE974AB3B;
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("pb.ar(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public void as(int arg2, int arg3) {
        arg3 = 0x61B622D8;
        try {
            this.bd = this.ac(arg2, arg3);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.as(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void at(int arg30, int arg31, int arg32, int arg33, int arg34, fa arg35, byte arg36) {
        boolean v27;
        pb v10 = this;
        int v8 = arg32;
        int v9 = arg33;
        fa v15 = arg35;
        int v1 = 4;
        try {
            int[] v14 = new int[v1];
            v15.et(v14, 0xC0BC170C);
            int v23 = v8 + arg30;
            int v24 = v9 + arg31;
            arg35.ef(arg30, arg31, v23, v24, 0xF8915E80);
            arg35.ar(arg30, arg31, arg32, arg33, 0, 2);
            int v6 = v10.ay.ar(11);
            v1 = 100;
            if(v6 < v1) {
                this.ak(arg30, arg31, arg32, arg33, v6, arg35, 0xC8AA4903);
                return;
            }

            if(!v10.at.ad(0x8942561D)) {
                v10.at.ax(v10.aj, v10.ag.au(0x89B9FF06), client.aq, 0xE676F444);
                if(!v10.at.ad(-2093721924)) {
                    return;
                }
            }

            int v4 = 0x57FBDED5;
            int v5 = 0x766E9F61;
            if(v10.bt != null) {
                v10.bq += 0xD11844A1;
                if(v10.bq * v5 % (v10.bo * v4) == 0) {
                    v10.bq = 0;
                    v10.bv += 0x916C2129;
                }

                if(v10.bv * 0xFB640B19 < v10.bw * 0xAC6437C1) {
                    goto label_88;
                }

                if(v10.by) {
                    goto label_88;
                }

                v10.bt = null;
            }

        label_88:
            int v7 = ((int)Math.ceil(((double)((((float)v8)) / v10.ac))));
            v6 = ((int)Math.ceil(((double)((((float)v9)) / v10.ac))));
            int v25 = 506361235;
            int v26 = 0x32D6F895;
            int[] v28 = v14;
            fa v2 = v15;
            v10.at.ae(v10.aw * v25 - v7 / 2, v10.ao * v26 - v6 / 2, v7 / 2 + v10.aw * v25, v10.ao * v26 + v6 / 2, arg30, arg31, v23, v24, arg35, 0x7694F2D8);
            if(!v10.bl) {
                if(arg34 - v10.br * 0xC3B0FD17 > v1) {
                    v10.br = 0x18980AA7 * arg34;
                    v27 = true;
                }
                else {
                    v27 = false;
                }

                v10.at.ar(v10.aw * v25 - v7 / 2, v10.ao * v26 - v6 / 2, v10.aw * v25 + v7 / 2, v10.ao * v26 + v6 / 2, arg30, arg31, v23, v24, v10.be, v10.bt, v10.bq * v5, v10.bo * 0x57FBDED5, v27, arg35, 0);
            }

            fa v12 = v2;
            int v13 = v6;
            int v14_1 = v7;
            this.aw(arg30, arg31, arg32, arg33, v7, v13, arg35, 0x2F);
            if((jv.in(0x70971C1F)) && (v10.cb) && v10.cx != null) {
                od v1_1 = v10.av;
                v1_1.aq("Coord: " + v10.cx, v12.ap * 0xE4D30573 + 10, v12.ar * 2002832733 + 20, 0xFFFF00, -1, arg35);
            }

            v10.ba = v14_1 * -1400175687;
            v10.bf = v13 * 0x3A2CC409;
            v10.bn = arg30 * -411808595;
            v10.bp = 0x3A378203 * arg31;
            v12.fa(v28, -989494300);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append("pb.at(");
            v1_2.append(')');
            throw lx.al(((Throwable)v0), v1_2.toString());
        }
    }

    public dh au(int arg3) {
        try {
            return this.ag;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.au(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void av(int arg2, byte arg3) {
        int v3 = 0x959C2D11;
        try {
            dh v2_1 = this.bn(arg2, v3);
            if(v2_1 != null) {
                this.am(v2_1, 6000);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("pb.av(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    void aw(int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, fa arg28, byte arg29) {
        pb v9 = this;
        try {
            if(dx.rj != null) {
                int v10 = 0x200 / (v9.at.am * 0xF857EF8E);
                int v12 = arg24 + 0x200;
                int v7 = arg25 + 0x200;
                int v1 = v9.bt(0x31D665C7) - arg26 / 2 - v10;
                int v13 = v9.bv(1203560269) - arg27 / 2 - v10;
                int v14 = v10 + v1;
                int v15 = 1152800555;
                int v16 = 0x7C2BF7C7;
                int v17 = arg22 - (v14 - v9.cc * v15) * (v9.at.am * v16);
                int v18 = 0x6F9A236D;
                int v19 = arg23 - (v10 - (v13 - v9.cp * v18)) * (v9.at.am * v16);
                int v11 = v7;
                if(this.ay(v12, v7, v17, v19, arg24, arg25, -1509657090)) {
                    if(v9.cy == null || v12 != v9.cy.al || v9.cy.ae != v11) {
                        v9.cy = new es(v12, v11);
                    }
                    else {
                        Arrays.fill(v9.cy.ax, 0);
                    }

                    v9.cc = (v9.bt(0x31D665C7) - arg26 / 2 - v10) * 0x95D1AF83;
                    v9.cp = (v9.bv(0x54DDF074) - arg27 / 2 - v10) * 0x71265E65;
                    v9.cw = v9.at.am * 0x5DFC61E9;
                    dx.rj.ap(v9.cc * v15, v9.cp * v18, v9.cy, ((float)(v9.cw * 0x13594E2F)), -1589300029);
                    v9.ci = client.rr * -808006961;
                    v17 = arg22 - (v14 - v9.cc * v15) * (v9.at.am * v16);
                    v19 = arg23 - v9.at.am * v16 * (v10 - (v13 - v9.cp * v18));
                }

                arg28.ae(arg22, arg23, arg24, arg25, 0, 0x80, 1583203442);
                arg28.as(v9.cy, v17, v19, 0xC0, 0xC814DBF8);
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("pb.aw(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    public void ax(ko arg1, ko arg2, ko arg3, od arg4, HashMap arg5, ef[] arg6, byte arg7) {
        try {
            this.au = arg6;
            this.aj = arg1;
            this.ad = arg2;
            this.aq = arg3;
            this.av = arg4;
            this.aa = new HashMap();
            this.aa.put(cz.ax, arg5.get(pb.ab));
            this.aa.put(cz.al, arg5.get(pb.af));
            this.aa.put(cz.ae, arg5.get(pb.ai));
            this.ay = new pg(arg1);
            int v1_1 = this.aj.ay(dv.ax.ap, 0xD4A3E869);
            int[] v2 = this.aj.aa(v1_1, -68754030);
            this.am = new HashMap(v2.length);
            int v3;
            for(v3 = 0; v3 < v2.length; ++v3) {
                lq v4 = new lq(this.aj.ae(v1_1, v2[v3], 0x78DC0DC9));
                dh v5 = new dh();
                v5.ap(v4, v2[v3], 2042445960);
                this.am.put(v5.au(-1721511036), v5);
                if(v5.aa(0xF6A800E9)) {
                    this.az = v5;
                }
            }

            this.am(this.az, 0x587);
            this.ah = null;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("pb.ax(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }

    boolean ay(int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            if(this.cy == null) {
                return 1;
            }

            if(this.cy.al == arg4) {
                if(this.cy.ae != arg5) {
                }
                else if(this.cw * 0x13594E2F != this.at.am * 0x7C2BF7C7) {
                    return 1;
                }
                else {
                    if(this.ci * 0x2FAC24C1 == client.rr * 0x2988020F) {
                        goto label_28;
                    }

                    return 1;
                }
            }

            return 1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("pb.ay(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return 1;
    label_28:
        if(arg6 <= 0) {
            if(arg7 > 0) {
            }
            else {
                if(arg6 + arg4 >= arg8) {
                    if(arg5 + arg7 < arg9) {
                    }
                    else {
                        return 0;
                    }
                }

                return 1;
            }
        }

        return 1;
    }

    void az(dh arg4, int arg5) {
        try {
            this.ag = arg4;
            this.at = new cy(this.au, this.aa, this.ad, this.aq);
            this.ay.ax(this.ag.au(-1310387405), 0xFEC81D40);
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("pb.az(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public void ba(int arg3) {
        try {
            this.ay.al(0x75);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.ba(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bb(int arg2, int arg3) {
        if(arg2 >= 1) {
            arg2 *= 0x20C06A7D;
            try {
                this.bo = arg2;
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("pb.bb(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }

    public void bc(int arg3) {
        arg3 = 1704250474;
        try {
            this.bo = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bc(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int bd(byte arg5) {
        double v0 = 1;
        try {
            if(v0 == (((double)this.bd))) {
                return 25;
            }

            if(1.5 == (((double)this.bd))) {
                return 37;
            }

            if(2 == (((double)this.bd))) {
                return 50;
            }

            if((((double)this.bd)) == 3) {
                return 75;
            }

            if(4 != (((double)this.bd))) {
                return 200;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("pb.bd(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return 100;
    }

    public void be(int arg1, boolean arg2, byte arg3) {
        if(!arg2) {
            try {
                this.bj.add(Integer.valueOf(arg1));
                goto label_10;
            label_7:
                this.bj.remove(Integer.valueOf(arg1));
            label_10:
                this.cj(-1389158083);
                return;
            label_6:
                goto label_13;
            }
            catch(RuntimeException v1) {
                goto label_6;
            }
        }
        else {
            goto label_7;
        }

        goto label_10;
    label_13:
        StringBuilder v2 = new StringBuilder();
        v2.append("pb.be(");
        v2.append(')');
        throw lx.al(((Throwable)v1), v2.toString());
    }

    public boolean bf(int arg3) {
        try {
            return this.ay.ae(0xDC604F37);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bf(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int bg(int arg3) {
        arg3 = -1050670535;
        try {
            return this.bf * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bg(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bh(int arg3) {
        arg3 = 1019971779;
        try {
            this.bw = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bh(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean bi(int arg2, byte arg3) {
        try {
            if(this.bj.contains(Integer.valueOf(arg2))) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.bi(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }

    public void bj(int arg4, byte arg5) {
        int v5;
        try {
            this.bt = new HashSet();
            v5 = 0;
            this.bv = 0;
            this.bq = 0;
            while(true) {
            label_6:
                if(v5 >= da.ae * 0x27CB1249) {
                    return;
                }

                byte v0 = 16;
                if(ae.al(v5, v0) == null) {
                }
                else if(ae.al(v5, v0).ao * 0x64537821 == arg4) {
                    this.bt.add(Integer.valueOf(ae.al(v5, v0).an * 0x11F2C855));
                }

                break;
            }
        }
        catch(RuntimeException v4) {
            goto label_31;
        }

        ++v5;
        goto label_6;
        return;
    label_31:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("pb.bj(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }

    public void bk(boolean arg2, short arg3) {
        try {
            this.by = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.bk(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bl(int arg4, boolean arg5, int arg6) {
        if(!arg5) {
            try {
                this.bu.add(Integer.valueOf(arg4));
                goto label_8;
            label_5:
                this.bu.remove(Integer.valueOf(arg4));
            label_8:
                for(arg6 = 0; arg6 < da.ae * 0x27CB1249; ++arg6) {
                    byte v0 = 16;
                    if(ae.al(arg6, v0) == null) {
                    }
                    else if(ae.al(arg6, v0).ao * 0x64537821 == arg4) {
                        int v0_1 = ae.al(arg6, v0).an * 0x11F2C855;
                        if(!arg5) {
                            this.bs.add(Integer.valueOf(v0_1));
                        }
                        else {
                            this.bs.remove(Integer.valueOf(v0_1));
                        }
                    }
                }

                this.cj(0x81E1036C);
                return;
            }
            catch(RuntimeException v4) {
                StringBuilder v5 = new StringBuilder();
                v5.append("pb.bl(");
                v5.append(')');
                throw lx.al(((Throwable)v4), v5.toString());
            }
        }
        else {
            goto label_5;
        }

        goto label_8;
    }

    public void bm(int arg2, byte arg3) {
        try {
            this.bt = new HashSet();
            this.bt.add(Integer.valueOf(arg2));
            this.bv = 0;
            this.bq = 0;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.bm(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public dh bn(int arg3, int arg4) {
        Object v0;
        try {
            Iterator v4 = this.am.values().iterator();
            do {
                if(!v4.hasNext()) {
                    return null;
                }

                v0 = v4.next();
                if(((dh)v0).av(-1880437085) != arg3) {
                    continue;
                }

                break;
            }
            while(true);
        }
        catch(RuntimeException v3) {
            goto label_14;
        }

        return ((dh)v0);
    label_14:
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("pb.bn(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
    }

    public void bo(int arg2, int arg3, int arg4, int arg5) {
        try {
            if(this.ag == null) {
                return;
            }

            int[] v2_1 = this.ag.ab(arg2, arg3, arg4, 0xBF0AEFB2);
            if(v2_1 != null) {
                this.bp(v2_1[0], v2_1[1], 0x50493142);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.bo(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bp(int arg2, int arg3, int arg4) {
        try {
            if(this.ag != null) {
                if(!this.ag.aq(arg2, arg3, 0xA05A0922)) {
                }
                else {
                    this.as = (arg2 - this.ag.ah(0x999D058) * 0x40) * 0xA11DD809;
                    this.ak = (arg3 - this.ag.ay(0x80304FF0) * 0x40) * 0x9E27DD15;
                    return;
                }
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.bp(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public af bq(int arg4) {
        try {
            if(this.ag == null) {
                return null;
            }

            return this.ag.af(this.bt(0x31D665C7), this.bv(639301290), 1076269030);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bq(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public boolean br(int arg3) {
        try {
            return this.bl ^ 1;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.br(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bs(boolean arg2, int arg3) {
        int v2 = (((int)arg2)) ^ 1;
        try {
            this.bl = ((boolean)v2);
            return;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.bs(");
            v3.append(')');
            throw lx.al(((Throwable)v2_1), v3.toString());
        }
    }

    public int bt(int arg3) {
        try {
            if(this.ag == null) {
                return -1;
            }

            return this.aw * 506361235 + this.ag.ah(0x999D058) * 0x40;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bt(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bu(int arg3) {
        HashSet v3 = null;
        try {
            this.bt = v3;
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bu(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    public int bv(int arg3) {
        try {
            if(this.ag == null) {
                return -1;
            }

            return this.ao * 0x32D6F895 + this.ag.ay(0x82217E38) * 0x40;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bv(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void bw(int arg2, int arg3, byte arg4) {
        try {
            if(this.ag == null) {
                return;
            }

            this.ad(arg2 - this.ag.ah(0x999D058) * 0x40, arg3 - this.ag.ay(0x80D0DE82) * 0x40, true, 0x410FD583);
            this.as = 0x5EE227F7;
            this.ak = 0x61D822EB;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.bw(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int bx(int arg3) {
        arg3 = 0xDA181289;
        try {
            return this.ba * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.bx(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void by(int arg2, int arg3, int arg4, int arg5) {
        try {
            if(this.ag == null) {
                return;
            }

            int[] v2_1 = this.ag.ab(arg2, arg3, arg4, 0x4F33926B);
            if(v2_1 != null) {
                this.bw(v2_1[0], v2_1[1], 1);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.by(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void bz(int arg2, byte arg3) {
        if(arg2 >= 1) {
            arg2 *= 339990593;
            try {
                this.bw = arg2;
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("pb.bz(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }

    public boolean ca(int arg2, byte arg3) {
        try {
            return this.bu.contains(Integer.valueOf(arg2)) ^ 1;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.ca(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public cg cb(int arg3) {
        try {
            cg v0 = null;
            if(!this.ay.ae(0xFA1BAD5F)) {
                return v0;
            }

            if(!this.at.ad(-1973206243)) {
                return v0;
            }

            HashMap v3_1 = this.at.aq(36);
            this.cj = new LinkedList();
            Iterator v3_2 = v3_1.values().iterator();
            while(v3_2.hasNext()) {
                this.cj.addAll(v3_2.next());
            }

            this.cd = this.cj.iterator();
            return this.cy(-1687610931);
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("pb.cb(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public void cc(ko arg2, ko arg3, ko arg4, od arg5, HashMap arg6, ef[] arg7) {
        this.au = arg7;
        this.aj = arg2;
        this.ad = arg3;
        this.aq = arg4;
        this.av = arg5;
        this.aa = new HashMap();
        this.aa.put(cz.ax, arg6.get(pb.ab));
        this.aa.put(cz.al, arg6.get(pb.af));
        this.aa.put(cz.ae, arg6.get(pb.ai));
        this.ay = new pg(arg2);
        int v2 = this.aj.ay(dv.ax.ap, 0xD4A3E869);
        int[] v3 = this.aj.aa(v2, 0x5429FA09);
        this.am = new HashMap(v3.length);
        int v4;
        for(v4 = 0; v4 < v3.length; ++v4) {
            lq v5 = new lq(this.aj.ae(v2, v3[v4], 0x78DC0DC9));
            dh v6 = new dh();
            v6.ap(v5, v3[v4], 0x7E18551D);
            this.am.put(v6.au(0xB12F286D), v6);
            if(v6.aa(0xF6A800E9)) {
                this.az = v6;
            }
        }

        this.am(this.az, -17514);
        this.ah = null;
    }

    public void cd(int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, byte arg30) {
        int v5;
        pb v1 = this;
        try {
            if(!v1.ay.ae(0x28C85E09)) {
                return;
            }

            int v2 = ((int)Math.ceil(((double)((((float)arg26)) / v1.ac))));
            int v3 = ((int)Math.ceil(((double)((((float)arg27)) / v1.ac))));
            List v0_1 = v1.at.ap(v1.aw * 506361235 - v2 / 2 - 1, v1.ao * 0x32D6F895 - v3 / 2 - 1, v1.aw * 506361235 + v2 / 2 + 1, v1.ao * 0x32D6F895 + v3 / 2 + 1, arg24, arg25, arg26, arg27, arg28, arg29, -55);
            if(v0_1.isEmpty()) {
                return;
            }

            Iterator v0_2 = v0_1.iterator();
            do {
            label_61:
                if(!v0_2.hasNext()) {
                    return;
                }

                Object v2_1 = v0_2.next();
                da v3_1 = ae.al(((cg)v2_1).al(-114), 16);
                int v4 = 0;
                v5 = v1.ca.length - 1;
                while(true) {
                label_72:
                    if(v5 < 0) {
                        goto label_96;
                    }

                    if(v3_1.ai[v5] != null) {
                        fh.kf.bq(v3_1.ai[v5], v3_1.av, v1.ca[v5], ((cg)v2_1).al(10), ((cg)v2_1).al.ax(1581369650), ((cg)v2_1).ax.ax(1580116181), 0xACDAC8C0);
                        v4 = 1;
                    }

                    break;
                }
            }
            while(true);
        }
        catch(RuntimeException v0) {
            goto label_101;
        }

        --v5;
        goto label_72;
    label_96:
        if(v4 == 0) {
            goto label_61;
        }

        return;
    label_101:
        StringBuilder v2_2 = new StringBuilder();
        v2_2.append("pb.cd(");
        v2_2.append(')');
        throw lx.al(((Throwable)v0), v2_2.toString());
    }

    public void ce(int arg17, int arg18, boolean arg19, int arg20, int arg21, int arg22, int arg23) {
        dw v8;
        iw v7;
        Object v4;
        int v6;
        int v5;
        pb v0 = this;
        if(!v0.ay.ae(1630308605)) {
            return;
        }

        v0.ap(-41);
        v0.aj(0);
        if(!arg19) {
            return;
        }

        int v14 = 2;
        int v2 = (((int)Math.ceil(((double)((((float)arg22)) / v0.ac))))) / v14;
        int v3 = (((int)Math.ceil(((double)((((float)arg23)) / v0.ac))))) / v14;
        List v2_1 = v0.at.ap(v0.aw * 506361235 - v2 - 1, v0.ao * 0x32D6F895 - v3 - 1, v2 + v0.aw * 506361235 + 1, v0.ao * 0x32D6F895 + v3 + 1, arg20, arg21, arg22, arg23, arg17, arg18, -17);
        HashSet v3_1 = new HashSet();
        Iterator v2_2 = v2_1.iterator();
        while(true) {
            v5 = 3;
            v6 = 0x913C576D;
            if(!v2_2.hasNext()) {
                break;
            }

            v4 = v2_2.next();
            v3_1.add(v4);
            v7 = new iw();
            v8 = new dw(((cg)v4).al(11), ((cg)v4).al, ((cg)v4).ax);
            Object[] v5_1 = new Object[v5];
            v5_1[0] = v8;
            v5_1[1] = Integer.valueOf(arg17);
            v5_1[v14] = Integer.valueOf(arg18);
            v7.ax(v5_1, 0xCEF05587);
            if(v0.cf.contains(v4)) {
                v7.al(17, v6);
            }
            else {
                v7.al(15, v6);
            }

            bv.ax(v7, -1280807432);
        }

        v2_2 = v0.cf.iterator();
        while(v2_2.hasNext()) {
            v4 = v2_2.next();
            if(v3_1.contains(v4)) {
                continue;
            }

            v7 = new iw();
            v8 = new dw(((cg)v4).al(-97), ((cg)v4).al, ((cg)v4).ax);
            Object[] v4_1 = new Object[v5];
            v4_1[0] = v8;
            v4_1[1] = Integer.valueOf(arg17);
            v4_1[v14] = Integer.valueOf(arg18);
            v7.ax(v4_1, 0xC868D6FE);
            v7.al(16, v6);
            bv.ax(v7, 0xA1C4F9F0);
        }

        v0.cf = v3_1;
    }

    public af cf(int arg8, af arg9, byte arg10) {
        Object v0_1;
        af v0;
        try {
            v0 = null;
            if(!this.ay.ae(-1268588905)) {
                return v0;
            }

            if(!this.at.ad(-2128303659)) {
                return v0;
            }

            int v2 = 0xAEACF223;
            int v4 = 0xB230B0A5;
            if(!this.ag.aq(arg9.al * v2, arg9.ae * v4, 0xB0E9C511)) {
                return v0;
            }

            Object v8_1 = this.at.aq(2).get(Integer.valueOf(arg8));
            if(v8_1 != null) {
                if(((List)v8_1).isEmpty()) {
                }
                else {
                    int v10 = -1;
                    Iterator v8_2 = ((List)v8_1).iterator();
                    while(true) {
                        if(v8_2.hasNext()) {
                            Object v1 = v8_2.next();
                            int v3 = ((cg)v1).ax.al * v2 - arg9.al * v2;
                            int v5 = ((cg)v1).ax.ae * v4 - arg9.ae * v4;
                            v5 = v5 * v5 + v3 * v3;
                            if(v5 == 0) {
                                return ((cg)v1).ax;
                            }
                            else {
                                if(v5 >= v10 && v0 != null) {
                                    continue;
                                }

                                v0_1 = v1;
                                v10 = v5;
                                continue;
                            }
                        }
                        else {
                            break;
                        }

                        return v0;
                    }

                    return ((cg)v0_1).ax;
                }
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("pb.cf(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }

        return v0;
    }

    final void cg(int arg2, int arg3, boolean arg4) {
        this.aw = arg2 * -1203628244;
        this.ao = arg3 * -465802802;
        ji.ax(0x2076E2C1);
        if(arg4) {
            this.aq(0xA1EC37CF);
        }
    }

    public void ch(int arg17, int arg18, boolean arg19, int arg20, int arg21, int arg22, int arg23) {
        dw v8;
        iw v7;
        Object v4;
        int v6;
        int v5;
        pb v0 = this;
        if(!v0.ay.ae(0x6540F8B0)) {
            return;
        }

        v0.ap(-117);
        v0.aj(0);
        if(!arg19) {
            return;
        }

        int v14 = 2;
        int v2 = (((int)Math.ceil(((double)((((float)arg22)) / v0.ac))))) / v14;
        int v3 = (((int)Math.ceil(((double)((((float)arg23)) / v0.ac))))) / v14;
        List v2_1 = v0.at.ap(v0.aw * 506361235 - v2 - 1, v0.ao * 0x32D6F895 - v3 - 1, v2 + v0.aw * 506361235 + 1, v0.ao * 0x32D6F895 + v3 + 1, arg20, arg21, arg22, arg23, arg17, arg18, -36);
        HashSet v3_1 = new HashSet();
        Iterator v2_2 = v2_1.iterator();
        while(true) {
            v5 = 3;
            v6 = 0x913C576D;
            if(!v2_2.hasNext()) {
                break;
            }

            v4 = v2_2.next();
            v3_1.add(v4);
            v7 = new iw();
            v8 = new dw(((cg)v4).al(-60), ((cg)v4).al, ((cg)v4).ax);
            Object[] v5_1 = new Object[v5];
            v5_1[0] = v8;
            v5_1[1] = Integer.valueOf(arg17);
            v5_1[v14] = Integer.valueOf(arg18);
            v7.ax(v5_1, 0x16CA3CB0);
            if(v0.cf.contains(v4)) {
                v7.al(17, v6);
            }
            else {
                v7.al(15, v6);
            }

            bv.ax(v7, 443409023);
        }

        v2_2 = v0.cf.iterator();
        while(v2_2.hasNext()) {
            v4 = v2_2.next();
            if(v3_1.contains(v4)) {
                continue;
            }

            v7 = new iw();
            v8 = new dw(((cg)v4).al(21), ((cg)v4).al, ((cg)v4).ax);
            Object[] v4_1 = new Object[v5];
            v4_1[0] = v8;
            v4_1[1] = Integer.valueOf(arg17);
            v4_1[v14] = Integer.valueOf(arg18);
            v7.ax(v4_1, 0x6F04D1AA);
            v7.al(16, v6);
            bv.ax(v7, 0xA0F7B998);
        }

        v0.cf = v3_1;
    }

    public void ci(ko arg2, ko arg3, ko arg4, od arg5, HashMap arg6, ef[] arg7) {
        this.au = arg7;
        this.aj = arg2;
        this.ad = arg3;
        this.aq = arg4;
        this.av = arg5;
        this.aa = new HashMap();
        this.aa.put(cz.ax, arg6.get(pb.ab));
        this.aa.put(cz.al, arg6.get(pb.af));
        this.aa.put(cz.ae, arg6.get(pb.ai));
        this.ay = new pg(arg2);
        int v2 = this.aj.ay(dv.ax.ap, 0xD4A3E869);
        int[] v3 = this.aj.aa(v2, 0xE4ABDB90);
        this.am = new HashMap(v3.length);
        int v4;
        for(v4 = 0; v4 < v3.length; ++v4) {
            lq v5 = new lq(this.aj.ae(v2, v3[v4], 0x78DC0DC9));
            dh v6 = new dh();
            v6.ap(v5, v3[v4], 0x7F4A007A);
            this.am.put(v6.au(-1840928902), v6);
            if(v6.aa(0xF6A800E9)) {
                this.az = v6;
            }
        }

        this.am(this.az, -23591);
        this.ah = null;
    }

    void cj(int arg3) {
        try {
            this.be.clear();
            this.be.addAll(this.bj);
            this.be.addAll(this.bs);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pb.cj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ck(int arg7, int arg8, boolean arg9, long arg10) {
        if(this.ag != null) {
            this.cx = this.ag.af((((int)((((float)(this.aw * 506361235))) + ((((float)(arg7 - this.bn * 0x8FCEF725))) - (((float)this.bx(0x73899723))) * this.ac / 2f) / this.ac))) + this.ag.ah(0x999D058) * 0x40, (((int)((((float)(this.ao * 0x32D6F895))) - ((((float)(arg8 - this.bp * -1098991445))) - (((float)this.bg(0xED502927))) * this.ac / 2f) / this.ac))) + this.ag.ay(-2099814760) * 0x40, 0x2E4BBFDD);
            if(this.cx != null && (arg9)) {
                if((jv.in(0x66CC9F75)) && (dt.bu.bm(82, 458408805)) && (dt.bu.bm(81, 0xDFB1EAA5))) {
                    br.iy(this.cx.al * 0xAEACF223, this.cx.ae * 0xB230B0A5, this.cx.ax * 400591065, false, 1428440281);
                    return;
                }

                int v9 = 1;
                if(this.bc) {
                    arg7 -= this.bh * 0x9CE74799;
                    arg8 -= this.bb * 0x8106F5F3;
                    if(arg10 - this.bz * 0x130EB2CB19D8028DL <= 500) {
                        int v10 = -25;
                        if(arg7 >= v10) {
                            int v11 = 25;
                            if(arg7 <= v11 && arg8 >= v10) {
                                if(arg8 > v11) {
                                    goto label_112;
                                }

                                goto label_113;
                            }
                        }
                    }

                label_112:
                    v9 = 0;
                }

            label_113:
                if(v9 == 0) {
                    return;
                }

                na v7 = cd.al(nf.dw, client.eh.an, -1970162968);
                v7.ae.aj(this.cx.ax(0xAC2F797F), 0x79EF67B1);
                client.eh.ae(v7, 0x50C15D);
                this.bz = 0;
            }
        }
        else {
            this.cx = null;
        }
    }

    void cl(int arg7, int arg8, boolean arg9, long arg10) {
        if(this.ag != null) {
            this.cx = this.ag.af((((int)((((float)(this.aw * 506361235))) + ((((float)(arg7 - this.bn * 0x8FCEF725))) - (((float)this.bx(0x7728F5CA))) * this.ac / 2f) / this.ac))) + this.ag.ah(0x999D058) * 0x40, (((int)((((float)(this.ao * 0x32D6F895))) - ((((float)(arg8 - this.bp * -1098991445))) - (((float)this.bg(0x494B6243))) * this.ac / 2f) / this.ac))) + this.ag.ay(0x8093E4FE) * 0x40, 0x441CF413);
            if(this.cx != null && (arg9)) {
                if((jv.in(0x7A0FEB03)) && (dt.bu.bm(82, 0xE387687B)) && (dt.bu.bm(81, 0xE0D3B24B))) {
                    br.iy(this.cx.al * 0xAEACF223, this.cx.ae * 0xB230B0A5, this.cx.ax * 400591065, false, 1706807924);
                    return;
                }

                int v9 = 1;
                if(this.bc) {
                    arg7 -= this.bh * 0x9CE74799;
                    arg8 -= this.bb * 0x8106F5F3;
                    if(arg10 - this.bz * 0x130EB2CB19D8028DL <= 500) {
                        int v10 = -25;
                        if(arg7 >= v10) {
                            int v11 = 25;
                            if(arg7 <= v11 && arg8 >= v10) {
                                if(arg8 > v11) {
                                    goto label_112;
                                }

                                goto label_113;
                            }
                        }
                    }

                label_112:
                    v9 = 0;
                }

            label_113:
                if(v9 == 0) {
                    return;
                }

                na v7 = cd.al(nf.dw, client.eh.an, 0x95747980);
                v7.ae.aj(this.cx.ax(0x8B9108F6), 0x79EF67B1);
                client.eh.ae(v7, 0x891DEC5C);
                this.bz = 0;
            }
        }
        else {
            this.cx = null;
        }
    }

    void cm() {
        if(dx.rj != null) {
            this.ac = this.bd;
            return;
        }

        float v2 = 30f;
        if(this.ac < this.bd) {
            this.ac = Math.min(this.bd, this.ac + this.ac / v2);
        }

        if(this.ac > this.bd) {
            this.ac = Math.max(this.bd, this.ac - this.ac / v2);
        }
    }

    public void cn(int arg9, int arg10, boolean arg11, boolean arg12) {
        long v6 = ji.ax(0x2076E2C1);
        this.an(arg9, arg10, arg12, v6);
        if((this.ab(0x8A32985E)) || dt.bu.ax != ik.aj) {
            this.aq(160125319);
        }
        else {
            arg9 = dt.bu.ad[0];
            int v11 = dt.bu.aq[0];
            int v1 = -2010985905;
            int v2 = -1;
            if(v2 == this.bx * v1) {
                this.bx = this.aw * 1964065661;
                this.bg = this.ao * 0x4DFEB085;
            }

            if(this.bx * v1 != v2) {
                this.ad(this.bx * v1 - (((int)((((float)(dt.bu.ad[0] - dt.bu.ap[0]))) / this.bd))), (((int)((((float)(dt.bu.aq[0] - dt.bu.aj[0]))) / this.bd))) + this.bg * 0xAEEA2CD1, false, 0x9D2DCF1B);
            }

            arg10 = v11;
        }

        if(arg12) {
            this.bz = v6 * -6960589072759222203L;
            this.bh = arg9 * 0x75851CA9;
            this.bb = arg10 * 0xE974AB3B;
        }
    }

    final void co() {
        this.bg = 0x91BE53CF;
        this.bx = 1568404305;
    }

    public void cp(ko arg2, ko arg3, ko arg4, od arg5, HashMap arg6, ef[] arg7) {
        this.au = arg7;
        this.aj = arg2;
        this.ad = arg3;
        this.aq = arg4;
        this.av = arg5;
        this.aa = new HashMap();
        this.aa.put(cz.ax, arg6.get(pb.ab));
        this.aa.put(cz.al, arg6.get(pb.af));
        this.aa.put(cz.ae, arg6.get(pb.ai));
        this.ay = new pg(arg2);
        int v2 = this.aj.ay(dv.ax.ap, 0xD4A3E869);
        int[] v3 = this.aj.aa(v2, 934107833);
        this.am = new HashMap(v3.length);
        int v4;
        for(v4 = 0; v4 < v3.length; ++v4) {
            lq v5 = new lq(this.aj.ae(v2, v3[v4], 0x78DC0DC9));
            dh v6 = new dh();
            v6.ap(v5, v3[v4], 0x663F83C7);
            this.am.put(v6.au(0xA358034A), v6);
            if(v6.aa(0xF6A800E9)) {
                this.az = v6;
            }
        }

        this.am(this.az, 4795);
        this.ah = null;
    }

    final void cq(int arg2, int arg3, boolean arg4) {
        this.aw = arg2 * 0x1CE7F09B;
        this.ao = arg3 * 0xEE9012BD;
        ji.ax(0x2076E2C1);
        if(arg4) {
            this.aq(-627876509);
        }
    }

    public void cr() {
        ad.an(-40);
    }

    public void cs(int arg17, int arg18, boolean arg19, int arg20, int arg21, int arg22, int arg23) {
        dw v8;
        iw v7;
        Object v4;
        int v6;
        int v5;
        pb v0 = this;
        if(!v0.ay.ae(1425395030)) {
            return;
        }

        v0.ap(-109);
        v0.aj(0);
        if(!arg19) {
            return;
        }

        int v14 = 2;
        int v2 = (((int)Math.ceil(((double)((((float)arg22)) / v0.ac))))) / v14;
        int v3 = (((int)Math.ceil(((double)((((float)arg23)) / v0.ac))))) / v14;
        List v2_1 = v0.at.ap(v0.aw * 506361235 - v2 - 1, v0.ao * 0x32D6F895 - v3 - 1, v2 + v0.aw * 506361235 + 1, v0.ao * 0x32D6F895 + v3 + 1, arg20, arg21, arg22, arg23, arg17, arg18, -80);
        HashSet v3_1 = new HashSet();
        Iterator v2_2 = v2_1.iterator();
        while(true) {
            v5 = 3;
            v6 = 0x913C576D;
            if(!v2_2.hasNext()) {
                break;
            }

            v4 = v2_2.next();
            v3_1.add(v4);
            v7 = new iw();
            v8 = new dw(((cg)v4).al(-95), ((cg)v4).al, ((cg)v4).ax);
            Object[] v5_1 = new Object[v5];
            v5_1[0] = v8;
            v5_1[1] = Integer.valueOf(arg17);
            v5_1[v14] = Integer.valueOf(arg18);
            v7.ax(v5_1, 0xE32CE224);
            if(v0.cf.contains(v4)) {
                v7.al(17, v6);
            }
            else {
                v7.al(15, v6);
            }

            bv.ax(v7, 0xE6E2F5BA);
        }

        v2_2 = v0.cf.iterator();
        while(v2_2.hasNext()) {
            v4 = v2_2.next();
            if(v3_1.contains(v4)) {
                continue;
            }

            v7 = new iw();
            v8 = new dw(((cg)v4).al(-46), ((cg)v4).al, ((cg)v4).ax);
            Object[] v4_1 = new Object[v5];
            v4_1[0] = v8;
            v4_1[1] = Integer.valueOf(arg17);
            v4_1[v14] = Integer.valueOf(arg18);
            v7.ax(v4_1, -96844100);
            v7.al(16, v6);
            bv.ax(v7, 484041524);
        }

        v0.cf = v3_1;
    }

    void ct() {
        if(dx.rj != null) {
            this.ac = this.bd;
            return;
        }

        float v2 = 30f;
        if(this.ac < this.bd) {
            this.ac = Math.min(this.bd, this.ac + this.ac / v2);
        }

        if(this.ac > this.bd) {
            this.ac = Math.max(this.bd, this.ac - this.ac / v2);
        }
    }

    void cu() {
        if(!this.ab(-659358001)) {
            return;
        }

        int v1 = -960416199;
        int v3 = 506361235;
        int v0 = this.as * v1 - this.aw * v3;
        int v4 = 415730237;
        int v6 = 0x32D6F895;
        int v2 = this.ak * v4 - this.ao * v6;
        int v5 = 8;
        if(v0 != 0) {
            v0 /= Math.min(v5, Math.abs(v0));
        }

        if(v2 != 0) {
            v2 /= Math.min(v5, Math.abs(v2));
        }

        this.ad(this.aw * v3 + v0, v2 + this.ao * v6, true, -164090442);
        if(this.as * v1 == this.aw * v3 && this.ao * v6 == this.ak * v4) {
            this.as = 0x5EE227F7;
            this.ak = 0x61D822EB;
        }
    }

    final void cv(int arg2, int arg3, boolean arg4) {
        this.aw = arg2 * 0x1CE7F09B;
        this.ao = arg3 * 0xEE9012BD;
        ji.ax(0x2076E2C1);
        if(arg4) {
            this.aq(0xC906655B);
        }
    }

    public void cw(ko arg2, ko arg3, ko arg4, od arg5, HashMap arg6, ef[] arg7) {
        this.au = arg7;
        this.aj = arg2;
        this.ad = arg3;
        this.aq = arg4;
        this.av = arg5;
        this.aa = new HashMap();
        this.aa.put(cz.ax, arg6.get(pb.ab));
        this.aa.put(cz.al, arg6.get(pb.af));
        this.aa.put(cz.ae, arg6.get(pb.ai));
        this.ay = new pg(arg2);
        int v2 = this.aj.ay(dv.ax.ap, 0xD4A3E869);
        int[] v3 = this.aj.aa(v2, 0x904242B1);
        this.am = new HashMap(v3.length);
        int v4;
        for(v4 = 0; v4 < v3.length; ++v4) {
            lq v5 = new lq(this.aj.ae(v2, v3[v4], 0x78DC0DC9));
            dh v6 = new dh();
            v6.ap(v5, v3[v4], 0x643F96D0);
            this.am.put(v6.au(0xB34DE1F6), v6);
            if(v6.aa(0xF6A800E9)) {
                this.az = v6;
            }
        }

        this.am(this.az, 0x378E);
        this.ah = null;
    }

    public void cx(int arg2, int arg3, af arg4, af arg5, int arg6) {
        try {
            iw v6 = new iw();
            v6.ax(new Object[]{new dw(arg3, arg4, arg5)}, 144193560);
            arg3 = 0x913C576D;
            switch(arg2) {
                case 1008: {
                    v6.al(10, arg3);
                    break;
                }
                case 1009: {
                    v6.al(11, arg3);
                    break;
                }
                case 1010: {
                    v6.al(12, arg3);
                    break;
                }
                case 1011: {
                    v6.al(13, arg3);
                    break;
                }
                case 1012: {
                    v6.al(14, arg3);
                    break;
                }
                default: {
                    break;
                }
            }

            bv.ax(v6, 0x10C4FE11);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("pb.cx(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public cg cy(int arg4) {
        Object v4_1;
        try {
            cg v0 = null;
            if(this.cd == null) {
                return v0;
            }

            do {
                if(!this.cd.hasNext()) {
                    return v0;
                }

                v4_1 = this.cd.next();
                if(((cg)v4_1).al(0x30) == -1) {
                    continue;
                }

                break;
            }
            while(true);
        }
        catch(RuntimeException v4) {
            goto label_17;
        }

        return ((cg)v4_1);
    label_17:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("pb.cy(");
        v0_1.append(')');
        throw lx.al(((Throwable)v4), v0_1.toString());
    }

    public void cz(int arg9, int arg10, boolean arg11, boolean arg12) {
        long v6 = ji.ax(0x2076E2C1);
        this.an(arg9, arg10, arg12, v6);
        if((this.ab(0x863FF103)) || dt.bu.ax != ik.aj) {
            this.aq(0x99E185FE);
        }
        else {
            arg9 = dt.bu.ad[0];
            int v11 = dt.bu.aq[0];
            int v1 = -2010985905;
            int v2 = -1;
            if(v2 == this.bx * v1) {
                this.bx = this.aw * 1964065661;
                this.bg = this.ao * 0x4DFEB085;
            }

            if(this.bx * v1 != v2) {
                this.ad(this.bx * v1 - (((int)((((float)(dt.bu.ad[0] - dt.bu.ap[0]))) / this.bd))), (((int)((((float)(dt.bu.aq[0] - dt.bu.aj[0]))) / this.bd))) + this.bg * 0xAEEA2CD1, false, -2095561890);
            }

            arg10 = v11;
        }

        if(arg12) {
            this.bz = v6 * -6960589072759222203L;
            this.bh = arg9 * 0x75851CA9;
            this.bb = arg10 * 0xE974AB3B;
        }
    }

    public int da() {
        if(this.ag == null) {
            return -1;
        }

        return this.ag.av(-1880437085);
    }

    public dh db(int arg4, int arg5, int arg6) {
        Object v1;
        Iterator v0 = this.am.values().iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((dh)v1).ad(arg4, arg5, arg6, -56));

        return ((dh)v1);
    }

    public void dc(int arg4, int arg5, int arg6, boolean arg7) {
        int v0_1;
        dh v0 = this.af(arg4, arg5, arg6, 34);
        if(v0 == null) {
            if(arg7) {
                v0 = this.az;
            }
            else {
                return;
            }
        }

        if(this.ah != v0 || (arg7)) {
            this.ah = v0;
            this.am(v0, 0x4B13);
            v0_1 = 1;
        }
        else {
            v0_1 = 0;
        }

        if(v0_1 != 0 || (arg7)) {
            this.ah(arg4, arg5, arg6, 0);
        }
    }

    void dd(dh arg2) {
        if(this.ag != null && this.ag == arg2) {
            return;
        }

        this.az(arg2, -1017850125);
        this.ah(-1, -1, -1, 0);
    }

    public void de(int arg4, int arg5, int arg6, boolean arg7) {
        int v0_1;
        dh v0 = this.af(arg4, arg5, arg6, 35);
        if(v0 == null) {
            if(arg7) {
                v0 = this.az;
            }
            else {
                return;
            }
        }

        if(this.ah != v0 || (arg7)) {
            this.ah = v0;
            this.am(v0, 1602);
            v0_1 = 1;
        }
        else {
            v0_1 = 0;
        }

        if(v0_1 != 0 || (arg7)) {
            this.ah(arg4, arg5, arg6, 0);
        }
    }

    public void df(int arg2) {
        dh v2 = this.bn(arg2, -1527006064);
        if(v2 != null) {
            this.am(v2, -106);
        }
    }

    void dg(dh arg2) {
        if(this.ag != null && this.ag == arg2) {
            return;
        }

        this.az(arg2, -1017850125);
        this.ah(-1, -1, -1, 0);
    }

    public dh dh(int arg4, int arg5, int arg6) {
        Object v1;
        Iterator v0 = this.am.values().iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((dh)v1).ad(arg4, arg5, arg6, -110));

        return ((dh)v1);
    }

    public int di() {
        if(this.ag == null) {
            return -1;
        }

        return this.ag.av(-1880437085);
    }

    public void dj(int arg4, int arg5, int arg6, boolean arg7) {
        int v0_1;
        dh v0 = this.af(arg4, arg5, arg6, 70);
        if(v0 == null) {
            if(arg7) {
                v0 = this.az;
            }
            else {
                return;
            }
        }

        if(this.ah != v0 || (arg7)) {
            this.ah = v0;
            this.am(v0, 0x4545);
            v0_1 = 1;
        }
        else {
            v0_1 = 0;
        }

        if(v0_1 != 0 || (arg7)) {
            this.ah(arg4, arg5, arg6, 0);
        }
    }

    public void dk(int arg4, int arg5, int arg6, boolean arg7) {
        int v0_1;
        dh v0 = this.af(arg4, arg5, arg6, 105);
        if(v0 == null) {
            if(arg7) {
                v0 = this.az;
            }
            else {
                return;
            }
        }

        if(this.ah != v0 || (arg7)) {
            this.ah = v0;
            this.am(v0, -16939);
            v0_1 = 1;
        }
        else {
            v0_1 = 0;
        }

        if(v0_1 != 0 || (arg7)) {
            this.ah(arg4, arg5, arg6, 0);
        }
    }

    public void dl(int arg2) {
        dh v2 = this.bn(arg2, -1501977478);
        if(v2 != null) {
            this.am(v2, -2130);
        }
    }

    public void dm(int arg4, int arg5, int arg6, boolean arg7) {
        int v0_1;
        dh v0 = this.af(arg4, arg5, arg6, 0x77);
        if(v0 == null) {
            if(arg7) {
                v0 = this.az;
            }
            else {
                return;
            }
        }

        if(this.ah != v0 || (arg7)) {
            this.ah = v0;
            this.am(v0, 11106);
            v0_1 = 1;
        }
        else {
            v0_1 = 0;
        }

        if(v0_1 != 0 || (arg7)) {
            this.ah(arg4, arg5, arg6, 0);
        }
    }

    public int dn() {
        if(this.ag == null) {
            return -1;
        }

        return this.ag.av(-1880437085);
    }

    public dh do() {
        return this.ag;
    }

    boolean dp() {
        int v1 = -1;
        boolean v0 = v1 == this.as * -960416199 || v1 == this.ak * 415730237 ? false : true;
        return v0;
    }

    public dh dq() {
        return this.ag;
    }

    public int dr() {
        if(this.ag == null) {
            return -1;
        }

        return this.ag.av(-1880437085);
    }

    public void ds(int arg2) {
        dh v2 = this.bn(arg2, -1600340249);
        if(v2 != null) {
            this.am(v2, -3776);
        }
    }

    public dh dt() {
        return this.ag;
    }

    public dh du(int arg4, int arg5, int arg6) {
        Object v1;
        Iterator v0 = this.am.values().iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((dh)v1).ad(arg4, arg5, arg6, -113));

        return ((dh)v1);
    }

    final void dv() {
        this.bg = 0x47E09BE;
        this.bx = 0xB8956490;
    }

    public dh dw(int arg4, int arg5, int arg6) {
        Object v1;
        Iterator v0 = this.am.values().iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(!((dh)v1).ad(arg4, arg5, arg6, -112));

        return ((dh)v1);
    }

    public int dx() {
        if(this.ag == null) {
            return -1;
        }

        return this.ag.av(-1880437085);
    }

    public void dy(int arg2) {
        dh v2 = this.bn(arg2, 0xE76920B0);
        if(v2 != null) {
            this.am(v2, 5805);
        }
    }

    public dh dz() {
        return this.ag;
    }

    public void ea(dh arg8, af arg9, af arg10, boolean arg11) {
        if(arg8 == null) {
            return;
        }

        if(this.ag == null || this.ag != arg8) {
            this.az(arg8, -1017850125);
        }

        int v0 = 0xB230B0A5;
        int v1 = 0xAEACF223;
        int v2 = 400591065;
        if((arg11) || !this.ag.ad(arg9.ax * v2, arg9.al * v1, arg9.ae * v0, -73)) {
            this.ah(arg10.ax * v2, arg10.al * v1, arg10.ae * v0, 0);
        }
        else {
            this.ah(arg9.ax * v2, arg9.al * v1, arg9.ae * v0, 0);
        }
    }

    public void eb(int arg13, int arg14, int arg15, int arg16, fa arg17) {
        pb v0 = this;
        if(!v0.ay.ae(69301804)) {
            return;
        }

        if(!v0.at.ad(-1989661580)) {
            v0.at.ax(v0.aj, v0.ag.au(0x95D3508F), client.aq, 1061630561);
            if(!v0.at.ad(0x802667CB)) {
                return;
            }
        }

        v0.at.an(arg13, arg14, arg15, arg16, v0.bt, v0.bq * 0x766E9F61, v0.bo * 0x57FBDED5, arg17, -64);
    }

    public void ec(int arg2) {
        this.bd = this.ac(arg2, 0x707635A6);
    }

    public void ed(int arg13, int arg14, int arg15, int arg16, fa arg17) {
        pb v0 = this;
        if(!v0.ay.ae(-1545223509)) {
            return;
        }

        if(!v0.at.ad(0x8914B260)) {
            v0.at.ax(v0.aj, v0.ag.au(0x99EC0189), client.aq, 0x7ECF74C9);
            if(!v0.at.ad(0x82A02F31)) {
                return;
            }
        }

        v0.at.an(arg13, arg14, arg15, arg16, v0.bt, v0.bq * 0x766E9F61, v0.bo * 0x57FBDED5, arg17, -95);
    }

    void ee(int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, fa arg31) {
        pb v8 = this;
        if(dx.rj != null) {
            int v9 = 0x200 / (v8.at.am * 0xF857EF8E);
            int v11 = arg27 + 0x200;
            int v13 = arg28 + 0x200;
            int v14 = arg29 / 2;
            int v0 = v8.bt(0x31D665C7) - v14 - v9;
            int v15 = arg30 / 2;
            int v16 = v8.bv(0x7DBF1F86) - v15 - v9;
            int v17 = v9 + v0;
            int v18 = 1152800555;
            int v19 = 0x7C2BF7C7;
            int v20 = arg25 - (v17 - v8.cc * v18) * (v8.at.am * v19);
            int v21 = 0x6F9A236D;
            int v22 = arg26 - (v9 - (v16 - v8.cp * v21)) * (v8.at.am * v19);
            int v10 = 0x31D665C7;
            if(this.ay(v11, v13, v20, v22, arg27, arg28, 0x27BF5BF4)) {
                if(v8.cy == null || v11 != v8.cy.al || v8.cy.ae != v13) {
                    v8.cy = new es(v11, v13);
                }
                else {
                    Arrays.fill(v8.cy.ax, 0);
                }

                v8.cc = (v8.bt(v10) - v14 - v9) * 0x95D1AF83;
                v8.cp = (v8.bv(0xFEF87E4F) - v15 - v9) * 0x71265E65;
                v8.cw = v8.at.am * 0x5DFC61E9;
                dx.rj.ap(v8.cc * v18, v8.cp * v21, v8.cy, ((float)(v8.cw * 0x13594E2F)), 0xA4F2B86C);
                v8.ci = client.rr * -808006961;
                v20 = arg25 - (v17 - v8.cc * v18) * (v8.at.am * v19);
                v22 = arg26 - v8.at.am * v19 * (v9 - (v16 - v8.cp * v21));
            }

            arg31.ae(arg25, arg26, arg27, arg28, 0, 0x80, 1973501674);
            arg31.as(v8.cy, v20, v22, 0xC0, 2060022786);
        }
    }

    float ef(int arg2) {
        if(25 == arg2) {
            return 1f;
        }

        if(arg2 == 37) {
            return 1.5f;
        }

        if(arg2 == 50) {
            return 2f;
        }

        if(arg2 == 75) {
            return 3f;
        }

        if(100 == arg2) {
            return 4f;
        }

        return 8f;
    }

    void eg(int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, fa arg31) {
        pb v8 = this;
        if(dx.rj != null) {
            int v9 = 0x200 / (v8.at.am * 0xF857EF8E);
            int v11 = arg27 + 0x200;
            int v13 = arg28 + 0x200;
            int v14 = arg29 / 2;
            int v0 = v8.bt(0x31D665C7) - v14 - v9;
            int v15 = arg30 / 2;
            int v16 = v8.bv(0x4767F489) - v15 - v9;
            int v17 = v9 + v0;
            int v18 = 1152800555;
            int v19 = 0x7C2BF7C7;
            int v20 = arg25 - (v17 - v8.cc * v18) * (v8.at.am * v19);
            int v21 = 0x6F9A236D;
            int v22 = arg26 - (v9 - (v16 - v8.cp * v21)) * (v8.at.am * v19);
            int v10 = 0x31D665C7;
            if(this.ay(v11, v13, v20, v22, arg27, arg28, 0xB5DD3C65)) {
                if(v8.cy == null || v11 != v8.cy.al || v8.cy.ae != v13) {
                    v8.cy = new es(v11, v13);
                }
                else {
                    Arrays.fill(v8.cy.ax, 0);
                }

                v8.cc = (v8.bt(v10) - v14 - v9) * 0x95D1AF83;
                v8.cp = (v8.bv(0x51EE993F) - v15 - v9) * 0x71265E65;
                v8.cw = v8.at.am * 0x5DFC61E9;
                dx.rj.ap(v8.cc * v18, v8.cp * v21, v8.cy, ((float)(v8.cw * 0x13594E2F)), 0x56C4F1B5);
                v8.ci = client.rr * -808006961;
                v20 = arg25 - (v17 - v8.cc * v18) * (v8.at.am * v19);
                v22 = arg26 - v8.at.am * v19 * (v9 - (v16 - v8.cp * v21));
            }

            arg31.ae(arg25, arg26, arg27, arg28, 0, 0x80, 0x68D117EB);
            arg31.as(v8.cy, v20, v22, 0xC0, 0x4268FFA8);
        }
    }

    public void eh(int arg2) {
        this.bd = this.ac(arg2, 905171603);
    }

    void ei(int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        int v7 = arg19 / 2 + arg17;
        int v15 = arg18 + arg20 / 2 - 38;
        arg22.ar(arg17, arg18, arg19, arg20, 0, 2);
        arg22.fz(v7 + 210428608, v15, 2073813975, -995177043, -1025127267, 0xCF8001C2);
        arg22.ar(v7 - 0x7D0A00C3, v15 + 2, arg21 * 3, 30, 0xFFFF0000, 2);
        this.av.ai(gs.ne, v7, v15 + 20, -1, -1, arg22);
    }

    void ej(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, 2063232054);
        if(v3 == null) {
            v3 = this.ag.ab(this.ag.as(0x7F0F0121), this.ag.ao(1770606213), this.ag.ak(36), 0xD559AC49);
        }

        this.ad(v3[0] - this.ag.ah(0x999D058) * 0x40, v3[1] - this.ag.ay(0x80890341) * 0x54416E98, true, 0x8ED01705);
        this.as = 0x514864CB;
        this.ak = 0x61D822EB;
        this.ac = this.ac(this.ag.ag(0xD54EB40F), 0xB6ECF979);
        this.bd = this.ac;
        this.cj = null;
        this.cd = null;
        this.at.al(0x8E2E0A55);
    }

    void ek(dh arg2) {
        if(this.ag != null && this.ag == arg2) {
            return;
        }

        this.az(arg2, -1017850125);
        this.ah(-1, -1, -1, 0);
    }

    public void el(int arg30, int arg31, int arg32, int arg33, int arg34, fa arg35) {
        boolean v0_1;
        pb v9 = this;
        int v7 = arg32;
        int v8 = arg33;
        fa v15 = arg35;
        int[] v14 = new int[4];
        v15.et(v14, 0x63888B80);
        int v22 = v7 + arg30;
        int v23 = v8 + arg31;
        arg35.ef(arg30, arg31, v22, v23, -1750085502);
        arg35.ar(arg30, arg31, arg32, arg33, 0, 2);
        int v5 = v9.ay.ar(51);
        int v0 = 100;
        if(v5 < v0) {
            this.ak(arg30, arg31, arg32, arg33, v5, arg35, 1513459042);
            return;
        }

        if(!v9.at.ad(-2013836580)) {
            v9.at.ax(v9.aj, v9.ag.au(-1867658006), client.aq, 0xDDD5D5B6);
            if(!v9.at.ad(-2032816484)) {
                return;
            }
        }

        int v3 = 0x57FBDED5;
        int v4 = 0x766E9F61;
        if(v9.bt != null) {
            v9.bq += 0xD11844A1;
            if(v9.bq * v4 % (v9.bo * v3) == 0) {
                v9.bq = 0;
                v9.bv += 0x916C2129;
            }

            if(v9.bv * 0xFB640B19 < v9.bw * 0xAC6437C1) {
                goto label_85;
            }

            if(v9.by) {
                goto label_85;
            }

            v9.bt = null;
        }

    label_85:
        int v6 = ((int)Math.ceil(((double)((((float)v7)) / v9.ac))));
        v5 = ((int)Math.ceil(((double)((((float)v8)) / v9.ac))));
        int v24 = 506361235;
        int v25 = v6 / 2;
        int v26 = 0x32D6F895;
        int v27 = v5 / 2;
        int[] v28 = v14;
        fa v1 = v15;
        v9.at.ae(v9.aw * v24 - v25, v9.ao * v26 - v27, v25 + v9.aw * v24, v9.ao * v26 + v27, arg30, arg31, v22, v23, arg35, 0x7694F2D8);
        if(!v9.bl) {
            if(arg34 - v9.br * 0xC3B0FD17 > v0) {
                v9.br = 0x18980AA7 * arg34;
                v0_1 = true;
            }
            else {
                v0_1 = false;
            }

            v9.at.ar(v9.aw * v24 - v25, v9.ao * v26 - v27, v9.aw * v24 + v25, v9.ao * v26 + v27, arg30, arg31, v22, v23, v9.be, v9.bt, v9.bq * v4, v9.bo * 0x57FBDED5, v0_1, arg35, 0);
        }

        fa v11 = v1;
        int v12 = v5;
        int v13 = v6;
        this.aw(arg30, arg31, arg32, arg33, v6, v12, arg35, -18);
        if((jv.in(0x7BA07123)) && (v9.cb) && v9.cx != null) {
            od v0_2 = v9.av;
            v0_2.aq("Coord: " + v9.cx, v11.ap * 0xE4D30573 + 10, v11.ar * 2002832733 + 20, 0xFFFF00, -1, arg35);
        }

        v9.ba = v13 * -1400175687;
        v9.bf = v12 * 0x3A2CC409;
        v9.bn = -411808595 * arg30;
        v9.bp = 0x3A378203 * arg31;
        v11.fa(v28, -989494300);
    }

    void em(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, 0x78F434F5);
        if(v3 == null) {
            v3 = this.ag.ab(this.ag.as(0x7F0F0121), this.ag.ao(0x7891E0A9), this.ag.ak(66), 0x7F48B77E);
        }

        this.ad(v3[0] - this.ag.ah(0x999D058) * 0x40, v3[1] - this.ag.ay(0x802D5A65) * 0x40, true, 0xE398A4F0);
        this.as = 0xBBAC5B5;
        this.ak = 0x61D822EB;
        this.ac = this.ac(this.ag.ag(0xD54EB40F), 0xCD565B0A);
        this.bd = this.ac;
        this.cj = null;
        this.cd = null;
        this.at.al(0x860C96EA);
    }

    void en(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, -1384800323);
        if(v3 == null) {
            v3 = this.ag.ab(this.ag.as(0x7F0F0121), this.ag.ao(1762193002), this.ag.ak(7), -2111739210);
        }

        this.ad(v3[0] - this.ag.ah(0x999D058) * 719775270, v3[1] - this.ag.ay(-2101586702) * 0x40, true, 0x91F2109A);
        this.as = 0x5EE227F7;
        this.ak = 0x61D822EB;
        this.ac = this.ac(this.ag.ag(0xD54EB40F), 0x4536C998);
        this.bd = this.ac;
        this.cj = null;
        this.cd = null;
        this.at.al(-2007026320);
    }

    float eo(int arg2) {
        if(25 == arg2) {
            return 1f;
        }

        if(arg2 == 37) {
            return 1.5f;
        }

        if(arg2 == 50) {
            return 2f;
        }

        if(arg2 == 75) {
            return 3f;
        }

        if(100 == arg2) {
            return 4f;
        }

        return 8f;
    }

    float ep(int arg2) {
        if(25 == arg2) {
            return 1f;
        }

        if(arg2 == 37) {
            return 1.5f;
        }

        if(arg2 == 50) {
            return 2f;
        }

        if(arg2 == 75) {
            return 3f;
        }

        if(100 == arg2) {
            return 4f;
        }

        return 8f;
    }

    void eq(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, -710888790);
        if(v3 == null) {
            v3 = this.ag.ab(this.ag.as(0x7F0F0121), this.ag.ao(2130009727), this.ag.ak(87), 0x7450C25C);
        }

        this.ad(v3[0] - this.ag.ah(0x999D058) * 0x40, v3[1] - this.ag.ay(-2122055029) * 0x40, true, 0x420D3496);
        this.as = 0x5EE227F7;
        this.ak = 0x61D822EB;
        this.ac = this.ac(this.ag.ag(0xD54EB40F), 0x32082B39);
        this.bd = this.ac;
        this.cj = null;
        this.cd = null;
        this.at.al(-1850627961);
    }

    public void er(dh arg7, af arg8, af arg9, boolean arg10) {
        if(arg7 == null) {
            return;
        }

        if(this.ag == null || this.ag != arg7) {
            this.az(arg7, -1017850125);
        }

        int v0 = 400591065;
        int v1 = 0xAEACF223;
        if((arg10) || !this.ag.ad(arg8.ax * 0x9A0DBD6F, arg8.al * v1, arg8.ae * 0xF4E9FEFC, -39)) {
            this.ah(arg9.ax * v0, arg9.al * v1, arg9.ae * 0xB230B0A5, 0);
        }
        else {
            this.ah(arg8.ax * v0, arg8.al * 1180157766, arg8.ae * 0x34FB11A5, 0);
        }
    }

    public void es(int arg13, int arg14, int arg15, int arg16, fa arg17) {
        pb v0 = this;
        if(!v0.ay.ae(226049388)) {
            return;
        }

        if(!v0.at.ad(0x82074A28)) {
            v0.at.ax(v0.aj, v0.ag.au(-1714012089), client.aq, 0x7129DB60);
            if(!v0.at.ad(0x806F6ADE)) {
                return;
            }
        }

        v0.at.an(arg13, arg14, arg15, arg16, v0.bt, v0.bq * 0x766E9F61, v0.bo * 0x8E9F171, arg17, -56);
    }

    public int et() {
        if(1 == (((double)this.bd))) {
            return 25;
        }

        if(1.5 == (((double)this.bd))) {
            return 37;
        }

        if(2 == (((double)this.bd))) {
            return 0x2AD00AB1;
        }

        if((((double)this.bd)) == 3) {
            return 75;
        }

        if(4 == (((double)this.bd))) {
            return 100;
        }

        return 0x49F63F4F;
    }

    void eu(int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, fa arg31) {
        pb v8 = this;
        if(dx.rj != null) {
            int v9 = 0x200 / (v8.at.am * 0xF857EF8E);
            int v11 = arg27 + 0x200;
            int v13 = arg28 + 0x200;
            int v14 = arg29 / 2;
            int v0 = v8.bt(0x31D665C7) - v14 - v9;
            int v15 = arg30 / 2;
            int v16 = v8.bv(0x2B518180) - v15 - v9;
            int v17 = v9 + v0;
            int v18 = 1152800555;
            int v19 = 0x7C2BF7C7;
            int v20 = arg25 - (v17 - v8.cc * v18) * (v8.at.am * v19);
            int v21 = 0x6F9A236D;
            int v22 = arg26 - (v9 - (v16 - v8.cp * v21)) * (v8.at.am * v19);
            int v10 = 0x31D665C7;
            if(this.ay(v11, v13, v20, v22, arg27, arg28, 0x76805490)) {
                if(v8.cy == null || v11 != v8.cy.al || v8.cy.ae != v13) {
                    v8.cy = new es(v11, v13);
                }
                else {
                    Arrays.fill(v8.cy.ax, 0);
                }

                v8.cc = (v8.bt(v10) - v14 - v9) * 0x95D1AF83;
                v8.cp = (v8.bv(1184028468) - v15 - v9) * 0x71265E65;
                v8.cw = v8.at.am * 0x5DFC61E9;
                dx.rj.ap(v8.cc * v18, v8.cp * v21, v8.cy, ((float)(v8.cw * 0x13594E2F)), 0xEDBD70C1);
                v8.ci = client.rr * -808006961;
                v20 = arg25 - (v17 - v8.cc * v18) * (v8.at.am * v19);
                v22 = arg26 - v8.at.am * v19 * (v9 - (v16 - v8.cp * v21));
            }

            arg31.ae(arg25, arg26, arg27, arg28, 0, 0x80, 1184306048);
            arg31.as(v8.cy, v20, v22, 0xC0, 1044890137);
        }
    }

    boolean ev(int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if(this.cy == null) {
            return 1;
        }

        if(this.cy.al == arg5) {
            if(this.cy.ae != arg6) {
            }
            else if(this.cw * 0x13594E2F != this.at.am * 0x7C2BF7C7) {
                return 1;
            }
            else if(this.ci * 0x2FAC24C1 != client.rr * 0x5EA1A36F) {
                return 1;
            }
            else {
                if(arg7 <= 0) {
                    if(arg8 > 0) {
                    }
                    else {
                        if(arg7 + arg5 >= arg9) {
                            if(arg6 + arg8 < arg10) {
                            }
                            else {
                                return 0;
                            }
                        }

                        return 1;
                    }
                }

                return 1;
            }
        }

        return 1;
    }

    boolean ew(int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if(this.cy == null) {
            return 1;
        }

        if(this.cy.al == arg5) {
            if(this.cy.ae != arg6) {
            }
            else if(this.cw * 0x394D4C92 != this.at.am * 0x7C2BF7C7) {
                return 1;
            }
            else if(this.ci * 201107364 != client.rr * 0x2988020F) {
                return 1;
            }
            else {
                if(arg7 <= 0) {
                    if(arg8 > 0) {
                    }
                    else {
                        if(arg7 + arg5 >= arg9) {
                            if(arg6 + arg8 < arg10) {
                            }
                            else {
                                return 0;
                            }
                        }

                        return 1;
                    }
                }

                return 1;
            }
        }

        return 1;
    }

    void ex(int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        int v7 = arg19 / 2 + arg17;
        int v15 = arg18 + arg20 / 2 - 38;
        arg22.ar(arg17, arg18, arg19, arg20, 0, 2);
        arg22.fz(v7 - 0x98, v15, 304, 34, 0xFFFF0000, 0x8BEDEF2A);
        arg22.ar(v7 - 150, v15 + 2, arg21 * 3, 30, 0xFFFF0000, 2);
        this.av.ai(gs.ne, v7, v15 + 20, -1, -1, arg22);
    }

    void ey(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, -1942401969);
        if(v3 == null) {
            v3 = this.ag.ab(this.ag.as(0x7F0F0121), this.ag.ao(1910942565), this.ag.ak(0x7A), 0x3B72E410);
        }

        this.ad(v3[0] - this.ag.ah(0x999D058) * 0x40, v3[1] - this.ag.ay(-2122404122) * 0x40, true, 0x492F0FE6);
        this.as = 0x5EE227F7;
        this.ak = 0x61D822EB;
        this.ac = this.ac(this.ag.ag(0xD54EB40F), -1221360908);
        this.bd = this.ac;
        this.cj = null;
        this.cd = null;
        this.at.al(-1765480382);
    }

    void ez(dh arg5) {
        this.ag = arg5;
        this.at = new cy(this.au, this.aa, this.ad, this.aq);
        this.ay.ax(this.ag.au(0x8F0756EA), 0xFEC81D40);
    }

    public int fa() {
        if(1 == (((double)this.bd))) {
            return 25;
        }

        if(1.5 == (((double)this.bd))) {
            return 959272800;
        }

        if(2 == (((double)this.bd))) {
            return -40016869;
        }

        if((((double)this.bd)) == 3) {
            return 75;
        }

        if(4 == (((double)this.bd))) {
            return 100;
        }

        return 0x6CD2A0C1;
    }

    public void fb(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, 0xC0D3898D);
        if(v3 != null) {
            this.bp(v3[0], v3[1], 0xA03110F0);
        }
    }

    public void fc(int arg3, int arg4) {
        if(this.ag == null) {
            return;
        }

        this.ad(arg3 - this.ag.ah(0x999D058) * 0x40, arg4 - this.ag.ay(-2107987882) * 0x40, true, 0x673E3BCD);
        this.as = 0x5EE227F7;
        this.ak = 0x61D822EB;
    }

    public void fd() {
        this.ay.al(70);
    }

    public void fe() {
        this.ay.al(78);
    }

    public void ff(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, 0x3AAD2B58);
        if(v3 != null) {
            this.bw(v3[0], v3[1], 1);
        }
    }

    public af fg() {
        if(this.ag == null) {
            return null;
        }

        return this.ag.af(this.bt(0x31D665C7), this.bv(0x66FC53A2), 760537304);
    }

    public void fh(int arg3, int arg4) {
        if(this.ag != null) {
            if(!this.ag.aq(arg3, arg4, 0xB4A92F07)) {
            }
            else {
                this.as = (arg3 - this.ag.ah(0x999D058) * 0x40) * -1856029650;
                this.ak = (arg4 - this.ag.ay(-2099626794) * 0x40) * 0x9E27DD15;
                return;
            }
        }
    }

    public void fi(int arg3, int arg4) {
        if(this.ag == null) {
            return;
        }

        this.ad(arg3 - this.ag.ah(0x999D058) * 0x40, arg4 - this.ag.ay(0x81EA7C13) * 0x40, true, 0x68C8EC93);
        this.as = 0x420F3E5E;
        this.ak = 0x61D822EB;
    }

    public af fj() {
        if(this.ag == null) {
            return null;
        }

        return this.ag.af(this.bt(0x31D665C7), this.bv(0x4E486326), 0x331C6304);
    }

    public void fk(int arg3, int arg4) {
        if(this.ag != null) {
            if(!this.ag.aq(arg3, arg4, 0xC80A6555)) {
            }
            else {
                this.as = (arg3 - this.ag.ah(0x999D058) * 0x40) * 0xA11DD809;
                this.ak = (arg4 - this.ag.ay(-2109327956) * 0x40) * 0x9E27DD15;
                return;
            }
        }
    }

    public void fl(int arg3, int arg4) {
        if(this.ag != null) {
            if(!this.ag.aq(arg3, arg4, -1853700661)) {
            }
            else {
                this.as = (arg3 - this.ag.ah(0x999D058) * 0x40) * 0xA11DD809;
                this.ak = (arg4 - this.ag.ay(0x80C26BD2) * 0x40) * 0x9E27DD15;
                return;
            }
        }
    }

    public void fm(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, 1935614500);
        if(v3 != null) {
            this.bw(v3[0], v3[1], 1);
        }
    }

    public void fn(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, 0x535E4DF5);
        if(v3 != null) {
            this.bp(v3[0], v3[1], -2021234389);
        }
    }

    public void fo(int arg3, int arg4) {
        if(this.ag == null) {
            return;
        }

        this.ad(arg3 - this.ag.ah(0x999D058) * -1936619805, arg4 - this.ag.ay(0x8190EC33) * 0x982F0EF7, true, 0x2D4415D1);
        this.as = 0xF955E5A0;
        this.ak = 0x4FD0B597;
    }

    public int fp() {
        if(this.ag == null) {
            return -1;
        }

        return this.ao * 0x32D6F895 + this.ag.ay(-2143391005) * 0x40;
    }

    public int fq() {
        if(this.ag == null) {
            return -1;
        }

        return this.aw * 506361235 + this.ag.ah(0x999D058) * 0x6DA1C735;
    }

    public af fr() {
        if(this.ag == null) {
            return null;
        }

        return this.ag.af(this.bt(0x31D665C7), this.bv(0x78852AF), 0x3AE5EAB3);
    }

    public int fs() {
        return this.bf * 0xE4F101F;
    }

    public int ft() {
        if(this.ag == null) {
            return -1;
        }

        return this.ao * 0x32D6F895 + this.ag.ay(-2139327001) * 0x40;
    }

    public void fu(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, 0xC0967721);
        if(v3 != null) {
            this.bp(v3[0], v3[1], 0xDD784C26);
        }
    }

    public void fv(int arg3, int arg4) {
        if(this.ag == null) {
            return;
        }

        this.ad(arg3 - this.ag.ah(0x999D058) * 0x40, arg4 - this.ag.ay(-2110671039) * -200564423, true, 0xED6323F3);
        this.as = 0xA200A9EA;
        this.ak = 0x9CBD523C;
    }

    public int fw() {
        if(this.ag == null) {
            return -1;
        }

        return this.ao * 0x200A7CF6 + this.ag.ay(-2099354691) * 0xCC2F37F5;
    }

    public void fx(int arg3, int arg4, int arg5) {
        if(this.ag == null) {
            return;
        }

        int[] v3 = this.ag.ab(arg3, arg4, arg5, 0x5C79610);
        if(v3 != null) {
            this.bp(v3[0], v3[1], -1206744525);
        }
    }

    public void fy(int arg3, int arg4) {
        if(this.ag != null) {
            if(!this.ag.aq(arg3, arg4, 0xAA165A96)) {
            }
            else {
                this.as = (arg3 - this.ag.ah(0x999D058) * 0x40) * 0xA11DD809;
                this.ak = (arg4 - this.ag.ay(0x80830156) * 0x40) * 0x9E27DD15;
                return;
            }
        }
    }

    public dh fz(int arg4) {
        Object v1;
        Iterator v0 = this.am.values().iterator();
        do {
            if(!v0.hasNext()) {
                return null;
            }

            v1 = v0.next();
        }
        while(((dh)v1).av(-1880437085) != arg4);

        return ((dh)v1);
    }

    public void ga(boolean arg1) {
        this.by = arg1;
    }

    public void gb(int arg5) {
        this.bt = new HashSet();
        int v0 = 0;
        this.bv = 0;
        this.bq = 0;
        while(v0 < da.ae * 0x27CB1249) {
            byte v1 = 16;
            if(ae.al(v0, v1) == null) {
            }
            else if(ae.al(v0, v1).ao * 0x64537821 == arg5) {
                this.bt.add(Integer.valueOf(ae.al(v0, v1).an * 0x11F2C855));
            }

            ++v0;
        }
    }

    public void gc(int arg2) {
        if(arg2 >= 1) {
            this.bo = arg2 * 0xF08031F;
        }
    }

    public void gd(int arg1, boolean arg2) {
        if(!arg2) {
            this.bj.add(Integer.valueOf(arg1));
        }
        else {
            this.bj.remove(Integer.valueOf(arg1));
        }

        this.cj(0xA4E8880B);
    }

    public void ge(boolean arg1) {
        arg1 = !arg1 ? true : false;
        this.bl = arg1;
    }

    public void gf(int arg5, boolean arg6) {
        if(!arg6) {
            this.bu.add(Integer.valueOf(arg5));
        }
        else {
            this.bu.remove(Integer.valueOf(arg5));
        }

        int v0;
        for(v0 = 0; v0 < da.ae * 295249202; ++v0) {
            byte v1 = 16;
            if(ae.al(v0, v1) == null) {
            }
            else if(ae.al(v0, v1).ao * 0x64537821 == arg5) {
                int v1_1 = ae.al(v0, v1).an * 0x11F2C855;
                if(!arg6) {
                    this.bs.add(Integer.valueOf(v1_1));
                }
                else {
                    this.bs.remove(Integer.valueOf(v1_1));
                }
            }
        }

        this.cj(0x9DCFBEC6);
    }

    public void gg() {
        this.bw = 1532600805;
    }

    public void gh(int arg1, boolean arg2) {
        if(!arg2) {
            this.bj.add(Integer.valueOf(arg1));
        }
        else {
            this.bj.remove(Integer.valueOf(arg1));
        }

        this.cj(0x9AB1CAB1);
    }

    public void gi() {
        this.bt = null;
    }

    public void gj(int arg2) {
        this.bt = new HashSet();
        this.bt.add(Integer.valueOf(arg2));
        this.bv = 0;
        this.bq = 0;
    }

    public void gk() {
        this.bt = null;
    }

    public void gl() {
        this.bo = 1704250474;
    }

    public void gm(int arg2) {
        if(arg2 >= 1) {
            this.bo = arg2 * 0x20C06A7D;
        }
    }

    public void gn(boolean arg1) {
        this.by = arg1;
    }

    public void go(int arg1, boolean arg2) {
        if(!arg2) {
            this.bj.add(Integer.valueOf(arg1));
        }
        else {
            this.bj.remove(Integer.valueOf(arg1));
        }

        this.cj(0xACF62C3E);
    }

    public void gp(int arg1, boolean arg2) {
        if(!arg2) {
            this.bj.add(Integer.valueOf(arg1));
        }
        else {
            this.bj.remove(Integer.valueOf(arg1));
        }

        this.cj(0xA419BA39);
    }

    public void gq(int arg5, boolean arg6) {
        if(!arg6) {
            this.bu.add(Integer.valueOf(arg5));
        }
        else {
            this.bu.remove(Integer.valueOf(arg5));
        }

        int v0;
        for(v0 = 0; v0 < da.ae * 0x27CB1249; ++v0) {
            byte v1 = 16;
            if(ae.al(v0, v1) == null) {
            }
            else if(ae.al(v0, v1).ao * 0x64537821 == arg5) {
                int v1_1 = ae.al(v0, v1).an * 0x11F2C855;
                if(!arg6) {
                    this.bs.add(Integer.valueOf(v1_1));
                }
                else {
                    this.bs.remove(Integer.valueOf(v1_1));
                }
            }
        }

        this.cj(-1992510356);
    }

    public void gr(int arg5) {
        this.bt = new HashSet();
        int v0 = 0;
        this.bv = 0;
        this.bq = 0;
        while(v0 < da.ae * 0x27CB1249) {
            byte v1 = 16;
            if(ae.al(v0, v1) == null) {
            }
            else if(ae.al(v0, v1).ao * 0x64537821 == arg5) {
                this.bt.add(Integer.valueOf(ae.al(v0, v1).an * 0x11F2C855));
            }

            ++v0;
        }
    }

    public void gs(boolean arg1) {
        this.by = arg1;
    }

    public void gt(int arg5) {
        this.bt = new HashSet();
        int v0 = 0;
        this.bv = 0;
        this.bq = 0;
        while(v0 < da.ae * 0x27CB1249) {
            byte v1 = 16;
            if(ae.al(v0, v1) == null) {
            }
            else if(ae.al(v0, v1).ao * 0x64537821 == arg5) {
                this.bt.add(Integer.valueOf(ae.al(v0, v1).an * 0x11F2C855));
            }

            ++v0;
        }
    }

    public void gu() {
        this.bo = 0x34674CF9;
    }

    public void gv(int arg5, boolean arg6) {
        if(!arg6) {
            this.bu.add(Integer.valueOf(arg5));
        }
        else {
            this.bu.remove(Integer.valueOf(arg5));
        }

        int v0;
        for(v0 = 0; v0 < da.ae * 0x55368AA4; ++v0) {
            byte v1 = 16;
            if(ae.al(v0, v1) == null) {
            }
            else if(ae.al(v0, v1).ao * 1574016785 == arg5) {
                int v1_1 = ae.al(v0, v1).an * 0xCA287046;
                if(!arg6) {
                    this.bs.add(Integer.valueOf(v1_1));
                }
                else {
                    this.bs.remove(Integer.valueOf(v1_1));
                }
            }
        }

        this.cj(0x95BFB1BB);
    }

    public void gw(boolean arg1) {
        arg1 = !arg1 ? true : false;
        this.bl = arg1;
    }

    public void gx(int arg2) {
        this.bt = new HashSet();
        this.bt.add(Integer.valueOf(arg2));
        this.bv = 0;
        this.bq = 0;
    }

    public void gy(int arg5) {
        this.bt = new HashSet();
        int v0 = 0;
        this.bv = 0;
        this.bq = 0;
        while(v0 < da.ae * 355700332) {
            byte v1 = 16;
            if(ae.al(v0, v1) == null) {
            }
            else if(ae.al(v0, v1).ao * 2009769357 == arg5) {
                this.bt.add(Integer.valueOf(ae.al(v0, v1).an * 0x11F2C855));
            }

            ++v0;
        }
    }

    public void gz(boolean arg1) {
        arg1 = !arg1 ? true : false;
        this.bl = arg1;
    }

    public void ha(int arg24, int arg25, int arg26, int arg27, int arg28, int arg29) {
        pb v0 = this;
        if(!v0.ay.ae(0xBA711A25)) {
            return;
        }

        int v2 = (((int)Math.ceil(((double)((((float)arg26)) / v0.ac))))) / 2;
        int v3 = (((int)Math.ceil(((double)((((float)arg27)) / v0.ac))))) / 2;
        List v1 = v0.at.ap(v0.aw * 506361235 - v2 - 1, v0.ao * 0x32D6F895 - v3 - 1, v0.aw * 506361235 + v2 + 1, v0.ao * 0x32D6F895 + v3 + 1, arg24, arg25, arg26, arg27, arg28, arg29, -41);
        if(v1.isEmpty()) {
            return;
        }

        Iterator v1_1 = v1.iterator();
        do {
            if(!v1_1.hasNext()) {
                return;
            }

            Object v2_1 = v1_1.next();
            da v3_1 = ae.al(((cg)v2_1).al(-39), 16);
            int v4 = 0;
            int v5;
            for(v5 = v0.ca.length - 1; v5 >= 0; --v5) {
                if(v3_1.ai[v5] != null) {
                    fh.kf.bq(v3_1.ai[v5], v3_1.av, v0.ca[v5], ((cg)v2_1).al(-127), ((cg)v2_1).al.ax(0x963E59B), ((cg)v2_1).ax.ax(0xB103696B), 0xACDAC8C0);
                    v4 = 1;
                }
            }
        }
        while(v4 == 0);
    }

    public boolean hb() {
        boolean v0 = !this.bl ? true : false;
        return v0;
    }

    public boolean hc() {
        boolean v0 = !this.bl ? true : false;
        return v0;
    }

    void he() {
        this.be.clear();
        this.be.addAll(this.bj);
        this.be.addAll(this.bs);
    }

    public boolean hf(int arg2) {
        boolean v2 = !this.bj.contains(Integer.valueOf(arg2)) ? true : false;
        return v2;
    }

    public boolean hg(int arg2) {
        return this.bj.contains(Integer.valueOf(arg2)) ^ 1;
    }

    public boolean hi() {
        boolean v0 = !this.bl ? true : false;
        return v0;
    }

    public af hj(int arg8, af arg9) {
        af v1 = null;
        if(!this.ay.ae(0xE09DE375)) {
            return v1;
        }

        if(!this.at.ad(0x81F6A912)) {
            return v1;
        }

        if(!this.ag.aq(arg9.al * 1050381773, arg9.ae * -1279050634, 0x99D9BE90)) {
            return v1;
        }

        Object v8 = this.at.aq(57).get(Integer.valueOf(arg8));
        if(v8 != null) {
            if(((List)v8).isEmpty()) {
            }
            else {
                int v0 = -1;
                Iterator v8_1 = ((List)v8).iterator();
                while(true) {
                    if(v8_1.hasNext()) {
                        Object v2 = v8_1.next();
                        int v4 = ((cg)v2).ax.al * 519407909 - arg9.al * 0x66DD1154;
                        int v5 = ((cg)v2).ax.ae * 0x6AF1B8F1 - arg9.ae * 0x166800FE;
                        v5 = v5 * v5 + v4 * v4;
                        if(v5 == 0) {
                            return ((cg)v2).ax;
                        }
                        else {
                            if(v5 >= v0 && v1 != null) {
                                continue;
                            }

                            Object v1_1 = v2;
                            v0 = v5;
                            continue;
                        }
                    }
                    else {
                        break;
                    }

                    return v1;
                }

                return ((cg)v1).ax;
            }
        }

        return v1;
    }

    public boolean hk(int arg2) {
        boolean v2 = !this.bu.contains(Integer.valueOf(arg2)) ? true : false;
        return v2;
    }

    void hl() {
        this.be.clear();
        this.be.addAll(this.bj);
        this.be.addAll(this.bs);
    }

    public boolean hn(int arg2) {
        boolean v2 = !this.bj.contains(Integer.valueOf(arg2)) ? true : false;
        return v2;
    }

    public boolean ho(int arg2) {
        boolean v2 = !this.bu.contains(Integer.valueOf(arg2)) ? true : false;
        return v2;
    }

    public void hp(int arg24, int arg25, int arg26, int arg27, int arg28, int arg29) {
        pb v0 = this;
        if(!v0.ay.ae(0xC0DD0FC9)) {
            return;
        }

        int v2 = (((int)Math.ceil(((double)((((float)arg26)) / v0.ac))))) / 2;
        int v3 = (((int)Math.ceil(((double)((((float)arg27)) / v0.ac))))) / 2;
        List v1 = v0.at.ap(v0.aw * -109745225 - v2 - 1, v0.ao * 0xDDBEF590 - v3 - 1, v0.aw * 506361235 + v2 + 1, v0.ao * 0xAC061141 + v3 + 1, arg24, arg25, arg26, arg27, arg28, arg29, -71);
        if(v1.isEmpty()) {
            return;
        }

        Iterator v1_1 = v1.iterator();
        do {
            if(!v1_1.hasNext()) {
                return;
            }

            Object v2_1 = v1_1.next();
            da v3_1 = ae.al(((cg)v2_1).al(-111), 16);
            int v4 = 0;
            int v5;
            for(v5 = v0.ca.length - 1; v5 >= 0; --v5) {
                if(v3_1.ai[v5] != null) {
                    fh.kf.bq(v3_1.ai[v5], v3_1.av, v0.ca[v5], ((cg)v2_1).al(-86), ((cg)v2_1).al.ax(0xCDC4F6C7), ((cg)v2_1).ax.ax(-1441623208), 0xACDAC8C0);
                    v4 = 1;
                }
            }
        }
        while(v4 == 0);
    }

    public void hq(int arg24, int arg25, int arg26, int arg27, int arg28, int arg29) {
        pb v0 = this;
        if(!v0.ay.ae(0x982C3AF4)) {
            return;
        }

        int v2 = (((int)Math.ceil(((double)((((float)arg26)) / v0.ac))))) / 2;
        int v3 = (((int)Math.ceil(((double)((((float)arg27)) / v0.ac))))) / 2;
        List v1 = v0.at.ap(v0.aw * 0x46B9683 - v2 - 1, v0.ao * 0x25111994 - v3 - 1, v0.aw * 506361235 + v2 + 1, v0.ao * 0xFAC15083 + v3 + 1, arg24, arg25, arg26, arg27, arg28, arg29, -63);
        if(v1.isEmpty()) {
            return;
        }

        Iterator v1_1 = v1.iterator();
        do {
            if(!v1_1.hasNext()) {
                return;
            }

            Object v2_1 = v1_1.next();
            da v3_1 = ae.al(((cg)v2_1).al(18), 16);
            int v4 = 0;
            int v5;
            for(v5 = v0.ca.length - 1; v5 >= 0; --v5) {
                if(v3_1.ai[v5] != null) {
                    fh.kf.bq(v3_1.ai[v5], v3_1.av, v0.ca[v5], ((cg)v2_1).al(-82), ((cg)v2_1).al.ax(0x2362948E), ((cg)v2_1).ax.ax(0x3ACF7790), 0xACDAC8C0);
                    v4 = 1;
                }
            }
        }
        while(v4 == 0);
    }

    public boolean hr(int arg2) {
        return this.bj.contains(Integer.valueOf(arg2)) ^ 1;
    }

    public boolean hs(int arg2) {
        boolean v2 = !this.bj.contains(Integer.valueOf(arg2)) ? true : false;
        return v2;
    }

    public boolean hu(int arg2) {
        boolean v2 = !this.bu.contains(Integer.valueOf(arg2)) ? true : false;
        return v2;
    }

    public af hv(int arg9, af arg10) {
        af v1 = null;
        if(!this.ay.ae(-1981994009)) {
            return v1;
        }

        if(!this.at.ad(-2081896990)) {
            return v1;
        }

        int v4 = 0xB230B0A5;
        if(!this.ag.aq(arg10.al * 0x2BDAB533, arg10.ae * v4, -1540156584)) {
            return v1;
        }

        Object v9 = this.at.aq(2).get(Integer.valueOf(arg9));
        if(v9 != null) {
            if(((List)v9).isEmpty()) {
            }
            else {
                int v0 = -1;
                Iterator v9_1 = ((List)v9).iterator();
                while(true) {
                    if(v9_1.hasNext()) {
                        Object v2 = v9_1.next();
                        int v5 = ((cg)v2).ax.al * 932940101 - arg10.al * 0xAEACF223;
                        int v3 = ((cg)v2).ax.ae * v4 - arg10.ae * 0x4F11B941;
                        v3 = v3 * v3 + v5 * v5;
                        if(v3 == 0) {
                            return ((cg)v2).ax;
                        }
                        else {
                            if(v3 >= v0 && v1 != null) {
                                continue;
                            }

                            Object v1_1 = v2;
                            v0 = v3;
                            continue;
                        }
                    }
                    else {
                        break;
                    }

                    return v1;
                }

                return ((cg)v1).ax;
            }
        }

        return v1;
    }

    public boolean hw(int arg2) {
        boolean v2 = !this.bu.contains(Integer.valueOf(arg2)) ? true : false;
        return v2;
    }

    public void ia(int arg3, int arg4, af arg5, af arg6) {
        iw v0 = new iw();
        v0.ax(new Object[]{new dw(arg4, arg5, arg6)}, 380823349);
        arg4 = 0x913C576D;
        switch(arg3) {
            case 1008: {
                v0.al(10, arg4);
                break;
            }
            case 1009: {
                v0.al(11, arg4);
                break;
            }
            case 1010: {
                v0.al(12, arg4);
                break;
            }
            case 1011: {
                v0.al(13, arg4);
                break;
            }
            case 1012: {
                v0.al(14, arg4);
                break;
            }
            default: {
                break;
            }
        }

        bv.ax(v0, 0x5B205CB3);
    }

    public af ib(int arg8, af arg9) {
        Object v1_1;
        af v1 = null;
        if(!this.ay.ae(0x2F47B6AA)) {
            return v1;
        }

        if(!this.at.ad(-2137540407)) {
            return v1;
        }

        if(!this.ag.aq(arg9.al * 0x80B73267, arg9.ae * 0xB230B0A5, -1378036008)) {
            return v1;
        }

        Object v8 = this.at.aq(33).get(Integer.valueOf(arg8));
        if(v8 != null) {
            if(((List)v8).isEmpty()) {
            }
            else {
                int v0 = -1;
                Iterator v8_1 = ((List)v8).iterator();
                while(true) {
                    if(v8_1.hasNext()) {
                        Object v2 = v8_1.next();
                        int v4 = ((cg)v2).ax.al * 0xAEACF223 - arg9.al * 0x2ECA0B3C;
                        int v5 = ((cg)v2).ax.ae * 0xDA0877AC - arg9.ae * 0x804182F1;
                        v5 = v5 * v5 + v4 * v4;
                        if(v5 == 0) {
                            return ((cg)v2).ax;
                        }
                        else {
                            if(v5 >= v0 && v1 != null) {
                                continue;
                            }

                            v1_1 = v2;
                            v0 = v5;
                            continue;
                        }
                    }
                    else {
                        break;
                    }

                    return v1;
                }

                return ((cg)v1_1).ax;
            }
        }

        return v1;
    }

    public cg ig() {
        cg v1 = null;
        if(!this.ay.ae(0x19C74EED)) {
            return v1;
        }

        if(!this.at.ad(0x87D2FC6A)) {
            return v1;
        }

        HashMap v0 = this.at.aq(80);
        this.cj = new LinkedList();
        Iterator v0_1 = v0.values().iterator();
        while(v0_1.hasNext()) {
            this.cj.addAll(v0_1.next());
        }

        this.cd = this.cj.iterator();
        return this.cy(-1012833249);
    }

    public cg ii() {
        Object v0;
        cg v1 = null;
        if(this.cd == null) {
            return v1;
        }

        do {
            if(!this.cd.hasNext()) {
                return v1;
            }

            v0 = this.cd.next();
        }
        while(((cg)v0).al(-83) == -1);

        return ((cg)v0);
    }

    public cg ik() {
        Object v0;
        cg v1 = null;
        if(this.cd == null) {
            return v1;
        }

        do {
            if(!this.cd.hasNext()) {
                return v1;
            }

            v0 = this.cd.next();
        }
        while(((cg)v0).al(-30) == -1);

        return ((cg)v0);
    }

    public af il(int arg8, af arg9) {
        Object v1_1;
        af v1 = null;
        if(!this.ay.ae(0x5A45DF92)) {
            return v1;
        }

        if(!this.at.ad(0x89018B36)) {
            return v1;
        }

        int v4 = 0xB230B0A5;
        if(!this.ag.aq(arg9.al * 109851413, arg9.ae * v4, 0xD5AB07B3)) {
            return v1;
        }

        Object v8 = this.at.aq(23).get(Integer.valueOf(arg8));
        if(v8 != null) {
            if(((List)v8).isEmpty()) {
            }
            else {
                int v0 = -1;
                Iterator v8_1 = ((List)v8).iterator();
                while(true) {
                    if(v8_1.hasNext()) {
                        Object v2 = v8_1.next();
                        int v5 = ((cg)v2).ax.al * 0xAEACF223 - arg9.al * -827003700;
                        int v3 = ((cg)v2).ax.ae * v4 - arg9.ae * v4;
                        v3 = v3 * v3 + v5 * v5;
                        if(v3 == 0) {
                            return ((cg)v2).ax;
                        }
                        else {
                            if(v3 >= v0 && v1 != null) {
                                continue;
                            }

                            v1_1 = v2;
                            v0 = v3;
                            continue;
                        }
                    }
                    else {
                        break;
                    }

                    return v1;
                }

                return ((cg)v1_1).ax;
            }
        }

        return v1;
    }

    public cg io() {
        Object v0;
        cg v1 = null;
        if(this.cd == null) {
            return v1;
        }

        do {
            if(!this.cd.hasNext()) {
                return v1;
            }

            v0 = this.cd.next();
        }
        while(((cg)v0).al(-50) == -1);

        return ((cg)v0);
    }

    public void ip(int arg3, int arg4, af arg5, af arg6) {
        iw v0 = new iw();
        v0.ax(new Object[]{new dw(arg4, arg5, arg6)}, 0x42447E1D);
        arg4 = 0x913C576D;
        switch(arg3) {
            case 1008: {
                v0.al(10, arg4);
                break;
            }
            case 1009: {
                v0.al(11, arg4);
                break;
            }
            case 1010: {
                v0.al(12, arg4);
                break;
            }
            case 1011: {
                v0.al(13, arg4);
                break;
            }
            case 1012: {
                v0.al(14, arg4);
                break;
            }
            default: {
                break;
            }
        }

        bv.ax(v0, 0x2BC8D5A7);
    }

    public cg is() {
        cg v1 = null;
        if(!this.ay.ae(0xE864FA10)) {
            return v1;
        }

        if(!this.at.ad(0x84D1E80D)) {
            return v1;
        }

        HashMap v0 = this.at.aq(0x77);
        this.cj = new LinkedList();
        Iterator v0_1 = v0.values().iterator();
        while(v0_1.hasNext()) {
            this.cj.addAll(v0_1.next());
        }

        this.cd = this.cj.iterator();
        return this.cy(1099724317);
    }

    public cg ix() {
        Object v0;
        cg v1 = null;
        if(this.cd == null) {
            return v1;
        }

        do {
            if(!this.cd.hasNext()) {
                return v1;
            }

            v0 = this.cd.next();
        }
        while(((cg)v0).al(55) == -1);

        return ((cg)v0);
    }
}

