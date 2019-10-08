package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class ConstraintWidgetContainer extends WidgetContainer {
    private static final boolean DEBUG = false;
    static final boolean DEBUG_GRAPH = false;
    private static final boolean DEBUG_LAYOUT = false;
    private static final int MAX_ITERATIONS = 8;
    private static final boolean USE_SNAPSHOT = true;
    int mDebugSolverPassCount;
    private boolean mHeightMeasuredTooSmall;
    ChainHead[] mHorizontalChainsArray;
    int mHorizontalChainsSize;
    private boolean mIsRtl;
    private int mOptimizationLevel;
    int mPaddingBottom;
    int mPaddingLeft;
    int mPaddingRight;
    int mPaddingTop;
    private Snapshot mSnapshot;
    protected LinearSystem mSystem;
    ChainHead[] mVerticalChainsArray;
    int mVerticalChainsSize;
    private boolean mWidthMeasuredTooSmall;

    public ConstraintWidgetContainer() {
        super();
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mOptimizationLevel = 3;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    public ConstraintWidgetContainer(int arg2, int arg3) {
        super(arg2, arg3);
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mOptimizationLevel = 3;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    public ConstraintWidgetContainer(int arg1, int arg2, int arg3, int arg4) {
        super(arg1, arg2, arg3, arg4);
        this.mIsRtl = false;
        this.mSystem = new LinearSystem();
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
        this.mVerticalChainsArray = new ChainHead[4];
        this.mHorizontalChainsArray = new ChainHead[4];
        this.mOptimizationLevel = 3;
        this.mWidthMeasuredTooSmall = false;
        this.mHeightMeasuredTooSmall = false;
        this.mDebugSolverPassCount = 0;
    }

    void addChain(ConstraintWidget arg2, int arg3) {
        if(arg3 == 0) {
            this.addHorizontalChain(arg2);
        }
        else if(arg3 == 1) {
            this.addVerticalChain(arg2);
        }
    }

    public boolean addChildrenToSolver(LinearSystem arg8) {
        this.addToSolver(arg8);
        int v0 = this.mChildren.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            Object v4 = this.mChildren.get(v2);
            if((v4 instanceof ConstraintWidgetContainer)) {
                DimensionBehaviour v5 = ((ConstraintWidget)v4).mListDimensionBehaviors[0];
                DimensionBehaviour v3 = ((ConstraintWidget)v4).mListDimensionBehaviors[1];
                if(v5 == DimensionBehaviour.WRAP_CONTENT) {
                    ((ConstraintWidget)v4).setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
                }

                if(v3 == DimensionBehaviour.WRAP_CONTENT) {
                    ((ConstraintWidget)v4).setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
                }

                ((ConstraintWidget)v4).addToSolver(arg8);
                if(v5 == DimensionBehaviour.WRAP_CONTENT) {
                    ((ConstraintWidget)v4).setHorizontalDimensionBehaviour(v5);
                }

                if(v3 != DimensionBehaviour.WRAP_CONTENT) {
                    goto label_33;
                }

                ((ConstraintWidget)v4).setVerticalDimensionBehaviour(v3);
            }
            else {
                Optimizer.checkMatchParent(this, arg8, ((ConstraintWidget)v4));
                ((ConstraintWidget)v4).addToSolver(arg8);
            }

        label_33:
        }

        if(this.mHorizontalChainsSize > 0) {
            Chain.applyChainConstraints(this, arg8, 0);
        }

        if(this.mVerticalChainsSize > 0) {
            Chain.applyChainConstraints(this, arg8, 1);
        }

        return 1;
    }

    private void addHorizontalChain(ConstraintWidget arg6) {
        if(this.mHorizontalChainsSize + 1 >= this.mHorizontalChainsArray.length) {
            this.mHorizontalChainsArray = Arrays.copyOf(this.mHorizontalChainsArray, this.mHorizontalChainsArray.length * 2);
        }

        this.mHorizontalChainsArray[this.mHorizontalChainsSize] = new ChainHead(arg6, 0, this.isRtl());
        ++this.mHorizontalChainsSize;
    }

    private void addVerticalChain(ConstraintWidget arg6) {
        if(this.mVerticalChainsSize + 1 >= this.mVerticalChainsArray.length) {
            this.mVerticalChainsArray = Arrays.copyOf(this.mVerticalChainsArray, this.mVerticalChainsArray.length * 2);
        }

        this.mVerticalChainsArray[this.mVerticalChainsSize] = new ChainHead(arg6, 1, this.isRtl());
        ++this.mVerticalChainsSize;
    }

    public void analyze(int arg4) {
        super.analyze(arg4);
        int v0 = this.mChildren.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mChildren.get(v1).analyze(arg4);
        }
    }

    public void fillMetrics(Metrics arg2) {
        this.mSystem.fillMetrics(arg2);
    }

    public ArrayList getHorizontalGuidelines() {
        ArrayList v0 = new ArrayList();
        int v1 = this.mChildren.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            Object v3 = this.mChildren.get(v2);
            if(((v3 instanceof Guideline)) && ((Guideline)v3).getOrientation() == 0) {
                v0.add(v3);
            }
        }

        return v0;
    }

    public int getOptimizationLevel() {
        return this.mOptimizationLevel;
    }

    public LinearSystem getSystem() {
        return this.mSystem;
    }

    public String getType() {
        return "ConstraintLayout";
    }

    public ArrayList getVerticalGuidelines() {
        ArrayList v0 = new ArrayList();
        int v1 = this.mChildren.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            Object v3 = this.mChildren.get(v2);
            if(((v3 instanceof Guideline)) && ((Guideline)v3).getOrientation() == 1) {
                v0.add(v3);
            }
        }

        return v0;
    }

    public boolean handlesInternalConstraints() {
        return 0;
    }

    public boolean isHeightMeasuredTooSmall() {
        return this.mHeightMeasuredTooSmall;
    }

    public boolean isRtl() {
        return this.mIsRtl;
    }

    public boolean isWidthMeasuredTooSmall() {
        return this.mWidthMeasuredTooSmall;
    }

    public void layout() {
        boolean v0_2;
        int v8_1;
        boolean v7_1;
        Object v12;
        ConstraintWidgetContainer v1 = this;
        int v2 = v1.mX;
        int v3 = v1.mY;
        int v4 = 0;
        int v5 = Math.max(0, this.getWidth());
        int v6 = Math.max(0, this.getHeight());
        v1.mWidthMeasuredTooSmall = false;
        v1.mHeightMeasuredTooSmall = false;
        if(v1.mParent != null) {
            if(v1.mSnapshot == null) {
                v1.mSnapshot = new Snapshot(((ConstraintWidget)v1));
            }

            v1.mSnapshot.updateFrom(((ConstraintWidget)v1));
            v1.setX(v1.mPaddingLeft);
            v1.setY(v1.mPaddingTop);
            this.resetAnchors();
            v1.resetSolverVariables(v1.mSystem.getCache());
        }
        else {
            v1.mX = 0;
            v1.mY = 0;
        }

        int v7 = 8;
        if(v1.mOptimizationLevel != 0) {
            if(!v1.optimizeFor(v7)) {
                this.optimizeReset();
            }

            this.optimize();
            v1.mSystem.graphOptimizer = true;
        }
        else {
            v1.mSystem.graphOptimizer = false;
        }

        DimensionBehaviour v9 = v1.mListDimensionBehaviors[1];
        DimensionBehaviour v10 = v1.mListDimensionBehaviors[0];
        this.resetChains();
        int v11 = v1.mChildren.size();
        int v0;
        for(v0 = 0; v0 < v11; ++v0) {
            v12 = v1.mChildren.get(v0);
            if((v12 instanceof WidgetContainer)) {
                ((WidgetContainer)v12).layout();
            }
        }

        v0 = 0;
        boolean v12_1 = true;
        int v13 = 0;
        while(v12_1) {
            int v14 = v0 + 1;
            try {
                v1.mSystem.reset();
                v1.createObjectVariables(v1.mSystem);
                for(v0 = 0; v0 < v11; ++v0) {
                    v1.mChildren.get(v0).createObjectVariables(v1.mSystem);
                }

                v7_1 = v1.addChildrenToSolver(v1.mSystem);
                if(!v7_1) {
                    goto label_96;
                }
            }
            catch(Exception v0_1) {
                goto label_86;
            }

            try {
                v1.mSystem.minimize();
                goto label_96;
            }
            catch(Exception v0_1) {
                goto label_87;
            }

        label_86:
            v7_1 = v12_1;
        label_87:
            v0_1.printStackTrace();
            PrintStream v12_2 = System.out;
            v12_2.println("EXCEPTION : " + v0_1);
        label_96:
            v0 = 2;
            if(v7_1) {
                v1.updateChildrenFromSolver(v1.mSystem, Optimizer.flags);
            }
            else {
                v1.updateFromSolver(v1.mSystem);
                v7 = 0;
                while(v7 < v11) {
                    Object v8 = v1.mChildren.get(v7);
                    if(((ConstraintWidget)v8).mListDimensionBehaviors[v4] == DimensionBehaviour.MATCH_CONSTRAINT && ((ConstraintWidget)v8).getWidth() < ((ConstraintWidget)v8).getWrapWidth()) {
                        Optimizer.flags[v0] = true;
                        break;
                    }

                    if(((ConstraintWidget)v8).mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && ((ConstraintWidget)v8).getHeight() < ((ConstraintWidget)v8).getWrapHeight()) {
                        Optimizer.flags[v0] = true;
                        break;
                    }

                    ++v7;
                    v4 = 0;
                }
            }

            v4 = 8;
            if(v14 >= v4 || !Optimizer.flags[v0]) {
                v8_1 = v13;
                v0_2 = false;
            }
            else {
                v0 = 0;
                v7 = 0;
                v8_1 = 0;
                while(v0 < v11) {
                    v12 = v1.mChildren.get(v0);
                    v7 = Math.max(v7, ((ConstraintWidget)v12).mX + ((ConstraintWidget)v12).getWidth());
                    v8_1 = Math.max(v8_1, ((ConstraintWidget)v12).mY + ((ConstraintWidget)v12).getHeight());
                    ++v0;
                }

                v0 = Math.max(v1.mMinWidth, v7);
                v7 = Math.max(v1.mMinHeight, v8_1);
                if(v10 != DimensionBehaviour.WRAP_CONTENT || this.getWidth() >= v0) {
                    v0_2 = false;
                }
                else {
                    v1.setWidth(v0);
                    v1.mListDimensionBehaviors[0] = DimensionBehaviour.WRAP_CONTENT;
                    v0_2 = true;
                    v13 = 1;
                }

                if(v9 == DimensionBehaviour.WRAP_CONTENT && this.getHeight() < v7) {
                    v1.setHeight(v7);
                    v1.mListDimensionBehaviors[1] = DimensionBehaviour.WRAP_CONTENT;
                    v0_2 = true;
                    v8_1 = 1;
                    goto label_187;
                }

                v8_1 = v13;
            }

        label_187:
            v7 = Math.max(v1.mMinWidth, this.getWidth());
            if(v7 > this.getWidth()) {
                v1.setWidth(v7);
                v1.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
                v0_2 = true;
                v8_1 = 1;
            }

            v7 = Math.max(v1.mMinHeight, this.getHeight());
            if(v7 > this.getHeight()) {
                v1.setHeight(v7);
                v12_1 = true;
                v1.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
                v0_2 = true;
                v8_1 = 1;
            }
            else {
                v12_1 = true;
            }

            if(v8_1 == 0) {
                if(v1.mListDimensionBehaviors[0] == DimensionBehaviour.WRAP_CONTENT && v5 > 0 && this.getWidth() > v5) {
                    v1.mWidthMeasuredTooSmall = v12_1;
                    v1.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
                    v1.setWidth(v5);
                    v0_2 = true;
                    v8_1 = 1;
                }

                if(v1.mListDimensionBehaviors[((int)v12_1)] != DimensionBehaviour.WRAP_CONTENT) {
                    goto label_244;
                }

                if(v6 <= 0) {
                    goto label_244;
                }

                if(this.getHeight() <= v6) {
                    goto label_244;
                }

                v1.mHeightMeasuredTooSmall = v12_1;
                v1.mListDimensionBehaviors[((int)v12_1)] = DimensionBehaviour.FIXED;
                v1.setHeight(v6);
                v12_1 = true;
                v13 = 1;
            }
            else {
            label_244:
                v12_1 = v0_2;
                v13 = v8_1;
            }

            v0 = v14;
            v4 = 0;
        }

        if(v1.mParent != null) {
            v0 = Math.max(v1.mMinWidth, this.getWidth());
            v2 = Math.max(v1.mMinHeight, this.getHeight());
            v1.mSnapshot.applyTo(((ConstraintWidget)v1));
            v1.setWidth(v0 + v1.mPaddingLeft + v1.mPaddingRight);
            v1.setHeight(v2 + v1.mPaddingTop + v1.mPaddingBottom);
        }
        else {
            v1.mX = v2;
            v1.mY = v3;
        }

        if(v13 != 0) {
            v1.mListDimensionBehaviors[0] = v10;
            v1.mListDimensionBehaviors[1] = v9;
        }

        v1.resetSolverVariables(v1.mSystem.getCache());
        if(v1 == this.getRootConstraintContainer()) {
            this.updateDrawPosition();
        }
    }

    public void optimize() {
        if(!this.optimizeFor(8)) {
            this.analyze(this.mOptimizationLevel);
        }

        this.solveGraph();
    }

    public boolean optimizeFor(int arg2) {
        boolean v2 = (this.mOptimizationLevel & arg2) == arg2 ? true : false;
        return v2;
    }

    public void optimizeForDimensions(int arg3, int arg4) {
        if(this.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT && this.mResolutionWidth != null) {
            this.mResolutionWidth.resolve(arg3);
        }

        if(this.mListDimensionBehaviors[1] != DimensionBehaviour.WRAP_CONTENT && this.mResolutionHeight != null) {
            this.mResolutionHeight.resolve(arg4);
        }
    }

    public void optimizeReset() {
        int v0 = this.mChildren.size();
        this.resetResolutionNodes();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mChildren.get(v1).resetResolutionNodes();
        }
    }

    public void preOptimize() {
        this.optimizeReset();
        this.analyze(this.mOptimizationLevel);
    }

    public void reset() {
        this.mSystem.reset();
        this.mPaddingLeft = 0;
        this.mPaddingRight = 0;
        this.mPaddingTop = 0;
        this.mPaddingBottom = 0;
        super.reset();
    }

    private void resetChains() {
        this.mHorizontalChainsSize = 0;
        this.mVerticalChainsSize = 0;
    }

    public void resetGraph() {
        ResolutionAnchor v0 = this.getAnchor(Type.LEFT).getResolutionNode();
        ResolutionAnchor v1 = this.getAnchor(Type.TOP).getResolutionNode();
        v0.invalidateAnchors();
        v1.invalidateAnchors();
        v0.resolve(null, 0f);
        v1.resolve(null, 0f);
    }

    public void setOptimizationLevel(int arg1) {
        this.mOptimizationLevel = arg1;
    }

    public void setPadding(int arg1, int arg2, int arg3, int arg4) {
        this.mPaddingLeft = arg1;
        this.mPaddingTop = arg2;
        this.mPaddingRight = arg3;
        this.mPaddingBottom = arg4;
    }

    public void setRtl(boolean arg1) {
        this.mIsRtl = arg1;
    }

    public void solveGraph() {
        ResolutionAnchor v0 = this.getAnchor(Type.LEFT).getResolutionNode();
        ResolutionAnchor v1 = this.getAnchor(Type.TOP).getResolutionNode();
        v0.resolve(null, 0f);
        v1.resolve(null, 0f);
    }

    public void updateChildrenFromSolver(LinearSystem arg9, boolean[] arg10) {
        int v1 = 2;
        arg10[v1] = false;
        this.updateFromSolver(arg9);
        int v2 = this.mChildren.size();
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            Object v4 = this.mChildren.get(v3);
            ((ConstraintWidget)v4).updateFromSolver(arg9);
            if(((ConstraintWidget)v4).mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && ((ConstraintWidget)v4).getWidth() < ((ConstraintWidget)v4).getWrapWidth()) {
                arg10[v1] = true;
            }

            if(((ConstraintWidget)v4).mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && ((ConstraintWidget)v4).getHeight() < ((ConstraintWidget)v4).getWrapHeight()) {
                arg10[v1] = true;
            }
        }
    }
}

