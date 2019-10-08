package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.CallSuper;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$animator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.Positioning;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    private Map importantForAccessibilityMap;

    public FabTransformationSheetBehavior() {
        super();
    }

    public FabTransformationSheetBehavior(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
    }

    protected FabTransformationSpec onCreateMotionSpec(Context arg3, boolean arg4) {
        int v4 = arg4 ? R$animator.mtrl_fab_transformation_sheet_expand_spec : R$animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationSpec v0 = new FabTransformationSpec();
        v0.timings = MotionSpec.createFromResource(arg3, v4);
        v0.positioning = new Positioning(17, 0f, 0f);
        return v0;
    }

    @CallSuper protected boolean onExpandedStateChange(View arg1, View arg2, boolean arg3, boolean arg4) {
        this.updateImportantForAccessibility(arg2, arg3);
        return super.onExpandedStateChange(arg1, arg2, arg3, arg4);
    }

    private void updateImportantForAccessibility(View arg9, boolean arg10) {
        ViewParent v0 = arg9.getParent();
        if(!(v0 instanceof CoordinatorLayout)) {
            return;
        }

        int v1 = ((CoordinatorLayout)v0).getChildCount();
        int v3 = 16;
        if(Build$VERSION.SDK_INT >= v3 && (arg10)) {
            this.importantForAccessibilityMap = new HashMap(v1);
        }

        int v4;
        for(v4 = 0; v4 < v1; ++v4) {
            View v5 = ((CoordinatorLayout)v0).getChildAt(v4);
            int v6 = !(v5.getLayoutParams() instanceof LayoutParams) || !(v5.getLayoutParams().getBehavior() instanceof FabTransformationScrimBehavior) ? 0 : 1;
            if(v5 != arg9) {
                if(v6 != 0) {
                }
                else if(arg10) {
                    if(Build$VERSION.SDK_INT >= v3) {
                        this.importantForAccessibilityMap.put(v5, Integer.valueOf(v5.getImportantForAccessibility()));
                    }

                    ViewCompat.setImportantForAccessibility(v5, 4);
                }
                else if(this.importantForAccessibilityMap != null && (this.importantForAccessibilityMap.containsKey(v5))) {
                    ViewCompat.setImportantForAccessibility(v5, this.importantForAccessibilityMap.get(v5).intValue());
                }
            }
        }

        if(!arg10) {
            this.importantForAccessibilityMap = null;
        }
    }
}

