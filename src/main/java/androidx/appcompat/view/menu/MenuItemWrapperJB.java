package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ActionProvider$VisibilityListener;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider$VisibilityListener;

@RequiresApi(value=16) @RestrictTo(value={Scope.LIBRARY_GROUP}) class MenuItemWrapperJB extends MenuItemWrapperICS {
    class ActionProviderWrapperJB extends ActionProviderWrapper implements ActionProvider$VisibilityListener {
        VisibilityListener mListener;

        public ActionProviderWrapperJB(MenuItemWrapperJB arg1, Context arg2, ActionProvider arg3) {
            MenuItemWrapperJB.this = arg1;
            super(((MenuItemWrapperICS)arg1), arg2, arg3);
        }

        public boolean isVisible() {
            return this.mInner.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean arg2) {
            if(this.mListener != null) {
                this.mListener.onActionProviderVisibilityChanged(arg2);
            }
        }

        public View onCreateActionView(MenuItem arg2) {
            return this.mInner.onCreateActionView(arg2);
        }

        public boolean overridesItemVisibility() {
            return this.mInner.overridesItemVisibility();
        }

        public void refreshVisibility() {
            this.mInner.refreshVisibility();
        }

        public void setVisibilityListener(VisibilityListener arg2) {
            ActionProviderWrapperJB v2;
            this.mListener = arg2;
            ActionProvider v0 = this.mInner;
            if(arg2 != null) {
                v2 = this;
            }
            else {
                ActionProvider$VisibilityListener v2_1 = null;
            }

            v0.setVisibilityListener(((ActionProvider$VisibilityListener)v2));
        }
    }

    MenuItemWrapperJB(Context arg1, SupportMenuItem arg2) {
        super(arg1, arg2);
    }

    ActionProviderWrapper createActionProviderWrapper(ActionProvider arg3) {
        return new ActionProviderWrapperJB(this, this.mContext, arg3);
    }
}

