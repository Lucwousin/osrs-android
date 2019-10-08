package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

public class Barrier extends Helper {
    public static final int BOTTOM = 3;
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int TOP = 2;
    private boolean mAllowsGoneWidget;
    private int mBarrierType;
    private ArrayList mNodes;

    public Barrier() {
        super();
        this.mBarrierType = 0;
        this.mNodes = new ArrayList(4);
        this.mAllowsGoneWidget = true;
    }

    public void addToSolver(LinearSystem arg11) {
        boolean v1_1;
        int v1;
        ConstraintAnchor v0_1;
        this.mListAnchors[0] = this.mLeft;
        int v3 = 2;
        this.mListAnchors[v3] = this.mTop;
        this.mListAnchors[1] = this.mRight;
        int v5 = 3;
        this.mListAnchors[v5] = this.mBottom;
        int v0;
        for(v0 = 0; v0 < this.mListAnchors.length; ++v0) {
            this.mListAnchors[v0].mSolverVariable = arg11.createObjectVariable(this.mListAnchors[v0]);
        }

        if(this.mBarrierType >= 0 && this.mBarrierType < 4) {
            v0_1 = this.mListAnchors[this.mBarrierType];
            v1 = 0;
        }
        else {
            return;
        }

        while(v1 < this.mWidgetsCount) {
            ConstraintWidget v6 = this.mWidgets[v1];
            if((this.mAllowsGoneWidget) || (v6.allowedInBarrier())) {
                if(this.mBarrierType != 0 && this.mBarrierType != 1 || v6.getHorizontalDimensionBehaviour() != DimensionBehaviour.MATCH_CONSTRAINT) {
                    if(this.mBarrierType != v3 && this.mBarrierType != v5) {
                        goto label_63;
                    }

                    if(v6.getVerticalDimensionBehaviour() != DimensionBehaviour.MATCH_CONSTRAINT) {
                        goto label_63;
                    }
                }

                v1_1 = true;
                goto label_66;
            }
            else {
            }

        label_63:
            ++v1;
        }

        v1_1 = false;
    label_66:
        if(this.mBarrierType == 0 || this.mBarrierType == 1) {
            if(this.getParent().getHorizontalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT) {
            label_80:
                v1_1 = false;
            }
        }
        else if(this.getParent().getVerticalDimensionBehaviour() == DimensionBehaviour.WRAP_CONTENT) {
            goto label_80;
        }

        int v6_1;
        for(v6_1 = 0; v6_1 < this.mWidgetsCount; ++v6_1) {
            ConstraintWidget v7 = this.mWidgets[v6_1];
            if((this.mAllowsGoneWidget) || (v7.allowedInBarrier())) {
                SolverVariable v8 = arg11.createObjectVariable(v7.mListAnchors[this.mBarrierType]);
                v7.mListAnchors[this.mBarrierType].mSolverVariable = v8;
                if(this.mBarrierType != 0) {
                    if(this.mBarrierType == v3) {
                    }
                    else {
                        arg11.addGreaterBarrier(v0_1.mSolverVariable, v8, v1_1);
                        goto label_109;
                    }
                }

                arg11.addLowerBarrier(v0_1.mSolverVariable, v8, v1_1);
            }
            else {
            }

        label_109:
        }

        v6_1 = 5;
        int v7_1 = 6;
        if(this.mBarrierType == 0) {
            arg11.addEquality(this.mRight.mSolverVariable, this.mLeft.mSolverVariable, 0, v7_1);
            if(!v1_1) {
                arg11.addEquality(this.mLeft.mSolverVariable, this.mParent.mRight.mSolverVariable, 0, v6_1);
            }
        }
        else if(this.mBarrierType == 1) {
            arg11.addEquality(this.mLeft.mSolverVariable, this.mRight.mSolverVariable, 0, v7_1);
            if(!v1_1) {
                arg11.addEquality(this.mLeft.mSolverVariable, this.mParent.mLeft.mSolverVariable, 0, v6_1);
            }
        }
        else if(this.mBarrierType == v3) {
            arg11.addEquality(this.mBottom.mSolverVariable, this.mTop.mSolverVariable, 0, v7_1);
            if(!v1_1) {
                arg11.addEquality(this.mTop.mSolverVariable, this.mParent.mBottom.mSolverVariable, 0, v6_1);
            }
        }
        else if(this.mBarrierType == v5) {
            arg11.addEquality(this.mTop.mSolverVariable, this.mBottom.mSolverVariable, 0, v7_1);
            if(!v1_1) {
                arg11.addEquality(this.mTop.mSolverVariable, this.mParent.mTop.mSolverVariable, 0, v6_1);
            }
        }
    }

    public boolean allowedInBarrier() {
        return 1;
    }

