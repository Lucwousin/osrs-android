public class kt extends mx {
    int[] ad;
    short[] ae;
    byte[] aj;
    hs[] al;
    byte[] an;
    kk[] ap;
    byte[] ar;
    int ax;
    static final long bp = 0xFFFFFFFFL;
    public static int jz;

    kt(byte[] arg28) {
        int v13_1;
        kk v5_2;
        byte[] v24;
        byte v12_1;
        int v21;
        int v26;
        int v3;
        int v8;
        int v7;
        kt v1 = this;
        try {
            super();
            v1.al = new hs[0x80];
            v1.ae = new short[0x80];
            v1.ar = new byte[0x80];
            v1.an = new byte[0x80];
            v1.ap = new kk[0x80];
            v1.aj = new byte[0x80];
            v1.ad = new int[0x80];
            lq v2 = new lq(arg28);
            int v4;
            for(v4 = 0; true; ++v4) {
                v7 = 0xF24F550B;
                if(v2.ae[v2.ar * v7 + v4] == 0) {
                    break;
                }
            }

            byte[] v5 = new byte[v4];
            int v6;
            for(v6 = 0; true; ++v6) {
                v8 = -1215098345;
                if(v6 >= v4) {
                    break;
                }

                v5[v6] = v2.aw(v8);
            }

            int v9 = -1880437085;
            v2.ar += v9;
            int v10 = v2.ar * v7;
            v2.ar += (v4 + 1) * v9;
            for(v4 = 0; v2.ae[v2.ar * v7 + v4] != 0; ++v4) {
            }

            byte[] v11 = new byte[v4];
            int v12;
            for(v12 = 0; v12 < v4; ++v12) {
                v11[v12] = v2.aw(v8);
            }

            v2.ar += v9;
            v12 = v2.ar * v7;
            v2.ar += (v4 + 1) * v9;
            for(v4 = 0; v2.ae[v2.ar * v7 + v4] != 0; ++v4) {
            }

            byte[] v13 = new byte[v4];
            int v14;
            for(v14 = 0; v14 < v4; ++v14) {
                v13[v14] = v2.aw(v8);
            }

            v2.ar += v9;
            ++v4;
            byte[] v14_1 = new byte[v4];
            int v15 = 2;
            if(v4 > 1) {
                v14_1[1] = 1;
                int v0_1 = 1;
                v3 = 2;
                int v16 = 2;
                while(v3 < v4) {
                    v9 = v2.ay(-105);
                    if(v9 == 0) {
                        v26 = v16;
                        ++v16;
                        v0_1 = v26;
                    }
                    else {
                        if(v9 <= v0_1) {
                            --v9;
                        }

                        v0_1 = v9;
                    }

                    v14_1[v3] = ((byte)v0_1);
                    ++v3;
                }

                v4 = v16;
            }

            kk[] v0_2 = new kk[v4];
            for(v3 = 0; v3 < v0_2.length; ++v3) {
                kk v9_1 = new kk();
                v0_2[v3] = v9_1;
                v8 = v2.ay(-73);
                if(v8 > 0) {
                    v9_1.ax = new byte[v8 * 2];
                }

                v8 = v2.ay(-112);
                if(v8 > 0) {
                    v9_1.al = new byte[v8 * 2 + v15];
                    v9_1.al[1] = 0x40;
                }
            }

            v8 = v2.ay(-124);
            byte[] v8_1 = v8 > 0 ? new byte[v8 * 2] : null;
            v9 = v2.ay(-52);
            byte[] v9_2 = v9 > 0 ? new byte[v9 * 2] : null;
            for(v6 = 0; v2.ae[v2.ar * v7 + v6] != 0; ++v6) {
            }

            byte[] v3_1 = new byte[v6];
            for(v7 = 0; v7 < v6; ++v7) {
                v3_1[v7] = v2.aw(-1215098345);
            }

            v2.ar += -1880437085;
            v6 = 0;
            v7 = 0;
            while(v6 < 0x80) {
                v7 += v2.ay(-124);
                v1.ae[v6] = ((short)v7);
                ++v6;
                v10 = v10;
            }

            int v20 = v10;
            v6 = 0;
            v7 = 0;
            while(v6 < 0x80) {
                v7 += v2.ay(-32);
                v1.ae[v6] = ((short)(v1.ae[v6] + (v7 << 8)));
                ++v6;
            }

            v6 = 0;
            v7 = 0;
            v10 = 0;
            v15 = 0;
            while(true) {
                v21 = v12;
                if(v6 >= 0x80) {
                    break;
                }

                if(v7 == 0) {
                    if(v10 < v3_1.length) {
                        v12_1 = 0;
                        v26 = v3_1[v10];
                        ++v10;
                        v7 = v26;
                    }
                    else {
                        v7 = -1;
                        v12_1 = 0;
                    }

                    v15 = v2.bx(v12_1);
                }

                v1.ae[v6] = ((short)(v1.ae[v6] + ((v15 - 1 & 2) << 14)));
                v1.ad[v6] = v15;
                --v7;
                ++v6;
                v12 = v21;
                v10 = v10;
            }

            v6 = 0;
            v7 = 0;
            v10 = 0;
            v12 = 0;
            while(v6 < 0x80) {
                if(v1.ad[v6] == 0) {
                    v24 = v5;
                }
                else {
                    if(v7 == 0) {
                        if(v10 < v5.length) {
                            v26 = v5[v10];
                            ++v10;
                            v7 = v26;
                        }
                        else {
                            v7 = -1;
                        }

                        v15 = v20 + 1;
                        v12 = v2.ae[v20] - 1;
                        v24 = v5;
                    }
                    else {
                        v24 = v5;
                        v15 = v20;
                    }

                    v1.aj[v6] = ((byte)v12);
                    --v7;
                    v20 = v15;
                    v10 = v10;
                }

                ++v6;
                v5 = v24;
            }

            int v5_1 = 0;
            v6 = 0;
            v7 = 0;
            v10 = 0;
            while(v5_1 < 0x80) {
                if(v1.ad[v5_1] == 0) {
                }
                else {
                    if(v6 == 0) {
                        if(v7 < v11.length) {
                            v26 = v11[v7];
                            ++v7;
                            v6 = v26;
                        }
                        else {
                            v6 = -1;
                        }

                        v10 = v2.ae[v21] + 16 << 2;
                        ++v21;
                    }

                    v1.an[v5_1] = ((byte)v10);
                    --v6;
                }

                ++v5_1;
            }

            v5_1 = 0;
            v6 = 0;
            v7 = 0;
            v10 = 0x80;
            kk v18 = null;
            while(v5_1 < v10) {
                if(v1.ad[v5_1] == 0) {
                }
                else {
                    if(v6 == 0) {
                        v18 = v0_2[v14_1[v7]];
                        if(v7 < v13.length) {
                            v26 = v13[v7];
                            ++v7;
                            v6 = v26;
                        }
                        else {
                            v6 = -1;
                        }
                    }

                    v1.ap[v5_1] = v18;
                    --v6;
                }

                ++v5_1;
                v10 = 0x80;
            }

            v5_1 = 0;
            v6 = 0;
            v7 = 0;
            v10 = 0;
            while(true) {
                byte v11_1 = -43;
                if(v5_1 >= 0x80) {
                    break;
                }

                if(v6 == 0) {
                    if(v7 < v3_1.length) {
                        v26 = v3_1[v7];
                        ++v7;
                        v6 = v26;
                    }
                    else {
                        v6 = -1;
                    }

                    if(v1.ad[v5_1] <= 0) {
                        goto label_375;
                    }

                    v10 = v2.ay(v11_1) + 1;
                }

            label_375:
                v1.ar[v5_1] = ((byte)v10);
                --v6;
                ++v5_1;
            }

            v1.ax = (v2.ay(-9) + 1) * -1940280775;
            for(v3 = 0; v3 < v4; ++v3) {
                v5_2 = v0_2[v3];
                if(v5_2.ax != null) {
                    for(v6 = 1; v6 < v5_2.ax.length; v6 += 2) {
                        v5_2.ax[v6] = v2.aw(-1215098345);
                    }
                }

                if(v5_2.al != null) {
                    for(v6 = 3; v6 < v5_2.al.length - 2; v6 += 2) {
                        v5_2.al[v6] = v2.aw(-1215098345);
                    }
                }
            }

            if(v8_1 != null) {
                for(v3 = 1; v3 < v8_1.length; v3 += 2) {
                    v8_1[v3] = v2.aw(-1215098345);
                }
            }

            if(v9_2 != null) {
                for(v3 = 1; v3 < v9_2.length; v3 += 2) {
                    v9_2[v3] = v2.aw(-1215098345);
                }
            }

            for(v3 = 0; v3 < v4; ++v3) {
                v5_2 = v0_2[v3];
                if(v5_2.al != null) {
                    v6 = 2;
                    v7 = 0;
                    while(v6 < v5_2.al.length) {
                        v7 = v7 + 1 + v2.ay(-59);
                        v5_2.al[v6] = ((byte)v7);
                        v6 += 2;
                    }
                }
            }

            for(v3 = 0; v3 < v4; ++v3) {
                v5_2 = v0_2[v3];
                if(v5_2.ax != null) {
                    v6 = 2;
                    v7 = 0;
                    while(v6 < v5_2.ax.length) {
                        v7 = v7 + 1 + v2.ay(-58);
                        v5_2.ax[v6] = ((byte)v7);
                        v6 += 2;
                    }
                }
            }

            if(v8_1 != null) {
                v3 = v2.ay(-110);
                v8_1[0] = ((byte)v3);
                v5_1 = v3;
                for(v3 = 2; v3 < v8_1.length; v3 += 2) {
                    v5_1 = v5_1 + 1 + v2.ay(-124);
                    v8_1[v3] = ((byte)v5_1);
                }

                v5_1 = v8_1[0];
                v6 = v8_1[1];
                for(v3 = 0; v3 < v5_1; ++v3) {
                    v1.ar[v3] = ((byte)(v1.ar[v3] * v6 + 0x20 >> 6));
                }

                v3 = 2;
                while(v3 < v8_1.length) {
                    v7 = v8_1[v3];
                    v10 = v8_1[v3 + 1];
                    v12 = v7 - v5_1;
                    v13_1 = v12 / 2 + v12 * v6;
                    while(v5_1 < v7) {
                        v1.ar[v5_1] = ((byte)(v1.ar[v5_1] * bt.ap(v13_1, v12, 2) + 0x20 >> 6));
                        v13_1 += v10 - v6;
                        ++v5_1;
                    }

                    v3 += 2;
                    v5_1 = v7;
                    v6 = v10;
                }

                while(v5_1 < 0x80) {
                    v1.ar[v5_1] = ((byte)(v1.ar[v5_1] * v6 + 0x20 >> 6));
                    ++v5_1;
                }
            }

            if(v9_2 != null) {
                v3 = v2.ay(-90);
                v9_2[0] = ((byte)v3);
                v5_1 = v3;
                for(v3 = 2; v3 < v9_2.length; v3 += 2) {
                    v5_1 = v5_1 + 1 + v2.ay(-43);
                    v9_2[v3] = ((byte)v5_1);
                }

                v12 = 0;
                v3 = v9_2[0];
                v6 = v9_2[1] << 1;
                for(v5_1 = 0; v5_1 < v3; ++v5_1) {
                    v7 = (v1.an[v5_1] & 0xFF) + v6;
                    if(v7 < 0) {
                        v7 = 0;
                    }

                    if(v7 > 0x80) {
                        v7 = 0x80;
                    }

                    v1.an[v5_1] = ((byte)v7);
                }

                v5_1 = v3;
                v3 = 2;
                while(v3 < v9_2.length) {
                    v7 = v9_2[v3];
                    v8 = v9_2[v3 + 1] << 1;
                    int v11_2 = v7 - v5_1;
                    v13_1 = v11_2 * v6 + v11_2 / 2;
                    while(v5_1 < v7) {
                        v10 = (v1.an[v5_1] & 0xFF) + bt.ap(v13_1, v11_2, 2);
                        if(v10 < 0) {
                            v10 = 0;
                        }

                        if(v10 > 0x80) {
                            v10 = 0x80;
                        }

                        v1.an[v5_1] = ((byte)v10);
                        v13_1 += v8 - v6;
                        ++v5_1;
                    }

                    v3 += 2;
                    v5_1 = v7;
                    v6 = v8;
                }

                v15 = 0x80;
                while(v5_1 < v15) {
                    v3 = (v1.an[v5_1] & 0xFF) + v6;
                    if(v3 < 0) {
                        v3 = 0;
                    }

                    if(v3 > v15) {
                        v3 = 0x80;
                    }

                    v1.an[v5_1] = ((byte)v3);
                    ++v5_1;
                }
            }
            else {
                v12 = 0;
            }

            for(v3 = 0; v3 < v4; ++v3) {
                v0_2[v3].ae = v2.ay(-69) * -1538601893;
            }

            for(v3 = 0; v3 < v4; ++v3) {
                v5_2 = v0_2[v3];
                if(v5_2.ax != null) {
                    v5_2.ar = v2.ay(-3) * 0x5E0D9E1F;
                }

                if(v5_2.al != null) {
                    v5_2.an = v2.ay(-86) * 0xE32DB1A3;
                }

                if(v5_2.ae * 0x960583D3 > 0) {
                    v5_2.ap = v2.ay(-49) * 0xA0B22391;
                }
            }

            for(v3 = 0; v3 < v4; ++v3) {
                v0_2[v3].ad = v2.ay(-34) * 0xDE591725;
            }

            for(v3 = 0; v3 < v4; ++v3) {
                v5_2 = v0_2[v3];
                if(v5_2.ad * 0x223D2CAD > 0) {
                    v5_2.aj = v2.ay(-11) * 0xDDA72015;
                }
            }

            while(true) {
            label_715:
                if(v12 >= v4) {
                    return;
                }

                kk v3_2 = v0_2[v12];
                if(v3_2.aj * 0x5003AF3D > 0) {
                    v3_2.aq = v2.ay(-100) * -1044158375;
                }

                break;
            }
        }
        catch(RuntimeException v0) {
            goto label_731;
        }

        ++v12;
        goto label_715;
        return;
    label_731:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("kt.<init>(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0), v2_1.toString());
    }

    void ab() {
        this.ad = null;
    }

    boolean ad(gq arg1, byte[] arg2, int[] arg3) {
        return 1;
    }

    void ae(int arg3) {
        int[] v3 = null;
        try {
            this.ad = v3;
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("kt.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    static int aj(ih arg3, ih arg4, int arg5, boolean arg6, int arg7) {
        arg7 = 1;
        int v0 = -1;
        if(1 != arg5) {
            goto label_18;
        }

        try {
            int v3_1 = arg3.av * 0x98D051C9;
            int v4 = arg4.av * 0x98D051C9;
            if(!arg6) {
                if(v0 == v3_1) {
                    v3_1 = 2001;
                }

                if(v4 != v0) {
                    goto label_14;
                }

                v4 = 2001;
            }

        label_14:
            return v3_1 - v4;
        label_18:
            if(arg5 == 2) {
                return arg3.am * -479634605 - arg4.am * -479634605;
            }

            int v2 = 0;
            if(arg5 == 3) {
                if(arg3.au.equals("-")) {
                    if(arg4.au.equals("-")) {
                        return 0;
                    }

                    if(arg6) {
                        arg7 = -1;
                    }

                    return arg7;
                }

                if(arg4.au.equals("-")) {
                    if(arg6) {
                    }
                    else {
                        arg7 = -1;
                    }

                    return arg7;
                }

                return arg3.au.compareTo(arg4.au);
            }

            if(4 == arg5) {
                if(arg3.av(-57)) {
                    if(arg4.av(-106)) {
                    }
                    else {
                        v2 = 1;
                    }
                }
                else if(arg4.av(-29)) {
                    v2 = -1;
                }

                return v2;
            }

            if(5 == arg5) {
                if(arg3.af(62)) {
                    if(arg4.af(0x3F)) {
                    }
                    else {
                        v2 = 1;
                    }
                }
                else if(arg4.af(-76)) {
                    v2 = -1;
                }

                return v2;
            }

            if(arg5 == 6) {
                if(arg3.ai(105)) {
                    if(arg4.ai(0x79)) {
                    }
                    else {
                        v2 = 1;
                    }
                }
                else if(arg4.ai(13)) {
                    v2 = -1;
                }

                return v2;
            }

            if(arg5 == 7) {
                if(arg3.ab(0x32522CB1)) {
                    if(arg4.ab(0x75793FFF)) {
                    }
                    else {
                        v2 = 1;
                    }
                }
                else if(arg4.ab(0x71305166)) {
                    v2 = -1;
                }

                return v2;
            }

            return arg3.af * 0xBBB22DD - arg4.af * 0xBBB22DD;
        label_17:
        }
        catch(RuntimeException v3) {
            goto label_17;
        }

        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("kt.aj(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
    }

    boolean aj(gq arg7, byte[] arg8, int[] arg9) {
        boolean v1 = true;
        hs v4 = null;
        int v0 = 0;
        int v3 = 0;
        while(v0 < 0x80) {
            if(arg8 == null || arg8[v0] != 0) {
                int v5 = this.ad[v0];
                if(v5 == 0) {
                }
                else {
                    if(v3 != v5) {
                        v3 = v5 - 1;
                        hs v3_1 = (v3 & 1) == 0 ? arg7.ae(v3 >> 2, arg9, 0xBD2C2DE9) : arg7.ar(v3 >> 2, arg9, 0x8ED067AB);
                        v4 = v3_1;
                        if(v4 != null) {
                            goto label_31;
                        }

                        v1 = false;
                    }
                    else {
                        v5 = v3;
                    }

                label_31:
                    if(v4 != null) {
                        this.al[v0] = v4;
                        this.ad[v0] = 0;
                    }

                    v3 = v5;
                }
            }

            ++v0;
        }

        return v1;
    }

    boolean al(gq arg6, byte[] arg7, int[] arg8, byte arg9) {
        int v4;
        boolean v0 = true;
        hs v3 = null;
        int v9 = 0;
        int v2 = 0;
        while(v9 < 0x80) {
            if(arg7 != null) {
                try {
                    if(arg7[v9] != 0) {
                    label_14:
                        v4 = this.ad[v9];
                        if(v4 == 0) {
                        }
                        else {
                            if(v2 != v4) {
                                v2 = v4 - 1;
                                hs v2_1 = (v2 & 1) == 0 ? arg6.ae(v2 >> 2, arg8, 0x93A4A16B) : arg6.ar(v2 >> 2, arg8, 0x8ED067AB);
                                v3 = v2_1;
                                if(v3 != null) {
                                    goto label_34;
                                }

                                v0 = false;
                            }
                            else {
                                v4 = v2;
                            }

                        label_34:
                            if(v3 != null) {
                                this.al[v9] = v3;
                                this.ad[v9] = 0;
                            }

                            goto label_39;
                        }
                    }
                }
                catch(RuntimeException v6) {
                    goto label_42;
                }
            }
            else {
                goto label_14;
            label_39:
                v2 = v4;
            }

            ++v9;
        }

        return v0;
    label_42:
        StringBuilder v7 = new StringBuilder();
        v7.append("kt.al(");
        v7.append(')');
        throw lx.al(((Throwable)v6), v7.toString());
    }

    boolean an(gq arg7, byte[] arg8, int[] arg9) {
        boolean v1 = true;
        hs v4 = null;
        int v0 = 0;
        int v3 = 0;
        while(v0 < 0x80) {
            if(arg8 == null || arg8[v0] != 0) {
                int v5 = this.ad[v0];
                if(v5 == 0) {
                }
                else {
                    if(v3 != v5) {
                        v3 = v5 - 1;
                        hs v3_1 = (v3 & 1) == 0 ? arg7.ae(v3 >> 2, arg9, 0xA90F92F2) : arg7.ar(v3 >> 2, arg9, 0x8ED067AB);
                        v4 = v3_1;
                        if(v4 != null) {
                            goto label_32;
                        }

                        v1 = false;
                    }
                    else {
                        v5 = v3;
                    }

                label_32:
                    if(v4 != null) {
                        this.al[v0] = v4;
                        this.ad[v0] = 0;
                    }

                    v3 = v5;
                }
            }

            ++v0;
        }

        return v1;
    }

    boolean ap(gq arg1, byte[] arg2, int[] arg3) {
        return 1;
    }

    void aq() {
        this.ad = null;
    }

    boolean ar(gq arg7, byte[] arg8, int[] arg9) {
        boolean v1 = true;
        hs v4 = null;
        int v0 = 0;
        int v3 = 0;
        while(v0 < 0x80) {
            if(arg8 == null || arg8[v0] != 0) {
                int v5 = this.ad[v0];
                if(v5 == 0) {
                }
                else {
                    if(v3 != v5) {
                        v3 = v5 - 1;
                        hs v3_1 = (v3 & 1) == 0 ? arg7.ae(v3 >> 2, arg9, 0xAF12C1BC) : arg7.ar(v3 >> 2, arg9, 0x8ED067AB);
                        v4 = v3_1;
                        if(v4 != null) {
                            goto label_31;
                        }

                        v1 = false;
                    }
                    else {
                        v5 = v3;
                    }

                label_31:
                    if(v4 != null) {
                        this.al[v0] = v4;
                        this.ad[v0] = 0;
                    }

                    v3 = v5;
                }
            }

            ++v0;
        }

        return v1;
    }
}

