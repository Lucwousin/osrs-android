import java.util.Random;

public class od extends mv {
    static int aa = -1;
    public int ab;
    public int ad;
    int[] ae;
    public static ef[] af = null;
    static int ag = 0;
    static int ah = 0xFF;
    byte[] ai;
    public int aj;
    int[] al;
    static int am = -1;
    int[] an;
    static String[] ao = null;
    int[] ap;
    public int aq;
    int[] ar;
    static int at = 0;
    static int au = -1;
    static int av = -1;
    static Random aw;
    byte[][] ax;
    static int ay;
    static int az;

    static {
        od.aw = new Random();
        od.ao = new String[100];
    }

    public od(byte[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, byte[][] arg8) {
        super();
        int v7 = 0x100;
        this.ax = new byte[v7][];
        int v0 = 0;
        this.aj = 0;
        this.an = arg3;
        this.ap = arg4;
        this.ae = arg5;
        this.ar = arg6;
        this.ax(arg2);
        this.ax = arg8;
        int v2 = 0x7FFFFFFF;
        int v3 = 0x80000000;
        while(v0 < v7) {
            if(this.ap[v0] < v2 && this.ar[v0] != 0) {
                v2 = this.ap[v0];
            }

            if(this.ap[v0] + this.ar[v0] > v3) {
                v3 = this.ap[v0] + this.ar[v0];
            }

            ++v0;
        }

        this.ad = this.aj - v2;
        this.aq = v3 - this.aj;
        this.ab = this.aj - this.ap[120];
    }

    public od(byte[] arg2) {
        super();
        this.ax = new byte[0x100][];
        this.aj = 0;
        this.ax(arg2);
    }

    public void aa(String arg9, int arg10, int arg11, int arg12, int arg13, int arg14, fa arg15) {
        if(arg9 == null) {
            return;
        }

        this.ag(arg12, arg13);
        int[] v5 = new int[arg9.length()];
        for(arg12 = 0; arg12 < arg9.length(); ++arg12) {
            v5[arg12] = ((int)(Math.sin((((double)arg12)) / 2 + (((double)arg14)) / 5) * 5));
        }

        this.aw(arg9, arg10 - this.ar(arg9) / 2, arg11, null, v5, arg15);
    }

    public void ab(String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, fa arg7) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        od.ah = arg6;
        this.ay(arg1, arg2, arg3, arg7);
    }

    void ac(int[] arg18, byte[] arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27) {
        int v1 = arg27;
        int v2 = v1 << 24 | arg20;
        int v3 = 0xFF00FF;
        int v5 = 0xFF00FF00;
        int v6 = 0xFF00;
        int v0 = ((arg20 & v3) * v1 & v5) + ((arg20 & v6) * v1 & 0xFF0000) >> 8;
        int v4 = 0xFF - v1;
        int v8 = -arg24;
        int v9 = arg21;
        int v10 = arg22;
        while(v8 < 0) {
            int v12 = -arg23;
            while(v12 < 0) {
                int v13 = v9 + 1;
                if(arg19[v9] != 0) {
                    v9 = arg18[v10];
                    if(v9 == 0) {
                        v9 = v10 + 1;
                        arg18[v10] = v2;
                    }
                    else {
                        arg18[v10] = Math.max(v9 >>> 24, v1) << 24 | (((v9 & v3) * v4 & v5) + ((v9 & v6) * v4 & 0xFF0000) >> 8) + v0;
                        v9 = v10 + 1;
                    }

                    v10 = v9;
                }
                else {
                    ++v10;
                }

                ++v12;
                v9 = v13;
            }

            v10 += arg25;
            v9 += arg26;
            ++v8;
        }
    }

    public static String ad(String arg7) {
        int v0 = arg7.length();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            int v4 = 62;
            int v5 = 60;
            if(v2 >= v0) {
                break;
            }

            int v6 = arg7.charAt(v2);
            if(v6 == v5 || v6 == v4) {
                v3 += 3;
            }

            ++v2;
        }

        StringBuilder v2_1 = new StringBuilder(v3 + v0);
        while(v1 < v0) {
            char v3_1 = arg7.charAt(v1);
            if(v3_1 == v5) {
                v2_1.append("<lt>");
            }
            else if(v3_1 == v4) {
                v2_1.append("<gt>");
            }
            else {
                v2_1.append(v3_1);
            }

            ++v1;
        }

