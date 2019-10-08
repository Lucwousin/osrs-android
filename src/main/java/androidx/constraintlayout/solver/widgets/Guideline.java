package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

public class Guideline extends ConstraintWidget {
    class androidx.constraintlayout.solver.widgets.Guideline$1 {
        static {
            androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = new int[Type.values().length];
            try {
                androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.LEFT.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
                try {
                label_9:
                    androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.RIGHT.ordinal()] = 2;
                    goto label_14;
                }
                catch(NoSuchFieldError ) {
                    try {
                    label_14:
                        androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.TOP.ordinal()] = 3;
                        goto label_19;
                    }
                    catch(NoSuchFieldError ) {
                        try {
                        label_19:
                            androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.BOTTOM.ordinal()] = 4;
                            goto label_24;
                        }
                        catch(NoSuchFieldError ) {
                            try {
                            label_24:
                                androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.BASELINE.ordinal()] = 5;
                                goto label_29;
                            }
                            catch(NoSuchFieldError ) {
                                try {
                                label_29:
                                    androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER.ordinal()] = 6;
                                    goto label_34;
                                }
                                catch(NoSuchFieldError ) {
                                    try {
                                    label_34:
                                        androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER_X.ordinal()] = 7;
                                        goto label_39;
                                    }
                                    catch(NoSuchFieldError ) {
                                        try {
                                        label_39:
                                            androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER_Y.ordinal()] = 8;
                                            goto label_44;
                                        }
                                        catch(NoSuchFieldError ) {
                                            try {
                                            label_44:
                                                androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.NONE.ordinal()] = 9;
                                                return;
                                            }
                                            catch(NoSuchFieldError ) {
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static final int HORIZONTAL = 0;
    public static final int RELATIVE_BEGIN = 1;
    public static final int RELATIVE_END = 2;
    public static final int RELATIVE_PERCENT = 0;
    public static final int RELATIVE_UNKNWON = -1;
    public static final int VERTICAL = 1;
    private ConstraintAnchor mAnchor;
    private Rectangle mHead;
    private int mHeadSize;
    private boolean mIsPositionRelaxed;
    private int mMinimumPosition;
    private int mOrientation;
    protected int mRelativeBegin;
    protected int mRelativeEnd;
    protected float mRelativePercent;

    public Guideline() {
        super();
        this.mRelativePercent = -1f;
        this.mRelativeBegin = -1;
        this.mRelativeEnd = -1;
        this.mAnchor = this.mTop;
        int v0 = 0;
        this.mOrientation = 0;
        this.mIsPositionRelaxed = false;
        this.mMinimumPosition = 0;
        this.mHead = new Rectangle();
        this.mHeadSize = 8;
        this.mAnchors.clear();
        this.mAnchors.add(this.mAnchor);
        int v1 = this.mListAnchors.length;
        while(v0 < v1) {
            this.mListAnchors[v0] = this.mAnchor;
            ++v0;
        }
    }

    public void addToSolver(LinearSystem arg10) {
        SolverVariable v0_1;
        ConstraintWidget v0 = this.getParent();
        if(v0 == null) {
            return;
        }

        ConstraintAnchor v1 = ((ConstraintWidgetContainer)v0).getAnchor(Type.LEFT);
        ConstraintAnchor v2 = ((ConstraintWidgetContainer)v0).getAnchor(Type.RIGHT);
        int v3 = this.mParent == null || this.mParent.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT ? 0 : 1;
        if(this.mOrientation == 0) {
            v1 = ((ConstraintWidgetContainer)v0).getAnchor(Type.TOP);
            v2 = ((ConstraintWidgetContainer)v0).getAnchor(Type.BOTTOM);
            if(this.mParent != null && this.mParent.mListDimensionBehaviors[1] == DimensionBehaviour.WRAP_CONTENT) {
                v3 = 1;
                goto label_35;
            }

            v3 = 0;
        }

    label_35:
        int v4 = 6;
        int v6 = -1;
        int v7 = 5;
        if(this.mRelativeBegin != v6) {
            v0_1 = arg10.createObjectVariable(this.mAnchor);
            arg10.addEquality(v0_1, arg10.createObjectVariable(v1), this.mRelativeBegin, v4);
            if(v3 != 0) {
                arg10.addGreaterThan(arg10.createObjectVariable(v2), v0_1, 0, v7);
            }
        }
        else if(this.mRelativeEnd != v6) {
            v0_1 = arg10.createObjectVariable(this.mAnchor);
            SolverVariable v2_1 = arg10.createObjectVariable(v2);
            arg10.addEquality(v0_1, v2_1, -this.mRelativeEnd, v4);
            if(v3 != 0) {
                arg10.addGreaterThan(v0_1, arg10.createObjectVariable(v1), 0, v7);
                arg10.addGreaterThan(v2_1, v0_1, 0, v7);
            }
        }
        else if(this.mRelativePercent != -1f) {
            arg10.addConstraint(LinearSystem.createRowDimensionPercent(arg10, arg10.createObjectVariable(this.mAnchor), arg10.createObjectVariable(v1), arg10.createObjectVariable(v2), this.mRelativePercent, this.mIsPositionRelaxed));
        }
    }

    public boolean allowedInBarrier() {
        return 1;
    }

    public void analyze(int arg7) {
        int v0;
        ConstraintWidget v7 = this.getParent();
        if(v7 == null) {
            return;
        }

        float v1 = -1f;
        int v2 = -1;
        if(this.getOrientation() == 1) {
            this.mTop.getResolutionNode().dependsOn(1, v7.mTop.getResolutionNode(), 0);
            this.mBottom.getResolutionNode().dependsOn(1, v7.mTop.getResolutionNode(), 0);
            if(this.mRelativeBegin != v2) {
                this.mLeft.getResolutionNode().dependsOn(1, v7.mLeft.getResolutionNode(), this.mRelativeBegin);
                this.mRight.getResolutionNode().dependsOn(1, v7.mLeft.getResolutionNode(), this.mRelativeBegin);
            }
            else if(this.mRelativeEnd != v2) {
                this.mLeft.getResolutionNode().dependsOn(1, v7.mRight.getResolutionNode(), -this.mRelativeEnd);
                this.mRight.getResolutionNode().dependsOn(1, v7.mRight.getResolutionNode(), -this.mRelativeEnd);
            }
            else if(this.mRelativePercent != v1 && v7.getHorizontalDimensionBehaviour() == DimensionBehaviour.FIXED) {
                v0 = ((int)((((float)v7.mWidth)) * this.mRelativePercent));
                this.mLeft.getResolutionNode().dependsOn(1, v7.mLeft.getResolutionNode(), v0);
                this.mRight.getResolutionNode().dependsOn(1, v7.mLeft.getResolutionNode(), v0);
            }
        }
        else {
            this.mLeft.getResolutionNode().dependsOn(1, v7.mLeft.getResolutionNode(), 0);
            this.mRight.getResolutionNode().dependsOn(1, v7.mLeft.getResolutionNode(), 0);
            if(this.mRelativeBegin != v2) {
                this.mTop.getResolutionNode().dependsOn(1, v7.mTop.getResolutionNode(), this.mRelativeBegin);
                this.mBottom.getResolutionNode().dependsOn(1, v7.mTop.getResolutionNode(), this.mRelativeBegin);
            }
            else if(this.mRelativeEnd != v2) {
                this.mTop.getResolutionNode().dependsOn(1, v7.mBottom.getResolutionNode(), -this.mRelativeEnd);
                this.mBottom.getResolutionNode().dependsOn(1, v7.mBottom.getResolutionNode(), -this.mRelativeEnd);
            }
            else if(this.mRelativePercent != v1 && v7.getVerticalDimensionBehaviour() == DimensionBehaviour.FIXED) {
                v0 = ((int)((((float)v7.mHeight)) * this.mRelativePercent));
                this.mTop.getResolutionNode().dependsOn(1, v7.mTop.getResolutionNode(), v0);
                this.mBottom.getResolutionNode().dependsOn(1, v7.mTop.getResolutionNode(), v0);
            }
        }
    }

    public void cyclePosition() {
        int v1 = -1;
        if(this.mRelativeBegin != v1) {
            this.inferRelativePercentPosition();
        }
        else if(this.mRelativePercent != -1f) {
            this.inferRelativeEndPosition();
        }
        else if(this.mRelativeEnd != v1) {
            this.inferRelativeBeginPosition();
        }
    }

    public ConstraintAnchor getAnchor() {
        return this.mAnchor;
    }

    public ConstraintAnchor getAnchor(Type arg3) {
        switch(androidx.constraintlayout.solver.widgets.Guideline$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg3.ordinal()]) {
            case 1: 
            case 2: {
                goto label_11;
            }
            case 3: 
            case 4: {
                goto label_7;
            }
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return null;
            }
        }

        goto label_16;
        return null;
    label_7:
        if(this.mOrientation != 0) {
            goto label_16;
        }

        return this.mAnchor;
    label_11:
        if(this.mOrientation == 1) {
            return this.mAnchor;
        }

    label_16:
        throw new AssertionError(arg3.name());
    }

