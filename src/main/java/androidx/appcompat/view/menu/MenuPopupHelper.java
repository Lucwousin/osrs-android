package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.view.Display;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow$OnDismissListener;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$dimen;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class MenuPopupHelper implements MenuHelper {
    class androidx.appcompat.view.menu.MenuPopupHelper$1 implements PopupWindow$OnDismissListener {
        androidx.appcompat.view.menu.MenuPopupHelper$1(MenuPopupHelper arg1) {
            MenuPopupHelper.this = arg1;
            super();
        }

        public void onDismiss() {
            MenuPopupHelper.this.onDismiss();
        }
    }

    private static final int TOUCH_EPICENTER_SIZE_DP = 0x30;
    private View mAnchorView;
    private final Context mContext;
    private int mDropDownGravity;
    private boolean mForceShowIcon;
    private final PopupWindow$OnDismissListener mInternalOnDismissListener;
    private final MenuBuilder mMenu;
    private PopupWindow$OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private MenuPopup mPopup;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private Callback mPresenterCallback;

    public MenuPopupHelper(@NonNull Context arg2, @NonNull MenuBuilder arg3, @NonNull View arg4, boolean arg5, @AttrRes int arg6, @StyleRes int arg7) {
        super();
        this.mDropDownGravity = 0x800003;
        this.mInternalOnDismissListener = new androidx.appcompat.view.menu.MenuPopupHelper$1(this);
        this.mContext = arg2;
        this.mMenu = arg3;
        this.mAnchorView = arg4;
        this.mOverflowOnly = arg5;
        this.mPopupStyleAttr = arg6;
        this.mPopupStyleRes = arg7;
    }

    public MenuPopupHelper(@NonNull Context arg8, @NonNull MenuBuilder arg9) {
        this(arg8, arg9, null, false, R$attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(@NonNull Context arg8, @NonNull MenuBuilder arg9, @NonNull View arg10) {
        this(arg8, arg9, arg10, false, R$attr.popupMenuStyle, 0);
    }

    public MenuPopupHelper(@NonNull Context arg8, @NonNull MenuBuilder arg9, @NonNull View arg10, boolean arg11, @AttrRes int arg12) {
        this(arg8, arg9, arg10, arg11, arg12, 0);
    }

    @NonNull private MenuPopup createPopup() {
        CascadingMenuPopup v0_2;
        Display v0 = this.mContext.getSystemService("window").getDefaultDisplay();
        Point v1 = new Point();
        if(Build$VERSION.SDK_INT >= 17) {
            v0.getRealSize(v1);
        }
        else {
            v0.getSize(v1);
        }

        int v0_1 = Math.min(v1.x, v1.y) >= this.mContext.getResources().getDimensionPixelSize(R$dimen.abc_cascading_menus_min_smallest_width) ? 1 : 0;
        if(v0_1 != 0) {
            v0_2 = new CascadingMenuPopup(this.mContext, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        }
        else {
            StandardMenuPopup v0_3 = new StandardMenuPopup(this.mContext, this.mMenu, this.mAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
        }

        ((MenuPopup)v0_2).addMenu(this.mMenu);
        ((MenuPopup)v0_2).setOnDismissListener(this.mInternalOnDismissListener);
        ((MenuPopup)v0_2).setAnchorView(this.mAnchorView);
        ((MenuPopup)v0_2).setCallback(this.mPresenterCallback);
        ((MenuPopup)v0_2).setForceShowIcon(this.mForceShowIcon);
        ((MenuPopup)v0_2).setGravity(this.mDropDownGravity);
        return ((MenuPopup)v0_2);
    }

    public void dismiss() {
        if(this.isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public int getGravity() {
        return this.mDropDownGravity;
    }

    public ListView getListView() {
        return this.getPopup().getListView();
    }

    @NonNull public MenuPopup getPopup() {
        if(this.mPopup == null) {
            this.mPopup = this.createPopup();
        }

        return this.mPopup;
    }

    public boolean isShowing() {
        boolean v0 = this.mPopup == null || !this.mPopup.isShowing() ? false : true;
        return v0;
    }

    protected void onDismiss() {
        this.mPopup = null;
        if(this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss();
        }
    }

    public void setAnchorView(@NonNull View arg1) {
        this.mAnchorView = arg1;
    }

    public void setForceShowIcon(boolean arg2) {
        this.mForceShowIcon = arg2;
        if(this.mPopup != null) {
            this.mPopup.setForceShowIcon(arg2);
        }
    }

    public void setGravity(int arg1) {
        this.mDropDownGravity = arg1;
    }

    public void setOnDismissListener(@Nullable PopupWindow$OnDismissListener arg1) {
        this.mOnDismissListener = arg1;
    }

    public void setPresenterCallback(@Nullable Callback arg2) {
        this.mPresenterCallback = arg2;
        if(this.mPopup != null) {
            this.mPopup.setCallback(arg2);
        }
    }

    public void show() {
        if(this.tryShow()) {
            return;
        }

        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public void show(int arg1, int arg2) {
        if(this.tryShow(arg1, arg2)) {
            return;
        }

        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    private void showPopup(int arg4, int arg5, boolean arg6, boolean arg7) {
        MenuPopup v0 = this.getPopup();
        v0.setShowTitle(arg7);
        if(arg6) {
            if((GravityCompat.getAbsoluteGravity(this.mDropDownGravity, ViewCompat.getLayoutDirection(this.mAnchorView)) & 7) == 5) {
                arg4 -= this.mAnchorView.getWidth();
            }

            v0.setHorizontalOffset(arg4);
            v0.setVerticalOffset(arg5);
            int v6 = ((int)(this.mContext.getResources().getDisplayMetrics().density * 48f / 2f));
            v0.setEpicenterBounds(new Rect(arg4 - v6, arg5 - v6, arg4 + v6, arg5 + v6));
        }

        v0.show();
    }

    public boolean tryShow() {
        if(this.isShowing()) {
            return 1;
        }

        if(this.mAnchorView == null) {
            return 0;
        }

        this.showPopup(0, 0, false, false);
        return 1;
    }

    public boolean tryShow(int arg3, int arg4) {
        if(this.isShowing()) {
            return 1;
        }

        if(this.mAnchorView == null) {
            return 0;
        }

        this.showPopup(arg3, arg4, true, true);
        return 1;
    }
}

