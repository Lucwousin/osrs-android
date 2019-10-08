public final class hw extends ie {
    int aa;
    int ab;
    ej ac;
    public int ad;
    int ae;
    int af;
    int ag;
    int ah;
    int ai;
    public String[] aj;
    int ak;
    aj al;
    ca am;
    boolean ao;
    static final int ap = 3;
    public int aq;
    int ar;
    int as;
    int at;
    int au;
    int av;
    public int aw;
    public ew ax;
    boolean ay;
    int az;
    boolean ba;
    ej bd;
    int bf;
    int bn;

    hw() {
        try {
            super();
            this.ae = 0x8EA3AF63;
            this.ar = 1764503179;
            int v0_1 = 3;
            this.aj = new String[v0_1];
            int v2;
            for(v2 = 0; v2 < v0_1; ++v2) {
                this.aj[v2] = "";
            }

            this.ad = 0;
            this.aq = 0;
            this.af = 0;
            this.ai = 0;
            this.ay = false;
            this.aw = 0;
            this.ao = false;
            this.ac = ej.ax;
            this.bd = ej.ax;
            this.ba = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hw.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    final void aa(lq arg11) {
        int v8;
        int v7;
        arg11.ar = 0;
        int v1 = arg11.ay(-31);
        this.ae = arg11.aw(-1215098345) * 0x715C509D;
        this.ar = arg11.aw(-1215098345) * -1764503179;
        this.aw = 0;
        int v3 = 12;
        int[] v5 = new int[v3];
        int v4;
        for(v4 = 0; true; ++v4) {
            int v6 = 0xFFFF;
            if(v4 >= v3) {
                break;
            }

            v7 = arg11.ay(-100);
            if(v7 == 0) {
                v5[v4] = 0;
            }
            else {
                v5[v4] = arg11.ay(-60) + (v7 << 8);
                if(v4 == 0 && v6 == v5[0]) {
                    v8 = arg11.ao(0x2B50654);
                    goto label_54;
                }

                v7 = 0x200;
                if(v5[v4] < v7) {
                    goto label_51;
                }

                v6 = client.al(v5[v4] - v7, 0x6462C20F).cb * 2026544433;
                if(v6 == 0) {
                    goto label_51;
                }

                this.aw = v6 * 129230531;
            }

        label_51:
        }

        v8 = -1;
    label_54:
        int v2 = 5;
        int[] v3_1 = new int[v2];
        for(v4 = 0; v4 < v2; ++v4) {
            v7 = arg11.ay(-32);
            if(v7 < 0 || v7 >= aj.ad[v4].length) {
                v7 = 0;
            }

            v3_1[v4] = v7;
        }

        this.bv = arg11.ao(0xB06B3300) * 0x36C323B1;
        if(this.bv * 630408529 == v6) {
            this.bv = 0xC93CDC4F;
        }

        this.bq = arg11.ao(1158005465) * 0xDBF4C2AD;
        if(v6 == this.bq * 0xEA27F125) {
            this.bq = 0x240B3D53;
        }

        this.bx = this.bq * -406956233;
        this.bg = arg11.ao(0xFC012A83) * 0x2485566D;
        if(v6 == this.bg * -1033624731) {
            this.bg = 0xDB7AA993;
        }

        this.bz = arg11.ao(-560191364) * 983807779;
        if(v6 == this.bz * 0x6CF7308B) {
            this.bz = -983807779;
        }

        this.bb = arg11.ao(0xCFED7BF) * 330839041;
        if(this.bb * 0x76D7CC01 == v6) {
            this.bb = -330839041;
        }

        this.bc = arg11.ao(0x2B3D22CB) * 1559007603;
        if(v6 == this.bc * 0xA392FBBB) {
            this.bc = -1559007603;
        }

        this.bk = arg11.ao(1222328780) * 920754045;
        if(v6 == this.bk * 1303697877) {
            this.bk = -920754045;
        }

        String v2_1 = this.ax != null ? this.ax.ax(0x62CFF537) : "";
        this.ax = new ew(arg11.bn(-14), ac.ad);
        this.ae(103);
        this.ap(-128);
        if(this == gu.jg) {
            String v4_1 = this.ax.ax(0x6FBF26A8);
            py.al = v4_1;
            if(!v2_1.equals(v4_1)) {
                client.al.aba(902077035).bw("name", v4_1, 1);
            }
        }

        this.ad = arg11.ay(-50) * 0x3F7C0BFD;
        this.aq = arg11.ao(-480875653) * 1969981059;
        boolean v11 = arg11.ay(-26) == 1 ? true : false;
        this.ao = v11;
        if(client.ap * -190026425 == 0 && client.lf * 0x12DC6E19 >= 2) {
            this.ao = false;
        }

        if(this.al == null) {
            this.al = new aj();
        }

        aj v4_2 = this.al;
        boolean v7_1 = 1 == v1 ? true : false;
        v4_2.ax(v5, v3_1, v7_1, v8, 0xD52E591F);
    }

    void ab(int arg3, int arg4, byte arg5) {
        try {
            this.dk = 0;
            this.df = 0;
            this.dy = 0;
            this.dc[0] = arg3;
            this.dj[0] = arg4;
            arg3 = this.ad(0xCBF5CAC1);
            this.bp = 0x3E7E0AC0 * arg3 + this.dc[0] * 0x7CFC1580;
            this.bw = arg3 * 0xE2BAC540 + this.dj[0] * 0xC5758A80;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("hw.ab(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    boolean ac() {
        if(ej.ax == this.bd) {
            this.aj(1185401761);
        }

        boolean v0 = ej.al == this.bd ? true : false;
        return v0;
    }

    int ad(int arg4) {
        try {
            if(this.al != null) {
                int v2 = 0x4257107;
                if(-1 != this.al.ar * v2) {
                    return au.al(this.al.ar * v2, 1).aj * 0xD6248411;
                }
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hw.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }

        return 1;
    }

    void ae(byte arg3) {
        try {
            this.ac = ej.ax;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hw.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void af(int arg4, int arg5, byte arg6, int arg7) {
        try {
            int v0 = -1091885127;
            if(this.dk * v0 < 9) {
                this.dk += -1133990263;
            }

            for(arg7 = this.dk * v0; arg7 > 0; --arg7) {
                int v2 = arg7 - 1;
                this.dc[arg7] = this.dc[v2];
                this.dj[arg7] = this.dj[v2];
                this.ds[arg7] = this.ds[v2];
            }

            this.dc[0] = arg4;
            this.dj[0] = arg5;
            this.ds[0] = arg6;
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("hw.af(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void ag() {
        this.ac = ej.ax;
    }

    void ah() {
        this.ac = ej.ax;
    }

    final boolean ai(int arg3) {
        try {
            if(this.al != null) {
                return 1;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hw.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return 0;
    }

    void aj(int arg3) {
        try {
            ej v3_1 = ai.oq == null || !ai.oq.ar(this.ax, 968172101) ? ej.ae : ej.al;
            this.bd = v3_1;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hw.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    boolean ak() {
        if(ej.ax == this.bd) {
            this.aj(0x3C1A029F);
        }

        boolean v0 = ej.al == this.bd ? true : false;
        return v0;
    }

    boolean al(int arg3) {
        try {
            if(this.ac == ej.ax) {
                this.ar(0xB1EE1F3F);
            }

            if(ej.al != this.ac) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hw.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    boolean am() {
        if(this.ac == ej.ax) {
            this.ar(0x471D8C8F);
        }

        boolean v0 = ej.al == this.ac ? true : false;
        return v0;
    }

    boolean an(int arg3) {
        try {
            if(ej.ax == this.bd) {
                this.aj(0xE1557376);
            }

            if(ej.al != this.bd) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hw.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    void ao() {
        ej v0 = ds.rq.ac(this.ax, 0x6F29B50F) ? ej.al : ej.ae;
        this.ac = v0;
    }

    void ap(byte arg3) {
        try {
            this.bd = ej.ax;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hw.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void aq(int arg3, int arg4, byte arg5, byte arg6) {
        int v6 = -1;
        try {
            int v1 = 2011890317;
            if(v6 != this.ch * v1 && fs.al(this.ch * v1, 1304812425).ag * -635149083 == 1) {
                this.ch = 0x74A26FBB;
            }

            this.cc = 1163009031;
            if(arg3 >= 0) {
                v6 = 104;
                if(arg3 >= v6) {
                    goto label_48;
                }
                else if(arg4 < 0) {
                    goto label_48;
                }
                else if(arg4 >= v6) {
                    goto label_48;
                }
                else {
                    if(this.dc[0] >= 0 && this.dc[0] < v6 && this.dj[0] >= 0) {
                        if(this.dj[0] >= v6) {
                        }
                        else {
                            arg6 = 2;
                            if(arg5 == arg6) {
                                co.fe(this, arg3, arg4, arg6, -2079139646);
                            }

                            this.af(arg3, arg4, arg5, 0x7B2BADE);
                            return;
                        }
                    }

                    this.ab(arg3, arg4, -107);
                }
            }
            else {
            label_48:
                this.ab(arg3, arg4, -82);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("hw.aq(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void ar(int arg3) {
        try {
            ej v3_1 = ds.rq.ac(this.ax, 0x6F29B50F) ? ej.al : ej.ae;
            this.ac = v3_1;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("hw.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected final ca as() {
        int v8_1;
        int v7;
        df v8;
        try {
            ca v1 = null;
            if(this.al == null) {
                return v1;
            }

            int v2 = 2011890317;
            int v3 = 1304812425;
            int v4 = -1;
            df v6 = this.ch * v2 == v4 || this.cz * 0x3C37F003 != 0 ? ((df)v1) : fs.al(this.ch * v2, v3);
            v2 = -1493580901;
            if(this.cp * v2 == v4 || (this.ay)) {
            label_38:
                v8 = ((df)v1);
            }
            else {
                if(this.cp * v2 == this.bv * 630408529 && v6 != null) {
                    goto label_38;
                }

                v8 = fs.al(this.cp * v2, v3);
            }

            ca v0_1 = this.al.aj(v6, this.ce * 0x38617D1D, v8, this.ci * 0x6F0EB545, 1485400534);
            if(v0_1 == null) {
                return v1;
            }

            v0_1.ap();
            this.db = v0_1.bh * 0x76F6ABEF;
            int v5 = 2;
            if(!this.ay) {
                v7 = 0xA760211D;
                if(this.cl * v7 != v4) {
                    v8_1 = 432280651;
                    if(this.ck * v8_1 != v4) {
                        ca v2_1 = di.al(this.cl * v7, 21).an(this.ck * v8_1, -2081447320);
                        if(v2_1 != null) {
                            v2_1.az(0, -(this.cu * 0x388F2DAF), 0);
                            ca[] v4_1 = new ca[v5];
                            v4_1[0] = v0_1;
                            v4_1[1] = v2_1;
                            v0_1 = new ca(v4_1, v5);
                        }
                    }
                }
            }

            if(!this.ay && this.am != null) {
                v4 = -2077001153;
                v8_1 = 0x103B21F;
                if(client.bj * v4 >= this.ai * v8_1) {
                    this.am = v1;
                }

                if(client.bj * v4 < this.af * 0xE1339B55) {
                    goto label_199;
                }

                if(client.bj * v4 >= this.ai * v8_1) {
                    goto label_199;
                }

                v1 = this.am;
                v4 = 0x5497FFBF;
                v8_1 = 0x914F0683;
                v1.az(this.av * v4 - this.bp * v8_1, this.aa * 0x7171F989 - this.ab * 0xDCF21275, this.au * 0x72214267 - this.bw * 0xD19D0C3D);
                v7 = 0xE97D9C4B;
                if(this.du * v7 == 0x200) {
                    v1.av();
                    v1.av();
                    v1.av();
                }
                else if(0x400 == this.du * v7) {
                    v1.av();
                    v1.av();
                }
                else if(0x600 == this.du * v7) {
                    v1.av();
                }

                ca[] v2_2 = new ca[v5];
                v2_2[0] = v0_1;
                v2_2[1] = v1;
                v0_1 = new ca(v2_2, v5);
                if(this.du * v7 == 0x200) {
                    v1.av();
                }
                else if(this.du * v7 == 0x400) {
                    v1.av();
                    v1.av();
                }
                else if(0x600 == this.du * v7) {
                    v1.av();
                    v1.av();
                    v1.av();
                }

                v1.az(this.bp * v8_1 - this.av * v4, this.ab * 0xDCF21275 - this.aa * 0x7171F989, this.bw * 0xD19D0C3D - this.au * 0x72214267);
            }

        label_199:
            v0_1.bf = true;
            return v0_1;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("hw.as(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    void at() {
        this.ac = ej.ax;
    }

    boolean au() {
        if(this.ac == ej.ax) {
            this.ar(-2041065010);
        }

        boolean v0 = ej.al == this.ac ? true : false;
        return v0;
    }

    final void av(lq arg11) {
        int v8;
        int v7;
        arg11.ar = 0;
        int v1 = arg11.ay(-101);
        this.ae = arg11.aw(-1215098345) * 0x715C509D;
        this.ar = arg11.aw(-1215098345) * -1764503179;
        this.aw = 0;
        int v3 = 12;
        int[] v5 = new int[v3];
        int v4;
        for(v4 = 0; true; ++v4) {
            int v6 = 0xFFFF;
            if(v4 >= v3) {
                break;
            }

            v7 = arg11.ay(-62);
            if(v7 == 0) {
                v5[v4] = 0;
            }
            else {
                v5[v4] = arg11.ay(-79) + (v7 << 8);
                if(v4 == 0 && v6 == v5[0]) {
                    v8 = arg11.ao(0xC808EE99);
                    goto label_54;
                }

                if(v5[v4] < 0x8F45CD2F) {
                    goto label_51;
                }

                v6 = client.al(v5[v4] - 0x200, 0xFFF43F9E).cb * 0xDFB7B603;
                if(v6 == 0) {
                    goto label_51;
                }

                this.aw = v6 * 129230531;
            }

        label_51:
        }

        v8 = -1;
    label_54:
        int v2 = 5;
        int[] v3_1 = new int[v2];
        for(v4 = 0; v4 < v2; ++v4) {
            v7 = arg11.ay(-125);
            if(v7 < 0 || v7 >= aj.ad[v4].length) {
                v7 = 0;
            }

            v3_1[v4] = v7;
        }

        this.bv = arg11.ao(1804101262) * 0x11603C55;
        if(this.bv * 0xF20990DC == v6) {
            this.bv = -1204830069;
        }

        this.bq = arg11.ao(0xBCC0F9C5) * 719743270;
        if(v6 == this.bq * 0xEA27F125) {
            this.bq = 0x4F4FDE94;
        }

        this.bx = this.bq * 0x966010F9;
        this.bg = arg11.ao(308537480) * 0x1D803B4E;
        if(v6 == this.bg * 0x1F571D25) {
            this.bg = 0x2A1E9D02;
        }

        this.bz = arg11.ao(379630014) * -790796306;
        if(v6 == this.bz * 774740303) {
            this.bz = 360897992;
        }

        this.bb = arg11.ao(-1930969673) * 330839041;
        if(this.bb * 0x76D7CC01 == 0x4F09320D) {
            this.bb = 1016606542;
        }

        this.bc = arg11.ao(0xA000CC4A) * 1559007603;
        if(0x7F253EE3 == this.bc * 0x9ABF8F5) {
            this.bc = -1559007603;
        }

        this.bk = arg11.ao(0x544328AF) * 0x10C63A68;
        if(v6 == this.bk * 1303697877) {
            this.bk = -920754045;
        }

        String v2_1 = this.ax != null ? this.ax.ax(2043115977) : "";
        this.ax = new ew(arg11.bn(0x2F), ac.ad);
        this.ae(85);
        this.ap(-22);
        if(this == gu.jg) {
            String v4_1 = this.ax.ax(0x351FC45E);
            py.al = v4_1;
            if(!v2_1.equals(v4_1)) {
                client.al.aba(0x58BE30FB).bw("name", v4_1, 1);
            }
        }

        this.ad = arg11.ay(-60) * 0xD90D3898;
        this.aq = arg11.ao(968210470) * 0xF91DC909;
        boolean v11 = arg11.ay(-99) == 1 ? true : false;
        this.ao = v11;
        if(client.ap * 0xB73C30F7 == 0 && client.lf * 0x12DC6E19 >= 2) {
            this.ao = false;
        }

        if(this.al == null) {
            this.al = new aj();
        }

        aj v4_2 = this.al;
        boolean v7_1 = 1 == v1 ? true : false;
        v4_2.ax(v5, v3_1, v7_1, v8, -2041763301);
    }

    void aw() {
        ej v0 = ds.rq.ac(this.ax, 0x6F29B50F) ? ej.al : ej.ae;
        this.ac = v0;
    }

    final void ax(lq arg10, int arg11) {
        int v7;
        int v6;
        try {
            arg10.ar = 0;
            int v0 = arg10.ay(-80);
            this.ae = arg10.aw(-1215098345) * 0x715C509D;
            this.ar = arg10.aw(-1215098345) * -1764503179;
            this.aw = 0;
            int v2 = 12;
            int[] v4 = new int[v2];
            int v3;
            for(v3 = 0; true; ++v3) {
                int v5 = 0xFFFF;
                if(v3 >= v2) {
                    break;
                }

                v6 = arg10.ay(-81);
                if(v6 == 0) {
                    v4[v3] = 0;
                }
                else {
                    v4[v3] = arg10.ay(-49) + (v6 << 8);
                    if(v3 == 0 && v5 == v4[0]) {
                        v7 = arg10.ao(-942419609);
                        goto label_54;
                    }

                    v6 = 0x200;
                    if(v4[v3] < v6) {
                        goto label_51;
                    }

                    v5 = client.al(v4[v3] - v6, 255029780).cb * 2026544433;
                    if(v5 == 0) {
                        goto label_51;
                    }

                    this.aw = v5 * 129230531;
                }

            label_51:
            }

            v7 = -1;
        label_54:
            int v1 = 5;
            int[] v2_1 = new int[v1];
            for(v3 = 0; v3 < v1; ++v3) {
                v6 = arg10.ay(-36);
                if(v6 < 0 || v6 >= aj.ad[v3].length) {
                    v6 = 0;
                }

                v2_1[v3] = v6;
            }

            this.bv = arg10.ao(0x1FD65D10) * 0x36C323B1;
            if(this.bv * 630408529 == v5) {
                this.bv = 0xC93CDC4F;
            }

            this.bq = arg10.ao(0xFD3B887) * 0xDBF4C2AD;
            if(v5 == this.bq * 0xEA27F125) {
                this.bq = 0x240B3D53;
            }

            this.bx = this.bq * -406956233;
            this.bg = arg10.ao(-655865107) * 0x2485566D;
            if(v5 == this.bg * -1033624731) {
                this.bg = 0xDB7AA993;
            }

            this.bz = arg10.ao(-1184163002) * 983807779;
            if(v5 == this.bz * 0x6CF7308B) {
                this.bz = -983807779;
            }

            this.bb = arg10.ao(0xCCC63336) * 330839041;
            if(this.bb * 0x76D7CC01 == v5) {
                this.bb = -330839041;
            }

            this.bc = arg10.ao(-331106652) * 1559007603;
            if(v5 == this.bc * 0xA392FBBB) {
                this.bc = -1559007603;
            }

            this.bk = arg10.ao(0x13C07D66) * 920754045;
            if(v5 == this.bk * 1303697877) {
                this.bk = -920754045;
            }

            String v1_1 = this.ax != null ? this.ax.ax(0x2AFB4F19) : "";
            this.ax = new ew(arg10.bn(90), ac.ad);
            this.ae(0x40);
            this.ap(-25);
            if(this == gu.jg) {
                String v3_1 = this.ax.ax(0x49ABBA03);
                py.al = v3_1;
                if(!v1_1.equals(v3_1)) {
                    client.al.aba(0xB7E91609).bw("name", v3_1, 1);
                }
            }

            this.ad = arg10.ay(-69) * 0x3F7C0BFD;
            this.aq = arg10.ao(1145707756) * 1969981059;
            boolean v10_1 = arg10.ay(-41) == 1 ? true : false;
            this.ao = v10_1;
            if(client.ap * -190026425 == 0 && client.lf * 0x12DC6E19 >= 2) {
                this.ao = false;
            }

            if(this.al == null) {
                this.al = new aj();
            }

            aj v3_2 = this.al;
            boolean v6_1 = 1 == v0 ? true : false;
            v3_2.ax(v4, v2_1, v6_1, v7, 0x42B3B0EE);
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("hw.ax(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    static hl ax(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = hl.ax.ax(v0);
            if(v5 != null) {
                return ((hl)v5);
            }

            byte[] v4_1 = ih.dm.ae(arg4, 0, 0x78DC0DC9);
            if(v4_1 == null) {
                return null;
            }

            hl v4_2 = ap.ar(v4_1, 5);
            hl.ax.ae(((mv)v4_2), v0);
            return v4_2;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("hw.ax(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }

    void ay() {
        this.ac = ej.ax;
    }

    boolean az() {
        if(this.ac == ej.ax) {
            this.ar(0x536A18FC);
        }

        boolean v0 = ej.al == this.ac ? true : false;
        return v0;
    }

    void ba() {
        this.bd = ej.ax;
    }

    void bb(int arg4, int arg5) {
        this.dk = 0;
        this.df = 0;
        this.dy = 0;
        this.dc[0] = arg4;
        this.dj[0] = arg5;
        arg4 = this.ad(0xCBF5CAC1);
        this.bp = 0x3E7E0AC0 * arg4 + this.dc[0] * 0x7CFC1580;
        this.bw = arg4 * 0xE2BAC540 + this.dj[0] * 0xC5758A80;
    }

    void bc(int arg4, int arg5) {
        this.dk = 0;
        this.df = 0;
        this.dy = 0;
        this.dc[0] = arg4;
        this.dj[0] = arg5;
        arg4 = this.ad(0xCBF5CAC1);
        this.bp = 0xB43943B3 * arg4 + this.dc[0] * 0x7CFC1580;
        this.bw = arg4 * 1762005676 + this.dj[0] * 0xC5758A80;
    }

    boolean bd() {
        if(ej.ax == this.bd) {
            this.aj(-984039956);
        }

        boolean v0 = ej.al == this.bd ? true : false;
        return v0;
    }

    void bf() {
        this.bd = ej.ax;
    }

    int bg() {
        if(this.al != null) {
            int v3 = 0x4257107;
            if(-1 != this.al.ar * v3) {
                return au.al(this.al.ar * v3, 1).aj * 0xD6248411;
            }
        }

        return 1;
    }

    void bh(int arg4, int arg5) {
        this.dk = 0;
        this.df = 0;
        this.dy = 0;
        this.dc[0] = arg4;
        this.dj[0] = arg5;
        arg4 = this.ad(0xCBF5CAC1);
        this.bp = 0x3E7E0AC0 * arg4 + this.dc[0] * 0xE12C037B;
        this.bw = arg4 * 0xE2BAC540 + this.dj[0] * 0xC5758A80;
    }

    final void bj(int arg5, int arg6, byte arg7) {
        int v1 = -1091885127;
        if(this.dk * v1 < 9) {
            this.dk += -1133990263;
        }

        int v0;
        for(v0 = this.dk * v1; v0 > 0; --v0) {
            int v3 = v0 - 1;
            this.dc[v0] = this.dc[v3];
            this.dj[v0] = this.dj[v3];
            this.ds[v0] = this.ds[v3];
        }

        this.dc[0] = arg5;
        this.dj[0] = arg6;
        this.ds[0] = arg7;
    }

    void bk(int arg4, int arg5) {
        this.dk = 0;
        this.df = 0;
        this.dy = 0;
        this.dc[0] = arg4;
        this.dj[0] = arg5;
        arg4 = this.ad(0xCBF5CAC1);
        this.bp = 0x3E7E0AC0 * arg4 + this.dc[0] * 0x7CFC1580;
        this.bw = arg4 * 0xE2BAC540 + this.dj[0] * 0xC5758A80;
    }

    final void bm(int arg5, int arg6, byte arg7) {
        int v1 = -1091885127;
        if(this.dk * v1 < 9) {
            this.dk += -1133990263;
        }

        int v0;
        for(v0 = this.dk * v1; v0 > 0; --v0) {
            int v3 = v0 - 1;
            this.dc[v0] = this.dc[v3];
            this.dj[v0] = this.dj[v3];
            this.ds[v0] = this.ds[v3];
        }

        this.dc[0] = arg5;
        this.dj[0] = arg6;
        this.ds[0] = arg7;
    }

    void bn() {
        this.bd = ej.ax;
    }

    void bo() {
        ej v0 = ai.oq == null || !ai.oq.ar(this.ax, 968172101) ? ej.ae : ej.al;
        this.bd = v0;
    }

    void bp() {
        this.bd = ej.ax;
    }

    int bq() {
        if(this.al != null) {
            int v3 = 0x4257107;
            if(-1 != this.al.ar * v3) {
                return au.al(this.al.ar * v3, 1).aj * 0xD6248411;
            }
        }

        return 1;
    }

    final boolean bs() {
        if(this.al == null) {
            return 0;
        }

        return 1;
    }

    void bt() {
        ej v0 = ai.oq == null || !ai.oq.ar(this.ax, 968172101) ? ej.ae : ej.al;
        this.bd = v0;
    }

    final void bu(int arg5, int arg6, byte arg7) {
        int v1 = -1091885127;
        if(this.dk * v1 < 9) {
            this.dk += -1133990263;
        }

        int v0;
        for(v0 = this.dk * v1; v0 > 0; --v0) {
            int v3 = v0 - 1;
            this.dc[v0] = this.dc[v3];
            this.dj[v0] = this.dj[v3];
            this.ds[v0] = this.ds[v3];
        }

        this.dc[0] = arg5;
        this.dj[0] = arg6;
        this.ds[0] = arg7;
    }

    int bv() {
        if(this.al != null) {
            int v3 = 0x4257107;
            if(-1 != this.al.ar * v3) {
                return au.al(this.al.ar * v3, 1).aj * 0xD6248411;
            }
        }

        return 1;
    }

    void bw() {
        ej v0 = ai.oq == null || !ai.oq.ar(this.ax, 968172101) ? ej.ae : ej.al;
        this.bd = v0;
    }

    int bx() {
        if(this.al != null) {
            int v3 = 0x4257107;
            if(-1 != this.al.ar * v3) {
                return au.al(this.al.ar * v3, 1).aj * 0xD6248411;
            }
        }

        return 1;
    }

    void by() {
        ej v0 = ai.oq == null || !ai.oq.ar(this.ax, 968172101) ? ej.ae : ej.al;
        this.bd = v0;
    }

    int bz() {
        if(this.al != null && -1 != this.al.ar * -1985467806) {
            return au.al(this.al.ar * 0xD361F630, 1).aj * 0xD6248411;
        }

        return 1;
    }

    protected final ca db() {
        int v8_1;
        int v7;
        df v8;
        ca v1 = null;
        if(this.al == null) {
            return v1;
        }

        int v2 = 2011890317;
        int v3 = 1304812425;
        int v4 = -1;
        df v6 = this.ch * v2 == v4 || this.cz * 0x3C37F003 != 0 ? ((df)v1) : fs.al(this.ch * v2, v3);
        v2 = -1493580901;
        if(this.cp * v2 == v4 || (this.ay)) {
        label_38:
            v8 = ((df)v1);
        }
        else {
            if(this.cp * v2 == this.bv * 630408529 && v6 != null) {
                goto label_38;
            }

            v8 = fs.al(this.cp * v2, v3);
        }

        ca v0 = this.al.aj(v6, this.ce * 0x38617D1D, v8, this.ci * 0x6F0EB545, 0x30D128B3);
        if(v0 == null) {
            return v1;
        }

        v0.ap();
        this.db = v0.bh * 0x76F6ABEF;
        int v5 = 2;
        if(!this.ay) {
            v7 = 0xA760211D;
            if(this.cl * v7 != v4) {
                v8_1 = 432280651;
                if(this.ck * v8_1 != v4) {
                    ca v2_1 = di.al(this.cl * v7, 21).an(this.ck * v8_1, 1681242230);
                    if(v2_1 != null) {
                        v2_1.az(0, -(this.cu * 0x388F2DAF), 0);
                        ca[] v4_1 = new ca[v5];
                        v4_1[0] = v0;
                        v4_1[1] = v2_1;
                        v0 = new ca(v4_1, v5);
                    }
                }
            }
        }

        if(!this.ay && this.am != null) {
            v4 = -2077001153;
            v8_1 = 0x103B21F;
            if(client.bj * v4 >= this.ai * v8_1) {
                this.am = v1;
            }

            if(client.bj * v4 < this.af * 0xE1339B55) {
                goto label_199;
            }

            if(client.bj * v4 >= this.ai * v8_1) {
                goto label_199;
            }

            v1 = this.am;
            v4 = 0x5497FFBF;
            v8_1 = 0x914F0683;
            v1.az(this.av * v4 - this.bp * v8_1, this.aa * 0x7171F989 - this.ab * 0xDCF21275, this.au * 0x72214267 - this.bw * 0xD19D0C3D);
            v7 = 0xE97D9C4B;
            if(this.du * v7 == 0x200) {
                v1.av();
                v1.av();
                v1.av();
            }
            else if(0x400 == this.du * v7) {
                v1.av();
                v1.av();
            }
            else if(0x600 == this.du * v7) {
                v1.av();
            }

            ca[] v2_2 = new ca[v5];
            v2_2[0] = v0;
            v2_2[1] = v1;
            v0 = new ca(v2_2, v5);
            if(this.du * v7 == 0x200) {
                v1.av();
            }
            else if(this.du * v7 == 0x400) {
                v1.av();
                v1.av();
            }
            else if(0x600 == this.du * v7) {
                v1.av();
                v1.av();
                v1.av();
            }

            v1.az(this.bp * v8_1 - this.av * v4, this.ab * 0xDCF21275 - this.aa * 0x7171F989, this.bw * 0xD19D0C3D - this.au * 0x72214267);
        }

    label_199:
        v0.bf = true;
        return v0;
    }

    protected final ca dm() {
        int v7_1;
        df v7;
        ca v1 = null;
        if(this.al == null) {
            return v1;
        }

        int v0 = 1304812425;
        int v3 = -1;
        df v5 = this.ch * 0xE0921180 == v3 || this.cz * 0x3C37F003 != 0 ? ((df)v1) : fs.al(this.ch * 1755700400, v0);
        int v4 = -1493580901;
        if(this.cp * v4 == v3 || (this.ay)) {
        label_40:
            v7 = ((df)v1);
        }
        else {
            if(this.cp * 0xC1A80F1C == this.bv * 630408529 && v5 != null) {
                goto label_40;
            }

            v7 = fs.al(this.cp * v4, v0);
        }

        ca v0_1 = this.al.aj(v5, this.ce * 0xD4792BB1, v7, this.ci * 0x8AF56610, 0x21A799B9);
        if(v0_1 == null) {
            return v1;
        }

        v0_1.ap();
        this.db = v0_1.bh * 0xCEA0A508;
        int v5_1 = 2;
        if(!this.ay && this.cl * 0xB11BF846 != v3) {
            v7_1 = 432280651;
            if(this.ck * v7_1 != v3) {
                ca v2 = di.al(this.cl * 0xC94464C0, 21).an(this.ck * v7_1, -1920468709);
                if(v2 != null) {
                    v2.az(0, -(this.cu * 0x49B58E1A), 0);
                    ca[] v3_1 = new ca[v5_1];
                    v3_1[0] = v0_1;
                    v3_1[1] = v2;
                    v0_1 = new ca(v3_1, v5_1);
                }
            }
        }

        if(!this.ay && this.am != null) {
            v7_1 = 0x103B21F;
            if(client.bj * 0x4708B97A >= this.ai * v7_1) {
                this.am = v1;
            }

            if(client.bj * -2077001153 < this.af * 0xE1339B55) {
                goto label_209;
            }

            if(client.bj * 0x301DA22D >= this.ai * v7_1) {
                goto label_209;
            }

            v1 = this.am;
            v7_1 = 0x7171F989;
            v1.az(this.av * -504553091 - this.bp * 0x914F0683, this.aa * v7_1 - this.ab * 0xEEF44605, this.au * 0x7EBD5C39 - this.bw * 0xFC103A49);
            int v8 = 0xE97D9C4B;
            if(this.du * 0x5F775187 == 0x200) {
                v1.av();
                v1.av();
                v1.av();
            }
            else if(0xE66A6AE3 == this.du * v8) {
                v1.av();
                v1.av();
            }
            else if(0x600 == this.du * 54701702) {
                v1.av();
            }

            ca[] v2_1 = new ca[v5_1];
            v2_1[0] = v0_1;
            v2_1[1] = v1;
            v0_1 = new ca(v2_1, v5_1);
            if(this.du * v8 == 0x1F1B24CE) {
                v1.av();
            }
            else if(this.du * 0xCD1DCD64 == 0x200EBB25) {
                v1.av();
                v1.av();
            }
            else if(1215213206 == this.du * -478580055) {
                v1.av();
                v1.av();
                v1.av();
            }

            v1.az(this.bp * 0xFBD9505E - this.av * 0x5497FFBF, this.ab * 0x441981A0 - this.aa * v7_1, this.bw * 0xD19D0C3D - this.au * 0x72214267);
        }

    label_209:
        v0_1.bf = true;
        return v0_1;
    }

    protected final ca du() {
        df v8;
        ca v1 = null;
        if(this.al == null) {
            return v1;
        }

        int v2 = 2011890317;
        int v3 = 1304812425;
        int v4 = -1;
        df v6 = this.ch * v2 == v4 || this.cz * 0x3C37F003 != 0 ? ((df)v1) : fs.al(this.ch * v2, v3);
        if(this.cp * -1493580901 == v4 || (this.ay)) {
        label_40:
            v8 = ((df)v1);
        }
        else {
            if(this.cp * -1053213831 == this.bv * -884361057 && v6 != null) {
                goto label_40;
            }

            v8 = fs.al(this.cp * 0x868E93F5, v3);
        }

        ca v0 = this.al.aj(v6, this.ce * 0x38617D1D, v8, this.ci * 0x6F0EB545, 0x16B1FEFE);
        if(v0 == null) {
            return v1;
        }

        v0.ap();
        this.db = v0.bh * 0x76F6ABEF;
        int v5 = 2;
        if(!this.ay && this.cl * 0xA45CA48C != v4 && this.ck * -680417837 != v4) {
            ca v2_1 = di.al(this.cl * 0xA760211D, 21).an(this.ck * 432280651, 0x75EAD001);
            if(v2_1 != null) {
                v2_1.az(0, -(this.cu * 0x51E9F3FE), 0);
                ca[] v4_1 = new ca[v5];
                v4_1[0] = v0;
                v4_1[1] = v2_1;
                v0 = new ca(v4_1, v5);
            }
        }

        if(!this.ay && this.am != null) {
            v4 = -2077001153;
            if(client.bj * v4 >= this.ai * 0xB4CC3E56) {
                this.am = v1;
            }

            if(client.bj * 0xD4E237F4 < this.af * 0xE1339B55) {
                goto label_209;
            }

            if(client.bj * v4 >= this.ai * 0x103B21F) {
                goto label_209;
            }

            v1 = this.am;
            v1.az(this.av * 174708540 - this.bp * 0x637670FB, this.aa * 0x28032BCF - this.ab * -1730471756, this.au * 0xFD6B14BF - this.bw * 0xD19D0C3D);
            v4 = 0xE97D9C4B;
            int v8_1 = 0x600;
            if(this.du * v4 == 0xA1E4FDE) {
                v1.av();
                v1.av();
                v1.av();
            }
            else if(0xC611FEFD == this.du * 0xF9502C5) {
                v1.av();
                v1.av();
            }
            else if(v8_1 == this.du * 0x6506E846) {
                v1.av();
            }

            ca[] v2_2 = new ca[v5];
            v2_2[0] = v0;
            v2_2[1] = v1;
            v0 = new ca(v2_2, v5);
            if(this.du * 0xA960FF3D == 0x200) {
                v1.av();
            }
            else if(this.du * v4 == 0xE8D83806) {
                v1.av();
                v1.av();
            }
            else if(v8_1 == this.du * v4) {
                v1.av();
                v1.av();
                v1.av();
            }

            v1.az(this.bp * 0x914F0683 - this.av * -212773086, this.ab * 0xDCF21275 - this.aa * 0x7171F989, this.bw * 1094859363 - this.au * 0x50C8D521);
        }

    label_209:
        v0.bf = true;
        return v0;
    }
}

