public class cb implements cm {
    int ab;
    int ad;
    int ae;
    public static final int af = 11;
    int aj;
    int al;
    int an;
    int ap;
    int aq;
    int ar;
    int ax;
    static final int dp = 0xFFFFFF8B;
    static final int gf = 0x200;

    cb() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cb.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int[] aa(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, -1882001100)) {
            return null;
        }

        return new int[]{this.aj * 0xB04FA440 - this.ae * 0x63D064C0 + arg6, this.ad * 0x41B031C0 - this.ar * 0xA0305E40 + arg7};
    }

    public void ab(dh arg4) {
        if(arg4.ab * -1474008723 > this.aj * 0xCF47BED1) {
            arg4.ab = this.aj * 0x9D353735;
        }

        if(arg4.af * 0x8A0C162B < this.aq * 0xA33B4A0F) {
            arg4.af = this.aq * -1390258145;
        }

        if(arg4.ai * 0xF0B46506 > this.ad * 0x9506C0C7) {
            arg4.ai = this.ad * 0xFE4BAF75;
        }

        if(arg4.av * 0x9FFD4C8B < this.ab * 0x2F0B62AA) {
            arg4.av = this.ab * 0x802FEE59;
        }
    }

    public void ad(dh arg4) {
        if(arg4.ab * 0x3208FCCA > this.aj * 0x4EC13E91) {
            arg4.ab = this.aj * 0x3234751D;
        }

        if(arg4.af * 0x4AC572A2 < this.aq * 0x1CE08126) {
            arg4.af = this.aq * 0x907EDAED;
        }

        if(arg4.ai * 0xB342073 > this.ad * -358505415) {
            arg4.ai = this.ad * 1981967709;
        }

        if(arg4.av * 0x9FFD4C8B < this.ab * 0x35606F5E) {
            arg4.av = this.ab * 0x802FEE59;
        }
    }

    public static ef ae(byte[] arg1, int arg2) {
        arg2 = 0x7EF21001;
        try {
            dy.aw(arg1, arg2);
            return bp.am(-1);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cb.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public boolean ae(int arg2, int arg3, byte arg4) {
        boolean v2_1;
        arg2 >>= 6;
        int v4 = 0x4EC13E91;
        try {
            if(arg2 < this.aj * v4) {
                return false;
            }
            else if(arg2 <= this.aq * 0xA33B4A0F) {
                arg2 = arg3 >> 6;
                if(arg2 >= this.ad * 0x9506C0C7) {
                    if(arg2 > this.ab * 0xA9BDD653) {
                        return false;
                    }

                    goto label_18;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }

            return v2_1;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cb.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

    label_18:
        v2_1 = true;
        return v2_1;
    }

    public boolean af(int arg5, int arg6, int arg7) {
        boolean v1 = false;
        if(arg5 >= this.ax * 0x328A7355) {
            if(arg5 >= this.al * 0x271E548C + this.ax * 0xAB684DFF) {
            }
            else {
                arg5 = arg6 >> 6;
                if(arg5 >= this.ae * 0x8DFB3D8A && arg5 <= this.an * 0xD40B0222) {
                    arg5 = arg7 >> 6;
                    if(arg5 >= this.ar * 0x577F807 && arg5 <= this.ap * 0xB3580149) {
                        v1 = true;
                    }
                }

                return v1;
            }
        }

        return 0;
    }

    public af ag(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -88)) {
            return null;
        }

        return new af(this.ax * 0x328A7355, arg4 + (this.ae * 0x63D064C0 - this.aj * 0xB04FA440), this.ar * 0xA0305E40 - this.ad * 0x41B031C0 + arg5);
    }

    public static int ah(int arg0, byte arg1) {
        if(arg0 > 0) {
            return 1;
        }

        if(arg0 < 0) {
            return -1;
        }

        return 0;
    }

    public void ah(lq arg3) {
        this.ax = arg3.ay(-118) * 0x93A770DE;
        this.al = arg3.ay(-84) * -178887305;
        this.ae = arg3.ao(0x711BCC3A) * 0x7EF049B;
        this.ar = arg3.ao(0xE4A8D8FA) * 1920653513;
        this.an = arg3.ao(0xB2213AB1) * 0xEBADFD33;
        this.ap = arg3.ao(0xC1FD8E02) * 0xED0E61CE;
        this.aj = arg3.ao(-1202313757) * 0xAE724271;
        this.ad = arg3.ao(0xBF0146F1) * 0x91A400F7;
        this.aq = arg3.ao(-208255397) * 0x1EB74A41;
        this.ab = arg3.ao(0x281A9B8C) * 0x83FD208;
        this.aj(0x29F9C585);
    }

    public boolean ai(int arg5, int arg6, int arg7) {
        int v1 = 0x328A7355;
        boolean v2 = false;
        if(arg5 >= this.ax * v1) {
            if(arg5 >= this.al * 0xED2C0447 + this.ax * v1) {
            }
            else {
                arg5 = arg6 >> 6;
                if(arg5 >= this.ae * 0xFD8F4193 && arg5 <= this.an * 0x582E45FB) {
                    arg5 = arg7 >> 6;
                    if(arg5 >= this.ar * 0xD280C179 && arg5 <= this.ap * 1669809993) {
                        v2 = true;
                    }
                }

                return v2;
            }
        }

        return 0;
    }

    void aj(int arg1) {
    }

    public boolean al(int arg4, int arg5, int arg6, int arg7) {
        try {
            int v0 = 0x328A7355;
            boolean v1 = false;
            if(arg4 >= this.ax * v0) {
                if(arg4 >= this.al * 0xED2C0447 + this.ax * v0) {
                }
                else {
                    arg4 = arg5 >> 6;
                    if(arg4 >= this.ae * 0xFD8F4193 && arg4 <= this.an * 0x582E45FB) {
                        arg4 = arg6 >> 6;
                        if(arg4 >= this.ar * 0xD280C179) {
                            if(arg4 > this.ap * 1669809993) {
                                return v1;
                            }

                            return true;
                        }
                    }
                }
            }

            return v1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cb.al(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return true;
    }

    public af am(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -46)) {
            return null;
        }

        return new af(this.ax * 0xDEB9E0F5, arg4 + (this.ae * 0x63D064C0 - this.aj * 0x6C533529), this.ar * 0xA0305E40 - this.ad * 0x9E1C0AA2 + arg5);
    }

    public af an(int arg3, int arg4, byte arg5) {
        arg5 = 34;
        try {
            if(!this.ae(arg3, arg4, arg5)) {
                return null;
            }

            return new af(this.ax * 0x328A7355, arg3 + (this.ae * 0x63D064C0 - this.aj * 0xB04FA440), this.ar * 0xA0305E40 - this.ad * 0x41B031C0 + arg4);
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cb.an(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void ap(lq arg2, int arg3) {
        byte v3 = -94;
        try {
            this.ax = arg2.ay(v3) * 0x7E35F1FD;
            this.al = arg2.ay(-10) * -178887305;
            this.ae = arg2.ao(0xE5F42DEC) * 0x7EF049B;
            this.ar = arg2.ao(775023458) * 1920653513;
            this.an = arg2.ao(1902370684) * 0xEBADFD33;
            this.ap = arg2.ao(0xE1764960) * 0x437C5AF9;
            this.aj = arg2.ao(1720893404) * 0xAE724271;
            this.ad = arg2.ao(-1841786310) * 0x91A400F7;
            this.aq = arg2.ao(0x19FBDCE8) * -104307473;
            this.ab = arg2.ao(0x42BF8837) * -1164124709;
            this.aj(0x29F9C585);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("cb.ap(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public void aq(dh arg4) {
        if(arg4.ab * 1502434967 > this.aj * 0x4EC13E91) {
            arg4.ab = this.aj * 0x8B830298;
        }

        if(arg4.af * 0xA95E9011 < this.aq * -1273190460) {
            arg4.af = this.aq * -1390258145;
        }

        if(arg4.ai * 0x159A7C57 > this.ad * 0x3445D07F) {
            arg4.ai = this.ad * -1939506005;
        }

        if(arg4.av * -2061145907 < this.ab * 0xA9BDD653) {
            arg4.av = this.ab * 2023899626;
        }
    }

    public int[] ar(int arg4, int arg5, int arg6, int arg7) {
        arg7 = -1921068099;
        try {
            if(!this.al(arg4, arg5, arg6, arg7)) {
                return null;
            }

            return new int[]{this.aj * 0xB04FA440 - this.ae * 0x63D064C0 + arg5, this.ad * 0x41B031C0 - this.ar * 0xA0305E40 + arg6};
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cb.ar(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void at() {
    }

    public int[] au(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, -2016137493)) {
            return null;
        }

        return new int[]{this.aj * 0xB04FA440 - this.ae * 0x63D064C0 + arg6, this.ad * 0xA3459975 - this.ar * 0xA0305E40 + arg7};
    }

    public int[] av(int arg5, int arg6, int arg7) {
        if(!this.al(arg5, arg6, arg7, 0x8A255A27)) {
            return null;
        }

        return new int[]{this.aj * 0xB04FA440 - this.ae * 0x63D064C0 + arg6, this.ad * 0x51047A8D - this.ar * 0xA0305E40 + arg7};
    }

    public boolean aw(int arg3, int arg4) {
        boolean v3;
        arg3 >>= 6;
        if(arg3 < this.aj * 0x4EC13E91 || arg3 > this.aq * 0xA33B4A0F) {
        label_20:
            v3 = false;
        }
        else {
            arg3 = arg4 >> 6;
            if(arg3 < this.ad * -2118864610) {
                goto label_20;
            }
            else if(arg3 <= this.ab * 0xA9BDD653) {
                v3 = true;
            }
            else {
                goto label_20;
            }
        }

        return v3;
    }

    static long ax(CharSequence arg10, int arg11) {
        long v5;
        long v3;
        try {
            arg11 = arg10.length();
            int v0 = 0;
            long v1 = 0;
            v3 = v1;
            while(true) {
                v5 = 37;
                if(v0 < arg11) {
                    v3 *= v5;
                    int v7 = arg10.charAt(v0);
                    int v8 = 65;
                    if(v7 < v8 || v7 > 90) {
                        v8 = 97;
                        if(v7 >= v8 && v7 <= 0x7A) {
                            v3 += ((long)(v7 + 1 - v8));
                            goto label_34;
                        }

                        v8 = 0x30;
                        if(v7 < v8) {
                            goto label_34;
                        }

                        if(v7 > 57) {
                            goto label_34;
                        }

                        v3 += ((long)(v7 + 27 - v8));
                    }
                    else {
                        v3 += ((long)(v7 + 1 - v8));
                    }

                label_34:
                    if(v3 >= 0x27817226572713DL) {
                        break;
                    }

                    ++v0;
                    continue;
                }

                break;
            }

            while(v1 == v3 % v5) {
                if(v3 == v1) {
                    return v3;
                }

                v3 /= v5;
            }
        }
        catch(RuntimeException v10) {
            goto label_47;
        }

        return v3;
    label_47:
        StringBuilder v11 = new StringBuilder();
        v11.append("cb.ax(");
        v11.append(')');
        throw lx.al(((Throwable)v10), v11.toString());
    }

    public void ax(dh arg3, int arg4) {
        try {
            if(arg3.ab * -1474008723 > this.aj * 0x4EC13E91) {
                arg3.ab = this.aj * 0x9D353735;
            }

            if(arg3.af * 0xA95E9011 < this.aq * 0xA33B4A0F) {
                arg3.af = this.aq * -1390258145;
            }

            if(arg3.ai * 0xB342073 > this.ad * 0x9506C0C7) {
                arg3.ai = this.ad * 1981967709;
            }

            if(arg3.av * 0x9FFD4C8B < this.ab * 0xA9BDD653) {
                arg3.av = this.ab * 0x802FEE59;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cb.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    static void ay(int[] arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v2;
        int v1;
        arg13 = -(arg9 >> 2);
        arg9 = -(arg9 & 3);
        arg10 = -arg10;
        while(true) {
            if(arg10 >= 0) {
                return;
            }

            int v0 = arg8;
            arg8 = arg7;
            arg7 = arg13;
            while(true) {
                if(arg7 >= 0) {
                    goto label_52;
                }

                v1 = arg8 + 1;
                try {
                    arg8 = arg5[arg8];
                    if(arg8 != 0) {
                        v2 = v0 + 1;
                        arg4[v0] = arg6[arg8 & 0xFF];
                    }
                    else {
                        v2 = v0 + 1;
                    }

                    arg8 = v1 + 1;
                    v0 = arg5[v1];
                    if(v0 != 0) {
                        v1 = v2 + 1;
                        arg4[v2] = arg6[v0 & 0xFF];
                    }
                    else {
                        v1 = v2 + 1;
                    }

                    v0 = arg8 + 1;
                    arg8 = arg5[arg8];
                    if(arg8 != 0) {
                        v2 = v1 + 1;
                        arg4[v1] = arg6[arg8 & 0xFF];
                    }
                    else {
                        v2 = v1 + 1;
                    }

                    arg8 = v0 + 1;
                    v0 = arg5[v0];
                    if(v0 != 0) {
                        arg4[v2] = arg6[v0 & 0xFF];
                        v0 = v2 + 1;
                    }
                    else {
                        v0 = v2 + 1;
                    }

                    ++arg7;
                    continue;
                label_52:
                    arg7 = arg9;
                    while(true) {
                    label_53:
                        if(arg7 >= 0) {
                            goto label_76;
                        }

                        v1 = arg8 + 1;
                        arg8 = arg5[arg8];
                        if(arg8 != 0) {
                            arg4[v0] = arg6[arg8 & 0xFF];
                            ++v0;
                        }
                        else {
                            break;
                        }

                        goto label_64;
                    }
                }
                catch(RuntimeException v4) {
                    goto label_67;
                }
            }

            ++v0;
        label_64:
            ++arg7;
            arg8 = v1;
            goto label_53;
        label_76:
            ++arg10;
            int v3 = arg8 + arg12;
            arg8 = v0 + arg11;
            arg7 = v3;
        }

    label_67:
        StringBuilder v5 = new StringBuilder();
        v5.append("cb.ay(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    public boolean ay(int arg3, int arg4) {
        boolean v3;
        arg3 >>= 6;
        if(arg3 < this.aj * -2007329882 || arg3 > this.aq * 0xA33B4A0F) {
        label_20:
            v3 = false;
        }
        else {
            arg3 = arg4 >> 6;
            if(arg3 < this.ad * 0x357498D1) {
                goto label_20;
            }
            else if(arg3 <= this.ab * 0xA9BDD653) {
                v3 = true;
            }
            else {
                goto label_20;
            }
        }

        return v3;
    }

    public af az(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -89)) {
            return null;
        }

        return new af(this.ax * 0x386C7902, arg4 + (this.ae * 0xECA118F8 - this.aj * 0xB04FA440), this.ar * 0x54AE0C4A - this.ad * -1285707370 + arg5);
    }
}

