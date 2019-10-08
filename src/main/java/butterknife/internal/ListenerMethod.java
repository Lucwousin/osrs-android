package butterknife.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME) @Target(value={ElementType.FIELD}) @public interface ListenerMethod {
    String defaultReturn();

    String name();

    String[] parameters();

    String returnType();
}

