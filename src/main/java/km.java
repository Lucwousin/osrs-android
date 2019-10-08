import java.io.IOException;
import java.util.zip.CRC32;

public class km {
    static int aa = 0;
    static oh ab = null;
    static byte ac = 0;
    static oh ad = null;
    static final int ae = 0x100;
    static int af = 0;
    static lq ah = null;
    static fn ai = null;
    static long aj = 0;
    static ki[] ak = null;
    static final int al = 0x20;
    static int am = 0;
    static mz an = null;
    static CRC32 ao = null;
    static int ap = 0;
    static int aq = 0;
    static oh au = null;
    static oh av = null;
    static final int ax = 0x1000;
    static int ay;
    public static int ba;
    public static int bd;

    static {
        km.ad = new oh(0x1000);
        km.aq = 0;
        km.ab = new oh(0x20);
        km.af = 0;
        km.ai = new fn();
        km.av = new oh(0x1000);
        km.aa = 0;
        km.au = new oh(0x1000);
        km.am = 0;
        km.ah = new lq(8);
        km.ay = 0;
        km.ao = new CRC32();
        km.ak = new ki[0x100];
        km.ac = 0;
        km.bd = 0;
        km.ba = 0;
    }

    km() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("km.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void aa(boolean arg3) {
        lq v0;
        int v1;
        if(km.an == null) {
            return;
        }

        try {
            v1 = 4;
            v0 = new lq(v1);
            if(!arg3) {
                goto label_9;
            }
        }
        catch(IOException ) {
            try {
            label_19:
                km.an.an();
            }
            catch(Exception ) {
            }

            goto label_21;
        }

        try {
            int v3 = 2;
            goto label_10;
        label_9:
            v3 = 3;
        label_10:
            v0.ar(v3, 37);
            v0.ap(0, -117);
            km.an.af(v0.ae, 0, v1);
            return;
        }
        catch(IOException ) {
            goto label_19;
        }

    label_21:
        km.ba += 0x2E50558D;
        km.an = null;
    }

    public static boolean ab() {
        int v7;
        long v0 = ji.ax(0x2076E2C1);
        int v2 = ((int)(v0 - km.aj * 5677006938123099409L));
        km.aj = v0 * 0x645EE94641D33F1L;
        int v0_1 = 200;
        if(v2 > -825058887) {
            v2 = 200;
        }

        km.ap += v2 * 0xB0A45461;
        v2 = -70103809;
        int v3 = 1220765581;
        int v4 = 0xF5D8B541;
        if(km.am * v2 == 0 && km.af * 0xF574C5F1 == 0 && km.aa * v4 == 0 && km.aq * v3 == 0) {
            return 1;
        }

        if(km.an == null) {
            return 0;
        }

        int v1 = 1203589025;
        try {
            if(km.ap * v1 <= -702205745) {
                while(true) {
                    v7 = 4;
                    if(km.af * 0xBE0052F5 < v0_1 && km.aq * v3 > 0) {
                        mx v1_1 = km.ad.ae();
                        lq v8 = new lq(v7);
                        v8.ar(1, 94);
                        v8.ap(((int)((kd)v1_1).gx), -64);
                        km.an.af(v8.ae, 0, v7);
                        km.ab.al(v1_1, ((kd)v1_1).gx);
                        km.aq -= 0xF1E60989;
                        km.af += -1189983907;
                        continue;
                    }

                    break;
                }

                while(km.am * v2 < v0_1) {
                    if(km.aa * v4 <= 0) {
                        return 1;
                    }

                    mv v1_2 = km.ai.ae();
                    lq v3_1 = new lq(v7);
                    v3_1.ar(0, 100);
                    v3_1.ap(((int)((kd)v1_2).gx), -13);
                    km.an.af(v3_1.ae, 0, v7);
                    ((kd)v1_2).de();
                    km.au.al(((mx)v1_2), ((kd)v1_2).gx);
                    km.aa -= 0x316F1172;
                    km.am += 0x4404B2FF;
                }

                return 1;
            }

            throw new IOException();
        }
        catch(IOException ) {
            try {
                km.an.an();
                goto label_117;
            }
            catch(Exception ) {
            label_117:
                km.ba += 0x2E50558D;
                km.an = null;
                return 0;
            }
        }
    }

    public static int ac(boolean arg3, boolean arg4) {
        int v0 = 0;
        if(arg3) {
            v0 = km.af * 0xBE0052F5 + km.aq * 1220765581;
        }

        if(arg4) {
            v0 += km.aa * 0xF5D8B541 + km.am * -70103809;
        }

        return v0;
    }

