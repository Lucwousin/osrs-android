import com.jagex.oldscape.osrenderer.ax;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.concurrent.SynchronousQueue;

public class bl implements Runnable {
    int[][] aa;
    static final int ab = 3;
    Object ad;
    volatile boolean ae;
    LinkedList af;
    public static final int ag = 10;
    SynchronousQueue ai;
    public long aj;
    static bl al = null;
    int[] am;
    volatile float an;
    mt ap;
    boolean aq;
    volatile boolean ar;
    static final int at = 1;
    int[] au;
    int[] av;
    static final int aw = 7;
    static final float ax = 0.8f;
    mt az;
    static ef en;
    static or fv;

    static {
    }

    bl() {
        try {
            super();
            this.ae = true;
            this.ar = true;
            this.an = 0.8f;
            this.ap = new mt(0xFA);
            this.aq = false;
            this.af = new LinkedList();
            this.ai = new SynchronousQueue();
            this.az = new mt(0xFA);
            ax.al(0x7F050096);
            bd.aj = true;
            this.aq(4828);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bl.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    final void aa(as arg2, int arg3) {
        try {
            if(this.af.size() >= 3) {
                return;
            }

            this.af.add(arg2);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bl.aa(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    boolean ab(bh arg2, short arg3) {
        __monitor_enter(this);
        int v3 = 971580097;
        try {
            this.aa = arg2.al(v3);
            if(this.aa != null) {
                goto label_9;
            }
        }
        catch(Throwable v2) {
            goto label_32;
        }
        catch(RuntimeException v2_1) {
            goto label_23;
        }

        __monitor_exit(this);
        return 0;
        try {
        label_9:
            this.au = new int[this.aa.length];
            this.am = new int[this.aa.length];
        }
        catch(Throwable v2) {
        }
        catch(RuntimeException v2_1) {
            try {
            label_23:
                StringBuilder v3_1 = new StringBuilder();
                v3_1.append("bl.ab(");
                v3_1.append(')');
                throw lx.al(((Throwable)v2_1), v3_1.toString());
            }
            catch(Throwable v2) {
            label_32:
                __monitor_exit(this);
                throw v2;
            }
        }

        __monitor_exit(this);
        return 1;
    }

    final void ac() {
        cc.bf(((double)this.an));
        __monitor_enter(this);
        try {
            this.av = Arrays.copyOf(bt.aa, bt.aa.length);
            __monitor_exit(this);
            return;
        label_12:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_12;
        }

        throw v0;
    }

    public final void ad(int arg3) {
        Object v3 = null;
        byte v0 = -1;
        try {
            ax.ae(v3, v0);
            ax.ao(1703035656);
            this.aq = true;
            return;
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("bl.ad(");
            v0_1.append(')');
            throw lx.al(((Throwable)v3_1), v0_1.toString());
        }
    }

    public void ae() {
        while(this.ae) {
            this.aw(-32);
        }
    }

    void af(bh arg5, byte arg6) {
        try {
            if(this.au == null) {
                return;
            }

            int v6 = arg5.aj(-8313);
            int v0;
            for(v0 = 0; v0 < v6; ++v0) {
                bb v1 = arg5.ax(v0, 0xF5F6A8EE);
                if(v1 == null) {
                }
                else {
                    this.au[v0] = v1.av / 2;
                    this.am[v0] = v1.aa / 2;
                }
            }

            ax.bn(v6, this.au, this.am, 0xF01376DB);
            return;
        }
        catch(RuntimeException v5) {
            StringBuilder v6_1 = new StringBuilder();
            v6_1.append("bl.af(");
            v6_1.append(')');
            throw lx.al(((Throwable)v5), v6_1.toString());
        }
    }

    final void ag(short arg6) {
        int v6 = 0xACE001FD;
        try {
            as v6_2 = this.am(v6);
            if(v6_2 != null) {
                System.nanoTime();
                v6_2.ar(-80);
                this.az(-1407886661);
                v6_2.an(this.ar, 0x6310F4E5);
                this.aa(v6_2, 701155868);
                this.ap.ax(v6_2.ab * 0x1DBF4E70E56CF5D1L);
            }
        }
        catch(RuntimeException v6_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bl.ag(");
            v0.append(')');
            throw lx.al(((Throwable)v6_1), v0.toString());
        }
    }

    final void ah(int arg4) {
        int[] v1;
        int[][] v0;
        int[] v4 = null;
        try {
            v0 = ((int[][])v4);
            __monitor_enter(this);
        }
        catch(RuntimeException v4_1) {
            goto label_35;
        }

        try {
            if(this.av != null) {
                v1 = this.av;
                this.av = v4;
            }
            else {
                v1 = v4;
            }

            if(this.aa != null) {
                v0 = this.aa;
                this.aa = ((int[][])v4);
            }

            __monitor_exit(this);
            if(v1 == null) {
                goto label_17;
            }
        }
        catch(Throwable v4_2) {
            try {
            label_31:
                __monitor_exit(this);
            }
            catch(Throwable v4_2) {
                goto label_31;
            }

            try {
                throw v4_2;
            }
            catch(RuntimeException v4_1) {
                goto label_35;
            }
        }

        short v4_3 = -26431;
        try {
            ax.ag(v1, v4_3);
        label_17:
            if(v0 != null) {
                arg4 = 0;
                while(true) {
                label_19:
                    if(arg4 < v0.length) {
                        if(v0[arg4] == null) {
                        }
                        else {
                            ax.az(arg4, v0[arg4], 0x130908DD);
                        }

                        goto label_27;
                    }

                    return;
                }
            }

            return;
        }
        catch(RuntimeException v4_1) {
            goto label_35;
        }

    label_27:
        ++arg4;
        goto label_19;
    label_35:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("bl.ah(");
        v0_1.append(')');
        throw lx.al(((Throwable)v4_1), v0_1.toString());
    }

    public as ai(int arg3) {
        try {
            return this.af.removeFirst();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bl.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final void aj(int arg3) {
        try {
            cc.bf(((double)this.an));
            __monitor_enter(this);
        }
        catch(RuntimeException v3) {
            goto label_16;
        }

        try {
            this.av = Arrays.copyOf(bt.aa, bt.aa.length);
            __monitor_exit(this);
            return;
        label_12:
            __monitor_exit(this);
        }
        catch(Throwable v3_1) {
            goto label_12;
        }

        try {
            throw v3_1;
        }
        catch(RuntimeException v3) {
        label_16:
            StringBuilder v0 = new StringBuilder();
            v0.append("bl.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public final void ak(float arg3) {
        this.an = arg3;
        ii.au.ba(((double)this.an));
        bd.aj = true;
    }

    public static ar al(int arg1, int arg2) {
        arg2 = arg1 >> 16;
        arg1 &= 0xFFFF;
        try {
            if((ar.aj[arg2] == null || ar.aj[arg2][arg1] == null) && !mr.ar(arg2, 0x2F2A6D5D)) {
                return null;
            }

            return ar.aj[arg2][arg1];
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("bl.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void al() {
        while(this.ae) {
            this.aw(-31);
        }
    }

    final as am(int arg3) {
        try {
        label_0:
            return this.ai.take();
        }
        catch(InterruptedException ) {
            goto label_0;
        }
        catch(RuntimeException v3) {
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("bl.am(");
        v0.append(')');
        throw lx.al(((Throwable)v3), v0.toString());
    }

    public static bl ao() {
        bl v1_1;
        Class v0 = bl.class;
        __monitor_enter(v0);
        try {
            if(bl.al == null) {
                bl.al = new bl();
            }

            v1_1 = bl.al;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v1_1;
    }

    public final void ap(float arg3, byte arg4) {
        try {
            this.an = arg3;
            ii.au.ba(((double)this.an));
            bd.aj = true;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("bl.ap(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    final void aq(short arg3) {
        int v3 = 0;
        while(v3 < 3) {
            try {
                this.af.add(new as());
                ++v3;
                continue;
            }
            catch(RuntimeException v3_1) {
                StringBuilder v0 = new StringBuilder();
                v0.append("bl.aq(");
                v0.append(')');
                throw lx.al(((Throwable)v3_1), v0.toString());
            }
        }
    }

    public void ar() {
        while(this.ae) {
            this.aw(-82);
        }
    }

    public final void as(float arg3) {
        this.an = arg3;
        ii.au.ba(((double)this.an));
        bd.aj = true;
    }

    final void at(int arg3) {
        arg3 = 0x9FF2DBD6;
        try {
            Object v3_1 = this.au(arg3);
            if(v3_1 != null) {
                if(this.aq) {
                    ax.ad(0xE98E358E);
                    this.aq = false;
                }
                else {
                    ax.ae(v3_1, -1);
                    this.aq = true;
                }
            }

            if(this.aq) {
                this.ah(0x6AE03218);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bl.at(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final Object au(int arg3) {
        Object v3_2;
        Object v0;
        __monitor_enter(this);
        try {
            v0 = null;
            if(this.ad != null) {
                v3_2 = this.ad;
                this.ad = v0;
            }
            else {
                goto label_7;
            }

            goto label_8;
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("bl.au(");
                v0_1.append(')');
                throw lx.al(((Throwable)v3_1), v0_1.toString());
            }
            catch(Throwable v3) {
                __monitor_exit(this);
                throw v3;
            }
        }

    label_7:
        v3_2 = v0;
    label_8:
        __monitor_exit(this);
        return v3_2;
    }

    public final as av(as arg3, int arg4) {
        try {
        label_0:
            this.az.ax(((long)arg3.ap(-2017602971)));
            this.ai.put(arg3);
        }
        catch(InterruptedException ) {
            goto label_0;
        }
        catch(RuntimeException v3) {
            goto label_12;
        }

        try {
        label_7:
            return this.ai.take();
        }
        catch(InterruptedException ) {
            goto label_7;
        }
        catch(RuntimeException v3) {
        }

    label_12:
        StringBuilder v4 = new StringBuilder();
        v4.append("bl.av(");
        v4.append(')');
        throw lx.al(((Throwable)v3), v4.toString());
    }

    public final void aw(byte arg3) {
        int v3 = 1978570973;
        try {
            ax.aq(v3);
            this.at(0x8CF81F5B);
            if(this.aq) {
                this.ag(-6804);
            }
        }
        catch(RuntimeException v3_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("bl.aw(");
            v0.append(')');
            throw lx.al(((Throwable)v3_1), v0.toString());
        }
    }

    public static void ax(ko arg0, ko arg1, ko arg2, ko arg3, int arg4) {
        try {
            ar.aq = arg0;
            dp.ab = arg1;
            ar.af = arg2;
            nr.ai = arg3;
            ar.aj = new ar[ar.aq.am(22)][];
            ar.ad = new boolean[ar.aq.am(109)];
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bl.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void ax() {
        while(this.ae) {
            this.aw(-96);
        }
    }

    public void ay(boolean arg2, int arg3) {
        try {
            this.ar = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("bl.ay(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    final void az(int arg3) {
        try {
        label_0:
            this.ai.put(this.af.removeFirst());
            return;
        }
        catch(InterruptedException ) {
            goto label_0;
        }
        catch(RuntimeException v3) {
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("bl.az(");
        v0.append(')');
        throw lx.al(((Throwable)v3), v0.toString());
    }

    public final void ba() {
        ax.ae(null, -1);
        ax.ao(0x1D52F68E);
        this.aq = true;
    }

    public as bb() {
        return this.af.removeFirst();
    }

    public final as bc(as arg4) {
        try {
        label_0:
            this.az.ax(((long)arg4.ap(0xA8C503E7)));
            this.ai.put(arg4);
        }
        catch(InterruptedException ) {
            goto label_0;
        }

        try {
        label_7:
            return this.ai.take();
        }
        catch(InterruptedException ) {
            goto label_7;
        }
    }

    public final void bd() {
        ax.ae(null, -1);
        ax.ao(0x87E93AF3);
        this.aq = true;
    }

    final Object be() {
        Object v0_1;
        Object v1;
        __monitor_enter(this);
        try {
            v1 = null;
            if(this.ad != null) {
                v0_1 = this.ad;
                this.ad = v1;
            }
            else {
                goto label_7;
            }

            goto label_8;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

    label_7:
        v0_1 = v1;
    label_8:
        __monitor_exit(this);
        return v0_1;
    }

    public final void bf() {
        ax.ae(null, -1);
        ax.ao(0x7AC45FD9);
        this.aq = true;
    }

    void bg(bh arg6) {
        if(this.au == null) {
            return;
        }

        int v0 = arg6.aj(-493);
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            bb v2 = arg6.ax(v1, 0xD2643DCD);
            if(v2 == null) {
            }
            else {
                this.au[v1] = v2.av / 2;
                this.am[v1] = v2.aa / 2;
            }
        }

        ax.bn(v0, this.au, this.am, 0x5AC16721);
    }

    void bh(bh arg6) {
        if(this.au == null) {
            return;
        }

        int v0 = arg6.aj(-2876);
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            bb v2 = arg6.ax(v1, 0xA05B1D6);
            if(v2 == null) {
            }
            else {
                this.au[v1] = v2.av / 2;
                this.am[v1] = v2.aa / 2;
            }
        }

        ax.bn(v0, this.au, this.am, 0x130746BF);
    }

    final as bi() {
        try {
        label_0:
            return this.ai.take();
        }
        catch(InterruptedException ) {
            goto label_0;
        }
    }

    final void bj(as arg3) {
        if(this.af.size() >= 3) {
            return;
        }

        this.af.add(arg3);
    }

    public final as bk(as arg4) {
        try {
        label_0:
            this.az.ax(((long)arg4.ap(0xC47E9ED2)));
            this.ai.put(arg4);
        }
        catch(InterruptedException ) {
            goto label_0;
        }

        try {
        label_7:
            return this.ai.take();
        }
        catch(InterruptedException ) {
            goto label_7;
        }
    }

    final as bl() {
        try {
        label_0:
            return this.ai.take();
        }
        catch(InterruptedException ) {
            goto label_0;
        }
    }

    public final as bm(as arg4) {
        try {
        label_0:
            this.az.ax(((long)arg4.ap(-1675150925)));
            this.ai.put(arg4);
        }
        catch(InterruptedException ) {
            goto label_0;
        }

        try {
        label_7:
            return this.ai.take();
        }
        catch(InterruptedException ) {
            goto label_7;
        }
    }

    public final void bn() {
        ax.ae(null, -1);
        ax.ao(0x509357A3);
        this.aq = true;
    }

    final void bo() {
        int v0;
        for(v0 = 0; v0 < 3; ++v0) {
            this.af.add(new as());
        }
    }

    final void bp() {
        int v0;
        for(v0 = 0; v0 < 3; ++v0) {
            this.af.add(new as());
        }
    }

    boolean bq(bh arg2) {
        __monitor_enter(this);
        int v0 = 971580097;
        try {
            this.aa = arg2.al(v0);
            if(this.aa == null) {
            }
            else {
                goto label_9;
            }
        }
        catch(Throwable v2) {
            goto label_20;
        }

        boolean v2_1 = false;
        goto label_7;
        try {
        label_9:
            this.au = new int[this.aa.length];
            this.am = new int[this.aa.length];
            v2_1 = true;
        }
        catch(Throwable v2) {
        label_20:
            __monitor_exit(this);
            throw v2;
        }

    label_7:
        __monitor_exit(this);
        return v2_1;
    }

    final as br() {
        try {
        label_0:
            return this.ai.take();
        }
        catch(InterruptedException ) {
            goto label_0;
        }
    }

    final Object bs() {
        Object v0_1;
        Object v1;
        __monitor_enter(this);
        try {
            v1 = null;
            if(this.ad != null) {
                v0_1 = this.ad;
                this.ad = v1;
            }
            else {
                goto label_7;
            }

            goto label_8;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

    label_7:
        v0_1 = v1;
    label_8:
        __monitor_exit(this);
        return v0_1;
    }

    boolean bt(bh arg2) {
        __monitor_enter(this);
        int v0 = 971580097;
        try {
            this.aa = arg2.al(v0);
            if(this.aa == null) {
            }
            else {
                goto label_9;
            }
        }
        catch(Throwable v2) {
            goto label_20;
        }

        boolean v2_1 = false;
        goto label_7;
        try {
        label_9:
            this.au = new int[this.aa.length];
            this.am = new int[this.aa.length];
            v2_1 = true;
        }
        catch(Throwable v2) {
        label_20:
            __monitor_exit(this);
            throw v2;
        }

    label_7:
        __monitor_exit(this);
        return v2_1;
    }

    final void bu(as arg3) {
        if(this.af.size() >= 3) {
            return;
        }

        this.af.add(arg3);
    }

    boolean bv(bh arg2) {
        __monitor_enter(this);
        int v0 = 971580097;
        try {
            this.aa = arg2.al(v0);
            if(this.aa != null) {
                goto label_9;
            }
        }
        catch(Throwable v2) {
            goto label_21;
        }

        __monitor_exit(this);
        return 0;
        try {
        label_9:
            this.au = new int[this.aa.length];
            this.am = new int[this.aa.length];
        }
        catch(Throwable v2) {
        label_21:
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return 1;
    }

    final void bw() {
        int v0;
        for(v0 = 0; v0 < 3; ++v0) {
            this.af.add(new as());
        }
    }

    void bx(bh arg6) {
        if(this.au == null) {
            return;
        }

        int v0 = arg6.aj(-28766);
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            bb v2 = arg6.ax(v1, 0x92F11964);
            if(v2 == null) {
            }
            else {
                this.au[v1] = v2.av / 2;
                this.am[v1] = v2.aa / 2;
            }
        }

        ax.bn(v0, this.au, this.am, 1506883230);
    }

    boolean by(bh arg2) {
        __monitor_enter(this);
        int v0 = 971580097;
        try {
            this.aa = arg2.al(v0);
            if(this.aa != null) {
                goto label_9;
            }
        }
        catch(Throwable v2) {
            goto label_21;
        }

        __monitor_exit(this);
        return 0;
        try {
        label_9:
            this.au = new int[this.aa.length];
            this.am = new int[this.aa.length];
        }
        catch(Throwable v2) {
        label_21:
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return 1;
    }

    void bz(bh arg6) {
        if(this.au == null) {
            return;
        }

        int v0 = arg6.aj(-9010);
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            bb v2 = arg6.ax(v1, -332309634);
            if(v2 == null) {
            }
            else {
                this.au[v1] = v2.av / 2;
                this.am[v1] = v2.aa / 2;
            }
        }

        ax.bn(v0, this.au, this.am, 761079635);
    }

    final void ca() {
        try {
        label_0:
            this.ai.put(this.af.removeFirst());
            return;
        }
        catch(InterruptedException ) {
            goto label_0;
        }
    }

    final void cb() {
        Object v0 = this.au(0x9FF2DBD6);
        if(v0 != null) {
            if(this.aq) {
                ax.ad(0xDAD137F4);
                this.aq = false;
            }
            else {
                ax.ae(v0, -1);
                this.aq = true;
            }
        }

        if(this.aq) {
            this.ah(0x65075132);
        }
    }

    public void cc(boolean arg1) {
        this.ar = arg1;
    }

    final void cd() {
        as v0 = this.am(0x75A51154);
        if(v0 != null) {
            System.nanoTime();
            v0.ar(-23);
            this.az(0xE1602DB2);
            v0.an(this.ar, 0xF1645BA);
            this.aa(v0, 1944173208);
            this.ap.ax(v0.ab * 0x1DBF4E70E56CF5D1L);
        }
    }

    public final void ce() {
        ax.aq(1978570973);
        this.at(0x92CF1450);
        if(this.aq) {
            this.ag(0x32FB);
        }
    }

    final void cf() {
        as v0 = this.am(-403007997);
        if(v0 != null) {
            System.nanoTime();
            v0.ar(-115);
            this.az(0xA816F867);
            v0.an(this.ar, 0x61B334FF);
            this.aa(v0, 0x79E2F9DB);
            this.ap.ax(v0.ab * 0x1DBF4E70E56CF5D1L);
        }
    }

    public final void ch() {
        ax.aq(1978570973);
        this.at(0xCECF8DB6);
        if(this.aq) {
            this.ag(-2542);
        }
    }

    public void ci(boolean arg1) {
        this.ar = arg1;
    }

    final void cj() {
        try {
        label_0:
            this.ai.put(this.af.removeFirst());
            return;
        }
        catch(InterruptedException ) {
            goto label_0;
        }
    }

    public void cp(boolean arg1) {
        this.ar = arg1;
    }

    public final void cr() {
        ax.aq(1978570973);
        this.at(-1270722221);
        if(this.aq) {
            this.ag(-8202);
        }
    }

    public void cw(boolean arg1) {
        this.ar = arg1;
    }

    final void cx() {
        int[] v2;
        int[] v0 = null;
        int[][] v1 = ((int[][])v0);
        __monitor_enter(this);
        try {
            if(this.av != null) {
                v2 = this.av;
                this.av = v0;
            }
            else {
                v2 = v0;
            }

            if(this.aa != null) {
                v1 = this.aa;
                this.aa = ((int[][])v0);
            }

            __monitor_exit(this);
            if(v2 == null) {
                goto label_17;
            }
        }
        catch(Throwable v0_1) {
            try {
            label_31:
                __monitor_exit(this);
            }
            catch(Throwable v0_1) {
                goto label_31;
            }

            throw v0_1;
        }

        ax.ag(v2, -4060);
    label_17:
        if(v1 != null) {
            int v0_2;
            for(v0_2 = 0; v0_2 < v1.length; ++v0_2) {
                if(v1[v0_2] == null) {
                }
                else {
                    ax.az(v0_2, v1[v0_2], -509078296);
                }
            }
        }
    }

    final void cy() {
        Object v0 = this.au(0x9FF2DBD6);
        if(v0 != null) {
            if(this.aq) {
                ax.ad(-698513560);
                this.aq = false;
            }
            else {
                ax.ae(v0, -1);
                this.aq = true;
            }
        }

        if(this.aq) {
            this.ah(0x4E59767C);
        }
    }

    static final void gu(int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
        int v0 = arg11;
        int v1 = -403609470;
        try {
            if(!mr.ar(arg11, v1)) {
                return;
            }

            cw.gn(ar.aj[v0], -1, arg12, arg13, arg14, arg15, arg16, arg17, 2020499504);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("bl.gu(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }

    public void run() {
        try {
            while(true) {
                if(!this.ae) {
                    return;
                }

                this.aw(-39);
            }
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("bl.run(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

