public class jb extends mx {
    static final int ad = 6;
    int[] ae;
    int[] al;
    public static final int av = 5;
    static oh ax;

    static {
        jb.ax = new oh(0x20);
    }

    jb() {
        try {
            super();
            this.al = new int[]{-1};
            this.ae = new int[]{0};
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jb.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static void aa(int arg5, int arg6, int arg7, int arg8) {
        long v1 = ((long)arg5);
        mx v5 = jb.ax.ax(v1);
        if(v5 == null) {
            jb v5_1 = new jb();
            jb.ax.al(((mx)v5_1), v1);
        }

        if(((jb)v5).al.length <= arg6) {
            int v0 = arg6 + 1;
            int[] v1_1 = new int[v0];
            int[] v0_1 = new int[v0];
            int v3;
            for(v3 = 0; v3 < ((jb)v5).al.length; ++v3) {
                v1_1[v3] = ((jb)v5).al[v3];
                v0_1[v3] = ((jb)v5).ae[v3];
            }

            for(v3 = ((jb)v5).al.length; v3 < arg6; ++v3) {
                v1_1[v3] = -1;
                v0_1[v3] = 0;
            }

            ((jb)v5).al = v1_1;
            ((jb)v5).ae = v0_1;
        }

        ((jb)v5).al[arg6] = arg7;
        ((jb)v5).ae[arg6] = arg8;
    }

    static int ab(int arg3, int arg4) {
        mx v3 = jb.ax.ax(((long)arg3));
        if(v3 == null) {
            return 0;
        }

        if(arg4 >= 0) {
            if(arg4 >= ((jb)v3).ae.length) {
            }
            else {
                return ((jb)v3).ae[arg4];
            }
        }

        return 0;
    }

    static int ad(int arg3, int arg4) {
        mx v3 = jb.ax.ax(((long)arg3));
        int v0 = -1;
        if(v3 == null) {
            return v0;
        }

        if(arg4 >= 0) {
            if(arg4 >= ((jb)v3).al.length) {
            }
            else {
                return ((jb)v3).al[arg4];
            }
        }

        return v0;
    }

    static int af(int arg3, int arg4) {
        mx v3 = jb.ax.ax(((long)arg3));
        if(v3 == null) {
            return 0;
        }

        if(arg4 >= 0) {
            if(arg4 >= ((jb)v3).ae.length) {
            }
            else {
                return ((jb)v3).ae[arg4];
            }
        }

        return 0;
    }

    static void ag(int arg3) {
        mx v3 = jb.ax.ax(((long)arg3));
        if(v3 == null) {
            return;
        }

        ((jb)v3).lp();
    }

    static final int ah(byte arg2) {
        int v2 = 0xB0766F17;
        try {
            return bc.ar * v2;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jb.ah(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    static void ah(int arg3) {
        mx v3 = jb.ax.ax(((long)arg3));
        if(v3 == null) {
            return;
        }

        ((jb)v3).lp();
    }

    static int ai(int arg3, int arg4) {
        mx v3 = jb.ax.ax(((long)arg3));
        int v0 = 0;
        if(v3 == null) {
            return 0;
        }

        if(arg4 == -1) {
            return 0;
        }

        int v1 = 0;
        while(v0 < ((jb)v3).ae.length) {
            if(((jb)v3).al[v0] == arg4) {
                v1 += ((jb)v3).ae[v0];
            }

            ++v0;
        }

        return v1;
    }

    static void am(int arg4) {
        mx v4 = jb.ax.ax(((long)arg4));
        if(v4 == null) {
            return;
        }

        int v1;
        for(v1 = 0; v1 < ((jb)v4).al.length; ++v1) {
            ((jb)v4).al[v1] = -1;
            ((jb)v4).ae[v1] = 0;
        }
    }

    static void ao() {
        jb.ax = new oh(0x20);
    }

    static int aq(int arg3, int arg4) {
        mx v3 = jb.ax.ax(((long)arg3));
        if(v3 == null) {
            return 0;
        }

        if(arg4 >= 0) {
            if(arg4 >= ((jb)v3).ae.length) {
            }
            else {
                return ((jb)v3).ae[arg4];
            }
        }

        return 0;
    }

    static void as() {
        jb.ax = new oh(0x20);
    }

    static void at(int arg3) {
        mx v3 = jb.ax.ax(((long)arg3));
        if(v3 == null) {
            return;
        }

        ((jb)v3).lp();
    }

    static void au(int arg4) {
        mx v4 = jb.ax.ax(((long)arg4));
        if(v4 == null) {
            return;
        }

        int v1;
        for(v1 = 0; v1 < ((jb)v4).al.length; ++v1) {
            ((jb)v4).al[v1] = -1;
            ((jb)v4).ae[v1] = 0;
        }
    }

    static int av(int arg3, int arg4) {
        mx v3 = jb.ax.ax(((long)arg3));
        int v0 = 0;
        if(v3 == null) {
            return 0;
        }

        if(arg4 == -1) {
            return 0;
        }

        int v1 = 0;
        while(v0 < ((jb)v3).ae.length) {
            if(((jb)v3).al[v0] == arg4) {
                v1 += ((jb)v3).ae[v0];
            }

            ++v0;
        }

        return v1;
    }

    static void aw() {
        jb.ax = new oh(0xCD9312FF);
    }

    static void ay(int arg3) {
        mx v3 = jb.ax.ax(((long)arg3));
        if(v3 == null) {
            return;
        }

        ((jb)v3).lp();
    }

    static void az(int arg4) {
        mx v4 = jb.ax.ax(((long)arg4));
        if(v4 == null) {
            return;
        }

        int v1;
        for(v1 = 0; v1 < ((jb)v4).al.length; ++v1) {
            ((jb)v4).al[v1] = -1;
            ((jb)v4).ae[v1] = 0;
        }
    }

    static void cm(hw arg6, int arg7, int arg8, int arg9) {
        try {
            int v0 = 2011890317;
            int v1 = 2115386027;
            int v2 = 1304812425;
            int v3 = -1;
            if(arg7 != arg6.ch * v0 || arg7 == v3) {
                if(v3 != arg7 && arg6.ch * v0 != v3 && fs.al(arg7, v2).av * 0x484C05C9 < fs.al(arg6.ch * v0, v2).av * 0x484C05C9) {
                    return;
                }

                arg6.ch = arg7 * 0x8B5D9045;
                arg6.ce = 0;
                arg6.cs = 0;
                arg6.cz = arg8 * v1;
                arg6.cn = 0;
                arg6.df = arg6.dk * 985506349;
            }
            else {
                arg7 = fs.al(arg7, v2).ah * 0x2D690AE9;
                if(1 == arg7) {
                    arg6.ce = 0;
                    arg6.cs = 0;
                    arg6.cz = arg8 * v1;
                    arg6.cn = 0;
                }

                if(2 != arg7) {
                    return;
                }

                arg6.cn = 0;
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("jb.cm(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }
}

