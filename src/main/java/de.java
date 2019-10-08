import java.util.Collection;

public class de extends mv {
    public int aa;
    static final int ab = 0xFFFFFF;
    int ac;
    static ko ae = null;
    static final int af = 70;
    int ag;
    public int ah;
    int ai;
    public int[] ak;
    static ko al = null;
    int am;
    static gk an = null;
    public int ao;
    static gk ap = null;
    static gk ar = null;
    public int as;
    public int at;
    int au;
    public int av;
    String aw;
    static ko ax = null;
    public int ay;
    int az;
    int bd;
    static final int db = 5;

    static {
        de.ar = new gk(0x40, null);
        de.an = new gk(0x40, null);
        de.ap = new gk(20, null);
    }

    de() {
        try {
            super();
            this.ai = -397004733;
            this.av = 0x2C09FF03;
            this.aa = 0xD8D0CB3A;
            this.au = 0xF0646A95;
            this.am = 0xA70F8899;
            this.az = 0x3410BB7F;
            this.ag = 55480855;
            this.ah = 0;
            this.at = 0;
            this.ay = 0x9A6C1FD1;
            this.aw = "";
            this.ao = 0xB6D96D0D;
            this.as = 0;
            this.ac = 0x454EAC0F;
            this.bd = 0x78FCFFDD;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("de.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void aa(ko arg0, ko arg1, ko arg2) {
        de.ax = arg0;
        de.al = arg1;
        de.ae = arg2;
    }

    public es ab(int arg5) {
        es v5_2;
        try {
            int v0 = -1545979303;
            if(this.ag * v0 < 0) {
                return null;
            }

            mv v5_1 = de.an.ax(((long)(this.ag * v0)));
            if(v5_1 != null) {
                return ((es)v5_1);
            }

            v5_2 = ah.ap(de.al, this.ag * v0, 0, -1565303959);
            if(v5_2 != null) {
                de.an.ae(((mv)v5_2), ((long)(this.ag * v0)));
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("de.ab(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return v5_2;
    }

    public String ac(int arg6) {
        String v0;
        for(v0 = this.aw; true; v0 = v0.substring(0, v1) + js.aj(arg6, false, 0x6D6ACD49) + v0.substring(v1 + 2)) {
            int v1 = v0.indexOf("%1");
            if(v1 < 0) {
                return v0;
            }
        }

        return v0;
    }

    public es ad(int arg5) {
        es v5_2;
        try {
            int v0 = 0xF635B457;
            if(this.am * v0 < 0) {
                return null;
            }

            mv v5_1 = de.an.ax(((long)(this.am * v0)));
            if(v5_1 != null) {
                return ((es)v5_1);
            }

            v5_2 = ah.ap(de.al, this.am * v0, 0, -1565303959);
            if(v5_2 != null) {
                de.an.ae(((mv)v5_2), ((long)(this.am * v0)));
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("de.ad(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return v5_2;
    }

    void ae(lq arg2, int arg3) {
        while(true) {
            byte v3 = -69;
            try {
                arg3 = arg2.ay(v3);
                if(arg3 == 0) {
                    return;
                }

                this.ar(arg2, arg3, -113055127);
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("de.ae(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2), v3_1.toString());
            }
        }
    }

    public od af(byte arg6) {
        od v6_2;
        try {
            int v0 = 0x1D646395;
            if(this.ai * v0 == -1) {
                return null;
            }

            mv v6_1 = de.ap.ax(((long)(this.ai * v0)));
            if(v6_1 != null) {
                return ((od)v6_1);
            }

            v6_2 = ir.aj(de.al, de.ae, this.ai * v0, 0, 0xB66FEC86);
            if(v6_2 != null) {
                de.ap.ae(((mv)v6_2), ((long)(this.ai * v0)));
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("de.af(");
            v0_1.append(')');
            throw lx.al(((Throwable)v6), v0_1.toString());
        }

        return v6_2;
    }

    public static boolean af(char arg0, int arg1) {
        boolean v0;
        if(arg0 < 65 || arg0 > 90) {
            if(arg0 >= 97 && arg0 <= 0x7A) {
            label_8:
                v0 = true;
                return v0;
            }

            v0 = false;
        }
        else {
            goto label_8;
        }

        return v0;
    }

    void ag(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-66);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x9A958FF4);
        }
    }

    void ah(lq arg8, int arg9) {
        if(1 == arg9) {
            this.ai = arg8.bq(0xDE55ED02) * 397004733;
        }
        else if(2 == arg9) {
            this.av = arg8.ak(0x18E624A3) * 0xD0F600FD;
        }
        else if(arg9 == 3) {
            this.au = arg8.bq(0xFB4CC6D5) * 0xF9B956B;
        }
        else if(arg9 == 4) {
            this.az = arg8.bq(0xEC291A0B) * 0xCBEF4481;
        }
        else if(5 == arg9) {
            this.am = arg8.bq(0xEBA966A8) * 0x58F07767;
        }
        else if(6 == arg9) {
            this.ag = arg8.bq(0x89117B08) * -55480855;
        }
        else if(7 == arg9) {
            this.ah = arg8.as(0x75B6157B) * 0x57482B89;
        }
        else if(arg9 == 8) {
            this.aw = arg8.bp(-607512400);
        }
        else if(arg9 == 9) {
            this.aa = arg8.ao(0x21B0EF9B) * 0xCC3D7F3F;
        }
        else if(10 == arg9) {
            this.at = arg8.as(0x625223F8) * -747506707;
        }
        else {
            int v2 = 0;
            if(arg9 == 11) {
                this.ay = 0;
            }
            else if(arg9 == 12) {
                this.ao = arg8.ay(-28) * 0x492692F3;
            }
            else if(arg9 == 13) {
                this.as = arg8.as(0x6642F0F4) * 0x5F0331FD;
            }
            else if(arg9 == 14) {
                this.ay = arg8.ao(0x12B71B38) * 0x6593E02F;
            }
            else {
                int v3 = 18;
                if(17 != arg9 && arg9 != v3) {
                    return;
                }

                this.ac = arg8.ao(0xF271204A) * 0xBAB153F1;
                int v4 = 0xFFFF;
                if(this.ac * 0x81C93D11 == v4) {
                    this.ac = 0x454EAC0F;
                }

                this.bd = arg8.ao(0xF72E0356) * 0x87030023;
                if(this.bd * 0xBB8DAF8B == v4) {
                    this.bd = 0x78FCFFDD;
                }

                int v1 = -1;
                if(arg9 == v3) {
                    arg9 = arg8.ao(0x1BB5ECDF);
                    if(arg9 == v4) {
                        goto label_139;
                    }
                }
                else {
                label_139:
                    arg9 = -1;
                }

                v3 = arg8.ay(-54);
                this.ak = new int[v3 + 2];
                while(v2 <= v3) {
                    this.ak[v2] = arg8.ao(0xCB0BF716);
                    if(v4 == this.ak[v2]) {
                        this.ak[v2] = v1;
                    }

                    ++v2;
                }

                this.ak[v3 + 1] = arg9;
            }
        }
    }

    public es aj(int arg5) {
        es v5_2;
        try {
            int v0 = 0x169BEF43;
            if(this.au * v0 < 0) {
                return null;
            }

            mv v5_1 = de.an.ax(((long)(this.au * v0)));
            if(v5_1 != null) {
                return ((es)v5_1);
            }

            v5_2 = ah.ap(de.al, this.au * v0, 0, -1565303959);
            if(v5_2 != null) {
                de.an.ae(((mv)v5_2), ((long)(this.au * v0)));
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("de.aj(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return v5_2;
    }

    public String ak(int arg6) {
        String v0;
        for(v0 = this.aw; true; v0 = v0.substring(0, v1) + js.aj(arg6, false, 0x6F6B1FD3) + v0.substring(v1 + 2)) {
            int v1 = v0.indexOf("%1");
            if(v1 < 0) {
                return v0;
            }
        }

        return v0;
    }

    public static de am(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = de.ar.ax(v1);
        if(v0 != null) {
            return ((de)v0);
        }

        byte[] v5 = de.ax.ae(0x20, arg5, 0x78DC0DC9);
        de v0_1 = new de();
        if(v5 != null) {
            v0_1.ae(new lq(v5), -1428904894);
        }

        de.ar.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public final de an(byte arg4) {
        int v4_1;
        try {
            int v0 = 0x81C93D11;
            int v1 = -1;
            if(v1 != this.ac * v0) {
                v4_1 = of.ax(this.ac * v0, 2070642456);
            }
            else {
                v0 = 0xBB8DAF8B;
                v4_1 = v1 != this.bd * v0 ? an.ae[this.bd * v0] : -1;
            }

            v4_1 = v4_1 < 0 || v4_1 >= this.ak.length - 1 ? this.ak[this.ak.length - 1] : this.ak[v4_1];
            if(v1 == v4_1) {
                return null;
            }

            return cp.al(v4_1, -1424120531);
        }
        catch(RuntimeException v4) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("de.an(");
            v0_1.append(')');
            throw lx.al(((Throwable)v4), v0_1.toString());
        }

        return null;
    }

    public String ao(int arg6) {
        String v0;
        for(v0 = this.aw; true; v0 = v0.substring(0, v1) + js.aj(arg6, false, 0x76FC56B9) + v0.substring(v1 + 2)) {
            int v1 = v0.indexOf("%1");
            if(v1 < 0) {
                return v0;
            }
        }

        return v0;
    }

    public String ap(int arg5, int arg6) {
        try {
            String v6;
            for(v6 = this.aw; true; v6 = v6.substring(0, v0) + js.aj(arg5, false, 0x765972B6) + v6.substring(v0 + 2)) {
                int v0 = v6.indexOf("%1");
                if(v0 < 0) {
                    return v6;
                }
            }

            return v6;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("de.ap(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    public es aq(int arg5) {
        es v5_2;
        try {
            int v0 = 0x7244FB81;
            if(this.az * v0 < 0) {
                return null;
            }

            mv v5_1 = de.an.ax(((long)(this.az * v0)));
            if(v5_1 != null) {
                return ((es)v5_1);
            }

            v5_2 = ah.ap(de.al, this.az * v0, 0, -1565303959);
            if(v5_2 != null) {
                de.an.ae(((mv)v5_2), ((long)(this.az * v0)));
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("de.aq(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }

        return v5_2;
    }

    void ar(lq arg7, int arg8, int arg9) {
        if(1 == arg8) {
            arg8 = -1821950647;
            try {
                this.ai = arg7.bq(arg8) * 397004733;
                return;
            label_10:
                if(2 == arg8) {
                    this.av = arg7.ak(0xF0D347E9) * 0xD0F600FD;
                }
                else if(arg8 == 3) {
                    this.au = arg7.bq(-2069156400) * 0xF9B956B;
                }
                else if(arg8 == 4) {
                    this.az = arg7.bq(0x8F82A71B) * 0xCBEF4481;
                }
                else if(5 == arg8) {
                    this.am = arg7.bq(-1205060269) * 0x58F07767;
                }
                else if(6 == arg8) {
                    this.ag = arg7.bq(0xE26F62F9) * -55480855;
                }
                else if(7 == arg8) {
                    this.ah = arg7.as(0x6B453091) * 0x57482B89;
                }
                else if(arg8 == 8) {
                    this.aw = arg7.bp(0xFFC5BFDC);
                }
                else if(arg8 == 9) {
                    this.aa = arg7.ao(1261459004) * 0xCC3D7F3F;
                }
                else if(10 == arg8) {
                    this.at = arg7.as(2055595754) * -747506707;
                }
                else {
                    int v1 = 0;
                    if(arg8 == 11) {
                        this.ay = 0;
                    }
                    else if(arg8 == 12) {
                        this.ao = arg7.ay(-112) * 0x492692F3;
                    }
                    else if(arg8 == 13) {
                        this.as = arg7.as(0x6FF0551E) * 0x5F0331FD;
                    }
                    else if(arg8 == 14) {
                        this.ay = arg7.ao(-141023938) * 0x6593E02F;
                    }
                    else {
                        int v2 = 18;
                        if(17 != arg8 && arg8 != v2) {
                            return;
                        }

                        this.ac = arg7.ao(0x18C55C39) * 0xBAB153F1;
                        int v3 = 0xFFFF;
                        if(this.ac * 0x81C93D11 == v3) {
                            this.ac = 0x454EAC0F;
                        }

                        this.bd = arg7.ao(0x40ADFA96) * 0x87030023;
                        if(this.bd * 0xBB8DAF8B == v3) {
                            this.bd = 0x78FCFFDD;
                        }

                        int v0 = -1;
                        if(arg8 == v2) {
                            arg8 = arg7.ao(1016426933);
                            if(arg8 == v3) {
                                goto label_141;
                            }
                        }
                        else {
                        label_141:
                            arg8 = -1;
                        }

                        v2 = arg7.ay(-10);
                        this.ak = new int[v2 + 2];
                        while(v1 <= v2) {
                            this.ak[v1] = arg7.ao(0x48A1C9D5);
                            if(v3 == this.ak[v1]) {
                                this.ak[v1] = v0;
                            }

                            ++v1;
                        }

                        this.ak[v2 + 1] = arg8;
                    }
                }
            }
            catch(RuntimeException v7) {
                goto label_163;
            }
        }
        else {
            goto label_10;
        }

        return;
    label_163:
        StringBuilder v8 = new StringBuilder();
        v8.append("de.ar(");
        v8.append(')');
        throw lx.al(((Throwable)v7), v8.toString());
    }

    public String as(int arg6) {
        String v0;
        for(v0 = this.aw; true; v0 = v0.substring(0, v1) + js.aj(arg6, false, 0x7808139A) + v0.substring(v1 + 2)) {
            int v1 = v0.indexOf("%1");
            if(v1 < 0) {
                return v0;
            }
        }

        return v0;
    }

    public final de at() {
        int v0;
        int v1 = 0x81C93D11;
        int v2 = -1;
        if(v2 != this.ac * v1) {
            v0 = of.ax(this.ac * v1, 1139070568);
        }
        else if(v2 != this.bd * 0x2EBD7CF7) {
            v0 = an.ae[this.bd * 0xBB8DAF8B];
        }
        else {
            v0 = -1;
        }

        v0 = v0 < 0 || v0 >= this.ak.length - 1 ? this.ak[this.ak.length - 1] : this.ak[v0];
        if(v2 != v0) {
            return cp.al(v0, 0xD7534029);
        }

        return null;
    }

    static final void au(byte arg2) {
        try {
            bg.ax = false;
            client.ab = false;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("de.au(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static de au(int arg5) {
        long v1 = ((long)arg5);
        mv v0 = de.ar.ax(v1);
        if(v0 != null) {
            return ((de)v0);
        }

        byte[] v5 = de.ax.ae(0x68E12933, arg5, 0x78DC0DC9);
        de v0_1 = new de();
        if(v5 != null) {
            v0_1.ae(new lq(v5), 0xF5502F8);
        }

        de.ar.ae(((mv)v0_1), v1);
        return v0_1;
    }

    public static void av(ko arg0, ko arg1, ko arg2) {
        de.ax = arg0;
        de.al = arg1;
        de.ae = arg2;
    }

    public static void aw(Collection arg1, int arg2) {
        try {
            arg1.add(dr.ai);
            arg1.add(dr.av);
            arg1.add(dr.aa);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("de.aw(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public final de aw() {
        int v0;
        int v1 = 0x81C93D11;
        int v2 = -1;
        if(v2 != this.ac * v1) {
            v0 = of.ax(this.ac * v1, 0x58DDB0C9);
        }
        else {
            v1 = 0xBB8DAF8B;
            v0 = v2 != this.bd * v1 ? an.ae[this.bd * v1] : -1;
        }

        v0 = v0 < 0 || v0 >= this.ak.length - 1 ? this.ak[this.ak.length - 1] : this.ak[v0];
        if(v2 != v0) {
            return cp.al(v0, 0x5EF3AFE2);
        }

        return null;
    }

    static void ax(int arg3) {
        try {
            mx v3_1;
            for(v3_1 = iq.ax.aj(); v3_1 != null; v3_1 = iq.ax.aq()) {
                hx v1 = null;
                if(((iq)v3_1).aq != null) {
                    lo.pr.al(((iq)v3_1).aq);
                    ((iq)v3_1).aq = v1;
                }

                if(((iq)v3_1).aa != null) {
                    lo.pr.al(((iq)v3_1).aa);
                    ((iq)v3_1).aa = v1;
                }
            }

            iq.ax.ax();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("de.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final de ay() {
        int v0;
        int v1 = 0x81C93D11;
        int v2 = -1;
        if(v2 != this.ac * v1) {
            v0 = of.ax(this.ac * v1, 0x654F76C9);
        }
        else if(v2 != this.bd * 1905820635) {
            v0 = an.ae[this.bd * 473032670];
        }
        else {
            v0 = -1;
        }

        v0 = v0 < 0 || v0 >= this.ak.length - 1 ? this.ak[this.ak.length - 1] : this.ak[v0];
        if(v2 != v0) {
            return cp.al(v0, 2056119435);
        }

        return null;
    }

    void az(lq arg3) {
        while(true) {
            int v0 = arg3.ay(-43);
            if(v0 == 0) {
                return;
            }

            this.ar(arg3, v0, 0x2D240AC);
        }
    }

    public es ba() {
        int v1 = 0x169BEF43;
        if(this.au * v1 < 0) {
            return null;
        }

        mv v0 = de.an.ax(((long)(this.au * v1)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.au * v1, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.au * v1)));
        }

        return v0_1;
    }

    public static void bb(Collection arg1) {
        arg1.add(de.ar);
        arg1.add(de.an);
        arg1.add(de.ap);
    }

    public static void bc(Collection arg1) {
        arg1.add(de.ar);
        arg1.add(de.an);
        arg1.add(de.ap);
    }

    public String bd(int arg6) {
        String v0;
        for(v0 = this.aw; true; v0 = v0.substring(0, v1) + js.aj(arg6, false, 0x6C38968B) + v0.substring(v1 + 2)) {
            int v1 = v0.indexOf("%1");
            if(v1 < 0) {
                return v0;
            }
        }

        return v0;
    }

    public es bf() {
        int v1 = 0x169BEF43;
        if(this.au * v1 < 0) {
            return null;
        }

        mv v0 = de.an.ax(((long)(this.au * v1)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.au * v1, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.au * v1)));
        }

        return v0_1;
    }

    public od bg() {
        int v1 = 0x1D646395;
        if(this.ai * v1 == -1) {
            return null;
        }

        mv v0 = de.ap.ax(((long)(this.ai * v1)));
        if(v0 != null) {
            return ((od)v0);
        }

        od v0_1 = ir.aj(de.al, de.ae, this.ai * v1, 0, 0x304291FE);
        if(v0_1 != null) {
            de.ap.ae(((mv)v0_1), ((long)(this.ai * v1)));
        }

        return v0_1;
    }

    public static void bh(Collection arg1) {
        arg1.add(de.ar);
        arg1.add(de.an);
        arg1.add(de.ap);
    }

    public es bn() {
        if(this.au * 2069732906 < 0) {
            return null;
        }

        mv v0 = de.an.ax(((long)(this.au * 0x336BFF8E)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.au * 0x4CB570E7, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.au * 0x169BEF43)));
        }

        return v0_1;
    }

    public es bo() {
        int v1 = 0x7244FB81;
        if(this.az * v1 < 0) {
            return null;
        }

        mv v0 = de.an.ax(((long)(this.az * v1)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.az * v1, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.az * v1)));
        }

        return v0_1;
    }

    public es bp() {
        int v1 = 0xF635B457;
        if(this.am * v1 < 0) {
            return null;
        }

        mv v0 = de.an.ax(((long)(this.am * v1)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.am * v1, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.am * v1)));
        }

        return v0_1;
    }

    public od bq() {
        int v1 = 0x1D646395;
        if(this.ai * v1 == -1) {
            return null;
        }

        mv v0 = de.ap.ax(((long)(this.ai * v1)));
        if(v0 != null) {
            return ((od)v0);
        }

        od v0_1 = ir.aj(de.al, de.ae, this.ai * v1, 0, 0x8FCC7931);
        if(v0_1 != null) {
            de.ap.ae(((mv)v0_1), ((long)(this.ai * v1)));
        }

        return v0_1;
    }

    public es bt() {
        int v1 = -1545979303;
        if(this.ag * v1 < 0) {
            return null;
        }

        mv v0 = de.an.ax(((long)(this.ag * v1)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.ag * v1, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.ag * v1)));
        }

        return v0_1;
    }

    public es bv() {
        if(this.ag * 0xA5F00FBA < 0) {
            return null;
        }

        int v2 = -1545979303;
        mv v0 = de.an.ax(((long)(this.ag * v2)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.ag * v2, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.ag * v2)));
        }

        return v0_1;
    }

    public es bw() {
        if(this.am * 0xF635B457 < 0) {
            return null;
        }

        mv v0 = de.an.ax(((long)(this.am * 0x69D91EAB)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.am * 0x8C3F2F4D, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.am * 0xC05FDAE2)));
        }

        return v0_1;
    }

    public od bx() {
        int v1 = 0x1D646395;
        if(this.ai * v1 == -1) {
            return null;
        }

        mv v0 = de.ap.ax(((long)(this.ai * v1)));
        if(v0 != null) {
            return ((od)v0);
        }

        od v0_1 = ir.aj(de.al, de.ae, this.ai * v1, 0, 0x73E1649F);
        if(v0_1 != null) {
            de.ap.ae(((mv)v0_1), ((long)(this.ai * v1)));
        }

        return v0_1;
    }

    public es by() {
        int v1 = 0x7244FB81;
        if(this.az * v1 < 0) {
            return null;
        }

        mv v0 = de.an.ax(((long)(this.az * v1)));
        if(v0 != null) {
            return ((es)v0);
        }

        es v0_1 = ah.ap(de.al, this.az * v1, 0, -1565303959);
        if(v0_1 != null) {
            de.an.ae(((mv)v0_1), ((long)(this.az * v1)));
        }

        return v0_1;
    }

    public od bz() {
        int v1 = 0x1D646395;
        if(this.ai * v1 == -1) {
            return null;
        }

        mv v0 = de.ap.ax(((long)(this.ai * v1)));
        if(v0 != null) {
            return ((od)v0);
        }

        od v0_1 = ir.aj(de.al, de.ae, this.ai * v1, 0, 874161607);
        if(v0_1 != null) {
            de.ap.ae(((mv)v0_1), ((long)(this.ai * v1)));
        }

        return v0_1;
    }
}

