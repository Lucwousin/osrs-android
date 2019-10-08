public class mv extends mx {
    public long dl;
    public mv dn;
    public mv dr;

    public mv() {
        super();
    }

    public void dc() {
        if(this.dn == null) {
            return;
        }

        this.dn.dr = this.dr;
        this.dr.dn = this.dn;
        this.dr = null;
        this.dn = null;
    }

    public void de() {
        if(this.dn == null) {
            return;
        }

        this.dn.dr = this.dr;
        this.dr.dn = this.dn;
        this.dr = null;
        this.dn = null;
    }

    public void dk() {
        if(this.dn == null) {
            return;
        }

        this.dn.dr = this.dr;
        this.dr.dn = this.dn;
        this.dr = null;
        this.dn = null;
    }
}

