package com.jagex.mobilesdk.payments;

import android.app.AlertDialog$Builder;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.jagex.mobilesdk.R$color;
import com.jagex.mobilesdk.R$dimen;
import com.jagex.mobilesdk.R$layout;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.payments.model.JagexCategory;
import com.jagex.mobilesdk.payments.model.JagexProduct;
import com.jagex.mobilesdk.payments.utils.CategoryListInteractionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;

public class CategoryItemsRecyclerViewAdapter extends Adapter {
    public class ViewHolder extends androidx.recyclerview.widget.RecyclerView$ViewHolder {
        @BindView(value=0x7F0C00C1) TextView itemPrice;
        JagexProduct jagexProduct;
        @BindView(value=0x7F0C00C2) TextView originalPrice;
        @BindView(value=0x7F0C0026) RelativeLayout purchaseButton;
        @BindView(value=0x7F0C0027) TextView purchaseButtonText;
        @BindView(value=0x7F0C0057) ImageView recommended;
        @BindView(value=0x7F0C00CD) TextView savings;
        int shopCategory;
        @BindView(value=0x7F0C00C7) TextView subTitle;
        @BindView(value=0x7F0C00C8) TextView title;
        @BindView(value=0x7F0C00C3) TextView trialOffer;
        public final View view;

        ViewHolder(CategoryItemsRecyclerViewAdapter arg1, View arg2) {
            CategoryItemsRecyclerViewAdapter.this = arg1;
            super(arg2);
            this.view = arg2;
            ButterKnife.bind(this, arg2);
        }

        public void resetHolderTextViews() {
            this.savings.setText("");
            this.originalPrice.setText("");
            this.trialOffer.setText("");
            this.title.setText("");
            this.subTitle.setText("");
            this.itemPrice.setText("");
        }
    }

    private final float CATEGORY_ITEMS_FONT_SCALE;
    private final float FONT_SCALE_THRESHOLD;
    private final float PRICE_DIVISOR;
    private static final int PRODUCT_TITLE_LENGTH_THRESHOLD = 4;
    private final Context context;
    private final float fontScale;
    private final CategoryListInteractionListener listener;
    private float maximumPricePerUnit;
    private final List products;
    private final int shopCategory;
    private final CategoryListViewController viewController;

    CategoryItemsRecyclerViewAdapter(JagexCategory arg9, CategoryListInteractionListener arg10, CategoryListViewController arg11, Context arg12) {
        super();
        float v0 = 1000000f;
        this.PRICE_DIVISOR = v0;
        float v1 = 1.05f;
        this.FONT_SCALE_THRESHOLD = v1;
        float v2 = 1f;
        this.CATEGORY_ITEMS_FONT_SCALE = v2;
        this.products = new ArrayList();
        this.shopCategory = arg9.getCategoryID();
        Iterator v9 = arg9.getProducts().iterator();
        while(v9.hasNext()) {
            Object v3 = v9.next();
            if(((JagexProduct)v3).getSkuItem() == null) {
                continue;
            }

            this.products.add(v3);
        }

        this.maximumPricePerUnit = 0f;
        Iterator v3_1 = this.products.iterator();
        while(v3_1.hasNext()) {
            Object v4 = v3_1.next();
            String v5 = ((JagexProduct)v4).getTitle();
            if(v5 == null) {
                continue;
            }

            if(v5.isEmpty()) {
                continue;
            }

            if(!TextUtils.isDigitsOnly(((CharSequence)v5))) {
                continue;
            }

            float v5_1 = Float.parseFloat(v5);
            if(0f == v5_1) {
                continue;
            }

            float v4_1 = (((float)((JagexProduct)v4).getSkuItem().getPriceAmountMicros())) / v0 / v5_1;
            if(v4_1 <= this.maximumPricePerUnit) {
                continue;
            }

            this.maximumPricePerUnit = v4_1;
        }

        this.listener = arg10;
        this.viewController = arg11;
        this.context = arg12;
        Configuration v9_1 = this.context.getResources().getConfiguration();
        this.fontScale = v9_1.fontScale > v1 ? v2 / v9_1.fontScale : v9_1.fontScale;
    }

    static CategoryListInteractionListener access$000(CategoryItemsRecyclerViewAdapter arg0) {
        return arg0.listener;
    }

    private String getCurrencySymbol(String arg2) {
        try {
            return Currency.getInstance(arg2).getSymbol();
        }
        catch(Exception ) {
            return arg2;
        }
    }

