package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View$OnTouchListener;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow$OnDismissListener;
import androidx.annotation.AttrRes;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.ShowableListMenu;

public class PopupMenu {
    public interface OnDismissListener {
        void onDismiss(PopupMenu arg1);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem arg1);
    }

    private final View mAnchor;
    private final Context mContext;
    private View$OnTouchListener mDragListener;
    private final MenuBuilder mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    final MenuPopupHelper mPopup;

    public PopupMenu(@NonNull Context arg2, @NonNull View arg3) {
        this(arg2, arg3, 0);
    }

    public PopupMenu(@NonNull Context arg7, @NonNull View arg8, int arg9) {
        this(arg7, arg8, arg9, R$attr.popupMenuStyle, 0);
    }

    public PopupMenu(@NonNull Context arg10, @NonNull View arg11, int arg12, @AttrRes int arg13, @StyleRes int arg14) {
        super();
        this.mContext = arg10;
        this.mAnchor = arg11;
        this.mMenu = new MenuBuilder(arg10);
        this.mMenu.setCallback(new Callback() {
            public boolean onMenuItemSelected(MenuBuilder arg1, MenuItem arg2) {
                if(PopupMenu.this.mMenuItemClickListener != null) {
                    return PopupMenu.this.mMenuItemClickListener.onMenuItemClick(arg2);
                }

                return 0;
            }

            public void onMenuModeChange(MenuBuilder arg1) {
            }
        });
        this.mPopup = new MenuPopupHelper(arg10, this.mMenu, arg11, false, arg13, arg14);
        this.mPopup.setGravity(arg12);
        this.mPopup.setOnDismissListener(new PopupWindow$OnDismissListener() {
            public void onDismiss() {
                if(PopupMenu.this.mOnDismissListener != null) {
                    PopupMenu.this.mOnDismissListener.onDismiss(PopupMenu.this);
                }
            }
        });
    }

    public void dismiss() {
        this.mPopup.dismiss();
    }

    @NonNull public View$OnTouchListener getDragToOpenListener() {
        if(this.mDragListener == null) {
            this.mDragListener = new ForwardingListener(this.mAnchor) {
                public ShowableListMenu getPopup() {
                    return PopupMenu.this.mPopup.getPopup();
                }

                protected boolean onForwardingStarted() {
                    PopupMenu.this.show();
                    return 1;
                }

                protected boolean onForwardingStopped() {
                    PopupMenu.this.dismiss();
                    return 1;
                }
            };
        }

        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.getGravity();
    }

    @NonNull public Menu getMenu() {
        return this.mMenu;
    }

    @NonNull public MenuInflater getMenuInflater() {
        return new SupportMenuInflater(this.mContext);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) ListView getMenuListView() {
        if(!this.mPopup.isShowing()) {
            return null;
        }

        return this.mPopup.getListView();
    }

    public void inflate(@MenuRes int arg3) {
        this.getMenuInflater().inflate(arg3, this.mMenu);
    }

    public void setGravity(int arg2) {
        this.mPopup.setGravity(arg2);
    }

    public void setOnDismissListener(@Nullable OnDismissListener arg1) {
        this.mOnDismissListener = arg1;
    }

    public void setOnMenuItemClickListener(@Nullable OnMenuItemClickListener arg1) {
        this.mMenuItemClickListener = arg1;
    }

    public void show() {
        this.mPopup.show();
    }
}

