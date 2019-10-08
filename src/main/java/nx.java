import java.util.Comparator;

final class nx implements Comparator {
    static final int aj = 24;

    nx() {
        super();
    }

    public int ad(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 0xB55036F0);
    }

    int ae(nu arg7, nu arg8) {
        int v7;
        long v2 = 0x5CFAD116F2438147L;
        if(arg7.al * v2 < arg8.al * v2) {
            v7 = -1;
        }
        else if(arg8.al * v2 == arg7.al * v2) {
            v7 = 0;
        }
        else {
            v7 = 1;
        }

        return v7;
    }

    int al(nu arg7, nu arg8) {
        int v7;
        long v2 = 0x5CFAD116F2438147L;
        if(arg7.al * v2 < arg8.al * v2) {
            v7 = -1;
        }
        else if(arg8.al * v2 == arg7.al * v2) {
            v7 = 0;
        }
        else {
            v7 = 1;
        }

        return v7;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ax(((nu)arg2), ((nu)arg3), 0xB55036F0);
    }

    int ar(nu arg7, nu arg8) {
        int v7;
        long v2 = 0x5CFAD116F2438147L;
        if(arg7.al * v2 < arg8.al * v2) {
            v7 = -1;
        }
        else if(arg8.al * v2 == arg7.al * v2) {
            v7 = 0;
        }
        else {
            v7 = 1;
        }

        return v7;
    }

    int ax(nu arg7, nu arg8, int arg9) {
        int v7_1;
        try {
            long v2 = 0x5CFAD116F2438147L;
            if(arg7.al * v2 < arg8.al * v2) {
                v7_1 = -1;
            }
            else {
                if(arg8.al * v2 != arg7.al * v2) {
                    return 1;
                }

                return 0;
            }

            return v7_1;
        }
        catch(RuntimeException v7) {
            StringBuilder v8 = new StringBuilder();
            v8.append("nx.ax(");
            v8.append(')');
            throw lx.al(((Throwable)v7), v8.toString());
        }

        return 0;
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ax(((nu)arg2), ((nu)arg3), 0xB55036F0);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nx.compare(");
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
            v0.append("nx.equals(");
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

