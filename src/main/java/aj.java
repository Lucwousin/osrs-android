import java.util.Collection;

public class aj {
    public static short[][] ad = null;
    public boolean ae;
    static final int[] af = null;
    static final int ag = 4;
    static gk ai = null;
    public static short[] aj = null;
    int[] al;
    long an;
    long ap;
    public int ar;
    static final int av = 0x200;
    int[] ax;
    public static final int dv = 106;

    static {
        aj.af = new int[]{8, 11, 4, 6, 9, 7, 10};
        aj.ai = new gk(260, null);
    }

    public aj() {
        super();
    }

    public void aa(int arg6, boolean arg7) {
        if(arg6 == 1 && (this.ae)) {
            return;
        }

        int v1 = this.ax[aj.af[arg6]];
        if(v1 == 0) {
            return;
        }

        v1 += 0xFFFFFF00;
        do {
        label_12:
            int v2 = 0;
            if(!arg7) {
                --v1;
                if(v1 < 0) {
                    v1 = dt.ae * -639990123 - 1;
                }
            }
            else {
                ++v1;
                if(v1 >= dt.ae * 0xAA4AB802) {
                    v1 = 0;
                }
            }

            dt v3 = gy.al(v1, 0xE5FE62C7);
            if(v3 == null) {
                goto label_12;
            }

            if(v3.ai) {
                goto label_12;
            }

            int v3_1 = v3.an * -1720917433;
            if(this.ae) {
                v2 = 7;
            }
        }
        while(v3_1 != v2 + arg6);

        this.ax[aj.af[arg6]] = v1 - 0x20B7807F;
        this.ap(0xA41EE0A5);
    }

    public ca ac(df arg26, int arg27, df arg28, int arg29) {
        ca v10_2;
        ca v1_2;
        by v6_1;
        int v12;
        int v11;
        aj v0 = this;
        df v2 = arg26;
        df v4 = arg28;
        int v3 = 0x4257107;
        if(v0.ar * v3 != -1) {
            return au.al(v0.ar * v3, 1).ap(arg26, arg27, arg28, arg29, -502182161);
        }

        long v8 = v0.an * 0x96C7B8201D43C51L;
        int[] v1 = v0.ax;
        v3 = 5;
        int v6 = 12;
        int v7 = 0;
        if(v2 != null) {
            v11 = 0x270867B5;
            v12 = 0x3EFAB985;
            if(v2.aa * v11 < 0 && v2.au * v12 < 0) {
                goto label_72;
            }

            v1 = new int[v6];
            int v10;
            for(v10 = 0; v10 < v6; ++v10) {
                v1[v10] = v0.ax[v10];
            }

            if(v2.aa * v11 >= 0) {
                v8 += ((long)(v2.aa * v11 - v0.ax[v3] << 40));
                v1[v3] = v2.aa * v11;
            }

            if(v2.au * v12 < 0) {
                goto label_72;
            }

            v8 += ((long)(v2.au * v12 - v0.ax[3] << 0x30));
            v1[3] = v2.au * v12;
        }

    label_72:
        mv v10_1 = aj.ai.ax(v8);
        if(v10_1 == null) {
            v11 = 0;
            v12 = 0;
            while(true) {
                int v13 = 0x100;
                int v14 = 0x200;
                if(v11 >= v6) {
                    break;
                }

                int v15 = v1[v11];
                int v5 = v15 < v13 || v15 >= v14 || (gy.al(v15 - 0x100, 0x1C1801B3).an(0x833EA0F9)) ? v12 : 1;
                v12 = v15 < v14 || (client.al(v15 - 0x200, 0x55C935B7).aa(v0.ae, 0xDF)) ? v5 : 1;
                ++v11;
            }

            if(v12 != 0) {
                long v15_1 = 0x5A3A6F6060B14DDL;
                if(v0.ap * v15_1 != -1) {
                    v10_1 = aj.ai.ax(v0.ap * v15_1);
                }

                if(v10_1 != null) {
                    goto label_120;
                }

                return null;
            }

        label_120:
            if(v10_1 != null) {
                goto label_197;
            }

            by[] v5_1 = new by[v6];
            v10 = 0;
            v11 = 0;
            while(v10 < v6) {
                v12 = v1[v10];
                if(v12 >= v13 && v12 < v14) {
                    v6_1 = gy.al(v12 - 0x100, 0x3B809B89).ap(0xFE09F548);
                    if(v6_1 != null) {
                        v5_1[v11] = v6_1;
                        ++v11;
                    }
                }

                if(v12 >= v14) {
                    v6_1 = client.al(v12 - 0x200, 0x2E259B49).au(v0.ae, 0x19D4B0D0);
                    if(v6_1 != null) {
                        v5_1[v11] = v6_1;
                        ++v11;
                    }
                }

                ++v10;
                v6 = 12;
            }

            by v1_1 = new by(v5_1, v11);
            while(v7 < v3) {
                if(v0.al[v7] < aj.ad[v7].length) {
                    v1_1.av(aj.aj[v7], aj.ad[v7][v0.al[v7]]);
                }

                if(v0.al[v7] < ab.ab[v7].length) {
                    v1_1.av(py.aq[v7], ab.ab[v7][v0.al[v7]]);
                }

                ++v7;
            }

            v1_2 = v1_1.ay(0x40, 850, -30, -50, -30);
            aj.ai.ae(((mv)v1_2), v8);
            v0.ap = v8 * -7037264012933438603L;
            v10_2 = v1_2;
        }

    label_197:
        if(v2 == null && v4 == null) {
            return v10_2;
        }

        if(v2 != null && v4 != null) {
            v1_2 = arg26.aq(((mv)v10_2), arg27, arg28, arg29, 43);
        }
        else if(v2 != null) {
            v1_2 = v2.ap(v10_2, arg27, -2054956515);
        }
        else {
            v1_2 = v4.ap(v10_2, arg29, 0x9969C644);
        }

        return v1_2;
    }

