public class dv {
    public static final dv ae = null;
    public static final dv al = null;
    public static final dv an = null;
    public final String ap;
    static final dv ar = null;
    public static final int at = 22;
    public static final dv ax = null;
    public static final int by = 3;

    static {
        dv.ax = new dv("details");
        dv.al = new dv("compositemap");
        dv.ae = new dv("compositetexture");
        dv.ar = new dv("area");
        dv.an = new dv("labels");
    }

    dv(String arg3) {
        try {
            super();
            this.ap = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dv.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static boolean bg(int arg1, byte arg2) {
        try {
            if(client.al.aba(0xFC9196AB).gg(18)) {
                return 0;
            }

            hq.cm = 0xCE2F9FA1;
            hq.da = arg1 * -633703253;
            return 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dv.bg(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return 0;
    }

    static void bs(int arg3) {
        arg3 = 2112702648;
        try {
            hq.cm = arg3;
            ax.bf(gs.lp, gs.lh, gs.ly, 0x63D3C206);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dv.bs(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static int by(int arg0, hl arg1, boolean arg2, int arg3) {
        if(5630 == arg0) {
            arg0 = 0xDDCA1B82;
            try {
                client.ei = arg0;
                return 1;
            }
            catch(RuntimeException v0) {
                StringBuilder v1 = new StringBuilder();
                v1.append("dv.by(");
                v1.append(')');
                throw lx.al(((Throwable)v0), v1.toString());
            }
        }

        return 2;
    }

    static final int dl(int arg6) {
        try {
            int v0 = 1101813865;
            if(li.rg.ae) {
                return kt.jz * v0;
            }

            int v1 = 0x594485D5;
            int v3 = -1102211305;
            if(fj.ez(ag.hc * v1, fg.hb * v3, kt.jz * v0, 0x7640D11A) - bu.hi * 0x92B48CBF < 800 && (id.al[kt.jz * v0][ag.hc * v1 >> 7][fg.hb * v3 >> 7] & 4) != 0) {
                return kt.jz * v0;
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dv.dl(");
            v0_1.append(')');
            throw lx.al(((Throwable)v6), v0_1.toString());
        }

        return 3;
    }
}

