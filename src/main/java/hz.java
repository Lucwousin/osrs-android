public abstract class hz extends mx {
    gd ag;
    volatile boolean ah;
    hz am;
    int az;

    protected hz() {
        super();
        this.ah = true;
    }

    protected abstract hz ac();

    protected abstract int ad();

    protected abstract void af(int arg1);

    protected abstract hz aj();

    protected abstract hz ap();

    protected abstract void aq(int[] arg1, int arg2, int arg3);

    protected abstract hz ba();

    protected abstract hz bd();

    protected abstract int bf();

    int bk() {
        return 0xFF;
    }

    protected abstract int bn();

    protected abstract void bo(int[] arg1, int arg2, int arg3);

    protected abstract int bp();

    protected abstract void bt(int[] arg1, int arg2, int arg3);

    protected abstract void bw(int[] arg1, int arg2, int arg3);

    protected abstract void by(int[] arg1, int arg2, int arg3);

    protected abstract void bz(int arg1);

    int gc() {
        return 0xFF;
    }

    final void gl(int[] arg2, int arg3, int arg4) {
        if(this.ah) {
            this.aq(arg2, arg3, arg4);
        }
        else {
            this.af(arg4);
        }
    }

    final void gn(int[] arg2, int arg3, int arg4) {
        if(this.ah) {
            this.aq(arg2, arg3, arg4);
        }
        else {
            this.af(arg4);
        }
    }

    final void gu(int[] arg2, int arg3, int arg4) {
        if(this.ah) {
            this.aq(arg2, arg3, arg4);
        }
        else {
            this.af(arg4);
        }
    }
}

