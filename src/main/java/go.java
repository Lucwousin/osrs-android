public class go {
    int[] ae;
    int al;
    int[] ar;
    int ax;

    go() {
        super();
        gf.ar(16);
        int v1 = 4;
        int v0 = gf.ae() != 0 ? gf.ar(v1) + 1 : 1;
        this.ax = v0;
        int v3 = 8;
        if(gf.ae() != 0) {
            gf.ar(v3);
        }

        gf.ar(2);
        if(this.ax > 1) {
            this.al = gf.ar(v1);
        }

        this.ae = new int[this.ax];
        this.ar = new int[this.ax];
        for(v0 = 0; v0 < this.ax; ++v0) {
            gf.ar(v3);
            this.ae[v0] = gf.ar(v3);
            this.ar[v0] = gf.ar(v3);
        }
    }
}

