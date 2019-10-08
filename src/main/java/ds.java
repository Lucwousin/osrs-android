public class ds extends mv {
    public int ad;
    static ds ae = null;
    public static final int ai = 90;
    public int aj;
    static ds[] al;
    public int an;
    public int ap;
    int ar;
    static ko ax;
    static final int dz;
    public static he rq;

    static {
        ds.ae = new ds();
    }

    ds() {
        try {
            super();
            this.ar = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ds.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa() {
        this.ap(this.ar * 0x5EF1DD3E, 0x52F62F82);
    }

    public static void ab(ko arg4) {
        ds.ax = arg4;
        ds.al = new ds[arg4.au(1, 0xED97190F)];
        int v4;
        for(v4 = 0; v4 < ds.al.length; ++v4) {
            byte[] v0 = ds.ax.ae(1, v4, 0x78DC0DC9);
            ds.al[v4] = new ds();
            if(v0 != null) {
                ds.al[v4].ar(new lq(v0), v4, 0xFFA);
            }

            ds.al[v4].ae(0xFE38BD4A);
        }
    }

    public static void ad(ko arg4) {
        ds.ax = arg4;
        ds.al = new ds[arg4.au(1, 0xDA60A902)];
        int v4;
        for(v4 = 0; v4 < ds.al.length; ++v4) {
            byte[] v0 = ds.ax.ae(1, v4, 0x78DC0DC9);
            ds.al[v4] = new ds();
            if(v0 != null) {
                ds.al[v4].ar(new lq(v0), v4, 0x1560);
            }

            ds.al[v4].ae(0xFE38BD4A);
        }
    }

    void ae(int arg3) {
        try {
            this.ap(this.ar * 1705236089, 0x52F62F82);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ds.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static void af(ko arg4) {
        ds.ax = arg4;
        ds.al = new ds[arg4.au(1, 0x6D3057EC)];
        int v4;
        for(v4 = 0; v4 < ds.al.length; ++v4) {
            byte[] v0 = ds.ax.ae(1, v4, 0x78DC0DC9);
            ds.al[v4] = new ds();
            if(v0 != null) {
                ds.al[v4].ar(new lq(v0), v4, 0x2D99);
            }

            ds.al[v4].ae(0xFE38BD4A);
        }
    }

    void ag(lq arg1, int arg2, int arg3) {
        if(1 == arg2) {
            this.ar = arg1.ak(-1999307705) * 0x91BF4688;
        }
    }

    void ah(lq arg1, int arg2, int arg3) {
        if(1 == arg2) {
            this.ar = arg1.ak(0x450696) * 1760269123;
        }
    }

    public static ds ai(int arg1) {
        if(arg1 >= 0) {
            if(arg1 >= ds.al.length) {
            }
            else {
                return ds.al[arg1];
            }
        }

        return ds.ae;
    }

    public static void aj(ko arg4) {
        ds.ax = arg4;
        ds.al = new ds[arg4.au(1, 0x40394B6)];
        int v4;
        for(v4 = 0; v4 < ds.al.length; ++v4) {
            byte[] v1 = ds.ax.ae(1, v4, 0x78DC0DC9);
            ds.al[v4] = new ds();
            if(v1 != null) {
                ds.al[v4].ar(new lq(v1), v4, 0x5423);
            }

            ds.al[v4].ae(0xFE38BD4A);
        }
    }

    void am(lq arg3, int arg4) {
        while(true) {
            int v0 = arg3.ay(-90);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, arg4, 0xF3195FCA);
        }
    }

    void an(lq arg1, int arg2, int arg3, int arg4) {
        if(1 == arg2) {
            arg2 = -404603402;
            try {
                this.ar = arg1.ak(arg2) * 0x9D16B3C9;
            }
            catch(RuntimeException v1) {
                StringBuilder v2 = new StringBuilder();
                v2.append("ds.an(");
                v2.append(')');
                throw lx.al(((Throwable)v1), v2.toString());
            }
        }
    }

    void ap(int arg29, int arg30) {
        ds v1 = this;
        int v3 = 0xFF;
        double v6 = 256;
        double v4 = (((double)(arg29 >> 16 & v3))) / v6;
        double v8 = (((double)(arg29 >> 8 & v3))) / v6;
        double v10 = (((double)(arg29 & v3))) / v6;
        double v12 = v8 < v4 ? v8 : v4;
        if(v10 < v12) {
            v12 = v10;
        }

        double v14 = v8 > v4 ? v8 : v4;
        if(v10 > v14) {
            v14 = v10;
        }

        double v16 = v14 + v12;
        double v18 = 2;
        double v20 = v16 / v18;
        double v22 = 0;
        double v24 = 0.5;
        if(v14 != v12) {
            v16 = v20 < v24 ? (v14 - v12) / v16 : v22;
            if(v20 >= v24) {
                v16 = (v14 - v12) / (v18 - v14 - v12);
            }

            if(v14 == v4) {
                v22 = (v8 - v10) / (v14 - v12);
                goto label_66;
            }

            if(v8 == v14) {
                v22 = (v10 - v4) / (v14 - v12) + v18;
                goto label_66;
            }

            if(v10 != v14) {
                goto label_66;
            }

            v22 = (v4 - v8) / (v14 - v12) + 4;
        }
        else {
            v16 = v22;
        }

    label_66:
        v22 /= 6;
        int v0 = (((int)(v16 * v6))) * 0xD7C6C4ED;
        try {
            v1.ap = v0;
            v1.aj = (((int)(v6 * v20))) * 930519523;
            int v2 = 0x2AD638E5;
            if(v1.ap * v2 < 0) {
                v1.ap = 0;
            }
            else if(v1.ap * v2 > v3) {
                v1.ap = 0xEEFE2813;
            }

            v2 = 0x4F5173CB;
            if(v1.aj * v2 < 0) {
                v1.aj = 0;
            }
            else if(v1.aj * v2 > v3) {
                v1.aj = 1059277085;
            }

            double v2_1 = 512;
            v0 = 0xF464F7E1;
            v1.ad = v20 > v24 ? (((int)((1 - v20) * v16 * v2_1))) * v0 : (((int)(v2_1 * (v16 * v20)))) * v0;
            v3 = 0xD10D8C21;
            if(v1.ad * v3 < 1) {
                v1.ad = v0;
            }

            v1.an = (((int)((((double)(v1.ad * v3))) * v22))) * 0xCC362505;
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_2 = new StringBuilder();
            v2_2.append("ds.ap(");
            v2_2.append(')');
            throw lx.al(((Throwable)v0_1), v2_2.toString());
        }
    }

    public static void aq(ko arg4) {
        ds.ax = arg4;
        ds.al = new ds[arg4.au(1, -1093817732)];
        int v4;
        for(v4 = 0; v4 < ds.al.length; ++v4) {
            byte[] v0 = ds.ax.ae(1, v4, 0x78DC0DC9);
            ds.al[v4] = new ds();
            if(v0 != null) {
                ds.al[v4].ar(new lq(v0), v4, 0x36F0);
            }

            ds.al[v4].ae(0xFE38BD4A);
        }
    }

    void ar(lq arg2, int arg3, short arg4) {
        while(true) {
            byte v4 = -73;
            try {
                int v4_1 = arg2.ay(v4);
                if(v4_1 == 0) {
                    return;
                }

                this.an(arg2, v4_1, arg3, 0xF3195FCA);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("ds.ar(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }

    void at(int arg27) {
        ds v0 = this;
        int v3 = 0xFF;
        double v6 = 256;
        double v4 = (((double)(arg27 >> 16 & v3))) / v6;
        double v8 = (((double)(arg27 >> 8 & 0xD4B84355))) / v6;
        double v1 = (((double)(arg27 & v3))) / v6;
        double v10 = v8 < v4 ? v8 : v4;
        if(v1 < v10) {
            v10 = v1;
        }

        double v12 = v8 > v4 ? v8 : v4;
        if(v1 > v12) {
            v12 = v1;
        }

        double v14 = v12 + v10;
        double v16 = 2;
        double v18 = v14 / v16;
        double v20 = 0;
        double v22 = 0.5;
        if(v12 != v10) {
            v14 = v18 < v22 ? (v12 - v10) / v14 : v20;
            if(v18 >= v22) {
                v14 = (v12 - v10) / (v16 - v12 - v10);
            }

            if(v12 == v4) {
                v20 = (v8 - v1) / (v12 - v10);
                goto label_66;
            }

            if(v8 == v12) {
                v20 = (v1 - v4) / (v12 - v10) + v16;
                goto label_66;
            }

            if(v1 != v12) {
                goto label_66;
            }

            v20 = (v4 - v8) / (v12 - v10) + 4;
        }
        else {
            v14 = v20;
        }

    label_66:
        v20 /= 6;
        v0.ap = (((int)(v14 * v6))) * 0x2203355B;
        v0.aj = (((int)(v6 * v18))) * 0xC6DC83EE;
        if(v0.ap * 0x2AD638E5 < 0) {
            v0.ap = 0;
        }
        else if(v0.ap * 107641758 > v3) {
            v0.ap = 0xEEFE2813;
        }

        if(v0.aj * -1021630318 < 0) {
            v0.aj = 0;
        }
        else if(v0.aj * 0x4F5173CB > 0xE3D1BA2B) {
            v0.aj = 1059277085;
        }

        v1 = 512;
        v3 = 0xF464F7E1;
        v0.ad = v18 > v22 ? (((int)((1 - v18) * v14 * v1))) * v3 : (((int)(v14 * v18 * v1))) * v3;
        if(v0.ad * -662059066 < 1) {
            v0.ad = v3;
        }

        v0.an = (((int)((((double)(v0.ad * 0xD10D8C21))) * v20))) * 0xCC362505;
    }

    void au(lq arg3, int arg4) {
        while(true) {
            int v0 = arg3.ay(-21);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, arg4, 0xF3195FCA);
        }
    }

    public static ds av(int arg1) {
        if(arg1 >= 0) {
            if(arg1 >= ds.al.length) {
            }
            else {
                return ds.al[arg1];
            }
        }

        return ds.ae;
    }

    void aw(int arg28) {
        ds v0 = this;
        double v4 = 256;
        double v2 = (((double)(arg28 >> 16 & 0x8C075553))) / v4;
        double v6 = (((double)(arg28 >> 8 & 0x3665DF1B))) / v4;
        int v8 = 0xFF;
        double v9 = (((double)(arg28 & v8))) / v4;
        double v11 = v6 < v2 ? v6 : v2;
        if(v9 < v11) {
            v11 = v9;
        }

        double v13 = v6 > v2 ? v6 : v2;
        if(v9 > v13) {
            v13 = v9;
        }

        double v15 = v13 + v11;
        double v17 = 2;
        double v19 = v15 / v17;
        double v21 = 0;
        double v23 = 0.5;
        if(v13 != v11) {
            v15 = v19 < v23 ? (v13 - v11) / v15 : v21;
            if(v19 >= v23) {
                v15 = (v13 - v11) / (v17 - v13 - v11);
            }

            if(v13 == v2) {
                v21 = (v6 - v9) / (v13 - v11);
                goto label_68;
            }

            if(v6 == v13) {
                v21 = (v9 - v2) / (v13 - v11) + v17;
                goto label_68;
            }

            if(v9 != v13) {
                goto label_68;
            }

            v21 = (v2 - v6) / (v13 - v11) + 4;
        }
        else {
            v15 = v21;
        }

    label_68:
        v21 /= 6;
        v0.ap = (((int)(v15 * v4))) * 0x7322D7A9;
        v0.aj = (((int)(v4 * v19))) * 930519523;
        if(v0.ap * 0x80A8EE56 < 0) {
            v0.ap = 0;
        }
        else if(v0.ap * 0x2AD638E5 > 0x5C14906F) {
            v0.ap = 0xEEFE2813;
        }

        if(v0.aj * 0x4F5173CB < 0) {
            v0.aj = 0;
        }
        else if(v0.aj * 1739926093 > v8) {
            v0.aj = 0x906404AC;
        }

        double v1 = 512;
        int v3 = 0xF464F7E1;
        v0.ad = v19 > v23 ? (((int)((1 - v19) * v15 * v1))) * v3 : (((int)(v1 * (v15 * v19)))) * v3;
        int v2_1 = 0xD10D8C21;
        if(v0.ad * v2_1 < 1) {
            v0.ad = -1102256568;
        }

        v0.an = (((int)((((double)(v0.ad * v2_1))) * v21))) * 0x2B603637;
    }

    void ay(int arg27) {
        ds v0 = this;
        int v3 = 0xFF;
        double v6 = 256;
        double v4 = (((double)(arg27 >> 16 & v3))) / v6;
        double v8 = (((double)(arg27 >> 8 & v3))) / v6;
        double v1 = (((double)(arg27 & v3))) / v6;
        double v10 = v8 < v4 ? v8 : v4;
        if(v1 < v10) {
            v10 = v1;
        }

        double v12 = v8 > v4 ? v8 : v4;
        if(v1 > v12) {
            v12 = v1;
        }

        double v14 = v12 + v10;
        double v16 = 2;
        double v18 = v14 / v16;
        double v20 = 0;
        double v22 = 0.5;
        if(v12 != v10) {
            v14 = v18 < v22 ? (v12 - v10) / v14 : v20;
            if(v18 >= v22) {
                v14 = (v12 - v10) / (v16 - v12 - v10);
            }

            if(v12 == v4) {
                v20 = (v8 - v1) / (v12 - v10);
                goto label_65;
            }

            if(v8 == v12) {
                v20 = (v1 - v4) / (v12 - v10) + v16;
                goto label_65;
            }

            if(v1 != v12) {
                goto label_65;
            }

            v20 = (v4 - v8) / (v12 - v10) + 4;
        }
        else {
            v14 = v20;
        }

    label_65:
        v20 /= 6;
        v0.ap = (((int)(v14 * v6))) * 0xD7C6C4ED;
        v0.aj = (((int)(v6 * v18))) * 930519523;
        int v2 = 0x2AD638E5;
        if(v0.ap * v2 < 0) {
            v0.ap = 0;
        }
        else if(v0.ap * v2 > v3) {
            v0.ap = 0xEEFE2813;
        }

        v2 = 0x4F5173CB;
        if(v0.aj * v2 < 0) {
            v0.aj = 0;
        }
        else if(v0.aj * v2 > v3) {
            v0.aj = 1059277085;
        }

        v1 = 512;
        v3 = 0xF464F7E1;
        v0.ad = v18 > v22 ? (((int)((1 - v18) * v14 * v1))) * v3 : (((int)(v14 * v18 * v1))) * v3;
        v2 = 0xD10D8C21;
        if(v0.ad * v2 < 1) {
            v0.ad = v3;
        }

        v0.an = (((int)((((double)(v0.ad * v2))) * v20))) * 0xCC362505;
    }

    void az(lq arg3, int arg4) {
        while(true) {
            int v0 = arg3.ay(-72);
            if(v0 == 0) {
                return;
            }

            this.an(arg3, v0, arg4, 0xF3195FCA);
        }
    }

    static ib bp(int arg10) {
        int v7;
        int v6;
        int v2;
        int v3;
        int v1;
        try {
            ib v10_1 = new ib();
            v10_1.ax = 0x580C84F8;
            v10_1.al = 0x1F6CF4B3;
            v10_1.ae = 0x332F6AC3;
            v10_1.ar = 1305640072;
            do {
            label_10:
                v1 = 0x9BA2F453;
                int v0 = v10_1.ar * v1;
                v3 = 0xDFEB996D;
                v2 = v10_1.ae * v3;
                v6 = 0x6DE6A9AD;
                if(v10_1.ar * v1 * (v10_1.ae * v3 - 1) >= ih.ap * v6) {
                    v10_1.ae -= -1104455579;
                }

                v7 = 0x78936FDB;
                if((v10_1.ar * v1 - 1) * (v10_1.ae * v3) >= ih.ap * v6) {
                    v10_1.ar -= v7;
                }

                if(v10_1.ae * v3 * (v10_1.ar * v1 - 1) >= ih.ap * v6) {
                    v10_1.ar -= v7;
                }

                if(v10_1.ar * v1 != v0) {
                    goto label_10;
                }
            }
            while(v10_1.ae * v3 != v2);

            int v4 = -204538603;
            v10_1.an = (0x2FD - v10_1.ae * v3 * (v10_1.ax * v4)) / (v10_1.ae * v3 + 1) * 0x891273C7;
            v2 = 0x75C55DF7;
            int v5 = 5;
            if(v10_1.an * v2 > v5) {
                v10_1.an = 0xAD5C42E3;
            }

            v6 = -250202335;
            v10_1.ap = (480 - v10_1.al * v6 * (v10_1.ar * v1)) / (v10_1.ar * v1 + 1) * -1109048587;
            v7 = 0xDF01D95D;
            if(v10_1.ap * v7 > v5) {
                v10_1.ap = -1250275639;
            }

            v10_1.aj = (0x2FD - v10_1.ax * v4 * (v10_1.ae * v3) - (v10_1.ae * v3 - 1) * (v10_1.an * v2)) / 2 * 0x906913F5;
            v10_1.ad = (v10_1.aj * 0xE1ECC05D + (v10_1.ax * v4 + v10_1.an * v2) * (v10_1.ae * v3) - v10_1.an * v2) * -1856600581;
            v10_1.aq = (480 - v10_1.ar * v1 * (v10_1.al * v6) - (v10_1.ar * v1 - 1) * (v10_1.ap * v7)) / 2 * 0x377FCBE7;
            return v10_1;
        }
        catch(RuntimeException v10) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("ds.bp(");
            v0_1.append(')');
            throw lx.al(((Throwable)v10), v0_1.toString());
        }
    }

    static final void do(ie arg74, int arg75, int arg76, int arg77, int arg78, int arg79, int arg80) {
        fa v5_2;
        es v14_2;
        es v2_3;
        int v69;
        es v68;
        fa v67;
        int v70;
        de v6_3;
        int v66;
        od v34;
        od v33;
        fa v12_2;
        es v71;
        es v72;
        od v65;
        int v62;
        int v27;
        int v26;
        int v17_1;
        int v25;
        int v24;
        es v59;
        int v9_1;
        String v58;
        od v57;
        String v56;
        od v11_4;
        es v54;
        es v15_2;
        es v52;
        es v51;
        int v53;
        int v50;
        int v49;
        es v48;
        int v47;
        int v46;
        es v45;
        int v44;
        int v43;
        es v42;
        int v41;
        fa v40;
        es v7_2;
        int v39;
        int v38;
        int v37;
        es v36;
        de v14_1;
        de v3_3;
        fa v15_1;
        int v10_1;
        int v7_1;
        int v3_2;
        int v13_1;
        fa v31;
        int v16;
        int v29;
        int v14;
        int v4;
        int v15;
        int v12;
        int v6_1;
        es v13;
        es v11;
        int v23;
        int v5;
        ez v2;
        ie v0 = arg74;
        int v1 = arg75;
        try {
            fa v7 = client.al.uu.ax(0xD6884BF1);
            if(v0 != null) {
                if(!v0.ai(1525106413)) {
                }
                else {
                    byte v6 = -1;
                    if((v0 instanceof ii)) {
                        v2 = v0.ax;
                        if(v2.bp != null) {
                            v2 = v2.ad(v6);
                        }

                        if(v2 != null) {
                            goto label_21;
                        }

                        return;
                    }

                label_21:
                    v5 = ho.ap * 0x474DFE7D;
                    int[] v17 = ho.aj;
                    int v18 = -2077001153;
                    int v19 = -281200307;
                    int v20 = 0x5A2C71DD;
                    int v21 = 328034173;
                    if(v1 >= v5 || client.bj * v18 != v0.bt * -1606859309 || !hp.dz(v0, 0x4ED6834E)) {
                    label_69:
                        v23 = 0;
                    }
                    else {
                        ie v2_1 = v0;
                        if(v1 < v5) {
                            ep.dg(v0, v0.db * v19 + 15, 0x7F58A6BA);
                            client.fk.get(li.al).ai(((hw)v2_1).ax.ax(0x24AEEA8F), arg76 + client.ih * v21, client.ir * v20 + arg77 - 9, 0xFFFFFF, 0, v7);
                            v23 = 18;
                        }
                        else {
                            goto label_69;
                        }
                    }

                    int v2_2 = -2;
                    if(!v0.cb.aq()) {
                        ep.dg(v0, v0.db * v19 + 15, 1529208060);
                        mx v3 = v0.cb.an();
                        while(v3 != null) {
                            hv v10 = ((ir)v3).al(client.bj * v18, 0x291E60BD);
                            if(v10 != null) {
                                dd v3_1 = ((ir)v3).ae;
                                v11 = v3_1.ap(-1246074651);
                                v13 = v3_1.an(-64);
                                if(v11 == null || v13 == null) {
                                    v6_1 = v3_1.au * -1105110455;
                                    v12 = 0;
                                }
                                else {
                                    v6_1 = v3_1.am * -1216980822 < v13.al ? v3_1.am * -608490411 : 0;
                                    v12 = v6_1;
                                    v6_1 = v13.al - v6_1 * 2;
                                }

                                v15 = client.bj * v18 - v10.ax * 1554176203;
                                v4 = v10.ae * 0x6004A899 * v6_1 / (v3_1.au * -1105110455);
                                if(v10.ar * 0x3BF80DBD > v15) {
                                    v14 = v3_1.af * -1540270079 == 0 ? 0 : v3_1.af * -1540270079 * (v15 / (v3_1.af * -1540270079));
                                    v29 = v5;
                                    v5 = v10.al * 0x6FF1B30B * v6_1 / (v3_1.au * -1105110455);
                                    v4 = v5 + v14 * (v4 - v5) / (v10.ar * 0x3BF80DBD);
                                    goto label_188;
                                }
                                else {
                                    v29 = v5;
                                    v5 = v10.ar * 0x3BF80DBD + v3_1.ai * 0x641ED929 - v15;
                                    if(v3_1.ab * 0xD4FAC79F >= 0) {
                                        v5 = (v5 << 8) / (v3_1.ai * 0x641ED929 - v3_1.ab * 0xD4FAC79F);
                                        goto label_189;
                                    }

                                label_188:
                                    v5 = 0xFF;
                                }

                            label_189:
                                if(v10.ae * 0x6004A899 <= 0) {
                                }
                                else if(v4 < 1) {
                                    v4 = 1;
                                }

                                if(v11 != null && v13 != null) {
                                    v4 += v6_1 == v4 ? v12 * 2 : v12;
                                    v15 = v11.ae;
                                    v16 = v2_2 + v15;
                                    v2_2 = arg76 + client.ih * v21 - (v6_1 >> 1);
                                    v6_1 = client.ir * v20 + arg77 - v16;
                                    v2_2 -= v12;
                                    if(v5 < 0 || v5 >= 0xFF) {
                                        v7.am(v11, v2_2, v6_1, -807658005);
                                        v7.eo(v2_2, v6_1, v2_2 + v4, v15 + v6_1, 0xFED13F36);
                                        v7.am(v13, v2_2, v6_1, -807658005);
                                    }
                                    else {
                                        v7.bf(v11, v2_2, v6_1, v5, 0xFA33BE7B);
                                        v7.eo(v2_2, v6_1, v4 + v2_2, v6_1 + v15, 0xFED13F36);
                                        v7.bf(v13, v2_2, v6_1, v5, 1285937052);
                                    }

                                    v7.ef(arg76, arg77, arg76 + arg78, arg79 + arg77, 0xB5E37E0D);
                                    v31 = v7;
                                    v1 = v29;
                                    v2_2 = v16 + 2;
                                    goto label_334;
                                }

                                fa v11_1 = v7;
                                v13_1 = v29;
                                v2_2 += 5;
                                if(client.ih * v21 > -1) {
                                    v3_2 = arg76 + client.ih * v21 - (v6_1 >> 1);
                                    v5 = client.ir * v20 + arg77 - v2_2;
                                    v31 = v11_1;
                                    v1 = v13_1;
                                    v11_1.ar(v3_2, v5, v4, 5, 0xFF00, 2);
                                    v31.ar(v3_2 + v4, v5, v6_1 - v4, 5, 0xFF0000, 2);
                                }
                                else {
                                    v31 = v11_1;
                                    v1 = v13_1;
                                }

                                v2_2 += 2;
                            }
                            else {
                                v1 = v5;
                                v31 = v7;
                                if(!((ir)v3).ae(-1096160089)) {
                                    goto label_334;
                                }

                                ((ir)v3).lp();
                            }

                        label_334:
                            v3 = v0.cb.aj();
                            v5 = v1;
                            v7 = v31;
                        }
                    }

                    v1 = v5;
                    v31 = v7;
                    v7_1 = 1;
                    if(-2 == v2_2) {
                        v2_2 += 7;
                    }

                    v2_2 += v23;
                    v3_2 = arg75;
                    v4 = -807658005;
                    if(v3_2 < v1) {
                        ie v5_1 = v0;
                        if(((hw)v5_1).ao) {
                            return;
                        }
                        else {
                            v10_1 = -1;
                            if(v10_1 != ((hw)v5_1).ae * 351057333 || v10_1 != ((hw)v5_1).ar * 0x8EFB6DD) {
                                ep.dg(v0, v0.db * v19 + 15, 0x2BCE70FF);
                                v10_1 = -1;
                                if(client.ih * v21 > v10_1) {
                                    if(v10_1 != ((hw)v5_1).ae * 351057333) {
                                        v2_2 += 25;
                                        v15_1 = v31;
                                        v15_1.am(client.gb[((hw)v5_1).ae * 351057333], client.ih * v21 + arg76 - 12, client.ir * v20 + arg77 - v2_2, v4);
                                    }
                                    else {
                                        v15_1 = v31;
                                    }

                                    if(-1 == ((hw)v5_1).ar * 0x8EFB6DD) {
                                        goto label_418;
                                    }

                                    v2_2 += 25;
                                    v15_1.am(ap.gy[((hw)v5_1).ar * 0x8EFB6DD], client.ih * v21 + arg76 - 12, client.ir * v20 + arg77 - v2_2, v4);
                                }
                                else {
                                label_365:
                                    v15_1 = v31;
                                }
                            }
                            else {
                                goto label_365;
                            }

                        label_418:
                            if(v3_2 < 0) {
                                goto label_530;
                            }

                            if(10 != client.cx * 0x83BFA0D5) {
                                goto label_530;
                            }

                            if(client.cy * 0xD5D40779 != v17[v3_2]) {
                                goto label_530;
                            }

                            ep.dg(v0, v0.db * v19 + 15, 881809001);
                            if(client.ih * v21 <= -1) {
                                goto label_530;
                            }

                            v15_1.am(gg.gr[1], client.ih * v21 + arg76 - 12, arg77 + client.ir * v20 - (v2_2 + gg.gr[1].ae), v4);
                        }
                    }
                    else {
                        v15_1 = v31;
                        v2 = v0.ax;
                        if(v2.bp != null) {
                            v2 = v2.ad(-1);
                        }

                        if(v2.bf * 0x1C25B913 >= 0 && v2.bf * 0x1C25B913 < ap.gy.length) {
                            ep.dg(v0, v0.db * v19 + 15, 0x4B2FC279);
                            if(client.ih * v21 > -1) {
                                v15_1.am(ap.gy[v2.bf * 0x1C25B913], arg76 + client.ih * v21 - 12, client.ir * v20 + arg77 - 30, v4);
                            }
                        }

                        if(1 != client.cx * 0x83BFA0D5) {
                            goto label_530;
                        }

                        if(client.cb * 0xD7A306C3 != client.eu[v3_2 - v1]) {
                            goto label_530;
                        }

                        if(client.bj * v18 % 20 >= 10) {
                            goto label_530;
                        }

                        ep.dg(v0, v0.db * v19 + 15, 0x3E7B6809);
                        if(client.ih * v21 <= -1) {
                            goto label_530;
                        }

                        v15_1.am(gg.gr[0], arg76 + client.ih * v21 - 12, client.ir * v20 + arg77 - 28, v4);
                    }

                label_530:
                    v5 = 2;
                    if(v0.bm != null) {
                        if(v3_2 < v1) {
                            if(!v0.bu) {
                                v3_2 = 0x68730425;
                                if(4 != client.of * v3_2) {
                                    if(v0.bj) {
                                        goto label_628;
                                    }
                                    else if(client.of * v3_2 != 0 && client.of * v3_2 != 3) {
                                        if(1 != client.of * v3_2) {
                                        }
                                        else if(v0.al(0x42FF3EA7)) {
                                            goto label_557;
                                        }

                                        goto label_628;
                                    }
                                }
                            }
                            else {
                                goto label_628;
                            }
                        }

                    label_557:
                        ep.dg(v0, v0.db * v19, 0x2ED12714);
                        if(client.ih * v21 <= -1) {
                            goto label_628;
                        }

                        v2_2 = -1012582027;
                        if(client.ip * v2_2 >= client.is * -1686090423) {
                            goto label_628;
                        }

                        client.ii[client.ip * v2_2] = dq.fl.ar(v0.bm) / v5;
                        client.io[client.ip * v2_2] = dq.fl.aj;
                        client.ig[client.ip * v2_2] = client.ih * v21;
                        client.ik[client.ip * v2_2] = client.ir * v20;
                        client.iy[client.ip * v2_2] = v0.be * 0x20E6B59B;
                        client.in[client.ip * v2_2] = v0.bl * 0x1705C591;
                        client.id[client.ip * v2_2] = v0.bs * 0x1CEDE42F;
                        client.ie[client.ip * v2_2] = v0.bm;
                        client.ip += 0xFC350EDD;
                    }

                label_628:
                    v1 = 0;
                    while(true) {
                    label_629:
                        if(v1 >= 4) {
                            return;
                        }

                        v2_2 = v0.cd[v1];
                        if(v0.ca[v1] >= 0) {
                            if(v2_2 <= client.bj * v18) {
                                goto label_658;
                            }
                            else {
                                v3_3 = cp.al(v0.ca[v1], 0x9B916DE5);
                                v10_1 = 0xF76DF0BF * v3_3.aa;
                                if(v3_3 == null) {
                                    goto label_667;
                                }
                                else if(v3_3.ak != null) {
                                    v3_3 = v3_3.an(-121);
                                    if(v3_3 == null) {
                                        v0.cd[v1] = -1;
                                        goto label_658;
                                    }
                                    else {
                                        goto label_667;
                                    }
                                }
                                else {
                                    goto label_667;
                                }
                            }
                        }
                        else if(v2_2 >= 0) {
                            v3_3 = null;
                            v10_1 = 0;
                        label_667:
                            int v11_2 = v0.cf[v1];
                            if(v11_2 >= 0) {
                                de v11_3 = cp.al(v11_2, -190477332);
                                if(v11_3 != null && v11_3.ak != null) {
                                    v11_3 = v11_3.an(-115);
                                }

                                v14_1 = v11_3;
                            }
                            else {
                                v14_1 = null;
                            }

                            if(v2_2 - v10_1 > client.bj * v18) {
                                goto label_658;
                            }

                            if(v3_3 == null) {
                                v0.cd[v1] = -1;
                                goto label_658;
                            }

                            ep.dg(v0, v0.db * v19 / v5, 1504173532);
                            if(client.ih * v21 <= -1) {
                                goto label_658;
                            }

                            if(v1 == v7_1) {
                                client.ir -= 0x7E74A124;
                            }

                            if(v5 == v1) {
                                client.ih -= -2051730565;
                                client.ir -= 0xBF3A5092;
                            }

                            if(3 == v1) {
                                client.ih += -2051730565;
                                client.ir -= 0xBF3A5092;
                            }

                            v11 = v3_3.aj(0x4CCF2C74);
                            if(v11 != null) {
                                v2_2 = v11.al;
                                v10_1 = v11.ae;
                                if(v10_1 > 0) {
                                }
                                else {
                                    v10_1 = 0;
                                }

                                v12 = v11.ar;
                            }
                            else {
                                v2_2 = 0;
                                v10_1 = 0;
                                v12 = 0;
                            }

                            es v6_2 = v3_3.ad(1233570966);
                            if(v6_2 != null) {
                                v13_1 = v6_2.al;
                                v4 = v6_2.ae;
                                if(v4 > v10_1) {
                                    v10_1 = v4;
                                }

                                v16 = v6_2.ar;
                                v4 = v13_1;
                            }
                            else {
                                v4 = 0;
                                v16 = 0;
                            }

                            v13 = v3_3.aq(0x2FF95A6C);
                            if(v13 != null) {
                                v5 = v13.al;
                                v7_1 = v13.ae;
                                if(v7_1 > v10_1) {
                                    v10_1 = v7_1;
                                }

                                v7_1 = v13.ar;
                                v36 = v6_2;
                            }
                            else {
                                v36 = v6_2;
                                v5 = 0;
                                v7_1 = 0;
                            }

                            v6_2 = v3_3.ab(0x9B7E7B10);
                            if(v6_2 != null) {
                                v37 = v7_1;
                                v38 = v6_2.al;
                                v7_1 = v6_2.ae;
                                if(v7_1 > v10_1) {
                                    v10_1 = v7_1;
                                }

                                v7_1 = v6_2.ar;
                            }
                            else {
                                v37 = v7_1;
                                v7_1 = 0;
                                v38 = 0;
                            }

                            if(v14_1 != null) {
                                v39 = v7_1;
                                v7_2 = v14_1.aj(0x52D5DA31);
                                if(v7_2 != null) {
                                    v40 = v15_1;
                                    v41 = v7_2.al;
                                    v15 = v7_2.ae;
                                    if(v15 > v10_1) {
                                        v10_1 = v15;
                                    }

                                    v15 = v7_2.ar;
                                    v42 = v7_2;
                                }
                                else {
                                    v40 = v15_1;
                                    v42 = v7_2;
                                    v15 = 0;
                                    v41 = 0;
                                }

                                v7_2 = v14_1.ad(1207682008);
                                if(v7_2 != null) {
                                    v43 = v15;
                                    v44 = v7_2.al;
                                    v15 = v7_2.ae;
                                    if(v15 > v10_1) {
                                        v10_1 = v15;
                                    }

                                    v15 = v7_2.ar;
                                    v45 = v7_2;
                                }
                                else {
                                    v43 = v15;
                                    v45 = v7_2;
                                    v15 = 0;
                                    v44 = 0;
                                }

                                v7_2 = v14_1.aq(0x2FF95A6C);
                                if(v7_2 != null) {
                                    v46 = v15;
                                    v47 = v7_2.al;
                                    v15 = v7_2.ae;
                                    if(v15 > v10_1) {
                                        v10_1 = v15;
                                    }

                                    v15 = v7_2.ar;
                                    v48 = v7_2;
                                }
                                else {
                                    v46 = v15;
                                    v48 = v7_2;
                                    v15 = 0;
                                    v47 = 0;
                                }

                                v7_2 = v14_1.ab(-1950790469);
                                if(v7_2 != null) {
                                    v49 = v15;
                                    v50 = v7_2.al;
                                    v15 = v7_2.ae;
                                    if(v15 > v10_1) {
                                        v10_1 = v15;
                                    }

                                    v53 = v12;
                                    v23 = v7_2.ar;
                                    v51 = v42;
                                    v52 = v45;
                                    v15_2 = v7_2;
                                    v7_2 = v48;
                                    goto label_867;
                                }

                                v49 = v15;
                                v15_2 = v7_2;
                                v53 = v12;
                                v51 = v42;
                                v52 = v45;
                                v7_2 = v48;
                                v23 = 0;
                                v50 = 0;
                            }
                            else {
                                v39 = v7_1;
                                v40 = v15_1;
                                v53 = v12;
                                v7_2 = null;
                                v15_2 = null;
                                v23 = 0;
                                v41 = 0;
                                v43 = 0;
                                v44 = 0;
                                v46 = 0;
                                v47 = 0;
                                v49 = 0;
                                v50 = 0;
                                v51 = null;
                                v52 = null;
                            }

                        label_867:
                            od v12_1 = v3_3.af(-14);
                            if(v12_1 == null) {
                                v12_1 = fr.fy;
                            }

                            if(v14_1 != null) {
                                v54 = v11;
                                v11_4 = v14_1.af(18);
                                if(v11_4 == null) {
                                    v11_4 = fr.fy;
                                }
                            }
                            else {
                                v54 = v11;
                                v11_4 = fr.fy;
                            }

                            int v55 = v10_1;
                            String v9 = v3_3.ap(v0.cj[v1], 971580097);
                            v10_1 = v12_1.ar(v9);
                            if(v14_1 != null) {
                                v56 = v9;
                                v57 = v12_1;
                                v9 = v14_1.ap(v0.cx[v1], 971580097);
                                v12 = v11_4.ar(v9);
                            }
                            else {
                                v56 = v9;
                                v57 = v12_1;
                                v9 = null;
                                v12 = 0;
                            }

                            if(v4 > 0) {
                                if(v13 == null) {
                                    if(v6_2 != null) {
                                    }
                                    else {
                                        v58 = v9;
                                        v9_1 = 1;
                                        goto label_914;
                                    }
                                }

                                v58 = v9;
                                v9_1 = v10_1 / v4 + 1;
                            }
                            else {
                                v58 = v9;
                                v9_1 = 0;
                            }

                        label_914:
                            if(v14_1 == null || v44 <= 0) {
                                v59 = v15_2;
                                v15 = 0;
                            }
                            else {
                                if(v7_2 == null) {
                                    if(v15_2 != null) {
                                    }
                                    else {
                                        v59 = v15_2;
                                        v15 = 1;
                                        goto label_930;
                                    }
                                }

                                v59 = v15_2;
                                v15 = v12 / v44 + 1;
                            }

                        label_930:
                            v2_2 = v2_2 > 0 ? v2_2 : 0;
                            v2_2 += 2;
                            if(v5 > 0) {
                                v5 += v2_2;
                            }
                            else {
                                v5 = v2_2;
                            }

                            if(v4 > 0) {
                                v24 = v9_1 * v4;
                                v25 = v5 + v24;
                                v17_1 = v5 + (v24 - v10_1) / 2;
                            }
                            else {
                                v25 = v5 + v10_1;
                                v17_1 = v5;
                            }

                            v10_1 = v38 > 0 ? v25 + v38 : v25;
                            if(v14_1 != null) {
                                v10_1 += 2;
                                v24 = v41 > 0 ? v10_1 + v41 : v10_1;
                                v24 += 2;
                                v47 = v47 > 0 ? v24 + v47 : v24;
                                if(v44 > 0) {
                                    v26 = v15 * v44;
                                    v27 = v47 + v26;
                                    v26 = v47 + (v26 - v12) / 2;
                                }
                                else {
                                    v27 = v47 + v12;
                                    v26 = v47;
                                }

                                if(v50 > 0) {
                                    v29 = v26;
                                    v26 = v24;
                                    v24 = v10_1;
                                    v10_1 = v27 + v50;
                                    goto label_996;
                                }

                                v29 = v26;
                                v26 = v24;
                                v24 = v10_1;
                                v10_1 = v27;
                            }
                            else {
                                v24 = 0;
                                v26 = 0;
                                v27 = 0;
                                v29 = 0;
                                v47 = 0;
                            }

                        label_996:
                            v12 = v0.cd[v1] - client.bj * v18;
                            es v60 = v13;
                            int v61 = v15;
                            int v0_2 = v3_3.ah * 0x72BFBAB9 - v3_3.ah * 0x72BFBAB9 * v12 / (v3_3.aa * 0xF76DF0BF);
                            v13_1 = v3_3.at * 2008310245 * v12 / (v3_3.aa * 0xF76DF0BF) + -(v3_3.at * 2008310245);
                            v0_2 += client.ih * v21 + arg76 - (v10_1 >> 1);
                            v15 = v13_1 + (client.ir * v20 + arg77 - 12);
                            v10_1 = v15 + v55;
                            v13_1 = v15 + 15;
                            int v8 = v3_3.as * 0x64573355 + v13_1;
                            v62 = v1;
                            es v63 = v7_2;
                            od v1_1 = v57;
                            v7_1 = v8 - v1_1.ad;
                            es v64 = v6_2;
                            v6_1 = v1_1.aq + v8;
                            if(v7_1 < v15) {
                            }
                            else {
                            }

                            if(v6_1 > v10_1) {
                            }

                            if(v14_1 != null) {
                                v6_1 = v14_1.as * 0x64573355 + v13_1;
                                v65 = v1_1;
                            }
                            else {
                                v65 = v1_1;
                                v6_1 = 0;
                            }

                            v1 = v3_3.ay * -2049612081 >= 0 ? (v12 << 8) / (v3_3.aa * 0xF76DF0BF - v3_3.ay * -2049612081) : 0xFF;
                            if(v1 < 0 || v1 >= 0xFF) {
                                v66 = v6_1;
                                v33 = v11_4;
                                v6_3 = v14_1;
                                v70 = v15;
                                v67 = v40;
                                v15_2 = v51;
                                v13 = v52;
                                v14_2 = v59;
                                v7_2 = v60;
                                v1 = v61;
                                v34 = v65;
                                if(v54 != null) {
                                    v72 = v13;
                                    v71 = v15_2;
                                    v12_2 = v67;
                                    v15 = v70;
                                    v13_1 = -807658005;
                                    v12_2.am(v54, v0_2 - v53, v15, v13_1);
                                }
                                else {
                                    v72 = v13;
                                    v71 = v15_2;
                                    v12_2 = v67;
                                    v15 = v70;
                                    v13_1 = -807658005;
                                }

                                if(v7_2 != null) {
                                    v12_2.am(v7_2, v2_2 + v0_2 - v37, v15, v13_1);
                                }

                                if(v36 != null) {
                                    v2_2 = 0;
                                    while(v2_2 < v9_1) {
                                        v12_2.am(v36, v2_2 * v4 + (v0_2 + v5 - v16), v15, -807658005);
                                        ++v2_2;
                                        v36 = v36;
                                    }
                                }

                                if(v64 != null) {
                                    v12_2.am(v64, v0_2 + v25 - v39, v15, -807658005);
                                }

                                v5_2 = v12_2;
                                v2_3 = v72;
                                v13_1 = v8;
                                v7_2 = v14_2;
                                v14 = v3_3.av * 1743658069 | 0xFF000000;
                                v3_2 = v15;
                                es v8_1 = v71;
                                v34.aq(v56, v0_2 + v17_1, v13_1, v14, 0, v5_2);
                                if(v6_3 == null) {
                                    goto label_1225;
                                }

                                if(v8_1 != null) {
                                    v9_1 = -807658005;
                                    v5_2.am(v8_1, v24 + v0_2 - v43, v3_2, v9_1);
                                }
                                else {
                                    v9_1 = -807658005;
                                }

                                if(v63 != null) {
                                    v5_2.am(v63, v26 + v0_2 - v49, v3_2, v9_1);
                                }

                                if(v2_3 != null) {
                                    for(v4 = 0; v4 < v1; ++v4) {
                                        v5_2.am(v2_3, v47 + v0_2 - v46 + v4 * v44, v3_2, -807658005);
                                    }
                                }

                                if(v7_2 != null) {
                                    v5_2.am(v7_2, v27 + v0_2 - v23, v3_2, -807658005);
                                }
                                else {
                                }

                                v33.aq(v58, v0_2 + v29, v66, v6_3.av * 1743658069 | 0xFF000000, 0, v5_2);
                                goto label_1341;
                            }
                            else {
                                if(v54 != null) {
                                    v33 = v11_4;
                                    v34 = v65;
                                    v7_2 = v60;
                                    v66 = v6_1;
                                    v6_3 = v14_1;
                                    v70 = v15;
                                    v67 = v40;
                                    v68 = v59;
                                    v69 = v61;
                                    v40.bf(v54, v0_2 - v53, v15, v1, 0x38565C53);
                                }
                                else {
                                    v66 = v6_1;
                                    v33 = v11_4;
                                    v6_3 = v14_1;
                                    v70 = v15;
                                    v67 = v40;
                                    v68 = v59;
                                    v7_2 = v60;
                                    v69 = v61;
                                    v34 = v65;
                                }

                                if(v7_2 != null) {
                                    v67.bf(v7_2, v2_2 + v0_2 - v37, v70, v1, 0x324F29BD);
                                }

                                if(v36 != null) {
                                    for(v2_2 = 0; v2_2 < v9_1; ++v2_2) {
                                        v67.bf(v36, v2_2 * v4 + (v0_2 + v5 - v16), v70, v1, 0xF5512803);
                                    }
                                }

                                if(v64 != null) {
                                    v67.bf(v64, v25 + v0_2 - v39, v70, v1, 0x4BA1F412);
                                }

                                v34.ab(v56, v0_2 + v17_1, v8, v3_3.av * 1743658069, 0, v1, v67);
                                if(v6_3 != null) {
                                    v15_2 = v51;
                                    if(v15_2 != null) {
                                        v67.bf(v15_2, v0_2 + v24 - v43, v70, v1, 0x60086BF5);
                                    }

                                    if(v63 != null) {
                                        v67.bf(v63, v0_2 + v26 - v49, v70, v1, -149237050);
                                    }

                                    v2_3 = v52;
                                    if(v2_3 != null) {
                                        v3_2 = v69;
                                        for(v4 = 0; v4 < v3_2; ++v4) {
                                            v67.bf(v2_3, v47 + v0_2 - v46 + v44 * v4, v70, v1, 0x41665A00);
                                        }
                                    }

                                    v14_2 = v68;
                                    if(v14_2 != null) {
                                        v67.bf(v14_2, v0_2 + v27 - v23, v70, v1, 0x5CF3CEC7);
                                    }

                                    v33.ab(v58, v29 + v0_2, v66, v6_3.av * 1743658069, 0, v1, v67);
                                }

                                v5_2 = v67;
                            }

                        label_1225:
                        }
                        else {
                        label_658:
                            v62 = v1;
                            v5_2 = v15_1;
                        }

                        goto label_1341;
                    }
                }
            }

            return;
        }
        catch(RuntimeException v0_1) {
            goto label_1352;
        }

    label_1341:
        v1 = v62 + 1;
        v15_1 = v5_2;
        v0 = arg74;
        v5 = 2;
        v7_1 = 1;
        goto label_629;
        return;
    label_1352:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("ds.do(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0_1), v1_2.toString());
    }
}

