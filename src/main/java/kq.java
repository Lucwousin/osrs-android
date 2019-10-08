public class kq extends eq {
    static final String ae = "rw";
    final boolean al;

    public kq(boolean arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("kq.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ab(ee arg4, ee arg5, int arg6) {
        try {
            int v0 = 0x297B4181;
            int v1 = 1;
            if(arg4.an * v0 == 0) {
                if(arg5.an * v0 == 0) {
                    goto label_21;
                }

                if(this.al) {
                }
                else {
                    v1 = -1;
                }

                return v1;
            }
            else if(arg5.an * v0 == 0) {
                if(this.al) {
                    v1 = -1;
                }

                return v1;
            }

        label_21:
            return this.al(((eg)arg4), ((eg)arg5), 0x71);
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("kq.ab(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 1245824609);
    }

    int af(ee arg5, ee arg6) {
        int v1 = 0x297B4181;
        int v2 = 1;
        if(arg5.an * v1 == 0) {
            if(arg6.an * 1276332980 == 0) {
                goto label_22;
            }

            if(this.al) {
            }
            else {
                v2 = -1;
            }

            return v2;
        }
        else if(arg6.an * v1 == 0) {
            if(this.al) {
                v2 = -1;
            }

            return v2;
        }

    label_22:
        return this.al(((eg)arg5), ((eg)arg6), -54);
    }

    int ai(ee arg5, ee arg6) {
        int v1 = 0x297B4181;
        int v2 = -1;
        if(arg5.an * v1 == 0) {
            if(arg6.an * v1 == 0) {
                goto label_21;
            }

            if(this.al) {
                v2 = 1;
            }

            return v2;
        }
        else if(arg6.an * v1 == 0) {
            if(this.al) {
            }
            else {
                v2 = 1;
            }

            return v2;
        }

    label_21:
        return this.al(((eg)arg5), ((eg)arg6), 78);
    }

    public int aq(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 2095936568);
    }

    public static void ar(byte[] arg5, int arg6) {
        int v2;
        byte[][] v0_1;
        int v1;
        Class v6 = kq.class;
        __monitor_enter(v6);
        int v0 = 100;
        try {
            if(v0 == arg5.length) {
                v1 = -1067990697;
                if(md.ax * v1 < 1000) {
                    v0_1 = md.ar;
                    v2 = md.ax + 2089335399;
                    md.ax = v2;
                    v0_1[v2 * v1 - 1] = arg5;
                    goto label_18;
                }
            }

            goto label_20;
        }
        catch(Throwable v5) {
            goto label_97;
        }
        catch(RuntimeException v5_1) {
            goto label_88;
        }

    label_18:
        __monitor_exit(v6);
        return;
        try {
        label_20:
            if(arg5.length == 5000) {
                v1 = 0x41E25FAF;
                if(md.al * v1 < 0xFA) {
                    v0_1 = md.an;
                    v2 = md.al - 0x6A9FA8B1;
                    md.al = v2;
                    v0_1[v2 * v1 - 1] = arg5;
                    goto label_36;
                }
            }

            goto label_38;
        }
        catch(Throwable v5) {
            goto label_97;
        }
        catch(RuntimeException v5_1) {
            goto label_88;
        }

    label_36:
        __monitor_exit(v6);
        return;
    label_38:
        v0 = 30000;
        try {
            if(v0 == arg5.length) {
                v1 = 2052631195;
                if(md.ae * v1 < 50) {
                    v0_1 = md.ap;
                    v2 = md.ae - 0x18D5D46D;
                    md.ae = v2;
                    v0_1[v2 * v1 - 1] = arg5;
                    goto label_54;
                }
            }

            goto label_56;
        }
        catch(Throwable v5) {
            goto label_97;
        }
        catch(RuntimeException v5_1) {
            goto label_88;
        }

    label_54:
        __monitor_exit(v6);
        return;
        try {
        label_56:
            if(md.aq != null) {
                v0 = 0;
                while(true) {
                label_59:
                    if(v0 < hv.aj.length) {
                        if(arg5.length == hv.aj[v0] && am.ad[v0] < md.aq[v0].length) {
                            byte[][] v1_1 = md.aq[v0];
                            int[] v2_1 = am.ad;
                            int v3 = v2_1[v0];
                            v2_1[v0] = v3 + 1;
                            v1_1[v3] = arg5;
                            goto label_79;
                        }

                        goto label_81;
                    }

                    goto label_83;
                }
            }

            goto label_83;
        }
        catch(Throwable v5) {
            goto label_97;
        }
        catch(RuntimeException v5_1) {
            goto label_88;
        }

    label_79:
        __monitor_exit(v6);
        return;
    label_81:
        ++v0;
        goto label_59;
        try {
        label_88:
            StringBuilder v0_2 = new StringBuilder();
            v0_2.append("kq.ar(");
            v0_2.append(')');
            throw lx.al(((Throwable)v5_1), v0_2.toString());
        }
        catch(Throwable v5) {
        label_97:
            __monitor_exit(v6);
            throw v5;
        }

    label_83:
        __monitor_exit(v6);
    }

    int av(ee arg5, ee arg6) {
        int v1 = -1;
        if(arg5.an * 0x34FD735C == 0) {
            if(arg6.an * -979904968 == 0) {
                goto label_23;
            }

            if(this.al) {
                v1 = 1;
            }

            return v1;
        }
        else if(arg6.an * 0x297B4181 == 0) {
            if(this.al) {
            }
            else {
                v1 = 1;
            }

            return v1;
        }

    label_23:
        return this.al(((eg)arg5), ((eg)arg6), -4);
    }

    static nl[] ax(int arg2) {
        arg2 = 5;
        try {
            nl[] v2_1 = new nl[arg2];
            v2_1[0] = nl.an;
            v2_1[1] = nl.al;
            v2_1[2] = nl.ar;
            v2_1[3] = nl.ae;
            v2_1[4] = nl.ax;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("kq.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static final String bb(int arg0, int arg1, byte arg2) {
        arg1 -= arg0;
        if(arg1 >= -9) {
            goto label_9;
        }

        arg0 = 0xFF0000;
        arg1 = 1844206700;
        try {
            return im.al(arg0, arg1);
        label_9:
            if(arg1 < -6) {
                return im.al(0xFF3000, 0xB47155FB);
            }

            if(arg1 < -3) {
                return im.al(0xFF7000, 2013062954);
            }

            if(arg1 < 0) {
                return im.al(0xFFB000, 0x4610D9EC);
            }

            if(arg1 > 9) {
                return im.al(0xFF00, 0x3A909A08);
            }

            if(arg1 > 6) {
                return im.al(0x40FF00, 0xAAA785E4);
            }

            if(arg1 > 3) {
                return im.al(0x80FF00, 0x15A9BFD8);
            }

            if(arg1 > 0) {
                return im.al(0xC0FF00, 0x483C4FB6);
            }

            return im.al(0xFFFF00, 0xC1CF0B72);
        label_8:
        }
        catch(RuntimeException v0) {
            goto label_8;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("kq.bb(");
        v1.append(')');
        throw lx.al(((Throwable)v0), v1.toString());
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ab(((ee)arg2), ((ee)arg3), 0x2F4D2D8B);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("kq.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

