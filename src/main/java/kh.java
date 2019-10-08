public class kh {
    static final int aa = 3;
    static final byte[] ab = null;
    static final int ad = 500000;
    int[] ae;
    static final int af = 0;
    static final int ai = 1;
    int aj;
    int al;
    int[] an;
    int[] ap;
    long aq;
    int[] ar;
    static final int av = 2;
    lq ax;

    static {
        kh.ab = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }

    kh() {
        super();
        this.ax = new lq(null);
    }

    kh(byte[] arg3) {
        super();
        this.ax = new lq(null);
        this.ax(arg3);
    }

    boolean aa() {
        int v0 = this.ar.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(this.ar[v2] >= 0) {
                return 0;
            }
        }

        return 1;
    }

    int ab(int arg7) {
        int v2 = 0xF24F550B;
        int v0 = this.ax.ae[this.ax.ar * v2];
        int v1 = -1880437085;
        if(v0 < 0) {
            v0 &= 0xFF;
            this.ap[arg7] = v0;
            this.ax.ar += v1;
        }
        else {
            v0 = this.ap[arg7];
        }

        int v4 = 0xF7;
        if(v0 != 0xF0) {
            if(v0 == v4) {
            }
            else {
                return this.af(arg7, v0);
            }
        }

        int v3 = this.ax.bx(0);
        if(v0 == v4 && v3 > 0) {
            v0 = this.ax.ae[this.ax.ar * v2] & 0xFF;
            if((v0 < 0xF1 || v0 > 0xF3) && (v0 != 0xF6 && v0 != 0xF8) && (v0 < 0xFA || v0 > 0xFC) && v0 != 0xFE) {
                goto label_60;
            }

            this.ax.ar += v1;
            this.ap[arg7] = v0;
            return this.af(arg7, v0);
        }

    label_60:
        this.ax.ar += v3 * v1;
        return 0;
    }

    int ac() {
        return this.ar.length;
    }

    void ad(int arg4) {
        this.an[arg4] += this.ax.bx(0);
    }

    boolean ae() {
        boolean v0 = this.ax.ae != null ? true : false;
        return v0;
    }

    int af(int arg12, int arg13) {
        int v0 = 2;
        if(arg13 == 0xFF) {
            arg13 = this.ax.ay(-102);
            int v2 = this.ax.bx(0);
            int v4 = -1880437085;
            if(arg13 == 0x2F) {
                this.ax.ar += v2 * v4;
                return 1;
            }

            if(arg13 == 81) {
                arg13 = this.ax.ak(-1297845061);
                this.aq += (((long)this.an[arg12])) * (((long)(this.aj - arg13)));
                this.aj = arg13;
                this.ax.ar += (v2 - 3) * v4;
                return v0;
            }

            this.ax.ar += v2 * v4;
            return 3;
        }

        arg12 = kh.ab[arg13 - 0x80];
        if(arg12 >= 1) {
            arg13 |= this.ax.ay(-68) << 8;
        }

        if(arg12 >= v0) {
            arg13 |= this.ax.ay(-41) << 16;
        }

        return arg13;
    }

    void ag(byte[] arg7) {
        this.ax.ae = arg7;
        this.ax.ar = 0xB711878C;
        int v7 = this.ax.ao(0xE40AC77);
        this.al = this.ax.ao(-394068902);
        this.aj = 500000;
        this.ae = new int[v7];
        int v0 = 0;
        int v1 = 0;
        while(v1 < v7) {
            int v2 = this.ax.ac(54);
            int v3 = this.ax.ac(91);
            if(v2 == 0x4D54726B) {
                this.ae[v1] = this.ax.ar * 0xF24F550B;
                ++v1;
            }

            this.ax.ar += v3 * 0xAA8E0206;
        }

        this.aq = 0;
        this.ar = new int[v7];
        while(v0 < v7) {
            this.ar[v0] = this.ae[v0];
            ++v0;
        }

        this.an = new int[v7];
        this.ap = new int[v7];
    }

    void ah() {
        this.ax.ae = null;
        this.ae = null;
        this.ar = null;
        this.an = null;
        this.ap = null;
    }

    long ai(int arg7) {
        return this.aq + (((long)arg7)) * (((long)this.aj));
    }

    void aj() {
        this.ax.ar = 1880437085;
    }

    boolean ak() {
        boolean v0 = this.ax.ae != null ? true : false;
        return v0;
    }

    void al() {
        this.ax.ae = null;
        this.ae = null;
        this.ar = null;
        this.an = null;
        this.ap = null;
    }

    void am(byte[] arg7) {
        this.ax.ae = arg7;
        this.ax.ar = 0x9F2C125E;
        int v7 = this.ax.ao(1663221800);
        this.al = this.ax.ao(0x81C24085);
        this.aj = 500000;
        this.ae = new int[v7];
        int v0 = 0;
        int v1 = 0;
        while(v1 < v7) {
            int v2 = this.ax.ac(91);
            int v3 = this.ax.ac(14);
            if(v2 == 0x4D54726B) {
                this.ae[v1] = this.ax.ar * 0xF24F550B;
                ++v1;
            }

            this.ax.ar += v3 * -1880437085;
        }

        this.aq = 0;
        this.ar = new int[v7];
        while(v0 < v7) {
            this.ar[v0] = this.ae[v0];
            ++v0;
        }

        this.an = new int[v7];
        this.ap = new int[v7];
    }

    void an(int arg3) {
        this.ax.ar = this.ar[arg3] * -1880437085;
    }

    boolean ao() {
        boolean v0 = this.ax.ae != null ? true : false;
        return v0;
    }

    void ap(int arg4) {
        this.ar[arg4] = this.ax.ar * 0xF24F550B;
    }

    int aq(int arg1) {
        return this.ab(arg1);
    }

    int ar() {
        return this.ar.length;
    }

    boolean as() {
        boolean v0 = this.ax.ae != null ? true : false;
        return v0;
    }

    void at() {
        this.ax.ae = null;
        this.ae = null;
        this.ar = null;
        this.an = null;
        this.ap = null;
    }

    void au(long arg5) {
        this.aq = arg5;
        int v5 = this.ar.length;
        int v0;
        for(v0 = 0; v0 < v5; ++v0) {
            this.an[v0] = 0;
            this.ap[v0] = 0;
            this.ax.ar = this.ae[v0] * -1880437085;
            this.ad(v0);
            this.ar[v0] = this.ax.ar * 0xF24F550B;
        }
    }

    int av() {
        int v0 = this.ar.length;
        int v1 = -1;
        int v2 = 0x7FFFFFFF;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            if(this.ar[v3] < 0) {
            }
            else if(this.an[v3] < v2) {
                v2 = this.an[v3];
                v1 = v3;
            }
        }

        return v1;
    }

    void aw() {
        this.ax.ae = null;
        this.ae = null;
        this.ar = null;
        this.an = null;
        this.ap = null;
    }

    void ax(byte[] arg7) {
        this.ax.ae = arg7;
        this.ax.ar = 0x9F2C125E;
        int v7 = this.ax.ao(1118284601);
        this.al = this.ax.ao(0x7D7FB83D);
        this.aj = 500000;
        this.ae = new int[v7];
        int v0 = 0;
        int v1 = 0;
        while(v1 < v7) {
            int v2 = this.ax.ac(0x76);
            int v3 = this.ax.ac(0x20);
            if(v2 == 0x4D54726B) {
                this.ae[v1] = this.ax.ar * 0xF24F550B;
                ++v1;
            }

            this.ax.ar += v3 * -1880437085;
        }

        this.aq = 0;
        this.ar = new int[v7];
        while(v0 < v7) {
            this.ar[v0] = this.ae[v0];
            ++v0;
        }

        this.an = new int[v7];
        this.ap = new int[v7];
    }

    void ay() {
        this.ax.ae = null;
        this.ae = null;
        this.ar = null;
        this.an = null;
        this.ap = null;
    }

    void az(byte[] arg7) {
        this.ax.ae = arg7;
        this.ax.ar = 0x9F2C125E;
        int v7 = this.ax.ao(0x8323A50B);
        this.al = this.ax.ao(0x50F0BBAF);
        this.aj = 500000;
        this.ae = new int[v7];
        int v0 = 0;
        int v1 = 0;
        while(v1 < v7) {
            int v2 = this.ax.ac(42);
            int v3 = this.ax.ac(0x7F);
            if(v2 == 0x4D54726B) {
                this.ae[v1] = this.ax.ar * 0xBD8E0360;
                ++v1;
            }

            this.ax.ar += v3 * -1880437085;
        }

        this.aq = 0;
        this.ar = new int[v7];
        while(v0 < v7) {
            this.ar[v0] = this.ae[v0];
            ++v0;
        }

        this.an = new int[v7];
        this.ap = new int[v7];
    }

    int ba() {
        return this.ar.length;
    }

    int bb(int arg10, int arg11) {
        int v0 = 2;
        if(arg11 == -1921075460) {
            arg11 = this.ax.ay(-46);
            int v2 = this.ax.bx(0);
            if(arg11 == 0x2F) {
                this.ax.ar += v2 * 0xAEF98D38;
                return 1;
            }

            if(arg11 == 81) {
                arg11 = this.ax.ak(0xE0CA2C6E);
                this.aq += (((long)this.an[arg10])) * (((long)(this.aj - arg11)));
                this.aj = arg11;
                this.ax.ar += (v2 - 3) * -1880437085;
                return v0;
            }

            this.ax.ar += v2 * 0x649F68CC;
            return 3;
        }

        arg10 = kh.ab[arg11 - 0x80];
        if(arg10 >= 1) {
            arg11 |= this.ax.ay(-40) << 8;
        }

        if(arg10 >= v0) {
            arg11 |= this.ax.ay(-44) << 16;
        }

        return arg11;
    }

    int bc(int arg12, int arg13) {
        int v0 = 2;
        if(arg13 == 0xFF) {
            arg13 = this.ax.ay(-15);
            int v2 = this.ax.bx(0);
            int v4 = -1880437085;
            if(arg13 == 0x2F) {
                this.ax.ar += v2 * v4;
                return 1;
            }

            if(arg13 == 81) {
                arg13 = this.ax.ak(0xD84398D9);
                this.aq += (((long)this.an[arg12])) * (((long)(this.aj - arg13)));
                this.aj = arg13;
                this.ax.ar += (v2 - 3) * v4;
                return v0;
            }

            this.ax.ar += v2 * v4;
            return 3;
        }

        arg12 = kh.ab[arg13 - 0x80];
        if(arg12 >= 1) {
            arg13 |= this.ax.ay(-27) << 8;
        }

        if(arg12 >= v0) {
            arg13 |= this.ax.ay(-110) << 16;
        }

        return arg13;
    }

    int bd() {
        return this.ar.length;
    }

    boolean be() {
        int v0 = this.ar.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(this.ar[v2] >= 0) {
                return 0;
            }
        }

        return 1;
    }

    int bf() {
        return this.ar.length;
    }

    int bg(int arg1) {
        return this.ab(arg1);
    }

    int bh(int arg1) {
        return this.ab(arg1);
    }

    int bj() {
        int v0 = this.ar.length;
        int v1 = -1;
        int v2 = 0x7FFFFFFF;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            if(this.ar[v3] < 0) {
            }
            else if(this.an[v3] < v2) {
                v2 = this.an[v3];
                v1 = v3;
            }
        }

        return v1;
    }

    long bk(int arg7) {
        return this.aq + (((long)arg7)) * (((long)this.aj));
    }

    void bl(long arg5) {
        this.aq = arg5;
        int v5 = this.ar.length;
        int v0;
        for(v0 = 0; v0 < v5; ++v0) {
            this.an[v0] = 0;
            this.ap[v0] = 0;
            this.ax.ar = this.ae[v0] * 240252059;
            this.ad(v0);
            this.ar[v0] = this.ax.ar * 0xF24F550B;
        }
    }

    long bm(int arg7) {
        return this.aq + (((long)arg7)) * (((long)this.aj));
    }

    void bn(int arg3) {
        this.ax.ar = this.ar[arg3] * -1880437085;
    }

    void bo(int arg3) {
        this.ax.ar = this.ar[arg3] * -1880437085;
    }

    void bp(int arg3) {
        this.ax.ar = this.ar[arg3] * -1880437085;
    }

    void bq(int arg4) {
        this.an[arg4] += this.ax.bx(0);
    }

    void br(long arg5) {
        this.aq = arg5;
        int v5 = this.ar.length;
        int v0;
        for(v0 = 0; v0 < v5; ++v0) {
            this.an[v0] = 0;
            this.ap[v0] = 0;
            this.ax.ar = this.ae[v0] * -1880437085;
            this.ad(v0);
            this.ar[v0] = this.ax.ar * 0xF24F550B;
        }
    }

    boolean bs() {
        int v0 = this.ar.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(this.ar[v2] >= 0) {
                return 0;
            }
        }

        return 1;
    }

    void bt() {
        this.ax.ar = 1880437085;
    }

    boolean bu() {
        int v0 = this.ar.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(this.ar[v2] >= 0) {
                return 0;
            }
        }

        return 1;
    }

    void bv(int arg4) {
        this.an[arg4] += this.ax.bx(0);
    }

    void bw(int arg3) {
        this.ax.ar = this.ar[arg3] * -1880437085;
    }

    int bx(int arg1) {
        return this.ab(arg1);
    }

    void by(int arg4) {
        this.ar[arg4] = this.ax.ar * 0xF24F550B;
    }

    int bz(int arg1) {
        return this.ab(arg1);
    }
}

