import java.util.Comparator;

public class jm implements Comparator {
    public static final int ae = 4;
    public static final int ap = 5;
    static final int ar = 88;
    final boolean ax;

    public jm(boolean arg3) {
        try {
            super();
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jm.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ax(((eg)arg2), ((eg)arg3), -350003195);
    }

    int ae(eg arg3, eg arg4) {
        int v3 = this.ax ? arg3.ap(0).ae(arg4.ap(0), -47) : arg4.ap(0).ae(arg3.ap(0), -24);
        return v3;
    }

    static int al(int arg2, int arg3, byte arg4) {
        try {
            mx v2_1 = jb.ax.ax(((long)arg2));
            if(v2_1 == null) {
                return 0;
            }

            if(arg3 >= 0) {
                if(arg3 >= ((jb)v2_1).ae.length) {
                }
                else {
                    return ((jb)v2_1).ae[arg3];
                }
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jm.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return 0;
    }

    int al(eg arg3, eg arg4) {
        int v3 = this.ax ? arg3.ap(0).ae(arg4.ap(0), -113) : arg4.ap(0).ae(arg3.ap(0), -66);
        return v3;
    }

    int an(eg arg3, eg arg4) {
        int v3 = this.ax ? arg3.ap(0).ae(arg4.ap(0), -90) : arg4.ap(0).ae(arg3.ap(0), -34);
        return v3;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ax(((eg)arg2), ((eg)arg3), -350003195);
    }

    int ar(eg arg3, eg arg4) {
        int v3 = this.ax ? arg3.ap(0).ae(arg4.ap(0), -23) : arg4.ap(0).ae(arg3.ap(0), -1);
        return v3;
    }

    int ax(eg arg2, eg arg3, int arg4) {
        int v2_1;
        try {
            v2_1 = this.ax ? arg2.ap(0).ae(arg3.ap(0), -23) : arg3.ap(0).ae(arg2.ap(0), -46);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jm.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return v2_1;
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ax(((eg)arg2), ((eg)arg3), -350003195);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jm.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean equals(Object arg3) {
        try {
            return super.equals(arg3);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jm.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static boolean gx(int arg2) {
        boolean v2_1;
        arg2 = 0xBC5D96B5;
        try {
            int v0 = client.kd * arg2;
            v2_1 = true;
            if(1 != v0) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("jm.gx(");
            v0_1.append(')');
            throw lx.al(((Throwable)v2), v0_1.toString());
        }

        return v2_1;
    }

    public boolean hd(Object arg1) {
        return super.equals(arg1);
    }

    public boolean hh(Object arg1) {
        return super.equals(arg1);
    }
}

