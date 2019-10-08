package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(method={"<_subannotation>"}, setter="setOnClickListener", targetType="android.view.View", type="butterknife.internal.DebouncingOnClickListener") @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.METHOD}) @public interface OnClick {
    @IdRes int[] value();
}

