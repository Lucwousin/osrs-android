package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.constraint.R$id;
import android.support.constraint.R$styleable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.solver.widgets.Helper;
import java.util.Arrays;

public abstract class ConstraintHelper extends View {
    protected int mCount;
    protected Helper mHelperWidget;
    protected int[] mIds;
    private String mReferenceIds;
    protected boolean mUseViewMeasure;
    protected Context myContext;

    public ConstraintHelper(Context arg3) {
        super(arg3);
        this.mIds = new int[0x20];
        this.mCount = 0;
        this.mHelperWidget = null;
        this.mUseViewMeasure = false;
        this.myContext = arg3;
        this.init(null);
    }

    public ConstraintHelper(Context arg3, AttributeSet arg4) {
        super(arg3, arg4);
        this.mIds = new int[0x20];
        this.mCount = 0;
        this.mHelperWidget = null;
        this.mUseViewMeasure = false;
        this.myContext = arg3;
        this.init(arg4);
    }

    public ConstraintHelper(Context arg2, AttributeSet arg3, int arg4) {
        super(arg2, arg3, arg4);
        this.mIds = new int[0x20];
        this.mCount = 0;
        this.mHelperWidget = null;
        this.mUseViewMeasure = false;
        this.myContext = arg2;
        this.init(arg3);
    }

    private void addID(String arg6) {
        int v2;
        if(arg6 == null) {
            return;
        }

        if(this.myContext == null) {
            return;
        }

        arg6 = arg6.trim();
        Object v0 = null;
        try {
            v2 = R$id.class.getField(arg6).getInt(v0);
        }
        catch(Exception ) {
            v2 = 0;
        }

        if(v2 == 0) {
            v2 = this.myContext.getResources().getIdentifier(arg6, "id", this.myContext.getPackageName());
        }

        if(v2 == 0 && (this.isInEditMode()) && ((this.getParent() instanceof ConstraintLayout))) {
            Object v1 = this.getParent().getDesignInformation(0, arg6);
            if(v1 != null && ((v1 instanceof Integer))) {
                v2 = ((Integer)v1).intValue();
            }
        }

        if(v2 != 0) {
            this.setTag(v2, v0);
        }
        else {
            Log.w("ConstraintHelper", "Could not find id of \"" + arg6 + "\"");
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.mCount);
    }

    protected void init(AttributeSet arg5) {
        if(arg5 != null) {
            TypedArray v5 = this.getContext().obtainStyledAttributes(arg5, R$styleable.ConstraintLayout_Layout);
            int v0 = v5.getIndexCount();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                int v2 = v5.getIndex(v1);
                if(v2 == R$styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.mReferenceIds = v5.getString(v2);
                    this.setIds(this.mReferenceIds);
                }
            }
        }
    }

    public void onDraw(Canvas arg1) {
    }

    protected void onMeasure(int arg2, int arg3) {
        if(this.mUseViewMeasure) {
            super.onMeasure(arg2, arg3);
        }
        else {
            this.setMeasuredDimension(0, 0);
        }
    }

    private void setIds(String arg4) {
        if(arg4 == null) {
            return;
        }

        int v0;
        for(v0 = 0; true; v0 = v1 + 1) {
            int v1 = arg4.indexOf(44, v0);
            if(v1 == -1) {
                break;
            }

            this.addID(arg4.substring(v0, v1));
        }

        this.addID(arg4.substring(v0));
    }

    public void setReferencedIds(int[] arg4) {
        int v0 = 0;
        this.mCount = 0;
        while(v0 < arg4.length) {
            this.setTag(arg4[v0], null);
            ++v0;
        }
    }

    public void setTag(int arg2, Object arg3) {
        if(this.mCount + 1 > this.mIds.length) {
            this.mIds = Arrays.copyOf(this.mIds, this.mIds.length * 2);
        }

        this.mIds[this.mCount] = arg2;
        ++this.mCount;
    }

    public void updatePostLayout(ConstraintLayout arg1) {
    }

    public void updatePostMeasure(ConstraintLayout arg1) {
    }

    public void updatePreLayout(ConstraintLayout arg4) {
        if(this.isInEditMode()) {
            this.setIds(this.mReferenceIds);
        }

        if(this.mHelperWidget == null) {
            return;
        }

        this.mHelperWidget.removeAllIds();
        int v0;
        for(v0 = 0; v0 < this.mCount; ++v0) {
            View v1 = arg4.findViewById(this.mIds[v0]);
            if(v1 != null) {
                this.mHelperWidget.add(arg4.getViewWidget(v1));
            }
        }
    }

    public void validateParams() {
        if(this.mHelperWidget == null) {
            return;
        }

        ViewGroup$LayoutParams v0 = this.getLayoutParams();
        if((v0 instanceof LayoutParams)) {
            ((LayoutParams)v0).widget = this.mHelperWidget;
        }
    }
}

