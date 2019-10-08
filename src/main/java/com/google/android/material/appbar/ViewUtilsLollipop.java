package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.google.android.material.internal.ThemeEnforcement;

@RequiresApi(value=21) class ViewUtilsLollipop {
    private static final int[] STATE_LIST_ANIM_ATTRS;

    static {
        ViewUtilsLollipop.STATE_LIST_ANIM_ATTRS = new int[]{0x1010448};
    }

    ViewUtilsLollipop() {
        super();
    }

    static void setBoundsViewOutlineProvider(View arg1) {
        arg1.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void setDefaultAppBarLayoutStateListAnimator(View arg11, float arg12) {
        int v0 = arg11.getResources().getInteger(R$integer.app_bar_elevation_anim_duration);
        StateListAnimator v1 = new StateListAnimator();
        long v9 = ((long)v0);
        v1.addState(new int[]{0x101000E, R$attr.state_liftable, -R$attr.state_lifted}, ObjectAnimator.ofFloat(arg11, "elevation", new float[]{0f}).setDuration(v9));
        v1.addState(new int[]{0x101000E}, ObjectAnimator.ofFloat(arg11, "elevation", new float[]{arg12}).setDuration(v9));
        v1.addState(new int[0], ObjectAnimator.ofFloat(arg11, "elevation", new float[]{0f}).setDuration(0));
        arg11.setStateListAnimator(v1);
    }

    static void setStateListAnimatorFromAttrs(View arg8, AttributeSet arg9, int arg10, int arg11) {
        Context v6 = arg8.getContext();
        TypedArray v9 = ThemeEnforcement.obtainStyledAttributes(v6, arg9, ViewUtilsLollipop.STATE_LIST_ANIM_ATTRS, arg10, arg11, new int[0]);
        try {
            if(v9.hasValue(0)) {
                arg8.setStateListAnimator(AnimatorInflater.loadStateListAnimator(v6, v9.getResourceId(0, 0)));
            }
        }
        catch(Throwable v8) {
            v9.recycle();
            throw v8;
        }

        v9.recycle();
    }
}

