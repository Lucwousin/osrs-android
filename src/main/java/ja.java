public class ja {
    int aa;
    static final String ad = "Unable to connect to server";
    static final float ae = 1.520875f;
    ef[] ag;
    ef ah;
    static final int al = 503;
    int am;
    static final String an = "Old School RuneScape has encountered a problem";
    static final String ap = "Your client needs updating. Opening store page...";
    public static final String aq = "gcu1M3";
    static final int as = 11;
    ef at;
    String au;
    int aw;
    static final int ax = 0x2FD;
    long ay;
    int az;

    ja() {
        try {
            super();
            this.ay = 0x5529B562B86C0085L;
            this.aw = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ja.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    void aa(int arg2) {
        this.aa = arg2 * 0x993F9B21;
    }

    void ab(od arg8, eb arg9, float arg10, int arg11) {
        arg11 = 0x8056068B;
        try {
            fa v11 = arg9.ax(arg11);
            v11.al(-45);
            this.af(arg10, -56);
            this.ar(v11, 0x99B53309);
            arg8.ai("Your client needs updating. Opening store page...", this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8, -1, 0, arg9.ax(0x9A8D9C03));
            arg9.aj(0, 0, 0x291CBA09);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("ja.ab(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    void ac(mu arg10, od arg11, eb arg12, float arg13) {
        if(arg10 == null) {
            return;
        }

        if(this.au == null) {
            switch(arg10.ab * 0xD421A48F) {
                case 0: 
                case 2: 
                case 3: 
                case 6: {
                    goto label_17;
                }
                case 7: {
                    goto label_14;
                }
                case 8: {
                    goto label_11;
                }
            }

            this.au = "Error loading application";
            goto label_26;
        label_17:
            String v10 = 3 == this.aa * 0xEAEBA8E1 ? "Unable to connect to server" : "Unable to download content";
            this.au = v10;
            goto label_26;
        label_11:
            this.au = "Application crashed";
            goto label_26;
        label_14:
            this.au = "Your client needs updating. Opening store page...";
        }

    label_26:
        fa v10_1 = arg12.ax(-300846825);
        v10_1.al(-47);
        this.af(arg13, -21);
        this.ar(v10_1, 0x99B53309);
        arg11.ai("Old School RuneScape has encountered a problem", this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 - 20, -1, 0, v10_1);
        arg11.ai(this.au, this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 + 20, -1, 0, v10_1);
        arg12.aj(0, 0, 0x2121BB5F);
    }

    void ad(int arg8, od arg9, eb arg10, float arg11, int arg12) {
        try {
            this.aq("Failed to contact server. Please check your Internet connection.", arg8, arg9, arg10, arg11, 0xD79826FA);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("ja.ad(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    void ae(int arg7, String arg8, od arg9, float arg10, eb arg11, int arg12) {
        arg12 = 0x8577A03F;
        try {
            fa v4 = arg11.ax(arg12);
            v4.al(8);
            if(this.ag != null && this.ah != null) {
                if(this.at == null) {
                }
                else {
                    this.af(arg10, -14);
                    this.ar(v4, 0x99B53309);
                    this.an(arg7, arg8, arg9, v4, 0x7F06B6AF);
                    arg11.aj(0, 0, 1658170961);
                    return;
                }
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("ja.ae(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    void af(float arg3, byte arg4) {
        int v4 = 0x2FD;
        int v0 = 503;
        if(arg3 > 1.520875f) {
            v4 = ((int)(arg3 * 503f));
        }
        else if(arg3 > 0f) {
            v0 = ((int)(765f / arg3));
        }

        v4 *= 0x2F6DFD17;
        try {
            this.am = v4;
            this.az = v0 * 0xB1C88A1;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4_1 = new StringBuilder();
            v4_1.append("ja.af(");
            v4_1.append(')');
            throw lx.al(((Throwable)v3), v4_1.toString());
        }
    }

    void ag(ef[] arg1, ef arg2, ef arg3) {
        this.ag = arg1;
        this.ah = arg2;
        this.at = arg3;
    }

    void ah(int arg8, String arg9, od arg10, float arg11, eb arg12) {
        fa v5 = arg12.ax(-420508038);
        v5.al(-81);
        if(this.ag != null && this.ah != null) {
            if(this.at == null) {
            }
            else {
                this.af(arg11, -47);
                this.ar(v5, 0x99B53309);
                this.an(arg8, arg9, arg10, v5, 0x7A96BD03);
                arg12.aj(0, 0, 0x68CB51E1);
                return;
            }
        }
    }

    boolean ai(int arg3) {
        try {
            if(this.ag == null) {
                return false;
            }
            else if(this.aw * 0x7FE393F9 < this.ag.length) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ja.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    void aj(int arg8, od arg9, eb arg10, float arg11, int arg12) {
        try {
            this.aq("No Internet connection available. Please check your settings.", arg8, arg9, arg10, arg11, 0xE38832F4);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("ja.aj(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    void ak(mu arg10, od arg11, eb arg12, float arg13) {
        if(arg10 == null) {
            return;
        }

        if(this.au == null) {
            switch(arg10.ab * 0xFA07A709) {
                case 0: 
                case 2: 
                case 3: 
                case 6: {
                    goto label_17;
                }
                case 7: {
                    goto label_14;
                }
                case 8: {
                    goto label_11;
                }
            }

            this.au = "Error loading application";
            goto label_26;
        label_17:
            String v10 = 3 == this.aa * 1849081040 ? "Unable to connect to server" : "Unable to download content";
            this.au = v10;
            goto label_26;
        label_11:
            this.au = "Application crashed";
            goto label_26;
        label_14:
            this.au = "Your client needs updating. Opening store page...";
        }

    label_26:
        fa v10_1 = arg12.ax(0x74EE48C5);
        v10_1.al(9);
        this.af(arg13, -98);
        this.ar(v10_1, 0x99B53309);
        arg11.ai("Old School RuneScape has encountered a problem", this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 - 20, -1, 0, v10_1);
        arg11.ai(this.au, this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 + 20, -1, 0, v10_1);
        arg12.aj(0, 0, 579548803);
    }

    void al(ef[] arg1, ef arg2, ef arg3, int arg4) {
        try {
            this.ag = arg1;
            this.ah = arg2;
            this.at = arg3;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ja.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    void am(ef[] arg1, ef arg2, ef arg3) {
        this.ag = arg1;
        this.ah = arg2;
        this.at = arg3;
    }

    void an(int arg20, String arg21, od arg22, fa arg23, int arg24) {
        ja v1 = this;
        try {
            int v0_1 = v1.az * 0x463F5B61 / 16;
            int v10 = v1.ah.ae * v0_1 / v1.ah.ar;
            int v11 = v1.az * 0x9137A3ED / 16;
            int v15 = v0_1 / 2 + v11 + 5;
            int v12 = 0x13AB0AA7;
            int v13 = (v1.am * v12 - v10) / 2;
            int v14 = (arg20 * 90 / 100 + 5) * v10 / 100 + v13;
            arg23.ef(0, 0, v14, v1.az * 0x463F5B61, 782662086);
            arg23.aw(v1.at, v13, v11, v10, v0_1, 53);
            arg23.ef(v14, 0, v1.am * v12, v1.az * 0x463F5B61, 0xCAB196D0);
            arg23.aw(v1.at, v14 - v10 * 0x5F / 100, v11, v10, v0_1, 23);
            arg23.ep(0xD9CC4AFD);
            arg23.aw(v1.ah, v13, v11, v10, v0_1, 12);
            if(arg22 != null) {
                arg22.ai(arg21, v1.am * v12 / 2, v15, 0xFF808080, 0, arg23);
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ja.an(");
            v2.append(')');
            throw lx.al(((Throwable)v0), v2.toString());
        }
    }

    void ao(int arg20, String arg21, od arg22, fa arg23) {
        ja v0 = this;
        int v1 = v0.az * 0x463F5B61 / 16;
        int v10 = v0.ah.ae * v1 / v0.ah.ar;
        int v11 = v0.az * 0x9137A3ED / 16;
        int v15 = v1 / 2 + v11 + 5;
        int v12 = 0x13AB0AA7;
        int v13 = (v0.am * v12 - v10) / 2;
        int v14 = (arg20 * 90 / 100 + 5) * v10 / 100 + v13;
        arg23.ef(0, 0, v14, v0.az * 0x463F5B61, 0xA925C608);
        arg23.aw(v0.at, v13, v11, v10, v1, 23);
        arg23.ef(v14, 0, v0.am * v12, v0.az * 0x463F5B61, 0x1B48CB0A);
        arg23.aw(v0.at, v14 - v10 * 0x5F / 100, v11, v10, v1, 0x4F);
        arg23.ep(0xD9CC4AFD);
        arg23.aw(v0.ah, v13, v11, v10, v1, -4);
        if(arg22 != null) {
            arg22.ai(arg21, v0.am * v12 / 2, v15, 0xFF808080, 0, arg23);
        }
    }

    void ap(mu arg9, od arg10, eb arg11, float arg12, int arg13) {
        if(arg9 == null) {
            return;
        }

        try {
            if(this.au == null) {
                switch(arg9.ab * 0xD421A48F) {
                    case 0: 
                    case 2: 
                    case 3: 
                    case 6: {
                        goto label_16;
                    }
                    case 7: {
                        goto label_13;
                    }
                    case 8: {
                        goto label_10;
                    }
                }

                String v9_1 = "Error loading application";
                goto label_24;
            label_10:
                this.au = "Application crashed";
                goto label_25;
            label_13:
                this.au = "Your client needs updating. Opening store page...";
                goto label_25;
            label_16:
                if(3 == this.aa * 0xEAEBA8E1) {
                    v9_1 = "Unable to connect to server";
                    goto label_24;
                }
                else {
                    v9_1 = "Unable to download content";
                label_24:
                    this.au = v9_1;
                }
            }

        label_25:
            fa v9_2 = arg11.ax(0x992BC508);
            v9_2.al(-78);
            this.af(arg12, -57);
            this.ar(v9_2, 0x99B53309);
            arg10.ai("Old School RuneScape has encountered a problem", this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 - 20, -1, 0, v9_2);
            arg10.ai(this.au, this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 + 20, -1, 0, v9_2);
            arg11.aj(0, 0, 1938981100);
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("ja.ap(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    void aq(String arg14, int arg15, od arg16, eb arg17, float arg18, int arg19) {
        ja v1 = this;
        eb v0 = arg17;
        int v2 = 0x988B63F9;
        try {
            fa v2_1 = v0.ax(v2);
            v2_1.al(0x1F);
            this.af(arg18, -79);
            this.ar(v2_1, 0x99B53309);
            arg16.ai(arg14, v1.am * 0x13AB0AA7 / 2, v1.az * -340033625 / 8 - 20, -1, 0, v2_1);
            arg16.ai(String.format("Automatically retrying in %s...", Integer.valueOf(arg15)), v1.am * 0x13AB0AA7 / 2, v1.az * -340033625 / 8 + 20, -1, 0, v2_1);
            v0.aj(0, 0, 0x2F3FB86A);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v2_2 = new StringBuilder();
            v2_2.append("ja.aq(");
            v2_2.append(')');
            throw lx.al(((Throwable)v0_1), v2_2.toString());
        }
    }

    void ar(fa arg11, int arg12) {
        int v7;
        int v6_1;
        try {
            if(this.ag == null) {
                return;
            }

            long v0 = ji.ax(0x2076E2C1);
            long v6 = -8229902148270815309L;
            long v8 = -6136635402874519685L;
            if(-1 == this.ay * v6) {
                this.ay = v0 * v8;
            }

            if(v0 - this.ay * v6 >= 33) {
                this.ay = v0 * v8;
                this.aw += 0x2488BE49;
            }

            arg12 = this.ag.length - 11;
            int v1 = this.aw * 0x7FE393F9;
            if(v1 >= arg12) {
                v1 = (v1 - arg12) % 86 + arg12;
                if(v1 >= this.ag.length) {
                    v1 = this.ag.length - 1;
                }
            }

            ef v3 = this.ag[v1];
            v1 = 0xD2BE1223;
            arg12 = this.az * v1 / 4;
            int v2 = v3.ae * arg12 / v3.ar;
            if(arg12 > v3.ar) {
                arg12 /= v3.ar;
                v2 = v3.ar * arg12;
                v6_1 = arg12 * v3.ae;
                v7 = v2;
            }
            else {
                v7 = arg12;
                v6_1 = v2;
            }

            int v4 = (this.am * 0x13AB0AA7 - v6_1) / 2;
            int v5 = (this.az * v1 / 4 - v7) / 2 + 10;
            if(v7 == v3.ar) {
                arg11.ag(v3, v4, v5, 1);
            }
            else {
                arg11.aw(v3, v4, v5, v6_1, v7, 73);
            }
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("ja.ar(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    void as(int arg20, String arg21, od arg22, fa arg23) {
        ja v0 = this;
        int v1 = v0.az * 0x463F5B61 / 16;
        int v10 = v0.ah.ae * v1 / v0.ah.ar;
        int v11 = v0.az * 0x9137A3ED / 16;
        int v15 = v1 / 2 + v11 + 5;
        int v12 = 0x13AB0AA7;
        int v13 = (v0.am * v12 - v10) / 2;
        int v14 = (arg20 * 90 / 100 + 5) * v10 / 100 + v13;
        arg23.ef(0, 0, v14, v0.az * 0x463F5B61, 0x4989B5F8);
        arg23.aw(v0.at, v13, v11, v10, v1, 36);
        arg23.ef(v14, 0, v0.am * v12, v0.az * 0x463F5B61, 1029391921);
        arg23.aw(v0.at, v14 - v10 * 0x5F / 100, v11, v10, v1, -20);
        arg23.ep(0xD9CC4AFD);
        arg23.aw(v0.ah, v13, v11, v10, v1, -41);
        if(arg22 != null) {
            arg22.ai(arg21, v0.am * v12 / 2, v15, 0xFF808080, 0, arg23);
        }
    }

    void at(int arg8, String arg9, od arg10, float arg11, eb arg12) {
        fa v5 = arg12.ax(0x69E14A29);
        v5.al(-38);
        if(this.ag != null && this.ah != null) {
            if(this.at == null) {
            }
            else {
                this.af(arg11, -71);
                this.ar(v5, 0x99B53309);
                this.an(arg8, arg9, arg10, v5, 0x7CCF6F36);
                arg12.aj(0, 0, 1620397070);
                return;
            }
        }
    }

    void au(int arg2) {
        this.aa = arg2 * 0x993F9B21;
    }

    void av(byte arg3) {
        ef[] v3 = null;
        try {
            this.ag = v3;
            this.ah = ((ef)v3);
            this.at = ((ef)v3);
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ja.av(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    void aw(fa arg11) {
        int v8_1;
        int v7;
        if(this.ag == null) {
            return;
        }

        long v0 = ji.ax(0x2076E2C1);
        long v6 = -8229902148270815309L;
        long v8 = -6136635402874519685L;
        if(-1 == this.ay * v6) {
            this.ay = v0 * v8;
        }

        if(v0 - this.ay * v6 >= 33) {
            this.ay = v0 * v8;
            this.aw += 0x2488BE49;
        }

        int v0_1 = this.ag.length - 11;
        int v2 = this.aw * 0x7FE393F9;
        if(v2 >= v0_1) {
            v2 = (v2 - v0_1) % 86 + v0_1;
            if(v2 >= this.ag.length) {
                v2 = this.ag.length - 1;
            }
        }

        ef v4 = this.ag[v2];
        v2 = 0xD2BE1223;
        v0_1 = this.az * v2 / 4;
        int v3 = v4.ae * v0_1 / v4.ar;
        if(v0_1 > v4.ar) {
            v0_1 /= v4.ar;
            v3 = v4.ar * v0_1;
            v7 = v0_1 * v4.ae;
            v8_1 = v3;
        }
        else {
            v8_1 = v0_1;
            v7 = v3;
        }

        int v5 = (this.am * 0x13AB0AA7 - v7) / 2;
        int v6_1 = (this.az * v2 / 4 - v8_1) / 2 + 10;
        if(v8_1 == v4.ar) {
            arg11.ag(v4, v5, v6_1, 1);
        }
        else {
            arg11.aw(v4, v5, v6_1, v7, v8_1, 84);
        }
    }

    void ax(int arg2, int arg3) {
        arg2 *= 0x993F9B21;
        try {
            this.aa = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ja.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void ay(int arg8, String arg9, od arg10, float arg11, eb arg12) {
        fa v5 = arg12.ax(0xA0ABFD56);
        v5.al(-26);
        if(this.ag != null && this.ah != null) {
            if(this.at == null) {
            }
            else {
                this.af(arg11, -123);
                this.ar(v5, 0x99B53309);
                this.an(arg8, arg9, arg10, v5, 0x7EED32F9);
                arg12.aj(0, 0, 2075301223);
                return;
            }
        }
    }

    void az(ef[] arg1, ef arg2, ef arg3) {
        this.ag = arg1;
        this.ah = arg2;
        this.at = arg3;
    }

    void ba(mu arg10, od arg11, eb arg12, float arg13) {
        if(arg10 == null) {
            return;
        }

        if(this.au == null) {
            switch(arg10.ab * 0xD421A48F) {
                case 0: 
                case 2: 
                case 3: 
                case 6: {
                    goto label_17;
                }
                case 7: {
                    goto label_14;
                }
                case 8: {
                    goto label_11;
                }
            }

            this.au = "Error loading application";
            goto label_26;
        label_17:
            String v10 = 3 == this.aa * 0xEAEBA8E1 ? "Unable to connect to server" : "Unable to download content";
            this.au = v10;
            goto label_26;
        label_11:
            this.au = "Application crashed";
            goto label_26;
        label_14:
            this.au = "Your client needs updating. Opening store page...";
        }

    label_26:
        fa v10_1 = arg12.ax(0x35FC43C0);
        v10_1.al(-34);
        this.af(arg13, -109);
        this.ar(v10_1, 0x99B53309);
        arg11.ai("Old School RuneScape has encountered a problem", this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 - 20, -1, 0, v10_1);
        arg11.ai(this.au, this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 + 20, -1, 0, v10_1);
        arg12.aj(0, 0, 0x504A47A8);
    }

    void bb() {
        this.ag = null;
        this.ah = null;
        this.at = null;
    }

    void bc() {
        this.ag = null;
        this.ah = null;
        this.at = null;
    }

    void bd(mu arg8, od arg9, eb arg10, float arg11) {
        if(arg8 == null) {
            return;
        }

        if(this.au == null) {
            switch(arg8.ab * 0xCDFD7F5B) {
                case 0: 
                case 2: 
                case 3: 
                case 6: {
                    goto label_17;
                }
                case 7: {
                    goto label_14;
                }
                case 8: {
                    goto label_11;
                }
            }

            this.au = "Error loading application";
            goto label_26;
        label_17:
            String v8 = 3 == this.aa * 0xF50547F6 ? "Unable to connect to server" : "Unable to download content";
            this.au = v8;
            goto label_26;
        label_11:
            this.au = "Application crashed";
            goto label_26;
        label_14:
            this.au = "Your client needs updating. Opening store page...";
        }

    label_26:
        fa v8_1 = arg10.ax(0x26B8A2D5);
        v8_1.al(45);
        this.af(arg11, -31);
        this.ar(v8_1, 0x99B53309);
        arg9.ai("Old School RuneScape has encountered a problem", this.am * 0x2BC7CB26 / 2, this.az * 0x7F893F49 / 8 - 20, -1, 0, v8_1);
        arg9.ai(this.au, this.am * 0x2CC5D620 / 2, this.az * -693402759 / 8 + 20, -1, 0, v8_1);
        arg10.aj(0, 0, 0x300366CD);
    }

    void bf(int arg8, od arg9, eb arg10, float arg11) {
        this.aq("No Internet connection available. Please check your settings.", arg8, arg9, arg10, arg11, -1182534040);
    }

    void bg(float arg4) {
        int v0 = 503;
        int v2 = 0x2FD;
        if(arg4 > 1.520875f) {
            v2 = ((int)(arg4 * 503f));
        }
        else if(arg4 > 0f) {
            v0 = ((int)(765f / arg4));
        }

        this.am = v2 * 0x2F6DFD17;
        this.az = v0 * 0xB1C88A1;
    }

    void bh() {
        this.ag = null;
        this.ah = null;
        this.at = null;
    }

    void bk() {
        this.ag = null;
        this.ah = null;
        this.at = null;
    }

    void bn(int arg8, od arg9, eb arg10, float arg11) {
        this.aq("Failed to contact server. Please check your Internet connection.", arg8, arg9, arg10, arg11, 0xB301E857);
    }

    void bo(String arg14, int arg15, od arg16, eb arg17, float arg18) {
        fa v2 = arg17.ax(0xD95B5D05);
        v2.al(-34);
        this.af(arg18, -35);
        this.ar(v2, 0x99B53309);
        arg16.ai(arg14, this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 - 20, -1, 0, v2);
        arg16.ai(String.format("Automatically retrying in %s...", Integer.valueOf(arg15)), this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 + 20, -1, 0, v2);
        arg17.aj(0, 0, 0x56CD1FCD);
    }

    void bp(int arg8, od arg9, eb arg10, float arg11) {
        this.aq("Failed to contact server. Please check your Internet connection.", arg8, arg9, arg10, arg11, 0xCEFB8133);
    }

    void bq(od arg9, eb arg10, float arg11) {
        fa v0 = arg10.ax(0x30FDB9E);
        v0.al(-51);
        this.af(arg11, -6);
        this.ar(v0, 0x99B53309);
        arg9.ai("Your client needs updating. Opening store page...", this.am * 0x13AB0AA7 / 2, this.az * 1205424802 / 8, -1, 0, arg10.ax(-1460488508));
        arg10.aj(0, 0, 0x2037D1F7);
    }

    void bt(String arg14, int arg15, od arg16, eb arg17, float arg18) {
        fa v2 = arg17.ax(0x7F8CBFC2);
        v2.al(40);
        this.af(arg18, -65);
        this.ar(v2, 0x99B53309);
        arg16.ai(arg14, this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 - 20, -1, 0, v2);
        arg16.ai(String.format("Automatically retrying in %s...", Integer.valueOf(arg15)), this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 + 20, -1, 0, v2);
        arg17.aj(0, 0, 653015996);
    }

    void bv(od arg9, eb arg10, float arg11) {
        fa v0 = arg10.ax(0x47BD1063);
        v0.al(1);
        this.af(arg11, -111);
        this.ar(v0, 0x99B53309);
        arg9.ai("Your client needs updating. Opening store page...", this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8, -1, 0, arg10.ax(0x28A3324D));
        arg10.aj(0, 0, 1170053204);
    }

    void bw(int arg8, od arg9, eb arg10, float arg11) {
        this.aq("Failed to contact server. Please check your Internet connection.", arg8, arg9, arg10, arg11, 0xBD01495D);
    }

    void bx(float arg4) {
        int v0 = -327408781;
        int v2 = 0x2FD;
        if(arg4 > 1.520875f) {
            v2 = ((int)(arg4 * 503f));
        }
        else if(arg4 > 0f) {
            v0 = ((int)(765f / arg4));
        }

        this.am = v2 * -2069907737;
        this.az = v0 * 1809023014;
    }

    void by(String arg14, int arg15, od arg16, eb arg17, float arg18) {
        fa v2 = arg17.ax(-338287890);
        v2.al(-100);
        this.af(arg18, -92);
        this.ar(v2, 0x99B53309);
        arg16.ai(arg14, this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 - 20, -1, 0, v2);
        arg16.ai(String.format("Automatically retrying in %s...", Integer.valueOf(arg15)), this.am * 0x13AB0AA7 / 2, this.az * -340033625 / 8 + 20, -1, 0, v2);
        arg17.aj(0, 0, 0x63687B8C);
    }

    boolean bz() {
        boolean v0 = this.ag == null || this.aw * 0x7FE393F9 < this.ag.length ? false : true;
        return v0;
    }
}

