public class lr {
    static int ad;
    static final char[] ax;

    static {
        lr.ax = new char[]{'€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ'};
    }

    lr() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("lr.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static byte[] aa(CharSequence arg5) {
        int v0 = arg5.length();
        byte[] v1 = new byte[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = arg5.charAt(v2);
            if(v3 <= 0 || v3 >= 0x80) {
                if(v3 >= 0xA0 && v3 <= 0xFF) {
                label_12:
                    v1[v2] = ((byte)v3);
                    goto label_152;
                }

                if(v3 == 0x20AC) {
                    v1[v2] = -128;
                    goto label_152;
                }

                if(v3 == 0x201A) {
                    v1[v2] = -126;
                    goto label_152;
                }

                if(402 == v3) {
                    v1[v2] = -125;
                    goto label_152;
                }

                if(v3 == 0x201E) {
                    v1[v2] = -124;
                    goto label_152;
                }

                if(v3 == 8230) {
                    v1[v2] = -123;
                    goto label_152;
                }

                if(0x2020 == v3) {
                    v1[v2] = -122;
                    goto label_152;
                }

                if(v3 == 0x2021) {
                    v1[v2] = -121;
                    goto label_152;
                }

                if(v3 == 710) {
                    v1[v2] = -120;
                    goto label_152;
                }

                if(v3 == 0x2030) {
                    v1[v2] = -119;
                    goto label_152;
                }

                if(0x160 == v3) {
                    v1[v2] = -118;
                    goto label_152;
                }

                if(0x2039 == v3) {
                    v1[v2] = -117;
                    goto label_152;
                }

                if(338 == v3) {
                    v1[v2] = -116;
                    goto label_152;
                }

                if(v3 == 381) {
                    v1[v2] = -114;
                    goto label_152;
                }

                if(0x2018 == v3) {
                    v1[v2] = -111;
                    goto label_152;
                }

                if(0x2019 == v3) {
                    v1[v2] = -110;
                    goto label_152;
                }

                if(8220 == v3) {
                    v1[v2] = -109;
                    goto label_152;
                }

                if(0x201D == v3) {
                    v1[v2] = -108;
                    goto label_152;
                }

                if(v3 == 0x2022) {
                    v1[v2] = -107;
                    goto label_152;
                }

                if(0x2013 == v3) {
                    v1[v2] = -106;
                    goto label_152;
                }

                if(v3 == 0x2014) {
                    v1[v2] = -105;
                    goto label_152;
                }

                if(v3 == 732) {
                    v1[v2] = -104;
                    goto label_152;
                }

                if(8482 == v3) {
                    v1[v2] = -103;
                    goto label_152;
                }

                if(353 == v3) {
                    v1[v2] = -102;
                    goto label_152;
                }

                if(8250 == v3) {
                    v1[v2] = -101;
                    goto label_152;
                }

                if(339 == v3) {
                    v1[v2] = -100;
                    goto label_152;
                }

                if(v3 == 382) {
                    v1[v2] = -98;
                    goto label_152;
                }

                if(376 == v3) {
                    v1[v2] = -97;
                    goto label_152;
                }

                v1[v2] = 0x3F;
            }
            else {
                goto label_12;
            }

        label_152:
        }

        return v1;
    }

    static char ab(char arg1) {
        if(arg1 != 0xB5) {
            if(402 == arg1) {
            }
            else {
                arg1 = Character.toTitleCase(arg1);
            }
        }

        return arg1;
    }

