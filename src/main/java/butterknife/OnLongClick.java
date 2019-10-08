package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(method={"<_subannotation>"}, setter="setOnLongClickListener", targetType="android.view.View", type="android.view.View.OnLongClickListener") @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.METHOD}) @public interface OnLongClick {
    @IdRes int[] value();
}

