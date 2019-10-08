package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.AbsListView$SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.ViewCompat;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class ListMenuItemView extends LinearLayout implements AbsListView$SelectionBoundsAdjuster, ItemView {
    private static final String TAG = "ListMenuItemView";
    private Drawable mBackground;
    private CheckBox mCheckBox;
    private LinearLayout mContent;
    private boolean mForceShowIcon;
    private ImageView mGroupDivider;
    private boolean mHasListDivider;
    private ImageView mIconView;
    private LayoutInflater mInflater;
    private MenuItemImpl mItemData;
    private int mMenuType;
    private boolean mPreserveIconSpacing;
    private RadioButton mRadioButton;
    private TextView mShortcutView;
    private Drawable mSubMenuArrow;
    private ImageView mSubMenuArrowView;
    private int mTextAppearance;
    private Context mTextAppearanceContext;
    private TextView mTitleView;

    public ListMenuItemView(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.listMenuViewStyle);
    }

    public ListMenuItemView(Context arg4, AttributeSet arg5, int arg6) {
        super(arg4, arg5);
        TintTypedArray v5 = TintTypedArray.obtainStyledAttributes(this.getContext(), arg5, R$styleable.MenuView, arg6, 0);
        this.mBackground = v5.getDrawable(R$styleable.MenuView_android_itemBackground);
        this.mTextAppearance = v5.getResourceId(R$styleable.MenuView_android_itemTextAppearance, -1);
        this.mPreserveIconSpacing = v5.getBoolean(R$styleable.MenuView_preserveIconSpacing, false);
        this.mTextAppearanceContext = arg4;
        this.mSubMenuArrow = v5.getDrawable(R$styleable.MenuView_subMenuArrow);
        TypedArray v4 = arg4.getTheme().obtainStyledAttributes(null, new int[]{0x1010129}, R$attr.dropDownListViewStyle, 0);
        this.mHasListDivider = v4.hasValue(0);
        v5.recycle();
        v4.recycle();
    }

    private void addContentView(View arg2) {
        this.addContentView(arg2, -1);
    }

    private void addContentView(View arg2, int arg3) {
        if(this.mContent != null) {
            this.mContent.addView(arg2, arg3);
        }
        else {
            this.addView(arg2, arg3);
        }
    }

    public void adjustListItemSelectionBounds(Rect arg5) {
        if(this.mGroupDivider != null && this.mGroupDivider.getVisibility() == 0) {
            ViewGroup$LayoutParams v0 = this.mGroupDivider.getLayoutParams();
            arg5.top += this.mGroupDivider.getHeight() + ((LinearLayout$LayoutParams)v0).topMargin + ((LinearLayout$LayoutParams)v0).bottomMargin;
        }
    }

    private LayoutInflater getInflater() {
        if(this.mInflater == null) {
            this.mInflater = LayoutInflater.from(this.getContext());
        }

        return this.mInflater;
    }

    public MenuItemImpl getItemData() {
        return this.mItemData;
    }

    public void initialize(MenuItemImpl arg2, int arg3) {
        this.mItemData = arg2;
        this.mMenuType = arg3;
        arg3 = arg2.isVisible() ? 0 : 8;
        this.setVisibility(arg3);
        this.setTitle(arg2.getTitleForItemView(((ItemView)this)));
        this.setCheckable(arg2.isCheckable());
        this.setShortcut(arg2.shouldShowShortcut(), arg2.getShortcut());
        this.setIcon(arg2.getIcon());
        this.setEnabled(arg2.isEnabled());
        this.setSubMenuArrowVisible(arg2.hasSubMenu());
        this.setContentDescription(arg2.getContentDescription());
    }

    private void insertCheckBox() {
        this.mCheckBox = this.getInflater().inflate(R$layout.abc_list_menu_item_checkbox, ((ViewGroup)this), false);
        this.addContentView(this.mCheckBox);
    }

    private void insertIconView() {
        this.mIconView = this.getInflater().inflate(R$layout.abc_list_menu_item_icon, ((ViewGroup)this), false);
        this.addContentView(this.mIconView, 0);
    }

    private void insertRadioButton() {
        this.mRadioButton = this.getInflater().inflate(R$layout.abc_list_menu_item_radio, ((ViewGroup)this), false);
        this.addContentView(this.mRadioButton);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.setBackground(((View)this), this.mBackground);
        this.mTitleView = this.findViewById(R$id.title);
        if(this.mTextAppearance != -1) {
            this.mTitleView.setTextAppearance(this.mTextAppearanceContext, this.mTextAppearance);
        }

        this.mShortcutView = this.findViewById(R$id.shortcut);
        this.mSubMenuArrowView = this.findViewById(R$id.submenuarrow);
        if(this.mSubMenuArrowView != null) {
            this.mSubMenuArrowView.setImageDrawable(this.mSubMenuArrow);
        }

        this.mGroupDivider = this.findViewById(R$id.group_divider);
        this.mContent = this.findViewById(R$id.content);
    }

    protected void onMeasure(int arg4, int arg5) {
        if(this.mIconView != null && (this.mPreserveIconSpacing)) {
            ViewGroup$LayoutParams v0 = this.getLayoutParams();
            ViewGroup$LayoutParams v1 = this.mIconView.getLayoutParams();
            if(v0.height > 0 && ((LinearLayout$LayoutParams)v1).width <= 0) {
                ((LinearLayout$LayoutParams)v1).width = v0.height;
            }
        }

        super.onMeasure(arg4, arg5);
    }

    public boolean prefersCondensedTitle() {
        return 0;
    }

    public void setCheckable(boolean arg4) {
        RadioButton v1_1;
        RadioButton v0;
        if(!arg4 && this.mRadioButton == null && this.mCheckBox == null) {
            return;
        }

        if(this.mItemData.isExclusiveCheckable()) {
            if(this.mRadioButton == null) {
                this.insertRadioButton();
            }

            v0 = this.mRadioButton;
            CheckBox v1 = this.mCheckBox;
        }
        else {
            if(this.mCheckBox == null) {
                this.insertCheckBox();
            }

            CheckBox v0_1 = this.mCheckBox;
            v1_1 = this.mRadioButton;
        }

        int v2 = 8;
        if(arg4) {
            ((CompoundButton)v0).setChecked(this.mItemData.isChecked());
            if(((CompoundButton)v0).getVisibility() != 0) {
                ((CompoundButton)v0).setVisibility(0);
            }

            if((((CheckBox)v1_1)) == null) {
                return;
            }

            if(((CompoundButton)v1_1).getVisibility() == v2) {
                return;
            }

            ((CompoundButton)v1_1).setVisibility(v2);
        }
        else {
            if(this.mCheckBox != null) {
                this.mCheckBox.setVisibility(v2);
            }

            if(this.mRadioButton == null) {
                return;
            }

            this.mRadioButton.setVisibility(v2);
        }
    }

    public void setChecked(boolean arg2) {
        RadioButton v0;
        if(this.mItemData.isExclusiveCheckable()) {
            if(this.mRadioButton == null) {
                this.insertRadioButton();
            }

            v0 = this.mRadioButton;
        }
        else {
            if(this.mCheckBox == null) {
                this.insertCheckBox();
            }

            CheckBox v0_1 = this.mCheckBox;
        }

        ((CompoundButton)v0).setChecked(arg2);
    }

    public void setForceShowIcon(boolean arg1) {
        this.mForceShowIcon = arg1;
        this.mPreserveIconSpacing = arg1;
    }

    public void setGroupDividerEnabled(boolean arg3) {
        if(this.mGroupDivider != null) {
            ImageView v0 = this.mGroupDivider;
            int v3 = (this.mHasListDivider) || !arg3 ? 8 : 0;
            v0.setVisibility(v3);
        }
    }

    public void setIcon(Drawable arg4) {
        int v0 = (this.mItemData.shouldShowIcon()) || (this.mForceShowIcon) ? 1 : 0;
        if(v0 == 0 && !this.mPreserveIconSpacing) {
            return;
        }

        if(this.mIconView == null && arg4 == null && !this.mPreserveIconSpacing) {
            return;
        }

        if(this.mIconView == null) {
            this.insertIconView();
        }

        if(arg4 != null || (this.mPreserveIconSpacing)) {
            ImageView v2 = this.mIconView;
            if(v0 != 0) {
            }
            else {
                arg4 = null;
            }

            v2.setImageDrawable(arg4);
            if(this.mIconView.getVisibility() == 0) {
                return;
            }

            this.mIconView.setVisibility(0);
        }
        else {
            this.mIconView.setVisibility(8);
        }
    }

    public void setShortcut(boolean arg2, char arg3) {
        int v2 = !arg2 || !this.mItemData.shouldShowShortcut() ? 8 : 0;
        if(v2 == 0) {
            this.mShortcutView.setText(this.mItemData.getShortcutLabel());
        }

        if(this.mShortcutView.getVisibility() != v2) {
            this.mShortcutView.setVisibility(v2);
        }
    }

    private void setSubMenuArrowVisible(boolean arg2) {
        if(this.mSubMenuArrowView != null) {
            ImageView v0 = this.mSubMenuArrowView;
            int v2 = arg2 ? 0 : 8;
            v0.setVisibility(v2);
        }
    }

    public void setTitle(CharSequence arg2) {
        if(arg2 != null) {
            this.mTitleView.setText(arg2);
            if(this.mTitleView.getVisibility() != 0) {
                this.mTitleView.setVisibility(0);
            }
        }
        else {
            int v0 = 8;
            if(this.mTitleView.getVisibility() != v0) {
                this.mTitleView.setVisibility(v0);
            }
        }
    }

    public boolean showsIcon() {
        return this.mForceShowIcon;
    }
}