    public static byte ad(char arg1) {
        byte v1;
        if(arg1 <= 0 || arg1 >= 0x80) {
            if(arg1 >= 0x55530981 && arg1 <= 0xFF) {
            label_7:
                v1 = ((byte)arg1);
                return v1;
            }

            if(-2014640921 == arg1) {
                return 8;
            }

            if(0x880192A2 == arg1) {
                return 53;
            }

            if(arg1 == 0x8AA0BEAE) {
                return -47;
            }

            if(0x201E == arg1) {
                return -124;
            }

            if(0x4557573B == arg1) {
                return 110;
            }

            if(arg1 == 0x6E5AFDAC) {
                return 34;
            }

            if(arg1 == 0x2021) {
                return -123;
            }

            if(arg1 == 1978041463) {
                return -120;
            }

            if(arg1 == 0x2030) {
                return 102;
            }

            if(arg1 == 0x3A9F5BA) {
                return 89;
            }

            if(0xC3807E0F == arg1) {
                return -92;
            }

            if(-2033208465 == arg1) {
                return -126;
            }

            if(0x45EF4B56 == arg1) {
                return 61;
            }

            if(arg1 == 0xFBDCD824) {
                return -48;
            }

            if(0x4D314F6D == arg1) {
                return -110;
            }

            if(8220 == arg1) {
                return -109;
            }

            if(arg1 == 780110970) {
                return -4;
            }

            if(0x2022 == arg1) {
                return 0x4F;
            }

            if(arg1 == 0x2013) {
                return -106;
            }

            if(0x903709EB == arg1) {
                return -105;
            }

            if(arg1 == 732) {
                return -104;
            }

            if(arg1 == 8482) {
                return -24;
            }

            if(353 == arg1) {
                return -102;
            }

            if(8250 == arg1) {
                return 65;
            }

            if(0x55287AD6 == arg1) {
                return 108;
            }

            if(0xE485307E == arg1) {
                return 26;
            }

            if(376 == arg1) {
                return -97;
            }

            v1 = 0x3F;
        }
        else {
            goto label_7;
        }

        return v1;
    }

    static char af(char arg1) {
        if(arg1 != 0xB5) {
            if(402 == arg1) {
            }
            else {
                return Character.toTitleCase(arg1);
            }
        }

        return arg1;
    }

    public static int ag(CharSequence arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        arg5 -= arg4;
        int v0;
        for(v0 = 0; v0 < arg5; ++v0) {
            int v1 = arg3.charAt(v0 + arg4);
            if(v1 <= 0 || v1 >= 0x80) {
                if(v1 >= 0xA0 && v1 <= 0xFF) {
                label_12:
                    arg6[v0 + arg7] = ((byte)v1);
                    goto label_181;
                }

                if(v1 == 0x20AC) {
                    arg6[arg7 + v0] = -128;
                    goto label_181;
                }

                if(v1 == 0x201A) {
                    arg6[v0 + arg7] = -126;
                    goto label_181;
                }

                if(402 == v1) {
                    arg6[arg7 + v0] = -125;
                    goto label_181;
                }

                if(0x201E == v1) {
                    arg6[v0 + arg7] = -124;
                    goto label_181;
                }

                if(8230 == v1) {
                    arg6[arg7 + v0] = -123;
                    goto label_181;
                }

                if(0x2020 == v1) {
                    arg6[v0 + arg7] = -122;
                    goto label_181;
                }

                if(0x2021 == v1) {
                    arg6[arg7 + v0] = -121;
                    goto label_181;
                }

                if(710 == v1) {
                    arg6[arg7 + v0] = -120;
                    goto label_181;
                }

                if(0x2030 == v1) {
                    arg6[arg7 + v0] = -119;
                    goto label_181;
                }

                if(v1 == 0x160) {
                    arg6[arg7 + v0] = -118;
                    goto label_181;
                }

                if(v1 == 0x2039) {
                    arg6[v0 + arg7] = -117;
                    goto label_181;
                }

                if(338 == v1) {
                    arg6[arg7 + v0] = -116;
                    goto label_181;
                }

                if(v1 == 381) {
                    arg6[v0 + arg7] = -114;
                    goto label_181;
                }

                if(v1 == 0x2018) {
                    arg6[arg7 + v0] = -111;
                    goto label_181;
                }

                if(0x2019 == v1) {
                    arg6[arg7 + v0] = -110;
                    goto label_181;
                }

                if(8220 == v1) {
                    arg6[arg7 + v0] = -109;
                    goto label_181;
                }

                if(0x201D == v1) {
                    arg6[arg7 + v0] = -108;
                    goto label_181;
                }

                if(0x2022 == v1) {
                    arg6[arg7 + v0] = -107;
                    goto label_181;
                }

                if(v1 == 0x2013) {
                    arg6[v0 + arg7] = -106;
                    goto label_181;
                }

                if(0x2014 == v1) {
                    arg6[v0 + arg7] = -105;
                    goto label_181;
                }

                if(v1 == 732) {
                    arg6[arg7 + v0] = -104;
                    goto label_181;
                }

                if(v1 == 8482) {
                    arg6[arg7 + v0] = -103;
                    goto label_181;
                }

                if(353 == v1) {
                    arg6[arg7 + v0] = -102;
                    goto label_181;
                }

                if(v1 == 8250) {
                    arg6[arg7 + v0] = -101;
                    goto label_181;
                }

                if(339 == v1) {
                    arg6[v0 + arg7] = -100;
                    goto label_181;
                }

                if(382 == v1) {
                    arg6[arg7 + v0] = -98;
                    goto label_181;
                }

                if(376 == v1) {
                    arg6[arg7 + v0] = -97;
                    goto label_181;
                }

                arg6[v0 + arg7] = 0x3F;
            }
            else {
                goto label_12;
            }

        label_181:
        }

        return arg5;
    }

