public final class it extends bm {
    double aa;
    int ab;
    int ad;
    int ae;
    int af;
    double ag;
    double ah;
    boolean ai;
    int aj;
    int ak;
    int al;
    double am;
    int an;
    df ao;
    int ap;
    int aq;
    int ar;
    int as;
    double at;
    double au;
    double av;
    int aw;
    int ax;
    int ay;
    double az;
    static final int bk = 17;
    public static final int ca = 1001;
    static int hh;

    it(int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        try {
            super();
            this.ai = false;
            this.as = 0;
            this.ak = 0;
            this.ax = arg3 * 0x93497FDB;
            this.al = arg4 * -1145026017;
            this.ae = arg5 * 0xC7D2062F;
            this.ar = arg6 * 0x9F3EE497;
            this.an = arg7 * 0x6B82451;
            this.aj = arg8 * -2121035389;
            this.ad = arg9 * 0x9A4760BD;
            this.aq = arg10 * 0xCDE290DB;
            this.ab = arg11 * 0xA0A787DD;
            this.af = arg12 * 0x42EE93;
            this.ap = arg13 * 0x77D841;
            this.ai = false;
            arg3 = di.al(this.ax * 634283091, 21).aj * 0x5B7F8179;
            this.ao = -1 != arg3 ? fs.al(arg3, 1304812425) : null;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("it.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    final void ad(int arg9) {
        this.ai = true;
        double v2 = ((double)arg9);
        this.av += this.am * v2;
        this.aa += this.az * v2;
        this.au += this.at * 0.5 * v2 * v2 + this.ah * v2;
        this.ah += v2 * this.at;
        this.ay = ((((int)(Math.atan2(this.am, this.az) * 325.949))) + 0x400 & 0x9F14F9DE) * -294343027;
        this.aw = ((((int)(Math.atan2(this.ah, this.ag) * 325.949))) & 0x7FF) * 0xFC42BFD;
        if(this.ao != null) {
            this.ak += arg9 * 0xFC3B406C;
            while(this.ak * 0xDFB14F75 > this.ao.ad[this.as * 0x61AB01E4]) {
                int v2_1 = 0x56BFCF0F;
                this.ak -= this.ao.ad[this.as * v2_1] * 0x55124C55;
                this.as += 0x81773FEF;
                if(this.as * v2_1 < this.ao.ap.length) {
                    continue;
                }

                this.as -= this.ao.ab * 0xE65FD851;
                if(this.as * v2_1 >= 0 && this.as * 0xF5E29694 < this.ao.ap.length) {
                    continue;
                }

                this.as = 0;
            }
        }
    }

    final void ae(int arg16, int arg17, int arg18, int arg19) {
        it v0 = this;
        int v1 = arg16;
        int v2 = arg17;
        if(!v0.ai) {
            double v5 = ((double)(v1 - v0.ae * 0x476300CF));
            double v8 = ((double)(v2 - v0.ar * 0x74D2DB27));
            double v10 = Math.sqrt(v5 * v5 + v8 * v8);
            v0.av = v5 * (((double)(v0.ab * 0x58F00875))) / v10 + (((double)(v0.ae * 0x476300CF)));
            v0.aa = (((double)(v0.ab * 0x58F00875))) * v8 / v10 + (((double)(v0.ar * 0x74D2DB27)));
            v0.au = ((double)(v0.an * 0x48FBA4B1));
        }

        double v3 = ((double)(v0.ad * 0x8FF9A95 + 1 - arg19));
        v0.am = ((((double)v1)) - v0.av) / v3;
        v0.az = ((((double)v2)) - v0.aa) / v3;
        v0.ag = Math.sqrt(v0.az * v0.az + v0.am * v0.am);
        if(!v0.ai) {
            v0.ah = -v0.ag * Math.tan((((double)(v0.aq * 1096215379))) * 0.024544);
        }

        v0.at = ((((double)arg18)) - v0.au - v0.ah * v3) * 2 / (v3 * v3);
    }

    final void aj(int arg9) {
        this.ai = true;
        double v2 = ((double)arg9);
        this.av += this.am * v2;
        this.aa += this.az * v2;
        this.au += this.at * 0.5 * v2 * v2 + this.ah * v2;
        this.ah += v2 * this.at;
        this.ay = ((((int)(Math.atan2(this.am, this.az) * 325.949))) + 0x400 & 0x7FF) * 0xF601E5F0;
        this.aw = ((((int)(Math.atan2(this.ah, this.ag) * 325.949))) & 0xE9B72783) * 0xC4E70D81;
        if(this.ao != null) {
            int v1 = 0x1E0FC8DD;
            this.ak += arg9 * v1;
            while(true) {
                int v3 = 0x56BFCF0F;
                if(this.ak * 0xDFB14F75 > this.ao.ad[this.as * v3]) {
                    this.ak -= this.ao.ad[this.as * v3] * v1;
                    this.as += 1176711608;
                    if(this.as * 0x2C442DF5 < this.ao.ap.length) {
                        continue;
                    }

                    this.as -= this.ao.ab * 0x3A5CF6DF;
                    if(this.as * 0x54838405 >= 0 && this.as * v3 < this.ao.ap.length) {
                        continue;
                    }

                    this.as = 0;
                    continue;
                }

                return;
            }
        }
    }

    final void al(int arg9, int arg10) {
        try {
            this.ai = true;
            double v2 = ((double)arg9);
            this.av += this.am * v2;
            this.aa += this.az * v2;
            this.au += this.at * 0.5 * v2 * v2 + this.ah * v2;
            this.ah += v2 * this.at;
            this.ay = ((((int)(Math.atan2(this.am, this.az) * 325.949))) + 0x400 & 0x7FF) * -294343027;
            this.aw = ((((int)(Math.atan2(this.ah, this.ag) * 325.949))) & 0x7FF) * 0xC4E70D81;
            if(this.ao != null) {
                int v0 = 0x1E0FC8DD;
                this.ak += arg9 * v0;
                while(true) {
                    int v2_1 = 0x56BFCF0F;
                    if(this.ak * 0xDFB14F75 > this.ao.ad[this.as * v2_1]) {
                        this.ak -= this.ao.ad[this.as * v2_1] * v0;
                        this.as += 0x81773FEF;
                        if(this.as * v2_1 < this.ao.ap.length) {
                            continue;
                        }

                        this.as -= this.ao.ab * 0x3A5CF6DF;
                        if(this.as * v2_1 >= 0 && this.as * v2_1 < this.ao.ap.length) {
                            continue;
                        }

                        this.as = 0;
                        continue;
                    }

                    return;
                }
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("it.al(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    final void an(int arg16, int arg17, int arg18, int arg19) {
        it v0 = this;
        int v1 = arg16;
        int v2 = arg17;
        if(!v0.ai) {
            double v5 = ((double)(v1 - v0.ae * 0x476300CF));
            double v8 = ((double)(v2 - v0.ar * 0x74D2DB27));
            double v10 = Math.sqrt(v5 * v5 + v8 * v8);
            v0.av = v5 * (((double)(v0.ab * 0x58F00875))) / v10 + (((double)(v0.ae * 0x476300CF)));
            v0.aa = (((double)(v0.ab * 0x58F00875))) * v8 / v10 + (((double)(v0.ar * 0x74D2DB27)));
            v0.au = ((double)(v0.an * 0x48FBA4B1));
        }

        double v3 = ((double)(v0.ad * 0x8FF9A95 + 1 - arg19));
        v0.am = ((((double)v1)) - v0.av) / v3;
        v0.az = ((((double)v2)) - v0.aa) / v3;
        v0.ag = Math.sqrt(v0.az * v0.az + v0.am * v0.am);
        if(!v0.ai) {
            v0.ah = -v0.ag * Math.tan((((double)(v0.aq * 1096215379))) * 0.024544);
        }

        v0.at = ((((double)arg18)) - v0.au - v0.ah * v3) * 2 / (v3 * v3);
    }

    final void ap(int arg9) {
        this.ai = true;
        double v2 = ((double)arg9);
        this.av += this.am * v2;
        this.aa += this.az * v2;
        this.au += this.at * 0.5 * v2 * v2 + this.ah * v2;
        this.ah += v2 * this.at;
        this.ay = ((((int)(Math.atan2(this.am, this.az) * 325.949))) + 0x400 & -1290028797) * -294343027;
        this.aw = ((((int)(Math.atan2(this.ah, this.ag) * 325.949))) & 0x7FF) * 0xC4E70D81;
        if(this.ao != null) {
            this.ak += arg9 * 0x1E0FC8DD;
            while(this.ak * 0xDFB14F75 > this.ao.ad[this.as * -765932406]) {
                this.ak -= this.ao.ad[this.as * 0x59BF948C] * 0x8C0388A;
                this.as += 0x81773FEF;
                if(this.as * 0x56BFCF0F < this.ao.ap.length) {
                    continue;
                }

                this.as -= this.ao.ab * 0x3A5CF6DF;
                if(this.as * 0xBCD2B30C >= 0 && this.as * 1670546593 < this.ao.ap.length) {
                    continue;
                }

                this.as = 0;
            }
        }
    }

    final void ar(int arg10, int arg11, int arg12, int arg13) {
        double v0;
        if(!this.ai) {
            v0 = ((double)(arg10 - this.ae * 0x476300CF));
            double v2 = ((double)(arg11 - this.ar * 0xAAF80CA));
            double v4 = Math.sqrt(v0 * v0 + v2 * v2);
            this.av = v0 * (((double)(this.ab * 0xB5252395))) / v4 + (((double)(this.ae * 1806271398)));
            this.aa = (((double)(this.ab * 0x2F5B81CE))) * v2 / v4 + (((double)(this.ar * 0xD8D36205)));
            this.au = ((double)(this.an * 0x33A3963C));
        }

        v0 = ((double)(this.ad * -343630220 + 1 - arg13));
        this.am = ((((double)arg10)) - this.av) / v0;
        this.az = ((((double)arg11)) - this.aa) / v0;
        this.ag = Math.sqrt(this.az * this.az + this.am * this.am);
        if(!this.ai) {
            this.ah = -this.ag * Math.tan((((double)(this.aq * 1096215379))) * 0.024544);
        }

        this.at = ((((double)arg12)) - this.au - this.ah * v0) * 2 / (v0 * v0);
    }

    protected final ca as() {
        try {
            ca v0_1 = di.al(this.ax * 634283091, 21).an(this.as * 0x56BFCF0F, 0x76B40D07);
            if(v0_1 == null) {
                return null;
            }

            v0_1.am(this.aw * 0xCC6F3281);
            return v0_1;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("it.as(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    final void ax(int arg16, int arg17, int arg18, int arg19, int arg20) {
        it v1 = this;
        int v0 = arg16;
        int v2 = arg17;
        try {
            if(!v1.ai) {
                double v5 = ((double)(v0 - v1.ae * 0x476300CF));
                double v8 = ((double)(v2 - v1.ar * 0x74D2DB27));
                double v10 = Math.sqrt(v5 * v5 + v8 * v8);
                v1.av = v5 * (((double)(v1.ab * 0x58F00875))) / v10 + (((double)(v1.ae * 0x476300CF)));
                v1.aa = (((double)(v1.ab * 0x58F00875))) * v8 / v10 + (((double)(v1.ar * 0x74D2DB27)));
                v1.au = ((double)(v1.an * 0x48FBA4B1));
            }

            double v3 = ((double)(v1.ad * 0x8FF9A95 + 1 - arg19));
            v1.am = ((((double)v0)) - v1.av) / v3;
            v1.az = ((((double)v2)) - v1.aa) / v3;
            v1.ag = Math.sqrt(v1.az * v1.az + v1.am * v1.am);
            if(!v1.ai) {
                v1.ah = -v1.ag * Math.tan((((double)(v1.aq * 1096215379))) * 0.024544);
            }

            v1.at = ((((double)arg18)) - v1.au - v1.ah * v3) * 2 / (v3 * v3);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("it.ax(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    static final int az(int arg6, int arg7, int arg8) {
        arg8 = arg6 - 1;
        int v0 = arg7 - 1;
        int v1 = -1389016135;
        try {
            int v3 = arg6 + 1;
            int v4 = arg7 + 1;
            return dp.ag(arg6, arg7, v1) / 4 + ((dp.ag(arg8, arg7, v1) + dp.ag(v3, arg7, v1) + dp.ag(arg6, v0, v1) + dp.ag(arg6, v4, v1)) / 8 + (dp.ag(arg8, v0, v1) + dp.ag(v3, v0, v1) + dp.ag(arg8, v4, v1) + dp.ag(v3, v4, v1)) / 16);
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("it.az(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    protected final ca db() {
        ca v0 = di.al(this.ax * 634283091, 21).an(this.as * 0x56BFCF0F, 222860974);
        if(v0 == null) {
            return null;
        }

        v0.am(this.aw * 0xCC6F3281);
        return v0;
    }

    protected final ca dm() {
        ca v0 = di.al(this.ax * 634283091, 21).an(this.as * 0x56BFCF0F, 0xC6C00B2);
        if(v0 == null) {
            return null;
        }

        v0.am(this.aw * 0xCC6F3281);
        return v0;
    }

    protected final ca du() {
        ca v0 = di.al(this.ax * 634283091, 21).an(this.as * 0x56BFCF0F, 0x235A3024);
        if(v0 == null) {
            return null;
        }

        v0.am(this.aw * 0xCC6F3281);
        return v0;
    }
}

