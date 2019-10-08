package com.jagex.oldscape.android;

import android.app.Activity;
import android.os.Build$VERSION;
import android.text.Editable;
import android.text.InputFilter$LengthFilter;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View$OnFocusChangeListener;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout$LayoutParams;
import android.widget.TextView$OnEditorActionListener;
import android.widget.TextView;
import com.jagex.jagex3.client.input.softkeyboard.al;
import com.jagex.jagex3.client.input.softkeyboard.ax;
import lx;

public class ba extends al implements TextWatcher, View$OnFocusChangeListener, TextView$OnEditorActionListener {
    final Activity ae;
    static final FrameLayout$LayoutParams al = null;
    final EditText an;
    final ax ar;
    static final String ax = "ProgrammaticEdit";

    static {
        ba.al = new FrameLayout$LayoutParams(-2, -2);
    }

    ba(Activity arg2, ax arg3, int arg4, int arg5) {
        try {
            super();
            this.ae = arg2;
            this.ar = arg3;
            this.an = this.af(22);
            arg2.addContentView(this.an, ba.al);
            this.an.addTextChangedListener(((TextWatcher)this));
            this.an.setInputType(arg4);
            this.an.setImeOptions(0x10000000 | arg5);
            this.an.setOnEditorActionListener(((TextView$OnEditorActionListener)this));
            this.an.setOnFocusChangeListener(((View$OnFocusChangeListener)this));
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ba.<init>(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    void aa() {
        if(Build$VERSION.SDK_INT >= 26) {
            this.an.setAutofillHints(new String[]{"username"});
        }
    }

    public void ab(int arg4, int arg5) {
        try {
            this.an.setFilters(new InputFilter[]{new InputFilter$LengthFilter(arg4)});
            return;
        }
        catch(RuntimeException v4) {
            StringBuilder v5 = new StringBuilder();
            v5.append("com/jagex/oldscape/android/ba.ab(");
            v5.append(')');
            throw lx.al(((Throwable)v4), v5.toString());
        }
    }

    public void ac() {
        this.an.setTag("ProgrammaticEdit");
        this.an.setFilters(new InputFilter[0]);
        this.an.setText("");
        this.an.setTag(null);
    }

    public void ad(byte arg3) {
        try {
            this.an.setTag("ProgrammaticEdit");
            this.an.setFilters(new InputFilter[0]);
            this.an.setText("");
            this.an.setTag(null);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ba.ad(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ae(int arg3) {
        try {
            if(Build$VERSION.SDK_INT >= 26) {
                this.an.setAutofillHints(new String[]{"username"});
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ba.ae(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    EditText af(byte arg3) {
        try {
            return new an(this, this.ae);
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ba.af(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void afterTextChanged(Editable arg4) {
        try {
            if(!"ProgrammaticEdit".equals(this.an.getTag())) {
                this.ar.aj(this.aj, arg4.toString(), 0x984A59B0);
                this.an.setSelection(this.an.getText().length());
            }
        }
        catch(RuntimeException v4) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ba.afterTextChanged(");
            v0.append(')');
            throw lx.al(((Throwable)v4), v0.toString());
        }
    }

    public void ag(String arg3) {
        this.an.setTag("ProgrammaticEdit");
        this.an.setText(((CharSequence)arg3));
        this.an.setSelection(this.an.getText().length());
        this.an.setTag(null);
    }

    public void ah(String arg3) {
        this.an.setTag("ProgrammaticEdit");
        this.an.setText(((CharSequence)arg3));
        this.an.setSelection(this.an.getText().length());
        this.an.setTag(null);
    }

    void ai() {
        if(Build$VERSION.SDK_INT >= 26) {
            this.an.setAutofillHints(new String[]{"username"});
        }
    }

    public void aj(int arg3) {
        try {
            this.an.bringToFront();
            this.an.requestFocus();
            this.ae.getSystemService("input_method").showSoftInput(this.an, 0);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ba.aj(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void ak() {
        this.an.setTag("ProgrammaticEdit");
        this.an.setFilters(new InputFilter[0]);
        this.an.setText("");
        this.an.setTag(null);
    }

    public void al(View arg2, boolean arg3) {
        if(arg3) {
            this.ar.ab(this.ap * 0xBEB30C77, 11);
        }
    }

    void am() {
        if(Build$VERSION.SDK_INT >= 26) {
            this.an.setAutofillHints(new String[]{"password"});
        }
    }

    public void an(String arg2, int arg3) {
        try {
            this.an.setTag("ProgrammaticEdit");
            this.an.setText(((CharSequence)arg2));
            this.an.setSelection(this.an.getText().length());
            this.an.setTag(null);
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/oldscape/android/ba.an(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public void ao() {
        this.an.bringToFront();
        this.an.requestFocus();
        this.ae.getSystemService("input_method").showSoftInput(this.an, 0);
    }

    public boolean ap(int arg3) {
        try {
            return this.an.hasFocus();
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ba.ap(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void aq(short arg3) {
        try {
            this.an.clearFocus();
            this.an.getParent().removeView(this.an);
            return;
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ba.aq(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    void ar(int arg3) {
        try {
            if(Build$VERSION.SDK_INT >= 26) {
                this.an.setAutofillHints(new String[]{"password"});
            }
        }
        catch(RuntimeException v3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/oldscape/android/ba.ar(");
            v0.append(')');
            throw lx.al(((Throwable)v3), v0.toString());
        }
    }

    public void as() {
        this.an.bringToFront();
        this.an.requestFocus();
        this.ae.getSystemService("input_method").showSoftInput(this.an, 0);
    }

    public void at(String arg3) {
        this.an.setTag("ProgrammaticEdit");
        this.an.setText(((CharSequence)arg3));
        this.an.setSelection(this.an.getText().length());
        this.an.setTag(null);
    }

    void au() {
        if(Build$VERSION.SDK_INT >= 26) {
            this.an.setAutofillHints(new String[]{"password"});
        }
    }

    void av() {
        if(Build$VERSION.SDK_INT >= 26) {
            this.an.setAutofillHints(new String[]{"username"});
        }
    }

    public boolean aw() {
        return this.an.hasFocus();
    }

    public void ax(View arg2, boolean arg3) {
        if(arg3) {
            this.ar.ab(this.ap * 0xBEB30C77, 29);
        }
    }

    public boolean ay() {
        return this.an.hasFocus();
    }

    public void az(String arg3) {
        this.an.setTag("ProgrammaticEdit");
        this.an.setText(((CharSequence)arg3));
        this.an.setSelection(this.an.getText().length());
        this.an.setTag(null);
    }

    public void ba() {
        this.an.clearFocus();
        this.an.getParent().removeView(this.an);
    }

    public boolean bb(TextView arg1, int arg2, KeyEvent arg3) {
        if(5 == arg2) {
            this.ar.ad(-30);
            return 1;
        }

        if(6 == arg2) {
            this.ar.aq(0x7B);
            return 1;
        }

        return 0;
    }

    public boolean bc(TextView arg1, int arg2, KeyEvent arg3) {
        if(5 == arg2) {
            this.ar.ad(-98);
            return 1;
        }

        if(6 == arg2) {
            this.ar.aq(106);
            return 1;
        }

        return 0;
    }

    public void bd() {
        this.an.setTag("ProgrammaticEdit");
        this.an.setFilters(new InputFilter[0]);
        this.an.setText("");
        this.an.setTag(null);
    }

    public void beforeTextChanged(CharSequence arg1, int arg2, int arg3, int arg4) {
        try {
            this.aj = arg1.toString();
            this.ar.ab(this.ap * 0xBEB30C77, -19);
            return;
        }
        catch(RuntimeException v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append("com/jagex/oldscape/android/ba.beforeTextChanged(");
            v2.append(')');
            throw lx.al(((Throwable)v1), v2.toString());
        }
    }

    public void bf(int arg4) {
        this.an.setFilters(new InputFilter[]{new InputFilter$LengthFilter(arg4)});
    }

    public boolean bg(TextView arg1, int arg2, KeyEvent arg3) {
        if(5 == arg2) {
            this.ar.ad(-77);
            return 1;
        }

        if(6 == arg2) {
            this.ar.aq(110);
            return 1;
        }

        return 0;
    }

    public boolean bh(TextView arg1, int arg2, KeyEvent arg3) {
        if(5 == arg2) {
            this.ar.ad(-25);
            return 1;
        }

        if(6 == arg2) {
            this.ar.aq(107);
            return 1;
        }

        return 0;
    }

    EditText bj() {
        return new an(this, this.ae);
    }

    EditText bk() {
        return new an(this, this.ae);
    }

    EditText bm() {
        return new an(this, this.ae);
    }

    public void bn(int arg4) {
        this.an.setFilters(new InputFilter[]{new InputFilter$LengthFilter(arg4)});
    }

    public void bo(CharSequence arg1, int arg2, int arg3, int arg4) {
        this.aj = arg1.toString();
        this.ar.ab(this.ap * 0xBEB30C77, 20);
    }

    public void bp(CharSequence arg1, int arg2, int arg3, int arg4) {
        this.aj = arg1.toString();
        this.ar.ab(this.ap * 0xBEB30C77, 30);
    }

    public void bq(CharSequence arg1, int arg2, int arg3, int arg4) {
    }

    public void bt(CharSequence arg1, int arg2, int arg3, int arg4) {
    }

    public void bv(CharSequence arg1, int arg2, int arg3, int arg4) {
    }

    public void bw(CharSequence arg1, int arg2, int arg3, int arg4) {
        this.aj = arg1.toString();
        this.ar.ab(this.ap * 0xBEB30C77, -29);
    }

    public void bx(Editable arg4) {
        if(!"ProgrammaticEdit".equals(this.an.getTag())) {
            this.ar.aj(this.aj, arg4.toString(), 0xA6F4630E);
            this.an.setSelection(this.an.getText().length());
        }
    }

    public void by(CharSequence arg1, int arg2, int arg3, int arg4) {
        this.aj = arg1.toString();
        this.ar.ab(this.ap * 0xBEB30C77, -85);
    }

    public boolean bz(TextView arg1, int arg2, KeyEvent arg3) {
        if(5 == arg2) {
            this.ar.ad(110);
            return 1;
        }

        if(6 == arg2) {
            this.ar.aq(0x7E);
            return 1;
        }

        return 0;
    }

    public boolean onEditorAction(TextView arg1, int arg2, KeyEvent arg3) {
        if(5 != arg2) {
            goto label_9;
        }

        try {
            this.ar.ad(-9);
            return 1;
        label_9:
            if(6 != arg2) {
                return 0;
            }

            this.ar.aq(0x7C);
            return 1;
        label_8:
        }
        catch(RuntimeException v1) {
            goto label_8;
        }

        StringBuilder v2 = new StringBuilder();
        v2.append("com/jagex/oldscape/android/ba.onEditorAction(");
        v2.append(')');
        throw lx.al(((Throwable)v1), v2.toString());
        return 0;
    }

    public void onFocusChange(View arg2, boolean arg3) {
        if(arg3) {
            try {
                this.ar.ab(this.ap * 0xBEB30C77, 102);
            }
            catch(RuntimeException v2) {
                StringBuilder v3 = new StringBuilder();
                v3.append("com/jagex/oldscape/android/ba.onFocusChange(");
                v3.append(')');
                throw lx.al(((Throwable)v2), v3.toString());
            }
        }
    }

    public void onTextChanged(CharSequence arg1, int arg2, int arg3, int arg4) {
    }
}

