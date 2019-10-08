public class cz {
    static final int ad = 20;
    public static final cz ae = null;
    public static final cz al = null;
    public static final int am = 8;
    final int an;
    final int ap;
    final int ar;
    public static final cz ax = null;
    static final int be = 11;

    static {
        cz.ax = new cz(0, 0, 4);
        cz.al = new cz(2, 1, 2);
        cz.ae = new cz(1, 2, 0);
    }

    cz(int arg2, int arg3, int arg4) {
        try {
            super();
            this.ar = arg2 * 0xDF531581;
            this.an = arg3 * 0x699C89F;
            this.ap = arg4 * 0x96C429AF;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cz.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    static cz ab(int arg5) {
        cz[] v0 = cz.ax(0x65E8283F);
        int v1;
        for(v1 = 0; v1 < v0.length; ++v1) {
            cz v2 = v0[v1];
            if(v2.an * 0x3D3D535F == arg5) {
                return v2;
            }
        }

        return null;
    }

    boolean ad(float arg3) {
        boolean v3 = arg3 >= (((float)(this.ap * 0x80CACD4F))) ? true : false;
        return v3;
    }

    static cz ae(int arg4, int arg5) {
        cz v1;
        int v0;
        arg5 = 1300379211;
        try {
            cz[] v5 = cz.ax(arg5);
            v0 = 0;
            while(true) {
            label_3:
                if(v0 >= v5.length) {
                    return null;
                }

                v1 = v5[v0];
                if(v1.an * 0x3D3D535F != arg4) {
                    goto label_11;
                }

                return v1;
            }
        }
        catch(RuntimeException v4) {
            goto label_17;
        }

        return v1;
    label_11:
        ++v0;
        goto label_3;
        return null;
    label_17:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("cz.ae(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }

    static final int ah(int arg1, int arg2, int arg3) {
        if(-1 == arg1) {
            return 0xBC614E;
        }

        arg2 *= arg1 & 0x7F;
        try {
            arg2 /= 0x80;
            arg3 = 0x7E;
            if(arg2 >= 2) {
                goto label_12;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cz.ah(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        arg2 = 2;
        goto label_14;
    label_12:
        if(arg2 > arg3) {
            arg2 = 0x7E;
        }

    label_14:
        return arg2 + (arg1 & 0xFF80);
    }

    static void aj(int arg2) {
        try {
            jb.ax = new oh(0x20);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cz.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    boolean aj(float arg3) {
        boolean v3 = arg3 >= (((float)(this.ap * 0x80CACD4F))) ? true : false;
        return v3;
    }

    boolean al(float arg2, int arg3) {
        arg3 = 0x80CACD4F;
        try {
            if(arg2 < (((float)(this.ap * arg3)))) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cz.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }

    static cz[] an() {
        return new cz[]{cz.ae, cz.al, cz.ax};
    }

    static final void ap(int arg6, int arg7, int arg8, int arg9) {
        int v0 = 0;
        while(true) {
        label_2:
            int v1 = 8;
            if(v0 >= v1) {
                goto label_16;
            }

            int v2 = 0;
            while(true) {
                if(v2 >= v1) {
                    goto label_14;
                }

                try {
                    id.ax[arg6][v0 + arg7][arg8 + v2] = 0;
                    ++v2;
                    continue;
                label_14:
                    ++v0;
                    goto label_2;
                label_16:
                    arg9 = 1;
                    if(arg7 > 0) {
                        for(v0 = 1; v0 < v1; ++v0) {
                            int v3 = v0 + arg8;
                            id.ax[arg6][arg7][v3] = id.ax[arg6][arg7 - 1][v3];
                        }
                    }

                    if(arg8 > 0) {
                        while(arg9 < v1) {
                            v2 = arg9 + arg7;
                            id.ax[arg6][v2][arg8] = id.ax[arg6][v2][arg8 - 1];
                            ++arg9;
                        }
                    }

                    if(arg7 > 0) {
                        v0 = arg7 - 1;
                        if(id.ax[arg6][v0][arg8] != 0) {
                            id.ax[arg6][arg7][arg8] = id.ax[arg6][v0][arg8];
                        }
                        else {
                            goto label_64;
                        }
                    }
                    else {
                    label_64:
                        if(arg8 > 0) {
                            v0 = arg8 - 1;
                            if(id.ax[arg6][arg7][v0] != 0) {
                                id.ax[arg6][arg7][arg8] = id.ax[arg6][arg7][v0];
                                return;
                            }
                        }

                        if(arg7 <= 0) {
                            return;
                        }

                        if(arg8 <= 0) {
                            return;
                        }

                        v0 = arg7 - 1;
                        v1 = arg8 - 1;
                        if(id.ax[arg6][v0][v1] == 0) {
                            return;
                        }

                        id.ax[arg6][arg7][arg8] = id.ax[arg6][v0][v1];
                        return;
                    label_33:
                        break;
                    }

                    return;
                }
                catch(RuntimeException v6) {
                    goto label_33;
                }
            }
        }

        StringBuilder v7 = new StringBuilder();
        v7.append("cz.ap(");
        v7.append(')');
        throw lx.al(((Throwable)v6), v7.toString());
    }

    static cz[] ap() {
        return new cz[]{cz.ae, cz.al, cz.ax};
    }

    static cz aq(int arg5) {
        cz[] v0 = cz.ax(0x6AE505CB);
        int v1;
        for(v1 = 0; v1 < v0.length; ++v1) {
            cz v2 = v0[v1];
            if(v2.an * 0x3D3D535F == arg5) {
                return v2;
            }
        }

        return null;
    }

    static cz[] ar() {
        return new cz[]{cz.ae, cz.al, cz.ax};
    }

    static cz[] ax(int arg2) {
        arg2 = 3;
        try {
            cz[] v2_1 = new cz[arg2];
            v2_1[0] = cz.ae;
            v2_1[1] = cz.al;
            v2_1[2] = cz.ax;
            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cz.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static String ax(byte[] arg2, int arg3) {
        try {
            return hj.al(arg2, 0, arg2.length, 0xB7140409);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cz.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

