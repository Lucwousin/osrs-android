import com.jagex.oldscape.osrenderer.ax;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class be extends bi {
    int[] ae;
    int[] al;
    int an;
    List ap;
    int[] ax;
    static final int ez = 8;
    static int ma;

    be(bd arg3) {
        try {
            super(((bt)arg3));
            this.ax = new int[4700];
            this.al = new int[4700];
            this.ae = new int[4700];
            this.ap = new LinkedList();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("be.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void aa(ca arg36, int arg37) {
        ca v0 = arg36;
        try {
            ax.bt(v0.bp, v0.bw, v0.by, v0.an, v0.aq, v0.ay, v0.ap, v0.aj, v0.ad, v0.ab, v0.af, v0.ai, v0.av, v0.aa, v0.au, v0.aw, v0.ao, v0.as, v0.az, v0.ah, v0.ag, v0.am, v0.bd, v0.ba, -2);
            v0.bw = false;
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1 = new StringBuilder();
            v1.append("be.aa(");
            v1.append(')');
            throw lx.al(((Throwable)v0_1), v1.toString());
        }
    }

    public final void ab(ca arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v18;
        be v0 = this;
        ca v1 = arg24;
        int v8 = 0;
        v0.ao[0] = -1;
        if(v1.bt != 2 && v1.bt != 1) {
            arg24.aj();
        }

        int v9 = v0.bo.bw * -71202015;
        int v10 = v0.bo.bo * 0xE36810;
        int v7 = be.aj[arg25];
        int v11 = be.ad[arg25];
        int v12 = be.aj[arg26];
        int v13 = be.ad[arg26];
        int v14 = be.aj[arg27];
        int v15 = be.ad[arg27];
        int v16 = be.aj[arg28];
        int v5 = be.ad[arg28];
        int v17 = v16 * arg30 + arg31 * v5 >> 16;
        int v19 = v10;
        while(v8 < v1.an) {
            v10 = v1.ap[v8];
            int v20 = v9;
            v9 = v1.aj[v8];
            int v6 = v1.ad[v8];
            if(arg27 != 0) {
                v18 = v10 * v15 + v9 * v14 >> 16;
                v9 = v9 * v15 - v10 * v14 >> 16;
                v10 = v18;
            }

            if(arg25 != 0) {
                v18 = v9 * v11 - v7 * v6 >> 16;
                v6 = v6 * v11 + v9 * v7 >> 16;
                v9 = v18;
            }

            if(arg26 != 0) {
                v18 = v6 * v12 + v10 * v13 >> 16;
                v6 = v6 * v13 - v10 * v12 >> 16;
                v10 = v18;
            }

            v10 += arg29;
            v9 += arg30;
            v18 = v6 + arg31;
            int v21 = v5 * v9 - v16 * v18 >> 16;
            v9 = v9 * v16 + v18 * v5 >> 16;
            v0.ag[v8] = v9 - v17;
            v0.am[v8] = v20 + v0.bo.bp * 574766503 * v10 / arg32;
            v0.az[v8] = v19 + v0.bo.bp * 574766503 * v21 / arg32;
            if(v1.ay > 0) {
                v0.ah[v8] = v10;
                v0.at[v8] = v21;
                v0.ay[v8] = v9;
            }

            ++v8;
            v9 = v20;
        }

        be v25 = this;
        ca v26 = arg24;
        long v29 = 0;
        try {
            v25.ai(v26, false, false, v29);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    final boolean ac(ca arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29) {
        int v16;
        int v8;
        be v0 = this;
        ca v1 = arg21;
        if(v1.bx >= 0xE0D59732) {
            return 0;
        }

        int v7 = v0.bo.bw * 1126407459;
        int v10 = v0.bo.bo * 0xF7F729AF;
        int v9 = be.aj[arg22];
        int v11 = be.ad[arg22];
        int v12;
        for(v12 = 0; true; ++v12) {
            int v14 = -1;
            if(v12 >= v1.an) {
                break;
            }

            int v13 = v1.ap[v12];
            int v15 = v1.aj[v12];
            v8 = v1.ad[v12];
            if(arg22 != 0) {
                v16 = v8 * v9 + v13 * v11 >> 16;
                v8 = v8 * v11 - v13 * v9 >> 16;
                v13 = v16;
            }

            v13 += arg27;
            v15 += arg28;
            v16 = v8 + arg29;
            int v18 = arg25 * v16 + v13 * arg26 >> 16;
            v13 = v16 * arg26 - v13 * arg25 >> 16;
            v16 = arg24 * v15 - v13 * arg23 >> 16;
            v13 = v15 * arg23 + v13 * arg24 >> 16;
            if(v13 >= 0x8DE55999) {
                v0.am[v12] = v0.bo.bp * 574766503 * v18 / v13 + v7;
                v0.az[v12] = v16 * (v0.bo.bp * 0x2899EC66) / v13 + v10;
            }
            else {
                int[] v2 = v0.am;
                v0.az[v12] = v14;
                v2[v12] = v14;
            }
        }

        int v2_1;
        for(v2_1 = 0; v2_1 < v1.aq; ++v2_1) {
            if(v1.au[v2_1] == 0x113ECD86) {
            }
            else {
                int v3 = v1.ab[v2_1];
                int v4 = v1.af[v2_1];
                int v5 = v1.ai[v2_1];
                int v6 = v0.am[v3];
                v7 = v0.am[v4];
                v8 = v0.am[v5];
                if(v6 != v14 && v7 != v14) {
                    if(v14 == v8) {
                    }
                    else if(ah.ao(v0.az[v3], v0.az[v4], v0.az[v5], v6, v7, v8, 5, 0x6FD5490)) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    public final void ad(ca arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30) {
        int v17;
        be v0 = this;
        ca v1 = arg23;
        int v7 = 0;
        v0.ao[0] = -1;
        if(2 != v1.bt && v1.bt != 1) {
            arg23.aj();
        }

        int v8 = v0.bo.bw * 1126407459;
        int v6 = v0.bo.bo * 0xF7F729AF;
        int v9 = be.aj[arg24];
        int v10 = be.ad[arg24];
        int v11 = be.aj[arg25];
        int v12 = be.ad[arg25];
        int v13 = be.aj[arg26];
        int v14 = be.ad[arg26];
        int v15 = be.aj[arg27];
        int v5 = be.ad[arg27];
        int v16 = v15 * arg29 + v5 * arg30 >> 16;
        int v18 = v6;
        while(v7 < v1.an) {
            v6 = v1.ap[v7];
            int v19 = v8;
            v8 = v1.aj[v7];
            int v0_1 = v1.ad[v7];
            if(arg26 != 0) {
                v17 = v8 * v13 + v14 * v6 >> 16;
                v8 = v8 * v14 - v6 * v13 >> 16;
                v6 = v17;
            }

            if(arg24 != 0) {
                v17 = v10 * v8 - v9 * v0_1 >> 16;
                v0_1 = v0_1 * v10 + v8 * v9 >> 16;
                v8 = v17;
            }

            if(arg25 != 0) {
                v17 = v12 * v6 + v11 * v0_1 >> 16;
                v0_1 = v0_1 * v12 - v6 * v11 >> 16;
                v6 = v17;
            }

            v6 += arg28;
            v8 += arg29;
            v17 = v0_1 + arg30;
            int v20 = v8 * v5 - v15 * v17 >> 16;
            v8 = v17 * v5 + v8 * v15 >> 16;
            v0 = this;
            v0.ag[v7] = v8 - v16;
            ((be)v0_1).am[v7] = ((be)v0_1).bo.bp * -2098046167 * v6 / v8 + v19;
            ((be)v0_1).az[v7] = v18 + ((be)v0_1).bo.bp * 0x97EB82A3 * v20 / v8;
            if(v1.ay > 0) {
                v0.ah[v7] = v6;
                v0.at[v7] = v20;
                v0.ay[v7] = v8;
            }

            ++v7;
            v8 = v19;
        }

        be v24 = this;
        ca v25 = arg23;
        long v28 = 0;
        try {
            v24.ai(v25, false, false, v28);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    public void ae(bm arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, long arg40) {
        be v12 = this;
        int v0 = arg32;
        try {
            if(!be.by) {
                return;
            }

            System.nanoTime();
            ca v14 = arg31.as();
            if(v14 == null) {
                return;
            }

            if(1 != v14.bt) {
                v14.ap();
            }

            v14.an(v0);
            int v1 = v14.bq * arg34 >> 16;
            int v3 = v14.bq * arg33 >> 16;
            int v4 = arg39 * arg36 - arg35 * arg37 >> 16;
            int v15 = v4 * arg34 + arg38 * arg33 >> 16;
            int v5 = v15 + v1;
            int v6 = 50;
            if(v5 > v6) {
                if(v15 >= 3500) {
                }
                else {
                    int v7 = arg39 * arg35 + arg37 * arg36 >> 16;
                    int v10 = 574766503;
                    int v8 = (v7 - v14.bq) * (v12.bo.bp * v10);
                    if(v8 / v5 >= v12.bo.bq * 0x36E3B7F) {
                        return;
                    }
                    else {
                        int v9 = v12.bo.bp * v10 * (v14.bq + v7);
                        if(v9 / v5 <= v12.bo.bv * 0x4B37418D) {
                            return;
                        }
                        else {
                            v4 = arg38 * arg34 - v4 * arg33 >> 16;
                            int v11 = (v4 + v3) * (v12.bo.bp * v10);
                            if(v11 / v5 <= v12.bo.bx * 0xB31C2AE1) {
                                return;
                            }
                            else {
                                int v2 = v12.bo.bp * v10 * (v4 - (v3 + (v14.bh * 0xCD6CEDE3 * arg34 >> 16)));
                                if(v2 / v5 >= v12.bo.bg * 0x560C1795) {
                                    return;
                                }
                                else {
                                    v3 = jb.ah(107);
                                    v10 = eu.at(101);
                                    boolean v13 = bf.az(4);
                                    if((aq.ae(arg40)) && (v13)) {
                                        v13 = false;
                                        if(bc.ax) {
                                            v13 = ew.aw(v14, arg37, arg38, arg39, this, -39);
                                        }
                                        else {
                                            v1 = v15 - v1;
                                            if(v1 <= v6) {
                                            }
                                            else {
                                                v6 = v1;
                                            }

                                            if(v7 > 0) {
                                                v8 /= v5;
                                                v9 /= v6;
                                            }
                                            else {
                                                v9 /= v5;
                                                v8 /= v6;
                                            }

                                            if(v4 > 0) {
                                                v2 /= v5;
                                                v11 /= v6;
                                            }
                                            else {
                                                v11 /= v5;
                                                v2 /= v6;
                                            }

                                            v3 -= v12.bo.bw * 1126407459;
                                            v10 -= v12.bo.bo * 0xF7F729AF;
                                            if(v3 <= v8) {
                                                goto label_151;
                                            }

                                            if(v3 >= v9) {
                                                goto label_151;
                                            }

                                            if(v10 <= v2) {
                                                goto label_151;
                                            }

                                            if(v10 >= v11) {
                                                goto label_151;
                                            }

                                            v13 = true;
                                        }

                                    label_151:
                                        if(!v13) {
                                            goto label_168;
                                        }

                                        if(!v14.bf && !this.ap(v14, arg32, arg33, arg34, arg35, arg36, arg37, arg38, arg39, 0xBC52EE74)) {
                                            goto label_168;
                                        }

                                        lt.am(arg40);
                                    }

                                label_168:
                                    int v22 = be.aj[v0];
                                    int v23 = be.ad[v0];
                                    if(v14.bx >= 1600) {
                                        return;
                                    }

                                    if(v14.bw) {
                                        v12.aa(v14, 0x2775E90);
                                    }

                                    ca v2_1 = v14;
                                    ax.bx(v14.bp, arg40, v14.bx, v14.bg, arg33, arg34, arg35, arg36, v22, v23, arg37, arg38, arg39, v15, false, 2028766929);
                                    if(!v2_1.by) {
                                        if(-1 == v2_1.bo) {
                                            v12.ap.add(v2_1);
                                        }

                                        v2_1.bo = v12.an * 0x305E9263;
                                    }

                                    System.nanoTime();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("be.ae(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }

    public final void af(ca arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v18;
        be v0 = this;
        ca v1 = arg24;
        int v8 = 0;
        v0.ao[0] = -1;
        if(v1.bt != 2 && v1.bt != 1) {
            arg24.aj();
        }

        int v9 = v0.bo.bw * 0x8669CBFF;
        int v10 = v0.bo.bo * 0xF7F729AF;
        int v7 = be.aj[arg25];
        int v11 = be.ad[arg25];
        int v12 = be.aj[arg26];
        int v13 = be.ad[arg26];
        int v14 = be.aj[arg27];
        int v15 = be.ad[arg27];
        int v16 = be.aj[arg28];
        int v5 = be.ad[arg28];
        int v17 = v16 * arg30 + arg31 * v5 >> 16;
        int v19 = v10;
        while(v8 < v1.an) {
            v10 = v1.ap[v8];
            int v20 = v9;
            v9 = v1.aj[v8];
            int v6 = v1.ad[v8];
            if(arg27 != 0) {
                v18 = v10 * v15 + v9 * v14 >> 16;
                v9 = v9 * v15 - v10 * v14 >> 16;
                v10 = v18;
            }

            if(arg25 != 0) {
                v18 = v9 * v11 - v7 * v6 >> 16;
                v6 = v6 * v11 + v9 * v7 >> 16;
                v9 = v18;
            }

            if(arg26 != 0) {
                v18 = v6 * v12 + v10 * v13 >> 16;
                v6 = v6 * v13 - v10 * v12 >> 16;
                v10 = v18;
            }

            v10 += arg29;
            v9 += arg30;
            v18 = v6 + arg31;
            int v21 = v5 * v9 - v16 * v18 >> 16;
            v9 = v9 * v16 + v18 * v5 >> 16;
            v0.ag[v8] = v9 - v17;
            v0.am[v8] = v20 + v0.bo.bp * 574766503 * v10 / arg32;
            v0.az[v8] = v19 + v0.bo.bp * 0x575D6458 * v21 / arg32;
            if(v1.ay > 0) {
                v0.ah[v8] = v10;
                v0.at[v8] = v21;
                v0.ay[v8] = v9;
            }

            ++v8;
            v9 = v20;
        }

        be v25 = this;
        ca v26 = arg24;
        long v29 = 0;
        try {
            v25.ai(v26, false, false, v29);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    final void ag(int arg2) {
        this.an = arg2 * 0xC9647F4B;
        this.ap.size();
        this.an(0x381A390B);
    }

    public void ah(bm arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, long arg40) {
        be v11 = this;
        int v12 = arg32;
        if(!be.by) {
            return;
        }

        System.nanoTime();
        ca v13 = arg31.as();
        if(v13 == null) {
            return;
        }

        if(1 != v13.bt) {
            v13.ap();
        }

        v13.an(v12);
        int v0 = v13.bq * arg34 >> 16;
        int v2 = v13.bq * arg33 >> 16;
        int v3 = arg39 * arg36 - arg35 * arg37 >> 16;
        int v14 = v3 * arg34 + arg38 * arg33 >> 16;
        int v4 = v14 + v0;
        if(v4 > 50) {
            if(v14 >= 3500) {
            }
            else {
                int v6 = arg39 * arg35 + arg37 * arg36 >> 16;
                int v9 = 574766503;
                int v7 = (v6 - v13.bq) * (v11.bo.bp * v9);
                int v8 = v7 / v4;
                if(v8 >= v11.bo.bq * 0x36E3B7F) {
                    return;
                }
                else {
                    int v10 = v11.bo.bp * v9 * (v13.bq + v6);
                    int v15 = v10 / v4;
                    if(v15 <= v11.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        int v1 = arg38 * arg34 - v3 * arg33 >> 16;
                        v3 = (v1 + v2) * (v11.bo.bp * v9);
                        int v5 = v3 / v4;
                        if(v5 <= v11.bo.bx * 0xB31C2AE1) {
                            return;
                        }
                        else {
                            v9 = v11.bo.bp * 574766503 * (v1 - (v2 + (v13.bh * 0xCD6CEDE3 * arg34 >> 16)));
                            v2 = v9 / v4;
                            if(v2 >= v11.bo.bg * 0x560C1795) {
                                return;
                            }
                            else {
                                v4 = jb.ah(73);
                                int v16 = eu.at(61);
                                boolean v21 = bf.az(-49);
                                if((aq.ae(arg40)) && (v21)) {
                                    v21 = false;
                                    if(bc.ax) {
                                        v21 = ew.aw(v13, arg37, arg38, arg39, this, -115);
                                    }
                                    else {
                                        v0 = v14 - v0;
                                        int v29 = v2;
                                        if(v0 <= 50) {
                                            v0 = 50;
                                        }

                                        if(v6 > 0) {
                                            v15 = v10 / v0;
                                        }
                                        else {
                                            v8 = v7 / v0;
                                        }

                                        if(v1 > 0) {
                                            v5 = v3 / v0;
                                            v2 = v29;
                                        }
                                        else {
                                            v2 = v9 / v0;
                                        }

                                        v4 -= v11.bo.bw * 1126407459;
                                        v0 = v16 - v11.bo.bo * 0xF7F729AF;
                                        if(v4 <= v8) {
                                            goto label_150;
                                        }

                                        if(v4 >= v15) {
                                            goto label_150;
                                        }

                                        if(v0 <= v2) {
                                            goto label_150;
                                        }

                                        if(v0 >= v5) {
                                            goto label_150;
                                        }

                                        v21 = true;
                                    }

                                label_150:
                                    if(!v21) {
                                        goto label_167;
                                    }

                                    if(!v13.bf && !this.ap(v13, arg32, arg33, arg34, arg35, arg36, arg37, arg38, arg39, -907789621)) {
                                        goto label_167;
                                    }

                                    lt.am(arg40);
                                }

                            label_167:
                                int v21_1 = be.aj[v12];
                                int v22 = be.ad[v12];
                                if(v13.bx >= 1600) {
                                    return;
                                }

                                if(v13.bw) {
                                    v11.aa(v13, 0x2775E90);
                                }

                                ca v0_1 = v13;
                                ax.bx(v13.bp, arg40, v13.bx, v13.bg, arg33, arg34, arg35, arg36, v21_1, v22, arg37, arg38, arg39, v14, false, 2028766929);
                                if(!v0_1.by) {
                                    if(-1 == v0_1.bo) {
                                        v11.ap.add(v0_1);
                                    }

                                    v0_1.bo = v11.an * 0x305E9263;
                                }

                                System.nanoTime();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    final void ai(ca arg20, boolean arg21, boolean arg22, long arg23) {
        int v4_1;
        int[] v6_1;
        int[] v5_1;
        int v7;
        int v6;
        int v2;
        int v12;
        int v11;
        int v15;
        int v10;
        int v9;
        int v8;
        int v5;
        be v1 = this;
        ca v0 = arg20;
        try {
            if(v0.bx >= 1600) {
                return;
            }

            int v3;
            for(v3 = 0; v3 < v0.bx; ++v3) {
                v1.ao[v3] = 0;
            }

            boolean v4 = arg22;
            for(v3 = 0; v3 < v0.aq; ++v3) {
                if(v0.au[v3] == -2) {
                }
                else {
                    v5 = v0.ab[v3];
                    v8 = v0.af[v3];
                    v9 = v0.ai[v3];
                    v10 = v1.am[v5];
                    v15 = v1.am[v8];
                    int v14 = v1.am[v9];
                    if(arg21) {
                        v11 = -5000;
                        if(v11 != v10 && v11 != v15 && v14 != v11) {
                            goto label_102;
                        }

                        v10 = v1.ah[v5];
                        v11 = v1.ah[v8];
                        v12 = v1.ah[v9];
                        int v13 = v1.at[v5];
                        v14 = v1.at[v8];
                        v15 = v1.at[v9];
                        v2 = v1.ay[v5];
                        v6 = v1.ay[v8];
                        v10 -= v11;
                        v12 -= v11;
                        v13 -= v14;
                        v15 -= v14;
                        v2 -= v6;
                        v7 = v1.ay[v9] - v6;
                        if(v11 * (v13 * v7 - v15 * v2) + v14 * (v2 * v12 - v7 * v10) + (v15 * v10 - v13 * v12) * v6 <= 0) {
                            goto label_184;
                        }

                        v1.au[v3] = true;
                        v2 = v0.bg + (v1.ag[v5] + v1.ag[v8] + v1.ag[v9]) / 3;
                        v5_1 = v1.as[v2];
                        v6_1 = v1.ao;
                        v7 = v6_1[v2];
                        v6_1[v2] = v7 + 1;
                        v5_1[v7] = v3;
                        goto label_184;
                    }

                label_102:
                    if(v4) {
                        v2 = v14;
                        v6 = v15;
                        if(ah.ao(v1.az[v5], v1.az[v8], v1.az[v9], v10, v15, v2, 0, 0x6FD5490)) {
                            lt.am(arg23);
                            v4 = false;
                        }
                    }
                    else {
                        v2 = v14;
                        v6 = v15;
                    }

                    if((v1.az[v9] - v1.az[v8]) * (v10 - v6) - (v2 - v6) * (v1.az[v5] - v1.az[v8]) <= 0) {
                        goto label_184;
                    }

                    v1.au[v3] = false;
                    if(v10 < 0 || v6 < 0 || v2 < 0) {
                    label_162:
                        v1.aa[v3] = true;
                    }
                    else {
                        v11 = 1109746211;
                        if(v10 > v1.bo.by * v11) {
                            goto label_162;
                        }
                        else if(v6 > v1.bo.by * v11) {
                            goto label_162;
                        }
                        else if(v2 > v1.bo.by * v11) {
                            goto label_162;
                        }
                        else {
                            v1.aa[v3] = false;
                        }
                    }

                    v2 = v0.bg + (v1.ag[v9] + (v1.ag[v5] + v1.ag[v8])) / 3;
                    v5_1 = v1.as[v2];
                    v6_1 = v1.ao;
                    v7 = v6_1[v2];
                    v6_1[v2] = v7 + 1;
                    v5_1[v7] = v3;
                }

            label_184:
            }

            if(v0.am == null) {
                v2 = v0.bx - 1;
                goto label_192;
            }

            for(v2 = 0; v2 < 12; ++v2) {
                v1.ak[v2] = 0;
                v1.bf[v2] = 0;
            }

            for(v2 = v0.bx - 1; true; --v2) {
                v3 = 10;
                if(v2 < 0) {
                    break;
                }

                v4_1 = v1.ao[v2];
                if(v4_1 > 0) {
                    v5_1 = v1.as[v2];
                    for(v6 = 0; v6 < v4_1; ++v6) {
                        v7 = v5_1[v6];
                        v8 = v0.am[v7];
                        int[] v9_1 = v1.ak;
                        v10 = v9_1[v8];
                        v9_1[v8] = v10 + 1;
                        v1.ac[v8][v10] = v7;
                        if(v8 < v3) {
                            v1.bf[v8] += v2;
                        }
                        else if(v8 == v3) {
                            v1.bd[v10] = v2;
                        }
                        else {
                            v1.ba[v10] = v2;
                        }
                    }
                }
            }

            v4_1 = 2;
            v2 = v1.ak[1] > 0 || v1.ak[v4_1] > 0 ? (v1.bf[v4_1] + v1.bf[1]) / (v1.ak[1] + v1.ak[v4_1]) : 0;
            v5 = 4;
            v4_1 = v1.ak[3] > 0 || v1.ak[v5] > 0 ? (v1.bf[3] + v1.bf[v5]) / (v1.ak[v5] + v1.ak[3]) : 0;
            v6 = 6;
            v7 = 8;
            v5 = v1.ak[v6] > 0 || v1.ak[v7] > 0 ? (v1.bf[v6] + v1.bf[v7]) / (v1.ak[v6] + v1.ak[v7]) : 0;
            v6 = v1.ak[v3];
            int[] v7_1 = v1.ac[v3];
            int[] v8_1 = v1.bd;
            v9 = 11;
            if(v6 == 0) {
                v6 = v1.ak[v9];
                v7_1 = v1.ac[v9];
                v8_1 = v1.ba;
            }

            v12 = v6 > 0 ? v8_1[0] : -1000;
            int[] v13_1 = v7_1;
            int[] v14_1 = v8_1;
            v7 = 0;
            v8 = v6;
            v6 = 0;
            while(v6 < v3) {
                while(v6 == 0) {
                    if(v12 <= v2) {
                        break;
                    }

                    v12 = v7 + 1;
                    v1.av(v0, v13_1[v7], -6);
                    if(v12 != v8 || v1.ac[v9] == v13_1) {
                        v7 = v12;
                    }
                    else {
                        v7 = v1.ak[v9];
                        v13_1 = v1.ac[v9];
                        v14_1 = v1.ba;
                        v8 = v7;
                        v7 = 0;
                    }

                    if(v7 < v8) {
                        v12 = v14_1[v7];
                        continue;
                    }

                    v12 = -1000;
                }

                v15 = 3;
                while(v6 == v15) {
                    if(v12 <= v4_1) {
                        break;
                    }

                    v12 = v7 + 1;
                    v1.av(v0, v13_1[v7], -10);
                    if(v8 != v12 || v1.ac[v9] == v13_1) {
                        v7 = v12;
                    }
                    else {
                        v3 = v1.ak[v9];
                        v13_1 = v1.ac[v9];
                        v14_1 = v1.ba;
                        v7 = 0;
                        v8 = v3;
                    }

                    if(v7 < v8) {
                        v12 = v14_1[v7];
                        continue;
                    }

                    v12 = -1000;
                }

                while(5 == v6) {
                    if(v12 <= v5) {
                        break;
                    }

                    v3 = v7 + 1;
                    v1.av(v0, v13_1[v7], -23);
                    if(v8 != v3 || v13_1 == v1.ac[v9]) {
                        v7 = v3;
                    }
                    else {
                        v8 = v1.ak[v9];
                        v13_1 = v1.ac[v9];
                        v14_1 = v1.ba;
                        v7 = 0;
                    }

                    if(v7 < v8) {
                        v12 = v14_1[v7];
                        continue;
                    }

                    v12 = -1000;
                }

                v3 = v1.ak[v6];
                int[] v11_1 = v1.ac[v6];
                for(v15 = 0; v15 < v3; ++v15) {
                    v1.av(v0, v11_1[v15], 9);
                }

                ++v6;
                v3 = 10;
                v9 = 11;
            }

            v2 = -1000;
            while(true) {
            label_446:
                if(v2 == v12) {
                    return;
                }

                v3 = v7 + 1;
                v1.av(v0, v13_1[v7], -94);
                if(v3 == v8) {
                    v5 = 11;
                    if(v1.ac[v5] != v13_1) {
                        v13_1 = v1.ac[v5];
                        v8 = v1.ak[v5];
                        v14_1 = v1.ba;
                        v7 = 0;
                    }
                    else {
                        goto label_467;
                    }
                }
                else {
                label_467:
                    v7 = v3;
                }

                if(v7 >= v8) {
                    break;
                }

                v12 = v14_1[v7];
            }
        }
        catch(RuntimeException v0_1) {
            goto label_476;
        }

        v12 = -1000;
        goto label_446;
        return;
        try {
        label_192:
            while(v2 >= 0) {
                v3 = v1.ao[v2];
                if(v3 > 0) {
                    int[] v4_2 = v1.as[v2];
                    for(v5 = 0; v5 < v3; ++v5) {
                        v1.av(v0, v4_2[v5], -86);
                    }
                }

                --v2;
            }

            return;
        }
        catch(RuntimeException v0_1) {
        label_476:
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("be.ai(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public final void aj(ca arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30) {
        int v17;
        be v0 = this;
        ca v1 = arg23;
        int v7 = 0;
        v0.ao[0] = -1;
        if(2 != v1.bt && v1.bt != 1) {
            arg23.aj();
        }

        int v8 = v0.bo.bw * 1126407459;
        int v6 = v0.bo.bo * 0xF7F729AF;
        int v9 = be.aj[arg24];
        int v10 = be.ad[arg24];
        int v11 = be.aj[arg25];
        int v12 = be.ad[arg25];
        int v13 = be.aj[arg26];
        int v14 = be.ad[arg26];
        int v15 = be.aj[arg27];
        int v5 = be.ad[arg27];
        int v16 = v15 * arg29 + v5 * arg30 >> 16;
        int v18 = v6;
        while(v7 < v1.an) {
            v6 = v1.ap[v7];
            int v19 = v8;
            v8 = v1.aj[v7];
            int v0_1 = v1.ad[v7];
            if(arg26 != 0) {
                v17 = v8 * v13 + v14 * v6 >> 16;
                v8 = v8 * v14 - v6 * v13 >> 16;
                v6 = v17;
            }

            if(arg24 != 0) {
                v17 = v10 * v8 - v9 * v0_1 >> 16;
                v0_1 = v0_1 * v10 + v8 * v9 >> 16;
                v8 = v17;
            }

            if(arg25 != 0) {
                v17 = v12 * v6 + v11 * v0_1 >> 16;
                v0_1 = v0_1 * v12 - v6 * v11 >> 16;
                v6 = v17;
            }

            v6 += arg28;
            v8 += arg29;
            v17 = v0_1 + arg30;
            int v20 = v8 * v5 - v15 * v17 >> 16;
            v8 = v17 * v5 + v8 * v15 >> 16;
            v0 = this;
            v0.ag[v7] = v8 - v16;
            v0.am[v7] = v0.bo.bp * 574766503 * v6 / v8 + v19;
            v0.az[v7] = v18 + v0.bo.bp * 574766503 * v20 / v8;
            if(v1.ay > 0) {
                v0.ah[v7] = v6;
                v0.at[v7] = v20;
                v0.ay[v7] = v8;
            }

            ++v7;
            v8 = v19;
        }

        be v24 = this;
        ca v25 = arg23;
        long v28 = 0;
        try {
            v24.ai(v25, false, false, v28);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    final boolean ak(ca arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29) {
        int v16;
        int v8;
        be v0 = this;
        ca v1 = arg21;
        if(v1.bx >= 1600) {
            return 0;
        }

        int v7 = v0.bo.bw * 1126407459;
        int v10 = v0.bo.bo * 0xD606F80;
        int v9 = be.aj[arg22];
        int v11 = be.ad[arg22];
        int v12;
        for(v12 = 0; true; ++v12) {
            int v14 = -1;
            if(v12 >= v1.an) {
                break;
            }

            int v13 = v1.ap[v12];
            int v15 = v1.aj[v12];
            v8 = v1.ad[v12];
            if(arg22 != 0) {
                v16 = v8 * v9 + v13 * v11 >> 16;
                v8 = v8 * v11 - v13 * v9 >> 16;
                v13 = v16;
            }

            v13 += arg27;
            v15 += arg28;
            v16 = v8 + arg29;
            int v18 = arg25 * v16 + v13 * arg26 >> 16;
            v13 = v16 * arg26 - v13 * arg25 >> 16;
            v16 = arg24 * v15 - v13 * arg23 >> 16;
            v13 = v15 * arg23 + v13 * arg24 >> 16;
            if(v13 >= 50) {
                v0.am[v12] = v0.bo.bp * 574766503 * v18 / v13 + v7;
                v0.az[v12] = v16 * (v0.bo.bp * -1036290973) / v13 + v10;
            }
            else {
                int[] v2 = v0.am;
                v0.az[v12] = v14;
                v2[v12] = v14;
            }
        }

        int v2_1;
        for(v2_1 = 0; v2_1 < v1.aq; ++v2_1) {
            if(v1.au[v2_1] == -2) {
            }
            else {
                int v3 = v1.ab[v2_1];
                int v4 = v1.af[v2_1];
                int v5 = v1.ai[v2_1];
                int v6 = v0.am[v3];
                v7 = v0.am[v4];
                v8 = v0.am[v5];
                if(v6 != v14 && v7 != v14) {
                    if(v14 == v8) {
                    }
                    else if(ah.ao(v0.az[v3], v0.az[v4], v0.az[v5], v6, v7, v8, 5, 0x6FD5490)) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    public final void al(ca arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32, byte arg33) {
        int v18;
        int v20;
        int v8;
        int v9;
        be v1 = this;
        ca v0 = arg24;
        try {
            v9 = 0;
            v1.ao[0] = -1;
            if(v0.bt != 2 && v0.bt != 1) {
                arg24.aj();
            }

            v8 = v1.bo.bw * 1126407459;
            int v10 = v1.bo.bo * 0xF7F729AF;
            int v7 = be.aj[arg25];
            int v11 = be.ad[arg25];
            int v12 = be.aj[arg26];
            int v13 = be.ad[arg26];
            int v14 = be.aj[arg27];
            int v15 = be.ad[arg27];
            int v16 = be.aj[arg28];
            int v5 = be.ad[arg28];
            int v17 = v16 * arg30 + arg31 * v5 >> 16;
            int v19 = v10;
            while(true) {
            label_42:
                if(v9 >= v0.an) {
                    goto label_124;
                }

                v10 = v0.ap[v9];
                v20 = v8;
                v8 = v0.aj[v9];
                int v6 = v0.ad[v9];
                if(arg27 != 0) {
                    v18 = v10 * v15 + v8 * v14 >> 16;
                    v8 = v8 * v15 - v10 * v14 >> 16;
                    v10 = v18;
                }

                if(arg25 != 0) {
                    v18 = v8 * v11 - v7 * v6 >> 16;
                    v6 = v6 * v11 + v8 * v7 >> 16;
                    v8 = v18;
                }

                if(arg26 != 0) {
                    v18 = v6 * v12 + v10 * v13 >> 16;
                    v6 = v6 * v13 - v10 * v12 >> 16;
                    v10 = v18;
                }

                v10 += arg29;
                v8 += arg30;
                v18 = v6 + arg31;
                int v21 = v5 * v8 - v16 * v18 >> 16;
                v8 = v8 * v16 + v18 * v5 >> 16;
                v1.ag[v9] = v8 - v17;
                v1.am[v9] = v20 + v1.bo.bp * 574766503 * v10 / arg32;
                v1.az[v9] = v19 + v1.bo.bp * 574766503 * v21 / arg32;
                if(v0.ay > 0) {
                    v1.ah[v9] = v10;
                    v1.at[v9] = v21;
                    v1.ay[v9] = v8;
                }

                break;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_136;
        }

        ++v9;
        v8 = v20;
        goto label_42;
    label_124:
        be v25 = this;
        ca v26 = arg24;
        long v29 = 0;
        try {
            v25.ai(v26, false, false, v29);
            return;
        }
        catch(RuntimeException v0_1) {
        label_136:
            StringBuilder v2 = new StringBuilder();
            v2.append("be.al(");
            v2.append(')');
            throw lx.al(((Throwable)v0_1), v2.toString());
        }
        catch(Exception ) {
            return;
        }
    }

    final void am(int arg2) {
        this.an = arg2 * 0xC9647F4B;
        this.ap.size();
        this.an(2000063378);
    }

    final void an(int arg4) {
        try {
            arg4 = this.an * 0x305E9263 - 100;
            Iterator v0 = this.ap.iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                if(arg4 < ((ca)v1).bo) {
                    continue;
                }

                this.au(((ca)v1), 2031183904);
                ((ca)v1).bo = -1;
                ((ca)v1).bw = true;
                v0.remove();
            }
        }
        catch(RuntimeException v4) {
            goto label_22;
        }

        return;
    label_22:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("be.an(");
        v0_1.append(')');
        throw lx.al(((Throwable)v4), v0_1.toString());
    }

    public void ao(bm arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, long arg40) {
        be v11 = this;
        int v12 = arg32;
        if(!be.by) {
            return;
        }

        System.nanoTime();
        ca v13 = arg31.as();
        if(v13 == null) {
            return;
        }

        if(1 != v13.bt) {
            v13.ap();
        }

        v13.an(v12);
        int v0 = v13.bq * arg34 >> 16;
        int v2 = v13.bq * arg33 >> 16;
        int v3 = arg39 * arg36 - arg35 * arg37 >> 16;
        int v14 = v3 * arg34 + arg38 * arg33 >> 16;
        int v4 = v14 + v0;
        if(v4 > 50) {
            if(v14 >= 3500) {
            }
            else {
                int v6 = arg39 * arg35 + arg37 * arg36 >> 16;
                int v9 = 574766503;
                int v7 = (v6 - v13.bq) * (v11.bo.bp * v9);
                int v8 = v7 / v4;
                if(v8 >= v11.bo.bq * 0x36E3B7F) {
                    return;
                }
                else {
                    int v10 = v11.bo.bp * v9 * (v13.bq + v6);
                    int v15 = v10 / v4;
                    if(v15 <= v11.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        int v1 = arg38 * arg34 - v3 * arg33 >> 16;
                        v3 = (v1 + v2) * (v11.bo.bp * v9);
                        int v5 = v3 / v4;
                        if(v5 <= v11.bo.bx * 0xB31C2AE1) {
                            return;
                        }
                        else {
                            v9 = v11.bo.bp * 574766503 * (v1 - (v2 + (v13.bh * 0xCD6CEDE3 * arg34 >> 16)));
                            v2 = v9 / v4;
                            if(v2 >= v11.bo.bg * 0x560C1795) {
                                return;
                            }
                            else {
                                v4 = jb.ah(76);
                                int v16 = eu.at(100);
                                boolean v21 = bf.az(0x60);
                                if((aq.ae(arg40)) && (v21)) {
                                    v21 = false;
                                    if(bc.ax) {
                                        v21 = ew.aw(v13, arg37, arg38, arg39, this, -93);
                                    }
                                    else {
                                        v0 = v14 - v0;
                                        int v29 = v2;
                                        if(v0 <= 50) {
                                            v0 = 50;
                                        }

                                        if(v6 > 0) {
                                            v15 = v10 / v0;
                                        }
                                        else {
                                            v8 = v7 / v0;
                                        }

                                        if(v1 > 0) {
                                            v5 = v3 / v0;
                                            v2 = v29;
                                        }
                                        else {
                                            v2 = v9 / v0;
                                        }

                                        v4 -= v11.bo.bw * 1126407459;
                                        v0 = v16 - v11.bo.bo * 0xF7F729AF;
                                        if(v4 <= v8) {
                                            goto label_150;
                                        }

                                        if(v4 >= v15) {
                                            goto label_150;
                                        }

                                        if(v0 <= v2) {
                                            goto label_150;
                                        }

                                        if(v0 >= v5) {
                                            goto label_150;
                                        }

                                        v21 = true;
                                    }

                                label_150:
                                    if(!v21) {
                                        goto label_167;
                                    }

                                    if(!v13.bf && !this.ap(v13, arg32, arg33, arg34, arg35, arg36, arg37, arg38, arg39, 0x85E9090C)) {
                                        goto label_167;
                                    }

                                    lt.am(arg40);
                                }

                            label_167:
                                int v21_1 = be.aj[v12];
                                int v22 = be.ad[v12];
                                if(v13.bx >= 1600) {
                                    return;
                                }

                                if(v13.bw) {
                                    v11.aa(v13, 0x2775E90);
                                }

                                ca v0_1 = v13;
                                ax.bx(v13.bp, arg40, v13.bx, v13.bg, arg33, arg34, arg35, arg36, v21_1, v22, arg37, arg38, arg39, v14, false, 2028766929);
                                if(!v0_1.by) {
                                    if(-1 == v0_1.bo) {
                                        v11.ap.add(v0_1);
                                    }

                                    v0_1.bo = v11.an * 0x305E9263;
                                }

                                System.nanoTime();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    final boolean ap(ca arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30) {
        int v2;
        int v16;
        be v1 = this;
        ca v0 = arg21;
        try {
            if(v0.bx >= 1600) {
                return 0;
            }

            int v7 = v1.bo.bw * 1126407459;
            int v10 = v1.bo.bo * 0xF7F729AF;
            int v8 = be.aj[arg22];
            int v11 = be.ad[arg22];
            int v12;
            for(v12 = 0; true; ++v12) {
                int v14 = -1;
                if(v12 >= v0.an) {
                    break;
                }

                int v13 = v0.ap[v12];
                int v15 = v0.aj[v12];
                int v9 = v0.ad[v12];
                if(arg22 != 0) {
                    v16 = v9 * v8 + v13 * v11 >> 16;
                    v9 = v9 * v11 - v13 * v8 >> 16;
                    v13 = v16;
                }

                v13 += arg27;
                v15 += arg28;
                v16 = v9 + arg29;
                int v18 = arg25 * v16 + v13 * arg26 >> 16;
                v13 = v16 * arg26 - v13 * arg25 >> 16;
                v16 = arg24 * v15 - v13 * arg23 >> 16;
                v13 = v15 * arg23 + v13 * arg24 >> 16;
                if(v13 >= 50) {
                    v1.am[v12] = v1.bo.bp * 574766503 * v18 / v13 + v7;
                    v1.az[v12] = v16 * (v1.bo.bp * 574766503) / v13 + v10;
                }
                else {
                    int[] v13_1 = v1.am;
                    v1.az[v12] = v14;
                    v13_1[v12] = v14;
                }
            }

            v2 = 0;
            while(true) {
            label_87:
                if(v2 >= v0.aq) {
                    return 0;
                }

                if(v0.au[v2] == -2) {
                }
                else {
                    int v3 = v0.ab[v2];
                    int v4 = v0.af[v2];
                    int v5 = v0.ai[v2];
                    int v6 = v1.am[v3];
                    v7 = v1.am[v4];
                    v8 = v1.am[v5];
                    if(v6 != v14 && v7 != v14) {
                        if(v14 == v8) {
                        }
                        else if(ah.ao(v1.az[v3], v1.az[v4], v1.az[v5], v6, v7, v8, 5, 0x6FD5490)) {
                            return 1;
                        }
                    }
                }

                goto label_130;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_136;
        }

        return 1;
    label_130:
        ++v2;
        goto label_87;
        return 0;
    label_136:
        StringBuilder v2_1 = new StringBuilder();
        v2_1.append("be.ap(");
        v2_1.append(')');
        throw lx.al(((Throwable)v0_1), v2_1.toString());
    }

    public final void aq(ca arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31, int arg32) {
        int v18;
        be v0 = this;
        ca v1 = arg24;
        int v8 = 0;
        v0.ao[0] = -1;
        if(v1.bt != 2 && v1.bt != 1) {
            arg24.aj();
        }

        int v9 = v0.bo.bw * 1126407459;
        int v10 = v0.bo.bo * 0xF7F729AF;
        int v7 = be.aj[arg25];
        int v11 = be.ad[arg25];
        int v12 = be.aj[arg26];
        int v13 = be.ad[arg26];
        int v14 = be.aj[arg27];
        int v15 = be.ad[arg27];
        int v16 = be.aj[arg28];
        int v5 = be.ad[arg28];
        int v17 = v16 * arg30 + arg31 * v5 >> 16;
        int v19 = v10;
        while(v8 < v1.an) {
            v10 = v1.ap[v8];
            int v20 = v9;
            v9 = v1.aj[v8];
            int v6 = v1.ad[v8];
            if(arg27 != 0) {
                v18 = v10 * v15 + v9 * v14 >> 16;
                v9 = v9 * v15 - v10 * v14 >> 16;
                v10 = v18;
            }

            if(arg25 != 0) {
                v18 = v9 * v11 - v7 * v6 >> 16;
                v6 = v6 * v11 + v9 * v7 >> 16;
                v9 = v18;
            }

            if(arg26 != 0) {
                v18 = v6 * v12 + v10 * v13 >> 16;
                v6 = v6 * v13 - v10 * v12 >> 16;
                v10 = v18;
            }

            v10 += arg29;
            v9 += arg30;
            v18 = v6 + arg31;
            int v21 = v5 * v9 - v16 * v18 >> 16;
            v9 = v9 * v16 + v18 * v5 >> 16;
            v0.ag[v8] = v9 - v17;
            v0.am[v8] = v20 + v0.bo.bp * 0xFB3EE787 * v10 / arg32;
            v0.az[v8] = v19 + v0.bo.bp * 574766503 * v21 / arg32;
            if(v1.ay > 0) {
                v0.ah[v8] = v10;
                v0.at[v8] = v21;
                v0.ay[v8] = v9;
            }

            ++v8;
            v9 = v20;
        }

        be v25 = this;
        ca v26 = arg24;
        long v29 = 0;
        try {
            v25.ai(v26, false, false, v29);
            return;
        }
        catch(Exception ) {
            return;
        }
    }

    final void ar(int arg2, int arg3) {
        arg2 *= 0xC9647F4B;
        try {
            this.an = arg2;
            this.ap.size();
            this.an(1701510868);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("be.ar(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static void as(boolean arg1, int arg2) {
        try {
            if(arg1 != ju.ab) {
                ag.ay(971580097);
                ju.ab = arg1;
            }
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("be.as(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    final void as(int arg2) {
        this.an = arg2 * -1297322408;
        this.ap.size();
        this.an(2057225571);
    }

    public void at(bm arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, long arg40) {
        be v11 = this;
        int v12 = arg32;
        if(!be.by) {
            return;
        }

        System.nanoTime();
        ca v13 = arg31.as();
        if(v13 == null) {
            return;
        }

        if(1 != v13.bt) {
            v13.ap();
        }

        v13.an(v12);
        int v0 = v13.bq * arg34 >> 16;
        int v2 = v13.bq * arg33 >> 16;
        int v3 = arg39 * arg36 - arg35 * arg37 >> 16;
        int v14 = v3 * arg34 + arg38 * arg33 >> 16;
        int v4 = v14 + v0;
        if(v4 > 580381566) {
            if(v14 >= 3500) {
            }
            else {
                int v5 = arg39 * arg35 + arg37 * arg36 >> 16;
                int v6 = (v5 - v13.bq) * (v11.bo.bp * 0x523F00AB);
                int v7 = v6 / v4;
                if(v7 >= v11.bo.bq * 0xA4CF79A7) {
                    return;
                }
                else {
                    int v8 = v11.bo.bp * 574766503 * (v13.bq + v5);
                    int v10 = v8 / v4;
                    if(v10 <= v11.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        v3 = arg38 * arg34 - v3 * arg33 >> 16;
                        int v15 = (v3 + v2) * (v11.bo.bp * 0x7FBD39D6);
                        int v1 = v15 / v4;
                        if(v1 <= v11.bo.bx * 0xB31C2AE1) {
                            return;
                        }
                        else {
                            int v9 = v11.bo.bp * 574766503 * (v3 - (v2 + (v13.bh * -1116233406 * arg34 >> 16)));
                            v2 = v9 / v4;
                            if(v2 >= v11.bo.bg * -707054724) {
                                return;
                            }
                            else {
                                v4 = jb.ah(0x4F);
                                int v16 = eu.at(0x60);
                                boolean v21 = bf.az(-88);
                                if((aq.ae(arg40)) && (v21)) {
                                    v21 = false;
                                    if(bc.ax) {
                                        v21 = ew.aw(v13, arg37, arg38, arg39, this, -57);
                                    }
                                    else {
                                        v0 = v14 - v0;
                                        int v29 = v1;
                                        if(v0 <= 50) {
                                            v0 = 50;
                                        }

                                        if(v5 > 0) {
                                            v10 = v8 / v0;
                                        }
                                        else {
                                            v7 = v6 / v0;
                                        }

                                        if(v3 > 0) {
                                            v1 = v15 / v0;
                                        }
                                        else {
                                            v2 = v9 / v0;
                                            v1 = v29;
                                        }

                                        v4 -= v11.bo.bw * 1126407459;
                                        v0 = v16 - v11.bo.bo * 0xF7F729AF;
                                        if(v4 <= v7) {
                                            goto label_152;
                                        }

                                        if(v4 >= v10) {
                                            goto label_152;
                                        }

                                        if(v0 <= v2) {
                                            goto label_152;
                                        }

                                        if(v0 >= v1) {
                                            goto label_152;
                                        }

                                        v21 = true;
                                    }

                                label_152:
                                    if(!v21) {
                                        goto label_169;
                                    }

                                    if(!v13.bf && !this.ap(v13, arg32, arg33, arg34, arg35, arg36, arg37, arg38, arg39, 0x34AEDE9C)) {
                                        goto label_169;
                                    }

                                    lt.am(arg40);
                                }

                            label_169:
                                int v21_1 = be.aj[v12];
                                int v22 = be.ad[v12];
                                if(v13.bx >= 1600) {
                                    return;
                                }

                                if(v13.bw) {
                                    v11.aa(v13, 0x2775E90);
                                }

                                ca v0_1 = v13;
                                ax.bx(v13.bp, arg40, v13.bx, v13.bg, arg33, arg34, arg35, arg36, v21_1, v22, arg37, arg38, arg39, v14, false, 2028766929);
                                if(!v0_1.by) {
                                    if(-1 == v0_1.bo) {
                                        v11.ap.add(v0_1);
                                    }

                                    v0_1.bo = v11.an * 0x305E9263;
                                }

                                System.nanoTime();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    void au(ca arg2, int arg3) {
        try {
            ax.bv(arg2.bp, 0xC18C0839);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("be.au(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static int av(long arg2) {
        return ((int)(arg2 >>> 17 & 0xFFFFFFFFL));
    }

    final void av(ca arg52, int arg53, byte arg54) {
        float v45;
        int v20;
        int v17;
        int v9;
        int v8;
        int v6;
        be v1 = this;
        ca v0 = arg52;
        try {
            int v3 = v0.ab[arg53];
            int v4 = v0.af[arg53];
            int v5 = v0.ai[arg53];
            v1.bo.ac = v1.aa[arg53];
            v1.bo.bn = v0.az == null ? 0 : (v0.az[arg53] & 0xFF) * 0x308B19C3;
            int v7 = -1;
            if(v0.ah == null || v7 == v0.ah[arg53]) {
                v17 = v3;
                v20 = v4;
                if(-1 == v0.au[arg53]) {
                    v1.bo.ap(v1.az[v17], v1.az[v20], v1.az[v5], v1.am[v17], v1.am[v20], v1.am[v5], be.aq[v0.av[arg53]], 0x2F35B21C);
                    return;
                }

                v1.bo.an(v1.az[v17], v1.az[v20], v1.az[v5], v1.am[v17], v1.am[v20], v1.am[v5], v0.av[arg53], v0.aa[arg53], v0.au[arg53], 9);
            }
            else {
                if(v0.ag == null || v0.ag[arg53] == v7) {
                    v8 = v3;
                    v9 = v4;
                    v6 = v5;
                }
                else {
                    v6 = v0.ag[arg53] & 0xFF;
                    v8 = v0.aw[v6];
                    v9 = v0.ao[v6];
                    v6 = v0.as[v6];
                }

                float v10 = ((float)v1.ax[v8]);
                float v11 = ((float)v1.al[v8]);
                float v8_1 = ((float)v1.ae[v8]);
                float v12 = (((float)v1.ax[v9])) - v10;
                float v13 = (((float)v1.al[v9])) - v11;
                float v9_1 = (((float)v1.ae[v9])) - v8_1;
                float v14 = (((float)v1.ax[v6])) - v10;
                float v15 = (((float)v1.al[v6])) - v11;
                float v6_1 = (((float)v1.ae[v6])) - v8_1;
                float v7_1 = (((float)v1.ax[v3])) - v10;
                float v2 = (((float)v1.al[v3])) - v11;
                float v0_2 = (((float)v1.ae[v3])) - v8_1;
                v17 = v3;
                float v18 = (((float)v1.ax[v4])) - v10;
                float v19 = (((float)v1.al[v4])) - v11;
                float v3_1 = (((float)v1.ae[v4])) - v8_1;
                v20 = v4;
                float v4_1 = (((float)v1.ax[v5])) - v10;
                v10 = (((float)v1.al[v5])) - v11;
                v11 = (((float)v1.ae[v5])) - v8_1;
                v8_1 = v13 * v6_1 - v9_1 * v15;
                float v21 = v14 * v9_1 - v12 * v6_1;
                float v22 = v12 * v15 - v14 * v13;
                float v23 = v15 * v22 - v21 * v6_1;
                float v24 = v6_1 * v8_1 - v22 * v14;
                float v25 = v21 * v14 - v15 * v8_1;
                float v26 = 1f / (v25 * v9_1 + (v24 * v13 + v12 * v23));
                float v28 = (v0_2 * v25 + (v7_1 * v23 + v2 * v24)) * v26;
                float v29 = (v3_1 * v25 + (v19 * v24 + v18 * v23)) * v26;
                v23 = (v25 * v11 + (v23 * v4_1 + v24 * v10)) * v26;
                v24 = v22 * v13 - v9_1 * v21;
                v9_1 = v9_1 * v8_1 - v22 * v12;
                v21 = v21 * v12 - v8_1 * v13;
                v6_1 = 1f / (v14 * v24 + v15 * v9_1 + v6_1 * v21);
                float v46 = (v2 * v9_1 + v7_1 * v24 + v0_2 * v21) * v6_1;
                float v47 = (v9_1 * v19 + v24 * v18 + v3_1 * v21) * v6_1;
                float v48 = (v21 * v11 + (v10 * v9_1 + v4_1 * v24)) * v6_1;
                v0_2 = v29 - v28;
                v2 = 1.1f;
                v3_1 = 0.99f;
                if(v0_2 > v3_1 && v0_2 < v2) {
                    v29 = 1f;
                }

                v0_2 = v23 - v29;
                if(v0_2 > v3_1 && v0_2 < v2) {
                    v23 = 1f;
                }

                v0_2 = v28 - v23;
                if(v0_2 > v3_1 && v0_2 < v2) {
                    v28 = 1f;
                }

                v0_2 = v28 - v29;
                float v43 = v0_2 <= v3_1 || v0_2 >= v2 ? v28 : 1f;
                v0_2 = v29 - v23;
                float v44 = v0_2 <= v3_1 || v0_2 >= v2 ? v29 : 1f;
                v0_2 = v23 - v43;
                if(v0_2 <= v3_1 || v0_2 >= v2) {
                    v45 = v23;
                    v0 = arg52;
                }
                else {
                    v0 = arg52;
                    v45 = 1f;
                }

                if(-1 == v0.au[arg53]) {
                    v1.bo.aq(v1.at[v17], v1.at[v20], v1.at[v5], v1.ah[v17], v1.ah[v20], v1.ah[v5], v1.ay[v17], v1.ay[v20], v1.ay[v5], v0.av[arg53], v0.av[arg53], v0.av[arg53], v43, v44, v45, v46, v47, v48, v0.ah[arg53], -2016859367);
                    return;
                }

                v1.bo.aq(v1.at[v17], v1.at[v20], v1.at[v5], v1.ah[v17], v1.ah[v20], v1.ah[v5], v1.ay[v17], v1.ay[v20], v1.ay[v5], v0.av[arg53], v0.aa[arg53], v0.au[arg53], v43, v44, v45, v46, v47, v48, v0.ah[arg53], 0x97F97913);
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("be.av(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public void aw(bm arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, long arg40) {
        be v11 = this;
        int v12 = arg32;
        if(!be.by) {
            return;
        }

        System.nanoTime();
        ca v13 = arg31.as();
        if(v13 == null) {
            return;
        }

        if(1 != v13.bt) {
            v13.ap();
        }

        v13.an(v12);
        int v0 = v13.bq * arg34 >> 16;
        int v2 = v13.bq * arg33 >> 16;
        int v3 = arg39 * arg36 - arg35 * arg37 >> 16;
        int v14 = v3 * arg34 + arg38 * arg33 >> 16;
        int v4 = v14 + v0;
        if(v4 > 50) {
            if(v14 >= 3500) {
            }
            else {
                int v6 = arg39 * arg35 + arg37 * arg36 >> 16;
                int v9 = 574766503;
                int v7 = (v6 - v13.bq) * (v11.bo.bp * v9);
                int v8 = v7 / v4;
                if(v8 >= v11.bo.bq * 0x36E3B7F) {
                    return;
                }
                else {
                    int v10 = v11.bo.bp * v9 * (v13.bq + v6);
                    int v15 = v10 / v4;
                    if(v15 <= v11.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        int v1 = arg38 * arg34 - v3 * arg33 >> 16;
                        v3 = (v1 + v2) * (v11.bo.bp * v9);
                        int v5 = v3 / v4;
                        if(v5 <= v11.bo.bx * 0xB31C2AE1) {
                            return;
                        }
                        else {
                            v9 = v11.bo.bp * 574766503 * (v1 - (v2 + (v13.bh * 0xCD6CEDE3 * arg34 >> 16)));
                            v2 = v9 / v4;
                            if(v2 >= v11.bo.bg * 0x560C1795) {
                                return;
                            }
                            else {
                                v4 = jb.ah(60);
                                int v16 = eu.at(0x6F);
                                boolean v21 = bf.az(21);
                                if((aq.ae(arg40)) && (v21)) {
                                    v21 = false;
                                    if(bc.ax) {
                                        v21 = ew.aw(v13, arg37, arg38, arg39, this, -57);
                                    }
                                    else {
                                        v0 = v14 - v0;
                                        int v29 = v2;
                                        if(v0 <= 50) {
                                            v0 = 50;
                                        }

                                        if(v6 > 0) {
                                            v15 = v10 / v0;
                                        }
                                        else {
                                            v8 = v7 / v0;
                                        }

                                        if(v1 > 0) {
                                            v5 = v3 / v0;
                                            v2 = v29;
                                        }
                                        else {
                                            v2 = v9 / v0;
                                        }

                                        v4 -= v11.bo.bw * 1126407459;
                                        v0 = v16 - v11.bo.bo * 0xF7F729AF;
                                        if(v4 <= v8) {
                                            goto label_150;
                                        }

                                        if(v4 >= v15) {
                                            goto label_150;
                                        }

                                        if(v0 <= v2) {
                                            goto label_150;
                                        }

                                        if(v0 >= v5) {
                                            goto label_150;
                                        }

                                        v21 = true;
                                    }

                                label_150:
                                    if(!v21) {
                                        goto label_167;
                                    }

                                    if(!v13.bf && !this.ap(v13, arg32, arg33, arg34, arg35, arg36, arg37, arg38, arg39, 0x2BE5C9C5)) {
                                        goto label_167;
                                    }

                                    lt.am(arg40);
                                }

                            label_167:
                                int v21_1 = be.aj[v12];
                                int v22 = be.ad[v12];
                                if(v13.bx >= 1600) {
                                    return;
                                }

                                if(v13.bw) {
                                    v11.aa(v13, 0x2775E90);
                                }

                                ca v0_1 = v13;
                                ax.bx(v13.bp, arg40, v13.bx, v13.bg, arg33, arg34, arg35, arg36, v21_1, v22, arg37, arg38, arg39, v14, false, 2028766929);
                                if(!v0_1.by) {
                                    if(-1 == v0_1.bo) {
                                        v11.ap.add(v0_1);
                                    }

                                    v0_1.bo = v11.an * 0x305E9263;
                                }

                                System.nanoTime();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void ax(ca arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, int arg30, int arg31) {
        int v1_1;
        int v19;
        int v18;
        int v16;
        int v5;
        int v15;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v6;
        int v7;
        int v8;
        be v1 = this;
        ca v0 = arg23;
        try {
            v8 = 0;
            v1.ao[0] = -1;
            if(2 != v0.bt && v0.bt != 1) {
                arg23.aj();
            }

            v7 = v1.bo.bw * 1126407459;
            v6 = v1.bo.bo * 0xF7F729AF;
            v9 = be.aj[arg24];
            v10 = be.ad[arg24];
            v11 = be.aj[arg25];
            v12 = be.ad[arg25];
            v13 = be.aj[arg26];
            v14 = be.ad[arg26];
            v15 = be.aj[arg27];
            v5 = be.ad[arg27];
            v16 = v15 * arg29 + v5 * arg30 >> 16;
            v18 = v6;
            while(true) {
            label_42:
                if(v8 >= v0.an) {
                    goto label_128;
                }

                v6 = v0.ap[v8];
                v19 = v7;
                v7 = v0.aj[v8];
                break;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_139;
        }

        try {
            v1_1 = v0.ad[v8];
            if(arg26 == 0) {
                goto label_61;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_139;
        }

        int v17 = v7 * v13 + v14 * v6 >> 16;
        v7 = v7 * v14 - v6 * v13 >> 16;
        v6 = v17;
    label_61:
        if(arg24 != 0) {
            v17 = v10 * v7 - v9 * v1_1 >> 16;
            v1_1 = v1_1 * v10 + v7 * v9 >> 16;
            v7 = v17;
        }

        if(arg25 != 0) {
            v17 = v12 * v6 + v11 * v1_1 >> 16;
            v1_1 = v1_1 * v12 - v6 * v11 >> 16;
            v6 = v17;
        }

        v6 += arg28;
        v7 += arg29;
        v17 = v1_1 + arg30;
        int v20 = v7 * v5 - v15 * v17 >> 16;
        v7 = v17 * v5 + v7 * v15 >> 16;
        v1 = this;
        try {
            v1.ag[v8] = v7 - v16;
            v1.am[v8] = v1.bo.bp * 574766503 * v6 / v7 + v19;
            v1.az[v8] = v18 + v1.bo.bp * 574766503 * v20 / v7;
            if(v0.ay > 0) {
                v1.ah[v8] = v6;
                v1.at[v8] = v20;
                v1.ay[v8] = v7;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_139;
        }

        ++v8;
        v7 = v19;
        goto label_42;
    label_128:
        be v24 = this;
        ca v25 = arg23;
        long v28 = 0;
        try {
            v24.ai(v25, false, false, v28);
            return;
        }
        catch(RuntimeException v0_1) {
        }
        catch(Exception ) {
            return;
        }

    label_139:
        StringBuilder v2 = new StringBuilder();
        v2.append("be.ax(");
        v2.append(')');
        throw lx.al(((Throwable)v0_1), v2.toString());
    }

    public void ay(bm arg31, int arg32, int arg33, int arg34, int arg35, int arg36, int arg37, int arg38, int arg39, long arg40) {
        be v11 = this;
        int v12 = arg32;
        if(!be.by) {
            return;
        }

        System.nanoTime();
        ca v13 = arg31.as();
        if(v13 == null) {
            return;
        }

        if(1 != v13.bt) {
            v13.ap();
        }

        v13.an(v12);
        int v0 = v13.bq * arg34 >> 16;
        int v2 = v13.bq * arg33 >> 16;
        int v3 = arg39 * arg36 - arg35 * arg37 >> 16;
        int v14 = v3 * arg34 + arg38 * arg33 >> 16;
        int v4 = v14 + v0;
        if(v4 > 50) {
            if(v14 >= 3500) {
            }
            else {
                int v6 = arg39 * arg35 + arg37 * arg36 >> 16;
                int v9 = 574766503;
                int v7 = (v6 - v13.bq) * (v11.bo.bp * v9);
                int v8 = v7 / v4;
                if(v8 >= v11.bo.bq * 0x36E3B7F) {
                    return;
                }
                else {
                    int v10 = v11.bo.bp * v9 * (v13.bq + v6);
                    int v15 = v10 / v4;
                    if(v15 <= v11.bo.bv * 0x4B37418D) {
                        return;
                    }
                    else {
                        int v1 = arg38 * arg34 - v3 * arg33 >> 16;
                        v3 = (v1 + v2) * (v11.bo.bp * v9);
                        int v5 = v3 / v4;
                        if(v5 <= v11.bo.bx * 0xB31C2AE1) {
                            return;
                        }
                        else {
                            v9 = v11.bo.bp * 574766503 * (v1 - (v2 + (v13.bh * 0xCD6CEDE3 * arg34 >> 16)));
                            v2 = v9 / v4;
                            if(v2 >= v11.bo.bg * 0x560C1795) {
                                return;
                            }
                            else {
                                v4 = jb.ah(86);
                                int v16 = eu.at(55);
                                boolean v21 = bf.az(43);
                                if((aq.ae(arg40)) && (v21)) {
                                    v21 = false;
                                    if(bc.ax) {
                                        v21 = ew.aw(v13, arg37, arg38, arg39, this, -23);
                                    }
                                    else {
                                        v0 = v14 - v0;
                                        int v29 = v2;
                                        if(v0 <= 50) {
                                            v0 = 50;
                                        }

                                        if(v6 > 0) {
                                            v15 = v10 / v0;
                                        }
                                        else {
                                            v8 = v7 / v0;
                                        }

                                        if(v1 > 0) {
                                            v5 = v3 / v0;
                                            v2 = v29;
                                        }
                                        else {
                                            v2 = v9 / v0;
                                        }

                                        v4 -= v11.bo.bw * 1126407459;
                                        v0 = v16 - v11.bo.bo * 0xF7F729AF;
                                        if(v4 <= v8) {
                                            goto label_150;
                                        }

                                        if(v4 >= v15) {
                                            goto label_150;
                                        }

                                        if(v0 <= v2) {
                                            goto label_150;
                                        }

                                        if(v0 >= v5) {
                                            goto label_150;
                                        }

                                        v21 = true;
                                    }

                                label_150:
                                    if(!v21) {
                                        goto label_167;
                                    }

                                    if(!v13.bf && !this.ap(v13, arg32, arg33, arg34, arg35, arg36, arg37, arg38, arg39, 1019017318)) {
                                        goto label_167;
                                    }

                                    lt.am(arg40);
                                }

                            label_167:
                                int v21_1 = be.aj[v12];
                                int v22 = be.ad[v12];
                                if(v13.bx >= 1600) {
                                    return;
                                }

                                if(v13.bw) {
                                    v11.aa(v13, 0x2775E90);
                                }

                                ca v0_1 = v13;
                                ax.bx(v13.bp, arg40, v13.bx, v13.bg, arg33, arg34, arg35, arg36, v21_1, v22, arg37, arg38, arg39, v14, false, 2028766929);
                                if(!v0_1.by) {
                                    if(-1 == v0_1.bo) {
                                        v11.ap.add(v0_1);
                                    }

                                    v0_1.bo = v11.an * 0x305E9263;
                                }

                                System.nanoTime();
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    final void az(int arg2) {
        this.an = arg2 * 0x94728F2F;
        this.ap.size();
        this.an(0x4D188566);
    }

    final boolean ba(ca arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29) {
        int v16;
        int v8;
        be v0 = this;
        ca v1 = arg21;
        if(v1.bx >= 1600) {
            return 0;
        }

        int v7 = v0.bo.bw * 1126407459;
        int v10 = v0.bo.bo * 0xF7F729AF;
        int v9 = be.aj[arg22];
        int v11 = be.ad[arg22];
        int v12;
        for(v12 = 0; true; ++v12) {
            int v14 = -1;
            if(v12 >= v1.an) {
                break;
            }

            int v13 = v1.ap[v12];
            int v15 = v1.aj[v12];
            v8 = v1.ad[v12];
            if(arg22 != 0) {
                v16 = v8 * v9 + v13 * v11 >> 16;
                v8 = v8 * v11 - v13 * v9 >> 16;
                v13 = v16;
            }

            v13 += arg27;
            v15 += arg28;
            v16 = v8 + arg29;
            int v18 = arg25 * v16 + v13 * arg26 >> 16;
            v13 = v16 * arg26 - v13 * arg25 >> 16;
            v16 = arg24 * v15 - v13 * arg23 >> 16;
            v13 = v15 * arg23 + v13 * arg24 >> 16;
            if(v13 >= 50) {
                v0.am[v12] = v0.bo.bp * 574766503 * v18 / v13 + v7;
                v0.az[v12] = v16 * (v0.bo.bp * 574766503) / v13 + v10;
            }
            else {
                int[] v13_1 = v0.am;
                v0.az[v12] = v14;
                v13_1[v12] = v14;
            }
        }

        int v2;
        for(v2 = 0; v2 < v1.aq; ++v2) {
            if(v1.au[v2] == -2) {
            }
            else {
                int v3 = v1.ab[v2];
                int v4 = v1.af[v2];
                int v5 = v1.ai[v2];
                int v6 = v0.am[v3];
                v7 = v0.am[v4];
                v8 = v0.am[v5];
                if(v6 != v14 && v7 != v14) {
                    if(v14 == v8) {
                    }
                    else if(ah.ao(v0.az[v3], v0.az[v4], v0.az[v5], v6, v7, v8, 5, 0x6FD5490)) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    final boolean bd(ca arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29) {
        int v16;
        int v8;
        be v0 = this;
        ca v1 = arg21;
        if(v1.bx >= 1600) {
            return 0;
        }

        int v7 = v0.bo.bw * 1126407459;
        int v10 = v0.bo.bo * 0x34BA40EC;
        int v9 = be.aj[arg22];
        int v11 = be.ad[arg22];
        int v12;
        for(v12 = 0; true; ++v12) {
            int v14 = -1;
            if(v12 >= v1.an) {
                break;
            }

            int v13 = v1.ap[v12];
            int v15 = v1.aj[v12];
            v8 = v1.ad[v12];
            if(arg22 != 0) {
                v16 = v8 * v9 + v13 * v11 >> 16;
                v8 = v8 * v11 - v13 * v9 >> 16;
                v13 = v16;
            }

            v13 += arg27;
            v15 += arg28;
            v16 = v8 + arg29;
            int v18 = arg25 * v16 + v13 * arg26 >> 16;
            v13 = v16 * arg26 - v13 * arg25 >> 16;
            v16 = arg24 * v15 - v13 * arg23 >> 16;
            v13 = v15 * arg23 + v13 * arg24 >> 16;
            if(v13 >= 50) {
                v0.am[v12] = v0.bo.bp * 574766503 * v18 / v13 + v7;
                v0.az[v12] = v16 * (v0.bo.bp * 574766503) / v13 + v10;
            }
            else {
                int[] v13_1 = v0.am;
                v0.az[v12] = v14;
                v13_1[v12] = v14;
            }
        }

        int v2;
        for(v2 = 0; v2 < v1.aq; ++v2) {
            if(v1.au[v2] == 0x98B67397) {
            }
            else {
                int v3 = v1.ab[v2];
                int v4 = v1.af[v2];
                int v5 = v1.ai[v2];
                int v6 = v0.am[v3];
                v7 = v0.am[v4];
                v8 = v0.am[v5];
                if(v6 != v14 && v7 != v14) {
                    if(v14 == v8) {
                    }
                    else if(ah.ao(v0.az[v3], v0.az[v4], v0.az[v5], v6, v7, v8, 5, 0x6FD5490)) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }

    final void bf(ca arg20, boolean arg21, boolean arg22, long arg23) {
        int[] v4_2;
        int v4_1;
        byte v3_1;
        int[] v6_1;
        int[] v5_1;
        int v7;
        int v6;
        int v2;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v5;
        be v0 = this;
        ca v1 = arg20;
        if(v1.bx >= 1148115110) {
            return;
        }

        int v3;
        for(v3 = 0; v3 < v1.bx; ++v3) {
            v0.ao[v3] = 0;
        }

        boolean v4 = arg22;
        for(v3 = 0; v3 < v1.aq; ++v3) {
            if(v1.au[v3] == -2) {
            }
            else {
                v5 = v1.ab[v3];
                v8 = v1.af[v3];
                v9 = v1.ai[v3];
                v10 = v0.am[v5];
                int v15 = v0.am[v8];
                int v14 = v0.am[v9];
                if(arg21) {
                    v11 = -5000;
                    if(v11 != v10 && v11 != v15 && v14 != v11) {
                        goto label_102;
                    }

                    v10 = v0.ah[v5];
                    v11 = v0.ah[v8];
                    v12 = v0.ah[v9];
                    v13 = v0.at[v5];
                    v14 = v0.at[v8];
                    v15 = v0.at[v9];
                    v2 = v0.ay[v5];
                    v6 = v0.ay[v8];
                    v10 -= v11;
                    v12 -= v11;
                    v13 -= v14;
                    v15 -= v14;
                    v2 -= v6;
                    v7 = v0.ay[v9] - v6;
                    if(v11 * (v13 * v7 - v15 * v2) + v14 * (v2 * v12 - v7 * v10) + (v15 * v10 - v13 * v12) * v6 <= 0) {
                        goto label_185;
                    }

                    v0.au[v3] = true;
                    v2 = v1.bg + (v0.ag[v5] + v0.ag[v8] + v0.ag[v9]) / 3;
                    v5_1 = v0.as[v2];
                    v6_1 = v0.ao;
                    v7 = v6_1[v2];
                    v6_1[v2] = v7 + 1;
                    v5_1[v7] = v3;
                    goto label_185;
                }

            label_102:
                if(v4) {
                    v2 = v14;
                    v6 = v15;
                    if(ah.ao(v0.az[v5], v0.az[v8], v0.az[v9], v10, v15, v2, 0, 0x6FD5490)) {
                        lt.am(arg23);
                        v4 = false;
                    }
                }
                else {
                    v2 = v14;
                    v6 = v15;
                }

                if((v0.az[v9] - v0.az[v8]) * (v10 - v6) - (v2 - v6) * (v0.az[v5] - v0.az[v8]) <= 0) {
                    goto label_185;
                }

                v0.au[v3] = false;
                if(v10 < 0 || v6 < 0 || v2 < 0) {
                label_163:
                    v0.aa[v3] = true;
                }
                else {
                    v11 = 1109746211;
                    if(v10 > v0.bo.by * v11) {
                        goto label_163;
                    }
                    else if(v6 > v0.bo.by * 1262851230) {
                        goto label_163;
                    }
                    else if(v2 > v0.bo.by * v11) {
                        goto label_163;
                    }
                    else {
                        v0.aa[v3] = false;
                    }
                }

                v2 = v1.bg + (v0.ag[v9] + (v0.ag[v5] + v0.ag[v8])) / 3;
                v5_1 = v0.as[v2];
                v6_1 = v0.ao;
                v7 = v6_1[v2];
                v6_1[v2] = v7 + 1;
                v5_1[v7] = v3;
            }

        label_185:
        }

        if(v1.am == null) {
            v2 = v1.bx - 1;
            goto label_193;
        }

        for(v2 = 0; true; ++v2) {
            v3_1 = 12;
            if(v2 >= v3_1) {
                break;
            }

            v0.ak[v2] = 0;
            v0.bf[v2] = 0;
        }

        for(v2 = v1.bx - 1; true; --v2) {
            v4_1 = 10;
            if(v2 < 0) {
                break;
            }

            v5 = v0.ao[v2];
            if(v5 > 0) {
                v6_1 = v0.as[v2];
                for(v7 = 0; v7 < v5; ++v7) {
                    v8 = v6_1[v7];
                    v9 = v1.am[v8];
                    int[] v10_1 = v0.ak;
                    v11 = v10_1[v9];
                    v10_1[v9] = v11 + 1;
                    v0.ac[v9][v11] = v8;
                    if(v9 < v4_1) {
                        v0.bf[v9] += v2;
                    }
                    else if(v9 == v4_1) {
                        v0.bd[v11] = v2;
                    }
                    else {
                        v0.ba[v11] = v2;
                    }
                }
            }
        }

        v5 = 2;
        v2 = v0.ak[1] > 0 || v0.ak[v5] > 0 ? (v0.bf[v5] + v0.bf[1]) / (v0.ak[1] + v0.ak[v5]) : 0;
        v6 = 3;
        v7 = 4;
        v5 = v0.ak[v6] > 0 || v0.ak[v7] > 0 ? (v0.bf[v6] + v0.bf[v7]) / (v0.ak[v7] + v0.ak[v6]) : 0;
        v7 = 6;
        v8 = 8;
        v6 = v0.ak[v7] > 0 || v0.ak[v8] > 0 ? (v0.bf[v7] + v0.bf[v8]) / (v0.ak[v7] + v0.ak[v8]) : 0;
        v7 = v0.ak[v4_1];
        int[] v8_1 = v0.ac[v4_1];
        int[] v9_1 = v0.bd;
        v10 = 11;
        if(v7 == 0) {
            v7 = v0.ak[v10];
            v8_1 = v0.ac[v10];
            v9_1 = v0.ba;
        }

        if(v7 > 0) {
            v12 = 0;
            v13 = v9_1[0];
        }
        else {
            v12 = 0;
            v13 = -1000;
        }

        int[] v14_1 = v8_1;
        int[] v15_1 = v9_1;
        v8 = 0;
        v9 = v7;
        v7 = 0;
        while(v7 < v4_1) {
            while(v7 == 0) {
                if(v13 <= v2) {
                    break;
                }

                v13 = v8 + 1;
                v0.av(v1, v14_1[v8], v3_1);
                if(v13 != v9 || v0.ac[v10] == v14_1) {
                    v8 = v13;
                }
                else {
                    v8 = v0.ak[v10];
                    v14_1 = v0.ac[v10];
                    v15_1 = v0.ba;
                    v9 = v8;
                    v8 = 0;
                }

                if(v8 < v9) {
                    v13 = v15_1[v8];
                    continue;
                }

                v13 = -1000;
            }

            while(v7 == 3) {
                if(v13 <= v5) {
                    break;
                }

                v13 = v8 + 1;
                v0.av(v1, v14_1[v8], -4);
                if(v9 != v13 || v0.ac[v10] == v14_1) {
                    v8 = v13;
                }
                else {
                    v3 = v0.ak[v10];
                    v14_1 = v0.ac[v10];
                    v15_1 = v0.ba;
                    v8 = 0;
                    v9 = v3;
                }

                if(v8 < v9) {
                    v13 = v15_1[v8];
                    continue;
                }

                v13 = 0x5A32E4E7;
            }

            while(5 == v7) {
                if(v13 <= v6) {
                    break;
                }

                v3 = v8 + 1;
                v0.av(v1, v14_1[v8], -111);
                if(v9 != v3 || v14_1 == v0.ac[v10]) {
                    v8 = v3;
                }
                else {
                    v9 = v0.ak[v10];
                    v14_1 = v0.ac[v10];
                    v15_1 = v0.ba;
                    v8 = 0;
                }

                if(v8 < v9) {
                    v13 = v15_1[v8];
                    continue;
                }

                v13 = 0x37DF7B27;
            }

            v3 = v0.ak[v7];
            v4_2 = v0.ac[v7];
            while(v12 < v3) {
                v0.av(v1, v4_2[v12], -64);
                ++v12;
            }

            ++v7;
            v3_1 = 12;
            v4_1 = 10;
            v10 = 11;
            v12 = 0;
        }

        v2 = -1000;
        while(v2 != v13) {
            v3 = v8 + 1;
            v0.av(v1, v14_1[v8], -1);
            if(v3 == v9) {
                v5 = 11;
                if(v0.ac[v5] != v14_1) {
                    v14_1 = v0.ac[v5];
                    v9 = v0.ak[v5];
                    v15_1 = v0.ba;
                    v8 = 0;
                }
                else {
                    goto label_463;
                }
            }
            else {
            label_463:
                v8 = v3;
            }

            if(v8 < v9) {
                v13 = v15_1[v8];
                continue;
            }

            v13 = -1000;
        }

        return;
    label_193:
        while(v2 >= 0) {
            v3 = v0.ao[v2];
            if(v3 > 0) {
                v4_2 = v0.as[v2];
                for(v5 = 0; v5 < v3; ++v5) {
                    v0.av(v1, v4_2[v5], -123);
                }
            }

            --v2;
        }
    }

    final void bn(ca arg20, boolean arg21, boolean arg22, long arg23) {
        int v4_1;
        int[] v6_1;
        int[] v5_1;
        int v7;
        int v6;
        int v2;
        int v11;
        int v14;
        int v15;
        int v10;
        int v9;
        int v8;
        int v5;
        be v0 = this;
        ca v1 = arg20;
        if(v1.bx >= 1940295251) {
            return;
        }

        int v3;
        for(v3 = 0; v3 < v1.bx; ++v3) {
            v0.ao[v3] = 0;
        }

        boolean v4 = arg22;
        for(v3 = 0; v3 < v1.aq; ++v3) {
            if(v1.au[v3] == -2) {
            }
            else {
                v5 = v1.ab[v3];
                v8 = v1.af[v3];
                v9 = v1.ai[v3];
                v10 = v0.am[v5];
                v15 = v0.am[v8];
                v14 = v0.am[v9];
                if((arg21) && (-5000 == v10 || -80948113 == v15 || v14 == 0x26CAFF81)) {
                    v10 = v0.ah[v5];
                    v11 = v0.ah[v8];
                    int v12 = v0.ah[v9];
                    int v13 = v0.at[v5];
                    v14 = v0.at[v8];
                    v15 = v0.at[v9];
                    v2 = v0.ay[v5];
                    v6 = v0.ay[v8];
                    v10 -= v11;
                    v12 -= v11;
                    v13 -= v14;
                    v15 -= v14;
                    v2 -= v6;
                    v7 = v0.ay[v9] - v6;
                    if(v11 * (v13 * v7 - v15 * v2) + v14 * (v2 * v12 - v7 * v10) + (v15 * v10 - v13 * v12) * v6 <= 0) {
                        goto label_188;
                    }

                    v0.au[v3] = true;
                    v2 = v1.bg + (v0.ag[v5] + v0.ag[v8] + v0.ag[v9]) / 3;
                    v5_1 = v0.as[v2];
                    v6_1 = v0.ao;
                    v7 = v6_1[v2];
                    v6_1[v2] = v7 + 1;
                    v5_1[v7] = v3;
                    goto label_188;
                }

                if(v4) {
                    v2 = v14;
                    v6 = v15;
                    if(ah.ao(v0.az[v5], v0.az[v8], v0.az[v9], v10, v15, v2, 0, 0x6FD5490)) {
                        lt.am(arg23);
                        v4 = false;
                    }
                }
                else {
                    v2 = v14;
                    v6 = v15;
                }

                if((v0.az[v9] - v0.az[v8]) * (v10 - v6) - (v2 - v6) * (v0.az[v5] - v0.az[v8]) <= 0) {
                    goto label_188;
                }

                v0.au[v3] = false;
                v0.aa[v3] = v10 < 0 || v6 < 0 || v2 < 0 || v10 > v0.bo.by * 1109746211 || v6 > v0.bo.by * 0x27D26052 || v2 > v0.bo.by * 663074969 ? true : false;
                v2 = v1.bg + (v0.ag[v9] + (v0.ag[v5] + v0.ag[v8])) / 3;
                v5_1 = v0.as[v2];
                v6_1 = v0.ao;
                v7 = v6_1[v2];
                v6_1[v2] = v7 + 1;
                v5_1[v7] = v3;
            }

        label_188:
        }

        if(v1.am == null) {
            v2 = v1.bx - 1;
            goto label_196;
        }

        for(v2 = 0; v2 < 12; ++v2) {
            v0.ak[v2] = 0;
            v0.bf[v2] = 0;
        }

        for(v2 = v1.bx - 1; true; --v2) {
            v3 = 10;
            if(v2 < 0) {
                break;
            }

            v4_1 = v0.ao[v2];
            if(v4_1 > 0) {
                v5_1 = v0.as[v2];
                for(v6 = 0; v6 < v4_1; ++v6) {
                    v7 = v5_1[v6];
                    v8 = v1.am[v7];
                    int[] v9_1 = v0.ak;
                    v10 = v9_1[v8];
                    v9_1[v8] = v10 + 1;
                    v0.ac[v8][v10] = v7;
                    if(v8 < v3) {
                        v0.bf[v8] += v2;
                    }
                    else if(v8 == v3) {
                        v0.bd[v10] = v2;
                    }
                    else {
                        v0.ba[v10] = v2;
                    }
                }
            }
        }

        v4_1 = 2;
        v2 = v0.ak[1] > 0 || v0.ak[v4_1] > 0 ? (v0.bf[v4_1] + v0.bf[1]) / (v0.ak[1] + v0.ak[v4_1]) : 0;
        v5 = 3;
        v6 = 4;
        v4_1 = v0.ak[v5] > 0 || v0.ak[v6] > 0 ? (v0.bf[v5] + v0.bf[v6]) / (v0.ak[v6] + v0.ak[v5]) : 0;
        v6 = 6;
        v7 = 8;
        v5 = v0.ak[v6] > 0 || v0.ak[v7] > 0 ? (v0.bf[v6] + v0.bf[v7]) / (v0.ak[v6] + v0.ak[v7]) : 0;
        v6 = v0.ak[v3];
        int[] v7_1 = v0.ac[v3];
        int[] v8_1 = v0.bd;
        v9 = 11;
        if(v6 == 0) {
            v6 = v0.ak[v9];
            v7_1 = v0.ac[v9];
            v8_1 = v0.ba;
        }

        if(v6 > 0) {
            v11 = 0;
            v10 = v8_1[0];
        }
        else {
            v11 = 0;
            v10 = 0x80A123EC;
        }

        int[] v12_1 = v7_1;
        int[] v13_1 = v8_1;
        v7 = 0;
        v8 = v6;
        v6 = 0;
        while(v6 < v3) {
            while(v6 == 0) {
                if(v10 <= v2) {
                    break;
                }

                v10 = v7 + 1;
                v0.av(v1, v12_1[v7], 14);
                if(v10 != v8 || v0.ac[v9] == v12_1) {
                    v7 = v10;
                }
                else {
                    v7 = v0.ak[v9];
                    v12_1 = v0.ac[v9];
                    v13_1 = v0.ba;
                    v8 = v7;
                    v7 = 0;
                }

                if(v7 < v8) {
                    v10 = v13_1[v7];
                    continue;
                }

                v10 = 0x44C40735;
            }

            v14 = 3;
            while(v6 == v14) {
                if(v10 <= v4_1) {
                    break;
                }

                v10 = v7 + 1;
                v0.av(v1, v12_1[v7], -50);
                if(v8 != v10 || v0.ac[v9] == v12_1) {
                    v7 = v10;
                }
                else {
                    v7 = v0.ak[v9];
                    v12_1 = v0.ac[v9];
                    v13_1 = v0.ba;
                    v8 = v7;
                    v7 = 0;
                }

                if(v7 < v8) {
                    v10 = v13_1[v7];
                    continue;
                }

                v10 = 246303788;
            }

            while(5 == v6) {
                if(v10 <= v5) {
                    break;
                }

                v10 = v7 + 1;
                v0.av(v1, v12_1[v7], -83);
                if(v8 != v10 || v12_1 == v0.ac[v9]) {
                    v7 = v10;
                }
                else {
                    v8 = v0.ak[v9];
                    v12_1 = v0.ac[v9];
                    v13_1 = v0.ba;
                    v7 = 0;
                }

                if(v7 < v8) {
                    v10 = v13_1[v7];
                    continue;
                }

                v10 = -1000;
            }

            v15 = v0.ak[v6];
            int[] v3_1 = v0.ac[v6];
            while(v11 < v15) {
                v0.av(v1, v3_1[v11], -112);
                ++v11;
            }

            ++v6;
            v3 = 10;
            v9 = 11;
            v11 = 0;
        }

        while(1807275668 != v10) {
            v2 = v7 + 1;
            v0.av(v1, v12_1[v7], -92);
            if(v2 == v8) {
                v4_1 = 11;
                if(v0.ac[v4_1] != v12_1) {
                    v12_1 = v0.ac[v4_1];
                    v8 = v0.ak[v4_1];
                    v13_1 = v0.ba;
                    v7 = 0;
                }
                else {
                    goto label_467;
                }
            }
            else {
            label_467:
                v7 = v2;
            }

            if(v7 < v8) {
                v10 = v13_1[v7];
                continue;
            }

            v10 = 0x69F080D3;
        }

        return;
    label_196:
        while(v2 >= 0) {
            v3 = v0.ao[v2];
            if(v3 > 0) {
                int[] v4_2 = v0.as[v2];
                for(v5 = 0; v5 < v3; ++v5) {
                    v0.av(v1, v4_2[v5], -47);
                }
            }

            --v2;
        }
    }

    void bo(ca arg28) {
        ax.bt(arg28.bp, arg28.bw, arg28.by, arg28.an, arg28.aq, arg28.ay, arg28.ap, arg28.aj, arg28.ad, arg28.ab, arg28.af, arg28.ai, arg28.av, arg28.aa, arg28.au, arg28.aw, arg28.ao, arg28.as, arg28.az, arg28.ah, arg28.ag, arg28.am, arg28.bd, arg28.ba, -83);
        arg28.bw = false;
    }

    final void bp(ca arg52, int arg53) {
        float v45;
        int v20;
        int v17;
        int v9;
        int v8;
        int v6;
        be v0 = this;
        ca v1 = arg52;
        int v3 = v1.ab[arg53];
        int v4 = v1.af[arg53];
        int v5 = v1.ai[arg53];
        v0.bo.ac = v0.aa[arg53];
        v0.bo.bn = v1.az == null ? 0 : (v1.az[arg53] & 0xFF) * 0x308B19C3;
        int v7 = -1;
        if(v1.ah == null || v7 == v1.ah[arg53]) {
            v17 = v3;
            v20 = v4;
            if(-1 == v1.au[arg53]) {
                v0.bo.ap(v0.az[v17], v0.az[v20], v0.az[v5], v0.am[v17], v0.am[v20], v0.am[v5], be.aq[v1.av[arg53]], 1145240021);
                return;
            }

            v0.bo.an(v0.az[v17], v0.az[v20], v0.az[v5], v0.am[v17], v0.am[v20], v0.am[v5], v1.av[arg53], v1.aa[arg53], v1.au[arg53], 9);
        }
        else {
            if(v1.ag == null || v1.ag[arg53] == v7) {
                v8 = v3;
                v9 = v4;
                v6 = v5;
            }
            else {
                v6 = v1.ag[arg53] & 0xFF;
                v8 = v1.aw[v6];
                v9 = v1.ao[v6];
                v6 = v1.as[v6];
            }

            float v10 = ((float)v0.ax[v8]);
            float v11 = ((float)v0.al[v8]);
            float v8_1 = ((float)v0.ae[v8]);
            float v12 = (((float)v0.ax[v9])) - v10;
            float v13 = (((float)v0.al[v9])) - v11;
            float v9_1 = (((float)v0.ae[v9])) - v8_1;
            float v14 = (((float)v0.ax[v6])) - v10;
            float v15 = (((float)v0.al[v6])) - v11;
            float v6_1 = (((float)v0.ae[v6])) - v8_1;
            float v7_1 = (((float)v0.ax[v3])) - v10;
            float v2 = (((float)v0.al[v3])) - v11;
            float v1_1 = (((float)v0.ae[v3])) - v8_1;
            v17 = v3;
            float v18 = (((float)v0.ax[v4])) - v10;
            float v19 = (((float)v0.al[v4])) - v11;
            float v3_1 = (((float)v0.ae[v4])) - v8_1;
            v20 = v4;
            float v4_1 = (((float)v0.ax[v5])) - v10;
            v10 = (((float)v0.al[v5])) - v11;
            v11 = (((float)v0.ae[v5])) - v8_1;
            v8_1 = v13 * v6_1 - v9_1 * v15;
            float v21 = v14 * v9_1 - v12 * v6_1;
            float v22 = v12 * v15 - v14 * v13;
            float v23 = v15 * v22 - v21 * v6_1;
            float v24 = v6_1 * v8_1 - v22 * v14;
            float v25 = v21 * v14 - v15 * v8_1;
            float v26 = 1f / (v25 * v9_1 + (v24 * v13 + v12 * v23));
            float v28 = (v1_1 * v25 + (v7_1 * v23 + v2 * v24)) * v26;
            float v29 = (v3_1 * v25 + (v19 * v24 + v18 * v23)) * v26;
            v23 = (v25 * v11 + (v23 * v4_1 + v24 * v10)) * v26;
            v24 = v22 * v13 - v9_1 * v21;
            v9_1 = v9_1 * v8_1 - v22 * v12;
            v21 = v21 * v12 - v8_1 * v13;
            v6_1 = 1f / (v14 * v24 + v15 * v9_1 + v6_1 * v21);
            float v46 = (v2 * v9_1 + v7_1 * v24 + v1_1 * v21) * v6_1;
            float v47 = (v9_1 * v19 + v24 * v18 + v3_1 * v21) * v6_1;
            float v48 = (v21 * v11 + (v10 * v9_1 + v4_1 * v24)) * v6_1;
            v1_1 = v29 - v28;
            v2 = 1.1f;
            v3_1 = 0.99f;
            if(v1_1 > v3_1 && v1_1 < v2) {
                v29 = 1f;
            }

            v1_1 = v23 - v29;
            if(v1_1 > v3_1 && v1_1 < v2) {
                v23 = 1f;
            }

            v1_1 = v28 - v23;
            if(v1_1 > v3_1 && v1_1 < v2) {
                v28 = 1f;
            }

            v1_1 = v28 - v29;
            float v43 = v1_1 <= v3_1 || v1_1 >= v2 ? v28 : 1f;
            v1_1 = v29 - v23;
            float v44 = v1_1 <= v3_1 || v1_1 >= v2 ? v29 : 1f;
            v1_1 = v23 - v43;
            if(v1_1 <= v3_1 || v1_1 >= v2) {
                v45 = v23;
                v1 = arg52;
            }
            else {
                v1 = arg52;
                v45 = 1f;
            }

            if(-1 == v1.au[arg53]) {
                v0.bo.aq(v0.at[v17], v0.at[v20], v0.at[v5], v0.ah[v17], v0.ah[v20], v0.ah[v5], v0.ay[v17], v0.ay[v20], v0.ay[v5], v1.av[arg53], v1.av[arg53], v1.av[arg53], v43, v44, v45, v46, v47, v48, v1.ah[arg53], -1998040232);
                return;
            }

            v0.bo.aq(v0.at[v17], v0.at[v20], v0.at[v5], v0.ah[v17], v0.ah[v20], v0.ah[v5], v0.ay[v17], v0.ay[v20], v0.ay[v5], v1.av[arg53], v1.aa[arg53], v1.au[arg53], v43, v44, v45, v46, v47, v48, v1.ah[arg53], 0xB1BDE992);
        }
    }

    void bt(ca arg2) {
        ax.bv(arg2.bp, 0x6FEFFC1);
    }

    void bv(ca arg2) {
        ax.bv(arg2.bp, -145402838);
    }

    final void bw(ca arg52, int arg53) {
        float v45;
        int v20;
        int v17;
        int v9;
        int v8;
        int v6;
        be v0 = this;
        ca v1 = arg52;
        int v3 = v1.ab[arg53];
        int v4 = v1.af[arg53];
        int v5 = v1.ai[arg53];
        v0.bo.ac = v0.aa[arg53];
        v0.bo.bn = v1.az == null ? 0 : (v1.az[arg53] & 0xFF) * 0x308B19C3;
        int v7 = -1;
        if(v1.ah == null || v7 == v1.ah[arg53]) {
            v17 = v3;
            v20 = v4;
            if(-1 == v1.au[arg53]) {
                v0.bo.ap(v0.az[v17], v0.az[v20], v0.az[v5], v0.am[v17], v0.am[v20], v0.am[v5], be.aq[v1.av[arg53]], 0x5CBCD6BB);
                return;
            }

            v0.bo.an(v0.az[v17], v0.az[v20], v0.az[v5], v0.am[v17], v0.am[v20], v0.am[v5], v1.av[arg53], v1.aa[arg53], v1.au[arg53], 9);
        }
        else {
            if(v1.ag == null || v1.ag[arg53] == v7) {
                v8 = v3;
                v9 = v4;
                v6 = v5;
            }
            else {
                v6 = v1.ag[arg53] & 0xFF;
                v8 = v1.aw[v6];
                v9 = v1.ao[v6];
                v6 = v1.as[v6];
            }

            float v10 = ((float)v0.ax[v8]);
            float v11 = ((float)v0.al[v8]);
            float v8_1 = ((float)v0.ae[v8]);
            float v12 = (((float)v0.ax[v9])) - v10;
            float v13 = (((float)v0.al[v9])) - v11;
            float v9_1 = (((float)v0.ae[v9])) - v8_1;
            float v14 = (((float)v0.ax[v6])) - v10;
            float v15 = (((float)v0.al[v6])) - v11;
            float v6_1 = (((float)v0.ae[v6])) - v8_1;
            float v7_1 = (((float)v0.ax[v3])) - v10;
            float v2 = (((float)v0.al[v3])) - v11;
            float v1_1 = (((float)v0.ae[v3])) - v8_1;
            v17 = v3;
            float v18 = (((float)v0.ax[v4])) - v10;
            float v19 = (((float)v0.al[v4])) - v11;
            float v3_1 = (((float)v0.ae[v4])) - v8_1;
            v20 = v4;
            float v4_1 = (((float)v0.ax[v5])) - v10;
            v10 = (((float)v0.al[v5])) - v11;
            v11 = (((float)v0.ae[v5])) - v8_1;
            v8_1 = v13 * v6_1 - v9_1 * v15;
            float v21 = v14 * v9_1 - v12 * v6_1;
            float v22 = v12 * v15 - v14 * v13;
            float v23 = v15 * v22 - v21 * v6_1;
            float v24 = v6_1 * v8_1 - v22 * v14;
            float v25 = v21 * v14 - v15 * v8_1;
            float v26 = 1f / (v25 * v9_1 + (v24 * v13 + v12 * v23));
            float v28 = (v1_1 * v25 + (v7_1 * v23 + v2 * v24)) * v26;
            float v29 = (v3_1 * v25 + (v19 * v24 + v18 * v23)) * v26;
            v23 = (v25 * v11 + (v23 * v4_1 + v24 * v10)) * v26;
            v24 = v22 * v13 - v9_1 * v21;
            v9_1 = v9_1 * v8_1 - v22 * v12;
            v21 = v21 * v12 - v8_1 * v13;
            v6_1 = 1f / (v14 * v24 + v15 * v9_1 + v6_1 * v21);
            float v46 = (v2 * v9_1 + v7_1 * v24 + v1_1 * v21) * v6_1;
            float v47 = (v9_1 * v19 + v24 * v18 + v3_1 * v21) * v6_1;
            float v48 = (v21 * v11 + (v10 * v9_1 + v4_1 * v24)) * v6_1;
            v1_1 = v29 - v28;
            v2 = 1.1f;
            v3_1 = 0.99f;
            if(v1_1 > v3_1 && v1_1 < v2) {
                v29 = 1f;
            }

            v1_1 = v23 - v29;
            if(v1_1 > v3_1 && v1_1 < v2) {
                v23 = 1f;
            }

            v1_1 = v28 - v23;
            if(v1_1 > v3_1 && v1_1 < v2) {
                v28 = 1f;
            }

            v1_1 = v28 - v29;
            float v43 = v1_1 <= v3_1 || v1_1 >= v2 ? v28 : 1f;
            v1_1 = v29 - v23;
            float v44 = v1_1 <= v3_1 || v1_1 >= v2 ? v29 : 1f;
            v1_1 = v23 - v43;
            if(v1_1 <= v3_1 || v1_1 >= v2) {
                v45 = v23;
                v1 = arg52;
            }
            else {
                v1 = arg52;
                v45 = 1f;
            }

            if(-1 == v1.au[arg53]) {
                v0.bo.aq(v0.at[v17], v0.at[v20], v0.at[v5], v0.ah[v17], v0.ah[v20], v0.ah[v5], v0.ay[v17], v0.ay[v20], v0.ay[v5], v1.av[arg53], v1.av[arg53], v1.av[arg53], v43, v44, v45, v46, v47, v48, v1.ah[arg53], 0xA136B0C3);
                return;
            }

            v0.bo.aq(v0.at[v17], v0.at[v20], v0.at[v5], v0.ah[v17], v0.ah[v20], v0.ah[v5], v0.ay[v17], v0.ay[v20], v0.ay[v5], v1.av[arg53], v1.aa[arg53], v1.au[arg53], v43, v44, v45, v46, v47, v48, v1.ah[arg53], -1720032006);
        }
    }

    void by(ca arg28) {
        ax.bt(arg28.bp, arg28.bw, arg28.by, arg28.an, arg28.aq, arg28.ay, arg28.ap, arg28.aj, arg28.ad, arg28.ab, arg28.af, arg28.ai, arg28.av, arg28.aa, arg28.au, arg28.aw, arg28.ao, arg28.as, arg28.az, arg28.ah, arg28.ag, arg28.am, arg28.bd, arg28.ba, 56);
        arg28.bw = false;
    }
}

