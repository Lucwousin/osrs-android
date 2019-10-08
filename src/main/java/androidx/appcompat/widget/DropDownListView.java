package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.appcompat.R$attr;
import androidx.appcompat.graphics.drawable.DrawableWrapper;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;

class DropDownListView extends ListView {
    class GateKeeperDrawable extends DrawableWrapper {
        private boolean mEnabled;

        GateKeeperDrawable(Drawable arg1) {
            super(arg1);
            this.mEnabled = true;
        }

        public void draw(Canvas arg2) {
            if(this.mEnabled) {
                super.draw(arg2);
            }
        }

        void setEnabled(boolean arg1) {
            this.mEnabled = arg1;
        }

        public void setHotspot(float arg2, float arg3) {
            if(this.mEnabled) {
                super.setHotspot(arg2, arg3);
            }
        }

        public void setHotspotBounds(int arg2, int arg3, int arg4, int arg5) {
            if(this.mEnabled) {
                super.setHotspotBounds(arg2, arg3, arg4, arg5);
            }
        }

        public boolean setState(int[] arg2) {
            if(this.mEnabled) {
                return super.setState(arg2);
            }

            return 0;
        }

        public boolean setVisible(boolean arg2, boolean arg3) {
            if(this.mEnabled) {
                return super.setVisible(arg2, arg3);
            }

            return 0;
        }
    }

    class ResolveHoverRunnable implements Runnable {
        ResolveHoverRunnable(DropDownListView arg1) {
            DropDownListView.this = arg1;
            super();
        }

        public void cancel() {
            DropDownListView.this.mResolveHoverRunnable = null;
            DropDownListView.this.removeCallbacks(((Runnable)this));
        }

        public void post() {
            DropDownListView.this.post(((Runnable)this));
        }

        public void run() {
            DropDownListView.this.mResolveHoverRunnable = null;
            DropDownListView.this.drawableStateChanged();
        }
    }

    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    private ViewPropertyAnimatorCompat mClickAnimation;
    private boolean mDrawsInPressedState;
    private boolean mHijackFocus;
    private Field mIsChildViewEnabled;
    private boolean mListSelectionHidden;
    private int mMotionPosition;
    ResolveHoverRunnable mResolveHoverRunnable;
    private ListViewAutoScrollHelper mScrollHelper;
    private int mSelectionBottomPadding;
    private int mSelectionLeftPadding;
    private int mSelectionRightPadding;
    private int mSelectionTopPadding;
    private GateKeeperDrawable mSelector;
    private final Rect mSelectorRect;

    DropDownListView(Context arg3, boolean arg4) {
        super(arg3, null, R$attr.dropDownListViewStyle);
        this.mSelectorRect = new Rect();
        this.mSelectionLeftPadding = 0;
        this.mSelectionTopPadding = 0;
        this.mSelectionRightPadding = 0;
        this.mSelectionBottomPadding = 0;
        this.mHijackFocus = arg4;
        this.setCacheColorHint(0);
        try {
            this.mIsChildViewEnabled = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.mIsChildViewEnabled.setAccessible(true);
        }
        catch(NoSuchFieldException v3) {
            v3.printStackTrace();
        }
    }

    private void clearPressedItem() {
        this.mDrawsInPressedState = false;
        this.setPressed(false);
        this.drawableStateChanged();
        View v1 = this.getChildAt(this.mMotionPosition - this.getFirstVisiblePosition());
        if(v1 != null) {
            v1.setPressed(false);
        }

        if(this.mClickAnimation != null) {
            this.mClickAnimation.cancel();
            this.mClickAnimation = null;
        }
    }

    private void clickPressedItem(View arg3, int arg4) {
        this.performItemClick(arg3, arg4, this.getItemIdAtPosition(arg4));
    }

    protected void dispatchDraw(Canvas arg1) {
        this.drawSelectorCompat(arg1);
        super.dispatchDraw(arg1);
    }

