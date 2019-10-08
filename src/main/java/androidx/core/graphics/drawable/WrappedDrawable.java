package androidx.core.graphics.drawable;

import android.graphics.drawable.Drawable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public interface WrappedDrawable {
    Drawable getWrappedDrawable();

    void setWrappedDrawable(Drawable arg1);
}