    by ad(int arg10) {
        by v1_1;
        int v3;
        arg10 = -1;
        try {
            int v1 = 0x4257107;
            if(arg10 != this.ar * v1) {
                return au.al(this.ar * v1, 1).aj(0x8FCA7E6F);
            }

            arg10 = 0;
            int v0 = 0;
            v1 = 0;
            while(true) {
                v3 = 12;
                int v4 = 0x100;
                int v5 = 0x200;
                if(v0 >= v3) {
                    break;
                }

                v3 = this.ax[v0];
                if(v3 >= v4 && v3 < v5 && !gy.al(v3 - 0x100, -473654903).aj(-67)) {
                    v1 = 1;
                }

                if(v3 >= v5 && !client.al(v3 - 0x200, 0x1A55B7D2).am(this.ae, 0xD620020B)) {
                    v1 = 1;
                }

                ++v0;
            }

            if(v1 != 0) {
                return null;
            }

            by[] v0_1 = new by[v3];
            v1 = 0;
            int v2 = 0;
            while(v1 < v3) {
                int v6 = this.ax[v1];
                if(v6 >= v4 && v6 < v5) {
                    by v7 = gy.al(v6 - 0x100, -230445948).ad(-5);
                    if(v7 != null) {
                        v0_1[v2] = v7;
                        ++v2;
                    }
                }

                if(v6 >= v5) {
                    by v6_1 = client.al(v6 - 0x200, 0x352E00BB).az(this.ae, -46);
                    if(v6_1 != null) {
                        v0_1[v2] = v6_1;
                        ++v2;
                    }
                }

                ++v1;
            }

            v1_1 = new by(v0_1, v2);
            while(true) {
            label_76:
                if(arg10 >= 5) {
                    return v1_1;
                }

                if(this.al[arg10] < aj.ad[arg10].length) {
                    v1_1.av(aj.aj[arg10], aj.ad[arg10][this.al[arg10]]);
                }

                if(this.al[arg10] < ab.ab[arg10].length) {
                    v1_1.av(py.aq[arg10], ab.ab[arg10][this.al[arg10]]);
                }

                break;
            }
        }
        catch(RuntimeException v10) {
            goto label_111;
        }

        ++arg10;
        goto label_76;
        return v1_1;
    label_111:
        StringBuilder v0_2 = new StringBuilder();
        v0_2.append("aj.ad(");
        v0_2.append(')');
        throw lx.al(((Throwable)v10), v0_2.toString());
    }

