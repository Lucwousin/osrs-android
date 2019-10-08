package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.support.constraint.R$styleable;
import android.util.AttributeSet;

public class Barrier extends ConstraintHelper {
    public static final int BOTTOM = 3;
    public static final int END = 6;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int START = 5;
    public static final int TOP = 2;
    private androidx.constraintlayout.solver.widgets.Barrier mBarrier;
    private int mIndicatedType;
    private int mResolvedType;

    public Barrier(Context arg1) {
        super(arg1);
        this.mIndicatedType = 0;
        this.mResolvedType = 0;
        super.setVisibility(8);
    }

    public Barrier(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.mIndicatedType = 0;
        this.mResolvedType = 0;
        super.setVisibility(8);
    }

    public Barrier(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
        this.mIndicatedType = 0;
        this.mResolvedType = 0;
        super.setVisibility(8);
    }

    public int getType() {
        return this.mIndicatedType;
    }

    protected void init(AttributeSet arg7) {
        super.init(arg7);
        this.mBarrier = new androidx.constraintlayout.solver.widgets.Barrier();
        if(arg7 != null) {
            TypedArray v7 = this.getContext().obtainStyledAttributes(arg7, R$styleable.ConstraintLayout_Layout);
            int v0 = v7.getIndexCount();
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                int v3 = v7.getIndex(v2);
                if(v3 == R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    this.setType(v7.getInt(v3, 0));
                }
                else if(v3 == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.setAllowsGoneWidget(v7.getBoolean(v3, true));
                }
            }
        }

        this.mHelperWidget = this.mBarrier;
        this.validateParams();
    }

    public void setType(int arg6) {
        this.mIndicatedType = arg6;
        this.mResolvedType = arg6;
        int v0 = 6;
        int v1 = 5;
        if(Build$VERSION.SDK_INT >= 17) {
            arg6 = 1 == this.getResources().getConfiguration().getLayoutDirection() ? 1 : 0;
            if(arg6 != 0) {
                if(this.mIndicatedType == v1) {
                    this.mResolvedType = 1;
                    goto label_40;
                }

                if(this.mIndicatedType != v0) {
                    goto label_40;
                }

                this.mResolvedType = 0;
                goto label_40;
            }

            if(this.mIndicatedType == v1) {
                this.mResolvedType = 0;
                goto label_40;
            }

            if(this.mIndicatedType != v0) {
                goto label_40;
            }

            this.mResolvedType = 1;
        }
        else if(this.mIndicatedType == v1) {
            this.mResolvedType = 0;
        }
        else if(this.mIndicatedType == v0) {
            this.mResolvedType = 1;
        }

    label_40:
        this.mBarrier.setBarrierType(this.mResolvedType);
    }
}