    public static String ah(byte[] arg6, int arg7, int arg8) {
        char[] v0 = new char[arg8];
        int v2 = 0;
        int v3 = 0;
        while(v2 < arg8) {
            int v4 = arg6[v2 + arg7] & 0xFF;
            if(v4 == 0) {
            }
            else {
                if(v4 >= 0x80 && v4 < 0xA0) {
                    v4 = lr.ax[v4 - 0x80];
                    if(v4 == 0) {
                        v4 = 0x3F;
                    }
                }

                v0[v3] = ((char)v4);
                ++v3;
            }

            ++v2;
        }

        return new String(v0, 0, v3);
    }

    static char ai(char arg1) {
        if(arg1 != 0xB5) {
            if(402 == arg1) {
            }
            else {
                arg1 = Character.toTitleCase(arg1);
            }
        }

        return arg1;
    }

    public static byte aj(char arg1) {
        byte v1;
        if(arg1 <= 0 || arg1 >= -108720403) {
            if(arg1 >= 0xA0 && arg1 <= 0xFF) {
            label_7:
                v1 = ((byte)arg1);
                return v1;
            }

            if(0xA1E01AB4 == arg1) {
                return -128;
            }

            if(0x201A == arg1) {
                return 30;
            }

            if(arg1 == 0x5CF618DF) {
                return -125;
            }

            if(0xE6A875DF == arg1) {
                return -87;
            }

            if(0xEC926AA6 == arg1) {
                return -32;
            }

            if(arg1 == 0xCF1A0760) {
                return -11;
            }

            if(arg1 == 0x99ADE5F) {
                return -91;
            }

            if(arg1 == 710) {
                return 59;
            }

            if(arg1 == 0x2030) {
                return -119;
            }

            if(arg1 == 0x160) {
                return 103;
            }

            if(0x2039 == arg1) {
                return -117;
            }

            if(338 == arg1) {
                return -116;
            }

            if(381 == arg1) {
                return 88;
            }

            if(arg1 == 0x44AE4791) {
                return -4;
            }

            if(0x2019 == arg1) {
                return 74;
            }

            if(8220 == arg1) {
                return -33;
            }

            if(arg1 == 0x201D) {
                return 37;
            }

            if(0x2022 == arg1) {
                return -46;
            }

            if(arg1 == -846048418) {
                return -106;
            }

            if(0x2014 == arg1) {
                return 33;
            }

            if(arg1 == 732) {
                return -104;
            }

            if(arg1 == 8482) {
                return -103;
            }

            if(353 == arg1) {
                return -85;
            }

            if(0x3BE00401 == arg1) {
                return -101;
            }

            if(339 == arg1) {
                return -100;
            }

            if(0xD7193A60 == arg1) {
                return -98;
            }

            if(376 == arg1) {
                return -121;
            }

            v1 = 0x73;
        }
        else {
            goto label_7;
        }

        return v1;
    }

