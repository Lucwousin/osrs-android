public class jy extends eq {
    final boolean al;
    public static final int ch = 74;

    public jy(boolean arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jy.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ab(ee arg2, ee arg3, int arg4) {
        try {
            int v0 = 0x297B4181;
            if(arg2.an * v0 != 0 && arg3.an * v0 != 0) {
                int v2_1 = this.al ? arg2.ap(0).ae(arg3.ap(0), -108) : arg3.ap(0).ae(arg2.ap(0), -76);
                return v2_1;
            }

            return this.al(((eg)arg2), ((eg)arg3), -18);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jy.ab(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 0xAF40BB9E);
    }

    static final boolean ae(char arg0, int arg1) {
        boolean v0 = 0xA0 == arg0 || 0x20 == arg0 || 0x5F == arg0 || arg0 == 45 ? true : false;
        return v0;
    }

    int af(ee arg3, ee arg4) {
        int v1 = 0x297B4181;
        if(arg3.an * v1 != 0 && arg4.an * v1 != 0) {
            int v3 = this.al ? arg3.ap(0).ae(arg4.ap(0), -119) : arg4.ap(0).ae(arg3.ap(0), -29);
            return v3;
        }

        return this.al(((eg)arg3), ((eg)arg4), -45);
    }

    int ai(ee arg3, ee arg4) {
        int v1 = 0x297B4181;
        if(arg3.an * v1 != 0 && arg4.an * v1 != 0) {
            int v3 = this.al ? arg3.ap(0).ae(arg4.ap(0), -10) : arg4.ap(0).ae(arg3.ap(0), -57);
            return v3;
        }

        return this.al(((eg)arg3), ((eg)arg4), -22);
    }

    public int aq(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 0xFEA73E7A);
    }

    int av(ee arg3, ee arg4) {
        int v1 = 0x297B4181;
        if(arg3.an * v1 != 0 && arg4.an * v1 != 0) {
            int v3 = this.al ? arg3.ap(0).ae(arg4.ap(0), -103) : arg4.ap(0).ae(arg3.ap(0), -125);
            return v3;
        }

        return this.al(((eg)arg3), ((eg)arg4), 22);
    }

    public static void ax(ko arg1, byte arg2) {
        try {
            dk.ax = arg1;
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("jy.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public static void ax(ko arg0, ko arg1, ko arg2, byte arg3) {
        try {
            de.ax = arg0;
            de.al = arg1;
            de.ae = arg2;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jy.ax(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ab(((ee)arg2), ((ee)arg3), -756820283);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jy.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

