public class fu {
    ms al;
    ms ax;

    public fu() {
        super();
        this.ax = new ms();
        this.ax.ar = this.ax;
        this.ax.an = this.ax;
    }

    public ms ae() {
        ms v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.ar;
        return v0;
    }

    public ms aj() {
        ms v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.ar;
        return v0;
    }

    public ms al() {
        ms v0 = this.ax.ar;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.ar;
        return v0;
    }

    public ms an() {
        ms v0 = this.ax.ar;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.ar;
        return v0;
    }

    public ms ap() {
        ms v0 = this.ax.ar;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.ar;
        return v0;
    }

    public void ar(ms arg2) {
        if(arg2.an != null) {
            arg2.ax();
        }

        arg2.an = this.ax.an;
        arg2.ar = this.ax;
        arg2.an.ar = arg2;
        arg2.ar.an = arg2;
    }

    public void ax(ms arg2) {
        if(arg2.an != null) {
            arg2.ax();
        }

        arg2.an = this.ax.an;
        arg2.ar = this.ax;
        arg2.an.ar = arg2;
        arg2.ar.an = arg2;
    }
}

