import java.util.Comparator;

final class nt implements Comparator {
    static byte[][][] ad = null;
    static final String aq = "Application crashed";

    nt() {
        super();
    }

    public int ad(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 0x47427817);
    }

    int ae(nu arg2, nu arg3) {
        return arg2.ax(0xFFFF00).compareTo(arg3.ax(0xFFFF00));
    }

    int al(nu arg2, nu arg3) {
        return arg2.ax(0xFFFF00).compareTo(arg3.ax(0xFFFF00));
    }

    public int aq(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 1204643763);
    }

    int ax(nu arg1, nu arg2, int arg3) {
        arg3 = 0xFFFF00;
        try {
            return arg1.ax(arg3).compareTo(arg2.ax(arg3));
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("nt.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ax(((nu)arg2), ((nu)arg3), 2042860440);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nt.compare(");
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
            v0.append("nt.equals(");
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

