public class ch implements cm {
    int ab;
    int ad;
    int ae;
    int aj;
    int al;
    int an;
    int ap;
    int aq;
    int ar;
    int ax;
    static final int cd = 17;
    public static int ks;

    ch() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ch.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int[] aa(int arg6, int arg7, int arg8) {
        if(!this.al(arg6, arg7, arg8, -2001391556)) {
            return null;
        }

        return new int[]{this.aq * 0x3FBEC658 - this.aj * 0x4A490D68 + (this.an * 0x5FF5C7C0 - this.ae * 1905106624 + arg7), arg8 + (this.ap * 0x2AC1BFC0 - this.ar * 0x2CA35CC0) + (this.ab * 0x42ED2A08 - this.ad * 0xC1E027F8)};
    }

    public void ab(dh arg4) {
        if(arg4.ab * -1474008723 > this.an * 1166006047) {
            arg4.ab = this.an * 0x741F2A6A;
        }

        if(arg4.af * 0xA95E9011 < this.an * 0x94306042) {
            arg4.af = this.an * 0x9F9894F4;
        }

        if(arg4.ai * -425410530 > this.ap * 30638893) {
            arg4.ai = this.ap * 1035900997;
        }

        if(arg4.av * 0x9FFD4C8B < this.ap * 873318600) {
            arg4.av = this.ap * -328382054;
        }
    }

    static void ac(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, byte arg14) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                try {
                    arg5 = arg4[arg5];
                    if(arg5 != 0) {
                        arg8 = (arg5 & 0xFF00FF) * arg13;
                        arg5 = (0xFF00FF00 & arg8) + (arg5 * arg13 - arg8 & 0xFF0000) >>> 8;
                        arg10 = arg3[arg7] + arg5;
                        arg5 = (arg5 & 0xFF00FF) + (0xFF00FF & arg3[arg7]);
                        arg6 = (0x1000100 & arg5) + (arg10 - arg5 & 0x10000);
                        arg3[arg7] = arg6 - (arg6 >>> 8) | arg10 - arg6;
                        ++arg7;
                    }
                    else {
                        goto label_37;
                    }

                    goto label_38;
                }
                catch(RuntimeException v0) {
                    StringBuilder v1 = new StringBuilder();
                    v1.append("ch.ac(");
                    v1.append(')');
                    throw lx.al(((Throwable)v0), v1.toString());
                }

