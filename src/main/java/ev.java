public class ev extends eg {
    static final int ab = 5;
    int ax;
    public static final int cw = 0x3F0;
    static final int dc = 210;

    ev() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ev.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static boolean aa(char arg0, int arg1) {
        boolean v0;
        if(arg0 < 0x30 || arg0 > 57) {
            if(arg0 >= 65 && arg0 <= 90) {
                goto label_12;
            }

            if(arg0 >= 97 && arg0 <= 0x7A) {
            label_12:
                v0 = true;
                return v0;
            }

            v0 = false;
        }
        else {
            goto label_12;
        }

        return v0;
    }

    public int ad(Object arg2) {
        return this.ax(((ev)arg2), 0x7308DA16);
    }

    static boolean ae(CharSequence arg8, int arg9, boolean arg10, int arg11) {
        if(arg9 >= 2 && arg9 <= 36) {
            try {
                arg11 = arg8.length();
                int v1 = 0;
                boolean v2 = false;
                int v3 = 0;
                int v4 = 0;
                while(true) {
                    if(v1 < arg11) {
                        int v5 = arg8.charAt(v1);
                        if(v1 != 0 || 43 != v5) {
                        label_22:
                            if(v5 < 0x30 || v5 > 57) {
                                if(v5 >= 65 && v5 <= 90) {
                                    v5 += -55;
                                    goto label_39;
                                }

                                if(v5 >= 97 && v5 <= 0x7A) {
                                    v5 += -87;
                                    goto label_39;
                                }

                                return 0;
                            }
                            else {
                                v5 += 0xFFFFFFD0;
                            }

                        label_39:
                            if(v5 >= arg9) {
                                return 0;
                            }
                            else {
                                if(v3 != 0) {
                                    v5 = -v5;
                                }

                                v5 += v4 * arg9;
                                if(v5 / arg9 != v4) {
                                    return 0;
                                }

                                v4 = v5;
                                v2 = true;
                                goto label_50;
                            }

                            return 0;
                        }
                        else if(v5 == 45) {
                            v3 = 1;
                        }
                        else if(arg10) {
                        }
                        else {
                            goto label_22;
                        }

                    label_50:
                        ++v1;
                        continue;
                    }
                    else {
                        return v2;
                    }
                }

                return 0;
            label_54:
                StringBuilder v10 = new StringBuilder();
                v10.append("");
                v10.append(arg9);
                throw new IllegalArgumentException(v10.toString());
            }
            catch(RuntimeException v8) {
                StringBuilder v9 = new StringBuilder();
                v9.append("ev.ae(");
                v9.append(')');
                throw lx.al(((Throwable)v8), v9.toString());
            }
        }

        goto label_54;
    }

    int ae(ev arg3) {
        return this.ax * 0xAF9C1209 - arg3.ax * -1145533130;
    }

    static void af(int arg2) {
        arg2 = 0xCEB54B43;
        try {
            hq.dq = arg2;
            bs.aq(hq.dq * 0xF4A0196B, 0xC40D0848);
            am.ai(hq.dq * 0xF4A0196B, -1405914826);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ev.af(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public int aj(Object arg2) {
        return this.ax(((ev)arg2), 2001021126);
    }

    public int al(eg arg2, int arg3) {
        try {
            return this.ax(((ev)arg2), 1790368993);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ev.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int an(eg arg2) {
        return this.ax(((ev)arg2), 0x673AFFA9);
    }

    static int ap(int arg1, int arg2) {
        try {
            Object v1_1 = ic.ax.get(Integer.valueOf(arg1));
            if(v1_1 == null) {
                return 0;
            }

            return ((ig)v1_1).ae(0xEF63D99F);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ev.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static ih aq(byte arg3) {
        try {
            int v0 = -2001409197;
            if(ih.aj * v0 >= ih.ap * 0x6DE6A9AD) {
                return null;
            }

            ih[] v3_1 = ew.an;
            int v1 = ih.aj + 0x143490DB;
            ih.aj = v1;
            return v3_1[v1 * v0 - 1];
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ev.aq(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }

        return null;
    }

    public int ar(eg arg2) {
        return this.ax(((ev)arg2), 1919006583);
    }

    int ax(ev arg2, int arg3) {
        try {
            return this.ax * 0xAF9C1209 - arg2.ax * 0xAF9C1209;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ev.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static void bd(byte arg5) {
        try {
            hq.cg = hq.cg.trim();
            int v0 = 0x63D3C206;
            if(hq.cg.length() == 0) {
                ax.bf(gs.mg, gs.mv, gs.ms, v0);
                return;
            }

            long v1 = gj.ax(0x2E46DEF7);
            int v5_1 = v1 == 0 ? 5 : gm.al(v1, hq.cg, 0x75EBCEC2);
            switch(v5_1) {
                case 2: {
                    client.al.aba(0xFE3D7926).gj("ariMOV", 0xFB01571E);
                    ax.bf(gs.mb, gs.mo, gs.mi, v0);
                    hq.cm = 0x5F7B522E;
                    return;
                    StringBuilder v0_1 = new StringBuilder();
                    v0_1.append("ev.bd(");
                    v0_1.append(')');
                    throw lx.al(((Throwable)v5), v0_1.toString());
                }
                case 3: {
                    ax.bf(gs.mx, gs.mt, gs.mj, v0);
                    return;
                }
                case 4: {
                    ax.bf(gs.mr, gs.mn, gs.mz, v0);
                    return;
                }
                case 5: {
                    ax.bf(gs.mw, gs.mp, gs.mf, v0);
                    return;
                }
                case 6: {
                    ax.bf(gs.ml, gs.mc, gs.no, v0);
                    return;
                }
                case 7: {
                    ax.bf(gs.nq, gs.nc, gs.nd, v0);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch(RuntimeException v5) {
        }
    }

    public int compareTo(Object arg3) {
        try {
            return this.ax(((ev)arg3), 2110956523);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ev.compareTo(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static final void ee(io arg10, int arg11) {
        arg11 = -1;
        try {
            int v1 = 0x15137909;
            long v2 = 0;
            int v4 = 0x9D0B1463;
            int v5 = 0xFFA278D3;
            int v6 = 0x647472F3;
            long v7 = arg10.al * v1 == 0 ? ee.fs.bd(arg10.ax * v6, arg10.ae * v5, arg10.ar * v4) : v2;
            if(arg10.al * v1 == 1) {
                v7 = ee.fs.ba(arg10.ax * v6, arg10.ae * v5, arg10.ar * v4);
            }

            if(2 == arg10.al * v1) {
                v7 = ee.fs.bf(arg10.ax * v6, arg10.ae * v5, arg10.ar * v4);
            }

            int v0 = arg10.al * v1;
            v1 = 3;
            if(v0 == v1) {
                v7 = ee.fs.bn(arg10.ax * v6, arg10.ae * v5, arg10.ar * v4);
            }

            long v8 = v7;
            v0 = 0;
            if(v8 != v2) {
                arg11 = ee.fs.bp(arg10.ax * v6, arg10.ae * v5, arg10.ar * v4, v8);
                int v2_1 = arg11 & 0x1F;
                v1 &= arg11 >> 6;
                arg11 = be.av(v8);
                v0 = v2_1;
            }
            else {
                v1 = 0;
            }

            arg10.an = arg11 * 345690681;
            arg10.aj = v0 * 0x9B0B84BF;
            arg10.ap = v1 * -2015000867;
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("ev.ee(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }
}

