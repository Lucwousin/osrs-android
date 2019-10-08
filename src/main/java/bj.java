import java.net.MalformedURLException;
import java.net.URL;

public class bj extends bt {
    int[] ax;

    public bj(int[] arg2, int arg3, int arg4) {
        try {
            super();
            this.ar(arg2, arg3, arg4, -2070803293);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bj.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ab() {
    }

    final void ac(int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        int v3;
        int v2;
        if(this.ac) {
            arg10 = 1109746211;
            if(arg12 > this.by * arg10) {
                arg12 = this.by * arg10;
            }
        }

        if(0 >= arg12) {
            return;
        }

        arg8 = arg8;
        arg13 = arg13;
        arg10 = 0xE0639EEB;
        int v0 = 0xFF00FF;
        int v1 = 0xFF00;
        if(this.bf) {
            arg12 = arg12;
            arg9 = arg12 >> 2;
            arg11 = arg14 << 2;
            if(this.bn * arg10 == 0) {
                if(arg9 > 0) {
                    do {
                        arg10 = bj.aa[arg13 >> 8];
                        arg13 += arg11;
                        arg14 = arg8 + 1;
                        arg7[arg8] = arg10;
                        arg8 = arg14 + 1;
                        arg7[arg14] = arg10;
                        arg14 = arg8 + 1;
                        arg7[arg8] = arg10;
                        arg8 = arg14 + 1;
                        arg7[arg14] = arg10;
                        --arg9;
                        if(arg9 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                arg9 = arg12 & 3;
                if(arg9 <= 0) {
                    return;
                }

                arg10 = bj.aa[arg13 >> 8];
                while(true) {
                    arg11 = arg8 + 1;
                    arg7[arg8] = arg10;
                    --arg9;
                    if(arg9 <= 0) {
                        break;
                    }

                    arg8 = arg11;
                }
            }
            else {
                arg14 = this.bn * arg10;
                arg10 = 0x100 - this.bn * arg10;
                if(arg9 > 0) {
                    while(true) {
                        v2 = bj.aa[arg13 >> 8];
                        arg13 += arg11;
                        v3 = ((v2 & v0) * arg10 >> 8 & v0) + ((v2 & v1) * arg10 >> 8 & v1);
                        int v4 = arg8 + 1;
                        arg7[arg8] = ((arg7[arg8] & v1) * arg14 >> 8 & v1) + (((arg7[arg8] & v0) * arg14 >> 8 & v0) + v3);
                        v2 = v4 + 1;
                        arg7[v4] = ((arg7[v4] & v0) * arg14 >> 8 & v0) + v3 + ((arg7[v4] & v1) * arg14 >> 8 & v1);
                        v4 = v2 + 1;
                        arg7[v2] = ((arg7[v2] & v0) * arg14 >> 8 & v0) + v3 + ((arg7[v2] & v1) * arg14 >> 8 & v1);
                        v2 = v4 + 1;
                        arg7[v4] = ((arg7[v4] & v1) * arg14 >> 8 & v1) + (((arg7[v4] & v0) * arg14 >> 8 & v0) + v3);
                        --arg9;
                        if(arg9 <= 0) {
                            break;
                        }

                        arg8 = v2;
                    }

                    arg8 = v2;
                }

                arg9 = arg12 & 3;
                if(arg9 <= 0) {
                    return;
                }

                arg12 = ((bj.aa[arg13 >> 8] & v0) * arg10 >> 8 & v0) + (arg10 * (bj.aa[arg13 >> 8] & v1) >> 8 & v1);
                while(true) {
                    arg11 = arg8 + 1;
                    arg7[arg8] = ((arg7[arg8] & v1) * arg14 >> 8 & v1) + (((arg7[arg8] & v0) * arg14 >> 8 & v0) + arg12);
                    --arg9;
                    if(arg9 <= 0) {
                        break;
                    }

                    arg8 = arg11;
                }
            }

            return;
        }

        arg12 = arg12;
        if(this.bn * arg10 == 0) {
            while(true) {
                arg9 = arg8 + 1;
                arg7[arg8] = bj.aa[arg13 >> 8];
                arg13 += arg14;
                --arg12;
                if(arg12 <= 0) {
                    break;
                }

                arg8 = arg9;
            }
        }
        else {
            arg9 = this.bn * arg10;
            arg10 = 0x100 - this.bn * arg10;
            while(true) {
                arg11 = bj.aa[arg13 >> 8];
                arg13 += arg14;
                v3 = arg8 + 1;
                arg7[arg8] = ((arg7[arg8] & v0) * arg9 >> 8 & v0) + (((arg11 & v1) * arg10 >> 8 & v1) + ((arg11 & v0) * arg10 >> 8 & v0)) + ((arg7[arg8] & v1) * arg9 >> 8 & v1);
                --arg12;
                if(arg12 > 0) {
                    arg8 = v3;
                    continue;
                }

                return;
            }
        }
    }

    final void ad(int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            if(this.ac) {
                arg11 = 1109746211;
                if(arg10 > this.by * arg11) {
                    arg10 = this.by * arg11;
                }

                if(arg9 >= 0) {
                }
            }

            if(0 >= arg10) {
                return;
            }

            arg6 = arg6;
            arg10 = arg10;
            arg8 = arg10 >> 2;
            arg11 = 0xE0639EEB;
            if(this.bn * arg11 == 0) {
                while(true) {
                    --arg8;
                    if(arg8 < 0) {
                        break;
                    }

                    arg9 = arg6 + 1;
                    arg5[arg6] = arg7;
                    arg6 = arg9 + 1;
                    arg5[arg9] = arg7;
                    arg9 = arg6 + 1;
                    arg5[arg6] = arg7;
                    arg6 = arg9 + 1;
                    arg5[arg9] = arg7;
                }

                arg8 = arg10 & 3;
                while(true) {
                    --arg8;
                    if(arg8 >= 0) {
                        arg5[arg6] = arg7;
                        ++arg6;
                        continue;
                    }

                    return;
                }
            }
            else {
                if(this.bn * arg11 == 0xFE) {
                    while(true) {
                        --arg8;
                        if(arg8 < 0) {
                            break;
                        }

                        arg7 = arg6 + 1;
                        arg5[arg6] = arg5[arg7];
                        arg6 = arg7 + 1;
                        arg5[arg7] = arg5[arg6];
                        arg7 = arg6 + 1;
                        arg5[arg6] = arg5[arg7];
                        arg6 = arg7 + 1;
                        arg5[arg7] = arg5[arg6];
                    }

                    arg7 = arg10 & 3;
                    while(true) {
                        --arg7;
                        if(arg7 < 0) {
                            return;
                        }

                        arg8 = arg6 + 1;
                        arg5[arg6] = arg5[arg8];
                        arg6 = arg8;
                    }
                }

                arg9 = this.bn * arg11;
                arg11 = 0x100 - this.bn * arg11;
                int v0 = 0xFF00;
                int v2 = 0xFF00FF;
                int v1 = ((arg7 & v0) * arg11 >> 8 & v0) + (arg11 * (arg7 & v2) >> 8 & v2);
                while(true) {
                    --arg8;
                    if(arg8 < 0) {
                        break;
                    }

                    arg11 = arg6 + 1;
                    arg5[arg6] = ((arg5[arg6] & v0) * arg9 >> 8 & v0) + (((arg5[arg6] & v2) * arg9 >> 8 & v2) + v1);
                    arg7 = arg11 + 1;
                    arg5[arg11] = ((arg5[arg11] & v0) * arg9 >> 8 & v0) + (((arg5[arg11] & v2) * arg9 >> 8 & v2) + v1);
                    arg11 = arg7 + 1;
                    arg5[arg7] = ((arg5[arg7] & v0) * arg9 >> 8 & v0) + (((arg5[arg7] & v2) * arg9 >> 8 & v2) + v1);
                    arg5[arg11] = ((arg5[arg11] & v2) * arg9 >> 8 & v2) + v1 + ((arg5[arg11] & v0) * arg9 >> 8 & v0);
                    arg6 = arg11 + 1;
                }

                arg7 = arg10 & 3;
                while(true) {
                    --arg7;
                    if(arg7 < 0) {
                        return;
                    }

                    arg5[arg6] = ((arg5[arg6] & v2) * arg9 >> 8 & v2) + v1 + ((arg5[arg6] & v0) * arg9 >> 8 & v0);
                    ++arg6;
                }
            }
        }
        catch(RuntimeException v5) {
            goto label_158;
        }

        return;
    label_158:
        StringBuilder v6 = new StringBuilder();
        v6.append("bj.ad(");
        v6.append(')');
        throw lx.al(((Throwable)v5), v6.toString());
    }

    static boolean ae(String arg1, int arg2) {
        if(arg1 == null) {
            return 0;
        }

        try {
            new URL(arg1);
            return 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("bj.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
        catch(MalformedURLException ) {
            return 0;
        }
    }

    public void af() {
    }

    final void ah(int[] arg30, int[] arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int arg42, int arg43, int arg44, byte arg45) {
        int v28;
        int v24;
        int v1_1;
        int v23;
        int v3;
        int v19;
        int v17;
        int v8;
        int v12;
        int v6;
        int v5;
        int v4;
        int v10;
        int v9;
        int v7;
        bj v1 = this;
        try {
            if(v1.ac) {
                v7 = arg36;
                if(v7 > v1.by * 1109746211) {
                    v7 = v1.by * 1109746211;
                }

                if(arg35 >= 0) {
                    goto label_16;
                }

                v9 = 0;
            }
            else {
                v7 = arg36;
            label_16:
                v9 = arg35;
            }

            if(v9 >= v7) {
                return;
            }

            v10 = arg34 + v9;
            int v11 = arg37 + arg38 * v9;
            v7 -= v9;
            int v13 = 0xFF00FF00;
            int v14 = 0xFF00FF;
            int v15 = 0xFF0000;
            int v16 = 0xFF00;
            if(v1.ba) {
                v9 -= v1.bw * 1126407459;
                v4 = arg39 + (arg42 >> 3) * v9;
                v5 = arg40 + (arg43 >> 3) * v9;
                v6 = arg41 + (arg44 >> 3) * v9;
                v9 = v6 >> 12;
                v12 = 0xFC0;
                if(v9 != 0) {
                    v8 = v4 / v9;
                    v9 = v5 / v9;
                    if(v8 < 0) {
                        v8 = 0;
                    }
                    else if(v8 > v12) {
                        v8 = 0xFC0;
                    }
                }
                else {
                    v8 = 0;
                    v9 = 0;
                }

                v4 += arg42;
                v5 += arg43;
                v6 += arg44;
                v17 = v6 >> 12;
                if(v17 != 0) {
                    v12 = v4 / v17;
                    v17 = v5 / v17;
                    if(v12 < 0) {
                        v19 = v4;
                        v12 = 0;
                    }
                    else {
                        v19 = v4;
                        if(v12 > 0xFC0) {
                            v12 = 0xFC0;
                        }
                    }
                }
                else {
                    v19 = v4;
                    v12 = 0;
                    v17 = 0;
                }

                v4 = (v8 << 20) + v9;
                v9 = (v17 - v9 >> 3) + (v12 - v8 >> 3 << 20);
                v8 = v7 >> 3;
                v3 = arg38 << 3;
                int v20 = v11 >> 8;
                int v21 = v4;
                if(v1.bd) {
                    if(v8 > 0) {
                        v4 = v21;
                        while(true) {
                            v21 = v10 + 1;
                            arg30[v10] = ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v14) * v20 & v13) + ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v16) * v20 & v15) >> 8;
                            v4 += v9;
                            v10 = v21 + 1;
                            arg30[v21] = ((arg31[(v4 >>> 26) + (v4 & 0xFC0)] & v16) * v20 & v15) + ((arg31[(v4 >>> 26) + (v4 & 0xFC0)] & v14) * v20 & v13) >> 8;
                            v4 += v9;
                            v21 = v10 + 1;
                            arg30[v10] = ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v16) * v20 & v15) + ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v14) * v20 & v13) >> 8;
                            v4 += v9;
                            v10 = v21 + 1;
                            arg30[v21] = ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v16) * v20 & v15) + ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v14) * v20 & v13) >> 8;
                            v4 += v9;
                            v23 = v7;
                            v7 = v10 + 1;
                            arg30[v10] = ((arg31[(v4 >>> 26) + (v4 & 0xFC0)] & v14) * v20 & v13) + ((arg31[(v4 >>> 26) + (v4 & 0xFC0)] & v16) * v20 & v15) >> 8;
                            v4 += v9;
                            v10 = v7 + 1;
                            arg30[v7] = ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v14) * v20 & v13) + ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v16) * v20 & v15) >> 8;
                            v4 += v9;
                            v7 = v10 + 1;
                            arg30[v10] = ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v14) * v20 & v13) + ((arg31[(v4 & 0xFC0) + (v4 >>> 26)] & v16) * v20 & v15) >> 8;
                            v4 += v9;
                            v10 = v7 + 1;
                            arg30[v7] = ((arg31[(v4 >>> 26) + (v4 & 0xFC0)] & v14) * v20 & v13) + (v20 * (arg31[(v4 >>> 26) + (v4 & 0xFC0)] & v16) & v15) >> 8;
                            v19 += arg42;
                            v5 += arg43;
                            v6 += arg44;
                            v1_1 = v6 >> 12;
                            if(v1_1 != 0) {
                                v4 = v19 / v1_1;
                                v1_1 = v5 / v1_1;
                                if(v4 < 0) {
                                    goto label_225;
                                }
                                else if(v4 > 0xFC0) {
                                    v4 = 0xFC0;
                                }
                            }
                            else {
                                v1_1 = 0;
                            label_225:
                                v4 = 0;
                            }

                            v7 = (v12 << 20) + v17;
                            v9 = (v4 - v12 >> 3 << 20) + (v1_1 - v17 >> 3);
                            v11 += v3;
                            v20 = v11 >> 8;
                            --v8;
                            if(v8 <= 0) {
                                v21 = v7;
                                break;
                            }

                            v17 = v1_1;
                            v12 = v4;
                            v4 = v7;
                            v7 = v23;
                        }
                    }
                    else {
                        v23 = v7;
                    }

                    v1_1 = v23 & 7;
                    if(v1_1 <= 0) {
                        return;
                    }

                    v3 = v1_1;
                    v1_1 = v21;
                    while(true) {
                        v5 = v10 + 1;
                        arg30[v10] = ((arg31[(v1_1 >>> 26) + (v1_1 & 0xFC0)] & v14) * v20 & v13) + ((arg31[(v1_1 >>> 26) + (v1_1 & 0xFC0)] & v16) * v20 & v15) >> 8;
                        v1_1 += v9;
                        --v3;
                        if(v3 <= 0) {
                            return;
                        }

                        v10 = v5;
                    }

                    return;
                }

                v23 = v7;
                if(v8 > 0) {
                    v1_1 = v21;
                    while(true) {
                        v4 = arg31[(v1_1 & 0xFC0) + (v1_1 >>> 26)];
                        if(v4 != 0) {
                            arg30[v10] = ((v4 & v16) * v20 & v15) + ((v4 & v14) * v20 & v13) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v4 = arg31[(v1_1 >>> 26) + (v1_1 & 0xFC0)];
                        if(v4 != 0) {
                            arg30[v10] = ((v4 & v14) * v20 & v13) + ((v4 & v16) * v20 & v15) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v4 = arg31[(v1_1 >>> 26) + (v1_1 & 0xFC0)];
                        if(v4 != 0) {
                            arg30[v10] = ((v4 & v16) * v20 & v15) + ((v4 & v14) * v20 & v13) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v4 = arg31[(v1_1 >>> 26) + (v1_1 & 0xFC0)];
                        if(v4 != 0) {
                            arg30[v10] = ((v4 & v14) * v20 & v13) + ((v4 & v16) * v20 & v15) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v4 = arg31[(v1_1 >>> 26) + (v1_1 & 0xFC0)];
                        if(v4 != 0) {
                            arg30[v10] = ((v4 & v14) * v20 & v13) + ((v4 & v16) * v20 & v15) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v4 = arg31[(v1_1 >>> 26) + (v1_1 & 0xFC0)];
                        if(v4 != 0) {
                            arg30[v10] = ((v4 & v14) * v20 & v13) + ((v4 & v16) * v20 & v15) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v4 = arg31[(v1_1 & 0xFC0) + (v1_1 >>> 26)];
                        if(v4 != 0) {
                            arg30[v10] = ((v4 & v16) * v20 & v15) + ((v4 & v14) * v20 & v13) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v1_1 = arg31[(v1_1 & 0xFC0) + (v1_1 >>> 26)];
                        if(v1_1 != 0) {
                            arg30[v10] = ((v1_1 & v16) * v20 & v15) + (v20 * (v1_1 & v14) & v13) >> 8;
                        }

                        ++v10;
                        v19 += arg42;
                        v5 += arg43;
                        v6 += arg44;
                        v1_1 = v6 >> 12;
                        if(v1_1 != 0) {
                            v4 = v19 / v1_1;
                            v1_1 = v5 / v1_1;
                            if(v4 < 0) {
                                v4 = 0;
                            }
                            else if(v4 > 0xFC0) {
                                v4 = 0xFC0;
                            }
                        }
                        else {
                            v1_1 = 0;
                            v4 = 0;
                        }

                        v9 = (v12 << 20) + v17;
                        v12 = (v1_1 - v17 >> 3) + (v4 - v12 >> 3 << 20);
                        v11 += v3;
                        v20 = v11 >> 8;
                        --v8;
                        if(v8 <= 0) {
                            v21 = v9;
                            break;
                        }

                        v17 = v1_1;
                        v1_1 = v9;
                        v9 = v12;
                        v12 = v4;
                    }
                }
                else {
                    v12 = v9;
                }

                v1_1 = v23 & 7;
                if(v1_1 <= 0) {
                    return;
                }

                v3 = v1_1;
                v1_1 = v21;
                do {
                    v4 = arg31[(v1_1 >>> 26) + (v1_1 & 0xFC0)];
                    if(v4 != 0) {
                        arg30[v10] = ((v4 & v16) * v20 & v15) + ((v4 & v14) * v20 & v13) >> 8;
                    }

                    ++v10;
                    v1_1 += v12;
                    --v3;
                }
                while(v3 > 0);
            }
            else {
                v23 = v7;
                bj v7_1 = this;
                v9 -= v7_1.bw * 1126407459;
                v1_1 = arg39 + (arg42 >> 3) * v9;
                v4 = arg40 + (arg43 >> 3) * v9;
                v5 = arg41 + v9 * (arg44 >> 3);
                v6 = v5 >> 14;
                v8 = 0x3F80;
                if(v6 != 0) {
                    v9 = v1_1 / v6;
                    v6 = v4 / v6;
                    if(v9 < 0) {
                        goto label_488;
                    }
                    else if(v9 > v8) {
                        v9 = 0x3F80;
                    }
                }
                else {
                    v6 = 0;
                label_488:
                    v9 = 0;
                }

                v1_1 += arg42;
                v4 += arg43;
                v5 += arg44;
                v12 = v5 >> 14;
                if(v12 != 0) {
                    v8 = v1_1 / v12;
                    v12 = v4 / v12;
                    if(v8 < 0) {
                        v24 = v1_1;
                        v8 = 0;
                    }
                    else {
                        v24 = v1_1;
                        if(v8 > 0x3F80) {
                            v8 = 0x3F80;
                        }
                    }
                }
                else {
                    v24 = v1_1;
                    v8 = 0;
                    v12 = 0;
                }

                v1_1 = (v9 << 18) + v6;
                v9 = (v8 - v9 >> 3 << 18) + (v12 - v6 >> 3);
                v6 = v23 >> 3;
                v3 = arg38 << 3;
                v17 = v11 >> 8;
                int v25 = v1_1;
                if(v7_1.bd) {
                    if(v6 > 0) {
                        v1_1 = v25;
                        while(true) {
                            int v18 = v10 + 1;
                            arg30[v10] = ((arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)] & v16) * v17 & v15) + ((arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)] & v14) * v17 & v13) >> 8;
                            v1_1 += v9;
                            v10 = v18 + 1;
                            arg30[v18] = ((arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)] & v14) * v17 & v13) + ((arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)] & v16) * v17 & v15) >> 8;
                            v1_1 += v9;
                            v18 = v10 + 1;
                            arg30[v10] = ((arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)] & v14) * v17 & v13) + ((arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)] & v16) * v17 & v15) >> 8;
                            v1_1 += v9;
                            v10 = v18 + 1;
                            arg30[v18] = ((arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)] & v14) * v17 & v13) + ((arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)] & v16) * v17 & v15) >> 8;
                            v1_1 += v9;
                            v18 = v10 + 1;
                            arg30[v10] = ((arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)] & v14) * v17 & v13) + ((arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)] & v16) * v17 & v15) >> 8;
                            v1_1 += v9;
                            v10 = v18 + 1;
                            arg30[v18] = ((arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)] & v16) * v17 & v15) + ((arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)] & v14) * v17 & v13) >> 8;
                            v1_1 += v9;
                            int v26 = v6;
                            v7 = v10 + 1;
                            arg30[v10] = ((arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)] & v14) * v17 & v13) + ((arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)] & v16) * v17 & v15) >> 8;
                            v1_1 += v9;
                            v10 = v7 + 1;
                            arg30[v7] = ((arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)] & v14) * v17 & v13) + ((arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)] & v16) * v17 & v15) >> 8;
                            v24 += arg42;
                            v4 += arg43;
                            v5 += arg44;
                            v1_1 = v5 >> 14;
                            if(v1_1 != 0) {
                                v6 = v24 / v1_1;
                                v1_1 = v4 / v1_1;
                                if(v6 < 0) {
                                    goto label_658;
                                }
                                else if(v6 > 0x3F80) {
                                    v6 = 0x3F80;
                                }
                            }
                            else {
                                v1_1 = 0;
                            label_658:
                                v6 = 0;
                            }

                            v7 = (v8 << 18) + v12;
                            v9 = (v1_1 - v12 >> 3) + (v6 - v8 >> 3 << 18);
                            v11 += v3;
                            v17 = v11 >> 8;
                            v8 = v26 - 1;
                            if(v8 <= 0) {
                                break;
                            }

                            v12 = v1_1;
                            v1_1 = v7;
                            v28 = v8;
                            v8 = v6;
                            v6 = v28;
                        }
                    }
                    else {
                        v7 = v25;
                    }

                    v1_1 = v23 & 7;
                    if(v1_1 <= 0) {
                        return;
                    }

                    while(true) {
                        v4 = v10 + 1;
                        arg30[v10] = ((arg31[(v7 >>> 25) + (v7 & 0x3F80)] & v16) * v17 & v15) + ((arg31[(v7 >>> 25) + (v7 & 0x3F80)] & v14) * v17 & v13) >> 8;
                        v7 += v9;
                        --v1_1;
                        if(v1_1 <= 0) {
                            return;
                        }

                        v10 = v4;
                    }

                    return;
                }

                if(v6 > 0) {
                    v1_1 = v25;
                    while(true) {
                        v7 = arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)];
                        if(v7 != 0) {
                            arg30[v10] = ((v7 & v14) * v17 & v13) + ((v7 & v16) * v17 & v15) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v7 = arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)];
                        if(v7 != 0) {
                            arg30[v10] = ((v7 & v16) * v17 & v15) + ((v7 & v14) * v17 & v13) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        int v27 = v6;
                        v6 = arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)];
                        if(v6 != 0) {
                            arg30[v10] = ((v6 & v16) * v17 & v15) + ((v6 & v14) * v17 & v13) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v6 = arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)];
                        if(v6 != 0) {
                            arg30[v10] = ((v6 & v14) * v17 & v13) + ((v6 & v16) * v17 & v15) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v6 = arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)];
                        if(v6 != 0) {
                            arg30[v10] = ((v6 & v16) * v17 & v15) + ((v6 & v14) * v17 & v13) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v6 = arg31[(v1_1 >>> 25) + (v1_1 & 0x3F80)];
                        if(v6 != 0) {
                            arg30[v10] = ((v6 & v16) * v17 & v15) + ((v6 & v14) * v17 & v13) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v6 = arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)];
                        if(v6 != 0) {
                            arg30[v10] = ((v6 & v14) * v17 & v13) + ((v6 & v16) * v17 & v15) >> 8;
                        }

                        ++v10;
                        v1_1 += v9;
                        v1_1 = arg31[(v1_1 & 0x3F80) + (v1_1 >>> 25)];
                        if(v1_1 != 0) {
                            arg30[v10] = ((v1_1 & v16) * v17 & v15) + (v17 * (v1_1 & v14) & v13) >> 8;
                        }

                        ++v10;
                        v24 += arg42;
                        v4 += arg43;
                        v5 += arg44;
                        v1_1 = v5 >> 14;
                        if(v1_1 != 0) {
                            v6 = v24 / v1_1;
                            v1_1 = v4 / v1_1;
                            if(v6 < 0) {
                                v6 = 0;
                            }
                            else if(v6 > 0x3F80) {
                                v6 = 0x3F80;
                            }
                        }
                        else {
                            v1_1 = 0;
                            v6 = 0;
                        }

                        v9 = (v8 << 18) + v12;
                        v8 = (v6 - v8 >> 3 << 18) + (v1_1 - v12 >> 3);
                        v11 += v3;
                        v17 = v11 >> 8;
                        v12 = v27 - 1;
                        if(v12 <= 0) {
                            break;
                        }

                        v28 = v12;
                        v12 = v1_1;
                        v1_1 = v9;
                        v9 = v8;
                        v8 = v6;
                        v6 = v28;
                    }
                }
                else {
                    v8 = v9;
                    v9 = v25;
                }

                v1_1 = v23 & 7;
                if(v1_1 <= 0) {
                    return;
                }

                do {
                label_874:
                    v3 = arg31[(v9 >>> 25) + (v9 & 0x3F80)];
                    if(v3 != 0) {
                        arg30[v10] = ((v3 & v16) * v17 & v15) + ((v3 & v14) * v17 & v13) >> 8;
                    }

                    goto label_888;
                }
                while(true);
            }

            return;
        }
        catch(RuntimeException v0) {
            goto label_895;
        }

    label_888:
        ++v10;
        v9 += v8;
        --v1_1;
        if(v1_1 > 0) {
            goto label_874;
        }

        return;
    label_895:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("bj.ah(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0), v1_2.toString());
    }

    public void ai() {
    }

    public final void aj(int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28) {
        int v19;
        int v18;
        int v16;
        int v17;
        int v15;
        int v14;
        int v4;
        int v5;
        int v3;
        bj v9 = this;
        int v0 = arg21;
        int v1 = arg22;
        int v2 = arg23;
        if(v0 != v1) {
            int v7 = arg25 - arg24 << 14;
            int v8 = v1 - v0;
            try {
                int v10 = v7 / v8;
                goto label_15;
            label_14:
                v10 = 0;
            label_15:
                int v11 = v2 != v1 ? (arg26 - arg25 << 14) / (v2 - v1) : 0;
                int v12 = v2 != v0 ? (arg24 - arg26 << 14) / (v0 - v2) : 0;
                v7 = -482049717;
                int v13 = 0xFEEE8863;
                if(v0 <= v1 && v0 <= v2) {
                    if(v0 >= v9.bt * v7) {
                        return;
                    }
                    else {
                        if(v1 > v9.bt * v7) {
                            v1 = v9.bt * v7;
                        }

                        if(v2 > v9.bt * v7) {
                            v2 = v9.bt * v7;
                        }

                        if(v1 < v2) {
                            v3 = arg24 << 14;
                            if(v0 < 0) {
                                v5 = v3 - v12 * v0;
                                v3 -= v0 * v10;
                                v0 = 0;
                            }
                            else {
                                v5 = v3;
                            }

                            v4 = arg25 << 14;
                            if(v1 < 0) {
                                v14 = v4 - v1 * v11;
                                v1 = 0;
                            }
                            else {
                                v14 = v4;
                            }

                            if(v0 != v1 && v12 < v10 || v1 == v0 && v12 > v11) {
                                v15 = v2 - v1;
                                v1 -= v0;
                                v0 = v9.bz[v0];
                                v17 = v3;
                                v16 = v5;
                                while(true) {
                                    v18 = v1 - 1;
                                    if(v18 >= 0) {
                                        this.ad(v9.ax, v0, arg27, 0, v16 >> 14, v17 >> 14, 0x876D6041);
                                        v16 += v12;
                                        v17 += v10;
                                        v0 += v9.at * v13;
                                        v1 = v18;
                                        continue;
                                    }

                                    break;
                                }

                                while(true) {
                                    --v15;
                                    if(v15 < 0) {
                                        return;
                                    }

                                    this.ad(v9.ax, v0, arg27, 0, v16 >> 14, v14 >> 14, -2117491490);
                                    v16 += v12;
                                    v14 += v11;
                                    v0 += v9.at * v13;
                                }

                                return;
                            }

                            v15 = v2 - v1;
                            v1 -= v0;
                            v0 = v9.bz[v0];
                            v16 = v3;
                            v17 = v5;
                            while(true) {
                                v18 = v1 - 1;
                                if(v18 >= 0) {
                                    this.ad(v9.ax, v0, arg27, 0, v16 >> 14, v17 >> 14, 0x8BF4A1F6);
                                    v17 += v12;
                                    v16 += v10;
                                    v0 += v9.at * v13;
                                    v1 = v18;
                                    continue;
                                }

                                break;
                            }

                            while(true) {
                                --v15;
                                if(v15 < 0) {
                                    return;
                                }

                                this.ad(v9.ax, v0, arg27, 0, v14 >> 14, v17 >> 14, 0x81D2190B);
                                v17 += v12;
                                v14 += v11;
                                v0 += v9.at * v13;
                            }

                            return;
                        }

                        v3 = arg24 << 14;
                        if(v0 < 0) {
                            v4 = v3 - v0 * v12;
                            v3 -= v0 * v10;
                            v0 = 0;
                        }
                        else {
                            v4 = v3;
                        }

                        v5 = arg26 << 14;
                        if(v2 < 0) {
                            v14 = v5 - v2 * v11;
                            v2 = 0;
                        }
                        else {
                            v14 = v5;
                        }

                        if(v0 != v2 && v12 < v10 || v0 == v2 && v11 > v10) {
                            v15 = v1 - v2;
                            v2 -= v0;
                            v0 = v9.bz[v0];
                            v17 = v3;
                            v16 = v4;
                            while(true) {
                                v18 = v2 - 1;
                                if(v18 >= 0) {
                                    this.ad(v9.ax, v0, arg27, 0, v16 >> 14, v17 >> 14, 0x939EB260);
                                    v16 += v12;
                                    v17 += v10;
                                    v0 += v9.at * v13;
                                    v2 = v18;
                                    continue;
                                }

                                break;
                            }

                            while(true) {
                                --v15;
                                if(v15 < 0) {
                                    return;
                                }

                                this.ad(v9.ax, v0, arg27, 0, v14 >> 14, v17 >> 14, -1709474253);
                                v14 += v11;
                                v17 += v10;
                                v0 += v9.at * v13;
                            }

                            return;
                        }

                        v15 = v1 - v2;
                        v2 -= v0;
                        v0 = v9.bz[v0];
                        v16 = v3;
                        v17 = v4;
                        while(true) {
                            v18 = v2 - 1;
                            if(v18 >= 0) {
                                this.ad(v9.ax, v0, arg27, 0, v16 >> 14, v17 >> 14, 0x8BF69B7E);
                                v17 += v12;
                                v16 += v10;
                                v0 += v9.at * v13;
                                v2 = v18;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v15;
                            if(v15 < 0) {
                                return;
                            }

                            this.ad(v9.ax, v0, arg27, 0, v16 >> 14, v14 >> 14, 0x864DEFDD);
                            v14 += v11;
                            v16 += v10;
                            v0 += v9.at * v13;
                        }

                        return;
                    }
                }

                if(v1 <= v2) {
                    if(v1 >= v9.bt * v7) {
                        return;
                    }

                    if(v2 > v9.bt * v7) {
                        v2 = v9.bt * v7;
                    }

                    if(v0 > v9.bt * v7) {
                        v0 = v9.bt * v7;
                    }

                    if(v2 < v0) {
                        v3 = arg25 << 14;
                        if(v1 < 0) {
                            v4 = v3 - v10 * v1;
                            v3 -= v1 * v11;
                            v1 = 0;
                            v19 = v4;
                            v4 = v3;
                            v3 = v19;
                        }
                        else {
                            v4 = v3;
                        }

                        v5 = arg26 << 14;
                        if(v2 < 0) {
                            v14 = v5 - v2 * v12;
                            v2 = 0;
                        }
                        else {
                            v14 = v5;
                        }

                        if(v1 != v2 && v10 < v11 || v1 == v2 && v10 > v12) {
                            v0 -= v2;
                            v2 -= v1;
                            v15 = v9.bz[v1];
                            v16 = v3;
                            v17 = v4;
                            while(true) {
                                v18 = v2 - 1;
                                if(v18 >= 0) {
                                    this.ad(v9.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, -1669059996);
                                    v16 += v10;
                                    v17 += v11;
                                    v15 += v9.at * v13;
                                    v2 = v18;
                                    continue;
                                }

                                break;
                            }

                            while(true) {
                                --v0;
                                if(v0 < 0) {
                                    return;
                                }

                                this.ad(v9.ax, v15, arg27, 0, v16 >> 14, v14 >> 14, -1808966859);
                                v16 += v10;
                                v14 += v12;
                                v15 += v9.at * v13;
                            }

                            return;
                        }

                        v0 -= v2;
                        v2 -= v1;
                        v15 = v9.bz[v1];
                        v17 = v3;
                        v16 = v4;
                        while(true) {
                            v18 = v2 - 1;
                            if(v18 >= 0) {
                                this.ad(v9.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, 0x8BF66ABD);
                                v17 += v10;
                                v16 += v11;
                                v15 += v9.at * v13;
                                v2 = v18;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v0;
                            if(v0 < 0) {
                                return;
                            }

                            this.ad(v9.ax, v15, arg27, 0, v14 >> 14, v17 >> 14, -2025864670);
                            v17 += v10;
                            v14 += v12;
                            v15 += v9.at * v13;
                        }

                        return;
                    }

                    v4 = arg25 << 14;
                    if(v1 < 0) {
                        v5 = v4 - v10 * v1;
                        v4 -= v1 * v11;
                        v1 = 0;
                    }
                    else {
                        v5 = v4;
                    }

                    v3 = arg24 << 14;
                    if(v0 < 0) {
                        v14 = v3 - v0 * v12;
                        v0 = 0;
                    }
                    else {
                        v14 = v3;
                    }

                    if(v10 < v11) {
                        v15 = v2 - v0;
                        v0 -= v1;
                        v16 = v9.bz[v1];
                        v18 = v4;
                        v17 = v5;
                        while(true) {
                            --v0;
                            if(v0 >= 0) {
                                this.ad(v9.ax, v16, arg27, 0, v17 >> 14, v18 >> 14, 0x9538EE21);
                                v17 += v10;
                                v18 += v11;
                                v16 += v9.at * v13;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v15;
                            if(v15 < 0) {
                                return;
                            }

                            this.ad(v9.ax, v16, arg27, 0, v14 >> 14, v18 >> 14, -2073530339);
                            v14 += v12;
                            v18 += v11;
                            v16 += v9.at * v13;
                        }

                        return;
                    }

                    v15 = v2 - v0;
                    v0 -= v1;
                    v16 = v9.bz[v1];
                    v17 = v4;
                    v18 = v5;
                    while(true) {
                        --v0;
                        if(v0 >= 0) {
                            this.ad(v9.ax, v16, arg27, 0, v17 >> 14, v18 >> 14, 0x96BADEC9);
                            v18 += v10;
                            v17 += v11;
                            v16 += v9.at * v13;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ad(v9.ax, v16, arg27, 0, v17 >> 14, v14 >> 14, -2053235510);
                        v14 += v12;
                        v17 += v11;
                        v16 += v9.at * v13;
                    }

                    return;
                }

                if(v2 >= v9.bt * v7) {
                    return;
                }

                if(v0 > v9.bt * v7) {
                    v0 = v9.bt * v7;
                }

                if(v1 > v9.bt * v7) {
                    v1 = v9.bt * v7;
                }

                if(v0 < v1) {
                    v4 = arg26 << 14;
                    if(v2 < 0) {
                        v5 = v4 - v2 * v11;
                        v4 -= v2 * v12;
                        v2 = 0;
                        v19 = v5;
                        v5 = v4;
                        v4 = v19;
                    }
                    else {
                        v5 = v4;
                    }

                    v3 = arg24 << 14;
                    if(v0 < 0) {
                        v14 = v3 - v0 * v10;
                        v0 = 0;
                    }
                    else {
                        v14 = v3;
                    }

                    if(v11 < v12) {
                        v15 = v1 - v0;
                        v0 -= v2;
                        v16 = v9.bz[v2];
                        v17 = v4;
                        v18 = v5;
                        while(true) {
                            --v0;
                            if(v0 >= 0) {
                                this.ad(v9.ax, v16, arg27, 0, v17 >> 14, v18 >> 14, 0x9006094B);
                                v17 += v11;
                                v18 += v12;
                                v16 += v9.at * v13;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v15;
                            if(v15 < 0) {
                                return;
                            }

                            this.ad(v9.ax, v16, arg27, 0, v17 >> 14, v14 >> 14, 0x955305AD);
                            v17 += v11;
                            v14 += v10;
                            v16 += v9.at * v13;
                        }

                        return;
                    }

                    v15 = v1 - v0;
                    v0 -= v2;
                    v16 = v9.bz[v2];
                    v18 = v4;
                    v17 = v5;
                    while(true) {
                        --v0;
                        if(v0 >= 0) {
                            this.ad(v9.ax, v16, arg27, 0, v17 >> 14, v18 >> 14, 0x91FDF072);
                            v18 += v11;
                            v17 += v12;
                            v16 += v9.at * v13;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ad(v9.ax, v16, arg27, 0, v14 >> 14, v18 >> 14, -2061460096);
                        v18 += v11;
                        v14 += v10;
                        v16 += v9.at * v13;
                    }

                    return;
                }

                v3 = arg26 << 14;
                if(v2 < 0) {
                    v5 = v3 - v11 * v2;
                    v3 -= v2 * v12;
                    v2 = 0;
                    v19 = v5;
                    v5 = v3;
                    v3 = v19;
                }
                else {
                    v5 = v3;
                }

                v4 = arg25 << 14;
                if(v1 < 0) {
                    v14 = v4 - v1 * v10;
                    v1 = 0;
                }
                else {
                    v14 = v4;
                }

                if(v11 < v12) {
                    v0 -= v1;
                    v1 -= v2;
                    v15 = v9.bz[v2];
                    v16 = v3;
                    v17 = v5;
                    while(true) {
                        v18 = v1 - 1;
                        if(v18 >= 0) {
                            this.ad(v9.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, -2026869909);
                            v16 += v11;
                            v17 += v12;
                            v15 += v9.at * v13;
                            v1 = v18;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v0;
                        if(v0 < 0) {
                            return;
                        }

                        this.ad(v9.ax, v15, arg27, 0, v14 >> 14, v17 >> 14, 0x840D3809);
                        v14 += v10;
                        v17 += v12;
                        v15 += v9.at * v13;
                    }

                    return;
                }

                v0 -= v1;
                v1 -= v2;
                v15 = v9.bz[v2];
                v17 = v3;
                v16 = v5;
                while(true) {
                    v18 = v1 - 1;
                    if(v18 >= 0) {
                        this.ad(v9.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, 0x961BB9B0);
                        v17 += v11;
                        v16 += v12;
                        v15 += v9.at * v13;
                        v1 = v18;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v0;
                    if(v0 < 0) {
                        return;
                    }

                    this.ad(v9.ax, v15, arg27, 0, v16 >> 14, v14 >> 14, 0x820AAAFD);
                    v14 += v10;
                    v16 += v12;
                    v15 += v9.at * v13;
                }
            }
            catch(RuntimeException v0_1) {
                goto label_715;
            }
        }
        else {
            goto label_14;
        }

        goto label_15;
        return;
    label_715:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("bj.aj(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0_1), v1_1.toString());
    }

    final void ak(int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        int v3;
        int v2;
        if(this.ac) {
            arg10 = 1109746211;
            if(arg12 > this.by * arg10) {
                arg12 = this.by * arg10;
            }
        }

        if(0 >= arg12) {
            return;
        }

        arg8 = arg8;
        arg13 = arg13;
        arg10 = 0xE0639EEB;
        int v0 = 0xFF00FF;
        int v1 = 0xFF00;
        if(this.bf) {
            arg12 = arg12;
            arg9 = arg12 >> 2;
            arg11 = arg14 << 2;
            if(this.bn * arg10 == 0) {
                if(arg9 > 0) {
                    do {
                        arg10 = bj.aa[arg13 >> 8];
                        arg13 += arg11;
                        arg14 = arg8 + 1;
                        arg7[arg8] = arg10;
                        arg8 = arg14 + 1;
                        arg7[arg14] = arg10;
                        arg14 = arg8 + 1;
                        arg7[arg8] = arg10;
                        arg8 = arg14 + 1;
                        arg7[arg14] = arg10;
                        --arg9;
                        if(arg9 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                arg9 = arg12 & 3;
                if(arg9 <= 0) {
                    return;
                }

                arg10 = bj.aa[arg13 >> 8];
                while(true) {
                    arg11 = arg8 + 1;
                    arg7[arg8] = arg10;
                    --arg9;
                    if(arg9 <= 0) {
                        break;
                    }

                    arg8 = arg11;
                }
            }
            else {
                arg14 = this.bn * arg10;
                arg10 = 0x100 - this.bn * arg10;
                if(arg9 > 0) {
                    while(true) {
                        v2 = bj.aa[arg13 >> 8];
                        arg13 += arg11;
                        v3 = ((v2 & v0) * arg10 >> 8 & v0) + ((v2 & v1) * arg10 >> 8 & v1);
                        int v4 = arg8 + 1;
                        arg7[arg8] = ((arg7[arg8] & v1) * arg14 >> 8 & v1) + (((arg7[arg8] & v0) * arg14 >> 8 & v0) + v3);
                        v2 = v4 + 1;
                        arg7[v4] = ((arg7[v4] & v0) * arg14 >> 8 & v0) + v3 + ((arg7[v4] & v1) * arg14 >> 8 & v1);
                        v4 = v2 + 1;
                        arg7[v2] = ((arg7[v2] & v0) * arg14 >> 8 & v0) + v3 + ((arg7[v2] & v1) * arg14 >> 8 & v1);
                        v2 = v4 + 1;
                        arg7[v4] = ((arg7[v4] & v1) * arg14 >> 8 & v1) + (((arg7[v4] & v0) * arg14 >> 8 & v0) + v3);
                        --arg9;
                        if(arg9 <= 0) {
                            break;
                        }

                        arg8 = v2;
                    }

                    arg8 = v2;
                }

                arg9 = arg12 & 3;
                if(arg9 <= 0) {
                    return;
                }

                arg12 = ((bj.aa[arg13 >> 8] & v0) * arg10 >> 8 & v0) + (arg10 * (bj.aa[arg13 >> 8] & v1) >> 8 & v1);
                while(true) {
                    arg11 = arg8 + 1;
                    arg7[arg8] = ((arg7[arg8] & v1) * arg14 >> 8 & v1) + (((arg7[arg8] & v0) * arg14 >> 8 & v0) + arg12);
                    --arg9;
                    if(arg9 <= 0) {
                        break;
                    }

                    arg8 = arg11;
                }
            }

            return;
        }

        arg12 = arg12;
        if(this.bn * arg10 == 0) {
            while(true) {
                arg9 = arg8 + 1;
                arg7[arg8] = bj.aa[arg13 >> 8];
                arg13 += arg14;
                --arg12;
                if(arg12 <= 0) {
                    break;
                }

                arg8 = arg9;
            }
        }
        else {
            arg9 = this.bn * arg10;
            arg10 = 0x100 - this.bn * arg10;
            while(true) {
                arg11 = bj.aa[arg13 >> 8];
                arg13 += arg14;
                v3 = arg8 + 1;
                arg7[arg8] = ((arg7[arg8] & v0) * arg9 >> 8 & v0) + (((arg11 & v1) * arg10 >> 8 & v1) + ((arg11 & v0) * arg10 >> 8 & v0)) + ((arg7[arg8] & v1) * arg9 >> 8 & v1);
                --arg12;
                if(arg12 > 0) {
                    arg8 = v3;
                    continue;
                }

                return;
            }
        }
    }

    final void an(int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31) {
        int v5;
        int v4;
        int v7;
        bj v1 = this;
        int v0 = arg22;
        int v2 = arg23;
        int v3 = arg24;
        int v10 = arg26 - arg25;
        int v11 = v2 - v0;
        int v12 = arg27 - arg25;
        int v13 = v3 - v0;
        int v14 = arg29 - arg28;
        int v15 = arg30 - arg28;
        if(v2 != v3) {
            int v17 = arg27 - arg26 << 14;
            int v18 = v3 - v2;
            try {
                int v9 = v17 / v18;
                goto label_21;
            label_20:
                v9 = 0;
            label_21:
                int v8 = v0 != v2 ? (v10 << 14) / v11 : 0;
                int v6 = v0 != v3 ? (v12 << 14) / v13 : 0;
                v17 = v13 * v10 - v12 * v11;
                if(v17 == 0) {
                    return;
                }

                v11 = (v13 * v14 - v11 * v15 << 8) / v17;
                v10 = (v15 * v10 - v12 * v14 << 8) / v17;
                v12 = -482049717;
                v13 = 0xFEEE8863;
                if(v0 <= v2 && v0 <= v3) {
                    if(v0 >= v1.bt * v12) {
                        return;
                    }
                    else {
                        if(v2 > v1.bt * v12) {
                            v2 = v1.bt * v12;
                        }

                        if(v3 > v1.bt * v12) {
                            v3 = v1.bt * v12;
                        }

                        v7 = (arg28 << 8) - arg25 * v11 + v11;
                        if(v2 < v3) {
                            v4 = arg25 << 14;
                            if(v0 < 0) {
                                v12 = v4 - v0 * v6;
                                v4 -= v8 * v0;
                                v7 -= v0 * v10;
                                v0 = 0;
                            }
                            else {
                                v12 = v4;
                            }

                            v5 = arg26 << 14;
                            if(v2 < 0) {
                                v5 -= v2 * v9;
                                v2 = 0;
                            }

                            if(v0 != v2 && v6 < v8 || v2 == v0 && v6 > v9) {
                                v3 -= v2;
                                v2 -= v0;
                                v0 = v1.bz[v0];
                                while(true) {
                                    --v2;
                                    if(v2 >= 0) {
                                        this.ap(v1.ax, v0, 0, 0, v12 >> 14, v4 >> 14, v7, v11, -36);
                                        v12 += v6;
                                        v4 += v8;
                                        v7 += v10;
                                        v0 += v1.at * v13;
                                        continue;
                                    }

                                    break;
                                }

                                while(true) {
                                    --v3;
                                    if(v3 < 0) {
                                        return;
                                    }

                                    this.ap(v1.ax, v0, 0, 0, v12 >> 14, v5 >> 14, v7, v11, -116);
                                    v12 += v6;
                                    v5 += v9;
                                    v7 += v10;
                                    v0 += v1.at * v13;
                                }

                                return;
                            }

                            v3 -= v2;
                            v2 -= v0;
                            v0 = v1.bz[v0];
                            while(true) {
                                --v2;
                                if(v2 >= 0) {
                                    this.ap(v1.ax, v0, 0, 0, v4 >> 14, v12 >> 14, v7, v11, -77);
                                    v12 += v6;
                                    v4 += v8;
                                    v7 += v10;
                                    v0 += v1.at * v13;
                                    continue;
                                }

                                break;
                            }

                            while(true) {
                                --v3;
                                if(v3 < 0) {
                                    return;
                                }

                                this.ap(v1.ax, v0, 0, 0, v5 >> 14, v12 >> 14, v7, v11, -122);
                                v12 += v6;
                                v5 += v9;
                                v7 += v10;
                                v0 += v1.at * v13;
                            }

                            return;
                        }

                        v4 = arg25 << 14;
                        if(v0 < 0) {
                            v5 = v4 - v0 * v6;
                            v4 -= v0 * v8;
                            v12 = v7 - v0 * v10;
                            v0 = 0;
                        }
                        else {
                            v5 = v4;
                            v12 = v7;
                        }

                        v7 = v6;
                        v6 = arg27 << 14;
                        if(v3 < 0) {
                            v6 -= v3 * v9;
                            v3 = 0;
                        }

                        if(v0 != v3 && v7 < v8 || v0 == v3 && v9 > v8) {
                            v2 -= v3;
                            v3 -= v0;
                            v0 = v1.bz[v0];
                            while(true) {
                                --v3;
                                if(v3 >= 0) {
                                    this.ap(v1.ax, v0, 0, 0, v5 >> 14, v4 >> 14, v12, v11, -16);
                                    v5 += v7;
                                    v4 += v8;
                                    v12 += v10;
                                    v0 += v1.at * v13;
                                    continue;
                                }

                                break;
                            }

                            while(true) {
                                --v2;
                                if(v2 < 0) {
                                    return;
                                }

                                this.ap(v1.ax, v0, 0, 0, v6 >> 14, v4 >> 14, v12, v11, -32);
                                v6 += v9;
                                v4 += v8;
                                v12 += v10;
                                v0 += v1.at * v13;
                            }

                            return;
                        }

                        v2 -= v3;
                        v3 -= v0;
                        v0 = v1.bz[v0];
                        while(true) {
                            --v3;
                            if(v3 >= 0) {
                                this.ap(v1.ax, v0, 0, 0, v4 >> 14, v5 >> 14, v12, v11, -121);
                                v5 += v7;
                                v4 += v8;
                                v12 += v10;
                                v0 += v1.at * v13;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v2;
                            if(v2 < 0) {
                                return;
                            }

                            this.ap(v1.ax, v0, 0, 0, v4 >> 14, v6 >> 14, v12, v11, -11);
                            v6 += v9;
                            v4 += v8;
                            v12 += v10;
                            v0 += v1.at * v13;
                        }

                        return;
                    }
                }

                v7 = v6;
                if(v2 <= v3) {
                    if(v2 >= v1.bt * v12) {
                        return;
                    }

                    if(v3 > v1.bt * v12) {
                        v3 = v1.bt * v12;
                    }

                    if(v0 > v1.bt * v12) {
                        v0 = v1.bt * v12;
                    }

                    v14 = v8;
                    v8 = v0;
                    v0 = (arg29 << 8) - v11 * arg26 + v11;
                    if(v3 < v8) {
                        v4 = arg26 << 14;
                        if(v2 < 0) {
                            v5 = v4 - v2 * v14;
                            v4 -= v2 * v9;
                            v0 -= v2 * v10;
                            v2 = 0;
                        }
                        else {
                            v5 = v4;
                        }

                        v6 = arg27 << 14;
                        if(v3 < 0) {
                            v6 -= v3 * v7;
                            v3 = 0;
                        }

                        if(v3 != v2 && v14 < v9 || v3 == v2 && v14 > v7) {
                            v8 -= v3;
                            v3 -= v2;
                            v2 = v1.bz[v2];
                            while(true) {
                                --v3;
                                if(v3 >= 0) {
                                    this.ap(v1.ax, v2, 0, 0, v5 >> 14, v4 >> 14, v0, v11, -97);
                                    v5 += v14;
                                    v4 += v9;
                                    v0 += v10;
                                    v2 += v1.at * v13;
                                    continue;
                                }

                                break;
                            }

                            while(true) {
                                --v8;
                                if(v8 < 0) {
                                    return;
                                }

                                this.ap(v1.ax, v2, 0, 0, v5 >> 14, v6 >> 14, v0, v11, -73);
                                v5 += v14;
                                v6 += v7;
                                v0 += v10;
                                v2 += v1.at * v13;
                            }

                            return;
                        }

                        v8 -= v3;
                        v3 -= v2;
                        v2 = v1.bz[v2];
                        while(true) {
                            --v3;
                            if(v3 >= 0) {
                                this.ap(v1.ax, v2, 0, 0, v4 >> 14, v5 >> 14, v0, v11, -7);
                                v5 += v14;
                                v4 += v9;
                                v0 += v10;
                                v2 += v1.at * v13;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v8;
                            if(v8 < 0) {
                                return;
                            }

                            this.ap(v1.ax, v2, 0, 0, v6 >> 14, v5 >> 14, v0, v11, -46);
                            v5 += v14;
                            v6 += v7;
                            v0 += v10;
                            v2 += v1.at * v13;
                        }

                        return;
                    }

                    v5 = arg26 << 14;
                    if(v2 < 0) {
                        v6 = v5 - v2 * v14;
                        v5 -= v2 * v9;
                        v0 -= v2 * v10;
                        v2 = 0;
                    }
                    else {
                        v6 = v5;
                    }

                    v4 = arg25 << 14;
                    if(v8 < 0) {
                        v4 -= v8 * v7;
                        v8 = 0;
                    }

                    if(v14 < v9) {
                        v3 -= v8;
                        v8 -= v2;
                        v2 = v1.bz[v2];
                        while(true) {
                            --v8;
                            if(v8 >= 0) {
                                this.ap(v1.ax, v2, 0, 0, v6 >> 14, v5 >> 14, v0, v11, -8);
                                v6 += v14;
                                v5 += v9;
                                v0 += v10;
                                v2 += v1.at * v13;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v3;
                            if(v3 < 0) {
                                return;
                            }

                            this.ap(v1.ax, v2, 0, 0, v4 >> 14, v5 >> 14, v0, v11, -1);
                            v4 += v7;
                            v5 += v9;
                            v0 += v10;
                            v2 += v1.at * v13;
                        }

                        return;
                    }

                    v3 -= v8;
                    v8 -= v2;
                    v2 = v1.bz[v2];
                    while(true) {
                        --v8;
                        if(v8 >= 0) {
                            this.ap(v1.ax, v2, 0, 0, v5 >> 14, v6 >> 14, v0, v11, -117);
                            v6 += v14;
                            v5 += v9;
                            v0 += v10;
                            v2 += v1.at * v13;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v3;
                        if(v3 < 0) {
                            return;
                        }

                        this.ap(v1.ax, v2, 0, 0, v5 >> 14, v4 >> 14, v0, v11, -60);
                        v4 += v7;
                        v5 += v9;
                        v0 += v10;
                        v2 += v1.at * v13;
                    }

                    return;
                }

                v14 = v8;
                if(v3 >= v1.bt * v12) {
                    return;
                }

                if(v0 > v1.bt * v12) {
                    v0 = v1.bt * v12;
                }

                if(v2 > v1.bt * v12) {
                    v2 = v1.bt * v12;
                }

                v8 = v2;
                v2 = (arg30 << 8) - v11 * arg27 + v11;
                if(v0 < v8) {
                    v5 = arg27 << 14;
                    if(v3 < 0) {
                        v6 = v5 - v9 * v3;
                        v5 -= v3 * v7;
                        v2 -= v3 * v10;
                        v3 = 0;
                        int v20 = v6;
                        v6 = v5;
                        v5 = v20;
                    }
                    else {
                        v6 = v5;
                    }

                    v4 = arg25 << 14;
                    if(v0 < 0) {
                        v4 -= v0 * v14;
                        v0 = 0;
                    }

                    if(v9 < v7) {
                        v8 -= v0;
                        v0 -= v3;
                        v3 = v1.bz[v3];
                        while(true) {
                            --v0;
                            if(v0 >= 0) {
                                this.ap(v1.ax, v3, 0, 0, v5 >> 14, v6 >> 14, v2, v11, -71);
                                v5 += v9;
                                v6 += v7;
                                v2 += v10;
                                v3 += v1.at * v13;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v8;
                            if(v8 < 0) {
                                return;
                            }

                            this.ap(v1.ax, v3, 0, 0, v5 >> 14, v4 >> 14, v2, v11, -116);
                            v5 += v9;
                            v4 += v14;
                            v2 += v10;
                            v3 += v1.at * v13;
                        }

                        return;
                    }

                    v8 -= v0;
                    v0 -= v3;
                    v3 = v1.bz[v3];
                    while(true) {
                        --v0;
                        if(v0 >= 0) {
                            this.ap(v1.ax, v3, 0, 0, v6 >> 14, v5 >> 14, v2, v11, -40);
                            v5 += v9;
                            v6 += v7;
                            v2 += v10;
                            v3 += v1.at * v13;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v8;
                        if(v8 < 0) {
                            return;
                        }

                        this.ap(v1.ax, v3, 0, 0, v4 >> 14, v5 >> 14, v2, v11, -24);
                        v5 += v9;
                        v4 += v14;
                        v2 += v10;
                        v3 += v1.at * v13;
                    }

                    return;
                }

                v4 = arg27 << 14;
                if(v3 < 0) {
                    v6 = v4 - v9 * v3;
                    v4 -= v7 * v3;
                    v2 -= v3 * v10;
                    v3 = 0;
                }
                else {
                    v6 = v4;
                }

                v5 = arg26 << 14;
                if(v8 < 0) {
                    v5 -= v8 * v14;
                    v8 = 0;
                }

                if(v9 < v7) {
                    v0 -= v8;
                    v8 -= v3;
                    v3 = v1.bz[v3];
                    while(true) {
                        --v8;
                        if(v8 >= 0) {
                            this.ap(v1.ax, v3, 0, 0, v6 >> 14, v4 >> 14, v2, v11, -108);
                            v6 += v9;
                            v4 += v7;
                            v2 += v10;
                            v3 += v1.at * v13;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v0;
                        if(v0 < 0) {
                            return;
                        }

                        this.ap(v1.ax, v3, 0, 0, v5 >> 14, v4 >> 14, v2, v11, -80);
                        v5 += v14;
                        v4 += v7;
                        v2 += v10;
                        v3 += v1.at * v13;
                    }

                    return;
                }

                v0 -= v8;
                v8 -= v3;
                v3 = v1.bz[v3];
                while(true) {
                    --v8;
                    if(v8 >= 0) {
                        this.ap(v1.ax, v3, 0, 0, v4 >> 14, v6 >> 14, v2, v11, -43);
                        v6 += v9;
                        v4 += v7;
                        v2 += v10;
                        v3 += v1.at * v13;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v0;
                    if(v0 < 0) {
                        return;
                    }

                    this.ap(v1.ax, v3, 0, 0, v4 >> 14, v5 >> 14, v2, v11, -54);
                    v5 += v14;
                    v4 += v7;
                    v2 += v10;
                    v3 += v1.at * v13;
                }
            }
            catch(RuntimeException v0_1) {
                goto label_916;
            }
        }
        else {
            goto label_20;
        }

        goto label_21;
        return;
    label_916:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("bj.an(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    final void ao(int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36) {
        int v26;
        int v25;
        int v21;
        int v23;
        int v22;
        int v20;
        int v19;
        int v18;
        int v16;
        int v4;
        int v3;
        int v6;
        bj v10 = this;
        int v0 = arg28;
        int v1 = arg29;
        int v2 = arg30;
        int v9 = arg32 - arg31;
        int v11 = v1 - v0;
        int v12 = arg33 - arg31;
        int v13 = v2 - v0;
        int v14 = arg35 - arg34;
        int v15 = arg36 - arg34;
        int v8 = v1 != v2 ? (arg33 - arg32 << 14) / (v2 - v1) : 0;
        int v7 = v0 != v1 ? (v9 << 14) / v11 : 0;
        int v5 = v0 != v2 ? (v12 << 14) / v13 : 0;
        int v17 = v13 * v9 - v12 * v11;
        if(v17 == 0) {
            return;
        }

        v11 = (v13 * v14 - v11 * v15 << 8) / v17;
        v12 = (v15 * v9 - v12 * v14 << 8) / v17;
        v9 = -482049717;
        if(v0 <= v1 && v0 <= v2) {
            if(v0 >= v10.bt * v9) {
                return;
            }
            else {
                if(v1 > v10.bt * v9) {
                    v1 = v10.bt * v9;
                }

                if(v2 > v10.bt * v9) {
                    v2 = v10.bt * v9;
                }

                v6 = (arg34 << 8) - arg31 * v11 + v11;
                if(v1 < v2) {
                    v3 = arg31 << 14;
                    if(v0 < 0) {
                        v9 = v3 - v0 * v5;
                        v3 -= v7 * v0;
                        v6 -= v0 * v12;
                        v0 = 0;
                    }
                    else {
                        v9 = v3;
                    }

                    v4 = arg32 << 14;
                    if(v1 < 0) {
                        v14 = v4 - v1 * v8;
                        v1 = 0;
                    }
                    else {
                        v14 = v4;
                    }

                    if(v0 != v1 && v5 < v7 || v1 == v0 && v5 > v8) {
                        v15 = v2 - v1;
                        v1 -= v0;
                        v16 = v10.bz[v0];
                        v18 = v3;
                        v19 = v6;
                        v17 = v9;
                        while(true) {
                            v20 = v1 - 1;
                            if(v20 < 0) {
                                break;
                            }

                            this.ap(v10.ax, v16, 0, 0, v17 >> 14, v18 >> 14, v19, v11, -58);
                            v17 += v5;
                            v18 += v7;
                            v19 += v12;
                            v16 += v10.at * 0xFEEE8863;
                            v5 = v5;
                            v7 = v7;
                            v1 = v20;
                            v8 = v8;
                            v14 = v14;
                        }

                        v13 = v5;
                        v22 = v8;
                        v23 = v14;
                        while(true) {
                            --v15;
                            if(v15 < 0) {
                                return;
                            }

                            this.ap(v10.ax, v16, 0, 0, v17 >> 14, v23 >> 14, v19, v11, -72);
                            v17 += v13;
                            v23 += v22;
                            v19 += v12;
                            v16 += v10.at * 0xFEEE8863;
                        }

                        return;
                    }

                    v13 = v5;
                    v23 = v14;
                    v14 = v7;
                    v15 = v2 - v1;
                    v1 -= v0;
                    v16 = v10.bz[v0];
                    v17 = v3;
                    v19 = v6;
                    v18 = v9;
                    while(true) {
                        v20 = v1 - 1;
                        if(v20 < 0) {
                            break;
                        }

                        this.ap(v10.ax, v16, 0, 0, v17 >> 14, v18 >> 14, v19, v11, -105);
                        v18 += v13;
                        v17 += v14;
                        v19 += v12;
                        v16 += v10.at * 0xFEEE8863;
                        v1 = v20;
                        v8 = v8;
                    }

                    int v24;
                    for(v24 = v8; true; v24 = v24) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ap(v10.ax, v16, 0, 0, v23 >> 14, v18 >> 14, v19, v11, -53);
                        v18 += v13;
                        v23 += v24;
                        v19 += v12;
                        v16 += v10.at * 0xFEEE8863;
                    }

                    return;
                }

                v13 = v5;
                v14 = v7;
                v9 = v8;
                v3 = arg31 << 14;
                if(v0 < 0) {
                    v4 = v3 - v0 * v13;
                    v3 -= v0 * v14;
                    v6 -= v0 * v12;
                    v0 = 0;
                }
                else {
                    v4 = v3;
                }

                v5 = arg33 << 14;
                if(v2 < 0) {
                    v15 = v5 - v2 * v9;
                    v2 = 0;
                }
                else {
                    v15 = v5;
                }

                if(v0 != v2 && v13 < v14 || v0 == v2 && v9 > v14) {
                    v16 = v1 - v2;
                    v2 -= v0;
                    v17 = v10.bz[v0];
                    v19 = v3;
                    v18 = v4;
                    v20 = v6;
                    while(true) {
                        v21 = v2 - 1;
                        if(v21 < 0) {
                            break;
                        }

                        this.ap(v10.ax, v17, 0, 0, v18 >> 14, v19 >> 14, v20, v11, -43);
                        v18 += v13;
                        v19 += v14;
                        v20 += v12;
                        v17 += v10.at * 0xFEEE8863;
                        v9 = v9;
                        v2 = v21;
                        v15 = v15;
                    }

                    v25 = v15;
                    v15 = v9;
                    while(true) {
                        --v16;
                        if(v16 < 0) {
                            return;
                        }

                        this.ap(v10.ax, v17, 0, 0, v25 >> 14, v19 >> 14, v20, v11, -118);
                        v25 += v15;
                        v19 += v14;
                        v20 += v12;
                        v17 += v10.at * 0xFEEE8863;
                    }

                    return;
                }

                v25 = v15;
                v15 = v9;
                v16 = v1 - v2;
                v2 -= v0;
                v17 = v10.bz[v0];
                v18 = v3;
                v19 = v4;
                v20 = v6;
                while(true) {
                    v21 = v2 - 1;
                    if(v21 >= 0) {
                        this.ap(v10.ax, v17, 0, 0, v18 >> 14, v19 >> 14, v20, v11, -104);
                        v19 += v13;
                        v18 += v14;
                        v20 += v12;
                        v17 += v10.at * 0xFEEE8863;
                        v2 = v21;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v16;
                    if(v16 < 0) {
                        return;
                    }

                    this.ap(v10.ax, v17, 0, 0, v18 >> 14, v25 >> 14, v20, v11, -8);
                    v25 += v15;
                    v18 += v14;
                    v20 += v12;
                    v17 += v10.at * 0xFEEE8863;
                }

                return;
            }
        }

        v13 = v5;
        v14 = v7;
        v15 = v8;
        if(v1 <= v2) {
            if(v1 >= v10.bt * v9) {
                return;
            }

            if(v2 > v10.bt * v9) {
                v2 = v10.bt * v9;
            }

            if(v0 > v10.bt * v9) {
                v0 = v10.bt * v9;
            }

            v6 = v0;
            v0 = (arg35 << 8) - v11 * arg32 + v11;
            if(v2 < v6) {
                v3 = arg32 << 14;
                if(v1 < 0) {
                    v4 = v3 - v1 * v14;
                    v3 -= v1 * v15;
                    v0 -= v1 * v12;
                    v1 = 0;
                    v26 = v4;
                    v4 = v0;
                    v0 = v3;
                    v3 = v26;
                }
                else {
                    v4 = v0;
                    v0 = v3;
                }

                v5 = arg33 << 14;
                if(v2 < 0) {
                    v16 = v5 - v2 * v13;
                    v2 = 0;
                }
                else {
                    v16 = v5;
                }

                if(v2 != v1 && v14 < v15 || v2 == v1 && v14 > v13) {
                    v17 = v6 - v2;
                    v2 -= v1;
                    v20 = v0;
                    v18 = v10.bz[v1];
                    v19 = v3;
                    v21 = v4;
                    while(true) {
                        v22 = v2 - 1;
                        if(v22 >= 0) {
                            this.ap(v10.ax, v18, 0, 0, v19 >> 14, v20 >> 14, v21, v11, -84);
                            v19 += v14;
                            v20 += v15;
                            v21 += v12;
                            v18 += v10.at * 0xFEEE8863;
                            v2 = v22;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v17;
                        if(v17 < 0) {
                            return;
                        }

                        this.ap(v10.ax, v18, 0, 0, v19 >> 14, v16 >> 14, v21, v11, -7);
                        v19 += v14;
                        v16 += v13;
                        v21 += v12;
                        v18 += v10.at * 0xFEEE8863;
                    }

                    return;
                }

                v17 = v6 - v2;
                v2 -= v1;
                v19 = v0;
                v18 = v10.bz[v1];
                v20 = v3;
                v21 = v4;
                while(true) {
                    v22 = v2 - 1;
                    if(v22 >= 0) {
                        this.ap(v10.ax, v18, 0, 0, v19 >> 14, v20 >> 14, v21, v11, -30);
                        v20 += v14;
                        v19 += v15;
                        v21 += v12;
                        v18 += v10.at * 0xFEEE8863;
                        v2 = v22;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v17;
                    if(v17 < 0) {
                        return;
                    }

                    this.ap(v10.ax, v18, 0, 0, v16 >> 14, v20 >> 14, v21, v11, -59);
                    v20 += v14;
                    v16 += v13;
                    v21 += v12;
                    v18 += v10.at * 0xFEEE8863;
                }

                return;
            }

            v4 = arg32 << 14;
            if(v1 < 0) {
                v5 = v4 - v1 * v14;
                v4 -= v1 * v15;
                v0 -= v1 * v12;
                v1 = 0;
            }
            else {
                v5 = v4;
            }

            v3 = arg31 << 14;
            if(v6 < 0) {
                v16 = v3 - v6 * v13;
                v6 = 0;
            }
            else {
                v16 = v3;
            }

            if(v14 < v15) {
                v17 = v2 - v6;
                v6 -= v1;
                v21 = v0;
                v18 = v10.bz[v1];
                v20 = v4;
                v19 = v5;
                while(true) {
                    v22 = v6 - 1;
                    if(v22 >= 0) {
                        this.ap(v10.ax, v18, 0, 0, v19 >> 14, v20 >> 14, v21, v11, -78);
                        v19 += v14;
                        v20 += v15;
                        v21 += v12;
                        v18 += v10.at * 0xFEEE8863;
                        v6 = v22;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v17;
                    if(v17 < 0) {
                        return;
                    }

                    this.ap(v10.ax, v18, 0, 0, v16 >> 14, v20 >> 14, v21, v11, -97);
                    v16 += v13;
                    v20 += v15;
                    v21 += v12;
                    v18 += v10.at * 0xFEEE8863;
                }

                return;
            }

            v17 = v2 - v6;
            v6 -= v1;
            v21 = v0;
            v18 = v10.bz[v1];
            v19 = v4;
            v20 = v5;
            while(true) {
                v22 = v6 - 1;
                if(v22 >= 0) {
                    this.ap(v10.ax, v18, 0, 0, v19 >> 14, v20 >> 14, v21, v11, -54);
                    v20 += v14;
                    v19 += v15;
                    v21 += v12;
                    v18 += v10.at * 0xFEEE8863;
                    v6 = v22;
                    continue;
                }

                break;
            }

            while(true) {
                --v17;
                if(v17 < 0) {
                    return;
                }

                this.ap(v10.ax, v18, 0, 0, v19 >> 14, v16 >> 14, v21, v11, -79);
                v16 += v13;
                v19 += v15;
                v21 += v12;
                v18 += v10.at * 0xFEEE8863;
            }

            return;
        }

        if(v2 >= v10.bt * v9) {
            return;
        }

        if(v0 > v10.bt * v9) {
            v0 = v10.bt * v9;
        }

        if(v1 > v10.bt * v9) {
            v1 = v10.bt * v9;
        }

        v6 = v1;
        v1 = (arg36 << 8) - v11 * arg33 + v11;
        if(v0 < v6) {
            v4 = arg33 << 14;
            if(v2 < 0) {
                v5 = v4 - v15 * v2;
                v4 -= v2 * v13;
                v1 -= v2 * v12;
                v2 = 0;
                v26 = v5;
                v5 = v1;
                v1 = v4;
                v4 = v26;
            }
            else {
                v5 = v1;
                v1 = v4;
            }

            v3 = arg31 << 14;
            if(v0 < 0) {
                v16 = v3 - v0 * v14;
                v0 = 0;
            }
            else {
                v16 = v3;
            }

            if(v15 < v13) {
                v17 = v6 - v0;
                v0 -= v2;
                v20 = v1;
                v18 = v10.bz[v2];
                v19 = v4;
                v21 = v5;
                while(true) {
                    v22 = v0 - 1;
                    if(v22 >= 0) {
                        this.ap(v10.ax, v18, 0, 0, v19 >> 14, v20 >> 14, v21, v11, -19);
                        v19 += v15;
                        v20 += v13;
                        v21 += v12;
                        v18 += v10.at * 0xFEEE8863;
                        v0 = v22;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v17;
                    if(v17 < 0) {
                        return;
                    }

                    this.ap(v10.ax, v18, 0, 0, v19 >> 14, v16 >> 14, v21, v11, -102);
                    v19 += v15;
                    v16 += v14;
                    v21 += v12;
                    v18 += v10.at * 0xFEEE8863;
                }

                return;
            }

            v17 = v6 - v0;
            v0 -= v2;
            v19 = v1;
            v18 = v10.bz[v2];
            v20 = v4;
            v21 = v5;
            while(true) {
                v22 = v0 - 1;
                if(v22 >= 0) {
                    this.ap(v10.ax, v18, 0, 0, v19 >> 14, v20 >> 14, v21, v11, -68);
                    v20 += v15;
                    v19 += v13;
                    v21 += v12;
                    v18 += v10.at * 0xFEEE8863;
                    v0 = v22;
                    continue;
                }

                break;
            }

            while(true) {
                --v17;
                if(v17 < 0) {
                    return;
                }

                this.ap(v10.ax, v18, 0, 0, v16 >> 14, v20 >> 14, v21, v11, -57);
                v20 += v15;
                v16 += v14;
                v21 += v12;
                v18 += v10.at * 0xFEEE8863;
            }

            return;
        }

        v3 = arg33 << 14;
        if(v2 < 0) {
            v5 = v3 - v15 * v2;
            v3 -= v13 * v2;
            v1 -= v2 * v12;
            v2 = 0;
            v26 = v5;
            v5 = v1;
            v1 = v3;
            v3 = v26;
        }
        else {
            v5 = v1;
            v1 = v3;
        }

        v4 = arg32 << 14;
        if(v6 < 0) {
            v16 = v4 - v14 * v6;
            v6 = 0;
        }
        else {
            v16 = v4;
        }

        if(v15 < v13) {
            v17 = v0 - v6;
            v6 -= v2;
            v18 = v10.bz[v2];
            v20 = v1;
            v19 = v3;
            v21 = v5;
            while(true) {
                v22 = v6 - 1;
                if(v22 >= 0) {
                    this.ap(v10.ax, v18, 0, 0, v19 >> 14, v20 >> 14, v21, v11, -14);
                    v19 += v15;
                    v20 += v13;
                    v21 += v12;
                    v18 += v10.at * 0xFEEE8863;
                    v6 = v22;
                    continue;
                }

                break;
            }

            while(true) {
                --v17;
                if(v17 < 0) {
                    return;
                }

                this.ap(v10.ax, v18, 0, 0, v16 >> 14, v20 >> 14, v21, v11, -16);
                v16 += v14;
                v20 += v13;
                v21 += v12;
                v18 += v10.at * 0xFEEE8863;
            }

            return;
        }

        v17 = v0 - v6;
        v6 -= v2;
        v18 = v10.bz[v2];
        v19 = v1;
        v20 = v3;
        v21 = v5;
        while(true) {
            v22 = v6 - 1;
            if(v22 >= 0) {
                this.ap(v10.ax, v18, 0, 0, v19 >> 14, v20 >> 14, v21, v11, -12);
                v20 += v15;
                v19 += v13;
                v21 += v12;
                v18 += v10.at * 0xFEEE8863;
                v6 = v22;
                continue;
            }

            break;
        }

        while(true) {
            --v17;
            if(v17 < 0) {
                return;
            }

            this.ap(v10.ax, v18, 0, 0, v19 >> 14, v16 >> 14, v21, v11, -47);
            v16 += v14;
            v19 += v13;
            v21 += v12;
            v18 += v10.at * 0xFEEE8863;
        }
    }

    final void ap(int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, byte arg14) {
        int v2;
        int v1;
        try {
            if(this.ac) {
                arg9 = 1109746211;
                if(arg11 > this.by * arg9) {
                    arg11 = this.by * arg9;
                }

                if(arg10 >= 0) {
                }
            }

            if(0 >= arg11) {
                return;
            }

            arg7 = arg7;
            arg12 = arg12;
            arg9 = 0xE0639EEB;
            int v14 = 0xFF00FF;
            int v0 = 0xFF00;
            if(this.bf) {
                arg11 = arg11;
                arg8 = arg11 >> 2;
                arg10 = arg13 << 2;
                if(this.bn * arg9 == 0) {
                    if(arg8 > 0) {
                        do {
                            arg9 = bj.aa[arg12 >> 8];
                            arg12 += arg10;
                            arg13 = arg7 + 1;
                            arg6[arg7] = arg9;
                            arg7 = arg13 + 1;
                            arg6[arg13] = arg9;
                            arg13 = arg7 + 1;
                            arg6[arg7] = arg9;
                            arg7 = arg13 + 1;
                            arg6[arg13] = arg9;
                            --arg8;
                            if(arg8 > 0) {
                                continue;
                            }

                            break;
                        }
                        while(true);
                    }

                    arg8 = arg11 & 3;
                    if(arg8 <= 0) {
                        return;
                    }

                    arg9 = bj.aa[arg12 >> 8];
                    while(true) {
                        arg10 = arg7 + 1;
                        arg6[arg7] = arg9;
                        --arg8;
                        if(arg8 <= 0) {
                            break;
                        }

                        arg7 = arg10;
                    }
                }
                else {
                    arg13 = this.bn * arg9;
                    arg9 = 0x100 - this.bn * arg9;
                    if(arg8 > 0) {
                        while(true) {
                            v1 = bj.aa[arg12 >> 8];
                            arg12 += arg10;
                            v2 = ((v1 & v14) * arg9 >> 8 & v14) + ((v1 & v0) * arg9 >> 8 & v0);
                            int v3 = arg7 + 1;
                            arg6[arg7] = ((arg6[arg7] & v0) * arg13 >> 8 & v0) + (((arg6[arg7] & v14) * arg13 >> 8 & v14) + v2);
                            v1 = v3 + 1;
                            arg6[v3] = ((arg6[v3] & v14) * arg13 >> 8 & v14) + v2 + ((arg6[v3] & v0) * arg13 >> 8 & v0);
                            v3 = v1 + 1;
                            arg6[v1] = ((arg6[v1] & v14) * arg13 >> 8 & v14) + v2 + ((arg6[v1] & v0) * arg13 >> 8 & v0);
                            v1 = v3 + 1;
                            arg6[v3] = ((arg6[v3] & v0) * arg13 >> 8 & v0) + (((arg6[v3] & v14) * arg13 >> 8 & v14) + v2);
                            --arg8;
                            if(arg8 <= 0) {
                                break;
                            }

                            arg7 = v1;
                        }

                        arg7 = v1;
                    }

                    arg8 = arg11 & 3;
                    if(arg8 <= 0) {
                        return;
                    }

                    arg11 = ((bj.aa[arg12 >> 8] & v14) * arg9 >> 8 & v14) + (arg9 * (bj.aa[arg12 >> 8] & v0) >> 8 & v0);
                    while(true) {
                        arg10 = arg7 + 1;
                        arg6[arg7] = ((arg6[arg7] & v0) * arg13 >> 8 & v0) + (((arg6[arg7] & v14) * arg13 >> 8 & v14) + arg11);
                        --arg8;
                        if(arg8 <= 0) {
                            break;
                        }

                        arg7 = arg10;
                    }
                }

                return;
            }

            arg11 = arg11;
            if(this.bn * arg9 == 0) {
                while(true) {
                    arg8 = arg7 + 1;
                    arg6[arg7] = bj.aa[arg12 >> 8];
                    arg12 += arg13;
                    --arg11;
                    if(arg11 <= 0) {
                        break;
                    }

                    arg7 = arg8;
                }
            }
            else {
                arg8 = this.bn * arg9;
                arg9 = 0x100 - this.bn * arg9;
                while(true) {
                label_184:
                    arg10 = bj.aa[arg12 >> 8];
                    arg12 += arg13;
                    v2 = arg7 + 1;
                    arg6[arg7] = ((arg6[arg7] & v14) * arg8 >> 8 & v14) + (((arg10 & v0) * arg9 >> 8 & v0) + ((arg10 & v14) * arg9 >> 8 & v14)) + ((arg6[arg7] & v0) * arg8 >> 8 & v0);
                    --arg11;
                    if(arg11 > 0) {
                        goto label_213;
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v6) {
            goto label_217;
        }

    label_213:
        arg7 = v2;
        goto label_184;
    label_217:
        StringBuilder v7 = new StringBuilder();
        v7.append("bj.ap(");
        v7.append(')');
        throw lx.al(((Throwable)v6), v7.toString());
    }

    final void aq(int arg53, int arg54, int arg55, int arg56, int arg57, int arg58, int arg59, int arg60, int arg61, int arg62, int arg63, int arg64, int arg65, int arg66, int arg67, int arg68, int arg69, int arg70, int arg71, byte arg72) {
        int v46;
        int v45;
        int v44;
        int v43;
        int v16;
        int v42;
        int v51;
        int v39;
        int v11;
        int v35;
        int v36;
        int v12;
        int v4;
        int v10;
        bj v1 = this;
        int v0 = arg53;
        int v2 = arg54;
        int v3 = arg55;
        int v7 = arg59;
        int v8 = arg60;
        int v9 = arg61;
        int v13 = arg71;
        try {
            int[] v14 = ii.au.ae(v13, 57);
            if(v14 == null) {
                v10 = ii.au.ar(v13, 1270535618);
                this.an(arg53, arg54, arg55, arg56, arg57, arg58, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
                return;
            }

            int[] v17 = v14;
            v1.ba = ii.au.ap(v13, -1948462034);
            v1.bd = ii.au.an(v13, 0xBCF2A2B9);
            v13 = arg57 - arg56;
            int v14_1 = v2 - v0;
            int v15 = arg58 - arg56;
            int v18 = v3 - v0;
            int v19 = v8 - v7;
            int v20 = v9 - v7;
            v9 = v0 != v2 ? (v13 << 14) / v14_1 : 0;
            int v21 = 14;
            v8 = v2 != v3 ? (arg58 - arg57 << 14) / (v3 - v2) : 0;
            int v6 = v0 != v3 ? (arg56 - arg58 << 14) / (v0 - v3) : 0;
            int v22 = v18 * v13 - v15 * v14_1;
            if(v22 == 0) {
                return;
            }

            v14_1 = (v18 * v19 - v14_1 * v20 << 9) / v22;
            v13 = (v20 * v13 - v19 * v15 << 9) / v22;
            v15 = arg62 - arg63;
            v18 = arg65 - arg66;
            v19 = arg68 - arg69;
            v20 = arg64 - arg62;
            v22 = arg67 - arg65;
            int v23 = arg70 - arg68;
            int v24 = arg65 * v20 - v22 * arg62 << 14;
            int v27 = v8;
            int v28 = v9;
            int v29 = v6;
            int v30 = ((int)(((((long)(v22 * arg68 - arg65 * v23))) << 3 << v21) / (((long)(v1.bp * 574766503)))));
            int v31 = ((int)(((((long)(v23 * arg62 - v20 * arg68))) << v21) / (((long)(v1.bp * 574766503)))));
            int v32 = v15 * arg65 - v18 * arg62 << 14;
            int v5 = ((int)(((((long)(v18 * arg68 - arg65 * v19))) << 3 << v21) / (((long)(v1.bp * 574766503)))));
            v6 = ((int)(((((long)(v19 * arg62 - arg68 * v15))) << v21) / (((long)(v1.bp * 574766503)))));
            int v33 = v20 * v18 - v22 * v15 << 14;
            int v34 = ((int)(((((long)(v22 * v19 - v18 * v23))) << 3 << v21) / (((long)(v1.bp * 574766503)))));
            v8 = ((int)(((((long)(v15 * v23 - v19 * v20))) << v21) / (((long)(v1.bp * 574766503)))));
            v9 = 0xF7F729AF;
            v10 = -482049717;
            if(v0 <= v2 && v0 <= v3) {
                if(v0 >= v1.bt * v10) {
                    return;
                }
                else {
                    if(v2 > v1.bt * v10) {
                        v2 = v1.bt * v10;
                    }

                    v15 = v2;
                    v2 = v3 > v1.bt * v10 ? v1.bt * v10 : v3;
                    v3 = (v7 << 9) - arg56 * v14_1 + v14_1;
                    if(v15 >= v2) {
                        goto label_404;
                    }

                    v4 = arg56 << 14;
                    if(v0 < 0) {
                        v7 = v4 - v29 * v0;
                        v4 -= v28 * v0;
                        v10 = v3 - v0 * v13;
                        v3 = v7;
                        v0 = 0;
                    }
                    else {
                        v10 = v3;
                        v3 = v4;
                    }

                    v7 = arg57 << 14;
                    if(v15 < 0) {
                        v7 -= v27 * v15;
                        v15 = 0;
                    }

                    v9 = v0 - v1.bo * v9;
                    v24 += v9 * v31;
                    v12 = v32 + v6 * v9;
                    v9 = v33 + v9 * v8;
                    if(v15 != v0) {
                        v36 = v9;
                        v35 = v10;
                        v10 = v28;
                        v9 = v29;
                        if(v9 >= v10) {
                            goto label_244;
                        }
                        else {
                            v11 = v27;
                        }
                    }
                    else {
                        v36 = v9;
                        v35 = v10;
                        v10 = v28;
                        v9 = v29;
                    label_244:
                        if(v0 == v15) {
                            v11 = v27;
                            if(v9 > v11) {
                                goto label_247;
                            }
                        }
                        else {
                            goto label_325;
                        }

                        goto label_326;
                    }

                label_247:
                    v2 -= v15;
                    v15 -= v0;
                    int v37 = v2;
                    v0 = v1.bz[v0];
                    while(true) {
                        --v15;
                        if(v15 >= 0) {
                            this.ah(v1.ax, v17, 0, 0, v0, v3 >> 14, v4 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 1);
                            v3 += v9;
                            v4 += v10;
                            v35 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v12 += v6;
                            v36 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v37;
                        if(v37 < 0) {
                            return;
                        }

                        this.ah(v1.ax, v17, 0, 0, v0, v3 >> 14, v7 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 1);
                        v3 += v9;
                        v7 += v11;
                        v35 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v36 += v8;
                    }

                    return;
                label_325:
                    v11 = v27;
                label_326:
                    v2 -= v15;
                    v15 -= v0;
                    int v38 = v2;
                    v0 = v1.bz[v0];
                    while(true) {
                        --v15;
                        if(v15 >= 0) {
                            this.ah(v1.ax, v17, 0, 0, v0, v4 >> 14, v3 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 1);
                            v3 += v9;
                            v4 += v10;
                            v35 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v12 += v6;
                            v36 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v38;
                        if(v38 < 0) {
                            return;
                        }

                        this.ah(v1.ax, v17, 0, 0, v0, v7 >> 14, v3 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 1);
                        v3 += v9;
                        v7 += v11;
                        v35 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v36 += v8;
                    }

                    return;
                label_404:
                    v11 = v27;
                    v10 = v28;
                    v9 = v29;
                    v12 = 0xF7F729AF;
                    v4 = arg56 << 14;
                    if(v0 < 0) {
                        v7 = v4 - v0 * v9;
                        v4 -= v0 * v10;
                        v18 = v3 - v0 * v13;
                        v0 = v9;
                        v3 = 0;
                    }
                    else {
                        v18 = v3;
                        v7 = v4;
                        v3 = v0;
                        v0 = v9;
                    }

                    v9 = arg58 << 14;
                    if(v2 < 0) {
                        v9 -= v2 * v11;
                        v39 = v4;
                        v2 = 0;
                    }
                    else {
                        v39 = v4;
                    }

                    v4 = v3 - v1.bo * v12;
                    v24 += v31 * v4;
                    v12 = v32 + v6 * v4;
                    v4 = v33 + v4 * v8;
                    if(v2 != v3 && v0 < v10 || v3 == v2 && v11 > v10) {
                        v15 -= v2;
                        int v40 = v2 - v3;
                        v2 = v1.bz[v3];
                        while(true) {
                            --v40;
                            if(v40 >= 0) {
                                this.ah(v1.ax, v17, 0, 0, v2, v7 >> 14, v39 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 1);
                                v7 += v0;
                                v39 += v10;
                                v18 += v13;
                                v2 += v1.at * 0xFEEE8863;
                                v24 += v31;
                                v12 += v6;
                                v4 += v8;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v15;
                            if(v15 < 0) {
                                return;
                            }

                            this.ah(v1.ax, v17, 0, 0, v2, v9 >> 14, v39 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 1);
                            v9 += v11;
                            v39 += v10;
                            v18 += v13;
                            v2 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v12 += v6;
                            v4 += v8;
                        }

                        return;
                    }

                    v15 -= v2;
                    int v41 = v2 - v3;
                    v2 = v1.bz[v3];
                    while(true) {
                        --v41;
                        if(v41 >= 0) {
                            this.ah(v1.ax, v17, 0, 0, v2, v39 >> 14, v7 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 1);
                            v7 += v0;
                            v39 += v10;
                            v18 += v13;
                            v2 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v12 += v6;
                            v4 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ah(v1.ax, v17, 0, 0, v2, v39 >> 14, v9 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 1);
                        v9 += v11;
                        v39 += v10;
                        v18 += v13;
                        v2 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v4 += v8;
                    }

                    return;
                }
            }

            v11 = v27;
            v10 = v28;
            v15 = v29;
            v18 = -482049717;
            if(v2 <= v3) {
                if(v2 >= v1.bt * v18) {
                    return;
                }

                if(v3 > v1.bt * v18) {
                    v3 = v1.bt * v18;
                }

                if(v0 > v1.bt * v18) {
                    v0 = v1.bt * v18;
                }

                v12 = v11;
                v11 = v0;
                v0 = (arg60 << 9) - arg57 * v14_1 + v14_1;
                if(v3 < v11) {
                    v4 = arg57 << 14;
                    if(v2 < 0) {
                        v7 = v4 - v10 * v2;
                        v4 -= v2 * v12;
                        v0 -= v2 * v13;
                        v2 = 0;
                        v51 = v7;
                        v7 = v0;
                        v0 = v4;
                        v4 = v51;
                    }
                    else {
                        v7 = v0;
                        v0 = v4;
                    }

                    v9 = arg58 << 14;
                    if(v3 < 0) {
                        v9 -= v3 * v15;
                        v42 = v0;
                        v3 = 0;
                    }
                    else {
                        v42 = v0;
                    }

                    v0 = v2 - v1.bo * 0xF7F729AF;
                    v24 += v0 * v31;
                    v16 = v32 + v6 * v0;
                    v0 = v33 + v0 * v8;
                    if(v3 != v2 && v10 < v12 || v3 == v2 && v10 > v15) {
                        v11 -= v3;
                        v3 -= v2;
                        v43 = v0;
                        v0 = v1.bz[v2];
                        while(true) {
                            --v3;
                            if(v3 >= 0) {
                                this.ah(v1.ax, v17, 0, 0, v0, v4 >> 14, v42 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 1);
                                v4 += v10;
                                v42 += v12;
                                v7 += v13;
                                v0 += v1.at * 0xFEEE8863;
                                v24 += v31;
                                v16 += v6;
                                v43 += v8;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v11;
                            if(v11 < 0) {
                                return;
                            }

                            this.ah(v1.ax, v17, 0, 0, v0, v4 >> 14, v9 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 1);
                            v4 += v10;
                            v9 += v15;
                            v7 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v6;
                            v43 += v8;
                        }

                        return;
                    }

                    v43 = v0;
                    v11 -= v3;
                    v3 -= v2;
                    v0 = v1.bz[v2];
                    while(true) {
                        --v3;
                        if(v3 >= 0) {
                            this.ah(v1.ax, v17, 0, 0, v0, v42 >> 14, v4 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 1);
                            v4 += v10;
                            v42 += v12;
                            v7 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v6;
                            v43 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v11;
                        if(v11 < 0) {
                            return;
                        }

                        this.ah(v1.ax, v17, 0, 0, v0, v9 >> 14, v4 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 1);
                        v4 += v10;
                        v9 += v15;
                        v7 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v43 += v8;
                    }

                    return;
                }

                v7 = arg57 << 14;
                if(v2 < 0) {
                    v9 = v7 - v2 * v10;
                    v7 -= v2 * v12;
                    v0 -= v2 * v13;
                    v2 = 0;
                }
                else {
                    v9 = v7;
                }

                v4 = arg56 << 14;
                if(v11 < 0) {
                    v4 -= v11 * v15;
                    v44 = v0;
                    v11 = 0;
                }
                else {
                    v44 = v0;
                }

                v0 = v2 - v1.bo * 0xF7F729AF;
                v24 += v0 * v31;
                v16 = v32 + v6 * v0;
                v0 = v33 + v0 * v8;
                if(v10 < v12) {
                    v3 -= v11;
                    v11 -= v2;
                    v45 = v0;
                    v0 = v1.bz[v2];
                    while(true) {
                        --v11;
                        if(v11 >= 0) {
                            this.ah(v1.ax, v17, 0, 0, v0, v9 >> 14, v7 >> 14, v44, v14_1, v24, v16, v45, v30, v5, v34, 1);
                            v9 += v10;
                            v7 += v12;
                            v44 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v6;
                            v45 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v3;
                        if(v3 < 0) {
                            return;
                        }

                        this.ah(v1.ax, v17, 0, 0, v0, v4 >> 14, v7 >> 14, v44, v14_1, v24, v16, v45, v30, v5, v34, 1);
                        v4 += v15;
                        v7 += v12;
                        v44 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v45 += v8;
                    }

                    return;
                }

                v45 = v0;
                v3 -= v11;
                v11 -= v2;
                v0 = v1.bz[v2];
                while(true) {
                    --v11;
                    if(v11 >= 0) {
                        this.ah(v1.ax, v17, 0, 0, v0, v7 >> 14, v9 >> 14, v44, v14_1, v24, v16, v45, v30, v5, v34, 1);
                        v9 += v10;
                        v7 += v12;
                        v44 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v45 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ah(v1.ax, v17, 0, 0, v0, v7 >> 14, v4 >> 14, v44, v14_1, v24, v16, v45, v30, v5, v34, 1);
                    v4 += v15;
                    v7 += v12;
                    v44 += v13;
                    v0 += v1.at * 0xFEEE8863;
                    v24 += v31;
                    v16 += v6;
                    v45 += v8;
                }

                return;
            }

            v12 = v11;
            if(v3 >= v1.bt * v18) {
                return;
            }

            if(v0 > v1.bt * v18) {
                v0 = v1.bt * v18;
            }

            if(v2 > v1.bt * v18) {
                v2 = v1.bt * v18;
            }

            v11 = v10;
            v10 = v2;
            v2 = (arg61 << 9) - arg58 * v14_1 + v14_1;
            if(v0 < v10) {
                v7 = arg58 << 14;
                if(v3 < 0) {
                    v9 = v7 - v3 * v12;
                    v7 -= v3 * v15;
                    v2 -= v3 * v13;
                    v3 = 0;
                    v51 = v9;
                    v9 = v2;
                    v2 = v7;
                    v7 = v51;
                }
                else {
                    v9 = v2;
                    v2 = v7;
                }

                v4 = arg56 << 14;
                if(v0 < 0) {
                    v4 -= v0 * v11;
                    v46 = v2;
                    v0 = 0;
                }
                else {
                    v46 = v2;
                }

                v2 = v3 - v1.bo * 0xF7F729AF;
                v24 += v2 * v31;
                v16 = v32 + v2 * v6;
                v2 = v33 + v2 * v8;
                if(v12 < v15) {
                    v10 -= v0;
                    int v47 = v0 - v3;
                    v0 = v1.bz[v3];
                    while(true) {
                        --v47;
                        if(v47 >= 0) {
                            this.ah(v1.ax, v17, 0, 0, v0, v7 >> 14, v46 >> 14, v9, v14_1, v24, v16, v2, v30, v5, v34, 1);
                            v7 += v12;
                            v46 += v15;
                            v9 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v6;
                            v2 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v10;
                        if(v10 < 0) {
                            return;
                        }

                        this.ah(v1.ax, v17, 0, 0, v0, v7 >> 14, v4 >> 14, v9, v14_1, v24, v16, v2, v30, v5, v34, 1);
                        v7 += v12;
                        v4 += v11;
                        v9 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v2 += v8;
                    }

                    return;
                }

                v10 -= v0;
                int v48 = v0 - v3;
                v0 = v1.bz[v3];
                while(true) {
                    --v48;
                    if(v48 >= 0) {
                        this.ah(v1.ax, v17, 0, 0, v0, v46 >> 14, v7 >> 14, v9, v14_1, v24, v16, v2, v30, v5, v34, 1);
                        v7 += v12;
                        v46 += v15;
                        v9 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v2 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v10;
                    if(v10 < 0) {
                        return;
                    }

                    this.ah(v1.ax, v17, 0, 0, v0, v4 >> 14, v7 >> 14, v9, v14_1, v24, v16, v2, v30, v5, v34, 1);
                    v7 += v12;
                    v4 += v11;
                    v9 += v13;
                    v0 += v1.at * 0xFEEE8863;
                    v24 += v31;
                    v16 += v6;
                    v2 += v8;
                }

                return;
            }

            v4 = arg58 << 14;
            if(v3 < 0) {
                v9 = v4 - v3 * v12;
                v4 -= v3 * v15;
                v2 -= v3 * v13;
                v3 = 0;
                v51 = v9;
                v9 = v2;
                v2 = v4;
                v4 = v51;
            }
            else {
                v9 = v2;
                v2 = v4;
            }

            v7 = arg57 << 14;
            if(v10 < 0) {
                v7 -= v10 * v11;
                v16 = 0;
            }
            else {
                v16 = v10;
            }

            v10 = v3 - v1.bo * 0xF7F729AF;
            v24 += v10 * v31;
            v18 = v32 + v10 * v6;
            v10 = v33 + v10 * v8;
            if(v12 < v15) {
                v0 -= v16;
                v16 -= v3;
                int v49 = v0;
                v0 = v1.bz[v3];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ah(v1.ax, v17, 0, 0, v0, v4 >> 14, v2 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 1);
                        v4 += v12;
                        v2 += v15;
                        v9 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v18 += v6;
                        v10 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v49;
                    if(v49 < 0) {
                        return;
                    }

                    this.ah(v1.ax, v17, 0, 0, v0, v7 >> 14, v2 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 1);
                    v7 += v11;
                    v2 += v15;
                    v9 += v13;
                    v0 += v1.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v10 += v8;
                }

                return;
            }

            v0 -= v16;
            v16 -= v3;
            int v50 = v0;
            v0 = v1.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ah(v1.ax, v17, 0, 0, v0, v2 >> 14, v4 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 1);
                    v4 += v12;
                    v2 += v15;
                    v9 += v13;
                    v0 += v1.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v10 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v50;
                if(v50 < 0) {
                    return;
                }

                this.ah(v1.ax, v17, 0, 0, v0, v2 >> 14, v7 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 1);
                v7 += v11;
                v2 += v15;
                v9 += v13;
                v0 += v1.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v10 += v8;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_1415;
        }

        return;
    label_1415:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("bj.aq(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public final void ar(int[] arg7, int arg8, int arg9, int arg10) {
        try {
            this.ax = arg7;
            this.at = 0xE940394B * arg8;
            this.ay = 2026089197 * arg9;
            this.bv(0, 0, arg8, arg9, 0x6BBF1B4D);
            this.bq(0x3BF5F56D);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("bj.ar(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    final void as(int[] arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int v3;
        if((this.ac) && arg13 > this.by * 0xDEFF52E6) {
            arg13 = this.by * 0xAD0F9D97;
        }

        if(0 >= arg13) {
            return;
        }

        arg9 = arg9;
        arg14 = arg14;
        arg11 = 0xE0639EEB;
        int v0 = 0xFF00FF;
        int v1 = 0xFF00;
        if(this.bf) {
            arg13 = arg13;
            arg10 = arg13 >> 2;
            arg12 = arg15 << 2;
            if(this.bn * -1660250211 == 0) {
                if(arg10 > 0) {
                    do {
                        arg11 = bj.aa[arg14 >> 8];
                        arg14 += arg12;
                        arg15 = arg9 + 1;
                        arg8[arg9] = arg11;
                        arg9 = arg15 + 1;
                        arg8[arg15] = arg11;
                        arg15 = arg9 + 1;
                        arg8[arg9] = arg11;
                        arg9 = arg15 + 1;
                        arg8[arg15] = arg11;
                        --arg10;
                        if(arg10 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                arg10 = arg13 & 3;
                if(arg10 <= 0) {
                    return;
                }

                arg11 = bj.aa[arg14 >> 8];
                while(true) {
                    arg12 = arg9 + 1;
                    arg8[arg9] = arg11;
                    --arg10;
                    if(arg10 <= 0) {
                        break;
                    }

                    arg9 = arg12;
                }
            }
            else {
                arg15 = this.bn * arg11;
                int v2 = 0xCDC4CB90 - this.bn * arg11;
                if(arg10 > 0) {
                    while(true) {
                        arg11 = bj.aa[arg14 >> 8];
                        arg14 += arg12;
                        v3 = ((0xED26844E & arg11) * v2 >> 8 & v0) + ((arg11 & v1) * v2 >> 8 & v1);
                        int v4 = arg9 + 1;
                        arg8[arg9] = ((0x32EB2A8F & arg8[arg9]) * arg15 >> 8 & 0x3D05C790) + (((arg8[arg9] & 0x1F0A2E05) * arg15 >> 8 & 0x4F9A283F) + v3);
                        arg11 = v4 + 1;
                        arg8[v4] = ((arg8[v4] & v0) * arg15 >> 8 & v0) + v3 + ((arg8[v4] & 0xBC812403) * arg15 >> 8 & 960413730);
                        v4 = arg11 + 1;
                        arg8[arg11] = ((arg8[arg11] & v0) * arg15 >> 8 & 0x7BF0DF61) + v3 + ((arg8[arg11] & v1) * arg15 >> 8 & 661160803);
                        arg11 = v4 + 1;
                        arg8[v4] = ((arg8[v4] & v1) * arg15 >> 8 & -407445051) + (((arg8[v4] & 345348043) * arg15 >> 8 & v0) + v3);
                        --arg10;
                        if(arg10 <= 0) {
                            break;
                        }

                        arg9 = arg11;
                    }

                    arg9 = arg11;
                }

                arg10 = arg13 & 3;
                if(arg10 <= 0) {
                    return;
                }

                arg12 = ((bj.aa[arg14 >> 8] & v0) * v2 >> 8 & 0x2EE30B9D) + (v2 * (bj.aa[arg14 >> 8] & v1) >> 8 & v1);
                while(true) {
                    arg13 = arg9 + 1;
                    arg8[arg9] = ((arg8[arg9] & v1) * arg15 >> 8 & v1) + (((arg8[arg9] & 1810019410) * arg15 >> 8 & 0x9078245D) + arg12);
                    --arg10;
                    if(arg10 <= 0) {
                        break;
                    }

                    arg9 = arg13;
                }
            }

            return;
        }

        arg13 = arg13;
        if(this.bn * 0xADD405B5 == 0) {
            while(true) {
                arg10 = arg9 + 1;
                arg8[arg9] = bj.aa[arg14 >> 8];
                arg14 += arg15;
                --arg13;
                if(arg13 <= 0) {
                    break;
                }

                arg9 = arg10;
            }
        }
        else {
            arg10 = this.bn * arg11;
            arg11 = 0xBC5F6720 - this.bn * 0xAC0E1007;
            while(true) {
                arg12 = bj.aa[arg14 >> 8];
                arg14 += arg15;
                v3 = arg9 + 1;
                arg8[arg9] = ((arg8[arg9] & v0) * arg10 >> 8 & 0xAE5CA84A) + (((arg12 & v1) * arg11 >> 8 & v1) + ((arg12 & v0) * arg11 >> 8 & 0x97DF80BE)) + ((arg8[arg9] & v1) * arg10 >> 8 & 0xC766EF12);
                --arg13;
                if(arg13 > 0) {
                    arg9 = v3;
                    continue;
                }

                return;
            }
        }
    }

    final void at(int arg41, int arg42, int arg43, int arg44, int arg45, int arg46, int arg47, int arg48, int arg49, int arg50, int arg51, int arg52, int arg53, int arg54, int arg55, int arg56, int arg57, int arg58, int arg59, byte arg60) {
        int v17;
        int v38;
        int v39;
        int v16;
        int v35;
        int v11;
        int v12;
        int v4;
        int v10;
        bj v1 = this;
        int v0 = arg41;
        int v2 = arg42;
        int v3 = arg43;
        int v7 = arg47;
        int v8 = arg48;
        int v9 = arg49;
        int v13 = arg59;
        try {
            int[] v14 = ii.au.ae(v13, 14);
            if(v14 == null) {
                v10 = ii.au.ar(v13, 0x48233F9B);
                this.an(arg41, arg42, arg43, arg44, arg45, arg46, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
                return;
            }

            int[] v18 = v14;
            v1.ba = ii.au.ap(v13, 0xDB38BAF5);
            v1.bd = ii.au.an(v13, 0xF9DDF710);
            v13 = arg45 - arg44;
            int v14_1 = v2 - v0;
            int v15 = arg46 - arg44;
            int v19 = v3 - v0;
            int v20 = v8 - v7;
            int v21 = v9 - v7;
            v9 = v0 != v2 ? (v13 << 14) / v14_1 : 0;
            v8 = v2 != v3 ? (arg46 - arg45 << 14) / (v3 - v2) : 0;
            int v6 = v0 != v3 ? (arg44 - arg46 << 14) / (v0 - v3) : 0;
            int v22 = v13 * v19 - v15 * v14_1;
            if(v22 == 0) {
                return;
            }

            v14_1 = (v19 * v20 - v14_1 * v21 << 9) / v22;
            v13 = (v13 * v21 - v20 * v15 << 9) / v22;
            v15 = arg50 - arg51;
            v19 = arg53 - arg54;
            v20 = arg56 - arg57;
            v21 = arg52 - arg50;
            v22 = arg55 - arg53;
            int v23 = arg58 - arg56;
            int v24 = arg53 * v21 - arg50 * v22 << 14;
            int v27 = v8;
            int v28 = v9;
            int v29 = v6;
            int v30 = ((int)(((((long)(arg56 * v22 - arg53 * v23))) << 14) / (((long)(v1.bp * 574766503)))));
            int v31 = ((int)(((((long)(arg50 * v23 - v21 * arg56))) << 14) / (((long)(v1.bp * 574766503)))));
            int v32 = v15 * arg53 - v19 * arg50 << 14;
            int v5 = ((int)(((((long)(arg56 * v19 - arg53 * v20))) << 14) / (((long)(v1.bp * 574766503)))));
            v8 = ((int)(((((long)(v20 * arg50 - v15 * arg56))) << 14) / (((long)(v1.bp * 574766503)))));
            v9 = v21 * v19 - v22 * v15 << 14;
            int v33 = v5;
            int v34 = ((int)(((((long)(v22 * v20 - v19 * v23))) << 14) / (((long)(v1.bp * 574766503)))));
            v5 = ((int)(((((long)(v15 * v23 - v21 * v20))) << 14) / (((long)(v1.bp * 574766503)))));
            v6 = 0xF7F729AF;
            v10 = -482049717;
            if(v0 <= v2 && v0 <= v3) {
                if(v0 >= v1.bt * v10) {
                    return;
                }
                else {
                    if(v2 > v1.bt * v10) {
                        v2 = v1.bt * v10;
                    }

                    v15 = v2;
                    v2 = v3 > v1.bt * v10 ? v1.bt * v10 : v3;
                    v3 = (v7 << 9) - v14_1 * arg44 + v14_1;
                    if(v15 >= v2) {
                        goto label_407;
                    }

                    v4 = arg44 << 14;
                    if(v0 < 0) {
                        v7 = v4 - v0 * v29;
                        v4 -= v0 * v28;
                        v10 = v3 - v0 * v13;
                        v3 = v7;
                        v0 = 0;
                    }
                    else {
                        v10 = v3;
                        v3 = v4;
                    }

                    v7 = arg45 << 14;
                    if(v15 < 0) {
                        v7 -= v15 * v27;
                        v15 = 0;
                    }

                    v6 = v0 - v1.bo * v6;
                    v24 += v6 * v31;
                    v12 = v32 + v8 * v6;
                    v9 += v6 * v5;
                    if(v15 != v0) {
                        v6 = v28;
                        v11 = v29;
                        if(v11 >= v6) {
                            goto label_245;
                        }
                        else {
                            v35 = v10;
                            v10 = v27;
                        }
                    }
                    else {
                        v6 = v28;
                        v11 = v29;
                    label_245:
                        if(v15 == v0) {
                            v35 = v10;
                            v10 = v27;
                            if(v11 > v10) {
                                goto label_249;
                            }
                        }
                        else {
                            goto label_327;
                        }

                        goto label_329;
                    }

                label_249:
                    v2 -= v15;
                    v15 -= v0;
                    int v36 = v2;
                    v0 = v1.bz[v0];
                    while(true) {
                        --v15;
                        if(v15 >= 0) {
                            this.ay(v1.ax, v18, 0, 0, v0, v3 >> 14, v4 >> 14, v35, v14_1, v24, v12, v9, v30, v33, v34, 902900144);
                            v3 += v11;
                            v4 += v6;
                            v35 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v12 += v8;
                            v9 += v5;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v36;
                        if(v36 < 0) {
                            return;
                        }

                        this.ay(v1.ax, v18, 0, 0, v0, v3 >> 14, v7 >> 14, v35, v14_1, v24, v12, v9, v30, v33, v34, 902900144);
                        v3 += v11;
                        v7 += v10;
                        v35 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v8;
                        v9 += v5;
                    }

                    return;
                label_327:
                    v35 = v10;
                    v10 = v27;
                label_329:
                    v2 -= v15;
                    v15 -= v0;
                    int v37 = v2;
                    v0 = v1.bz[v0];
                    while(true) {
                        --v15;
                        if(v15 >= 0) {
                            this.ay(v1.ax, v18, 0, 0, v0, v4 >> 14, v3 >> 14, v35, v14_1, v24, v12, v9, v30, v33, v34, 902900144);
                            v3 += v11;
                            v4 += v6;
                            v35 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v12 += v8;
                            v9 += v5;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v37;
                        if(v37 < 0) {
                            return;
                        }

                        this.ay(v1.ax, v18, 0, 0, v0, v7 >> 14, v3 >> 14, v35, v14_1, v24, v12, v9, v30, v33, v34, 902900144);
                        v3 += v11;
                        v7 += v10;
                        v35 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v8;
                        v9 += v5;
                    }

                    return;
                label_407:
                    v10 = v27;
                    v12 = v28;
                    v11 = v29;
                    v4 = arg44 << 14;
                    if(v0 < 0) {
                        v16 = v4 - v0 * v11;
                        v4 -= v0 * v12;
                        v19 = v3 - v0 * v13;
                        v0 = v11;
                        v3 = 0;
                    }
                    else {
                        v19 = v3;
                        v16 = v4;
                        v3 = v0;
                        v0 = v11;
                    }

                    v7 = arg46 << 14;
                    if(v2 < 0) {
                        v7 -= v2 * v10;
                        v2 = 0;
                    }

                    v6 = v3 - v1.bo * v6;
                    v24 += v31 * v6;
                    v11 = v32 + v6 * v8;
                    v9 += v6 * v5;
                    if(v2 != v3 && v0 < v12 || v2 == v3 && v10 > v12) {
                        v15 -= v2;
                        v2 -= v3;
                        v3 = v1.bz[v3];
                        while(true) {
                            --v2;
                            if(v2 >= 0) {
                                this.ay(v1.ax, v18, 0, 0, v3, v16 >> 14, v4 >> 14, v19, v14_1, v24, v11, v9, v30, v33, v34, 902900144);
                                v16 += v0;
                                v4 += v12;
                                v19 += v13;
                                v3 += v1.at * 0xFEEE8863;
                                v24 += v31;
                                v11 += v8;
                                v9 += v5;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v15;
                            if(v15 < 0) {
                                return;
                            }

                            this.ay(v1.ax, v18, 0, 0, v3, v7 >> 14, v4 >> 14, v19, v14_1, v24, v11, v9, v30, v33, v34, 902900144);
                            v7 += v10;
                            v4 += v12;
                            v19 += v13;
                            v3 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v11 += v8;
                            v9 += v5;
                        }

                        return;
                    }

                    v15 -= v2;
                    v2 -= v3;
                    v3 = v1.bz[v3];
                    while(true) {
                        --v2;
                        if(v2 >= 0) {
                            this.ay(v1.ax, v18, 0, 0, v3, v4 >> 14, v16 >> 14, v19, v14_1, v24, v11, v9, v30, v33, v34, 902900144);
                            v16 += v0;
                            v4 += v12;
                            v19 += v13;
                            v3 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v11 += v8;
                            v9 += v5;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ay(v1.ax, v18, 0, 0, v3, v4 >> 14, v7 >> 14, v19, v14_1, v24, v11, v9, v30, v33, v34, 902900144);
                        v7 += v10;
                        v4 += v12;
                        v19 += v13;
                        v3 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v11 += v8;
                        v9 += v5;
                    }

                    return;
                }
            }

            v10 = v27;
            v12 = v28;
            v15 = v29;
            v19 = -482049717;
            if(v2 <= v3) {
                if(v2 >= v1.bt * v19) {
                    return;
                }

                if(v3 > v1.bt * v19) {
                    v3 = v1.bt * v19;
                }

                if(v0 > v1.bt * v19) {
                    v0 = v1.bt * v19;
                }

                v6 = v0;
                v0 = (arg48 << 9) - v14_1 * arg45 + v14_1;
                if(v3 < v6) {
                    v4 = arg45 << 14;
                    if(v2 < 0) {
                        v7 = v4 - v2 * v12;
                        v4 -= v2 * v10;
                        v0 -= v2 * v13;
                        v2 = 0;
                        v39 = v7;
                        v7 = v0;
                        v0 = v4;
                        v4 = v39;
                    }
                    else {
                        v7 = v0;
                        v0 = v4;
                    }

                    v11 = arg46 << 14;
                    if(v3 < 0) {
                        v11 -= v3 * v15;
                        v38 = v0;
                        v3 = 0;
                    }
                    else {
                        v38 = v0;
                    }

                    v0 = v2 - v1.bo * 0xF7F729AF;
                    v24 += v0 * v31;
                    v16 = v32 + v0 * v8;
                    v9 += v0 * v5;
                    if(v2 != v3 && v12 < v10 || v3 == v2 && v12 > v15) {
                        v6 -= v3;
                        v3 -= v2;
                        v0 = v1.bz[v2];
                        while(true) {
                            --v3;
                            if(v3 >= 0) {
                                this.ay(v1.ax, v18, 0, 0, v0, v4 >> 14, v38 >> 14, v7, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                                v4 += v12;
                                v38 += v10;
                                v7 += v13;
                                v0 += v1.at * 0xFEEE8863;
                                v24 += v31;
                                v16 += v8;
                                v9 += v5;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v6;
                            if(v6 < 0) {
                                return;
                            }

                            this.ay(v1.ax, v18, 0, 0, v0, v4 >> 14, v11 >> 14, v7, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                            v4 += v12;
                            v11 += v15;
                            v7 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v8;
                            v9 += v5;
                        }

                        return;
                    }

                    v6 -= v3;
                    v3 -= v2;
                    v0 = v1.bz[v2];
                    while(true) {
                        --v3;
                        if(v3 >= 0) {
                            this.ay(v1.ax, v18, 0, 0, v0, v38 >> 14, v4 >> 14, v7, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                            v4 += v12;
                            v38 += v10;
                            v7 += v13;
                            v0 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v8;
                            v9 += v5;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v6;
                        if(v6 < 0) {
                            return;
                        }

                        this.ay(v1.ax, v18, 0, 0, v0, v11 >> 14, v4 >> 14, v7, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                        v4 += v12;
                        v11 += v15;
                        v7 += v13;
                        v0 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v8;
                        v9 += v5;
                    }

                    return;
                }

                v7 = arg45 << 14;
                if(v2 < 0) {
                    v11 = v7 - v2 * v12;
                    v7 -= v2 * v10;
                    v0 -= v2 * v13;
                    v2 = 0;
                }
                else {
                    v11 = v7;
                }

                v4 = arg44 << 14;
                if(v6 < 0) {
                    v4 -= v6 * v15;
                    v17 = 0;
                }
                else {
                    v17 = v6;
                }

                v6 = v2 - v1.bo * 0xF7F729AF;
                v24 += v31 * v6;
                v16 = v32 + v8 * v6;
                v9 += v6 * v5;
                if(v12 < v10) {
                    v3 -= v17;
                    v17 -= v2;
                    v2 = v1.bz[v2];
                    while(true) {
                        --v17;
                        if(v17 >= 0) {
                            this.ay(v1.ax, v18, 0, 0, v2, v11 >> 14, v7 >> 14, v0, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                            v11 += v12;
                            v7 += v10;
                            v0 += v13;
                            v2 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v8;
                            v9 += v5;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v3;
                        if(v3 < 0) {
                            return;
                        }

                        this.ay(v1.ax, v18, 0, 0, v2, v4 >> 14, v7 >> 14, v0, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                        v4 += v15;
                        v7 += v10;
                        v0 += v13;
                        v2 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v8;
                        v9 += v5;
                    }

                    return;
                }

                v3 -= v17;
                v17 -= v2;
                v2 = v1.bz[v2];
                while(true) {
                    --v17;
                    if(v17 >= 0) {
                        this.ay(v1.ax, v18, 0, 0, v2, v7 >> 14, v11 >> 14, v0, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                        v11 += v12;
                        v7 += v10;
                        v0 += v13;
                        v2 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v8;
                        v9 += v5;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ay(v1.ax, v18, 0, 0, v2, v7 >> 14, v4 >> 14, v0, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                    v4 += v15;
                    v7 += v10;
                    v0 += v13;
                    v2 += v1.at * 0xFEEE8863;
                    v24 += v31;
                    v16 += v8;
                    v9 += v5;
                }

                return;
            }

            if(v3 >= v1.bt * v19) {
                return;
            }

            if(v0 > v1.bt * v19) {
                v0 = v1.bt * v19;
            }

            if(v2 > v1.bt * v19) {
                v2 = v1.bt * v19;
            }

            v6 = v2;
            v22 = v12;
            v2 = (arg49 << 9) - arg46 * v14_1 + v14_1;
            if(v0 < v6) {
                v11 = arg46 << 14;
                if(v3 < 0) {
                    v7 = v11 - v10 * v3;
                    v11 -= v3 * v15;
                    v2 -= v3 * v13;
                    v3 = 0;
                    v39 = v7;
                    v7 = v2;
                    v2 = v11;
                    v11 = v39;
                }
                else {
                    v7 = v2;
                    v2 = v11;
                }

                v4 = arg44 << 14;
                if(v0 < 0) {
                    v4 -= v0 * v22;
                    v0 = 0;
                }

                v12 = v3 - v1.bo * 0xF7F729AF;
                v24 += v31 * v12;
                v16 = v32 + v8 * v12;
                v9 += v12 * v5;
                if(v10 < v15) {
                    v6 -= v0;
                    v0 -= v3;
                    v3 = v1.bz[v3];
                    while(true) {
                        --v0;
                        if(v0 >= 0) {
                            this.ay(v1.ax, v18, 0, 0, v3, v11 >> 14, v2 >> 14, v7, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                            v11 += v10;
                            v2 += v15;
                            v7 += v13;
                            v3 += v1.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v8;
                            v9 += v5;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v6;
                        if(v6 < 0) {
                            return;
                        }

                        this.ay(v1.ax, v18, 0, 0, v3, v11 >> 14, v4 >> 14, v7, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                        v11 += v10;
                        v4 += v22;
                        v7 += v13;
                        v3 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v8;
                        v9 += v5;
                    }

                    return;
                }

                v6 -= v0;
                v0 -= v3;
                v3 = v1.bz[v3];
                while(true) {
                    --v0;
                    if(v0 >= 0) {
                        this.ay(v1.ax, v18, 0, 0, v3, v2 >> 14, v11 >> 14, v7, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                        v11 += v10;
                        v2 += v15;
                        v7 += v13;
                        v3 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v8;
                        v9 += v5;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v6;
                    if(v6 < 0) {
                        return;
                    }

                    this.ay(v1.ax, v18, 0, 0, v3, v4 >> 14, v11 >> 14, v7, v14_1, v24, v16, v9, v30, v33, v34, 902900144);
                    v11 += v10;
                    v4 += v22;
                    v7 += v13;
                    v3 += v1.at * 0xFEEE8863;
                    v24 += v31;
                    v16 += v8;
                    v9 += v5;
                }

                return;
            }

            v11 = arg46 << 14;
            if(v3 < 0) {
                v4 = v11 - v10 * v3;
                v11 -= v15 * v3;
                v2 -= v3 * v13;
                v3 = 0;
                v39 = v4;
                v4 = v2;
                v2 = v11;
                v11 = v39;
            }
            else {
                v4 = v2;
                v2 = v11;
            }

            v7 = arg45 << 14;
            if(v6 < 0) {
                v7 -= v6 * v22;
                v17 = 0;
            }
            else {
                v17 = v6;
            }

            v6 = v3 - v1.bo * 0xF7F729AF;
            v24 += v6 * v31;
            v12 = v32 + v8 * v6;
            v9 += v6 * v5;
            if(v10 < v15) {
                v0 -= v17;
                v17 -= v3;
                v3 = v1.bz[v3];
                while(true) {
                    --v17;
                    if(v17 >= 0) {
                        this.ay(v1.ax, v18, 0, 0, v3, v11 >> 14, v2 >> 14, v4, v14_1, v24, v12, v9, v30, v33, v34, 902900144);
                        v11 += v10;
                        v2 += v15;
                        v4 += v13;
                        v3 += v1.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v8;
                        v9 += v5;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v0;
                    if(v0 < 0) {
                        return;
                    }

                    this.ay(v1.ax, v18, 0, 0, v3, v7 >> 14, v2 >> 14, v4, v14_1, v24, v12, v9, v30, v33, v34, 902900144);
                    v7 += v22;
                    v2 += v15;
                    v4 += v13;
                    v3 += v1.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v8;
                    v9 += v5;
                }

                return;
            }

            v0 -= v17;
            v17 -= v3;
            v3 = v1.bz[v3];
            while(true) {
                --v17;
                if(v17 >= 0) {
                    this.ay(v1.ax, v18, 0, 0, v3, v2 >> 14, v11 >> 14, v4, v14_1, v24, v12, v9, v30, v33, v34, 902900144);
                    v11 += v10;
                    v2 += v15;
                    v4 += v13;
                    v3 += v1.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v8;
                    v9 += v5;
                    continue;
                }

                break;
            }

            while(true) {
                --v0;
                if(v0 < 0) {
                    return;
                }

                this.ay(v1.ax, v18, 0, 0, v3, v2 >> 14, v7 >> 14, v4, v14_1, v24, v12, v9, v30, v33, v34, 902900144);
                v7 += v22;
                v2 += v15;
                v4 += v13;
                v3 += v1.at * 0xFEEE8863;
                v24 += v31;
                v12 += v8;
                v9 += v5;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_1409;
        }

        return;
    label_1409:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("bj.at(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public final void aw(int[] arg7, int arg8, int arg9) {
        this.ax = arg7;
        this.at = 0xE940394B * arg8;
        this.ay = 2026089197 * arg9;
        this.bv(0, 0, arg8, arg9, 0x478329F);
        this.bq(0x3BF5F56D);
    }

    static void ax(int arg4) {
        arg4 = 0x3B3B15DF;
        try {
            id.ae = arg4;
            id.ar = new byte[4][104][104];
            id.an = new byte[4][104][104];
            id.ap = new byte[4][104][104];
            id.aj = new byte[4][104][104];
            id.au = new int[4][105][105];
            nt.ad = new byte[4][105][105];
            id.aq = new int[105][105];
            id.ab = new int[104];
            ab.af = new int[104];
            ct.ai = new int[104];
            lb.av = new int[104];
            am.aa = new int[104];
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bj.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    static int ax(int arg2, int arg3, byte arg4) {
        int v4;
        try {
            mx v2_1 = jb.ax.ax(((long)arg2));
            v4 = -1;
            if(v2_1 == null) {
                return v4;
            }

            if(arg3 >= 0) {
                if(arg3 >= ((jb)v2_1).al.length) {
                }
                else {
                    return ((jb)v2_1).al[arg3];
                }
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bj.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }

        return v4;
    }

    public void ax(byte arg1) {
    }

    final void ay(int[] arg22, int[] arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37) {
        int v8;
        int v9;
        int v7;
        int v3;
        int v20;
        int v11;
        int v6;
        int v5;
        int v4;
        int v10;
        int v13;
        int v12;
        bj v1 = this;
        try {
            if(v1.ac) {
                v12 = 1109746211;
                v13 = arg28;
                if(v13 > v1.by * v12) {
                    v13 = v1.by * v12;
                }

                if(arg27 >= 0) {
                    goto label_15;
                }

                v10 = 0;
            }
            else {
                v13 = arg28;
            label_15:
                v10 = arg27;
            }

            if(v10 >= v13) {
                return;
            }

            v12 = arg26 + v10;
            int v14 = arg29 + arg30 * v10;
            v13 -= v10;
            int v16 = 0xFF00FF00;
            int v17 = 0xFF00FF;
            int v18 = 0xFF0000;
            int v19 = 0xFF00;
            if(v1.ba) {
                v10 -= v1.bw * 1126407459;
                v4 = arg31 + arg34 * v10;
                v5 = arg32 + arg35 * v10;
                v6 = arg33 + v10 * arg36;
                v10 = v6 >> 12;
                if(v10 != 0) {
                    v11 = v4 / v10;
                    v10 = v5 / v10;
                }
                else {
                    v10 = 0;
                    v11 = 0;
                }

                v4 += arg34 * v13;
                v5 += v13 * arg35;
                v6 = v6 + arg36 * v13 >> 12;
                if(v6 != 0) {
                    v5 /= v6;
                    v20 = v4 / v6;
                }
                else {
                    v5 = 0;
                    v20 = 0;
                }

                v4 = (v11 << 20) + v10;
                v6 = ((v20 - v11) / v13 << 20) + (v5 - v10) / v13;
                v5 = v13 >> 3;
                v3 = arg30 << 3;
                v7 = v14 >> 8;
                if(v1.bd) {
                    if(v5 > 0) {
                        do {
                            v9 = v12 + 1;
                            arg22[v12] = ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v17) * v7 & v16) + ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v19) * v7 & v18) >> 8;
                            v4 += v6;
                            v10 = v9 + 1;
                            arg22[v9] = ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v19) * v7 & v18) + ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v17) * v7 & v16) >> 8;
                            v4 += v6;
                            v9 = v10 + 1;
                            arg22[v10] = ((arg23[(v4 >>> 26) + (v4 & 0xFC0)] & v19) * v7 & v18) + ((arg23[(v4 >>> 26) + (v4 & 0xFC0)] & v17) * v7 & v16) >> 8;
                            v4 += v6;
                            v10 = v9 + 1;
                            arg22[v9] = ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v17) * v7 & v16) + ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v19) * v7 & v18) >> 8;
                            v4 += v6;
                            v9 = v10 + 1;
                            arg22[v10] = ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v19) * v7 & v18) + ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v17) * v7 & v16) >> 8;
                            v4 += v6;
                            v10 = v9 + 1;
                            arg22[v9] = ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v19) * v7 & v18) + ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v17) * v7 & v16) >> 8;
                            v4 += v6;
                            v9 = v10 + 1;
                            arg22[v10] = ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v17) * v7 & v16) + ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v19) * v7 & v18) >> 8;
                            v4 += v6;
                            v12 = v9 + 1;
                            arg22[v9] = ((arg23[(v4 >>> 26) + (v4 & 0xFC0)] & v17) * v7 & v16) + (v7 * (arg23[(v4 >>> 26) + (v4 & 0xFC0)] & v19) & v18) >> 8;
                            v4 += v6;
                            v14 += v3;
                            v7 = v14 >> 8;
                            --v5;
                            if(v5 > 0) {
                                continue;
                            }

                            break;
                        }
                        while(true);
                    }

                    v3 = v13 & 7;
                    if(v3 <= 0) {
                        return;
                    }

                    while(true) {
                        v8 = v12 + 1;
                        arg22[v12] = ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v17) * v7 & v16) + ((arg23[(v4 & 0xFC0) + (v4 >>> 26)] & v19) * v7 & v18) >> 8;
                        v4 += v6;
                        --v3;
                        if(v3 <= 0) {
                            return;
                        }

                        v12 = v8;
                    }

                    return;
                }

                if(v5 > 0) {
                    do {
                        v8 = arg23[(v4 >>> 26) + (v4 & 0xFC0)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + ((v8 & v19) * v7 & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 >>> 26) + (v4 & 0xFC0)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + ((v8 & v19) * v7 & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 >>> 26) + (v4 & 0xFC0)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v19) * v7 & v18) + ((v8 & v17) * v7 & v16) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 >>> 26) + (v4 & 0xFC0)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + ((v8 & v19) * v7 & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 & 0xFC0) + (v4 >>> 26)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + ((v8 & v19) * v7 & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 >>> 26) + (v4 & 0xFC0)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + ((v8 & v19) * v7 & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 >>> 26) + (v4 & 0xFC0)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + ((v8 & v19) * v7 & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 & 0xFC0) + (v4 >>> 26)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + (v7 * (v8 & v19) & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v14 += v3;
                        v7 = v14 >> 8;
                        --v5;
                        if(v5 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                v3 = v13 & 7;
                if(v3 <= 0) {
                    return;
                }

                do {
                    v5 = arg23[(v4 >>> 26) + (v4 & 0xFC0)];
                    if(v5 != 0) {
                        arg22[v12] = ((v5 & v19) * v7 & v18) + ((v5 & v17) * v7 & v16) >> 8;
                    }

                    ++v12;
                    v4 += v6;
                    --v3;
                }
                while(v3 > 0);
            }
            else {
                v10 -= v1.bw * 1126407459;
                v4 = arg31 + arg34 * v10;
                v5 = arg32 + arg35 * v10;
                v6 = arg33 + v10 * arg36;
                v10 = v6 >> 14;
                if(v10 != 0) {
                    v11 = v4 / v10;
                    v10 = v5 / v10;
                }
                else {
                    v10 = 0;
                    v11 = 0;
                }

                v4 += v13 * arg34;
                v5 += v13 * arg35;
                v6 = v6 + arg36 * v13 >> 14;
                if(v6 != 0) {
                    v5 /= v6;
                    v20 = v4 / v6;
                }
                else {
                    v5 = 0;
                    v20 = 0;
                }

                v4 = (v11 << 18) + v10;
                v6 = ((v20 - v11) / v13 << 18) + (v5 - v10) / v13;
                v5 = v13 >> 3;
                v3 = arg30 << 3;
                v7 = v14 >> 8;
                if(v1.bd) {
                    if(v5 > 0) {
                        do {
                            v9 = v12 + 1;
                            arg22[v12] = ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v19) * v7 & v18) + ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v17) * v7 & v16) >> 8;
                            v4 += v6;
                            v10 = v9 + 1;
                            arg22[v9] = ((arg23[(v4 & 0x3F80) + (v4 >>> 25)] & v19) * v7 & v18) + ((arg23[(v4 & 0x3F80) + (v4 >>> 25)] & v17) * v7 & v16) >> 8;
                            v4 += v6;
                            v9 = v10 + 1;
                            arg22[v10] = ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v17) * v7 & v16) + ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v19) * v7 & v18) >> 8;
                            v4 += v6;
                            v10 = v9 + 1;
                            arg22[v9] = ((arg23[(v4 & 0x3F80) + (v4 >>> 25)] & v17) * v7 & v16) + ((arg23[(v4 & 0x3F80) + (v4 >>> 25)] & v19) * v7 & v18) >> 8;
                            v4 += v6;
                            v9 = v10 + 1;
                            arg22[v10] = ((arg23[(v4 & 0x3F80) + (v4 >>> 25)] & v19) * v7 & v18) + ((arg23[(v4 & 0x3F80) + (v4 >>> 25)] & v17) * v7 & v16) >> 8;
                            v4 += v6;
                            v10 = v9 + 1;
                            arg22[v9] = ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v17) * v7 & v16) + ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v19) * v7 & v18) >> 8;
                            v4 += v6;
                            v9 = v10 + 1;
                            arg22[v10] = ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v17) * v7 & v16) + ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v19) * v7 & v18) >> 8;
                            v4 += v6;
                            v12 = v9 + 1;
                            arg22[v9] = ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v17) * v7 & v16) + (v7 * (arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v19) & v18) >> 8;
                            v4 += v6;
                            v14 += v3;
                            v7 = v14 >> 8;
                            --v5;
                            if(v5 > 0) {
                                continue;
                            }

                            break;
                        }
                        while(true);
                    }

                    v3 = v13 & 7;
                    if(v3 <= 0) {
                        return;
                    }

                    while(true) {
                        v8 = v12 + 1;
                        arg22[v12] = ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v17) * v7 & v16) + ((arg23[(v4 >>> 25) + (v4 & 0x3F80)] & v19) * v7 & v18) >> 8;
                        v4 += v6;
                        --v3;
                        if(v3 <= 0) {
                            return;
                        }

                        v12 = v8;
                    }

                    return;
                }

                if(v5 > 0) {
                    do {
                        v8 = arg23[(v4 & 0x3F80) + (v4 >>> 25)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v19) * v7 & v18) + ((v8 & v17) * v7 & v16) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 >>> 25) + (v4 & 0x3F80)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + ((v8 & v19) * v7 & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 >>> 25) + (v4 & 0x3F80)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v19) * v7 & v18) + ((v8 & v17) * v7 & v16) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 & 0x3F80) + (v4 >>> 25)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v19) * v7 & v18) + ((v8 & v17) * v7 & v16) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 >>> 25) + (v4 & 0x3F80)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v19) * v7 & v18) + ((v8 & v17) * v7 & v16) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 & 0x3F80) + (v4 >>> 25)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v19) * v7 & v18) + ((v8 & v17) * v7 & v16) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 & 0x3F80) + (v4 >>> 25)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v19) * v7 & v18) + ((v8 & v17) * v7 & v16) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v8 = arg23[(v4 & 0x3F80) + (v4 >>> 25)];
                        if(v8 != 0) {
                            arg22[v12] = ((v8 & v17) * v7 & v16) + ((v8 & v19) * v7 & v18) >> 8;
                        }

                        ++v12;
                        v4 += v6;
                        v14 += v3;
                        v7 = v14 >> 8;
                        --v5;
                        if(v5 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                v3 = v13 & 7;
                if(v3 <= 0) {
                    return;
                }

                do {
                label_699:
                    v5 = arg23[(v4 & 0x3F80) + (v4 >>> 25)];
                    if(v5 != 0) {
                        arg22[v12] = ((v5 & v17) * v7 & v16) + ((v5 & v19) * v7 & v18) >> 8;
                    }

                    goto label_713;
                }
                while(true);
            }

            return;
        }
        catch(RuntimeException v0) {
            goto label_720;
        }

    label_713:
        ++v12;
        v4 += v6;
        --v3;
        if(v3 > 0) {
            goto label_699;
        }

        return;
    label_720:
        StringBuilder v2 = new StringBuilder();
        v2.append("bj.ay(");
        v2.append(')');
        throw lx.al(((Throwable)v0), v2.toString());
    }

    final void ba(int[] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int v0;
        if(this.ac) {
            v0 = 1109746211;
            if(arg12 > this.by * v0) {
                arg12 = this.by * v0;
            }
        }

        if(0 >= arg12) {
            return;
        }

        arg8 = arg8;
        arg12 = arg12;
        arg10 = arg12 >> 2;
        if(this.bn * 0x731DA265 == 0) {
            while(true) {
                --arg10;
                if(arg10 < 0) {
                    break;
                }

                arg11 = arg8 + 1;
                arg7[arg8] = arg9;
                arg8 = arg11 + 1;
                arg7[arg11] = arg9;
                arg11 = arg8 + 1;
                arg7[arg8] = arg9;
                arg8 = arg11 + 1;
                arg7[arg11] = arg9;
            }

            arg10 = arg12 & 3;
            while(true) {
                --arg10;
                if(arg10 >= 0) {
                    arg7[arg8] = arg9;
                    ++arg8;
                    continue;
                }

                return;
            }
        }
        else {
            if(this.bn * 0x9943B490 == 0xA3FA8627) {
                while(true) {
                    --arg10;
                    if(arg10 < 0) {
                        break;
                    }

                    arg9 = arg8 + 1;
                    arg7[arg8] = arg7[arg9];
                    arg8 = arg9 + 1;
                    arg7[arg9] = arg7[arg8];
                    arg9 = arg8 + 1;
                    arg7[arg8] = arg7[arg9];
                    arg8 = arg9 + 1;
                    arg7[arg9] = arg7[arg8];
                }

                arg9 = arg12 & 3;
                while(true) {
                    --arg9;
                    if(arg9 < 0) {
                        return;
                    }

                    arg10 = arg8 + 1;
                    arg7[arg8] = arg7[arg10];
                    arg8 = arg10;
                }
            }

            v0 = this.bn * 925802051;
            arg11 = 0x100 - this.bn * 0xE0639EEB;
            int v1 = 0xFF00;
            int v2 = (arg9 & v1) * arg11 >> 8 & 0x4D8F6564;
            arg9 = arg11 * (arg9 & 0x6A4703E3) >> 8;
            arg11 = 0xFF00FF;
            v2 += arg9 & arg11;
            while(true) {
                --arg10;
                if(arg10 < 0) {
                    break;
                }

                int v3 = arg8 + 1;
                arg7[arg8] = ((arg7[arg8] & v1) * v0 >> 8 & v1) + (((arg7[arg8] & 1364100123) * v0 >> 8 & 0xFA890E87) + v2);
                arg9 = v3 + 1;
                arg7[v3] = ((arg7[v3] & v1) * v0 >> 8 & 0x628A7C51) + (((arg7[v3] & arg11) * v0 >> 8 & 0x8F4E5A) + v2);
                v3 = arg9 + 1;
                arg7[arg9] = ((1266928050 & arg7[arg9]) * v0 >> 8 & 502470935) + (((arg7[arg9] & 832075747) * v0 >> 8 & 0x46680509) + v2);
                arg7[v3] = ((-465500899 & arg7[v3]) * v0 >> 8 & 0x61F316A2) + v2 + ((arg7[v3] & v1) * v0 >> 8 & v1);
                arg8 = v3 + 1;
            }

            arg9 = arg12 & 3;
            while(true) {
                --arg9;
                if(arg9 < 0) {
                    return;
                }

                arg7[arg8] = ((0xABDE48B2 & arg7[arg8]) * v0 >> 8 & arg11) + v2 + ((arg7[arg8] & v1) * v0 >> 8 & 1477301044);
                ++arg8;
            }
        }
    }

    public final void bd(int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27) {
        int v18;
        int v17;
        int v16;
        int v15;
        int v14;
        int v13;
        int v4;
        int v19;
        int v5;
        int v3;
        bj v8 = this;
        int v0 = arg21;
        int v1 = arg22;
        int v2 = arg23;
        int v9 = v0 != v1 ? (arg25 - arg24 << 14) / (v1 - v0) : 0;
        int v10 = v2 != v1 ? (arg26 - arg25 << 14) / (v2 - v1) : 0;
        int v11 = v2 != v0 ? (arg24 - arg26 << 14) / (v0 - v2) : 0;
        int v7 = -482049717;
        int v12 = 0xFEEE8863;
        if(v0 <= v1 && v0 <= v2) {
            if(v0 >= v8.bt * -1008760980) {
                return;
            }
            else {
                if(v1 > v8.bt * v7) {
                    v1 = v8.bt * 0x50997059;
                }

                if(v2 > v8.bt * v7) {
                    v2 = v8.bt * v7;
                }

                if(v1 < v2) {
                    v3 = arg24 << 14;
                    if(v0 < 0) {
                        v5 = v3 - v11 * v0;
                        v3 -= v0 * v9;
                        v0 = 0;
                        v19 = v5;
                        v5 = v3;
                        v3 = v19;
                    }
                    else {
                        v5 = v3;
                    }

                    v4 = arg25 << 14;
                    if(v1 < 0) {
                        v13 = v4 - v1 * v10;
                        v1 = 0;
                    }
                    else {
                        v13 = v4;
                    }

                    if(v0 != v1 && v11 < v9 || v1 == v0 && v11 > v10) {
                        v14 = v2 - v1;
                        v1 -= v0;
                        v15 = v8.bz[v0];
                        v16 = v3;
                        v17 = v5;
                        while(true) {
                            v18 = v1 - 1;
                            if(v18 >= 0) {
                                this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, 0x9F4940B6);
                                v16 += v11;
                                v17 += v9;
                                v15 += v8.at * 0x1F87F815;
                                v1 = v18;
                                continue;
                            }

                            break;
                        }

                        while(true) {
                            --v14;
                            if(v14 < 0) {
                                return;
                            }

                            this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v13 >> 14, -2007862313);
                            v16 += v11;
                            v13 += v10;
                            v15 += v8.at * v12;
                        }

                        return;
                    }

                    v14 = v2 - v1;
                    v1 -= v0;
                    v15 = v8.bz[v0];
                    v17 = v3;
                    v16 = v5;
                    while(true) {
                        v18 = v1 - 1;
                        if(v18 >= 0) {
                            this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, -1970690709);
                            v17 += v11;
                            v16 += v9;
                            v15 += v8.at * -1105353072;
                            v1 = v18;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v14;
                        if(v14 < 0) {
                            return;
                        }

                        this.ad(v8.ax, v15, arg27, 0, v13 >> 14, v17 >> 14, 0x93D7BDF2);
                        v17 += v11;
                        v13 += v10;
                        v15 += v8.at * v12;
                    }

                    return;
                }

                v3 = arg24 << 14;
                if(v0 < 0) {
                    v4 = v3 - v0 * v11;
                    v3 -= v0 * v9;
                    v0 = 0;
                    v19 = v4;
                    v4 = v3;
                    v3 = v19;
                }
                else {
                    v4 = v3;
                }

                v5 = arg26 << 14;
                if(v2 < 0) {
                    v13 = v5 - v2 * v10;
                    v2 = 0;
                }
                else {
                    v13 = v5;
                }

                if(v0 != v2 && v11 < v9 || v0 == v2 && v10 > v9) {
                    v12 = v1 - v2;
                    v2 -= v0;
                    v14 = v8.bz[v0];
                    v15 = v3;
                    v16 = v4;
                    while(true) {
                        v17 = v2 - 1;
                        if(v17 >= 0) {
                            this.ad(v8.ax, v14, arg27, 0, v15 >> 14, v16 >> 14, 0x8430F900);
                            v15 += v11;
                            v16 += v9;
                            v14 += v8.at * 984107546;
                            v2 = v17;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v12;
                        if(v12 < 0) {
                            return;
                        }

                        this.ad(v8.ax, v14, arg27, 0, v13 >> 14, v16 >> 14, -1724737604);
                        v13 += v10;
                        v16 += v9;
                        v14 += v8.at * 786308186;
                    }

                    return;
                }

                v14 = v1 - v2;
                v2 -= v0;
                v15 = v8.bz[v0];
                v17 = v3;
                v16 = v4;
                while(true) {
                    v18 = v2 - 1;
                    if(v18 >= 0) {
                        this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, -1674108286);
                        v17 += v11;
                        v16 += v9;
                        v15 += v8.at * v12;
                        v2 = v18;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v14;
                    if(v14 < 0) {
                        return;
                    }

                    this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v13 >> 14, 0x882F58F2);
                    v13 += v10;
                    v16 += v9;
                    v15 += v8.at * v12;
                }

                return;
            }
        }

        if(v1 <= v2) {
            if(v1 >= v8.bt * -1927015361) {
                return;
            }

            if(v2 > v8.bt * 0x225C7C89) {
                v2 = v8.bt * 0x288C059;
            }

            if(v0 > v8.bt * 763182099) {
                v0 = v8.bt * v7;
            }

            if(v2 < v0) {
                v3 = arg25 << 14;
                if(v1 < 0) {
                    v4 = v3 - v9 * v1;
                    v3 -= v1 * v10;
                    v1 = 0;
                }
                else {
                    v4 = v3;
                }

                v5 = arg26 << 14;
                if(v2 < 0) {
                    v12 = v5 - v2 * v11;
                    v2 = 0;
                }
                else {
                    v12 = v5;
                }

                if(v1 != v2 && v9 < v10 || v1 == v2 && v9 > v11) {
                    v13 = v0 - v2;
                    v2 -= v1;
                    v14 = v8.bz[v1];
                    v16 = v3;
                    v15 = v4;
                    while(true) {
                        v17 = v2 - 1;
                        if(v17 >= 0) {
                            this.ad(v8.ax, v14, arg27, 0, v15 >> 14, v16 >> 14, 0x86F8C80C);
                            v15 += v9;
                            v16 += v10;
                            v14 += v8.at * 0xF0FD4E76;
                            v2 = v17;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v13;
                        if(v13 < 0) {
                            return;
                        }

                        this.ad(v8.ax, v14, arg27, 0, v15 >> 14, v12 >> 14, -1662384003);
                        v15 += v9;
                        v12 += v11;
                        v14 += v8.at * -1508205230;
                    }

                    return;
                }

                v13 = v0 - v2;
                v2 -= v1;
                v14 = v8.bz[v1];
                v15 = v3;
                v16 = v4;
                while(true) {
                    v17 = v2 - 1;
                    if(v17 >= 0) {
                        this.ad(v8.ax, v14, arg27, 0, v15 >> 14, v16 >> 14, 0x83CBC351);
                        v16 += v9;
                        v15 += v10;
                        v14 += v8.at * 0x4B418E9B;
                        v2 = v17;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v13;
                    if(v13 < 0) {
                        return;
                    }

                    this.ad(v8.ax, v14, arg27, 0, v12 >> 14, v16 >> 14, 0x91379D3E);
                    v16 += v9;
                    v12 += v11;
                    v14 += v8.at * 2000502538;
                }

                return;
            }

            v4 = arg25 << 14;
            if(v1 < 0) {
                v5 = v4 - v9 * v1;
                v4 -= v1 * v10;
                v1 = 0;
            }
            else {
                v5 = v4;
            }

            v3 = arg24 << 14;
            if(v0 < 0) {
                v13 = v3 - v0 * v11;
                v0 = 0;
            }
            else {
                v13 = v3;
            }

            if(v9 < v10) {
                v14 = v2 - v0;
                v0 -= v1;
                v15 = v8.bz[v1];
                v17 = v4;
                v16 = v5;
                while(true) {
                    v18 = v0 - 1;
                    if(v18 >= 0) {
                        this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, 0x8A50C9FF);
                        v16 += v9;
                        v17 += v10;
                        v15 += v8.at * -1285014071;
                        v0 = v18;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v14;
                    if(v14 < 0) {
                        return;
                    }

                    this.ad(v8.ax, v15, arg27, 0, v13 >> 14, v17 >> 14, -1695879990);
                    v13 += v11;
                    v17 += v10;
                    v15 += v8.at * v12;
                }

                return;
            }

            v14 = v2 - v0;
            v0 -= v1;
            v15 = v8.bz[v1];
            v16 = v4;
            v17 = v5;
            while(true) {
                v18 = v0 - 1;
                if(v18 >= 0) {
                    this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, -1865766020);
                    v17 += v9;
                    v16 += v10;
                    v15 += v8.at * 13101309;
                    v0 = v18;
                    continue;
                }

                break;
            }

            while(true) {
                --v14;
                if(v14 < 0) {
                    return;
                }

                this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v13 >> 14, -1893120026);
                v13 += v11;
                v16 += v10;
                v15 += v8.at * v12;
            }

            return;
        }

        if(v2 >= v8.bt * 0x566352FD) {
            return;
        }

        if(v0 > v8.bt * v7) {
            v0 = v8.bt * 0x73BC2FC7;
        }

        if(v1 > v8.bt * v7) {
            v1 = -726058171 * v8.bt;
        }

        if(v0 < v1) {
            v4 = arg26 << 14;
            if(v2 < 0) {
                v5 = v4 - v2 * v10;
                v4 -= v2 * v11;
                v2 = 0;
                v19 = v5;
                v5 = v4;
                v4 = v19;
            }
            else {
                v5 = v4;
            }

            v3 = arg24 << 14;
            if(v0 < 0) {
                v13 = v3 - v0 * v9;
                v0 = 0;
            }
            else {
                v13 = v3;
            }

            if(v10 < v11) {
                v14 = v1 - v0;
                v0 -= v2;
                v15 = v8.bz[v2];
                v16 = v4;
                v17 = v5;
                while(true) {
                    v18 = v0 - 1;
                    if(v18 >= 0) {
                        this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, 0x846EAA70);
                        v16 += v10;
                        v17 += v11;
                        v15 += v8.at * v12;
                        v0 = v18;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v14;
                    if(v14 < 0) {
                        return;
                    }

                    this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v13 >> 14, -2093125347);
                    v16 += v10;
                    v13 += v9;
                    v15 += v8.at * v12;
                }

                return;
            }

            v14 = v1 - v0;
            v0 -= v2;
            v15 = v8.bz[v2];
            v17 = v4;
            v16 = v5;
            while(true) {
                v18 = v0 - 1;
                if(v18 >= 0) {
                    this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, 0x9F843C32);
                    v17 += v10;
                    v16 += v11;
                    v15 += v8.at * v12;
                    v0 = v18;
                    continue;
                }

                break;
            }

            while(true) {
                --v14;
                if(v14 < 0) {
                    return;
                }

                this.ad(v8.ax, v15, arg27, 0, v13 >> 14, v17 >> 14, 0x90683A2A);
                v17 += v10;
                v13 += v9;
                v15 += v8.at * v12;
            }

            return;
        }

        v3 = arg26 << 14;
        if(v2 < 0) {
            v5 = v3 - v10 * v2;
            v3 -= v2 * v11;
            v2 = 0;
        }
        else {
            v5 = v3;
        }

        v4 = arg25 << 14;
        if(v1 < 0) {
            v13 = v4 - v1 * v9;
            v1 = 0;
        }
        else {
            v13 = v4;
        }

        if(v10 < v11) {
            v12 = v0 - v1;
            v1 -= v2;
            v14 = v8.bz[v2];
            v16 = v3;
            v15 = v5;
            while(true) {
                v17 = v1 - 1;
                if(v17 >= 0) {
                    this.ad(v8.ax, v14, arg27, 0, v15 >> 14, v16 >> 14, 0x975B689A);
                    v15 += v10;
                    v16 += v11;
                    v14 += v8.at * -1798609557;
                    v1 = v17;
                    continue;
                }

                break;
            }

            while(true) {
                --v12;
                if(v12 < 0) {
                    return;
                }

                this.ad(v8.ax, v14, arg27, 0, v13 >> 14, v16 >> 14, -1945900206);
                v13 += v9;
                v16 += v11;
                v14 += v8.at * 0x92B4940C;
            }

            return;
        }

        v14 = v0 - v1;
        v1 -= v2;
        v15 = v8.bz[v2];
        v16 = v3;
        v17 = v5;
        while(true) {
            v18 = v1 - 1;
            if(v18 >= 0) {
                this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v17 >> 14, -1840149207);
                v17 += v10;
                v16 += v11;
                v15 += v8.at * v12;
                v1 = v18;
                continue;
            }

            break;
        }

        while(true) {
            --v14;
            if(v14 < 0) {
                return;
            }

            this.ad(v8.ax, v15, arg27, 0, v16 >> 14, v13 >> 14, 0x91E28AC9);
            v13 += v9;
            v16 += v11;
            v15 += v8.at * 0x802C4925;
        }
    }

    final void da(int[] arg28, int[] arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int arg42) {
        int v26;
        int v22;
        int v0_1;
        int v21;
        int v1;
        int v17;
        int v15;
        int v6;
        int v10;
        int v4;
        int v3;
        int v2;
        int v7;
        int v5;
        bj v0 = this;
        if(v0.ac) {
            v5 = arg34;
            if(v5 > v0.by * 1109746211) {
                v5 = v0.by * 1109746211;
            }

            if(arg33 >= 0) {
                goto label_16;
            }

            v7 = 0;
        }
        else {
            v5 = arg34;
        label_16:
            v7 = arg33;
        }

        if(v7 >= v5) {
            return;
        }

        int v8 = arg32 + v7;
        int v9 = arg35 + arg36 * v7;
        v5 -= v7;
        int v11 = 0xFF0000;
        int v12 = 0xFF00;
        int v13 = 0xFF00FF00;
        int v14 = 0xFF00FF;
        if(v0.ba) {
            v7 -= v0.bw * 1126407459;
            v2 = arg37 + (arg40 >> 3) * v7;
            v3 = arg38 + (arg41 >> 3) * v7;
            v4 = arg39 + (arg42 >> 3) * v7;
            v7 = v4 >> 12;
            v10 = 0xFC0;
            if(v7 != 0) {
                v6 = v2 / v7;
                v7 = v3 / v7;
                if(v6 < 0) {
                    v6 = 0;
                }
                else if(v6 > v10) {
                    v6 = 0xFC0;
                }
            }
            else {
                v6 = 0;
                v7 = 0;
            }

            v2 += arg40;
            v3 += arg41;
            v4 += arg42;
            v15 = v4 >> 12;
            if(v15 != 0) {
                v10 = v2 / v15;
                v15 = v3 / v15;
                if(v10 < 0) {
                    v17 = v2;
                    v10 = 0;
                }
                else {
                    v17 = v2;
                    if(v10 > 0xFC0) {
                        v10 = 0xFC0;
                    }
                }
            }
            else {
                v17 = v2;
                v10 = 0;
                v15 = 0;
            }

            v2 = (v6 << 20) + v7;
            v7 = (v15 - v7 >> 3) + (v10 - v6 >> 3 << 20);
            v6 = v5 >> 3;
            v1 = arg36 << 3;
            int v18 = v9 >> 8;
            int v19 = v2;
            if(v0.bd) {
                if(v6 > 0) {
                    v2 = v19;
                    while(true) {
                        v19 = v8 + 1;
                        arg28[v8] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) >> 8;
                        v2 += v7;
                        v8 = v19 + 1;
                        arg28[v19] = ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v12) * v18 & v11) + ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v14) * v18 & v13) >> 8;
                        v2 += v7;
                        v19 = v8 + 1;
                        arg28[v8] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) >> 8;
                        v2 += v7;
                        v8 = v19 + 1;
                        arg28[v19] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) >> 8;
                        v2 += v7;
                        v21 = v5;
                        v5 = v8 + 1;
                        arg28[v8] = ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v14) * v18 & v13) + ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v12) * v18 & v11) >> 8;
                        v2 += v7;
                        v8 = v5 + 1;
                        arg28[v5] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) >> 8;
                        v2 += v7;
                        v5 = v8 + 1;
                        arg28[v8] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) >> 8;
                        v2 += v7;
                        v8 = v5 + 1;
                        arg28[v5] = ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v14) * v18 & v13) + (v18 * (arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v12) & v11) >> 8;
                        v17 += arg40;
                        v3 += arg41;
                        v4 += arg42;
                        v0_1 = v4 >> 12;
                        if(v0_1 != 0) {
                            v2 = v17 / v0_1;
                            v0_1 = v3 / v0_1;
                            if(v2 < 0) {
                                goto label_225;
                            }
                            else if(v2 > 0xFC0) {
                                v2 = 0xFC0;
                            }
                        }
                        else {
                            v0_1 = 0;
                        label_225:
                            v2 = 0;
                        }

                        v5 = (v10 << 20) + v15;
                        v7 = (v2 - v10 >> 3 << 20) + (v0_1 - v15 >> 3);
                        v9 += v1;
                        v18 = v9 >> 8;
                        --v6;
                        if(v6 <= 0) {
                            v19 = v5;
                            break;
                        }

                        v15 = v0_1;
                        v10 = v2;
                        v2 = v5;
                        v5 = v21;
                    }
                }
                else {
                    v21 = v5;
                }

                v0_1 = v21 & 7;
                if(v0_1 <= 0) {
                    return;
                }

                v1 = v0_1;
                v0_1 = v19;
                while(true) {
                    v3 = v8 + 1;
                    arg28[v8] = ((arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)] & v14) * v18 & v13) + ((arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)] & v12) * v18 & v11) >> 8;
                    v0_1 += v7;
                    --v1;
                    if(v1 <= 0) {
                        return;
                    }

                    v8 = v3;
                }

                return;
            }

            v21 = v5;
            if(v6 > 0) {
                v0_1 = v19;
                while(true) {
                    v2 = arg29[(v0_1 & 0xFC0) + (v0_1 >>> 26)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v12) * v18 & v11) + ((v2 & v14) * v18 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v14) * v18 & v13) + ((v2 & v12) * v18 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v12) * v18 & v11) + ((v2 & v14) * v18 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v14) * v18 & v13) + ((v2 & v12) * v18 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v14) * v18 & v13) + ((v2 & v12) * v18 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v14) * v18 & v13) + ((v2 & v12) * v18 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 & 0xFC0) + (v0_1 >>> 26)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v12) * v18 & v11) + ((v2 & v14) * v18 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v0_1 = arg29[(v0_1 & 0xFC0) + (v0_1 >>> 26)];
                    if(v0_1 != 0) {
                        arg28[v8] = ((v0_1 & v12) * v18 & v11) + (v18 * (v0_1 & v14) & v13) >> 8;
                    }

                    ++v8;
                    v17 += arg40;
                    v3 += arg41;
                    v4 += arg42;
                    v0_1 = v4 >> 12;
                    if(v0_1 != 0) {
                        v2 = v17 / v0_1;
                        v0_1 = v3 / v0_1;
                        if(v2 < 0) {
                            v2 = 0;
                        }
                        else if(v2 > 0xFC0) {
                            v2 = 0xFC0;
                        }
                    }
                    else {
                        v0_1 = 0;
                        v2 = 0;
                    }

                    v7 = (v10 << 20) + v15;
                    v10 = (v2 - v10 >> 3 << 20) + (v0_1 - v15 >> 3);
                    v9 += v1;
                    v18 = v9 >> 8;
                    --v6;
                    if(v6 <= 0) {
                        v19 = v7;
                        v7 = v10;
                        break;
                    }

                    v15 = v0_1;
                    v0_1 = v7;
                    v7 = v10;
                    v10 = v2;
                }
            }

            v0_1 = v21 & 7;
            if(v0_1 <= 0) {
                return;
            }

            v1 = v0_1;
            v0_1 = v19;
            do {
                v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                if(v2 != 0) {
                    arg28[v8] = ((v2 & v12) * v18 & v11) + ((v2 & v14) * v18 & v13) >> 8;
                }

                ++v8;
                v0_1 += v7;
                --v1;
            }
            while(v1 > 0);
        }
        else {
            v21 = v5;
            bj v5_1 = this;
            v7 -= v5_1.bw * 1126407459;
            v0_1 = arg37 + (arg40 >> 3) * v7;
            v2 = arg38 + (arg41 >> 3) * v7;
            v3 = arg39 + v7 * (arg42 >> 3);
            v4 = v3 >> 14;
            v6 = 0x3F80;
            if(v4 != 0) {
                v7 = v0_1 / v4;
                v4 = v2 / v4;
                if(v7 < 0) {
                    goto label_488;
                }
                else if(v7 > v6) {
                    v7 = 0x3F80;
                }
            }
            else {
                v4 = 0;
            label_488:
                v7 = 0;
            }

            v0_1 += arg40;
            v2 += arg41;
            v3 += arg42;
            v10 = v3 >> 14;
            if(v10 != 0) {
                v6 = v0_1 / v10;
                v10 = v2 / v10;
                if(v6 < 0) {
                    v22 = v0_1;
                    v6 = 0;
                }
                else {
                    v22 = v0_1;
                    if(v6 > 0x3F80) {
                        v6 = 0x3F80;
                    }
                }
            }
            else {
                v22 = v0_1;
                v6 = 0;
                v10 = 0;
            }

            v0_1 = (v7 << 18) + v4;
            v7 = (v6 - v7 >> 3 << 18) + (v10 - v4 >> 3);
            v4 = v21 >> 3;
            v1 = arg36 << 3;
            v15 = v9 >> 8;
            int v23 = v0_1;
            if(v5_1.bd) {
                if(v4 > 0) {
                    v0_1 = v23;
                    while(true) {
                        int v16 = v8 + 1;
                        arg28[v8] = ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v12) * v15 & v11) + ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v14) * v15 & v13) >> 8;
                        v0_1 += v7;
                        v8 = v16 + 1;
                        arg28[v16] = ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v14) * v15 & v13) + ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v12) * v15 & v11) >> 8;
                        v0_1 += v7;
                        v16 = v8 + 1;
                        arg28[v8] = ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v14) * v15 & v13) + ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v12) * v15 & v11) >> 8;
                        v0_1 += v7;
                        v8 = v16 + 1;
                        arg28[v16] = ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v14) * v15 & v13) + ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v12) * v15 & v11) >> 8;
                        v0_1 += v7;
                        v16 = v8 + 1;
                        arg28[v8] = ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v14) * v15 & v13) + ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v12) * v15 & v11) >> 8;
                        v0_1 += v7;
                        v8 = v16 + 1;
                        arg28[v16] = ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v12) * v15 & v11) + ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v14) * v15 & v13) >> 8;
                        v0_1 += v7;
                        int v24 = v4;
                        v5 = v8 + 1;
                        arg28[v8] = ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v14) * v15 & v13) + ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v12) * v15 & v11) >> 8;
                        v0_1 += v7;
                        v8 = v5 + 1;
                        arg28[v5] = ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v14) * v15 & v13) + ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v12) * v15 & v11) >> 8;
                        v22 += arg40;
                        v2 += arg41;
                        v3 += arg42;
                        v0_1 = v3 >> 14;
                        if(v0_1 != 0) {
                            v4 = v22 / v0_1;
                            v0_1 = v2 / v0_1;
                            if(v4 < 0) {
                                goto label_658;
                            }
                            else if(v4 > 0x3F80) {
                                v4 = 0x3F80;
                            }
                        }
                        else {
                            v0_1 = 0;
                        label_658:
                            v4 = 0;
                        }

                        v5 = (v6 << 18) + v10;
                        v7 = (v0_1 - v10 >> 3) + (v4 - v6 >> 3 << 18);
                        v9 += v1;
                        v15 = v9 >> 8;
                        v6 = v24 - 1;
                        if(v6 <= 0) {
                            break;
                        }

                        v10 = v0_1;
                        v0_1 = v5;
                        v26 = v6;
                        v6 = v4;
                        v4 = v26;
                    }
                }
                else {
                    v5 = v23;
                }

                v0_1 = v21 & 7;
                if(v0_1 <= 0) {
                    return;
                }

                while(true) {
                    v2 = v8 + 1;
                    arg28[v8] = ((arg29[(v5 >>> 25) + (v5 & 0x3F80)] & v12) * v15 & v11) + ((arg29[(v5 >>> 25) + (v5 & 0x3F80)] & v14) * v15 & v13) >> 8;
                    v5 += v7;
                    --v0_1;
                    if(v0_1 <= 0) {
                        return;
                    }

                    v8 = v2;
                }

                return;
            }

            if(v4 > 0) {
                v0_1 = v23;
                while(true) {
                    v5 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v5 != 0) {
                        arg28[v8] = ((v5 & v14) * v15 & v13) + ((v5 & v12) * v15 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v5 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v5 != 0) {
                        arg28[v8] = ((v5 & v12) * v15 & v11) + ((v5 & v14) * v15 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    int v25 = v4;
                    v4 = arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v12) * v15 & v11) + ((v4 & v14) * v15 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v4 = arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v14) * v15 & v13) + ((v4 & v12) * v15 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v4 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v12) * v15 & v11) + ((v4 & v14) * v15 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v4 = arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v12) * v15 & v11) + ((v4 & v14) * v15 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v4 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v14) * v15 & v13) + ((v4 & v12) * v15 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v0_1 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v0_1 != 0) {
                        arg28[v8] = ((v0_1 & v12) * v15 & v11) + (v15 * (v0_1 & v14) & v13) >> 8;
                    }

                    ++v8;
                    v22 += arg40;
                    v2 += arg41;
                    v3 += arg42;
                    v0_1 = v3 >> 14;
                    if(v0_1 != 0) {
                        v4 = v22 / v0_1;
                        v0_1 = v2 / v0_1;
                        if(v4 < 0) {
                            v4 = 0;
                        }
                        else if(v4 > 0x3F80) {
                            v4 = 0x3F80;
                        }
                    }
                    else {
                        v0_1 = 0;
                        v4 = 0;
                    }

                    v7 = (v6 << 18) + v10;
                    v6 = (v4 - v6 >> 3 << 18) + (v0_1 - v10 >> 3);
                    v9 += v1;
                    v15 = v9 >> 8;
                    v10 = v25 - 1;
                    if(v10 <= 0) {
                        break;
                    }

                    v26 = v10;
                    v10 = v0_1;
                    v0_1 = v7;
                    v7 = v6;
                    v6 = v4;
                    v4 = v26;
                }
            }
            else {
                v6 = v7;
                v7 = v23;
            }

            v0_1 = v21 & 7;
            if(v0_1 <= 0) {
                return;
            }

            do {
                v1 = arg29[(v7 >>> 25) + (v7 & 0x3F80)];
                if(v1 != 0) {
                    arg28[v8] = ((v1 & v12) * v15 & v11) + ((v1 & v14) * v15 & v13) >> 8;
                }

                ++v8;
                v7 += v6;
                --v0_1;
                if(v0_1 > 0) {
                    continue;
                }

                return;
            }
            while(true);
        }
    }

    final void dd(int arg55, int arg56, int arg57, int arg58, int arg59, int arg60, int arg61, int arg62, int arg63, int arg64, int arg65, int arg66, int arg67, int arg68, int arg69, int arg70, int arg71, int arg72, int arg73) {
        int v51;
        int v49;
        int v46;
        int v45;
        int v44;
        int v53;
        int v16;
        int v39;
        int v36;
        int v35;
        int v12;
        int v11;
        int v4;
        int v10;
        bj v0 = this;
        int v1 = arg55;
        int v2 = arg56;
        int v3 = arg57;
        int v7 = arg61;
        int v8 = arg62;
        int v9 = arg63;
        int v13 = arg73;
        int[] v14 = ii.au.ae(v13, 38);
        if(v14 == null) {
            v10 = ii.au.ar(v13, 0x50A59E30);
            this.an(arg55, arg56, arg57, arg58, arg59, arg60, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
            return;
        }

        int[] v17 = v14;
        v0.ba = ii.au.ap(v13, -1473033593);
        v0.bd = ii.au.an(v13, 0xE0DF9E44);
        v13 = arg59 - arg58;
        int v14_1 = v2 - v1;
        int v15 = arg60 - arg58;
        int v18 = v3 - v1;
        int v19 = v8 - v7;
        int v20 = v9 - v7;
        v9 = v1 != v2 ? (v13 << 14) / v14_1 : 0;
        int v21 = 14;
        v8 = v2 != v3 ? (arg60 - arg59 << 14) / (v3 - v2) : 0;
        int v6 = v1 != v3 ? (arg58 - arg60 << 14) / (v1 - v3) : 0;
        int v22 = v13 * v18 - v15 * v14_1;
        if(v22 == 0) {
            return;
        }

        v14_1 = (v18 * v19 - v14_1 * v20 << 9) / v22;
        v13 = (v13 * v20 - v19 * v15 << 9) / v22;
        v15 = arg64 - arg65;
        v18 = arg67 - arg68;
        v19 = arg70 - arg71;
        v20 = arg66 - arg64;
        v22 = arg69 - arg67;
        int v23 = arg72 - arg70;
        int v24 = arg67 * v20 - arg64 * v22 << 14;
        int v27 = v8;
        int v28 = v9;
        int v29 = v6;
        int v30 = ((int)(((((long)(arg70 * v22 - arg67 * v23))) << v21) / (((long)(v0.bp * 574766503)))));
        int v31 = ((int)(((((long)(arg64 * v23 - v20 * arg70))) << v21) / (((long)(v0.bp * 1821672250)))));
        int v32 = v15 * arg67 - v18 * arg64 << 14;
        int v5 = ((int)(((((long)(arg70 * v18 - arg67 * v19))) << v21) / (((long)(v0.bp * 574766503)))));
        v6 = ((int)(((((long)(v19 * arg64 - v15 * arg70))) << v21) / (((long)(v0.bp * 0x25FCECE4)))));
        int v33 = v20 * v18 - v22 * v15 << 14;
        int v34 = ((int)(((((long)(v22 * v19 - v18 * v23))) << v21) / (((long)(v0.bp * 0x23B6FF08)))));
        v8 = ((int)(((((long)(v15 * v23 - v20 * v19))) << v21) / (((long)(v0.bp * 574766503)))));
        v9 = -482049717;
        if(v1 <= v2 && v1 <= v3) {
            if(v1 >= v0.bt * v9) {
                return;
            }
            else {
                if(v2 > v0.bt * v9) {
                    v2 = v0.bt * 0xD2F04F07;
                }

                v15 = v2;
                v2 = v3 > v0.bt * 0xCA4609CE ? v0.bt * 1115051947 : v3;
                v3 = (v7 << 9) - v14_1 * arg58 + v14_1;
                if(v15 >= v2) {
                    goto label_407;
                }

                v4 = arg58 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v29;
                    v4 -= v1 * v28;
                    v9 = v3 - v1 * v13;
                    v3 = v7;
                    v1 = 0;
                }
                else {
                    v9 = v3;
                    v3 = v4;
                }

                v7 = arg59 << 14;
                if(v15 < 0) {
                    v7 -= v15 * v27;
                    v15 = 0;
                }

                v11 = v1 - v0.bo * 0x509D7FCF;
                v24 += v11 * v31;
                v12 = v32 + v6 * v11;
                v11 = v33 + v11 * v8;
                if(v15 != v1) {
                    v35 = v9;
                    v9 = v28;
                    v10 = v29;
                    if(v10 >= v9) {
                        goto label_245;
                    }
                    else {
                        v36 = v11;
                        v11 = v27;
                    }
                }
                else {
                    v35 = v9;
                    v9 = v28;
                    v10 = v29;
                label_245:
                    if(v15 == v1) {
                        v36 = v11;
                        v11 = v27;
                        if(v10 > v11) {
                            goto label_249;
                        }
                    }
                    else {
                        goto label_327;
                    }

                    goto label_329;
                }

            label_249:
                v2 -= v15;
                v15 -= v1;
                int v37 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v4 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                        v3 += v10;
                        v4 += v9;
                        v35 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v36 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v37;
                    if(v37 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v7 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                    v3 += v10;
                    v7 += v11;
                    v35 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v6;
                    v36 += v8;
                }

                return;
            label_327:
                v36 = v11;
                v11 = v27;
            label_329:
                v2 -= v15;
                v15 -= v1;
                int v38 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v3 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                        v3 += v10;
                        v4 += v9;
                        v35 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v36 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v38;
                    if(v38 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v3 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                    v3 += v10;
                    v7 += v11;
                    v35 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v6;
                    v36 += v8;
                }

                return;
            label_407:
                v11 = v27;
                v9 = v28;
                v10 = v29;
                v4 = arg58 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v10;
                    v4 -= v1 * v9;
                    v3 -= v1 * v13;
                    v12 = v10;
                    v1 = 0;
                }
                else {
                    v7 = v4;
                    v12 = v10;
                }

                v10 = arg60 << 14;
                if(v2 < 0) {
                    v10 -= v2 * v11;
                    v39 = v3;
                    v2 = 0;
                }
                else {
                    v39 = v3;
                }

                v3 = v1 - v0.bo * 0xDC69DE07;
                v24 += v31 * v3;
                v16 = v32 + v3 * v6;
                v3 = v33 + v3 * v8;
                if(v2 != v1 && v12 < v9 || v2 == v1 && v11 > v9) {
                    v15 -= v2;
                    int v40 = v2 - v1;
                    v1 = v0.bz[v1];
                    while(true) {
                        --v40;
                        if(v40 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v39, v14_1, v24, v16, v3, v30, v5, v34, 902900144);
                            v7 += v12;
                            v39 += v13;
                            v1 += v0.at * -408392640;
                            v24 += v31;
                            v16 += v6;
                            v3 += v8;
                            v4 += v9;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v1, v10 >> 14, v4 >> 14, v39, v14_1, v24, v16, v3, v30, v5, v34, 902900144);
                        v10 += v11;
                        v4 += v9;
                        v39 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v3 += v8;
                    }

                    return;
                }

                v15 -= v2;
                int v42 = v2 - v1;
                v1 = v0.bz[v1];
                while(true) {
                    --v42;
                    if(v42 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v39, v14_1, v24, v16, v3, v30, v5, v34, 902900144);
                        v7 += v12;
                        v4 += v9;
                        v39 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v3 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v10 >> 14, v39, v14_1, v24, v16, v3, v30, v5, v34, 902900144);
                    v10 += v11;
                    v4 += v9;
                    v39 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v16 += v6;
                    v3 += v8;
                }

                return;
            }
        }

        v11 = v27;
        v9 = v28;
        v12 = v29;
        if(v2 <= v3) {
            if(v2 >= v0.bt * 0xBC7EBA43) {
                return;
            }

            int v43 = v11;
            if(v3 > v0.bt * 0xE635D9B4) {
                v11 = -482049717;
                v3 = v0.bt * v11;
            }
            else {
                v11 = -482049717;
            }

            v15 = v3;
            if(v1 > v0.bt * v11) {
                v1 = v0.bt * v11;
            }

            v3 = v1;
            v11 = v43;
            v1 = (arg62 << 9) - v14_1 * arg59 + v14_1;
            if(v15 < v3) {
                v4 = arg59 << 14;
                if(v2 < 0) {
                    v7 = v4 - v2 * v9;
                    v4 -= v2 * v11;
                    v1 -= v2 * v13;
                    v2 = 0;
                    v53 = v7;
                    v7 = v1;
                    v1 = v4;
                    v4 = v53;
                }
                else {
                    v7 = v1;
                    v1 = v4;
                }

                v10 = arg60 << 14;
                if(v15 < 0) {
                    v10 -= v15 * v12;
                    v44 = v1;
                    v15 = 0;
                }
                else {
                    v44 = v1;
                }

                v1 = v2 - v0.bo * 2069213788;
                v24 += v1 * v31;
                v16 = v32 + v1 * v6;
                v1 = v33 + v1 * v8;
                if(v2 != v15 && v9 < v11 || v15 == v2 && v9 > v12) {
                    v3 -= v15;
                    v15 -= v2;
                    v45 = v1;
                    v1 = v0.bz[v2];
                    while(true) {
                        --v15;
                        if(v15 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v44 >> 14, v7, v14_1, v24, v16, v45, v30, v5, v34, 902900144);
                            v4 += v9;
                            v44 += v11;
                            v7 += v13;
                            v1 += v0.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v6;
                            v45 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v3;
                        if(v3 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v10 >> 14, v7, v14_1, v24, v16, v45, v30, v5, v34, 902900144);
                        v4 += v9;
                        v10 += v12;
                        v7 += v13;
                        v1 += v0.at * 0x86FA151;
                        v24 += v31;
                        v16 += v6;
                        v45 += v8;
                    }

                    return;
                }

                v45 = v1;
                v3 -= v15;
                v15 -= v2;
                v1 = v0.bz[v2];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v44 >> 14, v4 >> 14, v7, v14_1, v24, v16, v45, v30, v5, v34, 902900144);
                        v4 += v9;
                        v44 += v11;
                        v7 += v13;
                        v1 += v0.at * 0xE9B95D9A;
                        v24 += v31;
                        v16 += v6;
                        v45 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v10 >> 14, v4 >> 14, v7, v14_1, v24, v16, v45, v30, v5, v34, 902900144);
                    v4 += v9;
                    v10 += v12;
                    v7 += v13;
                    v1 += v0.at * 0x6ECE004C;
                    v24 += v31;
                    v16 += v6;
                    v45 += v8;
                }

                return;
            }

            v7 = arg59 << 14;
            if(v2 < 0) {
                v10 = v7 - v2 * v9;
                v7 -= v2 * v11;
                v1 -= v2 * v13;
                v2 = 0;
            }
            else {
                v10 = v7;
            }

            v4 = arg58 << 14;
            if(v3 < 0) {
                v4 -= v3 * v12;
                v16 = 0;
            }
            else {
                v16 = v3;
            }

            v3 = v2 - v0.bo * -689207954;
            v24 += v31 * v3;
            v18 = v32 + v6 * v3;
            v3 = v33 + v3 * v8;
            if(v9 < v11) {
                v15 -= v16;
                v16 -= v2;
                v46 = v1;
                v1 = v0.bz[v2];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v10 >> 14, v7 >> 14, v46, v14_1, v24, v18, v3, v30, v5, v34, 902900144);
                        v10 += v9;
                        v7 += v11;
                        v46 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v18 += v6;
                        v3 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v46, v14_1, v24, v18, v3, v30, v5, v34, 902900144);
                    v4 += v12;
                    v7 += v11;
                    v46 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v3 += v8;
                }

                return;
            }

            v46 = v1;
            v15 -= v16;
            v16 -= v2;
            v1 = v0.bz[v2];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v10 >> 14, v46, v14_1, v24, v18, v3, v30, v5, v34, 902900144);
                    v10 += v9;
                    v7 += v11;
                    v46 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v3 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v15;
                if(v15 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v46, v14_1, v24, v18, v3, v30, v5, v34, 902900144);
                v4 += v12;
                v7 += v11;
                v46 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v3 += v8;
            }

            return;
        }

        v18 = -482049717;
        if(v3 >= v0.bt * v18) {
            return;
        }

        if(v1 > v0.bt * v18) {
            v1 = 0xC51755B1 * v0.bt;
        }

        v15 = v1;
        int v47 = v9;
        if(v2 > v0.bt * 0x20F7A885) {
            v2 = v0.bt * 1825842040;
        }

        v9 = v47;
        v1 = (arg63 << 9) - arg60 * v14_1 + v14_1;
        if(v15 < v2) {
            v7 = arg60 << 14;
            if(v3 < 0) {
                v10 = v7 - v11 * v3;
                v7 -= v3 * v12;
                v1 -= v3 * v13;
                v3 = 0;
                v53 = v10;
                v10 = v1;
                v1 = v7;
                v7 = v53;
            }
            else {
                v10 = v1;
                v1 = v7;
            }

            v4 = arg58 << 14;
            if(v15 < 0) {
                v4 -= v15 * v9;
                v15 = 0;
            }

            int v48 = v1;
            v1 = v3 - v0.bo * 0x6AFF180;
            v24 += v31 * v1;
            v16 = v32 + v6 * v1;
            v1 = v33 + v1 * v8;
            if(v11 < v12) {
                v2 -= v15;
                v15 -= v3;
                v49 = v1;
                v1 = v0.bz[v3];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v48 >> 14, v10, v14_1, v24, v16, v49, v30, v5, v34, 902900144);
                        v7 += v11;
                        v48 += v12;
                        v10 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v49 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v2;
                    if(v2 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v10, v14_1, v24, v16, v49, v30, v5, v34, 902900144);
                    v7 += v11;
                    v4 += v9;
                    v10 += v13;
                    v1 += v0.at * 0xB4969310;
                    v24 += v31;
                    v16 += v6;
                    v49 += v8;
                }

                return;
            }

            v49 = v1;
            v2 -= v15;
            v15 -= v3;
            v1 = v0.bz[v3];
            while(true) {
                --v15;
                if(v15 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v48 >> 14, v7 >> 14, v10, v14_1, v24, v16, v49, v30, v5, v34, 902900144);
                    v7 += v11;
                    v48 += v12;
                    v10 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v16 += v6;
                    v49 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v2;
                if(v2 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v10, v14_1, v24, v16, v49, v30, v5, v34, 902900144);
                v7 += v11;
                v4 += v9;
                v10 += v13;
                v1 += v0.at * -1450100270;
                v24 += v31;
                v16 += v6;
                v49 += v8;
            }

            return;
        }

        v4 = arg60 << 14;
        if(v3 < 0) {
            v10 = v4 - v11 * v3;
            v4 -= v12 * v3;
            v1 -= v3 * v13;
            v3 = 0;
            v53 = v10;
            v10 = v1;
            v1 = v4;
            v4 = v53;
        }
        else {
            v10 = v1;
            v1 = v4;
        }

        v7 = arg59 << 14;
        if(v2 < 0) {
            v7 -= v2 * v9;
            v16 = 0;
        }
        else {
            v16 = v2;
        }

        int v50 = v1;
        v1 = v3 - v0.bo * 0xF7F729AF;
        v24 += v1 * v31;
        v2 = v32 + v6 * v1;
        v1 = v33 + v1 * v8;
        if(v11 < v12) {
            v15 -= v16;
            v16 -= v3;
            v51 = v1;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v50 >> 14, v10, v14_1, v24, v2, v51, v30, v5, v34, 902900144);
                    v50 += v12;
                    v10 += v13;
                    v1 += v0.at * 0x55C2580;
                    v24 += v31;
                    v2 += v6;
                    v51 += v8;
                    v4 += v11;
                    continue;
                }

                break;
            }

            while(true) {
                --v15;
                if(v15 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v50 >> 14, v10, v14_1, v24, v2, v51, v30, v5, v34, 902900144);
                v7 += v9;
                v50 += v12;
                v10 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v2 += v6;
                v51 += v8;
            }

            return;
        }

        v51 = v1;
        v15 -= v16;
        v16 -= v3;
        v1 = v0.bz[v3];
        while(true) {
            --v16;
            if(v16 >= 0) {
                this.ay(v0.ax, v17, 0, 0, v1, v50 >> 14, v4 >> 14, v10, v14_1, v24, v2, v51, v30, v5, v34, 902900144);
                v4 += v11;
                v50 += v12;
                v10 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v2 += v6;
                v51 += v8;
                continue;
            }

            break;
        }

        while(true) {
            --v15;
            if(v15 < 0) {
                return;
            }

            this.ay(v0.ax, v17, 0, 0, v1, v50 >> 14, v7 >> 14, v10, v14_1, v24, v2, v51, v30, v5, v34, 902900144);
            v7 += v9;
            v50 += v12;
            v10 += v13;
            v1 += v0.at * 0xFEEE8863;
            v24 += v31;
            v2 += v6;
            v51 += v8;
        }
    }

    final void dg(int arg55, int arg56, int arg57, int arg58, int arg59, int arg60, int arg61, int arg62, int arg63, int arg64, int arg65, int arg66, int arg67, int arg68, int arg69, int arg70, int arg71, int arg72, int arg73) {
        int v49;
        int v46;
        int v45;
        int v16;
        int v44;
        int v53;
        int v39;
        int v11;
        int v36;
        int v35;
        int v12;
        int v4;
        int v10;
        bj v0 = this;
        int v1 = arg55;
        int v2 = arg56;
        int v3 = arg57;
        int v7 = arg61;
        int v8 = arg62;
        int v9 = arg63;
        int v13 = arg73;
        int[] v14 = ii.au.ae(v13, 67);
        if(v14 == null) {
            v10 = ii.au.ar(v13, 0x66F7577B);
            this.an(arg55, arg56, arg57, arg58, arg59, arg60, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
            return;
        }

        int[] v17 = v14;
        v0.ba = ii.au.ap(v13, 0xCEDC0BB7);
        v0.bd = ii.au.an(v13, -1210497867);
        v13 = arg59 - arg58;
        int v14_1 = v2 - v1;
        int v15 = arg60 - arg58;
        int v18 = v3 - v1;
        int v19 = v8 - v7;
        int v20 = v9 - v7;
        v9 = v1 != v2 ? (v13 << 14) / v14_1 : 0;
        int v21 = 14;
        v8 = v2 != v3 ? (arg60 - arg59 << 14) / (v3 - v2) : 0;
        int v6 = v1 != v3 ? (arg58 - arg60 << 14) / (v1 - v3) : 0;
        int v22 = v13 * v18 - v15 * v14_1;
        if(v22 == 0) {
            return;
        }

        v14_1 = (v18 * v19 - v14_1 * v20 << 9) / v22;
        v13 = (v13 * v20 - v19 * v15 << 9) / v22;
        v15 = arg64 - arg65;
        v18 = arg67 - arg68;
        v19 = arg70 - arg71;
        v20 = arg66 - arg64;
        v22 = arg69 - arg67;
        int v23 = arg72 - arg70;
        int v24 = arg67 * v20 - arg64 * v22 << 14;
        int v27 = v8;
        int v28 = v9;
        int v29 = v6;
        int v30 = ((int)(((((long)(arg70 * v22 - arg67 * v23))) << v21) / (((long)(v0.bp * 1108018590)))));
        int v31 = v15 * arg67 - v18 * arg64 << 14;
        int v32 = ((int)(((((long)(arg64 * v23 - v20 * arg70))) << v21) / (((long)(v0.bp * 0xED56BD03)))));
        int v5 = ((int)(((((long)(arg70 * v18 - arg67 * v19))) << v21) / (((long)(v0.bp * 0x3D9E709B)))));
        v6 = ((int)(((((long)(v19 * arg64 - v15 * arg70))) << v21) / (((long)(v0.bp * 0x2E81680F)))));
        int v33 = v20 * v18 - v22 * v15 << 14;
        int v34 = ((int)(((((long)(v22 * v19 - v18 * v23))) << v21) / (((long)(v0.bp * 574766503)))));
        v8 = ((int)(((((long)(v15 * v23 - v20 * v19))) << v21) / (((long)(v0.bp * 0x63BAA4B4)))));
        v10 = -482049717;
        if(v1 <= v2 && v1 <= v3) {
            if(v1 >= v0.bt * 1201977410) {
                return;
            }
            else {
                if(v2 > v0.bt * v10) {
                    v2 = v0.bt * v10;
                }

                v15 = v2;
                v2 = v3 > v0.bt * 0x8620C8B3 ? v0.bt * v10 : v3;
                v3 = (v7 << 9) - v14_1 * arg58 + v14_1;
                if(v15 >= v2) {
                    goto label_408;
                }

                v4 = arg58 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v29;
                    v4 -= v1 * v28;
                    v9 = v3 - v1 * v13;
                    v3 = v7;
                    v1 = 0;
                }
                else {
                    v9 = v3;
                    v3 = v4;
                }

                v7 = arg59 << 14;
                if(v15 < 0) {
                    v7 -= v15 * v27;
                    v15 = 0;
                }

                v10 = v1 - v0.bo * 0xC827BFAF;
                v24 += v10 * v32;
                v12 = v31 + v6 * v10;
                v10 = v33 + v10 * v8;
                if(v15 != v1) {
                    v35 = v9;
                    v36 = v10;
                    v10 = v28;
                    v9 = v29;
                    if(v9 >= v10) {
                        goto label_248;
                    }
                    else {
                        v11 = v27;
                    }
                }
                else {
                    v35 = v9;
                    v36 = v10;
                    v10 = v28;
                    v9 = v29;
                label_248:
                    if(v15 == v1) {
                        v11 = v27;
                        if(v9 > v11) {
                            goto label_251;
                        }
                    }
                    else {
                        goto label_329;
                    }

                    goto label_330;
                }

            label_251:
                v2 -= v15;
                v15 -= v1;
                int v37 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v4 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                        v3 += v9;
                        v4 += v10;
                        v35 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v12 += v6;
                        v36 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v37;
                    if(v37 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v7 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                    v3 += v9;
                    v7 += v11;
                    v35 += v13;
                    v1 += v0.at * 0x694A2AF4;
                    v24 += v32;
                    v12 += v6;
                    v36 += v8;
                }

                return;
            label_329:
                v11 = v27;
            label_330:
                v2 -= v15;
                v15 -= v1;
                int v38 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v3 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                        v3 += v9;
                        v4 += v10;
                        v35 += v13;
                        v1 += v0.at * 0x5FC336F4;
                        v24 += v32;
                        v12 += v6;
                        v36 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v38;
                    if(v38 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v3 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                    v3 += v9;
                    v7 += v11;
                    v35 += v13;
                    v1 += v0.at * 0xFF7C00DF;
                    v24 += v32;
                    v12 += v6;
                    v36 += v8;
                }

                return;
            label_408:
                v11 = v27;
                v10 = v28;
                v9 = v29;
                v12 = 0xF7F729AF;
                v4 = arg58 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v9;
                    v4 -= v1 * v10;
                    v18 = v3 - v1 * v13;
                    v1 = v9;
                    v3 = 0;
                }
                else {
                    v18 = v3;
                    v7 = v4;
                    v3 = v1;
                    v1 = v9;
                }

                v9 = arg60 << 14;
                if(v2 < 0) {
                    v9 -= v2 * v11;
                    v39 = v4;
                    v2 = 0;
                }
                else {
                    v39 = v4;
                }

                v4 = v3 - v0.bo * v12;
                v24 += v32 * v4;
                v12 = v31 + v4 * v6;
                v4 = v33 + v4 * v8;
                if(v2 != v3 && v1 < v10 || v2 == v3 && v11 > v10) {
                    v15 -= v2;
                    int v40 = v2 - v3;
                    v2 = v0.bz[v3];
                    while(true) {
                        --v40;
                        if(v40 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v2, v7 >> 14, v39 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 902900144);
                            v39 += v10;
                            v18 += v13;
                            v2 += v0.at * 0xDE6A61C;
                            v24 += v32;
                            v12 += v6;
                            v4 += v8;
                            v7 += v1;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v2, v9 >> 14, v39 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 902900144);
                        v9 += v11;
                        v39 += v10;
                        v18 += v13;
                        v2 += v0.at * 0xAEB3C04D;
                        v24 += v32;
                        v12 += v6;
                        v4 += v8;
                    }

                    return;
                }

                v15 -= v2;
                int v42 = v2 - v3;
                v2 = v0.bz[v3];
                while(true) {
                    --v42;
                    if(v42 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v2, v39 >> 14, v7 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 902900144);
                        v7 += v1;
                        v39 += v10;
                        v18 += v13;
                        v2 += v0.at * 155706530;
                        v24 += v32;
                        v12 += v6;
                        v4 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v2, v39 >> 14, v9 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 902900144);
                    v9 += v11;
                    v39 += v10;
                    v18 += v13;
                    v2 += v0.at * 2070745106;
                    v24 += v32;
                    v12 += v6;
                    v4 += v8;
                }

                return;
            }
        }

        v11 = v27;
        v10 = v28;
        v15 = v29;
        v18 = -482049717;
        if(v2 <= v3) {
            int v43 = v11;
            if(v2 >= v0.bt * -2027125447) {
                return;
            }

            if(v3 > v0.bt * 904238172) {
                v3 = 954434601 * v0.bt;
            }

            if(v1 > v0.bt * v18) {
                v1 = 0x476BFE41 * v0.bt;
            }

            v11 = v1;
            v12 = v43;
            v1 = (arg62 << 9) - v14_1 * arg59 + v14_1;
            if(v3 < v11) {
                v4 = arg59 << 14;
                if(v2 < 0) {
                    v7 = v4 - v2 * v10;
                    v4 -= v2 * v12;
                    v1 -= v2 * v13;
                    v2 = 0;
                    v53 = v7;
                    v7 = v1;
                    v1 = v4;
                    v4 = v53;
                }
                else {
                    v7 = v1;
                    v1 = v4;
                }

                v9 = arg60 << 14;
                if(v3 < 0) {
                    v9 -= v3 * v15;
                    v44 = v1;
                    v3 = 0;
                }
                else {
                    v44 = v1;
                }

                v1 = v2 - v0.bo * -417604222;
                v24 += v1 * v32;
                v16 = v31 + v1 * v6;
                v1 = v33 + v1 * v8;
                if(v2 != v3 && v10 < v12 || v3 == v2 && v10 > v15) {
                    v11 -= v3;
                    v3 -= v2;
                    v45 = v1;
                    v1 = v0.bz[v2];
                    while(true) {
                        --v3;
                        if(v3 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v44 >> 14, v7, v14_1, v24, v16, v45, v30, v5, v34, 902900144);
                            v4 += v10;
                            v44 += v12;
                            v7 += v13;
                            v1 += v0.at * 0xFEEE8863;
                            v24 += v32;
                            v16 += v6;
                            v45 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v11;
                        if(v11 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v9 >> 14, v7, v14_1, v24, v16, v45, v30, v5, v34, 902900144);
                        v4 += v10;
                        v9 += v15;
                        v7 += v13;
                        v1 += v0.at * 0x210FE884;
                        v24 += v32;
                        v16 += v6;
                        v45 += v8;
                    }

                    return;
                }

                v45 = v1;
                v11 -= v3;
                v3 -= v2;
                v1 = v0.bz[v2];
                while(true) {
                    --v3;
                    if(v3 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v44 >> 14, v4 >> 14, v7, v14_1, v24, v16, v45, v30, v5, v34, 902900144);
                        v4 += v10;
                        v44 += v12;
                        v7 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v16 += v6;
                        v45 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v11;
                    if(v11 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v9 >> 14, v4 >> 14, v7, v14_1, v24, v16, v45, v30, v5, v34, 902900144);
                    v4 += v10;
                    v9 += v15;
                    v7 += v13;
                    v1 += v0.at * 0x35871EF7;
                    v24 += v32;
                    v16 += v6;
                    v45 += v8;
                }

                return;
            }

            v7 = arg59 << 14;
            if(v2 < 0) {
                v9 = v7 - v2 * v10;
                v7 -= v2 * v12;
                v1 -= v2 * v13;
                v2 = 0;
            }
            else {
                v9 = v7;
            }

            v4 = arg58 << 14;
            if(v11 < 0) {
                v4 -= v11 * v15;
                v16 = 0;
            }
            else {
                v16 = v11;
            }

            v11 = v2 - v0.bo * 0xB7A1BCE0;
            v24 += v32 * v11;
            v18 = v31 + v6 * v11;
            v11 = v33 + v11 * v8;
            if(v10 < v12) {
                v3 -= v16;
                v16 -= v2;
                v46 = v1;
                v1 = v0.bz[v2];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v9 >> 14, v7 >> 14, v46, v14_1, v24, v18, v11, v30, v5, v34, 902900144);
                        v9 += v10;
                        v7 += v12;
                        v46 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v18 += v6;
                        v11 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v46, v14_1, v24, v18, v11, v30, v5, v34, 902900144);
                    v4 += v15;
                    v7 += v12;
                    v46 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v18 += v6;
                    v11 += v8;
                }

                return;
            }

            v46 = v1;
            v3 -= v16;
            v16 -= v2;
            v1 = v0.bz[v2];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v9 >> 14, v46, v14_1, v24, v18, v11, v30, v5, v34, 902900144);
                    v9 += v10;
                    v7 += v12;
                    v46 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v18 += v6;
                    v11 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v3;
                if(v3 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v46, v14_1, v24, v18, v11, v30, v5, v34, 902900144);
                v4 += v15;
                v7 += v12;
                v46 += v13;
                v1 += v0.at * 0xDCBDE17D;
                v24 += v32;
                v18 += v6;
                v11 += v8;
            }

            return;
        }

        if(v3 >= v0.bt * 0x5771A530) {
            return;
        }

        int v47 = v10;
        if(v1 > v0.bt * -1816703859) {
            v1 = 0x65FE79F4 * v0.bt;
        }

        if(v2 > v0.bt * v18) {
            v2 = v0.bt * 0x6931EB02;
        }

        v10 = v2;
        v12 = v47;
        v2 = (arg63 << 9) - arg60 * v14_1 + v14_1;
        if(v1 < v10) {
            v7 = arg60 << 14;
            if(v3 < 0) {
                v9 = v7 - v11 * v3;
                v7 -= v3 * v15;
                v2 -= v3 * v13;
                v3 = 0;
                v53 = v9;
                v9 = v2;
                v2 = v7;
                v7 = v53;
            }
            else {
                v9 = v2;
                v2 = v7;
            }

            v4 = arg58 << 14;
            if(v1 < 0) {
                v4 -= v1 * v12;
                v16 = 0;
            }
            else {
                v16 = v1;
            }

            int v48 = v2;
            v1 = v3 - v0.bo * 0xEADF0464;
            v24 += v32 * v1;
            v2 = v31 + v6 * v1;
            v1 = v33 + v1 * v8;
            if(v11 < v15) {
                v10 -= v16;
                v16 -= v3;
                v49 = v1;
                v1 = v0.bz[v3];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v48 >> 14, v9, v14_1, v24, v2, v49, v30, v5, v34, 902900144);
                        v7 += v11;
                        v48 += v15;
                        v9 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v2 += v6;
                        v49 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v10;
                    if(v10 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v9, v14_1, v24, v2, v49, v30, v5, v34, 902900144);
                    v7 += v11;
                    v4 += v12;
                    v9 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v2 += v6;
                    v49 += v8;
                }

                return;
            }

            v49 = v1;
            v10 -= v16;
            v16 -= v3;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v48 >> 14, v7 >> 14, v9, v14_1, v24, v2, v49, v30, v5, v34, 902900144);
                    v7 += v11;
                    v48 += v15;
                    v9 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v2 += v6;
                    v49 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v10;
                if(v10 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v9, v14_1, v24, v2, v49, v30, v5, v34, 902900144);
                v7 += v11;
                v4 += v12;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v32;
                v2 += v6;
                v49 += v8;
            }

            return;
        }

        v4 = arg60 << 14;
        if(v3 < 0) {
            v9 = v4 - v11 * v3;
            v4 -= v15 * v3;
            v2 -= v3 * v13;
            v3 = 0;
            v53 = v9;
            v9 = v2;
            v2 = v4;
            v4 = v53;
        }
        else {
            v9 = v2;
            v2 = v4;
        }

        v7 = arg59 << 14;
        if(v10 < 0) {
            v7 -= v10 * v12;
            v16 = 0;
        }
        else {
            v16 = v10;
        }

        v10 = v3 - v0.bo * 0xF7F729AF;
        v24 += v10 * v32;
        v18 = v31 + v6 * v10;
        v10 = v33 + v10 * v8;
        if(v11 < v15) {
            v1 -= v16;
            v16 -= v3;
            int v50 = v1;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v2 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 902900144);
                    v4 += v11;
                    v9 += v13;
                    v1 += v0.at * 842128006;
                    v24 += v32;
                    v18 += v6;
                    v10 += v8;
                    v2 += v15;
                    continue;
                }

                break;
            }

            while(true) {
                --v50;
                if(v50 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v2 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 902900144);
                v7 += v12;
                v2 += v15;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v32;
                v18 += v6;
                v10 += v8;
            }

            return;
        }

        v1 -= v16;
        v16 -= v3;
        int v52 = v1;
        v1 = v0.bz[v3];
        while(true) {
            --v16;
            if(v16 >= 0) {
                this.ay(v0.ax, v17, 0, 0, v1, v2 >> 14, v4 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 902900144);
                v4 += v11;
                v2 += v15;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v32;
                v18 += v6;
                v10 += v8;
                continue;
            }

            break;
        }

        while(true) {
            --v52;
            if(v52 < 0) {
                return;
            }

            this.ay(v0.ax, v17, 0, 0, v1, v2 >> 14, v7 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 902900144);
            v7 += v12;
            v2 += v15;
            v9 += v13;
            v1 += v0.at * -1510300048;
            v24 += v32;
            v18 += v6;
            v10 += v8;
        }
    }

    final void di(int arg54, int arg55, int arg56, int arg57, int arg58, int arg59, int arg60, int arg61, int arg62, int arg63, int arg64, int arg65, int arg66, int arg67, int arg68, int arg69, int arg70, int arg71, int arg72) {
        int v49;
        int v46;
        int v45;
        int v44;
        int v16;
        int v36;
        int v34;
        int v35;
        int v12;
        int v4;
        int v10;
        bj v0 = this;
        int v1 = arg54;
        int v2 = arg55;
        int v3 = arg56;
        int v7 = arg60;
        int v8 = arg61;
        int v9 = arg62;
        int v13 = arg72;
        int[] v14 = ii.au.ae(v13, 67);
        if(v14 == null) {
            v10 = ii.au.ar(v13, 0x95A35D57);
            this.an(arg54, arg55, arg56, arg57, arg58, arg59, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
            return;
        }

        int[] v17 = v14;
        v0.ba = ii.au.ap(v13, 2014430487);
        v0.bd = ii.au.an(v13, 0xE41F701B);
        v13 = arg58 - arg57;
        int v14_1 = v2 - v1;
        int v15 = arg59 - arg57;
        int v18 = v3 - v1;
        int v19 = v8 - v7;
        int v20 = v9 - v7;
        v9 = v1 != v2 ? (v13 << 14) / v14_1 : 0;
        int v21 = 14;
        v8 = v2 != v3 ? (arg59 - arg58 << 14) / (v3 - v2) : 0;
        int v6 = v1 != v3 ? (arg57 - arg59 << 14) / (v1 - v3) : 0;
        int v22 = v18 * v13 - v15 * v14_1;
        if(v22 == 0) {
            return;
        }

        v14_1 = (v18 * v19 - v14_1 * v20 << 9) / v22;
        v13 = (v20 * v13 - v19 * v15 << 9) / v22;
        v15 = arg63 - arg64;
        v18 = arg66 - arg67;
        v19 = arg69 - arg70;
        v20 = arg65 - arg63;
        v22 = arg68 - arg66;
        int v23 = arg71 - arg69;
        int v24 = arg66 * v20 - v22 * arg63 << 14;
        int v27 = v8;
        int v28 = v9;
        int v29 = v6;
        int v30 = ((int)(((((long)(v22 * arg69 - arg66 * v23))) << 3 << v21) / (((long)(v0.bp * -1814205819)))));
        int v31 = v15 * arg66 - v18 * arg63 << 14;
        int v32 = ((int)(((((long)(v23 * arg63 - v20 * arg69))) << v21) / (((long)(v0.bp * 0xB47951EF)))));
        int v5 = ((int)(((((long)(v18 * arg69 - arg66 * v19))) << 3 << v21) / (((long)(v0.bp * 1687401880)))));
        v6 = ((int)(((((long)(v19 * arg63 - arg69 * v15))) << v21) / (((long)(v0.bp * 574766503)))));
        int v33 = v20 * v18 - v22 * v15 << 14;
        v8 = ((int)(((((long)(v22 * v19 - v18 * v23))) << 3 << v21) / (((long)(v0.bp * 574766503)))));
        v9 = ((int)(((((long)(v15 * v23 - v19 * v20))) << v21) / (((long)(v0.bp * 574766503)))));
        v10 = 0xF7F729AF;
        int v11 = -482049717;
        if(v1 <= v2 && v1 <= v3) {
            if(v1 >= v0.bt * 0xBEEFA2C2) {
                return;
            }
            else {
                if(v2 > v0.bt * v11) {
                    v2 = v0.bt * v11;
                }

                v15 = v2;
                v2 = v3 > v0.bt * v11 ? v0.bt * v11 : v3;
                v3 = (v7 << 9) - arg57 * v14_1 + v14_1;
                if(v15 >= v2) {
                    goto label_412;
                }

                v4 = arg57 << 14;
                if(v1 < 0) {
                    v7 = v4 - v29 * v1;
                    v4 -= v28 * v1;
                    v11 = v3 - v1 * v13;
                    v3 = v7;
                    v1 = 0;
                }
                else {
                    v11 = v3;
                    v3 = v4;
                }

                v7 = arg58 << 14;
                if(v15 < 0) {
                    v7 -= v15 * v27;
                    v15 = 0;
                }

                v10 = v1 - v0.bo * v10;
                v24 += v10 * v32;
                v12 = v31 + v6 * v10;
                v10 = v33 + v10 * v9;
                if(v15 != v1) {
                    v35 = v7;
                    v34 = v10;
                    v10 = v28;
                    v7 = v29;
                    if(v7 >= v10) {
                        goto label_248;
                    }
                    else {
                        v36 = v11;
                        v11 = v27;
                    }
                }
                else {
                    v35 = v7;
                    v34 = v10;
                    v10 = v28;
                    v7 = v29;
                label_248:
                    if(v1 == v15) {
                        v36 = v11;
                        v11 = v27;
                        if(v7 > v11) {
                            goto label_252;
                        }
                    }
                    else {
                        goto label_330;
                    }

                    goto label_332;
                }

            label_252:
                v2 -= v15;
                v15 -= v1;
                int v37 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v3 >> 14, v4 >> 14, v36, v14_1, v24, v12, v34, v30, v5, v8, 1);
                        v3 += v7;
                        v4 += v10;
                        v36 += v13;
                        v1 += v0.at * 0xC04BADCF;
                        v24 += v32;
                        v12 += v6;
                        v34 += v9;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v37;
                    if(v37 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v3 >> 14, v35 >> 14, v36, v14_1, v24, v12, v34, v30, v5, v8, 1);
                    v3 += v7;
                    v35 += v11;
                    v36 += v13;
                    v1 += v0.at * 0x73940809;
                    v24 += v32;
                    v12 += v6;
                    v34 += v9;
                }

                return;
            label_330:
                v36 = v11;
                v11 = v27;
            label_332:
                v2 -= v15;
                v15 -= v1;
                int v38 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v4 >> 14, v3 >> 14, v36, v14_1, v24, v12, v34, v30, v5, v8, 1);
                        v4 += v10;
                        v36 += v13;
                        v1 += v0.at * 0x2984AC09;
                        v24 += v32;
                        v12 += v6;
                        v34 += v9;
                        v3 += v7;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v38;
                    if(v38 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v35 >> 14, v3 >> 14, v36, v14_1, v24, v12, v34, v30, v5, v8, 1);
                    v3 += v7;
                    v35 += v11;
                    v36 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v12 += v6;
                    v34 += v9;
                }

                return;
            label_412:
                v11 = v27;
                v10 = v28;
                v7 = v29;
                v4 = arg57 << 14;
                if(v1 < 0) {
                    v12 = v4 - v1 * v7;
                    v4 -= v1 * v10;
                    v18 = v3 - v1 * v13;
                    v1 = v7;
                    v7 = v12;
                    v3 = 0;
                }
                else {
                    v18 = v3;
                    v3 = v1;
                    v1 = v7;
                    v7 = v4;
                }

                v12 = arg59 << 14;
                if(v2 < 0) {
                    v12 -= v2 * v11;
                    v2 = 0;
                }

                int v40 = v4;
                v4 = v3 - v0.bo * 0xDAE67E04;
                v24 += v32 * v4;
                v16 = v31 + v6 * v4;
                v4 = v33 + v4 * v9;
                if(v2 != v3 && v1 < v10 || v3 == v2 && v11 > v10) {
                    v15 -= v2;
                    int v41 = v2 - v3;
                    v2 = v0.bz[v3];
                    while(true) {
                        --v41;
                        if(v41 >= 0) {
                            this.ah(v0.ax, v17, 0, 0, v2, v7 >> 14, v40 >> 14, v18, v14_1, v24, v16, v4, v30, v5, v8, 1);
                            v7 += v1;
                            v40 += v10;
                            v18 += v13;
                            v2 += v0.at * 0x8D9A7FE;
                            v24 += v32;
                            v16 += v6;
                            v4 += v9;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ah(v0.ax, v17, 0, 0, v2, v12 >> 14, v40 >> 14, v18, v14_1, v24, v16, v4, v30, v5, v8, 1);
                        v12 += v11;
                        v40 += v10;
                        v18 += v13;
                        v2 += v0.at * -1211526068;
                        v24 += v32;
                        v16 += v6;
                        v4 += v9;
                    }

                    return;
                }

                v15 -= v2;
                int v42 = v2 - v3;
                v2 = v0.bz[v3];
                while(true) {
                    --v42;
                    if(v42 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v2, v40 >> 14, v7 >> 14, v18, v14_1, v24, v16, v4, v30, v5, v8, 1);
                        v7 += v1;
                        v40 += v10;
                        v18 += v13;
                        v2 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v16 += v6;
                        v4 += v9;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v2, v40 >> 14, v12 >> 14, v18, v14_1, v24, v16, v4, v30, v5, v8, 1);
                    v12 += v11;
                    v40 += v10;
                    v18 += v13;
                    v2 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v16 += v6;
                    v4 += v9;
                }

                return;
            }
        }

        v11 = v27;
        v10 = v28;
        v15 = v29;
        v18 = -482049717;
        v19 = 0xF7F729AF;
        if(v2 <= v3) {
            int v43 = v11;
            if(v2 >= v0.bt * 0xB9AC3F5C) {
                return;
            }

            if(v3 > v0.bt * -459710907) {
                v3 = v0.bt * 0x90FAC324;
            }

            if(v1 > v0.bt * 0xFA61457C) {
                v1 = v0.bt * v18;
            }

            v4 = v1;
            v11 = v43;
            v1 = (arg61 << 9) - arg58 * v14_1 + v14_1;
            if(v3 < v4) {
                v7 = arg58 << 14;
                if(v2 < 0) {
                    v18 = v7 - v10 * v2;
                    v7 -= v2 * v11;
                    v1 -= v2 * v13;
                    v2 = 0;
                }
                else {
                    v18 = v7;
                }

                v12 = arg59 << 14;
                if(v3 < 0) {
                    v12 -= v3 * v15;
                    v44 = v1;
                    v3 = 0;
                }
                else {
                    v44 = v1;
                }

                v1 = v2 - v0.bo * v19;
                v24 += v1 * v32;
                v16 = v31 + v6 * v1;
                v1 = v33 + v1 * v9;
                if(v3 != v2 && v10 < v11 || v3 == v2 && v10 > v15) {
                    v4 -= v3;
                    v3 -= v2;
                    v45 = v1;
                    v1 = v0.bz[v2];
                    while(true) {
                        --v3;
                        if(v3 >= 0) {
                            this.ah(v0.ax, v17, 0, 0, v1, v18 >> 14, v7 >> 14, v44, v14_1, v24, v16, v45, v30, v5, v8, 1);
                            v18 += v10;
                            v7 += v11;
                            v44 += v13;
                            v1 += v0.at * 0x252FB1B1;
                            v24 += v32;
                            v16 += v6;
                            v45 += v9;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v4;
                        if(v4 < 0) {
                            return;
                        }

                        this.ah(v0.ax, v17, 0, 0, v1, v18 >> 14, v12 >> 14, v44, v14_1, v24, v16, v45, v30, v5, v8, 1);
                        v18 += v10;
                        v12 += v15;
                        v44 += v13;
                        v1 += v0.at * 0xCF1246CD;
                        v24 += v32;
                        v16 += v6;
                        v45 += v9;
                    }

                    return;
                }

                v45 = v1;
                v4 -= v3;
                v3 -= v2;
                v1 = v0.bz[v2];
                while(true) {
                    --v3;
                    if(v3 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v18 >> 14, v44, v14_1, v24, v16, v45, v30, v5, v8, 1);
                        v18 += v10;
                        v7 += v11;
                        v44 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v16 += v6;
                        v45 += v9;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v4;
                    if(v4 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v12 >> 14, v18 >> 14, v44, v14_1, v24, v16, v45, v30, v5, v8, 1);
                    v18 += v10;
                    v12 += v15;
                    v44 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v16 += v6;
                    v45 += v9;
                }

                return;
            }

            v7 = arg58 << 14;
            if(v2 < 0) {
                v12 = v7 - v2 * v10;
                v7 -= v2 * v11;
                v1 -= v2 * v13;
                v2 = 0;
            }
            else {
                v12 = v7;
            }

            v18 = arg57 << 14;
            if(v4 < 0) {
                v18 -= v4 * v15;
                v16 = 0;
            }
            else {
                v16 = v4;
            }

            v4 = v2 - v0.bo * v19;
            v24 += v4 * v32;
            v19 = v31 + v6 * v4;
            v4 = v33 + v4 * v9;
            if(v10 < v11) {
                v3 -= v16;
                v16 -= v2;
                v46 = v1;
                v1 = v0.bz[v2];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v12 >> 14, v7 >> 14, v46, v14_1, v24, v19, v4, v30, v5, v8, 1);
                        v12 += v10;
                        v7 += v11;
                        v46 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v19 += v6;
                        v4 += v9;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v18 >> 14, v7 >> 14, v46, v14_1, v24, v19, v4, v30, v5, v8, 1);
                    v18 += v15;
                    v7 += v11;
                    v46 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v19 += v6;
                    v4 += v9;
                }

                return;
            }

            v46 = v1;
            v3 -= v16;
            v16 -= v2;
            v1 = v0.bz[v2];
            while(true) {
                --v16;
                if(v16 < 0) {
                    break;
                }

                this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v12 >> 14, v46, v14_1, v24, v19, v4, v30, v5, v8, 1);
                v12 += v10;
                v7 += v11;
                v46 += v13;
                v1 += v0.at * 0x1D17F6E4;
                v24 += v32;
                v19 += v6;
                v4 += v9;
                v3 = v3;
            }

            int v47 = v3;
            while(true) {
                --v47;
                if(v47 < 0) {
                    return;
                }

                this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v18 >> 14, v46, v14_1, v24, v19, v4, v30, v5, v8, 1);
                v18 += v15;
                v7 += v11;
                v46 += v13;
                v1 += v0.at * 1083626550;
                v24 += v32;
                v19 += v6;
                v4 += v9;
            }

            return;
        }

        int v48 = v10;
        if(v3 >= v0.bt * 0xA0F78E37) {
            return;
        }

        if(v1 > v0.bt * -2010481190) {
            v1 = v0.bt * v18;
        }

        if(v2 > v0.bt * 0x60D9C87D) {
            v2 = v0.bt * v18;
        }

        v4 = v2;
        v10 = v48;
        v2 = (arg62 << 9) - arg59 * v14_1 + v14_1;
        if(v1 < v4) {
            v7 = arg59 << 14;
            if(v3 < 0) {
                v12 = v7 - v3 * v11;
                v7 -= v3 * v15;
                v2 -= v3 * v13;
                v3 = 0;
            }
            else {
                v12 = v7;
            }

            v18 = arg57 << 14;
            if(v1 < 0) {
                v18 -= v1 * v10;
                v16 = 0;
            }
            else {
                v16 = v1;
            }

            v1 = v3 - v0.bo * v19;
            v24 += v1 * v32;
            v19 = v31 + v1 * v6;
            v1 = v33 + v1 * v9;
            if(v11 < v15) {
                v4 -= v16;
                v16 -= v3;
                v49 = v1;
                v1 = v0.bz[v3];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v12 >> 14, v7 >> 14, v2, v14_1, v24, v19, v49, v30, v5, v8, 1);
                        v12 += v11;
                        v7 += v15;
                        v2 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v19 += v6;
                        v49 += v9;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v4;
                    if(v4 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v12 >> 14, v18 >> 14, v2, v14_1, v24, v19, v49, v30, v5, v8, 1);
                    v12 += v11;
                    v18 += v10;
                    v2 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v19 += v6;
                    v49 += v9;
                }

                return;
            }

            v49 = v1;
            v4 -= v16;
            v16 -= v3;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v12 >> 14, v2, v14_1, v24, v19, v49, v30, v5, v8, 1);
                    v12 += v11;
                    v7 += v15;
                    v2 += v13;
                    v1 += v0.at * 0xAB4F7E49;
                    v24 += v32;
                    v19 += v6;
                    v49 += v9;
                    continue;
                }

                break;
            }

            while(true) {
                --v4;
                if(v4 < 0) {
                    return;
                }

                this.ah(v0.ax, v17, 0, 0, v1, v18 >> 14, v12 >> 14, v2, v14_1, v24, v19, v49, v30, v5, v8, 1);
                v12 += v11;
                v18 += v10;
                v2 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v32;
                v19 += v6;
                v49 += v9;
            }

            return;
        }

        v12 = arg59 << 14;
        if(v3 < 0) {
            v18 = v12 - v3 * v11;
            v12 -= v3 * v15;
            v2 -= v3 * v13;
            v3 = 0;
            int v52 = v18;
            v18 = v2;
            v2 = v12;
            v12 = v52;
        }
        else {
            v18 = v2;
            v2 = v12;
        }

        v7 = arg58 << 14;
        if(v4 < 0) {
            v7 -= v4 * v10;
            v16 = 0;
        }
        else {
            v16 = v4;
        }

        v4 = v3 - v0.bo * 0xEF5DD343;
        v24 += v4 * v32;
        v19 = v31 + v4 * v6;
        v4 = v33 + v4 * v9;
        if(v11 < v15) {
            v1 -= v16;
            v16 -= v3;
            int v50 = v1;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ah(v0.ax, v17, 0, 0, v1, v12 >> 14, v2 >> 14, v18, v14_1, v24, v19, v4, v30, v5, v8, 1);
                    v12 += v11;
                    v2 += v15;
                    v18 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v19 += v6;
                    v4 += v9;
                    continue;
                }

                break;
            }

            while(true) {
                --v50;
                if(v50 < 0) {
                    return;
                }

                this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v2 >> 14, v18, v14_1, v24, v19, v4, v30, v5, v8, 1);
                v7 += v10;
                v2 += v15;
                v18 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v32;
                v19 += v6;
                v4 += v9;
            }

            return;
        }

        v1 -= v16;
        v16 -= v3;
        int v51 = v1;
        v1 = v0.bz[v3];
        while(true) {
            --v16;
            if(v16 >= 0) {
                this.ah(v0.ax, v17, 0, 0, v1, v2 >> 14, v12 >> 14, v18, v14_1, v24, v19, v4, v30, v5, v8, 1);
                v12 += v11;
                v2 += v15;
                v18 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v32;
                v19 += v6;
                v4 += v9;
                continue;
            }

            break;
        }

        while(true) {
            --v51;
            if(v51 < 0) {
                return;
            }

            this.ah(v0.ax, v17, 0, 0, v1, v2 >> 14, v7 >> 14, v18, v14_1, v24, v19, v4, v30, v5, v8, 1);
            v7 += v10;
            v2 += v15;
            v18 += v13;
            v1 += v0.at * 0xFEEE8863;
            v24 += v32;
            v19 += v6;
            v4 += v9;
        }
    }

    final void do(int arg51, int arg52, int arg53, int arg54, int arg55, int arg56, int arg57, int arg58, int arg59, int arg60, int arg61, int arg62, int arg63, int arg64, int arg65, int arg66, int arg67, int arg68, int arg69) {
        int v42;
        int v41;
        int v16;
        int v38;
        int v49;
        int v35;
        int v34;
        int v11;
        int v4;
        int v10;
        bj v0 = this;
        int v1 = arg51;
        int v2 = arg52;
        int v3 = arg53;
        int v7 = arg57;
        int v8 = arg58;
        int v9 = arg59;
        int v13 = arg69;
        int[] v14 = ii.au.ae(v13, 11);
        if(v14 == null) {
            v10 = ii.au.ar(v13, 0x9FC1E496);
            this.an(arg51, arg52, arg53, arg54, arg55, arg56, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
            return;
        }

        int[] v17 = v14;
        v0.ba = ii.au.ap(v13, -376905131);
        v0.bd = ii.au.an(v13, 0xE41B3747);
        v13 = arg55 - arg54;
        int v14_1 = v2 - v1;
        int v15 = arg56 - arg54;
        int v18 = v3 - v1;
        int v19 = v8 - v7;
        int v20 = v9 - v7;
        v9 = v1 != v2 ? (v13 << 14) / v14_1 : 0;
        int v21 = 14;
        v8 = v2 != v3 ? (arg56 - arg55 << 14) / (v3 - v2) : 0;
        int v6 = v1 != v3 ? (arg54 - arg56 << 14) / (v1 - v3) : 0;
        int v22 = v13 * v18 - v15 * v14_1;
        if(v22 == 0) {
            return;
        }

        v14_1 = (v18 * v19 - v14_1 * v20 << 9) / v22;
        v13 = (v13 * v20 - v19 * v15 << 9) / v22;
        v15 = arg60 - arg61;
        v18 = arg63 - arg64;
        v19 = arg66 - arg67;
        v20 = arg62 - arg60;
        v22 = arg65 - arg63;
        int v23 = arg68 - arg66;
        int v24 = arg63 * v20 - arg60 * v22 << 14;
        int v27 = v8;
        int v28 = v9;
        int v29 = v6;
        int v30 = ((int)(((((long)(arg66 * v22 - arg63 * v23))) << v21) / (((long)(v0.bp * 2092260563)))));
        int v31 = v15 * arg63 - v18 * arg60 << 14;
        int v32 = ((int)(((((long)(arg60 * v23 - v20 * arg66))) << v21) / (((long)(v0.bp * 0x71355012)))));
        int v5 = ((int)(((((long)(arg66 * v18 - arg63 * v19))) << v21) / (((long)(v0.bp * 0x8C2A64FE)))));
        v6 = ((int)(((((long)(v19 * arg60 - v15 * arg66))) << v21) / (((long)(v0.bp * 0xB1399F54)))));
        v8 = v20 * v18 - v22 * v15 << 14;
        int v33 = v13;
        v9 = ((int)(((((long)(v22 * v19 - v18 * v23))) << v21) / (((long)(v0.bp * 574766503)))));
        v10 = ((int)(((((long)(v15 * v23 - v20 * v19))) << v21) / (((long)(v0.bp * 574766503)))));
        int v12 = -482049717;
        if(v1 <= v2 && v1 <= v3) {
            if(v1 >= v0.bt * v12) {
                return;
            }
            else {
                if(v2 > v0.bt * 0x308CA2F) {
                    v2 = v0.bt * 0x9745D531;
                }

                v15 = v2;
                v2 = v3 > v0.bt * v12 ? v0.bt * 0xB7CC3735 : v3;
                v3 = (v7 << 9) - v14_1 * arg54 + v14_1;
                if(v15 >= v2) {
                    goto label_408;
                }

                v4 = arg54 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v29;
                    v4 -= v1 * v28;
                    v11 = v3 - v1 * v33;
                    v3 = v7;
                    v1 = 0;
                }
                else {
                    v11 = v3;
                    v3 = v4;
                }

                v7 = arg55 << 14;
                if(v15 < 0) {
                    v7 -= v15 * v27;
                    v15 = 0;
                }

                v12 = v1 - v0.bo * 0x950AF854;
                v24 += v12 * v32;
                v13 = v31 + v6 * v12;
                v8 += v12 * v10;
                if(v15 != v1) {
                    v34 = v11;
                    v11 = v28;
                    v12 = v29;
                    if(v12 >= v11) {
                        goto label_246;
                    }
                    else {
                        v35 = v13;
                        v13 = v27;
                    }
                }
                else {
                    v34 = v11;
                    v11 = v28;
                    v12 = v29;
                label_246:
                    if(v15 == v1) {
                        v35 = v13;
                        v13 = v27;
                        if(v12 > v13) {
                            goto label_250;
                        }
                    }
                    else {
                        goto label_328;
                    }

                    goto label_330;
                }

            label_250:
                v2 -= v15;
                v15 -= v1;
                int v36 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v4 >> 14, v34, v14_1, v24, v35, v8, v30, v5, v9, 902900144);
                        v3 += v12;
                        v4 += v11;
                        v34 += v33;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v35 += v6;
                        v8 += v10;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v36;
                    if(v36 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v7 >> 14, v34, v14_1, v24, v35, v8, v30, v5, v9, 902900144);
                    v3 += v12;
                    v7 += v13;
                    v34 += v33;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v35 += v6;
                    v8 += v10;
                }

                return;
            label_328:
                v35 = v13;
                v13 = v27;
            label_330:
                v2 -= v15;
                v15 -= v1;
                int v37 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v3 >> 14, v34, v14_1, v24, v35, v8, v30, v5, v9, 902900144);
                        v3 += v12;
                        v4 += v11;
                        v34 += v33;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v35 += v6;
                        v8 += v10;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v37;
                    if(v37 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v3 >> 14, v34, v14_1, v24, v35, v8, v30, v5, v9, 902900144);
                    v3 += v12;
                    v7 += v13;
                    v34 += v33;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v35 += v6;
                    v8 += v10;
                }

                return;
            label_408:
                v13 = v27;
                v11 = v28;
                v12 = v29;
                v4 = arg54 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v12;
                    v4 -= v1 * v11;
                    v3 -= v1 * v33;
                    v1 = v12;
                    v12 = v3;
                    v3 = 0;
                }
                else {
                    v7 = v4;
                    v49 = v3;
                    v3 = v1;
                    v1 = v12;
                    v12 = v49;
                }

                v18 = arg56 << 14;
                if(v2 < 0) {
                    v18 -= v2 * v13;
                    v38 = v4;
                    v2 = 0;
                }
                else {
                    v38 = v4;
                }

                v4 = v3 - v0.bo * 0xF7F729AF;
                v24 += v32 * v4;
                v16 = v31 + v4 * v6;
                v8 += v4 * v10;
                if(v2 != v3 && v1 < v11 || v2 == v3 && v13 > v11) {
                    v15 -= v2;
                    v2 -= v3;
                    v3 = v0.bz[v3];
                    while(true) {
                        --v2;
                        if(v2 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v3, v7 >> 14, v38 >> 14, v12, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                            v7 += v1;
                            v38 += v11;
                            v12 += v33;
                            v3 += v0.at * 0x25F947A5;
                            v24 += v32;
                            v16 += v6;
                            v8 += v10;
                            v2 = v2;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v3, v18 >> 14, v38 >> 14, v12, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                        v18 += v13;
                        v38 += v11;
                        v12 += v33;
                        v3 += v0.at * 0x55A2829C;
                        v24 += v32;
                        v16 += v6;
                        v8 += v10;
                    }

                    return;
                }

                v15 -= v2;
                v2 -= v3;
                v3 = v0.bz[v3];
                while(true) {
                    --v2;
                    if(v2 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v3, v38 >> 14, v7 >> 14, v12, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                        v7 += v1;
                        v38 += v11;
                        v12 += v33;
                        v3 += v0.at * -1535037165;
                        v24 += v32;
                        v16 += v6;
                        v8 += v10;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v3, v38 >> 14, v18 >> 14, v12, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                    v18 += v13;
                    v38 += v11;
                    v12 += v33;
                    v3 += v0.at * -1989556009;
                    v24 += v32;
                    v16 += v6;
                    v8 += v10;
                }

                return;
            }
        }

        v13 = v27;
        v11 = v28;
        v15 = v29;
        if(v2 <= v3) {
            if(v2 >= v0.bt * 0xD741858C) {
                return;
            }

            int v40 = v13;
            if(v3 > v0.bt * 0x61A10ED2) {
                v3 = 0xFF1B1FAC * v0.bt;
            }

            if(v1 > v0.bt * -482049717) {
                v1 = -289152690 * v0.bt;
            }

            v12 = v1;
            v13 = v40;
            v1 = (arg58 << 9) - v14_1 * arg55 + v14_1;
            if(v3 < v12) {
                v4 = arg55 << 14;
                if(v2 < 0) {
                    v7 = v4 - v2 * v11;
                    v4 -= v2 * v13;
                    v1 -= v2 * v33;
                    v2 = 0;
                    v49 = v7;
                    v7 = v1;
                    v1 = v4;
                    v4 = v49;
                }
                else {
                    v7 = v1;
                    v1 = v4;
                }

                v18 = arg56 << 14;
                if(v3 < 0) {
                    v18 -= v3 * v15;
                    v41 = v1;
                    v3 = 0;
                }
                else {
                    v41 = v1;
                }

                v1 = v2 - v0.bo * 0xF7F729AF;
                v24 += v1 * v32;
                v16 = v31 + v1 * v6;
                v8 += v1 * v10;
                if(v2 != v3 && v11 < v13 || v3 == v2 && v11 > v15) {
                    v12 -= v3;
                    v3 -= v2;
                    v1 = v0.bz[v2];
                    while(true) {
                        --v3;
                        if(v3 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v41 >> 14, v7, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                            v4 += v11;
                            v41 += v13;
                            v7 += v33;
                            v1 += v0.at * 0xBA93268E;
                            v24 += v32;
                            v16 += v6;
                            v8 += v10;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v12;
                        if(v12 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v18 >> 14, v7, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                        v4 += v11;
                        v18 += v15;
                        v7 += v33;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v16 += v6;
                        v8 += v10;
                    }

                    return;
                }

                v12 -= v3;
                v3 -= v2;
                v1 = v0.bz[v2];
                while(true) {
                    --v3;
                    if(v3 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v41 >> 14, v4 >> 14, v7, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                        v4 += v11;
                        v41 += v13;
                        v7 += v33;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v16 += v6;
                        v8 += v10;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v12;
                    if(v12 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v18 >> 14, v4 >> 14, v7, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                    v4 += v11;
                    v18 += v15;
                    v7 += v33;
                    v1 += v0.at * 0x574D75FF;
                    v24 += v32;
                    v16 += v6;
                    v8 += v10;
                }

                return;
            }

            v7 = arg55 << 14;
            if(v2 < 0) {
                v18 = v7 - v2 * v11;
                v7 -= v2 * v13;
                v1 -= v2 * v33;
                v2 = 0;
            }
            else {
                v18 = v7;
            }

            v4 = arg54 << 14;
            if(v12 < 0) {
                v4 -= v12 * v15;
                v42 = v1;
                v12 = 0;
            }
            else {
                v42 = v1;
            }

            v1 = v2 - v0.bo * 0xF7F729AF;
            v24 += v32 * v1;
            v16 = v31 + v6 * v1;
            v8 += v1 * v10;
            if(v11 < v13) {
                v3 -= v12;
                v12 -= v2;
                v1 = v0.bz[v2];
                while(true) {
                    --v12;
                    if(v12 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v18 >> 14, v7 >> 14, v42, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                        v18 += v11;
                        v7 += v13;
                        v42 += v33;
                        v1 += v0.at * 0x809A642;
                        v24 += v32;
                        v16 += v6;
                        v8 += v10;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v42, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                    v4 += v15;
                    v7 += v13;
                    v42 += v33;
                    v1 += v0.at * 0xED738AB9;
                    v24 += v32;
                    v16 += v6;
                    v8 += v10;
                }

                return;
            }

            v3 -= v12;
            v12 -= v2;
            v1 = v0.bz[v2];
            while(true) {
                --v12;
                if(v12 < 0) {
                    break;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v18 >> 14, v42, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                v18 += v11;
                v7 += v13;
                v42 += v33;
                v1 += v0.at * 0x8BDADE0B;
                v24 += v32;
                v16 += v6;
                v8 += v10;
                v3 = v3;
            }

            int v43 = v3;
            while(true) {
                --v43;
                if(v43 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v42, v14_1, v24, v16, v8, v30, v5, v9, 902900144);
                v4 += v15;
                v7 += v13;
                v42 += v33;
                v1 += v0.at * 0x62FC2C36;
                v24 += v32;
                v16 += v6;
                v8 += v10;
            }

            return;
        }

        if(v3 >= v0.bt * 0x1F351694) {
            return;
        }

        int v44 = v11;
        if(v1 > v0.bt * 618560107) {
            v1 = 1112328062 * v0.bt;
        }

        if(v2 > v0.bt * -482049717) {
            v2 = v0.bt * 0xFB663CD7;
        }

        v11 = v2;
        v12 = v44;
        v2 = (arg59 << 9) - arg56 * v14_1 + v14_1;
        if(v1 < v11) {
            v7 = arg56 << 14;
            if(v3 < 0) {
                v18 = v7 - v13 * v3;
                v7 -= v3 * v15;
                v2 -= v3 * v33;
                v3 = 0;
            }
            else {
                v18 = v7;
            }

            v4 = arg54 << 14;
            if(v1 < 0) {
                v4 -= v1 * v12;
                v16 = 0;
            }
            else {
                v16 = v1;
            }

            int v45 = v2;
            v1 = v3 - v0.bo * 0xA22A3F29;
            v24 += v32 * v1;
            v2 = v31 + v6 * v1;
            v8 += v1 * v10;
            if(v13 < v15) {
                v11 -= v16;
                v16 -= v3;
                v1 = v0.bz[v3];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v18 >> 14, v7 >> 14, v45, v14_1, v24, v2, v8, v30, v5, v9, 902900144);
                        v18 += v13;
                        v7 += v15;
                        v45 += v33;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v2 += v6;
                        v8 += v10;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v11;
                    if(v11 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v18 >> 14, v4 >> 14, v45, v14_1, v24, v2, v8, v30, v5, v9, 902900144);
                    v18 += v13;
                    v4 += v12;
                    v45 += v33;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v2 += v6;
                    v8 += v10;
                }

                return;
            }

            v11 -= v16;
            v16 -= v3;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v18 >> 14, v45, v14_1, v24, v2, v8, v30, v5, v9, 902900144);
                    v18 += v13;
                    v7 += v15;
                    v45 += v33;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v2 += v6;
                    v8 += v10;
                    continue;
                }

                break;
            }

            while(true) {
                --v11;
                if(v11 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v18 >> 14, v45, v14_1, v24, v2, v8, v30, v5, v9, 902900144);
                v18 += v13;
                v4 += v12;
                v45 += v33;
                v1 += v0.at * 0xFEEE8863;
                v24 += v32;
                v2 += v6;
                v8 += v10;
            }

            return;
        }

        v4 = arg56 << 14;
        if(v3 < 0) {
            v18 = v4 - v13 * v3;
            v4 -= v15 * v3;
            v2 -= v3 * v33;
            v3 = 0;
        }
        else {
            v18 = v4;
        }

        v7 = arg55 << 14;
        if(v11 < 0) {
            v7 -= v11 * v12;
            v16 = 0;
        }
        else {
            v16 = v11;
        }

        int v46 = v2;
        v2 = v3 - v0.bo * 1149380674;
        v24 += v2 * v32;
        v11 = v31 + v6 * v2;
        v8 += v2 * v10;
        if(v13 < v15) {
            v1 -= v16;
            v16 -= v3;
            v2 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 < 0) {
                    break;
                }

                this.ay(v0.ax, v17, 0, 0, v2, v18 >> 14, v4 >> 14, v46, v14_1, v24, v11, v8, v30, v5, v9, 902900144);
                v18 += v13;
                v4 += v15;
                v46 += v33;
                v2 += v0.at * -834053072;
                v24 += v32;
                v11 += v6;
                v8 += v10;
                v1 = v1;
            }

            int v47 = v1;
            while(true) {
                --v47;
                if(v47 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v2, v7 >> 14, v4 >> 14, v46, v14_1, v24, v11, v8, v30, v5, v9, 902900144);
                v7 += v12;
                v4 += v15;
                v46 += v33;
                v2 += v0.at * 0xFEEE8863;
                v24 += v32;
                v11 += v6;
                v8 += v10;
            }

            return;
        }

        v1 -= v16;
        v16 -= v3;
        v2 = v0.bz[v3];
        while(true) {
            --v16;
            if(v16 < 0) {
                break;
            }

            this.ay(v0.ax, v17, 0, 0, v2, v4 >> 14, v18 >> 14, v46, v14_1, v24, v11, v8, v30, v5, v9, 902900144);
            v18 += v13;
            v4 += v15;
            v46 += v33;
            v2 += v0.at * 0xA5D90DE0;
            v24 += v32;
            v11 += v6;
            v8 += v10;
            v1 = v1;
        }

        int v48 = v1;
        while(true) {
            --v48;
            if(v48 < 0) {
                return;
            }

            this.ay(v0.ax, v17, 0, 0, v2, v4 >> 14, v7 >> 14, v46, v14_1, v24, v11, v8, v30, v5, v9, 902900144);
            v7 += v12;
            v4 += v15;
            v46 += v33;
            v2 += v0.at * 0xA4B3505C;
            v24 += v32;
            v11 += v6;
            v8 += v10;
        }
    }

    final void dq(int arg56, int arg57, int arg58, int arg59, int arg60, int arg61, int arg62, int arg63, int arg64, int arg65, int arg66, int arg67, int arg68, int arg69, int arg70, int arg71, int arg72, int arg73, int arg74) {
        int v51;
        int v49;
        int v45;
        int v44;
        int v43;
        int v54;
        int v16;
        int v40;
        int v36;
        int v35;
        int v12;
        int v11;
        int v4;
        int v10;
        bj v0 = this;
        int v1 = arg56;
        int v2 = arg57;
        int v3 = arg58;
        int v7 = arg62;
        int v8 = arg63;
        int v9 = arg64;
        int v13 = arg74;
        int[] v14 = ii.au.ae(v13, 0x40);
        if(v14 == null) {
            v10 = ii.au.ar(v13, 0x768EDDF3);
            this.an(arg56, arg57, arg58, arg59, arg60, arg61, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
            return;
        }

        int[] v17 = v14;
        v0.ba = ii.au.ap(v13, 0x50D874A8);
        v0.bd = ii.au.an(v13, -2059607705);
        v13 = arg60 - arg59;
        int v14_1 = v2 - v1;
        int v15 = arg61 - arg59;
        int v18 = v3 - v1;
        int v19 = v8 - v7;
        int v20 = v9 - v7;
        v9 = v1 != v2 ? (v13 << 14) / v14_1 : 0;
        int v21 = 14;
        v8 = v2 != v3 ? (arg61 - arg60 << 14) / (v3 - v2) : 0;
        int v6 = v1 != v3 ? (arg59 - arg61 << 14) / (v1 - v3) : 0;
        int v22 = v13 * v18 - v15 * v14_1;
        if(v22 == 0) {
            return;
        }

        v14_1 = (v18 * v19 - v14_1 * v20 << 9) / v22;
        v13 = (v13 * v20 - v19 * v15 << 9) / v22;
        v15 = arg65 - arg66;
        v18 = arg68 - arg69;
        v19 = arg71 - arg72;
        v20 = arg67 - arg65;
        v22 = arg70 - arg68;
        int v23 = arg73 - arg71;
        int v24 = arg68 * v20 - arg65 * v22 << 14;
        int v27 = v8;
        int v28 = v9;
        int v29 = v6;
        int v30 = ((int)(((((long)(arg71 * v22 - arg68 * v23))) << v21) / (((long)(v0.bp * 0x820A52B3)))));
        int v31 = v15 * arg68 - v18 * arg65 << 14;
        int v32 = ((int)(((((long)(arg65 * v23 - v20 * arg71))) << v21) / (((long)(v0.bp * 0xE8304462)))));
        int v5 = ((int)(((((long)(arg71 * v18 - arg68 * v19))) << v21) / (((long)(v0.bp * 0xDF57B690)))));
        v6 = ((int)(((((long)(v19 * arg65 - v15 * arg71))) << v21) / (((long)(v0.bp * 574766503)))));
        int v33 = v20 * v18 - v22 * v15 << 14;
        int v34 = ((int)(((((long)(v22 * v19 - v18 * v23))) << v21) / (((long)(v0.bp * 0xE3C4CDB7)))));
        v8 = ((int)(((((long)(v15 * v23 - v20 * v19))) << v21) / (((long)(v0.bp * 574766503)))));
        v9 = -482049717;
        if(v1 <= v2 && v1 <= v3) {
            if(v1 >= v0.bt * v9) {
                return;
            }
            else {
                if(v2 > v0.bt * v9) {
                    v2 = v0.bt * 0x59016E94;
                }

                v15 = v2;
                v2 = v3 > v0.bt * 0xD623DC0 ? v0.bt * v9 : v3;
                v3 = (v7 << 9) - v14_1 * arg59 + v14_1;
                if(v15 >= v2) {
                    goto label_410;
                }

                v4 = arg59 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v29;
                    v4 -= v1 * v28;
                    v9 = v3 - v1 * v13;
                    v3 = v7;
                    v1 = 0;
                }
                else {
                    v9 = v3;
                    v3 = v4;
                }

                v7 = arg60 << 14;
                if(v15 < 0) {
                    v7 -= v15 * v27;
                    v15 = 0;
                }

                v11 = v1 - v0.bo * 0xF7C65BB7;
                v24 += v11 * v32;
                v12 = v31 + v6 * v11;
                v11 = v33 + v11 * v8;
                if(v15 != v1) {
                    v35 = v9;
                    v9 = v28;
                    v10 = v29;
                    if(v10 >= v9) {
                        goto label_246;
                    }
                    else {
                        v36 = v11;
                        v11 = v27;
                    }
                }
                else {
                    v35 = v9;
                    v9 = v28;
                    v10 = v29;
                label_246:
                    if(v15 == v1) {
                        v36 = v11;
                        v11 = v27;
                        if(v10 > v11) {
                            goto label_250;
                        }
                    }
                    else {
                        goto label_330;
                    }

                    goto label_332;
                }

            label_250:
                v2 -= v15;
                v15 -= v1;
                int v37 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v4 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                        v4 += v9;
                        v35 += v13;
                        v1 += v0.at * 0x55D70EE9;
                        v24 += v32;
                        v12 += v6;
                        v36 += v8;
                        v3 += v10;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v37;
                    if(v37 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v7 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                    v3 += v10;
                    v7 += v11;
                    v35 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v12 += v6;
                    v36 += v8;
                }

                return;
            label_330:
                v36 = v11;
                v11 = v27;
            label_332:
                v2 -= v15;
                v15 -= v1;
                int v39 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v3 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                        v3 += v10;
                        v4 += v9;
                        v35 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v12 += v6;
                        v36 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v39;
                    if(v39 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v3 >> 14, v35, v14_1, v24, v12, v36, v30, v5, v34, 902900144);
                    v3 += v10;
                    v7 += v11;
                    v35 += v13;
                    v1 += v0.at * 0xDF527281;
                    v24 += v32;
                    v12 += v6;
                    v36 += v8;
                }

                return;
            label_410:
                v11 = v27;
                v9 = v28;
                v10 = v29;
                v4 = arg59 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v10;
                    v4 -= v1 * v9;
                    v3 -= v1 * v13;
                    v12 = v10;
                    v1 = 0;
                }
                else {
                    v7 = v4;
                    v12 = v10;
                }

                v10 = arg61 << 14;
                if(v2 < 0) {
                    v10 -= v2 * v11;
                    v40 = v3;
                    v2 = 0;
                }
                else {
                    v40 = v3;
                }

                v3 = v1 - v0.bo * -850651670;
                v24 += v32 * v3;
                v16 = v31 + v3 * v6;
                v3 = v33 + v3 * v8;
                if(v2 != v1 && v12 < v9 || v2 == v1 && v11 > v9) {
                    v15 -= v2;
                    int v41 = v2 - v1;
                    v1 = v0.bz[v1];
                    while(true) {
                        --v41;
                        if(v41 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v40, v14_1, v24, v16, v3, v30, v5, v34, 902900144);
                            v7 += v12;
                            v4 += v9;
                            v40 += v13;
                            v1 += v0.at * 0xFEEE8863;
                            v24 += v32;
                            v16 += v6;
                            v3 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v1, v10 >> 14, v4 >> 14, v40, v14_1, v24, v16, v3, v30, v5, v34, 902900144);
                        v10 += v11;
                        v4 += v9;
                        v40 += v13;
                        v1 += v0.at * -1807194550;
                        v24 += v32;
                        v16 += v6;
                        v3 += v8;
                    }

                    return;
                }

                v15 -= v2;
                int v42 = v2 - v1;
                v1 = v0.bz[v1];
                while(true) {
                    --v42;
                    if(v42 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v40, v14_1, v24, v16, v3, v30, v5, v34, 902900144);
                        v7 += v12;
                        v4 += v9;
                        v40 += v13;
                        v1 += v0.at * 0xF1009151;
                        v24 += v32;
                        v16 += v6;
                        v3 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v10 >> 14, v40, v14_1, v24, v16, v3, v30, v5, v34, 902900144);
                    v10 += v11;
                    v4 += v9;
                    v40 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v16 += v6;
                    v3 += v8;
                }

                return;
            }
        }

        v11 = v27;
        v9 = v28;
        v12 = v29;
        if(v2 <= v3) {
            if(v2 >= v0.bt * 0xBD9472B6) {
                return;
            }

            v18 = -482049717;
            if(v3 > v0.bt * v18) {
                v3 = v0.bt * v18;
            }

            v15 = v3;
            if(v1 > v0.bt * v18) {
                v1 = 0xDB3A50CF * v0.bt;
            }

            v3 = v1;
            v1 = (arg63 << 9) - v14_1 * arg60 + v14_1;
            v18 = 0xF7F729AF;
            if(v15 < v3) {
                v4 = arg60 << 14;
                if(v2 < 0) {
                    v7 = v4 - v2 * v9;
                    v4 -= v2 * v11;
                    v1 -= v2 * v13;
                    v2 = 0;
                    v54 = v7;
                    v7 = v1;
                    v1 = v4;
                    v4 = v54;
                }
                else {
                    v7 = v1;
                    v1 = v4;
                }

                v10 = arg61 << 14;
                if(v15 < 0) {
                    v10 -= v15 * v12;
                    v43 = v1;
                    v15 = 0;
                }
                else {
                    v43 = v1;
                }

                v1 = v2 - v0.bo * v18;
                v24 += v1 * v32;
                v16 = v31 + v1 * v6;
                v1 = v33 + v1 * v8;
                if(v2 != v15 && v9 < v11 || v15 == v2 && v9 > v12) {
                    v3 -= v15;
                    v15 -= v2;
                    v44 = v1;
                    v1 = v0.bz[v2];
                    while(true) {
                        --v15;
                        if(v15 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v43 >> 14, v7, v14_1, v24, v16, v44, v30, v5, v34, 902900144);
                            v4 += v9;
                            v43 += v11;
                            v7 += v13;
                            v1 += v0.at * 0xFEEE8863;
                            v24 += v32;
                            v16 += v6;
                            v44 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v3;
                        if(v3 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v10 >> 14, v7, v14_1, v24, v16, v44, v30, v5, v34, 902900144);
                        v4 += v9;
                        v10 += v12;
                        v7 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v16 += v6;
                        v44 += v8;
                    }

                    return;
                }

                v44 = v1;
                v3 -= v15;
                v15 -= v2;
                v1 = v0.bz[v2];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v43 >> 14, v4 >> 14, v7, v14_1, v24, v16, v44, v30, v5, v34, 902900144);
                        v4 += v9;
                        v43 += v11;
                        v7 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v16 += v6;
                        v44 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v10 >> 14, v4 >> 14, v7, v14_1, v24, v16, v44, v30, v5, v34, 902900144);
                    v4 += v9;
                    v10 += v12;
                    v7 += v13;
                    v1 += v0.at * 442000929;
                    v24 += v32;
                    v16 += v6;
                    v44 += v8;
                }

                return;
            }

            v7 = arg60 << 14;
            if(v2 < 0) {
                v10 = v7 - v2 * v9;
                v7 -= v2 * v11;
                v1 -= v2 * v13;
                v2 = 0;
            }
            else {
                v10 = v7;
            }

            v4 = arg59 << 14;
            if(v3 < 0) {
                v4 -= v3 * v12;
                v16 = 0;
            }
            else {
                v16 = v3;
            }

            v3 = v2 - v0.bo * v18;
            v24 += v32 * v3;
            v18 = v31 + v6 * v3;
            v3 = v33 + v3 * v8;
            if(v9 < v11) {
                v15 -= v16;
                v16 -= v2;
                v45 = v1;
                v1 = v0.bz[v2];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v10 >> 14, v7 >> 14, v45, v14_1, v24, v18, v3, v30, v5, v34, 902900144);
                        v10 += v9;
                        v7 += v11;
                        v45 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v32;
                        v18 += v6;
                        v3 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v45, v14_1, v24, v18, v3, v30, v5, v34, 902900144);
                    v4 += v12;
                    v7 += v11;
                    v45 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v18 += v6;
                    v3 += v8;
                }

                return;
            }

            v45 = v1;
            v15 -= v16;
            v16 -= v2;
            v1 = v0.bz[v2];
            while(true) {
                --v16;
                if(v16 < 0) {
                    break;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v10 >> 14, v45, v14_1, v24, v18, v3, v30, v5, v34, 902900144);
                v10 += v9;
                v7 += v11;
                v45 += v13;
                v1 += v0.at * 0x4AF0733C;
                v24 += v32;
                v18 += v6;
                v3 += v8;
                v4 = v4;
            }

            int v46 = v4;
            while(true) {
                --v15;
                if(v15 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v46 >> 14, v45, v14_1, v24, v18, v3, v30, v5, v34, 902900144);
                v46 += v12;
                v7 += v11;
                v45 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v32;
                v18 += v6;
                v3 += v8;
            }

            return;
        }

        if(v3 >= v0.bt * -1629871033) {
            return;
        }

        int v47 = v9;
        if(v1 > v0.bt * 0x400406C1) {
            v1 = 0x48B4EAE0 * v0.bt;
        }

        v15 = v1;
        if(v2 > v0.bt * 0x78F5FDC7) {
            v2 = v0.bt * 0xF6865E7F;
        }

        v9 = v47;
        v1 = (arg64 << 9) - arg61 * v14_1 + v14_1;
        if(v15 < v2) {
            v7 = arg61 << 14;
            if(v3 < 0) {
                v10 = v7 - v11 * v3;
                v7 -= v3 * v12;
                v1 -= v3 * v13;
                v3 = 0;
                v54 = v10;
                v10 = v1;
                v1 = v7;
                v7 = v54;
            }
            else {
                v10 = v1;
                v1 = v7;
            }

            v4 = arg59 << 14;
            if(v15 < 0) {
                v4 -= v15 * v9;
                v15 = 0;
            }

            int v48 = v1;
            v1 = v3 - v0.bo * 340544562;
            v24 += v32 * v1;
            v16 = v31 + v6 * v1;
            v1 = v33 + v1 * v8;
            if(v11 < v12) {
                v2 -= v15;
                v15 -= v3;
                v49 = v1;
                v1 = v0.bz[v3];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v48 >> 14, v10, v14_1, v24, v16, v49, v30, v5, v34, 902900144);
                        v7 += v11;
                        v48 += v12;
                        v10 += v13;
                        v1 += v0.at * 0x87099299;
                        v24 += v32;
                        v16 += v6;
                        v49 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v2;
                    if(v2 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v10, v14_1, v24, v16, v49, v30, v5, v34, 902900144);
                    v7 += v11;
                    v4 += v9;
                    v10 += v13;
                    v1 += v0.at * 0xB362A1DC;
                    v24 += v32;
                    v16 += v6;
                    v49 += v8;
                }

                return;
            }

            v49 = v1;
            v2 -= v15;
            v15 -= v3;
            v1 = v0.bz[v3];
            while(true) {
                --v15;
                if(v15 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v48 >> 14, v7 >> 14, v10, v14_1, v24, v16, v49, v30, v5, v34, 902900144);
                    v7 += v11;
                    v48 += v12;
                    v10 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v32;
                    v16 += v6;
                    v49 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v2;
                if(v2 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v10, v14_1, v24, v16, v49, v30, v5, v34, 902900144);
                v7 += v11;
                v4 += v9;
                v10 += v13;
                v1 += v0.at * -919223900;
                v24 += v32;
                v16 += v6;
                v49 += v8;
            }

            return;
        }

        v4 = arg61 << 14;
        if(v3 < 0) {
            v10 = v4 - v11 * v3;
            v4 -= v12 * v3;
            v1 -= v3 * v13;
            v3 = 0;
            v54 = v10;
            v10 = v1;
            v1 = v4;
            v4 = v54;
        }
        else {
            v10 = v1;
            v1 = v4;
        }

        v7 = arg60 << 14;
        if(v2 < 0) {
            v7 -= v2 * v9;
            v16 = 0;
        }
        else {
            v16 = v2;
        }

        int v50 = v1;
        v1 = v3 - v0.bo * 0x9BE79476;
        v24 += v1 * v32;
        v2 = v31 + v6 * v1;
        v1 = v33 + v1 * v8;
        if(v11 < v12) {
            v15 -= v16;
            v16 -= v3;
            v51 = v1;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v50 >> 14, v10, v14_1, v24, v2, v51, v30, v5, v34, 902900144);
                    v50 += v12;
                    v10 += v13;
                    v1 += v0.at * 303844806;
                    v24 += v32;
                    v2 += v6;
                    v51 += v8;
                    v4 += v11;
                    continue;
                }

                break;
            }

            while(true) {
                --v15;
                if(v15 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v50 >> 14, v10, v14_1, v24, v2, v51, v30, v5, v34, 902900144);
                v7 += v9;
                v50 += v12;
                v10 += v13;
                v1 += v0.at * 0x240E580C;
                v24 += v32;
                v2 += v6;
                v51 += v8;
            }

            return;
        }

        v51 = v1;
        v15 -= v16;
        v16 -= v3;
        v1 = v0.bz[v3];
        while(true) {
            --v16;
            if(v16 >= 0) {
                this.ay(v0.ax, v17, 0, 0, v1, v50 >> 14, v4 >> 14, v10, v14_1, v24, v2, v51, v30, v5, v34, 902900144);
                v50 += v12;
                v10 += v13;
                v1 += v0.at * 0x76831DFE;
                v24 += v32;
                v2 += v6;
                v51 += v8;
                v4 += v11;
                continue;
            }

            break;
        }

        while(true) {
            --v15;
            if(v15 < 0) {
                return;
            }

            this.ay(v0.ax, v17, 0, 0, v1, v50 >> 14, v7 >> 14, v10, v14_1, v24, v2, v51, v30, v5, v34, 902900144);
            v7 += v9;
            v50 += v12;
            v10 += v13;
            v1 += v0.at * 0x9D1A94D1;
            v24 += v32;
            v2 += v6;
            v51 += v8;
        }
    }

    final void dt(int arg50, int arg51, int arg52, int arg53, int arg54, int arg55, int arg56, int arg57, int arg58, int arg59, int arg60, int arg61, int arg62, int arg63, int arg64, int arg65, int arg66, int arg67, int arg68) {
        int v45;
        int v44;
        int v43;
        int v16;
        int v42;
        int v48;
        int v39;
        int v11;
        int v36;
        int v35;
        int v12;
        int v4;
        int v10;
        bj v0 = this;
        int v1 = arg50;
        int v2 = arg51;
        int v3 = arg52;
        int v7 = arg56;
        int v8 = arg57;
        int v9 = arg58;
        int v13 = arg68;
        int[] v14 = ii.au.ae(v13, 100);
        if(v14 == null) {
            v10 = ii.au.ar(v13, 0xBF150439);
            this.an(arg50, arg51, arg52, arg53, arg54, arg55, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
            return;
        }

        int[] v17 = v14;
        v0.ba = ii.au.ap(v13, 0xD44565D8);
        v0.bd = ii.au.an(v13, 0xF9F0F409);
        v13 = arg54 - arg53;
        int v14_1 = v2 - v1;
        int v15 = arg55 - arg53;
        int v18 = v3 - v1;
        int v19 = v8 - v7;
        int v20 = v9 - v7;
        v9 = v1 != v2 ? (v13 << 14) / v14_1 : 0;
        int v21 = 14;
        v8 = v2 != v3 ? (arg55 - arg54 << 14) / (v3 - v2) : 0;
        int v6 = v1 != v3 ? (arg53 - arg55 << 14) / (v1 - v3) : 0;
        int v22 = v13 * v18 - v15 * v14_1;
        if(v22 == 0) {
            return;
        }

        v14_1 = (v18 * v19 - v14_1 * v20 << 9) / v22;
        v13 = (v13 * v20 - v19 * v15 << 9) / v22;
        v15 = arg59 - arg60;
        v18 = arg62 - arg63;
        v19 = arg65 - arg66;
        v20 = arg61 - arg59;
        v22 = arg64 - arg62;
        int v23 = arg67 - arg65;
        int v24 = arg62 * v20 - arg59 * v22 << 14;
        int v27 = v8;
        int v28 = v9;
        int v29 = v6;
        int v30 = ((int)(((((long)(arg65 * v22 - arg62 * v23))) << v21) / (((long)(v0.bp * 574766503)))));
        int v31 = ((int)(((((long)(arg59 * v23 - v20 * arg65))) << v21) / (((long)(v0.bp * 574766503)))));
        int v32 = v15 * arg62 - v18 * arg59 << 14;
        int v5 = ((int)(((((long)(arg65 * v18 - arg62 * v19))) << v21) / (((long)(v0.bp * 574766503)))));
        v6 = ((int)(((((long)(v19 * arg59 - v15 * arg65))) << v21) / (((long)(v0.bp * 574766503)))));
        int v33 = v20 * v18 - v22 * v15 << 14;
        int v34 = ((int)(((((long)(v22 * v19 - v18 * v23))) << v21) / (((long)(v0.bp * 574766503)))));
        v8 = ((int)(((((long)(v15 * v23 - v20 * v19))) << v21) / (((long)(v0.bp * 574766503)))));
        v9 = 0xF7F729AF;
        v10 = -482049717;
        if(v1 <= v2 && v1 <= v3) {
            if(v1 >= v0.bt * v10) {
                return;
            }
            else {
                if(v2 > v0.bt * v10) {
                    v2 = v0.bt * v10;
                }

                v15 = v2;
                v2 = v3 > v0.bt * v10 ? v0.bt * v10 : v3;
                v3 = (v7 << 9) - v14_1 * arg53 + v14_1;
                if(v15 >= v2) {
                    goto label_400;
                }

                v4 = arg53 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v29;
                    v4 -= v1 * v28;
                    v10 = v3 - v1 * v13;
                    v3 = v7;
                    v1 = 0;
                }
                else {
                    v10 = v3;
                    v3 = v4;
                }

                v7 = arg54 << 14;
                if(v15 < 0) {
                    v7 -= v15 * v27;
                    v15 = 0;
                }

                v9 = v1 - v0.bo * v9;
                v24 += v9 * v31;
                v12 = v32 + v6 * v9;
                v9 = v33 + v9 * v8;
                if(v15 != v1) {
                    v35 = v9;
                    v36 = v10;
                    v10 = v28;
                    v9 = v29;
                    if(v9 >= v10) {
                        goto label_240;
                    }
                    else {
                        v11 = v27;
                    }
                }
                else {
                    v35 = v9;
                    v36 = v10;
                    v10 = v28;
                    v9 = v29;
                label_240:
                    if(v15 == v1) {
                        v11 = v27;
                        if(v9 > v11) {
                            goto label_243;
                        }
                    }
                    else {
                        goto label_321;
                    }

                    goto label_322;
                }

            label_243:
                v2 -= v15;
                v15 -= v1;
                int v37 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v4 >> 14, v36, v14_1, v24, v12, v35, v30, v5, v34, 902900144);
                        v3 += v9;
                        v4 += v10;
                        v36 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v35 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v37;
                    if(v37 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v3 >> 14, v7 >> 14, v36, v14_1, v24, v12, v35, v30, v5, v34, 902900144);
                    v3 += v9;
                    v7 += v11;
                    v36 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v6;
                    v35 += v8;
                }

                return;
            label_321:
                v11 = v27;
            label_322:
                v2 -= v15;
                v15 -= v1;
                int v38 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v3 >> 14, v36, v14_1, v24, v12, v35, v30, v5, v34, 902900144);
                        v3 += v9;
                        v4 += v10;
                        v36 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v35 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v38;
                    if(v38 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v3 >> 14, v36, v14_1, v24, v12, v35, v30, v5, v34, 902900144);
                    v3 += v9;
                    v7 += v11;
                    v36 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v6;
                    v35 += v8;
                }

                return;
            label_400:
                v11 = v27;
                v10 = v28;
                v9 = v29;
                v12 = 0xF7F729AF;
                v4 = arg53 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v9;
                    v4 -= v1 * v10;
                    v18 = v3 - v1 * v13;
                    v1 = v9;
                    v3 = 0;
                }
                else {
                    v18 = v3;
                    v7 = v4;
                    v3 = v1;
                    v1 = v9;
                }

                v9 = arg55 << 14;
                if(v2 < 0) {
                    v9 -= v2 * v11;
                    v39 = v4;
                    v2 = 0;
                }
                else {
                    v39 = v4;
                }

                v4 = v3 - v0.bo * v12;
                v24 += v31 * v4;
                v12 = v32 + v4 * v6;
                v4 = v33 + v4 * v8;
                if(v2 != v3 && v1 < v10 || v2 == v3 && v11 > v10) {
                    v15 -= v2;
                    int v40 = v2 - v3;
                    v2 = v0.bz[v3];
                    while(true) {
                        --v40;
                        if(v40 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v2, v7 >> 14, v39 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 902900144);
                            v7 += v1;
                            v39 += v10;
                            v18 += v13;
                            v2 += v0.at * 0xFEEE8863;
                            v24 += v31;
                            v12 += v6;
                            v4 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v2, v9 >> 14, v39 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 902900144);
                        v9 += v11;
                        v39 += v10;
                        v18 += v13;
                        v2 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v4 += v8;
                    }

                    return;
                }

                v15 -= v2;
                int v41 = v2 - v3;
                v2 = v0.bz[v3];
                while(true) {
                    --v41;
                    if(v41 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v2, v39 >> 14, v7 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 902900144);
                        v7 += v1;
                        v39 += v10;
                        v18 += v13;
                        v2 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v4 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v2, v39 >> 14, v9 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 902900144);
                    v9 += v11;
                    v39 += v10;
                    v18 += v13;
                    v2 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v6;
                    v4 += v8;
                }

                return;
            }
        }

        v11 = v27;
        v10 = v28;
        v15 = v29;
        v18 = -482049717;
        if(v2 <= v3) {
            if(v2 >= v0.bt * v18) {
                return;
            }

            if(v3 > v0.bt * v18) {
                v3 = v0.bt * v18;
            }

            if(v1 > v0.bt * v18) {
                v1 = v0.bt * v18;
            }

            v12 = v11;
            v11 = v1;
            v1 = (arg57 << 9) - v14_1 * arg54 + v14_1;
            if(v3 < v11) {
                v4 = arg54 << 14;
                if(v2 < 0) {
                    v7 = v4 - v2 * v10;
                    v4 -= v2 * v12;
                    v1 -= v2 * v13;
                    v2 = 0;
                    v48 = v7;
                    v7 = v1;
                    v1 = v4;
                    v4 = v48;
                }
                else {
                    v7 = v1;
                    v1 = v4;
                }

                v9 = arg55 << 14;
                if(v3 < 0) {
                    v9 -= v3 * v15;
                    v42 = v1;
                    v3 = 0;
                }
                else {
                    v42 = v1;
                }

                v1 = v2 - v0.bo * 0xF7F729AF;
                v24 += v1 * v31;
                v16 = v32 + v1 * v6;
                v1 = v33 + v1 * v8;
                if(v2 != v3 && v10 < v12 || v3 == v2 && v10 > v15) {
                    v11 -= v3;
                    v3 -= v2;
                    v43 = v1;
                    v1 = v0.bz[v2];
                    while(true) {
                        --v3;
                        if(v3 >= 0) {
                            this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v42 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 902900144);
                            v4 += v10;
                            v42 += v12;
                            v7 += v13;
                            v1 += v0.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v6;
                            v43 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v11;
                        if(v11 < 0) {
                            return;
                        }

                        this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v9 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 902900144);
                        v4 += v10;
                        v9 += v15;
                        v7 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v43 += v8;
                    }

                    return;
                }

                v43 = v1;
                v11 -= v3;
                v3 -= v2;
                v1 = v0.bz[v2];
                while(true) {
                    --v3;
                    if(v3 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v42 >> 14, v4 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 902900144);
                        v4 += v10;
                        v42 += v12;
                        v7 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v43 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v11;
                    if(v11 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v9 >> 14, v4 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 902900144);
                    v4 += v10;
                    v9 += v15;
                    v7 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v16 += v6;
                    v43 += v8;
                }

                return;
            }

            v7 = arg54 << 14;
            if(v2 < 0) {
                v9 = v7 - v2 * v10;
                v7 -= v2 * v12;
                v1 -= v2 * v13;
                v2 = 0;
            }
            else {
                v9 = v7;
            }

            v4 = arg53 << 14;
            if(v11 < 0) {
                v4 -= v11 * v15;
                v16 = 0;
            }
            else {
                v16 = v11;
            }

            v11 = v2 - v0.bo * 0xF7F729AF;
            v24 += v31 * v11;
            v18 = v32 + v6 * v11;
            v11 = v33 + v11 * v8;
            if(v10 < v12) {
                v3 -= v16;
                v16 -= v2;
                v44 = v1;
                v1 = v0.bz[v2];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v9 >> 14, v7 >> 14, v44, v14_1, v24, v18, v11, v30, v5, v34, 902900144);
                        v9 += v10;
                        v7 += v12;
                        v44 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v18 += v6;
                        v11 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v44, v14_1, v24, v18, v11, v30, v5, v34, 902900144);
                    v4 += v15;
                    v7 += v12;
                    v44 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v11 += v8;
                }

                return;
            }

            v44 = v1;
            v3 -= v16;
            v16 -= v2;
            v1 = v0.bz[v2];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v9 >> 14, v44, v14_1, v24, v18, v11, v30, v5, v34, 902900144);
                    v9 += v10;
                    v7 += v12;
                    v44 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v11 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v3;
                if(v3 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v44, v14_1, v24, v18, v11, v30, v5, v34, 902900144);
                v4 += v15;
                v7 += v12;
                v44 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v11 += v8;
            }

            return;
        }

        v12 = v11;
        if(v3 >= v0.bt * v18) {
            return;
        }

        if(v1 > v0.bt * v18) {
            v1 = v0.bt * v18;
        }

        if(v2 > v0.bt * v18) {
            v2 = v0.bt * v18;
        }

        v11 = v10;
        v10 = v2;
        v2 = (arg58 << 9) - arg55 * v14_1 + v14_1;
        if(v1 < v10) {
            v7 = arg55 << 14;
            if(v3 < 0) {
                v9 = v7 - v12 * v3;
                v7 -= v3 * v15;
                v2 -= v3 * v13;
                v3 = 0;
                v48 = v9;
                v9 = v2;
                v2 = v7;
                v7 = v48;
            }
            else {
                v9 = v2;
                v2 = v7;
            }

            v4 = arg53 << 14;
            if(v1 < 0) {
                v4 -= v1 * v11;
                v16 = 0;
            }
            else {
                v16 = v1;
            }

            v1 = v3 - v0.bo * 0xF7F729AF;
            v24 += v31 * v1;
            v18 = v32 + v6 * v1;
            v1 = v33 + v1 * v8;
            if(v12 < v15) {
                v10 -= v16;
                v16 -= v3;
                v45 = v1;
                v1 = v0.bz[v3];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v2 >> 14, v9, v14_1, v24, v18, v45, v30, v5, v34, 902900144);
                        v7 += v12;
                        v2 += v15;
                        v9 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v18 += v6;
                        v45 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v10;
                    if(v10 < 0) {
                        return;
                    }

                    this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v9, v14_1, v24, v18, v45, v30, v5, v34, 902900144);
                    v7 += v12;
                    v4 += v11;
                    v9 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v45 += v8;
                }

                return;
            }

            v45 = v1;
            v10 -= v16;
            v16 -= v3;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v2 >> 14, v7 >> 14, v9, v14_1, v24, v18, v45, v30, v5, v34, 902900144);
                    v7 += v12;
                    v2 += v15;
                    v9 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v45 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v10;
                if(v10 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v9, v14_1, v24, v18, v45, v30, v5, v34, 902900144);
                v7 += v12;
                v4 += v11;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v45 += v8;
            }

            return;
        }

        v4 = arg55 << 14;
        if(v3 < 0) {
            v9 = v4 - v12 * v3;
            v4 -= v15 * v3;
            v2 -= v3 * v13;
            v3 = 0;
            v48 = v9;
            v9 = v2;
            v2 = v4;
            v4 = v48;
        }
        else {
            v9 = v2;
            v2 = v4;
        }

        v7 = arg54 << 14;
        if(v10 < 0) {
            v7 -= v10 * v11;
            v16 = 0;
        }
        else {
            v16 = v10;
        }

        v10 = v3 - v0.bo * 0xF7F729AF;
        v24 += v10 * v31;
        v18 = v32 + v6 * v10;
        v10 = v33 + v10 * v8;
        if(v12 < v15) {
            v1 -= v16;
            v16 -= v3;
            int v46 = v1;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ay(v0.ax, v17, 0, 0, v1, v4 >> 14, v2 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 902900144);
                    v4 += v12;
                    v2 += v15;
                    v9 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v10 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v46;
                if(v46 < 0) {
                    return;
                }

                this.ay(v0.ax, v17, 0, 0, v1, v7 >> 14, v2 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 902900144);
                v7 += v11;
                v2 += v15;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v10 += v8;
            }

            return;
        }

        v1 -= v16;
        v16 -= v3;
        int v47 = v1;
        v1 = v0.bz[v3];
        while(true) {
            --v16;
            if(v16 >= 0) {
                this.ay(v0.ax, v17, 0, 0, v1, v2 >> 14, v4 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 902900144);
                v4 += v12;
                v2 += v15;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v10 += v8;
                continue;
            }

            break;
        }

        while(true) {
            --v47;
            if(v47 < 0) {
                return;
            }

            this.ay(v0.ax, v17, 0, 0, v1, v2 >> 14, v7 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 902900144);
            v7 += v11;
            v2 += v15;
            v9 += v13;
            v1 += v0.at * 0xFEEE8863;
            v24 += v31;
            v18 += v6;
            v10 += v8;
        }
    }

    final void dx(int arg50, int arg51, int arg52, int arg53, int arg54, int arg55, int arg56, int arg57, int arg58, int arg59, int arg60, int arg61, int arg62, int arg63, int arg64, int arg65, int arg66, int arg67, int arg68) {
        int v45;
        int v44;
        int v43;
        int v16;
        int v42;
        int v48;
        int v39;
        int v11;
        int v36;
        int v35;
        int v12;
        int v4;
        int v10;
        bj v0 = this;
        int v1 = arg50;
        int v2 = arg51;
        int v3 = arg52;
        int v7 = arg56;
        int v8 = arg57;
        int v9 = arg58;
        int v13 = arg68;
        int[] v14 = ii.au.ae(v13, 0x4F);
        if(v14 == null) {
            v10 = ii.au.ar(v13, 0x370EFF64);
            this.an(arg50, arg51, arg52, arg53, arg54, arg55, io.bh(v10, v7, 0), io.bh(v10, v8, 0), io.bh(v10, v9, 0), 86805035);
            return;
        }

        int[] v17 = v14;
        v0.ba = ii.au.ap(v13, 0x669CF445);
        v0.bd = ii.au.an(v13, -1447260787);
        v13 = arg54 - arg53;
        int v14_1 = v2 - v1;
        int v15 = arg55 - arg53;
        int v18 = v3 - v1;
        int v19 = v8 - v7;
        int v20 = v9 - v7;
        v9 = v1 != v2 ? (v13 << 14) / v14_1 : 0;
        int v21 = 14;
        v8 = v2 != v3 ? (arg55 - arg54 << 14) / (v3 - v2) : 0;
        int v6 = v1 != v3 ? (arg53 - arg55 << 14) / (v1 - v3) : 0;
        int v22 = v18 * v13 - v15 * v14_1;
        if(v22 == 0) {
            return;
        }

        v14_1 = (v18 * v19 - v14_1 * v20 << 9) / v22;
        v13 = (v20 * v13 - v19 * v15 << 9) / v22;
        v15 = arg59 - arg60;
        v18 = arg62 - arg63;
        v19 = arg65 - arg66;
        v20 = arg61 - arg59;
        v22 = arg64 - arg62;
        int v23 = arg67 - arg65;
        int v24 = arg62 * v20 - v22 * arg59 << 14;
        int v27 = v8;
        int v28 = v9;
        int v29 = v6;
        int v30 = ((int)(((((long)(v22 * arg65 - arg62 * v23))) << 3 << v21) / (((long)(v0.bp * 574766503)))));
        int v31 = ((int)(((((long)(v23 * arg59 - v20 * arg65))) << v21) / (((long)(v0.bp * 574766503)))));
        int v32 = v15 * arg62 - v18 * arg59 << 14;
        int v5 = ((int)(((((long)(v18 * arg65 - arg62 * v19))) << 3 << v21) / (((long)(v0.bp * 574766503)))));
        v6 = ((int)(((((long)(v19 * arg59 - arg65 * v15))) << v21) / (((long)(v0.bp * 574766503)))));
        int v33 = v20 * v18 - v22 * v15 << 14;
        int v34 = ((int)(((((long)(v22 * v19 - v18 * v23))) << 3 << v21) / (((long)(v0.bp * 574766503)))));
        v8 = ((int)(((((long)(v15 * v23 - v19 * v20))) << v21) / (((long)(v0.bp * 574766503)))));
        v9 = 0xF7F729AF;
        v10 = -482049717;
        if(v1 <= v2 && v1 <= v3) {
            if(v1 >= v0.bt * v10) {
                return;
            }
            else {
                if(v2 > v0.bt * v10) {
                    v2 = v0.bt * v10;
                }

                v15 = v2;
                v2 = v3 > v0.bt * v10 ? v0.bt * v10 : v3;
                v3 = (v7 << 9) - arg53 * v14_1 + v14_1;
                if(v15 >= v2) {
                    goto label_404;
                }

                v4 = arg53 << 14;
                if(v1 < 0) {
                    v7 = v4 - v29 * v1;
                    v4 -= v28 * v1;
                    v10 = v3 - v1 * v13;
                    v3 = v7;
                    v1 = 0;
                }
                else {
                    v10 = v3;
                    v3 = v4;
                }

                v7 = arg54 << 14;
                if(v15 < 0) {
                    v7 -= v27 * v15;
                    v15 = 0;
                }

                v9 = v1 - v0.bo * v9;
                v24 += v9 * v31;
                v12 = v32 + v6 * v9;
                v9 = v33 + v9 * v8;
                if(v15 != v1) {
                    v35 = v9;
                    v36 = v10;
                    v10 = v28;
                    v9 = v29;
                    if(v9 >= v10) {
                        goto label_244;
                    }
                    else {
                        v11 = v27;
                    }
                }
                else {
                    v35 = v9;
                    v36 = v10;
                    v10 = v28;
                    v9 = v29;
                label_244:
                    if(v1 == v15) {
                        v11 = v27;
                        if(v9 > v11) {
                            goto label_247;
                        }
                    }
                    else {
                        goto label_325;
                    }

                    goto label_326;
                }

            label_247:
                v2 -= v15;
                v15 -= v1;
                int v37 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v3 >> 14, v4 >> 14, v36, v14_1, v24, v12, v35, v30, v5, v34, 1);
                        v3 += v9;
                        v4 += v10;
                        v36 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v35 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v37;
                    if(v37 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v3 >> 14, v7 >> 14, v36, v14_1, v24, v12, v35, v30, v5, v34, 1);
                    v3 += v9;
                    v7 += v11;
                    v36 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v6;
                    v35 += v8;
                }

                return;
            label_325:
                v11 = v27;
            label_326:
                v2 -= v15;
                v15 -= v1;
                int v38 = v2;
                v1 = v0.bz[v1];
                while(true) {
                    --v15;
                    if(v15 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v4 >> 14, v3 >> 14, v36, v14_1, v24, v12, v35, v30, v5, v34, 1);
                        v3 += v9;
                        v4 += v10;
                        v36 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v35 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v38;
                    if(v38 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v3 >> 14, v36, v14_1, v24, v12, v35, v30, v5, v34, 1);
                    v3 += v9;
                    v7 += v11;
                    v36 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v6;
                    v35 += v8;
                }

                return;
            label_404:
                v11 = v27;
                v10 = v28;
                v9 = v29;
                v12 = 0xF7F729AF;
                v4 = arg53 << 14;
                if(v1 < 0) {
                    v7 = v4 - v1 * v9;
                    v4 -= v1 * v10;
                    v18 = v3 - v1 * v13;
                    v1 = v9;
                    v3 = 0;
                }
                else {
                    v18 = v3;
                    v7 = v4;
                    v3 = v1;
                    v1 = v9;
                }

                v9 = arg55 << 14;
                if(v2 < 0) {
                    v9 -= v2 * v11;
                    v39 = v4;
                    v2 = 0;
                }
                else {
                    v39 = v4;
                }

                v4 = v3 - v0.bo * v12;
                v24 += v31 * v4;
                v12 = v32 + v6 * v4;
                v4 = v33 + v4 * v8;
                if(v2 != v3 && v1 < v10 || v3 == v2 && v11 > v10) {
                    v15 -= v2;
                    int v40 = v2 - v3;
                    v2 = v0.bz[v3];
                    while(true) {
                        --v40;
                        if(v40 >= 0) {
                            this.ah(v0.ax, v17, 0, 0, v2, v7 >> 14, v39 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 1);
                            v7 += v1;
                            v39 += v10;
                            v18 += v13;
                            v2 += v0.at * 0xFEEE8863;
                            v24 += v31;
                            v12 += v6;
                            v4 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v15;
                        if(v15 < 0) {
                            return;
                        }

                        this.ah(v0.ax, v17, 0, 0, v2, v9 >> 14, v39 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 1);
                        v9 += v11;
                        v39 += v10;
                        v18 += v13;
                        v2 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v4 += v8;
                    }

                    return;
                }

                v15 -= v2;
                int v41 = v2 - v3;
                v2 = v0.bz[v3];
                while(true) {
                    --v41;
                    if(v41 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v2, v39 >> 14, v7 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 1);
                        v7 += v1;
                        v39 += v10;
                        v18 += v13;
                        v2 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v12 += v6;
                        v4 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v15;
                    if(v15 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v2, v39 >> 14, v9 >> 14, v18, v14_1, v24, v12, v4, v30, v5, v34, 1);
                    v9 += v11;
                    v39 += v10;
                    v18 += v13;
                    v2 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v12 += v6;
                    v4 += v8;
                }

                return;
            }
        }

        v11 = v27;
        v10 = v28;
        v15 = v29;
        v18 = -482049717;
        if(v2 <= v3) {
            if(v2 >= v0.bt * v18) {
                return;
            }

            if(v3 > v0.bt * v18) {
                v3 = v0.bt * v18;
            }

            if(v1 > v0.bt * v18) {
                v1 = v0.bt * v18;
            }

            v12 = v11;
            v11 = v1;
            v1 = (arg57 << 9) - arg54 * v14_1 + v14_1;
            if(v3 < v11) {
                v4 = arg54 << 14;
                if(v2 < 0) {
                    v7 = v4 - v10 * v2;
                    v4 -= v2 * v12;
                    v1 -= v2 * v13;
                    v2 = 0;
                    v48 = v7;
                    v7 = v1;
                    v1 = v4;
                    v4 = v48;
                }
                else {
                    v7 = v1;
                    v1 = v4;
                }

                v9 = arg55 << 14;
                if(v3 < 0) {
                    v9 -= v3 * v15;
                    v42 = v1;
                    v3 = 0;
                }
                else {
                    v42 = v1;
                }

                v1 = v2 - v0.bo * 0xF7F729AF;
                v24 += v1 * v31;
                v16 = v32 + v6 * v1;
                v1 = v33 + v1 * v8;
                if(v3 != v2 && v10 < v12 || v3 == v2 && v10 > v15) {
                    v11 -= v3;
                    v3 -= v2;
                    v43 = v1;
                    v1 = v0.bz[v2];
                    while(true) {
                        --v3;
                        if(v3 >= 0) {
                            this.ah(v0.ax, v17, 0, 0, v1, v4 >> 14, v42 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 1);
                            v4 += v10;
                            v42 += v12;
                            v7 += v13;
                            v1 += v0.at * 0xFEEE8863;
                            v24 += v31;
                            v16 += v6;
                            v43 += v8;
                            continue;
                        }

                        break;
                    }

                    while(true) {
                        --v11;
                        if(v11 < 0) {
                            return;
                        }

                        this.ah(v0.ax, v17, 0, 0, v1, v4 >> 14, v9 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 1);
                        v4 += v10;
                        v9 += v15;
                        v7 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v43 += v8;
                    }

                    return;
                }

                v43 = v1;
                v11 -= v3;
                v3 -= v2;
                v1 = v0.bz[v2];
                while(true) {
                    --v3;
                    if(v3 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v42 >> 14, v4 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 1);
                        v4 += v10;
                        v42 += v12;
                        v7 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v16 += v6;
                        v43 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v11;
                    if(v11 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v9 >> 14, v4 >> 14, v7, v14_1, v24, v16, v43, v30, v5, v34, 1);
                    v4 += v10;
                    v9 += v15;
                    v7 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v16 += v6;
                    v43 += v8;
                }

                return;
            }

            v7 = arg54 << 14;
            if(v2 < 0) {
                v9 = v7 - v2 * v10;
                v7 -= v2 * v12;
                v1 -= v2 * v13;
                v2 = 0;
            }
            else {
                v9 = v7;
            }

            v4 = arg53 << 14;
            if(v11 < 0) {
                v4 -= v11 * v15;
                v16 = 0;
            }
            else {
                v16 = v11;
            }

            v11 = v2 - v0.bo * 0xF7F729AF;
            v24 += v11 * v31;
            v18 = v32 + v6 * v11;
            v11 = v33 + v11 * v8;
            if(v10 < v12) {
                v3 -= v16;
                v16 -= v2;
                v44 = v1;
                v1 = v0.bz[v2];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v9 >> 14, v7 >> 14, v44, v14_1, v24, v18, v11, v30, v5, v34, 1);
                        v9 += v10;
                        v7 += v12;
                        v44 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v18 += v6;
                        v11 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v3;
                    if(v3 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v44, v14_1, v24, v18, v11, v30, v5, v34, 1);
                    v4 += v15;
                    v7 += v12;
                    v44 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v11 += v8;
                }

                return;
            }

            v44 = v1;
            v3 -= v16;
            v16 -= v2;
            v1 = v0.bz[v2];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v9 >> 14, v44, v14_1, v24, v18, v11, v30, v5, v34, 1);
                    v9 += v10;
                    v7 += v12;
                    v44 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v11 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v3;
                if(v3 < 0) {
                    return;
                }

                this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v44, v14_1, v24, v18, v11, v30, v5, v34, 1);
                v4 += v15;
                v7 += v12;
                v44 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v11 += v8;
            }

            return;
        }

        v12 = v11;
        if(v3 >= v0.bt * v18) {
            return;
        }

        if(v1 > v0.bt * v18) {
            v1 = v0.bt * v18;
        }

        if(v2 > v0.bt * v18) {
            v2 = v0.bt * v18;
        }

        v11 = v10;
        v10 = v2;
        v2 = (arg58 << 9) - arg55 * v14_1 + v14_1;
        if(v1 < v10) {
            v7 = arg55 << 14;
            if(v3 < 0) {
                v9 = v7 - v3 * v12;
                v7 -= v3 * v15;
                v2 -= v3 * v13;
                v3 = 0;
                v48 = v9;
                v9 = v2;
                v2 = v7;
                v7 = v48;
            }
            else {
                v9 = v2;
                v2 = v7;
            }

            v4 = arg53 << 14;
            if(v1 < 0) {
                v4 -= v1 * v11;
                v16 = 0;
            }
            else {
                v16 = v1;
            }

            v1 = v3 - v0.bo * 0xF7F729AF;
            v24 += v1 * v31;
            v18 = v32 + v1 * v6;
            v1 = v33 + v1 * v8;
            if(v12 < v15) {
                v10 -= v16;
                v16 -= v3;
                v45 = v1;
                v1 = v0.bz[v3];
                while(true) {
                    --v16;
                    if(v16 >= 0) {
                        this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v2 >> 14, v9, v14_1, v24, v18, v45, v30, v5, v34, 1);
                        v7 += v12;
                        v2 += v15;
                        v9 += v13;
                        v1 += v0.at * 0xFEEE8863;
                        v24 += v31;
                        v18 += v6;
                        v45 += v8;
                        continue;
                    }

                    break;
                }

                while(true) {
                    --v10;
                    if(v10 < 0) {
                        return;
                    }

                    this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v4 >> 14, v9, v14_1, v24, v18, v45, v30, v5, v34, 1);
                    v7 += v12;
                    v4 += v11;
                    v9 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v45 += v8;
                }

                return;
            }

            v45 = v1;
            v10 -= v16;
            v16 -= v3;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ah(v0.ax, v17, 0, 0, v1, v2 >> 14, v7 >> 14, v9, v14_1, v24, v18, v45, v30, v5, v34, 1);
                    v7 += v12;
                    v2 += v15;
                    v9 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v45 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v10;
                if(v10 < 0) {
                    return;
                }

                this.ah(v0.ax, v17, 0, 0, v1, v4 >> 14, v7 >> 14, v9, v14_1, v24, v18, v45, v30, v5, v34, 1);
                v7 += v12;
                v4 += v11;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v45 += v8;
            }

            return;
        }

        v4 = arg55 << 14;
        if(v3 < 0) {
            v9 = v4 - v3 * v12;
            v4 -= v3 * v15;
            v2 -= v3 * v13;
            v3 = 0;
            v48 = v9;
            v9 = v2;
            v2 = v4;
            v4 = v48;
        }
        else {
            v9 = v2;
            v2 = v4;
        }

        v7 = arg54 << 14;
        if(v10 < 0) {
            v7 -= v10 * v11;
            v16 = 0;
        }
        else {
            v16 = v10;
        }

        v10 = v3 - v0.bo * 0xF7F729AF;
        v24 += v10 * v31;
        v18 = v32 + v10 * v6;
        v10 = v33 + v10 * v8;
        if(v12 < v15) {
            v1 -= v16;
            v16 -= v3;
            int v46 = v1;
            v1 = v0.bz[v3];
            while(true) {
                --v16;
                if(v16 >= 0) {
                    this.ah(v0.ax, v17, 0, 0, v1, v4 >> 14, v2 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 1);
                    v4 += v12;
                    v2 += v15;
                    v9 += v13;
                    v1 += v0.at * 0xFEEE8863;
                    v24 += v31;
                    v18 += v6;
                    v10 += v8;
                    continue;
                }

                break;
            }

            while(true) {
                --v46;
                if(v46 < 0) {
                    return;
                }

                this.ah(v0.ax, v17, 0, 0, v1, v7 >> 14, v2 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 1);
                v7 += v11;
                v2 += v15;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v10 += v8;
            }

            return;
        }

        v1 -= v16;
        v16 -= v3;
        int v47 = v1;
        v1 = v0.bz[v3];
        while(true) {
            --v16;
            if(v16 >= 0) {
                this.ah(v0.ax, v17, 0, 0, v1, v2 >> 14, v4 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 1);
                v4 += v12;
                v2 += v15;
                v9 += v13;
                v1 += v0.at * 0xFEEE8863;
                v24 += v31;
                v18 += v6;
                v10 += v8;
                continue;
            }

            break;
        }

        while(true) {
            --v47;
            if(v47 < 0) {
                return;
            }

            this.ah(v0.ax, v17, 0, 0, v1, v2 >> 14, v7 >> 14, v9, v14_1, v24, v18, v10, v30, v5, v34, 1);
            v7 += v11;
            v2 += v15;
            v9 += v13;
            v1 += v0.at * 0xFEEE8863;
            v24 += v31;
            v18 += v6;
            v10 += v8;
        }
    }

    final void dz(int[] arg28, int[] arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, int arg40, int arg41, int arg42) {
        int v26;
        int v22;
        int v0_1;
        int v21;
        int v1;
        int v17;
        int v15;
        int v6;
        int v10;
        int v4;
        int v3;
        int v2;
        int v7;
        int v5;
        bj v0 = this;
        if(v0.ac) {
            v5 = arg34;
            if(v5 > v0.by * 1109746211) {
                v5 = v0.by * 1109746211;
            }

            if(arg33 >= 0) {
                goto label_16;
            }

            v7 = 0;
        }
        else {
            v5 = arg34;
        label_16:
            v7 = arg33;
        }

        if(v7 >= v5) {
            return;
        }

        int v8 = arg32 + v7;
        int v9 = arg35 + arg36 * v7;
        v5 -= v7;
        int v11 = 0xFF00FF00;
        int v12 = 0xFF00FF;
        int v13 = 0xFF0000;
        int v14 = 0xFF00;
        if(v0.ba) {
            v7 -= v0.bw * 1126407459;
            v2 = arg37 + (arg40 >> 3) * v7;
            v3 = arg38 + (arg41 >> 3) * v7;
            v4 = arg39 + (arg42 >> 3) * v7;
            v7 = v4 >> 12;
            v10 = 0xFC0;
            if(v7 != 0) {
                v6 = v2 / v7;
                v7 = v3 / v7;
                if(v6 < 0) {
                    v6 = 0;
                }
                else if(v6 > v10) {
                    v6 = 0xFC0;
                }
            }
            else {
                v6 = 0;
                v7 = 0;
            }

            v2 += arg40;
            v3 += arg41;
            v4 += arg42;
            v15 = v4 >> 12;
            if(v15 != 0) {
                v10 = v2 / v15;
                v15 = v3 / v15;
                if(v10 < 0) {
                    v17 = v2;
                    v10 = 0;
                }
                else {
                    v17 = v2;
                    if(v10 > 0xFC0) {
                        v10 = 0xFC0;
                    }
                }
            }
            else {
                v17 = v2;
                v10 = 0;
                v15 = 0;
            }

            v2 = (v6 << 20) + v7;
            v7 = (v15 - v7 >> 3) + (v10 - v6 >> 3 << 20);
            v6 = v5 >> 3;
            v1 = arg36 << 3;
            int v18 = v9 >> 8;
            int v19 = v2;
            if(v0.bd) {
                if(v6 > 0) {
                    v2 = v19;
                    while(true) {
                        v19 = v8 + 1;
                        arg28[v8] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) >> 8;
                        v2 += v7;
                        v8 = v19 + 1;
                        arg28[v19] = ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v14) * v18 & v13) + ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v12) * v18 & v11) >> 8;
                        v2 += v7;
                        v19 = v8 + 1;
                        arg28[v8] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) >> 8;
                        v2 += v7;
                        v8 = v19 + 1;
                        arg28[v19] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) >> 8;
                        v2 += v7;
                        v21 = v5;
                        v5 = v8 + 1;
                        arg28[v8] = ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v12) * v18 & v11) + ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v14) * v18 & v13) >> 8;
                        v2 += v7;
                        v8 = v5 + 1;
                        arg28[v5] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) >> 8;
                        v2 += v7;
                        v5 = v8 + 1;
                        arg28[v8] = ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v12) * v18 & v11) + ((arg29[(v2 & 0xFC0) + (v2 >>> 26)] & v14) * v18 & v13) >> 8;
                        v2 += v7;
                        v8 = v5 + 1;
                        arg28[v5] = ((arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v12) * v18 & v11) + (v18 * (arg29[(v2 >>> 26) + (v2 & 0xFC0)] & v14) & v13) >> 8;
                        v17 += arg40;
                        v3 += arg41;
                        v4 += arg42;
                        v0_1 = v4 >> 12;
                        if(v0_1 != 0) {
                            v2 = v17 / v0_1;
                            v0_1 = v3 / v0_1;
                            if(v2 < 0) {
                                goto label_225;
                            }
                            else if(v2 > 0xFC0) {
                                v2 = 0xFC0;
                            }
                        }
                        else {
                            v0_1 = 0;
                        label_225:
                            v2 = 0;
                        }

                        v5 = (v10 << 20) + v15;
                        v7 = (v2 - v10 >> 3 << 20) + (v0_1 - v15 >> 3);
                        v9 += v1;
                        v18 = v9 >> 8;
                        --v6;
                        if(v6 <= 0) {
                            v19 = v5;
                            break;
                        }

                        v15 = v0_1;
                        v10 = v2;
                        v2 = v5;
                        v5 = v21;
                    }
                }
                else {
                    v21 = v5;
                }

                v0_1 = v21 & 7;
                if(v0_1 <= 0) {
                    return;
                }

                v1 = v0_1;
                v0_1 = v19;
                while(true) {
                    v3 = v8 + 1;
                    arg28[v8] = ((arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)] & v12) * v18 & v11) + ((arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)] & v14) * v18 & v13) >> 8;
                    v0_1 += v7;
                    --v1;
                    if(v1 <= 0) {
                        return;
                    }

                    v8 = v3;
                }

                return;
            }

            v21 = v5;
            if(v6 > 0) {
                v0_1 = v19;
                while(true) {
                    v2 = arg29[(v0_1 & 0xFC0) + (v0_1 >>> 26)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v14) * v18 & v13) + ((v2 & v12) * v18 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v12) * v18 & v11) + ((v2 & v14) * v18 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v14) * v18 & v13) + ((v2 & v12) * v18 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v12) * v18 & v11) + ((v2 & v14) * v18 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v12) * v18 & v11) + ((v2 & v14) * v18 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v12) * v18 & v11) + ((v2 & v14) * v18 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v2 = arg29[(v0_1 & 0xFC0) + (v0_1 >>> 26)];
                    if(v2 != 0) {
                        arg28[v8] = ((v2 & v14) * v18 & v13) + ((v2 & v12) * v18 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v0_1 = arg29[(v0_1 & 0xFC0) + (v0_1 >>> 26)];
                    if(v0_1 != 0) {
                        arg28[v8] = ((v0_1 & v14) * v18 & v13) + (v18 * (v0_1 & v12) & v11) >> 8;
                    }

                    ++v8;
                    v17 += arg40;
                    v3 += arg41;
                    v4 += arg42;
                    v0_1 = v4 >> 12;
                    if(v0_1 != 0) {
                        v2 = v17 / v0_1;
                        v0_1 = v3 / v0_1;
                        if(v2 < 0) {
                            v2 = 0;
                        }
                        else if(v2 > 0xFC0) {
                            v2 = 0xFC0;
                        }
                    }
                    else {
                        v0_1 = 0;
                        v2 = 0;
                    }

                    v7 = (v10 << 20) + v15;
                    v10 = (v2 - v10 >> 3 << 20) + (v0_1 - v15 >> 3);
                    v9 += v1;
                    v18 = v9 >> 8;
                    --v6;
                    if(v6 <= 0) {
                        v19 = v7;
                        v7 = v10;
                        break;
                    }

                    v15 = v0_1;
                    v0_1 = v7;
                    v7 = v10;
                    v10 = v2;
                }
            }

            v0_1 = v21 & 7;
            if(v0_1 <= 0) {
                return;
            }

            v1 = v0_1;
            v0_1 = v19;
            do {
                v2 = arg29[(v0_1 >>> 26) + (v0_1 & 0xFC0)];
                if(v2 != 0) {
                    arg28[v8] = ((v2 & v14) * v18 & v13) + ((v2 & v12) * v18 & v11) >> 8;
                }

                ++v8;
                v0_1 += v7;
                --v1;
            }
            while(v1 > 0);
        }
        else {
            v21 = v5;
            bj v5_1 = this;
            v7 -= v5_1.bw * 1126407459;
            v0_1 = arg37 + (arg40 >> 3) * v7;
            v2 = arg38 + (arg41 >> 3) * v7;
            v3 = arg39 + v7 * (arg42 >> 3);
            v4 = v3 >> 14;
            v6 = 0x3F80;
            if(v4 != 0) {
                v7 = v0_1 / v4;
                v4 = v2 / v4;
                if(v7 < 0) {
                    goto label_488;
                }
                else if(v7 > v6) {
                    v7 = 0x3F80;
                }
            }
            else {
                v4 = 0;
            label_488:
                v7 = 0;
            }

            v0_1 += arg40;
            v2 += arg41;
            v3 += arg42;
            v10 = v3 >> 14;
            if(v10 != 0) {
                v6 = v0_1 / v10;
                v10 = v2 / v10;
                if(v6 < 0) {
                    v22 = v0_1;
                    v6 = 0;
                }
                else {
                    v22 = v0_1;
                    if(v6 > 0x3F80) {
                        v6 = 0x3F80;
                    }
                }
            }
            else {
                v22 = v0_1;
                v6 = 0;
                v10 = 0;
            }

            v0_1 = (v7 << 18) + v4;
            v7 = (v6 - v7 >> 3 << 18) + (v10 - v4 >> 3);
            v4 = v21 >> 3;
            v1 = arg36 << 3;
            v15 = v9 >> 8;
            int v23 = v0_1;
            if(v5_1.bd) {
                if(v4 > 0) {
                    v0_1 = v23;
                    while(true) {
                        int v16 = v8 + 1;
                        arg28[v8] = ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v14) * v15 & v13) + ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v12) * v15 & v11) >> 8;
                        v0_1 += v7;
                        v8 = v16 + 1;
                        arg28[v16] = ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v12) * v15 & v11) + ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v14) * v15 & v13) >> 8;
                        v0_1 += v7;
                        v16 = v8 + 1;
                        arg28[v8] = ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v12) * v15 & v11) + ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v14) * v15 & v13) >> 8;
                        v0_1 += v7;
                        v8 = v16 + 1;
                        arg28[v16] = ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v12) * v15 & v11) + ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v14) * v15 & v13) >> 8;
                        v0_1 += v7;
                        v16 = v8 + 1;
                        arg28[v8] = ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v12) * v15 & v11) + ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v14) * v15 & v13) >> 8;
                        v0_1 += v7;
                        v8 = v16 + 1;
                        arg28[v16] = ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v14) * v15 & v13) + ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v12) * v15 & v11) >> 8;
                        v0_1 += v7;
                        int v24 = v4;
                        v5 = v8 + 1;
                        arg28[v8] = ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v12) * v15 & v11) + ((arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)] & v14) * v15 & v13) >> 8;
                        v0_1 += v7;
                        v8 = v5 + 1;
                        arg28[v5] = ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v12) * v15 & v11) + ((arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)] & v14) * v15 & v13) >> 8;
                        v22 += arg40;
                        v2 += arg41;
                        v3 += arg42;
                        v0_1 = v3 >> 14;
                        if(v0_1 != 0) {
                            v4 = v22 / v0_1;
                            v0_1 = v2 / v0_1;
                            if(v4 < 0) {
                                goto label_658;
                            }
                            else if(v4 > 0x3F80) {
                                v4 = 0x3F80;
                            }
                        }
                        else {
                            v0_1 = 0;
                        label_658:
                            v4 = 0;
                        }

                        v5 = (v6 << 18) + v10;
                        v7 = (v0_1 - v10 >> 3) + (v4 - v6 >> 3 << 18);
                        v9 += v1;
                        v15 = v9 >> 8;
                        v6 = v24 - 1;
                        if(v6 <= 0) {
                            break;
                        }

                        v10 = v0_1;
                        v0_1 = v5;
                        v26 = v6;
                        v6 = v4;
                        v4 = v26;
                    }
                }
                else {
                    v5 = v23;
                }

                v0_1 = v21 & 7;
                if(v0_1 <= 0) {
                    return;
                }

                while(true) {
                    v2 = v8 + 1;
                    arg28[v8] = ((arg29[(v5 >>> 25) + (v5 & 0x3F80)] & v14) * v15 & v13) + ((arg29[(v5 >>> 25) + (v5 & 0x3F80)] & v12) * v15 & v11) >> 8;
                    v5 += v7;
                    --v0_1;
                    if(v0_1 <= 0) {
                        return;
                    }

                    v8 = v2;
                }

                return;
            }

            if(v4 > 0) {
                v0_1 = v23;
                while(true) {
                    v5 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v5 != 0) {
                        arg28[v8] = ((v5 & v12) * v15 & v11) + ((v5 & v14) * v15 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v5 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v5 != 0) {
                        arg28[v8] = ((v5 & v14) * v15 & v13) + ((v5 & v12) * v15 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    int v25 = v4;
                    v4 = arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v14) * v15 & v13) + ((v4 & v12) * v15 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v4 = arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v12) * v15 & v11) + ((v4 & v14) * v15 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v4 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v14) * v15 & v13) + ((v4 & v12) * v15 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v4 = arg29[(v0_1 >>> 25) + (v0_1 & 0x3F80)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v14) * v15 & v13) + ((v4 & v12) * v15 & v11) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v4 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v4 != 0) {
                        arg28[v8] = ((v4 & v12) * v15 & v11) + ((v4 & v14) * v15 & v13) >> 8;
                    }

                    ++v8;
                    v0_1 += v7;
                    v0_1 = arg29[(v0_1 & 0x3F80) + (v0_1 >>> 25)];
                    if(v0_1 != 0) {
                        arg28[v8] = ((v0_1 & v14) * v15 & v13) + (v15 * (v0_1 & v12) & v11) >> 8;
                    }

                    ++v8;
                    v22 += arg40;
                    v2 += arg41;
                    v3 += arg42;
                    v0_1 = v3 >> 14;
                    if(v0_1 != 0) {
                        v4 = v22 / v0_1;
                        v0_1 = v2 / v0_1;
                        if(v4 < 0) {
                            v4 = 0;
                        }
                        else if(v4 > 0x3F80) {
                            v4 = 0x3F80;
                        }
                    }
                    else {
                        v0_1 = 0;
                        v4 = 0;
                    }

                    v7 = (v6 << 18) + v10;
                    v6 = (v4 - v6 >> 3 << 18) + (v0_1 - v10 >> 3);
                    v9 += v1;
                    v15 = v9 >> 8;
                    v10 = v25 - 1;
                    if(v10 <= 0) {
                        break;
                    }

                    v26 = v10;
                    v10 = v0_1;
                    v0_1 = v7;
                    v7 = v6;
                    v6 = v4;
                    v4 = v26;
                }
            }
            else {
                v6 = v7;
                v7 = v23;
            }

            v0_1 = v21 & 7;
            if(v0_1 <= 0) {
                return;
            }

            do {
                v1 = arg29[(v7 >>> 25) + (v7 & 0x3F80)];
                if(v1 != 0) {
                    arg28[v8] = ((v1 & v14) * v15 & v13) + ((v1 & v12) * v15 & v11) >> 8;
                }

                ++v8;
                v7 += v6;
                --v0_1;
                if(v0_1 > 0) {
                    continue;
                }

                return;
            }
            while(true);
        }
    }

    final void ea(int[] arg20, int[] arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34) {
        int v6;
        int v7;
        int v5;
        int v1;
        int v18;
        int v9;
        int v4;
        int v3;
        int v2;
        int v8;
        int v11;
        int v10;
        bj v0 = this;
        if(v0.ac) {
            v10 = 1109746211;
            v11 = arg26;
            if(v11 > v0.by * v10) {
                v11 = v0.by * v10;
            }

            if(arg25 >= 0) {
                goto label_15;
            }

            v8 = 0;
        }
        else {
            v11 = arg26;
        label_15:
            v8 = arg25;
        }

        if(v8 >= v11) {
            return;
        }

        v10 = arg24 + v8;
        int v12 = arg27 + arg28 * v8;
        v11 -= v8;
        int v14 = 0xFF0000;
        int v15 = 0xFF00;
        int v16 = 0xFF00FF00;
        int v17 = 0xFF00FF;
        if(v0.ba) {
            v8 -= v0.bw * 1126407459;
            v2 = arg29 + arg32 * v8;
            v3 = arg30 + arg33 * v8;
            v4 = arg31 + v8 * arg34;
            v8 = v4 >> 12;
            if(v8 != 0) {
                v9 = v2 / v8;
                v8 = v3 / v8;
            }
            else {
                v8 = 0;
                v9 = 0;
            }

            v2 += arg32 * v11;
            v3 += v11 * arg33;
            v4 = v4 + arg34 * v11 >> 12;
            if(v4 != 0) {
                v3 /= v4;
                v18 = v2 / v4;
            }
            else {
                v3 = 0;
                v18 = 0;
            }

            v2 = (v9 << 20) + v8;
            v4 = ((v18 - v9) / v11 << 20) + (v3 - v8) / v11;
            v3 = v11 >> 3;
            v1 = arg28 << 3;
            v5 = v12 >> 8;
            if(v0.bd) {
                if(v3 > 0) {
                    do {
                        v7 = v10 + 1;
                        arg20[v10] = ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v17) * v5 & v16) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v15) * v5 & v14) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 >>> 26) + (v2 & 0xFC0)] & v15) * v5 & v14) + ((arg21[(v2 >>> 26) + (v2 & 0xFC0)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v17) * v5 & v16) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v15) * v5 & v14) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v15) * v5 & v14) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v17) * v5 & v16) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v10 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 >>> 26) + (v2 & 0xFC0)] & v17) * v5 & v16) + (v5 * (arg21[(v2 >>> 26) + (v2 & 0xFC0)] & v15) & v14) >> 8;
                        v2 += v4;
                        v12 += v1;
                        v5 = v12 >> 8;
                        --v3;
                        if(v3 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                v1 = v11 & 7;
                if(v1 <= 0) {
                    return;
                }

                while(true) {
                    v6 = v10 + 1;
                    arg20[v10] = ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v17) * v5 & v16) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v15) * v5 & v14) >> 8;
                    v2 += v4;
                    --v1;
                    if(v1 <= 0) {
                        return;
                    }

                    v10 = v6;
                }

                return;
            }

            if(v3 > 0) {
                do {
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0xFC0) + (v2 >>> 26)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0xFC0) + (v2 >>> 26)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + (v5 * (v6 & v15) & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v12 += v1;
                    v5 = v12 >> 8;
                    --v3;
                    if(v3 > 0) {
                        continue;
                    }

                    break;
                }
                while(true);
            }

            v1 = v11 & 7;
            if(v1 <= 0) {
                return;
            }

            do {
                v3 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                if(v3 != 0) {
                    arg20[v10] = ((v3 & v15) * v5 & v14) + ((v3 & v17) * v5 & v16) >> 8;
                }

                ++v10;
                v2 += v4;
                --v1;
            }
            while(v1 > 0);
        }
        else {
            v8 -= v0.bw * 1126407459;
            v2 = arg29 + arg32 * v8;
            v3 = arg30 + arg33 * v8;
            v4 = arg31 + v8 * arg34;
            v8 = v4 >> 14;
            if(v8 != 0) {
                v9 = v2 / v8;
                v8 = v3 / v8;
            }
            else {
                v8 = 0;
                v9 = 0;
            }

            v2 += v11 * arg32;
            v3 += v11 * arg33;
            v4 = v4 + arg34 * v11 >> 14;
            if(v4 != 0) {
                v3 /= v4;
                v18 = v2 / v4;
            }
            else {
                v3 = 0;
                v18 = 0;
            }

            v2 = (v9 << 18) + v8;
            v4 = ((v18 - v9) / v11 << 18) + (v3 - v8) / v11;
            v3 = v11 >> 3;
            v1 = arg28 << 3;
            v5 = v12 >> 8;
            if(v0.bd) {
                if(v3 > 0) {
                    do {
                        v7 = v10 + 1;
                        arg20[v10] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v15) * v5 & v14) + ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v17) * v5 & v16) + ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v15) * v5 & v14) + ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v10 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + (v5 * (arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) & v14) >> 8;
                        v2 += v4;
                        v12 += v1;
                        v5 = v12 >> 8;
                        --v3;
                        if(v3 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                v1 = v11 & 7;
                if(v1 <= 0) {
                    return;
                }

                while(true) {
                    v6 = v10 + 1;
                    arg20[v10] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) >> 8;
                    v2 += v4;
                    --v1;
                    if(v1 <= 0) {
                        return;
                    }

                    v10 = v6;
                }

                return;
            }

            if(v3 > 0) {
                do {
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 25) + (v2 & 0x3F80)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 25) + (v2 & 0x3F80)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 25) + (v2 & 0x3F80)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v12 += v1;
                    v5 = v12 >> 8;
                    --v3;
                    if(v3 > 0) {
                        continue;
                    }

                    break;
                }
                while(true);
            }

            v1 = v11 & 7;
            if(v1 <= 0) {
                return;
            }

            do {
                v3 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                if(v3 != 0) {
                    arg20[v10] = ((v3 & v17) * v5 & v16) + ((v3 & v15) * v5 & v14) >> 8;
                }

                ++v10;
                v2 += v4;
                --v1;
                if(v1 > 0) {
                    continue;
                }

                return;
            }
            while(true);
        }
    }

    final void ek(int[] arg20, int[] arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34) {
        int v6;
        int v7;
        int v5;
        int v1;
        int v18;
        int v9;
        int v4;
        int v3;
        int v2;
        int v10;
        int v8;
        bj v0 = this;
        if(v0.ac) {
            v8 = arg26;
            if(v8 > v0.by * 489209497) {
                v8 = v0.by * 1109746211;
            }

            if(arg25 >= 0) {
                goto label_15;
            }

            v10 = 0;
        }
        else {
            v8 = arg26;
        label_15:
            v10 = arg25;
        }

        if(v10 >= v8) {
            return;
        }

        int v11 = arg24 + v10;
        int v12 = arg27 + arg28 * v10;
        v8 -= v10;
        int v14 = 0xFF00FF00;
        int v15 = 0xFF00FF;
        int v16 = 0xFF0000;
        int v17 = 0xFF00;
        if(v0.ba) {
            v10 -= v0.bw * -1155808493;
            v2 = arg29 + arg32 * v10;
            v3 = arg30 + arg33 * v10;
            v4 = arg31 + arg34 * v10;
            v9 = v4 >> 12;
            if(v9 != 0) {
                v10 = v2 / v9;
                v9 = v3 / v9;
            }
            else {
                v9 = 0;
                v10 = 0;
            }

            v2 += arg32 * v8;
            v3 += v8 * arg33;
            v4 = v4 + arg34 * v8 >> 12;
            if(v4 != 0) {
                v3 /= v4;
                v18 = v2 / v4;
            }
            else {
                v3 = 0;
                v18 = 0;
            }

            v2 = (v10 << 20) + v9;
            v4 = ((v18 - v10) / v8 << 20) + (v3 - v9) / v8;
            v3 = v8 >> 3;
            v1 = arg28 << 3;
            v5 = v12 >> 8;
            if(v0.bd) {
                if(v3 > 0) {
                    do {
                        v7 = v11 + 1;
                        arg20[v11] = ((346405208 & arg21[(0xEF3D8E3C & v2) + (v2 >>> 26)]) * v5 & v14) + ((arg21[(0xEF3D8E3C & v2) + (v2 >>> 26)] & v17) * v5 & 0x7FB86C95) >> 8;
                        v2 += v4;
                        v9 = v7 + 1;
                        arg20[v7] = ((0x63BA15D9 & arg21[(v2 & 0xFC0) + (v2 >>> 26)]) * v5 & v16) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v15) * v5 & 0xCC55F72B) >> 8;
                        v2 += v4;
                        v7 = v9 + 1;
                        arg20[v9] = ((arg21[(v2 >>> 26) + (0xECF0C2CD & v2)] & v17) * v5 & v16) + ((arg21[(v2 >>> 26) + (0xECF0C2CD & v2)] & 1008196660) * v5 & 0x27CB410D) >> 8;
                        v2 += v4;
                        v9 = v7 + 1;
                        arg20[v7] = ((arg21[(0x7E8D0D07 & v2) + (v2 >>> 26)] & v15) * v5 & 0xC8812907) + ((arg21[(0x7E8D0D07 & v2) + (v2 >>> 26)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v7 = v9 + 1;
                        arg20[v9] = ((arg21[(0x1070E8CF & v2) + (v2 >>> 26)] & v17) * v5 & 0xFFC63202) + ((arg21[(0x1070E8CF & v2) + (v2 >>> 26)] & 755450306) * v5 & 0x6FD2787E) >> 8;
                        v2 += v4;
                        v9 = v7 + 1;
                        arg20[v7] = ((arg21[(0x6BE0B85C & v2) + (v2 >>> 26)] & v17) * v5 & v16) + ((arg21[(0x6BE0B85C & v2) + (v2 >>> 26)] & v15) * v5 & 0x38B5ECA6) >> 8;
                        v2 += v4;
                        v7 = v9 + 1;
                        arg20[v9] = ((0x743432B8 & arg21[(0x63ADA9F9 & v2) + (v2 >>> 26)]) * v5 & 0xBC947DC3) + ((arg21[(0x63ADA9F9 & v2) + (v2 >>> 26)] & 0xDB5C8D29) * v5 & v16) >> 8;
                        v2 += v4;
                        v11 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 >>> 26) + (v2 & 0xFC0)] & v15) * v5 & v14) + (v5 * (arg21[(v2 >>> 26) + (v2 & 0xFC0)] & v17) & -984490037) >> 8;
                        v2 += v4;
                        v12 += v1;
                        v5 = v12 >> 8;
                        --v3;
                        if(v3 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                v1 = v8 & 7;
                if(v1 <= 0) {
                    return;
                }

                while(true) {
                    v6 = v11 + 1;
                    arg20[v11] = ((0xA3E9982A & arg21[(v2 & 0xFC0) + (v2 >>> 26)]) * v5 & -934404370) + ((arg21[(v2 & 0xFC0) + (v2 >>> 26)] & v17) * v5 & 0x5A49EBE4) >> 8;
                    v2 += v4;
                    --v1;
                    if(v1 <= 0) {
                        return;
                    }

                    v11 = v6;
                }

                return;
            }

            if(v3 > 0) {
                do {
                    v6 = arg21[(v2 >>> 26) + (0x9D03EFD2 & v2)];
                    if(v6 != 0) {
                        arg20[v11] = ((0x6FD12B27 & v6) * v5 & 0x4A32DBAF) + ((v6 & 0x761A7F9E) * v5 & v16) >> 8;
                    }

                    ++v11;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (0xF1774FD7 & v2)];
                    if(v6 != 0) {
                        arg20[v11] = ((0x7F2D7078 & v6) * v5 & v14) + ((v6 & v17) * v5 & 0xCA68751E) >> 8;
                    }

                    ++v11;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v11;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v15) * v5 & 0x1407A9BA) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v11;
                    v2 += v4;
                    v6 = arg21[(-1178517095 & v2) + (v2 >>> 26)];
                    if(v6 != 0) {
                        arg20[v11] = ((0x62DEF237 & v6) * v5 & -505798031) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v11;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (-1500109738 & v2)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v15) * v5 & -1570595875) + ((v6 & 0xC730FC3D) * v5 & 0xCED0C3FF) >> 8;
                    }

                    ++v11;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v11] = ((0x8ED91301 & v6) * v5 & v14) + ((v6 & 0x9F3A6C85) * v5 & v16) >> 8;
                    }

                    ++v11;
                    v2 += v4;
                    v6 = arg21[(0xA90E836D & v2) + (v2 >>> 26)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v15) * v5 & 0x60A49336) + (v5 * (v6 & v17) & v16) >> 8;
                    }

                    ++v11;
                    v2 += v4;
                    v12 += v1;
                    v5 = v12 >> 8;
                    --v3;
                    if(v3 > 0) {
                        continue;
                    }

                    break;
                }
                while(true);
            }

            v1 = v8 & 7;
            if(v1 <= 0) {
                return;
            }

            do {
                v3 = arg21[(v2 >>> 26) + (v2 & 0xFC0)];
                if(v3 != 0) {
                    arg20[v11] = ((v3 & v17) * v5 & v16) + ((v3 & 860870573) * v5 & 0xEE9A39A6) >> 8;
                }

                ++v11;
                v2 += v4;
                --v1;
            }
            while(v1 > 0);
        }
        else {
            v10 -= v0.bw * 1126407459;
            v2 = arg29 + arg32 * v10;
            v3 = arg30 + arg33 * v10;
            v4 = arg31 + arg34 * v10;
            v9 = v4 >> 14;
            if(v9 != 0) {
                v10 = v2 / v9;
                v9 = v3 / v9;
            }
            else {
                v9 = 0;
                v10 = 0;
            }

            v2 += v8 * arg32;
            v3 += v8 * arg33;
            v4 = v4 + arg34 * v8 >> 14;
            if(v4 != 0) {
                v2 /= v4;
                v18 = v3 / v4;
            }
            else {
                v2 = 0;
                v18 = 0;
            }

            v3 = (v10 << 18) + v9;
            v2 = ((v2 - v10) / v8 << 18) + (v18 - v9) / v8;
            v4 = v8 >> 3;
            v1 = arg28 << 3;
            v5 = v12 >> 8;
            if(v0.bd) {
                if(v4 > 0) {
                    do {
                        v7 = v11 + 1;
                        arg20[v11] = ((0x28284490 & arg21[(v3 >>> 25) + (0xA970672B & v3)]) * v5 & 0x97BA0671) + ((arg21[(v3 >>> 25) + (0xA970672B & v3)] & v15) * v5 & 0x58963E43) >> 8;
                        v3 += v2;
                        v9 = v7 + 1;
                        arg20[v7] = ((0xD2DD726C & arg21[(0xD5CA5602 & v3) + (v3 >>> 25)]) * v5 & -2096801067) + ((arg21[(0xD5CA5602 & v3) + (v3 >>> 25)] & v15) * v5 & 0x1429F05E) >> 8;
                        v3 += v2;
                        v7 = v9 + 1;
                        arg20[v9] = ((1707434778 & arg21[(v3 >>> 25) + (0xA082F4FA & v3)]) * v5 & -128070141) + ((arg21[(v3 >>> 25) + (0xA082F4FA & v3)] & v17) * v5 & v16) >> 8;
                        v3 += v2;
                        v9 = v7 + 1;
                        arg20[v7] = ((0xF80768C6 & arg21[(0xD03D911C & v3) + (v3 >>> 25)]) * v5 & 0xD24BF1FA) + ((arg21[(0xD03D911C & v3) + (v3 >>> 25)] & v17) * v5 & v16) >> 8;
                        v3 += v2;
                        v7 = v9 + 1;
                        arg20[v9] = ((arg21[(0x1D2401A3 & v3) + (v3 >>> 25)] & v17) * v5 & v16) + ((arg21[(0x1D2401A3 & v3) + (v3 >>> 25)] & 0x1B76736F) * v5 & v14) >> 8;
                        v3 += v2;
                        v9 = v7 + 1;
                        arg20[v7] = ((0x660672F4 & arg21[(v3 >>> 25) + (0xB87C48A1 & v3)]) * v5 & v14) + ((arg21[(v3 >>> 25) + (0xB87C48A1 & v3)] & -1489880412) * v5 & 0x80CA3C66) >> 8;
                        v3 += v2;
                        v7 = v9 + 1;
                        arg20[v9] = ((arg21[(v3 >>> 25) + (v3 & 0x3F80)] & v15) * v5 & v14) + ((arg21[(v3 >>> 25) + (v3 & 0x3F80)] & -651765605) * v5 & 1366774077) >> 8;
                        v3 += v2;
                        v11 = v7 + 1;
                        arg20[v7] = ((0xAD287333 & arg21[(v3 >>> 25) + (0x5B6CEBE6 & v3)]) * v5 & 0xF92B6050) + (v5 * (arg21[(v3 >>> 25) + (0x5B6CEBE6 & v3)] & v17) & v16) >> 8;
                        v3 += v2;
                        v12 += v1;
                        v5 = v12 >> 8;
                        --v4;
                        if(v4 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                v1 = v8 & 7;
                if(v1 <= 0) {
                    return;
                }

                while(true) {
                    v6 = v11 + 1;
                    arg20[v11] = ((arg21[(v3 >>> 25) + (v3 & 0x3F80)] & v15) * v5 & 0x200D8BBB) + ((arg21[(v3 >>> 25) + (v3 & 0x3F80)] & v17) * v5 & v16) >> 8;
                    v3 += v2;
                    --v1;
                    if(v1 <= 0) {
                        return;
                    }

                    v11 = v6;
                }

                return;
            }

            if(v4 > 0) {
                do {
                    v6 = arg21[(1315260396 & v3) + (v3 >>> 25)];
                    if(v6 != 0) {
                        arg20[v11] = ((97234203 & v6) * v5 & -605647412) + ((v6 & v15) * v5 & 1456041068) >> 8;
                    }

                    ++v11;
                    v3 += v2;
                    v6 = arg21[(v3 >>> 25) + (0x32FA2183 & v3)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v11;
                    v3 += v2;
                    v6 = arg21[(v3 >>> 25) + (v3 & 0x3F80)];
                    if(v6 != 0) {
                        arg20[v11] = ((0xCDFEDF02 & v6) * v5 & v16) + ((v6 & 0xCC87A2BD) * v5 & v14) >> 8;
                    }

                    ++v11;
                    v3 += v2;
                    v6 = arg21[(0x2B627358 & v3) + (v3 >>> 25)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v17) * v5 & v16) + ((v6 & 0xD2960B13) * v5 & 0xB3CC1C8F) >> 8;
                    }

                    ++v11;
                    v3 += v2;
                    v6 = arg21[(v3 >>> 25) + (0xE377F2ED & v3)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v17) * v5 & -1082672690) + ((v6 & 315344309) * v5 & -1021154059) >> 8;
                    }

                    ++v11;
                    v3 += v2;
                    v6 = arg21[(0xB420D2D5 & v3) + (v3 >>> 25)];
                    if(v6 != 0) {
                        arg20[v11] = ((2031717326 & v6) * v5 & 0x6E84BC01) + ((v6 & -1508650332) * v5 & v14) >> 8;
                    }

                    ++v11;
                    v3 += v2;
                    v6 = arg21[(v3 & 0x3F80) + (v3 >>> 25)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v17) * v5 & 2025769746) + ((v6 & 0x6F01EF46) * v5 & 0x78BB47F1) >> 8;
                    }

                    ++v11;
                    v3 += v2;
                    v6 = arg21[(v3 & 0x3F80) + (v3 >>> 25)];
                    if(v6 != 0) {
                        arg20[v11] = ((v6 & v15) * v5 & 1768015212) + ((v6 & 1004401137) * v5 & v16) >> 8;
                    }

                    ++v11;
                    v3 += v2;
                    v12 += v1;
                    v5 = v12 >> 8;
                    --v4;
                    if(v4 > 0) {
                        continue;
                    }

                    break;
                }
                while(true);
            }

            v1 = v8 & 7;
            if(v1 <= 0) {
                return;
            }

            do {
                v4 = arg21[(0x71147A1D & v3) + (v3 >>> 25)];
                if(v4 != 0) {
                    arg20[v11] = ((0x3410977F & v4) * v5 & v14) + ((v4 & 0xB940E0AC) * v5 & 0x61462B29) >> 8;
                }

                ++v11;
                v3 += v2;
                --v1;
                if(v1 > 0) {
                    continue;
                }

                return;
            }
            while(true);
        }
    }

    final void ez(int[] arg20, int[] arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34) {
        int v6;
        int v7;
        int v5;
        int v1;
        int v18;
        int v9;
        int v4;
        int v3;
        int v2;
        int v8;
        int v11;
        int v10;
        bj v0 = this;
        if(v0.ac) {
            v10 = 1109746211;
            v11 = arg26;
            if(v11 > v0.by * v10) {
                v11 = v0.by * v10;
            }

            if(arg25 >= 0) {
                goto label_15;
            }

            v8 = 0;
        }
        else {
            v11 = arg26;
        label_15:
            v8 = arg25;
        }

        if(v8 >= v11) {
            return;
        }

        v10 = arg24 + v8;
        int v12 = arg27 + arg28 * v8;
        v11 -= v8;
        int v14 = 0xFF0000;
        int v15 = 0xFF00;
        int v16 = 0xFF00FF00;
        int v17 = 0xFF00FF;
        if(v0.ba) {
            v8 -= v0.bw * 1126407459;
            v2 = arg29 + arg32 * v8;
            v3 = arg30 + arg33 * v8;
            v4 = arg31 + v8 * arg34;
            v8 = v4 >> 12;
            if(v8 != 0) {
                v9 = v2 / v8;
                v8 = v3 / v8;
            }
            else {
                v8 = 0;
                v9 = 0;
            }

            v2 += arg32 * v11;
            v3 += v11 * arg33;
            v4 = v4 + arg34 * v11 >> 12;
            if(v4 != 0) {
                v2 /= v4;
                v18 = v3 / v4;
            }
            else {
                v2 = 0;
                v18 = 0;
            }

            v3 = (v9 << 20) + v8;
            v2 = ((v2 - v9) / v11 << 20) + (v18 - v8) / v11;
            v4 = v11 >> 3;
            v1 = arg28 << 3;
            v5 = v12 >> 8;
            if(v0.bd) {
                if(v4 > 0) {
                    do {
                        v7 = v10 + 1;
                        arg20[v10] = ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v17) * v5 & v16) + ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v15) * v5 & v14) >> 8;
                        v3 += v2;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v15) * v5 & v14) + ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v17) * v5 & v16) >> 8;
                        v3 += v2;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v3 >>> 26) + (v3 & 0xFC0)] & v15) * v5 & v14) + ((arg21[(v3 >>> 26) + (v3 & 0xFC0)] & v17) * v5 & v16) >> 8;
                        v3 += v2;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v17) * v5 & v16) + ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v15) * v5 & v14) >> 8;
                        v3 += v2;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v15) * v5 & v14) + ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v17) * v5 & v16) >> 8;
                        v3 += v2;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v15) * v5 & v14) + ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v17) * v5 & v16) >> 8;
                        v3 += v2;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v17) * v5 & v16) + ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v15) * v5 & v14) >> 8;
                        v3 += v2;
                        v10 = v7 + 1;
                        arg20[v7] = ((arg21[(v3 >>> 26) + (v3 & 0xFC0)] & v17) * v5 & v16) + (v5 * (arg21[(v3 >>> 26) + (v3 & 0xFC0)] & v15) & v14) >> 8;
                        v3 += v2;
                        v12 += v1;
                        v5 = v12 >> 8;
                        --v4;
                        if(v4 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                v1 = v11 & 7;
                if(v1 <= 0) {
                    return;
                }

                while(true) {
                    v6 = v10 + 1;
                    arg20[v10] = ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v17) * v5 & v16) + ((arg21[(v3 & 0xFC0) + (v3 >>> 26)] & v15) * v5 & v14) >> 8;
                    v3 += v2;
                    --v1;
                    if(v1 <= 0) {
                        return;
                    }

                    v10 = v6;
                }

                return;
            }

            if(v4 > 0) {
                do {
                    v6 = arg21[(v3 >>> 26) + (v3 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v3 += v2;
                    v6 = arg21[(v3 >>> 26) + (v3 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v3 += v2;
                    v6 = arg21[(v3 >>> 26) + (v3 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v3 += v2;
                    v6 = arg21[(v3 >>> 26) + (v3 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v3 += v2;
                    v6 = arg21[(v3 & 0xFC0) + (v3 >>> 26)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v3 += v2;
                    v6 = arg21[(v3 >>> 26) + (v3 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v3 += v2;
                    v6 = arg21[(v3 >>> 26) + (v3 & 0xFC0)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v3 += v2;
                    v6 = arg21[(v3 & 0xFC0) + (v3 >>> 26)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + (v5 * (v6 & v15) & v14) >> 8;
                    }

                    ++v10;
                    v3 += v2;
                    v12 += v1;
                    v5 = v12 >> 8;
                    --v4;
                    if(v4 > 0) {
                        continue;
                    }

                    break;
                }
                while(true);
            }

            v1 = v11 & 7;
            if(v1 <= 0) {
                return;
            }

            do {
                v4 = arg21[(v3 >>> 26) + (v3 & 0xFC0)];
                if(v4 != 0) {
                    arg20[v10] = ((v4 & v15) * v5 & v14) + ((v4 & v17) * v5 & v16) >> 8;
                }

                ++v10;
                v3 += v2;
                --v1;
            }
            while(v1 > 0);
        }
        else {
            v8 -= v0.bw * 1126407459;
            v2 = arg29 + arg32 * v8;
            v3 = arg30 + arg33 * v8;
            v4 = arg31 + v8 * arg34;
            v8 = v4 >> 14;
            if(v8 != 0) {
                v9 = v2 / v8;
                v8 = v3 / v8;
            }
            else {
                v8 = 0;
                v9 = 0;
            }

            v2 += v11 * arg32;
            v3 += v11 * arg33;
            v4 = v4 + arg34 * v11 >> 14;
            if(v4 != 0) {
                v3 /= v4;
                v18 = v2 / v4;
            }
            else {
                v3 = 0;
                v18 = 0;
            }

            v2 = (v9 << 18) + v8;
            v4 = ((v18 - v9) / v11 << 18) + (v3 - v8) / v11;
            v3 = v11 >> 3;
            v1 = arg28 << 3;
            v5 = v12 >> 8;
            if(v0.bd) {
                if(v3 > 0) {
                    do {
                        v7 = v10 + 1;
                        arg20[v10] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v15) * v5 & v14) + ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v17) * v5 & v16) + ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v15) * v5 & v14) + ((arg21[(v2 & 0x3F80) + (v2 >>> 25)] & v17) * v5 & v16) >> 8;
                        v2 += v4;
                        v8 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v7 = v8 + 1;
                        arg20[v8] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) >> 8;
                        v2 += v4;
                        v10 = v7 + 1;
                        arg20[v7] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + (v5 * (arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) & v14) >> 8;
                        v2 += v4;
                        v12 += v1;
                        v5 = v12 >> 8;
                        --v3;
                        if(v3 > 0) {
                            continue;
                        }

                        break;
                    }
                    while(true);
                }

                v1 = v11 & 7;
                if(v1 <= 0) {
                    return;
                }

                while(true) {
                    v6 = v10 + 1;
                    arg20[v10] = ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v17) * v5 & v16) + ((arg21[(v2 >>> 25) + (v2 & 0x3F80)] & v15) * v5 & v14) >> 8;
                    v2 += v4;
                    --v1;
                    if(v1 <= 0) {
                        return;
                    }

                    v10 = v6;
                }

                return;
            }

            if(v3 > 0) {
                do {
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 25) + (v2 & 0x3F80)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 25) + (v2 & 0x3F80)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 >>> 25) + (v2 & 0x3F80)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v15) * v5 & v14) + ((v6 & v17) * v5 & v16) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v6 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                    if(v6 != 0) {
                        arg20[v10] = ((v6 & v17) * v5 & v16) + ((v6 & v15) * v5 & v14) >> 8;
                    }

                    ++v10;
                    v2 += v4;
                    v12 += v1;
                    v5 = v12 >> 8;
                    --v3;
                    if(v3 > 0) {
                        continue;
                    }

                    break;
                }
                while(true);
            }

            v1 = v11 & 7;
            if(v1 <= 0) {
                return;
            }

            do {
                v3 = arg21[(v2 & 0x3F80) + (v2 >>> 25)];
                if(v3 != 0) {
                    arg20[v10] = ((v3 & v17) * v5 & v16) + ((v3 & v15) * v5 & v14) >> 8;
                }

                ++v10;
                v2 += v4;
                --v1;
                if(v1 > 0) {
                    continue;
                }

                return;
            }
            while(true);
        }
    }
}

