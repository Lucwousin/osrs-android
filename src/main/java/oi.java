public class oi {
    static final String al = "services";
    public static int ar = 0;
    static int ax = 0;
    public static final int bq = 49;

    oi() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("oi.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static double[] ab(double arg9, double arg11, int arg13) {
        double[] v0 = new double[arg13 * 2 + 1];
        int v1 = -arg13;
        int v2;
        for(v2 = 0; v1 <= arg13; ++v2) {
            v0[v2] = mz.al(((double)v1), arg9, arg11);
            ++v1;
        }

        return v0;
    }

    static double ad(double arg0, double arg2, double arg4) {
        return bi.ax((arg0 - arg2) / arg4) / arg4;
    }

    static double aj(double arg2) {
        return Math.exp(-arg2 * arg2 / 2) / Math.sqrt(6.283185);
    }

    static double an(double arg2) {
        return Math.exp(-arg2 * arg2 / 2) / Math.sqrt(6.283185);
    }

    static double ap(double arg2) {
        return Math.exp(-arg2 * arg2 / 2) / Math.sqrt(6.283185);
    }

    public static double[] aq(double arg9, double arg11, int arg13) {
        double[] v0 = new double[arg13 * 2 + 1];
        int v1 = -arg13;
        int v2;
        for(v2 = 0; v1 <= arg13; ++v2) {
            v0[v2] = mz.al(((double)v1), arg9, arg11);
            ++v1;
        }

        return v0;
    }

    static double ar(double arg2) {
        return Math.exp(-arg2 * arg2 / 2) / Math.sqrt(6.283185);
    }
}

