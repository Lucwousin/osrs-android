package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View$OnAttachStateChangeListener;
import android.view.View$OnKeyListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewTreeObserver;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.R$dimen;
import androidx.appcompat.R$layout;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.ViewCompat;

final class StandardMenuPopup extends MenuPopup implements View$OnKeyListener, AdapterView$OnItemClickListener, PopupWindow$OnDismissListener, MenuPresenter {
    class androidx.appcompat.view.menu.StandardMenuPopup$1 implements ViewTreeObserver$OnGlobalLayoutListener {
        androidx.appcompat.view.menu.StandardMenuPopup$1(StandardMenuPopup arg1) {
            StandardMenuPopup.this = arg1;
            super();
        }

        public void onGlobalLayout() {
            if((StandardMenuPopup.this.isShowing()) && !StandardMenuPopup.this.mPopup.isModal()) {
                View v0 = StandardMenuPopup.this.mShownAnchorView;
                if(v0 != null) {
                    if(!v0.isShown()) {
                    }
                    else {
                        StandardMenuPopup.this.mPopup.show();
                        return;
                    }
                }

                StandardMenuPopup.this.dismiss();
            }
        }
    }

    class androidx.appcompat.view.menu.StandardMenuPopup$2 implements View$OnAttachStateChangeListener {
        androidx.appcompat.view.menu.StandardMenuPopup$2(StandardMenuPopup arg1) {
            StandardMenuPopup.this = arg1;
            super();
        }

        public void onViewAttachedToWindow(View arg1) {
        }

        public void onViewDetachedFromWindow(View arg3) {
            if(StandardMenuPopup.this.mTreeObserver != null) {
                if(!StandardMenuPopup.this.mTreeObserver.isAlive()) {
                    StandardMenuPopup.this.mTreeObserver = arg3.getViewTreeObserver();
                }

                StandardMenuPopup.this.mTreeObserver.removeGlobalOnLayoutListener(StandardMenuPopup.this.mGlobalLayoutListener);
            }

            arg3.removeOnAttachStateChangeListener(((View$OnAttachStateChangeListener)this));
        }
    }

    private static final int ITEM_LAYOUT;
    private final MenuAdapter mAdapter;
    private View mAnchorView;
    private final View$OnAttachStateChangeListener mAttachStateChangeListener;
    private int mContentWidth;
    private final Context mContext;
    private int mDropDownGravity;
    final ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener;
    private boolean mHasContentWidth;
    private final MenuBuilder mMenu;
    private PopupWindow$OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    final MenuPopupWindow mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private Callback mPresenterCallback;
    private boolean mShowTitle;
    View mShownAnchorView;
    ViewTreeObserver mTreeObserver;
    private boolean mWasDismissed;

    static {
        StandardMenuPopup.ITEM_LAYOUT = R$layout.abc_popup_menu_item_layout;
    }

    public StandardMenuPopup(Context arg4, MenuBuilder arg5, View arg6, int arg7, int arg8, boolean arg9) {
        super();
        this.mGlobalLayoutListener = new androidx.appcompat.view.menu.StandardMenuPopup$1(this);
        this.mAttachStateChangeListener = new androidx.appcompat.view.menu.StandardMenuPopup$2(this);
        this.mDropDownGravity = 0;
        this.mContext = arg4;
        this.mMenu = arg5;
        this.mOverflowOnly = arg9;
        this.mAdapter = new MenuAdapter(arg5, LayoutInflater.from(arg4), this.mOverflowOnly, StandardMenuPopup.ITEM_LAYOUT);
        this.mPopupStyleAttr = arg7;
        this.mPopupStyleRes = arg8;
        Resources v7 = arg4.getResources();
        this.mPopupMaxWidth = Math.max(v7.getDisplayMetrics().widthPixels / 2, v7.getDimensionPixelSize(R$dimen.abc_config_prefDialogWidth));
        this.mAnchorView = arg6;
        this.mPopup = new MenuPopupWindow(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
        arg5.addMenuPresenter(((MenuPresenter)this), arg4);
    }

    public void addMenu(MenuBuilder arg1) {
    }

    public void dismiss() {
        if(this.isShowing()) {
            this.mPopup.dismiss();
        }
    }

    public boolean flagActionItems() {
        return 0;
    }

    public ListView getListView() {
        return this.mPopup.getListView();
    }

    public boolean isShowing() {
        boolean v0 = (this.mWasDismissed) || !this.mPopup.isShowing() ? false : true;
        return v0;
    }

    public void onCloseMenu(MenuBuilder arg2, boolean arg3) {
        if(arg2 != this.mMenu) {
            return;
        }

        this.dismiss();
        if(this.mPresenterCallback != null) {
            this.mPresenterCallback.onCloseMenu(arg2, arg3);
        }
    }

    public void onDismiss() {
        this.mWasDismissed = true;
        this.mMenu.close();
        if(this.mTreeObserver != null) {
            if(!this.mTreeObserver.isAlive()) {
                this.mTreeObserver = this.mShownAnchorView.getViewTreeObserver();
            }

            this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
            this.mTreeObserver = null;
        }

        this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
        if(this.mOnDismissListener != null) {
            this.mOnDismissListener.onDismiss();
        }
    }

    public boolean onKey(View arg1, int arg2, KeyEvent arg3) {
        if(arg3.getAction() == 1 && arg2 == 82) {
            this.dismiss();
            return 1;
        }

        return 0;
    }

    public void onRestoreInstanceState(Parcelable arg1) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public boolean onSubMenuSelected(SubMenuBuilder arg10) {
        if(arg10.hasVisibleItems()) {
            MenuPopupHelper v0 = new MenuPopupHelper(this.mContext, arg10, this.mShownAnchorView, this.mOverflowOnly, this.mPopupStyleAttr, this.mPopupStyleRes);
            v0.setPresenterCallback(this.mPresenterCallback);
            v0.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(((MenuBuilder)arg10)));
            v0.setOnDismissListener(this.mOnDismissListener);
            this.mOnDismissListener = null;
            this.mMenu.close(false);
            int v2 = this.mPopup.getHorizontalOffset();
            int v3 = this.mPopup.getVerticalOffset();
            if((Gravity.getAbsoluteGravity(this.mDropDownGravity, ViewCompat.getLayoutDirection(this.mAnchorView)) & 7) == 5) {
                v2 += this.mAnchorView.getWidth();
            }

            if(!v0.tryShow(v2, v3)) {
                return 0;
            }

            if(this.mPresenterCallback != null) {
                this.mPresenterCallback.onOpenSubMenu(((MenuBuilder)arg10));
            }

            return 1;
        }

        return 0;
    }

