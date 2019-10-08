public class nk {
    public int ae;
    public int al;
    public int an;
    public int ap;
    static hf aq = null;
    public int ar;
    byte ax;
    public static final int bd = 27;

    public nk() {
        try {
            super();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("nk.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public nk(lq arg3, boolean arg4) {
        try {
            super();
            this.ax = arg3.aw(-1215098345);
            this.al = arg3.ao(-1089037078) * 0x97C5FF2B;
            this.ae = arg3.ac(0x76) * 0x26DE4BF;
            this.ar = arg3.ac(104) * 0x64A37EC1;
            this.an = arg3.ac(0x70) * 0xCED60DE1;
            this.ap = arg3.ac(26) * 0xA4D55B45;
            if(arg4) {
                this.al(gn.ax(arg3, 84), -1697088086);
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("nk.<init>(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public int aa() {
        return this.ax & 7;
    }

    void ab(Integer arg1) {
    }

    static Integer ad(lq arg4) {
        int v0 = 0;
        int v1 = 0;
        while(true) {
            int v2 = arg4.ay(-20);
            if(0xFF == v2) {
                goto label_6;
            }

            if(v2 != 0) {
                break;
            }

            while(true) {
                if(-206127549 == arg4.ay(-8)) {
                    goto label_16;
                }

                arg4.ar -= -1880437085;
                if(arg4.ao(0xE4096C3F) != 0) {
                    goto label_33;
                }

                if(v0 != 0) {
                    break;
                }

                v1 = arg4.ac(30);
                v0 = 1;
            }

            throw new IllegalStateException("");
        label_33:
            throw new IllegalStateException("");
        label_16:
        }

        throw new IllegalStateException("");
    label_6:
        Integer v4 = v0 != 0 ? Integer.valueOf(v1) : null;
        return v4;
    }

    public int ae(int arg3) {
        try {
            return this.ax & 7;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("nk.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int af() {
        return this.ax & 7;
    }

    void ag(int arg2) {
        this.ax = ((byte)(this.ax & -8));
        this.ax = ((byte)(arg2 & 7 | this.ax));
    }

    void ah(int arg2) {
        this.ax = ((byte)(this.ax & -9));
        if(arg2 == 1) {
            this.ax = ((byte)(this.ax | 8));
        }
    }

    public int ai() {
        return this.ax & 7;
    }

    static Integer aj(lq arg4) {
        int v0 = 0;
        int v1 = 0;
        while(true) {
            int v2 = arg4.ay(-95);
            int v3 = 0xFF;
            if(v3 == v2) {
                goto label_6;
            }

            if(v2 != 0) {
                break;
            }

            while(true) {
                if(v3 == arg4.ay(-97)) {
                    goto label_15;
                }

                arg4.ar -= -1880437085;
                if(arg4.ao(0x999DEFD8) != 0) {
                    goto label_32;
                }

                if(v0 != 0) {
                    break;
                }

                v1 = arg4.ac(27);
                v0 = 1;
            }

            throw new IllegalStateException("");
        label_32:
            throw new IllegalStateException("");
        label_15:
        }

        throw new IllegalStateException("");
    label_6:
        Integer v4 = v0 != 0 ? Integer.valueOf(v1) : null;
        return v4;
    }

    void al(Integer arg1, int arg2) {
    }

    public int am() {
        int v0 = (this.ax & 8) == 8 ? 1 : 0;
        return v0;
    }

    void an(int arg2, int arg3) {
        try {
            this.ax = ((byte)(this.ax & -8));
            this.ax = ((byte)(arg2 & 7 | this.ax));
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nk.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void ap(int arg2, int arg3) {
        try {
            this.ax = ((byte)(this.ax & -9));
            if(arg2 == 1) {
                this.ax = ((byte)(this.ax | 8));
            }
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("nk.ap(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void aq(Integer arg1) {
    }

    public int ar(int arg3) {
        try {
            if((this.ax & 8) != 8) {
                return 0;
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("nk.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }

        return 1;
    }

    public int au() {
        int v0 = (this.ax & 8) == 8 ? 1 : 0;
        return v0;
    }

    public int av() {
        return this.ax & 7;
    }

    public int az() {
        int v0 = (this.ax & 8) == 8 ? 1 : 0;
        return v0;
    }
}

