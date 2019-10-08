import com.jagex.oldscape.osrenderer.ax;

public class as {
    long ab;
    int ad;
    int[] ae;
    int aj;
    int al;
    int an;
    int ap;
    boolean aq;
    int ar;
    int ax;
    public static final int bz = 52;
    static final int hq = 16;
    static boolean me;

    as() {
        try {
            super();
            this.aq = false;
            this.ax(1, 1, 0x6FA60E73);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("as.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int[] aa() {
        return this.ae;
    }

    public final void ab(int arg2, int arg3) {
        this.ax = 0x85560C0B * arg2;
        this.al = 0x5F7239AF * arg3;
        arg3 *= arg2;
        if(this.ae == null || arg3 != this.ae.length) {
            this.ae = new int[arg3];
        }
    }

    public final void ad(int arg2, int arg3) {
        this.ax = 0x85560C0B * arg2;
        this.al = 0x5F7239AF * arg3;
        arg3 *= arg2;
        if(this.ae == null || arg3 != this.ae.length) {
            this.ae = new int[arg3];
        }
    }

    public int[] ae(int arg3) {
        try {
            return this.ae;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("as.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void af(int arg2, int arg3, int arg4, int arg5) {
        this.ar = arg2 * 0x2979867;
        this.an = arg3 * 36063835;
        this.ap = arg4 * 566530419;
        this.aj = arg5 * 0x1B8576FC;
    }

    final void ag() {
        if(!this.aq) {
            ax.by(-1643039408);
        }
    }

    final void ah(boolean arg8) {
        long v0 = System.nanoTime();
        int v8 = (((int)arg8)) & ax.ab(0x76C5FCB6);
        if(v8 != 0) {
            ax.aa(this.ax * 0xA3E31FA3, this.al * 0x7F6BD4F, 0x2441407C);
            ax.av(this.ax * 0xA3E31FA3, this.al * 0x7F6BD4F, 0x7ECE9D5E);
            ax.au(this.ar * -1693308297, this.an * 1204071295, this.ap * -1022120885, this.aj * 0x6251D3F7, 0x7F);
            if(this.aq) {
                ax.an(0x39224EE8);
            }
            else {
                ax.ar(2072211933);
            }

            ax.am(this.ae, 2016304747);
            ax.at(0xD21DC9D7);
        }

        if(!this.aq) {
            ax.ah(((boolean)v8), -445428604);
        }

        int v3 = v8 != 0 ? ax.bd(0x3F209ED2) : 0;
        this.ad = v3 * -505288891;
        this.aq = false;
        ax.ap(((boolean)v8), 2092170146);
        this.ab = (System.nanoTime() - v0) * 0x3771CB0B66B8331L;
        ax.aj(320551043);
    }

    static int ai(int arg12, hl arg13, boolean arg14, int arg15) {
        int v8;
        int[] v7_1;
        arg15 = 1304812425;
        int v0 = 0x4A90AB9;
        if(arg12 >= 2000) {
            arg12 += -1000;
            try {
                int[] v13 = il.aj;
                int v14 = il.ad - v0;
                il.ad = v14;
                ar v13_1 = bl.al(v13[v14 * arg15], 0x64D7CF4D);
                goto label_18;
            label_14:
                v13_1 = arg14 ? il.aa : dw.av;
            label_18:
                String[] v14_1 = il.aq;
                int v2 = 0x8FA23525;
                int v1 = ft.ab - v2;
                ft.ab = v1;
                int v3 = 0xBC5CDEAD;
                String v14_2 = v14_1[v1 * v3];
                int[] v5 = null;
                if(v14_2.length() <= 0 || v14_2.charAt(v14_2.length() - 1) != 89) {
                    v7_1 = v5;
                }
                else {
                    int[] v1_1 = il.aj;
                    int v7 = il.ad - v0;
                    il.ad = v7;
                    v1 = v1_1[v7 * arg15];
                    if(v1 > 0) {
                        v7_1 = new int[v1];
                        while(true) {
                            v8 = v1 - 1;
                            if(v1 > 0) {
                                v1_1 = il.aj;
                                int v9 = il.ad - v0;
                                il.ad = v9;
                                v7_1[v8] = v1_1[v9 * arg15];
                                v1 = v8;
                                continue;
                            }

                            break;
                        }
                    }
                    else {
                        v7_1 = v5;
                    }

                    v14_2 = v14_2.substring(0, v14_2.length() - 1);
                }

                Object[] v1_2 = new Object[v14_2.length() + 1];
                for(v8 = v1_2.length - 1; v8 >= 1; --v8) {
                    if(v14_2.charAt(v8 - 1) == 0x73) {
                        String[] v9_1 = il.aq;
                        int v10 = ft.ab - v2;
                        ft.ab = v10;
                        v1_2[v8] = v9_1[v10 * v3];
                    }
                    else {
                        int[] v10_1 = il.aj;
                        int v11 = il.ad - v0;
                        il.ad = v11;
                        v1_2[v8] = new Integer(v10_1[v11 * arg15]);
                    }
                }

                int[] v14_3 = il.aj;
                v2 = il.ad - v0;
                il.ad = v2;
                v14 = v14_3[v2 * arg15];
                if(-1 != v14) {
                    v1_2[0] = new Integer(v14);
                }
                else {
                    v1_2 = ((Object[])v5);
                }

                if(1400 == arg12) {
                    v13_1.em = v1_2;
                }
                else if(1401 == arg12) {
                    v13_1.el = v1_2;
                }
                else if(1402 == arg12) {
                    v13_1.en = v1_2;
                }
                else if(arg12 == 1403) {
                    v13_1.ew = v1_2;
                }
                else if(1404 == arg12) {
                    v13_1.eg = v1_2;
                }
                else if(1405 == arg12) {
                    v13_1.eu = v1_2;
                }
                else if(1406 == arg12) {
                    v13_1.es = v1_2;
                }
                else if(arg12 == 0x57F) {
                    v13_1.eb = v1_2;
                    v13_1.eh = v7_1;
                }
                else if(arg12 == 0x580) {
                    v13_1.ef = v1_2;
                }
                else if(1409 == arg12) {
                    v13_1.eo = v1_2;
                }
                else if(arg12 == 1410) {
                    v13_1.ee = v1_2;
                }
                else if(arg12 == 0x583) {
                    v13_1.ey = v1_2;
                }
                else if(arg12 == 0x584) {
                    v13_1.ev = v1_2;
                }
                else if(0x586 == arg12) {
                    v13_1.ec = v1_2;
                    v13_1.ei = v7_1;
                }
                else if(arg12 == 0x587) {
                    v13_1.ex = v1_2;
                    v13_1.ep = v7_1;
                }
                else if(0x588 == arg12) {
                    v13_1.ed = v1_2;
                }
                else if(arg12 == 0x589) {
                    v13_1.et = v1_2;
                }
                else if(arg12 == 0x58A) {
                    v13_1.fa = v1_2;
                }
                else if(0x58B == arg12) {
                    v13_1.fe = v1_2;
                }
                else if(arg12 == 1420) {
                    v13_1.fd = v1_2;
                }
                else if(0x58D == arg12) {
                    v13_1.fz = v1_2;
                }
                else if(0x58E == arg12) {
                    v13_1.fy = v1_2;
                }
                else if(0x58F == arg12) {
                    v13_1.fh = v1_2;
                }
                else if(arg12 == 0x590) {
                    v13_1.fl = v1_2;
                }
                else if(0x591 == arg12) {
                    v13_1.fv = v1_2;
                }
                else if(arg12 == 0x592) {
                    v13_1.fc = v1_2;
                }
                else if(arg12 == 0x593) {
                    v13_1.fk = v1_2;
                }
                else {
                    return 2;
                }

                v13_1.eq = true;
                return 1;
            }
            catch(RuntimeException v12) {
                goto label_219;
            }
        }
        else {
            goto label_14;
        }

        goto label_18;
        return 2;
    label_219:
        StringBuilder v13_2 = new StringBuilder();
        v13_2.append("as.ai(");
        v13_2.append(')');
        throw lx.al(((Throwable)v12), v13_2.toString());
    }

    void ai(int arg2, int arg3, int arg4, int arg5) {
        this.ar = arg2 * 0xE760CF47;
        this.an = arg3 * 36063835;
        this.ap = arg4 * 0xDDF81081;
        this.aj = arg5 * -1198363021;
    }

    public static int aj(int arg1, int arg2) {
        try {
            return mj.ad(bc.az[arg1]);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("as.aj(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void aj(byte arg3) {
        try {
            this.aq = true;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("as.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ak() {
        this.aq = true;
    }

    public static String al(long arg11) {
        String v0 = null;
        long v1 = 0;
        if(arg11 > v1) {
            if(arg11 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                try {
                    if(arg11 % v3 == v1) {
                        return v0;
                    }
                    else {
                        int v0_1 = 0;
                        long v5;
                        for(v5 = arg11; v1 != v5; v5 /= v3) {
                            ++v0_1;
                        }

                        StringBuilder v5_1 = new StringBuilder(v0_1);
                        while(v1 != arg11) {
                            long v6 = arg11 / v3;
                            v5_1.append(lz.ax[((int)(arg11 - v6 * v3))]);
                            arg11 = v6;
                        }

                        return v5_1.reverse().toString();
                    }
                }
                catch(RuntimeException v11) {
                    StringBuilder v12 = new StringBuilder();
                    v12.append("as.al(");
                    v12.append(')');
                    throw lx.al(((Throwable)v11), v12.toString());
                }
            }
        }

        return v0;
    }

    void al(int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1 *= 0xE760CF47;
        try {
            this.ar = arg1;
            this.an = arg2 * 36063835;
            this.ap = arg3 * 566530419;
            this.aj = arg4 * 450420167;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("as.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    final void am() {
        if(!this.aq) {
            ax.by(-1397840604);
        }
    }

    final void an(boolean arg7, int arg8) {
        try {
            long v0 = System.nanoTime();
            int v7_1 = (((int)arg7)) & ax.ab(0x76C5FCB6);
            if(v7_1 != 0) {
                ax.aa(this.ax * 0xA3E31FA3, this.al * 0x7F6BD4F, 0xBEB2FF6F);
                ax.av(this.ax * 0xA3E31FA3, this.al * 0x7F6BD4F, 2040300808);
                ax.au(this.ar * -1693308297, this.an * 1110037971, this.ap * 0xE7AFBBB, this.aj * 0x6251D3F7, 0x20);
                if(this.aq) {
                    ax.an(-303780463);
                }
                else {
                    ax.ar(2090189282);
                }

                ax.am(this.ae, 0x7E799769);
                ax.at(0xD21DC9D7);
            }

            if(!this.aq) {
                ax.ah(((boolean)v7_1), -208357905);
            }

            int v2 = v7_1 != 0 ? ax.bd(0xCFA2490D) : 0;
            this.ad = v2 * 396220585;
            this.aq = false;
            ax.ap(((boolean)v7_1), 2091923047);
            this.ab = (System.nanoTime() - v0) * 0x3771CB0B66B8331L;
            ax.aj(-1260686366);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("as.an(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public void ao() {
        this.aq = true;
    }

    public static void ap(int arg7, ko arg8, String arg9, String arg10, int arg11, boolean arg12, int arg13) {
        arg13 = 0xD4A3E869;
        try {
            int v2 = arg8.ay(arg9, arg13);
            er.aj(arg7, arg8, v2, arg8.aw(v2, arg10, 0xA9EAC8FA), arg11, arg12, 0xF1C925FC);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("as.ap(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    int ap(int arg3) {
        arg3 = 0x30B04B99;
        try {
            return this.ad * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("as.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final void aq(int arg2, int arg3) {
        this.ax = 0x85560C0B * arg2;
        this.al = 0x28951EC0 * arg3;
        arg3 *= arg2;
        if(this.ae == null || arg3 != this.ae.length) {
            this.ae = new int[arg3];
        }
    }

    final void ar(byte arg3) {
        try {
            if(!this.aq) {
                ax.by(-1950925941);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("as.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void as() {
        this.aq = true;
    }

    final void at(boolean arg8) {
        long v0 = System.nanoTime();
        int v8 = (((int)arg8)) & ax.ab(0x76C5FCB6);
        if(v8 != 0) {
            ax.aa(this.ax * 0xA3E31FA3, this.al * 0x7F6BD4F, 0x20ABBB17);
            ax.av(this.ax * 0xA3E31FA3, this.al * 0x7F6BD4F, 2043725950);
            ax.au(this.ar * -1693308297, this.an * 1110037971, this.ap * 0xE7AFBBB, this.aj * 0x6251D3F7, 19);
            if(this.aq) {
                ax.an(0x6E2C4774);
            }
            else {
                ax.ar(2102172219);
            }

            ax.am(this.ae, 2008970367);
            ax.at(0xD21DC9D7);
        }

        if(!this.aq) {
            ax.ah(((boolean)v8), 0xFBE3CB98);
        }

        int v3 = v8 != 0 ? ax.bd(0xD414AC75) : 0;
        this.ad = v3 * 396220585;
        this.aq = false;
        ax.ap(((boolean)v8), 2056405511);
        this.ab = (System.nanoTime() - v0) * 0x3771CB0B66B8331L;
        ax.aj(2058305091);
    }

    public int[] au() {
        return this.ae;
    }

    public int[] av() {
        return this.ae;
    }

    int aw() {
        return this.ad * 0x30B04B99;
    }

    public final void ax(int arg1, int arg2, int arg3) {
        arg3 = 0x85560C0B * arg1;
        try {
            this.ax = arg3;
            this.al = 0x5F7239AF * arg2;
            arg2 *= arg1;
            if(this.ae == null || arg2 != this.ae.length) {
                this.ae = new int[arg2];
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("as.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    int ay() {
        return this.ad * 0x30B04B99;
    }

    final void az() {
        if(!this.aq) {
            ax.by(-1178370533);
        }
    }
}

