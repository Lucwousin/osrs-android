package androidx.constraintlayout.widget;

import android.content.Context;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup$LayoutParams;

public class Group extends ConstraintHelper {
    public Group(Context arg1) {
        super(arg1);
    }

    public Group(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
    }

    public Group(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
    }

    protected void init(AttributeSet arg1) {
        super.init(arg1);
        this.mUseViewMeasure = false;
    }

    public void updatePostLayout(ConstraintLayout arg3) {
        ViewGroup$LayoutParams v3 = this.getLayoutParams();
        ((LayoutParams)v3).widget.setWidth(0);
        ((LayoutParams)v3).widget.setHeight(0);
    }

    public void updatePreLayout(ConstraintLayout arg8) {
        int v0 = this.getVisibility();
        int v2 = 21;
        float v1 = Build$VERSION.SDK_INT >= v2 ? this.getElevation() : 0f;
        int v4;
        for(v4 = 0; v4 < this.mCount; ++v4) {
            View v5 = arg8.getViewById(this.mIds[v4]);
            if(v5 != null) {
                v5.setVisibility(v0);
                if(v1 > 0f && Build$VERSION.SDK_INT >= v2) {
                    v5.setElevation(v1);
                }
            }
        }
    }
}

