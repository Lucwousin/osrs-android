package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

@RequiresApi(value=21) class WrappedDrawableApi21 extends WrappedDrawableApi14 {
    class DrawableWrapperStateLollipop extends DrawableWrapperState {
        DrawableWrapperStateLollipop(@Nullable DrawableWrapperState arg1, @Nullable Resources arg2) {
            super(arg1, arg2);
        }

        @NonNull public Drawable newDrawable(@Nullable Resources arg2) {
            return new WrappedDrawableApi21(((DrawableWrapperState)this), arg2);
        }
    }

    private static final String TAG = "WrappedDrawableApi21";
    private static Method sIsProjectedDrawableMethod;

    WrappedDrawableApi21(Drawable arg1) {
        super(arg1);
        this.findAndCacheIsProjectedDrawableMethod();
    }

    WrappedDrawableApi21(DrawableWrapperState arg1, Resources arg2) {
        super(arg1, arg2);
        this.findAndCacheIsProjectedDrawableMethod();
    }

    private void findAndCacheIsProjectedDrawableMethod() {
        if(WrappedDrawableApi21.sIsProjectedDrawableMethod == null) {
            try {
                WrappedDrawableApi21.sIsProjectedDrawableMethod = Drawable.class.getDeclaredMethod("isProjected");
            }
            catch(Exception v0) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", ((Throwable)v0));
            }
        }
    }

    @NonNull public Rect getDirtyBounds() {
        return this.mDrawable.getDirtyBounds();
    }

    public void getOutline(@NonNull Outline arg2) {
        this.mDrawable.getOutline(arg2);
    }

    protected boolean isCompatTintEnabled() {
        boolean v1 = false;
        if(Build$VERSION.SDK_INT == 21) {
            Drawable v0 = this.mDrawable;
            if(((v0 instanceof GradientDrawable)) || ((v0 instanceof DrawableContainer)) || ((v0 instanceof InsetDrawable)) || ((v0 instanceof RippleDrawable))) {
                v1 = true;
            }

            return v1;
        }

        return 0;
    }

    public boolean isProjected() {
        if(this.mDrawable != null && WrappedDrawableApi21.sIsProjectedDrawableMethod != null) {
            try {
                return WrappedDrawableApi21.sIsProjectedDrawableMethod.invoke(this.mDrawable).booleanValue();
            }
            catch(Exception v0) {
                Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", ((Throwable)v0));
            }
        }

        return 0;
    }

    @NonNull DrawableWrapperState mutateConstantState() {
        return new DrawableWrapperStateLollipop(this.mState, null);
    }

    public void setHotspot(float arg2, float arg3) {
        this.mDrawable.setHotspot(arg2, arg3);
    }

    public void setHotspotBounds(int arg2, int arg3, int arg4, int arg5) {
        this.mDrawable.setHotspotBounds(arg2, arg3, arg4, arg5);
    }

    public boolean setState(@NonNull int[] arg1) {
        if(super.setState(arg1)) {
            this.invalidateSelf();
            return 1;
        }

        return 0;
    }

    public void setTint(int arg2) {
        if(this.isCompatTintEnabled()) {
            super.setTint(arg2);
        }
        else {
            this.mDrawable.setTint(arg2);
        }
    }

    public void setTintList(ColorStateList arg2) {
        if(this.isCompatTintEnabled()) {
            super.setTintList(arg2);
        }
        else {
            this.mDrawable.setTintList(arg2);
        }
    }

    public void setTintMode(PorterDuff$Mode arg2) {
        if(this.isCompatTintEnabled()) {
            super.setTintMode(arg2);
        }
        else {
            this.mDrawable.setTintMode(arg2);
        }
    }
}

