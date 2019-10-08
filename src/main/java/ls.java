import com.jagex.jagex3.client.input.softkeyboard.ar;
import java.io.File;
import java.util.Map;

public abstract class ls implements ln {
    static final int[] ac = null;
    boolean ak;
    protected boolean ao;
    public fd as;
    protected ar at;
    protected la aw;
    protected ah ay;
    static final int cb = 20;
    public static final int cd = 72;

    static {
        ls.ac = new int[]{0, 0};
    }

    protected ls() {
        try {
            super();
            this.as = new fd();
            this.ak = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ls.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    protected abstract String aa(int arg1);

    public boolean ab(int arg1) {
        return 1;
    }

    public abstract void ac(byte arg1);

    public abstract int ad(int arg1);

    public boolean af(int arg1) {
        return 1;
    }

    public abstract es ag(byte[] arg1, int arg2);

    public abstract Object ah(mh arg1, int arg2);

    public int[] ai(int arg3) {
        try {
            return ls.ac;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.ai(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public float am(int arg1) {
        return -1f;
    }

    protected void an(byte arg3) {
        try {
            this.ak = false;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.an(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int aq(int arg1) {
        return -1;
    }

    protected void ar(int arg3) {
        try {
            this.ak = true;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int au(int arg1, int arg2) {
        return arg1;
    }

    public boolean av(int arg1) {
        return 1;
    }

    public abstract ar az(int arg1, int arg2);

    public abstract void ba(boolean arg1, byte arg2);

    public abstract void bd(int arg1);

    public abstract ah bh(int arg1);

    protected void bi() {
        this.ak = false;
    }

    protected void bl() {
        this.ak = true;
    }

    public abstract void bn(Runnable arg1, byte arg2);

    public abstract void bo(String arg1, int arg2, byte arg3);

    public abstract void bp(String arg1, boolean arg2, int arg3);

    public abstract void bq(String[] arg1, byte arg2);

    protected void br() {
        this.ak = true;
    }

    public abstract String bt(String arg1, String arg2, byte arg3);

    public abstract int bv(String arg1, int arg2, byte arg3);

    public abstract void bw(String arg1, String arg2, byte arg3);

    protected abstract void bx(String arg1, String arg2, byte arg3);

    protected abstract boolean by(String arg1, boolean arg2, int arg3);

    public abstract void bz(String arg1, String arg2, String arg3, int arg4);

    public int cb() {
        return -1;
    }

    public boolean cc() {
        return 1;
    }

    public boolean ce() {
        return 1;
    }

    protected abstract String cg();

    public boolean ch() {
        return 1;
    }

    public boolean ci() {
        return 1;
    }

    public int[] ck() {
        return ls.ac;
    }

    public int[] cl() {
        return ls.ac;
    }

    public boolean cm() {
        return 1;
    }

    public int[] cn() {
        return ls.ac;
    }

    public int co(int arg1) {
        return arg1;
    }

    public boolean cp() {
        return 1;
    }

    public boolean cq() {
        return 1;
    }

    public boolean cr() {
        return 1;
    }

    public int[] cs() {
        return ls.ac;
    }

    public boolean ct() {
        return 1;
    }

    public boolean cu() {
        return 1;
    }

    protected abstract String cv();

    public int cw() {
        return -1;
    }

    public int cy() {
        return -1;
    }

    public int[] cz() {
        return ls.ac;
    }

    public abstract void da();

    public abstract es db(byte[] arg1);

    public abstract void dd(boolean arg1);

    public abstract void dg(boolean arg1);

    public float dh() {
        return -1f;
    }

    public abstract void di();

    public abstract void do();

    public float dp() {
        return -1f;
    }

    public abstract void dq();

    public abstract void dt(boolean arg1);

    public int dv(int arg1) {
        return arg1;
    }

    public abstract ar dw(int arg1);

    public abstract void dx();

    public abstract void dz();

    public abstract void ea(Runnable arg1);

    protected abstract void eb(String arg1, String arg2);

    public abstract void ed(String[] arg1);

    public abstract int ee(String arg1, int arg2);

    public abstract void ef(String arg1, String arg2, String arg3);

    protected abstract boolean eg(String arg1, boolean arg2);

    public abstract void ej(String arg1, boolean arg2);

    public abstract void el(String arg1, String arg2);

    public abstract void em(String arg1, boolean arg2);

    public abstract void en(String arg1, String arg2);

    public abstract ah eo();

    public abstract void ep(String arg1, String arg2, String arg3);

    public abstract void eq(Runnable arg1);

    public abstract void er(Runnable arg1);

    protected abstract void es(String arg1, String arg2);

    public abstract ah et();

    protected abstract boolean eu(String arg1, boolean arg2);

    public abstract void ev(String arg1, int arg2);

    public abstract void ew(String arg1, int arg2);

    public abstract void ex(String arg1, String arg2, String arg3);

    public abstract void ey(String arg1, String arg2);

    public abstract ah fa();

    public File fb(String arg1, String arg2, int arg3) {
        return new File(this.aa(825026140));
    }

    public File fc(String arg1, String arg2, int arg3, int arg4) {
        try {
            return new File(this.aa(0x3021223A));
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("ls.fc(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public File ff() {
        return new File(this.aa(748374050));
    }

    public boolean fg(short arg3) {
        try {
            return this.ao;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.fg(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public abstract int fh();

    public File fi(int arg3) {
        try {
            return new File(this.aa(0x37FDB076));
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.fi(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean fj(int arg3) {
        try {
            return this.ak;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.fj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public abstract Object fk(mh arg1);

    public abstract Object fl(mh arg1);

    public File fm() {
        return new File(this.aa(0x36023455));
    }

    public File fn(String arg1, String arg2, int arg3) {
        return new File(this.aa(0x560E116F));
    }

    public File fo(int arg2, int arg3) {
        try {
            return new File(this.aa(0x6D3B06D8), "random.dat");
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ls.fo(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public File fp(int arg3) {
        return new File(this.aa(0x33E82F54), "random.dat");
    }

    public File fq() {
        return new File(this.aa(0x5783AF33));
    }

    public File fr(int arg3) {
        return new File(this.aa(1063680501), "random.dat");
    }

    public void fs(int arg3) {
        try {
            this.bp("mglwnafh", true, 0xE517DB66);
            this.ao = true;
            if(this.ay != null) {
                this.ay.av(-1010619808);
                this.ay.aa(0xD0AB6549);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.fs(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public File ft(int arg3) {
        return new File(this.aa(0x45444F42), "random.dat");
    }

    public File fu(String arg1, String arg2, int arg3) {
        return new File(this.aa(0x72DF6C8A));
    }

    public abstract String fv(String arg1, String arg2);

    public File fw(int arg3) {
        return new File(this.aa(0x58592F2A), "random.dat");
    }

    public File fx(String arg1, String arg2, int arg3) {
        return new File(this.aa(0x67451A2D));
    }

    public abstract int fy();

    public abstract int fz();

    public la ga(byte arg3) {
        try {
            return this.aw;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.ga(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void gb(byte arg1) {
    }

    public void gc(int arg3) {
        try {
            if(this.at != null) {
                this.at.an(0xD21DC9D7);
                this.at = null;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.gc(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void gd() {
    }

    public boolean ge() {
        return 1;
    }

    public void gf() {
        if(this.at != null) {
            this.at.an(0xD21DC9D7);
            this.at = null;
        }
    }

    public boolean gg(byte arg1) {
        return 1;
    }

    public void gh() {
    }

    public void gi() {
        this.bp("mglwnafh", true, 0xE517DB66);
        this.ao = true;
        if(this.ay != null) {
            this.ay.av(0x8B90D69A);
            this.ay.aa(0x605572FC);
        }
    }

    public void gj(String arg2, int arg3) {
        Map v3 = null;
        int v0 = 0xA84E8F32;
        try {
            this.gx(arg2, v3, v0);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3_1 = new StringBuilder();
            v3_1.append("ls.gj(");
            v3_1.append(')');
            throw lx.al(((Throwable)v2), v3_1.toString());
        }
    }

    public boolean gk() {
        return this.ak;
    }

    public ar gl(int arg3) {
        try {
            return this.at;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.gl(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void gm(byte arg1) {
    }

    public void gn(int arg3) {
        try {
            Object v3_1 = this.ah(mh.ae, 0x17837190);
            if(v3_1 != null) {
                this.bx("Software Licence", ((String)v3_1), 87);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.gn(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void go() {
    }

    public void gp() {
        if(this.at != null) {
            this.at.an(0xD21DC9D7);
            this.at = null;
        }
    }

    public void gq() {
        if(this.at != null) {
            this.at.an(0xD21DC9D7);
            this.at = null;
        }
    }

    public boolean gr() {
        return this.ak;
    }

    public String gs(String arg4, int arg5) {
        StringBuilder v5_1;
        try {
            if(!arg4.contains("?m=")) {
                if(arg4.contains("&m=")) {
                }
                else {
                    boolean v5 = arg4.contains("?");
                    boolean v0 = this.by("fhtagn", false, 0xDB4CC5E3);
                    if(v5) {
                        v5_1 = new StringBuilder();
                        v5_1.append(arg4);
                        arg4 = v0 ? "&m=1" : "&m=0";
                        v5_1.append(arg4);
                        return v5_1.toString();
                    }
                    else {
                        v5_1 = new StringBuilder();
                        v5_1.append(arg4);
                        arg4 = v0 ? "?m=1" : "?m=0";
                        v5_1.append(arg4);
                        return v5_1.toString();
                    }
                }
            }
        }
        catch(RuntimeException v4) {
            v5_1 = new StringBuilder();
            v5_1.append("ls.gs(");
            v5_1.append(')');
            throw lx.al(((Throwable)v4), v5_1.toString());
        }

        return arg4;
    }

    public boolean gt() {
        return this.ak;
    }

    public boolean gu(byte arg3) {
        try {
            if(this.at == null) {
                return false;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.gu(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        boolean v3_1 = true;
        return v3_1;
    }

    public void gv() {
        if(this.at != null) {
            this.at.an(0xD21DC9D7);
            this.at = null;
        }
    }

    public boolean gw() {
        return 1;
    }

    void gx(String arg2, Map arg3, int arg4) {
        try {
            if(this.ay != null) {
                this.ay.at(arg2, arg3, -1200255464);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ls.gx(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public fd gy(byte arg3) {
        try {
            return this.as;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ls.gy(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean gz() {
        return 1;
    }

    void ha(String arg3, Map arg4) {
        if(this.ay != null) {
            this.ay.at(arg3, arg4, -1200255464);
        }
    }

    public ar hb() {
        return this.at;
    }

    public ar hc() {
        return this.at;
    }

    public la he() {
        return this.aw;
    }

    public ar hf() {
        return this.at;
    }

    public boolean hg() {
        boolean v0 = this.at != null ? true : false;
        return v0;
    }

    public ar hi() {
        return this.at;
    }

    void hj(String arg3, Map arg4) {
        if(this.ay != null) {
            this.ay.at(arg3, arg4, -1200255464);
        }
    }

    public void hk() {
        Object v0 = this.ah(mh.ae, 0x57C839B9);
        if(v0 != null) {
            this.bx("Software Licence", ((String)v0), 92);
        }
    }

    public void hl(String arg3) {
        this.gx(arg3, null, 0x4612F759);
    }

    public void hn() {
        Object v0 = this.ah(mh.ae, 1993579026);
        if(v0 != null) {
            this.bx("Software Licence", ((String)v0), 0x77);
        }
    }

    public String ho(String arg5) {
        StringBuilder v0_1;
        if(!arg5.contains("?m=")) {
            if(arg5.contains("&m=")) {
            }
            else {
                boolean v0 = arg5.contains("?");
                boolean v1 = this.by("fhtagn", false, 0x248EAFFF);
                if(v0) {
                    v0_1 = new StringBuilder();
                    v0_1.append(arg5);
                    arg5 = v1 ? "&m=1" : "&m=0";
                    v0_1.append(arg5);
                    return v0_1.toString();
                }
                else {
                    v0_1 = new StringBuilder();
                    v0_1.append(arg5);
                    arg5 = v1 ? "?m=1" : "?m=0";
                    v0_1.append(arg5);
                    return v0_1.toString();
                }
            }
        }

        return arg5;
    }

    public void hp(String arg3) {
        this.gx(arg3, null, 0x761D5DF5);
    }

    public void hq(String arg3) {
        this.gx(arg3, null, 2093183814);
    }

    public boolean hr() {
        boolean v0 = this.at != null ? true : false;
        return v0;
    }

    public boolean hs() {
        boolean v0 = this.at != null ? true : false;
        return v0;
    }

    public void hu() {
        Object v0 = this.ah(mh.ae, 0xFC1C6D0A);
        if(v0 != null) {
            this.bx("Software Licence", ((String)v0), 84);
        }
    }

    void hv(String arg3, Map arg4) {
        if(this.ay != null) {
            this.ay.at(arg3, arg4, -1200255464);
        }
    }

    public String hw(String arg5) {
        StringBuilder v0_1;
        if(!arg5.contains("?m=")) {
            if(arg5.contains("&m=")) {
            }
            else {
                boolean v0 = arg5.contains("?");
                boolean v1 = this.by("fhtagn", false, -1213416055);
                if(v0) {
                    v0_1 = new StringBuilder();
                    v0_1.append(arg5);
                    arg5 = v1 ? "&m=1" : "&m=0";
                    v0_1.append(arg5);
                    return v0_1.toString();
                }
                else {
                    v0_1 = new StringBuilder();
                    v0_1.append(arg5);
                    arg5 = v1 ? "?m=1" : "?m=0";
                    v0_1.append(arg5);
                    return v0_1.toString();
                }
            }
        }

        return arg5;
    }

    public void ia() {
    }

    void ib(String arg3, Map arg4) {
        if(this.ay != null) {
            this.ay.at(arg3, arg4, -1200255464);
        }
    }

    void il(String arg3, Map arg4) {
        if(this.ay != null) {
            this.ay.at(arg3, arg4, -1200255464);
        }
    }

    public fd ip() {
        return this.as;
    }
}

