public class co extends cg {
    final int ad;
    final int aj;
    final int an;
    final cn ap;
    public static final int as = 24;
    public static final int ca = 70;
    static final int cp = 24;
    static int hu;

    co(af arg1, af arg2, int arg3, cn arg4) {
        try {
            super(arg1, arg2);
            this.an = arg3 * 1685809939;
            this.ap = arg4;
            es v1_1 = ae.al(this.al(-113), 16).ap(false, 16);
            if(v1_1 != null) {
                this.aj = v1_1.al * 0x2F36F99D;
                this.ad = v1_1.ae * 0x160010F7;
            }
            else {
                this.aj = 0;
                this.ad = 0;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("co.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    int aa() {
        return this.aj * 787011764;
    }

    public int ab() {
        return this.an * 0xD4CF171B;
    }

    cn ae(byte arg3) {
        try {
            return this.ap;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("co.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    cn af() {
        return this.ap;
    }

    static byte[] ai(byte[] arg2, int arg3) {
        try {
            arg3 = arg2.length;
            byte[] v0 = new byte[arg3];
            System.arraycopy(arg2, 0, v0, 0, arg3);
            return v0;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("co.ai(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    int ai() {
        return this.aj * 0xD50254B5;
    }

    public int al(byte arg3) {
        int v3 = 0xD4CF171B;
        try {
            return this.an * v3;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("co.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    int am() {
        return this.ad * 0xDEBFB0C7;
    }

    int an(int arg3) {
        arg3 = 0xDEBFB0C7;
        try {
            return this.ad * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("co.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static boolean aq(int arg2) {
        arg2 = 0xDDB5E297;
        try {
            if(kv.an * arg2 != 0) {
                return 1;
            }

            return kv.ar.av(-5);
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("co.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public int aq() {
        return this.an * 0xD4CF171B;
    }

    int ar(int arg3) {
        try {
            return this.aj * 0xD50254B5;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("co.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int au() {
        return this.aj * 0xD50254B5;
    }

    int av() {
        return this.aj * 0xD50254B5;
    }

    public static void ax(ko arg1, byte arg2) {
        try {
            di.ax = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("co.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    int az() {
        return this.ad * 0xDEBFB0C7;
    }

    static int bd(int arg9, hl arg10, boolean arg11, int arg12) {
        String[] v10_2;
        Object v9_3;
        boolean v4_1;
        int v5;
        int v2;
        int v11 = 0x4A90AB9;
        arg12 = 1304812425;
        if(arg9 != 0xF3F) {
            goto label_25;
        }

        try {
            int[] v9_1 = il.aj;
            int v10 = il.ad - v11;
            il.ad = v10;
            arg9 = v9_1[v10 * arg12];
            int[] v10_1 = il.aj;
            int v1 = il.ad + v11;
            il.ad = v1;
            v10_1[v1 * arg12 - 1] = client.rn[arg9].ar(-68207507);
            return 1;
        label_25:
            v1 = 0xBAFCC783;
            if(arg9 == 0xF40) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = v9_1[v10 * arg12];
                v10_1 = il.aj;
                v2 = il.ad + v11;
                il.ad = v2;
                v10_1[v2 * arg12 - 1] = client.rn[arg9].al * v1;
                return 1;
            }

            v2 = 0xFF7F8B3F;
            if(arg9 == 0xF41) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = v9_1[v10 * arg12];
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v10_1[v1 * arg12 - 1] = client.rn[arg9].ae * v2;
                return 1;
            }

            int v3 = 0x8D921141;
            if(0xF42 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = v9_1[v10 * arg12];
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v10_1[v1 * arg12 - 1] = client.rn[arg9].ar * v3;
                return 1;
            }

            if(arg9 == 0xF43) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = v9_1[v10 * arg12];
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v10_1[v1 * arg12 - 1] = client.rn[arg9].an * 0x9352F621;
                return 1;
            }

            if(0xF44 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = v9_1[v10 * arg12];
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v10_1[v1 * arg12 - 1] = client.rn[arg9].ap * 0xADF7FF8D;
                return 1;
            }

            int v4 = 0;
            if(arg9 == 0xF46) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = client.rn[v9_1[v10 * arg12]].ae(0x4CBF95D9);
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v1 = v1 * arg12 - 1;
                if(arg9 == 0) {
                    v4 = 1;
                }

                v10_1[v1] = v4;
                return 1;
            }

            v5 = 2;
            if(0xF47 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = client.rn[v9_1[v10 * arg12]].ae(0xCA5FD6F3);
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v1 = v1 * arg12 - 1;
                if(arg9 == v5) {
                    v4 = 1;
                }

                v10_1[v1] = v4;
                return 1;
            }

            if(0xF48 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = client.rn[v9_1[v10 * arg12]].ae(708108837);
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v1 = v1 * arg12 - 1;
                if(arg9 == 5) {
                    v4 = 1;
                }

                v10_1[v1] = v4;
                return 1;
            }

            if(arg9 == 0xF49) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                arg9 = client.rn[v9_1[v10 * arg12]].ae(0x44BA2F26);
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v1 = v1 * arg12 - 1;
                if(1 == arg9) {
                    v4 = 1;
                }

                v10_1[v1] = v4;
                return 1;
            }

            if(0xF4A == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                if(v9_1[v10 * arg12] == 1) {
                    v4_1 = true;
                }

                if(js.rl != null) {
                    js.rl.ax(nm.ar, v4_1, 0x9556EFB);
                }

                return 1;
            }

            if(0xF4B == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                if(v9_1[v10 * arg12] == 1) {
                    v4_1 = true;
                }

                if(js.rl != null) {
                    js.rl.ax(nm.ae, v4_1, 0xC7F8D6A9);
                }

                return 1;
            }

            if(arg9 == 0xF4C) {
                il.ad -= 0x9521572;
                boolean v9_2 = 1 == il.aj[il.ad * arg12] ? true : false;
                if(1 == il.aj[il.ad * arg12 + 1]) {
                    v4_1 = true;
                }

                if(js.rl != null) {
                    client.rh.ax = v4_1;
                    js.rl.ax(client.rh, v9_2, -567773540);
                }

                return 1;
            }

            if(0xF4D == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                if(v9_1[v10 * arg12] == 1) {
                    v4_1 = true;
                }

                if(js.rl != null) {
                    js.rl.ax(nm.al, v4_1, 0x8AA6C6E3);
                }

                return 1;
            }

            if(0xF4E == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                if(v9_1[v10 * arg12] == 1) {
                    v4_1 = true;
                }

                if(js.rl != null) {
                    js.rl.ax(nm.an, v4_1, 0xDC91621B);
                }

                return 1;
            }

            if(0xF4F == arg9) {
                v9_1 = il.aj;
                v10 = il.ad + v11;
                il.ad = v10;
                v10 = v10 * arg12 - 1;
                if(js.rl == null) {
                }
                else {
                    v4 = js.rl.ax.size();
                }

                v9_1[v10] = v4;
                return 1;
            }

            if(arg9 == 0xF50) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                v9_3 = js.rl.ax.get(v9_1[v10 * arg12]);
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v10_1[v1 * arg12 - 1] = ((nu)v9_3).ax * 460973165;
                return 1;
            }

            v4 = 0xBC5CDEAD;
            int v6 = 0x8FA23525;
            if(arg9 == 0xF51) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                v9_3 = js.rl.ax.get(v9_1[v10 * arg12]);
                v10_2 = il.aq;
                v11 = ft.ab + v6;
                ft.ab = v11;
                v10_2[v11 * v4 - 1] = ((nu)v9_3).ax(0xFFFF00);
                return 1;
            }

            if(0xF52 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                v9_3 = js.rl.ax.get(v9_1[v10 * arg12]);
                v10_2 = il.aq;
                v11 = ft.ab + v6;
                ft.ab = v11;
                v10_2[v11 * v4 - 1] = ((nu)v9_3).al(0x2F1F0A86);
                return 1;
            }

            if(arg9 == 0xF53) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                long v10_3 = ji.ax(0x2076E2C1) - dh.rb * 0xE7908015C086ABDL - js.rl.ax.get(v9_1[v10 * arg12]).al * 0x5CFAD116F2438147L;
                arg9 = ((int)(v10_3 / 3600000));
                v10_3 -= ((long)(3600000 * arg9));
                arg12 = ((int)(v10_3 / 60000));
                v10 = ((int)((v10_3 - (((long)(60000 * arg12)))) / 1000));
                String v9_4 = arg9 + ":" + arg12 / 10 + arg12 % 10 + ":" + v10 / 10 + v10 % 10;
                v10_2 = il.aq;
                v11 = ft.ab + v6;
                ft.ab = v11;
                v10_2[v11 * v4 - 1] = v9_4;
                return 1;
            }

            if(0xF54 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                v9_3 = js.rl.ax.get(v9_1[v10 * arg12]);
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v10_1[v1 * arg12 - 1] = ((nu)v9_3).ae.ar * v3;
                return 1;
            }

            if(0xF55 == arg9) {
                v9_1 = il.aj;
                v10 = il.ad - v11;
                il.ad = v10;
                v9_3 = js.rl.ax.get(v9_1[v10 * arg12]);
                v10_1 = il.aj;
                v1 = il.ad + v11;
                il.ad = v1;
                v10_1[v1 * arg12 - 1] = ((nu)v9_3).ae.ae * v2;
                return 1;
            }

            if(0xF56 != arg9) {
                return v5;
            }

            v9_1 = il.aj;
            v10 = il.ad - v11;
            il.ad = v10;
            v9_3 = js.rl.ax.get(v9_1[v10 * arg12]);
            v10_1 = il.aj;
            v2 = il.ad + v11;
            il.ad = v2;
            v10_1[v2 * arg12 - 1] = ((nu)v9_3).ae.al * v1;
            return 1;
        label_24:
        }
        catch(RuntimeException v9) {
            goto label_24;
        }

        StringBuilder v10_4 = new StringBuilder();
        v10_4.append("co.bd(");
        v10_4.append(')');
        throw lx.al(((Throwable)v9), v10_4.toString());
        return v5;
    }

    static final void fe(hw arg10, int arg11, int arg12, byte arg13, int arg14) {
        try {
            int v0 = 0;
            int v1 = arg10.dc[0];
            int v2 = arg10.dj[0];
            arg14 = 0xCBF5CAC1;
            int v3 = arg10.ad(arg14);
            if(v1 >= v3) {
                int v4 = 104 - v3;
                if(v1 < v4 && v2 >= v3) {
                    if(v2 >= v4) {
                    }
                    else {
                        if(arg11 >= v3 && arg11 < v4 && arg12 >= v3) {
                            if(arg12 >= v4) {
                            }
                            else {
                                arg11 = ch.ax(v1, v2, arg10.ad(arg14), in.fd(arg11, arg12, 0x5D23CB14), client.gg[arg10.as * 0xD54EB40F], true, client.sj, client.sc, -57);
                                if(arg11 < 1) {
                                    return;
                                }

                                while(true) {
                                    if(v0 >= arg11 - 1) {
                                        return;
                                    }

                                    arg10.af(client.sj[v0], client.sc[v0], arg13, 380824684);
                                    ++v0;
                                }
                            }
                        }

                        return;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v10) {
            goto label_49;
        }

        return;
    label_49:
        StringBuilder v11 = new StringBuilder();
        v11.append("co.fe(");
        v11.append(')');
        throw lx.al(((Throwable)v10), v11.toString());
    }
}

