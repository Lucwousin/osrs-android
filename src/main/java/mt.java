import java.util.Hashtable;

public class mt {
    long ae;
    int al;
    static final int ap = 7;
    int ar;
    final long[] ax;
    static final int bi = 100;

    public mt(int arg4) {
        try {
            super();
            this.al = 0;
            this.ae = 0;
            this.ar = 0;
            this.ax = new long[arg4];
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("mt.<init>(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public void ab() {
        this.al = 0;
        this.ar = 0;
        this.ae = 0;
    }

    public long ad() {
        if(this.ar * 0xDAAF02F5 == 0) {
            return 0;
        }

        return this.ae * -4062941947901893303L / (((long)(this.ar * 1790881229)));
    }

    public void ae(short arg3) {
        try {
            this.al = 0;
            this.ar = 0;
            this.ae = 0;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("mt.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void af() {
        this.al = 0;
        this.ar = 0;
        this.ae = 0;
    }

    public long aj() {
        int v1 = 0xDAAF02F5;
        if(this.ar * v1 == 0) {
            return 0;
        }

        return this.ae * -4062941947901893303L / (((long)(this.ar * v1)));
    }

    public long al(int arg6) {
        try {
            int v0 = 0xDAAF02F5;
            if(this.ar * v0 == 0) {
                return 0;
            }

            return this.ae * -4062941947901893303L / (((long)(this.ar * v0)));
        }
        catch(RuntimeException v6) {
            StringBuilder v0_1 = new StringBuilder();
            v0_1.append("mt.al(");
            v0_1.append(')');
            throw lx.al(((Throwable)v6), v0_1.toString());
        }
    }

    public void an(long arg9) {
        long v2 = -2182978016317809415L;
        int v4 = 0x521DC2E7;
        if(this.ar * 0xDAAF02F5 < this.ax.length) {
            this.ar += 0x995A195D;
        }
        else {
            this.ae -= this.ax[this.al * v4] * v2;
        }

        this.ae += v2 * arg9;
        this.ax[this.al * v4] = arg9;
        this.al = (this.al * v4 + 1) % this.ax.length * 0xEF1A30D7;
    }

    public long ap() {
        int v1 = 0xDAAF02F5;
        if(this.ar * v1 == 0) {
            return 0;
        }

        return this.ae * -4062941947901893303L / (((long)(this.ar * v1)));
    }

    public void aq() {
        this.al = 0;
        this.ar = 0;
        this.ae = 0;
    }

    public void ar(long arg8) {
        long v2 = -2182978016317809415L;
        if(this.ar * 0xDAAF02F5 < this.ax.length) {
            this.ar += 0x995A195D;
        }
        else {
            this.ae -= this.ax[this.al * -1179012437] * v2;
        }

        this.ae += v2 * arg8;
        this.ax[this.al * 0x5E029BC] = arg8;
        this.al = (this.al * 0x521DC2E7 + 1) % this.ax.length * 0xCF336AA9;
    }

    public void ax(long arg9) {
        try {
            long v2 = -2182978016317809415L;
            int v4 = 0x521DC2E7;
            if(this.ar * 0xDAAF02F5 < this.ax.length) {
                this.ar += 0x995A195D;
            }
            else {
                this.ae -= this.ax[this.al * v4] * v2;
            }

            this.ae += v2 * arg9;
            this.ax[this.al * v4] = arg9;
            this.al = (this.al * v4 + 1) % this.ax.length * 0xEF1A30D7;
            return;
        }
        catch(RuntimeException v9) {
            StringBuilder v10 = new StringBuilder();
            v10.append("mt.ax(");
            v10.append(')');
            throw lx.al(((Throwable)v9), v10.toString());
        }
    }

    static void ax(int arg0, Hashtable arg1, int arg2) {
        if(arg0 != 0) {
        }
        else {
            try {
                arg1.put("err_missing_config", "Missing com.jagex.config setting");
                arg1.put("err_invalid_config", "Invalid com.jagex.config setting");
                arg1.put("loading_config", "Loading configuration");
                arg1.put("err_load_config", "There was an error loading the game configuration from the website.\nIf you have a firewall, check that this program is allowed to access the Internet.");
                arg1.put("err_decode_config", "Error decoding configuration");
                arg1.put("loaderbox_initial", "Loading...");
                arg1.put("error", "Error");
                arg1.put("quit", "Quit");
                arg1.put("alreadyopen", "Please close your existing game before loading another one");
            }
            catch(RuntimeException v0) {
                StringBuilder v1 = new StringBuilder();
                v1.append("mt.ax(");
                v1.append(')');
                throw lx.al(((Throwable)v0), v1.toString());
            }
        }
    }
}

