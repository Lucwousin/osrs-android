public class ka extends eq {
    static final int ae = 16;
    final boolean al;
    public static final int bs;

    public ka(boolean arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ka.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ab(ee arg4, ee arg5, byte arg6) {
        try {
            int v0 = 0x297B4181;
            int v2 = 0x8076F529;
            if(arg4.an * v0 == client.ae * v2 && client.ae * v2 == arg5.an * v0) {
                v0 = 125406857;
                int v4_1 = this.al ? arg4.ap * v0 - arg5.ap * v0 : arg5.ap * v0 - arg4.ap * v0;
                return v4_1;
            }

            return this.al(((eg)arg4), ((eg)arg5), -35);
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("ka.ab(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), -9);
    }

    int af(ee arg4, ee arg5) {
        if(arg4.an * 0x2E3C76E8 == client.ae * -1423166102 && client.ae * -1018115540 == arg5.an * 0x14F08135) {
            int v1 = 125406857;
            int v4 = this.al ? arg4.ap * 1601730577 - arg5.ap * v1 : arg5.ap * v1 - arg4.ap * 0x2A4B025D;
            return v4;
        }

        return this.al(((eg)arg4), ((eg)arg5), 43);
    }

    int ai(ee arg5, ee arg6) {
        int v1 = 0x297B4181;
        if(arg5.an * v1 == client.ae * 0xAEB061C4 && client.ae * 0x8076F529 == arg6.an * v1) {
            v1 = 125406857;
            int v5 = this.al ? arg5.ap * v1 - arg6.ap * 0x70205AC7 : arg6.ap * v1 - arg5.ap * -802869805;
            return v5;
        }

        return this.al(((eg)arg5), ((eg)arg6), -41);
    }

    public int aq(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), -34);
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ab(((ee)arg2), ((ee)arg3), 0);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ka.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