    public static boolean af() {
        int v11;
        int v9;
        int v6_1;
        lq v6;
        int v7;
        long v0 = ji.ax(0x2076E2C1);
        int v2 = ((int)(v0 - km.aj * 5677006938123099409L));
        km.aj = v0 * 0x645EE94641D33F1L;
        int v0_1 = 200;
        if(v2 > v0_1) {
            v2 = 0x667034A3;
        }

        km.ap += v2 * -166707003;
        v2 = 0xBE0052F5;
        if(km.am * -70103809 == 0 && km.af * v2 == 0 && km.aa * 0x31752C37 == 0 && km.aq * 0xBDFD67E1 == 0) {
            return 1;
        }

        if(km.an == null) {
            return 0;
        }

        int v1 = 1203589025;
        kd v5 = null;
        try {
            if(km.ap * v1 > -614901540) {
                goto label_398;
            }

            while(true) {
                v7 = 4;
                if(km.af * v2 < -462103928 && km.aq * 1220765581 > 0) {
                    mx v1_1 = km.ad.ae();
                    v6 = new lq(v7);
                    v6.ar(1, 33);
                    v6.ap(((int)((kd)v1_1).gx), -92);
                    km.an.af(v6.ae, 0, v7);
                    km.ab.al(v1_1, ((kd)v1_1).gx);
                    km.aq -= 0x95843345;
                    km.af += 0x6CD70081;
                    continue;
                }

                break;
            }

            while(true) {
                v1 = 0x4404B2FF;
                if(km.am * 0xBB0CA62D < v0_1 && km.aa * 0xF5D8B541 > 0) {
                    mv v2_1 = km.ai.ae();
                    v6 = new lq(v7);
                    v6.ar(0, 108);
                    v6.ap(((int)((kd)v2_1).gx), -29);
                    km.an.af(v6.ae, 0, v7);
                    ((kd)v2_1).de();
                    km.au.al(((mx)v2_1), ((kd)v2_1).gx);
                    km.aa -= 0x3B7FC913;
                    km.am += v1;
                    continue;
                }

                break;
            }

            v0_1 = 0;
            while(true) {
                if(v0_1 < 100) {
                    v2 = km.an.aj();
                    if(v2 < 0) {
                        break;
                    }
                    else if(v2 == 0) {
                    }
                    else {
                        km.ap = 0;
                        if(dq.ag == null) {
                            v6_1 = 8;
                        }
                        else if(km.ay * 0x53035B50 == 0) {
                            v6_1 = 1;
                        }
                        else {
                            v6_1 = 0;
                        }

                        v7 = 0x280FFCE5;
                        int v8 = 0xF24F550B;
                        if(v6_1 > 0) {
                            v9 = v6_1 - km.ah.ar * v8;
                            if(v9 > v2) {
                            }
                            else {
                                v2 = v9;
                            }

                            km.an.aq(km.ah.ae, km.ah.ar * 0x190F8, v2);
                            if(km.ac != 0) {
                                for(v9 = 0; v9 < v2; ++v9) {
                                    byte[] v10 = km.ah.ae;
                                    v11 = km.ah.ar * v8 + v9;
                                    v10[v11] = ((byte)(v10[v11] ^ km.ac));
                                }
                            }

                            km.ah.ar += v2 * 1017029400;
                            if(km.ah.ar * -2090269649 < v6_1) {
                                return 1;
                            }

                            if(dq.ag == null) {
                                km.ah.ar = 0;
                                v2 = km.ah.ay(-56);
                                v6_1 = km.ah.ao(0xAB2F56C0);
                                v7 = km.ah.ay(-37);
                                v8 = km.ah.ac(107);
                                long v9_1 = ((long)(v6_1 + (v2 << 16)));
                                mx v2_2 = km.ab.ax(v9_1);
                                hg.az = true;
                                if(v2_2 == null) {
                                    v2_2 = km.au.ax(v9_1);
                                    hg.az = false;
                                }

                                if(v2_2 != null) {
                                    v6_1 = v7 == 0 ? 5 : 9;
                                    dq.ag = ((kd)v2_2);
                                    hu.at = new lq(v6_1 + v8 + dq.ag.ae);
                                    hu.at.ar(v7, 88);
                                    hu.at.aj(v8, 0x79EF67B1);
                                    km.ay = 0x70A34F8C;
                                    km.ah.ar = 0;
                                    goto label_392;
                                }

                                throw new IOException();
                            }

                            if(km.ay * 0x4B7CAF61 != 0) {
                                goto label_392;
                            }

                            if(km.ah.ae[0] == -1) {
                                km.ay = v7;
                                km.ah.ar = 0;
                                goto label_392;
                            }

                            dq.ag = v5;
                        }
                        else {
                            v6_1 = hu.at.ae.length - dq.ag.ae;
                            int v10_1 = 0x200;
                            v9 = 0x200 - km.ay * 1651008133;
                            if(v9 > v6_1 - hu.at.ar * 0x90054CAF) {
                                v9 = v6_1 - hu.at.ar * v8;
                            }

                            if(v9 > v2) {
                            }
                            else {
                                v2 = v9;
                            }

                            km.an.aq(hu.at.ae, hu.at.ar * v8, v2);
                            if(km.ac != 0) {
                                for(v9 = 0; v9 < v2; ++v9) {
                                    byte[] v11_1 = hu.at.ae;
                                    int v13 = hu.at.ar * 0x1EF27E5E + v9;
                                    ((byte[])v11)[v13] = ((byte)(((byte[])v11)[v13] ^ km.ac));
                                }
                            }

                            hu.at.ar += 475440244 * v2;
                            km.ay += v2 * v7;
                            if(hu.at.ar * v8 == v6_1) {
                                if(dq.ag.gx == 0xFF00FF) {
                                    ih.as = hu.at;
                                }
                                else {
                                    km.ao.reset();
                                    km.ao.update(hu.at.ae, 0, v6_1);
                                    if(dq.ag.al * -1195063746 != (((int)km.ao.getValue()))) {
                                        try {
                                            km.an.an();
                                            goto label_335;
                                        }
                                        catch(Exception ) {
                                        label_335:
                                            km.bd += 0x9B26A15F;
                                            km.an = ((mz)v5);
                                            km.ac = ((byte)(((int)(Math.random() * 255 + 1))));
                                            return 0;
                                        }
                                    }
                                    else {
                                        km.bd = 0;
                                        km.ba = 0;
                                        ki v6_2 = dq.ag.ax;
                                        v7 = ((int)(dq.ag.gx & 0xFFFF));
                                        byte[] v8_1 = hu.at.ae;
                                        boolean v9_2 = 0xFF0000 == (dq.ag.gx & 0xFF0000) ? true : false;
                                        v6_2.dz(v7, v8_1, v9_2, hg.az, -362301459);
                                    }
                                }

                                dq.ag.lp();
                                if(hg.az) {
                                    km.af -= 1284350598;
                                }
                                else {
                                    km.am -= v1;
                                }

                                km.ay = 0;
                                dq.ag = v5;
                                hu.at = ((lq)v5);
                                goto label_392;
                            }

                            if(km.ay * 0xD81960ED != v10_1) {
                                return 1;
                            }

                            km.ay = 0;
                        }

                    label_392:
                        ++v0_1;
                        continue;
                    }
                }

                return 1;
            }

            throw new IOException();
            return 1;
        label_398:
            throw new IOException();
        }
        catch(IOException ) {
            try {
                km.an.an();
                goto label_403;
            }
            catch(Exception ) {
            label_403:
                km.ba += -350783300;
                km.an = ((mz)v5);
                return 0;
            }
        }
    }

