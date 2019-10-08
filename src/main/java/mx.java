public class mx {
    public mx gb;
    public long gx;
    public mx gy;

    public mx() {
        super();
    }

    public void lf() {
        if(this.gy == null) {
            return;
        }

        this.gy.gb = this.gb;
        this.gb.gy = this.gy;
        this.gb = null;
        this.gy = null;
    }

    public boolean lg() {
        if(this.gy == null) {
            return 0;
        }

        return 1;
    }

    public boolean lh() {
        if(this.gy == null) {
            return 0;
        }

        return 1;
    }

    public boolean lk() {
        if(this.gy == null) {
            return 0;
        }

        return 1;
    }

    public void lp() {
        if(this.gy == null) {
            return;
        }

        this.gy.gb = this.gb;
        this.gb.gy = this.gy;
        this.gb = null;
        this.gy = null;
    }

    public void ly() {
        if(this.gy == null) {
            return;
        }

        this.gy.gb = this.gb;
        this.gb.gy = this.gy;
        this.gb = null;
        this.gy = null;
    }
}

