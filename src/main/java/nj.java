public class nj {
    public static final int ae = 12;
    public static final int al = 11;
    public static final int ax = 10;

    nj() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("nj.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static boolean ae(int arg1) {
        boolean v1 = 10 == arg1 || 11 == arg1 || 12 == arg1 || arg1 == 13 || 14 == arg1 || 15 == arg1 || 16 == arg1 || arg1 == 17 ? true : false;
        return v1;
    }

    public static boolean al(int arg1) {
        boolean v1 = 10 == arg1 || 11 == arg1 || 12 == arg1 || arg1 == 13 || 14 == arg1 || 15 == arg1 || 16 == arg1 || arg1 == 17 ? true : false;
        return v1;
    }
}

