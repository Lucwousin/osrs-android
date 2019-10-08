import java.net.URL;

public class ih {
    String aa;
    static int[] ad = null;
    static final int ae = 1;
    int af;
    int ai;
    static int aj = 0;
    static final int al = 2;
    int am;
    static int ap = 0;
    static int[] aq = null;
    static lq as = null;
    String au;
    int av;
    static final int ax = 3;
    int az;
    public static final int bq = 38;
    static ki dm;
    static od tn;

    static {
        ih.ad = new int[]{1, 1, 1, 1};
        ih.aq = new int[]{0, 1, 2, 3};
    }

    ih() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ih.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    boolean aa(byte arg3) {
        int v3 = 0x20000000;
        try {
            if((v3 & this.ai * 0xA45F5417) == 0) {
                return false;
            }
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ih.aa(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }

        boolean v3_2 = true;
        return v3_2;
    }

    boolean ab(int arg3) {
        boolean v3_1;
        arg3 = 0xA45F5417;
        try {
            int v0 = this.ai * arg3;
            v3_1 = true;
            if((v0 & 1) == 0) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ih.ab(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3), v0_1.toString());
        }

        return v3_1;
    }

    static void ac(int arg16, int arg17, int arg18, boolean arg19, int arg20, boolean arg21) {
        int v0 = arg16;
        int v7 = arg17;
        if(v0 < v7) {
            int v1 = (v7 + v0) / 2;
            ih v2 = ew.an[v1];
            ew.an[v1] = ew.an[v7];
            ew.an[v7] = v2;
            v1 = v0;
            int v15 = v1;
            while(v1 < v7) {
                if(cu.ap(ew.an[v1], v2, arg18, arg19, arg20, arg21, 0xF84DDF35) <= 0) {
                    ih v3 = ew.an[v1];
                    ew.an[v1] = ew.an[v15];
                    ew.an[v15] = v3;
                    ++v15;
                }

                ++v1;
            }

            ew.an[v7] = ew.an[v15];
            ew.an[v15] = v2;
            hp.an(arg16, v15 - 1, arg18, arg19, arg20, arg21, 2007443427);
            hp.an(v15 + 1, arg17, arg18, arg19, arg20, arg21, 0x6D06F7FD);
        }
    }

