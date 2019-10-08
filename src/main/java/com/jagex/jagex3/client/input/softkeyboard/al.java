package com.jagex.jagex3.client.input.softkeyboard;

import lx;

public abstract class al {
    public String aj;
    public int ap;

    public al() {
        try {
            super();
            this.ap = 0xBA2972B9;
            this.aj = "";
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/jagex3/client/input/softkeyboard/al.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public abstract void ab(int arg1, int arg2);

    public abstract void ac();

    public abstract void ad(byte arg1);

    public abstract void ag(String arg1);

    public abstract void ah(String arg1);

    public abstract void aj(int arg1);

    public abstract void ak();

    public abstract void an(String arg1, int arg2);

    public abstract void ao();

    public abstract boolean ap(int arg1);

    public abstract void aq(short arg1);

    public abstract void as();

    public abstract void at(String arg1);

    public abstract boolean aw();

    public abstract boolean ay();

    public abstract void az(String arg1);

    public abstract void ba();

    public abstract void bd();

    final void be(int arg2) {
        this.ap = arg2 * 0x45D68D47;
    }

    public abstract void bf(int arg1);

    final void bl(int arg2) {
        this.ap = arg2 * 0x45D68D47;
    }

    public abstract void bn(int arg1);

    final void br(int arg2) {
        this.ap = arg2 * 0xA47C6265;
    }

    final void bs(int arg2) {
        this.ap = arg2 * 0x45D68D47;
    }

    final void bu(int arg2, int arg3) {
        arg2 *= 0x45D68D47;
        try {
            this.ap = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/jagex3/client/input/softkeyboard/al.bu(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }
}