    static void ag(ki arg9, int arg10) {
        if(ih.as != null) {
            ih.as.ar = arg10 * 0x7F567518 - 0x3069F6D1;
            arg9.da(ih.as.ac(51), ih.as.ac(36), -80);
            return;
        }

        ia.an(null, 0xFF, 0xFF, 0, 0, true, 0x260C9B1C);
        km.ak[arg10] = arg9;
    }

    static void ah(ki arg9, int arg10) {
        if(ih.as != null) {
            ih.as.ar = arg10 * 0x7F567518 - 0x54A2BD79;
            arg9.da(ih.as.ac(76), ih.as.ac(35), -20);
            return;
        }

        ia.an(null, 0xFF, -1104433821, 0, 0, true, 0x260C9B1C);
        km.ak[arg10] = arg9;
    }

    public static boolean ai() {
        int v13;
        byte[] v12;
        int v11_1;
        int v10;
        int v9;
        long v0 = ji.ax(0x2076E2C1);
        int v2 = ((int)(v0 - km.aj * 5677006938123099409L));
        km.aj = v0 * 0x645EE94641D33F1L;
        int v0_1 = 200;
        if(v2 > v0_1) {
            v2 = 200;
        }

        km.ap += v2 * 0xB0A45461;
        v2 = -70103809;
        int v3 = 1220765581;
        int v4 = 0xF5D8B541;
        int v5 = 0xBE0052F5;
        if(km.am * v2 == 0 && km.af * v5 == 0 && km.aa * v4 == 0 && km.aq * v3 == 0) {
            return 1;
        }

        if(km.an == null) {
            return 0;
        }

        int v1 = 1203589025;
        kd v8 = null;
        try {
            if(km.ap * v1 > 30000) {
                goto label_409;
            }

            while(true) {
                v9 = -1189983907;
                v10 = 4;
                if(km.af * v5 < v0_1 && km.aq * v3 > 0) {
                    mx v1_1 = km.ad.ae();
                    lq v11 = new lq(v10);
                    v11.ar(1, 85);
                    v11.ap(((int)((kd)v1_1).gx), -111);
                    km.an.af(v11.ae, 0, v10);
                    km.ab.al(v1_1, ((kd)v1_1).gx);
                    km.aq -= 0x95843345;
                    km.af += v9;
                    continue;
                }

                break;
            }

            while(true) {
                v3 = 0x4404B2FF;
                if(km.am * v2 < v0_1 && km.aa * v4 > 0) {
                    mv v1_2 = km.ai.ae();
                    lq v5_1 = new lq(v10);
                    v5_1.ar(0, 29);
                    v5_1.ap(((int)((kd)v1_2).gx), -34);
                    km.an.af(v5_1.ae, 0, v10);
                    ((kd)v1_2).de();
                    km.au.al(((mx)v1_2), ((kd)v1_2).gx);
                    km.aa -= 0xADC6DAC1;
                    km.am += v3;
                    continue;
                }

                break;
            }

            v0_1 = 0;
            while(true) {
                if(v0_1 < 100) {
                    v1 = km.an.aj();
                    if(v1 < 0) {
                        break;
                    }
                    else if(v1 == 0) {
                    }
                    else {
                        km.ap = 0;
                        v4 = 0xD81960ED;
                        if(dq.ag == null) {
                            v2 = 8;
                        }
                        else if(km.ay * v4 == 0) {
                            v2 = 1;
                        }
                        else {
                            v2 = 0;
                        }

                        v5 = -1880437085;
                        v10 = 0xF24F550B;
                        if(v2 > 0) {
                            v11_1 = v2 - km.ah.ar * v10;
                            if(v11_1 > v1) {
                            }
                            else {
                                v1 = v11_1;
                            }

                            km.an.aq(km.ah.ae, km.ah.ar * v10, v1);
                            if(km.ac != 0) {
                                for(v11_1 = 0; v11_1 < v1; ++v11_1) {
                                    v12 = km.ah.ae;
                                    v13 = km.ah.ar * v10 + v11_1;
                                    v12[v13] = ((byte)(v12[v13] ^ km.ac));
                                }
                            }

                            km.ah.ar += v1 * v5;
                            if(km.ah.ar * v10 < v2) {
                                return 1;
                            }

                            if(dq.ag == null) {
                                km.ah.ar = 0;
                                v1 = km.ah.ay(-51);
                                v2 = km.ah.ao(54256099);
                                v4 = km.ah.ay(-65);
                                v5 = km.ah.ac(27);
                                long v1_3 = ((long)(v2 + (v1 << 16)));
                                mx v10_1 = km.ab.ax(v1_3);
                                hg.az = true;
                                if(v10_1 == null) {
                                    v10_1 = km.au.ax(v1_3);
                                    hg.az = false;
                                }

                                if(v10_1 != null) {
                                    v1 = v4 == 0 ? 5 : 9;
                                    dq.ag = ((kd)v10_1);
                                    hu.at = new lq(v1 + v5 + dq.ag.ae);
                                    hu.at.ar(v4, 46);
                                    hu.at.aj(v5, 0x79EF67B1);
                                    km.ay = 0x407FE728;
                                    km.ah.ar = 0;
                                    goto label_403;
                                }

                                throw new IOException();
                            }

                            if(km.ay * v4 != 0) {
                                goto label_403;
                            }

                            if(km.ah.ae[0] == -1) {
                                km.ay = 0x280FFCE5;
                                km.ah.ar = 0;
                                goto label_403;
                            }

                            dq.ag = v8;
                        }
                        else {
                            v2 = hu.at.ae.length - dq.ag.ae;
                            int v12_1 = 0x200;
                            v11_1 = 0x200 - km.ay * v4;
                            if(v11_1 > v2 - hu.at.ar * v10) {
                                v11_1 = v2 - hu.at.ar * v10;
                            }

                            if(v11_1 > v1) {
                            }
                            else {
                                v1 = v11_1;
                            }

                            km.an.aq(hu.at.ae, hu.at.ar * v10, v1);
                            if(km.ac != 0) {
                                for(v11_1 = 0; v11_1 < v1; ++v11_1) {
                                    byte[] v13_1 = hu.at.ae;
                                    int v14 = hu.at.ar * v10 + v11_1;
                                    ((byte[])v13)[v14] = ((byte)(((byte[])v13)[v14] ^ km.ac));
                                }
                            }

                            hu.at.ar += v5 * v1;
                            km.ay += v1 * 0x280FFCE5;
                            if(hu.at.ar * v10 == v2) {
                                if(dq.ag.gx == 0xFF00FF) {
                                    ih.as = hu.at;
                                    for(v1 = 0; v1 < 0x100; ++v1) {
                                        ki v2_1 = km.ak[v1];
                                        if(v2_1 != null) {
                                            ih.as.ar = 0x7F567518 * v1 - 0x3069F6D1;
                                            v2_1.da(ih.as.ac(99), ih.as.ac(81), -79);
                                        }
                                    }
                                }
                                else {
                                    km.ao.reset();
                                    km.ao.update(hu.at.ae, 0, v2);
                                    if(dq.ag.al * 0x8FBAED17 != (((int)km.ao.getValue()))) {
                                        try {
                                            km.an.an();
                                            goto label_347;
                                        }
                                        catch(Exception ) {
                                        label_347:
                                            km.bd += 0x9B26A15F;
                                            km.an = ((mz)v8);
                                            km.ac = ((byte)(((int)(Math.random() * 255 + 1))));
                                            return 0;
                                        }
                                    }

                                    km.bd = 0;
                                    km.ba = 0;
                                    ki v10_2 = dq.ag.ax;
                                    v11_1 = ((int)(dq.ag.gx & 0xFFFF));
                                    v12 = hu.at.ae;
                                    boolean v13_2 = 0xFF0000 == (dq.ag.gx & 0xFF0000) ? true : false;
                                    v10_2.dz(v11_1, v12, v13_2, hg.az, 0xF711E941);
                                }

                                dq.ag.lp();
                                if(hg.az) {
                                    km.af -= v9;
                                }
                                else {
                                    km.am -= v3;
                                }

                                km.ay = 0;
                                dq.ag = v8;
                                hu.at = ((lq)v8);
                                goto label_403;
                            }

                            if(km.ay * v4 != v12_1) {
                                return 1;
                            }

                            km.ay = 0;
                        }

                    label_403:
                        ++v0_1;
                        continue;
                    }
                }

                return 1;
            }

            throw new IOException();
            return 1;
        label_409:
            throw new IOException();
        }
        catch(IOException ) {
            try {
                km.an.an();
                goto label_414;
            }
            catch(Exception ) {
            label_414:
                km.ba += 0x2E50558D;
                km.an = ((mz)v8);
                return 0;
            }
        }
    }

