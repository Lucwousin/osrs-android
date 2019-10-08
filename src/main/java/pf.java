public class pf {
    static final pf ae;
    public static final pf al;
    public final int ar;
    static final pf ax;

    static {
        pf.ax = new pf(0);
        pf.al = new pf(1);
        pf.ae = new pf(2);
    }

    pf(int arg3) {
        try {
            super();
            this.ar = arg3 * -241708385;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("pf.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static pf[] ae() {
        return new pf[]{pf.al, pf.ax, pf.ae};
    }

    public static pf an(int arg5) {
        pf[] v0 = ck.ax(0xA313CBC1);
        int v1;
        for(v1 = 0; v1 < v0.length; ++v1) {
            pf v2 = v0[v1];
            if(arg5 == v2.ar * 0x9176C95F) {
                return v2;
            }
        }

        return null;
    }

    public static pf ap(int arg5) {
        pf[] v0 = ck.ax(0xA313CBC1);
        int v1;
        for(v1 = 0; v1 < v0.length; ++v1) {
            pf v2 = v0[v1];
            if(arg5 == v2.ar * 0x9176C95F) {
                return v2;
            }
        }

        return null;
    }

    static pf[] ar() {
        return new pf[]{pf.al, pf.ax, pf.ae};
    }
}

