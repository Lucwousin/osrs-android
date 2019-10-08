public class le implements lv {
    static final long ad = -3932672073523589310L;
    public static final int ao = 25;
    public static final int ar = 3;

    public le() {
        super();
    }

    public void al() {
        ah v0 = client.al.aba(0x40A4906D).bh(0x56ACE467);
        if(v0 != null) {
            v0.ah("npR101", 0x7F3ACF21);
        }
    }

    public static boolean ax(int arg0, int arg1) {
        boolean v0 = 10 == arg0 || 11 == arg0 || 12 == arg0 || arg0 == 13 || 14 == arg0 || 15 == arg0 || 16 == arg0 || arg0 == 17 ? true : false;
        return v0;
    }

    public void ax(int arg3) {
        try {
            ah v3_1 = client.al.aba(1789821560).bh(1740935866);
            if(v3_1 != null) {
                v3_1.ah("npR101", 0x7FF66284);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("le.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static boolean di(byte arg2) {
        try {
            if((client.jy * 0x2324F123 & 2) == 0) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("le.di(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }

    static void iq(byte arg2) {
        try {
            if(client.hr * 158061037 == 1) {
                client.hj = true;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("le.iq(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }
}

