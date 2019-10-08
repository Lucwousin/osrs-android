package com.jagex.mobilesdk.auth;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

public class JagexCompatActivity extends AppCompatActivity {
    public static final String EXTRA_ERROR_MESSAGE;
    public static final String EXTRA_EXCEPTION_CLASS;
    public static final String EXTRA_EXCEPTION_MESSAGE;
    private static final String PACKAGE_NAME;

    static {
        JagexCompatActivity.PACKAGE_NAME = JagexCompatActivity.class.getPackage().getName();
        JagexCompatActivity.EXTRA_ERROR_MESSAGE = JagexCompatActivity.PACKAGE_NAME + ".ERROR_MESSAGE";
        JagexCompatActivity.EXTRA_EXCEPTION_CLASS = JagexCompatActivity.PACKAGE_NAME + ".EXCEPTION_CLASS";
        JagexCompatActivity.EXTRA_EXCEPTION_MESSAGE = JagexCompatActivity.PACKAGE_NAME + ".EXCEPTION_MESSAGE";
    }

    public JagexCompatActivity() {
        super();
    }

    protected void finish(int arg2) {
        this.finish(arg2, null);
    }

    protected void finish(int arg1, Intent arg2) {
        this.setResult(arg1, arg2);
        this.finish();
    }

    protected void finishWithError(int arg4, String arg5, Exception arg6) {
        Intent v0 = new Intent();
        String v1 = "";
        String v2 = "";
        if(arg6 != null) {
            v1 = arg6.getClass().toString();
            v2 = arg6.getMessage();
        }

        if(v2 == null) {
            v2 = "";
        }

        if(arg5 == null) {
            arg5 = "";
        }

        v0.putExtra(JagexCompatActivity.EXTRA_EXCEPTION_CLASS, v1).putExtra(JagexCompatActivity.EXTRA_EXCEPTION_MESSAGE, v2).putExtra(JagexCompatActivity.EXTRA_ERROR_MESSAGE, arg5);
        this.finish(arg4, v0);
    }
}

