public abstract class gx {
    public static final int ab = 12;
    public int ae;
    static final String af = "No Internet connection available. Please check your settings.";
    public int al;
    static final int an = 16;
    static final int aq = 10;
    public int ar;
    public int ax;

    protected gx() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gx.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    protected abstract boolean ae(int arg1, int arg2, int arg3, gy arg4);

    protected abstract boolean al(int arg1, int arg2, int arg3, gy arg4);

    public static final void au(int arg0, int arg1, boolean arg2, byte arg3) {
        arg0 *= -1151092569;
        try {
            bc.ar = arg0;
            bc.an = arg1 * 854029235;
            bc.ae = arg2;
            bc.am = 0;
            bc.ap = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gx.au(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    protected abstract boolean ax(int arg1, int arg2, int arg3, gy arg4, byte arg5);

    static void bq(fa arg10, int arg11) {
        try {
            int v8 = 0x4D586FC3;
            int v9 = hq.ab * v8 - (ox.ag.al - 0x17F);
            if(v9 > 0) {
                arg10.at(ox.ag, 0, 0, ox.ag.al * 2, ox.ag.ae * 2, 0x4390813B);
                arg10.at(hq.ah, arg10.al * -107049639 - hq.ah.al * 2, 0, hq.ah.al * 2, hq.ah.ae * 2, 0x4390813B);
            }

            arg10.aa(ox.ag, v9, 0, 25);
            arg10.aa(hq.ah, hq.ab * v8 + 382, 0, 25);
            arg10.ag(gn.at, hq.ab * v8 + 382 - gn.at.ae / 2 - gn.at.an, 89 - gn.at.ar / 2, 1);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gx.bq(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final void gq(int arg1, byte arg2) {
        int v2 = 0x971A2519;
        try {
            if(!mr.ar(arg1, v2)) {
                return;
            }

            ai.gv(ar.aj[arg1], -1, -1394170549);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("gx.gq(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }
}

