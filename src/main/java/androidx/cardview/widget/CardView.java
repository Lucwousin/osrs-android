package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.cardview.R$attr;
import androidx.cardview.R$color;
import androidx.cardview.R$style;
import androidx.cardview.R$styleable;

public class CardView extends FrameLayout {
    class androidx.cardview.widget.CardView$1 implements CardViewDelegate {
        private Drawable mCardBackground;

        androidx.cardview.widget.CardView$1(CardView arg1) {
            CardView.this = arg1;
            super();
        }

        public Drawable getCardBackground() {
            return this.mCardBackground;
        }

        public View getCardView() {
            return CardView.this;
        }

        public boolean getPreventCornerOverlap() {
            return CardView.this.getPreventCornerOverlap();
        }

        public boolean getUseCompatPadding() {
            return CardView.this.getUseCompatPadding();
        }

        public void setCardBackground(Drawable arg2) {
            this.mCardBackground = arg2;
            CardView.this.setBackgroundDrawable(arg2);
        }

        public void setMinWidthHeightInternal(int arg2, int arg3) {
            if(arg2 > CardView.this.mUserSetMinWidth) {
                CardView.access$101(CardView.this, arg2);
            }

            if(arg3 > CardView.this.mUserSetMinHeight) {
                CardView.access$201(CardView.this, arg3);
            }
        }

        public void setShadowPadding(int arg3, int arg4, int arg5, int arg6) {
            CardView.this.mShadowBounds.set(arg3, arg4, arg5, arg6);
            CardView.access$001(CardView.this, arg3 + CardView.this.mContentPadding.left, arg4 + CardView.this.mContentPadding.top, arg5 + CardView.this.mContentPadding.right, arg6 + CardView.this.mContentPadding.bottom);
        }
    }

    private static final int[] COLOR_BACKGROUND_ATTR;
    private static final CardViewImpl IMPL;
    private final CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    static {
        CardView.COLOR_BACKGROUND_ATTR = new int[]{0x1010031};
        if(Build$VERSION.SDK_INT >= 21) {
            CardView.IMPL = new CardViewApi21Impl();
        }
        else if(Build$VERSION.SDK_INT >= 17) {
            CardView.IMPL = new CardViewApi17Impl();
        }
        else {
            CardView.IMPL = new CardViewBaseImpl();
        }

        CardView.IMPL.initStatic();
    }

    public CardView(@NonNull Context arg2) {
        this(arg2, null);
    }

    public CardView(@NonNull Context arg2, @Nullable AttributeSet arg3) {
        this(arg2, arg3, R$attr.cardViewStyle);
    }

