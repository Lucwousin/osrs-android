package com.jagex.oldscape.android;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import lx;

class aa extends InputConnectionWrapper {
    aa(an arg1, InputConnection arg2, boolean arg3) {
        this.this$1 = arg1;
        super(arg2, arg3);
    }

    public boolean ax(KeyEvent arg5) {
        boolean v1 = false;
        if(arg5.getKeyCode() == 67) {
            if(arg5.getAction() == 1) {
                this.deleteSurroundingText(1, 0);
            }

            return 1;
        }

        if(arg5.getAction() == 0) {
            if((this.this$1.this$0.an.dispatchKeyEvent(arg5)) || (super.sendKeyEvent(arg5))) {
                v1 = true;
            }

            return v1;
        }

        return 1;
    }

    public boolean sendKeyEvent(KeyEvent arg5) {
        try {
            boolean v2 = false;
            if(arg5.getKeyCode() == 67) {
                if(arg5.getAction() == 1) {
                    this.deleteSurroundingText(1, 0);
                }

                return 1;
            }

            if(arg5.getAction() != 0) {
                return 1;
            }

            if(this.this$1.this$0.an.dispatchKeyEvent(arg5)) {
            }
            else if(!super.sendKeyEvent(arg5)) {
                return v2;
            }
        }
        catch(RuntimeException v5) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/aa.sendKeyEvent(");
            v0.append(')');
            throw lx.al(((Throwable)v5), v0.toString());
        }

        return true;
    }
}

