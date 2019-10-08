public class an {
    public static int[] ae = null;
    public static int[] al = null;
    static int[] ax = null;
    public static final int by = 35;
    static final int ef = 0x80;
    static final int kk = 1;

    static {
        int v0 = 0x20;
        an.ax = new int[v0];
        int v1 = 2;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            an.ax[v2] = v1 - 1;
            v1 += v1;
        }

        an.al = new int[4000];
        an.ae = new int[4000];
    }

    an() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("an.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ad(int arg5, int arg6) {
        di v5 = bx.al(arg5, 1204437574);
        int v0 = v5.ae * 0x55B90C31;
        int v1 = v5.ar * 2086445338;
        arg5 = an.ax[v5.an * -1720104143 - v1] << v1;
        an.ae[v0] = arg5 & 0 << v1 | an.ae[v0] & ~arg5;
    }

    public static int ae(int arg3) {
        di v3 = bx.al(arg3, 0x389A12A6);
        int v0 = v3.ae * 0xA3EB6A25;
        int v1 = v3.ar * 0xF880F3E5;
        return an.ax[v3.an * -2086968989 - v1] & an.ae[v0] >> v1;
    }

    public static int aj(int arg3) {
        di v3 = bx.al(arg3, 0x348A3609);
        int v1 = v3.ae * 0xBF544EB7;
        int v0 = v3.ar * 0xF880F3E5;
        return an.ax[v3.an * -2086968989 - v0] & an.ae[v1] >> v0;
    }

    public static int an(int arg3) {
        di v3 = bx.al(arg3, 0x55EDE27E);
        int v1 = v3.ae * 0xBF544EB7;
        int v0 = v3.ar * 0xDDA9EFF6;
        return an.ax[v3.an * -2086968989 - v0] & an.ae[v1] >> v0;
    }

    public static int ap(int arg3) {
        di v3 = bx.al(arg3, 0x6932E02A);
        int v1 = v3.ae * 0xBF544EB7;
        int v0 = v3.ar * 0xDD415DF4;
        return an.ax[v3.an * 0x2D9442CF - v0] & an.ae[v1] >> v0;
    }

    public static int ar(int arg3) {
        di v3 = bx.al(arg3, 0x375243D1);
        int v1 = v3.ae * 0x9F086D5C;
        int v0 = v3.ar * 0x998FC10E;
        return an.ax[v3.an * 0x7E1D7C1D - v0] & an.ae[v1] >> v0;
    }
}

