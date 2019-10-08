package com.jagex.mobilesdk.payments;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jagex.mobilesdk.R$id;

public class CategoryItemsRecyclerViewAdapter$ViewHolder_ViewBinding implements Unbinder {
    protected ViewHolder target;

    @UiThread public CategoryItemsRecyclerViewAdapter$ViewHolder_ViewBinding(ViewHolder arg4, View arg5) {
        super();
        this.target = arg4;
        arg4.title = Utils.findRequiredViewAsType(arg5, R$id.txt_PackageItemTitle, "field \'title\'", TextView.class);
        arg4.subTitle = Utils.findRequiredViewAsType(arg5, R$id.txt_PackageItemSubTitle, "field \'subTitle\'", TextView.class);
        arg4.itemPrice = Utils.findRequiredViewAsType(arg5, R$id.txt_ItemPrice, "field \'itemPrice\'", TextView.class);
        arg4.recommended = Utils.findRequiredViewAsType(arg5, R$id.img_Recommended, "field \'recommended\'", ImageView.class);
        arg4.purchaseButton = Utils.findRequiredViewAsType(arg5, R$id.btn_Purchase, "field \'purchaseButton\'", RelativeLayout.class);
        arg4.purchaseButtonText = Utils.findRequiredViewAsType(arg5, R$id.btn_PurchaseText, "field \'purchaseButtonText\'", TextView.class);
        arg4.savings = Utils.findRequiredViewAsType(arg5, R$id.txt_savings, "field \'savings\'", TextView.class);
        arg4.originalPrice = Utils.findRequiredViewAsType(arg5, R$id.txt_ItemPriceOriginal, "field \'originalPrice\'", TextView.class);
        arg4.trialOffer = Utils.findRequiredViewAsType(arg5, R$id.txt_ItemTrial, "field \'trialOffer\'", TextView.class);
    }

    @CallSuper public void unbind() {
        ViewHolder v0 = this.target;
        if(v0 != null) {
            v0.title = null;
            v0.subTitle = null;
            v0.itemPrice = null;
            v0.recommended = null;
            v0.purchaseButton = null;
            v0.purchaseButtonText = null;
            v0.savings = null;
            v0.originalPrice = null;
            v0.trialOffer = null;
            this.target = null;
            return;
        }

        throw new IllegalStateException("Bindings already cleared.");
    }
}

