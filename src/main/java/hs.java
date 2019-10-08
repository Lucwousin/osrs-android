public class hs extends gd {
    public byte[] ae;
    public int al;
    int an;
    public boolean ap;
    public int ar;

    hs(int arg1, byte[] arg2, int arg3, int arg4) {
        super();
        this.al = arg1;
        this.ae = arg2;
        this.ar = arg3;
        this.an = arg4;
    }

    hs(int arg1, byte[] arg2, int arg3, int arg4, boolean arg5) {
        super();
        this.al = arg1;
        this.ae = arg2;
        this.ar = arg3;
        this.an = arg4;
        this.ap = arg5;
    }

    public hs ae(hg arg3) {
        int v3;
        this.ae = arg3.ax(this.ae, 0xD7FDF25A);
        this.al = arg3.al(this.al, 20);
        if(this.ar == this.an) {
            v3 = arg3.ae(this.ar, 0xB8ED6DF);
            this.an = v3;
            goto label_15;
        }
        else {
            this.ar = arg3.ae(this.ar, 0x2CEF30C9);
            this.an = arg3.ae(this.an, 0xB2B6738C);
            if(this.ar == this.an) {
                v3 = this.ar - 1;
            label_15:
                this.ar = v3;
            }
        }

        return this;
    }

    public hs al(hg arg3) {
        this.ae = arg3.ax(this.ae, -1933298506);
        this.al = arg3.al(this.al, 20);
        if(this.ar == this.an) {
            int v3 = arg3.ae(this.ar, 0xCF43190C);
            this.an = v3;
            this.ar = v3;
        }
        else {
            this.ar = arg3.ae(this.ar, 0xBA7A7F14);
            this.an = arg3.ae(this.an, 0xF6DFC751);
            if(this.ar == this.an) {
                --this.ar;
            }
        }

        return this;
    }

    public hs ar(hg arg3) {
        this.ae = arg3.ax(this.ae, 0xBC1AD015);
        this.al = arg3.al(this.al, 20);
        if(this.ar == this.an) {
            int v3 = arg3.ae(this.ar, 0x17300EEA);
            this.an = v3;
            this.ar = v3;
        }
        else {
            this.ar = arg3.ae(this.ar, 1303274887);
            this.an = arg3.ae(this.an, 1096373694);
            if(this.ar == this.an) {
                --this.ar;
            }
        }

        return this;
    }

    public hs ax(hg arg3) {
        this.ae = arg3.ax(this.ae, -1564967500);
        this.al = arg3.al(this.al, 20);
        if(this.ar == this.an) {
            int v3 = arg3.ae(this.ar, 0xD9B33C0E);
            this.an = v3;
            this.ar = v3;
        }
        else {
            this.ar = arg3.ae(this.ar, 835990195);
            this.an = arg3.ae(this.an, 0x609DC5D6);
            if(this.ar == this.an) {
                --this.ar;
            }
        }

        return this;
    }
}