    private void drawSelectorCompat(Canvas arg3) {
        if(!this.mSelectorRect.isEmpty()) {
            Drawable v0 = this.getSelector();
            if(v0 != null) {
                v0.setBounds(this.mSelectorRect);
                v0.draw(arg3);
            }
        }
    }

    protected void drawableStateChanged() {
        if(this.mResolveHoverRunnable != null) {
            return;
        }

        super.drawableStateChanged();
        this.setSelectorEnabled(true);
        this.updateSelectorStateCompat();
    }

    public boolean hasFocus() {
        boolean v0 = (this.mHijackFocus) || (super.hasFocus()) ? true : false;
        return v0;
    }

    public boolean hasWindowFocus() {
        boolean v0 = (this.mHijackFocus) || (super.hasWindowFocus()) ? true : false;
        return v0;
    }

    public boolean isFocused() {
        boolean v0 = (this.mHijackFocus) || (super.isFocused()) ? true : false;
        return v0;
    }

    public boolean isInTouchMode() {
        boolean v0 = (this.mHijackFocus) && (this.mListSelectionHidden) || (super.isInTouchMode()) ? true : false;
        return v0;
    }

    public int lookForSelectablePosition(int arg5, boolean arg6) {
        ListAdapter v0 = this.getAdapter();
        int v1 = -1;
        if(v0 != null) {
            if(this.isInTouchMode()) {
            }
            else {
                int v2 = v0.getCount();
                if(!this.getAdapter().areAllItemsEnabled()) {
                    if(arg6) {
                        for(arg5 = Math.max(0, arg5); arg5 < v2; ++arg5) {
                            if(v0.isEnabled(arg5)) {
                                break;
                            }
                        }
                    }
                    else {
                        for(arg5 = Math.min(arg5, v2 - 1); arg5 >= 0; --arg5) {
                            if(v0.isEnabled(arg5)) {
                                break;
                            }
                        }
                    }

                    if(arg5 >= 0) {
                        if(arg5 >= v2) {
                        }
                        else {
                            return arg5;
                        }
                    }

                    return v1;
                }
                else {
                    if(arg5 >= 0) {
                        if(arg5 >= v2) {
                        }
                        else {
                            return arg5;
                        }
                    }

                    return v1;
                }
            }
        }

        return v1;
    }

    public int measureHeightOfChildrenCompat(int arg11, int arg12, int arg13, int arg14, int arg15) {
        arg12 = this.getListPaddingTop();
        arg13 = this.getListPaddingBottom();
        this.getListPaddingLeft();
        this.getListPaddingRight();
        int v0 = this.getDividerHeight();
        Drawable v1 = this.getDivider();
        ListAdapter v2 = this.getAdapter();
        if(v2 == null) {
            return arg12 + arg13;
        }

        arg12 += arg13;
        if(v0 <= 0 || v1 == null) {
            v0 = 0;
        }
        else {
        }

        int v1_1 = v2.getCount();
        View v3 = null;
        int v5 = arg12;
        View v6 = v3;
        arg12 = 0;
        int v4 = 0;
        int v7 = 0;
        while(arg12 < v1_1) {
            int v8 = v2.getItemViewType(arg12);
            if(v8 != v4) {
                v6 = v3;
                v4 = v8;
            }

            v6 = v2.getView(arg12, v6, ((ViewGroup)this));
            ViewGroup$LayoutParams v8_1 = v6.getLayoutParams();
            if(v8_1 == null) {
                v8_1 = this.generateDefaultLayoutParams();
                v6.setLayoutParams(v8_1);
            }

            v8 = v8_1.height > 0 ? View$MeasureSpec.makeMeasureSpec(v8_1.height, 0x40000000) : View$MeasureSpec.makeMeasureSpec(0, 0);
            v6.measure(arg11, v8);
            v6.forceLayout();
            if(arg12 > 0) {
                v5 += v0;
            }

            v5 += v6.getMeasuredHeight();
            if(v5 >= arg14) {
                if(arg15 >= 0 && arg12 > arg15 && v7 > 0 && v5 != arg14) {
                    arg14 = v7;
                }

                return arg14;
            }

            if(arg15 >= 0 && arg12 >= arg15) {
                v7 = v5;
            }

            ++arg12;
        }

        return v5;
    }

