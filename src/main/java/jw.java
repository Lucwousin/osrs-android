import java.net.URL;

public class jw {
    static int[] ad = null;
    public static final int ap = 15;
    public static URL ax;
    static int md;

    jw() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jw.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static final es ae(byte[] arg1) {
        return am.abt(arg1, -1826379042);
    }

    public static final es al(byte[] arg1) {
        return am.abt(arg1, 0x8CF87FA7);
    }

    static char an(char arg1, int arg2) {
        switch(arg1) {
            case 192: 
            case 193: 
            case 194: 
            case 195: 
            case 196: {
                break;
            }
            default: {
                switch(arg1) {
                    case 199: {
                        return 'c';
                    }
                    case 200: 
                    case 201: 
                    case 202: 
                    case 203: {
                        return 'e';
                    }
                }

                switch(arg1) {
                    case 205: 
                    case 206: 
                    case 207: {
                        break;
                    }
                    default: {
                        switch(arg1) {
                            case 209: {
                                return 'n';
                            }
                            case 210: 
                            case 211: 
                            case 212: 
                            case 213: 
                            case 214: {
                                return 'o';
                            }
                        }

                        switch(arg1) {
                            case 217: 
                            case 218: 
                            case 219: 
                            case 220: {
                                return 'u';
                            }
                            default: {
                                switch(arg1) {
                                    case 223: {
                                        return 'b';
                                    }
                                    case 224: 
                                    case 225: 
                                    case 226: 
                                    case 227: 
                                    case 228: {
                                        return 'a';
                                    }
                                }

                                switch(arg1) {
                                    case 231: {
                                        return 'c';
                                    }
                                    case 232: 
                                    case 233: 
                                    case 234: 
                                    case 235: {
                                        return 'e';
                                    }
                                }

                                switch(arg1) {
                                    case 237: 
                                    case 238: 
                                    case 239: {
                                        return 'i';
                                    }
                                    default: {
                                        switch(arg1) {
                                            case 241: {
                                                return 'n';
                                            }
                                            case 242: 
                                            case 243: 
                                            case 244: 
                                            case 245: 
                                            case 246: {
                                                return 'o';
                                            }
                                        }

                                        switch(arg1) {
                                            case 249: 
                                            case 250: 
                                            case 251: 
                                            case 252: {
                                                break;
                                            }
                                            default: {
                                                switch(arg1) {
                                                    case 35: 
                                                    case 91: 
                                                    case 93: {
                                                        return arg1;
                                                    }
                                                    case 32: 
                                                    case 45: 
                                                    case 95: 
                                                    case 160: {
                                                        return '_';
                                                    }
                                                    case 255: 
                                                    case 376: {
                                                        return 'y';
                                                    }
                                                }

                                                try {
                                                    return Character.toLowerCase(arg1);
                                                }
                                                catch(RuntimeException v1) {
                                                    StringBuilder v2 = new StringBuilder();
                                                    v2.append("jw.an(");
                                                    v2.append(')');
                                                    throw lx.al(((Throwable)v1), v2.toString());
                                                }

                                                return 'y';
                                            }
                                        }

                                        return 'u';
                                    }
                                }
                            }
                        }
                    }
                }

                return 'i';
            }
        }

        return 'a';
    }

    public static final es ar(byte[] arg1) {
        return am.abt(arg1, 0x803E72C7);
    }

    static void ba(int arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
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
                        arg8 = (arg3[arg7] & 0xFF00FF) + (arg5 & 0xFF00FF);
                        arg5 = (0x1000100 & arg8) + (arg10 - arg8 & 0x10000);
                        arg3[arg7] = arg5 - (arg5 >>> 8) | arg10 - arg5;
                        ++arg7;
                    }
                    else {
                        goto label_37;
                    }

                    goto label_38;
                }
                catch(RuntimeException v0) {
                    StringBuilder v1 = new StringBuilder();
                    v1.append("jw.ba(");
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

    static final void ed(int arg19) {
        try {
            mx v0_1;
            for(v0_1 = client.kw.aj(); v0_1 != null; v0_1 = client.kw.aq()) {
                int v2 = 0xD0BE2B1;
                if(((io)v0_1).ai * v2 > 0) {
                    ((io)v0_1).ai -= 617031249;
                }

                int v1 = ((io)v0_1).ai * v2;
                v2 = 729055605;
                int v3 = 0x15137909;
                int v4 = 0x647472F3;
                int v5 = -1821250753;
                int v6 = 0x9D0B1463;
                int v7 = 0xFFA278D3;
                int v8 = 580090889;
                if(v1 == 0) {
                    if(((io)v0_1).an * v8 >= 0 && !ii.aw(((io)v0_1).an * v8, ((io)v0_1).aj * v5, -770960492)) {
                        goto label_132;
                    }

                    cc.es(((io)v0_1).ax * v4, ((io)v0_1).al * v3, ((io)v0_1).ae * v7, ((io)v0_1).ar * v6, ((io)v0_1).an * v8, ((io)v0_1).ap * v2, ((io)v0_1).aj * v5, -119);
                    ((io)v0_1).lp();
                }
                else {
                    int v9 = 0xA7E9A09F;
                    if(((io)v0_1).af * v9 > 0) {
                        ((io)v0_1).af -= 2000649055;
                    }

                    if(((io)v0_1).af * v9 != 0) {
                        goto label_132;
                    }

                    if(((io)v0_1).ae * v7 < 1) {
                        goto label_132;
                    }

                    if(((io)v0_1).ar * v6 < 1) {
                        goto label_132;
                    }

                    v9 = 102;
                    if(((io)v0_1).ae * v7 > v9) {
                        goto label_132;
                    }

                    if(((io)v0_1).ar * v6 > v9) {
                        goto label_132;
                    }

                    v9 = 0xB30C9B45;
                    int v10 = 0x641D620B;
                    if(((io)v0_1).ad * v9 >= 0 && !ii.aw(((io)v0_1).ad * v9, ((io)v0_1).ab * v10, -1688444077)) {
                        goto label_132;
                    }

                    int v11 = ((io)v0_1).ax * v4;
                    int v12 = ((io)v0_1).al * v3;
                    v3 = 0xAA908D9D;
                    cc.es(v11, v12, ((io)v0_1).ae * v7, ((io)v0_1).ar * v6, ((io)v0_1).ad * v9, ((io)v0_1).aq * v3, ((io)v0_1).ab * v10, -126);
                    ((io)v0_1).af = -2000649055;
                    if(((io)v0_1).an * v8 == ((io)v0_1).ad * v9 && ((io)v0_1).an * v8 == -1) {
                        ((io)v0_1).lp();
                        goto label_132;
                    }

                    if(((io)v0_1).ad * v9 != ((io)v0_1).an * v8) {
                        goto label_132;
                    }

                    if(((io)v0_1).ap * v2 != ((io)v0_1).aq * v3) {
                        goto label_132;
                    }

                    if(((io)v0_1).aj * v5 != ((io)v0_1).ab * v10) {
                        goto label_132;
                    }

                    ((io)v0_1).lp();
                }

            label_132:
            }
        }
        catch(RuntimeException v0) {
            goto label_138;
        }

        return;
    label_138:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("jw.ed(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0), v1_1.toString());
    }
}

