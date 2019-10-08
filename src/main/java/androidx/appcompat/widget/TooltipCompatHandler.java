package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnHoverListener;
import android.view.View$OnLongClickListener;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class TooltipCompatHandler implements View$OnAttachStateChangeListener, View$OnHoverListener, View$OnLongClickListener {
    class androidx.appcompat.widget.TooltipCompatHandler$1 implements Runnable {
        androidx.appcompat.widget.TooltipCompatHandler$1(TooltipCompatHandler arg1) {
            TooltipCompatHandler.this = arg1;
            super();
        }

        public void run() {
            TooltipCompatHandler.this.show(false);
        }
    }

    class androidx.appcompat.widget.TooltipCompatHandler$2 implements Runnable {
        androidx.appcompat.widget.TooltipCompatHandler$2(TooltipCompatHandler arg1) {
            TooltipCompatHandler.this = arg1;
            super();
        }

        public void run() {
            TooltipCompatHandler.this.hide();
        }
    }

    private static final long HOVER_HIDE_TIMEOUT_MS = 15000;
    private static final long HOVER_HIDE_TIMEOUT_SHORT_MS = 3000;
    private static final long LONG_CLICK_HIDE_TIMEOUT_MS = 2500;
    private static final String TAG = "TooltipCompatHandler";
    private final View mAnchor;
    private int mAnchorX;
    private int mAnchorY;
    private boolean mFromTouch;
    private final Runnable mHideRunnable;
    private final int mHoverSlop;
    private TooltipPopup mPopup;
    private final Runnable mShowRunnable;
    private final CharSequence mTooltipText;
    private static TooltipCompatHandler sActiveHandler;
    private static TooltipCompatHandler sPendingHandler;

    private TooltipCompatHandler(View arg2, CharSequence arg3) {
        super();
        this.mShowRunnable = new androidx.appcompat.widget.TooltipCompatHandler$1(this);
        this.mHideRunnable = new androidx.appcompat.widget.TooltipCompatHandler$2(this);
        this.mAnchor = arg2;
        this.mTooltipText = arg3;
        this.mHoverSlop = ViewConfigurationCompat.getScaledHoverSlop(ViewConfiguration.get(this.mAnchor.getContext()));
        this.clearAnchorPos();
        this.mAnchor.setOnLongClickListener(((View$OnLongClickListener)this));
        this.mAnchor.setOnHoverListener(((View$OnHoverListener)this));
    }

    private void cancelPendingShow() {
        this.mAnchor.removeCallbacks(this.mShowRunnable);
    }

    private void clearAnchorPos() {
        this.mAnchorX = 0x7FFFFFFF;
        this.mAnchorY = 0x7FFFFFFF;
    }

    void hide() {
        TooltipCompatHandler v1 = null;
        if(TooltipCompatHandler.sActiveHandler == this) {
            TooltipCompatHandler.sActiveHandler = v1;
            if(this.mPopup != null) {
                this.mPopup.hide();
                this.mPopup = ((TooltipPopup)v1);
                this.clearAnchorPos();
                this.mAnchor.removeOnAttachStateChangeListener(((View$OnAttachStateChangeListener)this));
            }
            else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }

        if(TooltipCompatHandler.sPendingHandler == this) {
            TooltipCompatHandler.setPendingHandler(v1);
        }

        this.mAnchor.removeCallbacks(this.mHideRunnable);
    }

    public boolean onHover(View arg3, MotionEvent arg4) {
        if(this.mPopup != null && (this.mFromTouch)) {
            return 0;
        }

        Object v3 = this.mAnchor.getContext().getSystemService("accessibility");
        if((((AccessibilityManager)v3).isEnabled()) && (((AccessibilityManager)v3).isTouchExplorationEnabled())) {
            return 0;
        }

        int v3_1 = arg4.getAction();
        if(v3_1 != 7) {
            if(v3_1 != 10) {
            }
            else {
                this.clearAnchorPos();
                this.hide();
            }
        }
        else if((this.mAnchor.isEnabled()) && this.mPopup == null && (this.updateAnchorPos(arg4))) {
            TooltipCompatHandler.setPendingHandler(this);
        }

        return 0;
    }

    public boolean onLongClick(View arg2) {
        this.mAnchorX = arg2.getWidth() / 2;
        this.mAnchorY = arg2.getHeight() / 2;
        this.show(true);
        return 1;
    }

    public void onViewAttachedToWindow(View arg1) {
    }

    public void onViewDetachedFromWindow(View arg1) {
        this.hide();
    }

    private void scheduleShow() {
        this.mAnchor.postDelayed(this.mShowRunnable, ((long)ViewConfiguration.getLongPressTimeout()));
    }

    private static void setPendingHandler(TooltipCompatHandler arg1) {
        if(TooltipCompatHandler.sPendingHandler != null) {
            TooltipCompatHandler.sPendingHandler.cancelPendingShow();
        }

        TooltipCompatHandler.sPendingHandler = arg1;
        if(TooltipCompatHandler.sPendingHandler != null) {
            TooltipCompatHandler.sPendingHandler.scheduleShow();
        }
    }

    public static void setTooltipText(View arg2, CharSequence arg3) {
        TooltipCompatHandler v1 = null;
        if(TooltipCompatHandler.sPendingHandler != null && TooltipCompatHandler.sPendingHandler.mAnchor == arg2) {
            TooltipCompatHandler.setPendingHandler(v1);
        }

        if(TextUtils.isEmpty(arg3)) {
            if(TooltipCompatHandler.sActiveHandler != null && TooltipCompatHandler.sActiveHandler.mAnchor == arg2) {
                TooltipCompatHandler.sActiveHandler.hide();
            }

            arg2.setOnLongClickListener(((View$OnLongClickListener)v1));
            arg2.setLongClickable(false);
            arg2.setOnHoverListener(((View$OnHoverListener)v1));
        }
        else {
            new TooltipCompatHandler(arg2, arg3);
        }
    }

    void show(boolean arg8) {
        long v0;
        if(!ViewCompat.isAttachedToWindow(this.mAnchor)) {
            return;
        }

        TooltipCompatHandler.setPendingHandler(null);
        if(TooltipCompatHandler.sActiveHandler != null) {
            TooltipCompatHandler.sActiveHandler.hide();
        }

        TooltipCompatHandler.sActiveHandler = this;
        this.mFromTouch = arg8;
        this.mPopup = new TooltipPopup(this.mAnchor.getContext());
        this.mPopup.show(this.mAnchor, this.mAnchorX, this.mAnchorY, this.mFromTouch, this.mTooltipText);
        this.mAnchor.addOnAttachStateChangeListener(((View$OnAttachStateChangeListener)this));
        if(this.mFromTouch) {
            v0 = 2500;
        }
        else if((ViewCompat.getWindowSystemUiVisibility(this.mAnchor) & 1) == 1) {
            v0 = 3000 - (((long)ViewConfiguration.getLongPressTimeout()));
        }
        else {
            v0 = 15000 - (((long)ViewConfiguration.getLongPressTimeout()));
        }

        this.mAnchor.removeCallbacks(this.mHideRunnable);
        this.mAnchor.postDelayed(this.mHideRunnable, v0);
    }

    private boolean updateAnchorPos(MotionEvent arg4) {
        int v0 = ((int)arg4.getX());
        int v4 = ((int)arg4.getY());
        if(Math.abs(v0 - this.mAnchorX) <= this.mHoverSlop && Math.abs(v4 - this.mAnchorY) <= this.mHoverSlop) {
            return 0;
        }

        this.mAnchorX = v0;
        this.mAnchorY = v4;
        return 1;
    }
}