    protected void onDetachedFromWindow() {
        this.mResolveHoverRunnable = null;
        super.onDetachedFromWindow();
    }

    public boolean onForwardedEvent(MotionEvent arg8, int arg9) {
        int v0 = arg8.getActionMasked();
        switch(v0) {
            case 1: {
                goto label_12;
            }
            case 2: {
                goto label_10;
            }
            case 3: {
                goto label_7;
            }
        }

        goto label_4;
    label_10:
        boolean v3 = true;
        goto label_13;
    label_12:
        v3 = false;
    label_13:
        arg9 = arg8.findPointerIndex(arg9);
        if(arg9 < 0) {
        label_7:
            arg9 = 0;
            v3 = false;
            goto label_34;
        }

        int v4 = ((int)arg8.getX(arg9));
        arg9 = ((int)arg8.getY(arg9));
        int v5 = this.pointToPosition(v4, arg9);
        if(v5 == -1) {
            arg9 = 1;
            goto label_34;
        }

        View v3_1 = this.getChildAt(v5 - this.getFirstVisiblePosition());
        this.setPressedItem(v3_1, v5, ((float)v4), ((float)arg9));
        if(v0 == 1) {
            this.clickPressedItem(v3_1, v5);
        }

    label_4:
        arg9 = 0;
        v3 = true;
    label_34:
        if(!v3 || arg9 != 0) {
            this.clearPressedItem();
        }

        if(v3) {
            if(this.mScrollHelper == null) {
                this.mScrollHelper = new ListViewAutoScrollHelper(((ListView)this));
            }

            this.mScrollHelper.setEnabled(true);
            this.mScrollHelper.onTouch(((View)this), arg8);
        }
        else {
            if(this.mScrollHelper == null) {
                return v3;
            }

            this.mScrollHelper.setEnabled(false);
        }

        return v3;
    }

    public boolean onHoverEvent(@NonNull MotionEvent arg5) {
        if(Build$VERSION.SDK_INT < 26) {
            return super.onHoverEvent(arg5);
        }

        int v0 = arg5.getActionMasked();
        if(v0 == 10 && this.mResolveHoverRunnable == null) {
            this.mResolveHoverRunnable = new ResolveHoverRunnable(this);
            this.mResolveHoverRunnable.post();
        }

        boolean v1 = super.onHoverEvent(arg5);
        int v3 = -1;
        if(v0 == 9 || v0 == 7) {
            int v5 = this.pointToPosition(((int)arg5.getX()), ((int)arg5.getY()));
            if(v5 != v3 && v5 != this.getSelectedItemPosition()) {
                View v0_1 = this.getChildAt(v5 - this.getFirstVisiblePosition());
                if(v0_1.isEnabled()) {
                    this.setSelectionFromTop(v5, v0_1.getTop() - this.getTop());
                }

                this.updateSelectorStateCompat();
            }
        }
        else {
            this.setSelection(v3);
        }

        return v1;
    }

    public boolean onTouchEvent(MotionEvent arg3) {
        if(arg3.getAction() != 0) {
        }
        else {
            this.mMotionPosition = this.pointToPosition(((int)arg3.getX()), ((int)arg3.getY()));
        }

        if(this.mResolveHoverRunnable != null) {
            this.mResolveHoverRunnable.cancel();
        }

        return super.onTouchEvent(arg3);
    }

