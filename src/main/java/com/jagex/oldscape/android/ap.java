package com.jagex.oldscape.android;

import au;
import com.jagex.mobilesdk.payments.MobilePaymentService$ShopItemsManagerUpdate;
import lx;

class ap implements ShopItemsManagerUpdate {
    ap(ag arg1) {
        this.this$1 = arg1;
        super();
    }

    public void ad() {
        this.this$1.this$0.bd = au.ae;
    }

    public void ae(boolean arg2) {
        this.this$1.this$0.bd = au.al;
    }

    public void aj() {
        this.this$1.this$0.bd = au.ae;
    }

    public void al(boolean arg2) {
        this.this$1.this$0.bd = au.al;
    }

    public void an() {
        this.this$1.this$0.bd = au.ar;
    }

    public void ap() {
        this.this$1.this$0.bd = au.ae;
    }

    public void ar() {
        this.this$1.this$0.bd = au.ar;
    }

    public void ax(boolean arg2) {
        this.this$1.this$0.bd = au.al;
    }

    public void requestComplete() {
        try {
            this.this$1.this$0.bd = au.ae;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/ap.requestComplete(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void requestFailed() {
        try {
            this.this$1.this$0.bd = au.ar;
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/ap.requestFailed(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public void shopItemsManagerReady(boolean arg3) {
        try {
            this.this$1.this$0.bd = au.al;
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ap.shopItemsManagerReady(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

