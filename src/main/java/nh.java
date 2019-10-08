import java.util.Comparator;

final class nh implements Comparator {
    public static final int aa = 16;

    nh() {
        super();
    }

    public int ad(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 0xEBFA3612);
    }

    int ae(nu arg4, nu arg5) {
        int v4;
        int v2 = 460973165;
        if(arg4.ax * -2041924139 < arg5.ax * v2) {
            v4 = -1;
        }
        else if(arg4.ax * 0x30A9B0F == arg5.ax * v2) {
            v4 = 0;
        }
        else {
            v4 = 1;
        }

        return v4;
    }

    int al(nu arg4, nu arg5) {
        int v4;
        int v1 = 460973165;
        if(arg4.ax * v1 < arg5.ax * v1) {
            v4 = -1;
        }
        else if(arg4.ax * v1 == arg5.ax * v1) {
            v4 = 0;
        }
        else {
            v4 = 1;
        }

        return v4;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 0x9BE9C8AE);
    }

    int ar(nu arg4, nu arg5) {
        int v4;
        int v1 = 460973165;
        if(arg4.ax * v1 < arg5.ax * v1) {
            v4 = -1;
        }
        else if(arg4.ax * v1 == arg5.ax * v1) {
            v4 = 0;
        }
        else {
            v4 = 1;
        }

        return v4;
    }

    int ax(nu arg3, nu arg4, int arg5) {
        int v3_1;
        try {
            int v0 = 460973165;
            if(arg3.ax * v0 < arg4.ax * v0) {
                v3_1 = -1;
            }
            else {
                if(arg3.ax * v0 != arg4.ax * v0) {
                    return 1;
                }

                return 0;
            }

            return v3_1;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("nh.ax(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }

        return 0;
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ax(((nu)arg2), ((nu)arg3), -940844424);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nh.compare(");
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
            v0.append("nh.equals(");
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

