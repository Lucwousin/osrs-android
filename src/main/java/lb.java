import java.util.zip.Inflater;

public class lb {
    static final int at = 4;
    static int[] av = null;
    Inflater ax;
    static final int bz = 2;

    public lb() {
        int v0 = -1;
        int v1 = 1000000;
        try {
            this(v0, v1, v1);
            return;
        }
        catch(RuntimeException v0_1) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("lb.<init>(");
            v1_1.append(')');
            throw lx.al(((Throwable)v0_1), v1_1.toString());
        }
    }

    lb(int arg1, int arg2, int arg3) {
        try {
            super();
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("lb.<init>(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void ae(lq arg6, byte[] arg7) {
        int v2 = 0xF24F550B;
        if(0x720A32FD == arg6.ae[arg6.ar * v2] && arg6.ae[arg6.ar * v2 + 1] == -1781638604) {
            if(this.ax == null) {
                this.ax = new Inflater(true);
            }

            try {
                this.ax.setInput(arg6.ae, arg6.ar * 0xA6C203CB + 10, arg6.ae.length - (arg6.ar * 215053190 + 18));
                this.ax.inflate(arg7);
            }
            catch(Exception ) {
                this.ax.reset();
                throw new RuntimeException("");
            }

            this.ax.reset();
            return;
        }

        throw new RuntimeException("");
    }

    public void al(lq arg6, byte[] arg7) {
        if(0x6E5AF88 == arg6.ae[arg6.ar * 825998060]) {
            int v2 = 0xF24F550B;
            if(arg6.ae[arg6.ar * v2 + 1] == 347600035) {
                if(this.ax == null) {
                    this.ax = new Inflater(true);
                }

                try {
                    this.ax.setInput(arg6.ae, arg6.ar * v2 + 10, arg6.ae.length - (arg6.ar * 0xC056F0C1 + 18));
                    this.ax.inflate(arg7);
                }
                catch(Exception ) {
                    this.ax.reset();
                    throw new RuntimeException("");
                }

                this.ax.reset();
                return;
            }
        }

        throw new RuntimeException("");
    }

    static void ar(byte arg2) {
        try {
            cc.aj.ap();
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("lb.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public void ar(lq arg6, byte[] arg7) {
        if(0x1F == arg6.ae[arg6.ar * 0xA40D9E60] && arg6.ae[arg6.ar * -1373510574 + 1] == 0xCD900A74) {
            if(this.ax == null) {
                this.ax = new Inflater(true);
            }

            try {
                this.ax.setInput(arg6.ae, arg6.ar * 0xE1295ABB + 10, arg6.ae.length - (arg6.ar * 0xB477A77 + 18));
                this.ax.inflate(arg7);
            }
            catch(Exception ) {
                this.ax.reset();
                throw new RuntimeException("");
            }

            this.ax.reset();
            return;
        }

        throw new RuntimeException("");
    }

    public void ax(lq arg5, byte[] arg6, int arg7) {
        arg7 = 0x1F;
        try {
            int v2 = 0xF24F550B;
            if(arg7 == arg5.ae[arg5.ar * v2] && arg5.ae[arg5.ar * v2 + 1] == 0xFFFFFF8B) {
                if(this.ax == null) {
                    this.ax = new Inflater(true);
                }

                try {
                    this.ax.setInput(arg5.ae, arg5.ar * v2 + 10, arg5.ae.length - (arg5.ar * v2 + 18));
                    this.ax.inflate(arg6);
                }
                catch(Exception ) {
                    this.ax.reset();
                    throw new RuntimeException("");
                }

                this.ax.reset();
                return;
            }

            throw new RuntimeException("");
        }
        catch(RuntimeException v5) {
            StringBuilder v6 = new StringBuilder();
            v6.append("lb.ax(");
            v6.append(')');
            throw lx.al(((Throwable)v5), v6.toString());
        }
    }

    static final void hf(if arg2, boolean arg3, short arg4) {
        try {
            int v4 = arg2.ax * 0x199DF2C5;
            int v0 = ((int)arg2.gx);
            arg2.lp();
            if(arg3) {
                lz.an(v4, -592154904);
            }

            aw.hj(v4, 0xB4883DC1);
            ar v2_1 = bl.al(v0, 0x64D7CF4D);
            if(v2_1 != null) {
                kx.gw(v2_1, 0x7FDCF49C);
            }

            fh.kf.bl(0x4F0EFCB9);
            v4 = 0xD233AC37;
            if(-1 != client.kt * v4) {
                ek.ga(client.kt * v4, 1, 0x7F588DAB);
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("lb.hf(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

