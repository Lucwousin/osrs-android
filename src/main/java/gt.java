import java.lang.ref.SoftReference;

public class gt extends gw {
    SoftReference ax;

    gt(Object arg1, int arg2) {
        super(arg2);
        this.ax = new SoftReference(arg1);
    }

    boolean ad() {
        return 1;
    }

    Object ae() {
        return this.ax.get();
    }

    boolean aj() {
        return 1;
    }

    boolean al() {
        return 1;
    }

    boolean an() {
        return 1;
    }

    boolean ap() {
        return 1;
    }

    Object ar() {
        return this.ax.get();
    }

    Object ax() {
        return this.ax.get();
    }
}

