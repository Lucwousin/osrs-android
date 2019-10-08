public class jx {
    int aa;
    int[] ab;
    int ad;
    static final int ae = 0x80;
    int[] af;
    int[] ag;
    int ah;
    int[] ai;
    int[] aj;
    static final int al = 0x100;
    int[] am;
    static final int an = 0x300;
    static final int ap = 0x100;
    int[] aq;
    int at;
    int[] au;
    int av;
    ef[] ax;
    int ay;
    int[] az;
    static final int bf = 3;

    jx(ef[] arg3) {
        try {
            super();
            this.aj = new int[0x100];
            this.ad = 0;
            this.av = 0;
            this.aa = 0;
            this.ah = 0;
            this.at = 0;
            this.ay = 0;
            this.ax = arg3;
            this.ax(1);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jx.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aa(int arg3, int arg4, fa arg5) {
        if(this.au == null) {
            this.ax(1);
        }

        if(this.ay * 0xC98AB75F == 0) {
            this.ay = -601345414 * arg4;
        }

        int v0 = arg4 - this.ay * 0x6B31800D;
        if(v0 >= 0x116B23A4) {
            v0 = 0;
        }

        this.ay = arg4 * 0x6FD6CEC5;
        if(v0 > 0) {
            this.ar(v0, 0x4300E94);
        }

        this.ap(arg3, arg5, 0xFD26264);
    }

    void ab() {
        int v5;
        int v3;
        int v0 = 0x100;
        this.ab = new int[v0];
        int v1 = 0;
        int v2;
        for(v2 = 0; true; ++v2) {
            v3 = 0x40000;
            int v4 = 0x40;
            if(v2 >= v4) {
                break;
            }

            this.ab[v2] = v3 * v2;
        }

        for(v2 = 0; v2 < v4; ++v2) {
            this.ab[v2 + 0x40] = v2 * 0x400 + 0xFF0000;
        }

        for(v2 = 0; v2 < v4; ++v2) {
            this.ab[v2 + 0x80] = v2 * 4 + 0xFFFF00;
        }

        for(v2 = 0; true; ++v2) {
            v5 = 0xFFFFFF;
            if(v2 >= v4) {
                break;
            }

            this.ab[v2 + 0xC0] = v5;
        }

        this.af = new int[v0];
        for(v2 = 0; v2 < v4; ++v2) {
            this.af[v2] = v2 * 0x400;
        }

        for(v2 = 0; v2 < v4; ++v2) {
            this.af[v2 + 0x40] = v2 * 4 + 0xFF00;
        }

        for(v2 = 0; v2 < v4; ++v2) {
            this.af[v2 + 0x80] = v2 * v3 + 0xFFFF;
        }

        for(v2 = 0; v2 < v4; ++v2) {
            this.af[v2 + 0xC0] = v5;
        }

        this.ai = new int[v0];
        for(v2 = 0; v2 < v4; ++v2) {
            this.ai[v2] = v2 * 4;
        }

        for(v2 = 0; v2 < v4; ++v2) {
            this.ai[v2 + 0x40] = v2 * v3 + 0xFF;
        }

        for(v2 = 0; v2 < v4; ++v2) {
            this.ai[v2 + 0x80] = v2 * 0x400 + 0xFF00FF;
        }

        while(v1 < v4) {
            this.ai[v1 + 0xC0] = v5;
            ++v1;
        }

        this.aq = new int[v0];
        this.az = new int[0x8000];
        this.ag = new int[0x8000];
        this.aq(null, 70);
        this.au = new int[0x8000];
        this.am = new int[0x8000];
    }

    final void ac(fa arg20, int arg21) {
        int v7;
        jx v0 = this;
        fa v1 = arg20;
        int v3 = 1;
        int v4 = 0;
        while(v3 < 0xFF) {
            int v5 = v0.aj[v3] * (0x100 - v3) / 0x100 + arg21;
            if(v5 < 0) {
                v7 = -v5;
                v5 = 0;
            }
            else {
                v7 = 0;
            }

            int v10 = -107049639;
            int v11 = 0x80;
            int v8 = v5 + 0x80 >= v1.al * v10 ? v1.al * v10 - v5 : 0x80;
            v5 += v1.al * v10 * (v3 + 8);
            v4 += v7;
            while(v7 < v8) {
                v10 = v4 + 1;
                v4 = v0.au[v4];
                if(v4 != 0) {
                    int v9 = 0x100 - v4;
                    v1.ax[v5] = ((v0.aq[v4] & 0xFF00) * v4 + (v1.ax[v5] & 0xFF00) * v9 & 0xFF0000) + (v4 * (v0.aq[v4] & 0xFF00FF) + (v1.ax[v5] & 0xFF00FF) * v9 & 0xFF00FF00) >> 8 | 0xFF000000;
                    ++v5;
                }
                else {
                    ++v5;
                }

                ++v7;
                v4 = v10;
            }

            v4 += v11 - v8;
            ++v3;
        }
    }

    final void ad(fa arg20, int arg21, int arg22) {
        int v8;
        int v11;
        int v10;
        int v7;
        int v5;
        jx v1 = this;
        fa v0 = arg20;
        int v3 = 1;
        int v4 = 0;
        while(true) {
            if(v3 >= 0xFF) {
                return;
            }

            try {
                v5 = v1.aj[v3] * (0x100 - v3) / 0x100 + arg21;
                if(v5 < 0) {
                    v7 = -v5;
                    v5 = 0;
                }
                else {
                    v7 = 0;
                }

                v10 = -107049639;
                v11 = 0x80;
                v8 = v5 + 0x80 >= v0.al * v10 ? v0.al * v10 - v5 : 0x80;
                v5 += v0.al * v10 * (v3 + 8);
                v4 += v7;
                while(true) {
                label_36:
                    if(v7 >= v8) {
                        goto label_75;
                    }

                    v10 = v4 + 1;
                    v4 = v1.au[v4];
                    if(v4 != 0) {
                        int v9 = 0x100 - v4;
                        v0.ax[v5] = ((v1.aq[v4] & 0xFF00) * v4 + (v0.ax[v5] & 0xFF00) * v9 & 0xFF0000) + (v4 * (v1.aq[v4] & 0xFF00FF) + (v0.ax[v5] & 0xFF00FF) * v9 & 0xFF00FF00) >> 8 | 0xFF000000;
                        ++v5;
                    }
                    else {
                        break;
                    }

                    goto label_72;
                }
            }
            catch(RuntimeException v0_1) {
                break;
            }

            ++v5;
        label_72:
            ++v7;
            v4 = v10;
            goto label_36;
        label_75:
            v4 += v11 - v8;
            ++v3;
        }

        StringBuilder v2 = new StringBuilder();
        v2.append("jx.ad(");
        v2.append(')');
        throw lx.al(((Throwable)v0_1), v2.toString());
    }

    public static String ae(long arg12) {
        String v0 = null;
        long v1 = 0;
        if(arg12 > v1) {
            if(arg12 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                try {
                    if(v1 == arg12 % v3) {
                        return v0;
                    }
                    else {
                        int v7 = 0;
                        long v5;
                        for(v5 = arg12; v1 != v5; v5 /= v3) {
                            ++v7;
                        }

                        StringBuilder v5_1 = new StringBuilder(v7);
                        while(v1 != arg12) {
                            long v6 = arg12 / v3;
                            char v12_1 = lz.ax[((int)(arg12 - v6 * v3))];
                            if(0x5F == v12_1) {
                                int v12_2 = v5_1.length() - 1;
                                v5_1.setCharAt(v12_2, Character.toUpperCase(v5_1.charAt(v12_2)));
                                v12_1 = ' ';
                            }

                            v5_1.append(v12_1);
                            arg12 = v6;
                        }

                        v5_1.reverse();
                        v5_1.setCharAt(0, Character.toUpperCase(v5_1.charAt(0)));
                        return v5_1.toString();
                    }
                }
                catch(RuntimeException v12) {
                    StringBuilder v13 = new StringBuilder();
                    v13.append("jx.ae(");
                    v13.append(')');
                    throw lx.al(((Throwable)v12), v13.toString());
                }
            }
        }

        return v0;
    }

    void ae(int arg3, int arg4, fa arg5, byte arg6) {
        try {
            if(this.au == null) {
                this.ax(1);
            }

            int v0 = 0x6B31800D;
            int v1 = 0x6FD6CEC5;
            if(this.ay * v0 == 0) {
                this.ay = arg4 * v1;
            }

            int v6 = arg4 - this.ay * v0;
            if(v6 >= 0x100) {
                v6 = 0;
            }

            this.ay = arg4 * v1;
            if(v6 > 0) {
                this.ar(v6, -193108424);
            }

            this.ap(arg3, arg5, 1737371300);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("jx.ae(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void af() {
        this.ab = null;
        this.af = null;
        this.ai = null;
        this.aq = null;
        this.az = null;
        this.ag = null;
        this.au = null;
        this.am = null;
        this.ah = 0;
        this.at = 0;
    }

    final void ag(int arg21) {
        int v4_1;
        jx v0 = this;
        int v1 = arg21;
        v0.ah += 0x926BE380 * v1;
        double v4 = 12;
        if(v0.ah * 0xD25B1B87 > v0.az.length) {
            v0.ah -= v0.az.length * 0x2C11DDE3;
            v0.aq(v0.ax[((int)(Math.random() * v4))], 4);
        }

        int v2 = -1049103655 * v1;
        int v3 = 0x100;
        int v6 = 0x100 - v1;
        int v7 = 0xD9ED929A * v6;
        int v9 = 0;
        int v10;
        for(v10 = 0; v9 < v7; ++v10) {
            int v11 = v0.au[v2 + v10] - v0.az[v0.ah * 0x1453B9F7 + v10 & v0.az.length - 1] * v1 / 6;
            if(v11 < 0) {
                v11 = 0;
            }

            v0.au[v10] = v11;
            ++v9;
        }

        for(v2 = 2016038607 - v1; v2 < 0x467EB00E; ++v2) {
        }

        if(v0.av * 0xB1E0BD86 > 0) {
            v0.av -= 904058620 * v1;
        }

        if(v0.aa * 0x692868CF > 0) {
            v0.aa -= -2060083908 * v1;
        }

        if(v0.av * 0x3D623A3F == 0 && v0.aa * 0xCFFB68CF == 0) {
            v2 = ((int)(Math.random() * (((double)(0x1D0031C6 / v1)))));
            if(v2 == 0) {
                v0.av = 0xE2D6FC00;
            }

            if(v2 != 1) {
                goto label_107;
            }

            v0.aa = 0xF10B078F;
        }

    label_107:
        for(v2 = 0; v2 < -762766044 - v1; ++v2) {
            v0.aj[v2] = v0.aj[v2 + v1];
        }

        while(v6 < v3) {
            v0.aj[v6] = ((int)(Math.sin((((double)(v0.ad * 0x9E279FC1))) / 14) * 16 + Math.sin((((double)(v0.ad * 0x9A89EBD1))) / 15) * 14 + Math.sin((((double)(v0.ad * 0x9E279FC1))) / 16) * 12));
            v0.ad += 0x239769BA;
            ++v6;
            v3 = 0x100;
        }

        v0.at += 0x891BE203 * v1;
        v1 = (v1 + (client.bj * 0xA461419 & 1)) / 2;
        if(v1 > 0) {
            v2 = 0x6F1ACF00;
            for(v3 = 0; true; ++v3) {
                int v5 = 0x80;
                if(v3 >= v0.at * 0x3996A2CC) {
                    break;
                }

                v0.au[(((int)(Math.random() * (((double)v2))))) + 2 + ((((int)(Math.random() * (((double)v5))))) + v5 << 7)] = 0x4E0F5708;
            }

            v0.at = 0;
            for(v2 = 0; v2 < 0x100; ++v2) {
                v3 = v2 * 0x80;
                v4_1 = -v1;
                v6 = 0;
                while(v4_1 < v5) {
                    if(v1 + v4_1 < 0x9B07FA6A) {
                        v6 += v0.au[v3 + v4_1 + v1];
                    }

                    v7 = v1 + 1;
                    if(v4_1 - v7 >= 0) {
                        v6 -= v0.au[v3 + v4_1 - v7];
                    }

                    if(v4_1 >= 0) {
                        v0.am[v3 + v4_1] = v6 / (v1 * 2 + 1);
                    }

                    ++v4_1;
                }
            }

            for(v2 = 0; v2 < v5; ++v2) {
                v3 = -v1;
                v4_1 = 0;
                v6 = 0x100;
                while(v3 < v6) {
                    v7 = 0x8D6FB900 * v3;
                    if(v1 + v3 < 0x491E0BDA) {
                        v4_1 += v0.am[v2 + v7 + v1 * 0x80];
                    }

                    v9 = v1 + 1;
                    if(v3 - v9 >= 0) {
                        v4_1 -= v0.am[v7 + v2 - v9 * 0x80];
                    }

                    if(v3 >= 0) {
                        v0.au[v7 + v2] = v4_1 / (v1 * 2 + 1);
                    }

                    ++v3;
                }
            }
        }
    }

    final int ah(int arg4, int arg5, int arg6) {
        int v0 = 0x100 - arg6;
        return (0xFF0000 & (arg5 & 0xFF00) * arg6 + (0xFF00 & arg4) * v0) + (0xFF00FF00 & v0 * (arg4 & 0xFF00FF) + (arg5 & 0xFF00FF) * arg6) >> 8;
    }

    void ai() {
        this.ab = null;
        this.af = null;
        this.ai = null;
        this.aq = null;
        this.az = null;
        this.ag = null;
        this.au = null;
        this.am = null;
        this.ah = 0;
        this.at = 0;
    }

    final void aj(int arg7, int[] arg8, int arg9) {
        int v0;
        try {
            arg9 = this.aq.length;
            v0 = 0;
            while(true) {
            label_3:
                if(v0 >= arg9) {
                    return;
                }

                if(arg7 > 0x300) {
                    this.aq[v0] = this.an(this.ab[v0], arg8[v0], 0x400 - arg7, -93);
                }
                else {
                    int v1 = 0x100;
                    this.aq[v0] = arg7 > v1 ? arg8[v0] : this.an(arg8[v0], this.ab[v0], v1 - arg7, -48);
                }

                break;
            }
        }
        catch(RuntimeException v7) {
            goto label_34;
        }

        ++v0;
        goto label_3;
        return;
    label_34:
        StringBuilder v8 = new StringBuilder();
        v8.append("jx.aj(");
        v8.append(')');
        throw lx.al(((Throwable)v7), v8.toString());
    }

    final void ak(int arg8, int[] arg9) {
        int v0 = this.aq.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(arg8 > 0x300) {
                this.aq[v1] = this.an(this.ab[v1], arg9[v1], 0x400 - arg8, -37);
            }
            else {
                int v2 = 0x100;
                this.aq[v1] = arg8 > v2 ? arg9[v1] : this.an(arg9[v1], this.ab[v1], v2 - arg8, -106);
            }
        }
    }

    void al(int arg3) {
        int[] v3 = null;
        try {
            this.ab = v3;
            this.af = v3;
            this.ai = v3;
            this.aq = v3;
            this.az = v3;
            this.ag = v3;
            this.au = v3;
            this.am = v3;
            this.ah = 0;
            this.at = 0;
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jx.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    void am(int arg3, int arg4, fa arg5) {
        if(this.au == null) {
            this.ax(1);
        }

        if(this.ay * 0xA79F78F7 == 0) {
            this.ay = 0x30CC5E4F * arg4;
        }

        int v0 = arg4 - this.ay * 0x6B31800D;
        if(v0 >= 0x100) {
            v0 = 0;
        }

        this.ay = arg4 * 0x6FD6CEC5;
        if(v0 > 0) {
            this.ar(v0, 0x14FCE9FF);
        }

        this.ap(arg3, arg5, 720159316);
    }

    final int an(int arg3, int arg4, int arg5, byte arg6) {
        int v6 = 0x100 - arg5;
        return (0xFF0000 & (arg4 & 0xFF00) * arg5 + (0xFF00 & arg3) * v6) + (0xFF00FF00 & v6 * (arg3 & 0xFF00FF) + (arg4 & 0xFF00FF) * arg5) >> 8;
    }

    final void ao(int arg8, int[] arg9) {
        int v0 = this.aq.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(arg8 > 0x300) {
                this.aq[v1] = this.an(this.ab[v1], arg9[v1], 0x400 - arg8, -123);
            }
            else {
                int v2 = 0x100;
                this.aq[v1] = arg8 > v2 ? arg9[v1] : this.an(arg9[v1], this.ab[v1], v2 - arg8, -55);
            }
        }
    }

    final void ap(int arg4, fa arg5, int arg6) {
        try {
            arg6 = this.aq.length;
            int v1 = 0x3D623A3F;
            int v2 = 1163009031;
            if(this.av * v1 > 0) {
                this.aj(this.av * v1, this.af, v2);
            }
            else {
                v1 = 0x563B4FAF;
                if(this.aa * v1 > 0) {
                    this.aj(this.aa * v1, this.ai, v2);
                }
                else {
                    int v0;
                    for(v0 = 0; v0 < arg6; ++v0) {
                        this.aq[v0] = this.ab[v0];
                    }
                }
            }

            this.ad(arg5, arg4, 0xCD078746);
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("jx.ap(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    final void aq(ef arg11, byte arg12) {
        int v1_1;
        int v4;
        int v0 = 0;
        try {
            while(v0 < this.az.length) {
                this.az[v0] = 0;
                ++v0;
            }

            for(v0 = 0; v0 < 5000; ++v0) {
                this.az[((int)(Math.random() * 128 * 256))] = ((int)(Math.random() * 256));
            }

            for(v0 = 0; v0 < 20; ++v0) {
                int v2;
                for(v2 = 1; v2 < 0xFF; ++v2) {
                    int v3;
                    for(v3 = 1; v3 < 0x7F; ++v3) {
                        v4 = (v2 << 7) + v3;
                        this.ag[v4] = (this.az[v4 + 0x80] + (this.az[v4 - 1] + this.az[v4 + 1] + this.az[v4 - 0x80])) / 4;
                    }
                }

                int[] v1 = this.az;
                this.az = this.ag;
                this.ag = v1;
            }

            if(arg11 != null) {
                v0 = 0;
                v1_1 = 0;
                while(true) {
                label_68:
                    if(v0 < arg11.ar) {
                        v2 = v1_1;
                        v1_1 = 0;
                        while(true) {
                        label_72:
                            if(v1_1 < arg11.ae) {
                                v4 = v2 + 1;
                                if(arg11.ax[v2] != 0) {
                                    this.az[(arg11.ap + (v0 + 16) << 7) + (arg11.an + (v1_1 + 16))] = 0;
                                }

                                goto label_88;
                            }
                            else {
                                goto label_91;
                            }
                        }
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v11) {
            goto label_97;
        }

    label_88:
        ++v1_1;
        v2 = v4;
        goto label_72;
    label_91:
        ++v0;
        v1_1 = v2;
        goto label_68;
        return;
    label_97:
        StringBuilder v12 = new StringBuilder();
        v12.append("jx.aq(");
        v12.append(')');
        throw lx.al(((Throwable)v11), v12.toString());
    }

    final void ar(int arg22, int arg23) {
        int v6;
        int v5_1;
        int v3;
        jx v1 = this;
        int v0 = arg22;
        try {
            v1.ah += 0x926BE380 * v0;
            v3 = 0x1453B9F7;
            double v5 = 12;
            if(v1.ah * v3 > v1.az.length) {
                v1.ah -= v1.az.length * 0x5D24D7C7;
                v1.aq(v1.ax[((int)(Math.random() * v5))], 77);
            }

            int v2 = v0 * 0x80;
            int v4 = 0x100;
            int v7 = 0x100 - v0;
            int v8 = v7 * 0x80;
            int v10 = 0;
            int v11 = 0;
            while(v10 < v8) {
                v3 = v1.au[v2 + v11] - v1.az[v1.az.length - 1 & v1.ah * v3 + v11] * v0 / 6;
                if(v3 < 0) {
                    v3 = 0;
                }

                v1.au[v11] = v3;
                ++v10;
                ++v11;
                v3 = 0x1453B9F7;
            }

            v2 = 10;
            v3 = 0x76;
            for(v8 = v7; true; ++v8) {
                v10 = 0x80;
                if(v8 >= v4) {
                    break;
                }

                v11 = v8 * 0x80;
                int v13;
                for(v13 = 0; v13 < v10; ++v13) {
                    if((((int)(Math.random() * 100))) >= 50 || v13 <= v2 || v13 >= v3) {
                        v1.au[v11 + v13] = 0;
                    }
                    else {
                        v1.au[v13 + v11] = 0xFF;
                    }
                }
            }

            v3 = 0x3D623A3F;
            if(v1.av * v3 > 0) {
                v1.av -= 904058620 * v0;
            }

            v8 = 0x563B4FAF;
            if(v1.aa * v8 > 0) {
                v1.aa -= -2060083908 * v0;
            }

            if(v1.av * v3 == 0 && v1.aa * v8 == 0) {
                v2 = ((int)(Math.random() * (((double)(2000 / v0)))));
                if(v2 == 0) {
                    v1.av = 0xE2D6FC00;
                }

                if(v2 != 1) {
                    goto label_125;
                }

                v1.aa = 0x359D3C00;
            }

        label_125:
            for(v2 = 0; v2 < v7; ++v2) {
                v1.aj[v2] = v1.aj[v2 + v0];
            }

            while(v7 < v4) {
                v1.aj[v7] = ((int)(Math.sin((((double)(v1.ad * 0x9E279FC1))) / 14) * 16 + Math.sin((((double)(v1.ad * 0x9E279FC1))) / 15) * 14 + Math.sin((((double)(v1.ad * 0x9E279FC1))) / 16) * v5));
                v1.ad += 0x450C7041;
                ++v7;
            }

            v1.at += 0x891BE203 * v0;
            v0 = (v0 + (client.bj * -2077001153 & 1)) / 2;
            if(v0 > 0) {
                v2 = 0x7C;
                for(v3 = 0; v3 < v1.at * 0x3996A2CC; ++v3) {
                    v1.au[(((int)(Math.random() * (((double)v2))))) + 2 + ((((int)(Math.random() * (((double)0x80))))) + 0x80 << 7)] = 0xC0;
                }

                v1.at = 0;
                for(v3 = 0; v3 < v4; ++v3) {
                    v5_1 = v3 * 0x80;
                    v6 = -v0;
                    v7 = 0;
                    while(true) {
                        v8 = 0x80;
                        if(v6 >= v8) {
                            break;
                        }

                        if(v0 + v6 < v8) {
                            v7 += v1.au[v5_1 + v6 + v0];
                        }

                        v8 = v0 + 1;
                        if(v6 - v8 >= 0) {
                            v7 -= v1.au[v5_1 + v6 - v8];
                        }

                        if(v6 >= 0) {
                            v1.am[v5_1 + v6] = v7 / (v0 * 2 + 1);
                        }

                        ++v6;
                    }
                }

                v3 = 0;
                v5_1 = 0x80;
                while(true) {
                label_245:
                    if(v3 >= v5_1) {
                        return;
                    }

                    v6 = -v0;
                    v7 = 0;
                    while(true) {
                    label_248:
                        if(v6 >= v4) {
                            goto label_276;
                        }

                        v8 = v6 * 0x80;
                        if(v0 + v6 < v4) {
                            v7 += v1.am[v3 + v8 + v0 * 0x80];
                        }

                        int v9 = v0 + 1;
                        if(v6 - v9 >= 0) {
                            v7 -= v1.am[v8 + v3 - v9 * 0x80];
                        }

                        if(v6 >= 0) {
                            v1.au[v8 + v3] = v7 / (v0 * 2 + 1);
                        }

                        goto label_274;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v0_1) {
            goto label_281;
        }

    label_274:
        ++v6;
        goto label_248;
    label_276:
        ++v3;
        goto label_245;
        return;
    label_281:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("jx.ar(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    final void as(int arg8, int[] arg9) {
        int v0 = this.aq.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(arg8 > 389082049) {
                this.aq[v1] = this.an(this.ab[v1], arg9[v1], 1220440300 - arg8, -22);
            }
            else {
                int v2 = 0x100;
                this.aq[v1] = arg8 > v2 ? arg9[v1] : this.an(arg9[v1], this.ab[v1], v2 - arg8, -118);
            }
        }
    }

    final int at(int arg4, int arg5, int arg6) {
        int v0 = 0x100 - arg6;
        return (0xFF0000 & (arg5 & 0xFF00) * arg6 + (0xFF00 & arg4) * v0) + (0xFF00FF00 & v0 * (arg4 & 0xFF00FF) + (arg5 & 0xFF00FF) * arg6) >> 8;
    }

    void au(int arg4, int arg5, fa arg6) {
        if(this.au == null) {
            this.ax(1);
        }

        int v1 = 0x6B31800D;
        int v2 = 0x6FD6CEC5;
        if(this.ay * v1 == 0) {
            this.ay = arg5 * v2;
        }

        int v0 = arg5 - this.ay * v1;
        if(v0 >= 0x100) {
            v0 = 0;
        }

        this.ay = arg5 * v2;
        if(v0 > 0) {
            this.ar(v0, 0xE9D9F8ED);
        }

        this.ap(arg4, arg6, 176150510);
    }

    void av(int arg4, int arg5, fa arg6) {
        if(this.au == null) {
            this.ax(1);
        }

        int v1 = 0x6FD6CEC5;
        if(this.ay * 0xE9ED6BA1 == 0) {
            this.ay = arg5 * v1;
        }

        int v0 = arg5 - this.ay * 0x6B31800D;
        if(v0 >= 0xD2BD116B) {
            v0 = 0;
        }

        this.ay = arg5 * v1;
        if(v0 > 0) {
            this.ar(v0, -84261);
        }

        this.ap(arg4, arg6, 0x7783486);
    }

    final int aw(int arg4, int arg5, int arg6) {
        int v0 = 0x100 - arg6;
        return ((0xFF00 & arg5) * arg6 + (0xA36285F & arg4) * v0 & 0xFC24E32D) + (0x220EA92C & v0 * (arg4 & 0xCC3EFE8B) + (0xFF00FF & arg5) * arg6) >> 8;
    }

    void ax(byte arg10) {
        int v4;
        int v2;
        int v10 = 0x100;
        try {
            this.ab = new int[v10];
            int v0 = 0;
            int v1;
            for(v1 = 0; true; ++v1) {
                v2 = 0x40000;
                int v3 = 0x40;
                if(v1 >= v3) {
                    break;
                }

                this.ab[v1] = v2 * v1;
            }

            for(v1 = 0; v1 < v3; ++v1) {
                this.ab[v1 + 0x40] = v1 * 0x400 + 0xFF0000;
            }

            for(v1 = 0; v1 < v3; ++v1) {
                this.ab[v1 + 0x80] = v1 * 4 + 0xFFFF00;
            }

            for(v1 = 0; true; ++v1) {
                v4 = 0xFFFFFF;
                if(v1 >= v3) {
                    break;
                }

                this.ab[v1 + 0xC0] = v4;
            }

            this.af = new int[v10];
            for(v1 = 0; v1 < v3; ++v1) {
                this.af[v1] = v1 * 0x400;
            }

            for(v1 = 0; v1 < v3; ++v1) {
                this.af[v1 + 0x40] = v1 * 4 + 0xFF00;
            }

            for(v1 = 0; v1 < v3; ++v1) {
                this.af[v1 + 0x80] = v1 * v2 + 0xFFFF;
            }

            for(v1 = 0; v1 < v3; ++v1) {
                this.af[v1 + 0xC0] = v4;
            }

            this.ai = new int[v10];
            for(v1 = 0; v1 < v3; ++v1) {
                this.ai[v1] = v1 * 4;
            }

            for(v1 = 0; v1 < v3; ++v1) {
                this.ai[v1 + 0x40] = v1 * v2 + 0xFF;
            }

            for(v1 = 0; v1 < v3; ++v1) {
                this.ai[v1 + 0x80] = v1 * 0x400 + 0xFF00FF;
            }

            while(v0 < v3) {
                this.ai[v0 + 0xC0] = v4;
                ++v0;
            }

            this.aq = new int[v10];
            this.az = new int[0x8000];
            this.ag = new int[0x8000];
            this.aq(null, 0x73);
            this.au = new int[0x8000];
            this.am = new int[0x8000];
            return;
        }
        catch(RuntimeException v10_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("jx.ax(");
            v0_1.append(')');
            throw lx.al(((Throwable)v10_1), v0_1.toString());
        }
    }

    final int ay(int arg4, int arg5, int arg6) {
        int v0 = 0x100 - arg6;
        return (-398400147 & (arg5 & 0xFF00) * arg6 + (0xFF00 & arg4) * v0) + (0xFF00FF00 & v0 * (arg4 & 0xFF00FF) + (arg5 & 0xFF00FF) * arg6) >> 8;
    }

    final void az(int arg22) {
        int v6;
        int v5_1;
        jx v0 = this;
        int v1 = arg22;
        v0.ah += 0x926BE380 * v1;
        int v3 = 0x1453B9F7;
        double v5 = 12;
        if(v0.ah * v3 > v0.az.length) {
            v0.ah -= v0.az.length * 0x5D24D7C7;
            v0.aq(v0.ax[((int)(Math.random() * v5))], 9);
        }

        int v2 = v1 * 0x80;
        int v4 = 0x100;
        int v7 = 0x100 - v1;
        int v8 = v7 * 0x80;
        int v10 = 0;
        int v11 = 0;
        while(v10 < v8) {
            v3 = v0.au[v2 + v11] - v0.az[v0.az.length - 1 & v0.ah * v3 + v11] * v1 / 6;
            if(v3 < 0) {
                v3 = 0;
            }

            v0.au[v11] = v3;
            ++v10;
            ++v11;
            v3 = 0x1453B9F7;
        }

        v2 = 10;
        v3 = 0x76;
        for(v8 = v7; true; ++v8) {
            v10 = 0x80;
            if(v8 >= v4) {
                break;
            }

            v11 = v8 * 0x80;
            int v13;
            for(v13 = 0; v13 < v10; ++v13) {
                if((((int)(Math.random() * 100))) >= 50 || v13 <= v2 || v13 >= v3) {
                    v0.au[v11 + v13] = 0;
                }
                else {
                    v0.au[v13 + v11] = 0xFF;
                }
            }
        }

        v3 = 0x3D623A3F;
        if(v0.av * v3 > 0) {
            v0.av -= 904058620 * v1;
        }

        v8 = 0x563B4FAF;
        if(v0.aa * v8 > 0) {
            v0.aa -= -2060083908 * v1;
        }

        if(v0.av * v3 == 0 && v0.aa * v8 == 0) {
            v2 = ((int)(Math.random() * (((double)(2000 / v1)))));
            if(v2 == 0) {
                v0.av = 0xE2D6FC00;
            }

            if(v2 != 1) {
                goto label_125;
            }

            v0.aa = 0x359D3C00;
        }

    label_125:
        for(v2 = 0; v2 < v7; ++v2) {
            v0.aj[v2] = v0.aj[v2 + v1];
        }

        while(v7 < v4) {
            v0.aj[v7] = ((int)(Math.sin((((double)(v0.ad * 0x9E279FC1))) / 14) * 16 + Math.sin((((double)(v0.ad * 0x9E279FC1))) / 15) * 14 + Math.sin((((double)(v0.ad * 0x9E279FC1))) / 16) * v5));
            v0.ad += 0x450C7041;
            ++v7;
        }

        v0.at += 0x891BE203 * v1;
        v1 = (v1 + (client.bj * -2077001153 & 1)) / 2;
        if(v1 > 0) {
            v2 = 0x7C;
            for(v3 = 0; v3 < v0.at * 0x3996A2CC; ++v3) {
                v0.au[(((int)(Math.random() * (((double)v2))))) + 2 + ((((int)(Math.random() * (((double)0x80))))) + 0x80 << 7)] = 0xC0;
            }

            v0.at = 0;
            for(v2 = 0; v2 < v4; ++v2) {
                v5_1 = v2 * 0x80;
                v6 = -v1;
                v7 = 0;
                while(true) {
                    v8 = 0x80;
                    if(v6 >= v8) {
                        break;
                    }

                    if(v1 + v6 < v8) {
                        v7 += v0.au[v5_1 + v6 + v1];
                    }

                    v8 = v1 + 1;
                    if(v6 - v8 >= 0) {
                        v7 -= v0.au[v5_1 + v6 - v8];
                    }

                    if(v6 >= 0) {
                        v0.am[v5_1 + v6] = v7 / (v1 * 2 + 1);
                    }

                    ++v6;
                }
            }

            v2 = 0;
            v5_1 = 0x80;
            while(v2 < v5_1) {
                v6 = -v1;
                v7 = 0;
                while(v6 < v4) {
                    v8 = v6 * 0x80;
                    if(v1 + v6 < v4) {
                        v7 += v0.am[v2 + v8 + v1 * 0x80];
                    }

                    int v9 = v1 + 1;
                    if(v6 - v9 >= 0) {
                        v7 -= v0.am[v8 + v2 - v9 * 0x80];
                    }

                    if(v6 >= 0) {
                        v0.au[v8 + v2] = v7 / (v1 * 2 + 1);
                    }

                    ++v6;
                }

                ++v2;
            }
        }
    }

    final void ba(ef arg9) {
        int v1;
        for(v1 = 0; v1 < this.az.length; ++v1) {
            this.az[v1] = 0;
        }

        for(v1 = 0; v1 < 0x3694D783; ++v1) {
            this.az[((int)(Math.random() * 128 * 256))] = ((int)(Math.random() * 256));
        }

        for(v1 = 0; v1 < 20; ++v1) {
            int v2;
            for(v2 = 1; v2 < 0xFF; ++v2) {
            }

            int[] v2_1 = this.az;
            this.az = this.ag;
            this.ag = v2_1;
        }

        if(arg9 != null) {
            v1 = 0;
            for(v2 = 0; v1 < arg9.ar; v2 = v3) {
                int v3 = v2;
                v2 = 0;
                while(v2 < arg9.ae) {
                    int v5 = v3 + 1;
                    if(arg9.ax[v3] != 0) {
                        this.az[(arg9.ap + (v1 + 16) << 7) + (arg9.an + (v2 + 16))] = 0;
                    }

                    ++v2;
                    v3 = v5;
                }

                ++v1;
            }
        }
    }

    final void bd(ef arg9) {
        int v1;
        for(v1 = 0; v1 < this.az.length; ++v1) {
            this.az[v1] = 0;
        }

        for(v1 = 0; v1 < 5000; ++v1) {
            this.az[((int)(Math.random() * 128 * 256))] = ((int)(Math.random() * 256));
        }

        for(v1 = 0; v1 < 20; ++v1) {
            int[] v2 = this.az;
            this.az = this.ag;
            this.ag = v2;
        }

        if(arg9 != null) {
            v1 = 0;
            int v2_1;
            for(v2_1 = 0; v1 < arg9.ar; v2_1 = v3) {
                int v3 = v2_1;
                v2_1 = 0;
                while(v2_1 < arg9.ae) {
                    int v5 = v3 + 1;
                    if(arg9.ax[v3] != 0) {
                        this.az[(arg9.ap + (v1 + 16) << 7) + (arg9.an + (v2_1 + 16))] = 0;
                    }

                    ++v2_1;
                    v3 = v5;
                }

                ++v1;
            }
        }
    }

    final void bf(ef arg12) {
        int v5;
        int v1;
        for(v1 = 0; v1 < this.az.length; ++v1) {
            this.az[v1] = 0;
        }

        for(v1 = 0; v1 < 5000; ++v1) {
            this.az[((int)(Math.random() * 128 * 256))] = ((int)(Math.random() * 256));
        }

        for(v1 = 0; v1 < 20; ++v1) {
            int v3;
            for(v3 = 1; v3 < 0xFF; ++v3) {
                int v4;
                for(v4 = 1; v4 < 0x7F; ++v4) {
                    v5 = (v3 << 7) + v4;
                    this.ag[v5] = (this.az[v5 + 0x80] + (this.az[v5 - 1] + this.az[v5 + 1] + this.az[v5 - 0x80])) / 4;
                }
            }

            int[] v2 = this.az;
            this.az = this.ag;
            this.ag = v2;
        }

        if(arg12 != null) {
            v1 = 0;
            int v2_1;
            for(v2_1 = 0; v1 < arg12.ar; v2_1 = v3) {
                v3 = v2_1;
                v2_1 = 0;
                while(v2_1 < arg12.ae) {
                    v5 = v3 + 1;
                    if(arg12.ax[v3] != 0) {
                        this.az[(arg12.ap + (v1 + 16) << 7) + (arg12.an + (v2_1 + 16))] = 0;
                    }

                    ++v2_1;
                    v3 = v5;
                }

                ++v1;
            }
        }
    }

    final void bn(ef arg12) {
        int v5;
        int v1;
        for(v1 = 0; v1 < this.az.length; ++v1) {
            this.az[v1] = 0;
        }

        for(v1 = 0; v1 < 5000; ++v1) {
            this.az[((int)(Math.random() * 128 * 256))] = ((int)(Math.random() * 256));
        }

        for(v1 = 0; v1 < 20; ++v1) {
            int v3;
            for(v3 = 1; v3 < 0xFF; ++v3) {
                int v4;
                for(v4 = 1; v4 < 0x7F; ++v4) {
                    v5 = (v3 << 7) + v4;
                    this.ag[v5] = (this.az[v5 + 0x80] + (this.az[v5 - 1] + this.az[v5 + 1] + this.az[v5 - 0x80])) / 4;
                }
            }

            int[] v2 = this.az;
            this.az = this.ag;
            this.ag = v2;
        }

        if(arg12 != null) {
            v1 = 0;
            int v2_1;
            for(v2_1 = 0; v1 < arg12.ar; v2_1 = v3) {
                v3 = v2_1;
                v2_1 = 0;
                while(v2_1 < arg12.ae) {
                    v5 = v3 + 1;
                    if(arg12.ax[v3] != 0) {
                        this.az[(arg12.ap + (v1 + 16) << 7) + (arg12.an + (v2_1 + 16))] = 0;
                    }

                    ++v2_1;
                    v3 = v5;
                }

                ++v1;
            }
        }
    }
}

