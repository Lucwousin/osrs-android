final class om implements oq {
    static String[] ar;

    om() {
        super();
    }

    void ab(Long arg3, lq arg4, byte arg5) {
        try {
            arg4.aq(arg3.longValue());
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v4 = new StringBuilder();
            v4.append("om.ab(");
            v4.append(')');
            throw lx.al(((Throwable)v3), v4.toString());
        }
    }

    public Object ad(lq arg3) {
        return Long.valueOf(arg3.bd(2054316725));
    }

    public void ae(Object arg2, lq arg3) {
        this.ab(((Long)arg2), arg3, 0x71);
    }

    void af(Long arg3, lq arg4) {
        arg4.aq(arg3.longValue());
    }

    public Object aj(lq arg3) {
        return Long.valueOf(arg3.bd(0x7AFB06E6));
    }

    public Object al(lq arg2, int arg3) {
        arg3 = 0x26A275F;
        try {
            return Long.valueOf(arg2.bd(arg3));
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("om.al(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void an(Object arg2, lq arg3) {
        this.ab(((Long)arg2), arg3, 57);
    }

    public Object ap(lq arg3) {
        return Long.valueOf(arg3.bd(1372297601));
    }

    public Object aq(lq arg3) {
        return Long.valueOf(arg3.bd(690660535));
    }

    public void ar(Object arg2, lq arg3) {
        this.ab(((Long)arg2), arg3, 87);
    }

    public void ax(Object arg1, lq arg2, byte arg3) {
        try {
            this.ab(((Long)arg1), arg2, 0x40);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("om.ax(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }
}

