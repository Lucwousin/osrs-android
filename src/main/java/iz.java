public class iz {
    final int ae;
    final ki al;
    int ar;
    static final String au = "random.dat";
    static final int ax = 10000;
    static final int bv = 9;

    iz(ki arg2, String arg3) {
        try {
            super();
            this.ar = 0;
            this.al = arg2;
            this.ae = arg2.am(0x76) * 0xD7624D39;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("iz.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    boolean ae() {
        boolean v0 = false;
        this.ar = 0;
        int v1;
        for(v1 = 0; true; ++v1) {
            int v3 = 0x6C3E9109;
            if(v1 >= this.ae * v3) {
                break;
            }

            if(!this.al.dd(v1, -46) || (this.al.dt(v1, -1110923921))) {
                this.ar += 0x5C2CE74B;
            }
        }

        if(this.ar * -760681885 >= this.ae * v3) {
            v0 = true;
        }

        return v0;
    }

    boolean al() {
        boolean v0 = false;
        this.ar = 0;
        int v1;
        for(v1 = 0; v1 < this.ae * -1179011374; ++v1) {
            if(!this.al.dd(v1, -70) || (this.al.dt(v1, -1110923921))) {
                this.ar += 0x5C2CE74B;
            }
        }

        if(this.ar * -760681885 >= this.ae * 1000134718) {
            v0 = true;
        }

        return v0;
    }

    boolean ar() {
        boolean v0 = false;
        this.ar = 0;
        int v1;
        for(v1 = 0; v1 < this.ae * 2129255006; ++v1) {
            if(!this.al.dd(v1, 45) || (this.al.dt(v1, -1110923921))) {
                this.ar += 1707956053;
            }
        }

        if(this.ar * -760681885 >= this.ae * 0x6C3E9109) {
            v0 = true;
        }

        return v0;
    }

    boolean ax(int arg4) {
        boolean v4 = false;
        try {
            this.ar = 0;
            int v0;
            for(v0 = 0; true; ++v0) {
                int v2 = 0x6C3E9109;
                if(v0 >= this.ae * v2) {
                    break;
                }

                if(!this.al.dd(v0, -48) || (this.al.dt(v0, -1110923921))) {
                    this.ar += 0x5C2CE74B;
                }
            }

            if(this.ar * -760681885 >= this.ae * v2) {
                return true;
            }

            return v4;
        }
        catch(RuntimeException v4_1) {
            goto label_31;
        }

        return true;
    label_31:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("iz.ax(");
        v0_1.append(')');
        throw lx.al(((Throwable)v4_1), v0_1.toString());
    }

    static String if(String arg5, byte arg6) {
        int v0;
        int v6 = -1260029895;
        try {
            gc[] v6_1 = dj.al(v6);
            v0 = 0;
            while(true) {
            label_3:
                if(v0 < v6_1.length) {
                    gc v1 = v6_1[v0];
                    int v3 = 0x5A739A73;
                    if(v1.ad * v3 != -1 && (arg5.startsWith(lk.ax(v1.ad * v3, -98)))) {
                        return arg5.substring(Integer.toString(v1.ad * v3).length() + 6);
                    }

                    break;
                }

                return arg5;
            }
        }
        catch(RuntimeException v5) {
            goto label_29;
        }

        ++v0;
        goto label_3;
        return arg5;
    label_29:
        StringBuilder v6_2 = new StringBuilder();
        v6_2.append("iz.if(");
        v6_2.append(')');
        throw lx.al(((Throwable)v5), v6_2.toString());
    }
}

