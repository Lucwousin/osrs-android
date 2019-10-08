import java.util.Iterator;

public class fc implements Iterable {
    mv al;
    public mv ax;

    public fc() {
        super();
        this.ax = new mv();
        this.ax.dr = this.ax;
        this.ax.dn = this.ax;
    }

    public void aa(mv arg2) {
        if(arg2.dn != null) {
            arg2.de();
        }

        arg2.dn = this.ax.dn;
        arg2.dr = this.ax;
        arg2.dn.dr = arg2;
        arg2.dr.dn = arg2;
    }

    public void ab() {
        while(this.ax.dr != this.ax) {
            this.ax.dr.de();
        }
    }

    mv ac(mv arg2) {
        if(arg2 == null) {
            arg2 = this.ax.dr;
        }

        if(arg2 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = arg2.dr;
        return arg2;
    }

    public void ad() {
        while(this.ax.dr != this.ax) {
            this.ax.dr.de();
        }
    }

    public static void ae(mv arg1, mv arg2) {
        if(arg1.dn != null) {
            arg1.de();
        }

        arg1.dn = arg2;
        arg1.dr = arg2.dr;
        arg1.dn.dr = arg1;
        arg1.dr.dn = arg1;
    }

    public void af() {
        while(this.ax.dr != this.ax) {
            this.ax.dr.de();
        }
    }

    public mv ag() {
        mv v0 = this.ax.dr;
        if(v0 == this.ax) {
            return null;
        }

        v0.de();
        return v0;
    }

    public mv ah() {
        mv v0 = this.ax.dr;
        if(v0 == this.ax) {
            return null;
        }

        v0.de();
        return v0;
    }

    public void ai(mv arg2) {
        if(arg2.dn != null) {
            arg2.de();
        }

        arg2.dn = this.ax.dn;
        arg2.dr = this.ax;
        arg2.dn.dr = arg2;
        arg2.dr.dn = arg2;
    }

    public mv aj() {
        mv v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.dr;
        return v0;
    }

    mv ak(mv arg2) {
        if(arg2 == null) {
            arg2 = this.ax.dr;
        }

        if(arg2 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = arg2.dr;
        return arg2;
    }

    public void al(mv arg2) {
        if(arg2.dn != null) {
            arg2.de();
        }

        arg2.dn = this.ax.dn;
        arg2.dr = this.ax;
        arg2.dn.dr = arg2;
        arg2.dr.dn = arg2;
    }

    public static void am(mv arg1, mv arg2) {
        if(arg1.dn != null) {
            arg1.de();
        }

        arg1.dn = arg2;
        arg1.dr = arg2.dr;
        arg1.dn.dr = arg1;
        arg1.dr.dn = arg1;
    }

    public mv an() {
        return this.ap(null);
    }

    public mv ao() {
        return this.ap(null);
    }

    mv ap(mv arg2) {
        if(arg2 == null) {
            arg2 = this.ax.dr;
        }

        if(arg2 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = arg2.dr;
        return arg2;
    }

    public void aq() {
        while(this.ax.dr != this.ax) {
            this.ax.dr.de();
        }
    }

    public mv ar() {
        mv v0 = this.ax.dr;
        if(v0 == this.ax) {
            return null;
        }

        v0.de();
        return v0;
    }

    public mv as() {
        return this.ap(null);
    }

    public mv at() {
        mv v0 = this.ax.dr;
        if(v0 == this.ax) {
            return null;
        }

        v0.de();
        return v0;
    }

    public static void au(mv arg1, mv arg2) {
        if(arg1.dn != null) {
            arg1.de();
        }

        arg1.dn = arg2;
        arg1.dr = arg2.dr;
        arg1.dn.dr = arg1;
        arg1.dr.dn = arg1;
    }

    public void av(mv arg2) {
        if(arg2.dn != null) {
            arg2.de();
        }

        arg2.dn = this.ax.dn;
        arg2.dr = this.ax;
        arg2.dn.dr = arg2;
        arg2.dr.dn = arg2;
    }

    public mv aw() {
        return this.ap(null);
    }

    public void ax() {
        while(this.ax.dr != this.ax) {
            this.ax.dr.de();
        }
    }

    public mv ay() {
        return this.ap(null);
    }

    public mv az() {
        mv v0 = this.ax.dr;
        if(v0 == this.ax) {
            return null;
        }

        v0.de();
        return v0;
    }

    public mv ba() {
        mv v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.dr;
        return v0;
    }

    public mv bd() {
        mv v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.dr;
        return v0;
    }

    public Iterator bf() {
        return new fo(this);
    }

    public Iterator bn() {
        return new fo(this);
    }

    public Iterator bp() {
        return new fo(this);
    }

    public Iterator bw() {
        return new fo(this);
    }

    public Iterator iterator() {
        return new fo(this);
    }
}