    boolean af(byte arg3) {
        int v3 = 0xA45F5417;
        try {
            if((this.ai * v3 & 2) == 0) {
                return false;
            }
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ih.af(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }

        boolean v3_2 = true;
        return v3_2;
    }

    static void ag(int arg11, int arg12) {
        int v0 = 4;
        int[] v1 = new int[v0];
        int[] v2 = new int[v0];
        int v3 = 0;
        v1[0] = arg11;
        v2[0] = arg12;
        int v4 = 1;
        while(v3 < v0) {
            if(arg11 != ih.aq[v3]) {
                v1[v4] = ih.aq[v3];
                v2[v4] = ih.ad[v3];
                ++v4;
            }

            ++v3;
        }

        ih.aq = v1;
        ih.ad = v2;
        df.ae(ew.an, 0, ew.an.length - 1, ih.aq, ih.ad, 0xB00B81ED);
    }

    static void ah(int arg11, int arg12) {
        int v0 = 4;
        int[] v1 = new int[v0];
        int[] v2 = new int[v0];
        int v3 = 0;
        v1[0] = arg11;
        v2[0] = arg12;
        int v4 = 1;
        while(v3 < v0) {
            if(arg11 != ih.aq[v3]) {
                v1[v4] = ih.aq[v3];
                v2[v4] = ih.ad[v3];
                ++v4;
            }

            ++v3;
        }

        ih.aq = v1;
        ih.ad = v2;
        df.ae(ew.an, 0, ew.an.length - 1, ih.aq, ih.ad, -2034681850);
    }

    boolean ai(byte arg3) {
        int v3 = 0xA45F5417;
        try {
            if((this.ai * v3 & 4) == 0) {
                return false;
            }
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ih.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }

        boolean v3_2 = true;
        return v3_2;
    }

    static void ak(int arg8, boolean arg9, int arg10, boolean arg11) {
        if(ew.an != null) {
            hp.an(0, ew.an.length - 1, arg8, arg9, arg10, arg11, 0x62A5E23F);
        }
    }

    static boolean am() {
        jn v1 = null;
        try {
            if(li.ab == null) {
                li.ab = ig.fe.an(new URL(fe.ai), 0x256CCCA);
                return 0;
            }

            if(!li.ab.al(0x7D0ECE04)) {
                return 0;
            }

            lq v3 = new lq(li.ab.ae(0xE4D30573));
            byte v2_1 = 75;
            v3.ac(v2_1);
            ih.ap = v3.ao(-597907852) * 0xF91EFDED;
            int v5 = 0x6DE6A9AD;
            ew.an = new ih[ih.ap * v5];
            int v4;
            for(v4 = 0; v4 < ih.ap * v5; ++v4) {
                ih[] v6 = ew.an;
                ih v7 = new ih();
                v6[v4] = v7;
                v7.af = v3.ao(0x30A36BE5) * 0x4697410E;
                v7.ai = v3.ac(v2_1) * 0x92D723A7;
                v7.aa = v3.bn(-57);
                v7.au = v3.bn(-26);
                v7.am = v3.ay(-4) * 0x2AE40300;
                v7.av = v3.as(0x5240640D) * 0x2D0B70AE;
                v7.az = 0xFE044ADB * v4;
            }

            df.ae(ew.an, 0, ew.an.length - 1, ih.aq, ih.ad, 0x8E9CF0A0);
            li.ab = v1;
            return 1;
        }
        catch(Exception v2) {
            v2.printStackTrace();
            li.ab = v1;
        }

        return 0;
    }

    static void ao(ih[] arg15, int arg16, int arg17, int[] arg18, int[] arg19) {
        int v9;
        int v13;
        int v10;
        int v1 = arg16;
        int v6 = arg17;
        if(v1 < v6) {
            int v0 = v1 - 1;
            int v4 = 2;
            int v3 = (v6 + v1) / v4;
            ih v5 = arg15[v3];
            arg15[v3] = arg15[v1];
            arg15[v1] = v5;
            int v7 = v6 + 1;
            while(v0 < v7) {
                int v2 = 1;
                while(true) {
                    v3 = -1;
                    v7 += v3;
                    v10 = v2;
                    v2 = 0;
                    while(true) {
                        int v12 = 0xD718A153;
                        v13 = 0x98D051C9;
                        int v11 = 3;
                        if(v2 < 4) {
                            if(v4 == arg18[v2]) {
                                v4 = arg15[v7].az * -1467904694;
                                v9 = v5.az * v12;
                            }
                            else if(arg18[v2] == 1) {
                                v4 = arg15[v7].av * v13;
                                v9 = v5.av * v13;
                                if(v4 == v3 && 1 == arg19[v2]) {
                                    v4 = -1373325550;
                                }

                                if(v3 != v9) {
                                    goto label_73;
                                }

                                if(arg19[v2] != 1) {
                                    goto label_73;
                                }

                                v9 = 2001;
                            }
                            else {
                                if(arg18[v2] == v11) {
                                    v4 = arg15[v7].ab(0x5875801E) ? 1 : 0;
                                    if(v5.ab(0x4AEC47E3)) {
                                        v9 = 1;
                                        goto label_73;
                                    }

                                    v9 = 0;
                                    goto label_73;
                                }

                                v4 = arg15[v7].af * -1445043765;
                                v9 = 0xBBB22DD * v5.af;
                            }

                        label_73:
                            if(v4 != v9) {
                                break;
                            }

                            if(v2 == v11) {
                                v10 = 0;
                            }

                            ++v2;
                            v4 = 2;
                            continue;
                        }
                        else {
                            goto label_89;
                        }
                    }

                    if(1 != arg19[v2] || v4 <= v9) {
                        if(arg19[v2] == 0 && v4 < v9) {
                            goto label_89;
                        }

                        v2 = 0;
                    }
                    else {
                    label_89:
                        v2 = v10;
                    }

                    if(v2 == 0) {
                        v2 = 1;
                        break;
                    }

                    v4 = 2;
                }

                do {
                    ++v0;
                    v9 = v2;
                    v2 = 0;
                    while(true) {
                        if(v2 < 4) {
                            if(arg18[v2] == 2) {
                                v4 = arg15[v0].az * 0xB306DEED;
                                v10 = v5.az * 0xD718A153;
                            }
                            else if(arg18[v2] == 1) {
                                v4 = arg15[v0].av * 0xF5C9F65F;
                                v10 = v5.av * v13;
                                if(v4 == v3 && arg19[v2] == 1) {
                                    v4 = 0x95284F04;
                                }

                                if(v10 != v3) {
                                    goto label_145;
                                }

                                if(arg19[v2] != 1) {
                                    goto label_145;
                                }

                                v10 = 2001;
                            }
                            else {
                                if(v11 == arg18[v2]) {
                                    boolean v4_1 = arg15[v0].ab(0xF4283D46);
                                    if(v5.ab(0x466E5180)) {
                                        v10 = 1;
                                        goto label_145;
                                    }

                                    v10 = 0;
                                    goto label_145;
                                }

                                v4 = 0xAE3CB6AF * arg15[v0].af;
                                v10 = v5.af * -647593000;
                            }

                        label_145:
                            if(v4 != v10) {
                                break;
                            }

                            if(v2 == v11) {
                                v9 = 0;
                            }

                            ++v2;
                            continue;
                        }
                        else {
                            goto label_161;
                        }
                    }

                    if(arg19[v2] != 1 || v4 >= v10) {
                        if(arg19[v2] == 0 && v4 > v10) {
                            goto label_161;
                        }

                        v2 = 0;
                    }
                    else {
                    label_161:
                        v2 = v9;
                    }
                }
                while(v2 != 0);

                if(v0 < v7) {
                    ih v2_1 = arg15[v0];
                    arg15[v0] = arg15[v7];
                    arg15[v7] = v2_1;
                }

                v4 = 2;
            }

            df.ae(arg15, arg16, v7, arg18, arg19, 0xB228F49B);
            df.ae(arg15, v7 + 1, arg17, arg18, arg19, -1669957400);
        }
    }

    static void as(int arg8, boolean arg9, int arg10, boolean arg11) {
        if(ew.an != null) {
            hp.an(0, ew.an.length - 1, arg8, arg9, arg10, arg11, 0x5D359AE3);
        }
    }

    static void at(int arg11, int arg12) {
        int v0 = 4;
        int[] v1 = new int[v0];
        int[] v2 = new int[v0];
        int v3 = 0;
        v1[0] = arg11;
        v2[0] = arg12;
        int v4 = 1;
        while(v3 < v0) {
            if(arg11 != ih.aq[v3]) {
                v1[v4] = ih.aq[v3];
                v2[v4] = ih.ad[v3];
                ++v4;
            }

            ++v3;
        }

        ih.aq = v1;
        ih.ad = v2;
        df.ae(ew.an, 0, ew.an.length - 1, ih.aq, ih.ad, 0xA4F5094D);
    }

    boolean au(byte arg3) {
        int v3 = 0x2000000;
        try {
            if((v3 & this.ai * 0xA45F5417) == 0) {
                return false;
            }
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ih.au(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }

        boolean v3_2 = true;
        return v3_2;
    }

    boolean av(byte arg3) {
        try {
            if((this.ai * 0xA45F5417 & 8) == 0) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ih.av(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    static void aw(ih[] arg16, int arg17, int arg18, int[] arg19, int[] arg20) {
        int v11;
        int v12;
        int v15;
        int v14;
        int v13;
        int v10;
        int v1 = arg17;
        int v6 = arg18;
        if(v1 < v6) {
            int v0 = v1 - 1;
            int v4 = 2;
            int v3 = (v6 + v1) / v4;
            ih v5 = arg16[v3];
            arg16[v3] = arg16[v1];
            arg16[v1] = v5;
            int v7 = v6 + 1;
            while(v0 < v7) {
                int v2 = 1;
                while(true) {
                    v3 = -1;
                    v7 += v3;
                    v10 = v2;
                    v2 = 0;
                    while(true) {
                        v13 = 0xBBB22DD;
                        v14 = 0x98D051C9;
                        int v9 = 3;
                        v15 = 0xD718A153;
                        if(v2 < 4) {
                            if(v4 == arg19[v2]) {
                                v12 = arg16[v7].az * v15;
                                v4 = v5.az * v15;
                            }
                            else if(arg19[v2] == 1) {
                                v12 = arg16[v7].av * v14;
                                v4 = v5.av * v14;
                                if(v12 == v3 && 1 == arg20[v2]) {
                                    v12 = 2001;
                                }

                                if(v3 != v4) {
                                    goto label_67;
                                }

                                if(arg20[v2] != 1) {
                                    goto label_67;
                                }

                                v4 = 2001;
                            }
                            else {
                                if(arg19[v2] == v9) {
                                    v12 = arg16[v7].ab(0x14740786) ? 1 : 0;
                                    boolean v4_1 = v5.ab(0x43BB4EB3);
                                    goto label_67;
                                }

                                v12 = arg16[v7].af * v13;
                                v4 = v5.af * v13;
                            }

                        label_67:
                            if(v12 != (((int)v4_1))) {
                                break;
                            }

                            if(v2 == v9) {
                                v10 = 0;
                            }

                            ++v2;
                            v4 = 2;
                            continue;
                        }
                        else {
                            goto label_83;
                        }
                    }

                    if(1 != arg20[v2] || v12 <= (((int)v4_1))) {
                        if(arg20[v2] == 0 && v12 < (((int)v4_1))) {
                            goto label_83;
                        }

                        v2 = 0;
                    }
                    else {
                    label_83:
                        v2 = v10;
                    }

                    if(v2 == 0) {
                        v2 = 1;
                        break;
                    }

                    v4 = 2;
                }

                do {
                    ++v0;
                    v4 = v2;
                    v2 = 0;
                    while(true) {
                        if(v2 < 4) {
                            if(arg19[v2] == 2) {
                                v11 = arg16[v0].az * v15;
                                v12 = v5.az * v15;
                            }
                            else if(arg19[v2] == 1) {
                                v10 = arg16[v0].av * v14;
                                v11 = v5.av * v14;
                                if(v10 == v3 && arg20[v2] == 1) {
                                    v10 = 2001;
                                }

                                if(v11 == v3 && arg20[v2] == 1) {
                                    v11 = v10;
                                    v12 = 2001;
                                    goto label_142;
                                }

                                v12 = v11;
                                v11 = v10;
                            }
                            else {
                                if(v9 == arg19[v2]) {
                                    v11 = arg16[v0].ab(609521975) ? 1 : 0;
                                    if(v5.ab(-202548105)) {
                                        v12 = 1;
                                        goto label_142;
                                    }

                                    v12 = 0;
                                    goto label_142;
                                }

                                v11 = arg16[v0].af * v13;
                                v12 = v5.af * v13;
                            }

                        label_142:
                            if(v11 != v12) {
                                break;
                            }

                            if(v2 == v9) {
                                v4 = 0;
                            }

                            ++v2;
                            continue;
                        }
                        else {
                            goto label_157;
                        }
                    }

                    if(arg20[v2] != 1 || v11 >= v12) {
                        if(arg20[v2] == 0 && v11 > v12) {
                            goto label_157;
                        }

                        v2 = 0;
                    }
                    else {
                    label_157:
                        v2 = v4;
                    }
                }
                while(v2 != 0);

                if(v0 < v7) {
                    ih v2_1 = arg16[v0];
                    arg16[v0] = arg16[v7];
                    arg16[v7] = v2_1;
                }

                v4 = 2;
            }

            df.ae(arg16, arg17, v7, arg19, arg20, 0x901C2BCA);
            df.ae(arg16, v7 + 1, arg18, arg19, arg20, 0x95E94E5D);
        }
    }

    static void ay(ih[] arg17, int arg18, int arg19, int[] arg20, int[] arg21) {
        int v12;
        int v13;
        int v11;
        int v10;
        int v1 = arg18;
        int v6 = arg19;
        if(v1 < v6) {
            int v0 = v1 - 1;
            int v4 = 2;
            int v3 = (v6 + v1) / v4;
            ih v5 = arg17[v3];
            arg17[v3] = arg17[v1];
            arg17[v1] = v5;
            int v7 = v6 + 1;
            while(v0 < v7) {
                int v2 = 1;
                while(true) {
                    v3 = -1;
                    v7 += v3;
                    v10 = v2;
                    v2 = 0;
                    while(true) {
                        v11 = 0x98D051C9;
                        v13 = 0xBBB22DD;
                        int v9 = 3;
                        if(v2 < 4) {
                            if(v4 == arg20[v2]) {
                                v4 = arg17[v7].az * 0xB780C4A9;
                                v12 = v5.az * -1488042938;
                            }
                            else if(arg20[v2] == 1) {
                                v4 = arg17[v7].av * v11;
                                v12 = v5.av * 0x3FF7802E;
                                if(v4 == v3 && 1 == arg21[v2]) {
                                    v4 = 0xB6FDF53F;
                                }

                                if(v3 != v12) {
                                    goto label_65;
                                }

                                if(arg21[v2] != 1) {
                                    goto label_65;
                                }

                                v12 = 0x95FFC521;
                            }
                            else {
                                if(arg20[v2] == v9) {
                                    boolean v4_1 = arg17[v7].ab(0x38DE0B44);
                                    boolean v12_1 = v5.ab(0xF2854210);
                                    goto label_65;
                                }

                                v4 = arg17[v7].af * v13;
                                v12 = v5.af * v13;
                            }

                        label_65:
                            if((((int)v4_1)) != (((int)v12_1))) {
                                break;
                            }

                            if(v2 == v9) {
                                v10 = 0;
                            }

                            ++v2;
                            v4 = 2;
                            continue;
                        }
                        else {
                            goto label_81;
                        }
                    }

                    if(1 != arg21[v2] || (((int)v4_1)) <= (((int)v12_1))) {
                        if(arg21[v2] == 0 && (((int)v4_1)) < (((int)v12_1))) {
                            goto label_81;
                        }

                        v2 = 0;
                    }
                    else {
                    label_81:
                        v2 = v10;
                    }

                    if(v2 == 0) {
                        v2 = 1;
                        break;
                    }

                    v4 = 2;
                }

                do {
                    ++v0;
                    v4 = v2;
                    v2 = 0;
                    while(true) {
                        if(v2 < 4) {
                            if(arg20[v2] == 2) {
                                v11 = arg17[v0].az * 0xD718A153;
                                v10 = v5.az * 0xD718A153;
                            }
                            else if(arg20[v2] == 1) {
                                v10 = arg17[v0].av * 0x98D051C9;
                                v11 = v5.av * 2089924729;
                                if(v10 == v3 && arg21[v2] == 1) {
                                    v10 = 823018590;
                                }

                                if(v11 == v3 && arg21[v2] == 1) {
                                    v11 = v10;
                                    v10 = 2001;
                                    goto label_141;
                                }

                                int v16 = v11;
                                v11 = v10;
                                v10 = v16;
                            }
                            else {
                                if(v9 == arg20[v2]) {
                                    boolean v11_1 = arg17[v0].ab(0x2CF82096);
                                    if(v5.ab(0x59C8B304)) {
                                        v10 = 1;
                                        goto label_141;
                                    }

                                    v10 = 0;
                                    goto label_141;
                                }

                                v11 = arg17[v0].af * 0xB79F8199;
                                v10 = v5.af * v13;
                            }

                        label_141:
                            if(v11 != v10) {
                                break;
                            }

                            if(v2 == v9) {
                                v4 = 0;
                            }

                            ++v2;
                            continue;
                        }
                        else {
                            goto label_156;
                        }
                    }

                    if(arg21[v2] != 1 || v11 >= v10) {
                        if(arg21[v2] == 0 && v11 > v10) {
                            goto label_156;
                        }

                        v2 = 0;
                    }
                    else {
                    label_156:
                        v2 = v4;
                    }
                }
                while(v2 != 0);

                if(v0 < v7) {
                    ih v2_1 = arg17[v0];
                    arg17[v0] = arg17[v7];
                    arg17[v7] = v2_1;
                }

                v4 = 2;
            }

            df.ae(arg17, arg18, v7, arg20, arg21, -1892190057);
            df.ae(arg17, v7 + 1, arg19, arg20, arg21, 0x89AE2F2A);
        }
    }

    static boolean az() {
        jn v1 = null;
        try {
            if(li.ab == null) {
                li.ab = ig.fe.an(new URL(fe.ai), 0x30D015DA);
                return 0;
            }

            if(!li.ab.al(0x72F92037)) {
                return 0;
            }

            lq v3 = new lq(li.ab.ae(0xE4D30573));
            v3.ac(76);
            ih.ap = v3.ao(0x9372D223) * 1555210789;
            ew.an = new ih[ih.ap * 0xD656F8EF];
            int v2_1;
            for(v2_1 = 0; v2_1 < ih.ap * 0x4AA350D5; ++v2_1) {
                ih[] v4 = ew.an;
                ih v5 = new ih();
                v4[v2_1] = v5;
                v5.af = v3.ao(624352026) * 0x7136FECD;
                v5.ai = v3.ac(22) * 0x92D723A7;
                v5.aa = v3.bn(-93);
                v5.au = v3.bn(3);
                v5.am = v3.ay(-18) * 0x8C605573;
                v5.av = v3.as(0x6CEB229C) * 0xAAC7B7BB;
                v5.az = -1283305865 * v2_1;
            }

            df.ae(ew.an, 0, ew.an.length - 1, ih.aq, ih.ad, 0x8019E1AE);
            li.ab = v1;
            return 1;
        }
        catch(Exception v2) {
            v2.printStackTrace();
            li.ab = v1;
        }

        return 0;
    }

    static int ba(ih arg1, ih arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int v0 = -2085731260;
        arg3 = kt.aj(arg1, arg2, arg3, arg4, v0);
        if(arg3 != 0) {
            if(arg4) {
                return -arg3;
            }

            return arg3;
        }

        if(-1 == arg5) {
            return 0;
        }

        int v1 = kt.aj(arg1, arg2, arg5, arg6, v0);
        if(arg6) {
            return -v1;
        }

        return v1;
    }

    boolean bb() {
        boolean v0 = (this.ai * 0x8D4BA3F7 & 8) != 0 ? true : false;
        return v0;
    }

    boolean bc() {
        boolean v0 = (this.ai * 0xA45F5417 & 0x20000000) != 0 ? true : false;
        return v0;
    }

    static void bd(int arg16, int arg17, int arg18, boolean arg19, int arg20, boolean arg21) {
        int v0 = arg16;
        int v7 = arg17;
        if(v0 < v7) {
            int v1 = (v7 + v0) / 2;
            ih v2 = ew.an[v1];
            ew.an[v1] = ew.an[v7];
            ew.an[v7] = v2;
            v1 = v0;
            int v15 = v1;
            while(v1 < v7) {
                if(cu.ap(ew.an[v1], v2, arg18, arg19, arg20, arg21, 240391104) <= 0) {
                    ih v3 = ew.an[v1];
                    ew.an[v1] = ew.an[v15];
                    ew.an[v15] = v3;
                    ++v15;
                }

                ++v1;
            }

            ew.an[v7] = ew.an[v15];
            ew.an[v15] = v2;
            hp.an(arg16, v15 - 1, arg18, arg19, arg20, arg21, 0x5C2D8061);
            hp.an(v15 + 1, arg17, arg18, arg19, arg20, arg21, 2016561768);
        }
    }

    static int bf(ih arg1, ih arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        int v0 = -2085731260;
        arg3 = kt.aj(arg1, arg2, arg3, arg4, v0);
        if(arg3 != 0) {
            if(arg4) {
                return -arg3;
            }

            return arg3;
        }

        if(-1 == arg5) {
            return 0;
        }

        int v1 = kt.aj(arg1, arg2, arg5, arg6, v0);
        if(arg6) {
            return -v1;
        }

        return v1;
    }

    boolean bg() {
        boolean v0 = (this.ai * 0xA45F5417 & 4) != 0 ? true : false;
        return v0;
    }

    boolean bh() {
        boolean v0 = (this.ai * 0xA45F5417 & 8) != 0 ? true : false;
        return v0;
    }

    boolean bj() {
        boolean v0 = (this.ai * -788079200 & 0x693F246B) != 0 ? true : false;
        return v0;
    }

    boolean bk() {
        boolean v0 = (this.ai * 0x9280EB83 & -874120210) != 0 ? true : false;
        return v0;
    }

    boolean bm() {
        boolean v0 = (this.ai * 0xA45F5417 & 0x2000000) != 0 ? true : false;
        return v0;
    }

    static int bn(ih arg4, ih arg5, int arg6, boolean arg7) {
        int v0 = 1;
        int v1 = -1;
        if(1 == arg6) {
            int v4 = arg4.av * -640842938;
            int v5 = arg5.av * 0x98D051C9;
            if(!arg7) {
                if(v1 == v4) {
                    v4 = 2049948806;
                }

                if(v5 != v1) {
                    goto label_14;
                }

                v5 = 0xDDEF0B4D;
            }

        label_14:
            return v4 - v5;
        }

        if(arg6 == 2) {
            return arg4.am * 0x5AA4903 - arg5.am * -479634605;
        }

        int v3 = 0;
        if(arg6 == 3) {
            if(arg4.au.equals("-")) {
                if(arg5.au.equals("-")) {
                    return 0;
                }

                if(arg7) {
                    v0 = -1;
                }

                return v0;
            }

            if(arg5.au.equals("-")) {
                if(arg7) {
                }
                else {
                    v0 = -1;
                }

                return v0;
            }

            return arg4.au.compareTo(arg5.au);
        }

        if(4 == arg6) {
            if(arg4.av(-82)) {
                if(arg5.av(-9)) {
                }
                else {
                    v3 = 1;
                }
            }
            else if(arg5.av(-65)) {
                v3 = -1;
            }

            return v3;
        }

        if(5 == arg6) {
            if(arg4.af(-34)) {
                if(arg5.af(-95)) {
                }
                else {
                    v3 = 1;
                }
            }
            else if(arg5.af(-32)) {
                v3 = -1;
            }

            return v3;
        }

        if(arg6 == 6) {
            if(arg4.ai(42)) {
                if(arg5.ai(99)) {
                }
                else {
                    v3 = 1;
                }
            }
            else if(arg5.ai(0x7E)) {
                v3 = -1;
            }

            return v3;
        }

        if(arg6 == 7) {
            if(arg4.ab(596104069)) {
                if(arg5.ab(0x7515368B)) {
                }
                else {
                    v3 = 1;
                }
            }
            else if(arg5.ab(0x2D39D649)) {
                v3 = -1;
            }

            return v3;
        }

        return arg4.af * 0xC89AAE1E - arg5.af * 0xA57BEF60;
    }

    boolean bo() {
        boolean v1 = true;
        if((this.ai * 0x6CD26C0E & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    static ih bp() {
        ih.aj = 0;
        return ev.aq(101);
    }

    boolean bq() {
        boolean v0 = (this.ai * 0xA45F5417 & 2) != 0 ? true : false;
        return v0;
    }

    boolean bt() {
        boolean v1 = true;
        if((this.ai * 0xA45F5417 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    boolean bv() {
        boolean v0 = (this.ai * 0xA45F5417 & 2) != 0 ? true : false;
        return v0;
    }

    boolean bw() {
        boolean v1 = true;
        if((this.ai * 0xE5E63198 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    boolean bx() {
        boolean v0 = (this.ai * 0xA45F5417 & 2) != 0 ? true : false;
        return v0;
    }

    boolean by() {
        boolean v1 = true;
        if((this.ai * 0xA45F5417 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    boolean bz() {
        boolean v0 = (this.ai * 0xA45F5417 & 8) != 0 ? true : false;
        return v0;
    }
}

