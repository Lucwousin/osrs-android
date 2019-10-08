public final class ac {
    static ml ad = null;
    int ae;
    public static final int af = 3;
    int aj;
    int al;
    protected static final String am = "public";
    int an;
    boolean ap;
    int ar;
    int ax;
    static int mq;

    ac(int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        try {
            super();
            this.ap = true;
            this.ax = arg2 * 0x8D0A47AF;
            this.al = arg3 * 0xBBDF834B;
            this.ae = arg4 * 0x4C33B83B;
            this.ar = arg5 * 0xC9E7D4FD;
            this.an = arg6 * 0xF7640B17;
            this.aj = arg7 * 306107387;
            this.ap = arg8;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ac.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static hl ae(int arg3, int arg4, byte arg5) {
        hl v5;
        try {
            long v0 = ((long)(arg3 << 16));
            mv v4 = hl.ax.ax(v0);
            if(v4 != null) {
                return ((hl)v4);
            }

            arg3 = ih.dm.ay(String.valueOf(arg3), 0xD4A3E869);
            v5 = null;
            if(arg3 == -1) {
                return v5;
            }

            byte[] v3_1 = ih.dm.ab(arg3, 0x73CB4BF0);
            if(v3_1 != null) {
                if(v3_1.length <= 1) {
                    return v5;
                }
                else {
                    hl v3_2 = ap.ar(v3_1, 5);
                    if(v3_2 != null) {
                        hl.ax.ae(((mv)v3_2), v0);
                        return v3_2;
                    }
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("ac.ae(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }

        return v5;
    }

    static final void ai(hz arg1, byte arg2) {
        try {
            arg1.ah = false;
            if(arg1.ag != null) {
                arg1.ag.ax = 0;
            }

            hz v2;
            for(v2 = arg1.ap(); v2 != null; v2 = arg1.aj()) {
                ac.ai(v2, -59);
            }
        }
        catch(RuntimeException v1) {
            goto label_15;
        }

        return;
    label_15:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("ac.ai(");
        v2_1.append(')');
        throw lx.al(((Throwable)v1), v2_1.toString());
    }

    static ef[] au(short arg5) {
        try {
            int v0 = 43536109;
            ef[] v5_1 = new ef[oi.ax * v0];
            dt.as(1934410955);
            int v1;
            for(v1 = 0; v1 < oi.ax * v0; ++v1) {
                ef v2 = new ef();
                v5_1[v1] = v2;
                v2.aj = fe.al * 0x1AA9C99F;
                v2.ad = fe.ae * 0x5EBF2449;
                v2.an = fe.ar[v1];
                v2.ap = lk.an[v1];
                v2.ae = fe.ap[v1];
                v2.ar = gu.aj[v1];
                v2.al = jw.ad;
                v2.ax = nq.aq[v1];
            }

            ey.ao(0xA8E4CF44);
            return v5_1;
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ac.au(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }
    }
}

