import java.util.Collection;
import java.util.Iterator;

public class fb implements Iterable, Collection {
    mx al;
    mx ax;

    public fb() {
        super();
        this.ax = new mx();
        this.ax.gb = this.ax;
        this.ax.gy = this.ax;
    }

    public void aa(mx arg2) {
        if(arg2.gy != null) {
            arg2.lp();
        }

        arg2.gy = this.ax.gy;
        arg2.gb = this.ax;
        arg2.gy.gb = arg2;
        arg2.gb.gy = arg2;
    }

    mx[] ab() {
        mx[] v0 = new mx[this.ad()];
        mx v1 = this.ax.gb;
        int v2;
        for(v2 = 0; v1 != this.ax; ++v2) {
            v0[v2] = v1;
            v1 = v1.gb;
        }

        return v0;
    }

    public mx ac() {
        mx v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.gb;
        return v0;
    }

    int ad() {
        mx v0 = this.ax.gb;
        int v1 = 0;
        while(v0 != this.ax) {
            ++v1;
            v0 = v0.gb;
        }

        return v1;
    }

    public boolean add(Object arg1) {
        return this.af(((mx)arg1));
    }

    public boolean addAll(Collection arg1) {
        throw new RuntimeException();
    }

    public void ae(mx arg2) {
        if(arg2.gy != null) {
            arg2.lp();
        }

        arg2.gy = this.ax;
        arg2.gb = this.ax.gb;
        arg2.gy.gb = arg2;
        arg2.gb.gy = arg2;
    }

    boolean af(mx arg1) {
        this.al(arg1);
        return 1;
    }

    public static void ag(mx arg1, mx arg2) {
        if(arg1.gy != null) {
            arg1.lp();
        }

        arg1.gy = arg2;
        arg1.gb = arg2.gb;
        arg1.gy.gb = arg1;
        arg1.gb.gy = arg1;
    }

    public mx ah() {
        return this.ap(null);
    }

    public void ai() {
        while(this.ax.gb != this.ax) {
            this.ax.gb.lp();
        }
    }

    public mx aj() {
        mx v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.gb;
        return v0;
    }

    public mx ak() {
        mx v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.gb;
        return v0;
    }

    public void al(mx arg2) {
        if(arg2.gy != null) {
            arg2.lp();
        }

        arg2.gy = this.ax.gy;
        arg2.gb = this.ax;
        arg2.gy.gb = arg2;
        arg2.gb.gy = arg2;
    }

    public void am(mx arg2) {
        if(arg2.gy != null) {
            arg2.lp();
        }

        arg2.gy = this.ax;
        arg2.gb = this.ax.gb;
        arg2.gy.gb = arg2;
        arg2.gb.gy = arg2;
    }

    public mx an() {
        return this.ap(null);
    }