    private void positionSelectorCompat(int arg6, View arg7) {
        Rect v0 = this.mSelectorRect;
        v0.set(arg7.getLeft(), arg7.getTop(), arg7.getRight(), arg7.getBottom());
        v0.left -= this.mSelectionLeftPadding;
        v0.top -= this.mSelectionTopPadding;
        v0.right += this.mSelectionRightPadding;
        v0.bottom += this.mSelectionBottomPadding;
        try {
            boolean v0_1 = this.mIsChildViewEnabled.getBoolean(this);
            if(arg7.isEnabled() == v0_1) {
                return;
            }

            this.mIsChildViewEnabled.set(this, Boolean.valueOf((((int)v0_1)) ^ 1));
            if(arg6 == -1) {
                return;
            }

            this.refreshDrawableState();
        }
        catch(IllegalAccessException v6) {
            v6.printStackTrace();
        }
    }

    private void positionSelectorLikeFocusCompat(int arg5, View arg6) {
        Drawable v0 = this.getSelector();
        boolean v1 = true;
        int v3 = v0 == null || arg5 == -1 ? 0 : 1;
        if(v3 != 0) {
            v0.setVisible(false, false);
        }

        this.positionSelectorCompat(arg5, arg6);
        if(v3 != 0) {
            Rect v5 = this.mSelectorRect;
            float v6 = v5.exactCenterX();
            float v5_1 = v5.exactCenterY();
            if(this.getVisibility() == 0) {
            }
            else {
                v1 = false;
            }

            v0.setVisible(v1, false);
            DrawableCompat.setHotspot(v0, v6, v5_1);
        }
    }

    private void positionSelectorLikeTouchCompat(int arg2, View arg3, float arg4, float arg5) {
        this.positionSelectorLikeFocusCompat(arg2, arg3);
        Drawable v3 = this.getSelector();
        if(v3 != null && arg2 != -1) {
            DrawableCompat.setHotspot(v3, arg4, arg5);
        }
    }

    void setListSelectionHidden(boolean arg1) {
        this.mListSelectionHidden = arg1;
    }

    private void setPressedItem(View arg7, int arg8, float arg9, float arg10) {
        this.mDrawsInPressedState = true;
        int v2 = 21;
        if(Build$VERSION.SDK_INT >= v2) {
            this.drawableHotspotChanged(arg9, arg10);
        }

        if(!this.isPressed()) {
            this.setPressed(true);
        }

        this.layoutChildren();
        if(this.mMotionPosition != -1) {
            View v1 = this.getChildAt(this.mMotionPosition - this.getFirstVisiblePosition());
            if(v1 != null && v1 != arg7 && (v1.isPressed())) {
                v1.setPressed(false);
            }
        }

        this.mMotionPosition = arg8;
        float v1_1 = arg9 - (((float)arg7.getLeft()));
        float v3 = arg10 - (((float)arg7.getTop()));
        if(Build$VERSION.SDK_INT >= v2) {
            arg7.drawableHotspotChanged(v1_1, v3);
        }

        if(!arg7.isPressed()) {
            arg7.setPressed(true);
        }

        this.positionSelectorLikeTouchCompat(arg8, arg7, arg9, arg10);
        this.setSelectorEnabled(false);
        this.refreshDrawableState();
    }

    public void setSelector(Drawable arg2) {
        GateKeeperDrawable v0 = arg2 != null ? new GateKeeperDrawable(arg2) : null;
        this.mSelector = v0;
        super.setSelector(this.mSelector);
        Rect v0_1 = new Rect();
        if(arg2 != null) {
            arg2.getPadding(v0_1);
        }

        this.mSelectionLeftPadding = v0_1.left;
        this.mSelectionTopPadding = v0_1.top;
        this.mSelectionRightPadding = v0_1.right;
        this.mSelectionBottomPadding = v0_1.bottom;
    }

    private void setSelectorEnabled(boolean arg2) {
        if(this.mSelector != null) {
            this.mSelector.setEnabled(arg2);
        }
    }

    private boolean touchModeDrawsInPressedStateCompat() {
        return this.mDrawsInPressedState;
    }

    private void updateSelectorStateCompat() {
        Drawable v0 = this.getSelector();
        if(v0 != null && (this.touchModeDrawsInPressedStateCompat()) && (this.isPressed())) {
            v0.setState(this.getDrawableState());
        }
    }
}

