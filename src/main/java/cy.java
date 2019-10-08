import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class cy {
    int aa;
    final ko ab;
    ef[] ad;
    cx ae;
    final HashMap af;
    int ai;
    HashMap aj;
    boolean al;
    public int am;
    HashMap an;
    cc[][] ap;
    final ko aq;
    es ar;
    int au;
    int av;
    boolean ax;
    static final int ay = 200;
    static final int kh;

    public cy(ef[] arg3, HashMap arg4, ko arg5, ko arg6) {
        try {
            super();
            this.ax = false;
            this.al = false;
            this.aj = new HashMap();
            this.am = 0;
            this.ad = arg3;
            this.af = arg4;
            this.aq = arg5;
            this.ab = arg6;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("cy.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void aa(ko arg17, String arg18, boolean arg19) {
        cy v0 = this;
        ko v1 = arg17;
        String v2 = arg18;
        if(v0.al) {
            return;
        }

        v0.ax = false;
        v0.al = true;
        System.nanoTime();
        int v10 = v1.aw(v1.ay(dv.ax.ap, 0xD4A3E869), v2, -1910026221);
        lq v8 = new lq(v1.as(dv.ax.ap, v2, 0x4576C6F5));
        lq v9 = new lq(v1.as(dv.al.ap, v2, 0x7068D4B6));
        System.nanoTime();
        System.nanoTime();
        v0.ae = new cx();
        try {
            v0.ae.ax(v8, v9, v10, arg19, 1710904373);
        }
        catch(IllegalStateException ) {
            return;
        }

        v0.ae.ao(0x7AF4FE45);
        v0.ae.as(0x7F0F0121);
        v0.ae.ak(11);
        int v6 = 0x999D058;
        v0.ai = v0.ae.ah(v6) * 0x5582E340;
        v0.av = v0.ae.ay(-2108191007) * 0xBE373140;
        v0.aa = (v0.ae.at(-1588050622) - v0.ae.ah(v6) + 1) * 0x4B891040;
        v0.au = (v0.ae.aw(-2083754573) - v0.ae.ay(0x81CCBDD7) + 1) * 0xE96D81C0;
        int v5 = v0.ae.at(0xD842C500) - v0.ae.ah(v6) + 1;
        int v7 = v0.ae.aw(-2101084202) - v0.ae.ay(-2109318430) + 1;
        System.nanoTime();
        System.nanoTime();
        lb.ar(0x73);
        v0.ap = new cc[v5][v7];
        Iterator v8_1 = v0.ae.ax.iterator();
        while(v8_1.hasNext()) {
            Object v9_1 = v8_1.next();
            v10 = ((cp)v9_1).ae * 0xF5C1A1F;
            int v12 = ((cp)v9_1).ar * 0x82A1F09D;
            int v11 = v10 - v0.ae.ah(v6);
            int v13 = v12 - v0.ae.ay(0x80F5CE5A);
            v0.ap[v11][v13] = new cc(v10, v12, v0.ae.az(0x4557B8AB), v0.af);
            v0.ap[v11][v13].aj(((cp)v9_1), v0.ae.ae, 0xD83F3083);
        }

        int v3;
        for(v3 = 0; v3 < v5; ++v3) {
            int v4;
            for(v4 = 0; v4 < v7; ++v4) {
                if(v0.ap[v3][v4] == null) {
                    v0.ap[v3][v4] = new cc(v0.ae.ah(v6) + v3, v0.ae.ay(0x808686A6) + v4, v0.ae.az(-1666600363), v0.af);
                    v0.ap[v3][v4].ad(v0.ae.al, v0.ae.ae, 8);
                }
            }
        }

        System.nanoTime();
        System.nanoTime();
        if(v1.ao(dv.ae.ap, v2, 0x6F)) {
            v0.ar = ah.ax(v1.as(dv.ae.ap, v2, 0x5AE22F31), 0);
        }

        System.nanoTime();
        v1.az(-75);
        v1.ah(0x8B3FDE9E);
        v0.ax = true;
    }

    void ab(int arg8) {
        int v1;
        int v0;
        try {
            if(this.an == null) {
                this.an = new HashMap();
            }

            this.an.clear();
            v0 = 0;
            while(true) {
            label_9:
                if(v0 >= this.ap.length) {
                    return;
                }

                v1 = 0;
                while(true) {
                label_13:
                    if(v1 >= this.ap[v0].length) {
                        goto label_50;
                    }

                    Iterator v2 = this.ap[v0][v1].bg(4).iterator();
                    while(v2.hasNext()) {
                        Object v3 = v2.next();
                        if(!((cg)v3).ap(1023204699)) {
                            continue;
                        }

                        int v4 = ((cg)v3).al(-43);
                        if(!this.an.containsKey(Integer.valueOf(v4))) {
                            LinkedList v5 = new LinkedList();
                            v5.add(v3);
                            this.an.put(Integer.valueOf(v4), v5);
                            continue;
                        }

                        this.an.get(Integer.valueOf(v4)).add(v3);
                    }
                }
            }
        }
        catch(RuntimeException v8) {
            goto label_55;
        }

        ++v1;
        goto label_13;
    label_50:
        ++v0;
        goto label_9;
        return;
    label_55:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("cy.ab(");
        v0_1.append(')');
        throw lx.al(((Throwable)v8), v0_1.toString());
    }

    public List ac(int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27) {
        cy v6 = this;
        LinkedList v8 = new LinkedList();
        if(!v6.ax) {
            return ((List)v8);
        }

        dp v0 = this.aj(arg18, arg19, arg20, arg21, 0xEDEBD04);
        int v1 = ((int)(v6.af(arg24, arg20 - arg18, 0x7DDE8253) * 64f));
        int v2 = arg18 + v6.ai * 0x52702F45;
        int v3 = v6.av * -238403059 + arg19;
        int v5 = 0x5AACFC2F;
        int v4;
        for(v4 = v0.ae * v5; v4 < v0.ax * 0xB6E903E3 + v0.ae * v5; ++v4) {
            int v16 = 0xB927ABC3;
            int v7;
            for(v7 = v0.ar * v16; v7 < v0.al * -190745659 + v0.ar * v16; ++v7) {
                List v9 = v6.ap[v4][v7].bx((v6.ap[v4][v7].ad * 0x1AF71D40 - v2) * v1 / 0x40 + arg22, arg25 + arg23 - (v6.ap[v4][v7].aq * 1480714304 - v3 + 0x40) * v1 / 0x40, v1, arg26, arg27, 0x5F);
                if(!v9.isEmpty()) {
                    v8.addAll(((Collection)v9));
                }
            }
        }

        return ((List)v8);
    }

    public boolean ad(int arg3) {
        try {
            return this.ax;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cy.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final void ae(int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, fa arg30, int arg31) {
        cy v7 = this;
        int v6 = 0x4F89D4E0;
        cy v1 = this;
        int v2 = arg22;
        int v3 = arg23;
        int v4 = arg24;
        int v5 = arg25;
        try {
            dp v1_1 = v1.aj(v2, v3, v4, v5, v6);
            float v2_1 = v7.af(arg28 - arg26, arg24 - arg22, 0x6254A263);
            v3 = ((int)Math.ceil(((double)v2_1)));
            v7.am = 0x8D9299F7 * v3;
            if(!v7.aj.containsKey(Integer.valueOf(v3))) {
                cl v4_1 = new cl(v3);
                v4_1.ar(26);
                v7.aj.put(Integer.valueOf(v3), v4_1);
            }

            v5 = 0xB6E903E3;
            int v15 = 0x5AACFC2F;
            v4 = v1_1.ax * v5 + v1_1.ae * v15 - 1;
            int v16 = -190745659;
            int v17 = 0xB927ABC3;
            v6 = v1_1.al * v16 + v1_1.ar * v17 - 1;
            int v14;
            for(v14 = v1_1.ae * v15; v14 <= v4; ++v14) {
                int v13 = v1_1.ar * v17;
                while(v13 <= v6) {
                    v7.ap[v14][v13].au(v3, v7.aj.get(Integer.valueOf(v3)), v7.ad, v7.aq, v7.ab, 0x62852F6B);
                    ++v13;
                    v14 = v14;
                }
            }

            v2 = ((int)(v2_1 * 64f));
            int v0_1 = arg22 + v7.ai * 0x52702F45;
            v3 = v7.av * -238403059 + arg23;
            v4 = v1_1.ae * v15;
            while(true) {
            label_90:
                if(v4 >= v1_1.ax * v5 + v1_1.ae * v15) {
                    return;
                }

                for(v6 = v1_1.ar * v17; v6 < v1_1.ar * v17 + v1_1.al * v16; ++v6) {
                    v7.ap[v4][v6].ap((v7.ap[v4][v6].ad * 0x1AF71D40 - v0_1) * v2 / 0x40 + arg26, arg29 - (v7.ap[v4][v6].aq * 1480714304 - v3 + 0x40) * v2 / 0x40, v2, arg30, 0x60CC9EB0);
                }
            }
        }
        catch(RuntimeException v0) {
            goto label_139;
        }

        ++v4;
        goto label_90;
        return;
    label_139:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("cy.ae(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0), v1_2.toString());
    }

    float af(int arg2, int arg3, int arg4) {
        float v2 = (((float)arg2)) / (((float)arg3));
        float v3 = 8f;
        if(v2 > v3) {
            return v3;
        }

        v3 = 1f;
        if(v2 < v3) {
            return v3;
        }

        try {
            v3 = ((float)Math.round(v2));
            if(Math.abs(v3 - v2) >= 0.05f) {
                return v2;
            }
        }
        catch(RuntimeException v2_1) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("cy.af(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2_1), v3_1.toString());
        }

        return v3;
    }

    public final void ag() {
        this.an = null;
    }

    public final void ah(int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, fa arg26) {
        cy v6 = this;
        dp v0 = this.aj(arg18, arg19, arg20, arg21, 1175300340);
        float v1 = v6.af(arg24 - arg22, arg20 - arg18, 0x3F0AD423);
        int v2 = ((int)Math.ceil(((double)v1)));
        v6.am = 0x347A0267 * v2;
        if(!v6.aj.containsKey(Integer.valueOf(v2))) {
            cl v3 = new cl(v2);
            v3.ar(58);
            v6.aj.put(Integer.valueOf(v2), v3);
        }

        int v3_1 = v0.ax * 0xEA18CAB7 + v0.ae * -1085190984 - 1;
        int v5 = v0.al * -660936933 + v0.ar * 2000203206 - 1;
        int v4;
        for(v4 = v0.ae * 0x5AACFC2F; v4 <= v3_1; ++v4) {
            int v14;
            for(v14 = v0.ar * 0xCB0264B7; v14 <= v5; ++v14) {
                v6.ap[v4][v14].au(v2, v6.aj.get(Integer.valueOf(v2)), v6.ad, v6.aq, v6.ab, 0x376B3FEE);
            }
        }

        int v1_1 = ((int)(v1 * 64f));
        v2 = arg18 + v6.ai * 0x25DF2694;
        v3_1 = v6.av * 0x499B4067 + arg19;
        for(v5 = v0.ae * 1860920395; v5 < v0.ax * -1386046858 + v0.ae * 0xF2211F6A; ++v5) {
            for(v4 = v0.ar * -1030394869; v4 < v0.ar * 0x67CEA486 + v0.al * -190745659; ++v4) {
                v6.ap[v5][v4].ap((v6.ap[v5][v4].ad * 0x1AF71D40 - v2) * v1_1 / 0x40 + arg22, arg25 - (v6.ap[v5][v4].aq * 1480714304 - v3_1 - 1115507013) * v1_1 / 1824455060, v1_1, arg26, 1055091496);
            }
        }
    }

    public void ai(ko arg17, String arg18, boolean arg19) {
        cy v0 = this;
        ko v1 = arg17;
        String v2 = arg18;
        if(v0.al) {
            return;
        }

        v0.ax = false;
        v0.al = true;
        System.nanoTime();
        int v10 = v1.aw(v1.ay(dv.ax.ap, 0xD4A3E869), v2, -1019514034);
        lq v8 = new lq(v1.as(dv.ax.ap, v2, 0x3B16D228));
        lq v9 = new lq(v1.as(dv.al.ap, v2, 1638779670));
        System.nanoTime();
        System.nanoTime();
        v0.ae = new cx();
        try {
            v0.ae.ax(v8, v9, v10, arg19, 0x298032C9);
        }
        catch(IllegalStateException ) {
            return;
        }

        v0.ae.ao(0x7C7705F5);
        v0.ae.as(0x7F0F0121);
        v0.ae.ak(101);
        int v6 = 0x999D058;
        v0.ai = v0.ae.ah(v6) * 1673061556;
        v0.av = v0.ae.ay(-2101210721) * 0xE34332E5;
        v0.aa = (v0.ae.at(0x8DF7A83C) - v0.ae.ah(v6) + 1) * 0x4B891040;
        v0.au = (v0.ae.aw(-2037068407) - v0.ae.ay(0x828D06FB) + 1) * 0xE96D81C0;
        int v5 = v0.ae.at(-1591596506) - v0.ae.ah(v6) + 1;
        int v7 = v0.ae.aw(0x85B1CB11) - v0.ae.ay(-2127064430) + 1;
        System.nanoTime();
        System.nanoTime();
        lb.ar(35);
        v0.ap = new cc[v5][v7];
        Iterator v8_1 = v0.ae.ax.iterator();
        while(v8_1.hasNext()) {
            Object v9_1 = v8_1.next();
            v10 = ((cp)v9_1).ae * -998906073;
            int v12 = ((cp)v9_1).ar * -413998210;
            int v11 = v10 - v0.ae.ah(v6);
            int v13 = v12 - v0.ae.ay(-2110684314);
            v0.ap[v11][v13] = new cc(v10, v12, v0.ae.az(0x8BB2C508), v0.af);
            v0.ap[v11][v13].aj(((cp)v9_1), v0.ae.ae, 0x801CD407);
        }

        int v3;
        for(v3 = 0; v3 < v5; ++v3) {
            int v4;
            for(v4 = 0; v4 < v7; ++v4) {
                if(v0.ap[v3][v4] == null) {
                    v0.ap[v3][v4] = new cc(v0.ae.ah(v6) + v3, v0.ae.ay(0x809D3353) + v4, v0.ae.az(0x918E607E), v0.af);
                    v0.ap[v3][v4].ad(v0.ae.al, v0.ae.ae, 62);
                }
            }
        }

        System.nanoTime();
        System.nanoTime();
        if(v1.ao(dv.ae.ap, v2, 21)) {
            v0.ar = ah.ax(v1.as(dv.ae.ap, v2, 0x5320F9F5), 0);
        }

        System.nanoTime();
        v1.az(-23);
        v1.ah(0xB183C6DB);
        v0.ax = true;
    }

    dp aj(int arg6, int arg7, int arg8, int arg9, int arg10) {
        try {
            dp v10 = new dp(this);
            int v0 = this.ai * 0x52702F45 + arg6;
            arg7 += this.av * -238403059;
            arg6 = this.ai * 0x52702F45 + arg8;
            v0 /= 0x40;
            arg7 /= 0x40;
            arg9 = (arg9 + this.av * -238403059) / 0x40;
            arg8 = 2006997451;
            v10.ax = (arg6 / 0x40 - v0 + 1) * arg8;
            arg6 = 0xF337930D;
            v10.al = (arg9 - arg7 + 1) * arg6;
            v10.ae = (v0 - this.ae.ah(0x999D058)) * 0xBB4DCACF;
            v10.ar = (arg7 - this.ae.ay(0x818E29C9)) * -2042356501;
            arg9 = 0x5AACFC2F;
            if(v10.ae * arg9 < 0) {
                v10.ax += v10.ae * 0x81385045;
                v10.ae = 0;
            }

            int v3 = 0xB6E903E3;
            if(v10.ae * arg9 > this.ap.length - v10.ax * v3) {
                v10.ax = (this.ap.length - v10.ae * arg9) * arg8;
            }

            arg9 = 0xB927ABC3;
            if(v10.ar * arg9 < 0) {
                v10.al += v10.ar * 780775911;
                v10.ar = 0;
            }

            int v4 = -190745659;
            if(v10.ar * arg9 > this.ap[0].length - v10.al * v4) {
                v10.al = (this.ap[0].length - v10.ar * arg9) * arg6;
            }

            v10.ax = Math.min(v10.ax * v3, this.ap.length) * arg8;
            v10.al = Math.min(v10.al * v4, this.ap[0].length) * arg6;
            return v10;
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("cy.aj(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }
    }

    public List ak(int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26) {
        cy v6 = this;
        LinkedList v8 = new LinkedList();
        if(!v6.ax) {
            return ((List)v8);
        }

        dp v0 = this.aj(arg17, arg18, arg19, arg20, 0x1492E6B5);
        int v1 = ((int)(v6.af(arg23, arg19 - arg17, 0x6DADDF81) * 64f));
        int v2 = arg17 + v6.ai * 0x8946B406;
        int v3 = v6.av * 0xB464EF70 + arg18;
        int v5;
        for(v5 = v0.ae * 0x62B1A100; v5 < v0.ax * 0xB6E903E3 + v0.ae * 1013634798; ++v5) {
            int v7;
            for(v7 = v0.ar * 0x9689E792; v7 < v0.al * -190745659 + v0.ar * 0xB927ABC3; ++v7) {
                List v9 = v6.ap[v5][v7].bx((v6.ap[v5][v7].ad * 0x8B8B6FEB - v2) * v1 / 1475025429 + arg21, arg24 + arg22 - (v6.ap[v5][v7].aq * 1480714304 - v3 + 0x40) * v1 / 0x98CAEB51, v1, arg25, arg26, 62);
                if(!v9.isEmpty()) {
                    v8.addAll(((Collection)v9));
                }
            }
        }

        return ((List)v8);
    }

    public static dy al(int arg4, int arg5) {
        try {
            long v0 = ((long)arg4);
            mv v5 = dy.al.ax(v0);
            if(v5 != null) {
                return ((dy)v5);
            }

            byte[] v4_1 = dy.ax.ae(8, arg4, 0x78DC0DC9);
            dy v5_1 = new dy();
            if(v4_1 != null) {
                v5_1.ae(new lq(v4_1), 0x65FAF74D);
            }

            dy.al.ae(((mv)v5_1), v0);
            return v5_1;
        }
        catch(RuntimeException v4) {
            StringBuilder v5_2 = new StringBuilder();
            v5_2.append("cy.al(");
            v5_2.append(')');
            throw lx.al(((Throwable)v4), v5_2.toString());
        }
    }

    public final void al(int arg3) {
        HashMap v3 = null;
        try {
            this.an = v3;
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cy.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    public static void am(Collection arg1, int arg2) {
        try {
            arg1.add(ar.av);
            arg1.add(ar.aa);
            arg1.add(ar.au);
            arg1.add(ar.am);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cy.am(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public final void am() {
        this.an = null;
    }

    public void an(int arg15, int arg16, int arg17, int arg18, HashSet arg19, int arg20, int arg21, fa arg22, byte arg23) {
        Iterator v3_1;
        Object v3;
        cy v1 = this;
        try {
            if(v1.ar == null) {
                return;
            }

            arg22.at(v1.ar, arg15, arg16, arg17, arg18, 0x4390813B);
            if(arg20 > 0) {
                if(arg20 % arg21 >= arg21 / 2) {
                }
                else {
                    if(v1.an == null) {
                        this.ab(0x6A87C7FC);
                    }

                    Iterator v2 = arg19.iterator();
                    while(true) {
                    label_22:
                        if(!v2.hasNext()) {
                            return;
                        }

                        v3 = v1.an.get(Integer.valueOf(v2.next().intValue()));
                        if(v3 != null) {
                            break;
                        }
                    }

                    v3_1 = ((List)v3).iterator();
                    goto label_32;
                }
            }

            return;
        }
        catch(RuntimeException v0) {
            goto label_74;
        }

        return;
        try {
            while(true) {
            label_32:
                if(!v3_1.hasNext()) {
                    goto label_22;
                }

                Object v4 = v3_1.next();
                arg22.ai((((cg)v4).ax.al * 0xAEACF223 - v1.ai * 0x52702F45) * arg17 / (v1.aa * 0x412FEBC1) + arg15, arg16 + (arg18 - (((cg)v4).ax.ae * 0xB230B0A5 - v1.av * -238403059) * arg18 / (v1.au * 1664997303)), 2, 0xFFFF00, -79);
            }
        }
        catch(RuntimeException v0) {
        label_74:
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("cy.an(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0), v2_1.toString());
        }
    }

    public void ao(int arg15, int arg16, int arg17, int arg18, HashSet arg19, int arg20, int arg21, fa arg22) {
        Object v2;
        cy v0 = this;
        if(v0.ar == null) {
            return;
        }

        arg22.at(v0.ar, arg15, arg16, arg17, arg18, 0x4390813B);
        if(arg20 > 0) {
            if(arg20 % arg21 >= arg21 / 2) {
            }
            else {
                if(v0.an == null) {
                    this.ab(0x6A87C7FC);
                }

                Iterator v1 = arg19.iterator();
                while(true) {
                label_22:
                    if(!v1.hasNext()) {
                        return;
                    }

                    v2 = v0.an.get(Integer.valueOf(v1.next().intValue()));
                    if(v2 != null) {
                        break;
                    }
                }

                Iterator v2_1 = ((List)v2).iterator();
                goto label_32;
                return;
                while(true) {
                label_32:
                    if(!v2_1.hasNext()) {
                        goto label_22;
                    }

                    Object v3 = v2_1.next();
                    arg22.ai((((cg)v3).ax.al * 0xAEACF223 - v0.ai * 0x52702F45) * arg17 / (v0.aa * 0x412FEBC1) + arg15, arg16 + (arg18 - (((cg)v3).ax.ae * 2090381600 - v0.av * -2015044249) * arg18 / (v0.au * 0xD8AF9B10)), 2, 0xF045ADE2, -97);
                }
            }
        }
    }

    public List ap(int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, byte arg28) {
        int v6;
        int v4;
        LinkedList v8;
        cy v7 = this;
        try {
            v8 = new LinkedList();
            if(!v7.ax) {
                return ((List)v8);
            }

            dp v1 = this.aj(arg18, arg19, arg20, arg21, 0xA8AA7F71);
            int v2 = ((int)(v7.af(arg24, arg20 - arg18, 0x5DF9258C) * 64f));
            int v0_1 = arg18 + v7.ai * 0x52702F45;
            int v3 = v7.av * -238403059 + arg19;
            int v5 = 0x5AACFC2F;
            v4 = v1.ae * v5;
            while(true) {
            label_31:
                if(v4 >= v1.ax * 0xB6E903E3 + v1.ae * v5) {
                    goto label_85;
                }

                int v16 = 0xB927ABC3;
                v6 = v1.ar * v16;
                while(true) {
                label_41:
                    if(v6 >= v1.al * -190745659 + v1.ar * v16) {
                        goto label_83;
                    }

                    List v9 = v7.ap[v4][v6].bx((v7.ap[v4][v6].ad * 0x1AF71D40 - v0_1) * v2 / 0x40 + arg22, arg25 + arg23 - (v7.ap[v4][v6].aq * 1480714304 - v3 + 0x40) * v2 / 0x40, v2, arg26, arg27, 17);
                    if(!v9.isEmpty()) {
                        v8.addAll(((Collection)v9));
                    }

                    break;
                }
            }
        }
        catch(RuntimeException v0) {
            goto label_88;
        }

        ++v6;
        goto label_41;
    label_83:
        ++v4;
        goto label_31;
    label_85:
        return ((List)v8);
    label_88:
        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("cy.ap(");
        v1_1.append(')');
        throw lx.al(((Throwable)v0), v1_1.toString());
    }

    public HashMap aq(byte arg3) {
        int v3 = 0x6A87C7FC;
        try {
            this.ab(v3);
            return this.an;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cy.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    public static void ar(lq arg16, int arg17, int arg18) {
        Method[] v6_2;
        int v5;
        int v4;
        ow v1;
        lq v0 = arg16;
        try {
            v1 = new ow();
            v1.al = v0.ay(-1) * 0xEBA73795;
            v1.ax = v0.ac(0x74) * 0xB2CB5FD;
            v4 = -1490920515;
            v1.ae = new int[v1.al * v4];
            v1.ar = new int[v1.al * v4];
            v1.an = new Field[v1.al * v4];
            v1.ap = new int[v1.al * v4];
            v1.aj = new Method[v1.al * v4];
            v1.ad = new byte[v1.al * v4][][];
            v5 = 0;
        label_40:
            while(v5 >= v1.al * v4) {
                goto label_191;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_196;
        }

        byte v6 = -48;
        try {
            int v6_1 = v0.ay(v6);
            if(v6_1 != 0 && 1 != v6_1) {
                if(v6_1 == 2) {
                }
                else {
                    int v8 = 3;
                    if(v8 != v6_1 && v6_1 != 4) {
                        goto label_187;
                    }

                    String v9 = v0.bn(-16);
                    String v10 = v0.bn(-62);
                    int v11 = v0.ay(-86);
                    String[] v12 = new String[v11];
                    int v13;
                    for(v13 = 0; v13 < v11; ++v13) {
                        v12[v13] = v0.bn(0x2F);
                    }

                    String v13_1 = v0.bn(-74);
                    byte[][] v14 = new byte[v11][];
                    if(v6_1 == v8) {
                        for(v8 = 0; v8 < v11; ++v8) {
                            int v15 = v0.ac(84);
                            v14[v8] = new byte[v15];
                            v0.bw(v14[v8], 0, v15, -614742036);
                        }
                    }

                    v1.ae[v5] = v6_1;
                    Class[] v2 = new Class[v11];
                    for(v4 = 0; v4 < v11; ++v4) {
                        v2[v4] = ab.an(v12[v4], -46);
                    }

                    Class v4_1 = ab.an(v13_1, -21);
                    if(ab.an(v9, 8).getClassLoader() != null) {
                        v6_2 = ab.an(v9, 7).getDeclaredMethods();
                        v8 = 0;
                    }
                    else {
                        throw new SecurityException();
                    }

                    while(v8 < v6_2.length) {
                        Method v9_1 = v6_2[v8];
                        if(v9_1.getName().equals(v10)) {
                            Class[] v11_1 = v9_1.getParameterTypes();
                            if(v11_1.length == v2.length) {
                                int v12_1 = 0;
                                while(true) {
                                    if(v12_1 >= v2.length) {
                                        break;
                                    }
                                    else if(v2[v12_1] != v11_1[v12_1]) {
                                        v11 = 0;
                                    }
                                    else {
                                        ++v12_1;
                                        continue;
                                    }

                                    goto label_128;
                                }

                                v11 = 1;
                            label_128:
                                if(v11 == 0) {
                                    goto label_133;
                                }

                                if(v4_1 != v9_1.getReturnType()) {
                                    goto label_133;
                                }

                                v1.aj[v5] = v9_1;
                            }
                        }

                    label_133:
                        ++v8;
                    }

                    v1.ad[v5] = v14;
                    goto label_187;
                }
            }

            String v2_1 = v0.bn(-53);
            String v4_2 = v0.bn(-43);
            int v7 = 1 == v6_1 ? v0.ac(0x20) : 0;
            v1.ae[v5] = v6_1;
            v1.ap[v5] = v7;
            if(ab.an(v2_1, 36).getClassLoader() != null) {
                v1.an[v5] = ab.an(v2_1, -72).getDeclaredField(v4_2);
                goto label_187;
            }

            throw new SecurityException();
        }
        catch(RuntimeException v0_1) {
        }
        catch(Throwable ) {
        }
        catch(Exception ) {
        }
        catch(NullPointerException ) {
        }
        catch(SecurityException ) {
        }
        catch(ClassNotFoundException ) {
            try {
                v1.ar[v5] = -1;
                goto label_187;
                v1.ar[v5] = -2;
                goto label_187;
                v1.ar[v5] = -3;
                goto label_187;
                v1.ar[v5] = -4;
                goto label_187;
                v1.ar[v5] = -5;
            label_187:
                ++v5;
                v4 = -1490920515;
                goto label_40;
            label_191:
                oj.ax.al(((mx)v1));
                return;
            }
            catch(RuntimeException v0_1) {
            label_196:
                StringBuilder v1_1 = new StringBuilder();
                v1_1.append("cy.ar(");
                v1_1.append(')');
                throw lx.al(((Throwable)v0_1), v1_1.toString());
            }
        }
    }

    public final void ar(int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, HashSet arg27, HashSet arg28, int arg29, int arg30, boolean arg31, fa arg32, byte arg33) {
        int v17;
        cy v7 = this;
        int v6 = 0xB8C3495;
        cy v1 = this;
        int v2 = arg19;
        int v3 = arg20;
        int v4 = arg21;
        int v5 = arg22;
        try {
            dp v1_1 = v1.aj(v2, v3, v4, v5, v6);
            v2 = ((int)(v7.af(arg25 - arg23, arg21 - arg19, 420793189) * 64f));
            v4 = v7.ai * 0x52702F45 + arg19;
            int v0_1 = arg20 + v7.av * -238403059;
            v5 = 0x5AACFC2F;
            for(v3 = v1_1.ae * v5; true; ++v3) {
                int v9 = 0xB6E903E3;
                int v16 = -190745659;
                v17 = 0xB927ABC3;
                if(v3 >= v1_1.ax * v9 + v1_1.ae * v5) {
                    break;
                }

                for(v6 = v1_1.ar * v17; v6 < v1_1.ar * v17 + v1_1.al * v16; ++v6) {
                    if(arg31) {
                        v7.ap[v3][v6].af(-97);
                    }

                    v7.ap[v3][v6].am(arg23 + (v7.ap[v3][v6].ad * 0x1AF71D40 - v4) * v2 / 0x40, arg26 - (v7.ap[v3][v6].aq * 1480714304 - v0_1 + 0x40) * v2 / 0x40, v2, arg27, arg32, 0xBD5A068C);
                }
            }

            if(arg28 != null && arg29 > 0) {
                v3 = v1_1.ae * v5;
                while(true) {
                label_86:
                    if(v3 < v1_1.ae * v5 + v1_1.ax * v9) {
                        v4 = v1_1.ar * v17;
                        while(true) {
                            if(v4 < v1_1.ar * v17 + v1_1.al * v16) {
                                v7.ap[v3][v4].az(arg28, arg29, arg30, arg32, 66);
                                ++v4;
                                continue;
                            }
                            else {
                                goto label_113;
                            }
                        }
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v0) {
            goto label_118;
        }

    label_113:
        ++v3;
        goto label_86;
        return;
    label_118:
        StringBuilder v1_2 = new StringBuilder();
        v1_2.append("cy.ar(");
        v1_2.append(')');
        throw lx.al(((Throwable)v0), v1_2.toString());
    }

    public void as(int arg15, int arg16, int arg17, int arg18, HashSet arg19, int arg20, int arg21, fa arg22) {
        Object v2;
        cy v0 = this;
        if(v0.ar == null) {
            return;
        }

        arg22.at(v0.ar, arg15, arg16, arg17, arg18, 0x4390813B);
        if(arg20 > 0) {
            if(arg20 % arg21 >= arg21 / 2) {
            }
            else {
                if(v0.an == null) {
                    this.ab(0x6A87C7FC);
                }

                Iterator v1 = arg19.iterator();
                while(true) {
                label_22:
                    if(!v1.hasNext()) {
                        return;
                    }

                    v2 = v0.an.get(Integer.valueOf(v1.next().intValue()));
                    if(v2 != null) {
                        break;
                    }
                }

                Iterator v2_1 = ((List)v2).iterator();
                goto label_32;
                return;
                while(true) {
                label_32:
                    if(!v2_1.hasNext()) {
                        goto label_22;
                    }

                    Object v3 = v2_1.next();
                    arg22.ai((((cg)v3).ax.al * 0xAEACF223 - v0.ai * 0x52702F45) * arg17 / (v0.aa * 0x412FEBC1) + arg15, arg16 + (arg18 - (((cg)v3).ax.ae * 0xB230B0A5 - v0.av * -238403059) * arg18 / (v0.au * 1664997303)), 2, 0xFFFF00, -105);
                }
            }
        }
    }

    public final void at(int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, fa arg27) {
        cy v6 = this;
        dp v0 = this.aj(arg19, arg20, arg21, arg22, 0xD0D75AFA);
        float v1 = v6.af(arg25 - arg23, arg21 - arg19, 0x6C67D213);
        int v2 = ((int)Math.ceil(((double)v1)));
        v6.am = 0x8E0E143B * v2;
        if(!v6.aj.containsKey(Integer.valueOf(v2))) {
            cl v3 = new cl(v2);
            v3.ar(0x7F);
            v6.aj.put(Integer.valueOf(v2), v3);
        }

        int v4 = 0xB6E903E3;
        int v3_1 = v0.ax * v4 + v0.ae * 0x5AACFC2F - 1;
        int v5 = v0.al * -190745659 + v0.ar * -502167123 - 1;
        int v14;
        for(v14 = v0.ae * 0x5AACFC2F; v14 <= v3_1; ++v14) {
            int v13 = v0.ar * 0x1886CAFF;
            while(v13 <= v5) {
                v6.ap[v14][v13].au(v2, v6.aj.get(Integer.valueOf(v2)), v6.ad, v6.aq, v6.ab, 0x7BF22D04);
                ++v13;
                v14 = v14;
            }
        }

        int v1_1 = ((int)(v1 * 64f));
        v2 = arg19 + v6.ai * 0x52702F45;
        v3_1 = v6.av * 1530663842 + arg20;
        int v7;
        for(v7 = v0.ae * 0xD42752F5; v7 < v0.ax * v4 + v0.ae * 0xBCEBF260; ++v7) {
            for(v5 = v0.ar * 1992852860; v5 < v0.ar * 0xF03AE4CA + v0.al * 0x60EA3796; ++v5) {
                v6.ap[v7][v5].ap((v6.ap[v7][v5].ad * 0x1AF71D40 - v2) * v1_1 / -2085722227 + arg23, arg26 - (v6.ap[v7][v5].aq * 1480714304 - v3_1 - 0x6ED5FDD7) * v1_1 / 0x40, v1_1, arg27, 0x7420312D);
            }
        }
    }

    public final void au() {
        this.an = null;
    }

    public void av(ko arg17, String arg18, boolean arg19) {
        cy v0 = this;
        ko v1 = arg17;
        String v2 = arg18;
        if(v0.al) {
            return;
        }

        v0.ax = false;
        v0.al = true;
        System.nanoTime();
        int v10 = v1.aw(v1.ay(dv.ax.ap, 0xD4A3E869), v2, -29141109);
        lq v8 = new lq(v1.as(dv.ax.ap, v2, 981400632));
        lq v9 = new lq(v1.as(dv.al.ap, v2, 0x39DCF771));
        System.nanoTime();
        System.nanoTime();
        v0.ae = new cx();
        try {
            v0.ae.ax(v8, v9, v10, arg19, 1026716241);
        }
        catch(IllegalStateException ) {
            return;
        }

        v0.ae.ao(1664769190);
        v0.ae.as(0x7F0F0121);
        v0.ae.ak(104);
        int v6 = 0x999D058;
        v0.ai = v0.ae.ah(v6) * 0x5582E340;
        v0.av = v0.ae.ay(-2106781326) * 0xBE373140;
        v0.aa = (v0.ae.at(0x9EB22465) - v0.ae.ah(v6) + 1) * 0x4B891040;
        v0.au = (v0.ae.aw(0x80B70FB7) - v0.ae.ay(-2103621237) + 1) * 0xE96D81C0;
        int v5 = v0.ae.at(0x23823E06) - v0.ae.ah(v6) + 1;
        int v7 = v0.ae.aw(0x83E8C6B1) - v0.ae.ay(0x8111FBE5) + 1;
        System.nanoTime();
        System.nanoTime();
        lb.ar(0x7A);
        v0.ap = new cc[v5][v7];
        Iterator v8_1 = v0.ae.ax.iterator();
        while(v8_1.hasNext()) {
            Object v9_1 = v8_1.next();
            v10 = ((cp)v9_1).ae * 0xF5C1A1F;
            int v12 = ((cp)v9_1).ar * 0x82A1F09D;
            int v11 = v10 - v0.ae.ah(v6);
            int v13 = v12 - v0.ae.ay(0x81FA93B7);
            v0.ap[v11][v13] = new cc(v10, v12, v0.ae.az(0x8C7252CC), v0.af);
            v0.ap[v11][v13].aj(((cp)v9_1), v0.ae.ae, 0xA6DBC859);
        }

        int v3;
        for(v3 = 0; v3 < v5; ++v3) {
            int v4;
            for(v4 = 0; v4 < v7; ++v4) {
                if(v0.ap[v3][v4] == null) {
                    v0.ap[v3][v4] = new cc(v0.ae.ah(v6) + v3, v0.ae.ay(0x80B86A64) + v4, v0.ae.az(0x52CCFE16), v0.af);
                    v0.ap[v3][v4].ad(v0.ae.al, v0.ae.ae, 17);
                }
            }
        }

        System.nanoTime();
        System.nanoTime();
        if(v1.ao(dv.ae.ap, v2, 67)) {
            v0.ar = ah.ax(v1.as(dv.ae.ap, v2, 0x3AE6AA38), 0);
        }

        System.nanoTime();
        v1.az(-7);
        v1.ah(0xDA56460D);
        v0.ax = true;
    }

    public final void aw(int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, HashSet arg25, HashSet arg26, int arg27, int arg28, boolean arg29, fa arg30) {
        cy v6 = this;
        dp v0 = this.aj(arg17, arg18, arg19, arg20, 0x39FD7F89);
        int v1 = ((int)(v6.af(arg23 - arg21, arg19 - arg17, 0x30D89940) * 64f));
        int v3 = v6.ai * 0x8BDE8307 + arg17;
        int v2 = arg18 + v6.av * -238403059;
        int v5;
        for(v5 = v0.ae * 0x5AACFC2F; v5 < v0.ax * 0xB6E903E3 + v0.ae * 0xB26FC9AB; ++v5) {
            int v4;
            for(v4 = v0.ar * 0xF8971F88; v4 < v0.ar * 0x978E89F + v0.al * 0x6F21A0AB; ++v4) {
                if(arg29) {
                    v6.ap[v5][v4].af(-58);
                }

                v6.ap[v5][v4].am(arg21 + (v6.ap[v5][v4].ad * -1537330536 - v3) * v1 / 0x40, arg24 - (v6.ap[v5][v4].aq * 1480714304 - v2 + 0x40) * v1 / 0x40, v1, arg25, arg30, -2031680467);
            }
        }

        if(arg26 != null && arg27 > 0) {
            for(v2 = v0.ae * 0xC4AC15EA; v2 < v0.ae * 0x15E6E063 + v0.ax * 0xDB780752; ++v2) {
                for(v5 = v0.ar * 0xB927ABC3; v5 < v0.ar * 783465059 + v0.al * -190745659; ++v5) {
                    v6.ap[v2][v5].az(arg26, arg27, arg28, arg30, 0x6F);
                }
            }
        }
    }

    public void ax(ko arg17, String arg18, boolean arg19, int arg20) {
        int v10;
        cy v1 = this;
        ko v0 = arg17;
        String v2 = arg18;
        try {
            if(v1.al) {
                return;
            }

            v1.ax = false;
            v1.al = true;
            System.nanoTime();
            v10 = v0.aw(v0.ay(dv.ax.ap, 0xD4A3E869), v2, 0x37A05E0C);
            lq v8 = new lq(v0.as(dv.ax.ap, v2, 1655204053));
            lq v9 = new lq(v0.as(dv.al.ap, v2, 0x79486DE0));
            System.nanoTime();
            System.nanoTime();
            v1.ae = new cx();
            try {
                v1.ae.ax(v8, v9, v10, arg19, 0x552200E1);
            }
            catch(IllegalStateException ) {
                return;
            }
        }
        catch(RuntimeException v0_1) {
            goto label_203;
        }

        try {
            v1.ae.ao(0x689F7B70);
            v1.ae.as(0x7F0F0121);
            v1.ae.ak(49);
            int v6 = 0x999D058;
            v1.ai = v1.ae.ah(v6) * 0x5582E340;
            v1.av = v1.ae.ay(0x81FC9D78) * 0xBE373140;
            v1.aa = (v1.ae.at(0xC68E83B5) - v1.ae.ah(v6) + 1) * 0x4B891040;
            v1.au = (v1.ae.aw(-2103887716) - v1.ae.ay(0x81613E92) + 1) * 0xE96D81C0;
            int v5 = v1.ae.at(0xB5E83AF3) - v1.ae.ah(v6) + 1;
            int v7 = v1.ae.aw(-2088581842) - v1.ae.ay(-2146343005) + 1;
            System.nanoTime();
            System.nanoTime();
            lb.ar(0x71);
            v1.ap = new cc[v5][v7];
            Iterator v8_1 = v1.ae.ax.iterator();
            while(v8_1.hasNext()) {
                Object v9_1 = v8_1.next();
                v10 = ((cp)v9_1).ae * 0xF5C1A1F;
                int v12 = ((cp)v9_1).ar * 0x82A1F09D;
                int v11 = v10 - v1.ae.ah(v6);
                int v13 = v12 - v1.ae.ay(0x81E2DB58);
                v1.ap[v11][v13] = new cc(v10, v12, v1.ae.az(0x4F3AF4A9), v1.af);
                v1.ap[v11][v13].aj(((cp)v9_1), v1.ae.ae, -2048142230);
            }

            int v3;
            for(v3 = 0; v3 < v5; ++v3) {
                int v4;
                for(v4 = 0; v4 < v7; ++v4) {
                    if(v1.ap[v3][v4] == null) {
                        v1.ap[v3][v4] = new cc(v1.ae.ah(v6) + v3, v1.ae.ay(0x820AA4D3) + v4, v1.ae.az(1142145800), v1.af);
                        v1.ap[v3][v4].ad(v1.ae.al, v1.ae.ae, 59);
                    }
                }
            }

            System.nanoTime();
            System.nanoTime();
            if(v0.ao(dv.ae.ap, v2, 61)) {
                v1.ar = ah.ax(v0.as(dv.ae.ap, v2, 0x77052E8F), 0);
            }

            System.nanoTime();
            v0.az(-121);
            v0.ah(0x8C0A00BF);
            v1.ax = true;
            return;
        }
        catch(RuntimeException v0_1) {
        label_203:
            StringBuilder v2_1 = new StringBuilder();
            v2_1.append("cy.ax(");
            v2_1.append(')');
            throw lx.al(((Throwable)v0_1), v2_1.toString());
        }
    }

    public final void ay(int arg22, int arg23, int arg24, int arg25, int arg26, int arg27, int arg28, int arg29, fa arg30) {
        cy v6 = this;
        dp v0 = this.aj(arg22, arg23, arg24, arg25, 0x87E064F6);
        float v1 = v6.af(arg28 - arg26, arg24 - arg22, 0x7FDAB115);
        int v2 = ((int)Math.ceil(((double)v1)));
        v6.am = 0x8D9299F7 * v2;
        if(!v6.aj.containsKey(Integer.valueOf(v2))) {
            cl v3 = new cl(v2);
            v3.ar(30);
            v6.aj.put(Integer.valueOf(v2), v3);
        }

        int v4 = 0xB6E903E3;
        int v15 = 0x5AACFC2F;
        int v3_1 = v0.ax * v4 + v0.ae * v15 - 1;
        int v16 = -190745659;
        int v17 = 0xB927ABC3;
        int v5 = v0.al * v16 + v0.ar * v17 - 1;
        int v14;
        for(v14 = v0.ae * v15; v14 <= v3_1; ++v14) {
            int v13 = v0.ar * v17;
            while(v13 <= v5) {
                v6.ap[v14][v13].au(v2, v6.aj.get(Integer.valueOf(v2)), v6.ad, v6.aq, v6.ab, 0x5709FEB5);
                ++v13;
                v14 = v14;
            }
        }

        int v1_1 = ((int)(v1 * 64f));
        v2 = arg22 + v6.ai * 0x52702F45;
        v3_1 = v6.av * -238403059 + arg23;
        for(v5 = v0.ae * v15; v5 < v0.ax * v4 + v0.ae * v15; ++v5) {
            int v7;
            for(v7 = v0.ar * v17; v7 < v0.ar * v17 + v0.al * v16; ++v7) {
                v6.ap[v5][v7].ap((v6.ap[v5][v7].ad * 0x1AF71D40 - v2) * v1_1 / 0x40 + arg26, arg29 - (v6.ap[v5][v7].aq * 1480714304 - v3_1 + 0x40) * v1_1 / 0x40, v1_1, arg30, 0x518FE650);
            }
        }
    }

    public final void az() {
        this.an = null;
    }

    public List ba(int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26, int arg27) {
        cy v6 = this;
        LinkedList v8 = new LinkedList();
        if(!v6.ax) {
            return ((List)v8);
        }

        dp v0 = this.aj(arg18, arg19, arg20, arg21, 0x81CCF745);
        int v1 = ((int)(v6.af(arg24, arg20 - arg18, 0x2FF432AF) * 64f));
        int v2 = arg18 + v6.ai * 0x52702F45;
        int v3 = v6.av * -238403059 + arg19;
        int v5 = 0x5AACFC2F;
        int v4;
        for(v4 = v0.ae * v5; v4 < v0.ax * 0xB6E903E3 + v0.ae * v5; ++v4) {
            int v16 = 0xB927ABC3;
            int v7;
            for(v7 = v0.ar * v16; v7 < v0.al * -190745659 + v0.ar * v16; ++v7) {
                List v9 = v6.ap[v4][v7].bx((v6.ap[v4][v7].ad * 0x1AF71D40 - v2) * v1 / 0x40 + arg22, arg25 + arg23 - (v6.ap[v4][v7].aq * 1480714304 - v3 + 0x40) * v1 / 0x40, v1, arg26, arg27, 88);
                if(!v9.isEmpty()) {
                    v8.addAll(((Collection)v9));
                }
            }
        }

        return ((List)v8);
    }

    static final int bc(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        return arg2 * arg1 - arg0 * arg3 >> 16;
    }

    public List bd(int arg17, int arg18, int arg19, int arg20, int arg21, int arg22, int arg23, int arg24, int arg25, int arg26) {
        cy v6 = this;
        LinkedList v8 = new LinkedList();
        if(!v6.ax) {
            return ((List)v8);
        }

        dp v0 = this.aj(arg17, arg18, arg19, arg20, 0x58B83EE6);
        int v1 = ((int)(v6.af(arg23, arg19 - arg17, 0x431F8A4E) * 64f));
        int v2 = arg17 + v6.ai * 0x17C576F4;
        int v3 = v6.av * 0x5F0F7794 + arg18;
        int v5;
        for(v5 = v0.ae * 0x4BE8DAD7; v5 < v0.ax * 0xB6E903E3 + v0.ae * 2038843947; ++v5) {
            int v7;
            for(v7 = v0.ar * 0xB927ABC3; v7 < v0.al * -1571603289 + v0.ar * 0xD1E323A2; ++v7) {
                List v9 = v6.ap[v5][v7].bx((v6.ap[v5][v7].ad * 0xB4F6CE69 - v2) * v1 / 0x99F8BB9E + arg21, arg24 + arg22 - (v6.ap[v5][v7].aq * 1480714304 - v3 + 0x40) * v1 / 0xEC6176B7, v1, arg25, arg26, 44);
                if(!v9.isEmpty()) {
                    v8.addAll(((Collection)v9));
                }
            }
        }

        return ((List)v8);
    }

    dp bf(int arg7, int arg8, int arg9, int arg10) {
        dp v0 = new dp(this);
        int v1 = this.ai * 0x52702F45 + arg7;
        arg8 += this.av * -238403059;
        arg7 = this.ai * 0x52702F45 + arg9;
        v1 /= 0x40;
        arg8 /= 0x40;
        arg10 = (arg10 + this.av * -238403059) / 0x40;
        arg9 = 2006997451;
        v0.ax = (arg7 / 0x40 - v1 + 1) * arg9;
        arg7 = 0xF337930D;
        v0.al = (arg10 - arg8 + 1) * arg7;
        v0.ae = (v1 - this.ae.ah(0x999D058)) * 0xBB4DCACF;
        v0.ar = (arg8 - this.ae.ay(0x80B6E45B)) * -2042356501;
        arg10 = 0x5AACFC2F;
        if(v0.ae * arg10 < 0) {
            v0.ax += v0.ae * 0x81385045;
            v0.ae = 0;
        }

        int v4 = 0xB6E903E3;
        if(v0.ae * arg10 > this.ap.length - v0.ax * v4) {
            v0.ax = (this.ap.length - v0.ae * arg10) * arg9;
        }

        arg10 = 0xB927ABC3;
        if(v0.ar * arg10 < 0) {
            v0.al += v0.ar * 780775911;
            v0.ar = 0;
        }

        int v5 = -190745659;
        if(v0.ar * arg10 > this.ap[0].length - v0.al * v5) {
            v0.al = (this.ap[0].length - v0.ar * arg10) * arg7;
        }

        v0.ax = Math.min(v0.ax * v4, this.ap.length) * arg9;
        v0.al = Math.min(v0.al * v5, this.ap[0].length) * arg7;
        return v0;
    }

    float bg(int arg3, int arg4) {
        float v3 = (((float)arg3)) / (((float)arg4));
        float v4 = 8f;
        if(v3 > v4) {
            return v4;
        }

        v4 = 1f;
        if(v3 < v4) {
            return v4;
        }

        v4 = ((float)Math.round(v3));
        if(Math.abs(v4 - v3) < 0.05f) {
            return v4;
        }

        return v3;
    }

    float bh(int arg3, int arg4) {
        float v3 = (((float)arg3)) / (((float)arg4));
        float v4 = 8f;
        if(v3 > v4) {
            return v4;
        }

        v4 = 1f;
        if(v3 < v4) {
            return v4;
        }

        v4 = ((float)Math.round(v3));
        if(Math.abs(v4 - v3) < 0.05f) {
            return v4;
        }

        return v3;
    }

    dp bn(int arg5, int arg6, int arg7, int arg8) {
        dp v0 = new dp(this);
        int v2 = this.ai * 0xB0E67D83 + arg5;
        arg6 += this.av * -238403059;
        int v3 = this.ai * -1909227083 + arg7;
        v2 /= 656074628;
        arg6 /= 0xDF264028;
        arg8 = (arg8 + this.av * -238403059) / 0xF2EF73F7;
        arg5 = 2006997451;
        v0.ax = (v3 / 0x45B44A72 - v2 + 1) * arg5;
        v0.al = (arg8 - arg6 + 1) * 0xBBF7F909;
        v0.ae = (v2 - this.ae.ah(0x999D058)) * 0x525A5C31;
        v0.ar = (arg6 - this.ae.ay(0x8048993F)) * -2042356501;
        if(v0.ae * -415486803 < 0) {
            v0.ax += v0.ae * -1009978965;
            v0.ae = 0;
        }

        if(v0.ae * 0xAD5973CF > this.ap.length - v0.ax * 0xB6E903E3) {
            v0.ax = (this.ap.length - v0.ae * 0x5AACFC2F) * arg5;
        }

        if(v0.ar * 0xB927ABC3 < 0) {
            v0.al += v0.ar * 0x9D27E954;
            v0.ar = 0;
        }

        if(v0.ar * 0x13B050F2 > this.ap[0].length - v0.al * -1003618402) {
            v0.al = (this.ap[0].length - v0.ar * 0xF28F1F9D) * 0xF337930D;
        }

        v0.ax = Math.min(v0.ax * 0x34A57716, this.ap.length) * arg5;
        v0.al = Math.min(v0.al * -190745659, this.ap[0].length) * 0xC52E7313;
        return v0;
    }

    public boolean bo() {
        return this.ax;
    }

    public static mz bp(Socket arg0, int arg1, int arg2, int arg3) throws IOException {
        try {
            return new mp(arg0, arg1, arg2);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cy.bp(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    dp bp(int arg6, int arg7, int arg8, int arg9) {
        dp v0 = new dp(this);
        int v2 = this.ai * 0x4C5C6DC2 + arg6;
        arg7 += this.av * 0x2CFF9EF6;
        int v1 = this.ai * 0xB33C55BF + arg8;
        v2 /= 0xBCF8BBD5;
        arg7 /= 0x40;
        arg9 = (arg9 + this.av * -238403059) / 0x40;
        v0.ax = (v1 / 0x40 - v2 + 1) * -2080739874;
        arg6 = 0xF337930D;
        v0.al = (arg9 - arg7 + 1) * arg6;
        v0.ae = (v2 - this.ae.ah(0x999D058)) * 0x2CFBC276;
        v0.ar = (arg7 - this.ae.ay(-2119268580)) * 0x3ABAFF97;
        if(v0.ae * 0x4870C1F1 < 0) {
            v0.ax += v0.ae * 0x81385045;
            v0.ae = 0;
        }

        v2 = 0xB6E903E3;
        v1 = 2006997451;
        if(v0.ae * 0x5AACFC2F > this.ap.length - v0.ax * v2) {
            v0.ax = (this.ap.length - v0.ae * 1232905262) * v1;
        }

        arg9 = 0xB927ABC3;
        if(v0.ar * arg9 < 0) {
            v0.al += v0.ar * -1315271105;
            v0.ar = 0;
        }

        int v4 = -190745659;
        if(v0.ar * arg9 > this.ap[0].length - v0.al * v4) {
            v0.al = (this.ap[0].length - v0.ar * -1031973450) * arg6;
        }

        v0.ax = Math.min(v0.ax * v2, this.ap.length) * v1;
        v0.al = Math.min(v0.al * v4, this.ap[0].length) * arg6;
        return v0;
    }

    public HashMap bq() {
        this.ab(0x6A87C7FC);
        return this.an;
    }

    public HashMap bt() {
        this.ab(0x6A87C7FC);
        return this.an;
    }

    public HashMap bv() {
        this.ab(0x6A87C7FC);
        return this.an;
    }

    dp bw(int arg4, int arg5, int arg6, int arg7) {
        dp v0 = new dp(this);
        int v2 = this.ai * 0x52702F45 + arg4;
        arg5 += this.av * 2095298631;
        int v1 = this.ai * 0x6420F120 + arg6;
        v2 /= 0xB2AEA148;
        arg5 /= 0x40;
        arg7 = (arg7 + this.av * -238403059) / 0x40;
        v0.ax = (v1 / 0x40 - v2 + 1) * 0x5A279AA6;
        v0.al = (arg7 - arg5 + 1) * 0xF337930D;
        v0.ae = (v2 - this.ae.ah(0x999D058)) * 0xBB4DCACF;
        v0.ar = (arg5 - this.ae.ay(0x81D821D8)) * -2042356501;
        if(v0.ae * 0x7E220D65 < 0) {
            v0.ax += v0.ae * -384339064;
            v0.ae = 0;
        }

        arg6 = 0x5AACFC2F;
        v1 = 2006997451;
        if(v0.ae * arg6 > this.ap.length - v0.ax * 985047598) {
            v0.ax = (this.ap.length - v0.ae * arg6) * v1;
        }

        if(v0.ar * 0xB927ABC3 < 0) {
            v0.al += v0.ar * 0x5BEE9675;
            v0.ar = 0;
        }

        if(v0.ar * -490353641 > this.ap[0].length - v0.al * 0xF0634962) {
            v0.al = (this.ap[0].length - v0.ar * -1270667939) * 0x9E0F83DA;
        }

        v0.ax = Math.min(v0.ax * 0x5F33B160, this.ap.length) * v1;
        v0.al = Math.min(v0.al * -190745659, this.ap[0].length) * 0xDF3CECE;
        return v0;
    }

    void bx() {
        if(this.an == null) {
            this.an = new HashMap();
        }

        this.an.clear();
        int v1;
        for(v1 = 0; v1 < this.ap.length; ++v1) {
            int v2;
            for(v2 = 0; v2 < this.ap[v1].length; ++v2) {
                Iterator v3 = this.ap[v1][v2].bg(101).iterator();
                while(v3.hasNext()) {
                    Object v4 = v3.next();
                    if(!((cg)v4).ap(1023204699)) {
                        continue;
                    }

                    int v5 = ((cg)v4).al(-113);
                    if(!this.an.containsKey(Integer.valueOf(v5))) {
                        LinkedList v6 = new LinkedList();
                        v6.add(v4);
                        this.an.put(Integer.valueOf(v5), v6);
                        continue;
                    }

                    this.an.get(Integer.valueOf(v5)).add(v4);
                }
            }
        }
    }

    public boolean by() {
        return this.ax;
    }

    float bz(int arg3, int arg4) {
        float v3 = (((float)arg3)) / (((float)arg4));
        float v4 = 8f;
        if(v3 > v4) {
            return v4;
        }

        v4 = 1f;
        if(v3 < v4) {
            return v4;
        }

        v4 = ((float)Math.round(v3));
        if(Math.abs(v4 - v3) < 0.05f) {
            return v4;
        }

        return v3;
    }

    static final void hv(int arg3) {
        try {
            na v3_1 = cd.al(nf.ak, client.eh.an, 0x910381D5);
            v3_1.ae.ar(0, 71);
            client.eh.ae(v3_1, 0xB44E873C);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cy.hv(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

