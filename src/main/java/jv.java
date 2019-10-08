public class jv extends eq {
    static final int aa = 1;
    final boolean al;
    static ef[] gx;

    public jv(boolean arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jv.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int aa(ee arg4, ee arg5) {
        int v2 = 0x297B4181;
        if(arg5.an * 0x98889F0B != arg4.an * v2) {
            int v4 = this.al ? arg4.an * v2 - arg5.an * 0x136F8611 : arg5.an * v2 - arg4.an * v2;
            return v4;
        }

        return this.al(((eg)arg4), ((eg)arg5), -69);
    }

    int ab(ee arg3, ee arg4, int arg5) {
        try {
            int v0 = 0x297B4181;
            if(arg4.an * v0 != arg3.an * v0) {
                int v3_1 = this.al ? arg3.an * v0 - arg4.an * v0 : arg4.an * v0 - arg3.an * v0;
                return v3_1;
            }

            return this.al(((eg)arg3), ((eg)arg4), 16);
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("jv.ab(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 0x705F1614);
    }

    int af(ee arg4, ee arg5) {
        int v1 = 0x297B4181;
        if(arg5.an * v1 != arg4.an * v1) {
            int v4 = this.al ? arg4.an * v1 - arg5.an * v1 : arg5.an * 0xAAE33C3F - arg4.an * -691079301;
            return v4;
        }

        return this.al(((eg)arg4), ((eg)arg5), -66);
    }

    int ai(ee arg4, ee arg5) {
        int v1 = 0x297B4181;
        if(arg5.an * v1 != arg4.an * v1) {
            int v4 = this.al ? arg4.an * v1 - arg5.an * v1 : arg5.an * v1 - arg4.an * v1;
            return v4;
        }

        return this.al(((eg)arg4), ((eg)arg5), 78);
    }

    public int aq(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 1553099913);
    }

    int av(ee arg4, ee arg5) {
        int v2 = 0x297B4181;
        if(arg5.an * -1367078050 != arg4.an * v2) {
            int v4 = this.al ? arg4.an * -1386606043 - arg5.an * v2 : arg5.an * v2 - arg4.an * 0xDDF25BEF;
            return v4;
        }

        return this.al(((eg)arg4), ((eg)arg5), 21);
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ab(((ee)arg2), ((ee)arg3), 0x2A4C10D6);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("jv.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static boolean in(int arg2) {
        try {
            if(client.lf * 0x12DC6E19 < 2) {
                return false;
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("jv.in(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }

        boolean v2_1 = true;
        return v2_1;
    }
}

