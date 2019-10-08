public class kx {
    int[] ae;
    byte[] al;
    int[] ax;
    public static final int bk = 45;
    static final int fo = 22;

    public kx(byte[] arg15) {
        int v10;
        int v7;
        int v4;
        int v3;
        try {
            super();
            int v0 = arg15.length;
            this.ax = new int[v0];
            this.al = arg15;
            int[] v1 = new int[33];
            this.ae = new int[8];
            v3 = 0;
            v4 = 0;
            while(true) {
            label_13:
                if(v3 >= v0) {
                    return;
                }

                int v5 = arg15[v3];
                if(v5 == 0) {
                }
                else {
                    int v6 = 0x20;
                    v7 = 1 << 0x20 - v5;
                    int v9 = v1[v5];
                    this.ax[v3] = v9;
                    if((v9 & v7) != 0) {
                        v7 = v1[v5 - 1];
                    }
                    else {
                        v7 |= v9;
                        v10 = v5 - 1;
                        while(v10 >= 1) {
                            int v11 = v1[v10];
                            if(v11 != v9) {
                                break;
                            }

                            int v12 = 1 << 0x20 - v10;
                            if((v11 & v12) != 0) {
                                v1[v10] = v1[v10 - 1];
                            }
                            else {
                                v1[v10] = v11 | v12;
                                --v10;
                                continue;
                            }

                            break;
                        }
                    }

                    v1[v5] = v7;
                    int v8;
                    for(v8 = v5 + 1; v8 <= v6; ++v8) {
                        if(v1[v8] == v9) {
                            v1[v8] = v7;
                        }
                    }

                    v6 = 0;
                    v7 = 0;
                    while(v6 < v5) {
                        if((0x80000000 >>> v6 & v9) != 0) {
                            if(this.ae[v7] == 0) {
                                this.ae[v7] = v4;
                            }

                            v7 = this.ae[v7];
                        }
                        else {
                            ++v7;
                        }

                        if(v7 >= this.ae.length) {
                            int[] v8_1 = new int[this.ae.length * 2];
                            for(v10 = 0; v10 < this.ae.length; ++v10) {
                                v8_1[v10] = this.ae[v10];
                            }

                            this.ae = v8_1;
                        }

                        ++v6;
                    }

                    this.ae[v7] = ~v3;
                    if(v7 < v4) {
                        goto label_95;
                    }

                    break;
                }

                goto label_95;
            }
        }
        catch(RuntimeException v15) {
            goto label_100;
        }

        v4 = v7 + 1;
    label_95:
        ++v3;
        goto label_13;
        return;
    label_100:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("kx.<init>(");
        v0_1.append(')');
        throw lx.al(((Throwable)v15), v0_1.toString());
    }

    int ad(byte[] arg6, int arg7, byte[] arg8, int arg9, int arg10) {
        if(arg10 == 0) {
            return 0;
        }

        arg10 += arg9;
        int v2 = arg9;
        int v1 = 0;
        for(arg9 = arg7; true; ++arg9) {
            int v3 = arg6[arg9];
            if(v3 < 0) {
                v1 = this.ae[v1];
            }
            else {
                ++v1;
            }

            int v4 = this.ae[v1];
            if(v4 < 0) {
                v1 = v2 + 1;
                arg8[v2] = ((byte)(~v4));
                if(v1 >= arg10) {
                }
                else {
                    v2 = v1;
                    v1 = 0;
                    goto label_24;
                }
            }
            else {
            label_24:
                if((v3 & 0x40) != 0) {
                    v1 = this.ae[v1];
                }
                else {
                    ++v1;
                }

                v4 = this.ae[v1];
                if(v4 < 0) {
                    v1 = v2 + 1;
                    arg8[v2] = ((byte)(~v4));
                    if(v1 >= arg10) {
                        goto label_141;
                    }
                    else {
                        v2 = v1;
                        v1 = 0;
                    }
                }

                if((330737253 & v3) != 0) {
                    v1 = this.ae[v1];
                }
                else {
                    ++v1;
                }

                v4 = this.ae[v1];
                if(v4 < 0) {
                    v1 = v2 + 1;
                    arg8[v2] = ((byte)(~v4));
                    if(v1 >= arg10) {
                        goto label_141;
                    }
                    else {
                        v2 = v1;
                        v1 = 0;
                    }
                }

                if((v3 & 16) != 0) {
                    v1 = this.ae[v1];
                }
                else {
                    ++v1;
                }

                v4 = this.ae[v1];
                if(v4 < 0) {
                    v1 = v2 + 1;
                    arg8[v2] = ((byte)(~v4));
                    if(v1 >= arg10) {
                        goto label_141;
                    }
                    else {
                        v2 = v1;
                        v1 = 0;
                    }
                }

                if((v3 & 8) != 0) {
                    v1 = this.ae[v1];
                }
                else {
                    ++v1;
                }

                v4 = this.ae[v1];
                if(v4 < 0) {
                    v1 = v2 + 1;
                    arg8[v2] = ((byte)(~v4));
                    if(v1 >= arg10) {
                        goto label_141;
                    }
                    else {
                        v2 = v1;
                        v1 = 0;
                    }
                }

                if((v3 & 4) != 0) {
                    v1 = this.ae[v1];
                }
                else {
                    ++v1;
                }

                v4 = this.ae[v1];
                if(v4 < 0) {
                    v1 = v2 + 1;
                    arg8[v2] = ((byte)(~v4));
                    if(v1 >= arg10) {
                        goto label_141;
                    }
                    else {
                        v2 = v1;
                        v1 = 0;
                    }
                }

                if((v3 & 2) != 0) {
                    v1 = this.ae[v1];
                }
                else {
                    ++v1;
                }

                v4 = this.ae[v1];
                if(v4 < 0) {
                    v1 = v2 + 1;
                    arg8[v2] = ((byte)(~v4));
                    if(v1 >= arg10) {
                        goto label_141;
                    }
                    else {
                        v2 = v1;
                        v1 = 0;
                    }
                }

                if((v3 & 1) != 0) {
                    v1 = this.ae[v1];
                }
                else {
                    ++v1;
                }

                v3 = this.ae[v1];
                if(v3 < 0) {
                    v1 = v2 + 1;
                    arg8[v2] = ((byte)(~v3));
                    if(v1 >= arg10) {
                        goto label_141;
                    }
                    else {
                        goto label_144;
                    }
                }

                goto label_146;
            }

        label_141:
            return arg9 + 1 - arg7;
        label_144:
            v2 = v1;
            v1 = 0;
        label_146:
        }
    }

    int ae(byte[] arg9, int arg10, int arg11, byte[] arg12, int arg13) {
        int v2;
        int v0 = arg13 << 3;
        arg11 += arg10;
        int v1 = 0;
        while(true) {
            if(arg10 >= arg11) {
                goto label_66;
            }

            v2 = arg9[arg10] & 0xFF;
            int v3 = this.ax[v2];
            int v4 = this.al[v2];
            if(v4 == 0) {
                break;
            }

            v2 = v0 >> 3;
            int v5 = v0 & 7;
            v1 &= -v5 >> 0x1F;
            int v6 = (v5 + v4 - 1 >> 3) + v2;
            v5 += 24;
            v1 |= v3 >>> v5;
            arg12[v2] = ((byte)v1);
            if(v2 >= v6) {
            }
            else {
                ++v2;
                v5 += -8;
                v1 = v3 >>> v5;
                arg12[v2] = ((byte)v1);
                if(v2 >= v6) {
                }
                else {
                    ++v2;
                    v5 += -8;
                    v1 = v3 >>> v5;
                    arg12[v2] = ((byte)v1);
                    if(v2 >= v6) {
                    }
                    else {
                        ++v2;
                        v5 += -8;
                        v1 = v3 >>> v5;
                        arg12[v2] = ((byte)v1);
                        if(v2 >= v6) {
                        }
                        else {
                            v1 = v3 << -(v5 - 8);
                            arg12[v2 + 1] = ((byte)v1);
                        }
                    }
                }
            }

            v0 += v4;
            ++arg10;
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("");
        v10.append(v2);
        throw new RuntimeException(v10.toString());
    label_66:
        return (v0 + 7 >> 3) - arg13;
    }

    int aj(byte[] arg9, int arg10, int arg11, byte[] arg12, int arg13) {
        int v2;
        int v0 = arg13 << 3;
        arg11 += arg10;
        int v1 = 0;
        while(true) {
            if(arg10 >= arg11) {
                goto label_67;
            }

            v2 = arg9[arg10] & 0x2EBDDBF9;
            int v3 = this.ax[v2];
            int v4 = this.al[v2];
            if(v4 == 0) {
                break;
            }

            v2 = v0 >> 3;
            int v5 = v0 & 7;
            v1 &= -v5 >> 0x1F;
            int v6 = (v5 + v4 - 1 >> 3) + v2;
            v5 += 24;
            v1 |= v3 >>> v5;
            arg12[v2] = ((byte)v1);
            if(v2 >= v6) {
            }
            else {
                ++v2;
                v5 += -8;
                v1 = v3 >>> v5;
                arg12[v2] = ((byte)v1);
                if(v2 >= v6) {
                }
                else {
                    ++v2;
                    v5 += -8;
                    v1 = v3 >>> v5;
                    arg12[v2] = ((byte)v1);
                    if(v2 >= v6) {
                    }
                    else {
                        ++v2;
                        v5 += -8;
                        v1 = v3 >>> v5;
                        arg12[v2] = ((byte)v1);
                        if(v2 >= v6) {
                        }
                        else {
                            v1 = v3 << -(v5 - 8);
                            arg12[v2 + 1] = ((byte)v1);
                        }
                    }
                }
            }

            v0 += v4;
            ++arg10;
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("");
        v10.append(v2);
        throw new RuntimeException(v10.toString());
    label_67:
        return (v0 + 7 >> 3) - arg13;
    }

    int al(byte[] arg5, int arg6, byte[] arg7, int arg8, int arg9, int arg10) {
        if(arg9 == 0) {
            return 0;
        }

        arg9 += arg8;
        int v1 = arg8;
        int v0 = 0;
        arg8 = arg6;
        try {
            while(true) {
            label_7:
                int v2 = arg5[arg8];
                if(v2 < 0) {
                    v0 = this.ae[v0];
                }
                else {
                    ++v0;
                }

                int v3 = this.ae[v0];
                if(v3 < 0) {
                    v0 = v1 + 1;
                    arg7[v1] = ((byte)(~v3));
                    if(v0 >= arg9) {
                    }
                    else {
                        v1 = v0;
                        v0 = 0;
                        goto label_24;
                    }
                }
                else {
                label_24:
                    if((v2 & 0x40) != 0) {
                        v0 = this.ae[v0];
                    }
                    else {
                        ++v0;
                    }

                    v3 = this.ae[v0];
                    if(v3 < 0) {
                        v0 = v1 + 1;
                        arg7[v1] = ((byte)(~v3));
                        if(v0 >= arg9) {
                            break;
                        }
                        else {
                            v1 = v0;
                            v0 = 0;
                        }
                    }

                    if((v2 & 0x20) != 0) {
                        v0 = this.ae[v0];
                    }
                    else {
                        ++v0;
                    }

                    v3 = this.ae[v0];
                    if(v3 < 0) {
                        v0 = v1 + 1;
                        arg7[v1] = ((byte)(~v3));
                        if(v0 >= arg9) {
                            break;
                        }
                        else {
                            v1 = v0;
                            v0 = 0;
                        }
                    }

                    if((v2 & 16) != 0) {
                        v0 = this.ae[v0];
                    }
                    else {
                        ++v0;
                    }

                    v3 = this.ae[v0];
                    if(v3 < 0) {
                        v0 = v1 + 1;
                        arg7[v1] = ((byte)(~v3));
                        if(v0 >= arg9) {
                            break;
                        }
                        else {
                            v1 = v0;
                            v0 = 0;
                        }
                    }

                    if((v2 & 8) != 0) {
                        v0 = this.ae[v0];
                    }
                    else {
                        ++v0;
                    }

                    v3 = this.ae[v0];
                    if(v3 < 0) {
                        v0 = v1 + 1;
                        arg7[v1] = ((byte)(~v3));
                        if(v0 >= arg9) {
                            break;
                        }
                        else {
                            v1 = v0;
                            v0 = 0;
                        }
                    }

                    if((v2 & 4) != 0) {
                        v0 = this.ae[v0];
                    }
                    else {
                        ++v0;
                    }

                    v3 = this.ae[v0];
                    if(v3 < 0) {
                        v0 = v1 + 1;
                        arg7[v1] = ((byte)(~v3));
                        if(v0 >= arg9) {
                            break;
                        }
                        else {
                            v1 = v0;
                            v0 = 0;
                        }
                    }

                    if((v2 & 2) != 0) {
                        v0 = this.ae[v0];
                    }
                    else {
                        ++v0;
                    }

                    v3 = this.ae[v0];
                    if(v3 < 0) {
                        v0 = v1 + 1;
                        arg7[v1] = ((byte)(~v3));
                        if(v0 >= arg9) {
                            break;
                        }
                        else {
                            v1 = v0;
                            v0 = 0;
                        }
                    }

                    if((v2 & 1) != 0) {
                        v0 = this.ae[v0];
                    }
                    else {
                        ++v0;
                    }

                    v2 = this.ae[v0];
                    if(v2 < 0) {
                        v0 = v1 + 1;
                        arg7[v1] = ((byte)(~v2));
                        if(v0 < arg9) {
                            goto label_143;
                        }

                        break;
                    }

                    goto label_145;
                }

                break;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("kx.al(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }

        return arg8 + 1 - arg6;
    label_143:
        v1 = v0;
        v0 = 0;
    label_145:
        ++arg8;
        goto label_7;
    }

    int an(byte[] arg9, int arg10, int arg11, byte[] arg12, int arg13) {
        int v2;
        int v0 = arg13 << 3;
        arg11 += arg10;
        int v1 = 0;
        while(true) {
            if(arg10 >= arg11) {
                goto label_67;
            }

            v2 = arg9[arg10] & 0xFF;
            int v3 = this.ax[v2];
            int v4 = this.al[v2];
            if(v4 == 0) {
                break;
            }

            v2 = v0 >> 3;
            int v5 = v0 & 7;
            v1 &= -v5 >> 0xBC522828;
            int v6 = (v5 + v4 - 1 >> 3) + v2;
            v5 += 24;
            v1 |= v3 >>> v5;
            arg12[v2] = ((byte)v1);
            if(v2 >= v6) {
            }
            else {
                ++v2;
                v5 += -8;
                v1 = v3 >>> v5;
                arg12[v2] = ((byte)v1);
                if(v2 >= v6) {
                }
                else {
                    ++v2;
                    v5 += -8;
                    v1 = v3 >>> v5;
                    arg12[v2] = ((byte)v1);
                    if(v2 >= v6) {
                    }
                    else {
                        ++v2;
                        v5 += -8;
                        v1 = v3 >>> v5;
                        arg12[v2] = ((byte)v1);
                        if(v2 >= v6) {
                        }
                        else {
                            v1 = v3 << -(v5 - 8);
                            arg12[v2 + 1] = ((byte)v1);
                        }
                    }
                }
            }

            v0 += v4;
            ++arg10;
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("");
        v10.append(v2);
        throw new RuntimeException(v10.toString());
    label_67:
        return (v0 + 7 >> 3) - arg13;
    }

    int ap(byte[] arg9, int arg10, int arg11, byte[] arg12, int arg13) {
        int v2;
        int v0 = arg13 << 3;
        arg11 += arg10;
        int v1 = 0;
        while(true) {
            if(arg10 >= arg11) {
                goto label_66;
            }

            v2 = arg9[arg10] & 0xFF;
            int v3 = this.ax[v2];
            int v4 = this.al[v2];
            if(v4 == 0) {
                break;
            }

            v2 = v0 >> 3;
            int v5 = v0 & 7;
            v1 &= -v5 >> 0x1F;
            int v6 = (v5 + v4 - 1 >> 3) + v2;
            v5 += 24;
            v1 |= v3 >>> v5;
            arg12[v2] = ((byte)v1);
            if(v2 >= v6) {
            }
            else {
                ++v2;
                v5 += -8;
                v1 = v3 >>> v5;
                arg12[v2] = ((byte)v1);
                if(v2 >= v6) {
                }
                else {
                    ++v2;
                    v5 += -8;
                    v1 = v3 >>> v5;
                    arg12[v2] = ((byte)v1);
                    if(v2 >= v6) {
                    }
                    else {
                        ++v2;
                        v5 += -8;
                        v1 = v3 >>> v5;
                        arg12[v2] = ((byte)v1);
                        if(v2 >= v6) {
                        }
                        else {
                            v1 = v3 << -(v5 - 8);
                            arg12[v2 + 1] = ((byte)v1);
                        }
                    }
                }
            }

            v0 += v4;
            ++arg10;
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("");
        v10.append(v2);
        throw new RuntimeException(v10.toString());
    label_66:
        return (v0 + 7 >> 3) - arg13;
    }

    int ar(byte[] arg9, int arg10, int arg11, byte[] arg12, int arg13) {
        int v2;
        int v0 = arg13 << 3;
        arg11 += arg10;
        int v1 = 0;
        while(true) {
            if(arg10 >= arg11) {
                goto label_66;
            }

            v2 = arg9[arg10] & 0xFF;
            int v3 = this.ax[v2];
            int v4 = this.al[v2];
            if(v4 == 0) {
                break;
            }

            v2 = v0 >> 3;
            int v5 = v0 & 7;
            v1 &= -v5 >> 0x1F;
            int v6 = (v5 + v4 - 1 >> 3) + v2;
            v5 += 24;
            v1 |= v3 >>> v5;
            arg12[v2] = ((byte)v1);
            if(v2 >= v6) {
            }
            else {
                ++v2;
                v5 += -8;
                v1 = v3 >>> v5;
                arg12[v2] = ((byte)v1);
                if(v2 >= v6) {
                }
                else {
                    ++v2;
                    v5 += -8;
                    v1 = v3 >>> v5;
                    arg12[v2] = ((byte)v1);
                    if(v2 >= v6) {
                    }
                    else {
                        ++v2;
                        v5 += -8;
                        v1 = v3 >>> v5;
                        arg12[v2] = ((byte)v1);
                        if(v2 >= v6) {
                        }
                        else {
                            v1 = v3 << -(v5 - 8);
                            arg12[v2 + 1] = ((byte)v1);
                        }
                    }
                }
            }

            v0 += v4;
            ++arg10;
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("");
        v10.append(v2);
        throw new RuntimeException(v10.toString());
    label_66:
        return (v0 + 7 >> 3) - arg13;
    }

    public static String ax(CharSequence[] arg2, int arg3, int arg4, int arg5) {
        if(arg4 != 0) {
            goto label_5;
        }

        try {
            return "";
        label_5:
            if(1 == arg4) {
                CharSequence v2_1 = arg2[arg3];
                if(v2_1 == null) {
                    return "null";
                }

                return v2_1.toString();
            }

            arg4 += arg3;
            arg5 = arg3;
            int v0 = 0;
            while(arg5 < arg4) {
                CharSequence v1 = arg2[arg5];
                v0 += v1 == null ? 4 : v1.length();
                ++arg5;
            }

            StringBuilder v5 = new StringBuilder(v0);
            while(arg3 < arg4) {
                CharSequence v0_1 = arg2[arg3];
                if(v0_1 == null) {
                    v5.append("null");
                }
                else {
                    v5.append(v0_1);
                }

                ++arg3;
            }

            return v5.toString();
        label_4:
        }
        catch(RuntimeException v2) {
            goto label_4;
        }

        StringBuilder v3 = new StringBuilder();
        v3.append("kx.ax(");
        v3.append(')');
        throw lx.al(((Throwable)v2), v3.toString());
    }

    int ax(byte[] arg8, int arg9, int arg10, byte[] arg11, int arg12, short arg13) {
        StringBuilder v9;
        int v13 = 0;
        int v0 = arg12 << 3;
        arg10 += arg9;
        while(arg9 < arg10) {
            try {
                int v1 = arg8[arg9] & 0xFF;
                int v2 = this.ax[v1];
                int v3 = this.al[v1];
                if(v3 != 0) {
                    v1 = v0 >> 3;
                    int v4 = v0 & 7;
                    v13 &= -v4 >> 0x1F;
                    int v5 = (v4 + v3 - 1 >> 3) + v1;
                    v4 += 24;
                    v13 |= v2 >>> v4;
                    arg11[v1] = ((byte)v13);
                    if(v1 >= v5) {
                    }
                    else {
                        ++v1;
                        v4 += -8;
                        v13 = v2 >>> v4;
                        arg11[v1] = ((byte)v13);
                        if(v1 >= v5) {
                        }
                        else {
                            ++v1;
                            v4 += -8;
                            v13 = v2 >>> v4;
                            arg11[v1] = ((byte)v13);
                            if(v1 >= v5) {
                            }
                            else {
                                ++v1;
                                v4 += -8;
                                v13 = v2 >>> v4;
                                arg11[v1] = ((byte)v13);
                                if(v1 >= v5) {
                                }
                                else {
                                    v13 = v2 << -(v4 - 8);
                                    arg11[v1 + 1] = ((byte)v13);
                                }
                            }
                        }
                    }

                    v0 += v3;
                    ++arg9;
                    continue;
                }

                v9 = new StringBuilder();
                v9.append("");
                v9.append(v1);
                throw new RuntimeException(v9.toString());
            }
            catch(RuntimeException v8) {
                v9 = new StringBuilder();
                v9.append("kx.ax(");
                v9.append(')');
                throw lx.al(((Throwable)v8), v9.toString());
            }
        }

        return (v0 + 7 >> 3) - arg12;
    }

    public static void gw(ar arg2, int arg3) {
        arg3 = 0x8CE609E3;
        try {
            if(client.nz * arg3 == arg2.gu * -55800759) {
                client.np[arg2.gl * 0x2914661F] = true;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("kx.gw(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

