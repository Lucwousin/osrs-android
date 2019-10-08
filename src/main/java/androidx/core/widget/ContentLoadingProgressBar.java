package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ContentLoadingProgressBar extends ProgressBar {
    class androidx.core.widget.ContentLoadingProgressBar$1 implements Runnable {
        androidx.core.widget.ContentLoadingProgressBar$1(ContentLoadingProgressBar arg1) {
            ContentLoadingProgressBar.this = arg1;
            super();
        }

        public void run() {
            ContentLoadingProgressBar.this.mPostedHide = false;
            ContentLoadingProgressBar.this.mStartTime = -1;
            ContentLoadingProgressBar.this.setVisibility(8);
        }
    }

    class androidx.core.widget.ContentLoadingProgressBar$2 implements Runnable {
        androidx.core.widget.ContentLoadingProgressBar$2(ContentLoadingProgressBar arg1) {
            ContentLoadingProgressBar.this = arg1;
            super();
        }

        public void run() {
            ContentLoadingProgressBar.this.mPostedShow = false;
            if(!ContentLoadingProgressBar.this.mDismissed) {
                ContentLoadingProgressBar.this.mStartTime = System.currentTimeMillis();
                ContentLoadingProgressBar.this.setVisibility(0);
            }
        }
    }

    private static final int MIN_DELAY = 500;
    private static final int MIN_SHOW_TIME = 500;
    private final Runnable mDelayedHide;
    private final Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;

    public ContentLoadingProgressBar(@NonNull Context arg2) {
        this(arg2, null);
    }

    public ContentLoadingProgressBar(@NonNull Context arg2, @Nullable AttributeSet arg3) {
        super(arg2, arg3, 0);
        this.mStartTime = -1;
        this.mPostedHide = false;
        this.mPostedShow = false;
        this.mDismissed = false;
        this.mDelayedHide = new androidx.core.widget.ContentLoadingProgressBar$1(this);
        this.mDelayedShow = new androidx.core.widget.ContentLoadingProgressBar$2(this);
    }

    public void hide() {
        __monitor_enter(this);
        try {
            this.mDismissed = true;
            this.removeCallbacks(this.mDelayedShow);
            this.mPostedShow = false;
            long v1 = System.currentTimeMillis() - this.mStartTime;
            long v3 = 500;
            if(v1 >= v3 || this.mStartTime == -1) {
                this.setVisibility(8);
            }
            else if(!this.mPostedHide) {
                this.postDelayed(this.mDelayedHide, v3 - v1);
                this.mPostedHide = true;
            }
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.removeCallbacks();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks();
    }

    private void removeCallbacks() {
        this.removeCallbacks(this.mDelayedHide);
        this.removeCallbacks(this.mDelayedShow);
    }

    public void show() {
        __monitor_enter(this);
        long v0 = -1;
        try {
            this.mStartTime = v0;
            this.mDismissed = false;
            this.removeCallbacks(this.mDelayedHide);
            this.mPostedHide = false;
            if(!this.mPostedShow) {
                this.postDelayed(this.mDelayedShow, 500);
                this.mPostedShow = true;
            }
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }
}

