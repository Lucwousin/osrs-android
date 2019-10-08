import com.jagex.oldscape.osrenderer.ax;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.concurrent.TimeUnit;

public abstract class jz implements Runnable {
    static mu sg = null;
    static jz si = null;
    static int sl = 0;
    static final long sm = 0;
    static boolean sq = false;
    static long sw;
    int td;
    int tg;
    protected int ti;
    static long[] tj;
    int tk;
    protected int tl;
    int tm;
    protected float to;
    protected static int tp;
    or ts;
    int tu;
    int tw;
    static long[] tx;
    int ty;
    int tz;
    int uc;
    volatile boolean ue;
    static int uf;
    bl uk;
    jr ul;
    jq un;
    boolean uo;
    URL uq;
    static ja us;
    protected eb uu;
    protected fz uw;
    final jo ux;
    HashMap uy;
    static volatile boolean uz;

    static {
        jz.sm = TimeUnit.MILLISECONDS.toNanos(20) * -3269340255925385843L;
        jz.tp = 0;
        jz.tx = new long[0x20];
        jz.tj = new long[0x20];
        jz.us = new ja();
        jz.uf = 0xB26BF29C;
        jz.uz = true;
    }

    protected jz() {
        try {
            super();
            this.tz = 0;
            this.td = 0;
            this.ue = true;
            this.uo = false;
            this.uw = new fz();
            this.ux = new jo();
            this.uy = new HashMap();
            this.uc = -1585408107;
            new mt(0xFA);
            aj.ae(new hy(), 0x71);
            this.ux.ax(this.uw, -25);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jz.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    protected abstract void aa(int arg1);

    public final ls aba(int arg3) {
        try {
            return ey.up;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.aba(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected final void abb(byte arg1) {
    }

    public final int abd(int arg3) {
        try {
            return this.uc * 0xAE920443;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.abd(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final void abf(int arg2, byte arg3) {
        int v3 = 1585408107 * arg2;
        try {
            this.uc = v3;
            jz.us.ax(arg2, 51310024);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("jz.abf(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    protected final void abg(int arg2, int arg3, int arg4) {
        arg4 = 2065016653;
        try {
            if(arg2 != this.tk * arg4 || arg3 != this.tu * 0x82F98D4D) {
                this.acg(0xF824F909);
            }

            this.tk = arg2 * -353900155;
            this.tu = arg3 * 0xD1607385;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.abg(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void abi(int arg2, int arg3) {
        try {
            if(this.uu != null) {
                this.uu.aq(arg2, -1852290378);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.abi(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    protected void abj(int arg1) {
    }

    protected me abk(int arg3) {
        try {
            if(this.un == null) {
                this.un = new jq();
            }

            return this.un;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.abk(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final void abr(ls arg2, int arg3) {
        try {
            ey.up = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.abr(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final int abs(int arg3) {
        try {
            float v3_1 = ey.up.am(2130150598);
            if(v3_1 < 0f) {
                return -1;
            }

            return ((int)((((float)(bv.tt * 742742805))) * v3_1));
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.abs(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected bk abx(int arg3) {
        try {
            return this.uu.ae(0xAF6F93DC);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.abx(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected void abz(String arg1, int arg2) {
    }

    void aca(byte arg7) {
        int v0;
        int v7 = 0xEB0AD5B6;
        try {
            int[] v7_2 = ax.ay(v7);
            v0 = 0;
            while(true) {
            label_3:
                if(v0 >= v7_2.length / 2) {
                    return;
                }

                int v1 = v0 * 2;
                int v2 = v7_2[v1];
                v1 = v7_2[v1 + 1];
                long v3 = ji.ax(0x2076E2C1);
                switch(v2) {
                    case 0: {
                        v1 = ey.up.au(v1, 0x54887560);
                        if(v1 < 0) {
                            goto label_32;
                        }

                        this.uw.ap(v1, v3);
                        goto label_32;
                    }
                    case 1: {
                        v1 = ey.up.au(v1, 0x74B6EADF);
                        if(v1 < 0) {
                            goto label_32;
                        }

                        this.uw.aj(v1, v3);
                        goto label_32;
                    }
                    case 2: {
                        if(v1 <= 0) {
                            goto label_32;
                        }

                        this.uw.ad(((char)v1), v3);
                        goto label_32;
                    }
                    default: {
                        goto label_32;
                    }
                }
            }
        }
        catch(RuntimeException v7_1) {
            goto label_37;
        }

    label_32:
        ++v0;
        goto label_3;
        return;
    label_37:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("jz.aca(");
        v0_1.append(')');
        throw lx.al(((Throwable)v7_1), v0_1.toString());
    }

    void acb(int arg3) {
        __monitor_enter(this);
        try {
            fq.ut = jz.uz;
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("jz.acb(");
                v0.append(')');
                throw lx.al(((Throwable)v3_1), v0.toString());
            }
            catch(Throwable v3) {
                __monitor_exit(this);
                throw v3;
            }
        }

        __monitor_exit(this);
    }

    final void acc(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        String v1_1;
        try {
            Thread.currentThread().setName("NXT");
            jz.si = this;
            dq.tv = 1036231253 * arg1;
            bv.tt = 0x1C371C3D * arg2;
            this.tg = arg1 * 0xC8CA78E5;
            this.ty = arg2 * 0xB6EFE7D7;
            this.ado(18046153);
            py.ae = arg5 * 0xA6B784E1;
            oi.ar = arg6 * 416857109;
            this.uk = bd.an(0x66FDC661);
            ho.sh = new mq();
            ho.sh.ad(((Runnable)this), 1, 0xD21DC9D7);
        }
        catch(Exception v1) {
            goto label_43;
        }

        try {
            v1_1 = System.getProperty("os.name");
            goto label_38;
        }
        catch(Exception ) {
            try {
                v1_1 = "Unknown";
            label_38:
                v1_1.toLowerCase();
            }
            catch(Exception v1) {
            label_43:
                String v2 = null;
                arg3 = 0x60223924;
                try {
                    po.ax(v2, ((Throwable)v1), arg3);
                }
                catch(RuntimeException v1_2) {
                    StringBuilder v2_1 = new StringBuilder();
                    v2_1.append("jz.acc(");
                    v2_1.append(')');
                    throw lx.al(((Throwable)v1_2), v2_1.toString());
                }
            }
        }
    }

    void acd(float arg9, int arg10) {
        arg10 = 0x2076E2C1;
        try {
            long v0 = ji.ax(arg10);
            long v4 = jz.tx[ft.tc * 0x24A57F1B];
            jz.tx[ft.tc * 0x24A57F1B] = v0;
            ft.tc = (ft.tc * 0x24A57F1B + 1 & 0x1F) * 0x5812C313;
            if(0 != v4 && v0 > v4) {
                arg10 = ((int)(v0 - v4));
                jz.tp = ((arg10 >> 1) + 32000) / arg10 * 0x2001DC67;
            }

            arg10 = jz.uf - 1050575117;
            jz.uf = arg10;
            if(arg10 * 0x2D34CA3B - 1 > 50) {
                jz.uf -= 0xC50ACB76;
                this.ue = true;
            }

            this.acn(-67);
            this.ah(this.ue, arg9, -842408942);
            if(this.ue) {
                this.ach(-175986062);
            }

            this.ue = false;
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("jz.acd(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    protected boolean ace(byte arg5) {
        try {
            String v5_1 = this.ul.ap(0xBAAA2610).getHost();
            if(!v5_1.equals("jagex.com")) {
                if(v5_1.endsWith(".jagex.com")) {
                }
                else {
                    if(!v5_1.equals("runescape.com")) {
                        if(v5_1.endsWith(".runescape.com")) {
                        }
                        else {
                            if(v5_1.endsWith("127.0.0.1")) {
                                return 1;
                            }

                            while(v5_1.length() > 0) {
                                if(v5_1.charAt(v5_1.length() - 1) < 0x30) {
                                    break;
                                }

                                if(v5_1.charAt(v5_1.length() - 1) > 57) {
                                    break;
                                }

                                v5_1 = v5_1.substring(0, v5_1.length() - 1);
                            }

                            if(v5_1.endsWith("192.168.1.")) {
                                return 1;
                            }

                            this.adk(mu.aj, -2072929069);
                            return 0;
                        }
                    }

                    return 1;
                }
            }

            return 1;
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.ace(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }

        return 1;
    }

    final void acf(int arg3) {
        arg3 = 0xE388A054;
        try {
            this.adv(arg3);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.acf(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void acg(int arg3) {
        try {
            this.uo = true;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.acg(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ach(int arg5) {
        arg5 = -2123502819;
        return;
        StringBuilder v0 = new StringBuilder();
        v0.append("jz.ach(");
        v0.append(')');
        throw lx.al(((Throwable)v5), v0.toString());
    }

    final void aci(int arg3) {
        try {
            this.uk.ad(0xB360059E);
            ax.bz(67);
            this.acu(0xDCDDA65A);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.aci(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected final void acj(int arg9, int arg10, int arg11, int arg12, int arg13) {
        int v7 = 0xA5F9EC70;
        jz v0 = this;
        int v1 = arg9;
        int v2 = arg10;
        int v5 = arg11;
        int v6 = arg12;
        try {
            v0.acc(v1, v2, 0, 0, v5, v6, v7);
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("jz.acj(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    public final void ack(int arg3) {
        arg3 = 0x3809A1BD;
        String v0 = null;
        try {
            this.aci(arg3);
            while(ax.ac(0x82F7A8DA)) {
                this.act(0x40BEB3F0);
            }

            this.acf(0xD907623B);
            return;
        }
        catch(Exception v3) {
            po.ax(v0, ((Throwable)v3), 0x7A7630F2);
            throw new RuntimeException(((Throwable)v3));
        }
        catch(py v3_1) {
            po.ax(v0, ((Throwable)v3_1), 0x46CE81C3);
            throw new RuntimeException(v3_1.ar(0));
        }
    }

    protected int acl(byte arg1) {
        return 0;
    }

    boolean acm(String arg2, byte arg3) {
        try {
            this.uq = new URL(arg2);
            return 1;
        }
        catch(RuntimeException v2) {
        }
        catch(MalformedURLException v2_1) {
            try {
                v2_1.printStackTrace();
                return 0;
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("jz.acm(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }

    final void acn(byte arg4) {
        int v4 = 1855172910;
        try {
            or v4_2 = this.adz(v4);
            if(this.tm * 0x9E07C039 != v4_2.ae * 0xD1D68747 || this.tw * 0xEF3B353B != v4_2.ar * 0x7EDCA66B || (this.uo)) {
                this.acy(44);
                this.uo = false;
            }
        }
        catch(RuntimeException v4_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.acn(");
            v0.append(')');
            throw lx.al(((Throwable)v4_1), v0.toString());
        }
    }

    public final void aco(boolean arg2, int arg3) {
        try {
            this.uk.ay(arg2, 0x70F30020);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.aco(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void acp(int arg1, String arg2, int arg3) {
        try {
            this.uy.put(Integer.toString(arg1), arg2);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("jz.acp(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    protected String acq(String arg2, int arg3) {
        try {
            return this.uy.get(arg2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.acq(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final fz acr(int arg3) {
        try {
            return this.uw;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.acr(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected URL acs(int arg3) {
        try {
            return this.uq;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.acs(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void act(int arg8) {
        try {
            this.uk.aw(-59);
            this.aca(-46);
            this.ux.aj(ey.up, dq.tv * 0xD9CC4AFD, 742742805 * bv.tt, this.tm * 0x9E07C039, this.tw * 0xEF3B353B, -65);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.act(");
            v0.append(')');
            throw lx.al(((Throwable)v8), v0.toString());
        }
    }

    void acu(int arg5) {
        arg5 = 0x53B8E75;
        try {
            int v0 = 0x16B02E09;
            this.tm = ax.as(arg5) * v0;
            int v1 = 0x9E07C039;
            if(this.tm * v1 < 1) {
                this.tm = v0;
            }

            v0 = 0x1C99DBF3;
            this.tw = ax.ak(0x66BDD015) * v0;
            int v3 = 0xEF3B353B;
            if(this.tw * v3 < 1) {
                this.tw = v0;
            }

            this.to = (((float)(this.tm * v1))) / (((float)(this.tw * v3)));
            this.ado(0x92694356);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("jz.acu(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }
    }

    protected final void acv(byte arg1) {
    }

    public void acw(jr arg2, int arg3) {
        try {
            this.ul = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.acw(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public final void acx(fk arg2, int arg3) {
        try {
            this.uw.ax(arg2, 0x61991677);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.acx(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    final void acy(byte arg5) {
        int v5 = 0x6F9D9741;
        try {
            or v5_2 = this.adz(v5);
            int v1 = 0x8178E413;
            this.tl = Math.max(v5_2.ae * 0xD1D68747, this.tg * -1848081171) * v1;
            int v0 = -1703310007;
            this.ti = Math.max(v5_2.ar * 0x7EDCA66B, this.ty * 0x75BAFBE7) * v0;
            int v2 = -76904933;
            if(this.tl * v2 <= 0) {
                this.tl = v1;
            }

            v1 = -2009271047;
            if(this.ti * v1 <= 0) {
                this.ti = v0;
            }

            dq.tv = Math.min(this.tl * v2, this.tk * 2065016653) * 1036231253;
            bv.tt = Math.min(this.ti * v1, this.tu * 0x82F98D4D) * 0x1C371C3D;
            v0 = this.tl * v2;
            v2 = 0xD9CC4AFD;
            this.tz = (v0 - dq.tv * v2) / 2 * 0xEE242F35;
            this.td = 0;
            v0 = 742742805;
            if(this.uu == null) {
                this.uu = new jg(dq.tv * v2, bv.tt * v0);
            }
            else {
                this.uu.ar(dq.tv * v2, bv.tt * v0, 0x488C2E64);
            }

            this.ue = true;
            this.cg(this.ado(0xB19C38C2), 83);
            return;
        }
        catch(RuntimeException v5_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("jz.acy(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5_1), v0_1.toString());
        }
    }

    void acz(int arg7) {
        arg7 = 0x2076E2C1;
        try {
            long v0 = ji.ax(arg7);
            long v4 = jz.tj[fz.tb * -1801703007];
            jz.tj[fz.tb * -1801703007] = v0;
            fz.tb = (fz.tb * -1801703007 + 1 & 0x1F) * 0x1E87F261;
            if(v4 != 0) {
                Long.compare(v0, v4);
            }

            this.acb(0x8D1A09AD);
            this.ag(-114);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("jz.acz(");
            v0_1.append(')');
            throw lx.al(((Throwable)v7), v0_1.toString());
        }
    }

    protected final void adb(int arg1) {
    }

    public final ls adc() {
        return ey.up;
    }

    protected ln add(int arg3) {
        try {
            return ey.up;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.add(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    boolean ade(int arg3) {
        try {
            if(jz.sg == null) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.ade(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    int adf(int arg2, byte arg3) {
        int v3 = 0xD9CC4AFD;
        try {
            return dq.tv * v3 * arg2 / (this.tm * 0x9E07C039);
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("jz.adf(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    final void adg(int arg5) {
        try {
            if(ih.tn == null) {
                ih.tn = ey.up.ah(mh.al, 0x245BD40A);
            }

            if(ih.tn != null) {
                jz.us.ab(ih.tn, this.uu, this.to, 0x7F0742C1);
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.adg(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }
    }

    protected final boolean adi(boolean arg4, int arg5) {
        try {
            bw.te = ey.up.ah(mh.ax, 0x21733246);
            li.tf = ey.up.ah(mh.ar, 1388080248);
            ii.ug = ey.up.ah(mh.an, 0x1D44A25F);
            jz.us.al(bw.te, li.tf, ii.ug, 0x38B04BE);
            return 1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("jz.adi(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    protected void adk(mu arg2, int arg3) {
        arg3 = 0xBFA1133A;
        try {
            if(this.ade(arg3)) {
                return;
            }

            jz.sg = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.adk(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    final void adl(int arg3) {
        __monitor_enter(this);
        try {
            if(!jz.sq) {
                goto label_6;
            }
        }
        catch(Throwable v3) {
            goto label_30;
        }
        catch(RuntimeException v3_1) {
            goto label_21;
        }

        __monitor_exit(this);
        return;
        try {
        label_6:
            jz.sq = true;
            short v3_2 = 5001;
            try {
                this.at(v3_2);
                goto label_9;
            }
            catch(Exception ) {
            label_9:
                if(ho.sh != null) {
                    try {
                        ho.sh.an(99);
                        goto label_14;
                    }
                    catch(Exception ) {
                    label_14:
                        arg3 = 1304812425;
                        try {
                            this.af(arg3);
                            goto label_16;
                        }
                        catch(Throwable v3) {
                        }
                        catch(RuntimeException v3_1) {
                            try {
                            label_21:
                                StringBuilder v0 = new StringBuilder();
                                v0.append("jz.adl(");
                                v0.append(')');
                                throw lx.al(((Throwable)v3_1), v0.toString());
                            }
                            catch(Throwable v3) {
                            label_30:
                                __monitor_exit(this);
                                throw v3;
                            }
                        }
                    }
                }

                goto label_14;
            }
        }
        catch(Throwable v3) {
            goto label_30;
        }
        catch(RuntimeException v3_1) {
            goto label_21;
        }

    label_16:
        __monitor_exit(this);
    }

    public or adm(int arg3) {
        try {
            return this.ts;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.adm(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    protected final boolean adn(byte arg1) {
        return 0;
    }

    boolean ado(int arg10) {
        boolean v10_1;
        arg10 = 0x9E07C039;
        try {
            int v0 = this.tm * arg10;
            v10_1 = false;
            if(v0 != 0 && this.tw * 0xEF3B353B != 0) {
                fd v0_1 = ey.up.gy(18);
                v10_1 = this.ads(this.ady(v0_1.ax(2099320427), 0xD28DF0C2), this.adf(v0_1.al(0x4204692B), 0), this.ady(v0_1.ae(1840751802), 0xD28DF0C2), this.adf(v0_1.ar(0x93), 0), 0x119D2BA7);
            }
        }
        catch(RuntimeException v10) {
            StringBuilder v0_2 = new StringBuilder();
            v0_2.append("jz.ado(");
            v0_2.append(')');
            throw lx.al(((Throwable)v10), v0_2.toString());
        }

        return v10_1;
    }

    protected final void adp(int arg8, String arg9, boolean arg10, int arg11) {
        try {
            if(ih.tn == null) {
                ih.tn = ey.up.ah(mh.al, 0x3D77F747);
            }

            jz.us.ae(arg8, arg9, ih.tn, this.to, this.uu, 0x8636C066);
            return;
        }
        catch(RuntimeException v8) {
            StringBuilder v9 = new StringBuilder();
            v9.append("jz.adp(");
            v9.append(')');
            throw lx.al(((Throwable)v8), v9.toString());
        }
    }

    public void adq(int arg3) {
        arg3 = 0x708B8527;
        try {
            if(this.ado(arg3)) {
                this.cg(true, 106);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.adq(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    boolean adr(int arg5) {
        try {
            while(!this.ul.ax(0, -1662703473)) {
                ju.ax(10);
            }

            Iterator v5_1 = this.ul.an(-90).al.entrySet().iterator();
            while(v5_1.hasNext()) {
                Object v0 = v5_1.next();
                this.acp(Integer.parseInt(((Map$Entry)v0).getKey()), ((Map$Entry)v0).getValue(), 0x1C52B9E4);
            }

            Object v5_2 = this.ul.an(-111).ax.get("codebase");
            if(v5_2 == null) {
                return 0;
            }

            return this.acm(((String)v5_2), 0x79);
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("jz.adr(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }
    }

    boolean ads(int arg3, int arg4, int arg5, int arg6, int arg7) {
        boolean v7 = false;
        if(arg3 >= 0 && arg4 >= 0 && arg5 >= 0 && arg6 >= 0) {
            int v0 = 0xD9CC4AFD;
            try {
                or v5 = new or(arg6, arg3, dq.tv * v0 - arg4 - arg6, bv.tt * 742742805 - arg5 - arg3);
                if(!v5.equals(this.ts)) {
                    this.ts = v5;
                    v7 = true;
                }
            }
            catch(RuntimeException v3) {
                StringBuilder v4 = new StringBuilder();
                v4.append("jz.ads(");
                v4.append(')');
                throw lx.al(((Throwable)v3), v4.toString());
            }
        }

        return v7;
    }

    public void adt(byte arg3) {
        try {
            this.ux.ad(0x58E34D6A);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.adt(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void adu(boolean arg11, int arg12) {
        arg12 = 0x2076E2C1;
        try {
            long v3 = ji.ax(arg12);
            int v0 = 0;
            while(true) {
                int v1 = 500;
                if(v0 >= v1) {
                    break;
                }

                this.cu(0, 0xD0EA6C12);
                long v6 = ji.ax(arg12);
                ju.ax(10 - (v6 - v3));
                this.acn(-61);
                if(this.uu != null) {
                    this.adx((v1 - v0 - 1) * 10 / 1000 + 1, arg11, -2110813001);
                }

                ++v0;
                v3 = v6;
            }

            this.ul = new jr(this.ul.ap(0xF2BA7C03));
            ho.sh.ad(((Runnable)this), 1, 0xD21DC9D7);
            return;
        }
        catch(RuntimeException v11) {
            StringBuilder v12 = new StringBuilder();
            v12.append("jz.adu(");
            v12.append(')');
            throw lx.al(((Throwable)v11), v12.toString());
        }
    }

    public final void adv(int arg5) {
        try {
            if(jz.si == this) {
                if(jz.sq) {
                }
                else {
                    jz.sw = ji.ax(0x2076E2C1) * -3567309147637541955L;
                    ju.ax(5000);
                    this.adl(0x6858C1F7);
                    return;
                }
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.adv(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }
    }

    protected void adw(byte arg7) {
        try {
            jz.sl += 0x9FA4DC95;
            if(ih.tn == null) {
                ih.tn = ey.up.ah(mh.al, 0x21F003E5);
            }

            if(ih.tn != null) {
                jz.us.ap(jz.sg, ih.tn, this.uu, this.to, 0x8DF7C3D7);
            }

            if(mu.ap == jz.sg && jz.sl * 722800317 == 200) {
                ey.up.ac(0x2F);
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.adw(");
            v0.append(')');
            throw lx.al(((Throwable)v7), v0.toString());
        }
    }

    final void adx(int arg7, boolean arg8, int arg9) {
        try {
            if(ih.tn == null) {
                ih.tn = ey.up.ah(mh.al, 0xFEEB06C6);
            }

            if(ih.tn != null) {
                if(arg8) {
                    jz.us.ad(arg7, ih.tn, this.uu, this.to, 0x4432A9FF);
                }
                else {
                    jz.us.aj(arg7, ih.tn, this.uu, this.to, 0x9000A258);
                }
            }
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("jz.adx(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    int ady(int arg2, int arg3) {
        try {
            return bv.tt * 742742805 * arg2 / (this.tw * 0xEF3B353B);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jz.ady(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    or adz(int arg4) {
        try {
            return new or(this.tm * 0x9E07C039, this.tw * 0xEF3B353B);
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jz.adz(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public void ae() {
        // Method was not decompiled
    }

    protected bk aea() {
        return this.uu.ae(0xAF6F93DC);
    }

    public void aeb(int arg3) {
        if(this.uu != null) {
            this.uu.aq(arg3, 0xEF419AE7);
        }
    }

    protected final void aec() {
    }

    public final ls aed() {
        return ey.up;
    }

    protected final void aee() {
    }

    public final ls aef() {
        return ey.up;
    }

    public final void aeg(ls arg1) {
        ey.up = arg1;
    }

    protected void aeh(String arg1) {
    }

    protected final void aei(int arg3, int arg4) {
        if(arg3 != this.tk * 1840081887 || arg4 != this.tu * 0xB4FED4CE) {
            this.acg(0xCD41EDAB);
        }

        this.tk = arg3 * -353900155;
        this.tu = arg4 * 0x63000559;
    }

    public final void aej(ls arg1) {
        ey.up = arg1;
    }

    public final int aek() {
        return this.uc * 0x60FA4899;
    }

    protected final void ael(int arg3, int arg4) {
        if(arg3 != this.tk * 2065016653 || arg4 != this.tu * 0x82F98D4D) {
            this.acg(0xE72A87D7);
        }

        this.tk = arg3 * -353900155;
        this.tu = arg4 * 0xD1607385;
    }

    protected final void aem() {
    }

    protected void aen(String arg1) {
    }

    protected final void aeo(int arg3, int arg4) {
        if(arg3 != this.tk * 2065016653 || arg4 != this.tu * 0x5CF6CC05) {
            this.acg(-1679897204);
        }

        this.tk = arg3 * 0xFE474448;
        this.tu = arg4 * 0xD1607385;
    }

    protected me aep() {
        if(this.un == null) {
            this.un = new jq();
        }

        return this.un;
    }

    protected void aeq(String arg1) {
    }

    public void aer(int arg3) {
        if(this.uu != null) {
            this.uu.aq(arg3, -2059520873);
        }
    }

    protected me aes() {
        if(this.un == null) {
            this.un = new jq();
        }

        return this.un;
    }

    public final void aet(int arg3) {
        this.uc = 1585408107 * arg3;
        jz.us.ax(arg3, 1410561137);
    }

    public final void aeu(ls arg1) {
        ey.up = arg1;
    }

    public final int aev() {
        return this.uc * 0xAE920443;
    }

    protected me aew() {
        if(this.un == null) {
            this.un = new jq();
        }

        return this.un;
    }

    protected me aex() {
        if(this.un == null) {
            this.un = new jq();
        }

        return this.un;
    }

    protected final void aey() {
    }

    static es aez(byte[] arg2) {
        return ey.up.ag(arg2, -1071805379);
    }

    protected abstract void af(int arg1);

    final void afa() {
        or v0 = this.adz(2015043405);
        int v2 = 0x8178E413;
        this.tl = Math.max(v0.ae * 0xD1D68747, this.tg * -1848081171) * v2;
        int v1 = -1703310007;
        this.ti = Math.max(v0.ar * 0x7EDCA66B, this.ty * 0x75BAFBE7) * v1;
        int v3 = -76904933;
        if(this.tl * v3 <= 0) {
            this.tl = v2;
        }

        v2 = -2009271047;
        if(this.ti * v2 <= 0) {
            this.ti = v1;
        }

        dq.tv = Math.min(this.tl * v3, this.tk * 2065016653) * 1036231253;
        bv.tt = Math.min(this.ti * v2, this.tu * 0x82F98D4D) * 0x1C371C3D;
        v1 = this.tl * v3;
        v3 = 0xD9CC4AFD;
        this.tz = (v1 - dq.tv * v3) / 2 * 0xEE242F35;
        this.td = 0;
        v1 = 742742805;
        if(this.uu == null) {
            this.uu = new jg(dq.tv * v3, bv.tt * v1);
        }
        else {
            this.uu.ar(dq.tv * v3, bv.tt * v1, 1858971702);
        }

        this.ue = true;
        this.cg(this.ado(0x2B00EF5C), 12);
    }

    public final void afb() {
        int v0 = 0x3809A1BD;
        String v1 = null;
        try {
            this.aci(v0);
            while(ax.ac(0x987C70D0)) {
                this.act(-596300133);
            }

            this.acf(0xD907623B);
            return;
        }
        catch(Exception v0_1) {
            po.ax(v1, ((Throwable)v0_1), 0xDF7BE5);
            throw new RuntimeException(((Throwable)v0_1));
        }
        catch(py v0_2) {
            po.ax(v1, ((Throwable)v0_2), 0x3F96AF5E);
            throw new RuntimeException(v0_2.ar(53));
        }
    }

    public final fz afc() {
        return this.uw;
    }

    final void afd() {
        this.adv(0xE388A054);
    }

    void afe() {
        int v1 = 0x16B02E09;
        this.tm = ax.as(0xD2BDFF5D) * v1;
        int v2 = 0x9E07C039;
        if(this.tm * v2 < 1) {
            this.tm = v1;
        }

        this.tw = ax.ak(0x66BDD015) * 614687350;
        v1 = 0xEF3B353B;
        if(this.tw * v1 < 1) {
            this.tw = 0xC66E4E1A;
        }

        this.to = (((float)(this.tm * v2))) / (((float)(this.tw * v1)));
        this.ado(0x188B56C);
    }

    protected final void aff(int arg9, int arg10, int arg11, int arg12) {
        this.acc(arg9, arg10, 0, 0, arg11, arg12, -841053065);
    }

    final void afg() {
        or v0 = this.adz(0x7209CE79);
        int v2 = 0x8178E413;
        this.tl = Math.max(v0.ae * 0xD1D68747, this.tg * -1848081171) * v2;
        int v1 = -1703310007;
        this.ti = Math.max(v0.ar * 0x7EDCA66B, this.ty * 0x75BAFBE7) * v1;
        int v3 = -76904933;
        if(this.tl * v3 <= 0) {
            this.tl = v2;
        }

        v2 = -2009271047;
        if(this.ti * v2 <= 0) {
            this.ti = v1;
        }

        dq.tv = Math.min(this.tl * v3, this.tk * 2065016653) * 1036231253;
        bv.tt = Math.min(this.ti * v2, this.tu * 0x82F98D4D) * 0x1C371C3D;
        v1 = this.tl * v3;
        v3 = 0xD9CC4AFD;
        this.tz = (v1 - dq.tv * v3) / 2 * 0xEE242F35;
        this.td = 0;
        v1 = 742742805;
        if(this.uu == null) {
            this.uu = new jg(dq.tv * v3, bv.tt * v1);
        }
        else {
            this.uu.ar(dq.tv * v3, bv.tt * v1, 0xF087C7F1);
        }

        this.ue = true;
        this.cg(this.ado(0xB0F8B4C3), -24);
    }

    final void afh() {
        or v0 = this.adz(0x7FC18876);
        this.tl = Math.max(v0.ae * 0xD1D68747, this.tg * -1848081171) * 0xABA0F2A6;
        this.ti = Math.max(v0.ar * 0x72045D25, this.ty * 0x1F056ECA) * -1703310007;
        int v1 = -76904933;
        if(this.tl * v1 <= 0) {
            this.tl = 0x8178E413;
        }

        if(this.ti * 0xB2C57B70 <= 0) {
            this.ti = -715576260;
        }

        dq.tv = Math.min(this.tl * v1, this.tk * 2065016653) * 1036231253;
        bv.tt = Math.min(this.ti * 1486239042, this.tu * 0x626D0385) * 0x1C371C3D;
        this.tz = (this.tl * -818001950 - dq.tv * 0x73A5C07D) / 2 * 0xEE242F35;
        this.td = 0;
        if(this.uu == null) {
            this.uu = new jg(dq.tv * 0xFC775955, bv.tt * -1700977871);
        }
        else {
            this.uu.ar(dq.tv * 0xD9CC4AFD, bv.tt * -694051093, 0x4AA366D2);
        }

        this.ue = true;
        this.cg(this.ado(-824023876), 8);
    }

    public final void afi() {
        int v0 = 0x3809A1BD;
        String v1 = null;
        try {
            this.aci(v0);
            while(ax.ac(0xB3BA563B)) {
                this.act(0x4B157CFC);
            }

            this.acf(0xD907623B);
            return;
        }
        catch(Exception v0_1) {
            po.ax(v1, ((Throwable)v0_1), 0x7DEB2092);
            throw new RuntimeException(((Throwable)v0_1));
        }
        catch(py v0_2) {
            po.ax(v1, ((Throwable)v0_2), 125279098);
            throw new RuntimeException(v0_2.ar(-40));
        }
    }

    void afj() {
    }

    protected final void afk() {
    }

    void afl() {
        int v1 = 0x16B02E09;
        this.tm = ax.as(0xB9AA40F9) * v1;
        int v2 = 0x9E07C039;
        if(this.tm * v2 < 1) {
            this.tm = v1;
        }

        v1 = 0x1C99DBF3;
        this.tw = ax.ak(0x66BDD015) * v1;
        int v4 = 0xEF3B353B;
        if(this.tw * v4 < 1) {
            this.tw = v1;
        }

        this.to = (((float)(this.tm * v2))) / (((float)(this.tw * v4)));
        this.ado(0xCFE4CF6D);
    }

    public final fz afm() {
        return this.uw;
    }

    final void afn(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        String v1_1;
        try {
            Thread.currentThread().setName("NXT");
            jz.si = this;
            dq.tv = 1036231253 * arg1;
            bv.tt = 0x1C371C3D * arg2;
            this.tg = arg1 * 0xC8CA78E5;
            this.ty = arg2 * -366039678;
            this.ado(0xA4A127CE);
            py.ae = arg5 * 0xA6B784E1;
            oi.ar = arg6 * 416857109;
            this.uk = bd.an(0x66FDC661);
            ho.sh = new mq();
            ho.sh.ad(((Runnable)this), 1, 0xD21DC9D7);
        }
        catch(Exception v1) {
            goto label_43;
        }

        try {
            v1_1 = System.getProperty("os.name");
            goto label_38;
        }
        catch(Exception ) {
            try {
                v1_1 = "Unknown";
            label_38:
                v1_1.toLowerCase();
            }
            catch(Exception v1) {
            label_43:
                po.ax(null, ((Throwable)v1), 1103079889);
            }
        }
    }

    final void afo() {
        this.adv(0xE388A054);
    }

    public final void afp() {
        int v0 = 0x3809A1BD;
        String v1 = null;
        try {
            this.aci(v0);
            while(ax.ac(0x8D20CFBA)) {
                this.act(147012845);
            }

            this.acf(0xD907623B);
            return;
        }
        catch(Exception v0_1) {
            po.ax(v1, ((Throwable)v0_1), 0xE515D88F);
            throw new RuntimeException(((Throwable)v0_1));
        }
        catch(py v0_2) {
            po.ax(v1, ((Throwable)v0_2), 0x60B7D8F4);
            throw new RuntimeException(v0_2.ar(-95));
        }
    }

    final void afq() {
        this.uk.aw(-25);
        this.aca(-111);
        this.ux.aj(ey.up, dq.tv * -1522055989, 0xEC77FF94 * bv.tt, this.tm * 0x9E07C039, this.tw * 0xEF3B353B, -81);
    }

    void afr() {
    }

    void afs() {
        this.tm = ax.as(-518833062) * 0xC4C10899;
        if(this.tm * 0x9E07C039 < 1) {
            this.tm = 0x16B02E09;
        }

        this.tw = ax.ak(0x66BDD015) * 0x1C99DBF3;
        int v2 = 0xEF3B353B;
        if(this.tw * v2 < 1) {
            this.tw = 2120066573;
        }

        this.to = (((float)(this.tm * -560424620))) / (((float)(this.tw * v2)));
        this.ado(-2047198902);
    }

    public final fz aft() {
        return this.uw;
    }

    final void afu() {
        this.adv(0xE388A054);
    }

    final void afv() {
        this.uk.ad(0xB360059E);
        ax.bz(83);
        this.acu(-1928078957);
    }

    void afw() {
    }

    final void afx() {
        this.adv(0xE388A054);
    }

    final void afy(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        String v1_1;
        try {
            Thread.currentThread().setName("NXT");
            jz.si = this;
            dq.tv = 578059640 * arg1;
            bv.tt = 0x1C371C3D * arg2;
            this.tg = arg1 * 0xC8CA78E5;
            this.ty = arg2 * 0x9C950FDC;
            this.ado(458709612);
            py.ae = arg5 * 0xD84E1016;
            oi.ar = arg6 * 416857109;
            this.uk = bd.an(0x66FDC661);
            ho.sh = new mq();
            ho.sh.ad(((Runnable)this), 1, 0xD21DC9D7);
        }
        catch(Exception v1) {
            goto label_43;
        }

        try {
            v1_1 = System.getProperty("os.name");
            goto label_38;
        }
        catch(Exception ) {
            try {
                v1_1 = "Unknown";
            label_38:
                v1_1.toLowerCase();
            }
            catch(Exception v1) {
            label_43:
                po.ax(null, ((Throwable)v1), -1803026792);
            }
        }
    }

    protected final void afz() {
    }

    protected abstract void ag(byte arg1);

    protected boolean aga() {
        String v0 = this.ul.ap(0x9F99A5A2).getHost();
        if(!v0.equals("jagex.com")) {
            if(v0.endsWith(".jagex.com")) {
            }
            else {
                if(!v0.equals("runescape.com")) {
                    if(v0.endsWith(".runescape.com")) {
                    }
                    else {
                        if(v0.endsWith("127.0.0.1")) {
                            return 1;
                        }

                        while(v0.length() > 0) {
                            if(v0.charAt(v0.length() - 1) < 0x30) {
                                break;
                            }

                            if(v0.charAt(v0.length() - 1) > 57) {
                                break;
                            }

                            v0 = v0.substring(0, v0.length() - 1);
                        }

                        if(v0.endsWith("192.168.1.")) {
                            return 1;
                        }

                        this.adk(mu.aj, 0x4574ACFB);
                        return 0;
                    }
                }

                return 1;
            }
        }

        return 1;
    }

    void agb(int arg2, String arg3) {
        this.uy.put(Integer.toString(arg2), arg3);
    }

    public final void agc(boolean arg3) {
        this.uk.ay(arg3, 1901639716);
    }

    void agd() {
        __monitor_enter(this);
        try {
            fq.ut = jz.uz;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    public final void age(fk arg3) {
        this.uw.ax(arg3, 0xA59BF2F9);
    }

    protected String agf(String arg2) {
        return this.uy.get(arg2);
    }

    void agg() {
        __monitor_enter(this);
        try {
            fq.ut = jz.uz;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    public void agh(jr arg1) {
        this.ul = arg1;
    }

    protected String agi(String arg2) {
        return this.uy.get(arg2);
    }

    void agj() {
        int[] v0 = ax.ay(0x18C96F53);
        int v1;
        for(v1 = 0; v1 < v0.length / 2; ++v1) {
            int v2 = v1 * 2;
            int v3 = v0[v2];
            v2 = v0[v2 + 1];
            long v4 = ji.ax(0x2076E2C1);
            switch(v3) {
                case 0: {
                    v2 = ey.up.au(v2, 0x608CF2D2);
                    if(v2 < 0) {
                        goto label_32;
                    }

                    this.uw.ap(v2, v4);
                    break;
                }
                case 1: {
                    v2 = ey.up.au(v2, 1720166050);
                    if(v2 < 0) {
                        goto label_32;
                    }

                    this.uw.aj(v2, v4);
                    break;
                }
                case 2: {
                    if(v2 <= 0) {
                        goto label_32;
                    }

                    this.uw.ad(((char)v2), v4);
                    break;
                }
                default: {
                    break;
                }
            }

        label_32:
        }
    }

    protected int agk() {
        return 0;
    }

    public void agl(jr arg1) {
        this.ul = arg1;
    }

    void agm(int arg2, String arg3) {
        this.uy.put(Integer.toString(arg2), arg3);
    }

    public final void agn(boolean arg3) {
        this.uk.ay(arg3, 0x74EDE8B6);
    }

    void ago() {
        int[] v0 = ax.ay(-2049031155);
        int v1;
        for(v1 = 0; v1 < v0.length / 2; ++v1) {
            int v2 = v1 * 2;
            int v3 = v0[v2];
            v2 = v0[v2 + 1];
            long v4 = ji.ax(0x2076E2C1);
            switch(v3) {
                case 0: {
                    v2 = ey.up.au(v2, 1932018628);
                    if(v2 < 0) {
                        goto label_32;
                    }

                    this.uw.ap(v2, v4);
                    break;
                }
                case 1: {
                    v2 = ey.up.au(v2, 0x70B8ECE0);
                    if(v2 < 0) {
                        goto label_32;
                    }

                    this.uw.aj(v2, v4);
                    break;
                }
                case 2: {
                    if(v2 <= 0) {
                        goto label_32;
                    }

                    this.uw.ad(((char)v2), v4);
                    break;
                }
                default: {
                    break;
                }
            }

        label_32:
        }
    }

    protected URL agp() {
        return this.uq;
    }

    public final void agq(fk arg3) {
        this.uw.ax(arg3, 859045600);
    }

    void agr() {
        int[] v0 = ax.ay(0xD10CBB29);
        int v1;
        for(v1 = 0; v1 < v0.length / 2; ++v1) {
            int v2 = v1 * 2;
            int v3 = v0[v2];
            v2 = v0[v2 + 1];
            long v4 = ji.ax(0x2076E2C1);
            switch(v3) {
                case 0: {
                    v2 = ey.up.au(v2, 1876503240);
                    if(v2 < 0) {
                        goto label_32;
                    }

                    this.uw.ap(v2, v4);
                    break;
                }
                case 1: {
                    v2 = ey.up.au(v2, 2123015186);
                    if(v2 < 0) {
                        goto label_32;
                    }

                    this.uw.aj(v2, v4);
                    break;
                }
                case 2: {
                    if(v2 <= 0) {
                        goto label_32;
                    }

                    this.uw.ad(((char)v2), v4);
                    break;
                }
                default: {
                    break;
                }
            }

        label_32:
        }
    }

    protected boolean ags() {
        String v0 = this.ul.ap(-2081597502).getHost();
        if(!v0.equals("jagex.com")) {
            if(v0.endsWith(".jagex.com")) {
            }
            else {
                if(!v0.equals("runescape.com")) {
                    if(v0.endsWith(".runescape.com")) {
                    }
                    else {
                        if(v0.endsWith("127.0.0.1")) {
                            return 1;
                        }

                        while(v0.length() > 0) {
                            if(v0.charAt(v0.length() - 1) < 0x30) {
                                break;
                            }

                            if(v0.charAt(v0.length() - 1) > 57) {
                                break;
                            }

                            v0 = v0.substring(0, v0.length() - 1);
                        }

                        if(v0.endsWith("192.168.1.")) {
                            return 1;
                        }

                        this.adk(mu.aj, 1290425449);
                        return 0;
                    }
                }

                return 1;
            }
        }

        return 1;
    }

    void agt(int arg2, String arg3) {
        this.uy.put(Integer.toString(arg2), arg3);
    }

    void agu() {
        int[] v0 = ax.ay(0x22828FE9);
        int v1;
        for(v1 = 0; v1 < v0.length / 2; ++v1) {
            int v2 = v1 * 2;
            int v3 = v0[v2];
            v2 = v0[v2 + 1];
            long v4 = ji.ax(0x2076E2C1);
            switch(v3) {
                case 0: {
                    v2 = ey.up.au(v2, 0x5780F46C);
                    if(v2 < 0) {
                        goto label_32;
                    }

                    this.uw.ap(v2, v4);
                    break;
                }
                case 1: {
                    v2 = ey.up.au(v2, 0x690F8DE4);
                    if(v2 < 0) {
                        goto label_32;
                    }

                    this.uw.aj(v2, v4);
                    break;
                }
                case 2: {
                    if(v2 <= 0) {
                        goto label_32;
                    }

                    this.uw.ad(((char)v2), v4);
                    break;
                }
                default: {
                    break;
                }
            }

        label_32:
        }
    }

    protected URL agv() {
        return this.uq;
    }

    protected boolean agw() {
        String v0 = this.ul.ap(0xB3C53D62).getHost();
        if(!v0.equals("jagex.com")) {
            if(v0.endsWith(".jagex.com")) {
            }
            else {
                if(!v0.equals("runescape.com")) {
                    if(v0.endsWith(".runescape.com")) {
                    }
                    else {
                        if(v0.endsWith("127.0.0.1")) {
                            return 1;
                        }

                        while(v0.length() > 0) {
                            if(v0.charAt(v0.length() - 1) < 0x30) {
                                break;
                            }

                            if(v0.charAt(v0.length() - 1) > 0x769C9F42) {
                                break;
                            }

                            v0 = v0.substring(0, v0.length() - 1);
                        }

                        if(v0.endsWith("192.168.1.")) {
                            return 1;
                        }

                        this.adk(mu.aj, 0xAD003F9A);
                        return 0;
                    }
                }

                return 1;
            }
        }

        return 1;
    }

    void agx() {
        __monitor_enter(this);
        try {
            fq.ut = jz.uz;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    void agy() {
        long v0 = ji.ax(0x2076E2C1);
        long v5 = jz.tj[fz.tb * -1801703007];
        jz.tj[fz.tb * -1801703007] = v0;
        fz.tb = (fz.tb * -1801703007 + 1 & 0x1F) * 0x1E87F261;
        Long.compare(v5, 0);
        this.acb(0xBBB8064E);
        this.ag(-35);
    }

    public final void agz(fk arg3) {
        this.uw.ax(arg3, 0xD7BEA586);
    }

    protected abstract void ah(boolean arg1, float arg2, int arg3);

    final void aha() {
        or v0 = this.adz(0x7922F903);
        if(this.tm * 0x9E07C039 != v0.ae * 0xD1D68747 || this.tw * 0xEF3B353B != v0.ar * 0x7EDCA66B || (this.uo)) {
            this.acy(15);
            this.uo = false;
        }
    }

    public void ahb() {
        this.ux.ad(1792155099);
    }

    protected final boolean ahc(boolean arg5) {
        bw.te = ey.up.ah(mh.ax, 0x1A600F56);
        li.tf = ey.up.ah(mh.ar, 0x2B19DD80);
        ii.ug = ey.up.ah(mh.an, 0x74BB3B70);
        jz.us.al(bw.te, li.tf, ii.ug, 0x688A2A72);
        return 1;
    }

    protected static final boolean ahd() {
        return jz.us.ai(0x7F91D51D);
    }

    boolean ahe() {
        while(!this.ul.ax(0, 0x8BFC763D)) {
            ju.ax(10);
        }

        Iterator v0 = this.ul.an(-27).al.entrySet().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            this.acp(Integer.parseInt(((Map$Entry)v1).getKey()), ((Map$Entry)v1).getValue(), 0x5EF7653);
        }

        Object v0_1 = this.ul.an(-40).ax.get("codebase");
        if(v0_1 == null) {
            return 0;
        }

        return this.acm(((String)v0_1), 43);
    }

    public void ahf() {
        this.ux.ad(0x6EB7BCF5);
    }

    public final void ahg() {
        if(jz.si == this) {
            if(jz.sq) {
            }
            else {
                jz.sw = ji.ax(0x2076E2C1) * -3567309147637541955L;
                ju.ax(5000);
                this.adl(0x70DFB9A7);
                return;
            }
        }
    }

    final void ahh() {
        this.uo = true;
    }

    void ahi(float arg8) {
        int v0_1;
        long v0 = ji.ax(0x2076E2C1);
        long v5 = jz.tx[ft.tc * 0x24A57F1B];
        jz.tx[ft.tc * 0x24A57F1B] = v0;
        ft.tc = (ft.tc * 0x24A57F1B + 1 & 0x1F) * 0x5812C313;
        if(0 != v5 && v0 > v5) {
            v0_1 = ((int)(v0 - v5));
            jz.tp = ((v0_1 >> 1) + 32000) / v0_1 * 0x2001DC67;
        }

        v0_1 = jz.uf - 1050575117;
        jz.uf = v0_1;
        if(v0_1 * 0x2D34CA3B - 1 > 50) {
            jz.uf -= 0xC50ACB76;
            this.ue = true;
        }

        this.acn(-23);
        this.ah(this.ue, arg8, -842408942);
        if(this.ue) {
            this.ach(-175986062);
        }

        this.ue = false;
    }

    final void ahj() {
        this.uo = true;
    }

    void ahk(float arg8) {
        int v0_1;
        long v0 = ji.ax(0x2076E2C1);
        long v5 = jz.tx[ft.tc * 0x24A57F1B];
        jz.tx[ft.tc * 0x24A57F1B] = v0;
        ft.tc = (ft.tc * 0x24A57F1B + 1 & 0x1F) * 0x5812C313;
        if(0 != v5 && v0 > v5) {
            v0_1 = ((int)(v0 - v5));
            jz.tp = ((v0_1 >> 1) + 32000) / v0_1 * 0x2001DC67;
        }

        v0_1 = jz.uf - 1050575117;
        jz.uf = v0_1;
        if(v0_1 * 0x2D34CA3B - 1 > 50) {
            jz.uf -= 0xC50ACB76;
            this.ue = true;
        }

        this.acn(-30);
        this.ah(this.ue, arg8, -842408942);
        if(this.ue) {
            this.ach(-175986062);
        }

        this.ue = false;
    }

    final void ahl() {
        this.uo = true;
    }

    protected static final boolean ahm() {
        return jz.us.ai(0x7F7FBA68);
    }

    protected final boolean ahn(boolean arg5) {
        bw.te = ey.up.ah(mh.ax, 463260236);
        li.tf = ey.up.ah(mh.ar, 0x60A7A3CE);
        ii.ug = ey.up.ah(mh.an, 0x2D9136CB);
        jz.us.al(bw.te, li.tf, ii.ug, -657767505);
        return 1;
    }

    final void aho() {
        __monitor_enter(this);
        try {
            if(!jz.sq) {
                goto label_6;
            }
        }
        catch(Throwable v0) {
            goto label_19;
        }

        __monitor_exit(this);
        return;
        try {
        label_6:
            jz.sq = true;
            short v0_1 = 0x391A;
            try {
                this.at(v0_1);
                goto label_9;
            }
            catch(Exception ) {
            label_9:
                if(ho.sh != null) {
                    try {
                        ho.sh.an(51);
                        goto label_14;
                    }
                    catch(Exception ) {
                    label_14:
                        int v0_2 = 1304812425;
                        try {
                            this.af(v0_2);
                            goto label_16;
                        }
                        catch(Throwable v0) {
                        label_19:
                            __monitor_exit(this);
                            throw v0;
                        }
                    }
                }

                goto label_14;
            }
        }
        catch(Throwable v0) {
            goto label_19;
        }

    label_16:
        __monitor_exit(this);
    }

    void ahp(float arg9) {
        int v0_1;
        long v0 = ji.ax(0x2076E2C1);
        long v3 = jz.tx[ft.tc * 0x24A57F1B];
        jz.tx[ft.tc * 0x9684BD76] = v0;
        ft.tc = (ft.tc * 0x7517948F + 1 & 0x1F) * 0x5812C313;
        if(0 != v3 && v0 > v3) {
            v0_1 = ((int)(v0 - v3));
            jz.tp = ((v0_1 >> 1) + 0xAE03FC6) / v0_1 * 0x44ABF940;
        }

        v0_1 = jz.uf + 0x78F53C45;
        jz.uf = v0_1;
        if(v0_1 * 0x3FFAB1FF - 1 > 0x32076A88) {
            jz.uf -= 0xA47650C9;
            this.ue = true;
        }

        this.acn(-97);
        this.ah(this.ue, arg9, -842408942);
        if(this.ue) {
            this.ach(-175986062);
        }

        this.ue = false;
    }

    protected static final void ahq() {
        bw.te = null;
        li.tf = null;
        ii.ug = null;
        jz.us.av(-9);
    }

    final void ahr() {
        or v0 = this.adz(0x7E39B7F3);
        if(this.tm * 0x9E07C039 != v0.ae * 0xD1D68747 || this.tw * 0xEF3B353B != v0.ar * 0x7EDCA66B || (this.uo)) {
            this.acy(-35);
            this.uo = false;
        }
    }

    protected static final boolean ahs() {
        return jz.us.ai(0x7FC3B34C);
    }

    protected static final void aht() {
        long v3;
        dh.th.al(0x4B7E1A55);
        int v1;
        for(v1 = 0; true; ++v1) {
            v3 = 0;
            if(v1 >= 0x20322AD7) {
                break;
            }

            jz.tx[v1] = v3;
        }

        for(v1 = 0; v1 < 0x20; ++v1) {
            jz.tj[v1] = v3;
        }

        cq.ta = 0;
    }

    protected static final void ahu() {
        bw.te = null;
        li.tf = null;
        ii.ug = null;
        jz.us.av(76);
    }

    void ahv() {
        __monitor_enter(this);
        try {
            fq.ut = jz.uz;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    final void ahw() {
        or v0 = this.adz(1923401182);
        if(this.tm * 0x9E07C039 != v0.ae * 0xD1D68747 || this.tw * 0xEF3B353B != v0.ar * 0x7EDCA66B || (this.uo)) {
            this.acy(9);
            this.uo = false;
        }
    }

    final void ahx() {
        or v0 = this.adz(0x7B92490F);
        if(this.tm * 0x9E07C039 != v0.ae * 0x61C03FFF || this.tw * -2061310289 != v0.ar * -1917315480 || (this.uo)) {
            this.acy(25);
            this.uo = false;
        }
    }

    protected static final boolean ahy() {
        return jz.us.ai(0x7FC11AB5);
    }

    boolean ahz() {
        while(!this.ul.ax(0, 0xA068F696)) {
            ju.ax(10);
        }

        Iterator v0 = this.ul.an(-103).al.entrySet().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            this.acp(Integer.parseInt(((Map$Entry)v1).getKey()), ((Map$Entry)v1).getValue(), 0xBCA064B);
        }

        Object v0_1 = this.ul.an(-47).ax.get("codebase");
        if(v0_1 == null) {
            return 0;
        }

        return this.acm(((String)v0_1), 120);
    }

    protected void aia() {
        jz.sl += 0x9FA4DC95;
        if(ih.tn == null) {
            ih.tn = ey.up.ah(mh.al, 0x2CC3DCC);
        }

        if(ih.tn != null) {
            jz.us.ap(jz.sg, ih.tn, this.uu, this.to, 0x8D8204B0);
        }

        if(mu.ap == jz.sg && jz.sl * 722800317 == 0xAE599151) {
            ey.up.ac(30);
        }
    }

    protected final void aib() {
    }

    boolean aic() {
        boolean v0 = false;
        if(this.tm * 0x9E07C039 != 0 && this.tw * 0xEF3B353B != 0) {
            fd v1 = ey.up.gy(80);
            v0 = this.ads(this.ady(v1.ax(2099320427), 0xD28DF0C2), this.adf(v1.al(0xB947E6FF), 0), this.ady(v1.ae(2042704390), 0xD28DF0C2), this.adf(v1.ar(0x93), 0), 0x3B32D55A);
        }

        return v0;
    }

    final void aid(int arg14, boolean arg15) {
        if(ih.tn == null) {
            ih.tn = ey.up.ah(mh.al, 1295406531);
        }

        if(ih.tn != null) {
            if(arg15) {
                jz.us.ad(arg14, ih.tn, this.uu, this.to, 0x33FBE846);
            }
            else {
                jz.us.aj(arg14, ih.tn, this.uu, this.to, 0x97EF04C0);
            }
        }
    }

    protected void aie() {
        jz.sl += 0x9FA4DC95;
        if(ih.tn == null) {
            ih.tn = ey.up.ah(mh.al, 490188406);
        }

        if(ih.tn != null) {
            jz.us.ap(jz.sg, ih.tn, this.uu, this.to, -1832757707);
        }

        if(mu.ap == jz.sg && jz.sl * 722800317 == 200) {
            ey.up.ac(-24);
        }
    }

    final void aif(int arg14, boolean arg15) {
        if(ih.tn == null) {
            ih.tn = ey.up.ah(mh.al, 0x2CCCF3FA);
        }

        if(ih.tn != null) {
            if(arg15) {
                jz.us.ad(arg14, ih.tn, this.uu, this.to, 2087692069);
            }
            else {
                jz.us.aj(arg14, ih.tn, this.uu, this.to, 0x98FD9E20);
            }
        }
    }

    final void aig(boolean arg12) {
        int v0 = 0x2076E2C1;
        long v4 = ji.ax(v0);
        int v1 = 0;
        while(v1 < 500) {
            this.cu(0, -1809404984);
            long v7 = ji.ax(v0);
            ju.ax(10 - (v7 - v4));
            this.acn(-30);
            if(this.uu != null) {
                this.adx((0x56EDF908 - v1 - 1) * 10 / 0xDD3D4E50 + 1, arg12, -2073725229);
            }

            ++v1;
            v4 = v7;
        }

        this.ul = new jr(this.ul.ap(0xBE50DDAC));
        ho.sh.ad(((Runnable)this), 1, 0xD21DC9D7);
    }

    protected final void aih() {
    }

    protected void aii(mu arg2) {
        if(this.ade(2032647559)) {
            return;
        }

        jz.sg = arg2;
    }

    protected void aij(mu arg2) {
        if(this.ade(90287468)) {
            return;
        }

        jz.sg = arg2;
    }

    boolean aik() {
        boolean v1 = false;
        if(this.tm * 0x9E07C039 != 0 && this.tw * 0xEF3B353B != 0) {
            fd v0 = ey.up.gy(21);
            v1 = this.ads(this.ady(v0.ax(2099320427), 0xD28DF0C2), this.adf(v0.al(-707647040), 0), this.ady(v0.ae(2109421917), 0xD28DF0C2), this.adf(v0.ar(0x93), 0), 0x1B63A5B5);
        }

        return v1;
    }

    protected ln ail() {
        return ey.up;
    }

    public void aim() {
        if(this.ado(0xDAB40C04)) {
            this.cg(true, 5);
        }
    }

    protected void ain() {
        jz.sl += 0x9FA4DC95;
        if(ih.tn == null) {
            ih.tn = ey.up.ah(mh.al, 0x8098CD0);
        }

        if(ih.tn != null) {
            jz.us.ap(jz.sg, ih.tn, this.uu, this.to, 0x8D63913E);
        }

        if(mu.ap == jz.sg && jz.sl * 722800317 == 200) {
            ey.up.ac(69);
        }
    }

    final void aio() {
        if(ih.tn == null) {
            ih.tn = ey.up.ah(mh.al, 0x3F46252D);
        }

        if(ih.tn != null) {
            jz.us.ab(ih.tn, this.uu, this.to, 0x7F4E0746);
        }
    }

    protected void aip(mu arg2) {
        if(this.ade(-248327308)) {
            return;
        }

        jz.sg = arg2;
    }

    boolean aiq() {
        boolean v0 = jz.sg != null ? true : false;
        return v0;
    }

    public or air() {
        return this.ts;
    }

    final void ais(boolean arg12) {
        int v0 = 0x2076E2C1;
        long v4 = ji.ax(v0);
        int v1 = 0;
        while(true) {
            int v2 = 500;
            if(v1 >= v2) {
                break;
            }

            this.cu(0, 0x85970D98);
            long v7 = ji.ax(v0);
            ju.ax(10 - (v7 - v4));
            this.acn(-120);
            if(this.uu != null) {
                this.adx((v2 - v1 - 1) * 10 / 1000 + 1, arg12, 0x9535EFFC);
            }

            ++v1;
            v4 = v7;
        }

        this.ul = new jr(this.ul.ap(0xDCE24FD2));
        ho.sh.ad(((Runnable)this), 1, 0xD21DC9D7);
    }

    boolean ait() {
        boolean v0 = jz.sg != null ? true : false;
        return v0;
    }

    boolean aiu() {
        boolean v0 = jz.sg != null ? true : false;
        return v0;
    }

    public or aiv() {
        return this.ts;
    }

    public or aiw() {
        return this.ts;
    }

    boolean aix() {
        boolean v0 = jz.sg != null ? true : false;
        return v0;
    }

    protected void aiy(mu arg2) {
        if(this.ade(0x96B22FFB)) {
            return;
        }

        jz.sg = arg2;
    }

    protected void aiz(mu arg2) {
        if(this.ade(0xE01DE155)) {
            return;
        }

        jz.sg = arg2;
    }

    public void ajb() {
        if(this.ado(1041314705)) {
            this.cg(true, 108);
        }
    }

    protected final boolean ajc() {
        return 0;
    }

    or ajd() {
        return new or(this.tm * 0x9E07C039, this.tw * 0xEF3B353B);
    }

    boolean ajf(int arg3, int arg4, int arg5, int arg6) {
        boolean v3;
        if(arg3 < 0 || arg4 < 0 || arg5 < 0 || arg6 < 0) {
        label_22:
            v3 = false;
        }
        else {
            or v5 = new or(arg6, arg3, dq.tv * 0xD9CC4AFD - arg4 - arg6, bv.tt * 742742805 - arg5 - arg3);
            if(!v5.equals(this.ts)) {
                this.ts = v5;
                v3 = true;
            }
            else {
                goto label_22;
            }
        }

        return v3;
    }

    int ajg(int arg3) {
        return dq.tv * -360085969 * arg3 / (this.tm * 2127230404);
    }

    public void ajh() {
        if(this.ado(1964057777)) {
            this.cg(true, 38);
        }
    }

    or aji() {
        return new or(this.tm * 0xBBB93062, this.tw * 0xEF3B353B);
    }

    protected final boolean ajk() {
        return 0;
    }

    protected final boolean ajm() {
        return 0;
    }

    public void ajn() {
        if(this.ado(0x31CF0F9F)) {
            this.cg(true, -29);
        }
    }

    int ajp(int arg3) {
        return bv.tt * 841908835 * arg3 / (this.tw * 0xEF3B353B);
    }

    or ajq() {
        return new or(this.tm * 0xD0C74570, this.tw * 0xEF3B353B);
    }

    boolean ajr(int arg3, int arg4, int arg5, int arg6) {
        boolean v3;
        if(arg3 < 0 || arg4 < 0 || arg5 < 0 || arg6 < 0) {
        label_22:
            v3 = false;
        }
        else {
            or v5 = new or(arg6, arg3, dq.tv * 0xD9CC4AFD - arg4 - arg6, bv.tt * 742742805 - arg5 - arg3);
            if(!v5.equals(this.ts)) {
                this.ts = v5;
                v3 = true;
            }
            else {
                goto label_22;
            }
        }

        return v3;
    }

    public void ajt() {
        if(this.ado(0xDD0B595E)) {
            this.cg(true, 53);
        }
    }

    public void ajv() {
        if(this.ado(0x460E66FB)) {
            this.cg(true, -13);
        }
    }

    int ajw(int arg3) {
        return dq.tv * 0xD9CC4AFD * arg3 / (this.tm * 0x37DF0138);
    }

    int ajx(int arg3) {
        return bv.tt * 742742805 * arg3 / (this.tw * 763833290);
    }

    int ajz(int arg3) {
        return dq.tv * 0xD9CC4AFD * arg3 / (this.tm * 0x9E07C039);
    }

    public void al() {
        // Method was not decompiled
    }

    public void ar() {
        // Method was not decompiled
    }

    protected abstract void at(short arg1);

    static final String av(int arg1, byte arg2) {
        if(arg1 >= 100000) {
            goto label_13;
        }

        try {
            return "<col=ffff00>" + arg1 + "</col>";
        label_13:
            if(arg1 < 10000000) {
                return "<col=ffffff>" + arg1 / 1000 + gs.gf + "</col>";
            }

            return "<col=00ff80>" + arg1 / 1000000 + gs.gq + "</col>";
        label_12:
        }
        catch(RuntimeException v1) {
            goto label_12;
        }

        v2 = new StringBuilder();
        v2.append("jz.av(");
        v2.append(')');
        throw lx.al(((Throwable)v1), v2.toString());
    }

    public void ax() {
        // Method was not decompiled
    }

    protected abstract void az(byte arg1);

    static final int bj(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        return arg1 * arg3 + arg2 * arg0 >> 16;
    }

    protected abstract void cg(boolean arg1, byte arg2);

    protected abstract void cu(int arg1, int arg2);

    protected abstract void im();

    protected abstract void iu();

    protected abstract void ja();

    protected abstract void jc();

    protected abstract void jf();

    protected abstract void jg(boolean arg1, float arg2);

    protected abstract void ji();

    protected abstract void jj();

    protected abstract void jk();

    protected abstract void jm();

    protected abstract void jo();

    protected abstract void jp();

    protected abstract void jq(boolean arg1, float arg2);

    protected abstract void jr();

    protected abstract void ju();

    protected abstract void jw();

    protected abstract void jz();

    protected abstract void oi(boolean arg1);

    protected abstract void ok(int arg1);

    protected abstract void ol(boolean arg1);

    protected abstract void on(boolean arg1);

    protected abstract void or(boolean arg1);

    protected abstract void ou(int arg1);

    public void run() {
        // Method was not decompiled
    }
}

