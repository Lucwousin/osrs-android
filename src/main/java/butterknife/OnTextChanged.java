package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import butterknife.internal.ListenerMethod;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(callbacks=Callback.class, remover="removeTextChangedListener", setter="addTextChangedListener", targetType="android.widget.TextView", type="android.text.TextWatcher") @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.METHOD}) @public interface OnTextChanged {
    public enum Callback {
        @ListenerMethod(name="afterTextChanged", parameters={"android.text.Editable"}) public static final enum Callback AFTER_TEXT_CHANGED;
        @ListenerMethod(name="beforeTextChanged", parameters={"java.lang.CharSequence", "int", "int", "int"}) public static final enum Callback BEFORE_TEXT_CHANGED;
        @ListenerMethod(name="onTextChanged", parameters={"java.lang.CharSequence", "int", "int", "int"}) public static final enum Callback TEXT_CHANGED;

        static {
            Callback.TEXT_CHANGED = new Callback("TEXT_CHANGED", 0);
            Callback.BEFORE_TEXT_CHANGED = new Callback("BEFORE_TEXT_CHANGED", 1);
            Callback.AFTER_TEXT_CHANGED = new Callback("AFTER_TEXT_CHANGED", 2);
            Callback.$VALUES = new Callback[]{Callback.TEXT_CHANGED, Callback.BEFORE_TEXT_CHANGED, Callback.AFTER_TEXT_CHANGED};
        }

        private Callback(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static Callback valueOf(String arg1) {
            return Enum.valueOf(Callback.class, arg1);
        }

        public static Callback[] values() {
            return Callback.$VALUES.clone();
        }
    }

    Callback callback();

    @IdRes int[] value();
}

