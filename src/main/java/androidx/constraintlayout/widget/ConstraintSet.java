package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build$VERSION;
import android.support.constraint.R$styleable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintSet {
    class androidx.constraintlayout.widget.ConstraintSet$1 {
    }

    class Constraint {
        static final int UNSET = -1;
        public float alpha;
        public boolean applyElevation;
        public int baselineToBaseline;
        public int bottomMargin;
        public int bottomToBottom;
        public int bottomToTop;
        public float circleAngle;
        public int circleConstraint;
        public int circleRadius;
        public boolean constrainedHeight;
        public boolean constrainedWidth;
        public String dimensionRatio;
        public int editorAbsoluteX;
        public int editorAbsoluteY;
        public float elevation;
        public int endMargin;
        public int endToEnd;
        public int endToStart;
        public int goneBottomMargin;
        public int goneEndMargin;
        public int goneLeftMargin;
        public int goneRightMargin;
        public int goneStartMargin;
        public int goneTopMargin;
        public int guideBegin;
        public int guideEnd;
        public float guidePercent;
        public int heightDefault;
        public int heightMax;
        public int heightMin;
        public float heightPercent;
        public float horizontalBias;
        public int horizontalChainStyle;
        public float horizontalWeight;
        public int leftMargin;
        public int leftToLeft;
        public int leftToRight;
        public int mBarrierDirection;
        public int mHeight;
        public int mHelperType;
        boolean mIsGuideline;
        public int[] mReferenceIds;
        int mViewId;
        public int mWidth;
        public int orientation;
        public int rightMargin;
        public int rightToLeft;
        public int rightToRight;
        public float rotation;
        public float rotationX;
        public float rotationY;
        public float scaleX;
        public float scaleY;
        public int startMargin;
        public int startToEnd;
        public int startToStart;
        public int topMargin;
        public int topToBottom;
        public int topToTop;
        public float transformPivotX;
        public float transformPivotY;
        public float translationX;
        public float translationY;
        public float translationZ;
        public float verticalBias;
        public int verticalChainStyle;
        public float verticalWeight;
        public int visibility;
        public int widthDefault;
        public int widthMax;
        public int widthMin;
        public float widthPercent;

        Constraint(androidx.constraintlayout.widget.ConstraintSet$1 arg1) {
            this();
        }

        private Constraint() {
            super();
            this.mIsGuideline = false;
            this.guideBegin = -1;
            this.guideEnd = -1;
            this.guidePercent = -1f;
            this.leftToLeft = -1;
            this.leftToRight = -1;
            this.rightToLeft = -1;
            this.rightToRight = -1;
            this.topToTop = -1;
            this.topToBottom = -1;
            this.bottomToTop = -1;
            this.bottomToBottom = -1;
            this.baselineToBaseline = -1;
            this.startToEnd = -1;
            this.startToStart = -1;
            this.endToStart = -1;
            this.endToEnd = -1;
            this.horizontalBias = 0.5f;
            this.verticalBias = 0.5f;
            this.dimensionRatio = null;
            this.circleConstraint = -1;
            this.circleRadius = 0;
            this.circleAngle = 0f;
            this.editorAbsoluteX = -1;
            this.editorAbsoluteY = -1;
            this.orientation = -1;
            this.leftMargin = -1;
            this.rightMargin = -1;
            this.topMargin = -1;
            this.bottomMargin = -1;
            this.endMargin = -1;
            this.startMargin = -1;
            this.visibility = 0;
            this.goneLeftMargin = -1;
            this.goneTopMargin = -1;
            this.goneRightMargin = -1;
            this.goneBottomMargin = -1;
            this.goneEndMargin = -1;
            this.goneStartMargin = -1;
            this.verticalWeight = 0f;
            this.horizontalWeight = 0f;
            this.horizontalChainStyle = 0;
            this.verticalChainStyle = 0;
            this.alpha = 1f;
            this.applyElevation = false;
            this.elevation = 0f;
            this.rotation = 0f;
            this.rotationX = 0f;
            this.rotationY = 0f;
            this.scaleX = 1f;
            this.scaleY = 1f;
            this.transformPivotX = NaNf;
            this.transformPivotY = NaNf;
            this.translationX = 0f;
            this.translationY = 0f;
            this.translationZ = 0f;
            this.constrainedWidth = false;
            this.constrainedHeight = false;
            this.widthDefault = 0;
            this.heightDefault = 0;
            this.widthMax = -1;
            this.heightMax = -1;
            this.widthMin = -1;
            this.heightMin = -1;
            this.widthPercent = 1f;
            this.heightPercent = 1f;
            this.mBarrierDirection = -1;
            this.mHelperType = -1;
        }

        static void access$100(Constraint arg0, int arg1, LayoutParams arg2) {
            arg0.fillFrom(arg1, arg2);
        }

        static void access$200(Constraint arg0, ConstraintHelper arg1, int arg2, androidx.constraintlayout.widget.Constraints$LayoutParams arg3) {
            arg0.fillFromConstraints(arg1, arg2, arg3);
        }

        static void access$300(Constraint arg0, int arg1, androidx.constraintlayout.widget.Constraints$LayoutParams arg2) {
            arg0.fillFromConstraints(arg1, arg2);
        }

        public void applyTo(LayoutParams arg3) {
            arg3.leftToLeft = this.leftToLeft;
            arg3.leftToRight = this.leftToRight;
            arg3.rightToLeft = this.rightToLeft;
            arg3.rightToRight = this.rightToRight;
            arg3.topToTop = this.topToTop;
            arg3.topToBottom = this.topToBottom;
            arg3.bottomToTop = this.bottomToTop;
            arg3.bottomToBottom = this.bottomToBottom;
            arg3.baselineToBaseline = this.baselineToBaseline;
            arg3.startToEnd = this.startToEnd;
            arg3.startToStart = this.startToStart;
            arg3.endToStart = this.endToStart;
            arg3.endToEnd = this.endToEnd;
            arg3.leftMargin = this.leftMargin;
            arg3.rightMargin = this.rightMargin;
            arg3.topMargin = this.topMargin;
            arg3.bottomMargin = this.bottomMargin;
            arg3.goneStartMargin = this.goneStartMargin;
            arg3.goneEndMargin = this.goneEndMargin;
            arg3.horizontalBias = this.horizontalBias;
            arg3.verticalBias = this.verticalBias;
            arg3.circleConstraint = this.circleConstraint;
            arg3.circleRadius = this.circleRadius;
            arg3.circleAngle = this.circleAngle;
            arg3.dimensionRatio = this.dimensionRatio;
            arg3.editorAbsoluteX = this.editorAbsoluteX;
            arg3.editorAbsoluteY = this.editorAbsoluteY;
            arg3.verticalWeight = this.verticalWeight;
            arg3.horizontalWeight = this.horizontalWeight;
            arg3.verticalChainStyle = this.verticalChainStyle;
            arg3.horizontalChainStyle = this.horizontalChainStyle;
            arg3.constrainedWidth = this.constrainedWidth;
            arg3.constrainedHeight = this.constrainedHeight;
            arg3.matchConstraintDefaultWidth = this.widthDefault;
            arg3.matchConstraintDefaultHeight = this.heightDefault;
            arg3.matchConstraintMaxWidth = this.widthMax;
            arg3.matchConstraintMaxHeight = this.heightMax;
            arg3.matchConstraintMinWidth = this.widthMin;
            arg3.matchConstraintMinHeight = this.heightMin;
            arg3.matchConstraintPercentWidth = this.widthPercent;
            arg3.matchConstraintPercentHeight = this.heightPercent;
            arg3.orientation = this.orientation;
            arg3.guidePercent = this.guidePercent;
            arg3.guideBegin = this.guideBegin;
            arg3.guideEnd = this.guideEnd;
            arg3.width = this.mWidth;
            arg3.height = this.mHeight;
            if(Build$VERSION.SDK_INT >= 17) {
                arg3.setMarginStart(this.startMargin);
                arg3.setMarginEnd(this.endMargin);
            }

            arg3.validate();
        }

        public Constraint clone() {
            Constraint v0 = new Constraint();
            v0.mIsGuideline = this.mIsGuideline;
            v0.mWidth = this.mWidth;
            v0.mHeight = this.mHeight;
            v0.guideBegin = this.guideBegin;
            v0.guideEnd = this.guideEnd;
            v0.guidePercent = this.guidePercent;
            v0.leftToLeft = this.leftToLeft;
            v0.leftToRight = this.leftToRight;
            v0.rightToLeft = this.rightToLeft;
            v0.rightToRight = this.rightToRight;
            v0.topToTop = this.topToTop;
            v0.topToBottom = this.topToBottom;
            v0.bottomToTop = this.bottomToTop;
            v0.bottomToBottom = this.bottomToBottom;
            v0.baselineToBaseline = this.baselineToBaseline;
            v0.startToEnd = this.startToEnd;
            v0.startToStart = this.startToStart;
            v0.endToStart = this.endToStart;
            v0.endToEnd = this.endToEnd;
            v0.horizontalBias = this.horizontalBias;
            v0.verticalBias = this.verticalBias;
            v0.dimensionRatio = this.dimensionRatio;
            v0.editorAbsoluteX = this.editorAbsoluteX;
            v0.editorAbsoluteY = this.editorAbsoluteY;
            v0.horizontalBias = this.horizontalBias;
            v0.horizontalBias = this.horizontalBias;
            v0.horizontalBias = this.horizontalBias;
            v0.horizontalBias = this.horizontalBias;
            v0.horizontalBias = this.horizontalBias;
            v0.orientation = this.orientation;
            v0.leftMargin = this.leftMargin;
            v0.rightMargin = this.rightMargin;
            v0.topMargin = this.topMargin;
            v0.bottomMargin = this.bottomMargin;
            v0.endMargin = this.endMargin;
            v0.startMargin = this.startMargin;
            v0.visibility = this.visibility;
            v0.goneLeftMargin = this.goneLeftMargin;
            v0.goneTopMargin = this.goneTopMargin;
            v0.goneRightMargin = this.goneRightMargin;
            v0.goneBottomMargin = this.goneBottomMargin;
            v0.goneEndMargin = this.goneEndMargin;
            v0.goneStartMargin = this.goneStartMargin;
            v0.verticalWeight = this.verticalWeight;
            v0.horizontalWeight = this.horizontalWeight;
            v0.horizontalChainStyle = this.horizontalChainStyle;
            v0.verticalChainStyle = this.verticalChainStyle;
            v0.alpha = this.alpha;
            v0.applyElevation = this.applyElevation;
            v0.elevation = this.elevation;
            v0.rotation = this.rotation;
            v0.rotationX = this.rotationX;
            v0.rotationY = this.rotationY;
            v0.scaleX = this.scaleX;
            v0.scaleY = this.scaleY;
            v0.transformPivotX = this.transformPivotX;
            v0.transformPivotY = this.transformPivotY;
            v0.translationX = this.translationX;
            v0.translationY = this.translationY;
            v0.translationZ = this.translationZ;
            v0.constrainedWidth = this.constrainedWidth;
            v0.constrainedHeight = this.constrainedHeight;
            v0.widthDefault = this.widthDefault;
            v0.heightDefault = this.heightDefault;
            v0.widthMax = this.widthMax;
            v0.heightMax = this.heightMax;
            v0.widthMin = this.widthMin;
            v0.heightMin = this.heightMin;
            v0.widthPercent = this.widthPercent;
            v0.heightPercent = this.heightPercent;
            v0.mBarrierDirection = this.mBarrierDirection;
            v0.mHelperType = this.mHelperType;
            if(this.mReferenceIds != null) {
                v0.mReferenceIds = Arrays.copyOf(this.mReferenceIds, this.mReferenceIds.length);
            }

            v0.circleConstraint = this.circleConstraint;
            v0.circleRadius = this.circleRadius;
            v0.circleAngle = this.circleAngle;
            return v0;
        }

        public Object clone() throws CloneNotSupportedException {
            return this.clone();
        }

        private void fillFrom(int arg2, LayoutParams arg3) {
            this.mViewId = arg2;
            this.leftToLeft = arg3.leftToLeft;
            this.leftToRight = arg3.leftToRight;
            this.rightToLeft = arg3.rightToLeft;
            this.rightToRight = arg3.rightToRight;
            this.topToTop = arg3.topToTop;
            this.topToBottom = arg3.topToBottom;
            this.bottomToTop = arg3.bottomToTop;
            this.bottomToBottom = arg3.bottomToBottom;
            this.baselineToBaseline = arg3.baselineToBaseline;
            this.startToEnd = arg3.startToEnd;
            this.startToStart = arg3.startToStart;
            this.endToStart = arg3.endToStart;
            this.endToEnd = arg3.endToEnd;
            this.horizontalBias = arg3.horizontalBias;
            this.verticalBias = arg3.verticalBias;
            this.dimensionRatio = arg3.dimensionRatio;
            this.circleConstraint = arg3.circleConstraint;
            this.circleRadius = arg3.circleRadius;
            this.circleAngle = arg3.circleAngle;
            this.editorAbsoluteX = arg3.editorAbsoluteX;
            this.editorAbsoluteY = arg3.editorAbsoluteY;
            this.orientation = arg3.orientation;
            this.guidePercent = arg3.guidePercent;
            this.guideBegin = arg3.guideBegin;
            this.guideEnd = arg3.guideEnd;
            this.mWidth = arg3.width;
            this.mHeight = arg3.height;
            this.leftMargin = arg3.leftMargin;
            this.rightMargin = arg3.rightMargin;
            this.topMargin = arg3.topMargin;
            this.bottomMargin = arg3.bottomMargin;
            this.verticalWeight = arg3.verticalWeight;
            this.horizontalWeight = arg3.horizontalWeight;
            this.verticalChainStyle = arg3.verticalChainStyle;
            this.horizontalChainStyle = arg3.horizontalChainStyle;
            this.constrainedWidth = arg3.constrainedWidth;
            this.constrainedHeight = arg3.constrainedHeight;
            this.widthDefault = arg3.matchConstraintDefaultWidth;
            this.heightDefault = arg3.matchConstraintDefaultHeight;
            this.constrainedWidth = arg3.constrainedWidth;
            this.widthMax = arg3.matchConstraintMaxWidth;
            this.heightMax = arg3.matchConstraintMaxHeight;
            this.widthMin = arg3.matchConstraintMinWidth;
            this.heightMin = arg3.matchConstraintMinHeight;
            this.widthPercent = arg3.matchConstraintPercentWidth;
            this.heightPercent = arg3.matchConstraintPercentHeight;
            if(Build$VERSION.SDK_INT >= 17) {
                this.endMargin = arg3.getMarginEnd();
                this.startMargin = arg3.getMarginStart();
            }
        }

        private void fillFromConstraints(ConstraintHelper arg1, int arg2, androidx.constraintlayout.widget.Constraints$LayoutParams arg3) {
            this.fillFromConstraints(arg2, arg3);
            if((arg1 instanceof Barrier)) {
                this.mHelperType = 1;
                this.mBarrierDirection = ((Barrier)arg1).getType();
                this.mReferenceIds = ((Barrier)arg1).getReferencedIds();
            }
        }

        private void fillFromConstraints(int arg1, androidx.constraintlayout.widget.Constraints$LayoutParams arg2) {
            this.fillFrom(arg1, ((LayoutParams)arg2));
            this.alpha = arg2.alpha;
            this.rotation = arg2.rotation;
            this.rotationX = arg2.rotationX;
            this.rotationY = arg2.rotationY;
            this.scaleX = arg2.scaleX;
            this.scaleY = arg2.scaleY;
            this.transformPivotX = arg2.transformPivotX;
            this.transformPivotY = arg2.transformPivotY;
            this.translationX = arg2.translationX;
            this.translationY = arg2.translationY;
            this.translationZ = arg2.translationZ;
            this.elevation = arg2.elevation;
            this.applyElevation = arg2.applyElevation;
        }
    }

    private static final int ALPHA = 43;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_TO_BASELINE = 1;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 0x3F;
    private static final int CIRCLE_RADIUS = 62;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    public static final int GONE = 8;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    public static final int INVISIBLE = 4;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 0x2F;
    private static final int SCALE_Y = 0x30;
    public static final int START = 6;
    private static final int START_MARGIN = 0x1F;
    private static final int START_TO_END = 0x20;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 0x40;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int[] VISIBILITY_FLAGS = null;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    public static final int WRAP_CONTENT = -2;
    private HashMap mConstraints;
    private static SparseIntArray mapToConstant;

    static {
        ConstraintSet.VISIBILITY_FLAGS = new int[]{0, 4, 8};
        ConstraintSet.mapToConstant = new SparseIntArray();
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintRight_toRightOf, 30);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintTop_toTopOf, 36);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_editor_absoluteX, 6);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_editor_absoluteY, 7);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintGuide_begin, 17);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintGuide_end, 18);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintGuide_percent, 19);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_orientation, 27);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintStart_toEndOf, 0x20);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintStart_toStartOf, 33);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_goneMarginLeft, 13);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_goneMarginTop, 16);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_goneMarginRight, 14);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_goneMarginBottom, 11);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_goneMarginStart, 15);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_goneMarginEnd, 12);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintVertical_weight, 40);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintHorizontal_weight, 39);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintHorizontal_bias, 20);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintVertical_bias, 37);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintDimensionRatio, 5);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintLeft_creator, 0x40);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintTop_creator, 0x40);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintRight_creator, 0x40);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintBottom_creator, 0x40);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintBaseline_creator, 0x40);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_layout_marginLeft, 24);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_layout_marginRight, 28);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_layout_marginStart, 0x1F);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_layout_marginEnd, 8);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_layout_marginTop, 34);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_layout_marginBottom, 2);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_layout_width, 23);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_layout_height, 21);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_visibility, 22);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_alpha, 43);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_elevation, 44);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_rotationX, 45);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_rotationY, 46);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_rotation, 60);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_scaleX, 0x2F);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_scaleY, 0x30);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_transformPivotX, 49);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_transformPivotY, 50);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_translationX, 51);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_translationY, 52);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_translationZ, 53);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintWidth_default, 54);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintHeight_default, 55);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintWidth_max, 56);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintHeight_max, 57);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintWidth_min, 58);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintHeight_min, 59);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintCircle, 61);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintCircleRadius, 62);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_layout_constraintCircleAngle, 0x3F);
        ConstraintSet.mapToConstant.append(R$styleable.ConstraintSet_android_id, 38);
    }

    public ConstraintSet() {
        super();
        this.mConstraints = new HashMap();
    }

    public void addToHorizontalChain(int arg9, int arg10, int arg11) {
        int v4 = arg10 == 0 ? 1 : 2;
        this.connect(arg9, 1, arg10, v4, 0);
        int v2 = 2;
        v4 = arg11 == 0 ? 2 : 1;
        this.connect(arg9, v2, arg11, v4, 0);
        if(arg10 != 0) {
            this.connect(arg10, 2, arg9, 1, 0);
        }

        if(arg11 != 0) {
            this.connect(arg11, 1, arg9, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int arg9, int arg10, int arg11) {
        int v4 = arg10 == 0 ? 6 : 7;
        this.connect(arg9, 6, arg10, v4, 0);
        int v2 = 7;
        v4 = arg11 == 0 ? 7 : 6;
        this.connect(arg9, v2, arg11, v4, 0);
        if(arg10 != 0) {
            this.connect(arg10, 7, arg9, 6, 0);
        }

        if(arg11 != 0) {
            this.connect(arg11, 6, arg9, 7, 0);
        }
    }

    public void addToVerticalChain(int arg15, int arg16, int arg17) {
        int v4 = arg16 == 0 ? 3 : 4;
        this.connect(arg15, 3, arg16, v4, 0);
        int v10 = 4;
        int v12 = arg17 == 0 ? 4 : 3;
        this.connect(arg15, v10, arg17, v12, 0);
        if(arg16 != 0) {
            this.connect(arg16, 4, arg15, 3, 0);
        }

        if(arg16 != 0) {
            this.connect(arg17, 3, arg15, 4, 0);
        }
    }

    public void applyTo(ConstraintLayout arg2) {
        this.applyToInternal(arg2);
        arg2.setConstraintSet(null);
    }

    void applyToInternal(ConstraintLayout arg10) {
        int v0 = arg10.getChildCount();
        HashSet v1 = new HashSet(this.mConstraints.keySet());
        int v2;
        for(v2 = 0; true; ++v2) {
            int v4 = -1;
            if(v2 >= v0) {
                goto label_83;
            }

            View v5 = arg10.getChildAt(v2);
            int v6 = v5.getId();
            if(v6 == v4) {
                break;
            }

            if(this.mConstraints.containsKey(Integer.valueOf(v6))) {
                v1.remove(Integer.valueOf(v6));
                Object v7 = this.mConstraints.get(Integer.valueOf(v6));
                if(((Constraint)v7).mHelperType != v4) {
                    if(((Constraint)v7).mHelperType != 1) {
                    }
                    else {
                        v5.setId(v6);
                        v5.setReferencedIds(((Constraint)v7).mReferenceIds);
                        v5.setType(((Constraint)v7).mBarrierDirection);
                        ((Constraint)v7).applyTo(arg10.generateDefaultLayoutParams());
                    }
                }

                ViewGroup$LayoutParams v3 = v5.getLayoutParams();
                ((Constraint)v7).applyTo(((LayoutParams)v3));
                v5.setLayoutParams(v3);
                v5.setVisibility(((Constraint)v7).visibility);
                if(Build$VERSION.SDK_INT < 17) {
                    goto label_77;
                }

                v5.setAlpha(((Constraint)v7).alpha);
                v5.setRotation(((Constraint)v7).rotation);
                v5.setRotationX(((Constraint)v7).rotationX);
                v5.setRotationY(((Constraint)v7).rotationY);
                v5.setScaleX(((Constraint)v7).scaleX);
                v5.setScaleY(((Constraint)v7).scaleY);
                if(!Float.isNaN(((Constraint)v7).transformPivotX)) {
                    v5.setPivotX(((Constraint)v7).transformPivotX);
                }

                if(!Float.isNaN(((Constraint)v7).transformPivotY)) {
                    v5.setPivotY(((Constraint)v7).transformPivotY);
                }

                v5.setTranslationX(((Constraint)v7).translationX);
                v5.setTranslationY(((Constraint)v7).translationY);
                if(Build$VERSION.SDK_INT < 21) {
                    goto label_77;
                }

                v5.setTranslationZ(((Constraint)v7).translationZ);
                if(!((Constraint)v7).applyElevation) {
                    goto label_77;
                }

                v5.setElevation(((Constraint)v7).elevation);
            }

        label_77:
        }

        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    label_83:
        Iterator v0_1 = v1.iterator();
        while(v0_1.hasNext()) {
            Object v1_1 = v0_1.next();
            Object v2_1 = this.mConstraints.get(v1_1);
            if(((Constraint)v2_1).mHelperType != v4) {
                if(((Constraint)v2_1).mHelperType != 1) {
                }
                else {
                    Barrier v5_1 = new Barrier(arg10.getContext());
                    v5_1.setId(((Integer)v1_1).intValue());
                    v5_1.setReferencedIds(((Constraint)v2_1).mReferenceIds);
                    v5_1.setType(((Constraint)v2_1).mBarrierDirection);
                    LayoutParams v6_1 = arg10.generateDefaultLayoutParams();
                    ((Constraint)v2_1).applyTo(v6_1);
                    arg10.addView(((View)v5_1), ((ViewGroup$LayoutParams)v6_1));
                }
            }

            if(!((Constraint)v2_1).mIsGuideline) {
                continue;
            }

            Guideline v5_2 = new Guideline(arg10.getContext());
            v5_2.setId(((Integer)v1_1).intValue());
            LayoutParams v1_2 = arg10.generateDefaultLayoutParams();
            ((Constraint)v2_1).applyTo(v1_2);
            arg10.addView(((View)v5_2), ((ViewGroup$LayoutParams)v1_2));
        }
    }

    public void center(int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, float arg16) {
        ConstraintSet v6 = this;
        int v4 = arg11;
        float v7 = arg16;
        if(arg12 >= 0) {
            if(arg15 >= 0) {
                if(v7 > 0f && v7 <= 1f) {
                    if(v4 == 1 || v4 == 2) {
                        this.connect(arg9, 1, arg10, arg11, arg12);
                        this.connect(arg9, 2, arg13, arg14, arg15);
                        v6.mConstraints.get(Integer.valueOf(arg9)).horizontalBias = v7;
                    }
                    else {
                        if(v4 != 6) {
                            if(v4 == 7) {
                            }
                            else {
                                this.connect(arg9, 3, arg10, arg11, arg12);
                                this.connect(arg9, 4, arg13, arg14, arg15);
                                v6.mConstraints.get(Integer.valueOf(arg9)).verticalBias = v7;
                                return;
                            }
                        }

                        this.connect(arg9, 6, arg10, arg11, arg12);
                        this.connect(arg9, 7, arg13, arg14, arg15);
                        v6.mConstraints.get(Integer.valueOf(arg9)).horizontalBias = v7;
                    }

                    return;
                }

                throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
            }

            throw new IllegalArgumentException("margin must be > 0");
        }

        throw new IllegalArgumentException("margin must be > 0");
    }

    public void centerHorizontally(int arg10, int arg11) {
        if(arg11 == 0) {
            this.center(arg10, 0, 1, 0, 0, 2, 0, 0.5f);
        }
        else {
            this.center(arg10, arg11, 2, 0, arg11, 1, 0, 0.5f);
        }
    }

    public void centerHorizontally(int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, float arg17) {
        this.connect(arg10, 1, arg11, arg12, arg13);
        this.connect(arg10, 2, arg14, arg15, arg16);
        this.mConstraints.get(Integer.valueOf(arg10)).horizontalBias = arg17;
    }

    public void centerHorizontallyRtl(int arg10, int arg11) {
        if(arg11 == 0) {
            this.center(arg10, 0, 6, 0, 0, 7, 0, 0.5f);
        }
        else {
            this.center(arg10, arg11, 7, 0, arg11, 6, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, float arg17) {
        this.connect(arg10, 6, arg11, arg12, arg13);
        this.connect(arg10, 7, arg14, arg15, arg16);
        this.mConstraints.get(Integer.valueOf(arg10)).horizontalBias = arg17;
    }

    public void centerVertically(int arg10, int arg11) {
        if(arg11 == 0) {
            this.center(arg10, 0, 3, 0, 0, 4, 0, 0.5f);
        }
        else {
            this.center(arg10, arg11, 4, 0, arg11, 3, 0, 0.5f);
        }
    }

    public void centerVertically(int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, float arg17) {
        this.connect(arg10, 3, arg11, arg12, arg13);
        this.connect(arg10, 4, arg14, arg15, arg16);
        this.mConstraints.get(Integer.valueOf(arg10)).verticalBias = arg17;
    }

    public void clear(int arg2) {
        this.mConstraints.remove(Integer.valueOf(arg2));
    }

    public void clear(int arg3, int arg4) {
        if(this.mConstraints.containsKey(Integer.valueOf(arg3))) {
            Object v3 = this.mConstraints.get(Integer.valueOf(arg3));
            int v0 = -1;
            switch(arg4) {
                case 1: {
                    goto label_40;
                }
                case 2: {
                    goto label_35;
                }
                case 3: {
                    goto label_30;
                }
                case 4: {
                    goto label_25;
                }
                case 5: {
                    goto label_23;
                }
                case 6: {
                    goto label_18;
                }
                case 7: {
                    goto label_13;
                }
            }

            throw new IllegalArgumentException("unknown constraint");
        label_18:
            ((Constraint)v3).startToEnd = v0;
            ((Constraint)v3).startToStart = v0;
            ((Constraint)v3).startMargin = v0;
            ((Constraint)v3).goneStartMargin = v0;
            return;
        label_35:
            ((Constraint)v3).rightToRight = v0;
            ((Constraint)v3).rightToLeft = v0;
            ((Constraint)v3).rightMargin = v0;
            ((Constraint)v3).goneRightMargin = v0;
            return;
        label_23:
            ((Constraint)v3).baselineToBaseline = v0;
            return;
        label_40:
            ((Constraint)v3).leftToRight = v0;
            ((Constraint)v3).leftToLeft = v0;
            ((Constraint)v3).leftMargin = v0;
            ((Constraint)v3).goneLeftMargin = v0;
            return;
        label_25:
            ((Constraint)v3).bottomToTop = v0;
            ((Constraint)v3).bottomToBottom = v0;
            ((Constraint)v3).bottomMargin = v0;
            ((Constraint)v3).goneBottomMargin = v0;
            return;
        label_13:
            ((Constraint)v3).endToStart = v0;
            ((Constraint)v3).endToEnd = v0;
            ((Constraint)v3).endMargin = v0;
            ((Constraint)v3).goneEndMargin = v0;
            return;
        label_30:
            ((Constraint)v3).topToBottom = v0;
            ((Constraint)v3).topToTop = v0;
            ((Constraint)v3).topMargin = v0;
            ((Constraint)v3).goneTopMargin = v0;
        }
    }

    public void clone(Context arg2, int arg3) {
        this.clone(LayoutInflater.from(arg2).inflate(arg3, null));
    }

    public void clone(ConstraintLayout arg11) {
        int v0 = arg11.getChildCount();
        this.mConstraints.clear();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v0) {
                return;
            }

            View v2 = arg11.getChildAt(v1);
            ViewGroup$LayoutParams v3 = v2.getLayoutParams();
            int v4 = v2.getId();
            if(v4 == -1) {
                break;
            }

            if(!this.mConstraints.containsKey(Integer.valueOf(v4))) {
                this.mConstraints.put(Integer.valueOf(v4), new Constraint(null));
            }

            Object v5 = this.mConstraints.get(Integer.valueOf(v4));
            Constraint.access$100(((Constraint)v5), v4, ((LayoutParams)v3));
            ((Constraint)v5).visibility = v2.getVisibility();
            if(Build$VERSION.SDK_INT >= 17) {
                ((Constraint)v5).alpha = v2.getAlpha();
                ((Constraint)v5).rotation = v2.getRotation();
                ((Constraint)v5).rotationX = v2.getRotationX();
                ((Constraint)v5).rotationY = v2.getRotationY();
                ((Constraint)v5).scaleX = v2.getScaleX();
                ((Constraint)v5).scaleY = v2.getScaleY();
                float v3_1 = v2.getPivotX();
                float v4_1 = v2.getPivotY();
                double v8 = 0;
                if((((double)v3_1)) != v8 || (((double)v4_1)) != v8) {
                    ((Constraint)v5).transformPivotX = v3_1;
                    ((Constraint)v5).transformPivotY = v4_1;
                }

                ((Constraint)v5).translationX = v2.getTranslationX();
                ((Constraint)v5).translationY = v2.getTranslationY();
                if(Build$VERSION.SDK_INT < 21) {
                    goto label_63;
                }

                ((Constraint)v5).translationZ = v2.getTranslationZ();
                if(!((Constraint)v5).applyElevation) {
                    goto label_63;
                }

                ((Constraint)v5).elevation = v2.getElevation();
            }

        label_63:
        }

        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }

    public void clone(ConstraintSet arg5) {
        this.mConstraints.clear();
        Iterator v0 = arg5.mConstraints.keySet().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            this.mConstraints.put(v1, arg5.mConstraints.get(v1).clone());
        }
    }

    public void clone(Constraints arg10) {
        int v0 = arg10.getChildCount();
        this.mConstraints.clear();
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= v0) {
                return;
            }

            View v2 = arg10.getChildAt(v1);
            ViewGroup$LayoutParams v3 = v2.getLayoutParams();
            int v4 = v2.getId();
            if(v4 == -1) {
                break;
            }

            if(!this.mConstraints.containsKey(Integer.valueOf(v4))) {
                this.mConstraints.put(Integer.valueOf(v4), new Constraint(null));
            }

            Object v5 = this.mConstraints.get(Integer.valueOf(v4));
            if((v2 instanceof ConstraintHelper)) {
                Constraint.access$200(((Constraint)v5), ((ConstraintHelper)v2), v4, ((androidx.constraintlayout.widget.Constraints$LayoutParams)v3));
            }

            Constraint.access$300(((Constraint)v5), v4, ((androidx.constraintlayout.widget.Constraints$LayoutParams)v3));
        }

        throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
    }

    public void connect(int arg8, int arg9, int arg10, int arg11, int arg12) {
        if(!this.mConstraints.containsKey(Integer.valueOf(arg8))) {
            this.mConstraints.put(Integer.valueOf(arg8), new Constraint(null));
        }

        Object v8 = this.mConstraints.get(Integer.valueOf(arg8));
        int v0 = 2;
        int v1 = 7;
        int v2 = 6;
        int v3 = 4;
        int v4 = 3;
        int v6 = -1;
        switch(arg9) {
            case 1: {
                goto label_164;
            }
            case 2: {
                goto label_143;
            }
            case 3: {
                goto label_120;
            }
            case 4: {
                goto label_97;
            }
            case 5: {
                goto label_77;
            }
            case 6: {
                goto label_56;
            }
            case 7: {
                goto label_35;
            }
        }

        StringBuilder v10 = new StringBuilder();
        v10.append(this.sideToString(arg9));
        v10.append(" to ");
        v10.append(this.sideToString(arg11));
        v10.append(" unknown");
        throw new IllegalArgumentException(v10.toString());
    label_97:
        if(arg11 == v3) {
            ((Constraint)v8).bottomToBottom = arg10;
            ((Constraint)v8).bottomToTop = v6;
            ((Constraint)v8).baselineToBaseline = v6;
        }
        else if(arg11 == v4) {
            ((Constraint)v8).bottomToTop = arg10;
            ((Constraint)v8).bottomToBottom = v6;
            ((Constraint)v8).baselineToBaseline = v6;
        }
        else {
            goto label_108;
        }

        ((Constraint)v8).bottomMargin = arg12;
        return;
    label_108:
        StringBuilder v9 = new StringBuilder();
        v9.append("right to ");
        v9.append(this.sideToString(arg11));
        v9.append(" undefined");
        throw new IllegalArgumentException(v9.toString());
    label_35:
        if(arg11 == v1) {
            ((Constraint)v8).endToEnd = arg10;
            ((Constraint)v8).endToStart = v6;
        }
        else if(arg11 == v2) {
            ((Constraint)v8).endToStart = arg10;
            ((Constraint)v8).endToEnd = v6;
        }
        else {
            goto label_44;
        }

        ((Constraint)v8).endMargin = arg12;
        return;
    label_44:
        v9 = new StringBuilder();
        v9.append("right to ");
        v9.append(this.sideToString(arg11));
        v9.append(" undefined");
        throw new IllegalArgumentException(v9.toString());
    label_164:
        if(arg11 == 1) {
            ((Constraint)v8).leftToLeft = arg10;
            ((Constraint)v8).leftToRight = v6;
        }
        else if(arg11 == v0) {
            ((Constraint)v8).leftToRight = arg10;
            ((Constraint)v8).leftToLeft = v6;
        }
        else {
            goto label_173;
        }

        ((Constraint)v8).leftMargin = arg12;
        return;
    label_173:
        v9 = new StringBuilder();
        v9.append("Left to ");
        v9.append(this.sideToString(arg11));
        v9.append(" undefined");
        throw new IllegalArgumentException(v9.toString());
    label_120:
        if(arg11 == v4) {
            ((Constraint)v8).topToTop = arg10;
            ((Constraint)v8).topToBottom = v6;
            ((Constraint)v8).baselineToBaseline = v6;
        }
        else if(arg11 == v3) {
            ((Constraint)v8).topToBottom = arg10;
            ((Constraint)v8).topToTop = v6;
            ((Constraint)v8).baselineToBaseline = v6;
        }
        else {
            goto label_131;
        }

        ((Constraint)v8).topMargin = arg12;
        return;
    label_131:
        v9 = new StringBuilder();
        v9.append("right to ");
        v9.append(this.sideToString(arg11));
        v9.append(" undefined");
        throw new IllegalArgumentException(v9.toString());
    label_56:
        if(arg11 == v2) {
            ((Constraint)v8).startToStart = arg10;
            ((Constraint)v8).startToEnd = v6;
        }
        else if(arg11 == v1) {
            ((Constraint)v8).startToEnd = arg10;
            ((Constraint)v8).startToStart = v6;
        }
        else {
            goto label_65;
        }

        ((Constraint)v8).startMargin = arg12;
        return;
    label_65:
        v9 = new StringBuilder();
        v9.append("right to ");
        v9.append(this.sideToString(arg11));
        v9.append(" undefined");
        throw new IllegalArgumentException(v9.toString());
    label_77:
        if(arg11 == 5) {
            ((Constraint)v8).baselineToBaseline = arg10;
            ((Constraint)v8).bottomToBottom = v6;
            ((Constraint)v8).bottomToTop = v6;
            ((Constraint)v8).topToTop = v6;
            ((Constraint)v8).topToBottom = v6;
            return;
        }

        v9 = new StringBuilder();
        v9.append("right to ");
        v9.append(this.sideToString(arg11));
        v9.append(" undefined");
        throw new IllegalArgumentException(v9.toString());
    label_143:
        if(arg11 == 1) {
            ((Constraint)v8).rightToLeft = arg10;
            ((Constraint)v8).rightToRight = v6;
        }
        else if(arg11 == v0) {
            ((Constraint)v8).rightToRight = arg10;
            ((Constraint)v8).rightToLeft = v6;
        }
        else {
            goto label_152;
        }

        ((Constraint)v8).rightMargin = arg12;
        return;
    label_152:
        v9 = new StringBuilder();
        v9.append("right to ");
        v9.append(this.sideToString(arg11));
        v9.append(" undefined");
        throw new IllegalArgumentException(v9.toString());
    }

    public void connect(int arg8, int arg9, int arg10, int arg11) {
        StringBuilder v9;
        if(!this.mConstraints.containsKey(Integer.valueOf(arg8))) {
            this.mConstraints.put(Integer.valueOf(arg8), new Constraint(null));
        }

        Object v8 = this.mConstraints.get(Integer.valueOf(arg8));
        int v0 = 2;
        int v1 = 7;
        int v2 = 6;
        int v3 = 4;
        int v4 = 3;
        int v6 = -1;
        switch(arg9) {
            case 1: {
                if(arg11 == 1) {
                    ((Constraint)v8).leftToLeft = arg10;
                    ((Constraint)v8).leftToRight = v6;
                    return;
                }

                if(arg11 == v0) {
                    ((Constraint)v8).leftToRight = arg10;
                    ((Constraint)v8).leftToLeft = v6;
                    return;
                }

                v9 = new StringBuilder();
                v9.append("left to ");
                v9.append(this.sideToString(arg11));
                v9.append(" undefined");
                throw new IllegalArgumentException(v9.toString());
            }
            case 2: {
                if(arg11 == 1) {
                    ((Constraint)v8).rightToLeft = arg10;
                    ((Constraint)v8).rightToRight = v6;
                    return;
                }

                if(arg11 == v0) {
                    ((Constraint)v8).rightToRight = arg10;
                    ((Constraint)v8).rightToLeft = v6;
                    return;
                }

                v9 = new StringBuilder();
                v9.append("right to ");
                v9.append(this.sideToString(arg11));
                v9.append(" undefined");
                throw new IllegalArgumentException(v9.toString());
            }
            case 3: {
                if(arg11 == v4) {
                    ((Constraint)v8).topToTop = arg10;
                    ((Constraint)v8).topToBottom = v6;
                    ((Constraint)v8).baselineToBaseline = v6;
                    return;
                }

                if(arg11 == v3) {
                    ((Constraint)v8).topToBottom = arg10;
                    ((Constraint)v8).topToTop = v6;
                    ((Constraint)v8).baselineToBaseline = v6;
                    return;
                }

                v9 = new StringBuilder();
                v9.append("right to ");
                v9.append(this.sideToString(arg11));
                v9.append(" undefined");
                throw new IllegalArgumentException(v9.toString());
            }
            case 4: {
                if(arg11 == v3) {
                    ((Constraint)v8).bottomToBottom = arg10;
                    ((Constraint)v8).bottomToTop = v6;
                    ((Constraint)v8).baselineToBaseline = v6;
                    return;
                }

                if(arg11 != v4) {
                    goto label_105;
                }

                ((Constraint)v8).bottomToTop = arg10;
                ((Constraint)v8).bottomToBottom = v6;
                ((Constraint)v8).baselineToBaseline = v6;
                break;
            }
            case 5: {
                if(arg11 == 5) {
                    ((Constraint)v8).baselineToBaseline = arg10;
                    ((Constraint)v8).bottomToBottom = v6;
                    ((Constraint)v8).bottomToTop = v6;
                    ((Constraint)v8).topToTop = v6;
                    ((Constraint)v8).topToBottom = v6;
                    return;
                }

                v9 = new StringBuilder();
                v9.append("right to ");
                v9.append(this.sideToString(arg11));
                v9.append(" undefined");
                throw new IllegalArgumentException(v9.toString());
            }
            case 6: {
                if(arg11 == v2) {
                    ((Constraint)v8).startToStart = arg10;
                    ((Constraint)v8).startToEnd = v6;
                    return;
                }

                if(arg11 == v1) {
                    ((Constraint)v8).startToEnd = arg10;
                    ((Constraint)v8).startToStart = v6;
                    return;
                }

                v9 = new StringBuilder();
                v9.append("right to ");
                v9.append(this.sideToString(arg11));
                v9.append(" undefined");
                throw new IllegalArgumentException(v9.toString());
            }
            case 7: {
                if(arg11 == v1) {
                    ((Constraint)v8).endToEnd = arg10;
                    ((Constraint)v8).endToStart = v6;
                    return;
                }

                if(arg11 == v2) {
                    ((Constraint)v8).endToStart = arg10;
                    ((Constraint)v8).endToEnd = v6;
                    return;
                }

                v9 = new StringBuilder();
                v9.append("right to ");
                v9.append(this.sideToString(arg11));
                v9.append(" undefined");
                throw new IllegalArgumentException(v9.toString());
            }
            default: {
                StringBuilder v10 = new StringBuilder();
                v10.append(this.sideToString(arg9));
                v10.append(" to ");
                v10.append(this.sideToString(arg11));
                v10.append(" unknown");
                throw new IllegalArgumentException(v10.toString());
            }
        }

        return;
    label_105:
        v9 = new StringBuilder();
        v9.append("right to ");
        v9.append(this.sideToString(arg11));
        v9.append(" undefined");
        throw new IllegalArgumentException(v9.toString());
    }

    public void constrainCircle(int arg1, int arg2, int arg3, float arg4) {
        Constraint v1 = this.get(arg1);
        v1.circleConstraint = arg2;
        v1.circleRadius = arg3;
        v1.circleAngle = arg4;
    }

    public void constrainDefaultHeight(int arg1, int arg2) {
        this.get(arg1).heightDefault = arg2;
    }

    public void constrainDefaultWidth(int arg1, int arg2) {
        this.get(arg1).widthDefault = arg2;
    }

    public void constrainHeight(int arg1, int arg2) {
        this.get(arg1).mHeight = arg2;
    }

    public void constrainMaxHeight(int arg1, int arg2) {
        this.get(arg1).heightMax = arg2;
    }

    public void constrainMaxWidth(int arg1, int arg2) {
        this.get(arg1).widthMax = arg2;
    }

    public void constrainMinHeight(int arg1, int arg2) {
        this.get(arg1).heightMin = arg2;
    }

    public void constrainMinWidth(int arg1, int arg2) {
        this.get(arg1).widthMin = arg2;
    }

    public void constrainPercentHeight(int arg1, float arg2) {
        this.get(arg1).heightPercent = arg2;
    }

    public void constrainPercentWidth(int arg1, float arg2) {
        this.get(arg1).widthPercent = arg2;
    }

    public void constrainWidth(int arg1, int arg2) {
        this.get(arg1).mWidth = arg2;
    }

    public void create(int arg2, int arg3) {
        Constraint v2 = this.get(arg2);
        v2.mIsGuideline = true;
        v2.orientation = arg3;
    }

    public void createBarrier(int arg2, int arg3, int[] arg4) {
        Constraint v2 = this.get(arg2);
        v2.mHelperType = 1;
        v2.mBarrierDirection = arg3;
        v2.mIsGuideline = false;
        v2.mReferenceIds = arg4;
    }

    private void createHorizontalChain(int arg13, int arg14, int arg15, int arg16, int[] arg17, float[] arg18, int arg19, int arg20, int arg21) {
        int[] v7 = arg17;
        float[] v8 = arg18;
        if(v7.length >= 2) {
            if(v8 != null) {
                if(v8.length == v7.length) {
                }
                else {
                    throw new IllegalArgumentException("must have 2 or more widgets in a chain");
                }
            }

            if(v8 != null) {
                this.get(v7[0]).horizontalWeight = v8[0];
            }

            this.get(v7[0]).horizontalChainStyle = arg19;
            this.connect(v7[0], arg20, arg13, arg14, -1);
            int v10;
            for(v10 = 1; v10 < v7.length; ++v10) {
                int v11 = v10 - 1;
                this.connect(v7[v10], arg20, v7[v11], arg21, -1);
                this.connect(v7[v11], arg21, v7[v10], arg20, -1);
                if(v8 != null) {
                    this.get(v7[v10]).horizontalWeight = v8[v10];
                }
            }

            this.connect(v7[v7.length - 1], arg21, arg15, arg16, -1);
            return;
        }

        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    public void createHorizontalChain(int arg11, int arg12, int arg13, int arg14, int[] arg15, float[] arg16, int arg17) {
        this.createHorizontalChain(arg11, arg12, arg13, arg14, arg15, arg16, arg17, 1, 2);
    }

    public void createHorizontalChainRtl(int arg11, int arg12, int arg13, int arg14, int[] arg15, float[] arg16, int arg17) {
        this.createHorizontalChain(arg11, arg12, arg13, arg14, arg15, arg16, arg17, 6, 7);
    }

    public void createVerticalChain(int arg13, int arg14, int arg15, int arg16, int[] arg17, float[] arg18, int arg19) {
        int[] v7 = arg17;
        float[] v8 = arg18;
        if(v7.length >= 2) {
            if(v8 != null) {
                if(v8.length == v7.length) {
                }
                else {
                    throw new IllegalArgumentException("must have 2 or more widgets in a chain");
                }
            }

            if(v8 != null) {
                this.get(v7[0]).verticalWeight = v8[0];
            }

            this.get(v7[0]).verticalChainStyle = arg19;
            this.connect(v7[0], 3, arg13, arg14, 0);
            int v10;
            for(v10 = 1; v10 < v7.length; ++v10) {
                int v11 = v10 - 1;
                this.connect(v7[v10], 3, v7[v11], 4, 0);
                this.connect(v7[v11], 4, v7[v10], 3, 0);
                if(v8 != null) {
                    this.get(v7[v10]).verticalWeight = v8[v10];
                }
            }

            this.connect(v7[v7.length - 1], 4, arg15, arg16, 0);
            return;
        }

        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    private Constraint fillFromAttributeList(Context arg3, AttributeSet arg4) {
        Constraint v0 = new Constraint(null);
        TypedArray v3 = arg3.obtainStyledAttributes(arg4, R$styleable.ConstraintSet);
        this.populateConstraint(v0, v3);
        v3.recycle();
        return v0;
    }

    private Constraint get(int arg5) {
        if(!this.mConstraints.containsKey(Integer.valueOf(arg5))) {
            this.mConstraints.put(Integer.valueOf(arg5), new Constraint(null));
        }

        return this.mConstraints.get(Integer.valueOf(arg5));
    }

    public boolean getApplyElevation(int arg1) {
        return this.get(arg1).applyElevation;
    }

    public void load(Context arg5, int arg6) {
        XmlResourceParser v6 = arg5.getResources().getXml(arg6);
        try {
            int v0;
            for(v0 = ((XmlPullParser)v6).getEventType(); v0 != 1; v0 = ((XmlPullParser)v6).next()) {
                if(v0 != 0) {
                    switch(v0) {
                        case 2: {
                            goto label_8;
                        }
                        case 3: {
                            goto label_21;
                        }
                    }

                    goto label_21;
                label_8:
                    String v0_1 = ((XmlPullParser)v6).getName();
                    Constraint v2 = this.fillFromAttributeList(arg5, Xml.asAttributeSet(((XmlPullParser)v6)));
                    if(v0_1.equalsIgnoreCase("Guideline")) {
                        v2.mIsGuideline = true;
                    }

                    this.mConstraints.put(Integer.valueOf(v2.mViewId), v2);
                }
                else {
                    ((XmlPullParser)v6).getName();
                }

            label_21:
            }
        }
        catch(IOException v5) {
            v5.printStackTrace();
        }
        catch(XmlPullParserException v5_1) {
            v5_1.printStackTrace();
        }
    }

    private static int lookupID(TypedArray arg1, int arg2, int arg3) {
        arg3 = arg1.getResourceId(arg2, arg3);
        int v0 = -1;
        if(arg3 == v0) {
            arg3 = arg1.getInt(arg2, v0);
        }

        return arg3;
    }

    private void populateConstraint(Constraint arg7, TypedArray arg8) {
        int v0 = arg8.getIndexCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            int v2 = arg8.getIndex(v1);
            int v3 = ConstraintSet.mapToConstant.get(v2);
            switch(v3) {
                case 1: {
                    goto label_267;
                }
                case 2: {
                    goto label_263;
                }
                case 3: {
                    goto label_259;
                }
                case 4: {
                    goto label_255;
                }
                case 5: {
                    goto label_252;
                }
                case 6: {
                    goto label_248;
                }
                case 7: {
                    goto label_244;
                }
                case 8: {
                    goto label_240;
                }
                case 9: {
                    goto label_236;
                }
                case 10: {
                    goto label_232;
                }
                case 11: {
                    goto label_228;
                }
                case 12: {
                    goto label_224;
                }
                case 13: {
                    goto label_220;
                }
                case 14: {
                    goto label_216;
                }
                case 15: {
                    goto label_212;
                }
                case 16: {
                    goto label_208;
                }
                case 17: {
                    goto label_204;
                }
                case 18: {
                    goto label_200;
                }
                case 19: {
                    goto label_196;
                }
                case 20: {
                    goto label_192;
                }
                case 21: {
                    goto label_188;
                }
                case 22: {
                    goto label_180;
                }
                case 23: {
                    goto label_176;
                }
                case 24: {
                    goto label_172;
                }
                case 25: {
                    goto label_168;
                }
                case 26: {
                    goto label_164;
                }
                case 27: {
                    goto label_160;
                }
                case 28: {
                    goto label_156;
                }
                case 29: {
                    goto label_152;
                }
                case 30: {
                    goto label_148;
                }
                case 31: {
                    goto label_144;
                }
                case 32: {
                    goto label_140;
                }
                case 33: {
                    goto label_136;
                }
                case 34: {
                    goto label_132;
                }
                case 35: {
                    goto label_128;
                }
                case 36: {
                    goto label_124;
                }
                case 37: {
                    goto label_120;
                }
                case 38: {
                    goto label_116;
                }
                case 39: {
                    goto label_112;
                }
                case 40: {
                    goto label_108;
                }
                case 41: {
                    goto label_104;
                }
                case 42: {
                    goto label_100;
                }
                case 43: {
                    goto label_96;
                }
                case 44: {
                    goto label_90;
                }
                case 45: {
                    goto label_86;
                }
                case 46: {
                    goto label_82;
                }
                case 47: {
                    goto label_78;
                }
                case 48: {
                    goto label_74;
                }
                case 49: {
                    goto label_70;
                }
                case 50: {
                    goto label_66;
                }
                case 51: {
                    goto label_62;
                }
                case 52: {
                    goto label_58;
                }
                case 53: {
                    goto label_54;
                }
                default: {
                    switch(v3) {
                        case 60: {
                            arg7.rotation = arg8.getFloat(v2, arg7.rotation);
                            goto label_270;
                        }
                        case 61: {
                            arg7.circleConstraint = ConstraintSet.lookupID(arg8, v2, arg7.circleConstraint);
                            goto label_270;
                        label_228:
                            arg7.goneBottomMargin = arg8.getDimensionPixelSize(v2, arg7.goneBottomMargin);
                            goto label_270;
                        label_100:
                            arg7.verticalChainStyle = arg8.getInt(v2, arg7.verticalChainStyle);
                            goto label_270;
                        label_232:
                            arg7.endToStart = ConstraintSet.lookupID(arg8, v2, arg7.endToStart);
                            goto label_270;
                        label_104:
                            arg7.horizontalChainStyle = arg8.getInt(v2, arg7.horizontalChainStyle);
                            goto label_270;
                        label_236:
                            arg7.endToEnd = ConstraintSet.lookupID(arg8, v2, arg7.endToEnd);
                            goto label_270;
                        label_108:
                            arg7.verticalWeight = arg8.getFloat(v2, arg7.verticalWeight);
                            goto label_270;
                        label_240:
                            arg7.endMargin = arg8.getDimensionPixelSize(v2, arg7.endMargin);
                            goto label_270;
                        label_112:
                            arg7.horizontalWeight = arg8.getFloat(v2, arg7.horizontalWeight);
                            goto label_270;
                        label_244:
                            arg7.editorAbsoluteY = arg8.getDimensionPixelOffset(v2, arg7.editorAbsoluteY);
                            goto label_270;
                        label_116:
                            arg7.mViewId = arg8.getResourceId(v2, arg7.mViewId);
                            goto label_270;
                        label_248:
                            arg7.editorAbsoluteX = arg8.getDimensionPixelOffset(v2, arg7.editorAbsoluteX);
                            goto label_270;
                        label_120:
                            arg7.verticalBias = arg8.getFloat(v2, arg7.verticalBias);
                            goto label_270;
                        label_252:
                            arg7.dimensionRatio = arg8.getString(v2);
                            goto label_270;
                        label_124:
                            arg7.topToTop = ConstraintSet.lookupID(arg8, v2, arg7.topToTop);
                            goto label_270;
                        label_255:
                            arg7.bottomToTop = ConstraintSet.lookupID(arg8, v2, arg7.bottomToTop);
                            goto label_270;
                        label_128:
                            arg7.topToBottom = ConstraintSet.lookupID(arg8, v2, arg7.topToBottom);
                            goto label_270;
                        label_259:
                            arg7.bottomToBottom = ConstraintSet.lookupID(arg8, v2, arg7.bottomToBottom);
                            goto label_270;
                        label_132:
                            arg7.topMargin = arg8.getDimensionPixelSize(v2, arg7.topMargin);
                            goto label_270;
                        label_263:
                            arg7.bottomMargin = arg8.getDimensionPixelSize(v2, arg7.bottomMargin);
                            goto label_270;
                        label_136:
                            arg7.startToStart = ConstraintSet.lookupID(arg8, v2, arg7.startToStart);
                            goto label_270;
                        label_267:
                            arg7.baselineToBaseline = ConstraintSet.lookupID(arg8, v2, arg7.baselineToBaseline);
                            goto label_270;
                        label_140:
                            arg7.startToEnd = ConstraintSet.lookupID(arg8, v2, arg7.startToEnd);
                            goto label_270;
                        label_144:
                            arg7.startMargin = arg8.getDimensionPixelSize(v2, arg7.startMargin);
                            goto label_270;
                        label_148:
                            arg7.rightToRight = ConstraintSet.lookupID(arg8, v2, arg7.rightToRight);
                            goto label_270;
                        label_152:
                            arg7.rightToLeft = ConstraintSet.lookupID(arg8, v2, arg7.rightToLeft);
                            goto label_270;
                        label_156:
                            arg7.rightMargin = arg8.getDimensionPixelSize(v2, arg7.rightMargin);
                            goto label_270;
                        label_160:
                            arg7.orientation = arg8.getInt(v2, arg7.orientation);
                            goto label_270;
                        label_164:
                            arg7.leftToRight = ConstraintSet.lookupID(arg8, v2, arg7.leftToRight);
                            goto label_270;
                        label_168:
                            arg7.leftToLeft = ConstraintSet.lookupID(arg8, v2, arg7.leftToLeft);
                            goto label_270;
                        label_172:
                            arg7.leftMargin = arg8.getDimensionPixelSize(v2, arg7.leftMargin);
                            goto label_270;
                        label_176:
                            arg7.mWidth = arg8.getLayoutDimension(v2, arg7.mWidth);
                            goto label_270;
                        label_180:
                            arg7.visibility = arg8.getInt(v2, arg7.visibility);
                            arg7.visibility = ConstraintSet.VISIBILITY_FLAGS[arg7.visibility];
                            goto label_270;
                        label_54:
                            arg7.translationZ = arg8.getDimension(v2, arg7.translationZ);
                            goto label_270;
                        label_58:
                            arg7.translationY = arg8.getDimension(v2, arg7.translationY);
                            goto label_270;
                        label_188:
                            arg7.mHeight = arg8.getLayoutDimension(v2, arg7.mHeight);
                            goto label_270;
                        label_62:
                            arg7.translationX = arg8.getDimension(v2, arg7.translationX);
                            goto label_270;
                        label_192:
                            arg7.horizontalBias = arg8.getFloat(v2, arg7.horizontalBias);
                            goto label_270;
                        label_66:
                            arg7.transformPivotY = arg8.getFloat(v2, arg7.transformPivotY);
                            goto label_270;
                        label_196:
                            arg7.guidePercent = arg8.getFloat(v2, arg7.guidePercent);
                            goto label_270;
                        label_70:
                            arg7.transformPivotX = arg8.getFloat(v2, arg7.transformPivotX);
                            goto label_270;
                        label_200:
                            arg7.guideEnd = arg8.getDimensionPixelOffset(v2, arg7.guideEnd);
                            goto label_270;
                        label_74:
                            arg7.scaleY = arg8.getFloat(v2, arg7.scaleY);
                            goto label_270;
                        label_204:
                            arg7.guideBegin = arg8.getDimensionPixelOffset(v2, arg7.guideBegin);
                            goto label_270;
                        label_78:
                            arg7.scaleX = arg8.getFloat(v2, arg7.scaleX);
                            goto label_270;
                        label_208:
                            arg7.goneTopMargin = arg8.getDimensionPixelSize(v2, arg7.goneTopMargin);
                            goto label_270;
                        label_82:
                            arg7.rotationY = arg8.getFloat(v2, arg7.rotationY);
                            goto label_270;
                        label_212:
                            arg7.goneStartMargin = arg8.getDimensionPixelSize(v2, arg7.goneStartMargin);
                            goto label_270;
                        label_86:
                            arg7.rotationX = arg8.getFloat(v2, arg7.rotationX);
                            goto label_270;
                        label_216:
                            arg7.goneRightMargin = arg8.getDimensionPixelSize(v2, arg7.goneRightMargin);
                            goto label_270;
                        label_90:
                            arg7.applyElevation = true;
                            arg7.elevation = arg8.getDimension(v2, arg7.elevation);
                            goto label_270;
                        label_220:
                            arg7.goneLeftMargin = arg8.getDimensionPixelSize(v2, arg7.goneLeftMargin);
                            goto label_270;
                        label_224:
                            arg7.goneEndMargin = arg8.getDimensionPixelSize(v2, arg7.goneEndMargin);
                            goto label_270;
                        label_96:
                            arg7.alpha = arg8.getFloat(v2, arg7.alpha);
                            goto label_270;
                        }
                        case 62: {
                            arg7.circleRadius = arg8.getDimensionPixelSize(v2, arg7.circleRadius);
                            goto label_270;
                        }
                        case 63: {
                            arg7.circleAngle = arg8.getFloat(v2, arg7.circleAngle);
                            goto label_270;
                        }
                        case 64: {
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(v2) + "   " + ConstraintSet.mapToConstant.get(v2));
                            goto label_270;
                        }
                        default: {
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(v2) + "   " + ConstraintSet.mapToConstant.get(v2));
                            goto label_270;
                        }
                    }
                }
            }

        label_270:
        }
    }

    public void removeFromHorizontalChain(int arg9) {
        if(this.mConstraints.containsKey(Integer.valueOf(arg9))) {
            Object v0 = this.mConstraints.get(Integer.valueOf(arg9));
            int v6 = ((Constraint)v0).leftToRight;
            int v7 = ((Constraint)v0).rightToLeft;
            int v1 = -1;
            if(v6 == v1) {
                if(v7 != v1) {
                }
                else {
                    int v2 = ((Constraint)v0).startToEnd;
                    v7 = ((Constraint)v0).endToStart;
                    if(v2 != v1 || v7 != v1) {
                        if(v2 != v1 && v7 != v1) {
                            this.connect(v2, 7, v7, 6, 0);
                            this.connect(v7, 6, v6, 7, 0);
                            goto label_54;
                        }

                        if(v6 == v1 && v7 == v1) {
                            goto label_54;
                        }

                        if(((Constraint)v0).rightToRight != v1) {
                            this.connect(v6, 7, ((Constraint)v0).rightToRight, 7, 0);
                            goto label_54;
                        }

                        if(((Constraint)v0).leftToLeft == v1) {
                            goto label_54;
                        }

                        this.connect(v7, 6, ((Constraint)v0).leftToLeft, 6, 0);
                    }

                label_54:
                    this.clear(arg9, 6);
                    this.clear(arg9, 7);
                    return;
                }
            }

            if(v6 == v1 || v7 == v1) {
                if(v6 == v1 && v7 == v1) {
                    goto label_95;
                }

                if(((Constraint)v0).rightToRight != v1) {
                    this.connect(v6, 2, ((Constraint)v0).rightToRight, 2, 0);
                    goto label_95;
                }

                if(((Constraint)v0).leftToLeft == v1) {
                    goto label_95;
                }

                this.connect(v7, 1, ((Constraint)v0).leftToLeft, 1, 0);
            }
            else {
                this.connect(v6, 2, v7, 1, 0);
                this.connect(v7, 1, v6, 2, 0);
            }

        label_95:
            this.clear(arg9, 1);
            this.clear(arg9, 2);
        }
    }

    public void removeFromVerticalChain(int arg10) {
        if(this.mConstraints.containsKey(Integer.valueOf(arg10))) {
            Object v0 = this.mConstraints.get(Integer.valueOf(arg10));
            int v7 = ((Constraint)v0).topToBottom;
            int v8 = ((Constraint)v0).bottomToTop;
            int v1 = -1;
            if(v7 == v1 && v8 == v1) {
                goto label_48;
            }

            if(v7 != v1 && v8 != v1) {
                this.connect(v7, 4, v8, 3, 0);
                this.connect(v8, 3, v7, 4, 0);
                goto label_48;
            }

            if(v7 == v1 && v8 == v1) {
                goto label_48;
            }

            if(((Constraint)v0).bottomToBottom != v1) {
                this.connect(v7, 4, ((Constraint)v0).bottomToBottom, 4, 0);
                goto label_48;
            }

            if(((Constraint)v0).topToTop == v1) {
                goto label_48;
            }

            this.connect(v8, 3, ((Constraint)v0).topToTop, 3, 0);
        }

    label_48:
        this.clear(arg10, 3);
        this.clear(arg10, 4);
    }

    public void setAlpha(int arg1, float arg2) {
        this.get(arg1).alpha = arg2;
    }

    public void setApplyElevation(int arg1, boolean arg2) {
        this.get(arg1).applyElevation = arg2;
    }

    public void setBarrierType(int arg1, int arg2) {
    }

    public void setDimensionRatio(int arg1, String arg2) {
        this.get(arg1).dimensionRatio = arg2;
    }

    public void setElevation(int arg2, float arg3) {
        this.get(arg2).elevation = arg3;
        this.get(arg2).applyElevation = true;
    }

    public void setGoneMargin(int arg1, int arg2, int arg3) {
        Constraint v1 = this.get(arg1);
        switch(arg2) {
            case 1: {
                goto label_20;
            }
            case 2: {
                goto label_18;
            }
            case 3: {
                goto label_16;
            }
            case 4: {
                goto label_14;
            }
            case 5: {
                goto label_10;
            }
            case 6: {
                goto label_8;
            }
            case 7: {
                goto label_6;
            }
        }

        throw new IllegalArgumentException("unknown constraint");
    label_18:
        v1.goneRightMargin = arg3;
        return;
    label_20:
        v1.goneLeftMargin = arg3;
        return;
    label_6:
        v1.goneEndMargin = arg3;
        return;
    label_8:
        v1.goneStartMargin = arg3;
        return;
    label_10:
        throw new IllegalArgumentException("baseline does not support margins");
    label_14:
        v1.goneBottomMargin = arg3;
        return;
    label_16:
        v1.goneTopMargin = arg3;
    }

    public void setGuidelineBegin(int arg2, int arg3) {
        this.get(arg2).guideBegin = arg3;
        this.get(arg2).guideEnd = -1;
        this.get(arg2).guidePercent = -1f;
    }

    public void setGuidelineEnd(int arg2, int arg3) {
        this.get(arg2).guideEnd = arg3;
        this.get(arg2).guideBegin = -1;
        this.get(arg2).guidePercent = -1f;
    }

    public void setGuidelinePercent(int arg2, float arg3) {
        this.get(arg2).guidePercent = arg3;
        this.get(arg2).guideEnd = -1;
        this.get(arg2).guideBegin = -1;
    }

    public void setHorizontalBias(int arg1, float arg2) {
        this.get(arg1).horizontalBias = arg2;
    }

    public void setHorizontalChainStyle(int arg1, int arg2) {
        this.get(arg1).horizontalChainStyle = arg2;
    }

    public void setHorizontalWeight(int arg1, float arg2) {
        this.get(arg1).horizontalWeight = arg2;
    }

    public void setMargin(int arg1, int arg2, int arg3) {
        Constraint v1 = this.get(arg1);
        switch(arg2) {
            case 1: {
                goto label_20;
            }
            case 2: {
                goto label_18;
            }
            case 3: {
                goto label_16;
            }
            case 4: {
                goto label_14;
            }
            case 5: {
                goto label_10;
            }
            case 6: {
                goto label_8;
            }
            case 7: {
                goto label_6;
            }
        }

        throw new IllegalArgumentException("unknown constraint");
    label_18:
        v1.rightMargin = arg3;
        return;
    label_20:
        v1.leftMargin = arg3;
        return;
    label_6:
        v1.endMargin = arg3;
        return;
    label_8:
        v1.startMargin = arg3;
        return;
    label_10:
        throw new IllegalArgumentException("baseline does not support margins");
    label_14:
        v1.bottomMargin = arg3;
        return;
    label_16:
        v1.topMargin = arg3;
    }

    public void setRotation(int arg1, float arg2) {
        this.get(arg1).rotation = arg2;
    }

    public void setRotationX(int arg1, float arg2) {
        this.get(arg1).rotationX = arg2;
    }

    public void setRotationY(int arg1, float arg2) {
        this.get(arg1).rotationY = arg2;
    }

    public void setScaleX(int arg1, float arg2) {
        this.get(arg1).scaleX = arg2;
    }

    public void setScaleY(int arg1, float arg2) {
        this.get(arg1).scaleY = arg2;
    }

    public void setTransformPivot(int arg1, float arg2, float arg3) {
        Constraint v1 = this.get(arg1);
        v1.transformPivotY = arg3;
        v1.transformPivotX = arg2;
    }

    public void setTransformPivotX(int arg1, float arg2) {
        this.get(arg1).transformPivotX = arg2;
    }

    public void setTransformPivotY(int arg1, float arg2) {
        this.get(arg1).transformPivotY = arg2;
    }

    public void setTranslation(int arg1, float arg2, float arg3) {
        Constraint v1 = this.get(arg1);
        v1.translationX = arg2;
        v1.translationY = arg3;
    }

    public void setTranslationX(int arg1, float arg2) {
        this.get(arg1).translationX = arg2;
    }

    public void setTranslationY(int arg1, float arg2) {
        this.get(arg1).translationY = arg2;
    }

    public void setTranslationZ(int arg1, float arg2) {
        this.get(arg1).translationZ = arg2;
    }

    public void setVerticalBias(int arg1, float arg2) {
        this.get(arg1).verticalBias = arg2;
    }

    public void setVerticalChainStyle(int arg1, int arg2) {
        this.get(arg1).verticalChainStyle = arg2;
    }

    public void setVerticalWeight(int arg1, float arg2) {
        this.get(arg1).verticalWeight = arg2;
    }

    public void setVisibility(int arg1, int arg2) {
        this.get(arg1).visibility = arg2;
    }

    private String sideToString(int arg1) {
        switch(arg1) {
            case 1: {
                return "left";
            }
            case 2: {
                return "right";
            }
            case 3: {
                return "top";
            }
            case 4: {
                return "bottom";
            }
            case 5: {
                return "baseline";
            }
            case 6: {
                return "start";
            }
            case 7: {
                return "end";
            }
        }

        return "undefined";
    }
}

