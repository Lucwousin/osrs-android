package butterknife;

import androidx.annotation.UiThread;

public interface Unbinder {
    final class butterknife.Unbinder$1 implements Unbinder {
        butterknife.Unbinder$1() {
            super();
        }

        public void unbind() {
        }
    }

    public static final Unbinder EMPTY;

    static {
        Unbinder.EMPTY = new butterknife.Unbinder$1();
    }

    @UiThread void unbind();
}

