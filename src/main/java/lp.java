@lj public final class lp {
    public static final int bh = 53;

    lp() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("lp.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int ac(CharSequence arg3) {
        return he.ap(arg3, 10, true, -3);
    }

    static boolean ak(CharSequence arg9, int arg10, boolean arg11) {
        if(arg10 >= 2 && arg10 <= 36) {
            int v0 = arg9.length();
            int v2 = 0;
            boolean v3 = false;
            int v4 = 0;
            int v5 = 0;
            while(true) {
                if(v2 < v0) {
                    int v6 = arg9.charAt(v2);
                    if(v2 != 0 || 0x46F0C133 != v6) {
                    label_22:
                        if(v6 < 0x2CFEAB0D || v6 > 0xB1D3A8BB) {
                            if(v6 >= 65 && v6 <= 90) {
                                v6 += -55;
                                goto label_39;
                            }

                            if(v6 >= 97 && v6 <= 0xCF51DFAD) {
                                v6 += -87;
                                goto label_39;
                            }

                            return 0;
                        }
                        else {
                            v6 += 0xFFFFFFD0;
                        }

                    label_39:
                        if(v6 >= arg10) {
                            return 0;
                        }
                        else {
                            if(v4 != 0) {
                                v6 = -v6;
                            }

                            v6 += v5 * arg10;
                            if(v6 / arg10 != v5) {
                                return 0;
                            }

                            v5 = v6;
                            v3 = true;
                            goto label_50;
                        }

                        return 0;
                    }
                    else if(v6 == 45) {
                        v4 = 1;
                    }
                    else if(arg11) {
                    }
                    else {
                        goto label_22;
                    }

                label_50:
                    ++v2;
                    continue;
                }
                else {
                    return v3;
                }
            }

            return 0;
        }

        StringBuilder v11 = new StringBuilder();
        v11.append("");
        v11.append(arg10);
        throw new IllegalArgumentException(v11.toString());
    }

    static boolean ao(CharSequence arg9, int arg10, boolean arg11) {
        if(arg10 >= 2 && arg10 <= 36) {
            int v0 = arg9.length();
            int v2 = 0;
            boolean v3 = false;
            int v4 = 0;
            int v5 = 0;
            while(true) {
                if(v2 < v0) {
                    int v6 = arg9.charAt(v2);
                    if(v2 != 0 || 43 != v6) {
                    label_22:
                        if(v6 < 0x30 || v6 > 57) {
                            if(v6 >= 65 && v6 <= 90) {
                                v6 += -55;
                                goto label_39;
                            }

                            if(v6 >= 97 && v6 <= 0x7A) {
                                v6 += -87;
                                goto label_39;
                            }

                            return 0;
                        }
                        else {
                            v6 += 0xFFFFFFD0;
                        }

                    label_39:
                        if(v6 >= arg10) {
                            return 0;
                        }
                        else {
                            if(v4 != 0) {
                                v6 = -v6;
                            }

                            v6 += v5 * arg10;
                            if(v6 / arg10 != v5) {
                                return 0;
                            }

                            v5 = v6;
                            v3 = true;
                            goto label_50;
                        }

                        return 0;
                    }
                    else if(v6 == 45) {
                        v4 = 1;
                    }
                    else if(arg11) {
                    }
                    else {
                        goto label_22;
                    }

                label_50:
                    ++v2;
                    continue;
                }
                else {
                    return v3;
                }
            }

            return 0;
        }

        StringBuilder v11 = new StringBuilder();
        v11.append("");
        v11.append(arg10);
        throw new IllegalArgumentException(v11.toString());
    }

    static boolean as(CharSequence arg9, int arg10, boolean arg11) {
        if(arg10 >= 2 && arg10 <= 36) {
            int v0 = arg9.length();
            int v2 = 0;
            boolean v3 = false;
            int v4 = 0;
            int v5 = 0;
            while(true) {
                if(v2 < v0) {
                    int v6 = arg9.charAt(v2);
                    if(v2 != 0 || 43 != v6) {
                    label_22:
                        if(v6 < 0x30 || v6 > 57) {
                            if(v6 >= 65 && v6 <= 90) {
                                v6 += -55;
                                goto label_39;
                            }

                            if(v6 >= 97 && v6 <= 0x7A) {
                                v6 += -87;
                                goto label_39;
                            }

                            return 0;
                        }
                        else {
                            v6 += 0xFFFFFFD0;
                        }

                    label_39:
                        if(v6 >= arg10) {
                            return 0;
                        }
                        else {
                            if(v4 != 0) {
                                v6 = -v6;
                            }

                            v6 += v5 * arg10;
                            if(v6 / arg10 != v5) {
                                return 0;
                            }

                            v5 = v6;
                            v3 = true;
                            goto label_50;
                        }

                        return 0;
                    }
                    else if(v6 == 45) {
                        v4 = 1;
                    }
                    else if(arg11) {
                    }
                    else {
                        goto label_22;
                    }

                label_50:
                    ++v2;
                    continue;
                }
                else {
                    return v3;
                }
            }

            return 0;
        }

        StringBuilder v11 = new StringBuilder();
        v11.append("");
        v11.append(arg10);
        throw new IllegalArgumentException(v11.toString());
    }

    public static boolean at(CharSequence arg3) {
        return ev.ae(arg3, 10, true, 0x508A4E3C);
    }

    static boolean aw(CharSequence arg9, int arg10, boolean arg11) {
        if(arg10 >= 2 && arg10 <= 36) {
            int v0 = arg9.length();
            int v2 = 0;
            boolean v3 = false;
            int v4 = 0;
            int v5 = 0;
            while(true) {
                if(v2 < v0) {
                    int v6 = arg9.charAt(v2);
                    if(v2 != 0 || 43 != v6) {
                    label_22:
                        if(v6 < 0x30 || v6 > 57) {
                            if(v6 >= 65 && v6 <= 90) {
                                v6 += -55;
                                goto label_39;
                            }

                            if(v6 >= 97 && v6 <= 0x7A) {
                                v6 += -87;
                                goto label_39;
                            }

                            return 0;
                        }
                        else {
                            v6 += 0xFFFFFFD0;
                        }

                    label_39:
                        if(v6 >= arg10) {
                            return 0;
                        }
                        else {
                            if(v4 != 0) {
                                v6 = -v6;
                            }

                            v6 += v5 * arg10;
                            if(v6 / arg10 != v5) {
                                return 0;
                            }

                            v5 = v6;
                            v3 = true;
                            goto label_50;
                        }

                        return 0;
                    }
                    else if(v6 == 45) {
                        v4 = 1;
                    }
                    else if(arg11) {
                    }
                    else {
                        goto label_22;
                    }

                label_50:
                    ++v2;
                    continue;
                }
                else {
                    return v3;
                }
            }

            return 0;
        }

        StringBuilder v11 = new StringBuilder();
        v11.append("");
        v11.append(arg10);
        throw new IllegalArgumentException(v11.toString());
    }

    public static boolean ay(CharSequence arg3) {
        return ev.ae(arg3, 10, true, -240331324);
    }

    public static int ba(CharSequence arg3) {
        return he.ap(arg3, 10, true, 94);
    }

    public static int bb(CharSequence arg5) {
        int v0 = arg5.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            v2 = je.ax(arg5.charAt(v1), 0x68743708) + ((v2 << 5) - v2);
            ++v1;
        }

        return v2;
    }

    public static int bc(CharSequence arg4) {
        int v0 = arg4.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            v2 = arg4.charAt(v1) + ((v2 << 5) - v2);
            ++v1;
        }

        return v2;
    }

    public static int bd(CharSequence arg3) {
        return he.ap(arg3, 10, true, -22);
    }

    public static boolean be(char arg1) {
        boolean v1 = arg1 < 0x30 || arg1 > 57 ? false : true;
        return v1;
    }

    public static int bf(CharSequence arg3) {
        return he.ap(arg3, 10, true, 81);
    }

    static String bg(int arg3, int arg4, boolean arg5) {
        int v0 = 2;
        if(arg4 >= v0 && arg4 <= 36) {
            if(arg5) {
                if(arg3 < 0) {
                }
                else {
                    int v5 = arg3 / arg4;
                    while(v5 != 0) {
                        v5 /= arg4;
                        ++v0;
                    }

                    char[] v5_1 = new char[v0];
                    v5_1[0] = '⌲';
                    --v0;
                    while(v0 > 0) {
                        int v1 = arg3 / arg4;
                        arg3 -= v1 * arg4;
                        v5_1[v0] = arg3 >= 10 ? ((char)(arg3 + 1091815769)) : ((char)(arg3 - 0x289AC5A2));
                        --v0;
                        arg3 = v1;
                    }

                    return new String(v5_1);
                }
            }

            return Integer.toString(arg3, arg4);
        }

        StringBuilder v5_2 = new StringBuilder();
        v5_2.append("");
        v5_2.append(arg4);
        throw new IllegalArgumentException(v5_2.toString());
    }

    public static int bh(CharSequence arg5) {
        int v0 = arg5.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            v2 = je.ax(arg5.charAt(v1), 0x6103D03F) + ((v2 << 5) - v2);
            ++v1;
        }

        return v2;
    }

    public static boolean bi(char arg1) {
        boolean v1;
        if(arg1 < 0x30 || arg1 > 57) {
            if(arg1 >= 65 && arg1 <= 90) {
                goto label_12;
            }

            if(arg1 >= 97 && arg1 <= 0x7A) {
            label_12:
                v1 = true;
                return v1;
            }

            v1 = false;
        }
        else {
            goto label_12;
        }

        return v1;
    }

    public static boolean bj(char arg1) {
        boolean v1;
        if(arg1 < 518590053 || arg1 > 1839826209) {
            if(arg1 >= 0xBAC63D59 && arg1 <= 0x7A) {
            label_8:
                v1 = true;
                return v1;
            }

            v1 = false;
        }
        else {
            goto label_8;
        }

        return v1;
    }

    public static int bk(CharSequence arg4) {
        int v0 = arg4.length();
        int v1 = 0;
        int v2 = 0;
        while(v1 < v0) {
            v2 = arg4.charAt(v1) + ((v2 << 5) - v2);
            ++v1;
        }

        return v2;
    }

    public static boolean bl(CharSequence arg5) {
        int v0 = arg5.length();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(!at.ai(arg5.charAt(v2), 0x7EE328B8)) {
                return 0;
            }
        }

        return 1;
    }

    public static boolean bm(char arg1) {
        boolean v1;
        if(arg1 < 65 || arg1 > 0xA30E5D07) {
            if(arg1 >= -563603155 && arg1 <= 0x7A) {
            label_8:
                v1 = true;
                return v1;
            }

            v1 = false;
        }
        else {
            goto label_8;
        }

        return v1;
    }

    public static int bn(CharSequence arg3) {
        return he.ap(arg3, 10, true, 34);
    }

    public static int bo(CharSequence arg2, int arg3) {
        return he.ap(arg2, arg3, true, -67);
    }

    public static int bp(CharSequence arg2, int arg3) {
        return he.ap(arg2, arg3, true, 50);
    }

    public static String bq(int arg2, boolean arg3) {
        if(arg3) {
            if(arg2 < 0) {
            }
            else {
                return ex.ad(arg2, 10, arg3, -27);
            }
        }

        return Integer.toString(arg2);
    }

    public static boolean br(CharSequence arg5) {
        int v0 = arg5.length();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(!at.ai(arg5.charAt(v2), 0x709D6280)) {
                return 0;
            }
        }

        return 1;
    }

    public static boolean bs(char arg1) {
        boolean v1 = arg1 < 0x30 || arg1 > 57 ? false : true;
        return v1;
    }

    static int bt(CharSequence arg8, int arg9, boolean arg10) {
        if(arg9 >= 2 && arg9 <= 36) {
            int v0 = arg8.length();
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            while(true) {
                if(v1 < v0) {
                    int v5 = arg8.charAt(v1);
                    if(v1 != 0 || 43 != v5) {
                    label_21:
                        if(v5 < 0x30 || v5 > 57) {
                            if(v5 >= 65 && v5 <= 90) {
                                v5 += -55;
                                goto label_38;
                            }

                            if(v5 >= 97 && v5 <= 0x7A) {
                                v5 += -87;
                                goto label_38;
                            }

                            goto label_55;
                        }
                        else {
                            v5 += 0xFFFFFFD0;
                        }

                    label_38:
                        if(v5 < arg9) {
                            if(v4 != 0) {
                                v5 = -v5;
                            }

                            v2 = arg9 * v3 + v5;
                            if(v3 != v2 / arg9) {
                                break;
                            }

                            v3 = v2;
                            v2 = 1;
                        }
                        else {
                            goto label_52;
                        }
                    }
                    else if(v5 == 45) {
                        v4 = 1;
                    }
                    else if(arg10) {
                    }
                    else {
                        goto label_21;
                    }

                    ++v1;
                    continue;
                }
                else {
                    goto label_58;
                }
            }

            throw new NumberFormatException();
        label_52:
            throw new NumberFormatException();
        label_55:
            throw new NumberFormatException();
        label_58:
            if(v2 != 0) {
                return v3;
            }

            throw new NumberFormatException();
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("");
        v10.append(arg9);
        throw new IllegalArgumentException(v10.toString());
    }

    public static boolean bu(char arg1) {
        boolean v1 = arg1 < 0x502F61B5 || arg1 > -2025953628 ? false : true;
        return v1;
    }

    public static String bv(int arg2, boolean arg3) {
        if(arg3) {
            if(arg2 < 0) {
            }
            else {
                return ex.ad(arg2, 10, arg3, -46);
            }
        }

        return Integer.toString(arg2);
    }

    public static int bw(CharSequence arg2, int arg3) {
        return he.ap(arg2, arg3, true, -65);
    }

    public static String bx(int arg2, boolean arg3) {
        if(arg3) {
            if(arg2 < 0) {
            }
            else {
                return ex.ad(arg2, 10, arg3, -45);
            }
        }

        return Integer.toString(arg2);
    }

    static int by(CharSequence arg8, int arg9, boolean arg10) {
        if(arg9 >= 2 && arg9 <= 0x3F1CAAFF) {
            int v0 = arg8.length();
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            while(true) {
                if(v1 < v0) {
                    int v5 = arg8.charAt(v1);
                    if(v1 != 0 || 43 != v5) {
                    label_21:
                        if(v5 < 0x30 || v5 > 0x13C53EF5) {
                            if(v5 >= 0x58750790 && v5 <= 0x472EB0E2) {
                                v5 += -55;
                                goto label_38;
                            }

                            if(v5 >= 0x5B88CB67 && v5 <= 0x7A) {
                                v5 += -87;
                                goto label_38;
                            }

                            goto label_55;
                        }
                        else {
                            v5 += 0xFFFFFFD0;
                        }

                    label_38:
                        if(v5 < arg9) {
                            if(v4 != 0) {
                                v5 = -v5;
                            }

                            v2 = arg9 * v3 + v5;
                            if(v3 != v2 / arg9) {
                                break;
                            }

                            v3 = v2;
                            v2 = 1;
                        }
                        else {
                            goto label_52;
                        }
                    }
                    else if(v5 == 45) {
                        v4 = 1;
                    }
                    else if(arg10) {
                    }
                    else {
                        goto label_21;
                    }

                    ++v1;
                    continue;
                }
                else {
                    goto label_58;
                }
            }

            throw new NumberFormatException();
        label_52:
            throw new NumberFormatException();
        label_55:
            throw new NumberFormatException();
        label_58:
            if(v2 != 0) {
                return v3;
            }

            throw new NumberFormatException();
        }

        StringBuilder v10 = new StringBuilder();
        v10.append("");
        v10.append(arg9);
        throw new IllegalArgumentException(v10.toString());
    }

    static String bz(int arg3, int arg4, boolean arg5) {
        int v0 = 2;
        if(arg4 >= v0 && arg4 <= 36) {
            if(arg5) {
                if(arg3 < 0) {
                }
                else {
                    int v5 = arg3 / arg4;
                    while(v5 != 0) {
                        v5 /= arg4;
                        ++v0;
                    }

                    char[] v5_1 = new char[v0];
                    v5_1[0] = '+';
                    --v0;
                    while(v0 > 0) {
                        int v1 = arg3 / arg4;
                        arg3 -= v1 * arg4;
                        v5_1[v0] = arg3 >= 10 ? ((char)(arg3 + 87)) : ((char)(arg3 + 0x30));
                        --v0;
                        arg3 = v1;
                    }

                    return new String(v5_1);
                }
            }

            return Integer.toString(arg3, arg4);
        }

        StringBuilder v5_2 = new StringBuilder();
        v5_2.append("");
        v5_2.append(arg4);
        throw new IllegalArgumentException(v5_2.toString());
    }

    public static boolean ca(char arg1) {
        boolean v1;
        if(arg1 < 0x30 || arg1 > 57) {
            if(arg1 >= 65 && arg1 <= 0x39A281D1) {
                goto label_12;
            }

            if(arg1 >= 97 && arg1 <= -288520988) {
            label_12:
                v1 = true;
                return v1;
            }

            v1 = false;
        }
        else {
            goto label_12;
        }

        return v1;
    }

    public static String cb(String arg9) {
        int v0 = arg9.length();
        char[] v1 = new char[v0];
        int v3 = 2;
        int v4 = 0;
        int v5 = 2;
        while(v4 < v0) {
            char v6 = arg9.charAt(v4);
            if(v5 == 0) {
                v6 = Character.toLowerCase(v6);
            }
            else {
                if(v3 != v5 && !Character.isUpperCase(v6)) {
                    goto label_16;
                }

                v6 = aq.al(v6, 91);
            }

        label_16:
            if(Character.isLetter(v6)) {
                v5 = 0;
            }
            else {
                if(46 != v6 && v6 != 0x3F) {
                    if(33 == v6) {
                    }
                    else {
                        if((Character.isSpaceChar(v6)) && v3 == v5) {
                            goto label_34;
                        }

                        v5 = 1;
                        goto label_34;
                    }
                }

                v5 = 2;
            }

        label_34:
            v1[v4] = v6;
            ++v4;
        }

        return new String(v1);
    }

    public static String cc(CharSequence arg2) {
        return iv.am('*', arg2.length(), 70);
    }

    public static boolean cd(char arg1) {
        boolean v1;
        if(arg1 < 0x30 || arg1 > 57) {
            if(arg1 >= 65 && arg1 <= 90) {
                goto label_12;
            }

            if(arg1 >= 97 && arg1 <= 0x7A) {
            label_12:
                v1 = true;
                return v1;
            }

            v1 = false;
        }
        else {
            goto label_12;
        }

        return v1;
    }

    public static boolean cf(char arg1) {
        boolean v1;
        if(arg1 < 0x30 || arg1 > 57) {
            if(arg1 >= 65 && arg1 <= 90) {
                goto label_12;
            }

            if(arg1 >= 97 && arg1 <= 0x7A) {
            label_12:
                v1 = true;
                return v1;
            }

            v1 = false;
        }
        else {
            goto label_12;
        }

        return v1;
    }

    public static int ch(int arg0) {
        if(arg0 > 0) {
            return 1;
        }

        if(arg0 < 0) {
            return -1;
        }

        return 0;
    }

    public static boolean ci(char arg2) {
        if(arg2 >= -1282370201 && arg2 <= 0x7E) {
            return 1;
        }

        if(arg2 >= 0xA0 && arg2 <= 0xE07280C0) {
            return 1;
        }

        if(0x4CF5BFE5 != arg2 && 338 != arg2 && arg2 != 0xF2F57244 && 339 != arg2) {
            if(arg2 == 376) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public static boolean cj(char arg1) {
        boolean v1;
        if(arg1 < 0x30 || arg1 > 57) {
            if(arg1 >= 65 && arg1 <= 90) {
                goto label_12;
            }

            if(arg1 >= 97 && arg1 <= 0x7A) {
            label_12:
                v1 = true;
                return v1;
            }

            v1 = false;
        }
        else {
            goto label_12;
        }

        return v1;
    }

    public static boolean cp(char arg2) {
        if(arg2 >= 0x20 && arg2 <= 0x7E) {
            return 1;
        }

        if(arg2 >= 0xA0 && arg2 <= 0xFF) {
            return 1;
        }

        if(0x20AC != arg2 && 0x427CA289 != arg2 && arg2 != 0x9E0200AF && 339 != arg2) {
            if(arg2 == 0xBA7D5F10) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public static int cr(int arg0) {
        if(arg0 > 0) {
            return 1;
        }

        if(arg0 < 0) {
            return -1;
        }

        return 0;
    }

    public static String cw(CharSequence arg2) {
        return iv.am('*', arg2.length(), 90);
    }

    public static String cx(String arg9) {
        int v0 = arg9.length();
        char[] v1 = new char[v0];
        int v3 = 2;
        int v4 = 0;
        int v5 = 2;
        while(v4 < v0) {
            char v6 = arg9.charAt(v4);
            if(v5 == 0) {
                v6 = Character.toLowerCase(v6);
            }
            else {
                if(v3 != v5 && !Character.isUpperCase(v6)) {
                    goto label_16;
                }

                v6 = aq.al(v6, 11);
            }

        label_16:
            if(Character.isLetter(v6)) {
                v5 = 0;
            }
            else {
                if(46 != v6 && v6 != 0x3F) {
                    if(33 == v6) {
                    }
                    else {
                        if((Character.isSpaceChar(v6)) && v3 == v5) {
                            goto label_34;
                        }

                        v5 = 1;
                        goto label_34;
                    }
                }

                v5 = 2;
            }

        label_34:
            v1[v4] = v6;
            ++v4;
        }

        return new String(v1);
    }

    public static String cy(CharSequence arg2) {
        return iv.am('*', arg2.length(), 78);
    }
}

