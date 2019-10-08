package com.jagex.jagex3.client.input.softkeyboard;

import lx;

class ap implements Runnable {
    ap(ar arg1, int arg2) {
        ar.this = arg1;
        this.val$type = arg2;
        super();
    }

    public void ae() {
        switch(this.val$type) {
            case 0: {
                ar.this.ax(-33);
                break;
            }
            case 1: {
                ar.this.al(0xE86812B1);
                break;
            }
            case 2: {
                ar.this.ae(0xE0FED0A8);
                break;
            }
            case 3: {
                ar.this.ar(658062877);
                break;
            }
            default: {
                break;
            }
        }
    }

    public void al() {
        switch(this.val$type) {
            case 0: {
                ar.this.ax(-90);
                break;
            }
            case 1: {
                ar.this.al(0x95080D00);
                break;
            }
            case 2: {
                ar.this.ae(0x4DF9EBC6);
                break;
            }
            case 3: {
                ar.this.ar(0xDAA53FC1);
                break;
            }
            default: {
                break;
            }
        }
    }

    public void ar() {
        switch(this.val$type) {
            case 0: {
                ar.this.ax(-107);
                break;
            }
            case 1: {
                ar.this.al(0x6BF91F4E);
                break;
            }
            case 2: {
                ar.this.ae(0x17C6F149);
                break;
            }
            case 3: {
                ar.this.ar(-1111846190);
                break;
            }
            default: {
                break;
            }
        }
    }

    public void ax() {
        switch(this.val$type) {
            case 0: {
                ar.this.ax(-33);
                break;
            }
            case 1: {
                ar.this.al(0xD1ACB040);
                break;
            }
            case 2: {
                ar.this.ae(0x6C233D06);
                break;
            }
            case 3: {
                ar.this.ar(0x1F8D2D8D);
                break;
            }
            default: {
                break;
            }
        }
    }

    public void run() {
        try {
            switch(this.val$type) {
                case 0: {
                    ar.this.ax(-21);
                    return;
                    StringBuilder v1 = new StringBuilder();
                    v1.append("com/jagex/jagex3/client/input/softkeyboard/ap.run(");
                    v1.append(')');
                    throw lx.al(((Throwable)v0), v1.toString());
                }
                case 1: {
                    ar.this.al(0x9F4904BC);
                    return;
                }
                case 2: {
                    ar.this.ae(0x392BCA9B);
                    return;
                }
                case 3: {
                    ar.this.ar(0xAD3E5FA7);
                    return;
                }
                default: {
                    return;
                }
            }
        }
        catch(RuntimeException v0) {
        }
    }
}