    public static byte[] am(CharSequence arg5) {
        int v0 = arg5.length();
        byte[] v1 = new byte[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = arg5.charAt(v2);
            if(v3 <= 0 || v3 >= 0x80) {
                if(v3 >= 0xA0 && v3 <= 0xFF) {
                label_12:
                    v1[v2] = ((byte)v3);
                    goto label_152;
                }

                if(v3 == 0x20AC) {
                    v1[v2] = -128;
                    goto label_152;
                }

                if(v3 == 0x201A) {
                    v1[v2] = -126;
                    goto label_152;
                }

                if(402 == v3) {
                    v1[v2] = -125;
                    goto label_152;
                }

                if(v3 == 0x201E) {
                    v1[v2] = -124;
                    goto label_152;
                }

                if(v3 == 8230) {
                    v1[v2] = -123;
                    goto label_152;
                }

                if(0x2020 == v3) {
                    v1[v2] = -122;
                    goto label_152;
                }

                if(v3 == 0x2021) {
                    v1[v2] = -121;
                    goto label_152;
                }

                if(v3 == 710) {
                    v1[v2] = -120;
                    goto label_152;
                }

                if(v3 == 0x2030) {
                    v1[v2] = -119;
                    goto label_152;
                }

                if(0x160 == v3) {
                    v1[v2] = -118;
                    goto label_152;
                }

                if(0x2039 == v3) {
                    v1[v2] = -117;
                    goto label_152;
                }

                if(338 == v3) {
                    v1[v2] = -116;
                    goto label_152;
                }

                if(v3 == 381) {
                    v1[v2] = -114;
                    goto label_152;
                }

                if(0x2018 == v3) {
                    v1[v2] = -111;
                    goto label_152;
                }

                if(0x2019 == v3) {
                    v1[v2] = -110;
                    goto label_152;
                }

                if(8220 == v3) {
                    v1[v2] = -109;
                    goto label_152;
                }

                if(0x201D == v3) {
                    v1[v2] = -108;
                    goto label_152;
                }

                if(v3 == 0x2022) {
                    v1[v2] = -107;
                    goto label_152;
                }

                if(0x2013 == v3) {
                    v1[v2] = -106;
                    goto label_152;
                }

                if(v3 == 0x2014) {
                    v1[v2] = -105;
                    goto label_152;
                }

                if(v3 == 732) {
                    v1[v2] = -104;
                    goto label_152;
                }

                if(8482 == v3) {
                    v1[v2] = -103;
                    goto label_152;
                }

                if(353 == v3) {
                    v1[v2] = -102;
                    goto label_152;
                }

                if(8250 == v3) {
                    v1[v2] = -101;
                    goto label_152;
                }

                if(339 == v3) {
                    v1[v2] = -100;
                    goto label_152;
                }

                if(v3 == 382) {
                    v1[v2] = -98;
                    goto label_152;
                }

                if(376 == v3) {
                    v1[v2] = -97;
                    goto label_152;
                }

                v1[v2] = 0x3F;
            }
            else {
                goto label_12;
            }

        label_152:
        }

        return v1;
    }

    static char aq(char arg1) {
        if(arg1 != 0xB5) {
            if(402 == arg1) {
            }
            else {
                arg1 = Character.toTitleCase(arg1);
            }
        }

        return arg1;
    }

    public static String at(byte[] arg6, int arg7, int arg8) {
        char[] v0 = new char[arg8];
        int v2 = 0;
        int v3 = 0;
        while(v2 < arg8) {
            int v4 = arg6[v2 + arg7] & 0xFF;
            if(v4 == 0) {
            }
            else {
                if(v4 >= 0x80 && v4 < 0xA0) {
                    v4 = lr.ax[v4 - 0x80];
                    if(v4 == 0) {
                        v4 = 0x3F;
                    }
                }

                v0[v3] = ((char)v4);
                ++v3;
            }

            ++v2;
        }

        return new String(v0, 0, v3);
    }

    public static byte[] au(CharSequence arg5) {
        int v0 = arg5.length();
        byte[] v1 = new byte[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = arg5.charAt(v2);
            if(v3 <= 0 || v3 >= 0x80) {
                if(v3 >= 0xA0 && v3 <= 0xFF) {
                label_12:
                    v1[v2] = ((byte)v3);
                    goto label_152;
                }

                if(v3 == 0x20AC) {
                    v1[v2] = -71;
                    goto label_152;
                }

                if(v3 == 0x201A) {
                    v1[v2] = -126;
                    goto label_152;
                }

                if(0x734236C6 == v3) {
                    v1[v2] = -95;
                    goto label_152;
                }

                if(v3 == 0xA165D06D) {
                    v1[v2] = -38;
                    goto label_152;
                }

                if(v3 == -1851309341) {
                    v1[v2] = -123;
                    goto label_152;
                }

                if(0x2020 == v3) {
                    v1[v2] = 28;
                    goto label_152;
                }

                if(v3 == 0x3D0C3CC7) {
                    v1[v2] = -121;
                    goto label_152;
                }

                if(v3 == 710) {
                    v1[v2] = -120;
                    goto label_152;
                }

                if(v3 == 0x2030) {
                    v1[v2] = -119;
                    goto label_152;
                }

                if(0x160 == v3) {
                    v1[v2] = 15;
                    goto label_152;
                }

                if(0x830F1B68 == v3) {
                    v1[v2] = -117;
                    goto label_152;
                }

                if(0x6CBE9452 == v3) {
                    v1[v2] = -116;
                    goto label_152;
                }

                if(v3 == 381) {
                    v1[v2] = -114;
                    goto label_152;
                }

                if(0x2018 == v3) {
                    v1[v2] = 24;
                    goto label_152;
                }

                if(0x2019 == v3) {
                    v1[v2] = -110;
                    goto label_152;
                }

                if(8220 == v3) {
                    v1[v2] = -109;
                    goto label_152;
                }

                if(0x201D == v3) {
                    v1[v2] = 15;
                    goto label_152;
                }

                if(v3 == 0xEB27B337) {
                    v1[v2] = -107;
                    goto label_152;
                }

                if(0x6B64A3FD == v3) {
                    v1[v2] = 10;
                    goto label_152;
                }

                if(v3 == 1882302250) {
                    v1[v2] = -105;
                    goto label_152;
                }

                if(v3 == 0x39E083B0) {
                    v1[v2] = 60;
                    goto label_152;
                }

                if(0x1947A907 == v3) {
                    v1[v2] = -103;
                    goto label_152;
                }

                if(-232024403 == v3) {
                    v1[v2] = -102;
                    goto label_152;
                }

                if(0x92ECDCE1 == v3) {
                    v1[v2] = -87;
                    goto label_152;
                }

                if(339 == v3) {
                    v1[v2] = -100;
                    goto label_152;
                }

                if(v3 == -1322809142) {
                    v1[v2] = 109;
                    goto label_152;
                }

                if(376 == v3) {
                    v1[v2] = -97;
                    goto label_152;
                }

                v1[v2] = 0x3F;
            }
            else {
                goto label_12;
            }

        label_152:
        }

        return v1;
    }

