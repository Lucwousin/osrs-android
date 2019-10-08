public class ba {
    int[] ab;
    int[] ad;
    static int[] ae;
    boolean af;
    int[] aj;
    static int[] al;
    bu an;
    int ap;
    int[] aq;
    static int[] ar;
    static int[] ax;

    static {
        ba.ax = new int[500];
        ba.al = new int[500];
        ba.ae = new int[500];
        ba.ar = new int[500];
    }

    ba(byte[] arg11, bu arg12) {
        super();
        this.an = null;
        this.ap = -1;
        int v1 = 0;
        this.af = false;
        this.an = arg12;
        lq v12 = new lq(arg11);
        lq v2 = new lq(arg11);
        v12.ar = 0x1FD59D46;
        int v3 = v12.ay(-96);
        int v5 = 0xF24F550B;
        v2.ar = (v12.ar * v5 + v3) * -1880437085;
        int v0 = 0;
        int v4 = 0;
        int v6 = -1;
        while(v0 < v3) {
            int v7 = v12.ay(-70);
            if(v7 > 0) {
                if(this.an.ae[v0] != 0) {
                    int v8 = v0 - 1;
                    while(v8 > v6) {
                        if(this.an.ae[v8] == 0) {
                            ba.ax[v4] = v8;
                            ba.al[v4] = 0;
                            ba.ae[v4] = 0;
                            ba.ar[v4] = 0;
                            ++v4;
                        }
                        else {
                            --v8;
                            continue;
                        }

                        break;
                    }
                }

                ba.ax[v4] = v0;
                v6 = this.an.ae[v0] == 3 ? 0x80 : 0;
                ba.al[v4] = (v7 & 1) != 0 ? v2.bo(-2083946860) : v6;
                ba.ae[v4] = (v7 & 2) != 0 ? v2.bo(0x8F82A433) : v6;
                ba.ar[v4] = (v7 & 4) != 0 ? v2.bo(0x975D18FB) : v6;
                ++v4;
                if(this.an.ae[v0] == 5) {
                    this.af = true;
                }

                v6 = v0;
            }

            ++v0;
        }

        if(v2.ar * v5 == arg11.length) {
            this.ap = v4;
            this.aj = new int[v4];
            this.ad = new int[v4];
            this.aq = new int[v4];
            this.ab = new int[v4];
            while(v1 < v4) {
                this.aj[v1] = ba.ax[v1];
                this.ad[v1] = ba.al[v1];
                this.aq[v1] = ba.ae[v1];
                this.ab[v1] = ba.ar[v1];
                ++v1;
            }

            return;
        }

        throw new RuntimeException();
    }
}

