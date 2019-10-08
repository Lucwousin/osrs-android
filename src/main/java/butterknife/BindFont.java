package butterknife;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.FIELD}) @public interface BindFont {
    @RestrictTo(value={Scope.LIBRARY}) @public interface TypefaceStyle {
    }

    @TypefaceStyle int style();

    int value();
}

