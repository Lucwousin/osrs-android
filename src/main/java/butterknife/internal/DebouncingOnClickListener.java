package butterknife.internal;

import android.view.View$OnClickListener;
import android.view.View;

public abstract class DebouncingOnClickListener implements View$OnClickListener {
    final class butterknife.internal.DebouncingOnClickListener$1 implements Runnable {
        butterknife.internal.DebouncingOnClickListener$1() {
            super();
        }

        public void run() {
            DebouncingOnClickListener.enabled = true;
        }
    }

    private static final Runnable ENABLE_AGAIN = null;
    static boolean enabled = true;

    static {
        DebouncingOnClickListener.ENABLE_AGAIN = new butterknife.internal.DebouncingOnClickListener$1();
    }

    public DebouncingOnClickListener() {
        super();
    }

    public abstract void doClick(View arg1);

    public final void onClick(View arg2) {
        if(DebouncingOnClickListener.enabled) {
            DebouncingOnClickListener.enabled = false;
            arg2.post(DebouncingOnClickListener.ENABLE_AGAIN);
            this.doClick(arg2);
        }
    }
}

