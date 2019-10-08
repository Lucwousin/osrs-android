public class hb {
    int ae;
    hr[] al;
    int ar;
    static final int ax = 22050;

    hb(lq arg5) {
        super();
        int v0 = 10;
        this.al = new hr[v0];
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(arg5.ay(-55) == 0) {
            }
            else {
                arg5.ar -= -1880437085;
                this.al[v1] = new hr();
                this.al[v1].ae(arg5);
            }
        }

        this.ae = arg5.ao(1298024493);
        this.ar = arg5.ao(0xA8F47189);
    }

    public final int aa() {
        int v0 = 0;
        int v1 = 0;
        int v2 = 585202853;
        while(true) {
            int v3 = 10;
            if(v1 >= v3) {
                break;
            }

            if(this.al[v1] != null && this.al[v1].az / 20 < v2) {
                v2 = this.al[v1].az / 20;
            }

            ++v1;
        }

        if(this.ae < this.ar && this.ae / 20 < v2) {
            v2 = this.ae / 20;
        }

        if(v2 == 1380130715 || v2 == 0) {
            return 0;
        }

        while(v0 < v3) {
            if(this.al[v0] != null) {
                this.al[v0].az -= v2 * 20;
            }

            ++v0;
        }

        if(this.ae < this.ar) {
            v1 = v2 * 20;
            this.ae -= v1;
            this.ar -= v1;
        }

        return v2;
    }

    public hs ab() {
        return new hs(22050, this.ar(), this.ae * 22050 / 1000, this.ar * 22050 / 1000);
    }

    public static hb ad(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new hb(new lq(v1));
    }

    public final int ae() {
        int v0 = 0x98967F;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0x98967F;
        while(true) {
            int v4 = 10;
            if(v2 >= v4) {
                break;
            }

            if(this.al[v2] != null && this.al[v2].az / 20 < v3) {
                v3 = this.al[v2].az / 20;
            }

            ++v2;
        }

        if(this.ae < this.ar && this.ae / 20 < v3) {
            v3 = this.ae / 20;
        }

        if(v3 == v0 || v3 == 0) {
            return 0;
        }

        while(v1 < v4) {
            if(this.al[v1] != null) {
                this.al[v1].az -= v3 * 20;
            }

            ++v1;
        }

        if(this.ae < this.ar) {
            v1 = v3 * 20;
            this.ae -= v1;
            this.ar -= v1;
        }

        return v3;
    }

    public final int af() {
        int v0 = 0;
        int v1 = 0;
        int v2 = 0x98967F;
        while(true) {
            int v3 = 10;
            if(v1 >= v3) {
                break;
            }

            if(this.al[v1] != null && this.al[v1].az / 20 < v2) {
                v2 = this.al[v1].az / 20;
            }

            ++v1;
        }

        if(this.ae < this.ar && this.ae / 20 < v2) {
            v2 = this.ae / 20;
        }

        if(v2 == 0x2F4A9D01 || v2 == 0) {
            return 0;
        }

        while(v0 < v3) {
            if(this.al[v0] != null) {
                this.al[v0].az -= v2 * 20;
            }

            ++v0;
        }

        if(this.ae < this.ar) {
            v1 = v2 * 20;
            this.ae -= v1;
            this.ar -= v1;
        }

        return v2;
    }

    public final int ai() {
        int v0 = 0;
        int v1 = 0;
        int v2 = 0x98967F;
        while(true) {
            int v3 = 10;
            if(v1 >= v3) {
                break;
            }

            if(this.al[v1] != null && this.al[v1].az / 20 < v2) {
                v2 = this.al[v1].az / 20;
            }

            ++v1;
        }

        if(this.ae < this.ar && this.ae / 20 < v2) {
            v2 = this.ae / 20;
        }

        if(v2 == 0x99890173 || v2 == 0) {
            return 0;
        }

        while(v0 < v3) {
            if(this.al[v0] != null) {
                this.al[v0].az -= v2 * 20;
            }

            ++v0;
        }

        if(this.ae < this.ar) {
            v1 = v2 * 20;
            this.ae -= v1;
            this.ar -= v1;
        }

        return v2;
    }

    public static hb aj(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new hb(new lq(v1));
    }

    public hs al() {
        return new hs(22050, this.ar(), this.ae * 22050 / 1000, this.ar * 22050 / 1000);
    }

    final byte[] am() {
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = 10;
            if(v1 >= v3) {
                break;
            }

            if(this.al[v1] != null && this.al[v1].am + this.al[v1].az > v2) {
                v2 = this.al[v1].am + this.al[v1].az;
            }

            ++v1;
        }

        if(v2 == 0) {
            return new byte[0];
        }

        byte[] v1_1 = new byte[v2 * 22050 / 1000];
        for(v2 = 0; v2 < v3; ++v2) {
            if(this.al[v2] != null) {
                int v4 = this.al[v2].am * 22050 / 1000;
                int v5 = this.al[v2].az * 22050 / 1000;
                int[] v6 = this.al[v2].ax(v4, this.al[v2].am);
                int v7;
                for(v7 = 0; v7 < v4; ++v7) {
                    int v8 = v7 + v5;
                    int v9 = v1_1[v8] + (v6[v7] >> 8);
                    if((v9 + 0x80 & 0xFFFFFF00) != 0) {
                        v9 = v9 >> 0x1F ^ 0x7F;
                    }

                    v1_1[v8] = ((byte)v9);
                }
            }
        }

        return v1_1;
    }

    public static hb an(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new hb(new lq(v1));
    }

    public static hb ap(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new hb(new lq(v1));
    }

    public static hb aq(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new hb(new lq(v1));
    }

    final byte[] ar() {
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = 10;
            if(v1 >= v3) {
                break;
            }

            if(this.al[v1] != null && this.al[v1].am + this.al[v1].az > v2) {
                v2 = this.al[v1].am + this.al[v1].az;
            }

            ++v1;
        }

        if(v2 == 0) {
            return new byte[0];
        }

        byte[] v1_1 = new byte[v2 * 22050 / 1000];
        for(v2 = 0; v2 < v3; ++v2) {
            if(this.al[v2] != null) {
                int v4 = this.al[v2].am * 22050 / 1000;
                int v5 = this.al[v2].az * 22050 / 1000;
                int[] v6 = this.al[v2].ax(v4, this.al[v2].am);
                int v7;
                for(v7 = 0; v7 < v4; ++v7) {
                    int v8 = v7 + v5;
                    int v9 = v1_1[v8] + (v6[v7] >> 8);
                    if((v9 + 0x80 & 0xFFFFFF00) != 0) {
                        v9 = v9 >> 0x1F ^ 0x7F;
                    }

                    v1_1[v8] = ((byte)v9);
                }
            }
        }

        return v1_1;
    }

    final byte[] au() {
        int v1 = 0;
        int v2 = 0;
        while(true) {
            int v3 = 10;
            if(v1 >= v3) {
                break;
            }

            if(this.al[v1] != null && this.al[v1].am + this.al[v1].az > v2) {
                v2 = this.al[v1].am + this.al[v1].az;
            }

            ++v1;
        }

        if(v2 == 0) {
            return new byte[0];
        }

        byte[] v1_1 = new byte[v2 * 22050 / 1000];
        for(v2 = 0; v2 < v3; ++v2) {
            if(this.al[v2] != null) {
                int v4 = this.al[v2].am * 22050 / 1000;
                int v5 = this.al[v2].az * 22050 / 1000;
                int[] v6 = this.al[v2].ax(v4, this.al[v2].am);
                int v7;
                for(v7 = 0; v7 < v4; ++v7) {
                    int v8 = v7 + v5;
                    int v9 = v1_1[v8] + (v6[v7] >> 8);
                    if((v9 + 0x80 & 0xFFFFFF00) != 0) {
                        v9 = v9 >> 0x1F ^ 0x7F;
                    }

                    v1_1[v8] = ((byte)v9);
                }
            }
        }

        return v1_1;
    }

    public final int av() {
        int v0 = 0x98967F;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0x98967F;
        while(true) {
            int v4 = 10;
            if(v2 >= v4) {
                break;
            }

            if(this.al[v2] != null && this.al[v2].az / 20 < v3) {
                v3 = this.al[v2].az / 20;
            }

            ++v2;
        }

        if(this.ae < this.ar && this.ae / 20 < v3) {
            v3 = this.ae / 20;
        }

        if(v3 == v0 || v3 == 0) {
            return 0;
        }

        while(v1 < v4) {
            if(this.al[v1] != null) {
                this.al[v1].az -= v3 * 20;
            }

            ++v1;
        }

        if(this.ae < this.ar) {
            v1 = v3 * 20;
            this.ae -= v1;
            this.ar -= v1;
        }

        return v3;
    }

    public static hb ax(ko arg1, int arg2, int arg3) {
        byte[] v1 = arg1.ae(arg2, arg3, 0x78DC0DC9);
        if(v1 == null) {
            return null;
        }

        return new hb(new lq(v1));
    }
}

