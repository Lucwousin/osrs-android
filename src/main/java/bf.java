public class bf extends mv {
    public static final byte al = 1;
    public static final String av = "npR101";
    ba[] ax;
    protected static final String az = "D26Pdv7QqeyK23LpPkdUAA";
    static final int bd = 0x7F;
    static int dt;
    static int ee;

    bf(ko arg11, ko arg12, int arg13, boolean arg14) {
        bu v5_3;
        try {
            super();
            fi v0 = new fi();
            this.ax = new ba[arg11.au(arg13, 0x3455F0D1)];
            int[] v1 = arg11.aa(arg13, -304767306);
            int v3;
            for(v3 = 0; v3 < v1.length; ++v3) {
                byte[] v4 = arg11.ae(arg13, v1[v3], 0x78DC0DC9);
                mx v5 = null;
                int v6 = (v4[0] & 0xFF) << 8 | v4[1] & 0xFF;
                mx v7 = v0.aj();
                while(v7 != null) {
                    if(v6 == ((bu)v7).ax * 0xD7CE4FF1) {
                        v5 = v7;
                    }
                    else {
                        v7 = v0.aq();
                        continue;
                    }

                    break;
                }

                if(v5 == null) {
                    int v5_1 = 0x73E61855;
                    byte[] v5_2 = arg14 ? arg12.af(0, v6, v5_1) : arg12.af(v6, 0, v5_1);
                    bu v7_1 = new bu(v6, v5_2);
                    v0.al(((mx)v7_1));
                    v5_3 = v7_1;
                }

                this.ax[v1[v3]] = new ba(v4, v5_3);
            }
        }
        catch(RuntimeException v11) {
            goto label_54;
        }

        return;
    label_54:
        StringBuilder v12 = new StringBuilder();
        v12.append("bf.<init>(");
        v12.append(')');
        throw lx.al(((Throwable)v11), v12.toString());
    }

    public static bf ae(ko arg9, ko arg10, int arg11, boolean arg12) {
        int[] v0 = arg9.aa(arg11, 0xAE3D1135);
        int v3 = 0;
        int v4 = 1;
        while(v3 < v0.length) {
            int v6 = 0x73E61855;
            byte[] v5 = arg9.af(arg11, v0[v3], v6);
            if(v5 != null) {
                int v5_1 = v5[1] & 0xFF | (v5[0] & -324560477) << 8;
                v5 = arg12 ? arg10.af(0, v5_1, v6) : arg10.af(v5_1, 0, v6);
                if(v5 != null) {
                    goto label_27;
                }

                goto label_12;
            }
            else {
            label_12:
                v4 = 0;
            }

        label_27:
            ++v3;
        }

        bf v0_1 = null;
        if(v4 == 0) {
            return v0_1;
        }

        try {
            return new bf(arg9, arg10, arg11, arg12);
        }
        catch(Exception ) {
            return v0_1;
        }
    }

    public boolean al(int arg2, int arg3) {
        try {
            return this.ax[arg2].af;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bf.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean an(int arg2) {
        return this.ax[arg2].af;
    }

    static ij ar(int arg0, int arg1, short arg2) {
        try {
            return ic.ax.get(Integer.valueOf(arg0)).al(arg1, 1201769080);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bf.ar(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static bf ar(ko arg8, ko arg9, int arg10, boolean arg11) {
        int[] v0 = arg8.aa(arg10, 0xC1580D01);
        int v3 = 0;
        int v4 = 1;
        while(v3 < v0.length) {
            int v6 = 0x73E61855;
            byte[] v5 = arg8.af(arg10, v0[v3], v6);
            if(v5 != null) {
                int v5_1 = v5[1] & 0xFF | (v5[0] & 0xFF) << 8;
                v5 = arg11 ? arg9.af(0, v5_1, v6) : arg9.af(v5_1, 0, v6);
                if(v5 != null) {
                    goto label_26;
                }

                goto label_12;
            }
            else {
            label_12:
                v4 = 0;
            }

        label_26:
            ++v3;
        }

        bf v0_1 = null;
        if(v4 == 0) {
            return v0_1;
        }

        try {
            return new bf(arg8, arg9, arg10, arg11);
        }
        catch(Exception ) {
            return v0_1;
        }
    }

    static final void ay(String arg3, int arg4) {
        try {
            na v4 = cd.al(nf.cd, client.eh.an, -2014753517);
            v4.ae.ar(ki.af(arg3, 89), 26);
            v4.ae.ai(arg3, -31);
            client.eh.ae(v4, 0x330FFBEE);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("bf.ay(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    static int ay(int arg4, hl arg5, boolean arg6, int arg7) {
        int v5_2;
        String[] v4_2;
        int[] v4_1;
        try {
            int[] v5 = il.aj;
            arg7 = 0x4A90AB9;
            int v6 = il.ad - arg7;
            il.ad = v6;
            int v0 = 1304812425;
            ar v5_1 = bl.al(v5[v6 * v0], 0x64D7CF4D);
            if(arg4 == 0xAF0) {
                v4_1 = il.aj;
                v6 = il.ad + arg7;
                il.ad = v6;
                v4_1[v6 * v0 - 1] = ct.ae(ib.il(v5_1, 0xA003FF25), 0x7F0F00B5);
                return 1;
            }

            int v2 = 0xBC5CDEAD;
            int v3 = 0x8FA23525;
            if(arg4 == 0xAF1) {
                v4_1 = il.aj;
                v6 = il.ad - arg7;
                il.ad = v6;
                arg4 = v4_1[v6 * v0] - 1;
                if(v5_1.dd == null || arg4 >= v5_1.dd.length || v5_1.dd[arg4] == null) {
                    v4_2 = il.aq;
                    v5_2 = ft.ab + v3;
                    ft.ab = v5_2;
                    v4_2[v5_2 * v2 - 1] = "";
                }
                else {
                    String[] v6_1 = il.aq;
                    arg7 = ft.ab + v3;
                    ft.ab = arg7;
                    v6_1[arg7 * v2 - 1] = v5_1.dd[arg4];
                }

                return 1;
            }

            if(arg4 != 0xAF2) {
                return 2;
            }

            if(v5_1.dt == null) {
                v4_2 = il.aq;
                v5_2 = ft.ab + v3;
                ft.ab = v5_2;
                v4_2[v5_2 * v2 - 1] = "";
            }
            else {
                v4_2 = il.aq;
                v6 = ft.ab + v3;
                ft.ab = v6;
                v4_2[v6 * v2 - 1] = v5_1.dt;
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v5_3 = new StringBuilder();
            v5_3.append("bf.ay(");
            v5_3.append(')');
            throw lx.al(((Throwable)v4), v5_3.toString());
        }

        return 1;
    }

    static final boolean az(byte arg2) {
        try {
            return bc.ae;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bf.az(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static final int bm(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return arg3 * arg0 + arg2 * arg1 >> 16;
    }
}

