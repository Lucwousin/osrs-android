package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.FlowLayout;
import com.google.android.material.internal.ThemeEnforcement;

public class ChipGroup extends FlowLayout {
    class com.google.android.material.chip.ChipGroup$1 {
    }

    class CheckedStateTracker implements CompoundButton$OnCheckedChangeListener {
        CheckedStateTracker(ChipGroup arg1, com.google.android.material.chip.ChipGroup$1 arg2) {
            this(arg1);
        }

        private CheckedStateTracker(ChipGroup arg1) {
            ChipGroup.this = arg1;
            super();
        }

        public void onCheckedChanged(CompoundButton arg3, boolean arg4) {
            if(ChipGroup.this.protectFromCheckedChange) {
                return;
            }

            int v3 = arg3.getId();
            int v0 = -1;
            if(arg4) {
                if(ChipGroup.this.checkedId != v0 && ChipGroup.this.checkedId != v3 && (ChipGroup.this.singleSelection)) {
                    ChipGroup.this.setCheckedStateForView(ChipGroup.this.checkedId, false);
                }

                ChipGroup.this.setCheckedId(v3);
            }
            else {
                if(ChipGroup.this.checkedId != v3) {
                    return;
                }

                ChipGroup.this.setCheckedId(v0);
            }
        }
    }

    public class LayoutParams extends ViewGroup$MarginLayoutParams {
        public LayoutParams(int arg1, int arg2) {
            super(arg1, arg2);
        }

        public LayoutParams(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
        }

        public LayoutParams(ViewGroup$LayoutParams arg1) {
            super(arg1);
        }

        public LayoutParams(ViewGroup$MarginLayoutParams arg1) {
            super(arg1);
        }
    }

    public interface OnCheckedChangeListener {
        void onCheckedChanged(ChipGroup arg1, @IdRes int arg2);
    }

    class PassThroughHierarchyChangeListener implements ViewGroup$OnHierarchyChangeListener {
        private ViewGroup$OnHierarchyChangeListener onHierarchyChangeListener;

        PassThroughHierarchyChangeListener(ChipGroup arg1, com.google.android.material.chip.ChipGroup$1 arg2) {
            this(arg1);
        }

        private PassThroughHierarchyChangeListener(ChipGroup arg1) {
            ChipGroup.this = arg1;
            super();
        }

        static ViewGroup$OnHierarchyChangeListener access$202(PassThroughHierarchyChangeListener arg0, ViewGroup$OnHierarchyChangeListener arg1) {
            arg0.onHierarchyChangeListener = arg1;
            return arg1;
        }

        public void onChildViewAdded(View arg3, View arg4) {
            if(arg3 == ChipGroup.this && ((arg4 instanceof Chip))) {
                if(arg4.getId() == -1) {
                    int v0 = Build$VERSION.SDK_INT >= 17 ? View.generateViewId() : arg4.hashCode();
                    arg4.setId(v0);
                }

                arg4.setOnCheckedChangeListenerInternal(ChipGroup.this.checkedStateTracker);
            }

            if(this.onHierarchyChangeListener != null) {
                this.onHierarchyChangeListener.onChildViewAdded(arg3, arg4);
            }
        }

        public void onChildViewRemoved(View arg3, View arg4) {
            if(arg3 == ChipGroup.this && ((arg4 instanceof Chip))) {
                arg4.setOnCheckedChangeListenerInternal(null);
            }

            if(this.onHierarchyChangeListener != null) {
                this.onHierarchyChangeListener.onChildViewRemoved(arg3, arg4);
            }
        }
    }

    @IdRes private int checkedId;
    private final CheckedStateTracker checkedStateTracker;
    @Dimension private int chipSpacingHorizontal;
    @Dimension private int chipSpacingVertical;
    @Nullable private OnCheckedChangeListener onCheckedChangeListener;
    private PassThroughHierarchyChangeListener passThroughListener;
    private boolean protectFromCheckedChange;
    private boolean singleSelection;

    public ChipGroup(Context arg2) {
        this(arg2, null);
    }