    public void analyze(int arg5) {
        ResolutionAnchor v1_1;
        if(this.mParent == null) {
            return;
        }

        if(!this.mParent.optimizeFor(2)) {
            return;
        }

        switch(this.mBarrierType) {
            case 0: {
                goto label_20;
            }
            case 1: {
                goto label_17;
            }
            case 2: {
                goto label_14;
            }
            case 3: {
                goto label_11;
            }
        }

        return;
    label_17:
        ResolutionAnchor v5 = this.mRight.getResolutionNode();
        goto label_22;
    label_20:
        v5 = this.mLeft.getResolutionNode();
        goto label_22;
    label_11:
        v5 = this.mBottom.getResolutionNode();
        goto label_22;
    label_14:
        v5 = this.mTop.getResolutionNode();
    label_22:
        v5.setType(5);
        ResolutionAnchor v2 = null;
        if(this.mBarrierType == 0 || this.mBarrierType == 1) {
            this.mTop.getResolutionNode().resolve(v2, 0f);
            this.mBottom.getResolutionNode().resolve(v2, 0f);
        }
        else {
            this.mLeft.getResolutionNode().resolve(v2, 0f);
            this.mRight.getResolutionNode().resolve(v2, 0f);
        }

        this.mNodes.clear();
        int v0;
        for(v0 = 0; v0 < this.mWidgetsCount; ++v0) {
            ConstraintWidget v1 = this.mWidgets[v0];
            if((this.mAllowsGoneWidget) || (v1.allowedInBarrier())) {
                switch(this.mBarrierType) {
                    case 0: {
                        v1_1 = v1.mLeft.getResolutionNode();
                        break;
                    }
                    case 1: {
                        v1_1 = v1.mRight.getResolutionNode();
                        break;
                    }
                    case 2: {
                        v1_1 = v1.mTop.getResolutionNode();
                        break;
                    }
                    case 3: {
                        v1_1 = v1.mBottom.getResolutionNode();
                        break;
                    }
                    default: {
                        v1_1 = v2;
                        break;
                    }
                }

                if(v1_1 != null) {
                    this.mNodes.add(v1_1);
                    v1_1.addDependent(((ResolutionNode)v5));
                }
            }
            else {
            }
        }
    }

    public void resetResolutionNodes() {
        super.resetResolutionNodes();
        this.mNodes.clear();
    }

    public void resolve() {
        float v1 = 3.402823E+38f;
        switch(this.mBarrierType) {
            case 0: {
                goto label_15;
            }
            case 1: {
                goto label_11;
            }
            case 2: {
                goto label_8;
            }
            case 3: {
                goto label_5;
            }
        }

        return;
    label_5:
        ResolutionAnchor v0 = this.mBottom.getResolutionNode();
        goto label_13;
    label_8:
        v0 = this.mTop.getResolutionNode();
        goto label_17;
    label_11:
        v0 = this.mRight.getResolutionNode();
    label_13:
        v1 = 0f;
        goto label_17;
    label_15:
        v0 = this.mLeft.getResolutionNode();
    label_17:
        int v2 = this.mNodes.size();
        ResolutionAnchor v3 = null;
        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            Object v5 = this.mNodes.get(v4);
            if(((ResolutionAnchor)v5).state != 1) {
                return;
            }

            if(this.mBarrierType == 0 || this.mBarrierType == 2) {
                if(((ResolutionAnchor)v5).resolvedOffset < v1) {
                    v1 = ((ResolutionAnchor)v5).resolvedOffset;
                    v3 = ((ResolutionAnchor)v5).resolvedTarget;
                }
            }
            else if(((ResolutionAnchor)v5).resolvedOffset > v1) {
                v1 = ((ResolutionAnchor)v5).resolvedOffset;
                v3 = ((ResolutionAnchor)v5).resolvedTarget;
            }
        }

        if(LinearSystem.getMetrics() != null) {
            Metrics v2_1 = LinearSystem.getMetrics();
            ++v2_1.barrierConnectionResolved;
        }

        v0.resolvedTarget = v3;
        v0.resolvedOffset = v1;
        v0.didResolve();
        switch(this.mBarrierType) {
            case 0: {
                goto label_70;
            }
            case 1: {
                goto label_66;
            }
            case 2: {
                goto label_62;
            }
            case 3: {
                goto label_58;
            }
        }

        return;
    label_66:
        this.mLeft.getResolutionNode().resolve(v3, v1);
        return;
    label_70:
        this.mRight.getResolutionNode().resolve(v3, v1);
        return;
    label_58:
        this.mTop.getResolutionNode().resolve(v3, v1);
        return;
    label_62:
        this.mBottom.getResolutionNode().resolve(v3, v1);
    }

    public void setAllowsGoneWidget(boolean arg1) {
        this.mAllowsGoneWidget = arg1;
    }

    public void setBarrierType(int arg1) {
        this.mBarrierType = arg1;
    }
}

