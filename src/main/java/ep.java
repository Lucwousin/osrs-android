import com.jagex.oldscape.osrenderer.ax;

public class ep extends fa {
    static final int fv = 104;

    public ep(int[] arg1, int arg2, int arg3) {
        try {
            super(arg1, arg2, arg3);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ep.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
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
                    ez.az(this.ax, arg10.ax, v5, v13, v4, arg12, v6, v7, 0x66F9CEBC);
                    return;
                }
            }
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("ep.aa(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    final void ab(int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if(arg13 <= 0) {
            return;
        }

        arg14 = 0xFF;
        if(arg13 < arg14) {
            goto label_12;
        }

        int v5 = 0x1795F574;
        ep v0 = this;
        int v1 = arg9;
        int v2 = arg10;
        int v3 = arg11;
        int v4 = arg12;
        try {
            v0.aq(v1, v2, v3, v4, v5);
            return;
        label_12:
            if(arg9 >= this.ap * 0xE4D30573) {
                if(arg9 >= this.aj * 0x56AC17CD) {
                }
                else {
                    v1 = 2002832733;
                    if(arg10 < this.ar * v1) {
                        arg11 -= this.ar * v1 - arg10;
                        arg10 = this.ar * v1;
                    }

                    v2 = 0xD21DC9D7;
                    if(arg11 + arg10 > this.an * v2) {
                        arg11 = this.an * v2 - arg10;
                    }

                    int v0_1 = 0xFF - arg13;
                    v1 = arg13 << 24;
                    v2 = (arg12 >> 16 & arg14) * arg13;
                    v3 = (arg12 >> 8 & arg14) * arg13;
                    arg13 *= arg12 & 0xFF;
                    arg12 |= v1;
                    v5 = -107049639;
                    arg9 += this.al * v5 * arg10;
                    for(arg10 = 0; true; ++arg10) {
                        if(arg10 >= arg11) {
                            return;
                        }

                        this.ax[arg9] = this.ax[arg9] == 0 ? arg12 : (this.ax[arg9] | v1) & 0xFF000000 | ((this.ax[arg9] & arg14) * v0_1 + arg13 >> 8) + (((this.ax[arg9] >> 16 & arg14) * v0_1 + v2 >> 8 << 16) + ((this.ax[arg9] >> 8 & arg14) * v0_1 + v3 >> 8 << 8));
                        arg9 += this.al * v5;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v9) {
            goto label_104;
        }

        return;
    label_104:
        StringBuilder v10 = new StringBuilder();
        v10.append("ep.ab(");
        v10.append(')');
        throw lx.al(((Throwable)v9), v10.toString());
    }

    final void ad(int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if(arg13 <= 0) {
            return;
        }

        arg14 = 0xFF;
        if(arg13 < arg14) {
            goto label_14;
        }

        int v5 = 0x743C8F;
        ep v0 = this;
        int v1 = arg9;
        int v2 = arg10;
        int v3 = arg11;
        int v4 = arg12;
        try {
            v0.aj(v1, v2, v3, v4, v5);
            return;
        label_14:
            if(arg10 >= this.ar * 2002832733) {
                if(arg10 >= this.an * 0xD21DC9D7) {
                }
                else {
                    v1 = 0xE4D30573;
                    if(arg9 < this.ap * v1) {
                        arg11 -= this.ap * v1 - arg9;
                        arg9 = this.ap * v1;
                    }

                    v2 = 0x56AC17CD;
                    if(arg9 + arg11 > this.aj * v2) {
                        arg11 = this.aj * v2 - arg9;
                    }

                    int v0_1 = 0xFF - arg13;
                    v1 = arg13 << 24;
                    v2 = (arg12 >> 16 & arg14) * arg13;
                    v3 = (arg12 >> 8 & arg14) * arg13;
                    arg13 *= arg12 & 0xFF;
                    arg12 |= v1;
                    arg9 += arg10 * (this.al * -107049639);
                    arg10 = 0;
                    while(true) {
                    label_58:
                        if(arg10 >= arg11) {
                            return;
                        }

                        if(this.ax[arg9] == 0) {
                            this.ax[arg9] = arg12;
                            ++arg9;
                        }
                        else {
                            this.ax[arg9] = ((this.ax[arg9] >> 16 & arg14) * v0_1 + v2 >> 8 << 16) + ((this.ax[arg9] >> 8 & arg14) * v0_1 + v3 >> 8 << 8) + ((this.ax[arg9] & arg14) * v0_1 + arg13 >> 8) | (this.ax[arg9] | v1) & 0xFF000000;
                            ++arg9;
                        }

                        goto label_101;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v9) {
            goto label_105;
        }

    label_101:
        ++arg10;
        goto label_58;
        return;
    label_105:
        StringBuilder v10 = new StringBuilder();
        v10.append("ep.ad(");
        v10.append(')');
        throw lx.al(((Throwable)v9), v10.toString());
    }

    public final void ae(int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        int v11;
        int v10;
        ep v8 = this;
        int v0 = arg18;
        int v3 = arg19;
        int v1 = arg23;
        if(v1 == 0) {
            return;
        }

        int v2 = 0xFF;
        if(v1 < v2) {
            goto label_19;
        }

        byte v7 = 2;
        ep v1_1 = this;
        v2 = arg18;
        v3 = arg19;
        int v4 = arg20;
        int v5 = arg21;
        int v6 = arg22;
        try {
            v1_1.ar(v2, v3, v4, v5, v6, v7);
            return;
        label_19:
            v4 = v1 << 24;
            v5 = v4 | arg22;
            int v9 = 0xE4D30573;
            if(v0 < v8.ap * v9) {
                v10 = arg20 - (v8.ap * v9 - v0);
                v0 = v8.ap * v9;
            }
            else {
                v10 = arg20;
            }

            v9 = 2002832733;
            if(v3 < v8.ar * v9) {
                v11 = arg21 - (v8.ar * v9 - v3);
                v3 = v8.ar * v9;
            }
            else {
                v11 = arg21;
            }

            int v12 = 0x56AC17CD;
            if(v10 + v0 > v8.aj * v12) {
                v10 = v8.aj * v12 - v0;
            }

            v12 = 0xD21DC9D7;
            if(v11 + v3 > v8.an * v12) {
                v11 = v8.an * v12 - v3;
            }

            int v7_1 = 0xFF00;
            v12 = 0xFF00FF;
            v9 = ((arg22 & v7_1) * v1 >> 8 & v7_1) + ((arg22 & v12) * v1 >> 8 & v12);
            v2 -= v1;
            v1 = v8.al * -107049639 - v10;
            v3 = v3 * (v8.al * -107049639) + v0;
            v0 = 0;
            while(true) {
            label_86:
                if(v0 >= v11) {
                    return;
                }

                v6 = -v10;
                while(true) {
                label_88:
                    if(v6 >= 0) {
                        goto label_120;
                    }

                    int v13 = v8.ax[v3];
                    if(v13 == 0) {
                        v8.ax[v3] = v5;
                        ++v3;
                    }
                    else {
                        int v14 = 0xFF000000;
                        if((v13 & v14) == 0) {
                        }
                        else {
                            v14 &= v13 | v4;
                        }

                        v8.ax[v3] = v14 | ((v13 & v7_1) * v2 >> 8 & v7_1) + ((v13 & v12) * v2 >> 8 & v12) + v9;
                        ++v3;
                    }

                    break;
                }
            }
        }
        catch(RuntimeException v0_1) {
            goto label_124;
        }

        ++v6;
        goto label_88;
    label_120:
        v3 += v1;
        ++v0;
        goto label_86;
        return;
    label_124:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ep.ae(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0_1), v1_2.toString());
    }

    public final void af(int arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        int v16;
        int v0_1;
        int v3;
        ep v7 = this;
        int v5 = arg22 - 0x1000000 & 0xFFFFFF;
        int v1 = arg20 - arg18;
        int v2 = arg21 - arg19;
        if(v2 != 0) {
            goto label_26;
        }

        if(v1 >= 0) {
            int v4 = v1 + 1;
            int v6 = 0x30935367;
            ep v1_1 = this;
            v2 = arg18;
            v3 = arg19;
            try {
                v1_1.aj(v2, v3, v4, v5, v6);
                return;
            label_16:
                this.aj(v1 + arg18, arg19, -v1 + 1, v5, 0x748FC402);
                return;
            label_26:
                if(v1 == 0) {
                    if(v2 >= 0) {
                        this.aq(arg18, arg19, v2 + 1, v5, 0x1795F574);
                    }
                    else {
                        this.aq(arg18, arg19 + v2, -v2 + 1, v5, 0x1795F574);
                    }

                    return;
                }

                if(v2 + v1 < 0) {
                    v0_1 = arg18 + v1;
                    v1 = -v1;
                    v3 = arg19 + v2;
                    v2 = -v2;
                }
                else {
                    v0_1 = arg18;
                    v3 = arg19;
                }

                double v8 = 0.5;
                v6 = 0x8000;
                int v10 = 0x56AC17CD;
                int v11 = 0xD21DC9D7;
                int v12 = 0xE4D30573;
                int v13 = 2002832733;
                if(v1 > v2) {
                    v3 = (v3 << 16) + v6;
                    v16 = v5;
                    v2 = ((int)Math.floor((((double)(v2 << 16))) / (((double)v1)) + v8));
                    v1 += v0_1;
                    if(v0_1 < v7.ap * v12) {
                        v3 += (v7.ap * v12 - v0_1) * v2;
                        v0_1 = v7.ap * v12;
                    }

                    if(v1 >= v7.aj * v10) {
                        v1 = v7.aj * v10 - 1;
                    }

                    while(true) {
                        if(v0_1 > v1) {
                            return;
                        }

                        v4 = v3 >> 16;
                        if(v4 >= v7.ar * v13 && v4 < v7.an * v11) {
                            v7.ax[v7.al * -107049639 * v4 + v0_1] = v16;
                        }

                        v3 += v2;
                        ++v0_1;
                    }
                }
                else {
                    v16 = v5;
                    v0_1 = (v0_1 << 16) + v6;
                    v1 = ((int)Math.floor((((double)(v1 << 16))) / (((double)v2)) + v8));
                    v2 += v3;
                    if(v3 < v7.ar * v13) {
                        v0_1 += (v7.ar * v13 - v3) * v1;
                        v3 = v7.ar * v13;
                    }

                    if(v2 >= v7.an * v11) {
                        v2 = v7.an * v11 - 1;
                    }

                    while(true) {
                    label_131:
                        if(v3 > v2) {
                            return;
                        }

                        v4 = v0_1 >> 16;
                        if(v4 >= v7.ap * v12 && v4 < v7.aj * v10) {
                            v7.ax[v7.al * -107049639 * v3 + v4] = v16;
                        }

                        goto label_148;
                    }
                }

                return;
            }
            catch(RuntimeException v0) {
                goto label_152;
            }
        }
        else {
            goto label_16;
        }

        return;
    label_148:
        v0_1 += v1;
        ++v3;
        goto label_131;
    label_152:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ep.af(");
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
                v5 = v2 * v4;
                v14 += v4 * (this.al * v0);
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
                    cb.ay(this.ax, arg11.ax, arg11.al, v5, v4, arg12, arg13, v7, v8, 0x8B326D8F);
                    return;
                }
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("ep.ag(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    public final void ai(int arg18, int arg19, int arg20, int arg21, byte arg22) {
        int v12;
        int v15;
        int v14;
        int v13;
        int v10;
        int v9;
        int v8;
        int v5;
        ep v1 = this;
        int v0 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        int v4 = arg21 | 0xFF000000;
        if(v3 != 0) {
            goto label_12;
        }

        v3 = 0xB079B0B6;
        try {
            v1.fe(v0, v2, v4, v3);
            return;
        label_12:
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
            label_87:
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

                v11 = v0 + v3;
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
            goto label_134;
        }

        ++v5;
        v8 += v2 + v2;
        v10 = v2 + 1;
        v9 += v2 + v10;
        v2 = v10;
        v13 = 0x56AC17CD;
        goto label_87;
        return;
    label_134:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("ep.ai(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public final void aj(int arg3, int arg4, int arg5, int arg6, int arg7) {
        arg6 |= 0xFF000000;
        arg7 = 2002832733;
        try {
            if(arg4 >= this.ar * arg7) {
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

                    arg3 += this.al * -107049639 * arg4;
                    for(arg4 = 0; true; ++arg4) {
                        if(arg4 >= arg5) {
                            return;
                        }

                        this.ax[arg3 + arg4] = arg6;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v3) {
            goto label_45;
        }

        return;
    label_45:
        StringBuilder v4 = new StringBuilder();
        v4.append("ep.aj(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public void al(byte arg3) {
        try {
            if(this.ax != null) {
                ax.ba(this.ax, this.ax.length, 0x7F080096);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ep.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
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
                arg14 += v4 * (this.al * v0);
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
                    az.ah(this.ax, arg11.ax, 0, v5, v4, arg12, arg13, v7, v8, -11288);
                    return;
                }
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("ep.am(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    public final void an(int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29) {
        int v8;
        int v4;
        int v3;
        int v7;
        ep v1 = this;
        int v0 = arg21;
        int v2 = arg22;
        if(arg23 > 0) {
            if(arg24 <= 0) {
            }
            else {
                int v5 = 0;
                int v6 = 0x10000;
                try {
                    v7 = v6 / arg24;
                    int v9 = 0xE4D30573;
                    if(v0 < v1.ap * v9) {
                        v3 = arg23 - (v1.ap * v9 - v0);
                        v0 = v1.ap * v9;
                    }
                    else {
                        v3 = arg23;
                    }

                    v9 = 2002832733;
                    if(v2 < v1.ar * v9) {
                        v5 = (v1.ar * v9 - v2) * v7;
                        v4 = arg24 - (v1.ar * v9 - v2);
                        v2 = v1.ar * v9;
                    }
                    else {
                        v4 = arg24;
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
                    v0 += v2 * (v1.al * v9);
                    v2 = -v4;
                    while(true) {
                    label_69:
                        if(v2 >= 0) {
                            return;
                        }

                        v4 = v6 - v5 >> 8;
                        v10 = v5 >> 8;
                        int v12 = 0xFF00;
                        int v11 = (v4 * arg27 + v10 * arg28 & v12) >>> 8;
                        if(v11 == 0) {
                            v0 += v1.al * v9;
                            v5 += v7;
                        }
                        else {
                            int v14 = 0xFF00FF;
                            v4 = ((arg26 & v12) * v10 + (arg25 & v12) * v4 & 0xFF0000) + (0xFF00FF00 & v10 * (arg26 & v14) + v4 * (arg25 & v14)) >>> 8;
                            v10 = v11 << 24;
                            int v13 = v10 | v4;
                            v6 = 0xFF - v11;
                            int v15 = ((v4 & v12) * v11 >> 8 & v12) + (v11 * (v4 & v14) >> 8 & v14);
                            v4 = -v3;
                            while(true) {
                            label_115:
                                if(v4 < 0) {
                                    v11 = v1.ax[v0];
                                    if(v11 == 0) {
                                        v1.ax[v0] = v13;
                                        ++v0;
                                    }
                                    else {
                                        v1.ax[v0] = (v11 | v10) & 0xFF000000 | ((v11 & v14) * v6 >> 8 & v14) + ((v11 & v12) * v6 >> 8 & v12) + v15;
                                        ++v0;
                                    }

                                    goto label_142;
                                }
                                else {
                                    goto label_144;
                                }
                            }
                        }

                        goto label_146;
                    }
                }
                catch(RuntimeException v0_1) {
                    goto label_152;
                }

            label_142:
                ++v4;
                goto label_115;
            label_144:
                v0 += v8;
                v5 += v7;
            label_146:
                ++v2;
                v6 = 0x10000;
                goto label_69;
                return;
            label_152:
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append("ep.an(");
                v2_1.append(')');
                throw lx.al(((Throwable)v0_1), v2_1.toString());
            }
        }
    }

    public final void ap(int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, byte[] arg29, int arg30, boolean arg31, int arg32) {
        int v4;
        int v5_1;
        int v3;
        int v15;
        int v8;
        int v6;
        int v12;
        int v11;
        ep v1 = this;
        int v0 = arg23;
        int v2 = arg24;
        byte[] v5 = arg29;
        int v7 = arg25 + v0;
        if(v7 >= 0) {
            int v9 = v2 + arg26;
            if(v9 < 0) {
            }
            else {
                try {
                    v11 = -107049639;
                    if(v0 < v1.al * v11) {
                        v12 = 129208929;
                        if(v2 >= v1.ae * v12) {
                        }
                        else {
                            int v10 = 0;
                            if(v0 < 0) {
                                int v21 = v7;
                                v7 = -v0;
                                v6 = v21;
                            }
                            else {
                                v6 = arg25;
                                v7 = 0;
                            }

                            if(v2 < 0) {
                                v10 = -v2;
                                v8 = v9;
                            }
                            else {
                                v8 = arg26;
                            }

                            if(v0 + v6 > v1.al * v11) {
                                v6 = v1.al * v11 - v0;
                            }

                            if(v8 + v2 > v1.ae * v12) {
                                v8 = v1.ae * v12 - v2;
                            }

                            v9 = v5.length / arg30;
                            v12 = v1.al * v11 - v6;
                            int v13 = arg27 >>> 24;
                            int v14 = arg28 >>> 24;
                            if(arg31) {
                                v11 = 0xFF;
                                if(v13 == v11 && v14 == v11) {
                                    goto label_135;
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
                                    while(v14 < v11 + v6) {
                                        v10 = v5[(v13 - v2) % v9 * arg30 + (v14 - v0) % arg30] != 0 ? arg28 : arg27;
                                        int v19 = v11;
                                        v11 = v1.ax[v15];
                                        if(v11 == 0) {
                                            v1.ax[v15] = v10;
                                            ++v15;
                                        }
                                        else {
                                            v3 = v10 >>> 24;
                                            v5_1 = 0xFF - v3;
                                            v1.ax[v15] = (v10 | v11) & 0xFF000000 | ((v11 & 0xFF00) * v5_1 + (v10 & 0xFF00) * v3 & 0xFF0000) + (v3 * (v10 & 0xFF00FF) + v5_1 * (v11 & 0xFF00FF) & 0xFF00FF00) >>> 8;
                                            ++v15;
                                        }

                                        ++v14;
                                        v11 = v19;
                                        v5 = arg29;
                                    }

                                    v14 = v15 + v12;
                                    ++v13;
                                    v10 = v18;
                                    v5 = arg29;
                                }
                            }
                            else {
                            label_135:
                                v3 = v2 + v10;
                                v5_1 = v1.al * -107049639 * v3 + v0 + v7;
                                v4 = v3;
                                while(true) {
                                label_144:
                                    if(v4 >= v8 + v3) {
                                        return;
                                    }

                                    v10 = v7 + v0;
                                    v11 = v5_1;
                                    v5_1 = v10;
                                    while(true) {
                                    label_149:
                                        if(v5_1 >= v10 + v6) {
                                            goto label_170;
                                        }

                                        if(arg29[(v4 - v2) % v9 * arg30 + (v5_1 - v0) % arg30] != 0) {
                                            v15 = v11 + 1;
                                            v1.ax[v11] = arg28;
                                        }
                                        else {
                                            v15 = v11 + 1;
                                            v1.ax[v11] = arg27;
                                        }

                                        goto label_167;
                                    }
                                }
                            }

                            return;
                        }
                    }

                    return;
                }
                catch(RuntimeException v0_1) {
                    goto label_178;
                }

            label_167:
                v11 = v15;
                ++v5_1;
                goto label_149;
            label_170:
                v5_1 = v11 + v12;
                ++v4;
                goto label_144;
            label_178:
                StringBuilder v2_1 = new StringBuilder();
                v2_1.append("ep.ap(");
                v2_1.append(')');
                throw lx.al(((Throwable)v0_1), v2_1.toString());
                return;
            }
        }
    }

    public final void aq(int arg3, int arg4, int arg5, int arg6, int arg7) {
        arg6 |= 0xFF000000;
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
                    if(arg5 + arg4 > this.an * v1) {
                        arg5 = this.an * v1 - arg4;
                    }

                    v0 = -107049639;
                    arg3 += this.al * v0 * arg4;
                    for(arg4 = 0; true; ++arg4) {
                        if(arg4 >= arg5) {
                            return;
                        }

                        this.ax[this.al * v0 * arg4 + arg3] = arg6;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v3) {
            goto label_48;
        }

        return;
    label_48:
        StringBuilder v4 = new StringBuilder();
        v4.append("ep.aq(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public final void ar(int arg8, int arg9, int arg10, int arg11, int arg12, byte arg13) {
        int v5 = arg12 | 0xFF000000;
        int v6 = 0x7C3F2F61;
        ep v0 = this;
        int v1 = arg8;
        int v2 = arg9;
        int v3 = arg10;
        int v4 = arg11;
        try {
            v0.au(v1, v2, v3, v4, v5, v6);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("ep.ar(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    public void as(es arg28, int arg29, int arg30, int arg31, int arg32) {
        int v9;
        ep v1 = this;
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
                    if(0x100 == arg31) {
                        dn.ac(0, 0, 0, v1.ax, v0.ax, v17, 0, v19, 0, v21, v22, v23, v24, 0x6D5FA444);
                    }
                    else {
                        jw.ba(0, 0, 0, v1.ax, v0.ax, v17, 0, v19, 0, v21, v22, v23, v24, arg31, 249642092);
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ep.as(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public void at(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        int v14;
        int v10;
        int v9;
        int v7;
        ep v1 = this;
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
                    v3 = v2 + v9;
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

                    cc.ao(v1.ax, v0.ax, 0, v7, v8, v4, v6, v2, v10, v11, v12, v13, 0x6A5FF4DF);
                    return;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v2_1 = new StringBuilder();
                    v2_1.append("ep.at(");
                    v2_1.append(')');
                    throw lx.al(((Throwable)v0_1), v2_1.toString());
                }
            }
        }
    }

    void au(int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

            arg8 = this.al * -107049639 - arg5;
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

        arg3 += arg8;
        ++arg4;
        goto label_45;
        return;
    label_60:
        StringBuilder v4 = new StringBuilder();
        v4.append("ep.au(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public final void av(int arg28, int arg29, int arg30, int arg31, int arg32, int arg33) {
        int v0_1;
        int v24;
        int v8;
        int v10;
        int v20;
        int v19;
        int v18;
        int v17;
        int v13;
        ep v7 = this;
        int v3 = arg29;
        int v4 = arg30;
        int v1 = arg32;
        if(v1 == 0) {
            return;
        }

        int v2 = 0xFF;
        if(v1 < v2) {
            goto label_18;
        }

        byte v6 = -7;
        ep v1_1 = this;
        v2 = arg28;
        v3 = arg29;
        v4 = arg30;
        int v5 = arg31;
        try {
            v1_1.ai(v2, v3, v4, v5, v6);
            return;
        label_18:
            if(v4 < 0) {
                v4 = -v4;
            }

            v5 = arg31 & 0xFFFFFF;
            int v6_1 = (v1 << 24) + v5;
            int v9 = ((v5 & 0xFF00FF) * v1 >> 8 & 0xFF00FF) + ((v5 & 0xFF00) * v1 >> 8 & 0xFF00);
            v2 -= v1;
            v5 = v3 - v4;
            int v12 = 2002832733;
            if(v5 < v7.ar * v12) {
                v5 = v7.ar * v12;
            }

            int v11 = v4 + v3 + 1;
            v13 = 0xD21DC9D7;
            if(v11 > v7.an * v13) {
                v11 = v7.an * v13;
            }

            v12 = v4 * v4;
            v13 = 0;
            int v14 = v3 - v5;
            int v15 = v14 * v14;
            int v16 = v15 - v14;
            if(v3 > v11) {
                v3 = v11;
            }

            while(true) {
                v17 = -107049639;
                v18 = 0x56AC17CD;
                v19 = 0xE4D30573;
                v20 = 0xFF000000;
                if(v5 >= v3) {
                    break;
                }

                int v26 = v16;
                v16 = v13;
                v13 = v26;
                while(true) {
                    if(v13 > v12) {
                        if(v15 <= v12) {
                        }
                        else {
                            v10 = arg28 - v16 + 1;
                            if(v10 < v7.ap * v19) {
                                v10 = v7.ap * v19;
                            }

                            v8 = arg28 + v16;
                            v24 = v3;
                            if(v8 > v7.aj * v18) {
                                v8 = v7.aj * v18;
                            }

                            v3 = v7.al * v17 * v5 + v10;
                            break;
                        }
                    }

                    v24 = v3;
                    v15 += v16 + v16;
                    v3 = v16 + 1;
                    v13 += v16 + v3;
                    v16 = v3;
                    v3 = v24;
                }

                while(v10 < v8) {
                    int v25 = v8;
                    v8 = v7.ax[v3];
                    if(v8 == 0) {
                        v7.ax[v3] = v6_1;
                        ++v3;
                    }
                    else {
                        v17 = (v8 & v20) == 0 ? 0xFF000000 : (v8 | v1) & v20;
                        v7.ax[v3] = v17 | ((v8 & 0xFF00FF) * v2 >> 8 & 0xFF00FF) + ((v8 & 0xFF00) * v2 >> 8 & 0xFF00) + v9;
                        ++v3;
                    }

                    ++v10;
                    v8 = v25;
                }

                ++v5;
                v3 = v14 - 1;
                v15 -= v14 + v3;
                v8 = v13 - (v3 + v3);
                v14 = v3;
                v13 = v16;
                v3 = v24;
                v16 = v8;
            }

            v3 = -v14;
            v8 = v3 * v3 + v12;
            v10 = v8 - v4;
            v8 -= v3;
            while(true) {
            label_152:
                if(v5 >= v11) {
                    return;
                }

                while(v8 > v12) {
                    if(v10 <= v12) {
                        break;
                    }

                    v13 = v4 - 1;
                    v8 -= v4 + v13;
                    v10 -= v13 + v13;
                    v4 = v13;
                }

                v13 = arg28 - v4;
                if(v13 < v7.ap * v19) {
                    v13 = v7.ap * v19;
                }

                v14 = v4 + arg28;
                if(v14 > v7.aj * v18 - 1) {
                    v14 = v7.aj * v18 - 1;
                }

                v15 = v7.al * v17 * v5 + v13;
                while(true) {
                label_180:
                    if(v13 > v14) {
                        goto label_216;
                    }

                    v0_1 = v7.ax[v15];
                    if(v0_1 == 0) {
                        v7.ax[v15] = v6_1;
                        ++v15;
                    }
                    else {
                        v16 = (v0_1 & v20) == 0 ? 0xFF000000 : (v0_1 | v1) & v20;
                        v7.ax[v15] = v16 | ((v0_1 & 0xFF00FF) * v2 >> 8 & 0xFF00FF) + ((v0_1 & 0xFF00) * v2 >> 8 & 0xFF00) + v9;
                        ++v15;
                    }

                    break;
                }
            }
        }
        catch(RuntimeException v0) {
            goto label_227;
        }

        ++v13;
        goto label_180;
    label_216:
        ++v5;
        v8 += v3 + v3;
        v0_1 = v3 + 1;
        v10 += v3 + v0_1;
        v3 = v0_1;
        goto label_152;
        return;
    label_227:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ep.av(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0), v1_2.toString());
    }

    public void aw(ef arg18, int arg19, int arg20, int arg21, int arg22, byte arg23) {
        int v14;
        int v10;
        int v9;
        int v5;
        ep v1 = this;
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
            v2 = v3 + v9;
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

            ew.ak(v1.ax, v0.ax, v0.al, v5, v6, v4, v7, v3, v10, v11, v12, v13, 0x550C9057);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ep.aw(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    void ax(int arg1) {
    }

    public void bb() {
        if(this.ax != null) {
            ax.ba(this.ax, this.ax.length, 0x7F080096);
        }
    }

    public void bc() {
        if(this.ax != null) {
            ax.ba(this.ax, this.ax.length, 0x7F080096);
        }
    }

    public void bd(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        int v9;
        ep v1 = this;
        es v0 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        if(arg21 < 0xFF) {
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
                    mz.bn(v1.ax, v0.ax, 0, v10, v9, v2, v3, v12, v13, arg21, arg22, 0x5A90D989);
                    return;
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ep.bd(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public final void be(int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28) {
        int v4;
        int v3;
        ep v0 = this;
        int v1 = arg21;
        int v2 = arg22;
        if(arg23 > 0) {
            if(arg24 <= 0) {
            }
            else {
                int v5 = 0;
                int v6 = 0x10000;
                int v7 = v6 / arg24;
                int v9 = 0xE4D30573;
                if(v1 < v0.ap * v9) {
                    v3 = arg23 - (v0.ap * v9 - v1);
                    v1 = v0.ap * v9;
                }
                else {
                    v3 = arg23;
                }

                v9 = 2002832733;
                if(v2 < v0.ar * v9) {
                    v5 = (v0.ar * v9 - v2) * v7;
                    v4 = arg24 - (v0.ar * v9 - v2);
                    v2 = v0.ar * v9;
                }
                else {
                    v4 = arg24;
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
                v1 += v2 * (v0.al * v9);
                v2 = -v4;
                while(v2 < 0) {
                    v4 = v6 - v5 >> 8;
                    v10 = v5 >> 8;
                    int v12 = 0xFF00;
                    int v11 = (v4 * arg27 + v10 * arg28 & v12) >>> 8;
                    if(v11 == 0) {
                        v1 += v0.al * v9;
                        v5 += v7;
                    }
                    else {
                        int v14 = 0xFF00FF;
                        v4 = ((arg26 & v12) * v10 + (arg25 & v12) * v4 & 0xFF0000) + (0xFF00FF00 & v10 * (arg26 & v14) + v4 * (arg25 & v14)) >>> 8;
                        v10 = v11 << 24;
                        int v13 = v10 | v4;
                        v6 = 0xFF - v11;
                        int v15 = ((v4 & v12) * v11 >> 8 & v12) + (v11 * (v4 & v14) >> 8 & v14);
                        for(v4 = -v3; v4 < 0; ++v4) {
                            v11 = v0.ax[v1];
                            if(v11 == 0) {
                                v0.ax[v1] = v13;
                                ++v1;
                            }
                            else {
                                v0.ax[v1] = (v11 | v10) & 0xFF000000 | ((v11 & v14) * v6 >> 8 & v14) + ((v11 & v12) * v6 >> 8 & v12) + v15;
                                ++v1;
                            }
                        }

                        v1 += v8;
                        v5 += v7;
                    }

                    ++v2;
                    v6 = 0x10000;
                }

                return;
            }
        }
    }

    public void bf(es arg15, int arg16, int arg17, int arg18, int arg19) {
        int v9;
        ep v1 = this;
        es v0 = arg15;
        if(arg18 == 0) {
            return;
        }

        try {
            int v2 = arg16 + v0.ar;
            int v3 = arg17 + v0.an;
            int v5 = -107049639;
            int v4 = v1.al * v5 * v3 + v2;
            int v6 = v0.ae;
            int v7 = v0.al;
            int v8 = v1.al * v5 - v7;
            int v10 = 2002832733;
            int v12 = 0;
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

            v9 = v6;
            v5 = 0xE4D30573;
            if(v2 < v1.ap * v5) {
                v3 = v1.ap * v5 - v2;
                v7 -= v3;
                v2 = v1.ap * v5;
                v10 += v3;
                v4 += v3;
                v12 = v3;
                v8 += v3;
            }

            v6 = v4;
            v5 = v10;
            v2 += v7;
            v4 = 0x56AC17CD;
            if(v2 > v1.aj * v4) {
                v2 -= v1.aj * v4;
                v7 -= v2;
                v12 += v2;
                v8 += v2;
            }

            v10 = v8;
            if(v7 > 0) {
                if(v9 <= 0) {
                }
                else {
                    ii.bw(v1.ax, v0.ax, 0, v5, v6, v7, v9, v10, v12, arg18, 2045458065);
                    return;
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ep.bf(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    void bg() {
    }

    static void bh(int arg2) {
        try {
            ah v2_1 = client.al.aba(0x1467E5D5).bh(0x6C615C42);
            if(v2_1 != null) {
                v2_1.ao(-716096533);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ep.bh(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public void bh() {
        if(this.ax != null) {
            ax.ba(this.ax, this.ax.length, 0x7F080096);
        }
    }

    public final void bi(int arg4, int arg5, int arg6, int arg7) {
        arg7 |= 1602603932;
        if(arg5 >= this.ar * 0x58B4F3FD) {
            if(arg5 >= this.an * 0xE7301761) {
            }
            else {
                if(arg4 < this.ap * 134508150) {
                    arg6 -= this.ap * 0x28C86E30 - arg4;
                    arg4 = 0xF0EBCC2 * this.ap;
                }

                if(arg4 + arg6 > this.aj * 0x2179C561) {
                    arg6 = this.aj * 0x10B8A14 - arg4;
                }

                arg4 += this.al * -107049639 * arg5;
                for(arg5 = 0; arg5 < arg6; ++arg5) {
                    this.ax[arg4 + arg5] = arg7;
                }

                return;
            }
        }
    }

    public final void bj(int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if(arg15 == 0) {
            return;
        }

        if(arg15 >= 0x60D5F521) {
            this.ar(arg10, arg11, arg12, arg13, arg14, 2);
            return;
        }

        int v0 = arg15 << 24;
        int v1 = v0 | arg14;
        if(arg10 < this.ap * -87172209) {
            arg12 -= this.ap * 0xE4D30573 - arg10;
            arg10 = 660417530 * this.ap;
        }

        if(arg11 < this.ar * 2002832733) {
            arg13 -= this.ar * 0x704F0C1C - arg11;
            arg11 = 1206043297 * this.ar;
        }

        if(arg12 + arg10 > this.aj * 0xBB5580D9) {
            arg12 = this.aj * 0x56AC17CD - arg10;
        }

        if(arg13 + arg11 > this.an * 884910907) {
            arg13 = this.an * -1035207963 - arg11;
        }

        int v3 = 0xFF00;
        int v2 = ((0xB7AA0D4 & arg14) * arg15 >> 8 & v3) + ((arg14 & 0xFF00FF) * arg15 >> 8 & 0x3C01BEB0);
        arg14 = 0x3775458F - arg15;
        arg15 = this.al * -107049639 - arg12;
        arg11 = arg11 * (this.al * -107049639) + arg10;
        for(arg10 = 0; arg10 < arg13; ++arg10) {
            int v4;
            for(v4 = -arg12; v4 < 0; ++v4) {
                int v5 = this.ax[arg11];
                if(v5 == 0) {
                    this.ax[arg11] = v1;
                    ++arg11;
                }
                else {
                    int v6 = (0xB7B9CFA2 & v5) == 0 ? 0xFF000000 : (v5 | v0) & 0x709B76BF;
                    this.ax[arg11] = v6 | ((0x6979396F & v5) * arg14 >> 8 & v3) + ((v5 & 360262827) * arg14 >> 8 & 0x74C04BD6) + v2;
                    ++arg11;
                }
            }

            arg11 += arg15;
        }
    }

    public final void bk(int arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        int v9;
        int v6;
        ep v7 = this;
        int v1 = arg19;
        int v2 = arg20;
        int v0 = arg24;
        if(v0 == 0) {
            return;
        }

        if(v0 >= 0xFF) {
            this.ar(arg19, arg20, arg21, arg22, arg23, 2);
            return;
        }

        int v3 = v0 << 24;
        int v4 = v3 | arg23;
        if(v1 < v7.ap * 0xE930AE80) {
            v6 = arg21 - (v7.ap * 0xE4D30573 - v1);
            v1 = -1534240931 * v7.ap;
        }
        else {
            v6 = arg21;
        }

        if(v2 < v7.ar * -1021885832) {
            v9 = arg22 - (v7.ar * 0x922313C1 - v2);
            v2 = -923870673 * v7.ar;
        }
        else {
            v9 = arg22;
        }

        int v11 = 0x56AC17CD;
        if(v6 + v1 > v7.aj * v11) {
            v6 = v7.aj * v11 - v1;
        }

        if(v9 + v2 > v7.an * 0xDCBE08CC) {
            v9 = v7.an * 0xF0371A00 - v2;
        }

        int v10 = 0xFF00;
        v11 = 0xFF00FF;
        int v8 = ((arg23 & 0x63FB30FF) * v0 >> 8 & v10) + ((arg23 & -458729608) * v0 >> 8 & v11);
        int v5 = 1852723870 - v0;
        int v12 = v7.al * 0xFA5C4743 - v6;
        v2 = v2 * (v7.al * 0x577FFB9C) + v1;
        for(v0 = 0; v0 < v9; ++v0) {
            for(v1 = -v6; v1 < 0; ++v1) {
                int v13 = v7.ax[v2];
                if(v13 == 0) {
                    v7.ax[v2] = v4;
                    ++v2;
                }
                else {
                    int v14 = (0xE0F2B7F0 & v13) == 0 ? 0x80127AE3 : (v13 | v3) & 0xFF000000;
                    v7.ax[v2] = v14 | ((v13 & v10) * v5 >> 8 & 0x2ED72ACD) + ((v13 & v11) * v5 >> 8 & 1101926012) + v8;
                    ++v2;
                }
            }

            v2 += v12;
        }
    }

    public final void bl(int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, byte[] arg29, int arg30, boolean arg31) {
        int v5_1;
        int v3;
        int v15;
        int v8;
        int v6;
        ep v0 = this;
        int v1 = arg23;
        int v2 = arg24;
        byte[] v5 = arg29;
        int v7 = arg25 + v1;
        if(v7 >= 0) {
            int v9 = v2 + arg26;
            if(v9 < 0) {
            }
            else {
                int v11 = -107049639;
                if(v1 < v0.al * v11) {
                    int v12 = 129208929;
                    if(v2 >= v0.ae * v12) {
                    }
                    else {
                        int v10 = 0;
                        if(v1 < 0) {
                            int v21 = v7;
                            v7 = -v1;
                            v6 = v21;
                        }
                        else {
                            v6 = arg25;
                            v7 = 0;
                        }

                        if(v2 < 0) {
                            v10 = -v2;
                            v8 = v9;
                        }
                        else {
                            v8 = arg26;
                        }

                        if(v1 + v6 > v0.al * v11) {
                            v6 = v0.al * v11 - v1;
                        }

                        if(v8 + v2 > v0.ae * v12) {
                            v8 = v0.ae * v12 - v2;
                        }

                        v9 = v5.length / arg30;
                        v12 = v0.al * v11 - v6;
                        int v13 = arg27 >>> 24;
                        int v14 = arg28 >>> 24;
                        if(arg31) {
                            v11 = 0xFF;
                            if(v13 == v11 && v14 == v11) {
                                goto label_135;
                            }

                            v10 += v2;
                            v14 = v0.al * -107049639 * v10 + v1 + v7;
                            v13 = v10;
                            while(v13 < v10 + v8) {
                                v11 = v7 + v1;
                                int v18 = v10;
                                v15 = v14;
                                v14 = v11;
                                while(v14 < v11 + v6) {
                                    v10 = v5[(v13 - v2) % v9 * arg30 + (v14 - v1) % arg30] != 0 ? arg28 : arg27;
                                    int v19 = v11;
                                    v11 = v0.ax[v15];
                                    if(v11 == 0) {
                                        v0.ax[v15] = v10;
                                        ++v15;
                                    }
                                    else {
                                        v3 = v10 >>> 24;
                                        v5_1 = 0xFF - v3;
                                        v0.ax[v15] = (v10 | v11) & 0xFF000000 | ((v11 & 0xFF00) * v5_1 + (v10 & 0xFF00) * v3 & 0xFF0000) + (v3 * (v10 & 0xFF00FF) + v5_1 * (v11 & 0xFF00FF) & 0xFF00FF00) >>> 8;
                                        ++v15;
                                    }

                                    ++v14;
                                    v11 = v19;
                                    v5 = arg29;
                                }

                                v14 = v15 + v12;
                                ++v13;
                                v10 = v18;
                                v5 = arg29;
                            }
                        }
                        else {
                        label_135:
                            v3 = v2 + v10;
                            v5_1 = v0.al * -107049639 * v3 + v1 + v7;
                            int v4;
                            for(v4 = v3; v4 < v8 + v3; ++v4) {
                                v10 = v7 + v1;
                                v11 = v5_1;
                                for(v5_1 = v10; v5_1 < v10 + v6; ++v5_1) {
                                    if(arg29[(v4 - v2) % v9 * arg30 + (v5_1 - v1) % arg30] != 0) {
                                        v15 = v11 + 1;
                                        v0.ax[v11] = arg28;
                                    }
                                    else {
                                        v15 = v11 + 1;
                                        v0.ax[v11] = arg27;
                                    }

                                    v11 = v15;
                                }

                                v5_1 = v11 + v12;
                            }
                        }

                        return;
                    }
                }

                return;
            }
        }
    }

    public final void bm(int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        if(arg15 == 0) {
            return;
        }

        int v0 = 0xFF;
        if(arg15 >= v0) {
            this.ar(arg10, arg11, arg12, arg13, arg14, 2);
            return;
        }

        int v1 = arg15 << 24;
        int v2 = v1 | arg14;
        if(arg10 < this.ap * 1750161060) {
            arg12 -= this.ap * 0x64449AD5 - arg10;
            arg10 = 0x5A2B8 * this.ap;
        }

        if(arg11 < this.ar * 0xCD678238) {
            arg13 -= this.ar * 2002832733 - arg11;
            arg11 = this.ar * 2002832733;
        }

        if(arg12 + arg10 > this.aj * 0xFFA7B94D) {
            arg12 = this.aj * 0x56AC17CD - arg10;
        }

        if(arg13 + arg11 > this.an * 0xE4830CB6) {
            arg13 = this.an * 0xD21DC9D7 - arg11;
        }

        int v4 = 0xFF00FF;
        int v3 = ((0xE286F03E & arg14) * arg15 >> 8 & 0xFF00) + ((arg14 & v4) * arg15 >> 8 & 0xB37DCA04);
        v0 -= arg15;
        arg15 = this.al * -107049639 - arg12;
        arg11 = arg11 * (this.al * 0xE8AAB08E) + arg10;
        for(arg10 = 0; arg10 < arg13; ++arg10) {
            for(arg14 = -arg12; arg14 < 0; ++arg14) {
                int v5 = this.ax[arg11];
                if(v5 == 0) {
                    this.ax[arg11] = v2;
                    ++arg11;
                }
                else {
                    int v6 = (-745258069 & v5) == 0 ? -139928504 : (v5 | v1) & 0xFF000000;
                    this.ax[arg11] = v6 | ((0xCBB3A8B1 & v5) * v0 >> 8 & 0x1070FDE4) + ((v5 & v4) * v0 >> 8 & v4) + v3;
                    ++arg11;
                }
            }

            arg11 += arg15;
        }
    }

    public void bo(es arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int[] arg24, int[] arg25, int arg26) {
        int v13;
        int v12;
        ep v1 = this;
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

            int v8 = -107049639;
            int v7 = v1.al * v8 * (arg21 + v3 + v6) + (arg20 + v2 + v5);
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

                v10 += v3;
                v3 = v0.al + v2 <= v10 ? v0.al : v10 - v2;
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

                v7 += v1.al * v8;
                ++v6;
                v3 = v11;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_70;
        }

        return;
    label_70:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("ep.bo(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public void bp(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        int v15;
        int v10;
        int v9;
        int v7;
        ep v1 = this;
        es v0 = arg18;
        if(arg23 <= 0) {
            return;
        }

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
                        v15 = arg20 + v10;
                        v8 = v10 * v12 - (v0.an << 16);
                    }
                    else {
                        v15 = arg20;
                    }

                    int v2 = v13 < v5 ? ((v13 << 16) - v7 + v11 - 1) / v11 : arg21;
                    int v3 = v4 < v6 ? ((v4 << 16) - v8 + v12 - 1) / v12 : arg22;
                    v4 = v1.al * -107049639 * v15 + v9;
                    v6 = v1.al * -107049639 - v2;
                    v10 = v3 + v15;
                    int v16 = 0xD21DC9D7;
                    if(v10 > v1.an * v16) {
                        v3 -= v10 - v1.an * v16;
                    }

                    v10 = 2002832733;
                    if(v15 < v1.ar * v10) {
                        v5 = v1.ar * v10 - v15;
                        v3 -= v5;
                        v4 += v1.al * -107049639 * v5;
                        v8 += v5 * v12;
                    }

                    v10 = v3;
                    v3 = v2 + v9;
                    v15 = 0x56AC17CD;
                    if(v3 > v1.aj * v15) {
                        v3 -= v1.aj * v15;
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

                    hu.cm(v1.ax, v0.ax, 0, v7, v8, v4, v6, v2, v10, v11, v12, v13, arg23, -21);
                    return;
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v2_1 = new StringBuilder();
                    v2_1.append("ep.bp(");
                    v2_1.append(')');
                    throw lx.al(((Throwable)v0_1), v2_1.toString());
                }
            }
        }
    }

    public void bq(es arg29, int arg30, int arg31, int arg32, int arg33, int arg34) {
        int v27;
        int v26;
        int v21;
        ep v1 = this;
        es v0 = arg29;
        int v4 = arg32;
        int v5 = arg33;
        try {
            if(v4 <= v0.ap && v5 <= v0.aj) {
                int v6 = arg30 + v0.ar * v4 / v0.ap;
                int v7 = (v0.ap + (v0.al + v0.ar) * v4 - 1) / v0.ap + arg30;
                int v8 = v0.an * v5 / v0.aj + arg31;
                int v9 = (v0.aj + (v0.ae + v0.an) * v5 - 1) / v0.aj + arg31;
                int v11 = 0xE4D30573;
                if(v6 < v1.ap * v11) {
                    v6 = v1.ap * v11;
                }

                v11 = 0x56AC17CD;
                if(v7 > v1.aj * v11) {
                    v7 = v1.aj * v11;
                }

                v11 = 2002832733;
                if(v8 < v1.ar * v11) {
                    v8 = v1.ar * v11;
                }

                v11 = 0xD21DC9D7;
                if(v9 > v1.an * v11) {
                    v9 = v1.an * v11;
                }

                if(v6 < v7) {
                    if(v8 >= v9) {
                    }
                    else {
                        int v10 = v1.al * -107049639 * v8 + v6;
                        int v12 = v1.al * -107049639 - (v7 - v6);
                        if(v10 >= v1.ax.length) {
                            return;
                        }

                        while(v8 < v9) {
                            v11 = v10;
                            v10 = v6;
                            while(v10 < v7) {
                                int v13 = v10 - arg30 << 4;
                                int v14 = v8 - arg31 << 4;
                                int v15 = v0.ap * v13 / v4 - (v0.ar << 4);
                                int v2 = v0.ap * (v13 + 16) / v4 - (v0.ar << 4);
                                v13 = v0.aj * v14 / v5 - (v0.an << 4);
                                v14 = (v14 + 16) * v0.aj / v5 - (v0.an << 4);
                                int v3 = (v2 - v15) * (v14 - v13) >> 1;
                                if(v3 == 0) {
                                    v21 = v6;
                                    v26 = v7;
                                    v27 = v9;
                                }
                                else {
                                    int v16 = 0;
                                    if(v15 < 0) {
                                        v15 = 0;
                                    }

                                    if(v2 >= v0.al << 4) {
                                        v2 = v0.al << 4;
                                    }

                                    if(v13 < 0) {
                                        v13 = 0;
                                    }

                                    if(v14 >= v0.ae << 4) {
                                        v14 = v0.ae << 4;
                                    }

                                    --v2;
                                    --v14;
                                    v4 = 16 - (v15 & 15);
                                    int v18 = (v2 & 15) + 1;
                                    int v19 = 16 - (v13 & 15);
                                    int v20 = (v14 & 15) + 1;
                                    v15 >>= 4;
                                    v2 >>= 4;
                                    v13 >>= 4;
                                    v14 >>= 4;
                                    v21 = v6;
                                    v5 = v13;
                                    v6 = 0;
                                    int v22 = 0;
                                    int v23 = 0;
                                    while(v5 <= v14) {
                                        int v24 = v13 == v5 ? v19 : 16;
                                        if(v14 == v5) {
                                            v24 = v20;
                                        }

                                        int v25 = v23;
                                        v23 = v16;
                                        v16 = v6;
                                        v6 = v15;
                                        while(v6 <= v2) {
                                            v26 = v7;
                                            v27 = v9;
                                            v7 = v0.ax[v0.al * v5 + v6];
                                            if(v7 != 0) {
                                                if(v6 == v15) {
                                                    v9 = v24 * v4;
                                                }
                                                else if(v2 == v6) {
                                                    v9 = v24 * v18;
                                                }
                                                else {
                                                    v9 = v24 << 4;
                                                }

                                                v16 += v9;
                                                v22 += (v7 >> 16 & 0xFF) * v9;
                                                v23 += (v7 >> 8 & 0xFF) * v9;
                                                v25 += v9 * (v7 & 0xFF);
                                            }

                                            ++v6;
                                            v7 = v26;
                                            v9 = v27;
                                            v0 = arg29;
                                        }

                                        ++v5;
                                        v6 = v16;
                                        v16 = v23;
                                        v23 = v25;
                                        v0 = arg29;
                                    }

                                    v26 = v7;
                                    v27 = v9;
                                    if(v6 >= v3) {
                                        v1.ax[v11] = 0xFF000000 | (v16 / v6 << 8) + (v22 / v6 << 16) + v23 / v6;
                                    }

                                    ++v11;
                                }

                                ++v10;
                                v6 = v21;
                                v7 = v26;
                                v9 = v27;
                                v0 = arg29;
                                v4 = arg32;
                                v5 = arg33;
                            }

                            v10 = v11 + v12;
                            ++v8;
                            v6 = v6;
                            v7 = v7;
                            v9 = v9;
                            v0 = arg29;
                            v4 = arg32;
                            v5 = arg33;
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
            v2_1.append("ep.bq(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public final void br(int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, byte[] arg29, int arg30, boolean arg31) {
        int v5_1;
        int v3;
        int v15;
        int v8;
        int v6;
        ep v0 = this;
        int v1 = arg23;
        int v2 = arg24;
        byte[] v5 = arg29;
        int v7 = arg25 + v1;
        if(v7 >= 0) {
            int v9 = v2 + arg26;
            if(v9 < 0) {
            }
            else {
                int v11 = -107049639;
                if(v1 < v0.al * v11) {
                    int v12 = 129208929;
                    if(v2 >= v0.ae * v12) {
                    }
                    else {
                        int v10 = 0;
                        if(v1 < 0) {
                            int v21 = v7;
                            v7 = -v1;
                            v6 = v21;
                        }
                        else {
                            v6 = arg25;
                            v7 = 0;
                        }

                        if(v2 < 0) {
                            v10 = -v2;
                            v8 = v9;
                        }
                        else {
                            v8 = arg26;
                        }

                        if(v1 + v6 > v0.al * v11) {
                            v6 = v0.al * v11 - v1;
                        }

                        if(v8 + v2 > v0.ae * v12) {
                            v8 = v0.ae * v12 - v2;
                        }

                        v9 = v5.length / arg30;
                        v12 = v0.al * v11 - v6;
                        int v13 = arg27 >>> 24;
                        int v14 = arg28 >>> 24;
                        if(arg31) {
                            v11 = 0xFF;
                            if(v13 == v11 && v14 == v11) {
                                goto label_135;
                            }

                            v10 += v2;
                            v14 = v0.al * -107049639 * v10 + v1 + v7;
                            v13 = v10;
                            while(v13 < v10 + v8) {
                                v11 = v7 + v1;
                                int v18 = v10;
                                v15 = v14;
                                v14 = v11;
                                while(v14 < v11 + v6) {
                                    v10 = v5[(v13 - v2) % v9 * arg30 + (v14 - v1) % arg30] != 0 ? arg28 : arg27;
                                    int v19 = v11;
                                    v11 = v0.ax[v15];
                                    if(v11 == 0) {
                                        v0.ax[v15] = v10;
                                        ++v15;
                                    }
                                    else {
                                        v3 = v10 >>> 24;
                                        v5_1 = 0xFF - v3;
                                        v0.ax[v15] = (v10 | v11) & 0xFF000000 | ((v11 & 0xFF00) * v5_1 + (v10 & 0xFF00) * v3 & 0xFF0000) + (v3 * (v10 & 0xFF00FF) + v5_1 * (v11 & 0xFF00FF) & 0xFF00FF00) >>> 8;
                                        ++v15;
                                    }

                                    ++v14;
                                    v11 = v19;
                                    v5 = arg29;
                                }

                                v14 = v15 + v12;
                                ++v13;
                                v10 = v18;
                                v5 = arg29;
                            }
                        }
                        else {
                        label_135:
                            v3 = v2 + v10;
                            v5_1 = v0.al * -107049639 * v3 + v1 + v7;
                            int v4;
                            for(v4 = v3; v4 < v8 + v3; ++v4) {
                                v10 = v7 + v1;
                                v11 = v5_1;
                                for(v5_1 = v10; v5_1 < v10 + v6; ++v5_1) {
                                    if(arg29[(v4 - v2) % v9 * arg30 + (v5_1 - v1) % arg30] != 0) {
                                        v15 = v11 + 1;
                                        v0.ax[v11] = arg28;
                                    }
                                    else {
                                        v15 = v11 + 1;
                                        v0.ax[v11] = arg27;
                                    }

                                    v11 = v15;
                                }

                                v5_1 = v11 + v12;
                            }
                        }

                        return;
                    }
                }

                return;
            }
        }
    }

    public final void bs(int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.au(arg9, arg10, arg11, arg12, arg13 | 0x86886F99, 0x6093023A);
    }

    public void bt(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, double arg25, int arg27, byte arg28) {
        ep v1 = this;
        es v0 = arg18;
        int v2 = arg22;
        int v4 = -arg21;
        try {
            int v5 = v4 / 2;
            int v6 = -v2 / 2;
            int v7 = (((int)(Math.sin(arg25) * 65536))) * arg27 >> 8;
            int v3 = arg27 * (((int)(Math.cos(arg25) * 65536))) >> 8;
            int v8 = v6 * v7 + v3 * v5 + (arg23 << 16);
            v6 = v6 * v3 - v5 * v7 + (arg24 << 16);
            v5 = v1.al * -107049639 * arg20 + arg19;
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
                    int v9 = v0.ax[v0.al * (v12 >> 16) + (v13 >> 16)];
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
            v2_1.append("ep.bt(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public final void bu(int arg9, int arg10, int arg11, int arg12, int arg13) {
        this.au(arg9, arg10, arg11, arg12, arg13 | 0xFF000000, 1840147045);
    }

    void bv(es arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, byte arg33) {
        int v22;
        int v24;
        ep v1 = this;
        es v0 = arg26;
        int v4 = arg32;
        if(v4 == 0) {
            return;
        }

        try {
            int v5 = arg27 - (v0.ar << 4);
            int v6 = arg28 - (v0.an << 4);
            double v7 = (((double)(arg31 & 0xFFFF))) * 0.000096;
            double v11 = ((double)v4);
            v4 = ((int)Math.floor(Math.sin(v7) * v11 + 0.5));
            int v9 = ((int)Math.floor(Math.cos(v7) * v11 + 0.5));
            int v10 = -v6;
            int v15 = v4 * v10;
            int v13 = -v5;
            int v14 = v13 * v9;
            double v18 = v7;
            int v7_1 = v15 + v14;
            v10 *= v9;
            int v8 = -v13 * v4;
            v13 = v10 + v8;
            double v20 = v11;
            int v11_1 = ((v0.al << 4) - v5) * v9 + v15;
            v10 += -((v0.al << 4) - v5) * v4;
            v14 += ((v0.ae << 4) - v6) * v4;
            int v12 = ((v0.ae << 4) - v6) * v9 + v8;
            v8 = ((v0.al << 4) - v5) * v9 + ((v0.ae << 4) - v6) * v4;
            v4 = v4 * -((v0.al << 4) - v5) + ((v0.ae << 4) - v6) * v9;
            if(v7_1 < v11_1) {
            }
            else {
                v24 = v11_1;
                v11_1 = v7_1;
                v7_1 = v24;
            }

            if(v14 < v7_1) {
                v7_1 = v14;
            }

            if(v8 < v7_1) {
                v7_1 = v8;
            }

            if(v14 > v11_1) {
                v11_1 = v14;
            }

            if(v8 > v11_1) {
            }
            else {
                v8 = v11_1;
            }

            if(v13 < v10) {
                v24 = v13;
                v13 = v10;
                v10 = v24;
            }

            if(v12 < v10) {
                v10 = v12;
            }

            if(v4 < v10) {
                v10 = v4;
            }

            if(v12 > v13) {
            }
            else {
                v12 = v13;
            }

            if(v4 > v12) {
                v12 = v4;
            }

            v4 = (v7_1 >> 12) + arg29 >> 4;
            v7_1 = (v8 + 0xFFF >> 12) + arg29 + 15 >> 4;
            v8 = (v10 >> 12) + arg30 >> 4;
            v9 = (v12 + 0xFFF >> 12) + arg30 + 15 >> 4;
            v11_1 = 0xE4D30573;
            if(v4 < v1.ap * v11_1) {
                v4 = v1.ap * v11_1;
            }

            v11_1 = 0x56AC17CD;
            if(v7_1 > v1.aj * v11_1) {
                v7_1 = v1.aj * v11_1;
            }

            v11_1 = 2002832733;
            if(v8 < v1.ar * v11_1) {
                v8 = v1.ar * v11_1;
            }

            v11_1 = 0xD21DC9D7;
            if(v9 > v1.an * v11_1) {
                v9 = v1.an * v11_1;
            }

            v7_1 = v4 - v7_1;
            if(v7_1 >= 0) {
                return;
            }

            v9 = v8 - v9;
            if(v9 >= 0) {
                return;
            }

            v11_1 = -107049639;
            v10 = v1.al * v11_1 * v8 + v4;
            double v12_1 = 16777216 / v20;
            v14 = ((int)Math.floor(Math.sin(v18) * v12_1 + 0.5));
            v12 = ((int)Math.floor(Math.cos(v18) * v12_1 + 0.5));
            v4 = (v4 << 4) + 8 - arg29;
            int v2 = (v8 << 4) + 8 - arg30;
            int v3 = (v5 << 8) - (v2 * v14 >> 4);
            v2 = (v2 * v12 >> 4) + (v6 << 8);
            if(v12 == 0) {
                if(v14 == 0) {
                    while(true) {
                        if(v9 >= 0) {
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
                            v4 = v7_1;
                            v5 = v10;
                            while(v4 < 0) {
                                v6 = v0.ax[(v3 >> 12) + (v2 >> 12) * v0.al];
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

                        ++v9;
                        v10 += v1.al * v11_1;
                    }
                }

                if(v14 < 0) {
                    while(true) {
                        if(v9 < 0) {
                            v5 = (v4 * v14 >> 4) + v2;
                            if(v3 < 0) {
                            }
                            else if(v3 - (v0.al << 12) >= 0) {
                            }
                            else {
                                v6 = v5 - (v0.ae << 12);
                                if(v6 >= 0) {
                                    v6 = (v14 - v6) / v14;
                                    v8 = v7_1 + v6;
                                    v5 += v6 * v14;
                                    v6 += v10;
                                }
                                else {
                                    v8 = v7_1;
                                    v6 = v10;
                                }

                                v12 = (v5 - v14) / v14;
                                if(v12 > v8) {
                                    v8 = v12;
                                }

                                while(v8 < 0) {
                                    v12 = v0.ax[(v5 >> 12) * v0.al + (v3 >> 12)];
                                    if(v12 != 0) {
                                        v1.ax[v6] = v12;
                                        ++v6;
                                    }
                                    else {
                                        ++v6;
                                    }

                                    v5 += v14;
                                    ++v8;
                                }
                            }

                            ++v9;
                            v3 -= v14;
                            v10 += v1.al * v11_1;
                            continue;
                        }
                        else {
                            return;
                        }
                    }
                }

                while(v9 < 0) {
                    v5 = (v14 * v4 >> 4) + v2;
                    if(v3 < 0) {
                    }
                    else if(v3 - (v0.al << 12) >= 0) {
                    }
                    else {
                        if(v5 < 0) {
                            v6 = (v14 - 1 - v5) / v14;
                            v8 = v7_1 + v6;
                            v5 += v14 * v6;
                            v6 += v10;
                        }
                        else {
                            v8 = v7_1;
                            v6 = v10;
                        }

                        v12 = (v5 + 1 - (v0.ae << 12) - v14) / v14;
                        if(v12 > v8) {
                            v8 = v12;
                        }

                        while(v8 < 0) {
                            v11_1 = v0.ax[(v3 >> 12) + (v5 >> 12) * v0.al];
                            if(v11_1 != 0) {
                                v1.ax[v6] = v11_1;
                                ++v6;
                            }
                            else {
                                ++v6;
                            }

                            v5 += v14;
                            ++v8;
                        }
                    }

                    ++v9;
                    v3 -= v14;
                    v10 += v1.al * -107049639;
                }
            }
            else {
                if(v12 < 0) {
                    if(v14 == 0) {
                        while(true) {
                            if(v9 >= 0) {
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
                                    v8 = v7_1 + v6;
                                    v5 += v12 * v6;
                                    v6 += v10;
                                }
                                else {
                                    v8 = v7_1;
                                    v6 = v10;
                                }

                                v11_1 = (v5 - v12) / v12;
                                if(v11_1 > v8) {
                                    v8 = v11_1;
                                }

                                while(v8 < 0) {
                                    v11_1 = v0.ax[(v2 >> 12) * v0.al + (v5 >> 12)];
                                    if(v11_1 != 0) {
                                        v1.ax[v6] = v11_1;
                                        ++v6;
                                    }
                                    else {
                                        ++v6;
                                    }

                                    v5 += v12;
                                    ++v8;
                                }
                            }

                            ++v9;
                            v2 += v12;
                            v10 += v1.al * -107049639;
                        }
                    }

                    if(v14 < 0) {
                        while(true) {
                            if(v9 >= 0) {
                                return;
                            }

                            v5 = (v12 * v4 >> 4) + v3;
                            v6 = (v14 * v4 >> 4) + v2;
                            v8 = v5 - (v0.al << 12);
                            if(v8 >= 0) {
                                v8 = (v12 - v8) / v12;
                                v11_1 = v7_1 + v8;
                                v5 += v8 * v12;
                                v6 += v8 * v14;
                                v8 += v10;
                            }
                            else {
                                v11_1 = v7_1;
                                v8 = v10;
                            }

                            v13 = (v5 - v12) / v12;
                            if(v13 > v11_1) {
                                v11_1 = v13;
                            }

                            v13 = v6 - (v0.ae << 12);
                            if(v13 >= 0) {
                                v13 = (v14 - v13) / v14;
                                v11_1 += v13;
                                v5 += v12 * v13;
                                v6 += v13 * v14;
                                v8 += v13;
                            }

                            v13 = (v6 - v14) / v14;
                            if(v13 > v11_1) {
                                v11_1 = v13;
                            }

                            while(v11_1 < 0) {
                                v22 = v7_1;
                                v7_1 = v0.ax[(v5 >> 12) + v0.al * (v6 >> 12)];
                                if(v7_1 != 0) {
                                    v1.ax[v8] = v7_1;
                                    ++v8;
                                }
                                else {
                                    ++v8;
                                }

                                v5 += v12;
                                v6 += v14;
                                ++v11_1;
                                v7_1 = v22;
                            }

                            ++v9;
                            v3 -= v14;
                            v2 += v12;
                            v10 += v1.al * -107049639;
                            v7_1 = v7_1;
                        }
                    }

                    v22 = v7_1;
                    while(true) {
                        if(v9 >= 0) {
                            return;
                        }

                        v5 = (v4 * v12 >> 4) + v3;
                        v6 = (v4 * v14 >> 4) + v2;
                        v7_1 = v5 - (v0.al << 12);
                        if(v7_1 >= 0) {
                            v7_1 = (v12 - v7_1) / v12;
                            v8 = v22 + v7_1;
                            v5 += v7_1 * v12;
                            v6 += v14 * v7_1;
                            v7_1 += v10;
                        }
                        else {
                            v7_1 = v10;
                            v8 = v22;
                        }

                        v11_1 = (v5 - v12) / v12;
                        if(v11_1 > v8) {
                            v8 = v11_1;
                        }

                        if(v6 < 0) {
                            v11_1 = (v14 - 1 - v6) / v14;
                            v8 += v11_1;
                            v5 += v11_1 * v12;
                            v6 += v14 * v11_1;
                            v7_1 += v11_1;
                        }

                        v11_1 = (v6 + 1 - (v0.ae << 12) - v14) / v14;
                        if(v11_1 > v8) {
                            v8 = v11_1;
                        }

                        while(v8 < 0) {
                            v11_1 = v0.ax[v0.al * (v6 >> 12) + (v5 >> 12)];
                            if(v11_1 != 0) {
                                v1.ax[v7_1] = v11_1;
                                ++v7_1;
                            }
                            else {
                                ++v7_1;
                            }

                            v5 += v12;
                            v6 += v14;
                            ++v8;
                        }

                        ++v9;
                        v3 -= v14;
                        v2 += v12;
                        v10 += v1.al * -107049639;
                    }
                }

                v22 = v7_1;
                if(v14 == 0) {
                    while(true) {
                        if(v9 >= 0) {
                            return;
                        }

                        v5 = (v4 * v12 >> 4) + v3;
                        if(v2 < 0) {
                        }
                        else if(v2 - (v0.ae << 12) >= 0) {
                        }
                        else {
                            if(v5 < 0) {
                                v6 = (v12 - 1 - v5) / v12;
                                v7_1 = v22 + v6;
                                v5 += v12 * v6;
                                v6 += v10;
                            }
                            else {
                                v6 = v10;
                                v7_1 = v22;
                            }

                            v8 = (v5 + 1 - (v0.al << 12) - v12) / v12;
                            if(v8 > v7_1) {
                                v7_1 = v8;
                            }

                            while(v7_1 < 0) {
                                v8 = v0.ax[v0.al * (v2 >> 12) + (v5 >> 12)];
                                if(v8 != 0) {
                                    v1.ax[v6] = v8;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v12;
                                ++v7_1;
                            }
                        }

                        ++v9;
                        v2 += v12;
                        v10 += v1.al * -107049639;
                    }
                }

                if(v14 < 0) {
                    while(true) {
                        if(v9 < 0) {
                            v5 = (v4 * v12 >> 4) + v3;
                            v6 = (v14 * v4 >> 4) + v2;
                            if(v5 < 0) {
                                v7_1 = (v12 - 1 - v5) / v12;
                                v8 = v22 + v7_1;
                                v5 += v7_1 * v12;
                                v6 += v14 * v7_1;
                                v7_1 += v10;
                            }
                            else {
                                v7_1 = v10;
                                v8 = v22;
                            }

                            v11_1 = (v5 + 1 - (v0.al << 12) - v12) / v12;
                            if(v11_1 > v8) {
                                v8 = v11_1;
                            }

                            v11_1 = v6 - (v0.ae << 12);
                            if(v11_1 >= 0) {
                                v11_1 = (v14 - v11_1) / v14;
                                v8 += v11_1;
                                v5 += v12 * v11_1;
                                v6 += v11_1 * v14;
                                v7_1 += v11_1;
                            }

                            v11_1 = (v6 - v14) / v14;
                            if(v11_1 > v8) {
                                v8 = v11_1;
                            }

                            while(v8 < 0) {
                                v11_1 = v0.ax[(v6 >> 12) * v0.al + (v5 >> 12)];
                                if(v11_1 != 0) {
                                    v1.ax[v7_1] = v11_1;
                                    ++v7_1;
                                }
                                else {
                                    ++v7_1;
                                }

                                v5 += v12;
                                v6 += v14;
                                ++v8;
                            }

                            ++v9;
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

                while(v9 < 0) {
                    v5 = (v4 * v12 >> 4) + v3;
                    v6 = (v4 * v14 >> 4) + v2;
                    if(v5 < 0) {
                        v7_1 = (v12 - 1 - v5) / v12;
                        v8 = v22 + v7_1;
                        v5 += v7_1 * v12;
                        v6 += v14 * v7_1;
                        v7_1 += v10;
                    }
                    else {
                        v7_1 = v10;
                        v8 = v22;
                    }

                    v11_1 = (v5 + 1 - (v0.al << 12) - v12) / v12;
                    if(v11_1 > v8) {
                        v8 = v11_1;
                    }

                    if(v6 < 0) {
                        v11_1 = (v14 - 1 - v6) / v14;
                        v8 += v11_1;
                        v5 += v11_1 * v12;
                        v6 += v11_1 * v14;
                        v7_1 += v11_1;
                    }

                    v11_1 = (v6 + 1 - (v0.ae << 12) - v14) / v14;
                    if(v11_1 > v8) {
                        v8 = v11_1;
                    }

                    while(v8 < 0) {
                        int v23 = v4;
                        v4 = v0.ax[(v5 >> 12) + (v6 >> 12) * v0.al];
                        if(v4 != 0) {
                            v1.ax[v7_1] = v4;
                            ++v7_1;
                        }
                        else {
                            ++v7_1;
                        }

                        v5 += v12;
                        v6 += v14;
                        ++v8;
                        v4 = v23;
                    }

                    ++v9;
                    v3 -= v14;
                    v2 += v12;
                    v10 += v1.al * -107049639;
                    v4 = v4;
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ep.bv(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    void bx() {
    }

    public void by(es arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int[] arg28, int[] arg29, int arg30) {
        ep v1 = this;
        es v0 = arg19;
        int v2 = arg23;
        int v4 = -arg22;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg26)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = arg27 * v8 >> 8;
            int v3 = v6_1 * arg27 >> 8;
            v6_1 = (arg24 << 16) + (v4 * v3 + v7 * v5);
            v8 = (arg25 << 16) + (v5 * v3 - v4 * v7);
            v4 = v1.al * -107049639 * arg21 + arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg28[v9];
                int v13 = arg28[v9] * v3 + v6_1;
                int v11 = v8 - arg28[v9] * v7;
                int v14 = -arg29[v9];
                while(v14 < 0) {
                    v1.ax[v12] = v0.ax[(v13 >> 16) + (v11 >> 16) * v0.al];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v1.al * -107049639;
                ++v9;
                v2 = arg23;
            }
        }
        catch(Exception ) {
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("ep.by(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public void bz() {
        if(this.ax != null) {
            ax.ba(this.ax, this.ax.length, 0x7F080096);
        }
    }

    public final void ca(int arg4, int arg5, int arg6, int arg7) {
        arg7 |= 0xFF000000;
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

                arg4 += this.al * -107049639 * arg5;
                for(arg5 = 0; arg5 < arg6; ++arg5) {
                    this.ax[arg4 + arg5] = arg7;
                }

                return;
            }
        }
    }

    public final void cb(int arg4, int arg5, int arg6, int arg7) {
        arg7 |= 0x20242E53;
        if(arg4 >= this.ap * 0xE4D30573) {
            if(arg4 >= this.aj * 0xCED4B925) {
            }
            else {
                int v1 = 2002832733;
                if(arg5 < this.ar * v1) {
                    arg6 -= this.ar * v1 - arg5;
                    arg5 = -930304060 * this.ar;
                }

                if(arg6 + arg5 > this.an * 0x36EBB243) {
                    arg6 = this.an * 0xC5538AB1 - arg5;
                }

                arg4 += this.al * 0x8AF54737 * arg5;
                for(arg5 = 0; arg5 < arg6; ++arg5) {
                    this.ax[this.al * -107049639 * arg5 + arg4] = arg7;
                }

                return;
            }
        }
    }

    public final void cc(int arg11, int arg12, int arg13, int arg14, int arg15) {
        int v5 = arg15 - 303058810 & 0xFFFFFF;
        arg13 -= arg11;
        arg14 -= arg12;
        if(arg14 == 0) {
            if(arg13 >= 0) {
                this.aj(arg11, arg12, arg13 + 1, v5, 0x4EEC9431);
            }
            else {
                this.aj(arg13 + arg11, arg12, -arg13 + 1, v5, 0x2675B40D);
            }

            return;
        }

        if(arg13 == 0) {
            if(arg14 >= 0) {
                this.aq(arg11, arg12, arg14 + 1, v5, 0x1795F574);
            }
            else {
                this.aq(arg11, arg12 + arg14, -arg14 + 1, v5, 0x1795F574);
            }

            return;
        }

        if(arg14 + arg13 < 0) {
            arg11 += arg13;
            arg13 = -arg13;
            arg12 += arg14;
            arg14 = -arg14;
        }

        arg15 = 0xD21DC9D7;
        int v0 = 2002832733;
        double v1 = 0.5;
        int v3 = 0xE4D30573;
        if(arg13 > arg14) {
            arg12 = (arg12 << 16) + 0x8000;
            arg14 = ((int)Math.floor((((double)(arg14 << 16))) / (((double)arg13)) + v1));
            arg13 += arg11;
            if(arg11 < this.ap * v3) {
                arg12 += (this.ap * v3 - arg11) * arg14;
                arg11 = this.ap * v3;
            }

            if(arg13 >= this.aj * 0x8E5C9141) {
                arg13 = this.aj * 0xA8024993 - 1;
            }

            while(arg11 <= arg13) {
                int v1_1 = arg12 >> 16;
                if(v1_1 >= this.ar * v0 && v1_1 < this.an * arg15) {
                    this.ax[this.al * -1204537149 * v1_1 + arg11] = v5;
                }

                arg12 += arg14;
                ++arg11;
            }
        }
        else {
            arg11 = (arg11 << 16) - 774263203;
            arg13 = ((int)Math.floor((((double)(arg13 << 16))) / (((double)arg14)) + v1));
            arg14 += arg12;
            if(arg12 < this.ar * 0x85381FA4) {
                arg11 += (this.ar * v0 - arg12) * arg13;
                arg12 = this.ar * 0x2CED8D95;
            }

            if(arg14 >= this.an * arg15) {
                arg14 = this.an * 0x8463F333 - 1;
            }

            while(arg12 <= arg14) {
                arg15 = arg11 >> 16;
                if(arg15 >= this.ap * v3 && arg15 < this.aj * 0x56AC17CD) {
                    this.ax[this.al * -107049639 * arg12 + arg15] = v5;
                }

                arg11 += arg13;
                ++arg12;
            }
        }
    }

    final void cd(int arg10, int arg11, int arg12, int arg13, int arg14) {
        if(arg14 <= 0) {
            return;
        }

        int v0 = 0xFF;
        if(arg14 >= v0) {
            this.aj(arg10, arg11, arg12, arg13, 1274400206);
            return;
        }

        if(arg11 >= this.ar * 2002832733) {
            if(arg11 >= this.an * 0xD21DC9D7) {
            }
            else {
                int v2 = 0xE4D30573;
                if(arg10 < this.ap * v2) {
                    arg12 -= this.ap * v2 - arg10;
                    arg10 = this.ap * v2;
                }

                int v3 = 0x56AC17CD;
                if(arg10 + arg12 > this.aj * v3) {
                    arg12 = this.aj * v3 - arg10;
                }

                int v1 = 0xFF - arg14;
                v2 = arg14 << 24;
                v3 = (arg13 >> 16 & v0) * arg14;
                int v4 = (arg13 >> 8 & v0) * arg14;
                arg14 *= arg13 & 0xFF;
                arg13 |= v2;
                arg10 += arg11 * (this.al * -107049639);
                for(arg11 = 0; arg11 < arg12; ++arg11) {
                    if(this.ax[arg10] == 0) {
                        this.ax[arg10] = arg13;
                        ++arg10;
                    }
                    else {
                        this.ax[arg10] = ((this.ax[arg10] >> 16 & v0) * v1 + v3 >> 8 << 16) + ((this.ax[arg10] >> 8 & v0) * v1 + v4 >> 8 << 8) + ((this.ax[arg10] & v0) * v1 + arg14 >> 8) | (this.ax[arg10] | v2) & 0xFF000000;
                        ++arg10;
                    }
                }

                return;
            }
        }
    }

    public final void ce(int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v1;
        int v24;
        int v8;
        int v10;
        int v20;
        int v19;
        int v18;
        int v17;
        ep v6 = this;
        int v2 = arg29;
        int v3 = arg30;
        int v0 = arg32;
        if(v0 == 0) {
            return;
        }

        int v4 = 0xFF;
        if(v0 >= v4) {
            this.ai(arg28, arg29, arg30, arg31, -75);
            return;
        }

        if(v3 < 0) {
            v3 = -v3;
        }

        int v5 = arg31 & 0xFFFFFF;
        int v7 = (v0 << 24) + v5;
        int v9 = ((v5 & 0xFF00FF) * v0 >> 8 & 0xFF00FF) + ((v5 & 0xFF00) * v0 >> 8 & 0xFF00);
        v4 -= v0;
        v5 = v2 - v3;
        int v12 = 2002832733;
        if(v5 < v6.ar * v12) {
            v5 = v6.ar * v12;
        }

        int v11 = v3 + v2 + 1;
        int v13 = 0xD21DC9D7;
        if(v11 > v6.an * v13) {
            v11 = v6.an * v13;
        }

        v12 = v3 * v3;
        v13 = 0;
        int v14 = v2 - v5;
        int v15 = v14 * v14;
        int v16 = v15 - v14;
        if(v2 > v11) {
            v2 = v11;
        }

        while(true) {
            v17 = -107049639;
            v18 = 0x56AC17CD;
            v19 = 0xE4D30573;
            v20 = 0xFF000000;
            if(v5 >= v2) {
                break;
            }

            int v26 = v16;
            v16 = v13;
            v13 = v26;
            while(true) {
                if(v13 > v12) {
                    if(v15 <= v12) {
                    }
                    else {
                        v10 = arg28 - v16 + 1;
                        if(v10 < v6.ap * v19) {
                            v10 = v6.ap * v19;
                        }

                        v8 = arg28 + v16;
                        v24 = v2;
                        if(v8 > v6.aj * v18) {
                            v8 = v6.aj * v18;
                        }

                        v2 = v6.al * v17 * v5 + v10;
                        break;
                    }
                }

                v24 = v2;
                v15 += v16 + v16;
                v2 = v16 + 1;
                v13 += v16 + v2;
                v16 = v2;
                v2 = v24;
            }

            while(v10 < v8) {
                int v25 = v8;
                v8 = v6.ax[v2];
                if(v8 == 0) {
                    v6.ax[v2] = v7;
                    ++v2;
                }
                else {
                    v17 = (v8 & v20) == 0 ? 0xFF000000 : (v8 | v0) & v20;
                    v6.ax[v2] = v17 | ((v8 & 0xFF00FF) * v4 >> 8 & 0xFF00FF) + ((v8 & 0xFF00) * v4 >> 8 & 0xFF00) + v9;
                    ++v2;
                }

                ++v10;
                v8 = v25;
            }

            ++v5;
            v2 = v14 - 1;
            v15 -= v14 + v2;
            v8 = v13 - (v2 + v2);
            v14 = v2;
            v13 = v16;
            v2 = v24;
            v16 = v8;
        }

        v2 = -v14;
        v8 = v2 * v2 + v12;
        v10 = v8 - v3;
        v8 -= v2;
        while(v5 < v11) {
            while(v8 > v12) {
                if(v10 <= v12) {
                    break;
                }

                v13 = v3 - 1;
                v8 -= v3 + v13;
                v10 -= v13 + v13;
                v3 = v13;
            }

            v13 = arg28 - v3;
            if(v13 < v6.ap * v19) {
                v13 = v6.ap * v19;
            }

            v14 = v3 + arg28;
            if(v14 > v6.aj * v18 - 1) {
                v14 = v6.aj * v18 - 1;
            }

            v15 = v6.al * v17 * v5 + v13;
            while(v13 <= v14) {
                v1 = v6.ax[v15];
                if(v1 == 0) {
                    v6.ax[v15] = v7;
                    ++v15;
                }
                else {
                    v16 = (v1 & v20) == 0 ? 0xFF000000 : (v1 | v0) & v20;
                    v6.ax[v15] = v16 | ((v1 & 0xFF00FF) * v4 >> 8 & 0xFF00FF) + ((v1 & 0xFF00) * v4 >> 8 & 0xFF00) + v9;
                    ++v15;
                }

                ++v13;
            }

            ++v5;
            v8 += v2 + v2;
            v1 = v2 + 1;
            v10 += v2 + v1;
            v2 = v1;
        }
    }

    public final void cf(int arg4, int arg5, int arg6, int arg7) {
        arg7 |= 0xFF000000;
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
                if(arg6 + arg5 > this.an * v2) {
                    arg6 = this.an * v2 - arg5;
                }

                v1 = -107049639;
                arg4 += this.al * v1 * arg5;
                for(arg5 = 0; arg5 < arg6; ++arg5) {
                    this.ax[this.al * v1 * arg5 + arg4] = arg7;
                }

                return;
            }
        }
    }

    public final void cg(es arg23, int arg24, int arg25) {
        int v11;
        ep v0 = this;
        es v1 = arg23;
        int v2 = arg24 + v1.ar;
        int v3 = arg25 + v1.an;
        int v5 = -107049639;
        int v4 = v0.al * v5 * v3 + v2;
        int v6 = v1.ae;
        int v7 = v1.al;
        int v8 = v0.al * 905099014 - v7;
        int v9 = 0;
        if(v3 < v0.ar * 0xFF96BF8D) {
            int v10 = v0.ar * 0x662915F0 - v3;
            v6 -= v10;
            v3 = v0.ar * 0x2D32128F;
            v11 = v7 * v10;
            v4 += v10 * (v0.al * v5);
        }
        else {
            v11 = 0;
        }

        v3 += v6;
        if(v3 > v0.an * 0xD21DC9D7) {
            v6 -= v3 - v0.an * 915620139;
        }

        int v18 = v6;
        v5 = 0xE4D30573;
        if(v2 < v0.ap * v5) {
            v3 = v0.ap * v5 - v2;
            v7 -= v3;
            v2 = v0.ap * 1667150772;
            v11 += v3;
            v4 += v3;
            v9 = v3;
            v8 += v3;
        }

        int v16 = v4;
        int v15 = v11;
        v2 += v7;
        if(v2 > v0.aj * 380095747) {
            v2 -= v0.aj * 0xD9607914;
            v7 -= v2;
            v9 += v2;
            v8 += v2;
        }

        int v17 = v7;
        int v19 = v8;
        int v20 = v9;
        if(v17 > 0) {
            if(v18 <= 0) {
            }
            else {
                az.ah(v0.ax, v1.ax, 0, v15, v16, v17, v18, v19, v20, -6189);
                return;
            }
        }
    }

    public final void ch(int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v1;
        int v24;
        int v8;
        int v10;
        int v20;
        int v19;
        int v18;
        int v17;
        ep v6 = this;
        int v2 = arg29;
        int v3 = arg30;
        int v0 = arg32;
        if(v0 == 0) {
            return;
        }

        int v4 = 0xFF;
        if(v0 >= v4) {
            this.ai(arg28, arg29, arg30, arg31, -22);
            return;
        }

        if(v3 < 0) {
            v3 = -v3;
        }

        int v5 = arg31 & 0xFFFFFF;
        int v7 = (v0 << 24) + v5;
        int v9 = ((v5 & 0xFF00FF) * v0 >> 8 & 0xFF00FF) + ((v5 & 0xFF00) * v0 >> 8 & 0xFF00);
        v4 -= v0;
        v5 = v2 - v3;
        int v12 = 2002832733;
        if(v5 < v6.ar * v12) {
            v5 = v6.ar * v12;
        }

        int v11 = v3 + v2 + 1;
        int v13 = 0xD21DC9D7;
        if(v11 > v6.an * v13) {
            v11 = v6.an * v13;
        }

        v12 = v3 * v3;
        v13 = 0;
        int v14 = v2 - v5;
        int v15 = v14 * v14;
        int v16 = v15 - v14;
        if(v2 > v11) {
            v2 = v11;
        }

        while(true) {
            v17 = -107049639;
            v18 = 0x56AC17CD;
            v19 = 0xE4D30573;
            v20 = 0xFF000000;
            if(v5 >= v2) {
                break;
            }

            int v26 = v16;
            v16 = v13;
            v13 = v26;
            while(true) {
                if(v13 > v12) {
                    if(v15 <= v12) {
                    }
                    else {
                        v10 = arg28 - v16 + 1;
                        if(v10 < v6.ap * v19) {
                            v10 = v6.ap * v19;
                        }

                        v8 = arg28 + v16;
                        v24 = v2;
                        if(v8 > v6.aj * v18) {
                            v8 = v6.aj * v18;
                        }

                        v2 = v6.al * v17 * v5 + v10;
                        break;
                    }
                }

                v24 = v2;
                v15 += v16 + v16;
                v2 = v16 + 1;
                v13 += v16 + v2;
                v16 = v2;
                v2 = v24;
            }

            while(v10 < v8) {
                int v25 = v8;
                v8 = v6.ax[v2];
                if(v8 == 0) {
                    v6.ax[v2] = v7;
                    ++v2;
                }
                else {
                    v17 = (v8 & v20) == 0 ? 0xFF000000 : (v8 | v0) & v20;
                    v6.ax[v2] = v17 | ((v8 & 0xFF00FF) * v4 >> 8 & 0xFF00FF) + ((v8 & 0xFF00) * v4 >> 8 & 0xFF00) + v9;
                    ++v2;
                }

                ++v10;
                v8 = v25;
            }

            ++v5;
            v2 = v14 - 1;
            v15 -= v14 + v2;
            v8 = v13 - (v2 + v2);
            v14 = v2;
            v13 = v16;
            v2 = v24;
            v16 = v8;
        }

        v2 = -v14;
        v8 = v2 * v2 + v12;
        v10 = v8 - v3;
        v8 -= v2;
        while(v5 < v11) {
            while(v8 > v12) {
                if(v10 <= v12) {
                    break;
                }

                v13 = v3 - 1;
                v8 -= v3 + v13;
                v10 -= v13 + v13;
                v3 = v13;
            }

            v13 = arg28 - v3;
            if(v13 < v6.ap * v19) {
                v13 = v6.ap * v19;
            }

            v14 = v3 + arg28;
            if(v14 > v6.aj * v18 - 1) {
                v14 = v6.aj * v18 - 1;
            }

            v15 = v6.al * v17 * v5 + v13;
            while(v13 <= v14) {
                v1 = v6.ax[v15];
                if(v1 == 0) {
                    v6.ax[v15] = v7;
                    ++v15;
                }
                else {
                    v16 = (v1 & v20) == 0 ? 0xFF000000 : (v1 | v0) & v20;
                    v6.ax[v15] = v16 | ((v1 & 0xFF00FF) * v4 >> 8 & 0xFF00FF) + ((v1 & 0xFF00) * v4 >> 8 & 0xFF00) + v9;
                    ++v15;
                }

                ++v13;
            }

            ++v5;
            v8 += v2 + v2;
            v1 = v2 + 1;
            v10 += v2 + v1;
            v2 = v1;
        }
    }

    public final void ci(int arg18, int arg19, int arg20, int arg21) {
        int v12;
        int v15;
        int v14;
        int v13;
        ep v0 = this;
        int v1 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        int v4 = arg21 | 0xFF000000;
        if(v3 == 0) {
            v0.fe(v1, v2, v4, 0x12021A1C);
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

            v11 = v1 + v3;
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

    public final void cj(int arg4, int arg5, int arg6, int arg7) {
        arg7 |= 0xFF000000;
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

                arg4 += this.al * -107049639 * arg5;
                for(arg5 = 0; arg5 < arg6; ++arg5) {
                    this.ax[arg4 + arg5] = arg7;
                }

                return;
            }
        }
    }

    public final void ck(es arg22, int arg23, int arg24) {
        ep v0 = this;
        es v1 = arg22;
        int v2 = arg23 + v1.ar;
        int v3 = arg24 + v1.an;
        int v5 = v0.al * 0x2E768DB9 * v3 + v2;
        int v4 = v1.ae;
        int v6 = v1.al;
        int v8 = -107049639;
        int v7 = v0.al * v8 - v6;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            int v9 = v0.ar * v10 - v3;
            v4 -= v9;
            v3 = v0.ar * 0xB407C55C;
            v10 = v6 * v9;
            v5 += v9 * (v0.al * v8);
        }
        else {
            v10 = 0;
        }

        v3 += v4;
        if(v3 > v0.an * 0xD21DC9D7) {
            v4 -= v3 - v0.an * 0x9099D95E;
        }

        int v17 = v4;
        if(v2 < v0.ap * 0xD7114E04) {
            v3 = v0.ap * 0xE4D30573 - v2;
            v6 -= v3;
            v2 = 0x5FB3C025 * v0.ap;
            v10 += v3;
            v5 += v3;
            v11 = v3;
            v7 += v3;
        }

        int v15 = v5;
        int v14 = v10;
        v2 += v6;
        if(v2 > v0.aj * 0x56AC17CD) {
            v2 -= v0.aj * 0x6E3488B8;
            v6 -= v2;
            v11 += v2;
            v7 += v2;
        }

        int v16 = v6;
        int v18 = v7;
        int v19 = v11;
        if(v16 > 0) {
            if(v17 <= 0) {
            }
            else {
                ez.az(v0.ax, v1.ax, v14, v15, v16, v17, v18, v19, 606291336);
                return;
            }
        }
    }

    public final void cl(es arg22, int arg23, int arg24) {
        int v9;
        ep v0 = this;
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
                ez.az(v0.ax, v1.ax, v14, v15, v16, v17, v18, v19, 0xF1E80521);
                return;
            }
        }
    }

    public final void cn(es arg21, int arg22, int arg23) {
        int v10;
        ep v0 = this;
        es v1 = arg21;
        int v2 = arg22 + v1.ar;
        int v3 = arg23 + v1.an;
        int v5 = v0.al * 1108207321 * v3 + v2;
        int v4 = v1.ae;
        int v6 = v1.al;
        int v8 = v0.al * 0x38D4B1B5 - v6;
        int v7 = 0;
        if(v3 < v0.ar * 1930094297) {
            int v9 = v0.ar * -1171090526 - v3;
            v4 -= v9;
            v3 = v0.ar * 2002832733;
            v10 = v6 * v9;
            v5 += v9 * (v0.al * 0x2F45DCFA);
        }
        else {
            v10 = 0;
        }

        v3 += v4;
        if(v3 > v0.an * -290170462) {
            v4 -= v3 - v0.an * 0xD21DC9D7;
        }

        int v16 = v4;
        if(v2 < v0.ap * 0x289CEF66) {
            v3 = v0.ap * 0x85FF2BB2 - v2;
            v6 -= v3;
            v2 = 0xE4D30573 * v0.ap;
            v10 += v3;
            v5 += v3;
            v7 = v3;
            v8 += v3;
        }

        int v14 = v5;
        int v13 = v10;
        v2 += v6;
        if(v2 > v0.aj * 0x8D4A425B) {
            v2 -= v0.aj * 0xB072F57E;
            v6 -= v2;
            v7 += v2;
            v8 += v2;
        }

        int v15 = v6;
        int v18 = v7;
        int v17 = v8;
        if(v15 > 0) {
            if(v16 <= 0) {
            }
            else {
                ez.az(v0.ax, v1.ax, v13, v14, v15, v16, v17, v18, 0x490FEFD2);
                return;
            }
        }
    }

    static void co(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg8 = -arg8; arg8 < 0; ++arg8) {
            int v0 = arg6 + arg7 - 3;
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

    public final void cp(int arg11, int arg12, int arg13, int arg14, int arg15) {
        int v5 = arg15 - 0x7F521B5E & -1284409224;
        arg13 -= arg11;
        arg14 -= arg12;
        if(arg14 == 0) {
            if(arg13 >= 0) {
                this.aj(arg11, arg12, arg13 + 1, v5, 0x6691C5AF);
            }
            else {
                this.aj(arg13 + arg11, arg12, -arg13 + 1, v5, 1130848170);
            }

            return;
        }

        if(arg13 == 0) {
            if(arg14 >= 0) {
                this.aq(arg11, arg12, arg14 + 1, v5, 0x1795F574);
            }
            else {
                this.aq(arg11, arg12 + arg14, -arg14 + 1, v5, 0x1795F574);
            }

            return;
        }

        if(arg14 + arg13 < 0) {
            arg11 += arg13;
            arg13 = -arg13;
            arg12 += arg14;
            arg14 = -arg14;
        }

        arg15 = -107049639;
        int v0 = 0xE4D30573;
        double v1 = 0.5;
        int v3 = 0x56AC17CD;
        if(arg13 > arg14) {
            arg12 = (arg12 << 16) + 0x8000;
            arg14 = ((int)Math.floor((((double)(arg14 << 16))) / (((double)arg13)) + v1));
            arg13 += arg11;
            if(arg11 < this.ap * 0x3B52C3F2) {
                arg12 += (this.ap * 0x591FB26D - arg11) * arg14;
                arg11 = this.ap * v0;
            }

            if(arg13 >= this.aj * v3) {
                arg13 = this.aj * v3 - 1;
            }

            while(arg11 <= arg13) {
                v0 = arg12 >> 16;
                if(v0 >= this.ar * 0xC0FE001A && v0 < this.an * 0xD21DC9D7) {
                    this.ax[this.al * arg15 * v0 + arg11] = v5;
                }

                arg12 += arg14;
                ++arg11;
            }
        }
        else {
            arg11 = (arg11 << 16) - 0x4E799908;
            arg13 = ((int)Math.floor((((double)(arg13 << 16))) / (((double)arg14)) + v1));
            arg14 += arg12;
            if(arg12 < this.ar * 0x8C3C0FBA) {
                arg11 += (this.ar * 0xE481E496 - arg12) * arg13;
                arg12 = this.ar * 2002832733;
            }

            if(arg14 >= this.an * 1750285271) {
                arg14 = this.an * 0xC1F25C91 - 1;
            }

            while(arg12 <= arg14) {
                int v1_1 = arg11 >> 16;
                if(v1_1 >= this.ap * v0 && v1_1 < this.aj * v3) {
                    this.ax[this.al * arg15 * arg12 + v1_1] = v5;
                }

                arg11 += arg13;
                ++arg12;
            }
        }
    }

    void cq(int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    public final void cr(int arg18, int arg19, int arg20, int arg21) {
        int v12;
        int v15;
        int v14;
        int v13;
        ep v0 = this;
        int v1 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        int v4 = arg21 | 0xFF000000;
        if(v3 == 0) {
            v0.fe(v1, v2, v4, -1303466935);
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

            v11 = v1 + v3;
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

    public final void cs(int arg25, int arg26, int arg27, int arg28, int arg29) {
        int v1;
        int v21;
        int v7;
        int v18;
        int v17;
        int v16;
        ep v6 = this;
        int v2 = arg26;
        int v3 = arg27;
        int v0 = arg29;
        if(v0 == 0) {
            return;
        }

        if(v0 >= 0xFF) {
            this.ai(arg25, arg26, arg27, arg28, -88);
            return;
        }

        if(v3 < 0) {
            v3 = -v3;
        }

        int v4 = arg28 & 0xFFFFFF;
        int v5 = (v0 << 24) + v4;
        int v8 = ((v4 & 0xFF00FF) * v0 >> 8 & 0x2BA069FC) + ((v4 & 1049069417) * v0 >> 8 & 440620416);
        v4 = 0xD0010A01 - v0;
        int v9 = v2 - v3;
        if(v9 < v6.ar * 0x92DFAC31) {
            v9 = v6.ar * 2002832733;
        }

        int v10 = v3 + v2 + 1;
        if(v10 > v6.an * 0xD21DC9D7) {
            v10 = v6.an * 633725402;
        }

        int v11 = v3 * v3;
        int v12 = 0;
        int v13 = v2 - v9;
        int v14 = v13 * v13;
        int v15 = v14 - v13;
        if(v2 > v10) {
            v2 = v10;
        }

        while(true) {
            v16 = -107049639;
            v17 = 0x56AC17CD;
            v18 = 0xFF000000;
            if(v9 >= v2) {
                break;
            }

            while(true) {
                if(v15 > v11) {
                    if(v14 <= v11) {
                    }
                    else {
                        v7 = arg25 - v12 + 1;
                        v21 = v2;
                        if(v7 < v6.ap * 0x4129701C) {
                            v7 = 0xA5243FDA * v6.ap;
                        }

                        v2 = arg25 + v12;
                        if(v2 > v6.aj * v17) {
                            v2 = v6.aj * 0x964CA22B;
                        }

                        v1 = v6.al * v16 * v9 + v7;
                        break;
                    }
                }

                v14 += v12 + v12;
                v1 = v12 + 1;
                v15 += v12 + v1;
                v12 = v1;
                v2 = v2;
            }

            while(v7 < v2) {
                int v22 = v2;
                v2 = v6.ax[v1];
                if(v2 == 0) {
                    v6.ax[v1] = v5;
                    ++v1;
                }
                else {
                    v16 = (v2 & v18) == 0 ? 0xFF000000 : (v2 | v0) & v18;
                    v6.ax[v1] = v16 | ((v2 & 0xFF00FF) * v4 >> 8 & 0xC7D5CC69) + ((v2 & 0xFF00) * v4 >> 8 & 0xDCB25087) + v8;
                    ++v1;
                }

                ++v7;
                v2 = v22;
            }

            ++v9;
            v1 = v13 - 1;
            v14 -= v13 + v1;
            v15 -= v1 + v1;
            v13 = v1;
            v2 = v21;
        }

        v1 = -v13;
        v2 = v1 * v1 + v11;
        v7 = v2 - v3;
        v2 -= v1;
        while(v9 < v10) {
            while(v2 > v11) {
                if(v7 <= v11) {
                    break;
                }

                v12 = v3 - 1;
                v2 -= v3 + v12;
                v7 -= v12 + v12;
                v3 = v12;
            }

            v13 = arg25 - v3;
            if(v13 < v6.ap * 0xB8977181) {
                v13 = 0xE4D30573 * v6.ap;
            }

            v14 = v3 + arg25;
            int v23 = v3;
            if(v14 > v6.aj * 0x4F954528 - 1) {
                v14 = v6.aj * v17 - 1;
            }

            v3 = v6.al * v16 * v9 + v13;
            while(v13 <= v14) {
                v15 = v6.ax[v3];
                if(v15 == 0) {
                    v6.ax[v3] = v5;
                    ++v3;
                }
                else {
                    int v19 = (v15 & 0x401DBF9D) == 0 ? 0xFF000000 : (v15 | v0) & v18;
                    v6.ax[v3] = v19 | ((v15 & 1146429052) * v4 >> 8 & 0x67016565) + ((v15 & 2073437833) * v4 >> 8 & 0xE024E801) + v8;
                    ++v3;
                }

                ++v13;
            }

            ++v9;
            v2 += v1 + v1;
            v3 = v1 + 1;
            v7 += v1 + v3;
            v1 = v3;
            v3 = v23;
        }
    }

    void ct(int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    void cu(int arg4, int arg5, int arg6, int arg7, int arg8) {
        if(arg4 < this.ap * 0xE4D30573) {
            arg6 -= this.ap * 0x570CB8A0 - arg4;
            arg4 = 0xECAF350A * this.ap;
        }

        if(arg5 < this.ar * 0xC00152F6) {
            arg7 -= this.ar * 2002832733 - arg5;
            arg5 = this.ar * 2002832733;
        }

        if(arg6 + arg4 > this.aj * 0xB52EE971) {
            arg6 = this.aj * 0x947C8F89 - arg4;
        }

        if(arg7 + arg5 > this.an * 1698304723) {
            arg7 = this.an * -1696086596 - arg5;
        }

        int v1 = this.al * -107049639 - arg6;
        arg4 += arg5 * (this.al * 1699529000);
        for(arg5 = -arg7; arg5 < 0; ++arg5) {
            arg7 = -arg6;
            while(arg7 < 0) {
                this.ax[arg4] = arg8;
                ++arg7;
                ++arg4;
            }

            arg4 += v1;
        }
    }

    public final void cv(es arg23, int arg24, int arg25) {
        int v9;
        ep v0 = this;
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
                az.ah(v0.ax, v1.ax, 0, v15, v16, v17, v18, v19, v20, 0x40A3);
                return;
            }
        }
    }

    final void cw(int arg9, int arg10, int arg11, int arg12, int arg13) {
        if(arg13 <= 0) {
            return;
        }

        if(arg13 >= 0x1611E60E) {
            this.aq(arg9, arg10, arg11, arg12, 0x1795F574);
            return;
        }

        if(arg9 >= this.ap * 768494056) {
            if(arg9 >= this.aj * 0x8D460E1E) {
            }
            else {
                if(arg10 < this.ar * 0x2CBF1FDB) {
                    arg11 -= this.ar * 2002832733 - arg10;
                    arg10 = this.ar * 0x2BD12069;
                }

                if(arg11 + arg10 > this.an * 0xDB59BEEC) {
                    arg11 = this.an * 0x61B0EDA6 - arg10;
                }

                int v0 = 0xFF - arg13;
                int v1 = arg13 << 24;
                int v2 = (arg12 >> 16 & -712855940) * arg13;
                int v3 = (arg12 >> 8 & 0xFF) * arg13;
                arg13 *= -607067884 & arg12;
                arg12 |= v1;
                int v5 = -107049639;
                arg9 += this.al * v5 * arg10;
                for(arg10 = 0; arg10 < arg11; ++arg10) {
                    this.ax[arg9] = this.ax[arg9] == 0 ? arg12 : (this.ax[arg9] | v1) & -898382404 | ((this.ax[arg9] & 0xFF) * v0 + arg13 >> 8) + (((this.ax[arg9] >> 16 & 0xF3701D5D) * v0 + v2 >> 8 << 16) + ((this.ax[arg9] >> 8 & 0xFF) * v0 + v3 >> 8 << 8));
                    arg9 += this.al * v5;
                }

                return;
            }
        }
    }

    public final void cx(int arg4, int arg5, int arg6, int arg7) {
        arg7 |= 628709003;
        if(arg4 >= this.ap * -107724523) {
            if(arg4 >= this.aj * 0x56AC17CD) {
            }
            else {
                if(arg5 < this.ar * -602742071) {
                    arg6 -= this.ar * 0x5AAA0250 - arg5;
                    arg5 = 0x8E93098E * this.ar;
                }

                if(arg6 + arg5 > this.an * 0xD21DC9D7) {
                    arg6 = this.an * 0x5293C821 - arg5;
                }

                int v1 = -107049639;
                arg4 += this.al * v1 * arg5;
                for(arg5 = 0; arg5 < arg6; ++arg5) {
                    this.ax[this.al * v1 * arg5 + arg4] = arg7;
                }

                return;
            }
        }
    }

    final void cy(int arg10, int arg11, int arg12, int arg13, int arg14) {
        if(arg14 <= 0) {
            return;
        }

        int v0 = 0xFF;
        if(arg14 >= v0) {
            this.aq(arg10, arg11, arg12, arg13, 0x1795F574);
            return;
        }

        if(arg10 >= this.ap * 0xE4D30573) {
            if(arg10 >= this.aj * 0x56AC17CD) {
            }
            else {
                int v2 = 2002832733;
                if(arg11 < this.ar * v2) {
                    arg12 -= this.ar * v2 - arg11;
                    arg11 = this.ar * v2;
                }

                int v3 = 0xD21DC9D7;
                if(arg12 + arg11 > this.an * v3) {
                    arg12 = this.an * v3 - arg11;
                }

                int v1 = 0xFF - arg14;
                v2 = arg14 << 24;
                v3 = (arg13 >> 16 & v0) * arg14;
                int v4 = (arg13 >> 8 & v0) * arg14;
                arg14 *= arg13 & 0xFF;
                arg13 |= v2;
                int v6 = -107049639;
                arg10 += this.al * v6 * arg11;
                for(arg11 = 0; arg11 < arg12; ++arg11) {
                    this.ax[arg10] = this.ax[arg10] == 0 ? arg13 : (this.ax[arg10] | v2) & 0xFF000000 | ((this.ax[arg10] & v0) * v1 + arg14 >> 8) + (((this.ax[arg10] >> 16 & v0) * v1 + v3 >> 8 << 16) + ((this.ax[arg10] >> 8 & v0) * v1 + v4 >> 8 << 8));
                    arg10 += this.al * v6;
                }

                return;
            }
        }
    }

    public final void cz(es arg22, int arg23, int arg24) {
        int v9;
        ep v0 = this;
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
                ez.az(v0.ax, v1.ax, v14, v15, v16, v17, v18, v19, 0xBC22CA3);
                return;
            }
        }
    }

    static void da(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg8 = arg3[arg7] + arg5;
                    arg5 = (arg5 & 0xFF00FF) + (arg3[arg7] & 0xFF00FF);
                    arg6 = (0xE2A098B2 & arg5) + (arg8 - arg5 & 0x10000);
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

    static void db(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg8 = -arg8; arg8 < 0; ++arg8) {
            int v0 = arg6 + arg7 - 3;
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

    static void dc(int[] arg5, byte[] arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
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

    static void dd(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg8 = arg3[arg7] + arg5;
                    arg5 = (arg5 & 0xFF00FF) + (arg3[arg7] & 0xFF00FF);
                    arg6 = (0x1000100 & arg5) + (arg8 - arg5 & 0xCD8FAF02);
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

    public void de(es arg19, int arg20, int arg21, int arg22, int arg23) {
        int v14;
        int v13;
        int v9;
        int v7;
        ep v0 = this;
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
                v3 = v2 + v9;
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

                cc.ao(v0.ax, v1.ax, 0, v7, v5, v4, v6, v2, v13, v10, v11, v12, 0x381897A7);
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

    static final void dg(ie arg1, int arg2, int arg3) {
        arg3 = 0x914F0683;
        try {
            gm.ek(arg1.bp * arg3, arg1.bw * 0xD19D0C3D, arg2, 730733670);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ep.dg(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static void dg(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg8 = (arg5 & 0xFF00FF) * arg13;
                    arg5 = (0xFF00FF00 & arg8) + (arg5 * arg13 - arg8 & 0xFF0000) >>> 8;
                    arg10 = arg3[arg7] + arg5;
                    arg8 = (arg3[arg7] & 0xFF00FF) + (arg5 & 0xFF00FF);
                    arg5 = (0x1000100 & arg8) + (arg10 - arg8 & 0x10000);
                    arg3[arg7] = arg5 - (arg5 >>> 8) | arg10 - arg5;
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

    public void dh(ef arg21, int arg22, int arg23) {
        int v8;
        ep v0 = this;
        ef v1 = arg21;
        int v2 = arg22 + v1.an;
        int v3 = arg23 + v1.ap;
        int v5 = v0.al * -1970537406 * v3 + v2;
        int v4 = v1.ar;
        int v6 = v1.ae;
        int v7 = v0.al * -107049639 - v6;
        int v9 = 0;
        if(v3 < v0.ar * 0x912F391C) {
            int v10 = v0.ar * 2002832733 - v3;
            v4 -= v10;
            v3 = v0.ar * 0x9305CD7E;
            v8 = v6 * v10;
            v5 += v10 * (v0.al * -2004796720);
        }
        else {
            v8 = 0;
        }

        v3 += v4;
        if(v3 > v0.an * 0xD21DC9D7) {
            v4 -= v3 - v0.an * 1210079825;
        }

        int v16 = v4;
        if(v2 < v0.ap * 0x6ECC7761) {
            v3 = v0.ap * 0x839662F9 - v2;
            v6 -= v3;
            v2 = 0xE4D30573 * v0.ap;
            v8 += v3;
            v5 += v3;
            v9 = v3;
            v7 += v3;
        }

        int v14 = v5;
        int v13 = v8;
        v2 += v6;
        v4 = 0x56AC17CD;
        if(v2 > v0.aj * v4) {
            v2 -= v0.aj * v4;
            v6 -= v2;
            v9 += v2;
            v7 += v2;
        }

        int v15 = v6;
        int v17 = v7;
        int v18 = v9;
        if(v15 > 0) {
            if(v16 <= 0) {
            }
            else {
                cb.ay(v0.ax, v1.ax, v1.al, v13, v14, v15, v16, v17, v18, 0x88105611);
                return;
            }
        }
    }

    static void di(int[] arg9, byte[] arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20) {
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

    static void dk(int[] arg5, byte[] arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
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

    public void dl(es arg28, int arg29, int arg30, int arg31) {
        int v9;
        ep v0 = this;
        es v1 = arg28;
        int v2 = arg29 + v1.ar;
        int v3 = arg30 + v1.an;
        int v4 = v0.al * 1630209085 * v3 + v2;
        int v5 = v1.ae;
        int v6 = v1.al;
        int v8 = -107049639;
        int v7 = v0.al * v8 - v6;
        int v10 = 2002832733;
        int v11 = 0;
        if(v3 < v0.ar * v10) {
            int v12 = v0.ar * 0x31BA037B - v3;
            v5 -= v12;
            v3 = v0.ar * v10;
            v9 = v12 * v6;
            v4 += v12 * (v0.al * v8);
        }
        else {
            v9 = 0;
        }

        v3 += v5;
        v10 = 0xD21DC9D7;
        if(v3 > v0.an * v10) {
            v5 -= v3 - v0.an * v10;
        }

        int v22 = v5;
        v5 = 0xE4D30573;
        if(v2 < v0.ap * v5) {
            v3 = v0.ap * v5 - v2;
            v6 -= v3;
            v2 = v0.ap * 1702600699;
            v9 += v3;
            v4 += v3;
            v11 = v3;
            v7 += v3;
        }

        int v19 = v4;
        int v17 = v9;
        v2 += v6;
        v4 = 0x56AC17CD;
        if(v2 > v0.aj * v4) {
            v2 -= v0.aj * v4;
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
                if(0x7CAB1FF9 == arg31) {
                    dn.ac(0, 0, 0, v0.ax, v1.ax, v17, 0, v19, 0, v21, v22, v23, v24, 0x6D5FA444);
                }
                else {
                    jw.ba(0, 0, 0, v0.ax, v1.ax, v17, 0, v19, 0, v21, v22, v23, v24, arg31, 0x58902CC7);
                }

                return;
            }
        }
    }

    static void dm(int[] arg5, byte[] arg6, int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
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

    static void dn(int[] arg9, byte[] arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20) {
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

    static void do(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg8 = arg3[arg7] + arg5;
                    arg5 = (arg5 & 0xFF00FF) + (arg3[arg7] & 0xFF00FF);
                    arg6 = (0x1000100 & arg5) + (arg8 - arg5 & 0x10000);
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

    static void dp(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg8 = -arg8; arg8 < 0; ++arg8) {
            int v0 = arg6 + arg7 - 3;
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

    public void dq(es arg18, int arg19, int arg20, int arg21, int arg22) {
        int v9;
        ep v0 = this;
        es v1 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        if(arg21 >= 0xFF) {
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
                mz.bn(v0.ax, v1.ax, 0, v10, v9, v2, v3, v12, v13, arg21, arg22, 0x3F87BCFC);
                return;
            }
        }
    }

    public void dr(es arg28, int arg29, int arg30, int arg31) {
        int v9;
        ep v0 = this;
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
                if(0x100 == arg31) {
                    dn.ac(0, 0, 0, v0.ax, v1.ax, v17, 0, v19, 0, v21, v22, v23, v24, 0x6D5FA444);
                }
                else {
                    jw.ba(0, 0, 0, v0.ax, v1.ax, v17, 0, v19, 0, v21, v22, v23, v24, arg31, 1569277029);
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
        ep v0 = this;
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
        int v6 = -107049639;
        v4 = v0.al * v6 * v14 + v9;
        int v7 = v0.al * v6 - v3;
        v13 = v14 + v2;
        int v16 = 0xD21DC9D7;
        if(v13 > v0.an * v16) {
            v2 -= v13 - v0.an * v16;
        }

        int v15 = 2002832733;
        if(v14 < v0.ar * v15) {
            v13 = v0.ar * v15 - v14;
            v2 -= v13;
            v4 += v0.al * v6 * v13;
            v8 += v13 * v11;
        }

        v13 = v2;
        v2 = v3 + v9;
        v14 = 0x56AC17CD;
        if(v2 > v0.aj * v14) {
            v2 -= v0.aj * v14;
            v3 -= v2;
            v7 += v2;
        }

        v6 = 0xE4D30573;
        if(v9 < v0.ap * v6) {
            v2 = v0.ap * v6 - v9;
            v3 -= v2;
            v4 += v2;
            v5 += v2 * v10;
            v7 += v2;
        }

        ew.ak(v0.ax, v1.ax, v1.al, v5, v8, v4, v7, v3, v13, v10, v11, v12, 0x2A0F2283);
    }

    public void dt(es arg18, int arg19, int arg20, int arg21, int arg22) {
        int v11;
        int v10;
        ep v0 = this;
        es v1 = arg18;
        int v2 = arg19;
        int v3 = arg20;
        if(arg21 >= 1093165354) {
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
        int v9 = 0;
        if(v3 < v0.ar * 0x900E928) {
            v10 = v0.ar * 0xB0812175 - v3;
            v6 -= v10;
            v3 = v0.ar * 0xBB89F039;
            v11 = v7 * v10;
            v4 += v10 * (v0.al * v5);
        }
        else {
            v11 = 0;
        }

        v3 += v6;
        if(v3 > v0.an * 0xD21DC9D7) {
            v6 -= v3 - v0.an * 300512149;
        }

        v3 = v6;
        v6 = 0xE4D30573;
        if(v2 < v0.ap * v6) {
            v5 = v0.ap * v6 - v2;
            v7 -= v5;
            v2 = v0.ap * v6;
            v11 += v5;
            v4 += v5;
            v9 = v5;
            v8 += v5;
        }

        v2 += v7;
        if(v2 > v0.aj * 0x56AC17CD) {
            v2 -= v0.aj * 0x1C0330F5;
            v7 -= v2;
            v9 += v2;
            v8 += v2;
        }

        v10 = v7;
        int v12 = v8;
        int v13 = v9;
        if(v10 > 0) {
            if(v3 <= 0) {
            }
            else {
                mz.bn(v0.ax, v1.ax, 0, v11, v4, v10, v3, v12, v13, arg21, arg22, 0x56DD08E1);
                return;
            }
        }
    }

    static void du(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
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

    static void dv(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg8 = -arg8; arg8 < 0; ++arg8) {
            int v0 = arg6 + arg7 - 3;
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

    public void dw(ef arg23, int arg24, int arg25) {
        int v9;
        ep v0 = this;
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
                cb.ay(v0.ax, v1.ax, v1.al, v15, v16, v17, v18, v19, v20, 0x18BEA86D);
                return;
            }
        }
    }

    static void dx(int[] arg9, byte[] arg10, int[] arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19, int arg20) {
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

    static void dy(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
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

    static void dz(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        for(arg0 = -arg10; arg0 < 0; ++arg0) {
            arg1 = -arg9;
            while(arg1 < 0) {
                arg2 = arg5 + 1;
                arg5 = arg4[arg5];
                if(arg5 != 0) {
                    arg8 = arg3[arg7] + arg5;
                    arg5 = (arg5 & 0xFF00FF) + (arg3[arg7] & 0xFF00FF);
                    arg6 = (0x1000100 & arg5) + (arg8 - arg5 & 0x10000);
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

    static void ea(int[] arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        arg6 = 0xFF - arg13;
        arg6 = (0xFF0000 & (arg14 & 0x3EB8B5CF) * arg6 | (0x61FBFA9B & arg14) * arg6 & 2030214098) >>> 8;
        for(arg10 = -arg10; arg10 < 0; ++arg10) {
            arg14 = -arg9;
            while(arg14 < 0) {
                int v0 = arg7 + 1;
                arg7 = arg5[arg7];
                if(arg7 != 0) {
                    arg4[arg8] = (((arg7 & 0x2D930551) * arg13 & 0x56A97B70 | (0xFF00FF & arg7) * arg13 & 0xFF00FF00) >>> 8) + arg6 | 0xFF000000;
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

    void eb(es arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v22;
        int v24;
        ep v0 = this;
        es v1 = arg26;
        int v4 = arg32;
        if(v4 == 0) {
            return;
        }

        int v5 = arg27 - (v1.ar << 4);
        int v6 = arg28 - (v1.an << 4);
        double v7 = (((double)(arg31 & 0xBC8F0139))) * 0.000096;
        double v11 = ((double)v4);
        v4 = ((int)Math.floor(Math.sin(v7) * v11 + 0.5));
        int v9 = ((int)Math.floor(Math.cos(v7) * v11 + 0.5));
        int v10 = -v6;
        int v15 = v4 * v10;
        int v13 = -v5;
        int v14 = v13 * v9;
        double v18 = v7;
        int v7_1 = v15 + v14;
        v10 *= v9;
        int v8 = -v13 * v4;
        v13 = v10 + v8;
        double v20 = v11;
        int v11_1 = ((v1.al << 4) - v5) * v9 + v15;
        v10 += -((v1.al << 4) - v5) * v4;
        v14 += ((v1.ae << 4) - v6) * v4;
        int v12 = ((v1.ae << 4) - v6) * v9 + v8;
        v8 = ((v1.al << 4) - v5) * v9 + ((v1.ae << 4) - v6) * v4;
        v4 = v4 * -((v1.al << 4) - v5) + ((v1.ae << 4) - v6) * v9;
        if(v7_1 < v11_1) {
            v24 = v11_1;
            v11_1 = v7_1;
            v7_1 = v24;
        }

        if(v14 < v11_1) {
            v11_1 = v14;
        }

        if(v8 < v11_1) {
            v11_1 = v8;
        }

        if(v14 > v7_1) {
        }
        else {
            v14 = v7_1;
        }

        if(v8 > v14) {
        }
        else {
            v8 = v14;
        }

        if(v13 < v10) {
            v24 = v13;
            v13 = v10;
            v10 = v24;
        }

        if(v12 < v10) {
            v10 = v12;
        }

        if(v4 < v10) {
            v10 = v4;
        }

        if(v12 > v13) {
        }
        else {
            v12 = v13;
        }

        if(v4 > v12) {
            v12 = v4;
        }

        v4 = (v11_1 >> 12) + arg29 >> 4;
        v7_1 = (v8 + 0x4545A309 >> 12) + arg29 + 15 >> 4;
        v8 = (v10 >> 12) + arg30 >> 4;
        v9 = (v12 + 0x2031B24F >> 12) + arg30 + 15 >> 4;
        if(v4 < v0.ap * 0x891E62F4) {
            v4 = v0.ap * 0xE4D30573;
        }

        if(v7_1 > v0.aj * 0xFE5FC104) {
            v7_1 = v0.aj * 0x5E580EC6;
        }

        if(v8 < v0.ar * -1539555810) {
            v8 = v0.ar * 2002832733;
        }

        if(v9 > v0.an * 0x35D8054A) {
            v9 = 0xD21DC9D7 * v0.an;
        }

        v7_1 = v4 - v7_1;
        if(v7_1 >= 0) {
            return;
        }

        v9 = v8 - v9;
        if(v9 >= 0) {
            return;
        }

        v11_1 = -107049639;
        v10 = v0.al * v11_1 * v8 + v4;
        double v12_1 = 16777216 / v20;
        v14 = ((int)Math.floor(Math.sin(v18) * v12_1 + 0.5));
        v12 = ((int)Math.floor(Math.cos(v18) * v12_1 + 0.5));
        v4 = (v4 << 4) + 8 - arg29;
        int v2 = (v8 << 4) + 8 - arg30;
        int v3 = (v5 << 8) - (v2 * v14 >> 4);
        v2 = (v2 * v12 >> 4) + (v6 << 8);
        if(v12 == 0) {
            if(v14 == 0) {
                while(true) {
                    if(v9 >= 0) {
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
                        v4 = v7_1;
                        v5 = v10;
                        while(v4 < 0) {
                            v6 = v1.ax[(v3 >> 12) + (v2 >> 12) * v1.al];
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

                    ++v9;
                    v10 += v0.al * v11_1;
                }
            }

            if(v14 < 0) {
                while(true) {
                    if(v9 < 0) {
                        v5 = (v4 * v14 >> 4) + v2;
                        if(v3 < 0) {
                        }
                        else if(v3 - (v1.al << 12) >= 0) {
                        }
                        else {
                            v6 = v5 - (v1.ae << 12);
                            if(v6 >= 0) {
                                v6 = (v14 - v6) / v14;
                                v8 = v7_1 + v6;
                                v5 += v6 * v14;
                                v6 += v10;
                            }
                            else {
                                v8 = v7_1;
                                v6 = v10;
                            }

                            v11_1 = (v5 - v14) / v14;
                            if(v11_1 > v8) {
                                v8 = v11_1;
                            }

                            while(v8 < 0) {
                                v11_1 = v1.ax[(v5 >> 12) * v1.al + (v3 >> 12)];
                                if(v11_1 != 0) {
                                    v0.ax[v6] = v11_1;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v14;
                                ++v8;
                            }
                        }

                        ++v9;
                        v3 -= v14;
                        v10 += v0.al * -1824411022;
                        continue;
                    }
                    else {
                        return;
                    }
                }
            }

            while(v9 < 0) {
                v5 = (v14 * v4 >> 4) + v2;
                if(v3 < 0) {
                }
                else if(v3 - (v1.al << 12) >= 0) {
                }
                else {
                    if(v5 < 0) {
                        v6 = (v14 - 1 - v5) / v14;
                        v8 = v7_1 + v6;
                        v5 += v14 * v6;
                        v6 += v10;
                    }
                    else {
                        v8 = v7_1;
                        v6 = v10;
                    }

                    v12 = (v5 + 1 - (v1.ae << 12) - v14) / v14;
                    if(v12 > v8) {
                        v8 = v12;
                    }

                    while(v8 < 0) {
                        v11_1 = v1.ax[(v3 >> 12) + (v5 >> 12) * v1.al];
                        if(v11_1 != 0) {
                            v0.ax[v6] = v11_1;
                            ++v6;
                        }
                        else {
                            ++v6;
                        }

                        v5 += v14;
                        ++v8;
                    }
                }

                ++v9;
                v3 -= v14;
                v10 += v0.al * -107049639;
            }
        }
        else {
            if(v12 < 0) {
                if(v14 == 0) {
                    while(true) {
                        if(v9 >= 0) {
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
                                v8 = v7_1 + v6;
                                v5 += v12 * v6;
                                v6 += v10;
                            }
                            else {
                                v8 = v7_1;
                                v6 = v10;
                            }

                            v11_1 = (v5 - v12) / v12;
                            if(v11_1 > v8) {
                                v8 = v11_1;
                            }

                            while(v8 < 0) {
                                v11_1 = v1.ax[(v2 >> 12) * v1.al + (v5 >> 12)];
                                if(v11_1 != 0) {
                                    v0.ax[v6] = v11_1;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v12;
                                ++v8;
                            }
                        }

                        ++v9;
                        v2 += v12;
                        v10 += v0.al * 0x5F977CFD;
                    }
                }

                if(v14 < 0) {
                    while(true) {
                        if(v9 >= 0) {
                            return;
                        }

                        v5 = (v12 * v4 >> 4) + v3;
                        v6 = (v14 * v4 >> 4) + v2;
                        v8 = v5 - (v1.al << 12);
                        if(v8 >= 0) {
                            v8 = (v12 - v8) / v12;
                            v11_1 = v7_1 + v8;
                            v5 += v8 * v12;
                            v6 += v8 * v14;
                            v8 += v10;
                        }
                        else {
                            v11_1 = v7_1;
                            v8 = v10;
                        }

                        v13 = (v5 - v12) / v12;
                        if(v13 > v11_1) {
                            v11_1 = v13;
                        }

                        v13 = v6 - (v1.ae << 12);
                        if(v13 >= 0) {
                            v13 = (v14 - v13) / v14;
                            v11_1 += v13;
                            v5 += v12 * v13;
                            v6 += v13 * v14;
                            v8 += v13;
                        }

                        v13 = (v6 - v14) / v14;
                        if(v13 > v11_1) {
                            v11_1 = v13;
                        }

                        while(v11_1 < 0) {
                            v22 = v7_1;
                            v7_1 = v1.ax[(v5 >> 12) + v1.al * (v6 >> 12)];
                            if(v7_1 != 0) {
                                v0.ax[v8] = v7_1;
                                ++v8;
                            }
                            else {
                                ++v8;
                            }

                            v5 += v12;
                            v6 += v14;
                            ++v11_1;
                            v7_1 = v22;
                        }

                        ++v9;
                        v3 -= v14;
                        v2 += v12;
                        v10 += v0.al * -107049639;
                    }
                }

                v22 = v7_1;
                while(true) {
                    if(v9 >= 0) {
                        return;
                    }

                    v5 = (v4 * v12 >> 4) + v3;
                    v6 = (v4 * v14 >> 4) + v2;
                    v7_1 = v5 - (v1.al << 12);
                    if(v7_1 >= 0) {
                        v7_1 = (v12 - v7_1) / v12;
                        v8 = v22 + v7_1;
                        v5 += v7_1 * v12;
                        v6 += v14 * v7_1;
                        v7_1 += v10;
                    }
                    else {
                        v7_1 = v10;
                        v8 = v22;
                    }

                    v11_1 = (v5 - v12) / v12;
                    if(v11_1 > v8) {
                        v8 = v11_1;
                    }

                    if(v6 < 0) {
                        v11_1 = (v14 - 1 - v6) / v14;
                        v8 += v11_1;
                        v5 += v11_1 * v12;
                        v6 += v14 * v11_1;
                        v7_1 += v11_1;
                    }

                    v11_1 = (v6 + 1 - (v1.ae << 12) - v14) / v14;
                    if(v11_1 > v8) {
                        v8 = v11_1;
                    }

                    while(v8 < 0) {
                        v11_1 = v1.ax[v1.al * (v6 >> 12) + (v5 >> 12)];
                        if(v11_1 != 0) {
                            v0.ax[v7_1] = v11_1;
                            ++v7_1;
                        }
                        else {
                            ++v7_1;
                        }

                        v5 += v12;
                        v6 += v14;
                        ++v8;
                    }

                    ++v9;
                    v3 -= v14;
                    v2 += v12;
                    v10 += v0.al * -107049639;
                }
            }

            v22 = v7_1;
            if(v14 == 0) {
                while(true) {
                    if(v9 >= 0) {
                        return;
                    }

                    v5 = (v4 * v12 >> 4) + v3;
                    if(v2 < 0) {
                    }
                    else if(v2 - (v1.ae << 12) >= 0) {
                    }
                    else {
                        if(v5 < 0) {
                            v6 = (v12 - 1 - v5) / v12;
                            v7_1 = v22 + v6;
                            v5 += v12 * v6;
                            v6 += v10;
                        }
                        else {
                            v6 = v10;
                            v7_1 = v22;
                        }

                        v8 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                        if(v8 > v7_1) {
                        }
                        else {
                            v8 = v7_1;
                        }

                        while(v8 < 0) {
                            v7_1 = v1.ax[v1.al * (v2 >> 12) + (v5 >> 12)];
                            if(v7_1 != 0) {
                                v0.ax[v6] = v7_1;
                                ++v6;
                            }
                            else {
                                ++v6;
                            }

                            v5 += v12;
                            ++v8;
                        }
                    }

                    ++v9;
                    v2 += v12;
                    v10 += v0.al * -107049639;
                }
            }

            if(v14 < 0) {
                while(true) {
                    if(v9 < 0) {
                        v5 = (v4 * v12 >> 4) + v3;
                        v6 = (v14 * v4 >> 4) + v2;
                        if(v5 < 0) {
                            v7_1 = (v12 - 1 - v5) / v12;
                            v8 = v22 + v7_1;
                            v5 += v7_1 * v12;
                            v6 += v14 * v7_1;
                            v7_1 += v10;
                        }
                        else {
                            v7_1 = v10;
                            v8 = v22;
                        }

                        v11_1 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                        if(v11_1 > v8) {
                            v8 = v11_1;
                        }

                        v11_1 = v6 - (v1.ae << 12);
                        if(v11_1 >= 0) {
                            v11_1 = (v14 - v11_1) / v14;
                            v8 += v11_1;
                            v5 += v12 * v11_1;
                            v6 += v11_1 * v14;
                            v7_1 += v11_1;
                        }

                        v11_1 = (v6 - v14) / v14;
                        if(v11_1 > v8) {
                            v8 = v11_1;
                        }

                        while(v8 < 0) {
                            v11_1 = v1.ax[(v6 >> 12) * v1.al + (v5 >> 12)];
                            if(v11_1 != 0) {
                                v0.ax[v7_1] = v11_1;
                                ++v7_1;
                            }
                            else {
                                ++v7_1;
                            }

                            v5 += v12;
                            v6 += v14;
                            ++v8;
                        }

                        ++v9;
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

            while(v9 < 0) {
                v5 = (v4 * v12 >> 4) + v3;
                v6 = (v4 * v14 >> 4) + v2;
                if(v5 < 0) {
                    v7_1 = (v12 - 1 - v5) / v12;
                    v8 = v22 + v7_1;
                    v5 += v7_1 * v12;
                    v6 += v14 * v7_1;
                    v7_1 += v10;
                }
                else {
                    v7_1 = v10;
                    v8 = v22;
                }

                v11_1 = (v5 + 1 - (v1.al << 12) - v12) / v12;
                if(v11_1 > v8) {
                    v8 = v11_1;
                }

                if(v6 < 0) {
                    v11_1 = (v14 - 1 - v6) / v14;
                    v8 += v11_1;
                    v5 += v11_1 * v12;
                    v6 += v11_1 * v14;
                    v7_1 += v11_1;
                }

                v11_1 = (v6 + 1 - (v1.ae << 12) - v14) / v14;
                if(v11_1 > v8) {
                    v8 = v11_1;
                }

                while(v8 < 0) {
                    int v23 = v4;
                    v4 = v1.ax[(v5 >> 12) + (v6 >> 12) * v1.al];
                    if(v4 != 0) {
                        v0.ax[v7_1] = v4;
                        ++v7_1;
                    }
                    else {
                        ++v7_1;
                    }

                    v5 += v12;
                    v6 += v14;
                    ++v8;
                    v4 = v23;
                }

                ++v9;
                v3 -= v14;
                v2 += v12;
                v10 += v0.al * -107049639;
                v4 = v4;
            }
        }
    }

    public void ec(es arg29, int arg30, int arg31, int arg32, int arg33) {
        int v27;
        int v26;
        int v21;
        ep v0 = this;
        es v1 = arg29;
        int v4 = arg32;
        int v5 = arg33;
        if(v4 <= v1.ap && v5 <= v1.aj) {
            int v6 = arg30 + v1.ar * v4 / v1.ap;
            int v7 = (v1.ap + (v1.al + v1.ar) * v4 - 1) / v1.ap + arg30;
            int v8 = v1.an * v5 / v1.aj + arg31;
            int v9 = (v1.aj + (v1.ae + v1.an) * v5 - 1) / v1.aj + arg31;
            if(v6 < v0.ap * 1206597354) {
                v6 = 0xE4D30573 * v0.ap;
            }

            if(v7 > v0.aj * 0x56AC17CD) {
                v7 = 0x56077CC7 * v0.aj;
            }

            int v11 = 2002832733;
            if(v8 < v0.ar * v11) {
                v8 = v0.ar * v11;
            }

            if(v9 > v0.an * 0xD21DC9D7) {
                v9 = 1234510869 * v0.an;
            }

            if(v6 < v7) {
                if(v8 >= v9) {
                }
                else {
                    v11 = v0.al * 0x26EB1E0B * v8 + v6;
                    int v10 = v0.al * -107049639 - (v7 - v6);
                    if(v11 >= v0.ax.length) {
                        return;
                    }

                    while(v8 < v9) {
                        int v12 = v11;
                        v11 = v6;
                        while(v11 < v7) {
                            int v13 = v11 - arg30 << 4;
                            int v14 = v8 - arg31 << 4;
                            int v15 = v1.ap * v13 / v4 - (v1.ar << 4);
                            int v2 = v1.ap * (v13 + 16) / v4 - (v1.ar << 4);
                            v13 = v1.aj * v14 / v5 - (v1.an << 4);
                            v14 = (v14 + 16) * v1.aj / v5 - (v1.an << 4);
                            int v3 = (v2 - v15) * (v14 - v13) >> 1;
                            if(v3 == 0) {
                                v21 = v6;
                                v26 = v7;
                                v27 = v9;
                            }
                            else {
                                int v17 = 0;
                                if(v15 < 0) {
                                    v15 = 0;
                                }

                                if(v2 >= v1.al << 4) {
                                    v2 = v1.al << 4;
                                }

                                if(v13 < 0) {
                                    v13 = 0;
                                }

                                if(v14 >= v1.ae << 4) {
                                    v14 = v1.ae << 4;
                                }

                                --v2;
                                --v14;
                                v4 = 16 - (v15 & 15);
                                int v18 = (v2 & 15) + 1;
                                int v19 = 16 - (v13 & 15);
                                int v20 = (v14 & 15) + 1;
                                v15 >>= 4;
                                v2 >>= 4;
                                v13 >>= 4;
                                v14 >>= 4;
                                v21 = v6;
                                v5 = v13;
                                v6 = 0;
                                int v22 = 0;
                                int v23 = 0;
                                while(v5 <= v14) {
                                    int v24 = v13 == v5 ? v19 : 16;
                                    if(v14 == v5) {
                                        v24 = v20;
                                    }

                                    int v25 = v6;
                                    v6 = v15;
                                    while(v6 <= v2) {
                                        v26 = v7;
                                        v27 = v9;
                                        v7 = v1.ax[v1.al * v5 + v6];
                                        if(v7 != 0) {
                                            if(v6 == v15) {
                                                v9 = v24 * v4;
                                            }
                                            else if(v2 == v6) {
                                                v9 = v24 * v18;
                                            }
                                            else {
                                                v9 = v24 << 4;
                                            }

                                            v25 += v9;
                                            v22 += (v7 >> 16 & 0xFF) * v9;
                                            v17 += (v7 >> 8 & 0xFF) * v9;
                                            v23 += v9 * (-138703720 & v7);
                                        }

                                        ++v6;
                                        v7 = v26;
                                        v9 = v27;
                                        v1 = arg29;
                                    }

                                    ++v5;
                                    v6 = v25;
                                    v1 = arg29;
                                }

                                v26 = v7;
                                v27 = v9;
                                if(v6 >= v3) {
                                    v0.ax[v12] = 0xFF000000 | (v17 / v6 << 8) + (v22 / v6 << 16) + v23 / v6;
                                }

                                ++v12;
                            }

                            ++v11;
                            v6 = v21;
                            v7 = v26;
                            v9 = v27;
                            v1 = arg29;
                            v4 = arg32;
                            v5 = arg33;
                        }

                        v11 = v12 + v10;
                        ++v8;
                        v1 = arg29;
                        v4 = arg32;
                        v5 = arg33;
                    }

                    return;
                }
            }

            return;
        }

        throw new IllegalArgumentException();
    }

    public void ed(es arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int[] arg28, int[] arg29) {
        ep v0 = this;
        es v1 = arg19;
        int v2 = arg23;
        int v4 = -arg22;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg26)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = arg27 * v8 >> 8;
            int v3 = v6_1 * arg27 >> 8;
            v6_1 = (arg24 << 16) + (v4 * v3 + v7 * v5);
            v8 = (arg25 << 16) + (v5 * v3 - v4 * v7);
            v4 = v0.al * -107049639 * arg21 + arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg28[v9];
                int v13 = arg28[v9] * v3 + v6_1;
                int v11 = v8 - arg28[v9] * v7;
                int v14 = -arg29[v9];
                while(v14 < 0) {
                    v0.ax[v12] = v1.ax[(v13 >> 16) + (v11 >> 16) * v1.al];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v0.al * -107049639;
                ++v9;
                v2 = arg23;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    public void ee(es arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int[] arg28, int[] arg29) {
        ep v0 = this;
        es v1 = arg19;
        int v2 = arg23;
        int v4 = -arg22;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg26)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = arg27 * v8 >> 8;
            int v3 = v6_1 * arg27 >> 8;
            v6_1 = (arg24 << 16) + (v4 * v3 + v7 * v5);
            v8 = (arg25 << 16) + (v5 * v3 - v4 * v7);
            v5 = v0.al * -1162470885 * arg21 + arg20;
            v4 = 0;
            while(true) {
                if(v4 >= v2) {
                    return;
                }

                int v11 = v5 + arg28[v4];
                int v12 = arg28[v4] * v3 + v6_1;
                int v10 = v8 - arg28[v4] * v7;
                int v13 = -arg29[v4];
                while(v13 < 0) {
                    v0.ax[v11] = v1.ax[(v12 >> 16) + (v10 >> 16) * v1.al];
                    v12 += v3;
                    v10 -= v7;
                    ++v13;
                    ++v11;
                }

                v6_1 += v7;
                v8 += v3;
                v5 += v0.al * 0x972D0FA5;
                ++v4;
                v2 = arg23;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    public void eg(es arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int[] arg28, int[] arg29) {
        ep v0 = this;
        es v1 = arg19;
        int v2 = arg23;
        int v4 = -arg22;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg26)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = arg27 * v8 >> 8;
            int v3 = v6_1 * arg27 >> 8;
            v6_1 = (arg24 << 16) + (v4 * v3 + v7 * v5);
            v8 = (arg25 << 16) + (v5 * v3 - v4 * v7);
            v4 = v0.al * -107049639 * arg21 + arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg28[v9];
                int v13 = arg28[v9] * v3 + v6_1;
                int v11 = v8 - arg28[v9] * v7;
                int v14 = -arg29[v9];
                while(v14 < 0) {
                    v0.ax[v12] = v1.ax[(v13 >> 16) + (v11 >> 16) * v1.al];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v0.al * -107049639;
                ++v9;
                v2 = arg23;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    void eh(es arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v22;
        int v24;
        ep v0 = this;
        es v1 = arg26;
        int v4 = arg32;
        if(v4 == 0) {
            return;
        }

        int v5 = arg27 - (v1.ar << 4);
        int v6 = arg28 - (v1.an << 4);
        double v7 = (((double)(arg31 & 0xC81B450B))) * 0.000096;
        double v11 = ((double)v4);
        v4 = ((int)Math.floor(Math.sin(v7) * v11 + 0.5));
        int v9 = ((int)Math.floor(Math.cos(v7) * v11 + 0.5));
        int v10 = -v6;
        int v15 = v4 * v10;
        int v13 = -v5;
        int v14 = v13 * v9;
        double v18 = v7;
        int v7_1 = v15 + v14;
        v10 *= v9;
        int v8 = -v13 * v4;
        v13 = v10 + v8;
        double v20 = v11;
        int v11_1 = ((v1.al << 4) - v5) * v9 + v15;
        v10 += -((v1.al << 4) - v5) * v4;
        v14 += ((v1.ae << 4) - v6) * v4;
        int v12 = ((v1.ae << 4) - v6) * v9 + v8;
        v8 = ((v1.al << 4) - v5) * v9 + ((v1.ae << 4) - v6) * v4;
        v4 = v4 * -((v1.al << 4) - v5) + ((v1.ae << 4) - v6) * v9;
        if(v7_1 < v11_1) {
            v24 = v11_1;
            v11_1 = v7_1;
            v7_1 = v24;
        }

        if(v14 < v11_1) {
            v11_1 = v14;
        }

        if(v8 < v11_1) {
            v11_1 = v8;
        }

        if(v14 > v7_1) {
        }
        else {
            v14 = v7_1;
        }

        if(v8 > v14) {
        }
        else {
            v8 = v14;
        }

        if(v13 < v10) {
            v24 = v13;
            v13 = v10;
            v10 = v24;
        }

        if(v12 < v10) {
            v10 = v12;
        }

        if(v4 < v10) {
            v10 = v4;
        }

        if(v12 > v13) {
        }
        else {
            v12 = v13;
        }

        if(v4 > v12) {
            v12 = v4;
        }

        v4 = (v11_1 >> 12) + arg29 >> 4;
        v7_1 = (v8 + 0xFFF >> 12) + arg29 + 15 >> 4;
        v8 = (v10 >> 12) + arg30 >> 4;
        v9 = (v12 + 0xFFF >> 12) + arg30 + 15 >> 4;
        v11_1 = 0xE4D30573;
        if(v4 < v0.ap * v11_1) {
            v4 = v0.ap * v11_1;
        }

        if(v7_1 > v0.aj * 0x56AC17CD) {
            v7_1 = v0.aj * -1751204371;
        }

        if(v8 < v0.ar * 0x3661F417) {
            v8 = v0.ar * 0x70BFB77D;
        }

        if(v9 > v0.an * 0xE5FE3AD5) {
            v9 = 0xD0007A2A * v0.an;
        }

        v7_1 = v4 - v7_1;
        if(v7_1 >= 0) {
            return;
        }

        v9 = v8 - v9;
        if(v9 >= 0) {
            return;
        }

        v10 = v0.al * 0xC8B98DC0 * v8 + v4;
        v11 = 16777216 / v20;
        v13 = ((int)Math.floor(Math.sin(v18) * v11 + 0.5));
        v11_1 = ((int)Math.floor(Math.cos(v18) * v11 + 0.5));
        v4 = (v4 << 4) + 8 - arg29;
        int v2 = (v8 << 4) + 8 - arg30;
        int v3 = (v5 << 8) - (v2 * v13 >> 4);
        v2 = (v2 * v11_1 >> 4) + (v6 << 8);
        v5 = -107049639;
        if(v11_1 == 0) {
            if(v13 == 0) {
                while(true) {
                    if(v9 >= 0) {
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
                        v4 = v7_1;
                        v6 = v10;
                        while(v4 < 0) {
                            v8 = v1.ax[(v3 >> 12) + (v2 >> 12) * v1.al];
                            if(v8 != 0) {
                                v0.ax[v6] = v8;
                                ++v6;
                            }
                            else {
                                ++v6;
                            }

                            ++v4;
                        }
                    }

                    ++v9;
                    v10 += v0.al * v5;
                }
            }

            if(v13 < 0) {
                while(true) {
                    if(v9 < 0) {
                        v5 = (v4 * v13 >> 4) + v2;
                        if(v3 < 0) {
                        }
                        else if(v3 - (v1.al << 12) >= 0) {
                        }
                        else {
                            v6 = v5 - (v1.ae << 12);
                            if(v6 >= 0) {
                                v6 = (v13 - v6) / v13;
                                v8 = v7_1 + v6;
                                v5 += v6 * v13;
                                v6 += v10;
                            }
                            else {
                                v8 = v7_1;
                                v6 = v10;
                            }

                            v11_1 = (v5 - v13) / v13;
                            if(v11_1 > v8) {
                                v8 = v11_1;
                            }

                            while(v8 < 0) {
                                v11_1 = v1.ax[(v5 >> 12) * v1.al + (v3 >> 12)];
                                if(v11_1 != 0) {
                                    v0.ax[v6] = v11_1;
                                    ++v6;
                                }
                                else {
                                    ++v6;
                                }

                                v5 += v13;
                                ++v8;
                            }
                        }

                        ++v9;
                        v3 -= v13;
                        v10 += v0.al * 0x5B673DB2;
                        continue;
                    }
                    else {
                        return;
                    }
                }
            }

            while(v9 < 0) {
                v5 = (v13 * v4 >> 4) + v2;
                if(v3 < 0) {
                }
                else if(v3 - (v1.al << 12) >= 0) {
                }
                else {
                    if(v5 < 0) {
                        v6 = (v13 - 1 - v5) / v13;
                        v8 = v7_1 + v6;
                        v5 += v13 * v6;
                        v6 += v10;
                    }
                    else {
                        v8 = v7_1;
                        v6 = v10;
                    }

                    v11_1 = (v5 + 1 - (v1.ae << 12) - v13) / v13;
                    if(v11_1 > v8) {
                        v8 = v11_1;
                    }

                    while(v8 < 0) {
                        v11_1 = v1.ax[(v3 >> 12) + (v5 >> 12) * v1.al];
                        if(v11_1 != 0) {
                            v0.ax[v6] = v11_1;
                            ++v6;
                        }
                        else {
                            ++v6;
                        }

                        v5 += v13;
                        ++v8;
                    }
                }

                ++v9;
                v3 -= v13;
                v10 += v0.al * 0x7F1860EE;
            }
        }
        else {
            if(v11_1 < 0) {
                if(v13 == 0) {
                    while(true) {
                        if(v9 >= 0) {
                            return;
                        }

                        v6 = (v11_1 * v4 >> 4) + v3;
                        if(v2 < 0) {
                        }
                        else if(v2 - (v1.ae << 12) >= 0) {
                        }
                        else {
                            v8 = v6 - (v1.al << 12);
                            if(v8 >= 0) {
                                v8 = (v11_1 - v8) / v11_1;
                                v12 = v7_1 + v8;
                                v6 += v11_1 * v8;
                                v8 += v10;
                            }
                            else {
                                v12 = v7_1;
                                v8 = v10;
                            }

                            v13 = (v6 - v11_1) / v11_1;
                            if(v13 > v12) {
                                v12 = v13;
                            }

                            while(v12 < 0) {
                                v13 = v1.ax[(v2 >> 12) * v1.al + (v6 >> 12)];
                                if(v13 != 0) {
                                    v0.ax[v8] = v13;
                                    ++v8;
                                }
                                else {
                                    ++v8;
                                }

                                v6 += v11_1;
                                ++v12;
                            }
                        }

                        ++v9;
                        v2 += v11_1;
                        v10 += v0.al * v5;
                    }
                }

                if(v13 < 0) {
                    while(true) {
                        if(v9 >= 0) {
                            return;
                        }

                        v5 = (v11_1 * v4 >> 4) + v3;
                        v6 = (v13 * v4 >> 4) + v2;
                        v8 = v5 - (v1.al << 12);
                        if(v8 >= 0) {
                            v8 = (v11_1 - v8) / v11_1;
                            v12 = v7_1 + v8;
                            v5 += v8 * v11_1;
                            v6 += v8 * v13;
                            v8 += v10;
                        }
                        else {
                            v12 = v7_1;
                            v8 = v10;
                        }

                        v14 = (v5 - v11_1) / v11_1;
                        if(v14 > v12) {
                            v12 = v14;
                        }

                        v14 = v6 - (v1.ae << 12);
                        if(v14 >= 0) {
                            v14 = (v13 - v14) / v13;
                            v12 += v14;
                            v5 += v11_1 * v14;
                            v6 += v14 * v13;
                            v8 += v14;
                        }

                        v14 = (v6 - v13) / v13;
                        if(v14 > v12) {
                            v12 = v14;
                        }

                        while(v12 < 0) {
                            v22 = v7_1;
                            v7_1 = v1.ax[(v5 >> 12) + v1.al * (v6 >> 12)];
                            if(v7_1 != 0) {
                                v0.ax[v8] = v7_1;
                                ++v8;
                            }
                            else {
                                ++v8;
                            }

                            v5 += v11_1;
                            v6 += v13;
                            ++v12;
                            v7_1 = v22;
                        }

                        ++v9;
                        v3 -= v13;
                        v2 += v11_1;
                        v10 += v0.al * 0xE5FF4101;
                    }
                }

                v22 = v7_1;
                while(true) {
                    if(v9 >= 0) {
                        return;
                    }

                    v5 = (v4 * v11_1 >> 4) + v3;
                    v6 = (v4 * v13 >> 4) + v2;
                    v7_1 = v5 - (v1.al << 12);
                    if(v7_1 >= 0) {
                        v7_1 = (v11_1 - v7_1) / v11_1;
                        v8 = v22 + v7_1;
                        v5 += v7_1 * v11_1;
                        v6 += v13 * v7_1;
                        v7_1 += v10;
                    }
                    else {
                        v7_1 = v10;
                        v8 = v22;
                    }

                    v12 = (v5 - v11_1) / v11_1;
                    if(v12 > v8) {
                        v8 = v12;
                    }

                    if(v6 < 0) {
                        v12 = (v13 - 1 - v6) / v13;
                        v8 += v12;
                        v5 += v12 * v11_1;
                        v6 += v13 * v12;
                        v7_1 += v12;
                    }

                    v12 = (v6 + 1 - (v1.ae << 12) - v13) / v13;
                    if(v12 > v8) {
                        v8 = v12;
                    }

                    while(v8 < 0) {
                        v12 = v1.ax[v1.al * (v6 >> 12) + (v5 >> 12)];
                        if(v12 != 0) {
                            v0.ax[v7_1] = v12;
                            ++v7_1;
                        }
                        else {
                            ++v7_1;
                        }

                        v5 += v11_1;
                        v6 += v13;
                        ++v8;
                    }

                    ++v9;
                    v3 -= v13;
                    v2 += v11_1;
                    v10 += v0.al * 10367922;
                }
            }

            v22 = v7_1;
            if(v13 == 0) {
                while(true) {
                    if(v9 >= 0) {
                        return;
                    }

                    v6 = (v4 * v11_1 >> 4) + v3;
                    if(v2 < 0) {
                    }
                    else if(v2 - (v1.ae << 12) >= 0) {
                    }
                    else {
                        if(v6 < 0) {
                            v7_1 = (v11_1 - 1 - v6) / v11_1;
                            v8 = v22 + v7_1;
                            v6 += v11_1 * v7_1;
                            v7_1 += v10;
                        }
                        else {
                            v7_1 = v10;
                            v8 = v22;
                        }

                        v12 = (v6 + 1 - (v1.al << 12) - v11_1) / v11_1;
                        if(v12 > v8) {
                            v8 = v12;
                        }

                        while(v8 < 0) {
                            v12 = v1.ax[v1.al * (v2 >> 12) + (v6 >> 12)];
                            if(v12 != 0) {
                                v0.ax[v7_1] = v12;
                                ++v7_1;
                            }
                            else {
                                ++v7_1;
                            }

                            v6 += v11_1;
                            ++v8;
                        }
                    }

                    ++v9;
                    v2 += v11_1;
                    v10 += v0.al * v5;
                }
            }

            if(v13 < 0) {
                while(true) {
                    if(v9 < 0) {
                        v6 = (v4 * v11_1 >> 4) + v3;
                        v7_1 = (v13 * v4 >> 4) + v2;
                        if(v6 < 0) {
                            v8 = (v11_1 - 1 - v6) / v11_1;
                            v12 = v22 + v8;
                            v6 += v8 * v11_1;
                            v7_1 += v13 * v8;
                            v8 += v10;
                        }
                        else {
                            v8 = v10;
                            v12 = v22;
                        }

                        v14 = (v6 + 1 - (v1.al << 12) - v11_1) / v11_1;
                        if(v14 > v12) {
                            v12 = v14;
                        }

                        v14 = v7_1 - (v1.ae << 12);
                        if(v14 >= 0) {
                            v14 = (v13 - v14) / v13;
                            v12 += v14;
                            v6 += v11_1 * v14;
                            v7_1 += v14 * v13;
                            v8 += v14;
                        }

                        v14 = (v7_1 - v13) / v13;
                        if(v14 > v12) {
                            v12 = v14;
                        }

                        while(v12 < 0) {
                            v5 = v1.ax[(v7_1 >> 12) * v1.al + (v6 >> 12)];
                            if(v5 != 0) {
                                v0.ax[v8] = v5;
                                ++v8;
                            }
                            else {
                                ++v8;
                            }

                            v6 += v11_1;
                            v7_1 += v13;
                            ++v12;
                        }

                        ++v9;
                        v3 -= v13;
                        v2 += v11_1;
                        v10 += v0.al * -107049639;
                        continue;
                    }
                    else {
                        return;
                    }
                }
            }

            while(v9 < 0) {
                v5 = (v4 * v11_1 >> 4) + v3;
                v6 = (v4 * v13 >> 4) + v2;
                if(v5 < 0) {
                    v7_1 = (v11_1 - 1 - v5) / v11_1;
                    v8 = v22 + v7_1;
                    v5 += v7_1 * v11_1;
                    v6 += v13 * v7_1;
                    v7_1 += v10;
                }
                else {
                    v7_1 = v10;
                    v8 = v22;
                }

                v12 = (v5 + 1 - (v1.al << 12) - v11_1) / v11_1;
                if(v12 > v8) {
                    v8 = v12;
                }

                if(v6 < 0) {
                    v12 = (v13 - 1 - v6) / v13;
                    v8 += v12;
                    v5 += v12 * v11_1;
                    v6 += v12 * v13;
                    v7_1 += v12;
                }

                v12 = (v6 + 1 - (v1.ae << 12) - v13) / v13;
                if(v12 > v8) {
                    v8 = v12;
                }

                while(v8 < 0) {
                    int v23 = v4;
                    v4 = v1.ax[(v5 >> 12) + (v6 >> 12) * v1.al];
                    if(v4 != 0) {
                        v0.ax[v7_1] = v4;
                        ++v7_1;
                    }
                    else {
                        ++v7_1;
                    }

                    v5 += v11_1;
                    v6 += v13;
                    ++v8;
                    v4 = v23;
                }

                ++v9;
                v3 -= v13;
                v2 += v11_1;
                v10 += v0.al * -107049639;
                v4 = v4;
            }
        }
    }

    public void ei(es arg30, int arg31, int arg32, int arg33, int arg34) {
        int v27;
        int v26;
        int v21;
        ep v0 = this;
        es v1 = arg30;
        int v4 = arg33;
        int v5 = arg34;
        if(v4 <= v1.ap && v5 <= v1.aj) {
            int v6 = arg31 + v1.ar * v4 / v1.ap;
            int v7 = (v1.ap + (v1.al + v1.ar) * v4 - 1) / v1.ap + arg31;
            int v8 = v1.an * v5 / v1.aj + arg32;
            int v9 = (v1.aj + (v1.ae + v1.an) * v5 - 1) / v1.aj + arg32;
            int v11 = 0xE4D30573;
            if(v6 < v0.ap * v11) {
                v6 = v0.ap * v11;
            }

            if(v7 > v0.aj * 0x56AC17CD) {
                v7 = -1311455034 * v0.aj;
            }

            if(v8 < v0.ar * 0x3AEBCF7A) {
                v8 = 2002832733 * v0.ar;
            }

            v11 = 0xD21DC9D7;
            if(v9 > v0.an * v11) {
                v9 = v0.an * v11;
            }

            if(v6 < v7) {
                if(v8 >= v9) {
                }
                else {
                    int v10 = v0.al * -107049639 * v8 + v6;
                    int v12 = v0.al * -107049639 - (v7 - v6);
                    if(v10 >= v0.ax.length) {
                        return;
                    }

                    while(v8 < v9) {
                        v11 = v10;
                        v10 = v6;
                        while(v10 < v7) {
                            int v13 = v10 - arg31 << 4;
                            int v14 = v8 - arg32 << 4;
                            int v15 = v1.ap * v13 / v4 - (v1.ar << 4);
                            int v2 = v1.ap * (v13 + 16) / v4 - (v1.ar << 4);
                            v13 = v1.aj * v14 / v5 - (v1.an << 4);
                            v14 = (v14 + 16) * v1.aj / v5 - (v1.an << 4);
                            int v3 = (v2 - v15) * (v14 - v13) >> 1;
                            if(v3 == 0) {
                                v21 = v6;
                                v26 = v7;
                                v27 = v9;
                            }
                            else {
                                int v17 = 0;
                                if(v15 < 0) {
                                    v15 = 0;
                                }

                                if(v2 >= v1.al << 4) {
                                    v2 = v1.al << 4;
                                }

                                if(v13 < 0) {
                                    v13 = 0;
                                }

                                if(v14 >= v1.ae << 4) {
                                    v14 = v1.ae << 4;
                                }

                                --v2;
                                --v14;
                                v4 = 16 - (v15 & 15);
                                int v18 = (v2 & 15) + 1;
                                int v19 = 16 - (v13 & 15);
                                int v20 = (v14 & 15) + 1;
                                v15 >>= 4;
                                v2 >>= 4;
                                v13 >>= 4;
                                v14 >>= 4;
                                v21 = v6;
                                v5 = v13;
                                v6 = 0;
                                int v22 = 0;
                                int v23 = 0;
                                while(v5 <= v14) {
                                    int v24 = v13 == v5 ? v19 : 16;
                                    if(v14 == v5) {
                                        v24 = v20;
                                    }

                                    int v25 = v6;
                                    v6 = v15;
                                    while(v6 <= v2) {
                                        v26 = v7;
                                        v27 = v9;
                                        v7 = v1.ax[v1.al * v5 + v6];
                                        if(v7 != 0) {
                                            if(v6 == v15) {
                                                v9 = v24 * v4;
                                            }
                                            else if(v2 == v6) {
                                                v9 = v24 * v18;
                                            }
                                            else {
                                                v9 = v24 << 4;
                                            }

                                            v25 += v9;
                                            v22 += (v7 >> 16 & 0xFF) * v9;
                                            v17 += (v7 >> 8 & 0x4D6273B6) * v9;
                                            v23 += v9 * (v7 & 0xFF);
                                        }

                                        ++v6;
                                        v7 = v26;
                                        v9 = v27;
                                        v1 = arg30;
                                    }

                                    ++v5;
                                    v6 = v25;
                                    v1 = arg30;
                                }

                                v26 = v7;
                                v27 = v9;
                                if(v6 >= v3) {
                                    v0.ax[v11] = 0xFF000000 | (v17 / v6 << 8) + (v22 / v6 << 16) + v23 / v6;
                                }

                                ++v11;
                            }

                            ++v10;
                            v6 = v21;
                            v7 = v26;
                            v9 = v27;
                            v1 = arg30;
                            v4 = arg33;
                            v5 = arg34;
                        }

                        v10 = v11 + v12;
                        ++v8;
                        v6 = v6;
                        v7 = v7;
                        v9 = v9;
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

    public void ej(es arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        int v15;
        int v14;
        int v9;
        int v7;
        ep v0 = this;
        es v1 = arg19;
        if(arg24 <= 0) {
            return;
        }

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
                    v14 = ((v1.an << 16) + v11 - 1) / v11;
                    v15 = arg21 + v14;
                    v8 = v14 * v11 - (v1.an << 16);
                }
                else {
                    v15 = arg21;
                }

                int v2 = v12 < v5 ? ((v12 << 16) - v7 + v10 - 1) / v10 : arg22;
                int v3 = v4 < v6 ? ((v4 << 16) - v8 + v11 - 1) / v11 : arg23;
                v4 = v0.al * -107049639 * v15 + v9;
                v6 = v0.al * -107049639 - v2;
                v14 = v3 + v15;
                int v16 = 0xD21DC9D7;
                if(v14 > v0.an * v16) {
                    v3 -= v14 - v0.an * v16;
                }

                v14 = 2002832733;
                if(v15 < v0.ar * v14) {
                    v5 = v0.ar * v14 - v15;
                    v3 -= v5;
                    v4 += v0.al * -107049639 * v5;
                    v8 += v5 * v11;
                }

                v14 = v3;
                v5 = v8;
                v3 = v2 + v9;
                v15 = 0x56AC17CD;
                if(v3 > v0.aj * v15) {
                    v3 -= v0.aj * v15;
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

                hu.cm(v0.ax, v1.ax, 0, v7, v5, v4, v6, v2, v14, v10, v11, v12, arg24, -6);
                return;
            }
        }
    }

    public void ek(es arg15, int arg16, int arg17, int arg18) {
        int v12;
        int v9;
        ep v0 = this;
        es v1 = arg15;
        if(arg18 == 0) {
            return;
        }

        int v2 = arg16 + v1.ar;
        int v3 = arg17 + v1.an;
        int v5 = -107049639;
        int v4 = v0.al * v5 * v3 + v2;
        int v6 = v1.ae;
        int v7 = v1.al;
        int v8 = v0.al * v5 - v7;
        int v11 = 0;
        if(v3 < v0.ar * 2002832733) {
            v9 = v0.ar * 0xE117D00B - v3;
            v6 -= v9;
            v3 = 0xB24BF62F * v0.ar;
            v12 = v7 * v9;
            v4 += v9 * (v0.al * v5);
        }
        else {
            v12 = 0;
        }

        v3 += v6;
        if(v3 > v0.an * 0x28708343) {
            v6 -= v3 - v0.an * 0xD21DC9D7;
        }

        v9 = v6;
        if(v2 < v0.ap * 2000026192) {
            v3 = v0.ap * 2062780102 - v2;
            v7 -= v3;
            v2 = 0xE4D30573 * v0.ap;
            v12 += v3;
            v4 += v3;
            v11 = v3;
            v8 += v3;
        }

        v5 = v4;
        v4 = v12;
        v2 += v7;
        if(v2 > v0.aj * 0x56AC17CD) {
            v2 -= v0.aj * -2046532470;
            v7 -= v2;
            v11 += v2;
            v8 += v2;
        }

        v6 = v7;
        if(v6 > 0) {
            if(v9 <= 0) {
            }
            else {
                ii.bw(v0.ax, v1.ax, 0, v4, v5, v6, v9, v8, v11, arg18, 2085062062);
                return;
            }
        }
    }

    public void em(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        int v15;
        int v14;
        int v9;
        int v7;
        ep v0 = this;
        es v1 = arg18;
        if(arg23 <= 0) {
            return;
        }

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
                    v14 = ((v1.an << 16) + v11 - 1) / v11;
                    v15 = arg20 + v14;
                    v8 = v14 * v11 - (v1.an << 16);
                }
                else {
                    v15 = arg20;
                }

                int v2 = v12 < v5 ? ((v12 << 16) - v7 + v10 - 1) / v10 : arg21;
                int v3 = v4 < v6 ? ((v4 << 16) - v8 + v11 - 1) / v11 : arg22;
                v4 = v0.al * -107049639 * v15 + v9;
                v6 = v0.al * -107049639 - v2;
                v5 = v3 + v15;
                if(v5 > v0.an * -1542703202) {
                    v3 -= v5 - v0.an * 0xD21DC9D7;
                }

                if(v15 < v0.ar * 1461601466) {
                    v5 = v0.ar * 2002832733 - v15;
                    v3 -= v5;
                    v4 += v0.al * 0xAA99BE0A * v5;
                    v8 += v5 * v11;
                }

                int v13 = v3;
                v5 = v8;
                v3 = v2 + v9;
                v14 = 0x56AC17CD;
                if(v3 > v0.aj * v14) {
                    v3 -= v0.aj * v14;
                    v2 -= v3;
                    v6 += v3;
                }

                if(v9 < v0.ap * -2001118480) {
                    v8 = v0.ap * 0xA44D7AB0 - v9;
                    v2 -= v8;
                    v4 += v8;
                    v7 += v8 * v10;
                    v6 += v8;
                }

                hu.cm(v0.ax, v1.ax, 0, v7, v5, v4, v6, v2, v13, v10, v11, v12, arg23, -70);
                return;
            }
        }
    }

    static void en(int[] arg18, int[] arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30) {
        int v1 = arg30;
        if(v1 >= 0xFF) {
            cc.ao(arg18, arg19, 0, arg21, arg22, arg23, arg24, arg25, arg26, arg27, arg28, arg29, 1801983388);
            return;
        }

        int v2 = 0xDE6FEDD6 - v1;
        int v3 = v1 << 24;
        int v4 = -arg26;
        int v5 = arg22;
        int v6 = arg23;
        while(v4 < 0) {
            int v7 = (v5 >> 16) * arg29;
            int v10 = -arg25;
            int v11 = arg21;
            while(v10 < 0) {
                int v12 = arg19[(v11 >> 16) + v7];
                if(v12 != 0) {
                    int v13 = arg18[v6];
                    if(v13 == 0) {
                        v13 = v6 + 1;
                        arg18[v6] = v12 & 0xE5BC09A4 | v3;
                    }
                    else {
                        arg18[v6] = ((v13 & 0xFF00) * v2 + (v12 & 0xFF00) * v1 & 0x3E86F1F6) + ((v12 & 0x59921B2F) * v1 + (v13 & 463557604) * v2 & 0x5A690920) >>> 8 | (v13 | v3) & 0xFCE0812B;
                        v13 = v6 + 1;
                    }

                    v6 = v13;
                }
                else {
                    ++v6;
                }

                v11 += arg27;
                ++v10;
            }

            v5 += arg28;
            v6 += arg24;
            ++v4;
        }
    }

    static void eq(int[] arg18, int[] arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30) {
        int v1 = arg30;
        int v2 = 0xFF;
        if(v1 >= v2) {
            cc.ao(arg18, arg19, 0, arg21, arg22, arg23, arg24, arg25, arg26, arg27, arg28, arg29, 0xB4244F8B);
            return;
        }

        v2 -= v1;
        int v3 = v1 << 24;
        int v4 = -arg26;
        int v5 = arg22;
        int v6;
        for(v6 = arg23; v4 < 0; v6 = v11 + arg24) {
            int v7 = (v5 >> 16) * arg29;
            int v10 = -arg25;
            int v11 = v6;
            v6 = arg21;
            while(v10 < 0) {
                int v12 = arg19[(v6 >> 16) + v7];
                if(v12 != 0) {
                    int v13 = arg18[v11];
                    if(v13 == 0) {
                        v13 = v11 + 1;
                        arg18[v11] = v12 & 0xFFFFFF | v3;
                    }
                    else {
                        arg18[v11] = ((v13 & 0xFF00) * v2 + (v12 & 0xFF00) * v1 & 0xFF0000) + ((v12 & 0xFF00FF) * v1 + (v13 & 0xFF00FF) * v2 & 0xFF00FF00) >>> 8 | (v13 | v3) & 0xFF000000;
                        v13 = v11 + 1;
                    }

                    v11 = v13;
                }
                else {
                    ++v11;
                }

                v6 += arg27;
                ++v10;
            }

            v5 += arg28;
            ++v4;
        }
    }

    static void er(int[] arg17, int[] arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26) {
        int v1 = arg26;
        int v2 = 0xFF;
        if(v1 >= v2) {
            az.ah(arg17, arg18, 0, arg20, arg21, arg22, arg23, arg24, arg25, -11773);
            return;
        }

        int v3 = v1 << 24;
        int v4 = -arg23;
        int v5 = arg20;
        int v6 = arg21;
        while(v4 < 0) {
            int v8 = -arg22;
            while(v8 < 0) {
                int v9 = v5 + 1;
                v5 = arg18[v5];
                if(v5 != 0) {
                    int v10 = arg17[v6];
                    if(v10 == 0) {
                        v10 = v6 + 1;
                        arg17[v6] = v5 & 0xFFFFFF | v3;
                    }
                    else {
                        int v11 = v10 >>> 24;
                        int v12 = 0xFF - v11;
                        int v13 = (0xFF - v1) * v12 / v2 + v1;
                        int v14 = 0xFF - v13;
                        arg17[v6] = ((v5 & 0xFF00) * v13 + (0xFF00 & v10) * v14 & 0xFF0000) + (0xFF00FF00 & v13 * (v5 & 0xFF00FF) + (v10 & 0xFF00FF) * v14) >>> 8 | v12 * v1 / v2 + v11 << 24;
                        v10 = v6 + 1;
                    }

                    v6 = v10;
                }
                else {
                    ++v6;
                }

                ++v8;
                v5 = v9;
            }

            v6 += arg24;
            v5 += arg25;
            ++v4;
        }
    }

    public void es(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, double arg25, int arg27) {
        ep v0 = this;
        es v1 = arg18;
        int v2 = arg22;
        int v4 = -arg21;
        try {
            int v5 = v4 / 2;
            int v6 = -v2 / 2;
            int v7 = (((int)(Math.sin(arg25) * 65536))) * arg27 >> 8;
            int v3 = arg27 * (((int)(Math.cos(arg25) * 65536))) >> 8;
            int v8 = v6 * v7 + v3 * v5 + (arg23 << 16);
            v6 = v6 * v3 - v5 * v7 + (arg24 << 16);
            v5 = v0.al * 0xFD950556 * arg20 + arg19;
            int v9;
            for(v9 = 0; true; ++v9) {
                if(v9 >= v2) {
                    return;
                }

                int v10 = v4;
                int v13 = v5;
                int v11 = v6;
                int v12 = v8;
                while(v10 < 0) {
                    int v14 = v1.ax[v1.al * (v11 >> 16) + (v12 >> 16)];
                    if(v14 != 0) {
                        v0.ax[v13] = v14;
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
                v5 += v0.al * -107049639;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    public void eu(es arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int[] arg28, int[] arg29) {
        ep v0 = this;
        es v1 = arg19;
        int v2 = arg23;
        int v4 = -arg22;
        try {
            v4 /= 2;
            int v5 = -v2 / 2;
            double v6 = (((double)arg26)) / 326.11;
            int v8 = ((int)(Math.sin(v6) * 65536));
            int v6_1 = ((int)(Math.cos(v6) * 65536));
            int v7 = arg27 * v8 >> 8;
            int v3 = v6_1 * arg27 >> 8;
            v6_1 = (arg24 << 16) + (v4 * v3 + v7 * v5);
            v8 = (arg25 << 16) + (v5 * v3 - v4 * v7);
            v4 = v0.al * -107049639 * arg21 + arg20;
            int v9 = 0;
            while(true) {
                if(v9 >= v2) {
                    return;
                }

                int v12 = v4 + arg28[v9];
                int v13 = arg28[v9] * v3 + v6_1;
                int v11 = v8 - arg28[v9] * v7;
                int v14 = -arg29[v9];
                while(v14 < 0) {
                    v0.ax[v12] = v1.ax[(v13 >> 16) + (v11 >> 16) * v1.al];
                    v13 += v3;
                    v11 -= v7;
                    ++v14;
                    ++v12;
                }

                v6_1 += v7;
                v8 += v3;
                v4 += v0.al * -107049639;
                ++v9;
                v2 = arg23;
            }
        }
        catch(Exception ) {
            return;
        }
    }

    public void ev(es arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14, int[] arg15) {
        int v3;
        int v1;
        arg12 = 0;
        int v0 = arg9 < 0 ? -arg9 : 0;
        if(arg7.ae + arg9 <= arg13) {
            arg13 = arg7.ae;
        }
        else {
            arg13 -= arg9;
        }

        if(arg8 < 0) {
            arg12 = -arg8;
        }

        int v2 = this.al * 0xCA8AAB2F * (arg11 + arg9 + v0) + (arg10 + arg8 + arg12);
        arg9 += v0;
        while(v0 < arg13) {
            arg10 = arg14[arg9];
            arg11 = arg9 + 1;
            arg9 = arg15[arg9];
            if(arg8 < arg10) {
                v1 = arg10 - arg8;
                v3 = v1 - arg12 + v2;
            }
            else {
                v1 = arg12;
                v3 = v2;
            }

            arg10 += arg9;
            arg9 = arg7.al + arg8 <= arg10 ? arg7.al : arg10 - arg8;
            while(v1 < arg9) {
                arg10 = arg7.ax[arg7.al * v0 + v1];
                if(arg10 != 0) {
                    this.ax[v3] = arg10;
                    ++v3;
                }
                else {
                    ++v3;
                }

                ++v1;
            }

            v2 += this.al * -107049639;
            ++v0;
            arg9 = arg11;
        }
    }

    public void ew(es arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int[] arg14, int[] arg15) {
        int v3;
        int v1;
        arg12 = 0;
        int v0 = arg9 < 0 ? -arg9 : 0;
        if(arg7.ae + arg9 <= arg13) {
            arg13 = arg7.ae;
        }
        else {
            arg13 -= arg9;
        }

        if(arg8 < 0) {
            arg12 = -arg8;
        }

        int v2 = this.al * -107049639 * (arg11 + arg9 + v0) + (arg10 + arg8 + arg12);
        arg9 += v0;
        while(v0 < arg13) {
            arg10 = arg14[arg9];
            arg11 = arg9 + 1;
            arg9 = arg15[arg9];
            if(arg8 < arg10) {
                v1 = arg10 - arg8;
                v3 = v1 - arg12 + v2;
            }
            else {
                v1 = arg12;
                v3 = v2;
            }

            arg10 += arg9;
            arg9 = arg7.al + arg8 <= arg10 ? arg7.al : arg10 - arg8;
            while(v1 < arg9) {
                arg10 = arg7.ax[arg7.al * v0 + v1];
                if(arg10 != 0) {
                    this.ax[v3] = arg10;
                    ++v3;
                }
                else {
                    ++v3;
                }

                ++v1;
            }

            v2 += this.al * 0x248BB0AA;
            ++v0;
            arg9 = arg11;
        }
    }

    public void ey(es arg18, int arg19, int arg20, int arg21, int arg22, int arg23) {
        int v15;
        int v14;
        int v9;
        int v7;
        ep v0 = this;
        es v1 = arg18;
        if(arg23 <= 0) {
            return;
        }

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
                    v14 = ((v1.an << 16) + v11 - 1) / v11;
                    v15 = arg20 + v14;
                    v8 = v14 * v11 - (v1.an << 16);
                }
                else {
                    v15 = arg20;
                }

                int v2 = v12 < v5 ? ((v12 << 16) - v7 + v10 - 1) / v10 : arg21;
                int v3 = v4 < v6 ? ((v4 << 16) - v8 + v11 - 1) / v11 : arg22;
                v4 = v0.al * 1010460152 * v15 + v9;
                v5 = v0.al * 0x223D253F - v2;
                v6 = v3 + v15;
                int v16 = 0xD21DC9D7;
                if(v6 > v0.an * v16) {
                    v3 -= v6 - v0.an * v16;
                }

                if(v15 < v0.ar * -1011003666) {
                    v6 = v0.ar * 2002832733 - v15;
                    v3 -= v6;
                    v4 += v0.al * 0xB70BE5C8 * v6;
                    v8 += v6 * v11;
                }

                v14 = v3;
                v3 = v2 + v9;
                if(v3 > v0.aj * 0xEC77D124) {
                    v3 -= v0.aj * -139570709;
                    v2 -= v3;
                    v5 += v3;
                }

                if(v9 < v0.ap * 0xE4D30573) {
                    v6 = v0.ap * 1373099860 - v9;
                    v2 -= v6;
                    v4 += v6;
                    v7 += v6 * v10;
                    v5 += v6;
                }

                hu.cm(v0.ax, v1.ax, 0, v7, v8, v4, v5, v2, v14, v10, v11, v12, arg23, -93);
                return;
            }
        }
    }

    public void ez(es arg15, int arg16, int arg17, int arg18) {
        int v11;
        int v8;
        ep v0 = this;
        es v1 = arg15;
        if(arg18 == 0) {
            return;
        }

        int v2 = arg16 + v1.ar;
        int v3 = arg17 + v1.an;
        int v4 = v0.al * -107049639 * v3 + v2;
        int v5 = v1.ae;
        int v6 = v1.al;
        int v7 = v0.al * 0xB7A6772D - v6;
        int v9 = 0;
        if(v3 < v0.ar * 0x5E7A0F93) {
            v8 = v0.ar * 0xD05164BF - v3;
            v5 -= v8;
            v3 = 2002832733 * v0.ar;
            v11 = v6 * v8;
            v4 += v8 * (v0.al * 0x5EF1564F);
        }
        else {
            v11 = 0;
        }

        v3 += v5;
        if(v3 > v0.an * 0xB3E53148) {
            v5 -= v3 - v0.an * 0x5955344E;
        }

        v8 = v5;
        if(v2 < v0.ap * -2080929458) {
            v3 = v0.ap * 0xE4D30573 - v2;
            v6 -= v3;
            v2 = v0.ap * 0xE4D30573;
            v11 += v3;
            v4 += v3;
            v9 = v3;
            v7 += v3;
        }

        v5 = v4;
        v4 = v11;
        v2 += v6;
        if(v2 > v0.aj * 0x1FD7A0AA) {
            v2 -= v0.aj * 0x56AC17CD;
            v6 -= v2;
            v9 += v2;
            v7 += v2;
        }

        v11 = v9;
        v9 = v7;
        if(v6 > 0) {
            if(v8 <= 0) {
            }
            else {
                ii.bw(v0.ax, v1.ax, 0, v4, v5, v6, v8, v9, v11, arg18, 0x7FC2DE4D);
                return;
            }
        }
    }
}

