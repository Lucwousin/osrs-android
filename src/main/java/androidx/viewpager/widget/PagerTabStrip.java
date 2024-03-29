package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

public class PagerTabStrip extends PagerTitleStrip {
    private static final int FULL_UNDERLINE_HEIGHT = 1;
    private static final int INDICATOR_HEIGHT = 3;
    private static final int MIN_PADDING_BOTTOM = 6;
    private static final int MIN_STRIP_HEIGHT = 0x20;
    private static final int MIN_TEXT_SPACING = 0x40;
    private static final int TAB_PADDING = 16;
    private static final int TAB_SPACING = 0x20;
    private static final String TAG = "PagerTabStrip";
    private boolean mDrawFullUnderline;
    private boolean mDrawFullUnderlineSet;
    private int mFullUnderlineHeight;
    private boolean mIgnoreTap;
    private int mIndicatorColor;
    private int mIndicatorHeight;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private int mMinPaddingBottom;
    private int mMinStripHeight;
    private int mMinTextSpacing;
    private int mTabAlpha;
    private int mTabPadding;
    private final Paint mTabPaint;
    private final Rect mTempRect;
    private int mTouchSlop;

    public PagerTabStrip(@NonNull Context arg2) {
        this(arg2, null);
    }

    public PagerTabStrip(@NonNull Context arg4, @Nullable AttributeSet arg5) {
        super(arg4, arg5);
        this.mTabPaint = new Paint();
        this.mTempRect = new Rect();
        this.mTabAlpha = 0xFF;
        this.mDrawFullUnderline = false;
        this.mDrawFullUnderlineSet = false;
        this.mIndicatorColor = this.mTextColor;
        this.mTabPaint.setColor(this.mIndicatorColor);
        float v0 = arg4.getResources().getDisplayMetrics().density;
        this.mIndicatorHeight = ((int)(3f * v0 + 0.5f));
        this.mMinPaddingBottom = ((int)(6f * v0 + 0.5f));
        this.mMinTextSpacing = ((int)(64f * v0));
        this.mTabPadding = ((int)(16f * v0 + 0.5f));
        this.mFullUnderlineHeight = ((int)(1f * v0 + 0.5f));
        this.mMinStripHeight = ((int)(v0 * 32f + 0.5f));
        this.mTouchSlop = ViewConfiguration.get(arg4).getScaledTouchSlop();
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        this.setTextSpacing(this.getTextSpacing());
        this.setWillNotDraw(false);
        this.mPrevText.setFocusable(true);
        this.mPrevText.setOnClickListener(new View$OnClickListener() {
            public void onClick(View arg2) {
                PagerTabStrip.this.mPager.setCurrentItem(PagerTabStrip.this.mPager.getCurrentItem() - 1);
            }
        });
        this.mNextText.setFocusable(true);
        this.mNextText.setOnClickListener(new View$OnClickListener() {
            public void onClick(View arg2) {
                PagerTabStrip.this.mPager.setCurrentItem(PagerTabStrip.this.mPager.getCurrentItem() + 1);
            }
        });
        if(this.getBackground() == null) {
            this.mDrawFullUnderline = true;
        }
    }