        return v2_1.toString();
    }

    int ae(char arg3) {
        if(arg3 == 0xA0) {
            arg3 = ' ';
        }

        return this.al[je.ax(arg3, 0x5DDAC817) & 0xFF];
    }

    public void af(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2 - this.ar(arg1), arg3, arg6);
    }

    void ag(int arg2, int arg3) {
        od.av = -1;
        od.aa = -1;
        od.au = arg3;
        od.am = arg3;
        od.az = arg2;
        od.ag = arg2;
        od.ah = 0xFF;
        od.at = 0;
        od.ay = 0;
    }

    void ah(String arg6) {
        try {
            int v1 = 4;
            byte v2 = 18;
            int v3 = 16;
            if(arg6.startsWith("col=")) {
                od.ag = ao.an(arg6.substring(v1), v3, v2);
            }
            else if(arg6.equals("/col")) {
                od.ag = od.az;
            }
            else if(arg6.startsWith("str=")) {
                od.av = ao.an(arg6.substring(v1), v3, v2);
            }
            else if(arg6.equals("str")) {
                od.av = 0x800000;
            }
            else {
                v1 = -1;
                if(arg6.equals("/str")) {
                    od.av = v1;
                }
                else if(arg6.startsWith("u=")) {
                    od.aa = ao.an(arg6.substring(2), v3, v2);
                }
                else if(arg6.equals("u")) {
                    od.aa = 0;
                }
                else if(arg6.equals("/u")) {
                    od.aa = v1;
                }
                else if(arg6.startsWith("shad=")) {
                    od.am = ao.an(arg6.substring(5), v3, v2);
                }
                else if(arg6.equals("shad")) {
                    od.am = 0;
                }
                else if(arg6.equals("/shad")) {
                    od.am = od.au;
                }
                else if(arg6.equals("br")) {
                    this.ag(od.az, od.au);
                }
            }

            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public void ai(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2 - this.ar(arg1) / 2, arg3, arg6);
    }

    public int aj(String arg3, int arg4) {
        return this.an(arg3, new int[]{arg4}, od.ao);
    }

    void ak(byte[] arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        int v4;
        int v10;
        int v6;
        int v2 = arg16;
        int v3 = arg17;
        fa v7 = arg22;
        if(arg21 >= 0xFF) {
            this.ao(arg15, arg16, arg17, arg18, arg19, arg20, arg22);
            return;
        }

        int v1 = -107049639;
        int v0 = v7.al * v1 * v3 + v2;
        int v5 = v7.al * v1 - arg18;
        int v8 = 2002832733;
        int v9 = 0;
        if(v3 < v7.ar * v8) {
            v6 = v7.ar * v8 - v3;
            v8 *= v7.ar;
            v1 = v0 + v6 * (v7.al * v1);
            v0 = v6 * arg18;
            v10 = arg19 - v6;
        }
        else {
            v10 = arg19;
            v1 = v0;
            v8 = v3;
            v0 = 0;
        }

        v8 += v10;
        v6 = 0xD21DC9D7;
        if(v8 > v7.an * v6) {
            v10 -= v8 - v7.an * v6;
        }

        v8 = v10;
        v6 = 0xE4D30573;
        if(v2 < v7.ap * v6) {
            v3 = v7.ap * v6 - v2;
            v4 = v7.ap * v6;
            v0 += v3;
            v9 = v3;
            v5 += v3;
            v6 = v1 + v3;
            int v13 = v4;
            v4 = arg18 - v3;
            v2 = v13;
        }
        else {
            v4 = arg18;
            v6 = v1;
        }

        v2 += v4;
        v3 = 0x56AC17CD;
        if(v2 > v7.aj * v3) {
            v2 -= v7.aj * v3;
            v4 -= v2;
            v9 += v2;
            v5 += v2;
        }

        v10 = v5;
        int v12 = v9;
        v9 = v4;
        if(v9 > 0) {
            if(v8 <= 0) {
            }
            else {
                this.ac(v7.ax, arg15, arg20, v0, v6, v9, v8, v10, v12, arg21);
                return;
            }
        }
    }

    static int al(byte[][] arg4, byte[][] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10) {
        int v0 = arg6[arg9];
        int v1 = arg8[arg9] + v0;
        int v6 = arg6[arg10];
        int v8 = arg8[arg10] + v6;
        int v2 = v6 > v0 ? v6 : v0;
        if(v8 < v1) {
        }
        else {
            v8 = v1;
        }

        v1 = arg7[arg9];
        if(arg7[arg10] < v1) {
            v1 = arg7[arg10];
        }

        byte[] v5 = arg5[arg9];
        byte[] v4 = arg4[arg10];
        int v7 = v2 - v0;
        for(v6 = v2 - v6; v2 < v8; v6 = arg10) {
            arg9 = v7 + 1;
            arg10 = v6 + 1;
            v7 = v5[v7] + v4[v6];
            if(v7 < v1) {
                v1 = v7;
            }

            ++v2;
            v7 = arg9;
        }

        return -v1;
    }

    public void am(String arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        if(arg15 == null) {
            return;
        }

        this.ag(arg18, arg19);
        double v2 = 7 - (((double)arg21)) / 8;
        double v4 = 0;
        if(v2 < v4) {
            v2 = v4;
        }

        int[] v5 = new int[arg15.length()];
        int v0;
        for(v0 = 0; v0 < arg15.length(); ++v0) {
            v5[v0] = ((int)(Math.sin((((double)v0)) / 1.5 + (((double)arg20)) / 1) * v2));
        }

        this.aw(arg15, arg16 - this.ar(arg15) / 2, arg17, null, v5, arg22);
    }

    public int an(String arg18, int[] arg19, String[] arg20) {
        int v2_1;
        int v1_1;
        int v6_1;
        char v6;
        od v0 = this;
        String v1 = arg18;
        int[] v2 = arg19;
        if(v1 == null) {
            return 0;
        }

        StringBuilder v4 = new StringBuilder(100);
        int v5 = arg18.length();
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = -1;
        int v11 = 0;
        int v12 = 0;
        int v13 = -1;
        int v14 = 0;
        int v15 = 0;
        while(v7 < v5) {
            char v3 = v1.charAt(v7);
            if(v3 == 60) {
                v10 = v7;
            }
            else {
                if(v3 != 62 || v10 == -1) {
                    v6_1 = -1;
                }
                else {
                    String v3_1 = v1.substring(v10 + 1, v7);
                    v4.append('<');
                    v4.append(v3_1);
                    v4.append('>');
                    if(v3_1.equals("br")) {
                        arg20[v9] = v4.toString().substring(v8, v4.length());
                        ++v9;
                        v8 = v4.length();
                        v11 = 0;
                        v12 = 0;
                        v13 = -1;
                    }
                    else if(v3_1.equals("lt")) {
                        v6 = '<';
                        v11 += v0.ae(v6);
                        if(v0.ai != null && v12 != -1) {
                            v11 += v0.ai[(v12 << 8) + v6];
                        }

                        v11 = v11;
                        v12 = 60;
                    }
                    else {
                        if(v3_1.equals("gt")) {
                            v6 = '>';
                            v11 += v0.ae(v6);
                            if(v0.ai != null && v12 != -1) {
                                v11 += v0.ai[(v12 << 8) + v6];
                            }

                            v11 = v11;
                            v12 = 62;
                            goto label_102;
                        }

                        if(!v3_1.startsWith("img=")) {
                            goto label_102;
                        }

                        v6_1 = 4;
                        try {
                            v11 = od.af[bw.ar(v3_1.substring(v6_1), 0x61771091)].aj + v11;
                            v12 = 0;
                            goto label_102;
                        }
                        catch(Exception ) {
                        label_102:
                            v3 = '\u0000';
                            v6_1 = -1;
                            v10 = -1;
                            goto label_107;
                        }
                    }

                    goto label_102;
                }

            label_107:
                if(v10 != v6_1) {
                    goto label_158;
                }

                if(v3 != 0) {
                    v4.append(v3);
                    v11 += v0.ae(v3);
                    if(v0.ai != null && v12 != v6_1) {
                        v11 += v0.ai[(v12 << 8) + v3];
                    }

                    v12 = v3;
                }

                if(v3 == 0x20) {
                    v13 = v4.length();
                    v15 = v11;
                    v14 = 1;
                }

                if(v2 != null) {
                    v1_1 = v9 < v2.length ? v9 : v2.length - 1;
                    if(v11 <= v2[v1_1]) {
                        goto label_147;
                    }

                    if(v13 < 0) {
                        goto label_147;
                    }

                    arg20[v9] = v4.toString().substring(v8, v13 - v14);
                    ++v9;
                    v11 -= v15;
                    v1_1 = -1;
                    v12 = 0;
                }
                else {
                label_147:
                    v1_1 = v13;
                    v13 = v8;
                }

                if(v3 == 45) {
                    v1_1 = v4.length();
                    v15 = v11;
                    v8 = v13;
                    v14 = 0;
                }
                else {
                    v8 = v13;
                }

                v13 = v1_1;
            }

        label_158:
            ++v7;
            v1 = arg18;
        }

        v1 = v4.toString();
        if(v1.length() > v8) {
            v2_1 = v9 + 1;
            arg20[v9] = v1.substring(v8, v1.length());
        }
        else {
            v2_1 = v9;
        }

        return v2_1;
    }

    void ao(byte[] arg23, int arg24, int arg25, int arg26, int arg27, int arg28, fa arg29) {
        int v2;
        int v16;
        int v15;
        int v10;
        int v7;
        int v0 = arg24;
        int v1 = arg25;
        fa v3 = arg29;
        int v5 = -107049639;
        int v4 = v3.al * v5 * v1 + v0;
        int v6 = v3.al * v5 - arg26;
        int v8 = 2002832733;
        int v9 = 0;
        if(v1 < v3.ar * v8) {
            v7 = v3.ar * v8 - v1;
            v8 *= v3.ar;
            v4 += v7 * (v3.al * v5);
            v10 = arg27 - v7;
            v1 = v7 * arg26;
        }
        else {
            v10 = arg27;
            v8 = v1;
            v1 = 0;
        }

        v8 += v10;
        v7 = 0xD21DC9D7;
        if(v8 > v3.an * v7) {
            v10 -= v8 - v3.an * v7;
        }

        int v18 = v10;
        v7 = 0xE4D30573;
        if(v0 < v3.ap * v7) {
            v5 = v3.ap * v7 - v0;
            v9 = v5;
            v6 += v5;
            v15 = v1 + v5;
            v16 = v4 + v5;
            v2 = arg26 - v5;
            v0 = v3.ap * v7;
        }
        else {
            v2 = arg26;
            v15 = v1;
            v16 = v4;
        }

        v0 += v2;
        v4 = 0x56AC17CD;
        if(v0 > v3.aj * v4) {
            v0 -= v3.aj * v4;
            v2 -= v0;
            v9 += v0;
            v6 += v0;
        }

        int v17 = v2;
        int v19 = v6;
        int v20 = v9;
        if(v17 > 0) {
            if(v18 <= 0) {
            }
            else {
                this.as(v3.ax, arg23, arg28, v15, v16, v17, v18, v19, v20);
                return;
            }
        }
    }

    public int ap(String arg3, int arg4) {
        int[] v0 = new int[1];
        int v1 = 0;
        v0[0] = arg4;
        int v3 = this.an(arg3, v0, od.ao);
        arg4 = 0;
        while(v1 < v3) {
            int v0_1 = this.ar(od.ao[v1]);
            if(v0_1 > arg4) {
                arg4 = v0_1;
            }

            ++v1;
        }

        return arg4;
    }

    public void aq(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2, arg3, arg6);
    }

    public int ar(String arg9) {
        int v0 = 0;
        if(arg9 == null) {
            return 0;
        }

        int v1 = -1;
        int v2 = 0;
        int v3 = -1;
        int v4 = -1;
        while(v0 < arg9.length()) {
            char v5 = arg9.charAt(v0);
            if(v5 == 60) {
                v3 = v0;
            }
            else {
                if(v5 == 62 && v3 != v1) {
                    String v3_1 = arg9.substring(v3 + 1, v0);
                    if(v3_1.equals("lt")) {
                        v3 = -1;
                        v5 = '<';
                    }
                    else if(v3_1.equals("gt")) {
                        v3 = -1;
                        v5 = '>';
                    }
                    else if(v3_1.startsWith("img=")) {
                        int v5_1 = 4;
                        try {
                            v2 += od.af[bw.ar(v3_1.substring(v5_1), 1960432293)].aj;
                            v3 = -1;
                            v4 = -1;
                        }
                        catch(Exception ) {
                        label_45:
                            v3 = -1;
                        }

                        goto label_67;
                    }
                    else {
                        goto label_45;
                    }
                }

                if(v5 == 0xA0) {
                    v5 = ' ';
                }

                if(v3 != v1) {
                    goto label_67;
                }

                v2 += this.al[((char)(je.ax(v5, 0x61FA2147) & 0xFF))];
                if(this.ai != null && v4 != v1) {
                    v2 += this.ai[(v4 << 8) + v5];
                }

                v4 = v5;
            }

        label_67:
            ++v0;
        }

        return v2;
    }

    void as(int[] arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v2;
        int v0 = -(arg10 >> 2);
        arg10 = -(arg10 & 3);
        arg7 |= 0xFF000000;
        arg11 = -arg11;
        while(arg11 < 0) {
            int v1 = arg9;
            arg9 = arg8;
            arg8 = v0;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg9 = v1 + 1;
                    arg5[v1] = arg7;
                }
                else {
                    arg9 = v1 + 1;
                }

                v1 = v2 + 1;
                if(arg6[v2] != 0) {
                    v2 = arg9 + 1;
                    arg5[arg9] = arg7;
                }
                else {
                    v2 = arg9 + 1;
                }

                arg9 = v1 + 1;
                if(arg6[v1] != 0) {
                    v1 = v2 + 1;
                    arg5[v2] = arg7;
                }
                else {
                    v1 = v2 + 1;
                }

                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg5[v1] = arg7;
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            arg8 = arg10;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg5[v1] = arg7;
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            ++arg11;
            int v3 = arg9 + arg13;
            arg9 = v1 + arg12;
            arg8 = v3;
        }
    }

    void at(String arg7, int arg8) {
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v1 < arg7.length()) {
            int v4 = arg7.charAt(v1);
            if(v4 == 60) {
                v3 = 1;
            }
            else if(v4 == 62) {
                v3 = 0;
            }
            else if(v3 == 0 && v4 == 0x20) {
                ++v2;
            }

            ++v1;
        }

        if(v2 > 0) {
            od.at = (arg8 - this.ar(arg7) << 8) / v2;
        }
    }

    public void au(String arg15, int arg16, int arg17, int arg18, int arg19, int arg20, fa arg21) {
        if(arg15 == null) {
            return;
        }

        this.ag(arg18, arg19);
        int[] v4 = new int[arg15.length()];
        int[] v5 = new int[arg15.length()];
        int v0;
        for(v0 = 0; v0 < arg15.length(); ++v0) {
            double v2 = ((double)v0);
            double v12 = (((double)arg20)) / 5;
            v4[v0] = ((int)(Math.sin(v2 / 5 + v12) * 5));
            v5[v0] = ((int)(Math.sin(v2 / 3 + v12) * 5));
        }

        this.aw(arg15, arg16 - this.ar(arg15) / 2, arg17, v4, v5, arg21);
    }

    public int av(String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, fa arg14) {
        if(arg4 == null) {
            return 0;
        }

        this.ag(arg9, arg10);
        if(arg13 == 0) {
            arg13 = this.aj;
        }

        int[] v10 = new int[]{arg7};
        if(arg8 < this.ad + this.aq + arg13 && arg8 < arg13 + arg13) {
            v10 = null;
        }

        int v4 = this.an(arg4, v10, od.ao);
        arg10 = 2;
        if(1 == 0) {
            arg8 = this.ad;
            goto label_26;
        }
        else if(1 == 1) {
            arg6 += this.ad;
            arg8 = (arg8 - this.ad - this.aq - (v4 - 1) * arg13) / arg10;
        label_26:
            arg6 += arg8;
        }
        else if(1 == arg10) {
            arg6 = arg6 + arg8 - this.aq - (v4 - 1) * arg13;
        }
        else {
            arg8 = (arg8 - this.ad - this.aq - (v4 - 1) * arg13) / (v4 + 1);
            if(arg8 < 0) {
                arg8 = 0;
            }

            arg6 = arg6 + this.ad + arg8;
            arg13 += arg8;
        }

        arg8 = arg6;
        for(arg6 = 0; arg6 < v4; ++arg6) {
            if(arg11 == 0) {
                this.ay(od.ao[arg6], arg5, arg8, arg14);
            }
            else if(arg11 == 1) {
                this.ay(od.ao[arg6], (arg7 - this.ar(od.ao[arg6])) / arg10 + arg5, arg8, arg14);
            }
            else if(arg11 == arg10) {
                this.ay(od.ao[arg6], arg5 + arg7 - this.ar(od.ao[arg6]), arg8, arg14);
            }
            else if(arg6 == v4 - 1) {
                this.ay(od.ao[arg6], arg5, arg8, arg14);
            }
            else {
                this.at(od.ao[arg6], arg7);
                this.ay(od.ao[arg6], arg5, arg8, arg14);
                od.at = 0;
            }

            arg8 += arg13;
        }

        return v4;
    }

    void aw(String arg26, int arg27, int arg28, int[] arg29, int[] arg30, fa arg31) {
        int v24;
        int v23;
        fa v12;
        ef v0_2;
        int v7;
        int v4_1;
        int v21;
        od v9 = this;
        String v10 = arg26;
        int v11 = arg28 - v9.aj;
        int v13 = -1;
        int v2 = arg27;
        int v0 = -1;
        int v1 = -1;
        int v3 = 0;
        int v8;
        for(v8 = 0; v8 < arg26.length(); v8 = v21 + 1) {
            if(v10.charAt(v8) == 0) {
                v21 = v8;
                goto label_263;
            }

            int v5 = 0xFF;
            char v4 = ((char)(je.ax(v10.charAt(v8), 0x588C6FBD) & v5));
            if(v4 == 60) {
                v0 = v8;
                v21 = v0;
                goto label_263;
            }

            if(v4 != 62 || v0 == v13) {
                v7 = v0;
            }
            else {
                String v0_1 = v10.substring(v0 + 1, v8);
                if(v0_1.equals("lt")) {
                    v4_1 = 60;
                }
                else if(v0_1.equals("gt")) {
                    v4_1 = 62;
                }
                else {
                    goto label_48;
                }

                v7 = -1;
                goto label_89;
            label_48:
                if(!v0_1.startsWith("img=")) {
                    goto label_82;
                }

                if(arg29 != null) {
                    try {
                        v4_1 = arg29[v3];
                        goto label_57;
                    label_56:
                        v4_1 = 0;
                    label_57:
                        v5 = arg30 != null ? arg30[v3] : 0;
                        ++v3;
                        v0_2 = od.af[bw.ar(v0_1.substring(4), 0x222FAC22)];
                        v4_1 += v2;
                        v7 = v9.aj + v11 - v0_2.ad + v5;
                        v12 = arg31;
                        goto label_75;
                    label_54:
                        goto label_84;
                    }
                    catch(Exception ) {
                        goto label_54;
                    }
                }
                else {
                    goto label_56;
                }

                goto label_57;
                try {
                label_75:
                    v12.ag(v0_2, v4_1, v7, 1);
                    v2 += v0_2.aj;
                    v21 = v8;
                    v0 = -1;
                    v1 = -1;
                    goto label_263;
                }
                catch(Exception ) {
                    goto label_84;
                }

            label_82:
                v9.ah(v0_1);
            label_84:
                v21 = v8;
                v0 = -1;
                goto label_263;
            }

        label_89:
            int v6 = 0x20;
            if(v4_1 == 0xA0) {
                v4_1 = 0x20;
            }

            if(v7 == v13) {
                if(v9.ai != null && v1 != v13) {
                    v2 += v9.ai[(v1 << 8) + v4_1];
                }

                int v14 = v2;
                int v15 = v9.ae[v4_1];
                int v16 = v9.ar[v4_1];
                int v17 = arg29 != null ? arg29[v3] : 0;
                int v18 = arg30 != null ? arg30[v3] : 0;
                int v22 = v3 + 1;
                if(v4_1 == v6) {
                    v23 = v4_1;
                    v24 = v7;
                    v21 = v8;
                    if(od.at <= 0) {
                        goto label_229;
                    }

                    od.ay += od.at;
                    v14 += od.ay >> 8;
                    od.ay &= v5;
                }
                else if(od.ah >= v5) {
                    if(od.am != v13) {
                        v23 = v4_1;
                        v24 = v7;
                        this.ao(v9.ax[v4_1], v9.an[v4_1] + v14 + 1 + v17, v9.ap[v4_1] + v11 + 1 + v18, v15, v16, od.am, arg31);
                    }
                    else {
                        v23 = v4_1;
                        v24 = v7;
                    }

                    this.ao(v9.ax[v23], v9.an[v23] + v14 + v17, v9.ap[v23] + v11 + v18, v15, v16, od.ag, arg31);
                    v21 = v8;
                }
                else {
                    v23 = v4_1;
                    v24 = v7;
                    if(od.am != v13) {
                        v21 = v8;
                        this.ak(v9.ax[v23], v9.an[v23] + v14 + 1 + v17, v9.ap[v23] + v11 + 1 + v18, v15, v16, od.am, od.ah, arg31);
                    }
                    else {
                        v21 = v8;
                    }

                    this.ak(v9.ax[v23], v9.an[v23] + v14 + v17, v9.ap[v23] + v11 + v18, v15, v16, od.ag, od.ah, arg31);
                }

            label_229:
                v0 = v9.al[v23];
                if(od.av != v13) {
                    arg31.aj(v14, v11 + (((int)((((double)v9.aj)) * 0.7))), v0, od.av, -370431061);
                }

                if(od.aa != v13) {
                    arg31.aj(v14, v11 + v9.aj, v0, od.aa, 735990087);
                }

                v2 = v14 + v0;
                v3 = v22;
                v1 = v23;
            }
            else {
                v24 = v7;
                v21 = v8;
            }

            v0 = v24;
        label_263:
        }
    }

    void ax(byte[] arg21) {
        int v18;
        int v15;
        int v9;
        int v10;
        od v0 = this;
        byte[] v1 = arg21;
        int v2 = 0x100;
        v0.al = new int[v2];
        int v5 = 0;
        if(v1.length == 0x101) {
            while(v5 < v0.al.length) {
                v0.al[v5] = v1[v5] & 0xFF;
                ++v5;
            }

            v0.aj = v1[v2] & 0xFF;
        }
        else {
            int v3 = 0;
            int v4;
            for(v4 = 0; v3 < v2; ++v4) {
                v0.al[v3] = v1[v4] & 0xFF;
                ++v3;
            }

            int[] v3_1 = new int[v2];
            int[] v6 = new int[v2];
            int v7 = v4;
            v4 = 0;
            while(v4 < v2) {
                v3_1[v4] = v1[v7] & 0xFF;
                ++v4;
                ++v7;
            }

            v4 = 0;
            while(v4 < v2) {
                v6[v4] = v1[v7] & 0xFF;
                ++v4;
                ++v7;
            }

            byte[][] v4_1 = new byte[v2][];
            int v8 = v7;
            v7 = 0;
            while(v7 < v2) {
                v4_1[v7] = new byte[v3_1[v7]];
                v10 = v8;
                v8 = 0;
                v9 = 0;
                while(v8 < v4_1[v7].length) {
                    byte v9_1 = ((byte)(v9 + v1[v10]));
                    v4_1[v7][v8] = v9_1;
                    ++v8;
                    ++v10;
                }

                ++v7;
                v8 = v10;
            }

            byte[][] v7_1 = new byte[v2][];
            v9 = v8;
            v8 = 0;
            while(v8 < v2) {
                v7_1[v8] = new byte[v3_1[v8]];
                int v11 = v9;
                v9 = 0;
                v10 = 0;
                while(v9 < v7_1[v8].length) {
                    byte v10_1 = ((byte)(v10 + v1[v11]));
                    v7_1[v8][v9] = v10_1;
                    ++v9;
                    ++v11;
                }

                ++v8;
                v9 = v11;
            }

            v0.ai = new byte[0x10000];
            int v1_1;
            for(v1_1 = 0; true; ++v1_1) {
                v15 = 0x20;
                if(v1_1 >= v2) {
                    break;
                }

                if(v1_1 != v15) {
                    int v14 = 0xA0;
                    if(v1_1 == v14) {
                    }
                    else {
                        int v13 = 0;
                        while(v13 < v2) {
                            if(v13 == v15 || v13 == v14) {
                                v18 = v13;
                            }
                            else {
                                v18 = v13;
                                v0.ai[(v1_1 << 8) + v13] = ((byte)od.al(v4_1, v7_1, v6, v0.al, v3_1, v1_1, v18));
                            }

                            v13 = v18 + 1;
                            v14 = 0xA0;
                        }
                    }
                }
            }

            v0.aj = v6[v15] + v3_1[v15];
        }
    }

    void ay(String arg24, int arg25, int arg26, fa arg27) {
        int v22;
        int v21;
        fa v15;
        ef v0_2;
        int v8;
        int v3_1;
        od v9 = this;
        String v10 = arg24;
        int v11 = arg26 - v9.aj;
        int v12 = -1;
        int v2 = arg25;
        int v0 = -1;
        int v1 = -1;
        int v13;
        for(v13 = 0; v13 < arg24.length(); ++v13) {
            if(v10.charAt(v13) != 0) {
                int v4 = 0xFF;
                char v3 = ((char)(je.ax(v10.charAt(v13), 2053330533) & v4));
                if(v3 == 60) {
                    v0 = v13;
                    goto label_219;
                }

                if(v3 != 62 || v0 == v12) {
                    v8 = v0;
                }
                else {
                    String v0_1 = v10.substring(v0 + 1, v13);
                    if(v0_1.equals("lt")) {
                        v3_1 = 60;
                    }
                    else if(v0_1.equals("gt")) {
                        v3_1 = 62;
                    }
                    else {
                        goto label_44;
                    }

                    v8 = -1;
                    goto label_72;
                label_44:
                    if(v0_1.startsWith("img=")) {
                        v3_1 = 4;
                        try {
                            v0_2 = od.af[bw.ar(v0_1.substring(v3_1), 1261073075)];
                            v3_1 = v9.aj + v11 - v0_2.ad;
                            v15 = arg27;
                        }
                        catch(Exception ) {
                            goto label_68;
                        }

                        try {
                            v15.ag(v0_2, v2, v3_1, 1);
                            v2 += v0_2.aj;
                            v0 = -1;
                            v1 = -1;
                            goto label_219;
                        }
                        catch(Exception ) {
                            goto label_68;
                        }
                    }

                    v9.ah(v0_1);
                label_68:
                    v0 = -1;
                    goto label_219;
                }

            label_72:
                int v5 = 0x20;
                int v7 = v3_1 == 0xA0 ? 0x20 : v3_1;
                if(v8 == v12) {
                    if(v9.ai != null && v1 != v12) {
                        v2 += v9.ai[(v1 << 8) + v7];
                    }

                    int v16 = v2;
                    int v17 = v9.ae[v7];
                    int v18 = v9.ar[v7];
                    if(v7 == v5) {
                        v21 = v7;
                        v22 = v8;
                        if(od.at <= 0) {
                            goto label_185;
                        }

                        od.ay += od.at;
                        v16 += od.ay >> 8;
                        od.ay &= v4;
                    }
                    else if(od.ah >= v4) {
                        if(od.am != v12) {
                            v21 = v7;
                            this.ao(v9.ax[v7], v16 + v9.an[v7] + 1, v9.ap[v7] + v11 + 1, v17, v18, od.am, arg27);
                        }
                        else {
                            v21 = v7;
                        }

                        this.ao(v9.ax[v21], v16 + v9.an[v21], v11 + v9.ap[v21], v17, v18, od.ag, arg27);
                        v22 = v8;
                    }
                    else {
                        v21 = v7;
                        if(od.am != v12) {
                            v22 = v8;
                            this.ak(v9.ax[v21], v16 + v9.an[v21] + 1, v9.ap[v21] + v11 + 1, v17, v18, od.am, od.ah, arg27);
                        }
                        else {
                            v22 = v8;
                        }

                        this.ak(v9.ax[v21], v16 + v9.an[v21], v11 + v9.ap[v21], v17, v18, od.ag, od.ah, arg27);
                    }

                label_185:
                    v0 = v16;
                    v1 = v9.al[v21];
                    if(od.av != v12) {
                        arg27.aj(v0, v11 + (((int)((((double)v9.aj)) * 0.7))), v1, od.av, 0xFCB610C5);
                    }

                    if(od.aa != v12) {
                        arg27.aj(v0, v9.aj + v11 + 1, v1, od.aa, 0xBF227F);
                    }

                    v2 = v0 + v1;
                    v1 = v21;
                }
                else {
                    v22 = v8;
                }

                v0 = v22;
            }

        label_219:
        }
    }

    public void az(String arg8, int arg9, int arg10, int arg11, int arg12, int arg13, fa arg14) {
        if(arg8 == null) {
            return;
        }

        this.ag(arg11, arg12);
        od.aw.setSeed(((long)arg13));
        od.ah = (od.aw.nextInt() & 0x1F) + 0xC0;
        int[] v4 = new int[arg8.length()];
        arg11 = 0;
        arg12 = 0;
        while(arg11 < arg8.length()) {
            v4[arg11] = arg12;
            if((od.aw.nextInt() & 3) == 0) {
                ++arg12;
            }

            ++arg11;
        }

        this.aw(arg8, arg9, arg10, v4, null, arg14);
    }

    int ba(char arg3) {
        if(arg3 == 0x23884F02) {
            arg3 = '掣';
        }

        return this.al[je.ax(arg3, 0x582F9DC4) & 0xFF];
    }

    public void bb(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2, arg3, arg6);
    }

    public void bc(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2, arg3, arg6);
    }

    void bd(byte[] arg21) {
        int v18;
        int v15;
        int v9;
        int v10;
        od v0 = this;
        byte[] v1 = arg21;
        int v2 = 0x100;
        v0.al = new int[v2];
        int v5 = 0;
        if(v1.length == 0x101) {
            while(v5 < v0.al.length) {
                v0.al[v5] = v1[v5] & 0xFF;
                ++v5;
            }

            v0.aj = v1[v2] & 0xFF;
        }
        else {
            int v3 = 0;
            int v4;
            for(v4 = 0; v3 < v2; ++v4) {
                v0.al[v3] = v1[v4] & 0xFF;
                ++v3;
            }

            int[] v3_1 = new int[v2];
            int[] v6 = new int[v2];
            int v7 = v4;
            v4 = 0;
            while(v4 < v2) {
                v3_1[v4] = v1[v7] & 0xFF;
                ++v4;
                ++v7;
            }

            v4 = 0;
            while(v4 < v2) {
                v6[v4] = v1[v7] & 0xFF;
                ++v4;
                ++v7;
            }

            byte[][] v4_1 = new byte[v2][];
            int v8 = v7;
            v7 = 0;
            while(v7 < v2) {
                v4_1[v7] = new byte[v3_1[v7]];
                v10 = v8;
                v8 = 0;
                v9 = 0;
                while(v8 < v4_1[v7].length) {
                    byte v9_1 = ((byte)(v9 + v1[v10]));
                    v4_1[v7][v8] = v9_1;
                    ++v8;
                    ++v10;
                }

                ++v7;
                v8 = v10;
            }

            byte[][] v7_1 = new byte[v2][];
            v9 = v8;
            v8 = 0;
            while(v8 < v2) {
                v7_1[v8] = new byte[v3_1[v8]];
                int v11 = v9;
                v9 = 0;
                v10 = 0;
                while(v9 < v7_1[v8].length) {
                    byte v10_1 = ((byte)(v10_1 + v1[v11]));
                    v7_1[v8][v9] = v10_1;
                    ++v9;
                    ++v11;
                }

                ++v8;
                v9 = v11;
            }

            v0.ai = new byte[0x10000];
            int v1_1;
            for(v1_1 = 0; true; ++v1_1) {
                v15 = 0x20;
                if(v1_1 >= v2) {
                    break;
                }

                if(v1_1 != v15) {
                    int v14 = 0xA0;
                    if(v1_1 == v14) {
                    }
                    else {
                        int v13 = 0;
                        while(v13 < v2) {
                            if(v13 == v15 || v13 == v14) {
                                v18 = v13;
                            }
                            else {
                                v18 = v13;
                                v0.ai[(v1_1 << 8) + v13] = ((byte)od.al(v4_1, v7_1, v6, v0.al, v3_1, v1_1, v18));
                            }

                            v13 = v18 + 1;
                            v14 = 0xA0;
                        }
                    }
                }
            }

            v0.aj = v6[v15] + v3_1[v15];
        }
    }

    public void be(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2 - this.ar(arg1), arg3, arg6);
    }

    int bf(char arg3) {
        if(arg3 == 0xA0) {
            arg3 = ' ';
        }

        return this.al[je.ax(arg3, 0x74859569) & 0xFF];
    }

    public int bg(String arg3, int arg4) {
        return this.an(arg3, new int[]{arg4}, od.ao);
    }

    public static String bh(String arg7) {
        String v3_2;
        int v0 = arg7.length();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            int v4 = 62;
            int v5 = 60;
            if(v2 >= v0) {
                break;
            }

            int v6 = arg7.charAt(v2);
            if(v6 == v5 || v6 == v4) {
                v3 += 3;
            }

            ++v2;
        }

        StringBuilder v2_1 = new StringBuilder(v3 + v0);
        while(v1 < v0) {
            char v3_1 = arg7.charAt(v1);
            if(v3_1 == v5) {
                v3_2 = "<lt>";
                goto label_20;
            }
            else if(v3_1 == v4) {
                v3_2 = "<gt>";
            label_20:
                v2_1.append(v3_2);
            }
            else {
                v2_1.append(v3_1);
            }

            ++v1;
        }

        return v2_1.toString();
    }

    public int bi(String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, fa arg14) {
        if(arg4 == null) {
            return 0;
        }

        this.ag(arg9, arg10);
        if(arg13 == 0) {
            arg13 = this.aj;
        }

        int[] v10 = new int[]{arg7};
        if(arg8 < this.ad + this.aq + arg13 && arg8 < arg13 + arg13) {
            v10 = null;
        }

        int v4 = this.an(arg4, v10, od.ao);
        arg10 = 2;
        if(1 == 0) {
            arg6 += this.ad;
        }
        else if(1 == 1) {
            arg6 = arg6 + this.ad + (arg8 - this.ad - this.aq - (v4 - 1) * arg13) / arg10;
        }
        else if(1 == arg10) {
            arg6 = arg6 + arg8 - this.aq - (v4 - 1) * arg13;
        }
        else {
            arg8 = (arg8 - this.ad - this.aq - (v4 - 1) * arg13) / (v4 + 1);
            if(arg8 < 0) {
                arg8 = 0;
            }

            arg6 = arg6 + this.ad + arg8;
            arg13 += arg8;
        }

        arg8 = arg6;
        for(arg6 = 0; arg6 < v4; ++arg6) {
            if(arg11 == 0) {
                this.ay(od.ao[arg6], arg5, arg8, arg14);
            }
            else if(arg11 == 1) {
                this.ay(od.ao[arg6], (arg7 - this.ar(od.ao[arg6])) / arg10 + arg5, arg8, arg14);
            }
            else if(arg11 == arg10) {
                this.ay(od.ao[arg6], arg5 + arg7 - this.ar(od.ao[arg6]), arg8, arg14);
            }
            else if(arg6 == v4 - 1) {
                this.ay(od.ao[arg6], arg5, arg8, arg14);
            }
            else {
                this.at(od.ao[arg6], arg7);
                this.ay(od.ao[arg6], arg5, arg8, arg14);
                od.at = 0;
            }

            arg8 += arg13;
        }

        return v4;
    }

    public void bj(String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, fa arg7) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        od.ah = arg6;
        this.ay(arg1, arg2, arg3, arg7);
    }

    public void bk(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2, arg3, arg6);
    }

    public void bl(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2 - this.ar(arg1), arg3, arg6);
    }

    public void bm(String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, fa arg7) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        od.ah = arg6;
        this.ay(arg1, arg2, arg3, arg7);
    }

    int bn(char arg3) {
        if(arg3 == 0xAF1D6B7F) {
            arg3 = ' ';
        }

        return this.al[je.ax(arg3, 0x50C2AF9C) & 0xFF];
    }

    public int bo(String arg18, int[] arg19, String[] arg20) {
        int v2_1;
        int v1_1;
        int v6_1;
        char v6;
        od v0 = this;
        String v1 = arg18;
        int[] v2 = arg19;
        if(v1 == null) {
            return 0;
        }

        StringBuilder v4 = new StringBuilder(100);
        int v5 = arg18.length();
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = -1;
        int v11 = 0;
        int v12 = 0;
        int v13 = -1;
        int v14 = 0;
        int v15 = 0;
        while(v7 < v5) {
            char v3 = v1.charAt(v7);
            if(v3 == 60) {
                v10 = v7;
            }
            else {
                if(v3 != 62 || v10 == -1) {
                    v6_1 = -1;
                }
                else {
                    String v3_1 = v1.substring(v10 + 1, v7);
                    v4.append('<');
                    v4.append(v3_1);
                    v4.append('>');
                    if(v3_1.equals("br")) {
                        arg20[v9] = v4.toString().substring(v8, v4.length());
                        ++v9;
                        v8 = v4.length();
                        v11 = 0;
                        v12 = 0;
                        v13 = -1;
                    }
                    else if(v3_1.equals("lt")) {
                        v6 = '<';
                        v11 += v0.ae(v6);
                        if(v0.ai != null && v12 != -1) {
                            v11 += v0.ai[(v12 << 8) + v6];
                        }

                        v11 = v11;
                        v12 = 60;
                    }
                    else {
                        if(v3_1.equals("gt")) {
                            v6 = '>';
                            v11 += v0.ae(v6);
                            if(v0.ai != null && v12 != -1) {
                                v11 += v0.ai[(v12 << 8) + v6];
                            }

                            v11 = v11;
                            v12 = 62;
                            goto label_102;
                        }

                        if(!v3_1.startsWith("img=")) {
                            goto label_102;
                        }

                        v6_1 = 4;
                        try {
                            v11 = od.af[bw.ar(v3_1.substring(v6_1), 1009275686)].aj + v11;
                            v12 = 0;
                            goto label_102;
                        }
                        catch(Exception ) {
                        label_102:
                            v3 = '\u0000';
                            v6_1 = -1;
                            v10 = -1;
                            goto label_107;
                        }
                    }

                    goto label_102;
                }

            label_107:
                if(v10 != v6_1) {
                    goto label_158;
                }

                if(v3 != 0) {
                    v4.append(v3);
                    v11 += v0.ae(v3);
                    if(v0.ai != null && v12 != v6_1) {
                        v11 += v0.ai[(v12 << 8) + v3];
                    }

                    v12 = v3;
                }

                if(v3 == 0x20) {
                    v13 = v4.length();
                    v15 = v11;
                    v14 = 1;
                }

                if(v2 != null) {
                    v1_1 = v9 < v2.length ? v9 : v2.length - 1;
                    if(v11 <= v2[v1_1]) {
                        goto label_147;
                    }

                    if(v13 < 0) {
                        goto label_147;
                    }

                    arg20[v9] = v4.toString().substring(v8, v13 - v14);
                    ++v9;
                    v11 -= v15;
                    v1_1 = -1;
                    v12 = 0;
                }
                else {
                label_147:
                    v1_1 = v13;
                    v13 = v8;
                }

                if(v3 == 45) {
                    v1_1 = v4.length();
                    v15 = v11;
                    v8 = v13;
                    v14 = 0;
                }
                else {
                    v8 = v13;
                }

                v13 = v1_1;
            }

        label_158:
            ++v7;
            v1 = arg18;
        }

        v1 = v4.toString();
        if(v1.length() > v8) {
            v2_1 = v9 + 1;
            arg20[v9] = v1.substring(v8, v1.length());
        }
        else {
            v2_1 = v9;
        }

        return v2_1;
    }

    public int bp(String arg9) {
        int v0 = 0;
        if(arg9 == null) {
            return 0;
        }

        int v1 = -1;
        int v2 = 0;
        int v3 = -1;
        int v4 = -1;
        while(v0 < arg9.length()) {
            char v5 = arg9.charAt(v0);
            if(v5 == 60) {
                v3 = v0;
            }
            else {
                if(v5 == 62 && v3 != v1) {
                    String v3_1 = arg9.substring(v3 + 1, v0);
                    if(v3_1.equals("lt")) {
                        v3 = -1;
                        v5 = '<';
                    }
                    else if(v3_1.equals("gt")) {
                        v3 = -1;
                        v5 = '>';
                    }
                    else if(v3_1.startsWith("img=")) {
                        int v5_1 = 4;
                        try {
                            v2 += od.af[bw.ar(v3_1.substring(v5_1), 0x74F151F3)].aj;
                            v3 = -1;
                            v4 = -1;
                        }
                        catch(Exception ) {
                        label_45:
                            v3 = -1;
                        }

                        goto label_67;
                    }
                    else {
                        goto label_45;
                    }
                }

                if(v5 == 0xA0) {
                    v5 = ' ';
                }

                if(v3 != v1) {
                    goto label_67;
                }

                v2 += this.al[((char)(je.ax(v5, 0x61E87AED) & 0xFF))];
                if(this.ai != null && v4 != v1) {
                    v2 += this.ai[(v4 << 8) + v5];
                }

                v4 = v5;
            }

        label_67:
            ++v0;
        }

        return v2;
    }

    public int bq(String arg3, int arg4) {
        return this.an(arg3, new int[]{arg4}, od.ao);
    }

    public void br(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2 - this.ar(arg1) / 2, arg3, arg6);
    }

    public void bs(String arg1, int arg2, int arg3, int arg4, int arg5, fa arg6) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        this.ay(arg1, arg2 - this.ar(arg1), arg3, arg6);
    }

    public int bt(String arg3, int arg4) {
        int[] v0 = new int[1];
        int v1 = 0;
        v0[0] = arg4;
        int v3 = this.an(arg3, v0, od.ao);
        arg4 = 0;
        while(v1 < v3) {
            int v0_1 = this.ar(od.ao[v1]);
            if(v0_1 > arg4) {
                arg4 = v0_1;
            }

            ++v1;
        }

        return arg4;
    }

    public void bu(String arg1, int arg2, int arg3, int arg4, int arg5, int arg6, fa arg7) {
        if(arg1 == null) {
            return;
        }

        this.ag(arg4, arg5);
        od.ah = arg6;
        this.ay(arg1, arg2, arg3, arg7);
    }

    public int bv(String arg3, int arg4) {
        return this.an(arg3, new int[]{arg4}, od.ao);
    }

    public int bw(String arg18, int[] arg19, String[] arg20) {
        int v2_1;
        int v1_1;
        int v6;
        od v0 = this;
        String v1 = arg18;
        int[] v2 = arg19;
        if(v1 == null) {
            return 0;
        }

        StringBuilder v4 = new StringBuilder(100);
        int v5 = arg18.length();
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = -1;
        int v11 = 0;
        int v12 = 0;
        int v13 = -1;
        int v14 = 0;
        int v15 = 0;
        while(v7 < v5) {
            char v3 = v1.charAt(v7);
            if(v3 == 60) {
                v10 = v7;
            }
            else {
                if(v3 != 62 || v10 == -1) {
                    v6 = -1;
                }
                else {
                    String v3_1 = v1.substring(v10 + 1, v7);
                    v4.append('<');
                    v4.append(v3_1);
                    v4.append('鿚');
                    if(v3_1.equals("br")) {
                        arg20[v9] = v4.toString().substring(v8, v4.length());
                        ++v9;
                        v8 = v4.length();
                        v11 = 0;
                        v12 = 0;
                        v13 = -1;
                    }
                    else if(v3_1.equals("lt")) {
                        v11 += v0.ae('剀');
                        if(v0.ai != null && v12 != -1) {
                            v11 += v0.ai[(v12 << 8) + 1520622641];
                        }

                        v11 = v11;
                        v12 = 60;
                    }
                    else {
                        if(v3_1.equals("gt")) {
                            v11 += v0.ae('>');
                            if(v0.ai != null && v12 != -1) {
                                v11 += v0.ai[(v12 << 8) + 178673390];
                            }

                            v11 = v11;
                            v12 = 62;
                            goto label_104;
                        }

                        if(!v3_1.startsWith("img=")) {
                            goto label_104;
                        }

                        v6 = 4;
                        try {
                            v11 = od.af[bw.ar(v3_1.substring(v6), 0x32EBE1E2)].aj + v11;
                            v12 = 0;
                            goto label_104;
                        }
                        catch(Exception ) {
                        label_104:
                            v3 = '\u0000';
                            v6 = -1;
                            v10 = -1;
                            goto label_109;
                        }
                    }

                    goto label_104;
                }

            label_109:
                if(v10 != v6) {
                    goto label_160;
                }

                if(v3 != 0) {
                    v4.append(v3);
                    v11 += v0.ae(v3);
                    if(v0.ai != null && v12 != v6) {
                        v11 += v0.ai[(v12 << 8) + v3];
                    }

                    v12 = v3;
                }

                if(v3 == 0x6D069456) {
                    v13 = v4.length();
                    v15 = v11;
                    v14 = 1;
                }

                if(v2 != null) {
                    v1_1 = v9 < v2.length ? v9 : v2.length - 1;
                    if(v11 <= v2[v1_1]) {
                        goto label_149;
                    }

                    if(v13 < 0) {
                        goto label_149;
                    }

                    arg20[v9] = v4.toString().substring(v8, v13 - v14);
                    ++v9;
                    v11 -= v15;
                    v1_1 = -1;
                    v12 = 0;
                }
                else {
                label_149:
                    v1_1 = v13;
                    v13 = v8;
                }

                if(v3 == 45) {
                    v1_1 = v4.length();
                    v15 = v11;
                    v8 = v13;
                    v14 = 0;
                }
                else {
                    v8 = v13;
                }

                v13 = v1_1;
            }

        label_160:
            ++v7;
            v1 = arg18;
        }

        v1 = v4.toString();
        if(v1.length() > v8) {
            v2_1 = v9 + 1;
            arg20[v9] = v1.substring(v8, v1.length());
        }
        else {
            v2_1 = v9;
        }

        return v2_1;
    }

    public int bx(String arg3, int arg4) {
        return this.an(arg3, new int[]{arg4}, od.ao);
    }

    public int by(String arg18, int[] arg19, String[] arg20) {
        int v2_1;
        int v1_1;
        int v6_1;
        od v0 = this;
        String v1 = arg18;
        int[] v2 = arg19;
        if(v1 == null) {
            return 0;
        }

        StringBuilder v4 = new StringBuilder(100);
        int v5 = arg18.length();
        int v7 = 0;
        int v8 = 0;
        int v9 = 0;
        int v10 = -1;
        int v11 = 0;
        int v12 = 0;
        int v13 = -1;
        int v14 = 0;
        int v15 = 0;
        while(v7 < v5) {
            char v3 = v1.charAt(v7);
            if(v3 == 0xF90A0FBF) {
                v10 = v7;
            }
            else {
                if(v3 != 0x29B68DE9 || v10 == -1) {
                    v6_1 = -1;
                }
                else {
                    String v3_1 = v1.substring(v10 + 1, v7);
                    char v6 = '<';
                    v4.append(v6);
                    v4.append(v3_1);
                    v4.append('>');
                    if(v3_1.equals("br")) {
                        arg20[v9] = v4.toString().substring(v8, v4.length());
                        ++v9;
                        v8 = v4.length();
                        v11 = 0;
                        v12 = 0;
                        v13 = -1;
                    }
                    else if(v3_1.equals("lt")) {
                        v11 += v0.ae(v6);
                        if(v0.ai != null && v12 != -1) {
                            v11 += v0.ai[(v12 << 8) + v6];
                        }

                        v11 = v11;
                        v12 = 500345818;
                    }
                    else {
                        if(v3_1.equals("gt")) {
                            v11 += v0.ae('侉');
                            if(v0.ai != null && v12 != -1) {
                                v11 += v0.ai[(v12 << 8) + 62];
                            }

                            v11 = v11;
                            v12 = 62;
                            goto label_105;
                        }

                        if(!v3_1.startsWith("img=")) {
                            goto label_105;
                        }

                        v6_1 = 4;
                        try {
                            v11 = od.af[bw.ar(v3_1.substring(v6_1), 0x67876CF5)].aj + v11;
                            v12 = 0;
                            goto label_105;
                        }
                        catch(Exception ) {
                        label_105:
                            v3 = '\u0000';
                            v6_1 = -1;
                            v10 = -1;
                            goto label_110;
                        }
                    }

                    goto label_105;
                }

            label_110:
                if(v10 != v6_1) {
                    goto label_161;
                }

                if(v3 != 0) {
                    v4.append(v3);
                    v11 += v0.ae(v3);
                    if(v0.ai != null && v12 != v6_1) {
                        v11 += v0.ai[(v12 << 8) + v3];
                    }

                    v12 = v3;
                }

                if(v3 == 0xE0FCB4CE) {
                    v13 = v4.length();
                    v15 = v11;
                    v14 = 1;
                }

                if(v2 != null) {
                    v1_1 = v9 < v2.length ? v9 : v2.length - 1;
                    if(v11 <= v2[v1_1]) {
                        goto label_150;
                    }

                    if(v13 < 0) {
                        goto label_150;
                    }

                    arg20[v9] = v4.toString().substring(v8, v13 - v14);
                    ++v9;
                    v11 -= v15;
                    v1_1 = -1;
                    v12 = 0;
                }
                else {
                label_150:
                    v1_1 = v13;
                    v13 = v8;
                }

                if(v3 == 0xCCE6B8C1) {
                    v1_1 = v4.length();
                    v15 = v11;
                    v8 = v13;
                    v14 = 0;
                }
                else {
                    v8 = v13;
                }

                v13 = v1_1;
            }

        label_161:
            ++v7;
            v1 = arg18;
        }

        v1 = v4.toString();
        if(v1.length() > v8) {
            v2_1 = v9 + 1;
            arg20[v9] = v1.substring(v8, v1.length());
        }
        else {
            v2_1 = v9;
        }

        return v2_1;
    }

    public static String bz(String arg7) {
        int v0 = arg7.length();
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            int v4 = 62;
            int v5 = 60;
            if(v2 >= v0) {
                break;
            }

            int v6 = arg7.charAt(v2);
            if(v6 == v5 || v6 == v4) {
                v3 += 3;
            }

            ++v2;
        }

        StringBuilder v2_1 = new StringBuilder(v3 + v0);
        while(v1 < v0) {
            char v3_1 = arg7.charAt(v1);
            if(v3_1 == v5) {
                v2_1.append("<lt>");
            }
            else if(v3_1 == v4) {
                v2_1.append("<gt>");
            }
            else {
                v2_1.append(v3_1);
            }

            ++v1;
        }

        return v2_1.toString();
    }

    public int ca(String arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, fa arg14) {
        int v1;
        String v12;
        if(arg4 == null) {
            return 0;
        }

        this.ag(arg9, arg10);
        if(arg13 == 0) {
            arg13 = this.aj;
        }

        int[] v10 = new int[]{arg7};
        if(arg8 < this.ad + this.aq + arg13 && arg8 < arg13 + arg13) {
            v10 = null;
        }

        int v4 = this.an(arg4, v10, od.ao);
        arg10 = 2;
        if(1 == 0) {
            arg6 += this.ad;
        }
        else if(1 == 1) {
            arg6 = arg6 + this.ad + (arg8 - this.ad - this.aq - (v4 - 1) * arg13) / arg10;
        }
        else if(1 == arg10) {
            arg6 = arg6 + arg8 - this.aq - (v4 - 1) * arg13;
        }
        else {
            arg8 = (arg8 - this.ad - this.aq - (v4 - 1) * arg13) / (v4 + 1);
            if(arg8 < 0) {
                arg8 = 0;
            }

            arg6 = arg6 + this.ad + arg8;
            arg13 += arg8;
        }

        arg8 = arg6;
        for(arg6 = 0; arg6 < v4; ++arg6) {
            if(arg11 == 0) {
                this.ay(od.ao[arg6], arg5, arg8, arg14);
            }
            else {
                if(arg11 == 1) {
                    v12 = od.ao[arg6];
                    v1 = (arg7 - this.ar(od.ao[arg6])) / arg10 + arg5;
                }
                else if(arg11 == arg10) {
                    v12 = od.ao[arg6];
                    v1 = arg5 + arg7 - this.ar(od.ao[arg6]);
                }
                else {
                    goto label_92;
                }

                this.ay(v12, v1, arg8, arg14);
                goto label_105;
            label_92:
                if(arg6 == v4 - 1) {
                    this.ay(od.ao[arg6], arg5, arg8, arg14);
                    goto label_105;
                }

                this.at(od.ao[arg6], arg7);
                this.ay(od.ao[arg6], arg5, arg8, arg14);
                od.at = 0;
            }

        label_105:
            arg8 += arg13;
        }

        return v4;
    }

    public void cb(String arg15, int arg16, int arg17, int arg18, int arg19, int arg20, fa arg21) {
        if(arg15 == null) {
            return;
        }

        this.ag(arg18, arg19);
        int[] v4 = new int[arg15.length()];
        int[] v5 = new int[arg15.length()];
        int v0;
        for(v0 = 0; v0 < arg15.length(); ++v0) {
            double v2 = ((double)v0);
            double v12 = (((double)arg20)) / 5;
            v4[v0] = ((int)(Math.sin(v2 / 5 + v12) * 5));
            v5[v0] = ((int)(Math.sin(v2 / 3 + v12) * 5));
        }

        this.aw(arg15, arg16 - this.ar(arg15) / 2, arg17, v4, v5, arg21);
    }

    public void cc(String arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        if(arg15 == null) {
            return;
        }

        this.ag(arg18, arg19);
        double v2 = 7 - (((double)arg21)) / 8;
        double v4 = 0;
        if(v2 < v4) {
            v2 = v4;
        }

        int[] v5 = new int[arg15.length()];
        int v0;
        for(v0 = 0; v0 < arg15.length(); ++v0) {
            v5[v0] = ((int)(Math.sin((((double)v0)) / 1.5 + (((double)arg20)) / 1) * v2));
        }

        this.aw(arg15, arg16 - this.ar(arg15) / 2, arg17, null, v5, arg22);
    }

    public void cd(String arg9, int arg10, int arg11, int arg12, int arg13, int arg14, fa arg15) {
        if(arg9 == null) {
            return;
        }

        this.ag(arg12, arg13);
        int[] v5 = new int[arg9.length()];
        for(arg12 = 0; arg12 < arg9.length(); ++arg12) {
            v5[arg12] = ((int)(Math.sin((((double)arg12)) / 2 + (((double)arg14)) / 5) * 5));
        }

        this.aw(arg9, arg10 - this.ar(arg9) / 2, arg11, null, v5, arg15);
    }

    void ce(int arg2, int arg3) {
        od.av = -1;
        od.aa = -1;
        od.au = arg3;
        od.am = arg3;
        od.az = arg2;
        od.ag = arg2;
        od.ah = 0xFF;
        od.at = 0;
        od.ay = 0;
    }

    public void cf(String arg9, int arg10, int arg11, int arg12, int arg13, int arg14, fa arg15) {
        if(arg9 == null) {
            return;
        }

        this.ag(arg12, arg13);
        int[] v5 = new int[arg9.length()];
        for(arg12 = 0; arg12 < arg9.length(); ++arg12) {
            v5[arg12] = ((int)(Math.sin((((double)arg12)) / 2 + (((double)arg14)) / 5) * 5));
        }

        this.aw(arg9, arg10 - this.ar(arg9) / 2, arg11, null, v5, arg15);
    }

    void cg(int[] arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v2;
        int v0 = -(arg10 >> 2);
        arg10 = -(arg10 & 3);
        arg7 |= 0x289D840B;
        arg11 = -arg11;
        while(arg11 < 0) {
            int v1 = arg9;
            arg9 = arg8;
            arg8 = v0;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg9 = v1 + 1;
                    arg5[v1] = arg7;
                }
                else {
                    arg9 = v1 + 1;
                }

                v1 = v2 + 1;
                if(arg6[v2] != 0) {
                    v2 = arg9 + 1;
                    arg5[arg9] = arg7;
                }
                else {
                    v2 = arg9 + 1;
                }

                arg9 = v1 + 1;
                if(arg6[v1] != 0) {
                    v1 = v2 + 1;
                    arg5[v2] = arg7;
                }
                else {
                    v1 = v2 + 1;
                }

                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg5[v1] = arg7;
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            arg8 = arg10;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg5[v1] = arg7;
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            ++arg11;
            int v3 = arg9 + arg13;
            arg9 = v1 + arg12;
            arg8 = v3;
        }
    }

    void ch(int arg2, int arg3) {
        od.av = -1;
        od.aa = -1;
        od.au = arg3;
        od.am = arg3;
        od.az = arg2;
        od.ag = arg2;
        od.ah = -420925166;
        od.at = 0;
        od.ay = 0;
    }

    public void ci(String arg8, int arg9, int arg10, int arg11, int arg12, int arg13, fa arg14) {
        if(arg8 == null) {
            return;
        }

        this.ag(arg11, arg12);
        od.aw.setSeed(((long)arg13));
        od.ah = (od.aw.nextInt() & 0x1F) + 0xC0;
        int[] v4 = new int[arg8.length()];
        arg11 = 0;
        arg12 = 0;
        while(arg11 < arg8.length()) {
            v4[arg11] = arg12;
            if((od.aw.nextInt() & 3) == 0) {
                ++arg12;
            }

            ++arg11;
        }

        this.aw(arg8, arg9, arg10, v4, null, arg14);
    }

    public void cj(String arg9, int arg10, int arg11, int arg12, int arg13, int arg14, fa arg15) {
        if(arg9 == null) {
            return;
        }

        this.ag(arg12, arg13);
        int[] v5 = new int[arg9.length()];
        for(arg12 = 0; arg12 < arg9.length(); ++arg12) {
            v5[arg12] = ((int)(Math.sin((((double)arg12)) / 2 + (((double)arg14)) / 5) * 5));
        }

        this.aw(arg9, arg10 - this.ar(arg9) / 2, arg11, null, v5, arg15);
    }

    void ck(String arg7, int arg8) {
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v1 < arg7.length()) {
            int v4 = arg7.charAt(v1);
            if(v4 == 60) {
                v3 = 1;
            }
            else if(v4 == 62) {
                v3 = 0;
            }
            else if(v3 == 0 && v4 == 0x20) {
                ++v2;
            }

            ++v1;
        }

        if(v2 > 0) {
            od.at = (arg8 - this.ar(arg7) << 8) / v2;
        }
    }

    void cl(String arg7, int arg8) {
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        while(v1 < arg7.length()) {
            int v4 = arg7.charAt(v1);
            if(v4 == 60) {
                v3 = 1;
            }
            else if(v4 == 62) {
                v3 = 0;
            }
            else if(v3 == 0 && v4 == 0x20) {
                ++v2;
            }

            ++v1;
        }

        if(v2 > 0) {
            od.at = (arg8 - this.ar(arg7) << 8) / v2;
        }
    }

    void cm(String arg24, int arg25, int arg26, fa arg27) {
        int v22;
        int v21;
        fa v15;
        ef v0_2;
        int v8;
        int v3_1;
        od v9 = this;
        String v10 = arg24;
        int v11 = arg26 - v9.aj;
        int v12 = -1;
        int v2 = arg25;
        int v0 = -1;
        int v1 = -1;
        int v13;
        for(v13 = 0; v13 < arg24.length(); ++v13) {
            if(v10.charAt(v13) != 0) {
                char v3 = ((char)(je.ax(v10.charAt(v13), 0x5D3E61D5) & 0xFF));
                if(v3 == 0x7F90FF63) {
                    v0 = v13;
                    goto label_220;
                }

                if(v3 != 62 || v0 == v12) {
                    v8 = v0;
                }
                else {
                    String v0_1 = v10.substring(v0 + 1, v13);
                    if(v0_1.equals("lt")) {
                        v3_1 = 60;
                    }
                    else if(v0_1.equals("gt")) {
                        v3_1 = 62;
                    }
                    else {
                        goto label_43;
                    }

                    v8 = -1;
                    goto label_71;
                label_43:
                    if(v0_1.startsWith("img=")) {
                        v3_1 = 4;
                        try {
                            v0_2 = od.af[bw.ar(v0_1.substring(v3_1), 0x5139A266)];
                            v3_1 = v9.aj + v11 - v0_2.ad;
                            v15 = arg27;
                        }
                        catch(Exception ) {
                            goto label_67;
                        }

                        try {
                            v15.ag(v0_2, v2, v3_1, 1);
                            v2 += v0_2.aj;
                            v0 = -1;
                            v1 = -1;
                            goto label_220;
                        }
                        catch(Exception ) {
                            goto label_67;
                        }
                    }

                    v9.ah(v0_1);
                label_67:
                    v0 = -1;
                    goto label_220;
                }

            label_71:
                int v7 = v3_1 == 0xC6EA3BCA ? 0x7C691808 : v3_1;
                if(v8 == v12) {
                    if(v9.ai != null && v1 != v12) {
                        v2 += v9.ai[(v1 << 8) + v7];
                    }

                    int v16 = v2;
                    int v17 = v9.ae[v7];
                    int v18 = v9.ar[v7];
                    if(v7 == 0x20) {
                        v21 = v7;
                        v22 = v8;
                        if(od.at <= 0) {
                            goto label_186;
                        }

                        od.ay += od.at;
                        v16 += od.ay >> 8;
                        od.ay &= 0xFF;
                    }
                    else if(od.ah >= 0x693379A9) {
                        if(od.am != v12) {
                            v21 = v7;
                            this.ao(v9.ax[v7], v16 + v9.an[v7] + 1, v9.ap[v7] + v11 + 1, v17, v18, od.am, arg27);
                        }
                        else {
                            v21 = v7;
                        }

                        this.ao(v9.ax[v21], v16 + v9.an[v21], v11 + v9.ap[v21], v17, v18, od.ag, arg27);
                        v22 = v8;
                    }
                    else {
                        v21 = v7;
                        if(od.am != v12) {
                            v22 = v8;
                            this.ak(v9.ax[v21], v16 + v9.an[v21] + 1, v9.ap[v21] + v11 + 1, v17, v18, od.am, od.ah, arg27);
                        }
                        else {
                            v22 = v8;
                        }

                        this.ak(v9.ax[v21], v16 + v9.an[v21], v11 + v9.ap[v21], v17, v18, od.ag, od.ah, arg27);
                    }

                label_186:
                    v0 = v16;
                    v1 = v9.al[v21];
                    if(od.av != v12) {
                        arg27.aj(v0, v11 + (((int)((((double)v9.aj)) * 0.7))), v1, od.av, 6020404);
                    }

                    if(od.aa != v12) {
                        arg27.aj(v0, v9.aj + v11 + 1, v1, od.aa, 1250343891);
                    }

                    v2 = v0 + v1;
                    v1 = v21;
                }
                else {
                    v22 = v8;
                }

                v0 = v22;
            }

        label_220:
        }
    }

    void cn(String arg6) {
        try {
            int v1 = 4;
            byte v2 = 18;
            int v3 = 16;
            if(arg6.startsWith("col=")) {
                od.ag = ao.an(arg6.substring(v1), v3, v2);
            }
            else if(arg6.equals("/col")) {
                od.ag = od.az;
            }
            else if(arg6.startsWith("str=")) {
                od.av = ao.an(arg6.substring(v1), v3, v2);
            }
            else if(arg6.equals("str")) {
                od.av = 0x800000;
            }
            else {
                v1 = -1;
                if(arg6.equals("/str")) {
                    od.av = v1;
                }
                else if(arg6.startsWith("u=")) {
                    od.aa = ao.an(arg6.substring(2), v3, v2);
                }
                else if(arg6.equals("u")) {
                    od.aa = 0;
                }
                else if(arg6.equals("/u")) {
                    od.aa = v1;
                }
                else if(arg6.startsWith("shad=")) {
                    od.am = ao.an(arg6.substring(5), v3, v2);
                }
                else if(arg6.equals("shad")) {
                    od.am = 0;
                }
                else if(arg6.equals("/shad")) {
                    od.am = od.au;
                }
                else if(arg6.equals("br")) {
                    this.ag(od.az, od.au);
                }
            }

            return;
        }
        catch(Exception ) {
            return;
        }
    }

    void co(int[] arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v2;
        int v0 = -(arg10 >> 2);
        arg10 = -(arg10 & 3);
        arg7 |= -226909355;
        arg11 = -arg11;
        while(arg11 < 0) {
            int v1 = arg9;
            arg9 = arg8;
            arg8 = v0;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg9 = v1 + 1;
                    arg5[v1] = arg7;
                }
                else {
                    arg9 = v1 + 1;
                }

                v1 = v2 + 1;
                if(arg6[v2] != 0) {
                    v2 = arg9 + 1;
                    arg5[arg9] = arg7;
                }
                else {
                    v2 = arg9 + 1;
                }

                arg9 = v1 + 1;
                if(arg6[v1] != 0) {
                    v1 = v2 + 1;
                    arg5[v2] = arg7;
                }
                else {
                    v1 = v2 + 1;
                }

                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg5[v1] = arg7;
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            arg8 = arg10;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg5[v1] = arg7;
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            ++arg11;
            int v3 = arg9 + arg13;
            arg9 = v1 + arg12;
            arg8 = v3;
        }
    }

    public void cp(String arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        if(arg15 == null) {
            return;
        }

        this.ag(arg18, arg19);
        double v2 = 7 - (((double)arg21)) / 8;
        double v4 = 0;
        if(v2 < v4) {
            v2 = v4;
        }

        int[] v5 = new int[arg15.length()];
        int v0;
        for(v0 = 0; v0 < arg15.length(); ++v0) {
            v5[v0] = ((int)(Math.sin((((double)v0)) / 1.5 + (((double)arg20)) / 1) * v2));
        }

        this.aw(arg15, arg16 - this.ar(arg15) / 2, arg17, null, v5, arg22);
    }

    void cq(byte[] arg22, int arg23, int arg24, int arg25, int arg26, int arg27, fa arg28) {
        int v2;
        int v15;
        int v14;
        int v9;
        int v5;
        int v0 = arg23;
        int v1 = arg24;
        fa v3 = arg28;
        int v4 = v3.al * -107049639 * v1 + v0;
        int v6 = v3.al * -107049639 - arg25;
        int v7 = 2002832733;
        int v8 = 0;
        if(v1 < v3.ar * v7) {
            v5 = v3.ar * v7 - v1;
            v1 = arg26 - v5;
            v7 *= v3.ar;
            v9 = v5 * arg25;
            v5 = v4 + v5 * (v3.al * -966345701);
            v4 = v9;
            v9 = v1;
            v1 = v7;
        }
        else {
            v9 = arg26;
            v5 = v4;
            v4 = 0;
        }

        v1 += v9;
        if(v1 > v3.an * 0xABF7C73C) {
            v9 -= v1 - v3.an * 0x92840E93;
        }

        int v17 = v9;
        v7 = 0xE4D30573;
        if(v0 < v3.ap * v7) {
            v1 = v3.ap * v7 - v0;
            v8 = v1;
            v6 += v1;
            v14 = v4 + v1;
            v15 = v5 + v1;
            v2 = arg25 - v1;
            v0 = v3.ap * 0xE35F962;
        }
        else {
            v2 = arg25;
            v14 = v4;
            v15 = v5;
        }

        v0 += v2;
        if(v0 > v3.aj * 1534561140) {
            v0 -= v3.aj * 0x56AC17CD;
            v2 -= v0;
            v8 += v0;
            v6 += v0;
        }

        int v16 = v2;
        int v18 = v6;
        int v19 = v8;
        if(v16 > 0) {
            if(v17 <= 0) {
            }
            else {
                this.as(v3.ax, arg22, arg27, v14, v15, v16, v17, v18, v19);
                return;
            }
        }
    }

    public void cr(String arg8, int arg9, int arg10, int arg11, int arg12, int arg13, fa arg14) {
        if(arg8 == null) {
            return;
        }

        this.ag(arg11, arg12);
        od.aw.setSeed(((long)arg13));
        od.ah = (od.aw.nextInt() & 0x1F) + 0xC0;
        int[] v4 = new int[arg8.length()];
        arg11 = 0;
        arg12 = 0;
        while(arg11 < arg8.length()) {
            v4[arg11] = arg12;
            if((od.aw.nextInt() & 3) == 0) {
                ++arg12;
            }

            ++arg11;
        }

        this.aw(arg8, arg9, arg10, v4, null, arg14);
    }

    void cs(int arg2, int arg3) {
        od.av = -1;
        od.aa = -1;
        od.au = arg3;
        od.am = arg3;
        od.az = arg2;
        od.ag = arg2;
        od.ah = -401172586;
        od.at = 0;
        od.ay = 0;
    }

    void ct(String arg24, int arg25, int arg26, fa arg27) {
        int v22;
        int v21;
        fa v15;
        ef v0_2;
        int v8;
        int v3_1;
        od v9 = this;
        String v10 = arg24;
        int v11 = arg26 - v9.aj;
        int v12 = -1;
        int v2 = arg25;
        int v0 = -1;
        int v1 = -1;
        int v13;
        for(v13 = 0; v13 < arg24.length(); ++v13) {
            if(v10.charAt(v13) != 0) {
                int v4 = 0xFF;
                char v3 = ((char)(je.ax(v10.charAt(v13), 2056041376) & v4));
                if(v3 == 60) {
                    v0 = v13;
                    goto label_219;
                }

                if(v3 != 62 || v0 == v12) {
                    v8 = v0;
                }
                else {
                    String v0_1 = v10.substring(v0 + 1, v13);
                    if(v0_1.equals("lt")) {
                        v3_1 = 60;
                    }
                    else if(v0_1.equals("gt")) {
                        v3_1 = 62;
                    }
                    else {
                        goto label_44;
                    }

                    v8 = -1;
                    goto label_72;
                label_44:
                    if(v0_1.startsWith("img=")) {
                        v3_1 = 4;
                        try {
                            v0_2 = od.af[bw.ar(v0_1.substring(v3_1), 0x6060893B)];
                            v3_1 = v9.aj + v11 - v0_2.ad;
                            v15 = arg27;
                        }
                        catch(Exception ) {
                            goto label_68;
                        }

                        try {
                            v15.ag(v0_2, v2, v3_1, 1);
                            v2 += v0_2.aj;
                            v0 = -1;
                            v1 = -1;
                            goto label_219;
                        }
                        catch(Exception ) {
                            goto label_68;
                        }
                    }

                    v9.ah(v0_1);
                label_68:
                    v0 = -1;
                    goto label_219;
                }

            label_72:
                int v5 = 0x20;
                int v7 = v3_1 == 0xA0 ? 0x20 : v3_1;
                if(v8 == v12) {
                    if(v9.ai != null && v1 != v12) {
                        v2 += v9.ai[(v1 << 8) + v7];
                    }

                    int v16 = v2;
                    int v17 = v9.ae[v7];
                    int v18 = v9.ar[v7];
                    if(v7 == v5) {
                        v21 = v7;
                        v22 = v8;
                        if(od.at <= 0) {
                            goto label_185;
                        }

                        od.ay += od.at;
                        v16 += od.ay >> 8;
                        od.ay &= v4;
                    }
                    else if(od.ah >= v4) {
                        if(od.am != v12) {
                            v21 = v7;
                            this.ao(v9.ax[v7], v16 + v9.an[v7] + 1, v9.ap[v7] + v11 + 1, v17, v18, od.am, arg27);
                        }
                        else {
                            v21 = v7;
                        }

                        this.ao(v9.ax[v21], v16 + v9.an[v21], v11 + v9.ap[v21], v17, v18, od.ag, arg27);
                        v22 = v8;
                    }
                    else {
                        v21 = v7;
                        if(od.am != v12) {
                            v22 = v8;
                            this.ak(v9.ax[v21], v16 + v9.an[v21] + 1, v9.ap[v21] + v11 + 1, v17, v18, od.am, od.ah, arg27);
                        }
                        else {
                            v22 = v8;
                        }

                        this.ak(v9.ax[v21], v16 + v9.an[v21], v11 + v9.ap[v21], v17, v18, od.ag, od.ah, arg27);
                    }

                label_185:
                    v0 = v16;
                    v1 = v9.al[v21];
                    if(od.av != v12) {
                        arg27.aj(v0, v11 + (((int)((((double)v9.aj)) * 0.7))), v1, od.av, 0xF181DDB9);
                    }

                    if(od.aa != v12) {
                        arg27.aj(v0, v9.aj + v11 + 1, v1, od.aa, 0x4C781CFD);
                    }

                    v2 = v0 + v1;
                    v1 = v21;
                }
                else {
                    v22 = v8;
                }

                v0 = v22;
            }

        label_219:
        }
    }

    void cu(String arg26, int arg27, int arg28, int[] arg29, int[] arg30, fa arg31) {
        int v24;
        int v23;
        fa v12;
        ef v0_2;
        int v7;
        int v4_1;
        int v21;
        od v9 = this;
        String v10 = arg26;
        int v11 = arg28 - v9.aj;
        int v13 = -1;
        int v2 = arg27;
        int v0 = -1;
        int v1 = -1;
        int v3 = 0;
        int v8;
        for(v8 = 0; v8 < arg26.length(); v8 = v21 + 1) {
            if(v10.charAt(v8) == 0) {
                v21 = v8;
                goto label_263;
            }

            int v5 = 0xFF;
            char v4 = ((char)(je.ax(v10.charAt(v8), 1550459694) & v5));
            if(v4 == 60) {
                v0 = v8;
                v21 = v0;
                goto label_263;
            }

            if(v4 != 62 || v0 == v13) {
                v7 = v0;
            }
            else {
                String v0_1 = v10.substring(v0 + 1, v8);
                if(v0_1.equals("lt")) {
                    v4_1 = 60;
                }
                else if(v0_1.equals("gt")) {
                    v4_1 = 62;
                }
                else {
                    goto label_48;
                }

                v7 = -1;
                goto label_89;
            label_48:
                if(!v0_1.startsWith("img=")) {
                    goto label_82;
                }

                if(arg29 != null) {
                    try {
                        v4_1 = arg29[v3];
                        goto label_57;
                    label_56:
                        v4_1 = 0;
                    label_57:
                        v5 = arg30 != null ? arg30[v3] : 0;
                        ++v3;
                        v0_2 = od.af[bw.ar(v0_1.substring(4), 1152600032)];
                        v4_1 += v2;
                        v7 = v9.aj + v11 - v0_2.ad + v5;
                        v12 = arg31;
                        goto label_75;
                    label_54:
                        goto label_84;
                    }
                    catch(Exception ) {
                        goto label_54;
                    }
                }
                else {
                    goto label_56;
                }

                goto label_57;
                try {
                label_75:
                    v12.ag(v0_2, v4_1, v7, 1);
                    v2 += v0_2.aj;
                    v21 = v8;
                    v0 = -1;
                    v1 = -1;
                    goto label_263;
                }
                catch(Exception ) {
                    goto label_84;
                }

            label_82:
                v9.ah(v0_1);
            label_84:
                v21 = v8;
                v0 = -1;
                goto label_263;
            }

        label_89:
            int v6 = 0x20;
            if(v4_1 == 0xA0) {
                v4_1 = 0x20;
            }

            if(v7 == v13) {
                if(v9.ai != null && v1 != v13) {
                    v2 += v9.ai[(v1 << 8) + v4_1];
                }

                int v14 = v2;
                int v15 = v9.ae[v4_1];
                int v16 = v9.ar[v4_1];
                int v17 = arg29 != null ? arg29[v3] : 0;
                int v18 = arg30 != null ? arg30[v3] : 0;
                int v22 = v3 + 1;
                if(v4_1 == v6) {
                    v23 = v4_1;
                    v24 = v7;
                    v21 = v8;
                    if(od.at <= 0) {
                        goto label_229;
                    }

                    od.ay += od.at;
                    v14 += od.ay >> 8;
                    od.ay &= v5;
                }
                else if(od.ah >= v5) {
                    if(od.am != v13) {
                        v23 = v4_1;
                        v24 = v7;
                        this.ao(v9.ax[v4_1], v9.an[v4_1] + v14 + 1 + v17, v9.ap[v4_1] + v11 + 1 + v18, v15, v16, od.am, arg31);
                    }
                    else {
                        v23 = v4_1;
                        v24 = v7;
                    }

                    this.ao(v9.ax[v23], v9.an[v23] + v14 + v17, v9.ap[v23] + v11 + v18, v15, v16, od.ag, arg31);
                    v21 = v8;
                }
                else {
                    v23 = v4_1;
                    v24 = v7;
                    if(od.am != v13) {
                        v21 = v8;
                        this.ak(v9.ax[v23], v9.an[v23] + v14 + 1 + v17, v9.ap[v23] + v11 + 1 + v18, v15, v16, od.am, od.ah, arg31);
                    }
                    else {
                        v21 = v8;
                    }

                    this.ak(v9.ax[v23], v9.an[v23] + v14 + v17, v9.ap[v23] + v11 + v18, v15, v16, od.ag, od.ah, arg31);
                }

            label_229:
                v0 = v9.al[v23];
                if(od.av != v13) {
                    arg31.aj(v14, v11 + (((int)((((double)v9.aj)) * 0.7))), v0, od.av, 0xE771AFEE);
                }

                if(od.aa != v13) {
                    arg31.aj(v14, v11 + v9.aj, v0, od.aa, 0x4EE3F2F7);
                }

                v2 = v14 + v0;
                v3 = v22;
                v1 = v23;
            }
            else {
                v24 = v7;
                v21 = v8;
            }

            v0 = v24;
        label_263:
        }
    }

    void cv(int[] arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v2;
        int v0 = -(arg10 >> 2);
        arg10 = -(arg10 & 3);
        arg7 |= 0xFF000000;
        arg11 = -arg11;
        while(arg11 < 0) {
            int v1 = arg9;
            arg9 = arg8;
            arg8 = v0;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg9 = v1 + 1;
                    arg5[v1] = arg7;
                }
                else {
                    arg9 = v1 + 1;
                }

                v1 = v2 + 1;
                if(arg6[v2] != 0) {
                    v2 = arg9 + 1;
                    arg5[arg9] = arg7;
                }
                else {
                    v2 = arg9 + 1;
                }

                arg9 = v1 + 1;
                if(arg6[v1] != 0) {
                    v1 = v2 + 1;
                    arg5[v2] = arg7;
                }
                else {
                    v1 = v2 + 1;
                }

                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg5[v1] = arg7;
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            arg8 = arg10;
            while(arg8 < 0) {
                v2 = arg9 + 1;
                if(arg6[arg9] != 0) {
                    arg5[v1] = arg7;
                    ++v1;
                }
                else {
                    ++v1;
                }

                ++arg8;
                arg9 = v2;
            }

            ++arg11;
            int v3 = arg9 + arg13;
            arg9 = v1 + arg12;
            arg8 = v3;
        }
    }

    public void cw(String arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        if(arg15 == null) {
            return;
        }

        this.ag(arg18, arg19);
        double v2 = 7 - (((double)arg21)) / 8;
        double v4 = 0;
        if(v2 < v4) {
            v2 = v4;
        }

        int[] v5 = new int[arg15.length()];
        int v0;
        for(v0 = 0; v0 < arg15.length(); ++v0) {
            v5[v0] = ((int)(Math.sin((((double)v0)) / 1.5 + (((double)arg20)) / 1) * v2));
        }

        this.aw(arg15, arg16 - this.ar(arg15) / 2, arg17, null, v5, arg22);
    }

    public void cx(String arg9, int arg10, int arg11, int arg12, int arg13, int arg14, fa arg15) {
        if(arg9 == null) {
            return;
        }

        this.ag(arg12, arg13);
        int[] v5 = new int[arg9.length()];
        for(arg12 = 0; arg12 < arg9.length(); ++arg12) {
            v5[arg12] = ((int)(Math.sin((((double)arg12)) / 2 + (((double)arg14)) / 5) * 5));
        }

        this.aw(arg9, arg10 - this.ar(arg9) / 2, arg11, null, v5, arg15);
    }

    public void cy(String arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        if(arg15 == null) {
            return;
        }

        this.ag(arg18, arg19);
        double v2 = 7 - (((double)arg21)) / 8;
        double v4 = 0;
        if(v2 < v4) {
            v2 = v4;
        }

        int[] v5 = new int[arg15.length()];
        int v0;
        for(v0 = 0; v0 < arg15.length(); ++v0) {
            v5[v0] = ((int)(Math.sin((((double)v0)) / 1.5 + (((double)arg20)) / 1) * v2));
        }

        this.aw(arg15, arg16 - this.ar(arg15) / 2, arg17, null, v5, arg22);
    }

    void cz(String arg6) {
        try {
            int v1 = 4;
            byte v2 = 18;
            int v3 = 16;
            if(arg6.startsWith("col=")) {
                od.ag = ao.an(arg6.substring(v1), v3, v2);
            }
            else if(arg6.equals("/col")) {
                od.ag = od.az;
            }
            else if(arg6.startsWith("str=")) {
                od.av = ao.an(arg6.substring(v1), v3, v2);
            }
            else if(arg6.equals("str")) {
                od.av = 0x800000;
            }
            else {
                v1 = -1;
                if(arg6.equals("/str")) {
                    od.av = v1;
                }
                else if(arg6.startsWith("u=")) {
                    od.aa = ao.an(arg6.substring(2), v3, v2);
                }
                else if(arg6.equals("u")) {
                    od.aa = 0;
                }
                else if(arg6.equals("/u")) {
                    od.aa = v1;
                }
                else if(arg6.startsWith("shad=")) {
                    od.am = ao.an(arg6.substring(5), v3, v2);
                }
                else if(arg6.equals("shad")) {
                    od.am = 0;
                }
                else if(arg6.equals("/shad")) {
                    od.am = od.au;
                }
                else if(arg6.equals("br")) {
                    this.ag(od.az, od.au);
                }
            }

            return;
        }
        catch(Exception ) {
            return;
        }
    }

    void dh(byte[] arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        int v4;
        int v10;
        int v9;
        int v6;
        int v2 = arg16;
        int v3 = arg17;
        fa v7 = arg22;
        if(arg21 >= 0x8D3980AD) {
            this.ao(arg15, arg16, arg17, arg18, arg19, arg20, arg22);
            return;
        }

        int v1 = -107049639;
        int v0 = v7.al * v1 * v3 + v2;
        int v5 = v7.al * 0x8502C1F0 - arg18;
        int v8 = 0;
        if(v3 < v7.ar * -1480320704) {
            v6 = v7.ar * 0x3CF39173 - v3;
            v3 = arg19 - v6;
            v9 = v7.ar * 0x7DDB4FFC;
            v10 = v6 * arg18;
            v0 += v6 * (v7.al * v1);
        }
        else {
            v9 = v3;
            v10 = 0;
            v3 = arg19;
        }

        v9 += v3;
        if(v9 > v7.an * -880963105) {
            v3 -= v9 - v7.an * 589202774;
        }

        v9 = v3;
        if(v2 < v7.ap * 0xE4D30573) {
            v1 = v7.ap * 0x64FD3394 - v2;
            v10 += v1;
            v8 = v1;
            v5 += v1;
            v6 = v0 + v1;
            v4 = arg18 - v1;
            v2 = v7.ap * 1216210461;
        }
        else {
            v4 = arg18;
            v6 = v0;
        }

        v2 += v4;
        v1 = 0x56AC17CD;
        if(v2 > v7.aj * v1) {
            v2 -= v7.aj * v1;
            v4 -= v2;
            v8 += v2;
            v5 += v2;
        }

        v0 = v4;
        int v12 = v5;
        int v13 = v8;
        if(v0 > 0) {
            if(v9 <= 0) {
            }
            else {
                this.ac(v7.ax, arg15, arg20, v10, v6, v0, v9, v12, v13, arg21);
                return;
            }
        }
    }

    void dp(byte[] arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        int v4;
        int v9;
        int v1;
        int v2 = arg16;
        int v3 = arg17;
        fa v7 = arg22;
        if(arg21 >= 0xBF0A8DEA) {
            this.ao(arg15, arg16, arg17, arg18, arg19, arg20, arg22);
            return;
        }

        int v0 = v7.al * -107049639 * v3 + v2;
        int v5 = v7.al * -107049639 - arg18;
        int v6 = 2002832733;
        int v8 = 0;
        if(v3 < v7.ar * v6) {
            v1 = v7.ar * 0xD2FBCD61 - v3;
            v3 = arg19 - v1;
            v6 *= v7.ar;
            v9 = v1 * arg18;
            v1 = v0 + v1 * (v7.al * 0xF07BF7A9);
            v0 = v9;
            v9 = v3;
            v3 = v6;
        }
        else {
            v9 = arg19;
            v1 = v0;
            v0 = 0;
        }

        v3 += v9;
        if(v3 > v7.an * 0x7F4D9393) {
            v9 -= v3 - v7.an * 0xD21DC9D7;
        }

        v6 = 0xE4D30573;
        if(v2 < v7.ap * v6) {
            v3 = v7.ap * 0xC9342E6F - v2;
            v4 = v7.ap * v6;
            v0 += v3;
            v8 = v3;
            v5 += v3;
            v6 = v1 + v3;
            int v13 = v4;
            v4 = arg18 - v3;
            v2 = v13;
        }
        else {
            v4 = arg18;
            v6 = v1;
        }

        v2 += v4;
        if(v2 > v7.aj * 0xA0F40CB6) {
            v2 -= v7.aj * -2008500060;
            v4 -= v2;
            v8 += v2;
            v5 += v2;
        }

        int v10 = v5;
        int v12 = v8;
        v8 = v4;
        if(v8 > 0) {
            if(v9 <= 0) {
            }
            else {
                this.ac(v7.ax, arg15, arg20, v0, v6, v8, v9, v10, v12, arg21);
                return;
            }
        }
    }

    void dv(byte[] arg15, int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, fa arg22) {
        int v4;
        int v9;
        int v8;
        int v5;
        int v2 = arg16;
        int v3 = arg17;
        fa v7 = arg22;
        if(arg21 >= 0xFF) {
            this.ao(arg15, arg16, arg17, arg18, arg19, arg20, arg22);
            return;
        }

        int v0 = v7.al * -107049639 * v3 + v2;
        int v1 = v7.al * 0x49FE0E02 - arg18;
        int v6 = 0;
        if(v3 < v7.ar * 199711702) {
            v5 = v7.ar * 1529129000 - v3;
            v3 = arg19 - v5;
            v8 = v7.ar * 0xE4B8B9F9;
            v9 = v5 * arg18;
            v0 += v5 * (v7.al * 1722886037);
        }
        else {
            v8 = v3;
            v9 = 0;
            v3 = arg19;
        }

        v8 += v3;
        int v10 = 0xD21DC9D7;
        if(v8 > v7.an * v10) {
            v3 -= v8 - v7.an * v10;
        }

        v8 = v3;
        if(v2 < v7.ap * 0x1664B7F1) {
            v3 = v7.ap * 980074168 - v2;
            v0 += v3;
            v6 = v3;
            v1 += v3;
            v5 = v9 + v3;
            v4 = arg18 - v3;
            v2 = v7.ap * -447142790;
        }
        else {
            v4 = arg18;
            v5 = v9;
        }

        v2 += v4;
        v9 = 0x56AC17CD;
        if(v2 > v7.aj * v9) {
            v2 -= v7.aj * v9;
            v4 -= v2;
            v6 += v2;
            v1 += v2;
        }

        v10 = v1;
        v9 = v4;
        int v12 = v6;
        if(v9 > 0) {
            if(v8 <= 0) {
            }
            else {
                this.ac(v7.ax, arg15, arg20, v5, v0, v9, v8, v10, v12, arg21);
                return;
            }
        }
    }

    void dw(int[] arg18, byte[] arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27) {
        int v1 = arg27;
        int v2 = v1 << 24 | arg20;
        int v3 = 0xFF00FF;
        int v5 = 0xFF00FF00;
        int v6 = 0xFF00;
        int v0 = ((arg20 & v3) * v1 & v5) + ((arg20 & v6) * v1 & 0xFF0000) >> 8;
        int v4 = 0xFF - v1;
        int v8 = -arg24;
        int v9 = arg21;
        int v10 = arg22;
        while(v8 < 0) {
            int v12 = -arg23;
            while(v12 < 0) {
                int v13 = v9 + 1;
                if(arg19[v9] != 0) {
                    v9 = arg18[v10];
                    if(v9 == 0) {
                        v9 = v10 + 1;
                        arg18[v10] = v2;
                    }
                    else {
                        arg18[v10] = Math.max(v9 >>> 24, v1) << 24 | (((v9 & v3) * v4 & v5) + ((v9 & v6) * v4 & 0xFF0000) >> 8) + v0;
                        v9 = v10 + 1;
                    }

                    v10 = v9;
                }
                else {
                    ++v10;
                }

                ++v12;
                v9 = v13;
            }

            v10 += arg25;
            v9 += arg26;
            ++v8;
        }
    }
}

