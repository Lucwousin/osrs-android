package com.jagex.mobilesdk.payments;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.jagex.mobilesdk.R$id;

public class CategoryListFragment_ViewBinding implements Unbinder {
    protected CategoryListFragment target;

    @UiThread public CategoryListFragment_ViewBinding(CategoryListFragment arg4, View arg5) {
        super();
        this.target = arg4;
        arg4.recyclerView = Utils.findRequiredViewAsType(arg5, R$id.categoryList, "field \'recyclerView\'", RecyclerView.class);
        arg4.packageLayout = Utils.findRequiredViewAsType(arg5, R$id.package_layout, "field \'packageLayout\'", ConstraintLayout.class);
    }

    @CallSuper public void unbind() {
        CategoryListFragment v0 = this.target;
        if(v0 != null) {
            v0.recyclerView = null;
            v0.packageLayout = null;
            this.target = null;
            return;
        }

        throw new IllegalStateException("Bindings already cleared.");
    }
}

