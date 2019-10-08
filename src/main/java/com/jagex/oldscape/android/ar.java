package com.jagex.oldscape.android;

import lx;

class ar implements Runnable {
    static final int au = 2;

    ar(av arg1) {
        av.this = arg1;
        super();
    }

    public void ae() {
        av.this.aj.applyPendingTransactions(av.this.an, av.this.af);
    }

    public void al() {
        av.this.aj.applyPendingTransactions(av.this.an, av.this.af);
    }

    public void ar() {
        av.this.aj.applyPendingTransactions(av.this.an, av.this.af);
    }

    public void ax() {
        av.this.aj.applyPendingTransactions(av.this.an, av.this.af);
    }

    public void run() {
        try {
            av.this.aj.applyPendingTransactions(av.this.an, av.this.af);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/ar.run(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

