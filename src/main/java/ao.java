public final class ao {
    int aa;
    int ab;
    int ad;
    int ae;
    int af;
    int ag;
    int ai;
    int aj;
    int al;
    int am;
    int an;
    int ap;
    int aq;
    int ar;
    int au;
    int av;
    int ax;
    int az;
    static es[] gk;
    static int ls;

    ao() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ao.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static int ae(int arg0, int arg1, int arg2, int arg3) {
        if(arg2 > 0xB3) {
            try {
                arg1 /= 2;
            label_6:
                if(arg2 > 0xC0) {
                    arg1 /= 2;
                }

                if(arg2 > 0xD9) {
                    arg1 /= 2;
                }

                if(arg2 > 0xF3) {
                    arg1 /= 2;
                }

                return (arg1 / 0x20 << 7) + (arg0 / 4 << 10) + arg2 / 2;
            label_5:
                goto label_23;
            }
            catch(RuntimeException v0) {
                goto label_5;
            }
        }

        goto label_6;
    label_23:
        StringBuilder v1 = new StringBuilder();
        v1.append("ao.ae(");
        v1.append(')');
        throw lx.al(((Throwable)v0), v1.toString());
    }

    public static int al(int arg0, int arg1, int arg2, byte arg3) {
        arg2 &= 3;
        if(arg2 == 0) {
            return arg1;
        }

        if(1 == arg2) {
            return 7 - arg0;
        }

        if(2 == arg2) {
            return 7 - arg1;
        }

        return arg0;
    }

    public static boolean al(int arg1, int arg2) {
        try {
            int v0 = 0x675599ED;
            if(arg1 >= ga.ax.as * v0 && arg1 <= ga.ar.as * v0) {
            }
            else if(ga.an.as * v0 != arg1) {
                return false;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ao.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        boolean v1_1 = true;
        return v1_1;
    }

    public static boolean an(int arg0, byte arg1) {
        boolean v1 = true;
        if((arg0 >> 20 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public static int an(CharSequence arg1, int arg2, byte arg3) {
        byte v0 = -12;
        try {
            return he.ap(arg1, arg2, true, v0);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ao.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static void ap(int arg2, byte arg3) {
        try {
            mx v2_1 = jb.ax.ax(((long)arg2));
            if(v2_1 == null) {
                return;
            }

            ((jb)v2_1).lp();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ao.ap(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static final void db(int arg9, int arg10, int arg11, int arg12, boolean arg13, short arg14) {
        short v8;
        int v1;
        short v0_1;
        try {
            fa v14 = client.al.uu.ax(-1277023864);
            if(arg11 < 1) {
                arg11 = 1;
            }

            if(arg12 < 1) {
                arg12 = 1;
            }

            int v0 = -333;
            if(v0 < 0) {
                v0_1 = client.qi;
            }
            else {
                v1 = 100;
                if(v0 >= v1) {
                    v0_1 = client.qe;
                }
                else {
                    v0 = client.qi + (client.qe - client.qi) * v0 / v1;
                }
            }

            v1 = v0_1 * 0x200 / 334;
            int v3 = 0xD9CC4AFD;
            if(v1 < client.qm) {
                v0_1 = client.qm;
                v1 = v0_1 * 334 / 0x200;
                if(v1 > client.qw) {
                    v8 = client.qw;
                    v0 = (1 - v8 * 0x200 / (v0_1 * 334)) / 2;
                    if(arg13) {
                        v14.ep(v3);
                        v14.ar(arg9, arg10, v0, 1, 0, 2);
                        v14.ar(1 + arg9 - v0, arg10, v0, 1, 0, 2);
                    }

                    arg9 += v0;
                    arg11 = 1 - v0 * 2;
                    goto label_104;
                }
            }
            else {
                if(v1 > client.qu) {
                    v0 = client.qu * 334;
                    v1 = v0 / 0x200;
                    if(v1 >= client.qp) {
                        goto label_107;
                    }

                    v8 = client.qp;
                    v0 = (1 - v0 / (v8 * 0x200)) / 2;
                    if(arg13) {
                        v14.ep(v3);
                        v14.ar(arg9, arg10, 1, v0, 0, 2);
                        v14.ar(arg9, 1 + arg10 - v0, 1, v0, 0, 2);
                    }

                    arg10 += v0;
                    arg12 = 1 - v0 * 2;
                label_104:
                    v1 = v8;
                    goto label_107;
                }

                v1 = v0_1;
            }

        label_107:
            client.qy = v1 * arg12 / 334 * 0xEC1F475B;
            if(arg11 != client.ql * 0xDCCE0B33 || client.qj * 927018595 != arg12) {
                az.bp(arg11, arg12, -53);
            }

            client.qd = arg9 * 1480029561;
            client.qb = arg10 * 513518019;
            client.ql = arg11 * 0x12A0E7FB;
            client.qj = arg12 * 1673970507;
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("ao.db(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    static final void hw(int arg2) {
        arg2 = 0;
        try {
            while(arg2 < ho.ap * 0x474DFE7D) {
                client.jf[ho.aj[arg2]].ae(8);
                ++arg2;
            }

            ai.ad(0xDA1FB204);
            if(ai.oq != null) {
                ai.oq.df(0x25A4362B);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ao.hw(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }
}

