package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(method={"<_subannotation>"}, setter="setOnFocusChangeListener", targetType="android.view.View", type="android.view.View.OnFocusChangeListener") @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.METHOD}) @public interface OnFocusChange {
    @IdRes int[] value();
}

