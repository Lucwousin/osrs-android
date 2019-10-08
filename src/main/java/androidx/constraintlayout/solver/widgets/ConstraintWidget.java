package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import androidx.constraintlayout.solver.LinearSystem;
import androidx.constraintlayout.solver.Metrics;
import androidx.constraintlayout.solver.SolverVariable;
import java.util.ArrayList;

public class ConstraintWidget {
    class androidx.constraintlayout.solver.widgets.ConstraintWidget$1 {
        static {
            androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour = new int[DimensionBehaviour.values().length];
            try {
                androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.FIXED.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
            label_9:
                int v1 = 2;
                try {
                    androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.WRAP_CONTENT.ordinal()] = v1;
                    goto label_14;
                }
                catch(NoSuchFieldError ) {
                label_14:
                    int v2 = 3;
                    try {
                        androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_PARENT.ordinal()] = v2;
                        goto label_19;
                    }
                    catch(NoSuchFieldError ) {
                    label_19:
                        int v3 = 4;
                        try {
                            androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = v3;
                            goto label_24;
                        }
                        catch(NoSuchFieldError ) {
                        label_24:
                            androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type = new int[Type.values().length];
                            try {
                                androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.LEFT.ordinal()] = 1;
                                goto label_32;
                            }
                            catch(NoSuchFieldError ) {
                                try {
                                label_32:
                                    androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.TOP.ordinal()] = v1;
                                    goto label_36;
                                }
                                catch(NoSuchFieldError ) {
                                    try {
                                    label_36:
                                        androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.RIGHT.ordinal()] = v2;
                                        goto label_40;
                                    }
                                    catch(NoSuchFieldError ) {
                                        try {
                                        label_40:
                                            androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.BOTTOM.ordinal()] = v3;
                                            goto label_44;
                                        }
                                        catch(NoSuchFieldError ) {
                                            try {
                                            label_44:
                                                androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.BASELINE.ordinal()] = 5;
                                                goto label_49;
                                            }
                                            catch(NoSuchFieldError ) {
                                                try {
                                                label_49:
                                                    androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER.ordinal()] = 6;
                                                    goto label_54;
                                                }
                                                catch(NoSuchFieldError ) {
                                                    try {
                                                    label_54:
                                                        androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER_X.ordinal()] = 7;
                                                        goto label_59;
                                                    }
                                                    catch(NoSuchFieldError ) {
                                                        try {
                                                        label_59:
                                                            androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.CENTER_Y.ordinal()] = 8;
                                                            goto label_64;
                                                        }
                                                        catch(NoSuchFieldError ) {
                                                            try {
                                                            label_64:
                                                                androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[Type.NONE.ordinal()] = 9;
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
                }
            }
        }
    }

    public enum ContentAlignment {
        public static final enum ContentAlignment BEGIN;
        public static final enum ContentAlignment BOTTOM;
        public static final enum ContentAlignment END;
        public static final enum ContentAlignment LEFT;
        public static final enum ContentAlignment MIDDLE;
        public static final enum ContentAlignment RIGHT;
        public static final enum ContentAlignment TOP;
        public static final enum ContentAlignment VERTICAL_MIDDLE;

        static {
            ContentAlignment.BEGIN = new ContentAlignment("BEGIN", 0);
            ContentAlignment.MIDDLE = new ContentAlignment("MIDDLE", 1);
            ContentAlignment.END = new ContentAlignment("END", 2);
            ContentAlignment.TOP = new ContentAlignment("TOP", 3);
            ContentAlignment.VERTICAL_MIDDLE = new ContentAlignment("VERTICAL_MIDDLE", 4);
            ContentAlignment.BOTTOM = new ContentAlignment("BOTTOM", 5);
            ContentAlignment.LEFT = new ContentAlignment("LEFT", 6);
            ContentAlignment.RIGHT = new ContentAlignment("RIGHT", 7);
            ContentAlignment.$VALUES = new ContentAlignment[]{ContentAlignment.BEGIN, ContentAlignment.MIDDLE, ContentAlignment.END, ContentAlignment.TOP, ContentAlignment.VERTICAL_MIDDLE, ContentAlignment.BOTTOM, ContentAlignment.LEFT, ContentAlignment.RIGHT};
        }

        private ContentAlignment(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static ContentAlignment valueOf(String arg1) {
            return Enum.valueOf(ContentAlignment.class, arg1);
        }

        public static ContentAlignment[] values() {
            return ContentAlignment.$VALUES.clone();
        }
    }

    public enum DimensionBehaviour {
        public static final enum DimensionBehaviour FIXED;
        public static final enum DimensionBehaviour MATCH_CONSTRAINT;
        public static final enum DimensionBehaviour MATCH_PARENT;
        public static final enum DimensionBehaviour WRAP_CONTENT;

        static {
            DimensionBehaviour.FIXED = new DimensionBehaviour("FIXED", 0);
            DimensionBehaviour.WRAP_CONTENT = new DimensionBehaviour("WRAP_CONTENT", 1);
            DimensionBehaviour.MATCH_CONSTRAINT = new DimensionBehaviour("MATCH_CONSTRAINT", 2);
            DimensionBehaviour.MATCH_PARENT = new DimensionBehaviour("MATCH_PARENT", 3);
            DimensionBehaviour.$VALUES = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.WRAP_CONTENT, DimensionBehaviour.MATCH_CONSTRAINT, DimensionBehaviour.MATCH_PARENT};
        }

        private DimensionBehaviour(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static DimensionBehaviour valueOf(String arg1) {
            return Enum.valueOf(DimensionBehaviour.class, arg1);
        }

        public static DimensionBehaviour[] values() {
            return DimensionBehaviour.$VALUES.clone();
        }
    }

    protected static final int ANCHOR_BASELINE = 4;
    protected static final int ANCHOR_BOTTOM = 3;
    protected static final int ANCHOR_LEFT = 0;
    protected static final int ANCHOR_RIGHT = 1;
    protected static final int ANCHOR_TOP = 2;
    private static final boolean AUTOTAG_CENTER = false;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    public static float DEFAULT_BIAS = 0.5f;
    static final int DIMENSION_HORIZONTAL = 0;
    static final int DIMENSION_VERTICAL = 1;
    protected static final int DIRECT = 2;
    public static final int GONE = 8;
    public static final int HORIZONTAL = 0;
    public static final int INVISIBLE = 4;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_RATIO = 3;
    public static final int MATCH_CONSTRAINT_RATIO_RESOLVED = 4;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    protected static final int SOLVER = 1;
    public static final int UNKNOWN = -1;
    public static final int VERTICAL = 1;
    public static final int VISIBLE = 0;
    private static final int WRAP = -2;
    protected ArrayList mAnchors;
    ConstraintAnchor mBaseline;
    int mBaselineDistance;
    ConstraintAnchor mBottom;
    boolean mBottomHasCentered;
    ConstraintAnchor mCenter;
    ConstraintAnchor mCenterX;
    ConstraintAnchor mCenterY;
    private float mCircleConstraintAngle;
    private Object mCompanionWidget;
    private int mContainerItemSkip;
    private String mDebugName;
    protected float mDimensionRatio;
    protected int mDimensionRatioSide;
    int mDistToBottom;
    int mDistToLeft;
    int mDistToRight;
    int mDistToTop;
    private int mDrawHeight;
    private int mDrawWidth;
    private int mDrawX;
    private int mDrawY;
    int mHeight;
    float mHorizontalBiasPercent;
    boolean mHorizontalChainFixedPosition;
    int mHorizontalChainStyle;
    ConstraintWidget mHorizontalNextWidget;
    public int mHorizontalResolution;
    boolean mHorizontalWrapVisited;
    boolean mIsHeightWrapContent;
    boolean mIsWidthWrapContent;
    ConstraintAnchor mLeft;
    boolean mLeftHasCentered;
    protected ConstraintAnchor[] mListAnchors;
    protected DimensionBehaviour[] mListDimensionBehaviors;
    protected ConstraintWidget[] mListNextMatchConstraintsWidget;
    protected ConstraintWidget[] mListNextVisibleWidget;
    int mMatchConstraintDefaultHeight;
    int mMatchConstraintDefaultWidth;
    int mMatchConstraintMaxHeight;
    int mMatchConstraintMaxWidth;
    int mMatchConstraintMinHeight;
    int mMatchConstraintMinWidth;
    float mMatchConstraintPercentHeight;
    float mMatchConstraintPercentWidth;
    private int[] mMaxDimension;
    protected int mMinHeight;
    protected int mMinWidth;
    protected int mOffsetX;
    protected int mOffsetY;
    ConstraintWidget mParent;
    ResolutionDimension mResolutionHeight;
    ResolutionDimension mResolutionWidth;
    float mResolvedDimensionRatio;
    int mResolvedDimensionRatioSide;
    int[] mResolvedMatchConstraintDefault;
    ConstraintAnchor mRight;
    boolean mRightHasCentered;
    ConstraintAnchor mTop;
    boolean mTopHasCentered;
    private String mType;
    float mVerticalBiasPercent;
    boolean mVerticalChainFixedPosition;
    int mVerticalChainStyle;
    ConstraintWidget mVerticalNextWidget;
    public int mVerticalResolution;
    boolean mVerticalWrapVisited;
    private int mVisibility;
    float[] mWeight;
    int mWidth;
    private int mWrapHeight;
    private int mWrapWidth;
    protected int mX;
    protected int mY;

    static {
    }

    public ConstraintWidget() {
        super();
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1f;
        this.mMaxDimension = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.mCircleConstraintAngle = 0f;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList();
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mHorizontalBiasPercent = ConstraintWidget.DEFAULT_BIAS;
        this.mVerticalBiasPercent = ConstraintWidget.DEFAULT_BIAS;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1f, -1f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mListNextVisibleWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.addAnchors();
    }

    public ConstraintWidget(int arg2, int arg3) {
        this(0, 0, arg2, arg3);
    }

