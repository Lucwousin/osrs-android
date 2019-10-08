import java.util.Collection;

public class ea extends ms {
    public short ae;
    public ew al;
    public int ax;
    public static final int bw = 33;
    static ec or;

    ea(ew arg5, int arg6) {
        try {
            super();
            this.ax = (((int)(ji.ax(0x2076E2C1) / 1000))) * 0xEC81FD13;
            this.al = arg5;
            this.ae = ((short)arg6);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("ea.<init>(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    public static void ai(Collection arg1, int arg2) {
        try {
            arg1.add(df.ar);
            arg1.add(df.an);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ea.ai(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void aq(int arg3) {
        try {
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
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ea.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    static final void bg(short arg3) {
        try {
            client.eh.an(0x5F042A29);
            dw.bh(0xF046C3B3);
            ee.fs.ax();
            int v0;
            for(v0 = 0; v0 < 4; ++v0) {
                client.gg[v0].ax(-400581187);
            }

            System.gc();
            jj.ad(2, -1678843086);
            client.pm = 0x65CE01FD;
            client.po = false;
            de.ax(-1901106836);
            dc.ay(10, -10);
            ah v3_1 = ey.up.bh(0x5B9B6608);
            if(v3_1 != null) {
                v3_1.ak(67);
            }
        }
        catch(RuntimeException v3) {
            goto label_38;
        }

        return;
    label_38:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("ea.bg(");
        v0_1.append(')');
        throw lx.al(((Throwable)v3), v0_1.toString());
    }
}

