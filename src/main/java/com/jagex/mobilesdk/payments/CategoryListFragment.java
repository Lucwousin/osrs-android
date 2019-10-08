package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog$Builder;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView$ItemAnimator;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R$bool;
import com.jagex.mobilesdk.R$integer;
import com.jagex.mobilesdk.R$layout;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigParcel;
import com.jagex.mobilesdk.payments.inappbilling.BillingMessages;
import com.jagex.mobilesdk.payments.utils.CategoryListInteractionListener;
import com.jagex.mobilesdk.payments.utils.JagexSnapHelper;
import com.jagex.mobilesdk.payments.utils.RecyclerViewItemDecorator;
import java.util.List;

public class CategoryListFragment extends Fragment implements CategoryListViewListener {
    private CategoryListRecyclerViewAdapter adapter;
    private int categoryID;
    private JagexConfig configuration;
    private int expandedItemPosition;
    private int initialCategory;
    private boolean isCollapse;
    private CategoryListInteractionListener listener;
    @BindView(value=0x7F0C0074) ConstraintLayout packageLayout;
    @BindView(value=0x7F0C002C) RecyclerView recyclerView;
    private JagexSnapHelper snapHelper;
    private CategoryListViewController viewController;

    public CategoryListFragment() {
        super();
    }

    static CategoryListRecyclerViewAdapter access$000(CategoryListFragment arg0) {
        return arg0.adapter;
    }

    static int access$100(CategoryListFragment arg0) {
        return arg0.categoryID;
    }

    static int access$200(CategoryListFragment arg0) {
        return arg0.initialCategory;
    }

    static CategoryListViewController access$300(CategoryListFragment arg0) {
        return arg0.viewController;
    }

    static CategoryListViewController access$400(CategoryListFragment arg0) {
        return arg0.getViewController();
    }

    static int access$500(CategoryListFragment arg0) {
        return arg0.expandedItemPosition;
    }

    static boolean access$600(CategoryListFragment arg0) {
        return arg0.isCollapse;
    }

    static void access$700(CategoryListFragment arg0, int arg1, boolean arg2) {
        arg0.loadCategoriesProducts(arg1, arg2);
    }

    static JagexSnapHelper access$800(CategoryListFragment arg0) {
        return arg0.snapHelper;
    }

    public void billingInitialiseAttempt(int arg1) {
        if(arg1 == 0) {
            this.getViewController().checkNetwork();
        }
        else {
            this.onDisplayMessage(BillingMessages.getErrorMessage(arg1));
        }
    }

    public void collapseExpandedCategoriesView() {
        this.adapter.setExpandedPosition(-1);
        this.adapter.setExpandCollapseMode(true);
        this.isCollapse = true;
        this.startExpandCollapseSelectedView();
        this.expandCollapseRemainingViews();
    }

