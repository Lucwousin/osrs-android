public class au {
    public static final au ae = null;
    public static final au al = null;
    public static final int am = 0x3F;
    int an;
    public static final au ar;
    static final au ax;
    static int iz;

    static {
        au.ax = new au(-1);
        au.al = new au(0);
        au.ae = new au(1);
        au.ar = new au(2);
    }

    au(int arg3) {
        try {
            super();
            this.an = -1397390361;
            this.an = arg3 * 1397390361;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("au.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ae() {
        return this.an * -1945601058;
    }

    public static ez al(int arg4, byte arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = ez.ae.ax(v0);
            if(v5 != null) {
                return ((ez)v5);
            }

            byte[] v5_1 = ez.ax.ae(9, arg4, 0x78DC0DC9);
            ez v2 = new ez();
            v2.an = arg4 * 0x4F1486E1;
            if(v5_1 != null) {
                v2.ar(new lq(v5_1), 1000);
            }

            v2.ae(4);
            ez.ae.ae(((mv)v2), v0);
            return v2;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("au.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    public static cf[] al(int arg2) {
        arg2 = 3;
        try {
            cf[] v2_1 = new cf[arg2];
            v2_1[0] = cf.ax;
            v2_1[1] = cf.al;
            v2_1[2] = cf.ae;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("au.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    int al() {
        return this.an * 0x37E72029;
    }

    int ar() {
        return this.an * 0x37E72029;
    }

    static boolean at(ko arg0, int arg1, int arg2, int arg3) {
        arg3 = 0x78DC0DC9;
        try {
            byte[] v0_1 = arg0.ae(arg1, arg2, arg3);
            if(v0_1 == null) {
                return 0;
            }

            dy.aw(v0_1, 1718126903);
            return 1;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("au.at(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static es[] av(ko arg0, int arg1, int arg2) {
        byte v2 = -1;
        try {
            if(!jp.ay(arg0, arg1, v2)) {
                return null;
            }

            return dq.az(1284707433);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("au.av(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    int ax(int arg3) {
        arg3 = 0x37E72029;
        try {
            return this.an * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("au.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static int ax(int arg0, int arg1, int arg2) {
        return (arg0 << 8) + arg1;
    }
}