    public void setAnchorView(View arg1) {
        this.mAnchorView = arg1;
    }

    public void setCallback(Callback arg1) {
        this.mPresenterCallback = arg1;
    }

    public void setForceShowIcon(boolean arg2) {
        this.mAdapter.setForceShowIcon(arg2);
    }

    public void setGravity(int arg1) {
        this.mDropDownGravity = arg1;
    }

    public void setHorizontalOffset(int arg2) {
        this.mPopup.setHorizontalOffset(arg2);
    }

    public void setOnDismissListener(PopupWindow$OnDismissListener arg1) {
        this.mOnDismissListener = arg1;
    }

    public void setShowTitle(boolean arg1) {
        this.mShowTitle = arg1;
    }

    public void setVerticalOffset(int arg2) {
        this.mPopup.setVerticalOffset(arg2);
    }

    public void show() {
        if(this.tryShow()) {
            return;
        }

        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    private boolean tryShow() {
        if(this.isShowing()) {
            return 1;
        }

        if(!this.mWasDismissed) {
            if(this.mAnchorView == null) {
            }
            else {
                this.mShownAnchorView = this.mAnchorView;
                this.mPopup.setOnDismissListener(((PopupWindow$OnDismissListener)this));
                this.mPopup.setOnItemClickListener(((AdapterView$OnItemClickListener)this));
                this.mPopup.setModal(true);
                View v0 = this.mShownAnchorView;
                int v3 = this.mTreeObserver == null ? 1 : 0;
                this.mTreeObserver = v0.getViewTreeObserver();
                if(v3 != 0) {
                    this.mTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
                }

                v0.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
                this.mPopup.setAnchorView(v0);
                this.mPopup.setDropDownGravity(this.mDropDownGravity);
                ViewGroup v3_1 = null;
                if(!this.mHasContentWidth) {
                    this.mContentWidth = StandardMenuPopup.measureIndividualMenuWidth(this.mAdapter, v3_1, this.mContext, this.mPopupMaxWidth);
                    this.mHasContentWidth = true;
                }

                this.mPopup.setContentWidth(this.mContentWidth);
                this.mPopup.setInputMethodMode(2);
                this.mPopup.setEpicenterBounds(this.getEpicenterBounds());
                this.mPopup.show();
                ListView v0_1 = this.mPopup.getListView();
                v0_1.setOnKeyListener(((View$OnKeyListener)this));
                if((this.mShowTitle) && this.mMenu.getHeaderTitle() != null) {
                    View v4 = LayoutInflater.from(this.mContext).inflate(R$layout.abc_popup_menu_header_item_layout, ((ViewGroup)v0_1), false);
                    View v5 = ((FrameLayout)v4).findViewById(0x1020016);
                    if(v5 != null) {
                        ((TextView)v5).setText(this.mMenu.getHeaderTitle());
                    }

                    ((FrameLayout)v4).setEnabled(false);
                    v0_1.addHeaderView(v4, v3_1, false);
                }

                this.mPopup.setAdapter(this.mAdapter);
                this.mPopup.show();
                return 1;
            }
        }

        return 0;
    }

    public void updateMenuView(boolean arg1) {
        this.mHasContentWidth = false;
        if(this.mAdapter != null) {
            this.mAdapter.notifyDataSetChanged();
        }
    }
}

