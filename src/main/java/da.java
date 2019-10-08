import java.util.Collection;

public class da extends mv {
    int[] aa;
    public int ab;
    public String ad;
    public static int ae = 0;
    int ag;
    public dl ah;
    public String[] ai;
    int aj;
    static da[] al = null;
    int am;
    public final int an;
    public int ao;
    public int ap;
    public int aq;
    static gk ar = null;
    public dz at;
    int au;
    public String av;
    byte[] aw;
    static ko ax = null;
    int[] ay;
    int az;
    static ki df = null;
    static String ds = null;
    static final int qg = 5;

    static {
        da.ar = new gk(0x100, null);
    }

    da(int arg3) {
        try {
            super();
            this.ap = 152805867;
            this.aj = 0xA8453DB5;
            this.ab = 0;
            this.ai = new String[5];
            this.au = 0xB5F41B83;
            this.am = 0x3FA4DE8B;
            this.az = 0x80000000;
            this.ag = 0x80000000;
            this.ah = dl.al;
            this.at = dz.al;
            this.ao = 0x9AC5F41F;
            this.an = arg3 * 0x16A3F4FD;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("da.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static boolean aa(ko arg4, ko arg5) {
        da.ax = arg5;
        int v0 = 0;
        if(!arg4.ad(-98)) {
            return 0;
        }

        int v1 = 35;
        da.ae = arg4.au(v1, 0xF0E0C5F4) * 0xA2217FF9;
        da.al = new da[da.ae * 0xABC6EFF2];
        while(v0 < da.ae * 0x27CB1249) {
            byte[] v5 = arg4.ae(v1, v0, 0x78DC0DC9);
            da.al[v0] = new da(v0);
            if(v5 != null) {
                da.al[v0].ae(new lq(v5), 0x735F04ED);
                da.al[v0].an(0x7BE4080A);
            }

            ++v0;
        }

        return 1;
    }

    public static boolean ab(ko arg3, ko arg4) {
        da.ax = arg4;
        int v0 = 0;
        if(!arg3.ad(-104)) {
            return 0;
        }

        da.ae = arg3.au(0x135C47FF, 0x85002781) * 0xA2217FF9;
        da.al = new da[da.ae * 0x40C4F8CF];
        while(v0 < da.ae * 0x5B4A7BB) {
            byte[] v4 = arg3.ae(35, v0, 0x78DC0DC9);
            da.al[v0] = new da(v0);
            if(v4 != null) {
                da.al[v0].ae(new lq(v4), 0x735F04ED);
                da.al[v0].an(1051246967);
            }

            ++v0;
        }

        return 1;
    }

    public es ac(boolean arg2) {
        int v0 = arg2 ? this.aj * 0x8DA27763 : 0x6FB9813D * this.ap;
        return this.aj(v0, 84);
    }

    public int ad(byte arg3) {
        int v3 = 0x11F2C855;
        try {
            return this.an * v3;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("da.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    void ae(lq arg2, int arg3) {
        while(true) {
            byte v3 = -20;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.ar(arg2, arg3, 0x63F80626);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("da.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public static boolean af(ko arg3, ko arg4) {
        da.ax = arg4;
        int v0 = 0;
        if(!arg3.ad(-128)) {
            return 0;
        }

        da.ae = arg3.au(0xAC62410A, 748300231) * 0xA2217FF9;
        da.al = new da[da.ae * 0x27CB1249];
        while(v0 < da.ae * 0x2E05FEE0) {
            byte[] v4 = arg3.ae(35, v0, 0x78DC0DC9);
            da.al[v0] = new da(v0);
            if(v4 != null) {
                da.al[v0].ae(new lq(v4), 0x735F04ED);
                da.al[v0].an(0xE162FBFA);
            }

            ++v0;
        }

        return 1;
    }

    void ag(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-61);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 126058990);
        }
    }

    void ah(lq arg7, int arg8) {
        if(1 == arg8) {
            this.ap = arg7.bq(0xD0C5EA4E) * 0x890B65B;
        }
        else {
            int v1 = 2;
            if(v1 == arg8) {
                this.aj = arg7.bq(-1832598039) * -210844130;
            }
            else if(3 == arg8) {
                this.ad = arg7.bn(62);
            }
            else if(arg8 == 4) {
                this.aq = arg7.ak(0xC7ECBF1C) * -1909199659;
            }
            else if(arg8 == 5) {
                arg7.ak(0x9268F91);
            }
            else if(6 == arg8) {
                this.ab = arg7.ay(-102) * 0x18B3CB01;
            }
            else if(arg8 == 7) {
                arg7.ay(-74);
            }
            else if(arg8 == 8) {
                arg7.ay(-56);
            }
            else {
                v1 = 10;
                if(arg8 >= v1 && arg8 <= 14) {
                    this.ai[arg8 - v1] = arg7.bn(1);
                    return;
                }

                byte v2 = 85;
                if(arg8 == 15) {
                    arg8 = arg7.ay(-29);
                    int v0 = arg8 * 2;
                    this.aa = new int[v0];
                    v1 = 0;
                    int v3;
                    for(v3 = 0; v3 < v0; ++v3) {
                        this.aa[v3] = arg7.as(0x75DB9E7C);
                    }

                    arg7.ac(v2);
                    this.ay = new int[arg7.ay(-85)];
                    for(v0 = 0; v0 < this.ay.length; ++v0) {
                        this.ay[v0] = arg7.ac(88);
                    }

                    this.aw = new byte[arg8];
                    while(true) {
                        if(v1 >= arg8) {
                            return;
                        }

                        this.aw[v1] = arg7.aw(-1215098345);
                        ++v1;
                    }
                }

                if(arg8 == 16) {
                    return;
                }

                if(arg8 == 17) {
                    this.av = arg7.bn(1);
                    return;
                }

                if(18 == arg8) {
                    arg7.bq(-1420504135);
                    return;
                }

                if(19 == arg8) {
                    this.ao = arg7.ao(0xB7B566D9) * -1918414409;
                    return;
                }

                if(arg8 == 21) {
                    arg7.ac(0x7D);
                    return;
                }

                if(22 == arg8) {
                    arg7.ac(v2);
                    return;
                }

                if(arg8 == 23) {
                    arg7.ay(-121);
                    arg7.ay(-2);
                    arg7.ay(-107);
                    return;
                }

                if(24 == arg8) {
                    arg7.as(2072261789);
                    arg7.as(0x60CB0203);
                    return;
                }

                if(arg8 == 25) {
                    arg7.bq(0xAF7BA5CA);
                    return;
                }

                if(28 == arg8) {
                    arg7.ay(-81);
                    return;
                }

                byte v1_1 = -91;
                if(29 == arg8) {
                    this.ah = eh.ax(jl.al(0x37081216), arg7.ay(v1_1), 2006764861);
                    return;
                }

                if(arg8 != 30) {
                    return;
                }

                this.at = eh.ax(np.al(0x809DC6D9), arg7.ay(v1_1), 667290790);
            }
        }
    }

    public static boolean ai(ko arg3, ko arg4) {
        da.ax = arg4;
        int v0 = 0;
        if(!arg3.ad(-4)) {
            return 0;
        }

        da.ae = arg3.au(23302962, 0x76D771FF) * 0xA2217FF9;
        da.al = new da[da.ae * -910794980];
        while(v0 < da.ae * 0xF2EE0E12) {
            byte[] v4 = arg3.ae(35, v0, 0x78DC0DC9);
            da.al[v0] = new da(v0);
            if(v4 != null) {
                da.al[v0].ae(new lq(v4), 0x735F04ED);
                da.al[v0].an(0x6B431543);
            }

            ++v0;
        }

        return 1;
    }

    es aj(int arg5, byte arg6) {
        es v5_1;
        if(arg5 < 0) {
            return null;
        }

        try {
            long v0 = ((long)arg5);
            mv v6 = da.ar.ax(v0);
            if(v6 != null) {
                return ((es)v6);
            }

            v5_1 = ah.ap(da.ax, arg5, 0, -1565303959);
            if(v5_1 != null) {
                da.ar.ae(((mv)v5_1), v0);
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("da.aj(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }

        return v5_1;
    }

    public es ak(boolean arg2) {
        int v0 = arg2 ? this.aj * 0x8DA27763 : 0xA00710FE * this.ap;
        return this.aj(v0, 0x72);
    }

    void am(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-52);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, -992085020);
        }
    }

    void an(int arg5) {
        try {
            if(this.aa != null) {
                arg5 = 0;
                while(true) {
                label_3:
                    if(arg5 < this.aa.length) {
                        if(this.aa[arg5] < this.au * -1901087531) {
                            this.au = this.aa[arg5] * -905190275;
                        }
                        else if(this.aa[arg5] > this.az * 0x76E9F3A7) {
                            this.az = this.aa[arg5] * 0xA4FF8417;
                        }

                        int v1 = arg5 + 1;
                        if(this.aa[v1] < this.am * 1720837853) {
                            this.am = this.aa[v1] * 0x405B2175;
                        }
                        else if(this.aa[v1] > this.ag * -1810484003) {
                            this.ag = this.aa[v1] * 2010399605;
                        }

                        goto label_53;
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v5) {
            goto label_58;
        }

    label_53:
        arg5 += 2;
        goto label_3;
    label_58:
        StringBuilder v0 = new StringBuilder();
        v0.append("da.an(");
        v0.append(')');
        throw lx.al(((Throwable)v5), v0.toString());
    }

    void ao() {
        if(this.aa != null) {
            int v0;
            for(v0 = 0; v0 < this.aa.length; v0 += 2) {
                if(this.aa[v0] < this.au * 0x35E06235) {
                    this.au = this.aa[v0] * -905190275;
                }
                else if(this.aa[v0] > this.az * 0x76E9F3A7) {
                    this.az = this.aa[v0] * 0xA4FF8417;
                }

                int v2 = v0 + 1;
                if(this.aa[v2] < this.am * 0xAE0C53BC) {
                    this.am = this.aa[v2] * 0x2E723374;
                }
                else if(this.aa[v2] > this.ag * -1810484003) {
                    this.ag = this.aa[v2] * 0xEF653DAE;
                }
            }
        }
    }

    public es ap(boolean arg2, byte arg3) {
        if(arg2) {
            int v2 = 0x8DA27763;
            try {
                int v3 = this.aj * v2;
                goto label_10;
            label_7:
                v3 = 0x6FB9813D * this.ap;
            label_10:
                return this.aj(v3, 0x7F);
            label_6:
                goto label_13;
            }
            catch(RuntimeException v2_1) {
                goto label_6;
            }
        }
        else {
            goto label_7;
        }

        goto label_10;
    label_13:
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("da.ap(");
        v3_1.append(')');
        throw lx.al(((Throwable)v2_1), v3_1.toString());
    }

    public static void aq(Collection arg1, int arg2) {
        try {
            arg1.add(dt.ar);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("da.aq(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ar(lq arg5, int arg6, int arg7) {
        if(1 == arg6) {
            arg6 = 0xA84B8F76;
            try {
                this.ap = arg5.bq(arg6) * -152805867;
                return;
            label_10:
                if(2 == arg6) {
                    this.aj = arg5.bq(-148720434) * 0x57BAC24B;
                }
                else if(3 == arg6) {
                    this.ad = arg5.bn(-9);
                }
                else if(arg6 == 4) {
                    this.aq = arg5.ak(0xE9DB3066) * -1909199659;
                }
                else if(arg6 == 5) {
                    arg5.ak(0xA01DF682);
                }
                else if(6 == arg6) {
                    this.ab = arg5.ay(-48) * 0xD8B04101;
                }
                else if(arg6 == 7) {
                    arg5.ay(-63);
                }
                else if(arg6 == 8) {
                    arg5.ay(-10);
                }
                else {
                    byte v7 = 10;
                    if(arg6 >= v7 && arg6 <= 14) {
                        this.ai[arg6 - v7] = arg5.bn(-20);
                        return;
                    }

                    if(arg6 == 15) {
                        arg6 = arg5.ay(-25);
                        arg7 = arg6 * 2;
                        this.aa = new int[arg7];
                        int v0 = 0;
                        int v1;
                        for(v1 = 0; v1 < arg7; ++v1) {
                            this.aa[v1] = arg5.as(0x6A1E52F4);
                        }

                        arg5.ac(0x40);
                        this.ay = new int[arg5.ay(-87)];
                        for(arg7 = 0; arg7 < this.ay.length; ++arg7) {
                            this.ay[arg7] = arg5.ac(74);
                        }

                        this.aw = new byte[arg6];
                        while(true) {
                            if(v0 >= arg6) {
                                return;
                            }

                            this.aw[v0] = arg5.aw(-1215098345);
                            ++v0;
                        }
                    }

                    if(arg6 == 16) {
                        return;
                    }

                    byte v1_1 = 21;
                    if(arg6 == 17) {
                        this.av = arg5.bn(v1_1);
                        return;
                    }

                    if(18 == arg6) {
                        arg5.bq(0x8609FF3D);
                        return;
                    }

                    if(19 == arg6) {
                        this.ao = arg5.ao(0xE6C5ED3C) * 0x653A0BE1;
                        return;
                    }

                    if(arg6 == v1_1) {
                        arg5.ac(33);
                        return;
                    }

                    if(22 == arg6) {
                        arg5.ac(v7);
                        return;
                    }

                    if(arg6 == 23) {
                        arg5.ay(-59);
                        arg5.ay(-39);
                        arg5.ay(-93);
                        return;
                    }

                    if(24 == arg6) {
                        arg5.as(0x5D80566B);
                        arg5.as(0x63259F47);
                        return;
                    }

                    if(arg6 == 25) {
                        arg5.bq(0xD54ACE95);
                        return;
                    }

                    if(28 == arg6) {
                        arg5.ay(-1);
                        return;
                    }

                    if(29 == arg6) {
                        this.ah = eh.ax(jl.al(-289840669), arg5.ay(-46), 1840003886);
                        return;
                    }

                    if(arg6 != 30) {
                        return;
                    }

                    this.at = eh.ax(np.al(0xACCD84F1), arg5.ay(-108), 757629809);
                    return;
                label_9:
                    goto label_182;
                }
            }
            catch(RuntimeException v5) {
                goto label_9;
            }
        }
        else {
            goto label_10;
        label_182:
            StringBuilder v6 = new StringBuilder();
            v6.append("da.ar(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    void as() {
        if(this.aa != null) {
            int v0;
            for(v0 = 0; v0 < this.aa.length; v0 += 2) {
                if(this.aa[v0] < this.au * -1901087531) {
                    this.au = this.aa[v0] * -905190275;
                }
                else if(this.aa[v0] > this.az * 0x76E9F3A7) {
                    this.az = this.aa[v0] * 0xA4FF8417;
                }

                int v2 = v0 + 1;
                if(this.aa[v2] < this.am * 1720837853) {
                    this.am = this.aa[v2] * 0x405B2175;
                }
                else if(this.aa[v2] > this.ag * -1810484003) {
                    this.ag = this.aa[v2] * 2010399605;
                }
            }
        }
    }

    void at(lq arg6, int arg7) {
        if(1 == arg7) {
            this.ap = arg6.bq(-1727080646) * 0x248DBEBA;
        }
        else {
            int v0 = 2;
            if(v0 == arg7) {
                this.aj = arg6.bq(0x843D73C1) * 0x57BAC24B;
            }
            else if(3 == arg7) {
                this.ad = arg6.bn(-57);
            }
            else if(arg7 == 4) {
                this.aq = arg6.ak(0xD5C802A0) * 0xEAB80D03;
            }
            else if(arg7 == 5) {
                arg6.ak(0x259F986E);
            }
            else if(6 == arg7) {
                this.ab = arg6.ay(-1) * 0x7BF028BD;
            }
            else if(arg7 == 7) {
                arg6.ay(-81);
            }
            else if(arg7 == 8) {
                arg6.ay(-56);
            }
            else {
                v0 = 10;
                if(arg7 >= v0 && arg7 <= 14) {
                    this.ai[arg7 - v0] = arg6.bn(-53);
                    return;
                }

                if(arg7 == 15) {
                    arg7 = arg6.ay(-43);
                    v0 = arg7 * 2;
                    this.aa = new int[v0];
                    int v1 = 0;
                    int v2;
                    for(v2 = 0; v2 < v0; ++v2) {
                        this.aa[v2] = arg6.as(0x52E100B6);
                    }

                    arg6.ac(74);
                    this.ay = new int[arg6.ay(-70)];
                    for(v0 = 0; v0 < this.ay.length; ++v0) {
                        this.ay[v0] = arg6.ac(0x74);
                    }

                    this.aw = new byte[arg7];
                    while(true) {
                        if(v1 >= arg7) {
                            return;
                        }

                        this.aw[v1] = arg6.aw(-1215098345);
                        ++v1;
                    }
                }

                if(arg7 == 16) {
                    return;
                }

                if(arg7 == 17) {
                    this.av = arg6.bn(-27);
                    return;
                }

                if(18 == arg7) {
                    arg6.bq(0xAC99136B);
                    return;
                }

                if(19 == arg7) {
                    this.ao = arg6.ao(0x39DB20FF) * 0x653A0BE1;
                    return;
                }

                if(arg7 == 21) {
                    arg6.ac(72);
                    return;
                }

                if(22 == arg7) {
                    arg6.ac(0x7F);
                    return;
                }

                if(arg7 == 23) {
                    arg6.ay(-116);
                    arg6.ay(-41);
                    arg6.ay(-54);
                    return;
                }

                if(24 == arg7) {
                    arg6.as(1935071933);
                    arg6.as(1580873914);
                    return;
                }

                if(arg7 == 25) {
                    arg6.bq(0xBCB831E3);
                    return;
                }

                if(28 == arg7) {
                    arg6.ay(-104);
                    return;
                }

                if(29 == arg7) {
                    this.ah = eh.ax(jl.al(635978840), arg6.ay(-42), 0x4BF8B68E);
                    return;
                }

                if(arg7 != 30) {
                    return;
                }

                this.at = eh.ax(np.al(1425003539), arg6.ay(-115), 1322706104);
            }
        }
    }

    public static da au(int arg1) {
        if(arg1 >= 0 && arg1 < da.al.length && da.al[arg1] != null) {
            return da.al[arg1];
        }

        return new da(arg1);
    }

    public static boolean av(ko arg5, ko arg6) {
        da.ax = arg6;
        int v0 = 0;
        if(!arg5.ad(-110)) {
            return 0;
        }

        int v1 = 35;
        da.ae = arg5.au(v1, 0x6247DE5A) * 0xA2217FF9;
        int v2 = 0x27CB1249;
        da.al = new da[da.ae * v2];
        while(v0 < da.ae * v2) {
            byte[] v6 = arg5.ae(v1, v0, 0x78DC0DC9);
            da.al[v0] = new da(v0);
            if(v6 != null) {
                da.al[v0].ae(new lq(v6), 0x735F04ED);
                da.al[v0].an(-1912170907);
            }

            ++v0;
        }

        return 1;
    }

    void aw() {
        if(this.aa != null) {
            int v0;
            for(v0 = 0; v0 < this.aa.length; v0 += 2) {
                if(this.aa[v0] < this.au * -1901087531) {
                    this.au = this.aa[v0] * -905190275;
                }
                else if(this.aa[v0] > this.az * 0x76E9F3A7) {
                    this.az = this.aa[v0] * 0xA4FF8417;
                }

                int v2 = v0 + 1;
                if(this.aa[v2] < this.am * 1720837853) {
                    this.am = this.aa[v2] * 0x405B2175;
                }
                else if(this.aa[v2] > this.ag * -1810484003) {
                    this.ag = this.aa[v2] * 2010399605;
                }
            }
        }
    }

    void ay() {
        if(this.aa != null) {
            int v0;
            for(v0 = 0; v0 < this.aa.length; v0 += 2) {
                if(this.aa[v0] < this.au * -1901087531) {
                    this.au = this.aa[v0] * 0xB0E2643C;
                }
                else if(this.aa[v0] > this.az * 0x88DF08D2) {
                    this.az = this.aa[v0] * 0xA4FF8417;
                }

                int v2 = v0 + 1;
                if(this.aa[v2] < this.am * 0xB6BF2331) {
                    this.am = this.aa[v2] * 0x1A9D6B03;
                }
                else if(this.aa[v2] > this.ag * 0x55BD50F2) {
                    this.ag = this.aa[v2] * 0xD78DE1A2;
                }
            }
        }
    }

    void az(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-61);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x2D769E67);
        }
    }

    public es ba(boolean arg2) {
        int v0 = arg2 ? this.aj * 0x2AC79BE4 : 0x6FB9813D * this.ap;
        return this.aj(v0, 69);
    }

    public es bd(boolean arg2) {
        int v0 = arg2 ? this.aj * 0x8DA27763 : 0x6FB9813D * this.ap;
        return this.aj(v0, 0x72);
    }

    es bf(int arg6) {
        if(arg6 < 0) {
            return null;
        }

        long v1 = ((long)arg6);
        mv v0 = da.ar.ax(v1);
        if(v0 != null) {
            return ((es)v0);
        }

        es v6 = ah.ap(da.ax, arg6, 0, -1565303959);
        if(v6 != null) {
            da.ar.ae(((mv)v6), v1);
        }

        return v6;
    }

    es bn(int arg6) {
        if(arg6 < 0) {
            return null;
        }

        long v1 = ((long)arg6);
        mv v0 = da.ar.ax(v1);
        if(v0 != null) {
            return ((es)v0);
        }

        es v6 = ah.ap(da.ax, arg6, 0, -1565303959);
        if(v6 != null) {
            da.ar.ae(((mv)v6), v1);
        }

        return v6;
    }

    public int bo() {
        return this.an * 0x11F2C855;
    }

    es bp(int arg6) {
        if(arg6 < 0) {
            return null;
        }

        long v1 = ((long)arg6);
        mv v0 = da.ar.ax(v1);
        if(v0 != null) {
            return ((es)v0);
        }

        es v6 = ah.ap(da.ax, arg6, 0, -1565303959);
        if(v6 != null) {
            da.ar.ae(((mv)v6), v1);
        }

        return v6;
    }

    public static void bt(Collection arg1) {
        arg1.add(da.ar);
    }

    public static void bv(Collection arg1) {
        arg1.add(da.ar);
    }

    public int bw() {
        return this.an * 0x170DD4FA;
    }

    public static void by(Collection arg1) {
        arg1.add(da.ar);
    }
}

