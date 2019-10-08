public class dx {
    static final int ae = 480;
    static ef ao = null;
    public static final int au = 7;
    static final int ba = 1;
    public static final int bo = 34;
    public static nb rj;

    dx() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dx.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static String ab(oc arg2, int arg3, String arg4) {
        if(arg2 == null) {
            return arg4;
        }

        mx v2 = arg2.ax(((long)arg3));
        if(v2 == null) {
            return arg4;
        }

        return ((mi)v2).ax;
    }

    static int ad(oc arg2, int arg3, int arg4) {
        if(arg2 == null) {
            return arg4;
        }

        mx v2 = arg2.ax(((long)arg3));
        if(v2 == null) {
            return arg4;
        }

        return ((mo)v2).ax;
    }

    static String af(oc arg2, int arg3, String arg4) {
        if(arg2 == null) {
            return arg4;
        }

        mx v2 = arg2.ax(((long)arg3));
        if(v2 == null) {
            return arg4;
        }

        return ((mi)v2).ax;
    }

    static final oc aj(lq arg7, oc arg8) {
        mi v4_1;
        int v0 = arg7.ay(-93);
        if(arg8 == null) {
            arg8 = new oc(fa.ae(v0, 0x22409029));
        }

        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v4 = 1;
            if(arg7.ay(-36) == 1) {
            }
            else {
                v4 = 0;
            }

            int v3 = arg7.ak(0x1F530E0);
            if(v4 != 0) {
                v4_1 = new mi(arg7.bn(24));
            }
            else {
                mo v4_2 = new mo(arg7.ac(71));
            }

            arg8.al(((mx)v4_1), ((long)v3));
        }

        return arg8;
    }

    static hl al(int arg0, int arg1, int arg2, short arg3) {
        hl v0_1;
        int v3 = 0x78FB5CB2;
        try {
            hl v1 = ac.ae(au.ax(arg1, arg0, v3), arg0, 16);
            if(v1 != null) {
                return v1;
            }

            v0_1 = ac.ae(dj.al(arg2, arg0, 0x4A90AB9), arg0, -39);
            if(v0_1 == null) {
                return null;
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("dx.al(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }

        return v0_1;
    }

    static final oc an(lq arg7, oc arg8) {
        mo v4_2;
        int v0 = arg7.ay(-71);
        if(arg8 == null) {
            arg8 = new oc(fa.ae(v0, 0x80620C33));
        }

        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v4 = 1;
            if(arg7.ay(-69) == 1) {
            }
            else {
                v4 = 0;
            }

            int v3 = arg7.ak(0x9862BB95);
            if(v4 != 0) {
                mi v4_1 = new mi(arg7.bn(4));
            }
            else {
                v4_2 = new mo(arg7.ac(62));
            }

            arg8.al(((mx)v4_2), ((long)v3));
        }

        return arg8;
    }

    static final oc ap(lq arg7, oc arg8) {
        mo v4_2;
        int v0 = arg7.ay(-90);
        if(arg8 == null) {
            arg8 = new oc(fa.ae(v0, 222042043));
        }

        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v4 = 1;
            if(arg7.ay(-60) == 1) {
            }
            else {
                v4 = 0;
            }

            int v3 = arg7.ak(0xB36C06AB);
            if(v4 != 0) {
                mi v4_1 = new mi(arg7.bn(-66));
            }
            else {
                v4_2 = new mo(arg7.ac(99));
            }

            arg8.al(((mx)v4_2), ((long)v3));
        }

        return arg8;
    }

    static int aq(oc arg2, int arg3, int arg4) {
        if(arg2 == null) {
            return arg4;
        }

        mx v2 = arg2.ax(((long)arg3));
        if(v2 == null) {
            return arg4;
        }

        return ((mo)v2).ax;
    }

    static final oc ar(lq arg7, oc arg8) {
        mo v4_2;
        int v0 = arg7.ay(-89);
        if(arg8 == null) {
            arg8 = new oc(fa.ae(v0, 0x1C53A852));
        }

        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v4 = 1;
            if(arg7.ay(-9) == 1) {
            }
            else {
                v4 = 0;
            }

            int v3 = arg7.ak(0x2538502D);
            if(v4 != 0) {
                mi v4_1 = new mi(arg7.bn(-4));
            }
            else {
                v4_2 = new mo(arg7.ac(36));
            }

            arg8.al(((mx)v4_2), ((long)v3));
        }

        return arg8;
    }

    static final void cj(int arg3) {
        try {
            int v0 = 1101813865;
            if(kt.jz * v0 != client.om * 0xA9F744CB) {
                client.om = kt.jz * 0xF8DC651B;
                ij.en(kt.jz * v0, 0x56D40485);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("dx.cj(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }
}

