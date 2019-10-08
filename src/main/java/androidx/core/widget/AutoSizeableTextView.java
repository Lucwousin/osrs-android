package androidx.core.widget;

import android.os.Build$VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public interface AutoSizeableTextView {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static final boolean PLATFORM_SUPPORTS_AUTOSIZE;

    static {
        boolean v0 = Build$VERSION.SDK_INT >= 27 ? true : false;
        AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE = v0;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int arg1, int arg2, int arg3, int arg4) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] arg1, int arg2) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int arg1);
}

