package com.jagex.mobilesdk.payments;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build$VERSION;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$RecycledViewPool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.jagex.mobilesdk.R$dimen;
import com.jagex.mobilesdk.R$id;
import com.jagex.mobilesdk.R$integer;
import com.jagex.mobilesdk.R$layout;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.comms.FetchImageComms$FetchImageCallback;
import com.jagex.mobilesdk.payments.comms.PaymentComms;
import com.jagex.mobilesdk.payments.model.JagexCategory;
import com.jagex.mobilesdk.payments.utils.CategoryListInteractionListener;
import com.jagex.mobilesdk.payments.utils.NonScrollingLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CategoryListRecyclerViewAdapter extends Adapter {
    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView$ViewHolder {
        @BindView(value=0x7F0C00C5) TextView categoryDescription;
        @BindView(value=0x7F0C00C6) EditText categoryDescriptionCollapse;
        @BindView(value=0x7F0C0056) ImageView categoryImage;
        @BindView(value=0x7F0C002B) RecyclerView categoryItemsRecycler;
        @BindView(value=0x7F0C007B) RelativeLayout categoryProductsContainer;
        @BindView(value=0x7F0C00C9) TextView categoryTitle;
        @BindView(value=0x7F0C00CA) TextView categoryTitleCollapse;
        @BindView(value=0x7F0C0031) LinearLayout collapsedContainer;
        ConstraintSet existingConstraints;
        Boolean hasShownFirstFiveProducts;
        Boolean hasShownMoreProducts;
        @BindView(value=0x7F0C0058) RelativeLayout includeMoreItems;
        Boolean isExpanded;
        CategoryItemsRecyclerViewAdapter itemsAdapter;
        JagexCategory jagexCategory;
        @BindView(value=0x7F0C00C4) TextView moreItems;
        @BindView(value=0x7F0C00CB) TextView plusMark;
        @BindView(value=0x7F0C00CC) TextView txt_privacyPolicy;
        @BindView(value=0x7F0C00CE) TextView txt_termsConditions;
        public final View view;

        ViewHolder(CategoryListRecyclerViewAdapter arg2, View arg3) {
            CategoryListRecyclerViewAdapter.this = arg2;
            super(arg3);
            this.isExpanded = Boolean.valueOf(false);
            this.hasShownMoreProducts = Boolean.valueOf(false);
            this.hasShownFirstFiveProducts = Boolean.valueOf(false);
            this.view = arg3;
            ButterKnife.bind(this, arg3);
            this.existingConstraints = new ConstraintSet();
        }

        @OnClick(value={0x7F0C00CC}) public void onClickPrivacyPolicy(View arg3) {
            CategoryListRecyclerViewAdapter.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jagex.com/terms/privacy")));
        }

        @OnClick(value={0x7F0C0058}) public void onClickShowMore(View arg3) {
            CategoryListRecyclerViewAdapter.this.listener.onShowHideMoreProducts(CategoryListRecyclerViewAdapter.this.showMoreProducts ^ 1, arg3.getTag().intValue());
        }

        @OnClick(value={0x7F0C00CE}) public void onClickTermsConditions(View arg3) {
            CategoryListRecyclerViewAdapter.this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.jagex.com/terms")));
        }
    }

    private final float CATEGORY_DESCRIPTION_COLLAPSE_FONT_SCALE;
    private final float CATEGORY_DESCRIPTION_FONT_SCALE;
    private final float CATEGORY_TITLE_COLLAPSE_FONT_SCALE;
    private final float CATEGORY_TITLE_FONT_SCALE;
    private final float FONT_SCALE_THRESHOLD;
    private int categoryExpandedAtPosition;
    private Context context;
    private boolean isCategoryViewCollapsedMode;
    private final List jagexCategories;
    private final CategoryListInteractionListener listener;
    private int moreProductsShownAtPosition;
    private float pivotX;
    private float pivotY;
    private RecycledViewPool recycledViewPool;
    private boolean showMoreProducts;
    private final CategoryListViewController viewController;

    CategoryListRecyclerViewAdapter(Context arg3, CategoryListInteractionListener arg4, CategoryListViewController arg5) {
        super();
        this.isCategoryViewCollapsedMode = true;
        this.categoryExpandedAtPosition = -1;
        this.showMoreProducts = false;
        this.moreProductsShownAtPosition = -1;
        this.FONT_SCALE_THRESHOLD = 1.05f;
        this.CATEGORY_TITLE_FONT_SCALE = 0.5f;
        this.CATEGORY_DESCRIPTION_FONT_SCALE = 0.75f;
        this.CATEGORY_TITLE_COLLAPSE_FONT_SCALE = 0.75f;
        this.CATEGORY_DESCRIPTION_COLLAPSE_FONT_SCALE = 0.75f;
        this.jagexCategories = new ArrayList();
        this.listener = arg4;
        this.viewController = arg5;
        this.context = arg3;
        this.recycledViewPool = new RecycledViewPool();
    }

    static boolean access$000(CategoryListRecyclerViewAdapter arg0) {
        return arg0.isCategoryViewCollapsedMode;
    }

    static boolean access$002(CategoryListRecyclerViewAdapter arg0, boolean arg1) {
        arg0.isCategoryViewCollapsedMode = arg1;
        return arg1;
    }

    static int access$102(CategoryListRecyclerViewAdapter arg0, int arg1) {
        arg0.categoryExpandedAtPosition = arg1;
        return arg1;
    }

    static CategoryListInteractionListener access$200(CategoryListRecyclerViewAdapter arg0) {
        return arg0.listener;
    }

    static Context access$300(CategoryListRecyclerViewAdapter arg0) {
        return arg0.context;
    }

    static boolean access$400(CategoryListRecyclerViewAdapter arg0) {
        return arg0.showMoreProducts;
    }

    public void filterCategory(int arg5) {
        ArrayList v0 = new ArrayList();
        Iterator v1 = this.jagexCategories.iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            if((((JagexCategory)v2).getCategoryID() & arg5) == 0) {
                continue;
            }

            v0.add(v2);
        }

        if(v0.size() > 0) {
            this.setCategories(((List)v0));
        }
    }

    public int getItemCount() {
        return this.jagexCategories.size();
    }

    public long getItemId(int arg3) {
        return ((long)this.jagexCategories.get(arg3).hashCode());
    }

    public int getPositionForCategoryID(int arg4) {
        Iterator v0 = this.jagexCategories.iterator();
        int v1;
        for(v1 = 0; v0.hasNext(); ++v1) {
            if(v0.next().getCategoryID() == arg4) {
                return v1;
            }
        }

        return -1;
    }

    private void layout_Views_For_Collapsed_Mode(ViewHolder arg7, int arg8) {
        arg7.isExpanded = Boolean.valueOf(false);
        arg7.hasShownFirstFiveProducts = Boolean.valueOf(false);
        arg7.hasShownMoreProducts = Boolean.valueOf(false);
        this.showMoreProducts = false;
        int v1 = -1;
        this.moreProductsShownAtPosition = v1;
        arg7.txt_privacyPolicy.setVisibility(4);
        arg7.txt_termsConditions.setVisibility(4);
        if(arg7.existingConstraints != null) {
            arg7.moreItems.setText(R$string.show_more);
            arg7.plusMark.setText("+");
            arg7.existingConstraints.applyTo(arg7.view);
        }

        arg7.collapsedContainer.setVisibility(0);
        arg7.includeMoreItems.setVisibility(8);
        arg7.categoryDescription.setVisibility(8);
        arg7.categoryTitle.setVisibility(8);
        arg7.categoryItemsRecycler.setVisibility(8);
        PaymentComms.FetchImageComms(arg7.jagexCategory.getImageCollapsed(), new FetchImageCallback(arg7) {
            public void onFetchImageResult(CommsResult arg3, Exception arg4) {
                if(arg3.responseCode == 200 && CategoryListRecyclerViewAdapter.this.context != null && arg3 != null) {
                    this.val$holder.categoryImage.setBackground(new BitmapDrawable(CategoryListRecyclerViewAdapter.this.context.getResources(), arg3.getResultValue()));
                }
            }
        }, true);
        arg7.categoryTitleCollapse.setText(arg7.jagexCategory.getName().toUpperCase());
        float v2 = this.context.getResources().getConfiguration().fontScale;
        arg7.categoryDescriptionCollapse.setText(arg7.jagexCategory.getShortDescription());
        if(v2 > 1.05f) {
            float v5 = 0.75f / v2;
            arg7.categoryTitleCollapse.setTextScaleX(v5);
            arg7.categoryDescriptionCollapse.setTextScaleX(v5);
        }

        arg7.view.getLayoutParams().width = ((int)this.context.getResources().getDimension(R$dimen.package_collapsed_width));
        arg7.view.getLayoutParams().height = v1;
        if(arg8 != 0) {
            ViewGroup$LayoutParams v8 = arg7.view.getLayoutParams();
            ValueAnimator v0 = ValueAnimator.ofInt(new int[]{((int)this.context.getResources().getDimension(R$dimen.package_list_start_margin)), 0});
            v0.addUpdateListener(new ValueAnimator$AnimatorUpdateListener(((LayoutParams)v8), arg7) {
                public void onAnimationUpdate(ValueAnimator arg2) {
                    this.val$params.setMarginStart(arg2.getAnimatedValue().intValue());
                    this.val$holder.view.setLayoutParams(this.val$params);
                }
            });
            v0.setDuration(((long)this.context.getResources().getInteger(R$integer.package_collapse_duration)));
            v0.start();
        }
    }

    private void layout_Views_For_Expanded_Mode(ViewHolder arg18, int arg19) {
        Spanned v6;
        Spanned v4;
        CategoryListRecyclerViewAdapter v0 = this;
        ViewHolder v1 = arg18;
        int v2 = arg19;
        float v3 = v0.context.getResources().getConfiguration().fontScale;
        v1.collapsedContainer.setVisibility(8);
        v1.categoryDescription.setVisibility(0);
        v1.categoryTitle.setVisibility(0);
        v1.txt_privacyPolicy.setVisibility(0);
        v1.txt_termsConditions.setVisibility(0);
        PaymentComms.FetchImageComms(v1.jagexCategory.getImageExpanded(), new FetchImageCallback(v1) {
            public void onFetchImageResult(CommsResult arg3, Exception arg4) {
                if(arg3.responseCode == 200 && CategoryListRecyclerViewAdapter.this.context != null && arg3 != null) {
                    this.val$holder.categoryImage.setBackground(new BitmapDrawable(CategoryListRecyclerViewAdapter.this.context.getResources(), arg3.getResultValue()));
                }
            }
        }, true);
        if(Build$VERSION.SDK_INT >= 24) {
            v4 = Html.fromHtml(v1.jagexCategory.getName().toUpperCase(), 0);
            v6 = Html.fromHtml(v1.jagexCategory.getLongDescription(), 0);
        }
        else {
            v4 = Html.fromHtml(v1.jagexCategory.getName().toUpperCase());
            v6 = Html.fromHtml(v1.jagexCategory.getLongDescription());
        }

        v1.categoryTitle.setText(((CharSequence)v4));
        v1.categoryDescription.setText(((CharSequence)v6));
        if(v3 > 1.05f) {
            v1.categoryTitle.setTextScaleX(0.5f / v3);
            v1.categoryDescription.setTextScaleX(0.75f / v3);
            v1.categoryDescription.setHeight(((int)((((double)v1.categoryDescription.getHeight())) * 0.75)));
        }

        v1.view.getLayoutParams().width = ((int)v0.context.getResources().getDimension(R$dimen.package_expanded_width));
        v1.view.getLayoutParams().height = -1;
        if(!v1.isExpanded.booleanValue()) {
            ScaleAnimation v3_1 = new ScaleAnimation(0f, 1f, 1f, 1f, 1, v0.pivotX, 1, v0.pivotY);
            v3_1.setInterpolator(new LinearInterpolator());
            v3_1.setFillAfter(false);
            v3_1.setDuration(((long)v0.context.getResources().getInteger(R$integer.expand_duration)));
            v1.view.setAnimation(((Animation)v3_1));
        }

        if((v1.isExpanded.booleanValue()) || v0.categoryExpandedAtPosition != v2 || (v1.hasShownFirstFiveProducts.booleanValue())) {
            if(!v1.isExpanded.booleanValue() && !v1.hasShownFirstFiveProducts.booleanValue()) {
                this.loadProductsAdapter(arg18, arg19);
                goto label_208;
            }

            if((v0.showMoreProducts) && v2 == v0.moreProductsShownAtPosition) {
                ConstraintSet v2_1 = new ConstraintSet();
                View v3_2 = v1.view;
                v2_1.clone(((ConstraintLayout)v3_2));
                v1.existingConstraints.clone(((ConstraintLayout)v3_2));
                v2_1.clear(R$id.txt_PackageTitle, 3);
                v2_1.clear(R$id.txt_PackageDescription, 3);
                v2_1.clear(R$id.productsPackageContainer, 3);
                v2_1.connect(R$id.txt_PackageTitle, 4, 0, 3);
                v2_1.connect(R$id.txt_PackageDescription, 4, 0, 3);
                v2_1.connect(R$id.productsPackageContainer, 3, 0, 3);
                v2_1.setMargin(R$id.txt_PackageDescription, 4, 50);
                v2_1.setMargin(R$id.productsPackageContainer, 3, ((int)v0.context.getResources().getDimension(R$dimen.show_more_products_top_margin_expanded)));
                v2_1.constrainHeight(R$id.productsPackageContainer, -2);
                ChangeBounds v4_1 = new ChangeBounds();
                v4_1.setInterpolator(new BounceInterpolator());
                v4_1.setDuration(((long)v0.context.getResources().getInteger(R$integer.show_more_products_duration)));
                TransitionManager.beginDelayedTransition(((ViewGroup)v3_2), ((Transition)v4_1));
                v2_1.applyTo(((ConstraintLayout)v3_2));
                v1.moreItems.setText(R$string.show_less);
                v1.plusMark.setText("-");
                v1.hasShownMoreProducts = Boolean.valueOf(true);
                goto label_208;
            }

            if(!v1.hasShownMoreProducts.booleanValue()) {
                goto label_208;
            }

            View v2_2 = v1.view;
            ChangeBounds v3_3 = new ChangeBounds();
            v3_3.setInterpolator(new BounceInterpolator());
            v3_3.setDuration(((long)v0.context.getResources().getInteger(R$integer.show_more_products_duration)));
            TransitionManager.beginDelayedTransition(((ViewGroup)v2_2), ((Transition)v3_3));
            v1.existingConstraints.applyTo(((ConstraintLayout)v2_2));
            v1.moreItems.setText(R$string.show_more);
            v1.plusMark.setText("+");
            v1.hasShownMoreProducts = Boolean.valueOf(false);
        }
        else {
            this.loadProductsAdapter(arg18, arg19);
        }

    label_208:
        v1.isExpanded = Boolean.valueOf(true);
    }

    private void loadProductsAdapter(ViewHolder arg8, int arg9) {
        int v1 = 3;
        int v2 = 8;
        if(arg8.jagexCategory.getProducts().size() > v1) {
            arg8.includeMoreItems.setVisibility(0);
            arg8.includeMoreItems.setTag(Integer.valueOf(arg9));
        }
        else {
            arg8.includeMoreItems.setVisibility(v2);
        }

        NonScrollingLayoutManager v9 = new NonScrollingLayoutManager(this.context, v1);
        v9.setItemPrefetchEnabled(true);
        v9.setInitialPrefetchItemCount(v2);
        arg8.categoryItemsRecycler.setLayoutManager(((LayoutManager)v9));
        arg8.itemsAdapter = new CategoryItemsRecyclerViewAdapter(arg8.jagexCategory, this.listener, this.viewController, this.context);
        arg8.categoryItemsRecycler.setOverScrollMode(2);
        arg8.categoryItemsRecycler.setRecycledViewPool(this.recycledViewPool);
        arg8.categoryItemsRecycler.setHasFixedSize(true);
        arg8.categoryItemsRecycler.setItemViewCacheSize(v2);
        arg8.categoryItemsRecycler.setNestedScrollingEnabled(false);
        arg8.categoryItemsRecycler.setAdapter(arg8.itemsAdapter);
        arg8.categoryItemsRecycler.setVisibility(0);
        arg8.hasShownFirstFiveProducts = Boolean.valueOf(true);
    }

    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder arg1, int arg2) {
        this.onBindViewHolder(((ViewHolder)arg1), arg2);
    }

    public void onBindViewHolder(ViewHolder arg4, int arg5) {
        arg4.jagexCategory = this.jagexCategories.get(arg5);
        if(arg5 == 0) {
            if(this.jagexCategories.size() > 1) {
                arg4.view.getLayoutParams().setMarginStart(((int)this.context.getResources().getDimension(R$dimen.package_list_start_margin)));
            }
        }
        else if(arg5 == this.jagexCategories.size() - 1) {
            arg4.view.getLayoutParams().setMarginEnd(((int)this.context.getResources().getDimension(R$dimen.package_list_end_margin)));
        }
        else {
            ViewGroup$LayoutParams v0 = arg4.view.getLayoutParams();
            ((LayoutParams)v0).setMarginStart(0);
            ((LayoutParams)v0).setMarginEnd(0);
        }

        if(this.isCategoryViewCollapsedMode) {
            this.layout_Views_For_Collapsed_Mode(arg4, arg5);
        }
        else {
            this.layout_Views_For_Expanded_Mode(arg4, arg5);
        }

        arg4.view.setOnClickListener(new View$OnClickListener(arg5) {
            public void onClick(View arg3) {
                if(CategoryListRecyclerViewAdapter.this.isCategoryViewCollapsedMode) {
                    CategoryListRecyclerViewAdapter.this.isCategoryViewCollapsedMode ^= 1;
                    CategoryListRecyclerViewAdapter.this.categoryExpandedAtPosition = this.val$position;
                    CategoryListRecyclerViewAdapter.this.listener.setCategoryExpandCollapseDetails(CategoryListRecyclerViewAdapter.this.isCategoryViewCollapsedMode, this.val$position);
                }
            }
        });
    }

    public androidx.recyclerview.widget.RecyclerView$ViewHolder onCreateViewHolder(ViewGroup arg1, int arg2) {
        return this.onCreateViewHolder(arg1, arg2);
    }

    public ViewHolder onCreateViewHolder(ViewGroup arg3, int arg4) {
        return new ViewHolder(this, LayoutInflater.from(arg3.getContext()).inflate(R$layout.package_expand_collapsed, arg3, false));
    }

    void setCategories(List arg2) {
        this.jagexCategories.clear();
        this.jagexCategories.addAll(((Collection)arg2));
    }

    void setExpandCollapseMode(boolean arg1) {
        this.isCategoryViewCollapsedMode = arg1;
        this.moreProductsShownAtPosition = -1;
    }

    void setExpandedPosition(int arg1) {
        this.categoryExpandedAtPosition = arg1;
    }

    void setPivotX(float arg1) {
        this.pivotX = arg1;
    }

    void setPivotY(float arg1) {
        this.pivotY = arg1;
    }

    void showMoreProducts(boolean arg1, int arg2) {
        this.showMoreProducts = arg1;
        if(arg1) {
        }
        else {
            arg2 = -1;
        }

        this.moreProductsShownAtPosition = arg2;
    }
}

