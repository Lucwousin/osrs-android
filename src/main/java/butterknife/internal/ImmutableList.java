package butterknife.internal;

import java.util.AbstractList;
import java.util.RandomAccess;

final class ImmutableList extends AbstractList implements RandomAccess {
    private final Object[] views;

    ImmutableList(Object[] arg1) {
        super();
        this.views = arg1;
    }

    public boolean contains(Object arg6) {
        Object[] v0 = this.views;
        int v1 = v0.length;
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            if(v0[v3] == arg6) {
                return 1;
            }
        }

        return 0;
    }

    public Object get(int arg2) {
        return this.views[arg2];
    }

    public int size() {
        return this.views.length;
    }
}

