public class ji {
    int[] ae;
    int al;
    String[] ar;
    hl ax;
    static final int by = 7;

    ji() {
        try {
            super();
            this.al = 0xD0A723FB;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ji.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ab(int arg6) {
        try {
            while(true) {
                kj v6_1 = kf.ax.af(-87);
                if(v6_1 == null) {
                    return;
                }

                v6_1.ar.do(v6_1.ae, ((int)v6_1.gx), v6_1.al, false, 0x1EF);
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ji.ab(");
            v0.append(')');
            throw lx.al(((Throwable)v6), v0.toString());
        }
    }

    public static void ap(int arg2) {
        try {
            mm.af.ax(1381017015);
            for(arg2 = 0; arg2 < et.an * 0xD32FA4FD; ++arg2) {
                mm.av[arg2].ax(0x236E478C);
            }

            mm.ai.ax(0x5C4376E5);
            mm.ab.ax(0x4C7CB9FF);
            mm.af = null;
            mm.av = null;
            mm.ai = null;
            mm.ab = null;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ji.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
        catch(Exception ) {
            return;
        }
    }

    public static final long ax(int arg8) {
        long v2;
        long v0_2;
        Class v8 = ji.class;
        __monitor_enter(v8);
        try {
            v0_2 = System.currentTimeMillis();
            long v4 = 0x25EFA7F8D6988F29L;
            if(v0_2 < ob.ax * v4) {
                ob.al += (ob.ax * v4 - v0_2) * 0x761075C0792E97DL;
            }

            ob.ax = -6008543133988848359L * v0_2;
            v2 = ob.al;
        }
        catch(Throwable v0) {
        }
        catch(RuntimeException v0_1) {
            try {
                StringBuilder v1 = new StringBuilder();
                v1.append("ji.ax(");
                v1.append(')');
                throw lx.al(((Throwable)v0_1), v1.toString());
            }
            catch(Throwable v0) {
                __monitor_exit(v8);
                throw v0;
            }
        }

        __monitor_exit(v8);
        return v2 * -2580371375929190443L + v0_2;
    }
}

