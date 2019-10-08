import java.util.Collection;
import java.util.Iterator;

public class dg extends mv {
    int aa;
    short[] ab;
    short[] ad;
    static gk ae = null;
    short[] af;
    int ai;
    public int aj;
    static ko al = null;
    int am;
    int an;
    int ap;
    short[] aq;
    static gk ar = null;
    int au;
    int av;
    static ko ax = null;
    static mz cn = null;
    public static final int dq = 8;
    static final int jt = 8;
    static final int qz = 205;

    static {
        dg.ae = new gk(0x40, null);
        dg.ar = new gk(30, null);
    }

    dg() {
        try {
            super();
            this.aj = 0x953FE737;
            this.ai = -1574450560;
            this.av = 0xF5AC1780;
            this.aa = 0;
            this.au = 0;
            this.am = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("dg.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(lq arg4, int arg5) {
        if(arg5 == 1) {
            this.ap = arg4.ao(-1533254550) * 0x1015E1E5;
        }
        else if(arg5 == 2) {
            this.aj = arg4.ao(0xA2AFC94F) * 0x6AC018C9;
        }
        else if(arg5 == 4) {
            this.ai = arg4.ao(0x4F0469B9) * 0x23444F95;
        }
        else if(5 == arg5) {
            this.av = arg4.ao(0x4BFF33DD) * 0xA3EB582F;
        }
        else if(arg5 == 6) {
            this.aa = arg4.ao(-2068165690) * 0x32A14D77;
        }
        else if(arg5 == 7) {
            this.au = arg4.ay(-111) * -92914045;
        }
        else if(8 == arg5) {
            this.am = arg4.ay(-37) * 0xF831501D;
        }
        else {
            int v1 = 0;
            if(arg5 == 40) {
                arg5 = arg4.ay(-57);
                this.ad = new short[arg5];
                this.aq = new short[arg5];
                while(v1 < arg5) {
                    this.ad[v1] = ((short)arg4.ao(-354208286));
                    this.aq[v1] = ((short)arg4.ao(0xD8BE8B03));
                    ++v1;
                }
            }
            else if(41 == arg5) {
                arg5 = arg4.ay(-100);
                this.ab = new short[arg5];
                this.af = new short[arg5];
                while(v1 < arg5) {
                    this.ab[v1] = ((short)arg4.ao(-1394240163));
                    this.af[v1] = ((short)arg4.ao(376002945));
                    ++v1;
                }
            }
        }
    }

    void ab(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-37);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 52);
        }
    }

    public static dg ad(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = dg.ae.ax(v1);
        if(v0 != null) {
            return ((dg)v0);
        }

        byte[] v0_1 = dg.ax.ae(13, arg5, 0x78DC0DC9);
        dg v3 = new dg();
        v3.an = arg5 * 2020576363;
        if(v0_1 != null) {
            v3.ae(new lq(v0_1), 14065388);
        }

        dg.ae.ae(((mv)v3), v1);
        return v3;
    }

    void ae(lq arg2, int arg3) {
        while(true) {
            byte v3 = -104;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.ar(arg2, arg3, 23);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("dg.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    void af(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-78);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x7A);
        }
    }

    public final ca ag(int arg11) {
        ca v0_2;
        int v3;
        int v2 = 0x53FAC043;
        mv v0 = dg.ar.ax(((long)(this.an * v2)));
        if(v0 == null) {
            v3 = 0;
            by v4 = by.ax(dg.al, this.ap * -2047577107, 0);
            if(v4 == null) {
                return null;
            }
            else {
                if(this.ad != null) {
                    int v0_1;
                    for(v0_1 = 0; v0_1 < this.ad.length; ++v0_1) {
                        v4.av(this.ad[v0_1], this.aq[v0_1]);
                    }
                }

                if(this.ab != null) {
                    while(v3 < this.ab.length) {
                        v4.aa(this.ab[v3], this.af[v3]);
                        ++v3;
                    }
                }

                v0_2 = v4.ay(this.au * 0xBFF6802B + 0x40, this.am * 0x311BF235 + 850, -30, -50, -30);
                dg.ar.ae(((mv)v0_2), ((long)(this.an * v2)));
            }
        }

        v2 = 0x5B7F8179;
        v3 = -1;
        ca v11 = v3 == this.aj * v2 || arg11 == v3 ? v0_2.ae(true) : fs.al(this.aj * v2, 1304812425).ad(v0_2, arg11, 0x4FC5B76F);
        int v1 = -461864003;
        v2 = 0x7CC8EECF;
        v3 = 0x80;
        if(this.ai * v1 != v3 || v3 != this.av * v2) {
            v11.ag(this.ai * v1, this.av * v2, this.ai * v1);
        }

        v1 = 0x4E299C47;
        if(this.aa * v1 != 0) {
            if(this.aa * v1 == 90) {
                v11.av();
            }

            if(this.aa * v1 == 180) {
                v11.av();
                v11.av();
            }

            if(270 != this.aa * v1) {
                return v11;
            }

            v11.av();
            v11.av();
            v11.av();
        }

        return v11;
    }

    public static void ah(Collection arg1) {
        arg1.add(dg.ae);
        arg1.add(dg.ar);
    }

    static String ai(int arg3) {
        String v3_1;
        try {
            v3_1 = "";
            Iterator v0 = ic.al.iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                v3_1 = v3_1 + ((ij)v1).ar + ':' + ((ij)v1).aq + '\n';
            }
        }
        catch(RuntimeException v3) {
            goto label_22;
        }

        return v3_1;
    label_22:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("dg.ai(");
        v0_1.append(')');
        throw lx.al(((Throwable)v3), v0_1.toString());
    }

    void ai(lq arg4, int arg5) {
        if(arg5 == 1) {
            this.ap = arg4.ao(0xE757CF78) * 0x1015E1E5;
        }
        else if(arg5 == 2) {
            this.aj = arg4.ao(-208595557) * 0x6AC018C9;
        }
        else if(arg5 == 4) {
            this.ai = arg4.ao(0xD4DF1634) * 0x23444F95;
        }
        else if(5 == arg5) {
            this.av = arg4.ao(2070731346) * 0xA3EB582F;
        }
        else if(arg5 == 6) {
            this.aa = arg4.ao(1014860682) * 0x32A14D77;
        }
        else if(arg5 == 7) {
            this.au = arg4.ay(-10) * -92914045;
        }
        else if(8 == arg5) {
            this.am = arg4.ay(-78) * 0xF831501D;
        }
        else {
            int v1 = 0;
            if(arg5 == 40) {
                arg5 = arg4.ay(-76);
                this.ad = new short[arg5];
                this.aq = new short[arg5];
                while(v1 < arg5) {
                    this.ad[v1] = ((short)arg4.ao(0xA0F8FAE7));
                    this.aq[v1] = ((short)arg4.ao(-1740119317));
                    ++v1;
                }
            }
            else if(41 == arg5) {
                arg5 = arg4.ay(-38);
                this.ab = new short[arg5];
                this.af = new short[arg5];
                while(v1 < arg5) {
                    this.ab[v1] = ((short)arg4.ao(0xF226D6FD));
                    this.af[v1] = ((short)arg4.ao(0xEB43F3C0));
                    ++v1;
                }
            }
        }
    }

    public static void aj(ko arg0, ko arg1) {
        dg.ax = arg0;
        dg.al = arg1;
    }

    public static fg al(int arg4, int arg5) {
        fg v1;
        int v0;
        byte v5 = 80;
        try {
            fg[] v5_1 = im.ax(v5);
            v0 = 0;
            while(true) {
            label_3:
                if(v0 >= v5_1.length) {
                    return null;
                }

                v1 = v5_1[v0];
                if(arg4 != v1.ap * 1900120245) {
                    goto label_11;
                }

                return v1;
            }
        }
        catch(RuntimeException v4) {
            goto label_17;
        }

        return v1;
    label_11:
        ++v0;
        goto label_3;
        return null;
    label_17:
        StringBuilder v5_2 = new StringBuilder();
        v5_2.append("dg.al(");
        v5_2.append(')');
        throw lx.al(((Throwable)v4), v5_2.toString());
    }

    public final ca am(int arg11) {
        ca v0_2;
        int v3;
        int v2 = 0x53FAC043;
        mv v0 = dg.ar.ax(((long)(this.an * v2)));
        if(v0 == null) {
            v3 = 0;
            by v4 = by.ax(dg.al, this.ap * -2047577107, 0);
            if(v4 == null) {
                return null;
            }
            else {
                if(this.ad != null) {
                    int v0_1;
                    for(v0_1 = 0; v0_1 < this.ad.length; ++v0_1) {
                        v4.av(this.ad[v0_1], this.aq[v0_1]);
                    }
                }

                if(this.ab != null) {
                    while(v3 < this.ab.length) {
                        v4.aa(this.ab[v3], this.af[v3]);
                        ++v3;
                    }
                }

                v0_2 = v4.ay(this.au * 0xBFF6802B + 0x40, this.am * 0x311BF235 + 850, -30, -50, -30);
                dg.ar.ae(((mv)v0_2), ((long)(this.an * v2)));
            }
        }

        v2 = 0x5B7F8179;
        v3 = -1;
        ca v11 = v3 == this.aj * v2 || arg11 == v3 ? v0_2.ae(true) : fs.al(this.aj * v2, 1304812425).ad(v0_2, arg11, -1951274043);
        int v1 = -461864003;
        v2 = 0x7CC8EECF;
        v3 = 0x80;
        if(this.ai * v1 != v3 || v3 != this.av * v2) {
            v11.ag(this.ai * v1, this.av * v2, this.ai * v1);
        }

        v1 = 0x4E299C47;
        if(this.aa * v1 != 0) {
            if(this.aa * v1 == 90) {
                v11.av();
            }

            if(this.aa * v1 == 180) {
                v11.av();
                v11.av();
            }

            if(270 != this.aa * v1) {
                return v11;
            }

            v11.av();
            v11.av();
            v11.av();
        }

        return v11;
    }

    static void an(int arg10, int arg11, int arg12, int arg13, byte arg14) {
        hx v0_2;
        hb v0_1;
        int v0;
        try {
            mx v14;
            for(v14 = iq.ax.aj(); v14 != null; v14 = iq.ax.aq()) {
                int v1 = 2046701285;
                int v2 = -1;
                if(v2 != ((iq)v14).ad * v1 || ((iq)v14).ai != null) {
                    int v3 = 1657715015;
                    if(arg11 > ((iq)v14).an * v3) {
                        v0 = arg11 - ((iq)v14).an * v3;
                    }
                    else {
                        v3 = 0x27306B91;
                        v0 = arg11 < ((iq)v14).ae * v3 ? ((iq)v14).ae * v3 - arg11 : 0;
                    }

                    int v5 = 0x2EAD71F5;
                    if(arg12 > ((iq)v14).ap * v5) {
                        v0 += arg12 - ((iq)v14).ap * v5;
                    }
                    else {
                        v5 = 0x2080FDE3;
                        if(arg12 < ((iq)v14).ar * v5) {
                            v0 += ((iq)v14).ar * v5 - arg12;
                        }
                    }

                    int v6 = 277054701;
                    hx v7 = null;
                    if(v0 - 0x40 <= ((iq)v14).aj * v6) {
                        v5 = 0x6EC3BC9B;
                        if(client.py * v5 != 0) {
                            if(((iq)v14).al * -1800050607 != arg10) {
                            }
                            else {
                                v0 += 0xFFFFFFC0;
                                if(v0 < 0) {
                                    v0 = 0;
                                }

                                v3 = (((iq)v14).aj * v6 - v0) * (client.py * v5) / (((iq)v14).aj * v6);
                                v5 = 100;
                                if(((iq)v14).aq != null) {
                                    ((iq)v14).aq.ai(v3);
                                }
                                else if(((iq)v14).ad * v1 >= 0) {
                                    v0_1 = hb.ax(fq.cg, ((iq)v14).ad * v1, 0);
                                    if(v0_1 != null) {
                                        v0_2 = hx.ae(v0_1.al().ax(oz.pp), v5, v3);
                                        v0_2.ab(v2);
                                        lo.pr.ax(((hz)v0_2));
                                        ((iq)v14).aq = v0_2;
                                    }
                                }

                                if(((iq)v14).aa == null) {
                                    if(((iq)v14).ai == null) {
                                        goto label_164;
                                    }

                                    v1 = 0xC9790F0D;
                                    v0 = ((iq)v14).av - arg13 * v1;
                                    ((iq)v14).av = v0;
                                    if(v0 * -1709025339 > 0) {
                                        goto label_164;
                                    }

                                    v0_1 = hb.ax(fq.cg, ((iq)v14).ai[((int)(Math.random() * (((double)((iq)v14).ai.length))))], 0);
                                    if(v0_1 == null) {
                                        goto label_164;
                                    }

                                    v0_2 = hx.ae(v0_1.al().ax(oz.pp), v5, v3);
                                    v0_2.ab(0);
                                    lo.pr.ax(((hz)v0_2));
                                    ((iq)v14).aa = v0_2;
                                    ((iq)v14).av = (((iq)v14).ab * 0xD2ABCE41 + (((int)(Math.random() * (((double)(((iq)v14).af * 1919520231 - ((iq)v14).ab * 0xD2ABCE41))))))) * v1;
                                    goto label_164;
                                }

                                ((iq)v14).aa.ai(v3);
                                if(((iq)v14).aa.lh()) {
                                    goto label_164;
                                }

                                ((iq)v14).aa = v7;
                                goto label_164;
                            }
                        }
                    }

                    if(((iq)v14).aq != null) {
                        lo.pr.al(((iq)v14).aq);
                        ((iq)v14).aq = v7;
                    }

                    if(((iq)v14).aa == null) {
                        goto label_164;
                    }

                    lo.pr.al(((iq)v14).aa);
                    ((iq)v14).aa = v7;
                }
                else {
                }

            label_164:
            }
        }
        catch(RuntimeException v10) {
            goto label_170;
        }

        return;
    label_170:
        StringBuilder v11 = new StringBuilder();
        v11.append("dg.an(");
        v11.append(')');
        throw lx.al(((Throwable)v10), v11.toString());
    }

    public final ca an(int arg10, int arg11) {
        ca v10_1;
        int v2;
        try {
            int v1 = 0x53FAC043;
            mv v11 = dg.ar.ax(((long)(this.an * v1)));
            if(v11 == null) {
                v2 = 0;
                by v3 = by.ax(dg.al, this.ap * -2047577107, 0);
                if(v3 == null) {
                    return null;
                }
                else {
                    if(this.ad != null) {
                        for(arg11 = 0; arg11 < this.ad.length; ++arg11) {
                            v3.av(this.ad[arg11], this.aq[arg11]);
                        }
                    }

                    if(this.ab != null) {
                        while(v2 < this.ab.length) {
                            v3.aa(this.ab[v2], this.af[v2]);
                            ++v2;
                        }
                    }

                    ca v11_1 = v3.ay(this.au * 0xBFF6802B + 0x40, this.am * 0x311BF235 + 850, -30, -50, -30);
                    dg.ar.ae(((mv)v11_1), ((long)(this.an * v1)));
                }
            }

            v1 = 0x5B7F8179;
            v2 = -1;
            v10_1 = v2 == this.aj * v1 || arg10 == v2 ? ((ca)v11).ae(true) : fs.al(this.aj * v1, 1304812425).ad(((ca)v11), arg10, -302290666);
            int v0 = -461864003;
            v1 = 0x7CC8EECF;
            v2 = 0x80;
            if(this.ai * v0 != v2 || v2 != this.av * v1) {
                v10_1.ag(this.ai * v0, this.av * v1, this.ai * v0);
            }

            v0 = 0x4E299C47;
            if(this.aa * v0 != 0) {
                if(this.aa * v0 == 90) {
                    v10_1.av();
                }

                if(this.aa * v0 == 180) {
                    v10_1.av();
                    v10_1.av();
                }

                if(270 != this.aa * v0) {
                    return v10_1;
                }

                v10_1.av();
                v10_1.av();
                v10_1.av();
            }
        }
        catch(RuntimeException v10) {
            StringBuilder v11_2 = new StringBuilder();
            v11_2.append("dg.an(");
            v11_2.append(')');
            throw lx.al(((Throwable)v10), v11_2.toString());
        }

        return v10_1;
    }

    public static void ao(Collection arg1) {
        arg1.add(dg.ae);
        arg1.add(dg.ar);
    }

    void aq(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-109);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 107);
        }
    }

    void ar(lq arg4, int arg5, byte arg6) {
        char v6 = ')';
        if(arg5 == 1) {
            arg5 = 0xA72AF677;
            try {
                this.ap = arg4.ao(arg5) * 0x1015E1E5;
                return;
            label_11:
                if(arg5 == 2) {
                    this.aj = arg4.ao(-310063775) * 0x6AC018C9;
                }
                else if(arg5 == 4) {
                    this.ai = arg4.ao(0x407FA9FD) * 0x23444F95;
                }
                else if(5 == arg5) {
                    this.av = arg4.ao(0x129557AD) * 0xA3EB582F;
                }
                else if(arg5 == 6) {
                    this.aa = arg4.ao(0xCBA0A59F) * 0x32A14D77;
                }
                else if(arg5 == 7) {
                    this.au = arg4.ay(-6) * -92914045;
                }
                else if(8 == arg5) {
                    this.am = arg4.ay(-75) * 0xF831501D;
                }
                else {
                    int v1 = 0;
                    if(arg5 == 40) {
                        arg5 = arg4.ay(-70);
                        this.ad = new short[arg5];
                        this.aq = new short[arg5];
                        while(v1 < arg5) {
                            this.ad[v1] = ((short)arg4.ao(0x4C20DC6E));
                            this.aq[v1] = ((short)arg4.ao(-100503116));
                            ++v1;
                        }
                    }
                    else if(v6 == arg5) {
                        arg5 = arg4.ay(-22);
                        this.ab = new short[arg5];
                        this.af = new short[arg5];
                        while(true) {
                            if(v1 < arg5) {
                                this.ab[v1] = ((short)arg4.ao(0x63CBC375));
                                this.af[v1] = ((short)arg4.ao(0x28F0DB9A));
                                ++v1;
                                continue;
                            }

                            return;
                        }

                    label_10:
                        goto label_101;
                    }
                }
            }
            catch(RuntimeException v4) {
                goto label_10;
            }
        }
        else {
            goto label_11;
        label_101:
            StringBuilder v5 = new StringBuilder();
            v5.append("dg.ar(");
            v5.append(v6);
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public static void at(Collection arg1) {
        arg1.add(dg.ae);
        arg1.add(dg.ar);
    }

    void au(lq arg4, int arg5) {
        if(arg5 == 1) {
            this.ap = arg4.ao(0x4AF0C122) * 0x1015E1E5;
        }
        else if(arg5 == 2) {
            this.aj = arg4.ao(0xB2023B4D) * 0x6AC018C9;
        }
        else if(arg5 == 4) {
            this.ai = arg4.ao(-1580403504) * 0x23444F95;
        }
        else if(5 == arg5) {
            this.av = arg4.ao(-56014786) * 0xA3EB582F;
        }
        else if(arg5 == 6) {
            this.aa = arg4.ao(0x6F2AE46) * 0x32A14D77;
        }
        else if(arg5 == 7) {
            this.au = arg4.ay(-123) * -92914045;
        }
        else if(8 == arg5) {
            this.am = arg4.ay(-74) * 0xF831501D;
        }
        else {
            int v1 = 0;
            if(arg5 == 40) {
                arg5 = arg4.ay(-85);
                this.ad = new short[arg5];
                this.aq = new short[arg5];
                while(v1 < arg5) {
                    this.ad[v1] = ((short)arg4.ao(0xE550E2AA));
                    this.aq[v1] = ((short)arg4.ao(0x7193E80));
                    ++v1;
                }
            }
            else if(41 == arg5) {
                arg5 = arg4.ay(-68);
                this.ab = new short[arg5];
                this.af = new short[arg5];
                while(v1 < arg5) {
                    this.ab[v1] = ((short)arg4.ao(-1575199401));
                    this.af[v1] = ((short)arg4.ao(0x463D20A2));
                    ++v1;
                }
            }
        }
    }

    void av(lq arg4, int arg5) {
        if(arg5 == 1) {
            this.ap = arg4.ao(0x758FD707) * 0x1015E1E5;
        }
        else if(arg5 == 2) {
            this.aj = arg4.ao(0x202F43C5) * 0x6AC018C9;
        }
        else if(arg5 == 4) {
            this.ai = arg4.ao(0xF907A654) * 0x23444F95;
        }
        else if(5 == arg5) {
            this.av = arg4.ao(0x1502CC6) * 0xA3EB582F;
        }
        else if(arg5 == 6) {
            this.aa = arg4.ao(0xE301C50D) * 0x32A14D77;
        }
        else if(arg5 == 7) {
            this.au = arg4.ay(-114) * -92914045;
        }
        else if(8 == arg5) {
            this.am = arg4.ay(-82) * 0xF831501D;
        }
        else {
            int v1 = 0;
            if(arg5 == 40) {
                arg5 = arg4.ay(-70);
                this.ad = new short[arg5];
                this.aq = new short[arg5];
                while(v1 < arg5) {
                    this.ad[v1] = ((short)arg4.ao(1380806598));
                    this.aq[v1] = ((short)arg4.ao(1801032143));
                    ++v1;
                }
            }
            else if(41 == arg5) {
                arg5 = arg4.ay(-14);
                this.ab = new short[arg5];
                this.af = new short[arg5];
                while(v1 < arg5) {
                    this.ab[v1] = ((short)arg4.ao(-827447470));
                    this.af[v1] = ((short)arg4.ao(1940728706));
                    ++v1;
                }
            }
        }
    }

    public static void aw(Collection arg1) {
        arg1.add(dg.ae);
        arg1.add(dg.ar);
    }

    public static boolean ax(ko arg4, ko arg5, int arg6) {
        try {
            da.ax = arg5;
            arg6 = 0;
            if(!arg4.ad(-104)) {
                return 0;
            }

            int v0 = 35;
            da.ae = arg4.au(v0, 0x48FC13B5) * 0xA2217FF9;
            int v1 = 0x27CB1249;
            da.al = new da[da.ae * v1];
            while(true) {
            label_17:
                if(arg6 >= da.ae * v1) {
                    return 1;
                }

                byte[] v5 = arg4.ae(v0, arg6, 0x78DC0DC9);
                da.al[arg6] = new da(arg6);
                if(v5 != null) {
                    da.al[arg6].ae(new lq(v5), 0x735F04ED);
                    da.al[arg6].an(-2106101431);
                }

                break;
            }
        }
        catch(RuntimeException v4) {
            goto label_43;
        }

        ++arg6;
        goto label_17;
        return 1;
    label_43:
        StringBuilder v5_1 = new StringBuilder();
        v5_1.append("dg.ax(");
        v5_1.append(')');
        throw lx.al(((Throwable)v4), v5_1.toString());
    }

    public static void ay(Collection arg1) {
        arg1.add(dg.ae);
        arg1.add(dg.ar);
    }

    public final ca az(int arg10) {
        ca v0_2;
        mv v0 = dg.ar.ax(((long)(this.an * 0x53FAC043)));
        if(v0 == null) {
            int v2 = 0;
            by v3 = by.ax(dg.al, this.ap * 0xE6EF81E8, 0);
            if(v3 == null) {
                return null;
            }
            else {
                if(this.ad != null) {
                    int v0_1;
                    for(v0_1 = 0; v0_1 < this.ad.length; ++v0_1) {
                        v3.av(this.ad[v0_1], this.aq[v0_1]);
                    }
                }

                if(this.ab != null) {
                    while(v2 < this.ab.length) {
                        v3.aa(this.ab[v2], this.af[v2]);
                        ++v2;
                    }
                }

                v0_2 = v3.ay(this.au * 0xBFF6802B - 0x4F740710, this.am * 0x311BF235 + 850, -30, 0x3FC6CE36, -30);
                dg.ar.ae(((mv)v0_2), ((long)(this.an * 0xAF94A44E)));
            }
        }

        int v1 = -1;
        ca v10 = v1 == this.aj * 0xA07279C0 || arg10 == v1 ? v0_2.ae(true) : fs.al(this.aj * 1092521189, 1304812425).ad(v0_2, arg10, 0x52D01A4A);
        if(this.ai * 0xD4C3731F != -1318497010 || 0x80 != this.av * 0x7CC8EECF) {
            v10.ag(this.ai * -461864003, this.av * 112062200, this.ai * 0x44EC939D);
        }

        v1 = 0x4E299C47;
        if(this.aa * v1 != 0) {
            if(this.aa * v1 == 90) {
                v10.av();
            }

            if(this.aa * 0x6FF4F53F == 180) {
                v10.av();
                v10.av();
            }

            if(270 != this.aa * 0x1F34B519) {
                return v10;
            }

            v10.av();
            v10.av();
            v10.av();
        }

        return v10;
    }
}

