package butterknife.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME) @Target(value={ElementType.ANNOTATION_TYPE}) @public interface ListenerClass {
    public enum NONE {
        static {
            NONE.$VALUES = new NONE[0];
        }

        private NONE(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static NONE valueOf(String arg1) {
            return Enum.valueOf(NONE.class, arg1);
        }

        public static NONE[] values() {
            return NONE.$VALUES.clone();
        }
    }

    Class callbacks();

    ListenerMethod[] method();

    String remover();

    String setter();

    String targetType();

    String type();
}

