public class hm {
    int ab;
    int ad;
    int[] ae;
    int af;
    int aj;
    int[] al;
    int an;
    int ap;
    int aq;
    int ar;
    int ax;

    hm() {
        // Method was not decompiled
    }

    final void ab() {
        this.aj = 0;
        this.ad = 0;
        this.aq = 0;
        this.ab = 0;
        this.af = 0;
    }

    final void ad(lq arg4) {
        this.ax = arg4.ay(-37);
        this.al = new int[this.ax];
        this.ae = new int[this.ax];
        int v0;
        for(v0 = 0; v0 < this.ax; ++v0) {
            this.al[v0] = arg4.ao(0xDD5C3551);
            this.ae[v0] = arg4.ao(0x7DE6C38A);
        }
    }

    final void ae() {
        this.aj = 0;
        this.ad = 0;
        this.aq = 0;
        this.ab = 0;
        this.af = 0;
    }

    final void af() {
        this.aj = 0;
        this.ad = 0;
        this.aq = 0;
        this.ab = 0;
        this.af = 0;
    }

    final int ai(int arg5) {
        if(this.af >= this.aj) {
            int[] v0 = this.ae;
            int v1 = this.ad;
            this.ad = v1 + 1;
            this.ab = v0[v1] << 15;
            if(this.ad >= this.ax) {
                this.ad = this.ax - 1;
            }

            this.aj = ((int)((((double)this.al[this.ad])) / 65536 * (((double)arg5))));
            if(this.aj <= this.af) {
                goto label_40;
            }

            this.aq = ((this.ae[this.ad] << 15) - this.ab) / (this.aj - this.af);
        }

    label_40:
        this.ab += this.aq;
        ++this.af;
        return this.ab - this.aq >> 15;
    }

    final void aj(lq arg2) {
        this.ap = arg2.ay(-35);
        this.ar = arg2.ac(91);
        this.an = arg2.ac(102);
        this.al(arg2);
    }

    final void al(lq arg4) {
        this.ax = arg4.ay(-80);
        this.al = new int[this.ax];
        this.ae = new int[this.ax];
        int v0;
        for(v0 = 0; v0 < this.ax; ++v0) {
            this.al[v0] = arg4.ao(0xCBC2998F);
            this.ae[v0] = arg4.ao(-1018618564);
        }
    }

    final void an(lq arg2) {
        this.ap = arg2.ay(-97);
        this.ar = arg2.ac(10);
        this.an = arg2.ac(0x6F);
        this.al(arg2);
    }

    final void ap(lq arg2) {
        this.ap = arg2.ay(-2);
        this.ar = arg2.ac(12);
        this.an = arg2.ac(103);
        this.al(arg2);
    }

    final void aq() {
        this.aj = 0;
        this.ad = 0;
        this.aq = 0;
        this.ab = 0;
        this.af = 0;
    }

    final int ar(int arg5) {
        if(this.af >= this.aj) {
            int[] v0 = this.ae;
            int v1 = this.ad;
            this.ad = v1 + 1;
            this.ab = v0[v1] << 15;
            if(this.ad >= this.ax) {
                this.ad = this.ax - 1;
            }

            this.aj = ((int)((((double)this.al[this.ad])) / 65536 * (((double)arg5))));
            if(this.aj <= this.af) {
                goto label_40;
            }

            this.aq = ((this.ae[this.ad] << 15) - this.ab) / (this.aj - this.af);
        }

    label_40:
        this.ab += this.aq;
        ++this.af;
        return this.ab - this.aq >> 15;
    }

    final int av(int arg5) {
        if(this.af >= this.aj) {
            int[] v0 = this.ae;
            int v1 = this.ad;
            this.ad = v1 + 1;
            this.ab = v0[v1] << 15;
            if(this.ad >= this.ax) {
                this.ad = this.ax - 1;
            }

            this.aj = ((int)((((double)this.al[this.ad])) / 65536 * (((double)arg5))));
            if(this.aj <= this.af) {
                goto label_40;
            }

            this.aq = ((this.ae[this.ad] << 15) - this.ab) / (this.aj - this.af);
        }

    label_40:
        this.ab += this.aq;
        ++this.af;
        return this.ab - this.aq >> 15;
    }

    final void ax(lq arg2) {
        this.ap = arg2.ay(-83);
        this.ar = arg2.ac(23);
        this.an = arg2.ac(0x20);
        this.al(arg2);
    }
}

