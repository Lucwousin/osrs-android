public class ha implements fk {
    boolean ab;
    boolean ad;
    int ae;
    boolean aj;
    int al;
    boolean an;
    boolean ap;
    boolean aq;
    int ar;
    boolean ax;
    public static final int cy = 82;

    ha() {
        try {
            super();
            this.ax = true;
            this.al = 0;
            this.an = false;
            this.ap = false;
            this.aj = false;
            this.ad = false;
            this.aq = false;
            this.ab = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ha.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public boolean aa(int arg1, long arg2) {
        int v2 = 0x64CFD7DC;
        try {
            fz.av(arg1, v2);
            return 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ha.aa(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }

    public static Object ab(byte[] arg1, boolean arg2, int arg3) {
        if(arg1 == null) {
            return null;
        }

        try {
            if(arg1.length > 0x88) {
                nq v2 = new nq();
                ((nc)v2).al(arg1, 0xFD23BD25);
                return v2;
            }

            if(!arg2) {
                return arg1;
            }

            return co.ai(arg1, 1119730295);
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ha.ab(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }

        return arg1;
    }

    public boolean ab(int arg1, int arg2, int arg3, int arg4, long arg5) {
        try {
            if(!this.ax && this.al * 0x8D2FF199 == 1) {
                this.al(arg2, arg3, arg4, 0x6157);
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ha.ab(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return 1;
    }

    static void ac(int arg3) {
        try {
            client.al.aba(-199082286).gj("fpVPSZ", 0x7EF1D2D7);
            ax.bf(gs.mg, gs.mv, gs.ms, 0x63D3C206);
            hq.cm = 2050759121;
            ga.as(-1800570947).at(0x86E93AC);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ha.ac(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ac() {
        this.ax = false;
        this.al = 0;
    }

    public boolean ad(char arg1, long arg2) {
        byte v2 = -1;
        try {
            er.aa(arg1, v2);
            return 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ha.ad(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }

    void ae(short arg3) {
        try {
            this.an = false;
            this.ap = false;
            this.aj = false;
            this.ad = false;
            this.aq = false;
            this.ab = false;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ha.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean af(int arg1, int arg2, int arg3, long arg4) {
        return 1;
    }

    void ag(int arg3, int arg4, int arg5) {
        if(this.an) {
            return;
        }

        if(arg3 == 0 || 1 == arg3 || !ci.ch && arg3 == 4) {
            this.ax(arg4, arg5, 0x5247F1C3);
            this.an = true;
        }
    }

    void ah(int arg3, int arg4, int arg5) {
        if(this.an) {
            return;
        }

        if(arg3 == 0 || 1 == arg3 || !ci.ch && arg3 == 4) {
            this.ax(arg4, arg5, 0x4038B9F2);
            this.an = true;
        }
    }

    public boolean ai(int arg1, int arg2, long arg3) {
        try {
            if(this.an) {
                return 1;
            }

            this.ax(arg1, arg2, 1045388105);
            return 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ha.ai(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean aj(int arg1, long arg2) {
        return 1;
    }

    void ak() {
        this.ax = false;
        this.al = 0;
    }

    void al(int arg2, int arg3, int arg4, short arg5) {
        try {
            if(this.an) {
                return;
            }

            if(arg2 == 0 || 1 == arg2 || !ci.ch && arg2 == 4) {
                this.ax(arg3, arg4, 0x5531B86D);
                this.an = true;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ha.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void am(int arg2, int arg3) {
        this.ae = arg2 * 2030521481;
        this.ar = arg3 * 0x90956CBF;
    }

    void an(int arg2, int arg3) {
        this.ae = arg2 * 0xE5DF8353;
        this.ar = arg3 * 0xA3B6100A;
    }

    void ao() {
        this.ax = false;
        this.al = 0;
    }

    public boolean ap(int arg1, long arg2) {
        if(arg1 == 84) {
            try {
                this.ap = true;
                return 1;
            label_7:
                if(arg1 == 13) {
                    this.aj = true;
                }
                else if(arg1 == 80) {
                    this.ad = true;
                }
                else if(arg1 == 85) {
                    fd.au(2);
                }
                else if(0x60 == arg1) {
                    this.aq = true;
                }
                else if(97 == arg1) {
                    this.ab = true;
                    return 1;
                label_6:
                    goto label_28;
                }
            }
            catch(RuntimeException v1) {
                goto label_6;
            }
        }
        else {
            goto label_7;
        label_28:
            StringBuilder v2 = new StringBuilder();
            v2.append("ha.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return 1;
    }

    public boolean aq(int arg1, int arg2, int arg3, int arg4, long arg5) {
        try {
            if(!this.ax) {
                this.al = (arg1 + 1) * 515560105;
            }
            else if(arg1 == 0) {
                this.al(arg2, arg3, arg4, 0x2CE8);
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ha.aq(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return 1;
    }

    void ar(int arg3) {
        try {
            this.ax = false;
            this.al = 0;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ha.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void as() {
        this.ax = false;
        this.al = 0;
    }

    void at(int arg3, int arg4, int arg5) {
        if(this.an) {
            return;
        }

        if(arg3 == 0 || 1 == arg3 || !ci.ch && arg3 == 4) {
            this.ax(arg4, arg5, 0x8CF305B);
            this.an = true;
        }
    }

    void au(int arg2, int arg3) {
        this.ae = arg2 * 2030521481;
        this.ar = arg3 * 0x9C14FE6C;
    }

    public boolean av(int arg1, long arg2) {
        return 1;
    }

    void aw() {
        this.an = false;
        this.ap = false;
        this.aj = false;
        this.ad = false;
        this.aq = false;
        this.ab = false;
    }

    void ax(int arg1, int arg2, int arg3) {
        arg1 *= 2030521481;
        try {
            this.ae = arg1;
            this.ar = arg2 * 0x90956CBF;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ha.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ay() {
        this.an = false;
        this.ap = false;
        this.aj = false;
        this.ad = false;
        this.aq = false;
        this.ab = false;
    }

    void az(int arg2, int arg3) {
        this.ae = arg2 * 2030521481;
        this.ar = arg3 * 0x90956CBF;
    }

    public boolean ba(int arg1, long arg2) {
        if(arg1 == 84) {
            this.ap = true;
        }
        else if(arg1 == 13) {
            this.aj = true;
        }
        else if(arg1 == 80) {
            this.ad = true;
        }
        else if(arg1 == 85) {
            fd.au(2);
        }
        else if(0x60 == arg1) {
            this.aq = true;
        }
        else if(97 == arg1) {
            this.ab = true;
        }

        return 1;
    }

    public boolean bb(int arg1, long arg2) {
        fz.av(arg1, 0x64CFD7DC);
        return 1;
    }

    public boolean bc(int arg1, long arg2) {
        fz.av(arg1, 0x64CFD7DC);
        return 1;
    }

    public boolean bd(int arg1, long arg2) {
        if(arg1 == 0x298E4CBF) {
            this.ap = true;
        }
        else if(arg1 == 13) {
            this.aj = true;
        }
        else if(arg1 == 80) {
            this.ad = true;
        }
        else if(arg1 == 85) {
            fd.au(2);
        }
        else if(0x8B4946D1 == arg1) {
            this.aq = true;
        }
        else if(0xDB74657D == arg1) {
            this.ab = true;
        }

        return 1;
    }

    public boolean bf(int arg1, long arg2) {
        return 1;
    }

    public boolean bg(int arg1, int arg2, long arg3) {
        if(this.an) {
            return 1;
        }

        this.ax(arg1, arg2, -200619889);
        return 1;
    }

    public boolean bh(int arg1, long arg2) {
        return 1;
    }

    public boolean bn(char arg1, long arg2) {
        er.aa(arg1, -1);
        return 1;
    }

    public boolean bo(int arg1, int arg2, int arg3, int arg4, long arg5) {
        if(!this.ax && this.al * 0x8D2FF199 == 1) {
            this.al(arg2, arg3, arg4, -9946);
        }

        return 1;
    }

    public boolean bp(int arg1, int arg2, int arg3, int arg4, long arg5) {
        if(!this.ax) {
            this.al = (arg1 + 1) * 0x42B9003E;
        }
        else if(arg1 == 0) {
            this.al(arg2, arg3, arg4, -2337);
        }

        return 1;
    }

    public boolean bq(int arg1, int arg2, int arg3, long arg4) {
        return 1;
    }

    static int bt(int arg3, int arg4) {
        double v0 = 2;
        double v3 = ((double)((((float)arg3)) / 256f + 7f));
        try {
            return ((int)Math.pow(v0, v3));
        }
        catch(RuntimeException v3_1) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ha.bt(");
            v4.append(')');
            throw lx.al(((Throwable)v3_1), v4.toString());
        }
    }

    public boolean bt(int arg1, int arg2, int arg3, int arg4, long arg5) {
        if(!this.ax && this.al * 0x8D2FF199 == 1) {
            this.al(arg2, arg3, arg4, 0x5B6F);
        }

        return 1;
    }

    public boolean bv(int arg1, int arg2, int arg3, long arg4) {
        return 1;
    }

    public boolean bw(int arg1, int arg2, int arg3, int arg4, long arg5) {
        if(!this.ax) {
            this.al = (arg1 + 1) * 515560105;
        }
        else if(arg1 == 0) {
            this.al(arg2, arg3, arg4, -16017);
        }

        return 1;
    }

    public boolean bx(int arg1, int arg2, long arg3) {
        if(this.an) {
            return 1;
        }

        this.ax(arg1, arg2, -98832800);
        return 1;
    }

    public boolean by(int arg1, int arg2, int arg3, int arg4, long arg5) {
        if(!this.ax && this.al * 0x8D2FF199 == 1) {
            this.al(arg2, arg3, arg4, 7192);
        }

        return 1;
    }

    public boolean bz(int arg1, long arg2) {
        return 1;
    }

    static final void ex(lo arg19, int arg20) {
        int v17;
        int v10;
        int v14;
        int v8;
        int v9;
        int v7;
        int v6;
        int v5;
        int v11;
        lo v0 = arg19;
        int v2;
        for(v2 = 0; true; ++v2) {
            int v3 = -1429440011;
            try {
                if(v2 >= client.ee * v3) {
                    return;
                }

                ii v3_1 = client.ev[client.ed[v2]];
                int v4 = v0.ay(-35);
                int v13 = -2077001153;
                if((v4 & 0x40) != 0) {
                    int v15 = v0.br(1780680615);
                    int v12 = 0x7FFF;
                    if(v15 > 0) {
                        v11 = 0;
                        while(v11 < v15) {
                            v5 = v0.by(0x4DA5);
                            if(v12 == v5) {
                                v5 = v0.by(0x4797);
                                v6 = v0.by(0x49CE);
                                v7 = v0.by(27030);
                                v9 = v0.by(0x499A);
                                v8 = v7;
                                v7 = v6;
                                goto label_44;
                            }
                            else if(v5 != 0x7FFE) {
                                v7 = v0.by(10097);
                                v8 = -1;
                                v9 = -1;
                            label_44:
                                v6 = v5;
                            }
                            else {
                                v6 = -1;
                                v7 = -1;
                                v8 = -1;
                                v9 = -1;
                            }

                            v3_1.bl(v6, v7, v8, v9, client.bj * v13, v0.by(0x2BD2), 7);
                            ++v11;
                            v12 = 0x7FFF;
                        }
                    }

                    v14 = 0x7FFF;
                    v15 = v0.be(0);
                    if(v15 <= 0) {
                        goto label_95;
                    }

                    for(v12 = 0; v12 < v15; v12 = v17 + 1) {
                        v6 = v0.by(0x3DED);
                        v8 = v0.by(7044);
                        if(v14 != v8) {
                            v9 = v0.by(0x31D2);
                            v10 = v0.be(0);
                            v11 = v8 > 0 ? v0.be(0) : v10;
                            v17 = v12;
                            v3_1.br(v6, client.bj * v13, v8, v9, v10, v11, -769304979);
                        }
                        else {
                            v17 = v12;
                            v3_1.bi(v6, 0x248FB1BE);
                        }
                    }
                }

            label_95:
                v6 = 0x695B43B1;
                if((v4 & 4) != 0) {
                    v3_1.ax = au.al(v0.cy(v6), 1);
                    v3_1.by = v3_1.ax.aj * 0x5B9583C7;
                    v3_1.de = v3_1.ax.bn * 0xA3F3810F;
                    v3_1.bg = v3_1.ax.av * 0xE37E9855;
                    v3_1.bz = v3_1.ax.aa * 0xEF71CCF7;
                    v3_1.bb = v3_1.ax.au * 0xE030253D;
                    v3_1.bc = v3_1.ax.am * 0xC14F3967;
                    v3_1.bv = v3_1.ax.ab * -1960689985;
                    v3_1.bq = v3_1.ax.af * 0x81BE8E5B;
                    v3_1.bx = v3_1.ax.ai * 0x6460DFFB;
                }

                if((v4 & 2) != 0) {
                    v5 = v0.cy(v6);
                    v6 = v0.ao(-2050623405);
                    v9 = v3_1.bp * 0x914F0683 - (v5 - ad.fi * 474770003 - ad.fi * 474770003) * 0x40;
                    v8 = v3_1.bw * 0xD19D0C3D - (v6 - nr.fo * 0x519F9BE7 - nr.fo * 0x519F9BE7) * 0x40;
                    if(v9 == 0 && v8 == 0) {
                        goto label_188;
                    }

                    v3_1.cc = ((((int)(Math.atan2(((double)v9), ((double)v8)) * 325.949))) & 0x7FF) * -1163009031;
                }

            label_188:
                v6 = 0xFFFF;
                if((v4 & 0x20) != 0) {
                    v14 = v0.cw(861852506);
                    if(v14 == v6) {
                        v14 = -1;
                    }

                    v5 = v0.br(0x69EC082D);
                    v9 = 2011890317;
                    v10 = 1304812425;
                    if(v3_1.ch * v9 == v14 && -1 != v14) {
                        v8 = fs.al(v14, v10).ah * 0x2D690AE9;
                        if(v8 == 1) {
                            v3_1.ce = 0;
                            v3_1.cs = 0;
                            v3_1.cz = v5 * 2115386027;
                            v3_1.cn = 0;
                        }

                        if(v8 != 2) {
                            goto label_247;
                        }

                        v3_1.cn = 0;
                        goto label_247;
                    }

                    v7 = -1;
                    if(v14 != v7 && v7 != v3_1.ch * v9 && fs.al(v14, v10).av * 0x484C05C9 < fs.al(v3_1.ch * v9, v10).av * 0x484C05C9) {
                        goto label_247;
                    }

                    v3_1.ch = v14 * 0x8B5D9045;
                    v3_1.ce = 0;
                    v3_1.cs = 0;
                    v3_1.cz = v5 * 2115386027;
                    v3_1.cn = 0;
                    v3_1.df = v3_1.dk * 985506349;
                }

            label_247:
                if((v4 & 8) != 0) {
                    v3_1.cl = v0.cw(0x454745A9) * 0x50A1A935;
                    v5 = v0.ac(93);
                    v3_1.cu = (v5 >> 16) * 0x5156494F;
                    v3_1.ct = (client.bj * v13 + (v5 & v6)) * 1522712035;
                    v3_1.ck = 0;
                    v3_1.cm = 0;
                    if(v3_1.ct * 0xD02A6FCB > client.bj * v13) {
                        v3_1.ck = 0x2AB9EA9D;
                    }

                    if(v3_1.cl * 0xA760211D != v6) {
                        goto label_283;
                    }

                    v3_1.cl = 0xAF5E56CB;
                }

            label_283:
                if((v4 & 16) != 0) {
                    v3_1.cy = v0.ao(0x24A37655) * 0xDDB4A4E9;
                    if(v3_1.cy * 0x5A6E7359 == v6) {
                        v3_1.cy = 0x224B5B17;
                    }
                }

                if((v4 & 1) != 0) {
                    v3_1.bm = v0.bn(5);
                    v3_1.bs = 338467036;
                }
            }
            catch(RuntimeException v0_1) {
                StringBuilder v1 = new StringBuilder();
                v1.append("ha.ex(");
                v1.append(')');
                throw lx.al(((Throwable)v0_1), v1.toString());
            }
        }
    }
}

