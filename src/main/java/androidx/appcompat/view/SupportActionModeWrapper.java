package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode$Callback;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuWrapperFactory;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class SupportActionModeWrapper extends ActionMode {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) public class CallbackWrapper implements Callback {
        final ArrayList mActionModes;
        final Context mContext;
        final SimpleArrayMap mMenus;
        final ActionMode$Callback mWrappedCallback;

        public CallbackWrapper(Context arg1, ActionMode$Callback arg2) {
            super();
            this.mContext = arg1;
            this.mWrappedCallback = arg2;
            this.mActionModes = new ArrayList();
            this.mMenus = new SimpleArrayMap();
        }

        public ActionMode getActionModeWrapper(androidx.appcompat.view.ActionMode arg5) {
            int v0 = this.mActionModes.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                Object v2 = this.mActionModes.get(v1);
                if(v2 != null && ((SupportActionModeWrapper)v2).mWrappedObject == arg5) {
                    return ((ActionMode)v2);
                }
            }

            SupportActionModeWrapper v0_1 = new SupportActionModeWrapper(this.mContext, arg5);
            this.mActionModes.add(v0_1);
            return ((ActionMode)v0_1);
        }

        private Menu getMenuWrapper(Menu arg3) {
            Object v0 = this.mMenus.get(arg3);
            if(v0 == null) {
                Menu v0_1 = MenuWrapperFactory.wrapSupportMenu(this.mContext, arg3);
                this.mMenus.put(arg3, v0_1);
            }

            return ((Menu)v0);
        }

        public boolean onActionItemClicked(androidx.appcompat.view.ActionMode arg3, MenuItem arg4) {
            return this.mWrappedCallback.onActionItemClicked(this.getActionModeWrapper(arg3), MenuWrapperFactory.wrapSupportMenuItem(this.mContext, ((SupportMenuItem)arg4)));
        }

        public boolean onCreateActionMode(androidx.appcompat.view.ActionMode arg2, Menu arg3) {
            return this.mWrappedCallback.onCreateActionMode(this.getActionModeWrapper(arg2), this.getMenuWrapper(arg3));
        }

        public void onDestroyActionMode(androidx.appcompat.view.ActionMode arg2) {
            this.mWrappedCallback.onDestroyActionMode(this.getActionModeWrapper(arg2));
        }

        public boolean onPrepareActionMode(androidx.appcompat.view.ActionMode arg2, Menu arg3) {
            return this.mWrappedCallback.onPrepareActionMode(this.getActionModeWrapper(arg2), this.getMenuWrapper(arg3));
        }
    }

    final Context mContext;
    final androidx.appcompat.view.ActionMode mWrappedObject;

    public SupportActionModeWrapper(Context arg1, androidx.appcompat.view.ActionMode arg2) {
        super();
        this.mContext = arg1;
        this.mWrappedObject = arg2;
    }

    public void finish() {
        this.mWrappedObject.finish();
    }

    public View getCustomView() {
        return this.mWrappedObject.getCustomView();
    }

    public Menu getMenu() {
        return MenuWrapperFactory.wrapSupportMenu(this.mContext, this.mWrappedObject.getMenu());
    }

    public MenuInflater getMenuInflater() {
        return this.mWrappedObject.getMenuInflater();
    }

    public CharSequence getSubtitle() {
        return this.mWrappedObject.getSubtitle();
    }

    public Object getTag() {
        return this.mWrappedObject.getTag();
    }

    public CharSequence getTitle() {
        return this.mWrappedObject.getTitle();
    }

    public boolean getTitleOptionalHint() {
        return this.mWrappedObject.getTitleOptionalHint();
    }

    public void invalidate() {
        this.mWrappedObject.invalidate();
    }

    public boolean isTitleOptional() {
        return this.mWrappedObject.isTitleOptional();
    }

    public void setCustomView(View arg2) {
        this.mWrappedObject.setCustomView(arg2);
    }

    public void setSubtitle(int arg2) {
        this.mWrappedObject.setSubtitle(arg2);
    }

    public void setSubtitle(CharSequence arg2) {
        this.mWrappedObject.setSubtitle(arg2);
    }

    public void setTag(Object arg2) {
        this.mWrappedObject.setTag(arg2);
    }

    public void setTitle(int arg2) {
        this.mWrappedObject.setTitle(arg2);
    }

    public void setTitle(CharSequence arg2) {
        this.mWrappedObject.setTitle(arg2);
    }

    public void setTitleOptionalHint(boolean arg2) {
        this.mWrappedObject.setTitleOptionalHint(arg2);
    }
}