    public boolean getDrawFullUnderline() {
        return this.mDrawFullUnderline;
    }

    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.mMinStripHeight);
    }

    @ColorInt public int getTabIndicatorColor() {
        return this.mIndicatorColor;
    }

    protected void onDraw(Canvas arg15) {
        super.onDraw(arg15);
        int v0 = this.getHeight();
        int v1 = this.mCurrText.getLeft() - this.mTabPadding;
        int v2 = this.mCurrText.getRight() + this.mTabPadding;
        int v3 = v0 - this.mIndicatorHeight;
        int v7 = 0xFFFFFF;
        this.mTabPaint.setColor(this.mTabAlpha << 24 | this.mIndicatorColor & v7);
        float v5 = ((float)v0);
        arg15.drawRect(((float)v1), ((float)v3), ((float)v2), v5, this.mTabPaint);
        if(this.mDrawFullUnderline) {
            this.mTabPaint.setColor(0xFF000000 | this.mIndicatorColor & v7);
            arg15.drawRect(((float)this.getPaddingLeft()), ((float)(v0 - this.mFullUnderlineHeight)), ((float)(this.getWidth() - this.getPaddingRight())), v5, this.mTabPaint);
        }
    }

    public boolean onTouchEvent(MotionEvent arg5) {
        int v0 = arg5.getAction();
        if(v0 != 0 && (this.mIgnoreTap)) {
            return 0;
        }

        float v2 = arg5.getX();
        float v5 = arg5.getY();
        switch(v0) {
            case 0: {
                this.mInitialMotionX = v2;
                this.mInitialMotionY = v5;
                this.mIgnoreTap = false;
                break;
            }
            case 1: {
                if(v2 < (((float)(this.mCurrText.getLeft() - this.mTabPadding)))) {
                    this.mPager.setCurrentItem(this.mPager.getCurrentItem() - 1);
                    return 1;
                }

                if(v2 <= (((float)(this.mCurrText.getRight() + this.mTabPadding)))) {
                    return 1;
                }

                this.mPager.setCurrentItem(this.mPager.getCurrentItem() + 1);
                break;
            }
            case 2: {
                if(Math.abs(v2 - this.mInitialMotionX) <= (((float)this.mTouchSlop)) && Math.abs(v5 - this.mInitialMotionY) <= (((float)this.mTouchSlop))) {
                    return 1;
                }

                this.mIgnoreTap = true;
                break;
            }
            default: {
                break;
            }
        }

        return 1;
    }

    public void setBackgroundColor(@ColorInt int arg2) {
        super.setBackgroundColor(arg2);
        if(!this.mDrawFullUnderlineSet) {
            boolean v2 = (arg2 & 0xFF000000) == 0 ? true : false;
            this.mDrawFullUnderline = v2;
        }
    }

    public void setBackgroundDrawable(Drawable arg2) {
        super.setBackgroundDrawable(arg2);
        if(!this.mDrawFullUnderlineSet) {
            boolean v2 = arg2 == null ? true : false;
            this.mDrawFullUnderline = v2;
        }
    }

    public void setBackgroundResource(@DrawableRes int arg2) {
        super.setBackgroundResource(arg2);
        if(!this.mDrawFullUnderlineSet) {
            boolean v2 = arg2 == 0 ? true : false;
            this.mDrawFullUnderline = v2;
        }
    }

    public void setDrawFullUnderline(boolean arg1) {
        this.mDrawFullUnderline = arg1;
        this.mDrawFullUnderlineSet = true;
        this.invalidate();
    }

    public void setPadding(int arg2, int arg3, int arg4, int arg5) {
        if(arg5 < this.mMinPaddingBottom) {
            arg5 = this.mMinPaddingBottom;
        }

        super.setPadding(arg2, arg3, arg4, arg5);
    }

    public void setTabIndicatorColor(@ColorInt int arg2) {
        this.mIndicatorColor = arg2;
        this.mTabPaint.setColor(this.mIndicatorColor);
        this.invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int arg2) {
        this.setTabIndicatorColor(ContextCompat.getColor(this.getContext(), arg2));
    }

    public void setTextSpacing(int arg2) {
        if(arg2 < this.mMinTextSpacing) {
            arg2 = this.mMinTextSpacing;
        }

        super.setTextSpacing(arg2);
    }

    void updateTextPositions(int arg6, float arg7, boolean arg8) {
        Rect v0 = this.mTempRect;
        int v1 = this.getHeight();
        int v2 = this.mCurrText.getLeft() - this.mTabPadding;
        int v3 = this.mCurrText.getRight() + this.mTabPadding;
        int v4 = v1 - this.mIndicatorHeight;
        v0.set(v2, v4, v3, v1);
        super.updateTextPositions(arg6, arg7, arg8);
        this.mTabAlpha = ((int)(Math.abs(arg7 - 0.5f) * 2f * 255f));
        v0.union(this.mCurrText.getLeft() - this.mTabPadding, v4, this.mCurrText.getRight() + this.mTabPadding, v1);
        this.invalidate(v0);
    }
}

