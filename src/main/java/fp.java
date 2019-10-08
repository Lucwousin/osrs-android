public class fp {
    static final int ac = 0x20;
    public static final int ae = 3;
    public static final int af = 11;
    public static final int ai = 12;
    public static final int aj = 7;
    public static final int al = 2;
    public static final int am = 16;
    public static final int an = 5;
    public static final int aq = 9;
    public static final int ar = 13;
    public static final int au = 15;
    public static final int av = 13;
    public static final int ax = 1;
    static final int[] ch;
    static int[] fw;

    static {
        fp.ch = new int[]{16, 17, 18, 19, 20, 21, 22, 1, 2, 3, 4, 5, 6, 1001, 7, 8, 9, 10, 11, 12, 13, 14, 15, 44, 45, 46, 0x2F, 0x30, 49, 50, 51, 1002, 1004, 1003};
    }

    fp() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fp.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static boolean ae(int arg4) {
        int[] v0 = fp.ch;
        int v2;
        for(v2 = 0; v2 < v0.length; ++v2) {
            if(arg4 == v0[v2]) {
                return 1;
            }
        }

        return 0;
    }

    static final boolean al(char arg4, byte arg5) {
        try {
            if(Character.isISOControl(arg4)) {
                return 0;
            }

            if(ev.aa(arg4, 0x1A152661)) {
                return 1;
            }

            char[] v5 = mf.ae;
            int v2;
            for(v2 = 0; v2 < v5.length; ++v2) {
                if(arg4 == v5[v2]) {
                    return 1;
                }
            }

            v5 = mf.ar;
            v2 = 0;
            while(true) {
            label_20:
                if(v2 >= v5.length) {
                    return 0;
                }

                if(v5[v2] != arg4) {
                    goto label_25;
                }

                return 1;
            }
        }
        catch(RuntimeException v4) {
            goto label_30;
        }

        return 1;
    label_25:
        ++v2;
        goto label_20;
        return 0;
    label_30:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("fp.al(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }

    static boolean al(int arg4) {
        int[] v0 = fp.ch;
        int v2;
        for(v2 = 0; v2 < v0.length; ++v2) {
            if(arg4 == v0[v2]) {
                return 1;
            }
        }

        return 0;
    }

    public static void gd(int arg0, ar arg1, byte arg2) {
        arg0 *= -932680643;
        try {
            client.jk = arg0;
            mq.iu = arg1;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fp.gd(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

