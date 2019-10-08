import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map$Entry;

public class cc {
    List aa;
    cp ab;
    public static final int ac = 0x20;
    int ad;
    static et ae = null;
    LinkedList af;
    int ai;
    static gi aj = null;
    static final int al = 0xFFCC0000;
    final HashMap am;
    static final int an = 0x2400000;
    static final int ap = 0x100;
    int aq;
    static fa ar = null;
    HashMap au;
    int av;
    static final int ax = 0xFFCCCCCC;
    static final int cc = 23;

    static {
        cc.ae = new et();
        cc.ar = cc.ae.ax(0xEE5C3011);
        cc.aj = new gi(0x2400000, 0x100);
    }

    cc(int arg2, int arg3, int arg4, HashMap arg5) {
        try {
            super();
            this.ad = arg2 * -961670179;
            this.aq = arg3 * 0xDDD69C61;
            this.af = new LinkedList();
            this.aa = new LinkedList();
            this.au = new HashMap();
            this.ai = (0xFF000000 | arg4) * 0x26D145FF;
            this.am = arg5;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cc.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    boolean aa(ko arg9, int arg10) {
        int v0;
        try {
            this.au.clear();
            v0 = 1;
            if(this.ab != null) {
                this.ab.aq(arg9, -2087565367);
                if(this.ab.aj(0x35BD240B)) {
                    this.aq(0, 0, 0x40, 0x40, this.ab, 0x6AAF07E9);
                    return 1;
                }

                return 0;
            }

            Iterator v10 = this.af.iterator();
            while(v10.hasNext()) {
                Object v1 = v10.next();
                ((cq)v1).aq(arg9, 0x825D0845);
                v0 &= ((cq)v1).aj(1764563057);
            }

            if(v0 != 0) {
                Iterator v9_1 = this.af.iterator();
                while(v9_1.hasNext()) {
                    Object v6 = v9_1.next();
                    this.aq(((cq)v6).an(-1040698529) * 8, ((cq)v6).bh(1810104648) * 8, 8, 8, ((ck)v6), 0xACE3BF50);
                }
            }
        }
        catch(RuntimeException v9) {
            goto label_56;
        }

        return ((boolean)v0);
    label_56:
        StringBuilder v10_1 = new StringBuilder();
        v10_1.append("cc.aa(");
        v10_1.append(')');
        throw lx.al(((Throwable)v9), v10_1.toString());
    }

    void ab(do arg6, int arg7, int arg8, int arg9, ck arg10, int arg11) {
        co v7_1;
        try {
            af v11 = new af(arg7, this.ad * 0x1AF71D40 + arg8, this.aq * 1480714304 + arg9);
            int v1 = 0x16004E40;
            int v2 = 0x514187C0;
            int v3 = 0x8D507D7F;
            af v10 = this.ab != null ? new af(arg7 + this.ab.an * v3, this.ab.ax * v2 + arg8, this.ab.al * v1 + arg9) : new af(arg7 + ((cq)arg10).an * v3, ((cq)arg10).ax * v2 + arg8 + ((cq)arg10).ae(0xF8D6BE2) * 8, ((cq)arg10).al * v1 + arg9 + ((cq)arg10).ar(0x5EABD0F5) * 8);
            if(arg6.bc != null) {
                dm v7 = new dm(v10, v11, arg6.aq * 0x9BAF8E95, this);
            }
            else {
                da v6_1 = ae.al(arg6.bn * 1284025131, 16);
                v7_1 = new co(v10, v11, v6_1.an * 0x11F2C855, this.bq(v6_1, 0x77));
            }

            this.au.put(new af(0, arg8, arg9), v7_1);
            return;
        }
        catch(RuntimeException v6) {
            StringBuilder v7_2 = new StringBuilder();
            v7_2.append("cc.ab(");
            v7_2.append(')');
            throw lx.al(((Throwable)v6), v7_2.toString());
        }
    }

    void ac(int arg10, int arg11, HashSet arg12, int arg13, fa arg14, int arg15) {
        float v15 = (((float)arg13)) / 64f;
        float v0 = v15 / 2f;
        try {
            Iterator v8 = this.au.entrySet().iterator();
            while(v8.hasNext()) {
                Object v1 = v8.next();
                Object v2 = ((Map$Entry)v1).getKey();
                int v3 = ((int)((((float)arg10)) + (((float)(((af)v2).al * 0xAEACF223))) * v15 - v0));
                int v4 = ((int)((((float)(arg11 + arg13))) - (((float)(((af)v2).ae * 0xB230B0A5))) * v15 - v0));
                v2 = ((Map$Entry)v1).getValue();
                if(v2 == null) {
                    continue;
                }

                if(!((cg)v2).ap(1023204699)) {
                    continue;
                }

                ((cg)v2).ae = 0x1FC30ADB * v3;
                ((cg)v2).ar = 0x31BD5F3B * v4;
                if(arg12.contains(Integer.valueOf(ae.al(((cg)v2).al(-67), 16).ad(-59)))) {
                    continue;
                }

                this.bf(((cg)v2), v3, v4, v15, arg14, 0x95D10F97);
            }
        }
        catch(RuntimeException v10) {
            goto label_61;
        }

        return;
    label_61:
        StringBuilder v11 = new StringBuilder();
        v11.append("cc.ac(");
        v11.append(')');
        throw lx.al(((Throwable)v10), v11.toString());
    }

    void ad(HashSet arg4, List arg5, byte arg6) {
        try {
            this.au.clear();
            Iterator v4_1 = arg4.iterator();
            while(v4_1.hasNext()) {
                Object v6 = v4_1.next();
                if(((cq)v6).av(0xA6BBCEF4) != this.ad * 0xBC6BDC75) {
                    continue;
                }

                if(((cq)v6).aa(260) != this.aq * 2103510945) {
                    continue;
                }

                this.af.add(v6);
            }

            this.ai(arg5, 1);
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("cc.ad(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void af(byte arg3) {
        try {
            Iterator v3_1 = this.au.values().iterator();
            while(v3_1.hasNext()) {
                Object v0 = v3_1.next();
                if(!(v0 instanceof dm)) {
                    continue;
                }

                ((dm)v0).at(0);
            }
        }
        catch(RuntimeException v3) {
            goto label_14;
        }

        return;
    label_14:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("cc.af(");
        v0_1.append(')');
        throw lx.al(((Throwable)v3), v0_1.toString());
    }

    void ag(cl arg11, ef[] arg12, cv arg13, byte arg14) {
        int v13;
        int v7 = 0;
        while(true) {
        label_2:
            int v8 = 0x40;
            if(v7 >= v8) {
                goto label_27;
            }

            int v9 = 0;
            while(true) {
                if(v9 >= v8) {
                    goto label_25;
                }

                try {
                    this.ay(v7, v9, this.ab, arg11, arg13, -1876084038);
                    this.aw(v7, v9, this.ab, arg11, 1586404472);
                    ++v9;
                    continue;
                label_25:
                    ++v7;
                    goto label_2;
                label_27:
                    v13 = 0;
                    while(true) {
                    label_28:
                        if(v13 >= v8) {
                            return;
                        }

                        for(v7 = 0; v7 < v8; ++v7) {
                            this.at(v13, v7, this.ab, arg11, arg12, 0x6A98FE25);
                        }
                    }
                }
                catch(RuntimeException v11) {
                    goto label_41;
                }
            }
        }

        ++v13;
        goto label_28;
        return;
    label_41:
        StringBuilder v12 = new StringBuilder();
        v12.append("cc.ag(");
        v12.append(')');
        throw lx.al(((Throwable)v11), v12.toString());
    }

    void ah(cl arg11, ef[] arg12, cv arg13, int arg14) {
        int v7;
        try {
            Iterator v14 = this.af.iterator();
        label_2:
            if(v14.hasNext()) {
                Object v0 = v14.next();
                int v8;
                for(v8 = ((cq)v0).an(-1566870698) * 8; true; ++v8) {
                    if(v8 >= ((cq)v0).an(0xDD3DCEFD) * 8 + 8) {
                        goto label_2;
                    }

                    int v9;
                    for(v9 = ((cq)v0).bh(-2080332076) * 8; v9 < ((cq)v0).bh(0xA8412BD1) * 8 + 8; ++v9) {
                        this.ay(v8, v9, v0, arg11, arg13, 0x16579BE0);
                        this.aw(v8, v9, v0, arg11, 1586404472);
                    }
                }
            }

            Iterator v13 = this.af.iterator();
        label_44:
            if(!v13.hasNext()) {
                return;
            }

            Object v14_1 = v13.next();
            v7 = ((cq)v14_1).an(0xF7C07032) * 8;
            while(true) {
            label_51:
                if(v7 >= ((cq)v14_1).an(0x1772A278) * 8 + 8) {
                    goto label_44;
                }

                for(v8 = ((cq)v14_1).bh(0xFD30A00F) * 8; v8 < ((cq)v14_1).bh(-1979300625) * 8 + 8; ++v8) {
                    this.at(v7, v8, v14_1, arg11, arg12, 0xF43A7B01);
                }
            }
        }
        catch(RuntimeException v11) {
            goto label_80;
        }

        ++v7;
        goto label_51;
        return;
    label_80:
        StringBuilder v12 = new StringBuilder();
        v12.append("cc.ah(");
        v12.append(')');
        throw lx.al(((Throwable)v11), v12.toString());
    }

    void ai(List arg6, byte arg7) {
        try {
            Iterator v6_1 = arg6.iterator();
            while(v6_1.hasNext()) {
                Object v7 = v6_1.next();
                if(((co)v7).ax.al * 0xAEACF223 >> 6 != this.ad * 0xBC6BDC75) {
                    continue;
                }

                if(((co)v7).ax.ae * 0xB230B0A5 >> 6 != this.aq * 2103510945) {
                    continue;
                }

                this.aa.add(new co(((co)v7).ax, ((co)v7).ax, ((co)v7).an * 0xD4CF171B, this.bv(((co)v7).an * 0xD4CF171B, 0x3795AB99)));
            }
        }
        catch(RuntimeException v6) {
            goto label_39;
        }

        return;
    label_39:
        StringBuilder v7_1 = new StringBuilder();
        v7_1.append("cc.ai(");
        v7_1.append(')');
        throw lx.al(((Throwable)v6), v7_1.toString());
    }

    void aj(cp arg1, List arg2, int arg3) {
        try {
            this.au.clear();
            this.ab = arg1;
            this.ai(arg2, 1);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cc.aj(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ak(int arg25, int arg26, ck arg27, int arg28) {
        int v9;
        int v12;
        cc v7 = this;
        ck v8 = arg27;
        int v10 = 0;
        try {
            while(true) {
            label_3:
                if(v10 >= v8.ap * 0xCA01D035) {
                    return;
                }

                du[] v11 = v8.av[v10][arg25][arg26];
                if(v11 != null) {
                    if(v11.length == 0) {
                    }
                    else {
                        v12 = 0;
                        while(true) {
                        label_16:
                            if(v12 < v11.length) {
                                du v13 = v11[v12];
                                int v14 = 0xFE370D39;
                                if(ao.al(v13.al * v14, 0x7E6A89D0)) {
                                    int v21 = ok.al(v13.ax * 0xFF5623B1, 617106840).ay * 0xE5018CDF != 0 ? 0xFFCC0000 : 0xFFCCCCCC;
                                    int v22 = 0x675599ED;
                                    int v23 = -2106048683;
                                    if(v13.al * v14 == ga.ax.as * v22) {
                                        this.bz(arg25, arg26, v13.ae * v23, v21, 3130);
                                    }

                                    if(v13.al * v14 == ga.ae.as * v22) {
                                        v9 = 1;
                                        this.bz(arg25, arg26, v13.ae * v23, 0xFFCCCCCC, 3130);
                                        this.bz(arg25, arg26, v13.ae * v23 + 1, v21, 3130);
                                    }
                                    else {
                                        v9 = 1;
                                    }

                                    int v3 = 2;
                                    int v4 = 0x178F7E55;
                                    if(v13.al * v14 == ga.ar.as * v22) {
                                        if(v13.ae * v23 == 0) {
                                            cc.ar.aj(v7.av * v4 * arg25, (0x3F - arg26) * (v7.av * v4), 1, v21, 0x437A5FD4);
                                        }

                                        if(v13.ae * v23 == v9) {
                                            cc.ar.aj(v7.av * v4 + v7.av * v4 * arg25 - 1, v7.av * v4 * (0x3F - arg26), 1, v21, 370398510);
                                        }

                                        if(v3 == v13.ae * v23) {
                                            cc.ar.aj(v7.av * v4 * arg25 + v7.av * v4 - 1, v7.av * v4 + (0x3F - arg26) * (v7.av * v4) - 1, 1, v21, 0x6FE1CFBE);
                                        }

                                        if(v13.ae * v23 != 3) {
                                            goto label_168;
                                        }

                                        cc.ar.aj(arg25 * (v7.av * v4), v7.av * v4 + v7.av * v4 * (0x3F - arg26) - 1, 1, v21, 1108727051);
                                    }

                                label_168:
                                    if(ga.an.as * v22 != v13.al * v14) {
                                        goto label_219;
                                    }

                                    if(v13.ae * v23 % v3 == 0) {
                                        int v1;
                                        for(v1 = 0; true; ++v1) {
                                            if(v1 >= v7.av * v4) {
                                                goto label_219;
                                            }

                                            cc.ar.aj(v7.av * v4 * arg25 + v1, v7.av * v4 * (0x40 - arg26) - v9 - v1, 1, v21, 1630372002);
                                        }
                                    }

                                    for(v1 = 0; true; ++v1) {
                                        if(v1 >= v7.av * v4) {
                                            goto label_219;
                                        }

                                        cc.ar.aj(v1 + v7.av * v4 * arg25, v7.av * v4 * (0x3F - arg26) + v1, 1, v21, 358901894);
                                    }
                                }

                                goto label_219;
                            }

                            goto label_221;
                        }
                    }
                }

                goto label_221;
            }
        }
        catch(RuntimeException v0) {
            goto label_226;
        }

    label_219:
        ++v12;
        goto label_16;
    label_226:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("cc.ak(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0), v1_1.toString());
    label_221:
        ++v10;
        goto label_3;
    }

    void am(int arg8, int arg9, int arg10, HashSet arg11, fa arg12, int arg13) {
        if(arg11 == null) {
            try {
                arg11 = new HashSet();
            label_3:
                this.ac(arg8, arg9, arg11, arg10, arg12, 0x27259DDF);
                this.bw(arg8, arg9, arg11, arg10, arg12, 0x30);
                return;
            }
            catch(RuntimeException v8) {
                StringBuilder v9 = new StringBuilder();
                v9.append("cc.am(");
                v9.append(')');
                throw lx.al(((Throwable)v8), v9.toString());
            }
        }

        goto label_3;
    }

    public static int an(int arg1, int arg2, int arg3) {
        arg3 = 0;
        while(arg2 > 0) {
            arg3 = arg3 << 1 | arg1 & 1;
            arg1 >>>= 1;
            --arg2;
        }

        return arg3;
    }

    static void ao(int[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        for(arg5 = -arg11; arg5 < 0; ++arg5) {
            arg11 = (arg7 >> 16) * arg14;
            arg15 = -arg10;
            int v0 = arg8;
            arg8 = arg6;
            while(arg15 < 0) {
                int v1 = (arg8 >> 16) + arg11;
                try {
                    v1 = arg4[v1];
                    if(v1 != 0) {
                        arg3[v0] = v1;
                        ++v0;
                    }
                    else {
                        goto label_16;
                    }

                    goto label_17;
                }
                catch(RuntimeException v3) {
                    StringBuilder v4 = new StringBuilder();
                    v4.append("cc.ao(");
                    v4.append(')');
                    throw lx.al(((Throwable)v3), v4.toString());
                }

            label_16:
                ++v0;
            label_17:
                arg8 += arg12;
                ++arg15;
            }

            arg7 += arg13;
            arg8 = v0 + arg9;
        }
    }

    int ao(int arg1, int arg2, ck arg3, cv arg4, int arg5) {
        try {
            if(arg3.aq[0][arg1][arg2] == 0) {
                return this.ai * 0xA20AB9FF;
            }

            return arg4.al(arg1, arg2, 1048786787);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cc.ao(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void ap(int arg11, int arg12, int arg13, fa arg14, int arg15) {
        arg15 = 0xBC6BDC75;
        try {
            es v4 = em.al(this.ad * arg15, this.aq * 2103510945, this.av * 0x178F7E55, 0x756F80C2);
            if(v4 == null) {
                return;
            }

            if(this.av * 0xE3DF9540 == arg13) {
                arg14.aa(v4, arg11, arg12, 25);
            }
            else {
                arg14.bq(v4, arg11, arg12, arg13, arg13, 0x29FCE12B);
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("cc.ap(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    void aq(int arg9, int arg10, int arg11, int arg12, ck arg13, int arg14) {
        do v4;
        for(arg14 = arg9; arg14 < arg9 + arg11; ++arg14) {
            int v7;
            for(v7 = arg10; v7 < arg12 + arg10; ++v7) {
                int v2;
                for(v2 = 0; true; ++v2) {
                    int v1 = 0xCA01D035;
                    try {
                        if(v2 < arg13.ap * v1) {
                            du[] v1_1 = arg13.av[v2][arg14][v7];
                            if(v1_1 != null) {
                                if(v1_1.length == 0) {
                                }
                                else {
                                    int v3 = 0;
                                    while(true) {
                                        if(v3 < v1_1.length) {
                                            v4 = ok.al(v1_1[v3].ax * 0xFF5623B1, 0xFEC98F20);
                                            if(!ab.bt(v4, 0x5160407)) {
                                                ++v3;
                                                continue;
                                            }
                                            else {
                                                break;
                                            }
                                        }

                                        goto label_42;
                                    }

                                    this.ab(v4, v2, arg14, v7, arg13, 0xC5452FFB);
                                    break;
                                }
                            }

                            goto label_42;
                        }

                        break;
                    }
                    catch(RuntimeException v9) {
                        StringBuilder v10 = new StringBuilder();
                        v10.append("cc.aq(");
                        v10.append(')');
                        throw lx.al(((Throwable)v9), v10.toString());
                    }

                label_42:
                }
            }
        }
    }

    void as(int arg29, int arg30, ck arg31, ef[] arg32, byte arg33) {
        int v7;
        cc v1 = this;
        ck v3 = arg31;
        int v5;
        for(v5 = 0; true; ++v5) {
            int v6 = 0xCA01D035;
            try {
                if(v5 >= v3.ap * v6) {
                    return;
                }

                du[] v6_1 = v3.av[v5][arg29][arg30];
                if(v6_1 != null) {
                    if(v6_1.length == 0) {
                    }
                    else {
                        v7 = 0;
                        while(true) {
                        label_17:
                            if(v7 < v6_1.length) {
                                du v8 = v6_1[v7];
                                int v10 = 0xFE370D39;
                                if((gl.ae(v8.al * v10, 0x3117FD24)) || (fg.an(v8.al * v10, -1493580901))) {
                                    do v8_1 = ok.al(v8.ax * 0xFF5623B1, 0x1CC3CFD1);
                                    v10 = 1156257065;
                                    if(v8_1.bp * v10 != -1) {
                                        int v12 = 0x2F1EFCAA;
                                        int v13 = 0x178F7E55;
                                        if(46 != v8_1.bp * v10) {
                                            if(52 == v8_1.bp * v10) {
                                            }
                                            else {
                                                cc.ar.aw(arg32[v8_1.bp * v10], arg29 * (v1.av * v13), (0x3F - arg30) * (v1.av * v13), v1.av * v12, v1.av * v12, -39);
                                                goto label_89;
                                            }
                                        }

                                        cc.ar.aw(arg32[v8_1.bp * v10], arg29 * (v1.av * v13), v1.av * v13 * (0x3F - arg30), v1.av * v12 + 1, v1.av * v12 + 1, 29);
                                    }
                                }

                                goto label_89;
                            }

                            goto label_91;
                        }
                    }
                }

                goto label_91;
            }
            catch(RuntimeException v0) {
                goto label_96;
            }

        label_89:
            ++v7;
            goto label_17;
        label_96:
            StringBuilder v2 = new StringBuilder();
            v2.append("cc.as(");
            v2.append(')');
            throw lx.al(((Throwable)v0), v2.toString());
        label_91:
        }
    }

    void at(int arg7, int arg8, ck arg9, cl arg10, ef[] arg11, int arg12) {
        int v10 = -1702155586;
        try {
            this.ak(arg7, arg8, arg9, v10);
            this.as(arg7, arg8, arg9, arg11, -57);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("cc.at(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    void au(int arg5, cl arg6, ef[] arg7, ko arg8, ko arg9, int arg10) {
        arg10 = -710308099 * arg5;
        try {
            this.av = arg10;
            if(this.ab == null && (this.af.isEmpty())) {
                return;
            }

            int v0 = 0xBC6BDC75;
            int v2 = 2103510945;
            if(em.al(this.ad * v0, this.aq * v2, arg5, 0x72AA54F5) != null) {
                return;
            }

            arg5 = this.aa(arg8, 0x428E23BA) & 1;
            arg10 = -1841530077;
            int v8 = this.ab != null ? this.ab.aj * arg10 : this.af.getFirst().aj * arg10;
            if((arg5 & arg9.aj(v8, -643409897)) == 0) {
                return;
            }

            cv v5_1 = hc.ax(arg9.ab(v8, 0x5104C72C), -27);
            es v8_1 = new es(this.av * 0xE3DF9540, this.av * 0xE3DF9540);
            cc.ae.bx(v8_1, -26);
            if(this.ab != null) {
                this.ag(arg6, arg7, v5_1, -109);
            }
            else {
                this.ah(arg6, arg7, v5_1, 0x96D4E542);
            }

            lt.ae(v8_1, this.ad * v0, this.aq * v2, this.av * 0x178F7E55, 0xC6890852);
            this.av(-41);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("cc.au(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    void av(byte arg3) {
        try {
            int v0 = 0x1036BFA7;
            if(this.ab != null) {
                this.ab.ad(v0);
            }
            else {
                Iterator v3_1 = this.af.iterator();
                while(v3_1.hasNext()) {
                    v3_1.next().ad(v0);
                }
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("cc.av(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }
    }

    void aw(int arg21, int arg22, ck arg23, cl arg24, int arg25) {
        cc v1 = this;
        ck v3 = arg23;
        int v5 = 1;
        try {
            while(true) {
            label_4:
                if(v5 >= v3.ap * 0xCA01D035) {
                    return;
                }

                int v6 = v3.ab[v5][arg21][arg22] - 1;
                if(v6 > -1) {
                    v6 = ez.ax(v6, v1.ai * 0xA20AB9FF, 0x7A69C9FE);
                    int v8 = 0x178F7E55;
                    if(v3.af[v5][arg21][arg22] == 0) {
                        cc.ar.ar(v1.av * v8 * arg21, (0x3F - arg22) * (v1.av * v8), v1.av * v8, v1.av * v8, v6, 2);
                    }
                    else {
                        arg24.ax(v1.av * v8 * arg21, v1.av * v8 * (0x3F - arg22), 0, v6, v1.av * v8, v1.av * v8, v3.af[v5][arg21][arg22], v3.ai[v5][arg21][arg22], cc.ar, 0x5047398A);
                    }
                }

                break;
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cc.aw(");
            v2.append(')');
            throw lx.al(((Throwable)v0), v2.toString());
        }

        ++v5;
        goto label_4;
    }

    void ay(int arg27, int arg28, ck arg29, cl arg30, cv arg31, int arg32) {
        cc v7 = this;
        ck v8 = arg29;
        try {
            int v1 = v8.aq[0][arg27][arg28] - 1;
            int v10 = v8.ab[0][arg27][arg28] - 1;
            int v2 = 0xA20AB9FF;
            int v11 = -1;
            int v12 = 0x178F7E55;
            if(v11 == v1 && v10 == v11) {
                cc.ar.ar(arg27 * (v7.av * v12), (0x3F - arg28) * (v7.av * v12), v7.av * v12, v7.av * v12, v7.ai * v2, 2);
            }

            int v18 = v10 != v11 ? ez.ax(v10, v7.ai * v2, 1607980851) : 0xFF00FF;
            if(v10 > v11 && v8.af[0][arg27][arg28] == 0) {
                cc.ar.ar(v7.av * v12 * arg27, v7.av * v12 * (0x3F - arg28), v7.av * v12, v7.av * v12, v18, 2);
                return;
            }

            int v24 = this.ao(arg27, arg28, arg29, arg31, 0xFC344067);
            if(v11 == v10) {
                cc.ar.ar(arg27 * (v7.av * v12), v7.av * v12 * (0x3F - arg28), v7.av * v12, v7.av * v12, v24, 2);
                return;
            }

            arg30.ax(arg27 * (v7.av * v12), v7.av * v12 * (0x3F - arg28), v24, v18, v7.av * v12, v7.av * v12, v8.af[0][arg27][arg28], v8.ai[0][arg27][arg28], cc.ar, 663378610);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("cc.ay(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    void az(HashSet arg12, int arg13, int arg14, fa arg15, byte arg16) {
        cc v9 = this;
        try {
            Iterator v0_1 = v9.au.values().iterator();
            while(v0_1.hasNext()) {
                Object v1 = v0_1.next();
                if(!((cg)v1).ap(1023204699)) {
                    continue;
                }

                int v2 = ((cg)v1).al(36);
                if(!arg12.contains(Integer.valueOf(v2))) {
                    continue;
                }

                this.ba(ae.al(v2, 16), ((cg)v1).ae * 0x307BE153, 0x106821F3 * ((cg)v1).ar, arg13, arg14, arg15, -1821210610);
            }

            this.bd(arg12, arg13, arg14, arg15, 37506080);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("cc.az(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    void ba(da arg12, int arg13, int arg14, int arg15, int arg16, fa arg17, int arg18) {
        byte v2 = 26;
        try {
            es v1 = arg12.ap(false, v2);
            if(v1 == null) {
                return;
            }

            arg17.am(v1, arg13 - v1.al / 2, arg14 - v1.ae / 2, -807658005);
            if(arg15 % arg16 < arg16 / 2) {
                arg17.av(arg13, arg14, 15, 0xFFFF00, 0x80, -1097537491);
                arg17.ai(arg13, arg14, 7, 0xFFFFFF, -111);
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("cc.ba(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0), v1_1.toString());
        }
    }

    static es bb(int arg2, int arg3, int arg4) {
        return cc.aj.ax(aw.ax(arg2, arg3, arg4, -78));
    }

    static es bc(int arg2, int arg3, int arg4) {
        return cc.aj.ax(aw.ax(arg2, arg3, arg4, -71));
    }

    void bd(HashSet arg12, int arg13, int arg14, fa arg15, int arg16) {
        cc v9 = this;
        try {
            Iterator v0_1 = v9.aa.iterator();
            while(v0_1.hasNext()) {
                Object v1 = v0_1.next();
                if(!((cg)v1).ap(1023204699)) {
                    continue;
                }

                da v2 = ae.al(((cg)v1).al(-74), 16);
                if(v2 == null) {
                    continue;
                }

                if(!arg12.contains(Integer.valueOf(v2.ad(-39)))) {
                    continue;
                }

                this.ba(v2, ((cg)v1).ae * 0x307BE153, 0x106821F3 * ((cg)v1).ar, arg13, arg14, arg15, 0x8A600240);
            }
        }
        catch(RuntimeException v0) {
            goto label_39;
        }

        return;
    label_39:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("cc.bd(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0), v1_1.toString());
    }

    static void be() {
        cc.aj.ap();
    }

    public static final void bf(double arg3) {
        int v1 = 0x200;
        int v2 = 0x6C64E30;
        try {
            kj.bn(arg3, 0, v1, v2);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cc.bf(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void bf(cg arg10, int arg11, int arg12, float arg13, fa arg14, int arg15) {
        byte v15 = 30;
        try {
            da v15_1 = ae.al(arg10.al(v15), 16);
            this.bn(v15_1, arg11, arg12, arg14, 0x38FBA074);
            this.bp(arg10, v15_1, arg11, arg12, arg13, arg14, 4);
            return;
        }
        catch(RuntimeException v10) {
            StringBuilder v11 = new StringBuilder();
            v11.append("cc.bf(");
            v11.append(')');
            throw lx.al(((Throwable)v10), v11.toString());
        }
    }

    List bg(byte arg3) {
        try {
            LinkedList v3_1 = new LinkedList();
            ((List)v3_1).addAll(this.aa);
            ((List)v3_1).addAll(this.au.values());
            return ((List)v3_1);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cc.bg(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static long bh(int arg0, int arg1, int arg2) {
        return ((long)(arg0 << 8 | arg2 << 16 | arg1));
    }

    public static void bi() {
        cc.aj.an(5);
    }

    static void bj(es arg2, int arg3, int arg4, int arg5) {
        cc.aj.ar(arg2, aw.ax(arg3, arg4, arg5, -20), arg2.ax.length * 4);
    }

    static void bk(int arg1, byte arg2) {
        int v2 = 0x89751516;
        try {
            hq.cm = v2;
            hq.ch = arg1 * -1719607703;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("cc.bk(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }
    }

    static es bk(int arg2, int arg3, int arg4) {
        return cc.aj.ax(aw.ax(arg2, arg3, arg4, 0));
    }

    static void bl() {
        cc.aj.ap();
    }

    static void bm(es arg2, int arg3, int arg4, int arg5) {
        cc.aj.ar(arg2, aw.ax(arg3, arg4, arg5, -28), arg2.ax.length * 4);
    }

    void bn(da arg3, int arg4, int arg5, fa arg6, int arg7) {
        byte v0 = 20;
        try {
            es v7 = arg3.ap(false, v0);
            if(v7 != null) {
                arg6.am(v7, this.bo(v7, arg3.ah, 0x610529BC) + arg4, this.by(v7, arg3.at, 6) + arg5, -807658005);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cc.bn(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    int bo(es arg1, dl arg2, int arg3) {
        arg3 = 0x3F9DA0CB;
        try {
            int v2 = arg2.ar * arg3;
            if(v2 == 0) {
                return 0;
            }

            arg3 = 2;
            if(v2 != arg3) {
                return -arg1.al;
            }

            return -arg1.al / arg3;
        }
        catch(RuntimeException v1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("cc.bo(");
            v2_1.append(')');
            throw lx.al(((Throwable)v1), v2_1.toString());
        }

        return 0;
    }

    void bp(cg arg16, da arg17, int arg18, int arg19, float arg20, fa arg21, byte arg22) {
        cn v0_2;
        byte v0 = -6;
        cg v1 = arg16;
        try {
            v0_2 = v1.ae(v0);
            if(v0_2 == null) {
                return;
            }

            if(v0_2.ar.al(arg20, -7022569)) {
                goto label_11;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_47;
        }

        return;
    label_11:
        cc v1_1 = this;
        try {
            Object v3 = v1_1.am.get(v0_2.ar);
            ((od)v3).av(v0_2.ax, arg18 - v0_2.al * 0xB7DBFCE3 / 2, arg19, v0_2.al * 0xB7DBFCE3, v0_2.ae * 0xC4C715CF, arg17.aq * 0xBD8DEC7D | 0xFF000000, 0, 1, 0, ((od)v3).aj / 2, arg21);
            return;
        }
        catch(RuntimeException v0_1) {
        }

    label_47:
        StringBuilder v2 = new StringBuilder();
        v2.append("cc.bp(");
        v2.append(')');
        throw lx.al(((Throwable)v0_1), v2.toString());
    }

    cn bq(da arg7, byte arg8) {
        cn v0;
        try {
            v0 = null;
            if(arg7.ad != null && this.am != null) {
                if(this.am.get(cz.ax) == null) {
                }
                else {
                    cz v8 = cz.ae(arg7.ab * 0xD6D0BF01, 0x7F030213);
                    if(v8 == null) {
                        return v0;
                    }
                    else {
                        Object v1 = this.am.get(v8);
                        if(v1 == null) {
                            return v0;
                        }
                        else {
                            String[] v2 = new String[((od)v1).aj(arg7.ad, 1000000)];
                            ((od)v1).an(arg7.ad, ((int[])v0), v2);
                            int v0_1 = ((od)v1).aj * v2.length / 2;
                            int v3 = 0;
                            int v4 = 0;
                            while(v3 < v2.length) {
                                int v5 = ((od)v1).ar(v2[v3]);
                                if(v5 > v4) {
                                    v4 = v5;
                                }

                                ++v3;
                            }

                            return new cn(arg7.ad, v4, v0_1, v8);
                        }
                    }
                }
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v8_1 = new StringBuilder();
            v8_1.append("cc.bq(");
            v8_1.append(')');
            throw lx.al(((Throwable)v7), v8_1.toString());
        }

        return v0;
    }

    static void br() {
        cc.aj.ap();
    }

    static void bs(es arg2, int arg3, int arg4, int arg5) {
        cc.aj.ar(arg2, aw.ax(arg3, arg4, arg5, 6), arg2.ax.length * 4);
    }

    static void bu(es arg2, int arg3, int arg4, int arg5) {
        cc.aj.ar(arg2, aw.ax(arg3, arg4, arg5, -106), arg2.ax.length * 4);
    }

    cn bv(int arg2, int arg3) {
        byte v3 = 16;
        try {
            return this.bq(ae.al(arg2, v3), 0x7B);
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("cc.bv(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    void bw(int arg8, int arg9, HashSet arg10, int arg11, fa arg12, byte arg13) {
        float v11 = (((float)arg11)) / 64f;
        try {
            Iterator v13 = this.aa.iterator();
            while(v13.hasNext()) {
                Object v1 = v13.next();
                if(!((cg)v1).ap(1023204699)) {
                    continue;
                }

                int v2 = ((cg)v1).ax.al * 0xAEACF223 % 0x40;
                int v0 = ((cg)v1).ax.ae * 0xB230B0A5 % 0x40;
                ((cg)v1).ae = (((int)((((float)arg8)) + (((float)v2)) * v11))) * 0x1FC30ADB;
                ((cg)v1).ar = (((int)((((float)arg9)) + (((float)(0x3F - v0))) * v11))) * 0x31BD5F3B;
                if(arg10.contains(Integer.valueOf(((cg)v1).al(-121)))) {
                    continue;
                }

                this.bf(((cg)v1), ((cg)v1).ae * 0x307BE153, ((cg)v1).ar * 0x106821F3, v11, arg12, 0x95D10F97);
            }
        }
        catch(RuntimeException v8) {
            goto label_61;
        }

        return;
    label_61:
        StringBuilder v9 = new StringBuilder();
        v9.append("cc.bw(");
        v9.append(')');
        throw lx.al(((Throwable)v8), v9.toString());
    }

    List bx(int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        Object v3;
        LinkedList v7;
        try {
            v7 = new LinkedList();
            if(arg5 >= arg2) {
                if(arg6 < arg3) {
                }
                else {
                    if(arg5 < arg2 + arg4) {
                        if(arg6 >= arg3 + arg4) {
                        }
                        else {
                            Iterator v2_1 = this.au.values().iterator();
                            while(true) {
                                arg4 = 1023204699;
                                if(!v2_1.hasNext()) {
                                    break;
                                }

                                v3 = v2_1.next();
                                if(!((cg)v3).ap(arg4)) {
                                    continue;
                                }

                                if(!((cg)v3).ax(arg5, arg6, 0x1B0C1036)) {
                                    continue;
                                }

                                v7.add(v3);
                            }

                            v2_1 = this.aa.iterator();
                            while(true) {
                                if(v2_1.hasNext()) {
                                    v3 = v2_1.next();
                                    if(!((cg)v3).ap(arg4)) {
                                        continue;
                                    }

                                    if(!((cg)v3).ax(arg5, arg6, 0x73D896D1)) {
                                        continue;
                                    }

                                    v7.add(v3);
                                    continue;
                                }
                                else {
                                    goto label_36;
                                }
                            }
                        }
                    }

                    goto label_37;
                }
            }

            goto label_38;
        }
        catch(RuntimeException v2) {
            goto label_41;
        }

    label_36:
        return ((List)v7);
    label_41:
        StringBuilder v3_1 = new StringBuilder();
        v3_1.append("cc.bx(");
        v3_1.append(')');
        throw lx.al(((Throwable)v2), v3_1.toString());
    label_37:
        return ((List)v7);
    label_38:
        return ((List)v7);
    }

    int by(es arg1, dz arg2, byte arg3) {
        int v1_1;
        int v3 = -1092861077;
        try {
            switch(arg2.ar * v3) {
                case 1: {
                    goto label_8;
                }
                case 2: {
                    return 0;
                }
            }

            v1_1 = arg1.ae;
        }
        catch(RuntimeException v1) {
            goto label_16;
        }

        return -v1_1;
        try {
        label_8:
            return -arg1.ae / 2;
        }
        catch(RuntimeException v1) {
        label_16:
            StringBuilder v2 = new StringBuilder();
            v2.append("cc.by(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void bz(int arg9, int arg10, int arg11, int arg12, short arg13) {
        try {
            arg11 %= 4;
            int v13 = 0x178F7E55;
            if(arg11 == 0) {
                cc.ar.aq(this.av * v13 * arg9, this.av * v13 * (0x3F - arg10), this.av * v13, arg12, 0x1795F574);
            }

            if(1 == arg11) {
                cc.ar.aj(this.av * v13 * arg9, (0x3F - arg10) * (this.av * v13), this.av * v13, arg12, 0x5AEEFFBB);
            }

            if(arg11 == 2) {
                cc.ar.aq(this.av * v13 + this.av * v13 * arg9 - 1, (0x3F - arg10) * (this.av * v13), this.av * v13, arg12, 0x1795F574);
            }

            if(arg11 == 3) {
                cc.ar.aj(this.av * v13 * arg9, this.av * v13 + (0x3F - arg10) * (this.av * v13) - 1, this.av * v13, arg12, 1984349027);
            }
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("cc.bz(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public static void ca() {
        cc.aj.an(5);
    }

    void cb(cp arg2, List arg3) {
        this.au.clear();
        this.ab = arg2;
        this.ai(arg3, 1);
    }

    void cc(cp arg2, List arg3) {
        this.au.clear();
        this.ab = arg2;
        this.ai(arg3, 1);
    }

    void cd(int arg12, int arg13, int arg14, fa arg15) {
        es v5 = em.al(this.ad * 0xBC6BDC75, this.aq * 2103510945, this.av * 0x178F7E55, 2038688565);
        if(v5 == null) {
            return;
        }

        if(this.av * 0xE3DF9540 == arg14) {
            arg15.aa(v5, arg12, arg13, 25);
        }
        else {
            arg15.bq(v5, arg12, arg13, arg14, arg14, 0xF73FC717);
        }
    }

    void ce(do arg7, int arg8, int arg9, int arg10, ck arg11) {
        co v8_1;
        af v0 = new af(arg8, this.ad * 0x1AF71D40 + arg9, this.aq * 1480714304 + arg10);
        int v2 = 0x16004E40;
        int v3 = 0x514187C0;
        int v4 = 0x8D507D7F;
        af v11 = this.ab != null ? new af(arg8 + this.ab.an * v4, this.ab.ax * v3 + arg9, this.ab.al * v2 + arg10) : new af(arg8 + ((cq)arg11).an * v4, ((cq)arg11).ax * v3 + arg9 + ((cq)arg11).ae(0x188309D3) * 8, ((cq)arg11).al * v2 + arg10 + ((cq)arg11).ar(1422376092) * 8);
        if(arg7.bc != null) {
            dm v8 = new dm(v11, v0, arg7.aq * 0x9BAF8E95, this);
        }
        else {
            da v7 = ae.al(arg7.bn * 1284025131, 16);
            v8_1 = new co(v11, v0, v7.an * 0x11F2C855, this.bq(v7, 75));
        }

        this.au.put(new af(0, arg9, arg10), v8_1);
    }

    void cf(int arg12, int arg13, int arg14, fa arg15) {
        es v5 = em.al(this.ad * 0xBC6BDC75, this.aq * 2103510945, this.av * 0x178F7E55, 0x74AE73E5);
        if(v5 == null) {
            return;
        }

        if(this.av * 0xE3DF9540 == arg14) {
            arg15.aa(v5, arg12, arg13, 25);
        }
        else {
            arg15.bq(v5, arg12, arg13, arg14, arg14, 631938405);
        }
    }

    void cg(int arg8, int arg9, int arg10, HashSet arg11, fa arg12) {
        if(arg11 == null) {
            arg11 = new HashSet();
        }

        this.ac(arg8, arg9, arg11, arg10, arg12, 0x27259DDF);
        this.bw(arg8, arg9, arg11, arg10, arg12, 0x30);
    }

    void ch(int arg10, int arg11, int arg12, int arg13, ck arg14) {
        do v4;
        int v7;
        for(v7 = arg10; v7 < arg10 + arg12; ++v7) {
            int v8;
            for(v8 = arg11; v8 < arg13 + arg11; ++v8) {
                int v2;
                for(v2 = 0; v2 < arg14.ap * 0xCA01D035; ++v2) {
                    du[] v1 = arg14.av[v2][v7][v8];
                    if(v1 != null) {
                        if(v1.length == 0) {
                        }
                        else {
                            int v3 = 0;
                            while(true) {
                                if(v3 < v1.length) {
                                    v4 = ok.al(v1[v3].ax * 0xFF5623B1, 0xC888D9B0);
                                    if(!ab.bt(v4, 0x27E3B23B)) {
                                        ++v3;
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }

                                goto label_42;
                            }

                            this.ab(v4, v2, v7, v8, arg14, 0x9D3481E0);
                            break;
                        }
                    }

                label_42:
                }
            }
        }
    }

    void ci(int arg10, int arg11, int arg12, int arg13, ck arg14) {
        do v4;
        int v7;
        for(v7 = arg10; v7 < arg10 + arg12; ++v7) {
            int v8;
            for(v8 = arg11; v8 < arg13 + arg11; ++v8) {
                int v2;
                for(v2 = 0; v2 < arg14.ap * 0xCA01D035; ++v2) {
                    du[] v1 = arg14.av[v2][v7][v8];
                    if(v1 != null) {
                        if(v1.length == 0) {
                        }
                        else {
                            int v3 = 0;
                            while(true) {
                                if(v3 < v1.length) {
                                    v4 = ok.al(v1[v3].ax * 0xFF5623B1, 0xA787B8F9);
                                    if(!ab.bt(v4, 0x1CCD03E7)) {
                                        ++v3;
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }

                                goto label_42;
                            }

                            this.ab(v4, v2, v7, v8, arg14, -2038008586);
                            break;
                        }
                    }

                label_42:
                }
            }
        }
    }

    public static void cj() {
        cc.aj.an(5);
    }

    boolean ck(ko arg10) {
        this.au.clear();
        int v1 = 1;
        if(this.ab != null) {
            this.ab.aq(arg10, -2083059753);
            if(this.ab.aj(0x60875A84)) {
                this.aq(0, 0, 0xBCE77E52, 0x40, this.ab, -968906066);
                return 1;
            }

            return 0;
        }

        Iterator v0 = this.af.iterator();
        while(v0.hasNext()) {
            Object v2 = v0.next();
            ((cq)v2).aq(arg10, 0x80AA4241);
            v1 &= ((cq)v2).aj(970913410);
        }

        if(v1 != 0) {
            Iterator v10 = this.af.iterator();
            while(v10.hasNext()) {
                Object v7 = v10.next();
                this.aq(((cq)v7).an(0x972F6DDE) * 8, ((cq)v7).bh(0xD457367B) * 8, 8, 8, ((ck)v7), -594800240);
            }
        }

        return ((boolean)v1);
    }

    boolean cl(ko arg10) {
        this.au.clear();
        int v1 = 1;
        if(this.ab != null) {
            this.ab.aq(arg10, 0x80D0E6FE);
            if(this.ab.aj(0x620EF66A)) {
                this.aq(0, 0, 0x40, 0x40, this.ab, 0xF18DE562);
                return 1;
            }

            return 0;
        }

        Iterator v0 = this.af.iterator();
        while(v0.hasNext()) {
            Object v2 = v0.next();
            ((cq)v2).aq(arg10, -2080048474);
            v1 &= ((cq)v2).aj(0x442C1384);
        }

        if(v1 != 0) {
            Iterator v10 = this.af.iterator();
            while(v10.hasNext()) {
                Object v7 = v10.next();
                this.aq(((cq)v7).an(-1488023063) * 8, ((cq)v7).bh(0xD86F996E) * 8, 8, 8, ((ck)v7), 0x5AEF5084);
            }
        }

        return ((boolean)v1);
    }

    void cm(int arg5, cl arg6, ef[] arg7, ko arg8, ko arg9) {
        this.av = 0x5C02BB73 * arg5;
        if(this.ab == null && (this.af.isEmpty())) {
            return;
        }

        int v1 = 0xBC6BDC75;
        if(em.al(this.ad * v1, this.aq * 0xBD85705D, arg5, 0x7C506CEC) != null) {
            return;
        }

        arg5 = this.aa(arg8, -1490961800) & 1;
        int v8 = this.ab != null ? this.ab.aj * 0x663472C7 : this.af.getFirst().aj * -1841530077;
        if((arg5 & arg9.aj(v8, 0x6C443D9C)) == 0) {
            return;
        }

        cv v5 = hc.ax(arg9.ab(v8, 0x6FB5C30B), -61);
        es v8_1 = new es(this.av * 0x7281F429, this.av * 0xE3DF9540);
        cc.ae.bx(v8_1, -82);
        if(this.ab != null) {
            this.ag(arg6, arg7, v5, -85);
        }
        else {
            this.ah(arg6, arg7, v5, 0x76F7AEEF);
        }

        lt.ae(v8_1, this.ad * v1, this.aq * 2103510945, this.av * -2075001879, 0x6FE4B801);
        this.av(53);
    }

    void cn() {
        int v1 = 0x1036BFA7;
        if(this.ab != null) {
            this.ab.ad(v1);
        }
        else {
            Iterator v0 = this.af.iterator();
            while(v0.hasNext()) {
                v0.next().ad(v1);
            }
        }
    }

    void co(int arg8, int arg9, int arg10, HashSet arg11, fa arg12) {
        if(arg11 == null) {
            arg11 = new HashSet();
        }

        this.ac(arg8, arg9, arg11, arg10, arg12, 0x27259DDF);
        this.bw(arg8, arg9, arg11, arg10, arg12, 0x30);
    }

    void cp(HashSet arg5, List arg6) {
        this.au.clear();
        Iterator v5 = arg5.iterator();
        while(v5.hasNext()) {
            Object v0 = v5.next();
            if(((cq)v0).av(0xA6BBCEF4) != this.ad * 0xBC6BDC75) {
                continue;
            }

            if(((cq)v0).aa(260) != this.aq * 2103510945) {
                continue;
            }

            this.af.add(v0);
        }

        this.ai(arg6, 1);
    }

    void cq(int arg4, cl arg5, ef[] arg6, ko arg7, ko arg8) {
        this.av = -710308099 * arg4;
        if(this.ab == null && (this.af.isEmpty())) {
            return;
        }

        if(em.al(this.ad * 0xA6FF8F37, this.aq * 0x1208A8F3, arg4, 1905026598) != null) {
            return;
        }

        arg4 = this.aa(arg7, 0xED0B2315) & 1;
        int v7 = this.ab != null ? this.ab.aj * 0x71246908 : this.af.getFirst().aj * -1841530077;
        if((arg4 & arg8.aj(v7, 0xF7B8B540)) == 0) {
            return;
        }

        cv v4 = hc.ax(arg8.ab(v7, 0x4EF6C7A2), -31);
        es v7_1 = new es(this.av * 0xE3DF9540, this.av * 0xE3DF9540);
        cc.ae.bx(v7_1, 98);
        if(this.ab != null) {
            this.ag(arg5, arg6, v4, -47);
        }
        else {
            this.ah(arg5, arg6, v4, 0x1CB41725);
        }

        lt.ae(v7_1, this.ad * 0xBC187221, this.aq * 1906237828, this.av * 2097246609, 0x4C87C04F);
        this.av(-5);
    }

    void cr(int arg10, int arg11, int arg12, int arg13, ck arg14) {
        do v4;
        int v7;
        for(v7 = arg10; v7 < arg10 + arg12; ++v7) {
            int v8;
            for(v8 = arg11; v8 < arg13 + arg11; ++v8) {
                int v2;
                for(v2 = 0; v2 < arg14.ap * 0xAAEA3F3D; ++v2) {
                    du[] v1 = arg14.av[v2][v7][v8];
                    if(v1 != null) {
                        if(v1.length == 0) {
                        }
                        else {
                            int v3 = 0;
                            while(true) {
                                if(v3 < v1.length) {
                                    v4 = ok.al(v1[v3].ax * 0xFF5623B1, 1186017049);
                                    if(!ab.bt(v4, -211740093)) {
                                        ++v3;
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }

                                goto label_42;
                            }

                            this.ab(v4, v2, v7, v8, arg14, 0x88DFCBF6);
                            break;
                        }
                    }

                label_42:
                }
            }
        }
    }

    void cs() {
        Iterator v0 = this.au.values().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            if(!(v1 instanceof dm)) {
                continue;
            }

            ((dm)v1).at(0);
        }
    }

    void ct(int arg5, cl arg6, ef[] arg7, ko arg8, ko arg9) {
        this.av = -710308099 * arg5;
        if(this.ab == null && (this.af.isEmpty())) {
            return;
        }

        int v1 = 0xBC6BDC75;
        if(em.al(this.ad * v1, this.aq * 0x97CF0D10, arg5, 1777017187) != null) {
            return;
        }

        arg5 = this.aa(arg8, 0x2277D93E) & 1;
        int v8 = this.ab != null ? this.ab.aj * 0xC88F310D : this.af.getFirst().aj * -1841530077;
        if((arg5 & arg9.aj(v8, -107711860)) == 0) {
            return;
        }

        cv v5 = hc.ax(arg9.ab(v8, 0x6B155428), -35);
        es v8_1 = new es(this.av * 0x22B7BD27, this.av * 0xE3DF9540);
        cc.ae.bx(v8_1, 27);
        if(this.ab != null) {
            this.ag(arg6, arg7, v5, -86);
        }
        else {
            this.ah(arg6, arg7, v5, -1220732183);
        }

        lt.ae(v8_1, this.ad * v1, this.aq * 2103510945, this.av * 0x178F7E55, 0xAFE91070);
        this.av(-108);
    }

    void cu(int arg6, cl arg7, ef[] arg8, ko arg9, ko arg10) {
        this.av = -710308099 * arg6;
        if(this.ab == null && (this.af.isEmpty())) {
            return;
        }

        int v1 = 0xBC6BDC75;
        int v3 = 2103510945;
        if(em.al(this.ad * v1, this.aq * v3, arg6, 0x676824B2) != null) {
            return;
        }

        arg6 = this.aa(arg9, 0x9EF3F13E) & 1;
        int v0 = -1841530077;
        int v9 = this.ab != null ? this.ab.aj * v0 : this.af.getFirst().aj * v0;
        if((arg6 & arg10.aj(v9, 0x1D9F69CA)) == 0) {
            return;
        }

        cv v6 = hc.ax(arg10.ab(v9, 1252462930), 107);
        es v9_1 = new es(this.av * 0xE3DF9540, this.av * 0xE3DF9540);
        cc.ae.bx(v9_1, 0x60);
        if(this.ab != null) {
            this.ag(arg7, arg8, v6, -54);
        }
        else {
            this.ah(arg7, arg8, v6, 0x9C5D24D0);
        }

        lt.ae(v9_1, this.ad * v1, this.aq * v3, this.av * 0x178F7E55, 1189840243);
        this.av(0x1F);
    }

    void cv(int arg8, int arg9, int arg10, HashSet arg11, fa arg12) {
        if(arg11 == null) {
            arg11 = new HashSet();
        }

        this.ac(arg8, arg9, arg11, arg10, arg12, 0x27259DDF);
        this.bw(arg8, arg9, arg11, arg10, arg12, 0x30);
    }

    void cw(cp arg2, List arg3) {
        this.au.clear();
        this.ab = arg2;
        this.ai(arg3, 1);
    }

    void cx(cp arg2, List arg3) {
        this.au.clear();
        this.ab = arg2;
        this.ai(arg3, 1);
    }

    void cy(cp arg2, List arg3) {
        this.au.clear();
        this.ab = arg2;
        this.ai(arg3, 1);
    }

    void cz() {
        int v1 = 0x1036BFA7;
        if(this.ab != null) {
            this.ab.ad(v1);
        }
        else {
            Iterator v0 = this.af.iterator();
            while(v0.hasNext()) {
                v0.next().ad(v1);
            }
        }
    }

    void da(int arg24, int arg25, ck arg26) {
        int v8;
        cc v6 = this;
        ck v7 = arg26;
        int v9;
        for(v9 = 0; v9 < v7.ap * 0xCA01D035; ++v9) {
            du[] v10 = v7.av[v9][arg24][arg25];
            if(v10 != null) {
                if(v10.length == 0) {
                }
                else {
                    int v11;
                    for(v11 = 0; v11 < v10.length; ++v11) {
                        du v12 = v10[v11];
                        int v13 = 0xFE370D39;
                        if(ao.al(v12.al * v13, 2047770015)) {
                            int v20 = ok.al(v12.ax * 0xFF5623B1, 1481009364).ay * 0xE5018CDF != 0 ? 0xFFCC0000 : 0xFFCCCCCC;
                            int v21 = 0x675599ED;
                            int v22 = -2106048683;
                            if(v12.al * v13 == ga.ax.as * v21) {
                                this.bz(arg24, arg25, v12.ae * v22, v20, 3130);
                            }

                            if(v12.al * v13 == ga.ae.as * v21) {
                                v8 = 1;
                                this.bz(arg24, arg25, v12.ae * v22, 0xFFCCCCCC, 3130);
                                this.bz(arg24, arg25, v12.ae * v22 + 1, v20, 3130);
                            }
                            else {
                                v8 = 1;
                            }

                            int v2 = 2;
                            int v3 = 0x178F7E55;
                            if(v12.al * v13 == ga.ar.as * v21) {
                                if(v12.ae * v22 == 0) {
                                    cc.ar.aj(v6.av * v3 * arg24, (0x3F - arg25) * (v6.av * v3), 1, v20, 0x5C4D4AEB);
                                }

                                if(v12.ae * v22 == v8) {
                                    cc.ar.aj(v6.av * v3 + v6.av * v3 * arg24 - 1, v6.av * v3 * (0x3F - arg25), 1, v20, 0x2C015FFE);
                                }

                                if(v2 == v12.ae * v22) {
                                    cc.ar.aj(v6.av * v3 * arg24 + v6.av * v3 - 1, v6.av * v3 + (0x3F - arg25) * (v6.av * v3) - 1, 1, v20, 0x6997BAFE);
                                }

                                if(v12.ae * v22 != 3) {
                                    goto label_168;
                                }

                                cc.ar.aj(arg24 * (v6.av * v3), v6.av * v3 + v6.av * v3 * (0x3F - arg25) - 1, 1, v20, 504767139);
                            }

                        label_168:
                            if(ga.an.as * v21 != v12.al * v13) {
                                goto label_219;
                            }

                            if(v12.ae * v22 % v2 == 0) {
                                int v0;
                                for(v0 = 0; true; ++v0) {
                                    if(v0 >= v6.av * v3) {
                                        break;
                                    }

                                    cc.ar.aj(v6.av * v3 * arg24 + v0, v6.av * v3 * (0x40 - arg25) - v8 - v0, 1, v20, 0xD5605BB3);
                                }
                            }

                            for(v0 = 0; v0 < v6.av * v3; ++v0) {
                                cc.ar.aj(v0 + v6.av * v3 * arg24, v6.av * v3 * (0x3F - arg25) + v0, 1, v20, 0xEC7C6850);
                            }
                        }

                    label_219:
                    }
                }
            }
        }
    }

    void db(cl arg12, ef[] arg13, cv arg14) {
        int v8;
        for(v8 = 0; true; ++v8) {
            int v9 = 0x40;
            if(v8 >= v9) {
                break;
            }

            int v10;
            for(v10 = 0; v10 < v9; ++v10) {
                this.ay(v8, v10, this.ab, arg12, arg14, 0x90EF8288);
                this.aw(v8, v10, this.ab, arg12, 1586404472);
            }
        }

        int v14;
        for(v14 = 0; v14 < v9; ++v14) {
            for(v8 = 0; v8 < v9; ++v8) {
                this.at(v14, v8, this.ab, arg12, arg13, 0xF01EE542);
            }
        }
    }

    void dc(int arg7, int arg8, ck arg9, cl arg10, ef[] arg11) {
        this.ak(arg7, arg8, arg9, 0x8F6F110B);
        this.as(arg7, arg8, arg9, arg11, -73);
    }

    void dd(int arg11, int arg12, HashSet arg13, int arg14, fa arg15) {
        float v0 = (((float)arg14)) / 64f;
        float v1 = v0 / 2f;
        Iterator v9 = this.au.entrySet().iterator();
        while(v9.hasNext()) {
            Object v2 = v9.next();
            Object v3 = ((Map$Entry)v2).getKey();
            int v4 = ((int)((((float)arg11)) + (((float)(((af)v3).al * 0xAEACF223))) * v0 - v1));
            int v5 = ((int)((((float)(arg12 + arg14))) - (((float)(((af)v3).ae * 0xB230B0A5))) * v0 - v1));
            v3 = ((Map$Entry)v2).getValue();
            if(v3 == null) {
                continue;
            }

            if(!((cg)v3).ap(1023204699)) {
                continue;
            }

            ((cg)v3).ae = 0x1FC30ADB * v4;
            ((cg)v3).ar = 0x31BD5F3B * v5;
            if(arg13.contains(Integer.valueOf(ae.al(((cg)v3).al(-83), 16).ad(-97)))) {
                continue;
            }

            this.bf(((cg)v3), v4, v5, v0, arg15, 0x95D10F97);
        }
    }

    void de(int arg7, int arg8, ck arg9, cl arg10, ef[] arg11) {
        this.ak(arg7, arg8, arg9, -1840714733);
        this.as(arg7, arg8, arg9, arg11, -8);
    }

    void df(int arg19, int arg20, ck arg21, cl arg22) {
        cc v0 = this;
        ck v1 = arg21;
        int v3;
        for(v3 = 1; v3 < v1.ap * 0xCA01D035; ++v3) {
            int v4 = v1.ab[v3][arg19][arg20] - 1;
            if(v4 > -1) {
                v4 = ez.ax(v4, v0.ai * 0xA20AB9FF, 0x37D55F18);
                int v6 = 0x178F7E55;
                if(v1.af[v3][arg19][arg20] == 0) {
                    cc.ar.ar(v0.av * v6 * arg19, (0x3F - arg20) * (v0.av * v6), v0.av * v6, v0.av * v6, v4, 2);
                }
                else {
                    arg22.ax(v0.av * v6 * arg19, v0.av * v6 * (0x3F - arg20), 0, v4, v0.av * v6, v0.av * v6, v1.af[v3][arg19][arg20], v1.ai[v3][arg19][arg20], cc.ar, 1486600566);
                }
            }
        }
    }

    void dg(int arg11, int arg12, HashSet arg13, int arg14, fa arg15) {
        float v0 = (((float)arg14)) / 64f;
        float v1 = v0 / 2f;
        Iterator v9 = this.au.entrySet().iterator();
        while(v9.hasNext()) {
            Object v2 = v9.next();
            Object v3 = ((Map$Entry)v2).getKey();
            int v4 = ((int)((((float)arg11)) + (((float)(((af)v3).al * 0xAEACF223))) * v0 - v1));
            int v5 = ((int)((((float)(arg12 + arg14))) - (((float)(((af)v3).ae * 0xB230B0A5))) * v0 - v1));
            v3 = ((Map$Entry)v2).getValue();
            if(v3 == null) {
                continue;
            }

            if(!((cg)v3).ap(1023204699)) {
                continue;
            }

            ((cg)v3).ae = 0x1FC30ADB * v4;
            ((cg)v3).ar = 0x31BD5F3B * v5;
            if(arg13.contains(Integer.valueOf(ae.al(((cg)v3).al(-46), 16).ad(-49)))) {
                continue;
            }

            this.bf(((cg)v3), v4, v5, v0, arg15, 0x95D10F97);
        }
    }

    void dh(cl arg12, ef[] arg13, cv arg14) {
        int v8;
        for(v8 = 0; true; ++v8) {
            int v9 = 0x40;
            if(v8 >= v9) {
                break;
            }

            int v10;
            for(v10 = 0; v10 < v9; ++v10) {
                this.ay(v8, v10, this.ab, arg12, arg14, 0x8D485A2E);
                this.aw(v8, v10, this.ab, arg12, 1586404472);
            }
        }

        int v14;
        for(v14 = 0; v14 < v9; ++v14) {
            for(v8 = 0; v8 < v9; ++v8) {
                this.at(v14, v8, this.ab, arg12, arg13, 0xBB47A4B5);
            }
        }
    }

    int di(int arg2, int arg3, ck arg4, cv arg5) {
        if(arg4.aq[0][arg2][arg3] == 0) {
            return this.ai * 0xA20AB9FF;
        }

        return arg5.al(arg2, arg3, 0x309D3146);
    }

    void dj(int arg26, int arg27, ck arg28, cl arg29, cv arg30) {
        cc v6 = this;
        ck v7 = arg28;
        int v0 = v7.aq[0][arg26][arg27] - 1;
        int v9 = v7.ab[0][arg26][arg27] - 1;
        int v10 = -1;
        int v11 = 0x178F7E55;
        if(v10 == v0 && v9 == v10) {
            cc.ar.ar(arg26 * (v6.av * v11), (0xF9DFEDAB - arg27) * (v6.av * v11), v6.av * 0xF808BC25, v6.av * v11, v6.ai * 0xC6B50CC2, 2);
        }

        int v17 = v9 != v10 ? ez.ax(v9, v6.ai * 0xCB65D8C2, 1069045367) : 0x1B3580FB;
        if(v9 > v10 && v7.af[0][arg26][arg27] == 0) {
            cc.ar.ar(v6.av * v11 * arg26, v6.av * v11 * (170574669 - arg27), v6.av * v11, v6.av * v11, v17, 2);
            return;
        }

        int v23 = this.ao(arg26, arg27, arg28, arg30, 0x4E87EADF);
        if(v10 == v9) {
            cc.ar.ar(arg26 * (v6.av * v11), v6.av * 0xEB00307E * (0x3F - arg27), v6.av * v11, v6.av * v11, v23, 2);
            return;
        }

        arg29.ax(arg26 * (v6.av * 0xD703E22), v6.av * 0x228485F9 * (0x3F - arg27), v23, v17, v6.av * v11, v6.av * 0xBF15EF01, v7.af[0][arg26][arg27], v7.ai[0][arg26][arg27], cc.ar, 0x450AAA09);
    }

    void dk(int arg7, int arg8, ck arg9, cl arg10, ef[] arg11) {
        this.ak(arg7, arg8, arg9, 0xA0012A98);
        this.as(arg7, arg8, arg9, arg11, -31);
    }

    int dl(int arg2, int arg3, ck arg4, cv arg5) {
        if(arg4.aq[0][arg2][arg3] == 0) {
            return this.ai * 0xA20AB9FF;
        }

        return arg5.al(arg2, arg3, 0x1A374ADD);
    }

    void dm(cl arg12, ef[] arg13, cv arg14) {
        Iterator v0 = this.af.iterator();
    label_2:
        if(v0.hasNext()) {
            Object v1 = v0.next();
            int v9;
            for(v9 = ((cq)v1).an(0x9180BD25) * 8; true; ++v9) {
                if(v9 >= ((cq)v1).an(0x8EF805DD) * 8 + 8) {
                    goto label_2;
                }

                int v10;
                for(v10 = ((cq)v1).bh(0xE06E20DF) * 8; v10 < ((cq)v1).bh(-237741801) * 8 + 8; ++v10) {
                    this.ay(v9, v10, v1, arg12, arg14, 0xDA417D53);
                    this.aw(v9, v10, v1, arg12, 1586404472);
                }
            }
        }

        Iterator v14 = this.af.iterator();
    label_44:
        if(v14.hasNext()) {
            Object v0_1 = v14.next();
            int v8;
            for(v8 = ((cq)v0_1).an(582203600) * 8; true; ++v8) {
                if(v8 >= ((cq)v0_1).an(0x84D80FED) * 8 + 8) {
                    goto label_44;
                }

                for(v9 = ((cq)v0_1).bh(0xD72540B8) * 8; v9 < ((cq)v0_1).bh(395794800) * 8 + 8; ++v9) {
                    this.at(v8, v9, v0_1, arg12, arg13, 305345774);
                }
            }
        }
    }

    int dn(int arg2, int arg3, ck arg4, cv arg5) {
        if(arg4.aq[0][arg2][arg3] == 0) {
            return this.ai * 0xA20AB9FF;
        }

        return arg5.al(arg2, arg3, 0xFE32BFA9);
    }

    void do(int arg24, int arg25, ck arg26) {
        int v8;
        cc v6 = this;
        ck v7 = arg26;
        int v9;
        for(v9 = 0; v9 < v7.ap * 0xCA01D035; ++v9) {
            du[] v10 = v7.av[v9][arg24][arg25];
            if(v10 != null) {
                if(v10.length == 0) {
                }
                else {
                    int v11;
                    for(v11 = 0; v11 < v10.length; ++v11) {
                        du v12 = v10[v11];
                        int v13 = 0xFE370D39;
                        if(ao.al(v12.al * v13, 0x467C3A18)) {
                            int v20 = ok.al(v12.ax * 0xFF5623B1, 0xD4072024).ay * 0xE5018CDF != 0 ? 0xFFCC0000 : 0xFFCCCCCC;
                            int v21 = 0x675599ED;
                            int v22 = -2106048683;
                            if(v12.al * v13 == ga.ax.as * v21) {
                                this.bz(arg24, arg25, v12.ae * v22, v20, 3130);
                            }

                            if(v12.al * v13 == ga.ae.as * v21) {
                                v8 = 1;
                                this.bz(arg24, arg25, v12.ae * v22, 0xFFCCCCCC, 3130);
                                this.bz(arg24, arg25, v12.ae * v22 + 1, v20, 3130);
                            }
                            else {
                                v8 = 1;
                            }

                            int v2 = 2;
                            int v3 = 0x178F7E55;
                            if(v12.al * v13 == ga.ar.as * v21) {
                                if(v12.ae * v22 == 0) {
                                    cc.ar.aj(v6.av * v3 * arg24, (0x3F - arg25) * (v6.av * v3), 1, v20, -655473105);
                                }

                                if(v12.ae * v22 == v8) {
                                    cc.ar.aj(v6.av * v3 + v6.av * v3 * arg24 - 1, v6.av * v3 * (0x3F - arg25), 1, v20, 0x1DBAECC1);
                                }

                                if(v2 == v12.ae * v22) {
                                    cc.ar.aj(v6.av * v3 * arg24 + v6.av * v3 - 1, v6.av * v3 + (0x3F - arg25) * (v6.av * v3) - 1, 1, v20, 0xE0CF5325);
                                }

                                if(v12.ae * v22 != 3) {
                                    goto label_166;
                                }

                                cc.ar.aj(arg24 * (v6.av * v3), v6.av * v3 + v6.av * v3 * (0x3F - arg25) - 1, 1, v20, 0x71EE9046);
                            }

                        label_166:
                            if(ga.an.as * v21 != v12.al * v13) {
                                goto label_217;
                            }

                            if(v12.ae * v22 % v2 == 0) {
                                int v0;
                                for(v0 = 0; true; ++v0) {
                                    if(v0 >= v6.av * v3) {
                                        break;
                                    }

                                    cc.ar.aj(v6.av * v3 * arg24 + v0, v6.av * v3 * (0x40 - arg25) - v8 - v0, 1, v20, 1020259645);
                                }
                            }

                            for(v0 = 0; v0 < v6.av * v3; ++v0) {
                                cc.ar.aj(v0 + v6.av * v3 * arg24, v6.av * v3 * (0x3F - arg25) + v0, 1, v20, 0x4704E0CD);
                            }
                        }

                    label_217:
                    }
                }
            }
        }
    }

    void dp(HashSet arg10, int arg11, int arg12, fa arg13) {
        Iterator v8 = this.au.values().iterator();
        while(v8.hasNext()) {
            Object v0 = v8.next();
            if(!((cg)v0).ap(1023204699)) {
                continue;
            }

            int v1 = ((cg)v0).al(-37);
            if(!arg10.contains(Integer.valueOf(v1))) {
                continue;
            }

            this.ba(ae.al(v1, 16), ((cg)v0).ae * 0x307BE153, 0xFF05807 * ((cg)v0).ar, arg11, arg12, arg13, 0xA0815F54);
        }

        this.bd(arg10, arg11, arg12, arg13, 0xA737A109);
    }

    void dq(int arg24, int arg25, ck arg26) {
        int v8;
        cc v6 = this;
        ck v7 = arg26;
        int v9;
        for(v9 = 0; v9 < v7.ap * 0xCA01D035; ++v9) {
            du[] v10 = v7.av[v9][arg24][arg25];
            if(v10 != null) {
                if(v10.length == 0) {
                }
                else {
                    int v11;
                    for(v11 = 0; v11 < v10.length; ++v11) {
                        du v12 = v10[v11];
                        int v13 = 0xFE370D39;
                        if(ao.al(v12.al * v13, 0xC82B0E89)) {
                            int v20 = ok.al(v12.ax * 0xFF5623B1, -390620853).ay * 0xE5018CDF != 0 ? 0xFFCC0000 : 0xFFCCCCCC;
                            int v21 = 0x675599ED;
                            int v22 = -2106048683;
                            if(v12.al * v13 == ga.ax.as * v21) {
                                this.bz(arg24, arg25, v12.ae * v22, v20, 3130);
                            }

                            if(v12.al * v13 == ga.ae.as * v21) {
                                v8 = 1;
                                this.bz(arg24, arg25, v12.ae * v22, 0xFFCCCCCC, 3130);
                                this.bz(arg24, arg25, v12.ae * v22 + 1, v20, 3130);
                            }
                            else {
                                v8 = 1;
                            }

                            int v2 = 2;
                            int v3 = 0x178F7E55;
                            if(v12.al * v13 == ga.ar.as * v21) {
                                if(v12.ae * v22 == 0) {
                                    cc.ar.aj(v6.av * v3 * arg24, (0x3F - arg25) * (v6.av * v3), 1, v20, 0x54B210CF);
                                }

                                if(v12.ae * v22 == v8) {
                                    cc.ar.aj(v6.av * v3 + v6.av * v3 * arg24 - 1, v6.av * v3 * (0x3F - arg25), 1, v20, 0x6670EA71);
                                }

                                if(v2 == v12.ae * v22) {
                                    cc.ar.aj(v6.av * v3 * arg24 + v6.av * v3 - 1, v6.av * v3 + (0x3F - arg25) * (v6.av * v3) - 1, 1, v20, 0xF939DD4);
                                }

                                if(v12.ae * v22 != 3) {
                                    goto label_168;
                                }

                                cc.ar.aj(arg24 * (v6.av * v3), v6.av * v3 + v6.av * v3 * (0x3F - arg25) - 1, 1, v20, 0x5B6D59);
                            }

                        label_168:
                            if(ga.an.as * v21 != v12.al * v13) {
                                goto label_219;
                            }

                            if(v12.ae * v22 % v2 == 0) {
                                int v0;
                                for(v0 = 0; true; ++v0) {
                                    if(v0 >= v6.av * v3) {
                                        break;
                                    }

                                    cc.ar.aj(v6.av * v3 * arg24 + v0, v6.av * v3 * (0x40 - arg25) - v8 - v0, 1, v20, 380791737);
                                }
                            }

                            for(v0 = 0; v0 < v6.av * v3; ++v0) {
                                cc.ar.aj(v0 + v6.av * v3 * arg24, v6.av * v3 * (0x3F - arg25) + v0, 1, v20, -356046372);
                            }
                        }

                    label_219:
                    }
                }
            }
        }
    }

    int dr(int arg2, int arg3, ck arg4, cv arg5) {
        if(arg4.aq[0][arg2][arg3] == 0) {
            return this.ai * 0xA20AB9FF;
        }

        return arg5.al(arg2, arg3, 1706447566);
    }

    void ds(int arg26, int arg27, ck arg28, cl arg29, cv arg30) {
        cc v6 = this;
        ck v7 = arg28;
        int v0 = v7.aq[0][arg26][arg27] - 1;
        int v9 = v7.ab[0][arg26][arg27] - 1;
        int v10 = -1;
        int v11 = 0x178F7E55;
        if(v10 == v0 && v9 == v10) {
            cc.ar.ar(arg26 * (v6.av * v11), (1694900529 - arg27) * (v6.av * v11), v6.av * 0x488CC180, v6.av * 0x66C918D3, v6.ai * -591042429, 2);
        }

        int v17 = v9 != v10 ? ez.ax(v9, v6.ai * 0xA20AB9FF, 0x56B12A55) : 0xFF00FF;
        if(v9 > v10 && v7.af[0][arg26][arg27] == 0) {
            cc.ar.ar(v6.av * v11 * arg26, v6.av * v11 * (0x3F - arg27), v6.av * v11, v6.av * -663010055, v17, 2);
            return;
        }

        int v23 = this.ao(arg26, arg27, arg28, arg30, 0x2E95B927);
        if(v10 == v9) {
            cc.ar.ar(arg26 * (v6.av * 0x5D600E82), v6.av * v11 * (0x3F - arg27), v6.av * v11, v6.av * 2087157174, v23, 2);
            return;
        }

        arg29.ax(arg26 * (v6.av * 0xB250B2C1), v6.av * 0xBBC66FD8 * (0x3F - arg27), v23, v17, v6.av * -1720467034, v6.av * v11, v7.af[0][arg26][arg27], v7.ai[0][arg26][arg27], cc.ar, 0x344F5131);
    }

    void dt(int arg11, int arg12, HashSet arg13, int arg14, fa arg15) {
        float v0 = (((float)arg14)) / 64f;
        float v1 = v0 / 2f;
        Iterator v9 = this.au.entrySet().iterator();
        while(v9.hasNext()) {
            Object v2 = v9.next();
            Object v3 = ((Map$Entry)v2).getKey();
            int v4 = ((int)((((float)arg11)) + (((float)(((af)v3).al * 0xAEACF223))) * v0 - v1));
            int v5 = ((int)((((float)(arg12 + arg14))) - (((float)(((af)v3).ae * 0xB230B0A5))) * v0 - v1));
            v3 = ((Map$Entry)v2).getValue();
            if(v3 == null) {
                continue;
            }

            if(!((cg)v3).ap(1023204699)) {
                continue;
            }

            ((cg)v3).ae = 0x1FC30ADB * v4;
            ((cg)v3).ar = 0x31BD5F3B * v5;
            if(arg13.contains(Integer.valueOf(ae.al(((cg)v3).al(12), 16).ad(-6)))) {
                continue;
            }

            this.bf(((cg)v3), v4, v5, v0, arg15, 0x95D10F97);
        }
    }

    void du(cl arg12, ef[] arg13, cv arg14) {
        Iterator v0 = this.af.iterator();
    label_2:
        if(v0.hasNext()) {
            Object v1 = v0.next();
            int v9;
            for(v9 = ((cq)v1).an(0xEE9961D7) * 8; true; ++v9) {
                if(v9 >= ((cq)v1).an(-937652809) * 8 + 8) {
                    goto label_2;
                }

                int v10;
                for(v10 = ((cq)v1).bh(0x40010C6A) * 8; v10 < ((cq)v1).bh(-2039115022) * 8 + 8; ++v10) {
                    this.ay(v9, v10, v1, arg12, arg14, 0x45C26580);
                    this.aw(v9, v10, v1, arg12, 1586404472);
                }
            }
        }

        Iterator v14 = this.af.iterator();
    label_44:
        if(v14.hasNext()) {
            Object v0_1 = v14.next();
            int v8;
            for(v8 = ((cq)v0_1).an(-845081142) * 8; true; ++v8) {
                if(v8 >= ((cq)v0_1).an(0x25FF568) * 8 + 8) {
                    goto label_44;
                }

                for(v9 = ((cq)v0_1).bh(0x9F48E686) * 8; v9 < ((cq)v0_1).bh(1910169217) * 8 + 8; ++v9) {
                    this.at(v8, v9, v0_1, arg12, arg13, 0xDFDBE078);
                }
            }
        }
    }

    void dv(int arg8, int arg9, int arg10, HashSet arg11, fa arg12) {
        if(arg11 == null) {
            arg11 = new HashSet();
        }

        this.ac(arg8, arg9, arg11, arg10, arg12, 0x27259DDF);
        this.bw(arg8, arg9, arg11, arg10, arg12, 0x30);
    }

    void dw(cl arg10, ef[] arg11, cv arg12) {
        int v7;
        for(v7 = 0; v7 < 0xAE21E1; ++v7) {
            int v8;
            for(v8 = 0; v8 < 0x40; ++v8) {
                this.ay(v7, v8, this.ab, arg10, arg12, 0xEEF3FE5D);
                this.aw(v7, v8, this.ab, arg10, 1586404472);
            }
        }
    }

    int dx(int arg2, int arg3, ck arg4, cv arg5) {
        if(arg4.aq[0][arg2][arg3] == 0) {
            return this.ai * 0xA20AB9FF;
        }

        return arg5.al(arg2, arg3, 0xE8F25BF5);
    }

    void dy(int arg26, int arg27, ck arg28, cl arg29, cv arg30) {
        cc v6 = this;
        ck v7 = arg28;
        int v0 = v7.aq[0][arg26][arg27] - 1;
        int v9 = v7.ab[0][arg26][arg27] - 1;
        int v1 = 0xA20AB9FF;
        int v10 = -1;
        int v11 = 0x178F7E55;
        if(v10 == v0 && v9 == v10) {
            cc.ar.ar(arg26 * (v6.av * v11), (0x3F - arg27) * (v6.av * v11), v6.av * v11, v6.av * v11, v6.ai * v1, 2);
        }

        int v17 = v9 != v10 ? ez.ax(v9, v6.ai * v1, 0x60103FFF) : 0xFF00FF;
        if(v9 > v10 && v7.af[0][arg26][arg27] == 0) {
            cc.ar.ar(v6.av * v11 * arg26, v6.av * v11 * (0x3F - arg27), v6.av * v11, v6.av * v11, v17, 2);
            return;
        }

        int v23 = this.ao(arg26, arg27, arg28, arg30, 0xBF950F11);
        if(v10 == v9) {
            cc.ar.ar(arg26 * (v6.av * v11), v6.av * v11 * (0x3F - arg27), v6.av * v11, v6.av * v11, v23, 2);
            return;
        }

        arg29.ax(arg26 * (v6.av * v11), v6.av * v11 * (0x3F - arg27), v23, v17, v6.av * v11, v6.av * v11, v7.af[0][arg26][arg27], v7.ai[0][arg26][arg27], cc.ar, 0x4C0B3A88);
    }

    void dz(int arg24, int arg25, ck arg26) {
        int v8;
        cc v6 = this;
        ck v7 = arg26;
        int v9;
        for(v9 = 0; v9 < v7.ap * 0xCA01D035; ++v9) {
            du[] v10 = v7.av[v9][arg24][arg25];
            if(v10 != null) {
                if(v10.length == 0) {
                }
                else {
                    int v11;
                    for(v11 = 0; v11 < v10.length; ++v11) {
                        du v12 = v10[v11];
                        int v13 = 0xFE370D39;
                        if(ao.al(v12.al * v13, 0x337E62D0)) {
                            int v20 = ok.al(v12.ax * 0xFF5623B1, 701121540).ay * 0xE5018CDF != 0 ? 0xFFCC0000 : 0xFFCCCCCC;
                            int v21 = 0x675599ED;
                            int v22 = -2106048683;
                            if(v12.al * v13 == ga.ax.as * v21) {
                                this.bz(arg24, arg25, v12.ae * v22, v20, 3130);
                            }

                            if(v12.al * v13 == ga.ae.as * v21) {
                                v8 = 1;
                                this.bz(arg24, arg25, v12.ae * v22, 0xFFCCCCCC, 3130);
                                this.bz(arg24, arg25, v12.ae * v22 + 1, v20, 3130);
                            }
                            else {
                                v8 = 1;
                            }

                            int v2 = 2;
                            int v3 = 0x178F7E55;
                            if(v12.al * v13 == ga.ar.as * v21) {
                                if(v12.ae * v22 == 0) {
                                    cc.ar.aj(v6.av * v3 * arg24, (0x3F - arg25) * (v6.av * v3), 1, v20, 1051406085);
                                }

                                if(v12.ae * v22 == v8) {
                                    cc.ar.aj(v6.av * v3 + v6.av * v3 * arg24 - 1, v6.av * v3 * (0x3F - arg25), 1, v20, -210353579);
                                }

                                if(v2 == v12.ae * v22) {
                                    cc.ar.aj(v6.av * v3 * arg24 + v6.av * v3 - 1, v6.av * v3 + (0x3F - arg25) * (v6.av * v3) - 1, 1, v20, 378616203);
                                }

                                if(v12.ae * v22 != 3) {
                                    goto label_166;
                                }

                                cc.ar.aj(arg24 * (v6.av * v3), v6.av * v3 + v6.av * v3 * (0x3F - arg25) - 1, 1, v20, 0xFA6F8698);
                            }

                        label_166:
                            if(ga.an.as * v21 != v12.al * v13) {
                                goto label_217;
                            }

                            if(v12.ae * v22 % v2 == 0) {
                                int v0;
                                for(v0 = 0; true; ++v0) {
                                    if(v0 >= v6.av * v3) {
                                        break;
                                    }

                                    cc.ar.aj(v6.av * v3 * arg24 + v0, v6.av * v3 * (0x40 - arg25) - v8 - v0, 1, v20, 0x4CCEEFD7);
                                }
                            }

                            for(v0 = 0; v0 < v6.av * v3; ++v0) {
                                cc.ar.aj(v0 + v6.av * v3 * arg24, v6.av * v3 * (0x3F - arg25) + v0, 1, v20, 325005803);
                            }
                        }

                    label_217:
                    }
                }
            }
        }
    }

    void ea(da arg12, int arg13, int arg14, int arg15, int arg16, fa arg17) {
        es v1 = arg12.ap(false, 55);
        if(v1 == null) {
            return;
        }

        arg17.am(v1, arg13 - v1.al / 2, arg14 - v1.ae / 2, -807658005);
        if(arg15 % arg16 < arg16 / 2) {
            arg17.av(arg13, arg14, 15, 0xC0F9201A, 0x80, 0x80B27A14);
            arg17.ai(arg13, arg14, 7, 0x45522B00, -74);
        }
    }

    cn eb(int arg2) {
        return this.bq(ae.al(arg2, 16), 52);
    }

    cn ec(da arg8) {
        cn v1 = null;
        if(arg8.ad != null && this.am != null) {
            if(this.am.get(cz.ax) == null) {
            }
            else {
                cz v0 = cz.ae(arg8.ab * 0xD6D0BF01, 0x7F030213);
                if(v0 == null) {
                    return v1;
                }
                else {
                    Object v2 = this.am.get(v0);
                    if(v2 == null) {
                        return v1;
                    }
                    else {
                        String[] v3 = new String[((od)v2).aj(arg8.ad, 0x8AAF5A3F)];
                        ((od)v2).an(arg8.ad, ((int[])v1), v3);
                        int v1_1 = ((od)v2).aj * v3.length / 2;
                        int v4 = 0;
                        int v5 = 0;
                        while(v4 < v3.length) {
                            int v6 = ((od)v2).ar(v3[v4]);
                            if(v6 > v5) {
                                v5 = v6;
                            }

                            ++v4;
                        }

                        return new cn(arg8.ad, v5, v1_1, v0);
                    }
                }
            }
        }

        return v1;
    }

    cn ed(int arg2) {
        return this.bq(ae.al(arg2, 16), 56);
    }

    static boolean ee(do arg6) {
        int v2 = -1;
        if(arg6.bc != null) {
            int[] v6 = arg6.bc;
            int v0 = 0;
            while(v0 < v6.length) {
                if(v2 != ok.al(v6[v0], 0xF1ED2FA4).bn * -1103517450) {
                    return 1;
                }
                else {
                    ++v0;
                    continue;
                }

                return 0;
            }
        }
        else if(v2 != arg6.bn * 1284025131) {
            return 1;
        }

        return 0;
    }

    List ef() {
        LinkedList v0 = new LinkedList();
        ((List)v0).addAll(this.aa);
        ((List)v0).addAll(this.au.values());
        return ((List)v0);
    }

    int eg(es arg2, dl arg3) {
        int v3 = arg3.ar * 0x801A2F47;
        if(v3 != 0) {
            int v0 = 2;
            if(v3 != v0) {
                return -arg2.al;
            }

            return -arg2.al / v0;
        }

        return 0;
    }

    cn eh(da arg8) {
        cn v1 = null;
        if(arg8.ad != null && this.am != null) {
            if(this.am.get(cz.ax) == null) {
            }
            else {
                cz v0 = cz.ae(arg8.ab * 0xD6D0BF01, 0x7F030213);
                if(v0 == null) {
                    return v1;
                }
                else {
                    Object v2 = this.am.get(v0);
                    if(v2 == null) {
                        return v1;
                    }
                    else {
                        String[] v3 = new String[((od)v2).aj(arg8.ad, 1000000)];
                        ((od)v2).an(arg8.ad, ((int[])v1), v3);
                        int v1_1 = ((od)v2).aj * v3.length / 2;
                        int v4 = 0;
                        int v5 = 0;
                        while(v4 < v3.length) {
                            int v6 = ((od)v2).ar(v3[v4]);
                            if(v6 > v5) {
                                v5 = v6;
                            }

                            ++v4;
                        }

                        return new cn(arg8.ad, v5, v1_1, v0);
                    }
                }
            }
        }

        return v1;
    }

    List ei(int arg3, int arg4, int arg5, int arg6, int arg7) {
        Object v4;
        LinkedList v0 = new LinkedList();
        if(arg6 >= arg3) {
            if(arg7 < arg4) {
            }
            else {
                if(arg6 < arg3 + arg5) {
                    if(arg7 >= arg4 + arg5) {
                    }
                    else {
                        Iterator v3 = this.au.values().iterator();
                        while(true) {
                            arg5 = 1023204699;
                            if(!v3.hasNext()) {
                                break;
                            }

                            v4 = v3.next();
                            if(!((cg)v4).ap(arg5)) {
                                continue;
                            }

                            if(!((cg)v4).ax(arg6, arg7, 1099905861)) {
                                continue;
                            }

                            v0.add(v4);
                        }

                        v3 = this.aa.iterator();
                        while(v3.hasNext()) {
                            v4 = v3.next();
                            if(!((cg)v4).ap(arg5)) {
                                continue;
                            }

                            if(!((cg)v4).ax(arg6, arg7, 0xFE4B2BE)) {
                                continue;
                            }

                            v0.add(v4);
                        }

                        return ((List)v0);
                    }
                }

                return ((List)v0);
            }
        }

        return ((List)v0);
    }

    void ej(cg arg11, int arg12, int arg13, float arg14, fa arg15) {
        da v0 = ae.al(arg11.al(-47), 16);
        this.bn(v0, arg12, arg13, arg15, 1855398820);
        this.bp(arg11, v0, arg12, arg13, arg14, arg15, 4);
    }

    void ek(HashSet arg10, int arg11, int arg12, fa arg13) {
        Iterator v8 = this.aa.iterator();
        while(v8.hasNext()) {
            Object v0 = v8.next();
            if(!((cg)v0).ap(1023204699)) {
                continue;
            }

            da v1 = ae.al(((cg)v0).al(-127), 16);
            if(v1 == null) {
                continue;
            }

            if(!arg10.contains(Integer.valueOf(v1.ad(-6)))) {
                continue;
            }

            this.ba(v1, ((cg)v0).ae * 0x307BE153, 0x106821F3 * ((cg)v0).ar, arg11, arg12, arg13, -1906361150);
        }
    }

    void el(int arg9, int arg10, HashSet arg11, int arg12, fa arg13) {
        float v12 = (((float)arg12)) / 64f;
        Iterator v0 = this.aa.iterator();
        while(v0.hasNext()) {
            Object v2 = v0.next();
            if(!((cg)v2).ap(1023204699)) {
                continue;
            }

            int v3 = ((cg)v2).ax.al * 0xAEACF223 % 0x40;
            int v1 = ((cg)v2).ax.ae * 0xB230B0A5 % 0x40;
            ((cg)v2).ae = (((int)((((float)arg9)) + (((float)v3)) * v12))) * 0x1FC30ADB;
            ((cg)v2).ar = (((int)((((float)arg10)) + (((float)(0x3F - v1))) * v12))) * 0x31BD5F3B;
            if(arg11.contains(Integer.valueOf(((cg)v2).al(-77)))) {
                continue;
            }

            this.bf(((cg)v2), ((cg)v2).ae * 0xA602CCD2, ((cg)v2).ar * 0x87508434, v12, arg13, 0x95D10F97);
        }
    }

    void em(da arg4, int arg5, int arg6, fa arg7) {
        es v0 = arg4.ap(false, 26);
        if(v0 != null) {
            arg7.am(v0, this.bo(v0, arg4.ah, 0x610529BC) + arg5, this.by(v0, arg4.at, 29) + arg6, -807658005);
        }
    }

    void en(int arg9, int arg10, HashSet arg11, int arg12, fa arg13) {
        float v12 = (((float)arg12)) / 64f;
        Iterator v0 = this.aa.iterator();
        while(v0.hasNext()) {
            Object v2 = v0.next();
            if(!((cg)v2).ap(1023204699)) {
                continue;
            }

            int v3 = ((cg)v2).ax.al * 0x6996C78D % 0x40;
            int v1 = ((cg)v2).ax.ae * 0xB230B0A5 % 0x40;
            ((cg)v2).ae = (((int)((((float)arg9)) + (((float)v3)) * v12))) * 0x1FC30ADB;
            ((cg)v2).ar = (((int)((((float)arg10)) + (((float)(1281013561 - v1))) * v12))) * 0x31BD5F3B;
            if(arg11.contains(Integer.valueOf(((cg)v2).al(-87)))) {
                continue;
            }

            this.bf(((cg)v2), ((cg)v2).ae * 0x307BE153, ((cg)v2).ar * 0x106821F3, v12, arg13, 0x95D10F97);
        }
    }

    List eo() {
        LinkedList v0 = new LinkedList();
        ((List)v0).addAll(this.aa);
        ((List)v0).addAll(this.au.values());
        return ((List)v0);
    }

    List ep(int arg3, int arg4, int arg5, int arg6, int arg7) {
        Object v4;
        LinkedList v0 = new LinkedList();
        if(arg6 >= arg3) {
            if(arg7 < arg4) {
            }
            else {
                if(arg6 < arg3 + arg5) {
                    if(arg7 >= arg4 + arg5) {
                    }
                    else {
                        Iterator v3 = this.au.values().iterator();
                        while(true) {
                            arg5 = 1023204699;
                            if(!v3.hasNext()) {
                                break;
                            }

                            v4 = v3.next();
                            if(!((cg)v4).ap(arg5)) {
                                continue;
                            }

                            if(!((cg)v4).ax(arg6, arg7, 0x359DFF43)) {
                                continue;
                            }

                            v0.add(v4);
                        }

                        v3 = this.aa.iterator();
                        while(v3.hasNext()) {
                            v4 = v3.next();
                            if(!((cg)v4).ap(arg5)) {
                                continue;
                            }

                            if(!((cg)v4).ax(arg6, arg7, 0x2AD92E70)) {
                                continue;
                            }

                            v0.add(v4);
                        }

                        return ((List)v0);
                    }
                }

                return ((List)v0);
            }
        }

        return ((List)v0);
    }

    void eq(da arg12, int arg13, int arg14, int arg15, int arg16, fa arg17) {
        es v1 = arg12.ap(false, 0x7C);
        if(v1 == null) {
            return;
        }

        arg17.am(v1, arg13 - v1.al / 2, arg14 - v1.ae / 2, -807658005);
        if(arg15 % arg16 < arg16 / 2) {
            arg17.av(arg13, arg14, 15, 0x254EB5A2, -919003812, 0x8EEC0696);
            arg17.ai(arg13, arg14, 7, 0x5769FBA7, -32);
        }
    }

    void er(da arg12, int arg13, int arg14, int arg15, int arg16, fa arg17) {
        es v1 = arg12.ap(false, 85);
        if(v1 == null) {
            return;
        }

        arg17.am(v1, arg13 - v1.al / 2, arg14 - v1.ae / 2, -807658005);
        if(arg15 % arg16 < arg16 / 2) {
            arg17.av(arg13, arg14, 15, 0xFFFF00, 0x80, 708870061);
            arg17.ai(arg13, arg14, 7, 0xFFFFFF, -69);
        }
    }

    static final void es(int arg16, int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, byte arg23) {
        int v6_1;
        int v5_1;
        gy v8_1;
        int v4;
        int v3_1;
        int v2;
        int v0 = arg16;
        int v7 = arg17;
        int v15 = arg18;
        int v14 = arg19;
        if(v15 >= 1 && v14 >= 1) {
            int v1 = 102;
            if(v15 <= v1 && v14 <= v1) {
                try {
                    if((client.ab) && v0 != kt.jz * 1101813865) {
                        return;
                    }

                    long v1_1 = 0;
                    long v3 = v7 == 0 ? ee.fs.bd(v0, v15, v14) : v1_1;
                    if(1 == v7) {
                        v3 = ee.fs.ba(v0, v15, v14);
                    }

                    if(v7 == 2) {
                        v3 = ee.fs.bf(v0, v15, v14);
                    }

                    int v11 = 3;
                    if(v11 == v7) {
                        v3 = ee.fs.bn(v0, v15, v14);
                    }

                    long v8 = v3;
                    if(v8 != v1_1) {
                        v1 = ee.fs.bp(arg16, arg18, arg19, v8);
                        v2 = be.av(v8);
                        v3_1 = v1 & 0x1F;
                        v1 = v1 >> 6 & v11;
                        v4 = 0xE748B627;
                        if(v7 == 0) {
                            ee.fs.ag(v0, v15, v14);
                            do v5 = ok.al(v2, 0x51140ABE);
                            if(v5.ah * v4 != 0) {
                                v8_1 = client.gg[v0];
                                v11 = v3_1;
                                v3_1 = 2;
                                v4 = 1;
                                boolean v13 = v5.at;
                                v5_1 = v14;
                                v8_1.aj(arg18, arg19, v11, v1, v13, 0);
                            }
                            else {
                                goto label_70;
                            }
                        }
                        else {
                        label_70:
                            v5_1 = v14;
                            v3_1 = 2;
                            v4 = 1;
                        }

                        if(v4 == v7) {
                            ee.fs.ah(v0, v15, v5_1);
                        }

                        if(v3_1 == v7) {
                            ee.fs.at(v0, v15, v5_1);
                            do v6 = ok.al(v2, 0xF781A521);
                            int v9 = 0xB46CA623;
                            int v10 = 103;
                            if(v6.az * v9 + v15 <= v10 && v6.az * v9 + v5_1 <= v10) {
                                v11 = 0x4B9D7897;
                                if(v6.ag * v11 + v15 <= v10) {
                                    if(v6.ag * v11 + v5_1 > v10) {
                                    }
                                    else if(v6.ah * 0xE748B627 != 0) {
                                        v8_1 = client.gg[v0];
                                        int v12 = v6.az * v9;
                                        int v13_1 = v6.ag * v11;
                                        v11 = v12;
                                        v12 = v13_1;
                                        v13_1 = v1;
                                        v1 = v15;
                                        v8_1.ad(arg18, arg19, v11, v12, v13_1, v6.at, 30);
                                        goto label_124;
                                    }
                                    else {
                                        goto label_123;
                                    }
                                }
                            }

                            return;
                        }
                        else {
                        label_123:
                            v1 = v15;
                        }

                    label_124:
                        v6_1 = 3;
                        if(v6_1 != v7) {
                            goto label_144;
                        }

                        ee.fs.ay(v0, v1, v5_1);
                        if(v4 != ok.al(v2, 0xC08EDF7B).ah * 0xE748B627) {
                            goto label_144;
                        }

                        client.gg[v0].ab(v1, v5_1, 0x64888FCF);
                    }
                    else {
                        v5_1 = v14;
                        v1 = v15;
                        v3_1 = 2;
                        v4 = 1;
                        v6_1 = 3;
                    }

                label_144:
                    if(arg20 < 0) {
                        return;
                    }

                    v2 = v0 >= v6_1 || v3_1 != (id.al[v4][v1][v5_1] & v3_1) ? v0 : v0 + 1;
                    dw.ao(arg16, v2, arg18, arg19, arg20, arg21, arg22, ee.fs, client.gg[v0], 1);
                }
                catch(RuntimeException v0_1) {
                    StringBuilder v1_2 = new StringBuilder();
                    v1_2.append("cc.es(");
                    v1_2.append(')');
                    throw lx.al(((Throwable)v0_1), v1_2.toString());
                }
            }
        }
    }

    cn es(int arg2) {
        return this.bq(ae.al(arg2, 16), 38);
    }

    List et() {
        LinkedList v0 = new LinkedList();
        ((List)v0).addAll(this.aa);
        ((List)v0).addAll(this.au.values());
        return ((List)v0);
    }

    static boolean eu(do arg7) {
        int v2 = 1284025131;
        int v3 = -1;
        if(arg7.bc != null) {
            int[] v7 = arg7.bc;
            int v0 = 0;
            while(v0 < v7.length) {
                if(v3 != ok.al(v7[v0], 0x1C90F420).bn * v2) {
                    return 1;
                }
                else {
                    ++v0;
                    continue;
                }

                return 0;
            }
        }
        else if(v3 != arg7.bn * v2) {
            return 1;
        }

        return 0;
    }

    int ev(es arg2, dl arg3) {
        int v3 = arg3.ar * 0x3F9DA0CB;
        if(v3 != 0) {
            int v0 = 2;
            if(v3 != v0) {
                return -arg2.al;
            }

            return -arg2.al / v0;
        }

        return 0;
    }

    void ew(int arg9, int arg10, HashSet arg11, int arg12, fa arg13) {
        float v12 = (((float)arg12)) / 64f;
        Iterator v0 = this.aa.iterator();
        while(v0.hasNext()) {
            Object v2 = v0.next();
            if(!((cg)v2).ap(1023204699)) {
                continue;
            }

            int v3 = ((cg)v2).ax.al * 0xAEACF223 % 0x40;
            int v1 = ((cg)v2).ax.ae * 0xB230B0A5 % 0x40;
            ((cg)v2).ae = (((int)((((float)arg9)) + (((float)v3)) * v12))) * 0x1FC30ADB;
            ((cg)v2).ar = (((int)((((float)arg10)) + (((float)(0x3F - v1))) * v12))) * 0x31BD5F3B;
            if(arg11.contains(Integer.valueOf(((cg)v2).al(62)))) {
                continue;
            }

            this.bf(((cg)v2), ((cg)v2).ae * 0x307BE153, ((cg)v2).ar * 0x106821F3, v12, arg13, 0x95D10F97);
        }
    }

    List ex(int arg3, int arg4, int arg5, int arg6, int arg7) {
        Object v4;
        LinkedList v0 = new LinkedList();
        if(arg6 >= arg3) {
            if(arg7 < arg4) {
            }
            else {
                if(arg6 < arg3 + arg5) {
                    if(arg7 >= arg4 + arg5) {
                    }
                    else {
                        Iterator v3 = this.au.values().iterator();
                        while(true) {
                            arg5 = 1023204699;
                            if(!v3.hasNext()) {
                                break;
                            }

                            v4 = v3.next();
                            if(!((cg)v4).ap(arg5)) {
                                continue;
                            }

                            if(!((cg)v4).ax(arg6, arg7, 1794300565)) {
                                continue;
                            }

                            v0.add(v4);
                        }

                        v3 = this.aa.iterator();
                        while(v3.hasNext()) {
                            v4 = v3.next();
                            if(!((cg)v4).ap(arg5)) {
                                continue;
                            }

                            if(!((cg)v4).ax(arg6, arg7, 0x57C2EA97)) {
                                continue;
                            }

                            v0.add(v4);
                        }

                        return ((List)v0);
                    }
                }

                return ((List)v0);
            }
        }

        return ((List)v0);
    }

    void ey(da arg4, int arg5, int arg6, fa arg7) {
        es v0 = arg4.ap(false, 37);
        if(v0 != null) {
            arg7.am(v0, this.bo(v0, arg4.ah, 0x610529BC) + arg5, this.by(v0, arg4.at, 42) + arg6, -807658005);
        }
    }

    void ez(HashSet arg10, int arg11, int arg12, fa arg13) {
        Iterator v8 = this.aa.iterator();
        while(v8.hasNext()) {
            Object v0 = v8.next();
            if(!((cg)v0).ap(1023204699)) {
                continue;
            }

            da v1 = ae.al(((cg)v0).al(46), 16);
            if(v1 == null) {
                continue;
            }

            if(!arg10.contains(Integer.valueOf(v1.ad(-6)))) {
                continue;
            }

            this.ba(v1, ((cg)v0).ae * 0x307BE153, 0x106821F3 * ((cg)v0).ar, arg11, arg12, arg13, 0x8F3354CB);
        }
    }

    List fa() {
        LinkedList v0 = new LinkedList();
        ((List)v0).addAll(this.aa);
        ((List)v0).addAll(this.au.values());
        return ((List)v0);
    }

    void fd(int arg10, int arg11, int arg12, int arg13) {
        arg12 %= 4;
        int v0 = 0x178F7E55;
        if(arg12 == 0) {
            cc.ar.aq(this.av * v0 * arg10, this.av * v0 * (0x3F - arg11), this.av * v0, arg13, 0x1795F574);
        }

        if(1 == arg12) {
            cc.ar.aj(this.av * v0 * arg10, (0x3F - arg11) * (this.av * v0), this.av * v0, arg13, 0x3FA7CE29);
        }

        if(arg12 == 2) {
            cc.ar.aq(this.av * v0 + this.av * v0 * arg10 - 1, (0x3F - arg11) * (this.av * v0), this.av * v0, arg13, 0x1795F574);
        }

        if(arg12 == 3) {
            cc.ar.aj(this.av * v0 * arg10, this.av * v0 + (0x3F - arg11) * (this.av * v0) - 1, this.av * v0, arg13, 0x5D2DF5C4);
        }
    }

    List fe() {
        LinkedList v0 = new LinkedList();
        ((List)v0).addAll(this.aa);
        ((List)v0).addAll(this.au.values());
        return ((List)v0);
    }
}

