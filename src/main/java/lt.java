public class lt {
    static final lt ae;
    static final lt al;
    static final lt ax;

    static {
        lt.ax = new lt();
        lt.al = new lt();
        lt.ae = new lt();
    }

    lt() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("lt.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void ae(es arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            cc.aj.ar(arg1, aw.ax(arg2, arg3, arg4, 2), arg1.ax.length * 4);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("lt.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static final void am(long arg3) {
        try {
            long[] v0 = bc.az;
            int v1 = bc.am - 0x1C87F475;
            bc.am = v1;
            v0[v1 * 0xB140C423 - 1] = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("lt.am(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

