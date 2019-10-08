public class hv extends mx {
    int ae;
    static int[] aj = null;
    int al;
    public static final int ap = 5;
    int ar;
    int ax;
    public static final int bj = 0x2F;
    static float ri;

    hv(int arg2, int arg3, int arg4, int arg5) {
        try {
            super();
            this.ax = arg2 * 0x6188CCE3;
            this.al = arg3 * 0xDC3100A3;
            this.ae = arg4 * 1666395049;
            this.ar = arg5 * 0x2AB59595;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("hv.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void ae(int arg2, int arg3, int arg4, int arg5) {
        this.ax = arg2 * 0x6188CCE3;
        this.al = arg3 * 0xDC3100A3;
        this.ae = arg4 * 1666395049;
        this.ar = arg5 * 0x2AB59595;
    }

    void al(int arg2, int arg3, int arg4, int arg5) {
        this.ax = arg2 * 0x6188CCE3;
        this.al = arg3 * 0xDC3100A3;
        this.ae = arg4 * 1666395049;
        this.ar = arg5 * 0x2AB59595;
    }

    void ar(int arg2, int arg3, int arg4, int arg5) {
        this.ax = arg2 * 0x3A1616B7;
        this.al = arg3 * 1201769080;
        this.ae = arg4 * 1666395049;
        this.ar = arg5 * 0x2AB59595;
    }

    void ax(int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1 *= 0x6188CCE3;
        try {
            this.ax = arg1;
            this.al = arg2 * 0xDC3100A3;
            this.ae = arg3 * 1666395049;
            this.ar = arg4 * 0x2AB59595;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("hv.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static boolean br(int arg0, int arg1) {
        boolean v0 = arg0 == 57 || arg0 == 58 || 1007 == arg0 || 25 == arg0 || 30 == arg0 ? true : false;
        return v0;
    }
}

