public class kd extends mv {
    byte ae;
    int al;
    ki ax;
    public static final int az = 0x40;
    static byte[][] fg;

    kd() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("kd.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static boolean aj(int arg0, int arg1) {
        boolean v1 = true;
        if((arg0 >> 28 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }
}

