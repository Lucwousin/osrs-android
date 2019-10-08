package butterknife;

import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.FIELD}) @public interface BindDrawable {
    @AttrRes int tint();

    @DrawableRes int value();
}