    public static int ak(boolean arg3, boolean arg4) {
        int v0 = 0;
        if(arg3) {
            v0 = km.af * 0xD1A6ED2E + km.aq * -1042367436;
        }

        if(arg4) {
            v0 += km.aa * 0xF5D8B541 + km.am * 0x97B4CE45;
        }

        return v0;
    }

    public static void am(mz arg4, boolean arg5) {
        mx v4;
        mz v1 = null;
        if(km.an != null) {
            try {
                km.an.an();
                goto label_5;
            }
            catch(Exception ) {
            label_5:
                km.an = v1;
            }
        }

        km.an = arg4;
        md.al(arg5, 0xFF00FF00);
        km.ah.ar = 0;
        dq.ag = ((kd)v1);
        hu.at = ((lq)v1);
        km.ay = 0;
        while(true) {
            v4 = km.ab.ae();
            if(v4 != null) {
                km.ad.al(v4, ((kd)v4).gx);
                km.aq += 0x95843345;
                km.af -= 1564317025;
                continue;
            }

            break;
        }

        while(true) {
            v4 = km.au.ae();
            if(v4 == null) {
                break;
            }

            km.ai.al(((mv)v4));
            km.av.al(v4, ((kd)v4).gx);
            km.aa += 0xADC6DAC1;
            km.am -= -404208939;
        }

        if(km.ac != 0) {
            try {
                lq v4_1 = new lq(4);
                v4_1.ar(4, 33);
                v4_1.ar(km.ac, 58);
                v4_1.an(0, 0xAEDE0EE0);
                km.an.af(v4_1.ae, 0, 4);
            }
            catch(IOException ) {
                try {
                    km.an.an();
                    goto label_39;
                }
                catch(Exception ) {
                label_39:
                    km.ba += 0xE89154A8;
                    km.an = v1;
                }
            }
        }

        km.ap = 0;
        km.aj = ji.ax(0x2076E2C1) * 0x645EE94641D33F1L;
    }

