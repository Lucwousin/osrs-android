public class dj extends mv {
    public boolean ae;
    public static final int ah = 8;
    static gk al = null;
    public static final int ap = 6;
    static final int as = 45;
    public static final int aw = 24;
    static ko ax = null;
    static final int br = 13;
    public static final int cy = 1007;
    static int[] fp;
    static int ph;

    static {
        dj.al = new gk(0x40, null);
    }

    dj() {
        try {
            super();
            this.ae = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dj.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg1, int arg2) {
        if(2 == arg2) {
            this.ae = true;
        }
    }

    void ab(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-83);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 534600586);
        }
    }

    public static dj ad(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dj.al.ax(v1);
        if(v0 != null) {
            return ((dj)v0);
        }

        byte[] v5 = dj.ax.ae(19, arg5, 0x78DC0DC9);
        dj v0_1 = new dj();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -648906787);
        }

        dj.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ae(lq arg2, int arg3) {
        while(true) {
            byte v3 = -98;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.ar(arg2, arg3, 0x23BF4433);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dj.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    void af(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-26);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x5551549A);
        }
    }

    void ai(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-113);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 1965007778);
        }
    }

    public static dj aj(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dj.al.ax(v1);
        if(v0 != null) {
            return ((dj)v0);
        }

        byte[] v5 = dj.ax.ae(19, arg5, 0x78DC0DC9);
        dj v0_1 = new dj();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -648906787);
        }

        dj.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public static gc[] al(int arg2) {
        arg2 = 6;
        try {
            gc[] v2_1 = new gc[arg2];
            v2_1[0] = gc.ap;
            v2_1[1] = gc.ar;
            v2_1[2] = gc.ax;
            v2_1[3] = gc.ae;
            v2_1[4] = gc.al;
            v2_1[5] = gc.an;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dj.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int al(int arg0, int arg1, int arg2) {
        return arg1 + (arg0 + 40000 << 8);
    }

    public static void al(int arg4, int arg5, int arg6) {
        arg6 = 951704969;
        try {
            di v4_1 = bx.al(arg4, arg6);
            arg6 = v4_1.ae * 0xBF544EB7;
            int v0 = v4_1.ar * 0xF880F3E5;
            arg4 = an.ax[v4_1.an * -2086968989 - v0];
            if(arg5 < 0 || arg5 > arg4) {
            }

            arg4 <<= v0;
            an.ae[arg6] = arg4 & 0 << v0 | an.ae[arg6] & ~arg4;
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("dj.al(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void am(lq arg1, int arg2) {
        if(2 == arg2) {
            this.ae = true;
        }
    }

    public static void an(ko arg0) {
        dj.ax = arg0;
    }

    public static void ap(ko arg0) {
        dj.ax = arg0;
    }

    public static dj aq(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dj.al.ax(v1);
        if(v0 != null) {
            return ((dj)v0);
        }

        byte[] v5 = dj.ax.ae(19, arg5, 0x78DC0DC9);
        dj v0_1 = new dj();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -648906787);
        }

        dj.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ar(lq arg1, int arg2, int arg3) {
        if(2 == arg2) {
            try {
                this.ae = true;
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("dj.ar(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }
    }

    void au(lq arg1, int arg2) {
        if(2 == arg2) {
            this.ae = true;
        }
    }

    void av(lq arg1, int arg2) {
        if(2 == arg2) {
            this.ae = true;
        }
    }

    public static void ax(int arg2) {
        try {
            oj.ax = new fb();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("dj.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static String ip(ar arg1, int arg2) {
        String v0;
        arg2 = -1803680853;
        try {
            v0 = null;
            if(ct.ae(ib.il(arg1, arg2), 0x7F0F00B5) == 0) {
                return v0;
            }

            if(arg1.er != null) {
                if(arg1.er.trim().length() == 0) {
                }
                else {
                    return arg1.er;
                }
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("dj.ip(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return v0;
    }
}

