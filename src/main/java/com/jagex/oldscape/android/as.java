package com.jagex.oldscape.android;

import aa;
import am;
import com.jagex.mobilesdk.payments.MobilePaymentService$PendingTransactionUpdate;
import lx;

class as implements PendingTransactionUpdate {
    as(av arg1) {
        av.this = arg1;
        super();
    }

    public void ad() {
        av.this.as = new am(true);
        av.this.ak = false;
    }

    public void ae(boolean arg3) {
        av.this.ai = new aa(arg3);
        av.this.av = false;
    }

    public void aj() {
        av.this.as = new am(true);
        av.this.ak = false;
    }

    public void al(boolean arg3) {
        av.this.ai = new aa(arg3);
        av.this.av = false;
    }

    public void an() {
        av.this.as = new am(false);
        av.this.ak = false;
    }

    public void ap() {
        av.this.as = new am(false);
        av.this.ak = false;
    }

    public void applyComplete() {
        try {
            av.this.as = new am(true);
            av.this.ak = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/as.applyComplete(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void applyFailed() {
        try {
            av.this.as = new am(false);
            av.this.ak = false;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/as.applyFailed(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void aq() {
        av.this.as = new am(true);
        av.this.ak = false;
    }

    public void ar(boolean arg3) {
        av.this.ai = new aa(arg3);
        av.this.av = false;
    }

    public void ax(boolean arg3) {
        av.this.ai = new aa(arg3);
        av.this.av = false;
    }

    public void transactionsAvailable(boolean arg3) {
        try {
            av.this.ai = new aa(arg3);
            av.this.av = false;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/as.transactionsAvailable(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