    public ArrayList getAnchors() {
        return this.mAnchors;
    }

    public Rectangle getHead() {
        this.mHead.setBounds(this.getDrawX() - this.mHeadSize, this.getDrawY() - this.mHeadSize * 2, this.mHeadSize * 2, this.mHeadSize * 2);
        if(this.getOrientation() == 0) {
            this.mHead.setBounds(this.getDrawX() - this.mHeadSize * 2, this.getDrawY() - this.mHeadSize, this.mHeadSize * 2, this.mHeadSize * 2);
        }

        return this.mHead;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getRelativeBegin() {
        return this.mRelativeBegin;
    }

    public int getRelativeBehaviour() {
        if(this.mRelativePercent != -1f) {
            return 0;
        }

        int v1 = -1;
        if(this.mRelativeBegin != v1) {
            return 1;
        }

        if(this.mRelativeEnd != v1) {
            return 2;
        }

        return v1;
    }

    public int getRelativeEnd() {
        return this.mRelativeEnd;
    }

    public float getRelativePercent() {
        return this.mRelativePercent;
    }

    public String getType() {
        return "Guideline";
    }

    void inferRelativeBeginPosition() {
        int v0 = this.getX();
        if(this.mOrientation == 0) {
            v0 = this.getY();
        }

        this.setGuideBegin(v0);
    }

    void inferRelativeEndPosition() {
        int v0 = this.getParent().getWidth() - this.getX();
        if(this.mOrientation == 0) {
            v0 = this.getParent().getHeight() - this.getY();
        }

        this.setGuideEnd(v0);
    }

    void inferRelativePercentPosition() {
        float v0 = (((float)this.getX())) / (((float)this.getParent().getWidth()));
        if(this.mOrientation == 0) {
            v0 = (((float)this.getY())) / (((float)this.getParent().getHeight()));
        }

        this.setGuidePercent(v0);
    }

    public void setDrawOrigin(int arg5, int arg6) {
        float v1 = -1f;
        int v2 = -1;
        if(this.mOrientation == 1) {
            arg5 -= this.mOffsetX;
            if(this.mRelativeBegin != v2) {
                this.setGuideBegin(arg5);
            }
            else if(this.mRelativeEnd != v2) {
                this.setGuideEnd(this.getParent().getWidth() - arg5);
            }
            else if(this.mRelativePercent != v1) {
                this.setGuidePercent((((float)arg5)) / (((float)this.getParent().getWidth())));
            }
        }
        else {
            arg6 -= this.mOffsetY;
            if(this.mRelativeBegin != v2) {
                this.setGuideBegin(arg6);
            }
            else if(this.mRelativeEnd != v2) {
                this.setGuideEnd(this.getParent().getHeight() - arg6);
            }
            else if(this.mRelativePercent != v1) {
                this.setGuidePercent((((float)arg6)) / (((float)this.getParent().getHeight())));
            }
        }
    }

    public void setGuideBegin(int arg3) {
        int v0 = -1;
        if(arg3 > v0) {
            this.mRelativePercent = -1f;
            this.mRelativeBegin = arg3;
            this.mRelativeEnd = v0;
        }
    }

    public void setGuideEnd(int arg3) {
        int v0 = -1;
        if(arg3 > v0) {
            this.mRelativePercent = -1f;
            this.mRelativeBegin = v0;
            this.mRelativeEnd = arg3;
        }
    }

    public void setGuidePercent(float arg2) {
        if(arg2 > -1f) {
            this.mRelativePercent = arg2;
            this.mRelativeBegin = -1;
            this.mRelativeEnd = -1;
        }
    }

    public void setGuidePercent(int arg2) {
        this.setGuidePercent((((float)arg2)) / 100f);
    }

    public void setMinimumPosition(int arg1) {
        this.mMinimumPosition = arg1;
    }

    public void setOrientation(int arg4) {
        if(this.mOrientation == arg4) {
            return;
        }

        this.mOrientation = arg4;
        this.mAnchors.clear();
        this.mAnchor = this.mOrientation == 1 ? this.mLeft : this.mTop;
        this.mAnchors.add(this.mAnchor);
        arg4 = this.mListAnchors.length;
        int v0;
        for(v0 = 0; v0 < arg4; ++v0) {
            this.mListAnchors[v0] = this.mAnchor;
        }
    }

    public void setPositionRelaxed(boolean arg2) {
        if(this.mIsPositionRelaxed == arg2) {
            return;
        }

        this.mIsPositionRelaxed = arg2;
    }

    public void updateFromSolver(LinearSystem arg4) {
        if(this.getParent() == null) {
            return;
        }

        int v4 = arg4.getObjectVariableValue(this.mAnchor);
        if(this.mOrientation == 1) {
            this.setX(v4);
            this.setY(0);
            this.setHeight(this.getParent().getHeight());
            this.setWidth(0);
        }
        else {
            this.setX(0);
            this.setY(v4);
            this.setWidth(this.getParent().getWidth());
            this.setHeight(0);
        }
    }
}

