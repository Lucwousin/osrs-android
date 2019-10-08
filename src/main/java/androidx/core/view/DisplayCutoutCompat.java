package androidx.core.view;

import android.graphics.Rect;
import android.os.Build$VERSION;
import android.view.DisplayCutout;
import java.util.List;

public final class DisplayCutoutCompat {
    private final Object mDisplayCutout;

    public DisplayCutoutCompat(Rect arg3, List arg4) {
        DisplayCutout v0;
        if(Build$VERSION.SDK_INT >= 28) {
            v0 = new DisplayCutout(arg3, arg4);
        }
        else {
            Object v0_1 = null;
        }

        this(v0);
    }

    private DisplayCutoutCompat(Object arg1) {
        super();
        this.mDisplayCutout = arg1;
    }

    public boolean equals(Object arg5) {
        boolean v0 = true;
        if(this == (((DisplayCutoutCompat)arg5))) {
            return 1;
        }

        if(arg5 != null) {
            if(this.getClass() != arg5.getClass()) {
            }
            else {
                if(this.mDisplayCutout != null) {
                    v0 = this.mDisplayCutout.equals(((DisplayCutoutCompat)arg5).mDisplayCutout);
                }
                else if(((DisplayCutoutCompat)arg5).mDisplayCutout == null) {
                }
                else {
                    v0 = false;
                }

                return v0;
            }
        }

        return 0;
    }

    public List getBoundingRects() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mDisplayCutout.getBoundingRects();
        }

        return null;
    }

    public int getSafeInsetBottom() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mDisplayCutout.getSafeInsetBottom();
        }

        return 0;
    }

    public int getSafeInsetLeft() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mDisplayCutout.getSafeInsetLeft();
        }

        return 0;
    }

    public int getSafeInsetRight() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mDisplayCutout.getSafeInsetRight();
        }

        return 0;
    }

    public int getSafeInsetTop() {
        if(Build$VERSION.SDK_INT >= 28) {
            return this.mDisplayCutout.getSafeInsetTop();
        }

        return 0;
    }

    public int hashCode() {
        int v0 = this.mDisplayCutout == null ? 0 : this.mDisplayCutout.hashCode();
        return v0;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    static DisplayCutoutCompat wrap(Object arg1) {
        DisplayCutoutCompat v1 = arg1 == null ? null : new DisplayCutoutCompat(arg1);
        return v1;
    }
}

