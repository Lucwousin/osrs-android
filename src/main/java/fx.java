import java.util.Iterator;

public class fx implements Iterator {
    mx ae;
    mx al;
    fb ax;

    fx(fb arg2) {
        super();
        this.ae = null;
        this.aq(arg2);
    }

    void aa() {
        mx v1 = null;
        mx v0 = this.ax != null ? this.ax.ax.gb : v1;
        this.al = v0;
        this.ae = v1;
    }

    void ab() {
        mx v1 = null;
        mx v0 = this.ax != null ? this.ax.ax.gb : v1;
        this.al = v0;
        this.ae = v1;
    }

    public void ad() {
        if(this.ae != null) {
            this.ae.lp();
            this.ae = null;
            return;
        }

        throw new IllegalStateException();
    }

    public boolean ae() {
        boolean v0 = this.al != this.ax.ax ? true : false;
        return v0;
    }

    void af(fb arg1) {
        this.ax = arg1;
        this.ab();
    }

    void ai() {
        mx v1 = null;
        mx v0 = this.ax != null ? this.ax.ax.gb : v1;
        this.al = v0;
        this.ae = v1;
    }

    public void aj() {
        if(this.ae != null) {
            this.ae.lp();
            this.ae = null;
            return;
        }

        throw new IllegalStateException();
    }

    public Object al() {
        mx v0 = this.al;
        mx v2 = null;
        if(v0 == this.ax.ax) {
            this.al = v2;
            v0 = v2;
        }
        else {
            this.al = v0.gb;
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
            this.ae.lp();
            this.ae = null;
            return;
        }

        throw new IllegalStateException();
    }

    void aq(fb arg1) {
        this.ax = arg1;
        this.ab();
    }

    public boolean ar() {
        boolean v0 = this.al != this.ax.ax ? true : false;
        return v0;
    }

    void av() {
        mx v1 = null;
        mx v0 = this.ax != null ? this.ax.ax.gb : v1;
        this.al = v0;
        this.ae = v1;
    }

    public Object ax() {
        mx v0 = this.al;
        mx v2 = null;
        if(v0 == this.ax.ax) {
            this.al = v2;
            v0 = v2;
        }
        else {
            this.al = v0.gb;
        }

        this.ae = v0;
        return v0;
    }

    public boolean hasNext() {
        boolean v0 = this.al != this.ax.ax ? true : false;
        return v0;
    }

    public Object next() {
        mx v0 = this.al;
        mx v2 = null;
        if(v0 == this.ax.ax) {
            this.al = v2;
            v0 = v2;
        }
        else {
            this.al = v0.gb;
        }

        this.ae = v0;
        return v0;
    }

    public void remove() {
        if(this.ae != null) {
            this.ae.lp();
            this.ae = null;
            return;
        }

        throw new IllegalStateException();
    }
}