    public ConstraintWidget(int arg9, int arg10, int arg11, int arg12) {
        super();
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mResolvedMatchConstraintDefault = new int[2];
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMaxWidth = 0;
        this.mMatchConstraintPercentWidth = 1f;
        this.mMatchConstraintMinHeight = 0;
        this.mMatchConstraintMaxHeight = 0;
        this.mMatchConstraintPercentHeight = 1f;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1f;
        this.mMaxDimension = new int[]{0x7FFFFFFF, 0x7FFFFFFF};
        this.mCircleConstraintAngle = 0f;
        this.mLeft = new ConstraintAnchor(this, Type.LEFT);
        this.mTop = new ConstraintAnchor(this, Type.TOP);
        this.mRight = new ConstraintAnchor(this, Type.RIGHT);
        this.mBottom = new ConstraintAnchor(this, Type.BOTTOM);
        this.mBaseline = new ConstraintAnchor(this, Type.BASELINE);
        this.mCenterX = new ConstraintAnchor(this, Type.CENTER_X);
        this.mCenterY = new ConstraintAnchor(this, Type.CENTER_Y);
        this.mCenter = new ConstraintAnchor(this, Type.CENTER);
        this.mListAnchors = new ConstraintAnchor[]{this.mLeft, this.mRight, this.mTop, this.mBottom, this.mBaseline, this.mCenter};
        this.mAnchors = new ArrayList();
        this.mListDimensionBehaviors = new DimensionBehaviour[]{DimensionBehaviour.FIXED, DimensionBehaviour.FIXED};
        this.mParent = null;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mHorizontalBiasPercent = ConstraintWidget.DEFAULT_BIAS;
        this.mVerticalBiasPercent = ConstraintWidget.DEFAULT_BIAS;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mDebugName = null;
        this.mType = null;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mWeight = new float[]{-1f, -1f};
        this.mListNextMatchConstraintsWidget = new ConstraintWidget[]{null, null};
        this.mListNextVisibleWidget = new ConstraintWidget[]{null, null};
        this.mHorizontalNextWidget = null;
        this.mVerticalNextWidget = null;
        this.mX = arg9;
        this.mY = arg10;
        this.mWidth = arg11;
        this.mHeight = arg12;
        this.addAnchors();
        this.forceUpdateDrawPosition();
    }

    private void addAnchors() {
        this.mAnchors.add(this.mLeft);
        this.mAnchors.add(this.mTop);
        this.mAnchors.add(this.mRight);
        this.mAnchors.add(this.mBottom);
        this.mAnchors.add(this.mCenterX);
        this.mAnchors.add(this.mCenterY);
        this.mAnchors.add(this.mCenter);
        this.mAnchors.add(this.mBaseline);
    }

    public void addToSolver(LinearSystem arg39) {
        ConstraintWidget v7_2;
        LinearSystem v10_1;
        SolverVariable v31_1;
        boolean v6_1;
        SolverVariable v37;
        SolverVariable v36;
        boolean v24;
        boolean v26;
        int v28;
        int v20;
        int v30;
        int v25;
        int v29;
        SolverVariable v27;
        boolean v22;
        boolean v16;
        boolean v12;
        boolean v8;
        boolean v7;
        boolean v0;
        ConstraintWidget v15 = this;
        LinearSystem v14 = arg39;
        SolverVariable v21 = v14.createObjectVariable(v15.mLeft);
        SolverVariable v10 = v14.createObjectVariable(v15.mRight);
        SolverVariable v6 = v14.createObjectVariable(v15.mTop);
        SolverVariable v4 = v14.createObjectVariable(v15.mBottom);
        SolverVariable v3 = v14.createObjectVariable(v15.mBaseline);
        int v1 = 8;
        if(v15.mParent != null) {
            v0 = v15.mParent == null || v15.mParent.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT ? false : true;
            boolean v5 = v15.mParent == null || v15.mParent.mListDimensionBehaviors[1] != DimensionBehaviour.WRAP_CONTENT ? false : true;
            if(v15.mLeft.mTarget != null && v15.mLeft.mTarget.mTarget != v15.mLeft && v15.mRight.mTarget != null && v15.mRight.mTarget.mTarget == v15.mRight) {
                v15.mParent.addChain(v15, 0);
            }

            if(v15.mLeft.mTarget == null || v15.mLeft.mTarget.mTarget != v15.mLeft) {
                if(v15.mRight.mTarget != null && v15.mRight.mTarget.mTarget == v15.mRight) {
                label_71:
                    v7 = true;
                    goto label_74;
                }

                v7 = false;
            }
            else {
                goto label_71;
            }

        label_74:
            if(v15.mTop.mTarget != null && v15.mTop.mTarget.mTarget != v15.mTop && v15.mBottom.mTarget != null && v15.mBottom.mTarget.mTarget == v15.mBottom) {
                v15.mParent.addChain(v15, 1);
            }

            if(v15.mTop.mTarget == null || v15.mTop.mTarget.mTarget != v15.mTop) {
                if(v15.mBottom.mTarget != null && v15.mBottom.mTarget.mTarget == v15.mBottom) {
                label_108:
                    v8 = true;
                    goto label_111;
                }

                v8 = false;
            }
            else {
                goto label_108;
            }

        label_111:
            if((v0) && v15.mVisibility != v1 && v15.mLeft.mTarget == null && v15.mRight.mTarget == null) {
                v14.addGreaterThan(v14.createObjectVariable(v15.mParent.mRight), v10, 0, 1);
            }

            if((v5) && v15.mVisibility != v1 && v15.mTop.mTarget == null && v15.mBottom.mTarget == null && v15.mBaseline == null) {
                v14.addGreaterThan(v14.createObjectVariable(v15.mParent.mBottom), v4, 0, 1);
            }

            v12 = v5;
            v16 = v7;
            v22 = v8;
        }
        else {
            v0 = false;
            v12 = false;
            v16 = false;
            v22 = false;
        }

        int v5_1 = v15.mWidth;
        if(v5_1 < v15.mMinWidth) {
            v5_1 = v15.mMinWidth;
        }

        int v7_1 = v15.mHeight;
        if(v7_1 < v15.mMinHeight) {
            v7_1 = v15.mMinHeight;
        }

        v8 = v15.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT ? true : false;
        boolean v9 = v15.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT ? true : false;
        v15.mResolvedDimensionRatioSide = v15.mDimensionRatioSide;
        v15.mResolvedDimensionRatio = v15.mDimensionRatio;
        int v11 = v15.mMatchConstraintDefaultWidth;
        int v2 = v15.mMatchConstraintDefaultHeight;
        if(v15.mDimensionRatio <= 0f || v15.mVisibility == 8) {
            v27 = v3;
            v25 = v2;
            v29 = v5_1;
            v30 = v7_1;
            v20 = v11;
        label_281:
            v28 = 0;
        }
        else {
            v27 = v3;
            int v3_1 = 3;
            if(v15.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && v11 == 0) {
                v11 = 3;
            }

            if(v15.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && v2 == 0) {
                v2 = 3;
            }

            if(v15.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT || v15.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT || v11 != v3_1 || v2 != v3_1) {
                if(v15.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT && v11 == v3_1) {
                    v15.mResolvedDimensionRatioSide = 0;
                    v1 = ((int)(v15.mResolvedDimensionRatio * (((float)v15.mHeight))));
                    if(v15.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
                        v29 = v1;
                        v25 = v2;
                        v30 = v7_1;
                        v20 = 4;
                        goto label_281;
                    }
                    else {
                        v29 = v1;
                        v25 = v2;
                        goto label_272;
                    }
                }

                if(v15.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT && v2 == v3_1) {
                    v15.mResolvedDimensionRatioSide = 1;
                    if(v15.mDimensionRatioSide == -1) {
                        v15.mResolvedDimensionRatio = 1f / v15.mResolvedDimensionRatio;
                    }

                    v1 = ((int)(v15.mResolvedDimensionRatio * (((float)v15.mWidth))));
                    if(v15.mListDimensionBehaviors[0] != DimensionBehaviour.MATCH_CONSTRAINT) {
                        v30 = v1;
                        v29 = v5_1;
                        v20 = v11;
                        v25 = 4;
                        goto label_281;
                    }

                    v30 = v1;
                    v25 = v2;
                    v29 = v5_1;
                    goto label_273;
                }

            label_270:
                v25 = v2;
                v29 = v5_1;
            label_272:
                v30 = v7_1;
            }
            else {
                v15.setupDimensionRatio(v0, v12, v8, v9);
                goto label_270;
            }

        label_273:
            v20 = v11;
            v28 = 1;
        }

        v15.mResolvedMatchConstraintDefault[0] = v20;
        v15.mResolvedMatchConstraintDefault[1] = v25;
        if(v28 != 0) {
            if(v15.mResolvedDimensionRatioSide != 0) {
                if(v15.mResolvedDimensionRatioSide == -1) {
                }
                else {
                    goto label_299;
                }
            }

            v26 = true;
        }
        else {
        label_299:
            v26 = false;
        }

        boolean v31 = v15.mListDimensionBehaviors[0] != DimensionBehaviour.WRAP_CONTENT || !(v15 instanceof ConstraintWidgetContainer) ? false : true;
        int v23 = v15.mCenter.isConnected() ^ 1;
        SolverVariable v32 = null;
        if(v15.mHorizontalResolution != 2) {
            SolverVariable v33 = v15.mParent != null ? v14.createObjectVariable(v15.mParent.mRight) : v32;
            SolverVariable v34 = v15.mParent != null ? v14.createObjectVariable(v15.mParent.mLeft) : v32;
            v24 = v12;
            v36 = v27;
            v27 = v4;
            v37 = v6;
            v6_1 = v31;
            v31_1 = v10;
            this.applyConstraints(arg39, v0, v34, v33, v15.mListDimensionBehaviors[0], v6_1, v15.mLeft, v15.mRight, v15.mX, v29, v15.mMinWidth, v15.mMaxDimension[0], v15.mHorizontalBiasPercent, v26, v16, v20, v15.mMatchConstraintMinWidth, v15.mMatchConstraintMaxWidth, v15.mMatchConstraintPercentWidth, v23);
        }
        else {
            v37 = v6;
            v31_1 = v10;
            v24 = v12;
            v36 = v27;
            v27 = v4;
        }

        v15 = this;
        if(v15.mVerticalResolution == 2) {
            return;
        }

        v6_1 = v15.mListDimensionBehaviors[1] != DimensionBehaviour.WRAP_CONTENT || !(v15 instanceof ConstraintWidgetContainer) ? false : true;
        if(v28 != 0) {
            if(v15.mResolvedDimensionRatioSide != 1 && v15.mResolvedDimensionRatioSide != -1) {
                goto label_399;
            }

            v16 = true;
        }
        else {
        label_399:
            v16 = false;
        }

        if(v15.mBaselineDistance <= 0) {
            v4 = v37;
            v10_1 = arg39;
        label_430:
            v20 = v23;
        }
        else if(v15.mBaseline.getResolutionNode().state == 1) {
            v10_1 = arg39;
            v15.mBaseline.getResolutionNode().addResolvedValue(v10_1);
            v4 = v37;
            goto label_430;
        }
        else {
            v10_1 = arg39;
            v1 = 6;
            SolverVariable v2_1 = v36;
            v4 = v37;
            v10_1.addEquality(v2_1, v4, this.getBaselineDistance(), v1);
            if(v15.mBaseline.mTarget != null) {
                v10_1.addEquality(v2_1, v10_1.createObjectVariable(v15.mBaseline.mTarget), 0, v1);
                boolean v20_1 = false;
            }
            else {
                goto label_430;
            }
        }

        SolverVariable v23_1 = v15.mParent != null ? v10_1.createObjectVariable(v15.mParent.mBottom) : v32;
        v3 = v15.mParent != null ? v10_1.createObjectVariable(v15.mParent.mTop) : v32;
        boolean v2_2 = v24;
        SolverVariable v24_1 = v4;
        this.applyConstraints(arg39, v2_2, v3, v23_1, v15.mListDimensionBehaviors[1], v6_1, v15.mTop, v15.mBottom, v15.mY, v30, v15.mMinHeight, v15.mMaxDimension[1], v15.mVerticalBiasPercent, v16, v22, v25, v15.mMatchConstraintMinHeight, v15.mMatchConstraintMaxHeight, v15.mMatchConstraintPercentHeight, ((boolean)v20));
        if(v28 != 0) {
            int v6_2 = 6;
            v7_2 = this;
            if(v7_2.mResolvedDimensionRatioSide == 1) {
                arg39.addRatio(v27, v24_1, v31_1, v21, v7_2.mResolvedDimensionRatio, 6);
            }
            else {
                arg39.addRatio(v31_1, v21, v27, v24_1, v7_2.mResolvedDimensionRatio, v6_2);
            }
        }
        else {
            v7_2 = this;
        }

        if(v7_2.mCenter.isConnected()) {
            arg39.addCenterPoint(v7_2, v7_2.mCenter.getTarget().getOwner(), ((float)Math.toRadians(((double)(v7_2.mCircleConstraintAngle + 90f)))), v7_2.mCenter.getMargin());
        }
    }

