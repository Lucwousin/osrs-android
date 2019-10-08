public final class cv {
    final int[] al;
    static final int ax = 0x1000;

    cv() {
        try {
            super();
            this.al = new int[0x1000];
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("cv.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    cv(int[] arg3) {
        try {
            super();
            this.al = arg3;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("cv.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    final int ad(int arg2, int arg3) {
        return this.al[arg3 * 0x40 + arg2];
    }

    static cv ae(byte[] arg2) {
        if(arg2 == null) {
            return new cv();
        }

        return new cv(ah.ax(arg2, 0).ax);
    }

    final int aj(int arg2, int arg3) {
        return this.al[arg3 * 0x40 + arg2];
    }

    final int al(int arg1, int arg2, int arg3) {
        try {
            return this.al[arg2 * 0x40 + arg1];
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("cv.al(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    static cv an(byte[] arg2) {
        if(arg2 == null) {
            return new cv();
        }

        return new cv(ah.ax(arg2, 0).ax);
    }

    final int ap(int arg2, int arg3) {
        return this.al[arg3 * 0x40 + arg2];
    }

    final int aq(int arg2, int arg3) {
        return this.al[arg3 * 0x40 + arg2];
    }

    static cv ar(byte[] arg2) {
        if(arg2 == null) {
            return new cv();
        }

        return new cv(ah.ax(arg2, 0).ax);
    }

    static final void he(int arg2) {
        arg2 = 0;
        while(true) {
            int v0 = 0x474DFE7D;
            try {
                if(arg2 >= ho.ap * v0) {
                    return;
                }

                client.jf[ho.aj[arg2]].ap(-126);
                ++arg2;
                continue;
            }
            catch(RuntimeException v2) {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("cv.he(");
                v0_1.append(')');
                throw lx.al(((Throwable)v2), v0_1.toString());
            }
        }
    }
}

