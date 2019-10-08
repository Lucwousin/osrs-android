public class cq extends ck {
    int ag;
    int ah;
    int am;
    int az;
    static final int ba = 8;
    static final int bo = 6;
    static int ta;

    cq() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    int ae(int arg3) {
        arg3 = 0xE8962ADD;
        try {
            return this.am * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cq.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void al(lq arg7, int arg8) {
        try {
            this.ap = Math.min(this.ap * 0xCA01D035, 4) * 0x4CDF021D;
            this.aq = new short[1][0x40][0x40];
            this.ab = new short[this.ap * 0xCA01D035][0x40][0x40];
            this.af = new byte[this.ap * 0xCA01D035][0x40][0x40];
            this.ai = new byte[this.ap * 0xCA01D035][0x40][0x40];
            this.av = new du[this.ap * 0xCA01D035][0x40][0x40][];
            if(arg7.ay(-109) == db.al.ae * 760461505) {
                arg8 = arg7.ay(-2);
                int v0 = arg7.ay(-51);
                int v1 = arg7.ay(-106);
                int v2 = arg7.ay(-84);
                if(arg8 == this.ae * 0xF5C1A1F && v0 == this.ar * 0x82A1F09D && this.ag * -742504545 == v1 && v2 == this.ah * 0x1EA9D83D) {
                    for(v0 = 0; true; ++v0) {
                        v1 = 8;
                        if(v0 >= v1) {
                            return;
                        }

                        for(v2 = 0; v2 < v1; ++v2) {
                            this.ab(this.ag * 0x9DF23CF8 + v0, this.ah * 0xF54EC1E8 + v2, arg7, 0x7A);
                        }
                    }

                    return;
                }

                throw new IllegalStateException("");
            }

            throw new IllegalStateException("");
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("cq.al(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    int an(int arg3) {
        try {
            return this.ag * -742504545;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cq.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ap(lq arg8) {
        this.ap = Math.min(this.ap * 0xCA01D035, 4) * 0x4CDF021D;
        this.aq = new short[1][0x40][2042249093];
        this.ab = new short[this.ap * 0xCA01D035][0x40][0x2C6AD34E];
        this.af = new byte[this.ap * 0xFC070C94][0x40][-2043811970];
        this.ai = new byte[this.ap * 0xCA01D035][0x1A72CF4E][0x40];
        this.av = new du[this.ap * 0xD591802A][0xE096A3A4][0xEBB5247][];
        if(arg8.ay(-29) == db.al.ae * 0xCF3159A6) {
            int v0 = arg8.ay(-108);
            int v1 = arg8.ay(-34);
            int v2 = arg8.ay(-4);
            int v3 = arg8.ay(-36);
            if(v0 == this.ae * 0x3F789179 && v1 == this.ar * 0x4CA76807 && this.ag * -742504545 == v2 && v3 == this.ah * 0x1EA9D83D) {
                for(v1 = 0; true; ++v1) {
                    v2 = 8;
                    if(v1 >= v2) {
                        return;
                    }

                    for(v3 = 0; v3 < v2; ++v3) {
                        this.ab(this.ag * -492049780 + v1, this.ah * 0xF54EC1E8 + v3, arg8, 35);
                    }
                }

                return;
            }

            throw new IllegalStateException("");
        }

        throw new IllegalStateException("");
    }

    int ar(int arg3) {
        arg3 = 0x7FF1BBE9;
        try {
            return this.az * arg3;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cq.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static boolean ax(int arg3, int arg4) {
        int v1;
        try {
            int[] v4 = fp.ch;
            v1 = 0;
            while(true) {
            label_3:
                if(v1 >= v4.length) {
                    return 0;
                }

                if(arg3 != v4[v1]) {
                    goto label_9;
                }

                return 1;
            }
        }
        catch(RuntimeException v3) {
            goto label_14;
        }

        return 1;
    label_9:
        ++v1;
        goto label_3;
        return 0;
    label_14:
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("cq.ax(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
    }

    void ax(lq arg3, byte arg4) {
        arg4 = -26;
        try {
            if(cu.al.ae * 1961027073 == arg3.ay(arg4)) {
                this.an = arg3.ay(-106) * 0x64C9427F;
                this.ap = arg3.ay(-61) * 0x4CDF021D;
                this.ax = arg3.ao(0x2732FBB7) * 0xFD7CF5DF;
                this.al = arg3.ao(0x12CB13CC) * 0x61689D09;
                this.am = arg3.ay(-106) * 0x41EAFD75;
                this.az = arg3.ay(-38) * -1636250535;
                this.ae = arg3.ao(0xB0D746F7) * 2050023903;
                this.ar = arg3.ao(0xDED3B032) * 1083446709;
                this.ag = arg3.ay(-57) * 0xD955145F;
                this.ah = arg3.ay(-49) * 0x72A77F15;
                this.aj = arg3.bq(0xA218BBD2) * 0x81068C8B;
                this.ad = arg3.bq(0xFA350DF9) * 0x7646B8FB;
                return;
            }

            throw new IllegalStateException("");
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cq.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void bb(lq arg4) {
        if(cu.al.ae * 1961027073 == arg4.ay(-33)) {
            this.an = arg4.ay(-15) * 0x64C9427F;
            this.ap = arg4.ay(-24) * 0x4CDF021D;
            this.ax = arg4.ao(-432327390) * 0xFD7CF5DF;
            this.al = arg4.ao(0xD25607E6) * 0x61689D09;
            this.am = arg4.ay(-95) * 0x41EAFD75;
            this.az = arg4.ay(-13) * -1636250535;
            this.ae = arg4.ao(0x2F15CE28) * 2050023903;
            this.ar = arg4.ao(1109502821) * 1083446709;
            this.ag = arg4.ay(-84) * 0xD955145F;
            this.ah = arg4.ay(-27) * 0x72A77F15;
            this.aj = arg4.bq(-1890185020) * 0x81068C8B;
            this.ad = arg4.bq(0xB2AA5C2C) * 0x7646B8FB;
            return;
        }

        throw new IllegalStateException("");
    }

    int bc() {
        return this.am * 0xE8962ADD;
    }

    int be() {
        return this.ag * -1890744209;
    }

    int bh(int arg3) {
        try {
            return this.ah * 0x1EA9D83D;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cq.bh(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int bi() {
        return this.ah * 0x1EA9D83D;
    }

    int bj() {
        return this.az * 0x98C5E138;
    }

    int bk() {
        return this.am * 0xCFE9C6D2;
    }

    int bl() {
        return this.ag * 1400974316;
    }

    int bm() {
        return this.am * 0xE8962ADD;
    }

    int br() {
        return this.ah * 0x1EA9D83D;
    }

    int bs() {
        return this.ag * 0x45A359DA;
    }

    int bu() {
        return this.az * -115058330;
    }

    int ca() {
        return this.ah * 780658777;
    }

    int cj() {
        return this.ah * 0x1EA9D83D;
    }

    public boolean equals(Object arg5) {
        try {
            boolean v1 = false;
            if(!(arg5 instanceof cq)) {
                return 0;
            }

            if(this.ae * 0xF5C1A1F == ((cq)arg5).ae * 0xF5C1A1F) {
                if(((cq)arg5).ar * 0x82A1F09D != this.ar * 0x82A1F09D) {
                }
                else {
                    if(((cq)arg5).ag * -742504545 == this.ag * -742504545) {
                        if(((cq)arg5).ah * 0x1EA9D83D != this.ah * 0x1EA9D83D) {
                            return v1;
                        }

                        return true;
                    }

                    return v1;
                }
            }

            return 0;
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cq.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }

        return true;
    }

    public int hashCode() {
        int v0 = 0xF5C1A1F;
        try {
            return this.ar * 0x82A1F09D << 8 | this.ae * v0 | this.ag * -742504545 << 16 | this.ah * 0x1EA9D83D << 24;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cq.hashCode(");
            v1.append(')');
            throw lx.al(((Throwable)v0_1), v1.toString());
        }
    }

    public boolean hd(Object arg5) {
        boolean v1 = false;
        if(!(arg5 instanceof cq)) {
            return 0;
        }

        if(this.ae * 0xF5C1A1F == ((cq)arg5).ae * 0xF5C1A1F) {
            if(((cq)arg5).ar * 0x82A1F09D != this.ar * 0x82A1F09D) {
            }
            else {
                if(((cq)arg5).ag * -742504545 == this.ag * -742504545 && ((cq)arg5).ah * 0x1EA9D83D == this.ah * 0x1EA9D83D) {
                    v1 = true;
                }

                return v1;
            }
        }

        return 0;
    }

    public boolean hh(Object arg5) {
        boolean v1 = false;
        if(!(arg5 instanceof cq)) {
            return 0;
        }

        if(this.ae * 0xF5C1A1F == ((cq)arg5).ae * 0xF5C1A1F) {
            if(((cq)arg5).ar * 0x82A1F09D != this.ar * 0x82A1F09D) {
            }
            else {
                if(((cq)arg5).ag * -742504545 == this.ag * -742504545 && ((cq)arg5).ah * 0x1EA9D83D == this.ah * 0x1EA9D83D) {
                    v1 = true;
                }

                return v1;
            }
        }

        return 0;
    }

    public int ht() {
        return this.ae * 0xF5C1A1F | this.ar * 0x82A1F09D << 8 | this.ag * -742504545 << 16 | this.ah * 0x1EA9D83D << 24;
    }

    public int hy() {
        return this.ae * -829746350 | this.ar * 0x82A1F09D << 8 | this.ag * -742504545 << 16 | this.ah * 0x1EA9D83D << 24;
    }
}

