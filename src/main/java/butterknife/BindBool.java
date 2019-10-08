package butterknife;

import androidx.annotation.BoolRes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.FIELD}) @public interface BindBool {
    @BoolRes int value();
}

