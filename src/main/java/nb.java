import java.util.HashMap;

public class nb {
    int[] ae;
    static final float aj = 3f;
    or al;
    int an;
    static final int ap = 0x100;
    int[] ar;
    final HashMap ax;

    public nb() {
        try {
            super();
            this.ax = new HashMap();
            this.al = new or(0, 0);
            this.ae = new int[0x800];
            this.ar = new int[0x800];
            this.an = 0;
            kf.ax(-38);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("nb.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public final void aa(int arg4, int arg5) {
        if(this.an * 0x93204E64 >= this.ae.length) {
            return;
        }

        this.ae[this.an * 748020289] = arg4;
        this.ar[this.an * 1841202081] = arg5;
        this.an += 1681100168;
    }

    void ab(int arg17) {
        int v8 = arg17 * 2 + 1;
        double[] v0 = fe.ae(0, ((double)((((float)arg17)) / 3f)), arg17, 0x6BDD3F1F);
        double v1 = v0[arg17] * v0[arg17];
        int[] v3 = new int[v8 * v8];
        int v5 = 0;
        int v9;
        for(v9 = 0; v5 < v8; v9 = v10) {
            int v10 = v9;
            for(v9 = 0; v9 < v8; ++v9) {
                int v12 = ((int)(v0[v5] * v0[v9] / v1 * 256));
                v3[v5 * v8 + v9] = v12;
                if(v10 == 0 && v12 > 0) {
                    v10 = 1;
                }
            }

            ++v5;
        }

        this.ax.put(Integer.valueOf(arg17), new es(v3, v8, v8));
    }

    static void ad() {
        float v3;
        fq.aq = new int[2000];
        int v0 = 0;
        int v1;
        for(v1 = 0xF0; true; v1 += -12) {
            v3 = 360f;
            if(v0 >= 16) {
                break;
            }

            fq.aq[v0] = ma.ax(((double)((((float)v1)) / v3)), 0.9999, ((double)((((float)v0)) * 0.425f / 16f + 0.075f)));
            ++v0;
        }

        for(v1 = 0x30; v0 < fq.aq.length; v1 += -8) {
            int v2 = v0 * 2;
            int v4 = ma.ax(((double)((((float)v1)) / v3)), 0.9999, 0.5);
            while(v0 < v2) {
                if(v0 >= fq.aq.length) {
                    break;
                }

                fq.aq[v0] = v4;
                ++v0;
            }
        }
    }

    es ae(int arg2, byte arg3) {
        try {
            if(!this.ax.containsKey(Integer.valueOf(arg2))) {
                this.al(arg2, 0x4A0E7338);
            }

            return this.ax.get(Integer.valueOf(arg2));
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nb.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    es af(int arg3) {
        if(!this.ax.containsKey(Integer.valueOf(arg3))) {
            this.al(arg3, 475670637);
        }

        return this.ax.get(Integer.valueOf(arg3));
    }

    void ag(es arg13, es arg14, or arg15) {
        int v1 = 0xD1D68747;
        if(arg15.ae * v1 != 0) {
            int v2 = 0x7EDCA66B;
            if(arg15.ar * v2 == 0) {
            }
            else {
                int v3 = 104778515;
                int v0 = arg15.ax * v3 == 0 ? arg13.al - arg15.ae * v1 : 0;
                int v6 = 0xC9ACBFBD;
                int v5 = arg15.al * v6 == 0 ? arg13.ae - arg15.ar * v2 : 0;
                int v7 = arg13.al * v5 + v0;
                v3 = arg15.al * v6 * arg14.al + arg15.ax * v3;
                for(v0 = 0; v0 < arg15.ar * v2; ++v0) {
                    v5 = v3;
                    v3 = 0;
                    while(v3 < arg15.ae * v1) {
                        arg14.ax[v5] += arg13.ax[v7];
                        ++v3;
                        ++v5;
                        ++v7;
                    }

                    v7 += arg13.al - arg15.ae * v1;
                    v3 = arg14.al - arg15.ae * v1 + v5;
                }

                return;
            }
        }
    }

    public final void ai(int arg4, int arg5) {
        if(this.an * 0x89F5FC33 >= this.ae.length) {
            return;
        }

        this.ae[this.an * 0xC07174C0] = arg4;
        this.ar[this.an * 0xC3B910ED] = arg5;
        this.an += 0x31EC905D;
    }

    void aj(es arg12, es arg13, or arg14, int arg15) {
        try {
            int v0 = 0xD1D68747;
            if(arg14.ae * v0 != 0) {
                int v1 = 0x7EDCA66B;
                if(arg14.ar * v1 == 0) {
                }
                else {
                    int v2 = 104778515;
                    arg15 = arg14.ax * v2 == 0 ? arg12.al - arg14.ae * v0 : 0;
                    int v5 = 0xC9ACBFBD;
                    int v4 = arg14.al * v5 == 0 ? arg12.ae - arg14.ar * v1 : 0;
                    int v6 = arg12.al * v4 + arg15;
                    v2 = arg14.al * v5 * arg13.al + arg14.ax * v2;
                    for(arg15 = 0; true; ++arg15) {
                        if(arg15 >= arg14.ar * v1) {
                            return;
                        }

                        v4 = v2;
                        v2 = 0;
                        while(v2 < arg14.ae * v0) {
                            arg13.ax[v4] += arg12.ax[v6];
                            ++v2;
                            ++v4;
                            ++v6;
                        }

                        v6 += arg12.al - arg14.ae * v0;
                        v2 = arg13.al - arg14.ae * v0 + v4;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v12) {
            goto label_78;
        }

        return;
    label_78:
        StringBuilder v13 = new StringBuilder();
        v13.append("nb.aj(");
        v13.append(')');
        throw lx.al(((Throwable)v12), v13.toString());
    }

    void al(int arg17, int arg18) {
        nb v2_1;
        es v1_2;
        int v0 = arg17;
        int v8 = v0 * 2 + 1;
        double v1 = 0;
        double v3 = ((double)((((float)v0)) / 3f));
        int v6 = 0x6803C0BB;
        int v5 = arg17;
        try {
            double[] v1_1 = fe.ae(v1, v3, v5, v6);
            double v2 = v1_1[v0] * v1_1[v0];
            int[] v4 = new int[v8 * v8];
            v6 = 0;
            int v9;
            for(v9 = 0; v6 < v8; v9 = v10) {
                int v10 = v9;
                for(v9 = 0; v9 < v8; ++v9) {
                    int v12 = ((int)(v1_1[v6] * v1_1[v9] / v2 * 256));
                    v4[v6 * v8 + v9] = v12;
                    if(v10 == 0 && v12 > 0) {
                        v10 = 1;
                    }
                }

                ++v6;
            }

            v1_2 = new es(v4, v8, v8);
            v2_1 = this;
        }
        catch(RuntimeException v0_1) {
            goto label_53;
        }

        try {
            v2_1.ax.put(Integer.valueOf(arg17), v1_2);
            return;
        }
        catch(RuntimeException v0_1) {
        }

    label_53:
        StringBuilder v1_3 = new StringBuilder();
        v1_3.append("nb.al(");
        v1_3.append(')');
        throw lx.al(((Throwable)v0_1), v1_3.toString());
    }

    public final void am(int arg11, int arg12, es arg13, float arg14) {
        int v0 = ((int)(18f * arg14));
        es v1 = this.ae(v0, -60);
        int v2 = v0 * 2 + 1;
        int v6 = 0;
        or v3 = new or(0, 0, arg13.al, arg13.ae);
        or v4 = new or(0, 0);
        this.al.al(v2, v2, 0xB851F2F);
        System.nanoTime();
        for(v2 = 0; v2 < this.an * 0xC3B910ED; ++v2) {
            this.al.ax((((int)((((float)(this.ae[v2] - arg11))) * arg14))) - v0, (((int)((((float)arg13.ae)) - (((float)(this.ar[v2] - arg12))) * arg14))) - v0, 0x7F030010);
            this.al.ap(v3, v4, 0x5DF664D7);
            this.aj(v1, arg13, v4, 0x524027B1);
        }

        System.nanoTime();
        System.nanoTime();
        while(v6 < arg13.ax.length) {
            arg12 = 0xFF000000;
            if(arg13.ax[v6] == 0) {
                arg13.ax[v6] = arg12;
            }
            else {
                arg11 = (arg13.ax[v6] + 0x3F) / 0x100;
                if(arg11 <= 0) {
                    arg13.ax[v6] = arg12;
                }
                else {
                    if(arg11 > fq.aq.length) {
                        arg11 = fq.aq.length;
                    }

                    arg13.ax[v6] = fq.aq[arg11 - 1] | arg12;
                }
            }

            ++v6;
        }

        System.nanoTime();
    }

    public final void an(int arg3) {
        try {
            this.an = 0;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("nb.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final void ap(int arg10, int arg11, es arg12, float arg13, int arg14) {
        arg14 = ((int)(18f * arg13));
        byte v0 = -110;
        try {
            es v0_1 = this.ae(arg14, v0);
            int v1 = arg14 * 2 + 1;
            int v5 = 0;
            or v2 = new or(0, 0, arg12.al, arg12.ae);
            or v3 = new or(0, 0);
            this.al.al(v1, v1, 0xEF745741);
            System.nanoTime();
            for(v1 = 0; v1 < this.an * 0xC3B910ED; ++v1) {
                this.al.ax((((int)((((float)(this.ae[v1] - arg10))) * arg13))) - arg14, (((int)((((float)arg12.ae)) - (((float)(this.ar[v1] - arg11))) * arg13))) - arg14, 0x7F030010);
                this.al.ap(v2, v3, 0x3C10F64);
                this.aj(v0_1, arg12, v3, 0x524027B1);
            }

            System.nanoTime();
            System.nanoTime();
            while(v5 < arg12.ax.length) {
                arg11 = 0xFF000000;
                if(arg12.ax[v5] == 0) {
                    arg12.ax[v5] = arg11;
                }
                else {
                    arg10 = (arg12.ax[v5] + 0x3F) / 0x100;
                    if(arg10 <= 0) {
                        arg12.ax[v5] = arg11;
                    }
                    else {
                        if(arg10 > fq.aq.length) {
                            arg10 = fq.aq.length;
                        }

                        arg12.ax[v5] = fq.aq[arg10 - 1] | arg11;
                    }
                }

                ++v5;
            }

            System.nanoTime();
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("nb.ap(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    void aq(int arg17) {
        int v8 = arg17 * 2 + 1;
        double[] v0 = fe.ae(0, ((double)((((float)arg17)) / 3f)), arg17, 1467701889);
        double v1 = v0[arg17] * v0[arg17];
        int[] v3 = new int[v8 * v8];
        int v5 = 0;
        int v9;
        for(v9 = 0; v5 < v8; v9 = v10) {
            int v10 = v9;
            for(v9 = 0; v9 < v8; ++v9) {
                int v12 = ((int)(v0[v5] * v0[v9] / v1 * 256));
                v3[v5 * v8 + v9] = v12;
                if(v10 == 0 && v12 > 0) {
                    v10 = 1;
                }
            }

            ++v5;
        }

        this.ax.put(Integer.valueOf(arg17), new es(v3, v8, v8));
    }

    public final void ar(int arg3, int arg4, int arg5) {
        try {
            int v0 = 0xC3B910ED;
            if(this.an * v0 >= this.ae.length) {
                return;
            }

            this.ae[this.an * v0] = arg3;
            this.ar[this.an * v0] = arg4;
            this.an += 0xC5F3CCE5;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("nb.ar(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public final void au() {
        this.an = 0;
    }

    public final void av(int arg4, int arg5) {
        if(this.an * 0x25F99491 >= this.ae.length) {
            return;
        }

        this.ae[this.an * -323730614] = arg4;
        this.ar[this.an * 96503909] = arg5;
        this.an += 0x426DC154;
    }

    public final void az(int arg11, int arg12, es arg13, float arg14) {
        int v0 = ((int)(18f * arg14));
        es v1 = this.ae(v0, -65);
        int v2 = v0 * 2 + 1;
        int v6 = 0;
        or v3 = new or(0, 0, arg13.al, arg13.ae);
        or v4 = new or(0, 0);
        this.al.al(v2, v2, 0xDA9380D9);
        System.nanoTime();
        for(v2 = 0; v2 < this.an * 0xF37B0380; ++v2) {
            this.al.ax((((int)((((float)(this.ae[v2] - arg11))) * arg14))) - v0, (((int)((((float)arg13.ae)) - (((float)(this.ar[v2] - arg12))) * arg14))) - v0, 0x7F030010);
            this.al.ap(v3, v4, 387037278);
            this.aj(v1, arg13, v4, 0x524027B1);
        }

        System.nanoTime();
        System.nanoTime();
        while(v6 < arg13.ax.length) {
            arg12 = 0xFF000000;
            if(arg13.ax[v6] == 0) {
                arg13.ax[v6] = arg12;
            }
            else {
                arg11 = (arg13.ax[v6] - 2093712148) / 0x5F90CCCB;
                if(arg11 <= 0) {
                    arg13.ax[v6] = 0x1430AF0F;
                }
                else {
                    if(arg11 > fq.aq.length) {
                        arg11 = fq.aq.length;
                    }

                    arg13.ax[v6] = fq.aq[arg11 - 1] | arg12;
                }
            }

            ++v6;
        }

        System.nanoTime();
    }
}

