import com.jagex.jagex3.client.input.softkeyboard.ar;

public class ey extends er {
    int ab;
    public static final int ad = 200;
    public fu af;
    final ml aq;
    static final int ba = 360;
    static final int bi = 14;
    static final int bp = 0x124013E;
    static ki db = null;
    static final int sa = 2000;
    protected static ls up;

    public ey(ml arg3) {
        int v0 = 400;
        try {
            super(v0);
            this.ab = 305063071;
            this.af = new fu();
            this.aq = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ey.<init>(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    static void ah(int[] arg4, byte[] arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v2;
        int v1;
        arg13 = -(arg9 >> 2);
        arg9 = -(arg9 & 3);
        arg10 = -arg10;
        while(true) {
            if(arg10 >= 0) {
                return;
            }

            int v0 = arg8;
            arg8 = arg7;
            arg7 = arg13;
            while(true) {
                if(arg7 >= 0) {
                    goto label_52;
                }

                v1 = arg8 + 1;
                try {
                    arg8 = arg5[arg8];
                    if(arg8 != 0) {
                        v2 = v0 + 1;
                        arg4[v0] = arg6[arg8 & 0xFF];
                    }
                    else {
                        v2 = v0 + 1;
                    }

                    arg8 = v1 + 1;
                    v0 = arg5[v1];
                    if(v0 != 0) {
                        v1 = v2 + 1;
                        arg4[v2] = arg6[v0 & 0xFF];
                    }
                    else {
                        v1 = v2 + 1;
                    }

                    v0 = arg8 + 1;
                    arg8 = arg5[arg8];
                    if(arg8 != 0) {
                        v2 = v1 + 1;
                        arg4[v1] = arg6[arg8 & 0xFF];
                    }
                    else {
                        v2 = v1 + 1;
                    }

                    arg8 = v0 + 1;
                    v0 = arg5[v0];
                    if(v0 != 0) {
                        arg4[v2] = arg6[v0 & 0xFF];
                        v0 = v2 + 1;
                    }
                    else {
                        v0 = v2 + 1;
                    }

                    ++arg7;
                    continue;
                label_52:
                    arg7 = arg9;
                    while(true) {
                    label_53:
                        if(arg7 >= 0) {
                            goto label_76;
                        }

                        v1 = arg8 + 1;
                        arg8 = arg5[arg8];
                        if(arg8 != 0) {
                            arg4[v0] = arg6[arg8 & 0xFF];
                            ++v0;
                        }
                        else {
                            break;
                        }

                        goto label_64;
                    }
                }
                catch(RuntimeException v4) {
                    goto label_67;
                }
            }

            ++v0;
        label_64:
            ++arg7;
            arg8 = v1;
            goto label_53;
        label_76:
            ++arg10;
            int v3 = arg8 + arg12;
            arg8 = v0 + arg11;
            arg7 = v3;
        }

    label_67:
        StringBuilder v5 = new StringBuilder();
        v5.append("ey.ah(");
        v5.append(')');
        throw lx.al(((Throwable)v4), v5.toString());
    }

    static void ao(int arg2) {
        int[] v2 = null;
        try {
            fe.ar = v2;
            lk.an = v2;
            fe.ap = v2;
            gu.aj = v2;
            jw.ad = v2;
            nq.aq = ((byte[][])v2);
            return;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ey.ao(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    eg at(int arg3) {
        try {
            return new ed();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ey.at(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static ar aw(int arg3) {
        try {
            ar v3_1 = client.al.aba(0x27E454A3).az(0, 0x3310F9D5);
            v3_1.as(hq.cg, 0, -1761209901);
            v3_1.as(hq.co, 1, -2047759909);
            return v3_1;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ey.aw(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    eg[] ay(int arg2, int arg3) {
        try {
            return new ed[arg2];
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ey.ay(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    eg cg() {
        return new ed();
    }

    eg[] co(int arg1) {
        return new ed[arg1];
    }

    static final void cp(int arg12) {
        int v8;
        int v7;
        int v6;
        arg12 = 158061037;
        try {
            int v0 = client.hr * arg12;
            arg12 = 0x90F3A969;
            int v1 = 1698507665;
            int v2 = -1;
            int v4 = 2;
            if(v0 == 0) {
                v6 = gu.jg.bp * 0x914F0683;
                v7 = gu.jg.bw * 0xD19D0C3D;
                v8 = 0xBD6EF571;
                int v10 = 0x438776D9;
                if(aq.hk * v8 - v6 < -500 || aq.hk * v8 - v6 > 500 || ma.hw * v10 - v7 < -500 || ma.hw * v10 - v7 > 500) {
                    aq.hk = v6 * v1;
                    ma.hw = v7 * arg12;
                }

                if(v6 != aq.hk * v8) {
                    aq.hk += (v6 - aq.hk * v8) / 16 * v1;
                }

                if(v7 != ma.hw * v10) {
                    ma.hw += (v7 - ma.hw * v10) / 16 * arg12;
                }

                arg12 = aq.hk * v8 >> 7;
                v0 = ma.hw * v10 >> 7;
                v1 = aq.hk * v8;
                v8 = 1101813865;
                v1 = fj.ez(v1, ma.hw * v10, kt.jz * v8, 0x7640D11A);
                if(arg12 <= 3 || v0 <= 3 || arg12 >= 100 || v0 >= 100) {
                    v7 = 0;
                }
                else {
                    v6 = arg12 - 4;
                    v7 = 0;
                    while(v6 <= arg12 + 4) {
                        int v9;
                        for(v9 = v0 - 4; v9 <= v0 + 4; ++v9) {
                            v10 = kt.jz * v8;
                            if(v10 < 3 && (id.al[1][v6][v9] & v4) == v4) {
                                ++v10;
                            }

                            v10 = v1 - id.ax[v10][v6][v9];
                            if(v10 > v7) {
                                v7 = v10;
                            }
                        }

                        ++v6;
                    }
                }

                v7 *= 0xC0;
                if(v7 > 0x17F00) {
                    v7 = 0x17F00;
                }

                if(v7 < 0x8000) {
                    v7 = 0x8000;
                }

                v0 = 0x2C7110CF;
                if(v7 > client.ia * v0) {
                    client.ia += (v7 - client.ia * v0) / 24 * 0x1D39F62F;
                }
                else if(v7 < client.ia * v0) {
                    client.ia += (v7 - client.ia * v0) / 80 * 0x1D39F62F;
                }

                co.hu = (fj.ez(gu.jg.bp * 0x914F0683, gu.jg.bw * 0xD19D0C3D, kt.jz * v8, 0x7640D11A) - client.hn * 0xB8D87B9F) * -2021117517;
            }
            else {
                if(client.hr * 158061037 != 1) {
                    goto label_351;
                }

                dy.it(68);
                v6 = 0x400;
                if(dt.bu.bm(33, 1140783000)) {
                    v0 = 0;
                }
                else if(dt.bu.bm(49, 0xBC4487EA)) {
                    v0 = 0x400;
                }
                else {
                    v0 = -1;
                }

                if(dt.bu.bm(0x30, 0x885769F1)) {
                    if(v0 == 0) {
                        v0 = 0x700;
                    }
                    else if(v0 == v6) {
                        v0 = 0x500;
                    }
                    else {
                        v0 = 0x600;
                    }
                }
                else if(dt.bu.bm(50, -643180930)) {
                    if(v0 == 0) {
                        v0 = 0x100;
                    }
                    else if(v0 == v6) {
                        v0 = 0x300;
                    }
                    else {
                        v0 = 0x200;
                    }
                }

                if(dt.bu.bm(35, 0x35BA0946)) {
                    v6 = -1;
                }
                else if(dt.bu.bm(51, 0x56BE538F)) {
                    v6 = 1;
                }
                else {
                    v6 = 0;
                }

                if(v0 >= 0 || v6 != 0) {
                    v8 = dt.bu.bm(81, 0x55A381F0) ? client.ha * -752605095 : client.hp * -516709001;
                    v7 = v8 * 16;
                    client.he = v0 * 0x45FAF7EF;
                    client.hl = v6 * 0xD8498B0F;
                }
                else {
                    v7 = 0;
                }

                v6 = -1400680029;
                if(client.ho * v6 < v7) {
                    client.ho += v7 / 8 * 605710859;
                    if(client.ho * v6 > v7) {
                        client.ho = v7 * 605710859;
                    }
                }
                else if(client.ho * v6 > v7) {
                    client.ho = client.ho * 0x109DDEBB / 10 * 605710859;
                }

                if(client.ho * v6 > 0) {
                    v0 = client.ho * v6 / 16;
                    if(client.he * 0xB94B170F >= 0) {
                        v6 = client.he * 0xB94B170F - it.hh * 2069602569 & 0x7FF;
                        v7 = bt.ag[v6];
                        v6 = bt.ah[v6];
                        aq.hk += v7 * v0 / 0x10000 * v1;
                        ma.hw += v6 * v0 / 0x10000 * arg12;
                    }

                    if(client.hl * 0x35EA03EF == 0) {
                        goto label_344;
                    }

                    co.hu += v0 * (client.hl * 0x35EA03EF) * -2021117517;
                    if(co.hu * 0x72F9E57B <= 0) {
                        goto label_344;
                    }

                    co.hu = 0;
                }
                else {
                    client.he = 0xBA050811;
                    client.hl = 0x27B674F1;
                }

            label_344:
                if(!dt.bu.bm(13, 0x558E1D43)) {
                    goto label_351;
                }

                em.ie(0x22F79EEA);
            }

        label_351:
            if(dt.bu.ax == ik.ai) {
                arg12 = dt.bu.ad[dt.bu.bk * 0xC52C3C11];
                v0 = dt.bu.aq[dt.bu.bk * 0xC52C3C11];
                v1 = v0 - client.hg * 1309142009;
                client.hf = 0xF7B80046 * v1;
                int v3 = 110945865;
                if(v1 != v2) {
                    if(v1 == 1) {
                    }
                    else {
                        v0 = (client.hg * 1309142009 + v0) / 2;
                    }
                }

                client.hg = v3 * v0;
                v1 = client.hs * 1100645957 - arg12;
                client.hm = 0x3FF27D1A * v1;
                v0 = 0x25EA9C8D;
                if(v1 != v2) {
                    if(v1 == 1) {
                    }
                    else {
                        arg12 = (arg12 + client.hs * 1100645957) / v4;
                    }
                }

                client.hs = v0 * arg12;
            }
            else {
                v0 = 0x9FF93E8D;
                if(dt.bu.bm(0x60, 0x2E179BF2)) {
                    client.hm += (-72 - client.hm * 0x60DB1CCF) / 4 * v0;
                }
                else if(dt.bu.bm(97, 394554802)) {
                    client.hm += (72 - client.hm * 0x60DB1CCF) / 4 * v0;
                }
                else {
                    client.hm = client.hm * 0xCAF3B445 / v4 * v0;
                }

                if(dt.bu.bm(98, 1511270608)) {
                    client.hf += (36 - client.hf * 0xDBF60EA1) / 4 * 0x7BDC0023;
                }
                else if(dt.bu.bm(99, 0xEFD9453A)) {
                    client.hf += (-36 - client.hf * 0xDBF60EA1) / 4 * 0x7BDC0023;
                }
                else {
                    client.hf = client.hf * 0xF3FCAF8B / v4 * 0x7BDC0023;
                }

                client.hg = dt.bu.aq[0] * 110945865;
                client.hs = dt.bu.ad[0] * 0x25EA9C8D;
            }

            client.ht = (client.hz * 0x3A8945D + client.ht * 0x62C4AE09 & 0x7FF) * -1915011015;
            client.hy += client.hx * 0xB3CD3491;
            client.hz = client.hm * 0xCAF3B445 / v4 * 0x3951DFF5;
            client.hx = client.hf * 0xF3FCAF8B / v4 * -2064719801;
            if(client.hy * 0x720F8187 < 0x80) {
                client.hy = 0x5B3A1B80;
            }

            if(client.hy * 0x720F8187 > 0x17F) {
                client.hy = 0x2F7DE49;
            }
        }
        catch(RuntimeException v12) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ey.cp(");
            v0_1.append(')');
            throw lx.al(((Throwable)v12), v0_1.toString());
        }
    }

    eg cq() {
        return new ed();
    }

    eg cu() {
        return new ed();
    }

    eg cv() {
        return new ed();
    }

    public boolean dc(ew arg1, boolean arg2, int arg3) {
        arg3 = -5603656;
        try {
            eg v1_1 = this.an(arg1, arg3);
            if(v1_1 == null) {
                return 0;
            }

            if(arg2) {
                if(((ed)v1_1).an * 0x297B4181 != 0) {
                    return 1;
                }

                return 0;
            }

            return 1;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ey.dc(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return 0;
    }

    public void df(lq arg13, int arg14) {
        int v10_1;
        ms v4_1;
        eg v0_1;
        boolean v7_1;
        boolean v8;
        int v6;
        int v5;
        ew v4;
        ew v3;
        do {
        label_0:
            if(arg13.ar * 0xF24F550B >= arg14) {
                goto label_134;
            }

            int v0 = arg13.ay(-85) == 1 ? 1 : 0;
            v3 = new ew(arg13.bn(-4), this.aq);
            v4 = new ew(arg13.bn(-105), this.aq);
            v5 = arg13.ao(0x683D2157);
            v6 = arg13.ay(-43);
            int v7 = arg13.ay(-82);
            v8 = (v7 & 2) != 0 ? true : false;
            v7_1 = (v7 & 1) != 0 ? true : false;
            if(v5 > 0) {
                arg13.bn(90);
                arg13.ay(-37);
                arg13.ac(42);
            }

            arg13.bn(66);
            if(!v3.al(0xF7685F32)) {
                goto label_131;
            }

            int v9 = 0xCB65D8C2;
            eg v10 = this.ap(v3, v9);
            if(v0 != 0) {
                v0_1 = this.ap(v4, v9);
                if(v0_1 == null) {
                    goto label_59;
                }
                else if(v0_1 == v10) {
                    goto label_59;
                }
                else if(v10 != null) {
                    this.aq(v0_1, 0x3E4B902B);
                    goto label_59;
                }
            }
            else {
            label_59:
                v0_1 = v10;
            }

            v9 = 0x297B4181;
            if(v0_1 != null) {
                this.aa(v0_1, v3, v4, 0xD18FF7B4);
                if(v5 != ((ed)v0_1).an * v9) {
                    v4_1 = this.af.al();
                    v10_1 = 1;
                    goto label_70;
                }
            }
            else {
                if(this.al(0xDA5EC131) >= 400) {
                    continue;
                }

                break;
            }

            goto label_100;
        }
        while(true);

        v0_1 = this.af(v3, v4, 0x89E2AEC8);
        goto label_100;
    label_131:
        throw new IllegalStateException();
    label_134:
        this.av(0x8F5D88E9);
        return;
    label_70:
        while(v4_1 != null) {
            if(((ea)v4_1).al.equals(v3)) {
                if(v5 != 0 && ((ea)v4_1).ae == 0) {
                    ((ea)v4_1).ax();
                }
                else if(v5 != 0) {
                    goto label_85;
                }
                else if(((ea)v4_1).ae != 0) {
                    ((ea)v4_1).ax();
                }
                else {
                    goto label_85;
                }

                v10_1 = 0;
            }

        label_85:
            v4_1 = this.af.ae();
        }

        if(v10_1 != 0) {
            this.af.ax(new ea(v3, v5));
        }

    label_100:
        if(((ed)v0_1).an * v9 != v5) {
            int v1 = this.ab + 305063071;
            this.ab = v1;
            ((ed)v0_1).ap = (v1 * 0x4DA5375F - 1) * 0x25A047B9;
            if(((ed)v0_1).an * v9 == -1 && v5 == 0) {
                ((ed)v0_1).ap = -((ed)v0_1).ap;
            }

            ((ed)v0_1).an = v5 * 0xF4E6FE81;
        }

        ((ed)v0_1).aj = v6 * 0x2D68935B;
        ((ed)v0_1).ax = v8;
        ((ed)v0_1).ar = v7_1;
        goto label_0;
    }

    eg[] dh(int arg1) {
        return new ed[arg1];
    }

    public void dj(lq arg12, int arg13, int arg14) {
        int v9_1;
        ms v4_1;
        eg v14_1;
        boolean v7_1;
        boolean v8;
        int v6;
        int v5;
        ew v4;
        ew v3;
        try {
            do {
            label_0:
                if(arg12.ar * 0xF24F550B >= arg13) {
                    goto label_133;
                }

                byte v14 = -69;
                int v0 = arg12.ay(v14) == 1 ? 1 : 0;
                v3 = new ew(arg12.bn(0x1F), this.aq);
                v4 = new ew(arg12.bn(-44), this.aq);
                v5 = arg12.ao(0xE5AFAEC1);
                v6 = arg12.ay(-2);
                int v7 = arg12.ay(-72);
                v8 = (v7 & 2) != 0 ? true : false;
                v7_1 = (v7 & 1) != 0 ? true : false;
                if(v5 > 0) {
                    arg12.bn(v14);
                    arg12.ay(-112);
                    arg12.ac(83);
                }

                arg12.bn(-23);
                if(!v3.al(-1051410875)) {
                    goto label_130;
                }

                arg14 = 0xCB65D8C2;
                eg v9 = this.ap(v3, arg14);
                if(v0 != 0) {
                    v14_1 = this.ap(v4, arg14);
                    if(v14_1 == null) {
                        goto label_58;
                    }
                    else if(v14_1 == v9) {
                        goto label_58;
                    }
                    else if(v9 != null) {
                        this.aq(v14_1, 0x6A640710);
                        goto label_58;
                    }
                }
                else {
                label_58:
                    v14_1 = v9;
                }

                v0 = 0x297B4181;
                if(v14_1 != null) {
                    this.aa(v14_1, v3, v4, 0xDFD876B0);
                    if(v5 != ((ed)v14_1).an * v0) {
                        v4_1 = this.af.al();
                        v9_1 = 1;
                        goto label_69;
                    }
                }
                else {
                    if(this.al(0x1AE0623) >= 400) {
                        continue;
                    }

                    break;
                }

                goto label_99;
            }
            while(true);

            v14_1 = this.af(v3, v4, 0x8181862E);
            goto label_99;
        label_130:
            throw new IllegalStateException();
        label_133:
            this.av(0x874F81DB);
            return;
        label_69:
            while(v4_1 != null) {
                if(((ea)v4_1).al.equals(v3)) {
                    if(v5 != 0 && ((ea)v4_1).ae == 0) {
                        ((ea)v4_1).ax();
                    }
                    else if(v5 != 0) {
                        goto label_84;
                    }
                    else if(((ea)v4_1).ae != 0) {
                        ((ea)v4_1).ax();
                    }
                    else {
                        goto label_84;
                    }

                    v9_1 = 0;
                }

            label_84:
                v4_1 = this.af.ae();
            }

            if(v9_1 != 0) {
                this.af.ax(new ea(v3, v5));
            }

        label_99:
            int v1 = ((ed)v14_1).an;
            if(v1 * v0 != v5) {
                v1 = this.ab + 305063071;
                this.ab = v1;
                ((ed)v14_1).ap = (v1 * 0x4DA5375F - 1) * 0x25A047B9;
                if(((ed)v14_1).an * v0 == -1 && v5 == 0) {
                    ((ed)v14_1).ap = -((ed)v14_1).ap;
                }

                ((ed)v14_1).an = v5 * 0xF4E6FE81;
            }

            ((ed)v14_1).aj = v6 * 0x2D68935B;
            ((ed)v14_1).ax = v8;
            ((ed)v14_1).ar = v7_1;
            goto label_0;
        }
        catch(RuntimeException v12) {
            StringBuilder v13 = new StringBuilder();
            v13.append("ey.dj(");
            v13.append(')');
            throw lx.al(((Throwable)v12), v13.toString());
        }
    }

    public void dl(lq arg13, int arg14) {
        int v10_1;
        ms v4_1;
        eg v0_1;
        boolean v7_1;
        boolean v8;
        int v6;
        int v5;
        ew v4;
        ew v3;
        do {
        label_0:
            if(arg13.ar * 0xF24F550B >= arg14) {
                goto label_134;
            }

            int v0 = arg13.ay(-34) == 1 ? 1 : 0;
            v3 = new ew(arg13.bn(-28), this.aq);
            v4 = new ew(arg13.bn(-3), this.aq);
            v5 = arg13.ao(0xCD12224B);
            v6 = arg13.ay(-20);
            int v7 = arg13.ay(-123);
            v8 = (v7 & 2) != 0 ? true : false;
            v7_1 = (v7 & 1) != 0 ? true : false;
            if(v5 > 0) {
                arg13.bn(92);
                arg13.ay(-99);
                arg13.ac(53);
            }

            arg13.bn(-93);
            if(!v3.al(0x604D845E)) {
                goto label_131;
            }

            int v9 = 0xCB65D8C2;
            eg v10 = this.ap(v3, v9);
            if(v0 != 0) {
                v0_1 = this.ap(v4, v9);
                if(v0_1 == null) {
                    goto label_59;
                }
                else if(v0_1 == v10) {
                    goto label_59;
                }
                else if(v10 != null) {
                    this.aq(v0_1, 341339018);
                    goto label_59;
                }
            }
            else {
            label_59:
                v0_1 = v10;
            }

            v9 = 0x297B4181;
            if(v0_1 != null) {
                this.aa(v0_1, v3, v4, 0x66F66BEE);
                if(v5 != ((ed)v0_1).an * v9) {
                    v4_1 = this.af.al();
                    v10_1 = 1;
                    goto label_70;
                }
            }
            else {
                if(this.al(0x54E6130A) >= 400) {
                    continue;
                }

                break;
            }

            goto label_100;
        }
        while(true);

        v0_1 = this.af(v3, v4, 0x856891F3);
        goto label_100;
    label_131:
        throw new IllegalStateException();
    label_134:
        this.av(0x8D55DD7F);
        return;
    label_70:
        while(v4_1 != null) {
            if(((ea)v4_1).al.equals(v3)) {
                if(v5 != 0 && ((ea)v4_1).ae == 0) {
                    ((ea)v4_1).ax();
                }
                else if(v5 != 0) {
                    goto label_85;
                }
                else if(((ea)v4_1).ae != 0) {
                    ((ea)v4_1).ax();
                }
                else {
                    goto label_85;
                }

                v10_1 = 0;
            }

        label_85:
            v4_1 = this.af.ae();
        }

        if(v10_1 != 0) {
            this.af.ax(new ea(v3, v5));
        }

    label_100:
        if(((ed)v0_1).an * v9 != v5) {
            int v1 = this.ab + 305063071;
            this.ab = v1;
            ((ed)v0_1).ap = (v1 * 0x4DA5375F - 1) * 0x25A047B9;
            if(((ed)v0_1).an * v9 == -1 && v5 == 0) {
                ((ed)v0_1).ap = -((ed)v0_1).ap;
            }

            ((ed)v0_1).an = v5 * 0xF4E6FE81;
        }

        ((ed)v0_1).aj = v6 * 0x2D68935B;
        ((ed)v0_1).ax = v8;
        ((ed)v0_1).ar = v7_1;
        goto label_0;
    }

    eg[] dp(int arg1) {
        return new ed[arg1];
    }

    public boolean ds(ew arg2, boolean arg3) {
        eg v2 = this.an(arg2, 0xE39C6B01);
        if(v2 == null) {
            return 0;
        }

        if((arg3) && ((ed)v2).an * -2073639292 == 0) {
            return 0;
        }

        return 1;
    }

    eg[] dv(int arg1) {
        return new ed[arg1];
    }

    eg[] dw(int arg1) {
        return new ed[arg1];
    }

    public boolean dy(ew arg2, boolean arg3) {
        eg v2 = this.an(arg2, 1170045876);
        if(v2 == null) {
            return 0;
        }

        if((arg3) && ((ed)v2).an * 0x297B4181 == 0) {
            return 0;
        }

        return 1;
    }

    static final void hc(ar arg9, int arg10) {
        arg10 = 0xD2D07C71;
        try {
            int v0 = arg9.ao * arg10;
            int v1 = 0xCD24B455;
            int v2 = 0xD0783D41;
            int v3 = 0xEC1259C5;
            int v4 = 0x83FB52C1;
            int v5 = -1245043057;
            int v6 = -1;
            if(324 == v0) {
                if(v6 == client.ru * v5) {
                    client.ru = arg9.cj * v4;
                    client.re = arg9.cd * v3;
                }

                arg9.cj = client.rf.ae ? client.ru * v2 : client.re * v1;
                return;
            }

            if(v0 == 325) {
                if(client.ru * v5 == v6) {
                    client.ru = arg9.cj * v4;
                    client.re = arg9.cd * v3;
                }

                arg9.cj = client.rf.ae ? client.re * v1 : client.ru * v2;
                return;
            }

            v1 = -1093904277;
            v2 = 0x6778A1C7;
            double v3_1 = 256;
            double v5_1 = 40;
            int v7 = -2077001153;
            int v8 = -1773073306;
            if(327 == v0) {
                arg9.cl = v8;
                arg9.ck = ((((int)(Math.sin((((double)(client.bj * v7))) / v5_1) * v3_1))) & 0x7FF) * v2;
                arg9.cp = v1;
                arg9.ci = 0;
                return;
            }

            if(328 != v0) {
                return;
            }

            arg9.cl = v8;
            arg9.ck = ((((int)(Math.sin((((double)(client.bj * v7))) / v5_1) * v3_1))) & 0x7FF) * v2;
            arg9.cp = v1;
            arg9.ci = 0x6015A63B;
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("ey.hc(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }
}