    public static char av(byte arg3) {
        int v3 = arg3 & 0xFF;
        if(v3 != 0) {
            if(v3 >= 0x80 && v3 < 0xA0) {
                v3 = lr.ax[v3 - 0x80];
                if(v3 == 0) {
                    v3 = 0x3F;
                }
            }

            return ((char)v3);
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("");
        v1.append(Integer.toString(v3, 16));
        throw new IllegalArgumentException(v1.toString());
    }

    public static byte[] az(CharSequence arg5) {
        int v0 = arg5.length();
        byte[] v1 = new byte[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = arg5.charAt(v2);
            if(v3 <= 0 || v3 >= 0x80) {
                if(v3 >= 0xA0 && v3 <= 0xFF) {
                label_12:
                    v1[v2] = ((byte)v3);
                    goto label_152;
                }

                if(v3 == 0x20AC) {
                    v1[v2] = -128;
                    goto label_152;
                }

                if(v3 == 0x201A) {
                    v1[v2] = -126;
                    goto label_152;
                }

                if(402 == v3) {
                    v1[v2] = -125;
                    goto label_152;
                }

                if(v3 == 0x201E) {
                    v1[v2] = -124;
                    goto label_152;
                }

                if(v3 == 8230) {
                    v1[v2] = -123;
                    goto label_152;
                }

                if(0x2020 == v3) {
                    v1[v2] = -122;
                    goto label_152;
                }

                if(v3 == 0x2021) {
                    v1[v2] = -121;
                    goto label_152;
                }

                if(v3 == 710) {
                    v1[v2] = -120;
                    goto label_152;
                }

                if(v3 == 0x2030) {
                    v1[v2] = -119;
                    goto label_152;
                }

                if(0x160 == v3) {
                    v1[v2] = -118;
                    goto label_152;
                }

                if(0x2039 == v3) {
                    v1[v2] = -117;
                    goto label_152;
                }

                if(338 == v3) {
                    v1[v2] = -116;
                    goto label_152;
                }

                if(v3 == 381) {
                    v1[v2] = -114;
                    goto label_152;
                }

                if(0x2018 == v3) {
                    v1[v2] = -111;
                    goto label_152;
                }

                if(0x2019 == v3) {
                    v1[v2] = -110;
                    goto label_152;
                }

                if(8220 == v3) {
                    v1[v2] = -109;
                    goto label_152;
                }

                if(0x201D == v3) {
                    v1[v2] = -108;
                    goto label_152;
                }

                if(v3 == 0x2022) {
                    v1[v2] = -107;
                    goto label_152;
                }

                if(0x2013 == v3) {
                    v1[v2] = -106;
                    goto label_152;
                }

                if(v3 == 0x2014) {
                    v1[v2] = -105;
                    goto label_152;
                }

                if(v3 == 732) {
                    v1[v2] = -104;
                    goto label_152;
                }

                if(8482 == v3) {
                    v1[v2] = -103;
                    goto label_152;
                }

                if(353 == v3) {
                    v1[v2] = -102;
                    goto label_152;
                }

                if(8250 == v3) {
                    v1[v2] = -101;
                    goto label_152;
                }

                if(339 == v3) {
                    v1[v2] = -100;
                    goto label_152;
                }

                if(v3 == 382) {
                    v1[v2] = -98;
                    goto label_152;
                }

                if(376 == v3) {
                    v1[v2] = -97;
                    goto label_152;
                }

                v1[v2] = 0x3F;
            }
            else {
                goto label_12;
            }

        label_152:
        }

        return v1;
    }

    static final void cn(ie arg10, int arg11) {
        int v5;
        hw v11_1;
        int v6;
        try {
            int v0 = 580719067;
            if(arg10.de * v0 == 0) {
                return;
            }

            int v1 = 0x5A6E7359;
            int v2 = 0x224B5B17;
            int v3 = -1;
            int v4 = 0;
            if(v3 != arg10.cy * v1) {
                ii v11 = null;
                v6 = 0x8000;
                if(arg10.cy * v1 < v6) {
                    v11 = client.ev[arg10.cy * v1];
                }
                else if(arg10.cy * v1 >= v6) {
                    v11_1 = client.jf[arg10.cy * v1 - v6];
                }

                if((((ii)v11_1)) != null) {
                    v1 = arg10.bp * 0x914F0683 - ((ie)v11_1).bp * 0x914F0683;
                    v5 = arg10.bw * 0xD19D0C3D - ((ie)v11_1).bw * 0xD19D0C3D;
                    if(v1 == 0 && v5 == 0) {
                        goto label_60;
                    }

                    arg10.du = ((((int)(Math.atan2(((double)v1), ((double)v5)) * 325.949))) & 0x7FF) * 0x4EFE4D63;
                    goto label_60;
                }

                if(!arg10.cw) {
                    goto label_60;
                }

                arg10.cy = v2;
                arg10.cw = false;
            }

        label_60:
            if(arg10.cc * 0xD35D6E49 != v3 && (arg10.dk * -1091885127 == 0 || arg10.dy * 0x2856A03D > 0)) {
                arg10.du = arg10.cc * 0x81BB9B3B;
                arg10.cc = 1163009031;
            }

            v5 = 0x3A7ED159;
            arg11 = arg10.du * 0xE97D9C4B - arg10.bo * v5 & 0x7FF;
            if(arg11 == 0 && (arg10.cw)) {
                arg10.cy = v2;
                arg10.cw = false;
            }

            if(arg11 != 0) {
                arg10.dm += 0x83D80541;
                v2 = 630408529;
                v6 = 0x9F972243;
                int v8 = 0x98B08253;
                if(arg11 > 0x400) {
                    arg10.bo -= arg10.de * v8;
                    if(arg11 < arg10.de * v0 || arg11 > 0x800 - arg10.de * v0) {
                        arg10.bo = arg10.du * v6;
                    }
                    else {
                        v4 = 1;
                    }

                    if(arg10.bv * v2 != arg10.cp * -1493580901) {
                        goto label_189;
                    }

                    if(arg10.dm * 0x388F8AC1 <= 25 && v4 == 0) {
                        goto label_189;
                    }

                    if(arg10.bq * 0xEA27F125 != v3) {
                        arg10.cp = arg10.bq * 0xB1D24A3F;
                        goto label_189;
                    }

                    arg10.cp = arg10.bg * 0xE311A4FF;
                }
                else {
                    arg10.bo += arg10.de * v8;
                    if(arg11 < arg10.de * v0 || arg11 > 0x800 - arg10.de * v0) {
                        arg10.bo = arg10.du * v6;
                    }
                    else {
                        v4 = 1;
                    }

                    if(arg10.cp * -1493580901 != arg10.bv * v2) {
                        goto label_189;
                    }

                    if(arg10.dm * 0x388F8AC1 <= 25 && v4 == 0) {
                        goto label_189;
                    }

                    if(arg10.bx * 0xCD513083 != v3) {
                        arg10.cp = arg10.bx * 0xF2B79939;
                        goto label_189;
                    }

                    arg10.cp = arg10.bg * 0xE311A4FF;
                }

            label_189:
                arg10.bo = (arg10.bo * v5 & 0x7FF) * 0x953A66E9;
            }
            else {
                arg10.dm = 0;
            }
        }
        catch(RuntimeException v10) {
            StringBuilder v11_2 = new StringBuilder();
            v11_2.append("lr.cn(");
            v11_2.append(')');
            throw lx.al(((Throwable)v10), v11_2.toString());
        }
    }
}

