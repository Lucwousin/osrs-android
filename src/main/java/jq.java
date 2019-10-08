public final class jq implements me {
    int ax;

    jq() {
        try {
            super();
            this.ax = 0;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("jq.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public int al() {
        int v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.ax * 0x802980B8;
            this.ax = 0;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public int ax(byte arg3) {
        int v3_2;
        __monitor_enter(this);
        try {
            v3_2 = this.ax * 0x68ACAA87;
            this.ax = 0;
        }
        catch(Throwable v3) {
        }
        catch(RuntimeException v3_1) {
            try {
                StringBuilder v0 = new StringBuilder();
                v0.append("jq.ax(");
                v0.append(')');
                throw lx.al(((Throwable)v3_1), v0.toString());
            }
            catch(Throwable v3) {
                __monitor_exit(this);
                throw v3;
            }
        }

        __monitor_exit(this);
        return v3_2;
    }
}

