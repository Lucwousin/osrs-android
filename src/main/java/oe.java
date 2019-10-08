import java.util.Collection;

public class oe {
    public static final long ax = 94608000;

    oe() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("oe.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void ap(Collection arg1, int arg2) {
        try {
            arg1.add(dg.ae);
            arg1.add(dg.ar);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("oe.ap(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }
}