    mx ao(mx arg2) {
        if(arg2 == null) {
            arg2 = this.ax.gb;
        }

        if(arg2 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = arg2.gb;
        return arg2;
    }

    mx ap(mx arg2) {
        if(arg2 == null) {
            arg2 = this.ax.gb;
        }

        if(arg2 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = arg2.gb;
        return arg2;
    }

    public boolean aq() {
        boolean v0 = this.ax.gb == this.ax ? true : false;
        return v0;
    }

    public static void ar(mx arg1, mx arg2) {
        if(arg1.gy != null) {
            arg1.lp();
        }

        arg1.gy = arg2;
        arg1.gb = arg2.gb;
        arg1.gy.gb = arg1;
        arg1.gb.gy = arg1;
    }

    public mx as() {
        mx v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.gb;
        return v0;
    }

    public mx at() {
        return this.ap(null);
    }

    public void au(mx arg2) {
        if(arg2.gy != null) {
            arg2.lp();
        }

        arg2.gy = this.ax.gy;
        arg2.gb = this.ax;
        arg2.gy.gb = arg2;
        arg2.gb.gy = arg2;
    }

    public void av() {
        while(this.ax.gb != this.ax) {
            this.ax.gb.lp();
        }
    }

    mx aw(mx arg2) {
        if(arg2 == null) {
            arg2 = this.ax.gb;
        }

        if(arg2 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = arg2.gb;
        return arg2;
    }

    public void ax() {
        while(this.ax.gb != this.ax) {
            this.ax.gb.lp();
        }
    }

    public mx ay() {
        return this.ap(null);
    }

    public static void az(mx arg1, mx arg2) {
        if(arg1.gy != null) {
            arg1.lp();
        }

        arg1.gy = arg2;
        arg1.gb = arg2.gb;
        arg1.gy.gb = arg1;
        arg1.gb.gy = arg1;
    }

    int ba() {
        mx v0 = this.ax.gb;
        int v1 = 0;
        while(v0 != this.ax) {
            ++v1;
            v0 = v0.gb;
        }

        return v1;
    }

    public boolean bb() {
        return this.aq();
    }

    public boolean bc(Object arg1) {
        throw new RuntimeException();
    }

    public mx bd() {
        mx v0 = this.al;
        if(v0 == this.ax) {
            this.al = null;
            return null;
        }

        this.al = v0.gb;
        return v0;
    }

    boolean be(mx arg1) {
        this.al(arg1);
        return 1;
    }

    public Iterator bf() {
        return new fx(this);
    }

    mx[] bg() {
        mx[] v0 = new mx[this.ad()];
        int v1 = 0;
        mx v2 = this.ax.gb;
        while(v2 != this.ax) {
            v0[v1] = v2;
            v2 = v2.gb;
            ++v1;
        }

        return v0;
    }

    public boolean bh() {
        return this.aq();
    }

    public boolean bi(Object arg1) {
        throw new RuntimeException();
    }

    public Object[] bj(Object[] arg4) {
        mx v0 = this.ax.gb;
        int v1;
        for(v1 = 0; v0 != this.ax; ++v1) {
            arg4[v1] = v0;
            v0 = v0.gb;
        }

        return arg4;
    }

    public boolean bk(Object arg1) {
        throw new RuntimeException();
    }

    boolean bl(mx arg1) {
        this.al(arg1);
        return 1;
    }

    public Object[] bm() {
        return this.ab();
    }

    public Iterator bn() {
        return new fx(this);
    }

    int bo() {
        mx v0 = this.ax.gb;
        int v1 = 0;
        while(v0 != this.ax) {
            ++v1;
            v0 = v0.gb;
        }

        return v1;
    }

    public Iterator bp() {
        return new fx(this);
    }

    mx[] bq() {
        mx[] v0 = new mx[this.ad()];
        int v1 = 0;
        mx v2 = this.ax.gb;
        while(v2 != this.ax) {
            v0[v1] = v2;
            v2 = v2.gb;
            ++v1;
        }

        return v0;
    }

    public boolean br(Object arg1) {
        throw new RuntimeException();
    }

    boolean bs(mx arg1) {
        this.al(arg1);
        return 1;
    }

    public boolean bt() {
        boolean v0 = this.ax.gb == this.ax ? true : false;
        return v0;
    }

    public Object[] bu(Object[] arg4) {
        mx v0 = this.ax.gb;
        int v1;
        for(v1 = 0; v0 != this.ax; ++v1) {
            arg4[v1] = v0;
            v0 = v0.gb;
        }

        return arg4;
    }

    public boolean bv() {
        boolean v0 = this.ax.gb == this.ax ? true : false;
        return v0;
    }

    public Iterator bw() {
        return new fx(this);
    }

    mx[] bx() {
        mx[] v0 = new mx[this.ad()];
        int v1 = 0;
        mx v2 = this.ax.gb;
        while(v2 != this.ax) {
            v0[v1] = v2;
            v2 = v2.gb;
            ++v1;
        }

        return v0;
    }

    public boolean by() {
        boolean v0 = this.ax.gb == this.ax ? true : false;
        return v0;
    }

    public int bz() {
        return this.ad();
    }

    public boolean ca(Collection arg1) {
        throw new RuntimeException();
    }

    public boolean cb(Collection arg1) {
        throw new RuntimeException();
    }

    public void cc() {
        this.ax();
    }

    public boolean cd(Collection arg1) {
        throw new RuntimeException();
    }

    public boolean cf(Collection arg1) {
        throw new RuntimeException();
    }

    public boolean ci(Object arg1) {
        return this.af(((mx)arg1));
    }

    public boolean cj(Collection arg1) {
        throw new RuntimeException();
    }

    public void clear() {
        this.ax();
    }

    public boolean contains(Object arg1) {
        throw new RuntimeException();
    }

    public boolean containsAll(Collection arg1) {
        throw new RuntimeException();
    }

    public void cp() {
        this.ax();
    }

    public boolean cw(Collection arg1) {
        throw new RuntimeException();
    }

    public boolean cx(Collection arg1) {
        throw new RuntimeException();
    }

    public boolean cy(Collection arg1) {
        throw new RuntimeException();
    }

    public boolean equals(Object arg3) {
        try {
            return super.equals(arg3);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("fb.equals(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public int hashCode() {
        try {
            return super.hashCode();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("fb.hashCode(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public boolean hd(Object arg1) {
        return super.equals(arg1);
    }

    public boolean hh(Object arg1) {
        return super.equals(arg1);
    }

    public int ht() {
        return super.hashCode();
    }

    public int hy() {
        return super.hashCode();
    }

    public boolean isEmpty() {
        return this.aq();
    }

    public Iterator iterator() {
        return new fx(this);
    }

    public boolean remove(Object arg1) {
        throw new RuntimeException();
    }

    public boolean removeAll(Collection arg1) {
        throw new RuntimeException();
    }

    public boolean retainAll(Collection arg1) {
        throw new RuntimeException();
    }

    public int size() {
        return this.ad();
    }

    public Object[] toArray() {
        return this.ab();
    }

    public Object[] toArray(Object[] arg4) {
        mx v0 = this.ax.gb;
        int v1;
        for(v1 = 0; v0 != this.ax; ++v1) {
            arg4[v1] = v0;
            v0 = v0.gb;
        }

        return arg4;
    }
}

