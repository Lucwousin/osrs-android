package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R$id;
import com.jagex.mobilesdk.R$layout;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.comms.FetchImageComms$FetchImageCallback;
import com.jagex.mobilesdk.payments.comms.PaymentComms;
import com.jagex.mobilesdk.payments.utils.CategoryListInteractionListener;

public class StoreActivity extends AppCompatActivity implements CategoryListInteractionListener {
    @BindView(value=0x7F0C0025) RelativeLayout collapseCategory;
    private View decorView;
    @BindView(value=0x7F0C0096) ImageView shopLogo;
    @BindView(value=0x7F0C0037) ConstraintLayout shopParentLayout;

    public StoreActivity() {
        super();
    }

    @OnClick(value={0x7F0C0024}) public void onBackToGameClicked(View arg1) {
        this.finish();
    }

    public void onCategoryExpanded() {
        this.runOnUiThread(new Runnable() {
            public void run() {
                StoreActivity.this.collapseCategory.setVisibility(0);
            }
        });
        this.getSupportFragmentManager().findFragmentById(R$id.fragment_package).expandCollapseRemainingViews();
    }

    @OnClick(value={0x7F0C0025}) public void onCollapseCategoryClicked(View arg2) {
        this.getSupportFragmentManager().findFragmentById(R$id.fragment_package).collapseExpandedCategoriesView();
    }

    public void onCollapsePackages() {
        this.runOnUiThread(new Runnable() {
            public void run() {
                StoreActivity.this.collapseCategory.setVisibility(8);
            }
        });
    }

    protected void onCreate(Bundle arg2) {
        super.onCreate(arg2);
        this.setContentView(R$layout.activity_store);
        ButterKnife.bind(((Activity)this));
        this.decorView = this.getWindow().getDecorView();
        this.collapseCategory.setVisibility(4);
    }

    public void onShopLoaded(String arg2, String arg3) {
        this.runOnUiThread(new Runnable(arg2, arg3) {
            public void run() {
                Context v0 = StoreActivity.this.getApplicationContext();
                PaymentComms.FetchImageComms(this.val$logoURL, new FetchImageCallback(v0) {
                    public void onFetchImageResult(CommsResult arg3, Exception arg4) {
                        if(arg3.responseCode == 200 && this.val$storeActivityContext != null && arg3 != null) {
                            this.this$1.this$0.shopLogo.setBackground(new BitmapDrawable(this.val$storeActivityContext.getResources(), arg3.getResultValue()));
                        }
                    }
                }, true);
                PaymentComms.FetchImageComms(this.val$backgroundURL, new FetchImageCallback(v0) {
                    public void onFetchImageResult(CommsResult arg3, Exception arg4) {
                        if(arg3.responseCode == 200 && this.val$storeActivityContext != null && arg3 != null) {
                            this.this$1.this$0.shopParentLayout.setBackground(new BitmapDrawable(this.val$storeActivityContext.getResources(), arg3.getResultValue()));
                        }
                    }
                }, true);
            }
        });
    }

    public void onShowHideMoreProducts(boolean arg3, int arg4) {
        this.getSupportFragmentManager().findFragmentById(R$id.fragment_package).showHideMoreProducts(arg3, arg4);
    }

    public void onWindowFocusChanged(boolean arg2) {
        super.onWindowFocusChanged(arg2);
        if(arg2) {
            this.decorView.setSystemUiVisibility(0x1706);
        }
    }

    public void purchaseProduct(SkuDetails arg3) {
        this.getSupportFragmentManager().findFragmentById(R$id.fragment_package).purchaseProduct(arg3);
    }

    public void setCategoryExpandCollapseDetails(boolean arg3, int arg4) {
        this.getSupportFragmentManager().findFragmentById(R$id.fragment_package).setExpandCollapseDetails(arg3, arg4);
    }
}

