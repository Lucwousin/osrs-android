package com.jagex.oldscape.android;

import lx;

class ah implements Runnable {
    static final int aa = 1;
    static final String ax = "oldschool";

    ah(av arg1, String arg2) {
        av.this = arg1;
        this.val$purchaseID = arg2;
        super();
    }

    public void ae() {
        av.this.aj.purchaseShopItem(av.this.an, this.val$purchaseID, new au(this));
    }

    public void al() {
        av.this.aj.purchaseShopItem(av.this.an, this.val$purchaseID, new au(this));
    }

    public void ar() {
        av.this.aj.purchaseShopItem(av.this.an, this.val$purchaseID, new au(this));
    }

    public void ax() {
        av.this.aj.purchaseShopItem(av.this.an, this.val$purchaseID, new au(this));
    }

    public void run() {
        try {
            av.this.aj.purchaseShopItem(av.this.an, this.val$purchaseID, new au(this));
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/ah.run(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

