public abstract class bi {
    final boolean[] aa;
    static final int[] ab = null;
    final int[][] ac;
    static final int[] ad = null;
    static final int af = 50;
    final int[] ag;
    final int[] ah;
    static final int[] aj;
    final int[] ak;
    final int[] am;
    final int[] ao;
    static final int[] aq;
    final int[][] as;
    final int[] at;
    final boolean[] au;
    final int[] ay;
    final int[] az;
    final int[] ba;
    final int[] bd;
    final int[] bf;
    final int[] bn;
    final bt bo;
    final int[] bp;
    static int bt;
    final int[] bw;
    static boolean by;
    static ki cu;

    static {
        bi.aj = bt.ag;
        bi.ad = bt.ah;
        bi.aq = bt.aa;
        bi.ab = bt.az;
        bi.by = true;
    }

    bi(bt arg5) {
        try {
            super();
            this.aa = new boolean[4700];
            this.au = new boolean[4700];
            this.am = new int[4700];
            this.az = new int[4700];
            this.ag = new int[4700];
            this.ah = new int[4700];
            this.at = new int[4700];
            this.ay = new int[4700];
            this.ao = new int[1600];
            this.as = new int[1600][0x200];
            this.ak = new int[12];
            this.ac = new int[12][2000];
            this.bd = new int[2000];
            this.ba = new int[2000];
            this.bf = new int[12];
            this.bn = new int[10];
            this.bp = new int[10];
            this.bw = new int[10];
            this.bo = arg5;
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bi.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }
    }

    public abstract void ab(ca arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    public abstract void ad(ca arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    public abstract void ae(bm arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, long arg10);

    public abstract void af(ca arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    public abstract void ah(bm arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, long arg10);

    public abstract void aj(ca arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    public abstract void al(ca arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10);

    public static void al(ko arg6, String arg7, String arg8, int arg9, boolean arg10, int arg11) {
        arg11 = 0xD4A3E869;
        try {
            int v1 = arg6.ay(arg7, arg11);
            ik.ae(arg6, v1, arg6.aw(v1, arg8, 0xA5D36038), arg9, arg10, -116);
            return;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("bi.al(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    public abstract void ao(bm arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, long arg10);

    public abstract void aq(ca arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    static int at(int arg4) {
        try {
            if(hp.ea.ai(1)) {
                ls v4_1 = client.al.aba(57099305);
                hp.ea.ad = v4_1.bv("wgahnagl", 0, -26) * 0x18C06371;
                hq.dv = v4_1.bt("name", "", 3);
                int v2 = 0x8251FD91;
                if(hp.ea.ad * v2 == 0 && -1000 != hp.ea.ad * v2) {
                    hq.dv = "";
                    v4_1.bq(new String[]{"name"}, -29);
                    return 0;
                }

                if(hq.dv.isEmpty()) {
                    hp.ea.ad = 0;
                    v4_1.bq(new String[]{"wgahnagl"}, -108);
                    return 0;
                }

                return 10;
            }

            hp.ea.ad = 0;
            hq.dv = "";
            return 0;
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bi.at(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public abstract void at(bm arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, long arg10);

    public abstract void aw(bm arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, long arg10);

    public abstract void ax(ca arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    static double ax(double arg2) {
        double v0 = -arg2 * arg2 / 2;
        try {
            return Math.exp(v0) / Math.sqrt(6.283185);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bi.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public abstract void ay(bm arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, long arg10);

    static String fm(String arg5, ar arg6, byte arg7) {
        try {
            int v0 = -1;
            if(arg5.indexOf("%") != v0) {
                int v7;
                for(v7 = 1; v7 <= 5; ++v7) {
                    while(true) {
                        StringBuilder v1 = new StringBuilder();
                        v1.append("%");
                        v1.append(v7);
                        int v1_1 = arg5.indexOf(v1.toString());
                        if(v1_1 == v0) {
                            break;
                        }

                        arg5 = arg5.substring(0, v1_1) + cp.gm(bd.gl(arg6, v7 - 1, -44), 3) + arg5.substring(v1_1 + 2);
                    }
                }
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("bi.fm(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }

        return arg5;
    }
}

