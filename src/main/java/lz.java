public final class lz {
    static ko ad = null;
    static long[] al = null;
    public static final String an = "acipK9";
    static final char[] ax;

    static {
        lz.ax = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        lz.al = new long[12];
        int v0;
        for(v0 = 0; v0 < lz.al.length; ++v0) {
            lz.al[v0] = ((long)Math.pow(37, ((double)v0)));
        }
    }

    lz() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("lz.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static String aa(long arg10) {
        String v0 = null;
        long v1 = 0;
        if(arg10 > v1) {
            if(arg10 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                if(arg10 % v3 == v1) {
                    return v0;
                }
                else {
                    int v0_1 = 0;
                    long v5;
                    for(v5 = arg10; v1 != v5; v5 /= v3) {
                        ++v0_1;
                    }

                    StringBuilder v5_1 = new StringBuilder(v0_1);
                    while(v1 != arg10) {
                        long v6 = arg10 / v3;
                        v5_1.append(lz.ax[((int)(arg10 - v6 * v3))]);
                        arg10 = v6;
                    }

                    return v5_1.reverse().toString();
                }
            }
        }

        return v0;
    }

    static long ab(CharSequence arg11) {
        long v6;
        int v0 = arg11.length();
        int v1 = 0;
        long v2 = 0;
        long v4 = v2;
        while(true) {
            v6 = 37;
            if(v1 < v0) {
                v4 *= v6;
                int v8 = arg11.charAt(v1);
                int v9 = 65;
                if(v8 < v9 || v8 > 90) {
                    v9 = 97;
                    if(v8 >= v9 && v8 <= 0x7A) {
                        v4 += ((long)(v8 + 1 - v9));
                        goto label_34;
                    }

                    v9 = 0x30;
                    if(v8 < v9) {
                        goto label_34;
                    }

                    if(v8 > 57) {
                        goto label_34;
                    }

                    v4 += ((long)(v8 + 27 - v9));
                }
                else {
                    v4 += ((long)(v8 + 1 - v9));
                }

            label_34:
                if(v4 >= 0x27817226572713DL) {
                    break;
                }

                ++v1;
                continue;
            }

            break;
        }

        while(v2 == v4 % v6) {
            if(v4 == v2) {
                return v4;
            }

            v4 /= v6;
        }

        return v4;
    }

    static long ad(CharSequence arg11) {
        long v6;
        int v0 = arg11.length();
        int v1 = 0;
        long v2 = 0;
        long v4 = v2;
        while(true) {
            v6 = 37;
            if(v1 < v0) {
                v4 *= v6;
                int v8 = arg11.charAt(v1);
                int v9 = 65;
                if(v8 < v9 || v8 > 90) {
                    v9 = 97;
                    if(v8 >= v9 && v8 <= 0x7A) {
                        v4 += ((long)(v8 + 1 - v9));
                        goto label_34;
                    }

                    v9 = 0x30;
                    if(v8 < v9) {
                        goto label_34;
                    }

                    if(v8 > 57) {
                        goto label_34;
                    }

                    v4 += ((long)(v8 + 27 - v9));
                }
                else {
                    v4 += ((long)(v8 + 1 - v9));
                }

            label_34:
                if(v4 >= 0x27817226572713DL) {
                    break;
                }

                ++v1;
                continue;
            }

            break;
        }

        while(v2 == v4 % v6) {
            if(v4 == v2) {
                return v4;
            }

            v4 /= v6;
        }

        return v4;
    }

    public static String af(long arg10) {
        String v0 = null;
        long v1 = 0;
        if(arg10 > v1) {
            if(arg10 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                if(arg10 % v3 == v1) {
                    return v0;
                }
                else {
                    int v0_1 = 0;
                    long v5;
                    for(v5 = arg10; v1 != v5; v5 /= v3) {
                        ++v0_1;
                    }

                    StringBuilder v5_1 = new StringBuilder(v0_1);
                    while(v1 != arg10) {
                        long v6 = arg10 / v3;
                        v5_1.append(lz.ax[((int)(arg10 - v6 * v3))]);
                        arg10 = v6;
                    }

                    return v5_1.reverse().toString();
                }
            }
        }

        return v0;
    }

    public static String ag(CharSequence arg2) {
        String v2 = as.al(cb.ax(arg2, -1370971227));
        if(v2 == null) {
            v2 = "";
        }

        return v2;
    }

    public static String ah(CharSequence arg2) {
        String v2 = jx.ae(cb.ax(arg2, -2097906055));
        if(v2 == null) {
            v2 = "";
        }

        return v2;
    }

    public static String ai(long arg10) {
        String v0 = null;
        long v1 = 0;
        if(arg10 > v1) {
            if(arg10 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                if(arg10 % v3 == v1) {
                    return v0;
                }
                else {
                    int v0_1 = 0;
                    long v5;
                    for(v5 = arg10; v1 != v5; v5 /= v3) {
                        ++v0_1;
                    }

                    StringBuilder v5_1 = new StringBuilder(v0_1);
                    while(v1 != arg10) {
                        long v6 = arg10 / v3;
                        v5_1.append(lz.ax[((int)(arg10 - v6 * v3))]);
                        arg10 = v6;
                    }

                    return v5_1.reverse().toString();
                }
            }
        }

        return v0;
    }

    static long aj(CharSequence arg11) {
        long v6;
        int v0 = arg11.length();
        int v1 = 0;
        long v2 = 0;
        long v4 = v2;
        while(true) {
            v6 = 37;
            if(v1 < v0) {
                v4 *= v6;
                int v8 = arg11.charAt(v1);
                int v9 = 65;
                if(v8 < v9 || v8 > 90) {
                    v9 = 97;
                    if(v8 < v9 || v8 > 0x7A) {
                        v9 = 0x30;
                        if(v8 < v9) {
                            goto label_32;
                        }
                        else if(v8 <= 57) {
                            v8 += 27;
                        }
                        else {
                            goto label_32;
                        }
                    }
                    else {
                        ++v8;
                    }

                    v4 += ((long)(v8 - v9));
                }
                else {
                    v4 += ((long)(v8 + 1 - v9));
                }

            label_32:
                if(v4 >= 0x27817226572713DL) {
                    break;
                }

                ++v1;
                continue;
            }

            break;
        }

        while(v2 == v4 % v6) {
            if(v4 == v2) {
                return v4;
            }

            v4 /= v6;
        }

        return v4;
    }

    public static String am(long arg11) {
        String v0 = null;
        long v1 = 0;
        if(arg11 > v1) {
            if(arg11 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                if(v1 == arg11 % v3) {
                    return v0;
                }
                else {
                    int v7 = 0;
                    long v5;
                    for(v5 = arg11; v1 != v5; v5 /= v3) {
                        ++v7;
                    }

                    StringBuilder v5_1 = new StringBuilder(v7);
                    while(v1 != arg11) {
                        long v6 = arg11 / v3;
                        char v11 = lz.ax[((int)(arg11 - v6 * v3))];
                        if(0x5F == v11) {
                            int v11_1 = v5_1.length() - 1;
                            v5_1.setCharAt(v11_1, Character.toUpperCase(v5_1.charAt(v11_1)));
                            v11 = ' ';
                        }

                        v5_1.append(v11);
                        arg11 = v6;
                    }

                    v5_1.reverse();
                    v5_1.setCharAt(0, Character.toUpperCase(v5_1.charAt(0)));
                    return v5_1.toString();
                }
            }
        }

        return v0;
    }

    public static void an(int arg5, int arg6) {
        ar v3;
        if(arg5 == -1) {
            return;
        }

        try {
            if(!ar.ad[arg5]) {
                return;
            }

            ar.aq.ag(arg5, 0);
            if(ar.aj[arg5] == null) {
                return;
            }

            arg6 = 0;
            int v1 = 1;
            while(true) {
                v3 = null;
                if(arg6 >= ar.aj[arg5].length) {
                    break;
                }

                if(ar.aj[arg5][arg6] != null) {
                    if(ar.aj[arg5][arg6].ay * 0x4A7987DB != 2) {
                        ar.aj[arg5][arg6] = v3;
                    }
                    else {
                        v1 = 0;
                    }
                }

                ++arg6;
            }

            if(v1 != 0) {
                ar.aj[arg5] = ((ar[])v3);
            }

            ar.ad[arg5] = false;
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("lz.an(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    static long ap(CharSequence arg10) {
        long v6;
        int v0 = arg10.length();
        int v1 = 0;
        long v2 = 0;
        long v4 = v2;
        while(true) {
            v6 = 37;
            if(v1 < v0) {
                v4 *= v6;
                int v8 = arg10.charAt(v1);
                if(v8 < 0x926A6A42 || v8 > 90) {
                    if(v8 >= 0x2582C340 && v8 <= 0xE31D2D10) {
                        v8 += 0xFFFFFFA0;
                    }
                    else if(v8 < 1713681400) {
                        goto label_34;
                    }
                    else if(v8 <= 57) {
                        v8 += -21;
                    }
                    else {
                        goto label_34;
                    }

                    v4 += ((long)v8);
                }
                else {
                    v4 += ((long)(v8 + 1 + 2002854366));
                }

            label_34:
                if(v4 >= 0x27817226572713DL) {
                    break;
                }

                ++v1;
                continue;
            }

            break;
        }

        while(v2 == v4 % v6) {
            if(v4 == v2) {
                return v4;
            }

            v4 /= v6;
        }

        return v4;
    }

    static long aq(CharSequence arg11) {
        long v6;
        int v0 = arg11.length();
        int v1 = 0;
        long v2 = 0;
        long v4 = v2;
        while(true) {
            v6 = 37;
            if(v1 < v0) {
                v4 *= v6;
                int v8 = arg11.charAt(v1);
                int v9 = 65;
                if(v8 < v9 || v8 > 2038236062) {
                    if(v8 >= 97 && v8 <= -100217655) {
                        v4 += ((long)(v8 + 1 - 0x74BCACFD));
                        goto label_36;
                    }

                    if(v8 < 0x30) {
                        goto label_36;
                    }

                    if(v8 > 0x6E5C6E8B) {
                        goto label_36;
                    }

                    v4 += ((long)(v8 + 27 - 90083917));
                }
                else {
                    v4 += ((long)(v8 + 1 - v9));
                }

            label_36:
                if(v4 >= 0x27817226572713DL) {
                    break;
                }

                ++v1;
                continue;
            }

            break;
        }

        while(v2 == v4 % v6) {
            if(v4 == v2) {
                return v4;
            }

            v4 /= v6;
        }

        return v4;
    }

    public static String at(CharSequence arg2) {
        String v2 = jx.ae(cb.ax(arg2, 0x8D96F6F2));
        if(v2 == null) {
            v2 = "";
        }

        return v2;
    }

    public static String au(long arg11) {
        String v0 = null;
        long v1 = 0;
        if(arg11 > v1) {
            if(arg11 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                if(v1 == arg11 % v3) {
                    return v0;
                }
                else {
                    int v7 = 0;
                    long v5;
                    for(v5 = arg11; v1 != v5; v5 /= v3) {
                        ++v7;
                    }

                    StringBuilder v5_1 = new StringBuilder(v7);
                    while(v1 != arg11) {
                        long v6 = arg11 / v3;
                        char v11 = lz.ax[((int)(arg11 - v6 * v3))];
                        if(0x46F5EA05 == v11) {
                            int v11_1 = v5_1.length() - 1;
                            v5_1.setCharAt(v11_1, Character.toUpperCase(v5_1.charAt(v11_1)));
                            v11 = '渔';
                        }

                        v5_1.append(v11);
                        arg11 = v6;
                    }

                    v5_1.reverse();
                    v5_1.setCharAt(0, Character.toUpperCase(v5_1.charAt(0)));
                    return v5_1.toString();
                }
            }
        }

        return v0;
    }

    public static String av(long arg10) {
        String v0 = null;
        long v1 = 0;
        if(arg10 > v1) {
            if(arg10 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                if(arg10 % v3 == v1) {
                    return v0;
                }
                else {
                    int v0_1 = 0;
                    long v5;
                    for(v5 = arg10; v1 != v5; v5 /= v3) {
                        ++v0_1;
                    }

                    StringBuilder v5_1 = new StringBuilder(v0_1);
                    while(v1 != arg10) {
                        long v6 = arg10 / v3;
                        v5_1.append(lz.ax[((int)(arg10 - v6 * v3))]);
                        arg10 = v6;
                    }

                    return v5_1.reverse().toString();
                }
            }
        }

        return v0;
    }

    public static String ay(CharSequence arg2) {
        String v2 = jx.ae(cb.ax(arg2, -1970286280));
        if(v2 == null) {
            v2 = "";
        }

        return v2;
    }

    public static String az(long arg11) {
        String v0 = null;
        long v1 = 0;
        if(arg11 > v1) {
            if(arg11 >= 6582952005840035281L) {
            }
            else {
                long v3 = 37;
                if(v1 == arg11 % v3) {
                    return v0;
                }
                else {
                    int v7 = 0;
                    long v5;
                    for(v5 = arg11; v1 != v5; v5 /= v3) {
                        ++v7;
                    }

                    StringBuilder v5_1 = new StringBuilder(v7);
                    while(v1 != arg11) {
                        long v6 = arg11 / v3;
                        char v11 = lz.ax[((int)(arg11 - v6 * v3))];
                        if(0x5F == v11) {
                            int v11_1 = v5_1.length() - 1;
                            v5_1.setCharAt(v11_1, Character.toUpperCase(v5_1.charAt(v11_1)));
                            v11 = ' ';
                        }

                        v5_1.append(v11);
                        arg11 = v6;
                    }

                    v5_1.reverse();
                    v5_1.setCharAt(0, Character.toUpperCase(v5_1.charAt(0)));
                    return v5_1.toString();
                }
            }
        }

        return v0;
    }
}

