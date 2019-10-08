package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(method={"<_subannotation>"}, setter="setOnItemClickListener", targetType="android.widget.AdapterView<?>", type="android.widget.AdapterView.OnItemClickListener") @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.METHOD}) @public interface OnItemClick {
    @IdRes int[] value();
}

