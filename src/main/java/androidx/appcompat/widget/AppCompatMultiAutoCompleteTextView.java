package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$attr;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements TintableBackgroundView {
    private static final int[] TINT_ATTRS;
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatTextHelper mTextHelper;

    static {
        AppCompatMultiAutoCompleteTextView.TINT_ATTRS = new int[]{0x1010176};
    }

    public AppCompatMultiAutoCompleteTextView(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.autoCompleteTextViewStyle);
    }

    public AppCompatMultiAutoCompleteTextView(Context arg2) {
        this(arg2, null);
    }

    public AppCompatMultiAutoCompleteTextView(Context arg3, AttributeSet arg4, int arg5) {
        super(TintContextWrapper.wrap(arg3), arg4, arg5);
        TintTypedArray v3 = TintTypedArray.obtainStyledAttributes(this.getContext(), arg4, AppCompatMultiAutoCompleteTextView.TINT_ATTRS, arg5, 0);
        if(v3.hasValue(0)) {
            this.setDropDownBackgroundDrawable(v3.getDrawable(0));
        }

        v3.recycle();
        this.mBackgroundTintHelper = new AppCompatBackgroundHelper(((View)this));
        this.mBackgroundTintHelper.loadFromAttributes(arg4, arg5);
        this.mTextHelper = new AppCompatTextHelper(((TextView)this));
        this.mTextHelper.loadFromAttributes(arg4, arg5);
        this.mTextHelper.applyCompoundDrawablesTints();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.applySupportBackgroundTint();
        }

        if(this.mTextHelper != null) {
            this.mTextHelper.applyCompoundDrawablesTints();
        }
    }

    @Nullable @RestrictTo(value={Scope.LIBRARY_GROUP}) public ColorStateList getSupportBackgroundTintList() {
        ColorStateList v0 = this.mBackgroundTintHelper != null ? this.mBackgroundTintHelper.getSupportBackgroundTintList() : null;
        return v0;
    }

    @Nullable @RestrictTo(value={Scope.LIBRARY_GROUP}) public PorterDuff$Mode getSupportBackgroundTintMode() {
        PorterDuff$Mode v0 = this.mBackgroundTintHelper != null ? this.mBackgroundTintHelper.getSupportBackgroundTintMode() : null;
        return v0;
    }

    public InputConnection onCreateInputConnection(EditorInfo arg2) {
        return AppCompatHintHelper.onCreateInputConnection(super.onCreateInputConnection(arg2), arg2, ((View)this));
    }

    public void setBackgroundDrawable(Drawable arg2) {
        super.setBackgroundDrawable(arg2);
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundDrawable(arg2);
        }
    }

    public void setBackgroundResource(@DrawableRes int arg2) {
        super.setBackgroundResource(arg2);
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundResource(arg2);
        }
    }

    public void setDropDownBackgroundResource(@DrawableRes int arg2) {
        this.setDropDownBackgroundDrawable(AppCompatResources.getDrawable(this.getContext(), arg2));
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setSupportBackgroundTintList(@Nullable ColorStateList arg2) {
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintList(arg2);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setSupportBackgroundTintMode(@Nullable PorterDuff$Mode arg2) {
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintMode(arg2);
        }
    }

    public void setTextAppearance(Context arg2, int arg3) {
        super.setTextAppearance(arg2, arg3);
        if(this.mTextHelper != null) {
            this.mTextHelper.onSetTextAppearance(arg2, arg3);
        }
    }
}

