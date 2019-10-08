public class np {
    public static final int ae = 1;
    public static final int al = 0;
    public static final int an = 5;
    public static final int ar = 2;
    public static final int ax = 8;
    static int pv;

    np() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("np.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static dz[] al(int arg2) {
        arg2 = 3;
        try {
            dz[] v2_1 = new dz[arg2];
            v2_1[0] = dz.ae;
            v2_1[1] = dz.al;
            v2_1[2] = dz.ax;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("np.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }
}

