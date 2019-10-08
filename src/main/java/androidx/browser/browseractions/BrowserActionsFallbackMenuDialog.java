package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

class BrowserActionsFallbackMenuDialog extends Dialog {
    private static final long ENTER_ANIMATION_DURATION_MS = 0xFA;
    private static final long EXIT_ANIMATION_DURATION_MS = 150;
    private final View mContentView;

    BrowserActionsFallbackMenuDialog(Context arg1, View arg2) {
        super(arg1);
        this.mContentView = arg2;
    }

    static void access$001(BrowserActionsFallbackMenuDialog arg0) {
        super.dismiss();
    }

    public void dismiss() {
        this.startAnimation(false);
    }

    public boolean onTouchEvent(MotionEvent arg1) {
        if(arg1.getAction() == 0) {
            this.dismiss();
            return 1;
        }

        return 0;
    }

    public void show() {
        this.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.startAnimation(true);
        super.show();
    }

    private void startAnimation(boolean arg6) {
        float v0 = 1f;
        float v2 = arg6 ? 0f : 1f;
        if(arg6) {
        }
        else {
            v0 = 0f;
        }

        long v3 = arg6 ? 0xFA : 150;
        this.mContentView.setScaleX(v2);
        this.mContentView.setScaleY(v2);
        this.mContentView.animate().scaleX(v0).scaleY(v0).setDuration(v3).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new AnimatorListenerAdapter(arg6) {
            public void onAnimationEnd(Animator arg1) {
                if(!this.val$isEnterAnimation) {
                    BrowserActionsFallbackMenuDialog.access$001(BrowserActionsFallbackMenuDialog.this);
                }
            }
        }).start();
    }
}