    public boolean allowedInBarrier() {
        boolean v0 = this.mVisibility != 8 ? true : false;
        return v0;
    }

    public void analyze(int arg1) {
        Optimizer.analyze(arg1, this);
    }

    private void applyConstraints(LinearSystem arg31, boolean arg32, SolverVariable arg33, SolverVariable arg34, DimensionBehaviour arg35, boolean arg36, ConstraintAnchor arg37, ConstraintAnchor arg38, int arg39, int arg40, int arg41, int arg42, float arg43, boolean arg44, boolean arg45, int arg46, int arg47, int arg48, float arg49, boolean arg50) {
        SolverVariable v2_1;
        SolverVariable v13_2;
        SolverVariable v11_1;
        SolverVariable v29;
        SolverVariable v28;
        SolverVariable v8_2;
        SolverVariable v18;
        SolverVariable v17;
        int v0_1;
        int v27;
        SolverVariable v24;
        int v13_1;
        boolean v23;
        int v15_1;
        SolverVariable v20;
        ConstraintWidget v0 = this;
        LinearSystem v10 = arg31;
        SolverVariable v12 = arg34;
        int v1 = arg41;
        int v2 = arg42;
        SolverVariable v9 = v10.createObjectVariable(arg37);
        SolverVariable v7 = v10.createObjectVariable(arg38);
        SolverVariable v6 = v10.createObjectVariable(arg37.getTarget());
        SolverVariable v14 = v10.createObjectVariable(arg38.getTarget());
        long v15 = 1;
        if((v10.graphOptimizer) && arg37.getResolutionNode().state == 1 && arg38.getResolutionNode().state == 1) {
            if(LinearSystem.getMetrics() != null) {
                Metrics v1_1 = LinearSystem.getMetrics();
                v1_1.resolvedWidgets += v15;
            }

            arg37.getResolutionNode().addResolvedValue(v10);
            arg38.getResolutionNode().addResolvedValue(v10);
            if(!arg45 && (arg32)) {
                v10.addGreaterThan(v12, v7, 0, 6);
            }

            return;
        }

        if(LinearSystem.getMetrics() != null) {
            Metrics v8 = LinearSystem.getMetrics();
            v20 = v14;
            v8.nonresolvedWidgets += v15;
        }
        else {
            v20 = v14;
        }

        boolean v8_1 = arg37.isConnected();
        boolean v13 = arg38.isConnected();
        boolean v21 = v0.mCenter.isConnected();
        int v14_1 = v8_1 ? 1 : 0;
        if(v13) {
            ++v14_1;
        }

        if(v21) {
            ++v14_1;
        }

        int v11 = arg44 ? 3 : arg46;
        int v12_1 = 4;
        switch(androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintWidget$DimensionBehaviour[arg35.ordinal()]) {
            case 4: {
                if(v11 == v12_1) {
                    goto label_70;
                }
                else {
                    goto label_74;
                }
            }
            default: {
            label_70:
                v15_1 = 0;
                goto label_75;
            label_74:
                v15_1 = 1;
                break;
            }
        }

    label_75:
        int v22 = v14_1;
        if(v0.mVisibility == 8) {
            v12_1 = 0;
            v15_1 = 0;
        }
        else {
            v12_1 = arg40;
        }

        if(arg50) {
            if(!v8_1 && !v13 && !v21) {
                v10.addEquality(v9, arg39);
                goto label_97;
            }

            if(!v8_1) {
                goto label_97;
            }

            if(v13) {
                goto label_97;
            }

            v23 = v13;
            v10.addEquality(v9, v6, arg37.getMargin(), 6);
        }
        else {
        label_97:
            v23 = v13;
        }

        if(v15_1 == 0) {
            if(arg36) {
                v10.addEquality(v7, v9, 0, 3);
                if(v1 > 0) {
                    v14_1 = 6;
                    v10.addGreaterThan(v7, v9, v1, v14_1);
                }
                else {
                    v14_1 = 6;
                }

                if(v2 >= 0x7FFFFFFF) {
                    goto label_116;
                }

                v10.addLowerThan(v7, v9, v2, v14_1);
            }
            else {
                v10.addEquality(v7, v9, v12_1, 6);
            }

        label_116:
            v13_1 = arg47;
            v2 = arg48;
            v24 = v6;
            v27 = v11;
            v6 = v20;
            v0_1 = v22;
            v11 = 2;
        }
        else {
            v2 = -2;
            v14_1 = arg47;
            if(v14_1 == v2) {
                v14_1 = arg48;
                v13_1 = v12_1;
            }
            else {
                v13_1 = v14_1;
                v14_1 = arg48;
            }

            v2 = v14_1 == v2 ? v12_1 : v14_1;
            if(v13_1 > 0) {
                if(arg32) {
                    v14_1 = 6;
                    v10.addGreaterThan(v7, v9, v13_1, v14_1);
                }
                else {
                    v14_1 = 6;
                    v10.addGreaterThan(v7, v9, v13_1, v14_1);
                }

                v12_1 = Math.max(v12_1, v13_1);
            }
            else {
                v14_1 = 6;
            }

            if(v2 > 0) {
                if(arg32) {
                    v10.addLowerThan(v7, v9, v2, 1);
                }
                else {
                    v10.addLowerThan(v7, v9, v2, v14_1);
                }

                v12_1 = Math.min(v12_1, v2);
            }

            if(v11 == 1) {
                if(arg32) {
                    v10.addEquality(v7, v9, v12_1, 6);
                }
                else if(arg45) {
                    v10.addEquality(v7, v9, v12_1, 4);
                }
                else {
                    v10.addEquality(v7, v9, v12_1, 1);
                }

                goto label_215;
            }
            else if(v11 == 2) {
                v24 = v6;
                if(arg37.getType() == Type.TOP || arg37.getType() == Type.BOTTOM) {
                    v6 = v10.createObjectVariable(v0.mParent.getAnchor(Type.TOP));
                    v17 = v10.createObjectVariable(v0.mParent.getAnchor(Type.BOTTOM));
                    v18 = v6;
                }
                else {
                    v6 = v10.createObjectVariable(v0.mParent.getAnchor(Type.LEFT));
                    v17 = v10.createObjectVariable(v0.mParent.getAnchor(Type.RIGHT));
                    v18 = v6;
                }

                v27 = v11;
                v6 = v20;
                v0_1 = v22;
                v11 = 2;
                v10.addConstraint(arg31.createRow().createRowDimensionRatio(v7, v9, v17, v18, arg49));
                v15_1 = 0;
            }
            else {
            label_215:
                v24 = v6;
                v27 = v11;
                v6 = v20;
                v0_1 = v22;
                v11 = 2;
            }

            if(v15_1 == 0) {
                goto label_230;
            }

            if(v0_1 == v11) {
                goto label_230;
            }

            if(arg44) {
                goto label_230;
            }

            v12_1 = Math.max(v13_1, v12_1);
            if(v2 > 0) {
                v12_1 = Math.min(v2, v12_1);
            }

            v10.addEquality(v7, v9, v12_1, 6);
            v15_1 = 0;
        }

    label_230:
        if(arg50) {
            if(arg45) {
            }
            else {
                v0_1 = 5;
                if((v8_1) || (v23) || (v21)) {
                    int v5 = 4;
                    v12 = arg34;
                    if((v8_1) && !v23) {
                        if(arg32) {
                            v10.addGreaterThan(v12, v7, 0, v0_1);
                        }
                        else {
                        }

                        goto label_243;
                    }

                    if(!v8_1 && (v23)) {
                        v10.addEquality(v7, v6, -arg38.getMargin(), 6);
                        if(arg32) {
                            v10.addGreaterThan(v9, arg33, 0, v0_1);
                        }
                        else {
                        }

                        goto label_243;
                    }

                    v11 = 3;
                    v14 = arg33;
                    if((v8_1) && (v23)) {
                        if(v15_1 != 0) {
                            if((arg32) && v1 == 0) {
                                v10.addGreaterThan(v7, v9, 0, 6);
                            }

                            if(v27 == 0) {
                                if(v2 > 0 || v13_1 > 0) {
                                    v1 = 1;
                                }
                                else {
                                    v1 = 0;
                                    v5 = 6;
                                }

                                v8_2 = v24;
                                v10.addEquality(v9, v8_2, arg37.getMargin(), v5);
                                v10.addEquality(v7, v6, -arg38.getMargin(), v5);
                                v13_1 = v2 > 0 || v13_1 > 0 ? 1 : 0;
                                v15_1 = v1;
                                goto label_334;
                            }

                            v8_2 = v24;
                            v1 = v27;
                            v13_1 = 1;
                            if(v1 == 1) {
                                v0_1 = 6;
                            }
                            else if(v1 == v11) {
                                if(!arg44 && this.mResolvedDimensionRatioSide != -1 && v2 <= 0) {
                                    v5 = 6;
                                }

                                v10.addEquality(v9, v8_2, arg37.getMargin(), v5);
                                v10.addEquality(v7, v6, -arg38.getMargin(), v5);
                            }
                            else {
                                goto label_321;
                            }

                            v15_1 = 1;
                            goto label_334;
                        label_321:
                            v13_1 = 0;
                            goto label_333;
                        }
                        else {
                            v8_2 = v24;
                            v13_1 = 1;
                            if(arg32) {
                                v10.addGreaterThan(v9, v8_2, arg37.getMargin(), v0_1);
                                v10.addLowerThan(v7, v6, -arg38.getMargin(), v0_1);
                            }

                        label_333:
                            v15_1 = 0;
                        }

                    label_334:
                        if(v13_1 != 0) {
                            v28 = v6;
                            v29 = v7;
                            v11_1 = v8_2;
                            v13_2 = v9;
                            arg31.addCentering(v9, v8_2, arg37.getMargin(), arg43, v6, v7, arg38.getMargin(), v0_1);
                        }
                        else {
                            v28 = v6;
                            v29 = v7;
                            v11_1 = v8_2;
                            v13_2 = v9;
                        }

                        if(v15_1 != 0) {
                            v1 = 6;
                            v10.addGreaterThan(v13_2, v11_1, arg37.getMargin(), v1);
                            v2_1 = v29;
                            v10.addLowerThan(v2_1, v28, -arg38.getMargin(), v1);
                        }
                        else {
                            v2_1 = v29;
                            v1 = 6;
                        }

                        if(arg32) {
                            v0_1 = 0;
                            v10.addGreaterThan(v13_2, v14, 0, v1);
                            goto label_370;
                        }

                        v0_1 = 0;
                        goto label_370;
                    }

                label_243:
                    v2_1 = v7;
                    v0_1 = 0;
                    v1 = 6;
                }
                else {
                    if(arg32) {
                        v12 = arg34;
                        v10.addGreaterThan(v12, v7, 0, v0_1);
                    }
                    else {
                        v12 = arg34;
                    }

                    goto label_243;
                }

            label_370:
                if(arg32) {
                    v10.addGreaterThan(v12, v2_1, v0_1, v1);
                }

                return;
            }
        }

        v2_1 = v7;
        v13_2 = v9;
        v1 = 6;
        v12 = arg34;
        v14 = arg33;
        if(v0_1 < v11 && (arg32)) {
            v10.addGreaterThan(v13_2, v14, 0, v1);
            v10.addGreaterThan(v12, v2_1, 0, v1);
        }
    }