    static void ao(int arg1, int arg2) {
        mx v1 = km.av.ax(((long)(arg2 + (arg1 << 16))));
        if(v1 == null) {
            return;
        }

        km.ai.al(((mv)v1));
    }

    static void as(int arg1, int arg2) {
        mx v1 = km.av.ax(((long)(arg2 + (arg1 << 16))));
        if(v1 == null) {
            return;
        }

        km.ai.al(((mv)v1));
    }

    static void at(ki arg9, int arg10) {
        if(ih.as != null) {
            ih.as.ar = arg10 * 0x7F567518 - 0x3069F6D1;
            arg9.da(ih.as.ac(0x72), ih.as.ac(49), 26);
            return;
        }

        ia.an(null, 0xFF, 0xFF, 0, 0, true, 0x260C9B1C);
        km.ak[arg10] = arg9;
    }

    public static void au(mz arg4, boolean arg5) {
        mx v4;
        mz v1 = null;
        if(km.an != null) {
            try {
                km.an.an();
                goto label_5;
            }
            catch(Exception ) {
            label_5:
                km.an = v1;
            }
        }

        km.an = arg4;
        md.al(arg5, 0xFF00FF00);
        km.ah.ar = 0;
        dq.ag = ((kd)v1);
        hu.at = ((lq)v1);
        km.ay = 0;
        while(true) {
            v4 = km.ab.ae();
            if(v4 != null) {
                km.ad.al(v4, ((kd)v4).gx);
                km.aq += 0x95843345;
                km.af -= -1189983907;
                continue;
            }

            break;
        }

        while(true) {
            v4 = km.au.ae();
            if(v4 == null) {
                break;
            }

            km.ai.al(((mv)v4));
            km.av.al(v4, ((kd)v4).gx);
            km.aa += -1993698902;
            km.am -= 0x66BAF315;
        }

        if(km.ac != 0) {
            try {
                lq v4_1 = new lq(4);
                v4_1.ar(4, 108);
                v4_1.ar(km.ac, 69);
                v4_1.an(0, 0xCD9F306A);
                km.an.af(v4_1.ae, 0, 4);
            }
            catch(IOException ) {
                try {
                    km.an.an();
                    goto label_39;
                }
                catch(Exception ) {
                label_39:
                    km.ba += 0x2E50558D;
                    km.an = v1;
                }
            }
        }

        km.ap = 0;
        km.aj = ji.ax(0x2076E2C1) * 0x645EE94641D33F1L;
    }

