import java.io.IOException;
import java.util.Collection;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class dn extends mv {
    public static final int ad = 7;
    oc ae;
    public static final int ag = 34;
    static final int ah = 11;
    static gk al = null;
    public static final int aq = 0x700;
    static ko ax;

    static {
        dn.al = new gk(0x40, null);
    }

    dn() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dn.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa() {
    }

    public static dn ab(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dn.al.ax(v1);
        if(v0 != null) {
            return ((dn)v0);
        }

        byte[] v5 = dn.ax.ae(34, arg5, 0x78DC0DC9);
        dn v0_1 = new dn();
        if(v5 != null) {
            v0_1.ar(new lq(v5), -2002183860);
        }

        v0_1.ae(0xA83FFB5C);
        dn.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    static void ac(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                try {
                    arg5 = arg4[arg5];
                    if(arg5 != 0) {
                        arg8 = arg3[arg7] + arg5;
                        arg5 = (arg5 & 0xFF00FF) + (arg3[arg7] & 0xFF00FF);
                        arg6 = (0x1000100 & arg5) + (arg8 - arg5 & 0x10000);
                        arg3[arg7] = arg6 - (arg6 >>> 8) | arg8 - arg6;
                        ++arg7;
                    }
                    else {
                        goto label_27;
                    }

                    goto label_28;
                }
                catch(RuntimeException v0) {
                    StringBuilder v1 = new StringBuilder();
                    v1.append("dn.ac(");
                    v1.append(')');
                    throw lx.al(((Throwable)v0), v1.toString());
                }

            label_27:
                ++arg7;
            label_28:
                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }

    public static void ac(Collection arg1) {
        arg1.add(dn.al);
    }

    void ae(int arg1) {
    }

    public static dn af(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dn.al.ax(v1);
        if(v0 != null) {
            return ((dn)v0);
        }

        byte[] v5 = dn.ax.ae(34, arg5, 0x78DC0DC9);
        dn v0_1 = new dn();
        if(v5 != null) {
            v0_1.ar(new lq(v5), -2002183860);
        }

        v0_1.ae(0xDE86202B);
        dn.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    void ag(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-101);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, 0xC8F46B86);
        }
    }

    void ah(lq arg2, int arg3) {
        if(arg3 == 0xF9) {
            this.ae = cn.ax(arg2, this.ae, 1608096209);
        }
    }

    public static dn ai(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dn.al.ax(v1);
        if(v0 != null) {
            return ((dn)v0);
        }

        byte[] v5 = dn.ax.ae(34, arg5, 0x78DC0DC9);
        dn v0_1 = new dn();
        if(v5 != null) {
            v0_1.ar(new lq(v5), -2002183860);
        }

        v0_1.ae(0x2BAA04E);
        dn.al.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public String aj(int arg2, String arg3, int arg4) {
        try {
            return az.ae(this.ae, arg2, arg3, -107049639);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("dn.aj(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static void ak(Collection arg1) {
        arg1.add(dn.al);
    }

    void am(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-83);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, 0xB2704360);
        }
    }

    public static final ht an(mq arg8, int arg9, int arg10, int arg11) {
        ht v0;
        int v8 = 0x2C18D40D;
        try {
            if(ht.ax * v8 == 0) {
                goto label_76;
            }
        }
        catch(RuntimeException v8_1) {
            goto label_81;
        }

        if(arg9 >= 0) {
            byte v8_2 = 2;
            if(arg9 < v8_2) {
                if(arg10 < 0x100) {
                    arg10 = 0x100;
                }

                try {
                    v0 = nk.aq.ax(0);
                    int v1 = ht.al ? 2 : 1;
                    v0.af = new int[v1 * 0x100];
                    v0.aa(v8_2);
                    v0.aa = ((arg10 & 0xFFFFFC00) + 0x400) * -860272805;
                    arg10 = 556110035;
                    if(v0.aa * arg10 > 0x4000) {
                        v0.aa = 0x51D6C000;
                    }

                    v0.au(v0.aa * arg10, 13);
                    if(ht.an * 0xEA37517D > 0 && ig.ap == null) {
                        ig.ap = new hc();
                        ht.ar = Executors.newScheduledThreadPool(1);
                        ht.ar.scheduleAtFixedRate(ig.ap, 0, 1, TimeUnit.MILLISECONDS);
                    }

                    if(ig.ap != null) {
                        if(ig.ap.ax[arg9] == null) {
                            ig.ap.ax[arg9] = v0;
                        }
                        else {
                            throw new IllegalArgumentException();
                        }
                    }

                    return v0;
                }
                catch(RuntimeException v8_1) {
                }
                catch(Throwable ) {
                    try {
                        return new gp();
                    }
                    catch(RuntimeException v8_1) {
                        goto label_81;
                    }

                    return v0;
                    try {
                    label_73:
                        throw new IllegalArgumentException();
                    label_76:
                        throw new IllegalStateException();
                    }
                    catch(RuntimeException v8_1) {
                    label_81:
                        StringBuilder v9 = new StringBuilder();
                        v9.append("dn.an(");
                        v9.append(')');
                        throw lx.al(((Throwable)v8_1), v9.toString());
                    }
                }
            }
        }

        goto label_73;
    }

    void an(lq arg1, int arg2, int arg3) {
        if(arg2 == 0xF9) {
            try {
                this.ae = cn.ax(arg1, this.ae, 0xE0848E23);
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("dn.an(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }
    }

    static void ao(int[] arg9, byte[] arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20, short arg21) {
        int v0 = -arg17;
        int v1 = arg13;
        int v2 = arg14;
        while(v0 < 0) {
            int v3 = (v1 >> 16) * arg20;
            int v5 = -arg16;
            int v6 = arg12;
            while(v5 < 0) {
                int v7 = (v6 >> 16) + v3;
                try {
                    v7 = arg10[v7];
                    if(v7 != 0) {
                        arg9[v2] = arg11[v7 & 0xFF];
                        ++v2;
                    }
                    else {
                        goto label_21;
                    }

                    goto label_22;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v1_1 = new StringBuilder();
                    v1_1.append("dn.ao(");
                    v1_1.append(')');
                    throw lx.al(((Throwable)v0_1), v1_1.toString());
                }

            label_21:
                ++v2;
            label_22:
                v6 += arg18;
                ++v5;
            }

            v1 += arg19;
            v2 += arg15;
            ++v0;
        }
    }

    public String ao(int arg3, String arg4) {
        return az.ae(this.ae, arg3, arg4, -107049639);
    }

    public int ap(int arg2, int arg3, short arg4) {
        try {
            return bq.al(this.ae, arg2, arg3, 2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("dn.ap(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static void aq(ko arg0) {
        dn.ax = arg0;
    }

    void ar(lq arg2, int arg3) {
        while(true) {
            byte v3 = -67;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.an(arg2, arg3, -1815550860);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dn.ar(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public String as(int arg3, String arg4) {
        return az.ae(this.ae, arg3, arg4, -107049639);
    }

    public int at(int arg3, int arg4) {
        return bq.al(this.ae, arg3, arg4, 2);
    }

    void au() {
    }

    void av() {
    }

    public String aw(int arg3, String arg4) {
        return az.ae(this.ae, arg3, arg4, -107049639);
    }

    public int ay(int arg3, int arg4) {
        return bq.al(this.ae, arg3, arg4, 2);
    }

    void az(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-102);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, 0x3B04872D);
        }
    }

    public static void bd(Collection arg1) {
        arg1.add(dn.al);
    }

    static final void em(boolean arg2, int arg3) {
        arg3 = 156333038;
        try {
            cw.bu(arg3);
            client.eh.af += 0x151CFBD3;
            if(client.eh.af * 0x7322145B < 50 && !arg2) {
                return;
            }

            client.eh.af = 0;
            if(client.ex) {
                return;
            }

            if(client.eh.aj(1162731093) == null) {
                return;
            }

            client.eh.ae(cd.al(nf.do, client.eh.an, -2070536420), 873978740);
            try {
                client.eh.al(2);
            }
            catch(IOException ) {
                try {
                    client.ex = true;
                }
                catch(RuntimeException v2) {
                label_41:
                    StringBuilder v3 = new StringBuilder();
                    v3.append("dn.em(");
                    v3.append(')');
                    throw lx.al(((Throwable)v2), v3.toString());
                }
            }
        }
        catch(RuntimeException v2) {
            goto label_41;
        }
    }
}