    public void connect(Type arg7, ConstraintWidget arg8, Type arg9) {
        this.connect(arg7, arg8, arg9, 0, Strength.STRONG);
    }

    public void connect(Type arg8, ConstraintWidget arg9, Type arg10, int arg11, Strength arg12) {
        this.connect(arg8, arg9, arg10, arg11, arg12, 0);
    }

    public void connect(Type arg7, ConstraintWidget arg8, Type arg9, int arg10) {
        this.connect(arg7, arg8, arg9, arg10, Strength.STRONG);
    }

    public void connect(Type arg16, ConstraintWidget arg17, Type arg18, int arg19, Strength arg20, int arg21) {
        int v0_2;
        ConstraintAnchor v1;
        ConstraintAnchor v0_1;
        ConstraintAnchor v3_1;
        ConstraintAnchor v2_1;
        Type v0 = arg16;
        ConstraintWidget v9 = arg17;
        Type v10 = arg18;
        int v11 = arg21;
        int v12 = 0;
        if(v0 != Type.CENTER) {
            if(v0 == Type.CENTER_X && (v10 == Type.LEFT || v10 == Type.RIGHT)) {
                v0_1 = this.getAnchor(Type.LEFT);
                v1 = arg17.getAnchor(arg18);
                v2_1 = this.getAnchor(Type.RIGHT);
                v0_1.connect(v1, 0, v11);
                v2_1.connect(v1, 0, v11);
                this.getAnchor(Type.CENTER_X).connect(v1, 0, v11);
                return;
            }

            if(v0 == Type.CENTER_Y && (v10 == Type.TOP || v10 == Type.BOTTOM)) {
                v0_1 = arg17.getAnchor(arg18);
                this.getAnchor(Type.TOP).connect(v0_1, 0, v11);
                this.getAnchor(Type.BOTTOM).connect(v0_1, 0, v11);
                this.getAnchor(Type.CENTER_Y).connect(v0_1, 0, v11);
                return;
            }

            if(v0 == Type.CENTER_X && v10 == Type.CENTER_X) {
                this.getAnchor(Type.LEFT).connect(v9.getAnchor(Type.LEFT), 0, v11);
                this.getAnchor(Type.RIGHT).connect(v9.getAnchor(Type.RIGHT), 0, v11);
                this.getAnchor(Type.CENTER_X).connect(arg17.getAnchor(arg18), 0, v11);
                return;
            }

            if(v0 == Type.CENTER_Y && v10 == Type.CENTER_Y) {
                this.getAnchor(Type.TOP).connect(v9.getAnchor(Type.TOP), 0, v11);
                this.getAnchor(Type.BOTTOM).connect(v9.getAnchor(Type.BOTTOM), 0, v11);
                this.getAnchor(Type.CENTER_Y).connect(arg17.getAnchor(arg18), 0, v11);
                return;
            }

            v1 = this.getAnchor(arg16);
            v2_1 = arg17.getAnchor(arg18);
            if(!v1.isValidConnection(v2_1)) {
                return;
            }

            if(v0 == Type.BASELINE) {
                v0_1 = this.getAnchor(Type.TOP);
                v3_1 = this.getAnchor(Type.BOTTOM);
                if(v0_1 != null) {
                    v0_1.reset();
                }

                if(v3_1 == null) {
                    goto label_210;
                }

                v3_1.reset();
            }
            else {
                if(v0 == Type.TOP || v0 == Type.BOTTOM) {
                    v3_1 = this.getAnchor(Type.BASELINE);
                    if(v3_1 != null) {
                        v3_1.reset();
                    }

                    v3_1 = this.getAnchor(Type.CENTER);
                    if(v3_1.getTarget() != v2_1) {
                        v3_1.reset();
                    }

                    v0_1 = this.getAnchor(arg16).getOpposite();
                    v3_1 = this.getAnchor(Type.CENTER_Y);
                    if(!v3_1.isConnected()) {
                        goto label_252;
                    }

                    v0_1.reset();
                    v3_1.reset();
                }
                else {
                    if(v0 != Type.LEFT && v0 != Type.RIGHT) {
                        goto label_252;
                    }

                    v3_1 = this.getAnchor(Type.CENTER);
                    if(v3_1.getTarget() != v2_1) {
                        v3_1.reset();
                    }

                    v0_1 = this.getAnchor(arg16).getOpposite();
                    v3_1 = this.getAnchor(Type.CENTER_X);
                    if(!v3_1.isConnected()) {
                        goto label_252;
                    }

                    v0_1.reset();
                    v3_1.reset();
                }

            label_252:
                v12 = arg19;
            }

        label_210:
            Strength v0_4 = arg20;
            v1.connect(v2_1, v12, v0_4, v11);
            v2_1.getOwner().connectedTo(v1.getOwner());
        }
        else if(v10 == Type.CENTER) {
            v0_1 = this.getAnchor(Type.LEFT);
            v1 = this.getAnchor(Type.RIGHT);
            ConstraintAnchor v10_1 = this.getAnchor(Type.TOP);
            ConstraintAnchor v13 = this.getAnchor(Type.BOTTOM);
            int v14 = 1;
            if(v0_1 == null || !v0_1.isConnected()) {
                if(v1 != null && (v1.isConnected())) {
                label_25:
                    v0_2 = 0;
                    goto label_39;
                }

                this.connect(Type.LEFT, arg17, Type.LEFT, 0, arg20, arg21);
                this.connect(Type.RIGHT, arg17, Type.RIGHT, 0, arg20, arg21);
                v0_2 = 1;
            }
            else {
                goto label_25;
            }

        label_39:
            if(v10_1 == null || !v10_1.isConnected()) {
                if(v13 != null && (v13.isConnected())) {
                label_45:
                    v14 = 0;
                    goto label_58;
                }

                this.connect(Type.TOP, arg17, Type.TOP, 0, arg20, arg21);
                this.connect(Type.BOTTOM, arg17, Type.BOTTOM, 0, arg20, arg21);
            }
            else {
                goto label_45;
            }

        label_58:
            if(v0_2 != 0 && v14 != 0) {
                this.getAnchor(Type.CENTER).connect(v9.getAnchor(Type.CENTER), 0, v11);
                return;
            }

            if(v0_2 != 0) {
                this.getAnchor(Type.CENTER_X).connect(v9.getAnchor(Type.CENTER_X), 0, v11);
                return;
            }

            if(v14 == 0) {
                return;
            }

            this.getAnchor(Type.CENTER_Y).connect(v9.getAnchor(Type.CENTER_Y), 0, v11);
        }
        else {
            if(v10 != Type.LEFT) {
                if(v10 == Type.RIGHT) {
                }
                else {
                    if(v10 != Type.TOP && v10 != Type.BOTTOM) {
                        return;
                    }

                    this.connect(Type.TOP, arg17, arg18, 0, arg20, arg21);
                    this.connect(Type.BOTTOM, arg17, arg18, 0, arg20, arg21);
                    this.getAnchor(Type.CENTER).connect(arg17.getAnchor(arg18), 0, v11);
                    return;
                }
            }

            this.connect(Type.LEFT, arg17, arg18, 0, arg20, arg21);
            Type v2 = Type.RIGHT;
            ConstraintWidget v1_1 = this;
            ConstraintWidget v3 = arg17;
            Type v4 = arg18;
            Strength v6 = arg20;
            int v7 = arg21;
            try {
                v1_1.connect(v2, v3, v4, 0, v6, v7);
            }
            catch(Throwable v0_3) {
                throw v0_3;
            }

            this.getAnchor(Type.CENTER).connect(arg17.getAnchor(arg18), 0, v11);
        }
    }

