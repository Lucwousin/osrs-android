import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class fz implements fk {
    final mj ae;
    static final int al = 1000;
    Collection an;
    Collection ap;
    fk ax;
    static ki du;
    static int tb;

    public fz() {
        try {
            super();
            this.ae = new mj(fl.class, 1000);
            this.an = new ArrayList(100);
            this.ap = new ArrayList(100);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fz.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public boolean aa(int arg4, long arg5) {
        int v0 = -974301918;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.aq;
            v0_1.al = arg4 * 0xF62F00CD;
            v0_1.ap = arg5 * 0x31A415DD4116EF3L;
            this.ae(v0_1, 13);
            return 1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("fz.aa(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public boolean ab(int arg3, int arg4, int arg5, int arg6, long arg7) {
        int v0 = 0xCF7F1B02;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.ar;
            v0_1.al = arg3 * 0xF62F00CD;
            v0_1.ae = arg4 * 0x1FBE0881;
            v0_1.ar = arg5 * -960928833;
            v0_1.an = arg6 * 0x35A41A4F;
            v0_1.ap = arg7 * 0x31A415DD4116EF3L;
            this.ae(v0_1, -81);
            return 1;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("fz.ab(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    fl ac() {
        return this.ae.ae(0x605D911D);
    }

    public boolean ad(char arg4, long arg5) {
        int v0 = 0x13F3371A;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.ad;
            v0_1.al = arg4 * 0xF62F00CD;
            v0_1.ap = arg5 * 0x31A415DD4116EF3L;
            this.ae(v0_1, -75);
            return 1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("fz.ad(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void ae(fl arg2, byte arg3) {
        __monitor_enter(this);
        try {
            this.an.add(arg2);
        }
        catch(Throwable v2) {
        }
        catch(RuntimeException v2_1) {
            try {
                StringBuilder v3 = new StringBuilder();
                v3.append("fz.ae(");
                v3.append(')');
                throw lx.al(((Throwable)v2_1), v3.toString());
            }
            catch(Throwable v2) {
                __monitor_exit(this);
                throw v2;
            }
        }

        __monitor_exit(this);
    }

    public boolean af(int arg3, int arg4, int arg5, long arg6) {
        int v0 = 0xBCB0B4FF;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.an;
            v0_1.al = arg3 * 0xF62F00CD;
            v0_1.ar = arg4 * -960928833;
            v0_1.an = arg5 * 0x35A41A4F;
            v0_1.ap = arg6 * 0x31A415DD4116EF3L;
            this.ae(v0_1, 87);
            return 1;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("fz.af(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    void ag() {
        __monitor_enter(this);
        try {
            Collection v0_1 = this.ap;
            this.ap = this.an;
            this.an = v0_1;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    void ah(fl arg2) {
        __monitor_enter(this);
        try {
            this.an.add(arg2);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public boolean ai(int arg3, int arg4, long arg5) {
        int v0 = 0x149D82B;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.ax;
            v0_1.ar = arg3 * -960928833;
            v0_1.an = arg4 * 0x35A41A4F;
            v0_1.ap = arg5 * 0x31A415DD4116EF3L;
            this.ae(v0_1, -47);
            return 1;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("fz.ai(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public boolean aj(int arg4, long arg5) {
        int v0 = 0xE23420F3;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.aj;
            v0_1.al = arg4 * 0xF62F00CD;
            v0_1.ap = arg5 * 0x31A415DD4116EF3L;
            this.ae(v0_1, -70);
            return 1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("fz.aj(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    fl ak() {
        return this.ae.ae(0x605D911D);
    }

    void al(int arg3) {
        __monitor_enter(this);
        try {
            Collection v3_2 = this.ap;
            this.ap = this.an;
            this.an = v3_2;
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("fz.al(");
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

    public final void am(fk arg1) {
        this.ax = arg1;
    }

    fl an(int arg3) {
        try {
            return this.ae.ae(0x605D911D);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fz.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final boolean ao() {
        this.al(0x84CFDB53);
        boolean v0 = !this.ap.isEmpty() ? true : false;
        Iterator v1 = this.ap.iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            if(this.ax != null) {
                ((fl)v2).ax(this.ax, 1657058396);
            }

            this.ae.ar(v2, 0x746D4F08);
        }

        this.ap.clear();
        return v0;
    }

    public boolean ap(int arg4, long arg5) {
        int v0 = 0xACFC3CF;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.ap;
            v0_1.al = arg4 * 0xF62F00CD;
            v0_1.ap = arg5 * 0x31A415DD4116EF3L;
            this.ae(v0_1, 17);
            return 1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("fz.ap(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public boolean aq(int arg3, int arg4, int arg5, int arg6, long arg7) {
        int v0 = -60774034;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.ae;
            v0_1.al = arg3 * 0xF62F00CD;
            v0_1.ae = arg4 * 0x1FBE0881;
            v0_1.ar = arg5 * -960928833;
            v0_1.an = arg6 * 0x35A41A4F;
            v0_1.ap = arg7 * 0x31A415DD4116EF3L;
            this.ae(v0_1, -48);
            return 1;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("fz.aq(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public final boolean ar(int arg5) {
        arg5 = 0x9A671711;
        try {
            this.al(arg5);
            boolean v5_1 = !this.ap.isEmpty() ? true : false;
            Iterator v0 = this.ap.iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                if(this.ax != null) {
                    ((fl)v1).ax(this.ax, 0xF6DA0996);
                }

                this.ae.ar(v1, 0x62435AA4);
            }

            this.ap.clear();
            return v5_1;
        }
        catch(RuntimeException v5) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("fz.ar(");
            v0_1.append(')');
            throw lx.al(((Throwable)v5), v0_1.toString());
        }
    }

    fl as() {
        return this.ae.ae(0x605D911D);
    }

    void at(fl arg2) {
        __monitor_enter(this);
        try {
            this.an.add(arg2);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public final void au(fk arg1) {
        this.ax = arg1;
    }

    static final void av(int arg2) {
        try {
            dz.aq(gs.hy, 0x7F05002F);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fz.av(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    static void av(int arg2, int arg3) {
        arg3 = 2;
        try {
            if(arg3 == hq.cm * 0xF7EE5BF5) {
                hq.dq = arg2 * 0xCEB54B43;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fz.av(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean av(int arg4, long arg5) {
        int v0 = 0xDF886720;
        try {
            fl v0_1 = this.an(v0);
            v0_1.ax = fh.al;
            v0_1.al = arg4 * 0xF62F00CD;
            v0_1.ap = arg5 * 0x31A415DD4116EF3L;
            this.ae(v0_1, -83);
            return 1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("fz.av(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    void aw(fl arg2) {
        __monitor_enter(this);
        try {
            this.an.add(arg2);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    public final void ax(fk arg2, int arg3) {
        try {
            this.ax = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("fz.ax(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void ay(fl arg2) {
        __monitor_enter(this);
        try {
            this.an.add(arg2);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }

    static void az(boolean arg3, boolean arg4, int arg5) {
        try {
            ax.bf(gs.jf, gs.jz, gs.ja, 0x63D3C206);
            hp.ea.ar(arg3, 0xAE3DFBF8);
            ew.bc(arg4, 0x1771B65D);
            dc.ay(20, -87);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("fz.az(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public final void az(fk arg1) {
        this.ax = arg1;
    }

    public boolean ba(int arg4, long arg5) {
        fl v0 = this.an(0x9D5605BB);
        v0.ax = fh.ap;
        v0.al = arg4 * 0xF62F00CD;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, 8);
        return 1;
    }

    public boolean bb(int arg4, long arg5) {
        fl v0 = this.an(-1666541007);
        v0.ax = fh.aq;
        v0.al = arg4 * 0xF62F00CD;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, -20);
        return 1;
    }

    public boolean bc(int arg4, long arg5) {
        fl v0 = this.an(-717654093);
        v0.ax = fh.aq;
        v0.al = arg4 * 0xA39D7D50;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, 62);
        return 1;
    }

    public boolean bd(int arg4, long arg5) {
        fl v0 = this.an(0xB779D511);
        v0.ax = fh.ap;
        v0.al = arg4 * 0x4C2AD870;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, -12);
        return 1;
    }

    public boolean bf(int arg4, long arg5) {
        fl v0 = this.an(0xC980815C);
        v0.ax = fh.aj;
        v0.al = arg4 * 0xA8D22797;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, -23);
        return 1;
    }

    public boolean bg(int arg3, int arg4, long arg5) {
        fl v0 = this.an(0xA109FF5D);
        v0.ax = fh.ax;
        v0.ar = arg3 * -960928833;
        v0.an = arg4 * 0x35A41A4F;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, 28);
        return 1;
    }

    public boolean bh(int arg4, long arg5) {
        fl v0 = this.an(-1235997015);
        v0.ax = fh.al;
        v0.al = arg4 * 0xF62F00CD;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, 0x1F);
        return 1;
    }

    public boolean bn(char arg4, long arg5) {
        fl v0 = this.an(0xEF128BA9);
        v0.ax = fh.ad;
        v0.al = arg4 * 0xF62F00CD;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, -16);
        return 1;
    }

    public boolean bo(int arg3, int arg4, int arg5, int arg6, long arg7) {
        fl v0 = this.an(0xB5B9B4F6);
        v0.ax = fh.ar;
        v0.al = arg3 * 0xF62F00CD;
        v0.ae = arg4 * 0x1FBE0881;
        v0.ar = arg5 * -960928833;
        v0.an = arg6 * 0x35A41A4F;
        v0.ap = arg7 * 0x31A415DD4116EF3L;
        this.ae(v0, -32);
        return 1;
    }

    public boolean bp(int arg3, int arg4, int arg5, int arg6, long arg7) {
        fl v0 = this.an(0x9C772B32);
        v0.ax = fh.ae;
        v0.al = arg3 * 0xF62F00CD;
        v0.ae = arg4 * 0x1FBE0881;
        v0.ar = arg5 * -960928833;
        v0.an = arg6 * 0x35A41A4F;
        v0.ap = arg7 * 0x31A415DD4116EF3L;
        this.ae(v0, 8);
        return 1;
    }

    public boolean bq(int arg3, int arg4, int arg5, long arg6) {
        fl v0 = this.an(-660985562);
        v0.ax = fh.an;
        v0.al = arg3 * 0xF62F00CD;
        v0.ar = arg4 * -960928833;
        v0.an = arg5 * 0x35A41A4F;
        v0.ap = arg6 * 0x31A415DD4116EF3L;
        this.ae(v0, -37);
        return 1;
    }

    public boolean bt(int arg3, int arg4, int arg5, int arg6, long arg7) {
        fl v0 = this.an(0xB52D89D1);
        v0.ax = fh.ar;
        v0.al = arg3 * 0xF62F00CD;
        v0.ae = arg4 * 0x1FBE0881;
        v0.ar = arg5 * -960928833;
        v0.an = arg6 * 0x35A41A4F;
        v0.ap = arg7 * 0x31A415DD4116EF3L;
        this.ae(v0, 92);
        return 1;
    }

    public boolean bv(int arg3, int arg4, int arg5, long arg6) {
        fl v0 = this.an(0xFD27F933);
        v0.ax = fh.an;
        v0.al = arg3 * 0xF62F00CD;
        v0.ar = arg4 * -960928833;
        v0.an = arg5 * 0x35A41A4F;
        v0.ap = arg6 * 0x31A415DD4116EF3L;
        this.ae(v0, 11);
        return 1;
    }

    public boolean bw(int arg3, int arg4, int arg5, int arg6, long arg7) {
        fl v0 = this.an(0xCD752B75);
        v0.ax = fh.ae;
        v0.al = arg3 * 0xF62F00CD;
        v0.ae = arg4 * 0x1FBE0881;
        v0.ar = arg5 * -960928833;
        v0.an = arg6 * 0x35A41A4F;
        v0.ap = arg7 * 0x31A415DD4116EF3L;
        this.ae(v0, -72);
        return 1;
    }

    public boolean bx(int arg3, int arg4, long arg5) {
        fl v0 = this.an(0xEE38DC03);
        v0.ax = fh.ax;
        v0.ar = arg3 * -960928833;
        v0.an = arg4 * 0x35A41A4F;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, -19);
        return 1;
    }

    public boolean by(int arg3, int arg4, int arg5, int arg6, long arg7) {
        fl v0 = this.an(0xD71F0D52);
        v0.ax = fh.ar;
        v0.al = arg3 * 0xF62F00CD;
        v0.ae = arg4 * 0x1FBE0881;
        v0.ar = arg5 * -960928833;
        v0.an = arg6 * 0x35A41A4F;
        v0.ap = arg7 * 0x31A415DD4116EF3L;
        this.ae(v0, 17);
        return 1;
    }

    public boolean bz(int arg4, long arg5) {
        fl v0 = this.an(0x9440EBE3);
        v0.ax = fh.al;
        v0.al = arg4 * 0xF62F00CD;
        v0.ap = arg5 * 0x31A415DD4116EF3L;
        this.ae(v0, -22);
        return 1;
    }

    static final void ev(nr arg31, int arg32) {
        int v30;
        int v18;
        int v17;
        int v16;
        int v15;
        int v1_2;
        int v21;
        int v5;
        int v22;
        int v0_2;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int v2;
        nr v0 = arg31;
        try {
            lo v1 = client.eh.ap;
            int v3 = 0xDF8E2D9;
            int v4 = 0x10906429;
            int v6 = 104;
            int v7 = 7;
            if(nr.ab == v0) {
                v2 = v1.ao(0x9559F16F);
                v8 = v1.br(0x6EFB2488);
                v9 = v8 >> 4 & 15;
                v8 &= v7;
                v10 = v1.ay(-18);
                v11 = client.gu * v4 + (v10 >> 4 & v7);
                v12 = dq.gn * v3 + (v10 & v7);
                v10 = v1.ay(-94);
                if(v11 >= 0 && v12 >= 0 && v11 < v6 && v12 < v6) {
                    v13 = v9 + 1;
                    if(gu.jg.dc[0] >= v11 - v13 && gu.jg.dc[0] <= v11 + v13 && gu.jg.dj[0] >= v12 - v13 && gu.jg.dj[0] <= v13 + v12 && client.py * 0x6EC3BC9B != 0 && v8 > 0) {
                        v14 = 0xFE380E33;
                        if(client.pd * v14 < 50) {
                            client.px[client.pd * v14] = v2;
                            client.pq[client.pd * v14] = v8;
                            client.pa[client.pd * v14] = v10;
                            client.ps[client.pd * v14] = null;
                            client.pz[client.pd * v14] = (v11 << 16) + (v12 << 8) + v9;
                            client.pd += 0xC7119CFB;
                        }
                    }
                }
            }

            v8 = 1101813865;
            if(nr.an == v0) {
                v0_2 = v1.be(0);
                v2 = client.gu * v4 + (v0_2 >> 4 & v7);
                v4 = dq.gn * v3 + (v0_2 & v7);
                v0_2 = v1.cw(0x3A4F4FD);
                if(v2 >= 0 && v4 >= 0 && v2 < v6 && v4 < v6) {
                    fi v1_1 = client.ka[kt.jz * v8][v2][v4];
                    if(v1_1 != null) {
                        mx v3_1 = v1_1.aj();
                        while(v3_1 != null) {
                            if(((jk)v3_1).ax * 0xC8B95FFD == (v0_2 & 0x7FFF)) {
                                ((jk)v3_1).lp();
                            }
                            else {
                                v3_1 = v1_1.aq();
                                continue;
                            }

                            break;
                        }

                        if(v1_1.aj() == null) {
                            client.ka[kt.jz * v8][v2][v4] = null;
                        }

                        dm.eb(v2, v4, 0x804BDF6B);
                    }
                }

                return;
            }

            v9 = 0x695B43B1;
            v10 = -2077001153;
            byte v11_1 = 2;
            if(nr.aq == v0) {
                v0_2 = v1.cy(v9);
                int v23 = v1.as(0x5AD44BA0);
                v2 = v1.cj(0x6D08F6ED);
                v9 = v1.ao(0x43434EF3);
                v14 = v1.ao(0x9FC12A44);
                v22 = v1.br(2085423402);
                v13 = v1.br(1906795289) * 4;
                v5 = v1.be(0) * 4;
                v21 = v1.bl(v11_1);
                v11 = v1.aw(-1215098345);
                v1_2 = v1.br(1758205528);
                v12 = (v1_2 >> 4 & v7) + client.gu * v4;
                v4 = dq.gn * v3 + (v1_2 & v7);
                v11 += v12;
                v2 += v4;
                if(v12 >= 0 && v4 >= 0 && v12 < v6 && v4 < v6 && v11 >= 0 && v2 >= 0 && v11 < v6 && v2 < v6 && v14 != 0xFFFF) {
                    v1_2 = v12 * 0x80 + 0x40;
                    v3 = v4 * 0x80 + 0x40;
                    v4 = v11 * 0x80 + 0x40;
                    v2 = v2 * 0x80 + 0x40;
                    it v6_1 = new it(v14, kt.jz * v8, v1_2, v3, fj.ez(v1_2, v3, kt.jz * v8, 0x7640D11A) - v13, v0_2 + client.bj * v10, v9 + client.bj * v10, v21, v22, v23, v5);
                    v6_1.ax(v4, v2, fj.ez(v4, v2, kt.jz * v8, 0x7640D11A) - v5, client.bj * v10 + v0_2, 563562084);
                    client.kg.al(((mx)v6_1));
                }

                return;
            }

            if(nr.ap == v0) {
                v0_2 = v1.br(0x6A8342EB);
                v2 = (v0_2 >> 4 & v7) + client.gu * v4;
                v0_2 = (v0_2 & v7) + dq.gn * v3;
                v3 = v1.cw(0xB538CB63);
                v1_2 = v1.ao(0xD04E39F1);
                if(v2 >= 0 && v0_2 >= 0 && v2 < v6 && v0_2 < v6) {
                    jk v4_1 = new jk();
                    v4_1.ax = v1_2 * 0xC4CEF555;
                    v4_1.al = v3 * 0x3AB9F75B;
                    if(client.ka[kt.jz * v8][v2][v0_2] == null) {
                        client.ka[kt.jz * v8][v2][v0_2] = new fi();
                    }

                    client.ka[kt.jz * v8][v2][v0_2].al(((mx)v4_1));
                    dm.eb(v2, v0_2, 0x804BDF6B);
                }

                return;
            }

            if(v0 == nr.al) {
                v0_2 = v1.ao(0xCD89A730);
                v2 = v1.be(0);
                v5 = (v2 >> 4 & v7) + client.gu * v4;
                v2 = (v2 & v7) + dq.gn * v3;
                v3 = v1.cy(v9);
                v1_2 = v1.cy(v9);
                if(v5 >= 0 && v2 >= 0 && v5 < v6 && v2 < v6) {
                    fi v4_2 = client.ka[kt.jz * v8][v5][v2];
                    if(v4_2 != null) {
                        mx v6_2;
                        for(v6_2 = v4_2.aj(); v6_2 != null; v6_2 = v4_2.aq()) {
                            if((v1_2 & 0x7FFF) == ((jk)v6_2).ax * 0xC8B95FFD && v3 == ((jk)v6_2).al * 0xEC9560D3) {
                                ((jk)v6_2).al = v0_2 * 0x3AB9F75B;
                                break;
                            }
                        }

                        dm.eb(v5, v2, 0x804BDF6B);
                    }
                }

                return;
            }

            v13 = 3;
            if(v0 == nr.ae) {
                v2 = v1.cw(0x5C46FC71);
                v15 = v1.aw(-1215098345);
                v16 = v1.be(0);
                v17 = (v16 >> 4 & 7) + client.gu * v4;
                v16 = dq.gn * v3 + (v16 & 7);
                v6 = v1.aw(-1215098345);
                v12 = v1.ay(-41);
                int v19 = v12 >> 2;
                v12 &= v13;
                int v26 = client.gl[v19];
                v3 = v1.cy(v9);
                v9 = v1.ca(0xFBD665E8);
                v7 = v1.cb(-14);
                v4 = v1.bi(0xF8832465);
                v5 = v1.cw(-2020383546);
                hw v5_1 = v5 == client.ja * -900939569 ? gu.jg : client.jf[v5];
                if(v5_1 == null) {
                    goto label_504;
                }

                do v3_2 = ok.al(v3, 404503591);
                if(1 == v12 || v13 == v12) {
                    v10 = 0x4B9D7897 * v3_2.ag;
                    v13 = v3_2.az * 0xB46CA623;
                }
                else {
                    v10 = v3_2.az * 0xB46CA623;
                    v13 = v3_2.ag * 0x4B9D7897;
                }

                v18 = (v10 >> 1) + v17;
                int v20 = (v10 + 1 >> 1) + v17;
                v21 = (v13 >> 1) + v16;
                v22 = v16 + (v13 + 1 >> 1);
                int[][] v23_1 = id.ax[kt.jz * v8];
                int v29 = v23_1[v20][v22] + (v23_1[v18][v22] + (v23_1[v18][v21] + v23_1[v20][v21])) >> 2;
                ca v3_3 = v3_2.aq(v19, v12, v23_1, (v17 << 7) + (v10 << 6), v29, (v13 << 6) + (v16 << 7), 85);
                if(v3_3 == null) {
                    goto label_504;
                }

                hg.eg(kt.jz * v8, v17, v16, v26, -1, 0, 0, v7 + 1, v2 + 1, -702474534);
                v5_1.af = (v7 + client.bj * -2077001153) * 0xC06389FD;
                v5_1.ai = (v2 + client.bj * -2077001153) * 0x126349DF;
                v5_1.am = v3_3;
                v5_1.av = v10 * 0x9AFC0FC0 + 0x35F81F80 * v17;
                v5_1.au = 0x6D5CAB80 * v16 + v13 * -1230088768;
                v5_1.aa = -862040903 * v29;
                if(v15 > v4) {
                }
                else {
                    v30 = v15;
                    v15 = v4;
                    v4 = v30;
                }

                if(v6 > v9) {
                    v30 = v9;
                    v9 = v6;
                    v6 = v30;
                }

                v5_1.az = (v17 + v4) * -1754604919;
                v5_1.ah = 0xE3142F7F * (v17 + v15);
                v5_1.ag = (v16 + v6) * 0x233D700F;
                v5_1.at = (v9 + v16) * 0xECB7352B;
            }

        label_504:
            if(nr.ax == v0) {
                v0_2 = v1.be(0);
                v2 = v0_2 >> 2;
                v0_2 &= 3;
                v3 = client.gl[v2];
                v4 = v1.ao(0x9C8E8750);
                v1_2 = v1.br(0x76C540FC);
                v5 = client.gu * 0x10906429 + (v1_2 >> 4 & 7);
                v1_2 = (v1_2 & 7) + dq.gn * 0xDF8E2D9;
                if(v5 >= 0 && v1_2 >= 0 && v5 < 103 && v1_2 < 103) {
                    if(v3 == 0) {
                        bp v6_3 = ee.fs.ao(kt.jz * v8, v5, v1_2);
                        if(v6_3 != null) {
                            v7 = be.av(v6_3.ad * -1917295843550978971L);
                            if(v2 == v11_1) {
                                v6_3.ap = new hj(v7, 2, v0_2 + 4, kt.jz * v8, v5, v1_2, v4, false, v6_3.ap);
                                v6_3.aj = new hj(v7, 2, v0_2 + 1 & 3, kt.jz * v8, v5, v1_2, v4, false, v6_3.aj);
                            }
                            else {
                                v6_3.ap = new hj(v7, v2, v0_2, kt.jz * v8, v5, v1_2, v4, false, v6_3.ap);
                            }
                        }
                    }

                    if(v3 == 1) {
                        bw v6_4 = ee.fs.as(kt.jz * v8, v5, v1_2);
                        if(v6_4 != null) {
                            v7 = be.av(v6_4.ab * 0x567AA4F8A81AB119L);
                            if(4 != v2) {
                                if(v2 == 5) {
                                }
                                else if(6 == v2) {
                                    v6_4.ad = new hj(v7, 4, v0_2 + 4, kt.jz * v8, v5, v1_2, v4, false, v6_4.ad);
                                    goto label_709;
                                }
                                else {
                                    if(v2 == 7) {
                                        v6_4.ad = new hj(v7, 4, (v0_2 + 2 & 3) + 4, kt.jz * v8, v5, v1_2, v4, false, v6_4.ad);
                                    }
                                    else if(v2 == 8) {
                                        v6_4.ad = new hj(v7, 4, v0_2 + 4, kt.jz * v8, v5, v1_2, v4, false, v6_4.ad);
                                        v6_4.aq = new hj(v7, 4, (v0_2 + 2 & 3) + 4, kt.jz * v8, v5, v1_2, v4, false, v6_4.aq);
                                    }
                                    else {
                                    }

                                    goto label_709;
                                }
                            }

                            v6_4.ad = new hj(v7, 4, v0_2, kt.jz * v8, v5, v1_2, v4, false, v6_4.ad);
                        }
                    }

                label_709:
                    if(v11_1 == v3) {
                        cd v6_5 = ee.fs.ak(kt.jz * v8, v5, v1_2);
                        v17 = v2 == 11 ? 10 : v2;
                        if(v6_5 == null) {
                            goto label_739;
                        }

                        v6_5.ap = new hj(be.av(v6_5.av * -4125054662424005679L), v17, v0_2, kt.jz * v8, v5, v1_2, v4, false, v6_5.ap);
                    }

                label_739:
                    if(3 != v3) {
                        return;
                    }

                    bs v2_1 = ee.fs.ac(kt.jz * v8, v5, v1_2);
                    if(v2_1 == null) {
                        return;
                    }

                    v2_1.ar = new hj(be.av(v2_1.an * -7580787342638713831L), 22, v0_2, kt.jz * v8, v5, v1_2, v4, false, v2_1.ar);
                }

                return;
            }

            if(nr.ad == v0) {
                v0_2 = v1.be(0);
                v17 = v0_2 >> 2;
                v18 = v0_2 & 3;
                v15 = client.gl[v17];
                v0_2 = v1.bl(v11_1);
                v13 = client.gu * 0x10906429 + (v0_2 >> 4 & 7);
                v14 = (v0_2 & 7) + dq.gn * 0xDF8E2D9;
                if(v13 >= 0 && v14 >= 0) {
                    v0_2 = 104;
                    if(v13 < v0_2 && v14 < v0_2) {
                        hg.eg(kt.jz * v8, v13, v14, v15, -1, v17, v18, 0, -1, 0x46D94B96);
                    }
                }

                return;
            }

            if(v0 == nr.aj) {
                v0_2 = v1.bl(v11_1);
                v17 = v0_2 >> 2;
                v18 = v0_2 & 3;
                v15 = client.gl[v17];
                v16 = v1.cw(378700979);
                v0_2 = v1.bl(v11_1);
                v13 = (v0_2 >> 4 & 7) + client.gu * 0x10906429;
                v14 = dq.gn * 0xDF8E2D9 + (v0_2 & 7);
                if(v13 >= 0 && v14 >= 0) {
                    v0_2 = 104;
                    if(v13 < v0_2 && v14 < v0_2) {
                        hg.eg(kt.jz * v8, v13, v14, v15, v16, v17, v18, 0, -1, 2019899478);
                    }
                }

                return;
            }

            if(nr.ar != v0) {
                return;
            }

            v0_2 = v1.ay(-108);
            v2 = client.gu * 0x10906429 + (v0_2 >> 4 & 7);
            v0_2 = (v0_2 & 7) + dq.gn * 0xDF8E2D9;
            v3 = v1.br(0x7064340D);
            v10 = v1.cb(-29);
            v15 = v1.cy(0x695B43B1);
            if(v2 >= 0 && v0_2 >= 0) {
                v1_2 = 104;
                if(v2 < v1_2 && v0_2 < v1_2) {
                    v12 = v2 * 0x80 + 0x40;
                    v13 = v0_2 * 0x80 + 0x40;
                    client.kq.al(new ia(v10, kt.jz * v8, v12, v13, fj.ez(v12, v13, kt.jz * v8, 0x7640D11A) - v3, v15, client.bj * -2077001153));
                }
            }
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_3 = new StringBuilder();
            v1_3.append("fz.ev(");
            v1_3.append(')');
            throw lx.al(((Throwable)v0_1), v1_3.toString());
        }
    }
}

