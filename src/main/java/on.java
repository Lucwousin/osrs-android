public class on {
    static final int[] ab = null;
    public static final int ad = 0x600;
    public static final int ae = 0x100;
    static final int[] af = null;
    public static final int al = 0x10000;
    public static final int an = 0x300;
    public static final int ar = 0x200;
    static final int aw = 1;
    static final int ax = 0x800;

    static {
        int v0 = 0x800;
        on.ab = new int[v0];
        on.af = new int[v0];
        double v1 = 0.003068;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            double v5 = (((double)v3)) * v1;
            on.ab[v3] = ((int)(Math.sin(v5) * 65536));
            on.af[v3] = ((int)(Math.cos(v5) * 65536));
        }
    }

    on() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("on.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