            label_37:
                ++arg7;
            label_38:
                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }

    public void ad(dh arg4) {
        if(arg4.ab * -1474008723 > this.an * 1166006047) {
            arg4.ab = this.an * 0x7135D73B;
        }

        if(arg4.af * 0x63FBCDBD < this.an * 0xF98A2B70) {
            arg4.af = this.an * 0x13D1242F;
        }

        int v2 = 0x74AB06FF;
        if(arg4.ai * 0xB342073 > this.ap * v2) {
            arg4.ai = this.ap * 0xAB78F7FA;
        }

        if(arg4.av * 0x5C1E5748 < this.ap * v2) {
            arg4.av = this.ap * 0xE87F39DD;
        }
    }

    public boolean ae(int arg4, int arg5, byte arg6) {
        boolean v4_1;
        try {
            int v0 = 0x67F7D8CB;
            int v2 = 1166006047;
            if(arg4 < (this.aq * v0 << 3) + (this.an * v2 << 6)) {
                return false;
            }
            else if(arg4 <= (this.an * v2 << 6) + (this.aq * v0 << 3) + 7) {
                int v6 = 0x74AB06FF;
                int v1 = 0xA85DA541;
                if(arg5 >= (this.ap * v6 << 6) + (this.ab * v1 << 3)) {
                    if(arg5 > (this.ap * v6 << 6) + (this.ab * v1 << 3) + 7) {
                        return false;
                    }

                    goto label_38;
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
            v5.append("ch.ae(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

    label_38:
        v4_1 = true;
        return v4_1;
    }

    public boolean af(int arg5, int arg6, int arg7) {
        int v1 = 0x5E0D2C51;
        boolean v2 = false;
        if(arg5 >= this.ax * v1) {
            if(arg5 >= this.ax * v1 + this.al * 0xADDDACCB) {
            }
            else {
                int v0 = 1170617979;
                int v3 = -381083219;
                if(arg6 >= (this.ae * v0 << 6) + (this.aj * v3 << 3) && arg6 <= (this.aj * v3 << 3) + (this.ae * v0 << 6) + 7) {
                    arg6 = 0xD83C04FF;
                    v1 = 0x24B28D73;
                    if(arg7 >= (this.ad * arg6 << 3) + (this.ar * v1 << 6) && arg7 <= (this.ar * v1 << 6) + (this.ad * arg6 << 3) + 7) {
                        v2 = true;
                    }
                }

                return v2;
            }
        }

        return 0;
    }

    public af ag(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -42)) {
            return null;
        }

        return new af(this.ax * 0x5E0D2C51, arg4 + (this.ae * 1905106624 - this.an * 0x5FF5C7C0) + (this.aj * 0x4A490D68 - this.aq * 0x3FBEC658), arg5 + (this.ar * 0x2CA35CC0 - this.ap * 0x2AC1BFC0) + (this.ad * 0xC1E027F8 - this.ab * 0x42ED2A08));
    }

    public void ah(lq arg3) {
        this.ax = arg3.ay(-124) * 0xD44FA58B;
        this.al = arg3.ay(-60) * 1004427491;
        this.ae = arg3.ao(0xAE909719) * 493303987;
        this.aj = arg3.ay(-92) * 0x6A3DF994;
        this.ar = arg3.ao(0xE0F461AB) * 0xAF05E4A8;
        this.ad = arg3.ay(-49) * 0x52AAFAFF;
        this.an = arg3.ao(-1835701028) * 0xE074E4DF;
        this.aq = arg3.ay(-53) * 0x14BCCE3;
        this.ap = arg3.ao(1770407926) * 0x84F327D0;
        this.ab = arg3.ay(-27) * 354020033;
        this.aj(1058070964);
    }

    public boolean ai(int arg5, int arg6, int arg7) {
        int v1 = 0x5E0D2C51;
        boolean v2 = false;
        if(arg5 >= this.ax * v1) {
            if(arg5 >= this.ax * v1 + this.al * 0xADDDACCB) {
            }
            else {
                int v0 = 1170617979;
                int v3 = -381083219;
                if(arg6 >= (this.ae * v0 << 6) + (this.aj * v3 << 3) && arg6 <= (this.aj * v3 << 3) + (this.ae * v0 << 6) + 7) {
                    arg6 = 0xD83C04FF;
                    v1 = 0x24B28D73;
                    if(arg7 >= (this.ad * arg6 << 3) + (this.ar * v1 << 6) && arg7 <= (this.ar * v1 << 6) + (this.ad * arg6 << 3) + 7) {
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
            int v0 = 0x5E0D2C51;
            boolean v1 = false;
            if(arg4 >= this.ax * v0) {
                if(arg4 >= this.ax * v0 + this.al * 0xADDDACCB) {
                }
                else {
                    arg7 = 1170617979;
                    int v2 = -381083219;
                    if(arg5 >= (this.ae * arg7 << 6) + (this.aj * v2 << 3) && arg5 <= (this.aj * v2 << 3) + (this.ae * arg7 << 6) + 7) {
                        arg5 = 0xD83C04FF;
                        v0 = 0x24B28D73;
                        if(arg6 >= (this.ad * arg5 << 3) + (this.ar * v0 << 6)) {
                            if(arg6 > (this.ar * v0 << 6) + (this.ad * arg5 << 3) + 7) {
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
            v5.append("ch.al(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }

        return true;
    }

    public af am(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -56)) {
            return null;
        }

        return new af(this.ax * 0x5E0D2C51, arg4 + (this.ae * 0x76D45260 - this.an * 1371628508) + (this.aj * 0x4A490D68 - this.aq * 0xE83BAD0E), arg5 + (this.ar * 0x35447E7A - this.ap * 0x2AC1BFC0) + (this.ad * 0xC1E027F8 - this.ab * 0x42ED2A08));
    }

    public af an(int arg3, int arg4, byte arg5) {
        arg5 = -43;
        try {
            if(!this.ae(arg3, arg4, arg5)) {
                return null;
            }

            return new af(this.ax * 0x5E0D2C51, arg3 + (this.ae * 1905106624 - this.an * 0x5FF5C7C0) + (this.aj * 0x4A490D68 - this.aq * 0x3FBEC658), arg4 + (this.ar * 0x2CA35CC0 - this.ap * 0x2AC1BFC0) + (this.ad * 0xC1E027F8 - this.ab * 0x42ED2A08));
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ch.an(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void ap(lq arg2, int arg3) {
        byte v3 = -35;
        try {
            this.ax = arg2.ay(v3) * 0x91F39CB1;
            this.al = arg2.ay(-55) * 1004427491;
            this.ae = arg2.ao(901889111) * 493303987;
            this.aj = arg2.ay(-34) * 0xDEFEEA25;
            this.ar = arg2.ao(756368806) * 0x6F575FBB;
            this.ad = arg2.ay(-38) * 0x52AAFAFF;
            this.an = arg2.ao(1692978804) * 0xE074E4DF;
            this.aq = arg2.ay(-87) * 0x14BCCE3;
            this.ap = arg2.ao(0x1F2B5DE0) * 0xDA23F8FF;
            this.ab = arg2.ay(-104) * 354020033;
            this.aj(1058070964);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("ch.ap(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public void aq(dh arg4) {
        int v2 = 1166006047;
        if(arg4.ab * -1474008723 > this.an * v2) {
            arg4.ab = this.an * 0x7135D73B;
        }

        if(arg4.af * 0xA95E9011 < this.an * v2) {
            arg4.af = this.an * 0x13D1242F;
        }

        v2 = 0x74AB06FF;
        if(arg4.ai * 0xB342073 > this.ap * v2) {
            arg4.ai = this.ap * 1035900997;
        }

        if(arg4.av * 0x9FFD4C8B < this.ap * v2) {
            arg4.av = this.ap * 0xE87F39DD;
        }
    }

    public int[] ar(int arg5, int arg6, int arg7, int arg8) {
        arg8 = 0x8D8E0F11;
        try {
            if(!this.al(arg5, arg6, arg7, arg8)) {
                return null;
            }

            return new int[]{this.aq * 0x3FBEC658 - this.aj * 0x4A490D68 + (this.an * 0x5FF5C7C0 - this.ae * 1905106624 + arg6), arg7 + (this.ap * 0x2AC1BFC0 - this.ar * 0x2CA35CC0) + (this.ab * 0x42ED2A08 - this.ad * 0xC1E027F8)};
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("ch.ar(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    void at() {
    }

    public int[] au(int arg6, int arg7, int arg8) {
        if(!this.al(arg6, arg7, arg8, -1986206307)) {
            return null;
        }

        return new int[]{this.aq * -2078705080 - this.aj * 0x4A490D68 + (this.an * 1856865305 - this.ae * 1905106624 + arg7), arg8 + (this.ap * 0x60C7740C - this.ar * 105668470) + (this.ab * 0x73FE9C0D - this.ad * 0xC1E027F8)};
    }

    public int[] av(int arg6, int arg7, int arg8) {
        if(!this.al(arg6, arg7, arg8, -2086705831)) {
            return null;
        }

        return new int[]{this.aq * 0x3FBEC658 - this.aj * 0x4A490D68 + (this.an * 0x5FF5C7C0 - this.ae * 1905106624 + arg7), arg8 + (this.ap * 0x2AC1BFC0 - this.ar * 0x2CA35CC0) + (this.ab * 0x42ED2A08 - this.ad * 0xC1E027F8)};
    }

    public boolean aw(int arg5, int arg6) {
        boolean v5;
        int v1 = 0x67F7D8CB;
        int v3 = 1166006047;
        if(arg5 < (this.aq * v1 << 3) + (this.an * v3 << 6) || arg5 > (this.an * v3 << 6) + (this.aq * v1 << 3) + 7) {
        label_40:
            v5 = false;
        }
        else {
            int v0 = 0x74AB06FF;
            int v2 = 0xA85DA541;
            if(arg6 < (this.ap * v0 << 6) + (this.ab * v2 << 3)) {
                goto label_40;
            }
            else if(arg6 <= (this.ap * v0 << 6) + (this.ab * v2 << 3) + 7) {
                v5 = true;
            }
            else {
                goto label_40;
            }
        }

        return v5;
    }

    public static int ax(int arg22, int arg23, int arg24, gx arg25, gy arg26, boolean arg27, int[] arg28, int[] arg29, byte arg30) {
        int v20;
        int v19;
        int v17;
        int v16;
        int v14;
        int v8_1;
        int v10;
        int v15;
        int v13;
        int v4;
        boolean v1_1;
        int v0 = arg22;
        int v7 = arg23;
        int v3 = arg24;
        gx v8 = arg25;
        gy v5 = arg26;
        int[] v9 = arg28;
        int v1 = 0;
        while(true) {
        label_8:
            int v11 = 0x80;
            if(v1 >= v11) {
                goto label_23;
            }

            int v2 = 0;
            while(true) {
                if(v2 >= v11) {
                    goto label_21;
                }

                try {
                    gb.ae[v1][v2] = 0;
                    gb.ar[v1][v2] = 0x5F5E0FF;
                    ++v2;
                    continue;
                label_21:
                    ++v1;
                    goto label_8;
                label_23:
                    if(v3 == 1) {
                        v1_1 = fr.al(v0, v7, v8, v5, -2071324257);
                    }
                    else if(v3 == 2) {
                        v1_1 = fg.ae(v0, v7, v8, v5, 1927406126);
                    }
                    else {
                        v1_1 = hq.ar(arg22, arg23, arg24, arg25, arg26, 3);
                    }

                    v2 = v0 - 0x40;
                    v3 = v7 - 0x40;
                    int v5_1 = gb.an * 0xACACC563;
                    int v6 = gb.ap * 0xAF35C79B;
                    if(!v1_1) {
                        if(arg27) {
                            v4 = 10;
                            v13 = v8.ax * 0xDF453919;
                            v15 = v8.al * 0x6D26E86D;
                            v10 = v8.ae * 0xA7F3B04D;
                            v8_1 = v8.ar * 0x25FC5F07;
                            v14 = v13 - 10;
                            v16 = v6;
                            v17 = 0x7FFFFFFF;
                            v6 = v5_1;
                            v5_1 = 0x7FFFFFFF;
                            goto label_70;
                        }
                        else {
                            return -1;
                        label_70:
                            while(v14 <= v4 + v13) {
                                v1 = v15 - 10;
                                int v18 = v17;
                                while(v1 <= v4 + v15) {
                                    int v12 = v14 - v2;
                                    v4 = v1 - v3;
                                    if(v12 < 0 || v4 < 0 || v12 >= v11 || v4 >= v11) {
                                        v19 = v6;
                                    label_129:
                                        v20 = v8_1;
                                    label_130:
                                        v11 = v18;
                                    label_131:
                                        v18 = v11;
                                        v6 = v19;
                                    }
                                    else {
                                        v19 = v6;
                                        if(gb.ar[v12][v4] < 100) {
                                            if(v14 < v13) {
                                                v6 = v13 - v14;
                                            }
                                            else {
                                                v6 = v13 + v10 - 1;
                                                v6 = v14 > v6 ? v14 - v6 : 0;
                                            }

                                            if(v1 < v15) {
                                                v20 = v8_1;
                                                v8_1 = v15 - v1;
                                            }
                                            else {
                                                v20 = v8_1;
                                                v8_1 = v8_1 + v15 - 1;
                                                v8_1 = v1 > v8_1 ? v1 - v8_1 : 0;
                                            }

                                            v6 = v6 * v6 + v8_1 * v8_1;
                                            if(v6 >= v5_1) {
                                                if(v6 == v5_1) {
                                                    v11 = v18;
                                                    if(gb.ar[v12][v4] < v11) {
                                                        goto label_121;
                                                    }

                                                    goto label_131;
                                                }
                                                else {
                                                    goto label_130;
                                                }
                                            }

                                        label_121:
                                            v18 = gb.ar[v12][v4];
                                            v16 = v1;
                                            v5_1 = v6;
                                            v6 = v14;
                                        }
                                        else {
                                            goto label_129;
                                        }
                                    }

                                    ++v1;
                                    v8_1 = v20;
                                    v4 = 10;
                                    v11 = 0x80;
                                }

                                ++v14;
                                v17 = v18;
                                v4 = 10;
                                v11 = 0x80;
                            }

                            if(0x7FFFFFFF == v5_1) {
                                return -1;
                            }

                            v5_1 = v6;
                            v6 = v16;
                        }
                    }

                    if(v5_1 == v0 && v7 == v6) {
                        return 0;
                    }

                    v1 = 0;
                    gb.ad[0] = v5_1;
                    gb.aq[0] = v6;
                    v4 = gb.ae[v5_1 - v2][v6 - v3];
                    v8_1 = v4;
                    int v21 = 1;
                    while(v5_1 != v0 || v6 != v7) {
                        if(v4 != v8_1) {
                            gb.ad[v21] = v5_1;
                            gb.aq[v21] = v6;
                            v8_1 = v4;
                            ++v21;
                        }

                        if((v4 & 2) != 0) {
                            ++v5_1;
                        }
                        else if((v4 & 8) != 0) {
                            --v5_1;
                        }

                        if((v4 & 1) != 0) {
                            ++v6;
                        }
                        else if((v4 & 4) != 0) {
                            --v6;
                        }

                        v4 = gb.ae[v5_1 - v2][v6 - v3];
                    }

                    while(true) {
                        v0 = v21 - 1;
                        if(v21 > 0) {
                            v9[v1] = gb.ad[v0];
                            v2 = v1 + 1;
                            arg29[v1] = gb.aq[v0];
                            if(v2 >= v9.length) {
                                v1 = v2;
                            }
                            else {
                                v21 = v0;
                                v1 = v2;
                                continue;
                            }
                        }

                        return v1;
                    }

                    return v1;
                label_29:
                    break;
                }
                catch(RuntimeException v0_1) {
                    goto label_29;
                }
            }
        }

        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ch.ax(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0_1), v1_2.toString());
    }

    public void ax(dh arg3, int arg4) {
        try {
            int v1 = 1166006047;
            if(arg3.ab * -1474008723 > this.an * v1) {
                arg3.ab = this.an * 0x7135D73B;
            }

            if(arg3.af * 0xA95E9011 < this.an * v1) {
                arg3.af = this.an * 0x13D1242F;
            }

            v1 = 0x74AB06FF;
            if(arg3.ai * 0xB342073 > this.ap * v1) {
                arg3.ai = this.ap * 1035900997;
            }

            if(arg3.av * 0x9FFD4C8B < this.ap * v1) {
                arg3.av = this.ap * 0xE87F39DD;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ch.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public boolean ay(int arg5, int arg6) {
        boolean v5;
        int v1 = 0x67F7D8CB;
        int v3 = 1166006047;
        if(arg5 < (this.aq * v1 << 3) + (this.an * v3 << 6) || arg5 > (this.an * v3 << 6) + (this.aq * v1 << 3) + 7) {
        label_40:
            v5 = false;
        }
        else {
            int v0 = 0x74AB06FF;
            int v2 = 0xA85DA541;
            if(arg6 < (this.ap * v0 << 6) + (this.ab * v2 << 3)) {
                goto label_40;
            }
            else if(arg6 <= (this.ap * v0 << 6) + (this.ab * v2 << 3) + 7) {
                v5 = true;
            }
            else {
                goto label_40;
            }
        }

        return v5;
    }

    public af az(int arg4, int arg5) {
        if(!this.ae(arg4, arg5, -55)) {
            return null;
        }

        return new af(this.ax * -1491580326, arg4 + (this.ae * 0x9F584B35 - this.an * 0x6DA8453E) + (this.aj * 0x1F403614 - this.aq * 0x5B6AF918), arg5 + (this.ar * 0x2CA35CC0 - this.ap * 0x2AC1BFC0) + (this.ad * 0xC050729E - this.ab * 0x42ED2A08));
    }
}

