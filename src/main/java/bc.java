public class bc {
    static boolean ae = false;
    public static final int ag = 0;
    static int aj = 0;
    static ef ak = null;
    static final int al = 5;
    static int am = 0;
    static int an = 0;
    static final int ao = 7;
    static boolean ap = false;
    public static final int aq = 9;
    static int ar = 0;
    public static final int at = 2;
    static final int aw = 1600;
    static boolean ax = true;
    static long[] az = null;
    static final int bw = 0;
    static final int ce = 21;

    static {
        bc.az = new long[1000];
    }

    bc() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bc.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int ac() {
        return bc.am * 0xB140C423;
    }

    static int aj(int arg2, int arg3, int arg4) {
        long v2 = ((long)((arg2 << 16) + arg3));
        try {
            if(dq.ag != null) {
                if(v2 != dq.ag.gx) {
                }
                else {
                    return hu.at.ar * 0xB4ADE341 / (hu.at.ae.length - dq.ag.ae) + 1;
                }
            }
        }
        catch(RuntimeException v2_1) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bc.aj(");
            v3.append(')');
            throw lx.al(((Throwable)v2_1), v3.toString());
        }

        return 0;
    }

    public static int ak() {
        return bc.am * 0xB140C423;
    }

    public static int as() {
        return bc.am * 0xB140C423;
    }

    static boolean ba(long arg0) {
        boolean v0 = ii.ab(arg0) == 2 ? true : false;
        return v0;
    }

    public static int bb(long arg2) {
        return ((int)(arg2 >>> 0 & 0x7F));
    }

    public static int bc(int arg3) {
        return mj.ad(bc.az[arg3]);
    }

    static boolean bd(long arg0) {
        boolean v0 = ii.ab(arg0) == 2 ? true : false;
        return v0;
    }

    public static int be(int arg3) {
        return ii.ab(bc.az[arg3]);
    }

    static boolean bf(long arg0) {
        boolean v0 = ii.ab(arg0) == 2 ? true : false;
        return v0;
    }

    public static int bg(long arg2) {
        return ((int)(arg2 >>> 0 & 0x7F));
    }

    public static int bh(long arg2) {
        return ((int)(arg2 >>> 0 & 0x7F));
    }

    static int bi(long arg2) {
        return ((int)(arg2 >>> 14 & 3));
    }

    public static int bj(long arg2) {
        return ((int)(arg2 >>> 7 & 0x7F));
    }

    public static int bk(int arg3) {
        return mj.ad(bc.az[arg3]);
    }

    public static int bl(int arg3) {
        return ii.ab(bc.az[arg3]);
    }

    public static int bm(int arg3) {
        return mj.ad(bc.az[arg3]);
    }

    public static boolean bn(long arg2) {
        boolean v2 = arg2 == 0 || (cp.af(arg2)) ? false : true;
        return v2;
    }

    public static boolean bo(long arg2) {
        boolean v2 = arg2 == 0 || (cp.af(arg2)) ? false : true;
        return v2;
    }

    public static boolean bp(long arg2) {
        boolean v2 = arg2 == 0 || (cp.af(arg2)) ? false : true;
        return v2;
    }

    public static int bq(int arg3) {
        return ft.ap(bc.az[arg3]);
    }

    public static int br(int arg3) {
        return ii.ab(bc.az[arg3]);
    }

    public static int bs(long arg2) {
        return ((int)(arg2 >>> 7 & 0x7F));
    }

    public static long bt(int arg3) {
        return bc.az[arg3];
    }

    public static int bu(long arg2) {
        return ((int)(arg2 >>> 7 & 0x7F));
    }

    public static int bv(int arg3) {
        return ft.ap(bc.az[arg3]);
    }

    public static boolean bw(long arg2) {
        boolean v2 = arg2 == 0 || (cp.af(arg2)) ? false : true;
        return v2;
    }

    public static int bx(int arg3) {
        return ft.ap(bc.az[arg3]);
    }

    public static long by(int arg3) {
        return bc.az[arg3];
    }

    public static int bz(long arg2) {
        return ((int)(arg2 >>> 0 & 0x7F));
    }

    static boolean ca(long arg2) {
        int v2 = ((int)(arg2 >>> 16 & 1));
        boolean v3 = true;
        if(v2 == 1) {
        }
        else {
            v3 = false;
        }

        return v3;
    }

    public static int cb(long arg2) {
        return ((int)(arg2 >>> 17 & 0xFFFFFFFFL));
    }

    public static long cc(int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        long v4 = (((long)((arg4 & 0x7F) << 0 | (arg5 & 0xC98D069D) << 7 | (arg6 & 3) << 14))) | ((((long)arg8)) & 0xFFFFFFFFL) << 17;
        if(arg7) {
            v4 |= 0x10000;
        }

        return v4;
    }

    public static int cd(int arg3) {
        return be.av(bc.az[arg3]);
    }

    static final void ce(long arg3) {
        long[] v0 = bc.az;
        int v1 = bc.am - 0x256F0E5A;
        bc.am = v1;
        v0[v1 * 0xA5FFDF6C - 1] = arg3;
    }

    public static int cf(int arg3) {
        return be.av(bc.az[arg3]);
    }

    static final boolean cg(int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int v1 = 1709601659;
        int v0 = bc.an * v1 + arg9;
        if(v0 < arg3 && v0 < arg4 && v0 < arg5) {
            return 0;
        }

        v0 = bc.an * v1 - arg9;
        if(v0 > arg3 && v0 > arg4 && v0 > arg5) {
            return 0;
        }

        arg4 = 0xB0766F17;
        arg3 = bc.ar * arg4 + arg9;
        if(arg3 < arg6 && arg3 < arg7 && arg3 < arg8) {
            return 0;
        }

        arg3 = bc.ar * arg4 - arg9;
        if(arg3 > arg6 && arg3 > arg7 && arg3 > arg8) {
            return 0;
        }

        return 1;
    }

    static final void ch(long arg3) {
        long[] v0 = bc.az;
        int v1 = bc.am - 0x1C87F475;
        bc.am = v1;
        v0[v1 * 0xB140C423 - 1] = arg3;
    }

    public static final void ci(int arg1, int arg2, boolean arg3) {
        bc.ar = arg1 * -1151092569;
        bc.an = arg2 * 854029235;
        bc.ae = arg3;
        bc.am = 0;
        bc.ap = false;
    }

    public static int cj(int arg3) {
        return be.av(bc.az[arg3]);
    }

    static final int ck() {
        return bc.ar * 981038472;
    }

    public static boolean cl(int arg2, int arg3) {
        boolean v2 = arg2 != bc.ar * 0xB0766F17 || arg3 != bc.an * 1709601659 ? false : true;
        return v2;
    }

    static final int cm() {
        return bc.ar * -900154001;
    }

    public static boolean cn(int arg2, int arg3) {
        boolean v2 = arg2 != bc.ar * 0xB0766F17 || arg3 != bc.an * 1709601659 ? false : true;
        return v2;
    }

    static final boolean co(int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int v0 = bc.an * 0x3E4C66FD + arg9;
        if(v0 < arg3 && v0 < arg4 && v0 < arg5) {
            return 0;
        }

        v0 = bc.an * 0x2F76B843 - arg9;
        if(v0 > arg3 && v0 > arg4 && v0 > arg5) {
            return 0;
        }

        arg4 = 0xB0766F17;
        arg3 = bc.ar * arg4 + arg9;
        if(arg3 < arg6 && arg3 < arg7 && arg3 < arg8) {
            return 0;
        }

        arg3 = bc.ar * arg4 - arg9;
        if(arg3 > arg6 && arg3 > arg7 && arg3 > arg8) {
            return 0;
        }

        return 1;
    }

    public static long cp(int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        long v4 = (((long)((arg4 & 0x7F) << 0 | (arg5 & 0x7F) << 7 | (arg6 & 3) << 14))) | ((((long)arg8)) & 0xFFFFFFFFL) << 17;
        if(arg7) {
            v4 |= 0x10000;
        }

        return v4;
    }

    static final void cq(bt arg14) {
        if(bc.ap) {
            return;
        }

        int v0 = bg.bd;
        int v1 = bg.ba;
        int v2 = bg.bf;
        int v3 = bg.bn;
        int v6 = (bc.ar * 0xB0766F17 - arg14.bw * 1126407459) * 50 / (arg14.bp * 574766503);
        int v8 = (bc.an * 1709601659 - arg14.bo * 0xF7F729AF) * 50 / (arg14.bp * 574766503);
        int v12 = (bc.ar * 0xB0766F17 - arg14.bw * 1126407459) * 3500 / (arg14.bp * 574766503);
        int v7 = (bc.an * 1709601659 - arg14.bo * 0xF7F729AF) * 3500 / (arg14.bp * 574766503);
        int v9 = jz.bj(v8, 50, v1, v0, 0x30);
        int v4 = if.bu(v8, 50, v1, v0, 0xFA2DD962);
        int v14 = jz.bj(v7, 3500, v1, v0, 0x30);
        v0 = if.bu(v7, 3500, v1, v0, -868072244);
        v1 = fq.bk(v6, v4, v3, v2, 0x31EB0E4C);
        v4 = bf.bm(v6, v4, v3, v2, -1591082004);
        v6 = fq.bk(v12, v0, v3, v2, 0x477E9835);
        v0 = bf.bm(v12, v0, v3, v2, -1591082004);
        bc.aj = (v1 + v6) / 2 * -1034352603;
        lr.ad = (v9 + v14) / 2 * 0x795FE1D5;
        pg.aq = (v4 + v0) / 2 * 0x1110E9D;
        ak.ab = (v6 - v1) / 2 * 0x812E083;
        ai.af = (v14 - v9) / 2 * -322205267;
        bd.ai = (v0 - v4) / 2 * 0x3032FFA7;
        io.av = Math.abs(ak.ab * 0x6F746E2B) * 0xA3C5F5A1;
        he.aa = Math.abs(ai.af * 0x3140C225) * 0xB150A979;
        bt.au = Math.abs(bd.ai * 1012774935) * 0x4FDBA5D1;
    }

    static final void cr(long arg3) {
        long[] v0 = bc.az;
        int v1 = bc.am + 0x464249D5;
        bc.am = v1;
        v0[v1 * 0xB140C423 - 1] = arg3;
    }

    static final void cs(ie arg7, int arg8) {
        try {
            int v0 = -2077001153;
            int v2 = 0x4E20F729;
            if(client.bj * v0 != arg7.dp * v2) {
                int v3 = 2011890317;
                if(-1 == arg7.ch * v3) {
                    goto label_30;
                }
                else if(arg7.cz * 0x3C37F003 != 0) {
                    goto label_30;
                }
                else if(arg7.cs * 0x52789105 + 1 > fs.al(arg7.ch * v3, 1304812425).ad[arg7.ce * 0x38617D1D]) {
                    goto label_30;
                }
            }
            else {
            label_30:
                arg8 = arg7.dp * v2 - arg7.dv * 0xF925C7C7;
                int v1 = client.bj * v0 - arg7.dv * 0xF925C7C7;
                v0 = arg7.cq * 0xFFBB6F80 + arg7.by * 0x346259C0;
                int v4 = arg7.cg * 0x5ED06380 + arg7.by * 0x346259C0;
                v2 = arg7.by * 0x346259C0 + arg7.cv * 0xF0B52A80;
                int v6 = arg7.co * 0xF67CF580 + arg7.by * 0x346259C0;
                int v5 = arg8 - v1;
                arg7.bp = (v2 * v1 + v0 * v5) / arg8 * 0x3CF9F82B;
                arg7.bw = (v4 * v5 + v6 * v1) / arg8 * -410326251;
            }

            arg7.dy = 0;
            arg7.du = arg7.dh * 0x3268BB5;
            arg7.bo = arg7.du * 0x9F972243;
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("bc.cs(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    static final boolean cs() {
        return bc.ae;
    }

    static final int ct() {
        return bc.an * 0xA0A38B58;
    }

    static final int cu() {
        return bc.an * 1709601659;
    }

    static final boolean cv(ca arg7, int arg8, int arg9, int arg10, bi arg11) {
        if(!bf.az(-69)) {
            return 0;
        }

        li.ay(arg11.bo, 1770328570);
        arg8 += arg7.bz;
        int v11 = arg7.bb + arg9;
        arg9 = arg7.bc + arg10;
        arg10 = arg7.bk;
        int v0 = arg7.bm;
        int v7 = arg7.bj;
        int v2 = bc.aj * 1240716205 - arg8;
        int v3 = lr.ad * 0x30864F7D - v11;
        v11 = pg.aq * 0xA69C3700 - arg9;
        int v4 = 0xABFB2E61;
        if(Math.abs(v2) > io.av * v4 + arg10) {
            return 0;
        }

        if(Math.abs(v3) > he.aa * 0x9CDC90B1 + v0) {
            return 0;
        }

        if(Math.abs(v11) > bt.au * 0xA8FD600C + v7) {
            return 0;
        }

        if(Math.abs(ai.af * 0x3140C225 * v11 - bd.ai * 0x954E0F97 * v3) > he.aa * -2032854047 * v7 + bt.au * -87731029 * v0) {
            return 0;
        }

        if(Math.abs(bd.ai * 1012774935 * v2 - ak.ab * -2038116790 * v11) > v7 * (io.av * 0xCFB04DC) + bt.au * 690672433 * arg10) {
            return 0;
        }

        if(Math.abs(ak.ab * 1876400589 * v3 - ai.af * 1106014863 * v2) > io.av * v4 * v0 + he.aa * 0x2E3670C9 * arg10) {
            return 0;
        }

        return 1;
    }

    public static long cw(int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        long v4 = (((long)((arg4 & 0x7F) << 0 | (arg5 & 0x7F) << 7 | (arg6 & 3) << 14))) | ((((long)arg8)) & 0xFFFFFFFFL) << 17;
        if(arg7) {
            v4 |= 0x10000;
        }

        return v4;
    }

    public static int cx(int arg3) {
        return be.av(bc.az[arg3]);
    }

    public static int cy(long arg2) {
        return ((int)(arg2 >>> 17 & 0xFFFFFFFFL));
    }

    static final boolean cz() {
        return bc.ae;
    }

    public static final boolean gk(int arg3, int arg4, int arg5) {
        arg5 = 0x64D7CF4D;
        try {
            ar v0 = bl.al(arg3, arg5);
            if(!kd.aj(ib.il(v0, 0xCCBE69F6), -1429480498)) {
                if(gn.ad(ib.il(v0, 0xA59ACEA4), 2002832733)) {
                }
                else {
                    return 0;
                }
            }

            client.ji = false;
            client.jb = 0;
            if(cd.im != null) {
                kx.gw(cd.im, 0x7FE12246);
            }

            cd.im = bl.al(arg3, arg5);
            client.jc = arg4 * 0xAE473F75;
            client.jx = dt.bu.ap[0] * -1542205091;
            client.jh = dt.bu.aj[0] * 0xF8A7DED5;
            kx.gw(cd.im, 0x7F30CE47);
            return 1;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("bc.gk(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

