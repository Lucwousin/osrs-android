import com.jagex.oldscape.osrenderer.ax;
import java.util.Collection;

public class bd extends bt {
    static int ai = 0;
    static boolean aj = false;
    static final int al = 0x80;
    as an;
    boolean ap;
    final bo ar;
    static final int ax = 0x800;
    static int qr;

    static {
    }

    public bd(bo arg3) {
        try {
            super();
            this.ap = true;
            this.ar = arg3;
            this.at = arg3.al(0x852D38F1) * 0xE940394B;
            this.ay = arg3.ae(-101) * 2026089197;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bd.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aa(int arg8, int arg9, int arg10, int arg11) {
        super.al(arg8, arg9, arg10, arg11, -680106232);
        this.an.al(arg8, arg9, arg10 - arg8, arg11 - arg9, -1790127510);
    }

    public void ab() {
        if(!ax.ai(0x52816006)) {
            this.ap = true;
        }

        int v1 = 0x66FDC661;
        if(((this.ap) || (bd.aj)) && (ax.ab(0x76C5FCB6))) {
            if((this.ap) && (bd.an(v1).ab(ii.au, 0x6E52))) {
                this.ap = false;
            }

            if(!bd.aj) {
                goto label_28;
            }

            bd.an(v1).aj(-857610711);
            bd.aj = false;
        }

    label_28:
        bd.an(v1).af(ii.au, 46);
        this.an = this.ar.ax(432280651);
        this.at = this.ar.al(-2079309109) * 0xD283F868;
        this.ay = this.ar.ae(-61) * 2026089197;
        ax.bq(-93);
        bd.an(v1).aj = ax.bf(0x7701B265) * 1335770776776098609L;
    }

    static final short ac(int arg1) {
        ++arg1;
        return ((short)(arg1 / 16 << 8 | arg1 % 16));
    }

    public void ae(int arg2, int arg3) {
        arg3 = 0xFC61F871;
        try {
            super.ae(arg2, arg3);
            ax.bw(arg2, 0x6501);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bd.ae(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void af() {
        if(!ax.ai(0x8D7BF653)) {
            this.ap = true;
        }

        int v1 = 0x66FDC661;
        if(((this.ap) || (bd.aj)) && (ax.ab(0x76C5FCB6))) {
            if((this.ap) && (bd.an(v1).ab(ii.au, 20915))) {
                this.ap = false;
            }

            if(!bd.aj) {
                goto label_28;
            }

            bd.an(v1).aj(0x5B5ADF05);
            bd.aj = false;
        }

    label_28:
        bd.an(v1).af(ii.au, -38);
        this.an = this.ar.ax(432280651);
        this.at = this.ar.al(0x91351940) * 0x3735445A;
        this.ay = this.ar.ae(-106) * 2026089197;
        ax.bq(-21);
        bd.an(v1).aj = ax.bf(0x73A860EB) * 1335770776776098609L;
    }

    public void ag(int arg2) {
        super.ae(arg2, 0x1090A947);
        ax.bw(arg2, -4502);
    }

    final void ah(int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, int arg40) {
        bd v0 = this;
        int v2 = 0xE0639EEB;
        int v3 = 0xFF;
        int v1 = v0.bn * v2 == 0 ? 0xFF : v0.bn * v2;
        short v1_1 = ((short)(v1 << 8 | v3));
        short v6 = ((short)arg40);
        ax.bg(((short)arg31), ((short)arg28), ((short)arg34), v6, ((short)arg37), v1_1, 0, 0, ((short)arg32), ((short)arg29), ((short)arg35), v6, ((short)arg38), v1_1, 0, 0, ((short)arg33), ((short)arg30), ((short)arg36), v6, ((short)arg39), v1_1, 0, 0, 0x7BD7B3F0);
    }

    public void ai() {
        if(!ax.ai(0xD2CF687E)) {
            this.ap = true;
        }

        int v1 = 0x66FDC661;
        if(((this.ap) || (bd.aj)) && (ax.ab(0x76C5FCB6))) {
            if((this.ap) && (bd.an(v1).ab(ii.au, 0x42DC))) {
                this.ap = false;
            }

            if(!bd.aj) {
                goto label_28;
            }

            bd.an(v1).aj(-1801300033);
            bd.aj = false;
        }

    label_28:
        bd.an(v1).af(ii.au, 3);
        this.an = this.ar.ax(432280651);
        this.at = this.ar.al(0x8EDBD199) * 0xE940394B;
        this.ay = this.ar.ae(-12) * 2026089197;
        ax.bq(22);
        bd.an(v1).aj = ax.bf(0x7C3FC904) * 1335770776776098609L;
    }

    final void ak(int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22) {
        this.ar(arg16, arg17, arg18, arg19, arg20, arg21, 1, 1, 1, arg22, arg22, arg22, 1, -2791);
    }

    void al(int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v6 = 0x79F2F046;
        bd v1 = this;
        int v2 = arg9;
        int v3 = arg10;
        int v4 = arg11;
        int v5 = arg12;
        try {
            super.al(v2, v3, v4, v5, v6);
            this.an.al(arg9, arg10, arg11 - arg9, arg12 - arg10, 0xF1D05D9);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("bd.al(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0), v2_1.toString());
        }
    }

    void am(int arg8, int arg9, int arg10, int arg11) {
        super.al(arg8, arg9, arg10, arg11, 0x1F1CD3ED);
        this.an.al(arg8, arg9, arg10 - arg8, arg11 - arg9, 0xE57DD631);
    }

    public static bl an(int arg3) {
        bl v0_2;
        Class v3 = bd.class;
        __monitor_enter(v3);
        try {
            if(bl.al == null) {
                bl.al = new bl();
            }

            v0_2 = bl.al;
        }
        catch(Throwable v0) {
        }
        catch(RuntimeException v0_1) {
            try {
                StringBuilder v1 = new StringBuilder();
                v1.append("bd.an(");
                v1.append(')');
                throw lx.al(((Throwable)v0_1), v1.toString());
            }
            catch(Throwable v0) {
                __monitor_exit(v3);
                throw v0;
            }
        }

        __monitor_exit(v3);
        return v0_2;
    }

    final void an(int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, byte arg26) {
        short v15 = -27534;
        bd v1 = this;
        int v2 = arg17;
        int v3 = arg18;
        int v4 = arg19;
        int v5 = arg20;
        int v6 = arg21;
        int v7 = arg22;
        int v11 = arg23;
        int v12 = arg24;
        int v13 = arg25;
        try {
            v1.ar(v2, v3, v4, v5, v6, v7, 1, 1, 1, v11, v12, v13, 1, v15);
            return;
        }
        catch(RuntimeException v0) {
            RuntimeException v1_1 = v0;
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("bd.an(");
            v0_1.append(')');
            throw lx.al(((Throwable)v1_1), v0_1.toString());
        }
    }

    final void ao(int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        this.ar(arg16, arg17, arg18, arg19, arg20, arg21, 1, 1, 1, arg22, arg23, arg24, 1, -12663);
    }

    final void ap(int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        short v15 = -28310;
        bd v1 = this;
        int v2 = arg17;
        int v3 = arg18;
        int v4 = arg19;
        int v5 = arg20;
        int v6 = arg21;
        int v7 = arg22;
        int v11 = arg23;
        int v12 = arg23;
        int v13 = arg23;
        try {
            v1.ar(v2, v3, v4, v5, v6, v7, 1, 1, 1, v11, v12, v13, 1, v15);
            return;
        }
        catch(RuntimeException v0) {
            RuntimeException v1_1 = v0;
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("bd.ap(");
            v0_1.append(')');
            throw lx.al(((Throwable)v1_1), v0_1.toString());
        }
    }

    public static void aq(Collection arg1, int arg2) {
        try {
            arg1.add(da.ar);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("bd.aq(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    final void aq(int arg37, int arg38, int arg39, int arg40, int arg41, int arg42, int arg43, int arg44, int arg45, int arg46, int arg47, int arg48, float arg49, float arg50, float arg51, float arg52, float arg53, float arg54, int arg55, int arg56) {
        bd v1 = this;
        int v0 = arg43;
        int v2 = arg46;
        int v3 = arg47;
        int v4 = arg48;
        int v5 = arg55;
        try {
            if(ii.au.ae(v5, 120) == null) {
                v0 = ii.au.ar(v5, 0x90F67447);
                this.an(arg37, arg38, arg39, arg40, arg41, arg42, io.bh(v0, v2, 0), io.bh(v0, v3, 0), io.bh(v0, v4, 0), 9);
                return;
            }

            int v7 = 0xE0639EEB;
            int v8 = 0xFF;
            int v6 = v1.bn * v7 == 0 ? 0xFF : v1.bn * v7;
            short v6_1 = ((short)(v6 << 8 | v8));
            v7 = 2;
            v2 = Math.min(Math.max(v2, v7), 0x7E) + 0x400;
            v3 = Math.min(Math.max(v3, v7), 0x7E) + 0x400;
            v4 = Math.min(Math.max(v4, v7), 0x7E) + 0x400;
            v8 = 1;
            if(1 == v0) {
            }
            else {
                v8 = v1.bp * 574766503;
            }

            short v29 = do.aj(v5, 0xB75056EB);
            int v9 = ii.au.ax(v5, 0x36B13B52).av / v7;
            v5 = ii.au.ax(v5, 0x141E9215).aa / v7;
            short v15 = ((short)v8);
            ax.bg(((short)arg40), ((short)arg37), ((short)v0), v15, ((short)v2), v6_1, v29, ii.ad(arg49, arg52, v9, v5, 1320980370), ((short)arg41), ((short)arg38), ((short)arg44), v15, ((short)v3), v6_1, v29, ii.ad(arg50, arg53, v9, v5, 0x913ED706), ((short)arg42), ((short)arg39), ((short)arg45), v15, ((short)v4), v6_1, v29, ii.ad(arg51, arg54, v9, v5, -58110381), 0x13AABE6C);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("bd.aq(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }

    final void ar(int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, int arg40, short arg41) {
        bd v1 = this;
        try {
            int v2 = 0xE0639EEB;
            int v3 = 0xFF;
            int v0_1 = v1.bn * v2 == 0 ? 0xFF : v1.bn * v2;
            short v0_2 = ((short)(v0_1 << 8 | v3));
            short v6 = ((short)arg40);
            ax.bg(((short)arg31), ((short)arg28), ((short)arg34), v6, ((short)arg37), v0_2, 0, 0, ((short)arg32), ((short)arg29), ((short)arg35), v6, ((short)arg38), v0_2, 0, 0, ((short)arg33), ((short)arg30), ((short)arg36), v6, ((short)arg39), v0_2, 0, 0, 0x6C47F06D);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("bd.ar(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0), v2_1.toString());
        }
    }

    final void as(int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22) {
        this.ar(arg16, arg17, arg18, arg19, arg20, arg21, 1, 1, 1, arg22, arg22, arg22, 1, -19899);
    }

    final void at(int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, int arg40) {
        bd v0 = this;
        int v2 = 0xFF;
        int v1 = v0.bn * 0xE0639EEB == 0 ? 0xFF : v0.bn * 0x19D01E39;
        short v1_1 = ((short)(v1 << 8 | v2));
        short v6 = ((short)arg40);
        ax.bg(((short)arg31), ((short)arg28), ((short)arg34), v6, ((short)arg37), v1_1, 0, 0, ((short)arg32), ((short)arg29), ((short)arg35), v6, ((short)arg38), v1_1, 0, 0, ((short)arg33), ((short)arg30), ((short)arg36), v6, ((short)arg39), v1_1, 0, 0, 0xE409FE7B);
    }

    void au(int arg8, int arg9, int arg10, int arg11) {
        super.al(arg8, arg9, arg10, arg11, 0xBFA0D088);
        this.an.al(arg8, arg9, arg10 - arg8, arg11 - arg9, 140371301);
    }

    void av(int arg8, int arg9, int arg10, int arg11) {
        super.al(arg8, arg9, arg10, arg11, 0xE5CE517C);
        this.an.al(arg8, arg9, arg10 - arg8, arg11 - arg9, 0xA3A5ADE1);
    }

    final void aw(int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24) {
        this.ar(arg16, arg17, arg18, arg19, arg20, arg21, 1, 1, 1, arg22, arg23, arg24, 1, -6112);
    }

    public void ax(byte arg5) {
        int v5 = 75051412;
        try {
            if(!ax.ai(v5)) {
                this.ap = true;
            }

            int v0 = 0x66FDC661;
            if(((this.ap) || (bd.aj)) && (ax.ab(0x76C5FCB6))) {
                if((this.ap) && (bd.an(v0).ab(ii.au, 0x54DB))) {
                    this.ap = false;
                }

                if(!bd.aj) {
                    goto label_28;
                }

                bd.an(v0).aj(0xF621334F);
                bd.aj = false;
            }

        label_28:
            bd.an(v0).af(ii.au, -34);
            this.an = this.ar.ax(432280651);
            this.at = this.ar.al(-1851958810) * 0xE940394B;
            this.ay = this.ar.ae(-30) * 2026089197;
            ax.bq(90);
            bd.an(v0).aj = ax.bf(1928044404) * 1335770776776098609L;
            return;
        }
        catch(RuntimeException v5_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("bd.ax(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5_1), v0_1.toString());
        }
    }

    final void ay(int arg28, int arg29, int arg30, int arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, int arg40) {
        bd v0 = this;
        int v2 = 0xE0639EEB;
        int v3 = 0xFF;
        int v1 = v0.bn * v2 == 0 ? 0xFF : v0.bn * v2;
        short v1_1 = ((short)(v1 << 8 | v3));
        short v6 = ((short)arg40);
        ax.bg(((short)arg31), ((short)arg28), ((short)arg34), v6, ((short)arg37), v1_1, 0, 0, ((short)arg32), ((short)arg29), ((short)arg35), v6, ((short)arg38), v1_1, 0, 0, ((short)arg33), ((short)arg30), ((short)arg36), v6, ((short)arg39), v1_1, 0, 0, 1031482052);
    }

    public void az(int arg2) {
        super.ae(arg2, -2028372040);
        ax.bw(arg2, 0x5BFC);
    }

    static final short ba(float arg2, float arg3, int arg4, int arg5) {
        return ((short)((((int)((arg2 + 1f) * 64f))) + (arg4 >> 1) | (arg5 >> 1) + (((int)((arg3 + 1f) * 64f))) << 8));
    }

    static final short bd(int arg1) {
        ++arg1;
        return ((short)(arg1 / 16 << 8 | arg1 % 16));
    }

    static final int gl(ar arg16, int arg17, byte arg18) {
        int v10;
        ar v6_1;
        int v11;
        int v8;
        int v5;
        int v4;
        ar v0 = arg16;
        int v1 = arg17;
        try {
            if(v0.fi != null) {
                if(v1 >= v0.fi.length) {
                    return -2;
                }
                else {
                    goto label_8;
                }
            }

            return -2;
        }
        catch(RuntimeException v0_1) {
            goto label_250;
        }

        return -2;
    label_8:
        int v2 = -1;
        try {
            int[] v0_2 = v0.fi[v1];
            int v3 = 0;
            v4 = 0;
            while(true) {
            label_13:
                v5 = 0;
                while(true) {
                label_14:
                    int v6 = v3 + 1;
                    v3 = v0_2[v3];
                    if(v3 != 0) {
                        if(v3 == 1) {
                            v8 = client.km[v0_2[v6]];
                            ++v6;
                        }
                        else {
                            v8 = 0;
                        }

                        int v9 = 2;
                        if(v3 == v9) {
                            v8 = client.ko[v0_2[v6]];
                            ++v6;
                        }

                        if(v3 == 3) {
                            v8 = client.ki[v0_2[v6]];
                            ++v6;
                        }

                        int v12 = 0x64D7CF4D;
                        int v13 = 16;
                        if(v3 == 4) {
                            v11 = v6 + 1;
                            int v14 = v11 + 1;
                            v6_1 = bl.al((v0_2[v6] << v13) + v0_2[v11], v12);
                            v11 = v14 + 1;
                            v14 = v0_2[v14];
                            if(v2 != v14) {
                                if((client.al(v14, 0xFE84B8B2).bw) && !client.aq) {
                                    goto label_80;
                                }

                                int v15 = v8;
                                for(v8 = 0; v8 < v6_1.fm.length; ++v8) {
                                    if(v6_1.fm[v8] == v14 + 1) {
                                        v15 += v6_1.ff[v8];
                                    }
                                }

                                v8 = v15;
                            }
                        }
                        else {
                            v11 = v6;
                        }

                    label_80:
                        if(v3 == 5) {
                            v6 = v11 + 1;
                            v8 = an.ae[v0_2[v11]];
                        }
                        else {
                            v6 = v11;
                        }

                        if(6 == v3) {
                            v8 = gg.ae[client.ko[v0_2[v6]] - 1];
                            ++v6;
                        }

                        v1 = 7;
                        if(v1 == v3) {
                            v8 = an.ae[v0_2[v6]] * 100 / 0xB71B;
                            ++v6;
                        }

                        if(v3 == 8) {
                            v8 = gu.jg.ad * 1969138005;
                        }

                        if(9 == v3) {
                            v10 = v8;
                            for(v8 = 0; v8 < 25; ++v8) {
                                if(gg.al[v8]) {
                                    v10 += client.ko[v8];
                                }
                            }

                            v8 = v10;
                        }

                        if(v3 == 10) {
                            v10 = v6 + 1;
                            v11 = v10 + 1;
                            v6_1 = bl.al((v0_2[v6] << v13) + v0_2[v10], v12);
                            v10 = v11 + 1;
                            v11 = v0_2[v11];
                            if(v2 != v11) {
                                if((client.al(v11, 0x221BE17B).bw) && !client.aq) {
                                    goto label_160;
                                }

                                for(v12 = 0; v12 < v6_1.fm.length; ++v12) {
                                    if(v11 + 1 == v6_1.fm[v12]) {
                                        v8 = 0x3B9AC9FF;
                                        break;
                                    }
                                }
                            }
                        }
                        else {
                            v10 = v6;
                        }

                    label_160:
                        if(v3 == 11) {
                            v8 = client.lh * 0x6FFC6629;
                        }

                        if(v3 == 12) {
                            v8 = 0xB3C744AB * client.ly;
                        }

                        if(v3 == 13) {
                            v8 = v10 + 1;
                            v6 = an.ae[v0_2[v10]];
                            v10 = v8 + 1;
                            v8 = (v6 & 1 << v0_2[v8]) != 0 ? 1 : 0;
                        }

                        if(v3 == 14) {
                            v6 = v10 + 1;
                            v8 = of.ax(v0_2[v10], 0x3FF1F0D7);
                        }
                        else {
                            v6 = v10;
                        }

                        v10 = 15 == v3 ? 1 : 0;
                        if(v13 == v3) {
                            v10 = 2;
                        }

                        if(v3 == 17) {
                            v10 = 3;
                        }

                        if(18 == v3) {
                            v8 = (gu.jg.bp * 0x914F0683 >> v1) + ad.fi * 474770003;
                        }

                        if(v3 == 19) {
                            v8 = nr.fo * 0x519F9BE7 + (gu.jg.bw * 0xD19D0C3D >> 7);
                        }

                        if(v3 == 20) {
                            v8 = v0_2[v6];
                            v3 = v6 + 1;
                        }
                        else {
                            v3 = v6;
                        }

                        if(v10 != 0) {
                            goto label_243;
                        }

                        if(v5 == 0) {
                            v4 += v8;
                        }

                        if(1 == v5) {
                            v4 -= v8;
                        }

                        if(v9 == v5 && v8 != 0) {
                            v4 /= v8;
                        }

                        break;
                    }
                    else {
                        return v4;
                    }
                }
            }
        }
        catch(Exception ) {
            return v2;
        }
        catch(RuntimeException v0_1) {
            goto label_250;
        }

        if(3 != v5) {
            goto label_13;
        }

        v4 *= v8;
        goto label_13;
    label_243:
        v5 = v10;
        goto label_14;
        return v4;
    label_250:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("bd.gl(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0_1), v1_1.toString());
        return -2;
    }
}