    public void connect(ConstraintAnchor arg7, ConstraintAnchor arg8, int arg9) {
        this.connect(arg7, arg8, arg9, Strength.STRONG, 0);
    }

    public void connect(ConstraintAnchor arg9, ConstraintAnchor arg10, int arg11, Strength arg12, int arg13) {
        if(arg9.getOwner() == this) {
            this.connect(arg9.getType(), arg10.getOwner(), arg10.getType(), arg11, arg12, arg13);
        }
    }

    public void connect(ConstraintAnchor arg7, ConstraintAnchor arg8, int arg9, int arg10) {
        this.connect(arg7, arg8, arg9, Strength.STRONG, arg10);
    }

    public void connectCircularConstraint(ConstraintWidget arg7, float arg8, int arg9) {
        this.immediateConnect(Type.CENTER, arg7, Type.CENTER, arg9, 0);
        this.mCircleConstraintAngle = arg8;
    }

    public void connectedTo(ConstraintWidget arg1) {
    }

    public void createObjectVariables(LinearSystem arg2) {
        arg2.createObjectVariable(this.mLeft);
        arg2.createObjectVariable(this.mTop);
        arg2.createObjectVariable(this.mRight);
        arg2.createObjectVariable(this.mBottom);
        if(this.mBaselineDistance > 0) {
            arg2.createObjectVariable(this.mBaseline);
        }
    }

    public void disconnectUnlockedWidget(ConstraintWidget arg7) {
        ArrayList v0 = this.getAnchors();
        int v1 = v0.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            Object v3 = v0.get(v2);
            if((((ConstraintAnchor)v3).isConnected()) && ((ConstraintAnchor)v3).getTarget().getOwner() == arg7 && ((ConstraintAnchor)v3).getConnectionCreator() == 2) {
                ((ConstraintAnchor)v3).reset();
            }
        }
    }

    public void disconnectWidget(ConstraintWidget arg6) {
        ArrayList v0 = this.getAnchors();
        int v1 = v0.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            Object v3 = v0.get(v2);
            if((((ConstraintAnchor)v3).isConnected()) && ((ConstraintAnchor)v3).getTarget().getOwner() == arg6) {
                ((ConstraintAnchor)v3).reset();
            }
        }
    }

    public void forceUpdateDrawPosition() {
        int v0 = this.mX;
        int v1 = this.mY;
        int v2 = this.mX + this.mWidth;
        int v3 = this.mY + this.mHeight;
        this.mDrawX = v0;
        this.mDrawY = v1;
        this.mDrawWidth = v2 - v0;
        this.mDrawHeight = v3 - v1;
    }

    public ConstraintAnchor getAnchor(Type arg3) {
        switch(androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg3.ordinal()]) {
            case 1: {
                goto label_24;
            }
            case 2: {
                goto label_22;
            }
            case 3: {
                goto label_20;
            }
            case 4: {
                goto label_18;
            }
            case 5: {
                goto label_16;
            }
            case 6: {
                goto label_14;
            }
            case 7: {
                goto label_12;
            }
            case 8: {
                goto label_10;
            }
            case 9: {
                return null;
            }
        }

