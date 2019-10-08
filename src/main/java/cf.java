import java.util.Collection;

public class cf implements lh {
    static final cf ae = null;
    public static final String ag = "wgahnagl";
    static final cf al = null;
    final int an;
    public final int ar;
    static final cf ax = null;
    public static final int ba = 29;
    static final int bt = 4;
    static String ef;

    static {
        cf.ax = new cf(0, -1);
        cf.al = new cf(1, 1);
        cf.ae = new cf(2, 3);
    }

    cf(int arg2, int arg3) {
        try {
            super();
            this.ar = arg2 * 0x99D1465B;
            this.an = arg3 * 0x3D07C505;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("cf.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static cf[] ae() {
        return new cf[]{cf.ax, cf.al, cf.ae};
    }

    static void al(byte arg2) {
        int[] v2 = null;
        try {
            id.ar = ((byte[][][])v2);
            id.an = ((byte[][][])v2);
            id.ap = ((byte[][][])v2);
            id.aj = ((byte[][][])v2);
            id.au = ((int[][][])v2);
            nt.ad = ((byte[][][])v2);
            id.aq = ((int[][])v2);
            id.ab = v2;
            ab.af = v2;
            ct.ai = v2;
            lb.av = v2;
            am.aa = v2;
            return;
        }
        catch(RuntimeException v2_1) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cf.al(");
            v0.append(')');
            throw lx.al(((Throwable)v2_1), v0.toString());
        }
    }

    public static void an(Collection arg1, int arg2) {
        try {
            arg1.add(di.al);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cf.an(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int ar() {
        return this.an * 0xBC0F3FCD;
    }

    public static void ax(ko arg3, byte arg4) {
        try {
            ek.ax = arg3;
            int v0 = 4;
            ek.al = new ek[arg3.au(v0, 0x809EF896)];
            int v3_1;
            for(v3_1 = 0; v3_1 < ek.al.length; ++v3_1) {
                byte[] v4 = ek.ax.ae(v0, v3_1, 0x78DC0DC9);
                ek.al[v3_1] = new ek();
                if(v4 != null) {
                    ek.al[v3_1].ar(new lq(v4), v3_1, -1208902089);
                }

                ek.al[v3_1].ae(1503470816);
            }
        }
        catch(RuntimeException v3) {
            goto label_33;
        }

        return;
    label_33:
        StringBuilder v4_1 = new StringBuilder();
        v4_1.append("cf.ax(");
        v4_1.append(')');
        throw lx.al(((Throwable)v3), v4_1.toString());
    }

    public static boolean ax(int arg0, int arg1) {
        boolean v1 = true;
        if((arg0 & 1) != 0) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public int ax(int arg3) {
        try {
            return this.an * 0xBC0F3FCD;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cf.ax(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

