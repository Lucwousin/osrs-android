package com.jagex.oldscape.android;

import android.content.Context;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import lx;

class an extends EditText {
    an(ba arg1, Context arg2) {
        ba.this = arg1;
        super(arg2);
    }

    public boolean ae() {
        return 1;
    }

    public boolean al() {
        return 1;
    }

    public boolean ar() {
        return 1;
    }

    public InputConnection ax(EditorInfo arg3) {
        return new aa(this, super.onCreateInputConnection(arg3), true);
    }

    public boolean onCheckIsTextEditor() {
        return 1;
    }

    public InputConnection onCreateInputConnection(EditorInfo arg3) {
        try {
            return new aa(this, super.onCreateInputConnection(arg3), true);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/an.onCreateInputConnection(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }
}

