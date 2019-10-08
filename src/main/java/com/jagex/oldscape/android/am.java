package com.jagex.oldscape.android;

import lx;

class am implements Runnable {
    am(av arg1) {
        av.this = arg1;
        super();
    }

    public void ae() {
        av.this.aj.checkForPendingTransactions(av.this.an, av.this.af);
    }

    public void al() {
        av.this.aj.checkForPendingTransactions(av.this.an, av.this.af);
    }

    public void ar() {
        av.this.aj.checkForPendingTransactions(av.this.an, av.this.af);
    }

    public void ax() {
        av.this.aj.checkForPendingTransactions(av.this.an, av.this.af);
    }

    public void run() {
        try {
            av.this.aj.checkForPendingTransactions(av.this.an, av.this.af);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/am.run(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

