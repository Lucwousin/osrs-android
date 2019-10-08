import java.util.Iterator;

public class fo implements Iterator {
    mv ae;
    mv al;
    fc ax;

    fo(fc arg2) {
        super();
        this.ae = null;
        this.ax = arg2;
        this.al = this.ax.ax.dr;
        this.ae = null;
    }

    public void ad() {
        if(this.ae != null) {
            this.ae.de();
            this.ae = null;
            return;
        }

        throw new IllegalStateException();
    }

    public boolean ae() {
        boolean v0 = this.al != this.ax.ax ? true : false;
        return v0;
    }

    public void aj() {
        if(this.ae != null) {
            this.ae.de();
            this.ae = null;
            return;
        }

        throw new IllegalStateException();
    }

    public Object al() {
        mv v0 = this.al;
        mv v2 = null;
        if(v0 == this.ax.ax) {
            this.al = v2;
            v0 = v2;
        }
        else {
            this.al = v0.dr;
        }

        this.ae = v0;
        return v0;
    }

    public boolean an() {
        boolean v0 = this.al != this.ax.ax ? true : false;
        return v0;
    }

    public void ap() {
        if(this.ae != null) {
            this.ae.de();
            this.ae = null;
            return;
        }

        throw new IllegalStateException();
    }

    public boolean ar() {
        boolean v0 = this.al != this.ax.ax ? true : false;
        return v0;
    }

    public Object ax() {
        mv v0 = this.al;
        mv v2 = null;
        if(v0 == this.ax.ax) {
            this.al = v2;
            v0 = v2;
        }
        else {
            this.al = v0.dr;
        }

        this.ae = v0;
        return v0;
    }

    public boolean hasNext() {
        boolean v0 = this.al != this.ax.ax ? true : false;
        return v0;
    }

    public Object next() {
        mv v0 = this.al;
        mv v2 = null;
        if(v0 == this.ax.ax) {
            this.al = v2;
            v0 = v2;
        }
        else {
            this.al = v0.dr;
        }

        this.ae = v0;
        return v0;
    }

    public void remove() {
        if(this.ae != null) {
            this.ae.de();
            this.ae = null;
            return;
        }

        throw new IllegalStateException();
    }
}

