public class jp implements Comparable {
    int ax;

    jp(int arg2, String arg3) {
        try {
            super();
            this.ax = arg2 * -707502389;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jp.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int ad(Object arg2) {
        return this.ax(((jp)arg2), 21);
    }

    int ae(jp arg3) {
        return this.ax * 0xDCF96E3 - arg3.ax * 0xDCF96E3;
    }

    public int aj(Object arg2) {
        return this.ax(((jp)arg2), 41);
    }

    int al(jp arg3) {
        return this.ax * 0xDCF96E3 - arg3.ax * 0xDCF96E3;
    }

    public static String an(CharSequence arg1, int arg2) {
        String v1_1;
        arg2 = 0xA3294552;
        try {
            v1_1 = jx.ae(cb.ax(arg1, arg2));
            if(v1_1 == null) {
                v1_1 = "";
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("jp.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return v1_1;
    }

    int ax(jp arg2, byte arg3) {
        try {
            return this.ax * 0xDCF96E3 - arg2.ax * 0xDCF96E3;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jp.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static boolean ay(ko arg0, int arg1, byte arg2) {
        int v2 = 1093953397;
        try {
            byte[] v0_1 = arg0.ab(arg1, v2);
            if(v0_1 == null) {
                return 0;
            }

            dy.aw(v0_1, 0x5F21A931);
            return 1;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jp.ay(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int compareTo(Object arg3) {
        try {
            return this.ax(((jp)arg3), 38);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jp.compareTo(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