    public void expandCollapseRemainingViews() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public void run() {
                int v1;
                for(v1 = 0; v1 < CategoryListFragment.this.adapter.getItemCount(); ++v1) {
                    if(v1 != CategoryListFragment.this.expandedItemPosition) {
                        CategoryListFragment.this.recyclerView.getAdapter().notifyItemChanged(v1);
                    }
                }

                CategoryListFragment.this.recyclerView.getLayoutManager().scrollToPosition(CategoryListFragment.this.expandedItemPosition);
                if(!CategoryListFragment.this.isCollapse) {
                    CategoryListFragment.this.recyclerView.smoothScrollBy(1, 0);
                    CategoryListFragment.this.loadCategoriesProducts(CategoryListFragment.this.expandedItemPosition, CategoryListFragment.this.isCollapse);
                }

                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        this.this$1.this$0.snapHelper.setSnapPosition(-1);
                    }
                }, ((long)CategoryListFragment.this.getContext().getResources().getInteger(R$integer.snap_reset_delay)));
            }
        });
    }

    private CategoryListViewController getViewController() {
        if(this.viewController == null) {
            this.viewController = new CategoryListViewController(((CategoryListViewListener)this), this.getActivity(), this.configuration);
        }

        return this.viewController;
    }

    private void loadCategoriesProducts(int arg4, boolean arg5) {
        ItemAnimator v0 = this.recyclerView.getItemAnimator();
        this.recyclerView.setItemAnimator(null);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(arg5, arg4, v0) {
            public void run() {
                if(!this.val$collapse) {
                    int v0;
                    for(v0 = 0; v0 < CategoryListFragment.this.recyclerView.getAdapter().getItemCount(); ++v0) {
                        if(v0 != this.val$position) {
                            CategoryListFragment.this.adapter.notifyItemChanged(v0);
                        }
                    }
                }

                CategoryListFragment.this.recyclerView.setItemAnimator(this.val$currentAnimator);
            }
        }, ((long)this.getContext().getResources().getInteger(R$integer.package_list_load_delay)));
    }

    public void onAttach(Context arg3) {
        super.onAttach(arg3);
        if((arg3 instanceof CategoryListInteractionListener)) {
            this.listener = ((CategoryListInteractionListener)arg3);
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append(arg3.toString());
        v1.append(" must implement OnListFragmentInteractionListener");
        throw new RuntimeException(v1.toString());
    }

    public void onCategoriesLoaded(List arg2) {
        this.runOnParentActivity(new Runnable(arg2) {
            public void run() {
                CategoryListFragment.this.adapter.setCategories(this.val$categories);
                CategoryListFragment.this.adapter.filterCategory(CategoryListFragment.this.categoryID);
                if(CategoryListFragment.this.initialCategory != 15) {
                    int v0 = this.val$categories == null || this.val$categories.size() <= 1 ? 0 : CategoryListFragment.this.adapter.getPositionForCategoryID(CategoryListFragment.this.initialCategory);
                    CategoryListFragment.this.adapter.setExpandCollapseMode(false);
                    CategoryListFragment.this.adapter.setExpandedPosition(v0);
                    CategoryListFragment.this.setExpandCollapseDetails(false, v0);
                    CategoryListFragment.this.recyclerView.scrollToPosition(v0);
                    return;
                }

                CategoryListFragment.this.adapter.setExpandCollapseMode(true);
                CategoryListFragment.this.adapter.setExpandedPosition(0);
                CategoryListFragment.this.setExpandCollapseDetails(true, 0);
                CategoryListFragment.this.recyclerView.setItemViewCacheSize(this.val$categories.size() - 1);
                CategoryListFragment.this.recyclerView.getLayoutManager().setInitialPrefetchItemCount(this.val$categories.size() - 1);
                CategoryListFragment.this.recyclerView.setDrawingCacheQuality(0x80000);
                CategoryListFragment.this.adapter.notifyDataSetChanged();
                CategoryListFragment.this.recyclerView.scrollToPosition(this.val$categories.size() - 1);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        this.this$1.this$0.recyclerView.scrollToPosition(0);
                    }
                }, 50);
                CategoryListFragment.this.viewController.queryPendingTransactions();
            }
        });
    }

    public void onCreate(Bundle arg3) {
        super.onCreate(arg3);
        arg3 = this.getActivity().getIntent().getExtras();
        Parcelable v0 = arg3.getParcelable(MobilePaymentService.EXTRA_CONFIG);
        this.categoryID = arg3.getInt(MobilePaymentService.PACKAGE_CONFIG);
        this.initialCategory = arg3.getInt(MobilePaymentService.SELECTED_CONFIG);
        this.configuration = ((JagexConfigParcel)v0).getConfig();
        this.getViewController();
    }

    public View onCreateView(LayoutInflater arg4, ViewGroup arg5, Bundle arg6) {
        View v4 = arg4.inflate(R$layout.fragment_package_list, arg5, false);
        ButterKnife.bind(this, v4);
        this.adapter = new CategoryListRecyclerViewAdapter(this.getContext(), this.listener, this.viewController);
        this.adapter.setHasStableIds(true);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), 0, false));
        this.recyclerView.addItemDecoration(new RecyclerViewItemDecorator(this.getContext()));
        this.recyclerView.setHasFixedSize(true);
        this.recyclerView.setDrawingCacheEnabled(true);
        this.recyclerView.getLayoutManager().setItemPrefetchEnabled(true);
        this.recyclerView.setDrawingCacheQuality(0x100000);
        this.snapHelper = new JagexSnapHelper();
        this.recyclerView.getItemAnimator().setSupportsChangeAnimations(false);
        this.recyclerView.setAdapter(this.adapter);
        this.recyclerView.setOverScrollMode(2);
        return v4;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDetach() {
        super.onDetach();
        CategoryListInteractionListener v0 = null;
        this.listener = v0;
        if(this.viewController != null) {
            this.viewController.onDetach();
            this.viewController = ((CategoryListViewController)v0);
        }
    }

    public void onDisplayMessage(int arg2) {
        this.runOnParentActivity(new Runnable(arg2) {
            public void run() {
                Toast.makeText(CategoryListFragment.this.getContext(), this.val$message, 1).show();
            }
        });
    }

    public void onInternetStateChanged(boolean arg1) {
    }

    public void onPendingPurchasesAvailable() {
        this.runOnParentActivity(new Runnable() {
            public void run() {
                Builder v0 = new Builder(CategoryListFragment.this.getContext());
                v0.setTitle(R$string.PENDING_TRANSACTIONS);
                v0.setMessage(R$string.PENDING_TRANSACTION_MESSAGE).setCancelable(false).setPositiveButton(R$string.YES, new DialogInterface$OnClickListener() {
                    public void onClick(DialogInterface arg3, int arg4) {
                        this.this$1.this$0.getViewController().applyUnconsumedPurchases(true, null);
                        arg3.cancel();
                    }
                }).setNegativeButton(R$string.NO, new DialogInterface$OnClickListener() {
                    public void onClick(DialogInterface arg3, int arg4) {
                        this.this$1.this$0.getViewController().applyUnconsumedPurchases(false, null);
                        arg3.cancel();
                    }
                });
                v0.create().show();
            }
        });
    }

    public void onShopLoaded(String arg2, String arg3) {
        if(this.listener != null) {
            this.listener.onShopLoaded(arg2, arg3);
        }
    }

    public void onStart() {
        super.onStart();
    }

    public void onSuccessfulConsumption() {
    }

    public void purchaseProduct(SkuDetails arg3) {
        this.getViewController().buyProduct(arg3, null);
    }

    public void returnToGame() {
        if(this.listener != null) {
            this.listener.finish();
        }
    }

    private void runOnParentActivity(Runnable arg2) {
        FragmentActivity v0 = this.getActivity();
        if(v0 != null) {
            ((Activity)v0).runOnUiThread(arg2);
        }
    }

    public void setExpandCollapseDetails(boolean arg2, int arg3) {
        this.isCollapse = arg2;
        this.expandedItemPosition = arg3;
        this.recyclerView.smoothScrollBy(5, 0);
        this.startExpandCollapseSelectedView();
        this.expandCollapseRemainingViews();
    }

    public void showHideMoreProducts(boolean arg2, int arg3) {
        this.adapter.showMoreProducts(arg2, arg3);
        this.adapter.notifyItemChanged(arg3);
    }

    private void startExpandCollapseSelectedView() {
        ViewGroup$LayoutParams v0 = this.recyclerView.getLayoutParams();
        if(this.isCollapse) {
            if(this.listener != null) {
                this.listener.onCollapsePackages();
            }

            this.snapHelper.attachToRecyclerView(null);
            ((LayoutParams)v0).width = -2;
            this.recyclerView.setLayoutParams(v0);
        }
        else {
            ((LayoutParams)v0).width = -1;
            this.recyclerView.setLayoutParams(v0);
            this.snapHelper.attachToRecyclerView(this.recyclerView);
            LayoutManager v0_1 = this.recyclerView.getLayoutManager();
            if(((LinearLayoutManager)v0_1).findLastCompletelyVisibleItemPosition() == this.expandedItemPosition) {
                this.adapter.setPivotX(1f);
                this.adapter.setPivotY(1f);
                goto label_48;
            }

            if(((LinearLayoutManager)v0_1).findFirstVisibleItemPosition() == this.expandedItemPosition) {
                this.adapter.setPivotX(0f);
                this.adapter.setPivotY(0f);
                goto label_48;
            }

            this.adapter.setPivotX(0.5f);
            this.adapter.setPivotY(0.5f);
        }

    label_48:
        this.recyclerView.invalidate();
        this.snapHelper.setSnapPosition(this.expandedItemPosition);
        this.recyclerView.getAdapter().notifyItemChanged(this.expandedItemPosition);
        if(this.recyclerView.getAdapter().getItemCount() < 3) {
            if(this.getResources().getBoolean(R$bool.isTablet)) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        CategoryListFragment.this.recyclerView.scrollToPosition(CategoryListFragment.this.expandedItemPosition);
                    }
                }, 5);
            }
            else {
                this.recyclerView.scrollToPosition(this.expandedItemPosition);
            }
        }
    }
}