    public CardView(@NonNull Context arg9, @Nullable AttributeSet arg10, int arg11) {
        int v1;
        ColorStateList v11;
        super(arg9, arg10, arg11);
        this.mContentPadding = new Rect();
        this.mShadowBounds = new Rect();
        this.mCardViewDelegate = new androidx.cardview.widget.CardView$1(this);
        TypedArray v10 = arg9.obtainStyledAttributes(arg10, R$styleable.CardView, arg11, R$style.CardView);
        if(v10.hasValue(R$styleable.CardView_cardBackgroundColor)) {
            v11 = v10.getColorStateList(R$styleable.CardView_cardBackgroundColor);
        }
        else {
            TypedArray v11_1 = this.getContext().obtainStyledAttributes(CardView.COLOR_BACKGROUND_ATTR);
            v1 = v11_1.getColor(0, 0);
            v11_1.recycle();
            float[] v11_2 = new float[3];
            Color.colorToHSV(v1, v11_2);
            arg11 = v11_2[2] > 0.5f ? this.getResources().getColor(R$color.cardview_light_background) : this.getResources().getColor(R$color.cardview_dark_background);
            v11 = ColorStateList.valueOf(arg11);
        }

        ColorStateList v4 = v11;
        float v5 = v10.getDimension(R$styleable.CardView_cardCornerRadius, 0f);
        float v6 = v10.getDimension(R$styleable.CardView_cardElevation, 0f);
        float v11_3 = v10.getDimension(R$styleable.CardView_cardMaxElevation, 0f);
        this.mCompatPadding = v10.getBoolean(R$styleable.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = v10.getBoolean(R$styleable.CardView_cardPreventCornerOverlap, true);
        v1 = v10.getDimensionPixelSize(R$styleable.CardView_contentPadding, 0);
        this.mContentPadding.left = v10.getDimensionPixelSize(R$styleable.CardView_contentPaddingLeft, v1);
        this.mContentPadding.top = v10.getDimensionPixelSize(R$styleable.CardView_contentPaddingTop, v1);
        this.mContentPadding.right = v10.getDimensionPixelSize(R$styleable.CardView_contentPaddingRight, v1);
        this.mContentPadding.bottom = v10.getDimensionPixelSize(R$styleable.CardView_contentPaddingBottom, v1);
        float v7 = v6 > v11_3 ? v6 : v11_3;
        this.mUserSetMinWidth = v10.getDimensionPixelSize(R$styleable.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = v10.getDimensionPixelSize(R$styleable.CardView_android_minHeight, 0);
        v10.recycle();
        CardView.IMPL.initialize(this.mCardViewDelegate, arg9, v4, v5, v6, v7);
    }

    static void access$001(CardView arg0, int arg1, int arg2, int arg3, int arg4) {
        super.setPadding(arg1, arg2, arg3, arg4);
    }

    static void access$101(CardView arg0, int arg1) {
        super.setMinimumWidth(arg1);
    }

    static void access$201(CardView arg0, int arg1) {
        super.setMinimumHeight(arg1);
    }

    @NonNull public ColorStateList getCardBackgroundColor() {
        return CardView.IMPL.getBackgroundColor(this.mCardViewDelegate);
    }

    public float getCardElevation() {
        return CardView.IMPL.getElevation(this.mCardViewDelegate);
    }

    @Px public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    @Px public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    @Px public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    @Px public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public float getMaxCardElevation() {
        return CardView.IMPL.getMaxElevation(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public float getRadius() {
        return CardView.IMPL.getRadius(this.mCardViewDelegate);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    protected void onMeasure(int arg6, int arg7) {
        if(!(CardView.IMPL instanceof CardViewApi21Impl)) {
            int v0 = View$MeasureSpec.getMode(arg6);
            int v1 = 0x40000000;
            int v2 = 0x80000000;
            if(v0 == v2 || v0 == v1) {
                arg6 = View$MeasureSpec.makeMeasureSpec(Math.max(((int)Math.ceil(((double)CardView.IMPL.getMinWidth(this.mCardViewDelegate)))), View$MeasureSpec.getSize(arg6)), v0);
            }
            else {
            }

            v0 = View$MeasureSpec.getMode(arg7);
            if(v0 == v2 || v0 == v1) {
                arg7 = View$MeasureSpec.makeMeasureSpec(Math.max(((int)Math.ceil(((double)CardView.IMPL.getMinHeight(this.mCardViewDelegate)))), View$MeasureSpec.getSize(arg7)), v0);
            }
            else {
            }

            super.onMeasure(arg6, arg7);
        }
        else {
            super.onMeasure(arg6, arg7);
        }
    }

    public void setCardBackgroundColor(@ColorInt int arg3) {
        CardView.IMPL.setBackgroundColor(this.mCardViewDelegate, ColorStateList.valueOf(arg3));
    }

    public void setCardBackgroundColor(@Nullable ColorStateList arg3) {
        CardView.IMPL.setBackgroundColor(this.mCardViewDelegate, arg3);
    }

    public void setCardElevation(float arg3) {
        CardView.IMPL.setElevation(this.mCardViewDelegate, arg3);
    }

    public void setContentPadding(@Px int arg2, @Px int arg3, @Px int arg4, @Px int arg5) {
        this.mContentPadding.set(arg2, arg3, arg4, arg5);
        CardView.IMPL.updatePadding(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float arg3) {
        CardView.IMPL.setMaxElevation(this.mCardViewDelegate, arg3);
    }

    public void setMinimumHeight(int arg1) {
        this.mUserSetMinHeight = arg1;
        super.setMinimumHeight(arg1);
    }

    public void setMinimumWidth(int arg1) {
        this.mUserSetMinWidth = arg1;
        super.setMinimumWidth(arg1);
    }

    public void setPadding(int arg1, int arg2, int arg3, int arg4) {
    }

    public void setPaddingRelative(int arg1, int arg2, int arg3, int arg4) {
    }

    public void setPreventCornerOverlap(boolean arg2) {
        if(arg2 != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = arg2;
            CardView.IMPL.onPreventCornerOverlapChanged(this.mCardViewDelegate);
        }
    }

    public void setRadius(float arg3) {
        CardView.IMPL.setRadius(this.mCardViewDelegate, arg3);
    }

    public void setUseCompatPadding(boolean arg2) {
        if(this.mCompatPadding != arg2) {
            this.mCompatPadding = arg2;
            CardView.IMPL.onCompatPaddingChanged(this.mCardViewDelegate);
        }
    }
}

