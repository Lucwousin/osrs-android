public class pm {
    public static final int an = 1401;
    static final int ar = 8;
    int[] ax;
    public static final int bf = 35;

    public pm(int[] arg10) {
        int v8;
        int v7;
        try {
            super();
            int v1;
            for(v1 = 1; v1 <= (arg10.length >> 1) + arg10.length; v1 <<= 1) {
            }

            int v2 = v1 + v1;
            this.ax = new int[v2];
            int v3 = 0;
            int v4 = 0;
            while(true) {
                int v5 = -1;
                if(v4 < v2) {
                    this.ax[v4] = v5;
                    ++v4;
                    continue;
                }

                break;
            }

            while(v3 < arg10.length) {
                v4 = v1 - 1;
                for(v2 = arg10[v3] & v4; true; v2 = v2 + 1 & v4) {
                    v7 = v2 + v2;
                    v8 = v7 + 1;
                    if(v5 == this.ax[v8]) {
                        break;
                    }
                }

                this.ax[v7] = arg10[v3];
                this.ax[v8] = v3;
                ++v3;
            }
        }
        catch(RuntimeException v10) {
            goto label_44;
        }

        return;
    label_44:
        StringBuilder v0 = new StringBuilder();
        v0.append("pm.<init>(");
        v0.append(')');
        throw lx.al(((Throwable)v10), v0.toString());
    }

    public int ae(int arg6) {
        int v4;
        int v0 = (this.ax.length >> 1) - 1;
        int v1;
        for(v1 = arg6 & v0; true; v1 = v1 + 1 & v0) {
            int v3 = v1 + v1;
            int v2 = this.ax[v3 + 1];
            v4 = -1;
            if(v2 == v4) {
                return v4;
            }

            if(arg6 == this.ax[v3]) {
                return v2;
            }
        }

        return v4;
    }

    public int al(int arg6) {
        int v4;
        int v0 = (this.ax.length >> 1) - 1;
        int v1;
        for(v1 = arg6 & v0; true; v1 = v1 + 1 & v0) {
            int v3 = v1 + v1;
            int v2 = this.ax[v3 + 1];
            v4 = -1;
            if(v2 == v4) {
                return v4;
            }

            if(arg6 == this.ax[v3]) {
                return v2;
            }
        }

        return v4;
    }

    public int ax(int arg5, int arg6) {
        int v3;
        int v1;
        int v0;
        try {
            arg6 = (this.ax.length >> 1) - 1;
            v0 = arg5 & arg6;
            while(true) {
            label_5:
                int v2 = v0 + v0;
                v1 = this.ax[v2 + 1];
                v3 = -1;
                if(v1 == v3) {
                    return v3;
                }

                if(arg5 != this.ax[v2]) {
                    goto label_16;
                }

                return v1;
            }
        }
        catch(RuntimeException v5) {
            goto label_21;
        }

        return v1;
    label_16:
        v0 = v0 + 1 & arg6;
        goto label_5;
        return v3;
    label_21:
        StringBuilder v6 = new StringBuilder();
        v6.append("pm.ax(");
        v6.append(')');
        throw lx.al(((Throwable)v5), v6.toString());
    }
}

