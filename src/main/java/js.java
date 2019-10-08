public class js extends eq {
    final boolean al;
    static final int ar = 0;
    public static final int bg = 51;
    static nm rl;

    public js(boolean arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("js.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ab(ee arg2, ee arg3, int arg4) {
        try {
            int v0 = 0x297B4181;
            if(arg2.an * v0 != 0 && arg3.an * v0 != 0) {
                v0 = 125406857;
                int v2_1 = this.al ? arg2.ap * v0 - arg3.ap * v0 : arg3.ap * v0 - arg2.ap * v0;
                return v2_1;
            }

            return this.al(((eg)arg2), ((eg)arg3), 2);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("js.ab(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 0x69321031);
    }

    int af(ee arg3, ee arg4) {
        int v1 = 0x297B4181;
        if(arg3.an * v1 != 0 && arg4.an * v1 != 0) {
            v1 = 125406857;
            int v3 = this.al ? arg3.ap * v1 - arg4.ap * v1 : arg4.ap * v1 - arg3.ap * v1;
            return v3;
        }

        return this.al(((eg)arg3), ((eg)arg4), -4);
    }

    int ai(ee arg3, ee arg4) {
        if(arg3.an * 0x145BF925 != 0 && arg4.an * 1174030454 != 0) {
            int v3 = this.al ? arg3.ap * 0x523C0A70 - arg4.ap * 0x71F48B1C : arg4.ap * 125406857 - arg3.ap * 125406857;
            return v3;
        }

        return this.al(((eg)arg3), ((eg)arg4), 42);
    }

    public static String aj(int arg1, boolean arg2, int arg3) {
        if(arg2) {
            if(arg1 < 0) {
            }
            else {
                arg3 = 10;
                byte v0 = -72;
                try {
                    return ex.ad(arg1, arg3, arg2, v0);
                label_7:
                    return Integer.toString(arg1);
                }
                catch(RuntimeException v1) {
                    StringBuilder v2 = new StringBuilder();
                    v2.append("js.aj(");
                    v2.append(')');
                    throw lx.al(((Throwable)v1), v2.toString());
                }
            }
        }

        goto label_7;
    }

    public int aq(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 1290118130);
    }

    int av(ee arg3, ee arg4) {
        if(arg3.an * 0x47395D0F != 0 && arg4.an * 0x297B4181 != 0) {
            int v3 = this.al ? arg3.ap * 0x9E0DDE40 - arg4.ap * 125406857 : arg4.ap * 0xBE883690 - arg3.ap * -144972099;
            return v3;
        }

        return this.al(((eg)arg3), ((eg)arg4), 25);
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ab(((ee)arg2), ((ee)arg3), 0xF15886B);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("js.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

