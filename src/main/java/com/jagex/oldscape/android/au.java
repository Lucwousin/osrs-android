package com.jagex.oldscape.android;

import com.jagex.mobilesdk.payments.MobilePaymentService$ShopItemsManagerUpdate;
import lx;

class au implements ShopItemsManagerUpdate {
    au(ah arg1) {
        this.this$1 = arg1;
        super();
    }

    public void ad() {
        this.this$1.this$0.ac = au.ae;
    }

    public void ae(boolean arg1) {
    }

    public void aj() {
        this.this$1.this$0.ac = au.ae;
    }

    public void al(boolean arg1) {
    }

    public void an() {
        this.this$1.this$0.ac = au.ar;
    }

    public void ap() {
        this.this$1.this$0.ac = au.ae;
    }

    public void ar() {
        this.this$1.this$0.ac = au.ar;
    }

    public void ax(boolean arg1) {
    }

    public void requestComplete() {
        try {
            this.this$1.this$0.ac = au.ae;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/au.requestComplete(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void requestFailed() {
        try {
            this.this$1.this$0.ac = au.ar;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/au.requestFailed(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void shopItemsManagerReady(boolean arg1) {
    }
}