        throw new AssertionError(arg3.name());
    label_18:
        return this.mBottom;
    label_20:
        return this.mRight;
    label_22:
        return this.mTop;
    label_24:
        return this.mLeft;
    label_10:
        return this.mCenterY;
    label_12:
        return this.mCenterX;
    label_14:
        return this.mCenter;
    label_16:
        return this.mBaseline;
    }

    public ArrayList getAnchors() {
        return this.mAnchors;
    }

    public int getBaselineDistance() {
        return this.mBaselineDistance;
    }

    public int getBottom() {
        return this.getY() + this.mHeight;
    }

    public Object getCompanionWidget() {
        return this.mCompanionWidget;
    }

    public int getContainerItemSkip() {
        return this.mContainerItemSkip;
    }

    public String getDebugName() {
        return this.mDebugName;
    }

    public float getDimensionRatio() {
        return this.mDimensionRatio;
    }

    public int getDimensionRatioSide() {
        return this.mDimensionRatioSide;
    }

    public int getDrawBottom() {
        return this.getDrawY() + this.mDrawHeight;
    }

    public int getDrawHeight() {
        return this.mDrawHeight;
    }

    public int getDrawRight() {
        return this.getDrawX() + this.mDrawWidth;
    }

    public int getDrawWidth() {
        return this.mDrawWidth;
    }

    public int getDrawX() {
        return this.mDrawX + this.mOffsetX;
    }

    public int getDrawY() {
        return this.mDrawY + this.mOffsetY;
    }

    public int getHeight() {
        if(this.mVisibility == 8) {
            return 0;
        }

        return this.mHeight;
    }

    public float getHorizontalBiasPercent() {
        return this.mHorizontalBiasPercent;
    }

    public ConstraintWidget getHorizontalChainControlWidget() {
        ConstraintWidget v0;
        ConstraintWidget v1 = null;
        if(this.isInHorizontalChain()) {
            ConstraintWidget v2 = this;
            v0 = v1;
            while(v0 == null) {
                if(v2 == null) {
                    return v0;
                }

                ConstraintAnchor v3 = v2.getAnchor(Type.LEFT);
                v3 = v3 == null ? ((ConstraintAnchor)v1) : v3.getTarget();
                ConstraintWidget v3_1 = v3 == null ? v1 : v3.getOwner();
                if(v3_1 == this.getParent()) {
                    return v2;
                }

                ConstraintAnchor v4 = v3_1 == null ? ((ConstraintAnchor)v1) : v3_1.getAnchor(Type.RIGHT).getTarget();
                if(v4 != null && v4.getOwner() != v2) {
                    v0 = v2;
                    continue;
                }

                v2 = v3_1;
            }
        }
        else {
            v0 = v1;
        }

        return v0;
    }

    public int getHorizontalChainStyle() {
        return this.mHorizontalChainStyle;
    }

    public DimensionBehaviour getHorizontalDimensionBehaviour() {
        return this.mListDimensionBehaviors[0];
    }

    public int getInternalDrawBottom() {
        return this.mDrawY + this.mDrawHeight;
    }

    public int getInternalDrawRight() {
        return this.mDrawX + this.mDrawWidth;
    }

    int getInternalDrawX() {
        return this.mDrawX;
    }

    int getInternalDrawY() {
        return this.mDrawY;
    }

    public int getLeft() {
        return this.getX();
    }

    public int getMaxHeight() {
        return this.mMaxDimension[1];
    }

    public int getMaxWidth() {
        return this.mMaxDimension[0];
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizerWrapHeight() {
        int v0 = this.mHeight;
        if(this.mListDimensionBehaviors[1] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if(this.mMatchConstraintDefaultHeight == 1) {
                v0 = Math.max(this.mMatchConstraintMinHeight, v0);
            }
            else if(this.mMatchConstraintMinHeight > 0) {
                v0 = this.mMatchConstraintMinHeight;
                this.mHeight = v0;
            }
            else {
                v0 = 0;
            }

            if(this.mMatchConstraintMaxHeight <= 0) {
                return v0;
            }

            if(this.mMatchConstraintMaxHeight >= v0) {
                return v0;
            }

            v0 = this.mMatchConstraintMaxHeight;
        }

        return v0;
    }

    public int getOptimizerWrapWidth() {
        int v0 = this.mWidth;
        if(this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            if(this.mMatchConstraintDefaultWidth == 1) {
                v0 = Math.max(this.mMatchConstraintMinWidth, v0);
            }
            else if(this.mMatchConstraintMinWidth > 0) {
                v0 = this.mMatchConstraintMinWidth;
                this.mWidth = v0;
            }
            else {
                v0 = 0;
            }

            if(this.mMatchConstraintMaxWidth <= 0) {
                return v0;
            }

            if(this.mMatchConstraintMaxWidth >= v0) {
                return v0;
            }

            v0 = this.mMatchConstraintMaxWidth;
        }

        return v0;
    }

    public ConstraintWidget getParent() {
        return this.mParent;
    }

    public ResolutionDimension getResolutionHeight() {
        if(this.mResolutionHeight == null) {
            this.mResolutionHeight = new ResolutionDimension();
        }

        return this.mResolutionHeight;
    }

    public ResolutionDimension getResolutionWidth() {
        if(this.mResolutionWidth == null) {
            this.mResolutionWidth = new ResolutionDimension();
        }

        return this.mResolutionWidth;
    }

    public int getRight() {
        return this.getX() + this.mWidth;
    }

    public WidgetContainer getRootWidgetContainer() {
        ConstraintWidget v0;
        for(v0 = this; v0.getParent() != null; v0 = v0.getParent()) {
        }

        if((v0 instanceof WidgetContainer)) {
            return ((WidgetContainer)v0);
        }

        return null;
    }

    protected int getRootX() {
        return this.mX + this.mOffsetX;
    }

    protected int getRootY() {
        return this.mY + this.mOffsetY;
    }

    public int getTop() {
        return this.getY();
    }

    public String getType() {
        return this.mType;
    }

    public float getVerticalBiasPercent() {
        return this.mVerticalBiasPercent;
    }

    public ConstraintWidget getVerticalChainControlWidget() {
        ConstraintWidget v0;
        ConstraintWidget v1 = null;
        if(this.isInVerticalChain()) {
            ConstraintWidget v2 = this;
            v0 = v1;
            while(v0 == null) {
                if(v2 == null) {
                    return v0;
                }

                ConstraintAnchor v3 = v2.getAnchor(Type.TOP);
                v3 = v3 == null ? ((ConstraintAnchor)v1) : v3.getTarget();
                ConstraintWidget v3_1 = v3 == null ? v1 : v3.getOwner();
                if(v3_1 == this.getParent()) {
                    return v2;
                }

                ConstraintAnchor v4 = v3_1 == null ? ((ConstraintAnchor)v1) : v3_1.getAnchor(Type.BOTTOM).getTarget();
                if(v4 != null && v4.getOwner() != v2) {
                    v0 = v2;
                    continue;
                }

                v2 = v3_1;
            }
        }
        else {
            v0 = v1;
        }

        return v0;
    }

    public int getVerticalChainStyle() {
        return this.mVerticalChainStyle;
    }

    public DimensionBehaviour getVerticalDimensionBehaviour() {
        return this.mListDimensionBehaviors[1];
    }

    public int getVisibility() {
        return this.mVisibility;
    }

    public int getWidth() {
        if(this.mVisibility == 8) {
            return 0;
        }

        return this.mWidth;
    }

    public int getWrapHeight() {
        return this.mWrapHeight;
    }

    public int getWrapWidth() {
        return this.mWrapWidth;
    }

    public int getX() {
        return this.mX;
    }

    public int getY() {
        return this.mY;
    }

    public boolean hasAncestor(ConstraintWidget arg5) {
        ConstraintWidget v0 = this.getParent();
        if(v0 == arg5) {
            return 1;
        }

        if(v0 == arg5.getParent()) {
            return 0;
        }

        while(v0 != null) {
            if(v0 == arg5) {
                return 1;
            }

            if(v0 == arg5.getParent()) {
                return 1;
            }

            v0 = v0.getParent();
        }

        return 0;
    }

    public boolean hasBaseline() {
        boolean v0 = this.mBaselineDistance > 0 ? true : false;
        return v0;
    }

    public void immediateConnect(Type arg8, ConstraintWidget arg9, Type arg10, int arg11, int arg12) {
        this.getAnchor(arg8).connect(arg9.getAnchor(arg10), arg11, arg12, Strength.STRONG, 0, true);
    }

    public boolean isFullyResolved() {
        if(this.mLeft.getResolutionNode().state == 1 && this.mRight.getResolutionNode().state == 1 && this.mTop.getResolutionNode().state == 1 && this.mBottom.getResolutionNode().state == 1) {
            return 1;
        }

        return 0;
    }

    public boolean isHeightWrapContent() {
        return this.mIsHeightWrapContent;
    }

    public boolean isInHorizontalChain() {
        if(this.mLeft.mTarget != null && this.mLeft.mTarget.mTarget == this.mLeft || this.mRight.mTarget != null && this.mRight.mTarget.mTarget == this.mRight) {
            return 1;
        }

        return 0;
    }

    public boolean isInVerticalChain() {
        if(this.mTop.mTarget != null && this.mTop.mTarget.mTarget == this.mTop || this.mBottom.mTarget != null && this.mBottom.mTarget.mTarget == this.mBottom) {
            return 1;
        }

        return 0;
    }

    public boolean isInsideConstraintLayout() {
        ConstraintWidget v0 = this.getParent();
        if(v0 == null) {
            return 0;
        }

        while(v0 != null) {
            if((v0 instanceof ConstraintWidgetContainer)) {
                return 1;
            }

            v0 = v0.getParent();
        }

        return 0;
    }

    public boolean isRoot() {
        boolean v0 = this.mParent == null ? true : false;
        return v0;
    }

    public boolean isRootContainer() {
        boolean v0;
        if((this instanceof ConstraintWidgetContainer)) {
            if(this.mParent != null && ((this.mParent instanceof ConstraintWidgetContainer))) {
                goto label_9;
            }

            v0 = true;
        }
        else {
        label_9:
            v0 = false;
        }

        return v0;
    }

    public boolean isSpreadHeight() {
        boolean v1 = true;
        if(this.mMatchConstraintDefaultHeight != 0 || this.mDimensionRatio != 0f || this.mMatchConstraintMinHeight != 0 || this.mMatchConstraintMaxHeight != 0 || this.mListDimensionBehaviors[1] != DimensionBehaviour.MATCH_CONSTRAINT) {
            v1 = false;
        }
        else {
        }

        return v1;
    }

    public boolean isSpreadWidth() {
        boolean v1 = false;
        if(this.mMatchConstraintDefaultWidth == 0 && this.mDimensionRatio == 0f && this.mMatchConstraintMinWidth == 0 && this.mMatchConstraintMaxWidth == 0 && this.mListDimensionBehaviors[0] == DimensionBehaviour.MATCH_CONSTRAINT) {
            v1 = true;
        }

        return v1;
    }

    public boolean isWidthWrapContent() {
        return this.mIsWidthWrapContent;
    }

    public void reset() {
        this.mLeft.reset();
        this.mTop.reset();
        this.mRight.reset();
        this.mBottom.reset();
        this.mBaseline.reset();
        this.mCenterX.reset();
        this.mCenterY.reset();
        this.mCenter.reset();
        this.mParent = null;
        this.mCircleConstraintAngle = 0f;
        this.mWidth = 0;
        this.mHeight = 0;
        this.mDimensionRatio = 0f;
        this.mDimensionRatioSide = -1;
        this.mX = 0;
        this.mY = 0;
        this.mDrawX = 0;
        this.mDrawY = 0;
        this.mDrawWidth = 0;
        this.mDrawHeight = 0;
        this.mOffsetX = 0;
        this.mOffsetY = 0;
        this.mBaselineDistance = 0;
        this.mMinWidth = 0;
        this.mMinHeight = 0;
        this.mWrapWidth = 0;
        this.mWrapHeight = 0;
        this.mHorizontalBiasPercent = ConstraintWidget.DEFAULT_BIAS;
        this.mVerticalBiasPercent = ConstraintWidget.DEFAULT_BIAS;
        this.mListDimensionBehaviors[0] = DimensionBehaviour.FIXED;
        this.mListDimensionBehaviors[1] = DimensionBehaviour.FIXED;
        this.mCompanionWidget = null;
        this.mContainerItemSkip = 0;
        this.mVisibility = 0;
        this.mType = null;
        this.mHorizontalWrapVisited = false;
        this.mVerticalWrapVisited = false;
        this.mHorizontalChainStyle = 0;
        this.mVerticalChainStyle = 0;
        this.mHorizontalChainFixedPosition = false;
        this.mVerticalChainFixedPosition = false;
        this.mWeight[0] = -1f;
        this.mWeight[1] = -1f;
        this.mHorizontalResolution = -1;
        this.mVerticalResolution = -1;
        this.mMaxDimension[0] = 0x7FFFFFFF;
        this.mMaxDimension[1] = 0x7FFFFFFF;
        this.mMatchConstraintDefaultWidth = 0;
        this.mMatchConstraintDefaultHeight = 0;
        this.mMatchConstraintPercentWidth = 1f;
        this.mMatchConstraintPercentHeight = 1f;
        this.mMatchConstraintMaxWidth = 0x7FFFFFFF;
        this.mMatchConstraintMaxHeight = 0x7FFFFFFF;
        this.mMatchConstraintMinWidth = 0;
        this.mMatchConstraintMinHeight = 0;
        this.mResolvedDimensionRatioSide = -1;
        this.mResolvedDimensionRatio = 1f;
        if(this.mResolutionWidth != null) {
            this.mResolutionWidth.reset();
        }

        if(this.mResolutionHeight != null) {
            this.mResolutionHeight.reset();
        }
    }

    public void resetAllConstraints() {
        this.resetAnchors();
        this.setVerticalBiasPercent(ConstraintWidget.DEFAULT_BIAS);
        this.setHorizontalBiasPercent(ConstraintWidget.DEFAULT_BIAS);
        if((this instanceof ConstraintWidgetContainer)) {
            return;
        }

        if(this.getHorizontalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
            if(this.getWidth() == this.getWrapWidth()) {
                this.setHorizontalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
            }
            else if(this.getWidth() > this.getMinWidth()) {
                this.setHorizontalDimensionBehaviour(DimensionBehaviour.FIXED);
            }
        }

        if(this.getVerticalDimensionBehaviour() == DimensionBehaviour.MATCH_CONSTRAINT) {
            if(this.getHeight() == this.getWrapHeight()) {
                this.setVerticalDimensionBehaviour(DimensionBehaviour.WRAP_CONTENT);
            }
            else if(this.getHeight() > this.getMinHeight()) {
                this.setVerticalDimensionBehaviour(DimensionBehaviour.FIXED);
            }
        }
    }

    public void resetAnchor(ConstraintAnchor arg9) {
        if(this.getParent() != null && ((this.getParent() instanceof ConstraintWidgetContainer)) && (this.getParent().handlesInternalConstraints())) {
            return;
        }

        ConstraintAnchor v0 = this.getAnchor(Type.LEFT);
        ConstraintAnchor v1 = this.getAnchor(Type.RIGHT);
        ConstraintAnchor v2 = this.getAnchor(Type.TOP);
        ConstraintAnchor v3 = this.getAnchor(Type.BOTTOM);
        ConstraintAnchor v4 = this.getAnchor(Type.CENTER);
        ConstraintAnchor v5 = this.getAnchor(Type.CENTER_X);
        ConstraintAnchor v6 = this.getAnchor(Type.CENTER_Y);
        float v7 = 0.5f;
        if(arg9 == v4) {
            if((v0.isConnected()) && (v1.isConnected()) && v0.getTarget() == v1.getTarget()) {
                v0.reset();
                v1.reset();
            }

            if((v2.isConnected()) && (v3.isConnected()) && v2.getTarget() == v3.getTarget()) {
                v2.reset();
                v3.reset();
            }

            this.mHorizontalBiasPercent = v7;
            this.mVerticalBiasPercent = v7;
        }
        else {
            if(arg9 == v5) {
                if((v0.isConnected()) && (v1.isConnected()) && v0.getTarget().getOwner() == v1.getTarget().getOwner()) {
                    v0.reset();
                    v1.reset();
                }

                this.mHorizontalBiasPercent = v7;
                goto label_92;
            }

            if(arg9 == v6) {
                if((v2.isConnected()) && (v3.isConnected()) && v2.getTarget().getOwner() == v3.getTarget().getOwner()) {
                    v2.reset();
                    v3.reset();
                }

                this.mVerticalBiasPercent = v7;
                goto label_92;
            }

            if(arg9 != v0) {
                if(arg9 == v1) {
                }
                else {
                    if(arg9 != v2 && arg9 != v3) {
                        goto label_92;
                    }

                    if(!v2.isConnected()) {
                        goto label_92;
                    }

                    if(v2.getTarget() != v3.getTarget()) {
                        goto label_92;
                    }

                    v4.reset();
                    goto label_92;
                }
            }

            if(!v0.isConnected()) {
                goto label_92;
            }

            if(v0.getTarget() != v1.getTarget()) {
                goto label_92;
            }

            v4.reset();
        }

    label_92:
        arg9.reset();
    }

    public void resetAnchors() {
        ConstraintWidget v0 = this.getParent();
        if(v0 != null && ((v0 instanceof ConstraintWidgetContainer)) && (this.getParent().handlesInternalConstraints())) {
            return;
        }

        int v0_1 = 0;
        int v1 = this.mAnchors.size();
        while(v0_1 < v1) {
            this.mAnchors.get(v0_1).reset();
            ++v0_1;
        }
    }

    public void resetAnchors(int arg5) {
        ConstraintWidget v0 = this.getParent();
        if(v0 != null && ((v0 instanceof ConstraintWidgetContainer)) && (this.getParent().handlesInternalConstraints())) {
            return;
        }

        int v0_1 = 0;
        int v1 = this.mAnchors.size();
        while(v0_1 < v1) {
            Object v2 = this.mAnchors.get(v0_1);
            if(arg5 == ((ConstraintAnchor)v2).getConnectionCreator()) {
                if(((ConstraintAnchor)v2).isVerticalAnchor()) {
                    this.setVerticalBiasPercent(ConstraintWidget.DEFAULT_BIAS);
                }
                else {
                    this.setHorizontalBiasPercent(ConstraintWidget.DEFAULT_BIAS);
                }

                ((ConstraintAnchor)v2).reset();
            }

            ++v0_1;
        }
    }

    public void resetResolutionNodes() {
        int v0;
        for(v0 = 0; v0 < 6; ++v0) {
            this.mListAnchors[v0].getResolutionNode().reset();
        }
    }

    public void resetSolverVariables(Cache arg2) {
        this.mLeft.resetSolverVariable(arg2);
        this.mTop.resetSolverVariable(arg2);
        this.mRight.resetSolverVariable(arg2);
        this.mBottom.resetSolverVariable(arg2);
        this.mBaseline.resetSolverVariable(arg2);
        this.mCenter.resetSolverVariable(arg2);
        this.mCenterX.resetSolverVariable(arg2);
        this.mCenterY.resetSolverVariable(arg2);
    }

    public void resolve() {
    }

    public void setBaselineDistance(int arg1) {
        this.mBaselineDistance = arg1;
    }

    public void setCompanionWidget(Object arg1) {
        this.mCompanionWidget = arg1;
    }

    public void setContainerItemSkip(int arg1) {
        this.mContainerItemSkip = arg1 >= 0 ? arg1 : 0;
    }

    public void setDebugName(String arg1) {
        this.mDebugName = arg1;
    }

    public void setDebugSolverName(LinearSystem arg7, String arg8) {
        this.mDebugName = arg8;
        SolverVariable v0 = arg7.createObjectVariable(this.mLeft);
        SolverVariable v1 = arg7.createObjectVariable(this.mTop);
        SolverVariable v2 = arg7.createObjectVariable(this.mRight);
        SolverVariable v3 = arg7.createObjectVariable(this.mBottom);
        v0.setName(arg8 + ".left");
        v1.setName(arg8 + ".top");
        v2.setName(arg8 + ".right");
        v3.setName(arg8 + ".bottom");
        if(this.mBaselineDistance > 0) {
            SolverVariable v7 = arg7.createObjectVariable(this.mBaseline);
            v7.setName(arg8 + ".baseline");
        }
    }

    public void setDimension(int arg2, int arg3) {
        this.mWidth = arg2;
        if(this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }

        this.mHeight = arg3;
        if(this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    public void setDimensionRatio(float arg1, int arg2) {
        this.mDimensionRatio = arg1;
        this.mDimensionRatioSide = arg2;
    }

    public void setDimensionRatio(String arg9) {
        float v9;
        if(arg9 != null) {
            if(arg9.length() == 0) {
            }
            else {
                int v1 = -1;
                int v2 = arg9.length();
                int v3 = arg9.indexOf(44);
                int v4 = 0;
                if(v3 > 0 && v3 < v2 - 1) {
                    String v6 = arg9.substring(0, v3);
                    if(v6.equalsIgnoreCase("W")) {
                        v1 = 0;
                    }
                    else if(v6.equalsIgnoreCase("H")) {
                        v1 = 1;
                    }

                    v4 = v3 + 1;
                }

                v3 = arg9.indexOf(58);
                if(v3 < 0 || v3 >= v2 - 1) {
                    arg9 = arg9.substring(v4);
                    if(arg9.length() > 0) {
                        try {
                            v9 = Float.parseFloat(arg9);
                        }
                        catch(NumberFormatException ) {
                        label_53:
                            v9 = 0f;
                        }
                    }
                    else {
                        goto label_53;
                    }
                }
                else {
                    String v2_1 = arg9.substring(v4, v3);
                    arg9 = arg9.substring(v3 + 1);
                    if(v2_1.length() <= 0) {
                        goto label_53;
                    }
                    else if(arg9.length() > 0) {
                        try {
                            float v2_2 = Float.parseFloat(v2_1);
                            v9 = Float.parseFloat(arg9);
                            if(v2_2 <= 0f) {
                                goto label_53;
                            }
                            else if(v9 <= 0f) {
                                goto label_53;
                            }
                            else if(v1 == 1) {
                                v9 = Math.abs(v9 / v2_2);
                            }
                            else {
                                v9 = Math.abs(v2_2 / v9);
                            }
                        }
                        catch(NumberFormatException ) {
                            goto label_53;
                        }
                    }
                    else {
                        goto label_53;
                    }
                }

                if(v9 > 0f) {
                    this.mDimensionRatio = v9;
                    this.mDimensionRatioSide = v1;
                }

                return;
            }
        }

        this.mDimensionRatio = 0f;
    }

    public void setDrawHeight(int arg1) {
        this.mDrawHeight = arg1;
    }

    public void setDrawOrigin(int arg2, int arg3) {
        this.mDrawX = arg2 - this.mOffsetX;
        this.mDrawY = arg3 - this.mOffsetY;
        this.mX = this.mDrawX;
        this.mY = this.mDrawY;
    }

    public void setDrawWidth(int arg1) {
        this.mDrawWidth = arg1;
    }

    public void setDrawX(int arg2) {
        this.mDrawX = arg2 - this.mOffsetX;
        this.mX = this.mDrawX;
    }

    public void setDrawY(int arg2) {
        this.mDrawY = arg2 - this.mOffsetY;
        this.mY = this.mDrawY;
    }

    public void setFrame(int arg2, int arg3, int arg4, int arg5) {
        arg4 -= arg2;
        arg5 -= arg3;
        this.mX = arg2;
        this.mY = arg3;
        if(this.mVisibility == 8) {
            this.mWidth = 0;
            this.mHeight = 0;
            return;
        }

        if(this.mListDimensionBehaviors[0] == DimensionBehaviour.FIXED && arg4 < this.mWidth) {
            arg4 = this.mWidth;
        }

        if(this.mListDimensionBehaviors[1] == DimensionBehaviour.FIXED && arg5 < this.mHeight) {
            arg5 = this.mHeight;
        }

        this.mWidth = arg4;
        this.mHeight = arg5;
        if(this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }

        if(this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setGoneMargin(Type arg2, int arg3) {
        switch(androidx.constraintlayout.solver.widgets.ConstraintWidget$1.$SwitchMap$androidx$constraintlayout$solver$widgets$ConstraintAnchor$Type[arg2.ordinal()]) {
            case 1: {
                this.mLeft.mGoneMargin = arg3;
                break;
            }
            case 2: {
                this.mTop.mGoneMargin = arg3;
                break;
            }
            case 3: {
                this.mRight.mGoneMargin = arg3;
                break;
            }
            case 4: {
                this.mBottom.mGoneMargin = arg3;
                break;
            }
            default: {
                break;
            }
        }
    }

    public void setHeight(int arg2) {
        this.mHeight = arg2;
        if(this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    public void setHeightWrapContent(boolean arg1) {
        this.mIsHeightWrapContent = arg1;
    }

    public void setHorizontalBiasPercent(float arg1) {
        this.mHorizontalBiasPercent = arg1;
    }

    public void setHorizontalChainStyle(int arg1) {
        this.mHorizontalChainStyle = arg1;
    }

    public void setHorizontalDimension(int arg1, int arg2) {
        this.mX = arg1;
        this.mWidth = arg2 - arg1;
        if(this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setHorizontalDimensionBehaviour(DimensionBehaviour arg3) {
        this.mListDimensionBehaviors[0] = arg3;
        if(arg3 == DimensionBehaviour.WRAP_CONTENT) {
            this.setWidth(this.mWrapWidth);
        }
    }

    public void setHorizontalMatchStyle(int arg1, int arg2, int arg3, float arg4) {
        this.mMatchConstraintDefaultWidth = arg1;
        this.mMatchConstraintMinWidth = arg2;
        this.mMatchConstraintMaxWidth = arg3;
        this.mMatchConstraintPercentWidth = arg4;
        if(arg4 < 1f && this.mMatchConstraintDefaultWidth == 0) {
            this.mMatchConstraintDefaultWidth = 2;
        }
    }

    public void setHorizontalWeight(float arg3) {
        this.mWeight[0] = arg3;
    }

    public void setMaxHeight(int arg3) {
        this.mMaxDimension[1] = arg3;
    }

    public void setMaxWidth(int arg3) {
        this.mMaxDimension[0] = arg3;
    }

    public void setMinHeight(int arg1) {
        this.mMinHeight = arg1 < 0 ? 0 : arg1;
    }

    public void setMinWidth(int arg1) {
        this.mMinWidth = arg1 < 0 ? 0 : arg1;
    }

    public void setOffset(int arg1, int arg2) {
        this.mOffsetX = arg1;
        this.mOffsetY = arg2;
    }

    public void setOrigin(int arg1, int arg2) {
        this.mX = arg1;
        this.mY = arg2;
    }

    public void setParent(ConstraintWidget arg1) {
        this.mParent = arg1;
    }

    public void setType(String arg1) {
        this.mType = arg1;
    }

    public void setVerticalBiasPercent(float arg1) {
        this.mVerticalBiasPercent = arg1;
    }

    public void setVerticalChainStyle(int arg1) {
        this.mVerticalChainStyle = arg1;
    }

    public void setVerticalDimension(int arg1, int arg2) {
        this.mY = arg1;
        this.mHeight = arg2 - arg1;
        if(this.mHeight < this.mMinHeight) {
            this.mHeight = this.mMinHeight;
        }
    }

    public void setVerticalDimensionBehaviour(DimensionBehaviour arg3) {
        this.mListDimensionBehaviors[1] = arg3;
        if(arg3 == DimensionBehaviour.WRAP_CONTENT) {
            this.setHeight(this.mWrapHeight);
        }
    }

    public void setVerticalMatchStyle(int arg1, int arg2, int arg3, float arg4) {
        this.mMatchConstraintDefaultHeight = arg1;
        this.mMatchConstraintMinHeight = arg2;
        this.mMatchConstraintMaxHeight = arg3;
        this.mMatchConstraintPercentHeight = arg4;
        if(arg4 < 1f && this.mMatchConstraintDefaultHeight == 0) {
            this.mMatchConstraintDefaultHeight = 2;
        }
    }

    public void setVerticalWeight(float arg3) {
        this.mWeight[1] = arg3;
    }

    public void setVisibility(int arg1) {
        this.mVisibility = arg1;
    }

    public void setWidth(int arg2) {
        this.mWidth = arg2;
        if(this.mWidth < this.mMinWidth) {
            this.mWidth = this.mMinWidth;
        }
    }

    public void setWidthWrapContent(boolean arg1) {
        this.mIsWidthWrapContent = arg1;
    }

    public void setWrapHeight(int arg1) {
        this.mWrapHeight = arg1;
    }

    public void setWrapWidth(int arg1) {
        this.mWrapWidth = arg1;
    }

    public void setX(int arg1) {
        this.mX = arg1;
    }

    public void setY(int arg1) {
        this.mY = arg1;
    }

    public void setupDimensionRatio(boolean arg6, boolean arg7, boolean arg8, boolean arg9) {
        float v1 = 1f;
        int v3 = -1;
        if(this.mResolvedDimensionRatioSide == v3) {
            if((arg8) && !arg9) {
                this.mResolvedDimensionRatioSide = 0;
                goto label_18;
            }

            if(arg8) {
                goto label_18;
            }

            if(!arg9) {
                goto label_18;
            }

            this.mResolvedDimensionRatioSide = 1;
            if(this.mDimensionRatioSide != v3) {
                goto label_18;
            }

            this.mResolvedDimensionRatio = v1 / this.mResolvedDimensionRatio;
        }

    label_18:
        if(this.mResolvedDimensionRatioSide == 0) {
            if((this.mTop.isConnected()) && (this.mBottom.isConnected())) {
                goto label_28;
            }

            this.mResolvedDimensionRatioSide = 1;
        }
        else {
        label_28:
            if(this.mResolvedDimensionRatioSide != 1) {
                goto label_37;
            }

            if((this.mLeft.isConnected()) && (this.mRight.isConnected())) {
                goto label_37;
            }

            this.mResolvedDimensionRatioSide = 0;
        }

    label_37:
        if(this.mResolvedDimensionRatioSide == v3 && (!this.mTop.isConnected() || !this.mBottom.isConnected() || !this.mLeft.isConnected() || !this.mRight.isConnected())) {
            if((this.mTop.isConnected()) && (this.mBottom.isConnected())) {
                this.mResolvedDimensionRatioSide = 0;
                goto label_69;
            }

            if(!this.mLeft.isConnected()) {
                goto label_69;
            }

            if(!this.mRight.isConnected()) {
                goto label_69;
            }

            this.mResolvedDimensionRatio = v1 / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }

    label_69:
        if(this.mResolvedDimensionRatioSide == v3) {
            if((arg6) && !arg7) {
                this.mResolvedDimensionRatioSide = 0;
                goto label_81;
            }

            if(arg6) {
                goto label_81;
            }

            if(!arg7) {
                goto label_81;
            }

            this.mResolvedDimensionRatio = v1 / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }

    label_81:
        if(this.mResolvedDimensionRatioSide == v3) {
            if(this.mMatchConstraintMinWidth > 0 && this.mMatchConstraintMinHeight == 0) {
                this.mResolvedDimensionRatioSide = 0;
                goto label_97;
            }

            if(this.mMatchConstraintMinWidth != 0) {
                goto label_97;
            }

            if(this.mMatchConstraintMinHeight <= 0) {
                goto label_97;
            }

            this.mResolvedDimensionRatio = v1 / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }

    label_97:
        if(this.mResolvedDimensionRatioSide == v3 && (arg6) && (arg7)) {
            this.mResolvedDimensionRatio = v1 / this.mResolvedDimensionRatio;
            this.mResolvedDimensionRatioSide = 1;
        }
    }

    public String toString() {
        StringBuilder v0 = new StringBuilder();
        String v1_1 = this.mType != null ? "type: " + this.mType + " " : "";
        v0.append(v1_1);
        v1_1 = this.mDebugName != null ? "id: " + this.mDebugName + " " : "";
        v0.append(v1_1);
        v0.append("(");
        v0.append(this.mX);
        v0.append(", ");
        v0.append(this.mY);
        v0.append(") - (");
        v0.append(this.mWidth);
        v0.append(" x ");
        v0.append(this.mHeight);
        v0.append(") wrap: (");
        v0.append(this.mWrapWidth);
        v0.append(" x ");
        v0.append(this.mWrapHeight);
        v0.append(")");
        return v0.toString();
    }

    public void updateDrawPosition() {
        int v0 = this.mX;
        int v1 = this.mY;
        int v2 = this.mX + this.mWidth;
        int v3 = this.mY + this.mHeight;
        this.mDrawX = v0;
        this.mDrawY = v1;
        this.mDrawWidth = v2 - v0;
        this.mDrawHeight = v3 - v1;
    }

    public void updateFromSolver(LinearSystem arg7) {
        int v0 = arg7.getObjectVariableValue(this.mLeft);
        int v1 = arg7.getObjectVariableValue(this.mTop);
        int v2 = arg7.getObjectVariableValue(this.mRight);
        int v7 = arg7.getObjectVariableValue(this.mBottom);
        int v4 = v7 - v1;
        if(v2 - v0 < 0 || v4 < 0) {
        label_23:
            v7 = 0;
            v0 = 0;
            v1 = 0;
            v2 = 0;
        }
        else {
            int v3 = 0x80000000;
            if(v0 != v3) {
                v4 = 0x7FFFFFFF;
                if(v0 == v4) {
                    goto label_23;
                }
                else if(v1 == v3) {
                    goto label_23;
                }
                else if(v1 == v4) {
                    goto label_23;
                }
                else if(v2 == v3) {
                    goto label_23;
                }
                else if(v2 == v4) {
                    goto label_23;
                }
                else if(v7 == v3) {
                    goto label_23;
                }
                else if(v7 == v4) {
                    goto label_23;
                }
            }
            else {
                goto label_23;
            }
        }

        this.setFrame(v0, v1, v2, v7);
    }

    public void updateResolutionNodes() {
        int v0;
        for(v0 = 0; v0 < 6; ++v0) {
            this.mListAnchors[v0].getResolutionNode().update();
        }
    }
}