    public int getItemCount() {
        return this.products.size();
    }

    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder arg11, int arg12) {
        int v6_1;
        StringBuilder v12_1;
        String v7;
        String v6;
        Resources v0 = this.context.getResources();
        ((ViewHolder)arg11).resetHolderTextViews();
        ((ViewHolder)arg11).shopCategory = this.shopCategory;
        ((ViewHolder)arg11).jagexProduct = this.products.get(arg12);
        String v12 = ((ViewHolder)arg11).jagexProduct.getTitle();
        int v1 = 4;
        if(v12 == null || v12.length() <= v1) {
            ((ViewHolder)arg11).title.setTextSize(0, ((float)(((int)this.context.getResources().getDimension(R$dimen.package_item_title_size)))));
            ((ViewHolder)arg11).subTitle.setTextSize(0, ((float)(((int)this.context.getResources().getDimension(R$dimen.package_item_sub_title_size)))));
        }
        else {
            ((ViewHolder)arg11).title.setTextSize(0, ((float)(((int)this.context.getResources().getDimension(R$dimen.package_item_keys_title_size)))));
            ((ViewHolder)arg11).subTitle.setTextSize(0, ((float)(((int)this.context.getResources().getDimension(R$dimen.package_item_keys_sub_title_size)))));
        }

        ((ViewHolder)arg11).title.setText(((ViewHolder)arg11).jagexProduct.getTitle().toUpperCase());
        ((ViewHolder)arg11).subTitle.setText(((ViewHolder)arg11).jagexProduct.getSubtitle().toUpperCase());
        ((ViewHolder)arg11).itemPrice.setText(((ViewHolder)arg11).jagexProduct.getSkuItem().getPrice());
        ((ViewHolder)arg11).title.setTextScaleX(this.fontScale);
        ((ViewHolder)arg11).subTitle.setTextScaleX(this.fontScale);
        ((ViewHolder)arg11).itemPrice.setTextScaleX(this.fontScale);
        if(((ViewHolder)arg11).jagexProduct.isRecommended()) {
            ((ViewHolder)arg11).recommended.setVisibility(0);
        }
        else {
            ((ViewHolder)arg11).recommended.setVisibility(8);
        }

        ((ViewHolder)arg11).view.setOnClickListener(new View$OnClickListener(((ViewHolder)arg11)) {
            public void onClick(View arg2) {
                if(CategoryItemsRecyclerViewAdapter.this.listener != null) {
                    CategoryItemsRecyclerViewAdapter.this.listener.purchaseProduct(this.val$holder.jagexProduct.getSkuItem());
                }
            }
        });
        float v3 = (((float)((ViewHolder)arg11).jagexProduct.getSkuItem().getPriceAmountMicros())) / 1000000f;
        float v4 = 0f;
        if(!v12.isEmpty() && (TextUtils.isDigitsOnly(((CharSequence)v12)))) {
            v4 = Float.parseFloat(v12);
        }

        if(((ViewHolder)arg11).jagexProduct.getSkuItem().getType().equals("subs")) {
            if(!((ViewHolder)arg11).jagexProduct.getSkuItem().getFreeTrialPeriod().isEmpty() && (this.viewController.eligibleForTrialPurchase())) {
                ((ViewHolder)arg11).purchaseButtonText.setText(R$string.SUBS_TRIAL_BUTTON_TEXT);
                v12 = ((ViewHolder)arg11).jagexProduct.getSkuItem().getFreeTrialPeriod();
                v6 = "";
                if(v12.length() >= 3) {
                    v7 = v12.substring(1, v12.length() - 1);
                    int v8 = Integer.parseInt(v7);
                    if(v12.startsWith("P")) {
                        if(v12.endsWith("D")) {
                            v12_1 = new StringBuilder();
                            v12_1.append(" + ");
                            v12_1.append(v7);
                            v12_1.append(" ");
                            v6_1 = v8 > 1 ? R$string.SHOP_DAYS_TRIAL : R$string.SHOP_DAY_TRIAL;
                            v12_1.append(v0.getString(v6_1));
                            v12_1.append(" ");
                            v6 = v12_1.toString();
                        }
                        else {
                            if(v12.endsWith("W")) {
                                v12_1 = new StringBuilder();
                                v12_1.append(" + ");
                                v12_1.append(v7);
                                v12_1.append(" ");
                                v6_1 = v8 > 1 ? R$string.SHOP_WEEKS_TRIAL : R$string.SHOP_WEEK_TRIAL;
                                v12_1.append(v0.getString(v6_1));
                                v12_1.append(" ");
                                v6 = v12_1.toString();
                                goto label_188;
                            }

                            if(!v12.endsWith("M")) {
                                goto label_188;
                            }

                            v12_1 = new StringBuilder();
                            v12_1.append(" + ");
                            v12_1.append(v7);
                            v12_1.append(" ");
                            v6_1 = v8 > 1 ? R$string.SHOP_MONTHS_TRIAL : R$string.SHOP_MONTH_TRIAL;
                            v12_1.append(v0.getString(v6_1));
                            v12_1.append(" ");
                            v6 = v12_1.toString();
                        }
                    }
                }

            label_188:
                ((ViewHolder)arg11).trialOffer.setText(((CharSequence)v6));
                ((ViewHolder)arg11).trialOffer.setVisibility(0);
                ((ViewHolder)arg11).trialOffer.setTextScaleX(this.fontScale);
            }

            DecimalFormat v12_2 = new DecimalFormat("0.00");
            ((ViewHolder)arg11).originalPrice.setVisibility(v1);
            if(v4 <= 1f) {
                goto label_226;
            }

            v12 = v12_2.format(((double)(v3 / v4)));
            v6 = this.getCurrencySymbol(((ViewHolder)arg11).jagexProduct.getSkuItem().getPriceCurrencyCode());
            v7 = v0.getString(R$string.PER_MONTH);
            TextView v8_1 = ((ViewHolder)arg11).originalPrice;
            v8_1.setText(v6 + v12 + " " + v7);
            ((ViewHolder)arg11).originalPrice.setVisibility(0);
            ((ViewHolder)arg11).originalPrice.setTextScaleX(this.fontScale);
        }

    label_226:
        ((ViewHolder)arg11).savings.setVisibility(v1);
        ((ViewHolder)arg11).savings.setText("");
        if(((ViewHolder)arg11).shopCategory != 1) {
            ((ViewHolder)arg11).savings.setVisibility(0);
            float v12_3 = this.maximumPricePerUnit * v4;
            if(v12_3 > v3 && (((double)v12_3)) > 0) {
                float v1_1 = (v12_3 - v3) / v12_3;
                NumberFormat v12_4 = NumberFormat.getPercentInstance();
                v12_4.setMinimumFractionDigits(0);
                String v3_1 = v0.getString(R$string.SAVE);
                ((ViewHolder)arg11).savings.setText(v3_1 + " " + v12_4.format(((double)v1_1)));
                ((ViewHolder)arg11).savings.setVisibility(0);
                ((ViewHolder)arg11).savings.setTextScaleX(this.fontScale);
            }
        }

        if(!((ViewHolder)arg11).jagexProduct.getSkuItem().getIntroductoryPrice().isEmpty() && (this.viewController.eligibleForIntroductoryPrice())) {
            v12 = v0.getString(R$string.SHOP_NORMALLY);
            v12 = v12 + " " + ((ViewHolder)arg11).jagexProduct.getSkuItem().getPrice();
            ((ViewHolder)arg11).itemPrice.setText(((ViewHolder)arg11).jagexProduct.getSkuItem().getIntroductoryPrice());
            ((ViewHolder)arg11).originalPrice.setText(((CharSequence)v12));
            ((ViewHolder)arg11).originalPrice.setTextColor(v0.getColor(R$color.lemon_yellow));
            ((ViewHolder)arg11).originalPrice.setVisibility(0);
            ((ViewHolder)arg11).originalPrice.setTextScaleX(this.fontScale);
        }

        if(!((ViewHolder)arg11).jagexProduct.isAvailable()) {
            ((ViewHolder)arg11).purchaseButton.setBackgroundColor(-12303292);
            AlertDialog$Builder v12_5 = new AlertDialog$Builder(this.context);
            v12_5.setTitle(R$string.PRODUCT_UNAVAILABLE).setMessage(R$string.INAPP_UNAVAILABLE_MESSAGE).setPositiveButton(R$string.OK, new DialogInterface$OnClickListener() {
                public void onClick(DialogInterface arg1, int arg2) {
                    arg1.cancel();
                }
            });
            if(((ViewHolder)arg11).jagexProduct.getSkuItem().getType().equals("subs")) {
                v12_5.setMessage(R$string.SUBS_UNAVAILABLE_MESSAGE);
            }

            ((ViewHolder)arg11).view.setOnClickListener(new View$OnClickListener(v12_5.create()) {
                public void onClick(View arg1) {
                    this.val$alertDialog.show();
                }
            });
        }
    }

    public androidx.recyclerview.widget.RecyclerView$ViewHolder onCreateViewHolder(ViewGroup arg3, int arg4) {
        return new ViewHolder(this, LayoutInflater.from(arg3.getContext()).inflate(R$layout.package_item, arg3, false));
    }
}

