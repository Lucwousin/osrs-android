package com.jagex.android;

import android.app.NativeActivity;
import android.view.KeyCharacterMap;
import lx;

public class AndroidKeyboard {
    static int ae;
    static KeyCharacterMap al;
    static NativeActivity ax;

    static {
    }

    AndroidKeyboard() throws Throwable {
        try {
            super();
            throw new Error();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/android/AndroidKeyboard.<init>(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static void Hide() {
        try {
            AndroidKeyboard.ax.getSystemService("input_method").hideSoftInputFromWindow(AndroidKeyboard.ax.getWindow().getDecorView().getWindowToken(), 0);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/android/AndroidKeyboard.Hide(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static boolean IsVisible() {
        try {
            return AndroidKeyboard.ax.getSystemService("input_method").isAcceptingText();
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/android/AndroidKeyboard.IsVisible(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }

    public static int KeyCodeToUnicodeCharacter(int arg2, int arg3) {
        try {
            return AndroidKeyboard.KeyCodeToUnicodeCharacter(arg2, arg3, AndroidKeyboard.ae * 0xF617677B);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static int KeyCodeToUnicodeCharacter(int arg2, int arg3, int arg4) {
        try {
            if(AndroidKeyboard.al == null || AndroidKeyboard.ae * 0xF617677B != arg4) {
                AndroidKeyboard.al = KeyCharacterMap.load(arg4);
                AndroidKeyboard.ae = arg4 * 0xC7F45FB3;
            }

            return AndroidKeyboard.al.get(arg2, arg3);
        }
        catch(RuntimeException v2) {
            StringBuilder v3 = new StringBuilder();
            v3.append("com/jagex/android/AndroidKeyboard.KeyCodeToUnicodeCharacter(");
            v3.append(')');
            throw lx.al(((Throwable)v2), v3.toString());
        }
    }

    public static void SetupMainActivity(NativeActivity arg2) {
        try {
            AndroidKeyboard.ax = arg2;
            return;
        }
        catch(RuntimeException v2) {
            StringBuilder v0 = new StringBuilder();
            v0.append("com/jagex/android/AndroidKeyboard.SetupMainActivity(");
            v0.append(')');
            throw lx.al(((Throwable)v2), v0.toString());
        }
    }

    public static void Show() {
        try {
            AndroidKeyboard.ax.getSystemService("input_method").showSoftInput(AndroidKeyboard.ax.getWindow().getDecorView(), 2);
            return;
        }
        catch(RuntimeException v0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("com/jagex/android/AndroidKeyboard.Show(");
            v1.append(')');
            throw lx.al(((Throwable)v0), v1.toString());
        }
    }
}

