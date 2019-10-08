public final class ob {
    static final int aj = 30;
    static long al = 0;
    static final int an = 3;
    public static final int ar = 8;
    static long ax = 0;
    public static final int bv = 0x30;
    public static final int bz = 41;

    ob() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ob.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static final long ae() {
        long v3;
        long v1_1;
        Class v0 = ob.class;
        __monitor_enter(v0);
        try {
            v1_1 = System.currentTimeMillis();
            long v5 = 0x25EFA7F8D6988F29L;
            if(v1_1 < ob.ax * v5) {
                ob.al += (ob.ax * v5 - v1_1) * 0x761075C0792E97DL;
            }

            ob.ax = -6008543133988848359L * v1_1;
            v3 = ob.al;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v3 * -2580371375929190443L + v1_1;
    }

    public static final long al() {
        long v3;
        long v1_1;
        Class v0 = ob.class;
        __monitor_enter(v0);
        try {
            v1_1 = System.currentTimeMillis();
            long v5 = 0x25EFA7F8D6988F29L;
            if(v1_1 < ob.ax * v5) {
                ob.al += (ob.ax * v5 - v1_1) * 0x761075C0792E97DL;
            }

            ob.ax = -6008543133988848359L * v1_1;
            v3 = ob.al;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v3 * -2580371375929190443L + v1_1;
    }
}

