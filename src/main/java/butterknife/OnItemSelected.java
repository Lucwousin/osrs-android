package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import butterknife.internal.ListenerMethod;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(callbacks=Callback.class, setter="setOnItemSelectedListener", targetType="android.widget.AdapterView<?>", type="android.widget.AdapterView.OnItemSelectedListener") @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.METHOD}) @public interface OnItemSelected {
    public enum Callback {
        @ListenerMethod(name="onItemSelected", parameters={"android.widget.AdapterView<?>", "android.view.View", "int", "long"}) public static final enum Callback ITEM_SELECTED;
        @ListenerMethod(name="onNothingSelected", parameters={"android.widget.AdapterView<?>"}) public static final enum Callback NOTHING_SELECTED;

        static {
            Callback.ITEM_SELECTED = new Callback("ITEM_SELECTED", 0);
            Callback.NOTHING_SELECTED = new Callback("NOTHING_SELECTED", 1);
            Callback.$VALUES = new Callback[]{Callback.ITEM_SELECTED, Callback.NOTHING_SELECTED};
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

