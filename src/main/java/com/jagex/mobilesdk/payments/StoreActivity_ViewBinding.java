package com.jagex.mobilesdk.payments;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jagex.mobilesdk.R$id;

public class StoreActivity_ViewBinding implements Unbinder {
    protected StoreActivity target;
    private View view2131492900;
    private View view2131492901;

    @UiThread public StoreActivity_ViewBinding(StoreActivity arg5, View arg6) {
        super();
        this.target = arg5;
        View v0 = Utils.findRequiredView(arg6, R$id.btn_CollapseCategory, "field \'collapseCategory\' and method \'onCollapseCategoryClicked\'");
        arg5.collapseCategory = Utils.castView(v0, R$id.btn_CollapseCategory, "field \'collapseCategory\'", RelativeLayout.class);
        this.view2131492901 = v0;
        v0.setOnClickListener(new DebouncingOnClickListener(arg5) {
            public void doClick(View arg2) {
                this.val$target.onCollapseCategoryClicked(arg2);
            }
        });
        arg5.shopLogo = Utils.findRequiredViewAsType(arg6, R$id.shopLogo, "field \'shopLogo\'", ImageView.class);
        arg5.shopParentLayout = Utils.findRequiredViewAsType(arg6, R$id.coordinatorLayout, "field \'shopParentLayout\'", ConstraintLayout.class);
        arg6 = Utils.findRequiredView(arg6, R$id.btn_BackToGame, "method \'onBackToGameClicked\'");
        this.view2131492900 = arg6;
        arg6.setOnClickListener(new DebouncingOnClickListener(arg5) {
            public void doClick(View arg2) {
                this.val$target.onBackToGameClicked(arg2);
            }
        });
    }

    @CallSuper public void unbind() {
        StoreActivity v0 = this.target;
        if(v0 != null) {
            v0.collapseCategory = null;
            v0.shopLogo = null;
            v0.shopParentLayout = null;
            this.view2131492901.setOnClickListener(null);
            this.view2131492901 = null;
            this.view2131492900.setOnClickListener(null);
            this.view2131492900 = null;
            this.target = null;
            return;
        }

        throw new IllegalStateException("Bindings already cleared.");
    }
}

