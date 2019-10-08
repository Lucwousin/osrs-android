package butterknife;

import androidx.annotation.IdRes;
import butterknife.internal.ListenerClass;
import butterknife.internal.ListenerMethod;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ListenerClass(callbacks=Callback.class, remover="removeOnPageChangeListener", setter="addOnPageChangeListener", targetType="androidx.viewpager.widget.ViewPager", type="androidx.viewpager.widget.ViewPager.OnPageChangeListener") @Retention(value=RetentionPolicy.CLASS) @Target(value={ElementType.METHOD}) @public interface OnPageChange {
    public enum Callback {
        @ListenerMethod(name="onPageScrolled", parameters={"int", "float", "int"}) public static final enum Callback PAGE_SCROLLED;
        @ListenerMethod(name="onPageScrollStateChanged", parameters={"int"}) public static final enum Callback PAGE_SCROLL_STATE_CHANGED;
        @ListenerMethod(name="onPageSelected", parameters={"int"}) public static final enum Callback PAGE_SELECTED;

        static {
            Callback.PAGE_SELECTED = new Callback("PAGE_SELECTED", 0);
            Callback.PAGE_SCROLLED = new Callback("PAGE_SCROLLED", 1);
            Callback.PAGE_SCROLL_STATE_CHANGED = new Callback("PAGE_SCROLL_STATE_CHANGED", 2);
            Callback.$VALUES = new Callback[]{Callback.PAGE_SELECTED, Callback.PAGE_SCROLLED, Callback.PAGE_SCROLL_STATE_CHANGED};
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