    public static boolean av() {
        ki v5_1;
        int v9;
        int v7;
        lq v4;
        int v5;
        long v0 = ji.ax(0x2076E2C1);
        int v2 = ((int)(v0 - km.aj * 5677006938123099409L));
        km.aj = v0 * 0x645EE94641D33F1L;
        int v0_1 = 200;
        if(v2 > v0_1) {
        }
        else {
            v0_1 = v2;
        }

        km.ap += v0_1 * 0xD5BDFFB1;
        if(km.am * 0x342285C2 == 0 && km.af * 0x802E2B53 == 0 && km.aa * 0x5F8F1371 == 0 && km.aq * 1220765581 == 0) {
            return 1;
        }

        if(km.an == null) {
            return 0;
        }

        v0_1 = 1203589025;
        kd v3 = null;
        try {
            if(km.ap * v0_1 > 0x52CC6236) {
                goto label_426;
            }

            while(true) {
                v5 = 4;
                if(km.af * 0x19F041FB < 0xF2F1A9DB && km.aq * -710077296 > 0) {
                    mx v0_2 = km.ad.ae();
                    v4 = new lq(v5);
                    v4.ar(1, 0x7E);
                    v4.ap(((int)((kd)v0_2).gx), -69);
                    km.an.af(v4.ae, 0, v5);
                    km.ab.al(v0_2, ((kd)v0_2).gx);
                    km.aq -= 0x47BF34E8;
                    km.af += -1189983907;
                    continue;
                }

                break;
            }

            while(km.am * 0x1F3D6337 < 0x448A52DF) {
                if(km.aa * 0x9F03B92B <= 0) {
                    break;
                }

                mv v0_3 = km.ai.ae();
                v4 = new lq(v5);
                v4.ar(0, 30);
                v4.ap(((int)((kd)v0_3).gx), -57);
                km.an.af(v4.ae, 0, v5);
                ((kd)v0_3).de();
                km.au.al(((mx)v0_3), ((kd)v0_3).gx);
                km.aa -= 0xADC6DAC1;
                km.am += 0x9B50340;
            }

            v0_1 = 0;
            while(true) {
                if(v0_1 < 100) {
                    int v4_1 = km.an.aj();
                    if(v4_1 < 0) {
                        break;
                    }
                    else if(v4_1 == 0) {
                    }
                    else {
                        km.ap = 0;
                        if(dq.ag == null) {
                            v5 = 8;
                        }
                        else if(km.ay * 0xD81960ED == 0) {
                            v5 = 1;
                        }
                        else {
                            v5 = 0;
                        }

                        int v6 = 0xF24F550B;
                        if(v5 > 0) {
                            v7 = v5 - km.ah.ar * 0x8D35FF;
                            if(v7 > v4_1) {
                            }
                            else {
                                v4_1 = v7;
                            }

                            km.an.aq(km.ah.ae, km.ah.ar * 0x3A8B7292, v4_1);
                            if(km.ac != 0) {
                                for(v7 = 0; v7 < v4_1; ++v7) {
                                    byte[] v8 = km.ah.ae;
                                    v9 = km.ah.ar * v6 + v7;
                                    v8[v9] = ((byte)(v8[v9] ^ km.ac));
                                }
                            }

                            km.ah.ar += v4_1 * 0xCBB0E31A;
                            if(km.ah.ar * 0x4B10C8E < v5) {
                                return 1;
                            }

                            if(dq.ag == null) {
                                km.ah.ar = 0;
                                v4_1 = km.ah.ay(-14);
                                v5 = km.ah.ao(0xA35F1CC);
                                v6 = km.ah.ay(-12);
                                v7 = km.ah.ac(65);
                                long v4_2 = ((long)(v5 + (v4_1 << 16)));
                                mx v8_1 = km.ab.ax(v4_2);
                                hg.az = true;
                                if(v8_1 == null) {
                                    v8_1 = km.au.ax(v4_2);
                                    hg.az = false;
                                }

                                if(v8_1 != null) {
                                    v4_1 = v6 == 0 ? 5 : 9;
                                    dq.ag = ((kd)v8_1);
                                    hu.at = new lq(v4_1 + v7 + dq.ag.ae);
                                    hu.at.ar(v6, 20);
                                    hu.at.aj(v7, 0x79EF67B1);
                                    km.ay = 0x407FE728;
                                    km.ah.ar = 0;
                                    goto label_420;
                                }

                                throw new IOException();
                            }

                            if(km.ay * 389756508 != 0) {
                                goto label_420;
                            }

                            if(km.ah.ae[0] == -1) {
                                km.ay = 0x280FFCE5;
                                km.ah.ar = 0;
                                goto label_420;
                            }

                            dq.ag = v3;
                        }
                        else {
                            v5 = hu.at.ae.length - dq.ag.ae;
                            int v8_2 = 0x200;
                            v7 = 0x200 - km.ay * 0xD68D09D5;
                            if(v7 > v5 - hu.at.ar * 1003940842) {
                                v7 = v5 - hu.at.ar * -1803715706;
                            }

                            if(v7 > v4_1) {
                            }
                            else {
                                v4_1 = v7;
                            }

                            km.an.aq(hu.at.ae, hu.at.ar * v6, v4_1);
                            if(km.ac != 0) {
                                for(v7 = 0; v7 < v4_1; ++v7) {
                                    byte[] v9_1 = hu.at.ae;
                                    int v10 = hu.at.ar * v6 + v7;
                                    ((byte[])v9)[v10] = ((byte)(((byte[])v9)[v10] ^ km.ac));
                                }
                            }

                            hu.at.ar += -1880437085 * v4_1;
                            km.ay += v4_1 * 513906134;
                            if(hu.at.ar * v6 == v5) {
                                if(dq.ag.gx == 0xFF00FF) {
                                    ih.as = hu.at;
                                    for(v4_1 = 0; v4_1 < 0x100; ++v4_1) {
                                        v5_1 = km.ak[v4_1];
                                        if(v5_1 != null) {
                                            ih.as.ar = 0x7F567518 * v4_1 - 0x3069F6D1;
                                            v5_1.da(ih.as.ac(77), ih.as.ac(23), 29);
                                        }
                                    }
                                }
                                else {
                                    km.ao.reset();
                                    km.ao.update(hu.at.ae, 0, v5);
                                    if(dq.ag.al * 0x8FBAED17 != (((int)km.ao.getValue()))) {
                                        try {
                                            km.an.an();
                                            goto label_362;
                                        }
                                        catch(Exception ) {
                                        label_362:
                                            km.bd += 0xF27AFBD6;
                                            km.an = ((mz)v3);
                                            km.ac = ((byte)(((int)(Math.random() * 255 + 1))));
                                            return 0;
                                        }
                                    }

                                    km.bd = 0;
                                    km.ba = 0;
                                    v5_1 = dq.ag.ax;
                                    v6 = ((int)(dq.ag.gx & 0xFFFF));
                                    byte[] v7_1 = hu.at.ae;
                                    boolean v8_3 = 0xFF0000 == (dq.ag.gx & 0xFF0000) ? true : false;
                                    v5_1.dz(v6, v7_1, v8_3, hg.az, 0xF0ACCC2C);
                                }

                                dq.ag.lp();
                                if(hg.az) {
                                    km.af -= 0x7F489760;
                                }
                                else {
                                    km.am -= 1401305594;
                                }

                                km.ay = 0;
                                dq.ag = v3;
                                hu.at = ((lq)v3);
                                goto label_420;
                            }

                            if(km.ay * 0xF810546D != v8_2) {
                                return 1;
                            }

                            km.ay = 0;
                        }

                    label_420:
                        ++v0_1;
                        continue;
                    }
                }

                return 1;
            }

            throw new IOException();
            return 1;
        label_426:
            throw new IOException();
        }
        catch(IOException ) {
            try {
                km.an.an();
                goto label_431;
            }
            catch(Exception ) {
            label_431:
                km.ba += 0xF452EDBF;
                km.an = ((mz)v3);
                return 0;
            }
        }
    }