    public ChipGroup(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.chipGroupStyle);
    }

    public ChipGroup(Context arg9, AttributeSet arg10, int arg11) {
        super(arg9, arg10, arg11);
        this.checkedStateTracker = new CheckedStateTracker(this, null);
        this.passThroughListener = new PassThroughHierarchyChangeListener(this, null);
        this.checkedId = -1;
        this.protectFromCheckedChange = false;
        TypedArray v9 = ThemeEnforcement.obtainStyledAttributes(arg9, arg10, R$styleable.ChipGroup, arg11, R$style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int v10 = v9.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacing, 0);
        this.setChipSpacingHorizontal(v9.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingHorizontal, v10));
        this.setChipSpacingVertical(v9.getDimensionPixelOffset(R$styleable.ChipGroup_chipSpacingVertical, v10));
        this.setSingleLine(v9.getBoolean(R$styleable.ChipGroup_singleLine, false));
        this.setSingleSelection(v9.getBoolean(R$styleable.ChipGroup_singleSelection, false));
        v10 = v9.getResourceId(R$styleable.ChipGroup_checkedChip, -1);
        if(v10 != -1) {
            this.checkedId = v10;
        }

        v9.recycle();
        super.setOnHierarchyChangeListener(this.passThroughListener);
    }

    static boolean access$300(ChipGroup arg0) {
        return arg0.protectFromCheckedChange;
    }

    static int access$400(ChipGroup arg0) {
        return arg0.checkedId;
    }

    static boolean access$500(ChipGroup arg0) {
        return arg0.singleSelection;
    }

    static void access$600(ChipGroup arg0, int arg1, boolean arg2) {
        arg0.setCheckedStateForView(arg1, arg2);
    }

    static void access$700(ChipGroup arg0, int arg1) {
        arg0.setCheckedId(arg1);
    }

    static CheckedStateTracker access$800(ChipGroup arg0) {
        return arg0.checkedStateTracker;
    }

    public void addView(View arg4, int arg5, ViewGroup$LayoutParams arg6) {
        if((arg4 instanceof Chip)) {
            View v0 = arg4;
            if(((Chip)v0).isChecked()) {
                if(this.checkedId != -1 && (this.singleSelection)) {
                    this.setCheckedStateForView(this.checkedId, false);
                }

                this.setCheckedId(((Chip)v0).getId());
            }
        }

        super.addView(arg4, arg5, arg6);
    }

    public void check(@IdRes int arg4) {
        if(arg4 == this.checkedId) {
            return;
        }

        int v1 = -1;
        if(this.checkedId != v1 && (this.singleSelection)) {
            this.setCheckedStateForView(this.checkedId, false);
        }

        if(arg4 != v1) {
            this.setCheckedStateForView(arg4, true);
        }

        this.setCheckedId(arg4);
    }

    protected boolean checkLayoutParams(ViewGroup$LayoutParams arg2) {
        boolean v2 = !super.checkLayoutParams(arg2) || !(arg2 instanceof LayoutParams) ? false : true;
        return v2;
    }

    public void clearCheck() {
        this.protectFromCheckedChange = true;
        int v1;
        for(v1 = 0; v1 < this.getChildCount(); ++v1) {
            View v2 = this.getChildAt(v1);
            if((v2 instanceof Chip)) {
                ((Chip)v2).setChecked(false);
            }
        }

        this.protectFromCheckedChange = false;
        this.setCheckedId(-1);
    }

    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet arg3) {
        return new LayoutParams(this.getContext(), arg3);
    }

    protected ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg2) {
        return new LayoutParams(arg2);
    }

    @IdRes public int getCheckedChipId() {
        int v0 = this.singleSelection ? this.checkedId : -1;
        return v0;
    }

    @Dimension public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    @Dimension public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        if(this.checkedId != -1) {
            this.setCheckedStateForView(this.checkedId, true);
            this.setCheckedId(this.checkedId);
        }
    }

    private void setCheckedId(int arg2) {
        this.checkedId = arg2;
        if(this.onCheckedChangeListener != null && (this.singleSelection)) {
            this.onCheckedChangeListener.onCheckedChanged(this, arg2);
        }
    }

    private void setCheckedStateForView(@IdRes int arg2, boolean arg3) {
        View v2 = this.findViewById(arg2);
        if((v2 instanceof Chip)) {
            this.protectFromCheckedChange = true;
            ((Chip)v2).setChecked(arg3);
            this.protectFromCheckedChange = false;
        }
    }

    public void setChipSpacing(@Dimension int arg1) {
        this.setChipSpacingHorizontal(arg1);
        this.setChipSpacingVertical(arg1);
    }

    public void setChipSpacingHorizontal(@Dimension int arg2) {
        if(this.chipSpacingHorizontal != arg2) {
            this.chipSpacingHorizontal = arg2;
            this.setItemSpacing(arg2);
            this.requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int arg2) {
        this.setChipSpacingHorizontal(this.getResources().getDimensionPixelOffset(arg2));
    }

    public void setChipSpacingResource(@DimenRes int arg2) {
        this.setChipSpacing(this.getResources().getDimensionPixelOffset(arg2));
    }

    public void setChipSpacingVertical(@Dimension int arg2) {
        if(this.chipSpacingVertical != arg2) {
            this.chipSpacingVertical = arg2;
            this.setLineSpacing(arg2);
            this.requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int arg2) {
        this.setChipSpacingVertical(this.getResources().getDimensionPixelOffset(arg2));
    }

    @Deprecated public void setDividerDrawableHorizontal(Drawable arg2) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated public void setDividerDrawableVertical(@Nullable Drawable arg2) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated public void setFlexWrap(int arg2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener arg1) {
        this.onCheckedChangeListener = arg1;
    }

    public void setOnHierarchyChangeListener(ViewGroup$OnHierarchyChangeListener arg2) {
        PassThroughHierarchyChangeListener.access$202(this.passThroughListener, arg2);
    }

    @Deprecated public void setShowDividerHorizontal(int arg2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated public void setShowDividerVertical(int arg2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(@BoolRes int arg2) {
        this.setSingleLine(this.getResources().getBoolean(arg2));
    }

    public void setSingleSelection(boolean arg2) {
        if(this.singleSelection != arg2) {
            this.singleSelection = arg2;
            this.clearCheck();
        }
    }

    public void setSingleSelection(@BoolRes int arg2) {
        this.setSingleSelection(this.getResources().getBoolean(arg2));
    }
}

