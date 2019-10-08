package com.jagex.oldscape.android;

import lx;

class ag implements Runnable {
    ag(av arg1) {
        av.this = arg1;
        super();
    }

    public void ae() {
        av.this.aj.requestShopData(av.this.an, new ap(this));
    }

    public void al() {
        av.this.aj.requestShopData(av.this.an, new ap(this));
    }

    public void ar() {
        av.this.aj.requestShopData(av.this.an, new ap(this));
    }

    public void ax() {
        av.this.aj.requestShopData(av.this.an, new ap(this));
    }

    public void run() {
        try {
            av.this.aj.requestShopData(av.this.an, new ap(this));
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/oldscape/android/ag.run(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

