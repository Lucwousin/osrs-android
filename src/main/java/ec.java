public class ec extends fa {
    static final int aa = 0x2000;
    public static final int am = 0x20;
    static final int oo = 0x400;

    public ec(int[] arg1, int arg2, int arg3) {
        try {
            super(arg1, arg2, arg3);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ec.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    ec(int arg2, int arg3) {
        try {
            super(arg2, arg3);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ec.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final void aa(es arg10, int arg11, int arg12, byte arg13) {
        int v4;
        try {
            arg11 += arg10.ar;
            arg12 += arg10.an;
            int v0 = -107049639;
            int v13 = this.al * v0 * arg12 + arg11;
            int v1 = arg10.ae;
            int v2 = arg10.al;
            int v3 = this.al * v0 - v2;
            int v5 = 2002832733;
            int v6 = 0;
            if(arg12 < this.ar * v5) {
                v4 = this.ar * v5 - arg12;
                v1 -= v4;
                arg12 = this.ar * v5;
                v5 = v2 * v4;
                v13 += v4 * (this.al * v0);
            }
            else {
                v5 = 0;
            }

            arg12 += v1;
            v4 = 0xD21DC9D7;
            if(arg12 > this.an * v4) {
                v1 -= arg12 - this.an * v4;
            }

            arg12 = v1;
            v1 = 0xE4D30573;
            if(arg11 < this.ap * v1) {
                v0 = this.ap * v1 - arg11;
                v2 -= v0;
                arg11 = this.ap * v1;
                v5 += v0;
                v13 += v0;
                v6 = v0;
                v3 += v0;
            }

            arg11 += v2;
            v1 = 0x56AC17CD;
            if(arg11 > this.aj * v1) {
                arg11 -= this.aj * v1;
                v2 -= arg11;
                v6 += arg11;
                v3 += arg11;
            }

            v4 = v2;
            int v7 = v6;
            v6 = v3;
            if(v4 > 0) {
                if(arg12 <= 0) {
                }
                else {
                    ff.au(this.ax, arg10.ax, v5, v13, v4, arg12, v6, v7, 0x9B019FFF);
                    return;
                }
            }
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("ec.aa(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    static final void ab(byte[] arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, bg arg28, gy[] arg29, int arg30) {
        int v0 = arg25;
        int v1 = arg26;
        try {
            lq v2 = new lq(arg20);
            int v3 = -1;
            while(true) {
                int v4 = v2.bt(0x7F030049);
                if(v4 == 0) {
                    return;
                }

                v3 += v4;
                v4 = 0;
                while(true) {
                    int v5 = v2.by(6969);
                    if(v5 == 0) {
                        break;
                    }

                    v4 += v5 - 1;
                    v5 = v4 & 0x3F;
                    int v6 = v4 >> 6 & 0x3F;
                    int v8 = v2.ay(-104);
                    int v10 = v8 >> 2;
                    v8 &= 3;
                    if(arg24 != v4 >> 12) {
                        continue;
                    }

                    if(v6 < v0) {
                        continue;
                    }

                    if(v6 >= v0 + 8) {
                        continue;
                    }

                    if(v5 < v1) {
                        continue;
                    }

                    if(v5 >= v1 + 8) {
                        continue;
                    }

                    do v7 = ok.al(v3, -960671096);
                    v6 &= 7;
                    v5 &= 7;
                    int v11 = v6;
                    v6 = arg22 + fl.ae(v6, v5, arg27, v7.az * 0xB46CA623, v7.ag * 0x4B9D7897, v8, 0x63C45D27);
                    int v7_1 = arg23 + cg.ar(v11, v5, arg27, v7.az * 0xB46CA623, v7.ag * 0x4B9D7897, v8, 0x968CB1A0);
                    if(v6 <= 0) {
                        continue;
                    }

                    if(v7_1 <= 0) {
                        continue;
                    }

                    v5 = 103;
                    if(v6 >= v5) {
                        continue;
                    }

                    if(v7_1 >= v5) {
                        continue;
                    }

                    v5 = 2 == (id.al[1][v6][v7_1] & 2) ? arg21 - 1 : arg21;
                    gy v11_1 = null;
                    gy v12 = v5 >= 0 ? arg29[v5] : v11_1;
                    fv.af(arg21, v6, v7_1, v3, v8 + arg27 & 3, v10, arg28, v12, -73590595);
                }
            }

            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("ec.ab(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }

    final void ab(int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        arg11 = 0xE4D30573;
        try {
            if(arg6 >= this.ap * arg11) {
                if(arg6 >= this.aj * 0x56AC17CD) {
                }
                else {
                    int v0 = 2002832733;
                    if(arg7 < this.ar * v0) {
                        arg8 -= this.ar * v0 - arg7;
                        arg7 = this.ar * v0;
                    }

                    int v1 = 0xD21DC9D7;
                    if(arg7 + arg8 > this.an * v1) {
                        arg8 = this.an * v1 - arg7;
                    }

                    arg11 = 0x100 - arg10;
                    v0 = (arg9 >> 16 & 0xFF) * arg10;
                    v1 = (arg9 >> 8 & 0xFF) * arg10;
                    arg10 *= arg9 & 0xFF;
                    int v2 = -107049639;
                    arg6 += arg7 * (this.al * v2);
                    for(arg7 = 0; arg7 < arg8; ++arg7) {
                        this.ax[arg6] = ((this.ax[arg6] >> 8 & 0xFF) * arg11 + v1 >> 8 << 8) + ((this.ax[arg6] >> 16 & 0xFF) * arg11 + v0 >> 8 << 16) + ((this.ax[arg6] & 0xFF) * arg11 + arg10 >> 8);
                        arg6 += this.al * v2;
                    }
                }
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("ec.ab(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    final void ad(int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        arg10 = 2002832733;
        try {
            if(arg6 >= this.ar * arg10) {
                if(arg6 >= this.an * 0xD21DC9D7) {
                }
                else {
                    int v0 = 0xE4D30573;
                    if(arg5 < this.ap * v0) {
                        arg7 -= this.ap * v0 - arg5;
                        arg5 = this.ap * v0;
                    }

                    int v1 = 0x56AC17CD;
                    if(arg7 + arg5 > this.aj * v1) {
                        arg7 = this.aj * v1 - arg5;
                    }

                    arg10 = 0x100 - arg9;
                    v0 = (arg8 >> 16 & 0xFF) * arg9;
                    v1 = (arg8 >> 8 & 0xFF) * arg9;
                    arg8 = (arg8 & 0xFF) * arg9;
                    arg5 += this.al * -107049639 * arg6;
                    arg6 = 0;
                    while(arg6 < arg7) {
                        this.ax[arg5] = ((this.ax[arg5] >> 8 & 0xFF) * arg10 + v1 >> 8 << 8) + ((this.ax[arg5] >> 16 & 0xFF) * arg10 + v0 >> 8 << 16) + ((this.ax[arg5] & 0xFF) * arg10 + arg8 >> 8);
                        ++arg6;
                        ++arg5;
                    }
                }
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("ec.ad(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    public final void ae(int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        try {
            int v0 = 0xE4D30573;
            if(arg7 < this.ap * v0) {
                arg9 -= this.ap * v0 - arg7;
                arg7 = this.ap * v0;
            }

            v0 = 2002832733;
            if(arg8 < this.ar * v0) {
                arg10 -= this.ar * v0 - arg8;
                arg8 = this.ar * v0;
            }

            int v1 = 0x56AC17CD;
            if(arg9 + arg7 > this.aj * v1) {
                arg9 = this.aj * v1 - arg7;
            }

            v1 = 0xD21DC9D7;
            if(arg10 + arg8 > this.an * v1) {
                arg10 = this.an * v1 - arg8;
            }

            arg13 = 0xFF00;
            v1 = 0xFF00FF;
            v0 = ((arg11 & arg13) * arg12 >> 8 & arg13) + ((arg11 & v1) * arg12 >> 8 & v1);
            arg11 = 0x100 - arg12;
            arg12 = this.al * -107049639 - arg9;
            arg7 += arg8 * (this.al * -107049639);
            arg8 = 0;
            while(true) {
            label_57:
                if(arg8 >= arg10) {
                    return;
                }

                int v2 = -arg9;
                while(v2 < 0) {
                    this.ax[arg7] = ((this.ax[arg7] & arg13) * arg11 >> 8 & arg13) + ((this.ax[arg7] & v1) * arg11 >> 8 & v1) + v0;
                    ++v2;
                    ++arg7;
                }
            }
        }
        catch(RuntimeException v7) {
            goto label_84;
        }

        arg7 += arg12;
        ++arg8;
        goto label_57;
        return;
    label_84:
        StringBuilder v8 = new StringBuilder();
        v8.append("ec.ae(");
        v8.append(')');
        throw lx.al(((Throwable)v7), v8.toString());
    }

    public final void af(int arg17, int arg18, int arg19, int arg20, int arg21, int arg22) {
        int v0_1;
        int v3;
        ec v7 = this;
        int v1 = arg19 - arg17;
        int v2 = arg20 - arg18;
        if(v2 != 0) {
            goto label_24;
        }

        if(v1 >= 0) {
            int v4 = v1 + 1;
            int v6 = 0x7FFA1E27;
            ec v1_1 = this;
            v2 = arg17;
            v3 = arg18;
            int v5 = arg21;
            try {
                v1_1.aj(v2, v3, v4, v5, v6);
                return;
            label_15:
                this.aj(v1 + arg17, arg18, -v1 + 1, arg21, -474690049);
                return;
            label_24:
                if(v1 == 0) {
                    if(v2 >= 0) {
                        this.aq(arg17, arg18, v2 + 1, arg21, 0x1795F574);
                    }
                    else {
                        this.aq(arg17, arg18 + v2, -v2 + 1, arg21, 0x1795F574);
                    }

                    return;
                }

                if(v1 + v2 < 0) {
                    v0_1 = arg17 + v1;
                    v1 = -v1;
                    v3 = arg18 + v2;
                    v2 = -v2;
                }
                else {
                    v0_1 = arg17;
                    v3 = arg18;
                }

                double v8 = 0.5;
                v6 = 0x8000;
                int v10 = 0x56AC17CD;
                int v11 = 0xD21DC9D7;
                int v12 = 2002832733;
                int v13 = 0xE4D30573;
                if(v1 > v2) {
                    v3 = (v3 << 16) + v6;
                    v2 = ((int)Math.floor((((double)(v2 << 16))) / (((double)v1)) + v8));
                    v1 += v0_1;
                    if(v0_1 < v7.ap * v13) {
                        v3 += (v7.ap * v13 - v0_1) * v2;
                        v0_1 = v7.ap * v13;
                    }

                    if(v1 >= v7.aj * v10) {
                        v1 = v7.aj * v10 - 1;
                    }

                    while(true) {
                        if(v0_1 > v1) {
                            return;
                        }

                        v4 = v3 >> 16;
                        if(v4 >= v7.ar * v12 && v4 < v7.an * v11) {
                            v7.ax[v4 * (v7.al * -107049639) + v0_1] = arg21;
                        }

                        v3 += v2;
                        ++v0_1;
                    }
                }
                else {
                    v0_1 = (v0_1 << 16) + v6;
                    v1 = ((int)Math.floor((((double)(v1 << 16))) / (((double)v2)) + v8));
                    v2 += v3;
                    if(v3 < v7.ar * v12) {
                        v0_1 += (v7.ar * v12 - v3) * v1;
                        v3 = v7.ar * v12;
                    }

                    if(v2 >= v7.an * v11) {
                        v2 = v7.an * v11 - 1;
                    }

                    while(true) {
                    label_129:
                        if(v3 > v2) {
                            return;
                        }

                        v4 = v0_1 >> 16;
                        if(v4 >= v7.ap * 0xE4D30573 && v4 < v7.aj * v10) {
                            v7.ax[v4 + v7.al * -107049639 * v3] = arg21;
                        }

                        goto label_147;
                    }
                }

                return;
            }
            catch(RuntimeException v0) {
                goto label_151;
            }
        }
        else {
            goto label_15;
        }

        return;
    label_147:
        v0_1 += v1;
        ++v3;
        goto label_129;
    label_151:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ec.af(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0), v1_2.toString());
    }

    public void ag(ef arg11, int arg12, int arg13, byte arg14) {
        int v4;
        try {
            arg12 += arg11.an;
            arg13 += arg11.ap;
            int v0 = -107049639;
            int v14 = this.al * v0 * arg13 + arg12;
            int v1 = arg11.ar;
            int v2 = arg11.ae;
            int v3 = this.al * v0 - v2;
            int v5 = 2002832733;
            int v6 = 0;
            if(arg13 < this.ar * v5) {
                v4 = this.ar * v5 - arg13;
                v1 -= v4;
                arg13 = this.ar * v5;
                v5 = v4 * v2;
                v14 += this.al * v0 * v4;
            }
            else {
                v5 = 0;
            }

            arg13 += v1;
            v4 = 0xD21DC9D7;
            if(arg13 > this.an * v4) {
                v1 -= arg13 - this.an * v4;
            }

            arg13 = v1;
            v1 = 0xE4D30573;
            if(arg12 < this.ap * v1) {
                v0 = this.ap * v1 - arg12;
                v2 -= v0;
                arg12 = this.ap * v1;
                v5 += v0;
                v14 += v0;
                v6 = v0;
                v3 += v0;
            }

            v4 = v14;
            arg12 += v2;
            v0 = 0x56AC17CD;
            if(arg12 > this.aj * v0) {
                arg12 -= this.aj * v0;
                v2 -= arg12;
                v6 += arg12;
                v3 += arg12;
            }

            arg12 = v2;
            int v7 = v3;
            int v8 = v6;
            if(arg12 > 0) {
                if(arg13 <= 0) {
                }
                else {
                    ey.ah(this.ax, arg11.ax, arg11.al, v5, v4, arg12, arg13, v7, v8, 0xB559797C);
                    return;
                }
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("ec.ag(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    public void ai(int arg18, int arg19, int arg20, int arg21, byte arg22) {
        int v12;
        int v15;
        int v14;
        int v13;
        int v10;
        int v9;
        int v8;
        int v5;
        ec v1 = this;
        int v0 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        int v4 = arg21;
        if(v3 != 0) {
            goto label_11;
        }

        v3 = 0xB1165B1B;
        try {
            v1.fe(v0, v2, v4, v3);
            return;
        label_11:
            if(v3 < 0) {
                v3 = -v3;
            }

            v5 = v2 - v3;
            int v7 = 2002832733;
            if(v5 < v1.ar * v7) {
                v5 = v1.ar * v7;
            }

            int v6 = v3 + v2 + 1;
            v8 = 0xD21DC9D7;
            if(v6 > v1.an * v8) {
                v6 = v1.an * v8;
            }

            v7 = v3 * v3;
            v8 = 0;
            v9 = v2 - v5;
            v10 = v9 * v9;
            int v11 = v10 - v9;
            if(v2 > v6) {
                v2 = v6;
            }

            while(true) {
                v13 = 0x56AC17CD;
                v14 = 0xE4D30573;
                if(v5 >= v2) {
                    break;
                }

                while(true) {
                    if(v11 > v7) {
                        if(v10 <= v7) {
                        }
                        else {
                            v15 = v0 - v8 + 1;
                            if(v15 < v1.ap * v14) {
                                v15 = v1.ap * v14;
                            }

                            v12 = v0 + v8;
                            if(v12 > v1.aj * v13) {
                                v12 = v1.aj * v13;
                            }

                            v13 = v1.al * -107049639 * v5 + v15;
                            break;
                        }
                    }

                    v10 += v8 + v8;
                    v12 = v8 + 1;
                    v11 += v8 + v12;
                    v8 = v12;
                }

                while(v15 < v12) {
                    v1.ax[v13] = v4;
                    ++v15;
                    ++v13;
                }

                ++v5;
                v12 = v9 - 1;
                v10 -= v9 + v12;
                v11 -= v12 + v12;
                v9 = v12;
            }

            v2 = v5 - v2;
            v8 = v2 * v2 + v7;
            v9 = v8 - v3;
            v8 -= v2;
            while(true) {
            label_86:
                if(v5 >= v6) {
                    return;
                }

                while(v8 > v7) {
                    if(v9 <= v7) {
                        break;
                    }

                    v10 = v3 - 1;
                    v8 -= v3 + v10;
                    v9 -= v10 + v10;
                    v3 = v10;
                }

                v10 = v0 - v3;
                if(v10 < v1.ap * v14) {
                    v10 = v1.ap * v14;
                }

                v11 = v3 + v0;
                if(v11 > v1.aj * v13 - 1) {
                    v11 = v1.aj * v13 - 1;
                }

                for(v12 = v1.al * -107049639 * v5 + v10; v10 <= v11; ++v12) {
                    v1.ax[v12] = v4;
                    ++v10;
                }
            }
        }
        catch(RuntimeException v0_1) {
            goto label_133;
        }

        ++v5;
        v8 += v2 + v2;
        v10 = v2 + 1;
        v9 += v2 + v10;
        v2 = v10;
        v13 = 0x56AC17CD;
        goto label_86;
        return;
    label_133:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("ec.ai(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public final void aj(int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            if(arg4 >= this.ar * 2002832733) {
                if(arg4 >= this.an * 0xD21DC9D7) {
                }
                else {
                    int v0 = 0xE4D30573;
                    if(arg3 < this.ap * v0) {
                        arg5 -= this.ap * v0 - arg3;
                        arg3 = this.ap * v0;
                    }

                    int v1 = 0x56AC17CD;
                    if(arg3 + arg5 > this.aj * v1) {
                        arg5 = this.aj * v1 - arg3;
                    }

                    arg4 = arg4 * (this.al * -107049639) + arg3;
                    for(arg3 = 0; true; ++arg3) {
                        if(arg3 >= arg5) {
                            return;
                        }

                        this.ax[arg3 + arg4] = arg6;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v3) {
            goto label_43;
        }

        return;
    label_43:
        StringBuilder v4 = new StringBuilder();
        v4.append("ec.aj(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    static void al(iw arg20, int arg21, int arg22) {
        StringBuilder v2_5;
        String[] v13_2;
        String v6_3;
        int[] v13_1;
        jh v6_2;
        String[] v8_1;
        int[] v7_2;
        int[] v14_1;
        int[] v3_2;
        hl v4_2;
        ji v2_3;
        ji[] v2_2;
        String[] v10_1;
        int v14;
        int v18;
        int[] v17_1;
        int[] v16_1;
        int v2_1;
        int v1_1;
        String v5_2;
        int v17;
        int v10;
        int v16;
        int v15;
        int v12;
        int v13;
        int v9;
        int[] v8;
        int[] v4_1;
        hl v3_1;
        byte v7;
        int v6;
        int v4;
        Object[] v2;
        iw v1 = arg20;
        try {
            v2 = v1.ax;
            v4 = 0x797F8B03;
            byte v5 = 16;
            v6 = 0x309206DD;
            v7 = 0;
            if(le.ax(v1.ai * v4, 0x43106A96)) {
                jc.az = v2[0];
                da v3 = ae.al(jc.az.ax * 1401097027, v5);
                v3_1 = dx.al(v1.ai * v4, v3.an * 0x11F2C855, v3.ao * 0x64537821, 5683);
            }
            else {
                v3_1 = hw.ax(v2[0].intValue(), v6);
            }

            if(v3_1 == null) {
                return;
            }

            il.ad = 0;
            ft.ab = 0;
            v4_1 = v3_1.al;
            v8 = v3_1.ae;
            il.af = 0;
            il.ag = false;
            v9 = 0x64173D4B;
        }
        catch(RuntimeException v0) {
            goto label_853;
        }

        try {
            v13 = -2004341001;
            am.ae = new int[v3_1.an * v13];
            om.ar = new String[v3_1.ap * -669468027];
            v12 = 1;
            v15 = 0;
            v16 = 0;
            while(v12 < v2.length) {
                if((v2[v12] instanceof Integer)) {
                    v10 = v2[v12].intValue();
                    if(v10 == 0x80000001) {
                        v10 = 0x102B070B * v1.ar;
                    }

                    if(0x80000002 == v10) {
                        v10 = 0x81CBAD69 * v1.an;
                    }

                    v17 = 971580097;
                    if(0x80000003 == v10) {
                        v10 = v1.ae != null ? v1.ae.ah * v17 : -1;
                    }

                    if(v10 == 0x80000004) {
                        v10 = 0x70B27DF1 * v1.ap;
                    }

                    if(v10 == 0x80000005) {
                        v10 = v1.ae != null ? 990760021 * v1.ae.at : -1;
                    }

                    if(v10 == 0x80000006) {
                        v10 = v1.aj != null ? v1.aj.ah * v17 : -1;
                    }

                    if(v10 == 0x80000007) {
                        v10 = v1.aj != null ? v1.aj.at * 990760021 : -1;
                    }

                    if(v10 == 0x80000008) {
                        v10 = -1080048279 * v1.ad;
                    }

                    if(0x80000009 == v10) {
                        v10 = -2082285639 * v1.aq;
                    }

                    am.ae[v16] = v10;
                    ++v16;
                }
                else {
                    if(!(v2[v12] instanceof String)) {
                        goto label_143;
                    }

                    Object v5_1 = v2[v12];
                    if(((String)v5_1).equals("event_opbase")) {
                        v5_2 = v1.ab;
                    }

                    om.ar[v15] = v5_2;
                    ++v15;
                }

            label_143:
                ++v12;
            }

            il.at = v1.af * 0xBA94249F;
            v1_1 = 0;
            v2_1 = -1;
            v10 = -1;
        }
        catch(Exception v0_1) {
            goto label_800;
        }
        catch(Throwable v0_2) {
            goto label_797;
        }

        while(true) {
        label_153:
            ++v1_1;
            if(v1_1 > arg21) {
                goto label_789;
            }

            ++v2_1;
            try {
                v12 = v4_1[v2_1];
                v10 = 100;
                if(v12 < v10) {
                }
                else {
                    goto label_757;
                }
            }
            catch(Exception v0_1) {
                goto label_793;
            }
            catch(Throwable v0_2) {
                goto label_797;
            }

            v10 = 0x4A90AB9;
            v15 = 1304812425;
            if(v12 == 0) {
                try {
                    v16_1 = il.aj;
                    v17 = il.ad + v10;
                    il.ad = v17;
                    v16_1[v17 * v15 - 1] = v8[v2_1];
                    goto label_171;
                label_173:
                    if(1 == v12) {
                        v16 = v8[v2_1];
                        v17_1 = il.aj;
                        v18 = il.ad + v10;
                        il.ad = v18;
                        v17_1[v18 * v15 - 1] = an.ae[v16];
                    }
                    else if(v12 == 2) {
                        v14 = v8[v2_1];
                        v16_1 = an.ae;
                        v17_1 = il.aj;
                        v18 = il.ad - v10;
                        il.ad = v18;
                        v16_1[v14] = v17_1[v18 * v15];
                        ci.gf(v14, v7);
                    }
                    else {
                        v16 = 0xBC5CDEAD;
                        v17 = 0x8FA23525;
                        if(3 == v12) {
                            v10_1 = il.aq;
                            v14 = ft.ab + v17;
                            ft.ab = v14;
                            v10_1[v14 * v16 - 1] = v3_1.ar[v2_1];
                        }
                        else {
                            if(v12 == 6) {
                                v2_1 += v8[v2_1];
                            }
                            else {
                                v18 = 0x9521572;
                                if(7 == v12) {
                                    il.ad -= v18;
                                    if(il.aj[il.ad * v15 + 1] != il.aj[il.ad * v15]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_171;
                                    }
                                }
                                else if(8 == v12) {
                                    il.ad -= v18;
                                    if(il.aj[il.ad * v15] == il.aj[il.ad * v15 + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_171;
                                    }
                                }
                                else if(9 == v12) {
                                    il.ad -= v18;
                                    if(il.aj[il.ad * v15] < il.aj[il.ad * v15 + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_171;
                                    }
                                }
                                else if(10 == v12) {
                                    il.ad -= v18;
                                    if(il.aj[il.ad * v15] > il.aj[il.ad * v15 + 1]) {
                                        v2_1 += v8[v2_1];
                                    }
                                    else {
                                        goto label_171;
                                    }
                                }
                                else if(21 != v12) {
                                    goto label_332;
                                }
                                else if(il.af * v9 == 0) {
                                    goto label_296;
                                }
                                else {
                                    goto label_304;
                                }
                            }

                            goto label_216;
                        }
                    }

                    goto label_171;
                }
                catch(Exception v0_1) {
                    goto label_787;
                }
                catch(Throwable v0_2) {
                    goto label_797;
                }
            }
            else {
                goto label_173;
                try {
                label_296:
                    if(il.ag) {
                        il.ah = true;
                        ew.hi(0x24DEA643);
                        il.ah = ((boolean)v7);
                        il.ag = ((boolean)v7);
                    }
                }
                catch(RuntimeException v0) {
                    goto label_853;
                }

                return;
                try {
                label_304:
                    v2_2 = il.ai;
                    v4 = il.af - 0x53F66463;
                    il.af = v4;
                    v2_3 = v2_2[v4 * v9];
                    v4_2 = v2_3.ax;
                }
                catch(Exception v0_1) {
                    goto label_787;
                }
                catch(Throwable v0_2) {
                    goto label_797;
                }

                try {
                    v3_2 = v4_2.al;
                    v8 = v4_2.ae;
                    v10 = 0xB2D190CD * v2_3.al;
                    am.ae = v2_3.ae;
                    om.ar = v2_3.ar;
                    v2_1 = v10;
                    v10 = v12;
                    hl v19 = v4_2;
                    v4_1 = v3_2;
                    v3_1 = v19;
                    continue;
                }
                catch(Exception v0_1) {
                    goto label_329;
                }
                catch(Throwable v0_2) {
                    goto label_797;
                }

            label_332:
                if(25 != v12) {
                    goto label_345;
                }

                try {
                    v14 = v8[v2_1];
                    v16_1 = il.aj;
                    v17 = il.ad + v10;
                    il.ad = v17;
                    v16_1[v17 * v15 - 1] = of.ax(v14, 600612219);
                    goto label_171;
                label_345:
                    if(v12 == 27) {
                        v14 = v8[v2_1];
                        v16_1 = il.aj;
                        v17 = il.ad - v10;
                        il.ad = v17;
                        dj.al(v14, v16_1[v17 * v15], 0xA5CD4F7C);
                        goto label_171;
                    }

                    if(0x1F == v12) {
                        il.ad -= v18;
                        if(il.aj[il.ad * v15] > il.aj[il.ad * v15 + 1]) {
                            goto label_171;
                        }

                        v2_1 += v8[v2_1];
                        goto label_216;
                    }

                    if(0x20 == v12) {
                        il.ad -= v18;
                        if(il.aj[il.ad * v15] < il.aj[il.ad * v15 + 1]) {
                            goto label_171;
                        }

                        v2_1 += v8[v2_1];
                    label_216:
                        v10 = v12;
                        continue;
                    }

                    if(v12 == 33) {
                        v14_1 = il.aj;
                        v16 = il.ad + v10;
                        il.ad = v16;
                        v14_1[v16 * v15 - 1] = am.ae[v8[v2_1]];
                        goto label_171;
                    }

                    if(34 == v12) {
                        v14_1 = am.ae;
                        v16 = v8[v2_1];
                        v17_1 = il.aj;
                        v18 = il.ad - v10;
                        il.ad = v18;
                        v14_1[v16] = v17_1[v18 * v15];
                        goto label_171;
                    }

                    if(v12 == 35) {
                        v10_1 = il.aq;
                        v14 = ft.ab + v17;
                        ft.ab = v14;
                        v10_1[v14 * v16 - 1] = om.ar[v8[v2_1]];
                        goto label_171;
                    }

                    if(36 == v12) {
                        v10_1 = om.ar;
                        v14 = v8[v2_1];
                        String[] v15_1 = il.aq;
                        v18 = ft.ab - v17;
                        ft.ab = v18;
                        v10_1[v14] = v15_1[v18 * v16];
                        goto label_171;
                    }

                    if(37 == v12) {
                        v10 = v8[v2_1];
                        ft.ab -= v10 * v17;
                        String v7_1 = kx.ax(il.aq, ft.ab * v16, v10, 0x7F030027);
                        v10_1 = il.aq;
                        v14 = ft.ab + v17;
                        ft.ab = v14;
                        v10_1[v14 * v16 - 1] = v7_1;
                        goto label_171;
                    }

                    if(38 == v12) {
                        il.ad -= v10;
                        goto label_171;
                    }

                    if(v12 == 39) {
                        ft.ab -= v17;
                        goto label_171;
                    }

                    if(v12 != 40) {
                        break;
                    }

                    v4_2 = hw.ax(v8[v2_1], v6);
                    v7_2 = new int[v4_2.an * v13];
                    v8_1 = new String[v4_2.ap * -669468027];
                    v10 = 0;
                    goto label_487;
                }
                catch(Exception v0_1) {
                    goto label_787;
                }
                catch(Throwable v0_2) {
                    goto label_797;
                }
            }

            goto label_171;
        }

        if(42 != v12) {
            goto label_581;
        }

        try {
            int[] v6_1 = il.aj;
            int v7_3 = il.ad + v10;
            il.ad = v7_3;
            v6_1[v7_3 * v15 - 1] = gg.ml.al(v8[v2_1], 0xC9538B1F);
            goto label_171;
        label_581:
            if(v12 == 43) {
                v6_2 = gg.ml;
                v7_3 = v8[v2_1];
                v13_1 = il.aj;
                v14 = il.ad - v10;
                il.ad = v14;
                v6_2.ax(v7_3, v13_1[v14 * v15], 0x8B8F9E9F);
            label_171:
                goto label_780;
            }

            if(v12 == 44) {
                v6 = v8[v2_1] >> 16;
                v13 = v8[v2_1] & 0xFFFF;
                v14_1 = il.aj;
                v16 = il.ad - v10;
                il.ad = v16;
                v10 = v14_1[v16 * v15];
                if(v10 >= 0 && v10 <= 5000) {
                    il.an[v6] = v10;
                    v13 = 105 == v13 ? 0 : -1;
                    v14 = 0;
                    goto label_619;
                }

                throw new RuntimeException();
            }

            if(45 == v12) {
                v6 = v8[v2_1];
                v13_1 = il.aj;
                v14 = il.ad - v10;
                il.ad = v14;
                v13 = v13_1[v14 * v15];
                if(v13 >= 0 && v13 < il.an[v6]) {
                    v14_1 = il.aj;
                    v16 = il.ad + v10;
                    il.ad = v16;
                    v14_1[v16 * v15 - 1] = il.ap[v6][v13];
                    goto label_780;
                }

                throw new RuntimeException();
            }

            if(46 == v12) {
                v6 = v8[v2_1];
                il.ad -= v18;
                v10 = il.aj[il.ad * v15];
                if(v10 >= 0 && v10 < il.an[v6]) {
                    il.ap[v6][v10] = il.aj[il.ad * v15 + 1];
                    goto label_780;
                }

                throw new RuntimeException();
            }

            if(0x2F == v12) {
                v6_3 = gg.ml.ap(v8[v2_1], 1);
                if(v6_3 == null) {
                    v6_3 = gs.aq;
                }

                v10_1 = il.aq;
                v13 = ft.ab + v17;
                ft.ab = v13;
                v10_1[v13 * v16 - 1] = v6_3;
                goto label_780;
            }

            if(0x30 == v12) {
                v6_2 = gg.ml;
                v10 = v8[v2_1];
                v13_2 = il.aq;
                v14 = ft.ab - v17;
                ft.ab = v14;
                v6_2.an(v10, v13_2[v14 * v16], 54);
                goto label_780;
            }

            if(v12 == 49) {
                v6_3 = gg.ml.ar(v8[v2_1], 0x897DEF75);
                v10_1 = il.aq;
                v13 = ft.ab + v17;
                ft.ab = v13;
                v10_1[v13 * v16 - 1] = v6_3;
                goto label_780;
            }

            if(v12 == 50) {
                v6_2 = gg.ml;
                v10 = v8[v2_1];
                v13_2 = il.aq;
                v14 = ft.ab - v17;
                ft.ab = v14;
                v6_2.ae(v10, v13_2[v14 * v16], 0xCBF20081);
                goto label_780;
            }

            if(v12 == 60) {
                oc v6_4 = v3_1.aq[v8[v2_1]];
                v13_1 = il.aj;
                v14 = il.ad - v10;
                il.ad = v14;
                mx v6_5 = v6_4.ax(((long)v13_1[v14 * v15]));
                if(v6_5 == null) {
                    goto label_780;
                }

                v2_1 += ((mo)v6_5).ax;
                goto label_780;
            }

            throw new IllegalStateException();
        label_757:
            boolean v6_6 = v3_1.ae[v2_1] == 1 ? true : false;
            switch(hu.ae(v12, v3_1, v6_6, 0x8A24E57E)) {
                case 0: {
                    goto label_771;
                }
                case 1: {
                    goto label_780;
                }
                case 2: {
                    goto label_768;
                }
            }

            goto label_780;
        }
        catch(Exception v0_1) {
            goto label_787;
        }
        catch(Throwable v0_2) {
            goto label_797;
        }

        try {
        label_771:
            if(il.ag) {
                il.ah = true;
                ew.hi(1954448007);
                il.ah = false;
                il.ag = false;
            }
        }
        catch(RuntimeException v0) {
            goto label_853;
        }

        return;
        try {
        label_768:
            throw new IllegalStateException();
        }
        catch(Exception v0_1) {
            goto label_787;
        }
        catch(Throwable v0_2) {
            goto label_797;
        }

        try {
        label_789:
            throw new RuntimeException();
        }
        catch(Throwable v0_2) {
        }
        catch(Exception v0_1) {
        label_793:
            Exception v1_2 = v0_1;
            v12 = v10;
            goto label_802;
            try {
            label_619:
                while(v14 < v10) {
                    il.ap[v6][v14] = v13;
                    ++v14;
                }
            }
            catch(Exception v0_1) {
                goto label_787;
            }
            catch(Throwable v0_2) {
                goto label_797;
            }

        label_780:
            v10 = v12;
            v6 = 0x309206DD;
            v7 = 0;
            v13 = -2004341001;
            goto label_153;
            try {
            label_487:
                while(v10 < v4_2.aj * -1587620589) {
                    v7_2[v10] = il.aj[v10 + (il.ad * v15 - v4_2.aj * -1587620589)];
                    ++v10;
                }

                for(v6 = 0; v6 < v4_2.ad * 0x450E27DF; ++v6) {
                    v8_1[v6] = il.aq[ft.ab * v16 - v4_2.ad * 0x450E27DF + v6];
                }

                il.ad -= v4_2.aj * 0x4765B8BB;
                ft.ab -= v4_2.ad * 0xB56AEE3B;
                ji v6_7 = new ji();
                v6_7.ax = v3_1;
                v6_7.al = v2_1 * 0x2F58DC05;
                v6_7.ae = am.ae;
                v6_7.ar = om.ar;
                v2_2 = il.ai;
                v10 = il.af + 0x53F66463;
                il.af = v10;
                v2_2[v10 * v9 - 1] = v6_7;
            }
            catch(Exception v0_1) {
                goto label_787;
            }
            catch(Throwable v0_2) {
                goto label_797;
            }

            try {
                int[] v2_4 = v4_2.al;
                v3_2 = v4_2.ae;
                am.ae = v7_2;
                om.ar = v8_1;
                v8 = v3_2;
                v3_1 = v4_2;
                v10 = v12;
                v6 = 0x309206DD;
                v7 = 0;
                v13 = -2004341001;
                v4_1 = v2_4;
                v2_1 = -1;
                goto label_153;
            }
            catch(Throwable v0_2) {
            label_797:
                Throwable v1_3 = v0_2;
                try {
                    if(il.ag) {
                        il.ah = true;
                        ew.hi(-1511880420);
                        il.ah = false;
                        il.ag = false;
                    }

                    throw v1_3;
                }
                catch(RuntimeException v0) {
                label_853:
                    v2_5 = new StringBuilder();
                    v2_5.append("ec.al(");
                    v2_5.append(')');
                    throw lx.al(v0, v2_5.toString());
                }
            }
            catch(Exception v0_1) {
            label_329:
                v1_2 = v0_1;
                v3_2 = v4_1;
                goto label_802;
            label_787:
                v1_2 = v0_1;
                goto label_802;
            label_800:
                v1_2 = v0_1;
                v12 = -1;
                try {
                label_802:
                    v2_5 = new StringBuilder(30);
                    v2_5.append("");
                    v2_5.append(((hl)v3_2).gx);
                    v2_5.append(" ");
                    int v3_3;
                    for(v3_3 = il.af * v9 - 1; v3_3 >= 0; --v3_3) {
                        v2_5.append("");
                        v2_5.append(il.ai[v3_3].ax.gx);
                        v2_5.append(" ");
                    }

                    v2_5.append("");
                    v2_5.append(v12);
                    po.ax(v2_5.toString(), ((Throwable)v1_2), 1735984020);
                }
                catch(Throwable v0_2) {
                    goto label_797;
                }

                try {
                    if(il.ag) {
                        il.ah = true;
                        ew.hi(0x4EBB0599);
                        il.ah = false;
                        il.ag = false;
                    }

                    return;
                }
                catch(RuntimeException v0) {
                    goto label_853;
                }
            }
        }
    }

    public void al(byte arg5) {
        try {
            int v5_1 = this.ae * 129208929 * (this.al * -107049639) - 7;
            int v1;
            for(v1 = 0; v1 < v5_1; v1 = v3 + 1) {
                int v3 = v1 + 1;
                this.ax[v1] = 0;
                int v2 = v3 + 1;
                this.ax[v3] = 0;
                v3 = v2 + 1;
                this.ax[v2] = 0;
                v2 = v3 + 1;
                this.ax[v3] = 0;
                v3 = v2 + 1;
                this.ax[v2] = 0;
                v2 = v3 + 1;
                this.ax[v3] = 0;
                v3 = v2 + 1;
                this.ax[v2] = 0;
                this.ax[v3] = 0;
            }

            v5_1 += 7;
            while(v1 < v5_1) {
                this.ax[v1] = 0;
                ++v1;
            }
        }
        catch(RuntimeException v5) {
            goto label_47;
        }

        return;
    label_47:
        StringBuilder v0 = new StringBuilder();
        v0.append("ec.al(");
        v0.append(')');
        throw lx.al(((Throwable)v5), v0.toString());
    }

    public final void am(es arg11, int arg12, int arg13, int arg14) {
        int v4;
        try {
            arg12 += arg11.ar;
            arg13 += arg11.an;
            int v0 = -107049639;
            arg14 = this.al * v0 * arg13 + arg12;
            int v1 = arg11.ae;
            int v2 = arg11.al;
            int v3 = this.al * v0 - v2;
            int v5 = 2002832733;
            int v6 = 0;
            if(arg13 < this.ar * v5) {
                v4 = this.ar * v5 - arg13;
                v1 -= v4;
                arg13 = this.ar * v5;
                v5 = v2 * v4;
                arg14 += this.al * v0 * v4;
            }
            else {
                v5 = 0;
            }

            arg13 += v1;
            v4 = 0xD21DC9D7;
            if(arg13 > this.an * v4) {
                v1 -= arg13 - this.an * v4;
            }

            arg13 = v1;
            v1 = 0xE4D30573;
            if(arg12 < this.ap * v1) {
                v0 = this.ap * v1 - arg12;
                v2 -= v0;
                arg12 = this.ap * v1;
                v5 += v0;
                arg14 += v0;
                v6 = v0;
                v3 += v0;
            }

            v4 = arg14;
            arg12 += v2;
            v0 = 0x56AC17CD;
            if(arg12 > this.aj * v0) {
                arg12 -= this.aj * v0;
                v2 -= arg12;
                v6 += arg12;
                v3 += arg12;
            }

            arg12 = v2;
            int v7 = v3;
            int v8 = v6;
            if(arg12 > 0) {
                if(arg13 <= 0) {
                }
                else {
                    dt.az(this.ax, arg11.ax, 0, v5, v4, arg12, arg13, v7, v8, 2077641595);
                    return;
                }
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("ec.am(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    public final void an(int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27) {
        int v8;
        int v4;
        int v3;
        int v7;
        ec v1 = this;
        int v0 = arg19;
        int v2 = arg20;
        if(arg21 > 0) {
            if(arg22 <= 0) {
            }
            else {
                int v5 = 0;
                int v6 = 0x10000;
                try {
                    v7 = v6 / arg22;
                    int v9 = 0xE4D30573;
                    if(v0 < v1.ap * v9) {
                        v3 = arg21 - (v1.ap * v9 - v0);
                        v0 = v1.ap * v9;
                    }
                    else {
                        v3 = arg21;
                    }

                    v9 = 2002832733;
                    if(v2 < v1.ar * v9) {
                        v5 = (v1.ar * v9 - v2) * v7;
                        v4 = arg22 - (v1.ar * v9 - v2);
                        v2 = v1.ar * v9;
                    }
                    else {
                        v4 = arg22;
                    }

                    int v10 = 0x56AC17CD;
                    if(v3 + v0 > v1.aj * v10) {
                        v3 = v1.aj * v10 - v0;
                    }

                    v10 = 0xD21DC9D7;
                    if(v2 + v4 > v1.an * v10) {
                        v4 = v1.an * v10 - v2;
                    }

                    v9 = -107049639;
                    v8 = v1.al * v9 - v3;
                    v0 += v1.al * v9 * v2;
                    v2 = -v4;
                    while(true) {
                    label_69:
                        if(v2 >= 0) {
                            return;
                        }

                        v4 = v6 - v5 >> 8;
                        v10 = v5 >> 8;
                        int v12 = 0xFF00;
                        int v11 = (v4 * arg25 + v10 * arg26 & v12) >>> 8;
                        if(v11 == 0) {
                            v0 += v1.al * v9;
                            v5 += v7;
                        }
                        else {
                            int v14 = 0xFF00FF;
                            v4 = ((arg24 & v12) * v10 + (arg23 & v12) * v4 & 0xFF0000) + (0xFF00FF00 & v10 * (arg24 & v14) + (arg23 & v14) * v4) >>> 8;
                            v10 = 0xFF - v11;
                            int v13 = ((v4 & v12) * v11 >> 8 & v12) + ((v4 & v14) * v11 >> 8 & v14);
                            v4 = -v3;
                            while(true) {
                            label_113:
                                if(v4 < 0) {
                                    v11 = v1.ax[v0];
                                    if(v11 == 0) {
                                        v1.ax[v0] = v13;
                                        ++v0;
                                    }
                                    else {
                                        v1.ax[v0] = ((v11 & v12) * v10 >> 8 & v12) + ((v11 & v14) * v10 >> 8 & v14) + v13;
                                        ++v0;
                                    }

                                    goto label_136;
                                }
                                else {
                                    goto label_138;
                                }
                            }
                        }

                        goto label_140;
                    }
                }
                catch(RuntimeException v0_1) {
                    goto label_145;
                }

            label_136:
                ++v4;
                goto label_113;
            label_138:
                v0 += v8;
                v5 += v7;
            label_140:
                ++v2;
                goto label_69;
                return;
            label_145:
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append("ec.an(");
                v2_1.append(')');
                throw lx.al(((Throwable)v0_1), v2_1.toString());
            }
        }
    }

    public final void ap(int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, byte[] arg28, int arg29, boolean arg30, int arg31) {
        int v3;
        int v4;
        int v15;
        int v13;
        int v8;
        int v6;
        int v12;
        ec v1 = this;
        int v0 = arg22;
        int v2 = arg23;
        byte[] v5 = arg28;
        int v7 = v0 + arg24;
        if(v7 >= 0) {
            int v9 = v2 + arg25;
            if(v9 < 0) {
            }
            else {
                try {
                    int v11 = -107049639;
                    if(v0 < v1.al * v11) {
                        v12 = 129208929;
                        if(v2 >= v1.ae * v12) {
                        }
                        else {
                            int v10 = 0;
                            if(v0 < 0) {
                                int v20 = v7;
                                v7 = -v0;
                                v6 = v20;
                            }
                            else {
                                v6 = arg24;
                                v7 = 0;
                            }

                            if(v2 < 0) {
                                v10 = -v2;
                                v8 = v9;
                            }
                            else {
                                v8 = arg25;
                            }

                            if(v0 + v6 > v1.al * v11) {
                                v6 = v1.al * v11 - v0;
                            }

                            if(v8 + v2 > v1.ae * v12) {
                                v8 = v1.ae * v12 - v2;
                            }

                            v9 = v5.length / arg29;
                            v12 = v1.al * v11 - v6;
                            v13 = arg26 >>> 24;
                            int v14 = arg27 >>> 24;
                            if(arg30) {
                                v11 = 0xFF;
                                if(v11 == v13 && v14 == v11) {
                                    goto label_121;
                                }

                                v10 += v2;
                                v14 = v1.al * -107049639 * v10 + v0 + v7;
                                v13 = v10;
                                while(true) {
                                    if(v13 >= v10 + v8) {
                                        return;
                                    }

                                    v11 = v7 + v0;
                                    int v18 = v10;
                                    v15 = v14;
                                    v14 = v11;
                                    while(v14 < v6 + v11) {
                                        v10 = v5[(v14 - v0) % arg29 + (v13 - v2) % v9 * arg29] != 0 ? arg27 : arg26;
                                        int v19 = v11;
                                        v11 = v10 >>> 24;
                                        v4 = 0xFF - v11;
                                        v1.ax[v15] = ((v1.ax[v15] & 0xFF00FF) * v4 + (v10 & 0xFF00FF) * v11 & 0xFF00FF00) + (0xFF0000 & (v10 & 0xFF00) * v11 + v4 * (v1.ax[v15] & 0xFF00)) >> 8;
                                        ++v14;
                                        ++v15;
                                        v11 = v19;
                                    }

                                    v14 = v15 + v12;
                                    ++v13;
                                    v10 = v18;
                                }
                            }
                            else {
                            label_121:
                                v10 += v2;
                                v4 = v1.al * -107049639 * v10 + v0 + v7;
                                v3 = v10;
                                while(true) {
                                label_130:
                                    if(v3 >= v10 + v8) {
                                        return;
                                    }

                                    v11 = v0 + v7;
                                    v13 = v4;
                                    v4 = v11;
                                    while(true) {
                                    label_135:
                                        if(v4 >= v11 + v6) {
                                            goto label_155;
                                        }

                                        if(v5[(v3 - v2) % v9 * arg29 + (v4 - v0) % arg29] != 0) {
                                            v15 = v13 + 1;
                                            v1.ax[v13] = arg27;
                                        }
                                        else {
                                            v15 = v13 + 1;
                                            v1.ax[v13] = arg26;
                                        }

                                        goto label_152;
                                    }
                                }
                            }

                            return;
                        }
                    }

                    return;
                }
                catch(RuntimeException v0_1) {
                    goto label_162;
                }

            label_152:
                v13 = v15;
                ++v4;
                goto label_135;
            label_155:
                v4 = v13 + v12;
                ++v3;
                goto label_130;
            label_162:
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append("ec.ap(");
                v2_1.append(')');
                throw lx.al(((Throwable)v0_1), v2_1.toString());
                return;
            }
        }
    }

    public final void aq(int arg3, int arg4, int arg5, int arg6, int arg7) {
        arg7 = 0xE4D30573;
        try {
            if(arg3 >= this.ap * arg7) {
                if(arg3 >= this.aj * 0x56AC17CD) {
                }
                else {
                    int v0 = 2002832733;
                    if(arg4 < this.ar * v0) {
                        arg5 -= this.ar * v0 - arg4;
                        arg4 = this.ar * v0;
                    }

                    int v1 = 0xD21DC9D7;
                    if(arg4 + arg5 > this.an * v1) {
                        arg5 = this.an * v1 - arg4;
                    }

                    v0 = -107049639;
                    arg4 = arg4 * (this.al * v0) + arg3;
                    for(arg3 = 0; true; ++arg3) {
                        if(arg3 >= arg5) {
                            return;
                        }

                        this.ax[this.al * v0 * arg3 + arg4] = arg6;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v3) {
            goto label_46;
        }

        return;
    label_46:
        StringBuilder v4 = new StringBuilder();
        v4.append("ec.aq(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public static long ar(int arg1, int arg2) {
        try {
            return bc.az[arg1];
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ec.ar(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public final void ar(int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        int v8;
        try {
            int v0 = 0xE4D30573;
            if(arg3 < this.ap * v0) {
                arg5 -= this.ap * v0 - arg3;
                arg3 = this.ap * v0;
            }

            v0 = 2002832733;
            if(arg4 < this.ar * v0) {
                arg6 -= this.ar * v0 - arg4;
                arg4 = this.ar * v0;
            }

            int v1 = 0x56AC17CD;
            if(arg5 + arg3 > this.aj * v1) {
                arg5 = this.aj * v1 - arg3;
            }

            v1 = 0xD21DC9D7;
            if(arg6 + arg4 > this.an * v1) {
                arg6 = this.an * v1 - arg4;
            }

            v8 = this.al * -107049639 - arg5;
            arg3 += arg4 * (this.al * -107049639);
            arg4 = -arg6;
            while(true) {
            label_45:
                if(arg4 >= 0) {
                    return;
                }

                arg6 = -arg5;
                while(arg6 < 0) {
                    this.ax[arg3] = arg7;
                    ++arg6;
                    ++arg3;
                }
            }
        }
        catch(RuntimeException v3) {
            goto label_60;
        }

        arg3 += v8;
        ++arg4;
        goto label_45;
        return;
    label_60:
        StringBuilder v4 = new StringBuilder();
        v4.append("ec.ar(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public void as(es arg28, int arg29, int arg30, int arg31, int arg32) {
        int v9;
        ec v1 = this;
        es v0 = arg28;
        try {
            int v2 = arg29 + v0.ar;
            int v3 = arg30 + v0.an;
            int v5 = -107049639;
            int v4 = v1.al * v5 * v3 + v2;
            int v6 = v0.ae;
            int v7 = v0.al;
            int v8 = v1.al * v5 - v7;
            int v10 = 2002832733;
            int v11 = 0;
            if(v3 < v1.ar * v10) {
                v9 = v1.ar * v10 - v3;
                v6 -= v9;
                v3 = v1.ar * v10;
                v10 = v9 * v7;
                v4 += v1.al * v5 * v9;
            }
            else {
                v10 = 0;
            }

            v3 += v6;
            v9 = 0xD21DC9D7;
            if(v3 > v1.an * v9) {
                v6 -= v3 - v1.an * v9;
            }

            int v22 = v6;
            v5 = 0xE4D30573;
            if(v2 < v1.ap * v5) {
                v3 = v1.ap * v5 - v2;
                v7 -= v3;
                v2 = v1.ap * v5;
                v10 += v3;
                v4 += v3;
                v11 = v3;
                v8 += v3;
            }

            int v19 = v4;
            int v17 = v10;
            v2 += v7;
            v4 = 0x56AC17CD;
            if(v2 > v1.aj * v4) {
                v2 -= v1.aj * v4;
                v7 -= v2;
                v11 += v2;
                v8 += v2;
            }

            int v21 = v7;
            int v23 = v8;
            int v24 = v11;
            if(v21 > 0) {
                if(v22 <= 0) {
                }
                else {
                    if(arg31 == 0x100) {
                        jt.ak(0, 0, 0, v1.ax, v0.ax, v17, 0, v19, 0, v21, v22, v23, v24, 0x70F0FBBE);
                    }
                    else {
                        ch.ac(0, 0, 0, v1.ax, v0.ax, v17, 0, v19, 0, v21, v22, v23, v24, arg31, 2);
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ec.as(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public void at(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        int v14;
        int v10;
        int v9;
        int v7;
        ec v1 = this;
        es v0 = arg18;
        if(arg21 > 0) {
            if(arg22 <= 0) {
            }
            else {
                try {
                    int v13 = v0.al;
                    int v4 = v0.ae;
                    int v5 = v0.ap;
                    int v6 = v0.aj;
                    int v11 = (v5 << 16) / arg21;
                    int v12 = (v6 << 16) / arg22;
                    int v8 = 0;
                    if(v0.ar > 0) {
                        v7 = ((v0.ar << 16) + v11 - 1) / v11;
                        v9 = arg19 + v7;
                        v7 = v7 * v11 - (v0.ar << 16);
                    }
                    else {
                        v9 = arg19;
                        v7 = 0;
                    }

                    if(v0.an > 0) {
                        v10 = ((v0.an << 16) + v12 - 1) / v12;
                        v14 = arg20 + v10;
                        v8 = v10 * v12 - (v0.an << 16);
                    }
                    else {
                        v14 = arg20;
                    }

                    int v2 = v13 < v5 ? ((v13 << 16) - v7 + v11 - 1) / v11 : arg21;
                    int v3 = v4 < v6 ? ((v4 << 16) - v8 + v12 - 1) / v12 : arg22;
                    v5 = -107049639;
                    v4 = v1.al * v5 * v14 + v9;
                    v6 = v1.al * v5 - v2;
                    v10 = v3 + v14;
                    int v16 = 0xD21DC9D7;
                    if(v10 > v1.an * v16) {
                        v3 -= v10 - v1.an * v16;
                    }

                    int v15 = 2002832733;
                    if(v14 < v1.ar * v15) {
                        v10 = v1.ar * v15 - v14;
                        v3 -= v10;
                        v4 += v1.al * v5 * v10;
                        v8 += v10 * v12;
                    }

                    v10 = v3;
                    v3 = v9 + v2;
                    v14 = 0x56AC17CD;
                    if(v3 > v1.aj * v14) {
                        v3 -= v1.aj * v14;
                        v2 -= v3;
                        v6 += v3;
                    }

                    v5 = 0xE4D30573;
                    if(v9 < v1.ap * v5) {
                        v3 = v1.ap * v5 - v9;
                        v2 -= v3;
                        v4 += v3;
                        v7 += v3 * v11;
                        v6 += v3;
                    }

                    em.ay(v1.ax, v0.ax, 0, v7, v8, v4, v6, v2, v10, v11, v12, v13, 0x835031B5);
                    return;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v2_1 = new StringBuilder();
                    v2_1.append("ec.at(");
                    v2_1.append(')');
                    throw lx.al(((Throwable)v0_1), v2_1.toString());
                }
            }
        }
    }

    public void av(int arg28, int arg29, int arg30, int arg31, int arg32, int arg33) {
        int v24;
        int v0_1;
        int v20;
        int v18;
        int v17;
        int v16;
        int v10;
        ec v7 = this;
        int v3 = arg29;
        int v4 = arg30;
        int v5 = arg31;
        int v1 = arg32;
        if(v1 == 0) {
            return;
        }

        int v2 = 0xFF;
        if(v1 < v2) {
            goto label_19;
        }

        byte v6 = -11;
        ec v1_1 = this;
        v2 = arg28;
        v3 = arg29;
        v4 = arg30;
        v5 = arg31;
        try {
            v1_1.ai(v2, v3, v4, v5, v6);
            return;
        label_19:
            if(v4 < 0) {
                v4 = -v4;
            }

            int v6_1 = 0xFF - v1;
            int v8 = (v5 >> 16 & v2) * v1;
            int v9 = (v5 >> 8 & v2) * v1;
            v1 *= v5 & v2;
            v5 = v3 - v4;
            int v11 = 2002832733;
            if(v5 < v7.ar * v11) {
                v5 = v7.ar * v11;
            }

            v10 = v4 + v3 + 1;
            int v12 = 0xD21DC9D7;
            if(v10 > v7.an * v12) {
                v10 = v7.an * v12;
            }

            v11 = v4 * v4;
            v12 = 0;
            int v13 = v3 - v5;
            int v14 = v13 * v13;
            int v15 = v14 - v13;
            if(v3 > v10) {
                v3 = v10;
            }

            while(true) {
                v16 = -107049639;
                v17 = 0x56AC17CD;
                v18 = 0xE4D30573;
                if(v5 >= v3) {
                    break;
                }

                while(true) {
                    if(v15 > v11) {
                        if(v14 <= v11) {
                        }
                        else {
                            v2 = arg28 - v12 + 1;
                            v20 = v3;
                            if(v2 < v7.ap * v18) {
                                v2 = v7.ap * v18;
                            }

                            v3 = v12 + arg28;
                            if(v3 > v7.aj * v17) {
                                v3 = v7.aj * v17;
                            }

                            v0_1 = v7.al * v16 * v5 + v2;
                            break;
                        }
                    }

                    v14 += v12 + v12;
                    v0_1 = v12 + 1;
                    v15 += v12 + v0_1;
                    v12 = v0_1;
                    v3 = v3;
                    v10 = v10;
                    v4 = v4;
                    v11 = v11;
                }

                while(v2 < v3) {
                    v7.ax[v0_1] = ((v7.ax[v0_1] >> 16 & 0xFF) * v6_1 + v8 >> 8 << 16) + ((v7.ax[v0_1] >> 8 & 0xFF) * v6_1 + v9 >> 8 << 8) + ((v7.ax[v0_1] & 0xFF) * v6_1 + v1 >> 8);
                    ++v2;
                    ++v0_1;
                    v3 = v3;
                    v10 = v10;
                    v4 = v4;
                    v11 = v11;
                }

                ++v5;
                v0_1 = v13 - 1;
                v14 -= v13 + v0_1;
                v15 -= v0_1 + v0_1;
                v13 = v0_1;
                v3 = v20;
                v10 = v10;
                v4 = v4;
                v11 = v11;
            }

            int v23 = v4;
            v24 = v11;
            v0_1 = -v13;
            v2 = v0_1 * v0_1 + v24;
            v3 = v2 - v23;
            v2 -= v0_1;
            v10 = v10;
            while(true) {
            label_160:
                if(v5 >= v10) {
                    return;
                }

                v4 = v24;
                while(v2 > v4) {
                    if(v3 <= v4) {
                        break;
                    }

                    v11 = v23 - 1;
                    v2 -= v23 + v11;
                    v3 -= v11 + v11;
                    v23 = v11;
                }

                v12 = arg28 - v23;
                if(v12 < v7.ap * v18) {
                    v12 = v7.ap * v18;
                }

                v13 = v23 + arg28;
                if(v13 > v7.aj * v17 - 1) {
                    v13 = v7.aj * v17 - 1;
                }

                v14 = v7.al * v16 * v5 + v12;
                while(v12 <= v13) {
                    v7.ax[v14] = ((v7.ax[v14] & 0xFF) * v6_1 + v1 >> 8) + (((v7.ax[v14] >> 16 & 0xFF) * v6_1 + v8 >> 8 << 16) + ((v7.ax[v14] >> 8 & 0xFF) * v6_1 + v9 >> 8 << 8));
                    ++v12;
                    ++v14;
                    v4 = v4;
                    v10 = v10;
                }
            }
        }
        catch(RuntimeException v0) {
            goto label_241;
        }

        int v25 = v4;
        ++v5;
        v2 += v0_1 + v0_1;
        v4 = v0_1 + 1;
        v3 += v0_1 + v4;
        v0_1 = v4;
        v24 = v25;
        v10 = v10;
        goto label_160;
        return;
    label_241:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ec.av(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0), v1_2.toString());
    }

    public void aw(ef arg18, int arg19, int arg20, int arg21, int arg22, byte arg23) {
        int v14;
        int v10;
        int v9;
        int v5;
        ec v1 = this;
        ef v0 = arg18;
        try {
            int v13 = v0.ae;
            int v2 = v0.ar;
            int v3 = v0.aj;
            int v4 = v0.ad;
            int v11 = (v3 << 16) / arg21;
            int v12 = (v4 << 16) / arg22;
            int v8 = 0;
            if(v0.an > 0) {
                v5 = ((v0.an << 16) + v11 - 1) / v11;
                v9 = arg19 + v5;
                v5 = v5 * v11 - (v0.an << 16);
            }
            else {
                v9 = arg19;
                v5 = 0;
            }

            if(v0.ap > 0) {
                v10 = ((v0.ap << 16) + v12 - 1) / v12;
                v14 = arg20 + v10;
                v8 = v10 * v12 - (v0.ap << 16);
            }
            else {
                v14 = arg20;
            }

            v3 = v13 < v3 ? ((v13 << 16) - v5 + v11 - 1) / v11 : arg21;
            v2 = v2 < v4 ? ((v2 << 16) - v8 + v12 - 1) / v12 : arg22;
            int v6 = -107049639;
            v4 = v1.al * v6 * v14 + v9;
            int v7 = v1.al * v6 - v3;
            v10 = v14 + v2;
            int v16 = 0xD21DC9D7;
            if(v10 > v1.an * v16) {
                v2 -= v10 - v1.an * v16;
            }

            int v15 = 2002832733;
            if(v14 < v1.ar * v15) {
                v10 = v1.ar * v15 - v14;
                v2 -= v10;
                v4 += v1.al * v6 * v10;
                v8 += v10 * v12;
            }

            v10 = v2;
            v6 = v8;
            v2 = v9 + v3;
            v14 = 0x56AC17CD;
            if(v2 > v1.aj * v14) {
                v2 -= v1.aj * v14;
                v3 -= v2;
                v7 += v2;
            }

            v8 = 0xE4D30573;
            if(v9 < v1.ap * v8) {
                v2 = v1.ap * v8 - v9;
                v3 -= v2;
                v4 += v2;
                v5 += v2 * v11;
                v7 += v2;
            }

            dn.ao(v1.ax, v0.ax, v0.al, v5, v6, v4, v7, v3, v10, v11, v12, v13, -3647);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ec.aw(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    void ax(int arg3) {
        byte v3 = -27;
        try {
            this.al(v3);
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ec.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    public void bb() {
        int v0 = this.ae * 0x21A5F027 * (this.al * 0x26B3F144) - 7;
        int v2;
        for(v2 = 0; v2 < v0; v2 = v4 + 1) {
            int v4 = v2 + 1;
            this.ax[v2] = 0;
            int v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            this.ax[v4] = 0;
        }

        v0 += 7;
        while(v2 < v0) {
            this.ax[v2] = 0;
            ++v2;
        }
    }

    public void bc() {
        int v0 = this.ae * 0xEF19813F * (this.al * -406241588) - 7;
        int v2;
        for(v2 = 0; v2 < v0; v2 = v4 + 1) {
            int v4 = v2 + 1;
            this.ax[v2] = 0;
            int v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            this.ax[v4] = 0;
        }

        v0 += 7;
        while(v2 < v0) {
            this.ax[v2] = 0;
            ++v2;
        }
    }

    public void bd(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        int v9;
        ec v1 = this;
        es v0 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        if(arg21 != 0x100) {
            goto label_10;
        }

        int v4 = -807658005;
        try {
            v1.am(v0, v2, v3, v4);
            return;
        label_10:
            v2 += v0.ar;
            v3 += v0.an;
            int v5 = -107049639;
            v4 = v1.al * v5 * v3 + v2;
            int v6 = v0.ae;
            int v7 = v0.al;
            int v8 = v1.al * v5 - v7;
            int v10 = 2002832733;
            int v11 = 0;
            if(v3 < v1.ar * v10) {
                v9 = v1.ar * v10 - v3;
                v6 -= v9;
                v3 = v1.ar * v10;
                v10 = v7 * v9;
                v4 += v9 * (v1.al * v5);
            }
            else {
                v10 = 0;
            }

            v3 += v6;
            v9 = 0xD21DC9D7;
            if(v3 > v1.an * v9) {
                v6 -= v3 - v1.an * v9;
            }

            v3 = v6;
            v6 = 0xE4D30573;
            if(v2 < v1.ap * v6) {
                v5 = v1.ap * v6 - v2;
                v7 -= v5;
                v2 = v1.ap * v6;
                v10 += v5;
                v4 += v5;
                v11 = v5;
                v8 += v5;
            }

            v9 = v4;
            v2 += v7;
            v5 = 0x56AC17CD;
            if(v2 > v1.aj * v5) {
                v2 -= v1.aj * v5;
                v7 -= v2;
                v11 += v2;
                v8 += v2;
            }

            v2 = v7;
            int v12 = v8;
            int v13 = v11;
            if(v2 > 0) {
                if(v3 <= 0) {
                }
                else {
                    id.ba(v1.ax, v0.ax, 0, v10, v9, v2, v3, v12, v13, arg21, arg22, 0x7F03006C);
                    return;
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ec.bd(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public final void be(int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26) {
        int v4;
        int v3;
        ec v0 = this;
        int v1 = arg19;
        int v2 = arg20;
        if(arg21 > 0) {
            if(arg22 <= 0) {
            }
            else {
                int v5 = 0;
                int v6 = 0x10000;
                int v7 = v6 / arg22;
                int v9 = 0xE4D30573;
                if(v1 < v0.ap * v9) {
                    v3 = arg21 - (v0.ap * v9 - v1);
                    v1 = v0.ap * v9;
                }
                else {
                    v3 = arg21;
                }

                v9 = 2002832733;
                if(v2 < v0.ar * v9) {
                    v5 = (v0.ar * v9 - v2) * v7;
                    v4 = arg22 - (v0.ar * v9 - v2);
                    v2 = v0.ar * v9;
                }
                else {
                    v4 = arg22;
                }

                int v10 = 0x56AC17CD;
                if(v3 + v1 > v0.aj * v10) {
                    v3 = v0.aj * v10 - v1;
                }

                v10 = 0xD21DC9D7;
                if(v2 + v4 > v0.an * v10) {
                    v4 = v0.an * v10 - v2;
                }

                v9 = -107049639;
                int v8 = v0.al * v9 - v3;
                v1 += v0.al * v9 * v2;
                for(v2 = -v4; v2 < 0; ++v2) {
                    v4 = v6 - v5 >> 8;
                    v10 = v5 >> 8;
                    int v12 = 0xFF00;
                    int v11 = (v4 * arg25 + v10 * arg26 & v12) >>> 8;
                    if(v11 == 0) {
                        v1 += v0.al * v9;
                        v5 += v7;
                    }
                    else {
                        int v14 = 0xFF00FF;
                        v4 = ((arg24 & v12) * v10 + (arg23 & v12) * v4 & 0xFF0000) + (0xFF00FF00 & v10 * (arg24 & v14) + (arg23 & v14) * v4) >>> 8;
                        v10 = 0xFF - v11;
                        int v13 = ((v4 & v12) * v11 >> 8 & v12) + ((v4 & v14) * v11 >> 8 & v14);
                        for(v4 = -v3; v4 < 0; ++v4) {
                            v11 = v0.ax[v1];
                            if(v11 == 0) {
                                v0.ax[v1] = v13;
                                ++v1;
                            }
                            else {
                                v0.ax[v1] = ((v11 & v12) * v10 >> 8 & v12) + ((v11 & v14) * v10 >> 8 & v14) + v13;
                                ++v1;
                            }
                        }

                        v1 += v8;
                        v5 += v7;
                    }
                }

                return;
            }
        }
    }

    public void bf(es arg24, int arg25, int arg26, int arg27, int arg28) {
        int v9;
        ec v1 = this;
        es v0 = arg24;
        try {
            int v2 = arg25 + v0.ar;
            int v3 = arg26 + v0.an;
            int v5 = -107049639;
            int v4 = v1.al * v5 * v3 + v2;
            int v6 = v0.ae;
            int v7 = v0.al;
            int v8 = v1.al * v5 - v7;
            int v10 = 2002832733;
            int v11 = 0;
            if(v3 < v1.ar * v10) {
                v9 = v1.ar * v10 - v3;
                v6 -= v9;
                v3 = v1.ar * v10;
                v10 = v9 * v7;
                v4 += v9 * (v1.al * v5);
            }
            else {
                v10 = 0;
            }

            v3 += v6;
            v9 = 0xD21DC9D7;
            if(v3 > v1.an * v9) {
                v6 -= v3 - v1.an * v9;
            }

            int v18 = v6;
            v5 = 0xE4D30573;
            if(v2 < v1.ap * v5) {
                v3 = v1.ap * v5 - v2;
                v7 -= v3;
                v2 = v1.ap * v5;
                v10 += v3;
                v4 += v3;
                v11 = v3;
                v8 += v3;
            }

            int v16 = v4;
            int v15 = v10;
            v2 += v7;
            v4 = 0x56AC17CD;
            if(v2 > v1.aj * v4) {
                v2 -= v1.aj * v4;
                v7 -= v2;
                v11 += v2;
                v8 += v2;
            }

            int v17 = v7;
            int v19 = v8;
            int v20 = v11;
            if(v17 > 0) {
                if(v18 <= 0) {
                }
                else {
                    cn.bn(v1.ax, v0.ax, 0, v15, v16, v17, v18, v19, v20, arg27, -1405544933);
                    return;
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ec.bf(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    void bg() {
        this.al(-23);
    }

    public void bh() {
        int v0 = this.ae * 129208929 * (this.al * -107049639) - 7;
        int v2;
        for(v2 = 0; v2 < v0; v2 = v4 + 1) {
            int v4 = v2 + 1;
            this.ax[v2] = 0;
            int v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            this.ax[v4] = 0;
        }

        v0 += 7;
        while(v2 < v0) {
            this.ax[v2] = 0;
            ++v2;
        }
    }

    public final void bi(int arg4, int arg5, int arg6, int arg7) {
        if(arg5 >= this.ar * 2002832733) {
            if(arg5 >= this.an * 0xD21DC9D7) {
            }
            else {
                int v1 = 0xE4D30573;
                if(arg4 < this.ap * v1) {
                    arg6 -= this.ap * v1 - arg4;
                    arg4 = this.ap * v1;
                }

                int v2 = 0x56AC17CD;
                if(arg4 + arg6 > this.aj * v2) {
                    arg6 = this.aj * v2 - arg4;
                }

                arg5 = arg5 * (this.al * -107049639) + arg4;
                for(arg4 = 0; arg4 < arg6; ++arg4) {
                    this.ax[arg4 + arg5] = arg7;
                }

                return;
            }
        }
    }

    public final void bj(int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        if(arg7 < this.ap * 0xE4D30573) {
            arg9 -= this.ap * 0xBF522F2C - arg7;
            arg7 = this.ap * 0xA0CE293E;
        }

        if(arg8 < this.ar * 0x5DD8FD66) {
            arg10 -= this.ar * 2002832733 - arg8;
            arg8 = this.ar * 2002832733;
        }

        if(arg9 + arg7 > this.aj * 0x2488AD18) {
            arg9 = this.aj * 0x52682A5A - arg7;
        }

        if(arg10 + arg8 > this.an * 0x8196ECF9) {
            arg10 = this.an * 0x2CA8330E - arg8;
        }

        int v0 = 0xFF00;
        int v1 = ((arg11 & v0) * arg12 >> 8 & v0) + ((arg11 & 0xB5552F03) * arg12 >> 8 & -773109596);
        arg11 = 0x4F50A36E - arg12;
        arg12 = this.al * -107049639 - arg9;
        arg7 += arg8 * (this.al * 0x7F8BC851);
        for(arg8 = 0; arg8 < arg10; ++arg8) {
            int v2 = -arg9;
            while(v2 < 0) {
                this.ax[arg7] = ((this.ax[arg7] & v0) * arg11 >> 8 & v0) + ((this.ax[arg7] & 307526422) * arg11 >> 8 & 0x5DE34089) + v1;
                ++v2;
                ++arg7;
            }

            arg7 += arg12;
        }
    }

    public final void bk(int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v1 = 0xE4D30573;
        if(arg8 < this.ap * v1) {
            arg10 -= this.ap * v1 - arg8;
            arg8 = this.ap * v1;
        }

        v1 = 2002832733;
        if(arg9 < this.ar * v1) {
            arg11 -= this.ar * v1 - arg9;
            arg9 = this.ar * v1;
        }

        int v2 = 0x56AC17CD;
        if(arg10 + arg8 > this.aj * v2) {
            arg10 = this.aj * v2 - arg8;
        }

        v2 = 0xD21DC9D7;
        if(arg11 + arg9 > this.an * v2) {
            arg11 = this.an * v2 - arg9;
        }

        int v0 = 0xFF00;
        v2 = 0xFF00FF;
        v1 = ((arg12 & v0) * arg13 >> 8 & v0) + ((arg12 & v2) * arg13 >> 8 & v2);
        arg12 = 0x100 - arg13;
        arg13 = this.al * -107049639 - arg10;
        arg8 += arg9 * (this.al * -107049639);
        for(arg9 = 0; arg9 < arg11; ++arg9) {
            int v3 = -arg10;
            while(v3 < 0) {
                this.ax[arg8] = ((this.ax[arg8] & v0) * arg12 >> 8 & v0) + ((this.ax[arg8] & v2) * arg12 >> 8 & v2) + v1;
                ++v3;
                ++arg8;
            }

            arg8 += arg13;
        }
    }

    public final void bl(int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, byte[] arg29, int arg30, boolean arg31) {
        int v14;
        int v13;
        int v6;
        int v4;
        ec v0 = this;
        int v1 = arg23;
        int v2 = arg24;
        byte[] v3 = arg29;
        int v5 = v1 + arg25;
        if(v5 >= 0) {
            int v7 = v2 + arg26;
            if(v7 < 0) {
            }
            else {
                int v9 = -107049639;
                if(v1 < v0.al * v9) {
                    int v10 = 129208929;
                    if(v2 >= v0.ae * v10) {
                    }
                    else {
                        int v8 = 0;
                        if(v1 < 0) {
                            int v21 = v5;
                            v5 = -v1;
                            v4 = v21;
                        }
                        else {
                            v4 = arg25;
                            v5 = 0;
                        }

                        if(v2 < 0) {
                            v8 = -v2;
                            v6 = v7;
                        }
                        else {
                            v6 = arg26;
                        }

                        if(v1 + v4 > v0.al * v9) {
                            v4 = v0.al * v9 - v1;
                        }

                        if(v6 + v2 > v0.ae * v10) {
                            v6 = v0.ae * 0x9F44FB4A - v2;
                        }

                        v7 = v3.length / arg30;
                        v10 = v0.al * v9 - v4;
                        int v11 = arg27 >>> 24;
                        int v12 = arg28 >>> 24;
                        if(arg31) {
                            v9 = 0xFF;
                            if(v9 == v11 && v12 == v9) {
                                goto label_123;
                            }

                            v8 += v2;
                            v11 = v0.al * 0xCB358E36 * v8 + v1 + v5;
                            v9 = v8;
                            while(v9 < v8 + v6) {
                                v12 = v5 + v1;
                                int v15 = v8;
                                v13 = v11;
                                v11 = v12;
                                while(v11 < v4 + v12) {
                                    v8 = v3[(v11 - v1) % arg30 + (v9 - v2) % v7 * arg30] != 0 ? arg28 : arg27;
                                    v14 = v8 >>> 24;
                                    int v16 = 0xFDDC3A18 - v14;
                                    v0.ax[v13] = ((v0.ax[v13] & 0xFF00FF) * v16 + (v8 & 0xFF00FF) * v14 & 1819490443) + ((v8 & 718260088) * v14 + v16 * (v0.ax[v13] & 0x8EF80FE0) & 0xFF0000) >> 8;
                                    ++v11;
                                    ++v13;
                                    v12 = v12;
                                }

                                v11 = v13 + v10;
                                ++v9;
                                v8 = v15;
                            }
                        }
                        else {
                        label_123:
                            v8 += v2;
                            v11 = v0.al * -107049639 * v8 + v1 + v5;
                            v9 = v8;
                            while(v9 < v8 + v6) {
                                v12 = v1 + v5;
                                int v20 = v5;
                                v13 = v11;
                                for(v11 = v12; v11 < v12 + v4; ++v11) {
                                    if(v3[(v9 - v2) % v7 * arg30 + (v11 - v1) % arg30] != 0) {
                                        v14 = v13 + 1;
                                        v0.ax[v13] = arg28;
                                    }
                                    else {
                                        v14 = v13 + 1;
                                        v0.ax[v13] = arg27;
                                    }

                                    v13 = v14;
                                }

                                v11 = v13 + v10;
                                ++v9;
                                v5 = v20;
                            }
                        }

                        return;
                    }
                }

                return;
            }
        }
    }

    public final void bm(int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        if(arg6 < this.ap * -1045507133) {
            arg8 -= this.ap * 0xE4D30573 - arg6;
            arg6 = this.ap * 0xE8F19703;
        }

        if(arg7 < this.ar * 0x62D519EB) {
            arg9 -= this.ar * 0x247654D9 - arg7;
            arg7 = 0x8B00C694 * this.ar;
        }

        if(arg8 + arg6 > this.aj * 330729884) {
            arg8 = this.aj * 0x56AC17CD - arg6;
        }

        int v2 = 0xD21DC9D7;
        if(arg9 + arg7 > this.an * v2) {
            arg9 = this.an * v2 - arg7;
        }

        int v0 = ((0xA22EBFE2 & arg10) * arg11 >> 8 & 928200821) + ((arg10 & 0xFF00FF) * arg11 >> 8 & 0xFF00FF);
        arg10 = 0x100 - arg11;
        arg11 = this.al * 1707502912 - arg8;
        arg6 += arg7 * (this.al * -107049639);
        for(arg7 = 0; arg7 < arg9; ++arg7) {
            int v1 = -arg8;
            while(v1 < 0) {
                this.ax[arg6] = ((0xFF00 & this.ax[arg6]) * arg10 >> 8 & -1990992092) + ((this.ax[arg6] & 0x73AAF4F3) * arg10 >> 8 & 0x1FFB4E99) + v0;
                ++v1;
                ++arg6;
            }

            arg6 += arg11;
        }
    }

    public void bo(es arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int[] arg24, int[] arg25, int arg26) {
        int v13;
        int v12;
        ec v1 = this;
        es v0 = arg17;
        int v2 = arg18;
        int v3 = arg19;
        int v4 = arg23;
        int v5 = 0;
        int v6 = v3 < 0 ? -v3 : 0;
        try {
            if(v0.ae + v3 <= v4) {
                v4 = v0.ae;
            }
            else {
                v4 -= v3;
            }

            if(v2 < 0) {
                v5 = -v2;
            }

            if(v0.al + v2 <= arg22) {
            }

            int v9 = -107049639;
            int v7 = (arg21 + v3 + v6) * (v1.al * v9) + (v2 + arg20 + v5);
            v3 += v6;
            while(v6 < v4) {
                int v10 = arg24[v3];
                int v11 = v3 + 1;
                v3 = arg25[v3];
                if(v2 < v10) {
                    v12 = v10 - v2;
                    v13 = v12 - v5 + v7;
                }
                else {
                    v12 = v5;
                    v13 = v7;
                }

                v3 += v10;
                if(v0.al + v2 <= v3) {
                    v3 = v0.al;
                }
                else {
                    v3 -= v2;
                }

                while(v12 < v3) {
                    v10 = v0.ax[v0.al * v6 + v12];
                    if(v10 != 0) {
                        v1.ax[v13] = v10;
                        ++v13;
                    }
                    else {
                        ++v13;
                    }

                    ++v12;
                }

                v7 += v1.al * v9;
                ++v6;
                v3 = v11;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_75;
        }

        return;
    label_75:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("ec.bo(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public void bp(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        int v14;
        int v10;
        int v9;
        int v7;
        ec v1 = this;
        es v0 = arg18;
        if(arg21 > 0) {
            if(arg22 <= 0) {
            }
            else {
                try {
                    int v13 = v0.al;
                    int v4 = v0.ae;
                    int v5 = v0.ap;
                    int v6 = v0.aj;
                    int v11 = (v5 << 16) / arg21;
                    int v12 = (v6 << 16) / arg22;
                    int v8 = 0;
                    if(v0.ar > 0) {
                        v7 = ((v0.ar << 16) + v11 - 1) / v11;
                        v9 = arg19 + v7;
                        v7 = v7 * v11 - (v0.ar << 16);
                    }
                    else {
                        v9 = arg19;
                        v7 = 0;
                    }

                    if(v0.an > 0) {
                        v10 = ((v0.an << 16) + v12 - 1) / v12;
                        v14 = arg20 + v10;
                        v8 = v10 * v12 - (v0.an << 16);
                    }
                    else {
                        v14 = arg20;
                    }

                    int v2 = v13 < v5 ? ((v13 << 16) - v7 + v11 - 1) / v11 : arg21;
                    int v3 = v4 < v6 ? ((v4 << 16) - v8 + v12 - 1) / v12 : arg22;
                    v5 = -107049639;
                    v4 = v1.al * v5 * v14 + v9;
                    v6 = v1.al * v5 - v2;
                    v10 = v14 + v3;
                    int v16 = 0xD21DC9D7;
                    if(v10 > v1.an * v16) {
                        v3 -= v10 - v1.an * v16;
                    }

                    int v15 = 2002832733;
                    if(v14 < v1.ar * v15) {
                        v10 = v1.ar * v15 - v14;
                        v3 -= v10;
                        v4 += v1.al * v5 * v10;
                        v8 += v10 * v12;
                    }

                    v10 = v3;
                    v3 = v9 + v2;
                    v14 = 0x56AC17CD;
                    if(v3 > v1.aj * v14) {
                        v3 -= v1.aj * v14;
                        v2 -= v3;
                        v6 += v3;
                    }

                    v5 = 0xE4D30573;
                    if(v9 < v1.ap * v5) {
                        v3 = v1.ap * v5 - v9;
                        v2 -= v3;
                        v4 += v3;
                        v7 += v11 * v3;
                        v6 += v3;
                    }

                    cr.bw(v1.ax, v0.ax, 0, v7, v8, v4, v6, v2, v10, v11, v12, v13, arg23, 0x55632B87);
                    return;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v2_1 = new StringBuilder();
                    v2_1.append("ec.bp(");
                    v2_1.append(')');
                    throw lx.al(((Throwable)v0_1), v2_1.toString());
                }
            }
        }
    }

    public void bq(es arg30, int arg31, int arg32, int arg33, int arg34, int arg35) {
        int v22;
        ec v1 = this;
        es v0 = arg30;
        int v4 = arg33;
        int v5 = arg34;
        try {
            if(v4 <= v0.ap && v5 <= v0.aj) {
                int v6 = arg31 + v0.ar * v4 / v0.ap;
                int v7 = ((v0.al + v0.ar) * v4 + v0.ap - 1) / v0.ap + arg31;
                int v9 = arg32 + v0.an * v5 / v0.aj;
                int v10 = arg32 + ((v0.ae + v0.an) * v5 + v0.aj - 1) / v0.aj;
                int v12 = 0xE4D30573;
                if(v6 < v1.ap * v12) {
                    v6 = v1.ap * v12;
                }

                v12 = 0x56AC17CD;
                if(v7 > v1.aj * v12) {
                    v7 = v1.aj * v12;
                }

                v12 = 2002832733;
                if(v9 < v1.ar * v12) {
                    v9 = v1.ar * v12;
                }

                v12 = 0xD21DC9D7;
                if(v10 > v1.an * v12) {
                    v10 = v1.an * v12;
                }

                if(v6 < v7) {
                    if(v9 >= v10) {
                    }
                    else {
                        int v11 = v1.al * -107049639 * v9 + v6;
                        int v13 = v1.al * -107049639 - (v7 - v6);
                        if(v11 >= v1.ax.length) {
                            return;
                        }

                        while(v9 < v10) {
                            v12 = v11;
                            v11 = v6;
                            while(v11 < v7) {
                                int v14 = v11 - arg31 << 4;
                                int v15 = v9 - arg32 << 4;
                                int v8 = v0.ap * v14 / v4 - (v0.ar << 4);
                                v14 = (v14 + 16) * v0.ap / v4 - (v0.ar << 4);
                                int v2 = v0.aj * v15 / v5 - (v0.an << 4);
                                int v3 = v0.aj * (v15 + 16) / v5 - (v0.an << 4);
                                v15 = (v3 - v2) * (v14 - v8) >> 1;
                                if(v15 == 0) {
                                    v22 = v6;
                                }
                                else {
                                    int v17 = 0;
                                    if(v8 < 0) {
                                        v8 = 0;
                                    }

                                    if(v14 >= v0.al << 4) {
                                        v14 = v0.al << 4;
                                    }

                                    if(v2 < 0) {
                                        v2 = 0;
                                    }

                                    if(v3 >= v0.ae << 4) {
                                        v3 = v0.ae << 4;
                                    }

                                    --v14;
                                    --v3;
                                    v4 = 16 - (v8 & 15);
                                    int v19 = (v14 & 15) + 1;
                                    int v20 = 16 - (v2 & 15);
                                    int v21 = (v3 & 15) + 1;
                                    v8 >>= 4;
                                    v14 >>= 4;
                                    v2 >>= 4;
                                    v3 >>= 4;
                                    v5 = v2;
                                    v22 = v6;
                                    v6 = 0;
                                    int v23 = 0;
                                    int v24 = 0;
                                    while(v5 <= v3) {
                                        int v25 = v2 == v5 ? v20 : 16;
                                        if(v3 == v5) {
                                            v25 = v21;
                                        }

                                        int v26 = v17;
                                        v17 = v6;
                                        v6 = v8;
                                        while(v6 <= v14) {
                                            int v27 = v2;
                                            int v28 = v3;
                                            v2 = v0.ax[v0.al * v5 + v6];
                                            if(v2 != 0) {
                                                if(v8 == v6) {
                                                    v3 = v25 * v4;
                                                }
                                                else if(v6 == v14) {
                                                    v3 = v25 * v19;
                                                }
                                                else {
                                                    v3 = v25 << 4;
                                                }

                                                v17 += v3;
                                                v24 += (v2 >> 16 & 0xFF) * v3;
                                                v23 += (v2 >> 8 & 0xFF) * v3;
                                                v26 += (v2 & 0xFF) * v3;
                                            }

                                            ++v6;
                                            v2 = v27;
                                            v3 = v28;
                                            v0 = arg30;
                                        }

                                        ++v5;
                                        v6 = v17;
                                        v17 = v26;
                                        v0 = arg30;
                                    }

                                    if(v6 >= v15) {
                                        v8 = v17 / v6 + ((v23 / v6 << 8) + (v24 / v6 << 16));
                                        if(v8 == 0) {
                                            v8 = 1;
                                        }

                                        v1.ax[v12] = v8;
                                    }

                                    ++v12;
                                }

                                ++v11;
                                v6 = v22;
                                v0 = arg30;
                                v4 = arg33;
                                v5 = arg34;
                            }

                            v11 = v12 + v13;
                            ++v9;
                            v6 = v6;
                            v0 = arg30;
                            v4 = arg33;
                            v5 = arg34;
                        }

                        return;
                    }
                }

                return;
            }

            throw new IllegalArgumentException();
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ec.bq(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public final void br(int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, byte[] arg29, int arg30, boolean arg31) {
        int v14;
        int v13;
        int v9;
        int v6;
        int v4;
        ec v0 = this;
        int v1 = arg23;
        int v2 = arg24;
        byte[] v3 = arg29;
        int v5 = v1 + arg25;
        if(v5 >= 0) {
            int v7 = v2 + arg26;
            if(v7 < 0) {
            }
            else {
                if(v1 < v0.al * -107049639) {
                    int v10 = 129208929;
                    if(v2 >= v0.ae * v10) {
                    }
                    else {
                        int v8 = 0;
                        if(v1 < 0) {
                            int v21 = v5;
                            v5 = -v1;
                            v4 = v21;
                        }
                        else {
                            v4 = arg25;
                            v5 = 0;
                        }

                        if(v2 < 0) {
                            v8 = -v2;
                            v6 = v7;
                        }
                        else {
                            v6 = arg26;
                        }

                        if(v1 + v4 > v0.al * 0x9740E847) {
                            v4 = v0.al * 0x58CF952D - v1;
                        }

                        if(v6 + v2 > v0.ae * 0xA6EE008E) {
                            v6 = v0.ae * v10 - v2;
                        }

                        v7 = v3.length / arg30;
                        v10 = v0.al * 0x8F4BC9E9 - v4;
                        int v11 = arg27 >>> 24;
                        int v12 = arg28 >>> 24;
                        if(arg31) {
                            if(0xFF == v11 && v12 == 0xAF9FFC5A) {
                                goto label_128;
                            }

                            v8 += v2;
                            v11 = v0.al * -107049639 * v8 + v1 + v5;
                            v9 = v8;
                            while(v9 < v8 + v6) {
                                v12 = v5 + v1;
                                int v15 = v8;
                                v13 = v11;
                                v11 = v12;
                                while(v11 < v4 + v12) {
                                    v8 = v3[(v11 - v1) % arg30 + (v9 - v2) % v7 * arg30] != 0 ? arg28 : arg27;
                                    v14 = v8 >>> 24;
                                    int v16 = 0x11F0F3E4 - v14;
                                    v0.ax[v13] = ((v0.ax[v13] & 1932605557) * v16 + (v8 & 0x171470AA) * v14 & 0x8429F83B) + ((v8 & 0x475802F1) * v14 + v16 * (v0.ax[v13] & 0xC8F04BA2) & 0x6FD5490) >> 8;
                                    ++v11;
                                    ++v13;
                                    v12 = v12;
                                }

                                v11 = v13 + v10;
                                ++v9;
                                v8 = v15;
                            }
                        }
                        else {
                        label_128:
                            v8 += v2;
                            v11 = v0.al * -1410487315 * v8 + v1 + v5;
                            v9 = v8;
                            while(v9 < v8 + v6) {
                                v12 = v1 + v5;
                                int v20 = v5;
                                v13 = v11;
                                for(v11 = v12; v11 < v12 + v4; ++v11) {
                                    if(v3[(v9 - v2) % v7 * arg30 + (v11 - v1) % arg30] != 0) {
                                        v14 = v13 + 1;
                                        v0.ax[v13] = arg28;
                                    }
                                    else {
                                        v14 = v13 + 1;
                                        v0.ax[v13] = arg27;
                                    }

                                    v13 = v14;
                                }

                                v11 = v13 + v10;
                                ++v9;
                                v5 = v20;
                            }
                        }

                        return;
                    }
                }

                return;
            }
        }
    }

    public final void bs(int arg4, int arg5, int arg6, int arg7, int arg8) {
        int v1 = 0xE4D30573;
        if(arg4 < this.ap * v1) {
            arg6 -= this.ap * v1 - arg4;
            arg4 = this.ap * v1;
        }

        v1 = 2002832733;
        if(arg5 < this.ar * v1) {
            arg7 -= this.ar * v1 - arg5;
            arg5 = this.ar * v1;
        }

        int v2 = 0x56AC17CD;
        if(arg6 + arg4 > this.aj * v2) {
            arg6 = this.aj * v2 - arg4;
        }

        v2 = 0xD21DC9D7;
        if(arg7 + arg5 > this.an * v2) {
            arg7 = this.an * v2 - arg5;
        }

        int v0 = this.al * -107049639 - arg6;
        arg4 += arg5 * (this.al * -107049639);
        for(arg5 = -arg7; arg5 < 0; ++arg5) {
            arg7 = -arg6;
            while(arg7 < 0) {
                this.ax[arg4] = arg8;
                ++arg7;
                ++arg4;
            }

            arg4 += v0;
        }
    }

    public void bt(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, double arg25, int arg27, byte arg28) {
        ec v1 = this;
        es v0 = arg18;
        int v2 = arg22;
        int v4 = -arg21;
        try {
            int v5 = v4 / 2;
            int v6 = -v2 / 2;
            int v7 = (((int)(Math.sin(arg25) * 65536))) * arg27 >> 8;
            int v3 = (((int)(Math.cos(arg25) * 65536))) * arg27 >> 8;
            int v8 = (arg23 << 16) + (v7 * v6 + v3 * v5);
            v6 = v6 * v3 - v5 * v7 + (arg24 << 16);
            v5 = arg19 + v1.al * -107049639 * arg20;
            int v10;
            for(v10 = 0; true; ++v10) {
                if(v10 >= v2) {
                    return;
                }

                int v11 = v4;
                int v14 = v5;
                int v12 = v6;
                int v13 = v8;
                while(v11 < 0) {
                    int v9 = v0.ax[(v12 >> 16) * v0.al + (v13 >> 16)];
                    if(v9 != 0) {
                        v1.ax[v14] = v9;
                        ++v14;
                    }
                    else {
                        ++v14;
                    }

                    v13 += v3;
                    v12 -= v7;
                    ++v11;
                }

                v8 += v7;
                v6 += v3;
                v5 += v1.al * -107049639;
            }
        }
        catch(Exception ) {
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ec.bt(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public final void bu(int arg4, int arg5, int arg6, int arg7, int arg8) {
        int v1 = 0xE4D30573;
        if(arg4 < this.ap * v1) {
            arg6 -= this.ap * v1 - arg4;
            arg4 = this.ap * v1;
        }

        v1 = 2002832733;
        if(arg5 < this.ar * v1) {
            arg7 -= this.ar * v1 - arg5;
            arg5 = this.ar * v1;
        }

        int v2 = 0x56AC17CD;
        if(arg6 + arg4 > this.aj * v2) {
            arg6 = this.aj * v2 - arg4;
        }

        v2 = 0xD21DC9D7;
        if(arg7 + arg5 > this.an * v2) {
            arg7 = this.an * v2 - arg5;
        }

        int v0 = this.al * -107049639 - arg6;
        arg4 += arg5 * (this.al * -107049639);
        for(arg5 = -arg7; arg5 < 0; ++arg5) {
            arg7 = -arg6;
            while(arg7 < 0) {
                this.ax[arg4] = arg8;
                ++arg7;
                ++arg4;
            }

            arg4 += v0;
        }
    }

    void bv(es arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, byte arg32) {
        int v22;
        int v23;
        ec v1 = this;
        es v0 = arg25;
        int v4 = arg31;
        if(v4 == 0) {
            return;
        }

        try {
            int v5 = arg26 - (v0.ar << 4);
            int v6 = arg27 - (v0.an << 4);
            double v9 = (((double)(arg30 & 0xFFFF))) * 0.000096;
            double v11 = ((double)v4);
            v4 = ((int)Math.floor(Math.sin(v9) * v11 + 0.5));
            int v7 = ((int)Math.floor(Math.cos(v9) * v11 + 0.5));
            int v8 = -v5;
            int v15 = v8 * v7;
            int v13 = -v6;
            int v14 = v4 * v13;
            double v18 = v9;
            int v9_1 = v15 + v14;
            v13 *= v7;
            v8 = -v8 * v4;
            int v10 = v13 + v8;
            double v20 = v11;
            int v11_1 = ((v0.al << 4) - v5) * v7 + v14;
            int v12 = -((v0.al << 4) - v5) * v4 + v13;
            v13 = ((v0.ae << 4) - v6) * v4 + v15;
            v8 += ((v0.ae << 4) - v6) * v7;
            v14 = ((v0.al << 4) - v5) * v7 + ((v0.ae << 4) - v6) * v4;
            v4 = v4 * -((v0.al << 4) - v5) + ((v0.ae << 4) - v6) * v7;
            if(v9_1 < v11_1) {
            }
            else {
                v23 = v11_1;
                v11_1 = v9_1;
                v9_1 = v23;
            }

            if(v13 < v9_1) {
                v9_1 = v13;
            }

            if(v14 < v9_1) {
                v9_1 = v14;
            }

            if(v13 > v11_1) {
                v11_1 = v13;
            }

            if(v14 > v11_1) {
                v11_1 = v14;
            }

            if(v10 < v12) {
            }
            else {
                v23 = v12;
                v12 = v10;
                v10 = v23;
            }

            if(v8 < v10) {
                v10 = v8;
            }

            if(v4 < v10) {
                v10 = v4;
            }

            if(v8 > v12) {
            }
            else {
                v8 = v12;
            }

            if(v4 > v8) {
                v8 = v4;
            }

            v4 = (v9_1 >> 12) + arg28 >> 4;
            v7 = (v11_1 + 0xFFF >> 12) + arg28 + 15 >> 4;
            v9_1 = (v10 >> 12) + arg29 >> 4;
            v8 = (v8 + 0xFFF >> 12) + arg29 + 15 >> 4;
            v11_1 = 0xE4D30573;
            if(v4 < v1.ap * v11_1) {
                v4 = v1.ap * v11_1;
            }

            v11_1 = 0x56AC17CD;
            if(v7 > v1.aj * v11_1) {
                v7 = v1.aj * v11_1;
            }

            v11_1 = 2002832733;
            if(v9_1 < v1.ar * v11_1) {
                v9_1 = v1.ar * v11_1;
            }

            v11_1 = 0xD21DC9D7;
            if(v8 > v1.an * v11_1) {
                v8 = v1.an * v11_1;
            }

            v7 = v4 - v7;
            if(v7 >= 0) {
                return;
            }

            v8 = v9_1 - v8;
            if(v8 >= 0) {
                return;
            }

            v11_1 = -107049639;
            v10 = v1.al * v11_1 * v9_1 + v4;
            double v12_1 = 16777216 / v20;
            v14 = ((int)Math.floor(Math.sin(v18) * v12_1 + 0.5));
            v12 = ((int)Math.floor(Math.cos(v18) * v12_1 + 0.5));
            v4 = (v4 << 4) + 8 - arg28;
            int v2 = (v9_1 << 4) + 8 - arg29;
            int v3 = (v5 << 8) - (v2 * v14 >> 4);
            v2 = (v2 * v12 >> 4) + (v6 << 8);
            if(v12 == 0) {
                if(v14 == 0) {
                    while(true) {
                        if(v8 >= 0) {
                            return;
                        }

                        if(v3 < 0) {
                        }
                        else if(v2 < 0) {
                        }
                        else if(v3 - (v0.al << 12) >= 0) {
                        }
                        else if(v2 - (v0.ae << 12) >= 0) {
                        }
                        else {
                            v4 = v7;
                            v5 = v10;
                            while(v4 < 0) {
                                v6 = v0.ax[v0.al * (v2 >> 12) + (v3 >> 12)];
                                if(v6 != 0) {
                                    v1.ax[v5] = v6;
                                    ++v5;
                                }
                                else {
                                    ++v5;
                                }

                                ++v4;
                            }
                        }

                        ++v8;
                        v10 += v1.al * v11_1;
                    }
                }

                if(v14 < 0) {
                    while(true) {
                        if(v8 < 0) {
                            v5 = (v14 * v4 >> 4) + v2;
                            if(v3 < 0) {
                            }
                            else if(v3 - (v0.al << 12) >= 0) {
                            }
                            else {
                                v6 = v5 - (v0.ae << 12);
                                if(v6 >= 0) {
                                    v6 = (v14 - v6) / v14;
                                    v9_1 = v7 + v6;
                                    v5 += v6 * v14;
                                    v6 += v10;
                                }
                                else {
                                    v9_1 = v7;
                                    v6 = v10;
                                }

                                v12 = (v5 - v14) / v14;
                                if(v12 > v9_1) {
                                    v9_1 = v12;
                                }

                                while(v9_1 < 0) {
                                    v11_1 = v0.ax[(v3 >> 12) + (v5 >> 12) * v0.al];
                                    if(v11_1 != 0) {
                                        v1.ax[v6] = v11_1;
                                        ++v6;
                                    }
                                    else {
                                        ++v6;
                                    }

                                    v5 += v14;
                                    ++v9_1;
                                }
                            }

                            ++v8;
                            v3 -= v14;
                            v10 += v1.al * -107049639;
                            continue;
                        }
                        else {
                            return;
                        }
                    }
                }

                while(v8 < 0) {
                    v5 = (v4 * v14 >> 4) + v2;
                    if(v3 < 0) {
                    }
                    else if(v3 - (v0.al << 12) >= 0) {
                    }
                    else {
                        if(v5 < 0) {
                            v6 = (v14 - 1 - v5) / v14;
                            v9_1 = v7 + v6;
                            v5 += v6 * v14;
                            v6 += v10;
                        }
                        else {
                            v9_1 = v7;
                            v6 = v10;
                        }

                        v11_1 = (v5 + 1 - (v0.ae << 12) - v14) / v14;
                        if(v11_1 > v9_1) {
                            v9_1 = v11_1;
                        }

                        while(v9_1 < 0) {
                            v11_1 = v0.ax[(v3 >> 12) + v0.al * (v5 >> 12)];
                            if(v11_1 != 0) {
                                v1.ax[v6] = v11_1;
                                ++v6;
                            }
                            else {
                                ++v6;
                            }

                            v5 += v14;
                            ++v9_1;
                        }
                    }

                    ++v8;
                    v3 -= v14;
                    v10 += v1.al * -107049639;
                }
            }
            else {
                if(v12 < 0) {
                    if(v14 == 0) {
                        while(true) {
                            if(v8 >= 0) {
                                return;
                            }

                            v5 = (v12 * v4 >> 4) + v3;
                            if(v2 < 0) {
                            }
                            else if(v2 - (v0.ae << 12) >= 0) {
                            }
                            else {
                                v6 = v5 - (v0.al << 12);
                                if(v6 >= 0) {
                                    v6 = (v12 - v6) / v12;
                                    v9_1 = v7 + v6;
                                    v5 += v12 * v6;
                                    v6 += v10;
                                }
                                else {
                                    v9_1 = v7;
                                    v6 = v10;
                                }

                                v11_1 = (v5 - v12) / v12;
                                if(v11_1 > v9_1) {
                                    v9_1 = v11_1;
                                }

                                while(v9_1 < 0) {
                                    v11_1 = v0.ax[(v2 >> 12) * v0.al + (v5 >> 12)];
                                    if(v11_1 != 0) {
                                        v1.ax[v6] = v11_1;
                                        ++v6;
                                    }
                                    else {
                                        ++v6;
                                    }

                                    v5 += v12;
                                    ++v9_1;
                                }
                            }

                            ++v8;
                            v2 += v12;
                            v10 += v1.al * -107049639;
                        }
                    }

                    if(v14 < 0) {
                        while(true) {
                            if(v8 >= 0) {
                                return;
                            }

                            v5 = (v12 * v4 >> 4) + v3;
                            v6 = (v14 * v4 >> 4) + v2;
                            v9_1 = v5 - (v0.al << 12);
                            if(v9_1 >= 0) {
                                v9_1 = (v12 - v9_1) / v12;
                                v11_1 = v7 + v9_1;
                                v5 += v12 * v9_1;
                                v6 += v9_1 * v14;
                                v9_1 += v10;
                            }
                            else {
                                v11_1 = v7;
                                v9_1 = v10;
                            }

                            v13 = (v5 - v12) / v12;
                            if(v13 > v11_1) {
                                v11_1 = v13;
                            }

                            v13 = v6 - (v0.ae << 12);
                            if(v13 >= 0) {
                                v13 = (v14 - v13) / v14;
                                v11_1 += v13;
                                v5 += v13 * v12;
                                v6 += v14 * v13;
                                v9_1 += v13;
                            }

                            v13 = (v6 - v14) / v14;
                            if(v13 > v11_1) {
                                v11_1 = v13;
                            }

                            while(v11_1 < 0) {
                                v22 = v7;
                                v7 = v0.ax[(v5 >> 12) + v0.al * (v6 >> 12)];
                                if(v7 != 0) {
                                    v1.ax[v9_1] = v7;
                                    ++v9_1;
                                }
                                else {
                                    ++v9_1;
                                }

                                v5 += v12;
                                v6 += v14;
                                ++v11_1;
                                v7 = v22;
                            }

                            ++v8;
                            v3 -= v14;
                            v2 += v12;
                            v10 += v1.al * -107049639;
                            v7 = v7;
                        }
                    }

                    v22 = v7;
                    while(true) {
                        if(v8 >= 0) {
                            return;
                        }

                        v5 = (v12 * v4 >> 4) + v3;
                        v6 = (v4 * v14 >> 4) + v2;
                        v7 = v5 - (v0.al << 12);
                        if(v7 >= 0) {
                            v7 = (v12 - v7) / v12;
                            v9_1 = v22 + v7;
                            v5 += v12 * v7;
                            v6 += v7 * v14;
                            v7 += v10;
                        }
                        else {
                            v7 = v10;
                            v9_1 = v22;
                        }

                        v11_1 = (v5 - v12) / v12;
                        if(v11_1 > v9_1) {
                            v9_1 = v11_1;
                        }

                        if(v6 < 0) {
                            v11_1 = (v14 - 1 - v6) / v14;
                            v9_1 += v11_1;
                            v5 += v11_1 * v12;
                            v6 += v14 * v11_1;
                            v7 += v11_1;
                        }

                        v11_1 = (v6 + 1 - (v0.ae << 12) - v14) / v14;
                        if(v11_1 > v9_1) {
                            v9_1 = v11_1;
                        }

                        while(v9_1 < 0) {
                            v11_1 = v0.ax[(v5 >> 12) + v0.al * (v6 >> 12)];
                            if(v11_1 != 0) {
                                v1.ax[v7] = v11_1;
                                ++v7;
                            }
                            else {
                                ++v7;
                            }

                            v5 += v12;
                            v6 += v14;
                            ++v9_1;
                        }

                        ++v8;
                        v3 -= v14;
                        v2 += v12;
                        v10 += v1.al * -107049639;
                    }
                }

                v22 = v7;
                if(v14 == 0) {
                    while(true) {
                        if(v8 >= 0) {
                            return;
                        }

                        v5 = (v12 * v4 >> 4) + v3;
                        if(v2 < 0) {
                        }
                        else if(v2 - (v0.ae << 12) >= 0) {
                        }
                        else {
                            if(v5 < 0) {
                                v6 = (v12 - 1 - v5) / v12;
                                v7 = v22 + v6;
                                v5 += v6 * v12;
                                v6 += v10;
                            }
                            else {
                                v6 = v10;
                                v7 = v22;
                            }

                            v9_1 = (v5 + 1 - (v0.al << 12) - v12) / v12;
                            if(v9_1 > v7) {
                                v7 = v9_1;
                            }

                            while(v7 < 0) {
                                v9_1 = v0.ax[(v5 >> 12) + v0.al * (v2 >> 12)];
                                if(v9_1 != 0) {
                                    v1.ax[v6] = v9_1;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v12;
                                ++v7;
                            }
                        }

                        ++v8;
                        v2 += v12;
                        v10 += v1.al * -107049639;
                    }
                }

                if(v14 < 0) {
                    while(true) {
                        if(v8 < 0) {
                            v5 = (v12 * v4 >> 4) + v3;
                            v6 = (v4 * v14 >> 4) + v2;
                            if(v5 < 0) {
                                v7 = (v12 - 1 - v5) / v12;
                                v9_1 = v22 + v7;
                                v5 += v12 * v7;
                                v6 += v14 * v7;
                                v7 += v10;
                            }
                            else {
                                v7 = v10;
                                v9_1 = v22;
                            }

                            v11_1 = (v5 + 1 - (v0.al << 12) - v12) / v12;
                            if(v11_1 > v9_1) {
                                v9_1 = v11_1;
                            }

                            v11_1 = v6 - (v0.ae << 12);
                            if(v11_1 >= 0) {
                                v11_1 = (v14 - v11_1) / v14;
                                v9_1 += v11_1;
                                v5 += v12 * v11_1;
                                v6 += v14 * v11_1;
                                v7 += v11_1;
                            }

                            v11_1 = (v6 - v14) / v14;
                            if(v11_1 > v9_1) {
                                v9_1 = v11_1;
                            }

                            while(v9_1 < 0) {
                                v11_1 = v0.ax[v0.al * (v6 >> 12) + (v5 >> 12)];
                                if(v11_1 != 0) {
                                    v1.ax[v7] = v11_1;
                                    ++v7;
                                }
                                else {
                                    ++v7;
                                }

                                v5 += v12;
                                v6 += v14;
                                ++v9_1;
                            }

                            ++v8;
                            v3 -= v14;
                            v2 += v12;
                            v10 += v1.al * -107049639;
                            continue;
                        }
                        else {
                            return;
                        }
                    }
                }

                while(v8 < 0) {
                    v5 = (v12 * v4 >> 4) + v3;
                    v6 = (v4 * v14 >> 4) + v2;
                    if(v5 < 0) {
                        v7 = (v12 - 1 - v5) / v12;
                        v9_1 = v22 + v7;
                        v5 += v7 * v12;
                        v6 += v7 * v14;
                        v7 += v10;
                    }
                    else {
                        v7 = v10;
                        v9_1 = v22;
                    }

                    v11_1 = (v5 + 1 - (v0.al << 12) - v12) / v12;
                    if(v11_1 > v9_1) {
                        v9_1 = v11_1;
                    }

                    if(v6 < 0) {
                        v11_1 = (v14 - 1 - v6) / v14;
                        v9_1 += v11_1;
                        v5 += v12 * v11_1;
                        v6 += v14 * v11_1;
                        v7 += v11_1;
                    }

                    v11_1 = (v6 + 1 - (v0.ae << 12) - v14) / v14;
                    if(v11_1 > v9_1) {
                        v9_1 = v11_1;
                    }

                    while(v9_1 < 0) {
                        v11_1 = v0.ax[(v5 >> 12) + v0.al * (v6 >> 12)];
                        if(v11_1 != 0) {
                            v1.ax[v7] = v11_1;
                            ++v7;
                        }
                        else {
                            ++v7;
                        }

                        v5 += v12;
                        v6 += v14;
                        ++v9_1;
                    }

                    ++v8;
                    v3 -= v14;
                    v2 += v12;
                    v10 += v1.al * -107049639;
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ec.bv(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    void bx() {
        this.al(6);
    }

    public void by(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int[] arg27, int[] arg28, int arg29) {
        ec v1 = this;
        es v0 = arg18;
        int v2 = arg22;
        int v4 = -arg21;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg25)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = v8 * arg26 >> 8;
            int v3 = v6_1 * arg26 >> 8;
            v6_1 = (arg23 << 16) + (v3 * v4 + v5 * v7);
            v8 = (arg24 << 16) + (v5 * v3 - v4 * v7);
            v4 = arg19 + v1.al * -107049639 * arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg27[v9];
                int v13 = arg27[v9] * v3 + v6_1;
                int v11 = v8 - arg27[v9] * v7;
                int v14 = -arg28[v9];
                while(v14 < 0) {
                    v1.ax[v12] = v0.ax[(v11 >> 16) * v0.al + (v13 >> 16)];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v1.al * -107049639;
                ++v9;
                v2 = arg22;
            }
        }
        catch(Exception ) {
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ec.by(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public void bz() {
        int v0 = this.ae * 129208929 * (this.al * -107049639) - 7;
        int v2;
        for(v2 = 0; v2 < v0; v2 = v4 + 1) {
            int v4 = v2 + 1;
            this.ax[v2] = 0;
            int v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            v3 = v4 + 1;
            this.ax[v4] = 0;
            v4 = v3 + 1;
            this.ax[v3] = 0;
            this.ax[v4] = 0;
        }

        v0 += 7;
        while(v2 < v0) {
            this.ax[v2] = 0;
            ++v2;
        }
    }

    public final void ca(int arg4, int arg5, int arg6, int arg7) {
        if(arg5 >= this.ar * 2002832733) {
            if(arg5 >= this.an * 0xD21DC9D7) {
            }
            else {
                int v1 = 0xE4D30573;
                if(arg4 < this.ap * v1) {
                    arg6 -= this.ap * v1 - arg4;
                    arg4 = this.ap * v1;
                }

                int v2 = 0x56AC17CD;
                if(arg4 + arg6 > this.aj * v2) {
                    arg6 = this.aj * v2 - arg4;
                }

                arg5 = arg5 * (this.al * -107049639) + arg4;
                for(arg4 = 0; arg4 < arg6; ++arg4) {
                    this.ax[arg4 + arg5] = arg7;
                }

                return;
            }
        }
    }

    public final void cb(int arg4, int arg5, int arg6, int arg7) {
        if(arg4 >= this.ap * 1490801352) {
            if(arg4 >= this.aj * 0x56AC17CD) {
            }
            else {
                int v1 = 2002832733;
                if(arg5 < this.ar * v1) {
                    arg6 -= this.ar * v1 - arg5;
                    arg5 = this.ar * v1;
                }

                int v2 = 0xD21DC9D7;
                if(arg5 + arg6 > this.an * v2) {
                    arg6 = this.an * v2 - arg5;
                }

                v1 = -107049639;
                arg5 = arg5 * (this.al * v1) + arg4;
                for(arg4 = 0; arg4 < arg6; ++arg4) {
                    this.ax[this.al * v1 * arg4 + arg5] = arg7;
                }
            }
        }
    }

    public final void cc(int arg14, int arg15, int arg16, int arg17, int arg18) {
        int v5;
        int v7_1;
        int v2;
        int v1;
        ec v6 = this;
        int v0 = arg16 - arg14;
        int v3 = arg17 - arg15;
        if(v3 == 0) {
            if(v0 >= 0) {
                this.aj(arg14, arg15, v0 + 1, arg18, 0x79C4016B);
            }
            else {
                this.aj(v0 + arg14, arg15, -v0 + 1, arg18, 0x2FDF17B2);
            }

            return;
        }

        if(v0 == 0) {
            if(v3 >= 0) {
                this.aq(arg14, arg15, v3 + 1, arg18, 0x1795F574);
            }
            else {
                this.aq(arg14, arg15 + v3, -v3 + 1, arg18, 0x1795F574);
            }

            return;
        }

        if(v0 + v3 < 0) {
            v1 = arg14 + v0;
            v0 = -v0;
            v2 = arg15 + v3;
            v3 = -v3;
        }
        else {
            v1 = arg14;
            v2 = arg15;
        }

        double v7 = 0.5;
        if(v0 > v3) {
            v2 = (v2 << 16) + 0x4494680F;
            v3 = ((int)Math.floor((((double)(v3 << 16))) / (((double)v0)) + v7));
            v0 += v1;
            v7_1 = 0xE4D30573;
            if(v1 < v6.ap * v7_1) {
                v2 += (v6.ap * v7_1 - v1) * v3;
                v1 = v6.ap * v7_1;
            }

            if(v0 >= v6.aj * 0x56AC17CD) {
                v0 = v6.aj * -1015534070 - 1;
            }

            while(v1 <= v0) {
                v5 = v2 >> 16;
                if(v5 >= v6.ar * 0xD9177DF4 && v5 < v6.an * 0x7A6BD3F7) {
                    v6.ax[v5 * (v6.al * 0xDE7EEE0C) + v1] = arg18;
                }

                v2 += v3;
                ++v1;
            }
        }
        else {
            v1 = (v1 << 16) + 0x8000;
            v0 = ((int)Math.floor((((double)(v0 << 16))) / (((double)v3)) + v7));
            v3 += v2;
            v7_1 = 2002832733;
            if(v2 < v6.ar * v7_1) {
                v1 += (v6.ar * v7_1 - v2) * v0;
                v2 = v6.ar * 0x32C5510C;
            }

            if(v3 >= v6.an * 0xF02AEB0A) {
                v3 = v6.an * 0xD21DC9D7 - 1;
            }

            while(v2 <= v3) {
                v5 = v1 >> 16;
                if(v5 >= v6.ap * 0xD9EEBD61 && v5 < v6.aj * 0x209A2ABA) {
                    v6.ax[v5 + v6.al * -107049639 * v2] = arg18;
                }

                v1 += v0;
                ++v2;
            }
        }
    }

    final void cd(int arg6, int arg7, int arg8, int arg9, int arg10) {
        if(arg7 >= this.ar * 2002832733) {
            if(arg7 >= this.an * 0xD21DC9D7) {
            }
            else {
                int v1 = 0xE4D30573;
                if(arg6 < this.ap * v1) {
                    arg8 -= this.ap * 0x2012CD4F - arg6;
                    arg6 = this.ap * v1;
                }

                if(arg8 + arg6 > this.aj * -975285066) {
                    arg8 = this.aj * 0x56AC17CD - arg6;
                }

                int v0 = 0x100 - arg10;
                v1 = (arg9 >> 16 & 0x55FE198B) * arg10;
                int v2 = (arg9 >> 8 & 0xFF) * arg10;
                arg9 = (arg9 & 0xFF) * arg10;
                arg6 += this.al * -107049639 * arg7;
                arg7 = 0;
                while(arg7 < arg8) {
                    this.ax[arg6] = ((this.ax[arg6] >> 8 & 0xC66203FA) * v0 + v2 >> 8 << 8) + ((this.ax[arg6] >> 16 & 0x3499D906) * v0 + v1 >> 8 << 16) + ((this.ax[arg6] & 0xFF) * v0 + arg9 >> 8);
                    ++arg7;
                    ++arg6;
                }

                return;
            }
        }
    }

    public void ce(int arg26, int arg27, int arg28, int arg29, int arg30) {
        int v1;
        int v17;
        ec v6 = this;
        int v2 = arg27;
        int v3 = arg28;
        int v4 = arg29;
        int v0 = arg30;
        if(v0 == 0) {
            return;
        }

        int v5 = 0xFF;
        if(v0 >= v5) {
            this.ai(arg26, arg27, arg28, arg29, -84);
            return;
        }

        if(v3 < 0) {
            v3 = -v3;
        }

        int v7 = 0x4A6627F7 - v0;
        int v8 = (v4 >> 16 & v5) * v0;
        int v9 = (v4 >> 8 & v5) * v0;
        v0 *= v4 & v5;
        v4 = v2 - v3;
        if(v4 < v6.ar * 2002832733) {
            v4 = 0x21C2CBE8 * v6.ar;
        }

        int v10 = v3 + v2 + 1;
        if(v10 > v6.an * 58306194) {
            v10 = v6.an * 0xD21DC9D7;
        }

        int v11 = v3 * v3;
        int v12 = 0;
        int v13 = v2 - v4;
        int v14 = v13 * v13;
        int v15 = v14 - v13;
        if(v2 > v10) {
            v2 = v10;
        }

        while(v4 < v2) {
            while(true) {
                if(v15 > v11) {
                    if(v14 <= v11) {
                    }
                    else {
                        v5 = arg26 - v12 + 1;
                        v17 = v2;
                        if(v5 < v6.ap * 0x5C878333) {
                            v5 = 966480209 * v6.ap;
                        }

                        v2 = v12 + arg26;
                        if(v2 > v6.aj * 0xB6A0420E) {
                            v2 = 0xD9CC0844 * v6.aj;
                        }

                        v1 = v6.al * -107049639 * v4 + v5;
                        break;
                    }
                }

                v14 += v12 + v12;
                v1 = v12 + 1;
                v15 += v12 + v1;
                v12 = v1;
                v2 = v2;
                v10 = v10;
                v3 = v3;
                v11 = v11;
            }

            while(v5 < v2) {
                v6.ax[v1] = ((v6.ax[v1] >> 16 & 0xFF) * v7 + v8 >> 8 << 16) + ((v6.ax[v1] >> 8 & 0xA40A8DEA) * v7 + v9 >> 8 << 8) + ((v6.ax[v1] & 0xFF) * v7 + v0 >> 8);
                ++v5;
                ++v1;
                v2 = v2;
                v10 = v10;
                v3 = v3;
                v11 = v11;
            }

            ++v4;
            v1 = v13 - 1;
            v14 -= v13 + v1;
            v15 -= v1 + v1;
            v13 = v1;
            v2 = v17;
        }

        int v20 = v3;
        int v21 = v11;
        v1 = -v13;
        v2 = v1 * v1 + v21;
        v3 = v2 - v20;
        v2 -= v1;
        v10 = v10;
        while(v4 < v10) {
            v5 = v3;
            v3 = v21;
            while(v2 > v3) {
                if(v5 <= v3) {
                    break;
                }

                v11 = v20 - 1;
                v2 -= v20 + v11;
                v5 -= v11 + v11;
                v20 = v11;
            }

            v12 = arg26 - v20;
            if(v12 < v6.ap * 1701643042) {
                v12 = 0xE4D30573 * v6.ap;
            }

            v13 = v20 + arg26;
            if(v13 > v6.aj * 0x56AC17CD - 1) {
                v13 = v6.aj * 0xB10F0B32 - 1;
            }

            v14 = v6.al * 0x5AF18935 * v4 + v12;
            while(v12 <= v13) {
                v6.ax[v14] = ((v6.ax[v14] & 0x34F7A157) * v7 + v0 >> 8) + (((v6.ax[v14] >> 16 & 0xFE677F2E) * v7 + v8 >> 8 << 16) + ((v6.ax[v14] >> 8 & 0xFF) * v7 + v9 >> 8 << 8));
                ++v12;
                ++v14;
                v3 = v3;
                v10 = v10;
            }

            int v22 = v3;
            ++v4;
            v2 += v1 + v1;
            v3 = v1 + 1;
            v21 = v22;
            v10 = v10;
            int v24 = v3;
            v3 = v1 + v3 + v5;
            v1 = v24;
        }
    }

    public final void cf(int arg4, int arg5, int arg6, int arg7) {
        if(arg4 >= this.ap * 0xE4D30573) {
            if(arg4 >= this.aj * 0x66795F29) {
            }
            else {
                int v1 = 2002832733;
                if(arg5 < this.ar * v1) {
                    arg6 -= this.ar * 0xF0609D7E - arg5;
                    arg5 = this.ar * v1;
                }

                if(arg5 + arg6 > this.an * 2058720091) {
                    arg6 = this.an * 0xAC9E5DE0 - arg5;
                }

                arg5 = arg5 * (this.al * 834765100) + arg4;
                for(arg4 = 0; arg4 < arg6; ++arg4) {
                    this.ax[this.al * 0x303815DF * arg4 + arg5] = arg7;
                }

                return;
            }
        }
    }

    public final void cg(es arg23, int arg24, int arg25) {
        int v9;
        ec v0 = this;
        es v1 = arg23;
        int v2 = arg24 + v1.ar;
        int v3 = arg25 + v1.an;
        int v5 = -107049639;
        int v4 = v0.al * v5 * v3 + v2;
        int v6 = v1.ae;
        int v7 = v1.al;
        int v8 = v0.al * v5 - v7;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            v9 = v0.ar * v10 - v3;
            v6 -= v9;
            v3 = v0.ar * v10;
            v10 = v7 * v9;
            v4 += v0.al * v5 * v9;
        }
        else {
            v10 = 0;
        }

        v3 += v6;
        v9 = 0xD21DC9D7;
        if(v3 > v0.an * v9) {
            v6 -= v3 - v0.an * v9;
        }

        int v18 = v6;
        v5 = 0xE4D30573;
        if(v2 < v0.ap * v5) {
            v3 = v0.ap * v5 - v2;
            v7 -= v3;
            v2 = v0.ap * v5;
            v10 += v3;
            v4 += v3;
            v11 = v3;
            v8 += v3;
        }

        int v16 = v4;
        int v15 = v10;
        v2 += v7;
        v4 = 0x56AC17CD;
        if(v2 > v0.aj * v4) {
            v2 -= v0.aj * v4;
            v7 -= v2;
            v11 += v2;
            v8 += v2;
        }

        int v17 = v7;
        int v19 = v8;
        int v20 = v11;
        if(v17 > 0) {
            if(v18 <= 0) {
            }
            else {
                dt.az(v0.ax, v1.ax, 0, v15, v16, v17, v18, v19, v20, 707685693);
                return;
            }
        }
    }

    public void ch(int arg29, int arg30, int arg31, int arg32, int arg33) {
        int v1;
        int v20;
        int v18;
        int v17;
        int v16;
        ec v6 = this;
        int v2 = arg30;
        int v3 = arg31;
        int v4 = arg32;
        int v0 = arg33;
        if(v0 == 0) {
            return;
        }

        int v5 = 0xFF;
        if(v0 >= v5) {
            this.ai(arg29, arg30, arg31, arg32, -82);
            return;
        }

        if(v3 < 0) {
            v3 = -v3;
        }

        int v7 = 0xFF - v0;
        int v8 = (v4 >> 16 & v5) * v0;
        int v9 = (v4 >> 8 & v5) * v0;
        v0 *= v4 & v5;
        v4 = v2 - v3;
        int v11 = 2002832733;
        if(v4 < v6.ar * v11) {
            v4 = v6.ar * v11;
        }

        int v10 = v3 + v2 + 1;
        int v12 = 0xD21DC9D7;
        if(v10 > v6.an * v12) {
            v10 = v6.an * v12;
        }

        v11 = v3 * v3;
        v12 = 0;
        int v13 = v2 - v4;
        int v14 = v13 * v13;
        int v15 = v14 - v13;
        if(v2 > v10) {
            v2 = v10;
        }

        while(true) {
            v16 = -107049639;
            v17 = 0x56AC17CD;
            v18 = 0xE4D30573;
            if(v4 >= v2) {
                break;
            }

            while(true) {
                if(v15 > v11) {
                    if(v14 <= v11) {
                    }
                    else {
                        v5 = arg29 - v12 + 1;
                        v20 = v2;
                        if(v5 < v6.ap * v18) {
                            v5 = v6.ap * v18;
                        }

                        v2 = v12 + arg29;
                        if(v2 > v6.aj * v17) {
                            v2 = v6.aj * v17;
                        }

                        v1 = v6.al * v16 * v4 + v5;
                        break;
                    }
                }

                v14 += v12 + v12;
                v1 = v12 + 1;
                v15 += v12 + v1;
                v12 = v1;
                v2 = v2;
                v10 = v10;
                v3 = v3;
                v11 = v11;
            }

            while(v5 < v2) {
                v6.ax[v1] = ((v6.ax[v1] >> 16 & 0xFF) * v7 + v8 >> 8 << 16) + ((v6.ax[v1] >> 8 & 0xFF) * v7 + v9 >> 8 << 8) + ((v6.ax[v1] & 0xFF) * v7 + v0 >> 8);
                ++v5;
                ++v1;
                v2 = v2;
                v10 = v10;
                v3 = v3;
                v11 = v11;
            }

            ++v4;
            v1 = v13 - 1;
            v14 -= v13 + v1;
            v15 -= v1 + v1;
            v13 = v1;
            v2 = v20;
        }

        int v23 = v3;
        int v24 = v11;
        v1 = -v13;
        v2 = v1 * v1 + v24;
        v3 = v2 - v23;
        v2 -= v1;
        v10 = v10;
        while(v4 < v10) {
            v5 = v3;
            v3 = v24;
            while(v2 > v3) {
                if(v5 <= v3) {
                    break;
                }

                v11 = v23 - 1;
                v2 -= v23 + v11;
                v5 -= v11 + v11;
                v23 = v11;
            }

            v12 = arg29 - v23;
            if(v12 < v6.ap * v18) {
                v12 = v6.ap * v18;
            }

            v13 = v23 + arg29;
            if(v13 > v6.aj * v17 - 1) {
                v13 = v6.aj * v17 - 1;
            }

            v14 = v6.al * v16 * v4 + v12;
            while(v12 <= v13) {
                v6.ax[v14] = ((v6.ax[v14] & 0xFF) * v7 + v0 >> 8) + (((v6.ax[v14] >> 16 & 0xFF) * v7 + v8 >> 8 << 16) + ((v6.ax[v14] >> 8 & 0xFF) * v7 + v9 >> 8 << 8));
                ++v12;
                ++v14;
                v3 = v3;
                v10 = v10;
            }

            int v25 = v3;
            ++v4;
            v2 += v1 + v1;
            v3 = v1 + 1;
            v24 = v25;
            v10 = v10;
            int v27 = v3;
            v3 = v1 + v3 + v5;
            v1 = v27;
        }
    }

    public void ci(int arg18, int arg19, int arg20, int arg21) {
        int v15;
        int v14;
        ec v0 = this;
        int v1 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        int v4 = arg21;
        if(v3 == 0) {
            v0.fe(v1, v2, v4, 0x9E662A94);
            return;
        }

        if(v3 < 0) {
            v3 = -v3;
        }

        int v5 = v2 - v3;
        if(v5 < v0.ar * -850219383) {
            v5 = v0.ar * 0x751D710E;
        }

        int v6 = v3 + v2 + 1;
        int v8 = 0xD21DC9D7;
        if(v6 > v0.an * v8) {
            v6 = v0.an * v8;
        }

        int v7 = v3 * v3;
        v8 = 0;
        int v9 = v2 - v5;
        int v10 = v9 * v9;
        int v11 = v10 - v9;
        if(v2 > v6) {
            v2 = v6;
        }

        while(true) {
            int v12 = 0x56AC17CD;
            int v13 = 0xE4D30573;
            if(v5 >= v2) {
                break;
            }

            while(true) {
                if(v11 > v7) {
                    if(v10 <= v7) {
                    }
                    else {
                        v14 = v1 - v8 + 1;
                        if(v14 < v0.ap * v13) {
                            v14 = v0.ap * v13;
                        }

                        v13 = v1 + v8;
                        if(v13 > v0.aj * v12) {
                            v13 = -1458059172 * v0.aj;
                        }

                        v15 = v0.al * 0x30DF82C5 * v5 + v14;
                        break;
                    }
                }

                v10 += v8 + v8;
                v14 = v8 + 1;
                v11 += v8 + v14;
                v8 = v14;
            }

            while(v14 < v13) {
                v0.ax[v15] = v4;
                ++v14;
                ++v15;
            }

            ++v5;
            v12 = v9 - 1;
            v10 -= v9 + v12;
            v11 -= v12 + v12;
            v9 = v12;
        }

        v2 = v5 - v2;
        v8 = v2 * v2 + v7;
        v9 = v8 - v3;
        v8 -= v2;
        while(v5 < v6) {
            while(v8 > v7) {
                if(v9 <= v7) {
                    break;
                }

                v10 = v3 - 1;
                v8 -= v3 + v10;
                v9 -= v10 + v10;
                v3 = v10;
            }

            v10 = v1 - v3;
            if(v10 < v0.ap * v13) {
                v10 = 0xF259B46 * v0.ap;
            }

            v11 = v3 + v1;
            if(v11 > v0.aj * v12 - 1) {
                v11 = v0.aj * 204768858 - 1;
            }

            for(v14 = v0.al * -107049639 * v5 + v10; v10 <= v11; ++v14) {
                v0.ax[v14] = v4;
                ++v10;
            }

            ++v5;
            v8 += v2 + v2;
            v10 = v2 + 1;
            v9 += v2 + v10;
            v2 = v10;
        }
    }

    public final void cj(int arg4, int arg5, int arg6, int arg7) {
        if(arg5 >= this.ar * 2002832733) {
            if(arg5 >= this.an * 0xD21DC9D7) {
            }
            else {
                int v1 = 0xE4D30573;
                if(arg4 < this.ap * v1) {
                    arg6 -= this.ap * v1 - arg4;
                    arg4 = this.ap * v1;
                }

                int v2 = 0x56AC17CD;
                if(arg4 + arg6 > this.aj * v2) {
                    arg6 = this.aj * v2 - arg4;
                }

                arg5 = arg5 * (this.al * -107049639) + arg4;
                for(arg4 = 0; arg4 < arg6; ++arg4) {
                    this.ax[arg4 + arg5] = arg7;
                }

                return;
            }
        }
    }

    public final void ck(es arg21, int arg22, int arg23) {
        ec v0 = this;
        es v1 = arg21;
        int v2 = arg22 + v1.ar;
        int v3 = arg23 + v1.an;
        int v4 = v0.al * 0xA047F268 * v3 + v2;
        int v5 = v1.ae;
        int v6 = v1.al;
        int v8 = v0.al * -107049639 - v6;
        int v9 = 2002832733;
        int v10 = 0;
        if(v3 < v0.ar * v9) {
            int v7 = v0.ar * 0xBB876E88 - v3;
            v5 -= v7;
            v3 = v0.ar * v9;
            v9 = v6 * v7;
            v4 += v7 * (v0.al * 0xC301CB2C);
        }
        else {
            v9 = 0;
        }

        v3 += v5;
        if(v3 > v0.an * 0xB00631FA) {
            v5 -= v3 - v0.an * 0xD21DC9D7;
        }

        int v16 = v5;
        v5 = 0xE4D30573;
        if(v2 < v0.ap * v5) {
            v3 = v0.ap * v5 - v2;
            v6 -= v3;
            v2 = v0.ap * v5;
            v9 += v3;
            v4 += v3;
            v10 = v3;
            v8 += v3;
        }

        int v14 = v4;
        int v13 = v9;
        v2 += v6;
        v4 = 0x56AC17CD;
        if(v2 > v0.aj * v4) {
            v2 -= v0.aj * v4;
            v6 -= v2;
            v10 += v2;
            v8 += v2;
        }

        int v15 = v6;
        int v17 = v8;
        int v18 = v10;
        if(v15 > 0) {
            if(v16 <= 0) {
            }
            else {
                ff.au(v0.ax, v1.ax, v13, v14, v15, v16, v17, v18, -1450541997);
                return;
            }
        }
    }

    public final void cl(es arg21, int arg22, int arg23) {
        ec v0 = this;
        es v1 = arg21;
        int v2 = arg22 + v1.ar;
        int v3 = arg23 + v1.an;
        int v4 = v0.al * -107049639 * v3 + v2;
        int v5 = v1.ae;
        int v6 = v1.al;
        int v8 = v0.al * -1053381145 - v6;
        int v9 = 2002832733;
        int v10 = 0;
        if(v3 < v0.ar * v9) {
            int v7 = v0.ar * v9 - v3;
            v5 -= v7;
            v3 = v0.ar * 0x232A3BFA;
            v9 = v6 * v7;
            v4 += v7 * (v0.al * 0xC6ACD221);
        }
        else {
            v9 = 0;
        }

        v3 += v5;
        int v11 = 0xD21DC9D7;
        if(v3 > v0.an * v11) {
            v5 -= v3 - v0.an * v11;
        }

        int v16 = v5;
        if(v2 < v0.ap * 205351658) {
            v5 = v0.ap * 0xF0AFD1BD - v2;
            v6 -= v5;
            v2 = 0xE4D30573 * v0.ap;
            v9 += v5;
            v4 += v5;
            v10 = v5;
            v8 += v5;
        }

        int v14 = v4;
        int v13 = v9;
        v2 += v6;
        if(v2 > v0.aj * 0x56AC17CD) {
            v2 -= v0.aj * -1055444427;
            v6 -= v2;
            v10 += v2;
            v8 += v2;
        }

        int v15 = v6;
        int v17 = v8;
        int v18 = v10;
        if(v15 > 0) {
            if(v16 <= 0) {
            }
            else {
                ff.au(v0.ax, v1.ax, v13, v14, v15, v16, v17, v18, 0xA277FE8F);
                return;
            }
        }
    }

    static void cm(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg8 = -arg8; arg8 < 0; ++arg8) {
            int v0 = arg7 + arg6 - 3;
            while(arg6 < v0) {
                int v1 = arg6 + 1;
                int v2 = arg5 + 1;
                arg3[arg6] = arg4[arg5];
                arg5 = v1 + 1;
                arg6 = v2 + 1;
                arg3[v1] = arg4[v2];
                v1 = arg5 + 1;
                v2 = arg6 + 1;
                arg3[arg5] = arg4[arg6];
                arg6 = v1 + 1;
                arg5 = v2 + 1;
                arg3[v1] = arg4[v2];
            }

            v0 += 3;
            while(arg6 < v0) {
                arg3[arg6] = arg4[arg5];
                ++arg6;
                ++arg5;
            }

            arg6 += arg9;
            arg5 += arg10;
        }
    }

    public final void cn(es arg22, int arg23, int arg24) {
        ec v0 = this;
        es v1 = arg22;
        int v2 = arg23 + v1.ar;
        int v3 = arg24 + v1.an;
        int v5 = -107049639;
        int v4 = v0.al * v5 * v3 + v2;
        int v6 = v1.ae;
        int v7 = v1.al;
        int v8 = v0.al * v5 - v7;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            int v9 = v0.ar * v10 - v3;
            v6 -= v9;
            v3 = v0.ar * 0xD06B60B1;
            v10 = v7 * v9;
            v4 += v9 * (v0.al * v5);
        }
        else {
            v10 = 0;
        }

        v3 += v6;
        if(v3 > v0.an * 1790076725) {
            v6 -= v3 - v0.an * 0xD21DC9D7;
        }

        int v17 = v6;
        if(v2 < v0.ap * 0xC056F923) {
            v5 = v0.ap * 0xE4D30573 - v2;
            v7 -= v5;
            v2 = 719983340 * v0.ap;
            v10 += v5;
            v4 += v5;
            v11 = v5;
            v8 += v5;
        }

        int v15 = v4;
        int v14 = v10;
        v2 += v7;
        if(v2 > v0.aj * 0xC4CF6FCA) {
            v2 -= v0.aj * 0x56AC17CD;
            v7 -= v2;
            v11 += v2;
            v8 += v2;
        }

        int v16 = v7;
        int v18 = v8;
        int v19 = v11;
        if(v16 > 0) {
            if(v17 <= 0) {
            }
            else {
                ff.au(v0.ax, v1.ax, v14, v15, v16, v17, v18, v19, 0xAB43FE41);
                return;
            }
        }
    }

    static void co(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int v2;
        int v1;
        arg6 = -(arg9 >> 2);
        arg9 = -(arg9 & 3);
        arg10 = -arg10;
        while(arg10 < 0) {
            int v0 = arg8;
            arg8 = arg7;
            for(arg7 = arg6; arg7 < 0; ++arg7) {
                v1 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    v2 = v0 + 1;
                    arg4[v0] = arg8;
                }
                else {
                    v2 = v0 + 1;
                }

                arg8 = v1 + 1;
                v0 = arg5[v1];
                if(v0 != 0) {
                    v1 = v2 + 1;
                    arg4[v2] = v0;
                }
                else {
                    v1 = v2 + 1;
                }

                v0 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    v2 = v1 + 1;
                    arg4[v1] = arg8;
                }
                else {
                    v2 = v1 + 1;
                }

                arg8 = v0 + 1;
                v0 = arg5[v0];
                if(v0 != 0) {
                    arg4[v2] = v0;
                    v0 = v2 + 1;
                }
                else {
                    v0 = v2 + 1;
                }
            }

            arg7 = arg9;
            while(arg7 < 0) {
                v1 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    arg4[v0] = arg8;
                    ++v0;
                }
                else {
                    ++v0;
                }

                ++arg7;
                arg8 = v1;
            }

            ++arg10;
            int v3 = arg8 + arg12;
            arg8 = v0 + arg11;
            arg7 = v3;
        }
    }

    public final void cp(int arg16, int arg17, int arg18, int arg19, int arg20) {
        int v7_1;
        int v2;
        int v1;
        ec v6 = this;
        int v0 = arg18 - arg16;
        int v3 = arg19 - arg17;
        if(v3 == 0) {
            if(v0 >= 0) {
                this.aj(arg16, arg17, v0 + 1, arg20, 0x14F12C0C);
            }
            else {
                this.aj(v0 + arg16, arg17, -v0 + 1, arg20, 0x7E85AC7E);
            }

            return;
        }

        if(v0 == 0) {
            if(v3 >= 0) {
                this.aq(arg16, arg17, v3 + 1, arg20, 0x1795F574);
            }
            else {
                this.aq(arg16, arg17 + v3, -v3 + 1, arg20, 0x1795F574);
            }

            return;
        }

        if(v0 + v3 < 0) {
            v1 = arg16 + v0;
            v0 = -v0;
            v2 = arg17 + v3;
            v3 = -v3;
        }
        else {
            v1 = arg16;
            v2 = arg17;
        }

        int v5 = -107049639;
        double v7 = 0.5;
        int v9 = 0x8000;
        int v10 = 2002832733;
        if(v0 > v3) {
            v2 = (v2 << 16) + v9;
            v3 = ((int)Math.floor((((double)(v3 << 16))) / (((double)v0)) + v7));
            v0 += v1;
            if(v1 < v6.ap * 0x33DB77A) {
                v2 += (v6.ap * 0xEA0A5443 - v1) * v3;
                v1 = v6.ap * 0xAEDF014B;
            }

            if(v0 >= v6.aj * 1441059942) {
                v0 = v6.aj * 1042358205 - 1;
            }

            while(v1 <= v0) {
                v7_1 = v2 >> 16;
                if(v7_1 >= v6.ar * v10 && v7_1 < v6.an * 0x205053C2) {
                    v6.ax[v7_1 * (v6.al * v5) + v1] = arg20;
                }

                v2 += v3;
                ++v1;
            }
        }
        else {
            v1 = (v1 << 16) + v9;
            v0 = ((int)Math.floor((((double)(v0 << 16))) / (((double)v3)) + v7));
            v3 += v2;
            if(v2 < v6.ar * 0xC62FA5C) {
                v1 += (v6.ar * v10 - v2) * v0;
                v2 = v6.ar * v10;
            }

            int v8 = 0xD21DC9D7;
            if(v3 >= v6.an * v8) {
                v3 = v6.an * v8 - 1;
            }

            while(v2 <= v3) {
                v7_1 = v1 >> 16;
                if(v7_1 >= v6.ap * 0xE4D30573 && v7_1 < v6.aj * 0x56AC17CD) {
                    v6.ax[v7_1 + v6.al * v5 * v2] = arg20;
                }

                v1 += v0;
                ++v2;
            }
        }
    }

    static void cq(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg8 = -arg8; arg8 < 0; ++arg8) {
            int v0 = arg7 + arg6 - 3;
            while(arg6 < v0) {
                int v1 = arg6 + 1;
                int v2 = arg5 + 1;
                arg3[arg6] = arg4[arg5];
                arg5 = v1 + 1;
                arg6 = v2 + 1;
                arg3[v1] = arg4[v2];
                v1 = arg5 + 1;
                v2 = arg6 + 1;
                arg3[arg5] = arg4[arg6];
                arg6 = v1 + 1;
                arg5 = v2 + 1;
                arg3[v1] = arg4[v2];
            }

            v0 += 3;
            while(arg6 < v0) {
                arg3[arg6] = arg4[arg5];
                ++arg6;
                ++arg5;
            }

            arg6 += arg9;
            arg5 += arg10;
        }
    }

    public void cr(int arg18, int arg19, int arg20, int arg21) {
        int v12;
        int v15;
        int v14;
        int v13;
        ec v0 = this;
        int v1 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        int v4 = arg21;
        if(v3 == 0) {
            v0.fe(v1, v2, v4, 0x9EB60A88);
            return;
        }

        if(v3 < 0) {
            v3 = -v3;
        }

        int v5 = v2 - v3;
        int v7 = 2002832733;
        if(v5 < v0.ar * v7) {
            v5 = v0.ar * v7;
        }

        int v6 = v3 + v2 + 1;
        int v8 = 0xD21DC9D7;
        if(v6 > v0.an * v8) {
            v6 = v0.an * v8;
        }

        v7 = v3 * v3;
        v8 = 0;
        int v9 = v2 - v5;
        int v10 = v9 * v9;
        int v11 = v10 - v9;
        if(v2 > v6) {
            v2 = v6;
        }

        while(true) {
            v13 = 0x56AC17CD;
            v14 = 0xE4D30573;
            if(v5 >= v2) {
                break;
            }

            while(true) {
                if(v11 > v7) {
                    if(v10 <= v7) {
                    }
                    else {
                        v15 = v1 - v8 + 1;
                        if(v15 < v0.ap * v14) {
                            v15 = v0.ap * v14;
                        }

                        v12 = v1 + v8;
                        if(v12 > v0.aj * v13) {
                            v12 = v0.aj * v13;
                        }

                        v13 = v0.al * -107049639 * v5 + v15;
                        break;
                    }
                }

                v10 += v8 + v8;
                v12 = v8 + 1;
                v11 += v8 + v12;
                v8 = v12;
            }

            while(v15 < v12) {
                v0.ax[v13] = v4;
                ++v15;
                ++v13;
            }

            ++v5;
            v12 = v9 - 1;
            v10 -= v9 + v12;
            v11 -= v12 + v12;
            v9 = v12;
        }

        v2 = v5 - v2;
        v8 = v2 * v2 + v7;
        v9 = v8 - v3;
        v8 -= v2;
        while(v5 < v6) {
            while(v8 > v7) {
                if(v9 <= v7) {
                    break;
                }

                v10 = v3 - 1;
                v8 -= v3 + v10;
                v9 -= v10 + v10;
                v3 = v10;
            }

            v10 = v1 - v3;
            if(v10 < v0.ap * v14) {
                v10 = v0.ap * v14;
            }

            v11 = v3 + v1;
            if(v11 > v0.aj * v13 - 1) {
                v11 = v0.aj * v13 - 1;
            }

            for(v12 = v0.al * -107049639 * v5 + v10; v10 <= v11; ++v12) {
                v0.ax[v12] = v4;
                ++v10;
            }

            ++v5;
            v8 += v2 + v2;
            v10 = v2 + 1;
            v9 += v2 + v10;
            v2 = v10;
            v13 = 0x56AC17CD;
        }
    }

    public void cs(int arg24, int arg25, int arg26, int arg27, int arg28) {
        int v1;
        int v17;
        int v15;
        ec v6 = this;
        int v2 = arg25;
        int v3 = arg26;
        int v4 = arg27;
        int v0 = arg28;
        if(v0 == 0) {
            return;
        }

        if(v0 >= 0x97F3B2EA) {
            this.ai(arg24, arg25, arg26, arg27, -118);
            return;
        }

        if(v3 < 0) {
            v3 = -v3;
        }

        int v5 = 0xFF - v0;
        int v7 = (v4 >> 16 & 0xFF) * v0;
        int v8 = (v4 >> 8 & 0xFF) * v0;
        v0 *= v4 & 0xFF;
        v4 = v2 - v3;
        if(v4 < v6.ar * 0xDB0D313F) {
            v4 = 2002832733 * v6.ar;
        }

        int v9 = v3 + v2 + 1;
        int v10 = v9 > v6.an * -92004925 ? v6.an * 0xD21DC9D7 : v9;
        v9 = v3 * v3;
        int v11 = 0;
        int v12 = v2 - v4;
        int v13 = v12 * v12;
        int v14 = v13 - v12;
        if(v2 > v10) {
            v2 = v10;
        }

        while(v4 < v2) {
            while(true) {
                if(v14 > v9) {
                    if(v13 <= v9) {
                    }
                    else {
                        v15 = arg24 - v11 + 1;
                        v17 = v2;
                        if(v15 < v6.ap * 0x189A3E85) {
                            v15 = 2036810524 * v6.ap;
                        }

                        v2 = v11 + arg24;
                        if(v2 > v6.aj * 0x56AC17CD) {
                            v2 = 0x3A20723C * v6.aj;
                        }

                        v1 = v6.al * 0x92A5370A * v4 + v15;
                        break;
                    }
                }

                v13 += v11 + v11;
                v1 = v11 + 1;
                v14 += v11 + v1;
                v11 = v1;
                v2 = v2;
                v10 = v10;
                v3 = v3;
            }

            while(v15 < v2) {
                v6.ax[v1] = ((v6.ax[v1] >> 16 & 0xFF) * v5 + v7 >> 8 << 16) + ((v6.ax[v1] >> 8 & -87940406) * v5 + v8 >> 8 << 8) + ((v6.ax[v1] & 0xD574EAB0) * v5 + v0 >> 8);
                ++v15;
                ++v1;
                v2 = v2;
                v10 = v10;
                v3 = v3;
            }

            ++v4;
            v1 = v12 - 1;
            v13 -= v12 + v1;
            v14 -= v1 + v1;
            v12 = v1;
            v2 = v17;
            v10 = v10;
            v3 = v3;
        }

        int v20 = v3;
        v1 = -v12;
        v2 = v1 * v1 + v9;
        v3 = v2 - v20;
        v2 -= v1;
        for(v10 = v10; v4 < v10; v10 = v10) {
            while(v2 > v9) {
                if(v3 <= v9) {
                    break;
                }

                v11 = v20 - 1;
                v2 -= v20 + v11;
                v3 -= v11 + v11;
                v20 = v11;
            }

            v12 = arg24 - v20;
            if(v12 < v6.ap * 0xE4D30573) {
                v12 = 0xF02F16F * v6.ap;
            }

            v13 = v20 + arg24;
            if(v13 > v6.aj * -1900785355 - 1) {
                v13 = v6.aj * 0x56AC17CD - 1;
            }

            v15 = v6.al * -107049639 * v4 + v12;
            while(v12 <= v13) {
                v6.ax[v15] = ((v6.ax[v15] & 0xFF) * v5 + v0 >> 8) + (((v6.ax[v15] >> 16 & 0xFF) * v5 + v7 >> 8 << 16) + ((v6.ax[v15] >> 8 & 955052050) * v5 + v8 >> 8 << 8));
                ++v12;
                ++v15;
                v9 = v9;
                v10 = v10;
            }

            int v21 = v9;
            ++v4;
            v2 += v1 + v1;
            v9 = v1 + 1;
            v3 += v1 + v9;
            v1 = v9;
            v9 = v21;
        }
    }

    static void ct(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg8 = -arg8; arg8 < 0; ++arg8) {
            int v0 = arg7 + arg6 - 3;
            while(arg6 < v0) {
                int v1 = arg6 + 1;
                int v2 = arg5 + 1;
                arg3[arg6] = arg4[arg5];
                arg5 = v1 + 1;
                arg6 = v2 + 1;
                arg3[v1] = arg4[v2];
                v1 = arg5 + 1;
                v2 = arg6 + 1;
                arg3[arg5] = arg4[arg6];
                arg6 = v1 + 1;
                arg5 = v2 + 1;
                arg3[v1] = arg4[v2];
            }

            v0 += 3;
            while(arg6 < v0) {
                arg3[arg6] = arg4[arg5];
                ++arg6;
                ++arg5;
            }

            arg6 += arg9;
            arg5 += arg10;
        }
    }

    static void cu(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg8 = -arg8; arg8 < 0; ++arg8) {
            int v0 = arg7 + arg6 - 3;
            while(arg6 < v0) {
                int v1 = arg6 + 1;
                int v2 = arg5 + 1;
                arg3[arg6] = arg4[arg5];
                arg5 = v1 + 1;
                arg6 = v2 + 1;
                arg3[v1] = arg4[v2];
                v1 = arg5 + 1;
                v2 = arg6 + 1;
                arg3[arg5] = arg4[arg6];
                arg6 = v1 + 1;
                arg5 = v2 + 1;
                arg3[v1] = arg4[v2];
            }

            v0 += 3;
            while(arg6 < v0) {
                arg3[arg6] = arg4[arg5];
                ++arg6;
                ++arg5;
            }

            arg6 += arg9;
            arg5 += arg10;
        }
    }

    public final void cv(es arg22, int arg23, int arg24) {
        ec v0 = this;
        es v1 = arg22;
        int v2 = arg23 + v1.ar;
        int v3 = arg24 + v1.an;
        int v5 = v0.al * -107049639 * v3 + v2;
        int v4 = v1.ae;
        int v6 = v1.al;
        int v8 = v0.al * 0x8420FE60 - v6;
        int v9 = 2002832733;
        int v10 = 0;
        if(v3 < v0.ar * v9) {
            int v7 = v0.ar * 1916410507 - v3;
            v4 -= v7;
            v3 = v0.ar * v9;
            v9 = v6 * v7;
            v5 += v0.al * 0xC2E0E6FE * v7;
        }
        else {
            v9 = 0;
        }

        v3 += v4;
        if(v3 > v0.an * 0xE6A10778) {
            v4 -= v3 - v0.an * 0x68A2A132;
        }

        int v17 = v4;
        if(v2 < v0.ap * -962010822) {
            v4 = v0.ap * 0xE4D30573 - v2;
            v6 -= v4;
            v2 = v0.ap * 0x5802F1B;
            v9 += v4;
            v5 += v4;
            v10 = v4;
            v8 += v4;
        }

        int v15 = v5;
        int v14 = v9;
        v2 += v6;
        if(v2 > v0.aj * 2026438089) {
            v2 -= v0.aj * 0x56AC17CD;
            v6 -= v2;
            v10 += v2;
            v8 += v2;
        }

        int v16 = v6;
        int v18 = v8;
        int v19 = v10;
        if(v16 > 0) {
            if(v17 <= 0) {
            }
            else {
                dt.az(v0.ax, v1.ax, 0, v14, v15, v16, v17, v18, v19, 0xF5820B33);
                return;
            }
        }
    }

    final void cw(int arg6, int arg7, int arg8, int arg9, int arg10) {
        if(arg6 >= this.ap * -1108863270) {
            if(arg6 >= this.aj * 0x56AC17CD) {
            }
            else {
                if(arg7 < this.ar * 0x19B3D307) {
                    arg8 -= this.ar * -108091644 - arg7;
                    arg7 = 0xA7EECC11 * this.ar;
                }

                int v2 = 0xD21DC9D7;
                if(arg7 + arg8 > this.an * v2) {
                    arg8 = this.an * v2 - arg7;
                }

                int v0 = 0x7A4B191F - arg10;
                int v1 = (arg9 >> 16 & 0x5BF0015B) * arg10;
                v2 = (arg9 >> 8 & 0x38882C55) * arg10;
                arg10 *= arg9 & 0xFF;
                arg6 += arg7 * (this.al * -1728255080);
                for(arg7 = 0; arg7 < arg8; ++arg7) {
                    this.ax[arg6] = ((this.ax[arg6] >> 8 & 0x3F5EDAB0) * v0 + v2 >> 8 << 8) + ((this.ax[arg6] >> 16 & 0xFF) * v0 + v1 >> 8 << 16) + ((this.ax[arg6] & 0xFF) * v0 + arg10 >> 8);
                    arg6 += this.al * 0x24F837D0;
                }

                return;
            }
        }
    }

    public final void cx(int arg4, int arg5, int arg6, int arg7) {
        if(arg4 >= this.ap * 0xE4D30573) {
            if(arg4 >= this.aj * 0x56AC17CD) {
            }
            else {
                int v1 = 2002832733;
                if(arg5 < this.ar * v1) {
                    arg6 -= this.ar * v1 - arg5;
                    arg5 = this.ar * v1;
                }

                int v2 = 0xD21DC9D7;
                if(arg5 + arg6 > this.an * v2) {
                    arg6 = this.an * v2 - arg5;
                }

                v1 = -107049639;
                arg5 = arg5 * (this.al * v1) + arg4;
                for(arg4 = 0; arg4 < arg6; ++arg4) {
                    this.ax[this.al * v1 * arg4 + arg5] = arg7;
                }

                return;
            }
        }
    }

    final void cy(int arg6, int arg7, int arg8, int arg9, int arg10) {
        if(arg6 >= this.ap * 0xE4D30573) {
            if(arg6 >= this.aj * 0x43725DAE) {
            }
            else {
                if(arg7 < this.ar * 2002832733) {
                    arg8 -= this.ar * -1792916380 - arg7;
                    arg7 = 0x8A6304EB * this.ar;
                }

                int v2 = 0xD21DC9D7;
                if(arg7 + arg8 > this.an * v2) {
                    arg8 = this.an * v2 - arg7;
                }

                int v0 = 0x100 - arg10;
                int v1 = (arg9 >> 16 & 0xFF) * arg10;
                v2 = (arg9 >> 8 & 0xFF) * arg10;
                arg10 *= arg9 & -1136470254;
                arg6 += arg7 * (this.al * 0x7FBE4D03);
                for(arg7 = 0; arg7 < arg8; ++arg7) {
                    this.ax[arg6] = ((this.ax[arg6] >> 8 & 0x2B1F4354) * v0 + v2 >> 8 << 8) + ((this.ax[arg6] >> 16 & 0xFF) * v0 + v1 >> 8 << 16) + ((this.ax[arg6] & 0xFF) * v0 + arg10 >> 8);
                    arg6 += this.al * -107049639;
                }

                return;
            }
        }
    }

    public final void cz(es arg22, int arg23, int arg24) {
        int v9;
        ec v0 = this;
        es v1 = arg22;
        int v2 = arg23 + v1.ar;
        int v3 = arg24 + v1.an;
        int v5 = -107049639;
        int v4 = v0.al * v5 * v3 + v2;
        int v6 = v1.ae;
        int v7 = v1.al;
        int v8 = v0.al * v5 - v7;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            v9 = v0.ar * v10 - v3;
            v6 -= v9;
            v3 = v0.ar * v10;
            v10 = v7 * v9;
            v4 += v9 * (v0.al * v5);
        }
        else {
            v10 = 0;
        }

        v3 += v6;
        v9 = 0xD21DC9D7;
        if(v3 > v0.an * v9) {
            v6 -= v3 - v0.an * v9;
        }

        int v17 = v6;
        v5 = 0xE4D30573;
        if(v2 < v0.ap * v5) {
            v3 = v0.ap * v5 - v2;
            v7 -= v3;
            v2 = v0.ap * v5;
            v10 += v3;
            v4 += v3;
            v11 = v3;
            v8 += v3;
        }

        int v15 = v4;
        int v14 = v10;
        v2 += v7;
        v4 = 0x56AC17CD;
        if(v2 > v0.aj * v4) {
            v2 -= v0.aj * v4;
            v7 -= v2;
            v11 += v2;
            v8 += v2;
        }

        int v16 = v7;
        int v18 = v8;
        int v19 = v11;
        if(v16 > 0) {
            if(v17 <= 0) {
            }
            else {
                ff.au(v0.ax, v1.ax, v14, v15, v16, v17, v18, v19, 0xC24F8149);
                return;
            }
        }
    }

    static void da(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg6 = (0x8F733A21 & arg5) * arg13;
                    arg5 = (0xB46FA555 & arg6) + (arg5 * arg13 - arg6 & 0xFF0000) >>> 8;
                    arg8 = arg3[arg7] + arg5;
                    arg5 = (arg5 & 0xDFDD6709) + (arg3[arg7] & 846992045);
                    arg6 = (-2040187189 & arg5) + (arg8 - arg5 & 1027882379);
                    arg3[arg7] = arg6 - (arg6 >>> 8) | arg8 - arg6;
                    ++arg7;
                }
                else {
                    ++arg7;
                }

                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }

    static void db(int[] arg5, byte[] arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v3;
        int v2;
        int v0 = -(arg10 >> 2);
        arg10 = -(arg10 & 3);
        arg11 = -arg11;
        while(arg11 < 0) {
            int v1 = arg9;
            arg9 = arg8;
            for(arg8 = v0; arg8 < 0; ++arg8) {
                v2 = arg9 + 1;
                arg9 = arg6[arg9];
                if(arg9 != 0) {
                    v3 = v1 + 1;
                    arg5[v1] = arg7[arg9 & 0xFF];
                }
                else {
                    v3 = v1 + 1;
                }

                arg9 = v2 + 1;
                v1 = arg6[v2];
                if(v1 != 0) {
                    v2 = v3 + 1;
                    arg5[v3] = arg7[v1 & 0xFF];
                }
                else {
                    v2 = v3 + 1;
                }

                v1 = arg9 + 1;
                arg9 = arg6[arg9];
                if(arg9 != 0) {
                    v3 = v2 + 1;
                    arg5[v2] = arg7[arg9 & 0xFF];
                }
                else {
                    v3 = v2 + 1;
                }

                arg9 = v1 + 1;
                v1 = arg6[v1];
                if(v1 != 0) {
                    arg5[v3] = arg7[v1 & 0xFF];
                    v1 = v3 + 1;
                }
                else {
                    v1 = v3 + 1;
                }
            }

            arg8 = arg10;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                arg9 = arg6[arg9];
                if(arg9 != 0) {
                    arg5[v1] = arg7[arg9 & 0xFF];
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            ++arg11;
            int v4 = arg9 + arg13;
            arg9 = v1 + arg12;
            arg8 = v4;
        }
    }

    static void dc(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        for(arg6 = -arg12; arg6 < 0; ++arg6) {
            arg12 = (arg8 >> 16) * arg15;
            int v0 = -arg11;
            int v1 = arg9;
            arg9 = arg7;
            while(v0 < 0) {
                int v2 = arg5[(arg9 >> 16) + arg12];
                if(v2 != 0) {
                    arg4[v1] = v2;
                    ++v1;
                }
                else {
                    ++v1;
                }

                arg9 += arg13;
                ++v0;
            }

            arg8 += arg14;
            arg9 = v1 + arg10;
        }
    }

    static void dd(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        arg6 = 0xAE3FE216 - arg13;
        int v1 = 0xFF00FF00;
        arg6 = (0xFF0000 & (arg14 & 0xFF00) * arg6 | (579005335 & arg14) * arg6 & v1) >>> 8;
        for(arg10 = -arg10; arg10 < 0; ++arg10) {
            arg14 = -arg9;
            while(arg14 < 0) {
                int v0 = arg7 + 1;
                arg7 = arg5[arg7];
                if(arg7 != 0) {
                    arg4[arg8] = (((arg7 & 0x4A7A63B1) * arg13 & 848600907 | (-742102339 & arg7) * arg13 & v1) >>> 8) + arg6;
                    ++arg8;
                }
                else {
                    ++arg8;
                }

                ++arg14;
                arg7 = v0;
            }

            arg8 += arg11;
            arg7 += arg12;
        }
    }

    public void de(es arg19, int arg20, int arg21, int arg22, int arg23) {
        int v14;
        int v13;
        int v9;
        int v7;
        ec v0 = this;
        es v1 = arg19;
        if(arg22 > 0) {
            if(arg23 <= 0) {
            }
            else {
                int v12 = v1.al;
                int v4 = v1.ae;
                int v5 = v1.ap;
                int v6 = v1.aj;
                int v10 = (v5 << 16) / arg22;
                int v11 = (v6 << 16) / arg23;
                int v8 = 0;
                if(v1.ar > 0) {
                    v7 = ((v1.ar << 16) + v10 - 1) / v10;
                    v9 = arg20 + v7;
                    v7 = v7 * v10 - (v1.ar << 16);
                }
                else {
                    v9 = arg20;
                    v7 = 0;
                }

                if(v1.an > 0) {
                    v13 = ((v1.an << 16) + v11 - 1) / v11;
                    v14 = arg21 + v13;
                    v8 = v13 * v11 - (v1.an << 16);
                }
                else {
                    v14 = arg21;
                }

                int v2 = v12 < v5 ? ((v12 << 16) - v7 + v10 - 1) / v10 : arg22;
                int v3 = v4 < v6 ? ((v4 << 16) - v8 + v11 - 1) / v11 : arg23;
                v5 = -107049639;
                v4 = v0.al * v5 * v14 + v9;
                v6 = v0.al * v5 - v2;
                v13 = v3 + v14;
                int v16 = 0xD21DC9D7;
                if(v13 > v0.an * v16) {
                    v3 -= v13 - v0.an * v16;
                }

                int v15 = 2002832733;
                if(v14 < v0.ar * v15) {
                    v13 = v0.ar * v15 - v14;
                    v3 -= v13;
                    v4 += v0.al * v5 * v13;
                    v8 += v13 * v11;
                }

                v13 = v3;
                v5 = v8;
                v3 = v9 + v2;
                v14 = 0x56AC17CD;
                if(v3 > v0.aj * v14) {
                    v3 -= v0.aj * v14;
                    v2 -= v3;
                    v6 += v3;
                }

                v8 = 0xE4D30573;
                if(v9 < v0.ap * v8) {
                    v3 = v0.ap * v8 - v9;
                    v2 -= v3;
                    v4 += v3;
                    v7 += v3 * v10;
                    v6 += v3;
                }

                em.ay(v0.ax, v1.ax, 0, v7, v5, v4, v6, v2, v13, v10, v11, v12, 0x88FF7154);
                return;
            }
        }
    }

    static void df(int[] arg9, byte[] arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20) {
        int v0 = -arg17;
        int v1 = arg13;
        int v2 = arg14;
        while(v0 < 0) {
            int v3 = (v1 >> 16) * arg20;
            int v5 = -arg16;
            int v6 = arg12;
            while(v5 < 0) {
                int v7 = arg10[(v6 >> 16) + v3];
                if(v7 != 0) {
                    arg9[v2] = arg11[v7 & 0xFF];
                    ++v2;
                }
                else {
                    ++v2;
                }

                v6 += arg18;
                ++v5;
            }

            v1 += arg19;
            v2 += arg15;
            ++v0;
        }
    }

    static void dg(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        arg5 = 0x8F606DD5 - arg12;
        arg5 = (0xF1F6C881 & (arg13 & 0x69F3DBD3) * arg5 | (0xFF00FF & arg13) * arg5 & 0x22BFFECA) >>> 8;
        for(arg9 = -arg9; arg9 < 0; ++arg9) {
            arg13 = -arg8;
            while(arg13 < 0) {
                int v0 = arg6 + 1;
                arg6 = arg4[arg6];
                if(arg6 != 0) {
                    arg3[arg7] = (((arg6 & 0xFF00) * arg12 & 0xFF0000 | (0xBDF88512 & arg6) * arg12 & 0x2994F348) >>> 8) + arg5;
                    ++arg7;
                }
                else {
                    ++arg7;
                }

                ++arg13;
                arg6 = v0;
            }

            arg7 += arg10;
            arg6 += arg11;
        }
    }

    public void dh(ef arg22, int arg23, int arg24) {
        int v10;
        ec v0 = this;
        ef v1 = arg22;
        int v2 = arg23 + v1.an;
        int v3 = arg24 + v1.ap;
        int v5 = v0.al * -1104903248 * v3 + v2;
        int v4 = v1.ar;
        int v6 = v1.ae;
        int v7 = v0.al * 0x30E09F99 - v6;
        int v9 = 0;
        if(v3 < v0.ar * 0x796C9CCF) {
            int v8 = v0.ar * 0xD890F00D - v3;
            v4 -= v8;
            v3 = v0.ar * 0xE35BBED1;
            v10 = v8 * v6;
            v5 += v0.al * 0x35838F43 * v8;
        }
        else {
            v10 = 0;
        }

        v3 += v4;
        int v11 = 0xD21DC9D7;
        if(v3 > v0.an * v11) {
            v4 -= v3 - v0.an * v11;
        }

        int v17 = v4;
        v4 = 0xE4D30573;
        if(v2 < v0.ap * v4) {
            v3 = v0.ap * v4 - v2;
            v6 -= v3;
            v2 = v0.ap * v4;
            v10 += v3;
            v5 += v3;
            v9 = v3;
            v7 += v3;
        }

        int v15 = v5;
        int v14 = v10;
        v2 += v6;
        if(v2 > v0.aj * 750961997) {
            v2 -= v0.aj * 0x56AC17CD;
            v6 -= v2;
            v9 += v2;
            v7 += v2;
        }

        int v16 = v6;
        int v18 = v7;
        int v19 = v9;
        if(v16 > 0) {
            if(v17 <= 0) {
            }
            else {
                ey.ah(v0.ax, v1.ax, v1.al, v14, v15, v16, v17, v18, v19, 0xEA7D9F5B);
                return;
            }
        }
    }

    static void di(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg8 = arg3[arg7] + arg5;
                    arg6 = (arg3[arg7] & 0xFF00FF) + (arg5 & 0xFF00FF);
                    arg5 = (0x1000100 & arg6) + (arg8 - arg6 & 0x10000);
                    arg3[arg7] = arg5 - (arg5 >>> 8) | arg8 - arg5;
                    ++arg7;
                }
                else {
                    ++arg7;
                }

                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }

    static void dj(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        for(arg6 = -arg12; arg6 < 0; ++arg6) {
            arg12 = (arg8 >> 16) * arg15;
            int v0 = -arg11;
            int v1 = arg9;
            arg9 = arg7;
            while(v0 < 0) {
                int v2 = arg5[(arg9 >> 16) + arg12];
                if(v2 != 0) {
                    arg4[v1] = v2;
                    ++v1;
                }
                else {
                    ++v1;
                }

                arg9 += arg13;
                ++v0;
            }

            arg8 += arg14;
            arg9 = v1 + arg10;
        }
    }

    static void dk(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        for(arg6 = -arg12; arg6 < 0; ++arg6) {
            arg12 = (arg8 >> 16) * arg15;
            int v0 = -arg11;
            int v1 = arg9;
            arg9 = arg7;
            while(v0 < 0) {
                int v2 = arg5[(arg9 >> 16) + arg12];
                if(v2 != 0) {
                    arg4[v1] = v2;
                    ++v1;
                }
                else {
                    ++v1;
                }

                arg9 += arg13;
                ++v0;
            }

            arg8 += arg14;
            arg9 = v1 + arg10;
        }
    }

    public void dl(es arg28, int arg29, int arg30, int arg31) {
        ec v0 = this;
        es v1 = arg28;
        int v2 = arg29 + v1.ar;
        int v3 = arg30 + v1.an;
        int v4 = v0.al * 0x6511FB65 * v3 + v2;
        int v5 = v1.ae;
        int v6 = v1.al;
        int v8 = -107049639;
        int v7 = v0.al * v8 - v6;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            int v9 = v0.ar * v10 - v3;
            v5 -= v9;
            v3 = v0.ar * 0x444638EE;
            v10 = v9 * v6;
            v4 += v0.al * v8 * v9;
        }
        else {
            v10 = 0;
        }

        v3 += v5;
        if(v3 > v0.an * 0xD21DC9D7) {
            v5 -= v3 - v0.an * -355970459;
        }

        int v22 = v5;
        v5 = 0xE4D30573;
        if(v2 < v0.ap * v5) {
            v3 = v0.ap * v5 - v2;
            v6 -= v3;
            v2 = v0.ap * 0x3D458F36;
            v10 += v3;
            v4 += v3;
            v11 = v3;
            v7 += v3;
        }

        int v19 = v4;
        int v17 = v10;
        v2 += v6;
        if(v2 > v0.aj * 0xF0A83B1E) {
            v2 -= v0.aj * 0x56AC17CD;
            v6 -= v2;
            v11 += v2;
            v7 += v2;
        }

        int v21 = v6;
        int v23 = v7;
        int v24 = v11;
        if(v21 > 0) {
            if(v22 <= 0) {
            }
            else {
                if(arg31 == 0x100) {
                    jt.ak(0, 0, 0, v0.ax, v1.ax, v17, 0, v19, 0, v21, v22, v23, v24, 1981037464);
                }
                else {
                    ch.ac(0, 0, 0, v0.ax, v1.ax, v17, 0, v19, 0, v21, v22, v23, v24, arg31, 28);
                }

                return;
            }
        }
    }

    static void dm(int[] arg6, byte[] arg7, int[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        int v3;
        int v2;
        int v0 = -(arg11 >> 2);
        arg11 = -(arg11 & 3);
        arg12 = -arg12;
        while(arg12 < 0) {
            int v1 = arg10;
            arg10 = arg9;
            for(arg9 = v0; arg9 < 0; ++arg9) {
                v2 = arg10 + 1;
                arg10 = arg7[arg10];
                if(arg10 != 0) {
                    v3 = v1 + 1;
                    arg6[v1] = arg8[arg10 & 468160027];
                }
                else {
                    v3 = v1 + 1;
                }

                arg10 = v2 + 1;
                v1 = arg7[v2];
                if(v1 != 0) {
                    v2 = v3 + 1;
                    arg6[v3] = arg8[v1 & 1435847050];
                }
                else {
                    v2 = v3 + 1;
                }

                v1 = arg10 + 1;
                arg10 = arg7[arg10];
                if(arg10 != 0) {
                    v3 = v2 + 1;
                    arg6[v2] = arg8[arg10 & 0xFF];
                }
                else {
                    v3 = v2 + 1;
                }

                arg10 = v1 + 1;
                v1 = arg7[v1];
                if(v1 != 0) {
                    arg6[v3] = arg8[v1 & 0xFF];
                    v1 = v3 + 1;
                }
                else {
                    v1 = v3 + 1;
                }
            }

            arg9 = arg11;
            while(arg9 < 0) {
                v2 = arg10 + 1;
                arg10 = arg7[arg10];
                if(arg10 != 0) {
                    arg6[v1] = arg8[arg10 & 2033683546];
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg9;
                arg10 = v2;
            }

            ++arg12;
            int v5 = arg10 + arg14;
            arg10 = v1 + arg13;
            arg9 = v5;
        }
    }

    static void dn(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg8 = arg3[arg7] + arg5;
                    arg6 = (arg3[arg7] & 0xFF00FF) + (arg5 & 0x9D519787);
                    arg5 = (0x1D600A64 & arg6) + (arg8 - arg6 & 0x10000);
                    arg3[arg7] = arg5 - (arg5 >>> 8) | arg8 - arg5;
                    ++arg7;
                }
                else {
                    ++arg7;
                }

                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }

    static void do(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
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
                    ++arg7;
                }

                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }

    static void dp(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int v2;
        int v1;
        arg6 = -(arg9 >> 2);
        arg9 = -(arg9 & 3);
        arg10 = -arg10;
        while(arg10 < 0) {
            int v0 = arg8;
            arg8 = arg7;
            for(arg7 = arg6; arg7 < 0; ++arg7) {
                v1 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    v2 = v0 + 1;
                    arg4[v0] = arg8;
                }
                else {
                    v2 = v0 + 1;
                }

                arg8 = v1 + 1;
                v0 = arg5[v1];
                if(v0 != 0) {
                    v1 = v2 + 1;
                    arg4[v2] = v0;
                }
                else {
                    v1 = v2 + 1;
                }

                v0 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    v2 = v1 + 1;
                    arg4[v1] = arg8;
                }
                else {
                    v2 = v1 + 1;
                }

                arg8 = v0 + 1;
                v0 = arg5[v0];
                if(v0 != 0) {
                    arg4[v2] = v0;
                    v0 = v2 + 1;
                }
                else {
                    v0 = v2 + 1;
                }
            }

            arg7 = arg9;
            while(arg7 < 0) {
                v1 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    arg4[v0] = arg8;
                    ++v0;
                }
                else {
                    ++v0;
                }

                ++arg7;
                arg8 = v1;
            }

            ++arg10;
            int v3 = arg8 + arg12;
            arg8 = v0 + arg11;
            arg7 = v3;
        }
    }

    public void dq(es arg18, int arg19, int arg20, int arg21, int arg22) {
        int v9;
        ec v0 = this;
        es v1 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        if(arg21 == 0x100) {
            v0.am(v1, v2, v3, -807658005);
            return;
        }

        v2 += v1.ar;
        v3 += v1.an;
        int v5 = -107049639;
        int v4 = v0.al * v5 * v3 + v2;
        int v6 = v1.ae;
        int v7 = v1.al;
        int v8 = v0.al * v5 - v7;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            v9 = v0.ar * v10 - v3;
            v6 -= v9;
            v3 = v0.ar * v10;
            v10 = v7 * v9;
            v4 += v9 * (v0.al * v5);
        }
        else {
            v10 = 0;
        }

        v3 += v6;
        v9 = 0xD21DC9D7;
        if(v3 > v0.an * v9) {
            v6 -= v3 - v0.an * v9;
        }

        v3 = v6;
        v6 = 0xE4D30573;
        if(v2 < v0.ap * v6) {
            v5 = v0.ap * v6 - v2;
            v7 -= v5;
            v2 = v0.ap * v6;
            v10 += v5;
            v4 += v5;
            v11 = v5;
            v8 += v5;
        }

        v9 = v4;
        v2 += v7;
        v5 = 0x56AC17CD;
        if(v2 > v0.aj * v5) {
            v2 -= v0.aj * v5;
            v7 -= v2;
            v11 += v2;
            v8 += v2;
        }

        v2 = v7;
        int v12 = v8;
        int v13 = v11;
        if(v2 > 0) {
            if(v3 <= 0) {
            }
            else {
                id.ba(v0.ax, v1.ax, 0, v10, v9, v2, v3, v12, v13, arg21, arg22, 0x7F03006C);
                return;
            }
        }
    }

    public void dr(es arg28, int arg29, int arg30, int arg31) {
        int v9;
        ec v0 = this;
        es v1 = arg28;
        int v2 = arg29 + v1.ar;
        int v3 = arg30 + v1.an;
        int v5 = -107049639;
        int v4 = v0.al * v5 * v3 + v2;
        int v6 = v1.ae;
        int v7 = v1.al;
        int v8 = v0.al * v5 - v7;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            v9 = v0.ar * v10 - v3;
            v6 -= v9;
            v3 = v0.ar * v10;
            v10 = v9 * v7;
            v4 += v0.al * v5 * v9;
        }
        else {
            v10 = 0;
        }

        v3 += v6;
        v9 = 0xD21DC9D7;
        if(v3 > v0.an * v9) {
            v6 -= v3 - v0.an * v9;
        }

        int v22 = v6;
        v5 = 0xE4D30573;
        if(v2 < v0.ap * v5) {
            v3 = v0.ap * v5 - v2;
            v7 -= v3;
            v2 = v0.ap * v5;
            v10 += v3;
            v4 += v3;
            v11 = v3;
            v8 += v3;
        }

        int v19 = v4;
        int v17 = v10;
        v2 += v7;
        v4 = 0x56AC17CD;
        if(v2 > v0.aj * v4) {
            v2 -= v0.aj * v4;
            v7 -= v2;
            v11 += v2;
            v8 += v2;
        }

        int v21 = v7;
        int v23 = v8;
        int v24 = v11;
        if(v21 > 0) {
            if(v22 <= 0) {
            }
            else {
                if(arg31 == 0x100) {
                    jt.ak(0, 0, 0, v0.ax, v1.ax, v17, 0, v19, 0, v21, v22, v23, v24, 0x7609909E);
                }
                else {
                    ch.ac(0, 0, 0, v0.ax, v1.ax, v17, 0, v19, 0, v21, v22, v23, v24, arg31, -83);
                }

                return;
            }
        }
    }

    public void ds(ef arg18, int arg19, int arg20, int arg21, int arg22) {
        int v14;
        int v13;
        int v9;
        int v5;
        ec v0 = this;
        ef v1 = arg18;
        int v12 = v1.ae;
        int v2 = v1.ar;
        int v3 = v1.aj;
        int v4 = v1.ad;
        int v10 = (v3 << 16) / arg21;
        int v11 = (v4 << 16) / arg22;
        int v8 = 0;
        if(v1.an > 0) {
            v5 = ((v1.an << 16) + v10 - 1) / v10;
            v9 = arg19 + v5;
            v5 = v5 * v10 - (v1.an << 16);
        }
        else {
            v9 = arg19;
            v5 = 0;
        }

        if(v1.ap > 0) {
            v13 = ((v1.ap << 16) + v11 - 1) / v11;
            v14 = arg20 + v13;
            v8 = v13 * v11 - (v1.ap << 16);
        }
        else {
            v14 = arg20;
        }

        v3 = v12 < v3 ? ((v12 << 16) - v5 + v10 - 1) / v10 : arg21;
        v2 = v2 < v4 ? ((v2 << 16) - v8 + v11 - 1) / v11 : arg22;
        int v6 = v0.al * -1043239763 * v14 + v9;
        int v7 = -107049639;
        v4 = v0.al * v7 - v3;
        v13 = v14 + v2;
        int v16 = 0xD21DC9D7;
        if(v13 > v0.an * v16) {
            v2 -= v13 - v0.an * v16;
        }

        int v15 = 2002832733;
        if(v14 < v0.ar * v15) {
            v13 = v0.ar * v15 - v14;
            v2 -= v13;
            v6 += v0.al * v7 * v13;
            v8 += v13 * v11;
        }

        v13 = v2;
        v2 = v9 + v3;
        v14 = 0x56AC17CD;
        if(v2 > v0.aj * v14) {
            v2 -= v0.aj * v14;
            v3 -= v2;
            v4 += v2;
        }

        v7 = 0xE4D30573;
        if(v9 < v0.ap * v7) {
            v2 = v0.ap * v7 - v9;
            v3 -= v2;
            v6 += v2;
            v5 += v2 * v10;
            v4 += v2;
        }

        dn.ao(v0.ax, v1.ax, v1.al, v5, v8, v6, v4, v3, v13, v10, v11, v12, -12136);
    }

    public void dt(es arg18, int arg19, int arg20, int arg21, int arg22) {
        ec v0 = this;
        es v1 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        if(arg21 == 0x100) {
            v0.am(v1, v2, v3, -807658005);
            return;
        }

        v2 += v1.ar;
        v3 += v1.an;
        int v5 = v0.al * 0x89FECB61 * v3 + v2;
        int v4 = v1.ae;
        int v6 = v1.al;
        int v8 = v0.al * 349614409 - v6;
        int v9 = 2002832733;
        int v10 = 0;
        if(v3 < v0.ar * v9) {
            int v7 = v0.ar * v9 - v3;
            v4 -= v7;
            v3 = -1804403600 * v0.ar;
            v9 = v6 * v7;
            v5 += v7 * (v0.al * -599040395);
        }
        else {
            v9 = 0;
        }

        v3 += v4;
        if(v3 > v0.an * 0xD21DC9D7) {
            v4 -= v3 - v0.an * 0xABF8A4FA;
        }

        int v11 = v4;
        v4 = 0xE4D30573;
        if(v2 < v0.ap * v4) {
            v3 = v0.ap * v4 - v2;
            v6 -= v3;
            v2 = 0x722AEB03 * v0.ap;
            v9 += v3;
            v5 += v3;
            v10 = v3;
            v8 += v3;
        }

        v3 = v9;
        v9 = v5;
        v2 += v6;
        v5 = 0x56AC17CD;
        if(v2 > v0.aj * v5) {
            v2 -= v0.aj * v5;
            v6 -= v2;
            v10 += v2;
            v8 += v2;
        }

        int v12 = v8;
        int v13 = v10;
        v10 = v6;
        if(v10 > 0) {
            if(v11 <= 0) {
            }
            else {
                id.ba(v0.ax, v1.ax, 0, v3, v9, v10, v11, v12, v13, arg21, arg22, 0x7F03006C);
                return;
            }
        }
    }

    static void du(int[] arg5, byte[] arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v3;
        int v2;
        int v0 = -(arg10 >> 2);
        arg10 = -(arg10 & 3);
        arg11 = -arg11;
        while(arg11 < 0) {
            int v1 = arg9;
            arg9 = arg8;
            for(arg8 = v0; arg8 < 0; ++arg8) {
                v2 = arg9 + 1;
                arg9 = arg6[arg9];
                if(arg9 != 0) {
                    v3 = v1 + 1;
                    arg5[v1] = arg7[arg9 & 0xFF];
                }
                else {
                    v3 = v1 + 1;
                }

                arg9 = v2 + 1;
                v1 = arg6[v2];
                if(v1 != 0) {
                    v2 = v3 + 1;
                    arg5[v3] = arg7[v1 & 0xFF];
                }
                else {
                    v2 = v3 + 1;
                }

                v1 = arg9 + 1;
                arg9 = arg6[arg9];
                if(arg9 != 0) {
                    v3 = v2 + 1;
                    arg5[v2] = arg7[arg9 & 0xFF];
                }
                else {
                    v3 = v2 + 1;
                }

                arg9 = v1 + 1;
                v1 = arg6[v1];
                if(v1 != 0) {
                    arg5[v3] = arg7[v1 & 0xFF];
                    v1 = v3 + 1;
                }
                else {
                    v1 = v3 + 1;
                }
            }

            arg8 = arg10;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                arg9 = arg6[arg9];
                if(arg9 != 0) {
                    arg5[v1] = arg7[arg9 & 0xFF];
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            ++arg11;
            int v4 = arg9 + arg13;
            arg9 = v1 + arg12;
            arg8 = v4;
        }
    }

    static void dv(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int v2;
        int v1;
        arg6 = -(arg9 >> 2);
        arg9 = -(arg9 & 3);
        arg10 = -arg10;
        while(arg10 < 0) {
            int v0 = arg8;
            arg8 = arg7;
            for(arg7 = arg6; arg7 < 0; ++arg7) {
                v1 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    v2 = v0 + 1;
                    arg4[v0] = arg8;
                }
                else {
                    v2 = v0 + 1;
                }

                arg8 = v1 + 1;
                v0 = arg5[v1];
                if(v0 != 0) {
                    v1 = v2 + 1;
                    arg4[v2] = v0;
                }
                else {
                    v1 = v2 + 1;
                }

                v0 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    v2 = v1 + 1;
                    arg4[v1] = arg8;
                }
                else {
                    v2 = v1 + 1;
                }

                arg8 = v0 + 1;
                v0 = arg5[v0];
                if(v0 != 0) {
                    arg4[v2] = v0;
                    v0 = v2 + 1;
                }
                else {
                    v0 = v2 + 1;
                }
            }

            arg7 = arg9;
            while(arg7 < 0) {
                v1 = arg8 + 1;
                arg8 = arg5[arg8];
                if(arg8 != 0) {
                    arg4[v0] = arg8;
                    ++v0;
                }
                else {
                    ++v0;
                }

                ++arg7;
                arg8 = v1;
            }

            ++arg10;
            int v3 = arg8 + arg12;
            arg8 = v0 + arg11;
            arg7 = v3;
        }
    }

    public void dw(ef arg23, int arg24, int arg25) {
        int v9;
        ec v0 = this;
        ef v1 = arg23;
        int v2 = arg24 + v1.an;
        int v3 = arg25 + v1.ap;
        int v5 = -107049639;
        int v4 = v0.al * v5 * v3 + v2;
        int v6 = v1.ar;
        int v7 = v1.ae;
        int v8 = v0.al * v5 - v7;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            v9 = v0.ar * v10 - v3;
            v6 -= v9;
            v3 = v0.ar * v10;
            v10 = v9 * v7;
            v4 += v0.al * v5 * v9;
        }
        else {
            v10 = 0;
        }

        v3 += v6;
        v9 = 0xD21DC9D7;
        if(v3 > v0.an * v9) {
            v6 -= v3 - v0.an * v9;
        }

        int v18 = v6;
        v5 = 0xE4D30573;
        if(v2 < v0.ap * v5) {
            v3 = v0.ap * v5 - v2;
            v7 -= v3;
            v2 = v0.ap * v5;
            v10 += v3;
            v4 += v3;
            v11 = v3;
            v8 += v3;
        }

        int v16 = v4;
        int v15 = v10;
        v2 += v7;
        v4 = 0x56AC17CD;
        if(v2 > v0.aj * v4) {
            v2 -= v0.aj * v4;
            v7 -= v2;
            v11 += v2;
            v8 += v2;
        }

        int v17 = v7;
        int v19 = v8;
        int v20 = v11;
        if(v17 > 0) {
            if(v18 <= 0) {
            }
            else {
                ey.ah(v0.ax, v1.ax, v1.al, v15, v16, v17, v18, v19, v20, 0xA35C7C0);
            }
        }
    }

    static void dx(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg8 = arg3[arg7] + arg5;
                    arg6 = (arg3[arg7] & 0xFF00FF) + (arg5 & 0xFF00FF);
                    arg5 = (0x1000100 & arg6) + (arg8 - arg6 & 0x10000);
                    arg3[arg7] = arg5 - (arg5 >>> 8) | arg8 - arg5;
                    ++arg7;
                }
                else {
                    ++arg7;
                }

                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }

    static void dy(int[] arg9, byte[] arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20) {
        int v0 = -arg17;
        int v1 = arg13;
        int v2;
        for(v2 = arg14; v0 < 0; v2 = v6 + arg15) {
            int v3 = (v1 >> 16) * arg20;
            int v5 = -arg16;
            int v6 = v2;
            v2 = arg12;
            while(v5 < 0) {
                int v7 = arg10[(v2 >> 16) + v3];
                if(v7 != 0) {
                    arg9[v6] = arg11[v7 & 0xFF];
                    ++v6;
                }
                else {
                    ++v6;
                }

                v2 += arg18;
                ++v5;
            }

            v1 += arg19;
            ++v0;
        }
    }

    static void dz(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
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
                    ++arg7;
                }

                ++arg1;
                arg5 = arg2;
            }

            arg7 += arg11;
            arg5 += arg12;
        }
    }

    static void ea(int[] arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        arg8 = 0x100 - arg15;
        for(arg12 = -arg12; arg12 < 0; ++arg12) {
            int v0 = -arg11;
            while(v0 < 0) {
                int v1 = arg9 + 1;
                arg9 = arg7[arg9];
                if(arg9 != 0) {
                    int v2 = arg6[arg10];
                    if(v2 == 0) {
                        v2 = arg10 + 1;
                        arg6[arg10] = arg9 | arg8 - 0x30 << 24;
                    }
                    else {
                        arg6[arg10] = (0xFF00FF00 & (arg9 & 0xFF00FF) * arg15 + (0xFF00FF & v2) * arg8) + ((arg9 & 0xFF00) * arg15 + (v2 & 0xFF00) * arg8 & 0xFF0000) >> 8;
                        v2 = arg10 + 1;
                    }

                    arg10 = v2;
                }
                else {
                    ++arg10;
                }

                ++v0;
                arg9 = v1;
            }

            arg10 += arg13;
            arg9 += arg14;
        }
    }

    void eb(es arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31) {
        int v22;
        int v23;
        ec v0 = this;
        es v1 = arg25;
        int v4 = arg31;
        if(v4 == 0) {
            return;
        }

        int v5 = arg26 - (v1.ar << 4);
        int v6 = arg27 - (v1.an << 4);
        double v9 = (((double)(arg30 & 1917440302))) * 0.000096;
        double v11 = ((double)v4);
        v4 = ((int)Math.floor(Math.sin(v9) * v11 + 0.5));
        int v7 = ((int)Math.floor(Math.cos(v9) * v11 + 0.5));
        int v8 = -v5;
        int v15 = v8 * v7;
        int v13 = -v6;
        int v14 = v4 * v13;
        double v18 = v9;
        int v9_1 = v15 + v14;
        v13 *= v7;
        v8 = -v8 * v4;
        int v10 = v13 + v8;
        double v20 = v11;
        int v11_1 = ((v1.al << 4) - v5) * v7 + v14;
        int v12 = -((v1.al << 4) - v5) * v4 + v13;
        v13 = ((v1.ae << 4) - v6) * v4 + v15;
        v8 += ((v1.ae << 4) - v6) * v7;
        v14 = ((v1.al << 4) - v5) * v7 + ((v1.ae << 4) - v6) * v4;
        v4 = v4 * -((v1.al << 4) - v5) + ((v1.ae << 4) - v6) * v7;
        if(v9_1 < v11_1) {
        }
        else {
            v23 = v11_1;
            v11_1 = v9_1;
            v9_1 = v23;
        }

        if(v13 < v9_1) {
            v9_1 = v13;
        }

        if(v14 < v9_1) {
            v9_1 = v14;
        }

        if(v13 > v11_1) {
            v11_1 = v13;
        }

        if(v14 > v11_1) {
            v11_1 = v14;
        }

        if(v10 < v12) {
        }
        else {
            v23 = v12;
            v12 = v10;
            v10 = v23;
        }

        if(v8 < v10) {
            v10 = v8;
        }

        if(v4 < v10) {
            v10 = v4;
        }

        if(v8 > v12) {
        }
        else {
            v8 = v12;
        }

        if(v4 > v8) {
            v8 = v4;
        }

        v4 = (v9_1 >> 12) + arg28 >> 4;
        v7 = (v11_1 + 233707059 >> 12) + arg28 + 15 >> 4;
        v9_1 = (v10 >> 12) + arg29 >> 4;
        v8 = (v8 + 0xFFF >> 12) + arg29 + 15 >> 4;
        if(v4 < v0.ap * 0xE4D30573) {
            v4 = 0xA65FD2FB * v0.ap;
        }

        v11_1 = 0x56AC17CD;
        if(v7 > v0.aj * v11_1) {
            v7 = v0.aj * v11_1;
        }

        if(v9_1 < v0.ar * 2002832733) {
            v9_1 = v0.ar * -2001083056;
        }

        if(v8 > v0.an * 0xD21DC9D7) {
            v8 = 0x7F691086 * v0.an;
        }

        v7 = v4 - v7;
        if(v7 >= 0) {
            return;
        }

        v8 = v9_1 - v8;
        if(v8 >= 0) {
            return;
        }

        v11_1 = -107049639;
        v10 = v0.al * v11_1 * v9_1 + v4;
        double v12_1 = 16777216 / v20;
        v14 = ((int)Math.floor(Math.sin(v18) * v12_1 + 0.5));
        v12 = ((int)Math.floor(Math.cos(v18) * v12_1 + 0.5));
        v4 = (v4 << 4) + 8 - arg28;
        int v2 = (v9_1 << 4) + 8 - arg29;
        int v3 = (v5 << 8) - (v2 * v14 >> 4);
        v2 = (v2 * v12 >> 4) + (v6 << 8);
        if(v12 == 0) {
            if(v14 == 0) {
                while(true) {
                    if(v8 >= 0) {
                        return;
                    }

                    if(v3 < 0) {
                    }
                    else if(v2 < 0) {
                    }
                    else if(v3 - (v1.al << 12) >= 0) {
                    }
                    else if(v2 - (v1.ae << 12) >= 0) {
                    }
                    else {
                        v4 = v7;
                        v5 = v10;
                        while(v4 < 0) {
                            v6 = v1.ax[v1.al * (v2 >> 12) + (v3 >> 12)];
                            if(v6 != 0) {
                                v0.ax[v5] = v6;
                                ++v5;
                            }
                            else {
                                ++v5;
                            }

                            ++v4;
                        }
                    }

                    ++v8;
                    v10 += v0.al * v11_1;
                }
            }

            if(v14 < 0) {
                while(true) {
                    if(v8 < 0) {
                        v5 = (v14 * v4 >> 4) + v2;
                        if(v3 < 0) {
                        }
                        else if(v3 - (v1.al << 12) >= 0) {
                        }
                        else {
                            v6 = v5 - (v1.ae << 12);
                            if(v6 >= 0) {
                                v6 = (v14 - v6) / v14;
                                v9_1 = v7 + v6;
                                v5 += v6 * v14;
                                v6 += v10;
                            }
                            else {
                                v9_1 = v7;
                                v6 = v10;
                            }

                            v12 = (v5 - v14) / v14;
                            if(v12 > v9_1) {
                                v9_1 = v12;
                            }

                            while(v9_1 < 0) {
                                v11_1 = v1.ax[(v3 >> 12) + (v5 >> 12) * v1.al];
                                if(v11_1 != 0) {
                                    v0.ax[v6] = v11_1;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v14;
                                ++v9_1;
                            }
                        }

                        ++v8;
                        v3 -= v14;
                        v10 += v0.al * -107049639;
                        continue;
                    }
                    else {
                        return;
                    }
                }
            }

            while(v8 < 0) {
                v5 = (v4 * v14 >> 4) + v2;
                if(v3 < 0) {
                }
                else if(v3 - (v1.al << 12) >= 0) {
                }
                else {
                    if(v5 < 0) {
                        v6 = (v14 - 1 - v5) / v14;
                        v9_1 = v7 + v6;
                        v5 += v6 * v14;
                        v6 += v10;
                    }
                    else {
                        v9_1 = v7;
                        v6 = v10;
                    }

                    v11_1 = (v5 + 1 - (v1.ae << 12) - v14) / v14;
                    if(v11_1 > v9_1) {
                        v9_1 = v11_1;
                    }

                    while(v9_1 < 0) {
                        v11_1 = v1.ax[(v3 >> 12) + v1.al * (v5 >> 12)];
                        if(v11_1 != 0) {
                            v0.ax[v6] = v11_1;
                            ++v6;
                        }
                        else {
                            ++v6;
                        }

                        v5 += v14;
                        ++v9_1;
                    }
                }

                ++v8;
                v3 -= v14;
                v10 += v0.al * 0xA571AB3A;
            }
        }
        else {
            if(v12 < 0) {
                if(v14 == 0) {
                    while(true) {
                        if(v8 >= 0) {
                            return;
                        }

                        v5 = (v12 * v4 >> 4) + v3;
                        if(v2 < 0) {
                        }
                        else if(v2 - (v1.ae << 12) >= 0) {
                        }
                        else {
                            v6 = v5 - (v1.al << 12);
                            if(v6 >= 0) {
                                v6 = (v12 - v6) / v12;
                                v9_1 = v7 + v6;
                                v5 += v12 * v6;
                                v6 += v10;
                            }
                            else {
                                v9_1 = v7;
                                v6 = v10;
                            }

                            v11_1 = (v5 - v12) / v12;
                            if(v11_1 > v9_1) {
                                v9_1 = v11_1;
                            }

                            while(v9_1 < 0) {
                                v11_1 = v1.ax[(v2 >> 12) * v1.al + (v5 >> 12)];
                                if(v11_1 != 0) {
                                    v0.ax[v6] = v11_1;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v12;
                                ++v9_1;
                            }
                        }

                        ++v8;
                        v2 += v12;
                        v10 += v0.al * -107049639;
                    }
                }

                if(v14 < 0) {
                    while(true) {
                        if(v8 >= 0) {
                            return;
                        }

                        v5 = (v12 * v4 >> 4) + v3;
                        v6 = (v14 * v4 >> 4) + v2;
                        v9_1 = v5 - (v1.al << 12);
                        if(v9_1 >= 0) {
                            v9_1 = (v12 - v9_1) / v12;
                            v11_1 = v7 + v9_1;
                            v5 += v12 * v9_1;
                            v6 += v9_1 * v14;
                            v9_1 += v10;
                        }
                        else {
                            v11_1 = v7;
                            v9_1 = v10;
                        }

                        v13 = (v5 - v12) / v12;
                        if(v13 > v11_1) {
                            v11_1 = v13;
                        }

                        v13 = v6 - (v1.ae << 12);
                        if(v13 >= 0) {
                            v13 = (v14 - v13) / v14;
                            v11_1 += v13;
                            v5 += v13 * v12;
                            v6 += v14 * v13;
                            v9_1 += v13;
                        }

                        v13 = (v6 - v14) / v14;
                        if(v13 > v11_1) {
                            v11_1 = v13;
                        }

                        while(v11_1 < 0) {
                            v22 = v7;
                            v7 = v1.ax[(v5 >> 12) + v1.al * (v6 >> 12)];
                            if(v7 != 0) {
                                v0.ax[v9_1] = v7;
                                ++v9_1;
                            }
                            else {
                                ++v9_1;
                            }

                            v5 += v12;
                            v6 += v14;
                            ++v11_1;
                            v7 = v22;
                        }

                        ++v8;
                        v3 -= v14;
                        v2 += v12;
                        v10 += v0.al * -107049639;
                    }
                }

                v22 = v7;
                while(true) {
                    if(v8 >= 0) {
                        return;
                    }

                    v5 = (v12 * v4 >> 4) + v3;
                    v6 = (v4 * v14 >> 4) + v2;
                    v7 = v5 - (v1.al << 12);
                    if(v7 >= 0) {
                        v7 = (v12 - v7) / v12;
                        v9_1 = v22 + v7;
                        v5 += v12 * v7;
                        v6 += v7 * v14;
                        v7 += v10;
                    }
                    else {
                        v7 = v10;
                        v9_1 = v22;
                    }

                    v11_1 = (v5 - v12) / v12;
                    if(v11_1 > v9_1) {
                        v9_1 = v11_1;
                    }

                    if(v6 < 0) {
                        v11_1 = (v14 - 1 - v6) / v14;
                        v9_1 += v11_1;
                        v5 += v11_1 * v12;
                        v6 += v14 * v11_1;
                        v7 += v11_1;
                    }

                    v11_1 = (v6 + 1 - (v1.ae << 12) - v14) / v14;
                    if(v11_1 > v9_1) {
                        v9_1 = v11_1;
                    }

                    while(v9_1 < 0) {
                        v11_1 = v1.ax[(v5 >> 12) + v1.al * (v6 >> 12)];
                        if(v11_1 != 0) {
                            v0.ax[v7] = v11_1;
                            ++v7;
                        }
                        else {
                            ++v7;
                        }

                        v5 += v12;
                        v6 += v14;
                        ++v9_1;
                    }

                    ++v8;
                    v3 -= v14;
                    v2 += v12;
                    v10 += v0.al * 0x9E407480;
                }
            }

            v22 = v7;
            if(v14 == 0) {
                while(true) {
                    if(v8 >= 0) {
                        return;
                    }

                    v5 = (v12 * v4 >> 4) + v3;
                    if(v2 < 0) {
                    }
                    else if(v2 - (v1.ae << 12) >= 0) {
                    }
                    else {
                        if(v5 < 0) {
                            v6 = (v12 - 1 - v5) / v12;
                            v7 = v22 + v6;
                            v5 += v6 * v12;
                            v6 += v10;
                        }
                        else {
                            v6 = v10;
                            v7 = v22;
                        }

                        v9_1 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                        if(v9_1 > v7) {
                        }
                        else {
                            v9_1 = v7;
                        }

                        while(v9_1 < 0) {
                            v7 = v1.ax[(v5 >> 12) + v1.al * (v2 >> 12)];
                            if(v7 != 0) {
                                v0.ax[v6] = v7;
                                ++v6;
                            }
                            else {
                                ++v6;
                            }

                            v5 += v12;
                            ++v9_1;
                        }
                    }

                    ++v8;
                    v2 += v12;
                    v10 += v0.al * -1705392322;
                }
            }

            if(v14 < 0) {
                while(true) {
                    if(v8 < 0) {
                        v5 = (v12 * v4 >> 4) + v3;
                        v6 = (v4 * v14 >> 4) + v2;
                        if(v5 < 0) {
                            v7 = (v12 - 1 - v5) / v12;
                            v9_1 = v22 + v7;
                            v5 += v12 * v7;
                            v6 += v14 * v7;
                            v7 += v10;
                        }
                        else {
                            v7 = v10;
                            v9_1 = v22;
                        }

                        v11_1 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                        if(v11_1 > v9_1) {
                            v9_1 = v11_1;
                        }

                        v11_1 = v6 - (v1.ae << 12);
                        if(v11_1 >= 0) {
                            v11_1 = (v14 - v11_1) / v14;
                            v9_1 += v11_1;
                            v5 += v12 * v11_1;
                            v6 += v14 * v11_1;
                            v7 += v11_1;
                        }

                        v11_1 = (v6 - v14) / v14;
                        if(v11_1 > v9_1) {
                            v9_1 = v11_1;
                        }

                        while(v9_1 < 0) {
                            v11_1 = v1.ax[v1.al * (v6 >> 12) + (v5 >> 12)];
                            if(v11_1 != 0) {
                                v0.ax[v7] = v11_1;
                                ++v7;
                            }
                            else {
                                ++v7;
                            }

                            v5 += v12;
                            v6 += v14;
                            ++v9_1;
                        }

                        ++v8;
                        v3 -= v14;
                        v2 += v12;
                        v10 += v0.al * 1808801503;
                        continue;
                    }
                    else {
                        return;
                    }
                }
            }

            while(v8 < 0) {
                v5 = (v12 * v4 >> 4) + v3;
                v6 = (v4 * v14 >> 4) + v2;
                if(v5 < 0) {
                    v7 = (v12 - 1 - v5) / v12;
                    v9_1 = v22 + v7;
                    v5 += v7 * v12;
                    v6 += v7 * v14;
                    v7 += v10;
                }
                else {
                    v7 = v10;
                    v9_1 = v22;
                }

                v11_1 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                if(v11_1 > v9_1) {
                    v9_1 = v11_1;
                }

                if(v6 < 0) {
                    v11_1 = (v14 - 1 - v6) / v14;
                    v9_1 += v11_1;
                    v5 += v12 * v11_1;
                    v6 += v14 * v11_1;
                    v7 += v11_1;
                }

                v11_1 = (v6 + 1 - (v1.ae << 12) - v14) / v14;
                if(v11_1 > v9_1) {
                    v9_1 = v11_1;
                }

                while(v9_1 < 0) {
                    v11_1 = v1.ax[(v5 >> 12) + v1.al * (v6 >> 12)];
                    if(v11_1 != 0) {
                        v0.ax[v7] = v11_1;
                        ++v7;
                    }
                    else {
                        ++v7;
                    }

                    v5 += v12;
                    v6 += v14;
                    ++v9_1;
                }

                ++v8;
                v3 -= v14;
                v2 += v12;
                v10 += v0.al * -107049639;
            }
        }
    }

    public void ec(es arg30, int arg31, int arg32, int arg33, int arg34) {
        int v22;
        ec v0 = this;
        es v1 = arg30;
        int v4 = arg33;
        int v5 = arg34;
        if(v4 <= v1.ap && v5 <= v1.aj) {
            int v6 = arg31 + v1.ar * v4 / v1.ap;
            int v7 = ((v1.al + v1.ar) * v4 + v1.ap - 1) / v1.ap + arg31;
            int v9 = arg32 + v1.an * v5 / v1.aj;
            int v10 = arg32 + ((v1.ae + v1.an) * v5 + v1.aj - 1) / v1.aj;
            int v12 = 0xE4D30573;
            if(v6 < v0.ap * v12) {
                v6 = v0.ap * v12;
            }

            v12 = 0x56AC17CD;
            if(v7 > v0.aj * v12) {
                v7 = v0.aj * v12;
            }

            v12 = 2002832733;
            if(v9 < v0.ar * v12) {
                v9 = v0.ar * v12;
            }

            v12 = 0xD21DC9D7;
            if(v10 > v0.an * v12) {
                v10 = v0.an * v12;
            }

            if(v6 < v7) {
                if(v9 >= v10) {
                }
                else {
                    int v11 = v0.al * -107049639 * v9 + v6;
                    int v13 = v0.al * -107049639 - (v7 - v6);
                    if(v11 >= v0.ax.length) {
                        return;
                    }

                    while(v9 < v10) {
                        v12 = v11;
                        v11 = v6;
                        while(v11 < v7) {
                            int v14 = v11 - arg31 << 4;
                            int v15 = v9 - arg32 << 4;
                            int v8 = v1.ap * v14 / v4 - (v1.ar << 4);
                            v14 = (v14 + 16) * v1.ap / v4 - (v1.ar << 4);
                            int v2 = v1.aj * v15 / v5 - (v1.an << 4);
                            int v3 = v1.aj * (v15 + 16) / v5 - (v1.an << 4);
                            v15 = (v3 - v2) * (v14 - v8) >> 1;
                            if(v15 == 0) {
                                v22 = v6;
                            }
                            else {
                                int v18 = 0;
                                if(v8 < 0) {
                                    v8 = 0;
                                }

                                if(v14 >= v1.al << 4) {
                                    v14 = v1.al << 4;
                                }

                                if(v2 < 0) {
                                    v2 = 0;
                                }

                                if(v3 >= v1.ae << 4) {
                                    v3 = v1.ae << 4;
                                }

                                --v14;
                                --v3;
                                v4 = 16 - (v8 & 15);
                                int v19 = (v14 & 15) + 1;
                                int v20 = 16 - (v2 & 15);
                                int v21 = (v3 & 15) + 1;
                                v8 >>= 4;
                                v14 >>= 4;
                                v2 >>= 4;
                                v3 >>= 4;
                                v5 = v2;
                                v22 = v6;
                                v6 = 0;
                                int v23 = 0;
                                int v24 = 0;
                                while(v5 <= v3) {
                                    int v25 = v2 == v5 ? v20 : 16;
                                    if(v3 == v5) {
                                        v25 = v21;
                                    }

                                    int v26 = v6;
                                    v6 = v8;
                                    while(v6 <= v14) {
                                        int v27 = v2;
                                        int v28 = v3;
                                        v2 = v1.ax[v1.al * v5 + v6];
                                        if(v2 != 0) {
                                            if(v8 == v6) {
                                                v3 = v25 * v4;
                                            }
                                            else if(v6 == v14) {
                                                v3 = v25 * v19;
                                            }
                                            else {
                                                v3 = v25 << 4;
                                            }

                                            v26 += v3;
                                            v24 += (v2 >> 16 & 0xFF) * v3;
                                            v23 += (v2 >> 8 & 0xFF) * v3;
                                            v18 += (v2 & 0xFF) * v3;
                                        }

                                        ++v6;
                                        v2 = v27;
                                        v3 = v28;
                                        v1 = arg30;
                                    }

                                    ++v5;
                                    v6 = v26;
                                    v1 = arg30;
                                }

                                if(v6 >= v15) {
                                    v8 = v18 / v6 + ((v23 / v6 << 8) + (v24 / v6 << 16));
                                    if(v8 == 0) {
                                        v8 = 1;
                                    }

                                    v0.ax[v12] = v8;
                                }

                                ++v12;
                            }

                            ++v11;
                            v6 = v22;
                            v1 = arg30;
                            v4 = arg33;
                            v5 = arg34;
                        }

                        v11 = v12 + v13;
                        ++v9;
                        v1 = arg30;
                        v4 = arg33;
                        v5 = arg34;
                    }

                    return;
                }
            }

            return;
        }

        throw new IllegalArgumentException();
    }

    public void ed(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int[] arg27, int[] arg28) {
        ec v0 = this;
        es v1 = arg18;
        int v2 = arg22;
        int v4 = -arg21;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg25)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = v8 * arg26 >> 8;
            int v3 = v6_1 * arg26 >> 8;
            v6_1 = (arg23 << 16) + (v3 * v4 + v5 * v7);
            v8 = (arg24 << 16) + (v5 * v3 - v4 * v7);
            v4 = arg19 + v0.al * -107049639 * arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg27[v9];
                int v13 = arg27[v9] * v3 + v6_1;
                int v11 = v8 - arg27[v9] * v7;
                int v14 = -arg28[v9];
                while(v14 < 0) {
                    v0.ax[v12] = v1.ax[(v11 >> 16) * v1.al + (v13 >> 16)];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v0.al * -107049639;
                ++v9;
                v2 = arg22;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    public void ee(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int[] arg27, int[] arg28) {
        ec v0 = this;
        es v1 = arg18;
        int v2 = arg22;
        int v4 = -arg21;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg25)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = v8 * arg26 >> 8;
            int v3 = v6_1 * arg26 >> 8;
            v6_1 = (arg23 << 16) + (v3 * v4 + v5 * v7);
            v8 = (arg24 << 16) + (v5 * v3 - v4 * v7);
            v4 = arg19 + v0.al * -107049639 * arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg27[v9];
                int v13 = arg27[v9] * v3 + v6_1;
                int v11 = v8 - arg27[v9] * v7;
                int v14 = -arg28[v9];
                while(v14 < 0) {
                    v0.ax[v12] = v1.ax[(v11 >> 16) * v1.al + (v13 >> 16)];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v0.al * -107049639;
                ++v9;
                v2 = arg22;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    public void eg(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int[] arg27, int[] arg28) {
        ec v0 = this;
        es v1 = arg18;
        int v2 = arg22;
        int v4 = -arg21;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg25)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = v8 * arg26 >> 8;
            int v3 = v6_1 * arg26 >> 8;
            v6_1 = (arg23 << 16) + (v3 * v4 + v5 * v7);
            v8 = (arg24 << 16) + (v5 * v3 - v4 * v7);
            v4 = arg19 + v0.al * -107049639 * arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg27[v9];
                int v13 = arg27[v9] * v3 + v6_1;
                int v11 = v8 - arg27[v9] * v7;
                int v14 = -arg28[v9];
                while(v14 < 0) {
                    v0.ax[v12] = v1.ax[(v11 >> 16) * v1.al + (v13 >> 16)];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v0.al * -107049639;
                ++v9;
                v2 = arg22;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    void eh(es arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31) {
        int v22;
        int v23;
        ec v0 = this;
        es v1 = arg25;
        int v4 = arg31;
        if(v4 == 0) {
            return;
        }

        int v5 = arg26 - (v1.ar << 4);
        int v6 = arg27 - (v1.an << 4);
        double v9 = (((double)(arg30 & 0xFFFF))) * 0.000096;
        double v11 = ((double)v4);
        v4 = ((int)Math.floor(Math.sin(v9) * v11 + 0.5));
        int v7 = ((int)Math.floor(Math.cos(v9) * v11 + 0.5));
        int v8 = -v5;
        int v15 = v8 * v7;
        int v13 = -v6;
        int v14 = v4 * v13;
        double v18 = v9;
        int v9_1 = v15 + v14;
        v13 *= v7;
        v8 = -v8 * v4;
        int v10 = v13 + v8;
        double v20 = v11;
        int v11_1 = ((v1.al << 4) - v5) * v7 + v14;
        int v12 = -((v1.al << 4) - v5) * v4 + v13;
        v13 = ((v1.ae << 4) - v6) * v4 + v15;
        v8 += ((v1.ae << 4) - v6) * v7;
        v14 = ((v1.al << 4) - v5) * v7 + ((v1.ae << 4) - v6) * v4;
        v4 = v4 * -((v1.al << 4) - v5) + ((v1.ae << 4) - v6) * v7;
        if(v9_1 < v11_1) {
        }
        else {
            v23 = v11_1;
            v11_1 = v9_1;
            v9_1 = v23;
        }

        if(v13 < v9_1) {
            v9_1 = v13;
        }

        if(v14 < v9_1) {
            v9_1 = v14;
        }

        if(v13 > v11_1) {
            v11_1 = v13;
        }

        if(v14 > v11_1) {
            v11_1 = v14;
        }

        if(v10 < v12) {
        }
        else {
            v23 = v12;
            v12 = v10;
            v10 = v23;
        }

        if(v8 < v10) {
            v10 = v8;
        }

        if(v4 < v10) {
            v10 = v4;
        }

        if(v8 > v12) {
        }
        else {
            v8 = v12;
        }

        if(v4 > v8) {
            v8 = v4;
        }

        v4 = (v9_1 >> 12) + arg28 >> 4;
        v7 = (v11_1 - 0x6EC6E0DE >> 12) + arg28 + 15 >> 4;
        v9_1 = (v10 >> 12) + arg29 >> 4;
        v8 = (v8 + 0xFFF >> 12) + arg29 + 15 >> 4;
        if(v4 < v0.ap * 0x4ADA8F2D) {
            v4 = 0x18818C7B * v0.ap;
        }

        v11_1 = 0x56AC17CD;
        if(v7 > v0.aj * v11_1) {
            v7 = v0.aj * v11_1;
        }

        if(v9_1 < v0.ar * 2002832733) {
            v9_1 = v0.ar * 0xB985BE99;
        }

        if(v8 > v0.an * 0x72BC0FE6) {
            v8 = 0xC6A9D89B * v0.an;
        }

        v7 = v4 - v7;
        if(v7 >= 0) {
            return;
        }

        v8 = v9_1 - v8;
        if(v8 >= 0) {
            return;
        }

        v11_1 = -107049639;
        v10 = v0.al * v11_1 * v9_1 + v4;
        double v12_1 = 16777216 / v20;
        v14 = ((int)Math.floor(Math.sin(v18) * v12_1 + 0.5));
        v12 = ((int)Math.floor(Math.cos(v18) * v12_1 + 0.5));
        v4 = (v4 << 4) + 8 - arg28;
        int v2 = (v9_1 << 4) + 8 - arg29;
        int v3 = (v5 << 8) - (v2 * v14 >> 4);
        v2 = (v2 * v12 >> 4) + (v6 << 8);
        if(v12 == 0) {
            if(v14 == 0) {
                while(true) {
                    if(v8 >= 0) {
                        return;
                    }

                    if(v3 < 0) {
                    }
                    else if(v2 < 0) {
                    }
                    else if(v3 - (v1.al << 12) >= 0) {
                    }
                    else if(v2 - (v1.ae << 12) >= 0) {
                    }
                    else {
                        v4 = v7;
                        v5 = v10;
                        while(v4 < 0) {
                            v6 = v1.ax[v1.al * (v2 >> 12) + (v3 >> 12)];
                            if(v6 != 0) {
                                v0.ax[v5] = v6;
                                ++v5;
                            }
                            else {
                                ++v5;
                            }

                            ++v4;
                        }
                    }

                    ++v8;
                    v10 += v0.al * v11_1;
                }
            }

            if(v14 < 0) {
                while(true) {
                    if(v8 < 0) {
                        v5 = (v14 * v4 >> 4) + v2;
                        if(v3 < 0) {
                        }
                        else if(v3 - (v1.al << 12) >= 0) {
                        }
                        else {
                            v6 = v5 - (v1.ae << 12);
                            if(v6 >= 0) {
                                v6 = (v14 - v6) / v14;
                                v9_1 = v7 + v6;
                                v5 += v6 * v14;
                                v6 += v10;
                            }
                            else {
                                v9_1 = v7;
                                v6 = v10;
                            }

                            v12 = (v5 - v14) / v14;
                            if(v12 > v9_1) {
                                v9_1 = v12;
                            }

                            while(v9_1 < 0) {
                                v11_1 = v1.ax[(v3 >> 12) + (v5 >> 12) * v1.al];
                                if(v11_1 != 0) {
                                    v0.ax[v6] = v11_1;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v14;
                                ++v9_1;
                            }
                        }

                        ++v8;
                        v3 -= v14;
                        v10 += v0.al * -107049639;
                        continue;
                    }
                    else {
                        return;
                    }
                }
            }

            while(v8 < 0) {
                v5 = (v4 * v14 >> 4) + v2;
                if(v3 < 0) {
                }
                else if(v3 - (v1.al << 12) >= 0) {
                }
                else {
                    if(v5 < 0) {
                        v6 = (v14 - 1 - v5) / v14;
                        v9_1 = v7 + v6;
                        v5 += v6 * v14;
                        v6 += v10;
                    }
                    else {
                        v9_1 = v7;
                        v6 = v10;
                    }

                    v11_1 = (v5 + 1 - (v1.ae << 12) - v14) / v14;
                    if(v11_1 > v9_1) {
                        v9_1 = v11_1;
                    }

                    while(v9_1 < 0) {
                        v11_1 = v1.ax[(v3 >> 12) + v1.al * (v5 >> 12)];
                        if(v11_1 != 0) {
                            v0.ax[v6] = v11_1;
                            ++v6;
                        }
                        else {
                            ++v6;
                        }

                        v5 += v14;
                        ++v9_1;
                    }
                }

                ++v8;
                v3 -= v14;
                v10 += v0.al * -107049639;
            }
        }
        else {
            if(v12 < 0) {
                if(v14 == 0) {
                    while(true) {
                        if(v8 >= 0) {
                            return;
                        }

                        v5 = (v12 * v4 >> 4) + v3;
                        if(v2 < 0) {
                        }
                        else if(v2 - (v1.ae << 12) >= 0) {
                        }
                        else {
                            v6 = v5 - (v1.al << 12);
                            if(v6 >= 0) {
                                v6 = (v12 - v6) / v12;
                                v9_1 = v7 + v6;
                                v5 += v12 * v6;
                                v6 += v10;
                            }
                            else {
                                v9_1 = v7;
                                v6 = v10;
                            }

                            v11_1 = (v5 - v12) / v12;
                            if(v11_1 > v9_1) {
                                v9_1 = v11_1;
                            }

                            while(v9_1 < 0) {
                                v11_1 = v1.ax[(v2 >> 12) * v1.al + (v5 >> 12)];
                                if(v11_1 != 0) {
                                    v0.ax[v6] = v11_1;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v12;
                                ++v9_1;
                            }
                        }

                        ++v8;
                        v2 += v12;
                        v10 += v0.al * -107049639;
                    }
                }

                if(v14 < 0) {
                    while(true) {
                        if(v8 >= 0) {
                            return;
                        }

                        v5 = (v12 * v4 >> 4) + v3;
                        v6 = (v14 * v4 >> 4) + v2;
                        v9_1 = v5 - (v1.al << 12);
                        if(v9_1 >= 0) {
                            v9_1 = (v12 - v9_1) / v12;
                            v11_1 = v7 + v9_1;
                            v5 += v12 * v9_1;
                            v6 += v9_1 * v14;
                            v9_1 += v10;
                        }
                        else {
                            v11_1 = v7;
                            v9_1 = v10;
                        }

                        v13 = (v5 - v12) / v12;
                        if(v13 > v11_1) {
                            v11_1 = v13;
                        }

                        v13 = v6 - (v1.ae << 12);
                        if(v13 >= 0) {
                            v13 = (v14 - v13) / v14;
                            v11_1 += v13;
                            v5 += v13 * v12;
                            v6 += v14 * v13;
                            v9_1 += v13;
                        }

                        v13 = (v6 - v14) / v14;
                        if(v13 > v11_1) {
                            v11_1 = v13;
                        }

                        while(v11_1 < 0) {
                            v22 = v7;
                            v7 = v1.ax[(v5 >> 12) + v1.al * (v6 >> 12)];
                            if(v7 != 0) {
                                v0.ax[v9_1] = v7;
                                ++v9_1;
                            }
                            else {
                                ++v9_1;
                            }

                            v5 += v12;
                            v6 += v14;
                            ++v11_1;
                            v7 = v22;
                        }

                        ++v8;
                        v3 -= v14;
                        v2 += v12;
                        v10 += v0.al * -107049639;
                    }
                }

                v22 = v7;
                while(true) {
                    if(v8 >= 0) {
                        return;
                    }

                    v5 = (v12 * v4 >> 4) + v3;
                    v6 = (v4 * v14 >> 4) + v2;
                    v7 = v5 - (v1.al << 12);
                    if(v7 >= 0) {
                        v7 = (v12 - v7) / v12;
                        v9_1 = v22 + v7;
                        v5 += v12 * v7;
                        v6 += v7 * v14;
                        v7 += v10;
                    }
                    else {
                        v7 = v10;
                        v9_1 = v22;
                    }

                    v11_1 = (v5 - v12) / v12;
                    if(v11_1 > v9_1) {
                        v9_1 = v11_1;
                    }

                    if(v6 < 0) {
                        v11_1 = (v14 - 1 - v6) / v14;
                        v9_1 += v11_1;
                        v5 += v11_1 * v12;
                        v6 += v14 * v11_1;
                        v7 += v11_1;
                    }

                    v11_1 = (v6 + 1 - (v1.ae << 12) - v14) / v14;
                    if(v11_1 > v9_1) {
                        v9_1 = v11_1;
                    }

                    while(v9_1 < 0) {
                        v11_1 = v1.ax[(v5 >> 12) + v1.al * (v6 >> 12)];
                        if(v11_1 != 0) {
                            v0.ax[v7] = v11_1;
                            ++v7;
                        }
                        else {
                            ++v7;
                        }

                        v5 += v12;
                        v6 += v14;
                        ++v9_1;
                    }

                    ++v8;
                    v3 -= v14;
                    v2 += v12;
                    v10 += v0.al * -107049639;
                }
            }

            v22 = v7;
            if(v14 == 0) {
                while(true) {
                    if(v8 >= 0) {
                        return;
                    }

                    v5 = (v12 * v4 >> 4) + v3;
                    if(v2 < 0) {
                    }
                    else if(v2 - (v1.ae << 12) >= 0) {
                    }
                    else {
                        if(v5 < 0) {
                            v6 = (v12 - 1 - v5) / v12;
                            v7 = v22 + v6;
                            v5 += v6 * v12;
                            v6 += v10;
                        }
                        else {
                            v6 = v10;
                            v7 = v22;
                        }

                        v9_1 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                        if(v9_1 > v7) {
                        }
                        else {
                            v9_1 = v7;
                        }

                        while(v9_1 < 0) {
                            v7 = v1.ax[(v5 >> 12) + v1.al * (v2 >> 12)];
                            if(v7 != 0) {
                                v0.ax[v6] = v7;
                                ++v6;
                            }
                            else {
                                ++v6;
                            }

                            v5 += v12;
                            ++v9_1;
                        }
                    }

                    ++v8;
                    v2 += v12;
                    v10 += v0.al * 0x6F95C078;
                }
            }

            if(v14 < 0) {
                while(true) {
                    if(v8 < 0) {
                        v5 = (v12 * v4 >> 4) + v3;
                        v6 = (v4 * v14 >> 4) + v2;
                        if(v5 < 0) {
                            v7 = (v12 - 1 - v5) / v12;
                            v9_1 = v22 + v7;
                            v5 += v12 * v7;
                            v6 += v14 * v7;
                            v7 += v10;
                        }
                        else {
                            v7 = v10;
                            v9_1 = v22;
                        }

                        v11_1 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                        if(v11_1 > v9_1) {
                            v9_1 = v11_1;
                        }

                        v11_1 = v6 - (v1.ae << 12);
                        if(v11_1 >= 0) {
                            v11_1 = (v14 - v11_1) / v14;
                            v9_1 += v11_1;
                            v5 += v12 * v11_1;
                            v6 += v14 * v11_1;
                            v7 += v11_1;
                        }

                        v11_1 = (v6 - v14) / v14;
                        if(v11_1 > v9_1) {
                            v9_1 = v11_1;
                        }

                        while(v9_1 < 0) {
                            v11_1 = v1.ax[v1.al * (v6 >> 12) + (v5 >> 12)];
                            if(v11_1 != 0) {
                                v0.ax[v7] = v11_1;
                                ++v7;
                            }
                            else {
                                ++v7;
                            }

                            v5 += v12;
                            v6 += v14;
                            ++v9_1;
                        }

                        ++v8;
                        v3 -= v14;
                        v2 += v12;
                        v10 += v0.al * -107049639;
                        continue;
                    }
                    else {
                        return;
                    }
                }
            }

            while(v8 < 0) {
                v5 = (v12 * v4 >> 4) + v3;
                v6 = (v4 * v14 >> 4) + v2;
                if(v5 < 0) {
                    v7 = (v12 - 1 - v5) / v12;
                    v9_1 = v22 + v7;
                    v5 += v7 * v12;
                    v6 += v7 * v14;
                    v7 += v10;
                }
                else {
                    v7 = v10;
                    v9_1 = v22;
                }

                v11_1 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                if(v11_1 > v9_1) {
                    v9_1 = v11_1;
                }

                if(v6 < 0) {
                    v11_1 = (v14 - 1 - v6) / v14;
                    v9_1 += v11_1;
                    v5 += v12 * v11_1;
                    v6 += v14 * v11_1;
                    v7 += v11_1;
                }

                v11_1 = (v6 + 1 - (v1.ae << 12) - v14) / v14;
                if(v11_1 > v9_1) {
                    v9_1 = v11_1;
                }

                while(v9_1 < 0) {
                    v11_1 = v1.ax[(v5 >> 12) + v1.al * (v6 >> 12)];
                    if(v11_1 != 0) {
                        v0.ax[v7] = v11_1;
                        ++v7;
                    }
                    else {
                        ++v7;
                    }

                    v5 += v12;
                    v6 += v14;
                    ++v9_1;
                }

                ++v8;
                v3 -= v14;
                v2 += v12;
                v10 += v0.al * 0x5736788E;
            }
        }
    }

    public void ei(es arg32, int arg33, int arg34, int arg35, int arg36) {
        int v22;
        ec v0 = this;
        es v1 = arg32;
        int v4 = arg35;
        int v5 = arg36;
        if(v4 <= v1.ap && v5 <= v1.aj) {
            int v6 = arg33 + v1.ar * v4 / v1.ap;
            int v7 = ((v1.al + v1.ar) * v4 + v1.ap - 1) / v1.ap + arg33;
            int v9 = arg34 + v1.an * v5 / v1.aj;
            int v10 = arg34 + ((v1.ae + v1.an) * v5 + v1.aj - 1) / v1.aj;
            if(v6 < v0.ap * 0x49E21B39) {
                v6 = v0.ap * 0xB423F4A4;
            }

            if(v7 > v0.aj * 0xF3B2AED0) {
                v7 = 0x56AC17CD * v0.aj;
            }

            int v12 = 2002832733;
            if(v9 < v0.ar * v12) {
                v9 = v0.ar * v12;
            }

            if(v10 > v0.an * 1131095448) {
                v10 = v0.an * 0x3068E2F4;
            }

            if(v6 < v7) {
                if(v9 >= v10) {
                }
                else {
                    int v11 = v0.al * -107049639 * v9 + v6;
                    v12 = v0.al * 0x3290FAE - (v7 - v6);
                    if(v11 >= v0.ax.length) {
                        return;
                    }

                    while(v9 < v10) {
                        int v13 = v11;
                        v11 = v6;
                        while(v11 < v7) {
                            int v14 = v11 - arg33 << 4;
                            int v15 = v9 - arg34 << 4;
                            int v8 = v1.ap * v14 / v4 - (v1.ar << 4);
                            v14 = (v14 + 16) * v1.ap / v4 - (v1.ar << 4);
                            int v2 = v1.aj * v15 / v5 - (v1.an << 4);
                            int v3 = v1.aj * (v15 + 16) / v5 - (v1.an << 4);
                            v15 = (v3 - v2) * (v14 - v8) >> 1;
                            if(v15 == 0) {
                                v22 = v6;
                            }
                            else {
                                int v17 = 0;
                                if(v8 < 0) {
                                    v8 = 0;
                                }

                                if(v14 >= v1.al << 4) {
                                    v14 = v1.al << 4;
                                }

                                if(v2 < 0) {
                                    v2 = 0;
                                }

                                if(v3 >= v1.ae << 4) {
                                    v3 = v1.ae << 4;
                                }

                                --v14;
                                --v3;
                                v4 = 16 - (v8 & 15);
                                int v19 = (v14 & 15) + 1;
                                int v20 = 16 - (v2 & 15);
                                int v21 = (v3 & 15) + 1;
                                v8 >>= 4;
                                v14 >>= 4;
                                v2 >>= 4;
                                v3 >>= 4;
                                v5 = v2;
                                v22 = v6;
                                v6 = 0;
                                int v23 = 0;
                                int v24 = 0;
                                while(v5 <= v3) {
                                    int v25 = v2 == v5 ? v20 : 16;
                                    if(v3 == v5) {
                                        v25 = v21;
                                    }

                                    int v26 = v6;
                                    v6 = v8;
                                    while(v6 <= v14) {
                                        int v27 = v2;
                                        int v28 = v3;
                                        v2 = v1.ax[v1.al * v5 + v6];
                                        if(v2 != 0) {
                                            if(v8 == v6) {
                                                v3 = v25 * v4;
                                            }
                                            else if(v6 == v14) {
                                                v3 = v25 * v19;
                                            }
                                            else {
                                                v3 = v25 << 4;
                                            }

                                            v26 += v3;
                                            v24 += (v2 >> 16 & 750068837) * v3;
                                            v23 += (v2 >> 8 & -1322797032) * v3;
                                            v17 += (v2 & 0xFF) * v3;
                                        }

                                        ++v6;
                                        v2 = v27;
                                        v3 = v28;
                                    }

                                    ++v5;
                                    v6 = v26;
                                }

                                if(v6 >= v15) {
                                    v8 = v17 / v6 + ((v23 / v6 << 8) + (v24 / v6 << 16));
                                    if(v8 == 0) {
                                        v8 = 1;
                                    }

                                    v0.ax[v13] = v8;
                                }

                                ++v13;
                            }

                            ++v11;
                            v6 = v22;
                            v4 = arg35;
                            v5 = arg36;
                        }

                        v11 = v13 + v12;
                        ++v9;
                        v6 = v6;
                        v4 = arg35;
                        v5 = arg36;
                    }

                    return;
                }
            }

            return;
        }

        throw new IllegalArgumentException();
    }

    public void ej(es arg17, int arg18, int arg19, int arg20, int arg21, int arg22) {
        int v14;
        int v13;
        int v9;
        int v7;
        ec v0 = this;
        es v1 = arg17;
        if(arg20 > 0) {
            if(arg21 <= 0) {
            }
            else {
                int v12 = v1.al;
                int v4 = v1.ae;
                int v5 = v1.ap;
                int v6 = v1.aj;
                int v10 = (v5 << 16) / arg20;
                int v11 = (v6 << 16) / arg21;
                int v8 = 0;
                if(v1.ar > 0) {
                    v7 = ((v1.ar << 16) + v10 - 1) / v10;
                    v9 = arg18 + v7;
                    v7 = v7 * v10 - (v1.ar << 16);
                }
                else {
                    v9 = arg18;
                    v7 = 0;
                }

                if(v1.an > 0) {
                    v13 = ((v1.an << 16) + v11 - 1) / v11;
                    v14 = arg19 + v13;
                    v8 = v13 * v11 - (v1.an << 16);
                }
                else {
                    v14 = arg19;
                }

                int v2 = v12 < v5 ? ((v12 << 16) - v7 + v10 - 1) / v10 : arg20;
                int v3 = v4 < v6 ? ((v4 << 16) - v8 + v11 - 1) / v11 : arg21;
                v4 = v0.al * -107049639 * v14 + v9;
                v13 = v0.al * -265450055 - v2;
                v6 = v14 + v3;
                if(v6 > v0.an * 0xD21DC9D7) {
                    v3 -= v6 - v0.an * 2092017312;
                }

                if(v14 < v0.ar * 0x5B2C75AF) {
                    v5 = v0.ar * -1970795061 - v14;
                    v3 -= v5;
                    v4 += v0.al * -107049639 * v5;
                    v8 += v5 * v11;
                }

                v14 = v3;
                v5 = v8;
                v3 = v9 + v2;
                if(v3 > v0.aj * -1833272602) {
                    v3 -= v0.aj * 0x958D2F7D;
                    v2 -= v3;
                    v13 += v3;
                }

                if(v9 < v0.ap * 0xE4D30573) {
                    v6 = v0.ap * 0xE61EFE6A - v9;
                    v2 -= v6;
                    v4 += v6;
                    v7 += v10 * v6;
                    v13 += v6;
                }

                cr.bw(v0.ax, v1.ax, 0, v7, v5, v4, v13, v2, v14, v10, v11, v12, arg22, 0x6AE6CF95);
                return;
            }
        }
    }

    public void ek(es arg23, int arg24, int arg25, int arg26) {
        ec v0 = this;
        es v1 = arg23;
        int v2 = arg24 + v1.ar;
        int v3 = arg25 + v1.an;
        int v4 = v0.al * -107049639 * v3 + v2;
        int v6 = v1.ae;
        int v7 = v1.al;
        int v8 = v0.al * -107049639 - v7;
        int v9 = 2002832733;
        int v10 = 0;
        if(v3 < v0.ar * v9) {
            int v5 = v0.ar * v9 - v3;
            v6 -= v5;
            v3 = v0.ar * 0xB4875D4C;
            v9 = v5 * v7;
            v4 += v5 * (v0.al * 1032451097);
        }
        else {
            v9 = 0;
        }

        v3 += v6;
        if(v3 > v0.an * 0xD21DC9D7) {
            v6 -= v3 - v0.an * 1146014085;
        }

        int v17 = v6;
        if(v2 < v0.ap * 0xE4D30573) {
            v3 = v0.ap * 0x5A91F491 - v2;
            v7 -= v3;
            v2 = v0.ap * 0x77275508;
            v9 += v3;
            v4 += v3;
            v10 = v3;
            v8 += v3;
        }

        int v15 = v4;
        int v14 = v9;
        v2 += v7;
        if(v2 > v0.aj * 0x257673FD) {
            v2 -= v0.aj * -1736014775;
            v7 -= v2;
            v10 += v2;
            v8 += v2;
        }

        int v16 = v7;
        int v18 = v8;
        int v19 = v10;
        if(v16 > 0) {
            if(v17 <= 0) {
            }
            else {
                cn.bn(v0.ax, v1.ax, 0, v14, v15, v16, v17, v18, v19, arg26, 0xA1EB32FE);
                return;
            }
        }
    }

    static void el(int[] arg14, int[] arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26) {
        int v0 = arg26;
        int v1 = 0x100 - v0;
        int v2 = -arg22;
        int v3 = arg18;
        int v4;
        for(v4 = arg19; v2 < 0; v4 = v8 + arg20) {
            int v5 = (v3 >> 16) * arg25;
            int v7 = -arg21;
            int v8 = v4;
            v4 = arg17;
            while(v7 < 0) {
                int v9 = arg15[(v4 >> 16) + v5];
                if(v9 != 0) {
                    arg14[v8] = ((0xDE71DFF6 & arg14[v8]) * v1 + (0xFF00FF & v9) * v0 & 0xEB801262) + ((v9 & 0xCBAFD6D2) * v0 + (arg14[v8] & 0xF4AD4A25) * v1 & 0xFF0000) >> 8;
                    ++v8;
                }
                else {
                    ++v8;
                }

                v4 += arg23;
                ++v7;
            }

            v3 += arg24;
            ++v2;
        }
    }

    public void em(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        int v14;
        int v13;
        int v9;
        int v7;
        ec v0 = this;
        es v1 = arg18;
        if(arg21 > 0) {
            if(arg22 <= 0) {
            }
            else {
                int v12 = v1.al;
                int v4 = v1.ae;
                int v5 = v1.ap;
                int v6 = v1.aj;
                int v10 = (v5 << 16) / arg21;
                int v11 = (v6 << 16) / arg22;
                int v8 = 0;
                if(v1.ar > 0) {
                    v7 = ((v1.ar << 16) + v10 - 1) / v10;
                    v9 = arg19 + v7;
                    v7 = v7 * v10 - (v1.ar << 16);
                }
                else {
                    v9 = arg19;
                    v7 = 0;
                }

                if(v1.an > 0) {
                    v13 = ((v1.an << 16) + v11 - 1) / v11;
                    v14 = arg20 + v13;
                    v8 = v13 * v11 - (v1.an << 16);
                }
                else {
                    v14 = arg20;
                }

                int v2 = v12 < v5 ? ((v12 << 16) - v7 + v10 - 1) / v10 : arg21;
                int v3 = v4 < v6 ? ((v4 << 16) - v8 + v11 - 1) / v11 : arg22;
                v5 = v0.al * 0xC976BD91 * v14 + v9;
                v4 = v0.al * -107049639 - v2;
                v13 = v14 + v3;
                if(v13 > v0.an * 0xD21DC9D7) {
                    v3 -= v13 - v0.an * 0xCAE2181;
                }

                if(v14 < v0.ar * 0xD908CD3A) {
                    v6 = v0.ar * 0x63A4D4BD - v14;
                    v3 -= v6;
                    v5 += v0.al * -107049639 * v6;
                    v8 += v6 * v11;
                }

                v13 = v3;
                v3 = v9 + v2;
                if(v3 > v0.aj * 0x9C9DF80C) {
                    v3 -= v0.aj * 0x56AC17CD;
                    v2 -= v3;
                    v4 += v3;
                }

                if(v9 < v0.ap * 0xBF598F7C) {
                    v6 = v0.ap * 0xE4D30573 - v9;
                    v2 -= v6;
                    v5 += v6;
                    v7 += v10 * v6;
                    v4 += v6;
                }

                cr.bw(v0.ax, v1.ax, 0, v7, v8, v5, v4, v2, v13, v10, v11, v12, arg23, 0x76C251A);
                return;
            }
        }
    }

    static void en(int[] arg14, int[] arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26) {
        int v0 = arg26;
        int v1 = 0x100 - v0;
        int v2 = -arg22;
        int v3 = arg18;
        int v4 = arg19;
        while(v2 < 0) {
            int v5 = (v3 >> 16) * arg25;
            int v7 = -arg21;
            int v8 = arg17;
            while(v7 < 0) {
                int v9 = arg15[(v8 >> 16) + v5];
                if(v9 != 0) {
                    arg14[v4] = (0xFF00FF00 & (arg14[v4] & 0xFF00FF) * v1 + (0xFF00FF & v9) * v0) + ((v9 & 0xFF00) * v0 + (arg14[v4] & 0xFF00) * v1 & 0xFF0000) >> 8;
                    ++v4;
                }
                else {
                    ++v4;
                }

                v8 += arg23;
                ++v7;
            }

            v3 += arg24;
            v4 += arg20;
            ++v2;
        }
    }

    static void eq(int[] arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        arg8 = 0x3D30919B - arg15;
        for(arg12 = -arg12; arg12 < 0; ++arg12) {
            int v0 = -arg11;
            while(v0 < 0) {
                int v1 = arg9 + 1;
                arg9 = arg7[arg9];
                if(arg9 != 0) {
                    int v2 = arg6[arg10];
                    if(v2 == 0) {
                        v2 = arg10 + 1;
                        arg6[arg10] = arg9 | arg8 - 0x6CD34AAF << 24;
                    }
                    else {
                        arg6[arg10] = ((0x15C4DBC5 & arg9) * arg15 + (-1078164390 & v2) * arg8 & 0xFF00FF00) + ((arg9 & 0xBC4A4527) * arg15 + (v2 & 0xFF00) * arg8 & -1766568820) >> 8;
                        v2 = arg10 + 1;
                    }

                    arg10 = v2;
                }
                else {
                    ++arg10;
                }

                ++v0;
                arg9 = v1;
            }

            arg10 += arg13;
            arg9 += arg14;
        }
    }

    static void er(int[] arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        arg8 = 0x100 - arg15;
        for(arg12 = -arg12; arg12 < 0; ++arg12) {
            int v0 = -arg11;
            while(v0 < 0) {
                int v1 = arg9 + 1;
                arg9 = arg7[arg9];
                if(arg9 != 0) {
                    int v2 = arg6[arg10];
                    if(v2 == 0) {
                        v2 = arg10 + 1;
                        arg6[arg10] = arg9 | arg8 - 0x30 << 24;
                    }
                    else {
                        arg6[arg10] = (0xFF00FF00 & (arg9 & 0xFF00FF) * arg15 + (0xFF00FF & v2) * arg8) + ((arg9 & 0xFF00) * arg15 + (v2 & 0xFF00) * arg8 & 0xFF0000) >> 8;
                        v2 = arg10 + 1;
                    }

                    arg10 = v2;
                }
                else {
                    ++arg10;
                }

                ++v0;
                arg9 = v1;
            }

            arg10 += arg13;
            arg9 += arg14;
        }
    }

    public void es(es arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, double arg24, int arg26) {
        ec v0 = this;
        es v1 = arg17;
        int v2 = arg21;
        int v4 = -arg20;
        try {
            int v5 = v4 / 2;
            int v6 = -v2 / 2;
            int v7 = (((int)(Math.sin(arg24) * 65536))) * arg26 >> 8;
            int v3 = (((int)(Math.cos(arg24) * 65536))) * arg26 >> 8;
            int v8 = (arg22 << 16) + (v7 * v6 + v3 * v5);
            v6 = v6 * v3 - v5 * v7 + (arg23 << 16);
            v5 = arg18 + v0.al * 0x30F9E76E * arg19;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v10 = v4;
                int v13 = v5;
                int v11 = v6;
                int v12 = v8;
                while(v10 < 0) {
                    v2 = v1.ax[(v11 >> 16) * v1.al + (v12 >> 16)];
                    if(v2 != 0) {
                        v0.ax[v13] = v2;
                        ++v13;
                    }
                    else {
                        ++v13;
                    }

                    v12 += v3;
                    v11 -= v7;
                    ++v10;
                }

                v8 += v7;
                v6 += v3;
                v5 += v0.al * 0x732E5CC7;
                ++v9;
                v2 = arg21;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    public void eu(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int[] arg27, int[] arg28) {
        ec v0 = this;
        es v1 = arg18;
        int v2 = arg22;
        int v4 = -arg21;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg25)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = v8 * arg26 >> 8;
            int v3 = v6_1 * arg26 >> 8;
            v6_1 = (arg23 << 16) + (v3 * v4 + v5 * v7);
            v8 = (arg24 << 16) + (v5 * v3 - v4 * v7);
            v4 = arg19 + v0.al * -107049639 * arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg27[v9];
                int v13 = arg27[v9] * v3 + v6_1;
                int v11 = v8 - arg27[v9] * v7;
                int v14 = -arg28[v9];
                while(v14 < 0) {
                    v0.ax[v12] = v1.ax[(v11 >> 16) * v1.al + (v13 >> 16)];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v0.al * -107049639;
                ++v9;
                v2 = arg22;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    public void ev(es arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14, int[] arg15) {
        int v3;
        int v2;
        int v0 = 0;
        int v1 = arg9 < 0 ? -arg9 : 0;
        if(arg7.ae + arg9 <= arg13) {
            arg13 = arg7.ae;
        }
        else {
            arg13 -= arg9;
        }

        if(arg8 < 0) {
            v0 = -arg8;
        }

        arg11 = (arg11 + arg9 + v1) * (this.al * 0x356A1F2E) + (arg10 + arg8 + v0);
        arg9 += v1;
        while(v1 < arg13) {
            arg10 = arg14[arg9];
            arg12 = arg9 + 1;
            arg9 = arg15[arg9];
            if(arg8 < arg10) {
                v2 = arg10 - arg8;
                v3 = v2 - v0 + arg11;
            }
            else {
                v3 = arg11;
                v2 = v0;
            }

            arg9 += arg10;
            if(arg7.al + arg8 <= arg9) {
                arg9 = arg7.al;
            }
            else {
                arg9 -= arg8;
            }

            while(v2 < arg9) {
                arg10 = arg7.ax[arg7.al * v1 + v2];
                if(arg10 != 0) {
                    this.ax[v3] = arg10;
                    ++v3;
                }
                else {
                    ++v3;
                }

                ++v2;
            }

            arg11 += this.al * 225603157;
            ++v1;
            arg9 = arg12;
        }
    }

    public void ew(es arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int[] arg24, int[] arg25) {
        int v13;
        int v12;
        ec v0 = this;
        es v1 = arg17;
        int v2 = arg18;
        int v3 = arg19;
        int v4 = arg23;
        int v5 = 0;
        int v6 = v3 < 0 ? -v3 : 0;
        if(v1.ae + v3 <= v4) {
            v4 = v1.ae;
        }
        else {
            v4 -= v3;
        }

        if(v2 < 0) {
            v5 = -v2;
        }

        int v9 = -107049639;
        int v7 = (arg21 + v3 + v6) * (v0.al * v9) + (v2 + arg20 + v5);
        v3 += v6;
        while(v6 < v4) {
            int v10 = arg24[v3];
            int v11 = v3 + 1;
            v3 = arg25[v3];
            if(v2 < v10) {
                v12 = v10 - v2;
                v13 = v12 - v5 + v7;
            }
            else {
                v12 = v5;
                v13 = v7;
            }

            v3 += v10;
            if(v1.al + v2 <= v3) {
                v3 = v1.al;
            }
            else {
                v3 -= v2;
            }

            while(v12 < v3) {
                v10 = v1.ax[v1.al * v6 + v12];
                if(v10 != 0) {
                    v0.ax[v13] = v10;
                    ++v13;
                }
                else {
                    ++v13;
                }

                ++v12;
            }

            v7 += v0.al * v9;
            ++v6;
            v3 = v11;
        }
    }

    public void ey(es arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        int v14;
        int v13;
        int v9;
        int v7;
        ec v0 = this;
        es v1 = arg19;
        if(arg22 > 0) {
            if(arg23 <= 0) {
            }
            else {
                int v12 = v1.al;
                int v4 = v1.ae;
                int v5 = v1.ap;
                int v6 = v1.aj;
                int v10 = (v5 << 16) / arg22;
                int v11 = (v6 << 16) / arg23;
                int v8 = 0;
                if(v1.ar > 0) {
                    v7 = ((v1.ar << 16) + v10 - 1) / v10;
                    v9 = arg20 + v7;
                    v7 = v7 * v10 - (v1.ar << 16);
                }
                else {
                    v9 = arg20;
                    v7 = 0;
                }

                if(v1.an > 0) {
                    v13 = ((v1.an << 16) + v11 - 1) / v11;
                    v14 = arg21 + v13;
                    v8 = v13 * v11 - (v1.an << 16);
                }
                else {
                    v14 = arg21;
                }

                int v2 = v12 < v5 ? ((v12 << 16) - v7 + v10 - 1) / v10 : arg22;
                int v3 = v4 < v6 ? ((v4 << 16) - v8 + v11 - 1) / v11 : arg23;
                v5 = -107049639;
                v4 = v0.al * v5 * v14 + v9;
                v6 = v0.al * v5 - v2;
                v13 = v14 + v3;
                int v16 = 0xD21DC9D7;
                if(v13 > v0.an * v16) {
                    v3 -= v13 - v0.an * v16;
                }

                int v15 = 2002832733;
                if(v14 < v0.ar * v15) {
                    v13 = v0.ar * v15 - v14;
                    v3 -= v13;
                    v4 += v0.al * v5 * v13;
                    v8 += v13 * v11;
                }

                v13 = v3;
                v5 = v8;
                v3 = v9 + v2;
                v14 = 0x56AC17CD;
                if(v3 > v0.aj * v14) {
                    v3 -= v0.aj * v14;
                    v2 -= v3;
                    v6 += v3;
                }

                v8 = 0xE4D30573;
                if(v9 < v0.ap * v8) {
                    v3 = v0.ap * v8 - v9;
                    v2 -= v3;
                    v4 += v3;
                    v7 += v10 * v3;
                    v6 += v3;
                }

                cr.bw(v0.ax, v1.ax, 0, v7, v5, v4, v6, v2, v13, v10, v11, v12, arg24, 0xFA3ECBF4);
                return;
            }
        }
    }

    public void ez(es arg23, int arg24, int arg25, int arg26) {
        int v10;
        ec v0 = this;
        es v1 = arg23;
        int v2 = arg24 + v1.ar;
        int v3 = arg25 + v1.an;
        int v5 = v0.al * -1691860161 * v3 + v2;
        int v4 = v1.ae;
        int v6 = v1.al;
        int v7 = v0.al * 700307107 - v6;
        int v8 = 0;
        if(v3 < v0.ar * 2002832733) {
            int v9 = v0.ar * 0x5460CA06 - v3;
            v4 -= v9;
            v3 = v0.ar * 0x7DAC1E5;
            v10 = v9 * v6;
            v5 += v9 * (v0.al * -107049639);
        }
        else {
            v10 = 0;
        }

        v3 += v4;
        if(v3 > v0.an * 1763061030) {
            v4 -= v3 - v0.an * 0xD21DC9D7;
        }

        int v17 = v4;
        if(v2 < v0.ap * 243841303) {
            v3 = v0.ap * 0xE4D30573 - v2;
            v6 -= v3;
            v2 = v0.ap * 0xE4D30573;
            v10 += v3;
            v5 += v3;
            v8 = v3;
            v7 += v3;
        }

        int v15 = v5;
        int v14 = v10;
        v2 += v6;
        if(v2 > v0.aj * 0x5DF77614) {
            v2 -= v0.aj * 0x56AC17CD;
            v6 -= v2;
            v8 += v2;
            v7 += v2;
        }

        int v16 = v6;
        int v18 = v7;
        int v19 = v8;
        if(v16 > 0) {
            if(v17 <= 0) {
            }
            else {
                cn.bn(v0.ax, v1.ax, 0, v14, v15, v16, v17, v18, v19, arg26, -2079939095);
                return;
            }
        }
    }
}

