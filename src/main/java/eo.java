import com.jagex.oldscape.osrenderer.ax;

public abstract class eo extends eb {
    static final int ad = 4;
    protected bd ae;
    protected ep al;
    protected bv an;
    static boolean aq = false;
    protected eh ar;
    static gq av = null;
    protected bl ax;
    static ki dh = null;
    static final int oi = 0x30;
    static int qh;

    protected eo() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("eo.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public bt aa() {
        return this.ae;
    }

    public void ab(float arg2, int arg3) {
        try {
            this.ax.ap(arg2, 76);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("eo.ab(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ac() {
        this.ar.ax(432280651).aj(74);
    }

    public void ad(int arg3) {
        try {
            this.ar.ax(432280651).aj(27);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("eo.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static char ae(byte arg2, int arg3) {
        int v2 = arg2 & 0xFF;
        if(v2 == 0) {
            goto label_13;
        }

        if(v2 >= 0x80 && v2 < 0xA0) {
            try {
                v2 = lr.ax[v2 - 0x80];
                if(v2 == 0) {
                    v2 = 0x3F;
                }

            label_11:
                return ((char)v2);
            label_13:
                StringBuilder v0 = new StringBuilder();
                v0.append("");
                v0.append(Integer.toString(v2, 16));
                throw new IllegalArgumentException(v0.toString());
            }
            catch(RuntimeException v2_1) {
                StringBuilder v3 = new StringBuilder();
                v3.append("eo.ae(");
                v3.append(')');
                throw lx.al(((Throwable)v2_1), v3.toString());
            }
        }

        goto label_11;
    }

    public bk ae(int arg3) {
        try {
            return this.an;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("eo.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public fa af() {
        return this.al;
    }

    public bk ag() {
        return this.an;
    }

    public void ah(int arg4, int arg5) {
        this.ar.ai(arg4, arg5, 0x43FBCD41);
        this.al.ex(this.ar.ae, arg4, arg5, 0x60BFF6B8);
    }

    public fa ai() {
        return this.al;
    }

    public void aj(int arg3, int arg4, int arg5) {
        try {
            this.ar.aa(arg3, arg4, -2026030852);
            this.al.ex(this.ar.ae, this.ar.al(0x81CA846E), this.ar.ae(-17), 1651411105);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("eo.aj(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void ak(int arg4, int arg5) {
        this.ar.aa(arg4, arg5, -2024068868);
        this.al.ex(this.ar.ae, this.ar.al(0x8C07070D), this.ar.ae(-60), 0x1E812087);
    }

    public bt al(int arg3) {
        try {
            return this.ae;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("eo.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public bk am() {
        return this.an;
    }

    public void ao(int arg7, int arg8, int arg9, int arg10) {
        this.ar.au(arg7, arg8, arg9, arg10, 1273150648);
    }

    public void ap(int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            this.ar.au(arg7, arg8, arg9, arg10, 0x6D4EC6AF);
            return;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("eo.ap(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }
    }

    public void aq(int arg2, int arg3) {
        arg3 = 0xA3907E91;
        try {
            ax.bo(arg2, arg3);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("eo.aq(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ar(int arg3, int arg4, int arg5) {
        try {
            this.ar.ai(arg3, arg4, 413806299);
            this.al.ex(this.ar.ae, arg3, arg4, 0x69E43DDD);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("eo.ar(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public void as(int arg7, int arg8, int arg9, int arg10) {
        this.ar.au(arg7, arg8, arg9, arg10, 1043106257);
    }

    public bt au() {
        return this.ae;
    }

    public fa av() {
        return this.al;
    }

    public void aw(int arg7, int arg8, int arg9, int arg10) {
        this.ar.au(arg7, arg8, arg9, arg10, 2102086348);
    }

    public fa ax(int arg3) {
        try {
            return this.al;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("eo.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public bk az() {
        return this.an;
    }

    public void ba() {
        this.ar.ax(432280651).aj(26);
    }

    public void bd() {
        this.ar.ax(432280651).aj(108);
    }

    public void bf(int arg2) {
        ax.bo(arg2, 0xD69FFA04);
    }

    public void bn(int arg2) {
        ax.bo(arg2, 887830676);
    }

    public void bo(float arg3) {
        this.ax.ap(arg3, 76);
    }

    public void bp(int arg2) {
        ax.bo(arg2, 0xA8893029);
    }

    public void bt(float arg3) {
        this.ax.ap(arg3, 53);
    }

    public void bv(float arg3) {
        this.ax.ap(arg3, 39);
    }

    public void bw(float arg3) {
        this.ax.ap(arg3, 17);
    }

    public void by(float arg3) {
        this.ax.ap(arg3, 97);
    }
}

