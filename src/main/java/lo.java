public class lo extends lq {
    static final int[] ab = null;
    int af;
    static final int ah = 0x11111111;
    ma aq;
    static gv pr;

    static {
        lo.ab = new int[]{0, 1, 3, 7, 15, 0x1F, 0x3F, 0x7F, 0xFF, 0x1FF, 0x3FF, 0x7FF, 0xFFF, 0x1FFF, 0x3FFF, 0x7FFF, 0xFFFF, 0x1FFFF, 0x3FFFF, 0x7FFFF, 0xFFFFF, 0x1FFFFF, 0x3FFFFF, 0x7FFFFF, 0xFFFFFF, 0x1FFFFFF, 0x3FFFFFF, 0x7FFFFFF, 0xFFFFFFF, 0x1FFFFFFF, 0x3FFFFFFF, 0x7FFFFFFF, -1};
    }

    public lo(int arg3) {
        try {
            super(arg3);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lo.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int ja(int arg5) {
        try {
            byte[] v5_1 = this.ae;
            int v1 = -1880437085;
            int v0 = this.ar + v1;
            this.ar = v0;
            int v2 = 0xF24F550B;
            arg5 = v5_1[v0 * v2 - 1] - this.aq.ax(-88) & 0xFF;
            v0 = 0x80;
            if(arg5 < v0) {
                return arg5;
            }

            arg5 = arg5 - v0 << 8;
            byte[] v0_1 = this.ae;
            int v3 = this.ar + v1;
            this.ar = v3;
            return arg5 + (v0_1[v3 * v2 - 1] - this.aq.ax(-80) & 0xFF);
        }
        catch(RuntimeException v5) {
            StringBuilder v0_2 = new StringBuilder();
            v0_2.append("lo.ja(");
            v0_2.append(')');
            throw lx.al(((Throwable)v5), v0_2.toString());
        }
    }

    public int jf(byte arg3) {
        try {
            byte[] v3_1 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            return v3_1[v0 * 0xF24F550B - 1] - this.aq.ax(-55) & 0xFF;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lo.jf(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public void jg(int arg3) {
        arg3 = 0x9C5AFCD8;
        try {
            this.af = this.ar * arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lo.jg(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void jj(ma arg2, byte arg3) {
        try {
            this.aq = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("lo.jj(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void jl(ma arg1) {
        this.aq = arg1;
    }

    public void jm(int[] arg2, int arg3) {
        try {
            this.aq = new ma(arg2);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("lo.jm(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int jo(int arg6, int arg7) {
        int v2;
        try {
            arg7 = this.af * 0x29940F51 >> 3;
            int v0 = 8 - (this.af * 0x29940F51 & 7);
            v2 = 0;
            this.af += 291150257 * arg6;
            while(arg6 > v0) {
                arg6 -= v0;
                v2 += (this.ae[arg7] & lo.ab[v0]) << arg6;
                ++arg7;
                v0 = 8;
            }

            v2 += arg6 == v0 ? this.ae[arg7] & lo.ab[v0] : lo.ab[arg6] & this.ae[arg7] >> v0 - arg6;
        }
        catch(RuntimeException v6) {
            goto label_47;
        }

        return v2;
    label_47:
        StringBuilder v7 = new StringBuilder();
        v7.append("lo.jo(");
        v7.append(')');
        throw lx.al(((Throwable)v6), v7.toString());
    }

    public void jp(int[] arg2) {
        this.aq = new ma(arg2);
    }

    public void jq(byte[] arg5, int arg6, int arg7, byte arg8) {
        int v8 = 0;
        while(v8 < arg7) {
            int v0 = v8 + arg6;
            try {
                byte[] v1 = this.ae;
                int v2 = this.ar - 1880437085;
                this.ar = v2;
                arg5[v0] = ((byte)(v1[v2 * 0xF24F550B - 1] - this.aq.ax(-64)));
                ++v8;
                continue;
            }
            catch(RuntimeException v5) {
                StringBuilder v6 = new StringBuilder();
                v6.append("lo.jq(");
                v6.append(')');
                throw lx.al(((Throwable)v5), v6.toString());
            }
        }
    }

    public int jr(int arg2, int arg3) {
        arg2 *= 8;
        arg3 = 0x29940F51;
        try {
            return arg2 - this.af * arg3;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("lo.jr(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void js(int[] arg2) {
        this.aq = new ma(arg2);
    }

    public void jt(int[] arg2) {
        this.aq = new ma(arg2);
    }

    public void ju(int arg3) {
        arg3 = -1880437085;
        int v0 = 0x29940F51;
        try {
            this.ar = (this.af * v0 + 7) / 8 * arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("lo.ju(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    public void jv(ma arg1) {
        this.aq = arg1;
    }

    public void jw(int arg4, int arg5) {
        try {
            byte[] v5 = this.ae;
            int v0 = this.ar - 1880437085;
            this.ar = v0;
            v5[v0 * 0xF24F550B - 1] = ((byte)(arg4 + this.aq.ax(-92)));
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_1 = new StringBuilder();
            v5_1.append("lo.jw(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }
    }

    public void jy(int[] arg2) {
        this.aq = new ma(arg2);
    }

    public boolean jz(int arg3) {
        try {
            if((this.ae[this.ar * 0xF24F550B] - this.aq.al(-5) & 0xFF) >= 0x80) {
                return 1;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lo.jz(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return 0;
    }

    public void ka(int arg5) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg5 + this.aq.ax(-79)));
    }

    public void kb(byte[] arg6, int arg7, int arg8) {
        int v0;
        for(v0 = 0; v0 < arg8; ++v0) {
            byte[] v2 = this.ae;
            int v3 = this.ar - 704240855;
            this.ar = v3;
            arg6[v0 + arg7] = ((byte)(v2[v3 * 0xF24F550B - 1] - this.aq.ax(-18)));
        }
    }

    public void kc() {
        this.af = this.ar * 0x9C5AFCD8;
    }

    public boolean kd() {
        if((this.ae[this.ar * 0x6E740D01] - this.aq.al(-87) & 0xD650F034) < 0x12F8FB3B) {
            return 0;
        }

        return 1;
    }

    public void ke(ma arg1) {
        this.aq = arg1;
    }

    public boolean kf() {
        if((this.ae[this.ar * 0xF24F550B] - this.aq.al(-49) & 0xFF) < 0x80) {
            return 0;
        }

        return 1;
    }

    public void kg(int arg5) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg5 + this.aq.ax(-33)));
    }

    public int kh(int arg7) {
        int v0 = this.af * 0x29940F51 >> 3;
        int v1 = 8 - (this.af * 411360925 & 7);
        int v3 = 0;
        this.af += 291150257 * arg7;
        while(arg7 > v1) {
            arg7 -= v1;
            v3 += (this.ae[v0] & lo.ab[v1]) << arg7;
            ++v0;
            v1 = 8;
        }

        return arg7 == v1 ? this.ae[v0] & lo.ab[v1] : lo.ab[arg7] & this.ae[v0] >> v1 - arg7;
    }

    public int ki() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1] - this.aq.ax(-28) & 0xFF;
    }

    public int kj() {
        byte[] v0 = this.ae;
        int v2 = -1880437085;
        int v1 = this.ar + v2;
        this.ar = v1;
        int v3 = 0xF24F550B;
        int v0_1 = v0[v1 * v3 - 1] - this.aq.ax(-118) & 0xFF;
        v1 = 0x80;
        if(v0_1 < v1) {
            return v0_1;
        }

        v0_1 = v0_1 - v1 << 8;
        byte[] v1_1 = this.ae;
        int v4 = this.ar + v2;
        this.ar = v4;
        return v0_1 + (v1_1[v4 * v3 - 1] - this.aq.ax(-29) & 0xFF);
    }

    public void kk() {
        this.ar = (this.af * 0x29940F51 + 7) / 8 * -1880437085;
    }

    public void kl() {
        this.ar = (this.af * 0x29940F51 + 7) / 8 * -1880437085;
    }

    public int km() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1] - this.aq.ax(-83) & 0xFF;
    }

    public void kn() {
        this.ar = (this.af * 0x29940F51 + 7) / 8 * -1880437085;
    }

    public int ko() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        return v0[v1 * 0xF24F550B - 1] - this.aq.ax(-97) & 0xFF;
    }

    public void kp() {
        this.ar = (this.af * 0x29940F51 + 7) / 8 * -1880437085;
    }

    public void kq(int arg5) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg5 + this.aq.ax(-37)));
    }

    public int kr() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1104559804;
        this.ar = v1;
        int v0_1 = v0[v1 * 0xF24F550B - 1] - this.aq.ax(-1) & 0xFF;
        if(v0_1 < 1269004789) {
            return v0_1;
        }

        byte[] v1_1 = this.ae;
        int v2 = this.ar - 1880437085;
        this.ar = v2;
        return (v0_1 - 0x286413A8 << 8) + (v1_1[v2 * 0x75B747A1 - 1] - this.aq.ax(9) & 1130976358);
    }

    public void ks() {
        this.af = this.ar * 921490420;
    }

    public int kt(int arg7) {
        int v0 = this.af * 0x104CDB63 >> 3;
        int v1 = 8 - (this.af * 790708039 & 7);
        int v3 = 0;
        this.af += 0xF7BD8FD4 * arg7;
        while(arg7 > v1) {
            arg7 -= v1;
            v3 += (this.ae[v0] & lo.ab[v1]) << arg7;
            ++v0;
            v1 = 8;
        }

        return arg7 == v1 ? this.ae[v0] & lo.ab[v1] : lo.ab[arg7] & this.ae[v0] >> v1 - arg7;
    }

    public int ku() {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        int v0_1 = v0[v1 * 0x9B7F3DC3 - 1] - this.aq.ax(-86) & 0xFF;
        if(v0_1 < 0x80) {
            return v0_1;
        }

        byte[] v1_1 = this.ae;
        int v2 = this.ar - 700183345;
        this.ar = v2;
        return (v0_1 + 0x23B89F1F << 8) + (v1_1[v2 * -1538141054 - 1] - this.aq.ax(-23) & 0x4C616864);
    }

    public void kv(byte[] arg6, int arg7, int arg8) {
        int v0;
        for(v0 = 0; v0 < arg8; ++v0) {
            byte[] v2 = this.ae;
            int v3 = this.ar - 1880437085;
            this.ar = v3;
            arg6[v0 + arg7] = ((byte)(v2[v3 * 0xF24F550B - 1] - this.aq.ax(-8)));
        }
    }

    public void kw(int arg5) {
        byte[] v0 = this.ae;
        int v1 = this.ar - 1880437085;
        this.ar = v1;
        v0[v1 * 0xF24F550B - 1] = ((byte)(arg5 + this.aq.ax(-106)));
    }

    public void kx(byte[] arg6, int arg7, int arg8) {
        int v0;
        for(v0 = 0; v0 < arg8; ++v0) {
            byte[] v2 = this.ae;
            int v3 = this.ar - 1880437085;
            this.ar = v3;
            arg6[v0 + arg7] = ((byte)(v2[v3 * 0xF24F550B - 1] - this.aq.ax(-71)));
        }
    }

    public int ky(int arg7) {
        int v0 = this.af * 0x29940F51 >> 3;
        int v1 = 8 - (this.af * 0x29940F51 & 7);
        this.af += 291150257 * arg7;
        int v3 = 0;
        while(arg7 > v1) {
            arg7 -= v1;
            v3 += (this.ae[v0] & lo.ab[v1]) << arg7;
            ++v0;
            v1 = 8;
        }

        return arg7 == v1 ? this.ae[v0] & lo.ab[v1] : lo.ab[arg7] & this.ae[v0] >> v1 - arg7;
    }

    public void kz(byte[] arg6, int arg7, int arg8) {
        int v0;
        for(v0 = 0; v0 < arg8; ++v0) {
            byte[] v2 = this.ae;
            int v3 = this.ar - 1880437085;
            this.ar = v3;
            arg6[v0 + arg7] = ((byte)(v2[v3 * 0xF24F550B - 1] - this.aq.ax(-78)));
        }
    }

    public int lm(int arg3) {
        return arg3 * 8 - this.af * -76035114;
    }

    public int lr(int arg3) {
        return arg3 * 8 - this.af * 0x29940F51;
    }

    public int lz(int arg3) {
        return arg3 * 8 - this.af * 0x29940F51;
    }
}

