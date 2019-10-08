public class lm {
    static char[] ae = null;
    static char[] al = null;
    static final int aq = 0x100;
    static int[] ar = null;
    static final int av = 2;
    static char[] ax;
    static ki dw;

    static {
        int v5;
        int v4;
        int v3;
        int v0 = 0x40;
        lm.ax = new char[v0];
        int v1 = 0;
        int v2;
        for(v2 = 0; true; ++v2) {
            v3 = 26;
            if(v2 >= v3) {
                break;
            }

            lm.ax[v2] = ((char)(v2 + 65));
        }

        for(v2 = 26; true; ++v2) {
            v4 = 52;
            if(v2 >= v4) {
                break;
            }

            lm.ax[v2] = ((char)(v2 + 97 - v3));
        }

        for(v2 = 52; true; ++v2) {
            v5 = 62;
            if(v2 >= v5) {
                break;
            }

            lm.ax[v2] = ((char)(v2 + 0x30 - v4));
        }

        char v6 = '+';
        lm.ax[v5] = v6;
        char v7 = '/';
        int v8 = 0x3F;
        lm.ax[v8] = v7;
        lm.al = new char[v0];
        for(v2 = 0; v2 < v3; ++v2) {
            lm.al[v2] = ((char)(v2 + 65));
        }

        for(v2 = 26; v2 < v4; ++v2) {
            lm.al[v2] = ((char)(v2 + 97 - v3));
        }

        for(v2 = 52; v2 < v5; ++v2) {
            lm.al[v2] = ((char)(v2 + 0x30 - v4));
        }

        char v9 = '*';
        lm.al[v5] = v9;
        char v10 = '-';
        lm.al[v8] = v10;
        lm.ae = new char[v0];
        for(v0 = 0; v0 < v3; ++v0) {
            lm.ae[v0] = ((char)(v0 + 65));
        }

        for(v0 = 26; v0 < v4; ++v0) {
            lm.ae[v0] = ((char)(v0 + 97 - v3));
        }

        for(v0 = 52; v0 < v5; ++v0) {
            lm.ae[v0] = ((char)(v0 + 0x30 - v4));
        }

        lm.ae[v5] = v10;
        lm.ae[v8] = '_';
        lm.ar = new int[0x80];
        while(v1 < lm.ar.length) {
            lm.ar[v1] = -1;
            ++v1;
        }

        for(v0 = 65; v0 <= 90; ++v0) {
            lm.ar[v0] = v0 - 65;
        }

        for(v0 = 97; v0 <= 0x7A; ++v0) {
            lm.ar[v0] = v0 - 97 + v3;
        }

        for(v0 = 0x30; v0 <= 57; ++v0) {
            lm.ar[v0] = v0 - 0x30 + v4;
        }

        int[] v0_1 = lm.ar;
        lm.ar[v6] = v5;
        v0_1[v9] = v5;
        v0_1 = lm.ar;
        lm.ar[v7] = v8;
        v0_1[v10] = v8;
    }

    lm() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("lm.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    static String ab(byte[] arg6, int arg7, int arg8) {
        StringBuilder v0 = new StringBuilder();
        int v1;
        for(v1 = arg7; v1 < arg8 + arg7; v1 += 3) {
            int v2 = arg6[v1] & 0xFF;
            v0.append(lm.ax[v2 >>> 2]);
            if(v1 < arg8 - 1) {
                int v3 = arg6[v1 + 1] & 0xFF;
                v0.append(lm.ax[(v2 & 3) << 4 | v3 >>> 4]);
                if(v1 < arg8 - 2) {
                    v2 = arg6[v1 + 2] & 0xFF;
                    v0.append(lm.ax[(v3 & 15) << 2 | v2 >>> 6]);
                    v0.append(lm.ax[v2 & 0x3F]);
                }
                else {
                    v0.append(lm.ax[(v3 & 15) << 2]);
                    v0.append("=");
                }
            }
            else {
                v0.append(lm.ax[(v2 & 3) << 4]);
                v0.append("==");
            }
        }

        return v0.toString();
    }

    public static String ad(byte[] arg3) {
        return hj.al(arg3, 0, arg3.length, 0xB7140409);
    }

    public static String ae(byte[] arg3) {
        return hj.al(arg3, 0, arg3.length, 0xB7140409);
    }

    static String af(byte[] arg6, int arg7, int arg8) {
        StringBuilder v0 = new StringBuilder();
        int v1;
        for(v1 = arg7; v1 < arg8 + arg7; v1 += 3) {
            int v2 = arg6[v1] & 0xFF;
            v0.append(lm.ax[v2 >>> 2]);
            if(v1 < arg8 - 1) {
                int v3 = arg6[v1 + 1] & 0xFF;
                v0.append(lm.ax[(v2 & 3) << 4 | v3 >>> 4]);
                if(v1 < arg8 - 2) {
                    v2 = arg6[v1 + 2] & 0xFF;
                    v0.append(lm.ax[(v3 & 15) << 2 | v2 >>> 6]);
                    v0.append(lm.ax[v2 & 0x3F]);
                }
                else {
                    v0.append(lm.ax[(v3 & 15) << 2]);
                    v0.append("=");
                }
            }
            else {
                v0.append(lm.ax[(v2 & 3) << 4]);
                v0.append("==");
            }
        }

        return v0.toString();
    }

    public static boolean ag(char arg1, int arg2) {
        if(arg1 >= 0x20 && arg1 <= 0x7E) {
            return 1;
        }

        if(arg1 >= 0xA0 && arg1 <= 0xFF) {
            return 1;
        }

        if(0x20AC != arg1 && 338 != arg1 && arg1 != 0x2014 && 339 != arg1) {
            if(arg1 == 376) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public static String aj(byte[] arg3) {
        return hj.al(arg3, 0, arg3.length, 0xB7140409);
    }

    public static String an(byte[] arg3) {
        return hj.al(arg3, 0, arg3.length, 0xB7140409);
    }

    public static String ap(byte[] arg3) {
        return hj.al(arg3, 0, arg3.length, 0xB7140409);
    }

    static String aq(byte[] arg6, int arg7, int arg8) {
        StringBuilder v0 = new StringBuilder();
        int v1;
        for(v1 = arg7; v1 < arg8 + arg7; v1 += 3) {
            int v2 = arg6[v1] & 0xFF;
            v0.append(lm.ax[v2 >>> 2]);
            if(v1 < arg8 - 1) {
                int v3 = arg6[v1 + 1] & 0x270EB454;
                v0.append(lm.ax[(v2 & 3) << 4 | v3 >>> 4]);
                if(v1 < arg8 - 2) {
                    v2 = arg6[v1 + 2] & 0xBEF276A0;
                    v0.append(lm.ax[(v3 & 15) << 2 | v2 >>> 6]);
                    v0.append(lm.ax[v2 & 857060264]);
                }
                else {
                    v0.append(lm.ax[(v3 & 15) << 2]);
                    v0.append("=");
                }
            }
            else {
                v0.append(lm.ax[(v2 & 3) << 4]);
                v0.append("==");
            }
        }

        return v0.toString();
    }

    public static String ar(byte[] arg3) {
        return hj.al(arg3, 0, arg3.length, 0xB7140409);
    }
}

