public class cu {
    final int ae;
    public static final int aj = 6;
    static final cu al = null;
    static final int ao = 100;
    public static final int au = 16;
    static final cu ax;

    static {
        cu.ax = new cu(0);
        cu.al = new cu(1);
    }

    cu(int arg3) {
        try {
            super();
            this.ae = arg3 * 432085505;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cu.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static void al(int arg2) {
        try {
            mx v2_1;
            for(v2_1 = iq.ax.aj(); v2_1 != null; v2_1 = iq.ax.aq()) {
                if(((iq)v2_1).au != null) {
                    ((iq)v2_1).ae(0x9C77EB09);
                }
            }
        }
        catch(RuntimeException v2) {
            goto label_13;
        }

        return;
    label_13:
        StringBuilder v0 = new StringBuilder();
        v0.append("cu.al(");
        v0.append(')');
        throw lx.al(((Throwable)v2), v0.toString());
    }

    public static dj al(int arg4, byte arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dj.al.ax(v0);
            if(v5 != null) {
                return ((dj)v5);
            }

            byte[] v4_1 = dj.ax.ae(19, arg4, 0x78DC0DC9);
            dj v5_1 = new dj();
            if(v4_1 != null) {
                v5_1.ae(new lq(v4_1), -648906787);
            }

            dj.al.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("cu.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    public static dk al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dk.al.ax(v0);
            if(v5 != null) {
                return ((dk)v5);
            }

            byte[] v4_1 = dk.ax.ae(5, arg4, 0x78DC0DC9);
            dk v5_1 = new dk();
            if(v4_1 != null) {
                v5_1.ae(new lq(v4_1), 2117749026);
            }

            dk.al.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("cu.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    static int ap(ih arg0, ih arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        int v0_1;
        arg6 = -2085731260;
        try {
            arg2 = kt.aj(arg0, arg1, arg2, arg3, arg6);
            if(arg2 != 0) {
                if(arg3) {
                    return -arg2;
                }

                return arg2;
            }

            if(-1 == arg4) {
                return 0;
            }

            v0_1 = kt.aj(arg0, arg1, arg4, arg5, arg6);
            if(!arg5) {
                return v0_1;
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cu.ap(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }

        return -v0_1;
    }
}

