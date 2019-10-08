import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map$Entry;

public class hu {
    LinkedHashMap ad;
    boolean ae;
    boolean aj;
    static final int al = 100;
    int an;
    String ap;
    boolean ar;
    static lq at = null;
    static int ax = 0xD8F285D6;
    public static final int bl = 51;
    static boolean mh;

    static {
    }

    hu() {
        try {
            super();
            this.an = -986002585;
            this.ap = null;
            this.aj = false;
            this.ad = new LinkedHashMap();
            this.ax(true, 2);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("hu.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    hu(lq arg8) {
        try {
            super();
            int v0 = -986002585;
            this.an = v0;
            this.ap = null;
            int v1 = 0;
            this.aj = false;
            this.ad = new LinkedHashMap();
            byte v2 = 2;
            boolean v3 = true;
            if(arg8 == null || arg8.ae == null) {
                this.ax(true, v2);
            }
            else {
                int v4 = arg8.ay(-80);
                if(v4 >= 0) {
                    if(v4 > hu.ax * 0x43B0149) {
                    }
                    else {
                        if(arg8.ay(-9) == 1) {
                            this.ae = true;
                        }

                        if(v4 > 1) {
                            if(arg8.ay(-37) == 1) {
                            }
                            else {
                                v3 = false;
                            }

                            this.ar = v3;
                        }

                        if(v4 > 3) {
                            this.an = arg8.ay(-96) * v0;
                        }

                        if(v4 > v2) {
                            v0 = arg8.ay(-64);
                            while(v1 < v0) {
                                this.ad.put(Integer.valueOf(arg8.ac(14)), Integer.valueOf(arg8.ac(51)));
                                ++v1;
                            }
                        }

                        if(v4 > 4) {
                            this.ap = arg8.bf(-459477620);
                        }

                        if(v4 <= 5) {
                            return;
                        }

                        this.aj = arg8.ba(0xCD24E06C);
                        return;
                    }
                }

                this.ax(true, v2);
            }
        }
        catch(RuntimeException v8) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("hu.<init>(");
            v0_1.append(')');
            throw lx.al(((Throwable)v8), v0_1.toString());
        }
    }

    static void aa() {
        og v2;
        og v1 = null;
        try {
            v2 = kr.al("", client.aj.aj, true, 4);
        }
        catch(Exception ) {
            v2 = v1;
            goto label_19;
        }

        try {
            lq v1_1 = li.rg.ae(65775708);
            v2.al(v1_1.ae, 0, v1_1.ar * 0xF24F550B, 0x30BE384A);
            goto label_19;
        }
        catch(Exception ) {
        label_19:
            if(v2 != null) {
                int v1_2 = 0x42470B53;
                try {
                    v2.ar(true, v1_2);
                    return;
                }
                catch(Exception ) {
                    return;
                }
            }

            return;
        }
    }

    void ab(int arg3, int arg4) {
        if(this.ad.size() >= 100 && !this.ad.containsKey(Integer.valueOf(arg3))) {
            Iterator v0 = this.ad.entrySet().iterator();
            v0.next();
            v0.remove();
        }

        if(arg3 != 0) {
            this.ad.put(Integer.valueOf(arg3), Integer.valueOf(arg4));
        }
    }

    void ad(int arg3, int arg4) {
        if(this.ad.size() >= 100 && !this.ad.containsKey(Integer.valueOf(arg3))) {
            Iterator v0 = this.ad.entrySet().iterator();
            v0.next();
            v0.remove();
        }

        if(arg3 != 0) {
            this.ad.put(Integer.valueOf(arg3), Integer.valueOf(arg4));
        }
    }

    lq ae(int arg5) {
        try {
            lq v5_1 = new lq(100);
            v5_1.ar(hu.ax * 0x43B0149, 92);
            int v1 = 1;
            int v0 = this.ae ? 1 : 0;
            v5_1.ar(v0, 0x71);
            if(this.ar) {
            }
            else {
                v1 = 0;
            }

            v5_1.ar(v1, 83);
            v5_1.ar(this.an * 0x3CA82057, 8);
            v5_1.ar(this.ad.size(), 0x4F);
            Iterator v0_1 = this.ad.entrySet().iterator();
            while(v0_1.hasNext()) {
                Object v1_1 = v0_1.next();
                v5_1.aj(((Map$Entry)v1_1).getKey().intValue(), 0x79EF67B1);
                v5_1.aj(((Map$Entry)v1_1).getValue().intValue(), 0x79EF67B1);
            }

            String v0_2 = this.ap != null ? this.ap : "";
            v5_1.ai(v0_2, -122);
            v5_1.ab(this.aj, -984826401);
            return v5_1;
        }
        catch(RuntimeException v5) {
            StringBuilder v0_3 = new StringBuilder();
            v0_3.append("hu.ae(");
            v0_3.append(')');
            throw lx.al(((Throwable)v5), v0_3.toString());
        }
    }

    static int ae(int arg1, hl arg2, boolean arg3, int arg4) {
        if(arg1 >= 1000) {
            goto label_7;
        }

        byte v4 = 30;
        try {
            return bm.ar(arg1, arg2, arg3, v4);
        label_7:
            if(arg1 < 1100) {
                return az.an(arg1, arg2, arg3, 0x89404670);
            }

            if(arg1 < 1200) {
                return fg.ap(arg1, arg2, arg3, 0xFC7D7022);
            }

            if(arg1 < 1300) {
                return kg.aj(arg1, arg2, arg3, 0x4F9502EB);
            }

            if(arg1 < 1400) {
                return fd.ad(arg1, arg2, arg3, 0x34C8B09C);
            }

            int v0 = 0x662278C1;
            if(arg1 < 1500) {
                return as.ai(arg1, arg2, arg3, v0);
            }

            if(arg1 < 1600) {
                return bx.av(arg1, arg2, arg3, 0x433CEBA0);
            }

            if(arg1 < 1700) {
                return fe.aa(arg1, arg2, arg3, 24);
            }

            if(arg1 < 1800) {
                return fq.au(arg1, arg2, arg3, -1049744321);
            }

            if(arg1 < 1900) {
                return du.am(arg1, arg2, arg3, 2073548119);
            }

            if(arg1 < 2000) {
                return ap.az(arg1, arg2, arg3, 0x79F79445);
            }

            if(arg1 < 2100) {
                return az.an(arg1, arg2, arg3, 0xDCB819E7);
            }

            if(arg1 < 2200) {
                return fg.ap(arg1, arg2, arg3, 0x6020113E);
            }

            if(arg1 < 2300) {
                return kg.aj(arg1, arg2, arg3, 0x4C4D571F);
            }

            if(arg1 < 2400) {
                return fd.ad(arg1, arg2, arg3, 0x2EC13DA6);
            }

            if(arg1 < 2500) {
                return as.ai(arg1, arg2, arg3, v0);
            }

            if(arg1 < 2600) {
                return dc.ag(arg1, arg2, arg3, 0);
            }

            if(arg1 < 2700) {
                return gg.ah(arg1, arg2, arg3, 1819450761);
            }

            if(arg1 < 0xAF0) {
                return hy.at(arg1, arg2, arg3, 0xD3DE0225);
            }

            if(arg1 < 2900) {
                return bf.ay(arg1, arg2, arg3, 0xCB8FC6E2);
            }

            if(arg1 < 3000) {
                return ap.az(arg1, arg2, arg3, 0x278CDC65);
            }

            if(arg1 < 3200) {
                return cd.aw(arg1, arg2, arg3, 0x46A74B41);
            }

            if(arg1 < 3300) {
                return ct.ao(arg1, arg2, arg3, 2037165085);
            }

            if(arg1 < 3400) {
                return id.as(arg1, arg2, arg3, 0x769C531E);
            }

            if(arg1 < 3500) {
                return ml.ak(arg1, arg2, arg3, 0x77B8FF38);
            }

            if(arg1 < 3700) {
                return at.ac(arg1, arg2, arg3, -78);
            }

            if(arg1 < 4000) {
                return co.bd(arg1, arg2, arg3, 0x626A40B5);
            }

            if(arg1 < 4100) {
                return ct.ba(arg1, arg2, arg3, 1424330230);
            }

            if(arg1 < 4200) {
                return gc.bf(arg1, arg2, arg3, 0);
            }

            if(arg1 < 4300) {
                return ga.bn(arg1, arg2, arg3, 1660861605);
            }

            if(arg1 < 5100) {
                return ff.bp(arg1, arg2, arg3, 1930732344);
            }

            if(arg1 < 5400) {
                return fd.bw(arg1, arg2, arg3, 810820993);
            }

            if(arg1 < 5600) {
                return ee.bo(arg1, arg2, arg3, 0xBD574CC);
            }

            if(arg1 < 5700) {
                return dv.by(arg1, arg2, arg3, 0xD0C61B9A);
            }

            if(arg1 < 6300) {
                return cj.bq(arg1, arg2, arg3, 22);
            }

            if(arg1 < 6600) {
                return dc.bx(arg1, arg2, arg3, 0x788E07D);
            }

            if(arg1 >= 6700) {
                return 2;
            }

            return gq.bg(arg1, arg2, arg3, 0x1F);
        label_6:
        }
        catch(RuntimeException v1) {
            goto label_6;
        }

        StringBuilder v2 = new StringBuilder();
        v2.append("hu.ae(");
        v2.append(')');
        throw lx.al(((Throwable)v1), v2.toString());
        return 2;
    }

    lq af() {
        lq v0 = new lq(100);
        v0.ar(hu.ax * 0x43B0149, 103);
        v0.ar(this.ae, 77);
        int v1 = this.ar ? 1 : 0;
        v0.ar(v1, 46);
        v0.ar(this.an * 0x3CA82057, 18);
        v0.ar(this.ad.size(), 7);
        Iterator v1_1 = this.ad.entrySet().iterator();
        while(v1_1.hasNext()) {
            Object v2 = v1_1.next();
            v0.aj(((Map$Entry)v2).getKey().intValue(), 0x79EF67B1);
            v0.aj(((Map$Entry)v2).getValue().intValue(), 0x79EF67B1);
        }

        String v1_2 = this.ap != null ? this.ap : "";
        v0.ai(v1_2, -53);
        v0.ab(this.aj, -984826401);
        return v0;
    }

    static hu ai() {
        int v1;
        og v2;
        int v5;
        hu v0 = new hu();
        try {
            v5 = 0;
            v2 = kr.al("", client.aj.aj, false, 4);
            v1 = 0xEE9012BD;
        }
        catch(Exception ) {
            v2 = ((og)v1);
            goto label_33;
        }

        try {
            byte[] v1_1 = new byte[((int)v2.an(v1))];
            while(true) {
                if(v5 >= v1_1.length) {
                    goto label_26;
                }

                int v3 = v2.ap(v1_1, v5, v1_1.length - v5, 1166006047);
                if(v3 == -1) {
                    break;
                }

                v5 += v3;
            }

            throw new IOException();
        label_26:
            v0 = new hu(new lq(v1_1));
            goto label_33;
        }
        catch(Exception ) {
        label_33:
            if(v2 != null) {
                v1 = 0x118A8F60;
                try {
                    v2.ae(v1);
                    return v0;
                }
                catch(Exception ) {
                    return v0;
                }
            }

            return v0;
        }
    }

    void aj(int arg3, int arg4) {
        if(this.ad.size() >= 0xAD5B70DA && !this.ad.containsKey(Integer.valueOf(arg3))) {
            Iterator v0 = this.ad.entrySet().iterator();
            v0.next();
            v0.remove();
        }

        if(arg3 != 0) {
            this.ad.put(Integer.valueOf(arg3), Integer.valueOf(arg4));
        }
    }

    static final void ak(String arg3, int arg4, int arg5) {
        try {
            na v5 = cd.al(nf.dk, client.eh.an, 0x870AA9F3);
            v5.ae.ar(ki.af(arg3, 0x76) + 1, 77);
            v5.ae.bj(arg4, -1455999013);
            v5.ae.ai(arg3, -122);
            client.eh.ae(v5, 0xAE2092C0);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("hu.ak(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void al(int arg2, int arg3, byte arg4) {
        try {
            if(this.ad.size() >= 100 && !this.ad.containsKey(Integer.valueOf(arg2))) {
                Iterator v4 = this.ad.entrySet().iterator();
                v4.next();
                v4.remove();
            }

            if(arg2 != 0) {
                this.ad.put(Integer.valueOf(arg2), Integer.valueOf(arg3));
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("hu.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static boolean al(CharSequence arg2, int arg3) {
        arg3 = 10;
        int v1 = 0x9C8D83A2;
        try {
            return ev.ae(arg2, arg3, true, v1);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("hu.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static dn al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dn.al.ax(v0);
            if(v5 != null) {
                return ((dn)v5);
            }

            byte[] v4_1 = dn.ax.ae(34, arg4, 0x78DC0DC9);
            dn v5_1 = new dn();
            if(v4_1 != null) {
                v5_1.ar(new lq(v4_1), -2002183860);
            }

            v5_1.ae(0x1D720B22);
            dn.al.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("hu.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    void ap(boolean arg1) {
    }

    void aq(int arg3, int arg4) {
        if(this.ad.size() >= 100 && !this.ad.containsKey(Integer.valueOf(arg3))) {
            Iterator v0 = this.ad.entrySet().iterator();
            v0.next();
            v0.remove();
        }

        if(arg3 != 0) {
            this.ad.put(Integer.valueOf(arg3), Integer.valueOf(arg4));
        }
    }

    static void av() {
        og v2;
        og v1 = null;
        try {
            v2 = kr.al("", client.aj.aj, true, 4);
        }
        catch(Exception ) {
            v2 = v1;
            goto label_19;
        }

        try {
            lq v1_1 = li.rg.ae(-1590941582);
            v2.al(v1_1.ae, 0, v1_1.ar * 0xF24F550B, 0x6996C0CA);
            goto label_19;
        }
        catch(Exception ) {
        label_19:
            if(v2 != null) {
                int v1_2 = 2003168314;
                try {
                    v2.ar(true, v1_2);
                    return;
                }
                catch(Exception ) {
                    return;
                }
            }

            return;
        }
    }

    void ax(boolean arg1, byte arg2) {
    }

    static void cm(int[] arg19, int[] arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, byte arg32) {
        int v14;
        int v1 = arg31;
        int v2 = 0xFF;
        if(v1 < v2) {
            goto label_20;
        }

        int v13 = 0x6EBF7F99;
        int[] v1_1 = arg19;
        int[] v2_1 = arg20;
        int v4 = arg22;
        int v5 = arg23;
        int v6 = arg24;
        int v7 = arg25;
        int v8 = arg26;
        int v9 = arg27;
        int v10 = arg28;
        int v11 = arg29;
        int v12 = arg30;
        try {
            cc.ao(v1_1, v2_1, 0, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13);
            return;
        label_20:
            v2 -= v1;
            int v3 = v1 << 24;
            v4 = -arg27;
            v5 = arg23;
            v6 = arg24;
            while(true) {
            label_26:
                if(v4 >= 0) {
                    return;
                }

                v7 = (v5 >> 16) * arg30;
                v10 = -arg26;
                v11 = v6;
                v6 = arg22;
                while(true) {
                label_33:
                    if(v10 >= 0) {
                        goto label_86;
                    }

                    v12 = arg20[(v6 >> 16) + v7];
                    if(v12 != 0) {
                        v14 = arg19[v11];
                        if(v14 == 0) {
                            v14 = v11 + 1;
                            arg19[v11] = v12 & 0xFFFFFF | v3;
                        }
                        else {
                            arg19[v11] = ((v14 & 0xFF00) * v2 + (v12 & 0xFF00) * v1 & 0xFF0000) + ((v12 & 0xFF00FF) * v1 + (v14 & 0xFF00FF) * v2 & 0xFF00FF00) >>> 8 | (v14 | v3) & 0xFF000000;
                            v14 = v11 + 1;
                        }

                        break;
                    }
                    else {
                        goto label_73;
                    }
                }
            }
        }
        catch(RuntimeException v0) {
            goto label_77;
        }

        v11 = v14;
        goto label_74;
    label_73:
        ++v11;
    label_74:
        v6 += arg28;
        ++v10;
        goto label_33;
    label_86:
        v5 += arg29;
        ++v4;
        v6 = v11 + arg25;
        goto label_26;
        return;
    label_77:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("hu.cm(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0), v1_2.toString());
    }
}

