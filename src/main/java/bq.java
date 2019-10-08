public final class bq extends mx {
    int aa;
    ak ab;
    bw ad;
    int ae;
    int af;
    boolean ag;
    int ah;
    cd[] ai;
    bp aj;
    int al;
    boolean am;
    ac an;
    bq ao;
    bn ap;
    bs aq;
    int ar;
    int at;
    int au;
    int[] av;
    int aw;
    int ax;
    int ay;
    boolean az;
    static final int cw = 22;

    bq(int arg3, int arg4, int arg5) {
        try {
            super();
            this.ai = new cd[5];
            this.av = new int[5];
            this.aa = 0;
            arg3 *= 0x10AA79ED;
            this.ax = arg3;
            this.ar = arg3 * 0x9B242AD5;
            this.al = arg4 * 0x902D73F9;
            this.ae = arg5 * 0x20AA0233;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("bq.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    static int al(oc arg2, int arg3, int arg4, byte arg5) {
        if(arg2 == null) {
            return arg4;
        }

        long v0 = ((long)arg3);
        try {
            mx v2_1 = arg2.ax(v0);
            if(v2_1 == null) {
                return arg4;
            }

            return ((mo)v2_1).ax;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bq.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static boolean dn(int arg2) {
        arg2 = 0x2324F123;
        try {
            if((client.jy * arg2 & 4) == 0) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bq.dn(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }
}

