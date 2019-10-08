package com.jagex.oldscape.android;

import android.view.View;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import client;
import fd;
import lx;

class ac implements OnApplyWindowInsetsListener {
    ac(ab arg1) {
        ab.this = arg1;
        super();
    }

    public WindowInsetsCompat ae(View arg6, WindowInsetsCompat arg7) {
        DisplayCutoutCompat v6 = arg7.getDisplayCutout();
        if(v6 != null) {
            ab.this.as = new fd(v6.getSafeInsetTop(), v6.getSafeInsetRight(), v6.getSafeInsetBottom(), v6.getSafeInsetLeft());
            client.al.adq(0xA0E55960);
        }

        return arg7;
    }

    public WindowInsetsCompat al(View arg6, WindowInsetsCompat arg7) {
        DisplayCutoutCompat v6 = arg7.getDisplayCutout();
        if(v6 != null) {
            ab.this.as = new fd(v6.getSafeInsetTop(), v6.getSafeInsetRight(), v6.getSafeInsetBottom(), v6.getSafeInsetLeft());
            client.al.adq(0xA0E55960);
        }

        return arg7;
    }

    public WindowInsetsCompat ar(View arg6, WindowInsetsCompat arg7) {
        DisplayCutoutCompat v6 = arg7.getDisplayCutout();
        if(v6 != null) {
            ab.this.as = new fd(v6.getSafeInsetTop(), v6.getSafeInsetRight(), v6.getSafeInsetBottom(), v6.getSafeInsetLeft());
            client.al.adq(0xA0E55960);
        }

        return arg7;
    }

    public WindowInsetsCompat ax(View arg6, WindowInsetsCompat arg7) {
        DisplayCutoutCompat v6 = arg7.getDisplayCutout();
        if(v6 != null) {
            ab.this.as = new fd(v6.getSafeInsetTop(), v6.getSafeInsetRight(), v6.getSafeInsetBottom(), v6.getSafeInsetLeft());
            client.al.adq(0xA0E55960);
        }

        return arg7;
    }

    public WindowInsetsCompat onApplyWindowInsets(View arg6, WindowInsetsCompat arg7) {
        try {
            DisplayCutoutCompat v6_1 = arg7.getDisplayCutout();
            if(v6_1 != null) {
                ab.this.as = new fd(v6_1.getSafeInsetTop(), v6_1.getSafeInsetRight(), v6_1.getSafeInsetBottom(), v6_1.getSafeInsetLeft());
                client.al.adq(0xA0E55960);
            }
        }
        catch(RuntimeException v6) {
            StringBuilder v7 = new StringBuilder();
            v7.append("com/jagex/oldscape/android/ac.onApplyWindowInsets(");
            v7.append(')');
            throw lx.al(((Throwable)v6), v7.toString());
        }

        return arg7;
    }
}