    public void ae(int arg1, boolean arg2, short arg3) {
        try {
            int v3 = this.al[arg1];
            if(!arg2) {
                do {
                    --v3;
                    if(v3 < 0) {
                        v3 = aj.ad[arg1].length - 1;
                    }
                }
                while(!af.ax(arg1, v3, 0x82F7134E));
            }
            else {
                do {
                    ++v3;
                    if(v3 >= aj.ad[arg1].length) {
                        v3 = 0;
                    }

                    if(!af.ax(arg1, v3, 0x8320DF05)) {
                        continue;
                    }

                    break;
                }
                while(true);
            }

            this.al[arg1] = v3;
            this.ap(0x95A63B08);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("aj.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static final void ae(hf arg1, byte arg2) {
        try {
            nk.aq = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("aj.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void af(int[] arg8, int[] arg9, boolean arg10, int arg11) {
        if(arg8 == null) {
            arg8 = new int[12];
            int v1;
            for(v1 = 0; v1 < 7; ++v1) {
                int v3;
                for(v3 = 0; v3 < dt.ae * -639990123; ++v3) {
                    dt v4 = gy.al(v3, 2104958310);
                    if(v4 != null && !v4.ai) {
                        int v5 = arg10 ? 7 : 0;
                        if(v5 + v1 != v4.an * -1435079403) {
                            goto label_32;
                        }

                        arg8[aj.af[v1]] = v3 - 0x20194BFE;
                        break;
                    }

                label_32:
                }
            }
        }

        this.ax = arg8;
        this.al = arg9;
        this.ae = arg10;
        this.ar = arg11 * -2030490441;
        this.ap(0x2F0CF026);
    }

    public void ag(boolean arg8) {
        if(arg8 == this.ae) {
            return;
        }

        this.ax(null, this.al, arg8, -1, -1651066425);
    }

    public void ah(boolean arg8) {
        if(arg8 == this.ae) {
            return;
        }

        this.ax(null, this.al, arg8, -1, -61040628);
    }

    public void ai(int[] arg8, int[] arg9, boolean arg10, int arg11) {
        if(arg8 == null) {
            arg8 = new int[12];
            int v1;
            for(v1 = 0; v1 < 7; ++v1) {
                int v3;
                for(v3 = 0; v3 < dt.ae * 0xF924CF4F; ++v3) {
                    dt v4 = gy.al(v3, 0x8C91E1B2);
                    if(v4 != null && !v4.ai) {
                        int v5 = arg10 ? 7 : 0;
                        if(v5 + v1 != v4.an * -1720917433) {
                            goto label_31;
                        }

                        arg8[aj.af[v1]] = v3 + 0x100;
                        break;
                    }

                label_31:
                }
            }
        }

        this.ax = arg8;
        this.al = arg9;
        this.ae = arg10;
        this.ar = arg11 * 0xD8FBDD8C;
        this.ap(886763204);
    }

    public ca aj(df arg26, int arg27, df arg28, int arg29, int arg30) {
        ca v0_2;
        mv v3_2;
        by v4_1;
        int v12;
        int v11;
        aj v1 = this;
        df v0 = arg26;
        df v5 = arg28;
        try {
            int v3 = 0x4257107;
            if(v1.ar * v3 != -1) {
                return au.al(v1.ar * v3, 1).ap(arg26, arg27, arg28, arg29, 0xE47E509E);
            }

            long v7 = v1.an * 0x96C7B8201D43C51L;
            int[] v2 = v1.ax;
            v3 = 5;
            int v4 = 12;
            int v9 = 0;
            if(v0 != null) {
                v11 = 0x270867B5;
                v12 = 0x3EFAB985;
                if(v0.aa * v11 < 0 && v0.au * v12 < 0) {
                    goto label_72;
                }

                v2 = new int[v4];
                int v10;
                for(v10 = 0; v10 < v4; ++v10) {
                    v2[v10] = v1.ax[v10];
                }

                if(v0.aa * v11 >= 0) {
                    v7 += ((long)(v0.aa * v11 - v1.ax[v3] << 40));
                    v2[v3] = v0.aa * v11;
                }

                if(v0.au * v12 < 0) {
                    goto label_72;
                }

                v7 += ((long)(v0.au * v12 - v1.ax[3] << 0x30));
                v2[3] = v0.au * v12;
            }

        label_72:
            mv v10_1 = aj.ai.ax(v7);
            if(v10_1 == null) {
                v11 = 0;
                v12 = 0;
                while(true) {
                    int v13 = 0x100;
                    int v14 = 0x200;
                    if(v11 >= v4) {
                        break;
                    }

                    int v15 = v2[v11];
                    int v6 = v15 < v13 || v15 >= v14 || (gy.al(v15 - 0x100, 0xEDE317F1).an(38525106)) ? v12 : 1;
                    v12 = v15 < v14 || (client.al(v15 - 0x200, 2010729181).aa(v1.ae, 0xDF)) ? v6 : 1;
                    ++v11;
                }

                if(v12 != 0) {
                    long v15_1 = 0x5A3A6F6060B14DDL;
                    if(v1.ap * v15_1 != -1) {
                        v10_1 = aj.ai.ax(v1.ap * v15_1);
                    }

                    if(v10_1 != null) {
                        goto label_120;
                    }

                    return null;
                }

            label_120:
                if(v10_1 != null) {
                    goto label_198;
                }

                by[] v6_1 = new by[v4];
                v10 = 0;
                v11 = 0;
                while(v10 < v4) {
                    v12 = v2[v10];
                    if(v12 >= v13 && v12 < v14) {
                        v4_1 = gy.al(v12 - 0x100, 0x1F4DDBE8).ap(0x246D256);
                        if(v4_1 != null) {
                            v6_1[v11] = v4_1;
                            ++v11;
                        }
                    }

                    if(v12 >= v14) {
                        v4_1 = client.al(v12 - 0x200, 0xF531E8EF).au(v1.ae, 0x9F56ADA0);
                        if(v4_1 != null) {
                            v6_1[v11] = v4_1;
                            ++v11;
                        }
                    }

                    ++v10;
                    v4 = 12;
                }

                by v2_1 = new by(v6_1, v11);
                while(v9 < v3) {
                    if(v1.al[v9] < aj.ad[v9].length) {
                        v2_1.av(aj.aj[v9], aj.ad[v9][v1.al[v9]]);
                    }

                    if(v1.al[v9] < ab.ab[v9].length) {
                        v2_1.av(py.aq[v9], ab.ab[v9][v1.al[v9]]);
                    }

                    ++v9;
                }

                ca v2_2 = v2_1.ay(0x40, 850, -30, -50, -30);
                aj.ai.ae(((mv)v2_2), v7);
                v1.ap = v7 * -7037264012933438603L;
                ca v3_1 = v2_2;
            }
            else {
            label_198:
                v3_2 = v10_1;
            }

            if(v0 == null && v5 == null) {
                return ((ca)v3_2);
            }

            if(v0 != null && v5 != null) {
                v0_2 = arg26.aq(((ca)v3_2), arg27, arg28, arg29, 18);
            }
            else if(v0 != null) {
                v0_2 = v0.ap(((ca)v3_2), arg27, 0x8989D768);
            }
            else {
                v0_2 = v5.ap(((ca)v3_2), arg29, 0x8FC970F2);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_3 = new StringBuilder();
            v2_3.append("aj.aj(");
            v2_3.append(')');
            throw lx.al(((Throwable)v0_1), v2_3.toString());
        }

        return v0_2;
    }

    public ca ak(df arg26, int arg27, df arg28, int arg29) {
        ca v10_2;
        ca v1_2;
        by v6_1;
        int v12;
        int v11;
        aj v0 = this;
        df v2 = arg26;
        df v4 = arg28;
        int v3 = 0x4257107;
        if(v0.ar * v3 != -1) {
            return au.al(v0.ar * v3, 1).ap(arg26, arg27, arg28, arg29, 0x28D0EB63);
        }

        long v8 = v0.an * 0x96C7B8201D43C51L;
        int[] v1 = v0.ax;
        v3 = 5;
        int v6 = 12;
        int v7 = 0;
        if(v2 != null) {
            v11 = 0x270867B5;
            v12 = 0x3EFAB985;
            if(v2.aa * v11 < 0 && v2.au * v12 < 0) {
                goto label_72;
            }

            v1 = new int[v6];
            int v10;
            for(v10 = 0; v10 < v6; ++v10) {
                v1[v10] = v0.ax[v10];
            }

            if(v2.aa * v11 >= 0) {
                v8 += ((long)(v2.aa * v11 - v0.ax[v3] << 40));
                v1[v3] = v2.aa * v11;
            }

            if(v2.au * v12 < 0) {
                goto label_72;
            }

            v8 += ((long)(v2.au * v12 - v0.ax[3] << 0x30));
            v1[3] = v2.au * v12;
        }

    label_72:
        mv v10_1 = aj.ai.ax(v8);
        if(v10_1 == null) {
            v11 = 0;
            v12 = 0;
            while(true) {
                int v13 = 0x100;
                int v14 = 0x200;
                if(v11 >= v6) {
                    break;
                }

                int v15 = v1[v11];
                int v5 = v15 < v13 || v15 >= v14 || (gy.al(v15 - 0x100, 0x68454B72).an(-2107782842)) ? v12 : 1;
                v12 = v15 < v14 || (client.al(v15 - 0x200, 0x202B5996).aa(v0.ae, 0xDF)) ? v5 : 1;
                ++v11;
            }

            if(v12 != 0) {
                long v15_1 = 0x5A3A6F6060B14DDL;
                if(v0.ap * v15_1 != -1) {
                    v10_1 = aj.ai.ax(v0.ap * v15_1);
                }

                if(v10_1 != null) {
                    goto label_120;
                }

                return null;
            }

        label_120:
            if(v10_1 != null) {
                goto label_197;
            }

            by[] v5_1 = new by[v6];
            v10 = 0;
            v11 = 0;
            while(v10 < v6) {
                v12 = v1[v10];
                if(v12 >= v13 && v12 < v14) {
                    v6_1 = gy.al(v12 - 0x100, 237092090).ap(0x18D1BFA);
                    if(v6_1 != null) {
                        v5_1[v11] = v6_1;
                        ++v11;
                    }
                }

                if(v12 >= v14) {
                    v6_1 = client.al(v12 - 0x200, 0x1BE7E546).au(v0.ae, 0x8B0FCADD);
                    if(v6_1 != null) {
                        v5_1[v11] = v6_1;
                        ++v11;
                    }
                }

                ++v10;
                v6 = 12;
            }

            by v1_1 = new by(v5_1, v11);
            while(v7 < v3) {
                if(v0.al[v7] < aj.ad[v7].length) {
                    v1_1.av(aj.aj[v7], aj.ad[v7][v0.al[v7]]);
                }

                if(v0.al[v7] < ab.ab[v7].length) {
                    v1_1.av(py.aq[v7], ab.ab[v7][v0.al[v7]]);
                }

                ++v7;
            }

            v1_2 = v1_1.ay(0x40, 850, -30, -50, -30);
            aj.ai.ae(((mv)v1_2), v8);
            v0.ap = v8 * -7037264012933438603L;
            v10_2 = v1_2;
        }

    label_197:
        if(v2 == null && v4 == null) {
            return v10_2;
        }

        if(v2 != null && v4 != null) {
            v1_2 = arg26.aq(((mv)v10_2), arg27, arg28, arg29, 33);
        }
        else if(v2 != null) {
            v1_2 = v2.ap(v10_2, arg27, -1451858081);
        }
        else {
            v1_2 = v4.ap(v10_2, arg29, -1471527703);
        }

        return v1_2;
    }

    public void al(int arg5, boolean arg6, int arg7) {
        if(arg5 == 1) {
            try {
                if(this.ae) {
                    return;
                }

            label_5:
                int v0 = this.ax[aj.af[arg5]];
                if(v0 == 0) {
                    return;
                }

                v0 += 0xFFFFFF00;
                do {
                label_12:
                    int v1 = 0;
                    int v2 = -639990123;
                    if(!arg6) {
                        --v0;
                        if(v0 < 0) {
                            v0 = dt.ae * v2 - 1;
                        }
                    }
                    else {
                        ++v0;
                        if(v0 >= dt.ae * v2) {
                            v0 = 0;
                        }
                    }

                    dt v2_1 = gy.al(v0, 0xF75E8780);
                    if(v2_1 == null) {
                        goto label_12;
                    }

                    if(v2_1.ai) {
                        goto label_12;
                    }

                    v2 = v2_1.an * -1720917433;
                    if(this.ae) {
                        v1 = 7;
                    }
                }
                while(v2 != v1 + arg5);

                this.ax[aj.af[arg5]] = v0 + 0x100;
                this.ap(1226075594);
                return;
            }
            catch(RuntimeException v5) {
                StringBuilder v6 = new StringBuilder();
                v6.append("aj.al(");
                v6.append(')');
                throw lx.al(((Throwable)v5), v6.toString());
            }
        }

        goto label_5;
    }

    public void am(int arg2, boolean arg3) {
        int v0 = this.al[arg2];
        if(!arg3) {
            do {
                --v0;
                if(v0 < 0) {
                    v0 = aj.ad[arg2].length - 1;
                }
            }
            while(!af.ax(arg2, v0, 0x823C6FDF));
        }
        else {
            do {
                ++v0;
                if(v0 >= aj.ad[arg2].length) {
                    v0 = 0;
                }

                if(!af.ax(arg2, v0, 0x82076182)) {
                    continue;
                }

                break;
            }
            while(true);
        }

        this.al[arg2] = v0;
        this.ap(0xC59AF0D5);
    }

    public void an(lq arg4, int arg5) {
        try {
            int v0 = 0;
            arg5 = this.ae ? 1 : 0;
            arg4.ar(arg5, 35);
            for(arg5 = 0; arg5 < 7; ++arg5) {
                int v1 = this.ax[aj.af[arg5]];
                if(v1 == 0) {
                    arg4.ar(-1, 0x76);
                }
                else {
                    arg4.ar(v1 - 0x100, 66);
                }
            }

            while(v0 < 5) {
                arg4.ar(this.al[v0], 46);
                ++v0;
            }
        }
        catch(RuntimeException v4) {
            goto label_36;
        }

        return;
    label_36:
        StringBuilder v5 = new StringBuilder();
        v5.append("aj.an(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    public void ao(lq arg5) {
        int v1 = 0;
        int v0 = this.ae ? 1 : 0;
        arg5.ar(v0, 2);
        for(v0 = 0; v0 < 7; ++v0) {
            int v2 = this.ax[aj.af[v0]];
            if(v2 == 0) {
                arg5.ar(-1, 106);
            }
            else {
                arg5.ar(v2 - 0x100, 46);
            }
        }

        while(v1 < 5) {
            arg5.ar(this.al[v1], 4);
            ++v1;
        }
    }

    void ap(int arg19) {
        long v16;
        int v15;
        int v14;
        aj v1 = this;
        try {
            long v4 = 0x96C7B8201D43C51L;
            long v2 = v1.an * v4;
            int v6 = 5;
            int v0_1 = v1.ax[v6];
            int v8 = 9;
            int v7 = v1.ax[v8];
            v1.ax[v6] = v7;
            v1.ax[v8] = v0_1;
            v1.an = 0;
            int v12;
            for(v12 = 0; true; ++v12) {
                v14 = 4;
                v15 = 0x100;
                v16 = -976485756905812815L;
                if(v12 >= 12) {
                    break;
                }

                v1.an = (v1.an * v4 << v14) * v16;
                if(v1.ax[v12] >= v15) {
                    v1.an += (((long)(v1.ax[v12] - v15))) * v16;
                }
            }

            if(v1.ax[0] >= v15) {
                v1.an += (((long)(v1.ax[0] - v15 >> v14))) * v16;
            }

            int v10 = 1;
            if(v1.ax[1] >= v15) {
                v1.an += (((long)(v1.ax[1] - v15 >> 8))) * v16;
            }

            int v9;
            for(v9 = 0; v9 < v6; ++v9) {
                v1.an = (v1.an * v4 << 3) * v16;
                v1.an += (((long)v1.al[v9])) * v16;
            }

            v1.an = (v1.an * v4 << 1) * v16;
            long v12_1 = v1.an;
            if(v1.ae) {
            }
            else {
                v10 = 0;
            }

            v1.an = v12_1 + (((long)v10)) * v16;
            v1.ax[v6] = v0_1;
            v1.ax[v8] = v7;
            if(0 != v2 && v2 != v1.an * v4) {
                aj.ai.al(v2);
            }
        }
        catch(RuntimeException v0) {
            goto label_112;
        }

        return;
    label_112:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("aj.ap(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0), v2_1.toString());
    }

    public int aq(byte arg5) {
        int v5 = -1;
        try {
            int v1 = 0x4257107;
            if(v5 == this.ar * v1) {
                return (this.al[0] << 25) + (this.al[4] << 20) + (this.ax[0] << 15) + (this.ax[8] << 10) + (this.ax[11] << 5) + this.ax[1];
            }

            return au.al(this.ar * v1, 1).an * 0x4C173D21 + 305419896;
        }
        catch(RuntimeException v5_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("aj.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v5_1), v0.toString());
        }
    }

    public void ar(boolean arg7, int arg8) {
        try {
            if(arg7 == this.ae) {
                return;
            }

            this.ax(null, this.al, arg7, -1, 0xD931809E);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("aj.ar(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    void as() {
        long v16;
        int v15;
        int v14;
        aj v0 = this;
        long v3 = 0x96C7B8201D43C51L;
        long v1 = v0.an * v3;
        int v6 = 5;
        int v5 = v0.ax[v6];
        int v8 = 9;
        int v7 = v0.ax[v8];
        v0.ax[v6] = v7;
        v0.ax[v8] = v5;
        v0.an = 0;
        int v12;
        for(v12 = 0; true; ++v12) {
            v14 = 4;
            v15 = 0x100;
            v16 = -976485756905812815L;
            if(v12 >= 12) {
                break;
            }

            v0.an = (v0.an * v3 << v14) * v16;
            if(v0.ax[v12] >= v15) {
                v0.an += (((long)(v0.ax[v12] + 34509660))) * v16;
            }
        }

        if(v0.ax[0] >= v15) {
            v0.an += (((long)(v0.ax[0] - v15 >> v14))) * v16;
        }

        int v10 = 1;
        if(v0.ax[1] >= v15) {
            v0.an += (((long)(v0.ax[1] - 0x16F01392 >> 8))) * v16;
        }

        int v9;
        for(v9 = 0; v9 < v6; ++v9) {
            v0.an = (v0.an * v3 << 3) * v16;
            v0.an += (((long)v0.al[v9])) * v16;
        }

        v0.an = (v0.an * v3 << 1) * v16;
        long v12_1 = v0.an;
        if(v0.ae) {
        }
        else {
            v10 = 0;
        }

        v0.an = v12_1 + (((long)v10)) * v16;
        v0.ax[v6] = v5;
        v0.ax[v8] = v7;
        if(0 != v1 && v1 != v0.an * v3) {
            aj.ai.al(v1);
        }
    }

    public void at(boolean arg8) {
        if(arg8 == this.ae) {
            return;
        }

        this.ax(null, this.al, arg8, -1, 0xBD9AB14D);
    }

    public void au(int arg2, boolean arg3) {
        int v0 = this.al[arg2];
        if(!arg3) {
            do {
                --v0;
                if(v0 < 0) {
                    v0 = aj.ad[arg2].length - 1;
                }
            }
            while(!af.ax(arg2, v0, 0x8224D90B));
        }
        else {
            do {
                ++v0;
                if(v0 >= aj.ad[arg2].length) {
                    v0 = 0;
                }

                if(!af.ax(arg2, v0, 0x80150DF2)) {
                    continue;
                }

                break;
            }
            while(true);
        }

        this.al[arg2] = v0;
        this.ap(0xF82B463D);
    }

    public void av(int arg6, boolean arg7) {
        if(arg6 == 1 && (this.ae)) {
            return;
        }

        int v1 = this.ax[aj.af[arg6]];
        if(v1 == 0) {
            return;
        }

        v1 += 0xFFFFFF00;
        do {
        label_12:
            int v2 = 0;
            int v3 = -639990123;
            if(!arg7) {
                --v1;
                if(v1 < 0) {
                    v1 = dt.ae * v3 - 1;
                }
            }
            else {
                ++v1;
                if(v1 >= dt.ae * v3) {
                    v1 = 0;
                }
            }

            dt v3_1 = gy.al(v1, 0x5BB4E0CB);
            if(v3_1 == null) {
                goto label_12;
            }

            if(v3_1.ai) {
                goto label_12;
            }

            v3 = v3_1.an * -1720917433;
            if(this.ae) {
                v2 = 7;
            }
        }
        while(v3 != v2 + arg6);

        this.ax[aj.af[arg6]] = v1 + 0x100;
        this.ap(0x348B4A0F);
    }

    public void aw(lq arg5) {
        int v1 = 0;
        int v0 = this.ae ? 1 : 0;
        arg5.ar(v0, 1);
        for(v0 = 0; v0 < 7; ++v0) {
            int v2 = this.ax[aj.af[v0]];
            if(v2 == 0) {
                arg5.ar(-1, 0x30);
            }
            else {
                arg5.ar(v2 - 0x100, 58);
            }
        }

        while(v1 < 5) {
            arg5.ar(this.al[v1], 68);
            ++v1;
        }
    }

    public void ax(int[] arg7, int[] arg8, boolean arg9, int arg10, int arg11) {
        if(arg7 == null) {
            int v7 = 12;
            try {
                arg7 = new int[v7];
                int v0;
                for(v0 = 0; v0 < 7; ++v0) {
                    int v2;
                    for(v2 = 0; v2 < dt.ae * -639990123; ++v2) {
                        dt v3 = gy.al(v2, 0xAC388800);
                        if(v3 != null && !v3.ai) {
                            int v4 = arg9 ? 7 : 0;
                            if(v4 + v0 != v3.an * -1720917433) {
                                goto label_31;
                            }

                            arg7[aj.af[v0]] = v2 + 0x100;
                            break;
                        }

                    label_31:
                    }
                }

            label_35:
                this.ax = arg7;
                this.al = arg8;
                this.ae = arg9;
                this.ar = arg10 * -2030490441;
                this.ap(982192606);
                return;
            }
            catch(RuntimeException v7_1) {
                StringBuilder v8 = new StringBuilder();
                v8.append("aj.ax(");
                v8.append(')');
                throw lx.al(((Throwable)v7_1), v8.toString());
            }
        }

        goto label_35;
    }

    public void ay(lq arg5) {
        int v1 = 0;
        int v0 = this.ae ? 1 : 0;
        arg5.ar(v0, 78);
        for(v0 = 0; v0 < 7; ++v0) {
            int v2 = this.ax[aj.af[v0]];
            if(v2 == 0) {
                arg5.ar(-1, 67);
            }
            else {
                arg5.ar(v2 - 0x100, 91);
            }
        }

        while(v1 < 5) {
            arg5.ar(this.al[v1], 0x7C);
            ++v1;
        }
    }

    public void az(boolean arg8) {
        if(arg8 == this.ae) {
            return;
        }

        this.ax(null, this.al, arg8, -1, 0xA6FBDCCB);
    }

    by ba() {
        int v4;
        if(-1 != this.ar * 0x4F17E80) {
            return au.al(this.ar * 0x4257107, 1).aj(-1992069499);
        }

        int v0 = 0;
        int v2 = 0;
        int v3 = 0;
        while(true) {
            v4 = 12;
            int v5 = 0x200;
            if(v2 >= v4) {
                break;
            }

            v4 = this.ax[v2];
            if(v4 >= 2019118173 && v4 < v5 && !gy.al(v4 - 0x100, 0xB3098B50).aj(-68)) {
                v3 = 1;
            }

            if(v4 >= 0x1B829523 && !client.al(v4 - 0x23FBA6E6, 0x589E9CB6).am(this.ae, 866705390)) {
                v3 = 1;
            }

            ++v2;
        }

        if(v3 != 0) {
            return null;
        }

        by[] v1 = new by[v4];
        v2 = 0;
        v3 = 0;
        while(v2 < v4) {
            int v6 = this.ax[v2];
            if(v6 >= 0x100 && v6 < v5) {
                by v7 = gy.al(v6 - 0x100, 0x78CCCA1).ad(-36);
                if(v7 != null) {
                    v1[v3] = v7;
                    ++v3;
                }
            }

            if(v6 >= v5) {
                by v6_1 = client.al(v6 - 0x200, 0x93091C7).az(this.ae, 54);
                if(v6_1 != null) {
                    v1[v3] = v6_1;
                    ++v3;
                }
            }

            ++v2;
        }

        by v2_1 = new by(v1, v3);
        while(v0 < 5) {
            if(this.al[v0] < aj.ad[v0].length) {
                v2_1.av(aj.aj[v0], aj.ad[v0][this.al[v0]]);
            }

            if(this.al[v0] < ab.ab[v0].length) {
                v2_1.av(py.aq[v0], ab.ab[v0][this.al[v0]]);
            }

            ++v0;
        }

        return v2_1;
    }

    public ca bd(df arg26, int arg27, df arg28, int arg29) {
        ca v10_2;
        ca v1_2;
        by v6_1;
        int v12;
        int v11;
        aj v0 = this;
        df v2 = arg26;
        df v4 = arg28;
        int v3 = 0x4257107;
        if(v0.ar * v3 != -1) {
            return au.al(v0.ar * v3, 1).ap(arg26, arg27, arg28, arg29, 0x54BC680);
        }

        long v8 = v0.an * 0x96C7B8201D43C51L;
        int[] v1 = v0.ax;
        v3 = 5;
        int v6 = 12;
        int v7 = 0;
        if(v2 != null) {
            v11 = 0x270867B5;
            v12 = 0x3EFAB985;
            if(v2.aa * v11 < 0 && v2.au * v12 < 0) {
                goto label_72;
            }

            v1 = new int[v6];
            int v10;
            for(v10 = 0; v10 < v6; ++v10) {
                v1[v10] = v0.ax[v10];
            }

            if(v2.aa * v11 >= 0) {
                v8 += ((long)(v2.aa * v11 - v0.ax[v3] << 40));
                v1[v3] = v2.aa * v11;
            }

            if(v2.au * v12 < 0) {
                goto label_72;
            }

            v8 += ((long)(v2.au * v12 - v0.ax[3] << 0x30));
            v1[3] = v2.au * v12;
        }

    label_72:
        mv v10_1 = aj.ai.ax(v8);
        if(v10_1 == null) {
            v11 = 0;
            v12 = 0;
            while(true) {
                int v13 = 0x100;
                int v14 = 0x200;
                if(v11 >= v6) {
                    break;
                }

                int v15 = v1[v11];
                int v5 = v15 < v13 || v15 >= v14 || (gy.al(v15 - 0x100, 0x3F974AE).an(1264018131)) ? v12 : 1;
                v12 = v15 < v14 || (client.al(v15 - 0x200, 0x5A16DD0C).aa(v0.ae, 0xDF)) ? v5 : 1;
                ++v11;
            }

            if(v12 != 0) {
                long v15_1 = 0x5A3A6F6060B14DDL;
                if(v0.ap * v15_1 != -1) {
                    v10_1 = aj.ai.ax(v0.ap * v15_1);
                }

                if(v10_1 != null) {
                    goto label_120;
                }

                return null;
            }

        label_120:
            if(v10_1 != null) {
                goto label_197;
            }

            by[] v5_1 = new by[v6];
            v10 = 0;
            v11 = 0;
            while(v10 < v6) {
                v12 = v1[v10];
                if(v12 >= v13 && v12 < v14) {
                    v6_1 = gy.al(v12 - 0x100, -1840924087).ap(0xDF918148);
                    if(v6_1 != null) {
                        v5_1[v11] = v6_1;
                        ++v11;
                    }
                }

                if(v12 >= v14) {
                    v6_1 = client.al(v12 - 0x200, 0xB89138F).au(v0.ae, 0x3619010D);
                    if(v6_1 != null) {
                        v5_1[v11] = v6_1;
                        ++v11;
                    }
                }

                ++v10;
                v6 = 12;
            }

            by v1_1 = new by(v5_1, v11);
            while(v7 < v3) {
                if(v0.al[v7] < aj.ad[v7].length) {
                    v1_1.av(aj.aj[v7], aj.ad[v7][v0.al[v7]]);
                }

                if(v0.al[v7] < ab.ab[v7].length) {
                    v1_1.av(py.aq[v7], ab.ab[v7][v0.al[v7]]);
                }

                ++v7;
            }

            v1_2 = v1_1.ay(0x40, 850, -30, -50, -30);
            aj.ai.ae(((mv)v1_2), v8);
            v0.ap = v8 * -7037264012933438603L;
            v10_2 = v1_2;
        }

    label_197:
        if(v2 == null && v4 == null) {
            return v10_2;
        }

        if(v2 != null && v4 != null) {
            v1_2 = arg26.aq(((mv)v10_2), arg27, arg28, arg29, 44);
        }
        else if(v2 != null) {
            v1_2 = v2.ap(v10_2, arg27, 0x892643F3);
        }
        else {
            v1_2 = v4.ap(v10_2, arg29, 0xADFFF012);
        }

        return v1_2;
    }

    by bf() {
        int v4;
        int v1 = 0x4257107;
        if(-1 != this.ar * v1) {
            return au.al(this.ar * v1, 1).aj(0xEA09D8B3);
        }

        int v0 = 0;
        v1 = 0;
        int v3 = 0;
        while(true) {
            v4 = 12;
            int v5 = 0x100;
            int v6 = 0x200;
            if(v1 >= v4) {
                break;
            }

            v4 = this.ax[v1];
            if(v4 >= v5 && v4 < v6 && !gy.al(v4 - 0x100, 0xED0CD8CC).aj(15)) {
                v3 = 1;
            }

            if(v4 >= v6 && !client.al(v4 - 0x200, 0x4983399C).am(this.ae, 0xFB4AC59)) {
                v3 = 1;
            }

            ++v1;
        }

        if(v3 != 0) {
            return null;
        }

        by[] v1_1 = new by[v4];
        int v2 = 0;
        v3 = 0;
        while(v2 < v4) {
            int v7 = this.ax[v2];
            if(v7 >= v5 && v7 < v6) {
                by v8 = gy.al(v7 - 0x100, 0x7BA0754B).ad(-37);
                if(v8 != null) {
                    v1_1[v3] = v8;
                    ++v3;
                }
            }

            if(v7 >= v6) {
                by v7_1 = client.al(v7 - 0x200, 1472875061).az(this.ae, -59);
                if(v7_1 != null) {
                    v1_1[v3] = v7_1;
                    ++v3;
                }
            }

            ++v2;
        }

        by v2_1 = new by(v1_1, v3);
        while(v0 < 5) {
            if(this.al[v0] < aj.ad[v0].length) {
                v2_1.av(aj.aj[v0], aj.ad[v0][this.al[v0]]);
            }

            if(this.al[v0] < ab.ab[v0].length) {
                v2_1.av(py.aq[v0], ab.ab[v0][this.al[v0]]);
            }

            ++v0;
        }

        return v2_1;
    }

    by bn() {
        int v4;
        int v1 = 0x4257107;
        if(-1 != this.ar * v1) {
            return au.al(this.ar * v1, 1).aj(-1852738603);
        }

        int v0 = 0;
        v1 = 0;
        int v3 = 0;
        while(true) {
            v4 = 12;
            int v5 = 0x100;
            int v6 = 0x200;
            if(v1 >= v4) {
                break;
            }

            v4 = this.ax[v1];
            if(v4 >= v5 && v4 < v6 && !gy.al(v4 - 0x100, 0xA9663353).aj(100)) {
                v3 = 1;
            }

            if(v4 >= v6 && !client.al(v4 - 0x200, 0x607E0982).am(this.ae, 24009656)) {
                v3 = 1;
            }

            ++v1;
        }

        if(v3 != 0) {
            return null;
        }

        by[] v1_1 = new by[v4];
        int v2 = 0;
        v3 = 0;
        while(v2 < v4) {
            int v7 = this.ax[v2];
            if(v7 >= v5 && v7 < v6) {
                by v8 = gy.al(v7 - 0x100, 0x51C361).ad(-80);
                if(v8 != null) {
                    v1_1[v3] = v8;
                    ++v3;
                }
            }

            if(v7 >= v6) {
                by v7_1 = client.al(v7 - 0x200, 10115494).az(this.ae, -6);
                if(v7_1 != null) {
                    v1_1[v3] = v7_1;
                    ++v3;
                }
            }

            ++v2;
        }

        by v2_1 = new by(v1_1, v3);
        while(v0 < 5) {
            if(this.al[v0] < aj.ad[v0].length) {
                v2_1.av(aj.aj[v0], aj.ad[v0][this.al[v0]]);
            }

            if(this.al[v0] < ab.ab[v0].length) {
                v2_1.av(py.aq[v0], ab.ab[v0][this.al[v0]]);
            }

            ++v0;
        }

        return v2_1;
    }

    public int bo() {
        int v1 = 0x4257107;
        if(-1 == this.ar * v1) {
            return (this.al[0] << 25) + (this.al[4] << 20) + (this.ax[0] << 15) + (this.ax[8] << 10) + (this.ax[11] << 5) + this.ax[1];
        }

        return au.al(this.ar * v1, 1).an * 0xE7F02CCF - 0x6044AD47;
    }

    by bp() {
        int v4;
        int v1 = 0x4257107;
        if(-1 != this.ar * v1) {
            return au.al(this.ar * v1, 1).aj(0xD164C72E);
        }

        int v0 = 0;
        v1 = 0;
        int v3 = 0;
        while(true) {
            v4 = 12;
            int v5 = 0x100;
            int v6 = 0x200;
            if(v1 >= v4) {
                break;
            }

            v4 = this.ax[v1];
            if(v4 >= v5 && v4 < v6 && !gy.al(v4 - 0x100, 0x7ED37325).aj(-10)) {
                v3 = 1;
            }

            if(v4 >= v6 && !client.al(v4 - 0x200, 500817154).am(this.ae, 0xB2BB2862)) {
                v3 = 1;
            }

            ++v1;
        }

        if(v3 != 0) {
            return null;
        }

        by[] v1_1 = new by[v4];
        int v2 = 0;
        v3 = 0;
        while(v2 < v4) {
            int v7 = this.ax[v2];
            if(v7 >= v5 && v7 < v6) {
                by v8 = gy.al(v7 - 0x100, 0x378776F1).ad(-20);
                if(v8 != null) {
                    v1_1[v3] = v8;
                    ++v3;
                }
            }

            if(v7 >= v6) {
                by v7_1 = client.al(v7 - 0x200, 0x4A568D31).az(this.ae, -18);
                if(v7_1 != null) {
                    v1_1[v3] = v7_1;
                    ++v3;
                }
            }

            ++v2;
        }

        by v2_1 = new by(v1_1, v3);
        while(v0 < 5) {
            if(this.al[v0] < aj.ad[v0].length) {
                v2_1.av(aj.aj[v0], aj.ad[v0][this.al[v0]]);
            }

            if(this.al[v0] < ab.ab[v0].length) {
                v2_1.av(py.aq[v0], ab.ab[v0][this.al[v0]]);
            }

            ++v0;
        }

        return v2_1;
    }

    public static void bq(Collection arg1) {
        arg1.add(aj.ai);
    }

    public static void bt(Collection arg1) {
        arg1.add(aj.ai);
    }

    public static void bv(Collection arg1) {
        arg1.add(aj.ai);
    }

    public int bw() {
        int v1 = 0x4257107;
        if(-1 == this.ar * v1) {
            return (this.al[0] << 25) + (this.al[4] << 20) + (this.ax[0] << 15) + (this.ax[8] << 10) + (this.ax[11] << 5) + this.ax[1];
        }

        return au.al(this.ar * v1, 1).an * 0x4C173D21 + 305419896;
    }

    public static void by(Collection arg1) {
        arg1.add(aj.ai);
    }
}

