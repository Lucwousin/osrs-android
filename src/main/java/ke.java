public class ke extends eq {
    public static final int ai = 4;
    final boolean al;
    public static final int bq = 6;

    public ke(boolean arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("ke.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    int ab(ee arg3, ee arg4, int arg5) {
        try {
            int v0 = 1257071827;
            if(arg3.aj * v0 != arg4.aj * v0) {
                int v3_1 = this.al ? arg3.aj * v0 - arg4.aj * v0 : arg4.aj * v0 - arg3.aj * v0;
                return v3_1;
            }

            return this.al(((eg)arg3), ((eg)arg4), -85);
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("ke.ab(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public int ad(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 2076077358);
    }

    int af(ee arg4, ee arg5) {
        int v1 = 1257071827;
        if(arg4.aj * v1 != arg5.aj * v1) {
            int v4 = this.al ? arg4.aj * v1 - arg5.aj * v1 : arg5.aj * v1 - arg4.aj * v1;
            return v4;
        }

        return this.al(((eg)arg4), ((eg)arg5), 27);
    }

    int ai(ee arg4, ee arg5) {
        if(arg4.aj * 0x619CF61F != arg5.aj * -230987501) {
            int v1 = 1257071827;
            int v4 = this.al ? arg4.aj * v1 - arg5.aj * v1 : arg5.aj * 0x4B3B60DB - arg4.aj * v1;
            return v4;
        }

        return this.al(((eg)arg4), ((eg)arg5), -15);
    }

    public int aq(Object arg2, Object arg3) {
        return this.ab(((ee)arg2), ((ee)arg3), 1540704394);
    }

    public int compare(Object arg2, Object arg3) {
        try {
            return this.ab(((ee)arg2), ((ee)arg3), 0x698D9F9F);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("ke.compare(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

