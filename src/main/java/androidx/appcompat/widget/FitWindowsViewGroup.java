package androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public interface FitWindowsViewGroup {
    public interface OnFitSystemWindowsListener {
        void onFitSystemWindows(Rect arg1);
    }

    void setOnFitSystemWindowsListener(OnFitSystemWindowsListener arg1);
}

