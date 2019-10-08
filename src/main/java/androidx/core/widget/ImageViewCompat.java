package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ImageViewCompat {
    private ImageViewCompat() {
        super();
    }

    @Nullable public static ColorStateList getImageTintList(@NonNull ImageView arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getImageTintList();
        }

        ColorStateList v2 = (arg2 instanceof TintableImageSourceView) ? ((TintableImageSourceView)arg2).getSupportImageTintList() : null;
        return v2;
    }

    @Nullable public static PorterDuff$Mode getImageTintMode(@NonNull ImageView arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getImageTintMode();
        }

        PorterDuff$Mode v2 = (arg2 instanceof TintableImageSourceView) ? ((TintableImageSourceView)arg2).getSupportImageTintMode() : null;
        return v2;
    }

    public static void setImageTintList(@NonNull ImageView arg2, @Nullable ColorStateList arg3) {
        int v1 = 21;
        if(Build$VERSION.SDK_INT >= v1) {
            arg2.setImageTintList(arg3);
            if(Build$VERSION.SDK_INT == v1) {
                Drawable v3 = arg2.getDrawable();
                int v0 = arg2.getImageTintList() == null || arg2.getImageTintMode() == null ? 0 : 1;
                if(v3 == null) {
                    return;
                }

                if(v0 == 0) {
                    return;
                }

                if(v3.isStateful()) {
                    v3.setState(arg2.getDrawableState());
                }

                arg2.setImageDrawable(v3);
            }
        }
        else {
            if(!(arg2 instanceof TintableImageSourceView)) {
                return;
            }

            ((TintableImageSourceView)arg2).setSupportImageTintList(arg3);
        }
    }

    public static void setImageTintMode(@NonNull ImageView arg2, @Nullable PorterDuff$Mode arg3) {
        int v1 = 21;
        if(Build$VERSION.SDK_INT >= v1) {
            arg2.setImageTintMode(arg3);
            if(Build$VERSION.SDK_INT == v1) {
                Drawable v3 = arg2.getDrawable();
                int v0 = arg2.getImageTintList() == null || arg2.getImageTintMode() == null ? 0 : 1;
                if(v3 == null) {
                    return;
                }

                if(v0 == 0) {
                    return;
                }

                if(v3.isStateful()) {
                    v3.setState(arg2.getDrawableState());
                }

                arg2.setImageDrawable(v3);
            }
        }
        else {
            if(!(arg2 instanceof TintableImageSourceView)) {
                return;
            }

            ((TintableImageSourceView)arg2).setSupportImageTintMode(arg3);
        }
    }
}

