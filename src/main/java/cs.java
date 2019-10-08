import java.util.Collection;

public class cs implements cm {
    int aa;
    int ab;
    int ad;
    int ae;
    int af;
    int ai;
    int aj;
    int al;
    int an;
    int ap;
    int aq;
    int ar;
    int av;
    int ax;
    static es gj = null;
    static es[] gt = null;
    static final int nr = 2;

    cs() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cs.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int[] aa(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, -1901816225)) {
            return null;
        }

        return new int[]{this.an * 0x43C67C0 - this.ae * 0x716808C0 + arg6 + (this.af * 0x1BEF06C8 - this.aj * 0x80AF123A), this.ai * 0x557A0E8 - this.ad * 846450266 + (this.ap * 0x153768C0 - this.ar * 0x1DAE53A6 + arg7)};
    }

    public void ab(dh arg4) {
        if(arg4.ab * -1474008723 > this.an * 0x2010F19F) {
            arg4.ab = this.an * -859223109;
        }

        if(arg4.af * 0x1616406F < this.an * 1820072113) {
            arg4.af = this.an * 0x36F8AD6;
        }

        if(arg4.ai * 0xF92344FF > this.ap * 0x88043F2C) {
            arg4.ai = this.ap * 0x1D86F211;
        }

        if(arg4.av * 0x9FFD4C8B < this.ap * 0xEEC3886E) {
            arg4.av = this.ap * 1507679817;
        }
    }

    public void ad(dh arg4) {
        int v2 = 0x2010F19F;
        if(arg4.ab * -1474008723 > this.an * v2) {
            arg4.ab = this.an * -859223109;
        }

        if(arg4.af * 0xA95E9011 < this.an * v2) {
            arg4.af = this.an * 0xE25B16AF;
        }

        v2 = 0x854DDA3;
        if(arg4.ai * 0xB342073 > this.ap * v2) {
            arg4.ai = this.ap * 0x1D86F211;
        }

        if(arg4.av * 0x9FFD4C8B < this.ap * v2) {
            arg4.av = this.ap * 1507679817;
        }
    }

    public boolean ae(int arg4, int arg5, byte arg6) {
        boolean v4_1;
        try {
            int v0 = 0x2010F19F;
            if(arg4 < (this.an * v0 << 6) + (this.af * 0x237DE0D9 << 3)) {
                return false;
            }
            else if(arg4 <= (this.an * v0 << 6) + (this.av * 1097309023 << 3) + 7) {
                v0 = 0x854DDA3;
                if(arg5 >= (this.ai * 0xC0AAF41D << 3) + (this.ap * v0 << 6)) {
                    if(arg5 > (this.ap * v0 << 6) + (this.aa * 0xE9CDC843 << 3) + 7) {
                        return false;
                    }

                    goto label_40;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }

            return v4_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cs.ae(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

    label_40:
        v4_1 = true;
        return v4_1;
    }

    public boolean af(int arg5, int arg6, int arg7) {
        int v1 = 0x467B916F;
        boolean v2 = false;
        if(arg5 >= this.ax * v1) {
            if(arg5 >= this.al * 0x25C98A63 + this.ax * v1) {
            }
            else {
                int v0 = 0x1C5A023;
                if(arg6 >= (this.ae * v0 << 6) + (this.aj * 0x89E2F4B7 << 3) && arg6 <= (this.ae * v0 << 6) + (this.aq * 0xC7797C17 << 3) + 7) {
                    arg6 = 0x8749FEE1;
                    if(arg7 >= (this.ar * arg6 << 6) + (this.ad * -501403339 << 3) && arg7 <= (this.ar * arg6 << 6) + (this.ab * 0x4E410211 << 3) + 7) {
                        v2 = true;
                    }
                }
            }
        }

        return v2;
    }

    public af ag(int arg5, int arg6) {
        if(!this.ae(arg5, arg6, -79)) {
            return null;
        }

        return new af(this.ax * 0x467B916F, this.aj * 0x4F17A5B8 - this.af * 0x1BEF06C8 + (arg5 + (this.ae * 0x716808C0 - this.an * 0x43C67C0)), this.ar * 0xD27FB840 - this.ap * 0x153768C0 + arg6 + (this.ad * 0x10E989A8 - this.ai * 0x557A0E8));
    }

    public void ah(lq arg4) {
        this.ax = arg4.ay(-125) * -1022694001;
        this.al = arg4.ay(-9) * 1209091915;
        this.ae = arg4.ao(0x8506D674) * 0x62700F8B;
        this.aj = arg4.ay(-11) * 0xD5362907;
        this.aq = arg4.ay(-9) * 0x17877BA7;
        this.ar = arg4.ao(0x80DBAFDB) * 1202963745;
        this.ad = arg4.ay(-108) * 0x2FE591D;
        this.ab = arg4.ay(-91) * 0x718E2EF1;
        this.an = arg4.ao(-701813225) * 0x6345EA5F;
        this.af = arg4.ay(-94) * 0xA5789F69;
        this.av = arg4.ay(-93) * 0xC769809F;
        this.ap = arg4.ao(0xA99CC5DB) * 0xDF6F3E0B;
        this.ai = arg4.ay(-90) * 0x5AE36E35;
        this.aa = arg4.ay(-119) * -1039219605;
        this.aj(4556);
    }

    public boolean ai(int arg5, int arg6, int arg7) {
        boolean v1 = false;
        if(arg5 >= this.ax * 0x1DB83494) {
            if(arg5 >= this.al * 0x25C98A63 + this.ax * 0x467B916F) {
            }
            else {
                if(arg6 >= (this.ae * 0x1C5A023 << 6) + (this.aj * 0x89E2F4B7 << 3) && arg6 <= (this.ae * 0xF524007F << 6) + (this.aq * 0xC7797C17 << 3) + 7 && arg7 >= (this.ar * 0xAAF95D39 << 6) + (this.ad * -501403339 << 3) && arg7 <= (this.ar * -173769003 << 6) + (this.ab * 0xB884A7BD << 3) + 7) {
                    v1 = true;
                }

                return v1;
            }
        }

        return 0;
    }

    void aj(short arg1) {
    }

    public boolean al(int arg4, int arg5, int arg6, int arg7) {
        try {
            int v0 = 0x467B916F;
            boolean v1 = false;
            if(arg4 >= this.ax * v0) {
                if(arg4 >= this.al * 0x25C98A63 + this.ax * v0) {
                }
                else {
                    arg7 = 0x1C5A023;
                    if(arg5 >= (this.ae * arg7 << 6) + (this.aj * 0x89E2F4B7 << 3) && arg5 <= (this.ae * arg7 << 6) + (this.aq * 0xC7797C17 << 3) + 7) {
                        arg5 = 0x8749FEE1;
                        if(arg6 >= (this.ar * arg5 << 6) + (this.ad * -501403339 << 3)) {
                            if(arg6 > (this.ar * arg5 << 6) + (this.ab * 0x4E410211 << 3) + 7) {
                                return v1;
                            }

                            return true;
                        }
                    }

                    return v1;
                }
            }

            return 0;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cs.al(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return true;
    }

    public af am(int arg5, int arg6) {
        if(!this.ae(arg5, arg6, -1)) {
            return null;
        }

        return new af(this.ax * 0x467B916F, this.aj * 0x4F17A5B8 - this.af * 0x1BEF06C8 + (arg5 + (this.ae * 0x716808C0 - this.an * 0x43C67C0)), this.ar * 0xD27FB840 - this.ap * 0x153768C0 + arg6 + (this.ad * 0x10E989A8 - this.ai * 0x557A0E8));
    }

    public static void an(Collection arg1, byte arg2) {
        try {
            arg1.add(dk.al);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cs.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public af an(int arg4, int arg5, byte arg6) {
        arg6 = -81;
        try {
            if(!this.ae(arg4, arg5, arg6)) {
                return null;
            }

            return new af(this.ax * 0x467B916F, this.aj * 0x4F17A5B8 - this.af * 0x1BEF06C8 + (arg4 + (this.ae * 0x716808C0 - this.an * 0x43C67C0)), this.ar * 0xD27FB840 - this.ap * 0x153768C0 + arg5 + (this.ad * 0x10E989A8 - this.ai * 0x557A0E8));
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cs.an(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void ao() {
    }

    public void ap(lq arg3, int arg4) {
        byte v4 = -79;
        try {
            this.ax = arg3.ay(v4) * -1022694001;
            this.al = arg3.ay(-12) * 1209091915;
            this.ae = arg3.ao(2016308656) * 0x62700F8B;
            this.aj = arg3.ay(-111) * 0xD5362907;
            this.aq = arg3.ay(-41) * 0x17877BA7;
            this.ar = arg3.ao(1995027079) * 1202963745;
            this.ad = arg3.ay(-100) * 0x2FE591D;
            this.ab = arg3.ay(-58) * 0x718E2EF1;
            this.an = arg3.ao(-101832395) * 0x6345EA5F;
            this.af = arg3.ay(-100) * 0xA5789F69;
            this.av = arg3.ay(-66) * 0xC769809F;
            this.ap = arg3.ao(321350542) * 0xDF6F3E0B;
            this.ai = arg3.ay(-43) * 0x5AE36E35;
            this.aa = arg3.ay(-98) * -1039219605;
            this.aj(-2144);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("cs.ap(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    public void aq(dh arg4) {
        int v2 = 0x2010F19F;
        if(arg4.ab * -1474008723 > this.an * v2) {
            arg4.ab = this.an * -859223109;
        }

        if(arg4.af * 0xA95E9011 < this.an * v2) {
            arg4.af = this.an * 0xE25B16AF;
        }

        v2 = 0x854DDA3;
        if(arg4.ai * 0xB342073 > this.ap * v2) {
            arg4.ai = this.ap * 0x1D86F211;
        }

        if(arg4.av * 0x9FFD4C8B < this.ap * v2) {
            arg4.av = this.ap * 1507679817;
        }
    }

    public int[] ar(int arg4, int arg5, int arg6, int arg7) {
        arg7 = 0x8BEED2AD;
        try {
            if(!this.al(arg4, arg5, arg6, arg7)) {
                return null;
            }

            return new int[]{this.an * 0x43C67C0 - this.ae * 0x716808C0 + arg5 + (this.af * 0x1BEF06C8 - this.aj * 0x4F17A5B8), this.ai * 0x557A0E8 - this.ad * 0x10E989A8 + (this.ap * 0x153768C0 - this.ar * 0xD27FB840 + arg6)};
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cs.ar(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void at() {
    }

    public int[] au(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, 0x8A4E9C45)) {
            return null;
        }

        return new int[]{this.an * 0x43C67C0 - this.ae * 28520998 + arg6 + (this.af * 0x68FCAA6B - this.aj * 0xAD107EBB), this.ai * 1407676785 - this.ad * 0x8FD61469 + (this.ap * 0xFAF459A5 - this.ar * 0xD27FB840 + arg7)};
    }

    public int[] av(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, 0x8F96CFE9)) {
            return null;
        }

        return new int[]{this.an * 0x43C67C0 - this.ae * 0x716808C0 + arg6 + (this.af * 0x1BEF06C8 - this.aj * 0x4F17A5B8), this.ai * 0x557A0E8 - this.ad * 0x10E989A8 + (this.ap * 0x153768C0 - this.ar * 0xD27FB840 + arg7)};
    }

    public boolean aw(int arg5, int arg6) {
        boolean v5;
        int v1 = 0x2010F19F;
        if(arg5 < (this.an * v1 << 6) + (this.af * 0x237DE0D9 << 3) || arg5 > (this.an * v1 << 6) + (this.av * 1097309023 << 3) + 7) {
        label_42:
            v5 = false;
        }
        else {
            v1 = 0x854DDA3;
            if(arg6 < (this.ai * 0xC0AAF41D << 3) + (this.ap * v1 << 6)) {
                goto label_42;
            }
            else if(arg6 <= (this.ap * v1 << 6) + (this.aa * 0xE9CDC843 << 3) + 7) {
                v5 = true;
            }
            else {
                goto label_42;
            }
        }

        return v5;
    }

    public static ef[] ax(byte[] arg1, int arg2) {
        arg2 = 0x88EA2095;
        try {
            dy.aw(arg1, arg2);
            return ac.au(7886);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cs.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void ax(dh arg3, int arg4) {
        try {
            int v1 = 0x2010F19F;
            if(arg3.ab * -1474008723 > this.an * v1) {
                arg3.ab = this.an * -859223109;
            }

            if(arg3.af * 0xA95E9011 < this.an * v1) {
                arg3.af = this.an * 0xE25B16AF;
            }

            v1 = 0x854DDA3;
            if(arg3.ai * 0xB342073 > this.ap * v1) {
                arg3.ai = this.ap * 0x1D86F211;
            }

            if(arg3.av * 0x9FFD4C8B < this.ap * v1) {
                arg3.av = this.ap * 1507679817;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cs.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public boolean ay(int arg4, int arg5) {
        boolean v4 = arg4 < (this.an * 0x20DF3888 << 6) + (this.af * 0x237DE0D9 << 3) || arg4 > (this.an * 0xDC07F145 << 6) + (this.av * 1097309023 << 3) + 7 || arg5 < (this.ai * 0xD3920BED << 3) + (this.ap * -90854458 << 6) || arg5 > (this.ap * 0x11C55A7F << 6) + (this.aa * 0xE9CDC843 << 3) + 7 ? false : true;
        return v4;
    }

    public af az(int arg5, int arg6) {
        if(!this.ae(arg5, arg6, 19)) {
            return null;
        }

        return new af(this.ax * -978010244, this.aj * 0xB92669F0 - this.af * 0xE5A9DAF + (arg5 + (this.ae * 0x50A79DC1 - this.an * 0x43C67C0)), this.ar * 0x1E7A088F - this.ap * 0x153768C0 + arg6 + (this.ad * 0x816F8EAF - this.ai * 0x557A0E8));
    }

    static int cw(float arg1, int arg2) {
        int v1_1;
        arg2 = 0xDF32C977;
        try {
            v1_1 = ((int)(arg1 * (((float)(client.hx * arg2))) + (((float)(client.hy * 0x720F8187)))));
            arg2 = 0x80;
            if(v1_1 >= arg2) {
                goto label_14;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cs.cw(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return arg2;
    label_14:
        arg2 = 0x17F;
        if(v1_1 > arg2) {
            return arg2;
        }

        return v1_1;
    }

    static void ik(byte[] arg2, int arg3, int arg4) {
        try {
            int v0 = 24;
            if(client.ey == null) {
                client.ey = new byte[v0];
            }

            mg.ax(arg2, arg3, client.ey, 0, v0);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cs.ik(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

