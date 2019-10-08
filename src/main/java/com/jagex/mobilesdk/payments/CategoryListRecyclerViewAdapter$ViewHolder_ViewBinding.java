package com.jagex.mobilesdk.payments;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.jagex.mobilesdk.R$id;

public class CategoryListRecyclerViewAdapter$ViewHolder_ViewBinding implements Unbinder {
    protected ViewHolder target;
    private View view2131492952;
    private View view2131493068;
    private View view2131493070;

    @UiThread public CategoryListRecyclerViewAdapter$ViewHolder_ViewBinding(ViewHolder arg5, View arg6) {
        super();
        this.target = arg5;
        arg5.categoryImage = Utils.findRequiredViewAsType(arg6, R$id.img_PackageImage, "field \'categoryImage\'", ImageView.class);
        arg5.categoryDescription = Utils.findRequiredViewAsType(arg6, R$id.txt_PackageDescription, "field \'categoryDescription\'", TextView.class);
        arg5.categoryTitle = Utils.findRequiredViewAsType(arg6, R$id.txt_PackageTitle, "field \'categoryTitle\'", TextView.class);
        arg5.collapsedContainer = Utils.findRequiredViewAsType(arg6, R$id.collapsed_detail_container, "field \'collapsedContainer\'", LinearLayout.class);
        arg5.categoryTitleCollapse = Utils.findRequiredViewAsType(arg6, R$id.txt_PackageTitleCollapse, "field \'categoryTitleCollapse\'", TextView.class);
        arg5.categoryDescriptionCollapse = Utils.findRequiredViewAsType(arg6, R$id.txt_PackageDescriptionCollapse, "field \'categoryDescriptionCollapse\'", EditText.class);
        arg5.categoryItemsRecycler = Utils.findRequiredViewAsType(arg6, R$id.categoryItemsList, "field \'categoryItemsRecycler\'", RecyclerView.class);
        arg5.categoryProductsContainer = Utils.findRequiredViewAsType(arg6, R$id.productsPackageContainer, "field \'categoryProductsContainer\'", RelativeLayout.class);
        arg5.moreItems = Utils.findRequiredViewAsType(arg6, R$id.txt_MoreItems, "field \'moreItems\'", TextView.class);
        arg5.plusMark = Utils.findRequiredViewAsType(arg6, R$id.txt_PlusMark, "field \'plusMark\'", TextView.class);
        View v0 = Utils.findRequiredView(arg6, R$id.includeMoreItems, "field \'includeMoreItems\' and method \'onClickShowMore\'");
        arg5.includeMoreItems = Utils.castView(v0, R$id.includeMoreItems, "field \'includeMoreItems\'", RelativeLayout.class);
        this.view2131492952 = v0;
        v0.setOnClickListener(new DebouncingOnClickListener(arg5) {
            public void doClick(View arg2) {
                this.val$target.onClickShowMore(arg2);
            }
        });
        v0 = Utils.findRequiredView(arg6, R$id.txt_privacyPolicy, "field \'txt_privacyPolicy\' and method \'onClickPrivacyPolicy\'");
        arg5.txt_privacyPolicy = Utils.castView(v0, R$id.txt_privacyPolicy, "field \'txt_privacyPolicy\'", TextView.class);
        this.view2131493068 = v0;
        v0.setOnClickListener(new DebouncingOnClickListener(arg5) {
            public void doClick(View arg2) {
                this.val$target.onClickPrivacyPolicy(arg2);
            }
        });
        arg6 = Utils.findRequiredView(arg6, R$id.txt_termsConditions, "field \'txt_termsConditions\' and method \'onClickTermsConditions\'");
        arg5.txt_termsConditions = Utils.castView(arg6, R$id.txt_termsConditions, "field \'txt_termsConditions\'", TextView.class);
        this.view2131493070 = arg6;
        arg6.setOnClickListener(new DebouncingOnClickListener(arg5) {
            public void doClick(View arg2) {
                this.val$target.onClickTermsConditions(arg2);
            }
        });
    }

    @CallSuper public void unbind() {
        ViewHolder v0 = this.target;
        if(v0 != null) {
            v0.categoryImage = null;
            v0.categoryDescription = null;
            v0.categoryTitle = null;
            v0.collapsedContainer = null;
            v0.categoryTitleCollapse = null;
            v0.categoryDescriptionCollapse = null;
            v0.categoryItemsRecycler = null;
            v0.categoryProductsContainer = null;
            v0.moreItems = null;
            v0.plusMark = null;
            v0.includeMoreItems = null;
            v0.txt_privacyPolicy = null;
            v0.txt_termsConditions = null;
            this.view2131492952.setOnClickListener(null);
            this.view2131492952 = null;
            this.view2131493068.setOnClickListener(null);
            this.view2131493068 = null;
            this.view2131493070.setOnClickListener(null);
            this.view2131493070 = null;
            this.target = null;
            return;
        }

        throw new IllegalStateException("Bindings already cleared.");
    }
}

