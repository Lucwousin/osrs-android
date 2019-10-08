public class gl {
    public static final int ae = 16;
    static final int ax = 8;
    static final int bf = 2;

    gl() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gl.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static boolean ae(int arg1, int arg2) {
        try {
            int v0 = 0x675599ED;
            if(arg1 < ga.ay.as * v0) {
                return false;
            }
            else if(arg1 > ga.aw.as * v0) {
                return false;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("gl.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        boolean v1_1 = true;
        return v1_1;
    }

    public static int ae(int arg0, int arg1) {
        return (arg0 << 8) + arg1;
    }

    public static byte[] ae(int arg2, int arg3) {
        byte[] v2_2;
        Class v3 = gl.class;
        __monitor_enter(v3);
        int v1 = 0x987A1A7D;
        try {
            v2_2 = md.al(arg2, false, v1);
        }
        catch(Throwable v2) {
        }
        catch(RuntimeException v2_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("gl.ae(");
                v0.append(')');
                throw lx.al(((Throwable)v2_1), v0.toString());
            }
            catch(Throwable v2) {
                __monitor_exit(v3);
                throw v2;
            }
        }

        __monitor_exit(v3);
        return v2_2;
    }

    static int af(int arg2, byte arg3) {
        try {
            mx v2_1 = ic.al.ax(((long)arg2));
            int v3 = -1;
            if(v2_1 == null) {
                return v3;
            }

            if(ic.ae.ax == ((ij)v2_1).dr) {
                return v3;
            }

            return ((ij)v2_1).dr.ax * 0x7D5124F1;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("gl.af(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public static int aj(int arg1, int arg2) {
        return arg2 + (arg1 + 40000 << 8);
    }

    public static int an(int arg1, int arg2) {
        return arg2 + (arg1 + 0x3B467DC9 << 8);
    }

    public static int ap(int arg1, int arg2) {
        return arg2 + (arg1 + 40000 << 8);
    }

    public static int ar(int arg1, int arg2) {
        return arg2 + (arg1 + 40000 << 8);
    }

    public static void ax(ko arg0, ko arg1, boolean arg2, od arg3, int arg4) {
        try {
            lz.ad = arg0;
            br.aq = arg1;
            ju.ab = arg2;
            ag.af = lz.ad.au(10, 0x3066BE9F) * 0x3DE805A7;
            ju.au = arg3;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("gl.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final boolean hs(ar arg5, int arg6) {
        boolean v2;
        aj v3;
        arg6 = 0xD2D07C71;
        try {
            int v5_1 = arg5.ao * arg6;
            if(v5_1 == 205) {
                client.ei = 0xDDCA1B82;
                return 1;
            }

            if(v5_1 >= 300 && v5_1 <= 313) {
                arg6 = (v5_1 - 300) / 2;
                v3 = client.rf;
                v2 = 1 == (v5_1 & 1) ? true : false;
                v3.al(arg6, v2, 0xFDEC96C2);
            }

            if(v5_1 >= 314 && v5_1 <= 323) {
                arg6 = (v5_1 - 314) / 2;
                v3 = client.rf;
                v2 = (v5_1 & 1) == 1 ? true : false;
                v3.ae(arg6, v2, 0x7E24);
            }

            if(324 == v5_1) {
                client.rf.ar(false, -198951580);
            }

            if(325 == v5_1) {
                client.rf.ar(true, 0xF2104B3D);
            }

            if(326 != v5_1) {
                return 0;
            }

            na v5_2 = cd.al(nf.cj, client.eh.an, 0x8F3F7D43);
            client.rf.an(v5_2.ae, 242459042);
            client.eh.ae(v5_2, 0x8B430DF);
            return 1;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("gl.hs(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }

        return 0;
    }
}

