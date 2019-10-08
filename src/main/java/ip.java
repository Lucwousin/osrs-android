public class ip extends gx {
    static final int br = 300000;
    public static final int bs = 65;

    ip() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ip.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    protected boolean ae(int arg1, int arg2, int arg3, gy arg4) {
        boolean v1 = this.ax * 0xDF453919 != arg2 || arg3 != this.al * 0x6D26E86D ? false : true;
        return v1;
    }

    protected boolean al(int arg1, int arg2, int arg3, gy arg4) {
        boolean v1 = this.ax * 0x753E83F2 != arg2 || arg3 != this.al * -1018154403 ? false : true;
        return v1;
    }

    protected boolean ax(int arg1, int arg2, int arg3, gy arg4, byte arg5) {
        arg1 = 0xDF453919;
        try {
            if(this.ax * arg1 != arg2) {
                return false;
            }
            else if(arg3 != this.al * 0x6D26E86D) {
                return false;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ip.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        boolean v1_1 = true;
        return v1_1;
    }

    public static final fi fa(int arg0, int arg1, int arg2, int arg3) {
        try {
            return client.ka[arg0][arg1][arg2];
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ip.fa(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static final void fs(ar arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        int v0;
        try {
            client.gq = client.gp ? 0xA390FC20 : 0;
            client.gp = false;
            if(dt.bu.ax == ik.aj) {
                int v10 = -1709401324;
                if(arg8 >= arg4 && arg8 < arg4 + 16 && arg9 >= arg5 && arg9 < arg5 + 16) {
                    arg3.bh -= v10;
                    kx.gw(arg3, 0x7F14C193);
                    goto label_74;
                }

                if(arg8 >= arg4 && arg8 < arg4 + 16) {
                    v0 = arg5 + arg6;
                    if(arg9 >= v0 - 16 && arg9 < v0) {
                        arg3.bh += v10;
                        kx.gw(arg3, 0x7F992B5E);
                        goto label_74;
                    }
                }

                v0 = 0x87B1FC21;
                if(arg8 < arg4 - client.gq * v0) {
                    goto label_74;
                }

                if(arg8 >= client.gq * v0 + (arg4 + 16)) {
                    goto label_74;
                }

                if(arg9 < arg5 + 16) {
                    goto label_74;
                }

                if(arg9 >= arg5 + arg6 - 16) {
                    goto label_74;
                }

                v10 = arg6 - 0x20;
                v0 = arg6 * v10 / arg7;
                if(v0 < 8) {
                    v0 = 8;
                }

                arg3.bh = (arg9 - arg5 - 16 - v0 / 2) * (arg7 - arg6) / (v10 - v0) * -427350331;
                kx.gw(arg3, 0x7FFB4EC4);
                client.gp = true;
            }

        label_74:
            if(client.no * 0x9E642109 != 0 && arg8 >= arg4 - arg3.by * 0x1804E4A5 && arg9 >= arg5 && arg8 < arg4 + 16 && arg9 <= arg6 + arg5) {
                arg3.bh += client.no * 0x8C9916A9;
                kx.gw(arg3, 0x7F76C6BA);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ip.fs(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }
}

