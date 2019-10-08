package com.google.android.material.ripple;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build$VERSION;
import android.util.StateSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class RippleUtils {
    private static final int[] FOCUSED_STATE_SET;
    private static final int[] HOVERED_FOCUSED_STATE_SET;
    private static final int[] HOVERED_STATE_SET;
    private static final int[] PRESSED_STATE_SET;
    private static final int[] SELECTED_FOCUSED_STATE_SET;
    private static final int[] SELECTED_HOVERED_FOCUSED_STATE_SET;
    private static final int[] SELECTED_HOVERED_STATE_SET;
    private static final int[] SELECTED_PRESSED_STATE_SET;
    private static final int[] SELECTED_STATE_SET;
    public static final boolean USE_FRAMEWORK_RIPPLE;

    static {
        boolean v0 = Build$VERSION.SDK_INT >= 21 ? true : false;
        RippleUtils.USE_FRAMEWORK_RIPPLE = v0;
        RippleUtils.PRESSED_STATE_SET = new int[]{0x10100A7};
        RippleUtils.HOVERED_FOCUSED_STATE_SET = new int[]{0x1010367, 0x101009C};
        RippleUtils.FOCUSED_STATE_SET = new int[]{0x101009C};
        RippleUtils.HOVERED_STATE_SET = new int[]{0x1010367};
        RippleUtils.SELECTED_PRESSED_STATE_SET = new int[]{0x10100A1, 0x10100A7};
        RippleUtils.SELECTED_HOVERED_FOCUSED_STATE_SET = new int[]{0x10100A1, 0x1010367, 0x101009C};
        RippleUtils.SELECTED_FOCUSED_STATE_SET = new int[]{0x10100A1, 0x101009C};
        RippleUtils.SELECTED_HOVERED_STATE_SET = new int[]{0x10100A1, 0x1010367};
        RippleUtils.SELECTED_STATE_SET = new int[]{0x10100A1};
    }

    private RippleUtils() {
        super();
    }

    @NonNull public static ColorStateList convertToRippleDrawableColor(@Nullable ColorStateList arg6) {
        int v2 = 2;
        if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
            int[][] v0 = new int[v2][];
            int[] v2_1 = new int[v2];
            v0[0] = RippleUtils.SELECTED_STATE_SET;
            v2_1[0] = RippleUtils.getColorForState(arg6, RippleUtils.SELECTED_PRESSED_STATE_SET);
            v0[1] = StateSet.NOTHING;
            v2_1[1] = RippleUtils.getColorForState(arg6, RippleUtils.PRESSED_STATE_SET);
            return new ColorStateList(v0, v2_1);
        }

        int[][] v4 = new int[10][];
        int[] v0_1 = new int[10];
        v4[0] = RippleUtils.SELECTED_PRESSED_STATE_SET;
        v0_1[0] = RippleUtils.getColorForState(arg6, RippleUtils.SELECTED_PRESSED_STATE_SET);
        v4[1] = RippleUtils.SELECTED_HOVERED_FOCUSED_STATE_SET;
        v0_1[1] = RippleUtils.getColorForState(arg6, RippleUtils.SELECTED_HOVERED_FOCUSED_STATE_SET);
        v4[v2] = RippleUtils.SELECTED_FOCUSED_STATE_SET;
        v0_1[v2] = RippleUtils.getColorForState(arg6, RippleUtils.SELECTED_FOCUSED_STATE_SET);
        v4[3] = RippleUtils.SELECTED_HOVERED_STATE_SET;
        v0_1[3] = RippleUtils.getColorForState(arg6, RippleUtils.SELECTED_HOVERED_STATE_SET);
        v4[4] = RippleUtils.SELECTED_STATE_SET;
        v0_1[4] = 0;
        v4[5] = RippleUtils.PRESSED_STATE_SET;
        v0_1[5] = RippleUtils.getColorForState(arg6, RippleUtils.PRESSED_STATE_SET);
        v4[6] = RippleUtils.HOVERED_FOCUSED_STATE_SET;
        v0_1[6] = RippleUtils.getColorForState(arg6, RippleUtils.HOVERED_FOCUSED_STATE_SET);
        v4[7] = RippleUtils.FOCUSED_STATE_SET;
        v0_1[7] = RippleUtils.getColorForState(arg6, RippleUtils.FOCUSED_STATE_SET);
        v4[8] = RippleUtils.HOVERED_STATE_SET;
        v0_1[8] = RippleUtils.getColorForState(arg6, RippleUtils.HOVERED_STATE_SET);
        v4[9] = StateSet.NOTHING;
        v0_1[9] = 0;
        return new ColorStateList(v4, v0_1);
    }

    @TargetApi(value=21) @ColorInt private static int doubleAlpha(@ColorInt int arg2) {
        return ColorUtils.setAlphaComponent(arg2, Math.min(Color.alpha(arg2) * 2, 0xFF));
    }

    @ColorInt private static int getColorForState(@Nullable ColorStateList arg1, int[] arg2) {
        int v1 = arg1 != null ? arg1.getColorForState(arg2, arg1.getDefaultColor()) : 0;
        if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
            v1 = RippleUtils.doubleAlpha(v1);
        }

        return v1;
    }
}

