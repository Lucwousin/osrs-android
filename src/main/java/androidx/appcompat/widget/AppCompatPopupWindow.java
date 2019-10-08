package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.R$styleable;
import androidx.core.widget.PopupWindowCompat;

class AppCompatPopupWindow extends PopupWindow {
    private static final boolean COMPAT_OVERLAP_ANCHOR;
    private boolean mOverlapAnchor;

    static {
        boolean v0 = Build$VERSION.SDK_INT < 21 ? true : false;
        AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR = v0;
    }

    public AppCompatPopupWindow(@NonNull Context arg2, @Nullable AttributeSet arg3, @AttrRes int arg4) {
        super(arg2, arg3, arg4);
        this.init(arg2, arg3, arg4, 0);
    }

    public AppCompatPopupWindow(@NonNull Context arg1, @Nullable AttributeSet arg2, @AttrRes int arg3, @StyleRes int arg4) {
        super(arg1, arg2, arg3, arg4);
        this.init(arg1, arg2, arg3, arg4);
    }

    private void init(Context arg2, AttributeSet arg3, int arg4, int arg5) {
        TintTypedArray v2 = TintTypedArray.obtainStyledAttributes(arg2, arg3, R$styleable.PopupWindow, arg4, arg5);
        if(v2.hasValue(R$styleable.PopupWindow_overlapAnchor)) {
            this.setSupportOverlapAnchor(v2.getBoolean(R$styleable.PopupWindow_overlapAnchor, false));
        }

        this.setBackgroundDrawable(v2.getDrawable(R$styleable.PopupWindow_android_popupBackground));
        v2.recycle();
    }

    private void setSupportOverlapAnchor(boolean arg2) {
        if(AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR) {
            this.mOverlapAnchor = arg2;
        }
        else {
            PopupWindowCompat.setOverlapAnchor(((PopupWindow)this), arg2);
        }
    }

    public void showAsDropDown(View arg2, int arg3, int arg4) {
        if((AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR) && (this.mOverlapAnchor)) {
            arg4 -= arg2.getHeight();
        }

        super.showAsDropDown(arg2, arg3, arg4);
    }

    public void showAsDropDown(View arg2, int arg3, int arg4, int arg5) {
        if((AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR) && (this.mOverlapAnchor)) {
            arg4 -= arg2.getHeight();
        }

        super.showAsDropDown(arg2, arg3, arg4, arg5);
    }

    public void update(View arg7, int arg8, int arg9, int arg10, int arg11) {
        if((AppCompatPopupWindow.COMPAT_OVERLAP_ANCHOR) && (this.mOverlapAnchor)) {
            arg9 -= arg7.getHeight();
        }

        super.update(arg7, arg8, arg9, arg10, arg11);
    }
}

