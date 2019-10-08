public class mk extends ld {
    mk() {
        try {
            super();
            System.nanoTime();
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("mk.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void al(int arg3) {
        try {
            System.nanoTime();
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("mk.al(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void an() {
        System.nanoTime();
    }

    public void ap() {
        System.nanoTime();
    }
}

