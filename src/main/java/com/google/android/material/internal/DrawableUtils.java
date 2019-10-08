package com.google.android.material.internal;

import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.DrawableContainer$DrawableContainerState;
import android.graphics.drawable.DrawableContainer;
import android.util.Log;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Method;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class DrawableUtils {
    private static final String LOG_TAG = "DrawableUtils";
    private static Method setConstantStateMethod;
    private static boolean setConstantStateMethodFetched;

    private DrawableUtils() {
        super();
    }

    public static boolean setContainerConstantState(DrawableContainer arg0, Drawable$ConstantState arg1) {
        return DrawableUtils.setContainerConstantStateV9(arg0, arg1);
    }

    private static boolean setContainerConstantStateV9(DrawableContainer arg6, Drawable$ConstantState arg7) {
        if(!DrawableUtils.setConstantStateMethodFetched) {
            try {
                DrawableUtils.setConstantStateMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", DrawableContainer$DrawableContainerState.class);
                DrawableUtils.setConstantStateMethod.setAccessible(true);
            }
            catch(NoSuchMethodException ) {
                Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
            }

            DrawableUtils.setConstantStateMethodFetched = true;
        }

        if(DrawableUtils.setConstantStateMethod != null) {
            try {
                DrawableUtils.setConstantStateMethod.invoke(arg6, arg7);
                return 1;
            }
            catch(Exception ) {
                Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
            }
        }

        return 0;
    }
}