    static void aw(int arg1, int arg2) {
        mx v1 = km.av.ax(((long)(arg2 + (arg1 << 16))));
        if(v1 == null) {
            return;
        }

        km.ai.al(((mv)v1));
    }

    static void ay(int arg1, int arg2) {
        mx v1 = km.av.ax(((long)(arg2 + (arg1 << 16))));
        if(v1 == null) {
            return;
        }

        km.ai.al(((mv)v1));
    }

    public static void az(mz arg4, boolean arg5) {
        mx v4;
        mz v1 = null;
        if(km.an != null) {
            try {
                km.an.an();
                goto label_5;
            }
            catch(Exception ) {
            label_5:
                km.an = v1;
            }
        }

        km.an = arg4;
        md.al(arg5, 0xFF00FF00);
        km.ah.ar = 0;
        dq.ag = ((kd)v1);
        hu.at = ((lq)v1);
        km.ay = 0;
        while(true) {
            v4 = km.ab.ae();
            if(v4 != null) {
                km.ad.al(v4, ((kd)v4).gx);
                km.aq += 0x95843345;
                km.af -= 0x897C4BC7;
                continue;
            }

            break;
        }

        while(true) {
            v4 = km.au.ae();
            if(v4 == null) {
                break;
            }

            km.ai.al(((mv)v4));
            km.av.al(v4, ((kd)v4).gx);
            km.aa += 0x280F2BBC;
            km.am -= 0x4404B2FF;
        }

        if(km.ac != 0) {
            try {
                lq v4_1 = new lq(4);
                v4_1.ar(4, 57);
                v4_1.ar(km.ac, 0x1F);
                v4_1.an(0, 1204230888);
                km.an.af(v4_1.ae, 0, 4);
            }
            catch(IOException ) {
                try {
                    km.an.an();
                    goto label_39;
                }
                catch(Exception ) {
                label_39:
                    km.ba += 0x2E50558D;
                    km.an = v1;
                }
            }
        }

        km.ap = 0;
        km.aj = ji.ax(0x2076E2C1) * 0x645EE94641D33F1L;
    }

