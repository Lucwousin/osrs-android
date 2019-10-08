import java.util.Comparator;

final class nv implements Comparator {
    public static final String al = "click_action_params";
    static final int ar = 100;
    public static final int br = 68;

    nv() {
        super();
    }

    public int ad(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 0x7C);
    }

    int al(nu arg4, nu arg5) {
        int v4;
        int v1 = 0xFF7F8B3F;
        if(arg4.ae.ae * v1 < arg5.ae.ae * v1) {
            v4 = -1;
        }
        else if(arg4.ae.ae * v1 == arg5.ae.ae * v1) {
            v4 = 0;
        }
        else {
            v4 = 1;
        }

        return v4;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 75);
    }

    int ax(nu arg3, nu arg4, byte arg5) {
        int v3_1;
        try {
            int v0 = 0xFF7F8B3F;
            if(arg3.ae.ae * v0 < arg4.ae.ae * v0) {
                v3_1 = -1;
            }
            else {
                if(arg3.ae.ae * v0 != arg4.ae.ae * v0) {
                    return 1;
                }

                return 0;
            }

            return v3_1;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("nv.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        return 0;
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ax(((nu)arg2), ((nu)arg3), 69);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nv.compare(");
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
            v0.append("nv.equals(");
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

