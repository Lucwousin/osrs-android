package com.jagex.oldscape.osrenderer;

import lx;

public class ax {
    static boolean ax = false;

    static {
    }

    ax() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void aa(int arg0, int arg1, int arg2) {
        try {
            zv.cu(arg0, arg1);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.aa(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static boolean ab(int arg2) {
        try {
            return zv.se();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ab(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static boolean ac(int arg2) {
        try {
            return zv.va();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ac(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void ad(int arg2) {
        try {
            zv.zt();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void ae(Object arg1, byte arg2) {
        try {
            zv.xp(arg1);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/osrenderer/ax.ae(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void af(int arg2) {
        try {
            zv.sf();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.af(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void ag(int[] arg1, short arg2) {
        try {
            zv.jn(arg1);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/osrenderer/ax.ag(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void ah(boolean arg1, int arg2) {
        try {
            zv.gc(arg1);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/osrenderer/ax.ah(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static boolean ai(int arg2) {
        try {
            return zv.em();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void aj(int arg2) {
        try {
            zv.hb();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int ak(int arg2) {
        try {
            return zv.hn();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ak(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void al(int arg2) {
        try {
            if(!ax.ax) {
                goto label_3;
            }
        }
        catch(RuntimeException v2) {
            goto label_21;
        }

        return;
        try {
        label_3:
            if("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                System.loadLibrary("osrenderer");
                goto label_16;
            }

            System.loadLibrary("windows/x64/OSRenderer");
            goto label_16;
        }
        catch(RuntimeException v2) {
        }
        catch(UnsatisfiedLinkError v2_1) {
            try {
                v2_1.printStackTrace();
            label_16:
                ax.ax = true;
                return;
            }
            catch(RuntimeException v2) {
            label_21:
                StringBuilder v0 = new StringBuilder();
                v0.append("com/jagex/oldscape/osrenderer/ax.al(");
                v0.append(')');
                throw lx.al(((Throwable)v2), v0.toString());
            }
        }
    }

    public static void am(int[] arg1, int arg2) {
        try {
            zv.vm(arg1);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/osrenderer/ax.am(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void an(int arg2) {
        try {
            zv.fo();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.an(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void ao(int arg2) {
        try {
            zv.pn();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ao(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void ap(boolean arg1, int arg2) {
        try {
            zv.nh(arg1);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/osrenderer/ax.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void aq(int arg2) {
        try {
            zv.sd();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void ar(int arg2) {
        try {
            zv.bp();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int as(int arg2) {
        try {
            return zv.xm();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.as(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void at(int arg2) {
        try {
            zv.sq();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.at(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void au(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            zv.ex(arg0, arg1, arg2, arg3);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.au(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void av(int arg0, int arg1, int arg2) {
        try {
            zv.cc(arg0, arg1);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.av(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int[] aw(byte arg2) {
        try {
            return zv.xl();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.aw(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static boolean ax(int arg2) {
        try {
            return ax.ax;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int[] ay(int arg2) {
        try {
            return zv.op();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ay(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void az(int arg0, int[] arg1, int arg2) {
        try {
            zv.fc(arg0, arg1);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.az(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int ba(int[] arg0, int arg1, int arg2) {
        try {
            return zv.jq(arg0, arg1);
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.ba(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void bb(int arg2) {
        try {
            zv.uk();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bb(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void bc(int arg2) {
        try {
            zv.ho();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bc(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int bd(int arg2) {
        try {
            return zv.mz();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bd(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int be(int arg2) {
        try {
            return zv.ds();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.be(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static long bf(int arg2) {
        try {
            return zv.fg();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bf(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void bg(short arg3, short arg4, short arg5, short arg6, short arg7, short arg8, short arg9, short arg10, short arg11, short arg12, short arg13, short arg14, short arg15, short arg16, short arg17, short arg18, short arg19, short arg20, short arg21, short arg22, short arg23, short arg24, short arg25, short arg26, int arg27) {
        try {
            zv.ro(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23, arg24, arg25, arg26);
            return;
        }
        catch(RuntimeException v0) {
            RuntimeException v1 = v0;
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/oldscape/osrenderer/ax.bg(");
            v0_1.append(')');
            throw lx.al(((Throwable)v1), v0_1.toString());
        }
    }

    public static void bh(byte arg2) {
        try {
            zv.to();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bh(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int bi(byte arg2) {
        try {
            return zv.ys();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bi(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int bj(int arg2) {
        try {
            return zv.pv();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bj(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void bk(int[] arg0, int arg1, int arg2) {
        try {
            zv.oe(arg0, arg1);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.bk(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int bl(short arg2) {
        try {
            return zv.qp();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bl(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int bm(byte arg2) {
        try {
            return zv.ev();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bm(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void bn(int arg0, int[] arg1, int[] arg2, int arg3) {
        try {
            zv.nb(arg0, arg1, arg2);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.bn(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void bo(int arg1, int arg2) {
        try {
            zv.fl(arg1);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/osrenderer/ax.bo(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void bp(int arg0, int arg1, int arg2) {
        try {
            zv.id(arg0, arg1);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/osrenderer/ax.bp(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int bq(byte arg2) {
        try {
            return zv.nc();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bq(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int br(int arg2) {
        try {
            return zv.nq();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.br(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static String bs(int arg2) {
        try {
            return zv.rp();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bs(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int bt(int arg3, boolean arg4, boolean arg5, int arg6, int arg7, int arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, int[] arg14, int[] arg15, int[] arg16, int[] arg17, int[] arg18, int[] arg19, int[] arg20, byte[] arg21, short[] arg22, byte[] arg23, byte[] arg24, int[] arg25, int[] arg26, byte arg27) {
        try {
            return zv.oh(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23, arg24, arg25, arg26);
        }
        catch(RuntimeException v0) {
            RuntimeException v1 = v0;
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/oldscape/osrenderer/ax.bt(");
            v0_1.append(')');
            throw lx.al(((Throwable)v1), v0_1.toString());
        }
    }

    public static String bu(int arg2) {
        try {
            return zv.cp();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bu(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int bv(int arg1, int arg2) {
        try {
            return zv.eh(arg1);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/osrenderer/ax.bv(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void bw(int arg1, short arg2) {
        try {
            zv.pe(arg1);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/osrenderer/ax.bw(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static boolean bx(int arg3, long arg4, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, boolean arg18, int arg19) {
        try {
            return zv.qs(arg3, arg4, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18);
        }
        catch(RuntimeException v0) {
            RuntimeException v1 = v0;
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("com/jagex/oldscape/osrenderer/ax.bx(");
            v0_1.append(')');
            throw lx.al(((Throwable)v1), v0_1.toString());
        }
    }

    public static void by(int arg2) {
        try {
            zv.ft();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.by(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static boolean bz(byte arg2) {
        try {
            return zv.od();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.bz(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static int[] ca(int arg2) {
        try {
            return zv.sp();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.ca(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static boolean cb() {
        return ax.ax;
    }

    public static void cc() {
        if(ax.ax) {
            return;
        }

        try {
            if("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                System.loadLibrary("osrenderer");
                goto label_16;
            }

            System.loadLibrary("windows/x64/OSRenderer");
        }
        catch(UnsatisfiedLinkError v0) {
            v0.printStackTrace();
        }

    label_16:
        ax.ax = true;
    }

    public static long cd(int arg2) {
        try {
            return zv.xe();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.cd(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void ce() {
        zv.bp();
    }

    public static String cf(int arg2) {
        try {
            return zv.oa();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.cf(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void cg() {
        zv.hb();
    }

    public static void ch(Object arg0) {
        zv.xp(arg0);
    }

    public static void ci() {
        if(ax.ax) {
            return;
        }

        try {
            if("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                System.loadLibrary("osrenderer");
                goto label_16;
            }

            System.loadLibrary("windows/x64/OSRenderer");
        }
        catch(UnsatisfiedLinkError v0) {
            v0.printStackTrace();
        }

    label_16:
        ax.ax = true;
    }

    public static String cj(int arg2) {
        try {
            return zv.tn();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.cj(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void ck(boolean arg0) {
        zv.nh(arg0);
    }

    public static void cl(boolean arg0) {
        zv.nh(arg0);
    }

    public static void cm(boolean arg0) {
        zv.nh(arg0);
    }

    public static void cn() {
        zv.fo();
    }

    public static void co() {
        zv.sd();
    }

    public static void cp() {
        if(ax.ax) {
            return;
        }

        try {
            if("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                System.loadLibrary("osrenderer");
                goto label_16;
            }

            System.loadLibrary("windows/x64/OSRenderer");
        }
        catch(UnsatisfiedLinkError v0) {
            v0.printStackTrace();
        }

    label_16:
        ax.ax = true;
    }

    public static void cq() {
        zv.hb();
    }

    public static void cr() {
        if(ax.ax) {
            return;
        }

        try {
            if("The Android Project".equals(System.getProperty("java.vm.vendor"))) {
                System.loadLibrary("osrenderer");
                goto label_16;
            }

            System.loadLibrary("windows/x64/OSRenderer");
        }
        catch(UnsatisfiedLinkError v0) {
            v0.printStackTrace();
        }

    label_16:
        ax.ax = true;
    }

    public static void cs() {
        zv.bp();
    }

    public static void ct(boolean arg0) {
        zv.nh(arg0);
    }

    public static void cu() {
        zv.hb();
    }

    public static void cv() {
        zv.hb();
    }

    public static boolean cw() {
        return ax.ax;
    }

    public static String cx(short arg2) {
        try {
            return zv.si();
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/osrenderer/ax.cx(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static boolean cy() {
        return ax.ax;
    }

    public static void cz() {
        zv.bp();
    }

    public static void da(int[] arg0) {
        zv.vm(arg0);
    }

    public static boolean db() {
        return zv.se();
    }

    public static void dc(int arg0, int arg1) {
        zv.cc(arg0, arg1);
    }

    public static void dd(int[] arg0) {
        zv.jn(arg0);
    }

    public static void de() {
        zv.sf();
    }

    public static void df(int arg0, int arg1) {
        zv.cu(arg0, arg1);
    }

    public static void dg(int[] arg0) {
        zv.jn(arg0);
    }

    public static boolean dh() {
        return zv.se();
    }

    public static void di(int[] arg0) {
        zv.vm(arg0);
    }

    public static void dj(int arg0, int arg1) {
        zv.cc(arg0, arg1);
    }

    public static boolean dk() {
        return zv.em();
    }

    public static void dl(int arg0, int arg1) {
        zv.cu(arg0, arg1);
    }

    public static void dm() {
        zv.sf();
    }

    public static void dn(int arg0, int arg1, int arg2, int arg3) {
        zv.ex(arg0, arg1, arg2, arg3);
    }

    public static void do(int arg0, int[] arg1) {
        zv.fc(arg0, arg1);
    }

    public static boolean dp() {
        return zv.se();
    }

    public static void dq(int arg0, int[] arg1) {
        zv.fc(arg0, arg1);
    }

    public static void dr(int arg0, int arg1, int arg2, int arg3) {
        zv.ex(arg0, arg1, arg2, arg3);
    }

    public static void ds(int arg0, int arg1) {
        zv.cc(arg0, arg1);
    }

    public static void dt(int[] arg0) {
        zv.jn(arg0);
    }

    public static void du() {
        zv.sf();
    }

    public static boolean dv() {
        return zv.se();
    }

    public static boolean dw() {
        return zv.se();
    }

    public static void dx(int arg0, int arg1, int arg2, int arg3) {
        zv.ex(arg0, arg1, arg2, arg3);
    }

    public static void dy(int arg0, int arg1) {
        zv.cc(arg0, arg1);
    }

    public static void dz(int arg0, int[] arg1) {
        zv.fc(arg0, arg1);
    }

    public static void ea(boolean arg0) {
        zv.gc(arg0);
    }

    public static int eb() {
        return zv.hn();
    }

    public static boolean ec() {
        return zv.va();
    }

    public static int ed() {
        return zv.hn();
    }

    public static int ee() {
        return zv.xm();
    }

    public static int ef() {
        return zv.mz();
    }

    public static void eg() {
        zv.pn();
    }

    public static boolean eh() {
        return zv.va();
    }

    public static boolean ei() {
        return zv.va();
    }

    public static int[] ej() {
        return zv.op();
    }

    public static void ek(int[] arg0) {
        zv.jn(arg0);
    }

    public static int[] el() {
        return zv.xl();
    }

    public static int[] em() {
        return zv.op();
    }

    public static int[] en() {
        return zv.xl();
    }

    public static int eo(int[] arg0, int arg1) {
        return zv.jq(arg0, arg1);
    }

    public static int ep() {
        return zv.mz();
    }

    public static void eq() {
        zv.sq();
    }

    public static void er() {
        zv.sq();
    }

    public static int es() {
        return zv.hn();
    }

    public static int et(int[] arg0, int arg1) {
        return zv.jq(arg0, arg1);
    }

    public static int eu() {
        return zv.xm();
    }

    public static void ev() {
        zv.pn();
    }

    public static void ew() {
        zv.pn();
    }

    public static boolean ex() {
        return zv.va();
    }

    public static int[] ey() {
        return zv.xl();
    }

    public static void ez(boolean arg0) {
        zv.gc(arg0);
    }

    public static long fa() {
        return zv.fg();
    }

    public static void fb() {
        zv.ft();
    }

    public static void fc(int arg0) {
        zv.pe(arg0);
    }

    public static long fd() {
        return zv.fg();
    }

    public static long fe() {
        return zv.fg();
    }

    public static int ff(int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, int[] arg14, int[] arg15, int[] arg16, int[] arg17, int[] arg18, byte[] arg19, short[] arg20, byte[] arg21, byte[] arg22, int[] arg23, int[] arg24) {
        return zv.oh(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23, arg24);
    }

    public static int fg() {
        return zv.nc();
    }

    public static void fh(int arg0, int[] arg1, int[] arg2) {
        zv.nb(arg0, arg1, arg2);
    }

    public static void fi(int arg0) {
        zv.fl(arg0);
    }

    public static int fj() {
        return zv.nc();
    }

    public static void fk(int arg0, int arg1) {
        zv.id(arg0, arg1);
    }

    public static void fl(int arg0, int arg1) {
        zv.id(arg0, arg1);
    }

    public static int fm(int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, int[] arg14, int[] arg15, int[] arg16, int[] arg17, int[] arg18, byte[] arg19, short[] arg20, byte[] arg21, byte[] arg22, int[] arg23, int[] arg24) {
        return zv.oh(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23, arg24);
    }

    public static int fn(int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, int[] arg14, int[] arg15, int[] arg16, int[] arg17, int[] arg18, byte[] arg19, short[] arg20, byte[] arg21, byte[] arg22, int[] arg23, int[] arg24) {
        return zv.oh(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23, arg24);
    }

    public static void fo(int arg0) {
        zv.fl(arg0);
    }

    public static int fp(int arg0) {
        return zv.eh(arg0);
    }

    public static int fq(int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, int[] arg14, int[] arg15, int[] arg16, int[] arg17, int[] arg18, byte[] arg19, short[] arg20, byte[] arg21, byte[] arg22, int[] arg23, int[] arg24) {
        return zv.oh(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23, arg24);
    }

    public static int fr() {
        return zv.nc();
    }

    public static boolean fs(int arg0, long arg1, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, boolean arg15) {
        return zv.qs(arg0, arg1, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    public static int ft(int arg0) {
        return zv.eh(arg0);
    }

    public static void fu() {
        zv.ft();
    }

    public static void fv(int arg0) {
        zv.pe(arg0);
    }

    public static int fw(int arg0) {
        return zv.eh(arg0);
    }

    public static int fx(int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int[] arg13, int[] arg14, int[] arg15, int[] arg16, int[] arg17, int[] arg18, byte[] arg19, short[] arg20, byte[] arg21, byte[] arg22, int[] arg23, int[] arg24) {
        return zv.oh(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23, arg24);
    }

    public static void fy(int arg0, int[] arg1, int[] arg2) {
        zv.nb(arg0, arg1, arg2);
    }

    public static void fz(int arg0, int[] arg1, int[] arg2) {
        zv.nb(arg0, arg1, arg2);
    }

    public static void ga() {
        zv.to();
    }

    public static void gb() {
        zv.uk();
    }

    public static void gc(short arg0, short arg1, short arg2, short arg3, short arg4, short arg5, short arg6, short arg7, short arg8, short arg9, short arg10, short arg11, short arg12, short arg13, short arg14, short arg15, short arg16, short arg17, short arg18, short arg19, short arg20, short arg21, short arg22, short arg23) {
        zv.ro(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23);
    }

    public static int gd() {
        return zv.pv();
    }

    public static int ge() {
        return zv.pv();
    }

    public static int gf() {
        return zv.qp();
    }

    public static boolean gg(int arg0, long arg1, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, boolean arg15) {
        return zv.qs(arg0, arg1, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    public static int gh() {
        return zv.ds();
    }

    public static int gi() {
        return zv.ev();
    }

    public static void gj() {
        zv.to();
    }

    public static int gk() {
        return zv.ev();
    }

    public static void gl(short arg0, short arg1, short arg2, short arg3, short arg4, short arg5, short arg6, short arg7, short arg8, short arg9, short arg10, short arg11, short arg12, short arg13, short arg14, short arg15, short arg16, short arg17, short arg18, short arg19, short arg20, short arg21, short arg22, short arg23) {
        zv.ro(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23);
    }

    public static boolean gm(int arg0, long arg1, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, boolean arg15) {
        return zv.qs(arg0, arg1, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15);
    }

    public static boolean gn() {
        return zv.od();
    }

    public static String go() {
        return zv.cp();
    }

    public static int gp() {
        return zv.ds();
    }

    public static int gq() {
        return zv.ds();
    }

    public static void gr(int[] arg0, int arg1) {
        zv.oe(arg0, arg1);
    }

    public static boolean gs() {
        return zv.od();
    }

    public static void gt(int[] arg0, int arg1) {
        zv.oe(arg0, arg1);
    }

    public static void gu(short arg0, short arg1, short arg2, short arg3, short arg4, short arg5, short arg6, short arg7, short arg8, short arg9, short arg10, short arg11, short arg12, short arg13, short arg14, short arg15, short arg16, short arg17, short arg18, short arg19, short arg20, short arg21, short arg22, short arg23) {
        zv.ro(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19, arg20, arg21, arg22, arg23);
    }

    public static int gv() {
        return zv.qp();
    }

    public static int gw() {
        return zv.pv();
    }

    public static void gx() {
        zv.uk();
    }

    public static void gy() {
        zv.ho();
    }

    public static int gz() {
        return zv.pv();
    }

    public static int hb() {
        return zv.nq();
    }

    public static int hc() {
        return zv.qp();
    }

    public static String he() {
        return zv.si();
    }

    public static int hf() {
        return zv.nq();
    }

    public static int hg() {
        return zv.ys();
    }

    public static int hi() {
        return zv.nq();
    }

    public static int[] hk() {
        return zv.sp();
    }

    public static String hl() {
        return zv.si();
    }

    public static int[] hn() {
        return zv.sp();
    }

    public static String ho() {
        return zv.oa();
    }

    public static int hr() {
        return zv.ys();
    }

    public static int hs() {
        return zv.nq();
    }

    public static String hu() {
        return zv.tn();
    }

    public static long hw() {
        return zv.xe();
    }
}