    public static void ba() {
        if(km.an != null) {
            km.an.an();
        }

        km.aj = 0;
        km.ap = 0;
        km.ad = new oh(0x1000);
        km.aq = 0;
        km.ab = new oh(0x20);
        km.af = 0;
        km.ai = new fn();
        km.av = new oh(0xCB5E5E2);
        km.aa = 0;
        km.au = new oh(0x1000);
        km.am = 0;
        hg.az = false;
        dq.ag = null;
        km.ah = new lq(8);
        hu.at = null;
        km.ay = 0;
        ih.as = null;
        km.ak = new ki[0x100];
        km.ac = 0;
        km.bd = 0;
        km.ba = 0;
    }

    public static void bd() {
        if(km.an != null) {
            km.an.an();
        }

        km.aj = 0;
        km.ap = 0;
        km.ad = new oh(0x1000);
        km.aq = 0;
        km.ab = new oh(0x20);
        km.af = 0;
        km.ai = new fn();
        km.av = new oh(0x1000);
        km.aa = 0;
        km.au = new oh(0x1000);
        km.am = 0;
        hg.az = false;
        dq.ag = null;
        km.ah = new lq(8);
        hu.at = null;
        km.ay = 0;
        ih.as = null;
        km.ak = new ki[0x100];
        km.ac = 0;
        km.bd = 0;
        km.ba = 0;
    }

    public static void bf() {
        if(km.an != null) {
            km.an.an();
        }

        km.aj = 0;
        km.ap = 0;
        km.ad = new oh(0x1000);
        km.aq = 0;
        km.ab = new oh(0xC72514EF);
        km.af = 0;
        km.ai = new fn();
        km.av = new oh(-35960808);
        km.aa = 0;
        km.au = new oh(0x1000);
        km.am = 0;
        hg.az = false;
        dq.ag = null;
        km.ah = new lq(8);
        hu.at = null;
        km.ay = 0;
        ih.as = null;
        km.ak = new ki[0x6A06B2F0];
        km.ac = 0;
        km.bd = 0;
        km.ba = 0;
    }

    public static void bn() {
        if(km.an != null) {
            km.an.an();
        }

        km.aj = 0;
        km.ap = 0;
        km.ad = new oh(0x1000);
        km.aq = 0;
        km.ab = new oh(0x20);
        km.af = 0;
        km.ai = new fn();
        km.av = new oh(0x1000);
        km.aa = 0;
        km.au = new oh(0x1000);
        km.am = 0;
        hg.az = false;
        dq.ag = null;
        km.ah = new lq(8);
        hu.at = null;
        km.ay = 0;
        ih.as = null;
        km.ak = new ki[0x100];
        km.ac = 0;
        km.bd = 0;
        km.ba = 0;
    }
}

