import java.util.Collection;

public class do extends mv {
    short[] aa;
    int[] ab;
    public int ac;
    static by[] ad = null;
    int[] af;
    public int ag;
    public int ah;
    public String ai;
    static gk aj = null;
    public int ak;
    static ko al = null;
    short[] am;
    public static gk an = null;
    boolean ao;
    static gk ap = null;
    public int aq;
    static gk ar = null;
    public boolean as;
    public boolean at;
    short[] au;
    short[] av;
    int aw;
    static boolean ax = false;
    public int ay;
    public int az;
    int ba;
    public int bb;
    public int[] bc;
    int bd;
    public int be;
    public String[] bf;
    int bg;
    boolean bh;
    public int bj;
    int bk;
    public int[] bl;
    int bm;
    public int bn;
    public boolean bo;
    public int bp;
    int bq;
    oc br;
    public int bs;
    int bt;
    public int bu;
    int bv;
    boolean bw;
    int bx;
    int by;
    public boolean bz;
    static final int nw = 0x1E00;

    static {
        do.ar = new gk(0x1000, null);
        do.an = new gk(500, null);
        do.ap = new gk(0x80, null);
        do.aj = new gk(0x80, null);
        do.ad = new by[4];
    }

    do() {
        try {
            super();
            this.ai = gs.aq;
            this.az = 774650251;
            this.ag = 0x8D4D8727;
            this.ah = 0x571EB32E;
            this.at = true;
            this.ay = 0xE092D0E1;
            this.aw = 0x8E22FFF9;
            this.ao = false;
            this.as = false;
            this.ak = -476206403;
            this.ac = 0x6413EA90;
            this.bd = 0;
            this.ba = 0;
            this.bf = new String[5];
            this.bn = 0xA0E7447D;
            this.bp = 1958062311;
            this.bw = false;
            this.bo = true;
            this.by = -1500230272;
            this.bt = 0x44C4CC80;
            this.bv = 0x4ADAD180;
            this.bq = 0;
            this.bx = 0;
            this.bg = 0;
            this.bz = false;
            this.bh = false;
            this.bb = 0x25D23219;
            this.bk = -950488441;
            this.bm = 0xF2259FFD;
            this.bj = -1769021827;
            this.bu = 0;
            this.bs = 0;
            this.be = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("do.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public String aa(int arg2, String arg3, byte arg4) {
        try {
            return az.ae(this.br, arg2, arg3, -107049639);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("do.aa(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final ca ab(int arg14, int arg15, int[][] arg16, int arg17, int arg18, int arg19, df arg20, int arg21, int arg22) {
        ca v3_1;
        ca v6_1;
        do v1 = this;
        int v0 = arg14;
        int v2 = arg15;
        df v3 = arg20;
        try {
            int v5 = 0x9BAF8E95;
            long v4 = v1.af == null ? ((long)((v1.aq * v5 << 10) + v2)) : ((long)((v1.aq * v5 << 10) + (v0 << 3) + v2));
            mv v6 = do.aj.ax(v4);
            if(v6 == null) {
                by v7 = this.af(arg14, arg15, 2005135305);
                if(v7 == null) {
                    return null;
                }
                else {
                    v6_1 = v7.ay(v1.bd * 248041807 + 0x40, v1.ba * 0xD173FB3F + 0x300, -50, -10, -50);
                    do.aj.ae(((mv)v6_1), v4);
                }
            }

            v0 = -915509833;
            if(v3 == null && -1 == v1.aw * v0) {
                return v6_1;
            }

            ca v2_1 = v3 != null ? v3.aj(v6_1, arg21, arg15, 1586054809) : v6_1.al(true);
            v3_1 = v2_1;
            if(v1.aw * v0 >= 0) {
                v3_1 = v3_1.ax(arg16, arg17, arg18, arg19, false, v1.aw * v0);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_2 = new StringBuilder();
            v2_2.append("do.ab(");
            v2_2.append(')');
            throw lx.al(((Throwable)v0_1), v2_2.toString());
        }

        return v3_1;
    }

    void ac() {
        int v1 = -1;
        int v2 = 0;
        if(v1 == this.ay * 0x473AF972) {
            this.ay = 0;
            if(this.ab != null && (this.af == null || this.af[0] == 10)) {
                this.ay = -438160221;
            }

            int v0;
            for(v0 = 0; v0 < 5; ++v0) {
                if(this.bf[v0] != null) {
                    this.ay = 0x1F6D2F1F;
                }
            }
        }

        if(this.bb * 0x3376F5D7 == v1) {
            if(this.ah * 0xED352C6C != 0) {
                v2 = 1;
            }

            this.bb = v2 * 607938667;
        }
    }

    public final bm ad(int arg9, int arg10, int[][] arg11, int arg12, int arg13, int arg14, int arg15) {
        by v15_2;
        ca v15_1;
        try {
            int v0 = 0x9BAF8E95;
            long v0_1 = this.af == null ? ((long)((this.aq * v0 << 10) + arg10)) : ((long)((arg9 << 3) + (this.aq * v0 << 10) + arg10));
            mv v15 = do.ap.ax(v0_1);
            if(v15 == null) {
                by v2 = this.af(arg9, arg10, 0x7F41D758);
                if(v2 == null) {
                    return null;
                }
                else {
                    arg10 = 0xD173FB3F;
                    arg15 = 248041807;
                    if(!this.ao) {
                        v15_1 = v2.ay(this.bd * arg15 + 0x40, this.ba * arg10 + 0x300, -50, -10, -50);
                    }
                    else {
                        v2.ba = ((short)(this.bd * arg15 + 0x40));
                        v2.bf = ((short)(this.ba * arg10 + 0x300));
                        v2.az();
                        v15_2 = v2;
                    }

                    do.ap.ae(((mv)v15_1), v0_1);
                }
            }

            if(this.ao) {
                v15_2 = ((by)v15_1).an();
            }

            arg10 = -915509833;
            if(this.aw * arg10 >= 0) {
                if(((((mv)v15_1)) instanceof ca)) {
                    v15_1 = ((mv)v15_1).ax(arg11, arg12, arg13, arg14, true, this.aw * arg10);
                }
                else if(((((mv)v15_1)) instanceof by)) {
                    v15_2 = ((mv)v15_1).ap(arg11, arg12, arg13, arg14, true, this.aw * arg10);
                }
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("do.ad(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }

        return ((bm)v15_1);
    }

    void ae(int arg5) {
        arg5 = 0xE5018CDF;
        try {
            int v0 = this.ay * arg5;
            arg5 = -1;
            int v1 = 0;
            if(arg5 == v0) {
                this.ay = 0;
                int v2 = 0x1F6D2F1F;
                if(this.ab != null && (this.af == null || this.af[0] == 10)) {
                    this.ay = v2;
                }

                for(v0 = 0; v0 < 5; ++v0) {
                    if(this.bf[v0] != null) {
                        this.ay = v2;
                    }
                }
            }

            if(this.bb * 0x3376F5D7 == arg5) {
                if(this.ah * 0xE748B627 != 0) {
                    v1 = 1;
                }

                this.bb = v1 * 0xDA2DCDE7;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("do.ae(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }
    }

    final by af(int arg23, int arg24, int arg25) {
        by v14_1;
        mv v13_2;
        int v13_1;
        int v12;
        by v13;
        int v11;
        int v3_1;
        do v1 = this;
        int v0 = arg23;
        int v2 = arg24;
        try {
            int v4 = 0xFFFF;
            int v5 = 0x10000;
            int v6 = 2;
            int v7 = 3;
            by v8 = null;
            int v9 = 0;
            if(v1.af != null) {
                v3_1 = 0;
                while(true) {
                    v6 = -1;
                    if(v3_1 >= v1.af.length) {
                        break;
                    }
                    else if(v0 == v1.af[v3_1]) {
                    }
                    else {
                        ++v3_1;
                        continue;
                    }

                    goto label_71;
                }

                v3_1 = -1;
            label_71:
                if(v6 == v3_1) {
                    return v8;
                }

                v3_1 = v1.ab[v3_1];
                boolean v5_2 = v1.bw;
                v6 = v2 > v7 ? 1 : 0;
                v5 = (((int)v5_2)) ^ v6;
                if(v5 != 0) {
                    v3_1 += 0x10000;
                }

                long v11_1 = ((long)v3_1);
                v13_2 = do.an.ax(v11_1);
                if(v13_2 != null) {
                    goto label_57;
                }

                v13 = by.ax(ad.ae, v3_1 & v4, 0);
                if(v13 == null) {
                    return v8;
                }

                if(v5 != 0) {
                    v13.au();
                }

                do.an.ae(((mv)v13), v11_1);
            }
            else if(10 != v0) {
                return v8;
            }
            else if(v1.ab == null) {
                return v8;
            }
            else {
                boolean v3 = v1.bw;
                if(v6 == v0 && v2 > v7) {
                    v3_1 = (((int)v3)) ^ 1;
                }

                v11 = v1.ab.length;
                v13 = v8;
                v12 = 0;
                while(v12 < v11) {
                    v13_1 = v1.ab[v12];
                    if(v3) {
                        v13_1 += v5;
                    }

                    long v5_1 = ((long)v13_1);
                    mv v14 = do.an.ax(v5_1);
                    if(v14 == null) {
                        v13 = by.ax(ad.ae, v13_1 & v4, 0);
                        if(v13 == null) {
                            return v8;
                        }
                        else {
                            if(v3) {
                                v13.au();
                            }

                            do.an.ae(((mv)v13), v5_1);
                        }
                    }
                    else {
                        v13_2 = v14;
                    }

                    if(v11 > 1) {
                        do.ad[v12] = ((by)v13_2);
                    }

                    ++v12;
                    v5 = 0x10000;
                }

                if(v11 <= 1) {
                    goto label_57;
                }

                v13 = new by(do.ad, v11);
            }

        label_57:
            by v17 = ((by)v13_2);
            v4 = 0x1A7A7D93;
            v5 = 0x2AA9260B;
            v6 = -1544308055;
            int v8_1 = 0x80;
            v3_1 = v1.by * v4 != v8_1 || v8_1 != v1.bt * v6 || v1.bv * v5 != v8_1 ? 1 : 0;
            v11 = 0x82727707;
            v12 = 1477739707;
            v13_1 = 0xC60EEAB1;
            v8_1 = v1.bq * v11 != 0 || v1.bx * v13_1 != 0 || v1.bg * v12 != 0 ? 1 : 0;
            v14_1 = null;
            boolean v18 = v2 != 0 || v3_1 != 0 || v8_1 != 0 ? false : true;
            boolean v19 = v1.av == null ? true : false;
            boolean v20 = v1.au == null ? true : false;
            super(v17, v18, v19, v20, true);
            if(4 == v0 && v2 > v7) {
                v14_1.af(0x100);
                v14_1.ai(45, 0, -45);
            }

            v0 = v2 & 3;
            if(v0 == 1) {
                v14_1.ad();
            }
            else if(2 == v0) {
                v14_1.aq();
            }
            else if(v0 == v7) {
                v14_1.ab();
            }

            if(v1.av != null) {
                for(v0 = 0; v0 < v1.av.length; ++v0) {
                    v14_1.av(v1.av[v0], v1.aa[v0]);
                }
            }

            if(v1.au != null) {
                while(v9 < v1.au.length) {
                    v14_1.aa(v1.au[v9], v1.am[v9]);
                    ++v9;
                }
            }

            if(v3_1 != 0) {
                v14_1.am(v1.by * v4, v1.bt * v6, v1.bv * v5);
            }

            if(v8_1 != 0) {
                v14_1.ai(v1.bq * v11, v1.bx * v13_1, v1.bg * v12);
            }
        }
        catch(RuntimeException v0_1) {
            goto label_214;
        }

        return v14_1;
    label_214:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("do.af(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public static void ag(ko arg0, ko arg1, boolean arg2) {
        do.al = arg0;
        ad.ae = arg1;
        do.ax = arg2;
    }

    public static void ah(ko arg0, ko arg1, boolean arg2) {
        do.al = arg0;
        ad.ae = arg1;
        do.ax = arg2;
    }

    public final do ai(int arg4) {
        try {
            int v0 = 0x34F68CC9;
            int v1 = -1;
            if(this.bk * v0 != v1) {
                arg4 = of.ax(this.bk * v0, 0x74136FE9);
            }
            else {
                v0 = 0x7FCB4AAB;
                arg4 = this.bm * v0 != v1 ? an.ae[this.bm * v0] : -1;
            }

            arg4 = arg4 < 0 || arg4 >= this.bc.length - 1 ? this.bc[this.bc.length - 1] : this.bc[arg4];
            if(v1 == arg4) {
                return null;
            }

            return ok.al(arg4, 0x18FB1076);
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("do.ai(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }

        return null;
    }

    public final boolean aj(int arg6) {
        int v1;
        try {
            if(this.ab == null) {
                return 1;
            }

            int v0 = 0;
            v1 = 1;
            while(v0 < this.ab.length) {
                v1 &= ad.ae.an(this.ab[v0] & 0xFFFF, 0, 0x17B8A379);
                ++v0;
            }
        }
        catch(RuntimeException v6) {
            goto label_23;
        }

        return ((boolean)v1);
    label_23:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("do.aj(");
        v0_1.append(')');
        throw lx.al(((Throwable)v6), v0_1.toString());
    }

    static final short aj(int arg1, int arg2) {
        ++arg1;
        try {
            return ((short)(arg1 / 16 << 8 | arg1 % 16));
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("do.aj(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ak() {
        int v1 = -1;
        int v2 = 0;
        if(v1 == this.ay * 0xE5018CDF) {
            this.ay = 0;
            int v3 = 0x1F6D2F1F;
            if(this.ab != null && (this.af == null || this.af[0] == 10)) {
                this.ay = v3;
            }

            int v0;
            for(v0 = 0; v0 < 5; ++v0) {
                if(this.bf[v0] != null) {
                    this.ay = v3;
                }
            }
        }

        if(this.bb * 0x3376F5D7 == v1) {
            if(this.ah * 0xE748B627 != 0) {
                v2 = 1;
            }

            this.bb = v2 * 0xDA2DCDE7;
        }
    }

    public boolean am(int arg7) {
        try {
            int v0 = 0xA4CFF52B;
            boolean v1 = true;
            int v2 = -1;
            if(this.bc == null) {
                if(this.bj * v0 == v2) {
                    if(this.bl != null) {
                    }
                    else {
                        v1 = false;
                    }
                }

                return v1;
            }

            arg7 = 0;
            while(true) {
            label_15:
                if(arg7 >= this.bc.length) {
                    return 0;
                }

                if(this.bc[arg7] != v2) {
                    do v4 = ok.al(this.bc[arg7], 0x40C7440);
                    if(v2 == v4.bj * v0) {
                        if(v4.bl != null) {
                            return 1;
                        }

                        goto label_31;
                    }

                    return 1;
                }

                goto label_31;
            }
        }
        catch(RuntimeException v7) {
            goto label_36;
        }

        return 1;
    label_31:
        ++arg7;
        goto label_15;
        return 0;
    label_36:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("do.am(");
        v0_1.append(')');
        throw lx.al(((Throwable)v7), v0_1.toString());
    }

    void an(lq arg8, int arg9, int arg10) {
        int v3_1;
        char v10 = ')';
        int v0 = 0;
        if(1 == arg9) {
            byte v9 = -19;
            try {
                arg9 = arg8.ay(v9);
                if(arg9 > 0) {
                    if(this.ab != null) {
                        if(do.ax) {
                        }
                        else {
                            arg8.ar += arg9 * 0xAFC06BE9;
                            return;
                        }
                    }

                    this.af = new int[arg9];
                    this.ab = new int[arg9];
                    while(true) {
                        if(v0 >= arg9) {
                            return;
                        }

                        this.ab[v0] = arg8.ao(0x1075D1F2);
                        this.af[v0] = arg8.ay(-75);
                        ++v0;
                    }

                label_35:
                    if(2 == arg9) {
                        this.ai = arg8.bn(-51);
                        return;
                    }

                    int[] v3 = null;
                    if(arg9 == 5) {
                        arg9 = arg8.ay(-74);
                        if(arg9 <= 0) {
                            return;
                        }

                        if(this.ab != null) {
                            if(do.ax) {
                            }
                            else {
                                arg8.ar += arg9 * 0x1FD59D46;
                                return;
                            }
                        }

                        this.af = v3;
                        this.ab = new int[arg9];
                        while(true) {
                            if(v0 >= arg9) {
                                return;
                            }

                            this.ab[v0] = arg8.ao(0xA8660D0C);
                            ++v0;
                        }
                    }

                    if(14 == arg9) {
                        this.az = arg8.ay(-80) * 774650251;
                        return;
                    }

                    if(arg9 == 15) {
                        this.ag = arg8.ay(-11) * 0x8D4D8727;
                        return;
                    }

                    if(arg9 == 17) {
                        this.ah = 0;
                        this.at = false;
                        return;
                    }

                    if(18 == arg9) {
                        this.at = false;
                        return;
                    }

                    if(19 == arg9) {
                        this.ay = arg8.ay(-34) * 0x1F6D2F1F;
                        return;
                    }

                    if(21 == arg9) {
                        this.aw = 0;
                        return;
                    }

                    if(arg9 == 22) {
                        this.ao = true;
                        return;
                    }

                    if(arg9 == 23) {
                        this.as = true;
                        return;
                    }

                    int v4 = 0xFFFF;
                    if(arg9 == 24) {
                        this.ak = arg8.ao(0x77C4382) * 476206403;
                        if(this.ak * 0x804BDF6B != v4) {
                            return;
                        }

                        this.ak = -476206403;
                        return;
                    }

                    if(27 == arg9) {
                        this.ah = 0x2B8F5997;
                        return;
                    }

                    if(arg9 == 28) {
                        this.ac = arg8.ay(-99) * 0x76413EA9;
                        return;
                    }

                    int v5 = -1215098345;
                    if(arg9 == 29) {
                        this.bd = arg8.aw(v5) * 0x3EDFA5AF;
                        return;
                    }

                    if(arg9 == 39) {
                        this.ba = arg8.aw(v5) * 1975805607;
                        return;
                    }

                    int v2 = 30;
                    if(arg9 >= v2 && arg9 < 35) {
                        arg9 -= v2;
                        this.bf[arg9] = arg8.bn(0x20);
                        if(this.bf[arg9].equalsIgnoreCase(gs.ar)) {
                            this.bf[arg9] = ((String)v3);
                        }
                        else {
                        }

                        return;
                    }

                    if(arg9 == 40) {
                        arg9 = arg8.ay(-57);
                        this.av = new short[arg9];
                        this.aa = new short[arg9];
                        while(true) {
                            if(v0 >= arg9) {
                                return;
                            }

                            this.av[v0] = ((short)arg8.ao(0x3F5892ED));
                            this.aa[v0] = ((short)arg8.ao(0xB2AD334C));
                            ++v0;
                        }
                    }

                    byte v2_1 = -37;
                    if(arg9 == v10) {
                        arg9 = arg8.ay(v2_1);
                        this.au = new short[arg9];
                        this.am = new short[arg9];
                        while(true) {
                            if(v0 >= arg9) {
                                return;
                            }

                            this.au[v0] = ((short)arg8.ao(0x587D8730));
                            this.am[v0] = ((short)arg8.ao(0xEF543604));
                            ++v0;
                        }
                    }

                    if(arg9 == 62) {
                        this.bw = true;
                        return;
                    }

                    if(0x40 == arg9) {
                        this.bo = false;
                        return;
                    }

                    if(65 == arg9) {
                        this.by = arg8.ao(-341026963) * 357378203;
                        return;
                    }

                    if(arg9 == 66) {
                        this.bt = arg8.ao(0x20B22DDF) * 814320025;
                        return;
                    }

                    if(67 == arg9) {
                        this.bv = arg8.ao(0xF0847DF1) * -1902791261;
                        return;
                    }

                    if(arg9 == 68) {
                        this.bp = arg8.ao(0xFD7AED0B) * -1958062311;
                        return;
                    }

                    if(arg9 == 69) {
                        arg8.ay(-54);
                        return;
                    }

                    if(70 == arg9) {
                        this.bq = arg8.as(0x7BF7A1EC) * -1374206281;
                        return;
                    }

                    if(arg9 == 71) {
                        this.bx = arg8.as(2036850805) * 0xB5F71E51;
                        return;
                    }

                    if(72 == arg9) {
                        this.bg = arg8.as(0x6F629DD6) * 0xF0032073;
                        return;
                    }

                    if(73 == arg9) {
                        this.bz = true;
                        return;
                    }

                    if(74 == arg9) {
                        this.bh = true;
                        return;
                    }

                    if(arg9 == 75) {
                        this.bb = arg8.ay(-77) * 0xDA2DCDE7;
                        return;
                    }

                    v5 = 92;
                    if(77 != arg9) {
                        if(arg9 == v5) {
                        }
                        else {
                            v3_1 = 0x4BEEE993;
                            if(78 == arg9) {
                                this.bj = arg8.ao(0xF79F4584) * 1769021827;
                                this.bu = arg8.ay(-114) * v3_1;
                                return;
                            }
                            else if(arg9 == 0x4F) {
                                this.bs = arg8.ao(0x6E12506D) * 0x6A0E27FB;
                                this.be = arg8.ao(-702831495) * 0xD9B94E29;
                                this.bu = arg8.ay(v2_1) * v3_1;
                                arg9 = arg8.ay(-43);
                                this.bl = new int[arg9];
                                while(true) {
                                    if(v0 < arg9) {
                                        this.bl[v0] = arg8.ao(0xD1C49EBF);
                                        ++v0;
                                        continue;
                                    }
                                    else {
                                        return;
                                    }
                                }
                            }
                            else if(arg9 == 81) {
                                this.aw = arg8.ay(-27) * 0xDD000700;
                                return;
                            }
                            else {
                                if(82 == arg9) {
                                    this.bn = arg8.ao(0x710CAD2F) * 0x5F18BB83;
                                }
                                else if(0xF9 == arg9) {
                                    this.br = cn.ax(arg8, this.br, 0x63EF8EBC);
                                }
                                else {
                                }

                                return;
                            }
                        }
                    }

                    this.bk = arg8.ao(-366132670) * 950488441;
                    if(v4 == this.bk * 0x34F68CC9) {
                        this.bk = -950488441;
                    }

                    this.bm = arg8.ao(0x413087FF) * 0xDDA6003;
                    if(this.bm * 0x7FCB4AAB == v4) {
                        this.bm = 0xF2259FFD;
                    }

                    v2 = -1;
                    if(arg9 == v5) {
                        arg9 = arg8.ao(0xBFE9F44);
                        if(v4 == arg9) {
                            goto label_393;
                        }
                    }
                    else {
                    label_393:
                        arg9 = -1;
                    }

                    v3_1 = arg8.ay(-68);
                    this.bc = new int[v3_1 + 2];
                    while(v0 <= v3_1) {
                        this.bc[v0] = arg8.ao(0x85A400F5);
                        if(this.bc[v0] == v4) {
                            this.bc[v0] = v2;
                        }

                        ++v0;
                    }

                    this.bc[v3_1 + 1] = arg9;
                }
            }
            catch(RuntimeException v8) {
                goto label_415;
            }
        }
        else {
            goto label_35;
        }

        return;
    label_415:
        StringBuilder v9_1 = new StringBuilder();
        v9_1.append("do.an(");
        v9_1.append(v10);
        throw lx.al(((Throwable)v8), v9_1.toString());
    }

    public static do ao(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = do.ar.ax(v1);
        if(v0 != null) {
            return ((do)v0);
        }

        byte[] v0_1 = do.al.ae(6, arg5, 0x78DC0DC9);
        do v3 = new do();
        v3.aq = arg5 * 0xD271CCBD;
        if(v0_1 != null) {
            v3.ar(new lq(v0_1), 0xDFA20B29);
        }

        v3.ae(0x5B554D47);
        if(v3.bh) {
            v3.ah = 0;
            v3.at = false;
        }

        do.ar.ae(((mv)v3), v1);
        return v3;
    }

    public final boolean ap(int arg6, int arg7) {
        try {
            int v0 = 0xFFFF;
            int v2 = 1;
            if(this.af == null) {
                if(this.ab == null) {
                    return 1;
                }

                if(10 != arg6) {
                    return 1;
                }

                for(arg6 = 0; arg6 < this.ab.length; ++arg6) {
                    v2 &= ad.ae.an(this.ab[arg6] & v0, 0, -897763660);
                }

                return ((boolean)v2);
            }

            arg7 = 0;
            while(true) {
            label_26:
                if(arg7 >= this.af.length) {
                    return 1;
                }

                if(this.af[arg7] != arg6) {
                    break;
                }

                return ad.ae.an(this.ab[arg7] & v0, 0, 0x1977BCF8);
            }
        }
        catch(RuntimeException v6) {
            goto label_44;
        }

        ++arg7;
        goto label_26;
        return 1;
    label_44:
        StringBuilder v7 = new StringBuilder();
        v7.append("do.ap(");
        v7.append(')');
        throw lx.al(((Throwable)v6), v7.toString());
    }

    public final ca aq(int arg9, int arg10, int[][] arg11, int arg12, int arg13, int arg14, byte arg15) {
        mv v0_2;
        ca v15_1;
        try {
            int v0 = 0x9BAF8E95;
            long v0_1 = this.af == null ? ((long)((this.aq * v0 << 10) + arg10)) : ((long)((this.aq * v0 << 10) + (arg9 << 3) + arg10));
            mv v15 = do.aj.ax(v0_1);
            if(v15 == null) {
                by v2 = this.af(arg9, arg10, 0x27F51524);
                if(v2 == null) {
                    return null;
                }
                else {
                    v15_1 = v2.ay(this.bd * 248041807 + 0x40, this.ba * 0xD173FB3F + 0x300, -50, -10, -50);
                    do.aj.ae(((mv)v15_1), v0_1);
                }
            }

            v0_2 = ((mv)v15_1);
            arg10 = -915509833;
            if(this.aw * arg10 >= 0) {
                ca v0_3 = ((ca)v0_2).ax(arg11, arg12, arg13, arg14, true, this.aw * arg10);
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("do.aq(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }

        return ((ca)v0_2);
    }

    public static String ar(CharSequence arg4, ml arg5, int arg6) {
        StringBuilder v5;
        String v6 = null;
        if(arg4 == null) {
            return v6;
        }

        int v0 = 0;
        try {
            int v1 = arg4.length();
            while(v0 < v1) {
                if(!jy.ae(arg4.charAt(v0), 0x1F904B1B)) {
                    break;
                }

                ++v0;
            }

            while(v1 > v0) {
                if(!jy.ae(arg4.charAt(v1 - 1), 176900104)) {
                    break;
                }

                --v1;
            }

            int v2 = v1 - v0;
            if(v2 >= 1) {
                if(v2 > iu.ax(arg5, -900939569)) {
                }
                else {
                    v5 = new StringBuilder(v2);
                    goto label_29;
                }
            }
        }
        catch(RuntimeException v4) {
            goto label_50;
        }

        return v6;
        try {
        label_29:
            while(v0 < v1) {
                char v2_1 = arg4.charAt(v0);
                if(!fp.al(v2_1, -23)) {
                }
                else {
                    v2_1 = jw.an(v2_1, 0x3FAEBB49);
                    if(v2_1 == 0) {
                    }
                    else {
                        v5.append(v2_1);
                    }
                }

                ++v0;
            }

            if(v5.length() == 0) {
                return v6;
            }

            return v5.toString();
        }
        catch(RuntimeException v4) {
        label_50:
            v5 = new StringBuilder();
            v5.append("do.ar(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void ar(lq arg2, int arg3) {
        while(true) {
            byte v3 = -67;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.an(arg2, arg3, 0x3ABC3953);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("do.ar(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    void as() {
        int v1 = -1;
        int v2 = 0;
        if(v1 == this.ay * 0xE5018CDF) {
            this.ay = 0;
            int v3 = 0x1F6D2F1F;
            if(this.ab != null && (this.af == null || this.af[0] == 10)) {
                this.ay = v3;
            }

            int v0;
            for(v0 = 0; v0 < 5; ++v0) {
                if(this.bf[v0] != null) {
                    this.ay = v3;
                }
            }
        }

        if(this.bb * 0x3376F5D7 == v1) {
            if(this.ah * 0xE748B627 != 0) {
                v2 = 1;
            }

            this.bb = v2 * 0xDA2DCDE7;
        }
    }

    public static void at(ko arg0, ko arg1, boolean arg2) {
        do.al = arg0;
        ad.ae = arg1;
        do.ax = arg2;
    }

    public int av(int arg2, int arg3, int arg4) {
        try {
            return bq.al(this.br, arg2, arg3, 2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("do.av(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static do aw(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = do.ar.ax(v1);
        if(v0 != null) {
            return ((do)v0);
        }

        byte[] v0_1 = do.al.ae(6, arg5, 0x78DC0DC9);
        do v3 = new do();
        v3.aq = arg5 * 0xD271CCBD;
        if(v0_1 != null) {
            v3.ar(new lq(v0_1), 0xDFA20B29);
        }

        v3.ae(709114780);
        if(v3.bh) {
            v3.ah = 0;
            v3.at = false;
        }

        do.ar.ae(((mv)v3), v1);
        return v3;
    }

    public static void ay(ko arg0, ko arg1, boolean arg2) {
        do.al = arg0;
        ad.ae = arg1;
        do.ax = arg2;
    }

    public static void az(ko arg0, ko arg1, boolean arg2) {
        do.al = arg0;
        ad.ae = arg1;
        do.ax = arg2;
    }

    void ba(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-1);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, 1027691228);
        }
    }

    final by bb(int arg20, int arg21) {
        by v14;
        mv v11_2;
        int v11_1;
        int v9;
        int v3_1;
        do v0 = this;
        int v1 = arg20;
        int v2 = arg21;
        int v4 = 2;
        int v5 = 3;
        by v6 = null;
        int v7 = 0;
        if(v0.af != null) {
            v3_1 = 0;
            while(true) {
                v10 = -1;
                if(v3_1 >= v0.af.length) {
                    break;
                }
                else if(v1 == v0.af[v3_1]) {
                }
                else {
                    ++v3_1;
                    continue;
                }

                goto label_69;
            }

            v3_1 = -1;
        label_69:
            if(v10 == v3_1) {
                return v6;
            }

            v3_1 = v0.ab[v3_1];
            boolean v9_1 = v0.bw;
            v10 = v2 > v5 ? 1 : 0;
            v9 = (((int)v9_1)) ^ v10;
            if(v9 != 0) {
                v3_1 += -146102102;
            }

            long v11_3 = ((long)v3_1);
            mv v10_1 = do.an.ax(v11_3);
            if(v10_1 == null) {
                by v3_2 = by.ax(ad.ae, v3_1 & 0xFFFF, 0);
                if(v3_2 == null) {
                    return v6;
                }

                if(v9 != 0) {
                    v3_2.au();
                }

                do.an.ae(((mv)v3_2), v11_3);
                v14 = v3_2;
                goto label_99;
            }

            mv v14_1 = v10_1;
        }
        else if(10 != v1) {
            return v6;
        }
        else if(v0.ab == null) {
            return v6;
        }
        else {
            boolean v3 = v0.bw;
            if(v4 == v1 && v2 > v5) {
                v3_1 = (((int)v3)) ^ 1;
            }

            v9 = v0.ab.length;
            by v11 = v6;
            int v10;
            for(v10 = 0; v10 < v9; ++v10) {
                v11_1 = v0.ab[v10];
                if((((boolean)v3_1))) {
                    v11_1 += 0xAC682BD0;
                }

                long v13 = ((long)v11_1);
                mv v12 = do.an.ax(v13);
                if(v12 == null) {
                    v11 = by.ax(ad.ae, v11_1 & 1093761388, 0);
                    if(v11 == null) {
                        return v6;
                    }
                    else {
                        if((((boolean)v3_1))) {
                            v11.au();
                        }

                        do.an.ae(((mv)v11), v13);
                    }
                }
                else {
                    v11_2 = v12;
                }

                if(v9 > 1) {
                    do.ad[v10] = ((by)v11_2);
                }
            }

            if(v9 > 1) {
                v11 = new by(do.ad, v9);
            }

            v14 = ((by)v11_2);
        }

    label_99:
        int v6_1 = 0x1A7A7D93;
        v9 = -1544308055;
        v10 = 0x80;
        v3_1 = v0.by * v6_1 != v10 || v10 != v0.bt * v9 || v0.bv * 619238020 != 0xD696FC20 ? 1 : 0;
        v11_1 = 0x82727707;
        v10 = v0.bq * v11_1 != 0 || v0.bx * 0xDF2F7321 != 0 || v0.bg * 0x7A88F218 != 0 ? 1 : 0;
        by v12_1 = null;
        boolean v15 = v2 != 0 || v3_1 != 0 || v10 != 0 ? false : true;
        boolean v16 = v0.av == null ? true : false;
        boolean v17 = v0.au == null ? true : false;
        super(v14, v15, v16, v17, true);
        if(4 == v1 && v2 > v5) {
            v12_1.af(0x100);
            v12_1.ai(0xE9E971FD, 0, -45);
        }

        v1 = v2 & 3;
        if(v1 == 1) {
            v12_1.ad();
        }
        else if(v4 == v1) {
            v12_1.aq();
        }
        else if(v1 == v5) {
            v12_1.ab();
        }

        if(v0.av != null) {
            for(v1 = 0; v1 < v0.av.length; ++v1) {
                v12_1.av(v0.av[v1], v0.aa[v1]);
            }
        }

        if(v0.au != null) {
            while(v7 < v0.au.length) {
                v12_1.aa(v0.au[v7], v0.am[v7]);
                ++v7;
            }
        }

        if(v3_1 != 0) {
            v12_1.am(v0.by * v6_1, v0.bt * v9, v0.bv * 0x2AA9260B);
        }

        if(v10 != 0) {
            v12_1.ai(v0.bq * v11_1, v0.bx * 0xC60EEAB1, v0.bg * 0x2B50E2);
        }

        return v12_1;
    }

    final by bc(int arg20, int arg21) {
        by v14;
        int v9;
        mv v14_1;
        int v3_1;
        do v0 = this;
        int v1 = arg20;
        int v2 = arg21;
        int v4 = 2;
        int v5 = 3;
        by v6 = null;
        int v8 = 0;
        if(v0.af != null) {
            v3_1 = 0;
            while(true) {
                v10 = -1;
                if(v3_1 >= v0.af.length) {
                    break;
                }
                else if(v1 == v0.af[v3_1]) {
                }
                else {
                    ++v3_1;
                    continue;
                }

                goto label_72;
            }

            v3_1 = -1;
        label_72:
            if(v10 == v3_1) {
                return v6;
            }

            v3_1 = v0.ab[v3_1];
            boolean v9_1 = v0.bw;
            v10 = v2 > v5 ? 1 : 0;
            v9 = (((int)v9_1)) ^ v10;
            if(v9 != 0) {
                v3_1 += 0x4B86C54D;
            }

            long v11_3 = ((long)v3_1);
            mv v10_1 = do.an.ax(v11_3);
            if(v10_1 == null) {
                by v3_2 = by.ax(ad.ae, v3_1 & 0xFFFF, 0);
                if(v3_2 == null) {
                    return v6;
                }

                if(v9 != 0) {
                    v3_2.au();
                }

                do.an.ae(((mv)v3_2), v11_3);
                v14 = v3_2;
                goto label_102;
            }

            v14_1 = v10_1;
        }
        else if(10 != v1) {
            return v6;
        }
        else if(v0.ab == null) {
            return v6;
        }
        else {
            boolean v3 = v0.bw;
            if(v4 == v1 && v2 > v5) {
                v3 = !v3 ? true : false;
            }

            v9 = v0.ab.length;
            by v11 = v6;
            int v10;
            for(v10 = 0; v10 < v9; ++v10) {
                int v11_1 = v0.ab[v10];
                if(v3) {
                    v11_1 += 0xBBC20C0;
                }

                long v13 = ((long)v11_1);
                mv v12 = do.an.ax(v13);
                if(v12 == null) {
                    v11 = by.ax(ad.ae, v11_1 & 0xDE974044, 0);
                    if(v11 == null) {
                        return v6;
                    }
                    else {
                        if(v3) {
                            v11.au();
                        }

                        do.an.ae(((mv)v11), v13);
                    }
                }
                else {
                    mv v11_2 = v12;
                }

                if(v9 > 1) {
                    do.ad[v10] = v11;
                }
            }

            if(v9 > 1) {
                v11 = new by(do.ad, v9);
            }

            v14 = v11;
        }

    label_102:
        int v6_1 = 0x80;
        v3_1 = v0.by * -1668835032 != v6_1 || 0x36D571FF != v0.bt * -1544308055 || v0.bv * -1608095172 != v6_1 ? 1 : 0;
        v6_1 = 1477739707;
        v9 = v0.bq * 0xB68C9B61 != 0 || v0.bx * 0xC60EEAB1 != 0 || v0.bg * v6_1 != 0 ? 1 : 0;
        by v10_2 = null;
        boolean v15 = v2 != 0 || v3_1 != 0 || v9 != 0 ? false : true;
        boolean v16 = v0.av == null ? true : false;
        boolean v17 = v0.au == null ? true : false;
        super(((by)v14_1), v15, v16, v17, true);
        if(4 == v1 && v2 > v5) {
            v10_2.af(0x2D74802);
            v10_2.ai(0x11960509, 0, 0xA0230C75);
        }

        v1 = v2 & 3;
        if(v1 == 1) {
            v10_2.ad();
        }
        else if(v4 == v1) {
            v10_2.aq();
        }
        else if(v1 == v5) {
            v10_2.ab();
        }

        if(v0.av != null) {
            for(v1 = 0; v1 < v0.av.length; ++v1) {
                v10_2.av(v0.av[v1], v0.aa[v1]);
            }
        }

        if(v0.au != null) {
            while(v8 < v0.au.length) {
                v10_2.aa(v0.au[v8], v0.am[v8]);
                ++v8;
            }
        }

        if(v3_1 != 0) {
            v10_2.am(v0.by * 0x1A7A7D93, v0.bt * 0x272F6F45, v0.bv * 1503805177);
        }

        if(v9 != 0) {
            v10_2.ai(v0.bq * 0x82727707, v0.bx * 506579706, v0.bg * v6_1);
        }

        return v10_2;
    }

    void bd() {
        int v1 = -1;
        int v2 = 0;
        if(v1 == this.ay * 0xE5018CDF) {
            this.ay = 0;
            if(this.ab != null && (this.af == null || this.af[0] == 10)) {
                this.ay = 0x1F6D2F1F;
            }

            int v0;
            for(v0 = 0; v0 < 5; ++v0) {
                if(this.bf[v0] != null) {
                    this.ay = 0xB2029EB4;
                }
            }
        }

        if(this.bb * 0x99BE64B8 == v1) {
            if(this.ah * 0xE748B627 != 0) {
                v2 = 1;
            }

            this.bb = v2 * 0x820971A6;
        }
    }

    public int be(int arg3, int arg4) {
        return bq.al(this.br, arg3, arg4, 2);
    }

    void bf(lq arg7, int arg8) {
        int v0 = 0;
        if(1 == arg8) {
            arg8 = arg7.ay(-120);
            if(arg8 > 0) {
                if(this.ab != null) {
                    if(do.ax) {
                    }
                    else {
                        arg7.ar += arg8 * 0x305DECA7;
                        return;
                    }
                }

                this.af = new int[arg8];
                this.ab = new int[arg8];
                while(v0 < arg8) {
                    this.ab[v0] = arg7.ao(0x4E94B41C);
                    this.af[v0] = arg7.ay(-43);
                    ++v0;
                }
            }
        }
        else {
            if(2 == arg8) {
                this.ai = arg7.bn(-101);
                return;
            }

            int[] v3 = null;
            if(arg8 == 5) {
                arg8 = arg7.ay(-118);
                if(arg8 <= 0) {
                    return;
                }

                if(this.ab != null) {
                    if(do.ax) {
                    }
                    else {
                        arg7.ar += arg8 * 0x1BA302F0;
                        return;
                    }
                }

                this.af = v3;
                this.ab = new int[arg8];
                while(true) {
                    if(v0 >= arg8) {
                        return;
                    }

                    this.ab[v0] = arg7.ao(2099164079);
                    ++v0;
                }
            }

            if(14 == arg8) {
                this.az = arg7.ay(-99) * 0xB27408F0;
                return;
            }

            if(arg8 == 15) {
                this.ag = arg7.ay(-21) * 0x8D4D8727;
                return;
            }

            if(arg8 == 17) {
                this.ah = 0;
                this.at = false;
                return;
            }

            if(18 == arg8) {
                this.at = false;
                return;
            }

            byte v4 = -109;
            if(19 == arg8) {
                this.ay = arg7.ay(v4) * 0x1F6D2F1F;
                return;
            }

            if(21 == arg8) {
                this.aw = 0;
                return;
            }

            if(arg8 == 22) {
                this.ao = true;
                return;
            }

            if(arg8 == 23) {
                this.as = true;
                return;
            }

            if(arg8 == 24) {
                this.ak = arg7.ao(0x37403AB3) * 0xC896F180;
                if(this.ak * 0x2792A9F2 != 0x5318E3E) {
                    return;
                }

                this.ak = 0x2B1AF123;
                return;
            }

            if(27 == arg8) {
                this.ah = 0x2B8F5997;
                return;
            }

            if(arg8 == 28) {
                this.ac = arg7.ay(-13) * 0x70FB252E;
                return;
            }

            int v5 = -1215098345;
            if(arg8 == 29) {
                this.bd = arg7.aw(v5) * -71080681;
                return;
            }

            if(arg8 == 0x1648331F) {
                this.ba = arg7.aw(v5) * 1975805607;
                return;
            }

            int v2 = 30;
            if(arg8 >= v2 && arg8 < 0xB3A520D4) {
                arg8 -= v2;
                this.bf[arg8] = arg7.bn(88);
                if(this.bf[arg8].equalsIgnoreCase(gs.ar)) {
                    this.bf[arg8] = ((String)v3);
                }
                else {
                }

                return;
            }

            if(arg8 == -1036376994) {
                arg8 = arg7.ay(-24);
                this.av = new short[arg8];
                this.aa = new short[arg8];
                while(true) {
                    if(v0 >= arg8) {
                        return;
                    }

                    this.av[v0] = ((short)arg7.ao(1200725831));
                    this.aa[v0] = ((short)arg7.ao(0x7D05819B));
                    ++v0;
                }
            }

            if(arg8 == 41) {
                arg8 = arg7.ay(-69);
                this.au = new short[arg8];
                this.am = new short[arg8];
                while(true) {
                    if(v0 >= arg8) {
                        return;
                    }

                    this.au[v0] = ((short)arg7.ao(0xC2E97FC2));
                    this.am[v0] = ((short)arg7.ao(-1561032650));
                    ++v0;
                }
            }

            if(arg8 == -1043068945) {
                this.bw = true;
                return;
            }

            if(0xBCB1CEFF == arg8) {
                this.bo = false;
                return;
            }

            if(65 == arg8) {
                this.by = arg7.ao(0xE9E2919) * -1790361284;
                return;
            }

            if(arg8 == 0xA7648F91) {
                this.bt = arg7.ao(-1245023802) * 0x8BB74020;
                return;
            }

            if(0x61FBFF3C == arg8) {
                this.bv = arg7.ao(0xE356E80) * -1902791261;
                return;
            }

            if(arg8 == 68) {
                this.bp = arg7.ao(-1095942987) * -1958062311;
                return;
            }

            if(arg8 == 69) {
                arg7.ay(-96);
                return;
            }

            if(0x62247C7D == arg8) {
                this.bq = arg7.as(0x5C9C3C65) * -1374206281;
                return;
            }

            if(arg8 == 71) {
                this.bx = arg7.as(2008914320) * 0xB5F71E51;
                return;
            }

            if(72 == arg8) {
                this.bg = arg7.as(0x7753BFFB) * 0x68608E0D;
                return;
            }

            if(658706962 == arg8) {
                this.bz = true;
                return;
            }

            if(0x88DE609C == arg8) {
                this.bh = true;
                return;
            }

            if(arg8 == 0x4B5F729C) {
                this.bb = arg7.ay(-86) * 1007410932;
                return;
            }

            if(-1022243830 != arg8) {
                if(arg8 == 0x9F6DBE38) {
                }
                else if(78 == arg8) {
                    this.bj = arg7.ao(388450419) * 0x343F95A8;
                    this.bu = arg7.ay(-34) * 0x4BEEE993;
                    return;
                }
                else if(arg8 == 0x4F) {
                    this.bs = arg7.ao(0xD8E88127) * 0xB9D527F;
                    this.be = arg7.ao(-380712067) * 0x13D21A66;
                    this.bu = arg7.ay(-10) * -1511771803;
                    arg8 = arg7.ay(-37);
                    this.bl = new int[arg8];
                    while(true) {
                        if(v0 < arg8) {
                            this.bl[v0] = arg7.ao(0xEBD0F2D7);
                            ++v0;
                            continue;
                        }
                        else {
                            return;
                        }
                    }
                }
                else if(arg8 == 81) {
                    this.aw = arg7.ay(-52) * 0x6F006EFC;
                    return;
                }
                else {
                    if(0xC0878E90 == arg8) {
                        this.bn = arg7.ao(-523075094) * 0x5F18BB83;
                    }
                    else if(0xF9 == arg8) {
                        this.br = cn.ax(arg7, this.br, 0xA38C8013);
                    }
                    else {
                    }

                    return;
                }
            }

            this.bk = arg7.ao(0x688FDC3) * 0x29A78AE9;
            if(1858626086 == this.bk * 0x34F68CC9) {
                this.bk = 0x8DCA3472;
            }

            this.bm = arg7.ao(2100888900) * 0xDDA6003;
            if(this.bm * 0x7FCB4AAB == 0xA4AA8DD5) {
                this.bm = 0xF2259FFD;
            }

            int v3_1 = -1;
            if(arg8 == 92) {
                arg8 = arg7.ao(0x117A1EAC);
                if(0xFFFF == arg8) {
                    goto label_397;
                }
            }
            else {
            label_397:
                arg8 = -1;
            }

            v2 = arg7.ay(v4);
            this.bc = new int[v2 + 2];
            while(v0 <= v2) {
                this.bc[v0] = arg7.ao(0x2040EFF9);
                if(this.bc[v0] == 0xC10390F) {
                    this.bc[v0] = v3_1;
                }

                ++v0;
            }

            this.bc[v2 + 1] = arg8;
        }
    }

    public final ca bg(int arg14, int arg15, int[][] arg16, int arg17, int arg18, int arg19) {
        ca v5_1;
        do v0 = this;
        int v1 = arg14;
        int v2 = arg15;
        int v4 = 0x9BAF8E95;
        long v3 = v0.af == null ? ((long)((v0.aq * v4 << 10) + v2)) : ((long)((v0.aq * v4 << 10) + (v1 << 3) + v2));
        mv v5 = do.aj.ax(v3);
        if(v5 == null) {
            by v6 = this.af(arg14, arg15, 0x76029AC9);
            if(v6 == null) {
                return null;
            }
            else {
                v5_1 = v6.ay(v0.bd * 248041807 + 0x40, v0.ba * 0xD173FB3F + 0x300, -50, -10, -50);
                do.aj.ae(((mv)v5_1), v3);
            }
        }

        mv v6_1 = ((mv)v5_1);
        v2 = -915509833;
        if(v0.aw * v2 >= 0) {
            ca v6_2 = ((ca)v6_1).ax(arg16, arg17, arg18, arg19, true, v0.aw * v2);
        }

        return ((ca)v6_1);
    }

    public final ca bh(int arg14, int arg15, int[][] arg16, int arg17, int arg18, int arg19, df arg20, int arg21) {
        do v0 = this;
        int v1 = arg14;
        int v2 = arg15;
        df v3 = arg20;
        long v4 = v0.af == null ? ((long)((v0.aq * 0x9BAF8E95 << 10) + v2)) : ((long)((v0.aq * 0xD54F63F << 10) + (v1 << 3) + v2));
        mv v6 = do.aj.ax(v4);
        if(v6 == null) {
            by v7 = this.af(arg14, arg15, 918065645);
            if(v7 == null) {
                return null;
            }
            else {
                ca v6_1 = v7.ay(v0.bd * -1932956041 + 0x40, v0.ba * 0xD173FB3F - 0x5A20F2B5, 0xF081C6CA, -10, -50);
                do.aj.ae(((mv)v6_1), v4);
            }
        }

        v1 = -915509833;
        if(v3 == null && -1 == v0.aw * v1) {
            return ((ca)v6);
        }

        ca v2_1 = v3 != null ? v3.aj(((ca)v6), arg21, arg15, 1586054809) : ((ca)v6).al(true);
        ca v3_1 = v2_1;
        if(v0.aw * 0xDF826245 >= 0) {
            v3_1 = v3_1.ax(arg16, arg17, arg18, arg19, false, v0.aw * v1);
        }

        return v3_1;
    }

    public String bi(int arg3, String arg4) {
        return az.ae(this.br, arg3, arg4, -107049639);
    }

    public final do bj() {
        int v1;
        int v0 = -1;
        if(this.bk * 0x8BAD2AB3 != v0) {
            v1 = of.ax(this.bk * 0x4C68AA2C, 1571740580);
        }
        else if(this.bm * 0xF706E19B != v0) {
            v1 = an.ae[this.bm * 0x7FCB4AAB];
        }
        else {
            v1 = -1;
        }

        v1 = v1 < 0 || v1 >= this.bc.length - 1 ? this.bc[this.bc.length - 1] : this.bc[v1];
        if(v0 != v1) {
            return ok.al(v1, 0xD6852D55);
        }

        return null;
    }

    public final do bk() {
        int v1;
        int v0 = -1;
        if(this.bk * 486206039 != v0) {
            v1 = of.ax(this.bk * 0xE272E461, 0x56B9FEED);
        }
        else if(this.bm * 0xF7375BB != v0) {
            v1 = an.ae[this.bm * 0x7FCB4AAB];
        }
        else {
            v1 = -1;
        }

        v1 = v1 < 0 || v1 >= this.bc.length - 1 ? this.bc[this.bc.length - 1] : this.bc[v1];
        if(v0 != v1) {
            return ok.al(v1, 0xE3B7A208);
        }

        return null;
    }

    public int bl(int arg3, int arg4) {
        return bq.al(this.br, arg3, arg4, 2);
    }

    static void bm(byte arg2) {
        int v2 = 1723180018;
        try {
            client.al.abz(dg.ai(v2), -1494882707);
            return;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("do.bm(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    public final do bm() {
        int v1;
        int v0 = -1;
        if(this.bk * 0x34F68CC9 != v0) {
            v1 = of.ax(this.bk * -782777540, 0x5A19742D);
        }
        else {
            int v2 = 0x7FCB4AAB;
            v1 = this.bm * v2 != v0 ? an.ae[this.bm * v2] : -1;
        }

        v1 = v1 < 0 || v1 >= this.bc.length - 1 ? this.bc[this.bc.length - 1] : this.bc[v1];
        if(v0 != v1) {
            return ok.al(v1, 0x73F28583);
        }

        return null;
    }

    public final boolean bn(int arg6) {
        int v2 = 1;
        if(this.af == null) {
            if(this.ab == null) {
                return 1;
            }

            if(10 != arg6) {
                return 1;
            }

            for(arg6 = 0; arg6 < this.ab.length; ++arg6) {
                v2 &= ad.ae.an(this.ab[arg6] & 0x567F07D9, 0, 682250660);
            }

            return ((boolean)v2);
        }

        int v0;
        for(v0 = 0; v0 < this.af.length; ++v0) {
            if(this.af[v0] == arg6) {
                return ad.ae.an(this.ab[v0] & 0xFFFF, 0, 0x8E1F9BAA);
            }
        }

        return 1;
    }

    public final boolean bo(int arg6) {
        int v2 = 1;
        if(this.af == null) {
            if(this.ab == null) {
                return 1;
            }

            if(10 != arg6) {
                return 1;
            }

            for(arg6 = 0; arg6 < this.ab.length; ++arg6) {
                v2 &= ad.ae.an(this.ab[arg6] & 199611066, 0, 0xC89AE2B5);
            }

            return ((boolean)v2);
        }

        int v0;
        for(v0 = 0; v0 < this.af.length; ++v0) {
            if(this.af[v0] == arg6) {
                return ad.ae.an(this.ab[v0] & 0xFFFF, 0, 0xD1F32A4F);
            }
        }

        return 1;
    }

    public final boolean bp(int arg6) {
        int v2 = 1;
        if(this.af == null) {
            if(this.ab == null) {
                return 1;
            }

            if(10 != arg6) {
                return 1;
            }

            for(arg6 = 0; arg6 < this.ab.length; ++arg6) {
                v2 &= ad.ae.an(this.ab[arg6] & 0xFFFF, 0, 0xC090F9DF);
            }

            return ((boolean)v2);
        }

        int v0;
        for(v0 = 0; v0 < this.af.length; ++v0) {
            if(this.af[v0] == arg6) {
                return ad.ae.an(this.ab[v0] & 595421850, 0, 0xC4C71143);
            }
        }

        return 1;
    }

    public final bm bq(int arg14, int arg15, int[][] arg16, int arg17, int arg18, int arg19) {
        by v5_2;
        ca v5_1;
        do v0 = this;
        int v1 = arg14;
        int v2 = arg15;
        long v3 = v0.af == null ? ((long)((v0.aq * 0x46800C8E << 10) + v2)) : ((long)((v1 << 3) + (v0.aq * 0x9BAF8E95 << 10) + v2));
        mv v5 = do.ap.ax(v3);
        if(v5 == null) {
            by v6 = this.af(arg14, arg15, 0x611B820F);
            if(v6 == null) {
                return null;
            }
            else {
                if(!v0.ao) {
                    v5_1 = v6.ay(v0.bd * 1310217442 + 0x40, v0.ba * 0x79A867F + 0x300, -50, 0x263A22D8, 0x90401681);
                }
                else {
                    v6.ba = ((short)(v0.bd * 873964904 + 0x40));
                    v6.bf = ((short)(v0.ba * -1793267012 + 0x300));
                    v6.az();
                    v5_2 = v6;
                }

                do.ap.ae(((mv)v5_2), v3);
            }
        }

        if(v0.ao) {
            v5_2 = v5_2.an();
        }

        if(v0.aw * 0xECDA9CB >= 0) {
            if(((((mv)v5_2)) instanceof ca)) {
                v5_1 = ((mv)v5_2).ax(arg16, arg17, arg18, arg19, true, v0.aw * 820840050);
            }
            else if(((((mv)v5_2)) instanceof by)) {
                v5_2 = ((mv)v5_2).ap(arg16, arg17, arg18, arg19, true, v0.aw * 0xA7430FB6);
            }
        }

        return ((bm)v5_2);
    }

    public String br(int arg3, String arg4) {
        return az.ae(this.br, arg3, arg4, -107049639);
    }

    public int bs(int arg3, int arg4) {
        return bq.al(this.br, arg3, arg4, 2);
    }

    public final boolean bt() {
        if(this.ab == null) {
            return 1;
        }

        int v1 = 0;
        int v2 = 1;
        while(v1 < this.ab.length) {
            v2 &= ad.ae.an(this.ab[v1] & 1562090591, 0, 0xBA1CAC89);
            ++v1;
        }

        return ((boolean)v2);
    }

    public int bu(int arg3, int arg4) {
        return bq.al(this.br, arg3, arg4, 2);
    }

    public final bm bv(int arg14, int arg15, int[][] arg16, int arg17, int arg18, int arg19) {
        by v5_2;
        ca v5_1;
        do v0 = this;
        int v1 = arg14;
        int v2 = arg15;
        long v3 = v0.af == null ? ((long)((v0.aq * -157489507 << 10) + v2)) : ((long)((v1 << 3) + (v0.aq * -971327601 << 10) + v2));
        mv v5 = do.ap.ax(v3);
        if(v5 == null) {
            by v6 = this.af(arg14, arg15, 0x4389A2FF);
            if(v6 == null) {
                return null;
            }
            else {
                if(!v0.ao) {
                    v5_1 = v6.ay(v0.bd * 248041807 + 0x40, v0.ba * 0xD173FB3F + 0x300, 892886506, -10, -50);
                }
                else {
                    v6.ba = ((short)(v0.bd * 1419239900 + 0x7BF50B96));
                    v6.bf = ((short)(v0.ba * 0x8066E72A + 0x300));
                    v6.az();
                    v5_2 = v6;
                }

                do.ap.ae(((mv)v5_1), v3);
            }
        }

        if(v0.ao) {
            v5_2 = ((by)v5_1).an();
        }

        v2 = -915509833;
        if(v0.aw * v2 >= 0) {
            if(((((mv)v5_1)) instanceof ca)) {
                v5_1 = ((mv)v5_1).ax(arg16, arg17, arg18, arg19, true, v0.aw * 0xDEFCECF1);
            }
            else if(((((mv)v5_1)) instanceof by)) {
                v5_2 = ((mv)v5_1).ap(arg16, arg17, arg18, arg19, true, v0.aw * v2);
            }
        }

        return ((bm)v5_1);
    }

    public final boolean bw(int arg7) {
        int v1 = 0xFFFF;
        int v3 = 1;
        if(this.af == null) {
            if(this.ab == null) {
                return 1;
            }

            if(10 != arg7) {
                return 1;
            }

            for(arg7 = 0; arg7 < this.ab.length; ++arg7) {
                v3 &= ad.ae.an(this.ab[arg7] & v1, 0, 0xEA33A528);
            }

            return ((boolean)v3);
        }

        int v0;
        for(v0 = 0; v0 < this.af.length; ++v0) {
            if(this.af[v0] == arg7) {
                return ad.ae.an(this.ab[v0] & v1, 0, 0xE9741131);
            }
        }

        return 1;
    }

    public final ca bx(int arg14, int arg15, int[][] arg16, int arg17, int arg18, int arg19) {
        ca v5_1;
        do v0 = this;
        int v1 = arg14;
        int v2 = arg15;
        long v3 = v0.af == null ? ((long)((v0.aq * 0x9BAF8E95 << 10) + v2)) : ((long)((v0.aq * -1209652385 << 10) + (v1 << 3) + v2));
        mv v5 = do.aj.ax(v3);
        if(v5 == null) {
            by v6 = this.af(arg14, arg15, 0x4C6D4C2F);
            if(v6 == null) {
                return null;
            }
            else {
                v5_1 = v6.ay(v0.bd * -2115077537 + 0x40, v0.ba * 0xF67F74B5 - 1114130052, 0xD51F5C39, -10, -562442804);
                do.aj.ae(((mv)v5_1), v3);
            }
        }

        mv v6_1 = ((mv)v5_1);
        if(v0.aw * -1854396004 >= 0) {
            ca v6_2 = ((ca)v6_1).ax(arg16, arg17, arg18, arg19, true, v0.aw * 0xBCA99CC7);
        }

        return ((ca)v6_1);
    }

    public final boolean by() {
        if(this.ab == null) {
            return 1;
        }

        int v1 = 0;
        int v2 = 1;
        while(v1 < this.ab.length) {
            v2 &= ad.ae.an(this.ab[v1] & 0xFFFF, 0, 0x1D6FDBD0);
            ++v1;
        }

        return ((boolean)v2);
    }

    public final ca bz(int arg14, int arg15, int[][] arg16, int arg17, int arg18, int arg19) {
        ca v6_2;
        ca v5_1;
        do v0 = this;
        int v1 = arg14;
        int v2 = arg15;
        int v4 = 0x9BAF8E95;
        long v3 = v0.af == null ? ((long)((v0.aq * v4 << 10) + v2)) : ((long)((v0.aq * v4 << 10) + (v1 << 3) + v2));
        mv v5 = do.aj.ax(v3);
        if(v5 == null) {
            by v6 = this.af(arg14, arg15, 1018450440);
            if(v6 == null) {
                return null;
            }
            else {
                v5_1 = v6.ay(v0.bd * 248041807 + 0x40, v0.ba * 0xD173FB3F + 0x300, -50, -10, -50);
                do.aj.ae(((mv)v5_1), v3);
            }
        }

        mv v6_1 = ((mv)v5_1);
        v2 = -915509833;
        if(v0.aw * v2 >= 0) {
            v6_2 = ((ca)v6_1).ax(arg16, arg17, arg18, arg19, true, v0.aw * v2);
        }

        return v6_2;
    }

    public static void ca(Collection arg1) {
        arg1.add(do.ar);
        arg1.add(do.an);
        arg1.add(do.ap);
        arg1.add(do.aj);
    }

    static final void cb(int arg10) {
        try {
            arg10 = fw.pn * 0x709BA080 + 0x40;
            int v0 = dj.ph * 0xFC825B80 + 0x40;
            int v1 = fj.ez(arg10, v0, kt.jz * 1101813865, 0x7640D11A) - client.pk * 0xE70EDA1D;
            int v3 = 0x594485D5;
            int v4 = 0x71608B7D;
            int v5 = 0xD659A01D;
            int v6 = 0x9649899F;
            if(ag.hc * v3 < arg10) {
                ag.hc += (np.pv * v6 + (arg10 - ag.hc * v3) * (fy.pl * v5) / 1000) * v4;
                if(ag.hc * v3 > arg10) {
                    ag.hc = arg10 * v4;
                }
            }

            if(ag.hc * v3 > arg10) {
                ag.hc -= (np.pv * v6 + (ag.hc * v3 - arg10) * (fy.pl * v5) / 1000) * v4;
                if(ag.hc * v3 < arg10) {
                    ag.hc = arg10 * v4;
                }
            }

            int v2 = 0x92B48CBF;
            v4 = 0x303CE33F;
            if(bu.hi * v2 < v1) {
                bu.hi += (np.pv * v6 + fy.pl * v5 * (v1 - bu.hi * v2) / 1000) * v4;
                if(bu.hi * v2 > v1) {
                    bu.hi = v1 * v4;
                }
            }

            if(bu.hi * v2 > v1) {
                bu.hi -= (fy.pl * v5 * (bu.hi * v2 - v1) / 1000 + np.pv * v6) * v4;
                if(bu.hi * v2 < v1) {
                    bu.hi = v1 * v4;
                }
            }

            v1 = -1102211305;
            v4 = 0x543710A7;
            if(fg.hb * v1 < v0) {
                fg.hb += (fy.pl * v5 * (v0 - fg.hb * v1) / 1000 + np.pv * v6) * v4;
                if(fg.hb * v1 > v0) {
                    fg.hb = v0 * v4;
                }
            }

            if(fg.hb * v1 > v0) {
                fg.hb -= (fy.pl * v5 * (fg.hb * v1 - v0) / 1000 + np.pv * v6) * v4;
                if(fg.hb * v1 < v0) {
                    fg.hb = v0 * v4;
                }
            }

            arg10 = jc.pj * 0xA8C08980 + 0x40;
            v0 = hp.qa * 0x5C1CB280 + 0x40;
            v4 = fj.ez(arg10, v0, kt.jz * 1101813865, 0x7640D11A) - eo.qh * 0x16D6ADE5;
            arg10 -= ag.hc * v3;
            v4 -= bu.hi * v2;
            v0 -= fg.hb * v1;
            v1 = (((int)(Math.atan2(((double)v4), ((double)(((int)Math.sqrt(((double)(v0 * v0 + arg10 * arg10))))))) * 325.949))) & 0x7FF;
            arg10 = (((int)(Math.atan2(((double)arg10), ((double)v0)) * -325.949))) & 0x7FF;
            if(v1 < 0x80) {
                v1 = 0x80;
            }

            if(v1 > 0x17F) {
                v1 = 0x17F;
            }

            v2 = 0xAD05ECC3;
            v3 = 0xD0592F0D;
            if(fy.hd * v2 < v1) {
                fy.hd += ((v1 - fy.hd * v2) * (bd.qr * v3) / 1000 + ib.qo * 0x4A107FE5) * 0x53FB23EB;
                if(fy.hd * v2 > v1) {
                    fy.hd = 0x53FB23EB * v1;
                }
            }

            if(fy.hd * v2 > v1) {
                fy.hd -= ((fy.hd * v2 - v1) * (bd.qr * v3) / 1000 + ib.qo * 0x4A107FE5) * 0x53FB23EB;
                if(fy.hd * v2 < v1) {
                    fy.hd = v1 * 0x53FB23EB;
                }
            }

            v1 = 2069602569;
            v0 = arg10 - it.hh * v1;
            if(v0 > 0x400) {
                v0 += 0xFFFFF800;
            }

            if(v0 < 0xFFFFFC00) {
                v0 += 0x800;
            }

            v2 = 0xB9EA3D39;
            if(v0 > 0) {
                it.hh += (ib.qo * 0x4A107FE5 + bd.qr * v3 * v0 / 1000) * v2;
                it.hh = (it.hh * v1 & 0x7FF) * v2;
            }

            if(v0 < 0) {
                it.hh -= (bd.qr * v3 * -v0 / 1000 + ib.qo * 0x4A107FE5) * v2;
                it.hh = (it.hh * v1 & 0x7FF) * v2;
            }

            v1 = arg10 - it.hh * v1;
            if(v1 > 0x400) {
                v1 += 0xFFFFF800;
            }

            if(v1 < 0xFFFFFC00) {
                v1 += 0x800;
            }

            if(v1 < 0 && v0 > 0 || v1 > 0 && v0 < 0) {
                it.hh = arg10 * v2;
            }
        }
        catch(RuntimeException v10) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("do.cb(");
            v0_1.append(')');
            throw lx.al(((Throwable)v10), v0_1.toString());
        }
    }

    public boolean cd() {
        int v1 = 0xA4CFF52B;
        boolean v2 = true;
        int v3 = -1;
        if(this.bc == null) {
            if(this.bj * v1 == v3) {
                if(this.bl != null) {
                }
                else {
                    v2 = false;
                }
            }

            return v2;
        }

        int v0;
        for(v0 = 0; v0 < this.bc.length; ++v0) {
            if(this.bc[v0] != v3) {
                do v5 = ok.al(this.bc[v0], 2040604323);
                if(v3 == v5.bj * v1 && v5.bl == null) {
                    goto label_31;
                }

                return 1;
            }

        label_31:
        }

        return 0;
    }

    public boolean cj() {
        boolean v1 = true;
        int v2 = -1;
        if(this.bc == null) {
            if(this.bj * -1807113787 == v2) {
                if(this.bl != null) {
                }
                else {
                    v1 = false;
                }
            }

            return v1;
        }

        int v0;
        for(v0 = 0; v0 < this.bc.length; ++v0) {
            if(this.bc[v0] != v2) {
                do v4 = ok.al(this.bc[v0], 0xD2E17C85);
                if(v2 == v4.bj * 0xA4CFF52B && v4.bl == null) {
                    goto label_32;
                }

                return 1;
            }

        label_32:
        }

        return 0;
    }

    public static boolean gh(byte arg2) {
        try {
            if(client.li == null) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("do.gh(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }
}

