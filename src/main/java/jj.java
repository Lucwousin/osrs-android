import java.util.Comparator;

public class jj implements Comparator {
    final boolean ax;

    public jj(boolean arg3) {
        try {
            super();
            this.ax = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jj.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public static void ad(int arg1, int arg2) {
        arg2 = 0x7427BD27;
        try {
            kv.an = arg2;
            kv.ap = null;
            kv.aj = 0xC77BF3B7;
            kv.ad = 0xB0A7C073;
            li.aq = 0;
            kv.af = false;
            bs.ab = arg1 * 0x3013BA11;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("jj.ad(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ax(((eg)arg2), ((eg)arg3), 1507832190);
    }

    int ae(eg arg2, eg arg3) {
        int v2 = this.ax ? arg2.al(arg3, 0x610DA583) : arg3.al(arg2, 0x4BDFED73);
        return v2;
    }

    int al(eg arg2, eg arg3) {
        int v2 = this.ax ? arg2.al(arg3, 0x8220208B) : arg3.al(arg2, 404745450);
        return v2;
    }

    int an(eg arg2, eg arg3) {
        int v2 = this.ax ? arg2.al(arg3, 0x8CD77AF0) : arg3.al(arg2, -1153607527);
        return v2;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ax(((eg)arg2), ((eg)arg3), 0x33E10E2C);
    }

    int ar(eg arg2, eg arg3) {
        int v2 = this.ax ? arg2.al(arg3, 0x9D26C2F) : arg3.al(arg2, 0x73214065);
        return v2;
    }

    int ax(eg arg1, eg arg2, int arg3) {
        int v1_1;
        try {
            v1_1 = this.ax ? arg1.al(arg2, 0x5C0151E6) : arg2.al(arg1, 38291803);
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("jj.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }

        return v1_1;
    }

    static final void ca(int arg2) {
        try {
            if(cj.oy) {
                if(ai.oq != null) {
                    ai.oq.av(0x8AB1F741);
                }

                cv.he(0x90A2D22A);
                cj.oy = false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jj.ca(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ax(((eg)arg2), ((eg)arg3), 0x28F80BFB);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jj.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public boolean equals(Object arg3) {
        try {
            return super.equals(arg3);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jj.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public boolean hd(Object arg1) {
        return super.equals(arg1);
    }

    public boolean hh(Object arg1) {
        return super.equals(arg1);
    }
}

