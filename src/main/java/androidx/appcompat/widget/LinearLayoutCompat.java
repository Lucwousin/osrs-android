package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$styleable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LinearLayoutCompat extends ViewGroup {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface DividerMode {
    }

    public class LayoutParams extends ViewGroup$MarginLayoutParams {
        public int gravity;
        public float weight;

        public LayoutParams(int arg1, int arg2) {
            super(arg1, arg2);
            this.gravity = -1;
            this.weight = 0f;
        }

        public LayoutParams(Context arg3, AttributeSet arg4) {
            super(arg3, arg4);
            this.gravity = -1;
            TypedArray v3 = arg3.obtainStyledAttributes(arg4, R$styleable.LinearLayoutCompat_Layout);
            this.weight = v3.getFloat(R$styleable.LinearLayoutCompat_Layout_android_layout_weight, 0f);
            this.gravity = v3.getInt(R$styleable.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            v3.recycle();
        }

        public LayoutParams(ViewGroup$LayoutParams arg1) {
            super(arg1);
            this.gravity = -1;
        }

        public LayoutParams(int arg1, int arg2, float arg3) {
            super(arg1, arg2);
            this.gravity = -1;
            this.weight = arg3;
        }

        public LayoutParams(ViewGroup$MarginLayoutParams arg1) {
            super(arg1);
            this.gravity = -1;
        }

        public LayoutParams(LayoutParams arg2) {
            super(((ViewGroup$MarginLayoutParams)arg2));
            this.gravity = -1;
            this.weight = arg2.weight;
            this.gravity = arg2.gravity;
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface OrientationMode {
    }

    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    public LinearLayoutCompat(Context arg2) {
        this(arg2, null);
    }

    public LinearLayoutCompat(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, 0);
    }

    public LinearLayoutCompat(Context arg5, AttributeSet arg6, int arg7) {
        super(arg5, arg6, arg7);
        this.mBaselineAligned = true;
        int v1 = -1;
        this.mBaselineAlignedChildIndex = v1;
        this.mBaselineChildTop = 0;
        this.mGravity = 0x800033;
        TintTypedArray v5 = TintTypedArray.obtainStyledAttributes(arg5, arg6, R$styleable.LinearLayoutCompat, arg7, 0);
        int v6 = v5.getInt(R$styleable.LinearLayoutCompat_android_orientation, v1);
        if(v6 >= 0) {
            this.setOrientation(v6);
        }

        v6 = v5.getInt(R$styleable.LinearLayoutCompat_android_gravity, v1);
        if(v6 >= 0) {
            this.setGravity(v6);
        }

        boolean v6_1 = v5.getBoolean(R$styleable.LinearLayoutCompat_android_baselineAligned, true);
        if(!v6_1) {
            this.setBaselineAligned(v6_1);
        }

        this.mWeightSum = v5.getFloat(R$styleable.LinearLayoutCompat_android_weightSum, -1f);
        this.mBaselineAlignedChildIndex = v5.getInt(R$styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, v1);
        this.mUseLargestChild = v5.getBoolean(R$styleable.LinearLayoutCompat_measureWithLargestChild, false);
        this.setDividerDrawable(v5.getDrawable(R$styleable.LinearLayoutCompat_divider));
        this.mShowDividers = v5.getInt(R$styleable.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = v5.getDimensionPixelSize(R$styleable.LinearLayoutCompat_dividerPadding, 0);
        v5.recycle();
    }

    protected boolean checkLayoutParams(ViewGroup$LayoutParams arg1) {
        return arg1 instanceof LayoutParams;
    }

    void drawDividersHorizontal(Canvas arg7) {
        int v0 = this.getVirtualChildCount();
        boolean v1 = ViewUtils.isLayoutRtl(((View)this));
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            View v3 = this.getVirtualChildAt(v2);
            if(v3 != null && v3.getVisibility() != 8 && (this.hasDividerBeforeChildAt(v2))) {
                ViewGroup$LayoutParams v4 = v3.getLayoutParams();
                int v3_1 = v1 ? v3.getRight() + ((LayoutParams)v4).rightMargin : v3.getLeft() - ((LayoutParams)v4).leftMargin - this.mDividerWidth;
                this.drawVerticalDivider(arg7, v3_1);
            }
        }

        if(this.hasDividerBeforeChildAt(v0)) {
            View v0_1 = this.getVirtualChildAt(v0 - 1);
            if(v0_1 != null) {
                ViewGroup$LayoutParams v2_1 = v0_1.getLayoutParams();
                v0 = v1 ? v0_1.getLeft() - ((LayoutParams)v2_1).leftMargin - this.mDividerWidth : v0_1.getRight() + ((LayoutParams)v2_1).rightMargin;
            }
            else if(v1) {
                v0 = this.getPaddingLeft();
            }
            else {
                v0 = this.getWidth() - this.getPaddingRight() - this.mDividerWidth;
            }

            this.drawVerticalDivider(arg7, v0);
        }
    }

    void drawDividersVertical(Canvas arg6) {
        int v0 = this.getVirtualChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            View v2 = this.getVirtualChildAt(v1);
            if(v2 != null && v2.getVisibility() != 8 && (this.hasDividerBeforeChildAt(v1))) {
                this.drawHorizontalDivider(arg6, v2.getTop() - v2.getLayoutParams().topMargin - this.mDividerHeight);
            }
        }

        if(this.hasDividerBeforeChildAt(v0)) {
            View v0_1 = this.getVirtualChildAt(v0 - 1);
            v0 = v0_1 == null ? this.getHeight() - this.getPaddingBottom() - this.mDividerHeight : v0_1.getBottom() + v0_1.getLayoutParams().bottomMargin;
            this.drawHorizontalDivider(arg6, v0);
        }
    }

    void drawHorizontalDivider(Canvas arg5, int arg6) {
        this.mDivider.setBounds(this.getPaddingLeft() + this.mDividerPadding, arg6, this.getWidth() - this.getPaddingRight() - this.mDividerPadding, this.mDividerHeight + arg6);
        this.mDivider.draw(arg5);
    }

    void drawVerticalDivider(Canvas arg6, int arg7) {
        this.mDivider.setBounds(arg7, this.getPaddingTop() + this.mDividerPadding, this.mDividerWidth + arg7, this.getHeight() - this.getPaddingBottom() - this.mDividerPadding);
        this.mDivider.draw(arg6);
    }

    private void forceUniformHeight(int arg11, int arg12) {
        int v0 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0x40000000);
        int v1;
        for(v1 = 0; v1 < arg11; ++v1) {
            View v3 = this.getVirtualChildAt(v1);
            if(v3.getVisibility() != 8) {
                ViewGroup$LayoutParams v8 = v3.getLayoutParams();
                if(((LayoutParams)v8).height == -1) {
                    int v9 = ((LayoutParams)v8).width;
                    ((LayoutParams)v8).width = v3.getMeasuredWidth();
                    this.measureChildWithMargins(v3, arg12, 0, v0, 0);
                    ((LayoutParams)v8).width = v9;
                }
            }
        }
    }

    private void forceUniformWidth(int arg11, int arg12) {
        int v0 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0x40000000);
        int v1;
        for(v1 = 0; v1 < arg11; ++v1) {
            View v3 = this.getVirtualChildAt(v1);
            if(v3.getVisibility() != 8) {
                ViewGroup$LayoutParams v8 = v3.getLayoutParams();
                if(((LayoutParams)v8).width == -1) {
                    int v9 = ((LayoutParams)v8).height;
                    ((LayoutParams)v8).height = v3.getMeasuredHeight();
                    this.measureChildWithMargins(v3, v0, 0, arg12, 0);
                    ((LayoutParams)v8).height = v9;
                }
            }
        }
    }

    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        int v1 = -2;
        if(this.mOrientation == 0) {
            return new LayoutParams(v1, v1);
        }

        if(this.mOrientation == 1) {
            return new LayoutParams(-1, v1);
        }

        return null;
    }

    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet arg1) {
        return this.generateLayoutParams(arg1);
    }

    public LayoutParams generateLayoutParams(AttributeSet arg3) {
        return new LayoutParams(this.getContext(), arg3);
    }

    protected ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg1) {
        return this.generateLayoutParams(arg1);
    }

    protected LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg2) {
        return new LayoutParams(arg2);
    }

    public int getBaseline() {
        if(this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }

        if(this.getChildCount() > this.mBaselineAlignedChildIndex) {
            View v0 = this.getChildAt(this.mBaselineAlignedChildIndex);
            int v1 = v0.getBaseline();
            int v2 = -1;
            if(v1 == v2) {
                if(this.mBaselineAlignedChildIndex == 0) {
                    return v2;
                }

                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn\'t know how to get its baseline.");
            }

            v2 = this.mBaselineChildTop;
            if(this.mOrientation == 1) {
                int v3 = this.mGravity & 0x70;
                if(v3 != 0x30) {
                    if(v3 == 16) {
                        v2 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.mTotalLength) / 2;
                    }
                    else if(v3 != 80) {
                    }
                    else {
                        v2 = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.mTotalLength;
                    }
                }
            }

            return v2 + v0.getLayoutParams().topMargin + v1;
        }

        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    int getChildrenSkipCount(View arg1, int arg2) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    int getLocationOffset(View arg1) {
        return 0;
    }

    int getNextLocationOffset(View arg1) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    View getVirtualChildAt(int arg1) {
        return this.getChildAt(arg1);
    }

    int getVirtualChildCount() {
        return this.getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    @RestrictTo(value={Scope.LIBRARY}) protected boolean hasDividerBeforeChildAt(int arg5) {
        boolean v0 = false;
        if(arg5 == 0) {
            if((this.mShowDividers & 1) != 0) {
                v0 = true;
            }

            return v0;
        }

        if(arg5 == this.getChildCount()) {
            if((this.mShowDividers & 4) != 0) {
                v0 = true;
            }

            return v0;
        }

        if((this.mShowDividers & 2) != 0) {
            --arg5;
            while(arg5 >= 0) {
                if(this.getChildAt(arg5).getVisibility() != 8) {
                    v0 = true;
                }
                else {
                    --arg5;
                    continue;
                }

                return v0;
            }

            return v0;
        }

        return 0;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    void layoutHorizontal(int arg28, int arg29, int arg30, int arg31) {
        int v26;
        int v24;
        int v23;
        int v22;
        int v17;
        int v16;
        int v0;
        LinearLayoutCompat v6 = this;
        boolean v2 = ViewUtils.isLayoutRtl(((View)this));
        int v7 = this.getPaddingTop();
        int v3 = arg31 - arg29;
        int v8 = v3 - this.getPaddingBottom();
        int v9 = v3 - v7 - this.getPaddingBottom();
        int v10 = this.getVirtualChildCount();
        v3 = v6.mGravity & 0x800007;
        int v11 = v6.mGravity & 0x70;
        boolean v12 = v6.mBaselineAligned;
        int[] v13 = v6.mMaxAscent;
        int[] v14 = v6.mMaxDescent;
        v3 = GravityCompat.getAbsoluteGravity(v3, ViewCompat.getLayoutDirection(((View)this)));
        int v15 = 2;
        if(v3 == 1) {
            v0 = (arg30 - arg28 - v6.mTotalLength) / v15 + this.getPaddingLeft();
        }
        else if(v3 != 5) {
            v0 = this.getPaddingLeft();
        }
        else {
            v0 = this.getPaddingLeft() + arg30 - arg28 - v6.mTotalLength;
        }

        if(v2) {
            v16 = v10 - 1;
            v17 = -1;
        }
        else {
            v16 = 0;
            v17 = 1;
        }

        v3 = 0;
        while(v3 < v10) {
            int v2_1 = v16 + v17 * v3;
            View v1 = v6.getVirtualChildAt(v2_1);
            if(v1 == null) {
                v0 += v6.measureNullChild(v2_1);
                goto label_55;
            }
            else if(v1.getVisibility() != 8) {
                v15 = v1.getMeasuredWidth();
                int v5 = v1.getMeasuredHeight();
                ViewGroup$LayoutParams v4 = v1.getLayoutParams();
                if(v12) {
                    v22 = v3;
                    v23 = v10;
                    if(((LayoutParams)v4).height != -1) {
                        v3 = v1.getBaseline();
                    }
                    else {
                        goto label_78;
                    }
                }
                else {
                    v22 = v3;
                    v23 = v10;
                label_78:
                    v3 = -1;
                }

                v10 = ((LayoutParams)v4).gravity;
                if(v10 < 0) {
                    v10 = v11;
                }

                v10 &= 0x70;
                v24 = v11;
                if(v10 == 16) {
                    v3 = (v9 - v5) / 2 + v7 + ((LayoutParams)v4).topMargin - ((LayoutParams)v4).bottomMargin;
                }
                else if(v10 == 0x30) {
                    v10 = ((LayoutParams)v4).topMargin + v7;
                    if(v3 != -1) {
                        v10 += v13[1] - v3;
                    }

                    v3 = v10;
                }
                else if(v10 != 80) {
                    v3 = v7;
                }
                else {
                    v10 = v8 - v5 - ((LayoutParams)v4).bottomMargin;
                    if(v3 != -1) {
                        v10 -= v14[2] - (v1.getMeasuredHeight() - v3);
                    }

                    v3 = v10;
                }

                if(v6.hasDividerBeforeChildAt(v2_1)) {
                    v0 += v6.mDividerWidth;
                }

                v10 = ((LayoutParams)v4).leftMargin + v0;
                v26 = v7;
                this.setChildFrame(v1, v10 + v6.getLocationOffset(v1), v3, v15, v5);
                v10 += v15 + v4.rightMargin + v6.getNextLocationOffset(v1);
                v3 = v22 + v6.getChildrenSkipCount(v1, v2_1);
                v0 = v10;
            }
            else {
            label_55:
                v26 = v7;
                v23 = v10;
                v24 = v11;
            }

            ++v3;
            v10 = v23;
            v11 = v24;
            v7 = v26;
        }
    }

    void layoutVertical(int arg18, int arg19, int arg20, int arg21) {
        int v0;
        LinearLayoutCompat v6 = this;
        int v7 = this.getPaddingLeft();
        int v2 = arg20 - arg18;
        int v8 = v2 - this.getPaddingRight();
        int v9 = v2 - v7 - this.getPaddingRight();
        int v10 = this.getVirtualChildCount();
        v2 = v6.mGravity & 0x70;
        int v11 = v6.mGravity & 0x800007;
        if(v2 == 16) {
            v0 = (arg21 - arg19 - v6.mTotalLength) / 2 + this.getPaddingTop();
        }
        else if(v2 != 80) {
            v0 = this.getPaddingTop();
        }
        else {
            v0 = this.getPaddingTop() + arg21 - arg19 - v6.mTotalLength;
        }

        int v12;
        for(v12 = 0; v12 < v10; ++v12) {
            View v13 = v6.getVirtualChildAt(v12);
            if(v13 == null) {
                v0 += v6.measureNullChild(v12);
            }
            else if(v13.getVisibility() != 8) {
                int v4 = v13.getMeasuredWidth();
                int v15 = v13.getMeasuredHeight();
                ViewGroup$LayoutParams v5 = v13.getLayoutParams();
                int v1 = ((LayoutParams)v5).gravity;
                if(v1 < 0) {
                    v1 = v11;
                }

                v1 = GravityCompat.getAbsoluteGravity(v1, ViewCompat.getLayoutDirection(((View)this))) & 7;
                if(v1 == 1) {
                    v1 = (v9 - v4) / 2 + v7 + ((LayoutParams)v5).leftMargin - ((LayoutParams)v5).rightMargin;
                }
                else if(v1 != 5) {
                    v1 = ((LayoutParams)v5).leftMargin + v7;
                }
                else {
                    v1 = v8 - v4 - ((LayoutParams)v5).rightMargin;
                }

                v2 = v1;
                if(v6.hasDividerBeforeChildAt(v12)) {
                    v0 += v6.mDividerHeight;
                }

                int v16 = v0 + ((LayoutParams)v5).topMargin;
                this.setChildFrame(v13, v2, v16 + v6.getLocationOffset(v13), v4, v15);
                v16 += v15 + v5.bottomMargin + v6.getNextLocationOffset(v13);
                v12 += v6.getChildrenSkipCount(v13, v12);
                v0 = v16;
            }
        }
    }

    void measureChildBeforeLayout(View arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.measureChildWithMargins(arg7, arg9, arg10, arg11, arg12);
    }

    void measureHorizontal(int arg45, int arg46) {
        float v43;
        int v42;
        int v39;
        ViewGroup$LayoutParams v5_1;
        int v3_2;
        int v38;
        int v10_1;
        int v9;
        int v6_2;
        int v4_1;
        View v3_1;
        int v34;
        int v0_1;
        boolean v36;
        boolean v32;
        int v5;
        int[] v29;
        LinearLayoutCompat v7 = this;
        int v8 = arg45;
        v7.mTotalLength = 0;
        int v11 = this.getVirtualChildCount();
        int v12 = View$MeasureSpec.getMode(arg45);
        int v13 = View$MeasureSpec.getMode(arg46);
        int v14 = 4;
        if(v7.mMaxAscent == null || v7.mMaxDescent == null) {
            v7.mMaxAscent = new int[v14];
            v7.mMaxDescent = new int[v14];
        }

        int[] v15 = v7.mMaxAscent;
        int[] v6 = v7.mMaxDescent;
        int v16 = 3;
        v15[v16] = -1;
        int v17 = 2;
        v15[v17] = -1;
        v15[1] = -1;
        v15[0] = -1;
        v6[v16] = -1;
        v6[v17] = -1;
        v6[1] = -1;
        v6[0] = -1;
        boolean v4 = v7.mBaselineAligned;
        boolean v3 = v7.mUseLargestChild;
        int v2 = 0x40000000;
        int v19 = v12 == v2 ? 1 : 0;
        float v0 = 0f;
        int v1 = 0;
        v14 = 0;
        int v21 = 0;
        int v22 = 0;
        int v23 = 0;
        int v24 = 0;
        int v26 = 0;
        int v27 = 1;
        int v28 = 0;
        while(true) {
            v29 = v6;
            v5 = 8;
            if(v1 >= v11) {
                break;
            }

            View v6_1 = v7.getVirtualChildAt(v1);
            if(v6_1 == null) {
                v7.mTotalLength += v7.measureNullChild(v1);
                goto label_58;
            }
            else if(v6_1.getVisibility() == v5) {
                v1 += v7.getChildrenSkipCount(v6_1, v1);
            label_58:
                v32 = v3;
                v36 = v4;
            }
            else {
                if(v7.hasDividerBeforeChildAt(v1)) {
                    v7.mTotalLength += v7.mDividerWidth;
                }

                ViewGroup$LayoutParams v10 = v6_1.getLayoutParams();
                float v31 = v0 + ((LayoutParams)v10).weight;
                if(v12 != v2 || ((LayoutParams)v10).width != 0 || ((LayoutParams)v10).weight <= 0f) {
                    if(((LayoutParams)v10).width != 0 || ((LayoutParams)v10).weight <= 0f) {
                        v2 = 0x80000000;
                    }
                    else {
                        ((LayoutParams)v10).width = -2;
                        v2 = 0;
                    }

                    int v30 = v31 == 0f ? v7.mTotalLength : 0;
                    v34 = v1;
                    v32 = v3;
                    v36 = v4;
                    View v37 = v6_1;
                    this.measureChildBeforeLayout(v6_1, v34, arg45, v30, arg46, 0);
                    v0_1 = v2;
                    if(v0_1 != 0x80000000) {
                        ((LayoutParams)v10).width = v0_1;
                    }

                    v0_1 = v37.getMeasuredWidth();
                    if(v19 != 0) {
                        v3_1 = v37;
                        v7.mTotalLength += ((LayoutParams)v10).leftMargin + v0_1 + ((LayoutParams)v10).rightMargin + v7.getNextLocationOffset(v3_1);
                    }
                    else {
                        v3_1 = v37;
                        v7.mTotalLength = Math.max(v7.mTotalLength, v7.mTotalLength + v0_1 + ((LayoutParams)v10).leftMargin + ((LayoutParams)v10).rightMargin + v7.getNextLocationOffset(v3_1));
                    }

                    if(v32) {
                        v14 = Math.max(v0_1, v14);
                    }

                label_175:
                    v1 = 0x40000000;
                }
                else {
                    if(v19 != 0) {
                        v7.mTotalLength += ((LayoutParams)v10).leftMargin + ((LayoutParams)v10).rightMargin;
                    }
                    else {
                        v7.mTotalLength = Math.max(v7.mTotalLength, ((LayoutParams)v10).leftMargin + v7.mTotalLength + ((LayoutParams)v10).rightMargin);
                    }

                    if(v4) {
                        v2 = View$MeasureSpec.makeMeasureSpec(0, 0);
                        v6_1.measure(v2, v2);
                        v34 = v1;
                        v32 = v3;
                        v36 = v4;
                        v3_1 = v6_1;
                        goto label_175;
                    }

                    v34 = v1;
                    v32 = v3;
                    v36 = v4;
                    v3_1 = v6_1;
                    v1 = 0x40000000;
                    v22 = 1;
                }

                if(v13 == v1 || ((LayoutParams)v10).height != -1) {
                    v0_1 = 0;
                }
                else {
                    v0_1 = 1;
                    v28 = 1;
                }

                v2 = ((LayoutParams)v10).topMargin + ((LayoutParams)v10).bottomMargin;
                v4_1 = v3_1.getMeasuredHeight() + v2;
                v5 = View.combineMeasuredStates(v26, v3_1.getMeasuredState());
                if(v36) {
                    v6_2 = v3_1.getBaseline();
                    if(v6_2 != -1) {
                        v9 = ((LayoutParams)v10).gravity < 0 ? v7.mGravity : ((LayoutParams)v10).gravity;
                        v9 = ((v9 & 0x70) >> 4 & -2) >> 1;
                        v15[v9] = Math.max(v15[v9], v6_2);
                        v29[v9] = Math.max(v29[v9], v4_1 - v6_2);
                    }
                }

                v1 = Math.max(v21, v4_1);
                v6_2 = v27 == 0 || ((LayoutParams)v10).height != -1 ? 0 : 1;
                if(((LayoutParams)v10).weight > 0f) {
                    if(v0_1 == 0) {
                        v2 = v4_1;
                    }

                    v10_1 = v24;
                    v24 = Math.max(v10_1, v2);
                }
                else {
                    v10_1 = v24;
                    if(v0_1 != 0) {
                        v4_1 = v2;
                    }

                    v23 = Math.max(v23, v4_1);
                    v24 = v10_1;
                }

                v10_1 = v34;
                v21 = v1;
                v26 = v5;
                v27 = v6_2;
                v1 = v7.getChildrenSkipCount(v3_1, v10_1) + v10_1;
                v0 = v31;
            }

            ++v1;
            v6 = v29;
            v3 = v32;
            v4 = v36;
            v2 = 0x40000000;
        }

        v32 = v3;
        v36 = v4;
        v1 = v21;
        v2 = v23;
        v10_1 = v24;
        v6_2 = v26;
        if(v7.mTotalLength > 0 && (v7.hasDividerBeforeChildAt(v11))) {
            v7.mTotalLength += v7.mDividerWidth;
        }

        v4_1 = -1;
        if(v15[1] != v4_1 || v15[0] != v4_1 || v15[v17] != v4_1 || v15[v16] != v4_1) {
            v38 = v6_2;
            v1 = Math.max(v1, Math.max(v15[v16], Math.max(v15[0], Math.max(v15[1], v15[v17]))) + Math.max(v29[v16], Math.max(v29[0], Math.max(v29[1], v29[v17]))));
        }
        else {
            v38 = v6_2;
        }

        if((v32) && (v12 == 0x80000000 || v12 == 0)) {
            v7.mTotalLength = 0;
            v3_2 = 0;
            while(v3_2 < v11) {
                View v4_2 = v7.getVirtualChildAt(v3_2);
                if(v4_2 == null) {
                    v7.mTotalLength += v7.measureNullChild(v3_2);
                    goto label_324;
                }
                else if(v4_2.getVisibility() == 8) {
                    v3_2 += v7.getChildrenSkipCount(v4_2, v3_2);
                    goto label_324;
                }
                else {
                    v5_1 = v4_2.getLayoutParams();
                    if(v19 != 0) {
                        v7.mTotalLength += ((LayoutParams)v5_1).leftMargin + v14 + ((LayoutParams)v5_1).rightMargin + v7.getNextLocationOffset(v4_2);
                    label_324:
                        v39 = v1;
                    }
                    else {
                        v39 = v1;
                        v7.mTotalLength = Math.max(v7.mTotalLength, v7.mTotalLength + v14 + ((LayoutParams)v5_1).leftMargin + ((LayoutParams)v5_1).rightMargin + v7.getNextLocationOffset(v4_2));
                    }
                }

                ++v3_2;
                v1 = v39;
            }
        }

        v39 = v1;
        v7.mTotalLength += this.getPaddingLeft() + this.getPaddingRight();
        v1 = View.resolveSizeAndState(Math.max(v7.mTotalLength, this.getSuggestedMinimumWidth()), v8, 0);
        v3_2 = (0xFFFFFF & v1) - v7.mTotalLength;
        if(v22 == 0) {
            if(v3_2 != 0 && v0 > 0f) {
                goto label_397;
            }

            v0_1 = Math.max(v2, v10_1);
            if((v32) && v12 != 0x40000000) {
                for(v2 = 0; v2 < v11; ++v2) {
                    v3_1 = v7.getVirtualChildAt(v2);
                    if(v3_1 != null) {
                        if(v3_1.getVisibility() == 8) {
                        }
                        else if(v3_1.getLayoutParams().weight > 0f) {
                            v3_1.measure(View$MeasureSpec.makeMeasureSpec(v14, 0x40000000), View$MeasureSpec.makeMeasureSpec(v3_1.getMeasuredHeight(), 0x40000000));
                        }
                    }
                }
            }

            v42 = v11;
            v3_2 = arg46;
        }
        else {
        label_397:
            if(v7.mWeightSum > 0f) {
                v0 = v7.mWeightSum;
            }

            v15[v16] = -1;
            v15[v17] = -1;
            v15[1] = -1;
            v15[0] = -1;
            v29[v16] = -1;
            v29[v17] = -1;
            v29[1] = -1;
            v29[0] = -1;
            v7.mTotalLength = 0;
            v10_1 = v2;
            v9 = v38;
            v6_2 = -1;
            float v2_1 = v0;
            v0_1 = 0;
            while(v0_1 < v11) {
                View v14_1 = v7.getVirtualChildAt(v0_1);
                if(v14_1 == null || v14_1.getVisibility() == 8) {
                    v4_1 = v3_2;
                    v42 = v11;
                }
                else {
                    v5_1 = v14_1.getLayoutParams();
                    float v4_3 = ((LayoutParams)v5_1).weight;
                    if(v4_3 > 0f) {
                        v8 = ((int)((((float)v3_2)) * v4_3 / v2_1));
                        float v40 = v2_1 - v4_3;
                        int v41 = v3_2 - v8;
                        v42 = v11;
                        v2 = LinearLayoutCompat.getChildMeasureSpec(arg46, this.getPaddingTop() + this.getPaddingBottom() + ((LayoutParams)v5_1).topMargin + ((LayoutParams)v5_1).bottomMargin, ((LayoutParams)v5_1).height);
                        if(((LayoutParams)v5_1).width == 0) {
                            v4_1 = 0x40000000;
                            if(v12 != v4_1) {
                                goto label_458;
                            }
                            else {
                                if(v8 > 0) {
                                }
                                else {
                                    v8 = 0;
                                }

                                v14_1.measure(View$MeasureSpec.makeMeasureSpec(v8, v4_1), v2);
                            }
                        }
                        else {
                            v4_1 = 0x40000000;
                        label_458:
                            v8 = v14_1.getMeasuredWidth() + v8;
                            if(v8 < 0) {
                                v8 = 0;
                            }

                            v14_1.measure(View$MeasureSpec.makeMeasureSpec(v8, v4_1), v2);
                        }

                        v9 = View.combineMeasuredStates(v9, v14_1.getMeasuredState() & 0xFF000000);
                        v2_1 = v40;
                        v4_1 = v41;
                    }
                    else {
                        v4_1 = v3_2;
                        v42 = v11;
                    }

                    if(v19 != 0) {
                        v7.mTotalLength += v14_1.getMeasuredWidth() + ((LayoutParams)v5_1).leftMargin + ((LayoutParams)v5_1).rightMargin + v7.getNextLocationOffset(v14_1);
                        v43 = v2_1;
                    }
                    else {
                        v43 = v2_1;
                        v7.mTotalLength = Math.max(v7.mTotalLength, v14_1.getMeasuredWidth() + v7.mTotalLength + ((LayoutParams)v5_1).leftMargin + ((LayoutParams)v5_1).rightMargin + v7.getNextLocationOffset(v14_1));
                    }

                    v2 = 0x40000000;
                    v2 = v13 == v2 || ((LayoutParams)v5_1).height != -1 ? 0 : 1;
                    v8 = ((LayoutParams)v5_1).topMargin + ((LayoutParams)v5_1).bottomMargin;
                    v11 = v14_1.getMeasuredHeight() + v8;
                    v6_2 = Math.max(v6_2, v11);
                    if(v2 != 0) {
                    }
                    else {
                        v8 = v11;
                    }

                    v2 = Math.max(v10_1, v8);
                    if(v27 != 0) {
                        v10_1 = -1;
                        if(((LayoutParams)v5_1).height == v10_1) {
                            v8 = 1;
                        }
                        else {
                            goto label_526;
                        }
                    }
                    else {
                        v10_1 = -1;
                    label_526:
                        v8 = 0;
                    }

                    if(v36) {
                        v14 = v14_1.getBaseline();
                        if(v14 != v10_1) {
                            v5 = ((LayoutParams)v5_1).gravity < 0 ? v7.mGravity : ((LayoutParams)v5_1).gravity;
                            v5 = ((v5 & 0x70) >> 4 & -2) >> 1;
                            v15[v5] = Math.max(v15[v5], v14);
                            v29[v5] = Math.max(v29[v5], v11 - v14);
                        }
                    }

                    v10_1 = v2;
                    v27 = v8;
                    v2_1 = v43;
                }

                ++v0_1;
                v3_2 = v4_1;
                v11 = v42;
            }

            v42 = v11;
            v3_2 = arg46;
            v7.mTotalLength += this.getPaddingLeft() + this.getPaddingRight();
            v2 = -1;
            v0_1 = v15[1] != v2 || v15[0] != v2 || v15[v17] != v2 || v15[v16] != v2 ? Math.max(v6_2, Math.max(v15[v16], Math.max(v15[0], Math.max(v15[1], v15[v17]))) + Math.max(v29[v16], Math.max(v29[0], Math.max(v29[1], v29[v17])))) : v6_2;
            v39 = v0_1;
            v38 = v9;
            v0_1 = v10_1;
        }

        if(v27 == 0 && v13 != 0x40000000) {
            v39 = v0_1;
        }

        v7.setMeasuredDimension(v1 | v38 & 0xFF000000, View.resolveSizeAndState(Math.max(v39 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), v3_2, v38 << 16));
        if(v28 != 0) {
            v7.forceUniformHeight(v42, arg45);
        }
    }

    int measureNullChild(int arg1) {
        return 0;
    }

    void measureVertical(int arg41, int arg42) {
        int v15_1;
        float v10_2;
        int v38;
        int v39;
        int v29;
        int v8;
        int v33;
        View v3_1;
        int v0_1;
        int v9;
        int v31;
        int v32;
        int v22;
        int v10;
        LinearLayoutCompat v7 = this;
        v7.mTotalLength = 0;
        int v11 = this.getVirtualChildCount();
        int v12 = View$MeasureSpec.getMode(arg41);
        int v13 = View$MeasureSpec.getMode(arg42);
        int v14 = v7.mBaselineAlignedChildIndex;
        boolean v15 = v7.mUseLargestChild;
        float v0 = 0f;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0;
        int v18 = 0;
        int v19 = 1;
        int v20 = 0;
        while(true) {
            v10 = 8;
            v22 = v4;
            if(v6 >= v11) {
                break;
            }

            View v4_1 = v7.getVirtualChildAt(v6);
            if(v4_1 == null) {
                v7.mTotalLength += v7.measureNullChild(v6);
                v32 = v11;
                v31 = v13;
                v4 = v22;
            }
            else {
                int v24 = v1;
                if(v4_1.getVisibility() == v10) {
                    v6 += v7.getChildrenSkipCount(v4_1, v6);
                    v32 = v11;
                    v31 = v13;
                    v4 = v22;
                    v1 = v24;
                }
                else {
                    if(v7.hasDividerBeforeChildAt(v6)) {
                        v7.mTotalLength += v7.mDividerHeight;
                    }

                    ViewGroup$LayoutParams v10_1 = v4_1.getLayoutParams();
                    float v25 = v0 + ((LayoutParams)v10_1).weight;
                    if(v13 != 0x40000000 || ((LayoutParams)v10_1).height != 0 || ((LayoutParams)v10_1).weight <= 0f) {
                        int v26 = v2;
                        if(((LayoutParams)v10_1).height != 0 || ((LayoutParams)v10_1).weight <= 0f) {
                            v2 = 0x80000000;
                        }
                        else {
                            ((LayoutParams)v10_1).height = -2;
                            v2 = 0;
                        }

                        int v27 = v25 == 0f ? v7.mTotalLength : 0;
                        v8 = v24;
                        v29 = v26;
                        v9 = v3;
                        View v30 = v4_1;
                        v32 = v11;
                        v31 = v13;
                        v13 = v22;
                        v33 = v5;
                        v11 = v6;
                        this.measureChildBeforeLayout(v4_1, v6, arg41, 0, arg42, v27);
                        v0_1 = v2;
                        if(v0_1 != 0x80000000) {
                            ((LayoutParams)v10_1).height = v0_1;
                        }

                        v0_1 = v30.getMeasuredHeight();
                        v3_1 = v30;
                        v7.mTotalLength = Math.max(v7.mTotalLength, v7.mTotalLength + v0_1 + ((LayoutParams)v10_1).topMargin + ((LayoutParams)v10_1).bottomMargin + v7.getNextLocationOffset(v3_1));
                        if(v15) {
                            v0_1 = Math.max(v0_1, v9);
                            goto label_136;
                        }

                        v0_1 = v9;
                    }
                    else {
                        v7.mTotalLength = Math.max(v7.mTotalLength, ((LayoutParams)v10_1).topMargin + v7.mTotalLength + ((LayoutParams)v10_1).bottomMargin);
                        v0_1 = v3;
                        v3_1 = v4_1;
                        v33 = v5;
                        v32 = v11;
                        v31 = v13;
                        v13 = v22;
                        v8 = v24;
                        v29 = v2;
                        v18 = 1;
                        v11 = v6;
                    }

                label_136:
                    if(v14 >= 0 && v14 == v11 + 1) {
                        v7.mBaselineChildTop = v7.mTotalLength;
                    }

                    if(v11 < v14) {
                        if(((LayoutParams)v10_1).weight <= 0f) {
                        }
                        else {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won\'t work.  Either remove the weight, or don\'t set mBaselineAlignedChildIndex.");
                        }
                    }

                    if(v12 == 0x40000000 || ((LayoutParams)v10_1).width != -1) {
                        v1 = 0;
                    }
                    else {
                        v1 = 1;
                        v20 = 1;
                    }

                    v2 = ((LayoutParams)v10_1).leftMargin + ((LayoutParams)v10_1).rightMargin;
                    v4 = v3_1.getMeasuredWidth() + v2;
                    v5 = Math.max(v29, v4);
                    v6 = View.combineMeasuredStates(v8, v3_1.getMeasuredState());
                    v8 = v19 == 0 || ((LayoutParams)v10_1).width != -1 ? 0 : 1;
                    if(((LayoutParams)v10_1).weight > 0f) {
                        if(v1 != 0) {
                        }
                        else {
                            v2 = v4;
                        }

                        v13 = Math.max(v13, v2);
                        v1 = v33;
                    }
                    else {
                        if(v1 == 0) {
                            v2 = v4;
                        }

                        v1 = v33;
                        v1 = Math.max(v1, v2);
                    }

                    v2 = v7.getChildrenSkipCount(v3_1, v11) + v11;
                    v3 = v0_1;
                    v19 = v8;
                    v4 = v13;
                    v0 = v25;
                    v39 = v5;
                    v5 = v1;
                    v1 = v6;
                    v6 = v2;
                    v2 = v39;
                }
            }

            ++v6;
            v13 = v31;
            v11 = v32;
        }

        v8 = v1;
        v9 = v3;
        v1 = v5;
        v32 = v11;
        v31 = v13;
        v13 = v22;
        v5 = v2;
        if(v7.mTotalLength > 0) {
            v2 = v32;
            if(v7.hasDividerBeforeChildAt(v2)) {
                v7.mTotalLength += v7.mDividerHeight;
            }
        }
        else {
            v2 = v32;
        }

        if(v15) {
            v3 = v31;
            if(v3 != 0x80000000 && v3 != 0) {
                goto label_260;
            }

            v7.mTotalLength = 0;
            v4 = 0;
            goto label_232;
        }
        else {
            v3 = v31;
            goto label_260;
        label_232:
            while(v4 < v2) {
                View v6_1 = v7.getVirtualChildAt(v4);
                if(v6_1 == null) {
                    v7.mTotalLength += v7.measureNullChild(v4);
                }
                else if(v6_1.getVisibility() == v10) {
                    v4 += v7.getChildrenSkipCount(v6_1, v4);
                }
                else {
                    ViewGroup$LayoutParams v11_1 = v6_1.getLayoutParams();
                    v7.mTotalLength = Math.max(v7.mTotalLength, v7.mTotalLength + v9 + ((LayoutParams)v11_1).topMargin + ((LayoutParams)v11_1).bottomMargin + v7.getNextLocationOffset(v6_1));
                }

                ++v4;
                v10 = 8;
            }
        }

    label_260:
        v7.mTotalLength += this.getPaddingTop() + this.getPaddingBottom();
        v10 = v9;
        v6 = arg42;
        v4 = View.resolveSizeAndState(Math.max(v7.mTotalLength, this.getSuggestedMinimumHeight()), v6, 0);
        v9 = (0xFFFFFF & v4) - v7.mTotalLength;
        if(v18 == 0) {
            if(v9 != 0 && v0 > 0f) {
                goto label_306;
            }

            v0_1 = Math.max(v1, v13);
            if((v15) && v3 != 0x40000000) {
                for(v1 = 0; v1 < v2; ++v1) {
                    v3_1 = v7.getVirtualChildAt(v1);
                    if(v3_1 != null) {
                        if(v3_1.getVisibility() == 8) {
                        }
                        else if(v3_1.getLayoutParams().weight > 0f) {
                            v3_1.measure(View$MeasureSpec.makeMeasureSpec(v3_1.getMeasuredWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(v10, 0x40000000));
                        }
                    }
                }
            }

            v1 = v8;
            v11 = arg41;
        }
        else {
        label_306:
            if(v7.mWeightSum > 0f) {
                v0 = v7.mWeightSum;
            }

            v7.mTotalLength = 0;
            float v11_2 = v0;
            v0_1 = 0;
            v39 = v8;
            v8 = v1;
            v1 = v39;
            while(v0_1 < v2) {
                View v13_1 = v7.getVirtualChildAt(v0_1);
                if(v13_1.getVisibility() == 8) {
                    v38 = v3;
                    v10_2 = v11_2;
                }
                else {
                    ViewGroup$LayoutParams v14_1 = v13_1.getLayoutParams();
                    v10_2 = ((LayoutParams)v14_1).weight;
                    if(v10_2 > 0f) {
                        v15_1 = ((int)((((float)v9)) * v10_2 / v11_2));
                        int v34 = v9 - v15_1;
                        float v35 = v11_2 - v10_2;
                        v9 = LinearLayoutCompat.getChildMeasureSpec(arg41, this.getPaddingLeft() + this.getPaddingRight() + ((LayoutParams)v14_1).leftMargin + ((LayoutParams)v14_1).rightMargin, ((LayoutParams)v14_1).width);
                        if(((LayoutParams)v14_1).height == 0) {
                            v10 = 0x40000000;
                            if(v3 != v10) {
                                goto label_358;
                            }
                            else {
                                if(v15_1 > 0) {
                                }
                                else {
                                    v15_1 = 0;
                                }

                                v13_1.measure(v9, View$MeasureSpec.makeMeasureSpec(v15_1, v10));
                            }
                        }
                        else {
                            v10 = 0x40000000;
                        label_358:
                            v15_1 = v13_1.getMeasuredHeight() + v15_1;
                            if(v15_1 < 0) {
                                v15_1 = 0;
                            }

                            v13_1.measure(v9, View$MeasureSpec.makeMeasureSpec(v15_1, v10));
                        }

                        v1 = View.combineMeasuredStates(v1, v13_1.getMeasuredState() & 0xFFFFFF00);
                        v9 = v34;
                        v10_2 = v35;
                    }
                    else {
                        v10_2 = v11_2;
                    }

                    int v36 = v1;
                    v15_1 = ((LayoutParams)v14_1).leftMargin + ((LayoutParams)v14_1).rightMargin;
                    v1 = v13_1.getMeasuredWidth() + v15_1;
                    v5 = Math.max(v5, v1);
                    int v37 = v1;
                    if(v12 != 0x40000000) {
                        v38 = v3;
                        v3 = -1;
                        if(((LayoutParams)v14_1).width == v3) {
                            v1 = 1;
                        }
                        else {
                            goto label_390;
                        }
                    }
                    else {
                        v38 = v3;
                        v3 = -1;
                    label_390:
                        v1 = 0;
                    }

                    if(v1 != 0) {
                    }
                    else {
                        v15_1 = v37;
                    }

                    v1 = Math.max(v8, v15_1);
                    v8 = v19 == 0 || ((LayoutParams)v14_1).width != v3 ? 0 : 1;
                    v7.mTotalLength = Math.max(v7.mTotalLength, v7.mTotalLength + v13_1.getMeasuredHeight() + ((LayoutParams)v14_1).topMargin + ((LayoutParams)v14_1).bottomMargin + v7.getNextLocationOffset(v13_1));
                    v19 = v8;
                    v8 = v1;
                    v1 = v36;
                }

                ++v0_1;
                v11_2 = v10_2;
                v3 = v38;
            }

            v11 = arg41;
            v7.mTotalLength += this.getPaddingTop() + this.getPaddingBottom();
            v0_1 = v8;
        }

        if(v19 != 0 || v12 == 0x40000000) {
            v0_1 = v5;
        }
        else {
        }

        v7.setMeasuredDimension(View.resolveSizeAndState(Math.max(v0_1 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), v11, v1), v4);
        if(v20 != 0) {
            v7.forceUniformWidth(v2, v6);
        }
    }

    protected void onDraw(Canvas arg3) {
        if(this.mDivider == null) {
            return;
        }

        if(this.mOrientation == 1) {
            this.drawDividersVertical(arg3);
        }
        else {
            this.drawDividersHorizontal(arg3);
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent arg2) {
        super.onInitializeAccessibilityEvent(arg2);
        arg2.setClassName(LinearLayoutCompat.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo arg2) {
        super.onInitializeAccessibilityNodeInfo(arg2);
        arg2.setClassName(LinearLayoutCompat.class.getName());
    }

    protected void onLayout(boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if(this.mOrientation == 1) {
            this.layoutVertical(arg3, arg4, arg5, arg6);
        }
        else {
            this.layoutHorizontal(arg3, arg4, arg5, arg6);
        }
    }

    protected void onMeasure(int arg3, int arg4) {
        if(this.mOrientation == 1) {
            this.measureVertical(arg3, arg4);
        }
        else {
            this.measureHorizontal(arg3, arg4);
        }
    }

    public void setBaselineAligned(boolean arg1) {
        this.mBaselineAligned = arg1;
    }

    public void setBaselineAlignedChildIndex(int arg3) {
        if(arg3 >= 0 && arg3 < this.getChildCount()) {
            this.mBaselineAlignedChildIndex = arg3;
            return;
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("base aligned child index out of range (0, ");
        v0.append(this.getChildCount());
        v0.append(")");
        throw new IllegalArgumentException(v0.toString());
    }

    private void setChildFrame(View arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.layout(arg2, arg3, arg4 + arg2, arg5 + arg3);
    }

    public void setDividerDrawable(Drawable arg3) {
        if(arg3 == this.mDivider) {
            return;
        }

        this.mDivider = arg3;
        boolean v0 = false;
        if(arg3 != null) {
            this.mDividerWidth = arg3.getIntrinsicWidth();
            this.mDividerHeight = arg3.getIntrinsicHeight();
        }
        else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }

        if(arg3 == null) {
            v0 = true;
        }

        this.setWillNotDraw(v0);
        this.requestLayout();
    }

    public void setDividerPadding(int arg1) {
        this.mDividerPadding = arg1;
    }

    public void setGravity(int arg2) {
        if(this.mGravity != arg2) {
            if((0x800007 & arg2) == 0) {
                arg2 |= 0x800003;
            }

            if((arg2 & 0x70) == 0) {
                arg2 |= 0x30;
            }

            this.mGravity = arg2;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int arg3) {
        arg3 &= 0x800007;
        if((0x800007 & this.mGravity) != arg3) {
            this.mGravity = arg3 | this.mGravity & 0xFF7FFFF8;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean arg1) {
        this.mUseLargestChild = arg1;
    }

    public void setOrientation(int arg2) {
        if(this.mOrientation != arg2) {
            this.mOrientation = arg2;
            this.requestLayout();
        }
    }

    public void setShowDividers(int arg2) {
        if(arg2 != this.mShowDividers) {
            this.requestLayout();
        }

        this.mShowDividers = arg2;
    }

    public void setVerticalGravity(int arg2) {
        arg2 &= 0x70;
        if((this.mGravity & 0x70) != arg2) {
            this.mGravity = arg2 | this.mGravity & 0xFFFFFF8F;
            this.requestLayout();
        }
    }

    public void setWeightSum(float arg2) {
        this.mWeightSum = Math.max(0f, arg2);
    }

    public boolean shouldDelayChildPressedState() {
        return 0;
    }
}

