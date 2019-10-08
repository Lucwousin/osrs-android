package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View$MeasureSpec;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class Snackbar extends BaseTransientBottomBar {
    public class Callback extends BaseCallback {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public Callback() {
            super();
        }

        public void onDismissed(Snackbar arg1, int arg2) {
        }

        public void onDismissed(Object arg1, int arg2) {
            this.onDismissed(((Snackbar)arg1), arg2);
        }

        public void onShown(Snackbar arg1) {
        }

        public void onShown(Object arg1) {
            this.onShown(((Snackbar)arg1));
        }
    }

    @IntRange(from=1) @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface Duration {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public final class SnackbarLayout extends SnackbarBaseLayout {
        public SnackbarLayout(Context arg1) {
            super(arg1);
        }

        public SnackbarLayout(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
        }

        protected void onMeasure(int arg6, int arg7) {
            super.onMeasure(arg6, arg7);
            arg6 = this.getChildCount();
            arg7 = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
            int v0;
            for(v0 = 0; v0 < arg6; ++v0) {
                View v1 = this.getChildAt(v0);
                if(v1.getLayoutParams().width == -1) {
                    v1.measure(View$MeasureSpec.makeMeasureSpec(arg7, 0x40000000), View$MeasureSpec.makeMeasureSpec(v1.getMeasuredHeight(), 0x40000000));
                }
            }
        }
    }

    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    private static final int[] SNACKBAR_BUTTON_STYLE_ATTR;
    private final AccessibilityManager accessibilityManager;
    @Nullable private BaseCallback callback;
    private boolean hasAction;

    static {
        Snackbar.SNACKBAR_BUTTON_STYLE_ATTR = new int[]{R$attr.snackbarButtonStyle};
    }

    private Snackbar(ViewGroup arg1, View arg2, ContentViewCallback arg3) {
        super(arg1, arg2, arg3);
        this.accessibilityManager = arg1.getContext().getSystemService("accessibility");
    }

    public void dismiss() {
        super.dismiss();
    }

    private static ViewGroup findSuitableParent(View arg3) {
        View v1_1;
        View v0 = null;
        ViewGroup v1 = ((ViewGroup)v0);
        do {
            if((arg3 instanceof CoordinatorLayout)) {
                return arg3;
            }

            if((arg3 instanceof FrameLayout)) {
                if(arg3.getId() == 0x1020002) {
                    return arg3;
                }
                else {
                    v1_1 = arg3;
                }
            }

            if(arg3 != null) {
                ViewParent v3 = ((View)v3).getParent();
                if((v3 instanceof View)) {
                }
                else {
                    arg3 = v0;
                }
            }
        }
        while(arg3 != null);

        return ((ViewGroup)v1_1);
    }

    public int getDuration() {
        int v0 = !this.hasAction || !this.accessibilityManager.isTouchExplorationEnabled() ? super.getDuration() : -2;
        return v0;
    }

    protected static boolean hasSnackbarButtonStyleAttr(Context arg3) {
        TypedArray v3 = arg3.obtainStyledAttributes(Snackbar.SNACKBAR_BUTTON_STYLE_ATTR);
        boolean v1 = false;
        int v2 = v3.getResourceId(0, -1);
        v3.recycle();
        if(v2 != -1) {
            v1 = true;
        }

        return v1;
    }

    public boolean isShown() {
        return super.isShown();
    }

    @NonNull public static Snackbar make(@NonNull View arg1, @StringRes int arg2, int arg3) {
        return Snackbar.make(arg1, arg1.getResources().getText(arg2), arg3);
    }

    @NonNull public static Snackbar make(@NonNull View arg3, @NonNull CharSequence arg4, int arg5) {
        ViewGroup v3 = Snackbar.findSuitableParent(arg3);
        if(v3 != null) {
            LayoutInflater v0 = LayoutInflater.from(v3.getContext());
            int v1 = Snackbar.hasSnackbarButtonStyleAttr(v3.getContext()) ? R$layout.mtrl_layout_snackbar_include : R$layout.design_layout_snackbar_include;
            View v0_1 = v0.inflate(v1, v3, false);
            Snackbar v1_1 = new Snackbar(v3, v0_1, ((ContentViewCallback)v0_1));
            v1_1.setText(arg4);
            v1_1.setDuration(arg5);
            return v1_1;
        }

        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    @NonNull public Snackbar setAction(@StringRes int arg2, View$OnClickListener arg3) {
        return this.setAction(this.getContext().getText(arg2), arg3);
    }

    @NonNull public Snackbar setAction(CharSequence arg4, View$OnClickListener arg5) {
        Button v0 = this.view.getChildAt(0).getActionView();
        if((TextUtils.isEmpty(arg4)) || arg5 == null) {
            ((TextView)v0).setVisibility(8);
            ((TextView)v0).setOnClickListener(null);
            this.hasAction = false;
        }
        else {
            this.hasAction = true;
            ((TextView)v0).setVisibility(0);
            ((TextView)v0).setText(arg4);
            ((TextView)v0).setOnClickListener(new View$OnClickListener(arg5) {
                public void onClick(View arg2) {
                    this.val$listener.onClick(arg2);
                    Snackbar.this.dispatchDismiss(1);
                }
            });
        }

        return this;
    }

    @NonNull public Snackbar setActionTextColor(@ColorInt int arg3) {
        this.view.getChildAt(0).getActionView().setTextColor(arg3);
        return this;
    }

    @NonNull public Snackbar setActionTextColor(ColorStateList arg3) {
        this.view.getChildAt(0).getActionView().setTextColor(arg3);
        return this;
    }

    @NonNull @Deprecated public Snackbar setCallback(Callback arg2) {
        if(this.callback != null) {
            this.removeCallback(this.callback);
        }

        if(arg2 != null) {
            this.addCallback(((BaseCallback)arg2));
        }

        this.callback = ((BaseCallback)arg2);
        return this;
    }

    @NonNull public Snackbar setText(@NonNull CharSequence arg3) {
        this.view.getChildAt(0).getMessageView().setText(arg3);
        return this;
    }

    @NonNull public Snackbar setText(@StringRes int arg2) {
        return this.setText(this.getContext().getText(arg2));
    }

    public void show() {
        super.show();
    }
}

