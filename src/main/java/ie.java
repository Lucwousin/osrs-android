public abstract class ie extends bm {
    boolean an;
    int bb;
    int bc;
    int be;
    int bg;
    byte bi;
    boolean bj;
    int bk;
    int bl;
    String bm;
    int bo;
    public int bp;
    int bq;
    int bs;
    int bt;
    boolean bu;
    int bv;
    public int bw;
    int bx;
    int by;
    int bz;
    int[] ca;
    fb cb;
    int cc;
    int[] cd;
    int ce;
    int[] cf;
    int cg;
    int ch;
    int ci;
    int[] cj;
    int ck;
    int cl;
    int cm;
    int cn;
    int co;
    int cp;
    int cq;
    int cr;
    int cs;
    int ct;
    int cu;
    int cv;
    boolean cw;
    int[] cx;
    int cy;
    int cz;
    int db;
    int[] dc;
    int de;
    int df;
    int dh;
    int[] dj;
    int dk;
    int dm;
    int dp;
    byte[] ds;
    int du;
    int dv;
    int dw;
    int dy;

    ie() {
        try {
            super();
            this.an = false;
            this.by = 0x545C8257;
            this.bv = 0xC93CDC4F;
            this.bq = 0x240B3D53;
            this.bx = -119840299;
            this.bg = 0xDB7AA993;
            this.bz = -983807779;
            this.bb = -330839041;
            this.bc = -1559007603;
            this.bk = -920754045;
            this.bm = null;
            this.bu = false;
            this.bs = 338467036;
            this.be = 0;
            this.bl = 0;
            this.bi = 0;
            this.ca = new int[4];
            this.cj = new int[4];
            this.cd = new int[4];
            this.cf = new int[4];
            this.cx = new int[4];
            this.cb = new fb();
            this.cy = 0x224B5B17;
            this.cw = false;
            this.cc = 1163009031;
            this.cp = 0xCF94156D;
            this.ci = 0;
            this.cr = 0;
            this.ch = 0x74A26FBB;
            this.ce = 0;
            this.cs = 0;
            this.cz = 0;
            this.cn = 0;
            this.cl = 0xAF5E56CB;
            this.ck = 0;
            this.cm = 0;
            this.dw = 0;
            this.db = 0x8D02DFE8;
            this.dm = 0;
            this.de = 0x14D04A60;
            this.dk = 0;
            this.dc = new int[10];
            this.dj = new int[10];
            this.ds = new byte[10];
            this.dy = 0;
            this.df = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ie.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    boolean ai(int arg1) {
        return 0;
    }

    public static boolean av(CharSequence arg4, byte arg5) {
        int v1;
        try {
            int v5 = arg4.length();
            v1 = 0;
            while(true) {
            label_3:
                if(v1 >= v5) {
                    return 1;
                }

                if(at.ai(arg4.charAt(v1), 2006501076)) {
                    goto label_9;
                }

                return 0;
            }
        }
        catch(RuntimeException v4) {
            goto label_15;
        }

        return 0;
    label_9:
        ++v1;
        goto label_3;
        return 1;
    label_15:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("ie.av(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }

    final void be(int arg3) {
        try {
            this.dk = 0;
            this.df = 0;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ie.be(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void bi(int arg2, int arg3) {
        arg3 = 0x9F6F77C1;
        try {
            dd v2_1 = dw.al(arg2, arg3);
            mx v3;
            for(v3 = this.cb.an(); v3 != null; v3 = this.cb.aj()) {
                if(v2_1 == ((ir)v3).ae) {
                    ((ir)v3).lp();
                    return;
                }
            }
        }
        catch(RuntimeException v2) {
            goto label_15;
        }

        return;
    label_15:
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("ie.bi(");
        v3_1.append(')');
        throw lx.al(((Throwable)v2), v3_1.toString());
    }

    final void bl(int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, byte arg15) {
        int v5_1;
        int v6;
        int v15 = 0;
        int v1 = 0;
        int v2 = 1;
        int v3 = 1;
        while(true) {
            int v4 = 4;
            if(v1 >= v4) {
                goto label_17;
            }

            try {
                if(this.cd[v1] > arg13) {
                    v2 = 0;
                }
                else {
                    v3 = 0;
                }

                ++v1;
                continue;
            label_17:
                v1 = -1;
                if(arg9 >= 0) {
                    de v5 = cp.al(arg9, 0x5B42200C);
                    v6 = -2065181125 * v5.ao;
                    v5_1 = v5.aa * 0xF76DF0BF;
                }
                else {
                    v5_1 = 0;
                    v6 = -1;
                }

                if(v3 == 0) {
                    if(v2 != 0) {
                        this.bi = 0;
                    }

                    while(v15 < v4) {
                        byte v2_1 = this.bi;
                        this.bi = ((byte)((this.bi + 1) % v4));
                        if(this.cd[v2_1] <= arg13) {
                            goto label_81;
                        }

                        ++v15;
                    }

                    v2 = -1;
                    goto label_81;
                label_44:
                    while(v15 < v4) {
                        if(v6 == 0) {
                            if(this.cd[v15] < v1) {
                                v1 = this.cd[v15];
                                goto label_51;
                            }
                        }
                        else if(v6 == 1 && this.cj[v15] < v1) {
                            v1 = this.cj[v15];
                        label_51:
                            v2 = v15;
                        }

                        ++v15;
                    }

                    if(1 != v6) {
                        goto label_81;
                    }

                    if(v1 < arg10) {
                        goto label_81;
                    }

                    return;
                }
                else if(v6 == v1) {
                    return;
                }
                else {
                    if(v6 == 0) {
                        v1 = this.cd[0];
                    }
                    else if(v6 == 1) {
                        v1 = this.cj[0];
                    }
                    else {
                        v1 = 0;
                    }

                    v15 = 1;
                    v2 = 0;
                    goto label_44;
                }

            label_81:
                if(v2 < 0) {
                    return;
                }

                this.ca[v2] = arg9;
                this.cj[v2] = arg10;
                this.cf[v2] = arg11;
                this.cx[v2] = arg12;
                this.cd[v2] = v5_1 + arg13 + arg14;
                return;
            label_16:
                break;
            }
            catch(RuntimeException v9) {
                goto label_16;
            }
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("ie.bl(");
        v10.append(')');
        throw lx.al(((Throwable)v9), v10.toString());
    }

    final void br(int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22) {
        ie v1 = this;
        int v3 = 0x9F6F77C1;
        int v4 = arg16;
        try {
            dd v3_1 = dw.al(v4, v3);
            int v5 = 0x32E64E3F;
            v4 = v3_1.aq * v5;
            int v6 = 0;
            mx v8 = null;
            mx v9 = v1.cb.an();
            int v7 = v4;
            mx v4_1 = v8;
            while(v9 != null) {
                ++v6;
                if(((ir)v9).ae.an * -2082584993 == v3_1.an * -2082584993) {
                    ((ir)v9).ax(arg19 + arg17, arg20, arg21, arg18, 0x30716342);
                    return;
                }

                if(((ir)v9).ae.ad * -554970017 <= v3_1.ad * -554970017) {
                    v4_1 = v9;
                }

                if(((ir)v9).ae.aq * v5 > v7) {
                    v7 = ((ir)v9).ae.aq * v5;
                    v8 = v9;
                }

                v9 = v1.cb.aj();
            }

            v5 = 4;
            if(v8 == null && v6 >= v5) {
                return;
            }

            ir v9_1 = new ir(v3_1);
            if(v4_1 == null) {
                v1.cb.ae(((mx)v9_1));
            }
            else {
                fb.ar(((mx)v9_1), v4_1);
            }

            v9_1.ax(arg19 + arg17, arg20, arg21, arg18, 1907810131);
            if(v6 >= v5) {
                ((ir)v8).lp();
            }
        }
        catch(RuntimeException v0) {
            goto label_71;
        }

        return;
    label_71:
        StringBuilder v2 = new StringBuilder();
        v2.append("ie.br(");
        v2.append(')');
        throw lx.al(((Throwable)v0), v2.toString());
    }

    boolean bs() {
        return 0;
    }

    final void ca() {
        this.dk = 0;
        this.df = 0;
    }

    final void cb(int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        byte v3_1;
        int v6_1;
        int v7;
        int v5;
        int v0 = 0;
        int v2 = 0;
        int v3 = 1;
        int v4 = 1;
        while(true) {
            v5 = 4;
            if(v2 >= v5) {
                break;
            }

            if(this.cd[v2] > arg14) {
                v3 = 0;
            }
            else {
                v4 = 0;
            }

            ++v2;
        }

        v2 = -1;
        if(arg10 >= 0) {
            de v6 = cp.al(arg10, 0xE01A536B);
            v7 = -2065181125 * v6.ao;
            v6_1 = v6.aa * 0xF76DF0BF;
        }
        else {
            v6_1 = 0;
            v7 = -1;
        }

        if(v4 == 0) {
            if(v3 != 0) {
                this.bi = 0;
            }

            while(v0 < v5) {
                v3_1 = this.bi;
                this.bi = ((byte)((this.bi + 1) % v5));
                if(this.cd[v3_1] <= arg14) {
                    goto label_79;
                }

                ++v0;
            }

            v3 = -1;
            goto label_79;
        label_42:
            while(v0 < v5) {
                if(v7 == 0) {
                    if(this.cd[v0] < v2) {
                        v2 = this.cd[v0];
                        goto label_49;
                    }
                }
                else if(v7 == 1 && this.cj[v0] < v2) {
                    v2 = this.cj[v0];
                label_49:
                    v3 = v0;
                }

                ++v0;
            }

            if(1 != v7) {
                goto label_79;
            }

            if(v2 < arg11) {
                goto label_79;
            }

            return;
        }
        else if(v7 == v2) {
            return;
        }
        else {
            if(v7 == 0) {
                v2 = this.cd[0];
            }
            else if(v7 == 1) {
                v2 = this.cj[0];
            }
            else {
                v2 = 0;
            }

            v0 = 1;
            v3 = 0;
            goto label_42;
        }

    label_79:
        if(v3_1 < 0) {
            return;
        }

        this.ca[v3_1] = arg10;
        this.cj[v3_1] = arg11;
        this.cf[v3_1] = arg12;
        this.cx[v3_1] = arg13;
        this.cd[v3_1] = v6_1 + arg14 + arg15;
    }

    final void cc(int arg3) {
        dd v3 = dw.al(arg3, 0x9F6F77C1);
        mx v0;
        for(v0 = this.cb.an(); v0 != null; v0 = this.cb.aj()) {
            if(v3 == ((ir)v0).ae) {
                ((ir)v0).lp();
                return;
            }
        }
    }

    final void cd() {
        this.dk = 0;
        this.df = 0;
    }

    final void cf(int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        byte v3_1;
        int v6_1;
        int v7;
        int v5;
        int v0 = 0;
        int v2 = 0;
        int v3 = 1;
        int v4 = 1;
        while(true) {
            v5 = 4;
            if(v2 >= v5) {
                break;
            }

            if(this.cd[v2] > arg14) {
                v4 = 0;
            }
            else {
                v3 = 0;
            }

            ++v2;
        }

        v2 = -1;
        if(arg10 >= 0) {
            de v6 = cp.al(arg10, 0x5A963F8A);
            v7 = -2065181125 * v6.ao;
            v6_1 = v6.aa * 0xF76DF0BF;
        }
        else {
            v6_1 = 0;
            v7 = -1;
        }

        if(v3 == 0) {
            if(v4 != 0) {
                this.bi = 0;
            }

            while(v0 < v5) {
                v3_1 = this.bi;
                this.bi = ((byte)((this.bi + 1) % v5));
                if(this.cd[v3_1] <= arg14) {
                    goto label_79;
                }

                ++v0;
            }

            v3 = -1;
            goto label_79;
        label_42:
            while(v0 < v5) {
                if(v7 == 0) {
                    if(this.cd[v0] < v2) {
                        v2 = this.cd[v0];
                        goto label_49;
                    }
                }
                else if(v7 == 1 && this.cj[v0] < v2) {
                    v2 = this.cj[v0];
                label_49:
                    v3 = v0;
                }

                ++v0;
            }

            if(1 != v7) {
                goto label_79;
            }

            if(v2 < arg11) {
                goto label_79;
            }

            return;
        }
        else if(v7 == v2) {
            return;
        }
        else {
            if(v7 == 0) {
                v2 = this.cd[0];
            }
            else if(v7 == 1) {
                v2 = this.cj[0];
            }
            else {
                v2 = 0;
            }

            v0 = 1;
            v3 = 0;
            goto label_42;
        }

    label_79:
        if(v3_1 < 0) {
            return;
        }

        this.ca[v3_1] = arg10;
        this.cj[v3_1] = arg11;
        this.cf[v3_1] = arg12;
        this.cx[v3_1] = arg13;
        this.cd[v3_1] = v6_1 + arg14 + arg15;
    }

    final void cj() {
        this.dk = 0;
        this.df = 0;
    }

    final void cp(int arg3) {
        dd v3 = dw.al(arg3, 0x9F6F77C1);
        mx v0;
        for(v0 = this.cb.an(); v0 != null; v0 = this.cb.aj()) {
            if(v3 == ((ir)v0).ae) {
                ((ir)v0).lp();
                return;
            }
        }
    }

    final void cw(int arg3) {
        dd v3 = dw.al(arg3, 0x9F6F77C1);
        mx v0;
        for(v0 = this.cb.an(); v0 != null; v0 = this.cb.aj()) {
            if(v3 == ((ir)v0).ae) {
                ((ir)v0).lp();
                return;
            }
        }
    }

    final void cx(int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        byte v3_1;
        int v6_1;
        int v7;
        int v5;
        int v0 = 0;
        int v2 = 0;
        int v3 = 1;
        int v4 = 1;
        while(true) {
            v5 = 4;
            if(v2 >= v5) {
                break;
            }

            if(this.cd[v2] > arg14) {
                v4 = 0;
            }
            else {
                v3 = 0;
            }

            ++v2;
        }

        v2 = -1;
        if(arg10 >= 0) {
            de v6 = cp.al(arg10, 0xD1B23600);
            v7 = -2065181125 * v6.ao;
            v6_1 = v6.aa * 0xF76DF0BF;
        }
        else {
            v6_1 = 0;
            v7 = -1;
        }

        if(v3 == 0) {
            if(v4 != 0) {
                this.bi = 0;
            }

            while(v0 < v5) {
                v3_1 = this.bi;
                this.bi = ((byte)((this.bi + 1) % v5));
                if(this.cd[v3_1] <= arg14) {
                    goto label_79;
                }

                ++v0;
            }

            v3 = -1;
            goto label_79;
        label_42:
            while(v0 < v5) {
                if(v7 == 0) {
                    if(this.cd[v0] < v2) {
                        v2 = this.cd[v0];
                        goto label_49;
                    }
                }
                else if(v7 == 1 && this.cj[v0] < v2) {
                    v2 = this.cj[v0];
                label_49:
                    v3 = v0;
                }

                ++v0;
            }

            if(1 != v7) {
                goto label_79;
            }

            if(v2 < arg11) {
                goto label_79;
            }

            return;
        }
        else if(v7 == v2) {
            return;
        }
        else {
            if(v7 == 0) {
                v2 = this.cd[0];
            }
            else if(v7 == 1) {
                v2 = this.cj[0];
            }
            else {
                v2 = 0;
            }

            v0 = 1;
            v3 = 0;
            goto label_42;
        }

    label_79:
        if(v3_1 < 0) {
            return;
        }

        this.ca[v3_1] = arg10;
        this.cj[v3_1] = arg11;
        this.cf[v3_1] = arg12;
        this.cx[v3_1] = arg13;
        this.cd[v3_1] = v6_1 + arg14 + arg15;
    }

    final void cy(int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        ie v0 = this;
        dd v1 = dw.al(arg13, 0x9F6F77C1);
        int v3 = v1.aq * 0x33F1E5EF;
        int v2 = 0;
        mx v5 = null;
        mx v6 = v0.cb.an();
        int v4 = v3;
        mx v3_1 = v5;
        while(v6 != null) {
            ++v2;
            if(((ir)v6).ae.an * -917590722 == v1.an * 0xDE1474A) {
                ((ir)v6).ax(arg16 + arg14, arg17, arg18, arg15, 0x3A130FA5);
                return;
            }

            if(((ir)v6).ae.ad * 0x6D2F32A3 <= v1.ad * 1731473045) {
                v3_1 = v6;
            }

            if(((ir)v6).ae.aq * 0x528BA5E6 > v4) {
                v4 = ((ir)v6).ae.aq * 0x32E64E3F;
                v5 = v6;
            }

            v6 = v0.cb.aj();
        }

        v4 = 4;
        if(v5 == null && v2 >= v4) {
            return;
        }

        ir v6_1 = new ir(v1);
        if(v3_1 == null) {
            v0.cb.ae(((mx)v6_1));
        }
        else {
            fb.ar(((mx)v6_1), v3_1);
        }

        v6_1.ax(arg16 + arg14, arg17, arg18, arg15, 0x734EA861);
        if(v2 >= v4) {
            ((ir)v5).lp();
        }
    }

    static final void el(int arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        byte v9_2;
        ef v1_1;
        int v2;
        int v1;
        int v15;
        int v0 = arg18;
        int v7 = arg19;
        int v8 = arg20;
        try {
            long v9 = ee.fs.bd(v0, v7, v8);
            int v12 = 0x2E75E25C;
            int v13 = 0xD1B2988C;
            int v14 = -1;
            int v17 = 1156257065;
            if(0 != v9) {
                v15 = 2;
                v1 = ee.fs.bp(arg18, arg19, arg20, v9);
                v2 = v1 >> 6 & 3;
                v1 &= 0x1F;
                int v3 = aq.ae(v9) ? arg22 : arg21;
                int[] v4 = mu.ow.ax;
                int v5 = v7 * 4;
                int v6 = v5 + 0x6030 + (103 - v8) * 0x800;
                do v9_1 = ok.al(be.av(v9), -52013934);
                if(v9_1.bp * v17 != v14) {
                    v1_1 = jv.gx[v9_1.bp * v17];
                    if(v1_1 != null) {
                        v2 = (v9_1.az * v13 - v1_1.ae) / v15;
                        v3 = (v9_1.ag * v12 - v1_1.ar) / v15;
                        ec v4_1 = ea.or;
                        v6 = v9_1.ag;
                        v9_2 = 1;
                        v4_1.ag(v1_1, v5 + 0x30 + v2, v3 + ((104 - v8 - v6 * 0x4B9D7897) * 4 + 0x30), 1);
                        goto label_182;
                    }

                    v9_2 = 1;
                    goto label_182;
                }

                v9_2 = 1;
                if(v1 != 0 && v1 != v15) {
                    goto label_78;
                }
                else if(v2 == 0) {
                    v4[v6] = v3;
                    v4[v6 + 0x200] = v3;
                    v4[v6 + 0x400] = v3;
                    v4[v6 + 0x600] = v3;
                    goto label_78;
                }
                else if(1 == v2) {
                    v4[v6] = v3;
                    v4[v6 + 1] = v3;
                    v4[v6 + 2] = v3;
                    v4[v6 + 3] = v3;
                    goto label_78;
                }
                else if(v15 == v2) {
                    v5 = v6 + 3;
                    v4[v5] = v3;
                    v4[v5 + 0x200] = v3;
                    v4[v5 + 0x400] = v3;
                    v4[v5 + 0x600] = v3;
                    goto label_78;
                }
                else {
                    v5 = 3;
                    if(v2 == v5) {
                        v5 = v6 + 0x600;
                        v4[v5] = v3;
                        v4[v5 + 1] = v3;
                        v4[v5 + 2] = v3;
                        v4[v5 + 3] = v3;
                    label_78:
                        v5 = 3;
                    }
                }

                if(v5 == v1) {
                    if(v2 == 0) {
                        v4[v6] = v3;
                    }
                    else if(v2 == 1) {
                        v4[v6 + 3] = v3;
                    }
                    else if(v2 == v15) {
                        v4[v6 + 0x603] = v3;
                    }
                    else if(3 == v2) {
                        v4[v6 + 0x600] = v3;
                    }
                }

                if(v1 != v15) {
                    goto label_182;
                }

                if(3 == v2) {
                    v4[v6] = v3;
                    v4[v6 + 0x200] = v3;
                    v4[v6 + 0x400] = v3;
                    v4[v6 + 0x600] = v3;
                    goto label_182;
                }

                if(v2 == 0) {
                    v4[v6] = v3;
                    v4[v6 + 1] = v3;
                    v4[v6 + 2] = v3;
                    v4[v6 + 3] = v3;
                    goto label_182;
                }

                if(1 == v2) {
                    v6 += 3;
                    v4[v6] = v3;
                    v4[v6 + 0x200] = v3;
                    v4[v6 + 0x400] = v3;
                    v4[v6 + 0x600] = v3;
                    goto label_182;
                }

                if(v2 != v15) {
                    goto label_182;
                }

                v6 += 0x600;
                v4[v6] = v3;
                v4[v6 + 1] = v3;
                v4[v6 + 2] = v3;
                v4[v6 + 3] = v3;
            }
            else {
                v9_2 = 1;
                v15 = 2;
            }

        label_182:
            long v10 = ee.fs.bf(v0, v7, v8);
            if(v10 != 0) {
                v1 = ee.fs.bp(arg18, arg19, arg20, v10);
                v2 = v1 >> 6 & 3;
                v1 &= 0x1F;
                do v3_1 = ok.al(be.av(v10), 0x2D460CE1);
                if(v3_1.bp * v17 != v14) {
                    v1_1 = jv.gx[v3_1.bp * v17];
                    if(v1_1 != null) {
                        ea.or.ag(v1_1, (v3_1.az * v13 - v1_1.ae) / v15 + (v7 * 4 + 0x30), (v3_1.ag * v12 - v1_1.ar) / v15 + ((104 - v8 - v3_1.ag * 0x4B9D7897) * 4 + 0x30), v9_2);
                    }
                }
                else if(9 == v1) {
                    v1 = 0xEEEEEE;
                    if(aq.ae(v10)) {
                        v1 = 0xEE0000;
                    }

                    int[] v3_2 = mu.ow.ax;
                    int v4_2 = v7 * 4 + 0x6030 + (103 - v8) * 0x800;
                    if(v2 != 0) {
                        if(v15 == v2) {
                        }
                        else {
                            v3_2[v4_2] = v1;
                            v3_2[v4_2 + 0x200 + v9_2] = v1;
                            v3_2[v4_2 + 0x400 + v15] = v1;
                            v3_2[v4_2 + 0x603] = v1;
                            goto label_270;
                        }
                    }

                    v3_2[v4_2 + 0x600] = v1;
                    v3_2[v4_2 + 0x400 + v9_2] = v1;
                    v3_2[v4_2 + 0x200 + v15] = v1;
                    v3_2[v4_2 + 3] = v1;
                }
            }

        label_270:
            long v0_2 = ee.fs.bn(v0, v7, v8);
            if(v0_2 != 0) {
                do v0_3 = ok.al(be.av(v0_2), 0xEB87F37A);
                if(v14 != v0_3.bp * v17) {
                    v1_1 = jv.gx[v0_3.bp * v17];
                    if(v1_1 != null) {
                        ea.or.ag(v1_1, v7 * 4 + 0x30 + (v0_3.az * v13 - v1_1.ae) / v15, (104 - v8 - v0_3.ag * 0x4B9D7897) * 4 + 0x30 + (v0_3.ag * v12 - v1_1.ar) / v15, v9_2);
                    }
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_2 = new StringBuilder();
            v1_2.append("ie.el(");
            v1_2.append(')');
            throw lx.al(((Throwable)v0_1), v1_2.toString());
        }
    }
}

