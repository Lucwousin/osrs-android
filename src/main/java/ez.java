import java.util.Collection;

public class ez extends mv {
    public int aa;
    public int ab;
    public boolean ac;
    int[] ad;
    static gk ae;
    public int af;
    short[] ag;
    short[] ah;
    public int ai;
    public int aj;
    int ak;
    static ko al;
    public int am;
    public int an;
    public int ao;
    public String ap;
    int[] aq;
    static gk ar;
    int as;
    short[] at;
    public int au;
    public int av;
    public boolean aw;
    static ko ax;
    public String[] ay;
    short[] az;
    int ba;
    int bd;
    public int bf;
    public int bn;
    int bo;
    public int[] bp;
    oc bq;
    public boolean bt;
    public boolean bv;
    int bw;
    public boolean by;

    static {
        ez.ae = new gk(0x40, null);
        ez.ar = new gk(50, null);
    }

    ez() {
        try {
            super();
            this.ap = gs.aq;
            this.aj = 0x3FE0ECF1;
            this.ab = 0xBFB55671;
            this.af = -466375063;
            this.ai = 0x21878C6F;
            this.av = -365510073;
            this.aa = 0x759C07CB;
            this.au = 0x8077E1EB;
            this.am = 0x3893BEB;
            this.ay = new String[5];
            this.aw = true;
            this.ao = -421206577;
            this.as = 0xE9DECB80;
            this.ak = 0x9A293C80;
            this.ac = false;
            this.bd = 0;
            this.ba = 0;
            this.bf = 0xE0C906E5;
            this.bn = 0x33744FA0;
            this.bw = -1995260195;
            this.bo = -1259570797;
            this.by = true;
            this.bt = true;
            this.bv = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ez.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void aa(ko arg0, ko arg1) {
        ez.ax = arg0;
        ez.al = arg1;
    }

    public int ab(int arg2, int arg3, int arg4) {
        try {
            return bq.al(this.bq, arg2, arg3, 2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ez.ab(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final ez ac() {
        int v0;
        int v1 = 0x4572F68B;
        int v2 = -1;
        if(this.bw * v1 != v2) {
            v0 = of.ax(this.bw * v1, 0x3B3AF4A7);
        }
        else {
            v1 = 770536293;
            v0 = v2 != this.bo * v1 ? an.ae[this.bo * v1] : -1;
        }

        v0 = v0 < 0 || v0 >= this.bp.length - 1 ? this.bp[this.bp.length - 1] : this.bp[v0];
        if(v2 != v0) {
            return au.al(v0, 1);
        }

        return null;
    }

    public final ez ad(byte arg4) {
        int v4_1;
        try {
            int v0 = 0x4572F68B;
            int v1 = -1;
            if(this.bw * v0 != v1) {
                v4_1 = of.ax(this.bw * v0, 2115124902);
            }
            else {
                v0 = 770536293;
                v4_1 = v1 != this.bo * v0 ? an.ae[this.bo * v0] : -1;
            }

            v4_1 = v4_1 < 0 || v4_1 >= this.bp.length - 1 ? this.bp[this.bp.length - 1] : this.bp[v4_1];
            if(v1 == v4_1) {
                return null;
            }

            return au.al(v4_1, 1);
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ez.ad(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }

        return null;
    }

    void ae(byte arg1) {
    }

    public String af(int arg2, String arg3, int arg4) {
        try {
            return az.ae(this.bq, arg2, arg3, -107049639);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ez.af(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void ag() {
    }

    void ah(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-110);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, -87);
        }
    }

    public final by aj(int arg8) {
        by v0;
        try {
            v0 = null;
            if(this.bp != null) {
                ez v8_1 = this.ad(-1);
                if(v8_1 == null) {
                    return v0;
                }

                return v8_1.aj(0xE0F28464);
            }

            if(this.aq == null) {
                return v0;
            }

            arg8 = 0;
            int v1 = 0;
            int v2 = 0;
            while(v1 < this.aq.length) {
                if(!ez.al.an(this.aq[v1], 0, 0xAB3CF42)) {
                    v2 = 1;
                }

                ++v1;
            }

            if(v2 != 0) {
                return v0;
            }

            by[] v0_1 = new by[this.aq.length];
            for(v1 = 0; v1 < this.aq.length; ++v1) {
                v0_1[v1] = by.ax(ez.al, this.aq[v1], 0);
            }

            v0 = v0_1.length == 1 ? v0_1[0] : new by(v0_1, v0_1.length);
            if(this.az != null) {
                for(v1 = 0; v1 < this.az.length; ++v1) {
                    v0.av(this.az[v1], this.ag[v1]);
                }
            }

            if(this.ah != null) {
                while(arg8 < this.ah.length) {
                    v0.aa(this.ah[arg8], this.at[arg8]);
                    ++arg8;
                }
            }
        }
        catch(RuntimeException v8) {
            goto label_81;
        }

        return v0;
    label_81:
        StringBuilder v0_2 = new StringBuilder();
        v0_2.append("ez.aj(");
        v0_2.append(')');
        throw lx.al(((Throwable)v8), v0_2.toString());
    }

    public final ca ak(df arg12, int arg13, df arg14, int arg15) {
        ca v12;
        ca v0_2;
        int v0_1;
        ca v1 = null;
        if(this.bp != null) {
            ez v2 = this.ad(-1);
            if(v2 == null) {
                return v1;
            }

            return v2.ap(arg12, arg13, arg14, arg15, 0xA52F6497);
        }

        mv v0 = ez.ar.ax(((long)(this.an * 0x9988526B)));
        if(v0 == null) {
            v0_1 = 0;
            int v3 = 0;
            int v4 = 0;
            while(v3 < this.ad.length) {
                if(!ez.al.an(this.ad[v3], 0, 0xE3E58CCC)) {
                    v4 = 1;
                }

                ++v3;
            }

            if(v4 != 0) {
                return v1;
            }

            by[] v1_1 = new by[this.ad.length];
            for(v3 = 0; v3 < this.ad.length; ++v3) {
                v1_1[v3] = by.ax(ez.al, this.ad[v3], 0);
            }

            by v5 = 1 == v1_1.length ? v1_1[0] : new by(v1_1, v1_1.length);
            if(this.az != null) {
                int v1_2;
                for(v1_2 = 0; v1_2 < this.az.length; ++v1_2) {
                    v5.av(this.az[v1_2], this.ag[v1_2]);
                }
            }

            if(this.ah != null) {
                while(v0_1 < this.ah.length) {
                    v5.aa(this.ah[v0_1], this.at[v0_1]);
                    ++v0_1;
                }
            }

            v0_2 = v5.ay(this.bd * 709473881 - 1274425050, this.ba * 0x297E6725 - 1008310415, 0xC5023325, -50, 1038173318);
            ez.ar.ae(((mv)v0_2), ((long)(this.an * 1806804396)));
        }

        mv v6 = ((mv)v0_2);
        if(arg12 != null && arg14 != null) {
            v12 = arg12.aq(((ca)v6), arg13, arg14, arg15, 67);
        }
        else if(arg12 != null) {
            v12 = arg12.ap(((ca)v6), arg13, -1506139432);
        }
        else if(arg14 != null) {
            v12 = arg14.ap(((ca)v6), arg15, -1907117589);
        }
        else {
            v12 = ((ca)v6).al(true);
        }

        int v14 = 1544720935;
        arg15 = 0x8EFD77C9;
        v0_1 = 0x80;
        if(this.as * v14 != v0_1 || v0_1 != this.ak * arg15) {
            v12.ag(this.as * v14, this.ak * arg15, this.as * 0xAF8DC32E);
        }

        return v12;
    }

    public static ez am(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = ez.ae.ax(v1);
        if(v0 != null) {
            return ((ez)v0);
        }

        byte[] v0_1 = ez.ax.ae(9, arg5, 0x78DC0DC9);
        ez v3 = new ez();
        v3.an = arg5 * 0x4F1486E1;
        if(v0_1 != null) {
            v3.ar(new lq(v0_1), 1000);
        }

        v3.ae(4);
        ez.ae.ae(((mv)v3), v1);
        return v3;
    }

    void an(lq arg8, int arg9, byte arg10) {
        char v10 = ')';
        int v0 = 0;
        if(1 == arg9) {
            byte v9 = -69;
            try {
                arg9 = arg8.ay(v9);
                this.ad = new int[arg9];
                while(true) {
                    if(v0 < arg9) {
                        this.ad[v0] = arg8.ao(0xAD50EF5D);
                        ++v0;
                        continue;
                    }

                    return;
                }

            label_17:
                if(2 == arg9) {
                    this.ap = arg8.bn(46);
                }
                else if(arg9 == 12) {
                    this.aj = arg8.ay(-104) * 0x3FE0ECF1;
                }
                else if(arg9 == 13) {
                    this.ab = arg8.ao(36709089) * 0x404AA98F;
                }
                else {
                    int v3 = 365510073;
                    if(14 == arg9) {
                        this.av = arg8.ao(0x3F8CF1EA) * v3;
                    }
                    else if(15 == arg9) {
                        this.af = arg8.ao(0x6C1E9B2F) * 466375063;
                    }
                    else if(arg9 == 16) {
                        this.ai = arg8.ao(0x8614CEF7) * 0xDE787391;
                    }
                    else if(17 == arg9) {
                        this.av = arg8.ao(-1198643025) * v3;
                        this.aa = arg8.ao(0xA13EED39) * 0x8A63F835;
                        this.au = arg8.ao(0x183002B8) * 0x7F881E15;
                        this.am = arg8.ao(573787003) * 0xFC76C415;
                    }
                    else {
                        int v2 = 30;
                        if(arg9 >= v2 && arg9 < 35) {
                            arg9 -= v2;
                            this.ay[arg9] = arg8.bn(65);
                            if(this.ay[arg9].equalsIgnoreCase(gs.ar)) {
                                this.ay[arg9] = null;
                            }
                            else {
                            }

                            return;
                        }

                        if(40 == arg9) {
                            arg9 = arg8.ay(-120);
                            this.az = new short[arg9];
                            this.ag = new short[arg9];
                            while(true) {
                                if(v0 >= arg9) {
                                    return;
                                }

                                this.az[v0] = ((short)arg8.ao(-1911900740));
                                this.ag[v0] = ((short)arg8.ao(0x6FC971D7));
                                ++v0;
                            }
                        }

                        if(v10 == arg9) {
                            arg9 = arg8.ay(-75);
                            this.ah = new short[arg9];
                            this.at = new short[arg9];
                            while(true) {
                                if(v0 >= arg9) {
                                    return;
                                }

                                this.ah[v0] = ((short)arg8.ao(0x90DA7D32));
                                this.at[v0] = ((short)arg8.ao(0x31D89BF8));
                                ++v0;
                            }
                        }

                        if(60 == arg9) {
                            arg9 = arg8.ay(-4);
                            this.aq = new int[arg9];
                            while(true) {
                                if(v0 >= arg9) {
                                    return;
                                }

                                this.aq[v0] = arg8.ao(1807674516);
                                ++v0;
                            }
                        }

                        if(93 == arg9) {
                            this.aw = false;
                            return;
                        }

                        if(0x5F == arg9) {
                            this.ao = arg8.ao(0xC8940D06) * 421206577;
                            return;
                        }

                        if(arg9 == 97) {
                            this.as = arg8.ao(0x5658806B) * 0x73D3BD97;
                            return;
                        }

                        if(98 == arg9) {
                            this.ak = arg8.ao(590537060) * 1026839161;
                            return;
                        }

                        if(99 == arg9) {
                            this.ac = true;
                            return;
                        }

                        v3 = -1215098345;
                        if(100 == arg9) {
                            this.bd = arg8.aw(v3) * -406058563;
                            return;
                        }

                        if(101 == arg9) {
                            this.ba = arg8.aw(v3) * 0xA6A4CF61;
                            return;
                        }

                        if(102 == arg9) {
                            this.bf = arg8.ao(-1579653906) * 0x1F36F91B;
                            return;
                        }

                        if(103 == arg9) {
                            this.bn = arg8.ao(-1870904800) * -1986289027;
                            return;
                        }

                        v3 = 0x76;
                        if(arg9 != 106) {
                            if(v3 == arg9) {
                            }
                            else if(arg9 == 107) {
                                this.by = false;
                                return;
                            }
                            else if(arg9 == 109) {
                                this.bt = false;
                                return;
                            }
                            else {
                                if(arg9 == 0x6F) {
                                    this.bv = true;
                                }
                                else if(0xF9 == arg9) {
                                    this.bq = cn.ax(arg8, this.bq, 0x76D2F31E);
                                }
                                else {
                                }

                                return;
                            }
                        }

                        this.bw = arg8.ao(0xF0165DEA) * 1995260195;
                        v2 = 0xFFFF;
                        if(this.bw * 0x4572F68B == v2) {
                            this.bw = -1995260195;
                        }

                        this.bo = arg8.ao(-599584200) * 1259570797;
                        if(this.bo * 770536293 == v2) {
                            this.bo = -1259570797;
                        }

                        int v4 = -1;
                        if(v3 == arg9) {
                            arg9 = arg8.ao(0xB10B6AB1);
                            if(v2 == arg9) {
                                goto label_272;
                            }
                        }
                        else {
                        label_272:
                            arg9 = -1;
                        }

                        v3 = arg8.ay(-62);
                        this.bp = new int[v3 + 2];
                        while(v0 <= v3) {
                            this.bp[v0] = arg8.ao(0x1F2E1143);
                            if(v2 == this.bp[v0]) {
                                this.bp[v0] = v4;
                            }

                            ++v0;
                        }

                        this.bp[v3 + 1] = arg9;
                    }
                }
            }
            catch(RuntimeException v8) {
                goto label_294;
            }
        }
        else {
            goto label_17;
        }

        return;
    label_294:
        StringBuilder v9_1 = new StringBuilder();
        v9_1.append("ez.an(");
        v9_1.append(v10);
        throw lx.al(((Throwable)v8), v9_1.toString());
    }

    void ao(lq arg7, int arg8) {
        int v0 = 0;
        if(1 == arg8) {
            arg8 = arg7.ay(-64);
            this.ad = new int[arg8];
            while(v0 < arg8) {
                this.ad[v0] = arg7.ao(-2096052257);
                ++v0;
            }
        }
        else if(2 == arg8) {
            this.ap = arg7.bn(-71);
        }
        else if(arg8 == 12) {
            this.aj = arg7.ay(-86) * 0xF5619005;
        }
        else if(arg8 == 13) {
            this.ab = arg7.ao(0xA7F76F13) * 0xBBE5EDD0;
        }
        else if(14 == arg8) {
            this.av = arg7.ao(0xDF6BCA9) * 365510073;
        }
        else if(15 == arg8) {
            this.af = arg7.ao(-1701100078) * 1170394016;
        }
        else if(arg8 == 16) {
            this.ai = arg7.ao(0xC558F05C) * 0xDE787391;
        }
        else if(17 == arg8) {
            this.av = arg7.ao(0x734D909E) * 0x9D2F3960;
            this.aa = arg7.ao(0x192CAECB) * 0xE2960AAE;
            this.au = arg7.ao(0x685BD9B0) * 0x7F881E15;
            this.am = arg7.ao(-508543302) * 0x500C77AA;
        }
        else {
            int v2 = 30;
            if(arg8 >= v2 && arg8 < 35) {
                arg8 -= v2;
                this.ay[arg8] = arg7.bn(-68);
                if(this.ay[arg8].equalsIgnoreCase(gs.ar)) {
                    this.ay[arg8] = null;
                }
                else {
                }

                return;
            }

            if(40 == arg8) {
                arg8 = arg7.ay(-106);
                this.az = new short[arg8];
                this.ag = new short[arg8];
                while(true) {
                    if(v0 >= arg8) {
                        return;
                    }

                    this.az[v0] = ((short)arg7.ao(0xD51FEDAB));
                    this.ag[v0] = ((short)arg7.ao(0xD6E1039D));
                    ++v0;
                }
            }

            if(0x3AB89801 == arg8) {
                arg8 = arg7.ay(-128);
                this.ah = new short[arg8];
                this.at = new short[arg8];
                while(true) {
                    if(v0 >= arg8) {
                        return;
                    }

                    this.ah[v0] = ((short)arg7.ao(0x33F7907D));
                    this.at[v0] = ((short)arg7.ao(0x576BFABB));
                    ++v0;
                }
            }

            if(0xA7310BF3 == arg8) {
                arg8 = arg7.ay(-30);
                this.aq = new int[arg8];
                while(true) {
                    if(v0 >= arg8) {
                        return;
                    }

                    this.aq[v0] = arg7.ao(0x2E775F7B);
                    ++v0;
                }
            }

            if(93 == arg8) {
                this.aw = false;
                return;
            }

            if(0x5F == arg8) {
                this.ao = arg7.ao(0xD32EECC5) * 421206577;
                return;
            }

            if(arg8 == 0x12080F7E) {
                this.as = arg7.ao(0xDEAC24DE) * 0xEA30A2B6;
                return;
            }

            if(98 == arg8) {
                this.ak = arg7.ao(0xA1E0CAB4) * 1026839161;
                return;
            }

            if(99 == arg8) {
                this.ac = true;
                return;
            }

            int v3 = -1215098345;
            if(0xEF08DD40 == arg8) {
                this.bd = arg7.aw(v3) * -2025503470;
                return;
            }

            if(0xEC326FF3 == arg8) {
                this.ba = arg7.aw(v3) * 0xBD490127;
                return;
            }

            if(0x383DAAA0 == arg8) {
                this.bf = arg7.ao(0xCB159C51) * 0x74CD76CA;
                return;
            }

            if(0x212E23B3 == arg8) {
                this.bn = arg7.ao(1499743105) * 0x6F2842CA;
                return;
            }

            if(arg8 != 0xFB30ADCD) {
                if(1035903793 == arg8) {
                }
                else if(arg8 == 1043683378) {
                    this.by = false;
                    return;
                }
                else if(arg8 == 109) {
                    this.bt = false;
                    return;
                }
                else {
                    if(arg8 == 0x75B1B1C0) {
                        this.bv = true;
                    }
                    else if(0xB4265D19 == arg8) {
                        this.bq = cn.ax(arg7, this.bq, 531829300);
                    }
                    else {
                    }

                    return;
                }
            }

            this.bw = arg7.ao(0xF9D2E2FE) * 0x5650E422;
            if(this.bw * 0x4572F68B == 0xBF1AAC90) {
                this.bw = -1995260195;
            }

            this.bo = arg7.ao(0x55F77A63) * -1303900281;
            if(this.bo * 770536293 == 0xFFFF) {
                this.bo = 0x92158DF2;
            }

            v3 = -1;
            if(0x76 == arg8) {
                arg8 = arg7.ao(0xA4E10264);
                if(0xE19A6601 == arg8) {
                    goto label_274;
                }
            }
            else {
            label_274:
                arg8 = -1;
            }

            v2 = arg7.ay(-102);
            this.bp = new int[v2 + 2];
            while(v0 <= v2) {
                this.bp[v0] = arg7.ao(0xA5795696);
                if(0x72649AFE == this.bp[v0]) {
                    this.bp[v0] = v3;
                }

                ++v0;
            }

            this.bp[v2 + 1] = arg8;
        }
    }

    public final ca ap(df arg16, int arg17, df arg18, int arg19, int arg20) {
        ca v0_2;
        ez v1 = this;
        df v0 = arg16;
        df v5 = arg18;
        try {
            ca v3 = null;
            if(v1.bp != null) {
                ez v2 = this.ad(-1);
                if(v2 == null) {
                    return v3;
                }

                return v2.ap(arg16, arg17, arg18, arg19, -355257707);
            }

            int v6 = 0x4C173D21;
            mv v2_1 = ez.ar.ax(((long)(v1.an * v6)));
            if(v2_1 == null) {
                int v2_2 = 0;
                int v7 = 0;
                int v8 = 0;
                while(v7 < v1.ad.length) {
                    if(!ez.al.an(v1.ad[v7], 0, 0xF51EA072)) {
                        v8 = 1;
                    }

                    ++v7;
                }

                if(v8 != 0) {
                    return v3;
                }

                by[] v3_1 = new by[v1.ad.length];
                for(v7 = 0; v7 < v1.ad.length; ++v7) {
                    v3_1[v7] = by.ax(ez.al, v1.ad[v7], 0);
                }

                by v9 = 1 == v3_1.length ? v3_1[0] : new by(v3_1, v3_1.length);
                if(v1.az != null) {
                    int v3_2;
                    for(v3_2 = 0; v3_2 < v1.az.length; ++v3_2) {
                        v9.av(v1.az[v3_2], v1.ag[v3_2]);
                    }
                }

                if(v1.ah != null) {
                    while(v2_2 < v1.ah.length) {
                        v9.aa(v1.ah[v2_2], v1.at[v2_2]);
                        ++v2_2;
                    }
                }

                ca v2_3 = v9.ay(v1.bd * -327911019 + 0x40, v1.ba * 0x297E6725 + 850, -30, -50, -30);
                ez.ar.ae(((mv)v2_3), ((long)(v1.an * v6)));
            }

            mv v3_3 = v2_1;
            if(v0 != null && v5 != null) {
                v0_2 = arg16.aq(((ca)v3_3), arg17, arg18, arg19, 78);
            }
            else if(v0 != null) {
                v0_2 = v0.ap(((ca)v3_3), arg17, -2009702822);
            }
            else if(v5 != null) {
                v0_2 = v5.ap(((ca)v3_3), arg19, 0xADBACAF8);
            }
            else {
                v0_2 = ((ca)v3_3).al(true);
            }

            v3_2 = 1544720935;
            int v4 = 0x8EFD77C9;
            int v5_1 = 0x80;
            if(v1.as * v3_2 != v5_1 || v5_1 != v1.ak * v4) {
                v0_2.ag(v1.as * v3_2, v1.ak * v4, v1.as * v3_2);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_4 = new StringBuilder();
            v2_4.append("ez.ap(");
            v2_4.append(')');
            throw lx.al(((Throwable)v0_1), v2_4.toString());
        }

        return v0_2;
    }

    public boolean aq(int arg5) {
        boolean v0;
        try {
            v0 = true;
            if(this.bp == null) {
                return 1;
            }

            int v1 = 0x4572F68B;
            int v2 = -1;
            if(v2 != this.bw * v1) {
                arg5 = of.ax(this.bw * v1, 1022708582);
            }
            else {
                v1 = 770536293;
                arg5 = this.bo * v1 != v2 ? an.ae[this.bo * v1] : -1;
            }

            if(arg5 >= 0) {
                if(arg5 >= this.bp.length) {
                }
                else {
                    if(this.bp[arg5] != v2) {
                    }
                    else {
                        v0 = false;
                    }

                    return v0;
                }
            }

            if(v2 == this.bp[this.bp.length - 1]) {
                return false;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ez.aq(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return v0;
    }

    void ar(lq arg2, short arg3) {
        while(true) {
            byte v3 = -34;
            try {
                int v3_1 = arg2.ay(v3);
                if(v3_1 == 0) {
                    return;
                }

                this.an(arg2, v3_1, -74);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_2 = new StringBuilder();
                v3_2.append("ez.ar(");
                v3_2.append(')');
                throw lx.al(((Throwable)v2), v3_2.toString());
            }
        }
    }

    public final ca as(df arg16, int arg17, df arg18, int arg19) {
        ca v1_3;
        ez v0 = this;
        df v2 = arg16;
        df v4 = arg18;
        ca v3 = null;
        if(v0.bp != null) {
            ez v1 = this.ad(-1);
            if(v1 == null) {
                return v3;
            }

            return v1.ap(arg16, arg17, arg18, arg19, 0xEDE85F9F);
        }

        int v6 = 0x4C173D21;
        mv v1_1 = ez.ar.ax(((long)(v0.an * v6)));
        if(v1_1 == null) {
            int v1_2 = 0;
            int v7 = 0;
            int v8 = 0;
            while(v7 < v0.ad.length) {
                if(!ez.al.an(v0.ad[v7], 0, -160787222)) {
                    v8 = 1;
                }

                ++v7;
            }

            if(v8 != 0) {
                return v3;
            }

            by[] v3_1 = new by[v0.ad.length];
            for(v7 = 0; v7 < v0.ad.length; ++v7) {
                v3_1[v7] = by.ax(ez.al, v0.ad[v7], 0);
            }

            by v9 = 1 == v3_1.length ? v3_1[0] : new by(v3_1, v3_1.length);
            if(v0.az != null) {
                int v3_2;
                for(v3_2 = 0; v3_2 < v0.az.length; ++v3_2) {
                    v9.av(v0.az[v3_2], v0.ag[v3_2]);
                }
            }

            if(v0.ah != null) {
                while(v1_2 < v0.ah.length) {
                    v9.aa(v0.ah[v1_2], v0.at[v1_2]);
                    ++v1_2;
                }
            }

            v1_3 = v9.ay(v0.bd * -327911019 + 0x40, v0.ba * 0x297E6725 + 850, -30, -50, -30);
            ez.ar.ae(((mv)v1_3), ((long)(v0.an * v6)));
        }

        mv v3_3 = v1_1;
        if(v2 != null && v4 != null) {
            v1_3 = arg16.aq(v3_3, arg17, arg18, arg19, 0x3F);
        }
        else if(v2 != null) {
            v1_3 = v2.ap(((ca)v3_3), arg17, -970889148);
        }
        else if(v4 != null) {
            v1_3 = v4.ap(((ca)v3_3), arg19, 0xAC9FC86A);
        }
        else {
            v1_3 = ((ca)v3_3).al(true);
        }

        v3_2 = 1544720935;
        int v4_1 = 0x8EFD77C9;
        int v5 = 0x80;
        if(v0.as * v3_2 != v5 || v5 != v0.ak * v4_1) {
            v1_3.ag(v0.as * v3_2, v0.ak * v4_1, v0.as * v3_2);
        }

        return v1_3;
    }

    void at(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-72);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, -53);
        }
    }

    public static ez au(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = ez.ae.ax(v1);
        if(v0 != null) {
            return ((ez)v0);
        }

        byte[] v0_1 = ez.ax.ae(9, arg5, 0x78DC0DC9);
        ez v3 = new ez();
        v3.an = arg5 * 0x4F1486E1;
        if(v0_1 != null) {
            v3.ar(new lq(v0_1), 1000);
        }

        v3.ae(4);
        ez.ae.ae(((mv)v3), v1);
        return v3;
    }

    public static void av(ko arg0, ko arg1) {
        ez.ax = arg0;
        ez.al = arg1;
    }

    void aw(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-49);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, -61);
        }
    }

    static int ax(int arg5, int arg6, int arg7) {
        arg7 = 0xF641B2B4;
        try {
            ek v5_1 = dz.al(arg5, arg7);
            if(v5_1 == null) {
                return arg6;
            }

            int v0 = 0x7EE2C7F5;
            int v1 = 0xFF000000;
            if(v5_1.aj * v0 >= 0) {
                return v5_1.aj * v0 | v1;
            }

            v0 = 0x226A2F5D;
            int v2 = 0x4099BA09;
            int v3 = 0x60;
            if(v5_1.an * v0 >= 0) {
                return bt.aa[id.al(ii.au.ar(v5_1.an * v0, 0xB6DE3AA2), v3, v2)] | v1;
            }

            if(0xFF00FF == v5_1.ar * 0x670C51A7) {
                return arg6;
            }

            return bt.aa[id.al(ao.ae(v5_1.ad * 0x4430E1EF, v5_1.aq * -2044927721, v5_1.ab * 0x703C4331, 0xC5698FDB), v3, v2)] | v1;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("ez.ax(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    void ay(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-62);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, -77);
        }
    }

    static void az(int[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        for(arg7 = -arg7; true; ++arg7) {
            if(arg7 >= 0) {
                return;
            }

            arg10 = arg5 + arg6 - 3;
            while(true) {
                if(arg5 >= arg10) {
                    goto label_24;
                }

                int v0 = arg5 + 1;
                int v1 = arg4 + 1;
                try {
                    arg2[arg5] = arg3[arg4];
                    arg4 = v0 + 1;
                    arg5 = v1 + 1;
                    arg2[v0] = arg3[v1];
                    v0 = arg4 + 1;
                    v1 = arg5 + 1;
                    arg2[arg4] = arg3[arg5];
                    arg5 = v0 + 1;
                    arg4 = v1 + 1;
                    arg2[v0] = arg3[v1];
                    continue;
                label_24:
                    arg10 += 3;
                    while(arg5 < arg10) {
                        arg2[arg5] = arg3[arg4];
                        ++arg5;
                        ++arg4;
                    }
                }
                catch(RuntimeException v2) {
                    goto label_33;
                }
            }

            arg5 += arg8;
            arg4 += arg9;
        }

    label_33:
        StringBuilder v3 = new StringBuilder();
        v3.append("ez.az(");
        v3.append(')');
        throw lx.al(((Throwable)v2), v3.toString());
    }

    void az() {
    }

    public final ez ba() {
        int v0;
        int v1 = -1;
        if(this.bw * 0x2872088E != v1) {
            v0 = of.ax(this.bw * 0xB6C04503, 0x56F1E293);
        }
        else if(v1 != this.bo * 1043213987) {
            v0 = an.ae[this.bo * 770536293];
        }
        else {
            v0 = -1;
        }

        v0 = v0 < 0 || v0 >= this.bp.length - 1 ? this.bp[this.bp.length - 1] : this.bp[v0];
        if(v1 != v0) {
            return au.al(v0, 1);
        }

        return null;
    }

    public final ez bd() {
        int v0;
        int v1 = 0x4572F68B;
        int v2 = -1;
        if(this.bw * v1 != v2) {
            v0 = of.ax(this.bw * v1, 0x7EAC23F7);
        }
        else {
            v1 = 770536293;
            v0 = v2 != this.bo * v1 ? an.ae[this.bo * v1] : -1;
        }

        v0 = v0 < 0 || v0 >= this.bp.length - 1 ? this.bp[this.bp.length - 1] : this.bp[v0];
        if(v2 != v0) {
            return au.al(v0, 1);
        }

        return null;
    }

    public int bf(int arg3, int arg4) {
        return bq.al(this.bq, arg3, arg4, 2);
    }

    public String bn(int arg3, String arg4) {
        return az.ae(this.bq, arg3, arg4, -107049639);
    }

    public static void bo(Collection arg1) {
        arg1.add(ez.ae);
        arg1.add(ez.ar);
    }

    public String bp(int arg3, String arg4) {
        return az.ae(this.bq, arg3, arg4, -107049639);
    }

    public static void bt(Collection arg1) {
        arg1.add(ez.ae);
        arg1.add(ez.ar);
    }

    public static void bv(Collection arg1) {
        arg1.add(ez.ae);
        arg1.add(ez.ar);
    }

    public String bw(int arg3, String arg4) {
        return az.ae(this.bq, arg3, arg4, -107049639);
    }

    public static void by(Collection arg1) {
        arg1.add(ez.ae);
        arg1.add(ez.ar);
    }
}

