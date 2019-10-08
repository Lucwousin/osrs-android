package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(method={"<_subannotation>"}, setter="setOnCheckedChangeListener", targetType="android.widget.CompoundButton", type="android.widget.CompoundButton.OnCheckedChangeListener") @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.METHOD}) @public interface OnCheckedChanged {
    @IdRes int[] value();
}

