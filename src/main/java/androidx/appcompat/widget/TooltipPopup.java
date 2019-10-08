package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.WindowManager$LayoutParams;
import android.widget.TextView;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class TooltipPopup {
    private static final String TAG = "TooltipPopup";
    private final View mContentView;
    private final Context mContext;
    private final WindowManager$LayoutParams mLayoutParams;
    private final TextView mMessageView;
    private final int[] mTmpAnchorPos;
    private final int[] mTmpAppPos;
    private final Rect mTmpDisplayFrame;

    TooltipPopup(Context arg3) {
        super();
        this.mLayoutParams = new WindowManager$LayoutParams();
        this.mTmpDisplayFrame = new Rect();
        this.mTmpAnchorPos = new int[2];
        this.mTmpAppPos = new int[2];
        this.mContext = arg3;
        this.mContentView = LayoutInflater.from(this.mContext).inflate(R$layout.abc_tooltip, null);
        this.mMessageView = this.mContentView.findViewById(R$id.message);
        this.mLayoutParams.setTitle(this.getClass().getSimpleName());
        this.mLayoutParams.packageName = this.mContext.getPackageName();
        this.mLayoutParams.type = 1002;
        this.mLayoutParams.width = -2;
        this.mLayoutParams.height = -2;
        this.mLayoutParams.format = -3;
        this.mLayoutParams.windowAnimations = R$style.Animation_AppCompat_Tooltip;
        this.mLayoutParams.flags = 24;
    }

    private void computePosition(View arg9, int arg10, int arg11, boolean arg12, WindowManager$LayoutParams arg13) {
        int v1;
        arg13.token = arg9.getApplicationWindowToken();
        int v0 = this.mContext.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_threshold);
        if(arg9.getWidth() >= v0) {
        }
        else {
            arg10 = arg9.getWidth() / 2;
        }

        if(arg9.getHeight() >= v0) {
            v0 = this.mContext.getResources().getDimensionPixelOffset(R$dimen.tooltip_precise_anchor_extra_offset);
            v1 = arg11 + v0;
            arg11 -= v0;
        }
        else {
            v1 = arg9.getHeight();
            arg11 = 0;
        }

        arg13.gravity = 49;
        Resources v0_1 = this.mContext.getResources();
        int v3 = arg12 ? R$dimen.tooltip_y_offset_touch : R$dimen.tooltip_y_offset_non_touch;
        v0 = v0_1.getDimensionPixelOffset(v3);
        View v3_1 = TooltipPopup.getAppRootView(arg9);
        if(v3_1 == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }

        v3_1.getWindowVisibleDisplayFrame(this.mTmpDisplayFrame);
        if(this.mTmpDisplayFrame.left < 0 && this.mTmpDisplayFrame.top < 0) {
            Resources v4 = this.mContext.getResources();
            int v5 = v4.getIdentifier("status_bar_height", "dimen", "android");
            v5 = v5 != 0 ? v4.getDimensionPixelSize(v5) : 0;
            DisplayMetrics v4_1 = v4.getDisplayMetrics();
            this.mTmpDisplayFrame.set(0, v5, v4_1.widthPixels, v4_1.heightPixels);
        }

        v3_1.getLocationOnScreen(this.mTmpAppPos);
        arg9.getLocationOnScreen(this.mTmpAnchorPos);
        this.mTmpAnchorPos[0] -= this.mTmpAppPos[0];
        this.mTmpAnchorPos[1] -= this.mTmpAppPos[1];
        arg13.x = this.mTmpAnchorPos[0] + arg10 - v3_1.getWidth() / 2;
        int v9 = View$MeasureSpec.makeMeasureSpec(0, 0);
        this.mContentView.measure(v9, v9);
        v9 = this.mContentView.getMeasuredHeight();
        arg10 = this.mTmpAnchorPos[1] + arg11 - v0 - v9;
        arg11 = this.mTmpAnchorPos[1] + v1 + v0;
        if(arg12) {
            arg13.y = arg10 >= 0 ? arg10 : arg11;
        }
        else if(v9 + arg11 <= this.mTmpDisplayFrame.height()) {
            arg13.y = arg11;
        }
        else {
            arg13.y = arg10;
        }
    }

    private static View getAppRootView(View arg3) {
        View v0 = arg3.getRootView();
        ViewGroup$LayoutParams v1 = v0.getLayoutParams();
        if(((v1 instanceof WindowManager$LayoutParams)) && ((WindowManager$LayoutParams)v1).type == 2) {
            return v0;
        }

        Context v3;
        for(v3 = arg3.getContext(); (v3 instanceof ContextWrapper); v3 = ((ContextWrapper)v3).getBaseContext()) {
            if((v3 instanceof Activity)) {
                return ((Activity)v3).getWindow().getDecorView();
            }
        }

        return v0;
    }

    void hide() {
        if(!this.isShowing()) {
            return;
        }

        this.mContext.getSystemService("window").removeView(this.mContentView);
    }

    boolean isShowing() {
        boolean v0 = this.mContentView.getParent() != null ? true : false;
        return v0;
    }

    void show(View arg8, int arg9, int arg10, boolean arg11, CharSequence arg12) {
        if(this.isShowing()) {
            this.hide();
        }

        this.mMessageView.setText(arg12);
        this.computePosition(arg8, arg9, arg10, arg11, this.mLayoutParams);
        this.mContext.getSystemService("window").addView(this.mContentView, this.mLayoutParams);
    }
}

