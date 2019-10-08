package androidx.constraintlayout.solver.widgets;

import java.util.ArrayList;

public class ChainHead {
    private boolean mDefined;
    protected ConstraintWidget mFirst;
    protected ConstraintWidget mFirstMatchConstraintWidget;
    protected ConstraintWidget mFirstVisibleWidget;
    protected boolean mHasComplexMatchWeights;
    protected boolean mHasDefinedWeights;
    protected boolean mHasUndefinedWeights;
    protected ConstraintWidget mHead;
    private boolean mIsRtl;
    protected ConstraintWidget mLast;
    protected ConstraintWidget mLastMatchConstraintWidget;
    protected ConstraintWidget mLastVisibleWidget;
    private int mOrientation;
    protected float mTotalWeight;
    protected ArrayList mWeightedMatchConstraintsWidgets;
    protected int mWidgetsCount;
    protected int mWidgetsMatchCount;

    public ChainHead(ConstraintWidget arg2, int arg3, boolean arg4) {
        super();
        this.mTotalWeight = 0f;
        this.mIsRtl = false;
        this.mFirst = arg2;
        this.mOrientation = arg3;
        this.mIsRtl = arg4;
    }

    public void define() {
        if(!this.mDefined) {
            this.defineChainProperties();
        }

        this.mDefined = true;
    }

    private void defineChainProperties() {
        int v1 = 2;
        int v0 = this.mOrientation * 2;
        boolean v3 = false;
        ConstraintWidget v4 = this.mFirst;
        int v2;
        for(v2 = 0; v2 == 0; v2 = 1) {
            ++this.mWidgetsCount;
            ConstraintWidget v8 = null;
            v4.mListNextVisibleWidget[this.mOrientation] = v8;
            v4.mListNextMatchConstraintsWidget[this.mOrientation] = v8;
            if(v4.getVisibility() != 8) {
                if(this.mFirstVisibleWidget == null) {
                    this.mFirstVisibleWidget = v4;
                }

                if(this.mLastVisibleWidget != null) {
                    this.mLastVisibleWidget.mListNextVisibleWidget[this.mOrientation] = v4;
                }

                this.mLastVisibleWidget = v4;
                if(v4.mListDimensionBehaviors[this.mOrientation] != DimensionBehaviour.MATCH_CONSTRAINT) {
                    goto label_89;
                }

                if(v4.mResolvedMatchConstraintDefault[this.mOrientation] != 0 && v4.mResolvedMatchConstraintDefault[this.mOrientation] != 3 && v4.mResolvedMatchConstraintDefault[this.mOrientation] != v1) {
                    goto label_89;
                }

                ++this.mWidgetsMatchCount;
                float v6 = v4.mWeight[this.mOrientation];
                if(v6 > 0f) {
                    this.mTotalWeight += v4.mWeight[this.mOrientation];
                }

                if(ChainHead.isMatchConstraintEqualityCandidate(v4, this.mOrientation)) {
                    if(v6 < 0f) {
                        this.mHasUndefinedWeights = true;
                    }
                    else {
                        this.mHasDefinedWeights = true;
                    }

                    if(this.mWeightedMatchConstraintsWidgets == null) {
                        this.mWeightedMatchConstraintsWidgets = new ArrayList();
                    }

                    this.mWeightedMatchConstraintsWidgets.add(v4);
                }

                if(this.mFirstMatchConstraintWidget == null) {
                    this.mFirstMatchConstraintWidget = v4;
                }

                if(this.mLastMatchConstraintWidget != null) {
                    this.mLastMatchConstraintWidget.mListNextMatchConstraintsWidget[this.mOrientation] = v4;
                }

                this.mLastMatchConstraintWidget = v4;
            }

        label_89:
            ConstraintAnchor v6_1 = v4.mListAnchors[v0 + 1].mTarget;
            if(v6_1 != null) {
                ConstraintWidget v6_2 = v6_1.mOwner;
                if(v6_2.mListAnchors[v0].mTarget != null) {
                    if(v6_2.mListAnchors[v0].mTarget.mOwner != v4) {
                    }
                    else {
                        v8 = v6_2;
                    }
                }
            }

            if(v8 != null) {
                v4 = v8;
                continue;
            }
        }

        this.mLast = v4;
        this.mHead = this.mOrientation != 0 || !this.mIsRtl ? this.mFirst : this.mLast;
        if((this.mHasDefinedWeights) && (this.mHasUndefinedWeights)) {
            v3 = true;
        }

        this.mHasComplexMatchWeights = v3;
    }

    public ConstraintWidget getFirst() {
        return this.mFirst;
    }

    public ConstraintWidget getFirstMatchConstraintWidget() {
        return this.mFirstMatchConstraintWidget;
    }

    public ConstraintWidget getFirstVisibleWidget() {
        return this.mFirstVisibleWidget;
    }

    public ConstraintWidget getHead() {
        return this.mHead;
    }

    public ConstraintWidget getLast() {
        return this.mLast;
    }

    public ConstraintWidget getLastMatchConstraintWidget() {
        return this.mLastMatchConstraintWidget;
    }

    public ConstraintWidget getLastVisibleWidget() {
        return this.mLastVisibleWidget;
    }

    public float getTotalWeight() {
        return this.mTotalWeight;
    }

    private static boolean isMatchConstraintEqualityCandidate(ConstraintWidget arg2, int arg3) {
        boolean v2;
        if(arg2.getVisibility() == 8 || arg2.mListDimensionBehaviors[arg3] != DimensionBehaviour.MATCH_CONSTRAINT) {
        label_16:
            v2 = false;
        }
        else {
            if(arg2.mResolvedMatchConstraintDefault[arg3] != 0 && arg2.mResolvedMatchConstraintDefault[arg3] != 3) {
                goto label_16;
            }

            v2 = true;
        }

        return v2;
    }
}

