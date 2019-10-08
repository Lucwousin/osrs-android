public final class ia extends bm {
    boolean ab;
    int ad;
    int ae;
    df aj;
    int al;
    int an;
    int ap;
    int aq;
    int ar;
    int ax;

    ia(int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            super();
            this.ad = 0;
            this.aq = 0;
            this.ab = false;
            this.ax = arg3 * 0x9F99403B;
            this.ae = arg4 * -713242055;
            this.ar = arg5 * 1041843349;
            this.an = arg6 * 0xA7F965B;
            this.ap = arg7 * 979140233;
            this.al = (arg9 + arg8) * 0xDC75A91F;
            arg3 = di.al(this.ax * 0xB0DF98F3, 21).aj * 0x5B7F8179;
            if(-1 != arg3) {
                this.ab = false;
                this.aj = fs.al(arg3, 1304812425);
            }
            else {
                this.ab = true;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ia.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    final void ae(int arg4) {
        if(this.ab) {
            return;
        }

        this.aq += arg4 * 1603105063;
        do {
            if(this.aq * 0xCFCB68A5 > this.aj.ad[this.ad * -1917025016]) {
                this.aq -= this.aj.ad[this.ad * 0xB4ECB212] * 0xF2FA4C5B;
                this.ad += 0x275171A4;
                if(this.ad * 0xE432FE50 < this.aj.ap.length) {
                    continue;
                }

                break;
            }

            return;
        }
        while(true);

        this.ab = true;
    }

    final void al(int arg4) {
        if(this.ab) {
            return;
        }

        this.aq += arg4 * 0xBA263F2D;
        do {
            if(this.aq * 860441786 > this.aj.ad[this.ad * 0x6F6EBA63]) {
                this.aq -= this.aj.ad[this.ad * 0xBB05BD83] * 0xB10ADD15;
                this.ad += 0x1D1D392B;
                if(this.ad * 0xBB05BD83 < this.aj.ap.length) {
                    continue;
                }

                break;
            }

            return;
        }
        while(true);

        this.ab = true;
    }

    static void an(ki arg2, int arg3, int arg4, int arg5, byte arg6, boolean arg7, int arg8) {
        long v3 = ((long)(arg4 + (arg3 << 16)));
        try {
            if(km.ad.ax(v3) != null) {
                return;
            }

            if(km.ab.ax(v3) != null) {
                return;
            }

            mx v8 = km.av.ax(v3);
            int v0 = 0x95843345;
            int v1 = 0xADC6DAC1;
            if(v8 != null) {
                if(arg7) {
                    ((kd)v8).de();
                    km.ad.al(v8, v3);
                    km.aa -= v1;
                    km.aq += v0;
                }

                return;
            }

            if(!arg7 && km.au.ax(v3) != null) {
                return;
            }

            kd v8_1 = new kd();
            v8_1.ax = arg2;
            v8_1.al = arg5 * -507700569;
            v8_1.ae = arg6;
            if(arg7) {
                km.ad.al(((mx)v8_1), v3);
                km.aq += v0;
            }
            else {
                km.ai.ax(((mv)v8_1));
                km.av.al(((mx)v8_1), v3);
                km.aa += v1;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("ia.an(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    protected final ca as() {
        ca v0_2;
        try {
            dg v0_1 = di.al(this.ax * 0xB0DF98F3, 21);
            v0_2 = !this.ab ? v0_1.an(this.ad * 0xBB05BD83, 2080590377) : v0_1.an(-1, 0x751E6E3B);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ia.as(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }

        if(v0_2 == null) {
            return null;
        }

        return v0_2;
    }

    final void ax(int arg4, int arg5) {
        try {
            if(this.ab) {
                return;
            }

            int v0 = 0xBA263F2D;
            this.aq += arg4 * v0;
            do {
                int v2 = 0xBB05BD83;
                if(this.aq * 0xCFCB68A5 > this.aj.ad[this.ad * v2]) {
                    this.aq -= this.aj.ad[this.ad * v2] * v0;
                    this.ad += 0x1D1D392B;
                    if(this.ad * v2 < this.aj.ap.length) {
                        continue;
                    }

                    break;
                }

                return;
            }
            while(true);

            this.ab = true;
        }
        catch(RuntimeException v4) {
            goto label_42;
        }

        return;
    label_42:
        StringBuilder v5 = new StringBuilder();
        v5.append("ia.ax(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    protected final ca db() {
        dg v0 = di.al(this.ax * 0xB0DF98F3, 21);
        ca v0_1 = !this.ab ? v0.an(this.ad * 0xBB05BD83, 0x78F7D109) : v0.an(-1, 0x680CD174);
        if(v0_1 == null) {
            v0_1 = null;
        }

        return v0_1;
    }

    protected final ca dm() {
        dg v0 = di.al(this.ax * 0x4FF887F0, 21);
        ca v0_1 = !this.ab ? v0.an(this.ad * 0xBB05BD83, 0xA2B221B7) : v0.an(-1, 0xE85F8647);
        if(v0_1 == null) {
            return null;
        }

        return v0_1;
    }

    protected final ca du() {
        dg v0 = di.al(this.ax * 0xB0DF98F3, 21);
        ca v0_1 = !this.ab ? v0.an(this.ad * 0xBB05BD83, 0x2FAC002A) : v0.an(-1, 0x26F9244E);
        if(v0_1 == null) {
            return null;
        }

        return v0_1;
    }
}

