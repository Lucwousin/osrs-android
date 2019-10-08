package androidx.appcompat.widget;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public interface WithHint {
    @Nullable CharSequence getHint();
}

